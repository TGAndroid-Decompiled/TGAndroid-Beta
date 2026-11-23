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
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.wy0;
public abstract class g4 extends FrameLayout {
    public final RectF E;
    public final Paint F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public boolean J;
    public final org.telegram.ui.Components.c6 K;
    public wy0 L;
    public final Path M;
    public boolean N;
    public final org.telegram.ui.Components.fa f14528a;
    public final bi.i6 f14529b;
    public ArrayList f14530c;
    public ArrayList d;
    public ArrayList f14531e;
    public int f14532f;
    public final w h;
    public final org.telegram.ui.Components.lc f14533n;
    public final RectF f14534r;
    public final RectF f14535s;
    public final Paint f14536w;
    public wy0 f14537x;
    public final Path f14538y;

    public g4(Context context, fi.b bVar, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.f14530c = new ArrayList();
        this.d = new ArrayList();
        this.f14531e = new ArrayList();
        final ga gaVar = (ga) this;
        this.h = new w(gaVar, 13);
        this.f14533n = new org.telegram.ui.Components.lc(this);
        this.f14534r = new RectF();
        this.f14535s = new RectF();
        Paint paint = new Paint(1);
        this.f14536w = paint;
        Path path = new Path();
        this.f14538y = path;
        this.E = new RectF();
        this.F = new Paint(1);
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Path();
        this.K = new org.telegram.ui.Components.c6(this, 0L, 320L, kr.h);
        this.M = new Path();
        this.N = true;
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        this.f14528a = new org.telegram.ui.Components.fa(baVar, this, 0, !gaVar.P.f15112s0.c());
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(44.0f));
        bi.i6 i6Var = new bi.i6(gaVar, context, i10.f24637t0, (b4) new p10() {
            @Override
            public final void a(Object obj, Object obj2) {
                boolean z10;
                int i7 = r2;
                int i10 = 0;
                ga gaVar2 = gaVar;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        b51Var.M();
                        int i11 = 0;
                        for (int i12 = 0; i12 < gaVar2.d.size(); i12++) {
                            Integer num = (Integer) gaVar2.d.get(i12);
                            int intValue = num.intValue();
                            int i13 = e4.f14367b;
                            n41 K = n41.K(e4.class);
                            K.d = intValue;
                            K.H = (x7) gaVar2.f14530c.get(intValue);
                            K.A = i11;
                            if (gaVar2.f14532f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            K.L(z10);
                            K.f37649f = gaVar2.f14531e.contains(num);
                            K.E = new ci.q(gaVar2, intValue, 3);
                            arrayList.add(K);
                            if (gaVar2.f14531e.contains(num)) {
                                i11++;
                            }
                        }
                        b51Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        gaVar2.d.clear();
                        int size = arrayList2.size();
                        while (i10 < size) {
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            gaVar2.d.add(Integer.valueOf(((n41) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(gaVar2.f14529b, new ai.d0(gaVar2, 26));
                        return;
                }
            }
        }, new di.v6(gaVar, 22), bVar);
        this.f14529b = i6Var;
        i6Var.f35323g3.f33631r = false;
        i6Var.setClipToPadding(false);
        i6Var.setClipChildren(false);
        i6Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        addView(i6Var, c8.na.e(-2, 120, 85));
        i6Var.z1(true);
        i6Var.E1(new p10() {
            @Override
            public final void a(Object obj, Object obj2) {
                boolean z10;
                int i7 = r2;
                int i10 = 0;
                ga gaVar2 = gaVar;
                switch (i7) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        b51Var.M();
                        int i11 = 0;
                        for (int i12 = 0; i12 < gaVar2.d.size(); i12++) {
                            Integer num = (Integer) gaVar2.d.get(i12);
                            int intValue = num.intValue();
                            int i13 = e4.f14367b;
                            n41 K = n41.K(e4.class);
                            K.d = intValue;
                            K.H = (x7) gaVar2.f14530c.get(intValue);
                            K.A = i11;
                            if (gaVar2.f14532f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            K.L(z10);
                            K.f37649f = gaVar2.f14531e.contains(num);
                            K.E = new ci.q(gaVar2, intValue, 3);
                            arrayList.add(K);
                            if (gaVar2.f14531e.contains(num)) {
                                i11++;
                            }
                        }
                        b51Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        gaVar2.d.clear();
                        int size = arrayList2.size();
                        while (i10 < size) {
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            gaVar2.d.add(Integer.valueOf(((n41) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(gaVar2.f14529b, new ai.d0(gaVar2, 26));
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
        ga gaVar = (ga) this;
        boolean c10 = gaVar.P.f15112s0.c();
        org.telegram.ui.Components.fa faVar = this.f14528a;
        Paint paint = this.F;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = gaVar.O;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                faVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Paint[] d = faVar.d();
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
        for (int i11 = 0; i11 < Math.min(i7, this.f14530c.size()); i11++) {
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
            bi.i6 i6Var = this.f14529b;
            i6Var.animate().cancel();
            float f12 = 0.0f;
            float f13 = 0.65f;
            if (z11) {
                i6Var.setVisibility(0);
                ViewPropertyAnimator animate = i6Var.animate();
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
                m10.o(scaleX.scaleY(f13).setListener(new bi.j7(11, this, z10)).setUpdateListener(new s3(this, 1)), kr.h, 360L);
            } else {
                if (z10) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                i6Var.setVisibility(i7);
                if (z10) {
                    f12 = 1.0f;
                }
                i6Var.setAlpha(f12);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.65f;
                }
                i6Var.setScaleX(f10);
                if (z10) {
                    f13 = 1.0f;
                }
                i6Var.setScaleY(f13);
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
        float a10 = this.f14533n.a(0.1f);
        canvas.save();
        RectF rectF = this.f14534r;
        rectF.set(getWidth() - org.telegram.messenger.g0.L(42.0f), getHeight() - org.telegram.messenger.g0.L(34.0f), getWidth() - org.telegram.messenger.g0.L(12.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
        RectF rectF2 = this.f14535s;
        rectF2.set(rectF);
        rectF2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.f14536w;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - org.telegram.messenger.g0.L(0.9f), paint);
        wy0 wy0Var = this.f14537x;
        bi.i6 i6Var = this.f14529b;
        if (wy0Var != null) {
            wy0Var.c(rectF.centerX() - (this.f14537x.f41763c / 2.0f), rectF.centerY() - org.telegram.messenger.g0.L(0.6f), 1.0f - i6Var.getAlpha(), -1, canvas);
        }
        if (i6Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (i6Var.getAlpha() * 255.0f));
            canvas.drawPath(this.f14538y, paint);
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
        bi.i6 i6Var = this.f14529b;
        if (view == i6Var) {
            float x10 = i6Var.getX();
            float y10 = i6Var.getY();
            float x11 = i6Var.getX() + i6Var.getWidth();
            float y11 = i6Var.getY() + i6Var.getHeight();
            RectF rectF = this.E;
            rectF.set(x10, y10, x11, y11);
            org.telegram.messenger.g0.i3(rectF, i6Var.getScaleX(), i6Var.getPivotX() + i6Var.getX(), i6Var.getPivotY() + i6Var.getY());
            a(canvas, rectF, org.telegram.messenger.g0.L(10.0f), i6Var.getAlpha());
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
        bi.i6 i6Var = this.f14529b;
        i6Var.setPivotX(i6Var.getWidth() - org.telegram.messenger.g0.L(15.0f));
        i6Var.setPivotY(i6Var.getHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.f14534r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        org.telegram.ui.Components.lc lcVar = this.f14533n;
        if (action == 0) {
            lcVar.c(contains);
            if (this.N && !contains) {
                if (!this.E.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                lcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (lcVar.f37109i) {
                c(!this.N, true);
            }
            lcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            lcVar.c(false);
        }
        if (!lcVar.f37109i && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i7) {
        if (this.f14532f == i7) {
            return;
        }
        this.f14532f = i7;
        org.telegram.messenger.g0.d0(this.f14529b, new a4(this, i7, 0));
    }
}
