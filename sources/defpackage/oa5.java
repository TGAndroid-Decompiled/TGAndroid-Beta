package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class oa5 implements Runnable {
    public final pa5 a;

    public oa5(pa5 pa5Var) {
        this.a = pa5Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || xc2.w(14, sharedInstance.getChat())) {
                pa5 pa5Var = this.a;
                hl.d3(pa5Var.f, 90L);
                try {
                    pa5Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                pa5Var.c = true;
            }
        }
    }
}
