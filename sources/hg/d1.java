package hg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d1 implements Comparator {
    public final a0.i f11044a;
    public final ArrayList f11045b;

    public d1(a0.i iVar, ArrayList arrayList) {
        this.f11044a = iVar;
        this.f11045b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        long j3;
        long j10;
        TLObject tLObject = (TLObject) obj;
        TLObject tLObject2 = (TLObject) obj2;
        if (tLObject instanceof TLRPC.User) {
            j3 = ((TLRPC.User) tLObject).f20043id;
        } else {
            j3 = -((TLRPC.Chat) tLObject).f19896id;
        }
        if (tLObject2 instanceof TLRPC.User) {
            j10 = ((TLRPC.User) tLObject2).f20043id;
        } else {
            j10 = -((TLRPC.Chat) tLObject2).f19896id;
        }
        a0.i iVar = this.f11044a;
        if (iVar.h(j3) < 0 || iVar.h(j10) < 0) {
            if (iVar.h(j3) < 0) {
                if (iVar.h(j10) < 0) {
                    Long valueOf = Long.valueOf(j3);
                    ArrayList arrayList = this.f11045b;
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
