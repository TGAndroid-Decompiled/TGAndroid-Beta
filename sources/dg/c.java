package dg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f8394b;
    public final AudioBufferConverter f8395c = new AudioBufferConverter();
    public long d;
    public int f8396e;
    public int f8397f;
    public int f8398g;
    public int h;
    public ShortBuffer f8399i;
    public boolean f8400j;

    public c(String str) {
        this.f8394b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s5;
        if (this.f8400j) {
            int i7 = this.f8397f;
            if (i7 < this.f8396e) {
                this.f8397f = i7 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f8399i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s5 = this.f8399i.get();
            } else {
                s5 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f8399i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s5;
            }
            this.f8400j = false;
            return s5;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f8394b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f8400j;
    }

    @Override
    public final void d() {
        this.f8399i = null;
        this.f8400j = false;
        AudioDecoder audioDecoder = this.f8394b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8398g = i7;
        this.h = i10;
        this.f8400j = true;
        this.f8394b.start();
        this.f8396e = AudioConversions.usToShorts(this.d, this.f8398g, this.h);
        this.f8397f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f8399i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f8394b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f8399i = this.f8395c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f8398g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f8399i = null;
    }

    public c(String str, int i7) {
        this.f8394b = new AudioDecoder(str, i7);
    }
}
