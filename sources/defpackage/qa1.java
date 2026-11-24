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
public final class qa1 extends FrameLayout {
    public final akc a;
    public final la1 b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;
    public final oa1 f;
    public TLRPC.User h;
    public boolean n;
    public long r;

    public qa1(LaunchActivity launchActivity) {
        super(launchActivity);
        this.n = false;
        this.r = SystemClock.elapsedRealtime();
        setBackgroundColor(-14999773);
        akc akcVar = new akc(launchActivity, false, true, false, false);
        this.a = akcVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        zjc zjcVar = akcVar.d;
        zjcVar.setScalingType(scalingType);
        zjcVar.setEnableHardwareScaler(true);
        zjcVar.setRotateTextureWithScreen(true);
        akcVar.b0 = (byte) 1;
        zjcVar.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
        View view = akcVar.h;
        if (view != null) {
            view.setVisibility(8);
        }
        addView(akcVar, qoe.c(-1.0f, -1));
        la1 la1Var = new la1(launchActivity);
        this.b = la1Var;
        addView(la1Var, qoe.c(-1.0f, -1));
        TextView textView = new TextView(launchActivity);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(1);
        textView.setShadowLayer(gm.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        addView(textView, qoe.d(-1, -2.0f, 81, 12.0f, 0.0f, 12.0f, 8.0f));
        TextView textView2 = new TextView(launchActivity);
        this.d = textView2;
        textView2.setTextColor(-1275068417);
        textView2.setTextSize(1, 11.0f);
        textView2.setSingleLine();
        textView2.setGravity(1);
        textView2.setShadowLayer(gm.L(2.0f), 0.0f, 0.0f, Integer.MIN_VALUE);
        textView2.setVisibility(8);
        addView(textView2, qoe.d(-1, -2.0f, 49, 32.0f, 8.0f, 32.0f, 0.0f));
        oa1 oa1Var = new oa1(launchActivity);
        this.f = oa1Var;
        addView(oa1Var, qoe.c(-1.0f, -1));
        oa1Var.a();
        ImageView imageView = new ImageView(launchActivity);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(-1);
        imageView.setBackground(cmb.K(gm.L(28.0f), 1711276032));
        addView(imageView, qoe.d(28, 28.0f, 51, 6.0f, 6.0f, 0.0f, 0.0f));
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
        la1 la1Var = this.b;
        if (user != null && user != this.h) {
            this.h = user;
            sharedInstance.getAccount();
            la1Var.a(user);
            textView.setText(m9c.r(user));
        }
        boolean a = a(sharedInstance);
        boolean z2 = true;
        akc akcVar = this.a;
        if (a && !akcVar.d.isFirstFrameRendered() && SystemClock.elapsedRealtime() - this.r < 1200) {
            z = true;
        } else {
            z = false;
        }
        if (!a || (!akcVar.d.isFirstFrameRendered() && !z)) {
            z2 = false;
        }
        if (this.n != z2) {
            this.n = z2;
            if (z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            la1Var.setVisibility(i2);
            if (z2) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            textView.setVisibility(i3);
        }
        if (sharedInstance.isMicMute()) {
            i = 2131232433;
        } else {
            i = 2131232437;
        }
        this.e.setImageResource(i);
        this.f.c();
        int callState = sharedInstance.getCallState();
        TextView textView2 = this.d;
        if (callState == 5) {
            textView2.setText(jb6.M0(2131742937, null));
            textView2.setVisibility(0);
        } else if (callState != 3) {
            textView2.setText(jb6.M0(2131743103, null));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }
}
