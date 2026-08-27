package c5;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

public class c extends FrameLayout {

    public final b f2445a;

    public float f2446b;

    public int f2447c;
    public boolean d;

    public int f2448e;

    public final Matrix f2449f;

    public c(Context context) {
        super(context);
        this.f2449f = new Matrix();
        this.f2447c = 0;
        this.f2445a = new b(this, 0);
    }

    public final void a(float f10, int i10) {
        if (this.f2446b != f10) {
            this.f2446b = f10;
            this.f2448e = i10;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f2446b;
    }

    public int getResizeMode() {
        return this.f2447c;
    }

    public int getVideoRotation() {
        return this.f2448e;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f2446b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = (this.f2446b / (f12 / f13)) - 1.0f;
        float fAbs = Math.abs(f14);
        b bVar = this.f2445a;
        if (fAbs <= 0.01f) {
            if (bVar.f2443b) {
                return;
            }
            bVar.f2443b = true;
            ((c) bVar.f2444c).post(bVar);
            return;
        }
        int i12 = this.f2447c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f2446b;
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        if (f14 > 0.0f) {
                            f10 = this.f2446b;
                        } else {
                            f11 = this.f2446b;
                        }
                    }
                } else if (f14 <= 0.0f) {
                    f11 = this.f2446b;
                } else {
                    f10 = this.f2446b;
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f2446b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f14 > 0.0f) {
            f11 = this.f2446b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f2446b;
            measuredWidth = (int) (f13 * f10);
        }
        if (!bVar.f2443b) {
            bVar.f2443b = true;
            ((c) bVar.f2444c).post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt instanceof TextureView) {
                Matrix matrix = this.f2449f;
                matrix.reset();
                float width = getWidth() / 2;
                float height = getHeight() / 2;
                matrix.postRotate(this.f2448e, width, height);
                int i14 = this.f2448e;
                if (i14 == 90 || i14 == 270) {
                    float height2 = getHeight() / getWidth();
                    matrix.postScale(1.0f / height2, height2, width, height);
                }
                ((TextureView) childAt).setTransform(matrix);
                return;
            }
        }
    }

    public void setDrawingReady(boolean z10) {
        if (this.d == z10) {
            return;
        }
        this.d = z10;
    }

    public void setResizeMode(int i10) {
        if (this.f2447c != i10) {
            this.f2447c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }
}
