package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f9854a;
    public long f9855b;
    public Uri f9856c;
    public Map d;

    public b0(h hVar) {
        hVar.getClass();
        this.f9854a = hVar;
        this.f9856c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f9854a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f9854a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f9854a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f9854a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f9854a;
        this.f9856c = mVar.f9883a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f9856c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f9854a.read(bArr, i10, i11);
        if (read != -1) {
            this.f9855b += read;
        }
        return read;
    }
}
