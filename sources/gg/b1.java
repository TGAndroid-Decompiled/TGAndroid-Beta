package gg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Comparator {
    public final ArrayList f10530a;
    public final ArrayList f10531b;

    public b1(ArrayList arrayList, ArrayList arrayList2) {
        this.f10530a = arrayList;
        this.f10531b = arrayList2;
    }

    public final int a(i1 i1Var) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f10530a;
            if (i11 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.f10531b;
                    if (i10 < Math.min(20, arrayList2.size())) {
                        if (((TLRPC.Document) arrayList2.get(i10)).f20048id == i1Var.f10656a.f20048id) {
                            return (arrayList2.size() - i10) + 1000000;
                        }
                        i10++;
                    } else {
                        return -1;
                    }
                }
            } else if (((TLRPC.Document) arrayList.get(i11)).f20048id == i1Var.f10656a.f20048id) {
                return i11 + 2000000;
            } else {
                i11++;
            }
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        i1 i1Var = (i1) obj;
        i1 i1Var2 = (i1) obj2;
        boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(i1Var.f10656a, true);
        if (isAnimatedStickerDocument == MessageObject.isAnimatedStickerDocument(i1Var2.f10656a, true)) {
            int a2 = a(i1Var);
            int a10 = a(i1Var2);
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
