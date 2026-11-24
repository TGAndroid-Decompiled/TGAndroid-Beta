package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xqc implements gk7 {
    public static final do3 e = new do3("wallpaperMaskQueue", true);
    public static final xqc[] f = new xqc[32];
    public final int a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    public xqc(int i) {
        this.a = i;
    }

    public static String b(TLRPC.WallPaper wallPaper) {
        if (!TextUtils.isEmpty(wallPaper.slug)) {
            return wallPaper.slug;
        }
        return "id" + wallPaper.id;
    }

    public final void a(wqc wqcVar, mqc mqcVar) {
        ng5 ng5Var = wqcVar.a;
        ArrayList arrayList = wqcVar.d;
        String a = ng5Var.a();
        HashMap hashMap = this.d;
        if (mqcVar == null) {
            hashMap.put(a, Long.valueOf(SystemClock.elapsedRealtime()));
        } else {
            hashMap.remove(a);
        }
        this.b.remove(a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((p8c) arrayList.get(i)).a(mqcVar);
        }
    }

    public final void c(wqc wqcVar) {
        int i = this.a;
        ba4.G(i);
        File J = ba4.J(wqcVar.e, null, true, true);
        if (J.exists()) {
            e.postRunnable(new wbc(this, wqcVar, J, (byte) 19));
            return;
        }
        String r = ba4.r(null, wqcVar.e);
        HashMap hashMap = this.c;
        if (hashMap.isEmpty()) {
            kk7.f(i).a(this, kk7.X1);
            kk7.f(i).a(this, kk7.Y1);
        }
        hashMap.put(r, wqcVar);
        ba4 G = ba4.G(i);
        gl5 b = gl5.b(wqcVar.e);
        Object obj = wqcVar.f;
        if (obj == null) {
            obj = "wallpaper";
        }
        G.V(b, obj, null, 1, 1);
    }

    public final void d(String str, boolean z, TLRPC.Document document, Object obj, p8c p8cVar) {
        ng5 c = ng5.c(str);
        String a = c.a();
        Long l = (Long) this.d.get(a);
        String str2 = null;
        if (l != null && SystemClock.elapsedRealtime() - l.longValue() < 60000) {
            p8cVar.a(null);
            return;
        }
        HashMap hashMap = this.b;
        wqc wqcVar = (wqc) hashMap.get(a);
        if (wqcVar != null) {
            wqcVar.d.add(p8cVar);
            return;
        }
        wqc wqcVar2 = new wqc(c, str);
        if (z) {
            str2 = str;
        }
        wqcVar2.c = str2;
        wqcVar2.e = document;
        wqcVar2.f = obj;
        wqcVar2.d.add(p8cVar);
        hashMap.put(a, wqcVar2);
        e.postRunnable(new rnc(this, str, c, wqcVar2));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.Y1;
        int i4 = kk7.X1;
        if (i == i4 || i == i3) {
            HashMap hashMap = this.c;
            wqc wqcVar = (wqc) hashMap.remove((String) objArr[0]);
            if (wqcVar == null) {
                return;
            }
            if (hashMap.isEmpty()) {
                kk7.f(i2).n(this, i4);
                kk7.f(i2).n(this, i3);
            }
            if (i == i4) {
                ba4.G(i2);
                e.postRunnable(new wbc(this, wqcVar, ba4.J(wqcVar.e, null, true, true), (byte) 19));
                return;
            }
            e(wqcVar);
        }
    }

    public final void e(wqc wqcVar) {
        String str;
        boolean z = wqcVar.g;
        String str2 = wqcVar.b;
        if (!z && str2.equals(wqcVar.c)) {
            boolean isTestBackend = ConnectionsManager.getInstance(this.a).isTestBackend();
            Context context = a.b;
            if (isTestBackend) {
                str = "wallpaper_patterns_test";
            } else {
                str = "wallpaper_patterns";
            }
            long j = context.getSharedPreferences(str, 0).getLong("rejected_".concat(str2), 0L);
            if (j == 0 || Math.abs(System.currentTimeMillis() - j) >= 86400000) {
                wqcVar.g = true;
                TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                tL_inputWallPaperSlug.slug = str2;
                getwallpaper.wallpaper = tL_inputWallPaperSlug;
                ConnectionsManager.getInstance(this.a).sendRequest(getwallpaper, new apa(this, wqcVar, (byte) 26));
                return;
            }
        }
        a(wqcVar, null);
    }
}
