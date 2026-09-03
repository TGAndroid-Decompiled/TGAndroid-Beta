package af;

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
import kc.k;
import kf.k0;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
public final class g extends k {
    public static final i f166l;
    public static final HashMap f167m;
    public final ExtendedDefaultDataSourceFactory e;
    public final a f168f;
    public final ab.a f169g;
    public final HashMap h;
    public Pair f170i;
    public boolean f171j;
    public final AtomicInteger f172k;

    static {
        i iVar = new i(new h(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f166l = iVar;
        i[] iVarArr = {iVar};
        HashMap hashMap = new HashMap();
        f167m = hashMap;
        i iVar2 = iVarArr[0];
        hashMap.put(iVar2.d, iVar2);
    }

    public g() {
        this.f10301c = new f2.c(2);
        this.h = new HashMap();
        this.f170i = null;
        this.f171j = false;
        this.f172k = new AtomicInteger();
        this.f168f = new a(1);
        this.f169g = new ab.a(7);
        this.e = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
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
            } catch (SocketException e) {
                FileLog.e(e);
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
    public final kc.h e(kc.d dVar) {
        String str;
        int incrementAndGet = this.f172k.incrementAndGet();
        StringBuilder m9 = k0.m(incrementAndGet, "Request ", " ");
        switch (dVar.f10274g) {
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
        m9.append(dVar.f10273f);
        m9.append(" ");
        m9.append((String) dVar.f10275i.get("range"));
        Log.d("CAST_SERVER", m9.toString());
        try {
            kc.h k10 = k(dVar);
            kc.e eVar = k10.e;
            eVar.put("Access-Control-Allow-Origin", "*");
            eVar.put("Access-Control-Max-Age", "3628800");
            eVar.put("Access-Control-Allow-Methods", "*");
            eVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            kc.h c3 = k.c(kc.g.INTERNAL_ERROR, "text/plain", "Error reading file");
            kc.e eVar2 = c3.e;
            eVar2.put("Access-Control-Allow-Origin", "*");
            eVar2.put("Access-Control-Max-Age", "3628800");
            eVar2.put("Access-Control-Allow-Methods", "*");
            eVar2.put("Access-Control-Allow-Headers", "*");
            return c3;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f171j) {
                try {
                    k.d(this.f10299a);
                    f2.c cVar = this.f10301c;
                    cVar.getClass();
                    ArrayList arrayList = new ArrayList((List) cVar.f5660c);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        kc.a aVar = (kc.a) obj;
                        k.d(aVar.f10261a);
                        k.d(aVar.f10262b);
                    }
                    Thread thread = this.f10300b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e) {
                    k.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
                }
                this.f171j = false;
            }
        } else if (!this.f171j) {
            try {
                f();
                this.f171j = true;
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final kc.h k(kc.d r44) {
        throw new UnsupportedOperationException("Method not decompiled: af.g.k(kc.d):kc.h");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f170i = new Pair(str, file);
        } else {
            Pair pair = this.f170i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f170i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f170i = null;
        }
        h();
    }
}
