package gi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import di.n4;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.bn;
import org.telegram.ui.eh0;
import org.telegram.ui.g4;
import org.telegram.ui.la;
import org.telegram.ui.lb;
public final class a implements View.OnTouchListener {
    public final int f13632a;

    public a(int i7) {
        this.f13632a = i7;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f13632a) {
            case 0:
                int i7 = m.f13650b0;
                return true;
            case 1:
                int i10 = x2.l1;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = g4.f47891d1;
                return true;
            case 4:
                int i11 = n4.f9371f;
                return true;
            case 5:
                int i12 = z2.f32486x;
                return true;
            case 6:
                Paint paint = la.I;
                return true;
            case 7:
                int i13 = lb.R0;
                return true;
            case 8:
                int i14 = bn.f45922md;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = b5.f33529a;
                return true;
            case 11:
                g8 g8Var = g8.T2;
                return true;
            case 12:
                int i15 = ChatActivityEnterView.f32538n7;
                return true;
            case 13:
                if (motionEvent.getActionMasked() == 0 && view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return false;
                }
                return false;
            case 14:
                int i16 = si.I4;
                return true;
            case 15:
                int i17 = kk.f36772h0;
                return true;
            case 16:
                int i18 = kl.G0;
                return true;
            case 17:
                int i19 = lp.f37168g2;
                return true;
            case 18:
                gu guVar = gu.S1;
                return true;
            case 19:
                int i20 = ty.h;
                return true;
            case 20:
                int[] iArr = pc0.f38359j0;
                return true;
            case 21:
                int i21 = ug0.S;
                return true;
            case 22:
                int i22 = rm0.f39179b1;
                return true;
            case 23:
                int i23 = yo0.U2;
                return true;
            case 24:
                int[] iArr2 = gt0.f35563t2;
                return true;
            case 25:
                int i24 = iw0.f36232r2;
                return true;
            case 26:
                int i25 = f11.f34872r0;
                return true;
            case 27:
                int i26 = UndoView.f33171j0;
                return true;
            case 28:
                int i27 = UndoView.f33171j0;
                return true;
            default:
                int i28 = eh0.Z1;
                return true;
        }
    }
}
