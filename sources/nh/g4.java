package nh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.zz0;
public abstract class g4 extends FrameLayout {
    public final Paint A;
    public final RectF B;
    public final RectF C;
    public final Path D;
    public boolean E;
    public final org.telegram.ui.Components.d6 F;
    public zz0 G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.ka f17693a;
    public final b4 f17694b;
    public ArrayList f17695c;
    public ArrayList d;
    public ArrayList f17696e;
    public int f17697f;
    public final lh.m5 h;
    public final uc f17698n;
    public final RectF f17699r;
    public final RectF f17700s;
    public final Paint v;
    public zz0 f17701w;
    public final Path f17702x;
    public final RectF f17703y;

    public g4(Context context, lh.b bVar, org.telegram.ui.Components.ga gaVar) {
        super(context);
        this.f17695c = new ArrayList();
        this.d = new ArrayList();
        this.f17696e = new ArrayList();
        final y9 y9Var = (y9) this;
        this.h = new lh.m5(y9Var, 29);
        this.f17698n = new uc(this);
        this.f17699r = new RectF();
        this.f17700s = new RectF();
        Paint paint = new Paint(1);
        this.v = paint;
        Path path = new Path();
        this.f17702x = path;
        this.f17703y = new RectF();
        this.A = new Paint(1);
        this.B = new RectF();
        this.C = new RectF();
        this.D = new Path();
        this.F = new org.telegram.ui.Components.d6(this, 0L, 320L, jr.h);
        this.H = new Path();
        this.I = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.f17693a = new org.telegram.ui.Components.ka(gaVar, this, 0, !y9Var.K.f17778n0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        b4 b4Var = new b4(y9Var, context, UserConfig.selectedAccount, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                int i11 = 0;
                y9 y9Var2 = y9Var;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k51 k51Var = (k51) obj2;
                        k51Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < y9Var2.d.size(); i13++) {
                            Integer num = (Integer) y9Var2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = e4.f17592a;
                            w41 J = w41.J(e4.class);
                            J.d = intValue;
                            J.G = (o7) y9Var2.f17695c.get(intValue);
                            J.f34313z = i12;
                            if (y9Var2.f17697f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            J.K(z10);
                            J.f34295f = y9Var2.f17696e.contains(num);
                            J.D = new jh.y0(y9Var2, intValue, 2);
                            arrayList.add(J);
                            if (y9Var2.f17696e.contains(num)) {
                                i12++;
                            }
                        }
                        k51Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        y9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            y9Var2.d.add(Integer.valueOf(((w41) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) y9Var2.f17694b, (f5.d) new kg.i(y9Var2, 4));
                        return;
                }
            }
        }, new l4.s0(y9Var, 15), bVar);
        this.f17694b = b4Var;
        b4Var.U2.f29939r = false;
        b4Var.setClipToPadding(false);
        b4Var.setClipChildren(false);
        b4Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(b4Var, i7.f6.e(-2, 120, 85));
        b4Var.w1(true);
        b4Var.B1(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                int i11 = 0;
                y9 y9Var2 = y9Var;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k51 k51Var = (k51) obj2;
                        k51Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < y9Var2.d.size(); i13++) {
                            Integer num = (Integer) y9Var2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = e4.f17592a;
                            w41 J = w41.J(e4.class);
                            J.d = intValue;
                            J.G = (o7) y9Var2.f17695c.get(intValue);
                            J.f34313z = i12;
                            if (y9Var2.f17697f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            J.K(z10);
                            J.f34295f = y9Var2.f17696e.contains(num);
                            J.D = new jh.y0(y9Var2, intValue, 2);
                            arrayList.add(J);
                            if (y9Var2.f17696e.contains(num)) {
                                i12++;
                            }
                        }
                        k51Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        y9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            y9Var2.d.add(Integer.valueOf(((w41) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) y9Var2.f17694b, (f5.d) new kg.i(y9Var2, 4));
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

    public final void a(Canvas canvas, RectF rectF, float f9, float f10) {
        int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i10 < 0) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f10), 31);
        }
        y9 y9Var = (y9) this;
        boolean c3 = y9Var.K.f17778n0.c();
        org.telegram.ui.Components.ka kaVar = this.f17693a;
        Paint paint = this.A;
        if (c3) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = y9Var.J;
                path.rewind();
                path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                kaVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f9, f9, paint);
        } else {
            Paint[] d = kaVar.d();
            if (d[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f9, f9, paint);
            } else {
                Paint paint2 = d[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f9, f9, paint2);
                }
                Paint paint3 = d[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f9, f9, paint3);
                }
                paint.setAlpha((int) (f10 * 51.0f));
                canvas.drawRoundRect(rectF, f9, f9, paint);
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
        for (int i12 = 0; i12 < Math.min(i10, this.f17695c.size()); i12++) {
            if (this.d.contains(Integer.valueOf(i12))) {
                i11++;
            }
        }
        return i11;
    }

    public final void c(boolean z10, boolean z11) {
        int i10;
        float f9;
        float f10;
        if (this.I != z10) {
            this.I = z10;
            b4 b4Var = this.f17694b;
            b4Var.animate().cancel();
            float f11 = 0.0f;
            float f12 = 0.65f;
            if (z11) {
                b4Var.setVisibility(0);
                ViewPropertyAnimator animate = b4Var.animate();
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
                org.telegram.ui.b.q(scaleX.scaleY(f12).setListener(new bg.z2(14, this, z10)).setUpdateListener(new lh.d5(this, 9)), jr.h, 360L);
            } else {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                b4Var.setVisibility(i10);
                if (z10) {
                    f11 = 1.0f;
                }
                b4Var.setAlpha(f11);
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.65f;
                }
                b4Var.setScaleX(f9);
                if (z10) {
                    f12 = 1.0f;
                }
                b4Var.setScaleY(f12);
                invalidate();
            }
            if (z10 && this.E) {
                this.E = false;
                invalidate();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.f17698n.a(0.1f);
        canvas.save();
        RectF rectF = this.f17699r;
        rectF.set(getWidth() - AndroidUtilities.dp(42.0f), getHeight() - AndroidUtilities.dp(34.0f), getWidth() - AndroidUtilities.dp(12.0f), getHeight() - AndroidUtilities.dp(4.0f));
        RectF rectF2 = this.f17700s;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.v;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - AndroidUtilities.dp(0.9f), paint);
        zz0 zz0Var = this.f17701w;
        b4 b4Var = this.f17694b;
        if (zz0Var != null) {
            zz0Var.c(rectF.centerX() - (this.f17701w.f35462c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - b4Var.getAlpha(), -1, canvas);
        }
        if (b4Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (b4Var.getAlpha() * 255.0f));
            canvas.drawPath(this.f17702x, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.G != null) {
            float e10 = this.F.e(this.E);
            if (e10 > 0.0f) {
                float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e10);
                float l10 = this.G.l() + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
                float dp = AndroidUtilities.dp(32.0f);
                float f9 = rectF.right;
                float dp2 = rectF.top - AndroidUtilities.dp(9.66f);
                RectF rectF3 = this.B;
                rectF3.set(rectF.right - l10, (rectF.top - AndroidUtilities.dp(9.66f)) - dp, f9, dp2);
                rectF3.set(rectF3.right - (rectF3.width() * lerp), rectF3.bottom - (rectF3.height() * lerp), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - e10) * AndroidUtilities.dp(4.0f));
                Path path = this.D;
                path.rewind();
                float dp3 = AndroidUtilities.dp(8.0f);
                float f10 = rectF3.left;
                float f11 = rectF3.top;
                RectF rectF4 = this.C;
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
                a(canvas, rectF3, dp3, e10);
                canvas.restore();
                canvas.save();
                canvas.scale(lerp, lerp, rectF3.right, rectF3.bottom);
                this.G.c((rectF.right - l10) + AndroidUtilities.dp(11.0f), (rectF.top - AndroidUtilities.dp(9.66f)) - (dp / 2.0f), e10, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        b4 b4Var = this.f17694b;
        if (view == b4Var) {
            float x4 = b4Var.getX();
            float y8 = b4Var.getY();
            float x10 = b4Var.getX() + b4Var.getWidth();
            float y10 = b4Var.getY() + b4Var.getHeight();
            RectF rectF = this.f17703y;
            rectF.set(x4, y8, x10, y10);
            AndroidUtilities.scaleRect(rectF, b4Var.getScaleX(), b4Var.getPivotX() + b4Var.getX(), b4Var.getPivotY() + b4Var.getY());
            a(canvas, rectF, AndroidUtilities.dp(10.0f), b4Var.getAlpha());
            Path path = this.H;
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
        b4 b4Var = this.f17694b;
        b4Var.setPivotX(b4Var.getWidth() - AndroidUtilities.dp(15.0f));
        b4Var.setPivotY(b4Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.f17699r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        uc ucVar = this.f17698n;
        if (action == 0) {
            ucVar.c(contains);
            if (this.I && !contains) {
                if (!this.f17703y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                ucVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (ucVar.h) {
                c(!this.I, true);
            }
            ucVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            ucVar.c(false);
        }
        if (!ucVar.h && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i10) {
        if (this.f17697f == i10) {
            return;
        }
        this.f17697f = i10;
        AndroidUtilities.forEachViews((RecyclerView) this.f17694b, (f5.d) new z3(this, i10, 0));
    }
}
