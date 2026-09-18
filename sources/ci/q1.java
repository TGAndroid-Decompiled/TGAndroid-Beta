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
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.vm;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.b20;
import org.telegram.ui.cz;
import org.telegram.ui.f20;
import org.telegram.ui.fz;
import org.telegram.ui.g20;
import org.telegram.ui.qn0;
import org.telegram.ui.ut;
public final class q1 implements View.OnTouchListener {
    public final int f5331a;
    public final Object f5332b;
    public final Object f5333c;

    public q1(int i10, Object obj, Object obj2) {
        this.f5331a = i10;
        this.f5332b = obj;
        this.f5333c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        String string;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f5331a) {
            case 0:
                z1 z1Var = (z1) this.f5332b;
                return ut.q().s(motionEvent, z1Var.f5856b, (ai.g) this.f5333c, z1Var.f5858f, t2.I(z1Var.f5860r));
            case 1:
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.f5332b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f5333c;
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
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.f5332b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f5333c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.h8 h8Var = g8Var.f24114n;
                    h8Var.H.r(h8Var.f24561n.U(xVar));
                    return false;
                }
                return false;
            case 3:
                return sv.m((sv) this.f5332b, (vm) this.f5333c, motionEvent);
            case 4:
                return oy0.a((oy0) this.f5332b, (org.telegram.ui.Components.j) this.f5333c, motionEvent);
            case 5:
                cz czVar = (cz) this.f5332b;
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) this.f5333c;
                czVar.getClass();
                if (motionEvent.getAction() == 0) {
                    fz fzVar = czVar.d;
                    fzVar.f33798c.r(fzVar.f33797b.U(f4Var));
                    return false;
                }
                return false;
            case 6:
                g20 g20Var = (g20) this.f5332b;
                b20 b20Var = (b20) this.f5333c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = g20Var.e;
                    filtersSetupActivity.f30818c.r(filtersSetupActivity.f30816a.U(b20Var));
                    return false;
                }
                return false;
            default:
                qn0 qn0Var = (qn0) this.f5332b;
                Context context = (Context) this.f5333c;
                int i15 = 0;
                if (qn0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder x10 = org.telegram.ui.Components.c5.x(context, i16, i15, i11, i17, i14, i13, string, z10, new gg.d2(qn0Var, intValue, editTextBoldCursor, 14));
                        if (intValue == 8) {
                            x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new f20(21, qn0Var, editTextBoldCursor));
                        }
                        qn0Var.showDialog(x10.f18447a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
        }
    }
}
