package ki;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.xc;
public final class c implements Utilities.Callback2 {
    public final int f15161a = 0;
    public final boolean[] f15162b;
    public final ei.d f15163c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final Object f15164f;
    public final Object f15165g;
    public final Object h;
    public final Object f15166i;
    public final KeyEvent.Callback f15167j;

    public c(String str, String[] strArr, ImageView imageView, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, int[] iArr, ei.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f15164f = str;
        this.f15165g = strArr;
        this.h = imageView;
        this.e = d6Var;
        this.d = z10;
        this.f15166i = iArr;
        this.f15163c = dVar;
        this.f15167j = horizontalScrollView;
        this.f15162b = zArr;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        String string;
        CharSequence formatSpannable;
        int i11 = this.f15161a;
        org.telegram.ui.ActionBar.d6 d6Var = this.e;
        KeyEvent.Callback callback = this.f15167j;
        Object obj3 = this.f15166i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        ei.d dVar = this.f15163c;
        Object obj5 = this.f15165g;
        Object obj6 = this.f15164f;
        boolean[] zArr = this.f15162b;
        switch (i11) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.f21228q7, d6Var), PorterDuff.Mode.SRC_IN));
                        if (!z10) {
                            int i12 = -iArr[0];
                            iArr[0] = i12;
                            AndroidUtilities.shakeViewSpring(imageView, i12);
                        }
                    } else {
                        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.G6, d6Var), PorterDuff.Mode.SRC_IN));
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
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.j2 j2Var = (org.telegram.ui.Wallet.j2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !b2Var.f34024m && !b2Var.f34025n) {
                    boolean z11 = b2Var.f34027p;
                    zArr2[0] = z11;
                    dVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder m10 = org.telegram.ui.Wallet.m0.m(wallettransaction.fee, true);
                        CharSequence l4 = m0Var.l(wallettransaction.fee, true);
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
                        xc.c0(string, j2Var.topBulletinContainer, d6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.b2 b2Var, boolean[] zArr2, ei.d dVar, boolean z10, org.telegram.ui.Wallet.m0 m0Var, TextView textView, org.telegram.ui.Wallet.j2 j2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f15162b = zArr;
        this.f15164f = b2Var;
        this.f15165g = zArr2;
        this.f15163c = dVar;
        this.d = z10;
        this.h = m0Var;
        this.f15166i = textView;
        this.f15167j = j2Var;
        this.e = d6Var;
    }
}
