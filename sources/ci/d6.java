package ci;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.s00;
import org.telegram.ui.io0;
import org.telegram.ui.mf0;
import org.telegram.ui.oj0;
import org.telegram.ui.sa;
import org.telegram.ui.wm0;
import org.telegram.ui.xo;
import org.telegram.ui.y61;
public final class d6 implements RequestDelegate {
    public final int f5257a;

    public d6(int i10) {
        this.f5257a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5257a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ah.j(9));
                return;
            case 1:
                Comparator comparator = h7.X;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.j(23));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ah.j(23));
                return;
            case 4:
                int[] iArr = ei.c1.f8815a0;
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ah.j(17));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ah.j(17));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ah.j(17));
                return;
            case 8:
                return;
            case 9:
                Paint paint = sa.H;
                return;
            case 10:
                int i10 = xo.f43626c3;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ah.j(23));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.f5.f26167a;
                return;
            case 13:
                int i11 = ex.H0;
                return;
            case 14:
                int i12 = s00.A0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new ah.j(23));
                return;
            case 16:
                int i13 = h11.e;
                return;
            case 17:
                int i14 = mf0.f39535v0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new oj0(tLObject, 4));
                return;
            case 19:
                int i15 = wm0.R;
                return;
            case 20:
                List list = io0.f38285g1;
                return;
            default:
                int i16 = y61.e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
