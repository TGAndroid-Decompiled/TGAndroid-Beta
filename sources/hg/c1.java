package hg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class c1 implements Comparator {
    public final ArrayList f11007a;
    public final ArrayList f11008b;

    public c1(ArrayList arrayList, ArrayList arrayList2) {
        this.f11007a = arrayList;
        this.f11008b = arrayList2;
    }

    public final int a(j1 j1Var) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f11007a;
            if (i11 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.f11008b;
                    if (i10 < Math.min(20, arrayList2.size())) {
                        if (((TLRPC.Document) arrayList2.get(i10)).f19875id == j1Var.f11112a.f19875id) {
                            return (arrayList2.size() - i10) + 1000000;
                        }
                        i10++;
                    } else {
                        return -1;
                    }
                }
            } else if (((TLRPC.Document) arrayList.get(i11)).f19875id == j1Var.f11112a.f19875id) {
                return i11 + 2000000;
            } else {
                i11++;
            }
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        j1 j1Var = (j1) obj;
        j1 j1Var2 = (j1) obj2;
        boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(j1Var.f11112a, true);
        if (isAnimatedStickerDocument == MessageObject.isAnimatedStickerDocument(j1Var2.f11112a, true)) {
            int a2 = a(j1Var);
            int a10 = a(j1Var2);
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
