package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class oja extends ra9 implements eq4 {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public byte f;
    public Object h;
    public final Iterator n;

    public oja(Iterator it, fw2 fw2Var) {
        super(2, fw2Var);
        this.n = it;
    }

    @Override
    public final fw2 create(Object obj, fw2 fw2Var) {
        oja ojaVar = new oja(this.n, fw2Var);
        ojaVar.h = obj;
        return ojaVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((oja) create((o4a) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        byte b;
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        int i3;
        int i4;
        int i5;
        fj9 fj9Var;
        Object[] array;
        o4a o4aVar = (o4a) this.h;
        byte b2 = this.f;
        boolean z = true;
        bx2 bx2Var = bx2.a;
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 != 4) {
                            if (b2 == 5) {
                                fj9 fj9Var2 = (fj9) this.b;
                            } else {
                                sc8.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            i4 = this.e;
                            i5 = this.d;
                            fj9Var = (fj9) this.b;
                            qse.b(obj);
                            fj9Var.i();
                        }
                    } else {
                        i4 = this.e;
                        int i6 = this.d;
                        Iterator it2 = this.c;
                        fj9 fj9Var3 = (fj9) this.b;
                        qse.b(obj);
                        fj9Var3.i();
                        while (true) {
                            int i7 = fj9Var3.b;
                            Object[] objArr = fj9Var3.a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                boolean z2 = z;
                                if (fj9Var3.h() != i7) {
                                    int i8 = fj9Var3.c;
                                    int i9 = fj9Var3.d;
                                    objArr[(i8 + i9) % i7] = next;
                                    fj9Var3.d = i9 + 1;
                                    if (fj9Var3.h() == i7) {
                                        if (fj9Var3.d < 20) {
                                            int i10 = i7 + (i7 >> 1) + 1;
                                            if (i10 > 20) {
                                                i10 = 20;
                                            }
                                            if (fj9Var3.c == 0) {
                                                array = Arrays.copyOf(objArr, i10);
                                            } else {
                                                array = fj9Var3.toArray(new Object[i10]);
                                            }
                                            fj9Var3 = new fj9(fj9Var3.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(fj9Var3);
                                            this.h = o4aVar;
                                            this.b = fj9Var3;
                                            this.c = it2;
                                            this.d = i6;
                                            this.e = i4;
                                            this.f = (byte) 3;
                                            o4aVar.c(arrayList2, this);
                                            return bx2Var;
                                        }
                                    }
                                    z = z2;
                                } else {
                                    sc8.j("ring buffer is full");
                                    return null;
                                }
                            } else {
                                i5 = i6;
                                fj9Var = fj9Var3;
                                break;
                            }
                        }
                    }
                    if (fj9Var.d > 20) {
                        ArrayList arrayList3 = new ArrayList(fj9Var);
                        this.h = o4aVar;
                        this.b = fj9Var;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = (byte) 4;
                        o4aVar.c(arrayList3, this);
                        return bx2Var;
                    }
                    if (!fj9Var.isEmpty()) {
                        this.h = null;
                        this.b = null;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = (byte) 5;
                        o4aVar.c(fj9Var, this);
                        return bx2Var;
                    }
                    return g5c.a;
                }
                ArrayList arrayList4 = (ArrayList) this.b;
                qse.b(obj);
                return g5c.a;
            }
            b = 1;
            i = this.e;
            int i11 = this.d;
            Iterator it3 = this.c;
            ArrayList arrayList5 = (ArrayList) this.b;
            qse.b(obj);
            arrayList = new ArrayList(20);
            it = it3;
            i3 = i11;
            i2 = i;
        } else {
            b = 1;
            qse.b(obj);
            i = 0;
            i2 = 0;
            arrayList = new ArrayList(20);
            it = this.n;
            i3 = 20;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i > 0) {
                i--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.h = o4aVar;
                    this.b = arrayList;
                    this.c = it;
                    this.d = i3;
                    this.e = i2;
                    this.f = b;
                    o4aVar.c(arrayList, this);
                    return bx2Var;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.h = null;
            this.b = null;
            this.c = null;
            this.d = i3;
            this.e = i2;
            this.f = (byte) 2;
            o4aVar.c(arrayList, this);
            return bx2Var;
        }
        return g5c.a;
    }
}
