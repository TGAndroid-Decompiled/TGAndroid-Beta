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
public final class ha5 extends FrameLayout implements nb5 {
    public np6 A0;
    public int B0;
    public int C0;
    public int D0;
    public final Paint E;
    public ValueAnimator E0;
    public boolean F;
    public int F0;
    public final qd2 G;
    public int G0;
    public final g95 H;
    public ValueAnimator H0;
    public boolean I;
    public boolean I0;
    public float J;
    public final FrameLayout K;
    public final int L;
    public final lka M;
    public int N;
    public final ey0 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final s09 U;
    public final ImageView V;
    public boolean W;
    public final da5 a;
    public float a0;
    public boolean b;
    public final ga5 b0;
    public n95 c;
    public ValueAnimator c0;
    public l95 d;
    public boolean d0;
    public n95 e;
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
    public ob5 n0;
    public boolean o0;
    public float p0;
    public Bitmap q0;
    public boolean r;
    public Paint r0;
    public boolean s;
    public boolean s0;
    public float t0;
    public final v43 u0;
    public final Drawable v0;
    public boolean w;
    public float w0;
    public rd2 x;
    public ImageView x0;
    public final jb5 y;
    public boolean y0;
    public final Rect z0;

    public ha5(jb5 jb5Var, qd2 qd2Var, g95 g95Var) {
        super(jb5Var.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.a0 = 1.0f;
        this.l0 = new ImageReceiver(null);
        this.m0 = new ArrayList();
        this.z0 = new Rect();
        this.G = qd2Var;
        int i = g95Var.a;
        this.L = i;
        v43 v43Var = new v43(jb5Var.getContext(), 2131230927, -1);
        this.u0 = v43Var;
        v43Var.a(true, false);
        v43Var.i = -gm.L(4.0f);
        v43Var.j = gm.L(6.0f);
        v43Var.k = gm.L(6.0f);
        v43Var.invalidateSelf();
        float N = gm.N(3.4f);
        v43Var.c.setStrokeWidth(N);
        v43Var.d.setStrokeWidth(N * 1.47f);
        this.v0 = jb5Var.getContext().getResources().getDrawable(2131232696).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(gm.o());
        textPaint2.setTextSize(gm.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = jb6.M0(2131742908, null);
        String M02 = jb6.M0(2131742905, null);
        int L = gm.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L, alignment, 1.0f, 0.0f, false);
        StaticLayout staticLayout2 = new StaticLayout(jb6.a0("VoipVideoNotAvailable", null, 2131742910, jb6.G(oc7.r1(i).l4.M0.f(), "Participants", new Object[0])), textPaint, gm.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M03 = jb6.M0(2131742906, null);
        da5 da5Var = new da5(this, jb5Var.getContext(), qd2Var, jb5Var, textPaint, staticLayout2, textPaint2, M03, textPaint2.measureText(M03), staticLayout, g95Var, M0, textPaint.measureText(M0));
        this.a = da5Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        zjc zjcVar = da5Var.d;
        zjcVar.setScalingType(scalingType);
        this.y = jb5Var;
        this.H = g95Var;
        zjcVar.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ea5(this));
        TextureView textureView = da5Var.e;
        if (textureView != null) {
            zjcVar.setBackgroundRenderer(textureView);
            if (!zjcVar.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        zjcVar.setAlpha(0.0f);
        addView(da5Var);
        ga5 ga5Var = new ga5(this, getContext());
        this.b0 = ga5Var;
        addView(ga5Var);
        lka lkaVar = new lka(jb5Var.getContext());
        this.M = lkaVar;
        lkaVar.setTextSize(13);
        lkaVar.setTextColor(on2.p(-1, 229));
        lkaVar.setTypeface(gm.o());
        lkaVar.setFullTextMaxLines(1);
        lkaVar.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(jb5Var.getContext());
        this.K = frameLayout;
        frameLayout.addView(lkaVar, qoe.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, qoe.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setColor(cmb.w0(null, cmb.gh, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(jb5Var.getContext());
        this.U = imageView;
        addView((View) imageView, qoe.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(jb5Var.getContext());
        this.V = imageView2;
        addView(imageView2, qoe.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        imageView2.setImageDrawable(jb5Var.getContext().getDrawable(2131232823));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L2 = gm.L(19.0f);
        int p = on2.p(-1, 100);
        fg0 i0 = cmb.i0(L2, L2, L2, L2, 0, p, p);
        ey0 ey0Var = new ey0((byte) 3, jb5Var.getContext(), this);
        this.O = ey0Var;
        ey0Var.setText(jb6.M0(2131742904, null));
        ey0Var.setTextSize(1, 15.0f);
        ey0Var.setTypeface(gm.o());
        ey0Var.setPadding(gm.L(21.0f), 0, gm.L(21.0f), 0);
        ey0Var.setTextColor(-1);
        ey0Var.setBackground(i0);
        ey0Var.setGravity(17);
        ey0Var.setOnClickListener(new ca5(this, (byte) 0));
        addView(ey0Var, qoe.e(-2, 38, 51));
    }

    public static ha5 c(ArrayList arrayList, c75 c75Var, n95 n95Var, l95 l95Var, n95 n95Var2, rd2 rd2Var, qd2 qd2Var, g95 g95Var) {
        ha5 ha5Var;
        int i = 0;
        while (true) {
            if (i < arrayList.size()) {
                if (rd2Var.equals(((ha5) arrayList.get(i)).x)) {
                    ha5Var = (ha5) arrayList.get(i);
                    break;
                }
                i++;
            } else {
                ha5Var = null;
                break;
            }
        }
        if (ha5Var == null) {
            ha5Var = new ha5(c75Var, qd2Var, g95Var);
        }
        if (n95Var != null) {
            ha5Var.setPrimaryView(n95Var);
        }
        if (l95Var != null) {
            ha5Var.setSecondaryView(l95Var);
        }
        if (n95Var2 != null) {
            ha5Var.setTabletGridView(n95Var2);
        }
        return ha5Var;
    }

    @Override
    public final void a() {
        invalidate();
        k(true);
        ga5 ga5Var = this.b0;
        if (ga5Var.getVisibility() == 0) {
            ga5Var.a(true);
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
                rd2 rd2Var = this.x;
                sharedInstance.removeRemoteSink(rd2Var.a, rd2Var.b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
        }
        this.a.d.release();
    }

    public final void d() {
        String str;
        int f;
        int f2;
        if (this.q0 == null) {
            HashMap hashMap = this.G.h;
            rd2 rd2Var = this.x;
            boolean z = rd2Var.b;
            TLRPC.GroupCallParticipant groupCallParticipant = rd2Var.a;
            if (z) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            this.q0 = bitmap;
            this.a.setThumb(bitmap);
            if (this.q0 == null) {
                long B1 = k47.B1(this.x.a.peer);
                rd2 rd2Var2 = this.x;
                boolean z2 = rd2Var2.a.self;
                ImageReceiver imageReceiver = this.l0;
                if (z2 && rd2Var2.b) {
                    imageReceiver.g0(new ah7(-14602694, -13935795, -14395293, -14203560, true, false));
                    return;
                }
                int i = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                int i2 = this.L;
                if (i > 0) {
                    TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(B1));
                    gn5 l = gn5.l(i2, 1, W1);
                    if (W1 != null) {
                        f2 = pc0.c(W1.id);
                    } else {
                        f2 = on2.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.d0(l, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{on2.f(0.2f, f2, -16777216), on2.f(0.4f, f2, -16777216)}), null, W1, 0);
                    return;
                }
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-B1));
                gn5 a = gn5.a(1, L0);
                if (L0 != null) {
                    f = pc0.c(L0.id);
                } else {
                    f = on2.f(0.2f, -16777216, -1);
                }
                imageReceiver.d0(a, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{on2.f(0.2f, f, -16777216), on2.f(0.4f, f, -16777216)}), null, L0, 0);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        boolean z = this.w;
        jb5 jb5Var = this.y;
        da5 da5Var = this.a;
        if (z) {
            float y = (da5Var.getY() + da5Var.getMeasuredHeight()) - da5Var.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y - frameLayout.getMeasuredHeight()) + this.p0;
            boolean z2 = this.h;
            s09 s09Var = this.U;
            if (!z2 && !this.f) {
                if (!this.b && !this.r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - jb5Var.c);
                        s09Var.setAlpha(1.0f - jb5Var.c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        s09Var.setAlpha(1.0f);
                    }
                } else {
                    if (!g95.u5 && !g95.v5) {
                        measuredHeight = kt6.B(1.0f, jb5Var.a0, gm.L(90.0f) * jb5Var.c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    s09Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - jb5Var.n);
                s09Var.setAlpha(1.0f - jb5Var.n);
            }
            boolean z3 = this.b;
            lka lkaVar = this.M;
            if (!z3 && !this.r) {
                lkaVar.setFullAlpha(0.0f);
            } else {
                lkaVar.setFullAlpha(jb5Var.c);
            }
            s09Var.setTranslationX(frameLayout.getX());
            s09Var.setTranslationY(measuredHeight - gm.L(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((da5Var.getMeasuredWidth() - (da5Var.P * 2.0f)) - gm.L(32.0f));
                imageView.setTranslationY(measuredHeight - gm.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - jb5Var.c, 1.0f - jb5Var.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.y0) {
                L = 0.0f;
            } else {
                L = gm.L(6.0f) * jb5Var.c;
            }
            frameLayout.setTranslationX(L);
        }
        super.dispatchDraw(canvas);
        if (this.w) {
            ob5 ob5Var = this.n0;
            if (ob5Var != null) {
                boolean z4 = ob5Var.e;
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
            float f5 = (1.0f - jb5Var.n) * (1.0f - jb5Var.c) * f4;
            if (f4 > 0.0f) {
                int i = (int) (f5 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / gm.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = gm.P;
                rectF.set(da5Var.getX() + da5Var.P, da5Var.getY() + da5Var.O, (da5Var.getX() + da5Var.getMeasuredWidth()) - da5Var.P, (da5Var.getY() + da5Var.getMeasuredHeight()) - da5Var.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.p0);
                float f6 = da5Var.b;
                canvas.drawRoundRect(rectF, f6, f6, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.o0 && (view == this.a || view == this.b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / gm.L(300.0f))) * 0.1f) + 0.9f;
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
        this.a.d.release();
        ob5 ob5Var = this.n0;
        if (ob5Var != null) {
            this.H.l4.add(ob5Var);
            this.n0.b();
            ob5 ob5Var2 = this.n0;
            ob5Var2.c = null;
            ob5Var2.c(false);
        }
        this.n0 = null;
    }

    public final void f() {
        if (this.x != null) {
            da5 da5Var = this.a;
            zjc zjcVar = da5Var.d;
            zjc zjcVar2 = da5Var.d;
            if (zjcVar.getMeasuredHeight() != 0 && zjcVar2.getMeasuredWidth() != 0) {
                zjcVar2.getRenderBufferBitmap(new wx4(this, (byte) 8));
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
        long B1 = k47.B1(this.x.a.peer);
        boolean D = pg3.D(B1);
        int i = z8c.t0;
        if (D) {
            return m9c.r(oc7.r1(j5.a(i).a).W1(Long.valueOf(B1)));
        }
        return oc7.r1(j5.a(i).a).L0(Long.valueOf(-B1)).title;
    }

    public n95 getPrimaryView() {
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
        n95 n95Var = this.c;
        if (n95Var != null) {
            n95Var.invalidate();
            g95 g95Var = this.H;
            if (g95Var.M4 == this.c) {
                g95Var.b.invalidate();
            }
        }
        l95 l95Var = this.d;
        if (l95Var != null) {
            l95Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void j(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha5.j(boolean):void");
    }

    public final void k(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha5.k(boolean):void");
    }

    public final void l(int i) {
        int measuredWidth = this.y.getMeasuredWidth() - gm.L(6.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha5.onMeasure(int, int):void");
    }

    public void setAmplitude(double r2) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha5.setAmplitude(double):void");
    }

    public void setPrimaryView(n95 n95Var) {
        if (this.c != n95Var) {
            this.c = n95Var;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(l95 l95Var) {
        if (this.d != l95Var) {
            this.d = l95Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(n95 n95Var) {
        if (this.e != n95Var) {
            this.e = n95Var;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
