package defpackage;

import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
public abstract class afd {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;

    public static void a() {
        synchronized (b) {
        }
    }

    public static long b() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            synchronized (b) {
            }
            datagramSocket.setSoTimeout(1000);
            a();
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i], 123);
                bArr2[b3] = 27;
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (currentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b3);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j = currentTimeMillis / 1000;
                    Long.signum(j);
                    long j2 = currentTimeMillis - (j * 1000);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    long j3 = j + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j3 >> 24);
                    bArr[41] = (byte) (j3 >> 16);
                    bArr[42] = (byte) (j3 >> 8);
                    bArr[43] = (byte) j3;
                    long j4 = (j2 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j4 >> 24);
                    bArr[45] = (byte) (j4 >> 16);
                    bArr[46] = (byte) (j4 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j5 = (elapsedRealtime2 - elapsedRealtime) + currentTimeMillis;
                    byte b4 = bArr3[b2];
                    byte b5 = (byte) ((b4 >> 6) & 3);
                    byte b6 = (byte) (b4 & 7);
                    int i3 = bArr3[1] & 255;
                    long d2 = d(24, bArr3);
                    long d3 = d(32, bArr3);
                    long d4 = d(40, bArr3);
                    if (b5 != 3) {
                        if (b6 != 4 && b6 != 5) {
                            wa3.d(hg9.j(b6, "SNTP: Untrusted mode: "));
                        } else if (i3 != 0 && i3 <= 15) {
                            if (d4 == 0) {
                                wa3.d("SNTP: Zero transmitTime");
                            }
                        } else {
                            wa3.d(hg9.j(i3, "SNTP: Untrusted stratum: "));
                        }
                    } else {
                        wa3.d("SNTP: Unsynchronized server");
                    }
                    long j6 = (j5 + (((d4 - j5) + (d3 - d2)) / 2)) - elapsedRealtime2;
                    datagramSocket.close();
                    return j6;
                } catch (SocketTimeoutException e) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i4 = i2 + 1;
                    if (i2 >= 10) {
                        break;
                    }
                    i++;
                    i2 = i4;
                    b3 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long c(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    public static long d(int i, byte[] bArr) {
        long c2 = c(i, bArr);
        long c3 = c(i + 4, bArr);
        if (c2 == 0 && c3 == 0) {
            return 0L;
        }
        return ((c3 * 1000) / 4294967296L) + ((c2 - 2208988800L) * 1000);
    }
}
