package ih;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jw;
import org.telegram.ui.Components.mz0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.co0;
import org.telegram.ui.jf0;
import org.telegram.ui.lj0;
import org.telegram.ui.ma;
import org.telegram.ui.sm0;
import org.telegram.ui.uo;
import org.telegram.ui.y61;
import org.telegram.ui.zk0;
public final class q5 implements RequestDelegate {
    public final int f12002a;

    public q5(int i9) {
        this.f12002a = i9;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12002a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bg.d2(12));
                return;
            case 1:
                Comparator comparator = v6.X;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new bg.d2(23));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bg.d2(23));
                return;
            case 4:
                int[] iArr = kh.d1.T;
                return;
            case 5:
                return;
            case 6:
                Paint paint = ma.D;
                return;
            case 7:
                int i9 = uo.X2;
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new bg.d2(23));
                return;
            case 9:
                Pattern pattern = org.telegram.ui.Components.y4.f34847a;
                return;
            case 10:
                int i10 = jw.D0;
                return;
            case 11:
                int i11 = vz.f34029w0;
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new bg.d2(23));
                return;
            case 13:
                int i12 = mz0.f30950e;
                return;
            case 14:
                int i13 = jf0.f39468p0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new zk0(tLObject, 2));
                return;
            case 16:
                int i14 = sm0.N;
                return;
            case 17:
                List list = co0.f37243c1;
                return;
            case 18:
                int i15 = y61.f44758e;
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new lj0(13));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new lj0(13));
                return;
            default:
                AndroidUtilities.runOnUIThread(new lj0(13));
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
