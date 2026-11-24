package defpackage;

import java.util.Iterator;
public final class ms implements Iterator {
    public int a;
    public int b;
    public boolean c;
    public final byte d;
    public final Object e;

    public ms(ps psVar, byte b) {
        this(psVar.c);
        this.d = b;
        switch (b) {
            case 1:
                this.e = psVar;
                this(psVar.c);
                return;
            default:
                this.e = psVar;
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
                    f = ((ps) obj).f(i);
                    break;
                case 1:
                    f = ((ps) obj).i(i);
                    break;
                default:
                    f = ((rs) obj).b[i];
                    break;
            }
            this.b++;
            this.c = true;
            return f;
        }
        w26.g();
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
                    ((ps) obj).g(i);
                    break;
                case 1:
                    ((ps) obj).g(i);
                    break;
                default:
                    ((rs) obj).h(i);
                    break;
            }
            this.a--;
            this.c = false;
            return;
        }
        sc8.j("Call next() before removing an element.");
    }

    public ms(rs rsVar) {
        this(rsVar.c);
        this.d = (byte) 2;
        this.e = rsVar;
    }

    public ms(int i) {
        this.a = i;
    }
}
