package bi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xu;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.j4;
import org.telegram.ui.k9;
import org.telegram.ui.ro0;
import org.telegram.ui.ta;
import org.telegram.ui.wb;
import org.telegram.ui.xn;
import org.telegram.ui.yj0;
public final class d implements View.OnTouchListener {
    public final int f3560a;

    public d(int i10) {
        this.f3560a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f3560a) {
            case 0:
                int i10 = u.f3584a0;
                return true;
            case 1:
                int i11 = g3.f18900a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = j4.f34583b1;
                return true;
            case 4:
                int i12 = k9.e;
                return true;
            case 5:
                int i13 = y2.f21868w;
                return true;
            case 6:
                Paint paint = ta.H;
                return true;
            case 7:
                int i14 = wb.Q0;
                return true;
            case 8:
                int i15 = xn.Gc;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = e5.f23875a;
                return true;
            case 11:
                j8 j8Var = j8.T0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f21955n5;
                return true;
            case 13:
                int i17 = wi.H2;
                return true;
            case 14:
                int i18 = qk.f27754g0;
                return true;
            case 15:
                int i19 = il.E0;
                return true;
            case 16:
                int i20 = op.f27159i0;
                return true;
            case 17:
                xu xuVar = xu.S;
                return true;
            case 18:
                int i21 = oz.h;
                return true;
            case 19:
                int[] iArr = ce0.f23302a0;
                return true;
            case 20:
                int i22 = ri0.R;
                return true;
            case 21:
                int i23 = mo0.Z0;
                return true;
            case 22:
                int i24 = vq0.W0;
                return true;
            case 23:
                int[] iArr2 = lv0.f26160d2;
                return true;
            case 24:
                int i25 = hy0.f24930u0;
                return true;
            case 25:
                int i26 = UndoView.f22453e0;
                return true;
            case 26:
                int i27 = UndoView.f22453e0;
                return true;
            case 27:
                int i28 = yj0.f40257d0;
                return true;
            case 28:
                List list = ro0.f37165g1;
                return true;
            default:
                int i29 = PopupNotificationActivity.f31431b0;
                return true;
        }
    }
}
