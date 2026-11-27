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
public final class rdd {
    public static final String v;
    public final he6 a;
    public final String b;
    public ko9 c;
    public final List d;
    public long e;
    public j07 f;
    public Long g;
    public j09 h;
    public int i;
    public final ned j;
    public final ned k;
    public final ned l;
    public final ned m;
    public final ned n;
    public final ned o;
    public final ned p;
    public final ned q;
    public final ned r;
    public final ned s;
    public final ned t;
    public final ned u;

    static {
        Pattern pattern = qd1.a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public rdd() {
        String str = v;
        qd1.b(str);
        this.b = str;
        this.a = new he6("MediaControlChannel", null);
        this.d = DesugarCollections.synchronizedList(new ArrayList());
        this.i = -1;
        ned nedVar = new ned(86400000L, "load");
        this.j = nedVar;
        ned nedVar2 = new ned(86400000L, "pause");
        this.k = nedVar2;
        ned nedVar3 = new ned(86400000L, "play");
        this.l = nedVar3;
        ned nedVar4 = new ned(86400000L, "stop");
        ned nedVar5 = new ned(10000L, "seek");
        this.m = nedVar5;
        ned nedVar6 = new ned(86400000L, "volume");
        this.n = nedVar6;
        ned nedVar7 = new ned(86400000L, "mute");
        this.o = nedVar7;
        ned nedVar8 = new ned(86400000L, "status");
        this.p = nedVar8;
        ned nedVar9 = new ned(86400000L, "activeTracks");
        ned nedVar10 = new ned(86400000L, "trackStyle");
        ned nedVar11 = new ned(86400000L, "queueInsert");
        ned nedVar12 = new ned(86400000L, "queueUpdate");
        this.q = nedVar12;
        ned nedVar13 = new ned(86400000L, "queueRemove");
        ned nedVar14 = new ned(86400000L, "queueReorder");
        ned nedVar15 = new ned(86400000L, "queueFetchItemIds");
        this.r = nedVar15;
        ned nedVar16 = new ned(86400000L, "queueFetchItemRange");
        this.t = nedVar16;
        this.s = new ned(86400000L, "queueFetchItems");
        ned nedVar17 = new ned(86400000L, "setPlaybackRate");
        this.u = nedVar17;
        ned nedVar18 = new ned(86400000L, "skipAd");
        k(nedVar);
        k(nedVar2);
        k(nedVar3);
        k(nedVar4);
        k(nedVar5);
        k(nedVar6);
        k(nedVar7);
        k(nedVar8);
        k(nedVar9);
        k(nedVar10);
        k(nedVar11);
        k(nedVar12);
        k(nedVar13);
        k(nedVar14);
        k(nedVar15);
        k(nedVar16);
        k(nedVar16);
        k(nedVar17);
        k(nedVar18);
        d();
    }

    public static kdd c(JSONObject jSONObject) {
        MediaError.b(jSONObject);
        ?? obj = new Object();
        Pattern pattern = qd1.a;
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

    public final void a(ydd yddVar, int i, Integer num) {
        JSONObject jSONObject = new JSONObject();
        long l = l();
        try {
            jSONObject.put("requestId", l);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", p());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            String b = hte.b(num);
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
        this.q.a(l, new k7b(this, yddVar, false, (byte) 14));
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
        for (ned nedVar : this.d) {
            nedVar.f(2002);
        }
    }

    public final void e(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        he6 he6Var = this.a;
        Log.w(he6Var.a, he6Var.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void f() {
        j09 j09Var = this.h;
        if (j09Var != null) {
            v99 v99Var = (v99) j09Var.b;
            Iterator it = v99Var.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = v99Var.i.iterator();
                while (it2.hasNext()) {
                    ((u99) it2.next()).c();
                }
                return;
            }
            throw qu6.l(it);
        }
    }

    public final void g() {
        j09 j09Var = this.h;
        if (j09Var != null) {
            v99 v99Var = (v99) j09Var.b;
            Iterator it = v99Var.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = v99Var.i.iterator();
                while (it2.hasNext()) {
                    ((u99) it2.next()).d();
                }
                return;
            }
            throw qu6.l(it);
        }
    }

    public final void h() {
        j09 j09Var = this.h;
        if (j09Var != null) {
            v99 v99Var = (v99) j09Var.b;
            Iterator it = v99Var.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = v99Var.i.iterator();
                while (it2.hasNext()) {
                    ((u99) it2.next()).e();
                }
                return;
            }
            throw qu6.l(it);
        }
    }

    public final void i() {
        j09 j09Var = this.h;
        if (j09Var != null) {
            v99 v99Var = (v99) j09Var.b;
            Iterator it = v99Var.j.values().iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    if (!v99Var.h()) {
                        if (!v99Var.h()) {
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                grb.o();
                return;
            }
            Iterator it2 = v99Var.h.iterator();
            if (!it2.hasNext()) {
                Iterator it3 = v99Var.i.iterator();
                while (it3.hasNext()) {
                    ((u99) it3.next()).g();
                }
                return;
            }
            throw qu6.l(it2);
        }
    }

    public final void k(ned nedVar) {
        this.d.add(nedVar);
    }

    public final long l() {
        ko9 ko9Var = this.c;
        if (ko9Var == null) {
            he6 he6Var = this.a;
            Log.e(he6Var.a, he6Var.d("Attempt to generate requestId without a sink", new Object[0]));
            return 0L;
        }
        return ((AtomicLong) ko9Var.c).getAndIncrement();
    }

    public final void m() {
        synchronized (this.d) {
            for (ned nedVar : this.d) {
                nedVar.f(2002);
            }
        }
        d();
    }

    public final void n(long j, String str) {
        ko9 ko9Var = this.c;
        if (ko9Var == null) {
            he6 he6Var = this.a;
            Log.e(he6Var.a, he6Var.d("Attempt to send text message without a sink", new Object[0]));
            return;
        }
        rjd rjdVar = (rjd) ko9Var.b;
        if (rjdVar != null) {
            String str2 = this.b;
            qd1.b(str2);
            if (!TextUtils.isEmpty(str)) {
                if (str.length() <= 524288) {
                    wjb b = xjb.b();
                    b.a = new ygd(rjdVar, str2, str, (byte) 1);
                    b.d = (char) 8405;
                    rjdVar.e(1, b.a()).addOnFailureListener(new zg2(ko9Var, j, (byte) 9));
                    return;
                }
                he6 he6Var2 = rjd.H;
                Log.w(he6Var2.a, he6Var2.d("Message send failed. Message exceeds maximum size", new Object[0]));
                lq5.j("Message exceeds maximum size524288");
                return;
            }
            lq5.j("The message payload cannot be null or empty");
            return;
        }
        grb.i("Device is not connected");
    }

    public final long o() {
        MediaInfo mediaInfo;
        MediaInfo mediaInfo2;
        long j;
        it6 it6Var;
        j07 j07Var = this.f;
        MediaInfo mediaInfo3 = null;
        if (j07Var == null) {
            mediaInfo = null;
        } else {
            mediaInfo = j07Var.a;
        }
        long j2 = 0;
        if (mediaInfo != null && j07Var != null) {
            Long l = this.g;
            if (l != null) {
                if (l.equals(4294967296000L)) {
                    j07 j07Var2 = this.f;
                    if (j07Var2.L != null) {
                        long longValue = l.longValue();
                        j07 j07Var3 = this.f;
                        if (j07Var3 != null && (it6Var = j07Var3.L) != null) {
                            long j3 = it6Var.b;
                            j2 = !it6Var.d ? b(1.0d, j3, -1L) : j3;
                        }
                        return Math.min(longValue, j2);
                    }
                    if (j07Var2 == null) {
                        mediaInfo2 = null;
                    } else {
                        mediaInfo2 = j07Var2.a;
                    }
                    if (mediaInfo2 != null) {
                        j = mediaInfo2.e;
                    } else {
                        j = 0;
                    }
                    if (j >= 0) {
                        long longValue2 = l.longValue();
                        j07 j07Var4 = this.f;
                        if (j07Var4 != null) {
                            mediaInfo3 = j07Var4.a;
                        }
                        if (mediaInfo3 != null) {
                            j2 = mediaInfo3.e;
                        }
                        return Math.min(longValue2, j2);
                    }
                }
                return l.longValue();
            } else if (this.e != 0) {
                double d = j07Var.d;
                long j4 = j07Var.h;
                int i = j07Var.e;
                if (d != 0.0d && i == 2) {
                    return b(d, j4, mediaInfo.e);
                }
                return j4;
            }
        }
        return 0L;
    }

    public final long p() {
        j07 j07Var = this.f;
        if (j07Var != null) {
            return j07Var.b;
        }
        throw new Exception();
    }
}
