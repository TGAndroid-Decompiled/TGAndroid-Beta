package li;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.wc;
public final class c implements Utilities.Callback2 {
    public final int f17157a = 0;
    public final boolean[] f17158b;
    public final fi.d f17159c;
    public final boolean d;
    public final u6 e;
    public final Object f17160f;
    public final Object f17161g;
    public final Object h;
    public final Object f17162i;
    public final KeyEvent.Callback f17163j;

    public c(String str, String[] strArr, ImageView imageView, u6 u6Var, boolean z10, int[] iArr, fi.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f17160f = str;
        this.f17161g = strArr;
        this.h = imageView;
        this.e = u6Var;
        this.d = z10;
        this.f17162i = iArr;
        this.f17159c = dVar;
        this.f17163j = horizontalScrollView;
        this.f17158b = zArr;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        String string;
        CharSequence formatSpannable;
        int i11 = this.f17157a;
        u6 u6Var = this.e;
        KeyEvent.Callback callback = this.f17163j;
        Object obj3 = this.f17162i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        fi.d dVar = this.f17159c;
        Object obj5 = this.f17161g;
        Object obj6 = this.f17160f;
        boolean[] zArr = this.f17158b;
        switch (i11) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        f7.t(imageView, y6.f23598q7, u6Var, PorterDuff.Mode.SRC_IN);
                        if (!z10) {
                            int i12 = -iArr[0];
                            iArr[0] = i12;
                            AndroidUtilities.shakeViewSpring(imageView, i12);
                        }
                    } else {
                        f7.t(imageView, y6.G6, u6Var, PorterDuff.Mode.SRC_IN);
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
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !a2Var.f36346m && !a2Var.f36347n) {
                    boolean z11 = a2Var.f36349p;
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
                            org.telegram.ui.Wallet.e2.k("preview", string);
                        }
                        wc.d0(string, i2Var.topBulletinContainer, u6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.a2 a2Var, boolean[] zArr2, fi.d dVar, boolean z10, org.telegram.ui.Wallet.l0 l0Var, TextView textView, org.telegram.ui.Wallet.i2 i2Var, u6 u6Var) {
        this.f17158b = zArr;
        this.f17160f = a2Var;
        this.f17161g = zArr2;
        this.f17159c = dVar;
        this.d = z10;
        this.h = l0Var;
        this.f17162i = textView;
        this.f17163j = i2Var;
        this.e = u6Var;
    }
}
