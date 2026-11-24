package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class pla extends rc9 implements fs4 {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public byte f;
    public Object h;
    public final Iterator n;

    public pla(Iterator it, px2 px2Var) {
        super(2, px2Var);
        this.n = it;
    }

    @Override
    public final px2 create(Object obj, px2 px2Var) {
        pla plaVar = new pla(this.n, px2Var);
        plaVar.h = obj;
        return plaVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((pla) create((q6a) obj, (px2) obj2)).invokeSuspend(g7c.a);
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
        gl9 gl9Var;
        Object[] array;
        q6a q6aVar = (q6a) this.h;
        byte b2 = this.f;
        boolean z = true;
        ly2 ly2Var = ly2.a;
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 != 4) {
                            if (b2 == 5) {
                                gl9 gl9Var2 = (gl9) this.b;
                            } else {
                                dq9.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            i4 = this.e;
                            i5 = this.d;
                            gl9Var = (gl9) this.b;
                            tue.b(obj);
                            gl9Var.i();
                        }
                    } else {
                        i4 = this.e;
                        int i6 = this.d;
                        Iterator it2 = this.c;
                        gl9 gl9Var3 = (gl9) this.b;
                        tue.b(obj);
                        gl9Var3.i();
                        while (true) {
                            int i7 = gl9Var3.b;
                            Object[] objArr = gl9Var3.a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                boolean z2 = z;
                                if (gl9Var3.h() != i7) {
                                    int i8 = gl9Var3.c;
                                    int i9 = gl9Var3.d;
                                    objArr[(i8 + i9) % i7] = next;
                                    gl9Var3.d = i9 + 1;
                                    if (gl9Var3.h() == i7) {
                                        if (gl9Var3.d < 20) {
                                            int i10 = i7 + (i7 >> 1) + 1;
                                            if (i10 > 20) {
                                                i10 = 20;
                                            }
                                            if (gl9Var3.c == 0) {
                                                array = Arrays.copyOf(objArr, i10);
                                            } else {
                                                array = gl9Var3.toArray(new Object[i10]);
                                            }
                                            gl9Var3 = new gl9(gl9Var3.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(gl9Var3);
                                            this.h = q6aVar;
                                            this.b = gl9Var3;
                                            this.c = it2;
                                            this.d = i6;
                                            this.e = i4;
                                            this.f = (byte) 3;
                                            q6aVar.c(arrayList2, this);
                                            return ly2Var;
                                        }
                                    }
                                    z = z2;
                                } else {
                                    dq9.m("ring buffer is full");
                                    return null;
                                }
                            } else {
                                i5 = i6;
                                gl9Var = gl9Var3;
                                break;
                            }
                        }
                    }
                    if (gl9Var.d > 20) {
                        ArrayList arrayList3 = new ArrayList(gl9Var);
                        this.h = q6aVar;
                        this.b = gl9Var;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = (byte) 4;
                        q6aVar.c(arrayList3, this);
                        return ly2Var;
                    }
                    if (!gl9Var.isEmpty()) {
                        this.h = null;
                        this.b = null;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = (byte) 5;
                        q6aVar.c(gl9Var, this);
                        return ly2Var;
                    }
                    return g7c.a;
                }
                ArrayList arrayList4 = (ArrayList) this.b;
                tue.b(obj);
                return g7c.a;
            }
            b = 1;
            i = this.e;
            int i11 = this.d;
            Iterator it3 = this.c;
            ArrayList arrayList5 = (ArrayList) this.b;
            tue.b(obj);
            arrayList = new ArrayList(20);
            it = it3;
            i3 = i11;
            i2 = i;
        } else {
            b = 1;
            tue.b(obj);
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
                    this.h = q6aVar;
                    this.b = arrayList;
                    this.c = it;
                    this.d = i3;
                    this.e = i2;
                    this.f = b;
                    q6aVar.c(arrayList, this);
                    return ly2Var;
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
            q6aVar.c(arrayList, this);
            return ly2Var;
        }
        return g7c.a;
    }
}
