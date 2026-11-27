package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.widget.ImageView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ow1 extends AnimatorListenerAdapter {
    public final byte a;
    public boolean b;
    public final ChatActivityEnterView c;

    public ow1(ChatActivityEnterView chatActivityEnterView, boolean z, byte b) {
        this.a = b;
        this.c = chatActivityEnterView;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b = true;
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.h3 = null;
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
        cx1 cx1Var;
        byte b = this.a;
        int i = 0;
        float f = 0.0f;
        ChatActivityEnterView chatActivityEnterView = this.c;
        switch (b) {
            case 0:
                if (this.b) {
                    f = 1.0f;
                }
                chatActivityEnterView.x0 = f;
                my1 my1Var = chatActivityEnterView.V0;
                if (my1Var != null) {
                    my1Var.Y();
                    return;
                }
                return;
            case 1:
                if (chatActivityEnterView.T7) {
                    ImageView imageView = chatActivityEnterView.l2;
                    if (!this.b) {
                        i = 8;
                    }
                    imageView.setVisibility(i);
                    return;
                }
                return;
            case 2:
                if (!this.b) {
                    int i2 = ChatActivityEnterView.X7;
                    chatActivityEnterView.s(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.X5 = false;
                ez1 ez1Var = chatActivityEnterView.Z0;
                if (ez1Var != null) {
                    ez1Var.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.C2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                mva mvaVar = chatActivityEnterView.L5;
                if (mvaVar != null) {
                    mvaVar.a();
                }
                Bitmap bitmap = chatActivityEnterView.O5;
                if (bitmap != null) {
                    bitmap.recycle();
                    chatActivityEnterView.O5 = null;
                    return;
                }
                return;
            case 3:
                if (animator.equals(chatActivityEnterView.h3)) {
                    chatActivityEnterView.e2.setVisibility(8);
                    if (this.b && (cx1Var = chatActivityEnterView.y2) != null) {
                        cx1Var.setVisibility(8);
                    }
                    chatActivityEnterView.h3 = null;
                    return;
                }
                return;
            default:
                chatActivityEnterView.B2 = null;
                if (!this.b) {
                    chatActivityEnterView.y2.setVisibility(8);
                    return;
                }
                return;
        }
    }

    public ow1(ChatActivityEnterView chatActivityEnterView) {
        this.a = (byte) 2;
        this.c = chatActivityEnterView;
    }
}
