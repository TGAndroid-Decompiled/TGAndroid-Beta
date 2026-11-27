package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.FiltersSetupActivity;
public final class g8 implements View.OnTouchListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public g8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2;
        String M0;
        int i3;
        int i4;
        int i5;
        int i6;
        lu5 lu5Var;
        byte b = this.a;
        boolean z2 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                n8 n8Var = (n8) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = hl.P;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        n8Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 1:
                i20 i20Var = (i20) obj2;
                k20 k20Var = (k20) obj;
                if (motionEvent.getAction() == 0) {
                    j20 j20Var = i20Var.n;
                    j20Var.A1.s(j20Var.r1.U(k20Var));
                }
                return false;
            case 2:
                ou3 ou3Var = (ou3) obj2;
                bd5 bd5Var = (bd5) obj;
                if (motionEvent.getAction() == 0) {
                    ru3 ru3Var = ou3Var.f;
                    ru3Var.c.s(ru3Var.b.U(bd5Var));
                }
                return false;
            case 3:
                hw3 hw3Var = (hw3) obj2;
                rw2 e = rw2.e();
                gu guVar = hw3Var.b;
                ew3 ew3Var = hw3Var.f;
                zw3 zw3Var = hw3Var.r;
                int i7 = zw3.C1;
                return e.h(motionEvent, guVar, (u) obj, ew3Var, zw3Var.J0);
            case 4:
                ly3 ly3Var = (ly3) obj2;
                return rw2.e().h(motionEvent, ly3Var.q1, (h62) obj, ly3Var.H1, ly3Var.J0);
            case 5:
                ih4 ih4Var = (ih4) obj2;
                eh4 eh4Var = (eh4) obj;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = ih4Var.e;
                    filtersSetupActivity.c.s(filtersSetupActivity.a.U(eh4Var));
                }
                return false;
            case 6:
                b18 b18Var = (b18) obj2;
                Context context = (Context) obj;
                if (b18Var.getParentActivity() == null) {
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
                            i2 = 0;
                            M0 = ob6.M0(2131747194, null);
                            i3 = 20;
                            i = 0;
                        } catch (Exception e2) {
                            e = e2;
                            z = true;
                            cc4.g(e, z);
                            return z;
                        }
                    } else {
                        i = -120;
                        i2 = -18;
                        M0 = ob6.M0(2131747195, null);
                        i3 = 0;
                    }
                    String[] split = editTextBoldCursor.getText().toString().split("\\.");
                    if (split.length == 3) {
                        i4 = Utilities.z(split[0]).intValue();
                        i6 = Utilities.z(split[1]).intValue();
                        i5 = Utilities.z(split[2]).intValue();
                    } else {
                        i4 = -1;
                        i5 = -1;
                        i6 = -1;
                    }
                    if (intValue == 8) {
                        z2 = true;
                    }
                    AlertDialog$Builder w = jj.w(context, i, i3, i2, i4, i6, i5, M0, z2, new bf(b18Var, intValue, editTextBoldCursor, (byte) 13));
                    if (intValue == 8) {
                        w.g(ob6.M0(2131747192, null), new rm6(b18Var, editTextBoldCursor, (byte) 13));
                    }
                    b18Var.showDialog(w.a);
                    return true;
                } catch (Exception e3) {
                    e = e3;
                    z = true;
                }
            case 7:
                q9c q9cVar = (q9c) obj2;
                p3b p3bVar = (p3b) obj;
                if (motionEvent.getAction() == 0 && (lu5Var = q9cVar.h3) != null) {
                    lu5Var.s(q9cVar.U(p3bVar));
                }
                return false;
            default:
                return ((zeb) obj2).f((t39) obj, motionEvent);
        }
    }
}
