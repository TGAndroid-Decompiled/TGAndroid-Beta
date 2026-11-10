package lg;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import fi.j6;
import org.telegram.messenger.g0;
public final class j {
    public g f18341a;
    public float f18342b;
    public boolean f18343c;
    public float d;
    public float f18344e;
    public long f18345f;
    public ValueAnimator f18346g;
    public Rect h;
    public Rect f18347i;
    public Rect f18348j;
    public float f18349k;
    public float f18350l;
    public float f18351m;
    public h[] f18352n;

    public final boolean a(int i7, int i10, int i11) {
        h hVar;
        Rect rect = this.f18347i;
        Rect rect2 = this.h;
        h[] hVarArr = this.f18352n;
        if (i11 == 0) {
            if (rect2.contains(i7, i10)) {
                h hVar2 = hVarArr[0];
                if (hVar2 != null) {
                    hVarArr[1] = hVar2;
                }
                h hVar3 = new h(this, 1);
                hVarArr[0] = hVar3;
                hVar3.f18337c = this.f18349k;
                hVar3.f18336b = i7;
                hVar3.a();
                ValueAnimator valueAnimator = this.f18346g;
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
                hVar5.d = this.f18350l;
                hVar5.f18336b = i7;
                hVar5.a();
                ValueAnimator valueAnimator2 = this.f18346g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.f18348j.contains(i7, i10)) {
                h hVar6 = new h(this, 4);
                hVarArr[0] = hVar6;
                hVar6.d = this.f18350l;
                hVar6.f18337c = this.f18349k;
                hVar6.f18336b = i7;
                hVar6.a();
                ValueAnimator valueAnimator3 = this.f18346g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i10 < rect2.bottom && i10 > rect2.top) {
                    this.f18343c = true;
                    this.d = i7;
                    this.f18344e = i10;
                    this.f18345f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f18346g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f18341a.a(this.f18349k, this.f18350l, true);
                        }
                        this.f18346g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i11 == 1 && (hVar = hVarArr[0]) != null && hVar.f18335a != 4) {
            if (rect2.contains(i7, i10) && hVarArr[0].f18335a != 1) {
                h hVar7 = new h(this, 1);
                hVarArr[1] = hVar7;
                hVar7.f18337c = this.f18349k;
                hVar7.f18336b = i7;
                hVar7.a();
                ValueAnimator valueAnimator5 = this.f18346g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i7, i10) && hVarArr[0].f18335a != 2) {
                h hVar8 = new h(this, 2);
                hVarArr[1] = hVar8;
                hVar8.d = this.f18350l;
                hVar8.f18336b = i7;
                hVar8.a();
                ValueAnimator valueAnimator6 = this.f18346g;
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
        boolean z9;
        if (this.f18343c || (hVar = this.f18352n[i10]) == null) {
            return false;
        }
        int i11 = hVar.f18335a;
        float f10 = hVar.f18337c;
        float f11 = hVar.d;
        int i12 = hVar.f18336b;
        if (i11 == 1) {
            float f12 = f10 - ((i12 - i7) / this.f18342b);
            this.f18349k = f12;
            if (f12 < 0.0f) {
                this.f18349k = 0.0f;
            }
            float f13 = this.f18350l;
            float f14 = this.f18351m;
            if (f13 - this.f18349k < f14) {
                this.f18349k = f13 - f14;
            }
            z9 = true;
        } else {
            z9 = false;
        }
        if (i11 == 2) {
            float f15 = f11 - ((i12 - i7) / this.f18342b);
            this.f18350l = f15;
            if (f15 > 1.0f) {
                this.f18350l = 1.0f;
            }
            float f16 = this.f18350l;
            float f17 = this.f18349k;
            float f18 = this.f18351m;
            if (f16 - f17 < f18) {
                this.f18350l = f17 + f18;
            }
            z9 = true;
        }
        if (i11 == 4) {
            float f19 = (i12 - i7) / this.f18342b;
            float f20 = f10 - f19;
            this.f18349k = f20;
            this.f18350l = f11 - f19;
            if (f20 < 0.0f) {
                this.f18349k = 0.0f;
                this.f18350l = f11 - f10;
            }
            if (this.f18350l > 1.0f) {
                this.f18350l = 1.0f;
                this.f18349k = 1.0f - (f11 - f10);
            }
            z9 = true;
        }
        if (z9) {
            this.f18341a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i7, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f10;
        float f11;
        h[] hVarArr = this.f18352n;
        if (i7 == 0) {
            if (this.f18343c) {
                this.f18343c = false;
                float x10 = this.d - motionEvent.getX();
                float y10 = this.f18344e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f18345f < 300) {
                    if (Math.sqrt((y10 * y10) + (x10 * x10)) < g0.L(10.0f)) {
                        float f12 = (this.d - g.f18275k1) / this.f18342b;
                        float f13 = this.f18350l;
                        float f14 = this.f18349k;
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
                        this.f18346g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f18341a.a(f11, f10, true);
                        this.f18346g.addUpdateListener(new j6(this, f14, f11, f13, f10, 1));
                        this.f18346g.setInterpolator(g.C1);
                        this.f18346g.start();
                        return true;
                    }
                }
                return true;
            }
            h hVar = hVarArr[0];
            if (hVar != null && (valueAnimator2 = hVar.f18338e) != null) {
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
        if (hVar3 != null && (valueAnimator = hVar3.f18338e) != null) {
            valueAnimator.cancel();
        }
        hVarArr[1] = null;
        return false;
    }
}
