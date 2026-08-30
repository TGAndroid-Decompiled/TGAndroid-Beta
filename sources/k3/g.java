package k3;

import j3.o2;
import o4.v;
public final class g {
    public final String f9712a;
    public int f9713b;
    public long f9714c;
    public final v d;
    public boolean e;
    public boolean f9715f;
    public final h f9716g;

    public g(h hVar, String str, int i10, v vVar) {
        long j10;
        this.f9716g = hVar;
        this.f9712a = str;
        this.f9713b = i10;
        if (vVar == null) {
            j10 = -1;
        } else {
            j10 = vVar.d;
        }
        this.f9714c = j10;
        if (vVar != null && vVar.a()) {
            this.d = vVar;
        }
    }

    public final boolean a(a aVar) {
        v vVar = aVar.d;
        o2 o2Var = aVar.f9695b;
        if (vVar == null) {
            if (this.f9713b != aVar.f9696c) {
                return true;
            }
            return false;
        }
        long j10 = this.f9714c;
        if (j10 != -1) {
            if (vVar.d <= j10) {
                v vVar2 = this.d;
                if (vVar2 != null) {
                    int i10 = vVar2.f16425b;
                    int b10 = o2Var.b(vVar.f16424a);
                    int b11 = o2Var.b(vVar2.f16424a);
                    if (vVar.d >= vVar2.d && b10 >= b11) {
                        if (b10 <= b11) {
                            if (vVar.a()) {
                                int i11 = vVar.f16425b;
                                int i12 = vVar.f16426c;
                                if (i11 <= i10) {
                                    if (i11 == i10 && i12 > vVar2.f16426c) {
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
