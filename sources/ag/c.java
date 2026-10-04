package ag;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f443b;
    public final AudioBufferConverter f444c = new AudioBufferConverter();
    public long d;
    public int f445e;
    public int f446f;
    public int f447g;
    public int h;
    public ShortBuffer f448i;
    public boolean f449j;

    public c(String str) {
        this.f443b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f449j) {
            int i10 = this.f446f;
            if (i10 < this.f445e) {
                this.f446f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f448i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f448i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f448i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f449j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f443b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f449j;
    }

    @Override
    public final void d() {
        this.f448i = null;
        this.f449j = false;
        AudioDecoder audioDecoder = this.f443b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f447g = i10;
        this.h = i11;
        this.f449j = true;
        this.f443b.start();
        this.f445e = AudioConversions.usToShorts(this.d, this.f447g, this.h);
        this.f446f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f448i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f443b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f448i = this.f444c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f447g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f448i = null;
    }

    public c(String str, int i10) {
        this.f443b = new AudioDecoder(str, i10);
    }
}
