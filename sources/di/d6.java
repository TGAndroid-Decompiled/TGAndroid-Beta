package di;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.s00;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bp;
import org.telegram.ui.c71;
import org.telegram.ui.gn0;
import org.telegram.ui.lf0;
import org.telegram.ui.nj0;
import org.telegram.ui.ro0;
import org.telegram.ui.ta;
public final class d6 implements RequestDelegate {
    public final int f8489a;

    public d6(int i10) {
        this.f8489a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8489a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ag.c(11));
                return;
            case 1:
                Comparator comparator = h7.X;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ag.c(25));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ag.c(25));
                return;
            case 4:
                int[] iArr = fi.c1.f10592a0;
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ag.c(19));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ag.c(19));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ag.c(19));
                return;
            case 8:
                return;
            case 9:
                Paint paint = ta.H;
                return;
            case 10:
                int i10 = bp.f38079j3;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ag.c(25));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.g5.f28387a;
                return;
            case 13:
                int i11 = dx.H0;
                return;
            case 14:
                int i12 = s00.A0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new ag.c(25));
                return;
            case 16:
                int i13 = q11.e;
                return;
            case 17:
                int i14 = lf0.f41107v0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new nj0(tLObject, 4));
                return;
            case 19:
                int i15 = gn0.R;
                return;
            case 20:
                List list = ro0.f43095g1;
                return;
            case 21:
                int i16 = ProfileActivity.R6;
                return;
            default:
                int i17 = c71.e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
