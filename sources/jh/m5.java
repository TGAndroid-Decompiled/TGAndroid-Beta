package jh;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.do0;
import org.telegram.ui.mf0;
import org.telegram.ui.na;
import org.telegram.ui.tm0;
import org.telegram.ui.tq0;
import org.telegram.ui.wo;
import org.telegram.ui.x61;
import org.telegram.ui.zk0;

public final class m5 implements RequestDelegate {

    public final int f13656a;

    public m5(int i10) {
        this.f13656a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = 22;
        switch (this.f13656a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ag.l3(13));
                break;
            case 1:
                Comparator comparator = s6.X;
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ag.l3(i10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ag.l3(i10));
                break;
            case 4:
                int[] iArr = lh.c1.T;
                break;
            case 5:
                break;
            case 6:
                Paint paint = na.D;
                break;
            case 7:
                int i11 = wo.X2;
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ag.l3(i10));
                break;
            case 9:
                Pattern pattern = org.telegram.ui.Components.y4.f34802a;
                break;
            case 10:
                int i12 = iw.D0;
                break;
            case 11:
                int i13 = yz.f35067w0;
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ag.l3(i10));
                break;
            case 13:
                int i14 = oz0.f31448e;
                break;
            case 14:
                int i15 = mf0.f40477p0;
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new zk0(tLObject, 2));
                break;
            case 16:
                int i16 = tm0.N;
                break;
            case 17:
                List list = do0.f37449c1;
                break;
            case 18:
                int i17 = x61.f44293e;
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new tq0(14));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new tq0(14));
                break;
            default:
                AndroidUtilities.runOnUIThread(new tq0(14));
                break;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
