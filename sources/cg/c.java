package cg;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f6290b;
    public final AudioBufferConverter f6291c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f6292f;
    public int f6293g;
    public int h;
    public ShortBuffer f6294i;
    public boolean f6295j;

    public c(String str) {
        this.f6290b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f6295j) {
            int i10 = this.f6292f;
            if (i10 < this.e) {
                this.f6292f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f6294i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f6294i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f6294i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f6295j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f6290b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f6295j;
    }

    @Override
    public final void d() {
        this.f6294i = null;
        this.f6295j = false;
        AudioDecoder audioDecoder = this.f6290b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f6293g = i10;
        this.h = i11;
        this.f6295j = true;
        this.f6290b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f6293g, this.h);
        this.f6292f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f6294i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f6290b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f6294i = this.f6291c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f6293g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f6294i = null;
    }

    public c(String str, int i10) {
        this.f6290b = new AudioDecoder(str, i10);
    }
}
