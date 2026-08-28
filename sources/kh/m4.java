package kh;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.z41;
public abstract class m4 extends FrameLayout {
    public final Paint A;
    public final RectF B;
    public final RectF C;
    public final Path D;
    public boolean E;
    public final org.telegram.ui.Components.y5 F;
    public nz0 G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.fa f15688a;
    public final h4 f15689b;
    public ArrayList f15690c;
    public ArrayList d;
    public ArrayList f15691e;
    public int f15692f;
    public final f1 h;
    public final org.telegram.ui.Components.pc f15693n;
    public final RectF f15694r;
    public final RectF f15695s;
    public final Paint v;
    public nz0 f15696w;
    public final Path f15697x;
    public final RectF f15698y;

    public m4(Context context, ih.b bVar, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.f15690c = new ArrayList();
        this.d = new ArrayList();
        this.f15691e = new ArrayList();
        final na naVar = (na) this;
        this.h = new f1(naVar, 8);
        this.f15693n = new org.telegram.ui.Components.pc(this);
        this.f15694r = new RectF();
        this.f15695s = new RectF();
        Paint paint = new Paint(1);
        this.v = paint;
        Path path = new Path();
        this.f15697x = path;
        this.f15698y = new RectF();
        this.A = new Paint(1);
        this.B = new RectF();
        this.C = new RectF();
        this.D = new Path();
        this.F = new org.telegram.ui.Components.y5(this, 0L, 320L, gr.h);
        this.H = new Path();
        this.I = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.f15688a = new org.telegram.ui.Components.fa(baVar, this, 0, !naVar.K.f16288n0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        h4 h4Var = new h4(naVar, context, UserConfig.selectedAccount, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i9 = r2;
                int i10 = 0;
                na naVar2 = naVar;
                switch (i9) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        z41Var.M();
                        int i11 = 0;
                        for (int i12 = 0; i12 < naVar2.d.size(); i12++) {
                            Integer num = (Integer) naVar2.d.get(i12);
                            int intValue = num.intValue();
                            int i13 = k4.f15516a;
                            l41 J = l41.J(k4.class);
                            J.d = intValue;
                            J.G = (a8) naVar2.f15690c.get(intValue);
                            J.f30352z = i11;
                            if (naVar2.f15692f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            J.K(z10);
                            J.f30334f = naVar2.f15691e.contains(num);
                            J.D = new gh.z0(naVar2, intValue, 2);
                            arrayList.add(J);
                            if (naVar2.f15691e.contains(num)) {
                                i11++;
                            }
                        }
                        z41Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        naVar2.d.clear();
                        int size = arrayList2.size();
                        while (i10 < size) {
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            naVar2.d.add(Integer.valueOf(((l41) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) naVar2.f15689b, (d5.d) new hg.i(naVar2, 4));
                        return;
                }
            }
        }, new p(naVar, 3), bVar);
        this.f15689b = h4Var;
        h4Var.U2.f35188r = false;
        h4Var.setClipToPadding(false);
        h4Var.setClipChildren(false);
        h4Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(h4Var, g7.e6.e(-2, 120, 85));
        h4Var.w1(true);
        h4Var.B1(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean z10;
                int i9 = r2;
                int i10 = 0;
                na naVar2 = naVar;
                switch (i9) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        z41 z41Var = (z41) obj2;
                        z41Var.M();
                        int i11 = 0;
                        for (int i12 = 0; i12 < naVar2.d.size(); i12++) {
                            Integer num = (Integer) naVar2.d.get(i12);
                            int intValue = num.intValue();
                            int i13 = k4.f15516a;
                            l41 J = l41.J(k4.class);
                            J.d = intValue;
                            J.G = (a8) naVar2.f15690c.get(intValue);
                            J.f30352z = i11;
                            if (naVar2.f15692f == intValue) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            J.K(z10);
                            J.f30334f = naVar2.f15691e.contains(num);
                            J.D = new gh.z0(naVar2, intValue, 2);
                            arrayList.add(J);
                            if (naVar2.f15691e.contains(num)) {
                                i11++;
                            }
                        }
                        z41Var.L();
                        return;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        naVar2.d.clear();
                        int size = arrayList2.size();
                        while (i10 < size) {
                            Object obj3 = arrayList2.get(i10);
                            i10++;
                            naVar2.d.add(Integer.valueOf(((l41) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) naVar2.f15689b, (d5.d) new hg.i(naVar2, 4));
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
        int i9 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
        if (i9 < 0) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f11), 31);
        }
        na naVar = (na) this;
        boolean c10 = naVar.K.f16288n0.c();
        org.telegram.ui.Components.fa faVar = this.f15688a;
        Paint paint = this.A;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = naVar.J;
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
        if (i9 < 0) {
            canvas.restore();
        }
    }

    public final int b(int i9) {
        if (!this.d.contains(Integer.valueOf(i9))) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < Math.min(i9, this.f15690c.size()); i11++) {
            if (this.d.contains(Integer.valueOf(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public final void c(boolean z10, boolean z11) {
        int i9;
        float f10;
        float f11;
        if (this.I != z10) {
            this.I = z10;
            h4 h4Var = this.f15689b;
            h4Var.animate().cancel();
            float f12 = 0.0f;
            float f13 = 0.65f;
            if (z11) {
                h4Var.setVisibility(0);
                ViewPropertyAnimator animate = h4Var.animate();
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
                ll.r(scaleX.scaleY(f13).setListener(new hg.b0(11, this, z10)).setUpdateListener(new g4(this, 0)), gr.h, 360L);
            } else {
                if (z10) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                h4Var.setVisibility(i9);
                if (z10) {
                    f12 = 1.0f;
                }
                h4Var.setAlpha(f12);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.65f;
                }
                h4Var.setScaleX(f10);
                if (z10) {
                    f13 = 1.0f;
                }
                h4Var.setScaleY(f13);
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
        float a2 = this.f15693n.a(0.1f);
        canvas.save();
        RectF rectF = this.f15694r;
        rectF.set(getWidth() - AndroidUtilities.dp(42.0f), getHeight() - AndroidUtilities.dp(34.0f), getWidth() - AndroidUtilities.dp(12.0f), getHeight() - AndroidUtilities.dp(4.0f));
        RectF rectF2 = this.f15695s;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.v;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - AndroidUtilities.dp(0.9f), paint);
        nz0 nz0Var = this.f15696w;
        h4 h4Var = this.f15689b;
        if (nz0Var != null) {
            nz0Var.c(rectF.centerX() - (this.f15696w.f31223c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - h4Var.getAlpha(), -1, canvas);
        }
        if (h4Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (h4Var.getAlpha() * 255.0f));
            canvas.drawPath(this.f15697x, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.G != null) {
            float e10 = this.F.e(this.E);
            if (e10 > 0.0f) {
                float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e10);
                float l10 = this.G.l() + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
                float dp = AndroidUtilities.dp(32.0f);
                float f10 = rectF.right;
                float dp2 = rectF.top - AndroidUtilities.dp(9.66f);
                RectF rectF3 = this.B;
                rectF3.set(rectF.right - l10, (rectF.top - AndroidUtilities.dp(9.66f)) - dp, f10, dp2);
                rectF3.set(rectF3.right - (rectF3.width() * lerp), rectF3.bottom - (rectF3.height() * lerp), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - e10) * AndroidUtilities.dp(4.0f));
                Path path = this.D;
                path.rewind();
                float dp3 = AndroidUtilities.dp(8.0f);
                float f11 = rectF3.left;
                float f12 = rectF3.top;
                RectF rectF4 = this.C;
                rectF4.set(f11, f12, f11 + dp3, f12 + dp3);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f13 = rectF3.right;
                float f14 = rectF3.top;
                rectF4.set(f13 - dp3, f14, f13, f14 + dp3);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f15 = rectF3.right;
                float f16 = rectF3.bottom;
                rectF4.set(f15 - dp3, f16 - dp3, f15, f16);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - AndroidUtilities.dp(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - AndroidUtilities.dp(14.5f), rectF3.bottom + AndroidUtilities.dp(5.66f));
                path.lineTo(rectF3.right - AndroidUtilities.dp(21.0f), rectF3.bottom);
                float f17 = rectF3.left;
                float f18 = rectF3.bottom;
                rectF4.set(f17, f18 - dp3, f17 + dp3, f18);
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
        h4 h4Var = this.f15689b;
        if (view == h4Var) {
            float x10 = h4Var.getX();
            float y10 = h4Var.getY();
            float x11 = h4Var.getX() + h4Var.getWidth();
            float y11 = h4Var.getY() + h4Var.getHeight();
            RectF rectF = this.f15698y;
            rectF.set(x10, y10, x11, y11);
            AndroidUtilities.scaleRect(rectF, h4Var.getScaleX(), h4Var.getPivotX() + h4Var.getX(), h4Var.getPivotY() + h4Var.getY());
            a(canvas, rectF, AndroidUtilities.dp(10.0f), h4Var.getAlpha());
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        h4 h4Var = this.f15689b;
        h4Var.setPivotX(h4Var.getWidth() - AndroidUtilities.dp(15.0f));
        h4Var.setPivotY(h4Var.getHeight());
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.f15694r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        org.telegram.ui.Components.pc pcVar = this.f15693n;
        if (action == 0) {
            pcVar.c(contains);
            if (this.I && !contains) {
                if (!this.f15698y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                pcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (pcVar.h) {
                c(!this.I, true);
            }
            pcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            pcVar.c(false);
        }
        if (!pcVar.h && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setSelected(int i9) {
        if (this.f15692f == i9) {
            return;
        }
        this.f15692f = i9;
        AndroidUtilities.forEachViews((RecyclerView) this.f15689b, (d5.d) new e4(this, i9, 0));
    }
}
