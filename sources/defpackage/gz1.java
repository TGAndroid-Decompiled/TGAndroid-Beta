package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gz1 extends or0 {
    public final ChatActivityEnterView E;

    public gz1(ChatActivityEnterView chatActivityEnterView, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.E = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.e4 == 1) {
            chatActivityEnterView.P3.o(f);
        }
    }
}
