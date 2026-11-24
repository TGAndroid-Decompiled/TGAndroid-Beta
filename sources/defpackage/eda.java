package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public class eda extends FrameLayout implements cr3, jm7, vlb {
    public int E;
    public cn F;
    public float G;
    public float H;
    public StaticLayout I;
    public int J;
    public cn K;
    public float L;
    public float M;
    public StaticLayout N;
    public k47 O;
    public boolean P;
    public final int Q;
    public final int R;
    public byte S;
    public int T;
    public final RadialProgress2 U;
    public final boolean V;
    public StaticLayout W;
    public final SpannableStringBuilder a;
    public int a0;
    public final jh2 b;
    public final TextPaint b0;
    public boolean c;
    public final TextPaint c0;
    public boolean d;
    public final ylb d0;
    public boolean e;
    public boolean e0;
    public byte f;
    public float f0;
    public boolean g0;
    public int h;
    public float h0;
    public final TextPaint i0;
    public rac j0;
    public float k0;
    public tk4 l0;
    public int n;
    public final int r;
    public StaticLayout s;
    public float w;
    public float x;
    public cn y;

    public eda(int i, ylb ylbVar, Context context) {
        super(context);
        float f;
        this.r = gm.L(9.0f);
        this.E = gm.L(29.0f);
        this.J = gm.L(29.0f);
        int i2 = z8c.t0;
        this.Q = i2;
        this.g0 = true;
        this.h0 = 0.0f;
        this.k0 = 1.0f;
        this.d0 = ylbVar;
        this.V = i;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, ylbVar);
        this.U = radialProgress2;
        radialProgress2.g(cmb.Ye, cmb.Ze, cmb.kd, cmb.ld);
        this.R = er3.q(i2).k();
        setWillNotDraw(false);
        jh2 jh2Var = new jh2(22, ylbVar, context);
        this.b = jh2Var;
        jh2Var.setVisibility(4);
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(3);
        boolean z = jb6.a0;
        int i3 = (z ? 5 : 3) | 48;
        if (z) {
            f = 0.0f;
        } else {
            f = 38.1f;
        }
        addView(jh2Var, qoe.d(24, 24.0f, i3, f, 32.1f, z ? 6.0f : 0.0f, 0.0f));
        if (i == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.b0 = textPaint;
            textPaint.setTextSize(gm.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new gq3(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.c0 = textPaint2;
        textPaint2.setTextSize(gm.L(13.0f));
        if (ylbVar != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.i0 = textPaint3;
            textPaint3.setTypeface(gm.o());
            textPaint3.setTextSize(gm.L(15.0f));
            textPaint3.setColor(cmb.v0(cmb.F6, ylbVar));
        }
    }

    private int getIconForCurrentState() {
        byte b = this.S;
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        if (b == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i = this.T;
        if (i < 0) {
            return 4;
        }
        if (i == 0) {
            return 2;
        }
        return 3;
    }

    @Override
    public final void A(boolean z) {
        g(true, z);
    }

    @Override
    public final void N(String str) {
        this.U.o(true, 1.0f);
        g(false, true);
    }

    public void a() {
        byte b = this.S;
        int i = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (b == 0) {
            if (this.T == 0) {
                this.O.P = true;
                bc4.G(i).X(this.O.F0(), this.O, 1, 0);
            }
            if (d(this.O)) {
                if (this.f == 2 && this.T != 1) {
                    this.T = 1;
                    radialProgress2.o(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.S = (byte) 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (b == 1) {
            if (MediaController.w().Q(this.O, true)) {
                this.S = (byte) 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (b == 2) {
            radialProgress2.o(false, 0.0f);
            this.O.P = true;
            bc4.G(i).X(this.O.F0(), this.O, 1, 0);
            this.S = (byte) 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (b == 4) {
            bc4.G(i).f(this.O.F0());
            this.S = (byte) 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        StaticLayout staticLayout;
        float f5;
        float f6;
        int i2;
        ylb ylbVar = this.d0;
        if (this.V) {
            this.b0.setColor(cmb.v0(cmb.z6, ylbVar));
        }
        StaticLayout staticLayout2 = this.W;
        int i3 = this.r;
        int i4 = 0;
        float f7 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (jb6.a0) {
                f6 = 24.0f;
            } else {
                f6 = gm.C;
            }
            int L = gm.L(f6);
            if (jb6.a0) {
                i2 = 0;
            } else {
                i2 = this.a0;
            }
            canvas.translate(L + i2, i3);
            this.W.draw(canvas);
            canvas.restore();
        }
        float f8 = 0.0f;
        if (this.s != null) {
            int alpha = cmb.e3.getAlpha();
            float f9 = this.h0;
            if (f9 != 1.0f) {
                cmb.e3.setAlpha((int) (alpha * f9));
            }
            canvas.save();
            if (jb6.a0) {
                f3 = 24.0f;
            } else {
                f3 = gm.C;
            }
            int L2 = gm.L(f3);
            if (jb6.a0 && (staticLayout = this.W) != null) {
                int width = staticLayout.getWidth();
                if (jb6.a0) {
                    f5 = 12.0f;
                } else {
                    f5 = 4.0f;
                }
                i4 = width + gm.L(f5);
            }
            float f10 = L2 + i4;
            if (jb6.a0) {
                f4 = this.s.getWidth() - this.x;
            } else {
                f4 = 0.0f;
            }
            canvas.translate((f10 + f4) - this.w, i3);
            this.s.draw(canvas);
            gn.drawAnimatedEmojis(canvas, this.s, this.y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.h0 != 1.0f) {
                cmb.e3.setAlpha(alpha);
            }
        }
        if (this.N != null) {
            this.c0.setColor(cmb.v0(cmb.F6, ylbVar));
            canvas.save();
            if (jb6.a0) {
                f = 24.0f;
            } else {
                f = gm.C;
            }
            float L3 = gm.L(f);
            if (jb6.a0) {
                f2 = this.N.getWidth() - this.M;
            } else {
                f2 = 0.0f;
            }
            canvas.translate((L3 + f2) - this.L, this.J);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.I != null) {
            cmb.f3.setColor(cmb.v0(cmb.y6, ylbVar));
            int alpha2 = cmb.f3.getAlpha();
            float f11 = this.h0;
            if (f11 != 1.0f) {
                cmb.f3.setAlpha((int) (alpha2 * f11));
            }
            canvas.save();
            if (!jb6.a0) {
                f7 = gm.C;
            }
            float L4 = gm.L(f7);
            if (jb6.a0) {
                f8 = this.I.getWidth() - this.H;
            }
            canvas.translate((L4 + f8) - this.G, this.E);
            this.I.draw(canvas);
            gn.drawAnimatedEmojis(canvas, this.I, this.F, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.h0 != 1.0f) {
                cmb.f3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i = cmb.Zd;
        } else {
            i = cmb.Yd;
        }
        int v0 = cmb.v0(i, ylbVar);
        RadialProgress2 radialProgress2 = this.U;
        radialProgress2.d = v0;
        radialProgress2.H = this.h0;
        radialProgress2.draw(canvas);
        if (this.c) {
            if (jb6.a0) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - gm.L(72.0f)) - getPaddingRight(), getHeight() - 1, cmb.U0("paintDivider", ylbVar));
            } else {
                canvas.drawLine(gm.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, cmb.U0("paintDivider", ylbVar));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z = this.e0;
        float f = this.f0;
        if (!z) {
            if (f != 0.0f) {
                if (f != 0.0f) {
                    this.f0 = f - 0.10666667f;
                    invalidate();
                }
            } else {
                return;
            }
        } else if (f != 1.0f) {
            this.f0 = f + 0.10666667f;
            invalidate();
        }
        this.f0 = Utilities.i(this.f0, 1.0f, 0.0f);
        int measuredWidth = (getMeasuredWidth() - gm.L(12.0f)) - cmb.Y0.getIntrinsicWidth();
        int measuredHeight = (getMeasuredHeight() - cmb.Y0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f2 = this.f0;
        canvas.scale(f2, f2, (cmb.Y0.getIntrinsicWidth() / 2.0f) + measuredWidth, (cmb.Y0.getIntrinsicHeight() / 2.0f) + measuredHeight);
        Drawable drawable = cmb.Y0;
        drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, cmb.Y0.getIntrinsicHeight() + measuredHeight);
        cmb.Y0.draw(canvas);
        canvas.restore();
    }

    public boolean d(k47 k47Var) {
        rac racVar = this.j0;
        if (racVar != null && ((Boolean) racVar.a(k47Var)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        g(false, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z = this.g0;
        if (z) {
            float f = this.h0;
            if (f != 1.0f) {
                this.h0 = f + 0.10666667f;
                invalidate();
                this.h0 = Utilities.i(this.h0, 1.0f, 0.0f);
                if (this.k0 == 1.0f && this.l0 != null) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.k0) * 255.0f), 31);
                    this.l0.setViewType(4);
                    this.l0.updateColors();
                    this.l0.f();
                    this.l0.draw(canvas);
                    canvas.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.k0 * 255.0f), 31);
                    b(canvas);
                    super.dispatchDraw(canvas);
                    c(canvas);
                    canvas.restore();
                    return;
                }
                b(canvas);
                c(canvas);
                super.dispatchDraw(canvas);
            }
        }
        if (!z) {
            float f2 = this.h0;
            if (f2 != 0.0f) {
                this.h0 = f2 - 0.10666667f;
                invalidate();
            }
        }
        this.h0 = Utilities.i(this.h0, 1.0f, 0.0f);
        if (this.k0 == 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z, boolean z2) {
        jh2 jh2Var = this.b;
        if (jh2Var.getVisibility() != 0) {
            jh2Var.setVisibility(0);
        }
        jh2Var.a(z, z2);
    }

    public final void f(k47 k47Var, boolean z) {
        TLRPC.PhotoSize photoSize;
        this.c = z;
        this.O = k47Var;
        TLRPC.Document F0 = k47Var.F0();
        if (F0 != null) {
            photoSize = bc4.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        boolean z2 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.U;
        if (!z2 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = k47Var.J1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.w.f0(bitmap);
            } else {
                String u0 = k47Var.u0(true);
                if (!TextUtils.isEmpty(u0)) {
                    radialProgress2.h(u0);
                } else {
                    radialProgress2.i(null, null, null);
                }
            }
        } else {
            radialProgress2.i(photoSize, F0, k47Var);
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z, boolean z2) {
        boolean z3;
        byte b;
        int i;
        String S0 = this.O.S0();
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        k47 k47Var = this.O;
        if (!k47Var.y0 && !k47Var.z0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (gda.x0 && k47Var.I3() && ((int) k47.B0(this.O.k)) != 0) {
            if (z3) {
                b = 1;
            } else {
                b = 2;
            }
            this.f = b;
            z3 = true;
        } else {
            this.f = (byte) 0;
            this.T = -1;
            b = 0;
        }
        int i2 = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (b != 0) {
            if (this.O.O3()) {
                i = cmb.Dc;
            } else {
                i = cmb.Ye;
            }
            radialProgress2.l(cmb.v0(i, this.d0));
            boolean D = MediaController.w().D(this.O);
            if (D && (!D || !MediaController.w().C())) {
                this.S = (byte) 1;
            } else {
                this.S = (byte) 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            if (this.f == 1) {
                er3.q(i2).v(this);
                this.T = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z, z2);
                return;
            }
            er3.q(i2).a(S0, this.O, this);
            if (!bc4.G(i2).S(S0)) {
                this.T = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z, z2);
                return;
            }
            this.T = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            Float s = fn5.z().s(S0);
            if (s != null) {
                radialProgress2.o(z2, s.floatValue());
            } else {
                radialProgress2.o(z2, 0.0f);
            }
        } else if (z3) {
            er3.q(i2).v(this);
            boolean D2 = MediaController.w().D(this.O);
            if (D2 && (!D2 || !MediaController.w().C())) {
                this.S = (byte) 1;
            } else {
                this.S = (byte) 0;
            }
            radialProgress2.o(z2, 1.0f);
            radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            invalidate();
        } else {
            er3.q(i2).a(S0, this.O, this);
            if (!bc4.G(i2).S(S0)) {
                this.S = (byte) 2;
                radialProgress2.o(z2, 0.0f);
            } else {
                this.S = (byte) 4;
                Float s2 = fn5.z().s(S0);
                if (s2 != null) {
                    radialProgress2.o(z2, s2.floatValue());
                } else {
                    radialProgress2.o(z2, 0.0f);
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            invalidate();
        }
    }

    public k47 getMessage() {
        return this.O;
    }

    @Override
    public int getObserverTag() {
        return this.R;
    }

    @Override
    public final void i(long j, long j2) {
        this.U.o(true, Math.min(1.0f, ((float) j) / ((float) j2)));
        if (this.f != 0) {
            if (this.T != 1) {
                g(false, true);
            }
        } else if (this.S != 4) {
            g(false, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.e();
        g(false, false);
        int i = this.Q;
        nm7.f(i).b(this, nm7.f2);
        nm7.f(i).b(this, nm7.g2);
        nm7.f(i).b(this, nm7.h2);
        this.y = gn.update(0, this, this.y, this.s);
        this.F = gn.update(0, this, this.F, this.I);
        this.K = gn.update(0, this, this.K, this.N);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.Q;
        er3.q(i).v(this);
        this.U.f();
        nm7.f(i).n(this, nm7.f2);
        nm7.f(i).n(this, nm7.g2);
        nm7.f(i).n(this, nm7.h2);
        gn.release(this, this.y);
        gn.release(this, this.F);
        gn.release(this, this.K);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String M0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.O.I3()) {
            accessibilityNodeInfo.setText(jb6.a0("AccDescrMusicInfo", null, 2131754831, this.O.w1(true), this.O.y1(true)));
        } else if (this.s != null && this.I != null) {
            accessibilityNodeInfo.setText(((Object) this.s.getText()) + ", " + ((Object) this.I.getText()));
        }
        if (this.b.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    M0 = jb6.M0(2131754929, "AccActionPlay");
                } else {
                    M0 = jb6.M0(2131754941, "AccActionCancelDownload");
                }
            } else {
                M0 = jb6.M0(2131754938, "AccActionDownload");
            }
        } else {
            M0 = jb6.M0(2131754930, "AccActionPause");
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, M0));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eda.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eda.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 16) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setCheckForButtonPress(boolean z) {
        this.P = z;
    }

    public void setEnterAnimationAlpha(float f) {
        if (this.k0 != f) {
            this.k0 = f;
            invalidate();
        }
    }

    public void setGlobalGradientView(tk4 tk4Var) {
        this.l0 = tk4Var;
    }

    public void setNeedPlayMessageListener(rac racVar) {
        this.j0 = racVar;
    }

    @Override
    public final void updateColors() {
        k47 k47Var;
        int i;
        try {
            TextPaint textPaint = this.i0;
            ylb ylbVar = this.d0;
            if (textPaint != null) {
                textPaint.setColor(cmb.v0(cmb.F6, ylbVar));
            }
            RadialProgress2 radialProgress2 = this.U;
            if (radialProgress2 != null && this.f != 0 && (k47Var = this.O) != null) {
                if (k47Var.O3()) {
                    i = cmb.Dc;
                } else {
                    i = cmb.Ye;
                }
                radialProgress2.l(cmb.v0(i, ylbVar));
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void l(long j, long j2) {
    }

    public eda(Context context) {
        this(0, null, context);
    }
}
