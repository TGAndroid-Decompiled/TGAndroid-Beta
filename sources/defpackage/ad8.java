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
public final class ad8 extends xma {
    public final Paint k0;
    public boolean l0;
    public boolean m0;
    public ArrayList n0;
    public final PhotoViewer o0;

    public ad8(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.o0 = photoViewer;
        Paint paint = new Paint();
        this.k0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void R() {
        float f;
        super.R();
        PhotoViewer photoViewer = this.o0;
        if (photoViewer.s1) {
            lb8 lb8Var = photoViewer.X0[0];
            if (getKeyboardHeight() <= hl.L(20.0f)) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            lb8Var.e(2, f, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.n0;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.n0 = arrayList;
            }
            arrayList.clear();
            PhotoViewer photoViewer = this.o0;
            if (photoViewer.t4 == 1 || photoViewer.n6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.n0.add(new Rect(0, ik8.D(200.0f, measuredHeight, 2), hl.L(100.0f), (hl.L(200.0f) + measuredHeight) / 2));
                this.n0.add(new Rect(measuredWidth - hl.L(100.0f), ik8.D(200.0f, measuredHeight, 2), measuredWidth, (hl.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.n0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.o0;
        photoViewer.R.m(photoViewer.h0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.o0;
        lmb m = photoViewer.R.m(getContext());
        mmb mmbVar = m.r;
        if (motionEvent.getAction() == 0) {
            m.h = motionEvent.getX();
            m.n = motionEvent.getY();
            mmbVar.e = mmbVar.w();
        } else if (mmbVar.e && Math.abs(motionEvent.getX() - m.h) < hl.e && Math.abs(motionEvent.getY() - m.n) < hl.e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            if (!mmbVar.i && mmbVar.e) {
                mmbVar.e(false);
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
        PhotoViewer photoViewer = this.o0;
        nc8 nc8Var = photoViewer.g0;
        if (nc8Var != null && nc8Var.y) {
            int measuredHeight = ((int) ((photoViewer.Z5 - 1.0f) * nc8Var.getWebView().getMeasuredHeight())) / 2;
            rec recVar = photoViewer.A1;
            if (recVar != null && recVar.j) {
                recVar.setBounds(photoViewer.g0.getLeft(), (photoViewer.g0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.X5 / photoViewer.Z5)), photoViewer.g0.getRight(), photoViewer.g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.X5 / photoViewer.Z5)));
                photoViewer.A1.draw(canvas);
            }
            cz9 cz9Var = photoViewer.B1;
            if (cz9Var != null && cz9Var.a()) {
                photoViewer.B1.setBounds(photoViewer.g0.getLeft(), (int) ((photoViewer.G.getAlpha() * hl.L(90.0f)) + hl.m), photoViewer.g0.getRight(), photoViewer.g0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.X5 / photoViewer.Z5)));
                photoViewer.B1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        PhotoViewer photoViewer = this.o0;
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
        return this.o0.Q0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296353, new t10(this, (byte) 15));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296353, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        y10 y10Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.o0;
        photoViewer.Z0(canvas);
        if (hl.m != 0 && (y10Var = photoViewer.G) != null) {
            Paint paint = this.k0;
            paint.setAlpha((int) (y10Var.getAlpha() * 255.0f * 0.498f));
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
                float alpha = (1.0f - photoViewer.G.getAlpha()) * hl.N(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad8.onLayout(boolean, int, int, int, int):void");
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
        ad8 ad8Var = this;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (ad8Var.getLayoutParams().height > 0) {
            size2 = ad8Var.getLayoutParams().height;
        }
        int i8 = size2;
        ad8Var.setMeasuredDimension(size, i8);
        PhotoViewer photoViewer = ad8Var.o0;
        boolean z = true;
        if (!photoViewer.s1) {
            ad8Var.l0 = true;
            if (photoViewer.j2) {
                Point point = hl.q;
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
            ad8Var.l0 = false;
        }
        if (photoViewer.j0.getVisibility() != 8) {
            i3 = hl.L(48.0f);
        } else {
            i3 = 0;
        }
        wd5 wd5Var = photoViewer.m1;
        if (wd5Var != null && wd5Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.m1.getLayoutParams()).bottomMargin = i3;
            i4 = i;
            ad8Var.measureChildWithMargins(photoViewer.m1, i4, 0, i2, 0);
            int measuredHeight = photoViewer.m1.getMeasuredHeight();
            ad8Var.l0 = true;
            if (!hl.O1() && i8 < size) {
                if (photoViewer.m1.getVisibility() != 4) {
                    photoViewer.m1.setVisibility(4);
                }
            } else if (photoViewer.m1.getVisibility() != 0) {
                photoViewer.m1.setVisibility(0);
            }
            ad8Var.l0 = false;
            i5 = measuredHeight;
        } else {
            i4 = i;
            i5 = 0;
        }
        kd8 kd8Var = photoViewer.i3;
        if (kd8Var != null) {
            kd8Var.e = size;
            kd8Var.f = i8;
        }
        int paddingLeft = size - (ad8Var.getPaddingLeft() + ad8Var.getPaddingRight());
        int paddingBottom = i8 - ad8Var.getPaddingBottom();
        int childCount = ad8Var.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = ad8Var.getChildAt(i9);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.m1) {
                dc8 dc8Var = photoViewer.z2;
                if (childAt == dc8Var) {
                    childAt.measure(i4, View.MeasureSpec.makeMeasureSpec(ad8Var.getMeasuredHeight(), 1073741824));
                } else if (childAt == photoViewer.x4) {
                    if (dc8Var != null && dc8Var.getVisibility() == 0) {
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
                            if (ad8Var.m0) {
                                i6 = i3 + i5;
                                int currentActionBarHeight = (paddingBottom - (a.getCurrentActionBarHeight() + hl.m)) - i6;
                                ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i6;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i6 = i3;
                            int currentActionBarHeight2 = (paddingBottom - (a.getCurrentActionBarHeight() + hl.m)) - i6;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i6;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.m1.c() && (hl.O1() || paddingBottom > paddingLeft)) {
                            i6 = i3 + i5;
                            ad8Var.m0 = z;
                            int currentActionBarHeight22 = (paddingBottom - (a.getCurrentActionBarHeight() + hl.m)) - i6;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i6;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            ad8Var.m0 = false;
                            i6 = i3;
                            int currentActionBarHeight222 = (paddingBottom - (a.getCurrentActionBarHeight() + hl.m)) - i6;
                            ((ViewGroup.MarginLayoutParams) photoViewer.U1.getLayoutParams()).bottomMargin = i6;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.Z1 && childAt != photoViewer.R0) {
                        if (childAt == photoViewer.W1.N) {
                            childAt.measure(i4, View.MeasureSpec.makeMeasureSpec(paddingBottom - (a.getCurrentActionBarHeight() + hl.m), 1073741824));
                        } else {
                            ad8Var.measureChildWithMargins(childAt, i4, 0, i2, 0);
                        }
                    } else {
                        childAt.measure(i4, View.MeasureSpec.makeMeasureSpec(paddingBottom - (a.getCurrentActionBarHeight() + hl.m), 1073741824));
                    }
                } else if (photoViewer.s) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                } else if (hl.E) {
                    if (hl.O1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(320.0f), paddingBottom - hl.m), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom - hl.m, 1073741824));
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + hl.n, 1073741824));
                }
            }
            i9++;
            z = true;
            ad8Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.l0) {
            return;
        }
        super.requestLayout();
    }
}
