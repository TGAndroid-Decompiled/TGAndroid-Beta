package kh;

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
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.h10;
import org.telegram.ui.ht;
import org.telegram.ui.jy;
import org.telegram.ui.l10;
import org.telegram.ui.my;
import org.telegram.ui.nl0;
import org.telegram.ui.wm0;
public final class r1 implements View.OnTouchListener {
    public final int f15920a;
    public final Object f15921b;
    public final Object f15922c;

    public r1(int i9, Object obj, Object obj2) {
        this.f15920a = i9;
        this.f15921b = obj;
        this.f15922c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i9;
        String string;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f15920a) {
            case 0:
                w1 w1Var = (w1) this.f15921b;
                return ht.q().s(motionEvent, w1Var.f16228b, (eh.j) this.f15922c, w1Var.f16231f, n2.H(w1Var.f16233r));
            case 1:
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.f15921b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f15922c;
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
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.f15921b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f15922c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.c8 c8Var = b8Var.f27070n;
                    c8Var.D.r(c8Var.f27394n.T(xVar));
                    return false;
                }
                return false;
            case 3:
                return dv.m((dv) this.f15921b, (mm) this.f15922c, motionEvent);
            case 4:
                return ux0.a((ux0) this.f15921b, (org.telegram.ui.Components.j) this.f15922c, motionEvent);
            case 5:
                jy jyVar = (jy) this.f15921b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.f15922c;
                jyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    my myVar = jyVar.d;
                    myVar.f40548c.r(myVar.f40547b.T(g4Var));
                    return false;
                }
                return false;
            case 6:
                l10 l10Var = (l10) this.f15921b;
                h10 h10Var = (h10) this.f15922c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = l10Var.f39968e;
                    filtersSetupActivity.f35478c.r(filtersSetupActivity.f35476a.T(h10Var));
                    return false;
                }
                return false;
            default:
                wm0 wm0Var = (wm0) this.f15921b;
                Context context = (Context) this.f15922c;
                int i14 = 0;
                if (wm0Var.getParentActivity() == null) {
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
                            i14 = 20;
                            i10 = 0;
                            i9 = 0;
                        } else {
                            i9 = -120;
                            string = LocaleController.getString(R.string.PassportSelectBithdayDate);
                            i10 = -18;
                        }
                        boolean z10 = false;
                        String[] split = editTextBoldCursor.getText().toString().split("\\.");
                        if (split.length == 3) {
                            i11 = Utilities.parseInt((CharSequence) split[0]).intValue();
                            i13 = Utilities.parseInt((CharSequence) split[1]).intValue();
                            i12 = Utilities.parseInt((CharSequence) split[2]).intValue();
                        } else {
                            i11 = -1;
                            i12 = -1;
                            i13 = -1;
                        }
                        if (intValue == 8) {
                            z10 = true;
                        }
                        int i15 = i9;
                        int i16 = i11;
                        AlertDialog$Builder x10 = org.telegram.ui.Components.y4.x(context, i15, i14, i10, i16, i13, i12, string, z10, new c3.e(wm0Var, intValue, editTextBoldCursor, 13));
                        if (intValue == 8) {
                            x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new nl0(1, wm0Var, editTextBoldCursor));
                        }
                        wm0Var.showDialog(x10.f22702a);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                return true;
        }
    }
}
