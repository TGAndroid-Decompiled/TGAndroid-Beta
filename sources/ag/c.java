package ag;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f409b;
    public final AudioBufferConverter f410c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f411f;
    public int f412g;
    public int h;
    public ShortBuffer f413i;
    public boolean f414j;

    public c(String str) {
        this.f409b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f414j) {
            int i10 = this.f411f;
            if (i10 < this.e) {
                this.f411f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f413i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f413i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f413i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f414j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f409b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f414j;
    }

    @Override
    public final void d() {
        this.f413i = null;
        this.f414j = false;
        AudioDecoder audioDecoder = this.f409b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f412g = i10;
        this.h = i11;
        this.f414j = true;
        this.f409b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f412g, this.h);
        this.f411f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f413i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f409b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f413i = this.f410c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f412g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f413i = null;
    }

    public c(String str, int i10) {
        this.f409b = new AudioDecoder(str, i10);
    }
}
