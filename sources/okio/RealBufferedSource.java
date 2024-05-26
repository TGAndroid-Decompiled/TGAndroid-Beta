package okio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
final class RealBufferedSource implements BufferedSource {
    public final Buffer buffer = new Buffer();
    boolean closed;
    public final Source source;

    public RealBufferedSource(Source source) {
        Objects.requireNonNull(source, "source == null");
        this.source = source;
    }

    @Override
    public Buffer buffer() {
        return this.buffer;
    }

    @Override
    public long read(Buffer buffer, long j) throws IOException {
        if (buffer != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else {
                Buffer buffer2 = this.buffer;
                if (buffer2.size == 0 && this.source.read(buffer2, 8192L) == -1) {
                    return -1L;
                }
                return this.buffer.read(buffer, Math.min(j, this.buffer.size));
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override
    public boolean request(long j) throws IOException {
        Buffer buffer;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.closed) {
            throw new IllegalStateException("closed");
        } else {
            do {
                buffer = this.buffer;
                if (buffer.size >= j) {
                    return true;
                }
            } while (this.source.read(buffer, 8192L) != -1);
            return false;
        }
    }

    @Override
    public int select(Options options) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int selectPrefix = this.buffer.selectPrefix(options, true);
            if (selectPrefix == -1) {
                return -1;
            }
            if (selectPrefix != -2) {
                this.buffer.skip(options.byteStrings[selectPrefix].size());
                return selectPrefix;
            }
        } while (this.source.read(this.buffer, 8192L) != -1);
        return -1;
    }

    @Override
    public int read(ByteBuffer byteBuffer) throws IOException {
        Buffer buffer = this.buffer;
        if (buffer.size == 0 && this.source.read(buffer, 8192L) == -1) {
            return -1;
        }
        return this.buffer.read(byteBuffer);
    }

    @Override
    public long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0L);
    }

    public long indexOf(ByteString byteString, long j) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOf = this.buffer.indexOf(byteString, j);
            if (indexOf != -1) {
                return indexOf;
            }
            Buffer buffer = this.buffer;
            long j2 = buffer.size;
            if (this.source.read(buffer, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (j2 - byteString.size()) + 1);
        }
    }

    @Override
    public long indexOfElement(ByteString byteString) throws IOException {
        return indexOfElement(byteString, 0L);
    }

    public long indexOfElement(ByteString byteString, long j) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOfElement = this.buffer.indexOfElement(byteString, j);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            Buffer buffer = this.buffer;
            long j2 = buffer.size;
            if (this.source.read(buffer, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    @Override
    public boolean isOpen() {
        return !this.closed;
    }

    @Override
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.buffer.clear();
    }

    public String toString() {
        return "buffer(" + this.source + ")";
    }
}
