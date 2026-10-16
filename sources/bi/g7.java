package bi;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.w00;
import org.telegram.ui.ap0;
import org.telegram.ui.dg0;
import org.telegram.ui.mp;
import org.telegram.ui.o81;
import org.telegram.ui.on0;
import org.telegram.ui.xk0;
public final class g7 implements RequestDelegate {
    public final int f3084a;

    public g7(int i10) {
        this.f3084a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3084a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ah.j(5));
                return;
            case 1:
                Comparator comparator = x8.X;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                return;
            case 4:
                int[] iArr = di.c1.f6685a0;
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ah.j(14));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ah.j(14));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ah.j(14));
                return;
            case 8:
                return;
            case 9:
                Paint paint = org.telegram.ui.va.H;
                return;
            case 10:
                int i10 = mp.Z2;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.g5.f24879a;
                return;
            case 13:
                int i11 = ix.H0;
                return;
            case 14:
                int i12 = w00.A0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                return;
            case 16:
                int i13 = h11.e;
                return;
            case 17:
                int i14 = dg0.f34985t0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new xk0(tLObject, 3));
                return;
            case 19:
                int i15 = on0.R;
                return;
            case 20:
                List list = ap0.f34005g1;
                return;
            default:
                int i16 = o81.e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
