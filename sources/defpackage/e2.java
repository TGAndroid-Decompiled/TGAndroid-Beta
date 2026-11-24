package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class e2 extends g2 {
    public static final Logger f;
    public static final ai4 h;
    public ByteBuffer e;

    static {
        i94 i94Var = new i94(e2.class, "AbstractDescriptorBox.java");
        i94Var.e(i94Var.d("getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.nio.ByteBuffer"));
        i94Var.e(i94Var.d("getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"));
        i94Var.e(i94Var.d("getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.lang.String"));
        i94Var.e(i94Var.d("setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "void"));
        h = i94Var.e(i94Var.d("setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "void"));
        f = Logger.getLogger(e2.class.getName());
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        Logger logger = f;
        f(byteBuffer);
        this.e = byteBuffer.slice();
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
        try {
            this.e.rewind();
            bq7.a(-1, this.e);
        } catch (IOException e) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e);
        } catch (IndexOutOfBoundsException e2) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e2);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        this.e.rewind();
        byteBuffer.put(this.e);
    }

    @Override
    public final long getContentSize() {
        return this.e.limit() + 4;
    }
}
