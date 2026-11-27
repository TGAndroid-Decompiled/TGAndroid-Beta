package defpackage;

import android.media.MediaFormat;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class pk2 {
    public static final pk2 b = new pk2(new HashMap());
    public final Map a;

    public pk2(HashMap hashMap) {
        this.a = DesugarCollections.unmodifiableMap(hashMap);
    }

    public static y99 a(MediaFormat mediaFormat, Set set) {
        y99 y99Var = new y99((byte) 1);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                HashMap hashMap = y99Var.a;
                if (valueTypeForKey != 1) {
                    if (valueTypeForKey != 2) {
                        if (valueTypeForKey != 3) {
                            if (valueTypeForKey != 4) {
                                if (valueTypeForKey == 5) {
                                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                                    if (byteBuffer == null) {
                                        hashMap.put(str, null);
                                    } else {
                                        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                                        allocate.put(byteBuffer.duplicate());
                                        allocate.flip();
                                        hashMap.put(str, allocate);
                                    }
                                }
                            } else {
                                hashMap.put(str, mediaFormat.getString(str));
                            }
                        } else {
                            hashMap.put(str, Float.valueOf(mediaFormat.getFloat(str)));
                        }
                    } else {
                        hashMap.put(str, Long.valueOf(mediaFormat.getLong(str)));
                    }
                } else {
                    hashMap.put(str, Integer.valueOf(mediaFormat.getInteger(str)));
                }
            }
        }
        return y99Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk2)) {
            return false;
        }
        return this.a.equals(((pk2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
