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
public final class e3a extends if0 implements snb {
    public final ImageView E;
    public boolean F;
    public final ImageView G;
    public boolean H;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public TL_stories.TL_myBoost K;
    public final c2b L;
    public int M;
    public final boolean[] s;
    public final og2 w;
    public final ImageView x;
    public boolean y;

    public e3a(Context context, boolean z, boolean z2, vnb vnbVar, boolean z3) {
        super(context, vnbVar);
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        int i4;
        float f3;
        this.s = new boolean[1];
        this.H = true;
        this.L = new c2b(this);
        this.d.setTypeface(hl.o());
        this.f.setVisibility(8);
        if (z2) {
            og2 og2Var = new og2(21, vnbVar, context);
            this.w = og2Var;
            og2Var.b(aob.B5, aob.h5, aob.k7);
            og2Var.setDrawUnchecked(false);
            og2Var.setDrawBackgroundAsArc(3);
            boolean z4 = ob6.a0;
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
            addView(og2Var, tre.d(24, 24.0f, i5, f3, 33.0f, z4 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z) {
            og2 og2Var2 = new og2(21, vnbVar, context);
            this.w = og2Var2;
            if (z3) {
                og2Var2.b(aob.i7, aob.j7, aob.C5);
            } else {
                og2Var2.b(aob.B5, aob.j7, aob.C5);
            }
            og2Var2.setDrawUnchecked(true);
            og2Var2.setDrawBackgroundAsArc(10);
            addView(og2Var2);
            og2Var2.a(false, false);
            if (ob6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            og2Var2.setLayoutParams(tre.d(24, 24.0f, i | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.w = null;
        }
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231247);
        int i6 = aob.rd;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView, i6, vnbVar, mode);
        if (ob6.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        addView(imageView, tre.d(32, 32.0f, i2 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231850);
        int i7 = aob.Fi;
        yob.s(imageView2, i7, vnbVar, mode);
        boolean z5 = ob6.a0;
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
        addView(imageView2, tre.d(32, 32.0f, i8, f, 0.0f, f2, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231919);
        yob.s(imageView3, i7, vnbVar, mode);
        addView(imageView3, tre.d(32, 32.0f, (ob6.a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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
        hashSet.add(Integer.valueOf(aob.z9));
    }

    @Override
    public final boolean b() {
        og2 og2Var = this.w;
        if (og2Var != null && og2Var.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z, boolean z2) {
        og2 og2Var = this.w;
        if (og2Var != null && og2Var.getVisibility() == 0) {
            og2Var.a(z, z2);
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
                    public final e3a b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        e3a e3aVar = this.b;
                        switch (b) {
                            case 0:
                                e3aVar.E.setVisibility(8);
                                return;
                            default:
                                e3aVar.G.setVisibility(8);
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
                    public final e3a b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r2;
                        e3a e3aVar = this.b;
                        switch (b) {
                            case 0:
                                e3aVar.E.setVisibility(8);
                                return;
                            default:
                                e3aVar.G.setVisibility(8);
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
        rb0 rb0Var = this.b;
        rb0Var.p(chat);
        if (xc2.c0(chat)) {
            f = 12.0f;
        } else {
            f = 20.0f;
        }
        int L = hl.L(f);
        de0 de0Var = this.c;
        de0Var.setRoundRadius(L);
        de0Var.f(chat, rb0Var);
        String str2 = chat.title;
        ff0 ff0Var = this.d;
        ff0Var.k(str2);
        ff0Var.i(null);
        if (i <= 0) {
            i = chat.participants_count;
        }
        boolean V = xc2.V(chat);
        if (i >= 1) {
            if (V) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            M0 = ob6.G(i, str, new Object[0]);
        } else {
            if (V) {
                i2 = 2131751355;
            } else {
                i2 = 2131754872;
            }
            M0 = ob6.M0(i2, null);
        }
        setSubtitle(M0);
        yob.W(this.e, aob.r5, this.a);
        if (i > 200) {
            f2 = 0.3f;
        } else {
            f2 = 1.0f;
        }
        i(false, f2);
    }

    public final void i(boolean z, float f) {
        og2 og2Var = this.w;
        if (og2Var != null) {
            if (z) {
                if (Math.abs(og2Var.getAlpha() - f) > 0.1d) {
                    og2Var.animate().cancel();
                    og2Var.animate().alpha(f).start();
                    return;
                }
                return;
            }
            og2Var.animate().cancel();
            og2Var.setAlpha(f);
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
        TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(-wf3.n(tL_myBoost.peer)));
        this.J = M0;
        rb0 rb0Var = this.b;
        rb0Var.p(M0);
        int L = hl.L(20.0f);
        de0 de0Var = this.c;
        de0Var.setRoundRadius(L);
        de0Var.f(this.J, rb0Var);
        String str = this.J.title;
        ff0 ff0Var = this.d;
        ff0Var.k(str);
        int i = aob.r5;
        vnb vnbVar = this.a;
        ema emaVar = this.e;
        yob.W(emaVar, i, vnbVar);
        setSubtitle(ob6.a0(null, null, 2131753654, ob6.D0().n0().format(new Date(tL_myBoost.expires * 1000))));
        int i2 = tL_myBoost.cooldown_until_date;
        if (i2 > 0) {
            setSubtitle(ob6.a0(null, null, 2131753587, f((i2 * 1000) - System.currentTimeMillis())));
            ff0Var.setAlpha(0.65f);
            emaVar.setAlpha(0.65f);
            i(false, 0.3f);
            return;
        }
        ff0Var.setAlpha(1.0f);
        emaVar.setAlpha(1.0f);
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
        rb0 rb0Var = this.b;
        rb0Var.q(user);
        int L = hl.L(20.0f);
        de0 de0Var = this.c;
        de0Var.setRoundRadius(L);
        de0Var.f(user, rb0Var);
        String r = lbc.r(user);
        ff0 ff0Var = this.d;
        ff0Var.k(r);
        boolean[] zArr = this.s;
        zArr[0] = false;
        if (lbc.v(user)) {
            int i2 = user.bot_active_users;
            if (i2 > 0) {
                setSubtitle(ob6.H(',', "BotUsers", i2));
            } else {
                setSubtitle(ob6.M0(2131753149, null));
            }
        } else {
            setSubtitle(ob6.d0(yac.t0, user, zArr, null));
        }
        if (zArr[0]) {
            i = aob.n5;
        } else {
            i = aob.r5;
        }
        yob.W(this.e, i, this.a);
        og2 og2Var = this.w;
        if (og2Var != null) {
            og2Var.setAlpha(1.0f);
        }
        int w0 = aob.w0(null, aob.z9, false);
        this.M = w0;
        ff0Var.i(this.L.a(user, w0, false));
    }

    @Override
    public final void updateColors() {
        c2b c2bVar;
        ff0 ff0Var;
        int w0;
        try {
            if (this.I != null && (c2bVar = this.L) != null && (ff0Var = this.d) != null && (w0 = aob.w0(null, aob.z9, false)) != this.M) {
                this.M = w0;
                c2bVar.a(this.I, w0, false);
                ff0Var.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
