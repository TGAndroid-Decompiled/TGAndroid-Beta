package bg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f4354b;
    public final AudioBufferConverter f4355c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f4356f;
    public int f4357g;
    public int h;
    public ShortBuffer f4358i;
    public boolean f4359j;

    public c(String str) {
        this.f4354b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f4359j) {
            int i10 = this.f4356f;
            if (i10 < this.e) {
                this.f4356f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f4358i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f4358i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f4358i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f4359j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f4354b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f4359j;
    }

    @Override
    public final void d() {
        this.f4358i = null;
        this.f4359j = false;
        AudioDecoder audioDecoder = this.f4354b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f4357g = i10;
        this.h = i11;
        this.f4359j = true;
        this.f4354b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f4357g, this.h);
        this.f4356f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f4358i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f4354b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f4358i = this.f4355c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f4357g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f4358i = null;
    }

    public c(String str, int i10) {
        this.f4354b = new AudioDecoder(str, i10);
    }
}
