package mg;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class l implements ViewTreeObserver.OnPreDrawListener {
    public final MediaController.CropState f16311a;
    public final int f16312b;
    public final int f16313c;
    public final q d;

    public l(q qVar, MediaController.CropState cropState, int i10, int i11) {
        this.d = qVar;
        this.f16311a = cropState;
        this.f16312b = i10;
        this.f16313c = i11;
    }

    @Override
    public final boolean onPreDraw() {
        float f7;
        float f10;
        boolean z10;
        q qVar = this.d;
        qVar.l(false);
        CropAreaView cropAreaView = qVar.f16330a;
        MediaController.CropState cropState = this.f16311a;
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
            int i11 = this.f16312b;
            int i12 = this.f16313c;
            if (i10 != 90 && i10 != 270) {
                o oVar = qVar.L;
                f7 = oVar.f16320a;
                f10 = oVar.f16321b;
                i12 = i11;
                i11 = i12;
            } else {
                aspectRatio = 1.0f / aspectRatio;
                o oVar2 = qVar.L;
                f7 = oVar2.f16321b;
                f10 = oVar2.f16320a;
            }
            if (qVar.f16339x && cropAreaView.getLockAspectRatio() > 0.0f) {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            } else {
                int currentWidth = qVar.getCurrentWidth();
                int currentHeight = qVar.getCurrentHeight();
                if ((i10 + qVar.L.f16325g) % 180.0f != 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cropAreaView.e(currentWidth, currentHeight, z10, qVar.f16339x);
            }
            o.d(qVar.L, i10);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            o oVar3 = qVar.L;
            oVar3.f16327j = cropState.mirrored;
            o.e(oVar3, cropState.cropRotate);
            o oVar4 = qVar.L;
            float f12 = cropState.cropPx * i11;
            float f13 = oVar4.f16324f;
            o.f(oVar4, f12 * f13, cropState.cropPy * i12 * f13);
            float max = Math.max(cropAreaView.getCropWidth() / f7, cropAreaView.getCropHeight() / f10);
            o oVar5 = qVar.L;
            o.g(oVar5, cropState.cropScale * (max / oVar5.f16324f), 0.0f, 0.0f);
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
