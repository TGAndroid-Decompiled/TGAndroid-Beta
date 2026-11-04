package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nz extends android.support.v4.media.session.s {
    public final oz f24464g;

    public nz(oz ozVar) {
        super(0);
        this.f24464g = ozVar;
    }

    @Override
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override
    public final void G(long j10) {
        zi ziVar = MediaController.B().f21348v0;
        if (ziVar != null) {
            MediaController.B().i0(ziVar, (float) ((j10 / 1000.0d) / ziVar.L0()));
        }
    }

    @Override
    public final void M(int i3) {
        int i10 = 2;
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        az.E(i10);
        this.f24464g.f();
        g0.h3(new vs(this, 16));
    }

    @Override
    public final void P(int i3) {
        int i10 = 0;
        boolean z10 = true;
        if (i3 != 1 && i3 != 2) {
            z10 = false;
        }
        if (z10 != az.N0) {
            MediaController B = MediaController.B();
            if (z10) {
                i10 = 2;
            }
            B.l0(i10);
        }
        this.f24464g.f24631b.w(az.N0 ? 1 : 0);
        g0.h3(new vs(this, 16));
    }

    @Override
    public final void S() {
        zi ziVar = MediaController.B().f21348v0;
        if (ziVar != null && ziVar.J3()) {
            MediaController.B().U(false);
        }
    }

    @Override
    public final void V() {
        zi ziVar = MediaController.B().f21348v0;
        if (ziVar != null && ziVar.J3()) {
            MediaController.B().V();
        }
    }

    @Override
    public final void Y(long j10) {
        MediaController.B().T((int) j10);
    }

    @Override
    public final void f(String str) {
        int i3;
        boolean equals = "org.telegram.android.musicplayer.repeat".equals(str);
        oz ozVar = this.f24464g;
        if (equals) {
            az.E((az.S0 + 1) % 3);
            ozVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController B = MediaController.B();
            if (az.N0) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            B.l0(i3);
            ozVar.f24631b.w(az.N0 ? 1 : 0);
        }
    }

    @Override
    public final void k() {
        MediaController.B().R(MediaController.B().f21348v0, true);
    }

    @Override
    public final void n() {
        zi ziVar = MediaController.B().f21348v0;
        if (ziVar == null) {
            oz ozVar = this.f24464g;
            if (ozVar.d != 0) {
                q(a1.g.r(new StringBuilder(), ozVar.d, "_0"), null);
                return;
            }
            return;
        }
        MediaController.B().S(ziVar);
    }

    @Override
    public final void q(String str, Bundle bundle) {
        String str2;
        String str3;
        oz ozVar = this.f24464g;
        android.support.v4.media.session.a0 a0Var = ozVar.f24631b;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("_");
            if (split.length == 2) {
                try {
                    long parseLong = Long.parseLong(split[0]);
                    int parseInt = Integer.parseInt(split[1]);
                    ArrayList arrayList = (ArrayList) ozVar.f24637j.f(parseLong);
                    if (arrayList == null) {
                        ozVar.e(new mz(this, str, bundle, 0), parseLong);
                        return;
                    }
                    ArrayList arrayList2 = (ArrayList) ozVar.f24638k.f(parseLong);
                    if (parseInt >= 0 && parseInt < arrayList.size()) {
                        ozVar.d = parseLong;
                        hp.s1(ozVar.f24632c).f22989d7.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                        MediaController.B().o0(arrayList, (zi) arrayList.get(parseInt), 0L, false, null, 0L);
                        a0Var.u(arrayList2);
                        if (m5.E(parseLong)) {
                            TLRPC.User user = (TLRPC.User) ozVar.h.f(parseLong);
                            if (user != null) {
                                str3 = g5.m(0, user.first_name, user.last_name);
                            } else {
                                str3 = "DELETED USER";
                            }
                            ((android.support.v4.media.session.u) a0Var.f1186b).f1216a.setQueueTitle(str3);
                            return;
                        }
                        TLRPC.Chat chat = (TLRPC.Chat) ozVar.f24636i.f(-parseLong);
                        if (chat != null) {
                            str2 = chat.title;
                        } else {
                            str2 = "DELETED CHAT";
                        }
                        ((android.support.v4.media.session.u) a0Var.f1186b).f1216a.setQueueTitle(str2);
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    @Override
    public final void t(String str) {
        String str2;
        String str3;
        String str4;
        oz ozVar = this.f24464g;
        ArrayList arrayList = ozVar.f24635g;
        if (str != null && str.length() != 0) {
            String lowerCase = str.toLowerCase();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                long longValue = ((Long) arrayList.get(i3)).longValue();
                if (m5.E(longValue)) {
                    TLRPC.User user = (TLRPC.User) ozVar.h.f(longValue);
                    if (user != null) {
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
                    } else {
                        continue;
                    }
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) ozVar.f24636i.f(-longValue);
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
