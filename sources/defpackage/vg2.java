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
public final class vg2 extends ei7 {
    public static final xg2 l;
    public static final HashMap m;
    public final ExtendedDefaultDataSourceFactory e;
    public final k32 f;
    public final o5f g;
    public final HashMap h;
    public Pair i;
    public boolean j;
    public final AtomicInteger k;

    static {
        xg2 xg2Var = new xg2(new wg2("image/png", Uri.parse("file:///android_asset/cast/default.png"), "/assets/default"));
        l = xg2Var;
        xg2[] xg2VarArr = {xg2Var};
        HashMap hashMap = new HashMap();
        m = hashMap;
        xg2 xg2Var2 = xg2VarArr[0];
        hashMap.put(xg2Var2.d, xg2Var2);
    }

    public vg2() {
        this.c = new hg2((byte) 3);
        this.h = new HashMap();
        this.i = null;
        this.j = false;
        this.k = new AtomicInteger();
        this.f = new k32((byte) 6);
        this.g = new o5f((byte) 19);
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
                fa4.g(e, true);
            }
        }
        return (String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255)).concat(":61578");
    }

    public static String i(String str, String str2) {
        return tb4.y("http://", str, str2);
    }

    @Override
    public final ci7 d(ai7 ai7Var) {
        String str;
        int incrementAndGet = this.k.incrementAndGet();
        StringBuilder m2 = de9.m(incrementAndGet, "Request ", " ");
        switch (ai7Var.g) {
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
        m2.append(ai7Var.f);
        m2.append(" ");
        ir2.x(m2, (String) ai7Var.i.get("range"), "CAST_SERVER");
        try {
            ci7 j = j(ai7Var);
            ny1 ny1Var = j.e;
            ny1Var.put("Access-Control-Allow-Origin", "*");
            ny1Var.put("Access-Control-Max-Age", "3628800");
            ny1Var.put("Access-Control-Allow-Methods", "*");
            ny1Var.put("Access-Control-Allow-Headers", "*");
            return j;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            ci7 b = ei7.b(29, "text/plain", "Error reading file");
            ny1 ny1Var2 = b.e;
            ny1Var2.put("Access-Control-Allow-Origin", "*");
            ny1Var2.put("Access-Control-Max-Age", "3628800");
            ny1Var2.put("Access-Control-Allow-Methods", "*");
            ny1Var2.put("Access-Control-Allow-Headers", "*");
            return b;
        }
    }

    public final void g() {
        boolean isEmpty = this.h.isEmpty();
        boolean z = this.j;
        if (isEmpty) {
            if (z) {
                try {
                    ei7.c(this.a);
                    ArrayList arrayList = new ArrayList((List) this.c.c);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        xh7 xh7Var = (xh7) obj;
                        ei7.c(xh7Var.a);
                        ei7.c(xh7Var.b);
                    }
                    Thread thread = this.b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e) {
                    ei7.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
                }
                this.j = false;
            }
        } else if (!z) {
            try {
                e();
                this.j = true;
            } catch (IOException e2) {
                sdb.b(e2);
            }
        }
    }

    public final defpackage.ci7 j(defpackage.ai7 r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg2.j(ai7):ci7");
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
