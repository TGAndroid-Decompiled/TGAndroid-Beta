package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public abstract class y1 implements iy0 {
    static final boolean $assertionsDisabled = false;
    private static cc6 LOG = cc6.a(y1.class);
    private ByteBuffer content;
    long contentStartPosition;
    n63 dataSource;
    long offset;
    private wu2 parent;
    protected String type;
    private byte[] userType;
    long memMapSize = -1;
    private ByteBuffer deadBytes = null;
    boolean isRead = true;
    boolean isParsed = true;

    public y1(String str) {
        this.type = str;
    }

    public final void a(ByteBuffer byteBuffer) {
        if (b()) {
            byteBuffer.putInt((int) getSize());
            byteBuffer.put(or5.d(getType()));
        } else {
            byteBuffer.putInt(1);
            byteBuffer.put(or5.d(getType()));
            byteBuffer.putLong(getSize());
        }
        if ("uuid".equals(getType())) {
            byteBuffer.put(getUserType());
        }
    }

    public final boolean b() {
        int i;
        int i2;
        if ("uuid".equals(getType())) {
            i = 24;
        } else {
            i = 8;
        }
        if (this.isRead) {
            if (this.isParsed) {
                long contentSize = getContentSize();
                ByteBuffer byteBuffer = this.deadBytes;
                if (byteBuffer != null) {
                    i2 = byteBuffer.limit();
                } else {
                    i2 = 0;
                }
                if (contentSize + i2 + i < 4294967296L) {
                    return true;
                }
                return false;
            } else if (this.content.limit() + i < 4294967296L) {
                return true;
            } else {
                return false;
            }
        } else if (this.memMapSize + i < 4294967296L) {
            return true;
        } else {
            return false;
        }
    }

    public final synchronized void c() {
        if (!this.isRead) {
            try {
                cc6 cc6Var = LOG;
                cc6Var.b("mem mapping " + getType());
                throw null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void getBox(WritableByteChannel writableByteChannel) {
        int i = 8;
        int i2 = 0;
        int i3 = 16;
        if (this.isRead) {
            if (this.isParsed) {
                ByteBuffer allocate = ByteBuffer.allocate(mqd.a(getSize()));
                a(allocate);
                getContent(allocate);
                ByteBuffer byteBuffer = this.deadBytes;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    while (this.deadBytes.remaining() > 0) {
                        allocate.put(this.deadBytes);
                    }
                }
                writableByteChannel.write((ByteBuffer) allocate.rewind());
                return;
            }
            if (!b()) {
                i = 16;
            }
            if (!"uuid".equals(getType())) {
                i3 = 0;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i + i3);
            a(allocate2);
            writableByteChannel.write((ByteBuffer) allocate2.rewind());
            writableByteChannel.write((ByteBuffer) this.content.position(0));
            return;
        }
        if (!b()) {
            i = 16;
        }
        if ("uuid".equals(getType())) {
            i2 = 16;
        }
        ByteBuffer allocate3 = ByteBuffer.allocate(i + i2);
        a(allocate3);
        writableByteChannel.write((ByteBuffer) allocate3.rewind());
        throw null;
    }

    public long getContentSize() {
        return 8L;
    }

    public long getOffset() {
        return this.offset;
    }

    @Override
    public wu2 getParent() {
        return this.parent;
    }

    public String getPath() {
        return ey7.a(this, "");
    }

    @Override
    public long getSize() {
        long j;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.isRead) {
            if (this.isParsed) {
                j = getContentSize();
            } else {
                ByteBuffer byteBuffer = this.content;
                if (byteBuffer != null) {
                    i3 = byteBuffer.limit();
                } else {
                    i3 = 0;
                }
                j = i3;
            }
        } else {
            j = this.memMapSize;
        }
        if (j >= 4294967288L) {
            i = 8;
        } else {
            i = 0;
        }
        int i5 = i + 8;
        if ("uuid".equals(getType())) {
            i2 = 16;
        } else {
            i2 = 0;
        }
        long j2 = j + i5 + i2;
        ByteBuffer byteBuffer2 = this.deadBytes;
        if (byteBuffer2 != null) {
            i4 = byteBuffer2.limit();
        }
        return j2 + i4;
    }

    @Override
    public String getType() {
        return this.type;
    }

    public byte[] getUserType() {
        return this.userType;
    }

    public boolean isParsed() {
        return this.isParsed;
    }

    public void parse(n63 n63Var, ByteBuffer byteBuffer, long j, qy0 qy0Var) {
        long position = n63Var.position();
        this.contentStartPosition = position;
        this.offset = position - byteBuffer.remaining();
        this.memMapSize = j;
        n63Var.position();
        n63Var.m16position();
        this.isRead = false;
        this.isParsed = false;
    }

    public final synchronized void parseDetails() {
        c();
        cc6 cc6Var = LOG;
        cc6Var.b("parsing details of " + getType());
        ByteBuffer byteBuffer = this.content;
        if (byteBuffer != null) {
            this.isParsed = true;
            byteBuffer.rewind();
            _parseDetails(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.deadBytes = byteBuffer.slice();
            }
            this.content = null;
        }
    }

    public void setDeadBytes(ByteBuffer byteBuffer) {
        this.deadBytes = byteBuffer;
    }

    @Override
    public void setParent(wu2 wu2Var) {
        this.parent = wu2Var;
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
    }

    public void getContent(ByteBuffer byteBuffer) {
    }
}
