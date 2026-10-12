package bg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f2734b;
    public final AudioBufferConverter f2735c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f2736f;
    public int f2737g;
    public int h;
    public ShortBuffer f2738i;
    public boolean f2739j;

    public c(String str) {
        this.f2734b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f2739j) {
            int i10 = this.f2736f;
            if (i10 < this.e) {
                this.f2736f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f2738i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f2738i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f2738i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f2739j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f2734b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f2739j;
    }

    @Override
    public final void d() {
        this.f2738i = null;
        this.f2739j = false;
        AudioDecoder audioDecoder = this.f2734b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f2737g = i10;
        this.h = i11;
        this.f2739j = true;
        this.f2734b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f2737g, this.h);
        this.f2736f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f2738i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f2734b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f2738i = this.f2735c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f2737g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f2738i = null;
    }

    public c(String str, int i10) {
        this.f2734b = new AudioDecoder(str, i10);
    }
}
