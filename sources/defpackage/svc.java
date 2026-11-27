package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.WallpapersListActivity;
public final class svc implements Runnable {
    public final byte a;
    public final boolean b;
    public final e c;
    public final Object d;

    public svc(e eVar, Object obj, boolean z, byte b) {
        this.a = b;
        this.c = eVar;
        this.d = obj;
        this.b = z;
    }

    @Override
    public final void run() {
        yvc yvcVar;
        int i;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z;
        TLRPC.WallPaperSettings wallPaperSettings2;
        TLRPC.WallPaperSettings wallPaperSettings3;
        TLRPC.Document document;
        byte b = this.a;
        Object obj = this.d;
        e eVar = this.c;
        switch (b) {
            case 0:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) eVar;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = wallpapersListActivity.Y;
                HashMap hashMap = wallpapersListActivity.Z;
                boolean z2 = wallpapersListActivity.r;
                HashMap hashMap2 = wallpapersListActivity.e0;
                ArrayList arrayList2 = wallpapersListActivity.b0;
                if (tLObject instanceof TL_account.TL_wallPapers) {
                    TL_account.TL_wallPapers tL_wallPapers = (TL_account.TL_wallPapers) tLObject;
                    wallpapersListActivity.d0.clear();
                    hashMap2.clear();
                    char c = 2;
                    boolean z3 = true;
                    if (!z2 && !z2) {
                        arrayList2.clear();
                        hashMap.clear();
                        arrayList.clear();
                        arrayList.addAll(tL_wallPapers.wallpapers);
                        arrayList2.addAll(wallpapersListActivity.c0);
                    }
                    int size = tL_wallPapers.wallpapers.size();
                    int i2 = 0;
                    while (i2 < size) {
                        TLRPC.WallPaper wallPaper = tL_wallPapers.wallpapers.get(i2);
                        if (!"fqv01SQemVIBAAAApND8LDRUhRU".equals(wallPaper.slug)) {
                            if ((wallPaper instanceof TLRPC.TL_wallPaper) && !(wallPaper.document instanceof TLRPC.TL_documentEmpty)) {
                                hashMap.put(wallPaper.slug, wallPaper);
                                if (wallPaper.pattern && (document = wallPaper.document) != null && !hashMap2.containsKey(Long.valueOf(document.id))) {
                                    wallpapersListActivity.d0.add(wallPaper);
                                    hashMap2.put(Long.valueOf(wallPaper.document.id), wallPaper);
                                }
                                if (z2 != z3 && ((!(z = wallPaper.pattern) || ((wallPaperSettings3 = wallPaper.settings) != null && wallPaperSettings3.background_color != 0)) && ((z2 != c || z) && (aob.I.o() || (wallPaperSettings2 = wallPaper.settings) == null || wallPaperSettings2.intensity >= 0)))) {
                                    arrayList2.add(wallPaper);
                                }
                            } else if (wallPaper.settings.background_color != 0 && (aob.I.o() || (wallPaperSettings = wallPaper.settings) == null || wallPaperSettings.intensity >= 0)) {
                                TLRPC.WallPaperSettings wallPaperSettings4 = wallPaper.settings;
                                int i3 = wallPaperSettings4.second_background_color;
                                if (i3 != 0 && (i = wallPaperSettings4.third_background_color) != 0) {
                                    yvcVar = new yvc(wallPaperSettings4.background_color, i3, i, wallPaperSettings4.fourth_background_color, null);
                                } else {
                                    yvcVar = new yvc(wallPaperSettings4.background_color, i3, wallPaperSettings4.rotation, null);
                                }
                                yvcVar.a = wallPaper.slug;
                                yvcVar.h = wallPaperSettings4.intensity / 100.0f;
                                yvcVar.f = hl.q1(wallPaperSettings4.rotation, false);
                                yvcVar.k = wallPaper;
                                arrayList2.add(yvcVar);
                            }
                        }
                        i2++;
                        c = 2;
                        z3 = true;
                    }
                    wallpapersListActivity.B0();
                    wallpapersListActivity.getMessagesStorage().m1(1, tL_wallPapers.wallpapers);
                }
                id idVar = wallpapersListActivity.M;
                if (idVar != null) {
                    idVar.dismiss();
                    if (!this.b) {
                        wallpapersListActivity.G.A0(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                em6 em6Var = (em6) eVar;
                em6Var.getMessagesController().O1().r0(em6Var.e, (ArrayList) obj, this.b, null);
                return;
        }
    }
}
