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
public class eba extends FrameLayout implements sp3, gk7, tjb {
    public int E;
    public cm F;
    public float G;
    public float H;
    public StaticLayout I;
    public int J;
    public cm K;
    public float L;
    public float M;
    public StaticLayout N;
    public k27 O;
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
    public final wf2 b;
    public final TextPaint b0;
    public boolean c;
    public final TextPaint c0;
    public boolean d;
    public final wjb d0;
    public boolean e;
    public boolean e0;
    public byte f;
    public float f0;
    public boolean g0;
    public int h;
    public float h0;
    public final TextPaint i0;
    public q8c j0;
    public float k0;
    public pi4 l0;
    public int n;
    public final int r;
    public StaticLayout s;
    public float w;
    public float x;
    public cm y;

    public eba(int i, wjb wjbVar, Context context) {
        super(context);
        float f;
        this.r = gl.L(9.0f);
        this.E = gl.L(29.0f);
        this.J = gl.L(29.0f);
        int i2 = y6c.t0;
        this.Q = i2;
        this.g0 = true;
        this.h0 = 0.0f;
        this.k0 = 1.0f;
        this.d0 = wjbVar;
        this.V = i;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, wjbVar);
        this.U = radialProgress2;
        radialProgress2.g(bkb.Ye, bkb.Ze, bkb.kd, bkb.ld);
        this.R = up3.q(i2).k();
        setWillNotDraw(false);
        wf2 wf2Var = new wf2(22, wjbVar, context);
        this.b = wf2Var;
        wf2Var.setVisibility(4);
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(3);
        boolean z = k96.a0;
        int i3 = (z ? 5 : 3) | 48;
        if (z) {
            f = 0.0f;
        } else {
            f = 38.1f;
        }
        addView(wf2Var, nme.d(24, 24.0f, i3, f, 32.1f, z ? 6.0f : 0.0f, 0.0f));
        if (i == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.b0 = textPaint;
            textPaint.setTextSize(gl.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new wo3(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.c0 = textPaint2;
        textPaint2.setTextSize(gl.L(13.0f));
        if (wjbVar != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.i0 = textPaint3;
            textPaint3.setTypeface(gl.o());
            textPaint3.setTextSize(gl.L(15.0f));
            textPaint3.setColor(bkb.v0(bkb.F6, wjbVar));
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
                ba4.G(i).X(this.O.F0(), this.O, 1, 0);
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
            ba4.G(i).X(this.O.F0(), this.O, 1, 0);
            this.S = (byte) 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (b == 4) {
            ba4.G(i).f(this.O.F0());
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
        wjb wjbVar = this.d0;
        if (this.V) {
            this.b0.setColor(bkb.v0(bkb.z6, wjbVar));
        }
        StaticLayout staticLayout2 = this.W;
        int i3 = this.r;
        int i4 = 0;
        float f7 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (k96.a0) {
                f6 = 24.0f;
            } else {
                f6 = gl.C;
            }
            int L = gl.L(f6);
            if (k96.a0) {
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
            int alpha = bkb.e3.getAlpha();
            float f9 = this.h0;
            if (f9 != 1.0f) {
                bkb.e3.setAlpha((int) (alpha * f9));
            }
            canvas.save();
            if (k96.a0) {
                f3 = 24.0f;
            } else {
                f3 = gl.C;
            }
            int L2 = gl.L(f3);
            if (k96.a0 && (staticLayout = this.W) != null) {
                int width = staticLayout.getWidth();
                if (k96.a0) {
                    f5 = 12.0f;
                } else {
                    f5 = 4.0f;
                }
                i4 = width + gl.L(f5);
            }
            float f10 = L2 + i4;
            if (k96.a0) {
                f4 = this.s.getWidth() - this.x;
            } else {
                f4 = 0.0f;
            }
            canvas.translate((f10 + f4) - this.w, i3);
            this.s.draw(canvas);
            gm.drawAnimatedEmojis(canvas, this.s, this.y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.h0 != 1.0f) {
                bkb.e3.setAlpha(alpha);
            }
        }
        if (this.N != null) {
            this.c0.setColor(bkb.v0(bkb.F6, wjbVar));
            canvas.save();
            if (k96.a0) {
                f = 24.0f;
            } else {
                f = gl.C;
            }
            float L3 = gl.L(f);
            if (k96.a0) {
                f2 = this.N.getWidth() - this.M;
            } else {
                f2 = 0.0f;
            }
            canvas.translate((L3 + f2) - this.L, this.J);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.I != null) {
            bkb.f3.setColor(bkb.v0(bkb.y6, wjbVar));
            int alpha2 = bkb.f3.getAlpha();
            float f11 = this.h0;
            if (f11 != 1.0f) {
                bkb.f3.setAlpha((int) (alpha2 * f11));
            }
            canvas.save();
            if (!k96.a0) {
                f7 = gl.C;
            }
            float L4 = gl.L(f7);
            if (k96.a0) {
                f8 = this.I.getWidth() - this.H;
            }
            canvas.translate((L4 + f8) - this.G, this.E);
            this.I.draw(canvas);
            gm.drawAnimatedEmojis(canvas, this.I, this.F, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.h0 != 1.0f) {
                bkb.f3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i = bkb.Zd;
        } else {
            i = bkb.Yd;
        }
        int v0 = bkb.v0(i, wjbVar);
        RadialProgress2 radialProgress2 = this.U;
        radialProgress2.d = v0;
        radialProgress2.H = this.h0;
        radialProgress2.draw(canvas);
        if (this.c) {
            if (k96.a0) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - gl.L(72.0f)) - getPaddingRight(), getHeight() - 1, bkb.U0("paintDivider", wjbVar));
            } else {
                canvas.drawLine(gl.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, bkb.U0("paintDivider", wjbVar));
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
        int measuredWidth = (getMeasuredWidth() - gl.L(12.0f)) - bkb.Y0.getIntrinsicWidth();
        int measuredHeight = (getMeasuredHeight() - bkb.Y0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f2 = this.f0;
        canvas.scale(f2, f2, (bkb.Y0.getIntrinsicWidth() / 2.0f) + measuredWidth, (bkb.Y0.getIntrinsicHeight() / 2.0f) + measuredHeight);
        Drawable drawable = bkb.Y0;
        drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, bkb.Y0.getIntrinsicHeight() + measuredHeight);
        bkb.Y0.draw(canvas);
        canvas.restore();
    }

    public boolean d(k27 k27Var) {
        q8c q8cVar = this.j0;
        if (q8cVar != null && ((Boolean) q8cVar.a(k27Var)).booleanValue()) {
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
        wf2 wf2Var = this.b;
        if (wf2Var.getVisibility() != 0) {
            wf2Var.setVisibility(0);
        }
        wf2Var.a(z, z2);
    }

    public final void f(k27 k27Var, boolean z) {
        TLRPC.PhotoSize photoSize;
        this.c = z;
        this.O = k27Var;
        TLRPC.Document F0 = k27Var.F0();
        if (F0 != null) {
            photoSize = ba4.w(F0.thumbs, 360, false, null, false);
        } else {
            photoSize = null;
        }
        boolean z2 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.U;
        if (!z2 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = k27Var.J1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.w.f0(bitmap);
            } else {
                String u0 = k27Var.u0(true);
                if (!TextUtils.isEmpty(u0)) {
                    radialProgress2.h(u0);
                } else {
                    radialProgress2.i(null, null, null);
                }
            }
        } else {
            radialProgress2.i(photoSize, F0, k27Var);
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
        k27 k27Var = this.O;
        if (!k27Var.y0 && !k27Var.z0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (gba.x0 && k27Var.I3() && ((int) k27.B0(this.O.k)) != 0) {
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
                i = bkb.Dc;
            } else {
                i = bkb.Ye;
            }
            radialProgress2.l(bkb.v0(i, this.d0));
            boolean D = MediaController.w().D(this.O);
            if (D && (!D || !MediaController.w().C())) {
                this.S = (byte) 1;
            } else {
                this.S = (byte) 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            if (this.f == 1) {
                up3.q(i2).v(this);
                this.T = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z, z2);
                return;
            }
            up3.q(i2).a(S0, this.O, this);
            if (!ba4.G(i2).S(S0)) {
                this.T = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z, z2);
                return;
            }
            this.T = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            Float s = fl5.z().s(S0);
            if (s != null) {
                radialProgress2.o(z2, s.floatValue());
            } else {
                radialProgress2.o(z2, 0.0f);
            }
        } else if (z3) {
            up3.q(i2).v(this);
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
            up3.q(i2).a(S0, this.O, this);
            if (!ba4.G(i2).S(S0)) {
                this.S = (byte) 2;
                radialProgress2.o(z2, 0.0f);
            } else {
                this.S = (byte) 4;
                Float s2 = fl5.z().s(S0);
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

    public k27 getMessage() {
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
        kk7.f(i).b(this, kk7.e2);
        kk7.f(i).b(this, kk7.f2);
        kk7.f(i).b(this, kk7.g2);
        this.y = gm.update(0, this, this.y, this.s);
        this.F = gm.update(0, this, this.F, this.I);
        this.K = gm.update(0, this, this.K, this.N);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.Q;
        up3.q(i).v(this);
        this.U.f();
        kk7.f(i).n(this, kk7.e2);
        kk7.f(i).n(this, kk7.f2);
        kk7.f(i).n(this, kk7.g2);
        gm.release(this, this.y);
        gm.release(this, this.F);
        gm.release(this, this.K);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String M0;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.O.I3()) {
            accessibilityNodeInfo.setText(k96.a0("AccDescrMusicInfo", null, 2131754831, this.O.w1(true), this.O.y1(true)));
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
                    M0 = k96.M0(2131754929, "AccActionPlay");
                } else {
                    M0 = k96.M0(2131754941, "AccActionCancelDownload");
                }
            } else {
                M0 = k96.M0(2131754938, "AccActionDownload");
            }
        } else {
            M0 = k96.M0(2131754930, "AccActionPause");
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, M0));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eba.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eba.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void setGlobalGradientView(pi4 pi4Var) {
        this.l0 = pi4Var;
    }

    public void setNeedPlayMessageListener(q8c q8cVar) {
        this.j0 = q8cVar;
    }

    @Override
    public final void updateColors() {
        k27 k27Var;
        int i;
        try {
            TextPaint textPaint = this.i0;
            wjb wjbVar = this.d0;
            if (textPaint != null) {
                textPaint.setColor(bkb.v0(bkb.F6, wjbVar));
            }
            RadialProgress2 radialProgress2 = this.U;
            if (radialProgress2 != null && this.f != 0 && (k27Var = this.O) != null) {
                if (k27Var.O3()) {
                    i = bkb.Dc;
                } else {
                    i = bkb.Ye;
                }
                radialProgress2.l(bkb.v0(i, wjbVar));
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void l(long j, long j2) {
    }

    public eba(Context context) {
        this(0, null, context);
    }
}
