package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ey1 extends AnimatorListenerAdapter {
    public final byte a;
    public boolean b;
    public final ChatActivityEnterView c;

    public ey1(ChatActivityEnterView chatActivityEnterView, boolean z, byte b) {
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
        cy1 cy1Var;
        byte b = this.a;
        int i = 0;
        float f = 0.0f;
        ChatActivityEnterView chatActivityEnterView = this.c;
        switch (b) {
            case 0:
                if (chatActivityEnterView.w7) {
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
                    int i2 = ChatActivityEnterView.z7;
                    chatActivityEnterView.s(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.O5 = false;
                zz1 zz1Var = chatActivityEnterView.Z0;
                if (zz1Var != null) {
                    zz1Var.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                lta ltaVar = chatActivityEnterView.E5;
                if (ltaVar != null) {
                    ltaVar.a();
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
                    if (this.b && (cy1Var = chatActivityEnterView.z2) != null) {
                        cy1Var.setVisibility(8);
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
                jz1 jz1Var = chatActivityEnterView.V0;
                if (jz1Var != null) {
                    jz1Var.Z();
                    return;
                }
                return;
        }
    }

    public ey1(ChatActivityEnterView chatActivityEnterView) {
        this.a = (byte) 1;
        this.c = chatActivityEnterView;
    }
}
