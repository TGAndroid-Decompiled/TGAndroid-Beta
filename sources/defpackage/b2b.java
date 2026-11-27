package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b2b implements h73 {
    public final h73 a;
    public long b;
    public Uri c;
    public Map d;

    public b2b(h73 h73Var) {
        h73Var.getClass();
        this.a = h73Var;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(v2c v2cVar) {
        v2cVar.getClass();
        this.a.addTransferListener(v2cVar);
    }

    @Override
    public final void close() {
        this.a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override
    public final long open(n73 n73Var) {
        h73 h73Var = this.a;
        this.c = n73Var.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return h73Var.open(n73Var);
        } finally {
            Uri uri = h73Var.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = h73Var.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
