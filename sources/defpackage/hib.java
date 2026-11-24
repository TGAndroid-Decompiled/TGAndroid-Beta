package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class hib extends yw6 {
    public final iib g;

    public hib(iib iibVar) {
        super((byte) 1);
        this.g = iibVar;
    }

    @Override
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override
    public final void G(long j) {
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null) {
            MediaController.w().h0(k47Var, (float) ((j / 1000.0d) / k47Var.L0()));
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
        gda.D(i2);
        this.g.f();
        gm.c3(new zcb(this, (byte) 5));
    }

    @Override
    public final void P(int i) {
        int i2 = 0;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z != gda.J0) {
            MediaController w = MediaController.w();
            if (z) {
                i2 = 2;
            }
            w.k0(i2);
        }
        this.g.b.u0(gda.J0 ? 1 : 0);
        gm.c3(new zcb(this, (byte) 5));
    }

    @Override
    public final void S() {
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null && k47Var.I3()) {
            MediaController.w().T(false);
        }
    }

    @Override
    public final void V() {
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null && k47Var.I3()) {
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
        iib iibVar = this.g;
        if (equals) {
            gda.D((gda.O0 + 1) % 3);
            iibVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController w = MediaController.w();
            if (gda.J0) {
                i = 0;
            } else {
                i = 2;
            }
            w.k0(i);
            iibVar.b.u0(gda.J0 ? 1 : 0);
        }
    }

    @Override
    public final void k() {
        MediaController.w().Q(MediaController.w().v0, true);
    }

    @Override
    public final void n() {
        k47 k47Var = MediaController.w().v0;
        if (k47Var == null) {
            iib iibVar = this.g;
            if (iibVar.d != 0) {
                q(kt6.q(new StringBuilder(), iibVar.d, "_0"), null);
                return;
            }
            return;
        }
        MediaController.w().R(k47Var);
    }

    @Override
    public final void q(String str, Bundle bundle) {
        String str2;
        String str3;
        iib iibVar = this.g;
        mx6 mx6Var = iibVar.b;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("_");
            if (split.length == 2) {
                try {
                    long parseLong = Long.parseLong(split[0]);
                    int parseInt = Integer.parseInt(split[1]);
                    ArrayList arrayList = (ArrayList) iibVar.j.f(parseLong);
                    if (arrayList == null) {
                        iibVar.e(new j2b(this, str, bundle, (byte) 13), parseLong);
                        return;
                    }
                    ArrayList arrayList2 = (ArrayList) iibVar.k.f(parseLong);
                    if (parseInt >= 0 && parseInt < arrayList.size()) {
                        iibVar.d = parseLong;
                        oc7.r1(iibVar.c).W3.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                        MediaController.w().n0(arrayList, (k47) arrayList.get(parseInt), 0L, false, null, 0L);
                        mx6Var.s0(arrayList2);
                        if (pg3.D(parseLong)) {
                            TLRPC.User user = (TLRPC.User) iibVar.h.f(parseLong);
                            if (user != null) {
                                str3 = bw2.m(0, user.first_name, user.last_name);
                            } else {
                                str3 = "DELETED USER";
                            }
                            ((zw6) mx6Var.b).a.setQueueTitle(str3);
                            return;
                        }
                        TLRPC.Chat chat = (TLRPC.Chat) iibVar.i.f(-parseLong);
                        if (chat != null) {
                            str2 = chat.title;
                        } else {
                            str2 = "DELETED CHAT";
                        }
                        ((zw6) mx6Var.b).a.setQueueTitle(str2);
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
    }

    @Override
    public final void t(String str) {
        String str2;
        String str3;
        String str4;
        iib iibVar = this.g;
        ArrayList arrayList = iibVar.g;
        if (str != null && str.length() != 0) {
            String lowerCase = str.toLowerCase();
            for (int i = 0; i < arrayList.size(); i++) {
                long longValue = ((Long) arrayList.get(i)).longValue();
                if (pg3.D(longValue)) {
                    TLRPC.User user = (TLRPC.User) iibVar.h.f(longValue);
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
                    TLRPC.Chat chat = (TLRPC.Chat) iibVar.i.f(-longValue);
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
