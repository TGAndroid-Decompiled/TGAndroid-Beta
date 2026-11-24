package defpackage;

import java.util.Iterator;
public final class nt implements Iterator {
    public int a;
    public int b;
    public boolean c;
    public final byte d;
    public final Object e;

    public nt(qt qtVar, byte b) {
        this(qtVar.c);
        this.d = b;
        switch (b) {
            case 1:
                this.e = qtVar;
                this(qtVar.c);
                return;
            default:
                this.e = qtVar;
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
                    f = ((qt) obj).f(i);
                    break;
                case 1:
                    f = ((qt) obj).i(i);
                    break;
                default:
                    f = ((st) obj).b[i];
                    break;
            }
            this.b++;
            this.c = true;
            return f;
        }
        u36.g();
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
                    ((qt) obj).g(i);
                    break;
                case 1:
                    ((qt) obj).g(i);
                    break;
                default:
                    ((st) obj).h(i);
                    break;
            }
            this.a--;
            this.c = false;
            return;
        }
        dq9.m("Call next() before removing an element.");
    }

    public nt(st stVar) {
        this(stVar.c);
        this.d = (byte) 2;
        this.e = stVar;
    }

    public nt(int i) {
        this.a = i;
    }
}
