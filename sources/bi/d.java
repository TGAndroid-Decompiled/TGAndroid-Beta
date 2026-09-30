package bi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.xu;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.h9;
import org.telegram.ui.i4;
import org.telegram.ui.oo0;
import org.telegram.ui.qa;
import org.telegram.ui.ub;
import org.telegram.ui.wj0;
import org.telegram.ui.wn;
public final class d implements View.OnTouchListener {
    public final int f3558a;

    public d(int i10) {
        this.f3558a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f3558a) {
            case 0:
                int i10 = u.f3582a0;
                return true;
            case 1:
                int i11 = e3.f18854a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = i4.f34366b1;
                return true;
            case 4:
                int i12 = h9.e;
                return true;
            case 5:
                int i13 = y2.f21867w;
                return true;
            case 6:
                Paint paint = qa.H;
                return true;
            case 7:
                int i14 = ub.Q0;
                return true;
            case 8:
                int i15 = wn.Gc;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = e5.f23847a;
                return true;
            case 11:
                j8 j8Var = j8.T0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f21954n5;
                return true;
            case 13:
                int i17 = wi.O2;
                return true;
            case 14:
                int i18 = qk.f27732g0;
                return true;
            case 15:
                int i19 = il.E0;
                return true;
            case 16:
                int i20 = op.f27135i0;
                return true;
            case 17:
                xu xuVar = xu.S;
                return true;
            case 18:
                int i21 = oz.h;
                return true;
            case 19:
                int[] iArr = ee0.f23989a0;
                return true;
            case 20:
                int i22 = ri0.R;
                return true;
            case 21:
                int i23 = no0.Y0;
                return true;
            case 22:
                int i24 = wq0.f30117a1;
                return true;
            case 23:
                int[] iArr2 = lv0.f26102d2;
                return true;
            case 24:
                int i25 = hy0.f24895u0;
                return true;
            case 25:
                int i26 = UndoView.f22452e0;
                return true;
            case 26:
                int i27 = UndoView.f22452e0;
                return true;
            case 27:
                int i28 = wj0.f39377d0;
                return true;
            case 28:
                List list = oo0.f36277g1;
                return true;
            default:
                int i29 = PopupNotificationActivity.f31431b0;
                return true;
        }
    }
}
