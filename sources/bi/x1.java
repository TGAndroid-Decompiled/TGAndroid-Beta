package bi;

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
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.b20;
import org.telegram.ui.cz;
import org.telegram.ui.f20;
import org.telegram.ui.fz;
import org.telegram.ui.l80;
import org.telegram.ui.on0;
import org.telegram.ui.tt;
public final class x1 implements View.OnTouchListener {
    public final int f3865a;
    public final Object f3866b;
    public final Object f3867c;

    public x1(int i10, Object obj, Object obj2) {
        this.f3865a = i10;
        this.f3866b = obj;
        this.f3867c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        String string;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f3865a) {
            case 0:
                k2 k2Var = (k2) this.f3866b;
                return tt.q().s(motionEvent, k2Var.f2980b, (ai.g) this.f3867c, k2Var.f2982f, f3.I(k2Var.f2984r));
            case 1:
                org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.f3866b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f3867c;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        p1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 2:
                org.telegram.ui.Components.i8 i8Var = (org.telegram.ui.Components.i8) this.f3866b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f3867c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.j8 j8Var = i8Var.f23923n;
                    j8Var.H.r(j8Var.f24291n.T(xVar));
                    return false;
                }
                return false;
            case 3:
                return wv.m((wv) this.f3866b, (cn) this.f3867c, motionEvent);
            case 4:
                return zy0.a((zy0) this.f3866b, (org.telegram.ui.Components.k) this.f3867c, motionEvent);
            case 5:
                cz czVar = (cz) this.f3866b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.f3867c;
                czVar.getClass();
                if (motionEvent.getAction() == 0) {
                    fz fzVar = czVar.d;
                    fzVar.f32938c.r(fzVar.f32937b.T(g4Var));
                    return false;
                }
                return false;
            case 6:
                f20 f20Var = (f20) this.f3866b;
                b20 b20Var = (b20) this.f3867c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = f20Var.e;
                    filtersSetupActivity.f29914c.r(filtersSetupActivity.f29912a.T(b20Var));
                    return false;
                }
                return false;
            default:
                on0 on0Var = (on0) this.f3866b;
                Context context = (Context) this.f3867c;
                int i15 = 0;
                if (on0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder x10 = org.telegram.ui.Components.d5.x(context, i16, i15, i11, i17, i14, i13, string, z10, new fg.e2(on0Var, intValue, editTextBoldCursor, 14));
                        if (intValue == 8) {
                            x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new l80(17, on0Var, editTextBoldCursor));
                        }
                        on0Var.showDialog(x10.f17528a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
        }
    }
}
