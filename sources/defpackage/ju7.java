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
public final class ju7 extends FrameLayout {
    public Bitmap a;
    public HashMap b;
    public boolean c;
    public BitmapDrawable d;
    public boolean e;
    public boolean f;
    public iu7 h;
    public boolean n;
    public final bg7 r;

    public ju7(Context context) {
        super(context);
        this.e = true;
        this.r = new bg7(this, (byte) 4);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju7.b(java.util.ArrayList, boolean, boolean, boolean):void");
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
        iu7 iu7Var;
        long j;
        boolean z;
        if (this.b != null && (iu7Var = this.h) != null) {
            PhotoViewer photoViewer = ((s68) iu7Var).a;
            Drawable[] drawableArr = PhotoViewer.d9;
            lbc lbcVar = photoViewer.G2;
            if (lbcVar != null) {
                j = lbcVar.S();
            } else {
                j = 0;
            }
            for (Map.Entry entry : this.b.entrySet()) {
                mac macVar = (mac) entry.getValue();
                if (macVar.a == 11) {
                    boolean z2 = true;
                    int i = 0;
                    if (!this.f && j >= macVar.V && j < macVar.W) {
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
                    if (z && (view instanceof st3)) {
                        ((st3) view).A(j);
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
        float max = Math.max(measuredWidth / gl.L(120.0f), measuredHeight / gl.L(120.0f));
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
        bg7 bg7Var = this.r;
        removeCallbacks(bg7Var);
        if (this.n) {
            postOnAnimation(bg7Var);
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
                mac macVar = (mac) this.b.get(childAt);
                if (macVar != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof st3) {
                        if (macVar.A) {
                            i5 = ((int) (((macVar.f / 2.0f) + macVar.c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i7 = (int) (((macVar.g / 2.0f) + macVar.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i5 = ((int) (measuredWidth * macVar.y)) - (childAt.getMeasuredWidth() / 2);
                            i7 = (int) (measuredHeight2 * macVar.z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i6 = i7 - measuredHeight;
                    } else {
                        i5 = (int) (measuredWidth * macVar.c);
                        i6 = (int) (measuredHeight2 * macVar.d);
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
                mac macVar = (mac) this.b.get(childAt);
                if (macVar != null) {
                    if (childAt instanceof st3) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(macVar.q, 1073741824), 0);
                        if (macVar.A) {
                            f = (macVar.f * getMeasuredWidth()) / macVar.q;
                        } else {
                            f = macVar.v * ((macVar.w * measuredWidth) / macVar.q);
                        }
                        childAt.setScaleX(f);
                        childAt.setScaleY(f);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * macVar.f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * macVar.g), 1073741824));
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

    public void setVideoPosition(iu7 iu7Var) {
        this.h = iu7Var;
    }
}
