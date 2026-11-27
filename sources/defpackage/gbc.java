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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class gbc extends View implements fn7 {
    public static final int Q = 0;
    public final RectF E;
    public final hf0 F;
    public final v41 G;
    public final ic0 H;
    public final Drawable I;
    public int J;
    public yb7 K;
    public float L;
    public float M;
    public float N;
    public int O;
    public boolean P;
    public final int a;
    public final vnb b;
    public long c;
    public pkb d;
    public pkb e;
    public pkb f;
    public final ArrayList h;
    public fbc n;
    public float r;
    public float s;
    public float w;
    public final RectF x;
    public final v41 y;

    public gbc(int i, vnb vnbVar, Context context) {
        super(context);
        this.h = new ArrayList();
        this.x = new RectF();
        this.y = new v41(this);
        this.E = new RectF();
        this.G = new v41(this);
        ic0 ic0Var = new ic0(this, false);
        this.H = ic0Var;
        this.J = -1;
        this.a = i;
        this.b = vnbVar;
        hf0 Y = aob.Y(822083583, 8, 8);
        this.F = Y;
        Y.setCallback(this);
        ic0Var.p = hl.L(50.0f);
        ic0Var.o = hl.L(13.0f);
        ic0Var.x = false;
        ic0Var.s = hl.L(13.0f);
        ic0Var.h(hl.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(2131232246).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final fbc a(CharSequence charSequence, String str, boolean z) {
        int i;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.L += hl.L(7.0f);
        }
        fbc fbcVar = new fbc(charSequence, str, z);
        arrayList.add(fbcVar);
        this.L += hl.L(14.0f);
        this.s = Math.max(this.s, fbcVar.a.c);
        float f = this.w;
        float f2 = fbcVar.b.c;
        if (z) {
            i = hl.L(38.0f);
        } else {
            i = 0;
        }
        this.w = Math.max(f, f2 + i);
        return fbcVar;
    }

    public final void b(long j, TLRPC.PeerSettings peerSettings) {
        int i;
        TLRPC.User X1;
        TLRPC.UserFull Y1;
        float f;
        TL_bots.BotVerification botVerification;
        this.c = j;
        this.M = 0.0f;
        this.L = 0.0f;
        this.s = 0.0f;
        this.w = 0.0f;
        this.h.clear();
        int i2 = (int) (hl.q.x * 0.95f);
        this.L += hl.L(14.0f);
        pkb pkbVar = new pkb(wf3.k(yac.t0, j), 14.0f, hl.o());
        this.d = pkbVar;
        this.L = pkbVar.h() + hl.L(3.0f) + this.L;
        int i3 = this.a;
        if (lv2.r(i3).x(j)) {
            i = 2131751766;
        } else {
            i = 2131751765;
        }
        pkb pkbVar2 = new pkb(ob6.M0(i, null), 14.0f, null);
        this.e = pkbVar2;
        this.L = pkbVar2.h() + hl.L(11.0f) + this.L;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String M0 = ob6.M0(2131751762, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String E0 = ob6.E0(str);
            if (!TextUtils.isEmpty(E0)) {
                spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            }
            String i0 = ob6.i0(2131751761, str);
            if (!TextUtils.isEmpty(i0)) {
                spannableStringBuilder.append((CharSequence) i0);
            } else {
                spannableStringBuilder.append((CharSequence) str);
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(hl.L(12.0f));
            a(pv3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), true, null, 0), M0, false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String M02 = ob6.M0(2131751760, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = ob6.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, M02, false);
        }
        int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i4 < 0) {
            X1 = null;
            Y1 = null;
        } else {
            X1 = uc7.s1(i3).X1(Long.valueOf(j));
            Y1 = uc7.s1(i3).Y1(j);
        }
        if (Y1 == null && i4 > 0) {
            f = 14.0f;
            uc7.s1(i3).o3(0, uc7.s1(i3).X1(Long.valueOf(j)), true);
        } else {
            f = 14.0f;
        }
        if (Y1 != null) {
            yb7 P0 = uc7.s1(i3).P0(j);
            this.K = P0;
            int max = Math.max(Y1.common_chats_count, P0.g);
            if (max > 0) {
                this.n = a(ob6.G(max, "Groups", new Object[0]), ob6.M0(2131751767, null), true);
                int min = Math.min(3, this.K.e.size());
                ic0 ic0Var = this.H;
                ic0Var.i(min);
                for (int i5 = 0; i5 < Math.min(3, this.K.e.size()); i5++) {
                    ic0Var.j(i5, i3, (TLObject) this.K.e.get(i5));
                }
                ic0Var.a(true, true);
            } else {
                this.K = null;
                this.n = null;
            }
        } else {
            this.K = null;
            this.n = null;
        }
        this.r = this.s + hl.L(7.66f) + this.w;
        if (X1 != null && !X1.verified && !lbc.C(X1.id)) {
            if (X1.bot_verification_icon != 0) {
                if (Y1 != null && (botVerification = Y1.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                    this.f = new pkb(spannableStringBuilder2, 12.0f, null);
                    spannableStringBuilder2.setSpan(new hm(botVerification.icon, this.f.a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder2.append(r47.h0(botVerification.description, false));
                    pkb pkbVar3 = new pkb(spannableStringBuilder2, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    pkbVar3.a();
                    pkbVar3.l(5);
                    Point point = hl.q;
                    pkbVar3.o(Math.min(point.x, point.y) * 0.5f);
                    pkbVar3.q(this);
                    this.f = pkbVar3;
                    this.L = this.f.h() + hl.L(12.0f) + hl.L(15.33f) + this.L;
                } else {
                    this.f = null;
                    this.L += hl.L(f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
                wm2 wm2Var = new wm2(2131231128, 0);
                wm2Var.I = 0.55f;
                wm2Var.J = -0.55f;
                wm2Var.r = hl.L(1.0f);
                wm2Var.s = hl.L(-1.0f);
                spannableStringBuilder3.setSpan(wm2Var, 0, 1, 33);
                spannableStringBuilder3.append((CharSequence) ob6.M0(2131751763, null));
                this.f = new pkb(spannableStringBuilder3, 12.0f, null);
                this.L = this.f.h() + hl.L(12.0f) + hl.L(15.33f) + this.L;
            }
        } else {
            this.f = null;
            this.L += hl.L(f);
        }
        float max2 = Math.max(this.M, this.d.j());
        this.M = max2;
        float max3 = Math.max(max2, this.e.j());
        this.M = max3;
        float max4 = Math.max(max3, this.r);
        this.M = max4;
        this.M = Math.min(max4 + hl.L(32.0f), i2);
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
        int i3 = jn7.E0;
        int i4 = this.a;
        if (i == i3) {
            long longValue = ((Long) objArr[0]).longValue();
            long j = this.c;
            if (longValue == j) {
                b(j, uc7.s1(i4).B1(this.c));
            }
        } else if (i == jn7.R3 && ((Long) objArr[0]).longValue() == this.c) {
            yb7 P0 = uc7.s1(i4).P0(this.c);
            this.K = P0;
            int i5 = P0.g;
            fbc fbcVar = this.n;
            if (fbcVar != null && i5 > 0) {
                fbcVar.b = new pkb(ob6.G(i5, "Groups", new Object[0]), 12.0f, hl.o());
                int min = Math.min(3, this.K.e.size());
                ic0 ic0Var = this.H;
                ic0Var.i(min);
                for (int i6 = 0; i6 < Math.min(3, this.K.e.size()); i6++) {
                    ic0Var.j(i6, i4, (TLObject) this.K.e.get(i6));
                }
                ic0Var.a(true, true);
            } else {
                b(this.c, uc7.s1(i4).B1(this.c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        jn7.f(i).b(this, jn7.E0);
        jn7.f(i).b(this, jn7.R3);
        this.H.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        jn7.f(i).n(this, jn7.E0);
        jn7.f(i).n(this, jn7.R3);
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
        vnb vnbVar = this.b;
        if (aob.g1(vnbVar)) {
            i = aob.v0(aob.Fa, vnbVar);
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
        if (vnbVar != null) {
            vnbVar.b(x, f4, measuredWidth, i4);
        } else {
            aob.q(x, f4, measuredWidth, i4);
        }
        float f5 = 16.0f;
        canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), aob.U0("paintChatActionBackground", vnbVar));
        if (vnbVar != null) {
            b1 = vnbVar.g();
        } else {
            b1 = aob.b1();
        }
        if (b1) {
            canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), aob.U0("paintChatActionBackgroundDarken", vnbVar));
        }
        float f6 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.L) / 2.0f);
        float z2 = bp1.z(getHeight(), this.L, 2.0f, 0.0f);
        float f7 = 14.0f;
        canvas.translate(0.0f, hl.L(14.0f));
        float L = z2 + hl.L(14.0f);
        pkb pkbVar = this.d;
        float f8 = 32.0f;
        pkbVar.p = this.M - hl.L(32.0f);
        pkbVar.c(width - (this.d.j() / 2.0f), this.d.h() / 2.0f, 1.0f, i2, canvas);
        canvas.translate(0.0f, this.d.h() + hl.L(3.0f));
        float h = L + this.d.h() + hl.L(3.0f);
        pkb pkbVar2 = this.e;
        pkbVar2.p = this.M - hl.L(32.0f);
        pkbVar2.c(width - (this.e.j() / 2.0f), this.e.h() / 2.0f, 0.7f, i2, canvas);
        canvas.translate(0.0f, this.e.h() + hl.L(11.0f));
        float h2 = this.e.h() + hl.L(11.0f) + h;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i5 >= arrayList.size()) {
                break;
            }
            if (i5 > 0) {
                canvas.translate(f6, hl.L(7.0f));
                h2 += hl.L(7.0f);
            }
            canvas.save();
            fbc fbcVar = (fbc) arrayList.get(i5);
            float f9 = f3;
            float L2 = (width - (this.M / f3)) + hl.L(f5) + this.s;
            float f10 = h2;
            pkb pkbVar3 = fbcVar.a;
            float f11 = f5;
            boolean z3 = fbcVar.c;
            float f12 = f7;
            RectF rectF2 = fbcVar.d;
            float f13 = f8;
            float f14 = L2 - pkbVar3.c;
            float L3 = (width - (this.M / f9)) + hl.L(f11) + this.s + hl.L(7.66f);
            pkbVar3.p = (L3 - f14) - hl.L(7.66f);
            int i6 = i5;
            pkbVar3.c(f14, pkbVar3.h() / f9, 0.7f, i2, canvas);
            float L4 = (width - (this.M / f9)) + hl.L(f11) + this.s + hl.L(7.66f);
            float L5 = (width - (this.M / f9)) + hl.L(f11) + this.s + hl.L(7.66f) + fbcVar.b.c;
            ic0 ic0Var = this.H;
            if (z3) {
                f = ic0Var.A + (drawable.getIntrinsicWidth() * 0.8f) + hl.L(5.0f);
            } else {
                f = 0.0f;
            }
            rectF2.set(L4, f10, L5 + f, fbcVar.b.h() + f10);
            if (this.n == fbcVar) {
                RectF rectF3 = this.E;
                rectF3.set(rectF2);
                rectF3.inset(-hl.L(4.0f), -hl.L(f9));
                float a2 = this.G.a(0.025f);
                f2 = 4.0f;
                canvas.scale(a2, a2, rectF3.centerX(), fbcVar.b.h() / f9);
                hf0 hf0Var = this.F;
                if (hf0Var != null) {
                    hf0Var.setBounds((int) rectF3.left, (int) (rectF3.top - f10), (int) rectF3.right, (int) (rectF3.bottom - f10));
                    hf0Var.draw(canvas);
                }
            } else {
                f2 = 4.0f;
            }
            pkb pkbVar4 = fbcVar.b;
            pkbVar4.p = (((this.M / f9) + width) - hl.L(8.0f)) - L3;
            pkbVar4.c(L3, fbcVar.b.h() / f9, 1.0f, i2, canvas);
            if (z3) {
                canvas.save();
                canvas.translate((width - (this.M / f9)) + hl.L(f11) + this.s + hl.L(7.66f) + fbcVar.b.c + hl.L(f2), hl.L(1.0f));
                ic0Var.g(canvas);
                canvas.translate(ic0Var.A + hl.L(1.0f), hl.L(13.0f) / f9);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / f9), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / f9));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, hl.L(f12));
            h2 = hl.L(f12) + f10;
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
            canvas.translate(0.0f, hl.L(12.0f));
            pkb pkbVar5 = this.f;
            if (pkbVar5.f > 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                pkbVar5.c(width - (pkbVar5.j() / f15), 0.0f, 0.7f, i2, canvas);
            } else {
                pkbVar5.p = this.M - hl.L(f16);
                pkbVar5.c(width - (this.f.j() / f15), this.f.h() / f15, 0.7f, i2, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), qu6.e(16.0f, (int) this.L, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        qq1 qq1Var;
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
        hf0 hf0Var = this.F;
        v41 v41Var = this.G;
        v41 v41Var2 = this.y;
        if (action == 0) {
            v41Var2.c(z2);
            v41Var.c(z);
            hf0Var.setState(z ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (v41Var2.i) {
                e S = LaunchActivity.S();
                if ((S instanceof zu1) && (qq1Var = ((zu1) S).p1) != null) {
                    qq1Var.e(true, false);
                }
            } else if (v41Var.i) {
                e S2 = LaunchActivity.S();
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
            v41Var.c(false);
            v41Var2.c(false);
            hf0Var.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            v41Var.c(false);
            v41Var2.c(false);
            hf0Var.setState(new int[0]);
        }
        if (v41Var.i || v41Var2.i) {
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
