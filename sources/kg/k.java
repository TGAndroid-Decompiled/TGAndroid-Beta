package kg;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import fi.z6;
import org.telegram.messenger.AndroidUtilities;
public final class k {
    public h f16632a;
    public float f16633b;
    public boolean f16634c;
    public float d;
    public float e;
    public long f16635f;
    public ValueAnimator f16636g;
    public Rect h;
    public Rect f16637i;
    public Rect f16638j;
    public float f16639k;
    public float f16640l;
    public float f16641m;
    public i[] f16642n;

    public final boolean a(int i10, int i11, int i12) {
        i iVar;
        Rect rect = this.f16637i;
        Rect rect2 = this.h;
        i[] iVarArr = this.f16642n;
        if (i12 == 0) {
            if (rect2.contains(i10, i11)) {
                i iVar2 = iVarArr[0];
                if (iVar2 != null) {
                    iVarArr[1] = iVar2;
                }
                i iVar3 = new i(this, 1);
                iVarArr[0] = iVar3;
                iVar3.f16629c = this.f16639k;
                iVar3.f16628b = i10;
                iVar3.a();
                ValueAnimator valueAnimator = this.f16636g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    return true;
                }
            } else if (rect.contains(i10, i11)) {
                i iVar4 = iVarArr[0];
                if (iVar4 != null) {
                    iVarArr[1] = iVar4;
                }
                i iVar5 = new i(this, 2);
                iVarArr[0] = iVar5;
                iVar5.d = this.f16640l;
                iVar5.f16628b = i10;
                iVar5.a();
                ValueAnimator valueAnimator2 = this.f16636g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.f16638j.contains(i10, i11)) {
                i iVar6 = new i(this, 4);
                iVarArr[0] = iVar6;
                iVar6.d = this.f16640l;
                iVar6.f16629c = this.f16639k;
                iVar6.f16628b = i10;
                iVar6.a();
                ValueAnimator valueAnimator3 = this.f16636g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i11 < rect2.bottom && i11 > rect2.top) {
                    this.f16634c = true;
                    this.d = i10;
                    this.e = i11;
                    this.f16635f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f16636g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f16632a.a(this.f16639k, this.f16640l, true);
                        }
                        this.f16636g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i12 == 1 && (iVar = iVarArr[0]) != null && iVar.f16627a != 4) {
            if (rect2.contains(i10, i11) && iVarArr[0].f16627a != 1) {
                i iVar7 = new i(this, 1);
                iVarArr[1] = iVar7;
                iVar7.f16629c = this.f16639k;
                iVar7.f16628b = i10;
                iVar7.a();
                ValueAnimator valueAnimator5 = this.f16636g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i10, i11) && iVarArr[0].f16627a != 2) {
                i iVar8 = new i(this, 2);
                iVarArr[1] = iVar8;
                iVar8.d = this.f16640l;
                iVar8.f16628b = i10;
                iVar8.a();
                ValueAnimator valueAnimator6 = this.f16636g;
                if (valueAnimator6 != null) {
                    valueAnimator6.cancel();
                }
            }
            return true;
        }
        return false;
    }

    public final boolean b(int i10, int i11) {
        i iVar;
        boolean z10;
        if (this.f16634c || (iVar = this.f16642n[i11]) == null) {
            return false;
        }
        int i12 = iVar.f16627a;
        float f7 = iVar.f16629c;
        float f10 = iVar.d;
        int i13 = iVar.f16628b;
        if (i12 == 1) {
            float f11 = f7 - ((i13 - i10) / this.f16633b);
            this.f16639k = f11;
            if (f11 < 0.0f) {
                this.f16639k = 0.0f;
            }
            float f12 = this.f16640l;
            float f13 = this.f16641m;
            if (f12 - this.f16639k < f13) {
                this.f16639k = f12 - f13;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            float f14 = f10 - ((i13 - i10) / this.f16633b);
            this.f16640l = f14;
            if (f14 > 1.0f) {
                this.f16640l = 1.0f;
            }
            float f15 = this.f16640l;
            float f16 = this.f16639k;
            float f17 = this.f16641m;
            if (f15 - f16 < f17) {
                this.f16640l = f16 + f17;
            }
            z10 = true;
        }
        if (i12 == 4) {
            float f18 = (i13 - i10) / this.f16633b;
            float f19 = f7 - f18;
            this.f16639k = f19;
            this.f16640l = f10 - f18;
            if (f19 < 0.0f) {
                this.f16639k = 0.0f;
                this.f16640l = f10 - f7;
            }
            if (this.f16640l > 1.0f) {
                this.f16640l = 1.0f;
                this.f16639k = 1.0f - (f10 - f7);
            }
            z10 = true;
        }
        if (z10) {
            this.f16632a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i10, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f7;
        float f10;
        i[] iVarArr = this.f16642n;
        if (i10 == 0) {
            if (this.f16634c) {
                this.f16634c = false;
                float x9 = this.d - motionEvent.getX();
                float y3 = this.e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f16635f < 300) {
                    if (Math.sqrt((y3 * y3) + (x9 * x9)) < AndroidUtilities.dp(10.0f)) {
                        float f11 = (this.d - h.f16567k1) / this.f16633b;
                        float f12 = this.f16640l;
                        float f13 = this.f16639k;
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
                        this.f16636g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f16632a.a(f10, f7, true);
                        this.f16636g.addUpdateListener(new z6(this, f13, f10, f12, f7, 1));
                        this.f16636g.setInterpolator(h.C1);
                        this.f16636g.start();
                        return true;
                    }
                }
                return true;
            }
            i iVar = iVarArr[0];
            if (iVar != null && (valueAnimator2 = iVar.e) != null) {
                valueAnimator2.cancel();
            }
            iVarArr[0] = null;
            i iVar2 = iVarArr[1];
            if (iVar2 != null) {
                iVarArr[0] = iVar2;
                iVarArr[1] = null;
            }
            return false;
        }
        i iVar3 = iVarArr[1];
        if (iVar3 != null && (valueAnimator = iVar3.e) != null) {
            valueAnimator.cancel();
        }
        iVarArr[1] = null;
        return false;
    }
}
