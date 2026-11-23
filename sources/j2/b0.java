package j2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f17179a;
    public long f17180b;
    public Uri f17181c;
    public Map d;

    public b0(h hVar) {
        hVar.getClass();
        this.f17179a = hVar;
        this.f17181c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f17179a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f17179a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f17179a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f17179a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f17179a;
        this.f17181c = mVar.f17213a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f17181c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        int read = this.f17179a.read(bArr, i7, i10);
        if (read != -1) {
            this.f17180b += read;
        }
        return read;
    }
}
