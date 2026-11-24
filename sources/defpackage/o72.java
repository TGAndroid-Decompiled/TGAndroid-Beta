package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
public class o72 extends FrameLayout implements x74, gk7, tjb {
    public a A0;
    public final ImageView E;
    public final ImageView F;
    public final rob G;
    public final mu1 H;
    public final bya[] I;
    public final pb0 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public bya O;
    public int P;
    public int Q;
    public AnimatorSet R;
    public final boolean[] S;
    public final boolean[] T;
    public final boolean U;
    public int V;
    public int W;
    public final fm0 a;
    public CharSequence a0;
    public boolean b;
    public int b0;
    public Integer c;
    public Integer c0;
    public final byte d;
    public final ffa d0;
    public final k72 e;
    public final wjb e0;
    public final boolean f;
    public boolean f0;
    public final tl g0;
    public final zr1 h;
    public final tl h0;
    public final n41 i0;
    public final g72 j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public final zr1 r;
    public String r0;
    public final hn s;
    public Drawable s0;
    public Drawable t0;
    public Drawable u0;
    public boolean v0;
    public final AtomicReference w;
    public PorterDuffColorFilter w0;
    public final ImageView x;
    public PorterDuffColorFilter x0;
    public final ImageView y;
    public int y0;
    public int z0;

    public o72(android.content.Context r22, org.telegram.ui.ActionBar.d r23, boolean r24, defpackage.wjb r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o72.<init>(android.content.Context, org.telegram.ui.ActionBar.d, boolean, wjb):void");
    }

    private void setTypingAnimation(boolean z) {
        mu1 mu1Var = this.H;
        zr1 zr1Var = this.r;
        if (zr1Var != null) {
            int i = 0;
            bya[] byaVarArr = this.I;
            if (z) {
                try {
                    int intValue = na7.q1(this.K).B1(mu1Var.a(), mu1Var.s4).intValue();
                    bya byaVar = byaVarArr[intValue];
                    if (byaVar != null) {
                        wjb wjbVar = this.e0;
                        if (intValue == 5) {
                            zr1Var.g(byaVar, "**oo**");
                            byaVarArr[intValue].b(bkb.v0(bkb.oa, wjbVar));
                            zr1Var.setLeftDrawable((Drawable) null);
                        } else {
                            zr1Var.g(null, null);
                            byaVarArr[intValue].b(bkb.v0(bkb.oa, wjbVar));
                            zr1Var.setLeftDrawable(byaVarArr[intValue]);
                        }
                        this.O = byaVarArr[intValue];
                        while (i < byaVarArr.length) {
                            bya byaVar2 = byaVarArr[i];
                            if (byaVar2 != null) {
                                if (i == intValue) {
                                    byaVar2.d();
                                } else {
                                    byaVar2.e();
                                }
                            }
                            i++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            }
            this.O = null;
            zr1Var.setLeftDrawable((Drawable) null);
            zr1Var.g(null, null);
            while (i < byaVarArr.length) {
                bya byaVar3 = byaVarArr[i];
                if (byaVar3 != null) {
                    byaVar3.e();
                }
                i++;
            }
        }
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int L;
        float f;
        int i;
        mu1 mu1Var = this.H;
        if (mu1Var != null) {
            TLRPC.User h = mu1Var.h();
            TLRPC.Chat chat = mu1Var.e;
            if (mu1Var.g4 == 3) {
                long X6 = mu1Var.X6();
                if (X6 >= 0) {
                    user = mu1Var.getMessagesController().V1(Long.valueOf(X6));
                    chat = null;
                } else {
                    chat = mu1Var.getMessagesController().K0(Long.valueOf(-X6));
                    user = null;
                }
            } else {
                user = h;
            }
            pb0 pb0Var = this.J;
            k72 k72Var = this.e;
            if (user != null) {
                pb0Var.q(user);
                if (l7c.B(user)) {
                    pb0Var.p = 0.8f;
                    pb0Var.f(12);
                    if (k72Var != null) {
                        k72Var.setAnimatedEmojiDrawable(null);
                        k72Var.m(null, null, pb0Var, user);
                    }
                } else if (l7c.u(user)) {
                    pb0Var.p = 0.8f;
                    pb0Var.f(21);
                    if (k72Var != null) {
                        k72Var.setAnimatedEmojiDrawable(null);
                        k72Var.m(null, null, pb0Var, user);
                    }
                } else if (l7c.D(user) && mu1Var.g4 == 3) {
                    pb0Var.p = 0.8f;
                    pb0Var.f(22);
                    if (k72Var != null) {
                        k72Var.setAnimatedEmojiDrawable(null);
                        k72Var.m(null, null, pb0Var, user);
                    }
                } else if (l7c.D(user)) {
                    pb0Var.p = 0.8f;
                    pb0Var.f(1);
                    if (k72Var != null) {
                        k72Var.setAnimatedEmojiDrawable(null);
                        k72Var.m(null, null, pb0Var, user);
                    }
                } else {
                    pb0Var.p = 1.0f;
                    if (k72Var != null) {
                        k72Var.setAnimatedEmojiDrawable(null);
                        k72Var.a.V(user, pb0Var, null, true, 3, false);
                    }
                }
            } else if (hc2.p0(chat)) {
                long d = mu1Var.d();
                int i2 = this.K;
                if (hc2.A(i2, chat, 24) && d != 0) {
                    if (i > 0) {
                        TLRPC.User V1 = mu1Var.getMessagesController().V1(Long.valueOf(d));
                        pb0Var.q(V1);
                        k72Var.setAnimatedEmojiDrawable(null);
                        k72Var.f(V1, pb0Var);
                    } else {
                        TLRPC.Chat K0 = mu1Var.getMessagesController().K0(Long.valueOf(-d));
                        pb0Var.p(K0);
                        k72Var.setAnimatedEmojiDrawable(null);
                        k72Var.f(K0, pb0Var);
                    }
                } else {
                    k72Var.setAnimatedEmojiDrawable(null);
                    mm4.o(i2, chat, pb0Var, k72Var);
                }
                k72Var.setRoundRadius(gl.L(21.0f));
            } else if (chat != null) {
                pb0Var.p = 1.0f;
                pb0Var.p(chat);
                if (k72Var != null) {
                    k72Var.setAnimatedEmojiDrawable(null);
                    k72Var.f(chat, pb0Var);
                    if (chat.forum) {
                        if (na7.q1(y6c.t0).M1().J(-chat.id)) {
                            f = 11.0f;
                        } else {
                            f = 16.0f;
                        }
                        L = gl.L(f);
                    } else {
                        L = gl.L(21.0f);
                    }
                    k72Var.setRoundRadius(L);
                }
            }
        }
    }

    public final tl c(long j) {
        if (j == 0) {
            return null;
        }
        tl tlVar = this.h0;
        tlVar.j(j, false);
        tlVar.k(Integer.valueOf(bkb.v0(bkb.pi, this.e0)));
        int L = gl.L(1.0f);
        tlVar.J = 0;
        tlVar.K = L;
        return tlVar;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.S1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
            }
        } else if (i == kk7.k4) {
            zr1 zr1Var = this.h;
            if (zr1Var != null) {
                zr1Var.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        } else if (i == kk7.h3) {
            n(true);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a = this.i0.a(0.02f);
        canvas.scale(a, a, getPivotX(), getHeight() - (a.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.l0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (view == this.e) {
            boolean z2 = false;
            ImageView imageView = this.x;
            if (imageView != null && imageView.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            ImageView imageView2 = this.y;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z2 = true;
            }
            if (z || z2) {
                RectF rectF = gl.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-gl.L(3.0f), -gl.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j);
                if (z) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - gl.N(0.33f), imageView.getScaleX() * gl.N(12.0f), bkb.Fm);
                }
                if (z2) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * gl.N(7.66f), bkb.Fm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(boolean r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o72.e(boolean, boolean):void");
    }

    public final void g(int i, boolean z) {
        rob robVar = this.G;
        if (robVar != null) {
            boolean z2 = this.n0;
            if (i == 0 && !this.U) {
                return;
            }
            fm0 fm0Var = this.a;
            if (!z2) {
                fm0Var.a(true, z);
                robVar.b(i);
                return;
            }
            fm0Var.a(false, z);
        }
    }

    public be0 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public ffa getSharedMediaPreloader() {
        return this.d0;
    }

    public TextPaint getSubtitlePaint() {
        zr1 zr1Var = this.r;
        if (zr1Var != null) {
            return zr1Var.getTextPaint();
        }
        return this.s.getPaint();
    }

    public View getSubtitleTextView() {
        zr1 zr1Var = this.r;
        if (zr1Var != null) {
            return zr1Var;
        }
        hn hnVar = this.s;
        if (hnVar != null) {
            return hnVar;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.x;
    }

    public jia getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int L;
        float f = 0.0f;
        zr1 zr1Var = this.h;
        if (zr1Var != null) {
            f = Math.max(0.0f, zr1Var.getExactWidthIncludeDrawables());
        }
        zr1 zr1Var2 = this.r;
        if (zr1Var2 != null) {
            f = Math.max(f, zr1Var2.getExactWidthIncludeDrawables());
        }
        k72 k72Var = this.e;
        if (k72Var != null && k72Var.getVisibility() == 0) {
            L = gl.L(70.0f);
        } else {
            L = gl.L(34.0f);
        }
        return (int) (f + L);
    }

    public final void h(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.EmojiStatus emojiStatus, boolean z5) {
        if (charSequence != null) {
            charSequence = vu3.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.p0 = false;
        if (!z && !z2) {
            if (z3) {
                Drawable mutate = getResources().getDrawable(2131232796).mutate();
                this.t0 = mutate;
                int i = bkb.pi;
                wjb wjbVar = this.e0;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                zkb.x(this, mutate, i, wjbVar, mode);
                Drawable mutate2 = getResources().getDrawable(2131232797).mutate();
                this.u0 = mutate2;
                zkb.x(this, mutate2, bkb.qi, this.e0, mode);
                this.h.j(new fm2(this.t0, this.u0));
                this.o0 = true;
                this.r0 = k96.M0(2131754738, null);
            } else if (this.h.getRightDrawable() instanceof gq9) {
                this.h.j(null);
                this.o0 = false;
                this.r0 = null;
            }
        } else {
            this.p0 = true;
            if (!(this.h.getRightDrawable() instanceof gq9)) {
                gq9 gq9Var = new gq9(!z ? 1 : 0);
                gq9Var.b(bkb.v0(bkb.A8, this.e0));
                this.h.j(gq9Var);
                this.r0 = k96.M0(2131745670, null);
                this.o0 = true;
            }
        }
        if (!z4 && cf3.f(emojiStatus) == 0) {
            this.h.i(null);
            this.q0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof ul) && (((ul) this.h.getRightDrawable()).a instanceof vl)) {
                ((vl) ((ul) this.h.getRightDrawable()).a).o(this.h);
            }
            if (cf3.f(emojiStatus) != 0) {
                this.g0.j(cf3.f(emojiStatus), z5);
            } else if (z4) {
                Drawable mutate3 = org.telegram.messenger.a.b.getDrawable(2131232312).mutate();
                this.s0 = mutate3;
                zkb.x(this, mutate3, bkb.pi, this.e0, PorterDuff.Mode.MULTIPLY);
                this.g0.g(this.s0, z5);
            } else {
                this.g0.g(null, z5);
            }
            this.g0.k(Integer.valueOf(bkb.v0(bkb.pi, this.e0)));
            this.h.i(this.g0);
            this.o0 = false;
            this.q0 = k96.M0(2131754801, null);
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.k(z5);
        }
    }

    public final void i(int i, int i2) {
        zr1 zr1Var = this.h;
        zkb.q(zr1Var);
        zr1 zr1Var2 = this.r;
        zkb.q(zr1Var2);
        zr1Var.setTextColor(i);
        zr1Var2.setTextColor(i2);
        zr1Var2.setTag(Integer.valueOf(i2));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        zr1 zr1Var = this.h;
        zr1Var.setLeftDrawable(drawable);
        if (!this.o0 && !this.p0) {
            if (drawable2 != null) {
                this.r0 = k96.M0(2131747708, null);
            } else {
                this.r0 = null;
            }
            zr1Var.j(drawable2);
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.k(true);
        }
    }

    public final void k(TLRPC.User user, boolean z) {
        pb0 pb0Var = this.J;
        pb0Var.q(user);
        boolean B = l7c.B(user);
        k72 k72Var = this.e;
        if (B) {
            pb0Var.f(12);
            pb0Var.p = 0.8f;
            if (k72Var != null) {
                k72Var.m(null, null, pb0Var, user);
            }
        } else if (l7c.u(user)) {
            pb0Var.f(21);
            pb0Var.p = 0.8f;
            if (k72Var != null) {
                k72Var.m(null, null, pb0Var, user);
            }
        } else if (l7c.D(user) && !z) {
            pb0Var.f(1);
            pb0Var.p = 0.8f;
            if (k72Var != null) {
                k72Var.m(null, null, pb0Var, user);
            }
        } else {
            pb0Var.p = 1.0f;
            if (k72Var != null) {
                k72Var.f(user, pb0Var);
            }
        }
    }

    public final void l() {
        String str;
        int i = this.W;
        if (i == 2) {
            str = k96.M0(2131742970, null);
        } else if (i == 1) {
            str = k96.M0(2131751797, null);
        } else if (i == 5) {
            str = k96.M0(2131743571, null);
        } else if (i == 4) {
            str = k96.M0(2131751795, null);
        } else {
            str = null;
        }
        wjb wjbVar = this.e0;
        hn hnVar = this.s;
        zr1 zr1Var = this.r;
        if (str == null) {
            CharSequence charSequence = this.a0;
            if (charSequence != null) {
                if (zr1Var != null) {
                    zr1Var.k(charSequence);
                    this.a0 = null;
                    Integer num = this.c0;
                    if (num != null) {
                        zr1Var.setTextColor(num.intValue());
                    } else {
                        int i2 = this.b0;
                        if (i2 >= 0) {
                            zkb.W(zr1Var, i2, wjbVar);
                            zr1Var.setTag(Integer.valueOf(this.b0));
                        }
                    }
                } else if (hnVar != null) {
                    hnVar.c(charSequence, !k96.a0, true);
                    this.a0 = null;
                    Integer num2 = this.c0;
                    if (num2 != null) {
                        hnVar.setTextColor(num2.intValue());
                    } else {
                        int i3 = this.b0;
                        if (i3 >= 0) {
                            zkb.U(hnVar, i3, wjbVar);
                            hnVar.setTag(Integer.valueOf(this.b0));
                        }
                    }
                }
            }
        } else if (zr1Var != null) {
            if (this.a0 == null) {
                this.a0 = zr1Var.getText();
            }
            zr1Var.k(str);
            Integer num3 = this.c0;
            if (num3 != null) {
                zr1Var.setTextColor(num3.intValue());
            } else {
                int i4 = bkb.A8;
                zkb.W(zr1Var, i4, wjbVar);
                zr1Var.setTag(Integer.valueOf(i4));
            }
        } else if (hnVar != null) {
            if (this.a0 == null) {
                this.a0 = hnVar.getText();
            }
            hnVar.c(str, !k96.a0, true);
            Integer num4 = this.c0;
            if (num4 != null) {
                hnVar.setTextColor(num4.intValue());
            } else {
                int i5 = bkb.A8;
                zkb.U(hnVar, i5, wjbVar);
                hnVar.setTag(Integer.valueOf(i5));
            }
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.k(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z;
        mu1 mu1Var = this.H;
        if (mu1Var != null) {
            this.V = 0;
            TLRPC.ChatFull chatFull = mu1Var.r8;
            if (chatFull != null) {
                int i = this.K;
                int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
                if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
                    if (z && chatFull.participants_count > 200) {
                        this.V = chatFull.online_count;
                        return;
                    }
                    return;
                }
                for (int i2 = 0; i2 < chatFull.participants.participants.size(); i2++) {
                    TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(chatFull.participants.participants.get(i2).user_id));
                    if (V1 != null && (userStatus = V1.status) != null && ((userStatus.expires > currentTime || V1.id == y6c.h(i).e()) && V1.status.expires > 10000)) {
                        this.V++;
                    }
                }
            }
        }
    }

    public final void n(boolean z) {
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        boolean[] zArr;
        String G;
        TLRPC.ChatParticipants chatParticipants;
        int i2;
        String S;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList l;
        int i8;
        int i9;
        wjb wjbVar = this.e0;
        boolean[] zArr2 = this.S;
        hn hnVar = this.s;
        zr1 zr1Var = this.r;
        zr1 zr1Var2 = this.h;
        int i10 = this.K;
        mu1 mu1Var = this.H;
        if (mu1Var != null) {
            if (mu1Var.g4 == 6) {
                String str = mu1Var.e4.link;
                j41[] j41VarArr = j41.e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                setSubtitle(str);
                return;
            }
            TLRPC.User h = mu1Var.h();
            TLRPC.Chat chat = mu1Var.e;
            if (l7c.D(h) && mu1Var.g4 == 0 && mu1Var.getMessagesController().D1().c() >= 3 && (this.v0 || na7.c1().getInt("savedmsgschatshint", 0) < 3)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (((l7c.D(h) && !z2) || l7c.B(h) || ((h != null && h.id == 489000) || ((i = mu1Var.g4) != 0 && i != 8))) && mu1Var.g4 != 3) {
                if (getSubtitleTextView().getVisibility() != 8) {
                    getSubtitleTextView().setVisibility(8);
                    return;
                }
                return;
            }
            if (z2) {
                if (getSubtitleTextView().getVisibility() != 0) {
                    i9 = 0;
                    getSubtitleTextView().setVisibility(0);
                } else {
                    i9 = 0;
                }
                if (!this.v0) {
                    na7.c1().edit().putInt("savedmsgschatshint", na7.c1().getInt("savedmsgschatshint", i9) + 1).apply();
                    this.v0 = true;
                }
            }
            CharSequence A1 = na7.q1(i10).A1(mu1Var.a(), mu1Var.s4, false);
            CharSequence charSequence = "";
            if (A1 != null) {
                A1 = TextUtils.replace(A1, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z5 = z2;
            if (A1 != null && A1.length() != 0 && (!hc2.T(chat) || chat.megagroup)) {
                if (mu1Var.a8() && zr1Var2.getTag() != null) {
                    zr1Var2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.R = null;
                    }
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.R = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(zr1Var2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.R.addListener(new n72(this, (byte) 1));
                        this.R.setDuration(180L);
                        this.R.start();
                    } else {
                        zr1Var2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer B1 = na7.q1(i10).B1(mu1Var.a(), mu1Var.s4);
                if (B1 != null && B1.intValue() == 5) {
                    charSequence = vu3.m(A1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                } else {
                    charSequence = A1;
                }
                setTypingAnimation(true);
                z4 = true;
            } else if (mu1Var.a8() && !mu1Var.x4) {
                if (zr1Var2.getTag() == null) {
                    zr1Var2.setTag(1);
                    AnimatorSet animatorSet3 = this.R;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.R = null;
                    }
                    if (z) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.R = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(zr1Var2, property2, gl.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.R.addListener(new n72(this, (byte) 0));
                        this.R.setDuration(180L);
                        this.R.start();
                        return;
                    }
                    zr1Var2.setTranslationY(gl.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i11 = mu1Var.g4;
                if (i11 == 8) {
                    if (mu1Var.i4) {
                        charSequence = k96.M0(2131752207, null);
                        z4 = false;
                    } else {
                        if (mu1Var.d() == 0) {
                            pub pubVar = mu1Var.getMessagesController().g4;
                            long j = -mu1Var.a();
                            if (pubVar.e(j) && (l = pubVar.l(j)) != null) {
                                i7 = l.size();
                            } else {
                                i7 = 0;
                            }
                            if (i7 > 0) {
                                G = k96.H(',', "Chats", i7);
                            } else {
                                G = k96.M0(2131752207, null);
                            }
                        } else {
                            TLRPC.TL_forumTopic f = na7.q1(i10).g4.f(chat.id, mu1Var.d());
                            if (f != null) {
                                i6 = f.totalMessagesCount;
                            } else {
                                i6 = 0;
                            }
                            if (i6 > 0) {
                                G = k96.G(i6, "messages", Integer.valueOf(i6));
                            } else {
                                G = k96.a0(null, null, 2131743773, mm4.j(i10, chat, false));
                            }
                        }
                        charSequence = G;
                        z4 = false;
                    }
                } else {
                    if (i11 == 3) {
                        vp9 D1 = mu1Var.getMessagesController().D1();
                        long X6 = mu1Var.X6();
                        ArrayList arrayList = D1.j;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                up9 up9Var = (up9) arrayList.get(i12);
                                if (up9Var.a == X6) {
                                    i5 = up9Var.e;
                                    break;
                                }
                                i12++;
                            } else {
                                i5 = 0;
                                break;
                            }
                        }
                        charSequence = k96.G(Math.max(1, i5), "SavedMessagesCount", new Object[0]);
                    } else {
                        if (mu1Var.x4 && chat != null) {
                            TLRPC.TL_forumTopic f2 = na7.q1(i10).g4.f(chat.id, mu1Var.d());
                            if (f2 != null) {
                                i3 = 1;
                                i4 = f2.totalMessagesCount - 1;
                            } else {
                                i3 = 1;
                                i4 = 0;
                            }
                            if (i4 > 0) {
                                Object[] objArr = new Object[i3];
                                objArr[0] = Integer.valueOf(i4);
                                G = k96.G(i4, "messages", objArr);
                            } else {
                                Object[] objArr2 = new Object[i3];
                                objArr2[0] = chat.title;
                                G = k96.a0(null, null, 2131743773, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = mu1Var.r8;
                            int i13 = this.V;
                            if (hc2.T(chat)) {
                                if (chatFull != null && (i2 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i13 > 1) {
                                            G = tb4.y(k96.G(i2, "Members", new Object[0]), ", ", k96.G(Math.min(i13, chatFull.participants_count), "OnlineCount", new Object[0]));
                                        } else {
                                            G = k96.G(i2, "Members", new Object[0]);
                                        }
                                    } else {
                                        int[] iArr = new int[1];
                                        boolean A12 = gl.A1();
                                        int i14 = chatFull.participants_count;
                                        if (A12) {
                                            iArr[0] = i14;
                                            S = String.valueOf(i14);
                                        } else {
                                            S = k96.S(iArr, i14);
                                        }
                                        if (chat.megagroup) {
                                            G = k96.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        } else {
                                            G = k96.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        }
                                    }
                                } else if (chat.megagroup) {
                                    if (chatFull == null) {
                                        G = k96.M0(2131748587, null).toLowerCase();
                                    } else if (chat.has_geo) {
                                        G = k96.M0(2131748450, null).toLowerCase();
                                    } else if (hc2.t0(chat)) {
                                        G = k96.M0(2131748446, null).toLowerCase();
                                    } else {
                                        G = k96.M0(2131748449, null).toLowerCase();
                                    }
                                } else if (hc2.t0(chat)) {
                                    G = k96.M0(2131752306, null).toLowerCase();
                                } else {
                                    G = k96.M0(2131752317, null).toLowerCase();
                                }
                            } else if (hc2.k0(chat)) {
                                G = k96.M0(2131742566, null);
                            } else if (hc2.l0(chat)) {
                                G = k96.M0(2131742572, null);
                            } else {
                                int i15 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i15 = chatParticipants.participants.size();
                                }
                                if (i13 > 1 && i15 != 0) {
                                    G = tb4.y(k96.G(i15, "Members", new Object[0]), ", ", k96.G(i13, "OnlineCount", new Object[0]));
                                } else {
                                    G = k96.G(i15, "Members", new Object[0]);
                                }
                            }
                        } else {
                            if (h != null) {
                                TLRPC.User V1 = na7.q1(i10).V1(Long.valueOf(h.id));
                                if (V1 != null) {
                                    h = V1;
                                }
                                if (!l7c.B(h)) {
                                    long j2 = h.id;
                                    if (j2 != 489000) {
                                        if (j2 == y6c.h(i10).e()) {
                                            charSequence = z5 ? gl.D2(k96.M0(2131745700, null), false) : k96.M0(2131752177, null);
                                        } else {
                                            long j3 = h.id;
                                            if (j3 != 333000 && j3 != 777000 && j3 != 42777) {
                                                if (na7.E2(h)) {
                                                    charSequence = k96.M0(2131744084, null);
                                                } else if (h.bot) {
                                                    int i16 = h.bot_active_users;
                                                    charSequence = i16 != 0 ? k96.H(',', "BotUsers", i16) : l7c.e(h);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f0) {
                                                        zArr = this.T;
                                                    } else {
                                                        zArr = null;
                                                    }
                                                    charSequence = k96.d0(i10, h, zArr2, zArr);
                                                    z4 = zArr2[0];
                                                }
                                            } else {
                                                z3 = false;
                                                charSequence = k96.M0(2131745369, null);
                                            }
                                        }
                                    }
                                }
                            } else {
                                z3 = false;
                            }
                            z4 = z3;
                        }
                        charSequence = G;
                    }
                    z4 = false;
                }
            }
            if (z4) {
                i8 = bkb.oa;
            } else {
                i8 = bkb.A8;
            }
            this.b0 = i8;
            if (this.a0 == null) {
                if (zr1Var != null) {
                    zr1Var.k(charSequence);
                    Integer num = this.c0;
                    if (num == null) {
                        zkb.W(zr1Var, this.b0, wjbVar);
                        zr1Var.setTag(Integer.valueOf(this.b0));
                    } else {
                        zr1Var.setTextColor(num.intValue());
                    }
                } else {
                    hnVar.c(charSequence, z, true);
                    Integer num2 = this.c0;
                    if (num2 == null) {
                        zkb.U(hnVar, this.b0, wjbVar);
                        hnVar.setTag(Integer.valueOf(this.b0));
                    } else {
                        hnVar.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.a0 = charSequence;
            }
            a aVar = this.A0;
            if (aVar != null) {
                aVar.k(z);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mu1 mu1Var = this.H;
        if (mu1Var != null) {
            int i = this.K;
            kk7.f(i).b(this, kk7.S1);
            kk7.e().b(this, kk7.k4);
            if (mu1Var.g4 == 3) {
                kk7.f(i).b(this, kk7.h3);
            }
            this.W = ConnectionsManager.getInstance(i).getConnectionState();
            l();
        }
        tl tlVar = this.g0;
        if (tlVar != null) {
            tlVar.a();
        }
        tl tlVar2 = this.h0;
        if (tlVar2 != null) {
            tlVar2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mu1 mu1Var = this.H;
        if (mu1Var != null) {
            int i = this.K;
            kk7.f(i).n(this, kk7.S1);
            kk7.e().n(this, kk7.k4);
            if (mu1Var.g4 == 3) {
                kk7.f(i).n(this, kk7.h3);
            }
        }
        tl tlVar = this.g0;
        if (tlVar != null) {
            tlVar.b();
        }
        tl tlVar2 = this.h0;
        if (tlVar2 != null) {
            tlVar2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.getText());
        if (this.q0 != null) {
            sb.append(", ");
            sb.append(this.q0);
        }
        if (this.r0 != null) {
            sb.append(", ");
            sb.append(this.r0);
        }
        sb.append("\n");
        zr1 zr1Var = this.r;
        if (zr1Var != null) {
            sb.append(zr1Var.getText());
        } else {
            hn hnVar = this.s;
            if (hnVar != null) {
                sb.append(hnVar.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0(2131747593, null)));
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        float f2;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        k72 k72Var = this.e;
        int measuredHeight = ((currentActionBarHeight - k72Var.getMeasuredHeight()) - 2) / 2;
        if (this.L) {
            i5 = gl.m;
        } else {
            i5 = 0;
        }
        int i6 = measuredHeight + i5;
        if (this.m0) {
            f = 23.66f;
        } else {
            f = 24.0f;
        }
        int L = gl.L(f) + i6;
        int i7 = this.M + 1;
        int i8 = i6 + 1;
        k72Var.layout(i7, i8, k72Var.getMeasuredWidth() + i7, k72Var.getMeasuredHeight() + i8);
        int i9 = this.M;
        int visibility = k72Var.getVisibility();
        boolean z2 = this.m0;
        if (visibility == 0) {
            if (z2) {
                f2 = 49.66f;
            } else {
                f2 = 55.0f;
            }
        } else if (z2) {
            f2 = 13.0f;
        } else {
            f2 = 1.0f;
        }
        int L2 = i9 + gl.L(f2) + this.N;
        jia jiaVar = (jia) this.n.get();
        int visibility2 = getSubtitleTextView().getVisibility();
        zr1 zr1Var = this.h;
        if (visibility2 != 8) {
            zr1Var.layout(L2, (gl.L(1.66f) + i6) - zr1Var.getPaddingTop(), zr1Var.getMeasuredWidth() + L2, zr1Var.getPaddingBottom() + ((gl.L(1.66f) + (zr1Var.getTextHeight() + i6)) - zr1Var.getPaddingTop()));
            if (jiaVar != null) {
                jiaVar.layout(L2, gl.L(1.66f) + i6, jiaVar.getMeasuredWidth() + L2, gl.L(1.66f) + jiaVar.getTextHeight() + i6);
            }
        } else {
            zr1Var.layout(L2, (gl.L(11.0f) + i6) - zr1Var.getPaddingTop(), zr1Var.getMeasuredWidth() + L2, zr1Var.getPaddingBottom() + ((gl.L(11.0f) + (zr1Var.getTextHeight() + i6)) - zr1Var.getPaddingTop()));
            if (jiaVar != null) {
                jiaVar.layout(L2, gl.L(10.0f) + i6, jiaVar.getMeasuredWidth() + L2, gl.L(10.0f) + jiaVar.getTextHeight() + i6);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.layout(gl.L(29.0f) + this.M, gl.L(27.33f) + i6, imageView.getMeasuredWidth() + gl.L(29.0f) + this.M, imageView.getMeasuredHeight() + gl.L(27.33f) + i6);
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.layout(gl.L(19.333f) + this.M, i6 - gl.L(8.0f), imageView2.getMeasuredWidth() + gl.L(19.333f) + this.M, imageView2.getMeasuredHeight() + (i6 - gl.L(8.0f)));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.layout(gl.L(28.0f) + this.M, gl.L(24.0f) + i6, imageView3.getMeasuredWidth() + gl.L(28.0f) + this.M, imageView3.getMeasuredHeight() + gl.L(24.0f) + i6);
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.layout(gl.L(28.0f) + this.M, gl.L(24.0f) + i6, imageView4.getMeasuredWidth() + gl.L(28.0f) + this.M, imageView4.getMeasuredHeight() + gl.L(24.0f) + i6);
        }
        zr1 zr1Var2 = this.r;
        if (zr1Var2 != null) {
            zr1Var2.layout(L2, L, zr1Var2.getMeasuredWidth() + L2, zr1Var2.getTextHeight() + L);
        } else {
            hn hnVar = this.s;
            if (hnVar != null) {
                hnVar.layout(L2, L, hnVar.getMeasuredWidth() + L2, hnVar.getTextHeight() + L);
            }
        }
        jia jiaVar2 = (jia) this.w.get();
        if (jiaVar2 != null) {
            jiaVar2.layout(L2, L, jiaVar2.getMeasuredWidth() + L2, jiaVar2.getTextHeight() + L);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        float f2;
        int size = View.MeasureSpec.getSize(i);
        k72 k72Var = this.e;
        int i4 = 0;
        if (k72Var.getVisibility() == 0) {
            i3 = 54;
        } else {
            i3 = 0;
        }
        int L = size - gl.L(i3 + 16);
        float f3 = this.d;
        k72Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(f3) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(f3) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), Integer.MIN_VALUE);
        zr1 zr1Var = this.h;
        zr1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        hn hnVar = this.s;
        zr1 zr1Var2 = this.r;
        if (zr1Var2 != null) {
            zr1Var2.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), Integer.MIN_VALUE));
        } else if (hnVar != null) {
            hnVar.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(gl.L(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(14.0f), 1073741824));
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(gl.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(34.0f), 1073741824));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), 1073741824));
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
        int i5 = this.P;
        AtomicReference atomicReference = this.n;
        if (i5 != -1 && i5 != size && i5 > size) {
            this.Q = i5;
            View view = (jia) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            jia jiaVar = new jia(getContext());
            atomicReference.set(jiaVar);
            int i6 = bkb.z8;
            wjb wjbVar = this.e0;
            zkb.W(jiaVar, i6, wjbVar);
            if (this.m0) {
                f = 17.5f;
            } else {
                f = 18.0f;
            }
            jiaVar.setTextSizePx(gl.L(f));
            jiaVar.setGravity(3);
            jiaVar.setTypeface(gl.o());
            jiaVar.setLeftDrawableTopPadding(-gl.L(1.3f));
            jiaVar.i(zr1Var.getRightDrawable());
            jiaVar.j(zr1Var.getRightDrawable2());
            jiaVar.setRightDrawableOutside(zr1Var.getRightDrawableOutside());
            jiaVar.setLeftDrawable(zr1Var.getLeftDrawable());
            jiaVar.l(zr1Var.getText(), false);
            ViewPropertyAnimator duration = jiaVar.animate().alpha(0.0f).setDuration(350L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).withEndAction(new g72(this, (byte) 0)).start();
            addView(jiaVar);
            AtomicReference atomicReference2 = this.w;
            View view2 = (jia) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            jia jiaVar2 = new jia(getContext());
            atomicReference2.set(jiaVar2);
            int i7 = bkb.A8;
            zkb.W(jiaVar2, i7, wjbVar);
            jiaVar2.setTag(Integer.valueOf(i7));
            if (this.m0) {
                f2 = 13.5f;
            } else {
                f2 = 14.0f;
            }
            jiaVar2.setTextSizePx(gl.L(f2));
            jiaVar2.setGravity(3);
            if (zr1Var2 != null) {
                jiaVar2.l(zr1Var2.getText(), false);
            } else if (hnVar != null) {
                jiaVar2.l(hnVar.getText(), false);
            }
            jiaVar2.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33Var).withEndAction(new g72(this, (byte) 1)).start();
            addView(jiaVar2);
            setClipChildren(false);
        }
        jia jiaVar3 = (jia) atomicReference.get();
        if (jiaVar3 != null) {
            int i8 = this.Q;
            if (k72Var.getVisibility() == 0) {
                i4 = 54;
            }
            jiaVar3.measure(ug8.f(i4 + 16, i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), Integer.MIN_VALUE));
        }
        this.P = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        n41 n41Var = this.i0;
        g72 g72Var = this.j0;
        if (action == 0 && a()) {
            this.k0 = true;
            n41Var.c(true);
            gl.r(g72Var);
            gl.d3(g72Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.k0) {
            n41Var.c(false);
            this.k0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            gl.r(g72Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        ImageView imageView;
        int i2;
        if (i == 0 && (imageView = this.x) != null) {
            imageView.setAlpha(f);
            float f3 = 0.85f * f;
            imageView.setScaleX(f3);
            imageView.setScaleY(f3);
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
    }

    public void setActionBar(a aVar) {
        this.A0 = aVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f;
        pb0 pb0Var = this.J;
        pb0Var.p(chat);
        k72 k72Var = this.e;
        if (k72Var != null) {
            k72Var.f(chat, pb0Var);
            if (hc2.c0(chat)) {
                if (chat != null && na7.q1(y6c.t0).M1().J(-chat.id)) {
                    f = 11.0f;
                } else {
                    f = 16.0f;
                }
            } else {
                f = 21.0f;
            }
            k72Var.setRoundRadius(gl.L(f));
        }
    }

    public void setCommunityItemVisible(boolean z) {
        int i;
        ImageView imageView = this.y;
        if (imageView != null) {
            if (z && !this.f) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setLeftPadding(int i) {
        this.M = i;
    }

    public void setOccupyStatusBar(boolean z) {
        this.L = z;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.c0 = num;
    }

    @Override
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.i0.c(z);
    }

    public void setRightAvatarPadding(int i) {
        this.N = i;
    }

    public void setStoriesForceState(Integer num) {
        this.c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.a0 == null) {
            zr1 zr1Var = this.r;
            if (zr1Var != null) {
                zr1Var.k(charSequence);
            } else {
                hn hnVar = this.s;
                if (hnVar != null) {
                    hnVar.setText(charSequence);
                }
            }
        } else {
            this.a0 = charSequence;
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.k(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        h(charSequence, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    @Override
    public final void updateColors() {
        bya byaVar = this.O;
        wjb wjbVar = this.e0;
        if (byaVar != null) {
            byaVar.b(bkb.v0(bkb.oa, wjbVar));
        }
        Drawable drawable = this.s0;
        if (drawable != null) {
            int v0 = bkb.v0(bkb.pi, wjbVar);
            PorterDuffColorFilter porterDuffColorFilter = this.w0;
            if (porterDuffColorFilter == null || v0 != this.y0) {
                this.y0 = v0;
                porterDuffColorFilter = new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY);
                this.w0 = porterDuffColorFilter;
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        tl tlVar = this.h0;
        if (tlVar != null) {
            tlVar.k(Integer.valueOf(bkb.v0(bkb.pi, wjbVar)));
        }
        tl tlVar2 = this.g0;
        if (tlVar2 != null) {
            tlVar2.k(Integer.valueOf(bkb.v0(bkb.pi, wjbVar)));
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            int v02 = bkb.v0(bkb.pi, wjbVar);
            PorterDuffColorFilter porterDuffColorFilter2 = this.w0;
            if (porterDuffColorFilter2 == null || v02 != this.y0) {
                this.y0 = v02;
                porterDuffColorFilter2 = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                this.w0 = porterDuffColorFilter2;
            }
            drawable2.setColorFilter(porterDuffColorFilter2);
        }
        if (this.u0 != null) {
            int v03 = bkb.v0(bkb.qi, wjbVar);
            PorterDuffColorFilter porterDuffColorFilter3 = this.x0;
            if (porterDuffColorFilter3 == null || v03 != this.z0) {
                this.z0 = v03;
                porterDuffColorFilter3 = new PorterDuffColorFilter(v03, PorterDuff.Mode.MULTIPLY);
                this.x0 = porterDuffColorFilter3;
            }
            this.u0.setColorFilter(porterDuffColorFilter3);
        }
        zr1 zr1Var = this.h;
        if (zr1Var != null) {
            try {
                if (zr1Var.getRightDrawable2() instanceof gq9) {
                    ((gq9) zr1Var.getRightDrawable2()).b(bkb.v0(bkb.A8, wjbVar));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        invalidate();
    }

    public void f() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void F(float f, int i) {
    }
}
