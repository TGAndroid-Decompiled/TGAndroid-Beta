package hf;

import a1.g;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.util.Pair;
import c3.g0;
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
import org.telegram.messenger.f8;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.messenger.w0;
import org.telegram.ui.Components.cg;
import sc.h;
import sc.j;
public final class d extends j {
    public static final f f7662l;
    public static final HashMap f7663m;
    public final ExtendedDefaultDataSourceFactory e;
    public final d2.c f7664f;
    public final kb.a f7665g;
    public final HashMap h;
    public Pair f7666i;
    public boolean f7667j;
    public final AtomicInteger f7668k;

    static {
        f fVar = new f(new e(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f7662l = fVar;
        f[] fVarArr = {fVar};
        HashMap hashMap = new HashMap();
        f7663m = hashMap;
        f fVar2 = fVarArr[0];
        hashMap.put(fVar2.d, fVar2);
    }

    public d() {
        this.f48177c = new g0(8);
        this.h = new HashMap();
        this.f7666i = null;
        this.f7667j = false;
        this.f7668k = new AtomicInteger();
        this.f7664f = new d2.c(13);
        this.f7665g = new kb.a(6);
        this.e = new ExtendedDefaultDataSourceFactory(w0.f19025b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String i() {
        int ipAddress = ((WifiManager) w0.f19025b.getSystemService("wifi")).getConnectionInfo().getIpAddress();
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
                f8.g(e, true);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb2.append(":61578");
        return sb2.toString();
    }

    public static String j(String str, String str2) {
        return g.n("http://", str, str2);
    }

    @Override
    public final h e(sc.d dVar) {
        String str;
        int incrementAndGet = this.f7668k.incrementAndGet();
        StringBuilder l4 = i0.a.l(incrementAndGet, "Request ", " ");
        switch (dVar.f48155g) {
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
        l4.append(str);
        l4.append(" ");
        l4.append(dVar.f48154f);
        l4.append(" ");
        l4.append((String) dVar.f48156i.get("range"));
        Log.d("CAST_SERVER", l4.toString());
        try {
            h k10 = k(dVar);
            cg cgVar = k10.e;
            cgVar.put("Access-Control-Allow-Origin", "*");
            cgVar.put("Access-Control-Max-Age", "3628800");
            cgVar.put("Access-Control-Allow-Methods", "*");
            cgVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            h c10 = j.c(sc.g.INTERNAL_ERROR, "text/plain", "Error reading file");
            cg cgVar2 = c10.e;
            cgVar2.put("Access-Control-Allow-Origin", "*");
            cgVar2.put("Access-Control-Max-Age", "3628800");
            cgVar2.put("Access-Control-Allow-Methods", "*");
            cgVar2.put("Access-Control-Allow-Headers", "*");
            return c10;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f7667j) {
                try {
                    j.d(this.f48175a);
                    g0 g0Var = this.f48177c;
                    g0Var.getClass();
                    ArrayList arrayList = new ArrayList((List) g0Var.f3651c);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        sc.a aVar = (sc.a) obj;
                        j.d(aVar.f48142a);
                        j.d(aVar.f48143b);
                    }
                    Thread thread = this.f48176b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e) {
                    j.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
                }
                this.f7667j = false;
            }
        } else if (!this.f7667j) {
            try {
                f();
                this.f7667j = true;
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final sc.h k(sc.d r44) {
        throw new UnsupportedOperationException("Method not decompiled: hf.d.k(sc.d):sc.h");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f7666i = new Pair(str, file);
        } else {
            Pair pair = this.f7666i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f7666i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f7666i = null;
        }
        h();
    }
}
