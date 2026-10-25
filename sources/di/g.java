package di;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g implements Utilities.Callback {
    public final int f8568a;
    public final int f8569b;

    public g(int i10, int i11) {
        this.f8568a = i11;
        this.f8569b = i10;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        switch (this.f8568a) {
            case 0:
                q qVar = (q) ((View) obj);
                qVar.invalidate();
                qVar.f8946y.setTextColor(this.f8569b);
                return;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i10);
                        i10++;
                        org.telegram.ui.Components.t5.h(this.f8569b).b(emojiGroup.icon_emoji_id, null);
                    }
                    return;
                }
                return;
        }
    }
}
