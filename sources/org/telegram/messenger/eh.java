package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class eh implements Comparator {
    public final int f23302a;
    public final ArrayList f23303b;

    public eh(int i7, ArrayList arrayList) {
        this.f23302a = i7;
        this.f23303b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f23302a) {
            case 0:
                Long valueOf = Long.valueOf(((TLRPC.TL_messages_stickerSet) obj).set.f28078id);
                ArrayList arrayList = this.f23303b;
                int indexOf = arrayList.indexOf(valueOf);
                int indexOf2 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj2).set.f28078id));
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
                String str = oiVar.f25765a;
                ArrayList arrayList2 = this.f23303b;
                int indexOf3 = arrayList2.indexOf(str);
                int i7 = Integer.MAX_VALUE;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(oiVar2.f25765a);
                if (indexOf4 >= 0) {
                    i7 = indexOf4;
                }
                if (indexOf3 >= i7) {
                    if (indexOf3 <= i7) {
                        int length = oiVar.f25766b.length();
                        int length2 = oiVar2.f25766b.length();
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
