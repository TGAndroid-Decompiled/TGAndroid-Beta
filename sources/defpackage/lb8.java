package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PhotoViewer;
public final class lb8 extends fla {
    public final Paint q0;
    public boolean r0;
    public boolean s0;
    public ArrayList t0;
    public final PhotoViewer u0;

    public lb8(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.u0 = photoViewer;
        Paint paint = new Paint();
        this.q0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void R() {
        float f;
        super.R();
        PhotoViewer photoViewer = this.u0;
        if (photoViewer.s1) {
            w98 w98Var = photoViewer.X0[0];
            if (getKeyboardHeight() <= gm.L(20.0f)) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            w98Var.e(2, f, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.t0;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.t0 = arrayList;
            }
            arrayList.clear();
            PhotoViewer photoViewer = this.u0;
            if (photoViewer.t4 == 1 || photoViewer.n6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.t0.add(new Rect(0, wi8.D(200.0f, measuredHeight, 2), gm.L(100.0f), (gm.L(200.0f) + measuredHeight) / 2));
                this.t0.add(new Rect(measuredWidth - gm.L(100.0f), wi8.D(200.0f, measuredHeight, 2), measuredWidth, (gm.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.t0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.u0;
        photoViewer.R.m(photoViewer.h0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.u0;
        rkb m = photoViewer.R.m(getContext());
        skb skbVar = m.r;
        if (motionEvent.getAction() == 0) {
            m.h = motionEvent.getX();
            m.n = motionEvent.getY();
            skbVar.e = skbVar.w();
        } else if (skbVar.e && Math.abs(motionEvent.getX() - m.h) < gm.e && Math.abs(motionEvent.getY() - m.n) < gm.e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            if (!skbVar.i && skbVar.e) {
                skbVar.e(false);
            }
        }
        if (photoViewer.R.w()) {
            photoViewer.R.m(getContext()).onTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.u0;
        ya8 ya8Var = photoViewer.g0;
        if (ya8Var != null && ya8Var.y) {
            int measuredHeight = ((int) ((photoViewer.Z5 - 1.0f) * ya8Var.getWebView().getMeasuredHeight())) / 2;
            ucc uccVar = photoViewer.A1;
            if (uccVar != null && uccVar.j) {
                uccVar.setBounds(photoViewer.g0.getLeft(), (photoViewer.g0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.X5 / photoViewer.Z5)), photoViewer.g0.getRight(), photoViewer.g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.X5 / photoViewer.Z5)));
                photoViewer.A1.draw(canvas);
            }
            lx9 lx9Var = photoViewer.B1;
            if (lx9Var != null && lx9Var.a()) {
                photoViewer.B1.setBounds(photoViewer.g0.getLeft(), (int) ((photoViewer.G.getAlpha() * gm.L(90.0f)) + gm.m), photoViewer.g0.getRight(), photoViewer.g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.X5 / photoViewer.Z5)));
                photoViewer.B1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        PhotoViewer photoViewer = this.u0;
        if (view != photoViewer.R.m(photoViewer.h0.getContext()) && view != photoViewer.r5 && view != photoViewer.y4 && view != photoViewer.z4 && view != photoViewer.Y0) {
            FrameLayout frameLayout = photoViewer.W7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.Q0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.W7.getX(), photoViewer.W7.getY(), photoViewer.W7.getX() + photoViewer.W7.getMeasuredWidth(), photoViewer.W7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.z2 && view != photoViewer.x4) {
                    if (super.drawChild(canvas, view, j)) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getBottomPadding() {
        return this.u0.Q0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new s20(this, (byte) 14));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x20 x20Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.u0;
        photoViewer.Z0(canvas);
        if (gm.m != 0 && (x20Var = photoViewer.G) != null) {
            Paint paint = this.q0;
            paint.setAlpha((int) (x20Var.getAlpha() * 255.0f * 0.498f));
            if (getPaddingRight() > 0) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() - getPaddingRight(), 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            } else {
                canvas2 = canvas;
            }
            if (getPaddingLeft() > 0) {
                canvas2.drawRect(0.0f, 0.0f, getPaddingLeft(), getMeasuredHeight(), paint);
            }
            if (getPaddingBottom() > 0) {
                float alpha = (1.0f - photoViewer.G.getAlpha()) * gm.N(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb8.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int q;
        int o;
        View view;
        int i7;
        lb8 lb8Var = this;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (lb8Var.getLayoutParams().height > 0) {
            size2 = lb8Var.getLayoutParams().height;
        }
        int i8 = size2;
        lb8Var.setMeasuredDimension(size, i8);
        PhotoViewer photoViewer = lb8Var.u0;
        boolean z = true;
        if (!photoViewer.s1) {
            lb8Var.r0 = true;
            if (photoViewer.j2) {
                Point point = gm.q;
                if (point.x > point.y) {
                    i7 = 5;
                } else {
                    i7 = 10;
                }
                photoViewer.R1.getCurrentView().setMaxLines(i7);
                photoViewer.R1.getNextView().setMaxLines(i7);
            } else {
                photoViewer.R1.getCurrentView().setMaxLines(Integer.MAX_VALUE);
                photoViewer.R1.getNextView().setMaxLines(Integer.MAX_VALUE);
            }
            lb8Var.r0 = false;
        }
        if (photoViewer.j0.getVisibility() != 8) {
            i3 = gm.L(48.0f);
        } else {
            i3 = 0;
        }
        td5 td5Var = photoViewer.m1;
        if (td5Var != null && td5Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.m1.getLayoutParams()).bottomMargin = i3;
            i4 = i;
            lb8Var.measureChildWithMargins(photoViewer.m1, i4, 0, i2, 0);
            int measuredHeight = photoViewer.m1.getMeasuredHeight();
            lb8Var.r0 = true;
            if (!gm.O1() && i8 < size) {
                if (photoViewer.m1.getVisibility() != 4) {
                    photoViewer.m1.setVisibility(4);
                }
            } else if (photoViewer.m1.getVisibility() != 0) {
                photoViewer.m1.setVisibility(0);
            }
            lb8Var.r0 = false;
            i5 = measuredHeight;
        } else {
            i4 = i;
            i5 = 0;
        }
        vb8 vb8Var = photoViewer.i3;
        if (vb8Var != null) {
            vb8Var.e = size;
            vb8Var.f = i8;
        }
        int paddingLeft = size - (lb8Var.getPaddingLeft() + lb8Var.getPaddingRight());
        int paddingBottom = i8 - lb8Var.getPaddingBottom();
        int childCount = lb8Var.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = lb8Var.getChildAt(i9);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.m1) {
                oa8 oa8Var = photoViewer.z2;
                if (childAt == oa8Var) {
                    childAt.measure(i4, View.MeasureSpec.makeMeasureSpec(lb8Var.getMeasuredHeight(), 1073741824));
                } else if (childAt == photoViewer.x4) {
                    if (oa8Var != null && oa8Var.getVisibility() == 0) {
                        if (photoViewer.E2) {
                            view = photoViewer.D2;
                        } else {
                            view = photoViewer.C2;
                        }
                        q = view.getMeasuredWidth();
                        o = view.getMeasuredHeight();
                    } else {
                        q = photoViewer.B4.q();
                        o = photoViewer.B4.o();
                    }
                    if (q == 0 || o == 0) {
                        q = paddingLeft;
                        o = paddingBottom;
                    }
                    photoViewer.x4.measure(View.MeasureSpec.makeMeasureSpec(q, 1073741824), View.MeasureSpec.makeMeasureSpec(o, 1073741824));
                } else if (!photoViewer.V1.f.l(childAt) && !photoViewer.W1.f.l(childAt)) {
                    if (childAt == photoViewer.U1) {
                        if (photoViewer.n2) {
                            if (lb8Var.s0) {
                                i6 = i3 + i5;
                                int currentActionBarHeight = (paddingBottom - (a.getCurrentActionBarHeight() + gm.m)) - i6;
                                ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i6;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i6 = i3;
                            int currentActionBarHeight2 = (paddingBottom - (a.getCurrentActionBarHeight() + gm.m)) - i6;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i6;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.m1.c() && (gm.O1() || paddingBottom > paddingLeft)) {
                            i6 = i3 + i5;
                            lb8Var.s0 = z;
                            int currentActionBarHeight22 = (paddingBottom - (a.getCurrentActionBarHeight() + gm.m)) - i6;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i6;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            lb8Var.s0 = false;
                            i6 = i3;
                            int currentActionBarHeight222 = (paddingBottom - (a.getCurrentActionBarHeight() + gm.m)) - i6;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i6;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.Z1 && childAt != photoViewer.R0) {
                        if (childAt == photoViewer.W1.N) {
                            childAt.measure(i4, View.MeasureSpec.makeMeasureSpec(paddingBottom - (a.getCurrentActionBarHeight() + gm.m), 1073741824));
                        } else {
                            lb8Var.measureChildWithMargins(childAt, i4, 0, i2, 0);
                        }
                    } else {
                        childAt.measure(i4, View.MeasureSpec.makeMeasureSpec(paddingBottom - (a.getCurrentActionBarHeight() + gm.m), 1073741824));
                    }
                } else if (photoViewer.s) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                } else if (gm.E) {
                    if (gm.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(320.0f), paddingBottom - gm.m), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom - gm.m, 1073741824));
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + gm.n, 1073741824));
                }
            }
            i9++;
            z = true;
            lb8Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.r0) {
            return;
        }
        super.requestLayout();
    }
}
