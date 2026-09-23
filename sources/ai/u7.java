package ai;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.xw;
import org.telegram.ui.en0;
import org.telegram.ui.fp;
import org.telegram.ui.jl0;
import org.telegram.ui.qo0;
import org.telegram.ui.uf0;
import org.telegram.ui.w71;
public final class u7 implements RequestDelegate {
    public final int f1580a;

    public u7(int i10) {
        this.f1580a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1580a) {
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
                int[] iArr = ci.d1.f4491a0;
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
                int i10 = fp.f33353b3;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.e5.f23567a;
                return;
            case 13:
                int i11 = xw.H0;
                return;
            case 14:
                int i12 = l00.A0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 16:
                int i13 = e01.e;
                return;
            case 17:
                int i14 = uf0.f38068t0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new jl0(tLObject, 2));
                return;
            case 19:
                int i15 = en0.R;
                return;
            case 20:
                List list = qo0.f36481g1;
                return;
            default:
                int i16 = w71.e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
