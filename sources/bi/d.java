package bi;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Components.cc;
public final class d implements j20 {
    public final int f2907a = 0;
    public final boolean[] f2908b;
    public final vh.d f2909c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final Object f2910f;
    public final Object f2911g;
    public final Object h;
    public final Object f2912i;
    public final KeyEvent.Callback f2913j;

    public d(String str, String[] strArr, ImageView imageView, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, int[] iArr, vh.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f2910f = str;
        this.f2911g = strArr;
        this.h = imageView;
        this.e = p6Var;
        this.d = z10;
        this.f2912i = iArr;
        this.f2909c = dVar;
        this.f2913j = horizontalScrollView;
        this.f2908b = zArr;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10;
        String L0;
        CharSequence V;
        int i11 = this.f2907a;
        org.telegram.ui.ActionBar.p6 p6Var = this.e;
        KeyEvent.Callback callback = this.f2913j;
        Object obj3 = this.f2912i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        vh.d dVar = this.f2909c;
        Object obj5 = this.f2911g;
        Object obj6 = this.f2910f;
        boolean[] zArr = this.f2908b;
        switch (i11) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        a7.t(imageView, org.telegram.ui.ActionBar.t6.f21170q7, p6Var, PorterDuff.Mode.SRC_IN);
                        if (!z10) {
                            int i12 = -iArr[0];
                            iArr[0] = i12;
                            org.telegram.messenger.i0.F3(i12, imageView, null);
                        }
                    } else {
                        a7.t(imageView, org.telegram.ui.ActionBar.t6.G6, p6Var, PorterDuff.Mode.SRC_IN);
                    }
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    dVar.setEnabled(!bool.booleanValue());
                    if (bitmap != null) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    horizontalScrollView.setVisibility(i10);
                    zArr[0] = bool.booleanValue();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !a2Var.f34171m && !a2Var.f34172n) {
                    boolean z11 = a2Var.f34174p;
                    zArr2[0] = z11;
                    dVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder n10 = org.telegram.ui.Wallet.k0.n(wallettransaction.fee, true);
                        CharSequence m10 = k0Var.m(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(m10)) {
                            V = cd.V(null, null, 2131743146, n10);
                        } else {
                            V = cd.V(null, null, 2131743145, n10, m10);
                        }
                        textView.setText(V);
                        return;
                    } else if (!z12) {
                        if (str != null) {
                            L0 = str;
                        } else {
                            L0 = cd.L0(2131743012, null);
                        }
                        if (str == null) {
                            org.telegram.ui.Wallet.e2.m("preview", L0);
                        }
                        cc.c0(L0, y2Var.E, p6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public d(boolean[] zArr, org.telegram.ui.Wallet.a2 a2Var, boolean[] zArr2, vh.d dVar, boolean z10, org.telegram.ui.Wallet.k0 k0Var, TextView textView, org.telegram.ui.Wallet.y2 y2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f2908b = zArr;
        this.f2910f = a2Var;
        this.f2911g = zArr2;
        this.f2909c = dVar;
        this.d = z10;
        this.h = k0Var;
        this.f2912i = textView;
        this.f2913j = y2Var;
        this.e = p6Var;
    }
}
