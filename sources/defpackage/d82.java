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
public final class d82 implements jac {
    public final byte a = 0;
    public final boolean[] b;
    public final b61 c;
    public final boolean d;
    public final ylb e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final KeyEvent.Callback j;

    public d82(String str, String[] strArr, ImageView imageView, ylb ylbVar, boolean z, int[] iArr, b61 b61Var, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f = str;
        this.g = strArr;
        this.h = imageView;
        this.e = ylbVar;
        this.d = z;
        this.i = iArr;
        this.c = b61Var;
        this.j = horizontalScrollView;
        this.b = zArr;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i;
        CharSequence V;
        byte b = this.a;
        ylb ylbVar = this.e;
        KeyEvent.Callback callback = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        boolean z = this.d;
        b61 b61Var = this.c;
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
                        anb.s(imageView, cmb.p7, ylbVar, PorterDuff.Mode.SRC_IN);
                        if (!z) {
                            int i2 = -iArr[0];
                            iArr[0] = i2;
                            gm.A3(i2, imageView, null);
                        }
                    } else {
                        anb.s(imageView, cmb.F6, ylbVar, PorterDuff.Mode.SRC_IN);
                    }
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    b61Var.setEnabled(!bool.booleanValue());
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
                s45 s45Var = (s45) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                c cVar = (c) obj4;
                TextView textView = (TextView) obj3;
                mk7 mk7Var = (mk7) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !s45Var.m && !s45Var.n) {
                    boolean z2 = s45Var.p;
                    zArr2[0] = z2;
                    b61Var.setEnabled(z2);
                    if (zArr2[0]) {
                        if (!z) {
                            SpannableStringBuilder r = c.r(wallettransaction.fee, true);
                            CharSequence q = cVar.q(wallettransaction.fee, true);
                            if (TextUtils.isEmpty(q)) {
                                V = jb6.V(null, null, 2131742802, r);
                            } else {
                                V = jb6.V(null, null, 2131742801, r, q);
                            }
                            textView.setText(V);
                            return;
                        }
                        return;
                    }
                    if (str == null) {
                        str = jb6.M0(2131742649, null);
                        w45.m("preview", str);
                    }
                    c41.d0(str, mk7Var.F, ylbVar);
                    return;
                }
                return;
        }
    }

    public d82(boolean[] zArr, s45 s45Var, boolean[] zArr2, b61 b61Var, boolean z, c cVar, TextView textView, mk7 mk7Var, ylb ylbVar) {
        this.b = zArr;
        this.f = s45Var;
        this.g = zArr2;
        this.c = b61Var;
        this.d = z;
        this.h = cVar;
        this.i = textView;
        this.j = mk7Var;
        this.e = ylbVar;
    }
}
