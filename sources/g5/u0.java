package g5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class u0 implements m {
    public final m f6948a;
    public long f6949b;
    public Uri f6950c;

    public u0(m mVar) {
        mVar.getClass();
        this.f6948a = mVar;
        this.f6950c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(v0 v0Var) {
        v0Var.getClass();
        this.f6948a.addTransferListener(v0Var);
    }

    @Override
    public final void close() {
        this.f6948a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f6948a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f6948a.getUri();
    }

    @Override
    public final long open(p pVar) {
        this.f6950c = pVar.f6885a;
        Map map = Collections.EMPTY_MAP;
        m mVar = this.f6948a;
        long open = mVar.open(pVar);
        Uri uri = mVar.getUri();
        uri.getClass();
        this.f6950c = uri;
        mVar.getResponseHeaders();
        return open;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f6948a.read(bArr, i10, i11);
        if (read != -1) {
            this.f6949b += read;
        }
        return read;
    }
}
