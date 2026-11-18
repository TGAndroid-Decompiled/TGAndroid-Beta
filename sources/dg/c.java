package dg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f8362b;
    public final AudioBufferConverter f8363c = new AudioBufferConverter();
    public long d;
    public int f8364e;
    public int f8365f;
    public int f8366g;
    public int h;
    public ShortBuffer f8367i;
    public boolean f8368j;

    public c(String str) {
        this.f8362b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s5;
        if (this.f8368j) {
            int i7 = this.f8365f;
            if (i7 < this.f8364e) {
                this.f8365f = i7 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f8367i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s5 = this.f8367i.get();
            } else {
                s5 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f8367i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s5;
            }
            this.f8368j = false;
            return s5;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f8362b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f8368j;
    }

    @Override
    public final void d() {
        this.f8367i = null;
        this.f8368j = false;
        AudioDecoder audioDecoder = this.f8362b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8366g = i7;
        this.h = i10;
        this.f8368j = true;
        this.f8362b.start();
        this.f8364e = AudioConversions.usToShorts(this.d, this.f8366g, this.h);
        this.f8365f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f8367i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f8362b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f8367i = this.f8363c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f8366g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f8367i = null;
    }

    public c(String str, int i7) {
        this.f8362b = new AudioDecoder(str, i7);
    }
}
