package mg;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class k implements ViewTreeObserver.OnPreDrawListener {
    public final MediaController.CropState f16281a;
    public final int f16282b;
    public final int f16283c;
    public final q d;

    public k(q qVar, MediaController.CropState cropState, int i10, int i11) {
        this.d = qVar;
        this.f16281a = cropState;
        this.f16282b = i10;
        this.f16283c = i11;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        float f10;
        boolean z10;
        q qVar = this.d;
        qVar.l(false);
        CropAreaView cropAreaView = qVar.f16303a;
        MediaController.CropState cropState = this.f16281a;
        if (cropState != null) {
            float f11 = cropState.lockedAspectRatio;
            if (f11 > 1.0E-4f) {
                cropAreaView.setLockedAspectRatio(f11);
                p pVar = qVar.M;
                if (pVar != null) {
                    pVar.E(true);
                }
            }
            qVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i10 = cropState.transformRotation;
            int i11 = this.f16282b;
            int i12 = this.f16283c;
            if (i10 != 90 && i10 != 270) {
                o oVar = qVar.L;
                f7 = oVar.f16293a;
                f10 = oVar.f16294b;
                i12 = i11;
                i11 = i12;
            } else {
                aspectRatio = 1.0f / aspectRatio;
                o oVar2 = qVar.L;
                f7 = oVar2.f16294b;
                f10 = oVar2.f16293a;
            }
            if (qVar.f16312x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = qVar.getCurrentWidth();
                int currentHeight = qVar.getCurrentHeight();
                if ((i10 + qVar.L.f16298g) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, qVar.f16312x);
            }
            o.d(qVar.L, i10);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            o oVar3 = qVar.L;
            oVar3.f16300j = cropState.mirrored;
            o.e(oVar3, cropState.cropRotate);
            o oVar4 = qVar.L;
            float f12 = cropState.cropPx * i11;
            float f13 = oVar4.f16297f;
            o.f(oVar4, f12 * f13, cropState.cropPy * i12 * f13);
            float max = Math.max(cropAreaView.getCropWidth() / f7, cropAreaView.getCropHeight() / f10);
            o oVar5 = qVar.L;
            o.g(oVar5, cropState.cropScale * (max / oVar5.f16297f), 0.0f, 0.0f);
            qVar.r(false);
            p pVar2 = qVar.M;
            if (pVar2 != null) {
                pVar2.W(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
