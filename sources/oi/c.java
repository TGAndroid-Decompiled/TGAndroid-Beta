package oi;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.lc;
public final class c implements q10 {
    public final int f21956a = 0;
    public final boolean[] f21957b;
    public final hi.d f21958c;
    public final boolean d;
    public final i6 f21959e;
    public final Object f21960f;
    public final Object f21961g;
    public final Object h;
    public final Object f21962i;
    public final KeyEvent.Callback f21963j;

    public c(String str, String[] strArr, ImageView imageView, i6 i6Var, boolean z10, int[] iArr, hi.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f21960f = str;
        this.f21961g = strArr;
        this.h = imageView;
        this.f21959e = i6Var;
        this.d = z10;
        this.f21962i = iArr;
        this.f21958c = dVar;
        this.f21963j = horizontalScrollView;
        this.f21957b = zArr;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String M0;
        CharSequence V;
        int i10 = this.f21956a;
        i6 i6Var = this.f21959e;
        KeyEvent.Callback callback = this.f21963j;
        Object obj3 = this.f21962i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        hi.d dVar = this.f21958c;
        Object obj5 = this.f21961g;
        Object obj6 = this.f21960f;
        boolean[] zArr = this.f21957b;
        switch (i10) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        u6.s(imageView, n6.f29637q7, i6Var, PorterDuff.Mode.SRC_IN);
                        if (!z10) {
                            int i11 = -iArr[0];
                            iArr[0] = i11;
                            org.telegram.messenger.g0.E3(i11, imageView, null);
                        }
                    } else {
                        u6.s(imageView, n6.G6, i6Var, PorterDuff.Mode.SRC_IN);
                    }
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    dVar.setEnabled(!bool.booleanValue());
                    if (bitmap != null) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    horizontalScrollView.setVisibility(i7);
                    zArr[0] = bool.booleanValue();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !h2Var.f44299m && !h2Var.f44300n) {
                    boolean z11 = h2Var.f44302p;
                    zArr2[0] = z11;
                    dVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder s5 = org.telegram.ui.Wallet.u0.s(wallettransaction.fee, true);
                        CharSequence r10 = u0Var.r(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(r10)) {
                            V = gd.V(null, null, 2131742881, s5);
                        } else {
                            V = gd.V(null, null, 2131742880, s5, r10);
                        }
                        textView.setText(V);
                        return;
                    } else if (!z12) {
                        if (str != null) {
                            M0 = str;
                        } else {
                            M0 = gd.M0(2131742728, null);
                        }
                        if (str == null) {
                            org.telegram.ui.Wallet.l2.m("preview", M0);
                        }
                        lc.d0(M0, d3Var.F, i6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.h2 h2Var, boolean[] zArr2, hi.d dVar, boolean z10, org.telegram.ui.Wallet.u0 u0Var, TextView textView, org.telegram.ui.Wallet.d3 d3Var, i6 i6Var) {
        this.f21957b = zArr;
        this.f21960f = h2Var;
        this.f21961g = zArr2;
        this.f21958c = dVar;
        this.d = z10;
        this.h = u0Var;
        this.f21962i = textView;
        this.f21963j = d3Var;
        this.f21959e = i6Var;
    }
}
