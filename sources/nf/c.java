package nf;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f14963b;
    public final AudioBufferConverter f14964c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f14965f;
    public int f14966g;
    public int h;
    public ShortBuffer f14967i;
    public boolean f14968j;

    public c(String str) {
        this.f14963b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s6;
        if (this.f14968j) {
            int i10 = this.f14965f;
            if (i10 < this.e) {
                this.f14965f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f14967i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s6 = this.f14967i.get();
            } else {
                s6 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f14967i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s6;
            }
            this.f14968j = false;
            return s6;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f14963b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f14968j;
    }

    @Override
    public final void d() {
        this.f14967i = null;
        this.f14968j = false;
        AudioDecoder audioDecoder = this.f14963b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f14966g = i10;
        this.h = i11;
        this.f14968j = true;
        this.f14963b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f14966g, this.h);
        this.f14965f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f14967i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f14963b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f14967i = this.f14964c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f14966g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f14967i = null;
    }

    public c(String str, int i10) {
        this.f14963b = new AudioDecoder(str, i10);
    }
}
