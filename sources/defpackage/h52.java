package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class h52 extends AnimatorListenerAdapter {
    public final byte a;
    public final ChatAttachAlertPhotoLayout b;

    public h52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, byte b) {
        this.a = b;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        byte b = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (b) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.s0;
                r52 r52Var = chatAttachAlertPhotoLayout.Q;
                if (r52Var != null && r52Var.isFrontface()) {
                    i = 2131230929;
                } else {
                    i = 2131230930;
                }
                imageView.setImageResource(i);
                ObjectAnimator.ofFloat(imageView, View.SCALE_X, 1.0f).setDuration(100L).start();
                return;
            case 1:
                chatAttachAlertPhotoLayout.n0 = null;
                return;
            case 2:
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.e0 = false;
                r52 r52Var2 = chatAttachAlertPhotoLayout.Q;
                if (r52Var2 != null) {
                    r52Var2.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                if (chatAttachAlertPhotoLayout.c0) {
                    chatAttachAlertPhotoLayout.b.W3.V();
                }
                r52 r52Var3 = chatAttachAlertPhotoLayout.Q;
                if (r52Var3 != null) {
                    r52Var3.setSystemUiVisibility(1028);
                }
                i52 i52Var = chatAttachAlertPhotoLayout.F;
                if (i52Var != null) {
                    i52Var.invalidate();
                    return;
                }
                return;
            default:
                r3d r3dVar = chatAttachAlertPhotoLayout.m0;
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.j1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.e0 = false;
                i52 i52Var2 = chatAttachAlertPhotoLayout.F;
                if (i52Var2 != null) {
                    i52Var2.invalidate();
                }
                r52 r52Var4 = chatAttachAlertPhotoLayout.Q;
                if (r52Var4 != null) {
                    r52Var4.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                chatAttachAlertPhotoLayout.c0 = false;
                zc zcVar = chatAttachAlertPhotoLayout.k0;
                if (zcVar != null) {
                    zcVar.setVisibility(8);
                }
                if (r3dVar != null) {
                    r3dVar.setVisibility(8);
                    r3dVar.setTag(null);
                }
                i52 i52Var3 = chatAttachAlertPhotoLayout.r;
                if (i52Var3 != null) {
                    i52Var3.setVisibility(8);
                }
                r52 r52Var5 = chatAttachAlertPhotoLayout.Q;
                if (r52Var5 != null) {
                    r52Var5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.Q.setSystemUiVisibility(1024);
                    return;
                }
                return;
        }
    }
}
