package dg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f8391b;
    public final AudioBufferConverter f8392c = new AudioBufferConverter();
    public long d;
    public int f8393e;
    public int f8394f;
    public int f8395g;
    public int h;
    public ShortBuffer f8396i;
    public boolean f8397j;

    public c(String str) {
        this.f8391b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s5;
        if (this.f8397j) {
            int i7 = this.f8394f;
            if (i7 < this.f8393e) {
                this.f8394f = i7 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f8396i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s5 = this.f8396i.get();
            } else {
                s5 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f8396i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s5;
            }
            this.f8397j = false;
            return s5;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f8391b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f8397j;
    }

    @Override
    public final void d() {
        this.f8396i = null;
        this.f8397j = false;
        AudioDecoder audioDecoder = this.f8391b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8395g = i7;
        this.h = i10;
        this.f8397j = true;
        this.f8391b.start();
        this.f8393e = AudioConversions.usToShorts(this.d, this.f8395g, this.h);
        this.f8394f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f8396i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f8391b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f8396i = this.f8392c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f8395g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f8396i = null;
    }

    public c(String str, int i7) {
        this.f8391b = new AudioDecoder(str, i7);
    }
}
