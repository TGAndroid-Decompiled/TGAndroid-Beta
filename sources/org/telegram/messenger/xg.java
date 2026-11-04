package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class xg implements Comparator {
    public final int f26372a;
    public final ArrayList f26373b;

    public xg(int i3, ArrayList arrayList) {
        this.f26372a = i3;
        this.f26373b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f26372a) {
            case 0:
                Long valueOf = Long.valueOf(((TLRPC.TL_messages_stickerSet) obj).set.f27028id);
                ArrayList arrayList = this.f26373b;
                int indexOf = arrayList.indexOf(valueOf);
                int indexOf2 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj2).set.f27028id));
                if (indexOf > indexOf2) {
                    return 1;
                }
                if (indexOf < indexOf2) {
                    return -1;
                }
                return 0;
            default:
                hi hiVar = (hi) obj;
                hi hiVar2 = (hi) obj2;
                String str = hiVar.f22931a;
                ArrayList arrayList2 = this.f26373b;
                int indexOf3 = arrayList2.indexOf(str);
                int i3 = Integer.MAX_VALUE;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(hiVar2.f22931a);
                if (indexOf4 >= 0) {
                    i3 = indexOf4;
                }
                if (indexOf3 >= i3) {
                    if (indexOf3 <= i3) {
                        int length = hiVar.f22932b.length();
                        int length2 = hiVar2.f22932b.length();
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
