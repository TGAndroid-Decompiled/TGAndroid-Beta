package lg;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import hi.h6;
import org.telegram.messenger.g0;
public final class j {
    public g f19832a;
    public float f19833b;
    public boolean f19834c;
    public float d;
    public float f19835e;
    public long f19836f;
    public ValueAnimator f19837g;
    public Rect h;
    public Rect f19838i;
    public Rect f19839j;
    public float f19840k;
    public float f19841l;
    public float f19842m;
    public h[] f19843n;

    public final boolean a(int i7, int i10, int i11) {
        h hVar;
        Rect rect = this.f19838i;
        Rect rect2 = this.h;
        h[] hVarArr = this.f19843n;
        if (i11 == 0) {
            if (rect2.contains(i7, i10)) {
                h hVar2 = hVarArr[0];
                if (hVar2 != null) {
                    hVarArr[1] = hVar2;
                }
                h hVar3 = new h(this, 1);
                hVarArr[0] = hVar3;
                hVar3.f19828c = this.f19840k;
                hVar3.f19827b = i7;
                hVar3.a();
                ValueAnimator valueAnimator = this.f19837g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    return true;
                }
            } else if (rect.contains(i7, i10)) {
                h hVar4 = hVarArr[0];
                if (hVar4 != null) {
                    hVarArr[1] = hVar4;
                }
                h hVar5 = new h(this, 2);
                hVarArr[0] = hVar5;
                hVar5.d = this.f19841l;
                hVar5.f19827b = i7;
                hVar5.a();
                ValueAnimator valueAnimator2 = this.f19837g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.f19839j.contains(i7, i10)) {
                h hVar6 = new h(this, 4);
                hVarArr[0] = hVar6;
                hVar6.d = this.f19841l;
                hVar6.f19828c = this.f19840k;
                hVar6.f19827b = i7;
                hVar6.a();
                ValueAnimator valueAnimator3 = this.f19837g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i10 < rect2.bottom && i10 > rect2.top) {
                    this.f19834c = true;
                    this.d = i7;
                    this.f19835e = i10;
                    this.f19836f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f19837g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f19832a.a(this.f19840k, this.f19841l, true);
                        }
                        this.f19837g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i11 == 1 && (hVar = hVarArr[0]) != null && hVar.f19826a != 4) {
            if (rect2.contains(i7, i10) && hVarArr[0].f19826a != 1) {
                h hVar7 = new h(this, 1);
                hVarArr[1] = hVar7;
                hVar7.f19828c = this.f19840k;
                hVar7.f19827b = i7;
                hVar7.a();
                ValueAnimator valueAnimator5 = this.f19837g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i7, i10) && hVarArr[0].f19826a != 2) {
                h hVar8 = new h(this, 2);
                hVarArr[1] = hVar8;
                hVar8.d = this.f19841l;
                hVar8.f19827b = i7;
                hVar8.a();
                ValueAnimator valueAnimator6 = this.f19837g;
                if (valueAnimator6 != null) {
                    valueAnimator6.cancel();
                }
            }
            return true;
        }
        return false;
    }

    public final boolean b(int i7, int i10) {
        h hVar;
        boolean z10;
        if (this.f19834c || (hVar = this.f19843n[i10]) == null) {
            return false;
        }
        int i11 = hVar.f19826a;
        float f10 = hVar.f19828c;
        float f11 = hVar.d;
        int i12 = hVar.f19827b;
        if (i11 == 1) {
            float f12 = f10 - ((i12 - i7) / this.f19833b);
            this.f19840k = f12;
            if (f12 < 0.0f) {
                this.f19840k = 0.0f;
            }
            float f13 = this.f19841l;
            float f14 = this.f19842m;
            if (f13 - this.f19840k < f14) {
                this.f19840k = f13 - f14;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 2) {
            float f15 = f11 - ((i12 - i7) / this.f19833b);
            this.f19841l = f15;
            if (f15 > 1.0f) {
                this.f19841l = 1.0f;
            }
            float f16 = this.f19841l;
            float f17 = this.f19840k;
            float f18 = this.f19842m;
            if (f16 - f17 < f18) {
                this.f19841l = f17 + f18;
            }
            z10 = true;
        }
        if (i11 == 4) {
            float f19 = (i12 - i7) / this.f19833b;
            float f20 = f10 - f19;
            this.f19840k = f20;
            this.f19841l = f11 - f19;
            if (f20 < 0.0f) {
                this.f19840k = 0.0f;
                this.f19841l = f11 - f10;
            }
            if (this.f19841l > 1.0f) {
                this.f19841l = 1.0f;
                this.f19840k = 1.0f - (f11 - f10);
            }
            z10 = true;
        }
        if (z10) {
            this.f19832a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i7, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f10;
        float f11;
        h[] hVarArr = this.f19843n;
        if (i7 == 0) {
            if (this.f19834c) {
                this.f19834c = false;
                float x10 = this.d - motionEvent.getX();
                float y10 = this.f19835e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f19836f < 300) {
                    if (Math.sqrt((y10 * y10) + (x10 * x10)) < g0.L(10.0f)) {
                        float f12 = (this.d - g.l1) / this.f19833b;
                        float f13 = this.f19841l;
                        float f14 = this.f19840k;
                        float f15 = f13 - f14;
                        float f16 = f15 / 2.0f;
                        float f17 = f12 - f16;
                        float f18 = f12 + f16;
                        if (f17 < 0.0f) {
                            f10 = f15;
                            f11 = 0.0f;
                        } else {
                            if (f18 > 1.0f) {
                                f17 = 1.0f - f15;
                                f10 = 1.0f;
                            } else {
                                f10 = f18;
                            }
                            f11 = f17;
                        }
                        this.f19837g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f19832a.a(f11, f10, true);
                        this.f19837g.addUpdateListener(new h6(this, f14, f11, f13, f10, 1));
                        this.f19837g.setInterpolator(g.D1);
                        this.f19837g.start();
                        return true;
                    }
                }
                return true;
            }
            h hVar = hVarArr[0];
            if (hVar != null && (valueAnimator2 = hVar.f19829e) != null) {
                valueAnimator2.cancel();
            }
            hVarArr[0] = null;
            h hVar2 = hVarArr[1];
            if (hVar2 != null) {
                hVarArr[0] = hVar2;
                hVarArr[1] = null;
            }
            return false;
        }
        h hVar3 = hVarArr[1];
        if (hVar3 != null && (valueAnimator = hVar3.f19829e) != null) {
            valueAnimator.cancel();
        }
        hVarArr[1] = null;
        return false;
    }
}
