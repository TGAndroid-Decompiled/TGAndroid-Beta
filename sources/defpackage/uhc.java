package defpackage;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class uhc implements View.OnClickListener {
    public final byte a;
    public final iic b;

    public uhc(iic iicVar, byte b) {
        this.a = b;
        this.b = iicVar;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        byte b = this.a;
        int i = 1;
        iic iicVar = this.b;
        switch (b) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    gm.r(iicVar.S0);
                    iicVar.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                if (iicVar.n0 && iicVar.m0 && System.currentTimeMillis() - iicVar.K0 > 500) {
                    gm.r(iicVar.S0);
                    iicVar.R0 = false;
                    iicVar.K0 = System.currentTimeMillis();
                    iicVar.a0.setRelativePosition(iicVar.Z);
                    iicVar.b0 = true;
                    iicVar.H0 = true;
                    iicVar.q0 = iicVar.p0;
                    iicVar.y();
                    return;
                }
                return;
            case 2:
                if (iicVar.H0 && System.currentTimeMillis() - iicVar.K0 > 500) {
                    gm.r(iicVar.S0);
                    iicVar.R0 = false;
                    iicVar.K0 = System.currentTimeMillis();
                    iicVar.Z.setRelativePosition(iicVar.a0);
                    iicVar.b0 = false;
                    iicVar.H0 = false;
                    iicVar.q0 = iicVar.p0;
                    iicVar.y();
                    return;
                }
                return;
            case 3:
                if (System.currentTimeMillis() - iicVar.K0 >= 500) {
                    iicVar.K0 = System.currentTimeMillis();
                    boolean z = iicVar.C0;
                    if (!z && iicVar.B0) {
                        iicVar.c(!z);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (System.currentTimeMillis() - iicVar.K0 >= 500) {
                    iicVar.K0 = System.currentTimeMillis();
                    if (iicVar.B0) {
                        iicVar.c(!iicVar.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (iicVar.L.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    iicVar.s();
                    if (sharedInstance.isBluetoothOn()) {
                        i = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i = 0;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(iicVar.b, false, Integer.valueOf(i));
                    return;
                }
                return;
            default:
                iicVar.g();
                return;
        }
    }
}
