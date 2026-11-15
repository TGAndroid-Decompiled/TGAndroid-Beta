package dg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f8080b;
    public final AudioBufferConverter f8081c = new AudioBufferConverter();
    public long d;
    public int f8082e;
    public int f8083f;
    public int f8084g;
    public int h;
    public ShortBuffer f8085i;
    public boolean f8086j;

    public c(String str) {
        this.f8080b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s5;
        if (this.f8086j) {
            int i7 = this.f8083f;
            if (i7 < this.f8082e) {
                this.f8083f = i7 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f8085i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s5 = this.f8085i.get();
            } else {
                s5 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f8085i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s5;
            }
            this.f8086j = false;
            return s5;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f8080b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f8086j;
    }

    @Override
    public final void d() {
        this.f8085i = null;
        this.f8086j = false;
        AudioDecoder audioDecoder = this.f8080b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8084g = i7;
        this.h = i10;
        this.f8086j = true;
        this.f8080b.start();
        this.f8082e = AudioConversions.usToShorts(this.d, this.f8084g, this.h);
        this.f8083f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f8085i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f8080b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f8085i = this.f8081c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f8084g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f8085i = null;
    }

    public c(String str, int i7) {
        this.f8080b = new AudioDecoder(str, i7);
    }
}
