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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.q61;
public abstract class s4 extends FrameLayout {
    public final Paint E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.g6 J;
    public m11 K;
    public final Path L;
    public boolean M;
    public final org.telegram.ui.Components.qa f5941a;
    public final n4 f5942b;
    public ArrayList f5943c;
    public ArrayList d;
    public ArrayList f5944e;
    public int f5945f;
    public final androidx.fragment.app.a0 h;
    public final org.telegram.ui.Components.bd f5946n;
    public final RectF f5947r;
    public final RectF f5948s;
    public final Paint v;
    public m11 f5949w;
    public final Path f5950x;
    public final RectF f5951y;

    public s4(Context context, ai.d dVar, org.telegram.ui.Components.ma maVar) {
        super(context);
        this.f5943c = new ArrayList();
        this.d = new ArrayList();
        this.f5944e = new ArrayList();
        final cb cbVar = (cb) this;
        this.h = new androidx.fragment.app.a0(cbVar, 18);
        this.f5946n = new org.telegram.ui.Components.bd(this);
        this.f5947r = new RectF();
        this.f5948s = new RectF();
        Paint paint = new Paint(1);
        this.v = paint;
        Path path = new Path();
        this.f5950x = path;
        this.f5951y = new RectF();
        this.E = new Paint(1);
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.J = new org.telegram.ui.Components.g6(this, 0L, 320L, is.h);
        this.L = new Path();
        this.M = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.f5941a = new org.telegram.ui.Components.qa(maVar, this, 0, !cbVar.O.f5513r0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        n4 n4Var = new n4(cbVar, context, UserConfig.selectedAccount, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                cb cbVar2 = cbVar;
                int i11 = 0;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        d71 d71Var = (d71) obj2;
                        d71Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < cbVar2.d.size(); i13++) {
                            Integer num = (Integer) cbVar2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = q4.f5786a;
                            q61 J = q61.J(q4.class);
                            J.d = intValue;
                            J.G = (l8) cbVar2.f5943c.get(intValue);
                            J.f30076z = i12;
                            if (cbVar2.f5945f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            J.K(z10);
                            J.f30058f = cbVar2.f5944e.contains(num);
                            J.D = new m4(cbVar2, intValue, 0);
                            arrayList.add(J);
                            if (cbVar2.f5944e.contains(num)) {
                                i12++;
                            }
                        }
                        d71Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        cbVar2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            cbVar2.d.add(Integer.valueOf(((q61) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) cbVar2.f5942b, (Utilities.Callback<View>) new ai.y1(cbVar2, 10));
                        return;
                }
            }
        }, new a1.c(cbVar, 17), dVar);
        this.f5942b = n4Var;
        n4Var.W2.f25587r = false;
        n4Var.setClipToPadding(false);
        n4Var.setClipChildren(false);
        n4Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(n4Var, w7.x5.e(-2, 120, 85));
        n4Var.x1(true);
        n4Var.C1(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i10 = r2;
                cb cbVar2 = cbVar;
                int i11 = 0;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        d71 d71Var = (d71) obj2;
                        d71Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < cbVar2.d.size(); i13++) {
                            Integer num = (Integer) cbVar2.d.get(i13);
                            int intValue = num.intValue();
                            int i14 = q4.f5786a;
                            q61 J = q61.J(q4.class);
                            J.d = intValue;
                            J.G = (l8) cbVar2.f5943c.get(intValue);
                            J.f30076z = i12;
                            if (cbVar2.f5945f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            J.K(z10);
                            J.f30058f = cbVar2.f5944e.contains(num);
                            J.D = new m4(cbVar2, intValue, 0);
                            arrayList.add(J);
                            if (cbVar2.f5944e.contains(num)) {
                                i12++;
                            }
                        }
                        d71Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        cbVar2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            cbVar2.d.add(Integer.valueOf(((q61) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) cbVar2.f5942b, (Utilities.Callback<View>) new ai.y1(cbVar2, 10));
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
        cb cbVar = (cb) this;
        boolean c10 = cbVar.O.f5513r0.c();
        org.telegram.ui.Components.qa qaVar = this.f5941a;
        Paint paint = this.E;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = cbVar.N;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                qaVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            Paint[] d = qaVar.d();
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
        for (int i12 = 0; i12 < Math.min(i10, this.f5943c.size()); i12++) {
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
            n4 n4Var = this.f5942b;
            n4Var.animate().cancel();
            float f11 = 0.0f;
            float f12 = 0.65f;
            if (z11) {
                n4Var.setVisibility(0);
                ViewPropertyAnimator animate = n4Var.animate();
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
                bi.t(scaleX.scaleY(f12).setListener(new ai.n(10, this, z10)).setUpdateListener(new ai.a(this, 20)), is.h, 360L);
            } else {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                n4Var.setVisibility(i10);
                if (z10) {
                    f11 = 1.0f;
                }
                n4Var.setAlpha(f11);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.65f;
                }
                n4Var.setScaleX(f7);
                if (z10) {
                    f12 = 1.0f;
                }
                n4Var.setScaleY(f12);
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
        float a2 = this.f5946n.a(0.1f);
        canvas.save();
        RectF rectF = this.f5947r;
        rectF.set(getWidth() - AndroidUtilities.dp(42.0f), getHeight() - AndroidUtilities.dp(34.0f), getWidth() - AndroidUtilities.dp(12.0f), getHeight() - AndroidUtilities.dp(4.0f));
        RectF rectF2 = this.f5948s;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.v;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - AndroidUtilities.dp(0.9f), paint);
        m11 m11Var = this.f5949w;
        n4 n4Var = this.f5942b;
        if (m11Var != null) {
            m11Var.c(rectF.centerX() - (this.f5949w.f28602c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - n4Var.getAlpha(), -1, canvas);
        }
        if (n4Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (n4Var.getAlpha() * 255.0f));
            canvas.drawPath(this.f5950x, paint);
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
        n4 n4Var = this.f5942b;
        if (view == n4Var) {
            float x10 = n4Var.getX();
            float y3 = n4Var.getY();
            float x11 = n4Var.getX() + n4Var.getWidth();
            float y10 = n4Var.getY() + n4Var.getHeight();
            RectF rectF = this.f5951y;
            rectF.set(x10, y3, x11, y10);
            AndroidUtilities.scaleRect(rectF, n4Var.getScaleX(), n4Var.getPivotX() + n4Var.getX(), n4Var.getPivotY() + n4Var.getY());
            a(canvas, rectF, AndroidUtilities.dp(10.0f), n4Var.getAlpha());
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
        n4 n4Var = this.f5942b;
        n4Var.setPivotX(n4Var.getWidth() - AndroidUtilities.dp(15.0f));
        n4Var.setPivotY(n4Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.f5947r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        org.telegram.ui.Components.bd bdVar = this.f5946n;
        if (action == 0) {
            bdVar.c(contains);
            if (this.M && !contains) {
                if (!this.f5951y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                bdVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (bdVar.f24928i) {
                c(!this.M, true);
            }
            bdVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            bdVar.c(false);
        }
        if (!bdVar.f24928i && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i10) {
        if (this.f5945f == i10) {
            return;
        }
        this.f5945f = i10;
        AndroidUtilities.forEachViews((RecyclerView) this.f5942b, (Utilities.Callback<View>) new k4(this, i10, 0));
    }
}
