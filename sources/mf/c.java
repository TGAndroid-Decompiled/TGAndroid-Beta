package mf;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f13915b;
    public final AudioBufferConverter f13916c = new AudioBufferConverter();
    public long d;
    public int e;
    public int f13917f;
    public int f13918g;
    public int h;
    public ShortBuffer f13919i;
    public boolean f13920j;

    public c(String str) {
        this.f13915b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s6;
        if (this.f13920j) {
            int i10 = this.f13917f;
            if (i10 < this.e) {
                this.f13917f = i10 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f13919i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s6 = this.f13919i.get();
            } else {
                s6 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f13919i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s6;
            }
            this.f13920j = false;
            return s6;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f13915b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f13920j;
    }

    @Override
    public final void d() {
        this.f13919i = null;
        this.f13920j = false;
        AudioDecoder audioDecoder = this.f13915b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i10, int i11) {
        this.f13918g = i10;
        this.h = i11;
        this.f13920j = true;
        this.f13915b.start();
        this.e = AudioConversions.usToShorts(this.d, this.f13918g, this.h);
        this.f13917f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f13919i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f13915b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f13919i = this.f13916c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f13918g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f13919i = null;
    }

    public c(String str, int i10) {
        this.f13915b = new AudioDecoder(str, i10);
    }
}
