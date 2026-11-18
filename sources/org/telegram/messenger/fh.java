package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class fh implements Comparator {
    public final int f23906a;
    public final ArrayList f23907b;

    public fh(int i7, ArrayList arrayList) {
        this.f23906a = i7;
        this.f23907b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f23906a) {
            case 0:
                Long valueOf = Long.valueOf(((TLRPC.TL_messages_stickerSet) obj).set.f28430id);
                ArrayList arrayList = this.f23907b;
                int indexOf = arrayList.indexOf(valueOf);
                int indexOf2 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj2).set.f28430id));
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
                String str = niVar.f25927a;
                ArrayList arrayList2 = this.f23907b;
                int indexOf3 = arrayList2.indexOf(str);
                int i7 = Integer.MAX_VALUE;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(niVar2.f25927a);
                if (indexOf4 >= 0) {
                    i7 = indexOf4;
                }
                if (indexOf3 >= i7) {
                    if (indexOf3 <= i7) {
                        int length = niVar.f25928b.length();
                        int length2 = niVar2.f25928b.length();
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
