package li;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
public interface a1 {
    void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void w(MediaFormat mediaFormat);
}
