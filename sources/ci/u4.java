package ci;

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
import org.telegram.messenger.wl;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w51;
public abstract class u4 extends FrameLayout {
    public final Paint E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.c6 J;
    public g01 K;
    public final Path L;
    public boolean M;
    public final org.telegram.ui.Components.la f5605a;
    public final p4 f5606b;
    public ArrayList f5607c;
    public ArrayList d;
    public ArrayList e;
    public int f5608f;
    public final androidx.fragment.app.a0 h;
    public final org.telegram.ui.Components.wc f5609n;
    public final RectF f5610r;
    public final RectF f5611s;
    public final Paint v;
    public g01 f5612w;
    public final Path f5613x;
    public final RectF f5614y;

    public u4(Context context, ai.d dVar, org.telegram.ui.Components.ha haVar) {
        super(context);
        this.f5607c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final fb fbVar = (fb) this;
        this.h = new androidx.fragment.app.a0(fbVar, 18);
        this.f5609n = new org.telegram.ui.Components.wc(this);
        this.f5610r = new RectF();
        this.f5611s = new RectF();
        Paint paint = new Paint(1);
        this.v = paint;
        Path path = new Path();
        this.f5613x = path;
        this.f5614y = new RectF();
        this.E = new Paint(1);
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.J = new org.telegram.ui.Components.c6(this, 0L, 320L, qr.h);
        this.L = new Path();
        this.M = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.f5605a = new org.telegram.ui.Components.la(haVar, this, 0, !fbVar.O.f5253r0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        p4 p4Var = new p4(fbVar, context, UserConfig.selectedAccount, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                fb fbVar2 = fbVar;
                int i11 = 0;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w51 w51Var = (w51) obj2;
                        w51Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < fbVar2.d.size(); i13++) {
                            Integer num = (Integer) fbVar2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = s4.f5506a;
                            i51 J = i51.J(s4.class);
                            J.d = intValue;
                            J.G = (o8) fbVar2.f5607c.get(intValue);
                            J.f24907z = i12;
                            if (fbVar2.f5608f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            J.K(z10);
                            J.f24889f = fbVar2.e.contains(num);
                            J.D = new o4(fbVar2, intValue, 0);
                            arrayList.add(J);
                            if (fbVar2.e.contains(num)) {
                                i12++;
                            }
                        }
                        w51Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        fbVar2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            fbVar2.d.add(Integer.valueOf(((i51) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) fbVar2.f5606b, (e2.h) new ai.f3(fbVar2, 3));
                        return;
                }
            }
        }, new a1.c(fbVar, 17), dVar);
        this.f5606b = p4Var;
        p4Var.Y2.f29613r = false;
        p4Var.setClipToPadding(false);
        p4Var.setClipChildren(false);
        p4Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(p4Var, w7.x5.e(-2, 120, 85));
        p4Var.w1(true);
        p4Var.B1(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                fb fbVar2 = fbVar;
                int i11 = 0;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w51 w51Var = (w51) obj2;
                        w51Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < fbVar2.d.size(); i13++) {
                            Integer num = (Integer) fbVar2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = s4.f5506a;
                            i51 J = i51.J(s4.class);
                            J.d = intValue;
                            J.G = (o8) fbVar2.f5607c.get(intValue);
                            J.f24907z = i12;
                            if (fbVar2.f5608f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            J.K(z10);
                            J.f24889f = fbVar2.e.contains(num);
                            J.D = new o4(fbVar2, intValue, 0);
                            arrayList.add(J);
                            if (fbVar2.e.contains(num)) {
                                i12++;
                            }
                        }
                        w51Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        fbVar2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            fbVar2.d.add(Integer.valueOf(((i51) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) fbVar2.f5606b, (e2.h) new ai.f3(fbVar2, 3));
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
        fb fbVar = (fb) this;
        boolean c10 = fbVar.O.f5253r0.c();
        org.telegram.ui.Components.la laVar = this.f5605a;
        Paint paint = this.E;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = fbVar.N;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                laVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            Paint[] d = laVar.d();
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
        for (int i12 = 0; i12 < Math.min(i10, this.f5607c.size()); i12++) {
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
            p4 p4Var = this.f5606b;
            p4Var.animate().cancel();
            float f11 = 0.0f;
            float f12 = 0.65f;
            if (z11) {
                p4Var.setVisibility(0);
                ViewPropertyAnimator animate = p4Var.animate();
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
                wl.q(scaleX.scaleY(f12).setListener(new ai.n(10, this, z10)).setUpdateListener(new ai.a(this, 20)), qr.h, 360L);
            } else {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p4Var.setVisibility(i10);
                if (z10) {
                    f11 = 1.0f;
                }
                p4Var.setAlpha(f11);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.65f;
                }
                p4Var.setScaleX(f7);
                if (z10) {
                    f12 = 1.0f;
                }
                p4Var.setScaleY(f12);
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
        float a2 = this.f5609n.a(0.1f);
        canvas.save();
        RectF rectF = this.f5610r;
        rectF.set(getWidth() - AndroidUtilities.dp(42.0f), getHeight() - AndroidUtilities.dp(34.0f), getWidth() - AndroidUtilities.dp(12.0f), getHeight() - AndroidUtilities.dp(4.0f));
        RectF rectF2 = this.f5611s;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.v;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - AndroidUtilities.dp(0.9f), paint);
        g01 g01Var = this.f5612w;
        p4 p4Var = this.f5606b;
        if (g01Var != null) {
            g01Var.c(rectF.centerX() - (this.f5612w.f24149c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - p4Var.getAlpha(), -1, canvas);
        }
        if (p4Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (p4Var.getAlpha() * 255.0f));
            canvas.drawPath(this.f5613x, paint);
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
        p4 p4Var = this.f5606b;
        if (view == p4Var) {
            float x10 = p4Var.getX();
            float y3 = p4Var.getY();
            float x11 = p4Var.getX() + p4Var.getWidth();
            float y10 = p4Var.getY() + p4Var.getHeight();
            RectF rectF = this.f5614y;
            rectF.set(x10, y3, x11, y10);
            AndroidUtilities.scaleRect(rectF, p4Var.getScaleX(), p4Var.getPivotX() + p4Var.getX(), p4Var.getPivotY() + p4Var.getY());
            a(canvas, rectF, AndroidUtilities.dp(10.0f), p4Var.getAlpha());
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
        p4 p4Var = this.f5606b;
        p4Var.setPivotX(p4Var.getWidth() - AndroidUtilities.dp(15.0f));
        p4Var.setPivotY(p4Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.f5610r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        org.telegram.ui.Components.wc wcVar = this.f5609n;
        if (action == 0) {
            wcVar.c(contains);
            if (this.M && !contains) {
                if (!this.f5614y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                wcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (wcVar.h) {
                c(!this.M, true);
            }
            wcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            wcVar.c(false);
        }
        if (!wcVar.h && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i10) {
        if (this.f5608f == i10) {
            return;
        }
        this.f5608f = i10;
        AndroidUtilities.forEachViews((RecyclerView) this.f5606b, (e2.h) new m4(this, i10, 0));
    }
}
