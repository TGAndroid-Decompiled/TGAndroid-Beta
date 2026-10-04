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
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.ym;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.az;
import org.telegram.ui.d20;
import org.telegram.ui.dz;
import org.telegram.ui.kn0;
import org.telegram.ui.pw;
import org.telegram.ui.rt;
import org.telegram.ui.z10;
public final class q1 implements View.OnTouchListener {
    public final int f5732a;
    public final Object f5733b;
    public final Object f5734c;

    public q1(int i10, Object obj, Object obj2) {
        this.f5732a = i10;
        this.f5733b = obj;
        this.f5734c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        String string;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f5732a) {
            case 0:
                z1 z1Var = (z1) this.f5733b;
                return rt.q().s(motionEvent, z1Var.f6360b, (ai.g) this.f5734c, z1Var.f6363f, s2.G(z1Var.f6365r));
            case 1:
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.f5733b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f5734c;
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
                org.telegram.ui.Components.i8 i8Var = (org.telegram.ui.Components.i8) this.f5733b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f5734c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.j8 j8Var = i8Var.f27329n;
                    j8Var.H.r(j8Var.f27637n.T(xVar));
                    return false;
                }
                return false;
            case 3:
                return wv.m((wv) this.f5733b, (ym) this.f5734c, motionEvent);
            case 4:
                return iz0.a((iz0) this.f5733b, (org.telegram.ui.Components.j) this.f5734c, motionEvent);
            case 5:
                az azVar = (az) this.f5733b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.f5734c;
                azVar.getClass();
                if (motionEvent.getAction() == 0) {
                    dz dzVar = azVar.d;
                    dzVar.f35863c.r(dzVar.f35862b.T(g4Var));
                    return false;
                }
                return false;
            case 6:
                d20 d20Var = (d20) this.f5733b;
                z10 z10Var = (z10) this.f5734c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = d20Var.f35621e;
                    filtersSetupActivity.f33752c.r(filtersSetupActivity.f33750a.T(z10Var));
                    return false;
                }
                return false;
            default:
                kn0 kn0Var = (kn0) this.f5733b;
                Context context = (Context) this.f5734c;
                int i15 = 0;
                if (kn0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder x10 = org.telegram.ui.Components.e5.x(context, i16, i15, i11, i17, i14, i13, string, z10, new gg.d2(kn0Var, intValue, editTextBoldCursor, 15));
                        if (intValue == 8) {
                            x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new pw(24, kn0Var, editTextBoldCursor));
                        }
                        kn0Var.showDialog(x10.f20367a);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                return true;
        }
    }
}
