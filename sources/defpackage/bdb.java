package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class bdb extends FrameLayout {
    public final byte a;
    public final Object b;

    public bdb(Context context) {
        super(context);
        this.a = (byte) 7;
        this.b = new Path();
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        int size;
        boolean z2;
        float f3;
        int L;
        int i;
        float f4;
        float f5;
        float f6;
        float L2;
        ArrayList arrayList;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fdb fdbVar = (fdb) obj;
                ddb ddbVar = fdbVar.c;
                if (ddbVar != null && ddbVar.getEditField() != null) {
                    dw3 dw3Var = fdbVar.W;
                    if (dw3Var != null && dw3Var.h) {
                        float x = fdbVar.c.getEditField().getX() + fdbVar.c.getEditField().getPaddingLeft();
                        dw3 dw3Var2 = fdbVar.W;
                        fdbVar.d0 = x + dw3Var2.n;
                        fdbVar.a0 = dw3Var2.r;
                    } else if (fdbVar.b0 != null && fdbVar.c0 != null) {
                        fdbVar.d0 = fdbVar.c.getEditField().getX() + fdbVar.c.getEditField().getPaddingLeft() + gm.L(12.0f);
                    }
                }
                if (fdbVar.s && !fdbVar.w && (arrayList = fdbVar.x) != null && !arrayList.isEmpty() && !fdbVar.y) {
                    z = true;
                } else {
                    z = false;
                }
                ln lnVar = fdbVar.S;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                float e = lnVar.e(false, f);
                ln lnVar2 = fdbVar.T;
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                float e2 = lnVar2.e(false, f2);
                float e3 = fdbVar.e0.e(false, fdbVar.d0);
                if (e <= 0.0f && e2 <= 0.0f && !z) {
                    fdbVar.d.setVisibility(8);
                }
                fdbVar.P.rewind();
                float left = fdbVar.e.getLeft();
                int left2 = fdbVar.e.getLeft();
                ArrayList arrayList2 = fdbVar.x;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float y = hg9.y(44.0f, size, left2);
                ln lnVar3 = fdbVar.g0;
                float f7 = lnVar3.c;
                if (f7 <= 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                float f8 = y - left;
                if (f8 > 0.0f) {
                    f7 = lnVar3.e(z2, f8);
                }
                float e4 = fdbVar.f0.e(z2, (left + y) / 2.0f);
                ddb ddbVar2 = fdbVar.c;
                if (ddbVar2 != null && ddbVar2.getEditField() != null) {
                    int i2 = fdbVar.h;
                    if (i2 == 0) {
                        fdbVar.d.setTranslationY(((((-fdbVar.c.getEditField().getHeight()) - fdbVar.c.getEditField().getScrollY()) + fdbVar.a0) + gm.L(5.0f)) - fdbVar.c.getEditFieldBottomOffset());
                    } else if (i2 == 1) {
                        fdbVar.d.setTranslationY((((((-fdbVar.getMeasuredHeight()) - fdbVar.c.getEditField().getScrollY()) + fdbVar.a0) + gm.L(20.0f)) + fdbVar.d.getHeight()) - fdbVar.c.getEditFieldBottomOffset());
                    }
                }
                float f9 = f7 / 4.0f;
                float f10 = f7 / 2.0f;
                int max = (int) Math.max((fdbVar.d0 - Math.max(f9, Math.min(f10, gm.L(66.0f)))) - fdbVar.e.getLeft(), 0.0f);
                if (fdbVar.e.getPaddingLeft() != max) {
                    f3 = 1.0f;
                    fdbVar.e.setPadding(max, 0, 0, 0);
                    fdbVar.e.scrollBy(fdbVar.e.getPaddingLeft() - max, 0);
                } else {
                    f3 = 1.0f;
                }
                fdbVar.e.setTranslationX(((int) Math.max((e3 - Math.max(f9, Math.min(f10, gm.L(66.0f)))) - fdbVar.e.getLeft(), 0.0f)) - max);
                float translationX = fdbVar.e.getTranslationX() + (e4 - f10) + fdbVar.e.getPaddingLeft();
                float translationY = fdbVar.e.getTranslationY() + fdbVar.e.getTop() + fdbVar.e.getPaddingTop();
                if (fdbVar.h == 0) {
                    L = 0;
                } else {
                    L = gm.L(6.66f);
                }
                float f11 = translationY + L;
                float min = Math.min(fdbVar.e.getTranslationX() + e4 + f10 + fdbVar.e.getPaddingLeft(), fdbVar.getWidth() - fdbVar.d.getPaddingRight());
                float translationY2 = fdbVar.e.getTranslationY() + fdbVar.e.getBottom();
                if (fdbVar.h == 0) {
                    i = gm.L(6.66f);
                } else {
                    i = 0;
                }
                float f12 = translationY2 - i;
                float min2 = Math.min(gm.L(9.0f), f10) * 2.0f;
                int i3 = fdbVar.h;
                if (i3 == 0) {
                    RectF rectF = gm.P;
                    float f13 = f12 - min2;
                    float f14 = translationX + min2;
                    rectF.set(translationX, f13, f14, f12);
                    fdbVar.P.arcTo(rectF, 90.0f, 90.0f);
                    float f15 = f11 + min2;
                    rectF.set(translationX, f11, f14, f15);
                    fdbVar.P.arcTo(rectF, -180.0f, 90.0f);
                    float f16 = min - min2;
                    rectF.set(f16, f11, min, f15);
                    fdbVar.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f16, f13, min, f12);
                    fdbVar.P.arcTo(rectF, 0.0f, 90.0f);
                    fdbVar.P.lineTo(gm.L(8.66f) + e3, f12);
                    fdbVar.P.lineTo(e3, gm.L(6.66f) + f12);
                    fdbVar.P.lineTo(e3 - gm.L(8.66f), f12);
                } else if (i3 == 1) {
                    RectF rectF2 = gm.P;
                    float f17 = min - min2;
                    float f18 = f11 + min2;
                    rectF2.set(f17, f11, min, f18);
                    fdbVar.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f19 = f12 - min2;
                    rectF2.set(f17, f19, min, f12);
                    fdbVar.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f20 = min2 + translationX;
                    rectF2.set(translationX, f19, f20, f12);
                    fdbVar.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f11, f20, f18);
                    fdbVar.P.arcTo(rectF2, -180.0f, 90.0f);
                    fdbVar.P.lineTo(e3 - gm.L(8.66f), f11);
                    fdbVar.P.lineTo(e3, f11 - gm.L(6.66f));
                    fdbVar.P.lineTo(gm.L(8.66f) + e3, f11);
                }
                fdbVar.P.close();
                if (fdbVar.R == null) {
                    Paint paint = new Paint(1);
                    fdbVar.R = paint;
                    paint.setPathEffect(new CornerPathEffect(gm.L(2.0f)));
                    fdbVar.R.setShadowLayer(gm.L(4.33f), 0.0f, gm.L(0.33333334f), 855638016);
                    fdbVar.R.setColor(cmb.v0(cmb.sf, fdbVar.b));
                }
                if (e < f3) {
                    fdbVar.Q.rewind();
                    if (fdbVar.h == 0) {
                        L2 = gm.L(6.66f) + f12;
                    } else {
                        L2 = f11 - gm.L(6.66f);
                    }
                    double d = e3 - translationX;
                    double d2 = L2 - f11;
                    f4 = 255.0f;
                    double d3 = e3 - min;
                    double d4 = L2 - f12;
                    fdbVar.Q.addCircle(e3, L2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d3, 2.0d)), Math.max(Math.pow(d4, 2.0d) + Math.pow(d, 2.0d), Math.pow(d4, 2.0d) + Math.pow(d3, 2.0d))))) * e, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(fdbVar.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, fdbVar.getWidth(), fdbVar.getHeight(), (int) (e * 255.0f), 31);
                } else {
                    f4 = 255.0f;
                }
                canvas.drawPath(fdbVar.P, fdbVar.R);
                canvas.save();
                canvas.clipPath(fdbVar.P);
                super.dispatchDraw(canvas);
                float f21 = fdbVar.g0.c;
                float f22 = fdbVar.f0.c;
                float f23 = f21 / 2.0f;
                float translationX2 = fdbVar.e.getTranslationX() + (f22 - f23) + fdbVar.e.getPaddingLeft();
                float paddingTop = fdbVar.e.getPaddingTop() + fdbVar.e.getTop();
                float min3 = Math.min(fdbVar.e.getTranslationX() + f22 + f23 + fdbVar.e.getPaddingLeft(), fdbVar.getWidth() - fdbVar.d.getPaddingRight());
                float bottom = fdbVar.e.getBottom();
                ln lnVar4 = fdbVar.U;
                if (fdbVar.e.canScrollHorizontally(-1)) {
                    f5 = f3;
                } else {
                    f5 = 0.0f;
                }
                float e5 = lnVar4.e(false, f5);
                if (e5 > 0.0f) {
                    int i4 = (int) translationX2;
                    cmb.E4.setBounds(i4, (int) paddingTop, gm.L(32.0f) + i4, (int) bottom);
                    cmb.E4.setAlpha((int) (e5 * f4));
                    cmb.E4.draw(canvas);
                }
                ln lnVar5 = fdbVar.V;
                if (fdbVar.e.canScrollHorizontally(1)) {
                    f6 = f3;
                } else {
                    f6 = 0.0f;
                }
                float e6 = lnVar5.e(false, f6);
                if (e6 > 0.0f) {
                    int i5 = (int) min3;
                    cmb.D4.setBounds(i5 - gm.L(32.0f), (int) paddingTop, i5, (int) bottom);
                    cmb.D4.setAlpha((int) (e6 * f4));
                    cmb.D4.draw(canvas);
                }
                canvas.restore();
                if (fdbVar.S.c < f3) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 7:
                int save = canvas.save();
                canvas.clipPath((Path) obj);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 3:
                float a = ((u51) this.b).a(0.03f);
                canvas.save();
                canvas.scale(a, a, getWidth() / 2.0f, getHeight() / 2.0f);
                super.draw(canvas);
                canvas.restore();
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        tk5 tk5Var;
        tk5 tk5Var2;
        a aVar2;
        a aVar3;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 1:
                boolean drawChild = super.drawChild(canvas, view, j);
                rob robVar = (rob) obj;
                aVar = ((d) robVar).actionBar;
                if (view == aVar) {
                    tk5Var = ((d) robVar).parentLayout;
                    if (tk5Var != null) {
                        tk5Var2 = ((d) robVar).parentLayout;
                        aVar2 = ((d) robVar).actionBar;
                        if (aVar2.getVisibility() == 0) {
                            aVar3 = ((d) robVar).actionBar;
                            i = aVar3.getMeasuredHeight();
                        }
                        ((ActionBarLayout) tk5Var2).o(canvas, i);
                    }
                }
                return drawChild;
            case 2:
                sxb sxbVar = (sxb) obj;
                if (view == sxbVar.b1 && sxbVar.isInPreviewMode()) {
                    tk5 parentLayout = sxbVar.getParentLayout();
                    ActionBarLayout actionBarLayout = (ActionBarLayout) parentLayout;
                    actionBarLayout.n(canvas, (int) (sxbVar.X * 255.0f), (int) (sxbVar.b1.getY() + sxbVar.b1.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j);
            case 6:
                if (((moc) obj).a && view.getTag() != moc.o0) {
                    return false;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 5:
                k8c k8cVar = (k8c) this.b;
                Drawable drawable = k8cVar.l1;
                drawable.setBounds(0, (int) ((k8cVar.q1 - k8cVar.t0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                k8c k8cVar = (k8c) obj;
                if (motionEvent.getAction() == 0 && k8cVar.q1 != 0 && motionEvent.getY() < k8cVar.q1) {
                    k8cVar.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 6:
                if (((moc) obj).a || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        int L2;
        a aVar;
        a aVar2;
        a aVar3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fdb fdbVar = (fdb) obj;
                int i3 = fdbVar.n;
                if (fdbVar.h == 0) {
                    L = gm.L(8.0f);
                } else {
                    L = gm.L(6.66f);
                }
                int i4 = fdbVar.n;
                if (fdbVar.h == 0) {
                    L2 = gm.L(6.66f);
                } else {
                    L2 = gm.L(8.0f);
                }
                setPadding(i3, L, i4, L2);
                super.onMeasure(i, i2);
                return;
            case 1:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                rob robVar = (rob) obj;
                aVar = ((d) robVar).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                aVar2 = ((d) robVar).actionBar;
                int measuredHeight = aVar2.getMeasuredHeight();
                aVar3 = ((d) robVar).actionBar;
                if (aVar3.getVisibility() == 0) {
                    size2 -= measuredHeight;
                }
                ((FrameLayout.LayoutParams) robVar.p0.getLayoutParams()).topMargin = measuredHeight;
                robVar.p0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                measureChildWithMargins(robVar.r0, i, 0, i2, 0);
                return;
            case 2:
            case 3:
            default:
                super.onMeasure(i, i2);
                return;
            case 4:
                super.onMeasure(i, i2);
                ((ViewGroup.MarginLayoutParams) ((p5c) obj).M.getLayoutParams()).topMargin = gm.L(16.0f) + gm.m;
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 7:
                super.onSizeChanged(i, i2, i3, i4);
                Path path = (Path) this.b;
                float paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
                float paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
                path.rewind();
                path.addRoundRect(0.0f, 0.0f, paddingLeft, paddingTop, (paddingLeft * 0.15f) / 2.0f, (0.15f * paddingTop) / 1.212122f, Path.Direction.CW);
                path.offset(getPaddingLeft(), getPaddingTop());
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                if (!((k8c) this.b).J && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onWindowFocusChanged(boolean z) {
        switch (this.a) {
            case 8:
                super.onWindowFocusChanged(z);
                if (z) {
                    ((asc) this.b).k0(true);
                    return;
                }
                return;
            default:
                super.onWindowFocusChanged(z);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z) {
        switch (this.a) {
            case 3:
                super.setPressed(z);
                ((u51) this.b).c(z);
                return;
            default:
                super.setPressed(z);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 5:
                super.setTranslationY(f);
                ((k8c) this.b).E0();
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                fdb fdbVar = (fdb) this.b;
                if (getVisibility() == i) {
                    z = true;
                } else {
                    z = false;
                }
                super.setVisibility(i);
                if (!z) {
                    if (i == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fdbVar.e != null) {
                        for (int i2 = 0; i2 < fdbVar.e.getChildCount(); i2++) {
                            cdb cdbVar = fdbVar.e;
                            if (z2) {
                                edb edbVar = (edb) cdbVar.getChildAt(i2);
                                Drawable drawable = edbVar.b;
                                if (drawable instanceof vm) {
                                    ((vm) drawable).b(edbVar);
                                }
                                edbVar.c = true;
                            } else {
                                edb edbVar2 = (edb) cdbVar.getChildAt(i2);
                                Drawable drawable2 = edbVar2.b;
                                if (drawable2 instanceof vm) {
                                    ((vm) drawable2).o(edbVar2);
                                }
                                edbVar2.c = false;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    public bdb(Activity activity) {
        super(activity);
        this.a = (byte) 3;
        this.b = new u51(this);
    }

    public bdb(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
