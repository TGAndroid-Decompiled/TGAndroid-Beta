package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class xz9 implements pcc {
    public final byte a;
    public final LinkedHashSet b;
    public final Runnable c;

    public xz9(LinkedHashSet linkedHashSet, Runnable runnable, byte b) {
        this.a = b;
        this.b = linkedHashSet;
        this.c = runnable;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        Runnable runnable = this.c;
        LinkedHashSet linkedHashSet = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    linkedHashSet.addAll(arrayList);
                }
                runnable.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                runnable.run();
                return;
        }
    }
}
