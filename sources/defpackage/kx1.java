package defpackage;

import android.app.Dialog;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class kx1 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final Dialog b;
    public final ChatActivityEnterView c;

    public kx1(ChatActivityEnterView chatActivityEnterView, Dialog dialog, byte b) {
        this.a = b;
        this.c = chatActivityEnterView;
        this.b = dialog;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        Dialog dialog = this.b;
        ChatActivityEnterView chatActivityEnterView = this.c;
        switch (b) {
            case 0:
                chatActivityEnterView.q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.q0.postDelayed(new go1(dialog, (byte) 12), 100L);
                return true;
            default:
                chatActivityEnterView.q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.q0.postDelayed(new go1(dialog, (byte) 12), 100L);
                return true;
        }
    }
}
