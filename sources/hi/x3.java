package hi;

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
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.p41;
public abstract class x3 extends FrameLayout {
    public final RectF E;
    public final Paint F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public boolean J;
    public final org.telegram.ui.Components.u5 K;
    public oy0 L;
    public final Path M;
    public boolean N;
    public final org.telegram.ui.Components.y9 f15325a;
    public final bi.v3 f15326b;
    public ArrayList f15327c;
    public ArrayList d;
    public ArrayList f15328e;
    public int f15329f;
    public final e1 h;
    public final dc f15330n;
    public final RectF f15331r;
    public final RectF f15332s;
    public final Paint f15333w;
    public oy0 f15334x;
    public final Path f15335y;

    public x3(Context context, fi.b bVar, org.telegram.ui.Components.u9 u9Var) {
        super(context);
        this.f15327c = new ArrayList();
        this.d = new ArrayList();
        this.f15328e = new ArrayList();
        final l9 l9Var = (l9) this;
        this.h = new e1(l9Var, 8);
        this.f15330n = new dc(this);
        this.f15331r = new RectF();
        this.f15332s = new RectF();
        Paint paint = new Paint(1);
        this.f15333w = paint;
        Path path = new Path();
        this.f15335y = path;
        this.E = new RectF();
        this.F = new Paint(1);
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Path();
        this.K = new org.telegram.ui.Components.u5(this, 0L, 320L, er.h);
        this.M = new Path();
        this.N = true;
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        this.f15325a = new org.telegram.ui.Components.y9(u9Var, this, 0, !l9Var.P.f15093s0.c());
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(44.0f));
        bi.v3 v3Var = new bi.v3(l9Var, context, m10.f24940t0, (s3) new s10() {
            @Override
            public final void a(Object obj, Object obj2) {
                boolean z10;
                int i7 = r2;
                int i10 = 0;
                l9 l9Var2 = l9Var;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        p41 p41Var = (p41) obj2;
                        p41Var.M();
                        int i11 = 0;
                        for (int i12 = 0; i12 < l9Var2.d.size(); i12++) {
                            Integer num = (Integer) l9Var2.d.get(i12);
                            int intValue = num.intValue();
                            int i13 = v3.f15216b;
                            b41 K = b41.K(v3.class);
                            K.d = intValue;
                            K.G = (d7) l9Var2.f15327c.get(intValue);
                            K.f33197z = i11;
                            if (l9Var2.f15329f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            K.L(z10);
                            K.f33179f = l9Var2.f15328e.contains(num);
                            K.D = new ci.q(l9Var2, intValue, 3);
                            arrayList.add(K);
                            if (l9Var2.f15328e.contains(num)) {
                                i11++;
                            }
                        }
                        p41Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        l9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i10 < size) {
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            l9Var2.d.add(Integer.valueOf(((b41) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(l9Var2.f15326b, new ai.g0(l9Var2, 25));
                        return;
                }
            }
        }, new di.z6(l9Var, 19), bVar);
        this.f15326b = v3Var;
        v3Var.f39892g3.f38199r = false;
        v3Var.setClipToPadding(false);
        v3Var.setClipChildren(false);
        v3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        addView(v3Var, c8.ja.e(-2, 120, 85));
        v3Var.z1(true);
        v3Var.E1(new s10() {
            @Override
            public final void a(Object obj, Object obj2) {
                boolean z10;
                int i7 = r2;
                int i10 = 0;
                l9 l9Var2 = l9Var;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        p41 p41Var = (p41) obj2;
                        p41Var.M();
                        int i11 = 0;
                        for (int i12 = 0; i12 < l9Var2.d.size(); i12++) {
                            Integer num = (Integer) l9Var2.d.get(i12);
                            int intValue = num.intValue();
                            int i13 = v3.f15216b;
                            b41 K = b41.K(v3.class);
                            K.d = intValue;
                            K.G = (d7) l9Var2.f15327c.get(intValue);
                            K.f33197z = i11;
                            if (l9Var2.f15329f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            K.L(z10);
                            K.f33179f = l9Var2.f15328e.contains(num);
                            K.D = new ci.q(l9Var2, intValue, 3);
                            arrayList.add(K);
                            if (l9Var2.f15328e.contains(num)) {
                                i11++;
                            }
                        }
                        p41Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        l9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i10 < size) {
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            l9Var2.d.add(Integer.valueOf(((b41) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(l9Var2.f15326b, new ai.g0(l9Var2, 25));
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
        l9 l9Var = (l9) this;
        boolean c10 = l9Var.P.f15093s0.c();
        org.telegram.ui.Components.y9 y9Var = this.f15325a;
        Paint paint = this.F;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = l9Var.O;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                y9Var.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Paint[] d = y9Var.d();
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
        for (int i11 = 0; i11 < Math.min(i7, this.f15327c.size()); i11++) {
            if (this.d.contains(Integer.valueOf(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public final void c(boolean z10, boolean z11) {
        int i7;
        float f10;
        float f11;
        if (this.N != z10) {
            this.N = z10;
            bi.v3 v3Var = this.f15326b;
            v3Var.animate().cancel();
            float f12 = 0.0f;
            float f13 = 0.65f;
            if (z11) {
                v3Var.setVisibility(0);
                ViewPropertyAnimator animate = v3Var.animate();
                if (z10) {
                    f12 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.65f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z10) {
                    f13 = 1.0f;
                }
                i20.n(scaleX.scaleY(f13).setListener(new bi.v4(11, this, z10)).setUpdateListener(new j3(this, 1)), er.h, 360L);
            } else {
                if (z10) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                v3Var.setVisibility(i7);
                if (z10) {
                    f12 = 1.0f;
                }
                v3Var.setAlpha(f12);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.65f;
                }
                v3Var.setScaleX(f10);
                if (z10) {
                    f13 = 1.0f;
                }
                v3Var.setScaleY(f13);
                invalidate();
            }
            if (z10 && this.J) {
                this.J = false;
                invalidate();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a10 = this.f15330n.a(0.1f);
        canvas.save();
        RectF rectF = this.f15331r;
        rectF.set(getWidth() - org.telegram.messenger.g0.L(42.0f), getHeight() - org.telegram.messenger.g0.L(34.0f), getWidth() - org.telegram.messenger.g0.L(12.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
        RectF rectF2 = this.f15332s;
        rectF2.set(rectF);
        rectF2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.f15333w;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - org.telegram.messenger.g0.L(0.9f), paint);
        oy0 oy0Var = this.f15334x;
        bi.v3 v3Var = this.f15326b;
        if (oy0Var != null) {
            oy0Var.c(rectF.centerX() - (this.f15334x.f38103c / 2.0f), rectF.centerY() - org.telegram.messenger.g0.L(0.6f), 1.0f - v3Var.getAlpha(), -1, canvas);
        }
        if (v3Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (v3Var.getAlpha() * 255.0f));
            canvas.drawPath(this.f15335y, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.L != null) {
            float d = this.K.d(this.J);
            if (d > 0.0f) {
                float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d);
                float k10 = this.L.k() + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(11.0f);
                float L = org.telegram.messenger.g0.L(32.0f);
                float f10 = rectF.right;
                float L2 = rectF.top - org.telegram.messenger.g0.L(9.66f);
                RectF rectF3 = this.G;
                rectF3.set(rectF.right - k10, (rectF.top - org.telegram.messenger.g0.L(9.66f)) - L, f10, L2);
                rectF3.set(rectF3.right - (rectF3.width() * T1), rectF3.bottom - (rectF3.height() * T1), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - d) * org.telegram.messenger.g0.L(4.0f));
                Path path = this.I;
                path.rewind();
                float L3 = org.telegram.messenger.g0.L(8.0f);
                float f11 = rectF3.left;
                float f12 = rectF3.top;
                RectF rectF4 = this.H;
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
                this.L.c((rectF.right - k10) + org.telegram.messenger.g0.L(11.0f), (rectF.top - org.telegram.messenger.g0.L(9.66f)) - (L / 2.0f), d, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        bi.v3 v3Var = this.f15326b;
        if (view == v3Var) {
            float x10 = v3Var.getX();
            float y10 = v3Var.getY();
            float x11 = v3Var.getX() + v3Var.getWidth();
            float y11 = v3Var.getY() + v3Var.getHeight();
            RectF rectF = this.E;
            rectF.set(x10, y10, x11, y11);
            org.telegram.messenger.g0.j3(rectF, v3Var.getScaleX(), v3Var.getPivotX() + v3Var.getX(), v3Var.getPivotY() + v3Var.getY());
            a(canvas, rectF, org.telegram.messenger.g0.L(10.0f), v3Var.getAlpha());
            Path path = this.M;
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        bi.v3 v3Var = this.f15326b;
        v3Var.setPivotX(v3Var.getWidth() - org.telegram.messenger.g0.L(15.0f));
        v3Var.setPivotY(v3Var.getHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.f15331r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        dc dcVar = this.f15330n;
        if (action == 0) {
            dcVar.c(contains);
            if (this.N && !contains) {
                if (!this.E.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                dcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (dcVar.f33904i) {
                c(!this.N, true);
            }
            dcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            dcVar.c(false);
        }
        if (!dcVar.f33904i && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i7) {
        if (this.f15329f == i7) {
            return;
        }
        this.f15329f = i7;
        org.telegram.messenger.g0.d0(this.f15326b, new ai.y1(this, i7, 1));
    }
}
