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
public final class f8 implements View.OnTouchListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public f8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        String M0;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        is5 is5Var;
        byte b = this.a;
        boolean z = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                m8 m8Var = (m8) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = gl.P;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        m8Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 1:
                h20 h20Var = (h20) obj2;
                j20 j20Var = (j20) obj;
                if (motionEvent.getAction() == 0) {
                    i20 i20Var = h20Var.n;
                    i20Var.A1.s(i20Var.r1.T(j20Var));
                }
                return false;
            case 2:
                wt3 wt3Var = (wt3) obj2;
                za5 za5Var = (za5) obj;
                if (motionEvent.getAction() == 0) {
                    zt3 zt3Var = wt3Var.f;
                    zt3Var.c.s(zt3Var.b.T(za5Var));
                }
                return false;
            case 3:
                nv3 nv3Var = (nv3) obj2;
                xv2 e = xv2.e();
                fu fuVar = nv3Var.b;
                kv3 kv3Var = nv3Var.f;
                ew3 ew3Var = nv3Var.r;
                int i7 = ew3.C1;
                return e.h(motionEvent, fuVar, (u) obj, kv3Var, ew3Var.J0);
            case 4:
                qx3 qx3Var = (qx3) obj2;
                return xv2.e().h(motionEvent, qx3Var.q1, (r52) obj, qx3Var.H1, qx3Var.J0);
            case 5:
                kf4 kf4Var = (kf4) obj2;
                ff4 ff4Var = (ff4) obj;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = kf4Var.e;
                    filtersSetupActivity.c.s(filtersSetupActivity.a.T(ff4Var));
                }
                return false;
            case 6:
                vx7 vx7Var = (vx7) obj2;
                Context context = (Context) obj;
                if (vx7Var.getParentActivity() == null) {
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
                        M0 = k96.M0(2131747274, null);
                        i3 = 20;
                        i2 = 0;
                        i = 0;
                    } else {
                        i = -120;
                        M0 = k96.M0(2131747275, null);
                        i2 = -18;
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
                        z = true;
                    }
                    AlertDialog$Builder w = ij.w(context, i, i3, i2, i4, i6, i5, M0, z, new zf(vx7Var, intValue, editTextBoldCursor, (byte) 11));
                    if (intValue == 8) {
                        w.g(k96.M0(2131747272, null), new dx6(vx7Var, editTextBoldCursor, (byte) 8));
                    }
                    vx7Var.showDialog(w.a);
                    return true;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return true;
                }
            case 7:
                q5c q5cVar = (q5c) obj2;
                rza rzaVar = (rza) obj;
                if (motionEvent.getAction() == 0 && (is5Var = q5cVar.h3) != null) {
                    is5Var.s(q5cVar.T(rzaVar));
                }
                return false;
            default:
                return ((dbb) obj2).f((f09) obj, motionEvent);
        }
    }
}
