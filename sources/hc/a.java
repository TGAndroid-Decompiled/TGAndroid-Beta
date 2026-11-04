package hc;

import com.googlecode.mp4parser.c;
import ic.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.ui.Components.i9;
public abstract class a extends c {
    public static final Logger f14387f;
    public static final i9 h;
    public ByteBuffer f14388e;

    static {
        we.a aVar = new we.a(a.class, "AbstractDescriptorBox.java");
        aVar.e(aVar.d("getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.nio.ByteBuffer"));
        aVar.e(aVar.d("getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"));
        aVar.e(aVar.d("getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "void"));
        h = aVar.e(aVar.d("setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "void"));
        f14387f = Logger.getLogger(a.class.getName());
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        Logger logger = f14387f;
        f(byteBuffer);
        this.f14388e = byteBuffer.slice();
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
        try {
            this.f14388e.rewind();
            k.a(-1, this.f14388e);
        } catch (IOException e10) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e10);
        } catch (IndexOutOfBoundsException e11) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e11);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        this.f14388e.rewind();
        byteBuffer.put(this.f14388e);
    }

    @Override
    public final long getContentSize() {
        return this.f14388e.limit() + 4;
    }
}
