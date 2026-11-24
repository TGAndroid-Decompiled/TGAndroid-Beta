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
public final class h85 extends FrameLayout implements p95 {
    public mn6 A0;
    public int B0;
    public int C0;
    public int D0;
    public final Paint E;
    public ValueAnimator E0;
    public boolean F;
    public int F0;
    public final fc2 G;
    public int G0;
    public final h75 H;
    public ValueAnimator H0;
    public boolean I;
    public boolean I0;
    public float J;
    public final FrameLayout K;
    public final int L;
    public final jia M;
    public int N;
    public final xw0 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final ry8 U;
    public final ImageView V;
    public boolean W;
    public final d85 a;
    public float a0;
    public boolean b;
    public final g85 b0;
    public o75 c;
    public ValueAnimator c0;
    public m75 d;
    public boolean d0;
    public o75 e;
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
    public q95 n0;
    public boolean o0;
    public float p0;
    public Bitmap q0;
    public boolean r;
    public Paint r0;
    public boolean s;
    public boolean s0;
    public float t0;
    public final k33 u0;
    public final Drawable v0;
    public boolean w;
    public float w0;
    public gc2 x;
    public ImageView x0;
    public final l95 y;
    public boolean y0;
    public final Rect z0;

    public h85(l95 l95Var, fc2 fc2Var, h75 h75Var) {
        super(l95Var.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.a0 = 1.0f;
        this.l0 = new ImageReceiver(null);
        this.m0 = new ArrayList();
        this.z0 = new Rect();
        this.G = fc2Var;
        int i = h75Var.a;
        this.L = i;
        k33 k33Var = new k33(l95Var.getContext(), 2131230926, -1);
        this.u0 = k33Var;
        k33Var.a(true, false);
        k33Var.i = -gl.L(4.0f);
        k33Var.j = gl.L(6.0f);
        k33Var.k = gl.L(6.0f);
        k33Var.invalidateSelf();
        float N = gl.N(3.4f);
        k33Var.c.setStrokeWidth(N);
        k33Var.d.setStrokeWidth(N * 1.47f);
        this.v0 = l95Var.getContext().getResources().getDrawable(2131232684).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(gl.o());
        textPaint2.setTextSize(gl.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = k96.M0(2131742982, null);
        String M02 = k96.M0(2131742979, null);
        int L = gl.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L, alignment, 1.0f, 0.0f, false);
        StaticLayout staticLayout2 = new StaticLayout(k96.a0("VoipVideoNotAvailable", null, 2131742984, k96.G(na7.q1(i).k4.M0.f(), "Participants", new Object[0])), textPaint, gl.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M03 = k96.M0(2131742980, null);
        d85 d85Var = new d85(this, l95Var.getContext(), fc2Var, l95Var, textPaint, staticLayout2, textPaint2, M03, textPaint2.measureText(M03), staticLayout, h75Var, M0, textPaint.measureText(M0));
        this.a = d85Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        zhc zhcVar = d85Var.d;
        zhcVar.setScalingType(scalingType);
        this.y = l95Var;
        this.H = h75Var;
        zhcVar.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new e85(this));
        TextureView textureView = d85Var.e;
        if (textureView != null) {
            zhcVar.setBackgroundRenderer(textureView);
            if (!zhcVar.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        zhcVar.setAlpha(0.0f);
        addView(d85Var);
        g85 g85Var = new g85(this, getContext());
        this.b0 = g85Var;
        addView(g85Var);
        jia jiaVar = new jia(l95Var.getContext());
        this.M = jiaVar;
        jiaVar.setTextSize(13);
        jiaVar.setTextColor(bm2.o(-1, 229));
        jiaVar.setTypeface(gl.o());
        jiaVar.setFullTextMaxLines(1);
        jiaVar.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l95Var.getContext());
        this.K = frameLayout;
        frameLayout.addView(jiaVar, nme.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, nme.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setColor(bkb.w0(null, bkb.gh, false));
        frameLayout.setClipChildren(false);
        ?? imageView = new ImageView(l95Var.getContext());
        this.U = imageView;
        addView((View) imageView, nme.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(l95Var.getContext());
        this.V = imageView2;
        addView(imageView2, nme.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView2.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        imageView2.setImageDrawable(l95Var.getContext().getDrawable(2131232810));
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L2 = gl.L(19.0f);
        int o = bm2.o(-1, 100);
        ff0 i0 = bkb.i0(L2, L2, L2, L2, 0, o, o);
        xw0 xw0Var = new xw0((byte) 3, l95Var.getContext(), this);
        this.O = xw0Var;
        xw0Var.setText(k96.M0(2131742978, null));
        xw0Var.setTextSize(1, 15.0f);
        xw0Var.setTypeface(gl.o());
        xw0Var.setPadding(gl.L(21.0f), 0, gl.L(21.0f), 0);
        xw0Var.setTextColor(-1);
        xw0Var.setBackground(i0);
        xw0Var.setGravity(17);
        xw0Var.setOnClickListener(new yj3(this, (byte) 27));
        addView(xw0Var, nme.e(-2, 38, 51));
    }

    public static h85 c(ArrayList arrayList, e55 e55Var, o75 o75Var, m75 m75Var, o75 o75Var2, gc2 gc2Var, fc2 fc2Var, h75 h75Var) {
        h85 h85Var;
        int i = 0;
        while (true) {
            if (i < arrayList.size()) {
                if (gc2Var.equals(((h85) arrayList.get(i)).x)) {
                    h85Var = (h85) arrayList.get(i);
                    break;
                }
                i++;
            } else {
                h85Var = null;
                break;
            }
        }
        if (h85Var == null) {
            h85Var = new h85(e55Var, fc2Var, h75Var);
        }
        if (o75Var != null) {
            h85Var.setPrimaryView(o75Var);
        }
        if (m75Var != null) {
            h85Var.setSecondaryView(m75Var);
        }
        if (o75Var2 != null) {
            h85Var.setTabletGridView(o75Var2);
        }
        return h85Var;
    }

    @Override
    public final void a() {
        invalidate();
        k(true);
        g85 g85Var = this.b0;
        if (g85Var.getVisibility() == 0) {
            g85Var.a(true);
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
                gc2 gc2Var = this.x;
                sharedInstance.removeRemoteSink(gc2Var.a, gc2Var.b);
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
            gc2 gc2Var = this.x;
            boolean z = gc2Var.b;
            TLRPC.GroupCallParticipant groupCallParticipant = gc2Var.a;
            if (z) {
                str = groupCallParticipant.presentationEndpoint;
            } else {
                str = groupCallParticipant.videoEndpoint;
            }
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            this.q0 = bitmap;
            this.a.setThumb(bitmap);
            if (this.q0 == null) {
                long B1 = k27.B1(this.x.a.peer);
                gc2 gc2Var2 = this.x;
                boolean z2 = gc2Var2.a.self;
                ImageReceiver imageReceiver = this.l0;
                if (z2 && gc2Var2.b) {
                    imageReceiver.g0(new ye7(-14602694, -13935795, -14395293, -14203560, true, false));
                    return;
                }
                int i = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
                int i2 = this.L;
                if (i > 0) {
                    TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(B1));
                    gl5 l = gl5.l(i2, 1, V1);
                    if (V1 != null) {
                        f2 = pb0.c(V1.id);
                    } else {
                        f2 = bm2.f(0.2f, -16777216, -1);
                    }
                    imageReceiver.d0(l, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{bm2.f(0.2f, f2, -16777216), bm2.f(0.4f, f2, -16777216)}), null, V1, 0);
                    return;
                }
                TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-B1));
                gl5 a = gl5.a(1, K0);
                if (K0 != null) {
                    f = pb0.c(K0.id);
                } else {
                    f = bm2.f(0.2f, -16777216, -1);
                }
                imageReceiver.d0(a, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{bm2.f(0.2f, f, -16777216), bm2.f(0.4f, f, -16777216)}), null, K0, 0);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        boolean z = this.w;
        l95 l95Var = this.y;
        d85 d85Var = this.a;
        if (z) {
            float y = (d85Var.getY() + d85Var.getMeasuredHeight()) - d85Var.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y - frameLayout.getMeasuredHeight()) + this.p0;
            boolean z2 = this.h;
            ry8 ry8Var = this.U;
            if (!z2 && !this.f) {
                if (!this.b && !this.r) {
                    if (this.d != null) {
                        frameLayout.setAlpha(1.0f - l95Var.c);
                        ry8Var.setAlpha(1.0f - l95Var.c);
                    } else {
                        frameLayout.setAlpha(1.0f);
                        ry8Var.setAlpha(1.0f);
                    }
                } else {
                    if (!h75.u5 && !h75.v5) {
                        measuredHeight = ls6.B(1.0f, l95Var.a0, gl.L(90.0f) * l95Var.c, measuredHeight);
                    }
                    frameLayout.setAlpha(1.0f);
                    ry8Var.setAlpha(1.0f);
                }
            } else {
                frameLayout.setAlpha(1.0f - l95Var.n);
                ry8Var.setAlpha(1.0f - l95Var.n);
            }
            boolean z3 = this.b;
            jia jiaVar = this.M;
            if (!z3 && !this.r) {
                jiaVar.setFullAlpha(0.0f);
            } else {
                jiaVar.setFullAlpha(l95Var.c);
            }
            ry8Var.setTranslationX(frameLayout.getX());
            ry8Var.setTranslationY(measuredHeight - gl.L(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((d85Var.getMeasuredWidth() - (d85Var.P * 2.0f)) - gl.L(32.0f));
                imageView.setTranslationY(measuredHeight - gl.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - l95Var.c, 1.0f - l95Var.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            if (this.y0) {
                L = 0.0f;
            } else {
                L = gl.L(6.0f) * l95Var.c;
            }
            frameLayout.setTranslationX(L);
        }
        super.dispatchDraw(canvas);
        if (this.w) {
            q95 q95Var = this.n0;
            if (q95Var != null) {
                boolean z4 = q95Var.e;
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
            float f5 = (1.0f - l95Var.n) * (1.0f - l95Var.c) * f4;
            if (f4 > 0.0f) {
                int i = (int) (f5 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / gl.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = gl.P;
                rectF.set(d85Var.getX() + d85Var.P, d85Var.getY() + d85Var.O, (d85Var.getX() + d85Var.getMeasuredWidth()) - d85Var.P, (d85Var.getY() + d85Var.getMeasuredHeight()) - d85Var.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.p0);
                float f6 = d85Var.b;
                canvas.drawRoundRect(rectF, f6, f6, paint);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.o0 && (view == this.a || view == this.b0)) {
            float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / gl.L(300.0f))) * 0.1f) + 0.9f;
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
        q95 q95Var = this.n0;
        if (q95Var != null) {
            this.H.l4.add(q95Var);
            this.n0.b();
            q95 q95Var2 = this.n0;
            q95Var2.c = null;
            q95Var2.c(false);
        }
        this.n0 = null;
    }

    public final void f() {
        if (this.x != null) {
            d85 d85Var = this.a;
            zhc zhcVar = d85Var.d;
            zhc zhcVar2 = d85Var.d;
            if (zhcVar.getMeasuredHeight() != 0 && zhcVar2.getMeasuredWidth() != 0) {
                zhcVar2.getRenderBufferBitmap(new ry4(this, (byte) 5));
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
        long B1 = k27.B1(this.x.a.peer);
        boolean D = cf3.D(B1);
        int i = y6c.t0;
        if (D) {
            return l7c.q(na7.q1(j5.a(i).a).V1(Long.valueOf(B1)));
        }
        return na7.q1(j5.a(i).a).K0(Long.valueOf(-B1)).title;
    }

    public o75 getPrimaryView() {
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
        o75 o75Var = this.c;
        if (o75Var != null) {
            o75Var.invalidate();
            h75 h75Var = this.H;
            if (h75Var.M4 == this.c) {
                h75Var.b.invalidate();
            }
        }
        m75 m75Var = this.d;
        if (m75Var != null) {
            m75Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    public final void j(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h85.j(boolean):void");
    }

    public final void k(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h85.k(boolean):void");
    }

    public final void l(int i) {
        int measuredWidth = this.y.getMeasuredWidth() - gl.L(6.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h85.onMeasure(int, int):void");
    }

    public void setAmplitude(double r2) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h85.setAmplitude(double):void");
    }

    public void setPrimaryView(o75 o75Var) {
        if (this.c != o75Var) {
            this.c = o75Var;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(m75 m75Var) {
        if (this.d != m75Var) {
            this.d = m75Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(o75 o75Var) {
        if (this.e != o75Var) {
            this.e = o75Var;
            j(true);
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
