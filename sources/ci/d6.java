package ci;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.s00;
import org.telegram.ui.ek0;
import org.telegram.ui.go0;
import org.telegram.ui.if0;
import org.telegram.ui.tm0;
import org.telegram.ui.ua;
import org.telegram.ui.w61;
import org.telegram.ui.xo;
public final class d6 implements RequestDelegate {
    public final int f5255a;

    public d6(int i10) {
        this.f5255a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5255a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ah.j(8));
                return;
            case 1:
                Comparator comparator = h7.X;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.j(22));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ah.j(22));
                return;
            case 4:
                int[] iArr = ei.c1.f8807a0;
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ah.j(16));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ah.j(16));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ah.j(16));
                return;
            case 8:
                return;
            case 9:
                Paint paint = ua.H;
                return;
            case 10:
                int i10 = xo.Z2;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ah.j(22));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.f5.f26080a;
                return;
            case 13:
                int i11 = ex.H0;
                return;
            case 14:
                int i12 = s00.A0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new ah.j(22));
                return;
            case 16:
                int i13 = c11.e;
                return;
            case 17:
                int i14 = if0.f37852t0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new ek0(tLObject, 3));
                return;
            case 19:
                int i15 = tm0.R;
                return;
            case 20:
                List list = go0.f37213g1;
                return;
            default:
                int i16 = w61.e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
