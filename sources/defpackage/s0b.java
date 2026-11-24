package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s0b extends a81 {
    @Override
    public final void e(int i, Object obj, jac jacVar) {
        cf7.Y(i).a.c(new v99(i, (Integer) obj, (e) jacVar, (byte) 15));
    }

    @Override
    public final void f(int i, Object obj, long j, z71 z71Var) {
        TLRPC.TL_messages_getEmojiGroups tL_messages_getEmojiGroups;
        Integer num = (Integer) obj;
        if (num.intValue() == 1) {
            TLRPC.TL_messages_getEmojiStatusGroups tL_messages_getEmojiStatusGroups = new TLRPC.TL_messages_getEmojiStatusGroups();
            tL_messages_getEmojiStatusGroups.hash = (int) j;
            tL_messages_getEmojiGroups = tL_messages_getEmojiStatusGroups;
        } else if (num.intValue() == 2) {
            TLRPC.TL_messages_getEmojiProfilePhotoGroups tL_messages_getEmojiProfilePhotoGroups = new TLRPC.TL_messages_getEmojiProfilePhotoGroups();
            tL_messages_getEmojiProfilePhotoGroups.hash = (int) j;
            tL_messages_getEmojiGroups = tL_messages_getEmojiProfilePhotoGroups;
        } else if (num.intValue() == 3) {
            TLRPC.TL_messages_getEmojiStickerGroups tL_messages_getEmojiStickerGroups = new TLRPC.TL_messages_getEmojiStickerGroups();
            tL_messages_getEmojiStickerGroups.hash = (int) j;
            tL_messages_getEmojiGroups = tL_messages_getEmojiStickerGroups;
        } else {
            TLRPC.TL_messages_getEmojiGroups tL_messages_getEmojiGroups2 = new TLRPC.TL_messages_getEmojiGroups();
            tL_messages_getEmojiGroups2.hash = (int) j;
            tL_messages_getEmojiGroups = tL_messages_getEmojiGroups2;
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getEmojiGroups, new lb7(z71Var, (byte) 2));
    }

    @Override
    public final void g(int i, Object obj, Object obj2) {
        cf7.Y(i).a.c(new v99(i, (TLRPC.TL_messages_emojiGroups) obj2, (Integer) obj, (byte) 16));
    }
}
