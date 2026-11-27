package defpackage;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class j72 implements icc {
    public final byte a = 0;
    public final boolean[] b;
    public final c51 c;
    public final boolean d;
    public final vnb e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final KeyEvent.Callback j;

    public j72(String str, String[] strArr, ImageView imageView, vnb vnbVar, boolean z, int[] iArr, c51 c51Var, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f = str;
        this.g = strArr;
        this.h = imageView;
        this.e = vnbVar;
        this.d = z;
        this.i = iArr;
        this.c = c51Var;
        this.j = horizontalScrollView;
        this.b = zArr;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        CharSequence V;
        byte b = this.a;
        vnb vnbVar = this.e;
        KeyEvent.Callback callback = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        boolean z = this.d;
        c51 c51Var = this.c;
        Object obj5 = this.g;
        Object obj6 = this.f;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        yob.s(imageView, aob.q7, vnbVar, PorterDuff.Mode.SRC_IN);
                        if (!z) {
                            int i2 = -iArr[0];
                            iArr[0] = i2;
                            hl.A3(i2, imageView, null);
                        }
                    } else {
                        yob.s(imageView, aob.G6, vnbVar, PorterDuff.Mode.SRC_IN);
                    }
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    c51Var.setEnabled(!bool.booleanValue());
                    if (bitmap != null) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    horizontalScrollView.setVisibility(i);
                    zArr[0] = bool.booleanValue();
                    return;
                }
                return;
            default:
                w45 w45Var = (w45) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                c cVar = (c) obj4;
                TextView textView = (TextView) obj3;
                sk7 sk7Var = (sk7) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !w45Var.m && !w45Var.n) {
                    boolean z2 = w45Var.p;
                    zArr2[0] = z2;
                    c51Var.setEnabled(z2);
                    if (zArr2[0]) {
                        if (!z) {
                            SpannableStringBuilder r = c.r(wallettransaction.fee, true);
                            CharSequence q = cVar.q(wallettransaction.fee, true);
                            if (TextUtils.isEmpty(q)) {
                                V = ob6.V(null, null, 2131742770, r);
                            } else {
                                V = ob6.V(null, null, 2131742769, r, q);
                            }
                            textView.setText(V);
                            return;
                        }
                        return;
                    }
                    if (str == null) {
                        str = ob6.M0(2131742617, null);
                        a55.m("preview", str);
                    }
                    d31.d0(str, sk7Var.F, vnbVar);
                    return;
                }
                return;
        }
    }

    public j72(boolean[] zArr, w45 w45Var, boolean[] zArr2, c51 c51Var, boolean z, c cVar, TextView textView, sk7 sk7Var, vnb vnbVar) {
        this.b = zArr;
        this.f = w45Var;
        this.g = zArr2;
        this.c = c51Var;
        this.d = z;
        this.h = cVar;
        this.i = textView;
        this.j = sk7Var;
        this.e = vnbVar;
    }
}
