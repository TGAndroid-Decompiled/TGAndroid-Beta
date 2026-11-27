package defpackage;

import java.util.ArrayDeque;
public abstract class de1 implements ieb {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public be1 d;
    public long e;
    public long f;
    public long g;

    public de1() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new neb());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            rd1 rd1Var = new rd1(this, (byte) 1);
            ?? obj = new Object();
            obj.c = rd1Var;
            arrayDeque.add(obj);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override
    public final void a(long j) {
        this.g = j;
    }

    @Override
    public final void b(long j) {
        this.e = j;
    }

    @Override
    public final Object d() {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        be1 be1Var = (be1) arrayDeque.pollFirst();
        this.d = be1Var;
        return be1Var;
    }

    @Override
    public final void e(Object obj) {
        boolean z;
        neb nebVar = (neb) obj;
        if (nebVar == this.d) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        be1 be1Var = (be1) nebVar;
        if (!be1Var.isEndOfStream()) {
            long j = be1Var.e;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != -9223372036854775807L && j < j2) {
                    be1Var.clear();
                    this.a.add(be1Var);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        be1Var.s = j3;
        this.c.add(be1Var);
        this.d = null;
    }

    public abstract wz4 f();

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            be1 be1Var = (be1) arrayDeque2.poll();
            String str = gcc.a;
            be1Var.clear();
            arrayDeque.add(be1Var);
        }
        be1 be1Var2 = this.d;
        if (be1Var2 != null) {
            be1Var2.clear();
            arrayDeque.add(be1Var2);
            this.d = null;
        }
    }

    public abstract void g(be1 be1Var);

    @Override
    public oeb c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (!arrayDeque2.isEmpty()) {
                String str = gcc.a;
                if (((be1) arrayDeque2.peek()).e <= this.e) {
                    be1 be1Var = (be1) arrayDeque2.poll();
                    boolean isEndOfStream = be1Var.isEndOfStream();
                    ArrayDeque arrayDeque3 = this.a;
                    if (isEndOfStream) {
                        oeb oebVar = (oeb) arrayDeque.pollFirst();
                        oebVar.addFlag(4);
                        be1Var.clear();
                        arrayDeque3.add(be1Var);
                        return oebVar;
                    }
                    g(be1Var);
                    if (i()) {
                        wz4 f = f();
                        oeb oebVar2 = (oeb) arrayDeque.pollFirst();
                        long j = be1Var.e;
                        oebVar2.timeUs = j;
                        oebVar2.a = f;
                        oebVar2.b = j;
                        be1Var.clear();
                        arrayDeque3.add(be1Var);
                        return oebVar2;
                    }
                    be1Var.clear();
                    arrayDeque3.add(be1Var);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
    }

    public abstract boolean i();

    @Override
    public void release() {
    }
}
