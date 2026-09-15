package bi;

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
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.h8;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.bo;
import org.telegram.ui.ck0;
import org.telegram.ui.h4;
import org.telegram.ui.h9;
import org.telegram.ui.qa;
import org.telegram.ui.ub;
import org.telegram.ui.wo0;
public final class d implements View.OnTouchListener {
    public final int f3561a;

    public d(int i10) {
        this.f3561a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f3561a) {
            case 0:
                int i10 = u.f3585a0;
                return true;
            case 1:
                int i11 = f3.f18643a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = h4.f34107b1;
                return true;
            case 4:
                int i12 = h9.e;
                return true;
            case 5:
                int i13 = x2.f21610w;
                return true;
            case 6:
                Paint paint = qa.H;
                return true;
            case 7:
                int i14 = ub.Q0;
                return true;
            case 8:
                int i15 = bo.Hc;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = c5.f22946a;
                return true;
            case 11:
                h8 h8Var = h8.T0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f21731m5;
                return true;
            case 13:
                int i17 = vi.O2;
                return true;
            case 14:
                int i18 = ok.f26816g0;
                return true;
            case 15:
                int i19 = gl.E0;
                return true;
            case 16:
                int i20 = mp.f26192i0;
                return true;
            case 17:
                vu vuVar = vu.S;
                return true;
            case 18:
                int i21 = mz.h;
                return true;
            case 19:
                int[] iArr = sd0.f27831a0;
                return true;
            case 20:
                int i22 = ei0.R;
                return true;
            case 21:
                int i23 = yn0.X0;
                return true;
            case 22:
                int i24 = hq0.f24747a1;
                return true;
            case 23:
                int[] iArr2 = yu0.f30340d2;
                return true;
            case 24:
                int i25 = vx0.f29453u0;
                return true;
            case 25:
                int i26 = UndoView.f22228e0;
                return true;
            case 26:
                int i27 = UndoView.f22228e0;
                return true;
            case 27:
                int i28 = ck0.f32808d0;
                return true;
            case 28:
                List list = wo0.f39304g1;
                return true;
            default:
                int i29 = PopupNotificationActivity.f31142b0;
                return true;
        }
    }
}
