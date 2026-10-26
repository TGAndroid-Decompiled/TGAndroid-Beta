package h6;

import a8.uc;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends p {
    public static final String v;
    public long e;
    public d6.q f12630f;
    public Long f12631g;
    public rb.c h;
    public int f12632i;
    public final o f12633j;
    public final o f12634k;
    public final o f12635l;
    public final o f12636m;
    public final o f12637n;
    public final o f12638o;
    public final o f12639p;
    public final o f12640q;
    public final o f12641r;
    public final o f12642s;
    public final o f12643t;
    public final o f12644u;

    static {
        Pattern pattern = a.f12619a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public m() {
        super(v);
        this.f12632i = -1;
        o oVar = new o(86400000L, "load");
        this.f12633j = oVar;
        o oVar2 = new o(86400000L, "pause");
        this.f12634k = oVar2;
        o oVar3 = new o(86400000L, "play");
        this.f12635l = oVar3;
        o oVar4 = new o(86400000L, "stop");
        o oVar5 = new o(10000L, "seek");
        this.f12636m = oVar5;
        o oVar6 = new o(86400000L, "volume");
        this.f12637n = oVar6;
        o oVar7 = new o(86400000L, "mute");
        this.f12638o = oVar7;
        o oVar8 = new o(86400000L, "status");
        this.f12639p = oVar8;
        o oVar9 = new o(86400000L, "activeTracks");
        o oVar10 = new o(86400000L, "trackStyle");
        o oVar11 = new o(86400000L, "queueInsert");
        o oVar12 = new o(86400000L, "queueUpdate");
        this.f12640q = oVar12;
        o oVar13 = new o(86400000L, "queueRemove");
        o oVar14 = new o(86400000L, "queueReorder");
        o oVar15 = new o(86400000L, "queueFetchItemIds");
        this.f12641r = oVar15;
        o oVar16 = new o(86400000L, "queueFetchItemRange");
        this.f12643t = oVar16;
        this.f12642s = new o(86400000L, "queueFetchItems");
        o oVar17 = new o(86400000L, "setPlaybackRate");
        this.f12644u = oVar17;
        o oVar18 = new o(86400000L, "skipAd");
        a(oVar);
        a(oVar2);
        a(oVar3);
        a(oVar4);
        a(oVar5);
        a(oVar6);
        a(oVar7);
        a(oVar8);
        a(oVar9);
        a(oVar10);
        a(oVar11);
        a(oVar12);
        a(oVar13);
        a(oVar14);
        a(oVar15);
        a(oVar16);
        a(oVar16);
        a(oVar17);
        a(oVar18);
        g();
    }

    public static l f(JSONObject jSONObject) {
        MediaError.b(jSONObject);
        ?? obj = new Object();
        Pattern pattern = a.f12619a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return obj;
    }

    public static int[] m(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            iArr[i10] = jSONArray.getInt(i10);
        }
        return iArr;
    }

    public final void d(n nVar, int i10, Integer num) {
        JSONObject jSONObject = new JSONObject();
        long b10 = b();
        try {
            jSONObject.put("requestId", b10);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", p());
            if (i10 != 0) {
                jSONObject.put("jump", i10);
            }
            String b11 = uc.b(num);
            if (b11 != null) {
                jSONObject.put("repeatMode", b11);
            }
            int i11 = this.f12632i;
            if (i11 != -1) {
                jSONObject.put("sequenceNumber", i11);
            }
        } catch (JSONException unused) {
        }
        c(b10, jSONObject.toString());
        this.f12640q.a(b10, new n4.s(this, nVar, false, 22));
    }

    public final long e(double d, long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j10;
        }
        long j12 = j10 + ((long) (elapsedRealtime * d));
        if (j11 > 0 && j12 > j11) {
            return j11;
        }
        if (j12 < 0) {
            return 0L;
        }
        return j12;
    }

    public final void g() {
        this.e = 0L;
        this.f12630f = null;
        for (o oVar : this.d) {
            oVar.f(2002);
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.f12632i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        b bVar = this.f12651a;
        Log.w(bVar.f12621a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void i() {
        rb.c cVar = this.h;
        if (cVar != null) {
            f6.h hVar = (f6.h) cVar.f47323b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f10219i.iterator();
                while (it2.hasNext()) {
                    ((f6.g) it2.next()).c();
                }
                return;
            }
            throw a1.g.j(it);
        }
    }

    public final void j() {
        rb.c cVar = this.h;
        if (cVar != null) {
            f6.h hVar = (f6.h) cVar.f47323b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f10219i.iterator();
                while (it2.hasNext()) {
                    ((f6.g) it2.next()).d();
                }
                return;
            }
            throw a1.g.j(it);
        }
    }

    public final void k() {
        rb.c cVar = this.h;
        if (cVar != null) {
            f6.h hVar = (f6.h) cVar.f47323b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f10219i.iterator();
                while (it2.hasNext()) {
                    ((f6.g) it2.next()).e();
                }
                return;
            }
            throw a1.g.j(it);
        }
    }

    public final void l() {
        rb.c cVar = this.h;
        if (cVar != null) {
            f6.h hVar = (f6.h) cVar.f47323b;
            Iterator it = hVar.f10220j.values().iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    if (!hVar.h()) {
                        if (!hVar.h()) {
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw new ClassCastException();
            }
            Iterator it2 = hVar.h.iterator();
            if (!it2.hasNext()) {
                Iterator it3 = hVar.f10219i.iterator();
                while (it3.hasNext()) {
                    ((f6.g) it3.next()).g();
                }
                return;
            }
            throw a1.g.j(it2);
        }
    }

    public final void n() {
        synchronized (this.d) {
            try {
                for (o oVar : this.d) {
                    oVar.f(2002);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
    }

    public final long o() {
        MediaInfo mediaInfo;
        MediaInfo mediaInfo2;
        long j10;
        d6.j jVar;
        d6.q qVar = this.f12630f;
        MediaInfo mediaInfo3 = null;
        if (qVar == null) {
            mediaInfo = null;
        } else {
            mediaInfo = qVar.f8118a;
        }
        long j11 = 0;
        if (mediaInfo != null && qVar != null) {
            Long l4 = this.f12631g;
            if (l4 != null) {
                if (l4.equals(4294967296000L)) {
                    d6.q qVar2 = this.f12630f;
                    if (qVar2.K != null) {
                        long longValue = l4.longValue();
                        d6.q qVar3 = this.f12630f;
                        if (qVar3 != null && (jVar = qVar3.K) != null) {
                            long j12 = jVar.f8086b;
                            if (!jVar.d) {
                                j11 = e(1.0d, j12, -1L);
                            } else {
                                j11 = j12;
                            }
                        }
                        return Math.min(longValue, j11);
                    }
                    if (qVar2 == null) {
                        mediaInfo2 = null;
                    } else {
                        mediaInfo2 = qVar2.f8118a;
                    }
                    if (mediaInfo2 != null) {
                        j10 = mediaInfo2.e;
                    } else {
                        j10 = 0;
                    }
                    if (j10 >= 0) {
                        long longValue2 = l4.longValue();
                        d6.q qVar4 = this.f12630f;
                        if (qVar4 != null) {
                            mediaInfo3 = qVar4.f8118a;
                        }
                        if (mediaInfo3 != null) {
                            j11 = mediaInfo3.e;
                        }
                        return Math.min(longValue2, j11);
                    }
                }
                return l4.longValue();
            } else if (this.e != 0) {
                double d = qVar.d;
                long j13 = qVar.h;
                int i10 = qVar.e;
                if (d != 0.0d && i10 == 2) {
                    return e(d, j13, mediaInfo.e);
                }
                return j13;
            }
        }
        return 0L;
    }

    public final long p() {
        d6.q qVar = this.f12630f;
        if (qVar != null) {
            return qVar.f8119b;
        }
        throw new Exception();
    }
}
