package bi;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.xw;
import org.telegram.ui.g81;
import org.telegram.ui.kp;
import org.telegram.ui.ln0;
import org.telegram.ui.rl0;
import org.telegram.ui.xo0;
import org.telegram.ui.zf0;
public final class c7 implements RequestDelegate {
    public final int f2820a;

    public c7(int i10) {
        this.f2820a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2820a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ah.j(5));
                return;
            case 1:
                Comparator comparator = u8.X;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                return;
            case 4:
                int[] iArr = di.d1.f7039a0;
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
                Paint paint = org.telegram.ui.qa.H;
                return;
            case 10:
                int i10 = kp.f38099b3;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.e5.f25557a;
                return;
            case 13:
                int i11 = xw.H0;
                return;
            case 14:
                int i12 = k00.A0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new ah.j(19));
                return;
            case 16:
                int i13 = e01.f25501e;
                return;
            case 17:
                int i14 = zf0.f43395t0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new rl0(tLObject, 2));
                return;
            case 19:
                int i15 = ln0.R;
                return;
            case 20:
                List list = xo0.f42803g1;
                return;
            default:
                int i16 = g81.f36597e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
