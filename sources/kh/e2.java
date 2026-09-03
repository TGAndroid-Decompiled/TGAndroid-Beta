package kh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.pb1;
public final class e2 extends h51 {
    public static final int f10686a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        boolean z10;
        f2 f2Var = (f2) view;
        int i10 = i51Var.d;
        ArrayList arrayList = (ArrayList) i51Var.G;
        int i11 = i51Var.f25598z;
        Utilities.Callback callback = (Utilities.Callback) i51Var.H;
        pb1 pb1Var = f2Var.f10711a;
        ArrayList arrayList2 = f2Var.d;
        if (f2Var.f10716r == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        f2Var.f10716r = i10;
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
                    pb1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                f90 f90Var = new f90(f2Var.getContext(), null);
                f90Var.setGravity(17);
                f90Var.setText((CharSequence) arrayList.get(i13));
                f90Var.setTypeface(AndroidUtilities.bold());
                f90Var.setTextColor(j6.v(j6.w0(null, j6.f19845b6, false), j6.w0(null, j6.f19863c6, false)));
                f90Var.setTextSize(1, 14.0f);
                f90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                f90Var.setEllipsize(TextUtils.TruncateAt.END);
                f90Var.setSingleLine();
                f90Var.setMaxLines(1);
                k7.d6.b(f90Var, 0.075f, 1.4f);
                pb1Var.addView(f90Var, k7.b6.n(-2, 26));
                arrayList2.add(f90Var);
                i13++;
            }
        }
        f2Var.f10712b = i11;
        if (!z10) {
            f2Var.f10713c.d(i11, true);
        }
        pb1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new d2(i14, 0, callback));
        }
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (i51Var.f25598z == i51Var2.f25598z && i51Var.H == i51Var2.H && equals(i51Var, i51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new f2(context);
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            ArrayList arrayList = (ArrayList) i51Var.G;
            ArrayList arrayList2 = (ArrayList) i51Var2.G;
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
