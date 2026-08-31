package i9;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
public final class f {
    public static final AtomicLong f7945a = new AtomicLong(0);
    public static String f7946b;

    public f(w wVar) {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte b10 = array[0];
        byte b11 = array[1];
        byte b12 = array[2];
        byte b13 = array[3];
        byte[] a2 = a(time % 1000);
        byte b14 = a2[0];
        byte b15 = a2[1];
        byte[] a10 = a(f7945a.incrementAndGet());
        byte b16 = a10[0];
        byte b17 = a10[1];
        byte[] a11 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {b10, b11, b12, b13, b14, b15, b16, b17, a11[0], a11[1]};
        String i10 = h.i(wVar.b().f7940a);
        String f10 = h.f(bArr);
        Locale locale = Locale.US;
        f7946b = String.format(locale, "%s%s%s%s", f10.substring(0, 12), f10.substring(12, 16), f10.subSequence(16, 20), i10.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j10) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j10);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return f7946b;
    }
}
