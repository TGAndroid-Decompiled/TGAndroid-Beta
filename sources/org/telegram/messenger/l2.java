package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import org.telegram.ui.Components.rz0;
public final class l2 extends View {
    public final RectF D;
    public final RectF E;
    public final org.telegram.ui.Components.dc F;
    public final RectF G;
    public final RectF H;
    public final org.telegram.ui.Components.dc I;
    public final long J;
    public boolean K;
    public final org.telegram.ui.Components.t5 L;
    public boolean M;
    public final org.telegram.ui.Components.t5 N;
    public boolean O;
    public final org.telegram.ui.Components.t5 P;
    public final rz0 Q;
    public final rz0 R;
    public final li.k S;
    public rz0 T;
    public Drawable U;
    public Drawable V;
    public RenderNode W;
    public final Paint f16865a;
    public final a f16866a0;
    public final Paint f16867b;
    public Runnable f16868b0;
    public final Paint f16869c;
    public Runnable f16870c0;
    public final Path d;
    public Runnable f16871d0;
    public final Paint e;
    public Object f16872e0;
    public final Path f16873f;
    public WebView f16874f0;
    public int f16875g0;
    public final RectF h;
    public final RectF f16876n;
    public final org.telegram.ui.Components.dc f16877r;
    public final RectF f16878s;
    public final RectF f16879w;
    public final org.telegram.ui.Components.dc f16880x;
    public final RectF f16881y;

    public l2(Context context) {
        super(context);
        this.f16865a = new Paint(1);
        this.f16867b = new Paint(1);
        Paint paint = new Paint(1);
        this.f16869c = paint;
        this.d = new Path();
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Path path = new Path();
        this.f16873f = path;
        this.h = new RectF();
        this.f16876n = new RectF();
        this.f16877r = new org.telegram.ui.Components.dc((View) null);
        this.f16878s = new RectF();
        this.f16879w = new RectF();
        this.f16880x = new org.telegram.ui.Components.dc(this);
        this.f16881y = new RectF();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new org.telegram.ui.Components.dc(this);
        this.G = new RectF();
        this.H = new RectF();
        this.I = new org.telegram.ui.Components.dc(this);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.L = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.M = true;
        this.N = new org.telegram.ui.Components.t5(this, 0L, 420L, grVar);
        this.O = false;
        this.P = new org.telegram.ui.Components.t5(this, 0L, 420L, grVar);
        this.S = new li.k(23);
        this.f16866a0 = new a(this, 2);
        this.J = System.currentTimeMillis();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.Q = new rz0(dd.L0(2131753063, null), 13.0f, i0.o());
        this.R = new rz0(dd.L0(2131753062, null), 13.0f, i0.o());
        paint2.setPathEffect(new CornerPathEffect(i0.L(1.0f)));
        path.rewind();
        path.moveTo(-i0.N(1.33f), i0.N(0.16f));
        path.lineTo(-i0.N(1.33f), -i0.N(3.5f));
        path.lineTo(i0.N(1.33f), -i0.N(3.5f));
        path.lineTo(i0.N(1.33f), i0.N(0.16f));
        path.lineTo(i0.N(3.5f), i0.N(0.16f));
        path.lineTo(0.0f, i0.N(3.5f));
        path.lineTo(-i0.N(3.5f), i0.N(0.16f));
        path.close();
    }

    public final org.telegram.ui.Components.dc a(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return this.f16877r;
                }
                return this.I;
            }
            return this.F;
        }
        return this.f16880x;
    }

    public final int b(MotionEvent motionEvent) {
        if (this.f16879w.contains(motionEvent.getX(), motionEvent.getY())) {
            return 1;
        }
        if (this.E.contains(motionEvent.getX(), motionEvent.getY())) {
            return 2;
        }
        if (this.H.contains(motionEvent.getX(), motionEvent.getY())) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float L;
        float f11;
        float f12;
        float f13;
        WebView webView;
        super.onDraw(canvas);
        Paint paint = this.f16867b;
        paint.setColor(-1);
        Paint paint2 = this.f16869c;
        paint2.setColor(-1);
        paint2.setStrokeWidth(i0.L(2.0f));
        Path path = this.d;
        path.rewind();
        RectF rectF = this.h;
        float width = (getWidth() - rectF.right) - i0.L(79.66f);
        float L2 = rectF.top + i0.L(8.0f);
        float width2 = (getWidth() - rectF.right) - i0.L(8.0f);
        float L3 = rectF.top + i0.L(38.0f);
        RectF rectF2 = this.f16881y;
        rectF2.set(width, L2, width2, L3);
        float f14 = rectF2.left;
        float f15 = rectF2.top;
        float centerX = rectF2.centerX();
        float f16 = rectF2.bottom;
        RectF rectF3 = this.D;
        rectF3.set(f14, f15, centerX, f16);
        this.E.set(rectF3.left - i0.L(8.0f), rectF3.top - i0.L(8.0f), rectF3.right, rectF3.bottom + i0.L(8.0f));
        float centerX2 = rectF2.centerX();
        float f17 = rectF2.top;
        float f18 = rectF2.right;
        float f19 = rectF2.bottom;
        RectF rectF4 = this.G;
        rectF4.set(centerX2, f17, f18, f19);
        this.H.set(rectF4.left, rectF4.top - i0.L(8.0f), rectF4.right + i0.L(8.0f), rectF4.bottom + i0.L(8.0f));
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, i0.L(15.0f), i0.L(15.0f), direction);
        float d = this.L.d(this.K);
        float d10 = this.N.d(this.M);
        float L4 = (rectF2.left - i0.L(18.0f)) - (rectF.left + i0.L(38.0f));
        rz0 rz0Var = this.T;
        if (rz0Var == null) {
            f7 = 18.0f;
            L = 0.0f;
        } else {
            float f20 = rz0Var.f30126c;
            f7 = 18.0f;
            if (this.U != null) {
                f10 = 30.0f;
            } else {
                f10 = 12.0f;
            }
            L = f20 + i0.L(f10);
        }
        float min = Math.min(L4, L);
        float T1 = i0.T1(i0.T1(this.R.f30126c, this.Q.f30126c, d) + i0.L(12.0f), min, d10);
        RectF rectF5 = this.f16876n;
        rectF5.set(rectF.left + i0.L(8.0f), rectF.top + i0.L(8.0f), rectF.left + i0.L(38.0f) + T1, rectF.top + i0.L(38.0f));
        float f21 = rectF5.left;
        float f22 = rectF5.bottom;
        RectF rectF6 = this.f16878s;
        rectF6.set(f21, rectF5.top, i0.L(30.0f) + f21, f22);
        RectF rectF7 = this.f16879w;
        rectF7.set(rectF6);
        rectF7.right = i0.T1(rectF5.right, rectF6.left + i0.L(30.0f), d10);
        rectF7.inset(-i0.L(8.0f), -i0.L(8.0f));
        path.addRoundRect(rectF5, i0.L(15.0f), i0.L(15.0f), direction);
        Object obj = this.f16872e0;
        Paint paint3 = this.f16865a;
        if (obj != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && ((webView = this.f16874f0) == null || webView.getLayerType() == 2)) {
            if (this.W == null) {
                RenderNode renderNode = new RenderNode("bot_fullscreen_blur");
                this.W = renderNode;
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(i0.L(f7), i0.L(f7), Shader.TileMode.CLAMP));
            }
            RenderNode b10 = m4.v0.b(this.f16872e0);
            this.W.setPosition(0, 0, i0.a.d(16.0f, b10.getWidth(), 1), Math.max(1, (int) Math.min(rectF.top + i0.L(46.0f), b10.getHeight())));
            RecordingCanvas beginRecording = this.W.beginRecording();
            beginRecording.translate(-i0.L(8.0f), 0.0f);
            beginRecording.drawRenderNode(b10);
            this.W.endRecording();
            canvas.save();
            canvas.clipPath(path);
            canvas.save();
            canvas.translate(i0.L(8.0f), 0.0f);
            canvas.drawRenderNode(this.W);
            canvas.restore();
            paint3.setColor(org.telegram.ui.ActionBar.t6.r1(0.22f, -16777216));
            canvas.drawPaint(paint3);
            canvas.restore();
        } else {
            paint3.setColor(org.telegram.ui.ActionBar.t6.r1(0.35f, -16777216));
            canvas.drawPath(path, paint3);
        }
        canvas.save();
        canvas.translate(rectF6.centerX(), rectF6.centerY());
        org.telegram.ui.Components.dc dcVar = this.f16880x;
        float a2 = dcVar.a(0.1f);
        canvas.scale(a2, a2);
        canvas.translate((-i0.L(6.5f)) * d, 0.0f);
        float T12 = i0.T1(i0.L(4.66f), i0.L(5.5f), d);
        float f23 = -T12;
        canvas.drawLine(i0.T1(f23, 0.0f, d), i0.T1(f23, 0.0f, d), T12, T12, paint2);
        canvas.drawLine(i0.T1(f23, 0.0f, d), i0.T1(T12, 0.0f, d), T12, f23, paint2);
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i10 > 0) {
            canvas.drawLine(0.0f, 0.0f, i0.L(11.6f) * d, 0.0f, paint2);
        }
        canvas.restore();
        Canvas canvas2 = canvas;
        canvas2.saveLayerAlpha((rectF5.left + i0.L(30.0f)) - i0.L(10.0f), rectF5.top, rectF5.right, rectF5.bottom, 255, 31);
        if (d10 > 0.0f && this.T != null) {
            canvas2.save();
            canvas2.translate(sc.e.z(1.0f, d10, min, rectF5.left + i0.L(30.0f)), rectF5.centerY());
            rz0 rz0Var2 = this.T;
            float f24 = rectF5.right;
            if (this.U != null) {
                f13 = 30.0f;
            } else {
                f13 = 12.0f;
            }
            rz0Var2.f30136p = ((f24 - i0.L(f13)) - (rectF5.left + i0.L(30.0f))) + 2.0f;
            f12 = 1.0f;
            rz0Var2.c(0.0f, 0.0f, d10, -1, canvas);
            f11 = d10;
            canvas2 = canvas;
            canvas2.translate(this.T.k() + i0.L(5.0f), 0.0f);
            int L5 = i0.L(16.0f);
            Drawable drawable = this.U;
            if (drawable != null) {
                drawable.setBounds(0, (-L5) / 2, L5, L5 / 2);
                this.U.setAlpha((int) (75.0f * f11));
                this.U.draw(canvas2);
            }
            Drawable drawable2 = this.V;
            if (drawable2 != null) {
                drawable2.setBounds(0, (-L5) / 2, L5, L5 / 2);
                this.V.setAlpha((int) (255.0f * f11));
                this.V.draw(canvas2);
            }
            RectF rectF8 = i0.P;
            rectF8.set((rectF5.left + i0.L(30.0f)) - i0.L(10.0f), rectF5.top, rectF5.left + i0.L(30.0f), rectF5.bottom);
            this.S.o(canvas2, rectF8, 2, 1.0f);
            canvas2.restore();
        } else {
            f11 = d10;
            f12 = 1.0f;
        }
        if (f11 < f12) {
            canvas2.save();
            float a10 = dcVar.a(0.1f);
            canvas2.scale(a10, a10, rectF6.centerX(), rectF6.centerY());
            float f25 = f12 - d;
            if (f25 > 0.0f) {
                this.R.c(((rectF6.left + i0.L(30.0f)) - (i0.L(12.0f) * d)) + (i0.L(32.0f) * f11), rectF6.centerY(), (f12 - f11) * f25, -1, canvas);
            }
            if (i10 > 0) {
                this.Q.c((i0.L(12.0f) * f25) + rectF6.left + i0.L(30.0f) + (i0.L(32.0f) * f11), rectF6.centerY(), (f12 - f11) * d, -1, canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            canvas2.restore();
        }
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF3.centerX() + i0.L(2.0f), rectF3.centerY());
        float a11 = this.F.a(0.1f);
        canvas2.scale(a11, a11);
        float L6 = i0.L(6.0f);
        float L7 = i0.L(3.0f);
        float f26 = -L7;
        canvas2.drawLine(-L6, f26, 0.0f, L7, paint2);
        canvas.drawLine(0.0f, L7, L6, f26, paint2);
        canvas.restore();
        canvas.save();
        canvas.translate(rectF4.centerX() + i0.L(f12), rectF4.centerY());
        float a12 = this.I.a(0.1f);
        canvas.scale(a12, a12);
        canvas.drawCircle(0.0f, -i0.L(5.0f), i0.L(1.66f), paint);
        canvas.drawCircle(0.0f, 0.0f, i0.L(1.66f), paint);
        canvas.drawCircle(0.0f, i0.L(5.0f), i0.L(1.66f), paint);
        float d11 = this.P.d(this.O);
        if (d11 > 0.0f) {
            canvas.translate(-i0.N(8.166f), i0.N(3.5f));
            float f27 = (d11 * 0.5f) + 0.5f;
            canvas.scale(f27, f27);
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.4f, -1);
            Paint paint4 = this.e;
            paint4.setColor(r12);
            Path path2 = this.f16873f;
            canvas.drawPath(path2, paint4);
            float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.J) % 450)) / 450.0f;
            float f28 = 0.5f + currentTimeMillis;
            canvas.save();
            canvas.clipRect(-i0.L(5.0f), i0.T1(-i0.N(3.5f), i0.N(3.5f), currentTimeMillis), i0.L(5.0f), i0.T1(-i0.N(3.5f), i0.N(3.5f), f28));
            paint4.setColor(org.telegram.ui.ActionBar.t6.r1(f12, -1));
            canvas.drawPath(path2, paint4);
            canvas.restore();
            if (f28 > f12) {
                canvas.save();
                canvas.clipRect(-i0.L(5.0f), i0.T1(-i0.N(3.5f), i0.N(3.5f), 0.0f), i0.L(5.0f), i0.T1(-i0.N(3.5f), i0.N(3.5f), f28 - f12));
                paint4.setColor(org.telegram.ui.ActionBar.t6.r1(f12, -1));
                canvas.drawPath(path2, paint4);
                canvas.restore();
            }
            invalidate();
        }
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (motionEvent.getAction() == 0) {
            a(this.f16875g0).c(false);
            int b10 = b(motionEvent);
            this.f16875g0 = b10;
            a(b10).c(true);
        } else if (motionEvent.getAction() == 2) {
            if (b(motionEvent) != this.f16875g0) {
                this.f16875g0 = 0;
                a(0).c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            int i10 = this.f16875g0;
            if (i10 == 1 && (runnable3 = this.f16868b0) != null) {
                runnable3.run();
            } else if (i10 == 2 && (runnable2 = this.f16870c0) != null) {
                runnable2.run();
            } else if (i10 == 3 && (runnable = this.f16871d0) != null) {
                runnable.run();
            }
            a(this.f16875g0).c(false);
            this.f16875g0 = 0;
        } else if (motionEvent.getAction() == 3) {
            a(this.f16875g0).c(false);
            this.f16875g0 = 0;
        }
        if (this.f16875g0 != 0) {
            return true;
        }
        return false;
    }

    public void setBack(boolean z10) {
        this.K = z10;
        invalidate();
    }

    public void setDownloading(boolean z10) {
        if (this.O == z10) {
            return;
        }
        this.O = z10;
        invalidate();
    }

    public void setInsets(RectF rectF) {
        this.h.set(rectF);
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.f16868b0 = runnable;
    }

    public void setOnCollapseClickListener(Runnable runnable) {
        this.f16870c0 = runnable;
    }

    public void setOnMenuClickListener(Runnable runnable) {
        this.f16871d0 = runnable;
    }

    public void setParentRenderNode(Object obj) {
        this.f16872e0 = obj;
    }

    public void setWebView(WebView webView) {
        this.f16874f0 = webView;
    }

    public void setInsets(Rect rect) {
        this.h.set(rect);
    }
}
