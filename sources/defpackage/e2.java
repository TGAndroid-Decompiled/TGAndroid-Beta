package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class e2 extends g2 {
    public static final Logger f;
    public static final z24 h;
    public ByteBuffer e;

    static {
        z74 z74Var = new z74(e2.class, "AbstractDescriptorBox.java");
        z74Var.e(z74Var.d("getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.nio.ByteBuffer"));
        z74Var.e(z74Var.d("getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"));
        z74Var.e(z74Var.d("getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.lang.String"));
        z74Var.e(z74Var.d("setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "void"));
        h = z74Var.e(z74Var.d("setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "void"));
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
            yn7.a(-1, this.e);
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
