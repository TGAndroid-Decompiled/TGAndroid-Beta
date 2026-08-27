package k2;

import android.content.res.ColorStateList;
import android.graphics.Paint;

public final class i extends l {
    public b6.a d;

    public float f14355e;

    public b6.a f14356f;

    public float f14357g;
    public float h;

    public float f14358i;

    public float f14359j;

    public float f14360k;

    public Paint.Cap f14361l;

    public Paint.Join f14362m;

    public float f14363n;

    @Override
    public final boolean a() {
        return this.f14356f.h() || this.d.h();
    }

    @Override
    public final boolean b(int[] iArr) {
        boolean z10;
        b6.a aVar = this.f14356f;
        boolean z11 = true;
        if (aVar.h()) {
            ColorStateList colorStateList = (ColorStateList) aVar.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != aVar.f2034c) {
                aVar.f2034c = colorForState;
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        b6.a aVar2 = this.d;
        if (aVar2.h()) {
            ColorStateList colorStateList2 = (ColorStateList) aVar2.d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != aVar2.f2034c) {
                aVar2.f2034c = colorForState2;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return z10 | z11;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f14356f.f2034c;
    }

    public float getStrokeAlpha() {
        return this.f14357g;
    }

    public int getStrokeColor() {
        return this.d.f2034c;
    }

    public float getStrokeWidth() {
        return this.f14355e;
    }

    public float getTrimPathEnd() {
        return this.f14359j;
    }

    public float getTrimPathOffset() {
        return this.f14360k;
    }

    public float getTrimPathStart() {
        return this.f14358i;
    }

    public void setFillAlpha(float f10) {
        this.h = f10;
    }

    public void setFillColor(int i10) {
        this.f14356f.f2034c = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f14357g = f10;
    }

    public void setStrokeColor(int i10) {
        this.d.f2034c = i10;
    }

    public void setStrokeWidth(float f10) {
        this.f14355e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f14359j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f14360k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f14358i = f10;
    }
}
