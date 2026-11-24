package defpackage;

import java.util.ArrayDeque;
public abstract class ud1 implements lab {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public sd1 d;
    public long e;
    public long f;
    public long g;

    public ud1() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new qab());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            sg0 sg0Var = new sg0(this, (byte) 29);
            ?? obj = new Object();
            obj.c = sg0Var;
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
        gre.p(z);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        sd1 sd1Var = (sd1) arrayDeque.pollFirst();
        this.d = sd1Var;
        return sd1Var;
    }

    @Override
    public final void e(Object obj) {
        boolean z;
        qab qabVar = (qab) obj;
        if (qabVar == this.d) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        sd1 sd1Var = (sd1) qabVar;
        if (!sd1Var.isEndOfStream()) {
            long j = sd1Var.e;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != -9223372036854775807L && j < j2) {
                    sd1Var.clear();
                    this.a.add(sd1Var);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        sd1Var.s = j3;
        this.c.add(sd1Var);
        this.d = null;
    }

    public abstract qx4 f();

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
            sd1 sd1Var = (sd1) arrayDeque2.poll();
            String str = g8c.a;
            sd1Var.clear();
            arrayDeque.add(sd1Var);
        }
        sd1 sd1Var2 = this.d;
        if (sd1Var2 != null) {
            sd1Var2.clear();
            arrayDeque.add(sd1Var2);
            this.d = null;
        }
    }

    public abstract void g(sd1 sd1Var);

    @Override
    public rab c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (!arrayDeque2.isEmpty()) {
                String str = g8c.a;
                if (((sd1) arrayDeque2.peek()).e <= this.e) {
                    sd1 sd1Var = (sd1) arrayDeque2.poll();
                    boolean isEndOfStream = sd1Var.isEndOfStream();
                    ArrayDeque arrayDeque3 = this.a;
                    if (isEndOfStream) {
                        rab rabVar = (rab) arrayDeque.pollFirst();
                        rabVar.addFlag(4);
                        sd1Var.clear();
                        arrayDeque3.add(sd1Var);
                        return rabVar;
                    }
                    g(sd1Var);
                    if (i()) {
                        qx4 f = f();
                        rab rabVar2 = (rab) arrayDeque.pollFirst();
                        long j = sd1Var.e;
                        rabVar2.timeUs = j;
                        rabVar2.a = f;
                        rabVar2.b = j;
                        sd1Var.clear();
                        arrayDeque3.add(sd1Var);
                        return rabVar2;
                    }
                    sd1Var.clear();
                    arrayDeque3.add(sd1Var);
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
