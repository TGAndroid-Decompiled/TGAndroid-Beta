package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class my1 extends o24 {
    public final ChatActivityEnterView V2;

    public my1(ChatActivityEnterView chatActivityEnterView, e eVar, boolean z, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z2, vnb vnbVar, boolean z3, boolean z4) {
        super(eVar, z, true, true, context, true, chatFull, viewGroup, z2, vnbVar, z3, z4);
        this.V2 = chatActivityEnterView;
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ChatActivityEnterView chatActivityEnterView = this.V2;
        if (chatActivityEnterView.W0 != null && chatActivityEnterView.d4 == 0) {
            chatActivityEnterView.O3.o(f);
        }
    }
}
