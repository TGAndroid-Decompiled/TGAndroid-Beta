package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class k85 implements fn7 {
    public final long a;
    public final LaunchActivity b;
    public final k5 c;

    public k85(long j, LaunchActivity launchActivity, k5 k5Var) {
        this.a = j;
        this.b = launchActivity;
        this.c = k5Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vc2 vc2Var;
        TLRPC.GroupCall groupCall;
        if (VoIPService.getSharedInstance() != null) {
            jn7.e().n(this, jn7.v2);
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && (vc2Var = sharedInstance.groupCall) != null && (groupCall = vc2Var.b) != null && groupCall.id == this.a && !this.b.isFinishing()) {
                j95.T0(this.b, this.c, null, null, false, null);
            }
        }
    }
}
