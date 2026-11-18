package og;

import android.view.ViewTreeObserver;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class k implements ViewTreeObserver.OnPreDrawListener {
    public final int f21875a;
    public final we f21876b;
    public final int f21877c;
    public final int d;
    public final o f21878e;

    public k(o oVar, we weVar, int i7, int i10, int i11) {
        this.f21875a = i11;
        this.f21878e = oVar;
        this.f21876b = weVar;
        this.f21877c = i7;
        this.d = i10;
    }

    @Override
    public final boolean onPreDraw() {
        float f10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        boolean z11;
        switch (this.f21875a) {
            case 0:
                o oVar = this.f21878e;
                oVar.l(false);
                CropAreaView cropAreaView = oVar.f21893a;
                we weVar = this.f21876b;
                if (weVar != null) {
                    float f14 = weVar.v;
                    if (f14 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f14);
                        n nVar = oVar.N;
                        if (nVar != null) {
                            nVar.w(true);
                        }
                    }
                    oVar.setFreeform(weVar.f27688u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i7 = weVar.f27681k;
                    int i10 = this.f21877c;
                    int i11 = this.d;
                    if (i7 != 90 && i7 != 270) {
                        m mVar = oVar.M;
                        f10 = mVar.f21883a;
                        f11 = mVar.f21884b;
                        i11 = i10;
                        i10 = i11;
                    } else {
                        aspectRatio = 1.0f / aspectRatio;
                        m mVar2 = oVar.M;
                        f10 = mVar2.f21884b;
                        f11 = mVar2.f21883a;
                    }
                    if (oVar.f21903y && cropAreaView.getLockAspectRatio() > 0.0f) {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    } else {
                        int currentWidth = oVar.getCurrentWidth();
                        int currentHeight = oVar.getCurrentHeight();
                        if ((i7 + oVar.M.f21888g) % 180.0f != 0.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        cropAreaView.e(currentWidth, currentHeight, z10, oVar.f21903y);
                    }
                    m.d(oVar.M, i7);
                    cropAreaView.setActualRect((aspectRatio * weVar.f27677e) / weVar.f27678f);
                    m mVar3 = oVar.M;
                    mVar3.f21890j = weVar.f27682l;
                    m.e(mVar3, weVar.d);
                    m mVar4 = oVar.M;
                    float f15 = weVar.f27674a * i10;
                    float f16 = mVar4.f21887f;
                    m.f(mVar4, f15 * f16, weVar.f27675b * i11 * f16);
                    float max = Math.max(cropAreaView.getCropWidth() / f10, cropAreaView.getCropHeight() / f11);
                    m mVar5 = oVar.M;
                    m.g(mVar5, weVar.f27676c * (max / mVar5.f21887f), 0.0f, 0.0f);
                    oVar.r(false);
                    n nVar2 = oVar.N;
                    if (nVar2 != null) {
                        nVar2.D(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            default:
                o oVar2 = this.f21878e;
                oVar2.l(false);
                CropAreaView cropAreaView2 = oVar2.f21893a;
                we weVar2 = this.f21876b;
                if (weVar2 != null) {
                    float f17 = weVar2.v;
                    if (f17 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f17);
                        n nVar3 = oVar2.N;
                        if (nVar3 != null) {
                            nVar3.w(true);
                        }
                    }
                    oVar2.setFreeform(weVar2.f27688u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i12 = weVar2.f27681k;
                    int i13 = this.f21877c;
                    int i14 = this.d;
                    if (i12 != 90 && i12 != 270) {
                        m mVar6 = oVar2.M;
                        f12 = mVar6.f21883a;
                        f13 = mVar6.f21884b;
                        i14 = i13;
                        i13 = i14;
                    } else {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        m mVar7 = oVar2.M;
                        f12 = mVar7.f21884b;
                        f13 = mVar7.f21883a;
                    }
                    if (oVar2.f21903y && cropAreaView2.getLockAspectRatio() > 0.0f) {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    } else {
                        int currentWidth2 = oVar2.getCurrentWidth();
                        int currentHeight2 = oVar2.getCurrentHeight();
                        if ((i12 + oVar2.M.f21888g) % 180.0f != 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        cropAreaView2.e(currentWidth2, currentHeight2, z11, oVar2.f21903y);
                    }
                    m.d(oVar2.M, i12);
                    cropAreaView2.setActualRect((aspectRatio2 * weVar2.f27677e) / weVar2.f27678f);
                    m mVar8 = oVar2.M;
                    mVar8.f21890j = weVar2.f27682l;
                    m.e(mVar8, weVar2.d);
                    m mVar9 = oVar2.M;
                    float f18 = weVar2.f27674a * i13;
                    float f19 = mVar9.f21887f;
                    m.f(mVar9, f18 * f19, weVar2.f27675b * i14 * f19);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f12, cropAreaView2.getCropHeight() / f13);
                    m mVar10 = oVar2.M;
                    m.g(mVar10, weVar2.f27676c * (max2 / mVar10.f21887f), 0.0f, 0.0f);
                    oVar2.r(false);
                    n nVar4 = oVar2.N;
                    if (nVar4 != null) {
                        nVar4.D(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
        }
    }
}
