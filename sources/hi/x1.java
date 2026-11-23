package hi;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.vm;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.e00;
import org.telegram.ui.fk0;
import org.telegram.ui.gx;
import org.telegram.ui.i00;
import org.telegram.ui.jx;
import org.telegram.ui.ns;
import org.telegram.ui.yi0;
public final class x1 implements View.OnTouchListener {
    public final int f15703a;
    public final Object f15704b;
    public final Object f15705c;

    public x1(int i7, Object obj, Object obj2) {
        this.f15703a = i7;
        this.f15704b = obj;
        this.f15705c = obj2;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean r10;
        boolean z10;
        int i7;
        int i10;
        String N0;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        int i17 = this.f15703a;
        Object obj = this.f15705c;
        Object obj2 = this.f15704b;
        switch (i17) {
            case 0:
                b2 b2Var = (b2) obj2;
                ns p10 = ns.p();
                di.b1 b1Var = b2Var.f14215b;
                y1 y1Var = b2Var.f14218f;
                r2 r2Var = b2Var.f14220r;
                int i18 = r2.D1;
                return p10.r(motionEvent, b1Var, (bi.n8) obj, y1Var, r2Var.J0);
            case 1:
                org.telegram.ui.Components.d8 d8Var = (org.telegram.ui.Components.d8) obj2;
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) obj;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.e8 e8Var = d8Var.f34233n;
                    e8Var.B1.t(e8Var.f34614s1.T(wVar));
                    return false;
                }
                return false;
            case 2:
                bv bvVar = (bv) obj2;
                return ns.p().r(motionEvent, bvVar.f33820r1, (vm) obj, bvVar.I1, bvVar.J0);
            case 3:
                r10 = ns.p().r(motionEvent, r4.f43061e, (org.telegram.ui.Components.n) obj, r4.getPreviewDelegate(), ((zw0) obj2).f43056b);
                return r10;
            case 4:
                gx gxVar = (gx) obj2;
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) obj;
                gxVar.getClass();
                if (motionEvent.getAction() == 0) {
                    jx jxVar = gxVar.f48372f;
                    jxVar.f49221c.t(jxVar.f49220b.T(i4Var));
                    return false;
                }
                return false;
            case 5:
                i00 i00Var = (i00) obj2;
                e00 e00Var = (e00) obj;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = i00Var.f48676e;
                    filtersSetupActivity.f43171c.t(filtersSetupActivity.f43169a.T(e00Var));
                    return false;
                }
                return false;
            default:
                fk0 fk0Var = (fk0) obj2;
                Context context = (Context) obj;
                if (fk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.get(1);
                calendar.get(2);
                calendar.get(5);
                try {
                    EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                    int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                    if (intValue == 8) {
                        try {
                            i10 = 0;
                            N0 = gd.N0(2131747273, null);
                            str = null;
                            i11 = 20;
                            i7 = 0;
                        } catch (Exception e10) {
                            e = e10;
                            z10 = true;
                            org.telegram.messenger.a8.g(e, z10);
                            return z10;
                        }
                    } else {
                        i7 = -120;
                        i10 = -18;
                        N0 = gd.N0(2131747274, null);
                        str = null;
                        i11 = 0;
                    }
                    String[] split = editTextBoldCursor.getText().toString().split("\\.");
                    if (split.length == 3) {
                        i12 = Utilities.z(split[0]).intValue();
                        i14 = Utilities.z(split[1]).intValue();
                        i13 = Utilities.z(split[2]).intValue();
                    } else {
                        i12 = -1;
                        i13 = -1;
                        i14 = -1;
                    }
                    if (intValue == 8) {
                        i15 = i10;
                        i16 = i13;
                        z11 = true;
                    } else {
                        i15 = i10;
                        i16 = i13;
                        z11 = false;
                    }
                    String str2 = str;
                    AlertDialog$Builder w10 = org.telegram.ui.Components.b5.w(context, i7, i11, i15, i12, i14, i16, N0, z11, new ai.o1(fk0Var, intValue, editTextBoldCursor, 15));
                    if (intValue == 8) {
                        w10.h(gd.N0(2131747271, str2), new yi0(0, fk0Var, editTextBoldCursor));
                    }
                    fk0Var.showDialog(w10.f28835a);
                    return true;
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
                }
        }
    }
}
