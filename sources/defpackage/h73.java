package defpackage;

import android.net.Uri;
import java.util.Map;
public interface h73 extends z63 {
    void addTransferListener(v2c v2cVar);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(n73 n73Var);
}
