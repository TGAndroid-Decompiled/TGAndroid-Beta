package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class pw1 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final ChatActivityEnterView b;

    public pw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.z7;
                chatActivityEnterView.M0 = null;
                return;
            default:
                int i2 = ChatActivityEnterView.z7;
                chatActivityEnterView.M0 = null;
                return;
        }
    }
}
