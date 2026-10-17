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
import org.telegram.ui.Components.gz0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.gt;
import org.telegram.ui.j10;
import org.telegram.ui.ky;
import org.telegram.ui.n10;
import org.telegram.ui.ny;
import org.telegram.ui.ov;
import org.telegram.ui.xm0;
public final class p1 implements View.OnTouchListener {
    public final int f9579a;
    public final Object f9580b;
    public final Object f9581c;

    public p1(int i10, Object obj, Object obj2) {
        this.f9579a = i10;
        this.f9580b = obj;
        this.f9581c = obj2;
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
        switch (this.f9579a) {
            case 0:
                v1 v1Var = (v1) this.f9580b;
                return gt.q().s(motionEvent, v1Var.f9928b, (ai.va) this.f9581c, v1Var.f9930f, n2.J(v1Var.f9932r));
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.f9580b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f9581c;
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
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.f9580b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.f9581c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.k8 k8Var = j8Var.f27440n;
                    k8Var.H.r(k8Var.f27779n.T(xVar));
                    return false;
                }
                return false;
            case 3:
                return aw.n((aw) this.f9580b, (gn) this.f9581c, motionEvent);
            case 4:
                return gz0.a((gz0) this.f9580b, (org.telegram.ui.Components.j) this.f9581c, motionEvent);
            case 5:
                ky kyVar = (ky) this.f9580b;
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) this.f9581c;
                kyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    ny nyVar = kyVar.d;
                    nyVar.f39578c.r(nyVar.f39577b.T(f4Var));
                    return false;
                }
                return false;
            case 6:
                n10 n10Var = (n10) this.f9580b;
                j10 j10Var = (j10) this.f9581c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = n10Var.e;
                    filtersSetupActivity.f33130c.r(filtersSetupActivity.f33128a.T(j10Var));
                    return false;
                }
                return false;
            default:
                xm0 xm0Var = (xm0) this.f9580b;
                Context context = (Context) this.f9581c;
                int i15 = 0;
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
                        AlertDialog$Builder w9 = org.telegram.ui.Components.f5.w(context, i10, i15, i11, i12, i14, i13, string, z10, new hg.b2(xm0Var, intValue, editTextBoldCursor, 15));
                        if (intValue == 8) {
                            w9.h(LocaleController.getString(R.string.PassportSelectNotExpire), new ov(26, xm0Var, editTextBoldCursor));
                        }
                        xm0Var.showDialog(w9.f20601a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
        }
    }
}
