package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f10160a;
    public long f10161b;
    public Uri f10162c;

    public b0(h hVar) {
        hVar.getClass();
        this.f10160a = hVar;
        this.f10162c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f10160a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f10160a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f10160a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f10160a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f10160a;
        this.f10162c = mVar.f10194a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f10162c = uri;
            }
            hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f10160a.read(bArr, i10, i11);
        if (read != -1) {
            this.f10161b += read;
        }
        return read;
    }
}
