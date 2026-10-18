package bg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f4351b;
    public final AudioBufferConverter f4352c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f4353f;
    public int f4354g;
    public int h;
    public ShortBuffer f4355i;
    public boolean f4356j;

    public c(String str) {
        this.f4351b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f4356j) {
            int i10 = this.f4353f;
            if (i10 < this.e) {
                this.f4353f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f4355i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f4355i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f4355i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f4356j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f4351b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f4356j;
    }

    @Override
    public final void d() {
        this.f4355i = null;
        this.f4356j = false;
        AudioDecoder audioDecoder = this.f4351b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f4354g = i10;
        this.h = i11;
        this.f4356j = true;
        this.f4351b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f4354g, this.h);
        this.f4353f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f4355i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f4351b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f4355i = this.f4352c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f4354g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f4355i = null;
    }

    public c(String str, int i10) {
        this.f4351b = new AudioDecoder(str, i10);
    }
}
