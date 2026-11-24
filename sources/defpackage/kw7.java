package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.PhotoViewer;
public final class kw7 extends FrameLayout {
    public Bitmap a;
    public HashMap b;
    public boolean c;
    public BitmapDrawable d;
    public boolean e;
    public boolean f;
    public jw7 h;
    public boolean n;
    public final ei7 r;

    public kw7(Context context) {
        super(context);
        this.e = true;
        this.r = new ei7(this, (byte) 4);
    }

    public final void a() {
        this.a = null;
        this.d = null;
        setBackground(null);
        HashMap hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
        removeAllViews();
    }

    public final void b(java.util.ArrayList r26, boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw7.b(java.util.ArrayList, boolean, boolean, boolean):void");
    }

    public final void c() {
        this.f = false;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setVisibility(0);
        }
        setBackground(this.d);
    }

    public final void d() {
        jw7 jw7Var;
        long j;
        boolean z;
        if (this.b != null && (jw7Var = this.h) != null) {
            PhotoViewer photoViewer = ((u88) jw7Var).a;
            Drawable[] drawableArr = PhotoViewer.d9;
            ndc ndcVar = photoViewer.G2;
            if (ndcVar != null) {
                j = ndcVar.S();
            } else {
                j = 0;
            }
            for (Map.Entry entry : this.b.entrySet()) {
                pcc pccVar = (pcc) entry.getValue();
                if (pccVar.a == 11) {
                    boolean z2 = true;
                    int i = 0;
                    if (!this.f && j >= pccVar.V && j < pccVar.W) {
                        z = true;
                    } else {
                        z = false;
                    }
                    View view = (View) entry.getKey();
                    if (view.getVisibility() != 0) {
                        z2 = false;
                    }
                    if (z2 != z) {
                        if (!z) {
                            i = 4;
                        }
                        view.setVisibility(i);
                    }
                    if (z && (view instanceof dv3)) {
                        ((dv3) view).A(j);
                    }
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.e) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    public Bitmap getBitmap() {
        return this.a;
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float max = Math.max(measuredWidth / gm.L(120.0f), measuredHeight / gm.L(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = 1.0f / max;
        canvas.scale(f, f);
        draw(canvas);
        return createBitmap;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ei7 ei7Var = this.r;
        removeCallbacks(ei7Var);
        if (this.n) {
            postOnAnimation(ei7Var);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.r);
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                pcc pccVar = (pcc) this.b.get(childAt);
                if (pccVar != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof dv3) {
                        if (pccVar.A) {
                            i5 = ((int) (((pccVar.f / 2.0f) + pccVar.c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i7 = (int) (((pccVar.g / 2.0f) + pccVar.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i5 = ((int) (measuredWidth * pccVar.y)) - (childAt.getMeasuredWidth() / 2);
                            i7 = (int) (measuredHeight2 * pccVar.z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i6 = i7 - measuredHeight;
                    } else {
                        i5 = (int) (measuredWidth * pccVar.c);
                        i6 = (int) (measuredHeight2 * pccVar.d);
                    }
                    childAt.layout(i5, i6, measuredWidth2 + i5, measuredHeight3 + i6);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        this.c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                pcc pccVar = (pcc) this.b.get(childAt);
                if (pccVar != null) {
                    if (childAt instanceof dv3) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(pccVar.q, 1073741824), 0);
                        if (pccVar.A) {
                            f = (pccVar.f * getMeasuredWidth()) / pccVar.q;
                        } else {
                            f = pccVar.v * ((pccVar.w * measuredWidth) / pccVar.q);
                        }
                        childAt.setScaleX(f);
                        childAt.setScaleY(f);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * pccVar.f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * pccVar.g), 1073741824));
                    }
                }
            }
        }
        this.c = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        BitmapDrawable bitmapDrawable = this.d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (255.0f * f));
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.a = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.d = bitmapDrawable;
        setBackground(bitmapDrawable);
    }

    public void setVideoPosition(jw7 jw7Var) {
        this.h = jw7Var;
    }
}
