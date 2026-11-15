package dg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f8083b;
    public final AudioBufferConverter f8084c = new AudioBufferConverter();
    public long d;
    public int f8085e;
    public int f8086f;
    public int f8087g;
    public int h;
    public ShortBuffer f8088i;
    public boolean f8089j;

    public c(String str) {
        this.f8083b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s5;
        if (this.f8089j) {
            int i7 = this.f8086f;
            if (i7 < this.f8085e) {
                this.f8086f = i7 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f8088i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s5 = this.f8088i.get();
            } else {
                s5 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f8088i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s5;
            }
            this.f8089j = false;
            return s5;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f8083b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f8089j;
    }

    @Override
    public final void d() {
        this.f8088i = null;
        this.f8089j = false;
        AudioDecoder audioDecoder = this.f8083b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8087g = i7;
        this.h = i10;
        this.f8089j = true;
        this.f8083b.start();
        this.f8085e = AudioConversions.usToShorts(this.d, this.f8087g, this.h);
        this.f8086f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f8088i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f8083b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f8088i = this.f8084c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f8087g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f8088i = null;
    }

    public c(String str, int i7) {
        this.f8083b = new AudioDecoder(str, i7);
    }
}
