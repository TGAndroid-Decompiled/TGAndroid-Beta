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
import org.telegram.ui.Components.jw;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.b20;
import org.telegram.ui.bz;
import org.telegram.ui.mn0;
import org.telegram.ui.nw;
import org.telegram.ui.qt;
import org.telegram.ui.x10;
import org.telegram.ui.yy;
public final class p1 implements View.OnTouchListener {
    public final int f5714a;
    public final Object f5715b;
    public final Object f5716c;

    public p1(int i10, Object obj, Object obj2) {
        this.f5714a = i10;
        this.f5715b = obj;
        this.f5716c = obj2;
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
        switch (this.f5714a) {
            case 0:
                y1 y1Var = (y1) this.f5715b;
                return qt.q().s(motionEvent, y1Var.f6340b, (ai.g) this.f5716c, y1Var.f6343f, r2.J(y1Var.f6345r));
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f5715b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f5716c;
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
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) this.f5715b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f5716c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.l8 l8Var = k8Var.f27981n;
                    l8Var.H.r(l8Var.f28244n.T(xVar));
                    return false;
                }
                return false;
            case 3:
                return jw.o((jw) this.f5715b, (mn) this.f5716c, motionEvent);
            case 4:
                return pz0.a((pz0) this.f5715b, (org.telegram.ui.Components.j) this.f5716c, motionEvent);
            case 5:
                yy yyVar = (yy) this.f5715b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.f5716c;
                yyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    bz bzVar = yyVar.d;
                    bzVar.f36505c.r(bzVar.f36504b.T(g4Var));
                    return false;
                }
                return false;
            case 6:
                b20 b20Var = (b20) this.f5715b;
                x10 x10Var = (x10) this.f5716c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = b20Var.f36279e;
                    filtersSetupActivity.f33824c.r(filtersSetupActivity.f33822a.T(x10Var));
                    return false;
                }
                return false;
            default:
                mn0 mn0Var = (mn0) this.f5715b;
                Context context = (Context) this.f5716c;
                int i15 = 0;
                if (mn0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder w10 = org.telegram.ui.Components.g5.w(context, i10, i15, i11, i12, i14, i13, string, z10, new gg.c2(mn0Var, intValue, editTextBoldCursor, 15));
                        if (intValue == 8) {
                            w10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new nw(24, mn0Var, editTextBoldCursor));
                        }
                        mn0Var.showDialog(w10.f20404a);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                return true;
        }
    }
}
