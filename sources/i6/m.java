package i6;

import android.os.SystemClock;
import android.util.Log;
import b8.ed;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends p {
    public static final String v;
    public long f14630e;
    public e6.q f14631f;
    public Long f14632g;
    public android.support.v4.media.c h;
    public int f14633i;
    public final o f14634j;
    public final o f14635k;
    public final o f14636l;
    public final o f14637m;
    public final o f14638n;
    public final o f14639o;
    public final o f14640p;
    public final o f14641q;
    public final o f14642r;
    public final o f14643s;
    public final o f14644t;
    public final o f14645u;

    static {
        Pattern pattern = a.f14618a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public m() {
        super(v);
        this.f14633i = -1;
        o oVar = new o(86400000L, "load");
        this.f14634j = oVar;
        o oVar2 = new o(86400000L, "pause");
        this.f14635k = oVar2;
        o oVar3 = new o(86400000L, "play");
        this.f14636l = oVar3;
        o oVar4 = new o(86400000L, "stop");
        o oVar5 = new o(10000L, "seek");
        this.f14637m = oVar5;
        o oVar6 = new o(86400000L, "volume");
        this.f14638n = oVar6;
        o oVar7 = new o(86400000L, "mute");
        this.f14639o = oVar7;
        o oVar8 = new o(86400000L, "status");
        this.f14640p = oVar8;
        o oVar9 = new o(86400000L, "activeTracks");
        o oVar10 = new o(86400000L, "trackStyle");
        o oVar11 = new o(86400000L, "queueInsert");
        o oVar12 = new o(86400000L, "queueUpdate");
        this.f14641q = oVar12;
        o oVar13 = new o(86400000L, "queueRemove");
        o oVar14 = new o(86400000L, "queueReorder");
        o oVar15 = new o(86400000L, "queueFetchItemIds");
        this.f14642r = oVar15;
        o oVar16 = new o(86400000L, "queueFetchItemRange");
        this.f14644t = oVar16;
        this.f14643s = new o(86400000L, "queueFetchItems");
        o oVar17 = new o(86400000L, "setPlaybackRate");
        this.f14645u = oVar17;
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
        Pattern pattern = a.f14618a;
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
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            iArr[i3] = jSONArray.getInt(i3);
        }
        return iArr;
    }

    public final void d(n nVar, int i3, Integer num) {
        JSONObject jSONObject = new JSONObject();
        long b10 = b();
        try {
            jSONObject.put("requestId", b10);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", p());
            if (i3 != 0) {
                jSONObject.put("jump", i3);
            }
            String b11 = ed.b(num);
            if (b11 != null) {
                jSONObject.put("repeatMode", b11);
            }
            int i10 = this.f14633i;
            if (i10 != -1) {
                jSONObject.put("sequenceNumber", i10);
            }
        } catch (JSONException unused) {
        }
        c(b10, jSONObject.toString());
        this.f14641q.a(b10, new p4.q(this, nVar, false));
    }

    public final long e(double d, long j10, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f14630e;
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
        this.f14630e = 0L;
        this.f14631f = null;
        for (o oVar : this.d) {
            oVar.f(2002);
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.f14633i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        b bVar = this.f14653a;
        Log.w(bVar.f14620a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void i() {
        android.support.v4.media.c cVar = this.h;
        if (cVar != null) {
            g6.h hVar = (g6.h) cVar.f1155b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f12013i.iterator();
                while (it2.hasNext()) {
                    ((g6.g) it2.next()).c();
                }
                return;
            }
            throw a1.g.m(it);
        }
    }

    public final void j() {
        android.support.v4.media.c cVar = this.h;
        if (cVar != null) {
            g6.h hVar = (g6.h) cVar.f1155b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f12013i.iterator();
                while (it2.hasNext()) {
                    ((g6.g) it2.next()).d();
                }
                return;
            }
            throw a1.g.m(it);
        }
    }

    public final void k() {
        android.support.v4.media.c cVar = this.h;
        if (cVar != null) {
            g6.h hVar = (g6.h) cVar.f1155b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f12013i.iterator();
                while (it2.hasNext()) {
                    ((g6.g) it2.next()).e();
                }
                return;
            }
            throw a1.g.m(it);
        }
    }

    public final void l() {
        android.support.v4.media.c cVar = this.h;
        if (cVar != null) {
            g6.h hVar = (g6.h) cVar.f1155b;
            Iterator it = hVar.f12014j.values().iterator();
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
                Iterator it3 = hVar.f12013i.iterator();
                while (it3.hasNext()) {
                    ((g6.g) it3.next()).g();
                }
                return;
            }
            throw a1.g.m(it2);
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
        e6.j jVar;
        e6.q qVar = this.f14631f;
        MediaInfo mediaInfo3 = null;
        if (qVar == null) {
            mediaInfo = null;
        } else {
            mediaInfo = qVar.f9752a;
        }
        long j11 = 0;
        if (mediaInfo != null && qVar != null) {
            Long l10 = this.f14632g;
            if (l10 != null) {
                if (l10.equals(4294967296000L)) {
                    e6.q qVar2 = this.f14631f;
                    if (qVar2.L != null) {
                        long longValue = l10.longValue();
                        e6.q qVar3 = this.f14631f;
                        if (qVar3 != null && (jVar = qVar3.L) != null) {
                            long j12 = jVar.f9715b;
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
                        mediaInfo2 = qVar2.f9752a;
                    }
                    if (mediaInfo2 != null) {
                        j10 = mediaInfo2.f6549e;
                    } else {
                        j10 = 0;
                    }
                    if (j10 >= 0) {
                        long longValue2 = l10.longValue();
                        e6.q qVar4 = this.f14631f;
                        if (qVar4 != null) {
                            mediaInfo3 = qVar4.f9752a;
                        }
                        if (mediaInfo3 != null) {
                            j11 = mediaInfo3.f6549e;
                        }
                        return Math.min(longValue2, j11);
                    }
                }
                return l10.longValue();
            } else if (this.f14630e != 0) {
                double d = qVar.d;
                long j13 = qVar.h;
                int i3 = qVar.f9755e;
                if (d != 0.0d && i3 == 2) {
                    return e(d, j13, mediaInfo.f6549e);
                }
                return j13;
            }
        }
        return 0L;
    }

    public final long p() {
        e6.q qVar = this.f14631f;
        if (qVar != null) {
            return qVar.f9753b;
        }
        throw new Exception();
    }
}
