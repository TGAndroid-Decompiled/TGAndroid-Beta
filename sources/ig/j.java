package ig;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import ci.o7;
import org.telegram.messenger.AndroidUtilities;
public final class j {
    public g f11177a;
    public float f11178b;
    public boolean f11179c;
    public float d;
    public float e;
    public long f11180f;
    public ValueAnimator f11181g;
    public Rect h;
    public Rect f11182i;
    public Rect f11183j;
    public float f11184k;
    public float f11185l;
    public float f11186m;
    public h[] f11187n;

    public final boolean a(int i10, int i11, int i12) {
        h hVar;
        Rect rect = this.f11182i;
        Rect rect2 = this.h;
        h[] hVarArr = this.f11187n;
        if (i12 == 0) {
            if (rect2.contains(i10, i11)) {
                h hVar2 = hVarArr[0];
                if (hVar2 != null) {
                    hVarArr[1] = hVar2;
                }
                h hVar3 = new h(this, 1);
                hVarArr[0] = hVar3;
                hVar3.f11174c = this.f11184k;
                hVar3.f11173b = i10;
                hVar3.a();
                ValueAnimator valueAnimator = this.f11181g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    return true;
                }
            } else if (rect.contains(i10, i11)) {
                h hVar4 = hVarArr[0];
                if (hVar4 != null) {
                    hVarArr[1] = hVar4;
                }
                h hVar5 = new h(this, 2);
                hVarArr[0] = hVar5;
                hVar5.d = this.f11185l;
                hVar5.f11173b = i10;
                hVar5.a();
                ValueAnimator valueAnimator2 = this.f11181g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.f11183j.contains(i10, i11)) {
                h hVar6 = new h(this, 4);
                hVarArr[0] = hVar6;
                hVar6.d = this.f11185l;
                hVar6.f11174c = this.f11184k;
                hVar6.f11173b = i10;
                hVar6.a();
                ValueAnimator valueAnimator3 = this.f11181g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i11 < rect2.bottom && i11 > rect2.top) {
                    this.f11179c = true;
                    this.d = i10;
                    this.e = i11;
                    this.f11180f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f11181g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f11177a.a(this.f11184k, this.f11185l, true);
                        }
                        this.f11181g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i12 == 1 && (hVar = hVarArr[0]) != null && hVar.f11172a != 4) {
            if (rect2.contains(i10, i11) && hVarArr[0].f11172a != 1) {
                h hVar7 = new h(this, 1);
                hVarArr[1] = hVar7;
                hVar7.f11174c = this.f11184k;
                hVar7.f11173b = i10;
                hVar7.a();
                ValueAnimator valueAnimator5 = this.f11181g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i10, i11) && hVarArr[0].f11172a != 2) {
                h hVar8 = new h(this, 2);
                hVarArr[1] = hVar8;
                hVar8.d = this.f11185l;
                hVar8.f11173b = i10;
                hVar8.a();
                ValueAnimator valueAnimator6 = this.f11181g;
                if (valueAnimator6 != null) {
                    valueAnimator6.cancel();
                }
            }
            return true;
        }
        return false;
    }

    public final boolean b(int i10, int i11) {
        h hVar;
        boolean z10;
        if (this.f11179c || (hVar = this.f11187n[i11]) == null) {
            return false;
        }
        int i12 = hVar.f11172a;
        float f7 = hVar.f11174c;
        float f10 = hVar.d;
        int i13 = hVar.f11173b;
        if (i12 == 1) {
            float f11 = f7 - ((i13 - i10) / this.f11178b);
            this.f11184k = f11;
            if (f11 < 0.0f) {
                this.f11184k = 0.0f;
            }
            float f12 = this.f11185l;
            float f13 = this.f11186m;
            if (f12 - this.f11184k < f13) {
                this.f11184k = f12 - f13;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            float f14 = f10 - ((i13 - i10) / this.f11178b);
            this.f11185l = f14;
            if (f14 > 1.0f) {
                this.f11185l = 1.0f;
            }
            float f15 = this.f11185l;
            float f16 = this.f11184k;
            float f17 = this.f11186m;
            if (f15 - f16 < f17) {
                this.f11185l = f16 + f17;
            }
            z10 = true;
        }
        if (i12 == 4) {
            float f18 = (i13 - i10) / this.f11178b;
            float f19 = f7 - f18;
            this.f11184k = f19;
            this.f11185l = f10 - f18;
            if (f19 < 0.0f) {
                this.f11184k = 0.0f;
                this.f11185l = f10 - f7;
            }
            if (this.f11185l > 1.0f) {
                this.f11185l = 1.0f;
                this.f11184k = 1.0f - (f10 - f7);
            }
            z10 = true;
        }
        if (z10) {
            this.f11177a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i10, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f7;
        float f10;
        h[] hVarArr = this.f11187n;
        if (i10 == 0) {
            if (this.f11179c) {
                this.f11179c = false;
                float x10 = this.d - motionEvent.getX();
                float y3 = this.e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f11180f < 300) {
                    if (Math.sqrt((y3 * y3) + (x10 * x10)) < AndroidUtilities.dp(10.0f)) {
                        float f11 = (this.d - g.f11112k1) / this.f11178b;
                        float f12 = this.f11185l;
                        float f13 = this.f11184k;
                        float f14 = f12 - f13;
                        float f15 = f14 / 2.0f;
                        float f16 = f11 - f15;
                        float f17 = f11 + f15;
                        if (f16 < 0.0f) {
                            f7 = f14;
                            f10 = 0.0f;
                        } else if (f17 > 1.0f) {
                            f10 = 1.0f - f14;
                            f7 = 1.0f;
                        } else {
                            f7 = f17;
                            f10 = f16;
                        }
                        this.f11181g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f11177a.a(f10, f7, true);
                        this.f11181g.addUpdateListener(new o7(this, f13, f10, f12, f7, 1));
                        this.f11181g.setInterpolator(g.C1);
                        this.f11181g.start();
                        return true;
                    }
                }
                return true;
            }
            h hVar = hVarArr[0];
            if (hVar != null && (valueAnimator2 = hVar.e) != null) {
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
        if (hVar3 != null && (valueAnimator = hVar3.e) != null) {
            valueAnimator.cancel();
        }
        hVarArr[1] = null;
        return false;
    }
}
