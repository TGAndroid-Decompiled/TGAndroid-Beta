package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
public final class ckb extends dx6 {
    public final dkb g;

    public ckb(dkb dkbVar) {
        super((byte) 1);
        this.g = dkbVar;
    }

    @Override
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override
    public final void G(long j) {
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null) {
            MediaController.z().k0(r47Var, (float) ((j / 1000.0d) / r47Var.L0()));
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
        xea.D(i2);
        this.g.f();
        hl.c3(new s8b(this, (byte) 14));
    }

    @Override
    public final void P(int i) {
        int i2 = 0;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z != xea.J0) {
            MediaController z2 = MediaController.z();
            if (z) {
                i2 = 2;
            }
            z2.n0(i2);
        }
        this.g.b.v0(xea.J0 ? 1 : 0);
        hl.c3(new s8b(this, (byte) 14));
    }

    @Override
    public final void S() {
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null && r47Var.I3()) {
            MediaController.z().X(false);
        }
    }

    @Override
    public final void V() {
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null && r47Var.I3()) {
            MediaController.z().Y();
        }
    }

    @Override
    public final void Y(long j) {
        MediaController.z().W((int) j);
    }

    @Override
    public final void f(String str) {
        int i;
        boolean equals = "org.telegram.android.musicplayer.repeat".equals(str);
        dkb dkbVar = this.g;
        if (equals) {
            xea.D((xea.O0 + 1) % 3);
            dkbVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController z = MediaController.z();
            if (xea.J0) {
                i = 0;
            } else {
                i = 2;
            }
            z.n0(i);
            dkbVar.b.v0(xea.J0 ? 1 : 0);
        }
    }

    @Override
    public final void k() {
        MediaController.z().U(MediaController.z().v0, true);
    }

    @Override
    public final void n() {
        r47 r47Var = MediaController.z().v0;
        if (r47Var == null) {
            dkb dkbVar = this.g;
            if (dkbVar.d != 0) {
                q(qu6.p(new StringBuilder(), dkbVar.d, "_0"), null);
                return;
            }
            return;
        }
        MediaController.z().V(r47Var);
    }

    @Override
    public final void q(String str, Bundle bundle) {
        String str2;
        String str3;
        dkb dkbVar = this.g;
        rx6 rx6Var = dkbVar.b;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("_");
            if (split.length == 2) {
                try {
                    long parseLong = Long.parseLong(split[0]);
                    int parseInt = Integer.parseInt(split[1]);
                    ArrayList arrayList = (ArrayList) dkbVar.j.f(parseLong);
                    if (arrayList == null) {
                        dkbVar.e(new pwa(this, str, bundle, (byte) 19), parseLong);
                        return;
                    }
                    ArrayList arrayList2 = (ArrayList) dkbVar.k.f(parseLong);
                    if (parseInt >= 0 && parseInt < arrayList.size()) {
                        dkbVar.d = parseLong;
                        uc7.s1(dkbVar.c).W3.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                        MediaController.z().q0(arrayList, (r47) arrayList.get(parseInt), 0L, false, null, 0L);
                        rx6Var.t0(arrayList2);
                        if (wf3.D(parseLong)) {
                            TLRPC.User user = (TLRPC.User) dkbVar.h.f(parseLong);
                            if (user != null) {
                                str3 = lv2.m(0, user.first_name, user.last_name);
                            } else {
                                str3 = "DELETED USER";
                            }
                            ((ex6) rx6Var.b).a.setQueueTitle(str3);
                            return;
                        }
                        TLRPC.Chat chat = (TLRPC.Chat) dkbVar.i.f(-parseLong);
                        if (chat != null) {
                            str2 = chat.title;
                        } else {
                            str2 = "DELETED CHAT";
                        }
                        ((ex6) rx6Var.b).a.setQueueTitle(str2);
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    @Override
    public final void t(String str) {
        String str2;
        String str3;
        String str4;
        dkb dkbVar = this.g;
        ArrayList arrayList = dkbVar.g;
        if (str != null && str.length() != 0) {
            String lowerCase = str.toLowerCase();
            for (int i = 0; i < arrayList.size(); i++) {
                long longValue = ((Long) arrayList.get(i)).longValue();
                if (wf3.D(longValue)) {
                    TLRPC.User user = (TLRPC.User) dkbVar.h.f(longValue);
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
                    TLRPC.Chat chat = (TLRPC.Chat) dkbVar.i.f(-longValue);
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
