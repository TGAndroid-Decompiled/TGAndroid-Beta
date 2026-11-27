package defpackage;

import java.io.Closeable;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class zg0 implements qv2, Iterator, Closeable {
    public static final yg0 c = new z1("eof ");
    public qy0 a;
    public ArrayList b;

    static {
        ge6.a(zg0.class);
    }

    public final void a(qy0 qy0Var) {
        if (qy0Var != null) {
            this.b = new ArrayList(this.b);
            qy0Var.setParent(this);
            this.b.add(qy0Var);
        }
    }

    public final long b() {
        long j = 0;
        for (int i = 0; i < this.b.size(); i++) {
            j += ((qy0) this.b.get(i)).getSize();
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
            ((qy0) obj).getBox(writableByteChannel);
        }
    }

    @Override
    public final void close() {
        throw null;
    }

    @Override
    public final boolean hasNext() {
        qy0 qy0Var = this.a;
        yg0 yg0Var = c;
        if (qy0Var == yg0Var) {
            return false;
        }
        if (qy0Var != null) {
            return true;
        }
        try {
            if (qy0Var != null && qy0Var != yg0Var) {
                this.a = qy0Var;
                return true;
            }
            this.a = yg0Var;
            throw new NoSuchElementException();
        } catch (NoSuchElementException unused) {
            this.a = yg0Var;
            return false;
        }
    }

    @Override
    public final Object next() {
        qy0 qy0Var = this.a;
        yg0 yg0Var = c;
        if (qy0Var != null && qy0Var != yg0Var) {
            this.a = null;
            return qy0Var;
        }
        this.a = yg0Var;
        lq5.n();
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
            sb.append(((qy0) this.b.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
