package mh;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ai0;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.bo0;
import org.telegram.ui.e9;
import org.telegram.ui.kj0;
import org.telegram.ui.la;
import org.telegram.ui.m4;
import org.telegram.ui.ob;
import org.telegram.ui.tn;
public final class d implements View.OnTouchListener {
    public final int f17022a;

    public d(int i10) {
        this.f17022a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f17022a) {
            case 0:
                int i10 = r.T;
                return true;
            case 1:
                int i11 = f3.f22932a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = m4.X0;
                return true;
            case 4:
                int i12 = e9.f37755e;
                return true;
            case 5:
                int i13 = v2.f25820w;
                return true;
            case 6:
                Paint paint = la.D;
                return true;
            case 7:
                int i14 = ob.T0;
                return true;
            case 8:
                int i15 = tn.Dc;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = c5.f27308a;
                return true;
            case 11:
                g8 g8Var = g8.P0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f26085i5;
                return true;
            case 13:
                int i17 = ni.K2;
                return true;
            case 14:
                int i18 = jk.f29674c0;
                return true;
            case 15:
                int i19 = bl.A0;
                return true;
            case 16:
                int i20 = gp.f28930e0;
                return true;
            case 17:
                mu muVar = mu.O;
                return true;
            case 18:
                int i21 = hz.h;
                return true;
            case 19:
                int[] iArr = nd0.T;
                return true;
            case 20:
                int i22 = ai0.N;
                return true;
            case 21:
                int i23 = tn0.T0;
                return true;
            case 22:
                int i24 = dq0.W0;
                return true;
            case 23:
                int[] iArr2 = qu0.Z1;
                return true;
            case 24:
                int i25 = nx0.f31167q0;
                return true;
            case 25:
                int i26 = UndoView.f26586a0;
                return true;
            case 26:
                int i27 = UndoView.f26586a0;
                return true;
            case 27:
                int i28 = kj0.Z;
                return true;
            case 28:
                List list = bo0.f36836c1;
                return true;
            default:
                int i29 = PopupNotificationActivity.X;
                return true;
        }
    }
}
