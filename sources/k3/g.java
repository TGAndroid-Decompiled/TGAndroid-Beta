package k3;

import j3.o2;
import o4.v;
public final class g {
    public final String f9693a;
    public int f9694b;
    public long f9695c;
    public final v d;
    public boolean e;
    public boolean f9696f;
    public final h f9697g;

    public g(h hVar, String str, int i10, v vVar) {
        long j10;
        this.f9697g = hVar;
        this.f9693a = str;
        this.f9694b = i10;
        if (vVar == null) {
            j10 = -1;
        } else {
            j10 = vVar.d;
        }
        this.f9695c = j10;
        if (vVar != null && vVar.a()) {
            this.d = vVar;
        }
    }

    public final boolean a(a aVar) {
        v vVar = aVar.d;
        o2 o2Var = aVar.f9676b;
        if (vVar == null) {
            if (this.f9694b != aVar.f9677c) {
                return true;
            }
            return false;
        }
        long j10 = this.f9695c;
        if (j10 != -1) {
            if (vVar.d <= j10) {
                v vVar2 = this.d;
                if (vVar2 != null) {
                    int i10 = vVar2.f16407b;
                    int b10 = o2Var.b(vVar.f16406a);
                    int b11 = o2Var.b(vVar2.f16406a);
                    if (vVar.d >= vVar2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (vVar.a()) {
                                int i11 = vVar.f16407b;
                                int i12 = vVar.f16408c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > vVar2.f16408c) {
                                        return true;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i13 = vVar.e;
                            if (i13 == -1 || i13 > i10) {
                                return true;
                            }
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b(j3.o2 r7, j3.o2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: k3.g.b(j3.o2, j3.o2):boolean");
    }
}
