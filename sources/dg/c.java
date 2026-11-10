package dg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f8696b;
    public final AudioBufferConverter f8697c = new AudioBufferConverter();
    public long d;
    public int f8698e;
    public int f8699f;
    public int f8700g;
    public int h;
    public ShortBuffer f8701i;
    public boolean f8702j;

    public c(String str) {
        this.f8696b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s5;
        if (this.f8702j) {
            int i7 = this.f8699f;
            if (i7 < this.f8698e) {
                this.f8699f = i7 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f8701i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s5 = this.f8701i.get();
            } else {
                s5 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f8701i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s5;
            }
            this.f8702j = false;
            return s5;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f8696b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f8702j;
    }

    @Override
    public final void d() {
        this.f8701i = null;
        this.f8702j = false;
        AudioDecoder audioDecoder = this.f8696b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8700g = i7;
        this.h = i10;
        this.f8702j = true;
        this.f8696b.start();
        this.f8698e = AudioConversions.usToShorts(this.d, this.f8700g, this.h);
        this.f8699f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f8701i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f8696b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f8701i = this.f8697c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f8700g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f8701i = null;
    }

    public c(String str, int i7) {
        this.f8696b = new AudioDecoder(str, i7);
    }
}
