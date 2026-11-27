package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class h8b extends FrameLayout {
    public final byte a;
    public final Object b;

    public h8b(Context context) {
        super(context);
        this.a = (byte) 9;
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
        float L2;
        ArrayList arrayList;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                k8b k8bVar = (k8b) obj;
                if (k8bVar.E > 0.0f && k8bVar.s != null) {
                    k8bVar.w.reset();
                    float width = getWidth() / k8bVar.n.getWidth();
                    k8bVar.w.postScale(width, width);
                    k8bVar.r.setLocalMatrix(k8bVar.w);
                    k8bVar.s.setAlpha((int) (k8bVar.E * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), k8bVar.s);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                zeb zebVar = (zeb) obj;
                xeb xebVar = zebVar.c;
                if (xebVar != null && xebVar.getEditField() != null) {
                    mv3 mv3Var = zebVar.W;
                    if (mv3Var != null && mv3Var.h) {
                        float x = zebVar.c.getEditField().getX() + zebVar.c.getEditField().getPaddingLeft();
                        mv3 mv3Var2 = zebVar.W;
                        zebVar.d0 = x + mv3Var2.n;
                        zebVar.a0 = mv3Var2.r;
                    } else if (zebVar.b0 != null && zebVar.c0 != null) {
                        zebVar.d0 = zebVar.c.getEditField().getX() + zebVar.c.getEditField().getPaddingLeft() + hl.L(12.0f);
                    }
                }
                if (zebVar.s && !zebVar.w && (arrayList = zebVar.x) != null && !arrayList.isEmpty() && !zebVar.y) {
                    z = true;
                } else {
                    z = false;
                }
                mm mmVar = zebVar.S;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                float e = mmVar.e(false, f);
                mm mmVar2 = zebVar.T;
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                float e2 = mmVar2.e(false, f2);
                float e3 = zebVar.e0.e(false, zebVar.d0);
                if (e <= 0.0f && e2 <= 0.0f && !z) {
                    zebVar.d.setVisibility(8);
                }
                zebVar.P.rewind();
                float left = zebVar.e.getLeft();
                int left2 = zebVar.e.getLeft();
                ArrayList arrayList2 = zebVar.x;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float y = uh9.y(44.0f, size, left2);
                mm mmVar3 = zebVar.g0;
                float f6 = mmVar3.c;
                if (f6 <= 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                float f7 = y - left;
                if (f7 > 0.0f) {
                    f6 = mmVar3.e(z2, f7);
                }
                float e4 = zebVar.f0.e(z2, (left + y) / 2.0f);
                xeb xebVar2 = zebVar.c;
                if (xebVar2 != null && xebVar2.getEditField() != null) {
                    int i2 = zebVar.h;
                    if (i2 == 0) {
                        zebVar.d.setTranslationY(((((-zebVar.c.getEditField().getHeight()) - zebVar.c.getEditField().getScrollY()) + zebVar.a0) + hl.L(5.0f)) - zebVar.c.getEditFieldBottomOffset());
                    } else if (i2 == 1) {
                        zebVar.d.setTranslationY((((((-zebVar.getMeasuredHeight()) - zebVar.c.getEditField().getScrollY()) + zebVar.a0) + hl.L(20.0f)) + zebVar.d.getHeight()) - zebVar.c.getEditFieldBottomOffset());
                    }
                }
                float f8 = f6 / 4.0f;
                float f9 = f6 / 2.0f;
                int max = (int) Math.max((zebVar.d0 - Math.max(f8, Math.min(f9, hl.L(66.0f)))) - zebVar.e.getLeft(), 0.0f);
                if (zebVar.e.getPaddingLeft() != max) {
                    f3 = 1.0f;
                    zebVar.e.setPadding(max, 0, 0, 0);
                    zebVar.e.scrollBy(zebVar.e.getPaddingLeft() - max, 0);
                } else {
                    f3 = 1.0f;
                }
                zebVar.e.setTranslationX(((int) Math.max((e3 - Math.max(f8, Math.min(f9, hl.L(66.0f)))) - zebVar.e.getLeft(), 0.0f)) - max);
                float translationX = zebVar.e.getTranslationX() + (e4 - f9) + zebVar.e.getPaddingLeft();
                float translationY = zebVar.e.getTranslationY() + zebVar.e.getTop() + zebVar.e.getPaddingTop();
                if (zebVar.h == 0) {
                    L = 0;
                } else {
                    L = hl.L(6.66f);
                }
                float f10 = translationY + L;
                float min = Math.min(zebVar.e.getTranslationX() + e4 + f9 + zebVar.e.getPaddingLeft(), zebVar.getWidth() - zebVar.d.getPaddingRight());
                float translationY2 = zebVar.e.getTranslationY() + zebVar.e.getBottom();
                if (zebVar.h == 0) {
                    i = hl.L(6.66f);
                } else {
                    i = 0;
                }
                float f11 = translationY2 - i;
                float min2 = Math.min(hl.L(9.0f), f9) * 2.0f;
                int i3 = zebVar.h;
                if (i3 == 0) {
                    RectF rectF = hl.P;
                    float f12 = f11 - min2;
                    float f13 = translationX + min2;
                    rectF.set(translationX, f12, f13, f11);
                    zebVar.P.arcTo(rectF, 90.0f, 90.0f);
                    float f14 = f10 + min2;
                    rectF.set(translationX, f10, f13, f14);
                    zebVar.P.arcTo(rectF, -180.0f, 90.0f);
                    float f15 = min - min2;
                    rectF.set(f15, f10, min, f14);
                    zebVar.P.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f15, f12, min, f11);
                    zebVar.P.arcTo(rectF, 0.0f, 90.0f);
                    zebVar.P.lineTo(hl.L(8.66f) + e3, f11);
                    zebVar.P.lineTo(e3, hl.L(6.66f) + f11);
                    zebVar.P.lineTo(e3 - hl.L(8.66f), f11);
                } else if (i3 == 1) {
                    RectF rectF2 = hl.P;
                    float f16 = min - min2;
                    float f17 = f10 + min2;
                    rectF2.set(f16, f10, min, f17);
                    zebVar.P.arcTo(rectF2, -90.0f, 90.0f);
                    float f18 = f11 - min2;
                    rectF2.set(f16, f18, min, f11);
                    zebVar.P.arcTo(rectF2, 0.0f, 90.0f);
                    float f19 = min2 + translationX;
                    rectF2.set(translationX, f18, f19, f11);
                    zebVar.P.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f10, f19, f17);
                    zebVar.P.arcTo(rectF2, -180.0f, 90.0f);
                    zebVar.P.lineTo(e3 - hl.L(8.66f), f10);
                    zebVar.P.lineTo(e3, f10 - hl.L(6.66f));
                    zebVar.P.lineTo(hl.L(8.66f) + e3, f10);
                }
                zebVar.P.close();
                if (zebVar.R == null) {
                    Paint paint = new Paint(1);
                    zebVar.R = paint;
                    paint.setPathEffect(new CornerPathEffect(hl.L(2.0f)));
                    zebVar.R.setShadowLayer(hl.L(4.33f), 0.0f, hl.L(0.33333334f), 855638016);
                    zebVar.R.setColor(aob.v0(aob.tf, zebVar.b));
                }
                if (e < f3) {
                    zebVar.Q.rewind();
                    if (zebVar.h == 0) {
                        L2 = hl.L(6.66f) + f11;
                    } else {
                        L2 = f10 - hl.L(6.66f);
                    }
                    double d = e3 - translationX;
                    double d2 = L2 - f10;
                    double d3 = e3 - min;
                    double d4 = L2 - f11;
                    zebVar.Q.addCircle(e3, L2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d2, 2.0d) + Math.pow(d, 2.0d), Math.pow(d2, 2.0d) + Math.pow(d3, 2.0d)), Math.max(Math.pow(d4, 2.0d) + Math.pow(d, 2.0d), Math.pow(d4, 2.0d) + Math.pow(d3, 2.0d))))) * e, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(zebVar.Q);
                    canvas.saveLayerAlpha(0.0f, 0.0f, zebVar.getWidth(), zebVar.getHeight(), (int) (e * 255.0f), 31);
                }
                canvas.drawPath(zebVar.P, zebVar.R);
                canvas.save();
                canvas.clipPath(zebVar.P);
                super.dispatchDraw(canvas);
                float f20 = zebVar.g0.c;
                float f21 = zebVar.f0.c;
                float f22 = f20 / 2.0f;
                float translationX2 = zebVar.e.getTranslationX() + (f21 - f22) + zebVar.e.getPaddingLeft();
                float paddingTop = zebVar.e.getPaddingTop() + zebVar.e.getTop();
                float min3 = Math.min(zebVar.e.getTranslationX() + f21 + f22 + zebVar.e.getPaddingLeft(), zebVar.getWidth() - zebVar.d.getPaddingRight());
                float bottom = zebVar.e.getBottom();
                mm mmVar4 = zebVar.U;
                if (zebVar.e.canScrollHorizontally(-1)) {
                    f4 = f3;
                } else {
                    f4 = 0.0f;
                }
                float e5 = mmVar4.e(false, f4);
                if (e5 > 0.0f) {
                    int i4 = (int) translationX2;
                    aob.F4.setBounds(i4, (int) paddingTop, hl.L(32.0f) + i4, (int) bottom);
                    aob.F4.setAlpha((int) (e5 * 255.0f));
                    aob.F4.draw(canvas);
                }
                mm mmVar5 = zebVar.V;
                if (zebVar.e.canScrollHorizontally(1)) {
                    f5 = f3;
                } else {
                    f5 = 0.0f;
                }
                float e6 = mmVar5.e(false, f5);
                if (e6 > 0.0f) {
                    int i5 = (int) min3;
                    aob.E4.setBounds(i5 - hl.L(32.0f), (int) paddingTop, i5, (int) bottom);
                    aob.E4.setAlpha((int) (e6 * 255.0f));
                    aob.E4.draw(canvas);
                }
                canvas.restore();
                if (zebVar.S.c < f3) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 9:
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
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((k8b) this.b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 5:
                float a = ((v41) this.b).a(0.03f);
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
        wk5 wk5Var;
        wk5 wk5Var2;
        a aVar2;
        a aVar3;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 3:
                boolean drawChild = super.drawChild(canvas, view, j);
                pqb pqbVar = (pqb) obj;
                aVar = ((e) pqbVar).actionBar;
                if (view == aVar) {
                    wk5Var = ((e) pqbVar).parentLayout;
                    if (wk5Var != null) {
                        wk5Var2 = ((e) pqbVar).parentLayout;
                        aVar2 = ((e) pqbVar).actionBar;
                        if (aVar2.getVisibility() == 0) {
                            aVar3 = ((e) pqbVar).actionBar;
                            i = aVar3.getMeasuredHeight();
                        }
                        ((ActionBarLayout) wk5Var2).o(canvas, i);
                    }
                }
                return drawChild;
            case 4:
                tzb tzbVar = (tzb) obj;
                if (view == tzbVar.b1 && tzbVar.isInPreviewMode()) {
                    wk5 parentLayout = tzbVar.getParentLayout();
                    ActionBarLayout actionBarLayout = (ActionBarLayout) parentLayout;
                    actionBarLayout.n(canvas, (int) (tzbVar.X * 255.0f), (int) (tzbVar.b1.getY() + tzbVar.b1.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j);
            case 8:
                if (((zqc) obj).a && view.getTag() != zqc.o0) {
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
            case 7:
                jac jacVar = (jac) this.b;
                Drawable drawable = jacVar.l1;
                drawable.setBounds(0, (int) ((jacVar.q1 - jacVar.t0) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
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
            case 7:
                jac jacVar = (jac) obj;
                if (motionEvent.getAction() == 0 && jacVar.q1 != 0 && motionEvent.getY() < jacVar.q1) {
                    jacVar.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 8:
                if (((zqc) obj).a || super.onInterceptTouchEvent(motionEvent)) {
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
            case 2:
                zeb zebVar = (zeb) obj;
                int i3 = zebVar.n;
                if (zebVar.h == 0) {
                    L = hl.L(8.0f);
                } else {
                    L = hl.L(6.66f);
                }
                int i4 = zebVar.n;
                if (zebVar.h == 0) {
                    L2 = hl.L(6.66f);
                } else {
                    L2 = hl.L(8.0f);
                }
                setPadding(i3, L, i4, L2);
                super.onMeasure(i, i2);
                return;
            case 3:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                pqb pqbVar = (pqb) obj;
                aVar = ((e) pqbVar).actionBar;
                measureChildWithMargins(aVar, i, 0, i2, 0);
                aVar2 = ((e) pqbVar).actionBar;
                int measuredHeight = aVar2.getMeasuredHeight();
                aVar3 = ((e) pqbVar).actionBar;
                if (aVar3.getVisibility() == 0) {
                    size2 -= measuredHeight;
                }
                ((FrameLayout.LayoutParams) pqbVar.p0.getLayoutParams()).topMargin = measuredHeight;
                pqbVar.p0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                measureChildWithMargins(pqbVar.r0, i, 0, i2, 0);
                return;
            case 4:
            case 5:
            default:
                super.onMeasure(i, i2);
                return;
            case 6:
                super.onMeasure(i, i2);
                ((ViewGroup.MarginLayoutParams) ((o7c) obj).M.getLayoutParams()).topMargin = hl.L(16.0f) + hl.m;
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 9:
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
            case 7:
                if (!((jac) this.b).J && super.onTouchEvent(motionEvent)) {
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
            case 10:
                super.onWindowFocusChanged(z);
                if (z) {
                    ((muc) this.b).j0(true);
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
            case 5:
                super.setPressed(z);
                ((v41) this.b).c(z);
                return;
            default:
                super.setPressed(z);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                sbb sbbVar = (sbb) obj;
                if (getTranslationY() != f && sbbVar.d1 != null) {
                    super.setTranslationY(f);
                    sbbVar.d1.y();
                    return;
                }
                return;
            case 7:
                super.setTranslationY(f);
                ((jac) obj).F0();
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
            case 2:
                zeb zebVar = (zeb) this.b;
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
                    if (zebVar.e != null) {
                        for (int i2 = 0; i2 < zebVar.e.getChildCount(); i2++) {
                            web webVar = zebVar.e;
                            if (z2) {
                                yeb yebVar = (yeb) webVar.getChildAt(i2);
                                Drawable drawable = yebVar.b;
                                if (drawable instanceof wl) {
                                    ((wl) drawable).b(yebVar);
                                }
                                yebVar.c = true;
                            } else {
                                yeb yebVar2 = (yeb) webVar.getChildAt(i2);
                                Drawable drawable2 = yebVar2.b;
                                if (drawable2 instanceof wl) {
                                    ((wl) drawable2).o(yebVar2);
                                }
                                yebVar2.c = false;
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

    public h8b(Activity activity) {
        super(activity);
        this.a = (byte) 5;
        this.b = new v41(this);
    }

    public h8b(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
