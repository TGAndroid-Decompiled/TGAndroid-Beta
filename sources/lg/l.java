package lg;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class l implements ViewTreeObserver.OnPreDrawListener {
    public final MediaController.CropState f14308a;
    public final int f14309b;
    public final int f14310c;
    public final p d;

    public l(p pVar, MediaController.CropState cropState, int i10, int i11) {
        this.d = pVar;
        this.f14308a = cropState;
        this.f14309b = i10;
        this.f14310c = i11;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        float f10;
        boolean z10;
        p pVar = this.d;
        pVar.l(false);
        CropAreaView cropAreaView = pVar.f14323a;
        MediaController.CropState cropState = this.f14308a;
        if (cropState != null) {
            float f11 = cropState.lockedAspectRatio;
            if (f11 > 1.0E-4f) {
                cropAreaView.setLockedAspectRatio(f11);
                o oVar = pVar.M;
                if (oVar != null) {
                    oVar.L(true);
                }
            }
            pVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i10 = cropState.transformRotation;
            int i11 = this.f14309b;
            int i12 = this.f14310c;
            if (i10 != 90 && i10 != 270) {
                n nVar = pVar.L;
                f7 = nVar.f14314a;
                f10 = nVar.f14315b;
                i12 = i11;
                i11 = i12;
            } else {
                aspectRatio = 1.0f / aspectRatio;
                n nVar2 = pVar.L;
                f7 = nVar2.f14315b;
                f10 = nVar2.f14314a;
            }
            if (pVar.f14331x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = pVar.getCurrentWidth();
                int currentHeight = pVar.getCurrentHeight();
                if ((i10 + pVar.L.f14318g) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, pVar.f14331x);
            }
            n.d(pVar.L, i10);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            n nVar3 = pVar.L;
            nVar3.f14320j = cropState.mirrored;
            n.e(nVar3, cropState.cropRotate);
            n nVar4 = pVar.L;
            float f12 = cropState.cropPx * i11;
            float f13 = nVar4.f14317f;
            n.f(nVar4, f12 * f13, cropState.cropPy * i12 * f13);
            float max = Math.max(cropAreaView.getCropWidth() / f7, cropAreaView.getCropHeight() / f10);
            n nVar5 = pVar.L;
            n.g(nVar5, cropState.cropScale * (max / nVar5.f14317f), 0.0f, 0.0f);
            pVar.r(false);
            o oVar2 = pVar.M;
            if (oVar2 != null) {
                oVar2.e0(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
