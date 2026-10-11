package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f10232a;
    public long f10233b;
    public Uri f10234c;

    public b0(h hVar) {
        hVar.getClass();
        this.f10232a = hVar;
        this.f10234c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f10232a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f10232a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f10232a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f10232a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f10232a;
        this.f10234c = mVar.f10266a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f10234c = uri;
            }
            hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f10232a.read(bArr, i10, i11);
        if (read != -1) {
            this.f10233b += read;
        }
        return read;
    }
}
