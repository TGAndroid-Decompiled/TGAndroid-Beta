package hd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class u extends kd.i implements rd.p {
    public Object f14187b;
    public Iterator f14188c;
    public int d;
    public int f14189e;
    public Object f14190f;
    public final Iterator h;

    public u(Iterator it, id.c cVar) {
        super(2, cVar);
        this.h = it;
    }

    @Override
    public final id.c create(Object obj, id.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f14190f = obj;
        return uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((wd.c) obj, (id.c) obj2)).invokeSuspend(gd.k.f13517a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        wd.c cVar;
        ArrayList arrayList;
        Iterator it;
        int i7;
        t tVar;
        wd.c cVar2;
        Object[] array;
        jd.a aVar = jd.a.f17409a;
        int i10 = this.f14189e;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            tVar = (t) this.f14187b;
                            cVar2 = (wd.c) this.f14190f;
                            b7.h.b(obj);
                            tVar.i();
                        }
                    } else {
                        Iterator it2 = this.f14188c;
                        t tVar2 = (t) this.f14187b;
                        wd.c cVar3 = (wd.c) this.f14190f;
                        b7.h.b(obj);
                        tVar2.i();
                        while (true) {
                            int i11 = tVar2.f14185b;
                            Object[] objArr = tVar2.f14184a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (tVar2.f() != i11) {
                                    int i12 = tVar2.f14186c;
                                    int i13 = tVar2.d;
                                    objArr[(i12 + i13) % i11] = next;
                                    tVar2.d = i13 + 1;
                                    if (tVar2.f() == i11) {
                                        if (tVar2.d < 20) {
                                            int i14 = i11 + (i11 >> 1) + 1;
                                            if (i14 > 20) {
                                                i14 = 20;
                                            }
                                            if (tVar2.f14186c == 0) {
                                                array = Arrays.copyOf(objArr, i14);
                                                kotlin.jvm.internal.j.d(array, "copyOf(...)");
                                            } else {
                                                array = tVar2.toArray(new Object[i14]);
                                            }
                                            tVar2 = new t(tVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(tVar2);
                                            this.f14190f = cVar3;
                                            this.f14187b = tVar2;
                                            this.f14188c = it2;
                                            this.f14189e = 3;
                                            cVar3.b(arrayList2, this);
                                            jd.a aVar2 = jd.a.f17409a;
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
                        this.f14190f = cVar2;
                        this.f14187b = tVar;
                        this.f14188c = null;
                        this.f14189e = 4;
                        cVar2.b(arrayList3, this);
                        jd.a aVar3 = jd.a.f17409a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f14190f = null;
                        this.f14187b = null;
                        this.f14188c = null;
                        this.f14189e = 5;
                        cVar2.b(tVar, this);
                        jd.a aVar4 = jd.a.f17409a;
                        return aVar;
                    }
                    return gd.k.f13517a;
                }
                b7.h.b(obj);
                return gd.k.f13517a;
            }
            i7 = this.d;
            it = this.f14188c;
            ArrayList arrayList4 = (ArrayList) this.f14187b;
            cVar = (wd.c) this.f14190f;
            b7.h.b(obj);
            arrayList = new ArrayList(20);
        } else {
            b7.h.b(obj);
            cVar = (wd.c) this.f14190f;
            arrayList = new ArrayList(20);
            it = this.h;
            i7 = 0;
        }
        wd.c cVar4 = cVar;
        Iterator it3 = it;
        int i15 = i7;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i7 > 0) {
                i7--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f14190f = cVar4;
                    this.f14187b = arrayList;
                    this.f14188c = it3;
                    this.d = i15;
                    this.f14189e = 1;
                    cVar4.b(arrayList, this);
                    jd.a aVar5 = jd.a.f17409a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f14190f = null;
            this.f14187b = null;
            this.f14188c = null;
            this.f14189e = 2;
            cVar4.b(arrayList, this);
            jd.a aVar6 = jd.a.f17409a;
            return aVar;
        }
        return gd.k.f13517a;
    }
}
