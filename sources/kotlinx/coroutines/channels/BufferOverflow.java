package kotlinx.coroutines.channels;

public enum BufferOverflow {
    SUSPEND,
    DROP_OLDEST,
    DROP_LATEST
}
