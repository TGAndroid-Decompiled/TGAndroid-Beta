package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f9344a;
    public long f9345b;
    public Uri f9346c;

    public b0(h hVar) {
        hVar.getClass();
        this.f9344a = hVar;
        this.f9346c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f9344a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f9344a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f9344a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f9344a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f9344a;
        this.f9346c = mVar.f9374a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f9346c = uri;
            }
            hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f9344a.read(bArr, i10, i11);
        if (read != -1) {
            this.f9345b += read;
        }
        return read;
    }
}
