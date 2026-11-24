package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class az6 implements RequestDelegate {
    public final byte a = 0;
    public final boolean b;
    public final gk7 c;
    public final Serializable d;
    public final Object e;
    public final Serializable f;
    public final Object g;
    public final Object h;

    public az6(kz6 kz6Var, String str, boolean z, TLRPC.User user, String str2, ad7 ad7Var, String str3) {
        this.c = kz6Var;
        this.d = str;
        this.b = z;
        this.g = user;
        this.e = str2;
        this.h = ad7Var;
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
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                gl.c3(new oo6((kz6) gk7Var, (String) serializable2, this.b, tLObject, (TLRPC.User) obj3, (String) obj4, (ad7) obj2, (String) serializable, (byte) 4));
                return;
            default:
                z3a z3aVar = (z3a) gk7Var;
                ArrayList arrayList = (ArrayList) serializable2;
                TLObject tLObject2 = (TLObject) obj4;
                ArrayList arrayList2 = (ArrayList) serializable;
                ArrayList arrayList3 = (ArrayList) obj3;
                k3a k3aVar = (k3a) obj2;
                boolean z2 = this.b;
                if (tL_error != null && ab4.r(tL_error.text)) {
                    int c = ab4.c(tL_error.text);
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
                        z3aVar.getFileRefController().u(new Object[]{tLObject2, arrayList2, arrayList3, arrayList4, k3aVar, Boolean.valueOf(z2)}, arrayList4);
                        return;
                    } else if (k3aVar != null) {
                        if (c >= 0 && (zArr = k3aVar.s) != null && c < zArr.length) {
                            z = zArr[c];
                        } else {
                            z = k3aVar.r;
                        }
                        if (!z) {
                            if (c < 0) {
                                k3aVar.r = true;
                            } else {
                                boolean[] zArr2 = k3aVar.s;
                                if (zArr2 == null) {
                                    zArr2 = new boolean[k3aVar.x.size()];
                                    k3aVar.s = zArr2;
                                }
                                zArr2[c] = true;
                            }
                            gl.c3(new m05(z3aVar, tLObject2, c, k3aVar, arrayList2, z2, (byte) 3));
                            return;
                        }
                    }
                }
                gl.c3(new o2a(z3aVar, tL_error, tLObject, z2, arrayList2, arrayList3, tLObject2));
                return;
        }
    }

    public az6(z3a z3aVar, ArrayList arrayList, TLObject tLObject, ArrayList arrayList2, ArrayList arrayList3, k3a k3aVar, boolean z) {
        this.c = z3aVar;
        this.d = arrayList;
        this.e = tLObject;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = k3aVar;
        this.b = z;
    }
}
