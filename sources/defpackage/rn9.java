package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.webrtc.RendererCommon;
public final class rn9 extends FrameLayout {
    public final aic a;
    public boolean b;
    public boolean c;
    public final long d;
    public final bg7 e;
    public final sn9 f;

    public rn9(sn9 sn9Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = sn9Var;
        this.c = true;
        this.d = SystemClock.elapsedRealtime();
        this.e = new bg7(this, (byte) 23);
        setBackgroundColor(-16777216);
        c91 c91Var = new c91(launchActivity);
        addView(c91Var, nme.c(-1.0f, -1));
        aic aicVar = new aic(launchActivity, false, false, false, false);
        this.a = aicVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        zhc zhcVar = aicVar.d;
        zhcVar.setScalingType(scalingType);
        aicVar.b0 = (byte) 0;
        zhcVar.setRotateTextureWithScreen(true);
        zhcVar.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = aicVar.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(aicVar, nme.c(-1.0f, -1));
        fc2 b = sn9.b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (b != null && sharedInstance != null && sharedInstance.getChat() != null) {
            sharedInstance.getAccount();
            c91Var.a(sharedInstance.getChat());
        }
    }

    public final void a() {
        float f;
        boolean a = this.f.b.a(this.d);
        if (this.c == a) {
            return;
        }
        this.c = a;
        aic aicVar = this.a;
        aicVar.animate().cancel();
        ViewPropertyAnimator animate = aicVar.animate();
        if (a) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ug8.s(animate, f, 200L);
    }
}
