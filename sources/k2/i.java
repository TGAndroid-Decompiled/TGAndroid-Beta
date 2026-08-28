package k2;

import android.graphics.Paint;
public final class i extends l {
    public a6.a d;
    public float f14534e;
    public a6.a f14535f;
    public float f14536g;
    public float h;
    public float f14537i;
    public float f14538j;
    public float f14539k;
    public Paint.Cap f14540l;
    public Paint.Join f14541m;
    public float f14542n;

    @Override
    public final boolean a() {
        if (!this.f14535f.h() && !this.d.h()) {
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
        return this.f14535f.f102c;
    }

    public float getStrokeAlpha() {
        return this.f14536g;
    }

    public int getStrokeColor() {
        return this.d.f102c;
    }

    public float getStrokeWidth() {
        return this.f14534e;
    }

    public float getTrimPathEnd() {
        return this.f14538j;
    }

    public float getTrimPathOffset() {
        return this.f14539k;
    }

    public float getTrimPathStart() {
        return this.f14537i;
    }

    public void setFillAlpha(float f10) {
        this.h = f10;
    }

    public void setFillColor(int i9) {
        this.f14535f.f102c = i9;
    }

    public void setStrokeAlpha(float f10) {
        this.f14536g = f10;
    }

    public void setStrokeColor(int i9) {
        this.d.f102c = i9;
    }

    public void setStrokeWidth(float f10) {
        this.f14534e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f14538j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f14539k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f14537i = f10;
    }
}
