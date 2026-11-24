package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class lf3 implements p8c {
    public final byte a;
    public final int b;

    public lf3(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final void a(Object obj) {
        ArrayList<TLRPC.EmojiGroup> arrayList;
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                uf3 uf3Var = (uf3) ((View) obj);
                uf3Var.invalidate();
                uf3Var.E.setTextColor(i);
                return;
            default:
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null && (arrayList = tL_messages_emojiGroups.groups) != null) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        TLRPC.EmojiGroup emojiGroup = arrayList.get(i2);
                        i2++;
                        vl.g(i).b(emojiGroup.icon_emoji_id, null);
                    }
                    return;
                }
                return;
        }
    }
}
