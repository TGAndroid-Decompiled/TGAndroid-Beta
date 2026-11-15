package hi;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.c00;
import org.telegram.ui.dx;
import org.telegram.ui.ek0;
import org.telegram.ui.g00;
import org.telegram.ui.gx;
import org.telegram.ui.ns;
import org.telegram.ui.xi0;
public final class p1 implements View.OnTouchListener {
    public final int f14837a;
    public final Object f14838b;
    public final Object f14839c;

    public p1(int i7, Object obj, Object obj2) {
        this.f14837a = i7;
        this.f14838b = obj;
        this.f14839c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i7;
        int i10;
        String M0;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15 = this.f14837a;
        boolean z11 = true;
        Object obj = this.f14839c;
        Object obj2 = this.f14838b;
        switch (i15) {
            case 0:
                t1 t1Var = (t1) obj2;
                ns p10 = ns.p();
                di.c1 c1Var = t1Var.f15136b;
                q1 q1Var = t1Var.f15139f;
                i2 i2Var = t1Var.f15141r;
                int i16 = i2.C1;
                return p10.r(motionEvent, c1Var, (bi.b6) obj, q1Var, i2Var.J0);
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        g1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 2:
                org.telegram.ui.Components.x7 x7Var = (org.telegram.ui.Components.x7) obj2;
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) obj;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.y7 y7Var = x7Var.f41614n;
                    y7Var.B1.t(y7Var.f41908s1.T(wVar));
                }
                return false;
            case 3:
                wu wuVar = (wu) obj2;
                return ns.p().r(motionEvent, wuVar.f41453r1, (om) obj, wuVar.I1, wuVar.J0);
            case 4:
                return rw0.a((rw0) obj2, (org.telegram.ui.Components.j) obj, motionEvent);
            case 5:
                dx dxVar = (dx) obj2;
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) obj;
                dxVar.getClass();
                if (motionEvent.getAction() == 0) {
                    gx gxVar = dxVar.f46489f;
                    gxVar.f47528c.t(gxVar.f47527b.T(h4Var));
                }
                return false;
            case 6:
                g00 g00Var = (g00) obj2;
                c00 c00Var = (c00) obj;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = g00Var.f47254e;
                    filtersSetupActivity.f42606c.t(filtersSetupActivity.f42604a.T(c00Var));
                }
                return false;
            default:
                ek0 ek0Var = (ek0) obj2;
                Context context = (Context) obj;
                if (ek0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.get(1);
                calendar.get(2);
                calendar.get(5);
                try {
                    EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                    int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                    if (intValue == 8) {
                        try {
                            M0 = hd.M0(2131747467, null);
                            i10 = 0;
                            str = null;
                            i11 = 20;
                            i7 = 0;
                        } catch (Exception e10) {
                            e = e10;
                            org.telegram.messenger.a8.g(e, z11);
                            return z11;
                        }
                    } else {
                        i7 = -120;
                        i10 = -18;
                        M0 = hd.M0(2131747468, null);
                        str = null;
                        i11 = 0;
                    }
                    String[] split = editTextBoldCursor.getText().toString().split("\\.");
                    if (split.length == 3) {
                        i12 = Utilities.z(split[0]).intValue();
                        i14 = Utilities.z(split[1]).intValue();
                        i13 = Utilities.z(split[2]).intValue();
                    } else {
                        i12 = -1;
                        i13 = -1;
                        i14 = -1;
                    }
                    if (intValue == 8) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i17 = i10;
                    int i18 = i13;
                    String str2 = str;
                    AlertDialog$Builder w10 = org.telegram.ui.Components.t4.w(context, i7, i11, i17, i12, i14, i18, M0, z10, new ai.r1(ek0Var, intValue, editTextBoldCursor, 14));
                    if (intValue == 8) {
                        w10.h(hd.M0(2131747465, str2), new xi0(1, ek0Var, editTextBoldCursor));
                    }
                    ek0Var.showDialog(w10.f28392a);
                    return true;
                } catch (Exception e11) {
                    e = e11;
                    z11 = true;
                }
        }
    }
}
