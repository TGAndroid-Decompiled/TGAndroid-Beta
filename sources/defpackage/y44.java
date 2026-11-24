package defpackage;

import android.util.Log;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;
public class y44 extends InputStream implements DataInput {
    public static final ByteOrder e = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder f = ByteOrder.BIG_ENDIAN;
    public final DataInputStream a;
    public ByteOrder b;
    public int c;
    public byte[] d;

    public y44(int i, InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.b = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.a = dataInputStream;
        dataInputStream.mark(0);
        this.c = 0;
        this.b = byteOrder;
    }

    public final void a(int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.a;
            int skip = (int) dataInputStream.skip(i3);
            if (skip <= 0) {
                if (this.d == null) {
                    this.d = new byte[8192];
                }
                skip = dataInputStream.read(this.d, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException(tb4.n(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += skip;
        }
        this.c += i2;
    }

    @Override
    public final int available() {
        return this.a.available();
    }

    @Override
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override
    public final int read() {
        this.c++;
        return this.a.read();
    }

    @Override
    public final boolean readBoolean() {
        this.c++;
        return this.a.readBoolean();
    }

    @Override
    public final byte readByte() {
        this.c++;
        int read = this.a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public final char readChar() {
        this.c += 2;
        return this.a.readChar();
    }

    @Override
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override
    public final void readFully(byte[] bArr) {
        this.c += bArr.length;
        this.a.readFully(bArr);
    }

    @Override
    public final int readInt() {
        this.c += 4;
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == e) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            w44.e(this.b, "Invalid byte order: ");
            return 0;
        }
        throw new EOFException();
    }

    @Override
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override
    public final long readLong() {
        this.c += 8;
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == e) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            w44.e(this.b, "Invalid byte order: ");
            return 0L;
        }
        throw new EOFException();
    }

    @Override
    public final short readShort() {
        this.c += 2;
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == e) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f) {
                return (short) ((read << 8) + read2);
            }
            w44.e(this.b, "Invalid byte order: ");
            return (short) 0;
        }
        throw new EOFException();
    }

    @Override
    public final String readUTF() {
        this.c += 2;
        return this.a.readUTF();
    }

    @Override
    public final int readUnsignedByte() {
        this.c++;
        return this.a.readUnsignedByte();
    }

    @Override
    public final int readUnsignedShort() {
        this.c += 2;
        DataInputStream dataInputStream = this.a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.b;
            if (byteOrder == e) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f) {
                return (read << 8) + read2;
            }
            w44.e(this.b, "Invalid byte order: ");
            return 0;
        }
        throw new EOFException();
    }

    @Override
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override
    public final void readFully(byte[] bArr, int i, int i2) {
        this.c += i2;
        this.a.readFully(bArr, i, i2);
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        this.c += read;
        return read;
    }

    public y44(InputStream inputStream) {
        this(0, inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public y44(byte[] r2) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y44.<init>(byte[]):void");
    }
}
