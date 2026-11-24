package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class tn4 {
    public sn4[] a;
    public sn4 b;
    public sn4 c;
    public sn4 d;
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
        sn4 sn4Var;
        sn4 sn4Var2 = this.b;
        if (sn4Var2 != null && sn4Var2.i == i) {
            return;
        }
        if (VoIPService.getSharedInstance() == null && this.b == null) {
            this.b = this.d;
            return;
        }
        if (z) {
            sn4Var = this.b;
        } else {
            sn4Var = null;
        }
        this.c = sn4Var;
        this.b = this.a[i];
        if (sn4Var != null) {
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
            fc2 fc2Var = sharedInstance.groupCall;
            if (fc2Var != null) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) fc2Var.d.f(sharedInstance.getSelfId());
                if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !hc2.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.b.rtmp_stream) {
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
