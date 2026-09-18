package hd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import v7.t7;
public final class u extends kd.i implements rd.p {
    public Object f10203b;
    public Iterator f10204c;
    public int d;
    public int e;
    public Object f10205f;
    public final Iterator h;

    public u(Iterator it, id.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f10205f = obj;
        return uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((wd.c) obj, (id.c) obj2)).invokeSuspend(gd.i.f9620a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i10;
        wd.c cVar;
        Iterator it;
        int i11;
        t tVar;
        wd.c cVar2;
        Object[] array;
        jd.a aVar = jd.a.f12970a;
        int i12 = this.e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            tVar = (t) this.f10203b;
                            cVar2 = (wd.c) this.f10205f;
                            t7.b(obj);
                            tVar.n();
                        }
                    } else {
                        Iterator it2 = this.f10204c;
                        t tVar2 = (t) this.f10203b;
                        wd.c cVar3 = (wd.c) this.f10205f;
                        t7.b(obj);
                        tVar2.n();
                        while (true) {
                            int i13 = tVar2.f10201b;
                            Object[] objArr = tVar2.f10200a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (tVar2.i() != i13) {
                                    int i14 = tVar2.f10202c;
                                    int i15 = tVar2.d;
                                    objArr[(i14 + i15) % i13] = next;
                                    tVar2.d = i15 + 1;
                                    if (tVar2.i() == i13) {
                                        if (tVar2.d < 20) {
                                            int i16 = i13 + (i13 >> 1) + 1;
                                            if (i16 > 20) {
                                                i16 = 20;
                                            }
                                            if (tVar2.f10202c == 0) {
                                                array = Arrays.copyOf(objArr, i16);
                                                kotlin.jvm.internal.i.d(array, "copyOf(...)");
                                            } else {
                                                array = tVar2.toArray(new Object[i16]);
                                            }
                                            tVar2 = new t(tVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(tVar2);
                                            this.f10205f = cVar3;
                                            this.f10203b = tVar2;
                                            this.f10204c = it2;
                                            this.e = 3;
                                            cVar3.c(arrayList2, this);
                                            jd.a aVar2 = jd.a.f12970a;
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
                        this.f10205f = cVar2;
                        this.f10203b = tVar;
                        this.f10204c = null;
                        this.e = 4;
                        cVar2.c(arrayList3, this);
                        jd.a aVar3 = jd.a.f12970a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f10205f = null;
                        this.f10203b = null;
                        this.f10204c = null;
                        this.e = 5;
                        cVar2.c(tVar, this);
                        jd.a aVar4 = jd.a.f12970a;
                        return aVar;
                    }
                    return gd.i.f9620a;
                }
                t7.b(obj);
                return gd.i.f9620a;
            }
            i10 = this.d;
            Iterator it3 = this.f10204c;
            ArrayList arrayList4 = (ArrayList) this.f10203b;
            t7.b(obj);
            arrayList = new ArrayList(20);
            cVar = (wd.c) this.f10205f;
            it = it3;
            i11 = i10;
        } else {
            t7.b(obj);
            wd.c cVar4 = (wd.c) this.f10205f;
            arrayList = new ArrayList(20);
            i10 = 0;
            cVar = cVar4;
            it = this.h;
            i11 = 0;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i10 > 0) {
                i10--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f10205f = cVar;
                    this.f10203b = arrayList;
                    this.f10204c = it;
                    this.d = i11;
                    this.e = 1;
                    cVar.c(arrayList, this);
                    jd.a aVar5 = jd.a.f12970a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f10205f = null;
            this.f10203b = null;
            this.f10204c = null;
            this.e = 2;
            cVar.c(arrayList, this);
            jd.a aVar6 = jd.a.f12970a;
            return aVar;
        }
        return gd.i.f9620a;
    }
}
