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
public class vea extends FrameLayout implements jq3, fn7, snb {
    public int E;
    public dm F;
    public float G;
    public float H;
    public StaticLayout I;
    public int J;
    public dm K;
    public float L;
    public float M;
    public StaticLayout N;
    public r47 O;
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
    public final og2 b;
    public final TextPaint b0;
    public boolean c;
    public final TextPaint c0;
    public boolean d;
    public final vnb d0;
    public boolean e;
    public boolean e0;
    public byte f;
    public float f0;
    public boolean g0;
    public int h;
    public float h0;
    public final TextPaint i0;
    public qcc j0;
    public float k0;
    public tk4 l0;
    public int n;
    public final int r;
    public StaticLayout s;
    public float w;
    public float x;
    public dm y;

    public vea(int i, vnb vnbVar, Context context) {
        super(context);
        float f;
        this.r = hl.L(9.0f);
        this.E = hl.L(29.0f);
        this.J = hl.L(29.0f);
        int i2 = yac.t0;
        this.Q = i2;
        this.g0 = true;
        this.h0 = 0.0f;
        this.k0 = 1.0f;
        this.d0 = vnbVar;
        this.V = i;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, vnbVar);
        this.U = radialProgress2;
        radialProgress2.g(aob.Ze, aob.af, aob.ld, aob.md);
        this.R = lq3.q(i2).k();
        setWillNotDraw(false);
        og2 og2Var = new og2(22, vnbVar, context);
        this.b = og2Var;
        og2Var.setVisibility(4);
        og2Var.b(-1, aob.d6, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(3);
        boolean z = ob6.a0;
        int i3 = (z ? 5 : 3) | 48;
        if (z) {
            f = 0.0f;
        } else {
            f = 38.1f;
        }
        addView(og2Var, tre.d(24, 24.0f, i3, f, 32.1f, z ? 6.0f : 0.0f, 0.0f));
        if (i == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.b0 = textPaint;
            textPaint.setTextSize(hl.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new np3(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.c0 = textPaint2;
        textPaint2.setTextSize(hl.L(13.0f));
        if (vnbVar != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.i0 = textPaint3;
            textPaint3.setTypeface(hl.o());
            textPaint3.setTextSize(hl.L(15.0f));
            textPaint3.setColor(aob.v0(aob.G6, vnbVar));
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
    public final void B(boolean z) {
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
                xb4.G(i).X(this.O.F0(), this.O, 1, 0);
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
            if (MediaController.z().U(this.O, true)) {
                this.S = (byte) 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (b == 2) {
            radialProgress2.o(false, 0.0f);
            this.O.P = true;
            xb4.G(i).X(this.O.F0(), this.O, 1, 0);
            this.S = (byte) 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (b == 4) {
            xb4.G(i).f(this.O.F0());
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
        vnb vnbVar = this.d0;
        if (this.V) {
            this.b0.setColor(aob.v0(aob.A6, vnbVar));
        }
        StaticLayout staticLayout2 = this.W;
        int i3 = this.r;
        int i4 = 0;
        float f7 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (ob6.a0) {
                f6 = 24.0f;
            } else {
                f6 = hl.C;
            }
            int L = hl.L(f6);
            if (ob6.a0) {
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
            int alpha = aob.f3.getAlpha();
            float f9 = this.h0;
            if (f9 != 1.0f) {
                aob.f3.setAlpha((int) (alpha * f9));
            }
            canvas.save();
            if (ob6.a0) {
                f3 = 24.0f;
            } else {
                f3 = hl.C;
            }
            int L2 = hl.L(f3);
            if (ob6.a0 && (staticLayout = this.W) != null) {
                int width = staticLayout.getWidth();
                if (ob6.a0) {
                    f5 = 12.0f;
                } else {
                    f5 = 4.0f;
                }
                i4 = width + hl.L(f5);
            }
            float f10 = L2 + i4;
            if (ob6.a0) {
                f4 = this.s.getWidth() - this.x;
            } else {
                f4 = 0.0f;
            }
            canvas.translate((f10 + f4) - this.w, i3);
            this.s.draw(canvas);
            hm.drawAnimatedEmojis(canvas, this.s, this.y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.h0 != 1.0f) {
                aob.f3.setAlpha(alpha);
            }
        }
        if (this.N != null) {
            this.c0.setColor(aob.v0(aob.G6, vnbVar));
            canvas.save();
            if (ob6.a0) {
                f = 24.0f;
            } else {
                f = hl.C;
            }
            float L3 = hl.L(f);
            if (ob6.a0) {
                f2 = this.N.getWidth() - this.M;
            } else {
                f2 = 0.0f;
            }
            canvas.translate((L3 + f2) - this.L, this.J);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.I != null) {
            aob.g3.setColor(aob.v0(aob.z6, vnbVar));
            int alpha2 = aob.g3.getAlpha();
            float f11 = this.h0;
            if (f11 != 1.0f) {
                aob.g3.setAlpha((int) (alpha2 * f11));
            }
            canvas.save();
            if (!ob6.a0) {
                f7 = hl.C;
            }
            float L4 = hl.L(f7);
            if (ob6.a0) {
                f8 = this.I.getWidth() - this.H;
            }
            canvas.translate((L4 + f8) - this.G, this.E);
            this.I.draw(canvas);
            hm.drawAnimatedEmojis(canvas, this.I, this.F, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.h0 != 1.0f) {
                aob.g3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i = aob.ae;
        } else {
            i = aob.Zd;
        }
        int v0 = aob.v0(i, vnbVar);
        RadialProgress2 radialProgress2 = this.U;
        radialProgress2.d = v0;
        radialProgress2.H = this.h0;
        radialProgress2.draw(canvas);
        if (this.c) {
            if (ob6.a0) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - hl.L(72.0f)) - getPaddingRight(), getHeight() - 1, aob.U0("paintDivider", vnbVar));
            } else {
                canvas.drawLine(hl.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, aob.U0("paintDivider", vnbVar));
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
        int measuredWidth = (getMeasuredWidth() - hl.L(12.0f)) - aob.Y0.getIntrinsicWidth();
        int measuredHeight = (getMeasuredHeight() - aob.Y0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f2 = this.f0;
        canvas.scale(f2, f2, (aob.Y0.getIntrinsicWidth() / 2.0f) + measuredWidth, (aob.Y0.getIntrinsicHeight() / 2.0f) + measuredHeight);
        Drawable drawable = aob.Y0;
        drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, aob.Y0.getIntrinsicHeight() + measuredHeight);
        aob.Y0.draw(canvas);
        canvas.restore();
    }

    public boolean d(r47 r47Var) {
        qcc qccVar = this.j0;
        if (qccVar != null && ((Boolean) qccVar.a(r47Var)).booleanValue()) {
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
        og2 og2Var = this.b;
        if (og2Var.getVisibility() != 0) {
            og2Var.setVisibility(0);
        }
        og2Var.a(z, z2);
    }

    public final void f(r47 r47Var, boolean z) {
        TLRPC.PhotoSize photoSize;
        this.c = z;
        this.O = r47Var;
        TLRPC.Document F0 = r47Var.F0();
        if (F0 != null) {
            photoSize = xb4.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        boolean z2 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.U;
        if (!z2 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = r47Var.J1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.w.f0(bitmap);
            } else {
                String u0 = r47Var.u0(true);
                if (!TextUtils.isEmpty(u0)) {
                    radialProgress2.h(u0);
                } else {
                    radialProgress2.i(null, null, null);
                }
            }
        } else {
            radialProgress2.i(photoSize, F0, r47Var);
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
        r47 r47Var = this.O;
        if (!r47Var.y0 && !r47Var.z0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (xea.x0 && r47Var.I3() && ((int) r47.B0(this.O.k)) != 0) {
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
                i = aob.Ec;
            } else {
                i = aob.Ze;
            }
            radialProgress2.l(aob.v0(i, this.d0));
            boolean H = MediaController.z().H(this.O);
            if (H && (!H || !MediaController.z().G())) {
                this.S = (byte) 1;
            } else {
                this.S = (byte) 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            if (this.f == 1) {
                lq3.q(i2).v(this);
                this.T = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z, z2);
                return;
            }
            lq3.q(i2).a(S0, this.O, this);
            if (!xb4.G(i2).S(S0)) {
                this.T = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z, z2);
                return;
            }
            this.T = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            Float s = in5.z().s(S0);
            if (s != null) {
                radialProgress2.o(z2, s.floatValue());
            } else {
                radialProgress2.o(z2, 0.0f);
            }
        } else if (z3) {
            lq3.q(i2).v(this);
            boolean H2 = MediaController.z().H(this.O);
            if (H2 && (!H2 || !MediaController.z().G())) {
                this.S = (byte) 1;
            } else {
                this.S = (byte) 0;
            }
            radialProgress2.o(z2, 1.0f);
            radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            invalidate();
        } else {
            lq3.q(i2).a(S0, this.O, this);
            if (!xb4.G(i2).S(S0)) {
                this.S = (byte) 2;
                radialProgress2.o(z2, 0.0f);
            } else {
                this.S = (byte) 4;
                Float s2 = in5.z().s(S0);
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

    public r47 getMessage() {
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
        jn7.f(i).b(this, jn7.f2);
        jn7.f(i).b(this, jn7.g2);
        jn7.f(i).b(this, jn7.h2);
        this.y = hm.update(0, this, this.y, this.s);
        this.F = hm.update(0, this, this.F, this.I);
        this.K = hm.update(0, this, this.K, this.N);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.Q;
        lq3.q(i).v(this);
        this.U.f();
        jn7.f(i).n(this, jn7.f2);
        jn7.f(i).n(this, jn7.g2);
        jn7.f(i).n(this, jn7.h2);
        hm.release(this, this.y);
        hm.release(this, this.F);
        hm.release(this, this.K);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String M0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.O.I3()) {
            accessibilityNodeInfo.setText(ob6.a0("AccDescrMusicInfo", null, 2131754827, this.O.w1(true), this.O.y1(true)));
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
                    M0 = ob6.M0(2131754925, "AccActionPlay");
                } else {
                    M0 = ob6.M0(2131754937, "AccActionCancelDownload");
                }
            } else {
                M0 = ob6.M0(2131754934, "AccActionDownload");
            }
        } else {
            M0 = ob6.M0(2131754926, "AccActionPause");
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, M0));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vea.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vea.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void setNeedPlayMessageListener(qcc qccVar) {
        this.j0 = qccVar;
    }

    @Override
    public final void updateColors() {
        r47 r47Var;
        int i;
        try {
            TextPaint textPaint = this.i0;
            vnb vnbVar = this.d0;
            if (textPaint != null) {
                textPaint.setColor(aob.v0(aob.G6, vnbVar));
            }
            RadialProgress2 radialProgress2 = this.U;
            if (radialProgress2 != null && this.f != 0 && (r47Var = this.O) != null) {
                if (r47Var.O3()) {
                    i = aob.Ec;
                } else {
                    i = aob.Ze;
                }
                radialProgress2.l(aob.v0(i, vnbVar));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void l(long j, long j2) {
    }

    public vea(Context context) {
        this(0, null, context);
    }
}
