package ai;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.xw;
import org.telegram.ui.ag0;
import org.telegram.ui.d81;
import org.telegram.ui.hp;
import org.telegram.ui.ln0;
import org.telegram.ui.sl0;
import org.telegram.ui.xo0;
public final class t7 implements RequestDelegate {
    public final int f1556a;

    public t7(int i10) {
        this.f1556a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1556a) {
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
                int[] iArr = ci.d1.f4477a0;
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
                int i10 = hp.f34201b3;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.e5.f23785a;
                return;
            case 13:
                int i11 = xw.H0;
                return;
            case 14:
                int i12 = k00.A0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 16:
                int i13 = u01.e;
                return;
            case 17:
                int i14 = ag0.f32029t0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new sl0(tLObject, 2));
                return;
            case 19:
                int i15 = ln0.R;
                return;
            case 20:
                List list = xo0.f39536g1;
                return;
            default:
                int i16 = d81.e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
