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
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.cc;
public final class c implements s10 {
    public final int f21595a = 0;
    public final boolean[] f21596b;
    public final hi.d f21597c;
    public final boolean d;
    public final e6 f21598e;
    public final Object f21599f;
    public final Object f21600g;
    public final Object h;
    public final Object f21601i;
    public final KeyEvent.Callback f21602j;

    public c(String str, String[] strArr, ImageView imageView, e6 e6Var, boolean z10, int[] iArr, hi.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f21599f = str;
        this.f21600g = strArr;
        this.h = imageView;
        this.f21598e = e6Var;
        this.d = z10;
        this.f21601i = iArr;
        this.f21597c = dVar;
        this.f21602j = horizontalScrollView;
        this.f21596b = zArr;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String M0;
        CharSequence V;
        int i10 = this.f21595a;
        e6 e6Var = this.f21598e;
        KeyEvent.Callback callback = this.f21602j;
        Object obj3 = this.f21601i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        hi.d dVar = this.f21597c;
        Object obj5 = this.f21600g;
        Object obj6 = this.f21599f;
        boolean[] zArr = this.f21596b;
        switch (i10) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        q6.s(imageView, j6.f29090q7, e6Var, PorterDuff.Mode.SRC_IN);
                        if (!z10) {
                            int i11 = -iArr[0];
                            iArr[0] = i11;
                            org.telegram.messenger.g0.F3(i11, imageView, null);
                        }
                    } else {
                        q6.s(imageView, j6.G6, e6Var, PorterDuff.Mode.SRC_IN);
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
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.w2 w2Var = (org.telegram.ui.Wallet.w2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !z1Var.f44786m && !z1Var.f44787n) {
                    boolean z11 = z1Var.f44789p;
                    zArr2[0] = z11;
                    dVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder n10 = org.telegram.ui.Wallet.l0.n(wallettransaction.fee, true);
                        CharSequence m10 = l0Var.m(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(m10)) {
                            V = hd.V(null, null, 2131743120, n10);
                        } else {
                            V = hd.V(null, null, 2131743119, n10, m10);
                        }
                        textView.setText(V);
                        return;
                    } else if (!z12) {
                        if (str != null) {
                            M0 = str;
                        } else {
                            M0 = hd.M0(2131742986, null);
                        }
                        if (str == null) {
                            org.telegram.ui.Wallet.d2.m("preview", M0);
                        }
                        cc.c0(M0, w2Var.F, e6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.z1 z1Var, boolean[] zArr2, hi.d dVar, boolean z10, org.telegram.ui.Wallet.l0 l0Var, TextView textView, org.telegram.ui.Wallet.w2 w2Var, e6 e6Var) {
        this.f21596b = zArr;
        this.f21599f = z1Var;
        this.f21600g = zArr2;
        this.f21597c = dVar;
        this.d = z10;
        this.h = l0Var;
        this.f21601i = textView;
        this.f21602j = w2Var;
        this.f21598e = e6Var;
    }
}
