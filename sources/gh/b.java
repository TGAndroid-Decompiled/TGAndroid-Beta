package gh;

import android.graphics.RectF;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ls;
public final class b implements Utilities.Callback2 {
    public final int f9109a;

    public b(int i10) {
        this.f9109a = i10;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f9109a) {
            case 0:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                RectF rectF = e.H;
                return;
            case 1:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = ls.G0;
                return;
            default:
                Boolean bool3 = (Boolean) obj;
                HashSet<Long> hashSet = (HashSet) obj2;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.convertToConferenceCall(bool3.booleanValue(), hashSet);
                    return;
                }
                return;
        }
    }
}
