package lh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ob1;
public final class e2 extends g51 {
    public static final int f12693a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        boolean z10;
        f2 f2Var = (f2) view;
        int i10 = h51Var.d;
        ArrayList arrayList = (ArrayList) h51Var.G;
        int i11 = h51Var.f27388z;
        Utilities.Callback callback = (Utilities.Callback) h51Var.H;
        ob1 ob1Var = f2Var.f12735a;
        ArrayList arrayList2 = f2Var.d;
        if (f2Var.f12741r == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        f2Var.f12741r = i10;
        if (arrayList2.size() != arrayList.size()) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                CharSequence charSequence = null;
                if (i12 >= arrayList2.size()) {
                    break;
                }
                if (i13 < arrayList.size()) {
                    charSequence = (CharSequence) arrayList.get(i13);
                }
                if (charSequence == null) {
                    ob1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                g90 g90Var = new g90(f2Var.getContext(), null);
                g90Var.setGravity(17);
                g90Var.setText((CharSequence) arrayList.get(i13));
                g90Var.setTypeface(AndroidUtilities.bold());
                g90Var.setTextColor(k6.v(k6.w0(null, k6.f21625b6, false), k6.w0(null, k6.f21643c6, false)));
                g90Var.setTextSize(1, 14.0f);
                g90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                g90Var.setEllipsize(TextUtils.TruncateAt.END);
                g90Var.setSingleLine();
                g90Var.setMaxLines(1);
                k7.e6.b(g90Var, 0.075f, 1.4f);
                ob1Var.addView(g90Var, k7.c6.n(-2, 26));
                arrayList2.add(g90Var);
                i13++;
            }
        }
        f2Var.f12736b = i11;
        if (!z10) {
            f2Var.f12737c.d(i11, true);
        }
        ob1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new d2(i14, 0, callback));
        }
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.f27388z == h51Var2.f27388z && h51Var.H == h51Var2.H && equals(h51Var, h51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new f2(context);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            ArrayList arrayList = (ArrayList) h51Var.G;
            ArrayList arrayList2 = (ArrayList) h51Var2.G;
            if (arrayList != arrayList2) {
                if (arrayList != null || arrayList2 != null) {
                    if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) arrayList2.get(i10))) {
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
