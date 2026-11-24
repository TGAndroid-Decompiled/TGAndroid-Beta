package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.Date;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class m1a extends gg0 implements vlb {
    public final ImageView E;
    public boolean F;
    public final ImageView G;
    public boolean H;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public TL_stories.TL_myBoost K;
    public final d0b L;
    public int M;
    public final boolean[] s;
    public final jh2 w;
    public final ImageView x;
    public boolean y;

    public m1a(Context context, boolean z, boolean z2, ylb ylbVar, boolean z3) {
        super(context, ylbVar);
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        int i4;
        float f3;
        this.s = new boolean[1];
        this.H = true;
        this.L = new d0b(this);
        this.d.setTypeface(gm.o());
        this.f.setVisibility(8);
        if (z2) {
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.w = jh2Var;
            jh2Var.b(cmb.A5, cmb.g5, cmb.j7);
            jh2Var.setDrawUnchecked(false);
            jh2Var.setDrawBackgroundAsArc(3);
            boolean z4 = jb6.a0;
            if (z4) {
                i4 = 5;
            } else {
                i4 = 3;
            }
            int i5 = i4 | 48;
            if (z4) {
                f3 = 0.0f;
            } else {
                f3 = 40.0f;
            }
            addView(jh2Var, qoe.d(24, 24.0f, i5, f3, 33.0f, z4 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z) {
            jh2 jh2Var2 = new jh2(21, ylbVar, context);
            this.w = jh2Var2;
            if (z3) {
                jh2Var2.b(cmb.h7, cmb.i7, cmb.B5);
            } else {
                jh2Var2.b(cmb.A5, cmb.i7, cmb.B5);
            }
            jh2Var2.setDrawUnchecked(true);
            jh2Var2.setDrawBackgroundAsArc(10);
            addView(jh2Var2);
            jh2Var2.a(false, false);
            if (jb6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            jh2Var2.setLayoutParams(qoe.d(24, 24.0f, i | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.w = null;
        }
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231248);
        int i6 = cmb.qd;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView, i6, ylbVar, mode);
        if (jb6.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        addView(imageView, qoe.d(32, 32.0f, i2 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231851);
        int i7 = cmb.Ei;
        anb.s(imageView2, i7, ylbVar, mode);
        boolean z5 = jb6.a0;
        if (z5) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        int i8 = i3 | 16;
        if (z5) {
            f = 52.0f;
        } else {
            f = 12.0f;
        }
        if (z5) {
            f2 = 12.0f;
        } else {
            f2 = 52.0f;
        }
        addView(imageView2, qoe.d(32, 32.0f, i8, f, 0.0f, f2, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231920);
        anb.s(imageView3, i7, ylbVar, mode);
        addView(imageView3, qoe.d(32, 32.0f, (jb6.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String f(long j) {
        long j2 = j / 3600000;
        long j3 = j % 3600000;
        long j4 = j3 / 60000;
        long j5 = (j3 % 60000) / 1000;
        StringBuilder sb = new StringBuilder();
        if (j2 > 0) {
            sb.append(String.format("%02d", Long.valueOf(j2)));
            sb.append(":");
        }
        sb.append(String.format("%02d", Long.valueOf(j4)));
        sb.append(":");
        sb.append(String.format("%02d", Long.valueOf(j5)));
        return sb.toString();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y9));
    }

    @Override
    public final boolean b() {
        jh2 jh2Var = this.w;
        if (jh2Var != null && jh2Var.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z, boolean z2) {
        jh2 jh2Var = this.w;
        if (jh2Var != null && jh2Var.getVisibility() == 0) {
            jh2Var.a(z, z2);
        }
    }

    public final void g(boolean z, boolean z2) {
        float f;
        int i;
        float f2;
        Runnable runnable;
        if (this.H == z) {
            return;
        }
        this.H = z;
        float f3 = 0.0f;
        int i2 = 0;
        ImageView imageView = this.E;
        ImageView imageView2 = this.G;
        if (z2) {
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = imageView.animate();
            if (z && this.y) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f2);
            Runnable runnable2 = null;
            if (z && this.y) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final m1a b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        m1a m1aVar = this.b;
                        switch (b) {
                            case 0:
                                m1aVar.E.setVisibility(8);
                                return;
                            default:
                                m1aVar.G.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha.withEndAction(runnable).start();
            imageView2.setVisibility(0);
            ViewPropertyAnimator animate2 = imageView2.animate();
            if (z && this.F) {
                f3 = 1.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f3);
            if (!z || !this.F) {
                runnable2 = new Runnable(this) {
                    public final m1a b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        m1a m1aVar = this.b;
                        switch (b) {
                            case 0:
                                m1aVar.E.setVisibility(8);
                                return;
                            default:
                                m1aVar.G.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView.animate().cancel();
        if (z && this.y) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        imageView.setAlpha(f);
        if (z && this.y) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        imageView2.animate().cancel();
        if (z && this.F) {
            f3 = 1.0f;
        }
        imageView2.setAlpha(f3);
        if (!z || !this.F) {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
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

    public final void h(int i, TLRPC.Chat chat) {
        float f;
        int i2;
        String M0;
        float f2;
        String str;
        this.x.setVisibility(8);
        this.J = chat;
        this.I = null;
        pc0 pc0Var = this.b;
        pc0Var.p(chat);
        if (sd2.c0(chat)) {
            f = 12.0f;
        } else {
            f = 20.0f;
        }
        int L = gm.L(f);
        bf0 bf0Var = this.c;
        bf0Var.setRoundRadius(L);
        bf0Var.f(chat, pc0Var);
        String str2 = chat.title;
        dg0 dg0Var = this.d;
        dg0Var.k(str2);
        dg0Var.i(null);
        if (i <= 0) {
            i = chat.participants_count;
        }
        boolean V = sd2.V(chat);
        if (i >= 1) {
            if (V) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            M0 = jb6.G(i, str, new Object[0]);
        } else {
            if (V) {
                i2 = 2131751327;
            } else {
                i2 = 2131754876;
            }
            M0 = jb6.M0(i2, null);
        }
        setSubtitle(M0);
        anb.W(this.e, cmb.q5, this.a);
        if (i > 200) {
            f2 = 0.3f;
        } else {
            f2 = 1.0f;
        }
        i(false, f2);
    }

    public final void i(boolean z, float f) {
        jh2 jh2Var = this.w;
        if (jh2Var != null) {
            if (z) {
                if (Math.abs(jh2Var.getAlpha() - f) > 0.1d) {
                    jh2Var.animate().cancel();
                    jh2Var.animate().alpha(f).start();
                    return;
                }
                return;
            }
            jh2Var.animate().cancel();
            jh2Var.setAlpha(f);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L.a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L.a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.x.setVisibility(8);
        this.K = tL_myBoost;
        TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(-pg3.n(tL_myBoost.peer)));
        this.J = L0;
        pc0 pc0Var = this.b;
        pc0Var.p(L0);
        int L = gm.L(20.0f);
        bf0 bf0Var = this.c;
        bf0Var.setRoundRadius(L);
        bf0Var.f(this.J, pc0Var);
        String str = this.J.title;
        dg0 dg0Var = this.d;
        dg0Var.k(str);
        int i = cmb.q5;
        ylb ylbVar = this.a;
        lka lkaVar = this.e;
        anb.W(lkaVar, i, ylbVar);
        setSubtitle(jb6.a0(null, null, 2131753626, jb6.D0().n0().format(new Date(tL_myBoost.expires * 1000))));
        int i2 = tL_myBoost.cooldown_until_date;
        if (i2 > 0) {
            setSubtitle(jb6.a0(null, null, 2131753559, f((i2 * 1000) - System.currentTimeMillis())));
            dg0Var.setAlpha(0.65f);
            lkaVar.setAlpha(0.65f);
            i(false, 0.3f);
            return;
        }
        dg0Var.setAlpha(1.0f);
        lkaVar.setAlpha(1.0f);
        i(false, 1.0f);
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.x;
        if (onClickListener != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setUser(TLRPC.User user) {
        int i;
        this.x.setVisibility(8);
        this.I = user;
        this.J = null;
        pc0 pc0Var = this.b;
        pc0Var.q(user);
        int L = gm.L(20.0f);
        bf0 bf0Var = this.c;
        bf0Var.setRoundRadius(L);
        bf0Var.f(user, pc0Var);
        String r = m9c.r(user);
        dg0 dg0Var = this.d;
        dg0Var.k(r);
        boolean[] zArr = this.s;
        zArr[0] = false;
        if (m9c.v(user)) {
            int i2 = user.bot_active_users;
            if (i2 > 0) {
                setSubtitle(jb6.H(',', "BotUsers", i2));
            } else {
                setSubtitle(jb6.M0(2131753121, null));
            }
        } else {
            setSubtitle(jb6.d0(z8c.t0, user, zArr, null));
        }
        if (zArr[0]) {
            i = cmb.m5;
        } else {
            i = cmb.q5;
        }
        anb.W(this.e, i, this.a);
        jh2 jh2Var = this.w;
        if (jh2Var != null) {
            jh2Var.setAlpha(1.0f);
        }
        int w0 = cmb.w0(null, cmb.y9, false);
        this.M = w0;
        dg0Var.i(this.L.a(user, w0, false));
    }

    @Override
    public final void updateColors() {
        d0b d0bVar;
        dg0 dg0Var;
        int w0;
        try {
            if (this.I != null && (d0bVar = this.L) != null && (dg0Var = this.d) != null && (w0 = cmb.w0(null, cmb.y9, false)) != this.M) {
                this.M = w0;
                d0bVar.a(this.I, w0, false);
                dg0Var.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
