package ah;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import c8.ja;
import fi.w3;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.t8;
public final class r extends yg.c implements z5 {
    public final ImageView E;
    public boolean F;
    public final ImageView G;
    public boolean H;
    public TLRPC.User I;
    public TLRPC.Chat J;
    public TL_stories.TL_myBoost K;
    public final pu0 L;
    public int M;
    public final boolean[] f1108s;
    public final fp f1109w;
    public final ImageView f1110x;
    public boolean f1111y;

    public r(Context context, boolean z10, boolean z11, e6 e6Var, boolean z12) {
        super(context, e6Var);
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        this.f1108s = new boolean[1];
        this.H = true;
        this.L = new pu0(this);
        this.d.setTypeface(g0.o());
        this.f60647f.setVisibility(8);
        if (z11) {
            fp fpVar = new fp(21, context, e6Var);
            this.f1109w = fpVar;
            fpVar.b(j6.B5, j6.f28922h5, j6.f28979k7);
            fpVar.setDrawUnchecked(false);
            fpVar.setDrawBackgroundAsArc(3);
            boolean z13 = hd.f24101a0;
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
            addView(fpVar, ja.d(24, 24.0f, i13, f12, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            fp fpVar2 = new fp(21, context, e6Var);
            this.f1109w = fpVar2;
            if (z12) {
                fpVar2.b(j6.i7, j6.f28959j7, j6.C5);
            } else {
                fpVar2.b(j6.B5, j6.f28959j7, j6.C5);
            }
            fpVar2.setDrawUnchecked(true);
            fpVar2.setDrawBackgroundAsArc(10);
            addView(fpVar2);
            fpVar2.a(false, false);
            if (hd.f24101a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            fpVar2.setLayoutParams(ja.d(24, 24.0f, i7 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.f1109w = null;
        }
        ImageView imageView = new ImageView(context);
        this.f1110x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231244);
        int i14 = j6.f29115rd;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        q6.s(imageView, i14, e6Var, mode);
        if (hd.f24101a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(imageView, ja.d(32, 32.0f, i10 | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231846);
        int i15 = j6.Fi;
        q6.s(imageView2, i15, e6Var, mode);
        boolean z14 = hd.f24101a0;
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
        addView(imageView2, ja.d(32, 32.0f, i16, f10, 0.0f, f11, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131231915);
        q6.s(imageView3, i15, e6Var, mode);
        addView(imageView3, ja.d(32, 32.0f, (hd.f24101a0 ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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
        hashSet.add(Integer.valueOf(j6.f29263z9));
    }

    @Override
    public final boolean b() {
        fp fpVar = this.f1109w;
        if (fpVar != null && fpVar.getDrawUnchecked()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10, boolean z11) {
        fp fpVar = this.f1109w;
        if (fpVar != null && fpVar.getVisibility() == 0) {
            fpVar.a(z10, z11);
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
            if (z10 && this.f1111y) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            Runnable runnable2 = null;
            if (z10 && this.f1111y) {
                runnable = null;
            } else {
                runnable = new Runnable(this) {
                    public final r f1106b;

                    {
                        this.f1106b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f1106b.E.setVisibility(8);
                                return;
                            default:
                                this.f1106b.G.setVisibility(8);
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
                    public final r f1106b;

                    {
                        this.f1106b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f1106b.E.setVisibility(8);
                                return;
                            default:
                                this.f1106b.G.setVisibility(8);
                                return;
                        }
                    }
                };
            }
            alpha2.withEndAction(runnable2).start();
            return;
        }
        imageView2.animate().cancel();
        if (z10 && this.f1111y) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        imageView2.setAlpha(f10);
        if (z10 && this.f1111y) {
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
        String M0;
        float f11;
        String str;
        this.f1110x.setVisibility(8);
        this.J = chat;
        this.I = null;
        t8 t8Var = this.f60644b;
        t8Var.q(chat);
        if (t3.c0(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int L = g0.L(f10);
        i9 i9Var = this.f60645c;
        i9Var.setRoundRadius(L);
        i9Var.f(chat, t8Var);
        String str2 = chat.title;
        w3 w3Var = this.d;
        w3Var.k(str2);
        w3Var.i(null);
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
                i10 = 2131751390;
            } else {
                i10 = 2131754876;
            }
            M0 = hd.M0(i10, null);
        }
        setSubtitle(M0);
        q6.X(this.f60646e, j6.f29107r5, this.f60643a);
        if (i7 > 200) {
            f11 = 0.3f;
        } else {
            f11 = 1.0f;
        }
        i(false, f11);
    }

    public final void i(boolean z10, float f10) {
        fp fpVar = this.f1109w;
        if (fpVar != null) {
            if (z10) {
                if (Math.abs(fpVar.getAlpha() - f10) > 0.1d) {
                    fpVar.animate().cancel();
                    fpVar.animate().alpha(f10).start();
                    return;
                }
                return;
            }
            fpVar.animate().cancel();
            fpVar.setAlpha(f10);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L.f38413a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L.f38413a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.f1110x.setVisibility(8);
        this.K = tL_myBoost;
        TLRPC.Chat M0 = np.s1(m10.f24934t0).M0(Long.valueOf(-m5.o(tL_myBoost.peer)));
        this.J = M0;
        t8 t8Var = this.f60644b;
        t8Var.q(M0);
        int L = g0.L(20.0f);
        i9 i9Var = this.f60645c;
        i9Var.setRoundRadius(L);
        i9Var.f(this.J, t8Var);
        String str = this.J.title;
        w3 w3Var = this.d;
        w3Var.k(str);
        int i7 = j6.f29107r5;
        e6 e6Var = this.f60643a;
        j5 j5Var = this.f60646e;
        q6.X(j5Var, i7, e6Var);
        setSubtitle(hd.a0(null, null, 2131753661, hd.E0().o0().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 > 0) {
            setSubtitle(hd.a0(null, null, 2131753594, f((i10 * 1000) - System.currentTimeMillis())));
            w3Var.setAlpha(0.65f);
            j5Var.setAlpha(0.65f);
            i(false, 0.3f);
            return;
        }
        w3Var.setAlpha(1.0f);
        j5Var.setAlpha(1.0f);
        i(false, 1.0f);
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.f1110x;
        if (onClickListener != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
            return;
        }
        imageView.setVisibility(8);
    }

    public void setUser(TLRPC.User user) {
        int i7;
        this.f1110x.setVisibility(8);
        this.I = user;
        this.J = null;
        t8 t8Var = this.f60644b;
        t8Var.r(user);
        int L = g0.L(20.0f);
        i9 i9Var = this.f60645c;
        i9Var.setRoundRadius(L);
        i9Var.f(user, t8Var);
        String p10 = q10.p(user);
        w3 w3Var = this.d;
        w3Var.k(p10);
        boolean[] zArr = this.f1108s;
        zArr[0] = false;
        if (q10.t(user)) {
            int i10 = user.bot_active_users;
            if (i10 > 0) {
                setSubtitle(hd.H(',', "BotUsers", i10));
            } else {
                setSubtitle(hd.M0(2131753156, null));
            }
        } else {
            setSubtitle(hd.d0(m10.f24934t0, user, zArr, null));
        }
        if (zArr[0]) {
            i7 = j6.f29030n5;
        } else {
            i7 = j6.f29107r5;
        }
        q6.X(this.f60646e, i7, this.f60643a);
        fp fpVar = this.f1109w;
        if (fpVar != null) {
            fpVar.setAlpha(1.0f);
        }
        int x02 = j6.x0(null, j6.f29263z9, false);
        this.M = x02;
        w3Var.i(this.L.a(user, x02, false));
    }

    @Override
    public final void updateColors() {
        pu0 pu0Var;
        w3 w3Var;
        int x02;
        try {
            if (this.I != null && (pu0Var = this.L) != null && (w3Var = this.d) != null && (x02 = j6.x0(null, j6.f29263z9, false)) != this.M) {
                this.M = x02;
                pu0Var.a(this.I, x02, false);
                w3Var.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
