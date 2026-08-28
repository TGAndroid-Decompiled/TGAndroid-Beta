package c5;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
public class c extends FrameLayout {
    public final b f2312a;
    public float f2313b;
    public int f2314c;
    public boolean d;
    public int f2315e;
    public final Matrix f2316f;

    public c(Context context) {
        super(context);
        this.f2316f = new Matrix();
        this.f2314c = 0;
        this.f2312a = new b(this, 0);
    }

    public final void a(float f10, int i9) {
        if (this.f2313b != f10) {
            this.f2313b = f10;
            this.f2315e = i9;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.f2313b;
    }

    public int getResizeMode() {
        return this.f2314c;
    }

    public int getVideoRotation() {
        return this.f2315e;
    }

    @Override
    public void onMeasure(int i9, int i10) {
        float f10;
        float f11;
        super.onMeasure(i9, i10);
        if (this.f2313b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f12 = measuredWidth;
            float f13 = measuredHeight;
            float f14 = (this.f2313b / (f12 / f13)) - 1.0f;
            float abs = Math.abs(f14);
            b bVar = this.f2312a;
            if (abs <= 0.01f) {
                if (!bVar.f2310b) {
                    bVar.f2310b = true;
                    ((c) bVar.f2311c).post(bVar);
                    return;
                }
                return;
            }
            int i11 = this.f2314c;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                if (f14 > 0.0f) {
                                    f10 = this.f2313b;
                                } else {
                                    f11 = this.f2313b;
                                }
                            }
                        } else if (f14 <= 0.0f) {
                            f11 = this.f2313b;
                        } else {
                            f10 = this.f2313b;
                        }
                    } else {
                        f10 = this.f2313b;
                    }
                    measuredWidth = (int) (f13 * f10);
                } else {
                    f11 = this.f2313b;
                }
                measuredHeight = (int) (f12 / f11);
            } else if (f14 > 0.0f) {
                f11 = this.f2313b;
                measuredHeight = (int) (f12 / f11);
            } else {
                f10 = this.f2313b;
                measuredWidth = (int) (f13 * f10);
            }
            if (!bVar.f2310b) {
                bVar.f2310b = true;
                ((c) bVar.f2311c).post(bVar);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof TextureView) {
                    Matrix matrix = this.f2316f;
                    matrix.reset();
                    float width = getWidth() / 2;
                    float height = getHeight() / 2;
                    matrix.postRotate(this.f2315e, width, height);
                    int i13 = this.f2315e;
                    if (i13 == 90 || i13 == 270) {
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

    public void setResizeMode(int i9) {
        if (this.f2314c != i9) {
            this.f2314c = i9;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }
}
