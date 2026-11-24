package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class gj7 extends FrameLayout {
    public final RectF E;
    public final Paint F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public boolean J;
    public final ln K;
    public uib L;
    public final Path M;
    public boolean N;
    public final wm0 a;
    public final va b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final pg6 h;
    public final u51 n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public uib x;
    public final Path y;

    public gj7(Activity activity, r63 r63Var, sm0 sm0Var) {
        super(activity);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final r8b r8bVar = (r8b) this;
        this.h = new pg6(r8bVar, (byte) 26);
        this.n = new u51(this);
        this.r = new RectF();
        this.s = new RectF();
        Paint paint = new Paint(1);
        this.w = paint;
        Path path = new Path();
        this.y = path;
        this.E = new RectF();
        this.F = new Paint(1);
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Path();
        this.K = new ln(this, 0L, 320L, d53.h);
        this.M = new Path();
        this.N = true;
        path.rewind();
        path.moveTo(-gm.L(4.33f), -gm.L(4.33f));
        path.lineTo(gm.L(4.33f), gm.L(4.33f));
        path.moveTo(-gm.L(4.33f), gm.L(4.33f));
        path.lineTo(gm.L(4.33f), -gm.L(4.33f));
        this.a = new wm0(sm0Var, this, 0, !r8bVar.P.s0.c());
        setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(44.0f));
        va vaVar = new va(r8bVar, activity, z8c.t0, (bj7) new jac() {
            @Override
            public final void a(Object obj, Object obj2) {
                boolean z;
                byte b = r2;
                int i = 0;
                r8b r8bVar2 = r8bVar;
                switch (b) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l7c l7cVar = (l7c) obj2;
                        l7cVar.M();
                        int i2 = 0;
                        for (int i3 = 0; i3 < r8bVar2.d.size(); i3++) {
                            Integer num = (Integer) r8bVar2.d.get(i3);
                            int intValue = num.intValue();
                            int i4 = ej7.b;
                            c6c K = c6c.K(ej7.class);
                            K.d = intValue;
                            K.H = (g6b) r8bVar2.c.get(intValue);
                            K.A = i2;
                            if (r8bVar2.f == intValue) {
                                z = true;
                            } else {
                                z = false;
                            }
                            K.L(z);
                            K.f = r8bVar2.e.contains(num);
                            K.E = new v0(r8bVar2, intValue, (byte) 11);
                            arrayList.add(K);
                            if (r8bVar2.e.contains(num)) {
                                i2++;
                            }
                        }
                        l7cVar.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        r8bVar2.d.clear();
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj3 = arrayList2.get(i);
                            i++;
                            r8bVar2.d.add(Integer.valueOf(((c6c) obj3).d));
                        }
                        gm.d0(r8bVar2.b, new ci7(r8bVar2, (byte) 1));
                        return;
                }
            }
        }, new cj6(r8bVar, (byte) 14), r63Var);
        this.b = vaVar;
        vaVar.g3.r = false;
        vaVar.setClipToPadding(false);
        vaVar.setClipChildren(false);
        vaVar.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        addView(vaVar, qoe.e(-2, 120, 85));
        vaVar.z1(true);
        vaVar.E1(new jac() {
            @Override
            public final void a(Object obj, Object obj2) {
                boolean z;
                byte b = r2;
                int i = 0;
                r8b r8bVar2 = r8bVar;
                switch (b) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l7c l7cVar = (l7c) obj2;
                        l7cVar.M();
                        int i2 = 0;
                        for (int i3 = 0; i3 < r8bVar2.d.size(); i3++) {
                            Integer num = (Integer) r8bVar2.d.get(i3);
                            int intValue = num.intValue();
                            int i4 = ej7.b;
                            c6c K = c6c.K(ej7.class);
                            K.d = intValue;
                            K.H = (g6b) r8bVar2.c.get(intValue);
                            K.A = i2;
                            if (r8bVar2.f == intValue) {
                                z = true;
                            } else {
                                z = false;
                            }
                            K.L(z);
                            K.f = r8bVar2.e.contains(num);
                            K.E = new v0(r8bVar2, intValue, (byte) 11);
                            arrayList.add(K);
                            if (r8bVar2.e.contains(num)) {
                                i2++;
                            }
                        }
                        l7cVar.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        r8bVar2.d.clear();
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj3 = arrayList2.get(i);
                            i++;
                            r8bVar2.d.add(Integer.valueOf(((c6c) obj3).d));
                        }
                        gm.d0(r8bVar2.b, new ci7(r8bVar2, (byte) 1));
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

    public final void a(Canvas canvas, RectF rectF, float f, float f2) {
        int i = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        if (i < 0) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f2), 31);
        }
        r8b r8bVar = (r8b) this;
        boolean c = r8bVar.P.s0.c();
        Paint paint = this.F;
        wm0 wm0Var = this.a;
        if (c) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = r8bVar.O;
                path.rewind();
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                wm0Var.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            Paint[] d = wm0Var.d();
            if (d[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                Paint paint2 = d[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f, f, paint2);
                }
                Paint paint3 = d[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f, f, paint3);
                }
                paint.setAlpha((int) (f2 * 51.0f));
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        }
        if (i < 0) {
            canvas.restore();
        }
    }

    public final int b(int i) {
        if (!this.d.contains(Integer.valueOf(i))) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < Math.min(i, this.c.size()); i3++) {
            if (this.d.contains(Integer.valueOf(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public final void c(boolean z, boolean z2) {
        int i;
        float f;
        float f2;
        if (this.N != z) {
            this.N = z;
            va vaVar = this.b;
            vaVar.animate().cancel();
            float f3 = 0.0f;
            float f4 = 0.65f;
            if (z2) {
                vaVar.setVisibility(0);
                ViewPropertyAnimator animate = vaVar.animate();
                if (z) {
                    f3 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f3);
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.65f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f2);
                if (z) {
                    f4 = 1.0f;
                }
                wi8.t(scaleX.scaleY(f4).setListener(new jf4((byte) 16, this, z)).setUpdateListener(new fh4(this, (byte) 26)), d53.h, 360L);
            } else {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                vaVar.setVisibility(i);
                if (z) {
                    f3 = 1.0f;
                }
                vaVar.setAlpha(f3);
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.65f;
                }
                vaVar.setScaleX(f);
                if (z) {
                    f4 = 1.0f;
                }
                vaVar.setScaleY(f4);
                invalidate();
            }
            if (z && this.J) {
                this.J = false;
                invalidate();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a = this.n.a(0.1f);
        canvas.save();
        RectF rectF = this.r;
        rectF.set(getWidth() - gm.L(42.0f), getHeight() - gm.L(34.0f), getWidth() - gm.L(12.0f), getHeight() - gm.L(4.0f));
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.inset(-gm.L(8.0f), -gm.L(8.0f));
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.w;
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - gm.L(0.9f), paint);
        uib uibVar = this.x;
        va vaVar = this.b;
        if (uibVar != null) {
            uibVar.c(rectF.centerX() - (this.x.c / 2.0f), rectF.centerY() - gm.L(0.6f), 1.0f - vaVar.getAlpha(), -1, canvas);
        }
        if (vaVar.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (vaVar.getAlpha() * 255.0f));
            canvas.drawPath(this.y, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.L != null) {
            float d = this.K.d(this.J);
            if (d > 0.0f) {
                float R1 = gm.R1(0.6f, 1.0f, d);
                float j = this.L.j() + gm.L(11.0f) + gm.L(11.0f);
                float L = gm.L(32.0f);
                float f = rectF.right;
                float L2 = rectF.top - gm.L(9.66f);
                RectF rectF3 = this.G;
                rectF3.set(rectF.right - j, (rectF.top - gm.L(9.66f)) - L, f, L2);
                rectF3.set(rectF3.right - (rectF3.width() * R1), rectF3.bottom - (rectF3.height() * R1), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - d) * gm.L(4.0f));
                Path path = this.I;
                path.rewind();
                float L3 = gm.L(8.0f);
                float f2 = rectF3.left;
                float f3 = rectF3.top;
                RectF rectF4 = this.H;
                rectF4.set(f2, f3, f2 + L3, f3 + L3);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f4 = rectF3.right;
                float f5 = rectF3.top;
                rectF4.set(f4 - L3, f5, f4, f5 + L3);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f6 = rectF3.right;
                float f7 = rectF3.bottom;
                rectF4.set(f6 - L3, f7 - L3, f6, f7);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - gm.L(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - gm.L(14.5f), rectF3.bottom + gm.L(5.66f));
                path.lineTo(rectF3.right - gm.L(21.0f), rectF3.bottom);
                float f8 = rectF3.left;
                float f9 = rectF3.bottom;
                rectF4.set(f8, f9 - L3, f8 + L3, f9);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += gm.L(5.66f);
                canvas.save();
                canvas.clipPath(path);
                a(canvas, rectF3, L3, d);
                canvas.restore();
                canvas.save();
                canvas.scale(R1, R1, rectF3.right, rectF3.bottom);
                this.L.c((rectF.right - j) + gm.L(11.0f), (rectF.top - gm.L(9.66f)) - (L / 2.0f), d, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        va vaVar = this.b;
        if (view == vaVar) {
            float x = vaVar.getX();
            float y = vaVar.getY();
            float x2 = vaVar.getX() + vaVar.getWidth();
            float y2 = vaVar.getY() + vaVar.getHeight();
            RectF rectF = this.E;
            rectF.set(x, y, x2, y2);
            gm.e3(rectF, vaVar.getScaleX(), vaVar.getPivotX() + vaVar.getX(), vaVar.getPivotY() + vaVar.getY());
            a(canvas, rectF, gm.L(10.0f), vaVar.getAlpha());
            Path path = this.M;
            path.rewind();
            path.addRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        va vaVar = this.b;
        vaVar.setPivotX(vaVar.getWidth() - gm.L(15.0f));
        vaVar.setPivotY(vaVar.getHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        u51 u51Var = this.n;
        if (action == 0) {
            u51Var.c(contains);
            if (this.N && !contains) {
                if (!this.E.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                u51Var.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (u51Var.i) {
                c(!this.N, true);
            }
            u51Var.c(false);
        } else if (motionEvent.getAction() == 3) {
            u51Var.c(false);
        }
        if (!u51Var.i && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        gm.d0(this.b, new jr0(this, i, (byte) 2));
    }
}
