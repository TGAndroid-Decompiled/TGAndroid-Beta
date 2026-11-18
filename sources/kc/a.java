package kc;

import com.googlecode.mp4parser.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import lc.k;
public abstract class a extends c {
    public static final Logger f18205f;
    public static final ze.b h;
    public ByteBuffer f18206e;

    static {
        ze.a aVar = new ze.a(a.class, "AbstractDescriptorBox.java");
        aVar.e(aVar.d("getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.nio.ByteBuffer"));
        aVar.e(aVar.d("getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"));
        aVar.e(aVar.d("getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "void"));
        h = aVar.e(aVar.d("setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "void"));
        f18205f = Logger.getLogger(a.class.getName());
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        Logger logger = f18205f;
        f(byteBuffer);
        this.f18206e = byteBuffer.slice();
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
        try {
            this.f18206e.rewind();
            k.a(-1, this.f18206e);
        } catch (IOException e10) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e10);
        } catch (IndexOutOfBoundsException e11) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e11);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        this.f18206e.rewind();
        byteBuffer.put(this.f18206e);
    }

    @Override
    public final long getContentSize() {
        return this.f18206e.limit() + 4;
    }
}
