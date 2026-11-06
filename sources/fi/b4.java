package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.xq;
public abstract class b4 extends FrameLayout {
    public final RectF D;
    public final Paint E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.w5 J;
    public ly0 K;
    public final Path L;
    public boolean M;
    public final org.telegram.ui.Components.ca f11666a;
    public final w3 f11667b;
    public ArrayList f11668c;
    public ArrayList d;
    public ArrayList f11669e;
    public int f11670f;
    public final di.s7 h;
    public final ic f11671n;
    public final RectF f11672r;
    public final RectF f11673s;
    public final Paint f11674w;
    public ly0 f11675x;
    public final Path f11676y;

    public b4(Context context, di.b bVar, org.telegram.ui.Components.y9 y9Var) {
        super(context);
        this.f11668c = new ArrayList();
        this.d = new ArrayList();
        this.f11669e = new ArrayList();
        final o9 o9Var = (o9) this;
        this.h = new di.s7(o9Var, 25);
        this.f11671n = new ic(this);
        this.f11672r = new RectF();
        this.f11673s = new RectF();
        Paint paint = new Paint(1);
        this.f11674w = paint;
        Path path = new Path();
        this.f11676y = path;
        this.D = new RectF();
        this.E = new Paint(1);
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.J = new org.telegram.ui.Components.w5(this, 0L, 320L, xq.h);
        this.L = new Path();
        this.M = true;
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        this.f11666a = new org.telegram.ui.Components.ca(y9Var, this, 0, !o9Var.O.f12988r0.c());
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(44.0f));
        w3 w3Var = new w3(o9Var, context, p10.f24459s0, (u3) new v10() {
            @Override
            public final void a(Object obj, Object obj2) {
                boolean z9;
                int i7 = r2;
                int i10 = 0;
                o9 o9Var2 = o9Var;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        f41Var.M();
                        int i11 = 0;
                        for (int i12 = 0; i12 < o9Var2.d.size(); i12++) {
                            Integer num = (Integer) o9Var2.d.get(i12);
                            int intValue = num.intValue();
                            int i13 = z3.f13243b;
                            r31 K = r31.K(z3.class);
                            K.d = intValue;
                            K.G = (e7) o9Var2.f11668c.get(intValue);
                            K.f37611z = i11;
                            if (o9Var2.f11670f == intValue) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            K.L(z9);
                            K.f37593f = o9Var2.f11669e.contains(num);
                            K.D = new ai.v(o9Var2, intValue, 3);
                            arrayList.add(K);
                            if (o9Var2.f11669e.contains(num)) {
                                i11++;
                            }
                        }
                        f41Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        o9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i10 < size) {
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            o9Var2.d.add(Integer.valueOf(((r31) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(o9Var2.f11667b, new ai.i(o9Var2, 21));
                        return;
                }
            }
        }, new di.q4(o9Var, 12), bVar);
        this.f11667b = w3Var;
        w3Var.f35167f3.f33473r = false;
        w3Var.setClipToPadding(false);
        w3Var.setClipChildren(false);
        w3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        addView(w3Var, c8.ha.e(-2, 120, 85));
        w3Var.z1(true);
        w3Var.E1(new v10() {
            @Override
            public final void a(Object obj, Object obj2) {
                boolean z9;
                int i7 = r2;
                int i10 = 0;
                o9 o9Var2 = o9Var;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        f41Var.M();
                        int i11 = 0;
                        for (int i12 = 0; i12 < o9Var2.d.size(); i12++) {
                            Integer num = (Integer) o9Var2.d.get(i12);
                            int intValue = num.intValue();
                            int i13 = z3.f13243b;
                            r31 K = r31.K(z3.class);
                            K.d = intValue;
                            K.G = (e7) o9Var2.f11668c.get(intValue);
                            K.f37611z = i11;
                            if (o9Var2.f11670f == intValue) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            K.L(z9);
                            K.f37593f = o9Var2.f11669e.contains(num);
                            K.D = new ai.v(o9Var2, intValue, 3);
                            arrayList.add(K);
                            if (o9Var2.f11669e.contains(num)) {
                                i11++;
                            }
                        }
                        f41Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        o9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i10 < size) {
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            o9Var2.d.add(Integer.valueOf(((r31) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(o9Var2.f11667b, new ai.i(o9Var2, 21));
                        return;
                }
            }
        }, true);
        c(false, false);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
    }

    public final void a(Canvas canvas, RectF rectF, float f10, float f11) {
        int i7 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
        if (i7 < 0) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f11), 31);
        }
        o9 o9Var = (o9) this;
        boolean c10 = o9Var.O.f12988r0.c();
        org.telegram.ui.Components.ca caVar = this.f11666a;
        Paint paint = this.E;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = o9Var.N;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                caVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Paint[] d = caVar.d();
            if (d[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f10, f10, paint);
            } else {
                Paint paint2 = d[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f10, f10, paint2);
                }
                Paint paint3 = d[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f10, f10, paint3);
                }
                paint.setAlpha((int) (f11 * 51.0f));
                canvas.drawRoundRect(rectF, f10, f10, paint);
            }
        }
        if (i7 < 0) {
            canvas.restore();
        }
    }

    public final int b(int i7) {
        if (!this.d.contains(Integer.valueOf(i7))) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < Math.min(i7, this.f11668c.size()); i11++) {
            if (this.d.contains(Integer.valueOf(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public final void c(boolean z9, boolean z10) {
        int i7;
        float f10;
        float f11;
        if (this.M != z9) {
            this.M = z9;
            w3 w3Var = this.f11667b;
            w3Var.animate().cancel();
            float f12 = 0.0f;
            float f13 = 0.65f;
            if (z10) {
                w3Var.setVisibility(0);
                ViewPropertyAnimator animate = w3Var.animate();
                if (z9) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.65f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z9) {
                    f13 = 1.0f;
                }
                org.telegram.messenger.camera.q.l(scaleX.scaleY(f13).setListener(new ch.y(10, this, z9)).setUpdateListener(new v3(this, 0)), xq.h, 360L);
            } else {
                if (z9) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                w3Var.setVisibility(i7);
                if (z9) {
                    f12 = 1.0f;
                }
                w3Var.setAlpha(f12);
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.65f;
                }
                w3Var.setScaleX(f10);
                if (z9) {
                    f13 = 1.0f;
                }
                w3Var.setScaleY(f13);
                invalidate();
            }
            if (z9 && this.I) {
                this.I = false;
                invalidate();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a10 = this.f11671n.a(0.1f);
        canvas.save();
        RectF rectF = this.f11672r;
        rectF.set(getWidth() - org.telegram.messenger.g0.L(42.0f), getHeight() - org.telegram.messenger.g0.L(34.0f), getWidth() - org.telegram.messenger.g0.L(12.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
        RectF rectF2 = this.f11673s;
        rectF2.set(rectF);
        rectF2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.f11674w;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - org.telegram.messenger.g0.L(0.9f), paint);
        ly0 ly0Var = this.f11675x;
        w3 w3Var = this.f11667b;
        if (ly0Var != null) {
            ly0Var.c(rectF.centerX() - (this.f11675x.f35777c / 2.0f), rectF.centerY() - org.telegram.messenger.g0.L(0.6f), 1.0f - w3Var.getAlpha(), -1, canvas);
        }
        if (w3Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (w3Var.getAlpha() * 255.0f));
            canvas.drawPath(this.f11676y, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.K != null) {
            float d = this.J.d(this.I);
            if (d > 0.0f) {
                float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d);
                float k10 = this.K.k() + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(11.0f);
                float L = org.telegram.messenger.g0.L(32.0f);
                float f10 = rectF.right;
                float L2 = rectF.top - org.telegram.messenger.g0.L(9.66f);
                RectF rectF3 = this.F;
                rectF3.set(rectF.right - k10, (rectF.top - org.telegram.messenger.g0.L(9.66f)) - L, f10, L2);
                rectF3.set(rectF3.right - (rectF3.width() * T1), rectF3.bottom - (rectF3.height() * T1), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - d) * org.telegram.messenger.g0.L(4.0f));
                Path path = this.H;
                path.rewind();
                float L3 = org.telegram.messenger.g0.L(8.0f);
                float f11 = rectF3.left;
                float f12 = rectF3.top;
                RectF rectF4 = this.G;
                rectF4.set(f11, f12, f11 + L3, f12 + L3);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f13 = rectF3.right;
                float f14 = rectF3.top;
                rectF4.set(f13 - L3, f14, f13, f14 + L3);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f15 = rectF3.right;
                float f16 = rectF3.bottom;
                rectF4.set(f15 - L3, f16 - L3, f15, f16);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - org.telegram.messenger.g0.L(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - org.telegram.messenger.g0.L(14.5f), rectF3.bottom + org.telegram.messenger.g0.L(5.66f));
                path.lineTo(rectF3.right - org.telegram.messenger.g0.L(21.0f), rectF3.bottom);
                float f17 = rectF3.left;
                float f18 = rectF3.bottom;
                rectF4.set(f17, f18 - L3, f17 + L3, f18);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += org.telegram.messenger.g0.L(5.66f);
                canvas.save();
                canvas.clipPath(path);
                a(canvas, rectF3, L3, d);
                canvas.restore();
                canvas.save();
                canvas.scale(T1, T1, rectF3.right, rectF3.bottom);
                this.K.c((rectF.right - k10) + org.telegram.messenger.g0.L(11.0f), (rectF.top - org.telegram.messenger.g0.L(9.66f)) - (L / 2.0f), d, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        w3 w3Var = this.f11667b;
        if (view == w3Var) {
            float x10 = w3Var.getX();
            float y10 = w3Var.getY();
            float x11 = w3Var.getX() + w3Var.getWidth();
            float y11 = w3Var.getY() + w3Var.getHeight();
            RectF rectF = this.D;
            rectF.set(x10, y10, x11, y11);
            org.telegram.messenger.g0.j3(rectF, w3Var.getScaleX(), w3Var.getPivotX() + w3Var.getX(), w3Var.getPivotY() + w3Var.getY());
            a(canvas, rectF, org.telegram.messenger.g0.L(10.0f), w3Var.getAlpha());
            Path path = this.L;
            path.rewind();
            path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        w3 w3Var = this.f11667b;
        w3Var.setPivotX(w3Var.getWidth() - org.telegram.messenger.g0.L(15.0f));
        w3Var.setPivotY(w3Var.getHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.f11672r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        ic icVar = this.f11671n;
        if (action == 0) {
            icVar.c(contains);
            if (this.M && !contains) {
                if (!this.D.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                icVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (icVar.f34592i) {
                c(!this.M, true);
            }
            icVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            icVar.c(false);
        }
        if (!icVar.f34592i && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i7) {
        if (this.f11670f == i7) {
            return;
        }
        this.f11670f = i7;
        org.telegram.messenger.g0.d0(this.f11667b, new t3(this, i7, 0));
    }
}
