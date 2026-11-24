package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class h9c extends View implements jm7 {
    public static final int Q = 0;
    public final RectF E;
    public final fg0 F;
    public final u51 G;
    public final gd0 H;
    public final Drawable I;
    public int J;
    public sb7 K;
    public float L;
    public float M;
    public float N;
    public int O;
    public boolean P;
    public final int a;
    public final ylb b;
    public long c;
    public uib d;
    public uib e;
    public uib f;
    public final ArrayList h;
    public g9c n;
    public float r;
    public float s;
    public float w;
    public final RectF x;
    public final u51 y;

    public h9c(int i, ylb ylbVar, Context context) {
        super(context);
        this.h = new ArrayList();
        this.x = new RectF();
        this.y = new u51(this);
        this.E = new RectF();
        this.G = new u51(this);
        gd0 gd0Var = new gd0(this, false);
        this.H = gd0Var;
        this.J = -1;
        this.a = i;
        this.b = ylbVar;
        fg0 Y = cmb.Y(822083583, 8, 8);
        this.F = Y;
        Y.setCallback(this);
        gd0Var.p = gm.L(50.0f);
        gd0Var.o = gm.L(13.0f);
        gd0Var.x = false;
        gd0Var.s = gm.L(13.0f);
        gd0Var.h(gm.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(2131232247).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final g9c a(CharSequence charSequence, String str, boolean z) {
        int i;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.L += gm.L(7.0f);
        }
        g9c g9cVar = new g9c(charSequence, str, z);
        arrayList.add(g9cVar);
        this.L += gm.L(14.0f);
        this.s = Math.max(this.s, g9cVar.a.c);
        float f = this.w;
        float f2 = g9cVar.b.c;
        if (z) {
            i = gm.L(38.0f);
        } else {
            i = 0;
        }
        this.w = Math.max(f, f2 + i);
        return g9cVar;
    }

    public final void b(long j, TLRPC.PeerSettings peerSettings) {
        int i;
        TLRPC.User W1;
        TLRPC.UserFull X1;
        float f;
        TL_bots.BotVerification botVerification;
        this.c = j;
        this.M = 0.0f;
        this.L = 0.0f;
        this.s = 0.0f;
        this.w = 0.0f;
        this.h.clear();
        int i2 = (int) (gm.q.x * 0.95f);
        this.L += gm.L(14.0f);
        uib uibVar = new uib(pg3.k(z8c.t0, j), 14.0f, gm.o());
        this.d = uibVar;
        this.L = uibVar.h() + gm.L(3.0f) + this.L;
        int i3 = this.a;
        if (bw2.r(i3).x(j)) {
            i = 2131751738;
        } else {
            i = 2131751737;
        }
        uib uibVar2 = new uib(jb6.M0(i, null), 14.0f, null);
        this.e = uibVar2;
        this.L = uibVar2.h() + gm.L(11.0f) + this.L;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String M0 = jb6.M0(2131751734, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String E0 = jb6.E0(str);
            if (!TextUtils.isEmpty(E0)) {
                spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            }
            String i0 = jb6.i0(2131751733, str);
            if (!TextUtils.isEmpty(i0)) {
                spannableStringBuilder.append((CharSequence) i0);
            } else {
                spannableStringBuilder.append((CharSequence) str);
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(gm.L(12.0f));
            a(gw3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), true, null, 0), M0, false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String M02 = jb6.M0(2131751732, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = jb6.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, M02, false);
        }
        int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i4 < 0) {
            W1 = null;
            X1 = null;
        } else {
            W1 = oc7.r1(i3).W1(Long.valueOf(j));
            X1 = oc7.r1(i3).X1(j);
        }
        if (X1 == null && i4 > 0) {
            f = 14.0f;
            oc7.r1(i3).k3(0, oc7.r1(i3).W1(Long.valueOf(j)), true);
        } else {
            f = 14.0f;
        }
        if (X1 != null) {
            sb7 O0 = oc7.r1(i3).O0(j);
            this.K = O0;
            int max = Math.max(X1.common_chats_count, O0.g);
            if (max > 0) {
                this.n = a(jb6.G(max, "Groups", new Object[0]), jb6.M0(2131751739, null), true);
                int min = Math.min(3, this.K.e.size());
                gd0 gd0Var = this.H;
                gd0Var.i(min);
                for (int i5 = 0; i5 < Math.min(3, this.K.e.size()); i5++) {
                    gd0Var.j(i5, i3, (TLObject) this.K.e.get(i5));
                }
                gd0Var.a(true, true);
            } else {
                this.K = null;
                this.n = null;
            }
        } else {
            this.K = null;
            this.n = null;
        }
        this.r = this.s + gm.L(7.66f) + this.w;
        if (W1 != null && !W1.verified && !m9c.C(W1.id)) {
            if (W1.bot_verification_icon != 0) {
                if (X1 != null && (botVerification = X1.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                    this.f = new uib(spannableStringBuilder2, 12.0f, null);
                    spannableStringBuilder2.setSpan(new gn(botVerification.icon, this.f.a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder2.append(k47.h0(botVerification.description, false));
                    uib uibVar3 = new uib(spannableStringBuilder2, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    uibVar3.a();
                    uibVar3.l(5);
                    Point point = gm.q;
                    uibVar3.o(Math.min(point.x, point.y) * 0.5f);
                    uibVar3.q(this);
                    this.f = uibVar3;
                    this.L = this.f.h() + gm.L(12.0f) + gm.L(15.33f) + this.L;
                } else {
                    this.f = null;
                    this.L += gm.L(f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
                pn2 pn2Var = new pn2(2131231129, 0);
                pn2Var.I = 0.55f;
                pn2Var.J = -0.55f;
                pn2Var.r = gm.L(1.0f);
                pn2Var.s = gm.L(-1.0f);
                spannableStringBuilder3.setSpan(pn2Var, 0, 1, 33);
                spannableStringBuilder3.append((CharSequence) jb6.M0(2131751735, null));
                this.f = new uib(spannableStringBuilder3, 12.0f, null);
                this.L = this.f.h() + gm.L(12.0f) + gm.L(15.33f) + this.L;
            }
        } else {
            this.f = null;
            this.L += gm.L(f);
        }
        float max2 = Math.max(this.M, this.d.j());
        this.M = max2;
        float max3 = Math.max(max2, this.e.j());
        this.M = max3;
        float max4 = Math.max(max3, this.r);
        this.M = max4;
        this.M = Math.min(max4 + gm.L(32.0f), i2);
    }

    public final void c(float f, int i) {
        if (Math.abs(this.N - f) > 0.01f || i != this.O) {
            invalidate();
        }
        this.O = i;
        this.N = f;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.E0;
        int i4 = this.a;
        if (i == i3) {
            long longValue = ((Long) objArr[0]).longValue();
            long j = this.c;
            if (longValue == j) {
                b(j, oc7.r1(i4).A1(this.c));
            }
        } else if (i == nm7.R3 && ((Long) objArr[0]).longValue() == this.c) {
            sb7 O0 = oc7.r1(i4).O0(this.c);
            this.K = O0;
            int i5 = O0.g;
            g9c g9cVar = this.n;
            if (g9cVar != null && i5 > 0) {
                g9cVar.b = new uib(jb6.G(i5, "Groups", new Object[0]), 12.0f, gm.o());
                int min = Math.min(3, this.K.e.size());
                gd0 gd0Var = this.H;
                gd0Var.i(min);
                for (int i6 = 0; i6 < Math.min(3, this.K.e.size()); i6++) {
                    gd0Var.j(i6, i4, (TLObject) this.K.e.get(i6));
                }
                gd0Var.a(true, true);
            } else {
                b(this.c, oc7.r1(i4).A1(this.c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        nm7.f(i).b(this, nm7.E0);
        nm7.f(i).b(this, nm7.R3);
        this.H.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        nm7.f(i).n(this, nm7.E0);
        nm7.f(i).n(this, nm7.R3);
        this.H.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        boolean b1;
        boolean z;
        float f;
        float f2;
        super.onDraw(canvas);
        ylb ylbVar = this.b;
        if (cmb.g1(ylbVar)) {
            i = cmb.v0(cmb.Ea, ylbVar);
        } else {
            i = -1;
        }
        int i2 = i;
        int i3 = this.J;
        Drawable drawable = this.I;
        if (i3 != i2) {
            this.J = i2;
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        canvas.save();
        float f3 = 2.0f;
        float width = getWidth() / 2.0f;
        RectF rectF = this.x;
        rectF.set((getWidth() - this.M) / 2.0f, (getHeight() - this.L) / 2.0f, (getWidth() + this.M) / 2.0f, (getHeight() + this.L) / 2.0f);
        float a = this.y.a(0.025f);
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i4 = this.O;
        float x = getX();
        float f4 = this.N;
        if (ylbVar != null) {
            ylbVar.b(x, f4, measuredWidth, i4);
        } else {
            cmb.q(x, f4, measuredWidth, i4);
        }
        float f5 = 16.0f;
        canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), cmb.U0("paintChatActionBackground", ylbVar));
        if (ylbVar != null) {
            b1 = ylbVar.g();
        } else {
            b1 = cmb.b1();
        }
        if (b1) {
            canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), cmb.U0("paintChatActionBackgroundDarken", ylbVar));
        }
        float f6 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.L) / 2.0f);
        float z2 = aq1.z(getHeight(), this.L, 2.0f, 0.0f);
        float f7 = 14.0f;
        canvas.translate(0.0f, gm.L(14.0f));
        float L = z2 + gm.L(14.0f);
        uib uibVar = this.d;
        float f8 = 32.0f;
        uibVar.p = this.M - gm.L(32.0f);
        uibVar.c(width - (this.d.j() / 2.0f), this.d.h() / 2.0f, 1.0f, i2, canvas);
        canvas.translate(0.0f, this.d.h() + gm.L(3.0f));
        float h = L + this.d.h() + gm.L(3.0f);
        uib uibVar2 = this.e;
        uibVar2.p = this.M - gm.L(32.0f);
        uibVar2.c(width - (this.e.j() / 2.0f), this.e.h() / 2.0f, 0.7f, i2, canvas);
        canvas.translate(0.0f, this.e.h() + gm.L(11.0f));
        float h2 = this.e.h() + gm.L(11.0f) + h;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i5 >= arrayList.size()) {
                break;
            }
            if (i5 > 0) {
                canvas.translate(f6, gm.L(7.0f));
                h2 += gm.L(7.0f);
            }
            canvas.save();
            g9c g9cVar = (g9c) arrayList.get(i5);
            float f9 = f3;
            float L2 = (width - (this.M / f3)) + gm.L(f5) + this.s;
            float f10 = h2;
            uib uibVar3 = g9cVar.a;
            float f11 = f5;
            boolean z3 = g9cVar.c;
            float f12 = f7;
            RectF rectF2 = g9cVar.d;
            float f13 = f8;
            float f14 = L2 - uibVar3.c;
            float L3 = (width - (this.M / f9)) + gm.L(f11) + this.s + gm.L(7.66f);
            uibVar3.p = (L3 - f14) - gm.L(7.66f);
            int i6 = i5;
            uibVar3.c(f14, uibVar3.h() / f9, 0.7f, i2, canvas);
            float L4 = (width - (this.M / f9)) + gm.L(f11) + this.s + gm.L(7.66f);
            float L5 = (width - (this.M / f9)) + gm.L(f11) + this.s + gm.L(7.66f) + g9cVar.b.c;
            gd0 gd0Var = this.H;
            if (z3) {
                f = gd0Var.A + (drawable.getIntrinsicWidth() * 0.8f) + gm.L(5.0f);
            } else {
                f = 0.0f;
            }
            rectF2.set(L4, f10, L5 + f, g9cVar.b.h() + f10);
            if (this.n == g9cVar) {
                RectF rectF3 = this.E;
                rectF3.set(rectF2);
                rectF3.inset(-gm.L(4.0f), -gm.L(f9));
                float a2 = this.G.a(0.025f);
                f2 = 4.0f;
                canvas.scale(a2, a2, rectF3.centerX(), g9cVar.b.h() / f9);
                fg0 fg0Var = this.F;
                if (fg0Var != null) {
                    fg0Var.setBounds((int) rectF3.left, (int) (rectF3.top - f10), (int) rectF3.right, (int) (rectF3.bottom - f10));
                    fg0Var.draw(canvas);
                }
            } else {
                f2 = 4.0f;
            }
            uib uibVar4 = g9cVar.b;
            uibVar4.p = (((this.M / f9) + width) - gm.L(8.0f)) - L3;
            uibVar4.c(L3, g9cVar.b.h() / f9, 1.0f, i2, canvas);
            if (z3) {
                canvas.save();
                canvas.translate((width - (this.M / f9)) + gm.L(f11) + this.s + gm.L(7.66f) + g9cVar.b.c + gm.L(f2), gm.L(1.0f));
                gd0Var.g(canvas);
                canvas.translate(gd0Var.A + gm.L(1.0f), gm.L(13.0f) / f9);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / f9), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / f9));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, gm.L(f12));
            h2 = gm.L(f12) + f10;
            i5 = i6 + 1;
            f3 = f9;
            f5 = f11;
            f7 = f12;
            f8 = f13;
            f6 = 0.0f;
        }
        float f15 = f3;
        float f16 = f8;
        if (this.f != null) {
            canvas.translate(0.0f, gm.L(12.0f));
            uib uibVar5 = this.f;
            if (uibVar5.f > 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                uibVar5.c(width - (uibVar5.j() / f15), 0.0f, 0.7f, i2, canvas);
            } else {
                uibVar5.p = this.M - gm.L(f16);
                uibVar5.c(width - (this.f.j() / f15), this.f.h() / f15, 0.7f, i2, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), kt6.e(16.0f, (int) this.L, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        pr1 pr1Var;
        if (this.n != null && this.E.contains(motionEvent.getX(), motionEvent.getY())) {
            z = true;
        } else {
            z = false;
        }
        if (!z && this.x.contains(motionEvent.getX(), motionEvent.getY())) {
            z2 = true;
        } else {
            z2 = false;
        }
        int action = motionEvent.getAction();
        fg0 fg0Var = this.F;
        u51 u51Var = this.G;
        u51 u51Var2 = this.y;
        if (action == 0) {
            u51Var2.c(z2);
            u51Var.c(z);
            fg0Var.setState(z ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (u51Var2.i) {
                d S = LaunchActivity.S();
                if ((S instanceof yv1) && (pr1Var = ((yv1) S).p1) != null) {
                    pr1Var.e(true, false);
                }
            } else if (u51Var.i) {
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    Bundle bundle = new Bundle();
                    long j = this.c;
                    if (j >= 0) {
                        bundle.putLong("user_id", j);
                    } else {
                        bundle.putLong("chat_id", -j);
                    }
                    bundle.putBoolean("open_common", true);
                    S2.presentFragment(new ProfileActivity(bundle, null));
                }
                invalidate();
            }
            u51Var.c(false);
            u51Var2.c(false);
            fg0Var.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            u51Var.c(false);
            u51Var2.c(false);
            fg0Var.setState(new int[0]);
        }
        if (u51Var.i || u51Var2.i) {
            return true;
        }
        return false;
    }

    public void setAnimating(boolean z) {
        this.P = z;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.F && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
