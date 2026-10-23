package g6;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.r7;
public final class m extends p {
    public static final String v;
    public long e;
    public c6.q f10851f;
    public Long f10852g;
    public ya.d h;
    public int f10853i;
    public final o f10854j;
    public final o f10855k;
    public final o f10856l;
    public final o f10857m;
    public final o f10858n;
    public final o f10859o;
    public final o f10860p;
    public final o f10861q;
    public final o f10862r;
    public final o f10863s;
    public final o f10864t;
    public final o f10865u;

    static {
        Pattern pattern = a.f10840a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public m() {
        super(v);
        this.f10853i = -1;
        o oVar = new o(86400000L, "load");
        this.f10854j = oVar;
        o oVar2 = new o(86400000L, "pause");
        this.f10855k = oVar2;
        o oVar3 = new o(86400000L, "play");
        this.f10856l = oVar3;
        o oVar4 = new o(86400000L, "stop");
        o oVar5 = new o(10000L, "seek");
        this.f10857m = oVar5;
        o oVar6 = new o(86400000L, "volume");
        this.f10858n = oVar6;
        o oVar7 = new o(86400000L, "mute");
        this.f10859o = oVar7;
        o oVar8 = new o(86400000L, "status");
        this.f10860p = oVar8;
        o oVar9 = new o(86400000L, "activeTracks");
        o oVar10 = new o(86400000L, "trackStyle");
        o oVar11 = new o(86400000L, "queueInsert");
        o oVar12 = new o(86400000L, "queueUpdate");
        this.f10861q = oVar12;
        o oVar13 = new o(86400000L, "queueRemove");
        o oVar14 = new o(86400000L, "queueReorder");
        o oVar15 = new o(86400000L, "queueFetchItemIds");
        this.f10862r = oVar15;
        o oVar16 = new o(86400000L, "queueFetchItemRange");
        this.f10864t = oVar16;
        this.f10863s = new o(86400000L, "queueFetchItems");
        o oVar17 = new o(86400000L, "setPlaybackRate");
        this.f10865u = oVar17;
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
        Pattern pattern = a.f10840a;
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
            String b11 = r7.b(num);
            if (b11 != null) {
                jSONObject.put("repeatMode", b11);
            }
            int i11 = this.f10853i;
            if (i11 != -1) {
                jSONObject.put("sequenceNumber", i11);
            }
        } catch (JSONException unused) {
        }
        c(b10, jSONObject.toString());
        this.f10861q.a(b10, new n4.s(this, nVar, false, 20));
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
        this.f10851f = null;
        for (o oVar : this.d) {
            oVar.f(2002);
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.f10853i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        b bVar = this.f10872a;
        Log.w(bVar.f10842a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void i() {
        ya.d dVar = this.h;
        if (dVar != null) {
            e6.h hVar = (e6.h) dVar.f50125b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f8374i.iterator();
                while (it2.hasNext()) {
                    ((e6.g) it2.next()).c();
                }
                return;
            }
            throw a1.g.j(it);
        }
    }

    public final void j() {
        ya.d dVar = this.h;
        if (dVar != null) {
            e6.h hVar = (e6.h) dVar.f50125b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f8374i.iterator();
                while (it2.hasNext()) {
                    ((e6.g) it2.next()).d();
                }
                return;
            }
            throw a1.g.j(it);
        }
    }

    public final void k() {
        ya.d dVar = this.h;
        if (dVar != null) {
            e6.h hVar = (e6.h) dVar.f50125b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f8374i.iterator();
                while (it2.hasNext()) {
                    ((e6.g) it2.next()).e();
                }
                return;
            }
            throw a1.g.j(it);
        }
    }

    public final void l() {
        ya.d dVar = this.h;
        if (dVar != null) {
            e6.h hVar = (e6.h) dVar.f50125b;
            Iterator it = hVar.f8375j.values().iterator();
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
                Iterator it3 = hVar.f8374i.iterator();
                while (it3.hasNext()) {
                    ((e6.g) it3.next()).g();
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
        c6.j jVar;
        c6.q qVar = this.f10851f;
        MediaInfo mediaInfo3 = null;
        if (qVar == null) {
            mediaInfo = null;
        } else {
            mediaInfo = qVar.f4890a;
        }
        long j11 = 0;
        if (mediaInfo != null && qVar != null) {
            Long l4 = this.f10852g;
            if (l4 != null) {
                if (l4.equals(4294967296000L)) {
                    c6.q qVar2 = this.f10851f;
                    if (qVar2.K != null) {
                        long longValue = l4.longValue();
                        c6.q qVar3 = this.f10851f;
                        if (qVar3 != null && (jVar = qVar3.K) != null) {
                            long j12 = jVar.f4858b;
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
                        mediaInfo2 = qVar2.f4890a;
                    }
                    if (mediaInfo2 != null) {
                        j10 = mediaInfo2.e;
                    } else {
                        j10 = 0;
                    }
                    if (j10 >= 0) {
                        long longValue2 = l4.longValue();
                        c6.q qVar4 = this.f10851f;
                        if (qVar4 != null) {
                            mediaInfo3 = qVar4.f4890a;
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
        c6.q qVar = this.f10851f;
        if (qVar != null) {
            return qVar.f4891b;
        }
        throw new Exception();
    }
}
