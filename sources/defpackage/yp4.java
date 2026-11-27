package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class yp4 {
    public xp4[] a;
    public xp4 b;
    public xp4 c;
    public xp4 d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public long j;
    public float k;
    public ArrayList l;
    public Paint m;
    public Path n;

    public final void a(float f) {
        this.g = f;
        float f2 = this.e;
        this.h = (f - f2) / 250.0f;
        this.i = (f - f2) / 120.0f;
    }

    public final void b(int i, boolean z) {
        xp4 xp4Var;
        xp4 xp4Var2 = this.b;
        if (xp4Var2 != null && xp4Var2.i == i) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.b == null) {
            this.b = this.d;
            return;
        }
        if (z) {
            xp4Var = this.b;
        } else {
            xp4Var = null;
        }
        this.c = xp4Var;
        this.b = this.a[i];
        if (xp4Var != null) {
            this.k = 0.0f;
        } else {
            this.k = 1.0f;
        }
    }

    public final void c(boolean z) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int callState = sharedInstance.getCallState();
            if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
                b(2, z);
                return;
            }
            vc2 vc2Var = sharedInstance.groupCall;
            if (vc2Var != null) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(sharedInstance.getSelfId());
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !xc2.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.b.rtmp_stream) {
                    sharedInstance.setMicMute(true, false, false);
                    b(3, z);
                    return;
                }
                b(sharedInstance.isMicMute() ? 1 : 0, z);
                return;
            }
            b(sharedInstance.isMicMute() ? 1 : 0, z);
        }
    }
}
