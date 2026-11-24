package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public class to8 extends n39 {
    public String E;
    public TLRPC.WebPage F;
    public boolean G;
    public so8[] c;
    public final d e;
    public final int f;
    public final Context h;
    public boolean x;
    public ll8 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public to8(d dVar, Context context) {
        this.e = dVar;
        this.f = dVar.getCurrentAccount();
        this.h = context;
        this.c = H(dVar);
        J();
    }

    public static boolean F(int i, int i2) {
        if (na7.q1(i).F3() && !y6c.h(i).p()) {
            return false;
        }
        if (i2 != -1 && na7.q1(i).E0.get(i2, -1) == -1) {
            return false;
        }
        return true;
    }

    public static so8[] H(final d dVar) {
        so8 so8Var;
        so8 so8Var2;
        so8 so8Var3;
        so8 so8Var4;
        so8 so8Var5;
        so8 so8Var6;
        so8 so8Var7;
        so8 so8Var8;
        so8 so8Var9;
        so8 so8Var10;
        so8 so8Var11;
        so8 so8Var12;
        so8 so8Var13;
        so8 so8Var14;
        so8 so8Var15;
        so8 so8Var16;
        so8 so8Var17;
        so8 so8Var18;
        so8 so8Var19;
        so8 so8Var20;
        so8 so8Var21;
        so8 so8Var22;
        so8 so8Var23;
        final int currentAccount = dVar.getCurrentAccount();
        so8 so8Var24 = new so8(500, k96.L0(2131751252), 0, new ll8(dVar, dVar.getResourceProvider(), (byte) 13));
        so8 so8Var25 = new so8(501, k96.L0(2131752525), 0, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var25.h = "tg://settings/edit/change-number";
        so8 so8Var26 = new so8(502, k96.L0(2131754465), 0, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var26.h = "tg://settings/edit/add-account";
        so8 so8Var27 = new so8(1, k96.L0(2131747729), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var27.h = "tg://settings/notifications";
        so8 so8Var28 = new so8(2, k96.L0(2131747685), k96.L0(2131747729), 2131232267, new ro8(dVar, (byte) 3));
        so8Var28.h = "tg://settings/notifications/private-chats";
        so8 so8Var29 = new so8(3, k96.L0(2131747714), k96.L0(2131747729), 2131232267, new ro8(dVar, (byte) 15));
        so8Var29.h = "tg://settings/notifications/groups";
        so8 so8Var30 = new so8(4, k96.L0(2131747728), k96.L0(2131747729), 2131232267, new kv1(dVar, (byte) 11));
        so8Var30.h = "tg://settings/notifications/channels";
        so8 so8Var31 = new so8(5, k96.L0(2131743037), "callsSectionRow", k96.L0(2131747729), 2131232267, new kv1(dVar, (byte) 23));
        so8 so8Var32 = new so8(6, k96.L0(2131753730), "badgeNumberSection", k96.L0(2131747729), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var33 = new so8(7, k96.L0(2131749027), "inappSectionRow", k96.L0(2131747729), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var34 = new so8(8, k96.L0(2131751778), "contactJoinedRow", k96.L0(2131747729), 2131232267, new kv1(dVar, (byte) 27));
        so8Var34.h = "tg://settings/notifications/new-contacts";
        so8 so8Var35 = new so8(9, k96.L0(2131747035), "pinnedMessageRow", k96.L0(2131747729), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8Var35.h = "tg://settings/notifications/pinned-messages";
        so8 so8Var36 = new so8(10, k96.L0(2131745919), "resetNotificationsRow", k96.L0(2131747729), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var36.h = "tg://settings/notifications/reset";
        so8 so8Var37 = new so8(11, k96.L0(2131747683), "notificationsServiceRow", k96.L0(2131747729), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8 so8Var38 = new so8(12, k96.L0(2131747682), "notificationsServiceConnectionRow", k96.L0(2131747729), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8 so8Var39 = new so8(13, k96.L0(2131746082), "repeatRow", k96.L0(2131747729), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8 so8Var40 = new so8(100, k96.L0(2131746580), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var40.h = "tg://settings/privacy";
        so8 so8Var41 = new so8(109, k96.L0(2131743699), k96.L0(2131746580), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var41.h = "tg://settings/privacy/2sv";
        so8 so8Var42 = new so8(124, k96.L0(2131753847), k96.L0(2131746580), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                d dVar2 = dVar;
                int i = currentAccount;
                switch (b) {
                    case 0:
                        if (y6c.h(i).q0 >= 0) {
                            dVar2.presentFragment(new v60());
                            return;
                        }
                        return;
                    default:
                        if (!y6c.h(i).p()) {
                            u21 b0 = u21.b0(dVar2);
                            b0.getClass();
                            t11 t11Var = new t11(b0.X(), null);
                            t11Var.d(2131624341, new String[0]);
                            String M0 = k96.M0(2131746564, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new r21(b0, (byte) 0), indexOf, lastIndexOf - 1, 33);
                            }
                            t11Var.b.setText(spannableStringBuilder);
                            t11Var.b.setSingleLine(false);
                            t11Var.b.setMaxLines(2);
                            b0.b(t11Var, 2750).j();
                            return;
                        }
                        dVar2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        so8Var42.h = "tg://settings/privacy/auto-delete";
        so8 so8Var43 = new so8(108, k96.L0(2131747464), k96.L0(2131746580), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var43.h = "tg://settings/privacy/passcode";
        so8 so8Var44 = null;
        if (gba.i1) {
            so8Var = so8Var41;
            so8Var2 = new so8(125, k96.L0(2131751190), "emailLoginRow", k96.L0(2131746580), 2131232040, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(28700);
                            m66Var.Z(8200);
                            return;
                        case 1:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.a0(28700);
                            m66Var2.Z(4112);
                            return;
                        case 2:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.Z(360928);
                            return;
                        case 3:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(360928);
                            m66Var4.Z(32);
                            return;
                        case 4:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.a0(360928);
                            m66Var5.Z(64);
                            return;
                        case 5:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(360928);
                            m66Var6.Z(128);
                            return;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            m66 m66Var7 = new m66();
                            dVar2.presentFragment(m66Var7);
                            m66Var7.a0(360928);
                            m66Var7.Z(256);
                            return;
                        case 8:
                            m66 m66Var8 = new m66();
                            dVar2.presentFragment(m66Var8);
                            m66Var8.a0(360928);
                            m66Var8.Z(32768);
                            return;
                        case 9:
                            m66 m66Var9 = new m66();
                            dVar2.presentFragment(m66Var9);
                            m66Var9.Z(512);
                            return;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            m66 m66Var10 = new m66();
                            dVar2.presentFragment(m66Var10);
                            m66Var10.Z(1024);
                            return;
                        case 12:
                            m66 m66Var11 = new m66();
                            dVar2.presentFragment(m66Var11);
                            m66Var11.Z(2048);
                            return;
                        case 13:
                            m66 m66Var12 = new m66();
                            dVar2.presentFragment(m66Var12);
                            while (true) {
                                ArrayList arrayList = m66Var12.s;
                                if (i < arrayList.size()) {
                                    if (((g66) arrayList.get(i)).f) {
                                        m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                        return;
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        case 14:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 15:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 17:
                            jh8 jh8Var = new jh8(dVar2, 0, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 18:
                            dVar2.showDialog(ij.R(dVar2, null));
                            return;
                        case 19:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                            return;
                        case 20:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 23:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 24:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 25:
                            dVar2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(PasscodeActivity.m0());
                            return;
                        case 27:
                            jh8 jh8Var2 = new jh8(dVar2, 11, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 28:
                            dVar2.presentFragment(new u8(3));
                            return;
                        default:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                    }
                }
            });
            so8Var2.h = "tg://settings/privacy/login-email";
        } else {
            so8Var = so8Var41;
            so8Var2 = null;
        }
        so8 so8Var45 = new so8(101, k96.L0(2131753678), k96.L0(2131746580), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var45.h = "tg://settings/privacy/blocked";
        so8 so8Var46 = new so8(110, k96.L0(2131745359), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var46.h = "tg://settings/devices";
        so8 so8Var47 = new so8(105, k96.L0(2131746599), k96.L0(2131746580), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var47.h = "tg://settings/privacy/phone-number/";
        so8 so8Var48 = new so8(102, k96.L0(2131746624), k96.L0(2131746580), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var48.h = "tg://settings/privacy/last-seen";
        so8 so8Var49 = new so8(103, k96.L0(2131746586), k96.L0(2131746580), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var49.h = "tg://settings/privacy/profile-photos";
        so8 so8Var50 = new so8(104, k96.L0(2131746646), k96.L0(2131746580), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var50.h = "tg://settings/privacy/forwards";
        so8 so8Var51 = new so8(122, k96.L0(2131746609), k96.L0(2131746580), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var51.h = "tg://settings/privacy/calls/p2p";
        so8 so8Var52 = new so8(106, k96.L0(2131752584), k96.L0(2131746580), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var52.h = "tg://settings/privacy/calls";
        so8 so8Var53 = new so8(107, k96.L0(2131746626), k96.L0(2131746580), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var53.h = "tg://settings/privacy/invites";
        so8 so8Var54 = new so8(123, k96.L0(2131746567), k96.L0(2131746580), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                d dVar2 = dVar;
                int i = currentAccount;
                switch (b) {
                    case 0:
                        if (y6c.h(i).q0 >= 0) {
                            dVar2.presentFragment(new v60());
                            return;
                        }
                        return;
                    default:
                        if (!y6c.h(i).p()) {
                            u21 b0 = u21.b0(dVar2);
                            b0.getClass();
                            t11 t11Var = new t11(b0.X(), null);
                            t11Var.d(2131624341, new String[0]);
                            String M0 = k96.M0(2131746564, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new r21(b0, (byte) 0), indexOf, lastIndexOf - 1, 33);
                            }
                            t11Var.b.setText(spannableStringBuilder);
                            t11Var.b.setSingleLine(false);
                            t11Var.b.setMaxLines(2);
                            b0.b(t11Var, 2750).j();
                            return;
                        }
                        dVar2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        so8Var54.h = "tg://settings/privacy/voice";
        if (na7.q1(currentAccount).k4.L0.f()) {
            so8Var3 = so8Var54;
            so8Var4 = new so8(121, k96.L0(2131754168), "newChatsRow", k96.L0(2131746580), 2131232040, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            gk8 gk8Var = new gk8();
                            gk8Var.getMessagesController().D0(true);
                            dVar2.presentFragment(gk8Var);
                            return;
                        case 1:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 2:
                            dVar2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 3:
                            dVar2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 4:
                            dVar2.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 5:
                            dVar2.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 6:
                            dVar2.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 7:
                            dVar2.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 1, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 10:
                            break;
                        case 11:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            dVar2.presentFragment(new SessionsActivity(1));
                            return;
                        case 15:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 2, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 20:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 23:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 24:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            dVar2.presentFragment(sessionsActivity);
                            return;
                        case 25:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 27:
                            dVar2.presentFragment(new r61());
                            return;
                        case 28:
                            dVar2.presentFragment(new r61());
                            return;
                        default:
                            jh8 jh8Var3 = new jh8(dVar2, 8, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                    }
                    while (true) {
                        if (i < 4) {
                            if (y6c.h(i).o()) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mf6(i));
                    }
                }
            });
            so8Var4.h = "tg://settings/privacy/archive-and-mute";
        } else {
            so8Var3 = so8Var54;
            so8Var4 = null;
        }
        so8 so8Var55 = new so8(112, k96.L0(2131751584), "deleteAccountRow", k96.L0(2131746580), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var55.h = "tg://settings/privacy/self-destruct";
        so8 so8Var56 = new so8(113, k96.L0(2131746606), "paymentsClearRow", k96.L0(2131746580), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var56.h = "tg://settings/privacy/data-settings/clear-payment-info";
        so8 so8Var57 = new so8(114, k96.L0(2131742648), k96.L0(2131746580), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var57.h = "tg://settings/privacy/active-websites";
        so8 so8Var58 = new so8(115, k96.L0(2131744055), "contactsDeleteRow", k96.L0(2131746580), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var58.h = "tg://settings/privacy/data-settings/delete-synced";
        so8 so8Var59 = new so8(116, k96.L0(2131744057), "contactsSyncRow", k96.L0(2131746580), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var59.h = "tg://settings/privacy/data-settings/sync-contacts";
        so8 so8Var60 = new so8(117, k96.L0(2131744171), "contactsSuggestRow", k96.L0(2131746580), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var60.h = "tg://settings/privacy/data-settings/suggest-contacts";
        so8 so8Var61 = new so8(118, k96.L0(2131748497), "secretMapRow", k96.L0(2131746580), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var61.h = "tg://settings/privacy/data-settings/map-provider";
        so8 so8Var62 = new so8(119, k96.L0(2131745492), "secretWebpageRow", k96.L0(2131746580), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var62.h = "tg://settings/privacy/data-settings/link-previews";
        so8 so8Var63 = new so8(120, k96.L0(2131751443), 2131232028, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var63.h = "tg://settings/devices";
        so8 so8Var64 = new so8(121, k96.L0(2131743967), "terminateAllSessionsRow", k96.L0(2131751443), 2131232028, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var64.h = "tg://settings/devices/terminate-sessions";
        so8 so8Var65 = new so8(122, k96.L0(2131748725), k96.L0(2131751443), 2131232028, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var65.h = "tg://settings/devices/link-desktop";
        so8 so8Var66 = new so8(200, k96.L0(2131751665), 2131232027, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var66.h = "tg://settings/privacy/data-settings";
        so8 so8Var67 = new so8(201, k96.L0(2131751664), "usageSectionRow", k96.L0(2131751665), 2131232027, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8 so8Var68 = new so8(202, k96.L0(2131744579), k96.L0(2131751665), 2131232027, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var68.h = "tg://settings/data/storage";
        so8 so8Var69 = new so8(203, k96.L0(2131748868), "keepMediaRow", k96.L0(2131751665), k96.L0(2131744579), 2131232027, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (y6c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8 so8Var70 = new so8(204, k96.L0(2131752063), "cacheRow", k96.L0(2131751665), k96.L0(2131744579), 2131232027, new ro8(dVar, (byte) 0));
        so8 so8Var71 = new so8(205, k96.L0(2131748582), "databaseRow", k96.L0(2131751665), k96.L0(2131744579), 2131232027, new ro8(dVar, (byte) 1));
        so8 so8Var72 = new so8(206, k96.L0(2131748106), k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 2));
        so8Var72.h = "tg://settings/data/usage";
        so8 so8Var73 = new so8(207, k96.L0(2131753764), "mediaDownloadSectionRow", k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 4));
        so8 so8Var74 = new so8(208, k96.L0(2131742621), k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 5));
        so8 so8Var75 = new so8(209, k96.L0(2131742623), k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 6));
        so8 so8Var76 = new so8(210, k96.L0(2131742622), k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 7));
        so8 so8Var77 = new so8(211, k96.L0(2131745918), "resetDownloadRow", k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 8));
        so8Var77.h = "tg://settings/data/auto-download/reset";
        so8 so8Var78 = new so8(215, k96.L0(2131744197), "streamSectionRow", k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 9));
        so8 so8Var79 = new so8(216, k96.L0(2131751132), "enableStreamRow", k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 11));
        so8 so8Var80 = new so8(217, k96.L0(2131752584), "callsSectionRow", k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 12));
        so8 so8Var81 = new so8(218, k96.L0(2131742987), "useLessDataForCallsRow", k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 13));
        so8Var81.h = "tg://settings/data/use-less-data";
        so8 so8Var82 = new so8(219, k96.L0(2131743016), "quickRepliesRow", k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 14));
        so8 so8Var83 = new so8(220, k96.L0(2131746408), k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 16));
        so8Var83.h = "tg://settings/data/proxy";
        so8 so8Var84 = new so8(111, k96.L0(2131746650), "clearDraftsRow", k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 17));
        so8Var84.h = "tg://settings/privacy/data-settings/delete-cloud-drafts";
        so8 so8Var85 = new so8(222, k96.L0(2131745737), "saveToGallerySectionRow", k96.L0(2131751665), 2131232027, new ro8(dVar, (byte) 18));
        so8 so8Var86 = new so8(223, k96.L0(2131745727), "saveToGalleryPeerRow", k96.L0(2131751665), k96.L0(2131745737), 2131232027, new ro8(dVar, (byte) 19));
        so8Var86.h = "tg://settings/data/save-to-photos/chats";
        so8 so8Var87 = new so8(224, k96.L0(2131745734), "saveToGalleryGroupsRow", k96.L0(2131751665), k96.L0(2131745737), 2131232027, new ro8(dVar, (byte) 20));
        so8Var87.h = "tg://settings/data/save-to-photos/groups";
        so8 so8Var88 = new so8(225, k96.L0(2131745736), "saveToGalleryChannelsRow", k96.L0(2131751665), k96.L0(2131745737), 2131232027, new kv1(dVar, (byte) 6));
        so8Var88.h = "tg://settings/data/save-to-photos/channels";
        so8 so8Var89 = new so8(300, k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 7));
        so8Var89.h = "tg://settings/appearance/themes";
        so8 so8Var90 = new so8(301, k96.L0(2131743950), "textSizeHeaderRow", k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 8));
        so8Var90.h = "tg://settings/appearance/text-size";
        so8 so8Var91 = new so8(302, k96.L0(2131752538), k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 9));
        so8Var91.h = "tg://settings/appearance/wallpapers";
        so8 so8Var92 = new so8(303, k96.L0(2131745346), null, k96.L0(2131752198), k96.L0(2131752232), 2131232029, new kv1(dVar, (byte) 10));
        so8 so8Var93 = new so8(304, k96.L0(2131745915), "resetRow", k96.L0(2131752198), k96.L0(2131752232), 2131232029, new kv1(dVar, (byte) 12));
        so8 so8Var94 = new so8(306, k96.L0(2131751999), "themeHeaderRow", k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 13));
        so8 so8Var95 = new so8(319, k96.L0(2131752866), null, k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 14));
        so8 so8Var96 = new so8(320, k96.L0(2131751700), "createNewThemeRow", k96.L0(2131752198), k96.L0(2131752866), 2131232029, new kv1(dVar, (byte) 15));
        so8Var96.h = "tg://settings/appearance/themes/create";
        so8 so8Var97 = new so8(321, k96.L0(2131752828), "bubbleRadiusHeaderRow", k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 17));
        so8Var97.h = "tg://settings/appearance/message-corners";
        so8 so8Var98 = new so8(322, k96.L0(2131752213), "chatListHeaderRow", k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 18));
        so8 so8Var99 = new so8(323, k96.L0(2131752210), "swipeGestureHeaderRow", k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 19));
        so8 so8Var100 = new so8(324, k96.L0(2131754237), "appIconHeaderRow", k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 20));
        so8Var100.h = "tg://settings/appearance/app-icon";
        so8 so8Var101 = new so8(305, k96.L0(2131753781), k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 21));
        so8 so8Var102 = new so8(328, k96.L0(2131748057), "nextMediaTapRow", k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 22));
        so8Var102.h = "tg://settings/appearance/tap-for-next-media";
        so8 so8Var103 = new so8(327, k96.L0(2131746234), "raiseToListenRow", k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 24));
        so8Var103.h = "tg://settings/data/raise-to-listen";
        so8 so8Var104 = new so8(310, k96.L0(2131746232), "raiseToSpeakRow", k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 25));
        so8Var104.h = "tg://settings/data/raise-to-speak";
        so8 so8Var105 = new so8(326, k96.L0(2131747239), "pauseOnMediaRow", k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 26));
        so8Var105.h = "tg://settings/data/pause-music";
        so8 so8Var106 = new so8(325, k96.L0(2131748247), "bluetoothScoRow", k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 28));
        so8 so8Var107 = new so8(308, k96.L0(2131751426), "directShareRow", k96.L0(2131752198), 2131232029, new kv1(dVar, (byte) 29));
        so8 so8Var108 = new so8(311, k96.L0(2131745440), "sendByEnterRow", k96.L0(2131752198), 2131232029, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var109 = new so8(318, k96.L0(2131751355), "distanceRow", k96.L0(2131752198), 2131232029, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var110 = new so8(600, k96.L0(2131744620), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8Var110.h = "tg://settings/appearance/stickers-and-emoji";
        so8 so8Var111 = new so8(601, k96.L0(2131744161), "suggestRow", k96.L0(2131744620), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var112 = new so8(602, k96.L0(2131750821), "featuredStickersHeaderRow", k96.L0(2131744620), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var113 = new so8(603, k96.L0(2131748487), null, k96.L0(2131744620), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var114 = new so8(604, k96.L0(2131754125), null, k96.L0(2131744620), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8Var114.h = "tg://settings/appearance/stickers-and-emoji/archived";
        so8 so8Var115 = new so8(605, k96.L0(2131754130), null, k96.L0(2131744620), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var116 = new so8(606, k96.L0(2131748842), "largeEmojiRow", k96.L0(2131744620), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8Var116.h = "tg://settings/appearance/stickers-and-emoji/emoji/large";
        so8 so8Var117 = new so8(607, k96.L0(2131748530), null, k96.L0(2131746875), k96.L0(2131748658), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var118 = new so8(608, k96.L0(2131751184), null, k96.L0(2131744620), 2131231516, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8Var118.h = "tg://settings/appearance/stickers-and-emoji/emoji";
        so8 so8Var119 = new so8(609, k96.L0(2131744175), "suggestAnimatedEmojiRow", k96.L0(2131744620), k96.L0(2131751184), 2131231516, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8Var119.h = "tg://settings/appearance/stickers-and-emoji/emoji/suggest";
        so8 so8Var120 = new so8(610, k96.L0(2131750823), "featuredStickersHeaderRow", k96.L0(2131744620), k96.L0(2131751184), 2131231516, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var121 = new so8(611, k96.L0(2131751338), null, k96.L0(2131744620), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8Var121.h = "tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction";
        so8 so8Var122 = new so8(700, k96.L0(2131750679), null, 2131232031, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8Var122.h = "tg://settings/folders";
        so8 so8Var123 = new so8(701, k96.L0(2131751704), "createFilterRow", k96.L0(2131750679), 2131232031, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8Var123.h = "tg://settings/folders/create";
        if (F(currentAccount, -1)) {
            so8Var5 = so8Var123;
            so8Var6 = so8Var114;
            so8Var7 = so8Var116;
            so8Var8 = so8Var118;
            so8Var9 = new so8(800, k96.L0(2131743990), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(28700);
                            m66Var.Z(8200);
                            return;
                        case 1:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.a0(28700);
                            m66Var2.Z(4112);
                            return;
                        case 2:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.Z(360928);
                            return;
                        case 3:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(360928);
                            m66Var4.Z(32);
                            return;
                        case 4:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.a0(360928);
                            m66Var5.Z(64);
                            return;
                        case 5:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(360928);
                            m66Var6.Z(128);
                            return;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            m66 m66Var7 = new m66();
                            dVar2.presentFragment(m66Var7);
                            m66Var7.a0(360928);
                            m66Var7.Z(256);
                            return;
                        case 8:
                            m66 m66Var8 = new m66();
                            dVar2.presentFragment(m66Var8);
                            m66Var8.a0(360928);
                            m66Var8.Z(32768);
                            return;
                        case 9:
                            m66 m66Var9 = new m66();
                            dVar2.presentFragment(m66Var9);
                            m66Var9.Z(512);
                            return;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            m66 m66Var10 = new m66();
                            dVar2.presentFragment(m66Var10);
                            m66Var10.Z(1024);
                            return;
                        case 12:
                            m66 m66Var11 = new m66();
                            dVar2.presentFragment(m66Var11);
                            m66Var11.Z(2048);
                            return;
                        case 13:
                            m66 m66Var12 = new m66();
                            dVar2.presentFragment(m66Var12);
                            while (true) {
                                ArrayList arrayList = m66Var12.s;
                                if (i < arrayList.size()) {
                                    if (((g66) arrayList.get(i)).f) {
                                        m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                        return;
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        case 14:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 15:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 17:
                            jh8 jh8Var = new jh8(dVar2, 0, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 18:
                            dVar2.showDialog(ij.R(dVar2, null));
                            return;
                        case 19:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                            return;
                        case 20:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 23:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 24:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 25:
                            dVar2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(PasscodeActivity.m0());
                            return;
                        case 27:
                            jh8 jh8Var2 = new jh8(dVar2, 11, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 28:
                            dVar2.presentFragment(new u8(3));
                            return;
                        default:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                    }
                }
            });
        } else {
            so8Var5 = so8Var123;
            so8Var6 = so8Var114;
            so8Var7 = so8Var116;
            so8Var8 = so8Var118;
            so8Var9 = null;
        }
        if (F(currentAccount, 0)) {
            so8Var10 = new so8(801, k96.L0(2131746807), k96.L0(2131743990), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(28700);
                            m66Var.Z(8200);
                            return;
                        case 1:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.a0(28700);
                            m66Var2.Z(4112);
                            return;
                        case 2:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.Z(360928);
                            return;
                        case 3:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(360928);
                            m66Var4.Z(32);
                            return;
                        case 4:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.a0(360928);
                            m66Var5.Z(64);
                            return;
                        case 5:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(360928);
                            m66Var6.Z(128);
                            return;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            m66 m66Var7 = new m66();
                            dVar2.presentFragment(m66Var7);
                            m66Var7.a0(360928);
                            m66Var7.Z(256);
                            return;
                        case 8:
                            m66 m66Var8 = new m66();
                            dVar2.presentFragment(m66Var8);
                            m66Var8.a0(360928);
                            m66Var8.Z(32768);
                            return;
                        case 9:
                            m66 m66Var9 = new m66();
                            dVar2.presentFragment(m66Var9);
                            m66Var9.Z(512);
                            return;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            m66 m66Var10 = new m66();
                            dVar2.presentFragment(m66Var10);
                            m66Var10.Z(1024);
                            return;
                        case 12:
                            m66 m66Var11 = new m66();
                            dVar2.presentFragment(m66Var11);
                            m66Var11.Z(2048);
                            return;
                        case 13:
                            m66 m66Var12 = new m66();
                            dVar2.presentFragment(m66Var12);
                            while (true) {
                                ArrayList arrayList = m66Var12.s;
                                if (i < arrayList.size()) {
                                    if (((g66) arrayList.get(i)).f) {
                                        m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                        return;
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        case 14:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 15:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 17:
                            jh8 jh8Var = new jh8(dVar2, 0, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 18:
                            dVar2.showDialog(ij.R(dVar2, null));
                            return;
                        case 19:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                            return;
                        case 20:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 23:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 24:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 25:
                            dVar2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(PasscodeActivity.m0());
                            return;
                        case 27:
                            jh8 jh8Var2 = new jh8(dVar2, 11, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 28:
                            dVar2.presentFragment(new u8(3));
                            return;
                        default:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                    }
                }
            });
        } else {
            so8Var10 = null;
        }
        if (F(currentAccount, 11)) {
            so8Var11 = new so8(802, k96.L0(2131746816), k96.L0(2131743990), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(28700);
                            m66Var.Z(8200);
                            return;
                        case 1:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.a0(28700);
                            m66Var2.Z(4112);
                            return;
                        case 2:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.Z(360928);
                            return;
                        case 3:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(360928);
                            m66Var4.Z(32);
                            return;
                        case 4:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.a0(360928);
                            m66Var5.Z(64);
                            return;
                        case 5:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(360928);
                            m66Var6.Z(128);
                            return;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            m66 m66Var7 = new m66();
                            dVar2.presentFragment(m66Var7);
                            m66Var7.a0(360928);
                            m66Var7.Z(256);
                            return;
                        case 8:
                            m66 m66Var8 = new m66();
                            dVar2.presentFragment(m66Var8);
                            m66Var8.a0(360928);
                            m66Var8.Z(32768);
                            return;
                        case 9:
                            m66 m66Var9 = new m66();
                            dVar2.presentFragment(m66Var9);
                            m66Var9.Z(512);
                            return;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            m66 m66Var10 = new m66();
                            dVar2.presentFragment(m66Var10);
                            m66Var10.Z(1024);
                            return;
                        case 12:
                            m66 m66Var11 = new m66();
                            dVar2.presentFragment(m66Var11);
                            m66Var11.Z(2048);
                            return;
                        case 13:
                            m66 m66Var12 = new m66();
                            dVar2.presentFragment(m66Var12);
                            while (true) {
                                ArrayList arrayList = m66Var12.s;
                                if (i < arrayList.size()) {
                                    if (((g66) arrayList.get(i)).f) {
                                        m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                        return;
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        case 14:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 15:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 17:
                            jh8 jh8Var = new jh8(dVar2, 0, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 18:
                            dVar2.showDialog(ij.R(dVar2, null));
                            return;
                        case 19:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                            return;
                        case 20:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 23:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 24:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 25:
                            dVar2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(PasscodeActivity.m0());
                            return;
                        case 27:
                            jh8 jh8Var2 = new jh8(dVar2, 11, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 28:
                            dVar2.presentFragment(new u8(3));
                            return;
                        default:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                    }
                }
            });
        } else {
            so8Var11 = null;
        }
        if (F(currentAccount, 1)) {
            so8Var12 = new so8(803, k96.L0(2131746773), k96.L0(2131743990), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            gk8 gk8Var = new gk8();
                            gk8Var.getMessagesController().D0(true);
                            dVar2.presentFragment(gk8Var);
                            return;
                        case 1:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 2:
                            dVar2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 3:
                            dVar2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 4:
                            dVar2.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 5:
                            dVar2.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 6:
                            dVar2.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 7:
                            dVar2.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 1, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 10:
                            break;
                        case 11:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            dVar2.presentFragment(new SessionsActivity(1));
                            return;
                        case 15:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 2, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 20:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 23:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 24:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            dVar2.presentFragment(sessionsActivity);
                            return;
                        case 25:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 27:
                            dVar2.presentFragment(new r61());
                            return;
                        case 28:
                            dVar2.presentFragment(new r61());
                            return;
                        default:
                            jh8 jh8Var3 = new jh8(dVar2, 8, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                    }
                    while (true) {
                        if (i < 4) {
                            if (y6c.h(i).o()) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mf6(i));
                    }
                }
            });
        } else {
            so8Var12 = null;
        }
        if (F(currentAccount, 2)) {
            so8Var13 = new so8(804, k96.L0(2131746821), k96.L0(2131743990), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            gk8 gk8Var = new gk8();
                            gk8Var.getMessagesController().D0(true);
                            dVar2.presentFragment(gk8Var);
                            return;
                        case 1:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 2:
                            dVar2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 3:
                            dVar2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 4:
                            dVar2.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 5:
                            dVar2.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 6:
                            dVar2.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 7:
                            dVar2.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 1, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 10:
                            break;
                        case 11:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            dVar2.presentFragment(new SessionsActivity(1));
                            return;
                        case 15:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 2, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 20:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 23:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 24:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            dVar2.presentFragment(sessionsActivity);
                            return;
                        case 25:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 27:
                            dVar2.presentFragment(new r61());
                            return;
                        case 28:
                            dVar2.presentFragment(new r61());
                            return;
                        default:
                            jh8 jh8Var3 = new jh8(dVar2, 8, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                    }
                    while (true) {
                        if (i < 4) {
                            if (y6c.h(i).o()) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mf6(i));
                    }
                }
            });
        } else {
            so8Var13 = null;
        }
        if (F(currentAccount, 8)) {
            so8Var14 = new so8(805, k96.L0(2131746771), k96.L0(2131743990), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            gk8 gk8Var = new gk8();
                            gk8Var.getMessagesController().D0(true);
                            dVar2.presentFragment(gk8Var);
                            return;
                        case 1:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 2:
                            dVar2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 3:
                            dVar2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 4:
                            dVar2.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 5:
                            dVar2.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 6:
                            dVar2.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 7:
                            dVar2.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 1, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 10:
                            break;
                        case 11:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            dVar2.presentFragment(new SessionsActivity(1));
                            return;
                        case 15:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 2, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 20:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 23:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 24:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            dVar2.presentFragment(sessionsActivity);
                            return;
                        case 25:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 27:
                            dVar2.presentFragment(new r61());
                            return;
                        case 28:
                            dVar2.presentFragment(new r61());
                            return;
                        default:
                            jh8 jh8Var3 = new jh8(dVar2, 8, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                    }
                    while (true) {
                        if (i < 4) {
                            if (y6c.h(i).o()) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mf6(i));
                    }
                }
            });
        } else {
            so8Var14 = null;
        }
        if (F(currentAccount, 3)) {
            so8Var15 = new so8(806, k96.L0(2131746801), k96.L0(2131743990), 2131232367, new ro8(dVar, (byte) 10));
        } else {
            so8Var15 = null;
        }
        if (F(currentAccount, 4)) {
            so8Var16 = new so8(807, k96.L0(2131746792), k96.L0(2131743990), 2131232367, new ro8(dVar, (byte) 21));
        } else {
            so8Var16 = null;
        }
        if (F(currentAccount, 5)) {
            so8Var17 = new so8(808, k96.L0(2131746785), k96.L0(2131743990), 2131232367, new kv1(dVar, (byte) 16));
        } else {
            so8Var17 = null;
        }
        if (F(currentAccount, 9)) {
            so8Var18 = new so8(809, k96.L0(2131746834), k96.L0(2131743990), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                        case 1:
                            de9.o(0, dVar2);
                            return;
                        case 2:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 3:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 5:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 6:
                            dVar2.presentFragment(new StickersActivity(1, null));
                            return;
                        case 7:
                            dVar2.presentFragment(new hs(0));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 9, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new hs(1));
                            return;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(3);
                            m66Var.Z(2);
                            return;
                        case 12:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 14:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 15:
                            dVar2.presentFragment(new y09());
                            return;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 6, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            jh8 jh8Var3 = new jh8(dVar2, 7, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                        case 20:
                            jh8 jh8Var4 = new jh8(dVar2, 10, false);
                            jh8Var4.F0();
                            dVar2.showDialog(jh8Var4);
                            return;
                        case 21:
                            jh8 jh8Var5 = new jh8(dVar2, 12, false);
                            jh8Var5.F0();
                            dVar2.showDialog(jh8Var5);
                            return;
                        case 22:
                            dVar2.presentFragment(new m66());
                            return;
                        case 23:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.Z(3);
                            return;
                        case 24:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.a0(3);
                            m66Var3.Z(1);
                            return;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(3);
                            m66Var4.Z(2);
                            return;
                        case 27:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.Z(28700);
                            return;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(28700);
                            m66Var6.Z(16388);
                            return;
                    }
                }
            });
        } else {
            so8Var18 = null;
        }
        if (F(currentAccount, 6)) {
            so8Var19 = new so8(810, k96.L0(2131746796), k96.L0(2131743990), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                        case 1:
                            de9.o(0, dVar2);
                            return;
                        case 2:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 3:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 5:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 6:
                            dVar2.presentFragment(new StickersActivity(1, null));
                            return;
                        case 7:
                            dVar2.presentFragment(new hs(0));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 9, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new hs(1));
                            return;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(3);
                            m66Var.Z(2);
                            return;
                        case 12:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 14:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 15:
                            dVar2.presentFragment(new y09());
                            return;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 6, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            jh8 jh8Var3 = new jh8(dVar2, 7, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                        case 20:
                            jh8 jh8Var4 = new jh8(dVar2, 10, false);
                            jh8Var4.F0();
                            dVar2.showDialog(jh8Var4);
                            return;
                        case 21:
                            jh8 jh8Var5 = new jh8(dVar2, 12, false);
                            jh8Var5.F0();
                            dVar2.showDialog(jh8Var5);
                            return;
                        case 22:
                            dVar2.presentFragment(new m66());
                            return;
                        case 23:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.Z(3);
                            return;
                        case 24:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.a0(3);
                            m66Var3.Z(1);
                            return;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(3);
                            m66Var4.Z(2);
                            return;
                        case 27:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.Z(28700);
                            return;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(28700);
                            m66Var6.Z(16388);
                            return;
                    }
                }
            });
        } else {
            so8Var19 = null;
        }
        if (F(currentAccount, 7)) {
            so8Var20 = new so8(811, k96.L0(2131746831), k96.L0(2131743990), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                        case 1:
                            de9.o(0, dVar2);
                            return;
                        case 2:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 3:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 5:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 6:
                            dVar2.presentFragment(new StickersActivity(1, null));
                            return;
                        case 7:
                            dVar2.presentFragment(new hs(0));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 9, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new hs(1));
                            return;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(3);
                            m66Var.Z(2);
                            return;
                        case 12:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 14:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 15:
                            dVar2.presentFragment(new y09());
                            return;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 6, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            jh8 jh8Var3 = new jh8(dVar2, 7, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                        case 20:
                            jh8 jh8Var4 = new jh8(dVar2, 10, false);
                            jh8Var4.F0();
                            dVar2.showDialog(jh8Var4);
                            return;
                        case 21:
                            jh8 jh8Var5 = new jh8(dVar2, 12, false);
                            jh8Var5.F0();
                            dVar2.showDialog(jh8Var5);
                            return;
                        case 22:
                            dVar2.presentFragment(new m66());
                            return;
                        case 23:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.Z(3);
                            return;
                        case 24:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.a0(3);
                            m66Var3.Z(1);
                            return;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(3);
                            m66Var4.Z(2);
                            return;
                        case 27:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.Z(28700);
                            return;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(28700);
                            m66Var6.Z(16388);
                            return;
                    }
                }
            });
        } else {
            so8Var20 = null;
        }
        if (F(currentAccount, 10)) {
            so8Var21 = new so8(812, k96.L0(2131746829), k96.L0(2131743990), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                        case 1:
                            de9.o(0, dVar2);
                            return;
                        case 2:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 3:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 5:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 6:
                            dVar2.presentFragment(new StickersActivity(1, null));
                            return;
                        case 7:
                            dVar2.presentFragment(new hs(0));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 9, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new hs(1));
                            return;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(3);
                            m66Var.Z(2);
                            return;
                        case 12:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 14:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 15:
                            dVar2.presentFragment(new y09());
                            return;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 6, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            jh8 jh8Var3 = new jh8(dVar2, 7, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                        case 20:
                            jh8 jh8Var4 = new jh8(dVar2, 10, false);
                            jh8Var4.F0();
                            dVar2.showDialog(jh8Var4);
                            return;
                        case 21:
                            jh8 jh8Var5 = new jh8(dVar2, 12, false);
                            jh8Var5.F0();
                            dVar2.showDialog(jh8Var5);
                            return;
                        case 22:
                            dVar2.presentFragment(new m66());
                            return;
                        case 23:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.Z(3);
                            return;
                        case 24:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.a0(3);
                            m66Var3.Z(1);
                            return;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(3);
                            m66Var4.Z(2);
                            return;
                        case 27:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.Z(28700);
                            return;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(28700);
                            m66Var6.Z(16388);
                            return;
                    }
                }
            });
        } else {
            so8Var21 = null;
        }
        if (F(currentAccount, 12)) {
            so8Var22 = new so8(813, k96.L0(2131746813), k96.L0(2131743990), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                        case 1:
                            de9.o(0, dVar2);
                            return;
                        case 2:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 3:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 5:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 6:
                            dVar2.presentFragment(new StickersActivity(1, null));
                            return;
                        case 7:
                            dVar2.presentFragment(new hs(0));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 9, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new hs(1));
                            return;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(3);
                            m66Var.Z(2);
                            return;
                        case 12:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 14:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 15:
                            dVar2.presentFragment(new y09());
                            return;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 6, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            jh8 jh8Var3 = new jh8(dVar2, 7, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                        case 20:
                            jh8 jh8Var4 = new jh8(dVar2, 10, false);
                            jh8Var4.F0();
                            dVar2.showDialog(jh8Var4);
                            return;
                        case 21:
                            jh8 jh8Var5 = new jh8(dVar2, 12, false);
                            jh8Var5.F0();
                            dVar2.showDialog(jh8Var5);
                            return;
                        case 22:
                            dVar2.presentFragment(new m66());
                            return;
                        case 23:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.Z(3);
                            return;
                        case 24:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.a0(3);
                            m66Var3.Z(1);
                            return;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(3);
                            m66Var4.Z(2);
                            return;
                        case 27:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.Z(28700);
                            return;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(28700);
                            m66Var6.Z(16388);
                            return;
                    }
                }
            });
        } else {
            so8Var22 = null;
        }
        so8 so8Var124 = new so8(900, k96.L0(2131746875), null, 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8Var124.h = "tg://settings/power-saving";
        so8 so8Var125 = new so8(901, k96.L0(2131748658), k96.L0(2131746875), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8Var125.h = "tg://settings/power-saving/stickers";
        so8 so8Var126 = new so8(902, k96.L0(2131748670), null, k96.L0(2131746875), k96.L0(2131748658), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var127 = new so8(903, k96.L0(2131748672), null, k96.L0(2131746875), k96.L0(2131748658), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var128 = new so8(904, k96.L0(2131748663), k96.L0(2131746875), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8Var128.h = "tg://settings/power-saving/emoji";
        so8 so8Var129 = new so8(905, k96.L0(2131748670), null, k96.L0(2131746875), k96.L0(2131748663), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        return;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        return;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        dVar2.presentFragment(new y09());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        return;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m66());
                        return;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        return;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        return;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        return;
                }
            }
        });
        so8 so8Var130 = new so8(906, k96.L0(2131748669), null, k96.L0(2131746875), k96.L0(2131748663), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8 so8Var131 = new so8(907, k96.L0(2131748672), null, k96.L0(2131746875), k96.L0(2131748663), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8 so8Var132 = new so8(908, k96.L0(2131748664), k96.L0(2131746875), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var132.h = "tg://settings/power-saving/effects";
        so8 so8Var133 = new so8(909, k96.L0(2131748667), null, k96.L0(2131746875), k96.L0(2131748664), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var133.h = "tg://settings/power-saving/background";
        so8 so8Var134 = new so8(910, k96.L0(2131748655), null, k96.L0(2131746875), k96.L0(2131748664), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8 so8Var135 = new so8(911, k96.L0(2131748659), null, k96.L0(2131746875), k96.L0(2131748664), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        if (gba.o() >= 1) {
            so8Var23 = new so8(326, k96.L0(2131748666), null, k96.L0(2131746875), k96.L0(2131748664), 2131232023, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(28700);
                            m66Var.Z(8200);
                            return;
                        case 1:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.a0(28700);
                            m66Var2.Z(4112);
                            return;
                        case 2:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.Z(360928);
                            return;
                        case 3:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(360928);
                            m66Var4.Z(32);
                            return;
                        case 4:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.a0(360928);
                            m66Var5.Z(64);
                            return;
                        case 5:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(360928);
                            m66Var6.Z(128);
                            return;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            m66 m66Var7 = new m66();
                            dVar2.presentFragment(m66Var7);
                            m66Var7.a0(360928);
                            m66Var7.Z(256);
                            return;
                        case 8:
                            m66 m66Var8 = new m66();
                            dVar2.presentFragment(m66Var8);
                            m66Var8.a0(360928);
                            m66Var8.Z(32768);
                            return;
                        case 9:
                            m66 m66Var9 = new m66();
                            dVar2.presentFragment(m66Var9);
                            m66Var9.Z(512);
                            return;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            m66 m66Var10 = new m66();
                            dVar2.presentFragment(m66Var10);
                            m66Var10.Z(1024);
                            return;
                        case 12:
                            m66 m66Var11 = new m66();
                            dVar2.presentFragment(m66Var11);
                            m66Var11.Z(2048);
                            return;
                        case 13:
                            m66 m66Var12 = new m66();
                            dVar2.presentFragment(m66Var12);
                            while (true) {
                                ArrayList arrayList = m66Var12.s;
                                if (i < arrayList.size()) {
                                    if (((g66) arrayList.get(i)).f) {
                                        m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                        return;
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        case 14:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 15:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 17:
                            jh8 jh8Var = new jh8(dVar2, 0, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 18:
                            dVar2.showDialog(ij.R(dVar2, null));
                            return;
                        case 19:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                            return;
                        case 20:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 23:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 24:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 25:
                            dVar2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(PasscodeActivity.m0());
                            return;
                        case 27:
                            jh8 jh8Var2 = new jh8(dVar2, 11, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 28:
                            dVar2.presentFragment(new u8(3));
                            return;
                        default:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                    }
                }
            });
        } else {
            so8Var23 = null;
        }
        so8 so8Var136 = new so8(912, k96.L0(2131748660), null, k96.L0(2131746875), k96.L0(2131748664), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8 so8Var137 = new so8(913, k96.L0(2131748665), k96.L0(2131746875), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var137.h = "tg://settings/power-saving/call-animations";
        so8 so8Var138 = new so8(214, k96.L0(2131748668), k96.L0(2131746875), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var138.h = "tg://settings/power-saving/videos";
        so8 so8Var139 = new so8(213, k96.L0(2131748671), k96.L0(2131746875), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var139.h = "tg://settings/power-saving/gifs";
        so8 so8Var140 = new so8(914, k96.L0(2131748654), k96.L0(2131746875), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var140.h = "tg://settings/power-saving/transitions";
        so8 so8Var141 = new so8(400, k96.L0(2131748862), 2131232034, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var141.h = "tg://settings/language";
        so8 so8Var142 = new so8(405, k96.L0(2131745135), k96.L0(2131748862), 2131232034, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var142.h = "tg://settings/language/show-button";
        if (na7.q1(currentAccount).i4.r()) {
            so8 so8Var143 = new so8(406, k96.L0(2131751346), k96.L0(2131748862), 2131232034, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(28700);
                            m66Var.Z(8200);
                            return;
                        case 1:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.a0(28700);
                            m66Var2.Z(4112);
                            return;
                        case 2:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.Z(360928);
                            return;
                        case 3:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(360928);
                            m66Var4.Z(32);
                            return;
                        case 4:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.a0(360928);
                            m66Var5.Z(64);
                            return;
                        case 5:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(360928);
                            m66Var6.Z(128);
                            return;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            m66 m66Var7 = new m66();
                            dVar2.presentFragment(m66Var7);
                            m66Var7.a0(360928);
                            m66Var7.Z(256);
                            return;
                        case 8:
                            m66 m66Var8 = new m66();
                            dVar2.presentFragment(m66Var8);
                            m66Var8.a0(360928);
                            m66Var8.Z(32768);
                            return;
                        case 9:
                            m66 m66Var9 = new m66();
                            dVar2.presentFragment(m66Var9);
                            m66Var9.Z(512);
                            return;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            m66 m66Var10 = new m66();
                            dVar2.presentFragment(m66Var10);
                            m66Var10.Z(1024);
                            return;
                        case 12:
                            m66 m66Var11 = new m66();
                            dVar2.presentFragment(m66Var11);
                            m66Var11.Z(2048);
                            return;
                        case 13:
                            m66 m66Var12 = new m66();
                            dVar2.presentFragment(m66Var12);
                            while (true) {
                                ArrayList arrayList = m66Var12.s;
                                if (i < arrayList.size()) {
                                    if (((g66) arrayList.get(i)).f) {
                                        m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                        return;
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        case 14:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 15:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 17:
                            jh8 jh8Var = new jh8(dVar2, 0, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 18:
                            dVar2.showDialog(ij.R(dVar2, null));
                            return;
                        case 19:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                            return;
                        case 20:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 23:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 24:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 25:
                            dVar2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(PasscodeActivity.m0());
                            return;
                        case 27:
                            jh8 jh8Var2 = new jh8(dVar2, 11, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 28:
                            dVar2.presentFragment(new u8(3));
                            return;
                        default:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                    }
                }
            });
            so8Var143.h = "tg://settings/language/do-not-translate";
            so8Var44 = so8Var143;
        }
        so8 so8Var144 = new so8(402, k96.L0(2131753983), k96.L0(2131745287), 2131232033, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var144.h = "tg://settings/ask-question";
        so8 so8Var145 = new so8(403, k96.L0(2131744001), k96.L0(2131745287), 2131232033, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var145.h = "tg://settings/faq";
        so8 so8Var146 = new so8(404, k96.L0(2131746592), k96.L0(2131745287), 2131232033, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        return;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        return;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        return;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        return;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        return;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        return;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        return;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        return;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        return;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i < arrayList.size()) {
                                if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        return;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        return;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        return;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        so8Var146.h = "tg://settings/privacy-policy";
        return new so8[]{so8Var24, so8Var25, so8Var26, so8Var27, so8Var28, so8Var29, so8Var30, so8Var31, so8Var32, so8Var33, so8Var34, so8Var35, so8Var36, so8Var37, so8Var38, so8Var39, so8Var40, so8Var, so8Var42, so8Var43, so8Var2, so8Var45, so8Var46, so8Var47, so8Var48, so8Var49, so8Var50, so8Var51, so8Var52, so8Var53, so8Var3, so8Var4, so8Var55, so8Var56, so8Var57, so8Var58, so8Var59, so8Var60, so8Var61, so8Var62, so8Var63, so8Var64, so8Var65, so8Var66, so8Var67, so8Var68, so8Var69, so8Var70, so8Var71, so8Var72, so8Var73, so8Var74, so8Var75, so8Var76, so8Var77, so8Var78, so8Var79, so8Var80, so8Var81, so8Var82, so8Var83, so8Var84, so8Var85, so8Var86, so8Var87, so8Var88, so8Var89, so8Var90, so8Var91, so8Var92, so8Var93, so8Var94, so8Var95, so8Var96, so8Var97, so8Var98, so8Var99, so8Var100, so8Var101, so8Var102, so8Var103, so8Var104, so8Var105, so8Var106, so8Var107, so8Var108, so8Var109, so8Var110, so8Var111, so8Var112, so8Var113, so8Var6, so8Var115, so8Var7, so8Var117, so8Var8, so8Var119, so8Var120, so8Var121, so8Var122, so8Var5, so8Var9, so8Var10, so8Var11, so8Var12, so8Var13, so8Var14, so8Var15, so8Var16, so8Var17, so8Var18, so8Var19, so8Var20, so8Var21, so8Var22, so8Var124, so8Var125, so8Var126, so8Var127, so8Var128, so8Var129, so8Var130, so8Var131, so8Var132, so8Var133, so8Var134, so8Var135, so8Var23, so8Var136, so8Var137, so8Var138, so8Var139, so8Var140, so8Var141, so8Var142, so8Var44, so8Var144, so8Var145, so8Var146};
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 0) {
            return true;
        }
        return false;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.w;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.x) {
            f();
        }
        if (arrayList.size() > 20) {
            tb4.v(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 instanceof so8) {
                ((so8) obj2).g = i;
            } else if (obj2 instanceof aa7) {
                ((aa7) obj2).d = i;
            }
            linkedHashSet.add(obj2.toString());
        }
        na7.c1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i = this.f;
        TLRPC.WebPage webPage = na7.q1(i).j2;
        this.F = webPage;
        if (webPage != null) {
            this.d.addAll(na7.q1(i).i2);
        }
        if (this.F == null && !this.G) {
            this.G = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = k96.M0(2131743999, null);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getWebPage, new n35(this, (byte) 21));
        }
    }

    public final void I(String str) {
        this.E = str;
        if (this.y != null) {
            Utilities.g.a(this.y);
            this.y = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.x = false;
            this.r.clear();
            this.s.clear();
            this.n.clear();
            d dVar = this.e;
            if (dVar instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) dVar).P.b.getImageReceiver().w0(false);
                    ((ProfileActivity) this.e).P.d.setText(k96.M0(2131745285, null));
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            f();
            return;
        }
        co3 co3Var = Utilities.g;
        ll8 ll8Var = new ll8(this, str, (byte) 14);
        this.y = ll8Var;
        co3Var.d(ll8Var, 300L);
    }

    public final void J() {
        String[] strArr;
        so8 so8Var;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            so8[] so8VarArr = this.c;
            if (i >= so8VarArr.length) {
                break;
            }
            so8 so8Var2 = so8VarArr[i];
            if (so8Var2 != null) {
                hashMap.put(Integer.valueOf(so8Var2.f), this.c[i]);
            }
            i++;
        }
        Set<String> stringSet = na7.c1().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.w;
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(str));
                    int readInt32 = serializedData.readInt32(false);
                    int readInt322 = serializedData.readInt32(false);
                    if (readInt322 == 0) {
                        String readString = serializedData.readString(false);
                        int readInt323 = serializedData.readInt32(false);
                        if (readInt323 > 0) {
                            strArr = new String[readInt323];
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                strArr[i2] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        aa7 aa7Var = new aa7(readString, strArr, serializedData.readString(false));
                        aa7Var.d = readInt32;
                        arrayList.add(aa7Var);
                    } else if (readInt322 == 1 && (so8Var = (so8) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        so8Var.g = readInt32;
                        arrayList.add(so8Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new fx7(this, (byte) 6));
    }

    @Override
    public final int b() {
        int size;
        int size2;
        int i = 0;
        if (this.x) {
            size = this.r.size();
            if (!this.s.isEmpty()) {
                size2 = this.s.size();
                i = size2 + 1;
            }
        } else {
            ArrayList arrayList = this.w;
            if (arrayList.isEmpty()) {
                size = 0;
            } else {
                size = arrayList.size() + 1;
            }
            ArrayList arrayList2 = this.d;
            if (!arrayList2.isEmpty()) {
                size2 = arrayList2.size();
                i = size2 + 1;
            }
        }
        return size + i;
    }

    @Override
    public final int d(int i) {
        if (this.x) {
            if (i < this.r.size() || i != this.r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.w;
            if (i == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i != arrayList.size() + 1) {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3 = s49Var.f;
        View view = s49Var.a;
        so8 so8Var = null;
        boolean z = true;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    ((ld5) view).setText(k96.M0(2131745277, null));
                    return;
                }
                return;
            }
            ((l35) view).setText(k96.M0(2131745290, null));
            return;
        }
        o8a o8aVar = (o8a) view;
        boolean z2 = false;
        if (this.x) {
            int size = this.r.size();
            ArrayList arrayList = this.r;
            if (i < size) {
                so8 so8Var2 = (so8) arrayList.get(i);
                if (i > 0) {
                    so8Var = (so8) this.r.get(i - 1);
                }
                if (so8Var != null && so8Var.e == so8Var2.e) {
                    i2 = 0;
                } else {
                    i2 = so8Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.n.get(i);
                String[] strArr = so8Var2.d;
                if (i >= this.r.size() - 1) {
                    z = false;
                }
                o8aVar.b(charSequence, strArr, i2, z);
                return;
            }
            int k = ir2.k(1, i, arrayList);
            CharSequence charSequence2 = (CharSequence) this.n.get(this.r.size() + k);
            String[] strArr2 = ((aa7) this.s.get(k)).b;
            if (k < this.r.size() - 1) {
                z2 = true;
            }
            o8aVar.a(charSequence2, strArr2, true, z2);
            return;
        }
        ArrayList arrayList2 = this.w;
        if (!arrayList2.isEmpty()) {
            i--;
        }
        if (i < arrayList2.size()) {
            Object obj = arrayList2.get(i);
            if (obj instanceof so8) {
                so8 so8Var3 = (so8) obj;
                String str = so8Var3.a;
                String[] strArr3 = so8Var3.d;
                if (i >= arrayList2.size() - 1) {
                    z = false;
                }
                o8aVar.a(str, strArr3, false, z);
                return;
            } else if (obj instanceof aa7) {
                aa7 aa7Var = (aa7) obj;
                String str2 = aa7Var.a;
                String[] strArr4 = aa7Var.b;
                if (i < arrayList2.size() - 1) {
                    z2 = true;
                }
                o8aVar.a(str2, strArr4, true, z2);
                return;
            } else {
                return;
            }
        }
        int k2 = ir2.k(1, i, arrayList2);
        aa7 aa7Var2 = (aa7) this.d.get(k2);
        String str3 = aa7Var2.a;
        String[] strArr5 = aa7Var2.b;
        if (k2 < arrayList2.size() - 1) {
            z2 = true;
        }
        o8aVar.a(str3, strArr5, true, z2);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View o8aVar;
        Context context = this.h;
        if (i != 0) {
            if (i != 1) {
                o8aVar = new ld5(context, 16);
            } else {
                o8aVar = new l35(context, null);
            }
        } else {
            o8aVar = new o8a(context);
        }
        o8aVar.setLayoutParams(new e49(-1, -2));
        return new s49(o8aVar);
    }
}
