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
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.v01;
import org.telegram.ui.bn0;
import org.telegram.ui.ep;
import org.telegram.ui.il0;
import org.telegram.ui.no0;
import org.telegram.ui.tf0;
import org.telegram.ui.x71;
public final class u7 implements RequestDelegate {
    public final int f1585a;

    public u7(int i10) {
        this.f1585a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1585a) {
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
                int[] iArr = ci.d1.f4498a0;
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
                Paint paint = org.telegram.ui.qa.H;
                return;
            case 10:
                int i10 = ep.f33534i3;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.e5.f23842a;
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
                int i13 = v01.e;
                return;
            case 17:
                int i14 = tf0.f38183t0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new il0(tLObject, 2));
                return;
            case 19:
                int i15 = bn0.R;
                return;
            case 20:
                List list = no0.f36047g1;
                return;
            default:
                int i16 = x71.e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
