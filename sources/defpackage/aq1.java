package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
public final class aq1 extends c6 {
    public final Context a;
    public final mu1 b;

    public aq1(mu1 mu1Var, Context context) {
        this.b = mu1Var;
        this.a = context;
    }

    @Override
    public final void b(int i) {
        boolean z;
        boolean z2;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User V1;
        boolean z3;
        boolean z4;
        int i2;
        wjb wjbVar;
        int i3;
        int i4;
        boolean z5;
        long j;
        int i5;
        int i6;
        long j2;
        int i7;
        int i8;
        boolean z6;
        TLRPC.User user2;
        a aVar;
        lwb lwbVar;
        mu1 mu1Var = this.b;
        SparseArray[] sparseArrayArr = mu1Var.q6;
        SparseArray[] sparseArrayArr2 = mu1Var.p6;
        SparseArray[] sparseArrayArr3 = mu1Var.o6;
        if (i != -2 && i != 75 && i != -1 && (lwbVar = mu1Var.n0) != null && lwbVar.y > 0.0f) {
            lwbVar.d();
        }
        boolean z7 = true;
        if (i == -1) {
            if (!mu1Var.fd.f) {
                aVar = ((d) mu1Var).actionBar;
                if (aVar.y()) {
                    mu1Var.F5(false);
                    return;
                } else if (mu1Var.g4 == 5 && (mu1Var.M6.isEmpty() || mu1Var.s4 == 0)) {
                    mu1Var.hc();
                    return;
                } else if (mu1Var.g4 == 6 && mu1Var.a0.A()) {
                    mu1Var.Mb(new Runnable(this) {
                        public final aq1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r2;
                            aq1 aq1Var = this.b;
                            switch (b) {
                                case 0:
                                    aq1Var.b.finishFragment();
                                    return;
                                default:
                                    mu1 mu1Var2 = aq1Var.b;
                                    Intent intent = new Intent(mu1Var2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", mu1Var2.e4.link);
                                    mu1Var2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!mu1Var.d5(true, true)) {
                    mu1Var.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            mu1Var.za();
        } else if (i == 59) {
            if (mu1Var.getUserConfig().e() == mu1Var.l6) {
                mu1Var.getMessagesController().T4(true);
                mu1Var.p1.e(false, true);
                return;
            }
            pub pubVar = mu1Var.getMessagesController().g4;
            pubVar.getClass();
            TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
            tL_channels_toggleViewForumAsMessages.channel_id = pubVar.getMessagesController().f1(-mu1Var.l6);
            tL_channels_toggleViewForumAsMessages.enabled = false;
            pubVar.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new wx9(pubVar, (byte) 14));
            qvb.L0(mu1Var);
        } else {
            String str = null;
            k27 k27Var = null;
            if (i == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j3 = 0;
                for (int i9 = 1; i9 >= 0; i9--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < sparseArrayArr2[i9].size(); i10++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i9].keyAt(i10)));
                    }
                    if (mu1Var.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        k27 k27Var2 = (k27) sparseArrayArr2[i9].get(((Integer) arrayList.get(i11)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user2 = mu1Var.f) == null || !user2.self)) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        spannableStringBuilder.append((CharSequence) mu1.R6(j3, k27Var2, z6));
                        j3 = k27Var2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    gl.g(spannableStringBuilder);
                    mu1Var.b6();
                    mu1Var.N3.j(58, 0L, null);
                }
                mu1Var.F5(false);
            } else if (i == 12) {
                if (mu1Var.getParentActivity() != null) {
                    mu1Var.M5(null, null, false);
                }
            } else if (i == 11) {
                mu1Var.ga(true);
            } else if (i == 69) {
                mu1Var.Gb();
            } else if (i == 70) {
                TLRPC.Chat chat = mu1Var.e;
                if (chat != null) {
                    mu1Var.presentFragment(mu1.W9(-chat.linked_monoforum_id));
                }
            } else if (i == 72) {
                long j4 = mu1Var.l6;
                if (hc2.p0(mu1Var.e)) {
                    i8 = ((d) mu1Var).currentAccount;
                    if (hc2.A(i8, mu1Var.e, 24)) {
                        j4 = mu1Var.s4;
                        j2 = mu1Var.l6;
                        long j5 = j4;
                        i7 = ((d) mu1Var).currentAccount;
                        gta.v(i7, false).g0(j5, j2, false, false);
                    }
                }
                j2 = 0;
                long j52 = j4;
                i7 = ((d) mu1Var).currentAccount;
                gta.v(i7, false).g0(j52, j2, false, false);
            } else if (i == 71) {
                long j6 = mu1Var.l6;
                if (hc2.p0(mu1Var.e)) {
                    i6 = ((d) mu1Var).currentAccount;
                    if (hc2.A(i6, mu1Var.e, 24)) {
                        j6 = mu1Var.s4;
                        j = mu1Var.l6;
                        long j7 = j6;
                        i5 = ((d) mu1Var).currentAccount;
                        gta.v(i5, false).z(j7, j, new um1(this, j7, j, (byte) 1));
                    }
                }
                j = 0;
                long j72 = j6;
                i5 = ((d) mu1Var).currentAccount;
                gta.v(i5, false).z(j72, j, new um1(this, j72, j, (byte) 1));
            } else if (i == 28) {
                if (mu1Var.Bb == null) {
                    mu1Var.lc();
                } else {
                    mu1Var.C7();
                }
            } else if (i == 25) {
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 1; i12 >= 0; i12--) {
                    for (int i13 = 0; i13 < sparseArrayArr3[i12].size(); i13++) {
                        arrayList2.add((k27) sparseArrayArr3[i12].valueAt(i13));
                    }
                    sparseArrayArr3[i12].clear();
                    sparseArrayArr2[i12].clear();
                    sparseArrayArr[i12].clear();
                }
                if (mu1Var.x6 > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                mu1Var.u7();
                mu1Var.Uc(0, true);
                mu1Var.ud(false);
                MediaController.f0(mu1Var.getParentActivity(), mu1Var.getAccountInstance(), arrayList2, new yp1((byte) 0, this, z5));
            } else if (i == 13) {
                if (mu1Var.getParentActivity() != null) {
                    mu1Var.showDialog(ij.S(mu1Var.getParentActivity(), mu1Var.h, mu1Var.Ba).a);
                }
            } else if (i != 15 && i != 16 && i != 26) {
                if (i == 17) {
                    if (mu1Var.f != null && mu1Var.getParentActivity() != null) {
                        TextView textView = mu1Var.a2;
                        if (textView != null && textView.getTag() != null) {
                            mu1Var.Hb(((Integer) mu1Var.a2.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", mu1Var.f.id);
                        bundle.putBoolean("addContact", true);
                        mu1Var.presentFragment(new it2(bundle));
                    }
                } else if (i == 18) {
                    mu1Var.vc(false);
                } else if (i == 24) {
                    try {
                        hq6 mediaDataController = mu1Var.getMediaDataController();
                        long j8 = mu1Var.f.id;
                        Pattern pattern = hq6.U1;
                        mediaDataController.z0(j8, 0, null);
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                } else if (i == 29) {
                    if (hc2.N(mu1Var.e)) {
                        lo0 lo0Var = new lo0(mu1Var.l6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = mu1Var.S1;
                        lo0Var.U = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            lo0Var.getMessagesController().E0().b(lo0Var.S, lo0Var.U, new co0(lo0Var, (byte) 0));
                        }
                        mu1Var.presentFragment(lo0Var);
                        return;
                    }
                    mu1Var.getNotificationCenter().k(kk7.o3, Long.valueOf(mu1Var.l6));
                } else if (i == 21) {
                    int i14 = b89.v1;
                    int currentAccount = mu1Var.getCurrentAccount();
                    Activity parentActivity = mu1Var.getParentActivity();
                    long a = mu1Var.a();
                    if (parentActivity != null) {
                        b89.D0(currentAccount, parentActivity, a, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i == 22) {
                    for (int i15 = 0; i15 < 2; i15++) {
                        for (int i16 = 0; i16 < sparseArrayArr[i15].size(); i16++) {
                            k27 k27Var3 = (k27) sparseArrayArr[i15].valueAt(i16);
                            mu1Var.getMediaDataController().d(2, k27Var3, k27Var3.F0(), (int) (System.currentTimeMillis() / 1000), !mu1Var.r6);
                        }
                    }
                    mu1Var.F5(false);
                } else if (i == 23) {
                    for (int i17 = 1; i17 >= 0; i17--) {
                        if (k27Var == null && sparseArrayArr3[i17].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i18 = 0; i18 < sparseArrayArr3[i17].size(); i18++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i17].keyAt(i18)));
                            }
                            k27Var = (k27) mu1Var.G6[i17].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i17].clear();
                        sparseArrayArr2[i17].clear();
                        sparseArrayArr[i17].clear();
                    }
                    if (k27Var != null && k27Var.C4()) {
                        mu1Var.v5 = k27Var;
                        mu1Var.Ja(109);
                    } else {
                        mu1Var.qc(k27Var, false);
                    }
                    mu1Var.u7();
                    mu1Var.Uc(0, true);
                    mu1Var.ud(false);
                } else if (i == 64) {
                    i3 = ((d) mu1Var).currentAccount;
                    nx8 c = ox8.f(i3).c(mu1Var.W6());
                    Activity parentActivity2 = mu1Var.getParentActivity();
                    i4 = ((d) mu1Var).currentAccount;
                    kx8.g0(parentActivity2, i4, mu1Var.f4, c, mu1Var.getResourceProvider(), new x0(this, c, (byte) 24));
                } else if (i == 14) {
                    a8 a8Var = new a8(0, mu1Var.getResourceProvider(), this.a, true, true);
                    a8Var.j(k96.M0(2131753950, null), 2131231498, null);
                    a8Var.setOnClickListener(new x91(this, (byte) 6));
                    r7 r7Var = mu1Var.j0;
                    q6 q6Var = mu1Var.g0;
                    q6Var.a();
                    r7Var.U(a8Var, q6Var.m);
                } else if (i == 30) {
                    mu1Var.getSendMessagesHelper().q0(x3a.b("/help", mu1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i == 31) {
                    mu1Var.getSendMessagesHelper().q0(x3a.b("/settings", mu1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i == 40) {
                    if (mu1Var.Z7()) {
                        str = "";
                    }
                    mu1Var.ra(str);
                } else if (i == 62) {
                    mu1Var.getMessagesController().i4.J(mu1Var.a(), false, true);
                    if (!mu1Var.getMessagesController().i4.K(mu1Var.a(), true)) {
                        mu1Var.nd(true);
                    }
                } else if (i != 32 && i != 33) {
                    if (i == 27) {
                        mu1Var.Nb();
                    } else if (i == 60) {
                        if (mu1Var.r4 != null) {
                            pub pubVar2 = mu1Var.getMessagesController().g4;
                            long j9 = mu1Var.e.id;
                            TLRPC.TL_forumTopic tL_forumTopic = mu1Var.r4;
                            int i19 = tL_forumTopic.id;
                            tL_forumTopic.closed = true;
                            pubVar2.z(i19, j9, true);
                            mu1Var.od();
                            mu1Var.Dc(false);
                            mu1Var.nd(true);
                        }
                    } else if (i == 61) {
                        qvb.L0(mu1Var);
                    } else if (i == 65) {
                        gl.g(mu1Var.e4.link);
                        u21.b0(LaunchActivity.Q()).k(false).j();
                    } else if (i == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final aq1 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b = r2;
                                aq1 aq1Var = this.b;
                                switch (b) {
                                    case 0:
                                        aq1Var.b.finishFragment();
                                        return;
                                    default:
                                        mu1 mu1Var2 = aq1Var.b;
                                        Intent intent = new Intent(mu1Var2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", mu1Var2.e4.link);
                                        mu1Var2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (mu1Var.a0.A()) {
                            mu1Var.Mb(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i == 67) {
                        Activity parentActivity3 = mu1Var.getParentActivity();
                        i2 = ((d) mu1Var).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = mu1Var.e4;
                        wjbVar = ((d) mu1Var).resourceProvider;
                        f41.f0(parentActivity3, i2, tL_businessChatLink, wjbVar);
                    } else if (i == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var.getResourceProvider(), mu1Var.getParentActivity());
                        String M0 = k96.M0(2131752695, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131752696, null);
                        alertDialog$Builder.j(k96.M0(2131746128, null), new rh1(this, (byte) 6));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        mu1Var.showDialog(hdVar);
                        TextView textView2 = (TextView) hdVar.c(-1);
                        if (textView2 != null) {
                            zkb.X(textView2, bkb.p7, mu1Var.getResourceProvider());
                        }
                    } else if (i == 75) {
                        if (mu1Var.b8() && mu1Var.v6() != null) {
                            gl.t1(mu1Var.m1);
                            mu1Var.n0.requestLayout();
                            lwb lwbVar2 = mu1Var.n0;
                            lwbVar2.n();
                            lwbVar2.a(1.0f, 0.0f);
                        }
                    } else if (i == 73) {
                        vtb e0 = vtb.e0(-mu1Var.l6, 0L);
                        e0.E = mu1Var;
                        mu1Var.presentFragment(e0);
                    } else if (i == 888) {
                        mu1Var.dumpCanvas();
                    } else if (i == 889) {
                        HashSet hashSet = o.d1;
                        u21.b0(mu1Var).t("No rich message copied", null).j();
                    }
                } else if (mu1Var.f != null && mu1Var.getParentActivity() != null) {
                    TLRPC.User user3 = mu1Var.f;
                    if (i == 33) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    TLRPC.UserFull userFull = mu1Var.s8;
                    if (userFull != null && userFull.video_calls_available) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    rgc.m(user3, z3, z4, mu1Var.getParentActivity(), mu1Var.getMessagesController().W1(mu1Var.f.id), mu1Var.getAccountInstance());
                }
            } else if (mu1Var.getParentActivity() != null) {
                if (i == 15 && hc2.p0(mu1Var.e)) {
                    if (mu1Var.s4 != 0 && (V1 = mu1Var.getMessagesController().V1(Long.valueOf(mu1Var.s4))) != null) {
                        ij.q(mu1Var, -1, V1, mu1Var.e, true, new q31(this, V1, (byte) 16), mu1Var.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = mu1Var.r8;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z = true;
                } else {
                    z = false;
                }
                if (i != 26 && (i != 15 || mu1Var.h != null || (((user = mu1Var.f) == null || l7c.D(user) || l7c.z(mu1Var.f)) && ((chatFull = mu1Var.r8) == null || !chatFull.can_delete_channel)))) {
                    if (i == 15) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    TLRPC.Chat chat2 = mu1Var.e;
                    boolean z8 = z2;
                    TLRPC.User user4 = mu1Var.f;
                    if (mu1Var.h == null) {
                        z7 = false;
                    }
                    ij.r(mu1Var, z8, chat2, user4, z7, true, false, z, new jh(this, i, z));
                    return;
                }
                ij.q(mu1Var, -1, mu1Var.f, mu1Var.e, z, new zp1(this, z), mu1Var.getResourceProvider());
            }
        }
    }
}
