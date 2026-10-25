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
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.s00;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.en0;
import org.telegram.ui.jf0;
import org.telegram.ui.lj0;
import org.telegram.ui.po0;
import org.telegram.ui.ta;
import org.telegram.ui.z61;
import org.telegram.ui.zo;
public final class d6 implements RequestDelegate {
    public final int f8490a;

    public d6(int i10) {
        this.f8490a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8490a) {
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
                int[] iArr = fi.c1.f10593a0;
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
                int i10 = zo.f46334j3;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ag.c(25));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.g5.f28418a;
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
                int i13 = p11.e;
                return;
            case 17:
                int i14 = jf0.f40589v0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new lj0(tLObject, 4));
                return;
            case 19:
                int i15 = en0.R;
                return;
            case 20:
                List list = po0.f42581g1;
                return;
            case 21:
                int i16 = ProfileActivity.R6;
                return;
            default:
                int i17 = z61.e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
