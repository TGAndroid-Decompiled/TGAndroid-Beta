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
public final class nr1 extends c6 {
    public final Context a;
    public final yv1 b;

    public nr1(yv1 yv1Var, Context context) {
        this.b = yv1Var;
        this.a = context;
    }

    @Override
    public final void b(int i) {
        boolean z;
        boolean z2;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User W1;
        boolean z3;
        boolean z4;
        int i2;
        ylb ylbVar;
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
        oyb oybVar;
        yv1 yv1Var = this.b;
        SparseArray[] sparseArrayArr = yv1Var.q6;
        SparseArray[] sparseArrayArr2 = yv1Var.p6;
        SparseArray[] sparseArrayArr3 = yv1Var.o6;
        if (i != -2 && i != 75 && i != -1 && (oybVar = yv1Var.n0) != null && oybVar.y > 0.0f) {
            oybVar.d();
        }
        boolean z7 = true;
        if (i == -1) {
            if (!yv1Var.pd.f) {
                aVar = ((d) yv1Var).actionBar;
                if (aVar.y()) {
                    yv1Var.M5(false);
                    return;
                } else if (yv1Var.g4 == 5 && (yv1Var.M6.isEmpty() || yv1Var.s4 == 0)) {
                    yv1Var.tc();
                    return;
                } else if (yv1Var.g4 == 6 && yv1Var.a0.z()) {
                    yv1Var.Xb(new Runnable(this) {
                        public final nr1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r2;
                            nr1 nr1Var = this.b;
                            switch (b) {
                                case 0:
                                    nr1Var.b.finishFragment();
                                    return;
                                default:
                                    yv1 yv1Var2 = nr1Var.b;
                                    Intent intent = new Intent(yv1Var2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", yv1Var2.e4.link);
                                    yv1Var2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!yv1Var.k5(true, true)) {
                    yv1Var.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            yv1Var.Ja();
        } else if (i == 59) {
            if (yv1Var.getUserConfig().e() == yv1Var.l6) {
                yv1Var.getMessagesController().V4(true);
                yv1Var.p1.e(false, true);
                return;
            }
            qwb qwbVar = yv1Var.getMessagesController().g4;
            qwbVar.getClass();
            TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
            tL_channels_toggleViewForumAsMessages.channel_id = qwbVar.getMessagesController().g1(-yv1Var.l6);
            tL_channels_toggleViewForumAsMessages.enabled = false;
            qwbVar.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new go9(qwbVar, (byte) 15));
            sxb.M0(yv1Var);
        } else {
            String str = null;
            k47 k47Var = null;
            if (i == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j3 = 0;
                for (int i9 = 1; i9 >= 0; i9--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < sparseArrayArr2[i9].size(); i10++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i9].keyAt(i10)));
                    }
                    if (yv1Var.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        k47 k47Var2 = (k47) sparseArrayArr2[i9].get(((Integer) arrayList.get(i11)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user2 = yv1Var.f) == null || !user2.self)) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        spannableStringBuilder.append((CharSequence) yv1.Y6(j3, k47Var2, z6));
                        j3 = k47Var2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    gm.g(spannableStringBuilder);
                    yv1Var.i6();
                    yv1Var.N3.j(58, 0L, null);
                }
                yv1Var.M5(false);
            } else if (i == 12) {
                if (yv1Var.getParentActivity() != null) {
                    yv1Var.T5(null, null, false);
                }
            } else if (i == 11) {
                yv1Var.qa(true);
            } else if (i == 69) {
                yv1Var.Qb();
            } else if (i == 70) {
                TLRPC.Chat chat = yv1Var.e;
                if (chat != null) {
                    yv1Var.presentFragment(yv1.ga(-chat.linked_monoforum_id));
                }
            } else if (i == 72) {
                long j4 = yv1Var.l6;
                if (sd2.p0(yv1Var.e)) {
                    i8 = ((d) yv1Var).currentAccount;
                    if (sd2.A(i8, yv1Var.e, 24)) {
                        j4 = yv1Var.s4;
                        j2 = yv1Var.l6;
                        long j5 = j4;
                        i7 = ((d) yv1Var).currentAccount;
                        jva.v(i7, false).g0(j5, j2, false, false);
                    }
                }
                j2 = 0;
                long j52 = j4;
                i7 = ((d) yv1Var).currentAccount;
                jva.v(i7, false).g0(j52, j2, false, false);
            } else if (i == 71) {
                long j6 = yv1Var.l6;
                if (sd2.p0(yv1Var.e)) {
                    i6 = ((d) yv1Var).currentAccount;
                    if (sd2.A(i6, yv1Var.e, 24)) {
                        j6 = yv1Var.s4;
                        j = yv1Var.l6;
                        long j7 = j6;
                        i5 = ((d) yv1Var).currentAccount;
                        jva.v(i5, false).z(j7, j, new xn1(this, j7, j, (byte) 1));
                    }
                }
                j = 0;
                long j72 = j6;
                i5 = ((d) yv1Var).currentAccount;
                jva.v(i5, false).z(j72, j, new xn1(this, j72, j, (byte) 1));
            } else if (i == 28) {
                if (yv1Var.Jb == null) {
                    yv1Var.xc();
                } else {
                    yv1Var.K7();
                }
            } else if (i == 25) {
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 1; i12 >= 0; i12--) {
                    for (int i13 = 0; i13 < sparseArrayArr3[i12].size(); i13++) {
                        arrayList2.add((k47) sparseArrayArr3[i12].valueAt(i13));
                    }
                    sparseArrayArr3[i12].clear();
                    sparseArrayArr2[i12].clear();
                    sparseArrayArr[i12].clear();
                }
                if (yv1Var.x6 > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                yv1Var.C7();
                yv1Var.gd(0, true);
                yv1Var.Gd(false);
                MediaController.f0(yv1Var.getParentActivity(), yv1Var.getAccountInstance(), arrayList2, new lr1((byte) 0, this, z5));
            } else if (i == 13) {
                if (yv1Var.getParentActivity() != null) {
                    yv1Var.showDialog(ik.S(yv1Var.getParentActivity(), yv1Var.h, yv1Var.Ba).a);
                }
            } else if (i != 15 && i != 16 && i != 26) {
                if (i == 17) {
                    if (yv1Var.f != null && yv1Var.getParentActivity() != null) {
                        TextView textView = yv1Var.a2;
                        if (textView != null && textView.getTag() != null) {
                            yv1Var.Rb(((Integer) yv1Var.a2.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", yv1Var.f.id);
                        bundle.putBoolean("addContact", true);
                        yv1Var.presentFragment(new tu2(bundle));
                    }
                } else if (i == 18) {
                    yv1Var.Hc(false);
                } else if (i == 24) {
                    try {
                        hs6 mediaDataController = yv1Var.getMediaDataController();
                        long j8 = yv1Var.f.id;
                        Pattern pattern = hs6.U1;
                        mediaDataController.z0(j8, 0, null);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                } else if (i == 29) {
                    if (sd2.N(yv1Var.e)) {
                        lp0 lp0Var = new lp0(yv1Var.l6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = yv1Var.S1;
                        lp0Var.U = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            lp0Var.getMessagesController().F0().b(lp0Var.S, lp0Var.U, new cp0(lp0Var, (byte) 0));
                        }
                        yv1Var.presentFragment(lp0Var);
                        return;
                    }
                    yv1Var.getNotificationCenter().k(nm7.p3, Long.valueOf(yv1Var.l6));
                } else if (i == 21) {
                    int i14 = da9.v1;
                    int currentAccount = yv1Var.getCurrentAccount();
                    Activity parentActivity = yv1Var.getParentActivity();
                    long a = yv1Var.a();
                    if (parentActivity != null) {
                        da9.D0(currentAccount, parentActivity, a, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i == 22) {
                    for (int i15 = 0; i15 < 2; i15++) {
                        for (int i16 = 0; i16 < sparseArrayArr[i15].size(); i16++) {
                            k47 k47Var3 = (k47) sparseArrayArr[i15].valueAt(i16);
                            yv1Var.getMediaDataController().d(2, k47Var3, k47Var3.F0(), (int) (System.currentTimeMillis() / 1000), !yv1Var.r6);
                        }
                    }
                    yv1Var.M5(false);
                } else if (i == 23) {
                    for (int i17 = 1; i17 >= 0; i17--) {
                        if (k47Var == null && sparseArrayArr3[i17].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i18 = 0; i18 < sparseArrayArr3[i17].size(); i18++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i17].keyAt(i18)));
                            }
                            k47Var = (k47) yv1Var.G6[i17].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i17].clear();
                        sparseArrayArr2[i17].clear();
                        sparseArrayArr[i17].clear();
                    }
                    if (k47Var != null && k47Var.C4()) {
                        yv1Var.v5 = k47Var;
                        yv1Var.Ta(109);
                    } else {
                        yv1Var.Cc(k47Var, false);
                    }
                    yv1Var.C7();
                    yv1Var.gd(0, true);
                    yv1Var.Gd(false);
                } else if (i == 64) {
                    i3 = ((d) yv1Var).currentAccount;
                    oz8 c = pz8.f(i3).c(yv1Var.e7());
                    Activity parentActivity2 = yv1Var.getParentActivity();
                    i4 = ((d) yv1Var).currentAccount;
                    lz8.h0(parentActivity2, i4, yv1Var.f4, c, yv1Var.getResourceProvider(), new x0(this, c, (byte) 25));
                } else if (i == 14) {
                    a8 a8Var = new a8(0, yv1Var.getResourceProvider(), this.a, true, true);
                    a8Var.j(jb6.M0(2131753918, null), 2131231499, null);
                    a8Var.setOnClickListener(new k81(this, (byte) 9));
                    r7 r7Var = yv1Var.j0;
                    q6 q6Var = yv1Var.g0;
                    q6Var.a();
                    r7Var.U(a8Var, q6Var.m);
                } else if (i == 30) {
                    yv1Var.getSendMessagesHelper().q0(y5a.b("/help", yv1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i == 31) {
                    yv1Var.getSendMessagesHelper().q0(y5a.b("/settings", yv1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i == 40) {
                    if (yv1Var.i8()) {
                        str = "";
                    }
                    yv1Var.Ba(str);
                } else if (i == 62) {
                    yv1Var.getMessagesController().i4.J(yv1Var.a(), false, true);
                    if (!yv1Var.getMessagesController().i4.K(yv1Var.a(), true)) {
                        yv1Var.zd(true);
                    }
                } else if (i != 32 && i != 33) {
                    if (i == 27) {
                        yv1Var.Zb();
                    } else if (i == 60) {
                        if (yv1Var.r4 != null) {
                            qwb qwbVar2 = yv1Var.getMessagesController().g4;
                            long j9 = yv1Var.e.id;
                            TLRPC.TL_forumTopic tL_forumTopic = yv1Var.r4;
                            int i19 = tL_forumTopic.id;
                            tL_forumTopic.closed = true;
                            qwbVar2.z(i19, j9, true);
                            yv1Var.Ad();
                            yv1Var.Pc(false);
                            yv1Var.zd(true);
                        }
                    } else if (i == 61) {
                        sxb.M0(yv1Var);
                    } else if (i == 65) {
                        gm.g(yv1Var.e4.link);
                        c41.b0(LaunchActivity.Q()).k(false).j();
                    } else if (i == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final nr1 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b = r2;
                                nr1 nr1Var = this.b;
                                switch (b) {
                                    case 0:
                                        nr1Var.b.finishFragment();
                                        return;
                                    default:
                                        yv1 yv1Var2 = nr1Var.b;
                                        Intent intent = new Intent(yv1Var2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", yv1Var2.e4.link);
                                        yv1Var2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (yv1Var.a0.z()) {
                            yv1Var.Xb(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i == 67) {
                        Activity parentActivity3 = yv1Var.getParentActivity();
                        i2 = ((d) yv1Var).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = yv1Var.e4;
                        ylbVar = ((d) yv1Var).resourceProvider;
                        m51.g0(parentActivity3, i2, tL_businessChatLink, ylbVar);
                    } else if (i == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var.getResourceProvider(), yv1Var.getParentActivity());
                        String M0 = jb6.M0(2131752660, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131752661, null);
                        alertDialog$Builder.j(jb6.M0(2131746054, null), new cd1(this, (byte) 9));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        yv1Var.showDialog(heVar);
                        TextView textView2 = (TextView) heVar.c(-1);
                        if (textView2 != null) {
                            anb.X(textView2, cmb.p7, yv1Var.getResourceProvider());
                        }
                    } else if (i == 75) {
                        if (yv1Var.k8() && yv1Var.C6() != null) {
                            gm.t1(yv1Var.m1);
                            yv1Var.n0.requestLayout();
                            oyb oybVar2 = yv1Var.n0;
                            oybVar2.n();
                            oybVar2.a(1.0f, 0.0f);
                        }
                    } else if (i == 73) {
                        wvb f0 = wvb.f0(-yv1Var.l6, 0L);
                        f0.E = yv1Var;
                        yv1Var.presentFragment(f0);
                    } else if (i == 888) {
                        yv1Var.dumpCanvas();
                    } else if (i == 889) {
                        HashSet hashSet = o.d1;
                        c41.b0(yv1Var).t("No rich message copied", null).j();
                    }
                } else if (yv1Var.f != null && yv1Var.getParentActivity() != null) {
                    TLRPC.User user3 = yv1Var.f;
                    if (i == 33) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    TLRPC.UserFull userFull = yv1Var.s8;
                    if (userFull != null && userFull.video_calls_available) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sic.m(user3, z3, z4, yv1Var.getParentActivity(), yv1Var.getMessagesController().X1(yv1Var.f.id), yv1Var.getAccountInstance());
                }
            } else if (yv1Var.getParentActivity() != null) {
                if (i == 15 && sd2.p0(yv1Var.e)) {
                    if (yv1Var.s4 != 0 && (W1 = yv1Var.getMessagesController().W1(Long.valueOf(yv1Var.s4))) != null) {
                        ik.q(yv1Var, -1, W1, yv1Var.e, true, new g11(this, W1, (byte) 17), yv1Var.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = yv1Var.r8;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z = true;
                } else {
                    z = false;
                }
                if (i != 26) {
                    int i20 = 15;
                    if (i == 15) {
                        if (yv1Var.h != null || (((user = yv1Var.f) == null || m9c.D(user) || m9c.z(yv1Var.f)) && ((chatFull = yv1Var.r8) == null || !chatFull.can_delete_channel))) {
                            i20 = 15;
                        }
                    }
                    if (i == i20) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    TLRPC.Chat chat2 = yv1Var.e;
                    boolean z8 = z2;
                    TLRPC.User user4 = yv1Var.f;
                    if (yv1Var.h == null) {
                        z7 = false;
                    }
                    ik.r(yv1Var, z8, chat2, user4, z7, true, false, z, new ji(this, i, z));
                    return;
                }
                boolean z9 = z;
                ik.q(yv1Var, -1, yv1Var.f, yv1Var.e, z9, new mr1(this, z9), yv1Var.getResourceProvider());
            }
        }
    }
}
