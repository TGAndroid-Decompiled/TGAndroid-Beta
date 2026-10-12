package ai;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.q11;
import org.telegram.ui.k81;
import org.telegram.ui.kp;
import org.telegram.ui.ln0;
import org.telegram.ui.uk0;
import org.telegram.ui.xo0;
import org.telegram.ui.zf0;
public final class v7 implements RequestDelegate {
    public final int f1826a;

    public v7(int i10) {
        this.f1826a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1826a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f(4));
                return;
            case 1:
                Comparator comparator = m9.X;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 4:
                int[] iArr = ci.c1.f4810a0;
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
                Paint paint = org.telegram.ui.ua.H;
                return;
            case 10:
                int i10 = kp.Z2;
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 12:
                Pattern pattern = org.telegram.ui.Components.g5.f26278a;
                return;
            case 13:
                int i11 = px.H0;
                return;
            case 14:
                int i12 = d10.A0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new f(18));
                return;
            case 16:
                int i13 = q11.f29627e;
                return;
            case 17:
                int i14 = zf0.f44812t0;
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new uk0(tLObject, 3));
                return;
            case 19:
                int i15 = ln0.R;
                return;
            case 20:
                List list = xo0.f44088g1;
                return;
            default:
                int i16 = k81.f39377e;
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
