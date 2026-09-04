package lc;

import com.googlecode.mp4parser.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import mc.k;
import mg.n;
public abstract class a extends c {
    public static final Logger f15359f;
    public static final n h;
    public ByteBuffer f15360e;

    static {
        re.a aVar = new re.a(a.class, "AbstractDescriptorBox.java");
        aVar.e(aVar.d("getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.nio.ByteBuffer"));
        aVar.e(aVar.d("getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"));
        aVar.e(aVar.d("getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "void"));
        h = aVar.e(aVar.d("setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "void"));
        f15359f = Logger.getLogger(a.class.getName());
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        Logger logger = f15359f;
        f(byteBuffer);
        this.f15360e = byteBuffer.slice();
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
        try {
            this.f15360e.rewind();
            k.a(-1, this.f15360e);
        } catch (IOException e7) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e7);
        } catch (IndexOutOfBoundsException e10) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e10);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        this.f15360e.rewind();
        byteBuffer.put(this.f15360e);
    }

    @Override
    public final long getContentSize() {
        return this.f15360e.limit() + 4;
    }
}
