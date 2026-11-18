package jg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b1 implements Comparator {
    public final a0.h f17406a;
    public final ArrayList f17407b;

    public b1(a0.h hVar, ArrayList arrayList) {
        this.f17406a = hVar;
        this.f17407b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        long j3;
        long j10;
        TLObject tLObject = (TLObject) obj;
        TLObject tLObject2 = (TLObject) obj2;
        if (tLObject instanceof TLRPC.User) {
            j3 = ((TLRPC.User) tLObject).f28554id;
        } else {
            j3 = -((TLRPC.Chat) tLObject).f28405id;
        }
        if (tLObject2 instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject2).f28554id;
        } else {
            j10 = -((TLRPC.Chat) tLObject2).f28405id;
        }
        a0.h hVar = this.f17406a;
        if (hVar.h(j3) < 0 || hVar.h(j10) < 0) {
            if (hVar.h(j3) < 0) {
                if (hVar.h(j10) < 0) {
                    Long valueOf = Long.valueOf(j3);
                    ArrayList arrayList = this.f17407b;
                    int indexOf = arrayList.indexOf(valueOf);
                    int indexOf2 = arrayList.indexOf(Long.valueOf(j10));
                    if (indexOf != -1 && indexOf2 != -1) {
                        if (indexOf >= indexOf2) {
                            if (indexOf != indexOf2) {
                                return 1;
                            }
                            return 0;
                        }
                    } else if (indexOf == -1 || indexOf2 != -1) {
                        if (indexOf == -1 && indexOf2 != -1) {
                            return 1;
                        }
                        return 0;
                    }
                } else {
                    return 1;
                }
            }
            return -1;
        }
        return 0;
    }
}
