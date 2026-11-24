package defpackage;

import android.net.Uri;
import java.util.Map;
public interface o63 extends g63 {
    void addTransferListener(vyb vybVar);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(u63 u63Var);
}
