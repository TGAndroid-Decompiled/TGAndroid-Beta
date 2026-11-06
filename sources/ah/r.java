package ah;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ha;
import di.d4;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wo;
public final class r extends yg.c implements a6 {
    public final ImageView D;
    public boolean E;
    public final ImageView F;
    public boolean G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public TL_stories.TL_myBoost J;
    public final nu0 K;
    public int L;
    public final boolean[] f1110s;
    public final wo f1111w;
    public final ImageView f1112x;
    public boolean f1113y;

    public r(Context context, boolean z9, boolean z10, f6 f6Var, boolean z11) {
        super(context, f6Var);
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        this.f1110s = new boolean[1];
        this.G = true;
        this.K = new nu0(this);
        this.d.setTypeface(g0.o());
        this.f59337f.setVisibility(8);
        if (z10) {
            wo woVar = new wo(21, context, f6Var);
            this.f1111w = woVar;
            woVar.b(k6.B5, k6.f27922h5, k6.f27979k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z12 = hd.f22878a0;
            if (z12) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i13 = i12 | 48;
            if (z12) {
                f12 = 0.0f;
            } else {
                f12 = 40.0f;
            }
            addView(woVar, ha.d(24, 24.0f, i13, f12, 33.0f, z12 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z9) {
            wo woVar2 = new wo(21, context, f6Var);
            this.f1111w = woVar2;
            if (z11) {
                woVar2.b(k6.i7, k6.f27959j7, k6.C5);
            } else {
                woVar2.b(k6.B5, k6.f27959j7, k6.C5);
            }
            woVar2.setDrawUnchecked(true);
            woVar2.setDrawBackgroundAsArc(10);
            addView(woVar2);
            woVar2.a(false, false);
            if (hd.f22878a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            woVar2.setLayoutParams(ha.d(24, 24.0f, i7 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.f1111w = null;
        }
        ImageView imageView = new ImageView(context);
        this.f1112x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231244);
        int i14 = k6.f28056od;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView, i14, f6Var, mode);
        if (hd.f22878a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView, ha.d(32, 32.0f, i10 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.D = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231846);
        int i15 = k6.Ci;
        r6.t(imageView2, i15, f6Var, mode);
        boolean z13 = hd.f22878a0;
        if (z13) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        int i16 = i11 | 16;
        if (z13) {
            f10 = 52.0f;
        } else {
            f10 = 12.0f;
        }
        if (z13) {
            f11 = 12.0f;
        } else {
            f11 = 52.0f;
        }
        addView(imageView2, ha.d(32, 32.0f, i16, f10, 0.0f, f11, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231915);
        r6.t(imageView3, i15, f6Var, mode);
        addView(imageView3, ha.d(32, 32.0f, (hd.f22878a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String f(long j3) {
        long j10 = j3 / 3600000;
        long j11 = j3 % 3600000;
        long j12 = j11 / 60000;
        long j13 = (j11 % 60000) / 1000;
        StringBuilder sb2 = new StringBuilder();
        if (j10 > 0) {
            sb2.append(String.format("%02d", Long.valueOf(j10)));
            sb2.append(":");
        }
        sb2.append(String.format("%02d", Long.valueOf(j12)));
        sb2.append(":");
        sb2.append(String.format("%02d", Long.valueOf(j13)));
        return sb2.toString();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.z9));
    }

    @Override
    public final boolean b() {
        wo woVar = this.f1111w;
        if (woVar != null && woVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z9, boolean z10) {
        wo woVar = this.f1111w;
        if (woVar != null && woVar.getVisibility() == 0) {
            woVar.a(z9, z10);
        }
    }

    public final void g(boolean z9, boolean z10) {
        float f10;
        int i7;
        float f11;
        Runnable runnable;
        if (this.G == z9) {
            return;
        }
        this.G = z9;
        float f12 = 0.0f;
        int i10 = 0;
        ImageView imageView = this.F;
        ImageView imageView2 = this.D;
        if (z10) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z9 && this.f1113y) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            Runnable runnable2 = null;
            if (z9 && this.f1113y) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final r f1108b;

                    {
                        this.f1108b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f1108b.D.setVisibility(8);
                                return;
                            default:
                                this.f1108b.F.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha.withEndAction(runnable).start();
            imageView.setVisibility(0);
            ViewPropertyAnimator animate2 = imageView.animate();
            if (z9 && this.E) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f12);
            if (!z9 || !this.E) {
                runnable2 = new Runnable(this) {
                    public final r f1108b;

                    {
                        this.f1108b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f1108b.D.setVisibility(8);
                                return;
                            default:
                                this.f1108b.F.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z9 && this.f1113y) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView2.setAlpha(f10);
        if (z9 && this.f1113y) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView2.setVisibility(i7);
        imageView.animate().cancel();
        if (z9 && this.E) {
            f12 = 1.0f;
        }
        imageView.setAlpha(f12);
        if (!z9 || !this.E) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.J;
    }

    public TLRPC.Chat getChat() {
        return this.I;
    }

    public TLRPC.User getUser() {
        return this.H;
    }

    public final void h(int i7, TLRPC.Chat chat) {
        float f10;
        int i10;
        String M0;
        float f11;
        String str;
        this.f1112x.setVisibility(8);
        this.I = chat;
        this.H = null;
        w8 w8Var = this.f59334b;
        w8Var.q(chat);
        if (t3.c0(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int L = g0.L(f10);
        l9 l9Var = this.f59335c;
        l9Var.setRoundRadius(L);
        l9Var.e(chat, w8Var);
        String str2 = chat.title;
        d4 d4Var = this.d;
        d4Var.k(str2);
        d4Var.i(null);
        if (i7 <= 0) {
            i7 = chat.participants_count;
        }
        boolean V = t3.V(chat);
        if (i7 >= 1) {
            if (V) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            M0 = hd.G(i7, str, new Object[0]);
        } else {
            if (V) {
                i10 = 2131751391;
            } else {
                i10 = 2131754876;
            }
            M0 = hd.M0(i10, null);
        }
        setSubtitle(M0);
        r6.Y(this.f59336e, k6.f28107r5, this.f59333a);
        if (i7 > 200) {
            f11 = 0.3f;
        } else {
            f11 = 1.0f;
        }
        i(false, f11);
    }

    public final void i(boolean z9, float f10) {
        wo woVar = this.f1111w;
        if (woVar != null) {
            if (z9) {
                if (Math.abs(woVar.getAlpha() - f10) > 0.1d) {
                    woVar.animate().cancel();
                    woVar.animate().alpha(f10).start();
                    return;
                }
                return;
            }
            woVar.animate().cancel();
            woVar.setAlpha(f10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.f36426a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.f36426a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.f1112x.setVisibility(8);
        this.J = tL_myBoost;
        TLRPC.Chat M0 = qp.s1(p10.f24467s0).M0(Long.valueOf(-m5.o(tL_myBoost.peer)));
        this.I = M0;
        w8 w8Var = this.f59334b;
        w8Var.q(M0);
        int L = g0.L(20.0f);
        l9 l9Var = this.f59335c;
        l9Var.setRoundRadius(L);
        l9Var.e(this.I, w8Var);
        String str = this.I.title;
        d4 d4Var = this.d;
        d4Var.k(str);
        int i7 = k6.f28107r5;
        f6 f6Var = this.f59333a;
        k5 k5Var = this.f59336e;
        r6.Y(k5Var, i7, f6Var);
        setSubtitle(hd.a0(null, null, 2131753661, hd.E0().o0().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 > 0) {
            setSubtitle(hd.a0(null, null, 2131753594, f((i10 * 1000) - System.currentTimeMillis())));
            d4Var.setAlpha(0.65f);
            k5Var.setAlpha(0.65f);
            i(false, 0.3f);
            return;
        }
        d4Var.setAlpha(1.0f);
        k5Var.setAlpha(1.0f);
        i(false, 1.0f);
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.f1112x;
        if (onClickListener != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setUser(TLRPC.User user) {
        int i7;
        this.f1112x.setVisibility(8);
        this.H = user;
        this.I = null;
        w8 w8Var = this.f59334b;
        w8Var.r(user);
        int L = g0.L(20.0f);
        l9 l9Var = this.f59335c;
        l9Var.setRoundRadius(L);
        l9Var.e(user, w8Var);
        String p10 = t10.p(user);
        d4 d4Var = this.d;
        d4Var.k(p10);
        boolean[] zArr = this.f1110s;
        zArr[0] = false;
        if (t10.t(user)) {
            int i10 = user.bot_active_users;
            if (i10 > 0) {
                setSubtitle(hd.H(',', "BotUsers", i10));
            } else {
                setSubtitle(hd.M0(2131753156, null));
            }
        } else {
            setSubtitle(hd.d0(p10.f24467s0, user, zArr, null));
        }
        if (zArr[0]) {
            i7 = k6.f28030n5;
        } else {
            i7 = k6.f28107r5;
        }
        r6.Y(this.f59336e, i7, this.f59333a);
        wo woVar = this.f1111w;
        if (woVar != null) {
            woVar.setAlpha(1.0f);
        }
        int x02 = k6.x0(null, k6.z9, false);
        this.L = x02;
        d4Var.i(this.K.a(user, x02, false));
    }

    @Override
    public final void updateColors() {
        nu0 nu0Var;
        d4 d4Var;
        int x02;
        try {
            if (this.H != null && (nu0Var = this.K) != null && (d4Var = this.d) != null && (x02 = k6.x0(null, k6.z9, false)) != this.L) {
                this.L = x02;
                nu0Var.a(this.H, x02, false);
                d4Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
