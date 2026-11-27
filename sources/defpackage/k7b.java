package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaExtractor;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.xml.sax.Attributes;
public final class k7b implements p7b, ly9, bo3, OnCompleteListener, s99, zcd, ydd {
    public final byte a;
    public Object b;
    public Object c;

    public k7b(Attributes attributes, HashMap hashMap) {
        this.a = (byte) 2;
        this.c = attributes;
        String k = hgb.k("style", attributes);
        if (k != null) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(new fgb(k));
            return;
        }
        String k2 = hgb.k("class", attributes);
        if (k2 != null) {
            this.b = new ArrayList();
            for (String str : k2.split(" ")) {
                fgb fgbVar = (fgb) hashMap.get(str.trim());
                if (fgbVar != null) {
                    ((ArrayList) this.b).add(fgbVar);
                }
            }
        }
    }

    public static String u(k7b k7bVar) {
        List<String> list = (List) k7bVar.c;
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) k7bVar.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb.append("/");
                sb.append(upperCase);
            } else {
                lq5.j("Invalid application ID: ".concat(str));
                return null;
            }
        }
        if (list != null) {
            if (!list.isEmpty()) {
                if (str == null) {
                    sb.append("/");
                }
                sb.append("/");
                boolean z = true;
                for (String str2 : list) {
                    qd1.b(str2);
                    if (!z) {
                        sb.append(",");
                    }
                    if (!qd1.a.matcher(str2).matches()) {
                        StringBuilder sb2 = new StringBuilder(str2.length());
                        for (int i = 0; i < str2.length(); i++) {
                            char charAt = str2.charAt(i);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                                sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            } else {
                                sb2.append(charAt);
                            }
                        }
                        str2 = sb2.toString();
                    }
                    sb.append(str2);
                    z = false;
                }
            } else {
                lq5.j("Must specify at least one namespace");
                return null;
            }
        }
        if (str == null && list == null) {
            sb.append("/");
        }
        if (list == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    @Override
    public final void a(String str, String str2) {
        snc sncVar = (snc) this.c;
        co3 co3Var = (co3) this.b;
        if (!sncVar.K) {
            if (co3Var == sncVar.f) {
                sncVar.a(str, str2);
            }
        } else if (co3Var == sncVar.V) {
            sncVar.V = null;
            if (!str.isEmpty()) {
                sncVar.w(co3Var, str);
            }
            sncVar.g();
            Log.d("VoiceLive", "field: final words in (" + sncVar.M.size() + " words)");
            sncVar.q();
        } else if (co3Var != sncVar.f) {
        } else {
            Log.d("VoiceLive", "field: recogniser ended by itself error=" + str2);
            if (!str.isEmpty()) {
                sncVar.w(co3Var, str);
            }
            sncVar.f = null;
            if (r2f.a == sncVar) {
                r2f.a = null;
            }
            sncVar.d = null;
            sncVar.e = null;
            sncVar.g();
            sncVar.q();
        }
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        int i;
        switch (this.a) {
            case 11:
                q7d q7dVar = new q7d((qa4) this.b, (TaskCompletionSource) obj2, (byte) 1);
                h7d h7dVar = (h7d) ((e8d) obj).k();
                Parcel c = h7dVar.c();
                v6d.c(c, q7dVar);
                v6d.b(c, (fo) this.c);
                c.writeStrongBinder(null);
                h7dVar.d(c, 2);
                return;
            default:
                qa4 qa4Var = (qa4) this.b;
                rrd rrdVar = (rrd) obj;
                l3e l3eVar = new l3e(qa4Var, (TaskCompletionSource) obj2);
                Context context = qa4Var.a;
                try {
                    i = h3d.a(context).a(0, context.getPackageName()).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i = 0;
                }
                x89 x89Var = (x89) this.c;
                x89Var.f = i;
                sxd sxdVar = (sxd) rrdVar.k();
                io ioVar = new io(new cq2(-1, -1, 0, true), true);
                ioVar.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
                int i2 = cld.a;
                obtain.writeStrongBinder(l3eVar);
                obtain.writeInt(1);
                x89Var.writeToParcel(obtain, 0);
                obtain.writeInt(1);
                ioVar.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    sxdVar.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
        }
    }

    @Override
    public final void b(ey7 ey7Var) {
        j6c j6cVar = (j6c) this.c;
        SparseArray sparseArray = j6cVar.h;
        zd1 zd1Var = (zd1) this.b;
        if (ey7Var.A() == 0 && (ey7Var.A() & 128) != 0) {
            ey7Var.O(6);
            int a = ey7Var.a() / 4;
            for (int i = 0; i < a; i++) {
                ey7Var.k(0, 4, zd1Var.b);
                zd1Var.l(0);
                int f = zd1Var.f(16);
                zd1Var.n(3);
                if (f == 0) {
                    zd1Var.n(13);
                } else {
                    int f2 = zd1Var.f(13);
                    if (sparseArray.get(f2) == null) {
                        sparseArray.put(f2, new my9(new d2c(j6cVar, f2)));
                        j6cVar.n++;
                    }
                }
            }
            if (j6cVar.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override
    public final void b0(String str, long j, int i, kdd kddVar, long j2, long j3) {
        int i2;
        rdd rddVar = (rdd) this.c;
        if (((ydd) this.b) != null) {
            if (i == 2001) {
                Object[] objArr = {Integer.valueOf(rddVar.i)};
                he6 he6Var = rddVar.a;
                Log.w(he6Var.a, he6Var.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((v99) rddVar.h.b).i.iterator();
                while (it.hasNext()) {
                    ((u99) it.next()).o();
                }
                i2 = 2001;
            } else {
                i2 = i;
            }
            ((ydd) this.b).b0(str, j, i2, kddVar, j2, j3);
        }
    }

    @Override
    public final void d(String[] strArr, float[] fArr, int i) {
        co3 co3Var = (co3) this.b;
        snc sncVar = (snc) this.c;
        if (co3Var == sncVar.f) {
            String[] j = bn3.j(strArr, fArr, i);
            sncVar.J = j;
            vnc vncVar = sncVar.h;
            if (vncVar != null) {
                vncVar.setDetected(j);
            }
            knc kncVar = sncVar.L;
            if (kncVar != null) {
                kncVar.setDetected(sncVar.J);
            }
        }
    }

    @Override
    public final void e(float f) {
        co3 co3Var = (co3) this.b;
        snc sncVar = (snc) this.c;
        if (co3Var == sncVar.f) {
            sncVar.e(f);
        }
    }

    @Override
    public final void f(String str) {
        ((snc) this.c).p((co3) this.b, str, -1);
    }

    @Override
    public final String g() {
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.b);
        sb.append("|");
        File file = (File) this.c;
        sb.append(file.length());
        sb.append("|");
        sb.append(file.lastModified());
        return sb.toString();
    }

    @Override
    public final void h(int i, String str) {
        ((snc) this.c).p((co3) this.b, str, i);
    }

    @Override
    public final void i(String str) {
        co3 co3Var = (co3) this.b;
        snc sncVar = (snc) this.c;
        if (co3Var == sncVar.f) {
            sncVar.i(str);
        }
    }

    @Override
    public final Closeable j(MediaExtractor mediaExtractor) {
        mediaExtractor.setDataSource((String) this.b);
        return null;
    }

    public final void k(f89 f89Var, l09 l09Var) {
        qs qsVar = (qs) this.b;
        mhc mhcVar = (mhc) qsVar.get(f89Var);
        if (mhcVar == null) {
            mhcVar = mhc.a();
            qsVar.put(f89Var, mhcVar);
        }
        mhcVar.c = l09Var;
        mhcVar.a |= 8;
    }

    public final void l(p93 p93Var) {
        synchronized (p93Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new ufc(this, p93Var, (byte) 1));
        }
    }

    public final String m(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                str2 = (String) ((fgb) arrayList.get(i)).a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        if (str2 == null) {
            return hgb.k(str, (Attributes) this.c);
        }
        return str2;
    }

    public final java.lang.Integer n(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7b.n(java.lang.String):java.lang.Integer");
    }

    public final boolean o() {
        uqc uqcVar = (uqc) this.c;
        if (uqcVar.M0 <= 0.0f && !uqcVar.t0()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onComplete(Task task) {
        switch (this.a) {
            case 9:
                y3d y3dVar = (y3d) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                synchronized (y3dVar.f) {
                    y3dVar.e.remove(taskCompletionSource);
                }
                return;
            default:
                ((Map) ((zhc) this.c).c).remove((TaskCompletionSource) this.b);
                return;
        }
    }

    public final l09 p(f89 f89Var, int i) {
        mhc mhcVar;
        l09 l09Var;
        qs qsVar = (qs) this.b;
        int d = qsVar.d(f89Var);
        if (d >= 0 && (mhcVar = (mhc) qsVar.i(d)) != null) {
            int i2 = mhcVar.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                mhcVar.a = i3;
                if (i == 4) {
                    l09Var = mhcVar.b;
                } else if (i == 8) {
                    l09Var = mhcVar.c;
                } else {
                    lq5.j("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    qsVar.g(d);
                    mhcVar.a = 0;
                    mhcVar.b = null;
                    mhcVar.c = null;
                    mhc.d.r0(mhcVar);
                }
                return l09Var;
            }
        }
        return null;
    }

    public final void q(f89 f89Var) {
        mhc mhcVar = (mhc) ((qs) this.b).get(f89Var);
        if (mhcVar == null) {
            return;
        }
        mhcVar.a &= -2;
    }

    public final void r(f89 f89Var) {
        qs qsVar = (qs) this.b;
        zh6 zh6Var = (zh6) this.c;
        int m = zh6Var.m() - 1;
        while (true) {
            if (m < 0) {
                break;
            } else if (f89Var == zh6Var.n(m)) {
                Object[] objArr = zh6Var.c;
                Object obj = objArr[m];
                Object obj2 = ifd.a;
                if (obj != obj2) {
                    objArr[m] = obj2;
                    zh6Var.a = true;
                }
            } else {
                m--;
            }
        }
        mhc mhcVar = (mhc) qsVar.get(f89Var);
        if (mhcVar != null) {
            qsVar.remove(f89Var);
            mhcVar.a = 0;
            mhcVar.b = null;
            mhcVar.c = null;
            mhc.d.r0(mhcVar);
        }
    }

    public final void s(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new z5b(this, obj, SystemClock.elapsedRealtime(), (byte) 13));
        }
    }

    public final void t(ggc ggcVar) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new g9c(this, ggcVar, (byte) 17));
        }
    }

    @Override
    public final void t0(String str, long j, long j2, long j3) {
        ydd yddVar = (ydd) this.b;
        if (yddVar != null) {
            yddVar.t0(str, j, j2, j3);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 8:
                return "Bounds{lower=" + ((mq5) this.b) + " upper=" + ((mq5) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public final Object zzp() {
        boolean z;
        Map map;
        zad zadVar = (zad) this.b;
        iad iadVar = (iad) this.c;
        iadVar.getClass();
        if (zad.e()) {
            z = ((Boolean) zad.c(new mt2("gms:phenotype:phenotype_flag:debug_disable_caching", (byte) 3))).booleanValue();
        } else {
            z = false;
        }
        if (z) {
            map = iadVar.a();
        } else {
            map = iadVar.e;
        }
        if (map == null) {
            synchronized (iadVar.d) {
                Map map2 = iadVar.e;
                map = map2;
                if (map2 == null) {
                    HashMap a = iadVar.a();
                    iadVar.e = a;
                    map = a;
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(zadVar.b);
    }

    @Override
    public final void c(usb usbVar, g84 g84Var, l6c l6cVar) {
    }

    public k7b(Context context) {
        this.a = (byte) 16;
        this.b = context;
    }

    public k7b(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public k7b(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public k7b(String str, List list) {
        this.a = (byte) 22;
        this.b = str;
        this.c = list;
    }

    public k7b(zhc zhcVar, TaskCompletionSource taskCompletionSource) {
        this.a = (byte) 12;
        this.b = taskCompletionSource;
        Objects.requireNonNull(zhcVar);
        this.c = zhcVar;
    }

    public k7b(kxc kxcVar) {
        this.a = (byte) 20;
        this.b = kxcVar == null ? null : kxcVar.b;
    }

    public k7b(byte b) {
        this.a = b;
        switch (b) {
            case 17:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                return;
            default:
                this.b = new vla(0);
                this.c = new zh6();
                return;
        }
    }

    public k7b(Handler handler, vfc vfcVar) {
        this.a = (byte) 4;
        if (vfcVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = vfcVar;
    }

    public k7b(snc sncVar) {
        this.a = (byte) 6;
        this.c = sncVar;
    }

    public k7b(j6c j6cVar) {
        this.a = (byte) 3;
        this.c = j6cVar;
        this.b = new zd1(4, new byte[4]);
    }

    public k7b(byte b, boolean z) {
        this.a = b;
    }
}
