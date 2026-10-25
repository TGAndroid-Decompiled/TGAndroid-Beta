package fb;

import java.io.IOException;
import java.io.StringWriter;
public abstract class i {
    public final l h() {
        if (this instanceof l) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String m() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            nb.b bVar = new nb.b(stringWriter);
            bVar.f18769n = 1;
            hb.d.l(this, bVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
