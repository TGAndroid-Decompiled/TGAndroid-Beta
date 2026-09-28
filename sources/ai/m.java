package ai;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m implements Utilities.Callback {
    public final int f1221a;
    public final int f1222b;

    public m(int i10, int i11) {
        this.f1221a = i11;
        this.f1222b = i10;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        switch (this.f1221a) {
            case 0:
                a0 a0Var = (a0) ((View) obj);
                a0Var.invalidate();
                a0Var.f503y.setTextColor(this.f1222b);
                return;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.Components.q5.h(this.f1222b).b(emojiGroup.icon_emoji_id, null);
                    }
                    return;
                }
                return;
        }
    }
}
