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
public final class o85 implements gk7 {
    public static o85 f0 = null;
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
    public final t85 W;
    public final ry8 X;
    public boolean Y;
    public boolean Z;
    public final m85 a;
    public boolean a0;
    public final yc b;
    public AnimatorSet b0;
    public final s71 c;
    public final FrameLayout d;
    public final r71 e;
    public ValueAnimator e0;
    public final r85 f;
    public final int h;
    public WindowManager n;
    public boolean r;
    public WindowManager.LayoutParams s;
    public final hc0 w;
    public final oy8 x;
    public boolean y;
    public float G = 0.0f;
    public final int[] I = new int[2];
    public final float[] J = new float[2];
    public float M = -1.0f;
    public float N = -1.0f;
    public final k85 U = new k85(this, (byte) 0);
    public final k85 V = new k85(this, (byte) 1);
    public boolean c0 = false;
    public float d0 = 0.0f;

    public o85(final Context context, int i) {
        this.h = i;
        m85 m85Var = new m85(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = m85Var;
        m85Var.setAlpha(0.7f);
        t85 t85Var = new t85(context, i);
        this.W = t85Var;
        m85Var.addView(t85Var, nme.e(-1, -1, 17));
        hc0 hc0Var = new hc0(context, true);
        this.w = hc0Var;
        hc0Var.setStyle(5);
        hc0Var.setCentered(true);
        hc0Var.setVisibility(8);
        hc0Var.setDelegate(new iu4(this, (byte) 17));
        h(false);
        m85Var.addView(hc0Var, nme.e(108, 36, 49));
        yc ycVar = new yc((byte) 23, context, this);
        this.b = ycVar;
        s71 s71Var = new s71(this, context);
        this.c = s71Var;
        ycVar.addView(s71Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        oy8 oy8Var = new oy8(2131624043, gl.L(40.0f), gl.L(40.0f), true, null);
        this.x = oy8Var;
        oy8Var.h = true;
        imageView.setAnimation(oy8Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, nme.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        r71 r71Var = new r71(this, context, (byte) 2);
        this.e = r71Var;
        r71Var.setOnClickListener(new yj3(this, (byte) 28));
        r71Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.x = true;
        linearLayout.setOrientation(1);
        linearLayout.y = i;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        be0 be0Var = new be0(context);
        linearLayout.e = be0Var;
        be0Var.setRoundRadius(gl.L(22.0f));
        frameLayout2.addView(be0Var, nme.c(44.0f, 44));
        int L = gl.L(6.0f);
        int o = bm2.o(-1, 76);
        frameLayout2.setBackground(bkb.i0(L, L, L, L, 0, o, o));
        frameLayout2.setOnClickListener(new yj3(linearLayout, (byte) 29));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(gl.o());
        TextView m = ug8.m(linearLayout2, textView, nme.o(-1, -2), context);
        linearLayout.b = m;
        m.setTextSize(12.0f);
        m.setTextColor(bm2.o(-1, 153));
        linearLayout2.addView(m, nme.o(-1, -2));
        frameLayout2.addView(linearLayout2, nme.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, nme.t(-1, -2, 0, 10, 10, 10, 10));
        dic dicVar = new dic(context, 44.0f);
        linearLayout.c = dicVar;
        dicVar.setTextSize(12);
        dicVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Context context2 = context;
                r85 r85Var = linearLayout;
                switch (b) {
                    case 0:
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(r85Var.getContext(), Settings.canDrawOverlays(context2));
                            return;
                        }
                        return;
                    case 1:
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = r85Var.d.h;
                                gl.z3(textViewArr[0]);
                                gl.z3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        h75.l1(r85Var.getContext(), new vf1(context2, (byte) 3), Settings.canDrawOverlays(context2), false);
                        return;
                }
            }
        });
        dicVar.setCheckable(true);
        dicVar.a(bm2.o(-1, 38), bm2.o(-1, 76));
        dic dicVar2 = new dic(context, 44.0f);
        linearLayout.d = dicVar2;
        dicVar2.setTextSize(12);
        dicVar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Context context2 = context;
                r85 r85Var = linearLayout;
                switch (b) {
                    case 0:
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(r85Var.getContext(), Settings.canDrawOverlays(context2));
                            return;
                        }
                        return;
                    case 1:
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = r85Var.d.h;
                                gl.z3(textViewArr[0]);
                                gl.z3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        h75.l1(r85Var.getContext(), new vf1(context2, (byte) 3), Settings.canDrawOverlays(context2), false);
                        return;
                }
            }
        });
        dic dicVar3 = new dic(context, 44.0f);
        dicVar3.setTextSize(12);
        dicVar3.c(2131230918, -1, -3257782, 0.3f, false, k96.M0(2131743122, null), false, false);
        dicVar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Context context2 = context;
                r85 r85Var = linearLayout;
                switch (b) {
                    case 0:
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(r85Var.getContext(), Settings.canDrawOverlays(context2));
                            return;
                        }
                        return;
                    case 1:
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = r85Var.d.h;
                                gl.z3(textViewArr[0]);
                                gl.z3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        h75.l1(r85Var.getContext(), new vf1(context2, (byte) 3), Settings.canDrawOverlays(context2), false);
                        return;
                }
            }
        });
        mfc mfcVar = new mfc(context);
        mfcVar.setChildSize(68);
        mfcVar.setUseStartPadding(false);
        mfcVar.addView(dicVar, nme.c(63.0f, 68));
        mfcVar.addView(dicVar2, nme.c(63.0f, 68));
        mfcVar.addView(dicVar3, nme.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(mfcVar, nme.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = linearLayout;
        r71Var.addView((View) linearLayout, nme.c(-2.0f, -2));
    }

    public static WindowManager.LayoutParams b(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = gl.L(105.0f);
        layoutParams.width = gl.L(105.0f);
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
        o85 o85Var = f0;
        if (o85Var != null) {
            o85Var.f(false);
            o85 o85Var2 = f0;
            WindowManager windowManager = o85Var2.n;
            m85 m85Var = o85Var2.a;
            m85Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new i85(m85Var, o85Var2.b, o85Var2.d, windowManager, o85Var2.e)).start();
            f0.e();
            f0 = null;
            a95.c();
            kk7.e().k(kk7.E2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (!sn9.c() && f0 == null) {
            if (a.G && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !g0) {
                if (a.y || !h75.t5) {
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
        o85 o85Var;
        a95 a95Var;
        a95.d();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            z = true;
        } else {
            z = false;
        }
        Context context2 = a.b;
        Typeface typeface = gl.a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = gl.W(context);
        if (!sn9.c() && (!canDrawOverlays ? !(!z || g0 || W == null || a.y || h75.t5 || gl.F1(W) || ((a95Var = a95.e) != null && a95Var.b != null)) : !(!z || g0 || (!a.y && h75.t5)))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (o85Var = f0) != null && o85Var.r != canDrawOverlays) {
            c();
        }
        if (z2) {
            int account = sharedInstance.getAccount();
            if (f0 == null) {
                boolean canDrawOverlays2 = Settings.canDrawOverlays(a.b);
                Activity W2 = gl.W(context);
                if (canDrawOverlays2 || W2 != null) {
                    o85 o85Var2 = new o85(context, account);
                    f0 = o85Var2;
                    o85Var2.r = canDrawOverlays2;
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
                    b2.width = gl.L(100.0f);
                    b2.height = gl.L(150.0f);
                    windowManager.addView(f0.b, b2);
                    WindowManager.LayoutParams b3 = b(context);
                    o85 o85Var3 = f0;
                    o85Var3.s = b3;
                    windowManager.addView(o85Var3.a, b3);
                    WindowManager.LayoutParams b4 = b(context);
                    b4.gravity = 81;
                    b4.width = gl.L(100.0f);
                    b4.height = gl.L(150.0f);
                    windowManager.addView(f0.d, b4);
                    f0.b.setVisibility(8);
                    f0.a.setScaleX(0.5f);
                    f0.a.setScaleY(0.5f);
                    f0.a.setAlpha(0.0f);
                    f0.a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                    kk7.f(f0.h).a(f0, kk7.v2);
                    kk7.e().a(f0, kk7.Q4);
                    kk7.e().a(f0, kk7.C2);
                    a95.c();
                }
            }
            o85 o85Var4 = f0;
            if (o85Var4 != null) {
                hc0 hc0Var = o85Var4.w;
                if (hc0Var.getTag() == null) {
                    hc0Var.animate().setListener(null).cancel();
                    if (hc0Var.getVisibility() != 0) {
                        hc0Var.setVisibility(0);
                        hc0Var.setAlpha(0.0f);
                        hc0Var.setScaleX(0.5f);
                        hc0Var.setScaleY(0.5f);
                    }
                    hc0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    hc0Var.setTag(1);
                    return;
                }
                return;
            }
            return;
        }
        o85 o85Var5 = f0;
        if (o85Var5 != null && !o85Var5.r) {
            o85Var5.a.setVisibility(8);
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
            m85 m85Var = this.a;
            if (z) {
                m85Var.animate().alpha(1.0f).start();
            } else {
                m85Var.animate().alpha(0.7f).start();
            }
            this.W.setPressedState(z);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.v2 && i != kk7.Q4) {
            if (i == kk7.C2) {
                k(a.b);
                return;
            }
            return;
        }
        h(true);
    }

    public final void e() {
        kk7.f(this.h).n(this, kk7.v2);
        kk7.e().n(this, kk7.Q4);
        kk7.e().n(this, kk7.E2);
        kk7.e().n(this, kk7.C2);
    }

    public final void f(boolean z) {
        if (z != this.y) {
            this.y = z;
            r71 r71Var = this.e;
            r71Var.animate().setListener(null).cancel();
            boolean z2 = this.y;
            r85 r85Var = this.f;
            if (z2) {
                if (r71Var.getVisibility() != 0) {
                    r71Var.setVisibility(0);
                    r71Var.setAlpha(0.0f);
                    r85Var.setScaleX(0.7f);
                    r85Var.setScaleY(0.7f);
                }
                r71Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 4));
                r71Var.animate().alpha(1.0f).setDuration(150L).start();
                r85Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                r85Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                r71Var.animate().alpha(0.0f).setDuration(150L).setListener(new j85(this, (byte) 1)).start();
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
            s71 s71Var = this.c;
            if (z) {
                yc ycVar = this.b;
                if (ycVar.getVisibility() != 0) {
                    ycVar.setVisibility(0);
                    s71Var.setAlpha(0.0f);
                    s71Var.setScaleX(0.5f);
                    s71Var.setScaleY(0.5f);
                    this.x.H(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(s71Var, View.ALPHA, s71Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(s71Var, View.SCALE_X, s71Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(s71Var, View.SCALE_Y, s71Var.getScaleY(), 1.0f));
                this.b0.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.b0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(s71Var, View.ALPHA, s71Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(s71Var, View.SCALE_X, s71Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(s71Var, View.SCALE_Y, s71Var.getScaleY(), 0.5f));
            this.b0.addListener(new j85(this, (byte) 0));
            this.b0.setDuration(150L);
            this.b0.start();
        }
    }

    public final void h(boolean z) {
        fc2 fc2Var;
        hc0 hc0Var = this.w;
        gc0 gc0Var = hc0Var.a;
        if (gc0Var.f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                fc2Var = sharedInstance.groupCall;
            } else {
                fc2Var = null;
            }
            int i = 0;
            int i2 = this.h;
            if (fc2Var != null) {
                ArrayList arrayList = fc2Var.e;
                long selfId = sharedInstance.getSelfId();
                int size = arrayList.size();
                int i3 = 0;
                while (i < 2) {
                    if (i3 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i3);
                        if (k27.B1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                            hc0Var.b(i, i2, groupCallParticipant);
                        }
                        i3++;
                    } else {
                        hc0Var.b(i, i2, null);
                    }
                    i++;
                    i3++;
                }
                hc0Var.b(2, i2, null);
                hc0Var.a(z);
                return;
            }
            while (i < 3) {
                hc0Var.b(i, i2, null);
                i++;
            }
            hc0Var.a(z);
            return;
        }
        gc0Var.g = true;
    }

    public final void i() {
        int i = gl.q.x;
        m85 m85Var = this.a;
        float min = Math.min(Math.max(this.s.x, -gl.L(36.0f)), gl.L(36.0f) + (i - m85Var.getMeasuredWidth()));
        int i2 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        hc0 hc0Var = this.w;
        if (i2 < 0) {
            hc0Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i - m85Var.getMeasuredWidth()) {
            hc0Var.setTranslationX((-Math.abs(min - (i - m85Var.getMeasuredWidth()))) / 3.0f);
        } else {
            hc0Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f = this.P - this.S;
        yc ycVar = this.b;
        float measuredWidth = (ycVar.getMeasuredWidth() / 2.0f) + f;
        m85 m85Var = this.a;
        float measuredWidth2 = measuredWidth - (m85Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((ycVar.getMeasuredHeight() / 2.0f) + (this.O - this.T)) - (m85Var.getMeasuredHeight() / 2.0f)) - gl.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.s;
        float f2 = this.Q;
        float f3 = this.d0;
        float f4 = 1.0f - f3;
        layoutParams.x = (int) ((measuredWidth2 * f3) + (f2 * f4));
        layoutParams.y = (int) ((measuredHeight * f3) + (f4 * this.R));
        i();
        if (m85Var.getParent() != null) {
            this.n.updateViewLayout(m85Var, this.s);
        }
    }
}
