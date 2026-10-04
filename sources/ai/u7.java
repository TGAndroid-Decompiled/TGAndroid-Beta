package ai;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.n00;
import org.telegram.ui.gn0;
import org.telegram.ui.gp;
import org.telegram.ui.nl0;
import org.telegram.ui.so0;
import org.telegram.ui.xf0;
import org.telegram.ui.z71;
public final class u7 implements RequestDelegate {
    public final int f1720a;

    public u7(int i10) {
        this.f1720a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1720a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f(4));
                return;
            case 1:
                Comparator comparator = l9.X;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 4:
                int[] iArr = ci.d1.f4882a0;
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
                Paint paint = org.telegram.ui.sa.H;
                return;
            case 10:
                int i10 = gp.f36692i3;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.e5.f25914a;
                return;
            case 13:
                int i11 = ax.H0;
                return;
            case 14:
                int i12 = n00.A0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 16:
                int i13 = d11.f25516e;
                return;
            case 17:
                int i14 = xf0.f42849t0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new nl0(tLObject, 2));
                return;
            case 19:
                int i15 = gn0.R;
                return;
            case 20:
                List list = so0.f40538g1;
                return;
            default:
                int i16 = z71.f43714e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
