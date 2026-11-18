package j6;

import android.os.SystemClock;
import android.util.Log;
import c8.c1;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends q {
    public static final String v;
    public long f17254e;
    public f6.q f17255f;
    public Long f17256g;
    public d6.i h;
    public int f17257i;
    public final p f17258j;
    public final p f17259k;
    public final p f17260l;
    public final p f17261m;
    public final p f17262n;
    public final p f17263o;
    public final p f17264p;
    public final p f17265q;
    public final p f17266r;
    public final p f17267s;
    public final p f17268t;
    public final p f17269u;

    static {
        Pattern pattern = a.f17242a;
        v = "urn:x-cast:com.google.cast.media";
    }

    public m() {
        super(v);
        this.f17257i = -1;
        p pVar = new p(86400000L, "load");
        this.f17258j = pVar;
        p pVar2 = new p(86400000L, "pause");
        this.f17259k = pVar2;
        p pVar3 = new p(86400000L, "play");
        this.f17260l = pVar3;
        p pVar4 = new p(86400000L, "stop");
        p pVar5 = new p(10000L, "seek");
        this.f17261m = pVar5;
        p pVar6 = new p(86400000L, "volume");
        this.f17262n = pVar6;
        p pVar7 = new p(86400000L, "mute");
        this.f17263o = pVar7;
        p pVar8 = new p(86400000L, "status");
        this.f17264p = pVar8;
        p pVar9 = new p(86400000L, "activeTracks");
        p pVar10 = new p(86400000L, "trackStyle");
        p pVar11 = new p(86400000L, "queueInsert");
        p pVar12 = new p(86400000L, "queueUpdate");
        this.f17265q = pVar12;
        p pVar13 = new p(86400000L, "queueRemove");
        p pVar14 = new p(86400000L, "queueReorder");
        p pVar15 = new p(86400000L, "queueFetchItemIds");
        this.f17266r = pVar15;
        p pVar16 = new p(86400000L, "queueFetchItemRange");
        this.f17268t = pVar16;
        this.f17267s = new p(86400000L, "queueFetchItems");
        p pVar17 = new p(86400000L, "setPlaybackRate");
        this.f17269u = pVar17;
        p pVar18 = new p(86400000L, "skipAd");
        a(pVar);
        a(pVar2);
        a(pVar3);
        a(pVar4);
        a(pVar5);
        a(pVar6);
        a(pVar7);
        a(pVar8);
        a(pVar9);
        a(pVar10);
        a(pVar11);
        a(pVar12);
        a(pVar13);
        a(pVar14);
        a(pVar15);
        a(pVar16);
        a(pVar16);
        a(pVar17);
        a(pVar18);
        g();
    }

    public static l f(JSONObject jSONObject) {
        MediaError.b(jSONObject);
        ?? obj = new Object();
        Pattern pattern = a.f17242a;
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
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            iArr[i7] = jSONArray.getInt(i7);
        }
        return iArr;
    }

    public final void d(n nVar, int i7, Integer num) {
        JSONObject jSONObject = new JSONObject();
        long b10 = b();
        try {
            jSONObject.put("requestId", b10);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", p());
            if (i7 != 0) {
                jSONObject.put("jump", i7);
            }
            String b11 = c1.b(num);
            if (b11 != null) {
                jSONObject.put("repeatMode", b11);
            }
            int i10 = this.f17257i;
            if (i10 != -1) {
                jSONObject.put("sequenceNumber", i10);
            }
        } catch (JSONException unused) {
        }
        c(b10, jSONObject.toString());
        this.f17265q.a(b10, new q4.q(29, this, nVar));
    }

    public final long e(double d, long j3, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f17254e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j3;
        }
        long j11 = j3 + ((long) (elapsedRealtime * d));
        if (j10 > 0 && j11 > j10) {
            return j10;
        }
        if (j11 < 0) {
            return 0L;
        }
        return j11;
    }

    public final void g() {
        this.f17254e = 0L;
        this.f17255f = null;
        for (p pVar : this.d) {
            pVar.f(2002);
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        if (jSONObject.has("sequenceNumber")) {
            this.f17257i = jSONObject.optInt("sequenceNumber", -1);
            return;
        }
        b bVar = this.f17279a;
        Log.w(bVar.f17244a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
    }

    public final void i() {
        d6.i iVar = this.h;
        if (iVar != null) {
            h6.h hVar = (h6.h) iVar.f7881b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f13928i.iterator();
                while (it2.hasNext()) {
                    ((h6.g) it2.next()).c();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        d6.i iVar = this.h;
        if (iVar != null) {
            h6.h hVar = (h6.h) iVar.f7881b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f13928i.iterator();
                while (it2.hasNext()) {
                    ((h6.g) it2.next()).d();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void k() {
        d6.i iVar = this.h;
        if (iVar != null) {
            h6.h hVar = (h6.h) iVar.f7881b;
            Iterator it = hVar.h.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f13928i.iterator();
                while (it2.hasNext()) {
                    ((h6.g) it2.next()).e();
                }
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void l() {
        d6.i iVar = this.h;
        if (iVar != null) {
            h6.h hVar = (h6.h) iVar.f7881b;
            Iterator it = hVar.f13929j.values().iterator();
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
                Iterator it3 = hVar.f13928i.iterator();
                while (it3.hasNext()) {
                    ((h6.g) it3.next()).g();
                }
                return;
            }
            it2.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void n() {
        synchronized (this.d) {
            try {
                for (p pVar : this.d) {
                    pVar.f(2002);
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
        long j3;
        f6.j jVar;
        f6.q qVar = this.f17255f;
        MediaInfo mediaInfo3 = null;
        if (qVar == null) {
            mediaInfo = null;
        } else {
            mediaInfo = qVar.f11443a;
        }
        long j10 = 0;
        if (mediaInfo != null && qVar != null) {
            Long l10 = this.f17256g;
            if (l10 != null) {
                if (l10.equals(4294967296000L)) {
                    f6.q qVar2 = this.f17255f;
                    if (qVar2.L != null) {
                        long longValue = l10.longValue();
                        f6.q qVar3 = this.f17255f;
                        if (qVar3 != null && (jVar = qVar3.L) != null) {
                            long j11 = jVar.f11406b;
                            if (!jVar.d) {
                                j10 = e(1.0d, j11, -1L);
                            } else {
                                j10 = j11;
                            }
                        }
                        return Math.min(longValue, j10);
                    }
                    if (qVar2 == null) {
                        mediaInfo2 = null;
                    } else {
                        mediaInfo2 = qVar2.f11443a;
                    }
                    if (mediaInfo2 != null) {
                        j3 = mediaInfo2.f6165e;
                    } else {
                        j3 = 0;
                    }
                    if (j3 >= 0) {
                        long longValue2 = l10.longValue();
                        f6.q qVar4 = this.f17255f;
                        if (qVar4 != null) {
                            mediaInfo3 = qVar4.f11443a;
                        }
                        if (mediaInfo3 != null) {
                            j10 = mediaInfo3.f6165e;
                        }
                        return Math.min(longValue2, j10);
                    }
                }
                return l10.longValue();
            } else if (this.f17254e != 0) {
                double d = qVar.d;
                long j12 = qVar.h;
                int i7 = qVar.f11446e;
                if (d != 0.0d && i7 == 2) {
                    return e(d, j12, mediaInfo.f6165e);
                }
                return j12;
            }
        }
        return 0L;
    }

    public final long p() {
        f6.q qVar = this.f17255f;
        if (qVar != null) {
            return qVar.f11444b;
        }
        throw new Exception();
    }
}
