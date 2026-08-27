package lh;

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
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.k10;
import org.telegram.ui.kt;
import org.telegram.ui.my;
import org.telegram.ui.nl0;
import org.telegram.ui.o10;
import org.telegram.ui.py;
import org.telegram.ui.xm0;

public final class p1 implements View.OnTouchListener {

    public final int f16503a;

    public final Object f16504b;

    public final Object f16505c;

    public p1(int i10, Object obj, Object obj2) {
        this.f16503a = i10;
        this.f16504b = obj;
        this.f16505c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        String string;
        int i11;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        switch (this.f16503a) {
            case 0:
                u1 u1Var = (u1) this.f16504b;
                return kt.q().s(motionEvent, u1Var.f16896b, (ag.p0) this.f16505c, u1Var.f16899f, ((org.telegram.ui.ActionBar.e3) u1Var.f16901r).resourcesProvider);
            case 1:
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.f16504b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f16505c;
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
                org.telegram.ui.Components.a8 a8Var = (org.telegram.ui.Components.a8) this.f16504b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f16505c;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                org.telegram.ui.Components.b8 b8Var = a8Var.f26657n;
                b8Var.D.r(b8Var.f27026n.T(xVar));
                return false;
            case 3:
                cv cvVar = (cv) this.f16504b;
                return kt.q().s(motionEvent, cvVar.h, (jm) this.f16505c, cvVar.J, cvVar.resourcesProvider);
            case 4:
                wx0 wx0Var = (wx0) this.f16504b;
                return kt.q().s(motionEvent, wx0Var.f34366e, (org.telegram.ui.Components.j) this.f16505c, wx0Var.getPreviewDelegate(), wx0Var.f34364b);
            case 5:
                my myVar = (my) this.f16504b;
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) this.f16505c;
                myVar.getClass();
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                py pyVar = myVar.d;
                pyVar.f41444c.r(pyVar.f41443b.T(d4Var));
                return false;
            case 6:
                o10 o10Var = (o10) this.f16504b;
                k10 k10Var = (k10) this.f16505c;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                FiltersSetupActivity filtersSetupActivity = o10Var.f40974e;
                filtersSetupActivity.f35481c.r(filtersSetupActivity.f35479a.T(k10Var));
                return false;
            default:
                xm0 xm0Var = (xm0) this.f16504b;
                Context context = (Context) this.f16505c;
                int i12 = 0;
                if (xm0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.get(1);
                    calendar.get(2);
                    calendar.get(5);
                    try {
                        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                        int iIntValue4 = ((Integer) editTextBoldCursor.getTag()).intValue();
                        if (iIntValue4 == 8) {
                            string = LocaleController.getString(R.string.PassportSelectExpiredDate);
                            i12 = 20;
                            i11 = 0;
                            i10 = 0;
                        } else {
                            i10 = -120;
                            string = LocaleController.getString(R.string.PassportSelectBithdayDate);
                            i11 = -18;
                        }
                        String[] strArrSplit = editTextBoldCursor.getText().toString().split("\\.");
                        if (strArrSplit.length == 3) {
                            iIntValue = Utilities.parseInt((CharSequence) strArrSplit[0]).intValue();
                            iIntValue3 = Utilities.parseInt((CharSequence) strArrSplit[1]).intValue();
                            iIntValue2 = Utilities.parseInt((CharSequence) strArrSplit[2]).intValue();
                        } else {
                            iIntValue = -1;
                            iIntValue2 = -1;
                            iIntValue3 = -1;
                        }
                        AlertDialog$Builder alertDialog$BuilderX = org.telegram.ui.Components.y4.x(context, i10, i12, i11, iIntValue, iIntValue3, iIntValue2, string, iIntValue4 == 8, new c3.d(xm0Var, iIntValue4, editTextBoldCursor, 12));
                        if (iIntValue4 == 8) {
                            alertDialog$BuilderX.h(LocaleController.getString(R.string.PassportSelectNotExpire), new nl0(1, xm0Var, editTextBoldCursor));
                        }
                        xm0Var.showDialog(alertDialog$BuilderX.f22702a);
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    break;
                }
                return true;
        }
    }
}
