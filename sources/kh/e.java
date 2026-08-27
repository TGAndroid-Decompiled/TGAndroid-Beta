package kh;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.y4;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.do0;
import org.telegram.ui.g9;
import org.telegram.ui.m4;
import org.telegram.ui.na;
import org.telegram.ui.oj0;
import org.telegram.ui.qb;
import org.telegram.ui.rn;

public final class e implements View.OnTouchListener {

    public final int f15197a;

    public e(int i10) {
        this.f15197a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f15197a) {
            case 0:
                int i10 = r.T;
                break;
            case 1:
                int i11 = e3.f22876a;
                break;
            case 3:
                HashSet hashSet = m4.X0;
            case 2:
                return true;
            case 4:
                int i12 = g9.f38340e;
                break;
            case 5:
                int i13 = v2.f25790w;
                break;
            case 6:
                Paint paint = na.D;
                break;
            case 7:
                int i14 = qb.T0;
                break;
            case 8:
                int i15 = rn.Dc;
                break;
            case 10:
                Pattern pattern = y4.f34802a;
            case 9:
                return true;
            case 11:
                b8 b8Var = b8.P0;
                break;
            case 12:
                int i16 = ChatActivityEnterView.f26070i5;
                break;
            case 13:
                int i17 = gi.K2;
                break;
            case 14:
                int i18 = bk.f27111c0;
                break;
            case 15:
                int i19 = tk.A0;
                break;
            case 16:
                int i20 = ap.f26776e0;
                break;
            case 17:
                fu fuVar = fu.O;
                break;
            case 18:
                int i21 = az.h;
                break;
            case 19:
                int[] iArr = dd0.T;
                break;
            case 20:
                int i22 = sh0.N;
                break;
            case 21:
                int i23 = jn0.T0;
                break;
            case 22:
                int i24 = sp0.W0;
                break;
            case 23:
                int[] iArr2 = hu0.Z1;
                break;
            case 24:
                int i25 = ex0.f28169q0;
                break;
            case 25:
                int i26 = UndoView.f26571a0;
                break;
            case 26:
                int i27 = UndoView.f26571a0;
                break;
            case 27:
                int i28 = oj0.Z;
                break;
            case 28:
                List list = do0.f37449c1;
                break;
            default:
                int i29 = PopupNotificationActivity.X;
                break;
        }
        return true;
    }
}
