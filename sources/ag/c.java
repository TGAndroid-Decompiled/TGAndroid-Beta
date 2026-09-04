package ag;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f428b;
    public final AudioBufferConverter f429c = new AudioBufferConverter();
    public long d;
    public int f430e;
    public int f431f;
    public int f432g;
    public int h;
    public ShortBuffer f433i;
    public boolean f434j;

    public c(String str) {
        this.f428b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f434j) {
            int i10 = this.f431f;
            if (i10 < this.f430e) {
                this.f431f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f433i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f433i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f433i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f434j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f428b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f434j;
    }

    @Override
    public final void d() {
        this.f433i = null;
        this.f434j = false;
        AudioDecoder audioDecoder = this.f428b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f432g = i10;
        this.h = i11;
        this.f434j = true;
        this.f428b.start();
        this.f430e = AudioConversions.usToShorts(this.d, this.f432g, this.h);
        this.f431f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f433i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f428b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f433i = this.f429c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f432g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f433i = null;
    }

    public c(String str, int i10) {
        this.f428b = new AudioDecoder(str, i10);
    }
}
