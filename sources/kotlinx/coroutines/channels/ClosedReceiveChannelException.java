package kotlinx.coroutines.channels;

import java.util.NoSuchElementException;

public final class ClosedReceiveChannelException extends NoSuchElementException {
    public ClosedReceiveChannelException(String str) {
        super(str);
    }
}
