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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.k8;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wo0;
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
                int i11 = f3.f20807a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = l4.f38734b1;
                return true;
            case 4:
                int i12 = j9.e;
                return true;
            case 5:
                int i13 = x2.f23790w;
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
                Pattern pattern = f5.f26077a;
                return true;
            case 11:
                k8 k8Var = k8.T0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f23908n5;
                return true;
            case 13:
                int i17 = ti.R2;
                return true;
            case 14:
                int i18 = nk.f28814g0;
                return true;
            case 15:
                int i19 = rl.E0;
                return true;
            case 16:
                int i20 = wp.f32202i0;
                return true;
            case 17:
                cv cvVar = cv.S;
                return true;
            case 18:
                int i21 = vz.h;
                return true;
            case 19:
                int[] iArr = me0.f28490i0;
                return true;
            case 20:
                int i22 = bj0.R;
                return true;
            case 21:
                int i23 = wo0.Y0;
                return true;
            case 22:
                int i24 = fr0.f26362b1;
                return true;
            case 23:
                int[] iArr2 = uv0.f31018d2;
                return true;
            case 24:
                int i25 = qy0.f29742u0;
                return true;
            case 25:
                int i26 = UndoView.f24406e0;
                return true;
            case 26:
                int i27 = UndoView.f24406e0;
                return true;
            case 27:
                int i28 = mj0.f39291d0;
                return true;
            case 28:
                List list = eo0.f36696g1;
                return true;
            default:
                int i29 = PopupNotificationActivity.f33485b0;
                return true;
        }
    }
}
