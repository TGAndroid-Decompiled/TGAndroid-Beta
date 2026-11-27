package defpackage;

import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import org.telegram.messenger.a;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
public final class nh2 extends ok7 {
    public static final ph2 l;
    public static final HashMap m;
    public final ExtendedDefaultDataSourceFactory e;
    public final c22 f;
    public final faf g;
    public final HashMap h;
    public Pair i;
    public boolean j;
    public final AtomicInteger k;

    static {
        ph2 ph2Var = new ph2(new oh2("image/png", Uri.parse("file:///android_asset/cast/default.png"), "/assets/default"));
        l = ph2Var;
        ph2[] ph2VarArr = {ph2Var};
        HashMap hashMap = new HashMap();
        m = hashMap;
        ph2 ph2Var2 = ph2VarArr[0];
        hashMap.put(ph2Var2.d, ph2Var2);
    }

    public nh2() {
        this.c = new zg2((byte) 4);
        this.h = new HashMap();
        this.i = null;
        this.j = false;
        this.k = new AtomicInteger();
        this.f = new c22((byte) 11);
        this.g = new faf((byte) 19);
        this.e = new ExtendedDefaultDataSourceFactory(a.b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String h() {
        int ipAddress = ((WifiManager) a.b.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (nextElement.isSiteLocalAddress()) {
                            byte[] address = nextElement.getAddress();
                            ipAddress = ((address[0] + 256) % 256) + (((address[1] + 256) % 256) << 8) + (((address[2] + 256) % 256) << 16) + (((address[3] + 256) % 256) << 24);
                        }
                    }
                }
            } catch (SocketException e) {
                cc4.g(e, true);
            }
        }
        return (String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255)).concat(":61578");
    }

    public static String i(String str, String str2) {
        return qd4.y("http://", str, str2);
    }

    @Override
    public final mk7 d(kk7 kk7Var) {
        String str;
        int incrementAndGet = this.k.incrementAndGet();
        StringBuilder m2 = uh9.m(incrementAndGet, "Request ", " ");
        switch (kk7Var.g) {
            case 1:
                str = "GET";
                break;
            case 2:
                str = "PUT";
                break;
            case 3:
                str = "POST";
                break;
            case 4:
                str = "DELETE";
                break;
            case 5:
                str = "HEAD";
                break;
            case 6:
                str = "OPTIONS";
                break;
            case 7:
                str = "TRACE";
                break;
            case 8:
                str = "CONNECT";
                break;
            case 9:
                str = "PATCH";
                break;
            case 10:
                str = "PROPFIND";
                break;
            case 11:
                str = "PROPPATCH";
                break;
            case 12:
                str = "MKCOL";
                break;
            case 13:
                str = "MOVE";
                break;
            case 14:
                str = "COPY";
                break;
            case 15:
                str = "LOCK";
                break;
            case 16:
                str = "UNLOCK";
                break;
            default:
                str = "null";
                break;
        }
        m2.append(str);
        m2.append(" ");
        m2.append(kk7Var.f);
        m2.append(" ");
        bs2.x(m2, (String) kk7Var.i.get("range"), "CAST_SERVER");
        try {
            mk7 j = j(kk7Var);
            fz1 fz1Var = j.e;
            fz1Var.put("Access-Control-Allow-Origin", "*");
            fz1Var.put("Access-Control-Max-Age", "3628800");
            fz1Var.put("Access-Control-Allow-Methods", "*");
            fz1Var.put("Access-Control-Allow-Headers", "*");
            return j;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            mk7 b = ok7.b(29, "text/plain", "Error reading file");
            fz1 fz1Var2 = b.e;
            fz1Var2.put("Access-Control-Allow-Origin", "*");
            fz1Var2.put("Access-Control-Max-Age", "3628800");
            fz1Var2.put("Access-Control-Allow-Methods", "*");
            fz1Var2.put("Access-Control-Allow-Headers", "*");
            return b;
        }
    }

    public final void g() {
        boolean isEmpty = this.h.isEmpty();
        boolean z = this.j;
        if (isEmpty) {
            if (z) {
                try {
                    ok7.c(this.a);
                    ArrayList arrayList = new ArrayList((List) this.c.c);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        hk7 hk7Var = (hk7) obj;
                        ok7.c(hk7Var.a);
                        ok7.c(hk7Var.b);
                    }
                    Thread thread = this.b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e) {
                    ok7.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
                }
                this.j = false;
            }
        } else if (!z) {
            try {
                e();
                this.j = true;
            } catch (IOException e2) {
                grb.m(e2);
            }
        }
    }

    public final defpackage.mk7 j(defpackage.kk7 r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh2.j(kk7):mk7");
    }

    public final void k(File file, String str) {
        if (str != null && file != null) {
            this.i = new Pair(str, file);
        } else {
            Pair pair = this.i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.i = null;
        }
        g();
    }
}
