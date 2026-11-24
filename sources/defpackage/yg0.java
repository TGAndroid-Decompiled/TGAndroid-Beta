package defpackage;

import java.io.Closeable;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class yg0 implements wu2, Iterator, Closeable {
    public static final xg0 c = new y1("eof ");
    public iy0 a;
    public ArrayList b;

    static {
        cc6.a(yg0.class);
    }

    public final void a(iy0 iy0Var) {
        if (iy0Var != null) {
            this.b = new ArrayList(this.b);
            iy0Var.setParent(this);
            this.b.add(iy0Var);
        }
    }

    public final long b() {
        long j = 0;
        for (int i = 0; i < this.b.size(); i++) {
            j += ((iy0) this.b.get(i)).getSize();
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
            ((iy0) obj).getBox(writableByteChannel);
        }
    }

    @Override
    public final void close() {
        throw null;
    }

    @Override
    public final boolean hasNext() {
        iy0 iy0Var = this.a;
        xg0 xg0Var = c;
        if (iy0Var == xg0Var) {
            return false;
        }
        if (iy0Var != null) {
            return true;
        }
        try {
            if (iy0Var != null && iy0Var != xg0Var) {
                this.a = iy0Var;
                return true;
            }
            this.a = xg0Var;
            throw new NoSuchElementException();
        } catch (NoSuchElementException unused) {
            this.a = xg0Var;
            return false;
        }
    }

    @Override
    public final Object next() {
        iy0 iy0Var = this.a;
        xg0 xg0Var = c;
        if (iy0Var != null && iy0Var != xg0Var) {
            this.a = null;
            return iy0Var;
        }
        this.a = xg0Var;
        w26.g();
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
            sb.append(((iy0) this.b.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
