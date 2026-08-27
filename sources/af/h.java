package af;

import a5.n;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.internal.cast.g3;
import com.google.android.gms.internal.cast.i2;
import com.google.android.gms.internal.cast.j1;
import com.google.android.gms.internal.cast.j2;
import com.google.android.gms.internal.cast.k1;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.q1;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.cast.s1;
import com.google.android.gms.internal.cast.t1;
import com.google.android.gms.internal.cast.t6;
import com.google.android.gms.internal.cast.u1;
import com.google.android.gms.internal.cast.u6;
import com.google.android.gms.internal.cast.v1;
import com.google.android.gms.internal.cast.w1;
import com.google.android.gms.internal.cast.x1;
import com.google.android.gms.internal.cast.y1;
import com.google.android.gms.internal.cast.z1;
import d5.g0;
import h9.s0;
import ig.q0;
import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import lh.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.ci1;
import y5.l;
import z8.o;
import z8.q;
import z8.r;

public final class h implements y2.b, vj0, ud.b, r4.g, z8.b {

    public Object f274a;

    public Object f275b;

    public Object f276c;
    public Object d;

    public Object f277e;

    public h(Context context) {
        this(context, new o5.b(-1, 0, 0));
    }

    public static void E(h hVar, u6 u6Var) {
        int i10 = u6Var.f3680e;
        if (i10 == 2 && ((t6) hVar.d) != null) {
            hVar.G();
        }
        if (i10 == 2) {
            hVar.d = new t6((o0) hVar.f274a, (String) hVar.f276c);
        } else {
            hVar.d = hVar.F();
        }
        t6 t6Var = (t6) hVar.d;
        l.h(t6Var);
        u6Var.d = t6Var.h;
        t6Var.f3666b.add(u6Var);
    }

    public static h u(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        h hVar = new h();
        hVar.d = new ArrayDeque();
        hVar.f274a = sharedPreferences;
        hVar.f275b = "topic_operation_queue";
        hVar.f276c = ",";
        hVar.f277e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) hVar.d)) {
            try {
                ((ArrayDeque) hVar.d).clear();
                String string = ((SharedPreferences) hVar.f274a).getString((String) hVar.f275b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) hVar.f276c)) {
                    String[] strArrSplit = string.split((String) hVar.f276c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) hVar.d).add(str);
                        }
                    }
                    return hVar;
                }
                return hVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B() {
        Bitmap bitmap;
        if (((g) this.d) != null) {
            this.d = null;
            View view = (View) this.f275b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((g) this.d) == null && ((g) this.f277e) == null && (bitmap = (Bitmap) this.f276c) != null) {
            bitmap.recycle();
            this.f276c = null;
        }
    }

    public void C(Uri uri) {
        int i10;
        Context context = (Context) this.f274a;
        if (uri == null) {
            D();
            return;
        }
        if (uri.equals((Uri) this.f276c)) {
            return;
        }
        D();
        this.f276c = uri;
        o5.b bVar = (o5.b) this.f275b;
        int i11 = bVar.f19303b;
        if (i11 == 0 || (i10 = bVar.f19304c) == 0) {
            this.d = new p5.b(context, 0, 0, this);
        } else {
            this.d = new p5.b(context, i11, i10, this);
        }
        p5.b bVar2 = (p5.b) this.d;
        l.h(bVar2);
        Uri uri2 = (Uri) this.f276c;
        l.h(uri2);
        bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void D() {
        p5.b bVar = (p5.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.f276c = null;
    }

    public t6 F() {
        if (((t6) this.d) == null) {
            t6 t6Var = new t6((o0) this.f274a, (String) this.f276c);
            this.d = t6Var;
            t6Var.b(1);
        }
        return (t6) this.d;
    }

    public void G() {
        q1 q1Var;
        int i10;
        int i11;
        long jLongValue;
        t6 t6Var = (t6) this.d;
        if (t6Var != null) {
            Map map = t6Var.f3668e;
            List<g3> list = t6Var.d;
            List<com.google.android.gms.internal.cast.b> list2 = t6Var.f3667c;
            List<u6> list3 = t6Var.f3666b;
            n5.c cVar = t6Var.f3672j;
            if (cVar != null) {
                cVar.f18310l = null;
                t6Var.f3672j = null;
            }
            long j10 = t6Var.f3671i;
            q1 q1VarM = r1.m();
            q1VarM.c();
            r1.t((r1) q1VarM.f3502b, j10);
            String str = t6Var.f3674l;
            if (str != null) {
                q1VarM.c();
                r1.y((r1) q1VarM.f3502b, str);
            }
            String str2 = t6Var.f3675m;
            if (str2 != null) {
                q1VarM.c();
                r1.u((r1) q1VarM.f3502b, str2);
            }
            j1 j1VarL = k1.l();
            String str3 = t6.f3663o;
            j1VarL.c();
            k1.n((k1) j1VarL.f3502b, str3);
            String str4 = t6Var.f3670g;
            j1VarL.c();
            k1.m((k1) j1VarL.f3502b, str4);
            k1 k1Var = (k1) j1VarL.a();
            q1VarM.c();
            r1.r((r1) q1VarM.f3502b, k1Var);
            c0 c0Var = t6Var.f3665a;
            w1 w1VarL = x1.l();
            Object objZza = c0Var.zza();
            if (objZza != null) {
                i2 i2VarL = j2.l();
                i2VarL.c();
                j2.m((j2) i2VarL.f3502b, (String) objZza);
                j2 j2Var = (j2) i2VarL.a();
                w1VarL.c();
                x1.m((x1) w1VarL.f3502b, j2Var);
            }
            String str5 = t6Var.f3673k;
            if (str5 != null) {
                try {
                    String strReplace = str5.replace("-", "");
                    jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
                } catch (NumberFormatException e9) {
                    r5.b bVar = t6.f3662n;
                    Log.w(bVar.f46768a, bVar.d("receiverSessionId %s is not valid for hash", str5), e9);
                    jLongValue = 0;
                }
                w1VarL.c();
                x1.n((x1) w1VarL.f3502b, jLongValue);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (u6 u6Var : list3) {
                    u6Var.getClass();
                    u1 u1VarL = v1.l();
                    int i12 = u6Var.f3680e;
                    u1VarL.c();
                    v1.p((v1) u1VarL.f3502b, i12);
                    int i13 = (int) (u6Var.f3678b - u6Var.d);
                    u1VarL.c();
                    v1.m((v1) u1VarL.f3502b, i13);
                    Integer num = u6Var.f3677a;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        u1VarL.c();
                        v1.n((v1) u1VarL.f3502b, iIntValue);
                    }
                    Boolean bool = u6Var.f3679c;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        u1VarL.c();
                        v1.o((v1) u1VarL.f3502b, zBooleanValue);
                    }
                    arrayList.add((v1) u1VarL.a());
                }
                w1VarL.c();
                x1.o((x1) w1VarL.f3502b, arrayList);
            }
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : list2) {
                    bVar2.getClass();
                    a2 a2VarL = b2.l();
                    int i14 = (int) (bVar2.f3444b - bVar2.f3445c);
                    a2VarL.c();
                    b2.m((b2) a2VarL.f3502b, i14);
                    int i15 = bVar2.f3443a;
                    if (i15 == 1) {
                        i11 = 2;
                    } else if (i15 != 2) {
                        i11 = i15 != 3 ? 1 : 4;
                    } else {
                        i11 = 3;
                    }
                    a2VarL.c();
                    b2.n((b2) a2VarL.f3502b, i11);
                    arrayList2.add((b2) a2VarL.a());
                }
                w1VarL.c();
                x1.q((x1) w1VarL.f3502b, arrayList2);
            }
            if (list.isEmpty()) {
                q1Var = q1VarM;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (g3 g3Var : list) {
                    String str6 = g3Var.f3537a;
                    s1 s1VarL = t1.l();
                    switch (str6) {
                        case "queueInsert":
                            i10 = 13;
                            break;
                        case "launch":
                            i10 = 22;
                            break;
                        case "queueRemove":
                            i10 = 15;
                            break;
                        case "queueFetchItems":
                            i10 = 19;
                            break;
                        case "setPlaybackDevices":
                            i10 = 23;
                            break;
                        case "volume-mute":
                            i10 = 9;
                            break;
                        case "skipAd":
                            i10 = 21;
                            break;
                        case "status":
                            i10 = 10;
                            break;
                        case "queueUpdate":
                            i10 = 14;
                            break;
                        case "volume":
                            i10 = 7;
                            break;
                        case "setPlaybackRate":
                            i10 = 20;
                            break;
                        case "load":
                            i10 = 2;
                            break;
                        case "mute":
                            i10 = 8;
                            break;
                        case "play":
                            i10 = 3;
                            break;
                        case "seek":
                            i10 = 6;
                            break;
                        case "stop":
                            i10 = 5;
                            break;
                        case "pause":
                            i10 = 4;
                            break;
                        case "queueFetchItemRange":
                            i10 = 18;
                            break;
                        case "queueReorder":
                            i10 = 16;
                            break;
                        case "trackStyle":
                            i10 = 12;
                            break;
                        case "activeTracks":
                            i10 = 11;
                            break;
                        case "queueFetchItemIds":
                            i10 = 17;
                            break;
                        default:
                            i10 = 1;
                            break;
                    }
                    s1VarL.c();
                    t1.q((t1) s1VarL.f3502b, i10);
                    int i16 = (int) g3Var.f3538b;
                    s1VarL.c();
                    t1.m((t1) s1VarL.f3502b, i16);
                    int i17 = g3Var.f3539c;
                    s1VarL.c();
                    t1.n((t1) s1VarL.f3502b, i17);
                    int i18 = (int) (g3Var.d - g3Var.f3541f);
                    s1VarL.c();
                    t1.o((t1) s1VarL.f3502b, i18);
                    int i19 = (int) (g3Var.f3540e - g3Var.f3541f);
                    s1VarL.c();
                    t1.p((t1) s1VarL.f3502b, i19);
                    arrayList3.add((t1) s1VarL.a());
                    q1VarM = q1VarM;
                }
                q1Var = q1VarM;
                w1VarL.c();
                x1.p((x1) w1VarL.f3502b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.c cVar2 : map.values()) {
                    cVar2.getClass();
                    y1 y1VarL = z1.l();
                    int i20 = cVar2.f3455e;
                    y1VarL.c();
                    z1.p((z1) y1VarL.f3502b, i20);
                    int i21 = cVar2.d.get();
                    y1VarL.c();
                    z1.m((z1) y1VarL.f3502b, i21);
                    int i22 = (int) (cVar2.f3452a - cVar2.f3454c);
                    y1VarL.c();
                    z1.n((z1) y1VarL.f3502b, i22);
                    int i23 = (int) (cVar2.f3453b - cVar2.f3454c);
                    y1VarL.c();
                    z1.o((z1) y1VarL.f3502b, i23);
                    arrayList4.add((z1) y1VarL.a());
                }
                w1VarL.c();
                x1.r((x1) w1VarL.f3502b, arrayList4);
            }
            x1 x1Var = (x1) w1VarL.a();
            q1Var.c();
            r1.q((r1) q1Var.f3502b, x1Var);
            t6Var.f3669f.a((r1) q1Var.a(), 233);
            this.d = null;
        }
    }

    @Override
    public Object a(Class cls) {
        if (!((Set) this.f274a).contains(q.a(cls))) {
            throw new a7.c("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = ((z8.b) this.f277e).a(cls);
        if (!cls.equals(v9.a.class)) {
            return objA;
        }
        return new r();
    }

    @Override
    public Object b(q qVar) {
        if (((Set) this.f274a).contains(qVar)) {
            return ((z8.b) this.f277e).b(qVar);
        }
        throw new a7.c("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override
    public int c(long j10) {
        long[] jArr = (long[]) this.f275b;
        int iB = g0.b(jArr, j10, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override
    public y9.b d(q qVar) {
        if (((Set) this.f275b).contains(qVar)) {
            return ((z8.b) this.f277e).d(qVar);
        }
        throw new a7.c("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    @Override
    public y9.b e(Class cls) {
        return d(q.a(cls));
    }

    @Override
    public long f(int i10) {
        return ((long[]) this.f275b)[i10];
    }

    @Override
    public Set g(q qVar) {
        if (((Set) this.d).contains(qVar)) {
            return ((z8.b) this.f277e).g(qVar);
        }
        throw new a7.c("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    @Override
    public Object mo28get() {
        return new b3.a((Executor) ((oc.a) this.f274a).mo28get(), (x2.d) ((oc.a) this.f275b).mo28get(), (n) ((n) this.f276c).mo28get(), (d3.d) ((oc.a) this.d).mo28get(), (e3.c) ((oc.a) this.f277e).mo28get());
    }

    @Override
    public List h(long j10) {
        y4.d dVar = (y4.d) this.f274a;
        Map map = (Map) this.f276c;
        HashMap map2 = (HashMap) this.d;
        HashMap map3 = (HashMap) this.f277e;
        ArrayList arrayList = new ArrayList();
        dVar.g(j10, dVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        dVar.i(j10, false, dVar.h, treeMap);
        dVar.h(j10, map, map2, dVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Pair pair = (Pair) obj;
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                y4.e eVar = (y4.e) map2.get(pair.first);
                eVar.getClass();
                arrayList2.add(new r4.c(null, null, null, bitmapDecodeByteArray, eVar.f49577c, 0, eVar.f49578e, eVar.f49576b, 0, Integer.MIN_VALUE, -3.4028235E38f, eVar.f49579f, eVar.f49580g, false, -16777216, eVar.f49582j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            y4.e eVar2 = (y4.e) map2.get(entry.getKey());
            eVar2.getClass();
            r4.b bVar = (r4.b) entry.getValue();
            CharSequence charSequence = bVar.f46721a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (y4.a aVar : (y4.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y4.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), (CharSequence) "");
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length(); i11++) {
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
                if (spannableStringBuilder.charAt(i15) == '\n') {
                    int i16 = i15 + 1;
                    if (spannableStringBuilder.charAt(i16) == ' ') {
                        spannableStringBuilder.delete(i16, i15 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i17 = 0; i17 < spannableStringBuilder.length() - 1; i17++) {
                if (spannableStringBuilder.charAt(i17) == ' ') {
                    int i18 = i17 + 1;
                    if (spannableStringBuilder.charAt(i18) == '\n') {
                        spannableStringBuilder.delete(i17, i18);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = eVar2.f49577c;
            int i19 = eVar2.d;
            bVar.f46724e = f10;
            bVar.f46725f = i19;
            bVar.f46726g = eVar2.f49578e;
            bVar.h = eVar2.f49576b;
            bVar.f46730l = eVar2.f49579f;
            float f11 = eVar2.f49581i;
            int i20 = eVar2.h;
            bVar.f46729k = f11;
            bVar.f46728j = i20;
            bVar.f46734p = eVar2.f49582j;
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    @Override
    public o i(q qVar) {
        if (((Set) this.f276c).contains(qVar)) {
            return ((z8.b) this.f277e).i(qVar);
        }
        throw new a7.c("Attempting to request an undeclared dependency Deferred<" + qVar + ">.");
    }

    @Override
    public boolean j() {
        return true;
    }

    public byte[] k() {
        byte[] bArr = (byte[]) this.f275b;
        byte[] bArr2 = (byte[]) this.f274a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = ci1.f37100b;
        BigInteger bigInteger3 = ci1.f37099a;
        BigInteger bigIntegerModPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (bigIntegerModPow.compareTo(bigInteger4) <= 0 || bigIntegerModPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
        }
        byte[] bArrA = ci1.a(bigIntegerModPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        byte[] bArrA2 = ci1.a(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] bArrB = ci1.b(new byte[][]{bArrA2, bArr2, bArr3});
        byte[] bArrB2 = ci1.b(new byte[][]{bArrA2, bArr});
        this.d = bArrB;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "🫵", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "🪩", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "🫧", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 * 8;
            arrayList.add(strArr[(int) (((((long) bArrB2[i11 + 7]) & 255) | ((((((((((long) bArrB2[i11]) & 127) << 56) | ((((long) bArrB2[i11 + 1]) & 255) << 48)) | ((((long) bArrB2[i11 + 2]) & 255) << 40)) | ((((long) bArrB2[i11 + 3]) & 255) << 32)) | ((((long) bArrB2[i11 + 4]) & 255) << 24)) | ((((long) bArrB2[i11 + 5]) & 255) << 16)) | ((((long) bArrB2[i11 + 6]) & 255) << 8))) % ((long) 200))]);
        }
        this.f277e = arrayList;
        FileLog.d("wear-auth: built answer; session " + ci1.d(bArr2) + " emojis=" + ((ArrayList) this.f277e));
        byte[] bArr4 = new byte[288];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(bArrA, 0, bArr4, 32, 256);
        return bArr4;
    }

    public s0 l() {
        String strL = ((Long) this.f274a) == null ? " pc" : "";
        if (((String) this.f275b) == null) {
            strL = strL.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            strL = s3.c.l(strL, " offset");
        }
        if (((Integer) this.f277e) == null) {
            strL = s3.c.l(strL, " importance");
        }
        if (strL.isEmpty()) {
            return new s0(((Long) this.f274a).longValue(), (String) this.f275b, (String) this.f276c, ((Long) this.d).longValue(), ((Integer) this.f277e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void n(View view, q0 q0Var, boolean z10, boolean z11) {
        f6 f6Var = (f6) this.f277e;
        zf.b2 b2Var = f6Var.W1;
        if (b2Var == null) {
            return;
        }
        b2Var.s(q0Var, true);
        f6Var.O0(false);
    }

    @Override
    public void o(int i10, float f10, float f11, ud.c cVar) {
        ((TextView) this.f275b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((ud.a) this.d).f48497e));
        ((sg.c) this.f277e).b(this);
    }

    @Override
    public int p() {
        return ((long[]) this.f275b).length;
    }

    public void q(Canvas canvas, boolean z10, boolean z11, int i10, float f10) {
        RectF rectF = (RectF) this.f275b;
        float[] fArr = (float[]) this.f276c;
        Paint paint = (Paint) this.f277e;
        m3 m3Var = (m3) this.f274a;
        Path path = (Path) this.d;
        int i11 = (int) ((z11 ? 0 : (int) m3Var.C) * f10);
        int iDp = AndroidUtilities.dp(10.0f) * Math.min(1, i11 / AndroidUtilities.dp(60.0f));
        if (i11 <= 0) {
            return;
        }
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f11 = iDp;
        fArr[7] = f11;
        fArr[6] = f11;
        fArr[5] = f11;
        fArr[4] = f11;
        path.rewind();
        rectF.set(0.0f, 0.0f, i10, (m3Var.getY() + m3Var.getHeight()) - i11);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), 268435456);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
        Paint paint;
        z9 z9Var;
        Path path = (Path) this.f275b;
        da daVar = (da) this.f276c;
        Paint paint2 = (Paint) this.d;
        f6 f6Var = (f6) this.f277e;
        if (!z10 && (z9Var = f6Var.a2) != null && z9Var.c()) {
            if (z10) {
                daVar = (da) this.f274a;
            }
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            daVar.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((da) this.f274a) == null) {
                this.f274a = new da(f6Var.a2, f6Var.V1.getReactionsWindow().f11270c, 0, false);
            }
            float f13 = -f11;
            float f14 = -f12;
            ((da) this.f274a).e(f13, f14, f6Var.getMeasuredWidth() + f13, f6Var.getMeasuredHeight() + f14);
            paint = ((da) this.f274a).h;
        } else {
            float f15 = -f11;
            float f16 = -f12;
            daVar.e(f15, f16, f6Var.getMeasuredWidth() + f15, f6Var.getMeasuredHeight() + f16);
            paint = daVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRoundRect(rectF, f10, f10, paint2);
    }

    @Override
    public boolean t() {
        return true;
    }

    public o v(Class cls) {
        return i(q.a(cls));
    }

    public String w() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    public boolean x(Object obj) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.d)) {
            zRemove = ((ArrayDeque) this.d).remove(obj);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.f277e).execute(new e(this, 28));
            }
        }
        return zRemove;
    }

    public Set y(Class cls) {
        return g(q.a(cls));
    }

    public void z(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.f274a;
        View view2 = (View) this.f275b;
        if (((Bitmap) this.f276c) == bitmap) {
            return;
        }
        if (((g) this.f277e) != null) {
            view.setBackground(null);
            this.f277e = null;
        }
        if (((g) this.d) == null && ((g) this.f277e) == null && (bitmap2 = (Bitmap) this.f276c) != null) {
            bitmap2.recycle();
            this.f276c = null;
        }
        B();
        this.f276c = bitmap;
        g gVar = new g((Bitmap) this.f276c);
        this.f277e = gVar;
        view.setBackground(gVar);
        if (view2 != null) {
            g gVar2 = new g((Bitmap) this.f276c);
            this.d = gVar2;
            view2.setBackground(gVar2);
        }
    }

    public h(Context context, o5.b bVar) {
        this.f274a = context;
        this.f275b = bVar;
        D();
    }

    public h(y4.d dVar, HashMap map, HashMap map2, HashMap map3) {
        this.f274a = dVar;
        this.d = map2;
        this.f277e = map3;
        this.f276c = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        dVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f275b = jArr;
    }

    public h(sg.c cVar) {
        this.f277e = cVar;
        er erVar = er.h;
        this.f276c = new ud.a(0, this, erVar, 320L, true);
        this.d = new ud.a(1, this, erVar, 320L, true);
    }

    public h(m3 m3Var) {
        this.f275b = new RectF();
        this.f276c = new float[8];
        this.d = new Path();
        this.f277e = new Paint(1);
        this.f274a = m3Var;
    }

    @Override
    public void s() {
    }

    @Override
    public void A(float f10, int i10) {
    }
}
