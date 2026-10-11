package id;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import v7.a8;
public final class u extends ld.i implements sd.p {
    public Object f12123b;
    public Iterator f12124c;
    public int d;
    public int f12125e;
    public Object f12126f;
    public final Iterator h;

    public u(Iterator it, jd.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override
    public final jd.c create(Object obj, jd.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f12126f = obj;
        return uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((xd.c) obj, (jd.c) obj2)).invokeSuspend(hd.i.f11091a);
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
        kd.a aVar = kd.a.f14783a;
        int i11 = this.f12125e;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            tVar = (t) this.f12123b;
                            cVar2 = (xd.c) this.f12126f;
                            a8.b(obj);
                            tVar.n();
                        }
                    } else {
                        Iterator it2 = this.f12124c;
                        t tVar2 = (t) this.f12123b;
                        xd.c cVar3 = (xd.c) this.f12126f;
                        a8.b(obj);
                        tVar2.n();
                        while (true) {
                            int i12 = tVar2.f12121b;
                            Object[] objArr = tVar2.f12120a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (tVar2.i() != i12) {
                                    int i13 = tVar2.f12122c;
                                    int i14 = tVar2.d;
                                    objArr[(i13 + i14) % i12] = next;
                                    tVar2.d = i14 + 1;
                                    if (tVar2.i() == i12) {
                                        if (tVar2.d < 20) {
                                            int i15 = i12 + (i12 >> 1) + 1;
                                            if (i15 > 20) {
                                                i15 = 20;
                                            }
                                            if (tVar2.f12122c == 0) {
                                                array = Arrays.copyOf(objArr, i15);
                                                kotlin.jvm.internal.i.d(array, "copyOf(...)");
                                            } else {
                                                array = tVar2.toArray(new Object[i15]);
                                            }
                                            tVar2 = new t(tVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(tVar2);
                                            this.f12126f = cVar3;
                                            this.f12123b = tVar2;
                                            this.f12124c = it2;
                                            this.f12125e = 3;
                                            cVar3.c(arrayList2, this);
                                            kd.a aVar2 = kd.a.f14783a;
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
                        this.f12126f = cVar2;
                        this.f12123b = tVar;
                        this.f12124c = null;
                        this.f12125e = 4;
                        cVar2.c(arrayList3, this);
                        kd.a aVar3 = kd.a.f14783a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f12126f = null;
                        this.f12123b = null;
                        this.f12124c = null;
                        this.f12125e = 5;
                        cVar2.c(tVar, this);
                        kd.a aVar4 = kd.a.f14783a;
                        return aVar;
                    }
                    return hd.i.f11091a;
                }
                a8.b(obj);
                return hd.i.f11091a;
            }
            i10 = this.d;
            it = this.f12124c;
            ArrayList arrayList4 = (ArrayList) this.f12123b;
            cVar = (xd.c) this.f12126f;
            a8.b(obj);
            arrayList = new ArrayList(20);
        } else {
            a8.b(obj);
            cVar = (xd.c) this.f12126f;
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
                    this.f12126f = cVar4;
                    this.f12123b = arrayList;
                    this.f12124c = it3;
                    this.d = i16;
                    this.f12125e = 1;
                    cVar4.c(arrayList, this);
                    kd.a aVar5 = kd.a.f14783a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f12126f = null;
            this.f12123b = null;
            this.f12124c = null;
            this.f12125e = 2;
            cVar4.c(arrayList, this);
            kd.a aVar6 = kd.a.f14783a;
            return aVar;
        }
        return hd.i.f11091a;
    }
}
