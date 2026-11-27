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
public class f82 extends FrameLayout implements s84, fn7, snb {
    public a A0;
    public final ImageView E;
    public final ImageView F;
    public final rsb G;
    public final zu1 H;
    public final d2b[] I;
    public final rb0 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public d2b O;
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
    public final wia d0;
    public final b82 e;
    public final vnb e0;
    public final boolean f;
    public boolean f0;
    public final ul g0;
    public final ns1 h;
    public final ul h0;
    public final v41 i0;
    public final x72 j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public final ns1 r;
    public String r0;
    public final in s;
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

    public f82(android.content.Context r22, org.telegram.ui.ActionBar.e r23, boolean r24, defpackage.vnb r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f82.<init>(android.content.Context, org.telegram.ui.ActionBar.e, boolean, vnb):void");
    }

    private void setTypingAnimation(boolean z) {
        zu1 zu1Var = this.H;
        ns1 ns1Var = this.r;
        if (ns1Var != null) {
            int i = 0;
            d2b[] d2bVarArr = this.I;
            if (z) {
                try {
                    int intValue = uc7.s1(this.K).D1(zu1Var.a(), zu1Var.s4).intValue();
                    d2b d2bVar = d2bVarArr[intValue];
                    if (d2bVar != null) {
                        vnb vnbVar = this.e0;
                        if (intValue == 5) {
                            ns1Var.g(d2bVar, "**oo**");
                            d2bVarArr[intValue].b(aob.v0(aob.pa, vnbVar));
                            ns1Var.setLeftDrawable((Drawable) null);
                        } else {
                            ns1Var.g(null, null);
                            d2bVarArr[intValue].b(aob.v0(aob.pa, vnbVar));
                            ns1Var.setLeftDrawable(d2bVarArr[intValue]);
                        }
                        this.O = d2bVarArr[intValue];
                        while (i < d2bVarArr.length) {
                            d2b d2bVar2 = d2bVarArr[i];
                            if (d2bVar2 != null) {
                                if (i == intValue) {
                                    d2bVar2.d();
                                } else {
                                    d2bVar2.e();
                                }
                            }
                            i++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            }
            this.O = null;
            ns1Var.setLeftDrawable((Drawable) null);
            ns1Var.g(null, null);
            while (i < d2bVarArr.length) {
                d2b d2bVar3 = d2bVarArr[i];
                if (d2bVar3 != null) {
                    d2bVar3.e();
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
        zu1 zu1Var = this.H;
        if (zu1Var != null) {
            TLRPC.User h = zu1Var.h();
            TLRPC.Chat chat = zu1Var.e;
            if (zu1Var.g4 == 3) {
                long f7 = zu1Var.f7();
                if (f7 >= 0) {
                    user = zu1Var.getMessagesController().X1(Long.valueOf(f7));
                    chat = null;
                } else {
                    chat = zu1Var.getMessagesController().M0(Long.valueOf(-f7));
                    user = null;
                }
            } else {
                user = h;
            }
            rb0 rb0Var = this.J;
            b82 b82Var = this.e;
            if (user != null) {
                rb0Var.q(user);
                if (lbc.B(user)) {
                    rb0Var.p = 0.8f;
                    rb0Var.f(12);
                    if (b82Var != null) {
                        b82Var.setAnimatedEmojiDrawable(null);
                        b82Var.m(null, null, rb0Var, user);
                    }
                } else if (lbc.u(user)) {
                    rb0Var.p = 0.8f;
                    rb0Var.f(21);
                    if (b82Var != null) {
                        b82Var.setAnimatedEmojiDrawable(null);
                        b82Var.m(null, null, rb0Var, user);
                    }
                } else if (lbc.D(user) && zu1Var.g4 == 3) {
                    rb0Var.p = 0.8f;
                    rb0Var.f(22);
                    if (b82Var != null) {
                        b82Var.setAnimatedEmojiDrawable(null);
                        b82Var.m(null, null, rb0Var, user);
                    }
                } else if (lbc.D(user)) {
                    rb0Var.p = 0.8f;
                    rb0Var.f(1);
                    if (b82Var != null) {
                        b82Var.setAnimatedEmojiDrawable(null);
                        b82Var.m(null, null, rb0Var, user);
                    }
                } else {
                    rb0Var.p = 1.0f;
                    if (b82Var != null) {
                        b82Var.setAnimatedEmojiDrawable(null);
                        b82Var.a.V(user, rb0Var, null, true, 3, false);
                    }
                }
            } else if (xc2.p0(chat)) {
                long c = zu1Var.c();
                int i2 = this.K;
                if (xc2.A(i2, chat, 24) && c != 0) {
                    if (i > 0) {
                        TLRPC.User X1 = zu1Var.getMessagesController().X1(Long.valueOf(c));
                        rb0Var.q(X1);
                        b82Var.setAnimatedEmojiDrawable(null);
                        b82Var.f(X1, rb0Var);
                    } else {
                        TLRPC.Chat M0 = zu1Var.getMessagesController().M0(Long.valueOf(-c));
                        rb0Var.p(M0);
                        b82Var.setAnimatedEmojiDrawable(null);
                        b82Var.f(M0, rb0Var);
                    }
                } else {
                    b82Var.setAnimatedEmojiDrawable(null);
                    ro4.o(i2, chat, rb0Var, b82Var);
                }
                b82Var.setRoundRadius(hl.L(21.0f));
            } else if (chat != null) {
                rb0Var.p = 1.0f;
                rb0Var.p(chat);
                if (b82Var != null) {
                    b82Var.setAnimatedEmojiDrawable(null);
                    b82Var.f(chat, rb0Var);
                    if (chat.forum) {
                        if (uc7.s1(yac.t0).O1().J(-chat.id)) {
                            f = 11.0f;
                        } else {
                            f = 16.0f;
                        }
                        L = hl.L(f);
                    } else {
                        L = hl.L(21.0f);
                    }
                    b82Var.setRoundRadius(L);
                }
            }
        }
    }

    public final ul c(long j) {
        if (j == 0) {
            return null;
        }
        ul ulVar = this.h0;
        ulVar.j(j, false);
        ulVar.k(Integer.valueOf(aob.v0(aob.qi, this.e0)));
        int L = hl.L(1.0f);
        ulVar.J = 0;
        ulVar.K = L;
        return ulVar;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.T1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
            }
        } else if (i == jn7.l4) {
            ns1 ns1Var = this.h;
            if (ns1Var != null) {
                ns1Var.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        } else if (i == jn7.i3) {
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
                RectF rectF = hl.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-hl.L(3.0f), -hl.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j);
                if (z) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - hl.N(0.33f), imageView.getScaleX() * hl.N(12.0f), aob.Gm);
                }
                if (z2) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * hl.N(7.66f), aob.Gm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(boolean r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f82.e(boolean, boolean):void");
    }

    public final void g(int i, boolean z) {
        rsb rsbVar = this.G;
        if (rsbVar != null) {
            boolean z2 = this.n0;
            if (i == 0 && !this.U) {
                return;
            }
            fm0 fm0Var = this.a;
            if (!z2) {
                fm0Var.a(true, z);
                rsbVar.b(i);
                return;
            }
            fm0Var.a(false, z);
        }
    }

    public de0 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public wia getSharedMediaPreloader() {
        return this.d0;
    }

    public TextPaint getSubtitlePaint() {
        ns1 ns1Var = this.r;
        if (ns1Var != null) {
            return ns1Var.getTextPaint();
        }
        return this.s.getPaint();
    }

    public View getSubtitleTextView() {
        ns1 ns1Var = this.r;
        if (ns1Var != null) {
            return ns1Var;
        }
        in inVar = this.s;
        if (inVar != null) {
            return inVar;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.x;
    }

    public ema getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int L;
        float f = 0.0f;
        ns1 ns1Var = this.h;
        if (ns1Var != null) {
            f = Math.max(0.0f, ns1Var.getExactWidthIncludeDrawables());
        }
        ns1 ns1Var2 = this.r;
        if (ns1Var2 != null) {
            f = Math.max(f, ns1Var2.getExactWidthIncludeDrawables());
        }
        b82 b82Var = this.e;
        if (b82Var != null && b82Var.getVisibility() == 0) {
            L = hl.L(70.0f);
        } else {
            L = hl.L(34.0f);
        }
        return (int) (f + L);
    }

    public final void h(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TLRPC.EmojiStatus emojiStatus, boolean z6) {
        int i;
        int i2;
        int i3;
        if (charSequence != null) {
            charSequence = pv3.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.p0 = false;
        if (!z && !z2 && !z3) {
            if (z4) {
                Drawable mutate = getResources().getDrawable(2131232815).mutate();
                this.t0 = mutate;
                int i4 = aob.qi;
                vnb vnbVar = this.e0;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                yob.x(this, mutate, i4, vnbVar, mode);
                Drawable mutate2 = getResources().getDrawable(2131232816).mutate();
                this.u0 = mutate2;
                yob.x(this, mutate2, aob.ri, this.e0, mode);
                this.h.j(new zm2(this.t0, this.u0));
                this.o0 = true;
                this.r0 = ob6.M0(2131754734, null);
            } else if (this.h.getRightDrawable2() instanceof yt9) {
                this.h.j(null);
                this.o0 = false;
                this.r0 = null;
            }
        } else {
            this.p0 = true;
            if (z) {
                i = 0;
            } else if (z2) {
                i = 1;
            } else {
                i = 2;
            }
            if (!(this.h.getRightDrawable2() instanceof yt9) || ((yt9) this.h.getRightDrawable2()).f != i) {
                yt9 yt9Var = new yt9(i);
                if (i == 2) {
                    i2 = aob.p7;
                } else {
                    i2 = aob.B8;
                }
                yt9Var.b(aob.v0(i2, this.e0));
                this.h.j(yt9Var);
                if (i == 2) {
                    i3 = 2131745000;
                } else {
                    i3 = 2131745590;
                }
                this.r0 = ob6.M0(i3, null);
                this.o0 = true;
            }
        }
        if (!z5 && wf3.f(emojiStatus) == 0) {
            this.h.i(null);
            this.q0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof vl) && (((vl) this.h.getRightDrawable()).a instanceof wl)) {
                ((wl) ((vl) this.h.getRightDrawable()).a).o(this.h);
            }
            if (wf3.f(emojiStatus) != 0) {
                this.g0.j(wf3.f(emojiStatus), z6);
            } else if (z5) {
                Drawable mutate3 = org.telegram.messenger.a.b.getDrawable(2131232312).mutate();
                this.s0 = mutate3;
                yob.x(this, mutate3, aob.qi, this.e0, PorterDuff.Mode.MULTIPLY);
                this.g0.g(this.s0, z6);
            } else {
                this.g0.g(null, z6);
            }
            this.g0.k(Integer.valueOf(aob.v0(aob.qi, this.e0)));
            this.h.i(this.g0);
            this.o0 = false;
            this.q0 = ob6.M0(2131754797, null);
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(z6);
        }
    }

    public final void i(int i, int i2) {
        ns1 ns1Var = this.h;
        yob.q(ns1Var);
        ns1 ns1Var2 = this.r;
        yob.q(ns1Var2);
        ns1Var.setTextColor(i);
        ns1Var2.setTextColor(i2);
        ns1Var2.setTag(Integer.valueOf(i2));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        ns1 ns1Var = this.h;
        ns1Var.setLeftDrawable(drawable);
        if (!this.o0 && !this.p0) {
            if (drawable2 != null) {
                this.r0 = ob6.M0(2131747628, null);
            } else {
                this.r0 = null;
            }
            ns1Var.j(drawable2);
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(true);
        }
    }

    public final void k(TLRPC.User user, boolean z) {
        rb0 rb0Var = this.J;
        rb0Var.q(user);
        boolean B = lbc.B(user);
        b82 b82Var = this.e;
        if (B) {
            rb0Var.f(12);
            rb0Var.p = 0.8f;
            if (b82Var != null) {
                b82Var.m(null, null, rb0Var, user);
            }
        } else if (lbc.u(user)) {
            rb0Var.f(21);
            rb0Var.p = 0.8f;
            if (b82Var != null) {
                b82Var.m(null, null, rb0Var, user);
            }
        } else if (lbc.D(user) && !z) {
            rb0Var.f(1);
            rb0Var.p = 0.8f;
            if (b82Var != null) {
                b82Var.m(null, null, rb0Var, user);
            }
        } else {
            rb0Var.p = 1.0f;
            if (b82Var != null) {
                b82Var.f(user, rb0Var);
            }
        }
    }

    public final void l() {
        String str;
        int i = this.W;
        if (i == 2) {
            str = ob6.M0(2131742864, null);
        } else if (i == 1) {
            str = ob6.M0(2131751774, null);
        } else if (i == 5) {
            str = ob6.M0(2131743465, null);
        } else if (i == 4) {
            str = ob6.M0(2131751772, null);
        } else {
            str = null;
        }
        vnb vnbVar = this.e0;
        in inVar = this.s;
        ns1 ns1Var = this.r;
        if (str == null) {
            CharSequence charSequence = this.a0;
            if (charSequence != null) {
                if (ns1Var != null) {
                    ns1Var.k(charSequence);
                    this.a0 = null;
                    Integer num = this.c0;
                    if (num != null) {
                        ns1Var.setTextColor(num.intValue());
                    } else {
                        int i2 = this.b0;
                        if (i2 >= 0) {
                            yob.W(ns1Var, i2, vnbVar);
                            ns1Var.setTag(Integer.valueOf(this.b0));
                        }
                    }
                } else if (inVar != null) {
                    inVar.c(charSequence, !ob6.a0, true);
                    this.a0 = null;
                    Integer num2 = this.c0;
                    if (num2 != null) {
                        inVar.setTextColor(num2.intValue());
                    } else {
                        int i3 = this.b0;
                        if (i3 >= 0) {
                            yob.U(inVar, i3, vnbVar);
                            inVar.setTag(Integer.valueOf(this.b0));
                        }
                    }
                }
            }
        } else if (ns1Var != null) {
            if (this.a0 == null) {
                this.a0 = ns1Var.getText();
            }
            ns1Var.k(str);
            Integer num3 = this.c0;
            if (num3 != null) {
                ns1Var.setTextColor(num3.intValue());
            } else {
                int i4 = aob.B8;
                yob.W(ns1Var, i4, vnbVar);
                ns1Var.setTag(Integer.valueOf(i4));
            }
        } else if (inVar != null) {
            if (this.a0 == null) {
                this.a0 = inVar.getText();
            }
            inVar.c(str, !ob6.a0, true);
            Integer num4 = this.c0;
            if (num4 != null) {
                inVar.setTextColor(num4.intValue());
            } else {
                int i5 = aob.B8;
                yob.U(inVar, i5, vnbVar);
                inVar.setTag(Integer.valueOf(i5));
            }
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z;
        zu1 zu1Var = this.H;
        if (zu1Var != null) {
            this.V = 0;
            TLRPC.ChatFull chatFull = zu1Var.r8;
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
                    TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(chatFull.participants.participants.get(i2).user_id));
                    if (X1 != null && (userStatus = X1.status) != null && ((userStatus.expires > currentTime || X1.id == yac.h(i).e()) && X1.status.expires > 10000)) {
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
        vnb vnbVar = this.e0;
        boolean[] zArr2 = this.S;
        in inVar = this.s;
        ns1 ns1Var = this.r;
        ns1 ns1Var2 = this.h;
        int i10 = this.K;
        zu1 zu1Var = this.H;
        if (zu1Var != null) {
            if (zu1Var.g4 == 6) {
                String str = zu1Var.e4.link;
                r41[] r41VarArr = r41.e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                setSubtitle(str);
                return;
            }
            TLRPC.User h = zu1Var.h();
            TLRPC.Chat chat = zu1Var.e;
            if (lbc.D(h) && zu1Var.g4 == 0 && zu1Var.getMessagesController().F1().c() >= 3 && (this.v0 || uc7.e1().getInt("savedmsgschatshint", 0) < 3)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (((lbc.D(h) && !z2) || lbc.B(h) || ((h != null && h.id == 489000) || ((i = zu1Var.g4) != 0 && i != 8))) && zu1Var.g4 != 3) {
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
                    uc7.e1().edit().putInt("savedmsgschatshint", uc7.e1().getInt("savedmsgschatshint", i9) + 1).apply();
                    this.v0 = true;
                }
            }
            CharSequence C1 = uc7.s1(i10).C1(zu1Var.a(), zu1Var.s4, false);
            CharSequence charSequence = "";
            if (C1 != null) {
                C1 = TextUtils.replace(C1, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z5 = z2;
            if (C1 != null && C1.length() != 0 && (!xc2.T(chat) || chat.megagroup)) {
                if (zu1Var.k8() && ns1Var2.getTag() != null) {
                    ns1Var2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.R = null;
                    }
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.R = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ns1Var2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.R.addListener(new e82(this, (byte) 1));
                        this.R.setDuration(180L);
                        this.R.start();
                    } else {
                        ns1Var2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer D1 = uc7.s1(i10).D1(zu1Var.a(), zu1Var.s4);
                if (D1 != null && D1.intValue() == 5) {
                    charSequence = pv3.m(C1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                } else {
                    charSequence = C1;
                }
                setTypingAnimation(true);
                z4 = true;
            } else if (zu1Var.k8() && !zu1Var.x4) {
                if (ns1Var2.getTag() == null) {
                    ns1Var2.setTag(1);
                    AnimatorSet animatorSet3 = this.R;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.R = null;
                    }
                    if (z) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.R = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(ns1Var2, property2, hl.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.R.addListener(new e82(this, (byte) 0));
                        this.R.setDuration(180L);
                        this.R.start();
                        return;
                    }
                    ns1Var2.setTranslationY(hl.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i11 = zu1Var.g4;
                if (i11 == 8) {
                    if (zu1Var.i4) {
                        charSequence = ob6.M0(2131752184, null);
                        z4 = false;
                    } else {
                        if (zu1Var.c() == 0) {
                            qyb qybVar = zu1Var.getMessagesController().g4;
                            long j = -zu1Var.a();
                            if (qybVar.e(j) && (l = qybVar.l(j)) != null) {
                                i7 = l.size();
                            } else {
                                i7 = 0;
                            }
                            if (i7 > 0) {
                                G = ob6.H(',', "Chats", i7);
                            } else {
                                G = ob6.M0(2131752184, null);
                            }
                        } else {
                            TLRPC.TL_forumTopic f = uc7.s1(i10).g4.f(chat.id, zu1Var.c());
                            if (f != null) {
                                i6 = f.totalMessagesCount;
                            } else {
                                i6 = 0;
                            }
                            if (i6 > 0) {
                                G = ob6.G(i6, "messages", Integer.valueOf(i6));
                            } else {
                                G = ob6.a0(null, null, 2131743667, ro4.j(i10, chat, false));
                            }
                        }
                        charSequence = G;
                        z4 = false;
                    }
                } else {
                    if (i11 == 3) {
                        nt9 F1 = zu1Var.getMessagesController().F1();
                        long f7 = zu1Var.f7();
                        ArrayList arrayList = F1.j;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                mt9 mt9Var = (mt9) arrayList.get(i12);
                                if (mt9Var.a == f7) {
                                    i5 = mt9Var.e;
                                    break;
                                }
                                i12++;
                            } else {
                                i5 = 0;
                                break;
                            }
                        }
                        charSequence = ob6.G(Math.max(1, i5), "SavedMessagesCount", new Object[0]);
                    } else {
                        if (zu1Var.x4 && chat != null) {
                            TLRPC.TL_forumTopic f2 = uc7.s1(i10).g4.f(chat.id, zu1Var.c());
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
                                G = ob6.G(i4, "messages", objArr);
                            } else {
                                Object[] objArr2 = new Object[i3];
                                objArr2[0] = chat.title;
                                G = ob6.a0(null, null, 2131743667, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = zu1Var.r8;
                            int i13 = this.V;
                            if (xc2.T(chat)) {
                                if (chatFull != null && (i2 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i13 > 1) {
                                            G = qd4.y(ob6.G(i2, "Members", new Object[0]), ", ", ob6.G(Math.min(i13, chatFull.participants_count), "OnlineCount", new Object[0]));
                                        } else {
                                            G = ob6.G(i2, "Members", new Object[0]);
                                        }
                                    } else {
                                        int[] iArr = new int[1];
                                        boolean A1 = hl.A1();
                                        int i14 = chatFull.participants_count;
                                        if (A1) {
                                            iArr[0] = i14;
                                            S = String.valueOf(i14);
                                        } else {
                                            S = ob6.S(iArr, i14);
                                        }
                                        if (chat.megagroup) {
                                            G = ob6.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        } else {
                                            G = ob6.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        }
                                    }
                                } else if (chat.megagroup) {
                                    if (chatFull == null) {
                                        G = ob6.M0(2131748533, null).toLowerCase();
                                    } else if (chat.has_geo) {
                                        G = ob6.M0(2131748396, null).toLowerCase();
                                    } else if (xc2.t0(chat)) {
                                        G = ob6.M0(2131748392, null).toLowerCase();
                                    } else {
                                        G = ob6.M0(2131748395, null).toLowerCase();
                                    }
                                } else if (xc2.t0(chat)) {
                                    G = ob6.M0(2131752288, null).toLowerCase();
                                } else {
                                    G = ob6.M0(2131752299, null).toLowerCase();
                                }
                            } else if (xc2.k0(chat)) {
                                G = ob6.M0(2131742460, null);
                            } else if (xc2.l0(chat)) {
                                G = ob6.M0(2131742466, null);
                            } else {
                                int i15 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i15 = chatParticipants.participants.size();
                                }
                                if (i13 > 1 && i15 != 0) {
                                    G = qd4.y(ob6.G(i15, "Members", new Object[0]), ", ", ob6.G(i13, "OnlineCount", new Object[0]));
                                } else {
                                    G = ob6.G(i15, "Members", new Object[0]);
                                }
                            }
                        } else {
                            if (h != null) {
                                TLRPC.User X1 = uc7.s1(i10).X1(Long.valueOf(h.id));
                                if (X1 != null) {
                                    h = X1;
                                }
                                if (!lbc.B(h)) {
                                    long j2 = h.id;
                                    if (j2 != 489000) {
                                        if (j2 == yac.h(i10).e()) {
                                            charSequence = z5 ? hl.D2(ob6.M0(2131745620, null), false) : ob6.M0(2131752154, null);
                                        } else {
                                            long j3 = h.id;
                                            if (j3 != 333000 && j3 != 777000 && j3 != 42777) {
                                                if (uc7.K2(h)) {
                                                    charSequence = ob6.M0(2131743978, null);
                                                } else if (h.bot) {
                                                    int i16 = h.bot_active_users;
                                                    charSequence = i16 != 0 ? ob6.H(',', "BotUsers", i16) : lbc.e(h);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f0) {
                                                        zArr = this.T;
                                                    } else {
                                                        zArr = null;
                                                    }
                                                    charSequence = ob6.d0(i10, h, zArr2, zArr);
                                                    z4 = zArr2[0];
                                                }
                                            } else {
                                                z3 = false;
                                                charSequence = ob6.M0(2131745289, null);
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
                i8 = aob.pa;
            } else {
                i8 = aob.B8;
            }
            this.b0 = i8;
            if (this.a0 == null) {
                if (ns1Var != null) {
                    ns1Var.k(charSequence);
                    Integer num = this.c0;
                    if (num == null) {
                        yob.W(ns1Var, this.b0, vnbVar);
                        ns1Var.setTag(Integer.valueOf(this.b0));
                    } else {
                        ns1Var.setTextColor(num.intValue());
                    }
                } else {
                    inVar.c(charSequence, z, true);
                    Integer num2 = this.c0;
                    if (num2 == null) {
                        yob.U(inVar, this.b0, vnbVar);
                        inVar.setTag(Integer.valueOf(this.b0));
                    } else {
                        inVar.setTextColor(num2.intValue());
                    }
                }
            } else {
                this.a0 = charSequence;
            }
            a aVar = this.A0;
            if (aVar != null) {
                aVar.l(z);
            }
        }
    }

    public boolean o() {
        return false;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zu1 zu1Var = this.H;
        if (zu1Var != null) {
            int i = this.K;
            jn7.f(i).b(this, jn7.T1);
            jn7.e().b(this, jn7.l4);
            if (zu1Var.g4 == 3) {
                jn7.f(i).b(this, jn7.i3);
            }
            this.W = ConnectionsManager.getInstance(i).getConnectionState();
            l();
        }
        ul ulVar = this.g0;
        if (ulVar != null) {
            ulVar.a();
        }
        ul ulVar2 = this.h0;
        if (ulVar2 != null) {
            ulVar2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zu1 zu1Var = this.H;
        if (zu1Var != null) {
            int i = this.K;
            jn7.f(i).n(this, jn7.T1);
            jn7.e().n(this, jn7.l4);
            if (zu1Var.g4 == 3) {
                jn7.f(i).n(this, jn7.i3);
            }
        }
        ul ulVar = this.g0;
        if (ulVar != null) {
            ulVar.b();
        }
        ul ulVar2 = this.h0;
        if (ulVar2 != null) {
            ulVar2.b();
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
        ns1 ns1Var = this.r;
        if (ns1Var != null) {
            sb.append(ns1Var.getText());
        } else {
            in inVar = this.s;
            if (inVar != null) {
                sb.append(inVar.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, ob6.M0(2131747513, null)));
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        float f2;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        b82 b82Var = this.e;
        int measuredHeight = ((currentActionBarHeight - b82Var.getMeasuredHeight()) - 2) / 2;
        if (this.L) {
            i5 = hl.m;
        } else {
            i5 = 0;
        }
        int i6 = measuredHeight + i5;
        if (this.m0) {
            f = 23.66f;
        } else {
            f = 24.0f;
        }
        int L = hl.L(f) + i6;
        int i7 = this.M + 1;
        int i8 = i6 + 1;
        b82Var.layout(i7, i8, b82Var.getMeasuredWidth() + i7, b82Var.getMeasuredHeight() + i8);
        int i9 = this.M;
        int visibility = b82Var.getVisibility();
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
        int L2 = i9 + hl.L(f2) + this.N;
        ema emaVar = (ema) this.n.get();
        int visibility2 = getSubtitleTextView().getVisibility();
        ns1 ns1Var = this.h;
        if (visibility2 != 8) {
            ns1Var.layout(L2, (hl.L(1.66f) + i6) - ns1Var.getPaddingTop(), ns1Var.getMeasuredWidth() + L2, ns1Var.getPaddingBottom() + ((hl.L(1.66f) + (ns1Var.getTextHeight() + i6)) - ns1Var.getPaddingTop()));
            if (emaVar != null) {
                emaVar.layout(L2, hl.L(1.66f) + i6, emaVar.getMeasuredWidth() + L2, hl.L(1.66f) + emaVar.getTextHeight() + i6);
            }
        } else {
            ns1Var.layout(L2, (hl.L(11.0f) + i6) - ns1Var.getPaddingTop(), ns1Var.getMeasuredWidth() + L2, ns1Var.getPaddingBottom() + ((hl.L(11.0f) + (ns1Var.getTextHeight() + i6)) - ns1Var.getPaddingTop()));
            if (emaVar != null) {
                emaVar.layout(L2, hl.L(10.0f) + i6, emaVar.getMeasuredWidth() + L2, hl.L(10.0f) + emaVar.getTextHeight() + i6);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.layout(hl.L(29.0f) + this.M, hl.L(27.33f) + i6, imageView.getMeasuredWidth() + hl.L(29.0f) + this.M, imageView.getMeasuredHeight() + hl.L(27.33f) + i6);
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.layout(hl.L(19.333f) + this.M, i6 - hl.L(8.0f), imageView2.getMeasuredWidth() + hl.L(19.333f) + this.M, imageView2.getMeasuredHeight() + (i6 - hl.L(8.0f)));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.layout(hl.L(28.0f) + this.M, hl.L(24.0f) + i6, imageView3.getMeasuredWidth() + hl.L(28.0f) + this.M, imageView3.getMeasuredHeight() + hl.L(24.0f) + i6);
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.layout(hl.L(28.0f) + this.M, hl.L(24.0f) + i6, imageView4.getMeasuredWidth() + hl.L(28.0f) + this.M, imageView4.getMeasuredHeight() + hl.L(24.0f) + i6);
        }
        ns1 ns1Var2 = this.r;
        if (ns1Var2 != null) {
            ns1Var2.layout(L2, L, ns1Var2.getMeasuredWidth() + L2, ns1Var2.getTextHeight() + L);
        } else {
            in inVar = this.s;
            if (inVar != null) {
                inVar.layout(L2, L, inVar.getMeasuredWidth() + L2, inVar.getTextHeight() + L);
            }
        }
        ema emaVar2 = (ema) this.w.get();
        if (emaVar2 != null) {
            emaVar2.layout(L2, L, emaVar2.getMeasuredWidth() + L2, emaVar2.getTextHeight() + L);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        float f2;
        int size = View.MeasureSpec.getSize(i);
        b82 b82Var = this.e;
        int i4 = 0;
        if (b82Var.getVisibility() == 0) {
            i3 = 54;
        } else {
            i3 = 0;
        }
        int L = size - hl.L(i3 + 16);
        float f3 = this.d;
        b82Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(f3) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(f3) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), Integer.MIN_VALUE);
        ns1 ns1Var = this.h;
        ns1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        in inVar = this.s;
        ns1 ns1Var2 = this.r;
        if (ns1Var2 != null) {
            ns1Var2.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), Integer.MIN_VALUE));
        } else if (inVar != null) {
            inVar.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(hl.L(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(14.0f), 1073741824));
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(hl.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(34.0f), 1073741824));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
        int i5 = this.P;
        AtomicReference atomicReference = this.n;
        if (i5 != -1 && i5 != size && i5 > size) {
            this.Q = i5;
            View view = (ema) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            ema emaVar = new ema(getContext());
            atomicReference.set(emaVar);
            int i6 = aob.A8;
            vnb vnbVar = this.e0;
            yob.W(emaVar, i6, vnbVar);
            if (this.m0) {
                f = 17.5f;
            } else {
                f = 18.0f;
            }
            emaVar.setTextSizePx(hl.L(f));
            emaVar.setGravity(3);
            emaVar.setTypeface(hl.o());
            emaVar.setLeftDrawableTopPadding(-hl.L(1.3f));
            emaVar.i(ns1Var.getRightDrawable());
            emaVar.j(ns1Var.getRightDrawable2());
            emaVar.setRightDrawableOutside(ns1Var.getRightDrawableOutside());
            emaVar.setLeftDrawable(ns1Var.getLeftDrawable());
            emaVar.l(ns1Var.getText(), false);
            ViewPropertyAnimator duration = emaVar.animate().alpha(0.0f).setDuration(350L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).withEndAction(new x72(this, (byte) 0)).start();
            addView(emaVar);
            AtomicReference atomicReference2 = this.w;
            View view2 = (ema) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            ema emaVar2 = new ema(getContext());
            atomicReference2.set(emaVar2);
            int i7 = aob.B8;
            yob.W(emaVar2, i7, vnbVar);
            emaVar2.setTag(Integer.valueOf(i7));
            if (this.m0) {
                f2 = 13.5f;
            } else {
                f2 = 14.0f;
            }
            emaVar2.setTextSizePx(hl.L(f2));
            emaVar2.setGravity(3);
            if (ns1Var2 != null) {
                emaVar2.l(ns1Var2.getText(), false);
            } else if (inVar != null) {
                emaVar2.l(inVar.getText(), false);
            }
            emaVar2.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43Var).withEndAction(new x72(this, (byte) 1)).start();
            addView(emaVar2);
            setClipChildren(false);
        }
        ema emaVar3 = (ema) atomicReference.get();
        if (emaVar3 != null) {
            int i8 = this.Q;
            if (b82Var.getVisibility() == 0) {
                i4 = 54;
            }
            emaVar3.measure(ik8.f(i4 + 16, i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), Integer.MIN_VALUE));
        }
        this.P = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        v41 v41Var = this.i0;
        x72 x72Var = this.j0;
        if (action == 0 && a()) {
            this.k0 = true;
            v41Var.c(true);
            hl.r(x72Var);
            hl.d3(x72Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.k0) {
            v41Var.c(false);
            this.k0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            hl.r(x72Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(a aVar) {
        this.A0 = aVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f;
        rb0 rb0Var = this.J;
        rb0Var.p(chat);
        b82 b82Var = this.e;
        if (b82Var != null) {
            b82Var.f(chat, rb0Var);
            if (xc2.c0(chat)) {
                if (chat != null && uc7.s1(yac.t0).O1().J(-chat.id)) {
                    f = 11.0f;
                } else {
                    f = 16.0f;
                }
            } else {
                f = 21.0f;
            }
            b82Var.setRoundRadius(hl.L(f));
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
            ns1 ns1Var = this.r;
            if (ns1Var != null) {
                ns1Var.k(charSequence);
            } else {
                in inVar = this.s;
                if (inVar != null) {
                    inVar.setText(charSequence);
                }
            }
        } else {
            this.a0 = charSequence;
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        h(charSequence, false, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
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

    @Override
    public final void updateColors() {
        int i;
        d2b d2bVar = this.O;
        vnb vnbVar = this.e0;
        if (d2bVar != null) {
            d2bVar.b(aob.v0(aob.pa, vnbVar));
        }
        Drawable drawable = this.s0;
        if (drawable != null) {
            int v0 = aob.v0(aob.qi, vnbVar);
            PorterDuffColorFilter porterDuffColorFilter = this.w0;
            if (porterDuffColorFilter == null || v0 != this.y0) {
                this.y0 = v0;
                porterDuffColorFilter = new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY);
                this.w0 = porterDuffColorFilter;
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        ul ulVar = this.h0;
        if (ulVar != null) {
            ulVar.k(Integer.valueOf(aob.v0(aob.qi, vnbVar)));
        }
        ul ulVar2 = this.g0;
        if (ulVar2 != null) {
            ulVar2.k(Integer.valueOf(aob.v0(aob.qi, vnbVar)));
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            int v02 = aob.v0(aob.qi, vnbVar);
            PorterDuffColorFilter porterDuffColorFilter2 = this.w0;
            if (porterDuffColorFilter2 == null || v02 != this.y0) {
                this.y0 = v02;
                porterDuffColorFilter2 = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                this.w0 = porterDuffColorFilter2;
            }
            drawable2.setColorFilter(porterDuffColorFilter2);
        }
        if (this.u0 != null) {
            int v03 = aob.v0(aob.ri, vnbVar);
            PorterDuffColorFilter porterDuffColorFilter3 = this.x0;
            if (porterDuffColorFilter3 == null || v03 != this.z0) {
                this.z0 = v03;
                porterDuffColorFilter3 = new PorterDuffColorFilter(v03, PorterDuff.Mode.MULTIPLY);
                this.x0 = porterDuffColorFilter3;
            }
            this.u0.setColorFilter(porterDuffColorFilter3);
        }
        ns1 ns1Var = this.h;
        if (ns1Var != null) {
            try {
                if (ns1Var.getRightDrawable2() instanceof yt9) {
                    yt9 yt9Var = (yt9) ns1Var.getRightDrawable2();
                    if (yt9Var.f == 2) {
                        i = aob.p7;
                    } else {
                        i = aob.B8;
                    }
                    yt9Var.b(aob.v0(i, vnbVar));
                }
            } catch (Exception e) {
                cc4.g(e, true);
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
    public final void v0(float f, int i) {
    }
}
