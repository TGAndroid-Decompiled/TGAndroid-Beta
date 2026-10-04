package bi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.Components.zu;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ak0;
import org.telegram.ui.i4;
import org.telegram.ui.j9;
import org.telegram.ui.sa;
import org.telegram.ui.so0;
import org.telegram.ui.wb;
import org.telegram.ui.yn;
public final class d implements View.OnTouchListener {
    public final int f3846a;

    public d(int i10) {
        this.f3846a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f3846a) {
            case 0:
                int i10 = u.f3872a0;
                return true;
            case 1:
                int i11 = f3.f20604a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = i4.f37231b1;
                return true;
            case 4:
                int i12 = j9.f37602e;
                return true;
            case 5:
                int i13 = y2.f23748w;
                return true;
            case 6:
                Paint paint = sa.H;
                return true;
            case 7:
                int i14 = wb.Q0;
                return true;
            case 8:
                int i15 = yn.Bc;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = e5.f25914a;
                return true;
            case 11:
                j8 j8Var = j8.T0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f23847n5;
                return true;
            case 13:
                int i17 = xi.H2;
                return true;
            case 14:
                int i18 = rk.f30425g0;
                return true;
            case 15:
                int i19 = jl.E0;
                return true;
            case 16:
                int i20 = pp.f29681i0;
                return true;
            case 17:
                zu zuVar = zu.S;
                return true;
            case 18:
                int i21 = pz.h;
                return true;
            case 19:
                int[] iArr = ee0.f26051a0;
                return true;
            case 20:
                int i22 = ri0.R;
                return true;
            case 21:
                int i23 = qo0.Z0;
                return true;
            case 22:
                int i24 = zq0.W0;
                return true;
            case 23:
                int[] iArr2 = pv0.f29748d2;
                return true;
            case 24:
                int i25 = qy0.f30185u0;
                return true;
            case 25:
                int i26 = UndoView.f24368e0;
                return true;
            case 26:
                int i27 = UndoView.f24368e0;
                return true;
            case 27:
                int i28 = ak0.f34839d0;
                return true;
            case 28:
                List list = so0.f40538g1;
                return true;
            default:
                int i29 = PopupNotificationActivity.f34103b0;
                return true;
        }
    }
}
