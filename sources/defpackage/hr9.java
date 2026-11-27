package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.webrtc.RendererCommon;
public final class hr9 extends FrameLayout {
    public final hmc a;
    public boolean b;
    public boolean c;
    public final long d;
    public final ki7 e;
    public final ir9 f;

    public hr9(ir9 ir9Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = ir9Var;
        this.c = true;
        this.d = SystemClock.elapsedRealtime();
        this.e = new ki7(this, (byte) 23);
        setBackgroundColor(-16777216);
        l91 l91Var = new l91(launchActivity);
        addView(l91Var, tre.c(-1.0f, -1));
        hmc hmcVar = new hmc(launchActivity, false, false, false, false);
        this.a = hmcVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        gmc gmcVar = hmcVar.d;
        gmcVar.setScalingType(scalingType);
        hmcVar.b0 = (byte) 0;
        gmcVar.setRotateTextureWithScreen(true);
        gmcVar.b(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = hmcVar.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(hmcVar, tre.c(-1.0f, -1));
        vc2 c = ir9.c();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (c != null && sharedInstance != null && sharedInstance.getChat() != null) {
            sharedInstance.getAccount();
            l91Var.a(sharedInstance.getChat());
        }
    }

    public final void a() {
        float f;
        boolean a = this.f.b.a(this.d);
        if (this.c == a) {
            return;
        }
        this.c = a;
        hmc hmcVar = this.a;
        hmcVar.animate().cancel();
        ViewPropertyAnimator animate = hmcVar.animate();
        if (a) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ik8.s(animate, f, 200L);
    }
}
