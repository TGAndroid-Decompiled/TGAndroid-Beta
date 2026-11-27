package defpackage;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class yjc implements View.OnClickListener {
    public final byte a;
    public final mkc b;

    public yjc(mkc mkcVar, byte b) {
        this.a = b;
        this.b = mkcVar;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        byte b = this.a;
        int i = 1;
        mkc mkcVar = this.b;
        switch (b) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    hl.r(mkcVar.S0);
                    mkcVar.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                if (mkcVar.n0 && mkcVar.m0 && System.currentTimeMillis() - mkcVar.K0 > 500) {
                    hl.r(mkcVar.S0);
                    mkcVar.R0 = false;
                    mkcVar.K0 = System.currentTimeMillis();
                    mkcVar.a0.setRelativePosition(mkcVar.Z);
                    mkcVar.b0 = true;
                    mkcVar.H0 = true;
                    mkcVar.q0 = mkcVar.p0;
                    mkcVar.y();
                    return;
                }
                return;
            case 2:
                if (mkcVar.H0 && System.currentTimeMillis() - mkcVar.K0 > 500) {
                    hl.r(mkcVar.S0);
                    mkcVar.R0 = false;
                    mkcVar.K0 = System.currentTimeMillis();
                    mkcVar.Z.setRelativePosition(mkcVar.a0);
                    mkcVar.b0 = false;
                    mkcVar.H0 = false;
                    mkcVar.q0 = mkcVar.p0;
                    mkcVar.y();
                    return;
                }
                return;
            case 3:
                if (System.currentTimeMillis() - mkcVar.K0 >= 500) {
                    mkcVar.K0 = System.currentTimeMillis();
                    boolean z = mkcVar.C0;
                    if (!z && mkcVar.B0) {
                        mkcVar.c(!z);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (System.currentTimeMillis() - mkcVar.K0 >= 500) {
                    mkcVar.K0 = System.currentTimeMillis();
                    if (mkcVar.B0) {
                        mkcVar.c(!mkcVar.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (mkcVar.L.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    mkcVar.s();
                    if (sharedInstance.isBluetoothOn()) {
                        i = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i = 0;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(mkcVar.b, false, Integer.valueOf(i));
                    return;
                }
                return;
            default:
                mkcVar.g();
                return;
        }
    }
}
