package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class qm implements Runnable {
    public final byte a;
    public final rm b;
    public final ArrayList c;
    public final TLObject d;

    public qm(rm rmVar, ArrayList arrayList, TLObject tLObject, byte b) {
        this.a = b;
        this.b = rmVar;
        this.c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.d;
        ArrayList arrayList = this.c;
        rm rmVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new qm(rmVar, arrayList, tLObject, (byte) 1));
                return;
            default:
                int i = rmVar.e;
                HashSet hashSet = new HashSet(arrayList);
                if (tLObject instanceof Vector) {
                    ArrayList arrayList2 = ((Vector) tLObject).objects;
                    cf7.Y(i).a.c(new nm(rmVar, arrayList2, (byte) 1));
                    rmVar.d(arrayList2);
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        if (arrayList2.get(i2) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList2.get(i2)).id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList3 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList3;
                        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getCustomEmojiDocuments, new pm(rmVar, arrayList3, (byte) 0));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
