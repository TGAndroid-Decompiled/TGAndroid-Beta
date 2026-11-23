package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class fh implements Comparator {
    public final int f24014a;
    public final ArrayList f24015b;

    public fh(int i7, ArrayList arrayList) {
        this.f24014a = i7;
        this.f24015b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f24014a) {
            case 0:
                Long valueOf = Long.valueOf(((TLRPC.TL_messages_stickerSet) obj).set.f28519id);
                ArrayList arrayList = this.f24015b;
                int indexOf = arrayList.indexOf(valueOf);
                int indexOf2 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj2).set.f28519id));
                if (indexOf > indexOf2) {
                    return 1;
                }
                if (indexOf < indexOf2) {
                    return -1;
                }
                return 0;
            default:
                ni niVar = (ni) obj;
                ni niVar2 = (ni) obj2;
                String str = niVar.f26023a;
                ArrayList arrayList2 = this.f24015b;
                int indexOf3 = arrayList2.indexOf(str);
                int i7 = Integer.MAX_VALUE;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(niVar2.f26023a);
                if (indexOf4 >= 0) {
                    i7 = indexOf4;
                }
                if (indexOf3 >= i7) {
                    if (indexOf3 <= i7) {
                        int length = niVar.f26024b.length();
                        int length2 = niVar2.f26024b.length();
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
