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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o;
public final class oq1 extends d6 {
    public final Context a;
    public final zu1 b;

    public oq1(zu1 zu1Var, Context context) {
        this.b = zu1Var;
        this.a = context;
    }

    @Override
    public final void b(int i) {
        boolean z;
        boolean z2;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User X1;
        boolean z3;
        boolean z4;
        int i2;
        vnb vnbVar;
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
        n0c n0cVar;
        zu1 zu1Var = this.b;
        SparseArray[] sparseArrayArr = zu1Var.q6;
        SparseArray[] sparseArrayArr2 = zu1Var.p6;
        SparseArray[] sparseArrayArr3 = zu1Var.o6;
        if (i != -2 && i != 75 && i != -1 && (n0cVar = zu1Var.n0) != null && n0cVar.y > 0.0f) {
            n0cVar.d();
        }
        boolean z7 = true;
        if (i == -1) {
            if (!zu1Var.sd.f) {
                aVar = ((e) zu1Var).actionBar;
                if (aVar.z()) {
                    zu1Var.L5(false);
                    return;
                } else if (zu1Var.g4 == 5 && (zu1Var.M6.isEmpty() || zu1Var.s4 == 0)) {
                    zu1Var.tc();
                    return;
                } else if (zu1Var.g4 == 6 && zu1Var.a0.B()) {
                    zu1Var.Xb(new Runnable(this) {
                        public final oq1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r2;
                            oq1 oq1Var = this.b;
                            switch (b) {
                                case 0:
                                    oq1Var.b.finishFragment();
                                    return;
                                default:
                                    zu1 zu1Var2 = oq1Var.b;
                                    Intent intent = new Intent(zu1Var2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", zu1Var2.e4.link);
                                    zu1Var2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!zu1Var.j5(true, true)) {
                    zu1Var.finishFragment();
                    return;
                } else {
                    return;
                }
            }
            zu1Var.Ka();
        } else if (i == 59) {
            if (zu1Var.getUserConfig().e() == zu1Var.l6) {
                zu1Var.getMessagesController().b5(true);
                zu1Var.p1.e(false, true);
                return;
            }
            qyb qybVar = zu1Var.getMessagesController().h4;
            qybVar.getClass();
            TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
            tL_channels_toggleViewForumAsMessages.channel_id = qybVar.getMessagesController().h1(-zu1Var.l6);
            tL_channels_toggleViewForumAsMessages.enabled = false;
            qybVar.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new yp9(qybVar, (byte) 15));
            tzb.M0(zu1Var);
        } else {
            String str = null;
            r47 r47Var = null;
            if (i == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j3 = 0;
                for (int i9 = 1; i9 >= 0; i9--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < sparseArrayArr2[i9].size(); i10++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i9].keyAt(i10)));
                    }
                    if (zu1Var.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        r47 r47Var2 = (r47) sparseArrayArr2[i9].get(((Integer) arrayList.get(i11)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user2 = zu1Var.f) == null || !user2.self)) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        spannableStringBuilder.append((CharSequence) zu1.Y6(j3, r47Var2, z6));
                        j3 = r47Var2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    hl.g(spannableStringBuilder);
                    zu1Var.i6();
                    zu1Var.N3.j(58, 0L, null);
                }
                zu1Var.L5(false);
            } else if (i == 12) {
                if (zu1Var.getParentActivity() != null) {
                    zu1Var.T5(null, null, false);
                }
            } else if (i == 11) {
                zu1Var.ra(true);
            } else if (i == 69) {
                zu1Var.Rb();
            } else if (i == 70) {
                TLRPC.Chat chat = zu1Var.e;
                if (chat != null) {
                    zu1Var.presentFragment(zu1.ha(-chat.linked_monoforum_id));
                }
            } else if (i == 72) {
                long j4 = zu1Var.l6;
                if (xc2.p0(zu1Var.e)) {
                    i8 = ((e) zu1Var).currentAccount;
                    if (xc2.A(i8, zu1Var.e, 24)) {
                        j4 = zu1Var.s4;
                        j2 = zu1Var.l6;
                        long j5 = j4;
                        i7 = ((e) zu1Var).currentAccount;
                        jxa.v(i7, false).h0(j5, j2, false, false);
                    }
                }
                j2 = 0;
                long j52 = j4;
                i7 = ((e) zu1Var).currentAccount;
                jxa.v(i7, false).h0(j52, j2, false, false);
            } else if (i == 71) {
                long j6 = zu1Var.l6;
                if (xc2.p0(zu1Var.e)) {
                    i6 = ((e) zu1Var).currentAccount;
                    if (xc2.A(i6, zu1Var.e, 24)) {
                        j6 = zu1Var.s4;
                        j = zu1Var.l6;
                        long j7 = j6;
                        i5 = ((e) zu1Var).currentAccount;
                        jxa.v(i5, false).z(j7, j, new sm1(this, j7, j, (byte) 1));
                    }
                }
                j = 0;
                long j72 = j6;
                i5 = ((e) zu1Var).currentAccount;
                jxa.v(i5, false).z(j72, j, new sm1(this, j72, j, (byte) 1));
            } else if (i == 28) {
                if (zu1Var.Mb == null) {
                    zu1Var.xc();
                } else {
                    zu1Var.K7();
                }
            } else if (i == 25) {
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 1; i12 >= 0; i12--) {
                    for (int i13 = 0; i13 < sparseArrayArr3[i12].size(); i13++) {
                        arrayList2.add((r47) sparseArrayArr3[i12].valueAt(i13));
                    }
                    sparseArrayArr3[i12].clear();
                    sparseArrayArr2[i12].clear();
                    sparseArrayArr[i12].clear();
                }
                if (zu1Var.x6 > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zu1Var.C7();
                zu1Var.gd(0, true);
                zu1Var.Gd(false);
                MediaController.i0(zu1Var.getParentActivity(), zu1Var.getAccountInstance(), arrayList2, new mq1((byte) 0, this, z5));
            } else if (i == 13) {
                if (zu1Var.getParentActivity() != null) {
                    zu1Var.showDialog(jj.S(zu1Var.getParentActivity(), zu1Var.h, zu1Var.Ba).a);
                }
            } else if (i != 15 && i != 16 && i != 26) {
                if (i == 17) {
                    if (zu1Var.f != null && zu1Var.getParentActivity() != null) {
                        TextView textView = zu1Var.a2;
                        if (textView != null && textView.getTag() != null) {
                            zu1Var.Sb(((Integer) zu1Var.a2.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", zu1Var.f.id);
                        bundle.putBoolean("addContact", true);
                        zu1Var.presentFragment(new cu2(bundle));
                    }
                } else if (i == 18) {
                    zu1Var.Hc(false);
                } else if (i == 24) {
                    try {
                        ls6 mediaDataController = zu1Var.getMediaDataController();
                        long j8 = zu1Var.f.id;
                        Pattern pattern = ls6.U1;
                        mediaDataController.z0(j8, 0, null);
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                } else if (i == 29) {
                    if (xc2.N(zu1Var.e)) {
                        lo0 lo0Var = new lo0(zu1Var.l6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = zu1Var.S1;
                        lo0Var.U = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            lo0Var.getMessagesController().G0().b(lo0Var.S, lo0Var.U, new co0(lo0Var, (byte) 0));
                        }
                        zu1Var.presentFragment(lo0Var);
                        return;
                    }
                    zu1Var.getNotificationCenter().k(jn7.p3, Long.valueOf(zu1Var.l6));
                } else if (i == 21) {
                    int i14 = nb9.v1;
                    int currentAccount = zu1Var.getCurrentAccount();
                    Activity parentActivity = zu1Var.getParentActivity();
                    long a = zu1Var.a();
                    if (parentActivity != null) {
                        nb9.E0(currentAccount, parentActivity, a, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i == 22) {
                    for (int i15 = 0; i15 < 2; i15++) {
                        for (int i16 = 0; i16 < sparseArrayArr[i15].size(); i16++) {
                            r47 r47Var3 = (r47) sparseArrayArr[i15].valueAt(i16);
                            zu1Var.getMediaDataController().d(2, r47Var3, r47Var3.F0(), (int) (System.currentTimeMillis() / 1000), !zu1Var.r6);
                        }
                    }
                    zu1Var.L5(false);
                } else if (i == 23) {
                    for (int i17 = 1; i17 >= 0; i17--) {
                        if (r47Var == null && sparseArrayArr3[i17].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i18 = 0; i18 < sparseArrayArr3[i17].size(); i18++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i17].keyAt(i18)));
                            }
                            r47Var = (r47) zu1Var.G6[i17].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i17].clear();
                        sparseArrayArr2[i17].clear();
                        sparseArrayArr[i17].clear();
                    }
                    if (r47Var != null && r47Var.C4()) {
                        zu1Var.v5 = r47Var;
                        zu1Var.Ua(109);
                    } else {
                        zu1Var.Cc(r47Var, false);
                    }
                    zu1Var.C7();
                    zu1Var.gd(0, true);
                    zu1Var.Gd(false);
                } else if (i == 64) {
                    i3 = ((e) zu1Var).currentAccount;
                    a19 c = b19.f(i3).c(zu1Var.e7());
                    Activity parentActivity2 = zu1Var.getParentActivity();
                    i4 = ((e) zu1Var).currentAccount;
                    x09.g0(parentActivity2, i4, zu1Var.f4, c, zu1Var.getResourceProvider(), new y0(this, c, (byte) 24));
                } else if (i == 14) {
                    b8 b8Var = new b8(0, zu1Var.getResourceProvider(), this.a, true, true);
                    b8Var.j(ob6.M0(2131753946, null), 2131231498, null);
                    b8Var.setOnClickListener(new r81(this, (byte) 8));
                    s7 s7Var = zu1Var.j0;
                    r6 r6Var = zu1Var.g0;
                    r6Var.a();
                    s7Var.U(b8Var, r6Var.m);
                } else if (i == 30) {
                    zu1Var.getSendMessagesHelper().q0(p7a.b("/help", zu1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i == 31) {
                    zu1Var.getSendMessagesHelper().q0(p7a.b("/settings", zu1Var.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i == 40) {
                    if (zu1Var.j8()) {
                        str = "";
                    }
                    zu1Var.Ca(str);
                } else if (i == 62) {
                    zu1Var.getMessagesController().j4.J(zu1Var.a(), false, true);
                    if (!zu1Var.getMessagesController().j4.K(zu1Var.a(), true)) {
                        zu1Var.zd(true);
                    }
                } else if (i != 32 && i != 33) {
                    if (i == 27) {
                        zu1Var.Zb();
                    } else if (i == 60) {
                        if (zu1Var.r4 != null) {
                            qyb qybVar2 = zu1Var.getMessagesController().h4;
                            long j9 = zu1Var.e.id;
                            TLRPC.TL_forumTopic tL_forumTopic = zu1Var.r4;
                            int i19 = tL_forumTopic.id;
                            tL_forumTopic.closed = true;
                            qybVar2.z(i19, j9, true);
                            zu1Var.Ad();
                            zu1Var.Pc(false);
                            zu1Var.zd(true);
                        }
                    } else if (i == 61) {
                        tzb.M0(zu1Var);
                    } else if (i == 65) {
                        hl.g(zu1Var.e4.link);
                        d31.b0(LaunchActivity.Q()).k(false).j();
                    } else if (i == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final oq1 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b = r2;
                                oq1 oq1Var = this.b;
                                switch (b) {
                                    case 0:
                                        oq1Var.b.finishFragment();
                                        return;
                                    default:
                                        zu1 zu1Var2 = oq1Var.b;
                                        Intent intent = new Intent(zu1Var2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", zu1Var2.e4.link);
                                        zu1Var2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (zu1Var.a0.B()) {
                            zu1Var.Xb(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i == 67) {
                        Activity parentActivity3 = zu1Var.getParentActivity();
                        i2 = ((e) zu1Var).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = zu1Var.e4;
                        vnbVar = ((e) zu1Var).resourceProvider;
                        n41.f0(parentActivity3, i2, tL_businessChatLink, vnbVar);
                    } else if (i == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var.getResourceProvider(), zu1Var.getParentActivity());
                        String M0 = ob6.M0(2131752688, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131752689, null);
                        alertDialog$Builder.j(ob6.M0(2131746048, null), new rd1(this, (byte) 8));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        zu1Var.showDialog(idVar);
                        TextView textView2 = (TextView) idVar.c(-1);
                        if (textView2 != null) {
                            yob.X(textView2, aob.q7, zu1Var.getResourceProvider());
                        }
                    } else if (i == 75) {
                        if (zu1Var.l8() && zu1Var.C6() != null) {
                            hl.t1(zu1Var.m1);
                            zu1Var.n0.requestLayout();
                            n0c n0cVar2 = zu1Var.n0;
                            n0cVar2.n();
                            n0cVar2.a(1.0f, 0.0f);
                        }
                    } else if (i == 73) {
                        wxb e0 = wxb.e0(-zu1Var.l6, 0L);
                        e0.E = zu1Var;
                        zu1Var.presentFragment(e0);
                    } else if (i == 888) {
                        zu1Var.dumpCanvas();
                    } else if (i == 889) {
                        HashSet hashSet = o.d1;
                        d31.b0(zu1Var).t("No rich message copied", null).j();
                    }
                } else if (zu1Var.f != null && zu1Var.getParentActivity() != null) {
                    TLRPC.User user3 = zu1Var.f;
                    if (i == 33) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    TLRPC.UserFull userFull = zu1Var.s8;
                    if (userFull != null && userFull.video_calls_available) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xkc.m(user3, z3, z4, zu1Var.getParentActivity(), zu1Var.getMessagesController().Y1(zu1Var.f.id), zu1Var.getAccountInstance());
                }
            } else if (zu1Var.getParentActivity() != null) {
                if (i == 15 && xc2.p0(zu1Var.e)) {
                    if (zu1Var.s4 != 0 && (X1 = zu1Var.getMessagesController().X1(Long.valueOf(zu1Var.s4))) != null) {
                        jj.q(zu1Var, -1, X1, zu1Var.e, true, new h01(this, X1, (byte) 17), zu1Var.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = zu1Var.r8;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z = true;
                } else {
                    z = false;
                }
                if (i != 26) {
                    int i20 = 15;
                    if (i == 15) {
                        if (zu1Var.h != null || (((user = zu1Var.f) == null || lbc.D(user) || lbc.z(zu1Var.f)) && ((chatFull = zu1Var.r8) == null || !chatFull.can_delete_channel))) {
                            i20 = 15;
                        }
                    }
                    if (i == i20) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    TLRPC.Chat chat2 = zu1Var.e;
                    boolean z8 = z2;
                    TLRPC.User user4 = zu1Var.f;
                    if (zu1Var.h == null) {
                        z7 = false;
                    }
                    jj.r(zu1Var, z8, chat2, user4, z7, true, false, z, new wg(this, i, z));
                    return;
                }
                boolean z9 = z;
                jj.q(zu1Var, -1, zu1Var.f, zu1Var.e, z9, new nq1(this, z9), zu1Var.getResourceProvider());
            }
        }
    }
}
