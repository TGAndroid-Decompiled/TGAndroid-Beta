package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f8478a;
    public long f8479b;
    public Uri f8480c;

    public b0(h hVar) {
        hVar.getClass();
        this.f8478a = hVar;
        this.f8480c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f8478a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f8478a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f8478a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f8478a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f8478a;
        this.f8480c = mVar.f8508a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f8480c = uri;
            }
            hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f8478a.read(bArr, i10, i11);
        if (read != -1) {
            this.f8479b += read;
        }
        return read;
    }
}
