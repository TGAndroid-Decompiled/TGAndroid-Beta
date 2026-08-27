package aa;

import androidx.recyclerview.widget.RecyclerView;
import f2.o1;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import n2.v;
import org.telegram.messenger.BuildVars;

public final class a {

    public static boolean f198i = true;

    public final int f199a;

    public int f200b;

    public Object f201c;
    public Serializable d;

    public Object f202e;

    public Object f203f;

    public Object f204g;
    public Object h;

    public a(int i10) {
        this.f199a = i10;
    }

    public b a() {
        String strL = this.f200b == 0 ? " registrationStatus" : "";
        if (((Long) this.f204g) == null) {
            strL = strL.concat(" expiresInSecs");
        }
        if (((Long) this.h) == null) {
            strL = s3.c.l(strL, " tokenCreationEpochInSecs");
        }
        if (strL.isEmpty()) {
            return new b((String) this.f201c, this.f200b, (String) this.d, (String) this.f202e, ((Long) this.f204g).longValue(), ((Long) this.h).longValue(), (String) this.f203f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.f202e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f2.a aVar = (f2.a) arrayList.get(i11);
            int i12 = aVar.f5611a;
            if (i12 != 8) {
                if (i12 == 1) {
                    int i13 = aVar.f5612b;
                    int i14 = aVar.d + i13;
                    while (i13 < i14) {
                        if (g(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(aVar.d, i11 + 1) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f202e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ae.b) this.f203f).G((f2.a) arrayList.get(i10));
        }
        m(arrayList);
        this.f200b = 0;
    }

    public void d() {
        ae.b bVar = (ae.b) this.f203f;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f2.a aVar = (f2.a) arrayList.get(i10);
            int i11 = aVar.f5611a;
            if (i11 == 1) {
                bVar.G(aVar);
                bVar.V(aVar.f5612b, aVar.d);
            } else if (i11 == 2) {
                bVar.G(aVar);
                int i12 = aVar.f5612b;
                int i13 = aVar.d;
                RecyclerView recyclerView = (RecyclerView) bVar.f245b;
                recyclerView.e0(i12, i13, true);
                recyclerView.f1858s0 = true;
                recyclerView.f1853p0.f5759c += i13;
            } else if (i11 == 4) {
                bVar.G(aVar);
                bVar.T(aVar.f5612b, aVar.d, aVar.f5613c);
            } else if (i11 == 8) {
                bVar.G(aVar);
                bVar.W(aVar.f5612b, aVar.d);
            }
        }
        m(arrayList);
        this.f200b = 0;
    }

    public void e(f2.a aVar) {
        int i10;
        v vVar = (v) this.f201c;
        int i11 = aVar.f5611a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iO = o(aVar.f5612b, i11);
        int i12 = aVar.f5612b;
        int i13 = aVar.f5611a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < aVar.d; i15++) {
            int iO2 = o((i10 * i15) + aVar.f5612b, aVar.f5611a);
            int i16 = aVar.f5611a;
            if (i16 == 2 ? iO2 != iO : !(i16 == 4 && iO2 == iO + 1)) {
                f2.a aVarJ = j(i16, iO, aVar.f5613c, i14);
                f(aVarJ, i12);
                aVarJ.f5613c = null;
                vVar.j(aVarJ);
                if (aVar.f5611a == 4) {
                    i12 += i14;
                }
                iO = iO2;
                i14 = 1;
            } else {
                i14++;
            }
        }
        Object obj = aVar.f5613c;
        aVar.f5613c = null;
        vVar.j(aVar);
        if (i14 > 0) {
            f2.a aVarJ2 = j(aVar.f5611a, iO, obj, i14);
            f(aVarJ2, i12);
            aVarJ2.f5613c = null;
            vVar.j(aVarJ2);
        }
    }

    public void f(f2.a aVar, int i10) {
        ae.b bVar = (ae.b) this.f203f;
        bVar.G(aVar);
        int i11 = aVar.f5611a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            bVar.T(i10, aVar.d, aVar.f5613c);
        } else {
            int i12 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) bVar.f245b;
            recyclerView.e0(i10, i12, true);
            recyclerView.f1858s0 = true;
            recyclerView.f1853p0.f5759c += i12;
        }
    }

    public int g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f202e;
        int size = arrayList.size();
        while (i11 < size) {
            f2.a aVar = (f2.a) arrayList.get(i11);
            int i12 = aVar.f5611a;
            if (i12 == 8) {
                int i13 = aVar.f5612b;
                if (i13 == i10) {
                    i10 = aVar.d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.f5612b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean h() {
        return ((ArrayList) this.d).size() > 0;
    }

    public void i(String str) {
        int i10;
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        while (true) {
            if (arrayList.size() <= 5) {
                break;
            } else {
                arrayList.remove(0);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new Date().toString());
        sb2.append("  ");
        sb2.append(str);
        sb2.append("\n");
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        int i11 = 0;
        for (i10 = 0; i10 < stackTrace.length && i11 < 5; i10++) {
            String string = stackTrace[i10].toString();
            if (!string.startsWith("androidx.recyclerview.widget.") || i11 != 0) {
                sb2.append("\n");
                sb2.append(string);
                sb2.append("\n");
                i11++;
            }
        }
        arrayList.add(sb2.toString());
    }

    public f2.a j(int i10, int i11, Object obj, int i12) {
        f2.a aVar = (f2.a) ((v) this.f201c).b();
        if (aVar != null) {
            aVar.f5611a = i10;
            aVar.f5612b = i11;
            aVar.d = i12;
            aVar.f5613c = obj;
            return aVar;
        }
        f2.a aVar2 = new f2.a();
        aVar2.f5611a = i10;
        aVar2.f5612b = i11;
        aVar2.d = i12;
        aVar2.f5613c = obj;
        return aVar2;
    }

    public void k(f2.a aVar) {
        ae.b bVar = (ae.b) this.f203f;
        ((ArrayList) this.f202e).add(aVar);
        int i10 = aVar.f5611a;
        if (i10 == 1) {
            bVar.V(aVar.f5612b, aVar.d);
            return;
        }
        if (i10 == 2) {
            int i11 = aVar.f5612b;
            int i12 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) bVar.f245b;
            recyclerView.e0(i11, i12, false);
            recyclerView.f1858s0 = true;
            return;
        }
        if (i10 == 4) {
            bVar.T(aVar.f5612b, aVar.d, aVar.f5613c);
        } else if (i10 == 8) {
            bVar.W(aVar.f5612b, aVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    public void l() {
        int i10;
        int i11;
        boolean z10;
        byte b10;
        f2.a aVarJ;
        int i12;
        int i13;
        int i14;
        f2.a aVarJ2;
        boolean z11;
        boolean z12;
        Object obj;
        f2.a aVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        v vVar = (v) this.f201c;
        ae.b bVar = (ae.b) this.f203f;
        ga.c cVar = (ga.c) this.f204g;
        ArrayList arrayList = (ArrayList) this.d;
        cVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                i10 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((f2.a) arrayList.get(size)).f5611a != 8) {
                    z13 = true;
                } else if (z13) {
                    break;
                }
                size--;
            }
            i11 = 2;
            if (size == -1) {
                break;
            }
            int i23 = size + 1;
            a aVar2 = (a) cVar.f6834b;
            v vVar2 = (v) aVar2.f201c;
            f2.a aVar3 = (f2.a) arrayList.get(size);
            f2.a aVar4 = (f2.a) arrayList.get(i23);
            int i24 = aVar4.f5611a;
            if (i24 == 1) {
                int i25 = aVar3.d;
                int i26 = aVar4.f5612b;
                int i27 = i25 < i26 ? -1 : 0;
                int i28 = aVar3.f5612b;
                if (i28 < i26) {
                    i27++;
                }
                if (i26 <= i28) {
                    aVar3.f5612b = i28 + aVar4.d;
                }
                int i29 = aVar4.f5612b;
                if (i29 <= i25) {
                    aVar3.d = i25 + aVar4.d;
                }
                aVar4.f5612b = i29 + i27;
                arrayList.set(size, aVar4);
                arrayList.set(i23, aVar3);
            } else if (i24 == 2) {
                int i30 = aVar3.f5612b;
                int i31 = aVar3.d;
                if (i30 < i31) {
                    if (aVar4.f5612b == i30 && aVar4.d == i31 - i30) {
                        z11 = false;
                        z12 = true;
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                } else if (aVar4.f5612b == i31 + 1 && aVar4.d == i30 - i31) {
                    z11 = true;
                    z12 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                int i32 = aVar4.f5612b;
                if (i31 < i32) {
                    aVar4.f5612b = i32 - 1;
                } else {
                    int i33 = aVar4.d;
                    if (i31 < i32 + i33) {
                        aVar4.d = i33 - 1;
                        aVar3.f5611a = 2;
                        aVar3.d = 1;
                        if (aVar4.d == 0) {
                            arrayList.remove(i23);
                            aVar4.f5613c = null;
                            vVar2.j(aVar4);
                        }
                    }
                }
                int i34 = aVar3.f5612b;
                int i35 = aVar4.f5612b;
                if (i34 <= i35) {
                    aVar4.f5612b = i35 + 1;
                } else {
                    int i36 = i35 + aVar4.d;
                    if (i34 < i36) {
                        obj = null;
                        f2.a aVarJ3 = aVar2.j(2, i34 + 1, null, i36 - i34);
                        aVar4.d = aVar3.f5612b - aVar4.f5612b;
                        aVar = aVarJ3;
                    }
                    if (z12) {
                        arrayList.set(size, aVar4);
                        arrayList.remove(i23);
                        aVar3.f5613c = obj;
                        vVar2.j(aVar3);
                    } else {
                        if (z11) {
                            if (aVar != null) {
                                i21 = aVar3.f5612b;
                                if (i21 > aVar.f5612b) {
                                    aVar3.f5612b = i21 - aVar.d;
                                }
                                i22 = aVar3.d;
                                if (i22 > aVar.f5612b) {
                                    aVar3.d = i22 - aVar.d;
                                }
                            }
                            i19 = aVar3.f5612b;
                            if (i19 > aVar4.f5612b) {
                                aVar3.f5612b = i19 - aVar4.d;
                            }
                            i20 = aVar3.d;
                            if (i20 > aVar4.f5612b) {
                                aVar3.d = i20 - aVar4.d;
                            }
                        } else {
                            if (aVar != null) {
                                i17 = aVar3.f5612b;
                                if (i17 >= aVar.f5612b) {
                                    aVar3.f5612b = i17 - aVar.d;
                                }
                                i18 = aVar3.d;
                                if (i18 >= aVar.f5612b) {
                                    aVar3.d = i18 - aVar.d;
                                }
                            }
                            i15 = aVar3.f5612b;
                            if (i15 >= aVar4.f5612b) {
                                aVar3.f5612b = i15 - aVar4.d;
                            }
                            i16 = aVar3.d;
                            if (i16 >= aVar4.f5612b) {
                                aVar3.d = i16 - aVar4.d;
                            }
                        }
                        arrayList.set(size, aVar4);
                        if (aVar3.f5612b != aVar3.d) {
                            arrayList.set(i23, aVar3);
                        } else {
                            arrayList.remove(i23);
                        }
                        if (aVar != null) {
                            arrayList.add(size, aVar);
                        }
                    }
                }
                obj = null;
                aVar = null;
                if (z12) {
                    arrayList.set(size, aVar4);
                    arrayList.remove(i23);
                    aVar3.f5613c = obj;
                    vVar2.j(aVar3);
                } else {
                    if (z11) {
                        if (aVar != null) {
                            i21 = aVar3.f5612b;
                            if (i21 > aVar.f5612b) {
                                aVar3.f5612b = i21 - aVar.d;
                            }
                            i22 = aVar3.d;
                            if (i22 > aVar.f5612b) {
                                aVar3.d = i22 - aVar.d;
                            }
                        }
                        i19 = aVar3.f5612b;
                        if (i19 > aVar4.f5612b) {
                            aVar3.f5612b = i19 - aVar4.d;
                        }
                        i20 = aVar3.d;
                        if (i20 > aVar4.f5612b) {
                            aVar3.d = i20 - aVar4.d;
                        }
                    } else {
                        if (aVar != null) {
                            i17 = aVar3.f5612b;
                            if (i17 >= aVar.f5612b) {
                                aVar3.f5612b = i17 - aVar.d;
                            }
                            i18 = aVar3.d;
                            if (i18 >= aVar.f5612b) {
                                aVar3.d = i18 - aVar.d;
                            }
                        }
                        i15 = aVar3.f5612b;
                        if (i15 >= aVar4.f5612b) {
                            aVar3.f5612b = i15 - aVar4.d;
                        }
                        i16 = aVar3.d;
                        if (i16 >= aVar4.f5612b) {
                            aVar3.d = i16 - aVar4.d;
                        }
                    }
                    arrayList.set(size, aVar4);
                    if (aVar3.f5612b != aVar3.d) {
                        arrayList.set(i23, aVar3);
                    } else {
                        arrayList.remove(i23);
                    }
                    if (aVar != null) {
                        arrayList.add(size, aVar);
                    }
                }
            } else if (i24 == 4) {
                int i37 = aVar3.d;
                int i38 = aVar4.f5612b;
                if (i37 < i38) {
                    aVar4.f5612b = i38 - 1;
                } else {
                    int i39 = aVar4.d;
                    if (i37 < i38 + i39) {
                        aVar4.d = i39 - 1;
                        aVarJ = aVar2.j(4, aVar3.f5612b, aVar4.f5613c, 1);
                    }
                    i12 = aVar3.f5612b;
                    i13 = aVar4.f5612b;
                    if (i12 <= i13) {
                        aVar4.f5612b = i13 + 1;
                    } else {
                        i14 = i13 + aVar4.d;
                        if (i12 < i14) {
                            int i40 = i14 - i12;
                            aVarJ2 = aVar2.j(4, i12 + 1, aVar4.f5613c, i40);
                            aVar4.d -= i40;
                        }
                        arrayList.set(i23, aVar3);
                        if (aVar4.d > 0) {
                            arrayList.set(size, aVar4);
                        } else {
                            arrayList.remove(size);
                            aVar4.f5613c = null;
                            vVar2.j(aVar4);
                        }
                        if (aVarJ != null) {
                            arrayList.add(size, aVarJ);
                        }
                        if (aVarJ2 != null) {
                            arrayList.add(size, aVarJ2);
                        }
                    }
                    aVarJ2 = null;
                    arrayList.set(i23, aVar3);
                    if (aVar4.d > 0) {
                        arrayList.set(size, aVar4);
                    } else {
                        arrayList.remove(size);
                        aVar4.f5613c = null;
                        vVar2.j(aVar4);
                    }
                    if (aVarJ != null) {
                        arrayList.add(size, aVarJ);
                    }
                    if (aVarJ2 != null) {
                        arrayList.add(size, aVarJ2);
                    }
                }
                aVarJ = null;
                i12 = aVar3.f5612b;
                i13 = aVar4.f5612b;
                if (i12 <= i13) {
                    aVar4.f5612b = i13 + 1;
                } else {
                    i14 = i13 + aVar4.d;
                    if (i12 < i14) {
                        int i41 = i14 - i12;
                        aVarJ2 = aVar2.j(4, i12 + 1, aVar4.f5613c, i41);
                        aVar4.d -= i41;
                    }
                    arrayList.set(i23, aVar3);
                    if (aVar4.d > 0) {
                        arrayList.set(size, aVar4);
                    } else {
                        arrayList.remove(size);
                        aVar4.f5613c = null;
                        vVar2.j(aVar4);
                    }
                    if (aVarJ != null) {
                        arrayList.add(size, aVarJ);
                    }
                    if (aVarJ2 != null) {
                        arrayList.add(size, aVarJ2);
                    }
                }
                aVarJ2 = null;
                arrayList.set(i23, aVar3);
                if (aVar4.d > 0) {
                    arrayList.set(size, aVar4);
                } else {
                    arrayList.remove(size);
                    aVar4.f5613c = null;
                    vVar2.j(aVar4);
                }
                if (aVarJ != null) {
                    arrayList.add(size, aVarJ);
                }
                if (aVarJ2 != null) {
                    arrayList.add(size, aVarJ2);
                }
            }
        }
        int size2 = arrayList.size();
        int i42 = 0;
        while (i42 < size2) {
            f2.a aVarJ4 = (f2.a) arrayList.get(i42);
            int i43 = aVarJ4.f5611a;
            if (i43 == 1) {
                k(aVarJ4);
            } else if (i43 == i11) {
                int i44 = aVarJ4.f5612b;
                int i45 = aVarJ4.d + i44;
                int i46 = i44;
                int i47 = 0;
                byte b11 = -1;
                while (i46 < i45) {
                    RecyclerView recyclerView = (RecyclerView) bVar.f245b;
                    o1 o1VarL = recyclerView.L(i46, true);
                    if (o1VarL == null) {
                        o1VarL = null;
                    } else {
                        if (((ArrayList) recyclerView.f1840e.d).contains(o1VarL.f5789a)) {
                            o1VarL = null;
                        }
                    }
                    if (o1VarL != null || b(i46)) {
                        if (b11 == 0) {
                            e(j(2, i44, null, i47));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b10 = 1;
                    } else {
                        if (b11 == 1) {
                            k(j(2, i44, null, i47));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b10 = 0;
                    }
                    if (z10) {
                        i46 -= i47;
                        i45 -= i47;
                        i47 = 1;
                    } else {
                        i47++;
                    }
                    i46++;
                    b11 = b10;
                }
                if (i47 != aVarJ4.d) {
                    aVarJ4.f5613c = null;
                    vVar.j(aVarJ4);
                    aVarJ4 = j(2, i44, null, i47);
                }
                if (b11 == 0) {
                    e(aVarJ4);
                } else {
                    k(aVarJ4);
                }
            } else if (i43 == 4) {
                int i48 = aVarJ4.f5612b;
                int i49 = aVarJ4.d + i48;
                int i50 = i48;
                int i51 = 0;
                byte b12 = -1;
                while (i48 < i49) {
                    RecyclerView recyclerView2 = (RecyclerView) bVar.f245b;
                    o1 o1VarL2 = recyclerView2.L(i48, true);
                    if (o1VarL2 == null) {
                        o1VarL2 = null;
                    } else {
                        if (((ArrayList) recyclerView2.f1840e.d).contains(o1VarL2.f5789a)) {
                            o1VarL2 = null;
                        }
                    }
                    if (o1VarL2 != null || b(i48)) {
                        if (b12 == 0) {
                            e(j(4, i50, aVarJ4.f5613c, i51));
                            i50 = i48;
                            i51 = 0;
                        }
                        b12 = 1;
                    } else {
                        if (b12 == 1) {
                            k(j(4, i50, aVarJ4.f5613c, i51));
                            i50 = i48;
                            i51 = 0;
                        }
                        b12 = 0;
                    }
                    i51++;
                    i48++;
                }
                if (i51 != aVarJ4.d) {
                    Object obj2 = aVarJ4.f5613c;
                    aVarJ4.f5613c = null;
                    vVar.j(aVarJ4);
                    aVarJ4 = j(4, i50, obj2, i51);
                }
                if (b12 == 0) {
                    e(aVarJ4);
                } else {
                    k(aVarJ4);
                }
            } else if (i43 == i10) {
                k(aVarJ4);
            }
            i42++;
            i11 = 2;
            i10 = 8;
        }
        arrayList.clear();
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f2.a aVar = (f2.a) arrayList.get(i10);
            aVar.f5613c = null;
            ((v) this.f201c).j(aVar);
        }
        arrayList.clear();
    }

    public String n() {
        String string;
        ae.c cVar = ae.c.f246e;
        if (f198i) {
            ga.c cVar2 = (ga.c) this.f203f;
            if (cVar2 == null) {
                try {
                    ga.c cVar3 = new ga.c(1, false);
                    cVar3.f6834b = new SoftReference(new String[3]);
                    this.f203f = cVar3;
                } catch (Throwable unused) {
                    f198i = false;
                }
            } else {
                String[] strArr = (String[]) ((SoftReference) cVar2.f6834b).get();
                if (strArr != null) {
                    string = strArr[0];
                }
            }
            string = null;
        } else {
            string = null;
        }
        if (string == null) {
            StringBuffer stringBuffer = new StringBuffer();
            int i10 = this.f200b;
            if (i10 == -1) {
                throw null;
            }
            String strConcat = "";
            if (cVar.f249c) {
                String string2 = Modifier.toString(i10);
                if (string2.length() != 0) {
                    strConcat = string2.concat(" ");
                }
            }
            stringBuffer.append(strConcat);
            if (cVar.f248b) {
                ((Class) this.h).getClass();
                Class cls = (Class) this.h;
                stringBuffer.append(ae.c.a(cls.getName(), cls, cVar.f247a));
            }
            if (cVar.f248b) {
                stringBuffer.append(" ");
            }
            ((Class) this.f202e).getClass();
            Class cls2 = (Class) this.f202e;
            if (((String) this.d) == null) {
                cls2.getClass();
                this.d = ((Class) this.f202e).getName();
            }
            stringBuffer.append(ae.c.a((String) this.d, cls2, cVar.d));
            stringBuffer.append(".");
            ((String) this.f201c).getClass();
            stringBuffer.append((String) this.f201c);
            Class[] clsArr = (Class[]) this.f204g;
            if (cVar.f248b) {
                stringBuffer.append("(");
                for (int i11 = 0; i11 < clsArr.length; i11++) {
                    if (i11 > 0) {
                        stringBuffer.append(", ");
                    }
                    Class cls3 = clsArr[i11];
                    stringBuffer.append(ae.c.a(cls3.getName(), cls3, cVar.f247a));
                }
                stringBuffer.append(")");
            } else if (clsArr.length == 0) {
                stringBuffer.append("()");
            } else {
                stringBuffer.append("(..)");
            }
            string = stringBuffer.toString();
        }
        if (f198i) {
            ga.c cVar4 = (ga.c) this.f203f;
            String[] strArr2 = (String[]) ((SoftReference) cVar4.f6834b).get();
            if (strArr2 == null) {
                strArr2 = new String[3];
                cVar4.f6834b = new SoftReference(strArr2);
            }
            strArr2[0] = string;
        }
        return string;
    }

    public int o(int i10, int i11) {
        int i12;
        int i13;
        v vVar = (v) this.f201c;
        ArrayList arrayList = (ArrayList) this.f202e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f2.a aVar = (f2.a) arrayList.get(size);
            int i14 = aVar.f5611a;
            if (i14 == 8) {
                int i15 = aVar.f5612b;
                int i16 = aVar.d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            aVar.f5612b = i15 + 1;
                            aVar.d = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.f5612b = i15 - 1;
                            aVar.d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        aVar.d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        aVar.f5612b = i15 + 1;
                    } else if (i11 == 2) {
                        aVar.f5612b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = aVar.f5612b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.d;
                    } else if (i14 == 2) {
                        i10 += aVar.d;
                    }
                } else if (i11 == 1) {
                    aVar.f5612b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f5612b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            f2.a aVar2 = (f2.a) arrayList.get(size2);
            if (aVar2.f5611a == 8) {
                int i18 = aVar2.d;
                if (i18 == aVar2.f5612b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.f5613c = null;
                    vVar.j(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f5613c = null;
                vVar.j(aVar2);
            }
        }
        return i10;
    }

    public String toString() {
        switch (this.f199a) {
            case 1:
                ae.c cVar = ae.c.f246e;
                return n();
            default:
                return super.toString();
        }
    }

    public a(ae.b bVar) {
        this.f199a = 3;
        this.f201c = new v(30);
        this.d = new ArrayList();
        this.f202e = new ArrayList();
        this.f200b = 0;
        this.h = BuildVars.DEBUG_VERSION ? new ArrayList() : null;
        this.f203f = bVar;
        this.f204g = new ga.c(this, 11);
    }
}
