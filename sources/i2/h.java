package i2;

import android.net.Uri;
import java.util.Map;
public interface h extends d2.o {
    void addTransferListener(d0 d0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(n nVar);
}
