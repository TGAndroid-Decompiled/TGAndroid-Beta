package okio;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
public interface BufferedSource extends Source, ReadableByteChannel {
    @Deprecated
    Buffer buffer();

    long indexOf(ByteString byteString) throws IOException;

    long indexOfElement(ByteString byteString) throws IOException;

    boolean request(long j) throws IOException;

    int select(Options options) throws IOException;
}
