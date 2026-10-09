package ii;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ad;
public final class c implements Utilities.Callback2 {
    public final int f12293a = 0;
    public final boolean[] f12294b;
    public final ci.d f12295c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.e6 f12296e;
    public final Object f12297f;
    public final Object f12298g;
    public final Object h;
    public final Object f12299i;
    public final KeyEvent.Callback f12300j;

    public c(String str, String[] strArr, ImageView imageView, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int[] iArr, ci.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f12297f = str;
        this.f12298g = strArr;
        this.h = imageView;
        this.f12296e = e6Var;
        this.d = z10;
        this.f12299i = iArr;
        this.f12295c = dVar;
        this.f12300j = horizontalScrollView;
        this.f12294b = zArr;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        String string;
        CharSequence formatSpannable;
        int i11 = this.f12293a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f12296e;
        KeyEvent.Callback callback = this.f12300j;
        Object obj3 = this.f12299i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        ci.d dVar = this.f12295c;
        Object obj5 = this.f12298g;
        Object obj6 = this.f12297f;
        boolean[] zArr = this.f12294b;
        switch (i11) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21037q7, e6Var), PorterDuff.Mode.SRC_IN));
                        if (!z10) {
                            int i12 = -iArr[0];
                            iArr[0] = i12;
                            AndroidUtilities.shakeViewSpring(imageView, i12);
                        }
                    } else {
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var), PorterDuff.Mode.SRC_IN));
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
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !z1Var.f35730m && !z1Var.f35731n) {
                    boolean z11 = z1Var.f35733p;
                    zArr2[0] = z11;
                    dVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder m10 = org.telegram.ui.Wallet.k0.m(wallettransaction.fee, true);
                        CharSequence l4 = k0Var.l(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(l4)) {
                            formatSpannable = LocaleController.formatSpannable(R.string.WalletFeeAmount, m10);
                        } else {
                            formatSpannable = LocaleController.formatSpannable(R.string.WalletFeeAmountWithCurrency, m10, l4);
                        }
                        textView.setText(formatSpannable);
                        return;
                    } else if (!z12) {
                        if (str != null) {
                            string = str;
                        } else {
                            string = LocaleController.getString(R.string.WalletTransactionSimulationFailed);
                        }
                        if (str == null) {
                            org.telegram.ui.Wallet.d2.k("preview", string);
                        }
                        ad.c0(string, h2Var.topBulletinContainer, e6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.z1 z1Var, boolean[] zArr2, ci.d dVar, boolean z10, org.telegram.ui.Wallet.k0 k0Var, TextView textView, org.telegram.ui.Wallet.h2 h2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f12294b = zArr;
        this.f12297f = z1Var;
        this.f12298g = zArr2;
        this.f12295c = dVar;
        this.d = z10;
        this.h = k0Var;
        this.f12299i = textView;
        this.f12300j = h2Var;
        this.f12296e = e6Var;
    }
}
