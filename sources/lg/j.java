package lg;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import hi.h6;
import org.telegram.messenger.g0;
public final class j {
    public g f19835a;
    public float f19836b;
    public boolean f19837c;
    public float d;
    public float f19838e;
    public long f19839f;
    public ValueAnimator f19840g;
    public Rect h;
    public Rect f19841i;
    public Rect f19842j;
    public float f19843k;
    public float f19844l;
    public float f19845m;
    public h[] f19846n;

    public final boolean a(int i7, int i10, int i11) {
        h hVar;
        Rect rect = this.f19841i;
        Rect rect2 = this.h;
        h[] hVarArr = this.f19846n;
        if (i11 == 0) {
            if (rect2.contains(i7, i10)) {
                h hVar2 = hVarArr[0];
                if (hVar2 != null) {
                    hVarArr[1] = hVar2;
                }
                h hVar3 = new h(this, 1);
                hVarArr[0] = hVar3;
                hVar3.f19831c = this.f19843k;
                hVar3.f19830b = i7;
                hVar3.a();
                ValueAnimator valueAnimator = this.f19840g;
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
                hVar5.d = this.f19844l;
                hVar5.f19830b = i7;
                hVar5.a();
                ValueAnimator valueAnimator2 = this.f19840g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.f19842j.contains(i7, i10)) {
                h hVar6 = new h(this, 4);
                hVarArr[0] = hVar6;
                hVar6.d = this.f19844l;
                hVar6.f19831c = this.f19843k;
                hVar6.f19830b = i7;
                hVar6.a();
                ValueAnimator valueAnimator3 = this.f19840g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i10 < rect2.bottom && i10 > rect2.top) {
                    this.f19837c = true;
                    this.d = i7;
                    this.f19838e = i10;
                    this.f19839f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f19840g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f19835a.a(this.f19843k, this.f19844l, true);
                        }
                        this.f19840g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i11 == 1 && (hVar = hVarArr[0]) != null && hVar.f19829a != 4) {
            if (rect2.contains(i7, i10) && hVarArr[0].f19829a != 1) {
                h hVar7 = new h(this, 1);
                hVarArr[1] = hVar7;
                hVar7.f19831c = this.f19843k;
                hVar7.f19830b = i7;
                hVar7.a();
                ValueAnimator valueAnimator5 = this.f19840g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i7, i10) && hVarArr[0].f19829a != 2) {
                h hVar8 = new h(this, 2);
                hVarArr[1] = hVar8;
                hVar8.d = this.f19844l;
                hVar8.f19830b = i7;
                hVar8.a();
                ValueAnimator valueAnimator6 = this.f19840g;
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
        if (this.f19837c || (hVar = this.f19846n[i10]) == null) {
            return false;
        }
        int i11 = hVar.f19829a;
        float f10 = hVar.f19831c;
        float f11 = hVar.d;
        int i12 = hVar.f19830b;
        if (i11 == 1) {
            float f12 = f10 - ((i12 - i7) / this.f19836b);
            this.f19843k = f12;
            if (f12 < 0.0f) {
                this.f19843k = 0.0f;
            }
            float f13 = this.f19844l;
            float f14 = this.f19845m;
            if (f13 - this.f19843k < f14) {
                this.f19843k = f13 - f14;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 2) {
            float f15 = f11 - ((i12 - i7) / this.f19836b);
            this.f19844l = f15;
            if (f15 > 1.0f) {
                this.f19844l = 1.0f;
            }
            float f16 = this.f19844l;
            float f17 = this.f19843k;
            float f18 = this.f19845m;
            if (f16 - f17 < f18) {
                this.f19844l = f17 + f18;
            }
            z10 = true;
        }
        if (i11 == 4) {
            float f19 = (i12 - i7) / this.f19836b;
            float f20 = f10 - f19;
            this.f19843k = f20;
            this.f19844l = f11 - f19;
            if (f20 < 0.0f) {
                this.f19843k = 0.0f;
                this.f19844l = f11 - f10;
            }
            if (this.f19844l > 1.0f) {
                this.f19844l = 1.0f;
                this.f19843k = 1.0f - (f11 - f10);
            }
            z10 = true;
        }
        if (z10) {
            this.f19835a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i7, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f10;
        float f11;
        h[] hVarArr = this.f19846n;
        if (i7 == 0) {
            if (this.f19837c) {
                this.f19837c = false;
                float x10 = this.d - motionEvent.getX();
                float y10 = this.f19838e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f19839f < 300) {
                    if (Math.sqrt((y10 * y10) + (x10 * x10)) < g0.L(10.0f)) {
                        float f12 = (this.d - g.l1) / this.f19836b;
                        float f13 = this.f19844l;
                        float f14 = this.f19843k;
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
                        this.f19840g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f19835a.a(f11, f10, true);
                        this.f19840g.addUpdateListener(new h6(this, f14, f11, f13, f10, 1));
                        this.f19840g.setInterpolator(g.D1);
                        this.f19840g.start();
                        return true;
                    }
                }
                return true;
            }
            h hVar = hVarArr[0];
            if (hVar != null && (valueAnimator2 = hVar.f19832e) != null) {
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
        if (hVar3 != null && (valueAnimator = hVar3.f19832e) != null) {
            valueAnimator.cancel();
        }
        hVarArr[1] = null;
        return false;
    }
}
