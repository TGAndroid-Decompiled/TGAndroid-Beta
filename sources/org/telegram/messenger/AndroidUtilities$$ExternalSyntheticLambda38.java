package org.telegram.messenger;

import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;
import org.telegram.ui.Stories.recorder.GallerySheet;
import org.telegram.ui.Stories.recorder.GallerySheet$$ExternalSyntheticLambda2;

public final class AndroidUtilities$$ExternalSyntheticLambda38 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final float f$2;

    public AndroidUtilities$$ExternalSyntheticLambda38(View view, float f, Runnable runnable) {
        this.f$0 = runnable;
        this.f$1 = view;
        this.f$2 = f;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.lambda$shakeViewSpring$14((Runnable) this.f$0, (View) this.f$1, this.f$2, dynamicAnimation, z, f, f2);
                break;
            default:
                GallerySheet gallerySheet = (GallerySheet) this.f$0;
                if (!z) {
                    GallerySheet.AnonymousClass1 anonymousClass1 = gallerySheet.listView;
                    anonymousClass1.setTranslationY(this.f$2);
                    anonymousClass1.ignoreScroll = false;
                    gallerySheet.galleryOpenCloseSpringAnimator = null;
                    gallerySheet.galleryListViewOpening = null;
                    GallerySheet$$ExternalSyntheticLambda2 gallerySheet$$ExternalSyntheticLambda2 = (GallerySheet$$ExternalSyntheticLambda2) this.f$1;
                    if (gallerySheet$$ExternalSyntheticLambda2 != null) {
                        gallerySheet$$ExternalSyntheticLambda2.run();
                    }
                } else {
                    gallerySheet.getClass();
                }
                break;
        }
    }

    public AndroidUtilities$$ExternalSyntheticLambda38(GallerySheet gallerySheet, float f, GallerySheet$$ExternalSyntheticLambda2 gallerySheet$$ExternalSyntheticLambda2) {
        this.f$0 = gallerySheet;
        this.f$2 = f;
        this.f$1 = gallerySheet$$ExternalSyntheticLambda2;
    }
}
