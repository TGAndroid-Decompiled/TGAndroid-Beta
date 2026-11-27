package defpackage;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class gfc implements h73 {
    public final ExtendedDefaultDataSource a;
    public final long b;

    public gfc(ExtendedDefaultDataSource extendedDefaultDataSource, long j) {
        this.a = extendedDefaultDataSource;
        this.b = j;
    }

    @Override
    public final void addTransferListener(v2c v2cVar) {
        this.a.addTransferListener(v2cVar);
    }

    @Override
    public final void close() {
        this.a.close();
    }

    @Override
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override
    public final long open(n73 n73Var) {
        m73 a = n73Var.a();
        a.e = n73Var.e + this.b;
        return this.a.open(a.a());
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
