package lf;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f15214b;
    public final AudioBufferConverter f15215c = new AudioBufferConverter();
    public long d;
    public int f15216e;
    public int f15217f;
    public int f15218g;
    public int h;
    public ShortBuffer f15219i;
    public boolean f15220j;

    public c(String str) {
        this.f15214b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f15220j) {
            int i10 = this.f15217f;
            if (i10 < this.f15216e) {
                this.f15217f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f15219i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f15219i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f15219i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f15220j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f15214b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f15220j;
    }

    @Override
    public final void d() {
        this.f15219i = null;
        this.f15220j = false;
        AudioDecoder audioDecoder = this.f15214b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f15218g = i10;
        this.h = i11;
        this.f15220j = true;
        this.f15214b.start();
        this.f15216e = AudioConversions.usToShorts(this.d, this.f15218g, this.h);
        this.f15217f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f15219i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f15214b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f15219i = this.f15215c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f15218g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f15219i = null;
    }

    public c(String str, int i10) {
        this.f15214b = new AudioDecoder(str, i10);
    }
}
