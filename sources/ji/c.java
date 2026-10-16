package ji;

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
import org.telegram.ui.Components.zc;
public final class c implements Utilities.Callback2 {
    public final int f13162a = 0;
    public final boolean[] f13163b;
    public final di.d f13164c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final Object f13165f;
    public final Object f13166g;
    public final Object h;
    public final Object f13167i;
    public final KeyEvent.Callback f13168j;

    public c(String str, String[] strArr, ImageView imageView, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, int[] iArr, di.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f13165f = str;
        this.f13166g = strArr;
        this.h = imageView;
        this.e = c6Var;
        this.d = z10;
        this.f13167i = iArr;
        this.f13164c = dVar;
        this.f13168j = horizontalScrollView;
        this.f13163b = zArr;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        String string;
        CharSequence formatSpannable;
        int i11 = this.f13162a;
        org.telegram.ui.ActionBar.c6 c6Var = this.e;
        KeyEvent.Callback callback = this.f13168j;
        Object obj3 = this.f13167i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        di.d dVar = this.f13164c;
        Object obj5 = this.f13166g;
        Object obj6 = this.f13165f;
        boolean[] zArr = this.f13163b;
        switch (i11) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19839q7, c6Var), PorterDuff.Mode.SRC_IN));
                        if (!z10) {
                            int i12 = -iArr[0];
                            iArr[0] = i12;
                            AndroidUtilities.shakeViewSpring(imageView, i12);
                        }
                    } else {
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
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
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !a2Var.f32626m && !a2Var.f32627n) {
                    boolean z11 = a2Var.f32629p;
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
                            org.telegram.ui.Wallet.e2.k("preview", string);
                        }
                        zc.c0(string, i2Var.topBulletinContainer, c6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.a2 a2Var, boolean[] zArr2, di.d dVar, boolean z10, org.telegram.ui.Wallet.k0 k0Var, TextView textView, org.telegram.ui.Wallet.i2 i2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f13163b = zArr;
        this.f13165f = a2Var;
        this.f13166g = zArr2;
        this.f13164c = dVar;
        this.d = z10;
        this.h = k0Var;
        this.f13167i = textView;
        this.f13168j = i2Var;
        this.e = c6Var;
    }
}
