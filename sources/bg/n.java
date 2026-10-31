package bg;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.telegram.messenger.i0;
public final class n {
    public i f2760a;
    public float f2761b;
    public boolean f2762c;
    public float d;
    public float e;
    public long f2763f;
    public ValueAnimator f2764g;
    public Rect h;
    public Rect f2765i;
    public Rect f2766j;
    public float f2767k;
    public float f2768l;
    public float f2769m;
    public l[] f2770n;

    public final boolean a(int i10, int i11, int i12) {
        l lVar;
        Rect rect = this.f2765i;
        Rect rect2 = this.h;
        l[] lVarArr = this.f2770n;
        if (i12 == 0) {
            if (rect2.contains(i10, i11)) {
                l lVar2 = lVarArr[0];
                if (lVar2 != null) {
                    lVarArr[1] = lVar2;
                }
                l lVar3 = new l(this, 1);
                lVarArr[0] = lVar3;
                lVar3.f2757c = this.f2767k;
                lVar3.f2756b = i10;
                lVar3.a();
                ValueAnimator valueAnimator = this.f2764g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    return true;
                }
            } else if (rect.contains(i10, i11)) {
                l lVar4 = lVarArr[0];
                if (lVar4 != null) {
                    lVarArr[1] = lVar4;
                }
                l lVar5 = new l(this, 2);
                lVarArr[0] = lVar5;
                lVar5.d = this.f2768l;
                lVar5.f2756b = i10;
                lVar5.a();
                ValueAnimator valueAnimator2 = this.f2764g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.f2766j.contains(i10, i11)) {
                l lVar6 = new l(this, 4);
                lVarArr[0] = lVar6;
                lVar6.d = this.f2768l;
                lVar6.f2757c = this.f2767k;
                lVar6.f2756b = i10;
                lVar6.a();
                ValueAnimator valueAnimator3 = this.f2764g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i11 < rect2.bottom && i11 > rect2.top) {
                    this.f2762c = true;
                    this.d = i10;
                    this.e = i11;
                    this.f2763f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f2764g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f2760a.a(this.f2767k, this.f2768l, true);
                        }
                        this.f2764g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i12 == 1 && (lVar = lVarArr[0]) != null && lVar.f2755a != 4) {
            if (rect2.contains(i10, i11) && lVarArr[0].f2755a != 1) {
                l lVar7 = new l(this, 1);
                lVarArr[1] = lVar7;
                lVar7.f2757c = this.f2767k;
                lVar7.f2756b = i10;
                lVar7.a();
                ValueAnimator valueAnimator5 = this.f2764g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i10, i11) && lVarArr[0].f2755a != 2) {
                l lVar8 = new l(this, 2);
                lVarArr[1] = lVar8;
                lVar8.d = this.f2768l;
                lVar8.f2756b = i10;
                lVar8.a();
                ValueAnimator valueAnimator6 = this.f2764g;
                if (valueAnimator6 != null) {
                    valueAnimator6.cancel();
                }
            }
            return true;
        }
        return false;
    }

    public final boolean b(int i10, int i11) {
        l lVar;
        boolean z10;
        if (this.f2762c || (lVar = this.f2770n[i11]) == null) {
            return false;
        }
        int i12 = lVar.f2755a;
        float f7 = lVar.f2757c;
        float f10 = lVar.d;
        int i13 = lVar.f2756b;
        if (i12 == 1) {
            float f11 = f7 - ((i13 - i10) / this.f2761b);
            this.f2767k = f11;
            if (f11 < 0.0f) {
                this.f2767k = 0.0f;
            }
            float f12 = this.f2768l;
            float f13 = this.f2769m;
            if (f12 - this.f2767k < f13) {
                this.f2767k = f12 - f13;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            float f14 = f10 - ((i13 - i10) / this.f2761b);
            this.f2768l = f14;
            if (f14 > 1.0f) {
                this.f2768l = 1.0f;
            }
            float f15 = this.f2768l;
            float f16 = this.f2767k;
            float f17 = this.f2769m;
            if (f15 - f16 < f17) {
                this.f2768l = f16 + f17;
            }
            z10 = true;
        }
        if (i12 == 4) {
            float f18 = (i13 - i10) / this.f2761b;
            float f19 = f7 - f18;
            this.f2767k = f19;
            this.f2768l = f10 - f18;
            if (f19 < 0.0f) {
                this.f2767k = 0.0f;
                this.f2768l = f10 - f7;
            }
            if (this.f2768l > 1.0f) {
                this.f2768l = 1.0f;
                this.f2767k = 1.0f - (f10 - f7);
            }
            z10 = true;
        }
        if (z10) {
            this.f2760a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i10, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f7;
        float f10;
        l[] lVarArr = this.f2770n;
        if (i10 == 0) {
            if (this.f2762c) {
                this.f2762c = false;
                float x10 = this.d - motionEvent.getX();
                float y3 = this.e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f2763f < 300) {
                    if (Math.sqrt((y3 * y3) + (x10 * x10)) < i0.L(10.0f)) {
                        float f11 = (this.d - i.f2689k1) / this.f2761b;
                        float f12 = this.f2768l;
                        float f13 = this.f2767k;
                        float f14 = f12 - f13;
                        float f15 = f14 / 2.0f;
                        float f16 = f11 - f15;
                        float f17 = f11 + f15;
                        if (f16 < 0.0f) {
                            f7 = f14;
                            f10 = 0.0f;
                        } else {
                            if (f17 > 1.0f) {
                                f16 = 1.0f - f14;
                                f7 = 1.0f;
                            } else {
                                f7 = f17;
                            }
                            f10 = f16;
                        }
                        this.f2764g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f2760a.a(f10, f7, true);
                        this.f2764g.addUpdateListener(new j(this, f13, f10, f12, f7, 0));
                        this.f2764g.setInterpolator(i.C1);
                        this.f2764g.start();
                        return true;
                    }
                }
                return true;
            }
            l lVar = lVarArr[0];
            if (lVar != null && (valueAnimator2 = lVar.e) != null) {
                valueAnimator2.cancel();
            }
            lVarArr[0] = null;
            l lVar2 = lVarArr[1];
            if (lVar2 != null) {
                lVarArr[0] = lVar2;
                lVarArr[1] = null;
            }
            return false;
        }
        l lVar3 = lVarArr[1];
        if (lVar3 != null && (valueAnimator = lVar3.e) != null) {
            valueAnimator.cancel();
        }
        lVarArr[1] = null;
        return false;
    }
}
