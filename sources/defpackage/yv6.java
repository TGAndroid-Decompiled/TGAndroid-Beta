package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class yv6 implements kw6 {
    public final lw6 a;
    public final kq6 b;
    public final int c;

    public yv6(lw6 lw6Var, kq6 kq6Var, int i) {
        this.a = lw6Var;
        this.b = kq6Var;
        this.c = i;
    }

    @Override
    public final void a(su6 su6Var) {
        byte[] bArr;
        kq6 kq6Var = this.b;
        if (TextUtils.isEmpty(kq6Var.a)) {
            lad.f("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i = j06.a;
        String str = kq6Var.a;
        qq6 qq6Var = new qq6();
        tq6 tq6Var = new tq6();
        List list = Collections.EMPTY_LIST;
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        vq6 vq6Var = new vq6();
        yq6 yq6Var = yq6.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        xl3 xl3Var = new xl3((byte) 16, false);
        xl3Var.b = kq6Var.r;
        yq6 yq6Var2 = new yq6(xl3Var);
        CharSequence charSequence = kq6Var.b;
        hr6 hr6Var = new hr6();
        hr6Var.f = kq6Var.c;
        hr6Var.g = kq6Var.d;
        hr6Var.n = kq6Var.h;
        Bundle bundle = null;
        hr6Var.i = j06.c(null);
        Bitmap bitmap = kq6Var.e;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (kq6Var.f == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    kq6Var.f = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    lad.g("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = kq6Var.f;
        }
        int i2 = 3;
        if (bArr != null) {
            hr6Var.b(bArr, 3);
        }
        Bundle bundle2 = kq6Var.n;
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
                hr6Var.q = Integer.valueOf(i2);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i2 = 0;
            hr6Var.q = Integer.valueOf(i2);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        hr6Var.r = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            hr6Var.I = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            hr6Var.K = mm5.q(mm5.q(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            hr6Var.a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            hr6Var.e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            hr6Var.a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            hr6Var.J = bundle;
        }
        hr6Var.s = Boolean.TRUE;
        jr6 jr6Var = new jr6(hr6Var);
        if (tq6Var.b != null && tq6Var.a == null) {
            z = false;
        }
        gre.p(z);
        br6 br6Var = new br6(str2, new rq6(qq6Var), null, new wq6(vq6Var), jr6Var, yq6Var2);
        lw6 lw6Var = this.a;
        t56 k = lw6Var.j.k(su6Var, mm5.u(br6Var));
        k.b(new tq4(k, new kp(lw6Var, su6Var, this.c), (byte) 0), new ge2(lw6Var, (byte) 4));
    }
}
