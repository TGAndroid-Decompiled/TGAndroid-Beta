package di;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.le0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wp;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.eo0;
import org.telegram.ui.j9;
import org.telegram.ui.l4;
import org.telegram.ui.mj0;
import org.telegram.ui.qn;
import org.telegram.ui.sa;
import org.telegram.ui.vb;
public final class d implements View.OnTouchListener {
    public final int f8035a;

    public d(int i10) {
        this.f8035a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f8035a) {
            case 0:
                int i10 = r.f8053a0;
                return true;
            case 1:
                int i11 = f3.f20804a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = l4.f38728b1;
                return true;
            case 4:
                int i12 = j9.e;
                return true;
            case 5:
                int i13 = x2.f23787w;
                return true;
            case 6:
                Paint paint = sa.H;
                return true;
            case 7:
                int i14 = vb.Q0;
                return true;
            case 8:
                int i15 = qn.Ic;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = f5.f26099a;
                return true;
            case 11:
                k8 k8Var = k8.T0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f23905n5;
                return true;
            case 13:
                int i17 = ti.R2;
                return true;
            case 14:
                int i18 = nk.f28782g0;
                return true;
            case 15:
                int i19 = rl.E0;
                return true;
            case 16:
                int i20 = wp.f32166i0;
                return true;
            case 17:
                cv cvVar = cv.S;
                return true;
            case 18:
                int i21 = vz.h;
                return true;
            case 19:
                int[] iArr = le0.f28188i0;
                return true;
            case 20:
                int i22 = aj0.R;
                return true;
            case 21:
                int i23 = vo0.Y0;
                return true;
            case 22:
                int i24 = er0.f25974b1;
                return true;
            case 23:
                int[] iArr2 = tv0.f30680d2;
                return true;
            case 24:
                int i25 = py0.f29414u0;
                return true;
            case 25:
                int i26 = UndoView.f24403e0;
                return true;
            case 26:
                int i27 = UndoView.f24403e0;
                return true;
            case 27:
                int i28 = mj0.f39285d0;
                return true;
            case 28:
                List list = eo0.f36690g1;
                return true;
            default:
                int i29 = PopupNotificationActivity.f33479b0;
                return true;
        }
    }
}
