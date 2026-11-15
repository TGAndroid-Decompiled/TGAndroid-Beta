package lg;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import hi.i6;
import org.telegram.messenger.g0;
public final class j {
    public g f19471a;
    public float f19472b;
    public boolean f19473c;
    public float d;
    public float f19474e;
    public long f19475f;
    public ValueAnimator f19476g;
    public Rect h;
    public Rect f19477i;
    public Rect f19478j;
    public float f19479k;
    public float f19480l;
    public float f19481m;
    public h[] f19482n;

    public final boolean a(int i7, int i10, int i11) {
        h hVar;
        Rect rect = this.f19477i;
        Rect rect2 = this.h;
        h[] hVarArr = this.f19482n;
        if (i11 == 0) {
            if (rect2.contains(i7, i10)) {
                h hVar2 = hVarArr[0];
                if (hVar2 != null) {
                    hVarArr[1] = hVar2;
                }
                h hVar3 = new h(this, 1);
                hVarArr[0] = hVar3;
                hVar3.f19467c = this.f19479k;
                hVar3.f19466b = i7;
                hVar3.a();
                ValueAnimator valueAnimator = this.f19476g;
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
                hVar5.d = this.f19480l;
                hVar5.f19466b = i7;
                hVar5.a();
                ValueAnimator valueAnimator2 = this.f19476g;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    return true;
                }
            } else if (this.f19478j.contains(i7, i10)) {
                h hVar6 = new h(this, 4);
                hVarArr[0] = hVar6;
                hVar6.d = this.f19480l;
                hVar6.f19467c = this.f19479k;
                hVar6.f19466b = i7;
                hVar6.a();
                ValueAnimator valueAnimator3 = this.f19476g;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    return true;
                }
            } else {
                if (i10 < rect2.bottom && i10 > rect2.top) {
                    this.f19473c = true;
                    this.d = i7;
                    this.f19474e = i10;
                    this.f19475f = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f19476g;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f19471a.a(this.f19479k, this.f19480l, true);
                        }
                        this.f19476g.cancel();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (i11 == 1 && (hVar = hVarArr[0]) != null && hVar.f19465a != 4) {
            if (rect2.contains(i7, i10) && hVarArr[0].f19465a != 1) {
                h hVar7 = new h(this, 1);
                hVarArr[1] = hVar7;
                hVar7.f19467c = this.f19479k;
                hVar7.f19466b = i7;
                hVar7.a();
                ValueAnimator valueAnimator5 = this.f19476g;
                if (valueAnimator5 != null) {
                    valueAnimator5.cancel();
                    return true;
                }
            } else if (rect.contains(i7, i10) && hVarArr[0].f19465a != 2) {
                h hVar8 = new h(this, 2);
                hVarArr[1] = hVar8;
                hVar8.d = this.f19480l;
                hVar8.f19466b = i7;
                hVar8.a();
                ValueAnimator valueAnimator6 = this.f19476g;
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
        if (this.f19473c || (hVar = this.f19482n[i10]) == null) {
            return false;
        }
        int i11 = hVar.f19465a;
        float f10 = hVar.f19467c;
        float f11 = hVar.d;
        int i12 = hVar.f19466b;
        if (i11 == 1) {
            float f12 = f10 - ((i12 - i7) / this.f19472b);
            this.f19479k = f12;
            if (f12 < 0.0f) {
                this.f19479k = 0.0f;
            }
            float f13 = this.f19480l;
            float f14 = this.f19481m;
            if (f13 - this.f19479k < f14) {
                this.f19479k = f13 - f14;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 2) {
            float f15 = f11 - ((i12 - i7) / this.f19472b);
            this.f19480l = f15;
            if (f15 > 1.0f) {
                this.f19480l = 1.0f;
            }
            float f16 = this.f19480l;
            float f17 = this.f19479k;
            float f18 = this.f19481m;
            if (f16 - f17 < f18) {
                this.f19480l = f17 + f18;
            }
            z10 = true;
        }
        if (i11 == 4) {
            float f19 = (i12 - i7) / this.f19472b;
            float f20 = f10 - f19;
            this.f19479k = f20;
            this.f19480l = f11 - f19;
            if (f20 < 0.0f) {
                this.f19479k = 0.0f;
                this.f19480l = f11 - f10;
            }
            if (this.f19480l > 1.0f) {
                this.f19480l = 1.0f;
                this.f19479k = 1.0f - (f11 - f10);
            }
            z10 = true;
        }
        if (z10) {
            this.f19471a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i7, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f10;
        float f11;
        h[] hVarArr = this.f19482n;
        if (i7 == 0) {
            if (this.f19473c) {
                this.f19473c = false;
                float x10 = this.d - motionEvent.getX();
                float y10 = this.f19474e - motionEvent.getY();
                if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f19475f < 300) {
                    if (Math.sqrt((y10 * y10) + (x10 * x10)) < g0.L(10.0f)) {
                        float f12 = (this.d - g.l1) / this.f19472b;
                        float f13 = this.f19480l;
                        float f14 = this.f19479k;
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
                        this.f19476g = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f19471a.a(f11, f10, true);
                        this.f19476g.addUpdateListener(new i6(this, f14, f11, f13, f10, 1));
                        this.f19476g.setInterpolator(g.D1);
                        this.f19476g.start();
                        return true;
                    }
                }
                return true;
            }
            h hVar = hVarArr[0];
            if (hVar != null && (valueAnimator2 = hVar.f19468e) != null) {
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
        if (hVar3 != null && (valueAnimator = hVar3.f19468e) != null) {
            valueAnimator.cancel();
        }
        hVarArr[1] = null;
        return false;
    }
}
