package jd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import v7.i8;
public final class u extends md.h implements td.p {
    public Object f14444b;
    public Iterator f14445c;
    public int d;
    public int e;
    public Object f14446f;
    public final Iterator h;

    public u(Iterator it, kd.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f14446f = obj;
        return uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((yd.c) obj, (kd.c) obj2)).invokeSuspend(id.i.f12807a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        yd.c cVar;
        ArrayList arrayList;
        Iterator it;
        int i10;
        t tVar;
        yd.c cVar2;
        Object[] array;
        ld.a aVar = ld.a.f16062a;
        int i11 = this.e;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            tVar = (t) this.f14444b;
                            cVar2 = (yd.c) this.f14446f;
                            i8.b(obj);
                            tVar.m();
                        }
                    } else {
                        Iterator it2 = this.f14445c;
                        t tVar2 = (t) this.f14444b;
                        yd.c cVar3 = (yd.c) this.f14446f;
                        i8.b(obj);
                        tVar2.m();
                        while (true) {
                            int i12 = tVar2.f14442b;
                            Object[] objArr = tVar2.f14441a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (tVar2.h() != i12) {
                                    int i13 = tVar2.f14443c;
                                    int i14 = tVar2.d;
                                    objArr[(i13 + i14) % i12] = next;
                                    tVar2.d = i14 + 1;
                                    if (tVar2.h() == i12) {
                                        if (tVar2.d < 20) {
                                            int i15 = i12 + (i12 >> 1) + 1;
                                            if (i15 > 20) {
                                                i15 = 20;
                                            }
                                            if (tVar2.f14443c == 0) {
                                                array = Arrays.copyOf(objArr, i15);
                                                kotlin.jvm.internal.i.d(array, "copyOf(...)");
                                            } else {
                                                array = tVar2.toArray(new Object[i15]);
                                            }
                                            tVar2 = new t(tVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(tVar2);
                                            this.f14446f = cVar3;
                                            this.f14444b = tVar2;
                                            this.f14445c = it2;
                                            this.e = 3;
                                            cVar3.b(arrayList2, this);
                                            ld.a aVar2 = ld.a.f16062a;
                                            return aVar;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("ring buffer is full");
                                }
                            } else {
                                tVar = tVar2;
                                cVar2 = cVar3;
                                break;
                            }
                        }
                    }
                    if (tVar.d > 20) {
                        ArrayList arrayList3 = new ArrayList(tVar);
                        this.f14446f = cVar2;
                        this.f14444b = tVar;
                        this.f14445c = null;
                        this.e = 4;
                        cVar2.b(arrayList3, this);
                        ld.a aVar3 = ld.a.f16062a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f14446f = null;
                        this.f14444b = null;
                        this.f14445c = null;
                        this.e = 5;
                        cVar2.b(tVar, this);
                        ld.a aVar4 = ld.a.f16062a;
                        return aVar;
                    }
                    return id.i.f12807a;
                }
                i8.b(obj);
                return id.i.f12807a;
            }
            i10 = this.d;
            it = this.f14445c;
            ArrayList arrayList4 = (ArrayList) this.f14444b;
            cVar = (yd.c) this.f14446f;
            i8.b(obj);
            arrayList = new ArrayList(20);
        } else {
            i8.b(obj);
            cVar = (yd.c) this.f14446f;
            arrayList = new ArrayList(20);
            it = this.h;
            i10 = 0;
        }
        yd.c cVar4 = cVar;
        Iterator it3 = it;
        int i16 = i10;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i10 > 0) {
                i10--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f14446f = cVar4;
                    this.f14444b = arrayList;
                    this.f14445c = it3;
                    this.d = i16;
                    this.e = 1;
                    cVar4.b(arrayList, this);
                    ld.a aVar5 = ld.a.f16062a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f14446f = null;
            this.f14444b = null;
            this.f14445c = null;
            this.e = 2;
            cVar4.b(arrayList, this);
            ld.a aVar6 = ld.a.f16062a;
            return aVar;
        }
        return id.i.f12807a;
    }
}
