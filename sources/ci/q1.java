package ci;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.gn0;
import org.telegram.ui.nt;
import org.telegram.ui.ow;
import org.telegram.ui.v10;
import org.telegram.ui.wy;
import org.telegram.ui.z10;
import org.telegram.ui.zy;
public final class q1 implements View.OnTouchListener {
    public final int f5319a;
    public final Object f5320b;
    public final Object f5321c;

    public q1(int i10, Object obj, Object obj2) {
        this.f5319a = i10;
        this.f5320b = obj;
        this.f5321c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        String string;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f5319a) {
            case 0:
                z1 z1Var = (z1) this.f5320b;
                return nt.q().s(motionEvent, z1Var.f5902b, (ai.g) this.f5321c, z1Var.f5904f, s2.I(z1Var.f5906r));
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f5320b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f5321c;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        m1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 2:
                org.telegram.ui.Components.i8 i8Var = (org.telegram.ui.Components.i8) this.f5320b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f5321c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.j8 j8Var = i8Var.f24970n;
                    j8Var.H.r(j8Var.f25317n.T(xVar));
                    return false;
                }
                return false;
            case 3:
                return tv.m((tv) this.f5320b, (wm) this.f5321c, motionEvent);
            case 4:
                return xy0.a((xy0) this.f5320b, (org.telegram.ui.Components.j) this.f5321c, motionEvent);
            case 5:
                wy wyVar = (wy) this.f5320b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.f5321c;
                wyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    zy zyVar = wyVar.d;
                    zyVar.f40597c.r(zyVar.f40596b.T(g4Var));
                    return false;
                }
                return false;
            case 6:
                z10 z10Var = (z10) this.f5320b;
                v10 v10Var = (v10) this.f5321c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = z10Var.e;
                    filtersSetupActivity.f31088c.r(filtersSetupActivity.f31086a.T(v10Var));
                    return false;
                }
                return false;
            default:
                gn0 gn0Var = (gn0) this.f5320b;
                Context context = (Context) this.f5321c;
                int i15 = 0;
                if (gn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.get(1);
                    calendar.get(2);
                    calendar.get(5);
                    try {
                        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                        int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                        if (intValue == 8) {
                            string = LocaleController.getString(R.string.PassportSelectExpiredDate);
                            i15 = 20;
                            i11 = 0;
                            i10 = 0;
                        } else {
                            i10 = -120;
                            string = LocaleController.getString(R.string.PassportSelectBithdayDate);
                            i11 = -18;
                        }
                        boolean z10 = false;
                        String[] split = editTextBoldCursor.getText().toString().split("\\.");
                        if (split.length == 3) {
                            i12 = Utilities.parseInt((CharSequence) split[0]).intValue();
                            i14 = Utilities.parseInt((CharSequence) split[1]).intValue();
                            i13 = Utilities.parseInt((CharSequence) split[2]).intValue();
                        } else {
                            i12 = -1;
                            i13 = -1;
                            i14 = -1;
                        }
                        if (intValue == 8) {
                            z10 = true;
                        }
                        int i16 = i10;
                        int i17 = i12;
                        AlertDialog$Builder x10 = org.telegram.ui.Components.e5.x(context, i16, i15, i11, i17, i14, i13, string, z10, new gg.d2(gn0Var, intValue, editTextBoldCursor, 15));
                        if (intValue == 8) {
                            x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new ow(23, gn0Var, editTextBoldCursor));
                        }
                        gn0Var.showDialog(x10.f18662a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
        }
    }
}
