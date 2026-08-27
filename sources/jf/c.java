package jf;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;

public final class c extends a {

    public final AudioDecoder f12933b;

    public final AudioBufferConverter f12934c = new AudioBufferConverter();
    public long d;

    public int f12935e;

    public int f12936f;

    public int f12937g;
    public int h;

    public ShortBuffer f12938i;

    public boolean f12939j;

    public c(String str) {
        this.f12933b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        if (!this.f12939j) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        int i10 = this.f12936f;
        if (i10 < this.f12935e) {
            this.f12936f = i10 + 1;
            return (short) 0;
        }
        f();
        ShortBuffer shortBuffer = this.f12938i;
        short s10 = (shortBuffer == null || shortBuffer.remaining() <= 0) ? (short) 0 : this.f12938i.get();
        f();
        ShortBuffer shortBuffer2 = this.f12938i;
        if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
            return s10;
        }
        this.f12939j = false;
        return s10;
    }

    @Override
    public final int b() {
        return this.f12933b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f12939j;
    }

    @Override
    public final void d() {
        this.f12938i = null;
        this.f12939j = false;
        AudioDecoder audioDecoder = this.f12933b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f12937g = i10;
        this.h = i11;
        this.f12939j = true;
        this.f12933b.start();
        this.f12935e = AudioConversions.usToShorts(this.d, this.f12937g, this.h);
        this.f12936f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f12938i;
        if (shortBuffer == null || shortBuffer.remaining() <= 0) {
            AudioDecoder audioDecoder = this.f12933b;
            AudioDecoder.DecodedBufferData decodedBufferDataDecode = audioDecoder.decode();
            if (decodedBufferDataDecode.index < 0) {
                this.f12938i = null;
                return;
            }
            this.f12938i = this.f12934c.convert(decodedBufferDataDecode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f12937g, this.h);
            audioDecoder.releaseOutputBuffer(decodedBufferDataDecode.index);
        }
    }

    public c(String str, int i10) {
        this.f12933b = new AudioDecoder(str, i10);
    }
}
