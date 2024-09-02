package kotlin.sequences;

import java.util.Iterator;

public interface Sequence<T> {
    Iterator<T> iterator();
}
