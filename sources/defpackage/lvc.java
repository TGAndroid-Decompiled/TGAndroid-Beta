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
public final class lvc implements fn7 {
    public static final uo3 e = new uo3("wallpaperMaskQueue", true);
    public static final lvc[] f = new lvc[32];
    public final int a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    public lvc(int i) {
        this.a = i;
    }

    public static String b(TLRPC.WallPaper wallPaper) {
        if (!TextUtils.isEmpty(wallPaper.slug)) {
            return wallPaper.slug;
        }
        return "id" + wallPaper.id;
    }

    public final void a(kvc kvcVar, avc avcVar) {
        pi5 pi5Var = kvcVar.a;
        ArrayList arrayList = kvcVar.d;
        String a = pi5Var.a();
        HashMap hashMap = this.d;
        if (avcVar == null) {
            hashMap.put(a, Long.valueOf(SystemClock.elapsedRealtime()));
        } else {
            hashMap.remove(a);
        }
        this.b.remove(a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pcc) arrayList.get(i)).a(avcVar);
        }
    }

    public final void c(kvc kvcVar) {
        int i = this.a;
        xb4.G(i);
        File J = xb4.J(kvcVar.e, null, true, true);
        if (J.exists()) {
            e.postRunnable(new b6c(this, kvcVar, J, (byte) 29));
            return;
        }
        String r = xb4.r(null, kvcVar.e);
        HashMap hashMap = this.c;
        if (hashMap.isEmpty()) {
            jn7.f(i).a(this, jn7.Y1);
            jn7.f(i).a(this, jn7.Z1);
        }
        hashMap.put(r, kvcVar);
        xb4 G = xb4.G(i);
        jn5 b = jn5.b(kvcVar.e);
        Object obj = kvcVar.f;
        if (obj == null) {
            obj = "wallpaper";
        }
        G.V(b, obj, null, 1, 1);
    }

    public final void d(String str, boolean z, TLRPC.Document document, Object obj, pcc pccVar) {
        pi5 c = pi5.c(str);
        String a = c.a();
        Long l = (Long) this.d.get(a);
        String str2 = null;
        if (l != null && SystemClock.elapsedRealtime() - l.longValue() < 60000) {
            pccVar.a(null);
            return;
        }
        HashMap hashMap = this.b;
        kvc kvcVar = (kvc) hashMap.get(a);
        if (kvcVar != null) {
            kvcVar.d.add(pccVar);
            return;
        }
        kvc kvcVar2 = new kvc(c, str);
        if (z) {
            str2 = str;
        }
        kvcVar2.c = str2;
        kvcVar2.e = document;
        kvcVar2.f = obj;
        kvcVar2.d.add(pccVar);
        hashMap.put(a, kvcVar2);
        e.postRunnable(new ipc(this, str, c, kvcVar2, (byte) 5));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.Z1;
        int i4 = jn7.Y1;
        if (i == i4 || i == i3) {
            HashMap hashMap = this.c;
            kvc kvcVar = (kvc) hashMap.remove((String) objArr[0]);
            if (kvcVar == null) {
                return;
            }
            if (hashMap.isEmpty()) {
                jn7.f(i2).n(this, i4);
                jn7.f(i2).n(this, i3);
            }
            if (i == i4) {
                xb4.G(i2);
                e.postRunnable(new b6c(this, kvcVar, xb4.J(kvcVar.e, null, true, true), (byte) 29));
                return;
            }
            e(kvcVar);
        }
    }

    public final void e(kvc kvcVar) {
        String str;
        boolean z = kvcVar.g;
        String str2 = kvcVar.b;
        if (!z && str2.equals(kvcVar.c)) {
            boolean isTestBackend = ConnectionsManager.getInstance(this.a).isTestBackend();
            Context context = a.b;
            if (isTestBackend) {
                str = "wallpaper_patterns_test";
            } else {
                str = "wallpaper_patterns";
            }
            long j = context.getSharedPreferences(str, 0).getLong("rejected_".concat(str2), 0L);
            if (j == 0 || Math.abs(System.currentTimeMillis() - j) >= 86400000) {
                kvcVar.g = true;
                TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                tL_inputWallPaperSlug.slug = str2;
                getwallpaper.wallpaper = tL_inputWallPaperSlug;
                ConnectionsManager.getInstance(this.a).sendRequest(getwallpaper, new isa(this, kvcVar, (byte) 27));
                return;
            }
        }
        a(kvcVar, null);
    }
}
