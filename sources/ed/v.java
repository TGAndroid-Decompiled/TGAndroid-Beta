package ed;

import b8.ib;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class v extends hd.i implements od.p {
    public Object f9963b;
    public Iterator f9964c;
    public int d;
    public int f9965e;
    public Object f9966f;
    public final Iterator h;

    public v(Iterator it, fd.c cVar) {
        super(2, cVar);
        this.h = it;
    }

    @Override
    public final fd.c create(Object obj, fd.c cVar) {
        v vVar = new v(this.h, cVar);
        vVar.f9966f = obj;
        return vVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((td.c) obj, (fd.c) obj2)).invokeSuspend(dd.k.f8801a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        td.c cVar;
        ArrayList arrayList;
        Iterator it;
        int i3;
        u uVar;
        td.c cVar2;
        Object[] array;
        gd.a aVar = gd.a.f12241a;
        int i10 = this.f9965e;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            uVar = (u) this.f9963b;
                            cVar2 = (td.c) this.f9966f;
                            ib.b(obj);
                            uVar.i();
                        }
                    } else {
                        Iterator it2 = this.f9964c;
                        u uVar2 = (u) this.f9963b;
                        td.c cVar3 = (td.c) this.f9966f;
                        ib.b(obj);
                        uVar2.i();
                        while (true) {
                            int i11 = uVar2.f9961b;
                            Object[] objArr = uVar2.f9960a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (uVar2.h() != i11) {
                                    int i12 = uVar2.f9962c;
                                    int i13 = uVar2.d;
                                    objArr[(i12 + i13) % i11] = next;
                                    uVar2.d = i13 + 1;
                                    if (uVar2.h() == i11) {
                                        if (uVar2.d < 20) {
                                            int i14 = i11 + (i11 >> 1) + 1;
                                            if (i14 > 20) {
                                                i14 = 20;
                                            }
                                            if (uVar2.f9962c == 0) {
                                                array = Arrays.copyOf(objArr, i14);
                                                kotlin.jvm.internal.j.d(array, "copyOf(...)");
                                            } else {
                                                array = uVar2.toArray(new Object[i14]);
                                            }
                                            uVar2 = new u(uVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(uVar2);
                                            this.f9966f = cVar3;
                                            this.f9963b = uVar2;
                                            this.f9964c = it2;
                                            this.f9965e = 3;
                                            cVar3.b(arrayList2, this);
                                            gd.a aVar2 = gd.a.f12241a;
                                            return aVar;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("ring buffer is full");
                                }
                            } else {
                                uVar = uVar2;
                                cVar2 = cVar3;
                                break;
                            }
                        }
                    }
                    if (uVar.d > 20) {
                        ArrayList arrayList3 = new ArrayList(uVar);
                        this.f9966f = cVar2;
                        this.f9963b = uVar;
                        this.f9964c = null;
                        this.f9965e = 4;
                        cVar2.b(arrayList3, this);
                        gd.a aVar3 = gd.a.f12241a;
                        return aVar;
                    }
                    if (!uVar.isEmpty()) {
                        this.f9966f = null;
                        this.f9963b = null;
                        this.f9964c = null;
                        this.f9965e = 5;
                        cVar2.b(uVar, this);
                        gd.a aVar4 = gd.a.f12241a;
                        return aVar;
                    }
                    return dd.k.f8801a;
                }
                ib.b(obj);
                return dd.k.f8801a;
            }
            i3 = this.d;
            it = this.f9964c;
            ArrayList arrayList4 = (ArrayList) this.f9963b;
            cVar = (td.c) this.f9966f;
            ib.b(obj);
            arrayList = new ArrayList(20);
        } else {
            ib.b(obj);
            cVar = (td.c) this.f9966f;
            arrayList = new ArrayList(20);
            it = this.h;
            i3 = 0;
        }
        td.c cVar4 = cVar;
        Iterator it3 = it;
        int i15 = i3;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (i3 > 0) {
                i3--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f9966f = cVar4;
                    this.f9963b = arrayList;
                    this.f9964c = it3;
                    this.d = i15;
                    this.f9965e = 1;
                    cVar4.b(arrayList, this);
                    gd.a aVar5 = gd.a.f12241a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f9966f = null;
            this.f9963b = null;
            this.f9964c = null;
            this.f9965e = 2;
            cVar4.b(arrayList, this);
            gd.a aVar6 = gd.a.f12241a;
            return aVar;
        }
        return dd.k.f8801a;
    }
}
