package bd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class w extends ed.i implements ld.p {
    public Object f2669b;
    public Iterator f2670c;
    public int d;
    public int e;
    public Object f2671f;
    public final Iterator h;

    public w(Iterator it, cd.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override
    public final cd.c create(Object obj, cd.c cVar) {
        w wVar = new w(this.h, cVar);
        wVar.f2671f = obj;
        return wVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((qd.c) obj, (cd.c) obj2)).invokeSuspend(ad.j.f401a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        qd.c cVar;
        ArrayList arrayList;
        Iterator it;
        int i10;
        v vVar;
        qd.c cVar2;
        Object[] array;
        dd.a aVar = dd.a.f5864a;
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
                            vVar = (v) this.f2669b;
                            cVar2 = (qd.c) this.f2671f;
                            l9.b.b(obj);
                            vVar.m();
                        }
                    } else {
                        Iterator it2 = this.f2670c;
                        v vVar2 = (v) this.f2669b;
                        qd.c cVar3 = (qd.c) this.f2671f;
                        l9.b.b(obj);
                        vVar2.m();
                        while (true) {
                            int i12 = vVar2.f2667b;
                            Object[] objArr = vVar2.f2666a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (vVar2.l() != i12) {
                                    int i13 = vVar2.f2668c;
                                    int i14 = vVar2.d;
                                    objArr[(i13 + i14) % i12] = next;
                                    vVar2.d = i14 + 1;
                                    if (vVar2.l() == i12) {
                                        if (vVar2.d < 20) {
                                            int i15 = i12 + (i12 >> 1) + 1;
                                            if (i15 > 20) {
                                                i15 = 20;
                                            }
                                            if (vVar2.f2668c == 0) {
                                                array = Arrays.copyOf(objArr, i15);
                                                kotlin.jvm.internal.i.d(array, "copyOf(...)");
                                            } else {
                                                array = vVar2.toArray(new Object[i15]);
                                            }
                                            vVar2 = new v(vVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(vVar2);
                                            this.f2671f = cVar3;
                                            this.f2669b = vVar2;
                                            this.f2670c = it2;
                                            this.e = 3;
                                            cVar3.b(arrayList2, this);
                                            dd.a aVar2 = dd.a.f5864a;
                                            return aVar;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("ring buffer is full");
                                }
                            } else {
                                vVar = vVar2;
                                cVar2 = cVar3;
                                break;
                            }
                        }
                    }
                    if (vVar.d > 20) {
                        ArrayList arrayList3 = new ArrayList(vVar);
                        this.f2671f = cVar2;
                        this.f2669b = vVar;
                        this.f2670c = null;
                        this.e = 4;
                        cVar2.b(arrayList3, this);
                        dd.a aVar3 = dd.a.f5864a;
                        return aVar;
                    }
                    if (!vVar.isEmpty()) {
                        this.f2671f = null;
                        this.f2669b = null;
                        this.f2670c = null;
                        this.e = 5;
                        cVar2.b(vVar, this);
                        dd.a aVar4 = dd.a.f5864a;
                        return aVar;
                    }
                    return ad.j.f401a;
                }
                l9.b.b(obj);
                return ad.j.f401a;
            }
            i10 = this.d;
            it = this.f2670c;
            ArrayList arrayList4 = (ArrayList) this.f2669b;
            cVar = (qd.c) this.f2671f;
            l9.b.b(obj);
            arrayList = new ArrayList(20);
        } else {
            l9.b.b(obj);
            cVar = (qd.c) this.f2671f;
            arrayList = new ArrayList(20);
            it = this.h;
            i10 = 0;
        }
        qd.c cVar4 = cVar;
        Iterator it3 = it;
        int i16 = i10;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i10 > 0) {
                i10--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f2671f = cVar4;
                    this.f2669b = arrayList;
                    this.f2670c = it3;
                    this.d = i16;
                    this.e = 1;
                    cVar4.b(arrayList, this);
                    dd.a aVar5 = dd.a.f5864a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f2671f = null;
            this.f2669b = null;
            this.f2670c = null;
            this.e = 2;
            cVar4.b(arrayList, this);
            dd.a aVar6 = dd.a.f5864a;
            return aVar;
        }
        return ad.j.f401a;
    }
}
