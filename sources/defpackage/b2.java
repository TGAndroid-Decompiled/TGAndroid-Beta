package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
public abstract class b2 extends zg0 implements qy0 {
    public zg0 d;
    public final String e;

    public b2(String str) {
        this.a = null;
        this.b = new ArrayList();
        this.e = str;
    }

    public final ByteBuffer d() {
        ByteBuffer wrap;
        int i = (getSize() > 4294967296L ? 1 : (getSize() == 4294967296L ? 0 : -1));
        String str = this.e;
        if (i >= 0) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = str.getBytes()[0];
            bArr[5] = str.getBytes()[1];
            bArr[6] = str.getBytes()[2];
            bArr[7] = str.getBytes()[3];
            wrap = ByteBuffer.wrap(bArr);
            wrap.position(8);
            wrap.putLong(getSize());
        } else {
            wrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, str.getBytes()[0], str.getBytes()[1], str.getBytes()[2], str.getBytes()[3]});
            wrap.putInt((int) getSize());
        }
        wrap.rewind();
        return wrap;
    }

    @Override
    public void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        c(writableByteChannel);
    }

    @Override
    public final qv2 getParent() {
        return this.d;
    }

    @Override
    public long getSize() {
        int i;
        long b = b();
        if (8 + b >= 4294967296L) {
            i = 16;
        } else {
            i = 8;
        }
        return b + i;
    }

    @Override
    public final String getType() {
        return this.e;
    }

    @Override
    public final void setParent(qv2 qv2Var) {
        this.d = (zg0) qv2Var;
    }
}
