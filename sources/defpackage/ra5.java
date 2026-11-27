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
public final class ra5 implements fn7 {
    public static ra5 f0 = null;
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
    public final xa5 W;
    public final e29 X;
    public boolean Y;
    public boolean Z;
    public final pa5 a;
    public boolean a0;
    public final zc b;
    public AnimatorSet b0;
    public final a81 c;
    public final FrameLayout d;
    public final z71 e;
    public ValueAnimator e0;
    public final va5 f;
    public final int h;
    public WindowManager n;
    public boolean r;
    public WindowManager.LayoutParams s;
    public final jc0 w;
    public final b29 x;
    public boolean y;
    public float G = 0.0f;
    public final int[] I = new int[2];
    public final float[] J = new float[2];
    public float M = -1.0f;
    public float N = -1.0f;
    public final na5 U = new na5(this, (byte) 0);
    public final na5 V = new na5(this, (byte) 1);
    public boolean c0 = false;
    public float d0 = 0.0f;

    public ra5(final Context context, int i) {
        this.h = i;
        pa5 pa5Var = new pa5(this, context, ViewConfiguration.get(context).getScaledTouchSlop());
        this.a = pa5Var;
        pa5Var.setAlpha(0.7f);
        xa5 xa5Var = new xa5(context, i);
        this.W = xa5Var;
        pa5Var.addView(xa5Var, tre.e(-1, -1, 17));
        jc0 jc0Var = new jc0(context, true);
        this.w = jc0Var;
        jc0Var.setStyle(5);
        jc0Var.setCentered(true);
        jc0Var.setVisibility(8);
        jc0Var.setDelegate(new ea5(this, (byte) 1));
        h(false);
        pa5Var.addView(jc0Var, tre.e(108, 36, 49));
        zc zcVar = new zc((byte) 24, context, this);
        this.b = zcVar;
        a81 a81Var = new a81(this, context);
        this.c = a81Var;
        zcVar.addView(a81Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        ?? imageView = new ImageView(context);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        b29 b29Var = new b29(2131624043, hl.L(40.0f), hl.L(40.0f), true, null);
        this.x = b29Var;
        b29Var.h = true;
        imageView.setAnimation(b29Var);
        imageView.setColorFilter(-1);
        frameLayout.addView((View) imageView, tre.d(40, 40.0f, 17, 0.0f, 0.0f, 0.0f, 25.0f));
        z71 z71Var = new z71(this, context, (byte) 2);
        this.e = z71Var;
        z71Var.setOnClickListener(new mh3(this, (byte) 29));
        z71Var.setClipChildren(false);
        final ?? linearLayout = new LinearLayout(context);
        linearLayout.f = new RectF();
        Paint paint = new Paint(1);
        linearLayout.h = paint;
        linearLayout.x = true;
        linearLayout.setOrientation(1);
        linearLayout.y = i;
        paint.setAlpha(234);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        de0 de0Var = new de0(context);
        linearLayout.e = de0Var;
        de0Var.setRoundRadius(hl.L(22.0f));
        frameLayout2.addView(de0Var, tre.c(44.0f, 44));
        int L = hl.L(6.0f);
        int o = vm2.o(-1, 76);
        frameLayout2.setBackground(aob.i0(L, L, L, L, 0, o, o));
        frameLayout2.setOnClickListener(new sa5(linearLayout, (byte) 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        linearLayout.a = textView;
        textView.setTextColor(-1);
        textView.setTextSize(15.0f);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(hl.o());
        TextView m = ik8.m(linearLayout2, textView, tre.o(-1, -2), context);
        linearLayout.b = m;
        m.setTextSize(12.0f);
        m.setTextColor(vm2.o(-1, 153));
        linearLayout2.addView(m, tre.o(-1, -2));
        frameLayout2.addView(linearLayout2, tre.d(-1, -2.0f, 16, 55.0f, 0.0f, 0.0f, 0.0f));
        linearLayout.addView(frameLayout2, tre.t(-1, -2, 0, 10, 10, 10, 10));
        kmc kmcVar = new kmc(context, 44.0f);
        linearLayout.c = kmcVar;
        kmcVar.setTextSize(12);
        kmcVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Context context2 = context;
                va5 va5Var = linearLayout;
                switch (b) {
                    case 0:
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(va5Var.getContext(), Settings.canDrawOverlays(context2));
                            return;
                        }
                        return;
                    case 1:
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = va5Var.d.h;
                                hl.z3(textViewArr[0]);
                                hl.z3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        j95.m1(va5Var.getContext(), new xf1(context2, (byte) 3), Settings.canDrawOverlays(context2), false);
                        return;
                }
            }
        });
        kmcVar.setCheckable(true);
        kmcVar.a(vm2.o(-1, 38), vm2.o(-1, 76));
        kmc kmcVar2 = new kmc(context, 44.0f);
        linearLayout.d = kmcVar2;
        kmcVar2.setTextSize(12);
        kmcVar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Context context2 = context;
                va5 va5Var = linearLayout;
                switch (b) {
                    case 0:
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(va5Var.getContext(), Settings.canDrawOverlays(context2));
                            return;
                        }
                        return;
                    case 1:
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = va5Var.d.h;
                                hl.z3(textViewArr[0]);
                                hl.z3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        j95.m1(va5Var.getContext(), new xf1(context2, (byte) 3), Settings.canDrawOverlays(context2), false);
                        return;
                }
            }
        });
        kmc kmcVar3 = new kmc(context, 44.0f);
        kmcVar3.setTextSize(12);
        kmcVar3.c(2131230918, -1, -3257782, 0.3f, false, ob6.M0(2131743016, null), false, false);
        kmcVar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                Context context2 = context;
                va5 va5Var = linearLayout;
                switch (b) {
                    case 0:
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(va5Var.getContext(), Settings.canDrawOverlays(context2));
                            return;
                        }
                        return;
                    case 1:
                        if (VoIPService.getSharedInstance() != null) {
                            if (VoIPService.getSharedInstance().mutedByAdmin()) {
                                TextView[] textViewArr = va5Var.d.h;
                                hl.z3(textViewArr[0]);
                                hl.z3(textViewArr[1]);
                                try {
                                    Vibrator vibrator = (Vibrator) context2.getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                    return;
                                }
                            }
                            VoIPService.getSharedInstance().setMicMute(!VoIPService.getSharedInstance().isMicMute(), false, true);
                            return;
                        }
                        return;
                    default:
                        j95.m1(va5Var.getContext(), new xf1(context2, (byte) 3), Settings.canDrawOverlays(context2), false);
                        return;
                }
            }
        });
        ljc ljcVar = new ljc(context);
        ljcVar.setChildSize(68);
        ljcVar.setUseStartPadding(false);
        ljcVar.addView(kmcVar, tre.c(63.0f, 68));
        ljcVar.addView(kmcVar2, tre.c(63.0f, 68));
        ljcVar.addView(kmcVar3, tre.c(63.0f, 68));
        linearLayout.setWillNotDraw(false);
        linearLayout.addView(ljcVar, tre.t(-1, -2, 0, 6, 0, 6, 0));
        this.f = linearLayout;
        z71Var.addView((View) linearLayout, tre.c(-2.0f, -2));
    }

    public static WindowManager.LayoutParams b(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = hl.L(105.0f);
        layoutParams.width = hl.L(105.0f);
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
        ra5 ra5Var = f0;
        if (ra5Var != null) {
            ra5Var.f(false);
            ra5 ra5Var2 = f0;
            WindowManager windowManager = ra5Var2.n;
            pa5 pa5Var = ra5Var2.a;
            pa5Var.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new la5(pa5Var, ra5Var2.b, ra5Var2.d, windowManager, ra5Var2.e)).start();
            f0.e();
            f0 = null;
            cb5.d();
            jn7.e().k(jn7.F2, new Object[0]);
        }
    }

    public static boolean d() {
        VoIPService sharedInstance;
        if (!ir9.d() && f0 == null) {
            if (a.G && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp() && !g0) {
                if (a.y || !j95.t5) {
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
        ra5 ra5Var;
        cb5 cb5Var;
        cb5.e();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.groupCall != null && !sharedInstance.isHangingUp()) {
            z = true;
        } else {
            z = false;
        }
        Context context2 = a.b;
        Typeface typeface = hl.a;
        boolean canDrawOverlays = Settings.canDrawOverlays(context2);
        Activity W = hl.W(context);
        if (!ir9.d() && (!canDrawOverlays ? !(!z || g0 || W == null || a.y || j95.t5 || hl.F1(W) || ((cb5Var = cb5.e) != null && cb5Var.b != null)) : !(!z || g0 || (!a.y && j95.t5)))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (ra5Var = f0) != null && ra5Var.r != canDrawOverlays) {
            c();
        }
        if (z2) {
            int account = sharedInstance.getAccount();
            if (f0 == null) {
                boolean canDrawOverlays2 = Settings.canDrawOverlays(a.b);
                Activity W2 = hl.W(context);
                if (canDrawOverlays2 || W2 != null) {
                    ra5 ra5Var2 = new ra5(context, account);
                    f0 = ra5Var2;
                    ra5Var2.r = canDrawOverlays2;
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
                    b2.width = hl.L(100.0f);
                    b2.height = hl.L(150.0f);
                    windowManager.addView(f0.b, b2);
                    WindowManager.LayoutParams b3 = b(context);
                    ra5 ra5Var3 = f0;
                    ra5Var3.s = b3;
                    windowManager.addView(ra5Var3.a, b3);
                    WindowManager.LayoutParams b4 = b(context);
                    b4.gravity = 81;
                    b4.width = hl.L(100.0f);
                    b4.height = hl.L(150.0f);
                    windowManager.addView(f0.d, b4);
                    f0.b.setVisibility(8);
                    f0.a.setScaleX(0.5f);
                    f0.a.setScaleY(0.5f);
                    f0.a.setAlpha(0.0f);
                    f0.a.animate().alpha(0.7f).scaleY(1.0f).scaleX(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).start();
                    jn7.f(f0.h).a(f0, jn7.w2);
                    jn7.e().a(f0, jn7.R4);
                    jn7.e().a(f0, jn7.D2);
                    cb5.d();
                }
            }
            ra5 ra5Var4 = f0;
            if (ra5Var4 != null) {
                jc0 jc0Var = ra5Var4.w;
                if (jc0Var.getTag() == null) {
                    jc0Var.animate().setListener(null).cancel();
                    if (jc0Var.getVisibility() != 0) {
                        jc0Var.setVisibility(0);
                        jc0Var.setAlpha(0.0f);
                        jc0Var.setScaleX(0.5f);
                        jc0Var.setScaleY(0.5f);
                    }
                    jc0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    jc0Var.setTag(1);
                    return;
                }
                return;
            }
            return;
        }
        ra5 ra5Var5 = f0;
        if (ra5Var5 != null && !ra5Var5.r) {
            ra5Var5.a.setVisibility(8);
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
            pa5 pa5Var = this.a;
            if (z) {
                pa5Var.animate().alpha(1.0f).start();
            } else {
                pa5Var.animate().alpha(0.7f).start();
            }
            this.W.setPressedState(z);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != jn7.w2 && i != jn7.R4) {
            if (i == jn7.D2) {
                k(a.b);
                return;
            }
            return;
        }
        h(true);
    }

    public final void e() {
        jn7.f(this.h).n(this, jn7.w2);
        jn7.e().n(this, jn7.R4);
        jn7.e().n(this, jn7.F2);
        jn7.e().n(this, jn7.D2);
    }

    public final void f(boolean z) {
        if (z != this.y) {
            this.y = z;
            z71 z71Var = this.e;
            z71Var.animate().setListener(null).cancel();
            boolean z2 = this.y;
            va5 va5Var = this.f;
            if (z2) {
                if (z71Var.getVisibility() != 0) {
                    z71Var.setVisibility(0);
                    z71Var.setAlpha(0.0f);
                    va5Var.setScaleX(0.7f);
                    va5Var.setScaleY(0.7f);
                }
                z71Var.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 4));
                z71Var.animate().alpha(1.0f).setDuration(150L).start();
                va5Var.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else {
                va5Var.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
                z71Var.animate().alpha(0.0f).setDuration(150L).setListener(new ma5(this, (byte) 1)).start();
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
            a81 a81Var = this.c;
            if (z) {
                zc zcVar = this.b;
                if (zcVar.getVisibility() != 0) {
                    zcVar.setVisibility(0);
                    a81Var.setAlpha(0.0f);
                    a81Var.setScaleX(0.5f);
                    a81Var.setScaleY(0.5f);
                    this.x.H(0);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b0 = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(a81Var, View.ALPHA, a81Var.getAlpha(), 1.0f), ObjectAnimator.ofFloat(a81Var, View.SCALE_X, a81Var.getScaleX(), 1.0f), ObjectAnimator.ofFloat(a81Var, View.SCALE_Y, a81Var.getScaleY(), 1.0f));
                this.b0.setDuration(150L).start();
                return;
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.b0 = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(a81Var, View.ALPHA, a81Var.getAlpha(), 0.0f), ObjectAnimator.ofFloat(a81Var, View.SCALE_X, a81Var.getScaleX(), 0.5f), ObjectAnimator.ofFloat(a81Var, View.SCALE_Y, a81Var.getScaleY(), 0.5f));
            this.b0.addListener(new ma5(this, (byte) 0));
            this.b0.setDuration(150L);
            this.b0.start();
        }
    }

    public final void h(boolean z) {
        vc2 vc2Var;
        jc0 jc0Var = this.w;
        ic0 ic0Var = jc0Var.a;
        if (ic0Var.f == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                vc2Var = sharedInstance.groupCall;
            } else {
                vc2Var = null;
            }
            int i = 0;
            int i2 = this.h;
            if (vc2Var != null) {
                ArrayList arrayList = vc2Var.e;
                long selfId = sharedInstance.getSelfId();
                int size = arrayList.size();
                int i3 = 0;
                while (i < 2) {
                    if (i3 < size) {
                        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i3);
                        if (r47.B1(groupCallParticipant.peer) != selfId && SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime <= 500) {
                            jc0Var.b(i, i2, groupCallParticipant);
                        }
                        i3++;
                    } else {
                        jc0Var.b(i, i2, null);
                    }
                    i++;
                    i3++;
                }
                jc0Var.b(2, i2, null);
                jc0Var.a(z);
                return;
            }
            while (i < 3) {
                jc0Var.b(i, i2, null);
                i++;
            }
            jc0Var.a(z);
            return;
        }
        ic0Var.g = true;
    }

    public final void i() {
        int i = hl.q.x;
        pa5 pa5Var = this.a;
        float min = Math.min(Math.max(this.s.x, -hl.L(36.0f)), hl.L(36.0f) + (i - pa5Var.getMeasuredWidth()));
        int i2 = (min > 0.0f ? 1 : (min == 0.0f ? 0 : -1));
        jc0 jc0Var = this.w;
        if (i2 < 0) {
            jc0Var.setTranslationX(Math.abs(min) / 3.0f);
        } else if (min > i - pa5Var.getMeasuredWidth()) {
            jc0Var.setTranslationX((-Math.abs(min - (i - pa5Var.getMeasuredWidth()))) / 3.0f);
        } else {
            jc0Var.setTranslationX(0.0f);
        }
    }

    public final void j() {
        float f = this.P - this.S;
        zc zcVar = this.b;
        float measuredWidth = (zcVar.getMeasuredWidth() / 2.0f) + f;
        pa5 pa5Var = this.a;
        float measuredWidth2 = measuredWidth - (pa5Var.getMeasuredWidth() / 2.0f);
        float measuredHeight = (((zcVar.getMeasuredHeight() / 2.0f) + (this.O - this.T)) - (pa5Var.getMeasuredHeight() / 2.0f)) - hl.L(25.0f);
        WindowManager.LayoutParams layoutParams = this.s;
        float f2 = this.Q;
        float f3 = this.d0;
        float f4 = 1.0f - f3;
        layoutParams.x = (int) ((measuredWidth2 * f3) + (f2 * f4));
        layoutParams.y = (int) ((measuredHeight * f3) + (f4 * this.R));
        i();
        if (pa5Var.getParent() != null) {
            this.n.updateViewLayout(pa5Var, this.s);
        }
    }
}
