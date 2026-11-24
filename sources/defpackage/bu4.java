package defpackage;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class bu4 extends h10 {
    public final AudioDecoder b;
    public final AudioBufferConverter c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ShortBuffer i;
    public boolean j;

    public bu4(String str) {
        this.b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s;
        if (this.j) {
            int i = this.f;
            if (i < this.e) {
                this.f = i + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s = this.i.get();
            } else {
                s = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s;
            }
            this.j = false;
            return s;
        }
        zo4.k("Audio input has no remaining value.");
        return (short) 0;
    }

    @Override
    public final int b() {
        return this.b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.j;
    }

    @Override
    public final void d() {
        this.i = null;
        this.j = false;
        AudioDecoder audioDecoder = this.b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i, int i2) {
        this.g = i;
        this.h = i2;
        this.j = true;
        this.b.start();
        this.e = AudioConversions.usToShorts(this.d, this.g, this.h);
        this.f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.i = this.c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.i = null;
    }

    public bu4(String str, int i) {
        this.b = new AudioDecoder(str, i);
    }
}
