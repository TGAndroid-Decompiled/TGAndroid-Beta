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
public class z82 extends FrameLayout implements g94, jm7, vlb {
    public a A0;
    public final ImageView E;
    public final ImageView F;
    public final sqb G;
    public final yv1 H;
    public final e0b[] I;
    public final pc0 J;
    public final int K;
    public boolean L;
    public int M;
    public int N;
    public e0b O;
    public int P;
    public int Q;
    public AnimatorSet R;
    public final boolean[] S;
    public final boolean[] T;
    public final boolean U;
    public int V;
    public int W;
    public final fn0 a;
    public CharSequence a0;
    public boolean b;
    public int b0;
    public Integer c;
    public Integer c0;
    public final byte d;
    public final fha d0;
    public final v82 e;
    public final ylb e0;
    public final boolean f;
    public boolean f0;
    public final tm g0;
    public final mt1 h;
    public final tm h0;
    public final u51 i0;
    public final r82 j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public String q0;
    public final mt1 r;
    public String r0;
    public final io s;
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

    public z82(android.content.Context r22, org.telegram.ui.ActionBar.d r23, boolean r24, defpackage.ylb r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z82.<init>(android.content.Context, org.telegram.ui.ActionBar.d, boolean, ylb):void");
    }

    private void setTypingAnimation(boolean z) {
        yv1 yv1Var = this.H;
        mt1 mt1Var = this.r;
        if (mt1Var != null) {
            int i = 0;
            e0b[] e0bVarArr = this.I;
            if (z) {
                try {
                    int intValue = oc7.r1(this.K).C1(yv1Var.a(), yv1Var.s4).intValue();
                    e0b e0bVar = e0bVarArr[intValue];
                    if (e0bVar != null) {
                        ylb ylbVar = this.e0;
                        if (intValue == 5) {
                            mt1Var.g(e0bVar, "**oo**");
                            e0bVarArr[intValue].b(cmb.v0(cmb.oa, ylbVar));
                            mt1Var.setLeftDrawable((Drawable) null);
                        } else {
                            mt1Var.g(null, null);
                            e0bVarArr[intValue].b(cmb.v0(cmb.oa, ylbVar));
                            mt1Var.setLeftDrawable(e0bVarArr[intValue]);
                        }
                        this.O = e0bVarArr[intValue];
                        while (i < e0bVarArr.length) {
                            e0b e0bVar2 = e0bVarArr[i];
                            if (e0bVar2 != null) {
                                if (i == intValue) {
                                    e0bVar2.d();
                                } else {
                                    e0bVar2.e();
                                }
                            }
                            i++;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            }
            this.O = null;
            mt1Var.setLeftDrawable((Drawable) null);
            mt1Var.g(null, null);
            while (i < e0bVarArr.length) {
                e0b e0bVar3 = e0bVarArr[i];
                if (e0bVar3 != null) {
                    e0bVar3.e();
                }
                i++;
            }
        }
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
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

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int L;
        float f;
        int i;
        yv1 yv1Var = this.H;
        if (yv1Var != null) {
            TLRPC.User h = yv1Var.h();
            TLRPC.Chat chat = yv1Var.e;
            if (yv1Var.g4 == 3) {
                long f7 = yv1Var.f7();
                if (f7 >= 0) {
                    user = yv1Var.getMessagesController().W1(Long.valueOf(f7));
                    chat = null;
                } else {
                    chat = yv1Var.getMessagesController().L0(Long.valueOf(-f7));
                    user = null;
                }
            } else {
                user = h;
            }
            pc0 pc0Var = this.J;
            v82 v82Var = this.e;
            if (user != null) {
                pc0Var.q(user);
                if (m9c.B(user)) {
                    pc0Var.p = 0.8f;
                    pc0Var.f(12);
                    if (v82Var != null) {
                        v82Var.setAnimatedEmojiDrawable(null);
                        v82Var.m(null, null, pc0Var, user);
                    }
                } else if (m9c.u(user)) {
                    pc0Var.p = 0.8f;
                    pc0Var.f(21);
                    if (v82Var != null) {
                        v82Var.setAnimatedEmojiDrawable(null);
                        v82Var.m(null, null, pc0Var, user);
                    }
                } else if (m9c.D(user) && yv1Var.g4 == 3) {
                    pc0Var.p = 0.8f;
                    pc0Var.f(22);
                    if (v82Var != null) {
                        v82Var.setAnimatedEmojiDrawable(null);
                        v82Var.m(null, null, pc0Var, user);
                    }
                } else if (m9c.D(user)) {
                    pc0Var.p = 0.8f;
                    pc0Var.f(1);
                    if (v82Var != null) {
                        v82Var.setAnimatedEmojiDrawable(null);
                        v82Var.m(null, null, pc0Var, user);
                    }
                } else {
                    pc0Var.p = 1.0f;
                    if (v82Var != null) {
                        v82Var.setAnimatedEmojiDrawable(null);
                        v82Var.a.V(user, pc0Var, null, true, 3, false);
                    }
                }
            } else if (sd2.p0(chat)) {
                long d = yv1Var.d();
                int i2 = this.K;
                if (sd2.A(i2, chat, 24) && d != 0) {
                    if (i > 0) {
                        TLRPC.User W1 = yv1Var.getMessagesController().W1(Long.valueOf(d));
                        pc0Var.q(W1);
                        v82Var.setAnimatedEmojiDrawable(null);
                        v82Var.f(W1, pc0Var);
                    } else {
                        TLRPC.Chat L0 = yv1Var.getMessagesController().L0(Long.valueOf(-d));
                        pc0Var.p(L0);
                        v82Var.setAnimatedEmojiDrawable(null);
                        v82Var.f(L0, pc0Var);
                    }
                } else {
                    v82Var.setAnimatedEmojiDrawable(null);
                    no4.o(i2, chat, pc0Var, v82Var);
                }
                v82Var.setRoundRadius(gm.L(21.0f));
            } else if (chat != null) {
                pc0Var.p = 1.0f;
                pc0Var.p(chat);
                if (v82Var != null) {
                    v82Var.setAnimatedEmojiDrawable(null);
                    v82Var.f(chat, pc0Var);
                    if (chat.forum) {
                        if (oc7.r1(z8c.t0).N1().J(-chat.id)) {
                            f = 11.0f;
                        } else {
                            f = 16.0f;
                        }
                        L = gm.L(f);
                    } else {
                        L = gm.L(21.0f);
                    }
                    v82Var.setRoundRadius(L);
                }
            }
        }
    }

    public final tm c(long j) {
        if (j == 0) {
            return null;
        }
        tm tmVar = this.h0;
        tmVar.j(j, false);
        tmVar.k(Integer.valueOf(cmb.v0(cmb.pi, this.e0)));
        int L = gm.L(1.0f);
        tmVar.J = 0;
        tmVar.K = L;
        return tmVar;
    }

    public boolean d() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.T1) {
            int connectionState = ConnectionsManager.getInstance(this.K).getConnectionState();
            if (this.W != connectionState) {
                this.W = connectionState;
                l();
            }
        } else if (i == nm7.m4) {
            mt1 mt1Var = this.h;
            if (mt1Var != null) {
                mt1Var.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        } else if (i == nm7.i3) {
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
                RectF rectF = gm.P;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-gm.L(3.0f), -gm.L(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j);
                if (z) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - gm.N(0.33f), imageView.getScaleX() * gm.N(12.0f), cmb.Fm);
                }
                if (z2) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * gm.N(7.66f), cmb.Fm);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(boolean r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z82.e(boolean, boolean):void");
    }

    public final void g(int i, boolean z) {
        sqb sqbVar = this.G;
        if (sqbVar != null) {
            boolean z2 = this.n0;
            if (i == 0 && !this.U) {
                return;
            }
            fn0 fn0Var = this.a;
            if (!z2) {
                fn0Var.a(true, z);
                sqbVar.b(i);
                return;
            }
            fn0Var.a(false, z);
        }
    }

    public bf0 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.b0;
    }

    public int getLeftPadding() {
        return this.M;
    }

    public fha getSharedMediaPreloader() {
        return this.d0;
    }

    public TextPaint getSubtitlePaint() {
        mt1 mt1Var = this.r;
        if (mt1Var != null) {
            return mt1Var.getTextPaint();
        }
        return this.s.getPaint();
    }

    public View getSubtitleTextView() {
        mt1 mt1Var = this.r;
        if (mt1Var != null) {
            return mt1Var;
        }
        io ioVar = this.s;
        if (ioVar != null) {
            return ioVar;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.x;
    }

    public lka getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        int L;
        float f = 0.0f;
        mt1 mt1Var = this.h;
        if (mt1Var != null) {
            f = Math.max(0.0f, mt1Var.getExactWidthIncludeDrawables());
        }
        mt1 mt1Var2 = this.r;
        if (mt1Var2 != null) {
            f = Math.max(f, mt1Var2.getExactWidthIncludeDrawables());
        }
        v82 v82Var = this.e;
        if (v82Var != null && v82Var.getVisibility() == 0) {
            L = gm.L(70.0f);
        } else {
            L = gm.L(34.0f);
        }
        return (int) (f + L);
    }

    public final void h(CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.EmojiStatus emojiStatus, boolean z5) {
        if (charSequence != null) {
            charSequence = gw3.m(charSequence, this.h.getPaint().getFontMetricsInt(), false, null, 0);
        }
        this.h.k(charSequence);
        this.p0 = false;
        if (!z && !z2) {
            if (z3) {
                Drawable mutate = getResources().getDrawable(2131232809).mutate();
                this.t0 = mutate;
                int i = cmb.pi;
                ylb ylbVar = this.e0;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                anb.x(this, mutate, i, ylbVar, mode);
                Drawable mutate2 = getResources().getDrawable(2131232810).mutate();
                this.u0 = mutate2;
                anb.x(this, mutate2, cmb.qi, this.e0, mode);
                this.h.j(new sn2(this.t0, this.u0));
                this.o0 = true;
                this.r0 = jb6.M0(2131754738, null);
            } else if (this.h.getRightDrawable() instanceof hs9) {
                this.h.j(null);
                this.o0 = false;
                this.r0 = null;
            }
        } else {
            this.p0 = true;
            if (!(this.h.getRightDrawable() instanceof hs9)) {
                hs9 hs9Var = new hs9(!z ? 1 : 0);
                hs9Var.b(cmb.v0(cmb.A8, this.e0));
                this.h.j(hs9Var);
                this.r0 = jb6.M0(2131745596, null);
                this.o0 = true;
            }
        }
        if (!z4 && pg3.f(emojiStatus) == 0) {
            this.h.i(null);
            this.q0 = null;
        } else {
            if ((this.h.getRightDrawable() instanceof um) && (((um) this.h.getRightDrawable()).a instanceof vm)) {
                ((vm) ((um) this.h.getRightDrawable()).a).o(this.h);
            }
            if (pg3.f(emojiStatus) != 0) {
                this.g0.j(pg3.f(emojiStatus), z5);
            } else if (z4) {
                Drawable mutate3 = org.telegram.messenger.a.b.getDrawable(2131232313).mutate();
                this.s0 = mutate3;
                anb.x(this, mutate3, cmb.pi, this.e0, PorterDuff.Mode.MULTIPLY);
                this.g0.g(this.s0, z5);
            } else {
                this.g0.g(null, z5);
            }
            this.g0.k(Integer.valueOf(cmb.v0(cmb.pi, this.e0)));
            this.h.i(this.g0);
            this.o0 = false;
            this.q0 = jb6.M0(2131754801, null);
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(z5);
        }
    }

    public final void i(int i, int i2) {
        mt1 mt1Var = this.h;
        anb.q(mt1Var);
        mt1 mt1Var2 = this.r;
        anb.q(mt1Var2);
        mt1Var.setTextColor(i);
        mt1Var2.setTextColor(i2);
        mt1Var2.setTag(Integer.valueOf(i2));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        mt1 mt1Var = this.h;
        mt1Var.setLeftDrawable(drawable);
        if (!this.o0 && !this.p0) {
            if (drawable2 != null) {
                this.r0 = jb6.M0(2131747634, null);
            } else {
                this.r0 = null;
            }
            mt1Var.j(drawable2);
        }
        a aVar = this.A0;
        if (aVar != null) {
            aVar.l(true);
        }
    }

    public final void k(TLRPC.User user, boolean z) {
        pc0 pc0Var = this.J;
        pc0Var.q(user);
        boolean B = m9c.B(user);
        v82 v82Var = this.e;
        if (B) {
            pc0Var.f(12);
            pc0Var.p = 0.8f;
            if (v82Var != null) {
                v82Var.m(null, null, pc0Var, user);
            }
        } else if (m9c.u(user)) {
            pc0Var.f(21);
            pc0Var.p = 0.8f;
            if (v82Var != null) {
                v82Var.m(null, null, pc0Var, user);
            }
        } else if (m9c.D(user) && !z) {
            pc0Var.f(1);
            pc0Var.p = 0.8f;
            if (v82Var != null) {
                v82Var.m(null, null, pc0Var, user);
            }
        } else {
            pc0Var.p = 1.0f;
            if (v82Var != null) {
                v82Var.f(user, pc0Var);
            }
        }
    }

    public final void l() {
        String str;
        int i = this.W;
        if (i == 2) {
            str = jb6.M0(2131742896, null);
        } else if (i == 1) {
            str = jb6.M0(2131751746, null);
        } else if (i == 5) {
            str = jb6.M0(2131743497, null);
        } else if (i == 4) {
            str = jb6.M0(2131751744, null);
        } else {
            str = null;
        }
        ylb ylbVar = this.e0;
        io ioVar = this.s;
        mt1 mt1Var = this.r;
        if (str == null) {
            CharSequence charSequence = this.a0;
            if (charSequence != null) {
                if (mt1Var != null) {
                    mt1Var.k(charSequence);
                    this.a0 = null;
                    Integer num = this.c0;
                    if (num != null) {
                        mt1Var.setTextColor(num.intValue());
                    } else {
                        int i2 = this.b0;
                        if (i2 >= 0) {
                            anb.W(mt1Var, i2, ylbVar);
                            mt1Var.setTag(Integer.valueOf(this.b0));
                        }
                    }
                } else if (ioVar != null) {
                    ioVar.c(charSequence, !jb6.a0, true);
                    this.a0 = null;
                    Integer num2 = this.c0;
                    if (num2 != null) {
                        ioVar.setTextColor(num2.intValue());
                    } else {
                        int i3 = this.b0;
                        if (i3 >= 0) {
                            anb.U(ioVar, i3, ylbVar);
                            ioVar.setTag(Integer.valueOf(this.b0));
                        }
                    }
                }
            }
        } else if (mt1Var != null) {
            if (this.a0 == null) {
                this.a0 = mt1Var.getText();
            }
            mt1Var.k(str);
            Integer num3 = this.c0;
            if (num3 != null) {
                mt1Var.setTextColor(num3.intValue());
            } else {
                int i4 = cmb.A8;
                anb.W(mt1Var, i4, ylbVar);
                mt1Var.setTag(Integer.valueOf(i4));
            }
        } else if (ioVar != null) {
            if (this.a0 == null) {
                this.a0 = ioVar.getText();
            }
            ioVar.c(str, !jb6.a0, true);
            Integer num4 = this.c0;
            if (num4 != null) {
                ioVar.setTextColor(num4.intValue());
            } else {
                int i5 = cmb.A8;
                anb.U(ioVar, i5, ylbVar);
                ioVar.setTag(Integer.valueOf(i5));
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
        yv1 yv1Var = this.H;
        if (yv1Var != null) {
            this.V = 0;
            TLRPC.ChatFull chatFull = yv1Var.r8;
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
                    TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(chatFull.participants.participants.get(i2).user_id));
                    if (W1 != null && (userStatus = W1.status) != null && ((userStatus.expires > currentTime || W1.id == z8c.h(i).e()) && W1.status.expires > 10000)) {
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
        ylb ylbVar = this.e0;
        boolean[] zArr2 = this.S;
        io ioVar = this.s;
        mt1 mt1Var = this.r;
        mt1 mt1Var2 = this.h;
        int i10 = this.K;
        yv1 yv1Var = this.H;
        if (yv1Var != null) {
            if (yv1Var.g4 == 6) {
                String str = yv1Var.e4.link;
                q51[] q51VarArr = q51.e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                setSubtitle(str);
                return;
            }
            TLRPC.User h = yv1Var.h();
            TLRPC.Chat chat = yv1Var.e;
            if (m9c.D(h) && yv1Var.g4 == 0 && yv1Var.getMessagesController().E1().c() >= 3 && (this.v0 || oc7.d1().getInt("savedmsgschatshint", 0) < 3)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (((m9c.D(h) && !z2) || m9c.B(h) || ((h != null && h.id == 489000) || ((i = yv1Var.g4) != 0 && i != 8))) && yv1Var.g4 != 3) {
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
                    oc7.d1().edit().putInt("savedmsgschatshint", oc7.d1().getInt("savedmsgschatshint", i9) + 1).apply();
                    this.v0 = true;
                }
            }
            CharSequence B1 = oc7.r1(i10).B1(yv1Var.a(), yv1Var.s4, false);
            CharSequence charSequence = "";
            if (B1 != null) {
                B1 = TextUtils.replace(B1, new String[]{"..."}, new String[]{""});
            }
            Property property = View.ALPHA;
            Property property2 = View.TRANSLATION_Y;
            boolean z5 = z2;
            if (B1 != null && B1.length() != 0 && (!sd2.T(chat) || chat.megagroup)) {
                if (yv1Var.j8() && mt1Var2.getTag() != null) {
                    mt1Var2.setTag(null);
                    getSubtitleTextView().setVisibility(0);
                    AnimatorSet animatorSet = this.R;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        this.R = null;
                    }
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.R = animatorSet2;
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(mt1Var2, property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 1.0f));
                        this.R.addListener(new y82(this, (byte) 1));
                        this.R.setDuration(180L);
                        this.R.start();
                    } else {
                        mt1Var2.setTranslationY(0.0f);
                        getSubtitleTextView().setAlpha(1.0f);
                    }
                }
                Integer C1 = oc7.r1(i10).C1(yv1Var.a(), yv1Var.s4);
                if (C1 != null && C1.intValue() == 5) {
                    charSequence = gw3.m(B1, getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                } else {
                    charSequence = B1;
                }
                setTypingAnimation(true);
                z4 = true;
            } else if (yv1Var.j8() && !yv1Var.x4) {
                if (mt1Var2.getTag() == null) {
                    mt1Var2.setTag(1);
                    AnimatorSet animatorSet3 = this.R;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                        this.R = null;
                    }
                    if (z) {
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        this.R = animatorSet4;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(mt1Var2, property2, gm.L(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), property, 0.0f));
                        this.R.addListener(new y82(this, (byte) 0));
                        this.R.setDuration(180L);
                        this.R.start();
                        return;
                    }
                    mt1Var2.setTranslationY(gm.L(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                }
                return;
            } else {
                setTypingAnimation(false);
                int i11 = yv1Var.g4;
                if (i11 == 8) {
                    if (yv1Var.i4) {
                        charSequence = jb6.M0(2131752156, null);
                        z4 = false;
                    } else {
                        if (yv1Var.d() == 0) {
                            qwb qwbVar = yv1Var.getMessagesController().g4;
                            long j = -yv1Var.a();
                            if (qwbVar.e(j) && (l = qwbVar.l(j)) != null) {
                                i7 = l.size();
                            } else {
                                i7 = 0;
                            }
                            if (i7 > 0) {
                                G = jb6.H(',', "Chats", i7);
                            } else {
                                G = jb6.M0(2131752156, null);
                            }
                        } else {
                            TLRPC.TL_forumTopic f = oc7.r1(i10).g4.f(chat.id, yv1Var.d());
                            if (f != null) {
                                i6 = f.totalMessagesCount;
                            } else {
                                i6 = 0;
                            }
                            if (i6 > 0) {
                                G = jb6.G(i6, "messages", Integer.valueOf(i6));
                            } else {
                                G = jb6.a0(null, null, 2131743699, no4.j(i10, chat, false));
                            }
                        }
                        charSequence = G;
                        z4 = false;
                    }
                } else {
                    if (i11 == 3) {
                        wr9 E1 = yv1Var.getMessagesController().E1();
                        long f7 = yv1Var.f7();
                        ArrayList arrayList = E1.j;
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                vr9 vr9Var = (vr9) arrayList.get(i12);
                                if (vr9Var.a == f7) {
                                    i5 = vr9Var.e;
                                    break;
                                }
                                i12++;
                            } else {
                                i5 = 0;
                                break;
                            }
                        }
                        charSequence = jb6.G(Math.max(1, i5), "SavedMessagesCount", new Object[0]);
                    } else {
                        if (yv1Var.x4 && chat != null) {
                            TLRPC.TL_forumTopic f2 = oc7.r1(i10).g4.f(chat.id, yv1Var.d());
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
                                G = jb6.G(i4, "messages", objArr);
                            } else {
                                Object[] objArr2 = new Object[i3];
                                objArr2[0] = chat.title;
                                G = jb6.a0(null, null, 2131743699, objArr2);
                            }
                        } else if (chat != null) {
                            TLRPC.ChatFull chatFull = yv1Var.r8;
                            int i13 = this.V;
                            if (sd2.T(chat)) {
                                if (chatFull != null && (i2 = chatFull.participants_count) != 0) {
                                    if (chat.megagroup) {
                                        if (i13 > 1) {
                                            G = kt6.o(jb6.G(i2, "Members", new Object[0]), ", ", jb6.G(Math.min(i13, chatFull.participants_count), "OnlineCount", new Object[0]));
                                        } else {
                                            G = jb6.G(i2, "Members", new Object[0]);
                                        }
                                    } else {
                                        int[] iArr = new int[1];
                                        boolean A1 = gm.A1();
                                        int i14 = chatFull.participants_count;
                                        if (A1) {
                                            iArr[0] = i14;
                                            S = String.valueOf(i14);
                                        } else {
                                            S = jb6.S(iArr, i14);
                                        }
                                        if (chat.megagroup) {
                                            G = jb6.G(iArr[0], "Members", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        } else {
                                            G = jb6.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S);
                                        }
                                    }
                                } else if (chat.megagroup) {
                                    if (chatFull == null) {
                                        G = jb6.M0(2131748536, null).toLowerCase();
                                    } else if (chat.has_geo) {
                                        G = jb6.M0(2131748399, null).toLowerCase();
                                    } else if (sd2.t0(chat)) {
                                        G = jb6.M0(2131748395, null).toLowerCase();
                                    } else {
                                        G = jb6.M0(2131748398, null).toLowerCase();
                                    }
                                } else if (sd2.t0(chat)) {
                                    G = jb6.M0(2131752260, null).toLowerCase();
                                } else {
                                    G = jb6.M0(2131752271, null).toLowerCase();
                                }
                            } else if (sd2.k0(chat)) {
                                G = jb6.M0(2131742492, null);
                            } else if (sd2.l0(chat)) {
                                G = jb6.M0(2131742498, null);
                            } else {
                                int i15 = chat.participants_count;
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                    i15 = chatParticipants.participants.size();
                                }
                                if (i13 > 1 && i15 != 0) {
                                    G = kt6.o(jb6.G(i15, "Members", new Object[0]), ", ", jb6.G(i13, "OnlineCount", new Object[0]));
                                } else {
                                    G = jb6.G(i15, "Members", new Object[0]);
                                }
                            }
                        } else {
                            if (h != null) {
                                TLRPC.User W1 = oc7.r1(i10).W1(Long.valueOf(h.id));
                                if (W1 != null) {
                                    h = W1;
                                }
                                if (!m9c.B(h)) {
                                    long j2 = h.id;
                                    if (j2 != 489000) {
                                        if (j2 == z8c.h(i10).e()) {
                                            charSequence = z5 ? gm.D2(jb6.M0(2131745626, null), false) : jb6.M0(2131752126, null);
                                        } else {
                                            long j3 = h.id;
                                            if (j3 != 333000 && j3 != 777000 && j3 != 42777) {
                                                if (oc7.G2(h)) {
                                                    charSequence = jb6.M0(2131744010, null);
                                                } else if (h.bot) {
                                                    int i16 = h.bot_active_users;
                                                    charSequence = i16 != 0 ? jb6.H(',', "BotUsers", i16) : m9c.e(h);
                                                } else {
                                                    zArr2[0] = false;
                                                    if (this.f0) {
                                                        zArr = this.T;
                                                    } else {
                                                        zArr = null;
                                                    }
                                                    charSequence = jb6.d0(i10, h, zArr2, zArr);
                                                    z4 = zArr2[0];
                                                }
                                            } else {
                                                z3 = false;
                                                charSequence = jb6.M0(2131745295, null);
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
                i8 = cmb.oa;
            } else {
                i8 = cmb.A8;
            }
            this.b0 = i8;
            if (this.a0 == null) {
                if (mt1Var != null) {
                    mt1Var.k(charSequence);
                    Integer num = this.c0;
                    if (num == null) {
                        anb.W(mt1Var, this.b0, ylbVar);
                        mt1Var.setTag(Integer.valueOf(this.b0));
                    } else {
                        mt1Var.setTextColor(num.intValue());
                    }
                } else {
                    ioVar.c(charSequence, z, true);
                    Integer num2 = this.c0;
                    if (num2 == null) {
                        anb.U(ioVar, this.b0, ylbVar);
                        ioVar.setTag(Integer.valueOf(this.b0));
                    } else {
                        ioVar.setTextColor(num2.intValue());
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
        yv1 yv1Var = this.H;
        if (yv1Var != null) {
            int i = this.K;
            nm7.f(i).b(this, nm7.T1);
            nm7.e().b(this, nm7.m4);
            if (yv1Var.g4 == 3) {
                nm7.f(i).b(this, nm7.i3);
            }
            this.W = ConnectionsManager.getInstance(i).getConnectionState();
            l();
        }
        tm tmVar = this.g0;
        if (tmVar != null) {
            tmVar.a();
        }
        tm tmVar2 = this.h0;
        if (tmVar2 != null) {
            tmVar2.a();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yv1 yv1Var = this.H;
        if (yv1Var != null) {
            int i = this.K;
            nm7.f(i).n(this, nm7.T1);
            nm7.e().n(this, nm7.m4);
            if (yv1Var.g4 == 3) {
                nm7.f(i).n(this, nm7.i3);
            }
        }
        tm tmVar = this.g0;
        if (tmVar != null) {
            tmVar.b();
        }
        tm tmVar2 = this.h0;
        if (tmVar2 != null) {
            tmVar2.b();
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
        mt1 mt1Var = this.r;
        if (mt1Var != null) {
            sb.append(mt1Var.getText());
        } else {
            io ioVar = this.s;
            if (ioVar != null) {
                sb.append(ioVar.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, jb6.M0(2131747519, null)));
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        float f2;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        v82 v82Var = this.e;
        int measuredHeight = ((currentActionBarHeight - v82Var.getMeasuredHeight()) - 2) / 2;
        if (this.L) {
            i5 = gm.m;
        } else {
            i5 = 0;
        }
        int i6 = measuredHeight + i5;
        if (this.m0) {
            f = 23.66f;
        } else {
            f = 24.0f;
        }
        int L = gm.L(f) + i6;
        int i7 = this.M + 1;
        int i8 = i6 + 1;
        v82Var.layout(i7, i8, v82Var.getMeasuredWidth() + i7, v82Var.getMeasuredHeight() + i8);
        int i9 = this.M;
        int visibility = v82Var.getVisibility();
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
        int L2 = i9 + gm.L(f2) + this.N;
        lka lkaVar = (lka) this.n.get();
        int visibility2 = getSubtitleTextView().getVisibility();
        mt1 mt1Var = this.h;
        if (visibility2 != 8) {
            mt1Var.layout(L2, (gm.L(1.66f) + i6) - mt1Var.getPaddingTop(), mt1Var.getMeasuredWidth() + L2, mt1Var.getPaddingBottom() + ((gm.L(1.66f) + (mt1Var.getTextHeight() + i6)) - mt1Var.getPaddingTop()));
            if (lkaVar != null) {
                lkaVar.layout(L2, gm.L(1.66f) + i6, lkaVar.getMeasuredWidth() + L2, gm.L(1.66f) + lkaVar.getTextHeight() + i6);
            }
        } else {
            mt1Var.layout(L2, (gm.L(11.0f) + i6) - mt1Var.getPaddingTop(), mt1Var.getMeasuredWidth() + L2, mt1Var.getPaddingBottom() + ((gm.L(11.0f) + (mt1Var.getTextHeight() + i6)) - mt1Var.getPaddingTop()));
            if (lkaVar != null) {
                lkaVar.layout(L2, gm.L(10.0f) + i6, lkaVar.getMeasuredWidth() + L2, gm.L(10.0f) + lkaVar.getTextHeight() + i6);
            }
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.layout(gm.L(29.0f) + this.M, gm.L(27.33f) + i6, imageView.getMeasuredWidth() + gm.L(29.0f) + this.M, imageView.getMeasuredHeight() + gm.L(27.33f) + i6);
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.layout(gm.L(19.333f) + this.M, i6 - gm.L(8.0f), imageView2.getMeasuredWidth() + gm.L(19.333f) + this.M, imageView2.getMeasuredHeight() + (i6 - gm.L(8.0f)));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.layout(gm.L(28.0f) + this.M, gm.L(24.0f) + i6, imageView3.getMeasuredWidth() + gm.L(28.0f) + this.M, imageView3.getMeasuredHeight() + gm.L(24.0f) + i6);
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.layout(gm.L(28.0f) + this.M, gm.L(24.0f) + i6, imageView4.getMeasuredWidth() + gm.L(28.0f) + this.M, imageView4.getMeasuredHeight() + gm.L(24.0f) + i6);
        }
        mt1 mt1Var2 = this.r;
        if (mt1Var2 != null) {
            mt1Var2.layout(L2, L, mt1Var2.getMeasuredWidth() + L2, mt1Var2.getTextHeight() + L);
        } else {
            io ioVar = this.s;
            if (ioVar != null) {
                ioVar.layout(L2, L, ioVar.getMeasuredWidth() + L2, ioVar.getTextHeight() + L);
            }
        }
        lka lkaVar2 = (lka) this.w.get();
        if (lkaVar2 != null) {
            lkaVar2.layout(L2, L, lkaVar2.getMeasuredWidth() + L2, lkaVar2.getTextHeight() + L);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        float f2;
        int size = View.MeasureSpec.getSize(i);
        v82 v82Var = this.e;
        int i4 = 0;
        if (v82Var.getVisibility() == 0) {
            i3 = 54;
        } else {
            i3 = 0;
        }
        int L = size - gm.L(i3 + 16);
        float f3 = this.d;
        v82Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(f3) - 2, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(f3) - 2, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), Integer.MIN_VALUE);
        mt1 mt1Var = this.h;
        mt1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        io ioVar = this.s;
        mt1 mt1Var2 = this.r;
        if (mt1Var2 != null) {
            mt1Var2.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), Integer.MIN_VALUE));
        } else if (ioVar != null) {
            ioVar.measure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), Integer.MIN_VALUE));
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(gm.L(14.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(14.0f), 1073741824));
        }
        ImageView imageView2 = this.x;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(gm.L(34.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(34.0f), 1073741824));
        }
        ImageView imageView3 = this.E;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), 1073741824));
        }
        ImageView imageView4 = this.F;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), 1073741824));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
        int i5 = this.P;
        AtomicReference atomicReference = this.n;
        if (i5 != -1 && i5 != size && i5 > size) {
            this.Q = i5;
            View view = (lka) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            lka lkaVar = new lka(getContext());
            atomicReference.set(lkaVar);
            int i6 = cmb.z8;
            ylb ylbVar = this.e0;
            anb.W(lkaVar, i6, ylbVar);
            if (this.m0) {
                f = 17.5f;
            } else {
                f = 18.0f;
            }
            lkaVar.setTextSizePx(gm.L(f));
            lkaVar.setGravity(3);
            lkaVar.setTypeface(gm.o());
            lkaVar.setLeftDrawableTopPadding(-gm.L(1.3f));
            lkaVar.i(mt1Var.getRightDrawable());
            lkaVar.j(mt1Var.getRightDrawable2());
            lkaVar.setRightDrawableOutside(mt1Var.getRightDrawableOutside());
            lkaVar.setLeftDrawable(mt1Var.getLeftDrawable());
            lkaVar.l(mt1Var.getText(), false);
            ViewPropertyAnimator duration = lkaVar.animate().alpha(0.0f).setDuration(350L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).withEndAction(new r82(this, (byte) 0)).start();
            addView(lkaVar);
            AtomicReference atomicReference2 = this.w;
            View view2 = (lka) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            lka lkaVar2 = new lka(getContext());
            atomicReference2.set(lkaVar2);
            int i7 = cmb.A8;
            anb.W(lkaVar2, i7, ylbVar);
            lkaVar2.setTag(Integer.valueOf(i7));
            if (this.m0) {
                f2 = 13.5f;
            } else {
                f2 = 14.0f;
            }
            lkaVar2.setTextSizePx(gm.L(f2));
            lkaVar2.setGravity(3);
            if (mt1Var2 != null) {
                lkaVar2.l(mt1Var2.getText(), false);
            } else if (ioVar != null) {
                lkaVar2.l(ioVar.getText(), false);
            }
            lkaVar2.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53Var).withEndAction(new r82(this, (byte) 1)).start();
            addView(lkaVar2);
            setClipChildren(false);
        }
        lka lkaVar3 = (lka) atomicReference.get();
        if (lkaVar3 != null) {
            int i8 = this.Q;
            if (v82Var.getVisibility() == 0) {
                i4 = 54;
            }
            lkaVar3.measure(wi8.f(i4 + 16, i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), Integer.MIN_VALUE));
        }
        this.P = size;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        u51 u51Var = this.i0;
        r82 r82Var = this.j0;
        if (action == 0 && a()) {
            this.k0 = true;
            u51Var.c(true);
            gm.r(r82Var);
            gm.d3(r82Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.k0) {
            u51Var.c(false);
            this.k0 = false;
            if (isClickable() && motionEvent.getAction() == 1) {
                e(false, false);
            }
            gm.r(r82Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(a aVar) {
        this.A0 = aVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        float f;
        pc0 pc0Var = this.J;
        pc0Var.p(chat);
        v82 v82Var = this.e;
        if (v82Var != null) {
            v82Var.f(chat, pc0Var);
            if (sd2.c0(chat)) {
                if (chat != null && oc7.r1(z8c.t0).N1().J(-chat.id)) {
                    f = 11.0f;
                } else {
                    f = 16.0f;
                }
            } else {
                f = 21.0f;
            }
            v82Var.setRoundRadius(gm.L(f));
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
            mt1 mt1Var = this.r;
            if (mt1Var != null) {
                mt1Var.k(charSequence);
            } else {
                io ioVar = this.s;
                if (ioVar != null) {
                    ioVar.setText(charSequence);
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
        h(charSequence, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    @Override
    public final void updateColors() {
        e0b e0bVar = this.O;
        ylb ylbVar = this.e0;
        if (e0bVar != null) {
            e0bVar.b(cmb.v0(cmb.oa, ylbVar));
        }
        Drawable drawable = this.s0;
        if (drawable != null) {
            int v0 = cmb.v0(cmb.pi, ylbVar);
            PorterDuffColorFilter porterDuffColorFilter = this.w0;
            if (porterDuffColorFilter == null || v0 != this.y0) {
                this.y0 = v0;
                porterDuffColorFilter = new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY);
                this.w0 = porterDuffColorFilter;
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        tm tmVar = this.h0;
        if (tmVar != null) {
            tmVar.k(Integer.valueOf(cmb.v0(cmb.pi, ylbVar)));
        }
        tm tmVar2 = this.g0;
        if (tmVar2 != null) {
            tmVar2.k(Integer.valueOf(cmb.v0(cmb.pi, ylbVar)));
        }
        Drawable drawable2 = this.t0;
        if (drawable2 != null) {
            int v02 = cmb.v0(cmb.pi, ylbVar);
            PorterDuffColorFilter porterDuffColorFilter2 = this.w0;
            if (porterDuffColorFilter2 == null || v02 != this.y0) {
                this.y0 = v02;
                porterDuffColorFilter2 = new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                this.w0 = porterDuffColorFilter2;
            }
            drawable2.setColorFilter(porterDuffColorFilter2);
        }
        if (this.u0 != null) {
            int v03 = cmb.v0(cmb.qi, ylbVar);
            PorterDuffColorFilter porterDuffColorFilter3 = this.x0;
            if (porterDuffColorFilter3 == null || v03 != this.z0) {
                this.z0 = v03;
                porterDuffColorFilter3 = new PorterDuffColorFilter(v03, PorterDuff.Mode.MULTIPLY);
                this.x0 = porterDuffColorFilter3;
            }
            this.u0.setColorFilter(porterDuffColorFilter3);
        }
        mt1 mt1Var = this.h;
        if (mt1Var != null) {
            try {
                if (mt1Var.getRightDrawable2() instanceof hs9) {
                    ((hs9) mt1Var.getRightDrawable2()).b(cmb.v0(cmb.A8, ylbVar));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void f() {
    }

    @Override
    public final void V(float f, int i) {
    }
}
