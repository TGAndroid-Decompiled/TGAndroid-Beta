package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class pl implements Runnable {
    public final byte a;
    public final sl b;
    public final ArrayList c;
    public final HashSet d;

    public pl(sl slVar, ArrayList arrayList, HashSet hashSet, byte b) {
        this.a = b;
        this.b = slVar;
        this.c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        byte b = this.a;
        HashSet hashSet = this.d;
        ArrayList arrayList = this.c;
        sl slVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new pl(slVar, arrayList, hashSet, (byte) 1));
                return;
            default:
                slVar.d(arrayList);
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                    ConnectionsManager.getInstance(slVar.e).sendRequest(tL_messages_getCustomEmojiDocuments, new ql(slVar, arrayList2, (byte) 0));
                    return;
                }
                return;
        }
    }
}
