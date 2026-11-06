package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class gh implements Comparator {
    public final int f22645a;
    public final ArrayList f22646b;

    public gh(int i7, ArrayList arrayList) {
        this.f22645a = i7;
        this.f22646b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f22645a) {
            case 0:
                Long valueOf = Long.valueOf(((TLRPC.TL_messages_stickerSet) obj).set.f26980id);
                ArrayList arrayList = this.f22646b;
                int indexOf = arrayList.indexOf(valueOf);
                int indexOf2 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj2).set.f26980id));
                if (indexOf > indexOf2) {
                    return 1;
                }
                if (indexOf < indexOf2) {
                    return -1;
                }
                return 0;
            default:
                qi qiVar = (qi) obj;
                qi qiVar2 = (qi) obj2;
                String str = qiVar.f24698a;
                ArrayList arrayList2 = this.f22646b;
                int indexOf3 = arrayList2.indexOf(str);
                int i7 = Integer.MAX_VALUE;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(qiVar2.f24698a);
                if (indexOf4 >= 0) {
                    i7 = indexOf4;
                }
                if (indexOf3 >= i7) {
                    if (indexOf3 <= i7) {
                        int length = qiVar.f24699b.length();
                        int length2 = qiVar2.f24699b.length();
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
