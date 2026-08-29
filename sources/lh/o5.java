package lh;

import android.graphics.Paint;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.pw;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.a71;
import org.telegram.ui.bo0;
import org.telegram.ui.ef0;
import org.telegram.ui.if0;
import org.telegram.ui.la;
import org.telegram.ui.rm0;
import org.telegram.ui.vk0;
import org.telegram.ui.xo;
public final class o5 implements RequestDelegate {
    public final int f16020a;

    public o5(int i10) {
        this.f16020a = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16020a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ag.o0(17));
                return;
            case 1:
                Comparator comparator = s6.X;
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ag.o0(25));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ag.o0(25));
                return;
            case 4:
                int[] iArr = nh.c1.T;
                return;
            case 5:
                return;
            case 6:
                Paint paint = la.D;
                return;
            case 7:
                int i10 = xo.X2;
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ag.o0(25));
                return;
            case 9:
                Pattern pattern = org.telegram.ui.Components.c5.f27308a;
                return;
            case 10:
                int i11 = pw.D0;
                return;
            case 11:
                int i12 = f00.f28225w0;
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ag.o0(25));
                return;
            case 13:
                int i13 = yz0.f35160e;
                return;
            case 14:
                int i14 = if0.f39229p0;
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new vk0(tLObject, 2));
                return;
            case 16:
                int i15 = rm0.N;
                return;
            case 17:
                List list = bo0.f36836c1;
                return;
            case 18:
                int i16 = a71.f36448e;
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new ef0(18));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new ef0(18));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ef0(18));
                return;
        }
    }

    private final void a(TLObject tLObject, TLRPC.TL_error tL_error) {
    }
}
