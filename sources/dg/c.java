package dg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f8356b;
    public final AudioBufferConverter f8357c = new AudioBufferConverter();
    public long d;
    public int f8358e;
    public int f8359f;
    public int f8360g;
    public int h;
    public ShortBuffer f8361i;
    public boolean f8362j;

    public c(String str) {
        this.f8356b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s5;
        if (this.f8362j) {
            int i7 = this.f8359f;
            if (i7 < this.f8358e) {
                this.f8359f = i7 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f8361i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s5 = this.f8361i.get();
            } else {
                s5 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f8361i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s5;
            }
            this.f8362j = false;
            return s5;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f8356b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f8362j;
    }

    @Override
    public final void d() {
        this.f8361i = null;
        this.f8362j = false;
        AudioDecoder audioDecoder = this.f8356b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8360g = i7;
        this.h = i10;
        this.f8362j = true;
        this.f8356b.start();
        this.f8358e = AudioConversions.usToShorts(this.d, this.f8360g, this.h);
        this.f8359f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f8361i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f8356b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f8361i = this.f8357c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f8360g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f8361i = null;
    }

    public c(String str, int i7) {
        this.f8356b = new AudioDecoder(str, i7);
    }
}
