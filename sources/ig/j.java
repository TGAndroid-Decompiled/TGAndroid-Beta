package ig;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import ci.m7;
import org.telegram.messenger.AndroidUtilities;
public final class j {
    public g f12161a;
    public float f12162b;
    public boolean f12163c;
    public float d;
    public float f12164e;
    public long f12165f;
    public ValueAnimator f12166g;
    public Rect h;
    public Rect f12167i;
    public Rect f12168j;
    public float f12169k;
    public float f12170l;
    public float f12171m;
    public h[] f12172n;

    public final boolean a(int i10, int i11, int i12) {
        h hVar;
        Rect rect = this.f12167i;
        Rect rect2 = this.h;
        h[] hVarArr = this.f12172n;
        if (i12 == 0) {
            if (rect2.contains(i10, i11)) {
                h hVar2 = hVarArr[0];
                if (hVar2 != null) {
                    hVarArr[1] = hVar2;
                }
                h hVar3 = new h(this, 1);
                hVarArr[0] = hVar3;
                hVar3.f12157c = this.f12169k;
                hVar3.f12156b = i10;
                hVar3.a();
                ValueAnimator valueAnimator = this.f12166g;
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
                hVar5.d = this.f12170l;
                hVar5.f12156b = i10;
                hVar5.a();
                ValueAnimator valueAnimator2 = this.f12166g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.f12168j.contains(i10, i11)) {
                h hVar6 = new h(this, 4);
                hVarArr[0] = hVar6;
                hVar6.d = this.f12170l;
                hVar6.f12157c = this.f12169k;
                hVar6.f12156b = i10;
                hVar6.a();
                ValueAnimator valueAnimator3 = this.f12166g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i11 < rect2.bottom && i11 > rect2.top) {
                    this.f12163c = true;
                    this.d = i10;
                    this.f12164e = i11;
                    this.f12165f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f12166g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f12161a.a(this.f12169k, this.f12170l, true);
                        }
                        this.f12166g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i12 == 1 && (hVar = hVarArr[0]) != null && hVar.f12155a != 4) {
            if (rect2.contains(i10, i11) && hVarArr[0].f12155a != 1) {
                h hVar7 = new h(this, 1);
                hVarArr[1] = hVar7;
                hVar7.f12157c = this.f12169k;
                hVar7.f12156b = i10;
                hVar7.a();
                ValueAnimator valueAnimator5 = this.f12166g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i10, i11) && hVarArr[0].f12155a != 2) {
                h hVar8 = new h(this, 2);
                hVarArr[1] = hVar8;
                hVar8.d = this.f12170l;
                hVar8.f12156b = i10;
                hVar8.a();
                ValueAnimator valueAnimator6 = this.f12166g;
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
        if (this.f12163c || (hVar = this.f12172n[i11]) == null) {
            return false;
        }
        int i12 = hVar.f12155a;
        float f7 = hVar.f12157c;
        float f10 = hVar.d;
        int i13 = hVar.f12156b;
        if (i12 == 1) {
            float f11 = f7 - ((i13 - i10) / this.f12162b);
            this.f12169k = f11;
            if (f11 < 0.0f) {
                this.f12169k = 0.0f;
            }
            float f12 = this.f12170l;
            float f13 = this.f12171m;
            if (f12 - this.f12169k < f13) {
                this.f12169k = f12 - f13;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            float f14 = f10 - ((i13 - i10) / this.f12162b);
            this.f12170l = f14;
            if (f14 > 1.0f) {
                this.f12170l = 1.0f;
            }
            float f15 = this.f12170l;
            float f16 = this.f12169k;
            float f17 = this.f12171m;
            if (f15 - f16 < f17) {
                this.f12170l = f16 + f17;
            }
            z10 = true;
        }
        if (i12 == 4) {
            float f18 = (i13 - i10) / this.f12162b;
            float f19 = f7 - f18;
            this.f12169k = f19;
            this.f12170l = f10 - f18;
            if (f19 < 0.0f) {
                this.f12169k = 0.0f;
                this.f12170l = f10 - f7;
            }
            if (this.f12170l > 1.0f) {
                this.f12170l = 1.0f;
                this.f12169k = 1.0f - (f10 - f7);
            }
            z10 = true;
        }
        if (z10) {
            this.f12161a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i10, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f7;
        float f10;
        h[] hVarArr = this.f12172n;
        if (i10 == 0) {
            if (this.f12163c) {
                this.f12163c = false;
                float x10 = this.d - motionEvent.getX();
                float y3 = this.f12164e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f12165f < 300) {
                    if (Math.sqrt((y3 * y3) + (x10 * x10)) < AndroidUtilities.dp(10.0f)) {
                        float f11 = (this.d - g.f12094k1) / this.f12162b;
                        float f12 = this.f12170l;
                        float f13 = this.f12169k;
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
                        this.f12166g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f12161a.a(f10, f7, true);
                        this.f12166g.addUpdateListener(new m7(this, f13, f10, f12, f7, 1));
                        this.f12166g.setInterpolator(g.C1);
                        this.f12166g.start();
                        return true;
                    }
                }
                return true;
            }
            h hVar = hVarArr[0];
            if (hVar != null && (valueAnimator2 = hVar.f12158e) != null) {
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
        if (hVar3 != null && (valueAnimator = hVar3.f12158e) != null) {
            valueAnimator.cancel();
        }
        hVarArr[1] = null;
        return false;
    }
}
