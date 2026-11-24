package defpackage;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
public final class j51 {
    public static final String b = pm2.k(UUID.randomUUID().toString() + System.currentTimeMillis());
    public static final AtomicLong c = new AtomicLong(0);
    public final String a;

    public j51() {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte b2 = array[0];
        byte b3 = array[1];
        byte b4 = array[2];
        byte b5 = array[3];
        byte[] a = a(time % 1000);
        byte b6 = a[0];
        byte b7 = a[1];
        byte[] a2 = a(c.incrementAndGet());
        byte b8 = a2[0];
        byte b9 = a2[1];
        byte[] a3 = a(Integer.valueOf(Process.myPid()).shortValue());
        String g = pm2.g(new byte[]{b2, b3, b4, b5, b6, b7, b8, b9, a3[0], a3[1]});
        Locale locale = Locale.US;
        this.a = String.format(locale, "%s%s%s%s", g.substring(0, 12), g.substring(12, 16), g.subSequence(16, 20), b.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return this.a;
    }
}
