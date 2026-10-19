package mg;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class k implements ViewTreeObserver.OnPreDrawListener {
    public final MediaController.CropState f16899a;
    public final int f16900b;
    public final int f16901c;
    public final p d;

    public k(p pVar, MediaController.CropState cropState, int i10, int i11) {
        this.d = pVar;
        this.f16899a = cropState;
        this.f16900b = i10;
        this.f16901c = i11;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        float f10;
        boolean z10;
        p pVar = this.d;
        pVar.l(false);
        CropAreaView cropAreaView = pVar.f16917a;
        MediaController.CropState cropState = this.f16899a;
        if (cropState != null) {
            float f11 = cropState.lockedAspectRatio;
            if (f11 > 1.0E-4f) {
                cropAreaView.setLockedAspectRatio(f11);
                o oVar = pVar.M;
                if (oVar != null) {
                    oVar.E(true);
                }
            }
            pVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i10 = cropState.transformRotation;
            int i11 = this.f16900b;
            int i12 = this.f16901c;
            if (i10 != 90 && i10 != 270) {
                n nVar = pVar.L;
                f7 = nVar.f16908a;
                f10 = nVar.f16909b;
                i12 = i11;
                i11 = i12;
            } else {
                aspectRatio = 1.0f / aspectRatio;
                n nVar2 = pVar.L;
                f7 = nVar2.f16909b;
                f10 = nVar2.f16908a;
            }
            if (pVar.f16925x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = pVar.getCurrentWidth();
                int currentHeight = pVar.getCurrentHeight();
                if ((i10 + pVar.L.f16912g) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, pVar.f16925x);
            }
            n.d(pVar.L, i10);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            n nVar3 = pVar.L;
            nVar3.f16914j = cropState.mirrored;
            n.e(nVar3, cropState.cropRotate);
            n nVar4 = pVar.L;
            float f12 = cropState.cropPx * i11;
            float f13 = nVar4.f16911f;
            n.f(nVar4, f12 * f13, cropState.cropPy * i12 * f13);
            float max = Math.max(cropAreaView.getCropWidth() / f7, cropAreaView.getCropHeight() / f10);
            n nVar5 = pVar.L;
            n.g(nVar5, cropState.cropScale * (max / nVar5.f16911f), 0.0f, 0.0f);
            pVar.r(false);
            o oVar2 = pVar.M;
            if (oVar2 != null) {
                oVar2.R(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
