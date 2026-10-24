package ki;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.vc;
public final class c implements Utilities.Callback2 {
    public final int f15217a = 0;
    public final boolean[] f15218b;
    public final ei.d f15219c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final Object f15220f;
    public final Object f15221g;
    public final Object h;
    public final Object f15222i;
    public final KeyEvent.Callback f15223j;

    public c(String str, String[] strArr, ImageView imageView, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, int[] iArr, ei.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f15220f = str;
        this.f15221g = strArr;
        this.h = imageView;
        this.e = g6Var;
        this.d = z10;
        this.f15222i = iArr;
        this.f15219c = dVar;
        this.f15223j = horizontalScrollView;
        this.f15218b = zArr;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        String string;
        CharSequence formatSpannable;
        int i11 = this.f15217a;
        org.telegram.ui.ActionBar.g6 g6Var = this.e;
        KeyEvent.Callback callback = this.f15223j;
        Object obj3 = this.f15222i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        ei.d dVar = this.f15219c;
        Object obj5 = this.f15221g;
        Object obj6 = this.f15220f;
        boolean[] zArr = this.f15218b;
        switch (i11) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        r6.t(imageView, k6.f21422q7, g6Var, PorterDuff.Mode.SRC_IN);
                        if (!z10) {
                            int i12 = -iArr[0];
                            iArr[0] = i12;
                            AndroidUtilities.shakeViewSpring(imageView, i12);
                        }
                    } else {
                        r6.t(imageView, k6.G6, g6Var, PorterDuff.Mode.SRC_IN);
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
                if (!zArr[0] && !a2Var.f34283m && !a2Var.f34284n) {
                    boolean z11 = a2Var.f34286p;
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
                        vc.c0(string, i2Var.topBulletinContainer, g6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.a2 a2Var, boolean[] zArr2, ei.d dVar, boolean z10, org.telegram.ui.Wallet.l0 l0Var, TextView textView, org.telegram.ui.Wallet.i2 i2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f15218b = zArr;
        this.f15220f = a2Var;
        this.f15221g = zArr2;
        this.f15219c = dVar;
        this.d = z10;
        this.h = l0Var;
        this.f15222i = textView;
        this.f15223j = i2Var;
        this.e = g6Var;
    }
}
