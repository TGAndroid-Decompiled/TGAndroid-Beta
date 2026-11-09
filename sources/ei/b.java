package ei;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import bi.m5;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.ch0;
import org.telegram.ui.cn;
import org.telegram.ui.g4;
import org.telegram.ui.jl0;
import org.telegram.ui.la;
import org.telegram.ui.mb;
public final class b implements View.OnTouchListener {
    public final int f10810a;

    public b(int i7) {
        this.f10810a = i7;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f10810a) {
            case 0:
                int i7 = n.f10828a0;
                return true;
            case 1:
                int i10 = v2.f28620h1;
                return true;
            case 2:
                return true;
            case 3:
                HashSet hashSet = g4.f45859c1;
                return true;
            case 4:
                int i11 = m5.f4324f;
                return true;
            case 5:
                int i12 = z2.f30959x;
                return true;
            case 6:
                Paint paint = la.H;
                return true;
            case 7:
                int i13 = mb.Q0;
                return true;
            case 8:
                int i14 = cn.f44367kd;
                return true;
            case 9:
                return true;
            case 10:
                Pattern pattern = v4.f38913a;
                return true;
            case 11:
                b8 b8Var = b8.P2;
                return true;
            case 12:
                int i15 = ChatActivityEnterView.s5;
                return true;
            case 13:
                int i16 = di.E4;
                return true;
            case 14:
                int i17 = vj.f39105g0;
                return true;
            case 15:
                int i18 = wk.F0;
                return true;
            case 16:
                int i19 = vo.f39140c2;
                return true;
            case 17:
                wt wtVar = wt.O1;
                return true;
            case 18:
                int i20 = jy.h;
                return true;
            case 19:
                int[] iArr = fc0.f33617i0;
                return true;
            case 20:
                int i21 = ig0.R;
                return true;
            case 21:
                int i22 = gm0.f33991a1;
                return true;
            case 22:
                int i23 = no0.Q2;
                return true;
            case 23:
                int[] iArr2 = zs0.f41052s2;
                return true;
            case 24:
                int i24 = zv0.f41143n2;
                return true;
            case 25:
                int i25 = t01.m0;
                return true;
            case 26:
                int i26 = UndoView.f31601i0;
                return true;
            case 27:
                int i27 = UndoView.f31601i0;
                return true;
            case 28:
                int i28 = ch0.V1;
                return true;
            default:
                List list = jl0.f46991g1;
                return true;
        }
    }
}
