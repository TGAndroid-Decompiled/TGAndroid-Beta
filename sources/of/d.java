package of;

import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.util.Pair;
import e6.n;
import hg.k0;
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
import m4.o0;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.ui.Components.zg;
import t7.u;
import yc.i;
public final class d extends i {
    public static final f f17162l;
    public static final HashMap f17163m;
    public final ExtendedDefaultDataSourceFactory f17164e;
    public final o0 f17165f;
    public final u f17166g;
    public final HashMap h;
    public Pair f17167i;
    public boolean f17168j;
    public final AtomicInteger f17169k;

    static {
        f fVar = new f(new e(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f17162l = fVar;
        f[] fVarArr = {fVar};
        HashMap hashMap = new HashMap();
        f17163m = hashMap;
        f fVar2 = fVarArr[0];
        hashMap.put(fVar2.d, fVar2);
    }

    public d() {
        this.f50844c = new n(9);
        this.h = new HashMap();
        this.f17167i = null;
        this.f17168j = false;
        this.f17169k = new AtomicInteger();
        this.f17165f = new o0(28);
        this.f17166g = new Object();
        this.f17164e = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
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
            } catch (SocketException e7) {
                FileLog.e(e7);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb2.append(":61578");
        return sb2.toString();
    }

    public static String j(String str, String str2) {
        return a4.a.p("http://", str, str2);
    }

    @Override
    public final yc.g e(yc.d dVar) {
        String str;
        int incrementAndGet = this.f17169k.incrementAndGet();
        StringBuilder j3 = k0.j(incrementAndGet, "Request ", " ");
        switch (dVar.f50820g) {
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
        j3.append(str);
        j3.append(" ");
        j3.append(dVar.f50819f);
        j3.append(" ");
        j3.append((String) dVar.f50821i.get("range"));
        Log.d("CAST_SERVER", j3.toString());
        try {
            yc.g k10 = k(dVar);
            zg zgVar = k10.f50836e;
            zgVar.put("Access-Control-Allow-Origin", "*");
            zgVar.put("Access-Control-Max-Age", "3628800");
            zgVar.put("Access-Control-Allow-Methods", "*");
            zgVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            yc.g c10 = i.c(yc.f.INTERNAL_ERROR, "text/plain", "Error reading file");
            zg zgVar2 = c10.f50836e;
            zgVar2.put("Access-Control-Allow-Origin", "*");
            zgVar2.put("Access-Control-Max-Age", "3628800");
            zgVar2.put("Access-Control-Allow-Methods", "*");
            zgVar2.put("Access-Control-Allow-Headers", "*");
            return c10;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f17168j) {
                try {
                    i.d(this.f50842a);
                    n nVar = this.f50844c;
                    nVar.getClass();
                    ArrayList arrayList = new ArrayList((List) nVar.f8695c);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        yc.a aVar = (yc.a) obj;
                        i.d(aVar.f50805a);
                        i.d(aVar.f50806b);
                    }
                    Thread thread = this.f50843b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e7) {
                    i.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e7);
                }
                this.f17168j = false;
            }
        } else if (!this.f17168j) {
            try {
                f();
                this.f17168j = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final yc.g k(yc.d r44) {
        throw new UnsupportedOperationException("Method not decompiled: of.d.k(yc.d):yc.g");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f17167i = new Pair(str, file);
        } else {
            Pair pair = this.f17167i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f17167i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f17167i = null;
        }
        h();
    }
}
