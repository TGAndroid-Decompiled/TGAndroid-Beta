package g5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class u0 implements m {
    public final m f6456a;
    public long f6457b;
    public Uri f6458c;

    public u0(m mVar) {
        mVar.getClass();
        this.f6456a = mVar;
        this.f6458c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(v0 v0Var) {
        v0Var.getClass();
        this.f6456a.addTransferListener(v0Var);
    }

    @Override
    public final void close() {
        this.f6456a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f6456a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f6456a.getUri();
    }

    @Override
    public final long open(p pVar) {
        this.f6458c = pVar.f6401a;
        Map map = Collections.EMPTY_MAP;
        m mVar = this.f6456a;
        long open = mVar.open(pVar);
        Uri uri = mVar.getUri();
        uri.getClass();
        this.f6458c = uri;
        mVar.getResponseHeaders();
        return open;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f6456a.read(bArr, i10, i11);
        if (read != -1) {
            this.f6457b += read;
        }
        return read;
    }
}
