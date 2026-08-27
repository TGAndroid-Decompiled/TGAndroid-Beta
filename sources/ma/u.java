package ma;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class u {
    public final Object fromJson(Reader reader) {
        return read(new ua.a(reader));
    }

    public final Object fromJsonTree(i iVar) {
        try {
            pa.l lVar = new pa.l(pa.l.E);
            lVar.A = new Object[32];
            lVar.B = 0;
            lVar.C = new String[32];
            lVar.D = new int[32];
            lVar.L(iVar);
            return read(lVar);
        } catch (IOException e9) {
            throw new j(e9);
        }
    }

    public final u nullSafe() {
        return new e(this, 2);
    }

    public abstract Object read(ua.a aVar);

    public final void toJson(Writer writer, Object obj) {
        write(new ua.b(writer), obj);
    }

    public final i toJsonTree(Object obj) {
        try {
            pa.n nVar = new pa.n();
            write(nVar, obj);
            return nVar.u();
        } catch (IOException e9) {
            throw new j(e9);
        }
    }

    public abstract void write(ua.b bVar, Object obj);

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e9) {
            throw new j(e9);
        }
    }
}
