package ag;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.dc;
import org.telegram.messenger.g4;
import org.telegram.messenger.pt;
import org.telegram.messenger.r5;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.tz;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a41;
import org.telegram.ui.bp;
import org.telegram.ui.fl0;
import org.telegram.ui.kg0;
import org.telegram.ui.le0;
import org.telegram.ui.oa;
import org.telegram.ui.qm0;
import th.e5;
public final class c3 implements RequestDelegate {
    public final int f479a;

    public c3(int i10) {
        this.f479a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f479a) {
            case 0:
                org.telegram.messenger.i0.g3(new f3(0));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new f3(0));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new f3(0));
                return;
            case 3:
                r5 r5Var = g4.f15853s;
                return;
            case 4:
                return;
            case 5:
                int i10 = dc.f15335i;
                return;
            case 6:
                Pattern pattern = vi.R1;
                return;
            case 7:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.a(tL_error, 24));
                return;
            case 8:
                int i11 = wp.D8;
                return;
            case 9:
                String str = pt.f17636j0;
                return;
            case 10:
                Paint paint = oa.H;
                return;
            case 11:
                int i12 = bp.f36091i3;
                return;
            case 12:
                org.telegram.messenger.i0.g3(new f3(13));
                return;
            case 13:
                Pattern pattern2 = s4.f30174a;
                return;
            case 14:
                int i13 = gw.H0;
                return;
            case 15:
                int i14 = tz.A0;
                return;
            case 16:
                org.telegram.messenger.i0.g3(new f3(13));
                return;
            case 17:
                int i15 = qz0.e;
                return;
            case 18:
                int i16 = le0.f39232v0;
                return;
            case 19:
                org.telegram.messenger.i0.g3(new kg0(tLObject, 5));
                return;
            case 20:
                int i17 = fl0.R;
                return;
            case 21:
                List list = qm0.f40810g1;
                return;
            case 22:
                RectF rectF = ProfileActivity.S6;
                return;
            case 23:
                int i18 = a41.l1;
                return;
            case 24:
                org.telegram.messenger.i0.g3(new r5.a(11));
                return;
            case 25:
                Comparator comparator = e5.X;
                return;
            case 26:
                org.telegram.messenger.i0.g3(new f3(13));
                return;
            case 27:
                org.telegram.messenger.i0.g3(new f3(13));
                return;
            default:
                int[] iArr = vh.v0.f52041a0;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
