package dg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f8365b;
    public final AudioBufferConverter f8366c = new AudioBufferConverter();
    public long d;
    public int f8367e;
    public int f8368f;
    public int f8369g;
    public int h;
    public ShortBuffer f8370i;
    public boolean f8371j;

    public c(String str) {
        this.f8365b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s5;
        if (this.f8371j) {
            int i7 = this.f8368f;
            if (i7 < this.f8367e) {
                this.f8368f = i7 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f8370i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s5 = this.f8370i.get();
            } else {
                s5 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f8370i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s5;
            }
            this.f8371j = false;
            return s5;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f8365b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f8371j;
    }

    @Override
    public final void d() {
        this.f8370i = null;
        this.f8371j = false;
        AudioDecoder audioDecoder = this.f8365b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8369g = i7;
        this.h = i10;
        this.f8371j = true;
        this.f8365b.start();
        this.f8367e = AudioConversions.usToShorts(this.d, this.f8369g, this.h);
        this.f8368f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f8370i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f8365b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f8370i = this.f8366c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f8369g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f8370i = null;
    }

    public c(String str, int i7) {
        this.f8365b = new AudioDecoder(str, i7);
    }
}
