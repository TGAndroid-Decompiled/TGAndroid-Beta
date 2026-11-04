package i2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class c0 implements h {
    public final h f14527a;
    public long f14528b;
    public Uri f14529c;
    public Map d;

    public c0(h hVar) {
        hVar.getClass();
        this.f14527a = hVar;
        this.f14529c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.f14527a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        this.f14527a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f14527a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f14527a.getUri();
    }

    @Override
    public final long open(n nVar) {
        h hVar = this.f14527a;
        this.f14529c = nVar.f14564a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(nVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f14529c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        int read = this.f14527a.read(bArr, i3, i10);
        if (read != -1) {
            this.f14528b += read;
        }
        return read;
    }
}
