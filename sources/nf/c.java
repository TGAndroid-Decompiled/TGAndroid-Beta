package nf;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f15985b;
    public final AudioBufferConverter f15986c = new AudioBufferConverter();
    public long d;
    public int f15987e;
    public int f15988f;
    public int f15989g;
    public int h;
    public ShortBuffer f15990i;
    public boolean f15991j;

    public c(String str) {
        this.f15985b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s6;
        if (this.f15991j) {
            int i10 = this.f15988f;
            if (i10 < this.f15987e) {
                this.f15988f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f15990i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s6 = this.f15990i.get();
            } else {
                s6 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f15990i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s6;
            }
            this.f15991j = false;
            return s6;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f15985b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f15991j;
    }

    @Override
    public final void d() {
        this.f15990i = null;
        this.f15991j = false;
        AudioDecoder audioDecoder = this.f15985b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f15989g = i10;
        this.h = i11;
        this.f15991j = true;
        this.f15985b.start();
        this.f15987e = AudioConversions.usToShorts(this.d, this.f15989g, this.h);
        this.f15988f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f15990i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f15985b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f15990i = this.f15986c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f15989g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f15990i = null;
    }

    public c(String str, int i10) {
        this.f15985b = new AudioDecoder(str, i10);
    }
}
