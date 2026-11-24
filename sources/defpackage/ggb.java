package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class ggb extends yu6 {
    public final hgb g;

    public ggb(hgb hgbVar) {
        super((byte) 1);
        this.g = hgbVar;
    }

    @Override
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override
    public final void G(long j) {
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null) {
            MediaController.w().h0(k27Var, (float) ((j / 1000.0d) / k27Var.L0()));
        }
    }

    @Override
    public final void M(int i) {
        int i2 = 2;
        if (i != 1) {
            if (i != 2 && i != 3) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        gba.D(i2);
        this.g.f();
        gl.d3(new kya(this, (byte) 27));
    }

    @Override
    public final void P(int i) {
        int i2 = 0;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z != gba.K0) {
            MediaController w = MediaController.w();
            if (z) {
                i2 = 2;
            }
            w.k0(i2);
        }
        this.g.b.q0(gba.K0 ? 1 : 0);
        gl.d3(new kya(this, (byte) 27));
    }

    @Override
    public final void S() {
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null && k27Var.I3()) {
            MediaController.w().T(false);
        }
    }

    @Override
    public final void V() {
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null && k27Var.I3()) {
            MediaController.w().U();
        }
    }

    @Override
    public final void Y(long j) {
        MediaController.w().S((int) j);
    }

    @Override
    public final void f(String str) {
        int i;
        boolean equals = "org.telegram.android.musicplayer.repeat".equals(str);
        hgb hgbVar = this.g;
        if (equals) {
            gba.D((gba.P0 + 1) % 3);
            hgbVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController w = MediaController.w();
            if (gba.K0) {
                i = 0;
            } else {
                i = 2;
            }
            w.k0(i);
            hgbVar.b.q0(gba.K0 ? 1 : 0);
        }
    }

    @Override
    public final void k() {
        MediaController.w().Q(MediaController.w().v0, true);
    }

    @Override
    public final void n() {
        k27 k27Var = MediaController.w().v0;
        if (k27Var == null) {
            hgb hgbVar = this.g;
            if (hgbVar.d != 0) {
                q(ls6.p(new StringBuilder(), hgbVar.d, "_0"), null);
                return;
            }
            return;
        }
        MediaController.w().R(k27Var);
    }

    @Override
    public final void q(String str, Bundle bundle) {
        String str2;
        String str3;
        hgb hgbVar = this.g;
        mv6 mv6Var = hgbVar.b;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("_");
            if (split.length == 2) {
                try {
                    long parseLong = Long.parseLong(split[0]);
                    int parseInt = Integer.parseInt(split[1]);
                    ArrayList arrayList = (ArrayList) hgbVar.j.f(parseLong);
                    if (arrayList == null) {
                        hgbVar.e(new r1b(this, str, bundle, (byte) 10), parseLong);
                        return;
                    }
                    ArrayList arrayList2 = (ArrayList) hgbVar.k.f(parseLong);
                    if (parseInt >= 0 && parseInt < arrayList.size()) {
                        hgbVar.d = parseLong;
                        na7.q1(hgbVar.c).W3.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                        MediaController.w().n0(arrayList, (k27) arrayList.get(parseInt), 0L, false, null, 0L);
                        mv6Var.o0(arrayList2);
                        if (cf3.D(parseLong)) {
                            TLRPC.User user = (TLRPC.User) hgbVar.h.f(parseLong);
                            if (user != null) {
                                str3 = qu2.m(0, user.first_name, user.last_name);
                            } else {
                                str3 = "DELETED USER";
                            }
                            ((zu6) mv6Var.b).a.setQueueTitle(str3);
                            return;
                        }
                        TLRPC.Chat chat = (TLRPC.Chat) hgbVar.i.f(-parseLong);
                        if (chat != null) {
                            str2 = chat.title;
                        } else {
                            str2 = "DELETED CHAT";
                        }
                        ((zu6) mv6Var.b).a.setQueueTitle(str2);
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    @Override
    public final void t(String str) {
        String str2;
        String str3;
        String str4;
        hgb hgbVar = this.g;
        ArrayList arrayList = hgbVar.g;
        if (str != null && str.length() != 0) {
            String lowerCase = str.toLowerCase();
            for (int i = 0; i < arrayList.size(); i++) {
                long longValue = ((Long) arrayList.get(i)).longValue();
                if (cf3.D(longValue)) {
                    TLRPC.User user = (TLRPC.User) hgbVar.h.f(longValue);
                    if (user == null) {
                        continue;
                    } else {
                        String str5 = user.first_name;
                        if (str5 != null) {
                            str3 = str5.toLowerCase();
                        } else {
                            str3 = null;
                        }
                        String str6 = user.last_name;
                        if (str6 != null) {
                            str4 = str6.toLowerCase();
                        } else {
                            str4 = null;
                        }
                        if ((str3 != null && str3.contains(lowerCase)) || (str4 != null && str4.contains(lowerCase))) {
                            q(longValue + "_0", null);
                            return;
                        }
                    }
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) hgbVar.i.f(-longValue);
                    if (chat != null && (str2 = chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                        q(longValue + "_0", null);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void x(String str, Bundle bundle) {
        q(str, bundle);
    }
}
