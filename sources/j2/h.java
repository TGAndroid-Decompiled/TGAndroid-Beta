package j2;

import android.net.Uri;
import java.util.Map;
public interface h extends e2.n {
    void addTransferListener(d0 d0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(m mVar);
}
