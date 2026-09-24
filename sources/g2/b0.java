package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f9332a;
    public long f9333b;
    public Uri f9334c;

    public b0(h hVar) {
        hVar.getClass();
        this.f9332a = hVar;
        this.f9334c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f9332a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f9332a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f9332a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f9332a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f9332a;
        this.f9334c = mVar.f9362a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f9334c = uri;
            }
            hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f9332a.read(bArr, i10, i11);
        if (read != -1) {
            this.f9333b += read;
        }
        return read;
    }
}
