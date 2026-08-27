package ma;

import java.io.IOException;
import java.io.StringWriter;

public abstract class i {
    public final l i() {
        if (this instanceof l) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ua.b bVar = new ua.b(stringWriter);
            bVar.f48486n = 1;
            oa.d.l(this, bVar);
            return stringWriter.toString();
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }
}
