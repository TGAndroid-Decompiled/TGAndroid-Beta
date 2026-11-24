package defpackage;

import java.util.ArrayDeque;
public abstract class cf1 implements mcb {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public af1 d;
    public long e;
    public long f;
    public long g;

    public cf1() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new rcb());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            cd1 cd1Var = new cd1(this, (byte) 2);
            ?? obj = new Object();
            obj.c = cd1Var;
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
        jte.p(z);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        af1 af1Var = (af1) arrayDeque.pollFirst();
        this.d = af1Var;
        return af1Var;
    }

    @Override
    public final void e(Object obj) {
        boolean z;
        rcb rcbVar = (rcb) obj;
        if (rcbVar == this.d) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        af1 af1Var = (af1) rcbVar;
        if (!af1Var.isEndOfStream()) {
            long j = af1Var.e;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != -9223372036854775807L && j < j2) {
                    af1Var.clear();
                    this.a.add(af1Var);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        af1Var.s = j3;
        this.c.add(af1Var);
        this.d = null;
    }

    public abstract sz4 f();

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
            af1 af1Var = (af1) arrayDeque2.poll();
            String str = hac.a;
            af1Var.clear();
            arrayDeque.add(af1Var);
        }
        af1 af1Var2 = this.d;
        if (af1Var2 != null) {
            af1Var2.clear();
            arrayDeque.add(af1Var2);
            this.d = null;
        }
    }

    public abstract void g(af1 af1Var);

    @Override
    public scb c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (!arrayDeque2.isEmpty()) {
                String str = hac.a;
                if (((af1) arrayDeque2.peek()).e <= this.e) {
                    af1 af1Var = (af1) arrayDeque2.poll();
                    boolean isEndOfStream = af1Var.isEndOfStream();
                    ArrayDeque arrayDeque3 = this.a;
                    if (isEndOfStream) {
                        scb scbVar = (scb) arrayDeque.pollFirst();
                        scbVar.addFlag(4);
                        af1Var.clear();
                        arrayDeque3.add(af1Var);
                        return scbVar;
                    }
                    g(af1Var);
                    if (i()) {
                        sz4 f = f();
                        scb scbVar2 = (scb) arrayDeque.pollFirst();
                        long j = af1Var.e;
                        scbVar2.timeUs = j;
                        scbVar2.a = f;
                        scbVar2.b = j;
                        af1Var.clear();
                        arrayDeque3.add(af1Var);
                        return scbVar2;
                    }
                    af1Var.clear();
                    arrayDeque3.add(af1Var);
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
