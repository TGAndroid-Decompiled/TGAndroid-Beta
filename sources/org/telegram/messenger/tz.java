package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tz extends android.support.v4.media.session.s {
    public final uz f26762g;

    public tz(uz uzVar) {
        super(0);
        this.f26762g = uzVar;
    }

    @Override
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override
    public final void G(long j3) {
        gj gjVar = MediaController.B().f22377v0;
        if (gjVar != null) {
            MediaController.B().i0(gjVar, (float) ((j3 / 1000.0d) / gjVar.L0()));
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
        gz.E(i10);
        this.f26762g.f();
        g0.h3(new as(this, 16));
    }

    @Override
    public final void P(int i7) {
        int i10 = 0;
        boolean z10 = true;
        if (i7 != 1 && i7 != 2) {
            z10 = false;
        }
        if (z10 != gz.N0) {
            MediaController B = MediaController.B();
            if (z10) {
                i10 = 2;
            }
            B.l0(i10);
        }
        this.f26762g.f26902b.w(gz.N0 ? 1 : 0);
        g0.h3(new as(this, 16));
    }

    @Override
    public final void S() {
        gj gjVar = MediaController.B().f22377v0;
        if (gjVar != null && gjVar.I3()) {
            MediaController.B().U(false);
        }
    }

    @Override
    public final void V() {
        gj gjVar = MediaController.B().f22377v0;
        if (gjVar != null && gjVar.I3()) {
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
        uz uzVar = this.f26762g;
        if (equals) {
            gz.E((gz.S0 + 1) % 3);
            uzVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController B = MediaController.B();
            if (gz.N0) {
                i7 = 0;
            } else {
                i7 = 2;
            }
            B.l0(i7);
            uzVar.f26902b.w(gz.N0 ? 1 : 0);
        }
    }

    @Override
    public final void k() {
        MediaController.B().R(MediaController.B().f22377v0, true);
    }

    @Override
    public final void n() {
        gj gjVar = MediaController.B().f22377v0;
        if (gjVar == null) {
            uz uzVar = this.f26762g;
            if (uzVar.d != 0) {
                q(a8.p0.r(new StringBuilder(), uzVar.d, "_0"), null);
                return;
            }
            return;
        }
        MediaController.B().S(gjVar);
    }

    @Override
    public final void q(String str, Bundle bundle) {
        String str2;
        String str3;
        uz uzVar = this.f26762g;
        android.support.v4.media.session.a0 a0Var = uzVar.f26902b;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("_");
            if (split.length == 2) {
                try {
                    long parseLong = Long.parseLong(split[0]);
                    int parseInt = Integer.parseInt(split[1]);
                    ArrayList arrayList = (ArrayList) uzVar.f26908j.f(parseLong);
                    if (arrayList == null) {
                        uzVar.e(new sz(this, str, bundle, 0), parseLong);
                        return;
                    }
                    ArrayList arrayList2 = (ArrayList) uzVar.f26909k.f(parseLong);
                    if (parseInt >= 0 && parseInt < arrayList.size()) {
                        uzVar.d = parseLong;
                        np.s1(uzVar.f26903c).f25273e7.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                        MediaController.B().o0(arrayList, (gj) arrayList.get(parseInt), 0L, false, null, 0L);
                        a0Var.u(arrayList2);
                        if (m5.E(parseLong)) {
                            TLRPC.User user = (TLRPC.User) uzVar.h.f(parseLong);
                            if (user != null) {
                                str3 = g5.m(0, user.first_name, user.last_name);
                            } else {
                                str3 = "DELETED USER";
                            }
                            ((android.support.v4.media.session.u) a0Var.f1713b).f1743a.setQueueTitle(str3);
                            return;
                        }
                        TLRPC.Chat chat = (TLRPC.Chat) uzVar.f26907i.f(-parseLong);
                        if (chat != null) {
                            str2 = chat.title;
                        } else {
                            str2 = "DELETED CHAT";
                        }
                        ((android.support.v4.media.session.u) a0Var.f1713b).f1743a.setQueueTitle(str2);
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
        uz uzVar = this.f26762g;
        ArrayList arrayList = uzVar.f26906g;
        if (str != null && str.length() != 0) {
            String lowerCase = str.toLowerCase();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                long longValue = ((Long) arrayList.get(i7)).longValue();
                if (m5.E(longValue)) {
                    TLRPC.User user = (TLRPC.User) uzVar.h.f(longValue);
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
                    TLRPC.Chat chat = (TLRPC.Chat) uzVar.f26907i.f(-longValue);
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
