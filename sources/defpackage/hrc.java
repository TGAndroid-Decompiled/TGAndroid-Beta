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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.WallpapersListActivity;
public final class hrc implements ed, wi3 {
    public final irc a;

    public hrc(irc ircVar) {
        this.a = ircVar;
    }

    @Override
    public final boolean F() {
        return false;
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        pha phaVar;
        pha phaVar2;
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
                Typeface typeface = gl.a;
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) valueAt;
                b = "https://" + na7.q1(y6c.t0).N2 + "/bg/" + tL_wallPaper.slug;
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
                    StringBuilder k = b00.k(b, "?mode=");
                    k.append(sb2.toString());
                    b = k.toString();
                }
            } else if (valueAt instanceof krc) {
                b = ((krc) valueAt).b();
            }
            if (!TextUtils.isEmpty(b)) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(b);
            }
        }
        longSparseArray.clear();
        phaVar = ((d) wallpapersListActivity).simpleActionBar;
        phaVar.w();
        phaVar2 = ((d) wallpapersListActivity).simpleActionBar;
        phaVar2.n(true);
        if (arrayList.size() <= 1) {
            long j = ((zc7) arrayList.get(0)).a;
            i5 = ((d) wallpapersListActivity).currentAccount;
            if (j != y6c.h(i5).e() && charSequence == null) {
                long j2 = ((zc7) arrayList.get(0)).a;
                Bundle l = ir2.l("scrollToTopOnResume", true);
                if (cf3.B(j2)) {
                    l.putInt("enc_id", (int) (4294967295L & j2));
                } else {
                    if (cf3.D(j2)) {
                        l.putLong("user_id", j2);
                    } else if (cf3.y(j2)) {
                        l.putLong("chat_id", -j2);
                    }
                    i6 = ((d) wallpapersListActivity).currentAccount;
                    if (!na7.q1(i6).A(l, cj3Var, null, null)) {
                        return true;
                    }
                }
                i7 = ((d) wallpapersListActivity).currentAccount;
                kk7.f(i7).k(kk7.s, new Object[0]);
                wallpapersListActivity.presentFragment(new mu1(l), true);
                i8 = ((d) wallpapersListActivity).currentAccount;
                z3a.B(i8).q0(x3a.b(sb.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.H0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j3 = ((zc7) arrayList.get(i10)).a;
            if (charSequence != null) {
                i4 = ((d) wallpapersListActivity).currentAccount;
                z3a.B(i4).q0(x3a.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb)) {
                i3 = ((d) wallpapersListActivity).currentAccount;
                z3a.B(i3).q0(x3a.b(sb.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        cj3Var.finishFragment();
        return true;
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        pha phaVar;
        pha phaVar2;
        int i2;
        String str;
        irc ircVar = this.a;
        WallpapersListActivity wallpapersListActivity = ircVar.a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        hd hdVar2 = new hd(3, null, parentActivity);
        wallpapersListActivity.M = hdVar2;
        hdVar2.j0 = false;
        hdVar2.show();
        int[] iArr = {0};
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            Object valueAt = longSparseArray.valueAt(i3);
            if (valueAt instanceof krc) {
                krc krcVar = (krc) valueAt;
                TLRPC.WallPaper wallPaper = krcVar.k;
                if (wallPaper != null && wallPaper.id < 0) {
                    ad7 messagesStorage = wallpapersListActivity.getMessagesStorage();
                    messagesStorage.a.c(new ua7(messagesStorage, krcVar.k.id, (byte) 1));
                    wallpapersListActivity.c0.remove(krcVar);
                    wallpapersListActivity.a0.remove(krcVar.a());
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
                    if (bkb.e1()) {
                        str = "t";
                    } else {
                        str = "d";
                    }
                    wallpapersListActivity.P = str;
                    bkb.I.v(null);
                    bkb.s1(true);
                }
                i2 = ((d) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(savewallpaper, new apa(ircVar, iArr, (byte) 27));
            }
        }
        if (iArr[0] == 0) {
            wallpapersListActivity.D0(true);
        }
        longSparseArray.clear();
        phaVar = ((d) wallpapersListActivity).simpleActionBar;
        phaVar.w();
        phaVar2 = ((d) wallpapersListActivity).simpleActionBar;
        phaVar2.n(true);
    }
}
