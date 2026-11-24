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
public final class zsc implements jm7 {
    public static final np3 e = new np3("wallpaperMaskQueue", true);
    public static final zsc[] f = new zsc[32];
    public final int a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    public zsc(int i) {
        this.a = i;
    }

    public static String b(TLRPC.WallPaper wallPaper) {
        if (!TextUtils.isEmpty(wallPaper.slug)) {
            return wallPaper.slug;
        }
        return "id" + wallPaper.id;
    }

    public final void a(ysc yscVar, osc oscVar) {
        mi5 mi5Var = yscVar.a;
        ArrayList arrayList = yscVar.d;
        String a = mi5Var.a();
        HashMap hashMap = this.d;
        if (oscVar == null) {
            hashMap.put(a, Long.valueOf(SystemClock.elapsedRealtime()));
        } else {
            hashMap.remove(a);
        }
        this.b.remove(a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qac) arrayList.get(i)).a(oscVar);
        }
    }

    public final void c(ysc yscVar) {
        int i = this.a;
        bc4.G(i);
        File J = bc4.J(yscVar.e, null, true, true);
        if (J.exists()) {
            e.postRunnable(new gcc(this, yscVar, J, (byte) 22));
            return;
        }
        String r = bc4.r(null, yscVar.e);
        HashMap hashMap = this.c;
        if (hashMap.isEmpty()) {
            nm7.f(i).a(this, nm7.Y1);
            nm7.f(i).a(this, nm7.Z1);
        }
        hashMap.put(r, yscVar);
        bc4 G = bc4.G(i);
        gn5 b = gn5.b(yscVar.e);
        Object obj = yscVar.f;
        if (obj == null) {
            obj = "wallpaper";
        }
        G.V(b, obj, null, 1, 1);
    }

    public final void d(String str, boolean z, TLRPC.Document document, Object obj, qac qacVar) {
        mi5 c = mi5.c(str);
        String a = c.a();
        Long l = (Long) this.d.get(a);
        String str2 = null;
        if (l != null && SystemClock.elapsedRealtime() - l.longValue() < 60000) {
            qacVar.a(null);
            return;
        }
        HashMap hashMap = this.b;
        ysc yscVar = (ysc) hashMap.get(a);
        if (yscVar != null) {
            yscVar.d.add(qacVar);
            return;
        }
        ysc yscVar2 = new ysc(c, str);
        if (z) {
            str2 = str;
        }
        yscVar2.c = str2;
        yscVar2.e = document;
        yscVar2.f = obj;
        yscVar2.d.add(qacVar);
        hashMap.put(a, yscVar2);
        e.postRunnable(new tpc(this, str, c, yscVar2));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.Z1;
        int i4 = nm7.Y1;
        if (i == i4 || i == i3) {
            HashMap hashMap = this.c;
            ysc yscVar = (ysc) hashMap.remove((String) objArr[0]);
            if (yscVar == null) {
                return;
            }
            if (hashMap.isEmpty()) {
                nm7.f(i2).n(this, i4);
                nm7.f(i2).n(this, i3);
            }
            if (i == i4) {
                bc4.G(i2);
                e.postRunnable(new gcc(this, yscVar, bc4.J(yscVar.e, null, true, true), (byte) 22));
                return;
            }
            e(yscVar);
        }
    }

    public final void e(ysc yscVar) {
        String str;
        boolean z = yscVar.g;
        String str2 = yscVar.b;
        if (!z && str2.equals(yscVar.c)) {
            boolean isTestBackend = ConnectionsManager.getInstance(this.a).isTestBackend();
            Context context = a.b;
            if (isTestBackend) {
                str = "wallpaper_patterns_test";
            } else {
                str = "wallpaper_patterns";
            }
            long j = context.getSharedPreferences(str, 0).getLong("rejected_".concat(str2), 0L);
            if (j == 0 || Math.abs(System.currentTimeMillis() - j) >= 86400000) {
                yscVar.g = true;
                TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                tL_inputWallPaperSlug.slug = str2;
                getwallpaper.wallpaper = tL_inputWallPaperSlug;
                ConnectionsManager.getInstance(this.a).sendRequest(getwallpaper, new ara(this, yscVar, (byte) 26));
                return;
            }
        }
        a(yscVar, null);
    }
}
