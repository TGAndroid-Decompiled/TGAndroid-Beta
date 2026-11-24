package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jz1 extends e34 {
    public final ChatActivityEnterView V2;

    public jz1(ChatActivityEnterView chatActivityEnterView, d dVar, boolean z, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z2, ylb ylbVar, boolean z3, boolean z4) {
        super(dVar, z, true, true, context, true, chatFull, viewGroup, z2, ylbVar, z3, z4);
        this.V2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ChatActivityEnterView chatActivityEnterView = this.V2;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.e4 == 0) {
            chatActivityEnterView.P3.o(f);
        }
    }
}
