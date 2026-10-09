package ai;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.mx;
import org.telegram.ui.h81;
import org.telegram.ui.hp;
import org.telegram.ui.jn0;
import org.telegram.ui.tk0;
import org.telegram.ui.vo0;
import org.telegram.ui.zf0;
public final class v7 implements RequestDelegate {
    public final int f1828a;

    public v7(int i10) {
        this.f1828a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1828a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f(4));
                return;
            case 1:
                Comparator comparator = m9.X;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 4:
                int[] iArr = ci.c1.f4812a0;
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new f(13));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new f(13));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new f(13));
                return;
            case 8:
                return;
            case 9:
                Paint paint = org.telegram.ui.ra.H;
                return;
            case 10:
                int i10 = hp.Z2;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.g5.f26593a;
                return;
            case 13:
                int i11 = mx.H0;
                return;
            case 14:
                int i12 = a10.A0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 16:
                int i13 = k11.f27816e;
                return;
            case 17:
                int i14 = zf0.f44586t0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new tk0(tLObject, 3));
                return;
            case 19:
                int i15 = jn0.R;
                return;
            case 20:
                List list = vo0.f42911g1;
                return;
            default:
                int i16 = h81.f38230e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
