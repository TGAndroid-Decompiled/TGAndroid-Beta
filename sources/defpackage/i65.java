package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class i65 implements gk7 {
    public final long a;
    public final LaunchActivity b;
    public final j5 c;

    public i65(long j, LaunchActivity launchActivity, j5 j5Var) {
        this.a = j;
        this.b = launchActivity;
        this.c = j5Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        fc2 fc2Var;
        TLRPC.GroupCall groupCall;
        if (VoIPService.getSharedInstance() != null) {
            kk7.e().n(this, kk7.u2);
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && (fc2Var = sharedInstance.groupCall) != null && (groupCall = fc2Var.b) != null && groupCall.id == this.a && !this.b.isFinishing()) {
                h75.S0(this.b, this.c, null, null, false, null);
            }
        }
    }
}
