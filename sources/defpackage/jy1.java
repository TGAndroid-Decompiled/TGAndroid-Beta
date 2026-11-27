package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jy1 extends oq0 {
    public final ChatActivityEnterView E;

    public jy1(ChatActivityEnterView chatActivityEnterView, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.E = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.d4 == 1) {
            chatActivityEnterView.O3.o(f);
        }
    }
}
