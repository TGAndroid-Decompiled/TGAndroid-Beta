package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class c0 implements h {
    public final h f7283a;
    public long f7284b;
    public Uri f7285c;
    public Map d;

    public c0(h hVar) {
        hVar.getClass();
        this.f7283a = hVar;
        this.f7285c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.f7283a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        this.f7283a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f7283a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f7283a.getUri();
    }

    @Override
    public final long open(n nVar) {
        h hVar = this.f7283a;
        this.f7285c = nVar.f7315a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(nVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f7285c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f7283a.read(bArr, i10, i11);
        if (read != -1) {
            this.f7284b += read;
        }
        return read;
    }
}
