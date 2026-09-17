package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f10296a;
    public long f10297b;
    public Uri f10298c;

    public b0(h hVar) {
        hVar.getClass();
        this.f10296a = hVar;
        this.f10298c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f10296a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f10296a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f10296a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f10296a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f10296a;
        this.f10298c = mVar.f10330a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f10298c = uri;
            }
            hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f10296a.read(bArr, i10, i11);
        if (read != -1) {
            this.f10297b += read;
        }
        return read;
    }
}
