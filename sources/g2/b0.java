package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f10763a;
    public long f10764b;
    public Uri f10765c;
    public Map d;

    public b0(h hVar) {
        hVar.getClass();
        this.f10763a = hVar;
        this.f10765c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f10763a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f10763a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f10763a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f10763a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f10763a;
        this.f10765c = mVar.f10792a;
        this.d = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f10765c = uri;
            }
            this.d = hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f10763a.read(bArr, i10, i11);
        if (read != -1) {
            this.f10764b += read;
        }
        return read;
    }
}
