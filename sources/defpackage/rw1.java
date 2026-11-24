package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rw1 extends AnimatorListenerAdapter {
    public final byte a;
    public boolean b;
    public final ChatActivityEnterView c;

    public rw1(ChatActivityEnterView chatActivityEnterView, boolean z, byte b) {
        this.a = b;
        this.c = chatActivityEnterView;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.i3 = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        pw1 pw1Var;
        byte b = this.a;
        int i = 0;
        float f = 0.0f;
        ChatActivityEnterView chatActivityEnterView = this.c;
        switch (b) {
            case 0:
                if (chatActivityEnterView.o7) {
                    ImageView imageView = chatActivityEnterView.m2;
                    if (!this.b) {
                        i = 8;
                    }
                    imageView.setVisibility(i);
                    return;
                }
                return;
            case 1:
                if (!this.b) {
                    int i2 = ChatActivityEnterView.r7;
                    chatActivityEnterView.t(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.O5 = false;
                my1 my1Var = chatActivityEnterView.Z0;
                if (my1Var != null) {
                    my1Var.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                kra kraVar = chatActivityEnterView.E5;
                if (kraVar != null) {
                    kraVar.a();
                }
                Bitmap bitmap = chatActivityEnterView.F5;
                if (bitmap != null) {
                    bitmap.recycle();
                    chatActivityEnterView.F5 = null;
                    return;
                }
                return;
            case 2:
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.f2.setVisibility(8);
                    if (this.b && (pw1Var = chatActivityEnterView.z2) != null) {
                        pw1Var.setVisibility(8);
                    }
                    chatActivityEnterView.i3 = null;
                    return;
                }
                return;
            case 3:
                chatActivityEnterView.C2 = null;
                if (!this.b) {
                    chatActivityEnterView.z2.setVisibility(8);
                    return;
                }
                return;
            default:
                if (this.b) {
                    f = 1.0f;
                }
                chatActivityEnterView.x0 = f;
                wx1 wx1Var = chatActivityEnterView.V0;
                if (wx1Var != null) {
                    wx1Var.Z();
                    return;
                }
                return;
        }
    }

    public rw1(ChatActivityEnterView chatActivityEnterView) {
        this.a = (byte) 1;
        this.c = chatActivityEnterView;
    }
}
