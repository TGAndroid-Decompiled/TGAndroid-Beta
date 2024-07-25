package okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
public interface BufferedSink extends Closeable, Flushable, WritableByteChannel {
    BufferedSink writeByte(int i) throws IOException;

    BufferedSink writeUtf8(String str) throws IOException;

    BufferedSink writeUtf8(String str, int i, int i2) throws IOException;
}
