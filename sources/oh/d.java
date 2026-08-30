package oh;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.i9;
import org.telegram.ui.jo0;
import org.telegram.ui.l4;
import org.telegram.ui.pa;
import org.telegram.ui.sb;
import org.telegram.ui.sj0;
import org.telegram.ui.xn;
public final class d implements View.OnTouchListener {
    public final int f16584a;

    public d(int i10) {
        this.f16584a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f16584a) {
            case 0:
                int i10 = r.U;
                return true;
            case 1:
                int i11 = g3.f19712a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = l4.Y0;
                return true;
            case 4:
                int i12 = i9.e;
                return true;
            case 5:
                int i13 = x2.f22568w;
                return true;
            case 6:
                Paint paint = pa.E;
                return true;
            case 7:
                int i14 = sb.U0;
                return true;
            case 8:
                int i15 = xn.Ec;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = z4.f31230a;
                return true;
            case 11:
                c8 c8Var = c8.Q0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f22729j5;
                return true;
            case 13:
                int i17 = li.L2;
                return true;
            case 14:
                int i18 = hk.f25429d0;
                return true;
            case 15:
                int i19 = al.B0;
                return true;
            case 16:
                int i20 = kp.f26335f0;
                return true;
            case 17:
                pu puVar = pu.P;
                return true;
            case 18:
                int i21 = mz.h;
                return true;
            case 19:
                int[] iArr = vd0.U;
                return true;
            case 20:
                int i22 = li0.O;
                return true;
            case 21:
                int i23 = do0.U0;
                return true;
            case 22:
                int i24 = lq0.X0;
                return true;
            case 23:
                int[] iArr2 = yu0.a2;
                return true;
            case 24:
                int i25 = xx0.f30766r0;
                return true;
            case 25:
                int i26 = UndoView.f23212b0;
                return true;
            case 26:
                int i27 = UndoView.f23212b0;
                return true;
            case 27:
                int i28 = sj0.f38385a0;
                return true;
            case 28:
                List list = jo0.f35386d1;
                return true;
            default:
                int i29 = PopupNotificationActivity.Y;
                return true;
        }
    }
}
