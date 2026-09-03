package oh;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Cells.w2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.k9;
import org.telegram.ui.lo0;
import org.telegram.ui.n4;
import org.telegram.ui.ra;
import org.telegram.ui.ub;
import org.telegram.ui.uj0;
import org.telegram.ui.zn;
public final class d implements View.OnTouchListener {
    public final int f16564a;

    public d(int i10) {
        this.f16564a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f16564a) {
            case 0:
                int i10 = r.U;
                return true;
            case 1:
                int i11 = g3.f19687a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = n4.Y0;
                return true;
            case 4:
                int i12 = k9.e;
                return true;
            case 5:
                int i13 = w2.f22492w;
                return true;
            case 6:
                Paint paint = ra.E;
                return true;
            case 7:
                int i14 = ub.U0;
                return true;
            case 8:
                int i15 = zn.Ec;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = z4.f31242a;
                return true;
            case 11:
                c8 c8Var = c8.Q0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f22702j5;
                return true;
            case 13:
                int i17 = li.L2;
                return true;
            case 14:
                int i18 = hk.f25431d0;
                return true;
            case 15:
                int i19 = al.B0;
                return true;
            case 16:
                int i20 = jp.f26005f0;
                return true;
            case 17:
                ou ouVar = ou.P;
                return true;
            case 18:
                int i21 = mz.h;
                return true;
            case 19:
                int[] iArr = wd0.U;
                return true;
            case 20:
                int i22 = mi0.O;
                return true;
            case 21:
                int i23 = co0.U0;
                return true;
            case 22:
                int i24 = lq0.X0;
                return true;
            case 23:
                int[] iArr2 = yu0.a2;
                return true;
            case 24:
                int i25 = xx0.f30748r0;
                return true;
            case 25:
                int i26 = UndoView.f23185b0;
                return true;
            case 26:
                int i27 = UndoView.f23185b0;
                return true;
            case 27:
                int i28 = uj0.f38867a0;
                return true;
            case 28:
                List list = lo0.f35813d1;
                return true;
            default:
                int i29 = PopupNotificationActivity.Y;
                return true;
        }
    }
}
