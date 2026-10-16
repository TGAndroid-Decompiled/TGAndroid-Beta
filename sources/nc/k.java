package nc;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class k {
    public static final Logger f15997a = Logger.getLogger(k.class.getName());
    public static final HashMap f15998b = new HashMap();

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
            Map map = (Map) f15998b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i10 : tags) {
                map.put(Integer.valueOf(i10), cls);
            }
            f15998b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static b a(int i10, ByteBuffer byteBuffer) {
        b bVar;
        int k10 = e5.b.k(byteBuffer);
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = f15998b;
        Map map = (Map) hashMap.get(valueOf);
        if (map == null) {
            map = (Map) hashMap.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(k10));
        Logger logger = f15997a;
        if (cls != null && !cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            try {
                bVar = (b) cls.newInstance();
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i10 + " and tag " + k10, (Throwable) e);
                throw new RuntimeException(e);
            }
        } else {
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i10) + " and tag " + Integer.toHexString(k10) + " found: " + cls);
            bVar = new Object();
        }
        bVar.f15974a = k10;
        int a2 = e5.b.a(byteBuffer.get());
        bVar.f15975b = a2 & 127;
        int i11 = 1;
        while ((a2 >>> 7) == 1) {
            a2 = e5.b.a(byteBuffer.get());
            i11++;
            bVar.f15975b = (bVar.f15975b << 7) | (a2 & 127);
        }
        bVar.f15976c = i11;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(bVar.f15975b);
        bVar.b(slice);
        byteBuffer.position(byteBuffer.position() + bVar.f15975b);
        return bVar;
    }
}
