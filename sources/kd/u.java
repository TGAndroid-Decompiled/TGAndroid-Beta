package kd;

import a8.jd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class u extends nd.h implements ud.p {
    public Object f16534b;
    public Iterator f16535c;
    public int d;
    public int e;
    public Object f16536f;
    public final Iterator h;

    public u(Iterator it, ld.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override
    public final ld.c create(Object obj, ld.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f16536f = obj;
        return uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((zd.c) obj, (ld.c) obj2)).invokeSuspend(jd.i.f15580a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        zd.c cVar;
        ArrayList arrayList;
        Iterator it;
        int i10;
        t tVar;
        zd.c cVar2;
        Object[] array;
        md.a aVar = md.a.f18412a;
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
                            tVar = (t) this.f16534b;
                            cVar2 = (zd.c) this.f16536f;
                            jd.b(obj);
                            tVar.m();
                        }
                    } else {
                        Iterator it2 = this.f16535c;
                        t tVar2 = (t) this.f16534b;
                        zd.c cVar3 = (zd.c) this.f16536f;
                        jd.b(obj);
                        tVar2.m();
                        while (true) {
                            int i12 = tVar2.f16532b;
                            Object[] objArr = tVar2.f16531a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (tVar2.h() != i12) {
                                    int i13 = tVar2.f16533c;
                                    int i14 = tVar2.d;
                                    objArr[(i13 + i14) % i12] = next;
                                    tVar2.d = i14 + 1;
                                    if (tVar2.h() == i12) {
                                        if (tVar2.d < 20) {
                                            int i15 = i12 + (i12 >> 1) + 1;
                                            if (i15 > 20) {
                                                i15 = 20;
                                            }
                                            if (tVar2.f16533c == 0) {
                                                array = Arrays.copyOf(objArr, i15);
                                                kotlin.jvm.internal.i.d(array, "copyOf(...)");
                                            } else {
                                                array = tVar2.toArray(new Object[i15]);
                                            }
                                            tVar2 = new t(tVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(tVar2);
                                            this.f16536f = cVar3;
                                            this.f16534b = tVar2;
                                            this.f16535c = it2;
                                            this.e = 3;
                                            cVar3.b(arrayList2, this);
                                            md.a aVar2 = md.a.f18412a;
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
                        this.f16536f = cVar2;
                        this.f16534b = tVar;
                        this.f16535c = null;
                        this.e = 4;
                        cVar2.b(arrayList3, this);
                        md.a aVar3 = md.a.f18412a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f16536f = null;
                        this.f16534b = null;
                        this.f16535c = null;
                        this.e = 5;
                        cVar2.b(tVar, this);
                        md.a aVar4 = md.a.f18412a;
                        return aVar;
                    }
                    return jd.i.f15580a;
                }
                jd.b(obj);
                return jd.i.f15580a;
            }
            i10 = this.d;
            it = this.f16535c;
            ArrayList arrayList4 = (ArrayList) this.f16534b;
            cVar = (zd.c) this.f16536f;
            jd.b(obj);
            arrayList = new ArrayList(20);
        } else {
            jd.b(obj);
            cVar = (zd.c) this.f16536f;
            arrayList = new ArrayList(20);
            it = this.h;
            i10 = 0;
        }
        zd.c cVar4 = cVar;
        Iterator it3 = it;
        int i16 = i10;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i10 > 0) {
                i10--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f16536f = cVar4;
                    this.f16534b = arrayList;
                    this.f16535c = it3;
                    this.d = i16;
                    this.e = 1;
                    cVar4.b(arrayList, this);
                    md.a aVar5 = md.a.f18412a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f16536f = null;
            this.f16534b = null;
            this.f16535c = null;
            this.e = 2;
            cVar4.b(arrayList, this);
            md.a aVar6 = md.a.f18412a;
            return aVar;
        }
        return jd.i.f15580a;
    }
}
