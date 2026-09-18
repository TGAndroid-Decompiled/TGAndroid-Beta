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
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.vm;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.a20;
import org.telegram.ui.az;
import org.telegram.ui.dz;
import org.telegram.ui.e20;
import org.telegram.ui.pn0;
import org.telegram.ui.st;
import org.telegram.ui.z10;
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
                return st.q().s(motionEvent, z1Var.f5856b, (ai.g) this.f5333c, z1Var.f5858f, t2.I(z1Var.f5860r));
            case 1:
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.f5332b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f5333c;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        n1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 2:
                org.telegram.ui.Components.i8 i8Var = (org.telegram.ui.Components.i8) this.f5332b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f5333c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.j8 j8Var = i8Var.f24867n;
                    j8Var.H.r(j8Var.f25215n.U(xVar));
                    return false;
                }
                return false;
            case 3:
                return sv.m((sv) this.f5332b, (vm) this.f5333c, motionEvent);
            case 4:
                return zy0.a((zy0) this.f5332b, (org.telegram.ui.Components.j) this.f5333c, motionEvent);
            case 5:
                az azVar = (az) this.f5332b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.f5333c;
                azVar.getClass();
                if (motionEvent.getAction() == 0) {
                    dz dzVar = azVar.d;
                    dzVar.f33125c.r(dzVar.f33124b.U(g4Var));
                    return false;
                }
                return false;
            case 6:
                e20 e20Var = (e20) this.f5332b;
                a20 a20Var = (a20) this.f5333c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = e20Var.e;
                    filtersSetupActivity.f31045c.r(filtersSetupActivity.f31043a.U(a20Var));
                    return false;
                }
                return false;
            default:
                pn0 pn0Var = (pn0) this.f5332b;
                Context context = (Context) this.f5333c;
                int i15 = 0;
                if (pn0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder x10 = org.telegram.ui.Components.e5.x(context, i16, i15, i11, i17, i14, i13, string, z10, new gg.d2(pn0Var, intValue, editTextBoldCursor, 14));
                        if (intValue == 8) {
                            x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new z10(22, pn0Var, editTextBoldCursor));
                        }
                        pn0Var.showDialog(x10.f18622a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
        }
    }
}
