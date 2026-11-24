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
public final class xl3 implements kt8, ILocationServiceProvider, fo5, sq4, ca7, ru9, ibc, f48, x79 {
    public final byte a;
    public Object b;
    public Object c;
    public Object d;

    public xl3(xf4 xf4Var, x9c x9cVar, wd7 wd7Var) {
        ge7 ge7Var;
        int i;
        int i2;
        boolean z;
        byte b;
        this.a = (byte) 21;
        this.c = xf4Var;
        this.d = new ArrayList();
        wd7 wd7Var2 = wd7Var;
        byte b2 = 0;
        int i3 = 0;
        while (true) {
            ge7Var = ge7.ECI;
            if (wd7Var2 == null) {
                break;
            }
            int i4 = wd7Var2.c;
            int i5 = b2 + wd7Var2.d;
            wd7 wd7Var3 = wd7Var2.e;
            int i6 = i3;
            ge7 ge7Var2 = wd7Var2.a;
            if ((ge7Var2 == ge7.BYTE && wd7Var3 == null && i4 != 0) || (wd7Var3 != null && i4 != wd7Var3.c)) {
                z = true;
            } else {
                z = false;
            }
            i = z ? 1 : i6;
            if (wd7Var3 != null && wd7Var3.a == ge7Var2 && !z) {
                b = i5;
            } else {
                ((ArrayList) this.d).add(0, new xd7(this, ge7Var2, wd7Var2.b, i4, i5));
                b = 0;
            }
            if (z) {
                ((ArrayList) this.d).add(0, new xd7(this, ge7Var, wd7Var2.b, wd7Var2.c, 0));
            }
            i3 = i;
            wd7Var2 = wd7Var3;
            b2 = b;
        }
        int i7 = i3;
        boolean z2 = xf4Var.a;
        w34 w34Var = (w34) xf4Var.d;
        if (z2) {
            xd7 xd7Var = (xd7) ((ArrayList) this.d).get(0);
            if (xd7Var != null && xd7Var.a != ge7Var && i7 != 0) {
                ((ArrayList) this.d).add(0, new xd7(this, ge7Var, 0, 0, 0));
            }
            ((ArrayList) this.d).add(((xd7) ((ArrayList) this.d).get(0)).a == ge7Var ? 1 : 0, new xd7(this, ge7.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i8 = x9cVar.a;
        int i9 = 26;
        if (i8 <= 9) {
            i2 = 1;
        } else if (i8 <= 26) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        int F = ug8.F(i2);
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
        int y = y(x9cVar);
        while (i8 < i9 && !p24.d(y, x9c.c(i8), w34Var)) {
            i8++;
        }
        while (i8 > i && p24.d(y, x9c.c(i8 - 1), w34Var)) {
            i8--;
        }
        this.b = x9c.c(i8);
    }

    public static StringBuilder D(String str) {
        StringBuilder sb;
        String[] strArr;
        boolean z;
        byte[] H;
        char c;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            boolean z2 = false;
            boolean z3 = false;
            xl3 xl3Var = null;
            String str2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (!readLine.startsWith("PHOTO")) {
                    z3 = z3;
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            xl3Var = new xl3((byte) 19, z2);
                            xl3Var.d = new ArrayList();
                            xl3Var.b = new ArrayList();
                            z3 = z3;
                        } else {
                            z3 = z3;
                            z3 = z3;
                            if (readLine.startsWith("END:VCARD") && xl3Var != null) {
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
                        if (strArr.length >= 2 && xl3Var != null) {
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
                                xl3Var.c = strArr[1];
                                if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = gl.H(gl.g1((String) xl3Var.c))) != null && H.length != 0) {
                                    xl3Var.c = new String(H, str4);
                                }
                                xl3Var.c = ((String) xl3Var.c).replace(';', ' ');
                            } else {
                                ?? r17 = z2 ? 1 : 0;
                                if (strArr[r17].startsWith("TEL")) {
                                    z = r17;
                                    if (strArr[1].length() > 0) {
                                        ((ArrayList) xl3Var.b).add(strArr[1]);
                                        z = r17;
                                    }
                                } else {
                                    boolean startsWith = strArr[r17].startsWith("EMAIL");
                                    z = r17;
                                    if (startsWith) {
                                        String str5 = strArr[1];
                                        z = r17;
                                        if (str5.length() > 0) {
                                            ((ArrayList) xl3Var.d).add(str5);
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
                fa4.g(e, true);
            }
            if (!z3) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = i2; i3 < ((ArrayList) xl3Var.b).size(); i3++) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                String str6 = (String) ((ArrayList) xl3Var.b).get(i3);
                if (!str6.contains("#") && !str6.contains("*")) {
                    sb2.append(p38.f().e(str6));
                } else {
                    sb2.append(str6);
                }
            }
            for (int i4 = i2; i4 < ((ArrayList) xl3Var.d).size(); i4++) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(p38.f().e((String) ((ArrayList) xl3Var.d).get(i4)));
            }
            if (!TextUtils.isEmpty((String) xl3Var.c)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append((String) xl3Var.c);
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
        return tb4.y(str, "?", sb2);
    }

    public final boolean A() {
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

    public final void B(String str, String str2) {
        ((HashMap) this.d).put(str, str2);
    }

    public final String C() {
        if (A()) {
            String str = (String) this.c;
            this.c = null;
            return str;
        }
        w26.g();
        return null;
    }

    public final void E(va9 va9Var, Serializable serializable) {
        EnumMap enumMap = (EnumMap) this.d;
        if (enumMap == null) {
            enumMap = new EnumMap(va9.class);
            this.d = enumMap;
        }
        enumMap.put((EnumMap) va9Var, (va9) serializable);
    }

    public final void F(ra0 ra0Var, int i, boolean z) {
        Long l;
        char c;
        ja0 ja0Var = (ja0) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = ra0Var.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        cj8 cj8Var = ra0Var.c;
        adler32.update(allocate.putInt(dj8.a(cj8Var)).array());
        byte[] bArr = ra0Var.b;
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
                        xne.a(ra0Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((lo9) this.c).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(dj8.a(cj8Var))});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            long longValue = l.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(ja0Var.a(cj8Var, longValue, i));
            Set set = ((ka0) ja0Var.b.get(cj8Var)).c;
            Long l2 = l;
            if (set.contains(mq9.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(mq9.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(mq9.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", dj8.a(cj8Var));
            if (bArr != null) {
                c = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            } else {
                c = 0;
            }
            builder.setExtras(persistableBundle);
            Integer valueOf = Integer.valueOf(value);
            Long valueOf2 = Long.valueOf(ja0Var.a(cj8Var, longValue, i));
            Integer valueOf3 = Integer.valueOf(i);
            Object[] objArr = new Object[5];
            objArr[c] = ra0Var;
            objArr[1] = valueOf;
            objArr[2] = valueOf2;
            objArr[3] = l2;
            objArr[4] = valueOf3;
            String c2 = xne.c("JobInfoScheduler");
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
        ((pp1) this.b).c(false);
        ((d) this.c).presentFragment(new mu1((Bundle) this.d));
    }

    @Override
    public final void b(xu7 xu7Var) {
        long d;
        long j;
        ((uob) this.c).getClass();
        String str = g8c.a;
        uob uobVar = (uob) this.c;
        synchronized (uobVar) {
            long j2 = uobVar.c;
            if (j2 != -9223372036854775807L) {
                d = j2 + uobVar.b;
            } else {
                d = uobVar.d();
            }
            j = d;
        }
        long e = ((uob) this.c).e();
        if (j != -9223372036854775807L && e != -9223372036854775807L) {
            fm4 fm4Var = (fm4) this.b;
            if (e != fm4Var.y) {
                em4 a = fm4Var.a();
                a.x = e;
                fm4 fm4Var2 = new fm4(a);
                this.b = fm4Var2;
                ((wxb) this.d).g(fm4Var2);
            }
            int a2 = xu7Var.a();
            ((wxb) this.d).e(a2, xu7Var);
            ((wxb) this.d).a(j, 1, a2, 0, null);
        }
    }

    @Override
    public final void c(uob uobVar, l74 l74Var, l2c l2cVar) {
        this.c = uobVar;
        l2cVar.a();
        l2cVar.b();
        wxb S = l74Var.S(l2cVar.d, 5);
        this.d = S;
        S.g((fm4) this.b);
    }

    @Override
    public final void checkLocationSettings(oh5 oh5Var, vs2 vs2Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((oy4) oh5Var).a);
        u84 u84Var = (u84) this.c;
        jb6 jb6Var = new jb6(arrayList, false, false);
        u84Var.getClass();
        agb b = bgb.b();
        b.a = new v39(jb6Var, (byte) 27);
        b.d = (char) 2426;
        u84Var.e(0, b.a()).addOnCompleteListener(new ky4(vs2Var, (byte) 1));
    }

    @Override
    public final boolean checkServices() {
        return b.b.hasServices();
    }

    @Override
    public final void d() {
        p8c p8cVar;
        boolean[] zArr = (boolean[]) this.b;
        if (!zArr[0] && (p8cVar = (p8c) this.c) != null) {
            zArr[0] = true;
            p8cVar.a(Boolean.TRUE);
        }
        gl.d3(new i((u21) this.d, (byte) 1), 200L);
    }

    @Override
    public final void e(ArrayList arrayList) {
        String str;
        if (!arrayList.isEmpty()) {
            str = ((y3a) arrayList.get(0)).c;
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 == null) {
            return;
        }
        Utilities.e.c(new bm8(str2, (q8c) this.b, (d) this.c, (p8c) this.d, (byte) 5));
    }

    @Override
    public final Uri f() {
        return (Uri) this.b;
    }

    @Override
    public final Object mo9get() {
        Context context = (Context) ((mo5) this.b).a;
        sw2 sw2Var = (sw2) ((mo5) this.c).a;
        x5a x5aVar = (x5a) ((kt8) this.d).mo9get();
        context.getClass();
        sw2Var.getClass();
        x5aVar.getClass();
        return hh4.a(x5aVar, new ln8(new z1(x5aVar, (byte) 4), (byte) 5), h9e.a(sw2Var), new gh4(context, (byte) 1));
    }

    @Override
    public final ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override
    public final void getLastLocation(vs2 vs2Var) {
        u84 u84Var = (u84) this.b;
        u84Var.getClass();
        agb b = bgb.b();
        b.a = c6e.d;
        b.d = (char) 2414;
        u84Var.e(0, b.a()).addOnCompleteListener(new ky4(vs2Var, (byte) 0));
    }

    @Override
    public final Uri i() {
        return (Uri) this.d;
    }

    @Override
    public final void init(Context context) {
        yn ynVar = ib6.a;
        yn ynVar2 = u84.r;
        ay4 ay4Var = ay4.c;
        un unVar = vn.g;
        this.b = new by4(context, ynVar2, unVar, ay4Var);
        this.c = new by4(context, ynVar2, unVar, ay4Var);
    }

    @Override
    public final void k(Throwable th) {
        lw6 lw6Var = (lw6) this.d;
        ps psVar = lw6Var.h;
        mw6 mw6Var = (mw6) this.b;
        Future future = (Future) psVar.remove(mw6Var);
        lw6Var.i.remove(mw6Var);
    }

    @Override
    public final Object l() {
        return null;
    }

    @Override
    public final void m(boolean z) {
        ((pp1) this.b).c(false);
        ((d) this.c).presentFragment(new mu1((Bundle) this.d));
    }

    public final void o() {
        mv6 mv6Var = (mv6) this.b;
        if (mv6Var != null) {
            int i = ((ux4) this.d).n.d;
            zu6 zu6Var = (zu6) mv6Var.b;
            zu6Var.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            zu6Var.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    @Override
    public final oh5 onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        ?? obj = new Object();
        obj.a = locationRequest;
        return obj;
    }

    @Override
    public final ph5 onCreateLocationServicesAPI(Context context, lh5 lh5Var, final mh5 mh5Var) {
        List list;
        boolean z;
        Context context2 = a.b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ?? aiaVar = new aia(0);
        Object aiaVar2 = new aia(0);
        Object obj = cy4.d;
        op5 op5Var = n2d.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        yn ynVar = ib6.a;
        fre.i(ynVar, "Api must not be null");
        ph5 ph5Var = null;
        aiaVar2.put(ynVar, null);
        switch (ynVar.a.a) {
            case 9:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new my4(lh5Var));
        arrayList2.add(new fy4() {
            @Override
            public final void onConnectionFailed(ds2 ds2Var) {
                eb6 eb6Var = (eb6) mh5.this;
                if (!eb6Var.M) {
                    eb6Var.L = Boolean.FALSE;
                    if (eb6Var.E) {
                        eb6Var.E = false;
                        eb6Var.p();
                    }
                }
            }
        });
        boolean z2 = true;
        fre.a("must call addApi() to add at least one API", !aiaVar2.isEmpty());
        gha ghaVar = gha.a;
        yn ynVar2 = n2d.b;
        if (aiaVar2.containsKey(ynVar2)) {
            ghaVar = (gha) aiaVar2.get(ynVar2);
        }
        ntb ntbVar = new ntb(hashSet, aiaVar, packageName, name, ghaVar);
        Map map = (Map) ntbVar.c;
        aia aiaVar3 = new aia(0);
        aia aiaVar4 = new aia(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((ns) aiaVar2.keySet()).iterator();
        yn ynVar3 = null;
        while (true) {
            ms msVar = (ms) it;
            if (msVar.hasNext()) {
                ph5 ph5Var2 = ph5Var;
                yn ynVar4 = (yn) msVar.next();
                Object obj2 = aiaVar2.get(ynVar4);
                if (map.get(ynVar4) != null) {
                    z = z2;
                } else {
                    z = false;
                }
                aiaVar3.put(ynVar4, Boolean.valueOf(z));
                aia aiaVar5 = aiaVar4;
                Looper looper = mainLooper;
                h3d h3dVar = new h3d(ynVar4, z);
                arrayList3.add(h3dVar);
                ArrayList arrayList4 = arrayList3;
                Map map2 = map;
                ntb ntbVar2 = ntbVar;
                Object obj3 = aiaVar2;
                aia aiaVar6 = aiaVar3;
                xx4 a = ynVar4.a.a(context2, looper, ntbVar2, obj2, h3dVar, h3dVar);
                aiaVar5.put(ynVar4.b, a);
                xx4 xx4Var = a;
                xx4Var.getClass();
                if (xx4Var instanceof z3d) {
                    if (ynVar3 == null) {
                        mainLooper = looper;
                        ntbVar = ntbVar2;
                        aiaVar4 = aiaVar5;
                        ynVar3 = ynVar4;
                        map = map2;
                        aiaVar3 = aiaVar6;
                        aiaVar2 = obj3;
                        arrayList3 = arrayList4;
                        z2 = true;
                        ph5Var = ph5Var2;
                    } else {
                        String str = ynVar4.c;
                        String str2 = ynVar3.c;
                        sc8.j(ls6.o(str, " cannot be used with ", str2, new StringBuilder(str.length() + 21 + str2.length())));
                        return ph5Var2;
                    }
                } else {
                    ph5Var = ph5Var2;
                    mainLooper = looper;
                    ntbVar = ntbVar2;
                    aiaVar4 = aiaVar5;
                    map = map2;
                    aiaVar3 = aiaVar6;
                    aiaVar2 = obj3;
                    arrayList3 = arrayList4;
                    z2 = true;
                }
            } else {
                ntb ntbVar3 = ntbVar;
                ?? r17 = aiaVar3;
                ?? r11 = aiaVar4;
                ArrayList arrayList5 = arrayList3;
                ph5 ph5Var3 = ph5Var;
                Looper looper2 = mainLooper;
                if (ynVar3 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str3 = ynVar3.c;
                    if (!equals) {
                        sc8.j(tb4.y("Must not set scopes in GoogleApiClient.Builder when using ", str3, ". Set account in GoogleSignInOptions.Builder instead."));
                        return ph5Var3;
                    }
                }
                m1d m1dVar = new m1d(context2, new ReentrantLock(), looper2, ntbVar3, r17, arrayList, arrayList2, r11, m1d.f(r11.values(), true), arrayList5);
                Set set = gy4.a;
                synchronized (set) {
                    set.add(m1dVar);
                }
                ?? obj4 = new Object();
                obj4.a = m1dVar;
                return obj4;
            }
        }
    }

    @Override
    public final void onError(lbc lbcVar, Exception exc) {
        d6b d6bVar = ((zi8) this.d).O;
        if (d6bVar != null) {
            d6bVar.run();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        f4b f4bVar = (f4b) this.b;
        Runnable[] runnableArr = (Runnable[]) this.c;
        zi8 zi8Var = (zi8) this.d;
        n00 n00Var = zi8Var.I;
        if (n00Var != null && n00Var.g) {
            int i = zi8Var.f;
            int i2 = zi8Var.h;
            n00Var.d = true;
            n00Var.e = i;
            n00Var.f = i2;
            ur4 ur4Var = (ur4) n00Var.c;
            if (ur4Var != null) {
                ur4Var.a(Integer.valueOf(i), Integer.valueOf(n00Var.f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            zi8Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = zi8Var.a;
            if (bitmap != null) {
                bitmap.recycle();
                if (f4bVar.M0 == zi8Var.a) {
                    f4bVar.M0 = null;
                }
                zi8Var.a = null;
                zi8Var.invalidate();
                return;
            }
            return;
        }
        kac kacVar = zi8Var.n;
        if (kacVar != null) {
            if (n00Var == null || !n00Var.g) {
                kacVar.animate().alpha(1.0f).setDuration(180L).withEndAction(new h18(this, f4bVar, (byte) 22)).start();
            }
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        zi8 zi8Var = (zi8) this.d;
        lbc lbcVar = zi8Var.e;
        if (lbcVar == null) {
            return;
        }
        boolean c0 = lbcVar.c0();
        yi8 yi8Var = zi8Var.L;
        if (c0) {
            gl.c3(yi8Var);
        } else {
            gl.r(yi8Var);
        }
    }

    @Override
    public final void onSuccess(Object obj) {
        qu6 qu6Var = (qu6) obj;
        Future future = (Future) ((lw6) this.d).h.remove((mw6) this.b);
        List<kw6> list = (List) ((lw6) this.d).i.remove((mw6) this.b);
        if (!((lw6) this.d).j.i() && qu6Var != null) {
            mv6 mv6Var = ((lw6) this.d).g;
            su6 su6Var = (su6) this.c;
            mv6Var.g(su6Var.a, su6Var, qu6Var.a, qu6Var.b);
            tv6 tv6Var = ((lw6) this.d).j;
            su6 su6Var2 = (su6) this.c;
            if (!tv6Var.x || !tv6.j(su6Var2)) {
                tv6Var.e.getClass();
            }
            lw6 lw6Var = (lw6) this.d;
            c1 c1Var = lw6Var.m;
            su6 su6Var3 = (su6) this.c;
            long j = lw6Var.t;
            c1Var.removeMessages(1001, su6Var3);
            c1Var.sendMessageDelayed(c1Var.obtainMessage(1001, su6Var3), j);
            if (list != null) {
                for (kw6 kw6Var : list) {
                    try {
                        kw6Var.a((su6) this.c);
                    } catch (RemoteException e) {
                        lad.g("MediaSessionLegacyStub", "Exception in " + ((su6) this.c), e);
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
        ((zi8) this.d).h();
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        zi8 zi8Var = (zi8) this.d;
        f4b f4bVar = (f4b) this.b;
        if (f4bVar != null) {
            e4b V = zi8Var.e.V(f4bVar.d1);
            f4bVar.d1 = V;
            kac kacVar = zi8Var.n;
            if (kacVar != null) {
                kacVar.setHDRInfo(V);
            }
        }
        int i4 = (int) (i * f);
        zi8Var.f = i4;
        int i5 = (int) (i2 * f);
        zi8Var.h = i5;
        if (f4bVar != null && (f4bVar.k0 != i4 || f4bVar.l0 != i5)) {
            f4bVar.k0 = i4;
            f4bVar.l0 = i5;
            f4bVar.z();
        }
        zi8Var.a();
        kac kacVar2 = zi8Var.n;
        if (kacVar2 != null) {
            int i6 = zi8Var.f;
            int i7 = zi8Var.h;
            kacVar2.d = i6;
            kacVar2.e = i7;
            td4 td4Var = kacVar2.b;
            if (td4Var != null) {
                td4Var.postRunnable(new qd4(td4Var, i6, i7, (byte) 0));
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

    @Override
    public final synchronized void removeLocationUpdates(nh5 nh5Var) {
        ly4 ly4Var = (ly4) ((HashMap) this.d).remove(nh5Var);
        if (ly4Var != null) {
            u84 u84Var = (u84) this.b;
            u84Var.getClass();
            String simpleName = ly4.class.getSimpleName();
            fre.g(simpleName, "Listener type must not be empty");
            u84Var.c(new u56(ly4Var, simpleName), 2418).continueWith(wn3.c, ie7.e);
        }
    }

    @Override
    public final synchronized void requestLocationUpdates(oh5 oh5Var, nh5 nh5Var) {
        ly4 ly4Var = (ly4) ((HashMap) this.d).remove(nh5Var);
        if (ly4Var != null) {
            u84 u84Var = (u84) this.b;
            u84Var.getClass();
            String simpleName = ly4.class.getSimpleName();
            fre.g(simpleName, "Listener type must not be empty");
            u84Var.c(new u56(ly4Var, simpleName), 2418).continueWith(wn3.c, ie7.e);
        }
        ly4 ly4Var2 = new ly4(nh5Var);
        ((HashMap) this.d).put(nh5Var, ly4Var2);
        ((u84) this.b).j(((oy4) oh5Var).a, ly4Var2, Looper.getMainLooper());
    }

    public final void s(Canvas canvas, RectF rectF, int i, float f) {
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

    public final ng5 t() {
        HttpsURLConnection httpsURLConnection;
        mv6.t();
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
                return new ng5(responseCode, sb);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public final String toString() {
        int i = 0;
        switch (this.a) {
            case 0:
                return ((vl3) this.b).a + ":" + ((String) this.c);
            case 10:
                StringBuilder sb = new StringBuilder("id3v2tag[pos=");
                zy8 zy8Var = (zy8) this.b;
                sb.append(zy8Var.b);
                sb.append(", ");
                sb.append(zy8Var.e());
                sb.append(" left]");
                return sb.toString();
            case 13:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=false, isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=true, prettyPrintIndent='" + ((String) this.c) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.b) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=true, namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((nh2) this.d) + ')';
            case 21:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                xd7 xd7Var = null;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    xd7 xd7Var2 = (xd7) obj;
                    if (xd7Var != null) {
                        sb2.append(",");
                    }
                    sb2.append(xd7Var2.toString());
                    xd7Var = xd7Var2;
                }
                return sb2.toString();
            case 22:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.c);
                sb3.append('{');
                wk4 wk4Var = (wk4) this.b;
                String str = "";
                while (true) {
                    wk4Var = (wk4) wk4Var.c;
                    if (wk4Var != null) {
                        Object obj2 = wk4Var.b;
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

    public final String u() {
        String str = (String) this.c;
        int indexOf = str.indexOf(44);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public final eh5 v(fh5 fh5Var) {
        InflaterInputStream inflaterInputStream;
        int i = fh5Var.c;
        InputStream inputStream = (zy8) this.b;
        if (fh5Var.d) {
            z24 z24Var = (z24) this.d;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = ((a51) z24Var.b).read(bArr, i2, i - i2);
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
        if (!fh5Var.f) {
            if (fh5Var.e) {
                i = fh5Var.g;
                inflaterInputStream = new InflaterInputStream(inputStream);
            } else {
                inflaterInputStream = inputStream;
            }
            return new eh5(inflaterInputStream, fh5Var.b, i, (hh5) this.c, fh5Var);
        }
        throw new Exception("Frame encryption is not supported");
    }

    public final ByteBuffer w() {
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

    public final Paint x(float f, int i) {
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

    public final int y(x9c x9cVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            xd7 xd7Var = (xd7) obj;
            int i3 = xd7Var.d;
            ge7 ge7Var = xd7Var.a;
            int a = ge7Var.a(x9cVar);
            int i4 = a + 4;
            int ordinal = ge7Var.ordinal();
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
                        i4 += xd7Var.a() << 3;
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

    public final boolean z() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xl3.z():boolean");
    }

    @Override
    public final void g() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void onSeekFinished(tj tjVar) {
    }

    @Override
    public final void onSeekStarted(tj tjVar) {
    }

    @Override
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    public xl3(ViewGroup viewGroup, Object obj, Object obj2, byte b) {
        this.a = b;
        this.d = viewGroup;
        this.b = obj;
        this.c = obj2;
    }

    public xl3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
    }

    public xl3(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public xl3(byte b) {
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
                this.d = nh2.a;
                return;
            default:
                this.b = new Object();
                this.c = null;
                this.d = null;
                return;
        }
    }

    public xl3(InputStream inputStream, long j, int i, hh5 hh5Var) {
        this.a = (byte) 10;
        zy8 zy8Var = new zy8(inputStream, j, i);
        this.b = zy8Var;
        this.d = new z24(zy8Var, (byte) 9);
        this.c = hh5Var;
    }

    public xl3(String str, HashMap hashMap) {
        this.a = (byte) 9;
        this.c = str;
        this.b = hashMap;
        this.d = new HashMap();
    }

    public xl3(String str, wa9[] wa9VarArr) {
        this.a = (byte) 27;
        System.currentTimeMillis();
        this.c = str;
        this.b = wa9VarArr;
        this.d = null;
    }

    public xl3(FirebaseMessagingService firebaseMessagingService, z24 z24Var, ExecutorService executorService) {
        this.a = (byte) 1;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = z24Var;
    }

    public xl3(Runnable runnable) {
        this.a = (byte) 18;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public xl3(String str, byte b) {
        this.a = b;
        switch (b) {
            case 23:
                em4 em4Var = new em4();
                em4Var.r = ud7.n("video/mp2t");
                em4Var.s = ud7.n(str);
                this.b = new fm4(em4Var);
                return;
            default:
                wk4 wk4Var = new wk4((byte) 12);
                this.b = wk4Var;
                this.d = wk4Var;
                this.c = str;
                return;
        }
    }

    public xl3(Signature signature) {
        this.a = (byte) 2;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public xl3(Cipher cipher) {
        this.a = (byte) 2;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public xl3(Mac mac) {
        this.a = (byte) 2;
        this.d = mac;
        this.c = null;
        this.b = null;
    }

    public xl3(byte b, boolean z) {
        this.a = b;
    }

    public xl3(lw6 lw6Var, mw6 mw6Var, iw6 iw6Var, su6 su6Var) {
        this.a = (byte) 17;
        this.d = lw6Var;
        this.b = mw6Var;
        this.c = su6Var;
    }
}
