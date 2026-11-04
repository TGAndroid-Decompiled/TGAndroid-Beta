package bh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import b8.mf;
import ei.e4;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wo;
public final class p extends zg.c implements z5 {
    public final ImageView E;
    public boolean F;
    public final ImageView G;
    public boolean H;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public TL_stories.TL_myBoost K;
    public final mu0 L;
    public int M;
    public final boolean[] f3347s;
    public final wo f3348w;
    public final ImageView f3349x;
    public boolean f3350y;

    public p(Context context, boolean z10, boolean z11, e6 e6Var, boolean z12) {
        super(context, e6Var);
        int i3;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        this.f3347s = new boolean[1];
        this.H = true;
        this.L = new mu0(this);
        this.d.setTypeface(g0.o());
        this.f60476f.setVisibility(8);
        if (z11) {
            wo woVar = new wo(21, context, e6Var);
            this.f3348w = woVar;
            woVar.b(k6.B5, k6.f27954h5, k6.f28008k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z13 = bd.f21784a0;
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
            addView(woVar, mf.d(24, 24.0f, i13, f12, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            wo woVar2 = new wo(21, context, e6Var);
            this.f3348w = woVar2;
            if (z12) {
                woVar2.b(k6.f27973i7, k6.f27990j7, k6.C5);
            } else {
                woVar2.b(k6.B5, k6.f27990j7, k6.C5);
            }
            woVar2.setDrawUnchecked(true);
            woVar2.setDrawBackgroundAsArc(10);
            addView(woVar2);
            woVar2.a(false, false);
            if (bd.f21784a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            woVar2.setLayoutParams(mf.d(24, 24.0f, i3 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.f3348w = null;
        }
        ImageView imageView = new ImageView(context);
        this.f3349x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231244);
        int i14 = k6.f28088od;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView, i14, e6Var, mode);
        if (bd.f21784a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView, mf.d(32, 32.0f, i10 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231846);
        int i15 = k6.Ci;
        r6.t(imageView2, i15, e6Var, mode);
        boolean z14 = bd.f21784a0;
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
        addView(imageView2, mf.d(32, 32.0f, i16, f10, 0.0f, f11, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231915);
        r6.t(imageView3, i15, e6Var, mode);
        addView(imageView3, mf.d(32, 32.0f, (bd.f21784a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String f(long j10) {
        long j11 = j10 / 3600000;
        long j12 = j10 % 3600000;
        long j13 = j12 / 60000;
        long j14 = (j12 % 60000) / 1000;
        StringBuilder sb2 = new StringBuilder();
        if (j11 > 0) {
            sb2.append(String.format("%02d", Long.valueOf(j11)));
            sb2.append(":");
        }
        sb2.append(String.format("%02d", Long.valueOf(j13)));
        sb2.append(":");
        sb2.append(String.format("%02d", Long.valueOf(j14)));
        return sb2.toString();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f28293z9));
    }

    @Override
    public final boolean b() {
        wo woVar = this.f3348w;
        if (woVar != null && woVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        wo woVar = this.f3348w;
        if (woVar != null && woVar.getVisibility() == 0) {
            woVar.a(z10, z11);
        }
    }

    public final void g(boolean z10, boolean z11) {
        float f10;
        int i3;
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
            if (z10 && this.f3350y) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            Runnable runnable2 = null;
            if (z10 && this.f3350y) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final p f3345b;

                    {
                        this.f3345b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f3345b.E.setVisibility(8);
                                return;
                            default:
                                this.f3345b.G.setVisibility(8);
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
                    public final p f3345b;

                    {
                        this.f3345b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f3345b.E.setVisibility(8);
                                return;
                            default:
                                this.f3345b.G.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f3350y) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView2.setAlpha(f10);
        if (z10 && this.f3350y) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView2.setVisibility(i3);
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

    public final void h(int i3, TLRPC.Chat chat) {
        float f10;
        int i10;
        String M0;
        float f11;
        String str;
        this.f3349x.setVisibility(8);
        this.J = chat;
        this.I = null;
        u8 u8Var = this.f60473b;
        u8Var.q(chat);
        if (t3.c0(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int L = g0.L(f10);
        k9 k9Var = this.f60474c;
        k9Var.setRoundRadius(L);
        k9Var.e(chat, u8Var);
        String str2 = chat.title;
        e4 e4Var = this.d;
        e4Var.k(str2);
        e4Var.i(null);
        if (i3 <= 0) {
            i3 = chat.participants_count;
        }
        boolean V = t3.V(chat);
        if (i3 >= 1) {
            if (V) {
                str = "Subscribers";
            } else {
                str = "Members";
            }
            M0 = bd.G(i3, str, new Object[0]);
        } else {
            if (V) {
                i10 = 2131751391;
            } else {
                i10 = 2131754876;
            }
            M0 = bd.M0(i10, null);
        }
        setSubtitle(M0);
        r6.Y(this.f60475e, k6.r5, this.f60472a);
        if (i3 > 200) {
            f11 = 0.3f;
        } else {
            f11 = 1.0f;
        }
        i(false, f11);
    }

    public final void i(boolean z10, float f10) {
        wo woVar = this.f3348w;
        if (woVar != null) {
            if (z10) {
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
        this.L.f36254a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L.f36254a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.f3349x.setVisibility(8);
        this.K = tL_myBoost;
        TLRPC.Chat M0 = hp.s1(h10.f22829t0).M0(Long.valueOf(-m5.o(tL_myBoost.peer)));
        this.J = M0;
        u8 u8Var = this.f60473b;
        u8Var.q(M0);
        int L = g0.L(20.0f);
        k9 k9Var = this.f60474c;
        k9Var.setRoundRadius(L);
        k9Var.e(this.J, u8Var);
        String str = this.J.title;
        e4 e4Var = this.d;
        e4Var.k(str);
        int i3 = k6.r5;
        e6 e6Var = this.f60472a;
        k5 k5Var = this.f60475e;
        r6.Y(k5Var, i3, e6Var);
        setSubtitle(bd.a0(null, null, 2131753661, bd.E0().o0().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 > 0) {
            setSubtitle(bd.a0(null, null, 2131753594, f((i10 * 1000) - System.currentTimeMillis())));
            e4Var.setAlpha(0.65f);
            k5Var.setAlpha(0.65f);
            i(false, 0.3f);
            return;
        }
        e4Var.setAlpha(1.0f);
        k5Var.setAlpha(1.0f);
        i(false, 1.0f);
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.f3349x;
        if (onClickListener != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setUser(TLRPC.User user) {
        int i3;
        this.f3349x.setVisibility(8);
        this.I = user;
        this.J = null;
        u8 u8Var = this.f60473b;
        u8Var.r(user);
        int L = g0.L(20.0f);
        k9 k9Var = this.f60474c;
        k9Var.setRoundRadius(L);
        k9Var.e(user, u8Var);
        String p10 = l10.p(user);
        e4 e4Var = this.d;
        e4Var.k(p10);
        boolean[] zArr = this.f3347s;
        zArr[0] = false;
        if (l10.t(user)) {
            int i10 = user.bot_active_users;
            if (i10 > 0) {
                setSubtitle(bd.H(',', "BotUsers", i10));
            } else {
                setSubtitle(bd.M0(2131753156, null));
            }
        } else {
            setSubtitle(bd.d0(h10.f22829t0, user, zArr, null));
        }
        if (zArr[0]) {
            i3 = k6.f28061n5;
        } else {
            i3 = k6.r5;
        }
        r6.Y(this.f60475e, i3, this.f60472a);
        wo woVar = this.f3348w;
        if (woVar != null) {
            woVar.setAlpha(1.0f);
        }
        int x02 = k6.x0(null, k6.f28293z9, false);
        this.M = x02;
        e4Var.i(this.L.a(user, x02, false));
    }

    @Override
    public final void updateColors() {
        mu0 mu0Var;
        e4 e4Var;
        int x02;
        try {
            if (this.I != null && (mu0Var = this.L) != null && (e4Var = this.d) != null && (x02 = k6.x0(null, k6.f28293z9, false)) != this.M) {
                this.M = x02;
                mu0Var.a(this.I, x02, false);
                e4Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
