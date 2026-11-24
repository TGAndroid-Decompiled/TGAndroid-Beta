package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class om implements Runnable {
    public final byte a;
    public final rm b;
    public final ArrayList c;
    public final HashSet d;

    public om(rm rmVar, ArrayList arrayList, HashSet hashSet, byte b) {
        this.a = b;
        this.b = rmVar;
        this.c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        byte b = this.a;
        HashSet hashSet = this.d;
        ArrayList arrayList = this.c;
        rm rmVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new om(rmVar, arrayList, hashSet, (byte) 1));
                return;
            default:
                rmVar.d(arrayList);
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                    ConnectionsManager.getInstance(rmVar.e).sendRequest(tL_messages_getCustomEmojiDocuments, new pm(rmVar, arrayList2, (byte) 0));
                    return;
                }
                return;
        }
    }
}
