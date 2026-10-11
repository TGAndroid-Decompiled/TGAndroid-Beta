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
    public final int f12292a = 0;
    public final boolean[] f12293b;
    public final ci.d f12294c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.d6 f12295e;
    public final Object f12296f;
    public final Object f12297g;
    public final Object h;
    public final Object f12298i;
    public final KeyEvent.Callback f12299j;

    public c(String str, String[] strArr, ImageView imageView, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, int[] iArr, ci.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f12296f = str;
        this.f12297g = strArr;
        this.h = imageView;
        this.f12295e = d6Var;
        this.d = z10;
        this.f12298i = iArr;
        this.f12294c = dVar;
        this.f12299j = horizontalScrollView;
        this.f12293b = zArr;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        String string;
        CharSequence formatSpannable;
        int i11 = this.f12292a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f12295e;
        KeyEvent.Callback callback = this.f12299j;
        Object obj3 = this.f12298i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        ci.d dVar = this.f12294c;
        Object obj5 = this.f12297g;
        Object obj6 = this.f12296f;
        boolean[] zArr = this.f12293b;
        switch (i11) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21026q7, d6Var), PorterDuff.Mode.SRC_IN));
                        if (!z10) {
                            int i12 = -iArr[0];
                            iArr[0] = i12;
                            AndroidUtilities.shakeViewSpring(imageView, i12);
                        }
                    } else {
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var), PorterDuff.Mode.SRC_IN));
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
                org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !b2Var.f34686m && !b2Var.f34687n) {
                    boolean z11 = b2Var.f34689p;
                    zArr2[0] = z11;
                    dVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder m10 = org.telegram.ui.Wallet.l0.m(wallettransaction.fee, true);
                        CharSequence l4 = l0Var.l(wallettransaction.fee, true);
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
                            org.telegram.ui.Wallet.f2.k("preview", string);
                        }
                        ad.c0(string, j2Var.topBulletinContainer, d6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.b2 b2Var, boolean[] zArr2, ci.d dVar, boolean z10, org.telegram.ui.Wallet.l0 l0Var, TextView textView, org.telegram.ui.Wallet.j2 j2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f12293b = zArr;
        this.f12296f = b2Var;
        this.f12297g = zArr2;
        this.f12294c = dVar;
        this.d = z10;
        this.h = l0Var;
        this.f12298i = textView;
        this.f12299j = j2Var;
        this.f12295e = d6Var;
    }
}
