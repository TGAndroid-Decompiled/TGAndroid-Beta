package jd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import v7.i8;
public final class u extends md.h implements td.p {
    public Object f12983b;
    public Iterator f12984c;
    public int d;
    public int e;
    public Object f12985f;
    public final Iterator h;

    public u(Iterator it, kd.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f12985f = obj;
        return uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((yd.c) obj, (kd.c) obj2)).invokeSuspend(id.i.f11386a);
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
        ld.a aVar = ld.a.f14658a;
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
                            tVar = (t) this.f12983b;
                            cVar2 = (yd.c) this.f12985f;
                            i8.b(obj);
                            tVar.m();
                        }
                    } else {
                        Iterator it2 = this.f12984c;
                        t tVar2 = (t) this.f12983b;
                        yd.c cVar3 = (yd.c) this.f12985f;
                        i8.b(obj);
                        tVar2.m();
                        while (true) {
                            int i12 = tVar2.f12981b;
                            Object[] objArr = tVar2.f12980a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (tVar2.h() != i12) {
                                    int i13 = tVar2.f12982c;
                                    int i14 = tVar2.d;
                                    objArr[(i13 + i14) % i12] = next;
                                    tVar2.d = i14 + 1;
                                    if (tVar2.h() == i12) {
                                        if (tVar2.d < 20) {
                                            int i15 = i12 + (i12 >> 1) + 1;
                                            if (i15 > 20) {
                                                i15 = 20;
                                            }
                                            if (tVar2.f12982c == 0) {
                                                array = Arrays.copyOf(objArr, i15);
                                                kotlin.jvm.internal.i.d(array, "copyOf(...)");
                                            } else {
                                                array = tVar2.toArray(new Object[i15]);
                                            }
                                            tVar2 = new t(tVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(tVar2);
                                            this.f12985f = cVar3;
                                            this.f12983b = tVar2;
                                            this.f12984c = it2;
                                            this.e = 3;
                                            cVar3.b(arrayList2, this);
                                            ld.a aVar2 = ld.a.f14658a;
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
                        this.f12985f = cVar2;
                        this.f12983b = tVar;
                        this.f12984c = null;
                        this.e = 4;
                        cVar2.b(arrayList3, this);
                        ld.a aVar3 = ld.a.f14658a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f12985f = null;
                        this.f12983b = null;
                        this.f12984c = null;
                        this.e = 5;
                        cVar2.b(tVar, this);
                        ld.a aVar4 = ld.a.f14658a;
                        return aVar;
                    }
                    return id.i.f11386a;
                }
                i8.b(obj);
                return id.i.f11386a;
            }
            i10 = this.d;
            it = this.f12984c;
            ArrayList arrayList4 = (ArrayList) this.f12983b;
            cVar = (yd.c) this.f12985f;
            i8.b(obj);
            arrayList = new ArrayList(20);
        } else {
            i8.b(obj);
            cVar = (yd.c) this.f12985f;
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
                    this.f12985f = cVar4;
                    this.f12983b = arrayList;
                    this.f12984c = it3;
                    this.d = i16;
                    this.e = 1;
                    cVar4.b(arrayList, this);
                    ld.a aVar5 = ld.a.f14658a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f12985f = null;
            this.f12983b = null;
            this.f12984c = null;
            this.e = 2;
            cVar4.b(arrayList, this);
            ld.a aVar6 = ld.a.f14658a;
            return aVar;
        }
        return id.i.f11386a;
    }
}
