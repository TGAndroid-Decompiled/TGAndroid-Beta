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
public abstract class nj7 extends FrameLayout {
    public final RectF E;
    public final Paint F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public boolean J;
    public final mm K;
    public pkb L;
    public final Path M;
    public boolean N;
    public final xl0 a;
    public final wa b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final ge7 h;
    public final v41 n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public pkb x;
    public final Path y;

    public nj7(Activity activity, x53 x53Var, tl0 tl0Var) {
        super(activity);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final oab oabVar = (oab) this;
        this.h = new ge7(oabVar, (byte) 2);
        this.n = new v41(this);
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
        this.K = new mm(this, 0L, 320L, k43.h);
        this.M = new Path();
        this.N = true;
        path.rewind();
        path.moveTo(-hl.L(4.33f), -hl.L(4.33f));
        path.lineTo(hl.L(4.33f), hl.L(4.33f));
        path.moveTo(-hl.L(4.33f), hl.L(4.33f));
        path.lineTo(hl.L(4.33f), -hl.L(4.33f));
        this.a = new xl0(tl0Var, this, 0, !oabVar.P.s0.c());
        setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(44.0f));
        wa waVar = new wa(oabVar, activity, yac.t0, (ij7) new icc() {
            @Override
            public final void a(Object obj, Object obj2) {
                boolean z;
                byte b = r2;
                int i = 0;
                oab oabVar2 = oabVar;
                switch (b) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l9c l9cVar = (l9c) obj2;
                        l9cVar.M();
                        int i2 = 0;
                        for (int i3 = 0; i3 < oabVar2.d.size(); i3++) {
                            Integer num = (Integer) oabVar2.d.get(i3);
                            int intValue = num.intValue();
                            int i4 = lj7.b;
                            b8c K = b8c.K(lj7.class);
                            K.d = intValue;
                            K.H = (c8b) oabVar2.c.get(intValue);
                            K.A = i2;
                            if (oabVar2.f == intValue) {
                                z = true;
                            } else {
                                z = false;
                            }
                            K.L(z);
                            K.f = oabVar2.e.contains(num);
                            K.E = new w0(oabVar2, intValue, (byte) 12);
                            arrayList.add(K);
                            if (oabVar2.e.contains(num)) {
                                i2++;
                            }
                        }
                        l9cVar.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        oabVar2.d.clear();
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj3 = arrayList2.get(i);
                            i++;
                            oabVar2.d.add(Integer.valueOf(((b8c) obj3).d));
                        }
                        hl.d0(oabVar2.b, new ji7(oabVar2, (byte) 1));
                        return;
                }
            }
        }, new bm6(oabVar, (byte) 15), x53Var);
        this.b = waVar;
        waVar.g3.r = false;
        waVar.setClipToPadding(false);
        waVar.setClipChildren(false);
        waVar.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        addView(waVar, tre.e(-2, 120, 85));
        waVar.A1(true);
        waVar.F1(new icc() {
            @Override
            public final void a(Object obj, Object obj2) {
                boolean z;
                byte b = r2;
                int i = 0;
                oab oabVar2 = oabVar;
                switch (b) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l9c l9cVar = (l9c) obj2;
                        l9cVar.M();
                        int i2 = 0;
                        for (int i3 = 0; i3 < oabVar2.d.size(); i3++) {
                            Integer num = (Integer) oabVar2.d.get(i3);
                            int intValue = num.intValue();
                            int i4 = lj7.b;
                            b8c K = b8c.K(lj7.class);
                            K.d = intValue;
                            K.H = (c8b) oabVar2.c.get(intValue);
                            K.A = i2;
                            if (oabVar2.f == intValue) {
                                z = true;
                            } else {
                                z = false;
                            }
                            K.L(z);
                            K.f = oabVar2.e.contains(num);
                            K.E = new w0(oabVar2, intValue, (byte) 12);
                            arrayList.add(K);
                            if (oabVar2.e.contains(num)) {
                                i2++;
                            }
                        }
                        l9cVar.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        oabVar2.d.clear();
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj3 = arrayList2.get(i);
                            i++;
                            oabVar2.d.add(Integer.valueOf(((b8c) obj3).d));
                        }
                        hl.d0(oabVar2.b, new ji7(oabVar2, (byte) 1));
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
        oab oabVar = (oab) this;
        boolean c = oabVar.P.s0.c();
        Paint paint = this.F;
        xl0 xl0Var = this.a;
        if (c) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = oabVar.O;
                path.rewind();
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                xl0Var.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            Paint[] d = xl0Var.d();
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
            wa waVar = this.b;
            waVar.animate().cancel();
            float f3 = 0.0f;
            float f4 = 0.65f;
            if (z2) {
                waVar.setVisibility(0);
                ViewPropertyAnimator animate = waVar.animate();
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
                ik8.t(scaleX.scaleY(f4).setListener(new gf4((byte) 16, this, z)).setUpdateListener(new ch4(this, (byte) 26)), k43.h, 360L);
            } else {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                waVar.setVisibility(i);
                if (z) {
                    f3 = 1.0f;
                }
                waVar.setAlpha(f3);
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.65f;
                }
                waVar.setScaleX(f);
                if (z) {
                    f4 = 1.0f;
                }
                waVar.setScaleY(f4);
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
        rectF.set(getWidth() - hl.L(42.0f), getHeight() - hl.L(34.0f), getWidth() - hl.L(12.0f), getHeight() - hl.L(4.0f));
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.inset(-hl.L(8.0f), -hl.L(8.0f));
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.w;
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - hl.L(0.9f), paint);
        pkb pkbVar = this.x;
        wa waVar = this.b;
        if (pkbVar != null) {
            pkbVar.c(rectF.centerX() - (this.x.c / 2.0f), rectF.centerY() - hl.L(0.6f), 1.0f - waVar.getAlpha(), -1, canvas);
        }
        if (waVar.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (waVar.getAlpha() * 255.0f));
            canvas.drawPath(this.y, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.L != null) {
            float d = this.K.d(this.J);
            if (d > 0.0f) {
                float R1 = hl.R1(0.6f, 1.0f, d);
                float j = this.L.j() + hl.L(11.0f) + hl.L(11.0f);
                float L = hl.L(32.0f);
                float f = rectF.right;
                float L2 = rectF.top - hl.L(9.66f);
                RectF rectF3 = this.G;
                rectF3.set(rectF.right - j, (rectF.top - hl.L(9.66f)) - L, f, L2);
                rectF3.set(rectF3.right - (rectF3.width() * R1), rectF3.bottom - (rectF3.height() * R1), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - d) * hl.L(4.0f));
                Path path = this.I;
                path.rewind();
                float L3 = hl.L(8.0f);
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
                path.lineTo(rectF3.right - hl.L(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - hl.L(14.5f), rectF3.bottom + hl.L(5.66f));
                path.lineTo(rectF3.right - hl.L(21.0f), rectF3.bottom);
                float f8 = rectF3.left;
                float f9 = rectF3.bottom;
                rectF4.set(f8, f9 - L3, f8 + L3, f9);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += hl.L(5.66f);
                canvas.save();
                canvas.clipPath(path);
                a(canvas, rectF3, L3, d);
                canvas.restore();
                canvas.save();
                canvas.scale(R1, R1, rectF3.right, rectF3.bottom);
                this.L.c((rectF.right - j) + hl.L(11.0f), (rectF.top - hl.L(9.66f)) - (L / 2.0f), d, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        wa waVar = this.b;
        if (view == waVar) {
            float x = waVar.getX();
            float y = waVar.getY();
            float x2 = waVar.getX() + waVar.getWidth();
            float y2 = waVar.getY() + waVar.getHeight();
            RectF rectF = this.E;
            rectF.set(x, y, x2, y2);
            hl.e3(rectF, waVar.getScaleX(), waVar.getPivotX() + waVar.getX(), waVar.getPivotY() + waVar.getY());
            a(canvas, rectF, hl.L(10.0f), waVar.getAlpha());
            Path path = this.M;
            path.rewind();
            path.addRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), Path.Direction.CW);
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
        wa waVar = this.b;
        waVar.setPivotX(waVar.getWidth() - hl.L(15.0f));
        waVar.setPivotY(waVar.getHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        v41 v41Var = this.n;
        if (action == 0) {
            v41Var.c(contains);
            if (this.N && !contains) {
                if (!this.E.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                v41Var.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (v41Var.i) {
                c(!this.N, true);
            }
            v41Var.c(false);
        } else if (motionEvent.getAction() == 3) {
            v41Var.c(false);
        }
        if (!v41Var.i && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        hl.d0(this.b, new jq0(this, i, (byte) 2));
    }
}
