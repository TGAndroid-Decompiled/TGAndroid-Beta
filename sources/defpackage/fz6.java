package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fz6 implements Comparator {
    public final vf6 a;
    public final ArrayList b;

    public fz6(vf6 vf6Var, ArrayList arrayList) {
        this.a = vf6Var;
        this.b = arrayList;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        long j;
        long j2;
        TLObject tLObject = (TLObject) obj;
        TLObject tLObject2 = (TLObject) obj2;
        if (tLObject instanceof TLRPC.User) {
            j = ((TLRPC.User) tLObject).id;
        } else {
            j = -((TLRPC.Chat) tLObject).id;
        }
        if (tLObject2 instanceof TLRPC.User) {
            j2 = ((TLRPC.User) tLObject2).id;
        } else {
            j2 = -((TLRPC.Chat) tLObject2).id;
        }
        vf6 vf6Var = this.a;
        if (vf6Var.h(j) < 0 || vf6Var.h(j2) < 0) {
            if (vf6Var.h(j) < 0) {
                if (vf6Var.h(j2) < 0) {
                    Long valueOf = Long.valueOf(j);
                    ArrayList arrayList = this.b;
                    int indexOf = arrayList.indexOf(valueOf);
                    int indexOf2 = arrayList.indexOf(Long.valueOf(j2));
                    if (indexOf != -1) {
                        if (indexOf2 != -1) {
                            if (indexOf >= indexOf2) {
                                if (indexOf != indexOf2) {
                                    return 1;
                                }
                                return 0;
                            }
                        } else if (indexOf2 != -1) {
                            return 0;
                        }
                    } else if (indexOf2 != -1) {
                        return 1;
                    } else {
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
