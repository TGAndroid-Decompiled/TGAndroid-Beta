package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class dy6 implements py6 {
    public final qy6 a;
    public final os6 b;
    public final int c;

    public dy6(qy6 qy6Var, os6 os6Var, int i) {
        this.a = qy6Var;
        this.b = os6Var;
        this.c = i;
    }

    @Override
    public final void a(xw6 xw6Var) {
        byte[] bArr;
        os6 os6Var = this.b;
        if (TextUtils.isEmpty(os6Var.a)) {
            efd.f("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i = n26.a;
        String str = os6Var.a;
        us6 us6Var = new us6();
        xs6 xs6Var = new xs6();
        List list = Collections.EMPTY_LIST;
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        zs6 zs6Var = new zs6();
        ct6 ct6Var = ct6.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        pm3 pm3Var = new pm3((byte) 16, false);
        pm3Var.b = os6Var.r;
        ct6 ct6Var2 = new ct6(pm3Var);
        CharSequence charSequence = os6Var.b;
        lt6 lt6Var = new lt6();
        lt6Var.f = os6Var.c;
        lt6Var.g = os6Var.d;
        lt6Var.n = os6Var.h;
        Bundle bundle = null;
        lt6Var.i = n26.c(null);
        Bitmap bitmap = os6Var.e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (os6Var.f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    os6Var.f = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    efd.g("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = os6Var.f;
        }
        int i2 = 3;
        if (bArr != null) {
            lt6Var.b(bArr, 3);
        }
        Bundle bundle2 = os6Var.n;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        }
        boolean z = true;
        if (bundle != null && bundle.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j = bundle.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j != 0) {
                if (j == 1) {
                    i2 = 1;
                } else if (j == 2) {
                    i2 = 2;
                } else if (j != 3) {
                    if (j == 4) {
                        i2 = 4;
                    } else if (j == 5) {
                        i2 = 5;
                    } else if (j == 6) {
                        i2 = 6;
                    }
                }
                lt6Var.q = Integer.valueOf(i2);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i2 = 0;
            lt6Var.q = Integer.valueOf(i2);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        lt6Var.r = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            lt6Var.I = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            lt6Var.K = po5.q(po5.q(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            lt6Var.a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            lt6Var.e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            lt6Var.a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            lt6Var.J = bundle;
        }
        lt6Var.s = Boolean.TRUE;
        nt6 nt6Var = new nt6(lt6Var);
        if (xs6Var.b != null && xs6Var.a == null) {
            z = false;
        }
        yve.p(z);
        ft6 ft6Var = new ft6(str2, new vs6(us6Var), null, new at6(zs6Var), nt6Var, ct6Var2);
        qy6 qy6Var = this.a;
        x76 k = qy6Var.j.k(xw6Var, po5.u(ft6Var));
        k.b(new xs4(k, new lp(qy6Var, xw6Var, this.c), (byte) 0), new pe2(qy6Var, (byte) 4));
    }
}
