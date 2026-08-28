package of;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class y0 implements Comparator {
    public final ArrayList f19548a;
    public final ArrayList f19549b;

    public y0(ArrayList arrayList, ArrayList arrayList2) {
        this.f19548a = arrayList;
        this.f19549b = arrayList2;
    }

    public final int a(e1 e1Var) {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19548a;
            if (i10 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.f19549b;
                    if (i9 < Math.min(20, arrayList2.size())) {
                        if (((TLRPC.Document) arrayList2.get(i9)).f22386id == e1Var.f19282a.f22386id) {
                            return (arrayList2.size() - i9) + 1000000;
                        }
                        i9++;
                    } else {
                        return -1;
                    }
                }
            } else if (((TLRPC.Document) arrayList.get(i10)).f22386id == e1Var.f19282a.f22386id) {
                return i10 + 2000000;
            } else {
                i10++;
            }
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        e1 e1Var = (e1) obj;
        e1 e1Var2 = (e1) obj2;
        boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(e1Var.f19282a, true);
        if (isAnimatedStickerDocument == MessageObject.isAnimatedStickerDocument(e1Var2.f19282a, true)) {
            int a2 = a(e1Var);
            int a3 = a(e1Var2);
            if (a2 <= a3) {
                if (a2 >= a3) {
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
