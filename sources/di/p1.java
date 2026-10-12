package di;

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
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.e20;
import org.telegram.ui.ez;
import org.telegram.ui.gw;
import org.telegram.ui.hz;
import org.telegram.ui.i20;
import org.telegram.ui.un0;
import org.telegram.ui.xt;
public final class p1 implements View.OnTouchListener {
    public final int f7574a;
    public final Object f7575b;
    public final Object f7576c;

    public p1(int i10, Object obj, Object obj2) {
        this.f7574a = i10;
        this.f7575b = obj;
        this.f7576c = obj2;
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
        switch (this.f7574a) {
            case 0:
                y1 y1Var = (y1) this.f7575b;
                return xt.q().s(motionEvent, y1Var.f8119b, (bi.d) this.f7576c, y1Var.f8121f, r2.J(y1Var.f8123r));
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f7575b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f7576c;
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
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f7575b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f7576c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.m8 m8Var = l8Var.f26975n;
                    m8Var.H.r(m8Var.f27248n.T(xVar));
                    return false;
                }
                return false;
            case 3:
                return ew.n((ew) this.f7575b, (jn) this.f7576c, motionEvent);
            case 4:
                return kz0.a((kz0) this.f7575b, (org.telegram.ui.Components.j) this.f7576c, motionEvent);
            case 5:
                ez ezVar = (ez) this.f7575b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.f7576c;
                ezVar.getClass();
                if (motionEvent.getAction() == 0) {
                    hz hzVar = ezVar.d;
                    hzVar.f36986c.r(hzVar.f36985b.T(g4Var));
                    return false;
                }
                return false;
            case 6:
                i20 i20Var = (i20) this.f7575b;
                e20 e20Var = (e20) this.f7576c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = i20Var.e;
                    filtersSetupActivity.f32090c.r(filtersSetupActivity.f32088a.T(e20Var));
                    return false;
                }
                return false;
            default:
                un0 un0Var = (un0) this.f7575b;
                Context context = (Context) this.f7576c;
                int i15 = 0;
                if (un0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder w9 = org.telegram.ui.Components.g5.w(context, i10, i15, i11, i12, i14, i13, string, z10, new hg.b2(un0Var, intValue, editTextBoldCursor, 15));
                        if (intValue == 8) {
                            w9.h(LocaleController.getString(R.string.PassportSelectNotExpire), new gw(26, un0Var, editTextBoldCursor));
                        }
                        un0Var.showDialog(w9.f19548a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
        }
    }
}
