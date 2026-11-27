package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.webrtc.RendererCommon;
public final class ka5 extends FrameLayout implements qb5 {
    public ds6 A0;
    public int B0;
    public int C0;
    public int D0;
    public final Paint E;
    public ValueAnimator E0;
    public boolean F;
    public int F0;
    public final vc2 G;
    public int G0;
    public final j95 H;
    public ValueAnimator H0;
    public boolean I;
    public boolean I0;
    public float J;
    public final FrameLayout K;
    public final int L;
    public final ema M;
    public int N;
    public final fx0 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final e29 U;
    public final ImageView V;
    public boolean W;
    public final ga5 a;
    public float a0;
    public boolean b;
    public final ja5 b0;
    public q95 c;
    public ValueAnimator c0;
    public o95 d;
    public boolean d0;
    public q95 e;
    public float e0;
    public boolean f;
    public float f0;
    public float g0;
    public boolean h;
    public float h0;
    public float i0;
    public boolean j0;
    public float k0;
    public final ImageReceiver l0;
    public final ArrayList m0;
    public boolean n;
    public rb5 n0;
    public boolean o0;
    public float p0;
    public Bitmap q0;
    public boolean r;
    public Paint r0;
    public boolean s;
    public boolean s0;
    public float t0;
    public final c43 u0;
    public final Drawable v0;
    public boolean w;
    public float w0;
    public wc2 x;
    public ImageView x0;
    public final mb5 y;
    public boolean y0;
    public final Rect z0;

    public ka5(mb5 mb5Var, vc2 vc2Var, j95 j95Var) {
        super(mb5Var.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.a0 = 1.0f;
        this.l0 = new ImageReceiver(null);
        this.m0 = new ArrayList();
        this.z0 = new Rect();
        this.G = vc2Var;
        int i = j95Var.a;
        this.L = i;
        c43 c43Var = new c43(mb5Var.getContext(), 2131230926, -1);
        this.u0 = c43Var;
        c43Var.a(true, false);
        c43Var.i = -hl.L(4.0f);
        c43Var.j = hl.L(6.0f);
        c43Var.k = hl.L(6.0f);
        c43Var.invalidateSelf();
        float N = hl.N(3.4f);
        c43Var.c.setStrokeWidth(N);
        c43Var.d.setStrokeWidth(N * 1.47f);
        this.v0 = mb5Var.getContext().getResources().getDrawable(2131232695).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(hl.o());
        textPaint.setTextSize(hl.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(hl.o());
        textPaint2.setTextSize(hl.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = ob6.M0(2131742876, null);
        String M02 = ob6.M0(2131742873, null);
        int L = hl.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L, alignment, 1.0f, 0.0f, false);
        StaticLayout staticLayout2 = new StaticLayout(ob6.a0("VoipVideoNotAvailable", null, 2131742878, ob6.G(uc7.s1(i).l4.U0.f(), "Participants", new Object[0])), textPaint, hl.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M03 = ob6.M0(2131742874, null);
        ga5 ga5Var = new ga5(this, mb5Var.getContext(), vc2Var, mb5Var, textPaint, staticLayout2, textPaint2, M03, textPaint2.measureText(M03), staticLayout, j95Var, M0, textPaint.measureText(M0));
        this.a = ga5Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        gmc gmcVar = ga5Var.d;
        gmcVar.setScalingType(scalingType);
        this.y = mb5Var;
        this.H = j95Var;
        gmcVar.b(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ha5(this));
        TextureView textureView = ga5Var.e;
        if (textureView != null) {
            gmcVar.setBackgroundRenderer(textureView);
            if (!gmcVar.c.P) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        gmcVar.setAlpha(0.0f);
        addView(ga5Var);
        ja5 ja5Var = new ja5(this, getContext());
        this.b0 = ja5Var;
        addView(ja5Var);
        ema emaVar = new ema(mb5Var.getContext());
        this.M = emaVar;
        emaVar.setTextSize(13);
        emaVar.setTextColor(vm2.o(-1, 229));
        emaVar.setTypeface(hl.o());
        emaVar.setFullTextMaxLines(1);
        emaVar.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(mb5Var.getContext());
        this.K = frameLayout;
        frameLayout.addView(emaVar, tre.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, tre.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setColor(aob.w0(null, aob.hh, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(mb5Var.getContext());
        this.U = imageView;
        addView((View) imageView, tre.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(mb5Var.getContext());
        this.V = imageView2;
        addView(imageView2, tre.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        imageView2.setImageDrawable(mb5Var.getContext().getDrawable(2131232829));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L2 = hl.L(19.0f);
        int o = vm2.o(-1, 100);
        hf0 i0 = aob.i0(L2, L2, L2, L2, 0, o, o);
        fx0 fx0Var = new fx0((byte) 3, mb5Var.getContext(), this);
        this.O = fx0Var;
        fx0Var.setText(ob6.M0(2131742872, null));
        fx0Var.setTextSize(1, 15.0f);
        fx0Var.setTypeface(hl.o());
        fx0Var.setPadding(hl.L(21.0f), 0, hl.L(21.0f), 0);
        fx0Var.setTextColor(-1);
        fx0Var.setBackground(i0);
        fx0Var.setGravity(17);
        fx0Var.setOnClickListener(new mh3(this, (byte) 28));
        addView(fx0Var, tre.e(-2, 38, 51));
    }

    public static ka5 c(ArrayList arrayList, g75 g75Var, q95 q95Var, o95 o95Var, q95 q95Var2, wc2 wc2Var, vc2 vc2Var, j95 j95Var) {
        ka5 ka5Var;
        int i = 0;
        while (true) {
            if (i < arrayList.size()) {
                if (wc2Var.equals(((ka5) arrayList.get(i)).x)) {
                    ka5Var = (ka5) arrayList.get(i);
                    break;
                }
                i++;
            } else {
                ka5Var = null;
                break;
            }
        }
        if (ka5Var == null) {
            ka5Var = new ka5(g75Var, vc2Var, j95Var);
        }
        if (q95Var != null) {
            ka5Var.setPrimaryView(q95Var);
        }
        if (o95Var != null) {
            ka5Var.setSecondaryView(o95Var);
        }
        if (q95Var2 != null) {
            ka5Var.setTabletGridView(q95Var2);
        }
        return ka5Var;
    }

    @Override
    public final void a() {
        invalidate();
        k(true);
        ja5 ja5Var = this.b0;
        if (ja5Var.getVisibility() == 0) {
            ja5Var.a(true);
        }
    }

    public final void b(boolean z) {
        this.P = true;
        this.w = false;
        this.y.e(this);
        if (z) {
            if (this.x.a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                wc2 wc2Var = this.x;
                sharedInstance.removeRemoteSink(wc2Var.a, wc2Var.b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
        }
        this.a.d.e();
    }

    public final void d() {
        String str;
        int f;
        int f2;
        if (this.q0 == null) {
            HashMap hashMap = this.G.h;
            wc2 wc2Var = this.x;
            boolean z = wc2Var.b;
            TLRPC.GroupCallParticipant groupCallParticipant = wc2Var.a;
            if (z) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            this.q0 = bitmap;
            this.a.setThumb(bitmap);
            if (this.q0 == null) {
                long B1 = r47.B1(this.x.a.peer);
                wc2 wc2Var2 = this.x;
                boolean z2 = wc2Var2.a.self;
                ImageReceiver imageReceiver = this.l0;
                if (z2 && wc2Var2.b) {
                    imageReceiver.g0(new ih7(-14602694, -13935795, -14395293, -14203560, true, false));
                    return;
                }
                int i = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                int i2 = this.L;
                if (i > 0) {
                    TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(B1));
                    jn5 l = jn5.l(i2, 1, X1);
                    if (X1 != null) {
                        f2 = rb0.c(X1.id);
                    } else {
                        f2 = vm2.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.d0(l, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{vm2.f(0.2f, f2, -16777216), vm2.f(0.4f, f2, -16777216)}), null, X1, 0);
                    return;
                }
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-B1));
                jn5 a = jn5.a(1, M0);
                if (M0 != null) {
                    f = rb0.c(M0.id);
                } else {
                    f = vm2.f(0.2f, -16777216, -1);
                }
                imageReceiver.d0(a, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{vm2.f(0.2f, f, -16777216), vm2.f(0.4f, f, -16777216)}), null, M0, 0);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        boolean z = this.w;
        mb5 mb5Var = this.y;
        ga5 ga5Var = this.a;
        if (z) {
            float y = (ga5Var.getY() + ga5Var.getMeasuredHeight()) - ga5Var.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y - frameLayout.getMeasuredHeight()) + this.p0;
            boolean z2 = this.h;
            e29 e29Var = this.U;
            if (!z2 && !this.f) {
                if (!this.b && !this.r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - mb5Var.c);
                        e29Var.setAlpha(1.0f - mb5Var.c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        e29Var.setAlpha(1.0f);
                    }
                } else {
                    if (!j95.u5 && !j95.v5) {
                        measuredHeight = qu6.B(1.0f, mb5Var.a0, hl.L(90.0f) * mb5Var.c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    e29Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - mb5Var.n);
                e29Var.setAlpha(1.0f - mb5Var.n);
            }
            boolean z3 = this.b;
            ema emaVar = this.M;
            if (!z3 && !this.r) {
                emaVar.setFullAlpha(0.0f);
            } else {
                emaVar.setFullAlpha(mb5Var.c);
            }
            e29Var.setTranslationX(frameLayout.getX());
            e29Var.setTranslationY(measuredHeight - hl.L(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((ga5Var.getMeasuredWidth() - (ga5Var.P * 2.0f)) - hl.L(32.0f));
                imageView.setTranslationY(measuredHeight - hl.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - mb5Var.c, 1.0f - mb5Var.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.y0) {
                L = 0.0f;
            } else {
                L = hl.L(6.0f) * mb5Var.c;
            }
            frameLayout.setTranslationX(L);
        }
        super.dispatchDraw(canvas);
        if (this.w) {
            rb5 rb5Var = this.n0;
            if (rb5Var != null) {
                boolean z4 = rb5Var.e;
                float f = this.S;
                if (z4) {
                    if (f != 1.0f) {
                        float f2 = f + 0.053333335f;
                        this.S = f2;
                        if (f2 > 1.0f) {
                            this.S = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                } else if (f != 0.0f) {
                    float f3 = f - 0.053333335f;
                    this.S = f3;
                    if (f3 < 0.0f) {
                        this.S = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            float f4 = this.S;
            float f5 = (1.0f - mb5Var.n) * (1.0f - mb5Var.c) * f4;
            if (f4 > 0.0f) {
                int i = (int) (f5 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / hl.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = hl.P;
                rectF.set(ga5Var.getX() + ga5Var.P, ga5Var.getY() + ga5Var.O, (ga5Var.getX() + ga5Var.getMeasuredWidth()) - ga5Var.P, (ga5Var.getY() + ga5Var.getMeasuredHeight()) - ga5Var.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.p0);
                float f6 = ga5Var.b;
                canvas.drawRoundRect(rectF, f6, f6, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.o0 && (view == this.a || view == this.b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / hl.L(300.0f))) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
            canvas.translate(0.0f, this.p0);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e() {
        this.a.d.e();
        rb5 rb5Var = this.n0;
        if (rb5Var != null) {
            this.H.l4.add(rb5Var);
            this.n0.b();
            rb5 rb5Var2 = this.n0;
            rb5Var2.c = null;
            rb5Var2.c(false);
        }
        this.n0 = null;
    }

    public final void f() {
        if (this.x != null && this.a.d.getMeasuredHeight() != 0 && this.a.d.getMeasuredWidth() != 0) {
            e05 e05Var = new e05(this, (byte) 7);
            anb anbVar = this.a.d.c;
            synchronized (anbVar.c) {
                try {
                    d1 d1Var = anbVar.d;
                    if (d1Var != null) {
                        d1Var.post(new c9c(anbVar, e05Var, (byte) 27));
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    public final void g(boolean z, boolean z2) {
        boolean z3;
        if (this.n != z) {
            this.n = z;
            if ((this.c != null || this.e != null) && z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            j(z3);
        }
    }

    public String getName() {
        long B1 = r47.B1(this.x.a.peer);
        boolean D = wf3.D(B1);
        int i = yac.t0;
        if (D) {
            return lbc.r(uc7.s1(k5.a(i).a).X1(Long.valueOf(B1)));
        }
        return uc7.s1(k5.a(i).a).M0(Long.valueOf(-B1)).title;
    }

    public q95 getPrimaryView() {
        return this.c;
    }

    public final void h(boolean z, boolean z2) {
        if (this.b != z) {
            this.b = z;
            this.R = true;
            j(z2);
        }
    }

    public final void i(float f, float f2, float f3, float f4, float f5, boolean z) {
        if (this.e0 == f && this.f0 == f2 && this.g0 == f3 && this.h0 == f4 && this.i0 == f5) {
            return;
        }
        this.j0 = z;
        this.e0 = f;
        this.f0 = f2;
        this.g0 = f3;
        this.h0 = f4;
        this.i0 = f5;
        this.a.invalidate();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.a.invalidate();
        }
        q95 q95Var = this.c;
        if (q95Var != null) {
            q95Var.invalidate();
            j95 j95Var = this.H;
            if (j95Var.M4 == this.c) {
                j95Var.b.invalidate();
            }
        }
        o95 o95Var = this.d;
        if (o95Var != null) {
            o95Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void j(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka5.j(boolean):void");
    }

    public final void k(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka5.k(boolean):void");
    }

    public final void l(int i) {
        int measuredWidth = this.y.getMeasuredWidth() - hl.L(6.0f);
        if ((this.F0 != i && i > 0) || (this.G0 != measuredWidth && measuredWidth > 0)) {
            if (i != 0) {
                this.F0 = i;
            }
            if (measuredWidth != 0) {
                this.G0 = measuredWidth;
            }
            this.M.h(measuredWidth - i, 0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l0.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l0.K();
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka5.onMeasure(int, int):void");
    }

    public void setAmplitude(double r2) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka5.setAmplitude(double):void");
    }

    public void setPrimaryView(q95 q95Var) {
        if (this.c != q95Var) {
            this.c = q95Var;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(o95 o95Var) {
        if (this.d != o95Var) {
            this.d = o95Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(q95 q95Var) {
        if (this.e != q95Var) {
            this.e = q95Var;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
