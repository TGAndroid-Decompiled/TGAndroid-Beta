package eg;

import android.view.ViewTreeObserver;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class l implements ViewTreeObserver.OnPreDrawListener {
    public final int f6565a;
    public final ye f6566b;
    public final int f6567c;
    public final int d;
    public final q e;

    public l(q qVar, ye yeVar, int i10, int i11, int i12) {
        this.f6565a = i12;
        this.e = qVar;
        this.f6566b = yeVar;
        this.f6567c = i10;
        this.d = i11;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        float f10;
        boolean z10;
        float f11;
        float f12;
        boolean z11;
        switch (this.f6565a) {
            case 0:
                q qVar = this.e;
                qVar.l(false);
                CropAreaView cropAreaView = qVar.f6583a;
                ye yeVar = this.f6566b;
                if (yeVar != null) {
                    float f13 = yeVar.v;
                    if (f13 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f13);
                        p pVar = qVar.M;
                        if (pVar != null) {
                            pVar.g(true);
                        }
                    }
                    qVar.setFreeform(yeVar.f19377u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i10 = yeVar.f19370k;
                    int i11 = this.f6567c;
                    int i12 = this.d;
                    if (i10 != 90 && i10 != 270) {
                        o oVar = qVar.L;
                        f7 = oVar.f6574a;
                        f10 = oVar.f6575b;
                        i12 = i11;
                        i11 = i12;
                    } else {
                        aspectRatio = 1.0f / aspectRatio;
                        o oVar2 = qVar.L;
                        f7 = oVar2.f6575b;
                        f10 = oVar2.f6574a;
                    }
                    if (qVar.f6592y && cropAreaView.getLockAspectRatio() > 0.0f) {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    } else {
                        int currentWidth = qVar.getCurrentWidth();
                        int currentHeight = qVar.getCurrentHeight();
                        if ((i10 + qVar.L.f6578g) % 180.0f != 0.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        cropAreaView.e(currentWidth, currentHeight, z10, qVar.f6592y);
                    }
                    o.d(qVar.L, i10);
                    cropAreaView.setActualRect((aspectRatio * yeVar.e) / yeVar.f19367f);
                    o oVar3 = qVar.L;
                    oVar3.f6580j = yeVar.f19371l;
                    o.e(oVar3, yeVar.d);
                    o oVar4 = qVar.L;
                    float f14 = yeVar.f19364a * i11;
                    float f15 = oVar4.f6577f;
                    o.f(oVar4, f14 * f15, yeVar.f19365b * i12 * f15);
                    float max = Math.max(cropAreaView.getCropWidth() / f7, cropAreaView.getCropHeight() / f10);
                    o oVar5 = qVar.L;
                    o.g(oVar5, yeVar.f19366c * (max / oVar5.f6577f), 0.0f, 0.0f);
                    qVar.r(false);
                    p pVar2 = qVar.M;
                    if (pVar2 != null) {
                        pVar2.l(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            default:
                q qVar2 = this.e;
                qVar2.l(false);
                CropAreaView cropAreaView2 = qVar2.f6583a;
                ye yeVar2 = this.f6566b;
                if (yeVar2 != null) {
                    float f16 = yeVar2.v;
                    if (f16 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f16);
                        p pVar3 = qVar2.M;
                        if (pVar3 != null) {
                            pVar3.g(true);
                        }
                    }
                    qVar2.setFreeform(yeVar2.f19377u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i13 = yeVar2.f19370k;
                    int i14 = this.f6567c;
                    int i15 = this.d;
                    if (i13 != 90 && i13 != 270) {
                        o oVar6 = qVar2.L;
                        f11 = oVar6.f6574a;
                        f12 = oVar6.f6575b;
                        i15 = i14;
                        i14 = i15;
                    } else {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        o oVar7 = qVar2.L;
                        f11 = oVar7.f6575b;
                        f12 = oVar7.f6574a;
                    }
                    if (qVar2.f6592y && cropAreaView2.getLockAspectRatio() > 0.0f) {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    } else {
                        int currentWidth2 = qVar2.getCurrentWidth();
                        int currentHeight2 = qVar2.getCurrentHeight();
                        if ((i13 + qVar2.L.f6578g) % 180.0f != 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        cropAreaView2.e(currentWidth2, currentHeight2, z11, qVar2.f6592y);
                    }
                    o.d(qVar2.L, i13);
                    cropAreaView2.setActualRect((aspectRatio2 * yeVar2.e) / yeVar2.f19367f);
                    o oVar8 = qVar2.L;
                    oVar8.f6580j = yeVar2.f19371l;
                    o.e(oVar8, yeVar2.d);
                    o oVar9 = qVar2.L;
                    float f17 = yeVar2.f19364a * i14;
                    float f18 = oVar9.f6577f;
                    o.f(oVar9, f17 * f18, yeVar2.f19365b * i15 * f18);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f11, cropAreaView2.getCropHeight() / f12);
                    o oVar10 = qVar2.L;
                    o.g(oVar10, yeVar2.f19366c * (max2 / oVar10.f6577f), 0.0f, 0.0f);
                    qVar2.r(false);
                    p pVar4 = qVar2.M;
                    if (pVar4 != null) {
                        pVar4.l(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
        }
    }
}
