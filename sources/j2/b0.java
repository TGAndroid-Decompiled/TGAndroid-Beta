package j2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f17176a;
    public long f17177b;
    public Uri f17178c;
    public Map d;

    public b0(h hVar) {
        hVar.getClass();
        this.f17176a = hVar;
        this.f17178c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f17176a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f17176a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f17176a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f17176a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f17176a;
        this.f17178c = mVar.f17210a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f17178c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        int read = this.f17176a.read(bArr, i7, i10);
        if (read != -1) {
            this.f17177b += read;
        }
        return read;
    }
}
