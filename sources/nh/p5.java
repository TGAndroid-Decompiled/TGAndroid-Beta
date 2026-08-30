package nh;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.tw;
import org.telegram.ui.c21;
import org.telegram.ui.cp;
import org.telegram.ui.el0;
import org.telegram.ui.jo0;
import org.telegram.ui.o71;
import org.telegram.ui.pa;
import org.telegram.ui.rf0;
import org.telegram.ui.zm0;
public final class p5 implements RequestDelegate {
    public final int f15749a;

    public p5(int i10) {
        this.f15749a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f15749a) {
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
                Paint paint = pa.E;
                return;
            case 6:
                int i10 = cp.Y2;
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new cg.n0(21));
                return;
            case 8:
                Pattern pattern = org.telegram.ui.Components.z4.f31230a;
                return;
            case 9:
                int i11 = tw.E0;
                return;
            case 10:
                int i12 = j00.f25813x0;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new cg.n0(21));
                return;
            case 12:
                int i13 = j01.e;
                return;
            case 13:
                int i14 = rf0.f38014q0;
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new el0(tLObject, 2));
                return;
            case 15:
                int i15 = zm0.O;
                return;
            case 16:
                List list = jo0.f35386d1;
                return;
            case 17:
                int i16 = o71.e;
                return;
            case 18:
                int[] iArr = ph.v0.U;
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new c21(18));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new c21(18));
                return;
            default:
                AndroidUtilities.runOnUIThread(new c21(18));
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
