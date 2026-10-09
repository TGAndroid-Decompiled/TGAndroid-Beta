package id;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import v7.a8;
public final class u extends ld.i implements sd.p {
    public Object f12124b;
    public Iterator f12125c;
    public int d;
    public int f12126e;
    public Object f12127f;
    public final Iterator h;

    public u(Iterator it, jd.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f12127f = obj;
        return uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((xd.c) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11092a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        xd.c cVar;
        ArrayList arrayList;
        Iterator it;
        int i10;
        t tVar;
        xd.c cVar2;
        Object[] array;
        kd.a aVar = kd.a.f14784a;
        int i11 = this.f12126e;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            tVar = (t) this.f12124b;
                            cVar2 = (xd.c) this.f12127f;
                            a8.b(obj);
                            tVar.n();
                        }
                    } else {
                        Iterator it2 = this.f12125c;
                        t tVar2 = (t) this.f12124b;
                        xd.c cVar3 = (xd.c) this.f12127f;
                        a8.b(obj);
                        tVar2.n();
                        while (true) {
                            int i12 = tVar2.f12122b;
                            Object[] objArr = tVar2.f12121a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (tVar2.i() != i12) {
                                    int i13 = tVar2.f12123c;
                                    int i14 = tVar2.d;
                                    objArr[(i13 + i14) % i12] = next;
                                    tVar2.d = i14 + 1;
                                    if (tVar2.i() == i12) {
                                        if (tVar2.d < 20) {
                                            int i15 = i12 + (i12 >> 1) + 1;
                                            if (i15 > 20) {
                                                i15 = 20;
                                            }
                                            if (tVar2.f12123c == 0) {
                                                array = Arrays.copyOf(objArr, i15);
                                                kotlin.jvm.internal.i.d(array, "copyOf(...)");
                                            } else {
                                                array = tVar2.toArray(new Object[i15]);
                                            }
                                            tVar2 = new t(tVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(tVar2);
                                            this.f12127f = cVar3;
                                            this.f12124b = tVar2;
                                            this.f12125c = it2;
                                            this.f12126e = 3;
                                            cVar3.c(arrayList2, this);
                                            kd.a aVar2 = kd.a.f14784a;
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
                        this.f12127f = cVar2;
                        this.f12124b = tVar;
                        this.f12125c = null;
                        this.f12126e = 4;
                        cVar2.c(arrayList3, this);
                        kd.a aVar3 = kd.a.f14784a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f12127f = null;
                        this.f12124b = null;
                        this.f12125c = null;
                        this.f12126e = 5;
                        cVar2.c(tVar, this);
                        kd.a aVar4 = kd.a.f14784a;
                        return aVar;
                    }
                    return hd.i.f11092a;
                }
                a8.b(obj);
                return hd.i.f11092a;
            }
            i10 = this.d;
            it = this.f12125c;
            ArrayList arrayList4 = (ArrayList) this.f12124b;
            cVar = (xd.c) this.f12127f;
            a8.b(obj);
            arrayList = new ArrayList(20);
        } else {
            a8.b(obj);
            cVar = (xd.c) this.f12127f;
            arrayList = new ArrayList(20);
            it = this.h;
            i10 = 0;
        }
        xd.c cVar4 = cVar;
        Iterator it3 = it;
        int i16 = i10;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i10 > 0) {
                i10--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f12127f = cVar4;
                    this.f12124b = arrayList;
                    this.f12125c = it3;
                    this.d = i16;
                    this.f12126e = 1;
                    cVar4.c(arrayList, this);
                    kd.a aVar5 = kd.a.f14784a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f12127f = null;
            this.f12124b = null;
            this.f12125c = null;
            this.f12126e = 2;
            cVar4.c(arrayList, this);
            kd.a aVar6 = kd.a.f14784a;
            return aVar;
        }
        return hd.i.f11092a;
    }
}
