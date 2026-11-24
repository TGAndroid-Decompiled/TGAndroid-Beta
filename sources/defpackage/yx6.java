package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class yx6 implements ky6 {
    public final ly6 a;
    public final ks6 b;
    public final int c;

    public yx6(ly6 ly6Var, ks6 ks6Var, int i) {
        this.a = ly6Var;
        this.b = ks6Var;
        this.c = i;
    }

    @Override
    public final void a(sw6 sw6Var) {
        byte[] bArr;
        ks6 ks6Var = this.b;
        if (TextUtils.isEmpty(ks6Var.a)) {
            ncd.f("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i = j26.a;
        String str = ks6Var.a;
        qs6 qs6Var = new qs6();
        ts6 ts6Var = new ts6();
        List list = Collections.EMPTY_LIST;
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        vs6 vs6Var = new vs6();
        ys6 ys6Var = ys6.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        in3 in3Var = new in3((byte) 16, false);
        in3Var.b = ks6Var.r;
        ys6 ys6Var2 = new ys6(in3Var);
        CharSequence charSequence = ks6Var.b;
        ht6 ht6Var = new ht6();
        ht6Var.f = ks6Var.c;
        ht6Var.g = ks6Var.d;
        ht6Var.n = ks6Var.h;
        Bundle bundle = null;
        ht6Var.i = j26.c(null);
        Bitmap bitmap = ks6Var.e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (ks6Var.f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    ks6Var.f = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    ncd.g("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = ks6Var.f;
        }
        int i2 = 3;
        if (bArr != null) {
            ht6Var.b(bArr, 3);
        }
        Bundle bundle2 = ks6Var.n;
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
                ht6Var.q = Integer.valueOf(i2);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i2 = 0;
            ht6Var.q = Integer.valueOf(i2);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        ht6Var.r = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            ht6Var.I = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            ht6Var.K = mo5.q(mo5.q(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            ht6Var.a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            ht6Var.e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            ht6Var.a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            ht6Var.J = bundle;
        }
        ht6Var.s = Boolean.TRUE;
        jt6 jt6Var = new jt6(ht6Var);
        if (ts6Var.b != null && ts6Var.a == null) {
            z = false;
        }
        jte.p(z);
        bt6 bt6Var = new bt6(str2, new rs6(qs6Var), null, new ws6(vs6Var), jt6Var, ys6Var2);
        ly6 ly6Var = this.a;
        t76 k = ly6Var.j.k(sw6Var, mo5.u(bt6Var));
        k.b(new us4(k, new kq(ly6Var, sw6Var, this.c), (byte) 0), new rf2(ly6Var, (byte) 4));
    }
}
