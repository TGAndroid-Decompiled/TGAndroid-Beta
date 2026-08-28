package hf;

import java.nio.ShortBuffer;
import org.telegram.messenger.video.AudioBufferConverter;
import org.telegram.messenger.video.AudioConversions;
import org.telegram.messenger.video.AudioDecoder;
public final class c extends a {
    public final AudioDecoder f10519b;
    public final AudioBufferConverter f10520c = new AudioBufferConverter();
    public long d;
    public int f10521e;
    public int f10522f;
    public int f10523g;
    public int h;
    public ShortBuffer f10524i;
    public boolean f10525j;

    public c(String str) {
        this.f10519b = new AudioDecoder(str);
    }

    @Override
    public final short a() {
        short s10;
        if (this.f10525j) {
            int i9 = this.f10522f;
            if (i9 < this.f10521e) {
                this.f10522f = i9 + 1;
                return (short) 0;
            }
            f();
            ShortBuffer shortBuffer = this.f10524i;
            if (shortBuffer != null && shortBuffer.remaining() > 0) {
                s10 = this.f10524i.get();
            } else {
                s10 = 0;
            }
            f();
            ShortBuffer shortBuffer2 = this.f10524i;
            if (shortBuffer2 != null && shortBuffer2.remaining() >= 1) {
                return s10;
            }
            this.f10525j = false;
            return s10;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return this.f10519b.getSampleRate();
    }

    @Override
    public final boolean c() {
        return this.f10525j;
    }

    @Override
    public final void d() {
        this.f10524i = null;
        this.f10525j = false;
        AudioDecoder audioDecoder = this.f10519b;
        audioDecoder.stop();
        audioDecoder.release();
    }

    @Override
    public final void e(int i9, int i10) {
        this.f10523g = i9;
        this.h = i10;
        this.f10525j = true;
        this.f10519b.start();
        this.f10521e = AudioConversions.usToShorts(this.d, this.f10523g, this.h);
        this.f10522f = 0;
    }

    public final void f() {
        ShortBuffer shortBuffer = this.f10524i;
        if (shortBuffer != null && shortBuffer.remaining() > 0) {
            return;
        }
        AudioDecoder audioDecoder = this.f10519b;
        AudioDecoder.DecodedBufferData decode = audioDecoder.decode();
        if (decode.index >= 0) {
            this.f10524i = this.f10520c.convert(decode.byteBuffer.asShortBuffer(), audioDecoder.getSampleRate(), audioDecoder.getChannelCount(), this.f10523g, this.h);
            audioDecoder.releaseOutputBuffer(decode.index);
            return;
        }
        this.f10524i = null;
    }

    public c(String str, int i9) {
        this.f10519b = new AudioDecoder(str, i9);
    }
}
