package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class l85 implements Runnable {
    public final m85 a;

    public l85(m85 m85Var) {
        this.a = m85Var;
    }

    @Override
    public final void run() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isMicMute()) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.f(sharedInstance.getSelfId());
            if (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || hc2.w(14, sharedInstance.getChat())) {
                m85 m85Var = this.a;
                gl.e3(m85Var.f, 90L);
                try {
                    m85Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                m85Var.c = true;
            }
        }
    }
}
