package ag;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f408b;
    public final AudioBufferConverter f409c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f410f;
    public int f411g;
    public int h;
    public ShortBuffer f412i;
    public boolean f413j;

    public c(String str) {
        this.f408b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f413j) {
            int i10 = this.f410f;
            if (i10 < this.e) {
                this.f410f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f412i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f412i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f412i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f413j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f408b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f413j;
    }

    @Override
    public final void d() {
        this.f412i = null;
        this.f413j = false;
        AudioDecoder audioDecoder = this.f408b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f411g = i10;
        this.h = i11;
        this.f413j = true;
        this.f408b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f411g, this.h);
        this.f410f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f412i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f408b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f412i = this.f409c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f411g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f412i = null;
    }

    public c(String str, int i10) {
        this.f408b = new AudioDecoder(str, i10);
    }
}
