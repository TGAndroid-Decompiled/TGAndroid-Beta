package defpackage;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class rfc implements ed, ofc, no7, pic {
    public final byte a;
    public final hgc b;

    public rfc(hgc hgcVar, byte b) {
        this.a = b;
        this.b = hgcVar;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        WindowInsets g = vxcVar.g();
        hgc hgcVar = this.b;
        hgcVar.r0 = g;
        ((FrameLayout.LayoutParams) hgcVar.j0.getLayoutParams()).bottomMargin = hgcVar.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hgcVar.f0.getLayoutParams()).bottomMargin = hgcVar.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hgcVar.I.getLayoutParams()).topMargin = hgcVar.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hgcVar.J.getLayoutParams()).topMargin = hgcVar.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hgcVar.L.getLayoutParams()).topMargin = hgcVar.r0.getSystemWindowInsetTop() + gl.L(56.0f);
        ((FrameLayout.LayoutParams) hgcVar.Y.getLayoutParams()).topMargin = hgcVar.r0.getSystemWindowInsetTop() + gl.L(135.0f);
        ((FrameLayout.LayoutParams) hgcVar.O.getLayoutParams()).topMargin = hgcVar.r0.getSystemWindowInsetTop() + gl.L(17.0f);
        ((FrameLayout.LayoutParams) hgcVar.E.getLayoutParams()).topMargin = hgcVar.r0.getSystemWindowInsetTop() + gl.L(93.0f);
        ((FrameLayout.LayoutParams) hgcVar.P.getLayoutParams()).topMargin = hgcVar.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hgcVar.S.getLayoutParams()).topMargin = hgcVar.r0.getSystemWindowInsetTop() + gl.L(118.0f);
        ((FrameLayout.LayoutParams) hgcVar.R.getLayoutParams()).topMargin = hgcVar.r0.getSystemWindowInsetTop() + gl.L(380.0f);
        ((FrameLayout.LayoutParams) hgcVar.a0.getLayoutParams()).bottomMargin = hgcVar.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hgcVar.M0.getLayoutParams()).bottomMargin = hgcVar.r0.getSystemWindowInsetBottom();
        hgcVar.Z.setInsets(hgcVar.r0);
        hgcVar.a0.setInsets(hgcVar.r0);
        hgcVar.s.requestLayout();
        bgc bgcVar = hgcVar.o0;
        if (bgcVar != null) {
            bgcVar.setBottomPadding(hgcVar.r0.getSystemWindowInsetBottom());
        }
        return vxc.b;
    }

    @Override
    public final void a(qic qicVar) {
        int i;
        byte b = this.a;
        hgc hgcVar = this.b;
        switch (b) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    gl.r(hgcVar.S0);
                    hgcVar.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z = !isMicMute;
                    if (hgcVar.w0.isTouchExplorationEnabled()) {
                        if (!isMicMute) {
                            i = 2131754728;
                        } else {
                            i = 2131754727;
                        }
                        qicVar.announceForAccessibility(k96.M0(i, null));
                    }
                    sharedInstance.setMicMute(z, false, true);
                    hgcVar.q0 = hgcVar.p0;
                    hgcVar.y();
                    return;
                }
                return;
            default:
                gl.r(hgcVar.S0);
                hgcVar.R0 = false;
                if (hgcVar.b.checkSelfPermission("android.permission.CAMERA") != 0) {
                    hgcVar.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    return;
                } else {
                    hgcVar.t();
                    return;
                }
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        this.b.u0.b();
    }
}
