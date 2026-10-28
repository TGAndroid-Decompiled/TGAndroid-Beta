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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;
public abstract class k4 extends FrameLayout {
    public final Paint E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.h6 J;
    public r11 K;
    public final Path L;
    public boolean M;
    public final org.telegram.ui.Components.pa f11105a;
    public final f4 f11106b;
    public ArrayList f11107c;
    public ArrayList d;
    public ArrayList e;
    public int f11108f;
    public final di.s8 h;
    public final xc f11109n;
    public final RectF f11110r;
    public final RectF f11111s;
    public final Paint v;
    public r11 f11112w;
    public final Path f11113x;
    public final RectF f11114y;

    public k4(Context context, di.b bVar, org.telegram.ui.Components.la laVar) {
        super(context);
        this.f11107c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final ia iaVar = (ia) this;
        this.h = new di.s8(iaVar, 22);
        this.f11109n = new xc(this);
        this.f11110r = new RectF();
        this.f11111s = new RectF();
        Paint paint = new Paint(1);
        this.v = paint;
        Path path = new Path();
        this.f11113x = path;
        this.f11114y = new RectF();
        this.E = new Paint(1);
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.J = new org.telegram.ui.Components.h6(this, 0L, 320L, ds.h);
        this.L = new Path();
        this.M = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.f11105a = new org.telegram.ui.Components.pa(laVar, this, 0, !iaVar.O.f11658r0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        f4 f4Var = new f4(iaVar, context, UserConfig.selectedAccount, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                int i11 = 0;
                ia iaVar2 = iaVar;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k71 k71Var = (k71) obj2;
                        k71Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < iaVar2.d.size(); i13++) {
                            Integer num = (Integer) iaVar2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = i4.f10992a;
                            u61 K = u61.K(i4.class);
                            K.d = intValue;
                            K.G = (w7) iaVar2.f11107c.get(intValue);
                            K.f33262z = i12;
                            if (iaVar2.f11108f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            K.L(z10);
                            K.f33244f = iaVar2.e.contains(num);
                            K.D = new ai.w(iaVar2, intValue, 3);
                            arrayList.add(K);
                            if (iaVar2.e.contains(num)) {
                                i12++;
                            }
                        }
                        k71Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        iaVar2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            iaVar2.d.add(Integer.valueOf(((u61) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) iaVar2.f11106b, (Utilities.Callback<View>) new ai.i(iaVar2, 20));
                        return;
                }
            }
        }, new e1.c(iaVar, 8), bVar);
        this.f11106b = f4Var;
        f4Var.f32504g3.f29878r = false;
        f4Var.setClipToPadding(false);
        f4Var.setClipChildren(false);
        f4Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(f4Var, kb1.i(-2, 120, 85));
        f4Var.C1(true);
        f4Var.H1(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                int i11 = 0;
                ia iaVar2 = iaVar;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k71 k71Var = (k71) obj2;
                        k71Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < iaVar2.d.size(); i13++) {
                            Integer num = (Integer) iaVar2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = i4.f10992a;
                            u61 K = u61.K(i4.class);
                            K.d = intValue;
                            K.G = (w7) iaVar2.f11107c.get(intValue);
                            K.f33262z = i12;
                            if (iaVar2.f11108f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            K.L(z10);
                            K.f33244f = iaVar2.e.contains(num);
                            K.D = new ai.w(iaVar2, intValue, 3);
                            arrayList.add(K);
                            if (iaVar2.e.contains(num)) {
                                i12++;
                            }
                        }
                        k71Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        iaVar2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            iaVar2.d.add(Integer.valueOf(((u61) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) iaVar2.f11106b, (Utilities.Callback<View>) new ai.i(iaVar2, 20));
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
        ia iaVar = (ia) this;
        boolean c10 = iaVar.O.f11658r0.c();
        org.telegram.ui.Components.pa paVar = this.f11105a;
        Paint paint = this.E;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = iaVar.N;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                paVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            Paint[] d = paVar.d();
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
        for (int i12 = 0; i12 < Math.min(i10, this.f11107c.size()); i12++) {
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
            f4 f4Var = this.f11106b;
            f4Var.animate().cancel();
            float f11 = 0.0f;
            float f12 = 0.65f;
            if (z11) {
                f4Var.setVisibility(0);
                ViewPropertyAnimator animate = f4Var.animate();
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
                wh.q(scaleX.scaleY(f12).setListener(new bh.f0(11, this, z10)).setUpdateListener(new e4(this, 0)), ds.h, 360L);
            } else {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                f4Var.setVisibility(i10);
                if (z10) {
                    f11 = 1.0f;
                }
                f4Var.setAlpha(f11);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.65f;
                }
                f4Var.setScaleX(f7);
                if (z10) {
                    f12 = 1.0f;
                }
                f4Var.setScaleY(f12);
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
        float a2 = this.f11109n.a(0.1f);
        canvas.save();
        RectF rectF = this.f11110r;
        rectF.set(getWidth() - AndroidUtilities.dp(42.0f), getHeight() - AndroidUtilities.dp(34.0f), getWidth() - AndroidUtilities.dp(12.0f), getHeight() - AndroidUtilities.dp(4.0f));
        RectF rectF2 = this.f11111s;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.v;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - AndroidUtilities.dp(0.9f), paint);
        r11 r11Var = this.f11112w;
        f4 f4Var = this.f11106b;
        if (r11Var != null) {
            r11Var.c(rectF.centerX() - (this.f11112w.f32090c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - f4Var.getAlpha(), -1, canvas);
        }
        if (f4Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (f4Var.getAlpha() * 255.0f));
            canvas.drawPath(this.f11113x, paint);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f4 f4Var = this.f11106b;
        if (view == f4Var) {
            float x9 = f4Var.getX();
            float y3 = f4Var.getY();
            float x10 = f4Var.getX() + f4Var.getWidth();
            float y10 = f4Var.getY() + f4Var.getHeight();
            RectF rectF = this.f11114y;
            rectF.set(x9, y3, x10, y10);
            AndroidUtilities.scaleRect(rectF, f4Var.getScaleX(), f4Var.getPivotX() + f4Var.getX(), f4Var.getPivotY() + f4Var.getY());
            a(canvas, rectF, AndroidUtilities.dp(10.0f), f4Var.getAlpha());
            Path path = this.L;
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        f4 f4Var = this.f11106b;
        f4Var.setPivotX(f4Var.getWidth() - AndroidUtilities.dp(15.0f));
        f4Var.setPivotY(f4Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.f11110r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        xc xcVar = this.f11109n;
        if (action == 0) {
            xcVar.c(contains);
            if (this.M && !contains) {
                if (!this.f11114y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                xcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (xcVar.f34725i) {
                c(!this.M, true);
            }
            xcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            xcVar.c(false);
        }
        if (!xcVar.f34725i && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i10) {
        if (this.f11108f == i10) {
            return;
        }
        this.f11108f = i10;
        AndroidUtilities.forEachViews((RecyclerView) this.f11106b, (Utilities.Callback<View>) new c4(this, i10, 0));
    }
}
