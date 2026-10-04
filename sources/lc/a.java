package lc;

import com.googlecode.mp4parser.c;
import ii.n4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import mc.k;
public abstract class a extends c {
    public static final Logger f15427f;
    public static final n4 h;
    public ByteBuffer f15428e;

    static {
        re.a aVar = new re.a(a.class, "AbstractDescriptorBox.java");
        aVar.e(aVar.d("getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.nio.ByteBuffer"));
        aVar.e(aVar.d("getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"));
        aVar.e(aVar.d("getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "void"));
        h = aVar.e(aVar.d("setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "void"));
        f15427f = Logger.getLogger(a.class.getName());
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        Logger logger = f15427f;
        f(byteBuffer);
        this.f15428e = byteBuffer.slice();
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
        try {
            this.f15428e.rewind();
            k.a(-1, this.f15428e);
        } catch (IOException e7) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e7);
        } catch (IndexOutOfBoundsException e10) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e10);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        this.f15428e.rewind();
        byteBuffer.put(this.f15428e);
    }

    @Override
    public final long getContentSize() {
        return this.f15428e.limit() + 4;
    }
}
