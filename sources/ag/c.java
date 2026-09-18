package ag;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f411b;
    public final AudioBufferConverter f412c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f413f;
    public int f414g;
    public int h;
    public ShortBuffer f415i;
    public boolean f416j;

    public c(String str) {
        this.f411b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f416j) {
            int i10 = this.f413f;
            if (i10 < this.e) {
                this.f413f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f415i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f415i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f415i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f416j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f411b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f416j;
    }

    @Override
    public final void d() {
        this.f415i = null;
        this.f416j = false;
        AudioDecoder audioDecoder = this.f411b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f414g = i10;
        this.h = i11;
        this.f416j = true;
        this.f411b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f414g, this.h);
        this.f413f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f415i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f411b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f415i = this.f412c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f414g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f415i = null;
    }

    public c(String str, int i10) {
        this.f411b = new AudioDecoder(str, i10);
    }
}
