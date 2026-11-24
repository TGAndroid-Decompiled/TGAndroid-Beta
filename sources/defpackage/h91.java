package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.webrtc.RendererCommon;
public final class h91 extends FrameLayout {
    public final aic a;
    public final c91 b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final f91 f;
    public TLRPC.User h;
    public boolean n;
    public long r;

    public h91(LaunchActivity launchActivity) {
        super(launchActivity);
        this.n = false;
        this.r = SystemClock.elapsedRealtime();
        setBackgroundColor(-14999773);
        aic aicVar = new aic(launchActivity, false, true, false, false);
        this.a = aicVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        zhc zhcVar = aicVar.d;
        zhcVar.setScalingType(scalingType);
        zhcVar.setEnableHardwareScaler(true);
        zhcVar.setRotateTextureWithScreen(true);
        aicVar.b0 = (byte) 1;
        zhcVar.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = aicVar.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(aicVar, nme.c(-1.0f, -1));
        c91 c91Var = new c91(launchActivity);
        this.b = c91Var;
        addView(c91Var, nme.c(-1.0f, -1));
        TextView textView = new TextView(launchActivity);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setShadowLayer(gl.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        addView(textView, nme.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 8.0f));
        TextView textView2 = new TextView(launchActivity);
        this.d = textView2;
        textView2.setTextColor(-1275068417);
        textView2.setTextSize(1, 11.0f);
        textView2.setSingleLine();
        textView2.setGravity(1);
        textView2.setShadowLayer(gl.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        textView2.setVisibility(8);
        addView(textView2, nme.d(-1, -2.0f, 49, 32.0f, 8.0f, 32.0f, 0.0f));
        f91 f91Var = new f91(launchActivity);
        this.f = f91Var;
        addView(f91Var, nme.c(-1.0f, -1));
        f91Var.a();
        ImageView imageView = new ImageView(launchActivity);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(bkb.K(gl.L(28.0f), 1711276032));
        addView(imageView, nme.d(28, 28.0f, 51, 6.0f, 6.0f, 0.0f, 0.0f));
    }

    public static boolean a(VoIPService voIPService) {
        if (voIPService != null && voIPService.getRemoteVideoState() == 2) {
            return true;
        }
        return false;
    }

    public final void b() {
        boolean z;
        int i;
        int i2;
        int i3;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.User user = sharedInstance.getUser();
        TextView textView = this.c;
        c91 c91Var = this.b;
        if (user != null && user != this.h) {
            this.h = user;
            sharedInstance.getAccount();
            c91Var.a(user);
            textView.setText(l7c.q(user));
        }
        boolean a = a(sharedInstance);
        boolean z2 = true;
        aic aicVar = this.a;
        if (a && !aicVar.d.isFirstFrameRendered() && SystemClock.elapsedRealtime() - this.r < 1200) {
            z = true;
        } else {
            z = false;
        }
        if (!a || (!aicVar.d.isFirstFrameRendered() && !z)) {
            z2 = false;
        }
        if (this.n != z2) {
            this.n = z2;
            if (z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            c91Var.setVisibility(i2);
            if (z2) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            textView.setVisibility(i3);
        }
        if (sharedInstance.isMicMute()) {
            i = 2131232432;
        } else {
            i = 2131232436;
        }
        this.e.setImageResource(i);
        this.f.c();
        int callState = sharedInstance.getCallState();
        TextView textView2 = this.d;
        if (callState == 5) {
            textView2.setText(k96.M0(2131743011, null));
            textView2.setVisibility(0);
        } else if (callState != 3) {
            textView2.setText(k96.M0(2131743177, null));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }
}
