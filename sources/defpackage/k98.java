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
public final class k98 extends dja {
    public final Paint q0;
    public boolean r0;
    public boolean s0;
    public ArrayList t0;
    public final PhotoViewer u0;

    public k98(PhotoViewer photoViewer, Activity activity, Activity activity2) {
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
            u78 u78Var = photoViewer.X0[0];
            if (getKeyboardHeight() <= gl.L(20.0f)) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            u78Var.e(2, f, true);
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
            if (photoViewer.u4 == 1 || photoViewer.o6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.t0.add(new Rect(0, ug8.D(200.0f, measuredHeight, 2), gl.L(100.0f), (gl.L(200.0f) + measuredHeight) / 2));
                this.t0.add(new Rect(measuredWidth - gl.L(100.0f), ug8.D(200.0f, measuredHeight, 2), measuredWidth, (gl.L(200.0f) + measuredHeight) / 2));
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
        qib m = photoViewer.R.m(getContext());
        rib ribVar = m.r;
        if (motionEvent.getAction() == 0) {
            m.h = motionEvent.getX();
            m.n = motionEvent.getY();
            ribVar.e = ribVar.w();
        } else if (ribVar.e && Math.abs(motionEvent.getX() - m.h) < gl.e && Math.abs(motionEvent.getY() - m.n) < gl.e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            if (!ribVar.i && ribVar.e) {
                ribVar.e(false);
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
        x88 x88Var = photoViewer.g0;
        if (x88Var != null && x88Var.y) {
            int measuredHeight = ((int) ((photoViewer.a6 - 1.0f) * x88Var.getWebView().getMeasuredHeight())) / 2;
            rac racVar = photoViewer.A1;
            if (racVar != null && racVar.j) {
                racVar.setBounds(photoViewer.g0.getLeft(), (photoViewer.g0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.Y5 / photoViewer.a6)), photoViewer.g0.getRight(), photoViewer.g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.a6)));
                photoViewer.A1.draw(canvas);
            }
            iv9 iv9Var = photoViewer.B1;
            if (iv9Var != null && iv9Var.a()) {
                photoViewer.B1.setBounds(photoViewer.g0.getLeft(), (int) ((photoViewer.G.getAlpha() * gl.L(90.0f)) + gl.m), photoViewer.g0.getRight(), photoViewer.g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.a6)));
                photoViewer.B1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        PhotoViewer photoViewer = this.u0;
        if (view != photoViewer.R.m(photoViewer.h0.getContext()) && view != photoViewer.s5 && view != photoViewer.z4 && view != photoViewer.A4 && view != photoViewer.Y0) {
            FrameLayout frameLayout = photoViewer.X7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.Q0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.X7.getX(), photoViewer.X7.getY(), photoViewer.X7.getX() + photoViewer.X7.getMeasuredWidth(), photoViewer.X7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.z2 && view != photoViewer.y4) {
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
        setTag(2131296353, new s10(this, (byte) 14));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x10 x10Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.f9;
        PhotoViewer photoViewer = this.u0;
        photoViewer.Y0(canvas);
        if (gl.m != 0 && (x10Var = photoViewer.G) != null) {
            Paint paint = this.q0;
            paint.setAlpha((int) (x10Var.getAlpha() * 255.0f * 0.498f));
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
                float alpha = (1.0f - photoViewer.G.getAlpha()) * gl.N(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k98.onLayout(boolean, int, int, int, int):void");
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
        k98 k98Var = this;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (k98Var.getLayoutParams().height > 0) {
            size2 = k98Var.getLayoutParams().height;
        }
        int i8 = size2;
        k98Var.setMeasuredDimension(size, i8);
        PhotoViewer photoViewer = k98Var.u0;
        boolean z = true;
        if (!photoViewer.s1) {
            k98Var.r0 = true;
            if (photoViewer.j2) {
                Point point = gl.q;
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
            k98Var.r0 = false;
        }
        if (photoViewer.j0.getVisibility() != 8) {
            i3 = gl.L(48.0f);
        } else {
            i3 = 0;
        }
        vb5 vb5Var = photoViewer.m1;
        if (vb5Var != null && vb5Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.m1.getLayoutParams()).bottomMargin = i3;
            i4 = i;
            k98Var.measureChildWithMargins(photoViewer.m1, i4, 0, i2, 0);
            int measuredHeight = photoViewer.m1.getMeasuredHeight();
            k98Var.r0 = true;
            if (!gl.O1() && i8 < size) {
                if (photoViewer.m1.getVisibility() != 4) {
                    photoViewer.m1.setVisibility(4);
                }
            } else if (photoViewer.m1.getVisibility() != 0) {
                photoViewer.m1.setVisibility(0);
            }
            k98Var.r0 = false;
            i5 = measuredHeight;
        } else {
            i4 = i;
            i5 = 0;
        }
        u98 u98Var = photoViewer.i3;
        if (u98Var != null) {
            u98Var.e = size;
            u98Var.f = i8;
        }
        int paddingLeft = size - (k98Var.getPaddingLeft() + k98Var.getPaddingRight());
        int paddingBottom = i8 - k98Var.getPaddingBottom();
        int childCount = k98Var.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = k98Var.getChildAt(i9);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.m1) {
                m88 m88Var = photoViewer.z2;
                if (childAt == m88Var) {
                    childAt.measure(i4, View.MeasureSpec.makeMeasureSpec(k98Var.getMeasuredHeight(), 1073741824));
                } else if (childAt == photoViewer.y4) {
                    if (m88Var != null && m88Var.getVisibility() == 0) {
                        if (photoViewer.E2) {
                            view = photoViewer.D2;
                        } else {
                            view = photoViewer.C2;
                        }
                        q = view.getMeasuredWidth();
                        o = view.getMeasuredHeight();
                    } else {
                        q = photoViewer.C4.q();
                        o = photoViewer.C4.o();
                    }
                    if (q == 0 || o == 0) {
                        q = paddingLeft;
                        o = paddingBottom;
                    }
                    photoViewer.y4.measure(View.MeasureSpec.makeMeasureSpec(q, 1073741824), View.MeasureSpec.makeMeasureSpec(o, 1073741824));
                } else if (!photoViewer.V1.f.l(childAt) && !photoViewer.W1.f.l(childAt)) {
                    if (childAt == photoViewer.U1) {
                        if (photoViewer.n2) {
                            if (k98Var.s0) {
                                i6 = i3 + i5;
                                int currentActionBarHeight = (paddingBottom - (a.getCurrentActionBarHeight() + gl.m)) - i6;
                                ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i6;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i6 = i3;
                            int currentActionBarHeight2 = (paddingBottom - (a.getCurrentActionBarHeight() + gl.m)) - i6;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i6;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.m1.c() && (gl.O1() || paddingBottom > paddingLeft)) {
                            i6 = i3 + i5;
                            k98Var.s0 = z;
                            int currentActionBarHeight22 = (paddingBottom - (a.getCurrentActionBarHeight() + gl.m)) - i6;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i6;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            k98Var.s0 = false;
                            i6 = i3;
                            int currentActionBarHeight222 = (paddingBottom - (a.getCurrentActionBarHeight() + gl.m)) - i6;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i6;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.Z1 && childAt != photoViewer.R0) {
                        if (childAt == photoViewer.W1.N) {
                            childAt.measure(i4, View.MeasureSpec.makeMeasureSpec(paddingBottom - (a.getCurrentActionBarHeight() + gl.m), 1073741824));
                        } else {
                            k98Var.measureChildWithMargins(childAt, i4, 0, i2, 0);
                        }
                    } else {
                        childAt.measure(i4, View.MeasureSpec.makeMeasureSpec(paddingBottom - (a.getCurrentActionBarHeight() + gl.m), 1073741824));
                    }
                } else if (photoViewer.s) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                } else if (gl.E) {
                    if (gl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(320.0f), paddingBottom - gl.m), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom - gl.m, 1073741824));
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + gl.n, 1073741824));
                }
            }
            i9++;
            z = true;
            k98Var = this;
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
