package oh;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.vw;
import org.telegram.ui.bn0;
import org.telegram.ui.dp;
import org.telegram.ui.gl0;
import org.telegram.ui.lo0;
import org.telegram.ui.p71;
import org.telegram.ui.pa;
import org.telegram.ui.sf0;
import org.telegram.ui.sj0;
public final class p5 implements RequestDelegate {
    public final int f17626a;

    public p5(int i10) {
        this.f17626a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17626a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ag.f(19));
                return;
            case 1:
                Comparator comparator = t6.X;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ag.f(23));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ag.f(23));
                return;
            case 4:
                return;
            case 5:
                Paint paint = pa.E;
                return;
            case 6:
                int i10 = dp.Y2;
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ag.f(23));
                return;
            case 8:
                Pattern pattern = org.telegram.ui.Components.z4.f33718a;
                return;
            case 9:
                int i11 = vw.E0;
                return;
            case 10:
                int i12 = l00.f28485x0;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ag.f(23));
                return;
            case 12:
                int i13 = k01.f28241e;
                return;
            case 13:
                int i14 = sf0.f41250q0;
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gl0(tLObject, 2));
                return;
            case 15:
                int i15 = bn0.O;
                return;
            case 16:
                List list = lo0.f38793d1;
                return;
            case 17:
                int i16 = p71.f39940e;
                return;
            case 18:
                int[] iArr = qh.v0.U;
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new sj0(20));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new sj0(20));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sj0(20));
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
