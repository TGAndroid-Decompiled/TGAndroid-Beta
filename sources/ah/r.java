package ah;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.na;
import fi.u3;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.zu0;
public final class r extends yg.c implements c6 {
    public final ImageView E;
    public boolean F;
    public final ImageView G;
    public boolean H;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public TL_stories.TL_myBoost K;
    public final zu0 L;
    public int M;
    public final boolean[] f1107s;
    public final lp f1108w;
    public final ImageView f1109x;
    public boolean f1110y;

    public r(Context context, boolean z10, boolean z11, i6 i6Var, boolean z12) {
        super(context, i6Var);
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        this.f1107s = new boolean[1];
        this.H = true;
        this.L = new zu0(this);
        this.d.setTypeface(g0.o());
        this.f61344f.setVisibility(8);
        if (z11) {
            lp lpVar = new lp(21, context, i6Var);
            this.f1108w = lpVar;
            lpVar.b(n6.B5, n6.f29524h5, n6.f29581k7);
            lpVar.setDrawUnchecked(false);
            lpVar.setDrawBackgroundAsArc(3);
            boolean z13 = gd.f24314a0;
            if (z13) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i13 = i12 | 48;
            if (z13) {
                f12 = 0.0f;
            } else {
                f12 = 40.0f;
            }
            addView(lpVar, na.d(24, 24.0f, i13, f12, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            lp lpVar2 = new lp(21, context, i6Var);
            this.f1108w = lpVar2;
            if (z12) {
                lpVar2.b(n6.i7, n6.f29561j7, n6.C5);
            } else {
                lpVar2.b(n6.B5, n6.f29561j7, n6.C5);
            }
            lpVar2.setDrawUnchecked(true);
            lpVar2.setDrawBackgroundAsArc(10);
            addView(lpVar2);
            lpVar2.a(false, false);
            if (gd.f24314a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            lpVar2.setLayoutParams(na.d(24, 24.0f, i7 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.f1108w = null;
        }
        ImageView imageView = new ImageView(context);
        this.f1109x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231247);
        int i14 = n6.f29717rd;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        u6.s(imageView, i14, i6Var, mode);
        if (gd.f24314a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView, na.d(32, 32.0f, i10 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231850);
        int i15 = n6.Fi;
        u6.s(imageView2, i15, i6Var, mode);
        boolean z14 = gd.f24314a0;
        if (z14) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        int i16 = i11 | 16;
        if (z14) {
            f10 = 52.0f;
        } else {
            f10 = 12.0f;
        }
        if (z14) {
            f11 = 12.0f;
        } else {
            f11 = 52.0f;
        }
        addView(imageView2, na.d(32, 32.0f, i16, f10, 0.0f, f11, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231919);
        u6.s(imageView3, i15, i6Var, mode);
        addView(imageView3, na.d(32, 32.0f, (gd.f24314a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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
        hashSet.add(Integer.valueOf(n6.f29865z9));
    }

    @Override
    public final boolean b() {
        lp lpVar = this.f1108w;
        if (lpVar != null && lpVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        lp lpVar = this.f1108w;
        if (lpVar != null && lpVar.getVisibility() == 0) {
            lpVar.a(z10, z11);
        }
    }

    public final void g(boolean z10, boolean z11) {
        float f10;
        int i7;
        float f11;
        Runnable runnable;
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        float f12 = 0.0f;
        int i10 = 0;
        ImageView imageView = this.G;
        ImageView imageView2 = this.E;
        if (z11) {
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate = imageView2.animate();
            if (z10 && this.f1110y) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            Runnable runnable2 = null;
            if (z10 && this.f1110y) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final r f1105b;

                    {
                        this.f1105b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f1105b.E.setVisibility(8);
                                return;
                            default:
                                this.f1105b.G.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha.withEndAction(runnable).start();
            imageView.setVisibility(0);
            ViewPropertyAnimator animate2 = imageView.animate();
            if (z10 && this.F) {
                f12 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f12);
            if (!z10 || !this.F) {
                runnable2 = new Runnable(this) {
                    public final r f1105b;

                    {
                        this.f1105b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f1105b.E.setVisibility(8);
                                return;
                            default:
                                this.f1105b.G.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f1110y) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView2.setAlpha(f10);
        if (z10 && this.f1110y) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView2.setVisibility(i7);
        imageView.animate().cancel();
        if (z10 && this.F) {
            f12 = 1.0f;
        }
        imageView.setAlpha(f12);
        if (!z10 || !this.F) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.K;
    }

    public TLRPC.Chat getChat() {
        return this.J;
    }

    public TLRPC.User getUser() {
        return this.I;
    }

    public final void h(int i7, TLRPC.Chat chat) {
        float f10;
        int i10;
        String N0;
        float f11;
        String str;
        this.f1109x.setVisibility(8);
        this.J = chat;
        this.I = null;
        a9 a9Var = this.f61341b;
        a9Var.q(chat);
        if (v3.c0(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int L = g0.L(f10);
        p9 p9Var = this.f61342c;
        p9Var.setRoundRadius(L);
        p9Var.f(chat, a9Var);
        String str2 = chat.title;
        u3 u3Var = this.d;
        u3Var.k(str2);
        u3Var.i(null);
        if (i7 <= 0) {
            i7 = chat.participants_count;
        }
        boolean V = v3.V(chat);
        if (i7 >= 1) {
            if (V) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            N0 = gd.G(i7, str, new Object[0]);
        } else {
            if (V) {
                i10 = 2131751378;
            } else {
                i10 = 2131754876;
            }
            N0 = gd.N0(i10, null);
        }
        setSubtitle(N0);
        u6.X(this.f61343e, n6.f29709r5, this.f61340a);
        if (i7 > 200) {
            f11 = 0.3f;
        } else {
            f11 = 1.0f;
        }
        i(false, f11);
    }

    public final void i(boolean z10, float f10) {
        lp lpVar = this.f1108w;
        if (lpVar != null) {
            if (z10) {
                if (Math.abs(lpVar.getAlpha() - f10) > 0.1d) {
                    lpVar.animate().cancel();
                    lpVar.animate().alpha(f10).start();
                    return;
                }
                return;
            }
            lpVar.animate().cancel();
            lpVar.setAlpha(f10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L.f43047a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L.f43047a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.f1109x.setVisibility(8);
        this.K = tL_myBoost;
        TLRPC.Chat O0 = mp.u1(i10.f24637t0).O0(Long.valueOf(-n5.o(tL_myBoost.peer)));
        this.J = O0;
        a9 a9Var = this.f61341b;
        a9Var.q(O0);
        int L = g0.L(20.0f);
        p9 p9Var = this.f61342c;
        p9Var.setRoundRadius(L);
        p9Var.f(this.J, a9Var);
        String str = this.J.title;
        u3 u3Var = this.d;
        u3Var.k(str);
        int i7 = n6.f29709r5;
        i6 i6Var = this.f61340a;
        org.telegram.ui.ActionBar.n5 n5Var = this.f61343e;
        u6.X(n5Var, i7, i6Var);
        setSubtitle(gd.a0(null, null, 2131753658, gd.E0().o0().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 > 0) {
            setSubtitle(gd.a0(null, null, 2131753591, f((i10 * 1000) - System.currentTimeMillis())));
            u3Var.setAlpha(0.65f);
            n5Var.setAlpha(0.65f);
            i(false, 0.3f);
            return;
        }
        u3Var.setAlpha(1.0f);
        n5Var.setAlpha(1.0f);
        i(false, 1.0f);
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.f1109x;
        if (onClickListener != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setUser(TLRPC.User user) {
        int i7;
        this.f1109x.setVisibility(8);
        this.I = user;
        this.J = null;
        a9 a9Var = this.f61341b;
        a9Var.r(user);
        int L = g0.L(20.0f);
        p9 p9Var = this.f61342c;
        p9Var.setRoundRadius(L);
        p9Var.f(user, a9Var);
        String q10 = n10.q(user);
        u3 u3Var = this.d;
        u3Var.k(q10);
        boolean[] zArr = this.f1107s;
        zArr[0] = false;
        if (n10.u(user)) {
            int i10 = user.bot_active_users;
            if (i10 > 0) {
                setSubtitle(gd.H(',', "BotUsers", i10));
            } else {
                setSubtitle(gd.N0(2131753153, null));
            }
        } else {
            setSubtitle(gd.d0(i10.f24637t0, user, zArr, null));
        }
        if (zArr[0]) {
            i7 = n6.f29632n5;
        } else {
            i7 = n6.f29709r5;
        }
        u6.X(this.f61343e, i7, this.f61340a);
        lp lpVar = this.f1108w;
        if (lpVar != null) {
            lpVar.setAlpha(1.0f);
        }
        int x02 = n6.x0(null, n6.f29865z9, false);
        this.M = x02;
        u3Var.i(this.L.a(user, x02, false));
    }

    @Override
    public final void updateColors() {
        zu0 zu0Var;
        u3 u3Var;
        int x02;
        try {
            if (this.I != null && (zu0Var = this.L) != null && (u3Var = this.d) != null && (x02 = n6.x0(null, n6.f29865z9, false)) != this.M) {
                this.M = x02;
                zu0Var.a(this.I, x02, false);
                u3Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
