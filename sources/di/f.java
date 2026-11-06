package di;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
public final class f implements c20 {
    public final int f8971a;
    public final int f8972b;

    public f(int i7, int i10) {
        this.f8971a = i10;
        this.f8972b = i7;
    }

    @Override
    public final void a(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        switch (this.f8971a) {
            case 0:
                p pVar = (p) ((View) obj);
                pVar.invalidate();
                pVar.D.setTextColor(this.f8972b);
                return;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Components.i5.g(this.f8972b).b(emojiGroup.icon_emoji_id, null);
                    }
                    return;
                }
                return;
        }
    }
}
