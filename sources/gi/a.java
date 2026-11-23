package gi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import di.n4;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.a3;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.bn;
import org.telegram.ui.fh0;
import org.telegram.ui.g4;
import org.telegram.ui.la;
import org.telegram.ui.lb;
public final class a implements View.OnTouchListener {
    public final int f13624a;

    public a(int i7) {
        this.f13624a = i7;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f13624a) {
            case 0:
                int i7 = m.f13642b0;
                return true;
            case 1:
                int i10 = w2.l1;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = g4.f47876d1;
                return true;
            case 4:
                int i11 = n4.f9360f;
                return true;
            case 5:
                int i12 = a3.f30363x;
                return true;
            case 6:
                Paint paint = la.I;
                return true;
            case 7:
                int i13 = lb.R0;
                return true;
            case 8:
                int i14 = bn.f45893md;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = c5.f33977a;
                return true;
            case 11:
                f8 f8Var = f8.T2;
                return true;
            case 12:
                int i15 = ChatActivityEnterView.f32535s7;
                return true;
            case 13:
                if (motionEvent.getActionMasked() == 0 && view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return false;
                }
                return false;
            case 14:
                int i16 = ui.I4;
                return true;
            case 15:
                int i17 = mk.f37483h0;
                return true;
            case 16:
                int i18 = ml.G0;
                return true;
            case 17:
                int i19 = np.f37877g2;
                return true;
            case 18:
                iu iuVar = iu.S1;
                return true;
            case 19:
                int i20 = vy.h;
                return true;
            case 20:
                int[] iArr = qc0.f38824j0;
                return true;
            case 21:
                int i21 = wg0.S;
                return true;
            case 22:
                int i22 = tm0.f39899b1;
                return true;
            case 23:
                int i23 = ap0.U2;
                return true;
            case 24:
                int[] iArr2 = jt0.f36559t2;
                return true;
            case 25:
                int i24 = kw0.f36960r2;
                return true;
            case 26:
                int i25 = g11.f35326r0;
                return true;
            case 27:
                int i26 = UndoView.f33173j0;
                return true;
            case 28:
                int i27 = UndoView.f33173j0;
                return true;
            default:
                int i28 = fh0.Z1;
                return true;
        }
    }
}
