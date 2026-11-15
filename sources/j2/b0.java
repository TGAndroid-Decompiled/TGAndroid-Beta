package j2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f16769a;
    public long f16770b;
    public Uri f16771c;
    public Map d;

    public b0(h hVar) {
        hVar.getClass();
        this.f16769a = hVar;
        this.f16771c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f16769a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f16769a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f16769a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f16769a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f16769a;
        this.f16771c = mVar.f16803a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f16771c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        int read = this.f16769a.read(bArr, i7, i10);
        if (read != -1) {
            this.f16770b += read;
        }
        return read;
    }
}
