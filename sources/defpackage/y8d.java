package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class y8d {
    public static final String v;
    public final dc6 a;
    public final String b;
    public vk9 c;
    public final List d;
    public long e;
    public fy6 f;
    public Long g;
    public xdd h;
    public int i;
    public final u9d j;
    public final u9d k;
    public final u9d l;
    public final u9d m;
    public final u9d n;
    public final u9d o;
    public final u9d p;
    public final u9d q;
    public final u9d r;
    public final u9d s;
    public final u9d t;
    public final u9d u;

    static {
        Pattern pattern = id1.a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public y8d() {
        String str = v;
        id1.b(str);
        this.b = str;
        this.a = new dc6("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.i = -1;
        u9d u9dVar = new u9d(86400000L, "load");
        this.j = u9dVar;
        u9d u9dVar2 = new u9d(86400000L, "pause");
        this.k = u9dVar2;
        u9d u9dVar3 = new u9d(86400000L, "play");
        this.l = u9dVar3;
        u9d u9dVar4 = new u9d(86400000L, "stop");
        u9d u9dVar5 = new u9d(10000L, "seek");
        this.m = u9dVar5;
        u9d u9dVar6 = new u9d(86400000L, "volume");
        this.n = u9dVar6;
        u9d u9dVar7 = new u9d(86400000L, "mute");
        this.o = u9dVar7;
        u9d u9dVar8 = new u9d(86400000L, "status");
        this.p = u9dVar8;
        u9d u9dVar9 = new u9d(86400000L, "activeTracks");
        u9d u9dVar10 = new u9d(86400000L, "trackStyle");
        u9d u9dVar11 = new u9d(86400000L, "queueInsert");
        u9d u9dVar12 = new u9d(86400000L, "queueUpdate");
        this.q = u9dVar12;
        u9d u9dVar13 = new u9d(86400000L, "queueRemove");
        u9d u9dVar14 = new u9d(86400000L, "queueReorder");
        u9d u9dVar15 = new u9d(86400000L, "queueFetchItemIds");
        this.r = u9dVar15;
        u9d u9dVar16 = new u9d(86400000L, "queueFetchItemRange");
        this.t = u9dVar16;
        this.s = new u9d(86400000L, "queueFetchItems");
        u9d u9dVar17 = new u9d(86400000L, "setPlaybackRate");
        this.u = u9dVar17;
        u9d u9dVar18 = new u9d(86400000L, "skipAd");
        k(u9dVar);
        k(u9dVar2);
        k(u9dVar3);
        k(u9dVar4);
        k(u9dVar5);
        k(u9dVar6);
        k(u9dVar7);
        k(u9dVar8);
        k(u9dVar9);
        k(u9dVar10);
        k(u9dVar11);
        k(u9dVar12);
        k(u9dVar13);
        k(u9dVar14);
        k(u9dVar15);
        k(u9dVar16);
        k(u9dVar16);
        k(u9dVar17);
        k(u9dVar18);
        d();
    }

    public static r8d c(JSONObject jSONObject) {
        MediaError.b(jSONObject);
        ?? obj = new Object();
        Pattern pattern = id1.a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return obj;
    }

    public static int[] j(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public final void a(f9d f9dVar, int i, Integer num) {
        JSONObject jSONObject = new JSONObject();
        long l = l();
        try {
            jSONObject.put("requestId", l);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", p());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            String b = ooe.b(num);
            if (b != null) {
                jSONObject.put("repeatMode", b);
            }
            int i2 = this.i;
            if (i2 != -1) {
                jSONObject.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        n(l, jSONObject.toString());
        this.q.a(l, new v8b(this, f9dVar, (byte) 13));
    }

    public final long b(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (elapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 < 0) {
            return 0L;
        }
        return j3;
    }

    public final void d() {
        this.e = 0L;
        this.f = null;
        for (u9d u9dVar : this.d) {
            u9dVar.f(2002);
        }
    }

    public final void e(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        dc6 dc6Var = this.a;
        Log.w(dc6Var.a, dc6Var.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void f() {
        xdd xddVar = this.h;
        if (xddVar != null) {
            i69 i69Var = (i69) xddVar.a;
            Iterator it = i69Var.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = i69Var.i.iterator();
                while (it2.hasNext()) {
                    ((h69) it2.next()).c();
                }
                return;
            }
            throw ls6.l(it);
        }
    }

    public final void g() {
        xdd xddVar = this.h;
        if (xddVar != null) {
            i69 i69Var = (i69) xddVar.a;
            Iterator it = i69Var.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = i69Var.i.iterator();
                while (it2.hasNext()) {
                    ((h69) it2.next()).d();
                }
                return;
            }
            throw ls6.l(it);
        }
    }

    public final void h() {
        xdd xddVar = this.h;
        if (xddVar != null) {
            i69 i69Var = (i69) xddVar.a;
            Iterator it = i69Var.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = i69Var.i.iterator();
                while (it2.hasNext()) {
                    ((h69) it2.next()).e();
                }
                return;
            }
            throw ls6.l(it);
        }
    }

    public final void i() {
        xdd xddVar = this.h;
        if (xddVar != null) {
            i69 i69Var = (i69) xddVar.a;
            Iterator it = i69Var.j.values().iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    if (!i69Var.h()) {
                        if (!i69Var.h()) {
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                fyb.g();
                return;
            }
            Iterator it2 = i69Var.h.iterator();
            if (!it2.hasNext()) {
                Iterator it3 = i69Var.i.iterator();
                while (it3.hasNext()) {
                    ((h69) it3.next()).g();
                }
                return;
            }
            throw ls6.l(it2);
        }
    }

    public final void k(u9d u9dVar) {
        this.d.add(u9dVar);
    }

    public final long l() {
        vk9 vk9Var = this.c;
        if (vk9Var == null) {
            dc6 dc6Var = this.a;
            Log.e(dc6Var.a, dc6Var.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) vk9Var.c).getAndIncrement();
    }

    public final void m() {
        synchronized (this.d) {
            for (u9d u9dVar : this.d) {
                u9dVar.f(2002);
            }
        }
        d();
    }

    public final void n(long j, String str) {
        vk9 vk9Var = this.c;
        if (vk9Var == null) {
            dc6 dc6Var = this.a;
            Log.e(dc6Var.a, dc6Var.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        afd afdVar = (afd) vk9Var.b;
        if (afdVar != null) {
            String str2 = this.b;
            id1.b(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    agb b = bgb.b();
                    b.a = new fcd(afdVar, str2, str, (byte) 1);
                    b.d = (char) 8405;
                    afdVar.e(1, b.a()).addOnFailureListener(new hg2(vk9Var, j, (byte) 8));
                    return;
                }
                dc6 dc6Var2 = afd.H;
                Log.w(dc6Var2.a, dc6Var2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                w26.j("Message exceeds maximum size524288");
                return;
            }
            w26.j("The message payload cannot be null or empty");
            return;
        }
        sc8.j("Device is not connected");
    }

    public final long o() {
        MediaInfo mediaInfo;
        MediaInfo mediaInfo2;
        long j;
        er6 er6Var;
        fy6 fy6Var = this.f;
        MediaInfo mediaInfo3 = null;
        if (fy6Var == null) {
            mediaInfo = null;
        } else {
            mediaInfo = fy6Var.a;
        }
        long j2 = 0;
        if (mediaInfo != null && fy6Var != null) {
            Long l = this.g;
            if (l != null) {
                if (l.equals(4294967296000L)) {
                    fy6 fy6Var2 = this.f;
                    if (fy6Var2.L != null) {
                        long longValue = l.longValue();
                        fy6 fy6Var3 = this.f;
                        if (fy6Var3 != null && (er6Var = fy6Var3.L) != null) {
                            long j3 = er6Var.b;
                            j2 = !er6Var.d ? b(1.0d, j3, -1L) : j3;
                        }
                        return Math.min(longValue, j2);
                    }
                    if (fy6Var2 == null) {
                        mediaInfo2 = null;
                    } else {
                        mediaInfo2 = fy6Var2.a;
                    }
                    if (mediaInfo2 != null) {
                        j = mediaInfo2.e;
                    } else {
                        j = 0;
                    }
                    if (j >= 0) {
                        long longValue2 = l.longValue();
                        fy6 fy6Var4 = this.f;
                        if (fy6Var4 != null) {
                            mediaInfo3 = fy6Var4.a;
                        }
                        if (mediaInfo3 != null) {
                            j2 = mediaInfo3.e;
                        }
                        return Math.min(longValue2, j2);
                    }
                }
                return l.longValue();
            } else if (this.e != 0) {
                double d = fy6Var.d;
                long j4 = fy6Var.h;
                int i = fy6Var.e;
                if (d != 0.0d && i == 2) {
                    return b(d, j4, mediaInfo.e);
                }
                return j4;
            }
        }
        return 0L;
    }

    public final long p() {
        fy6 fy6Var = this.f;
        if (fy6Var != null) {
            return fy6Var.b;
        }
        throw new Exception();
    }
}
