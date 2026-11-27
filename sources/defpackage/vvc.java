package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.WallpapersListActivity;
public final class vvc implements fd, oj3 {
    public final wvc a;

    public vvc(wvc wvcVar) {
        this.a = wvcVar;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        jla jlaVar;
        jla jlaVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String b;
        WallpapersListActivity wallpapersListActivity = this.a.a;
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < longSparseArray.size(); i9++) {
            Object valueAt = longSparseArray.valueAt(i9);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                Typeface typeface = hl.a;
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) valueAt;
                b = "https://" + uc7.s1(yac.t0).N2 + "/bg/" + tL_wallPaper.slug;
                StringBuilder sb2 = new StringBuilder();
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                if (wallPaperSettings != null) {
                    if (wallPaperSettings.blur) {
                        sb2.append("blur");
                    }
                    if (tL_wallPaper.settings.motion) {
                        if (sb2.length() > 0) {
                            sb2.append("+");
                        }
                        sb2.append("motion");
                    }
                }
                if (sb2.length() > 0) {
                    StringBuilder l = c00.l(b, "?mode=");
                    l.append(sb2.toString());
                    b = l.toString();
                }
            } else if (valueAt instanceof yvc) {
                b = ((yvc) valueAt).b();
            }
            if (!TextUtils.isEmpty(b)) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(b);
            }
        }
        longSparseArray.clear();
        jlaVar = ((e) wallpapersListActivity).simpleActionBar;
        jlaVar.y();
        jlaVar2 = ((e) wallpapersListActivity).simpleActionBar;
        jlaVar2.o(true);
        if (arrayList.size() <= 1) {
            long j = ((jf7) arrayList.get(0)).a;
            i5 = ((e) wallpapersListActivity).currentAccount;
            if (j != yac.h(i5).e() && charSequence == null) {
                long j2 = ((jf7) arrayList.get(0)).a;
                Bundle l2 = bs2.l("scrollToTopOnResume", true);
                if (wf3.B(j2)) {
                    l2.putInt("enc_id", (int) (4294967295L & j2));
                } else {
                    if (wf3.D(j2)) {
                        l2.putLong("user_id", j2);
                    } else if (wf3.y(j2)) {
                        l2.putLong("chat_id", -j2);
                    }
                    i6 = ((e) wallpapersListActivity).currentAccount;
                    if (!uc7.s1(i6).C(l2, uj3Var, null, null)) {
                        return true;
                    }
                }
                i7 = ((e) wallpapersListActivity).currentAccount;
                jn7.f(i7).k(jn7.s, new Object[0]);
                wallpapersListActivity.presentFragment(new zu1(l2), true);
                i8 = ((e) wallpapersListActivity).currentAccount;
                r7a.B(i8).q0(p7a.b(sb.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.I0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j3 = ((jf7) arrayList.get(i10)).a;
            if (charSequence != null) {
                i4 = ((e) wallpapersListActivity).currentAccount;
                r7a.B(i4).q0(p7a.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb)) {
                i3 = ((e) wallpapersListActivity).currentAccount;
                r7a.B(i3).q0(p7a.b(sb.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        uj3Var.finishFragment();
        return true;
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    @Override
    public final void w(id idVar, int i) {
        jla jlaVar;
        jla jlaVar2;
        int i2;
        String str;
        wvc wvcVar = this.a;
        WallpapersListActivity wallpapersListActivity = wvcVar.a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        id idVar2 = new id(3, null, parentActivity);
        wallpapersListActivity.M = idVar2;
        idVar2.j0 = false;
        idVar2.show();
        int[] iArr = {0};
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            Object valueAt = longSparseArray.valueAt(i3);
            if (valueAt instanceof yvc) {
                yvc yvcVar = (yvc) valueAt;
                TLRPC.WallPaper wallPaper = yvcVar.k;
                if (wallPaper != null && wallPaper.id < 0) {
                    kf7 messagesStorage = wallpapersListActivity.getMessagesStorage();
                    messagesStorage.a.c(new me7(messagesStorage, yvcVar.k.id, (byte) 3));
                    wallpapersListActivity.c0.remove(yvcVar);
                    wallpapersListActivity.a0.remove(yvcVar.a());
                } else {
                    valueAt = wallPaper;
                }
            }
            if (valueAt instanceof TLRPC.WallPaper) {
                iArr[0] = iArr[0] + 1;
                TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) valueAt;
                TL_account.saveWallPaper savewallpaper = new TL_account.saveWallPaper();
                savewallpaper.settings = new TLRPC.TL_wallPaperSettings();
                savewallpaper.unsave = true;
                if (valueAt instanceof TLRPC.TL_wallPaperNoFile) {
                    TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                    tL_inputWallPaperNoFile.id = wallPaper2.id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.id = wallPaper2.id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str2 = wallPaper2.slug;
                if (str2 != null && str2.equals(wallpapersListActivity.P)) {
                    if (aob.e1()) {
                        str = "t";
                    } else {
                        str = "d";
                    }
                    wallpapersListActivity.P = str;
                    aob.I.v(null);
                    aob.s1(true);
                }
                i2 = ((e) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(savewallpaper, new isa(wvcVar, iArr, (byte) 28));
            }
        }
        if (iArr[0] == 0) {
            wallpapersListActivity.E0(true);
        }
        longSparseArray.clear();
        jlaVar = ((e) wallpapersListActivity).simpleActionBar;
        jlaVar.y();
        jlaVar2 = ((e) wallpapersListActivity).simpleActionBar;
        jlaVar2.o(true);
    }
}
