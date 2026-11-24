package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class c0b implements a83 {
    public final a83 a;
    public long b;
    public Uri c;
    public Map d;

    public c0b(a83 a83Var) {
        a83Var.getClass();
        this.a = a83Var;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(w0c w0cVar) {
        w0cVar.getClass();
        this.a.addTransferListener(w0cVar);
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
    public final long open(g83 g83Var) {
        a83 a83Var = this.a;
        this.c = g83Var.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return a83Var.open(g83Var);
        } finally {
            Uri uri = a83Var.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = a83Var.getResponseHeaders();
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
