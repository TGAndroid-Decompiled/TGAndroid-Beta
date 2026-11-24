package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tx1 extends oq0 {
    public final ChatActivityEnterView E;

    public tx1(ChatActivityEnterView chatActivityEnterView, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.E = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.e4 == 1) {
            chatActivityEnterView.P3.k(f);
        }
    }
}
