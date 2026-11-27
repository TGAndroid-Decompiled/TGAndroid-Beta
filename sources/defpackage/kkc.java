package defpackage;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;
public final class kkc implements n4 {
    public final mkc a;

    public kkc(mkc mkcVar) {
        this.a = mkcVar;
    }

    public final void a() {
        mkc mkcVar = this.a;
        if (mkcVar.p0 == 17) {
            Intent intent = new Intent(mkcVar.b, VoIPService.class);
            intent.putExtra("user_id", mkcVar.d.id);
            intent.putExtra("is_outgoing", true);
            intent.putExtra("start_incall_activity", false);
            intent.putExtra("video_call", mkcVar.U0);
            intent.putExtra("can_video_call", mkcVar.U0);
            intent.putExtra("account", mkcVar.a);
            try {
                mkcVar.b.startService(intent);
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        } else if (mkcVar.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            mkcVar.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        } else if (VoIPService.getSharedState() != null) {
            mkcVar.i(new azb(this, (byte) 26));
        }
    }

    public final void b() {
        mkc mkcVar = this.a;
        if (mkcVar.p0 == 17) {
            mkcVar.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            mkcVar.u0.b();
        }
    }
}
