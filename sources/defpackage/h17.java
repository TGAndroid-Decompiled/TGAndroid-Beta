package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h17 implements RequestDelegate {
    public final byte a = 0;
    public final boolean b;
    public final fn7 c;
    public final Serializable d;
    public final Object e;
    public final Serializable f;
    public final Object g;
    public final Object h;

    public h17(r17 r17Var, String str, boolean z, TLRPC.User user, String str2, jf7 jf7Var, String str3) {
        this.c = r17Var;
        this.d = str;
        this.b = z;
        this.g = user;
        this.e = str2;
        this.h = jf7Var;
        this.f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z;
        boolean[] zArr;
        Object obj;
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Serializable serializable = this.f;
        Object obj4 = this.e;
        Serializable serializable2 = this.d;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                hl.c3(new oq6((r17) fn7Var, (String) serializable2, this.b, tLObject, (TLRPC.User) obj3, (String) obj4, (jf7) obj2, (String) serializable, (byte) 4));
                return;
            default:
                r7a r7aVar = (r7a) fn7Var;
                ArrayList arrayList = (ArrayList) serializable2;
                TLObject tLObject2 = (TLObject) obj4;
                ArrayList arrayList2 = (ArrayList) serializable;
                ArrayList arrayList3 = (ArrayList) obj3;
                d7a d7aVar = (d7a) obj2;
                boolean z2 = this.b;
                if (tL_error != null && xc4.r(tL_error.text)) {
                    int c = xc4.c(tL_error.text);
                    if (arrayList != null) {
                        ArrayList arrayList4 = new ArrayList(arrayList);
                        if (c >= 0) {
                            for (int i = 0; i < arrayList4.size(); i++) {
                                if (c == i) {
                                    obj = arrayList4.get(i);
                                } else {
                                    obj = null;
                                }
                                arrayList4.set(i, obj);
                            }
                        }
                        r7aVar.getFileRefController().u(new Object[]{tLObject2, arrayList2, arrayList3, arrayList4, d7aVar, Boolean.valueOf(z2)}, arrayList4);
                        return;
                    } else if (d7aVar != null) {
                        if (c >= 0 && (zArr = d7aVar.s) != null && c < zArr.length) {
                            z = zArr[c];
                        } else {
                            z = d7aVar.r;
                        }
                        if (!z) {
                            if (c < 0) {
                                d7aVar.r = true;
                            } else {
                                boolean[] zArr2 = d7aVar.s;
                                if (zArr2 == null) {
                                    zArr2 = new boolean[d7aVar.x.size()];
                                    d7aVar.s = zArr2;
                                }
                                zArr2[c] = true;
                            }
                            hl.c3(new q25(r7aVar, tLObject2, c, d7aVar, arrayList2, z2, (byte) 4));
                            return;
                        }
                    }
                }
                hl.c3(new d6a(r7aVar, tL_error, tLObject, z2, arrayList2, arrayList3, tLObject2));
                return;
        }
    }

    public h17(r7a r7aVar, ArrayList arrayList, TLObject tLObject, ArrayList arrayList2, ArrayList arrayList3, d7a d7aVar, boolean z) {
        this.c = r7aVar;
        this.d = arrayList;
        this.e = tLObject;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = d7aVar;
        this.b = z;
    }
}
