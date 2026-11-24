package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.location.LocationRequest;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.StringReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.Signature;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.Adler32;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.net.ssl.HttpsURLConnection;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.ui.ActionBar.d;
public final class in3 implements lv8, ILocationServiceProvider, fq5, ts4, dc7, uw9, ldc, i68, z99 {
    public final byte a;
    public Object b;
    public Object c;
    public Object d;

    public in3(yh4 yh4Var, ybc ybcVar, yf7 yf7Var) {
        ig7 ig7Var;
        int i;
        int i2;
        boolean z;
        byte b;
        this.a = (byte) 21;
        this.c = yh4Var;
        this.d = new ArrayList();
        yf7 yf7Var2 = yf7Var;
        byte b2 = 0;
        int i3 = 0;
        while (true) {
            ig7Var = ig7.ECI;
            if (yf7Var2 == null) {
                break;
            }
            int i4 = yf7Var2.c;
            int i5 = b2 + yf7Var2.d;
            yf7 yf7Var3 = yf7Var2.e;
            int i6 = i3;
            ig7 ig7Var2 = yf7Var2.a;
            if ((ig7Var2 == ig7.BYTE && yf7Var3 == null && i4 != 0) || (yf7Var3 != null && i4 != yf7Var3.c)) {
                z = true;
            } else {
                z = false;
            }
            i = z ? 1 : i6;
            if (yf7Var3 != null && yf7Var3.a == ig7Var2 && !z) {
                b = i5;
            } else {
                ((ArrayList) this.d).add(0, new zf7(this, ig7Var2, yf7Var2.b, i4, i5));
                b = 0;
            }
            if (z) {
                ((ArrayList) this.d).add(0, new zf7(this, ig7Var, yf7Var2.b, yf7Var2.c, 0));
            }
            i3 = i;
            yf7Var2 = yf7Var3;
            b2 = b;
        }
        int i7 = i3;
        boolean z2 = yh4Var.a;
        g54 g54Var = (g54) yh4Var.d;
        if (z2) {
            zf7 zf7Var = (zf7) ((ArrayList) this.d).get(0);
            if (zf7Var != null && zf7Var.a != ig7Var && i7 != 0) {
                ((ArrayList) this.d).add(0, new zf7(this, ig7Var, 0, 0, 0));
            }
            ((ArrayList) this.d).add(((zf7) ((ArrayList) this.d).get(0)).a == ig7Var ? 1 : 0, new zf7(this, ig7.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i8 = ybcVar.a;
        int i9 = 26;
        if (i8 <= 9) {
            i2 = 1;
        } else if (i8 <= 26) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        int F = wi8.F(i2);
        if (F != 0) {
            if (F != 1) {
                i = 27;
                i9 = 40;
            } else {
                i = 10;
            }
        } else {
            i9 = 9;
        }
        int x = x(ybcVar);
        while (i8 < i9 && !a44.d(x, ybc.c(i8), g54Var)) {
            i8++;
        }
        while (i8 > i && a44.d(x, ybc.c(i8 - 1), g54Var)) {
            i8--;
        }
        this.b = ybc.c(i8);
    }

    public static StringBuilder C(String str) {
        StringBuilder sb;
        String[] strArr;
        boolean z;
        byte[] H;
        char c;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            boolean z2 = false;
            boolean z3 = false;
            in3 in3Var = null;
            String str2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (!readLine.startsWith("PHOTO")) {
                    z3 = z3;
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            in3Var = new in3((byte) 19, z2);
                            in3Var.d = new ArrayList();
                            in3Var.b = new ArrayList();
                            z3 = z3;
                        } else {
                            z3 = z3;
                            z3 = z3;
                            if (readLine.startsWith("END:VCARD") && in3Var != null) {
                                z3 = true;
                            }
                        }
                    }
                    if (str2 != null) {
                        readLine = str2 + readLine;
                        str2 = null;
                    }
                    if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                        str2 = readLine.substring(z2 ? 1 : 0, readLine.length() - 1);
                    } else {
                        int indexOf = readLine.indexOf(":");
                        if (indexOf >= 0) {
                            strArr = new String[]{readLine.substring(z2 ? 1 : 0, indexOf), readLine.substring(indexOf + 1).trim()};
                        } else {
                            strArr = new String[]{readLine.trim()};
                        }
                        if (strArr.length >= 2 && in3Var != null) {
                            if (strArr[z2 ? 1 : 0].startsWith("ORG")) {
                                String[] split = strArr[z2 ? 1 : 0].split(";");
                                int length = split.length;
                                int i = z2 ? 1 : 0;
                                String str3 = null;
                                String str4 = null;
                                char c2 = z2;
                                while (i < length) {
                                    String[] split2 = split[i].split("=");
                                    sb = null;
                                    try {
                                        if (split2.length != 2) {
                                            c = c2;
                                        } else {
                                            c = c2;
                                            if (split2[c2].equals("CHARSET")) {
                                                str4 = split2[1];
                                            } else if (split2[c].equals("ENCODING")) {
                                                str3 = split2[1];
                                            }
                                        }
                                        i++;
                                        c2 = c;
                                    } catch (Throwable unused) {
                                        return sb;
                                    }
                                }
                                z = c2;
                                in3Var.c = strArr[1];
                                if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = gm.H(gm.g1((String) in3Var.c))) != null && H.length != 0) {
                                    in3Var.c = new String(H, str4);
                                }
                                in3Var.c = ((String) in3Var.c).replace(';', ' ');
                            } else {
                                ?? r17 = z2 ? 1 : 0;
                                if (strArr[r17].startsWith("TEL")) {
                                    z = r17;
                                    if (strArr[1].length() > 0) {
                                        ((ArrayList) in3Var.b).add(strArr[1]);
                                        z = r17;
                                    }
                                } else {
                                    boolean startsWith = strArr[r17].startsWith("EMAIL");
                                    z = r17;
                                    if (startsWith) {
                                        String str5 = strArr[1];
                                        z = r17;
                                        if (str5.length() > 0) {
                                            ((ArrayList) in3Var.d).add(str5);
                                            z = r17;
                                        }
                                    }
                                }
                            }
                        } else {
                            z = z2 ? 1 : 0;
                        }
                        z2 = z;
                    }
                }
                return sb;
            }
            int i2 = z2 ? 1 : 0;
            sb = null;
            try {
                bufferedReader.close();
            } catch (Exception e) {
                fc4.g(e, true);
            }
            if (!z3) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = i2; i3 < ((ArrayList) in3Var.b).size(); i3++) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                String str6 = (String) ((ArrayList) in3Var.b).get(i3);
                if (!str6.contains("#") && !str6.contains("*")) {
                    sb2.append(r58.f().e(str6));
                } else {
                    sb2.append(str6);
                }
            }
            for (int i4 = i2; i4 < ((ArrayList) in3Var.d).size(); i4++) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(r58.f().e((String) ((ArrayList) in3Var.d).get(i4)));
            }
            if (!TextUtils.isEmpty((String) in3Var.c)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append((String) in3Var.c);
            }
            return sb2;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static String q(String str, HashMap hashMap) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        if (entry.getValue() == null) {
            str2 = "";
        } else {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            if (entry2.getValue() == null) {
                str3 = "";
            } else {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb.append(str3);
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb2 = "&".concat(sb2);
            }
            return str.concat(sb2);
        }
        return kt6.o(str, "?", sb2);
    }

    public final void A(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public final String B() {
        if (z()) {
            String str = (String) this.c;
            this.c = null;
            return str;
        }
        u36.g();
        return null;
    }

    public final void D(vc9 vc9Var, Serializable serializable) {
        EnumMap enumMap = (EnumMap) this.d;
        if (enumMap == null) {
            enumMap = new EnumMap(vc9.class);
            this.d = enumMap;
        }
        enumMap.put((EnumMap) vc9Var, (vc9) serializable);
    }

    public final void E(rb0 rb0Var, int i, boolean z) {
        Long l;
        char c;
        jb0 jb0Var = (jb0) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = rb0Var.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        fl8 fl8Var = rb0Var.c;
        adler32.update(allocate.putInt(gl8.a(fl8Var)).array());
        byte[] bArr = rb0Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        aqe.a(rb0Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((mq9) this.c).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(gl8.a(fl8Var))});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            long longValue = l.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(jb0Var.a(fl8Var, longValue, i));
            Set set = ((kb0) jb0Var.b.get(fl8Var)).c;
            Long l2 = l;
            if (set.contains(ns9.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(ns9.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(ns9.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", gl8.a(fl8Var));
            if (bArr != null) {
                c = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf = Integer.valueOf(value);
            Long valueOf2 = Long.valueOf(jb0Var.a(fl8Var, longValue, i));
            Integer valueOf3 = Integer.valueOf(i);
            Object[] objArr = new Object[5];
            objArr[c] = rb0Var;
            objArr[1] = valueOf;
            objArr[2] = valueOf2;
            objArr[3] = l2;
            objArr[4] = valueOf3;
            String c2 = aqe.c("JobInfoScheduler");
            if (Log.isLoggable(c2, 3)) {
                Log.d(c2, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override
    public final void a() {
        ((cr1) this.b).c(false);
        ((d) this.c).presentFragment(new yv1((Bundle) this.d));
    }

    @Override
    public final void b(yw7 yw7Var) {
        long d;
        long j;
        ((vqb) this.c).getClass();
        String str = hac.a;
        vqb vqbVar = (vqb) this.c;
        synchronized (vqbVar) {
            long j2 = vqbVar.c;
            if (j2 != -9223372036854775807L) {
                d = j2 + vqbVar.b;
            } else {
                d = vqbVar.d();
            }
            j = d;
        }
        long e = ((vqb) this.c).e();
        if (j != -9223372036854775807L && e != -9223372036854775807L) {
            go4 go4Var = (go4) this.b;
            if (e != go4Var.y) {
                fo4 a = go4Var.a();
                a.x = e;
                go4 go4Var2 = new go4(a);
                this.b = go4Var2;
                ((yzb) this.d).g(go4Var2);
            }
            int a2 = yw7Var.a();
            ((yzb) this.d).e(a2, yw7Var);
            ((yzb) this.d).a(j, 1, a2, 0, null);
        }
    }

    @Override
    public final void c(vqb vqbVar, u84 u84Var, l4c l4cVar) {
        this.c = vqbVar;
        l4cVar.a();
        l4cVar.b();
        yzb c0 = u84Var.c0(l4cVar.d, 5);
        this.d = c0;
        c0.g((go4) this.b);
    }

    @Override
    public final void checkLocationSettings(nj5 nj5Var, gu2 gu2Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((o05) nj5Var).a);
        ua4 ua4Var = (ua4) this.c;
        id6 id6Var = new id6(arrayList, false, false);
        ua4Var.getClass();
        bib b = cib.b();
        b.a = new fkd(id6Var, (byte) 0);
        b.d = (char) 2426;
        ua4Var.e(0, b.a()).addOnCompleteListener(new l05(gu2Var, (byte) 1));
    }

    @Override
    public final boolean checkServices() {
        return b.b.hasServices();
    }

    @Override
    public final void d() {
        qac qacVar;
        boolean[] zArr = (boolean[]) this.b;
        if (!zArr[0] && (qacVar = (qac) this.c) != null) {
            zArr[0] = true;
            qacVar.a(Boolean.TRUE);
        }
        gm.d3(new i((c41) this.d, (byte) 1), 200L);
    }

    @Override
    public final Uri e() {
        return (Uri) this.b;
    }

    @Override
    public final Object mo8get() {
        Context context = (Context) ((lq5) this.b).a;
        cy2 cy2Var = (cy2) ((lq5) this.c).a;
        z7a z7aVar = (z7a) ((lv8) this.d).mo8get();
        context.getClass();
        cy2Var.getClass();
        z7aVar.getClass();
        return jj4.a(z7aVar, new ai4(new z1(z7aVar, (byte) 4), (byte) 28), ibe.a(cy2Var), new ij4(context, (byte) 1));
    }

    @Override
    public final ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override
    public final void getLastLocation(gu2 gu2Var) {
        ua4 ua4Var = (ua4) this.b;
        ua4Var.getClass();
        bib b = cib.b();
        b.a = f8e.d;
        b.d = (char) 2414;
        ua4Var.e(0, b.a()).addOnCompleteListener(new l05(gu2Var, (byte) 0));
    }

    @Override
    public final Uri h() {
        return (Uri) this.d;
    }

    @Override
    public final void init(Context context) {
        zo zoVar = hd6.a;
        zo zoVar2 = ua4.r;
        b05 b05Var = b05.c;
        vo voVar = wo.g;
        this.b = new c05(context, zoVar2, voVar, b05Var);
        this.c = new c05(context, zoVar2, voVar, b05Var);
    }

    @Override
    public final void j(Throwable th) {
        ly6 ly6Var = (ly6) this.d;
        qt qtVar = ly6Var.h;
        my6 my6Var = (my6) this.b;
        Future future = (Future) qtVar.remove(my6Var);
        ly6Var.i.remove(my6Var);
    }

    @Override
    public final Object k() {
        return null;
    }

    @Override
    public final void l(boolean z) {
        ((cr1) this.b).c(false);
        ((d) this.c).presentFragment(new yv1((Bundle) this.d));
    }

    @Override
    public final void m(ArrayList arrayList) {
        String str;
        if (!arrayList.isEmpty()) {
            str = ((z5a) arrayList.get(0)).c;
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 == null) {
            return;
        }
        Utilities.e.c(new no8(str2, (rac) this.b, (d) this.c, (qac) this.d, (byte) 5));
    }

    public final void o() {
        mx6 mx6Var = (mx6) this.b;
        if (mx6Var != null) {
            int i = ((wz4) this.d).n.d;
            zw6 zw6Var = (zw6) mx6Var.b;
            zw6Var.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            zw6Var.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    @Override
    public final nj5 onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        ?? obj = new Object();
        obj.a = locationRequest;
        return obj;
    }

    @Override
    public final oj5 onCreateLocationServicesAPI(Context context, kj5 kj5Var, final lj5 lj5Var) {
        List list;
        boolean z;
        Context context2 = a.b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ?? ckaVar = new cka(0);
        Object ckaVar2 = new cka(0);
        Object obj = d05.d;
        or5 or5Var = p4d.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        zo zoVar = hd6.a;
        ite.i(zoVar, "Api must not be null");
        oj5 oj5Var = null;
        ckaVar2.put(zoVar, null);
        switch (zoVar.a.a) {
            case 9:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new n05(kj5Var));
        arrayList2.add(new g05() {
            @Override
            public final void onConnectionFailed(ot2 ot2Var) {
                dd6 dd6Var = (dd6) lj5.this;
                if (!dd6Var.M) {
                    dd6Var.L = Boolean.FALSE;
                    if (dd6Var.E) {
                        dd6Var.E = false;
                        dd6Var.p();
                    }
                }
            }
        });
        boolean z2 = true;
        ite.a("must call addApi() to add at least one API", !ckaVar2.isEmpty());
        ija ijaVar = ija.a;
        zo zoVar2 = p4d.b;
        if (ckaVar2.containsKey(zoVar2)) {
            ijaVar = (ija) ckaVar2.get(zoVar2);
        }
        ovb ovbVar = new ovb(hashSet, ckaVar, packageName, name, ijaVar);
        Map map = (Map) ovbVar.c;
        cka ckaVar3 = new cka(0);
        cka ckaVar4 = new cka(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((ot) ckaVar2.keySet()).iterator();
        zo zoVar3 = null;
        while (true) {
            nt ntVar = (nt) it;
            if (ntVar.hasNext()) {
                oj5 oj5Var2 = oj5Var;
                zo zoVar4 = (zo) ntVar.next();
                Object obj2 = ckaVar2.get(zoVar4);
                if (map.get(zoVar4) != null) {
                    z = z2;
                } else {
                    z = false;
                }
                ckaVar3.put(zoVar4, Boolean.valueOf(z));
                cka ckaVar5 = ckaVar4;
                Looper looper = mainLooper;
                j5d j5dVar = new j5d(zoVar4, z);
                arrayList3.add(j5dVar);
                ArrayList arrayList4 = arrayList3;
                Map map2 = map;
                ovb ovbVar2 = ovbVar;
                Object obj3 = ckaVar2;
                cka ckaVar6 = ckaVar3;
                zz4 a = zoVar4.a.a(context2, looper, ovbVar2, obj2, j5dVar, j5dVar);
                ckaVar5.put(zoVar4.b, a);
                zz4 zz4Var = a;
                zz4Var.getClass();
                if (zz4Var instanceof b6d) {
                    if (zoVar3 == null) {
                        mainLooper = looper;
                        ovbVar = ovbVar2;
                        ckaVar4 = ckaVar5;
                        zoVar3 = zoVar4;
                        map = map2;
                        ckaVar3 = ckaVar6;
                        ckaVar2 = obj3;
                        arrayList3 = arrayList4;
                        z2 = true;
                        oj5Var = oj5Var2;
                    } else {
                        String str = zoVar4.c;
                        String str2 = zoVar3.c;
                        dq9.m(kt6.p(str, " cannot be used with ", str2, new StringBuilder(str.length() + 21 + str2.length())));
                        return oj5Var2;
                    }
                } else {
                    oj5Var = oj5Var2;
                    mainLooper = looper;
                    ovbVar = ovbVar2;
                    ckaVar4 = ckaVar5;
                    map = map2;
                    ckaVar3 = ckaVar6;
                    ckaVar2 = obj3;
                    arrayList3 = arrayList4;
                    z2 = true;
                }
            } else {
                ovb ovbVar3 = ovbVar;
                ?? r17 = ckaVar3;
                ?? r11 = ckaVar4;
                ArrayList arrayList5 = arrayList3;
                oj5 oj5Var3 = oj5Var;
                Looper looper2 = mainLooper;
                if (zoVar3 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str3 = zoVar3.c;
                    if (!equals) {
                        dq9.m(kt6.o("Must not set scopes in GoogleApiClient.Builder when using ", str3, ". Set account in GoogleSignInOptions.Builder instead."));
                        return oj5Var3;
                    }
                }
                o3d o3dVar = new o3d(context2, new ReentrantLock(), looper2, ovbVar3, r17, arrayList, arrayList2, r11, o3d.f(r11.values(), true), arrayList5);
                Set set = h05.a;
                synchronized (set) {
                    set.add(o3dVar);
                }
                ?? obj4 = new Object();
                obj4.a = o3dVar;
                return obj4;
            }
        }
    }

    @Override
    public final void onError(ndc ndcVar, Exception exc) {
        f8b f8bVar = ((cl8) this.d).O;
        if (f8bVar != null) {
            f8bVar.run();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        g6b g6bVar = (g6b) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        cl8 cl8Var = (cl8) this.d;
        n10 n10Var = cl8Var.I;
        if (n10Var != null && n10Var.g) {
            int i = cl8Var.f;
            int i2 = cl8Var.h;
            n10Var.d = true;
            n10Var.e = i;
            n10Var.f = i2;
            vt4 vt4Var = (vt4) n10Var.c;
            if (vt4Var != null) {
                vt4Var.a(Integer.valueOf(i), Integer.valueOf(n10Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            cl8Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = cl8Var.a;
            if (bitmap != null) {
                bitmap.recycle();
                if (g6bVar.M0 == cl8Var.a) {
                    g6bVar.M0 = null;
                }
                cl8Var.a = null;
                cl8Var.invalidate();
                return;
            }
            return;
        }
        ncc nccVar = cl8Var.n;
        if (nccVar != null) {
            if (n10Var == null || !n10Var.g) {
                nccVar.animate().alpha(1.0f).setDuration(180L).withEndAction(new a18(this, g6bVar, (byte) 23)).start();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        cl8 cl8Var = (cl8) this.d;
        ndc ndcVar = cl8Var.e;
        if (ndcVar == null) {
            return;
        }
        boolean c0 = ndcVar.c0();
        bl8 bl8Var = cl8Var.L;
        if (c0) {
            gm.c3(bl8Var);
        } else {
            gm.r(bl8Var);
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        qw6 qw6Var = (qw6) obj;
        Future future = (Future) ((ly6) this.d).h.remove((my6) this.b);
        List<ky6> list = (List) ((ly6) this.d).i.remove((my6) this.b);
        if (!((ly6) this.d).j.i() && qw6Var != null) {
            mx6 mx6Var = ((ly6) this.d).g;
            sw6 sw6Var = (sw6) this.c;
            mx6Var.b(sw6Var.a, sw6Var, qw6Var.a, qw6Var.b);
            tx6 tx6Var = ((ly6) this.d).j;
            sw6 sw6Var2 = (sw6) this.c;
            if (!tx6Var.x || !tx6.j(sw6Var2)) {
                tx6Var.e.getClass();
            }
            ly6 ly6Var = (ly6) this.d;
            c1 c1Var = ly6Var.m;
            sw6 sw6Var3 = (sw6) this.c;
            long j = ly6Var.t;
            c1Var.removeMessages(1001, sw6Var3);
            c1Var.sendMessageDelayed(c1Var.obtainMessage(1001, sw6Var3), j);
            if (list != null) {
                for (ky6 ky6Var : list) {
                    try {
                        ky6Var.a((sw6) this.c);
                    } catch (RemoteException e) {
                        ncd.g("MediaSessionLegacyStub", "Exception in " + ((sw6) this.c), e);
                    }
                }
            }
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((cl8) this.d).h();
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        cl8 cl8Var = (cl8) this.d;
        g6b g6bVar = (g6b) this.b;
        if (g6bVar != null) {
            f6b V = cl8Var.e.V(g6bVar.d1);
            g6bVar.d1 = V;
            ncc nccVar = cl8Var.n;
            if (nccVar != null) {
                nccVar.setHDRInfo(V);
            }
        }
        int i4 = (int) (i * f);
        cl8Var.f = i4;
        int i5 = (int) (i2 * f);
        cl8Var.h = i5;
        if (g6bVar != null && (g6bVar.k0 != i4 || g6bVar.l0 != i5)) {
            g6bVar.k0 = i4;
            g6bVar.l0 = i5;
            g6bVar.z();
        }
        cl8Var.a();
        ncc nccVar2 = cl8Var.n;
        if (nccVar2 != null) {
            int i6 = cl8Var.f;
            int i7 = cl8Var.h;
            nccVar2.d = i6;
            nccVar2.e = i7;
            uf4 uf4Var = nccVar2.b;
            if (uf4Var != null) {
                uf4Var.postRunnable(new rf4(uf4Var, i6, i7, (byte) 0));
            }
        }
    }

    public final void p(Canvas canvas, RectF rectF, float f) {
        Paint[] paintArr = (Paint[]) this.b;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader((LinearGradient) this.c);
        paintArr[0].setAlpha((int) (f * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    public final void r(Canvas canvas, RectF rectF, int i, float f) {
        Paint[] paintArr = (Paint[]) this.b;
        Matrix matrix = (Matrix) this.d;
        if (f <= 0.0f) {
            return;
        }
        if (((LinearGradient) this.c) == null) {
            this.c = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (paintArr[i] == null) {
            Paint paint = new Paint(1);
            paintArr[i] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i].setShader((LinearGradient) this.c);
        matrix.reset();
        if (i == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        ((LinearGradient) this.c).setLocalMatrix(matrix);
        paintArr[i].setAlpha((int) (255.0f * f));
        canvas.drawRect(rectF, paintArr[i]);
    }

    @Override
    public final synchronized void removeLocationUpdates(mj5 mj5Var) {
        m05 m05Var = (m05) ((HashMap) this.d).remove(mj5Var);
        if (m05Var != null) {
            ua4 ua4Var = (ua4) this.b;
            ua4Var.getClass();
            String simpleName = m05.class.getSimpleName();
            ite.g(simpleName, "Listener type must not be empty");
            ua4Var.c(new u76(m05Var, simpleName), 2418).continueWith(gp3.c, kg7.e);
        }
    }

    @Override
    public final synchronized void requestLocationUpdates(nj5 nj5Var, mj5 mj5Var) {
        m05 m05Var = (m05) ((HashMap) this.d).remove(mj5Var);
        if (m05Var != null) {
            ua4 ua4Var = (ua4) this.b;
            ua4Var.getClass();
            String simpleName = m05.class.getSimpleName();
            ite.g(simpleName, "Listener type must not be empty");
            ua4Var.c(new u76(m05Var, simpleName), 2418).continueWith(gp3.c, kg7.e);
        }
        m05 m05Var2 = new m05(mj5Var);
        ((HashMap) this.d).put(mj5Var, m05Var2);
        ((ua4) this.b).j(((o05) nj5Var).a, m05Var2, Looper.getMainLooper());
    }

    public final mi5 s() {
        HttpsURLConnection httpsURLConnection;
        mx6.x();
        InputStream inputStream = null;
        String sb = null;
        inputStream = null;
        try {
            String q = q((String) this.c, (HashMap) this.b);
            String concat = "GET Request URL: ".concat(q);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", concat, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(q).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, read);
                        }
                        sb = sb2.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new mi5(responseCode, sb);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public final String t() {
        String str = (String) this.c;
        int indexOf = str.indexOf(44);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public final String toString() {
        int i = 0;
        switch (this.a) {
            case 0:
                return ((gn3) this.b).a + ":" + ((String) this.c);
            case 10:
                StringBuilder sb = new StringBuilder("id3v2tag[pos=");
                a19 a19Var = (a19) this.b;
                sb.append(a19Var.b);
                sb.append(", ");
                sb.append(a19Var.e());
                sb.append(" left]");
                return sb.toString();
            case 13:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=true, prettyPrintIndent='" + ((String) this.c) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.b) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=true, namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((bj2) this.d) + ')';
            case 21:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                zf7 zf7Var = null;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zf7 zf7Var2 = (zf7) obj;
                    if (zf7Var != null) {
                        sb2.append(",");
                    }
                    sb2.append(zf7Var2.toString());
                    zf7Var = zf7Var2;
                }
                return sb2.toString();
            case 22:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.c);
                sb3.append('{');
                wm4 wm4Var = (wm4) this.b;
                String str = "";
                while (true) {
                    wm4Var = (wm4) wm4Var.c;
                    if (wm4Var != null) {
                        Object obj2 = wm4Var.b;
                        sb3.append(str);
                        if (obj2 != null && obj2.getClass().isArray()) {
                            String deepToString = Arrays.deepToString(new Object[]{obj2});
                            sb3.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                        } else {
                            sb3.append(obj2);
                        }
                        str = ", ";
                    } else {
                        sb3.append('}');
                        return sb3.toString();
                    }
                }
                break;
            case 27:
                return (String) this.c;
            default:
                return super.toString();
        }
    }

    public final dj5 u(ej5 ej5Var) {
        InflaterInputStream inflaterInputStream;
        int i = ej5Var.c;
        InputStream inputStream = (a19) this.b;
        if (ej5Var.d) {
            ai4 ai4Var = (ai4) this.d;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = ((h61) ai4Var.b).read(bArr, i2, i - i2);
                if (read > 0) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (!z || b != 0) {
                    bArr[i3] = b;
                    i3++;
                }
                if (b == -1) {
                    z = true;
                } else {
                    z = false;
                }
            }
            inputStream = new ByteArrayInputStream(bArr, 0, i3);
            i = i3;
        }
        if (!ej5Var.f) {
            if (ej5Var.e) {
                i = ej5Var.g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new dj5(inflaterInputStream, ej5Var.b, i, (gj5) this.c, ej5Var);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public final ByteBuffer v() {
        Bitmap bitmap = (Bitmap) this.d;
        if (bitmap != null) {
            if (bitmap == null) {
                return null;
            }
            int width = bitmap.getWidth();
            int height = ((Bitmap) this.d).getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            ((Bitmap) this.d).getPixels(iArr, 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) ((Color.blue(iArr[i2]) * 0.114f) + (Color.green(iArr[i2]) * 0.587f) + (Color.red(iArr[i2]) * 0.299f));
            }
            return ByteBuffer.wrap(bArr);
        }
        return (ByteBuffer) this.c;
    }

    public final Paint w(float f, int i) {
        Paint[] paintArr = (Paint[]) this.b;
        if (paintArr[i] == null) {
            Paint paint = new Paint(1);
            paintArr[i] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i].setShader(null);
        paintArr[i].setColor(-65536);
        paintArr[i].setAlpha((int) (f * 255.0f));
        return paintArr[i];
    }

    public final int x(ybc ybcVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zf7 zf7Var = (zf7) obj;
            int i3 = zf7Var.d;
            ig7 ig7Var = zf7Var.a;
            int a = ig7Var.a(ybcVar);
            int i4 = a + 4;
            int ordinal = ig7Var.ordinal();
            int i5 = 4;
            if (ordinal != 1) {
                int i6 = 6;
                if (ordinal != 2) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal == 6) {
                                i4 += i3 * 13;
                            }
                        } else {
                            i4 = a + 12;
                        }
                    } else {
                        i4 += zf7Var.a() << 3;
                    }
                } else {
                    int i7 = ((i3 / 2) * 11) + i4;
                    if (i3 % 2 != 1) {
                        i6 = 0;
                    }
                    i4 = i7 + i6;
                }
            } else {
                int i8 = ((i3 / 3) * 10) + i4;
                int i9 = i3 % 3;
                if (i9 != 1) {
                    if (i9 == 2) {
                        i5 = 7;
                    } else {
                        i5 = 0;
                    }
                }
                i4 = i8 + i5;
            }
            i += i4;
        }
        return i;
    }

    public final boolean y() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in3.y():boolean");
    }

    public final boolean z() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (((String) this.c) != null) {
            return true;
        }
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.c = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.b).readLine();
            this.c = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.c = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void t0() {
    }

    @Override
    public final void onSeekFinished(tk tkVar) {
    }

    @Override
    public final void onSeekStarted(tk tkVar) {
    }

    @Override
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    public in3(ViewGroup viewGroup, Object obj, Object obj2, byte b) {
        this.a = b;
        this.d = viewGroup;
        this.b = obj;
        this.c = obj2;
    }

    public in3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
    }

    public in3(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public in3(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.d = new HashMap();
                return;
            case 7:
                this.b = new Paint[4];
                this.d = new Matrix();
                return;
            case 13:
                this.c = "    ";
                this.b = "type";
                this.d = bj2.a;
                return;
            default:
                this.b = new Object();
                this.c = null;
                this.d = null;
                return;
        }
    }

    public in3(InputStream inputStream, long j, int i, gj5 gj5Var) {
        this.a = (byte) 10;
        a19 a19Var = new a19(inputStream, j, i);
        this.b = a19Var;
        this.d = new ai4(a19Var, (byte) 7);
        this.c = gj5Var;
    }

    public in3(String str, HashMap hashMap) {
        this.a = (byte) 9;
        this.c = str;
        this.b = hashMap;
        this.d = new HashMap();
    }

    public in3(String str, wc9[] wc9VarArr) {
        this.a = (byte) 27;
        System.currentTimeMillis();
        this.c = str;
        this.b = wc9VarArr;
        this.d = null;
    }

    public in3(FirebaseMessagingService firebaseMessagingService, ai4 ai4Var, ExecutorService executorService) {
        this.a = (byte) 1;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = ai4Var;
    }

    public in3(Runnable runnable) {
        this.a = (byte) 18;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public in3(String str, byte b) {
        this.a = b;
        switch (b) {
            case 23:
                fo4 fo4Var = new fo4();
                fo4Var.r = wf7.n("video/mp2t");
                fo4Var.s = wf7.n(str);
                this.b = new go4(fo4Var);
                return;
            default:
                wm4 wm4Var = new wm4((byte) 12);
                this.b = wm4Var;
                this.d = wm4Var;
                this.c = str;
                return;
        }
    }

    public in3(Signature signature) {
        this.a = (byte) 2;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public in3(Cipher cipher) {
        this.a = (byte) 2;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public in3(Mac mac) {
        this.a = (byte) 2;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public in3(byte b, boolean z) {
        this.a = b;
    }

    public in3(ly6 ly6Var, my6 my6Var, iy6 iy6Var, sw6 sw6Var) {
        this.a = (byte) 17;
        this.d = ly6Var;
        this.b = my6Var;
        this.c = sw6Var;
    }
}
