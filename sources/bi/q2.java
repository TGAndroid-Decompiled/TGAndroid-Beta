package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import c8.ja;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.z51;
public final class q2 extends a41 {
    public static final int f3802b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        boolean z11;
        r2 r2Var = (r2) view;
        int i7 = b41Var.d;
        ArrayList arrayList = (ArrayList) b41Var.G;
        int i10 = b41Var.f33194z;
        z10 z10Var = (z10) b41Var.H;
        z51 z51Var = r2Var.f3819a;
        ArrayList arrayList2 = r2Var.d;
        if (r2Var.f3825r == i7) {
            z11 = true;
        } else {
            z11 = false;
        }
        r2Var.f3825r = i7;
        if (arrayList2.size() != arrayList.size()) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                CharSequence charSequence = null;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                if (i12 < arrayList.size()) {
                    charSequence = (CharSequence) arrayList.get(i12);
                }
                if (charSequence == null) {
                    z51Var.removeView((View) arrayList2.remove(i11));
                    i11--;
                } else {
                    ((TextView) arrayList2.get(i11)).setText(charSequence);
                }
                i12++;
                i11++;
            }
            while (i12 < arrayList.size()) {
                z70 z70Var = new z70(r2Var.getContext(), null);
                z70Var.setGravity(17);
                z70Var.setText((CharSequence) arrayList.get(i12));
                z70Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.q6.V(z70Var, org.telegram.ui.ActionBar.q6.p(org.telegram.ui.ActionBar.j6.f28812b6, org.telegram.ui.ActionBar.j6.f28831c6), null);
                z70Var.setTextSize(1, 14.0f);
                z70Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                z70Var.setEllipsize(TextUtils.TruncateAt.END);
                z70Var.setSingleLine();
                z70Var.setMaxLines(1);
                na.b(z70Var, 0.075f, 1.4f);
                z51Var.addView(z70Var, ja.o(-2, 26));
                arrayList2.add(z70Var);
                i12++;
            }
        }
        r2Var.f3820b = i10;
        if (!z11) {
            r2Var.f3821c.e(true, i10);
        }
        z51Var.invalidate();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((TextView) arrayList2.get(i13)).setOnClickListener(new p2(z10Var, i13, 0));
        }
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        if (b41Var.f33194z == b41Var2.f33194z && b41Var.H == b41Var2.H && e(b41Var, b41Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new r2(context);
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.d == b41Var2.d) {
            ArrayList arrayList = (ArrayList) b41Var.G;
            ArrayList arrayList2 = (ArrayList) b41Var2.G;
            if (arrayList != arrayList2) {
                if (arrayList != null || arrayList2 != null) {
                    if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i7), (CharSequence) arrayList2.get(i7))) {
                            }
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
