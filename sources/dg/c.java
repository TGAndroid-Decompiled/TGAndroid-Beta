package dg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f8357b;
    public final AudioBufferConverter f8358c = new AudioBufferConverter();
    public long d;
    public int f8359e;
    public int f8360f;
    public int f8361g;
    public int h;
    public ShortBuffer f8362i;
    public boolean f8363j;

    public c(String str) {
        this.f8357b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s5;
        if (this.f8363j) {
            int i7 = this.f8360f;
            if (i7 < this.f8359e) {
                this.f8360f = i7 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f8362i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s5 = this.f8362i.get();
            } else {
                s5 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f8362i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s5;
            }
            this.f8363j = false;
            return s5;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f8357b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f8363j;
    }

    @Override
    public final void d() {
        this.f8362i = null;
        this.f8363j = false;
        AudioDecoder audioDecoder = this.f8357b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8361g = i7;
        this.h = i10;
        this.f8363j = true;
        this.f8357b.start();
        this.f8359e = AudioConversions.usToShorts(this.d, this.f8361g, this.h);
        this.f8360f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f8362i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f8357b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f8362i = this.f8358c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f8361g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f8362i = null;
    }

    public c(String str, int i7) {
        this.f8357b = new AudioDecoder(str, i7);
    }
}
