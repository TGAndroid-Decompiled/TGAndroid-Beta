package defpackage;

import java.util.Iterator;
public final class ns implements Iterator {
    public int a;
    public int b;
    public boolean c;
    public final byte d;
    public final Object e;

    public ns(qs qsVar, byte b) {
        this(qsVar.c);
        this.d = b;
        switch (b) {
            case 1:
                this.e = qsVar;
                this(qsVar.c);
                return;
            default:
                this.e = qsVar;
                return;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.b < this.a) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object f;
        if (hasNext()) {
            int i = this.b;
            byte b = this.d;
            Object obj = this.e;
            switch (b) {
                case 0:
                    f = ((qs) obj).f(i);
                    break;
                case 1:
                    f = ((qs) obj).i(i);
                    break;
                default:
                    f = ((ss) obj).b[i];
                    break;
            }
            this.b++;
            this.c = true;
            return f;
        }
        lq5.n();
        return null;
    }

    @Override
    public final void remove() {
        if (this.c) {
            int i = this.b - 1;
            this.b = i;
            byte b = this.d;
            Object obj = this.e;
            switch (b) {
                case 0:
                    ((qs) obj).g(i);
                    break;
                case 1:
                    ((qs) obj).g(i);
                    break;
                default:
                    ((ss) obj).h(i);
                    break;
            }
            this.a--;
            this.c = false;
            return;
        }
        grb.i("Call next() before removing an element.");
    }

    public ns(ss ssVar) {
        this(ssVar.c);
        this.d = (byte) 2;
        this.e = ssVar;
    }

    public ns(int i) {
        this.a = i;
    }
}
