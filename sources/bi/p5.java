package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wr;
public abstract class p5 extends FrameLayout {
    public final Paint E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.d6 J;
    public t01 K;
    public final Path L;
    public boolean M;
    public final org.telegram.ui.Components.ma f3387a;
    public final k5 f3388b;
    public ArrayList f3389c;
    public ArrayList d;
    public ArrayList e;
    public int f3390f;
    public final a3.d h;
    public final org.telegram.ui.Components.xc f3391n;
    public final RectF f3392r;
    public final RectF f3393s;
    public final Paint v;
    public t01 f3394w;
    public final Path f3395x;
    public final RectF f3396y;

    public p5(Context context, zh.b bVar, org.telegram.ui.Components.ia iaVar) {
        super(context);
        this.f3389c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final oc ocVar = (oc) this;
        this.h = new a3.d(ocVar, 24);
        this.f3391n = new org.telegram.ui.Components.xc(this);
        this.f3392r = new RectF();
        this.f3393s = new RectF();
        Paint paint = new Paint(1);
        this.v = paint;
        Path path = new Path();
        this.f3395x = path;
        this.f3396y = new RectF();
        this.E = new Paint(1);
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.J = new org.telegram.ui.Components.d6(this, 0L, 320L, wr.h);
        this.L = new Path();
        this.M = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.f3387a = new org.telegram.ui.Components.ma(iaVar, this, 0, !ocVar.O.f2484r0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        k5 k5Var = new k5(ocVar, context, UserConfig.selectedAccount, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                oc ocVar2 = ocVar;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        j61 j61Var = (j61) obj2;
                        j61Var.M();
                        int i11 = 0;
                        for (int i12 = 0; i12 < ocVar2.d.size(); i12++) {
                            Integer num = (Integer) ocVar2.d.get(i12);
                            int intValue = num.intValue();
                            int i13 = n5.f3234a;
                            v51 J = v51.J(n5.class);
                            J.d = intValue;
                            J.G = (r9) ocVar2.f3389c.get(intValue);
                            J.f27842z = i11;
                            if (ocVar2.f3390f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            J.K(z10);
                            J.f27824f = ocVar2.e.contains(num);
                            J.D = new j5(ocVar2, intValue, 0);
                            arrayList.add(J);
                            if (ocVar2.e.contains(num)) {
                                i11++;
                            }
                        }
                        j61Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        ocVar2.d.clear();
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj3 = arrayList2.get(i14);
                            i14++;
                            ocVar2.d.add(Integer.valueOf(((v51) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) ocVar2.f3388b, (e2.h) new i5(ocVar2, 0));
                        return;
                }
            }
        }, new a1.c(ocVar, 7), bVar);
        this.f3388b = k5Var;
        k5Var.Y2.f24250r = false;
        k5Var.setClipToPadding(false);
        k5Var.setClipChildren(false);
        k5Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(k5Var, w7.a6.e(-2, 120, 85));
        k5Var.v1(true);
        k5Var.A1(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                oc ocVar2 = ocVar;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        j61 j61Var = (j61) obj2;
                        j61Var.M();
                        int i11 = 0;
                        for (int i12 = 0; i12 < ocVar2.d.size(); i12++) {
                            Integer num = (Integer) ocVar2.d.get(i12);
                            int intValue = num.intValue();
                            int i13 = n5.f3234a;
                            v51 J = v51.J(n5.class);
                            J.d = intValue;
                            J.G = (r9) ocVar2.f3389c.get(intValue);
                            J.f27842z = i11;
                            if (ocVar2.f3390f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            J.K(z10);
                            J.f27824f = ocVar2.e.contains(num);
                            J.D = new j5(ocVar2, intValue, 0);
                            arrayList.add(J);
                            if (ocVar2.e.contains(num)) {
                                i11++;
                            }
                        }
                        j61Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        ocVar2.d.clear();
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj3 = arrayList2.get(i14);
                            i14++;
                            ocVar2.d.add(Integer.valueOf(((v51) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) ocVar2.f3388b, (e2.h) new i5(ocVar2, 0));
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

    public final void a(Canvas canvas, RectF rectF, float f7, float f10) {
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i10 < 0) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f10), 31);
        }
        oc ocVar = (oc) this;
        boolean c10 = ocVar.O.f2484r0.c();
        org.telegram.ui.Components.ma maVar = this.f3387a;
        Paint paint = this.E;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = ocVar.N;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                maVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            Paint[] d = maVar.d();
            if (d[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f7, f7, paint);
            } else {
                Paint paint2 = d[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f7, f7, paint2);
                }
                Paint paint3 = d[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f7, f7, paint3);
                }
                paint.setAlpha((int) (f10 * 51.0f));
                canvas.drawRoundRect(rectF, f7, f7, paint);
            }
        }
        if (i10 < 0) {
            canvas.restore();
        }
    }

    public final int b(int i10) {
        if (!this.d.contains(Integer.valueOf(i10))) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < Math.min(i10, this.f3389c.size()); i12++) {
            if (this.d.contains(Integer.valueOf(i12))) {
                i11++;
            }
        }
        return i11;
    }

    public final void c(boolean z10, boolean z11) {
        int i10;
        float f7;
        float f10;
        if (this.M != z10) {
            this.M = z10;
            k5 k5Var = this.f3388b;
            k5Var.animate().cancel();
            float f11 = 0.0f;
            float f12 = 0.65f;
            if (z11) {
                k5Var.setVisibility(0);
                ViewPropertyAnimator animate = k5Var.animate();
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f11);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.65f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (z10) {
                    f12 = 1.0f;
                }
                em.q(scaleX.scaleY(f12).setListener(new ai.e(6, this, z10)).setUpdateListener(new ai.a(this, 6)), wr.h, 360L);
            } else {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                k5Var.setVisibility(i10);
                if (z10) {
                    f11 = 1.0f;
                }
                k5Var.setAlpha(f11);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.65f;
                }
                k5Var.setScaleX(f7);
                if (z10) {
                    f12 = 1.0f;
                }
                k5Var.setScaleY(f12);
                invalidate();
            }
            if (z10 && this.I) {
                this.I = false;
                invalidate();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.f3391n.a(0.1f);
        canvas.save();
        RectF rectF = this.f3392r;
        rectF.set(getWidth() - AndroidUtilities.dp(42.0f), getHeight() - AndroidUtilities.dp(34.0f), getWidth() - AndroidUtilities.dp(12.0f), getHeight() - AndroidUtilities.dp(4.0f));
        RectF rectF2 = this.f3393s;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.v;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - AndroidUtilities.dp(0.9f), paint);
        t01 t01Var = this.f3394w;
        k5 k5Var = this.f3388b;
        if (t01Var != null) {
            t01Var.c(rectF.centerX() - (this.f3394w.f27247c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - k5Var.getAlpha(), -1, canvas);
        }
        if (k5Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (k5Var.getAlpha() * 255.0f));
            canvas.drawPath(this.f3395x, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.K != null) {
            float e = this.J.e(this.I);
            if (e > 0.0f) {
                float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e);
                float l4 = this.K.l() + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
                float dp = AndroidUtilities.dp(32.0f);
                float f7 = rectF.right;
                float dp2 = rectF.top - AndroidUtilities.dp(9.66f);
                RectF rectF3 = this.F;
                rectF3.set(rectF.right - l4, (rectF.top - AndroidUtilities.dp(9.66f)) - dp, f7, dp2);
                rectF3.set(rectF3.right - (rectF3.width() * lerp), rectF3.bottom - (rectF3.height() * lerp), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - e) * AndroidUtilities.dp(4.0f));
                Path path = this.H;
                path.rewind();
                float dp3 = AndroidUtilities.dp(8.0f);
                float f10 = rectF3.left;
                float f11 = rectF3.top;
                RectF rectF4 = this.G;
                rectF4.set(f10, f11, f10 + dp3, f11 + dp3);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f12 = rectF3.right;
                float f13 = rectF3.top;
                rectF4.set(f12 - dp3, f13, f12, f13 + dp3);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f14 = rectF3.right;
                float f15 = rectF3.bottom;
                rectF4.set(f14 - dp3, f15 - dp3, f14, f15);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - AndroidUtilities.dp(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - AndroidUtilities.dp(14.5f), rectF3.bottom + AndroidUtilities.dp(5.66f));
                path.lineTo(rectF3.right - AndroidUtilities.dp(21.0f), rectF3.bottom);
                float f16 = rectF3.left;
                float f17 = rectF3.bottom;
                rectF4.set(f16, f17 - dp3, f16 + dp3, f17);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += AndroidUtilities.dp(5.66f);
                canvas.save();
                canvas.clipPath(path);
                a(canvas, rectF3, dp3, e);
                canvas.restore();
                canvas.save();
                canvas.scale(lerp, lerp, rectF3.right, rectF3.bottom);
                this.K.c((rectF.right - l4) + AndroidUtilities.dp(11.0f), (rectF.top - AndroidUtilities.dp(9.66f)) - (dp / 2.0f), e, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        k5 k5Var = this.f3388b;
        if (view == k5Var) {
            float x10 = k5Var.getX();
            float y3 = k5Var.getY();
            float x11 = k5Var.getX() + k5Var.getWidth();
            float y10 = k5Var.getY() + k5Var.getHeight();
            RectF rectF = this.f3396y;
            rectF.set(x10, y3, x11, y10);
            AndroidUtilities.scaleRect(rectF, k5Var.getScaleX(), k5Var.getPivotX() + k5Var.getX(), k5Var.getPivotY() + k5Var.getY());
            a(canvas, rectF, AndroidUtilities.dp(10.0f), k5Var.getAlpha());
            Path path = this.L;
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k5 k5Var = this.f3388b;
        k5Var.setPivotX(k5Var.getWidth() - AndroidUtilities.dp(15.0f));
        k5Var.setPivotY(k5Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.f3392r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        org.telegram.ui.Components.xc xcVar = this.f3391n;
        if (action == 0) {
            xcVar.c(contains);
            if (this.M && !contains) {
                if (!this.f3396y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                xcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (xcVar.h) {
                c(!this.M, true);
            }
            xcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            xcVar.c(false);
        }
        if (!xcVar.h && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i10) {
        if (this.f3390f == i10) {
            return;
        }
        this.f3390f = i10;
        AndroidUtilities.forEachViews((RecyclerView) this.f3388b, (e2.h) new g5(this, i10, 0));
    }
}
