package mc;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class k {
    public static final Logger f14795a = Logger.getLogger(k.class.getName());
    public static final HashMap f14796b = new HashMap();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(e.class);
        hashSet.add(m.class);
        hashSet.add(b.class);
        hashSet.add(h.class);
        hashSet.add(j.class);
        hashSet.add(l.class);
        hashSet.add(a.class);
        hashSet.add(i.class);
        hashSet.add(g.class);
        hashSet.add(d.class);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            f fVar = (f) cls.getAnnotation(f.class);
            int[] tags = fVar.tags();
            int objectTypeIndication = fVar.objectTypeIndication();
            Map map = (Map) f14796b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i10 : tags) {
                map.put(Integer.valueOf(i10), cls);
            }
            f14796b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static b a(int i10, ByteBuffer byteBuffer) {
        b bVar;
        int k10 = e5.b.k(byteBuffer);
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = f14796b;
        Map map = (Map) hashMap.get(valueOf);
        if (map == null) {
            map = (Map) hashMap.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(k10));
        Logger logger = f14795a;
        if (cls != null && !cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            try {
                bVar = (b) cls.newInstance();
            } catch (Exception e) {
                Level level = Level.SEVERE;
                logger.log(level, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i10 + " and tag " + k10, (Throwable) e);
                throw new RuntimeException(e);
            }
        } else {
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i10) + " and tag " + Integer.toHexString(k10) + " found: " + cls);
            bVar = new Object();
        }
        bVar.f14772a = k10;
        int a2 = e5.b.a(byteBuffer.get());
        bVar.f14773b = a2 & 127;
        int i11 = 1;
        while ((a2 >>> 7) == 1) {
            a2 = e5.b.a(byteBuffer.get());
            i11++;
            bVar.f14773b = (bVar.f14773b << 7) | (a2 & 127);
        }
        bVar.f14774c = i11;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(bVar.f14773b);
        bVar.b(slice);
        byteBuffer.position(byteBuffer.position() + bVar.f14773b);
        return bVar;
    }
}
