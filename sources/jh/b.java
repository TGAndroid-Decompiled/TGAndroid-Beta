package jh;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
public final class b implements v10 {
    public final int f17010a;

    public b(int i7) {
        this.f17010a = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f17010a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                RectF rectF = e.H;
                return;
            case 1:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                return;
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i7 = qp.C8;
                return;
            case 3:
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i10 = qp.C8;
                return;
            case 4:
                TLRPC.Bool bool4 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i11 = lr.f35726z2;
                return;
            default:
                Boolean bool5 = (Boolean) obj;
                HashSet<Long> hashSet = (HashSet) obj2;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.convertToConferenceCall(bool5.booleanValue(), hashSet);
                    return;
                }
                return;
        }
    }
}
