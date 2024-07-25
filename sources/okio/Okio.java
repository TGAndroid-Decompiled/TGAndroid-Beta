package okio;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
public final class Okio {
    static {
        Logger.getLogger(Okio.class.getName());
    }

    private Okio() {
    }

    public static BufferedSource buffer(Source source) {
        return new RealBufferedSource(source);
    }

    public static Source source(InputStream inputStream) {
        return source(inputStream, new Timeout());
    }

    private static Source source(final InputStream inputStream, final Timeout timeout) {
        if (inputStream != null) {
            if (timeout == null) {
                throw new IllegalArgumentException("timeout == null");
            }
            return new Source() {
                @Override
                public long read(Buffer buffer, long j) throws IOException {
                    if (j < 0) {
                        throw new IllegalArgumentException("byteCount < 0: " + j);
                    } else if (j == 0) {
                        return 0L;
                    } else {
                        try {
                            Timeout.this.throwIfReached();
                            Segment writableSegment = buffer.writableSegment(1);
                            int read = inputStream.read(writableSegment.data, writableSegment.limit, (int) Math.min(j, 8192 - writableSegment.limit));
                            if (read == -1) {
                                if (writableSegment.pos == writableSegment.limit) {
                                    buffer.head = writableSegment.pop();
                                    SegmentPool.recycle(writableSegment);
                                    return -1L;
                                }
                                return -1L;
                            }
                            writableSegment.limit += read;
                            long j2 = read;
                            buffer.size += j2;
                            return j2;
                        } catch (AssertionError e) {
                            if (Okio.isAndroidGetsocknameError(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }

                @Override
                public void close() throws IOException {
                    inputStream.close();
                }

                public String toString() {
                    return "source(" + inputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("in == null");
    }

    static boolean isAndroidGetsocknameError(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
