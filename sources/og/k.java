package og;

import android.view.ViewTreeObserver;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class k implements ViewTreeObserver.OnPreDrawListener {
    public final int f20989a;
    public final ye f20990b;
    public final int f20991c;
    public final int d;
    public final o f20992e;

    public k(o oVar, ye yeVar, int i7, int i10, int i11) {
        this.f20989a = i11;
        this.f20992e = oVar;
        this.f20990b = yeVar;
        this.f20991c = i7;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        float f11;
        boolean z9;
        float f12;
        float f13;
        boolean z10;
        switch (this.f20989a) {
            case 0:
                o oVar = this.f20992e;
                oVar.l(false);
                CropAreaView cropAreaView = oVar.f21007a;
                ye yeVar = this.f20990b;
                if (yeVar != null) {
                    float f14 = yeVar.v;
                    if (f14 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f14);
                        n nVar = oVar.M;
                        if (nVar != null) {
                            nVar.H(true);
                        }
                    }
                    oVar.setFreeform(yeVar.f26649u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i7 = yeVar.f26642k;
                    int i10 = this.f20991c;
                    int i11 = this.d;
                    if (i7 != 90 && i7 != 270) {
                        m mVar = oVar.L;
                        f10 = mVar.f20997a;
                        f11 = mVar.f20998b;
                        i11 = i10;
                        i10 = i11;
                    } else {
                        aspectRatio = 1.0f / aspectRatio;
                        m mVar2 = oVar.L;
                        f10 = mVar2.f20998b;
                        f11 = mVar2.f20997a;
                    }
                    if (oVar.f21017y && cropAreaView.getLockAspectRatio() > 0.0f) {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    } else {
                        int currentWidth = oVar.getCurrentWidth();
                        int currentHeight = oVar.getCurrentHeight();
                        if ((i7 + oVar.L.f21002g) % 180.0f != 0.0f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        cropAreaView.e(currentWidth, currentHeight, z9, oVar.f21017y);
                    }
                    m.d(oVar.L, i7);
                    cropAreaView.setActualRect((aspectRatio * yeVar.f26638e) / yeVar.f26639f);
                    m mVar3 = oVar.L;
                    mVar3.f21004j = yeVar.f26643l;
                    m.e(mVar3, yeVar.d);
                    m mVar4 = oVar.L;
                    float f15 = yeVar.f26635a * i10;
                    float f16 = mVar4.f21001f;
                    m.f(mVar4, f15 * f16, yeVar.f26636b * i11 * f16);
                    float max = Math.max(cropAreaView.getCropWidth() / f10, cropAreaView.getCropHeight() / f11);
                    m mVar5 = oVar.L;
                    m.g(mVar5, yeVar.f26637c * (max / mVar5.f21001f), 0.0f, 0.0f);
                    oVar.r(false);
                    n nVar2 = oVar.M;
                    if (nVar2 != null) {
                        nVar2.Z(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            default:
                o oVar2 = this.f20992e;
                oVar2.l(false);
                CropAreaView cropAreaView2 = oVar2.f21007a;
                ye yeVar2 = this.f20990b;
                if (yeVar2 != null) {
                    float f17 = yeVar2.v;
                    if (f17 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f17);
                        n nVar3 = oVar2.M;
                        if (nVar3 != null) {
                            nVar3.H(true);
                        }
                    }
                    oVar2.setFreeform(yeVar2.f26649u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i12 = yeVar2.f26642k;
                    int i13 = this.f20991c;
                    int i14 = this.d;
                    if (i12 != 90 && i12 != 270) {
                        m mVar6 = oVar2.L;
                        f12 = mVar6.f20997a;
                        f13 = mVar6.f20998b;
                        i14 = i13;
                        i13 = i14;
                    } else {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        m mVar7 = oVar2.L;
                        f12 = mVar7.f20998b;
                        f13 = mVar7.f20997a;
                    }
                    if (oVar2.f21017y && cropAreaView2.getLockAspectRatio() > 0.0f) {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    } else {
                        int currentWidth2 = oVar2.getCurrentWidth();
                        int currentHeight2 = oVar2.getCurrentHeight();
                        if ((i12 + oVar2.L.f21002g) % 180.0f != 0.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        cropAreaView2.e(currentWidth2, currentHeight2, z10, oVar2.f21017y);
                    }
                    m.d(oVar2.L, i12);
                    cropAreaView2.setActualRect((aspectRatio2 * yeVar2.f26638e) / yeVar2.f26639f);
                    m mVar8 = oVar2.L;
                    mVar8.f21004j = yeVar2.f26643l;
                    m.e(mVar8, yeVar2.d);
                    m mVar9 = oVar2.L;
                    float f18 = yeVar2.f26635a * i13;
                    float f19 = mVar9.f21001f;
                    m.f(mVar9, f18 * f19, yeVar2.f26636b * i14 * f19);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f12, cropAreaView2.getCropHeight() / f13);
                    m mVar10 = oVar2.L;
                    m.g(mVar10, yeVar2.f26637c * (max2 / mVar10.f21001f), 0.0f, 0.0f);
                    oVar2.r(false);
                    n nVar4 = oVar2.M;
                    if (nVar4 != null) {
                        nVar4.Z(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
        }
    }
}
