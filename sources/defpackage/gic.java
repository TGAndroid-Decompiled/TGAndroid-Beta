package defpackage;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class gic implements m4 {
    public final iic a;

    public gic(iic iicVar) {
        this.a = iicVar;
    }

    public final void a() {
        iic iicVar = this.a;
        if (iicVar.p0 == 17) {
            Intent intent = new Intent(iicVar.b, VoIPService.class);
            intent.putExtra("user_id", iicVar.d.id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", iicVar.U0);
            intent.putExtra("can_video_call", iicVar.U0);
            intent.putExtra("account", iicVar.a);
            try {
                iicVar.b.startService(intent);
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        } else if (iicVar.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            iicVar.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            iicVar.i(new f8c(this, (byte) 17));
        }
    }

    public final void b() {
        iic iicVar = this.a;
        if (iicVar.p0 == 17) {
            iicVar.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            iicVar.u0.b();
        }
    }
}
