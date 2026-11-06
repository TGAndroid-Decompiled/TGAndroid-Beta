package j2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class c0 implements h {
    public final h f16412a;
    public long f16413b;
    public Uri f16414c;
    public Map d;

    public c0(h hVar) {
        hVar.getClass();
        this.f16412a = hVar;
        this.f16414c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.f16412a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        this.f16412a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f16412a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f16412a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f16412a;
        this.f16414c = mVar.f16446a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f16414c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        int read = this.f16412a.read(bArr, i7, i10);
        if (read != -1) {
            this.f16413b += read;
        }
        return read;
    }
}
