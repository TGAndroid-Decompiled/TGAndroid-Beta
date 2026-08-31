package k2;

import android.graphics.Paint;
import b4.e0;
public final class i extends l {
    public e0 d;
    public float f10356e;
    public e0 f10357f;
    public float f10358g;
    public float h;
    public float f10359i;
    public float f10360j;
    public float f10361k;
    public Paint.Cap f10362l;
    public Paint.Join f10363m;
    public float f10364n;

    @Override
    public final boolean a() {
        if (!this.f10357f.l() && !this.d.l()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: k2.i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f10357f.f1474b;
    }

    public float getStrokeAlpha() {
        return this.f10358g;
    }

    public int getStrokeColor() {
        return this.d.f1474b;
    }

    public float getStrokeWidth() {
        return this.f10356e;
    }

    public float getTrimPathEnd() {
        return this.f10360j;
    }

    public float getTrimPathOffset() {
        return this.f10361k;
    }

    public float getTrimPathStart() {
        return this.f10359i;
    }

    public void setFillAlpha(float f10) {
        this.h = f10;
    }

    public void setFillColor(int i10) {
        this.f10357f.f1474b = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f10358g = f10;
    }

    public void setStrokeColor(int i10) {
        this.d.f1474b = i10;
    }

    public void setStrokeWidth(float f10) {
        this.f10356e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f10360j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f10361k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f10359i = f10;
    }
}
