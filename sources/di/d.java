package di;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.w2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.io0;
import org.telegram.ui.j9;
import org.telegram.ui.k4;
import org.telegram.ui.rj0;
import org.telegram.ui.sa;
import org.telegram.ui.sn;
import org.telegram.ui.vb;
public final class d implements View.OnTouchListener {
    public final int f8042a;

    public d(int i10) {
        this.f8042a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f8042a) {
            case 0:
                int i10 = r.f8060a0;
                return true;
            case 1:
                int i11 = h3.f20940a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = k4.f38761c1;
                return true;
            case 4:
                int i12 = j9.e;
                return true;
            case 5:
                int i13 = w2.f23895w;
                return true;
            case 6:
                Paint paint = sa.H;
                return true;
            case 7:
                int i14 = vb.Q0;
                return true;
            case 8:
                int i15 = sn.Vc;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = f5.f26167a;
                return true;
            case 11:
                k8 k8Var = k8.Y0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f24050r5;
                return true;
            case 13:
                int i17 = ti.U2;
                return true;
            case 14:
                int i18 = nk.f28969g0;
                return true;
            case 15:
                int i19 = rl.C0;
                return true;
            case 16:
                int i20 = wp.f32282l0;
                return true;
            case 17:
                cv cvVar = cv.S;
                return true;
            case 18:
                int i21 = vz.h;
                return true;
            case 19:
                int[] iArr = pe0.f29524i0;
                return true;
            case 20:
                int i22 = ej0.R;
                return true;
            case 21:
                int i23 = ap0.Y0;
                return true;
            case 22:
                int i24 = ir0.f27405d1;
                return true;
            case 23:
                int[] iArr2 = xv0.f32656g2;
                return true;
            case 24:
                int i25 = ty0.f30926w0;
                return true;
            case 25:
                int i26 = UndoView.f24554i0;
                return true;
            case 26:
                int i27 = UndoView.f24554i0;
                return true;
            case 27:
                int i28 = rj0.f41158e0;
                return true;
            case 28:
                List list = io0.f38285g1;
                return true;
            default:
                int i29 = PopupNotificationActivity.f33787b0;
                return true;
        }
    }
}
