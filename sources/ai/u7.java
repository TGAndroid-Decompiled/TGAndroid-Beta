package ai;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.yw;
import org.telegram.ui.fn0;
import org.telegram.ui.fp;
import org.telegram.ui.ml0;
import org.telegram.ui.ro0;
import org.telegram.ui.wf0;
import org.telegram.ui.z71;
public final class u7 implements RequestDelegate {
    public final int f1582a;

    public u7(int i10) {
        this.f1582a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1582a) {
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
                int[] iArr = ci.d1.f4518a0;
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
                Paint paint = org.telegram.ui.ta.H;
                return;
            case 10:
                int i10 = fp.f33602b3;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.e5.f23875a;
                return;
            case 13:
                int i11 = yw.H0;
                return;
            case 14:
                int i12 = m00.A0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 16:
                int i13 = u01.e;
                return;
            case 17:
                int i14 = wf0.f39257t0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new ml0(tLObject, 2));
                return;
            case 19:
                int i15 = fn0.R;
                return;
            case 20:
                List list = ro0.f37165g1;
                return;
            default:
                int i16 = z71.e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
