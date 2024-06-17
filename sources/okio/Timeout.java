package okio;

import java.io.IOException;
import java.io.InterruptedIOException;

public class Timeout {
    private long deadlineNanoTime;
    private boolean hasDeadline;

    static {
        new Timeout() {
            @Override
            public void throwIfReached() throws IOException {
            }
        };
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
