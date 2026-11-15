package gi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import di.k4;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.y7;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.an;
import org.telegram.ui.bh0;
import org.telegram.ui.g4;
import org.telegram.ui.la;
import org.telegram.ui.lb;
public final class a implements View.OnTouchListener {
    public final int f13317a;

    public a(int i7) {
        this.f13317a = i7;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f13317a) {
            case 0:
                int i7 = m.f13335b0;
                return true;
            case 1:
                int i10 = u2.l1;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = g4.f47282d1;
                return true;
            case 4:
                int i11 = k4.f8906f;
                return true;
            case 5:
                int i12 = z2.f32098x;
                return true;
            case 6:
                Paint paint = la.I;
                return true;
            case 7:
                int i13 = lb.R0;
                return true;
            case 8:
                int i14 = an.f45107ld;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = t4.f39505a;
                return true;
            case 11:
                y7 y7Var = y7.T2;
                return true;
            case 12:
                int i15 = ChatActivityEnterView.N6;
                return true;
            case 13:
                if (motionEvent.getActionMasked() == 0 && view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return false;
                }
                return false;
            case 14:
                int i16 = ki.I4;
                return true;
            case 15:
                int i17 = dk.f33943h0;
                return true;
            case 16:
                int i18 = dl.G0;
                return true;
            case 17:
                int i19 = ep.f34386g2;
                return true;
            case 18:
                bu buVar = bu.S1;
                return true;
            case 19:
                int i20 = ny.h;
                return true;
            case 20:
                int[] iArr = fc0.f34563j0;
                return true;
            case 21:
                int i21 = kg0.S;
                return true;
            case 22:
                int i22 = jm0.f36034b1;
                return true;
            case 23:
                int i23 = po0.U2;
                return true;
            case 24:
                int[] iArr2 = ys0.f42073t2;
                return true;
            case 25:
                int i24 = bw0.f33398r2;
                return true;
            case 26:
                int i25 = v01.f40207n0;
                return true;
            case 27:
                int i26 = UndoView.f32774j0;
                return true;
            case 28:
                int i27 = UndoView.f32774j0;
                return true;
            default:
                int i28 = bh0.Z1;
                return true;
        }
    }
}
