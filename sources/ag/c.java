package ag;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f440b;
    public final AudioBufferConverter f441c = new AudioBufferConverter();
    public long d;
    public int f442e;
    public int f443f;
    public int f444g;
    public int h;
    public ShortBuffer f445i;
    public boolean f446j;

    public c(String str) {
        this.f440b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f446j) {
            int i10 = this.f443f;
            if (i10 < this.f442e) {
                this.f443f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f445i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f445i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f445i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f446j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f440b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f446j;
    }

    @Override
    public final void d() {
        this.f445i = null;
        this.f446j = false;
        AudioDecoder audioDecoder = this.f440b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f444g = i10;
        this.h = i11;
        this.f446j = true;
        this.f440b.start();
        this.f442e = AudioConversions.usToShorts(this.d, this.f444g, this.h);
        this.f443f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f445i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f440b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f445i = this.f441c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f444g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f445i = null;
    }

    public c(String str, int i10) {
        this.f440b = new AudioDecoder(str, i10);
    }
}
