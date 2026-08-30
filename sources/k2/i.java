package k2;

import android.graphics.Paint;
import b4.e0;
public final class i extends l {
    public e0 d;
    public float e;
    public e0 f9646f;
    public float f9647g;
    public float h;
    public float f9648i;
    public float f9649j;
    public float f9650k;
    public Paint.Cap f9651l;
    public Paint.Join f9652m;
    public float f9653n;

    @Override
    public final boolean a() {
        if (!this.f9646f.k() && !this.d.k()) {
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
        return this.f9646f.f1367b;
    }

    public float getStrokeAlpha() {
        return this.f9647g;
    }

    public int getStrokeColor() {
        return this.d.f1367b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f9649j;
    }

    public float getTrimPathOffset() {
        return this.f9650k;
    }

    public float getTrimPathStart() {
        return this.f9648i;
    }

    public void setFillAlpha(float f10) {
        this.h = f10;
    }

    public void setFillColor(int i10) {
        this.f9646f.f1367b = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f9647g = f10;
    }

    public void setStrokeColor(int i10) {
        this.d.f1367b = i10;
    }

    public void setStrokeWidth(float f10) {
        this.e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f9649j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f9650k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f9648i = f10;
    }
}
