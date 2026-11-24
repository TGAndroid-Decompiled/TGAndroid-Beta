package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.PhotoViewer;
public final class qmb extends LinearLayout {
    public final byte a;
    public Object b;

    public qmb(ContextThemeWrapper contextThemeWrapper, final u88 u88Var) {
        super(contextThemeWrapper);
        this.a = (byte) 17;
        this.b = r1;
        setOrientation(1);
        a8 c = r7.c(false, false, this, 2131232375, jb6.M0(2131744952, null), false, null);
        c.d(-328966, -328966);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r2;
                u88 u88Var2 = u88Var;
                switch (b) {
                    case 0:
                        PhotoViewer photoViewer = u88Var2.a;
                        Drawable[] drawableArr = PhotoViewer.d9;
                        photoViewer.w(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = u88Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.d9;
                        photoViewer2.w(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = u88Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.d9;
                        photoViewer3.w(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = u88Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.d9;
                        photoViewer4.w(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = u88Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.d9;
                        photoViewer5.w(true, true, 2.0f);
                        return;
                }
            }
        });
        c.setSelectorColor(268435455);
        a8 c2 = r7.c(false, false, this, 2131232379, jb6.M0(2131744955, null), false, null);
        c2.d(-328966, -328966);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r2;
                u88 u88Var2 = u88Var;
                switch (b) {
                    case 0:
                        PhotoViewer photoViewer = u88Var2.a;
                        Drawable[] drawableArr = PhotoViewer.d9;
                        photoViewer.w(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = u88Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.d9;
                        photoViewer2.w(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = u88Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.d9;
                        photoViewer3.w(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = u88Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.d9;
                        photoViewer4.w(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = u88Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.d9;
                        photoViewer5.w(true, true, 2.0f);
                        return;
                }
            }
        });
        c2.setSelectorColor(268435455);
        a8 c3 = r7.c(false, false, this, 2131232378, jb6.M0(2131744956, null), false, null);
        c3.d(-328966, -328966);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r2;
                u88 u88Var2 = u88Var;
                switch (b) {
                    case 0:
                        PhotoViewer photoViewer = u88Var2.a;
                        Drawable[] drawableArr = PhotoViewer.d9;
                        photoViewer.w(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = u88Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.d9;
                        photoViewer2.w(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = u88Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.d9;
                        photoViewer3.w(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = u88Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.d9;
                        photoViewer4.w(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = u88Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.d9;
                        photoViewer5.w(true, true, 2.0f);
                        return;
                }
            }
        });
        c3.setSelectorColor(268435455);
        a8 c4 = r7.c(false, false, this, 2131232376, jb6.M0(2131744959, null), false, null);
        c4.d(-328966, -328966);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r2;
                u88 u88Var2 = u88Var;
                switch (b) {
                    case 0:
                        PhotoViewer photoViewer = u88Var2.a;
                        Drawable[] drawableArr = PhotoViewer.d9;
                        photoViewer.w(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = u88Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.d9;
                        photoViewer2.w(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = u88Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.d9;
                        photoViewer3.w(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = u88Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.d9;
                        photoViewer4.w(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = u88Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.d9;
                        photoViewer5.w(true, true, 2.0f);
                        return;
                }
            }
        });
        c4.setSelectorColor(268435455);
        a8 c5 = r7.c(false, false, this, 2131232380, jb6.M0(2131744953, null), false, null);
        c5.d(-328966, -328966);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r2;
                u88 u88Var2 = u88Var;
                switch (b) {
                    case 0:
                        PhotoViewer photoViewer = u88Var2.a;
                        Drawable[] drawableArr = PhotoViewer.d9;
                        photoViewer.w(true, true, 0.2f);
                        return;
                    case 1:
                        PhotoViewer photoViewer2 = u88Var2.a;
                        Drawable[] drawableArr2 = PhotoViewer.d9;
                        photoViewer2.w(true, true, 0.5f);
                        return;
                    case 2:
                        PhotoViewer photoViewer3 = u88Var2.a;
                        Drawable[] drawableArr3 = PhotoViewer.d9;
                        photoViewer3.w(true, true, 1.0f);
                        return;
                    case 3:
                        PhotoViewer photoViewer4 = u88Var2.a;
                        Drawable[] drawableArr4 = PhotoViewer.d9;
                        photoViewer4.w(true, true, 1.5f);
                        return;
                    default:
                        PhotoViewer photoViewer5 = u88Var2.a;
                        Drawable[] drawableArr5 = PhotoViewer.d9;
                        photoViewer5.w(true, true, 2.0f);
                        return;
                }
            }
        });
        c5.setSelectorColor(268435455);
        a8[] a8VarArr = {c, c2, c3, c4, c5};
        View ct8Var = new ct8(contextThemeWrapper, (byte) 8);
        ct8Var.setMinimumWidth(gm.L(196.0f));
        ct8Var.setBackgroundColor(-15198184);
        addView(ct8Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ct8Var.getLayoutParams();
        if (jb6.a0) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = gm.L(8.0f);
        ct8Var.setLayoutParams(layoutParams);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        switch (this.a) {
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                float f = chatActivityEnterView.y1;
                if (f < 1.0f) {
                    if (f > 0.0f) {
                        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - chatActivityEnterView.y1) * 255.0f));
                        super.dispatchDraw(canvas);
                        canvas.restoreToCount(saveLayerAlpha);
                        return;
                    }
                    super.dispatchDraw(canvas);
                    return;
                }
                return;
            case 11:
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                cic cicVar = (cic) this.b;
                Camera camera = cicVar.M;
                camera.save();
                camera.rotateY(7.0f);
                Matrix matrix = cicVar.N;
                camera.getMatrix(matrix);
                camera.restore();
                float f2 = -width;
                float f3 = -height;
                matrix.preTranslate(f2, f3);
                float f4 = width;
                float f5 = height;
                matrix.postTranslate(f4, f5);
                canvas.save();
                canvas.clipRect(width, 0, getWidth(), getHeight());
                canvas.concat(matrix);
                super.dispatchDraw(canvas);
                canvas.restore();
                camera.save();
                camera.rotateY(-7.0f);
                Matrix matrix2 = cicVar.O;
                camera.getMatrix(matrix2);
                camera.restore();
                matrix2.preTranslate(f2, f3);
                matrix2.postTranslate(f4, f5);
                canvas.save();
                canvas.clipRect(0, 0, width, getHeight());
                canvas.concat(matrix2);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 12:
                sx8 sx8Var = (sx8) this.b;
                qmb qmbVar = sx8Var.c;
                int i = sx8Var.e;
                if (i >= 0 && i < qmbVar.getChildCount()) {
                    float width2 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                    if (qmbVar.getChildAt(sx8Var.e).getWidth() != 0) {
                        if (Float.isNaN(sx8Var.f)) {
                            sx8Var.f = width2;
                        } else {
                            float f6 = sx8Var.f;
                            if (f6 != width2) {
                                float f7 = width2 - f6;
                                if (Math.abs(f7) >= 0.5f) {
                                    width2 = (f7 * 0.3f) + sx8Var.f;
                                }
                                sx8Var.f = width2;
                                qmbVar.invalidate();
                            }
                        }
                        canvas.drawCircle(sx8Var.f, qmbVar.getHeight() / 2.0f, (sx8Var.getHeight() - gm.L(6.0f)) / 2.0f, sx8Var.d);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        View view;
        switch (this.a) {
            case 16:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.P;
                if (scrollSlidingTextTabStrip.b != null && scrollSlidingTextTabStrip.o0) {
                    if (motionEvent.getAction() == 0) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        int i2 = 0;
                        while (true) {
                            if (i2 < getChildCount()) {
                                view = getChildAt(i2);
                                if (x < view.getX() || x > view.getX() + view.getWidth() || y < view.getY() || y > view.getY() + view.getHeight()) {
                                    i2++;
                                }
                            } else {
                                view = null;
                            }
                        }
                        scrollSlidingTextTabStrip.d0 = view;
                        if (view != null && getParent() != null) {
                            sparseIntArray.get(indexOfChild(scrollSlidingTextTabStrip.d0));
                            scrollSlidingTextTabStrip.b.getClass();
                            scrollSlidingTextTabStrip.d0 = null;
                            return super.dispatchTouchEvent(motionEvent);
                        }
                    } else if (motionEvent.getAction() == 2) {
                        View view2 = scrollSlidingTextTabStrip.d0;
                        if (view2 != null) {
                            view2.setTranslationX(motionEvent.getX() - 0.0f);
                            int indexOfChild = indexOfChild(scrollSlidingTextTabStrip.d0);
                            if (scrollSlidingTextTabStrip.n == indexOfChild) {
                                scrollSlidingTextTabStrip.invalidate();
                            }
                            if (motionEvent.getX() < gm.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(-gm.L(1.0f), 0);
                            } else if (motionEvent.getX() >= getWidth() - gm.L(16.0f)) {
                                scrollSlidingTextTabStrip.scrollBy(gm.L(1.0f), 0);
                            }
                            float width = (scrollSlidingTextTabStrip.d0.getWidth() / 2.0f) + scrollSlidingTextTabStrip.d0.getX();
                            int width2 = scrollSlidingTextTabStrip.d0.getWidth();
                            if (width < 0.0f) {
                                i = 0;
                            } else {
                                i = 0;
                                while (true) {
                                    if (i < getChildCount()) {
                                        View childAt = getChildAt(i);
                                        float width3 = (childAt.getWidth() / 2.0f) + childAt.getLeft();
                                        if (width < width3 - (Math.min(width2, childAt.getWidth()) / 2.0f) || width > (Math.min(width2, childAt.getWidth()) / 2.0f) + width3) {
                                            i++;
                                        }
                                    } else {
                                        i = getChildCount() - 1;
                                    }
                                }
                            }
                            if (i != indexOfChild) {
                                kt9 kt9Var = scrollSlidingTextTabStrip.b;
                                sparseIntArray.get(i);
                                kt9Var.getClass();
                            }
                        }
                    } else if (motionEvent.getAction() == 1) {
                        View view3 = scrollSlidingTextTabStrip.d0;
                        if (view3 != null) {
                            view3.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final qmb b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    byte b = r2;
                                    qmb qmbVar = this.b;
                                    switch (b) {
                                        case 0:
                                            qmbVar.invalidate();
                                            ((ScrollSlidingTextTabStrip) qmbVar.b).invalidate();
                                            return;
                                        default:
                                            qmbVar.invalidate();
                                            ((ScrollSlidingTextTabStrip) qmbVar.b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(d53.h).start();
                        }
                        scrollSlidingTextTabStrip.d0 = null;
                    } else if (motionEvent.getAction() == 3) {
                        View view4 = scrollSlidingTextTabStrip.d0;
                        if (view4 != null) {
                            view4.animate().translationX(0.0f).translationY(0.0f).setDuration(320L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final qmb b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    byte b = r2;
                                    qmb qmbVar = this.b;
                                    switch (b) {
                                        case 0:
                                            qmbVar.invalidate();
                                            ((ScrollSlidingTextTabStrip) qmbVar.b).invalidate();
                                            return;
                                        default:
                                            qmbVar.invalidate();
                                            ((ScrollSlidingTextTabStrip) qmbVar.b).invalidate();
                                            return;
                                    }
                                }
                            }).setInterpolator(d53.h).start();
                        }
                        scrollSlidingTextTabStrip.d0 = null;
                    }
                    if (scrollSlidingTextTabStrip.d0 == null && !super.dispatchTouchEvent(motionEvent)) {
                        return false;
                    }
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 17:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                if (!((ssa) this.b).b0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 19:
                if (!((nxa) this.b).u0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 9:
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (getChildAt(i).getVisibility() == 0) {
                        super.draw(canvas);
                        return;
                    }
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 1:
                if ((view instanceof j8) && ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).O != null) {
                    return false;
                }
                return super.drawChild(canvas, view, j);
            case 2:
                if (view == ((mc0) this.b).a) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            case 8:
                boolean drawChild = super.drawChild(canvas, view, j);
                uc5 uc5Var = (uc5) this.b;
                if (view == uc5Var.b && uc5Var.y != null) {
                    int measuredHeight = uc5Var.s.getMeasuredHeight();
                    uc5Var.y.setBounds(0, measuredHeight, getMeasuredWidth(), uc5Var.y.getIntrinsicHeight() + measuredHeight);
                    uc5Var.y.draw(canvas);
                }
                return drawChild;
            case 10:
                yj8 yj8Var = (yj8) ((ny0) this.b).d;
                if (view == yj8Var.m2 && yj8Var.C2) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            case 15:
                gt9 gt9Var = (gt9) this.b;
                if (view instanceof y1b) {
                    ((y1b) view).a(gt9Var.j0);
                }
                if (view == gt9Var.s) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void invalidate() {
        switch (this.a) {
            case 0:
                super.invalidate();
                int i = 0;
                while (true) {
                    kb2[] kb2VarArr = (kb2[]) this.b;
                    if (i < kb2VarArr.length) {
                        kb2VarArr[i].invalidate();
                        i++;
                    } else {
                        return;
                    }
                }
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 23:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setVisibleToUser(((iic) this.b).B0);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 6:
                return ((fm4) this.b).d();
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 3:
                super.onLayout(z, i, i2, i3, i4);
                setPivotX(getWidth());
                return;
            case 5:
                int paddingLeft = getPaddingLeft();
                int i5 = (i4 - i2) / 2;
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt != ((lz3) this.b).s.F && childAt != null) {
                        childAt.layout(paddingLeft, i5 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i5);
                        paddingLeft = hg9.v(2.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                return;
            case 7:
                ((oq4) this.b).c.a(getMeasuredWidth());
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 16:
                super.onLayout(z, i, i2, i3, i4);
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.b;
                SparseIntArray sparseIntArray = scrollSlidingTextTabStrip.Q;
                if (scrollSlidingTextTabStrip.m0 && sparseIntArray.indexOfKey(scrollSlidingTextTabStrip.r) >= 0 && scrollSlidingTextTabStrip.a.getChildAt(sparseIntArray.get(scrollSlidingTextTabStrip.r)) != null) {
                    scrollSlidingTextTabStrip.h(sparseIntArray.get(scrollSlidingTextTabStrip.r), false);
                    scrollSlidingTextTabStrip.m0 = false;
                    return;
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        Size size;
        int i4;
        int i5;
        int i6 = i2;
        int i7 = 0;
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(123.0f), 1073741824));
                return;
            case 1:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.P) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = -1000000;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.G = -1000000;
                    int childCount = getChildCount();
                    ArrayList arrayList = null;
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    while (i8 < childCount) {
                        View childAt = getChildAt(i8);
                        if (childAt.getVisibility() != 8) {
                            Object tag = childAt.getTag(2131296741);
                            Object tag2 = childAt.getTag(2131296587);
                            Object tag3 = childAt.getTag(2131296439);
                            if (tag != null) {
                                childAt.getLayoutParams().width = -2;
                            }
                            measureChildWithMargins(childAt, i, 0, i6, 0);
                            if (tag3 == null) {
                                if (!(tag instanceof Integer)) {
                                    if (tag2 == null) {
                                        i9 = Math.max(i9, childAt.getMeasuredWidth());
                                    }
                                } else {
                                    i10 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                                    int measuredHeight = childAt.getMeasuredHeight();
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.F = measuredHeight;
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.G = gm.L(6.0f) + measuredHeight;
                                }
                            }
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(childAt);
                        }
                        i8++;
                        i6 = i2;
                    }
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        while (i7 < size2) {
                            ((View) arrayList.get(i7)).getLayoutParams().width = Math.max(i9, i10);
                            i7++;
                        }
                    }
                }
                super.onMeasure(i, i2);
                return;
            case 5:
                super.onMeasure(Math.max(View.MeasureSpec.getSize(i), View.MeasureSpec.makeMeasureSpec(gm.L(((lz3) this.b).b.getChildCount() << 5), 1073741824)), i6);
                return;
            case 6:
                fm4 fm4Var = (fm4) this.b;
                if (fm4Var.d() && (size = fm4Var.J) != null) {
                    i3 = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
                } else {
                    i3 = i;
                }
                super.onMeasure(i3, i6);
                return;
            case 9:
                int childCount2 = getChildCount();
                int i11 = 0;
                for (int i12 = 0; i12 < childCount2; i12++) {
                    if (getChildAt(i12).getVisibility() == 0) {
                        i11++;
                    }
                }
                int size3 = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
                int size4 = View.MeasureSpec.getSize(i6);
                if (i11 != 0) {
                    int min = Math.min(gm.L(56.0f), size3 / i11);
                    if (((PhotoViewer) this.b).k1.getVisibility() == 0) {
                        if (((PhotoViewer) this.b).d8 < 2) {
                            i4 = 48;
                        } else {
                            i4 = 64;
                        }
                        int max = Math.max(0, (min - gm.L(i4)) / 2);
                        ((PhotoViewer) this.b).k1.setPadding(max, 0, max, 0);
                    }
                    while (i7 < childCount2) {
                        View childAt2 = getChildAt(i7);
                        if (childAt2.getVisibility() != 8) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                        }
                        i7++;
                    }
                    setMeasuredDimension(getPaddingRight() + getPaddingLeft() + (min * i11), size4);
                    return;
                }
                setMeasuredDimension(getPaddingRight() + getPaddingLeft() + size3, size4);
                return;
            case 13:
                int size5 = View.MeasureSpec.getSize(i);
                int paddingRight = getPaddingRight() + getPaddingLeft();
                jf9 jf9Var = (jf9) this.b;
                LinearLayout linearLayout = jf9Var.n0;
                if (linearLayout != null) {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(size5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jf9Var.n0.getLayoutParams();
                    paddingRight += jf9Var.n0.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                LinearLayout linearLayout2 = jf9Var.o0;
                if (linearLayout2 != null) {
                    linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(size5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) jf9Var.o0.getLayoutParams();
                    paddingRight += jf9Var.o0.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
                LinearLayout linearLayout3 = jf9Var.p0;
                if (linearLayout3 != null) {
                    linearLayout3.measure(View.MeasureSpec.makeMeasureSpec(size5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) jf9Var.p0.getLayoutParams();
                    paddingRight += jf9Var.p0.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
                }
                jf9Var.l0 = Math.max(0, size5 - paddingRight);
                super.onMeasure(i, i2);
                return;
            case 14:
                int size6 = View.MeasureSpec.getSize(i);
                int paddingRight2 = getPaddingRight() + getPaddingLeft();
                hh9 hh9Var = (hh9) this.b;
                LinearLayout linearLayout4 = hh9Var.O;
                LinearLayout linearLayout5 = hh9Var.N;
                LinearLayout linearLayout6 = hh9Var.M;
                if (linearLayout6 != null) {
                    linearLayout6.measure(View.MeasureSpec.makeMeasureSpec(size6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) linearLayout6.getLayoutParams();
                    paddingRight2 += linearLayout6.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
                }
                if (linearLayout5 != null) {
                    linearLayout5.measure(View.MeasureSpec.makeMeasureSpec(size6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) linearLayout5.getLayoutParams();
                    paddingRight2 += linearLayout5.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
                }
                if (linearLayout4 != null) {
                    linearLayout4.measure(View.MeasureSpec.makeMeasureSpec(size6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(44.0f), 1073741824));
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) linearLayout4.getLayoutParams();
                    paddingRight2 += linearLayout4.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
                }
                hh9Var.L = Math.max(0, size6 - paddingRight2);
                super.onMeasure(i, i2);
                return;
            case 21:
                super.onMeasure(i, i2);
                if (jb6.a0) {
                    ((p1c) this.b).c.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 22:
                super.onMeasure(i, i2);
                p5c p5cVar = (p5c) this.b;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) p5cVar.c.getLayoutParams();
                if (p5cVar.a.getVisibility() == 8) {
                    i5 = gm.m;
                } else {
                    i5 = 0;
                }
                int L = gm.L(8.0f) + i5;
                if (p5cVar.P == 2 && gm.M1()) {
                    Point point = gm.q;
                    if (point.x <= point.y) {
                        i7 = gm.L(32.0f);
                    }
                }
                marginLayoutParams7.topMargin = L + i7;
                return;
            case 24:
                super.onMeasure(i, i2);
                setMeasuredDimension(getMeasuredWidth(), Math.round((1.0f - ((goc) this.b).D0) * getMeasuredHeight()));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void setAlpha(float f) {
        switch (this.a) {
            case 16:
                super.setAlpha(f);
                ((ScrollSlidingTextTabStrip) this.b).invalidate();
                return;
            default:
                super.setAlpha(f);
                return;
        }
    }

    @Override
    public final void setVisibility(int i) {
        switch (this.a) {
            case 20:
                a1b a1bVar = (a1b) this.b;
                bf0 bf0Var = a1bVar.b;
                if (getVisibility() == 8 && i == 0) {
                    a1bVar.c();
                    if (e86.e(3)) {
                        bf0Var.getImageReceiver().w0(false);
                    }
                } else if (i == 8) {
                    bf0Var.getImageReceiver().f();
                }
                super.setVisibility(i);
                return;
            default:
                super.setVisibility(i);
                return;
        }
    }

    public qmb(Context context, byte b) {
        super(context);
        this.a = b;
    }

    public qmb(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }
}
