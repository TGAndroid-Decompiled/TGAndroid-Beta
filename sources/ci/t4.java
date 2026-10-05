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
import org.telegram.messenger.bi;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w61;
public abstract class t4 extends FrameLayout {
    public final Paint E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.e6 J;
    public f11 K;
    public final Path L;
    public boolean M;
    public final org.telegram.ui.Components.oa f5963a;
    public final o4 f5964b;
    public ArrayList f5965c;
    public ArrayList d;
    public ArrayList f5966e;
    public int f5967f;
    public final androidx.fragment.app.a0 h;
    public final org.telegram.ui.Components.zc f5968n;
    public final RectF f5969r;
    public final RectF f5970s;
    public final Paint v;
    public f11 f5971w;
    public final Path f5972x;
    public final RectF f5973y;

    public t4(Context context, ai.d dVar, org.telegram.ui.Components.ka kaVar) {
        super(context);
        this.f5965c = new ArrayList();
        this.d = new ArrayList();
        this.f5966e = new ArrayList();
        final bb bbVar = (bb) this;
        this.h = new androidx.fragment.app.a0(bbVar, 18);
        this.f5968n = new org.telegram.ui.Components.zc(this);
        this.f5969r = new RectF();
        this.f5970s = new RectF();
        Paint paint = new Paint(1);
        this.v = paint;
        Path path = new Path();
        this.f5972x = path;
        this.f5973y = new RectF();
        this.E = new Paint(1);
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.J = new org.telegram.ui.Components.e6(this, 0L, 320L, tr.h);
        this.L = new Path();
        this.M = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.f5963a = new org.telegram.ui.Components.oa(kaVar, this, 0, !bbVar.O.f5429r0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        o4 o4Var = new o4(bbVar, context, UserConfig.selectedAccount, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                bb bbVar2 = bbVar;
                int i11 = 0;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w61 w61Var = (w61) obj2;
                        w61Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < bbVar2.d.size(); i13++) {
                            Integer num = (Integer) bbVar2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = r4.f5863a;
                            h61 K = h61.K(r4.class);
                            K.d = intValue;
                            K.G = (k8) bbVar2.f5965c.get(intValue);
                            K.f27106z = i12;
                            if (bbVar2.f5967f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            K.L(z10);
                            K.f27088f = bbVar2.f5966e.contains(num);
                            K.D = new n4(bbVar2, intValue, 0);
                            arrayList.add(K);
                            if (bbVar2.f5966e.contains(num)) {
                                i12++;
                            }
                        }
                        w61Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        bbVar2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            bbVar2.d.add(Integer.valueOf(((h61) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) bbVar2.f5964b, (Utilities.Callback<View>) new ai.y1(bbVar2, 10));
                        return;
                }
            }
        }, new a1.c(bbVar, 17), dVar);
        this.f5964b = o4Var;
        o4Var.f26034f3.f32531r = false;
        o4Var.setClipToPadding(false);
        o4Var.setClipChildren(false);
        o4Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(o4Var, w7.z5.e(-2, 120, 85));
        o4Var.x1(true);
        o4Var.C1(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                bb bbVar2 = bbVar;
                int i11 = 0;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        w61 w61Var = (w61) obj2;
                        w61Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < bbVar2.d.size(); i13++) {
                            Integer num = (Integer) bbVar2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = r4.f5863a;
                            h61 K = h61.K(r4.class);
                            K.d = intValue;
                            K.G = (k8) bbVar2.f5965c.get(intValue);
                            K.f27106z = i12;
                            if (bbVar2.f5967f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            K.L(z10);
                            K.f27088f = bbVar2.f5966e.contains(num);
                            K.D = new n4(bbVar2, intValue, 0);
                            arrayList.add(K);
                            if (bbVar2.f5966e.contains(num)) {
                                i12++;
                            }
                        }
                        w61Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        bbVar2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            bbVar2.d.add(Integer.valueOf(((h61) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) bbVar2.f5964b, (Utilities.Callback<View>) new ai.y1(bbVar2, 10));
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
        bb bbVar = (bb) this;
        boolean c10 = bbVar.O.f5429r0.c();
        org.telegram.ui.Components.oa oaVar = this.f5963a;
        Paint paint = this.E;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = bbVar.N;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                oaVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            Paint[] d = oaVar.d();
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
        for (int i12 = 0; i12 < Math.min(i10, this.f5965c.size()); i12++) {
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
            o4 o4Var = this.f5964b;
            o4Var.animate().cancel();
            float f11 = 0.0f;
            float f12 = 0.65f;
            if (z11) {
                o4Var.setVisibility(0);
                ViewPropertyAnimator animate = o4Var.animate();
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
                bi.r(scaleX.scaleY(f12).setListener(new ai.n(10, this, z10)).setUpdateListener(new ai.a(this, 20)), tr.h, 360L);
            } else {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                o4Var.setVisibility(i10);
                if (z10) {
                    f11 = 1.0f;
                }
                o4Var.setAlpha(f11);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.65f;
                }
                o4Var.setScaleX(f7);
                if (z10) {
                    f12 = 1.0f;
                }
                o4Var.setScaleY(f12);
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
        float a2 = this.f5968n.a(0.1f);
        canvas.save();
        RectF rectF = this.f5969r;
        rectF.set(getWidth() - AndroidUtilities.dp(42.0f), getHeight() - AndroidUtilities.dp(34.0f), getWidth() - AndroidUtilities.dp(12.0f), getHeight() - AndroidUtilities.dp(4.0f));
        RectF rectF2 = this.f5970s;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.v;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - AndroidUtilities.dp(0.9f), paint);
        f11 f11Var = this.f5971w;
        o4 o4Var = this.f5964b;
        if (f11Var != null) {
            f11Var.c(rectF.centerX() - (this.f5971w.f26266c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - o4Var.getAlpha(), -1, canvas);
        }
        if (o4Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (o4Var.getAlpha() * 255.0f));
            canvas.drawPath(this.f5972x, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.K != null) {
            float e7 = this.J.e(this.I);
            if (e7 > 0.0f) {
                float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e7);
                float l4 = this.K.l() + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
                float dp = AndroidUtilities.dp(32.0f);
                float f7 = rectF.right;
                float dp2 = rectF.top - AndroidUtilities.dp(9.66f);
                RectF rectF3 = this.F;
                rectF3.set(rectF.right - l4, (rectF.top - AndroidUtilities.dp(9.66f)) - dp, f7, dp2);
                rectF3.set(rectF3.right - (rectF3.width() * lerp), rectF3.bottom - (rectF3.height() * lerp), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - e7) * AndroidUtilities.dp(4.0f));
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
                a(canvas, rectF3, dp3, e7);
                canvas.restore();
                canvas.save();
                canvas.scale(lerp, lerp, rectF3.right, rectF3.bottom);
                this.K.c((rectF.right - l4) + AndroidUtilities.dp(11.0f), (rectF.top - AndroidUtilities.dp(9.66f)) - (dp / 2.0f), e7, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        o4 o4Var = this.f5964b;
        if (view == o4Var) {
            float x10 = o4Var.getX();
            float y3 = o4Var.getY();
            float x11 = o4Var.getX() + o4Var.getWidth();
            float y10 = o4Var.getY() + o4Var.getHeight();
            RectF rectF = this.f5973y;
            rectF.set(x10, y3, x11, y10);
            AndroidUtilities.scaleRect(rectF, o4Var.getScaleX(), o4Var.getPivotX() + o4Var.getX(), o4Var.getPivotY() + o4Var.getY());
            a(canvas, rectF, AndroidUtilities.dp(10.0f), o4Var.getAlpha());
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
        o4 o4Var = this.f5964b;
        o4Var.setPivotX(o4Var.getWidth() - AndroidUtilities.dp(15.0f));
        o4Var.setPivotY(o4Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.f5969r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        org.telegram.ui.Components.zc zcVar = this.f5968n;
        if (action == 0) {
            zcVar.c(contains);
            if (this.M && !contains) {
                if (!this.f5973y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                zcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (zcVar.h) {
                c(!this.M, true);
            }
            zcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            zcVar.c(false);
        }
        if (!zcVar.h && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i10) {
        if (this.f5967f == i10) {
            return;
        }
        this.f5967f = i10;
        AndroidUtilities.forEachViews((RecyclerView) this.f5964b, (Utilities.Callback<View>) new l4(this, i10, 0));
    }
}
