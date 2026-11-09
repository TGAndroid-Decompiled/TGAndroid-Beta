package dg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f8691b;
    public final AudioBufferConverter f8692c = new AudioBufferConverter();
    public long d;
    public int f8693e;
    public int f8694f;
    public int f8695g;
    public int h;
    public ShortBuffer f8696i;
    public boolean f8697j;

    public c(String str) {
        this.f8691b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s5;
        if (this.f8697j) {
            int i7 = this.f8694f;
            if (i7 < this.f8693e) {
                this.f8694f = i7 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f8696i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s5 = this.f8696i.get();
            } else {
                s5 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f8696i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s5;
            }
            this.f8697j = false;
            return s5;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f8691b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f8697j;
    }

    @Override
    public final void d() {
        this.f8696i = null;
        this.f8697j = false;
        AudioDecoder audioDecoder = this.f8691b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8695g = i7;
        this.h = i10;
        this.f8697j = true;
        this.f8691b.start();
        this.f8693e = AudioConversions.usToShorts(this.d, this.f8695g, this.h);
        this.f8694f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f8696i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f8691b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f8696i = this.f8692c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f8695g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f8696i = null;
    }

    public c(String str, int i7) {
        this.f8691b = new AudioDecoder(str, i7);
    }
}
