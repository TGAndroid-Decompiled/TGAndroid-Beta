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
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.kc;
public final class c implements p10 {
    public final int f22099a = 0;
    public final boolean[] f22100b;
    public final hi.e f22101c;
    public final boolean d;
    public final i6 f22102e;
    public final Object f22103f;
    public final Object f22104g;
    public final Object h;
    public final Object f22105i;
    public final KeyEvent.Callback f22106j;

    public c(String str, String[] strArr, ImageView imageView, i6 i6Var, boolean z10, int[] iArr, hi.e eVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f22103f = str;
        this.f22104g = strArr;
        this.h = imageView;
        this.f22102e = i6Var;
        this.d = z10;
        this.f22105i = iArr;
        this.f22101c = eVar;
        this.f22106j = horizontalScrollView;
        this.f22100b = zArr;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String N0;
        CharSequence V;
        int i10 = this.f22099a;
        i6 i6Var = this.f22102e;
        KeyEvent.Callback callback = this.f22106j;
        Object obj3 = this.f22105i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        hi.e eVar = this.f22101c;
        Object obj5 = this.f22104g;
        Object obj6 = this.f22103f;
        boolean[] zArr = this.f22100b;
        switch (i10) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        u6.s(imageView, n6.f29692q7, i6Var, PorterDuff.Mode.SRC_IN);
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
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !i2Var.f44471m && !i2Var.f44472n) {
                    boolean z11 = i2Var.f44474p;
                    zArr2[0] = z11;
                    eVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder s5 = org.telegram.ui.Wallet.v0.s(wallettransaction.fee, true);
                        CharSequence r10 = v0Var.r(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(r10)) {
                            V = gd.V(null, null, 2131742868, s5);
                        } else {
                            V = gd.V(null, null, 2131742867, s5, r10);
                        }
                        textView.setText(V);
                        return;
                    } else if (!z12) {
                        if (str != null) {
                            N0 = str;
                        } else {
                            N0 = gd.N0(2131742715, null);
                        }
                        if (str == null) {
                            org.telegram.ui.Wallet.m2.m("preview", N0);
                        }
                        kc.d0(N0, e3Var.F, i6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.i2 i2Var, boolean[] zArr2, hi.e eVar, boolean z10, org.telegram.ui.Wallet.v0 v0Var, TextView textView, org.telegram.ui.Wallet.e3 e3Var, i6 i6Var) {
        this.f22100b = zArr;
        this.f22103f = i2Var;
        this.f22104g = zArr2;
        this.f22101c = eVar;
        this.d = z10;
        this.h = v0Var;
        this.f22105i = textView;
        this.f22106j = e3Var;
        this.f22102e = i6Var;
    }
}
