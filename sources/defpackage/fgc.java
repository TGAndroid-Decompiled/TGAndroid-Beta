package defpackage;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class fgc implements m4 {
    public final hgc a;

    public fgc(hgc hgcVar) {
        this.a = hgcVar;
    }

    public final void a() {
        hgc hgcVar = this.a;
        if (hgcVar.p0 == 17) {
            Intent intent = new Intent(hgcVar.b, VoIPService.class);
            intent.putExtra("user_id", hgcVar.d.id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", hgcVar.U0);
            intent.putExtra("can_video_call", hgcVar.U0);
            intent.putExtra("account", hgcVar.a);
            try {
                hgcVar.b.startService(intent);
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        } else if (hgcVar.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            hgcVar.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            hgcVar.i(new kbc(this, (byte) 9));
        }
    }

    public final void b() {
        hgc hgcVar = this.a;
        if (hgcVar.p0 == 17) {
            hgcVar.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            hgcVar.u0.b();
        }
    }
}
