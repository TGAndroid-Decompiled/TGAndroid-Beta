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
public final class g7c extends View implements gk7 {
    public static final int Q = 0;
    public final RectF E;
    public final ff0 F;
    public final n41 G;
    public final gc0 H;
    public final Drawable I;
    public int J;
    public r97 K;
    public float L;
    public float M;
    public float N;
    public int O;
    public boolean P;
    public final int a;
    public final wjb b;
    public long c;
    public tgb d;
    public tgb e;
    public tgb f;
    public final ArrayList h;
    public f7c n;
    public float r;
    public float s;
    public float w;
    public final RectF x;
    public final n41 y;

    public g7c(int i, wjb wjbVar, Context context) {
        super(context);
        this.h = new ArrayList();
        this.x = new RectF();
        this.y = new n41(this);
        this.E = new RectF();
        this.G = new n41(this);
        gc0 gc0Var = new gc0(this, false);
        this.H = gc0Var;
        this.J = -1;
        this.a = i;
        this.b = wjbVar;
        ff0 Y = bkb.Y(822083583, 8, 8);
        this.F = Y;
        Y.setCallback(this);
        gc0Var.p = gl.L(50.0f);
        gc0Var.o = gl.L(13.0f);
        gc0Var.x = false;
        gc0Var.s = gl.L(13.0f);
        gc0Var.h(gl.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(2131232246).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final f7c a(CharSequence charSequence, String str, boolean z) {
        int i;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.L += gl.L(7.0f);
        }
        f7c f7cVar = new f7c(charSequence, str, z);
        arrayList.add(f7cVar);
        this.L += gl.L(14.0f);
        this.s = Math.max(this.s, f7cVar.a.c);
        float f = this.w;
        float f2 = f7cVar.b.c;
        if (z) {
            i = gl.L(38.0f);
        } else {
            i = 0;
        }
        this.w = Math.max(f, f2 + i);
        return f7cVar;
    }

    public final void b(long j, TLRPC.PeerSettings peerSettings) {
        int i;
        TLRPC.User V1;
        TLRPC.UserFull W1;
        float f;
        TL_bots.BotVerification botVerification;
        this.c = j;
        this.M = 0.0f;
        this.L = 0.0f;
        this.s = 0.0f;
        this.w = 0.0f;
        this.h.clear();
        int i2 = (int) (gl.q.x * 0.95f);
        this.L += gl.L(14.0f);
        tgb tgbVar = new tgb(cf3.k(y6c.t0, j), 14.0f, gl.o());
        this.d = tgbVar;
        this.L = tgbVar.h() + gl.L(3.0f) + this.L;
        int i3 = this.a;
        if (qu2.r(i3).x(j)) {
            i = 2131751789;
        } else {
            i = 2131751788;
        }
        tgb tgbVar2 = new tgb(k96.M0(i, null), 14.0f, null);
        this.e = tgbVar2;
        this.L = tgbVar2.h() + gl.L(11.0f) + this.L;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String M0 = k96.M0(2131751785, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String E0 = k96.E0(str);
            if (!TextUtils.isEmpty(E0)) {
                spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            }
            String i0 = k96.i0(2131751784, str);
            if (!TextUtils.isEmpty(i0)) {
                spannableStringBuilder.append((CharSequence) i0);
            } else {
                spannableStringBuilder.append((CharSequence) str);
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(gl.L(12.0f));
            a(vu3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), true, null, 0), M0, false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String M02 = k96.M0(2131751783, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = k96.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, M02, false);
        }
        int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i4 < 0) {
            V1 = null;
            W1 = null;
        } else {
            V1 = na7.q1(i3).V1(Long.valueOf(j));
            W1 = na7.q1(i3).W1(j);
        }
        if (W1 == null && i4 > 0) {
            f = 14.0f;
            na7.q1(i3).i3(0, na7.q1(i3).V1(Long.valueOf(j)), true);
        } else {
            f = 14.0f;
        }
        if (W1 != null) {
            r97 N0 = na7.q1(i3).N0(j);
            this.K = N0;
            int max = Math.max(W1.common_chats_count, N0.g);
            if (max > 0) {
                this.n = a(k96.G(max, "Groups", new Object[0]), k96.M0(2131751790, null), true);
                int min = Math.min(3, this.K.e.size());
                gc0 gc0Var = this.H;
                gc0Var.i(min);
                for (int i5 = 0; i5 < Math.min(3, this.K.e.size()); i5++) {
                    gc0Var.j(i5, i3, (TLObject) this.K.e.get(i5));
                }
                gc0Var.a(true, true);
            } else {
                this.K = null;
                this.n = null;
            }
        } else {
            this.K = null;
            this.n = null;
        }
        this.r = this.s + gl.L(7.66f) + this.w;
        if (V1 != null && !V1.verified && !l7c.C(V1.id)) {
            if (V1.bot_verification_icon != 0) {
                if (W1 != null && (botVerification = W1.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                    this.f = new tgb(spannableStringBuilder2, 12.0f, null);
                    spannableStringBuilder2.setSpan(new gm(botVerification.icon, this.f.a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder2.append(k27.h0(botVerification.description, false));
                    tgb tgbVar3 = new tgb(spannableStringBuilder2, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    tgbVar3.a();
                    tgbVar3.l(5);
                    Point point = gl.q;
                    tgbVar3.o(Math.min(point.x, point.y) * 0.5f);
                    tgbVar3.q(this);
                    this.f = tgbVar3;
                    this.L = this.f.h() + gl.L(12.0f) + gl.L(15.33f) + this.L;
                } else {
                    this.f = null;
                    this.L += gl.L(f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
                cm2 cm2Var = new cm2(2131231128, 0);
                cm2Var.I = 0.55f;
                cm2Var.J = -0.55f;
                cm2Var.r = gl.L(1.0f);
                cm2Var.s = gl.L(-1.0f);
                spannableStringBuilder3.setSpan(cm2Var, 0, 1, 33);
                spannableStringBuilder3.append((CharSequence) k96.M0(2131751786, null));
                this.f = new tgb(spannableStringBuilder3, 12.0f, null);
                this.L = this.f.h() + gl.L(12.0f) + gl.L(15.33f) + this.L;
            }
        } else {
            this.f = null;
            this.L += gl.L(f);
        }
        float max2 = Math.max(this.M, this.d.j());
        this.M = max2;
        float max3 = Math.max(max2, this.e.j());
        this.M = max3;
        float max4 = Math.max(max3, this.r);
        this.M = max4;
        this.M = Math.min(max4 + gl.L(32.0f), i2);
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
        int i3 = kk7.D0;
        int i4 = this.a;
        if (i == i3) {
            long longValue = ((Long) objArr[0]).longValue();
            long j = this.c;
            if (longValue == j) {
                b(j, na7.q1(i4).z1(this.c));
            }
        } else if (i == kk7.Q3 && ((Long) objArr[0]).longValue() == this.c) {
            r97 N0 = na7.q1(i4).N0(this.c);
            this.K = N0;
            int i5 = N0.g;
            f7c f7cVar = this.n;
            if (f7cVar != null && i5 > 0) {
                f7cVar.b = new tgb(k96.G(i5, "Groups", new Object[0]), 12.0f, gl.o());
                int min = Math.min(3, this.K.e.size());
                gc0 gc0Var = this.H;
                gc0Var.i(min);
                for (int i6 = 0; i6 < Math.min(3, this.K.e.size()); i6++) {
                    gc0Var.j(i6, i4, (TLObject) this.K.e.get(i6));
                }
                gc0Var.a(true, true);
            } else {
                b(this.c, na7.q1(i4).z1(this.c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        kk7.f(i).b(this, kk7.D0);
        kk7.f(i).b(this, kk7.Q3);
        this.H.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        kk7.f(i).n(this, kk7.D0);
        kk7.f(i).n(this, kk7.Q3);
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
        wjb wjbVar = this.b;
        if (bkb.g1(wjbVar)) {
            i = bkb.v0(bkb.Ea, wjbVar);
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
        if (wjbVar != null) {
            wjbVar.b(x, f4, measuredWidth, i4);
        } else {
            bkb.q(x, f4, measuredWidth, i4);
        }
        float f5 = 16.0f;
        canvas.drawRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), bkb.U0("paintChatActionBackground", wjbVar));
        if (wjbVar != null) {
            b1 = wjbVar.g();
        } else {
            b1 = bkb.b1();
        }
        if (b1) {
            canvas.drawRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), bkb.U0("paintChatActionBackgroundDarken", wjbVar));
        }
        float f6 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.L) / 2.0f);
        float z2 = oo1.z(getHeight(), this.L, 2.0f, 0.0f);
        float f7 = 14.0f;
        canvas.translate(0.0f, gl.L(14.0f));
        float L = z2 + gl.L(14.0f);
        tgb tgbVar = this.d;
        float f8 = 32.0f;
        tgbVar.p = this.M - gl.L(32.0f);
        tgbVar.c(width - (this.d.j() / 2.0f), this.d.h() / 2.0f, 1.0f, i2, canvas);
        canvas.translate(0.0f, this.d.h() + gl.L(3.0f));
        float h = L + this.d.h() + gl.L(3.0f);
        tgb tgbVar2 = this.e;
        tgbVar2.p = this.M - gl.L(32.0f);
        tgbVar2.c(width - (this.e.j() / 2.0f), this.e.h() / 2.0f, 0.7f, i2, canvas);
        canvas.translate(0.0f, this.e.h() + gl.L(11.0f));
        float h2 = this.e.h() + gl.L(11.0f) + h;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i5 >= arrayList.size()) {
                break;
            }
            if (i5 > 0) {
                canvas.translate(f6, gl.L(7.0f));
                h2 += gl.L(7.0f);
            }
            canvas.save();
            f7c f7cVar = (f7c) arrayList.get(i5);
            float f9 = f3;
            float L2 = (width - (this.M / f3)) + gl.L(f5) + this.s;
            float f10 = h2;
            tgb tgbVar3 = f7cVar.a;
            float f11 = f5;
            boolean z3 = f7cVar.c;
            float f12 = f7;
            RectF rectF2 = f7cVar.d;
            float f13 = f8;
            float f14 = L2 - tgbVar3.c;
            float L3 = (width - (this.M / f9)) + gl.L(f11) + this.s + gl.L(7.66f);
            tgbVar3.p = (L3 - f14) - gl.L(7.66f);
            int i6 = i5;
            tgbVar3.c(f14, tgbVar3.h() / f9, 0.7f, i2, canvas);
            float L4 = (width - (this.M / f9)) + gl.L(f11) + this.s + gl.L(7.66f);
            float L5 = (width - (this.M / f9)) + gl.L(f11) + this.s + gl.L(7.66f) + f7cVar.b.c;
            gc0 gc0Var = this.H;
            if (z3) {
                f = gc0Var.A + (drawable.getIntrinsicWidth() * 0.8f) + gl.L(5.0f);
            } else {
                f = 0.0f;
            }
            rectF2.set(L4, f10, L5 + f, f7cVar.b.h() + f10);
            if (this.n == f7cVar) {
                RectF rectF3 = this.E;
                rectF3.set(rectF2);
                rectF3.inset(-gl.L(4.0f), -gl.L(f9));
                float a2 = this.G.a(0.025f);
                f2 = 4.0f;
                canvas.scale(a2, a2, rectF3.centerX(), f7cVar.b.h() / f9);
                ff0 ff0Var = this.F;
                if (ff0Var != null) {
                    ff0Var.setBounds((int) rectF3.left, (int) (rectF3.top - f10), (int) rectF3.right, (int) (rectF3.bottom - f10));
                    ff0Var.draw(canvas);
                }
            } else {
                f2 = 4.0f;
            }
            tgb tgbVar4 = f7cVar.b;
            tgbVar4.p = (((this.M / f9) + width) - gl.L(8.0f)) - L3;
            tgbVar4.c(L3, f7cVar.b.h() / f9, 1.0f, i2, canvas);
            if (z3) {
                canvas.save();
                canvas.translate((width - (this.M / f9)) + gl.L(f11) + this.s + gl.L(7.66f) + f7cVar.b.c + gl.L(f2), gl.L(1.0f));
                gc0Var.g(canvas);
                canvas.translate(gc0Var.A + gl.L(1.0f), gl.L(13.0f) / f9);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / f9), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / f9));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, gl.L(f12));
            h2 = gl.L(f12) + f10;
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
            canvas.translate(0.0f, gl.L(12.0f));
            tgb tgbVar5 = this.f;
            if (tgbVar5.f > 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                tgbVar5.c(width - (tgbVar5.j() / f15), 0.0f, 0.7f, i2, canvas);
            } else {
                tgbVar5.p = this.M - gl.L(f16);
                tgbVar5.c(width - (this.f.j() / f15), this.f.h() / f15, 0.7f, i2, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), ls6.e(16.0f, (int) this.L, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        cq1 cq1Var;
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
        ff0 ff0Var = this.F;
        n41 n41Var = this.G;
        n41 n41Var2 = this.y;
        if (action == 0) {
            n41Var2.c(z2);
            n41Var.c(z);
            ff0Var.setState(z ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (n41Var2.i) {
                d S = LaunchActivity.S();
                if ((S instanceof mu1) && (cq1Var = ((mu1) S).p1) != null) {
                    cq1Var.e(true, false);
                }
            } else if (n41Var.i) {
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
            n41Var.c(false);
            n41Var2.c(false);
            ff0Var.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            n41Var.c(false);
            n41Var2.c(false);
            ff0Var.setState(new int[0]);
        }
        if (n41Var.i || n41Var2.i) {
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
