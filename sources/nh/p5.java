package nh;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.tw;
import org.telegram.ui.bn0;
import org.telegram.ui.ep;
import org.telegram.ui.gl0;
import org.telegram.ui.j21;
import org.telegram.ui.lo0;
import org.telegram.ui.ra;
import org.telegram.ui.tf0;
import org.telegram.ui.v71;
public final class p5 implements RequestDelegate {
    public final int f15729a;

    public p5(int i10) {
        this.f15729a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15729a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cg.n0(17));
                return;
            case 1:
                Comparator comparator = t6.X;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new cg.n0(21));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new cg.n0(21));
                return;
            case 4:
                return;
            case 5:
                Paint paint = ra.E;
                return;
            case 6:
                int i10 = ep.Y2;
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new cg.n0(21));
                return;
            case 8:
                Pattern pattern = org.telegram.ui.Components.z4.f31242a;
                return;
            case 9:
                int i11 = tw.E0;
                return;
            case 10:
                int i12 = k00.f26089x0;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new cg.n0(21));
                return;
            case 12:
                int i13 = j01.e;
                return;
            case 13:
                int i14 = tf0.f38483q0;
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gl0(tLObject, 2));
                return;
            case 15:
                int i15 = bn0.O;
                return;
            case 16:
                List list = lo0.f35813d1;
                return;
            case 17:
                int i16 = v71.e;
                return;
            case 18:
                int[] iArr = ph.v0.U;
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new j21(18));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new j21(18));
                return;
            default:
                AndroidUtilities.runOnUIThread(new j21(18));
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
