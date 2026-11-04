package ei;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
public final class g implements u10 {
    public final int f10292a;
    public final int f10293b;

    public g(int i3, int i10) {
        this.f10292a = i10;
        this.f10293b = i3;
    }

    @Override
    public final void a(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        switch (this.f10292a) {
            case 0:
                q qVar = (q) ((View) obj);
                qVar.invalidate();
                qVar.E.setTextColor(this.f10293b);
                return;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i3);
                        i3++;
                        org.telegram.ui.Components.g5.g(this.f10293b).b(emojiGroup.icon_emoji_id, null);
                    }
                    return;
                }
                return;
        }
    }
}
