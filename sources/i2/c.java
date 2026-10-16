package i2;

import android.media.MediaFormat;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class c {
    public static final c f10931b = new c(new HashMap());
    public final Map f10932a;

    public c(HashMap hashMap) {
        this.f10932a = DesugarCollections.unmodifiableMap(hashMap);
    }

    public static a4.l a(MediaFormat mediaFormat, Set set) {
        a4.l lVar = new a4.l(25);
        HashMap hashMap = (HashMap) lVar.f279b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
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
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f10932a.equals(((c) obj).f10932a);
    }

    public final int hashCode() {
        return this.f10932a.hashCode();
    }
}
