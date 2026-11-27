package defpackage;

import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jw1 implements pcc {
    public final byte a;
    public final ChatActivityEnterView b;

    public jw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                chatActivityEnterView.x0((Canvas) obj, false);
                return;
            case 1:
                chatActivityEnterView.C1((TL_iv.RichMessage) obj);
                return;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int i2 = ChatActivityEnterView.X7;
                chatActivityEnterView.F0.setText(charSequence);
                chatActivityEnterView.F0.setSelection(charSequence.length(), charSequence.length());
                return;
        }
    }
}
