package e5;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public class c extends FrameLayout {
    public final b f5824a;
    public float f5825b;
    public int f5826c;
    public boolean d;
    public int f5827e;
    public final Matrix f5828f;

    public c(Context context) {
        super(context);
        this.f5828f = new Matrix();
        this.f5826c = 0;
        this.f5824a = new b(this, 0);
    }

    public final void a(float f9, int i10) {
        if (this.f5825b != f9) {
            this.f5825b = f9;
            this.f5827e = i10;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f5825b;
    }

    public int getResizeMode() {
        return this.f5826c;
    }

    public int getVideoRotation() {
        return this.f5827e;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f9;
        float f10;
        super.onMeasure(i10, i11);
        if (this.f5825b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f11 = measuredWidth;
            float f12 = measuredHeight;
            float f13 = (this.f5825b / (f11 / f12)) - 1.0f;
            float abs = Math.abs(f13);
            b bVar = this.f5824a;
            if (abs <= 0.01f) {
                if (!bVar.f5822b) {
                    bVar.f5822b = true;
                    ((c) bVar.f5823c).post(bVar);
                    return;
                }
                return;
            }
            int i12 = this.f5826c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                if (f13 > 0.0f) {
                                    f9 = this.f5825b;
                                } else {
                                    f10 = this.f5825b;
                                }
                            }
                        } else if (f13 <= 0.0f) {
                            f10 = this.f5825b;
                        } else {
                            f9 = this.f5825b;
                        }
                    } else {
                        f9 = this.f5825b;
                    }
                    measuredWidth = (int) (f12 * f9);
                } else {
                    f10 = this.f5825b;
                }
                measuredHeight = (int) (f11 / f10);
            } else if (f13 > 0.0f) {
                f10 = this.f5825b;
                measuredHeight = (int) (f11 / f10);
            } else {
                f9 = this.f5825b;
                measuredWidth = (int) (f12 * f9);
            }
            if (!bVar.f5822b) {
                bVar.f5822b = true;
                ((c) bVar.f5823c).post(bVar);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f5828f;
                    matrix.reset();
                    float width = getWidth() / 2;
                    float height = getHeight() / 2;
                    matrix.postRotate(this.f5827e, width, height);
                    int i14 = this.f5827e;
                    if (i14 == 90 || i14 == 270) {
                        float height2 = getHeight() / getWidth();
                        matrix.postScale(1.0f / height2, height2, width, height);
                    }
                    ((TextureView) childAt).setTransform(matrix);
                    return;
                }
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
        if (this.f5826c != i10) {
            this.f5826c = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }
}
