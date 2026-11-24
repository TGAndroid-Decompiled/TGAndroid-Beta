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
public final class zab extends FrameLayout {
    public final byte a;
    public final Object b;

    public zab(Context context) {
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
                dbb dbbVar = (dbb) obj;
                bbb bbbVar = dbbVar.c;
                if (bbbVar != null && bbbVar.getEditField() != null) {
                    su3 su3Var = dbbVar.W;
                    if (su3Var != null && su3Var.h) {
                        float x = dbbVar.c.getEditField().getX() + dbbVar.c.getEditField().getPaddingLeft();
                        su3 su3Var2 = dbbVar.W;
                        dbbVar.d0 = x + su3Var2.n;
                        dbbVar.a0 = su3Var2.r;
                    } else if (dbbVar.b0 != null && dbbVar.c0 != null) {
                        dbbVar.d0 = dbbVar.c.getEditField().getX() + dbbVar.c.getEditField().getPaddingLeft() + gl.L(12.0f);
                    }
                }
                if (dbbVar.s && !dbbVar.w && (arrayList = dbbVar.x) != null && !arrayList.isEmpty() && !dbbVar.y) {
                    z = true;
                } else {
                    z = false;
                }
                lm lmVar = dbbVar.S;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                float e = lmVar.e(false, f);
                lm lmVar2 = dbbVar.T;
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                float e2 = lmVar2.e(false, f2);
                float e3 = dbbVar.e0.e(false, dbbVar.d0);
                if (e <= 0.0f && e2 <= 0.0f && !z) {
                    dbbVar.d.setVisibility(8);
                }
                dbbVar.P.rewind();
                float left = dbbVar.e.getLeft();
                int left2 = dbbVar.e.getLeft();
                ArrayList arrayList2 = dbbVar.x;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float y = de9.y(44.0f, size, left2);
                lm lmVar3 = dbbVar.g0;
                float f7 = lmVar3.c;
                if (f7 <= 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                float f8 = y - left;
                if (f8 > 0.0f) {
                    f7 = lmVar3.e(z2, f8);
                }
                float e4 = dbbVar.f0.e(z2, (left + y) / 2.0f);
                bbb bbbVar2 = dbbVar.c;
                if (bbbVar2 != null && bbbVar2.getEditField() != null) {
                    int i2 = dbbVar.h;
                    if (i2 == 0) {
                        dbbVar.d.setTranslationY(((((-dbbVar.c.getEditField().getHeight()) - dbbVar.c.getEditField().getScrollY()) + dbbVar.a0) + gl.L(5.0f)) - dbbVar.c.getEditFieldBottomOffset());
                    } else if (i2 == 1) {
                        dbbVar.d.setTranslationY((((((-dbbVar.getMeasuredHeight()) - dbbVar.c.getEditField().getScrollY()) + dbbVar.a0) + gl.L(20.0f)) + dbbVar.d.getHeight()) - dbbVar.c.getEditFieldBottomOffset());
                    }
                }
                float f9 = f7 / 4.0f;
                float f10 = f7 / 2.0f;
                int max = (int) Math.max((dbbVar.d0 - Math.max(f9, Math.min(f10, gl.L(66.0f)))) - dbbVar.e.getLeft(), 0.0f);
                if (dbbVar.e.getPaddingLeft() != max) {
                    f3 = 1.0f;
                    dbbVar.e.setPadding(max, 0, 0, 0);
                    dbbVar.e.scrollBy(dbbVar.e.getPaddingLeft() - max, 0);
                } else {
                    f3 = 1.0f;
                }
                dbbVar.e.setTranslationX(((int) Math.max((e3 - Math.max(f9, Math.min(f10, gl.L(66.0f)))) - dbbVar.e.getLeft(), 0.0f)) - max);
                float translationX = dbbVar.e.getTranslationX() + (e4 - f10) + dbbVar.e.getPaddingLeft();
                float translationY = dbbVar.e.getTranslationY() + dbbVar.e.getTop() + dbbVar.e.getPaddingTop();
                if (dbbVar.h == 0) {
                    L = 0;
                } else {
                    L = gl.L(6.66f);
                }
                float f11 = translationY + L;
                float min = Math.min(dbbVar.e.getTranslationX() + e4 + f10 + dbbVar.e.getPaddingLeft(), dbbVar.getWidth() - dbbVar.d.getPaddingRight());
                float translationY2 = dbbVar.e.getTranslationY() + dbbVar.e.getBottom();
                if (dbbVar.h == 0) {
                    i = gl.L(6.66f);
                } else {
                    i = 0;
                }
                float f12 = translationY2 - i;
                float min2 = Math.min(gl.L(9.0f), f10) * 2.0f;
                int i3 = dbbVar.h;
                if (i3 == 0) {
                    RectF rectF = gl.P;
                    float f13 = f12 - min2;
                    float f14 = translationX + min2;
                    rectF.set(translationX, f13, f14, f12);
                    dbbVar.P.arcTo(rectF, 90.0f, 90.0f);
                    float f15 = f11 + min2;
                    rectF.set(translationX, f11, f14, f15);
                    dbbVar.P.arcTo(rectF, -180.0f, 90.0f);
                    float f16 = min - min2;
                    rectF.set(f16, f11, min, f15);
                    dbbVar.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f16, f13, min, f12);
                    dbbVar.P.arcTo(rectF, 0.0f, 90.0f);
                    dbbVar.P.lineTo(gl.L(8.66f) + e3, f12);
                    dbbVar.P.lineTo(e3, gl.L(6.66f) + f12);
                    dbbVar.P.lineTo(e3 - gl.L(8.66f), f12);
                } else if (i3 == 1) {
                    RectF rectF2 = gl.P;
                    float f17 = min - min2;
                    float f18 = f11 + min2;
                    rectF2.set(f17, f11, min, f18);
                    dbbVar.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f19 = f12 - min2;
                    rectF2.set(f17, f19, min, f12);
                    dbbVar.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f20 = min2 + translationX;
                    rectF2.set(translationX, f19, f20, f12);
                    dbbVar.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f11, f20, f18);
                    dbbVar.P.arcTo(rectF2, -180.0f, 90.0f);
                    dbbVar.P.lineTo(e3 - gl.L(8.66f), f11);
                    dbbVar.P.lineTo(e3, f11 - gl.L(6.66f));
                    dbbVar.P.lineTo(gl.L(8.66f) + e3, f11);
                }
                dbbVar.P.close();
                if (dbbVar.R == null) {
                    Paint paint = new Paint(1);
                    dbbVar.R = paint;
                    paint.setPathEffect(new CornerPathEffect(gl.L(2.0f)));
                    dbbVar.R.setShadowLayer(gl.L(4.33f), 0.0f, gl.L(0.33333334f), 855638016);
                    dbbVar.R.setColor(bkb.v0(bkb.sf, dbbVar.b));
                }
                if (e < f3) {
                    dbbVar.Q.rewind();
                    if (dbbVar.h == 0) {
                        L2 = gl.L(6.66f) + f12;
                    } else {
                        L2 = f11 - gl.L(6.66f);
                    }
                    double d = e3 - translationX;
                    double d2 = L2 - f11;
                    f4 = 255.0f;
                    double d3 = e3 - min;
                    double d4 = L2 - f12;
                    dbbVar.Q.addCircle(e3, L2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d3, 2.0d)), Math.max(Math.pow(d4, 2.0d) + Math.pow(d, 2.0d), Math.pow(d4, 2.0d) + Math.pow(d3, 2.0d))))) * e, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(dbbVar.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, dbbVar.getWidth(), dbbVar.getHeight(), (int) (e * 255.0f), 31);
                } else {
                    f4 = 255.0f;
                }
                canvas.drawPath(dbbVar.P, dbbVar.R);
                canvas.save();
                canvas.clipPath(dbbVar.P);
                super.dispatchDraw(canvas);
                float f21 = dbbVar.g0.c;
                float f22 = dbbVar.f0.c;
                float f23 = f21 / 2.0f;
                float translationX2 = dbbVar.e.getTranslationX() + (f22 - f23) + dbbVar.e.getPaddingLeft();
                float paddingTop = dbbVar.e.getPaddingTop() + dbbVar.e.getTop();
                float min3 = Math.min(dbbVar.e.getTranslationX() + f22 + f23 + dbbVar.e.getPaddingLeft(), dbbVar.getWidth() - dbbVar.d.getPaddingRight());
                float bottom = dbbVar.e.getBottom();
                lm lmVar4 = dbbVar.U;
                if (dbbVar.e.canScrollHorizontally(-1)) {
                    f5 = f3;
                } else {
                    f5 = 0.0f;
                }
                float e5 = lmVar4.e(false, f5);
                if (e5 > 0.0f) {
                    int i4 = (int) translationX2;
                    bkb.E4.setBounds(i4, (int) paddingTop, gl.L(32.0f) + i4, (int) bottom);
                    bkb.E4.setAlpha((int) (e5 * f4));
                    bkb.E4.draw(canvas);
                }
                lm lmVar5 = dbbVar.V;
                if (dbbVar.e.canScrollHorizontally(1)) {
                    f6 = f3;
                } else {
                    f6 = 0.0f;
                }
                float e6 = lmVar5.e(false, f6);
                if (e6 > 0.0f) {
                    int i5 = (int) min3;
                    bkb.D4.setBounds(i5 - gl.L(32.0f), (int) paddingTop, i5, (int) bottom);
                    bkb.D4.setAlpha((int) (e6 * f4));
                    bkb.D4.draw(canvas);
                }
                canvas.restore();
                if (dbbVar.S.c < f3) {
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
                float a = ((n41) this.b).a(0.03f);
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
        ui5 ui5Var;
        ui5 ui5Var2;
        a aVar2;
        a aVar3;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 1:
                boolean drawChild = super.drawChild(canvas, view, j);
                qmb qmbVar = (qmb) obj;
                aVar = ((d) qmbVar).actionBar;
                if (view == aVar) {
                    ui5Var = ((d) qmbVar).parentLayout;
                    if (ui5Var != null) {
                        ui5Var2 = ((d) qmbVar).parentLayout;
                        aVar2 = ((d) qmbVar).actionBar;
                        if (aVar2.getVisibility() == 0) {
                            aVar3 = ((d) qmbVar).actionBar;
                            i = aVar3.getMeasuredHeight();
                        }
                        ((ActionBarLayout) ui5Var2).o(canvas, i);
                    }
                }
                return drawChild;
            case 2:
                qvb qvbVar = (qvb) obj;
                if (view == qvbVar.b1 && qvbVar.isInPreviewMode()) {
                    ui5 parentLayout = qvbVar.getParentLayout();
                    ActionBarLayout actionBarLayout = (ActionBarLayout) parentLayout;
                    actionBarLayout.n(canvas, (int) (qvbVar.X * 255.0f), (int) (qvbVar.b1.getY() + qvbVar.b1.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j);
            case 6:
                if (((mmc) obj).a && view.getTag() != mmc.o0) {
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
                j6c j6cVar = (j6c) this.b;
                Drawable drawable = j6cVar.l1;
                drawable.setBounds(0, (int) ((j6cVar.q1 - j6cVar.t0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
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
                j6c j6cVar = (j6c) obj;
                if (motionEvent.getAction() == 0 && j6cVar.q1 != 0 && motionEvent.getY() < j6cVar.q1) {
                    j6cVar.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 6:
                if (((mmc) obj).a || super.onInterceptTouchEvent(motionEvent)) {
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
                dbb dbbVar = (dbb) obj;
                int i3 = dbbVar.n;
                if (dbbVar.h == 0) {
                    L = gl.L(8.0f);
                } else {
                    L = gl.L(6.66f);
                }
                int i4 = dbbVar.n;
                if (dbbVar.h == 0) {
                    L2 = gl.L(6.66f);
                } else {
                    L2 = gl.L(8.0f);
                }
                setPadding(i3, L, i4, L2);
                super.onMeasure(i, i2);
                return;
            case 1:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                qmb qmbVar = (qmb) obj;
                aVar = ((d) qmbVar).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                aVar2 = ((d) qmbVar).actionBar;
                int measuredHeight = aVar2.getMeasuredHeight();
                aVar3 = ((d) qmbVar).actionBar;
                if (aVar3.getVisibility() == 0) {
                    size2 -= measuredHeight;
                }
                ((FrameLayout.LayoutParams) qmbVar.p0.getLayoutParams()).topMargin = measuredHeight;
                qmbVar.p0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                measureChildWithMargins(qmbVar.r0, i, 0, i2, 0);
                return;
            case 2:
            case 3:
            default:
                super.onMeasure(i, i2);
                return;
            case 4:
                super.onMeasure(i, i2);
                ((ViewGroup.MarginLayoutParams) ((p3c) obj).M.getLayoutParams()).topMargin = gl.L(16.0f) + gl.m;
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
                if (!((j6c) this.b).J && super.onTouchEvent(motionEvent)) {
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
                    ((ypc) this.b).j0(true);
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
                ((n41) this.b).c(z);
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
                ((j6c) this.b).E0();
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
                dbb dbbVar = (dbb) this.b;
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
                    if (dbbVar.e != null) {
                        for (int i2 = 0; i2 < dbbVar.e.getChildCount(); i2++) {
                            abb abbVar = dbbVar.e;
                            if (z2) {
                                cbb cbbVar = (cbb) abbVar.getChildAt(i2);
                                Drawable drawable = cbbVar.b;
                                if (drawable instanceof vl) {
                                    ((vl) drawable).b(cbbVar);
                                }
                                cbbVar.c = true;
                            } else {
                                cbb cbbVar2 = (cbb) abbVar.getChildAt(i2);
                                Drawable drawable2 = cbbVar2.b;
                                if (drawable2 instanceof vl) {
                                    ((vl) drawable2).o(cbbVar2);
                                }
                                cbbVar2.c = false;
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

    public zab(Activity activity) {
        super(activity);
        this.a = (byte) 3;
        this.b = new n41(this);
    }

    public zab(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
