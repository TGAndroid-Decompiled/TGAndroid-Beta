package ei;

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
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.et;
import org.telegram.ui.h10;
import org.telegram.ui.iy;
import org.telegram.ui.l10;
import org.telegram.ui.ly;
import org.telegram.ui.vm0;
import org.telegram.ui.xu;
public final class p1 implements View.OnTouchListener {
    public final int f9577a;
    public final Object f9578b;
    public final Object f9579c;

    public p1(int i10, Object obj, Object obj2) {
        this.f9577a = i10;
        this.f9578b = obj;
        this.f9579c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        String string;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        switch (this.f9577a) {
            case 0:
                v1 v1Var = (v1) this.f9578b;
                return et.q().s(motionEvent, v1Var.f9927b, (ai.wa) this.f9579c, v1Var.f9929f, n2.J(v1Var.f9931r));
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f9578b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f9579c;
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
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f9578b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f9579c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.k8 k8Var = j8Var.f27424n;
                    k8Var.H.r(k8Var.f27790n.T(xVar));
                    return false;
                }
                return false;
            case 3:
                return aw.n((aw) this.f9578b, (gn) this.f9579c, motionEvent);
            case 4:
                return iz0.a((iz0) this.f9578b, (org.telegram.ui.Components.j) this.f9579c, motionEvent);
            case 5:
                iy iyVar = (iy) this.f9578b;
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) this.f9579c;
                iyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    ly lyVar = iyVar.d;
                    lyVar.f39044c.r(lyVar.f39043b.T(f4Var));
                    return false;
                }
                return false;
            case 6:
                l10 l10Var = (l10) this.f9578b;
                h10 h10Var = (h10) this.f9579c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = l10Var.e;
                    filtersSetupActivity.f33142c.r(filtersSetupActivity.f33140a.T(h10Var));
                    return false;
                }
                return false;
            default:
                vm0 vm0Var = (vm0) this.f9578b;
                Context context = (Context) this.f9579c;
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
                            z10 = false;
                            string = LocaleController.getString(R.string.PassportSelectExpiredDate);
                            i11 = 0;
                            i15 = 20;
                            i10 = 0;
                        } else {
                            i10 = -120;
                            string = LocaleController.getString(R.string.PassportSelectBithdayDate);
                            i11 = -18;
                            z10 = false;
                        }
                        String[] split = editTextBoldCursor.getText().toString().split("\\.");
                        if (split.length == 3) {
                            i12 = Utilities.parseInt((CharSequence) split[z10 ? 1 : 0]).intValue();
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
                        AlertDialog$Builder w9 = org.telegram.ui.Components.f5.w(context, i10, i15, i11, i12, i14, i13, string, z10, new hg.b2(vm0Var, intValue, editTextBoldCursor, 15));
                        if (intValue == 8) {
                            w9.h(LocaleController.getString(R.string.PassportSelectNotExpire), new xu(27, vm0Var, editTextBoldCursor));
                        }
                        vm0Var.showDialog(w9.f20605a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
        }
    }
}
