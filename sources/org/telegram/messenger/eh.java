package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class eh implements Comparator {
    public final int f15387a;
    public final ArrayList f15388b;

    public eh(int i10, ArrayList arrayList) {
        this.f15387a = i10;
        this.f15388b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f15387a) {
            case 0:
                Long valueOf = Long.valueOf(((TLRPC.TL_messages_stickerSet) obj).set.f19820id);
                ArrayList arrayList = this.f15388b;
                int indexOf = arrayList.indexOf(valueOf);
                int indexOf2 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj2).set.f19820id));
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
                String str = qiVar.f17590a;
                ArrayList arrayList2 = this.f15388b;
                int indexOf3 = arrayList2.indexOf(str);
                int i10 = Integer.MAX_VALUE;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(qiVar2.f17590a);
                if (indexOf4 >= 0) {
                    i10 = indexOf4;
                }
                if (indexOf3 >= i10) {
                    if (indexOf3 <= i10) {
                        int length = qiVar.f17591b.length();
                        int length2 = qiVar2.f17591b.length();
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
