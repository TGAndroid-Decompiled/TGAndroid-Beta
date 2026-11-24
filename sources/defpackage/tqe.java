package defpackage;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
public abstract class tqe {
    public static void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void b(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(hg9.j(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
