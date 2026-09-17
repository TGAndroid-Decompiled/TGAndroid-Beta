package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f10324a;
    public long f10325b;
    public Uri f10326c;

    public b0(h hVar) {
        hVar.getClass();
        this.f10324a = hVar;
        this.f10326c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f10324a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f10324a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f10324a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f10324a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f10324a;
        this.f10326c = mVar.f10358a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f10326c = uri;
            }
            hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f10324a.read(bArr, i10, i11);
        if (read != -1) {
            this.f10325b += read;
        }
        return read;
    }
}
