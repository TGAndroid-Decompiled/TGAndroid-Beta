package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g00 extends android.support.v4.media.session.s {
    public final h00 f15652g;

    public g00(h00 h00Var) {
        super(0);
        this.f15652g = h00Var;
    }

    @Override
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override
    public final void G(long j10) {
        jj jjVar = MediaController.B().f14482u0;
        if (jjVar != null) {
            MediaController.B().i0(jjVar, (float) ((j10 / 1000.0d) / jjVar.L0()));
        }
    }

    @Override
    public final void M(int i10) {
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                i11 = 0;
            } else {
                i11 = 1;
            }
        }
        tz.E(i11);
        this.f15652g.f();
        i0.g3(new ms(this, 17));
    }

    @Override
    public final void P(int i10) {
        int i11 = 0;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (z10 != tz.N0) {
            MediaController B = MediaController.B();
            if (z10) {
                i11 = 2;
            }
            B.l0(i11);
        }
        this.f15652g.f15801b.F(tz.N0 ? 1 : 0);
        i0.g3(new ms(this, 17));
    }

    @Override
    public final void S() {
        jj jjVar = MediaController.B().f14482u0;
        if (jjVar != null && jjVar.I3()) {
            MediaController.B().U(false);
        }
    }

    @Override
    public final void V() {
        jj jjVar = MediaController.B().f14482u0;
        if (jjVar != null && jjVar.I3()) {
            MediaController.B().V();
        }
    }

    @Override
    public final void Y(long j10) {
        MediaController.B().T((int) j10);
    }

    @Override
    public final void f(String str) {
        int i10;
        boolean equals = "org.telegram.android.musicplayer.repeat".equals(str);
        h00 h00Var = this.f15652g;
        if (equals) {
            tz.E((tz.S0 + 1) % 3);
            h00Var.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController B = MediaController.B();
            if (tz.N0) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            B.l0(i10);
            h00Var.f15801b.F(tz.N0 ? 1 : 0);
        }
    }

    @Override
    public final void k() {
        MediaController.B().R(MediaController.B().f14482u0, true);
    }

    @Override
    public final void n() {
        jj jjVar = MediaController.B().f14482u0;
        if (jjVar == null) {
            h00 h00Var = this.f15652g;
            if (h00Var.d != 0) {
                q(a1.g.q(new StringBuilder(), h00Var.d, "_0"), null);
                return;
            }
            return;
        }
        MediaController.B().S(jjVar);
    }

    @Override
    public final void q(String str, Bundle bundle) {
        String str2;
        String str3;
        h00 h00Var = this.f15652g;
        android.support.v4.media.session.a0 a0Var = h00Var.f15801b;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("_");
            if (split.length == 2) {
                try {
                    long parseLong = Long.parseLong(split[0]);
                    int parseInt = Integer.parseInt(split[1]);
                    ArrayList arrayList = (ArrayList) h00Var.f15806j.f(parseLong);
                    if (arrayList == null) {
                        h00Var.e(new e00(this, str, bundle), parseLong);
                        return;
                    }
                    ArrayList arrayList2 = (ArrayList) h00Var.f15807k.f(parseLong);
                    if (parseInt >= 0 && parseInt < arrayList.size()) {
                        h00Var.d = parseLong;
                        vp.r1(h00Var.f15802c).e7.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                        MediaController.B().o0(arrayList, (jj) arrayList.get(parseInt), 0L, false, null);
                        a0Var.D(arrayList2);
                        if (o5.E(parseLong)) {
                            TLRPC.User user = (TLRPC.User) h00Var.h.f(parseLong);
                            if (user != null) {
                                str3 = i5.m(0, user.first_name, user.last_name);
                            } else {
                                str3 = "DELETED USER";
                            }
                            ((android.support.v4.media.session.u) a0Var.f875b).f902a.setQueueTitle(str3);
                            return;
                        }
                        TLRPC.Chat chat = (TLRPC.Chat) h00Var.f15805i.f(-parseLong);
                        if (chat != null) {
                            str2 = chat.title;
                        } else {
                            str2 = "DELETED CHAT";
                        }
                        ((android.support.v4.media.session.u) a0Var.f875b).f902a.setQueueTitle(str2);
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    @Override
    public final void t(String str) {
        String str2;
        String str3;
        String str4;
        h00 h00Var = this.f15652g;
        ArrayList arrayList = h00Var.f15804g;
        if (str != null && str.length() != 0) {
            String lowerCase = str.toLowerCase();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                long longValue = ((Long) arrayList.get(i10)).longValue();
                if (o5.E(longValue)) {
                    TLRPC.User user = (TLRPC.User) h00Var.h.f(longValue);
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
                    TLRPC.Chat chat = (TLRPC.Chat) h00Var.f15805i.f(-longValue);
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
