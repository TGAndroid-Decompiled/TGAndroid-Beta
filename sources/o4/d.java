package o4;

import java.util.LinkedHashMap;
import java.util.Map;

public final class d extends LinkedHashMap {
    @Override
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 4;
    }
}
