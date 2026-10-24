package di;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.w2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ho0;
import org.telegram.ui.j9;
import org.telegram.ui.k4;
import org.telegram.ui.qj0;
import org.telegram.ui.sa;
import org.telegram.ui.sn;
import org.telegram.ui.vb;
public final class d implements View.OnTouchListener {
    public final int f8042a;

    public d(int i10) {
        this.f8042a = i10;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f8042a) {
            case 0:
                int i10 = r.f8060a0;
                return true;
            case 1:
                int i11 = h3.f20941a;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = k4.f38730c1;
                return true;
            case 4:
                int i12 = j9.e;
                return true;
            case 5:
                int i13 = w2.f23896w;
                return true;
            case 6:
                Paint paint = sa.H;
                return true;
            case 7:
                int i14 = vb.Q0;
                return true;
            case 8:
                int i15 = sn.Vc;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = d5.f25562a;
                return true;
            case 11:
                i8 i8Var = i8.Y0;
                return true;
            case 12:
                int i16 = ChatActivityEnterView.f24051r5;
                return true;
            case 13:
                int i17 = ri.U2;
                return true;
            case 14:
                int i18 = lk.f28350g0;
                return true;
            case 15:
                int i19 = pl.B0;
                return true;
            case 16:
                int i20 = up.f31173l0;
                return true;
            case 17:
                av avVar = av.S;
                return true;
            case 18:
                int i21 = tz.h;
                return true;
            case 19:
                int[] iArr = ne0.f28880i0;
                return true;
            case 20:
                int i22 = dj0.R;
                return true;
            case 21:
                int i23 = zo0.Y0;
                return true;
            case 22:
                int i24 = hr0.f27117d1;
                return true;
            case 23:
                int[] iArr2 = wv0.f32355g2;
                return true;
            case 24:
                int i25 = sy0.f30633w0;
                return true;
            case 25:
                int i26 = UndoView.f24555i0;
                return true;
            case 26:
                int i27 = UndoView.f24555i0;
                return true;
            case 27:
                int i28 = qj0.f40846e0;
                return true;
            case 28:
                List list = ho0.f37912g1;
                return true;
            default:
                int i29 = PopupNotificationActivity.f33789b0;
                return true;
        }
    }
}
