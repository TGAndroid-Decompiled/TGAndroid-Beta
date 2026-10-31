package ag;

import android.graphics.Paint;
import android.graphics.RectF;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.cc;
import org.telegram.messenger.g4;
import org.telegram.messenger.ot;
import org.telegram.messenger.r5;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.tz;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bp;
import org.telegram.ui.c41;
import org.telegram.ui.hl0;
import org.telegram.ui.me0;
import org.telegram.ui.mg0;
import org.telegram.ui.oa;
import org.telegram.ui.sm0;
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
                r5 r5Var = g4.f15668s;
                return;
            case 4:
                return;
            case 5:
                int i10 = cc.f14973i;
                return;
            case 6:
                Pattern pattern = ui.R1;
                return;
            case 7:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.a(tL_error, 24));
                return;
            case 8:
                int i11 = vp.D8;
                return;
            case 9:
                String str = ot.f17303j0;
                return;
            case 10:
                Paint paint = oa.H;
                return;
            case 11:
                int i12 = bp.f36287i3;
                return;
            case 12:
                org.telegram.messenger.i0.g3(new f3(13));
                return;
            case 13:
                Pattern pattern2 = s4.f30123a;
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
                int i15 = pz0.e;
                return;
            case 18:
                int i16 = me0.f39655v0;
                return;
            case 19:
                org.telegram.messenger.i0.g3(new mg0(tLObject, 5));
                return;
            case 20:
                int i17 = hl0.R;
                return;
            case 21:
                List list = sm0.f41544g1;
                return;
            case 22:
                RectF rectF = ProfileActivity.R6;
                return;
            case 23:
                int i18 = c41.l1;
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
                int[] iArr = vh.u0.f51982a0;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
