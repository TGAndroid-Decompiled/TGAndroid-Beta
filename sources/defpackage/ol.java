package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ol implements Runnable {
    public final byte a;
    public final rl b;
    public final ArrayList c;
    public final HashSet d;

    public ol(rl rlVar, ArrayList arrayList, HashSet hashSet, byte b) {
        this.a = b;
        this.b = rlVar;
        this.c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        byte b = this.a;
        HashSet hashSet = this.d;
        ArrayList arrayList = this.c;
        rl rlVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new ol(rlVar, arrayList, hashSet, (byte) 1));
                return;
            default:
                rlVar.d(arrayList);
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                    ConnectionsManager.getInstance(rlVar.e).sendRequest(tL_messages_getCustomEmojiDocuments, new pl(rlVar, arrayList2, (byte) 0));
                    return;
                }
                return;
        }
    }
}
