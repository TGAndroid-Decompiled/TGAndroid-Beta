package bi;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.fk0;
import org.telegram.ui.h4;
import org.telegram.ui.i9;
import org.telegram.ui.ra;
import org.telegram.ui.vb;
import org.telegram.ui.xo0;
import org.telegram.ui.zn;
public final class d implements View.OnTouchListener {
    public final int f3565a;

    public d(int i10) {
        this.f3565a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f3565a) {
            case 0:
                int i10 = u.f3589a0;
                return true;
            case 1:
                int i11 = f3.f18878a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = h4.f34086b1;
                return true;
            case 4:
                int i12 = i9.e;
                return true;
            case 5:
                int i13 = y2.f21891w;
                return true;
            case 6:
                Paint paint = ra.H;
                return true;
            case 7:
                int i14 = vb.Q0;
                return true;
            case 8:
                int i15 = zn.Gc;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = d5.f23562a;
                return true;
            case 11:
                i8 i8Var = i8.T0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f21967n5;
                return true;
            case 13:
                int i17 = vi.O2;
                return true;
            case 14:
                int i18 = ok.f27109g0;
                return true;
            case 15:
                int i19 = gl.E0;
                return true;
            case 16:
                int i20 = mp.f26494i0;
                return true;
            case 17:
                vu vuVar = vu.S;
                return true;
            case 18:
                int i21 = mz.h;
                return true;
            case 19:
                int[] iArr = de0.f23666a0;
                return true;
            case 20:
                int i22 = ri0.R;
                return true;
            case 21:
                int i23 = no0.Z0;
                return true;
            case 22:
                int i24 = wq0.f30096a1;
                return true;
            case 23:
                int[] iArr2 = lv0.f26182d2;
                return true;
            case 24:
                int i25 = iy0.f25195u0;
                return true;
            case 25:
                int i26 = UndoView.f22465e0;
                return true;
            case 26:
                int i27 = UndoView.f22465e0;
                return true;
            case 27:
                int i28 = fk0.f33698d0;
                return true;
            case 28:
                List list = xo0.f39661g1;
                return true;
            default:
                int i29 = PopupNotificationActivity.f31448b0;
                return true;
        }
    }
}
