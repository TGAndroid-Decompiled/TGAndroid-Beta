package a5;

import a8.wa;
import android.graphics.Paint;
public final class j extends m {
    public wa d;
    public float f221e;
    public wa f222f;
    public float f223g;
    public float h;
    public float f224i;
    public float f225j;
    public float f226k;
    public Paint.Cap f227l;
    public Paint.Join f228m;
    public float f229n;

    @Override
    public final boolean a() {
        if (!this.f222f.n() && !this.d.n()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: a5.j.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f222f.f700b;
    }

    public float getStrokeAlpha() {
        return this.f223g;
    }

    public int getStrokeColor() {
        return this.d.f700b;
    }

    public float getStrokeWidth() {
        return this.f221e;
    }

    public float getTrimPathEnd() {
        return this.f225j;
    }

    public float getTrimPathOffset() {
        return this.f226k;
    }

    public float getTrimPathStart() {
        return this.f224i;
    }

    public void setFillAlpha(float f10) {
        this.h = f10;
    }

    public void setFillColor(int i7) {
        this.f222f.f700b = i7;
    }

    public void setStrokeAlpha(float f10) {
        this.f223g = f10;
    }

    public void setStrokeColor(int i7) {
        this.d.f700b = i7;
    }

    public void setStrokeWidth(float f10) {
        this.f221e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f225j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f226k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f224i = f10;
    }
}
