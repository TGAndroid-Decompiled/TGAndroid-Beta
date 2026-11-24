package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
public final class it8 implements r24 {
    public final byte a;
    public final HashMap b;
    public final HashMap c;

    public it8(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            case 3:
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                return;
        }
    }

    @Override
    public final r24 a(Class cls, zn7 zn7Var) {
        byte b = this.a;
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        switch (b) {
            case 1:
                hashMap2.put(cls, zn7Var);
                hashMap.remove(cls);
                return this;
            case 2:
                hashMap2.put(cls, zn7Var);
                hashMap.remove(cls);
                return this;
            default:
                hashMap2.put(cls, zn7Var);
                hashMap.remove(cls);
                return this;
        }
    }

    public final void b(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = this.c;
        HashMap hashMap2 = this.b;
        ht8 ht8Var = new ht8(byteArrayOutputStream, hashMap2, hashMap);
        if (obj == null) {
            return;
        }
        zn7 zn7Var = (zn7) hashMap2.get(obj.getClass());
        if (zn7Var != null) {
            zn7Var.a(obj, ht8Var);
            return;
        }
        Class<?> cls = obj.getClass();
        throw new RuntimeException("No encoder for " + cls);
    }

    public it8(HashMap hashMap, HashMap hashMap2) {
        this.a = (byte) 0;
        this.b = hashMap;
        this.c = hashMap2;
    }
}
