package of;

import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.util.Pair;
import e6.n;
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
import org.telegram.ui.Components.yg;
import t7.u;
import yc.i;
public final class d extends i {
    public static final f f15683l;
    public static final HashMap f15684m;
    public final ExtendedDefaultDataSourceFactory e;
    public final o0 f15685f;
    public final u f15686g;
    public final HashMap h;
    public Pair f15687i;
    public boolean f15688j;
    public final AtomicInteger f15689k;

    static {
        f fVar = new f(new e(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        f15683l = fVar;
        f[] fVarArr = {fVar};
        HashMap hashMap = new HashMap();
        f15684m = hashMap;
        f fVar2 = fVarArr[0];
        hashMap.put(fVar2.d, fVar2);
    }

    public d() {
        this.f46967c = new n(9);
        this.h = new HashMap();
        this.f15687i = null;
        this.f15688j = false;
        this.f15689k = new AtomicInteger();
        this.f15685f = new o0(27);
        this.f15686g = new Object();
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb2.append(":61578");
        return sb2.toString();
    }

    public static String j(String str, String str2) {
        return a4.a.q("http://", str, str2);
    }

    @Override
    public final yc.g e(yc.d dVar) {
        String str;
        int incrementAndGet = this.f15689k.incrementAndGet();
        StringBuilder j3 = hg.c.j(incrementAndGet, "Request ", " ");
        switch (dVar.f46945g) {
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
        j3.append(dVar.f46944f);
        j3.append(" ");
        j3.append((String) dVar.f46946i.get("range"));
        Log.d("CAST_SERVER", j3.toString());
        try {
            yc.g k10 = k(dVar);
            yg ygVar = k10.e;
            ygVar.put("Access-Control-Allow-Origin", "*");
            ygVar.put("Access-Control-Max-Age", "3628800");
            ygVar.put("Access-Control-Allow-Methods", "*");
            ygVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            yc.g c10 = i.c(yc.f.INTERNAL_ERROR, "text/plain", "Error reading file");
            yg ygVar2 = c10.e;
            ygVar2.put("Access-Control-Allow-Origin", "*");
            ygVar2.put("Access-Control-Max-Age", "3628800");
            ygVar2.put("Access-Control-Allow-Methods", "*");
            ygVar2.put("Access-Control-Allow-Headers", "*");
            return c10;
        }
    }

    public final void h() {
        if (this.h.isEmpty()) {
            if (this.f15688j) {
                try {
                    i.d(this.f46965a);
                    n nVar = this.f46967c;
                    nVar.getClass();
                    ArrayList arrayList = new ArrayList((List) nVar.f8014c);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        yc.a aVar = (yc.a) obj;
                        i.d(aVar.f46932a);
                        i.d(aVar.f46933b);
                    }
                    Thread thread = this.f46966b;
                    if (thread != null) {
                        thread.join();
                    }
                } catch (Exception e) {
                    i.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
                }
                this.f15688j = false;
            }
        } else if (!this.f15688j) {
            try {
                f();
                this.f15688j = true;
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final yc.g k(yc.d r44) {
        throw new UnsupportedOperationException("Method not decompiled: of.d.k(yc.d):yc.g");
    }

    public final void l(File file, String str) {
        if (str != null && file != null) {
            this.f15687i = new Pair(str, file);
        } else {
            Pair pair = this.f15687i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.f15687i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.f15687i = null;
        }
        h();
    }
}
