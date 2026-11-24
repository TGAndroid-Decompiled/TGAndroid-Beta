package defpackage;

import android.net.Uri;
import java.util.Map;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
public final class jdc implements a83 {
    public final ExtendedDefaultDataSource a;
    public final long b;

    public jdc(ExtendedDefaultDataSource extendedDefaultDataSource, long j) {
        this.a = extendedDefaultDataSource;
        this.b = j;
    }

    @Override
    public final void addTransferListener(w0c w0cVar) {
        this.a.addTransferListener(w0cVar);
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
    public final long open(g83 g83Var) {
        f83 a = g83Var.a();
        a.e = g83Var.e + this.b;
        return this.a.open(a.a());
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
