package fi;

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
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.af0;
import org.telegram.ui.ft;
import org.telegram.ui.in0;
import org.telegram.ui.iy;
import org.telegram.ui.l10;
import org.telegram.ui.ly;
import org.telegram.ui.p10;
public final class o1 implements View.OnTouchListener {
    public final int f11332a;
    public final Object f11333b;
    public final Object f11334c;

    public o1(int i10, Object obj, Object obj2) {
        this.f11332a = i10;
        this.f11333b = obj;
        this.f11334c = obj2;
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
        switch (this.f11332a) {
            case 0:
                u1 u1Var = (u1) this.f11333b;
                return ft.o().q(motionEvent, u1Var.f11742b, (ai.k) this.f11334c, u1Var.f11744f, l2.I(u1Var.f11746r));
            case 1:
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.f11333b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f11334c;
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
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) this.f11333b;
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f11334c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.m8 m8Var = l8Var.f30100n;
                    m8Var.G.t(m8Var.f30435n.T(wVar));
                    return false;
                }
                return false;
            case 3:
                return aw.m((aw) this.f11333b, (hn) this.f11334c, motionEvent);
            case 4:
                return tz0.a((tz0) this.f11333b, (org.telegram.ui.Components.j) this.f11334c, motionEvent);
            case 5:
                iy iyVar = (iy) this.f11333b;
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) this.f11334c;
                iyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    ly lyVar = iyVar.f40365f;
                    lyVar.f41391c.t(lyVar.f41390b.T(k4Var));
                    return false;
                }
                return false;
            case 6:
                p10 p10Var = (p10) this.f11333b;
                l10 l10Var = (l10) this.f11334c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = p10Var.e;
                    filtersSetupActivity.f35507c.t(filtersSetupActivity.f35505a.T(l10Var));
                    return false;
                }
                return false;
            default:
                in0 in0Var = (in0) this.f11333b;
                Context context = (Context) this.f11334c;
                int i15 = 0;
                if (in0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder w10 = org.telegram.ui.Components.g5.w(context, i10, i15, i11, i12, i14, i13, string, z10, new i2.z(in0Var, intValue, editTextBoldCursor, 16));
                        if (intValue == 8) {
                            w10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new af0(3, in0Var, editTextBoldCursor));
                        }
                        in0Var.showDialog(w10.f22366a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
        }
    }
}
