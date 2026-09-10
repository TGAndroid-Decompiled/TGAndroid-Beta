package ai;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.j8;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zu;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ek0;
import org.telegram.ui.eo;
import org.telegram.ui.h9;
import org.telegram.ui.j4;
import org.telegram.ui.ra;
import org.telegram.ui.wb;
import org.telegram.ui.wo0;
public final class h implements View.OnTouchListener {
    public final int f452a;

    public h(int i10) {
        this.f452a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f452a) {
            case 0:
                int i10 = a0.f410a0;
                return true;
            case 1:
                int i11 = h3.f17768a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = j4.f33876b1;
                return true;
            case 4:
                int i12 = h9.e;
                return true;
            case 5:
                int i13 = x2.f20698w;
                return true;
            case 6:
                Paint paint = ra.H;
                return true;
            case 7:
                int i14 = wb.X0;
                return true;
            case 8:
                int i15 = eo.Hc;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = d5.f22289a;
                return true;
            case 11:
                j8 j8Var = j8.T0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f20816m5;
                return true;
            case 13:
                int i17 = yi.O2;
                return true;
            case 14:
                int i18 = tk.f27420g0;
                return true;
            case 15:
                int i19 = ll.E0;
                return true;
            case 16:
                int i20 = sp.f27130i0;
                return true;
            case 17:
                zu zuVar = zu.S;
                return true;
            case 18:
                int i21 = tz.h;
                return true;
            case 19:
                int[] iArr = be0.f21807a0;
                return true;
            case 20:
                int i22 = oi0.R;
                return true;
            case 21:
                int i23 = ho0.X0;
                return true;
            case 22:
                int i24 = sq0.f27165a1;
                return true;
            case 23:
                int[] iArr2 = iv0.f24079d2;
                return true;
            case 24:
                int i25 = hy0.f23802u0;
                return true;
            case 25:
                int i26 = UndoView.f21313e0;
                return true;
            case 26:
                int i27 = UndoView.f21313e0;
                return true;
            case 27:
                int i28 = ek0.f32227d0;
                return true;
            case 28:
                List list = wo0.f38252g1;
                return true;
            default:
                int i29 = PopupNotificationActivity.f30255b0;
                return true;
        }
    }
}
