package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class oa5 implements jm7 {
    public static oa5 f0 = null;
    public static boolean g0 = true;
    public boolean E;
    public boolean F;
    public boolean H;
    public int K;
    public int L;
    public int O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public final ta5 W;
    public final s09 X;
    public boolean Y;
    public boolean Z;
    public final ma5 a;
    public boolean a0;
    public final yd b;
    public AnimatorSet b0;
    public final a91 c;
    public final FrameLayout d;
    public final z81 e;
    public ValueAnimator e0;
    public final ra5 f;
    public final int h;
    public WindowManager n;
    public boolean r;
    public WindowManager.LayoutParams s;
    public final hd0 w;
    public final p09 x;
    public boolean y;
    public float G = 0.0f;
    public final int[] I = new int[2];
    public final float[] J = new float[2];
    public float M = -1.0f;
    public float N = -1.0f;
    public final ka5 U = new ka5(this, (byte) 0);
    public final ka5 V = new ka5(this, (byte) 1);
    public boolean c0 = false;
    public float d0 = 0.0f;

    public oa5(final Context context, int i) {
        this.h = i;
        ma5 ma5Var = new ma5(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = ma5Var;
        ma5Var.setAlpha(0.7f);
        ta5 ta5Var = new ta5(context, i);
        this.W = ta5Var;
        ma5Var.addView(ta5Var, qoe.e(-1, -1, 17));
        hd0 hd0Var = new hd0(context, true);
        this.w = hd0Var;
        hd0Var.setStyle(5);
        hd0Var.setCentered(true);
        hd0Var.setVisibility(8);
        hd0Var.setDelegate(new qn4(this, (byte) 24));
        h(false);
        ma5Var.addView(hd0Var, qoe.e(108, 36, 49));
        yd ydVar = new yd((byte) 23, context, this);
        this.b = ydVar;
        a91 a91Var = new a91(this, context);
        this.c = a91Var;
        ydVar.addView(a91Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        p09 p09Var = new p09(2131624043, gm.L(40.0f), gm.L(40.0f), true, null);
        this.x = p09Var;
        p09Var.h = true;
        imageView.setAnimation(p09Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, qoe.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        z81 z81Var = new z81(this, context, (byte) 2);
        this.e = z81Var;
        z81Var.setOnClickListener(new ca5(this, (byte) 1));
        z81Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.x = true;
        linearLayout.setOrientation(1);
        linearLayout.y = i;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        bf0 bf0Var = new bf0(context);
        linearLayout.e = bf0Var;
        bf0Var.setRoundRadius(gm.L(22.0f));
        frameLayout2.addView(bf0Var, qoe.c(44.0f, 44));
        int L = gm.L(6.0f);
        int p = on2.p(-1, 76);
        frameLayout2.setBackground(cmb.i0(L, L, L, L, 0, p, p));
        frameLayout2.setOnClickListener(new ca5(linearLayout, (byte) 2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(gm.o());
        TextView m = wi8.m(linearLayout2, textView, qoe.o(-1, -2), context);
        linearLayout.b = m;
        m.setTextSize(12.0f);
        m.setTextColor(on2.p(-1, 153));
        linearLayout2.addView(m, qoe.o(-1, -2));
        frameLayout2.addView(linearLayout2, qoe.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, qoe.t(-1, -2, 0, 10, 10, 10, 10));
        dkc dkcVar = new dkc(context, 44.0f);
        linearLayout.c = dkcVar;
        dkcVar.setTextSize(12);
        dkcVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Context context2 = context;
                ra5 ra5Var = linearLayout;
                switch (b) {
                    case 0:
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ra5Var.getContext(), Settings.canDrawOverlays(context2));
                            return;
                        }
                        return;
                    case 1:
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = ra5Var.d.h;
                                gm.z3(textViewArr[0]);
                                gm.z3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        g95.l1(ra5Var.getContext(), new dh1(context2, (byte) 3), Settings.canDrawOverlays(context2), false);
                        return;
                }
            }
        });
        dkcVar.setCheckable(true);
        dkcVar.a(on2.p(-1, 38), on2.p(-1, 76));
        dkc dkcVar2 = new dkc(context, 44.0f);
        linearLayout.d = dkcVar2;
        dkcVar2.setTextSize(12);
        dkcVar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Context context2 = context;
                ra5 ra5Var = linearLayout;
                switch (b) {
                    case 0:
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ra5Var.getContext(), Settings.canDrawOverlays(context2));
                            return;
                        }
                        return;
                    case 1:
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = ra5Var.d.h;
                                gm.z3(textViewArr[0]);
                                gm.z3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        g95.l1(ra5Var.getContext(), new dh1(context2, (byte) 3), Settings.canDrawOverlays(context2), false);
                        return;
                }
            }
        });
        dkc dkcVar3 = new dkc(context, 44.0f);
        dkcVar3.setTextSize(12);
        dkcVar3.c(2131230919, -1, -3257782, 0.3f, false, jb6.M0(2131743048, null), false, false);
        dkcVar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Context context2 = context;
                ra5 ra5Var = linearLayout;
                switch (b) {
                    case 0:
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(ra5Var.getContext(), Settings.canDrawOverlays(context2));
                            return;
                        }
                        return;
                    case 1:
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = ra5Var.d.h;
                                gm.z3(textViewArr[0]);
                                gm.z3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        g95.l1(ra5Var.getContext(), new dh1(context2, (byte) 3), Settings.canDrawOverlays(context2), false);
                        return;
                }
            }
        });
        mhc mhcVar = new mhc(context);
        mhcVar.setChildSize(68);
        mhcVar.setUseStartPadding(false);
        mhcVar.addView(dkcVar, qoe.c(63.0f, 68));
        mhcVar.addView(dkcVar2, qoe.c(63.0f, 68));
        mhcVar.addView(dkcVar3, qoe.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(mhcVar, qoe.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = linearLayout;
        z81Var.addView((View) linearLayout, qoe.c(-2.0f, -2));
    }

    public static WindowManager.LayoutParams b(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = gm.L(105.0f);
        layoutParams.width = gm.L(105.0f);
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (Settings.canDrawOverlays(context)) {
            if (Build.VERSION.SDK_INT >= 26) {
                layoutParams.type = 2038;
            } else {
                layoutParams.type = 2003;
            }
        } else {
            layoutParams.type = 99;
        }
        layoutParams.flags = 520;
        return layoutParams;
    }

    public static void c() {
        oa5 oa5Var = f0;
        if (oa5Var != null) {
            oa5Var.f(false);
            oa5 oa5Var2 = f0;
            WindowManager windowManager = oa5Var2.n;
            ma5 ma5Var = oa5Var2.a;
            ma5Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new ia5(ma5Var, oa5Var2.b, oa5Var2.d, windowManager, oa5Var2.e)).start();
            f0.e();
            f0 = null;
            za5.d();
            nm7.e().k(nm7.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (!tp9.d() && f0 == null) {
            if (a.G && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !g0) {
                if (a.y || !g95.t5) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void k(Context context) {
        boolean z;
        boolean z2;
        WindowManager windowManager;
        oa5 oa5Var;
        za5 za5Var;
        za5.f();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            z = true;
        } else {
            z = false;
        }
        Context context2 = a.b;
        Typeface typeface = gm.a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = gm.W(context);
        if (!tp9.d() && (!canDrawOverlays ? !(!z || g0 || W == null || a.y || g95.t5 || gm.F1(W) || ((za5Var = za5.e) != null && za5Var.b != null)) : !(!z || g0 || (!a.y && g95.t5)))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (oa5Var = f0) != null && oa5Var.r != canDrawOverlays) {
            c();
        }
        if (z2) {
            int account = sharedInstance.getAccount();
            if (f0 == null) {
                boolean canDrawOverlays2 = Settings.canDrawOverlays(a.b);
                Activity W2 = gm.W(context);
                if (canDrawOverlays2 || W2 != null) {
                    oa5 oa5Var2 = new oa5(context, account);
                    f0 = oa5Var2;
                    oa5Var2.r = canDrawOverlays2;
                    if (canDrawOverlays2) {
                        windowManager = (WindowManager) a.b.getSystemService("window");
                    } else {
                        windowManager = W2.getWindowManager();
                    }
                    f0.n = windowManager;
                    WindowManager.LayoutParams b = b(context);
                    b.width = -1;
                    b.height = -1;
                    b.dimAmount = 0.25f;
                    b.flags = 522;
                    windowManager.addView(f0.e, b);
                    f0.e.setVisibility(8);
                    WindowManager.LayoutParams b2 = b(context);
                    b2.gravity = 81;
                    b2.width = gm.L(100.0f);
                    b2.height = gm.L(150.0f);
                    windowManager.addView(f0.b, b2);
                    WindowManager.LayoutParams b3 = b(context);
                    oa5 oa5Var3 = f0;
                    oa5Var3.s = b3;
                    windowManager.addView(oa5Var3.a, b3);
                    WindowManager.LayoutParams b4 = b(context);
                    b4.gravity = 81;
                    b4.width = gm.L(100.0f);
                    b4.height = gm.L(150.0f);
                    windowManager.addView(f0.d, b4);
                    f0.b.setVisibility(8);
                    f0.a.setScaleX(0.5f);
                    f0.a.setScaleY(0.5f);
                    f0.a.setAlpha(0.0f);
                    f0.a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                    nm7.f(f0.h).a(f0, nm7.w2);
                    nm7.e().a(f0, nm7.S4);
                    nm7.e().a(f0, nm7.D2);
                    za5.d();
                }
            }
            oa5 oa5Var4 = f0;
            if (oa5Var4 != null) {
                hd0 hd0Var = oa5Var4.w;
                if (hd0Var.getTag() == null) {
                    hd0Var.animate().setListener(null).cancel();
                    if (hd0Var.getVisibility() != 0) {
                        hd0Var.setVisibility(0);
                        hd0Var.setAlpha(0.0f);
                        hd0Var.setScaleX(0.5f);
                        hd0Var.setScaleY(0.5f);
                    }
                    hd0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    hd0Var.setTag(1);
                    return;
                }
                return;
            }
            return;
        }
        oa5 oa5Var5 = f0;
        if (oa5Var5 != null && !oa5Var5.r) {
            oa5Var5.a.setVisibility(8);
        }
        c();
    }

    public final void a() {
        boolean z;
        if (!this.Z && !this.y) {
            z = false;
        } else {
            z = true;
        }
        if (this.a0 != z) {
            this.a0 = z;
            ma5 ma5Var = this.a;
            if (z) {
                ma5Var.animate().alpha(1.0f).start();
            } else {
                ma5Var.animate().alpha(0.7f).start();
            }
            this.W.setPressedState(z);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != nm7.w2 && i != nm7.S4) {
            if (i == nm7.D2) {
                k(a.b);
                return;
            }
            return;
        }
        h(true);
    }

    public final void e() {
        nm7.f(this.h).n(this, nm7.w2);
        nm7.e().n(this, nm7.S4);
        nm7.e().n(this, nm7.F2);
        nm7.e().n(this, nm7.D2);
    }

    public final void f(boolean z) {
        if (z != this.y) {
            this.y = z;
            z81 z81Var = this.e;
            z81Var.animate().setListener(null).cancel();
            boolean z2 = this.y;
            ra5 ra5Var = this.f;
            if (z2) {
                if (z81Var.getVisibility() != 0) {
                    z81Var.setVisibility(0);
                    z81Var.setAlpha(0.0f);
                    ra5Var.setScaleX(0.7f);
                    ra5Var.setScaleY(0.7f);
                }
                z81Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 4));
                z81Var.animate().alpha(1.0f).setDuration(150L).start();
                ra5Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                ra5Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                z81Var.animate().alpha(0.0f).setDuration(150L).setListener(new ja5(this, (byte) 1)).start();
            }
        }
        a();
    }

    public final void g(boolean z) {
        if (this.E != z) {
            this.E = z;
            AnimatorSet animatorSet = this.b0;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.b0.cancel();
            }
            a91 a91Var = this.c;
            if (z) {
                yd ydVar = this.b;
                if (ydVar.getVisibility() != 0) {
                    ydVar.setVisibility(0);
                    a91Var.setAlpha(0.0f);
                    a91Var.setScaleX(0.5f);
                    a91Var.setScaleY(0.5f);
                    this.x.H(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(a91Var, View.ALPHA, a91Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(a91Var, View.SCALE_X, a91Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(a91Var, View.SCALE_Y, a91Var.getScaleY(), 1.0f));
                this.b0.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.b0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(a91Var, View.ALPHA, a91Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(a91Var, View.SCALE_X, a91Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(a91Var, View.SCALE_Y, a91Var.getScaleY(), 0.5f));
            this.b0.addListener(new ja5(this, (byte) 0));
            this.b0.setDuration(150L);
            this.b0.start();
        }
    }

    public final void h(boolean z) {
        qd2 qd2Var;
        hd0 hd0Var = this.w;
        gd0 gd0Var = hd0Var.a;
        if (gd0Var.f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                qd2Var = sharedInstance.groupCall;
            } else {
                qd2Var = null;
            }
            int i = 0;
            int i2 = this.h;
            if (qd2Var != null) {
                ArrayList arrayList = qd2Var.e;
                long selfId = sharedInstance.getSelfId();
                int size = arrayList.size();
                int i3 = 0;
                while (i < 2) {
                    if (i3 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i3);
                        if (k47.B1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                            hd0Var.b(i, i2, groupCallParticipant);
                        }
                        i3++;
                    } else {
                        hd0Var.b(i, i2, null);
                    }
                    i++;
                    i3++;
                }
                hd0Var.b(2, i2, null);
                hd0Var.a(z);
                return;
            }
            while (i < 3) {
                hd0Var.b(i, i2, null);
                i++;
            }
            hd0Var.a(z);
            return;
        }
        gd0Var.g = true;
    }

    public final void i() {
        int i = gm.q.x;
        ma5 ma5Var = this.a;
        float min = Math.min(Math.max(this.s.x, -gm.L(36.0f)), gm.L(36.0f) + (i - ma5Var.getMeasuredWidth()));
        int i2 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        hd0 hd0Var = this.w;
        if (i2 < 0) {
            hd0Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i - ma5Var.getMeasuredWidth()) {
            hd0Var.setTranslationX((-Math.abs(min - (i - ma5Var.getMeasuredWidth()))) / 3.0f);
        } else {
            hd0Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f = this.P - this.S;
        yd ydVar = this.b;
        float measuredWidth = (ydVar.getMeasuredWidth() / 2.0f) + f;
        ma5 ma5Var = this.a;
        float measuredWidth2 = measuredWidth - (ma5Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((ydVar.getMeasuredHeight() / 2.0f) + (this.O - this.T)) - (ma5Var.getMeasuredHeight() / 2.0f)) - gm.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.s;
        float f2 = this.Q;
        float f3 = this.d0;
        float f4 = 1.0f - f3;
        layoutParams.x = (int) ((measuredWidth2 * f3) + (f2 * f4));
        layoutParams.y = (int) ((measuredHeight * f3) + (f4 * this.R));
        i();
        if (ma5Var.getParent() != null) {
            this.n.updateViewLayout(ma5Var, this.s);
        }
    }
}
