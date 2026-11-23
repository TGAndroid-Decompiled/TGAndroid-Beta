package hi;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.xm;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.aj0;
import org.telegram.ui.f00;
import org.telegram.ui.hk0;
import org.telegram.ui.hx;
import org.telegram.ui.j00;
import org.telegram.ui.kx;
import org.telegram.ui.ns;
public final class o1 implements View.OnTouchListener {
    public final int f15100a;
    public final Object f15101b;
    public final Object f15102c;

    public o1(int i7, Object obj, Object obj2) {
        this.f15100a = i7;
        this.f15101b = obj;
        this.f15102c = obj2;
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
        int i17 = this.f15100a;
        Object obj = this.f15102c;
        Object obj2 = this.f15101b;
        switch (i17) {
            case 0:
                t1 t1Var = (t1) obj2;
                ns p10 = ns.p();
                di.b1 b1Var = t1Var.f15365b;
                p1 p1Var = t1Var.f15368f;
                i2 i2Var = t1Var.f15370r;
                int i18 = i2.C1;
                return p10.r(motionEvent, b1Var, (bi.n8) obj, p1Var, i2Var.J0);
            case 1:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) obj2;
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) obj;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.f8 f8Var = e8Var.f34688n;
                    f8Var.B1.t(f8Var.f35108s1.T(wVar));
                    return false;
                }
                return false;
            case 2:
                dv dvVar = (dv) obj2;
                return ns.p().r(motionEvent, dvVar.f34573r1, (xm) obj, dvVar.I1, dvVar.J0);
            case 3:
                r10 = ns.p().r(motionEvent, r4.f33636e, (org.telegram.ui.Components.o) obj, r4.getPreviewDelegate(), ((ax0) obj2).f33631b);
                return r10;
            case 4:
                hx hxVar = (hx) obj2;
                org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) obj;
                hxVar.getClass();
                if (motionEvent.getAction() == 0) {
                    kx kxVar = hxVar.f48509f;
                    kxVar.f49374c.t(kxVar.f49373b.T(i4Var));
                    return false;
                }
                return false;
            case 5:
                j00 j00Var = (j00) obj2;
                f00 f00Var = (f00) obj;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = j00Var.f48860e;
                    filtersSetupActivity.f43061c.t(filtersSetupActivity.f43059a.T(f00Var));
                    return false;
                }
                return false;
            default:
                hk0 hk0Var = (hk0) obj2;
                Context context = (Context) obj;
                if (hk0Var.getParentActivity() == null) {
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
                            N0 = hd.N0(2131747273, null);
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
                        N0 = hd.N0(2131747274, null);
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
                    AlertDialog$Builder w10 = org.telegram.ui.Components.c5.w(context, i7, i11, i15, i12, i14, i16, N0, z11, new ai.n1(hk0Var, intValue, editTextBoldCursor, 15));
                    if (intValue == 8) {
                        w10.h(hd.N0(2131747271, str2), new aj0(0, hk0Var, editTextBoldCursor));
                    }
                    hk0Var.showDialog(w10.f28743a);
                    return true;
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
                }
        }
    }
}
