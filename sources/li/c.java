package li;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.hc;
public final class c implements v10 {
    public final int f18483a = 0;
    public final boolean[] f18484b;
    public final fi.d f18485c;
    public final boolean d;
    public final f6 f18486e;
    public final Object f18487f;
    public final Object f18488g;
    public final Object h;
    public final Object f18489i;
    public final KeyEvent.Callback f18490j;

    public c(String str, String[] strArr, ImageView imageView, f6 f6Var, boolean z9, int[] iArr, fi.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f18487f = str;
        this.f18488g = strArr;
        this.h = imageView;
        this.f18486e = f6Var;
        this.d = z9;
        this.f18489i = iArr;
        this.f18485c = dVar;
        this.f18490j = horizontalScrollView;
        this.f18484b = zArr;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String M0;
        CharSequence V;
        int i10 = this.f18483a;
        f6 f6Var = this.f18486e;
        KeyEvent.Callback callback = this.f18490j;
        Object obj3 = this.f18489i;
        Object obj4 = this.h;
        boolean z9 = this.d;
        fi.d dVar = this.f18485c;
        Object obj5 = this.f18488g;
        Object obj6 = this.f18487f;
        boolean[] zArr = this.f18484b;
        switch (i10) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        r6.t(imageView, k6.f28089q7, f6Var, PorterDuff.Mode.SRC_IN);
                        if (!z9) {
                            int i11 = -iArr[0];
                            iArr[0] = i11;
                            org.telegram.messenger.g0.G3(i11, imageView, null);
                        }
                    } else {
                        r6.t(imageView, k6.G6, f6Var, PorterDuff.Mode.SRC_IN);
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
                org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !b2Var.f42132m && !b2Var.f42133n) {
                    boolean z10 = b2Var.f42135p;
                    zArr2[0] = z10;
                    dVar.setEnabled(z10);
                    boolean z11 = zArr2[0];
                    if (z11 && !z9) {
                        SpannableStringBuilder n10 = org.telegram.ui.Wallet.n0.n(wallettransaction.fee, true);
                        CharSequence m10 = n0Var.m(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(m10)) {
                            V = hd.V(null, null, 2131743121, n10);
                        } else {
                            V = hd.V(null, null, 2131743120, n10, m10);
                        }
                        textView.setText(V);
                        return;
                    } else if (!z11) {
                        if (str != null) {
                            M0 = str;
                        } else {
                            M0 = hd.M0(2131742987, null);
                        }
                        if (str == null) {
                            org.telegram.ui.Wallet.f2.m("preview", M0);
                        }
                        hc.c0(M0, z2Var.E, f6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.b2 b2Var, boolean[] zArr2, fi.d dVar, boolean z9, org.telegram.ui.Wallet.n0 n0Var, TextView textView, org.telegram.ui.Wallet.z2 z2Var, f6 f6Var) {
        this.f18484b = zArr;
        this.f18487f = b2Var;
        this.f18488g = zArr2;
        this.f18485c = dVar;
        this.d = z9;
        this.h = n0Var;
        this.f18489i = textView;
        this.f18490j = z2Var;
        this.f18486e = f6Var;
    }
}
