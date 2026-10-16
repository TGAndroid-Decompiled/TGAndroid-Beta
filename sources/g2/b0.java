package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f9857a;
    public long f9858b;
    public Uri f9859c;
    public Map d;

    public b0(h hVar) {
        hVar.getClass();
        this.f9857a = hVar;
        this.f9859c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f9857a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f9857a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f9857a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f9857a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f9857a;
        this.f9859c = mVar.f9886a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f9859c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f9857a.read(bArr, i10, i11);
        if (read != -1) {
            this.f9858b += read;
        }
        return read;
    }
}
