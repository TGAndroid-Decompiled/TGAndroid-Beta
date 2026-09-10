package fg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class c1 implements Comparator {
    public final ArrayList f7971a;
    public final ArrayList f7972b;

    public c1(ArrayList arrayList, ArrayList arrayList2) {
        this.f7971a = arrayList;
        this.f7972b = arrayList2;
    }

    public final int a(k1 k1Var) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f7971a;
            if (i11 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.f7972b;
                    if (i10 < Math.min(20, arrayList2.size())) {
                        if (((TLRPC.Document) arrayList2.get(i10)).f17201id == k1Var.f8098a.f17201id) {
                            return (arrayList2.size() - i10) + 1000000;
                        }
                        i10++;
                    } else {
                        return -1;
                    }
                }
            } else if (((TLRPC.Document) arrayList.get(i11)).f17201id == k1Var.f8098a.f17201id) {
                return i11 + 2000000;
            } else {
                i11++;
            }
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        k1 k1Var = (k1) obj;
        k1 k1Var2 = (k1) obj2;
        boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(k1Var.f8098a, true);
        if (isAnimatedStickerDocument == MessageObject.isAnimatedStickerDocument(k1Var2.f8098a, true)) {
            int a2 = a(k1Var);
            int a10 = a(k1Var2);
            if (a2 <= a10) {
                if (a2 >= a10) {
                    return 0;
                }
            } else {
                return -1;
            }
        } else if (isAnimatedStickerDocument) {
            return -1;
        }
        return 1;
    }
}
