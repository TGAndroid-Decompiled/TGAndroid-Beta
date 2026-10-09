package ag;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f529b;
    public final AudioBufferConverter f530c = new AudioBufferConverter();
    public long d;
    public int f531e;
    public int f532f;
    public int f533g;
    public int h;
    public ShortBuffer f534i;
    public boolean f535j;

    public c(String str) {
        this.f529b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f535j) {
            int i10 = this.f532f;
            if (i10 < this.f531e) {
                this.f532f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f534i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f534i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f534i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f535j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f529b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f535j;
    }

    @Override
    public final void d() {
        this.f534i = null;
        this.f535j = false;
        AudioDecoder audioDecoder = this.f529b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f533g = i10;
        this.h = i11;
        this.f535j = true;
        this.f529b.start();
        this.f531e = AudioConversions.usToShorts(this.d, this.f533g, this.h);
        this.f532f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f534i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f529b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f534i = this.f530c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f533g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f534i = null;
    }

    public c(String str, int i10) {
        this.f529b = new AudioDecoder(str, i10);
    }
}
