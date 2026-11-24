package defpackage;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class bq7 {
    public static final Logger a = Logger.getLogger(bq7.class.getName());
    public static final HashMap b = new HashMap();

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(qa3.class);
        hashSet.add(hq9.class);
        hashSet.add(rg0.class);
        hashSet.add(h84.class);
        hashSet.add(aq7.class);
        hashSet.add(it8.class);
        hashSet.add(y40.class);
        hashSet.add(i84.class);
        hashSet.add(st3.class);
        hashSet.add(ha3.class);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            kf3 kf3Var = (kf3) cls.getAnnotation(kf3.class);
            int[] tags = kf3Var.tags();
            int objectTypeIndication = kf3Var.objectTypeIndication();
            Map map = (Map) b.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int i : tags) {
                map.put(Integer.valueOf(i), cls);
            }
            b.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static rg0 a(int i, ByteBuffer byteBuffer) {
        rg0 rg0Var;
        int i2 = jne.i(byteBuffer);
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = b;
        Map map = (Map) hashMap.get(valueOf);
        if (map == null) {
            map = (Map) hashMap.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(i2));
        Logger logger = a;
        if (cls != null && !cls.isInterface() && !Modifier.isAbstract(cls.getModifiers())) {
            try {
                rg0Var = (rg0) cls.newInstance();
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i + " and tag " + i2, (Throwable) e);
                rjb.m(e);
                return null;
            }
        } else {
            logger.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(i) + " and tag " + Integer.toHexString(i2) + " found: " + cls);
            rg0Var = new Object();
        }
        rg0Var.a = i2;
        int a2 = jne.a(byteBuffer.get());
        rg0Var.b = a2 & 127;
        int i3 = 1;
        while ((a2 >>> 7) == 1) {
            a2 = jne.a(byteBuffer.get());
            i3++;
            rg0Var.b = (rg0Var.b << 7) | (a2 & 127);
        }
        rg0Var.c = i3;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(rg0Var.b);
        rg0Var.b(slice);
        byteBuffer.position(byteBuffer.position() + rg0Var.b);
        return rg0Var;
    }
}
