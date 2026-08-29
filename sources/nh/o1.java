package nh;

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
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.qm;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.ht;
import org.telegram.ui.j10;
import org.telegram.ui.kl0;
import org.telegram.ui.ly;
import org.telegram.ui.n10;
import org.telegram.ui.oy;
import org.telegram.ui.vm0;
public final class o1 implements View.OnTouchListener {
    public final int f18209a;
    public final Object f18210b;
    public final Object f18211c;

    public o1(int i10, Object obj, Object obj2) {
        this.f18209a = i10;
        this.f18210b = obj;
        this.f18211c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        String string;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f18209a) {
            case 0:
                t1 t1Var = (t1) this.f18210b;
                return ht.q().s(motionEvent, t1Var.f18579b, (bg.o) this.f18211c, t1Var.f18582f, k2.H(t1Var.f18584r));
            case 1:
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.f18210b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f18211c;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        o1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 2:
                org.telegram.ui.Components.f8 f8Var = (org.telegram.ui.Components.f8) this.f18210b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f18211c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.g8 g8Var = f8Var.f28348n;
                    g8Var.D.r(g8Var.f28792n.T(xVar));
                    return false;
                }
                return false;
            case 3:
                return jv.m((jv) this.f18210b, (qm) this.f18211c, motionEvent);
            case 4:
                return fy0.a((fy0) this.f18210b, (org.telegram.ui.Components.k) this.f18211c, motionEvent);
            case 5:
                ly lyVar = (ly) this.f18210b;
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.f18211c;
                lyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    oy oyVar = lyVar.d;
                    oyVar.f41239c.r(oyVar.f41238b.T(e4Var));
                    return false;
                }
                return false;
            case 6:
                n10 n10Var = (n10) this.f18210b;
                j10 j10Var = (j10) this.f18211c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = n10Var.f40685e;
                    filtersSetupActivity.f35545c.r(filtersSetupActivity.f35543a.T(j10Var));
                    return false;
                }
                return false;
            default:
                vm0 vm0Var = (vm0) this.f18210b;
                Context context = (Context) this.f18211c;
                int i15 = 0;
                if (vm0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder x4 = org.telegram.ui.Components.c5.x(context, i16, i15, i11, i17, i14, i13, string, z10, new e3.d(vm0Var, intValue, editTextBoldCursor, 12));
                        if (intValue == 8) {
                            x4.h(LocaleController.getString(R.string.PassportSelectNotExpire), new kl0(1, vm0Var, editTextBoldCursor));
                        }
                        vm0Var.showDialog(x4.f22714a);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                return true;
        }
    }
}
