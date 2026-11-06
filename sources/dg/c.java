package dg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f8693b;
    public final AudioBufferConverter f8694c = new AudioBufferConverter();
    public long d;
    public int f8695e;
    public int f8696f;
    public int f8697g;
    public int h;
    public ShortBuffer f8698i;
    public boolean f8699j;

    public c(String str) {
        this.f8693b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s5;
        if (this.f8699j) {
            int i7 = this.f8696f;
            if (i7 < this.f8695e) {
                this.f8696f = i7 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f8698i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s5 = this.f8698i.get();
            } else {
                s5 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f8698i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s5;
            }
            this.f8699j = false;
            return s5;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f8693b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f8699j;
    }

    @Override
    public final void d() {
        this.f8698i = null;
        this.f8699j = false;
        AudioDecoder audioDecoder = this.f8693b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8697g = i7;
        this.h = i10;
        this.f8699j = true;
        this.f8693b.start();
        this.f8695e = AudioConversions.usToShorts(this.d, this.f8697g, this.h);
        this.f8696f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f8698i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f8693b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f8698i = this.f8694c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f8697g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f8698i = null;
    }

    public c(String str, int i7) {
        this.f8693b = new AudioDecoder(str, i7);
    }
}
