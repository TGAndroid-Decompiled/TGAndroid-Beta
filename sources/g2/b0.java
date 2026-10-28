package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f12228a;
    public long f12229b;
    public Uri f12230c;
    public Map d;

    public b0(h hVar) {
        hVar.getClass();
        this.f12228a = hVar;
        this.f12230c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f12228a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f12228a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f12228a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f12228a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f12228a;
        this.f12230c = mVar.f12257a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f12230c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f12228a.read(bArr, i10, i11);
        if (read != -1) {
            this.f12229b += read;
        }
        return read;
    }
}
