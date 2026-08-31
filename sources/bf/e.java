package bf;

import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.util.Pair;
import androidx.emoji2.text.w;
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
import kc.i;
import kc.l;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
public final class e extends l {
    public static final g f1942l;
    public static final HashMap f1943m;
    public final ExtendedDefaultDataSourceFactory f1944e;
    public final w f1945f;
    public final cb.b f1946g;
    public final HashMap h;
    public Pair f1947i;
    public boolean f1948j;
    public final AtomicInteger f1949k;

    static {
        g gVar = new g(new f(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f1942l = gVar;
        g[] gVarArr = {gVar};
        HashMap hashMap = new HashMap();
        f1943m = hashMap;
        g gVar2 = gVarArr[0];
        hashMap.put(gVar2.d, gVar2);
    }

    public e() {
        this.f11091c = new f2.c(2);
        this.h = new HashMap();
        this.f1947i = null;
        this.f1948j = false;
        this.f1949k = new AtomicInteger();
        this.f1945f = new w(4);
        this.f1946g = new cb.b(7);
        this.f1944e = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String i() {
        int ipAddress = ((WifiManager) ApplicationLoader.applicationContext.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (nextElement.isSiteLocalAddress()) {
                            byte[] address = nextElement.getAddress();
                            ipAddress = (((address[3] + 256) % 256) << 24) + ((address[0] + 256) % 256) + (((address[1] + 256) % 256) << 8) + (((address[2] + 256) % 256) << 16);
                        }
                    }
                }
            } catch (SocketException e6) {
                FileLog.e(e6);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb.append(":61578");
        return sb.toString();
    }

    public static String j(String str, String str2) {
        return android.support.v4.media.a.o("http://", str, str2);
    }

    @Override
    public final i e(kc.e eVar) {
        String str;
        int incrementAndGet = this.f1949k.incrementAndGet();
        StringBuilder m9 = l.d.m(incrementAndGet, "Request ", " ");
        switch (eVar.f11062g) {
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
        m9.append(str);
        m9.append(" ");
        m9.append(eVar.f11061f);
        m9.append(" ");
        m9.append((String) eVar.f11063i.get("range"));
        Log.d("CAST_SERVER", m9.toString());
        try {
            i k10 = k(eVar);
            kc.f fVar = k10.f11080e;
            fVar.put("Access-Control-Allow-Origin", "*");
            fVar.put("Access-Control-Max-Age", "3628800");
            fVar.put("Access-Control-Allow-Methods", "*");
            fVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            i c3 = l.c(kc.h.INTERNAL_ERROR, "text/plain", "Error reading file");
            kc.f fVar2 = c3.f11080e;
            fVar2.put("Access-Control-Allow-Origin", "*");
            fVar2.put("Access-Control-Max-Age", "3628800");
            fVar2.put("Access-Control-Allow-Methods", "*");
            fVar2.put("Access-Control-Allow-Headers", "*");
            return c3;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f1948j) {
                try {
                    l.d(this.f11089a);
                    f2.c cVar = this.f11091c;
                    cVar.getClass();
                    ArrayList arrayList = new ArrayList((List) cVar.f5740c);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        kc.a aVar = (kc.a) obj;
                        l.d(aVar.f11046a);
                        l.d(aVar.f11047b);
                    }
                    Thread thread = this.f11090b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e6) {
                    l.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e6);
                }
                this.f1948j = false;
            }
        } else if (!this.f1948j) {
            try {
                f();
                this.f1948j = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final kc.i k(kc.e r44) {
        throw new UnsupportedOperationException("Method not decompiled: bf.e.k(kc.e):kc.i");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f1947i = new Pair(str, file);
        } else {
            Pair pair = this.f1947i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f1947i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f1947i = null;
        }
        h();
    }
}
