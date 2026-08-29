package k2;

import ag.j2;
import android.graphics.Paint;
public final class i extends l {
    public j2 d;
    public float f13346e;
    public j2 f13347f;
    public float f13348g;
    public float h;
    public float f13349i;
    public float f13350j;
    public float f13351k;
    public Paint.Cap f13352l;
    public Paint.Join f13353m;
    public float f13354n;

    @Override
    public final boolean a() {
        if (!this.f13347f.j() && !this.d.j()) {
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
        return this.f13347f.f558b;
    }

    public float getStrokeAlpha() {
        return this.f13348g;
    }

    public int getStrokeColor() {
        return this.d.f558b;
    }

    public float getStrokeWidth() {
        return this.f13346e;
    }

    public float getTrimPathEnd() {
        return this.f13350j;
    }

    public float getTrimPathOffset() {
        return this.f13351k;
    }

    public float getTrimPathStart() {
        return this.f13349i;
    }

    public void setFillAlpha(float f9) {
        this.h = f9;
    }

    public void setFillColor(int i10) {
        this.f13347f.f558b = i10;
    }

    public void setStrokeAlpha(float f9) {
        this.f13348g = f9;
    }

    public void setStrokeColor(int i10) {
        this.d.f558b = i10;
    }

    public void setStrokeWidth(float f9) {
        this.f13346e = f9;
    }

    public void setTrimPathEnd(float f9) {
        this.f13350j = f9;
    }

    public void setTrimPathOffset(float f9) {
        this.f13351k = f9;
    }

    public void setTrimPathStart(float f9) {
        this.f13349i = f9;
    }
}
