package j2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class c0 implements h {
    public final h f16415a;
    public long f16416b;
    public Uri f16417c;
    public Map d;

    public c0(h hVar) {
        hVar.getClass();
        this.f16415a = hVar;
        this.f16417c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.f16415a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        this.f16415a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f16415a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f16415a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f16415a;
        this.f16417c = mVar.f16449a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f16417c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        int read = this.f16415a.read(bArr, i7, i10);
        if (read != -1) {
            this.f16416b += read;
        }
        return read;
    }
}
