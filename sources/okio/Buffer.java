package okio;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    Segment head;
    long size;

    @Override
    public Buffer buffer() {
        return this;
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    public final long size() {
        return this.size;
    }

    public boolean exhausted() {
        return this.size == 0;
    }

    @Override
    public boolean request(long j) {
        return this.size >= j;
    }

    public byte readByte() {
        long j = this.size;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        Segment segment = this.head;
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b = segment.data[i];
        this.size = j - 1;
        if (i3 == i2) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i3;
        }
        return b;
    }

    public final byte getByte(long j) {
        int i;
        Util.checkOffsetAndCount(this.size, j, 1L);
        long j2 = this.size;
        if (j2 - j > j) {
            Segment segment = this.head;
            while (true) {
                int i2 = segment.limit;
                int i3 = segment.pos;
                long j3 = i2 - i3;
                if (j >= j3) {
                    j -= j3;
                    segment = segment.next;
                } else {
                    return segment.data[i3 + ((int) j)];
                }
            }
        } else {
            long j4 = j - j2;
            Segment segment2 = this.head;
            do {
                segment2 = segment2.prev;
                int i4 = segment2.limit;
                i = segment2.pos;
                j4 += i4 - i;
            } while (j4 < 0);
            return segment2.data[i + ((int) j4)];
        }
    }

    public int readInt() {
        long j = this.size;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.size);
        }
        Segment segment = this.head;
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.size = j - 4;
        if (i8 == i2) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i8;
        }
        return i9;
    }

    public ByteString readByteString() {
        return new ByteString(readByteArray());
    }

    @Override
    public int select(Options options) {
        int selectPrefix = selectPrefix(options, false);
        if (selectPrefix == -1) {
            return -1;
        }
        try {
            skip(options.byteStrings[selectPrefix].size());
            return selectPrefix;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public int selectPrefix(okio.Options r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.selectPrefix(okio.Options, boolean):int");
    }

    public String readUtf8() {
        try {
            return readString(this.size, Util.UTF_8);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String readUtf8(long j) throws EOFException {
        return readString(j, Util.UTF_8);
    }

    public String readString(long j, Charset charset) throws EOFException {
        Util.checkOffsetAndCount(this.size, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
            } else if (j == 0) {
                return "";
            } else {
                Segment segment = this.head;
                int i = segment.pos;
                if (i + j > segment.limit) {
                    return new String(readByteArray(j), charset);
                }
                String str = new String(segment.data, i, (int) j, charset);
                int i2 = (int) (segment.pos + j);
                segment.pos = i2;
                this.size -= j;
                if (i2 == segment.limit) {
                    this.head = segment.pop();
                    SegmentPool.recycle(segment);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    public byte[] readByteArray() {
        try {
            return readByteArray(this.size);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public byte[] readByteArray(long j) throws EOFException {
        Util.checkOffsetAndCount(this.size, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        Util.checkOffsetAndCount(bArr.length, i, i2);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.limit - segment.pos);
        System.arraycopy(segment.data, segment.pos, bArr, i, min);
        int i3 = segment.pos + min;
        segment.pos = i3;
        this.size -= min;
        if (i3 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    @Override
    public int read(ByteBuffer byteBuffer) throws IOException {
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, min);
        int i = segment.pos + min;
        segment.pos = i;
        this.size -= min;
        if (i == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    public final void clear() {
        try {
            skip(this.size);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public void skip(long j) throws EOFException {
        Segment segment;
        while (j > 0) {
            if (this.head == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, segment.limit - segment.pos);
            long j2 = min;
            this.size -= j2;
            j -= j2;
            Segment segment2 = this.head;
            int i = segment2.pos + min;
            segment2.pos = i;
            if (i == segment2.limit) {
                this.head = segment2.pop();
                SegmentPool.recycle(segment2);
            }
        }
    }

    @Override
    public Buffer writeUtf8(String str) {
        return writeUtf8(str, 0, str.length());
    }

    @Override
    public Buffer writeUtf8(String str, int i, int i2) {
        if (str != null) {
            if (i < 0) {
                throw new IllegalArgumentException("beginIndex < 0: " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            } else if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            } else {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt < 128) {
                        Segment writableSegment = writableSegment(1);
                        byte[] bArr = writableSegment.data;
                        int i3 = writableSegment.limit - i;
                        int min = Math.min(i2, 8192 - i3);
                        int i4 = i + 1;
                        bArr[i + i3] = (byte) charAt;
                        while (i4 < min) {
                            char charAt2 = str.charAt(i4);
                            if (charAt2 >= 128) {
                                break;
                            }
                            bArr[i4 + i3] = (byte) charAt2;
                            i4++;
                        }
                        int i5 = writableSegment.limit;
                        int i6 = (i3 + i4) - i5;
                        writableSegment.limit = i5 + i6;
                        this.size += i6;
                        i = i4;
                    } else {
                        if (charAt < 2048) {
                            writeByte((charAt >> 6) | 192);
                            writeByte((charAt & '?') | 128);
                        } else if (charAt < 55296 || charAt > 57343) {
                            writeByte((charAt >> '\f') | 224);
                            writeByte(((charAt >> 6) & 63) | 128);
                            writeByte((charAt & '?') | 128);
                        } else {
                            int i7 = i + 1;
                            char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                            if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                writeByte(63);
                                i = i7;
                            } else {
                                int i8 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                                writeByte((i8 >> 18) | 240);
                                writeByte(((i8 >> 12) & 63) | 128);
                                writeByte(((i8 >> 6) & 63) | 128);
                                writeByte((i8 & 63) | 128);
                                i += 2;
                            }
                        }
                        i++;
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    @Override
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            Segment writableSegment = writableSegment(1);
            int min = Math.min(i, 8192 - writableSegment.limit);
            byteBuffer.get(writableSegment.data, writableSegment.limit, min);
            i -= min;
            writableSegment.limit += min;
        }
        this.size += remaining;
        return remaining;
    }

    @Override
    public Buffer writeByte(int i) {
        Segment writableSegment = writableSegment(1);
        byte[] bArr = writableSegment.data;
        int i2 = writableSegment.limit;
        writableSegment.limit = i2 + 1;
        bArr[i2] = (byte) i;
        this.size++;
        return this;
    }

    public Buffer writeInt(int i) {
        Segment writableSegment = writableSegment(4);
        byte[] bArr = writableSegment.data;
        int i2 = writableSegment.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        writableSegment.limit = i5 + 1;
        this.size += 4;
        return this;
    }

    public Segment writableSegment(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        Segment segment = this.head;
        if (segment == null) {
            Segment take = SegmentPool.take();
            this.head = take;
            take.prev = take;
            take.next = take;
            return take;
        }
        Segment segment2 = segment.prev;
        return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
    }

    public void write(Buffer buffer, long j) {
        if (buffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (buffer == this) {
            throw new IllegalArgumentException("source == this");
        }
        Util.checkOffsetAndCount(buffer.size, 0L, j);
        while (j > 0) {
            Segment segment = buffer.head;
            if (j < segment.limit - segment.pos) {
                Segment segment2 = this.head;
                Segment segment3 = segment2 != null ? segment2.prev : null;
                if (segment3 != null && segment3.owner) {
                    if ((segment3.limit + j) - (segment3.shared ? 0 : segment3.pos) <= 8192) {
                        segment.writeTo(segment3, (int) j);
                        buffer.size -= j;
                        this.size += j;
                        return;
                    }
                }
                buffer.head = segment.split((int) j);
            }
            Segment segment4 = buffer.head;
            long j2 = segment4.limit - segment4.pos;
            buffer.head = segment4.pop();
            Segment segment5 = this.head;
            if (segment5 == null) {
                this.head = segment4;
                segment4.prev = segment4;
                segment4.next = segment4;
            } else {
                segment5.prev.push(segment4).compact();
            }
            buffer.size -= j2;
            this.size += j2;
            j -= j2;
        }
    }

    @Override
    public long read(Buffer buffer, long j) {
        if (buffer != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            long j2 = this.size;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            buffer.write(this, j);
            return j;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override
    public long indexOf(ByteString byteString) throws IOException {
        return indexOf(byteString, 0L);
    }

    public long indexOf(ByteString byteString, long j) throws IOException {
        byte[] bArr;
        if (byteString.size() != 0) {
            long j2 = 0;
            if (j < 0) {
                throw new IllegalArgumentException("fromIndex < 0");
            }
            Segment segment = this.head;
            long j3 = -1;
            if (segment == null) {
                return -1L;
            }
            long j4 = this.size;
            if (j4 - j < j) {
                while (j4 > j) {
                    segment = segment.prev;
                    j4 -= segment.limit - segment.pos;
                }
            } else {
                while (true) {
                    long j5 = (segment.limit - segment.pos) + j2;
                    if (j5 >= j) {
                        break;
                    }
                    segment = segment.next;
                    j2 = j5;
                }
                j4 = j2;
            }
            byte b = byteString.getByte(0);
            int size = byteString.size();
            long j6 = 1 + (this.size - size);
            long j7 = j;
            Segment segment2 = segment;
            long j8 = j4;
            while (j8 < j6) {
                byte[] bArr2 = segment2.data;
                int min = (int) Math.min(segment2.limit, (segment2.pos + j6) - j8);
                int i = (int) ((segment2.pos + j7) - j8);
                while (i < min) {
                    if (bArr2[i] == b) {
                        bArr = bArr2;
                        if (rangeEquals(segment2, i + 1, byteString, 1, size)) {
                            return (i - segment2.pos) + j8;
                        }
                    } else {
                        bArr = bArr2;
                    }
                    i++;
                    bArr2 = bArr;
                }
                j8 += segment2.limit - segment2.pos;
                segment2 = segment2.next;
                j7 = j8;
                j3 = -1;
            }
            return j3;
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    @Override
    public long indexOfElement(ByteString byteString) {
        return indexOfElement(byteString, 0L);
    }

    public long indexOfElement(ByteString byteString, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        long j3 = this.size;
        if (j3 - j < j) {
            while (j3 > j) {
                segment = segment.prev;
                j3 -= segment.limit - segment.pos;
            }
        } else {
            while (true) {
                long j4 = (segment.limit - segment.pos) + j2;
                if (j4 >= j) {
                    break;
                }
                segment = segment.next;
                j2 = j4;
            }
            j3 = j2;
        }
        if (byteString.size() == 2) {
            byte b = byteString.getByte(0);
            byte b2 = byteString.getByte(1);
            while (j3 < this.size) {
                byte[] bArr = segment.data;
                i = (int) ((segment.pos + j) - j3);
                int i3 = segment.limit;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (b3 == b || b3 == b2) {
                        i2 = segment.pos;
                        return (i - i2) + j3;
                    }
                    i++;
                }
                j3 += segment.limit - segment.pos;
                segment = segment.next;
                j = j3;
            }
            return -1L;
        }
        byte[] internalArray = byteString.internalArray();
        while (j3 < this.size) {
            byte[] bArr2 = segment.data;
            i = (int) ((segment.pos + j) - j3);
            int i4 = segment.limit;
            while (i < i4) {
                byte b4 = bArr2[i];
                for (byte b5 : internalArray) {
                    if (b4 == b5) {
                        i2 = segment.pos;
                        return (i - i2) + j3;
                    }
                }
                i++;
            }
            j3 += segment.limit - segment.pos;
            segment = segment.next;
            j = j3;
        }
        return -1L;
    }

    private boolean rangeEquals(Segment segment, int i, ByteString byteString, int i2, int i3) {
        int i4 = segment.limit;
        byte[] bArr = segment.data;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.next;
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i = segment.pos;
                i4 = segment.limit;
            }
            if (bArr[i] != byteString.getByte(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            long j = this.size;
            if (j != buffer.size) {
                return false;
            }
            long j2 = 0;
            if (j == 0) {
                return true;
            }
            Segment segment = this.head;
            Segment segment2 = buffer.head;
            int i = segment.pos;
            int i2 = segment2.pos;
            while (j2 < this.size) {
                long min = Math.min(segment.limit - i, segment2.limit - i2);
                int i3 = 0;
                while (i3 < min) {
                    int i4 = i + 1;
                    int i5 = i2 + 1;
                    if (segment.data[i] != segment2.data[i2]) {
                        return false;
                    }
                    i3++;
                    i = i4;
                    i2 = i5;
                }
                if (i == segment.limit) {
                    segment = segment.next;
                    i = segment.pos;
                }
                if (i2 == segment2.limit) {
                    segment2 = segment2.next;
                    i2 = segment2.pos;
                }
                j2 += min;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
        } while (segment != this.head);
        return i;
    }

    public String toString() {
        return snapshot().toString();
    }

    public Buffer clone() {
        Buffer buffer = new Buffer();
        if (this.size == 0) {
            return buffer;
        }
        Segment sharedCopy = this.head.sharedCopy();
        buffer.head = sharedCopy;
        sharedCopy.prev = sharedCopy;
        sharedCopy.next = sharedCopy;
        Segment segment = this.head;
        while (true) {
            segment = segment.next;
            if (segment != this.head) {
                buffer.head.prev.push(segment.sharedCopy());
            } else {
                buffer.size = this.size;
                return buffer;
            }
        }
    }

    public final ByteString snapshot() {
        long j = this.size;
        if (j > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.size);
        }
        return snapshot((int) j);
    }

    public final ByteString snapshot(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        return new SegmentedByteString(this, i);
    }
}
