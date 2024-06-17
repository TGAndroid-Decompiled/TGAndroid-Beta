package kotlinx.coroutines;

import java.lang.Throwable;
import kotlinx.coroutines.CopyableThrowable;

public interface CopyableThrowable<T extends Throwable & CopyableThrowable<T>> {
    T createCopy();
}
