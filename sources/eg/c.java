package eg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f9971b;
    public final AudioBufferConverter f9972c = new AudioBufferConverter();
    public long d;
    public int f9973e;
    public int f9974f;
    public int f9975g;
    public int h;
    public ShortBuffer f9976i;
    public boolean f9977j;

    public c(String str) {
        this.f9971b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s6;
        if (this.f9977j) {
            int i3 = this.f9974f;
            if (i3 < this.f9973e) {
                this.f9974f = i3 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f9976i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s6 = this.f9976i.get();
            } else {
                s6 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f9976i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s6;
            }
            this.f9977j = false;
            return s6;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f9971b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f9977j;
    }

    @Override
    public final void d() {
        this.f9976i = null;
        this.f9977j = false;
        AudioDecoder audioDecoder = this.f9971b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i3, int i10) {
        this.f9975g = i3;
        this.h = i10;
        this.f9977j = true;
        this.f9971b.start();
        this.f9973e = AudioConversions.usToShorts(this.d, this.f9975g, this.h);
        this.f9974f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f9976i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f9971b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f9976i = this.f9972c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f9975g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f9976i = null;
    }

    public c(String str, int i3) {
        this.f9971b = new AudioDecoder(str, i3);
    }
}
