package lc;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class k {
    public static final Logger f18256a = Logger.getLogger(k.class.getName());
    public static final HashMap f18257b = new HashMap();

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
            Map map = (Map) f18257b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i7 : tags) {
                map.put(Integer.valueOf(i7), cls);
            }
            f18257b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static b a(int i7, ByteBuffer byteBuffer) {
        b bVar;
        int k10 = h5.b.k(byteBuffer);
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = f18257b;
        Map map = (Map) hashMap.get(valueOf);
        if (map == null) {
            map = (Map) hashMap.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(k10));
        Logger logger = f18256a;
        if (cls != null && !cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            try {
                bVar = (b) cls.newInstance();
            } catch (Exception e10) {
                logger.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i7 + " and tag " + k10, (Throwable) e10);
                throw new RuntimeException(e10);
            }
        } else {
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i7) + " and tag " + Integer.toHexString(k10) + " found: " + cls);
            bVar = new Object();
        }
        bVar.f18231a = k10;
        int a10 = h5.b.a(byteBuffer.get());
        bVar.f18232b = a10 & 127;
        int i10 = 1;
        while ((a10 >>> 7) == 1) {
            a10 = h5.b.a(byteBuffer.get());
            i10++;
            bVar.f18232b = (bVar.f18232b << 7) | (a10 & 127);
        }
        bVar.f18233c = i10;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(bVar.f18232b);
        bVar.b(slice);
        byteBuffer.position(byteBuffer.position() + bVar.f18232b);
        return bVar;
    }
}
