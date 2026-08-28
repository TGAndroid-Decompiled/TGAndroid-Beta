package jh;

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
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.fk;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.co0;
import org.telegram.ui.f9;
import org.telegram.ui.l4;
import org.telegram.ui.ma;
import org.telegram.ui.nj0;
import org.telegram.ui.pb;
import org.telegram.ui.qn;
public final class d implements View.OnTouchListener {
    public final int f14346a;

    public d(int i9) {
        this.f14346a = i9;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f14346a) {
            case 0:
                int i9 = q.T;
                return true;
            case 1:
                int i10 = f3.f22932a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = l4.X0;
                return true;
            case 4:
                int i11 = f9.f38160e;
                return true;
            case 5:
                int i12 = x2.f25929w;
                return true;
            case 6:
                Paint paint = ma.D;
                return true;
            case 7:
                int i13 = pb.T0;
                return true;
            case 8:
                int i14 = qn.Dc;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = y4.f34847a;
                return true;
            case 11:
                c8 c8Var = c8.P0;
                return true;
            case 12:
                int i15 = ChatActivityEnterView.f26074i5;
                return true;
            case 13:
                int i16 = ki.K2;
                return true;
            case 14:
                int i17 = fk.f28455c0;
                return true;
            case 15:
                int i18 = xk.A0;
                return true;
            case 16:
                int i19 = cp.f27519e0;
                return true;
            case 17:
                gu guVar = gu.O;
                return true;
            case 18:
                int i20 = yy.h;
                return true;
            case 19:
                int[] iArr = yc0.T;
                return true;
            case 20:
                int i21 = qh0.N;
                return true;
            case 21:
                int i22 = hn0.T0;
                return true;
            case 22:
                int i23 = rp0.W0;
                return true;
            case 23:
                int[] iArr2 = eu0.Z1;
                return true;
            case 24:
                int i24 = cx0.f27569q0;
                return true;
            case 25:
                int i25 = UndoView.f26575a0;
                return true;
            case 26:
                int i26 = UndoView.f26575a0;
                return true;
            case 27:
                int i27 = nj0.Z;
                return true;
            case 28:
                List list = co0.f37243c1;
                return true;
            default:
                int i28 = PopupNotificationActivity.X;
                return true;
        }
    }
}
