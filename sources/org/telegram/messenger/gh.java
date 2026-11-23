package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class gh implements Comparator {
    public final int f24154a;
    public final ArrayList f24155b;

    public gh(int i7, ArrayList arrayList) {
        this.f24154a = i7;
        this.f24155b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f24154a) {
            case 0:
                Long valueOf = Long.valueOf(((TLRPC.TL_messages_stickerSet) obj).set.f28461id);
                ArrayList arrayList = this.f24155b;
                int indexOf = arrayList.indexOf(valueOf);
                int indexOf2 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj2).set.f28461id));
                if (indexOf > indexOf2) {
                    return 1;
                }
                if (indexOf < indexOf2) {
                    return -1;
                }
                return 0;
            default:
                oi oiVar = (oi) obj;
                oi oiVar2 = (oi) obj2;
                String str = oiVar.f26126a;
                ArrayList arrayList2 = this.f24155b;
                int indexOf3 = arrayList2.indexOf(str);
                int i7 = Integer.MAX_VALUE;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(oiVar2.f26126a);
                if (indexOf4 >= 0) {
                    i7 = indexOf4;
                }
                if (indexOf3 >= i7) {
                    if (indexOf3 <= i7) {
                        int length = oiVar.f26127b.length();
                        int length2 = oiVar2.f26127b.length();
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
