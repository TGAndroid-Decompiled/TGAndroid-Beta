package li;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gc;
public final class c implements v10 {
    public final int f18489a = 0;
    public final boolean[] f18490b;
    public final fi.d f18491c;
    public final boolean d;
    public final h6 f18492e;
    public final Object f18493f;
    public final Object f18494g;
    public final Object h;
    public final Object f18495i;
    public final KeyEvent.Callback f18496j;

    public c(String str, String[] strArr, ImageView imageView, h6 h6Var, boolean z9, int[] iArr, fi.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f18493f = str;
        this.f18494g = strArr;
        this.h = imageView;
        this.f18492e = h6Var;
        this.d = z9;
        this.f18495i = iArr;
        this.f18491c = dVar;
        this.f18496j = horizontalScrollView;
        this.f18490b = zArr;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String M0;
        CharSequence V;
        int i10 = this.f18489a;
        h6 h6Var = this.f18492e;
        KeyEvent.Callback callback = this.f18496j;
        Object obj3 = this.f18495i;
        Object obj4 = this.h;
        boolean z9 = this.d;
        fi.d dVar = this.f18491c;
        Object obj5 = this.f18494g;
        Object obj6 = this.f18493f;
        boolean[] zArr = this.f18490b;
        switch (i10) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        t6.s(imageView, m6.f28131q7, h6Var, PorterDuff.Mode.SRC_IN);
                        if (!z9) {
                            int i11 = -iArr[0];
                            iArr[0] = i11;
                            org.telegram.messenger.g0.G3(i11, imageView, null);
                        }
                    } else {
                        t6.s(imageView, m6.G6, h6Var, PorterDuff.Mode.SRC_IN);
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
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj4;
                TextView textView = (TextView) obj3;
                org.telegram.ui.Wallet.x2 x2Var = (org.telegram.ui.Wallet.x2) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !z1Var.f43422m && !z1Var.f43423n) {
                    boolean z10 = z1Var.f43425p;
                    zArr2[0] = z10;
                    dVar.setEnabled(z10);
                    boolean z11 = zArr2[0];
                    if (z11 && !z9) {
                        SpannableStringBuilder n10 = org.telegram.ui.Wallet.l0.n(wallettransaction.fee, true);
                        CharSequence m10 = l0Var.m(wallettransaction.fee, true);
                        if (TextUtils.isEmpty(m10)) {
                            V = id.V(null, null, 2131743120, n10);
                        } else {
                            V = id.V(null, null, 2131743119, n10, m10);
                        }
                        textView.setText(V);
                        return;
                    } else if (!z11) {
                        if (str != null) {
                            M0 = str;
                        } else {
                            M0 = id.M0(2131742986, null);
                        }
                        if (str == null) {
                            org.telegram.ui.Wallet.d2.m("preview", M0);
                        }
                        gc.c0(M0, x2Var.E, h6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.z1 z1Var, boolean[] zArr2, fi.d dVar, boolean z9, org.telegram.ui.Wallet.l0 l0Var, TextView textView, org.telegram.ui.Wallet.x2 x2Var, h6 h6Var) {
        this.f18490b = zArr;
        this.f18493f = z1Var;
        this.f18494g = zArr2;
        this.f18491c = dVar;
        this.d = z9;
        this.h = l0Var;
        this.f18495i = textView;
        this.f18496j = x2Var;
        this.f18492e = h6Var;
    }
}
