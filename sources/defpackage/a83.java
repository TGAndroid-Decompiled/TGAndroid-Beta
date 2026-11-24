package defpackage;

import android.net.Uri;
import java.util.Map;
public interface a83 extends s73 {
    void addTransferListener(w0c w0cVar);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(g83 g83Var);
}
