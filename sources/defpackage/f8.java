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
        int i2;
        String M0;
        int i3;
        int i4;
        int i5;
        int i6;
        hu5 hu5Var;
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
                    RectF rectF = gm.P;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        m8Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 1:
                h30 h30Var = (h30) obj2;
                j30 j30Var = (j30) obj;
                if (motionEvent.getAction() == 0) {
                    i30 i30Var = h30Var.n;
                    i30Var.A1.s(i30Var.r1.T(j30Var));
                }
                return false;
            case 2:
                hv3 hv3Var = (hv3) obj2;
                xc5 xc5Var = (xc5) obj;
                if (motionEvent.getAction() == 0) {
                    kv3 kv3Var = hv3Var.f;
                    kv3Var.c.s(kv3Var.b.T(xc5Var));
                }
                return false;
            case 3:
                yw3 yw3Var = (yw3) obj2;
                hx2 e = hx2.e();
                fv fvVar = yw3Var.b;
                vw3 vw3Var = yw3Var.f;
                px3 px3Var = yw3Var.r;
                int i7 = px3.C1;
                return e.h(motionEvent, fvVar, (u) obj, vw3Var, px3Var.J0);
            case 4:
                az3 az3Var = (az3) obj2;
                return hx2.e().h(motionEvent, az3Var.q1, (c72) obj, az3Var.H1, az3Var.J0);
            case 5:
                lh4 lh4Var = (lh4) obj2;
                hh4 hh4Var = (hh4) obj;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = lh4Var.e;
                    filtersSetupActivity.c.s(filtersSetupActivity.a.T(hh4Var));
                }
                return false;
            case 6:
                xz7 xz7Var = (xz7) obj2;
                Context context = (Context) obj;
                if (xz7Var.getParentActivity() == null) {
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
                        i2 = 0;
                        M0 = jb6.M0(2131747200, null);
                        i3 = 20;
                        i = 0;
                    } else {
                        i = -120;
                        i2 = -18;
                        M0 = jb6.M0(2131747201, null);
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
                    AlertDialog$Builder w = ik.w(context, i, i3, i2, i4, i6, i5, M0, z, new yg(xz7Var, intValue, editTextBoldCursor, (byte) 12));
                    if (intValue == 8) {
                        w.g(jb6.M0(2131747198, null), new cz6(xz7Var, editTextBoldCursor, (byte) 9));
                    }
                    xz7Var.showDialog(w.a);
                    return true;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return true;
                }
            case 7:
                q7c q7cVar = (q7c) obj2;
                s1b s1bVar = (s1b) obj;
                if (motionEvent.getAction() == 0 && (hu5Var = q7cVar.h3) != null) {
                    hu5Var.s(q7cVar.T(s1bVar));
                }
                return false;
            default:
                return ((fdb) obj2).f((s19) obj, motionEvent);
        }
    }
}
