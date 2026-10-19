package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f10762a;
    public long f10763b;
    public Uri f10764c;
    public Map d;

    public b0(h hVar) {
        hVar.getClass();
        this.f10762a = hVar;
        this.f10764c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f10762a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f10762a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f10762a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f10762a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f10762a;
        this.f10764c = mVar.f10791a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f10764c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f10762a.read(bArr, i10, i11);
        if (read != -1) {
            this.f10763b += read;
        }
        return read;
    }
}
