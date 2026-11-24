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
public final class ji2 extends hk7 {
    public static final li2 l;
    public static final HashMap m;
    public final ExtendedDefaultDataSourceFactory e;
    public final a32 f;
    public final q7f g;
    public final HashMap h;
    public Pair i;
    public boolean j;
    public final AtomicInteger k;

    static {
        li2 li2Var = new li2(new ki2("image/png", Uri.parse("file:///android_asset/cast/default.png"), "/assets/default"));
        l = li2Var;
        li2[] li2VarArr = {li2Var};
        HashMap hashMap = new HashMap();
        m = hashMap;
        li2 li2Var2 = li2VarArr[0];
        hashMap.put(li2Var2.d, li2Var2);
    }

    public ji2() {
        this.c = new vh2((byte) 4);
        this.h = new HashMap();
        this.i = null;
        this.j = false;
        this.k = new AtomicInteger();
        this.f = new a32((byte) 7);
        this.g = new q7f((byte) 19);
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
                fc4.g(e, true);
            }
        }
        return (String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255)).concat(":61578");
    }

    public static String i(String str, String str2) {
        return kt6.o("http://", str, str2);
    }

    @Override
    public final fk7 d(dk7 dk7Var) {
        String str;
        int incrementAndGet = this.k.incrementAndGet();
        StringBuilder l2 = hg9.l(incrementAndGet, "Request ", " ");
        switch (dk7Var.g) {
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
        l2.append(str);
        l2.append(" ");
        l2.append(dk7Var.f);
        l2.append(" ");
        ts2.w(l2, (String) dk7Var.i.get("range"), "CAST_SERVER");
        try {
            fk7 j = j(dk7Var);
            a02 a02Var = j.e;
            a02Var.put("Access-Control-Allow-Origin", "*");
            a02Var.put("Access-Control-Max-Age", "3628800");
            a02Var.put("Access-Control-Allow-Methods", "*");
            a02Var.put("Access-Control-Allow-Headers", "*");
            return j;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            fk7 b = hk7.b(29, "text/plain", "Error reading file");
            a02 a02Var2 = b.e;
            a02Var2.put("Access-Control-Allow-Origin", "*");
            a02Var2.put("Access-Control-Max-Age", "3628800");
            a02Var2.put("Access-Control-Allow-Methods", "*");
            a02Var2.put("Access-Control-Allow-Headers", "*");
            return b;
        }
    }

    public final void g() {
        boolean isEmpty = this.h.isEmpty();
        boolean z = this.j;
        if (isEmpty) {
            if (z) {
                try {
                    hk7.c(this.a);
                    ArrayList arrayList = new ArrayList((List) this.c.c);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ak7 ak7Var = (ak7) obj;
                        hk7.c(ak7Var.a);
                        hk7.c(ak7Var.b);
                    }
                    Thread thread = this.b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e) {
                    hk7.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
                }
                this.j = false;
            }
        } else if (!z) {
            try {
                e();
                this.j = true;
            } catch (IOException e2) {
                rjb.m(e2);
            }
        }
    }

    public final defpackage.fk7 j(defpackage.dk7 r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ji2.j(dk7):fk7");
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
