package ah;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ma;
import fi.u3;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.q9;
public final class r extends yg.c implements b6 {
    public final ImageView E;
    public boolean F;
    public final ImageView G;
    public boolean H;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public TL_stories.TL_myBoost K;
    public final av0 L;
    public int M;
    public final boolean[] f1107s;
    public final op f1108w;
    public final ImageView f1109x;
    public boolean f1110y;

    public r(Context context, boolean z10, boolean z11, h6 h6Var, boolean z12) {
        super(context, h6Var);
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        this.f1107s = new boolean[1];
        this.H = true;
        this.L = new av0(this);
        this.d.setTypeface(g0.o());
        this.f61256f.setVisibility(8);
        if (z11) {
            op opVar = new op(21, context, h6Var);
            this.f1108w = opVar;
            opVar.b(m6.B5, m6.f29451h5, m6.f29508k7);
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(3);
            boolean z13 = gd.f24241a0;
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
            addView(opVar, ma.d(24, 24.0f, i13, f12, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            op opVar2 = new op(21, context, h6Var);
            this.f1108w = opVar2;
            if (z12) {
                opVar2.b(m6.i7, m6.f29488j7, m6.C5);
            } else {
                opVar2.b(m6.B5, m6.f29488j7, m6.C5);
            }
            opVar2.setDrawUnchecked(true);
            opVar2.setDrawBackgroundAsArc(10);
            addView(opVar2);
            opVar2.a(false, false);
            if (gd.f24241a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            opVar2.setLayoutParams(ma.d(24, 24.0f, i7 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.f1108w = null;
        }
        ImageView imageView = new ImageView(context);
        this.f1109x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231244);
        int i14 = m6.f29644rd;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        t6.s(imageView, i14, h6Var, mode);
        if (gd.f24241a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView, ma.d(32, 32.0f, i10 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231847);
        int i15 = m6.Fi;
        t6.s(imageView2, i15, h6Var, mode);
        boolean z14 = gd.f24241a0;
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
        addView(imageView2, ma.d(32, 32.0f, i16, f10, 0.0f, f11, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231916);
        t6.s(imageView3, i15, h6Var, mode);
        addView(imageView3, ma.d(32, 32.0f, (gd.f24241a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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
        hashSet.add(Integer.valueOf(m6.f29792z9));
    }

    @Override
    public final boolean b() {
        op opVar = this.f1108w;
        if (opVar != null && opVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        op opVar = this.f1108w;
        if (opVar != null && opVar.getVisibility() == 0) {
            opVar.a(z10, z11);
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
        b9 b9Var = this.f61253b;
        b9Var.q(chat);
        if (v3.c0(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int L = g0.L(f10);
        q9 q9Var = this.f61254c;
        q9Var.setRoundRadius(L);
        q9Var.f(chat, b9Var);
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
        t6.X(this.f61255e, m6.f29636r5, this.f61252a);
        if (i7 > 200) {
            f11 = 0.3f;
        } else {
            f11 = 1.0f;
        }
        i(false, f11);
    }

    public final void i(boolean z10, float f10) {
        op opVar = this.f1108w;
        if (opVar != null) {
            if (z10) {
                if (Math.abs(opVar.getAlpha() - f10) > 0.1d) {
                    opVar.animate().cancel();
                    opVar.animate().alpha(f10).start();
                    return;
                }
                return;
            }
            opVar.animate().cancel();
            opVar.setAlpha(f10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L.f33637a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L.f33637a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.f1109x.setVisibility(8);
        this.K = tL_myBoost;
        TLRPC.Chat O0 = mp.u1(j10.f24798t0).O0(Long.valueOf(-n5.o(tL_myBoost.peer)));
        this.J = O0;
        b9 b9Var = this.f61253b;
        b9Var.q(O0);
        int L = g0.L(20.0f);
        q9 q9Var = this.f61254c;
        q9Var.setRoundRadius(L);
        q9Var.f(this.J, b9Var);
        String str = this.J.title;
        u3 u3Var = this.d;
        u3Var.k(str);
        int i7 = m6.f29636r5;
        h6 h6Var = this.f61252a;
        m5 m5Var = this.f61255e;
        t6.X(m5Var, i7, h6Var);
        setSubtitle(gd.a0(null, null, 2131753658, gd.E0().o0().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 > 0) {
            setSubtitle(gd.a0(null, null, 2131753591, f((i10 * 1000) - System.currentTimeMillis())));
            u3Var.setAlpha(0.65f);
            m5Var.setAlpha(0.65f);
            i(false, 0.3f);
            return;
        }
        u3Var.setAlpha(1.0f);
        m5Var.setAlpha(1.0f);
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
        b9 b9Var = this.f61253b;
        b9Var.r(user);
        int L = g0.L(20.0f);
        q9 q9Var = this.f61254c;
        q9Var.setRoundRadius(L);
        q9Var.f(user, b9Var);
        String q10 = o10.q(user);
        u3 u3Var = this.d;
        u3Var.k(q10);
        boolean[] zArr = this.f1107s;
        zArr[0] = false;
        if (o10.u(user)) {
            int i10 = user.bot_active_users;
            if (i10 > 0) {
                setSubtitle(gd.H(',', "BotUsers", i10));
            } else {
                setSubtitle(gd.N0(2131753153, null));
            }
        } else {
            setSubtitle(gd.d0(j10.f24798t0, user, zArr, null));
        }
        if (zArr[0]) {
            i7 = m6.f29559n5;
        } else {
            i7 = m6.f29636r5;
        }
        t6.X(this.f61255e, i7, this.f61252a);
        op opVar = this.f1108w;
        if (opVar != null) {
            opVar.setAlpha(1.0f);
        }
        int x02 = m6.x0(null, m6.f29792z9, false);
        this.M = x02;
        u3Var.i(this.L.a(user, x02, false));
    }

    @Override
    public final void updateColors() {
        av0 av0Var;
        u3 u3Var;
        int x02;
        try {
            if (this.I != null && (av0Var = this.L) != null && (u3Var = this.d) != null && (x02 = m6.x0(null, m6.f29792z9, false)) != this.M) {
                this.M = x02;
                av0Var.a(this.I, x02, false);
                u3Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
