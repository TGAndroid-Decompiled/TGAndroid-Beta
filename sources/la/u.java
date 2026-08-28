package la;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
public abstract class u {
    public final Object fromJson(Reader reader) {
        return read(new ta.a(reader));
    }

    public final Object fromJsonTree(i iVar) {
        try {
            ?? aVar = new ta.a(oa.l.E);
            aVar.A = new Object[32];
            aVar.B = 0;
            aVar.C = new String[32];
            aVar.D = new int[32];
            aVar.L(iVar);
            return read(aVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final u nullSafe() {
        return new e(this, 2);
    }

    public abstract Object read(ta.a aVar);

    public final void toJson(Writer writer, Object obj) {
        write(new ta.c(writer), obj);
    }

    public final i toJsonTree(Object obj) {
        try {
            oa.n nVar = new oa.n();
            write(nVar, obj);
            return nVar.u();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public abstract void write(ta.c cVar, Object obj);

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
