package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
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
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.xml.sax.Attributes;
public final class xab implements uw9, uo3, OnCompleteListener, h89, iad, hbd {
    public final byte a;
    public Object b;
    public Object c;

    public xab(Attributes attributes, HashMap hashMap) {
        this.a = (byte) 1;
        this.c = attributes;
        String k = neb.k("style", attributes);
        if (k != null) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(new leb(k));
            return;
        }
        String k2 = neb.k("class", attributes);
        if (k2 != null) {
            this.b = new ArrayList();
            for (String str : k2.split(" ")) {
                leb lebVar = (leb) hashMap.get(str.trim());
                if (lebVar != null) {
                    ((ArrayList) this.b).add(lebVar);
                }
            }
        }
    }

    public static String r(xab xabVar) {
        List<String> list = (List) xabVar.c;
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) xabVar.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb.append("/");
                sb.append(upperCase);
            } else {
                u36.j("Invalid application ID: ".concat(str));
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
                    qe1.b(str2);
                    if (!z) {
                        sb.append(",");
                    }
                    if (!qe1.a.matcher(str2).matches()) {
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
                u36.j("Must specify at least one namespace");
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
        glc glcVar = (glc) this.c;
        vo3 vo3Var = (vo3) this.b;
        if (!glcVar.J) {
            if (vo3Var == glcVar.f) {
                glcVar.a(str, str2);
            }
        } else if (vo3Var == glcVar.U) {
            glcVar.U = null;
            if (!str.isEmpty()) {
                glcVar.v(vo3Var, str);
            }
            glcVar.h();
            Log.d("VoiceLive", "field: final words in (" + glcVar.L.size() + " words)");
            glcVar.p();
        } else if (vo3Var != glcVar.f) {
        } else {
            Log.d("VoiceLive", "field: recogniser ended by itself error=" + str2);
            if (!str.isEmpty()) {
                glcVar.v(vo3Var, str);
            }
            glcVar.f = null;
            if (zze.a == glcVar) {
                zze.a = null;
            }
            glcVar.d = null;
            glcVar.e = null;
            glcVar.h();
            glcVar.p();
        }
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        int i;
        switch (this.a) {
            case 10:
                b5d b5dVar = new b5d((ua4) this.b, (TaskCompletionSource) obj2, (byte) 1);
                s4d s4dVar = (s4d) ((p5d) obj).k();
                Parcel c = s4dVar.c();
                g4d.c(c, b5dVar);
                g4d.b(c, (ep) this.c);
                c.writeStrongBinder(null);
                s4dVar.d(c, 2);
                return;
            default:
                ua4 ua4Var = (ua4) this.b;
                dpd dpdVar = (dpd) obj;
                y0e y0eVar = new y0e(ua4Var, (TaskCompletionSource) obj2);
                Context context = ua4Var.a;
                try {
                    i = s0d.a(context).b(0, context.getPackageName()).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                    i = 0;
                }
                m79 m79Var = (m79) this.c;
                m79Var.f = i;
                fvd fvdVar = (fvd) dpdVar.k();
                hp hpVar = new hp(new uq2(-1, -1, 0, true), true);
                hpVar.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
                int i2 = mid.a;
                obtain.writeStrongBinder(y0eVar);
                obtain.writeInt(1);
                m79Var.writeToParcel(obtain, 0);
                obtain.writeInt(1);
                hpVar.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    fvdVar.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
        }
    }

    @Override
    public final void b(yw7 yw7Var) {
        j4c j4cVar = (j4c) this.c;
        SparseArray sparseArray = j4cVar.h;
        ye1 ye1Var = (ye1) this.b;
        if (yw7Var.A() == 0 && (yw7Var.A() & 128) != 0) {
            yw7Var.O(6);
            int a = yw7Var.a() / 4;
            for (int i = 0; i < a; i++) {
                yw7Var.k(0, 4, ye1Var.b);
                ye1Var.l(0);
                int f = ye1Var.f(16);
                ye1Var.n(3);
                if (f == 0) {
                    ye1Var.n(13);
                } else {
                    int f2 = ye1Var.f(13);
                    if (sparseArray.get(f2) == null) {
                        sparseArray.put(f2, new vw9(new e0c(j4cVar, f2)));
                        j4cVar.n++;
                    }
                }
            }
            if (j4cVar.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override
    public final void c0(String str, long j, int i, tad tadVar, long j2, long j3) {
        int i2;
        abd abdVar = (abd) this.c;
        if (((hbd) this.b) != null) {
            if (i == 2001) {
                Object[] objArr = {Integer.valueOf(abdVar.i)};
                ce6 ce6Var = abdVar.a;
                Log.w(ce6Var.a, ce6Var.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((k89) abdVar.h.b).i.iterator();
                while (it.hasNext()) {
                    ((j89) it.next()).o();
                }
                i2 = 2001;
            } else {
                i2 = i;
            }
            ((hbd) this.b).c0(str, j, i2, tadVar, j2, j3);
        }
    }

    @Override
    public final void d(float f) {
        vo3 vo3Var = (vo3) this.b;
        glc glcVar = (glc) this.c;
        if (vo3Var == glcVar.f) {
            glcVar.d(f);
        }
    }

    @Override
    public final void e(String str) {
        ((glc) this.c).o((vo3) this.b, str, -1);
    }

    @Override
    public final void f(int i, String str) {
        ((glc) this.c).o((vo3) this.b, str, i);
    }

    @Override
    public final void g(String str) {
        vo3 vo3Var = (vo3) this.b;
        glc glcVar = (glc) this.c;
        if (vo3Var == glcVar.f) {
            glcVar.g(str);
        }
    }

    public final void h(u69 u69Var, az8 az8Var) {
        qt qtVar = (qt) this.b;
        ofc ofcVar = (ofc) qtVar.get(u69Var);
        if (ofcVar == null) {
            ofcVar = ofc.a();
            qtVar.put(u69Var, ofcVar);
        }
        ofcVar.c = az8Var;
        ofcVar.a |= 8;
    }

    public final void i(ia3 ia3Var) {
        synchronized (ia3Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new xdc(this, ia3Var, (byte) 1));
        }
    }

    public final String j(String str) {
        ArrayList arrayList = (ArrayList) this.b;
        String str2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                str2 = (String) ((leb) arrayList.get(i)).a.get(str);
                if (str2 != null) {
                    break;
                }
            }
        }
        if (str2 == null) {
            return neb.k(str, (Attributes) this.c);
        }
        return str2;
    }

    public final java.lang.Integer k(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xab.k(java.lang.String):java.lang.Integer");
    }

    public final boolean l() {
        goc gocVar = (goc) this.c;
        if (gocVar.M0 <= 0.0f && !gocVar.u0()) {
            return false;
        }
        return true;
    }

    public final az8 m(u69 u69Var, int i) {
        ofc ofcVar;
        az8 az8Var;
        qt qtVar = (qt) this.b;
        int d = qtVar.d(u69Var);
        if (d >= 0 && (ofcVar = (ofc) qtVar.i(d)) != null) {
            int i2 = ofcVar.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                ofcVar.a = i3;
                if (i == 4) {
                    az8Var = ofcVar.b;
                } else if (i == 8) {
                    az8Var = ofcVar.c;
                } else {
                    u36.j("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    qtVar.g(d);
                    ofcVar.a = 0;
                    ofcVar.b = null;
                    ofcVar.c = null;
                    ofc.d.p0(ofcVar);
                }
                return az8Var;
            }
        }
        return null;
    }

    public final void n(u69 u69Var) {
        ofc ofcVar = (ofc) ((qt) this.b).get(u69Var);
        if (ofcVar == null) {
            return;
        }
        ofcVar.a &= -2;
    }

    public final void o(u69 u69Var) {
        qt qtVar = (qt) this.b;
        vh6 vh6Var = (vh6) this.c;
        int m = vh6Var.m() - 1;
        while (true) {
            if (m < 0) {
                break;
            } else if (u69Var == vh6Var.n(m)) {
                Object[] objArr = vh6Var.c;
                Object obj = objArr[m];
                Object obj2 = rcd.a;
                if (obj != obj2) {
                    objArr[m] = obj2;
                    vh6Var.a = true;
                }
            } else {
                m--;
            }
        }
        ofc ofcVar = (ofc) qtVar.get(u69Var);
        if (ofcVar != null) {
            qtVar.remove(u69Var);
            ofcVar.a = 0;
            ofcVar.b = null;
            ofcVar.c = null;
            ofc.d.p0(ofcVar);
        }
    }

    @Override
    public final void onComplete(Task task) {
        switch (this.a) {
            case 8:
                i1d i1dVar = (i1d) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                synchronized (i1dVar.f) {
                    i1dVar.e.remove(taskCompletionSource);
                }
                return;
            default:
                ((Map) ((rhb) this.c).c).remove((TaskCompletionSource) this.b);
                return;
        }
    }

    public final void p(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new e4b(this, obj, SystemClock.elapsedRealtime(), (byte) 13));
        }
    }

    public final void q(jec jecVar) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new x4c(this, jecVar, (byte) 23));
        }
    }

    public final String toString() {
        switch (this.a) {
            case 7:
                return "Bounds{lower=" + ((iq5) this.b) + " upper=" + ((iq5) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public final void u0(String str, long j, long j2, long j3) {
        hbd hbdVar = (hbd) this.b;
        if (hbdVar != null) {
            hbdVar.u0(str, j, j2, j3);
        }
    }

    @Override
    public final Object zzp() {
        boolean z;
        Map map;
        i8d i8dVar = (i8d) this.b;
        r7d r7dVar = (r7d) this.c;
        r7dVar.getClass();
        if (i8d.e()) {
            z = ((Boolean) i8d.c(new ld3("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue();
        } else {
            z = false;
        }
        if (z) {
            map = r7dVar.a();
        } else {
            map = r7dVar.e;
        }
        if (map == null) {
            synchronized (r7dVar.d) {
                Map map2 = r7dVar.e;
                map = map2;
                if (map2 == null) {
                    HashMap a = r7dVar.a();
                    r7dVar.e = a;
                    map = a;
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(i8dVar.b);
    }

    @Override
    public final void c(vqb vqbVar, u84 u84Var, l4c l4cVar) {
    }

    public xab(Context context) {
        this.a = (byte) 15;
        this.b = context;
    }

    public xab(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public xab(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public xab(String str, List list) {
        this.a = (byte) 21;
        this.b = str;
        this.c = list;
    }

    public xab(rhb rhbVar, TaskCompletionSource taskCompletionSource) {
        this.a = (byte) 11;
        this.b = taskCompletionSource;
        Objects.requireNonNull(rhbVar);
        this.c = rhbVar;
    }

    public xab(wuc wucVar) {
        this.a = (byte) 19;
        this.b = wucVar == null ? null : wucVar.b;
    }

    public xab(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                return;
            default:
                this.b = new cka(0);
                this.c = new vh6();
                return;
        }
    }

    public xab(Handler handler, ydc ydcVar) {
        this.a = (byte) 3;
        if (ydcVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = ydcVar;
    }

    public xab(glc glcVar) {
        this.a = (byte) 5;
        this.c = glcVar;
    }

    public xab(j4c j4cVar) {
        this.a = (byte) 2;
        this.c = j4cVar;
        this.b = new ye1(4, new byte[4]);
    }

    public xab(byte b, boolean z) {
        this.a = b;
    }
}
