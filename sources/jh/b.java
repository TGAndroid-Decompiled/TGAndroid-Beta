package jh;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.as;
public final class b implements r10 {
    public final int f17742a;

    public b(int i7) {
        this.f17742a = i7;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f17742a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                RectF rectF = e.I;
                return;
            case 1:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                return;
            case 2:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i7 = np.I8;
                return;
            case 3:
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                int i10 = np.I8;
                return;
            case 4:
                TLRPC.Bool bool4 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i11 = as.D2;
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
