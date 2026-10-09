package g2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
public final class b0 implements h {
    public final h f10233a;
    public long f10234b;
    public Uri f10235c;

    public b0(h hVar) {
        hVar.getClass();
        this.f10233a = hVar;
        this.f10235c = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f10233a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        this.f10233a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f10233a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f10233a.getUri();
    }

    @Override
    public final long open(m mVar) {
        h hVar = this.f10233a;
        this.f10235c = mVar.f10267a;
        Map map = Collections.EMPTY_MAP;
        try {
            return hVar.open(mVar);
        } finally {
            Uri uri = hVar.getUri();
            if (uri != null) {
                this.f10235c = uri;
            }
            hVar.getResponseHeaders();
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f10233a.read(bArr, i10, i11);
        if (read != -1) {
            this.f10234b += read;
        }
        return read;
    }
}
