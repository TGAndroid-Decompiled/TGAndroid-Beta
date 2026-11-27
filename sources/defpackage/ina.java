package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class ina extends fe9 implements is4 {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public byte f;
    public Object h;
    public final Iterator n;

    public ina(Iterator it, zw2 zw2Var) {
        super(2, zw2Var);
        this.n = it;
    }

    @Override
    public final zw2 create(Object obj, zw2 zw2Var) {
        ina inaVar = new ina(this.n, zw2Var);
        inaVar.h = obj;
        return inaVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((ina) create((g8a) obj, (zw2) obj2)).invokeSuspend(f9c.a);
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
        tm9 tm9Var;
        Object[] array;
        g8a g8aVar = (g8a) this.h;
        byte b2 = this.f;
        boolean z = true;
        vx2 vx2Var = vx2.a;
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 != 4) {
                            if (b2 == 5) {
                                tm9 tm9Var2 = (tm9) this.b;
                            } else {
                                grb.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            i4 = this.e;
                            i5 = this.d;
                            tm9Var = (tm9) this.b;
                            ixe.b(obj);
                            tm9Var.i();
                        }
                    } else {
                        i4 = this.e;
                        int i6 = this.d;
                        Iterator it2 = this.c;
                        tm9 tm9Var3 = (tm9) this.b;
                        ixe.b(obj);
                        tm9Var3.i();
                        while (true) {
                            int i7 = tm9Var3.b;
                            Object[] objArr = tm9Var3.a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                boolean z2 = z;
                                if (tm9Var3.h() != i7) {
                                    int i8 = tm9Var3.c;
                                    int i9 = tm9Var3.d;
                                    objArr[(i8 + i9) % i7] = next;
                                    tm9Var3.d = i9 + 1;
                                    if (tm9Var3.h() == i7) {
                                        if (tm9Var3.d < 20) {
                                            int i10 = i7 + (i7 >> 1) + 1;
                                            if (i10 > 20) {
                                                i10 = 20;
                                            }
                                            if (tm9Var3.c == 0) {
                                                array = Arrays.copyOf(objArr, i10);
                                            } else {
                                                array = tm9Var3.toArray(new Object[i10]);
                                            }
                                            tm9Var3 = new tm9(tm9Var3.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(tm9Var3);
                                            this.h = g8aVar;
                                            this.b = tm9Var3;
                                            this.c = it2;
                                            this.d = i6;
                                            this.e = i4;
                                            this.f = (byte) 3;
                                            g8aVar.c(arrayList2, this);
                                            return vx2Var;
                                        }
                                    }
                                    z = z2;
                                } else {
                                    grb.i("ring buffer is full");
                                    return null;
                                }
                            } else {
                                i5 = i6;
                                tm9Var = tm9Var3;
                                break;
                            }
                        }
                    }
                    if (tm9Var.d > 20) {
                        ArrayList arrayList3 = new ArrayList(tm9Var);
                        this.h = g8aVar;
                        this.b = tm9Var;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = (byte) 4;
                        g8aVar.c(arrayList3, this);
                        return vx2Var;
                    }
                    if (!tm9Var.isEmpty()) {
                        this.h = null;
                        this.b = null;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = (byte) 5;
                        g8aVar.c(tm9Var, this);
                        return vx2Var;
                    }
                    return f9c.a;
                }
                ArrayList arrayList4 = (ArrayList) this.b;
                ixe.b(obj);
                return f9c.a;
            }
            b = 1;
            i = this.e;
            int i11 = this.d;
            Iterator it3 = this.c;
            ArrayList arrayList5 = (ArrayList) this.b;
            ixe.b(obj);
            arrayList = new ArrayList(20);
            it = it3;
            i3 = i11;
            i2 = i;
        } else {
            b = 1;
            ixe.b(obj);
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
                    this.h = g8aVar;
                    this.b = arrayList;
                    this.c = it;
                    this.d = i3;
                    this.e = i2;
                    this.f = b;
                    g8aVar.c(arrayList, this);
                    return vx2Var;
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
            g8aVar.c(arrayList, this);
            return vx2Var;
        }
        return f9c.a;
    }
}
