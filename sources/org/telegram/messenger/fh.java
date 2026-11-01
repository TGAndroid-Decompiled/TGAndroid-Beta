package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class fh implements Comparator {
    public final int f15728a;
    public final ArrayList f15729b;

    public fh(int i10, ArrayList arrayList) {
        this.f15728a = i10;
        this.f15729b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f15728a) {
            case 0:
                Long valueOf = Long.valueOf(((TLRPC.TL_messages_stickerSet) obj).set.f19821id);
                ArrayList arrayList = this.f15729b;
                int indexOf = arrayList.indexOf(valueOf);
                int indexOf2 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj2).set.f19821id));
                if (indexOf > indexOf2) {
                    return 1;
                }
                if (indexOf < indexOf2) {
                    return -1;
                }
                return 0;
            default:
                ri riVar = (ri) obj;
                ri riVar2 = (ri) obj2;
                String str = riVar.f17936a;
                ArrayList arrayList2 = this.f15729b;
                int indexOf3 = arrayList2.indexOf(str);
                int i10 = Integer.MAX_VALUE;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(riVar2.f17936a);
                if (indexOf4 >= 0) {
                    i10 = indexOf4;
                }
                if (indexOf3 >= i10) {
                    if (indexOf3 <= i10) {
                        int length = riVar.f17937b.length();
                        int length2 = riVar2.f17937b.length();
                        if (length >= length2) {
                            if (length <= length2) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
        }
    }
}
