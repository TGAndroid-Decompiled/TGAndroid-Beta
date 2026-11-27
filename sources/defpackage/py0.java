package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public abstract class py0 {
    public static final byte[] a = {-75, 0, 60, 0, 1, 4};

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(py0.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void b(ByteBuffer byteBuffer, boolean z) {
        boolean z2;
        ArrayList b = wue.b(byteBuffer.asReadOnlyBuffer());
        int size = b.size();
        int i = 0;
        while (i < size) {
            Object obj = b.get(i);
            i++;
            er7 er7Var = (er7) obj;
            byte b2 = er7Var.a;
            ByteBuffer byteBuffer2 = er7Var.b;
            if (b2 == 5) {
                if (b2 == 5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                try {
                    yve.f(z2);
                    ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                    if (wue.a(asReadOnlyBuffer) == 4) {
                        if (z && asReadOnlyBuffer.remaining() >= 6) {
                            int position = asReadOnlyBuffer.position();
                            for (int i2 = 0; i2 < 6; i2++) {
                                if (asReadOnlyBuffer.get(position + i2) == a[i2]) {
                                }
                            }
                        }
                        byteBuffer.put(byteBuffer2.position(), (byte) 31);
                        break;
                    }
                } catch (BufferUnderflowException unused) {
                }
            }
        }
    }
}
