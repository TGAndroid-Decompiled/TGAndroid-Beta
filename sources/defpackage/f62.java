package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class f62 implements CameraView.CameraViewDelegate {
    public final ChatAttachAlertPhotoLayout a;

    public f62(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onCameraInit() {
        int i;
        float f;
        int i2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        ImageView imageView = chatAttachAlertPhotoLayout.s0;
        ImageView[] imageViewArr = chatAttachAlertPhotoLayout.T;
        String currentFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode();
        String nextFlashMode = chatAttachAlertPhotoLayout.Q.getCameraSession().getNextFlashMode();
        if (currentFlashMode != null && nextFlashMode != null) {
            int i3 = 4;
            if (currentFlashMode.equals(nextFlashMode)) {
                for (int i4 = 0; i4 < 2; i4++) {
                    imageViewArr[i4].setVisibility(4);
                    imageViewArr[i4].setAlpha(0.0f);
                    imageViewArr[i4].setTranslationY(0.0f);
                }
            } else {
                ChatAttachAlertPhotoLayout.r0(imageViewArr[0], chatAttachAlertPhotoLayout.Q.getCameraSession().getCurrentFlashMode());
                for (int i5 = 0; i5 < 2; i5++) {
                    ImageView imageView2 = imageViewArr[i5];
                    if (i5 == 0) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                    imageView2.setVisibility(i);
                    ImageView imageView3 = imageViewArr[i5];
                    if (i5 == 0 && chatAttachAlertPhotoLayout.c0) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    imageView3.setAlpha(f);
                    imageViewArr[i5].setTranslationY(0.0f);
                }
            }
            if (chatAttachAlertPhotoLayout.Q.isFrontface()) {
                i2 = 2131230930;
            } else {
                i2 = 2131230931;
            }
            imageView.setImageResource(i2);
            if (chatAttachAlertPhotoLayout.Q.hasFrontFaceCamera()) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            if (!chatAttachAlertPhotoLayout.c0) {
                AnimatorSet animatorSet = new AnimatorSet();
                chatAttachAlertPhotoLayout.P = animatorSet;
                animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertPhotoLayout.Q, View.ALPHA, 0.0f, 1.0f));
                chatAttachAlertPhotoLayout.P.setDuration(180L);
                chatAttachAlertPhotoLayout.P.addListener(new b91(this, (byte) 19));
                chatAttachAlertPhotoLayout.P.start();
            }
        }
    }
}
