package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.widget.FrameLayout;
public class jy extends FrameLayout {
    public final iy a;
    public float b;
    public int c;
    public boolean d;
    public int e;
    public final Matrix f;

    public jy(Context context) {
        super(context);
        this.f = new Matrix();
        this.c = 0;
        this.a = new iy(this, (byte) 0);
    }

    public final void a(float f, int i) {
        if (this.b != f) {
            this.b = f;
            this.e = i;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.b;
    }

    public int getResizeMode() {
        return this.c;
    }

    public int getVideoRotation() {
        return this.e;
    }

    @Override
    public void onMeasure(int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy.onMeasure(int, int):void");
    }

    public void setDrawingReady(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
    }

    public void setResizeMode(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setAspectRatioListener(hy hyVar) {
    }
}
