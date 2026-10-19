package bg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f4349b;
    public final AudioBufferConverter f4350c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f4351f;
    public int f4352g;
    public int h;
    public ShortBuffer f4353i;
    public boolean f4354j;

    public c(String str) {
        this.f4349b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f4354j) {
            int i10 = this.f4351f;
            if (i10 < this.e) {
                this.f4351f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f4353i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f4353i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f4353i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f4354j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f4349b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f4354j;
    }

    @Override
    public final void d() {
        this.f4353i = null;
        this.f4354j = false;
        AudioDecoder audioDecoder = this.f4349b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f4352g = i10;
        this.h = i11;
        this.f4354j = true;
        this.f4349b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f4352g, this.h);
        this.f4351f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f4353i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f4349b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f4353i = this.f4350c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f4352g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f4353i = null;
    }

    public c(String str, int i10) {
        this.f4349b = new AudioDecoder(str, i10);
    }
}
