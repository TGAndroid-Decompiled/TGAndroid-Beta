package ia;

import android.os.Message;
import java.util.Comparator;

public final class p0 implements Comparator {
    @Override
    public final int compare(Object obj, Object obj2) {
        Long lValueOf = Long.valueOf(((Message) obj).getWhen());
        Long lValueOf2 = Long.valueOf(((Message) obj2).getWhen());
        if (lValueOf == lValueOf2) {
            return 0;
        }
        return lValueOf.compareTo(lValueOf2);
    }
}
