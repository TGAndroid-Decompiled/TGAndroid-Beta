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
import org.telegram.ui.Components.lz0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.an0;
import org.telegram.ui.ht;
import org.telegram.ui.ks;
import org.telegram.ui.ky;
import org.telegram.ui.l10;
import org.telegram.ui.ny;
import org.telegram.ui.p10;
public final class p1 implements View.OnTouchListener {
    public final int f9591a;
    public final Object f9592b;
    public final Object f9593c;

    public p1(int i10, Object obj, Object obj2) {
        this.f9591a = i10;
        this.f9592b = obj;
        this.f9593c = obj2;
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
        switch (this.f9591a) {
            case 0:
                v1 v1Var = (v1) this.f9592b;
                return ht.o().q(motionEvent, v1Var.f9944b, (ai.xa) this.f9593c, v1Var.f9946f, n2.I(v1Var.f9948r));
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f9592b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f9593c;
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
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f9592b;
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f9593c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.k8 k8Var = j8Var.f27548n;
                    k8Var.G.r(k8Var.f27929n.T(wVar));
                    return false;
                }
                return false;
            case 3:
                return aw.m((aw) this.f9592b, (gn) this.f9593c, motionEvent);
            case 4:
                return lz0.a((lz0) this.f9592b, (org.telegram.ui.Components.j) this.f9593c, motionEvent);
            case 5:
                ky kyVar = (ky) this.f9592b;
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) this.f9593c;
                kyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    ny nyVar = kyVar.f39087f;
                    nyVar.f40006c.r(nyVar.f40005b.T(f4Var));
                    return false;
                }
                return false;
            case 6:
                p10 p10Var = (p10) this.f9592b;
                l10 l10Var = (l10) this.f9593c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = p10Var.e;
                    filtersSetupActivity.f33444c.r(filtersSetupActivity.f33442a.T(l10Var));
                    return false;
                }
                return false;
            default:
                an0 an0Var = (an0) this.f9592b;
                Context context = (Context) this.f9593c;
                int i15 = 0;
                if (an0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder x10 = org.telegram.ui.Components.f5.x(context, i10, i15, i11, i12, i14, i13, string, z10, new hg.b2(an0Var, intValue, editTextBoldCursor, 15));
                        if (intValue == 8) {
                            x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new ks(29, an0Var, editTextBoldCursor));
                        }
                        an0Var.showDialog(x10.f20678a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
        }
    }
}
