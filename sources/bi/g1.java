package bi;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.s01;
import org.telegram.ui.j81;
import org.telegram.ui.kn0;
import org.telegram.ui.lp;
import org.telegram.ui.ql0;
import org.telegram.ui.wo0;
import org.telegram.ui.zf0;
public final class g1 implements RequestDelegate {
    public final int f2735a;

    public g1(int i10) {
        this.f2735a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2735a) {
            case 0:
                int[] iArr = i1.f2838a0;
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f0(7));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new f0(7));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new f0(7));
                return;
            case 4:
                return;
            case 5:
                Paint paint = org.telegram.ui.ra.H;
                return;
            case 6:
                int i10 = lp.f34748b3;
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new f0(13));
                return;
            case 8:
                Pattern pattern = org.telegram.ui.Components.d5.f22289a;
                return;
            case 9:
                int i11 = cx.H0;
                return;
            case 10:
                int i12 = r00.A0;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new f0(13));
                return;
            case 12:
                int i13 = s01.e;
                return;
            case 13:
                int i14 = zf0.f39280t0;
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ql0(tLObject, 2));
                return;
            case 15:
                int i15 = kn0.R;
                return;
            case 16:
                List list = wo0.f38252g1;
                return;
            case 17:
                int i16 = j81.e;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.d1(19));
                return;
            case 19:
                Comparator comparator = zh.i5.X;
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new f0(13));
                return;
            default:
                AndroidUtilities.runOnUIThread(new f0(13));
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
