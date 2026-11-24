package defpackage;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class gbc implements o63 {
    public final ExtendedDefaultDataSource a;
    public final long b;

    public gbc(ExtendedDefaultDataSource extendedDefaultDataSource, long j) {
        this.a = extendedDefaultDataSource;
        this.b = j;
    }

    @Override
    public final void addTransferListener(vyb vybVar) {
        this.a.addTransferListener(vybVar);
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
    public final long open(u63 u63Var) {
        t63 a = u63Var.a();
        a.e = u63Var.e + this.b;
        return this.a.open(a.a());
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
