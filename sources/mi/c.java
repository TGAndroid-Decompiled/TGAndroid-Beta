package mi;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.fc;
public final class c implements n10 {
    public final int f19492a = 0;
    public final boolean[] f19493b;
    public final gi.d f19494c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.e6 f19495e;
    public final Object f19496f;
    public final Object f19497g;
    public final Object h;
    public final Object f19498i;
    public final KeyEvent.Callback f19499j;

    public c(String str, String[] strArr, ImageView imageView, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int[] iArr, gi.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f19496f = str;
        this.f19497g = strArr;
        this.h = imageView;
        this.f19495e = e6Var;
        this.d = z10;
        this.f19498i = iArr;
        this.f19494c = dVar;
        this.f19499j = horizontalScrollView;
        this.f19493b = zArr;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3;
        String M0;
        CharSequence V;
        int i10 = this.f19492a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19495e;
        KeyEvent.Callback callback = this.f19499j;
        Object obj3 = this.f19498i;
        Object obj4 = this.h;
        boolean z10 = this.d;
        gi.d dVar = this.f19494c;
        Object obj5 = this.f19497g;
        Object obj6 = this.f19496f;
        boolean[] zArr = this.f19493b;
        switch (i10) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        r6.t(imageView, k6.f28122q7, e6Var, PorterDuff.Mode.SRC_IN);
                        if (!z10) {
                            int i11 = -iArr[0];
                            iArr[0] = i11;
                            org.telegram.messenger.g0.G3(i11, imageView, null);
                        }
                    } else {
                        r6.t(imageView, k6.G6, e6Var, PorterDuff.Mode.SRC_IN);
                    }
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    dVar.setEnabled(!bool.booleanValue());
                    if (bitmap != null) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    horizontalScrollView.setVisibility(i3);
                    zArr[0] = bool.booleanValue();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !y1Var.f43466m && !y1Var.f43467n) {
                    boolean z11 = y1Var.f43469p;
                    zArr2[0] = z11;
                    dVar.setEnabled(z11);
                    boolean z12 = zArr2[0];
                    if (z12 && !z10) {
                        SpannableStringBuilder n4 = org.telegram.ui.Wallet.k0.n(wallettransaction.fee, true);
                        CharSequence m10 = k0Var.m(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(m10)) {
                            V = bd.V(null, null, 2131743130, n4);
                        } else {
                            V = bd.V(null, null, 2131743129, n4, m10);
                        }
                        textView.setText(V);
                        return;
                    } else if (!z12) {
                        if (str != null) {
                            M0 = str;
                        } else {
                            M0 = bd.M0(2131742996, null);
                        }
                        if (str == null) {
                            org.telegram.ui.Wallet.c2.m("preview", M0);
                        }
                        fc.c0(M0, x2Var.F, e6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.y1 y1Var, boolean[] zArr2, gi.d dVar, boolean z10, org.telegram.ui.Wallet.k0 k0Var, TextView textView, org.telegram.ui.Wallet.x2 x2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f19493b = zArr;
        this.f19496f = y1Var;
        this.f19497g = zArr2;
        this.f19494c = dVar;
        this.d = z10;
        this.h = k0Var;
        this.f19498i = textView;
        this.f19499j = x2Var;
        this.f19495e = e6Var;
    }
}
