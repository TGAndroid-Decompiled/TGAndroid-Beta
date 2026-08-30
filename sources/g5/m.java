package g5;

import android.net.Uri;
import java.util.Map;
public interface m extends j {
    void addTransferListener(v0 v0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(p pVar);
}
