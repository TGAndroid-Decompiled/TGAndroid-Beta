package defpackage;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class shc implements ee, ohc, qq7, pkc {
    public final byte a;
    public final iic b;

    public shc(iic iicVar, byte b) {
        this.a = b;
        this.b = iicVar;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        WindowInsets g = wzcVar.g();
        iic iicVar = this.b;
        iicVar.r0 = g;
        ((FrameLayout.LayoutParams) iicVar.j0.getLayoutParams()).bottomMargin = iicVar.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) iicVar.f0.getLayoutParams()).bottomMargin = iicVar.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) iicVar.I.getLayoutParams()).topMargin = iicVar.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) iicVar.J.getLayoutParams()).topMargin = iicVar.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) iicVar.L.getLayoutParams()).topMargin = iicVar.r0.getSystemWindowInsetTop() + gm.L(56.0f);
        ((FrameLayout.LayoutParams) iicVar.Y.getLayoutParams()).topMargin = iicVar.r0.getSystemWindowInsetTop() + gm.L(135.0f);
        ((FrameLayout.LayoutParams) iicVar.O.getLayoutParams()).topMargin = iicVar.r0.getSystemWindowInsetTop() + gm.L(17.0f);
        ((FrameLayout.LayoutParams) iicVar.E.getLayoutParams()).topMargin = iicVar.r0.getSystemWindowInsetTop() + gm.L(93.0f);
        ((FrameLayout.LayoutParams) iicVar.P.getLayoutParams()).topMargin = iicVar.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) iicVar.S.getLayoutParams()).topMargin = iicVar.r0.getSystemWindowInsetTop() + gm.L(118.0f);
        ((FrameLayout.LayoutParams) iicVar.R.getLayoutParams()).topMargin = iicVar.r0.getSystemWindowInsetTop() + gm.L(380.0f);
        ((FrameLayout.LayoutParams) iicVar.a0.getLayoutParams()).bottomMargin = iicVar.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) iicVar.M0.getLayoutParams()).bottomMargin = iicVar.r0.getSystemWindowInsetBottom();
        iicVar.Z.setInsets(iicVar.r0);
        iicVar.a0.setInsets(iicVar.r0);
        iicVar.s.requestLayout();
        cic cicVar = iicVar.o0;
        if (cicVar != null) {
            cicVar.setBottomPadding(iicVar.r0.getSystemWindowInsetBottom());
        }
        return wzc.b;
    }

    @Override
    public final void a(qkc qkcVar) {
        int i;
        byte b = this.a;
        iic iicVar = this.b;
        switch (b) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    gm.r(iicVar.S0);
                    iicVar.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z = !isMicMute;
                    if (iicVar.w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i = 2131754728;
                        } else {
                            i = 2131754727;
                        }
                        qkcVar.announceForAccessibility(jb6.M0(i, null));
                    }
                    sharedInstance.setMicMute(z, false, true);
                    iicVar.q0 = iicVar.p0;
                    iicVar.y();
                    return;
                }
                return;
            default:
                gm.r(iicVar.S0);
                iicVar.R0 = false;
                if (iicVar.b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    iicVar.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    iicVar.t();
                    return;
                }
        }
    }

    @Override
    public final void r(he heVar, int i) {
        this.b.u0.b();
    }
}
