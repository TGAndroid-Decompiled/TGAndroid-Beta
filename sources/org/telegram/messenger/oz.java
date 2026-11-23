package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oz extends android.support.v4.media.session.s {
    public final pz f26223g;

    public oz(pz pzVar) {
        super(0);
        this.f26223g = pzVar;
    }

    @Override
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override
    public final void G(long j3) {
        fj fjVar = MediaController.B().f22838v0;
        if (fjVar != null) {
            MediaController.B().i0(fjVar, (float) ((j3 / 1000.0d) / fjVar.L0()));
        }
    }

    @Override
    public final void M(int i7) {
        int i10 = 2;
        if (i7 != 1) {
            if (i7 != 2 && i7 != 3) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        bz.E(i10);
        this.f26223g.f();
        g0.g3(new xr(this, 16));
    }

    @Override
    public final void P(int i7) {
        int i10 = 0;
        boolean z10 = true;
        if (i7 != 1 && i7 != 2) {
            z10 = false;
        }
        if (z10 != bz.N0) {
            MediaController B = MediaController.B();
            if (z10) {
                i10 = 2;
            }
            B.l0(i10);
        }
        this.f26223g.f26419b.x(bz.N0 ? 1 : 0);
        g0.g3(new xr(this, 16));
    }

    @Override
    public final void S() {
        fj fjVar = MediaController.B().f22838v0;
        if (fjVar != null && fjVar.I3()) {
            MediaController.B().U(false);
        }
    }

    @Override
    public final void V() {
        fj fjVar = MediaController.B().f22838v0;
        if (fjVar != null && fjVar.I3()) {
            MediaController.B().V();
        }
    }

    @Override
    public final void Y(long j3) {
        MediaController.B().T((int) j3);
    }

    @Override
    public final void f(String str) {
        int i7;
        boolean equals = "org.telegram.android.musicplayer.repeat".equals(str);
        pz pzVar = this.f26223g;
        if (equals) {
            bz.E((bz.S0 + 1) % 3);
            pzVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController B = MediaController.B();
            if (bz.N0) {
                i7 = 0;
            } else {
                i7 = 2;
            }
            B.l0(i7);
            pzVar.f26419b.x(bz.N0 ? 1 : 0);
        }
    }

    @Override
    public final void k() {
        MediaController.B().R(MediaController.B().f22838v0, true);
    }

    @Override
    public final void n() {
        fj fjVar = MediaController.B().f22838v0;
        if (fjVar == null) {
            pz pzVar = this.f26223g;
            if (pzVar.d != 0) {
                q(a8.p0.r(new StringBuilder(), pzVar.d, "_0"), null);
                return;
            }
            return;
        }
        MediaController.B().S(fjVar);
    }

    @Override
    public final void q(String str, Bundle bundle) {
        String str2;
        String str3;
        pz pzVar = this.f26223g;
        android.support.v4.media.session.a0 a0Var = pzVar.f26419b;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("_");
            if (split.length == 2) {
                try {
                    long parseLong = Long.parseLong(split[0]);
                    int parseInt = Integer.parseInt(split[1]);
                    ArrayList arrayList = (ArrayList) pzVar.f26425j.f(parseLong);
                    if (arrayList == null) {
                        pzVar.e(new nz(this, str, bundle, 0), parseLong);
                        return;
                    }
                    ArrayList arrayList2 = (ArrayList) pzVar.f26426k.f(parseLong);
                    if (parseInt >= 0 && parseInt < arrayList.size()) {
                        pzVar.d = parseLong;
                        mp.u1(pzVar.f26420c).f25753g7.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                        MediaController.B().o0(arrayList, (fj) arrayList.get(parseInt), 0L, false, null, 0L);
                        a0Var.v(arrayList2);
                        if (n5.E(parseLong)) {
                            TLRPC.User user = (TLRPC.User) pzVar.h.f(parseLong);
                            if (user != null) {
                                str3 = i5.m(0, user.first_name, user.last_name);
                            } else {
                                str3 = "DELETED USER";
                            }
                            ((android.support.v4.media.session.u) a0Var.f1676b).f1706a.setQueueTitle(str3);
                            return;
                        }
                        TLRPC.Chat chat = (TLRPC.Chat) pzVar.f26424i.f(-parseLong);
                        if (chat != null) {
                            str2 = chat.title;
                        } else {
                            str2 = "DELETED CHAT";
                        }
                        ((android.support.v4.media.session.u) a0Var.f1676b).f1706a.setQueueTitle(str2);
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
        pz pzVar = this.f26223g;
        ArrayList arrayList = pzVar.f26423g;
        if (str != null && str.length() != 0) {
            String lowerCase = str.toLowerCase();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                long longValue = ((Long) arrayList.get(i7)).longValue();
                if (n5.E(longValue)) {
                    TLRPC.User user = (TLRPC.User) pzVar.h.f(longValue);
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
                    TLRPC.Chat chat = (TLRPC.Chat) pzVar.f26424i.f(-longValue);
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
