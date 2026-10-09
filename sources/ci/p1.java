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
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.c20;
import org.telegram.ui.cz;
import org.telegram.ui.nn0;
import org.telegram.ui.rt;
import org.telegram.ui.rw;
import org.telegram.ui.y10;
import org.telegram.ui.zy;
public final class p1 implements View.OnTouchListener {
    public final int f5715a;
    public final Object f5716b;
    public final Object f5717c;

    public p1(int i10, Object obj, Object obj2) {
        this.f5715a = i10;
        this.f5716b = obj;
        this.f5717c = obj2;
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
        switch (this.f5715a) {
            case 0:
                y1 y1Var = (y1) this.f5716b;
                return rt.q().s(motionEvent, y1Var.f6341b, (ai.g) this.f5717c, y1Var.f6344f, r2.J(y1Var.f6346r));
            case 1:
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.f5716b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f5717c;
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
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) this.f5716b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f5717c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.l8 l8Var = k8Var.f27872n;
                    l8Var.H.r(l8Var.f28347n.T(xVar));
                    return false;
                }
                return false;
            case 3:
                return iw.o((iw) this.f5716b, (mn) this.f5717c, motionEvent);
            case 4:
                return oz0.a((oz0) this.f5716b, (org.telegram.ui.Components.j) this.f5717c, motionEvent);
            case 5:
                zy zyVar = (zy) this.f5716b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.f5717c;
                zyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    cz czVar = zyVar.d;
                    czVar.f36753c.r(czVar.f36752b.T(g4Var));
                    return false;
                }
                return false;
            case 6:
                c20 c20Var = (c20) this.f5716b;
                y10 y10Var = (y10) this.f5717c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = c20Var.f36499e;
                    filtersSetupActivity.f33762c.r(filtersSetupActivity.f33760a.T(y10Var));
                    return false;
                }
                return false;
            default:
                nn0 nn0Var = (nn0) this.f5716b;
                Context context = (Context) this.f5717c;
                int i15 = 0;
                if (nn0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder w10 = org.telegram.ui.Components.g5.w(context, i10, i15, i11, i12, i14, i13, string, z10, new gg.c2(nn0Var, intValue, editTextBoldCursor, 15));
                        if (intValue == 8) {
                            w10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new rw(23, nn0Var, editTextBoldCursor));
                        }
                        nn0Var.showDialog(w10.f20374a);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                return true;
        }
    }
}
