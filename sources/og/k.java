package og;

import android.view.ViewTreeObserver;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class k implements ViewTreeObserver.OnPreDrawListener {
    public final int f21878a;
    public final we f21879b;
    public final int f21880c;
    public final int d;
    public final o f21881e;

    public k(o oVar, we weVar, int i7, int i10, int i11) {
        this.f21878a = i11;
        this.f21881e = oVar;
        this.f21879b = weVar;
        this.f21880c = i7;
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
        switch (this.f21878a) {
            case 0:
                o oVar = this.f21881e;
                oVar.l(false);
                CropAreaView cropAreaView = oVar.f21896a;
                we weVar = this.f21879b;
                if (weVar != null) {
                    float f14 = weVar.v;
                    if (f14 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f14);
                        n nVar = oVar.N;
                        if (nVar != null) {
                            nVar.w(true);
                        }
                    }
                    oVar.setFreeform(weVar.f27690u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i7 = weVar.f27683k;
                    int i10 = this.f21880c;
                    int i11 = this.d;
                    if (i7 != 90 && i7 != 270) {
                        m mVar = oVar.M;
                        f10 = mVar.f21886a;
                        f11 = mVar.f21887b;
                        i11 = i10;
                        i10 = i11;
                    } else {
                        aspectRatio = 1.0f / aspectRatio;
                        m mVar2 = oVar.M;
                        f10 = mVar2.f21887b;
                        f11 = mVar2.f21886a;
                    }
                    if (oVar.f21906y && cropAreaView.getLockAspectRatio() > 0.0f) {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    } else {
                        int currentWidth = oVar.getCurrentWidth();
                        int currentHeight = oVar.getCurrentHeight();
                        if ((i7 + oVar.M.f21891g) % 180.0f != 0.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        cropAreaView.e(currentWidth, currentHeight, z10, oVar.f21906y);
                    }
                    m.d(oVar.M, i7);
                    cropAreaView.setActualRect((aspectRatio * weVar.f27679e) / weVar.f27680f);
                    m mVar3 = oVar.M;
                    mVar3.f21893j = weVar.f27684l;
                    m.e(mVar3, weVar.d);
                    m mVar4 = oVar.M;
                    float f15 = weVar.f27676a * i10;
                    float f16 = mVar4.f21890f;
                    m.f(mVar4, f15 * f16, weVar.f27677b * i11 * f16);
                    float max = Math.max(cropAreaView.getCropWidth() / f10, cropAreaView.getCropHeight() / f11);
                    m mVar5 = oVar.M;
                    m.g(mVar5, weVar.f27678c * (max / mVar5.f21890f), 0.0f, 0.0f);
                    oVar.r(false);
                    n nVar2 = oVar.N;
                    if (nVar2 != null) {
                        nVar2.D(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            default:
                o oVar2 = this.f21881e;
                oVar2.l(false);
                CropAreaView cropAreaView2 = oVar2.f21896a;
                we weVar2 = this.f21879b;
                if (weVar2 != null) {
                    float f17 = weVar2.v;
                    if (f17 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f17);
                        n nVar3 = oVar2.N;
                        if (nVar3 != null) {
                            nVar3.w(true);
                        }
                    }
                    oVar2.setFreeform(weVar2.f27690u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i12 = weVar2.f27683k;
                    int i13 = this.f21880c;
                    int i14 = this.d;
                    if (i12 != 90 && i12 != 270) {
                        m mVar6 = oVar2.M;
                        f12 = mVar6.f21886a;
                        f13 = mVar6.f21887b;
                        i14 = i13;
                        i13 = i14;
                    } else {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        m mVar7 = oVar2.M;
                        f12 = mVar7.f21887b;
                        f13 = mVar7.f21886a;
                    }
                    if (oVar2.f21906y && cropAreaView2.getLockAspectRatio() > 0.0f) {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    } else {
                        int currentWidth2 = oVar2.getCurrentWidth();
                        int currentHeight2 = oVar2.getCurrentHeight();
                        if ((i12 + oVar2.M.f21891g) % 180.0f != 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        cropAreaView2.e(currentWidth2, currentHeight2, z11, oVar2.f21906y);
                    }
                    m.d(oVar2.M, i12);
                    cropAreaView2.setActualRect((aspectRatio2 * weVar2.f27679e) / weVar2.f27680f);
                    m mVar8 = oVar2.M;
                    mVar8.f21893j = weVar2.f27684l;
                    m.e(mVar8, weVar2.d);
                    m mVar9 = oVar2.M;
                    float f18 = weVar2.f27676a * i13;
                    float f19 = mVar9.f21890f;
                    m.f(mVar9, f18 * f19, weVar2.f27677b * i14 * f19);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f12, cropAreaView2.getCropHeight() / f13);
                    m mVar10 = oVar2.M;
                    m.g(mVar10, weVar2.f27678c * (max2 / mVar10.f21890f), 0.0f, 0.0f);
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
