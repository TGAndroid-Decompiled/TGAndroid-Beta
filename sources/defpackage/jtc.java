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
public final class jtc implements ee, hk3 {
    public final ktc a;

    public jtc(ktc ktcVar) {
        this.a = ktcVar;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        rja rjaVar;
        rja rjaVar2;
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
                Typeface typeface = gm.a;
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) valueAt;
                b = "https://" + oc7.r1(z8c.t0).N2 + "/bg/" + tL_wallPaper.slug;
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
                    StringBuilder k = b10.k(b, "?mode=");
                    k.append(sb2.toString());
                    b = k.toString();
                }
            } else if (valueAt instanceof mtc) {
                b = ((mtc) valueAt).b();
            }
            if (!TextUtils.isEmpty(b)) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(b);
            }
        }
        longSparseArray.clear();
        rjaVar = ((d) wallpapersListActivity).simpleActionBar;
        rjaVar.w();
        rjaVar2 = ((d) wallpapersListActivity).simpleActionBar;
        rjaVar2.o(true);
        if (arrayList.size() <= 1) {
            long j = ((bf7) arrayList.get(0)).a;
            i5 = ((d) wallpapersListActivity).currentAccount;
            if (j != z8c.h(i5).e() && charSequence == null) {
                long j2 = ((bf7) arrayList.get(0)).a;
                Bundle l = ts2.l("scrollToTopOnResume", true);
                if (pg3.B(j2)) {
                    l.putInt("enc_id", (int) (4294967295L & j2));
                } else {
                    if (pg3.D(j2)) {
                        l.putLong("user_id", j2);
                    } else if (pg3.y(j2)) {
                        l.putLong("chat_id", -j2);
                    }
                    i6 = ((d) wallpapersListActivity).currentAccount;
                    if (!oc7.r1(i6).A(l, nk3Var, null, null)) {
                        return true;
                    }
                }
                i7 = ((d) wallpapersListActivity).currentAccount;
                nm7.f(i7).k(nm7.s, new Object[0]);
                wallpapersListActivity.presentFragment(new yv1(l), true);
                i8 = ((d) wallpapersListActivity).currentAccount;
                a6a.B(i8).q0(y5a.b(sb.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.I0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long j3 = ((bf7) arrayList.get(i10)).a;
            if (charSequence != null) {
                i4 = ((d) wallpapersListActivity).currentAccount;
                a6a.B(i4).q0(y5a.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb)) {
                i3 = ((d) wallpapersListActivity).currentAccount;
                a6a.B(i3).q0(y5a.b(sb.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        nk3Var.finishFragment();
        return true;
    }

    @Override
    public final void r(he heVar, int i) {
        rja rjaVar;
        rja rjaVar2;
        int i2;
        String str;
        ktc ktcVar = this.a;
        WallpapersListActivity wallpapersListActivity = ktcVar.a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        he heVar2 = new he(3, null, parentActivity);
        wallpapersListActivity.M = heVar2;
        heVar2.j0 = false;
        heVar2.show();
        int[] iArr = {0};
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            Object valueAt = longSparseArray.valueAt(i3);
            if (valueAt instanceof mtc) {
                mtc mtcVar = (mtc) valueAt;
                TLRPC.WallPaper wallPaper = mtcVar.k;
                if (wallPaper != null && wallPaper.id < 0) {
                    cf7 messagesStorage = wallpapersListActivity.getMessagesStorage();
                    messagesStorage.a.c(new vc7(messagesStorage, mtcVar.k.id, (byte) 1));
                    wallpapersListActivity.c0.remove(mtcVar);
                    wallpapersListActivity.a0.remove(mtcVar.a());
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
                    if (cmb.e1()) {
                        str = "t";
                    } else {
                        str = "d";
                    }
                    wallpapersListActivity.P = str;
                    cmb.I.v(null);
                    cmb.s1(true);
                }
                i2 = ((d) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(savewallpaper, new ara(ktcVar, iArr, (byte) 27));
            }
        }
        if (iArr[0] == 0) {
            wallpapersListActivity.E0(true);
        }
        longSparseArray.clear();
        rjaVar = ((d) wallpapersListActivity).simpleActionBar;
        rjaVar.w();
        rjaVar2 = ((d) wallpapersListActivity).simpleActionBar;
        rjaVar2.o(true);
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }
}
