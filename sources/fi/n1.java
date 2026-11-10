package fi;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.d00;
import org.telegram.ui.ek0;
import org.telegram.ui.ex;
import org.telegram.ui.h00;
import org.telegram.ui.hx;
import org.telegram.ui.ns;
import org.telegram.ui.su;
public final class n1 implements View.OnTouchListener {
    public final int f12476a;
    public final Object f12477b;
    public final Object f12478c;

    public n1(int i7, Object obj, Object obj2) {
        this.f12476a = i7;
        this.f12477b = obj;
        this.f12478c = obj2;
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
        boolean z9;
        int i15 = this.f12476a;
        boolean z10 = true;
        Object obj = this.f12478c;
        Object obj2 = this.f12477b;
        switch (i15) {
            case 0:
                t1 t1Var = (t1) obj2;
                ns p10 = ns.p();
                bi.q1 q1Var = t1Var.f12840b;
                p1 p1Var = t1Var.f12843f;
                k2 k2Var = t1Var.f12845r;
                int i16 = k2.B1;
                return p10.r(motionEvent, q1Var, (ai.k) obj, p1Var, k2Var.I0);
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
                org.telegram.ui.Components.z7 z7Var = (org.telegram.ui.Components.z7) obj2;
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) obj;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.a8 a8Var = z7Var.f40892n;
                    a8Var.A1.t(a8Var.f31754r1.T(wVar));
                }
                return false;
            case 3:
                qu quVar = (qu) obj2;
                return ns.p().r(motionEvent, quVar.f37399q1, (fm) obj, quVar.H1, quVar.I0);
            case 4:
                return ow0.a((ow0) obj2, (org.telegram.ui.Components.j) obj, motionEvent);
            case 5:
                ex exVar = (ex) obj2;
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) obj;
                exVar.getClass();
                if (motionEvent.getAction() == 0) {
                    hx hxVar = exVar.f45457f;
                    hxVar.f46438c.t(hxVar.f46437b.T(h4Var));
                }
                return false;
            case 6:
                h00 h00Var = (h00) obj2;
                d00 d00Var = (d00) obj;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = h00Var.f46189e;
                    filtersSetupActivity.f41236c.t(filtersSetupActivity.f41234a.T(d00Var));
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
                            M0 = id.M0(2131747467, null);
                            i10 = 0;
                            str = null;
                            i11 = 20;
                            i7 = 0;
                        } catch (Exception e10) {
                            e = e10;
                            org.telegram.messenger.a8.g(e, z10);
                            return z10;
                        }
                    } else {
                        i7 = -120;
                        i10 = -18;
                        M0 = id.M0(2131747468, null);
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
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    int i17 = i10;
                    int i18 = i13;
                    String str2 = str;
                    AlertDialog$Builder w10 = org.telegram.ui.Components.u4.w(context, i7, i11, i17, i12, i14, i18, M0, z9, new jg.a2(ek0Var, intValue, editTextBoldCursor, 13));
                    if (intValue == 8) {
                        w10.h(id.M0(2131747465, str2), new su(27, ek0Var, editTextBoldCursor));
                    }
                    ek0Var.showDialog(w10.f27300a);
                    return true;
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
                }
        }
    }
}
