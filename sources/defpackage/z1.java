package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public abstract class z1 implements qy0 {
    static final boolean $assertionsDisabled = false;
    private static ge6 LOG = ge6.a(z1.class);
    private ByteBuffer content;
    long contentStartPosition;
    g73 dataSource;
    long offset;
    private qv2 parent;
    protected String type;
    private byte[] userType;
    long memMapSize = -1;
    private ByteBuffer deadBytes = null;
    boolean isRead = true;
    boolean isParsed = true;

    public z1(String str) {
        this.type = str;
    }

    public final void a(ByteBuffer byteBuffer) {
        if (b()) {
            byteBuffer.putInt((int) getSize());
            byteBuffer.put(qt5.d(getType()));
        } else {
            byteBuffer.putInt(1);
            byteBuffer.put(qt5.d(getType()));
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
                ge6 ge6Var = LOG;
                ge6Var.b("mem mapping " + getType());
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
                ByteBuffer allocate = ByteBuffer.allocate(cvd.a(getSize()));
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
    public qv2 getParent() {
        return this.parent;
    }

    public String getPath() {
        return k18.a(this, "");
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

    public void parse(g73 g73Var, ByteBuffer byteBuffer, long j, yy0 yy0Var) {
        long position = g73Var.position();
        this.contentStartPosition = position;
        this.offset = position - byteBuffer.remaining();
        this.memMapSize = j;
        g73Var.position();
        g73Var.m9position();
        this.isRead = false;
        this.isParsed = false;
    }

    public final synchronized void parseDetails() {
        c();
        ge6 ge6Var = LOG;
        ge6Var.b("parsing details of " + getType());
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
    public void setParent(qv2 qv2Var) {
        this.parent = qv2Var;
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
    }

    public void getContent(ByteBuffer byteBuffer) {
    }
}
