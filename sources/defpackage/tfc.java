package defpackage;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class tfc implements View.OnClickListener {
    public final byte a;
    public final hgc b;

    public tfc(hgc hgcVar, byte b) {
        this.a = b;
        this.b = hgcVar;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        byte b = this.a;
        int i = 1;
        hgc hgcVar = this.b;
        switch (b) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    gl.r(hgcVar.S0);
                    hgcVar.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                if (hgcVar.n0 && hgcVar.m0 && System.currentTimeMillis() - hgcVar.K0 > 500) {
                    gl.r(hgcVar.S0);
                    hgcVar.R0 = false;
                    hgcVar.K0 = System.currentTimeMillis();
                    hgcVar.a0.setRelativePosition(hgcVar.Z);
                    hgcVar.b0 = true;
                    hgcVar.H0 = true;
                    hgcVar.q0 = hgcVar.p0;
                    hgcVar.y();
                    return;
                }
                return;
            case 2:
                if (hgcVar.H0 && System.currentTimeMillis() - hgcVar.K0 > 500) {
                    gl.r(hgcVar.S0);
                    hgcVar.R0 = false;
                    hgcVar.K0 = System.currentTimeMillis();
                    hgcVar.Z.setRelativePosition(hgcVar.a0);
                    hgcVar.b0 = false;
                    hgcVar.H0 = false;
                    hgcVar.q0 = hgcVar.p0;
                    hgcVar.y();
                    return;
                }
                return;
            case 3:
                if (System.currentTimeMillis() - hgcVar.K0 >= 500) {
                    hgcVar.K0 = System.currentTimeMillis();
                    boolean z = hgcVar.C0;
                    if (!z && hgcVar.B0) {
                        hgcVar.c(!z);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (System.currentTimeMillis() - hgcVar.K0 >= 500) {
                    hgcVar.K0 = System.currentTimeMillis();
                    if (hgcVar.B0) {
                        hgcVar.c(!hgcVar.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (hgcVar.L.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    hgcVar.s();
                    if (sharedInstance.isBluetoothOn()) {
                        i = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i = 0;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(hgcVar.b, false, Integer.valueOf(i));
                    return;
                }
                return;
            default:
                hgcVar.g();
                return;
        }
    }
}
