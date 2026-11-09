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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.hc;
public final class c implements v10 {
    public final int f18486a = 0;
    public final boolean[] f18487b;
    public final fi.d f18488c;
    public final boolean d;
    public final g6 f18489e;
    public final Object f18490f;
    public final Object f18491g;
    public final Object h;
    public final Object f18492i;
    public final KeyEvent.Callback f18493j;

    public c(String str, String[] strArr, ImageView imageView, g6 g6Var, boolean z9, int[] iArr, fi.d dVar, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f18490f = str;
        this.f18491g = strArr;
        this.h = imageView;
        this.f18489e = g6Var;
        this.d = z9;
        this.f18492i = iArr;
        this.f18488c = dVar;
        this.f18493j = horizontalScrollView;
        this.f18487b = zArr;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7;
        String M0;
        CharSequence V;
        int i10 = this.f18486a;
        g6 g6Var = this.f18489e;
        KeyEvent.Callback callback = this.f18493j;
        Object obj3 = this.f18492i;
        Object obj4 = this.h;
        boolean z9 = this.d;
        fi.d dVar = this.f18488c;
        Object obj5 = this.f18491g;
        Object obj6 = this.f18490f;
        boolean[] zArr = this.f18487b;
        switch (i10) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        s6.s(imageView, l6.f28106q7, g6Var, PorterDuff.Mode.SRC_IN);
                        if (!z9) {
                            int i11 = -iArr[0];
                            iArr[0] = i11;
                            org.telegram.messenger.g0.G3(i11, imageView, null);
                        }
                    } else {
                        s6.s(imageView, l6.G6, g6Var, PorterDuff.Mode.SRC_IN);
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
                if (!zArr[0] && !z1Var.f43415m && !z1Var.f43416n) {
                    boolean z10 = z1Var.f43418p;
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
                        hc.c0(M0, x2Var.E, g6Var);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public c(boolean[] zArr, org.telegram.ui.Wallet.z1 z1Var, boolean[] zArr2, fi.d dVar, boolean z9, org.telegram.ui.Wallet.l0 l0Var, TextView textView, org.telegram.ui.Wallet.x2 x2Var, g6 g6Var) {
        this.f18487b = zArr;
        this.f18490f = z1Var;
        this.f18491g = zArr2;
        this.f18488c = dVar;
        this.d = z9;
        this.h = l0Var;
        this.f18492i = textView;
        this.f18493j = x2Var;
        this.f18489e = g6Var;
    }
}
