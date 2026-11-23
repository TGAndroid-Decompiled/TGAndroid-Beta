package fi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class f implements y10 {
    public final int f11916a;
    public final int f11917b;

    public f(int i7, int i10) {
        this.f11916a = i10;
        this.f11917b = i7;
    }

    @Override
    public final void a(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        switch (this.f11916a) {
            case 0:
                p pVar = (p) ((View) obj);
                pVar.invalidate();
                pVar.E.setTextColor(this.f11917b);
                return;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i7);
                        i7++;
                        org.telegram.ui.Components.p5.g(this.f11917b).b(emojiGroup.icon_emoji_id, null);
                    }
                    return;
                }
                return;
        }
    }
}
