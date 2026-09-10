package kg;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class l implements ViewTreeObserver.OnPreDrawListener {
    public final MediaController.CropState f12480a;
    public final int f12481b;
    public final int f12482c;
    public final p d;

    public l(p pVar, MediaController.CropState cropState, int i10, int i11) {
        this.d = pVar;
        this.f12480a = cropState;
        this.f12481b = i10;
        this.f12482c = i11;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        float f10;
        boolean z10;
        p pVar = this.d;
        pVar.l(false);
        CropAreaView cropAreaView = pVar.f12495a;
        MediaController.CropState cropState = this.f12480a;
        if (cropState != null) {
            float f11 = cropState.lockedAspectRatio;
            if (f11 > 1.0E-4f) {
                cropAreaView.setLockedAspectRatio(f11);
                o oVar = pVar.M;
                if (oVar != null) {
                    oVar.N(true);
                }
            }
            pVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i10 = cropState.transformRotation;
            int i11 = this.f12481b;
            int i12 = this.f12482c;
            if (i10 != 90 && i10 != 270) {
                n nVar = pVar.L;
                f7 = nVar.f12486a;
                f10 = nVar.f12487b;
                i12 = i11;
                i11 = i12;
            } else {
                aspectRatio = 1.0f / aspectRatio;
                n nVar2 = pVar.L;
                f7 = nVar2.f12487b;
                f10 = nVar2.f12486a;
            }
            if (pVar.f12503x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = pVar.getCurrentWidth();
                int currentHeight = pVar.getCurrentHeight();
                if ((i10 + pVar.L.f12490g) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, pVar.f12503x);
            }
            n.d(pVar.L, i10);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            n nVar3 = pVar.L;
            nVar3.f12492j = cropState.mirrored;
            n.e(nVar3, cropState.cropRotate);
            n nVar4 = pVar.L;
            float f12 = cropState.cropPx * i11;
            float f13 = nVar4.f12489f;
            n.f(nVar4, f12 * f13, cropState.cropPy * i12 * f13);
            float max = Math.max(cropAreaView.getCropWidth() / f7, cropAreaView.getCropHeight() / f10);
            n nVar5 = pVar.L;
            n.g(nVar5, cropState.cropScale * (max / nVar5.f12489f), 0.0f, 0.0f);
            pVar.r(false);
            o oVar2 = pVar.M;
            if (oVar2 != null) {
                oVar2.i0(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
