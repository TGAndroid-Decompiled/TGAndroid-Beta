package defpackage;

import java.io.Closeable;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class yh0 implements gw2, Iterator, Closeable {
    public static final xh0 c = new y1("eof ");
    public pz0 a;
    public ArrayList b;

    static {
        be6.a(yh0.class);
    }

    public final void a(pz0 pz0Var) {
        if (pz0Var != null) {
            this.b = new ArrayList(this.b);
            pz0Var.setParent(this);
            this.b.add(pz0Var);
        }
    }

    public final long b() {
        long j = 0;
        for (int i = 0; i < this.b.size(); i++) {
            j += ((pz0) this.b.get(i)).getSize();
        }
        return j;
    }

    public final void c(WritableByteChannel writableByteChannel) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((pz0) obj).getBox(writableByteChannel);
        }
    }

    @Override
    public final void close() {
        throw null;
    }

    @Override
    public final boolean hasNext() {
        pz0 pz0Var = this.a;
        xh0 xh0Var = c;
        if (pz0Var == xh0Var) {
            return false;
        }
        if (pz0Var != null) {
            return true;
        }
        try {
            if (pz0Var != null && pz0Var != xh0Var) {
                this.a = pz0Var;
                return true;
            }
            this.a = xh0Var;
            throw new NoSuchElementException();
        } catch (NoSuchElementException unused) {
            this.a = xh0Var;
            return false;
        }
    }

    @Override
    public final Object next() {
        pz0 pz0Var = this.a;
        xh0 xh0Var = c;
        if (pz0Var != null && pz0Var != xh0Var) {
            this.a = null;
            return pz0Var;
        }
        this.a = xh0Var;
        u36.g();
        return null;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.b.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((pz0) this.b.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
