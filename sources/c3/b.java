package c3;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import jg.g;
public abstract class b {
    public static final Object f5262a = new Object();
    public static final Object f5263b = new Object();
    public static boolean f5264c;
    public static long d;

    public static long a() {
        byte b10;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            synchronized (f5263b) {
            }
            datagramSocket.setSoTimeout(1000);
            c();
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b11 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i7 = 0;
            int i10 = 0;
            while (i7 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i7], 123);
                bArr2[b11] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (currentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b11);
                    b10 = b11;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j3 = currentTimeMillis / 1000;
                    Long.signum(j3);
                    long j10 = currentTimeMillis - (j3 * 1000);
                    b10 = b11;
                    socketTimeoutException = socketTimeoutException2;
                    long j11 = j3 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j11 >> 24);
                    bArr[41] = (byte) (j11 >> 16);
                    bArr[42] = (byte) (j11 >> 8);
                    bArr[43] = (byte) j11;
                    long j12 = (j10 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j12 >> 24);
                    bArr[45] = (byte) (j12 >> 16);
                    bArr[46] = (byte) (j12 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j13 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                    byte b12 = bArr3[b10];
                    long e10 = e(24, bArr3);
                    long e11 = e(32, bArr3);
                    long e12 = e(40, bArr3);
                    b((byte) ((b12 >> 6) & 3), (byte) (b12 & 7), bArr3[1] & 255, e12);
                    long j14 = (j13 + (((e12 - j13) + (e11 - e10)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j14;
                } catch (SocketTimeoutException e13) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e13;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e13);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i11 = i10 + 1;
                    if (i10 >= 10) {
                        break;
                    }
                    i7++;
                    i10 = i11;
                    b11 = b10;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void b(byte b10, byte b11, int i7, long j3) {
        if (b10 != 3) {
            if (b11 != 4 && b11 != 5) {
                throw new IOException(g.j(b11, "SNTP: Untrusted mode: "));
            }
            if (i7 != 0 && i7 <= 15) {
                if (j3 != 0) {
                    return;
                }
                throw new IOException("SNTP: Zero transmitTime");
            }
            throw new IOException(g.j(i7, "SNTP: Untrusted stratum: "));
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static void c() {
        synchronized (f5263b) {
        }
    }

    public static long d(int i7, byte[] bArr) {
        int i10 = bArr[i7];
        int i11 = bArr[i7 + 1];
        int i12 = bArr[i7 + 2];
        int i13 = bArr[i7 + 3];
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
    }

    public static long e(int i7, byte[] bArr) {
        long d2 = d(i7, bArr);
        long d10 = d(i7 + 4, bArr);
        if (d2 == 0 && d10 == 0) {
            return 0L;
        }
        return ((d10 * 1000) / 4294967296L) + ((d2 - 2208988800L) * 1000);
    }
}
