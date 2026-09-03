package k2;

import android.graphics.Paint;
import b4.e0;
public final class i extends l {
    public e0 d;
    public float e;
    public e0 f9627f;
    public float f9628g;
    public float h;
    public float f9629i;
    public float f9630j;
    public float f9631k;
    public Paint.Cap f9632l;
    public Paint.Join f9633m;
    public float f9634n;

    @Override
    public final boolean a() {
        if (!this.f9627f.l() && !this.d.l()) {
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
        return this.f9627f.f1378b;
    }

    public float getStrokeAlpha() {
        return this.f9628g;
    }

    public int getStrokeColor() {
        return this.d.f1378b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f9630j;
    }

    public float getTrimPathOffset() {
        return this.f9631k;
    }

    public float getTrimPathStart() {
        return this.f9629i;
    }

    public void setFillAlpha(float f10) {
        this.h = f10;
    }

    public void setFillColor(int i10) {
        this.f9627f.f1378b = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f9628g = f10;
    }

    public void setStrokeColor(int i10) {
        this.d.f1378b = i10;
    }

    public void setStrokeWidth(float f10) {
        this.e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f9630j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f9631k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f9629i = f10;
    }
}
