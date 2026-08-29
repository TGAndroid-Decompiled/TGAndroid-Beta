package na;

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
            va.b bVar = new va.b(stringWriter);
            bVar.f49494n = 1;
            pa.d.l(this, bVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
