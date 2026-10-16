package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j implements Utilities.Callback {
    public final int f3194a;
    public final int f3195b;

    public j(int i10, int i11) {
        this.f3194a = i11;
        this.f3195b = i10;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        switch (this.f3194a) {
            case 0:
                u uVar = (u) ((View) obj);
                uVar.invalidate();
                uVar.f3773y.setTextColor(this.f3195b);
                return;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.Components.s5.h(this.f3195b).b(emojiGroup.icon_emoji_id, null);
                    }
                    return;
                }
                return;
        }
    }
}
