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
import org.telegram.ui.Components.xy0;
public final class h2 extends View {
    public final RectF E;
    public final RectF F;
    public final org.telegram.ui.Components.mc G;
    public final RectF H;
    public final RectF I;
    public final org.telegram.ui.Components.mc J;
    public final long K;
    public boolean L;
    public final org.telegram.ui.Components.d6 M;
    public boolean N;
    public final org.telegram.ui.Components.d6 O;
    public boolean P;
    public final org.telegram.ui.Components.d6 Q;
    public final xy0 R;
    public final xy0 S;
    public final h6.m T;
    public xy0 U;
    public Drawable V;
    public Drawable W;
    public final Paint f24381a;
    public RenderNode f24382a0;
    public final Paint f24383b;
    public final a f24384b0;
    public final Paint f24385c;
    public Runnable f24386c0;
    public final Path d;
    public Runnable f24387d0;
    public final Paint f24388e;
    public Runnable f24389e0;
    public final Path f24390f;
    public Object f24391f0;
    public WebView f24392g0;
    public final RectF h;
    public int f24393h0;
    public final RectF f24394n;
    public final org.telegram.ui.Components.mc f24395r;
    public final RectF f24396s;
    public final RectF f24397w;
    public final org.telegram.ui.Components.mc f24398x;
    public final RectF f24399y;

    public h2(Context context) {
        super(context);
        this.f24381a = new Paint(1);
        this.f24383b = new Paint(1);
        Paint paint = new Paint(1);
        this.f24385c = paint;
        this.d = new Path();
        Paint paint2 = new Paint(1);
        this.f24388e = paint2;
        Path path = new Path();
        this.f24390f = path;
        this.h = new RectF();
        this.f24394n = new RectF();
        this.f24395r = new org.telegram.ui.Components.mc((View) null);
        this.f24396s = new RectF();
        this.f24397w = new RectF();
        this.f24398x = new org.telegram.ui.Components.mc(this);
        this.f24399y = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new org.telegram.ui.Components.mc(this);
        this.H = new RectF();
        this.I = new RectF();
        this.J = new org.telegram.ui.Components.mc(this);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.M = new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar);
        this.N = true;
        this.O = new org.telegram.ui.Components.d6(this, 0L, 420L, nrVar);
        this.P = false;
        this.Q = new org.telegram.ui.Components.d6(this, 0L, 420L, nrVar);
        this.T = new h6.m(29);
        this.f24384b0 = new a(this, 2);
        this.K = System.currentTimeMillis();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.R = new xy0(gd.N0(2131753060, null), 13.0f, g0.o());
        this.S = new xy0(gd.N0(2131753059, null), 13.0f, g0.o());
        paint2.setPathEffect(new CornerPathEffect(g0.L(1.0f)));
        path.rewind();
        path.moveTo(-g0.N(1.33f), g0.N(0.16f));
        path.lineTo(-g0.N(1.33f), -g0.N(3.5f));
        path.lineTo(g0.N(1.33f), -g0.N(3.5f));
        path.lineTo(g0.N(1.33f), g0.N(0.16f));
        path.lineTo(g0.N(3.5f), g0.N(0.16f));
        path.lineTo(0.0f, g0.N(3.5f));
        path.lineTo(-g0.N(3.5f), g0.N(0.16f));
        path.close();
    }

    public final org.telegram.ui.Components.mc a(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return this.f24395r;
                }
                return this.J;
            }
            return this.G;
        }
        return this.f24398x;
    }

    public final int b(MotionEvent motionEvent) {
        if (this.f24397w.contains(motionEvent.getX(), motionEvent.getY())) {
            return 1;
        }
        if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
            return 2;
        }
        if (this.I.contains(motionEvent.getX(), motionEvent.getY())) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float L;
        float f12;
        float f13;
        float f14;
        WebView webView;
        super.onDraw(canvas);
        Paint paint = this.f24383b;
        paint.setColor(-1);
        Paint paint2 = this.f24385c;
        paint2.setColor(-1);
        paint2.setStrokeWidth(g0.L(2.0f));
        Path path = this.d;
        path.rewind();
        RectF rectF = this.h;
        float width = (getWidth() - rectF.right) - g0.L(79.66f);
        float L2 = rectF.top + g0.L(8.0f);
        float width2 = (getWidth() - rectF.right) - g0.L(8.0f);
        float L3 = rectF.top + g0.L(38.0f);
        RectF rectF2 = this.f24399y;
        rectF2.set(width, L2, width2, L3);
        float f15 = rectF2.left;
        float f16 = rectF2.top;
        float centerX = rectF2.centerX();
        float f17 = rectF2.bottom;
        RectF rectF3 = this.E;
        rectF3.set(f15, f16, centerX, f17);
        this.F.set(rectF3.left - g0.L(8.0f), rectF3.top - g0.L(8.0f), rectF3.right, rectF3.bottom + g0.L(8.0f));
        float centerX2 = rectF2.centerX();
        float f18 = rectF2.top;
        float f19 = rectF2.right;
        float f20 = rectF2.bottom;
        RectF rectF4 = this.H;
        rectF4.set(centerX2, f18, f19, f20);
        this.I.set(rectF4.left, rectF4.top - g0.L(8.0f), rectF4.right + g0.L(8.0f), rectF4.bottom + g0.L(8.0f));
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, g0.L(15.0f), g0.L(15.0f), direction);
        float d = this.M.d(this.L);
        float d2 = this.O.d(this.N);
        float L4 = (rectF2.left - g0.L(18.0f)) - (rectF.left + g0.L(38.0f));
        xy0 xy0Var = this.U;
        if (xy0Var == null) {
            f10 = 18.0f;
            L = 0.0f;
        } else {
            float f21 = xy0Var.f42254c;
            f10 = 18.0f;
            if (this.V != null) {
                f11 = 30.0f;
            } else {
                f11 = 12.0f;
            }
            L = f21 + g0.L(f11);
        }
        float min = Math.min(L4, L);
        float T1 = g0.T1(g0.T1(this.S.f42254c, this.R.f42254c, d) + g0.L(12.0f), min, d2);
        RectF rectF5 = this.f24394n;
        rectF5.set(rectF.left + g0.L(8.0f), rectF.top + g0.L(8.0f), rectF.left + g0.L(38.0f) + T1, rectF.top + g0.L(38.0f));
        float f22 = rectF5.left;
        float f23 = rectF5.bottom;
        RectF rectF6 = this.f24396s;
        rectF6.set(f22, rectF5.top, g0.L(30.0f) + f22, f23);
        RectF rectF7 = this.f24397w;
        rectF7.set(rectF6);
        rectF7.right = g0.T1(rectF5.right, rectF6.left + g0.L(30.0f), d2);
        rectF7.inset(-g0.L(8.0f), -g0.L(8.0f));
        path.addRoundRect(rectF5, g0.L(15.0f), g0.L(15.0f), direction);
        Object obj = this.f24391f0;
        Paint paint3 = this.f24381a;
        if (obj != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && ((webView = this.f24392g0) == null || webView.getLayerType() == 2)) {
            if (this.f24382a0 == null) {
                RenderNode renderNode = new RenderNode("bot_fullscreen_blur");
                this.f24382a0 = renderNode;
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(g0.L(f10), g0.L(f10), Shader.TileMode.CLAMP));
            }
            RenderNode d10 = n2.a0.d(this.f24391f0);
            this.f24382a0.setPosition(0, 0, i5.c.d(16.0f, d10.getWidth(), 1), Math.max(1, (int) Math.min(rectF.top + g0.L(46.0f), d10.getHeight())));
            RecordingCanvas beginRecording = this.f24382a0.beginRecording();
            beginRecording.translate(-g0.L(8.0f), 0.0f);
            beginRecording.drawRenderNode(d10);
            this.f24382a0.endRecording();
            canvas.save();
            canvas.clipPath(path);
            canvas.save();
            canvas.translate(g0.L(8.0f), 0.0f);
            canvas.drawRenderNode(this.f24382a0);
            canvas.restore();
            paint3.setColor(org.telegram.ui.ActionBar.m6.r1(0.22f, -16777216));
            canvas.drawPaint(paint3);
            canvas.restore();
        } else {
            paint3.setColor(org.telegram.ui.ActionBar.m6.r1(0.35f, -16777216));
            canvas.drawPath(path, paint3);
        }
        canvas.save();
        canvas.translate(rectF6.centerX(), rectF6.centerY());
        org.telegram.ui.Components.mc mcVar = this.f24398x;
        float a10 = mcVar.a(0.1f);
        canvas.scale(a10, a10);
        canvas.translate((-g0.L(6.5f)) * d, 0.0f);
        float T12 = g0.T1(g0.L(4.66f), g0.L(5.5f), d);
        float f24 = -T12;
        canvas.drawLine(g0.T1(f24, 0.0f, d), g0.T1(f24, 0.0f, d), T12, T12, paint2);
        canvas.drawLine(g0.T1(f24, 0.0f, d), g0.T1(T12, 0.0f, d), T12, f24, paint2);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i7 > 0) {
            canvas.drawLine(0.0f, 0.0f, g0.L(11.6f) * d, 0.0f, paint2);
        }
        canvas.restore();
        Canvas canvas2 = canvas;
        canvas2.saveLayerAlpha((rectF5.left + g0.L(30.0f)) - g0.L(10.0f), rectF5.top, rectF5.right, rectF5.bottom, 255, 31);
        if (d2 > 0.0f && this.U != null) {
            canvas2.save();
            canvas2.translate(com.google.android.gms.internal.vision.e2.t(1.0f, d2, min, rectF5.left + g0.L(30.0f)), rectF5.centerY());
            xy0 xy0Var2 = this.U;
            float f25 = rectF5.right;
            if (this.V != null) {
                f14 = 30.0f;
            } else {
                f14 = 12.0f;
            }
            xy0Var2.f42265p = ((f25 - g0.L(f14)) - (rectF5.left + g0.L(30.0f))) + 2.0f;
            f13 = 1.0f;
            xy0Var2.c(0.0f, 0.0f, d2, -1, canvas);
            f12 = d2;
            canvas2 = canvas;
            canvas2.translate(this.U.k() + g0.L(5.0f), 0.0f);
            int L5 = g0.L(16.0f);
            Drawable drawable = this.V;
            if (drawable != null) {
                drawable.setBounds(0, (-L5) / 2, L5, L5 / 2);
                this.V.setAlpha((int) (75.0f * f12));
                this.V.draw(canvas2);
            }
            Drawable drawable2 = this.W;
            if (drawable2 != null) {
                drawable2.setBounds(0, (-L5) / 2, L5, L5 / 2);
                this.W.setAlpha((int) (255.0f * f12));
                this.W.draw(canvas2);
            }
            RectF rectF8 = g0.P;
            rectF8.set((rectF5.left + g0.L(30.0f)) - g0.L(10.0f), rectF5.top, rectF5.left + g0.L(30.0f), rectF5.bottom);
            this.T.n(canvas2, rectF8, 2, 1.0f);
            canvas2.restore();
        } else {
            f12 = d2;
            f13 = 1.0f;
        }
        if (f12 < f13) {
            canvas2.save();
            float a11 = mcVar.a(0.1f);
            canvas2.scale(a11, a11, rectF6.centerX(), rectF6.centerY());
            float f26 = f13 - d;
            if (f26 > 0.0f) {
                this.S.c(((rectF6.left + g0.L(30.0f)) - (g0.L(12.0f) * d)) + (g0.L(32.0f) * f12), rectF6.centerY(), (f13 - f12) * f26, -1, canvas);
            }
            if (i7 > 0) {
                this.R.c((g0.L(12.0f) * f26) + rectF6.left + g0.L(30.0f) + (g0.L(32.0f) * f12), rectF6.centerY(), (f13 - f12) * d, -1, canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            canvas2.restore();
        }
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF3.centerX() + g0.L(2.0f), rectF3.centerY());
        float a12 = this.G.a(0.1f);
        canvas2.scale(a12, a12);
        float L6 = g0.L(6.0f);
        float L7 = g0.L(3.0f);
        float f27 = -L7;
        canvas2.drawLine(-L6, f27, 0.0f, L7, paint2);
        canvas.drawLine(0.0f, L7, L6, f27, paint2);
        canvas.restore();
        canvas.save();
        canvas.translate(rectF4.centerX() + g0.L(f13), rectF4.centerY());
        float a13 = this.J.a(0.1f);
        canvas.scale(a13, a13);
        canvas.drawCircle(0.0f, -g0.L(5.0f), g0.L(1.66f), paint);
        canvas.drawCircle(0.0f, 0.0f, g0.L(1.66f), paint);
        canvas.drawCircle(0.0f, g0.L(5.0f), g0.L(1.66f), paint);
        float d11 = this.Q.d(this.P);
        if (d11 > 0.0f) {
            canvas.translate(-g0.N(8.166f), g0.N(3.5f));
            float f28 = (d11 * 0.5f) + 0.5f;
            canvas.scale(f28, f28);
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.4f, -1);
            Paint paint4 = this.f24388e;
            paint4.setColor(r12);
            Path path2 = this.f24390f;
            canvas.drawPath(path2, paint4);
            float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.K) % 450)) / 450.0f;
            float f29 = 0.5f + currentTimeMillis;
            canvas.save();
            canvas.clipRect(-g0.L(5.0f), g0.T1(-g0.N(3.5f), g0.N(3.5f), currentTimeMillis), g0.L(5.0f), g0.T1(-g0.N(3.5f), g0.N(3.5f), f29));
            paint4.setColor(org.telegram.ui.ActionBar.m6.r1(f13, -1));
            canvas.drawPath(path2, paint4);
            canvas.restore();
            if (f29 > f13) {
                canvas.save();
                canvas.clipRect(-g0.L(5.0f), g0.T1(-g0.N(3.5f), g0.N(3.5f), 0.0f), g0.L(5.0f), g0.T1(-g0.N(3.5f), g0.N(3.5f), f29 - f13));
                paint4.setColor(org.telegram.ui.ActionBar.m6.r1(f13, -1));
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
            a(this.f24393h0).c(false);
            int b10 = b(motionEvent);
            this.f24393h0 = b10;
            a(b10).c(true);
        } else if (motionEvent.getAction() == 2) {
            if (b(motionEvent) != this.f24393h0) {
                this.f24393h0 = 0;
                a(0).c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            int i7 = this.f24393h0;
            if (i7 == 1 && (runnable3 = this.f24386c0) != null) {
                runnable3.run();
            } else if (i7 == 2 && (runnable2 = this.f24387d0) != null) {
                runnable2.run();
            } else if (i7 == 3 && (runnable = this.f24389e0) != null) {
                runnable.run();
            }
            a(this.f24393h0).c(false);
            this.f24393h0 = 0;
        } else if (motionEvent.getAction() == 3) {
            a(this.f24393h0).c(false);
            this.f24393h0 = 0;
        }
        if (this.f24393h0 != 0) {
            return true;
        }
        return false;
    }

    public void setBack(boolean z10) {
        this.L = z10;
        invalidate();
    }

    public void setDownloading(boolean z10) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        invalidate();
    }

    public void setInsets(RectF rectF) {
        this.h.set(rectF);
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.f24386c0 = runnable;
    }

    public void setOnCollapseClickListener(Runnable runnable) {
        this.f24387d0 = runnable;
    }

    public void setOnMenuClickListener(Runnable runnable) {
        this.f24389e0 = runnable;
    }

    public void setParentRenderNode(Object obj) {
        this.f24391f0 = obj;
    }

    public void setWebView(WebView webView) {
        this.f24392g0 = webView;
    }

    public void setInsets(Rect rect) {
        this.h.set(rect);
    }
}
