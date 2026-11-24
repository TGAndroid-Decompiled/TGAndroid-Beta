package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
import org.webrtc.RendererCommon;
public final class sp9 extends FrameLayout {
    public final akc a;
    public boolean b;
    public boolean c;
    public final long d;
    public final ei7 e;
    public final tp9 f;

    public sp9(tp9 tp9Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = tp9Var;
        this.c = true;
        this.d = SystemClock.elapsedRealtime();
        this.e = new ei7(this, (byte) 23);
        setBackgroundColor(-16777216);
        la1 la1Var = new la1(launchActivity);
        addView(la1Var, qoe.c(-1.0f, -1));
        akc akcVar = new akc(launchActivity, false, false, false, false);
        this.a = akcVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        zjc zjcVar = akcVar.d;
        zjcVar.setScalingType(scalingType);
        akcVar.b0 = (byte) 0;
        zjcVar.setRotateTextureWithScreen(true);
        zjcVar.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = akcVar.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(akcVar, qoe.c(-1.0f, -1));
        qd2 b = tp9.b();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (b != null && sharedInstance != null && sharedInstance.getChat() != null) {
            sharedInstance.getAccount();
            la1Var.a(sharedInstance.getChat());
        }
    }

    public final void a() {
        float f;
        boolean a = this.f.b.a(this.d);
        if (this.c == a) {
            return;
        }
        this.c = a;
        akc akcVar = this.a;
        akcVar.animate().cancel();
        ViewPropertyAnimator animate = akcVar.animate();
        if (a) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        wi8.s(animate, f, 200L);
    }
}
