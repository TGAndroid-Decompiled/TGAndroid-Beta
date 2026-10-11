package ig;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import ci.m7;
import org.telegram.messenger.AndroidUtilities;
public final class j {
    public g f12207a;
    public float f12208b;
    public boolean f12209c;
    public float d;
    public float f12210e;
    public long f12211f;
    public ValueAnimator f12212g;
    public Rect h;
    public Rect f12213i;
    public Rect f12214j;
    public float f12215k;
    public float f12216l;
    public float f12217m;
    public h[] f12218n;

    public final boolean a(int i10, int i11, int i12) {
        h hVar;
        Rect rect = this.f12213i;
        Rect rect2 = this.h;
        h[] hVarArr = this.f12218n;
        if (i12 == 0) {
            if (rect2.contains(i10, i11)) {
                h hVar2 = hVarArr[0];
                if (hVar2 != null) {
                    hVarArr[1] = hVar2;
                }
                h hVar3 = new h(this, 1);
                hVarArr[0] = hVar3;
                hVar3.f12203c = this.f12215k;
                hVar3.f12202b = i10;
                hVar3.a();
                ValueAnimator valueAnimator = this.f12212g;
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
                hVar5.d = this.f12216l;
                hVar5.f12202b = i10;
                hVar5.a();
                ValueAnimator valueAnimator2 = this.f12212g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.f12214j.contains(i10, i11)) {
                h hVar6 = new h(this, 4);
                hVarArr[0] = hVar6;
                hVar6.d = this.f12216l;
                hVar6.f12203c = this.f12215k;
                hVar6.f12202b = i10;
                hVar6.a();
                ValueAnimator valueAnimator3 = this.f12212g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i11 < rect2.bottom && i11 > rect2.top) {
                    this.f12209c = true;
                    this.d = i10;
                    this.f12210e = i11;
                    this.f12211f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f12212g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f12207a.a(this.f12215k, this.f12216l, true);
                        }
                        this.f12212g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i12 == 1 && (hVar = hVarArr[0]) != null && hVar.f12201a != 4) {
            if (rect2.contains(i10, i11) && hVarArr[0].f12201a != 1) {
                h hVar7 = new h(this, 1);
                hVarArr[1] = hVar7;
                hVar7.f12203c = this.f12215k;
                hVar7.f12202b = i10;
                hVar7.a();
                ValueAnimator valueAnimator5 = this.f12212g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i10, i11) && hVarArr[0].f12201a != 2) {
                h hVar8 = new h(this, 2);
                hVarArr[1] = hVar8;
                hVar8.d = this.f12216l;
                hVar8.f12202b = i10;
                hVar8.a();
                ValueAnimator valueAnimator6 = this.f12212g;
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
        if (this.f12209c || (hVar = this.f12218n[i11]) == null) {
            return false;
        }
        int i12 = hVar.f12201a;
        float f7 = hVar.f12203c;
        float f10 = hVar.d;
        int i13 = hVar.f12202b;
        if (i12 == 1) {
            float f11 = f7 - ((i13 - i10) / this.f12208b);
            this.f12215k = f11;
            if (f11 < 0.0f) {
                this.f12215k = 0.0f;
            }
            float f12 = this.f12216l;
            float f13 = this.f12217m;
            if (f12 - this.f12215k < f13) {
                this.f12215k = f12 - f13;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            float f14 = f10 - ((i13 - i10) / this.f12208b);
            this.f12216l = f14;
            if (f14 > 1.0f) {
                this.f12216l = 1.0f;
            }
            float f15 = this.f12216l;
            float f16 = this.f12215k;
            float f17 = this.f12217m;
            if (f15 - f16 < f17) {
                this.f12216l = f16 + f17;
            }
            z10 = true;
        }
        if (i12 == 4) {
            float f18 = (i13 - i10) / this.f12208b;
            float f19 = f7 - f18;
            this.f12215k = f19;
            this.f12216l = f10 - f18;
            if (f19 < 0.0f) {
                this.f12215k = 0.0f;
                this.f12216l = f10 - f7;
            }
            if (this.f12216l > 1.0f) {
                this.f12216l = 1.0f;
                this.f12215k = 1.0f - (f10 - f7);
            }
            z10 = true;
        }
        if (z10) {
            this.f12207a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i10, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f7;
        float f10;
        h[] hVarArr = this.f12218n;
        if (i10 == 0) {
            if (this.f12209c) {
                this.f12209c = false;
                float x10 = this.d - motionEvent.getX();
                float y3 = this.f12210e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f12211f < 300) {
                    if (Math.sqrt((y3 * y3) + (x10 * x10)) < AndroidUtilities.dp(10.0f)) {
                        float f11 = (this.d - g.f12140k1) / this.f12208b;
                        float f12 = this.f12216l;
                        float f13 = this.f12215k;
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
                        this.f12212g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f12207a.a(f10, f7, true);
                        this.f12212g.addUpdateListener(new m7(this, f13, f10, f12, f7, 1));
                        this.f12212g.setInterpolator(g.C1);
                        this.f12212g.start();
                        return true;
                    }
                }
                return true;
            }
            h hVar = hVarArr[0];
            if (hVar != null && (valueAnimator2 = hVar.f12204e) != null) {
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
        if (hVar3 != null && (valueAnimator = hVar3.f12204e) != null) {
            valueAnimator.cancel();
        }
        hVarArr[1] = null;
        return false;
    }
}
