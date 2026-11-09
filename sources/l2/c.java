package l2;

import android.media.MediaFormat;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class c {
    public static final c f17770b = new c(new HashMap());
    public final Map f17771a;

    public c(HashMap hashMap) {
        this.f17771a = DesugarCollections.unmodifiableMap(hashMap);
    }

    public static gf.g a(MediaFormat mediaFormat, Set set) {
        gf.g gVar = new gf.g();
        HashMap hashMap = (HashMap) gVar.f13889b;
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
        return gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f17771a.equals(((c) obj).f17771a);
    }

    public final int hashCode() {
        return this.f17771a.hashCode();
    }
}
