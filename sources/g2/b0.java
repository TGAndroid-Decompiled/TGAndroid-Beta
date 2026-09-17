package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f9350a;
    public long f9351b;
    public Uri f9352c;

    public b0(h hVar) {
        hVar.getClass();
        this.f9350a = hVar;
        this.f9352c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f9350a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f9350a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f9350a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f9350a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f9350a;
        this.f9352c = mVar.f9380a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f9352c = uri;
            }
            hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f9350a.read(bArr, i10, i11);
        if (read != -1) {
            this.f9351b += read;
        }
        return read;
    }
}
