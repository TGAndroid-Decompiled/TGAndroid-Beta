package oi;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.lc;
public final class c implements r10 {
    public final int f22033a = 0;
    public final boolean[] f22034b;
    public final hi.e f22035c;
    public final boolean d;
    public final h6 f22036e;
    public final Object f22037f;
    public final Object f22038g;
    public final Object h;
    public final Object f22039i;
    public final KeyEvent.Callback f22040j;

    public c(String str, String[] strArr, ImageView imageView, h6 h6Var, boolean z10, int[] iArr, hi.e eVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f22037f = str;
        this.f22038g = strArr;
        this.h = imageView;
        this.f22036e = h6Var;
        this.d = z10;
        this.f22039i = iArr;
        this.f22035c = eVar;
        this.f22040j = horizontalScrollView;
        this.f22034b = zArr;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String N0;
        CharSequence V;
        int i10 = this.f22033a;
        h6 h6Var = this.f22036e;
        KeyEvent.Callback callback = this.f22040j;
        Object obj3 = this.f22039i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        hi.e eVar = this.f22035c;
        Object obj5 = this.f22038g;
        Object obj6 = this.f22037f;
        boolean[] zArr = this.f22034b;
        switch (i10) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        t6.s(imageView, m6.f29622q7, h6Var, PorterDuff.Mode.SRC_IN);
                        if (!z10) {
                            int i11 = -iArr[0];
                            iArr[0] = i11;
                            org.telegram.messenger.g0.E3(i11, imageView, null);
                        }
                    } else {
                        t6.s(imageView, m6.G6, h6Var, PorterDuff.Mode.SRC_IN);
                    }
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    eVar.setEnabled(!bool.booleanValue());
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
                if (!zArr[0] && !h2Var.f44343m && !h2Var.f44344n) {
                    boolean z11 = h2Var.f44346p;
                    zArr2[0] = z11;
                    eVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder s5 = org.telegram.ui.Wallet.u0.s(wallettransaction.fee, true);
                        CharSequence r10 = u0Var.r(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(r10)) {
                            V = hd.V(null, null, 2131742873, s5);
                        } else {
                            V = hd.V(null, null, 2131742872, s5, r10);
                        }
                        textView.setText(V);
                        return;
                    } else if (!z12) {
                        if (str != null) {
                            N0 = str;
                        } else {
                            N0 = hd.N0(2131742720, null);
                        }
                        if (str == null) {
                            org.telegram.ui.Wallet.l2.m("preview", N0);
                        }
                        lc.d0(N0, d3Var.F, h6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.h2 h2Var, boolean[] zArr2, hi.e eVar, boolean z10, org.telegram.ui.Wallet.u0 u0Var, TextView textView, org.telegram.ui.Wallet.d3 d3Var, h6 h6Var) {
        this.f22034b = zArr;
        this.f22037f = h2Var;
        this.f22038g = zArr2;
        this.f22035c = eVar;
        this.d = z10;
        this.h = u0Var;
        this.f22039i = textView;
        this.f22040j = d3Var;
        this.f22036e = h6Var;
    }
}
