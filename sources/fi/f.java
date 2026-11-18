package fi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class f implements x10 {
    public final int f11921a;
    public final int f11922b;

    public f(int i7, int i10) {
        this.f11921a = i10;
        this.f11922b = i7;
    }

    @Override
    public final void a(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        switch (this.f11921a) {
            case 0:
                p pVar = (p) ((View) obj);
                pVar.invalidate();
                pVar.E.setTextColor(this.f11922b);
                return;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Components.o5.g(this.f11922b).b(emojiGroup.icon_emoji_id, null);
                    }
                    return;
                }
                return;
        }
    }
}
