package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class c0 implements h {
    public final h f7282a;
    public long f7283b;
    public Uri f7284c;
    public Map d;

    public c0(h hVar) {
        hVar.getClass();
        this.f7282a = hVar;
        this.f7284c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.f7282a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        this.f7282a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f7282a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f7282a.getUri();
    }

    @Override
    public final long open(n nVar) {
        h hVar = this.f7282a;
        this.f7284c = nVar.f7314a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(nVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f7284c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f7282a.read(bArr, i10, i11);
        if (read != -1) {
            this.f7283b += read;
        }
        return read;
    }
}
