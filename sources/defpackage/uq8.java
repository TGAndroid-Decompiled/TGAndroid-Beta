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
public class uq8 extends q59 {
    public String E;
    public TLRPC.WebPage F;
    public boolean G;
    public tq8[] c;
    public final d e;
    public final int f;
    public final Context h;
    public boolean x;
    public mn8 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public uq8(d dVar, Context context) {
        this.e = dVar;
        this.f = dVar.getCurrentAccount();
        this.h = context;
        this.c = H(dVar);
        J();
    }

    public static boolean F(int i, int i2) {
        if (oc7.r1(i).H3() && !z8c.h(i).p()) {
            return false;
        }
        if (i2 != -1 && oc7.r1(i).E0.get(i2, -1) == -1) {
            return false;
        }
        return true;
    }

    public static tq8[] H(final d dVar) {
        tq8 tq8Var;
        tq8 tq8Var2;
        tq8 tq8Var3;
        tq8 tq8Var4;
        tq8 tq8Var5;
        tq8 tq8Var6;
        tq8 tq8Var7;
        tq8 tq8Var8;
        tq8 tq8Var9;
        tq8 tq8Var10;
        tq8 tq8Var11;
        tq8 tq8Var12;
        tq8 tq8Var13;
        tq8 tq8Var14;
        tq8 tq8Var15;
        tq8 tq8Var16;
        tq8 tq8Var17;
        tq8 tq8Var18;
        tq8 tq8Var19;
        tq8 tq8Var20;
        tq8 tq8Var21;
        tq8 tq8Var22;
        tq8 tq8Var23;
        final int currentAccount = dVar.getCurrentAccount();
        tq8 tq8Var24 = new tq8(500, jb6.L0(2131751201), 0, new mn8(dVar, dVar.getResourceProvider(), (byte) 15));
        tq8 tq8Var25 = new tq8(501, jb6.L0(2131752490), 0, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var25.h = "tg://settings/edit/change-number";
        tq8 tq8Var26 = new tq8(502, jb6.L0(2131754465), 0, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var26.h = "tg://settings/edit/add-account";
        tq8 tq8Var27 = new tq8(1, jb6.L0(2131747655), 2131232268, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var27.h = "tg://settings/notifications";
        tq8 tq8Var28 = new tq8(2, jb6.L0(2131747611), jb6.L0(2131747655), 2131232268, new sq8(dVar, (byte) 3));
        tq8Var28.h = "tg://settings/notifications/private-chats";
        tq8 tq8Var29 = new tq8(3, jb6.L0(2131747640), jb6.L0(2131747655), 2131232268, new sq8(dVar, (byte) 15));
        tq8Var29.h = "tg://settings/notifications/groups";
        tq8 tq8Var30 = new tq8(4, jb6.L0(2131747654), jb6.L0(2131747655), 2131232268, new ww1(dVar, (byte) 11));
        tq8Var30.h = "tg://settings/notifications/channels";
        tq8 tq8Var31 = new tq8(5, jb6.L0(2131742963), "callsSectionRow", jb6.L0(2131747655), 2131232268, new ww1(dVar, (byte) 23));
        tq8 tq8Var32 = new tq8(6, jb6.L0(2131753698), "badgeNumberSection", jb6.L0(2131747655), 2131232268, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var33 = new tq8(7, jb6.L0(2131748976), "inappSectionRow", jb6.L0(2131747655), 2131232268, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var34 = new tq8(8, jb6.L0(2131751727), "contactJoinedRow", jb6.L0(2131747655), 2131232268, new ww1(dVar, (byte) 27));
        tq8Var34.h = "tg://settings/notifications/new-contacts";
        tq8 tq8Var35 = new tq8(9, jb6.L0(2131746961), "pinnedMessageRow", jb6.L0(2131747655), 2131232268, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8Var35.h = "tg://settings/notifications/pinned-messages";
        tq8 tq8Var36 = new tq8(10, jb6.L0(2131745845), "resetNotificationsRow", jb6.L0(2131747655), 2131232268, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var36.h = "tg://settings/notifications/reset";
        tq8 tq8Var37 = new tq8(11, jb6.L0(2131747609), "notificationsServiceRow", jb6.L0(2131747655), 2131232268, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8 tq8Var38 = new tq8(12, jb6.L0(2131747608), "notificationsServiceConnectionRow", jb6.L0(2131747655), 2131232268, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8 tq8Var39 = new tq8(13, jb6.L0(2131746008), "repeatRow", jb6.L0(2131747655), 2131232268, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8 tq8Var40 = new tq8(100, jb6.L0(2131746506), 2131232361, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var40.h = "tg://settings/privacy";
        tq8 tq8Var41 = new tq8(109, jb6.L0(2131743625), jb6.L0(2131746506), 2131232041, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var41.h = "tg://settings/privacy/2sv";
        tq8 tq8Var42 = new tq8(124, jb6.L0(2131753815), jb6.L0(2131746506), 2131232041, new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                d dVar2 = dVar;
                int i = currentAccount;
                switch (b) {
                    case 0:
                        if (z8c.h(i).q0 >= 0) {
                            dVar2.presentFragment(new v70());
                            return;
                        }
                        return;
                    default:
                        if (!z8c.h(i).p()) {
                            c41 b0 = c41.b0(dVar2);
                            b0.getClass();
                            b31 b31Var = new b31(b0.X(), null);
                            b31Var.d(2131624342, new String[0]);
                            String M0 = jb6.M0(2131746490, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new z31(b0, (byte) 0), indexOf, lastIndexOf - 1, 33);
                            }
                            b31Var.b.setText(spannableStringBuilder);
                            b31Var.b.setSingleLine(false);
                            b31Var.b.setMaxLines(2);
                            b0.b(b31Var, 2750).j();
                            return;
                        }
                        dVar2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        tq8Var42.h = "tg://settings/privacy/auto-delete";
        tq8 tq8Var43 = new tq8(108, jb6.L0(2131747390), jb6.L0(2131746506), 2131232041, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var43.h = "tg://settings/privacy/passcode";
        tq8 tq8Var44 = null;
        if (gda.i1) {
            tq8Var = tq8Var41;
            tq8Var2 = new tq8(125, jb6.L0(2131751139), "emailLoginRow", jb6.L0(2131746506), 2131232041, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(28700);
                            m86Var.a0(8200);
                            return;
                        case 1:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.b0(28700);
                            m86Var2.a0(4112);
                            return;
                        case 2:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.a0(360928);
                            return;
                        case 3:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(360928);
                            m86Var4.a0(32);
                            return;
                        case 4:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.b0(360928);
                            m86Var5.a0(64);
                            return;
                        case 5:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(360928);
                            m86Var6.a0(128);
                            return;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            m86 m86Var7 = new m86();
                            dVar2.presentFragment(m86Var7);
                            m86Var7.b0(360928);
                            m86Var7.a0(256);
                            return;
                        case 8:
                            m86 m86Var8 = new m86();
                            dVar2.presentFragment(m86Var8);
                            m86Var8.b0(360928);
                            m86Var8.a0(32768);
                            return;
                        case 9:
                            m86 m86Var9 = new m86();
                            dVar2.presentFragment(m86Var9);
                            m86Var9.a0(512);
                            return;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            m86 m86Var10 = new m86();
                            dVar2.presentFragment(m86Var10);
                            m86Var10.a0(1024);
                            return;
                        case 12:
                            m86 m86Var11 = new m86();
                            dVar2.presentFragment(m86Var11);
                            m86Var11.a0(2048);
                            return;
                        case 13:
                            m86 m86Var12 = new m86();
                            dVar2.presentFragment(m86Var12);
                            while (true) {
                                ArrayList arrayList = m86Var12.s;
                                if (i < arrayList.size()) {
                                    if (((g86) arrayList.get(i)).f) {
                                        m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                            kj8 kj8Var = new kj8(dVar2, 0, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            return;
                        case 18:
                            dVar2.showDialog(ik.R(dVar2, null));
                            return;
                        case 19:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                            return;
                        case 20:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                            dVar2.presentFragment(PasscodeActivity.n0());
                            return;
                        case 27:
                            kj8 kj8Var2 = new kj8(dVar2, 11, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
            tq8Var2.h = "tg://settings/privacy/login-email";
        } else {
            tq8Var = tq8Var41;
            tq8Var2 = null;
        }
        tq8 tq8Var45 = new tq8(101, jb6.L0(2131753646), jb6.L0(2131746506), 2131232361, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var45.h = "tg://settings/privacy/blocked";
        tq8 tq8Var46 = new tq8(110, jb6.L0(2131745285), 2131232041, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var46.h = "tg://settings/devices";
        tq8 tq8Var47 = new tq8(105, jb6.L0(2131746525), jb6.L0(2131746506), 2131232361, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var47.h = "tg://settings/privacy/phone-number/";
        tq8 tq8Var48 = new tq8(102, jb6.L0(2131746550), jb6.L0(2131746506), 2131232361, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var48.h = "tg://settings/privacy/last-seen";
        tq8 tq8Var49 = new tq8(103, jb6.L0(2131746512), jb6.L0(2131746506), 2131232361, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var49.h = "tg://settings/privacy/profile-photos";
        tq8 tq8Var50 = new tq8(104, jb6.L0(2131746572), jb6.L0(2131746506), 2131232361, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var50.h = "tg://settings/privacy/forwards";
        tq8 tq8Var51 = new tq8(122, jb6.L0(2131746535), jb6.L0(2131746506), 2131232361, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var51.h = "tg://settings/privacy/calls/p2p";
        tq8 tq8Var52 = new tq8(106, jb6.L0(2131752549), jb6.L0(2131746506), 2131232361, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var52.h = "tg://settings/privacy/calls";
        tq8 tq8Var53 = new tq8(107, jb6.L0(2131746552), jb6.L0(2131746506), 2131232361, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var53.h = "tg://settings/privacy/invites";
        tq8 tq8Var54 = new tq8(123, jb6.L0(2131746493), jb6.L0(2131746506), 2131232361, new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                d dVar2 = dVar;
                int i = currentAccount;
                switch (b) {
                    case 0:
                        if (z8c.h(i).q0 >= 0) {
                            dVar2.presentFragment(new v70());
                            return;
                        }
                        return;
                    default:
                        if (!z8c.h(i).p()) {
                            c41 b0 = c41.b0(dVar2);
                            b0.getClass();
                            b31 b31Var = new b31(b0.X(), null);
                            b31Var.d(2131624342, new String[0]);
                            String M0 = jb6.M0(2131746490, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new z31(b0, (byte) 0), indexOf, lastIndexOf - 1, 33);
                            }
                            b31Var.b.setText(spannableStringBuilder);
                            b31Var.b.setSingleLine(false);
                            b31Var.b.setMaxLines(2);
                            b0.b(b31Var, 2750).j();
                            return;
                        }
                        dVar2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        tq8Var54.h = "tg://settings/privacy/voice";
        if (oc7.r1(currentAccount).l4.L0.f()) {
            tq8Var3 = tq8Var54;
            tq8Var4 = new tq8(121, jb6.L0(2131754136), "newChatsRow", jb6.L0(2131746506), 2131232041, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            km8 km8Var = new km8();
                            km8Var.getMessagesController().E0(true);
                            dVar2.presentFragment(km8Var);
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
                            kj8 kj8Var = new kj8(dVar2, 1, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
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
                            kj8 kj8Var2 = new kj8(dVar2, 2, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
                            dVar2.presentFragment(new y71());
                            return;
                        case 28:
                            dVar2.presentFragment(new y71());
                            return;
                        default:
                            kj8 kj8Var3 = new kj8(dVar2, 8, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                    }
                    while (true) {
                        if (i < 4) {
                            if (z8c.h(i).o()) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mh6(i));
                    }
                }
            });
            tq8Var4.h = "tg://settings/privacy/archive-and-mute";
        } else {
            tq8Var3 = tq8Var54;
            tq8Var4 = null;
        }
        tq8 tq8Var55 = new tq8(112, jb6.L0(2131751533), "deleteAccountRow", jb6.L0(2131746506), 2131232041, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var55.h = "tg://settings/privacy/self-destruct";
        tq8 tq8Var56 = new tq8(113, jb6.L0(2131746532), "paymentsClearRow", jb6.L0(2131746506), 2131232041, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var56.h = "tg://settings/privacy/data-settings/clear-payment-info";
        tq8 tq8Var57 = new tq8(114, jb6.L0(2131742574), jb6.L0(2131746506), 2131232041, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var57.h = "tg://settings/privacy/active-websites";
        tq8 tq8Var58 = new tq8(115, jb6.L0(2131743981), "contactsDeleteRow", jb6.L0(2131746506), 2131232041, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var58.h = "tg://settings/privacy/data-settings/delete-synced";
        tq8 tq8Var59 = new tq8(116, jb6.L0(2131743983), "contactsSyncRow", jb6.L0(2131746506), 2131232041, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var59.h = "tg://settings/privacy/data-settings/sync-contacts";
        tq8 tq8Var60 = new tq8(117, jb6.L0(2131744097), "contactsSuggestRow", jb6.L0(2131746506), 2131232041, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var60.h = "tg://settings/privacy/data-settings/suggest-contacts";
        tq8 tq8Var61 = new tq8(118, jb6.L0(2131748446), "secretMapRow", jb6.L0(2131746506), 2131232041, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var61.h = "tg://settings/privacy/data-settings/map-provider";
        tq8 tq8Var62 = new tq8(119, jb6.L0(2131745418), "secretWebpageRow", jb6.L0(2131746506), 2131232041, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var62.h = "tg://settings/privacy/data-settings/link-previews";
        tq8 tq8Var63 = new tq8(120, jb6.L0(2131751392), 2131232029, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var63.h = "tg://settings/devices";
        tq8 tq8Var64 = new tq8(121, jb6.L0(2131743893), "terminateAllSessionsRow", jb6.L0(2131751392), 2131232029, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var64.h = "tg://settings/devices/terminate-sessions";
        tq8 tq8Var65 = new tq8(122, jb6.L0(2131748674), jb6.L0(2131751392), 2131232029, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var65.h = "tg://settings/devices/link-desktop";
        tq8 tq8Var66 = new tq8(200, jb6.L0(2131751614), 2131232028, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var66.h = "tg://settings/privacy/data-settings";
        tq8 tq8Var67 = new tq8(201, jb6.L0(2131751613), "usageSectionRow", jb6.L0(2131751614), 2131232028, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8 tq8Var68 = new tq8(202, jb6.L0(2131744505), jb6.L0(2131751614), 2131232028, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var68.h = "tg://settings/data/storage";
        tq8 tq8Var69 = new tq8(203, jb6.L0(2131748817), "keepMediaRow", jb6.L0(2131751614), jb6.L0(2131744505), 2131232028, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (z8c.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8 tq8Var70 = new tq8(204, jb6.L0(2131752012), "cacheRow", jb6.L0(2131751614), jb6.L0(2131744505), 2131232028, new sq8(dVar, (byte) 0));
        tq8 tq8Var71 = new tq8(205, jb6.L0(2131748531), "databaseRow", jb6.L0(2131751614), jb6.L0(2131744505), 2131232028, new sq8(dVar, (byte) 1));
        tq8 tq8Var72 = new tq8(206, jb6.L0(2131748055), jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 2));
        tq8Var72.h = "tg://settings/data/usage";
        tq8 tq8Var73 = new tq8(207, jb6.L0(2131753732), "mediaDownloadSectionRow", jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 4));
        tq8 tq8Var74 = new tq8(208, jb6.L0(2131742547), jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 5));
        tq8 tq8Var75 = new tq8(209, jb6.L0(2131742549), jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 6));
        tq8 tq8Var76 = new tq8(210, jb6.L0(2131742548), jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 7));
        tq8 tq8Var77 = new tq8(211, jb6.L0(2131745844), "resetDownloadRow", jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 8));
        tq8Var77.h = "tg://settings/data/auto-download/reset";
        tq8 tq8Var78 = new tq8(215, jb6.L0(2131744123), "streamSectionRow", jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 9));
        tq8 tq8Var79 = new tq8(216, jb6.L0(2131751081), "enableStreamRow", jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 11));
        tq8 tq8Var80 = new tq8(217, jb6.L0(2131752549), "callsSectionRow", jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 12));
        tq8 tq8Var81 = new tq8(218, jb6.L0(2131742913), "useLessDataForCallsRow", jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 13));
        tq8Var81.h = "tg://settings/data/use-less-data";
        tq8 tq8Var82 = new tq8(219, jb6.L0(2131742942), "quickRepliesRow", jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 14));
        tq8 tq8Var83 = new tq8(220, jb6.L0(2131746334), jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 16));
        tq8Var83.h = "tg://settings/data/proxy";
        tq8 tq8Var84 = new tq8(111, jb6.L0(2131746576), "clearDraftsRow", jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 17));
        tq8Var84.h = "tg://settings/privacy/data-settings/delete-cloud-drafts";
        tq8 tq8Var85 = new tq8(222, jb6.L0(2131745663), "saveToGallerySectionRow", jb6.L0(2131751614), 2131232028, new sq8(dVar, (byte) 18));
        tq8 tq8Var86 = new tq8(223, jb6.L0(2131745653), "saveToGalleryPeerRow", jb6.L0(2131751614), jb6.L0(2131745663), 2131232028, new sq8(dVar, (byte) 19));
        tq8Var86.h = "tg://settings/data/save-to-photos/chats";
        tq8 tq8Var87 = new tq8(224, jb6.L0(2131745660), "saveToGalleryGroupsRow", jb6.L0(2131751614), jb6.L0(2131745663), 2131232028, new sq8(dVar, (byte) 20));
        tq8Var87.h = "tg://settings/data/save-to-photos/groups";
        tq8 tq8Var88 = new tq8(225, jb6.L0(2131745662), "saveToGalleryChannelsRow", jb6.L0(2131751614), jb6.L0(2131745663), 2131232028, new ww1(dVar, (byte) 6));
        tq8Var88.h = "tg://settings/data/save-to-photos/channels";
        tq8 tq8Var89 = new tq8(300, jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 7));
        tq8Var89.h = "tg://settings/appearance/themes";
        tq8 tq8Var90 = new tq8(301, jb6.L0(2131743876), "textSizeHeaderRow", jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 8));
        tq8Var90.h = "tg://settings/appearance/text-size";
        tq8 tq8Var91 = new tq8(302, jb6.L0(2131752503), jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 9));
        tq8Var91.h = "tg://settings/appearance/wallpapers";
        tq8 tq8Var92 = new tq8(303, jb6.L0(2131745272), null, jb6.L0(2131752147), jb6.L0(2131752181), 2131232030, new ww1(dVar, (byte) 10));
        tq8 tq8Var93 = new tq8(304, jb6.L0(2131745841), "resetRow", jb6.L0(2131752147), jb6.L0(2131752181), 2131232030, new ww1(dVar, (byte) 12));
        tq8 tq8Var94 = new tq8(306, jb6.L0(2131751948), "themeHeaderRow", jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 13));
        tq8 tq8Var95 = new tq8(319, jb6.L0(2131752831), null, jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 14));
        tq8 tq8Var96 = new tq8(320, jb6.L0(2131751649), "createNewThemeRow", jb6.L0(2131752147), jb6.L0(2131752831), 2131232030, new ww1(dVar, (byte) 15));
        tq8Var96.h = "tg://settings/appearance/themes/create";
        tq8 tq8Var97 = new tq8(321, jb6.L0(2131752793), "bubbleRadiusHeaderRow", jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 17));
        tq8Var97.h = "tg://settings/appearance/message-corners";
        tq8 tq8Var98 = new tq8(322, jb6.L0(2131752162), "chatListHeaderRow", jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 18));
        tq8 tq8Var99 = new tq8(323, jb6.L0(2131752159), "swipeGestureHeaderRow", jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 19));
        tq8 tq8Var100 = new tq8(324, jb6.L0(2131754205), "appIconHeaderRow", jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 20));
        tq8Var100.h = "tg://settings/appearance/app-icon";
        tq8 tq8Var101 = new tq8(305, jb6.L0(2131753749), jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 21));
        tq8 tq8Var102 = new tq8(328, jb6.L0(2131747983), "nextMediaTapRow", jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 22));
        tq8Var102.h = "tg://settings/appearance/tap-for-next-media";
        tq8 tq8Var103 = new tq8(327, jb6.L0(2131746160), "raiseToListenRow", jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 24));
        tq8Var103.h = "tg://settings/data/raise-to-listen";
        tq8 tq8Var104 = new tq8(310, jb6.L0(2131746158), "raiseToSpeakRow", jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 25));
        tq8Var104.h = "tg://settings/data/raise-to-speak";
        tq8 tq8Var105 = new tq8(326, jb6.L0(2131747165), "pauseOnMediaRow", jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 26));
        tq8Var105.h = "tg://settings/data/pause-music";
        tq8 tq8Var106 = new tq8(325, jb6.L0(2131748196), "bluetoothScoRow", jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 28));
        tq8 tq8Var107 = new tq8(308, jb6.L0(2131751375), "directShareRow", jb6.L0(2131752147), 2131232030, new ww1(dVar, (byte) 29));
        tq8 tq8Var108 = new tq8(311, jb6.L0(2131745366), "sendByEnterRow", jb6.L0(2131752147), 2131232030, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var109 = new tq8(318, jb6.L0(2131751304), "distanceRow", jb6.L0(2131752147), 2131232030, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var110 = new tq8(600, jb6.L0(2131744546), 2131232044, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8Var110.h = "tg://settings/appearance/stickers-and-emoji";
        tq8 tq8Var111 = new tq8(601, jb6.L0(2131744087), "suggestRow", jb6.L0(2131744546), 2131232044, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var112 = new tq8(602, jb6.L0(2131750770), "featuredStickersHeaderRow", jb6.L0(2131744546), 2131232044, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var113 = new tq8(603, jb6.L0(2131748436), null, jb6.L0(2131744546), 2131232044, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var114 = new tq8(604, jb6.L0(2131754093), null, jb6.L0(2131744546), 2131232044, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8Var114.h = "tg://settings/appearance/stickers-and-emoji/archived";
        tq8 tq8Var115 = new tq8(605, jb6.L0(2131754098), null, jb6.L0(2131744546), 2131232044, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var116 = new tq8(606, jb6.L0(2131748791), "largeEmojiRow", jb6.L0(2131744546), 2131232044, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8Var116.h = "tg://settings/appearance/stickers-and-emoji/emoji/large";
        tq8 tq8Var117 = new tq8(607, jb6.L0(2131748479), null, jb6.L0(2131746801), jb6.L0(2131748607), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var118 = new tq8(608, jb6.L0(2131751133), null, jb6.L0(2131744546), 2131231517, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8Var118.h = "tg://settings/appearance/stickers-and-emoji/emoji";
        tq8 tq8Var119 = new tq8(609, jb6.L0(2131744101), "suggestAnimatedEmojiRow", jb6.L0(2131744546), jb6.L0(2131751133), 2131231517, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8Var119.h = "tg://settings/appearance/stickers-and-emoji/emoji/suggest";
        tq8 tq8Var120 = new tq8(610, jb6.L0(2131750772), "featuredStickersHeaderRow", jb6.L0(2131744546), jb6.L0(2131751133), 2131231517, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var121 = new tq8(611, jb6.L0(2131751287), null, jb6.L0(2131744546), 2131232044, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8Var121.h = "tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction";
        tq8 tq8Var122 = new tq8(700, jb6.L0(2131750628), null, 2131232032, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8Var122.h = "tg://settings/folders";
        tq8 tq8Var123 = new tq8(701, jb6.L0(2131751653), "createFilterRow", jb6.L0(2131750628), 2131232032, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8Var123.h = "tg://settings/folders/create";
        if (F(currentAccount, -1)) {
            tq8Var5 = tq8Var123;
            tq8Var6 = tq8Var114;
            tq8Var7 = tq8Var116;
            tq8Var8 = tq8Var118;
            tq8Var9 = new tq8(800, jb6.L0(2131743916), 2131232368, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(28700);
                            m86Var.a0(8200);
                            return;
                        case 1:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.b0(28700);
                            m86Var2.a0(4112);
                            return;
                        case 2:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.a0(360928);
                            return;
                        case 3:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(360928);
                            m86Var4.a0(32);
                            return;
                        case 4:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.b0(360928);
                            m86Var5.a0(64);
                            return;
                        case 5:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(360928);
                            m86Var6.a0(128);
                            return;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            m86 m86Var7 = new m86();
                            dVar2.presentFragment(m86Var7);
                            m86Var7.b0(360928);
                            m86Var7.a0(256);
                            return;
                        case 8:
                            m86 m86Var8 = new m86();
                            dVar2.presentFragment(m86Var8);
                            m86Var8.b0(360928);
                            m86Var8.a0(32768);
                            return;
                        case 9:
                            m86 m86Var9 = new m86();
                            dVar2.presentFragment(m86Var9);
                            m86Var9.a0(512);
                            return;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            m86 m86Var10 = new m86();
                            dVar2.presentFragment(m86Var10);
                            m86Var10.a0(1024);
                            return;
                        case 12:
                            m86 m86Var11 = new m86();
                            dVar2.presentFragment(m86Var11);
                            m86Var11.a0(2048);
                            return;
                        case 13:
                            m86 m86Var12 = new m86();
                            dVar2.presentFragment(m86Var12);
                            while (true) {
                                ArrayList arrayList = m86Var12.s;
                                if (i < arrayList.size()) {
                                    if (((g86) arrayList.get(i)).f) {
                                        m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                            kj8 kj8Var = new kj8(dVar2, 0, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            return;
                        case 18:
                            dVar2.showDialog(ik.R(dVar2, null));
                            return;
                        case 19:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                            return;
                        case 20:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                            dVar2.presentFragment(PasscodeActivity.n0());
                            return;
                        case 27:
                            kj8 kj8Var2 = new kj8(dVar2, 11, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
            tq8Var5 = tq8Var123;
            tq8Var6 = tq8Var114;
            tq8Var7 = tq8Var116;
            tq8Var8 = tq8Var118;
            tq8Var9 = null;
        }
        if (F(currentAccount, 0)) {
            tq8Var10 = new tq8(801, jb6.L0(2131746733), jb6.L0(2131743916), 2131232368, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(28700);
                            m86Var.a0(8200);
                            return;
                        case 1:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.b0(28700);
                            m86Var2.a0(4112);
                            return;
                        case 2:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.a0(360928);
                            return;
                        case 3:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(360928);
                            m86Var4.a0(32);
                            return;
                        case 4:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.b0(360928);
                            m86Var5.a0(64);
                            return;
                        case 5:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(360928);
                            m86Var6.a0(128);
                            return;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            m86 m86Var7 = new m86();
                            dVar2.presentFragment(m86Var7);
                            m86Var7.b0(360928);
                            m86Var7.a0(256);
                            return;
                        case 8:
                            m86 m86Var8 = new m86();
                            dVar2.presentFragment(m86Var8);
                            m86Var8.b0(360928);
                            m86Var8.a0(32768);
                            return;
                        case 9:
                            m86 m86Var9 = new m86();
                            dVar2.presentFragment(m86Var9);
                            m86Var9.a0(512);
                            return;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            m86 m86Var10 = new m86();
                            dVar2.presentFragment(m86Var10);
                            m86Var10.a0(1024);
                            return;
                        case 12:
                            m86 m86Var11 = new m86();
                            dVar2.presentFragment(m86Var11);
                            m86Var11.a0(2048);
                            return;
                        case 13:
                            m86 m86Var12 = new m86();
                            dVar2.presentFragment(m86Var12);
                            while (true) {
                                ArrayList arrayList = m86Var12.s;
                                if (i < arrayList.size()) {
                                    if (((g86) arrayList.get(i)).f) {
                                        m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                            kj8 kj8Var = new kj8(dVar2, 0, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            return;
                        case 18:
                            dVar2.showDialog(ik.R(dVar2, null));
                            return;
                        case 19:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                            return;
                        case 20:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                            dVar2.presentFragment(PasscodeActivity.n0());
                            return;
                        case 27:
                            kj8 kj8Var2 = new kj8(dVar2, 11, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
            tq8Var10 = null;
        }
        if (F(currentAccount, 11)) {
            tq8Var11 = new tq8(802, jb6.L0(2131746742), jb6.L0(2131743916), 2131232368, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(28700);
                            m86Var.a0(8200);
                            return;
                        case 1:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.b0(28700);
                            m86Var2.a0(4112);
                            return;
                        case 2:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.a0(360928);
                            return;
                        case 3:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(360928);
                            m86Var4.a0(32);
                            return;
                        case 4:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.b0(360928);
                            m86Var5.a0(64);
                            return;
                        case 5:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(360928);
                            m86Var6.a0(128);
                            return;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            m86 m86Var7 = new m86();
                            dVar2.presentFragment(m86Var7);
                            m86Var7.b0(360928);
                            m86Var7.a0(256);
                            return;
                        case 8:
                            m86 m86Var8 = new m86();
                            dVar2.presentFragment(m86Var8);
                            m86Var8.b0(360928);
                            m86Var8.a0(32768);
                            return;
                        case 9:
                            m86 m86Var9 = new m86();
                            dVar2.presentFragment(m86Var9);
                            m86Var9.a0(512);
                            return;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            m86 m86Var10 = new m86();
                            dVar2.presentFragment(m86Var10);
                            m86Var10.a0(1024);
                            return;
                        case 12:
                            m86 m86Var11 = new m86();
                            dVar2.presentFragment(m86Var11);
                            m86Var11.a0(2048);
                            return;
                        case 13:
                            m86 m86Var12 = new m86();
                            dVar2.presentFragment(m86Var12);
                            while (true) {
                                ArrayList arrayList = m86Var12.s;
                                if (i < arrayList.size()) {
                                    if (((g86) arrayList.get(i)).f) {
                                        m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                            kj8 kj8Var = new kj8(dVar2, 0, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            return;
                        case 18:
                            dVar2.showDialog(ik.R(dVar2, null));
                            return;
                        case 19:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                            return;
                        case 20:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                            dVar2.presentFragment(PasscodeActivity.n0());
                            return;
                        case 27:
                            kj8 kj8Var2 = new kj8(dVar2, 11, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
            tq8Var11 = null;
        }
        if (F(currentAccount, 1)) {
            tq8Var12 = new tq8(803, jb6.L0(2131746699), jb6.L0(2131743916), 2131232368, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            km8 km8Var = new km8();
                            km8Var.getMessagesController().E0(true);
                            dVar2.presentFragment(km8Var);
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
                            kj8 kj8Var = new kj8(dVar2, 1, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
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
                            kj8 kj8Var2 = new kj8(dVar2, 2, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
                            dVar2.presentFragment(new y71());
                            return;
                        case 28:
                            dVar2.presentFragment(new y71());
                            return;
                        default:
                            kj8 kj8Var3 = new kj8(dVar2, 8, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                    }
                    while (true) {
                        if (i < 4) {
                            if (z8c.h(i).o()) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mh6(i));
                    }
                }
            });
        } else {
            tq8Var12 = null;
        }
        if (F(currentAccount, 2)) {
            tq8Var13 = new tq8(804, jb6.L0(2131746747), jb6.L0(2131743916), 2131232368, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            km8 km8Var = new km8();
                            km8Var.getMessagesController().E0(true);
                            dVar2.presentFragment(km8Var);
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
                            kj8 kj8Var = new kj8(dVar2, 1, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
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
                            kj8 kj8Var2 = new kj8(dVar2, 2, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
                            dVar2.presentFragment(new y71());
                            return;
                        case 28:
                            dVar2.presentFragment(new y71());
                            return;
                        default:
                            kj8 kj8Var3 = new kj8(dVar2, 8, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                    }
                    while (true) {
                        if (i < 4) {
                            if (z8c.h(i).o()) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mh6(i));
                    }
                }
            });
        } else {
            tq8Var13 = null;
        }
        if (F(currentAccount, 8)) {
            tq8Var14 = new tq8(805, jb6.L0(2131746697), jb6.L0(2131743916), 2131232368, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            km8 km8Var = new km8();
                            km8Var.getMessagesController().E0(true);
                            dVar2.presentFragment(km8Var);
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
                            kj8 kj8Var = new kj8(dVar2, 1, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
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
                            kj8 kj8Var2 = new kj8(dVar2, 2, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
                            dVar2.presentFragment(new y71());
                            return;
                        case 28:
                            dVar2.presentFragment(new y71());
                            return;
                        default:
                            kj8 kj8Var3 = new kj8(dVar2, 8, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                    }
                    while (true) {
                        if (i < 4) {
                            if (z8c.h(i).o()) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mh6(i));
                    }
                }
            });
        } else {
            tq8Var14 = null;
        }
        if (F(currentAccount, 3)) {
            tq8Var15 = new tq8(806, jb6.L0(2131746727), jb6.L0(2131743916), 2131232368, new sq8(dVar, (byte) 10));
        } else {
            tq8Var15 = null;
        }
        if (F(currentAccount, 4)) {
            tq8Var16 = new tq8(807, jb6.L0(2131746718), jb6.L0(2131743916), 2131232368, new sq8(dVar, (byte) 21));
        } else {
            tq8Var16 = null;
        }
        if (F(currentAccount, 5)) {
            tq8Var17 = new tq8(808, jb6.L0(2131746711), jb6.L0(2131743916), 2131232368, new ww1(dVar, (byte) 16));
        } else {
            tq8Var17 = null;
        }
        if (F(currentAccount, 9)) {
            tq8Var18 = new tq8(809, jb6.L0(2131746760), jb6.L0(2131743916), 2131232368, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                        case 1:
                            hg9.n(0, dVar2);
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
                            dVar2.presentFragment(new ht(0));
                            return;
                        case 8:
                            kj8 kj8Var = new kj8(dVar2, 9, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new ht(1));
                            return;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(3);
                            m86Var.a0(2);
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
                            dVar2.presentFragment(new a39());
                            return;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            kj8 kj8Var2 = new kj8(dVar2, 6, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
                            return;
                        case 19:
                            kj8 kj8Var3 = new kj8(dVar2, 7, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                        case 20:
                            kj8 kj8Var4 = new kj8(dVar2, 10, false);
                            kj8Var4.F0();
                            dVar2.showDialog(kj8Var4);
                            return;
                        case 21:
                            kj8 kj8Var5 = new kj8(dVar2, 12, false);
                            kj8Var5.F0();
                            dVar2.showDialog(kj8Var5);
                            return;
                        case 22:
                            dVar2.presentFragment(new m86());
                            return;
                        case 23:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.a0(3);
                            return;
                        case 24:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.b0(3);
                            m86Var3.a0(1);
                            return;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(3);
                            m86Var4.a0(2);
                            return;
                        case 27:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.a0(28700);
                            return;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(28700);
                            m86Var6.a0(16388);
                            return;
                    }
                }
            });
        } else {
            tq8Var18 = null;
        }
        if (F(currentAccount, 6)) {
            tq8Var19 = new tq8(810, jb6.L0(2131746722), jb6.L0(2131743916), 2131232368, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                        case 1:
                            hg9.n(0, dVar2);
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
                            dVar2.presentFragment(new ht(0));
                            return;
                        case 8:
                            kj8 kj8Var = new kj8(dVar2, 9, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new ht(1));
                            return;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(3);
                            m86Var.a0(2);
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
                            dVar2.presentFragment(new a39());
                            return;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            kj8 kj8Var2 = new kj8(dVar2, 6, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
                            return;
                        case 19:
                            kj8 kj8Var3 = new kj8(dVar2, 7, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                        case 20:
                            kj8 kj8Var4 = new kj8(dVar2, 10, false);
                            kj8Var4.F0();
                            dVar2.showDialog(kj8Var4);
                            return;
                        case 21:
                            kj8 kj8Var5 = new kj8(dVar2, 12, false);
                            kj8Var5.F0();
                            dVar2.showDialog(kj8Var5);
                            return;
                        case 22:
                            dVar2.presentFragment(new m86());
                            return;
                        case 23:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.a0(3);
                            return;
                        case 24:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.b0(3);
                            m86Var3.a0(1);
                            return;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(3);
                            m86Var4.a0(2);
                            return;
                        case 27:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.a0(28700);
                            return;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(28700);
                            m86Var6.a0(16388);
                            return;
                    }
                }
            });
        } else {
            tq8Var19 = null;
        }
        if (F(currentAccount, 7)) {
            tq8Var20 = new tq8(811, jb6.L0(2131746757), jb6.L0(2131743916), 2131232368, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                        case 1:
                            hg9.n(0, dVar2);
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
                            dVar2.presentFragment(new ht(0));
                            return;
                        case 8:
                            kj8 kj8Var = new kj8(dVar2, 9, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new ht(1));
                            return;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(3);
                            m86Var.a0(2);
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
                            dVar2.presentFragment(new a39());
                            return;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            kj8 kj8Var2 = new kj8(dVar2, 6, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
                            return;
                        case 19:
                            kj8 kj8Var3 = new kj8(dVar2, 7, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                        case 20:
                            kj8 kj8Var4 = new kj8(dVar2, 10, false);
                            kj8Var4.F0();
                            dVar2.showDialog(kj8Var4);
                            return;
                        case 21:
                            kj8 kj8Var5 = new kj8(dVar2, 12, false);
                            kj8Var5.F0();
                            dVar2.showDialog(kj8Var5);
                            return;
                        case 22:
                            dVar2.presentFragment(new m86());
                            return;
                        case 23:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.a0(3);
                            return;
                        case 24:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.b0(3);
                            m86Var3.a0(1);
                            return;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(3);
                            m86Var4.a0(2);
                            return;
                        case 27:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.a0(28700);
                            return;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(28700);
                            m86Var6.a0(16388);
                            return;
                    }
                }
            });
        } else {
            tq8Var20 = null;
        }
        if (F(currentAccount, 10)) {
            tq8Var21 = new tq8(812, jb6.L0(2131746755), jb6.L0(2131743916), 2131232368, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                        case 1:
                            hg9.n(0, dVar2);
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
                            dVar2.presentFragment(new ht(0));
                            return;
                        case 8:
                            kj8 kj8Var = new kj8(dVar2, 9, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new ht(1));
                            return;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(3);
                            m86Var.a0(2);
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
                            dVar2.presentFragment(new a39());
                            return;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            kj8 kj8Var2 = new kj8(dVar2, 6, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
                            return;
                        case 19:
                            kj8 kj8Var3 = new kj8(dVar2, 7, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                        case 20:
                            kj8 kj8Var4 = new kj8(dVar2, 10, false);
                            kj8Var4.F0();
                            dVar2.showDialog(kj8Var4);
                            return;
                        case 21:
                            kj8 kj8Var5 = new kj8(dVar2, 12, false);
                            kj8Var5.F0();
                            dVar2.showDialog(kj8Var5);
                            return;
                        case 22:
                            dVar2.presentFragment(new m86());
                            return;
                        case 23:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.a0(3);
                            return;
                        case 24:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.b0(3);
                            m86Var3.a0(1);
                            return;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(3);
                            m86Var4.a0(2);
                            return;
                        case 27:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.a0(28700);
                            return;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(28700);
                            m86Var6.a0(16388);
                            return;
                    }
                }
            });
        } else {
            tq8Var21 = null;
        }
        if (F(currentAccount, 12)) {
            tq8Var22 = new tq8(813, jb6.L0(2131746739), jb6.L0(2131743916), 2131232368, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                        case 1:
                            hg9.n(0, dVar2);
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
                            dVar2.presentFragment(new ht(0));
                            return;
                        case 8:
                            kj8 kj8Var = new kj8(dVar2, 9, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new ht(1));
                            return;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(3);
                            m86Var.a0(2);
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
                            dVar2.presentFragment(new a39());
                            return;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            kj8 kj8Var2 = new kj8(dVar2, 6, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
                            return;
                        case 19:
                            kj8 kj8Var3 = new kj8(dVar2, 7, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                        case 20:
                            kj8 kj8Var4 = new kj8(dVar2, 10, false);
                            kj8Var4.F0();
                            dVar2.showDialog(kj8Var4);
                            return;
                        case 21:
                            kj8 kj8Var5 = new kj8(dVar2, 12, false);
                            kj8Var5.F0();
                            dVar2.showDialog(kj8Var5);
                            return;
                        case 22:
                            dVar2.presentFragment(new m86());
                            return;
                        case 23:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.a0(3);
                            return;
                        case 24:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.b0(3);
                            m86Var3.a0(1);
                            return;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(3);
                            m86Var4.a0(2);
                            return;
                        case 27:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.a0(28700);
                            return;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(28700);
                            m86Var6.a0(16388);
                            return;
                    }
                }
            });
        } else {
            tq8Var22 = null;
        }
        tq8 tq8Var124 = new tq8(900, jb6.L0(2131746801), null, 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8Var124.h = "tg://settings/power-saving";
        tq8 tq8Var125 = new tq8(901, jb6.L0(2131748607), jb6.L0(2131746801), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8Var125.h = "tg://settings/power-saving/stickers";
        tq8 tq8Var126 = new tq8(902, jb6.L0(2131748619), null, jb6.L0(2131746801), jb6.L0(2131748607), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var127 = new tq8(903, jb6.L0(2131748621), null, jb6.L0(2131746801), jb6.L0(2131748607), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var128 = new tq8(904, jb6.L0(2131748612), jb6.L0(2131746801), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8Var128.h = "tg://settings/power-saving/emoji";
        tq8 tq8Var129 = new tq8(905, jb6.L0(2131748619), null, jb6.L0(2131746801), jb6.L0(2131748612), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        return;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        return;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        return;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        return;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        return;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        return;
                    case 22:
                        dVar2.presentFragment(new m86());
                        return;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        return;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        return;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        return;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        return;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        return;
                }
            }
        });
        tq8 tq8Var130 = new tq8(906, jb6.L0(2131748618), null, jb6.L0(2131746801), jb6.L0(2131748612), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8 tq8Var131 = new tq8(907, jb6.L0(2131748621), null, jb6.L0(2131746801), jb6.L0(2131748612), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8 tq8Var132 = new tq8(908, jb6.L0(2131748613), jb6.L0(2131746801), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var132.h = "tg://settings/power-saving/effects";
        tq8 tq8Var133 = new tq8(909, jb6.L0(2131748616), null, jb6.L0(2131746801), jb6.L0(2131748613), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var133.h = "tg://settings/power-saving/background";
        tq8 tq8Var134 = new tq8(910, jb6.L0(2131748604), null, jb6.L0(2131746801), jb6.L0(2131748613), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8 tq8Var135 = new tq8(911, jb6.L0(2131748608), null, jb6.L0(2131746801), jb6.L0(2131748613), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        if (gda.o() >= 1) {
            tq8Var23 = new tq8(326, jb6.L0(2131748615), null, jb6.L0(2131746801), jb6.L0(2131748613), 2131232024, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(28700);
                            m86Var.a0(8200);
                            return;
                        case 1:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.b0(28700);
                            m86Var2.a0(4112);
                            return;
                        case 2:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.a0(360928);
                            return;
                        case 3:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(360928);
                            m86Var4.a0(32);
                            return;
                        case 4:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.b0(360928);
                            m86Var5.a0(64);
                            return;
                        case 5:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(360928);
                            m86Var6.a0(128);
                            return;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            m86 m86Var7 = new m86();
                            dVar2.presentFragment(m86Var7);
                            m86Var7.b0(360928);
                            m86Var7.a0(256);
                            return;
                        case 8:
                            m86 m86Var8 = new m86();
                            dVar2.presentFragment(m86Var8);
                            m86Var8.b0(360928);
                            m86Var8.a0(32768);
                            return;
                        case 9:
                            m86 m86Var9 = new m86();
                            dVar2.presentFragment(m86Var9);
                            m86Var9.a0(512);
                            return;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            m86 m86Var10 = new m86();
                            dVar2.presentFragment(m86Var10);
                            m86Var10.a0(1024);
                            return;
                        case 12:
                            m86 m86Var11 = new m86();
                            dVar2.presentFragment(m86Var11);
                            m86Var11.a0(2048);
                            return;
                        case 13:
                            m86 m86Var12 = new m86();
                            dVar2.presentFragment(m86Var12);
                            while (true) {
                                ArrayList arrayList = m86Var12.s;
                                if (i < arrayList.size()) {
                                    if (((g86) arrayList.get(i)).f) {
                                        m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                            kj8 kj8Var = new kj8(dVar2, 0, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            return;
                        case 18:
                            dVar2.showDialog(ik.R(dVar2, null));
                            return;
                        case 19:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                            return;
                        case 20:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                            dVar2.presentFragment(PasscodeActivity.n0());
                            return;
                        case 27:
                            kj8 kj8Var2 = new kj8(dVar2, 11, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
            tq8Var23 = null;
        }
        tq8 tq8Var136 = new tq8(912, jb6.L0(2131748609), null, jb6.L0(2131746801), jb6.L0(2131748613), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8 tq8Var137 = new tq8(913, jb6.L0(2131748614), jb6.L0(2131746801), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var137.h = "tg://settings/power-saving/call-animations";
        tq8 tq8Var138 = new tq8(214, jb6.L0(2131748617), jb6.L0(2131746801), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var138.h = "tg://settings/power-saving/videos";
        tq8 tq8Var139 = new tq8(213, jb6.L0(2131748620), jb6.L0(2131746801), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var139.h = "tg://settings/power-saving/gifs";
        tq8 tq8Var140 = new tq8(914, jb6.L0(2131748603), jb6.L0(2131746801), 2131232024, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var140.h = "tg://settings/power-saving/transitions";
        tq8 tq8Var141 = new tq8(400, jb6.L0(2131748811), 2131232035, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var141.h = "tg://settings/language";
        tq8 tq8Var142 = new tq8(405, jb6.L0(2131745061), jb6.L0(2131748811), 2131232035, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var142.h = "tg://settings/language/show-button";
        if (oc7.r1(currentAccount).i4.r()) {
            tq8 tq8Var143 = new tq8(406, jb6.L0(2131751295), jb6.L0(2131748811), 2131232035, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b) {
                        case 0:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(28700);
                            m86Var.a0(8200);
                            return;
                        case 1:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.b0(28700);
                            m86Var2.a0(4112);
                            return;
                        case 2:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.a0(360928);
                            return;
                        case 3:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(360928);
                            m86Var4.a0(32);
                            return;
                        case 4:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.b0(360928);
                            m86Var5.a0(64);
                            return;
                        case 5:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(360928);
                            m86Var6.a0(128);
                            return;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            m86 m86Var7 = new m86();
                            dVar2.presentFragment(m86Var7);
                            m86Var7.b0(360928);
                            m86Var7.a0(256);
                            return;
                        case 8:
                            m86 m86Var8 = new m86();
                            dVar2.presentFragment(m86Var8);
                            m86Var8.b0(360928);
                            m86Var8.a0(32768);
                            return;
                        case 9:
                            m86 m86Var9 = new m86();
                            dVar2.presentFragment(m86Var9);
                            m86Var9.a0(512);
                            return;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            m86 m86Var10 = new m86();
                            dVar2.presentFragment(m86Var10);
                            m86Var10.a0(1024);
                            return;
                        case 12:
                            m86 m86Var11 = new m86();
                            dVar2.presentFragment(m86Var11);
                            m86Var11.a0(2048);
                            return;
                        case 13:
                            m86 m86Var12 = new m86();
                            dVar2.presentFragment(m86Var12);
                            while (true) {
                                ArrayList arrayList = m86Var12.s;
                                if (i < arrayList.size()) {
                                    if (((g86) arrayList.get(i)).f) {
                                        m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                            kj8 kj8Var = new kj8(dVar2, 0, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            return;
                        case 18:
                            dVar2.showDialog(ik.R(dVar2, null));
                            return;
                        case 19:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                            return;
                        case 20:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                            dVar2.presentFragment(PasscodeActivity.n0());
                            return;
                        case 27:
                            kj8 kj8Var2 = new kj8(dVar2, 11, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
            tq8Var143.h = "tg://settings/language/do-not-translate";
            tq8Var44 = tq8Var143;
        }
        tq8 tq8Var144 = new tq8(402, jb6.L0(2131753951), jb6.L0(2131745213), 2131232034, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var144.h = "tg://settings/ask-question";
        tq8 tq8Var145 = new tq8(403, jb6.L0(2131743927), jb6.L0(2131745213), 2131232034, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var145.h = "tg://settings/faq";
        tq8 tq8Var146 = new tq8(404, jb6.L0(2131746518), jb6.L0(2131745213), 2131232034, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                d dVar2 = dVar;
                switch (b) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        return;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        return;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        return;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        return;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        return;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        return;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        return;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        return;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        return;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        return;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        return;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i < arrayList.size()) {
                                if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        return;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        return;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        return;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        return;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var146.h = "tg://settings/privacy-policy";
        return new tq8[]{tq8Var24, tq8Var25, tq8Var26, tq8Var27, tq8Var28, tq8Var29, tq8Var30, tq8Var31, tq8Var32, tq8Var33, tq8Var34, tq8Var35, tq8Var36, tq8Var37, tq8Var38, tq8Var39, tq8Var40, tq8Var, tq8Var42, tq8Var43, tq8Var2, tq8Var45, tq8Var46, tq8Var47, tq8Var48, tq8Var49, tq8Var50, tq8Var51, tq8Var52, tq8Var53, tq8Var3, tq8Var4, tq8Var55, tq8Var56, tq8Var57, tq8Var58, tq8Var59, tq8Var60, tq8Var61, tq8Var62, tq8Var63, tq8Var64, tq8Var65, tq8Var66, tq8Var67, tq8Var68, tq8Var69, tq8Var70, tq8Var71, tq8Var72, tq8Var73, tq8Var74, tq8Var75, tq8Var76, tq8Var77, tq8Var78, tq8Var79, tq8Var80, tq8Var81, tq8Var82, tq8Var83, tq8Var84, tq8Var85, tq8Var86, tq8Var87, tq8Var88, tq8Var89, tq8Var90, tq8Var91, tq8Var92, tq8Var93, tq8Var94, tq8Var95, tq8Var96, tq8Var97, tq8Var98, tq8Var99, tq8Var100, tq8Var101, tq8Var102, tq8Var103, tq8Var104, tq8Var105, tq8Var106, tq8Var107, tq8Var108, tq8Var109, tq8Var110, tq8Var111, tq8Var112, tq8Var113, tq8Var6, tq8Var115, tq8Var7, tq8Var117, tq8Var8, tq8Var119, tq8Var120, tq8Var121, tq8Var122, tq8Var5, tq8Var9, tq8Var10, tq8Var11, tq8Var12, tq8Var13, tq8Var14, tq8Var15, tq8Var16, tq8Var17, tq8Var18, tq8Var19, tq8Var20, tq8Var21, tq8Var22, tq8Var124, tq8Var125, tq8Var126, tq8Var127, tq8Var128, tq8Var129, tq8Var130, tq8Var131, tq8Var132, tq8Var133, tq8Var134, tq8Var135, tq8Var23, tq8Var136, tq8Var137, tq8Var138, tq8Var139, tq8Var140, tq8Var141, tq8Var142, tq8Var44, tq8Var144, tq8Var145, tq8Var146};
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 0) {
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
            td4.w(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 instanceof tq8) {
                ((tq8) obj2).g = i;
            } else if (obj2 instanceof bc7) {
                ((bc7) obj2).d = i;
            }
            linkedHashSet.add(obj2.toString());
        }
        oc7.d1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i = this.f;
        TLRPC.WebPage webPage = oc7.r1(i).j2;
        this.F = webPage;
        if (webPage != null) {
            this.d.addAll(oc7.r1(i).i2);
        }
        if (this.F == null && !this.G) {
            this.G = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = jb6.M0(2131743925, null);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getWebPage, new r15(this, (byte) 22));
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
                    ((ProfileActivity) this.e).P.d.setText(jb6.M0(2131745211, null));
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
            f();
            return;
        }
        mp3 mp3Var = Utilities.g;
        mn8 mn8Var = new mn8(this, str, (byte) 16);
        this.y = mn8Var;
        mp3Var.d(mn8Var, 300L);
    }

    public final void J() {
        String[] strArr;
        tq8 tq8Var;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            tq8[] tq8VarArr = this.c;
            if (i >= tq8VarArr.length) {
                break;
            }
            tq8 tq8Var2 = tq8VarArr[i];
            if (tq8Var2 != null) {
                hashMap.put(Integer.valueOf(tq8Var2.f), this.c[i]);
            }
            i++;
        }
        Set<String> stringSet = oc7.d1().getStringSet("settingsSearchRecent2", null);
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
                        bc7 bc7Var = new bc7(readString, strArr, serializedData.readString(false));
                        bc7Var.d = readInt32;
                        arrayList.add(bc7Var);
                    } else if (readInt322 == 1 && (tq8Var = (tq8) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        tq8Var.g = readInt32;
                        arrayList.add(tq8Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new qx7(this, (byte) 7));
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
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3 = u69Var.f;
        View view = u69Var.a;
        tq8 tq8Var = null;
        boolean z = true;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    ((jf5) view).setText(jb6.M0(2131745203, null));
                    return;
                }
                return;
            }
            ((l55) view).setText(jb6.M0(2131745216, null));
            return;
        }
        oaa oaaVar = (oaa) view;
        boolean z2 = false;
        if (this.x) {
            int size = this.r.size();
            ArrayList arrayList = this.r;
            if (i < size) {
                tq8 tq8Var2 = (tq8) arrayList.get(i);
                if (i > 0) {
                    tq8Var = (tq8) this.r.get(i - 1);
                }
                if (tq8Var != null && tq8Var.e == tq8Var2.e) {
                    i2 = 0;
                } else {
                    i2 = tq8Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.n.get(i);
                String[] strArr = tq8Var2.d;
                if (i >= this.r.size() - 1) {
                    z = false;
                }
                oaaVar.b(charSequence, strArr, i2, z);
                return;
            }
            int k = ts2.k(1, i, arrayList);
            CharSequence charSequence2 = (CharSequence) this.n.get(this.r.size() + k);
            String[] strArr2 = ((bc7) this.s.get(k)).b;
            if (k < this.r.size() - 1) {
                z2 = true;
            }
            oaaVar.a(charSequence2, strArr2, true, z2);
            return;
        }
        ArrayList arrayList2 = this.w;
        if (!arrayList2.isEmpty()) {
            i--;
        }
        if (i < arrayList2.size()) {
            Object obj = arrayList2.get(i);
            if (obj instanceof tq8) {
                tq8 tq8Var3 = (tq8) obj;
                String str = tq8Var3.a;
                String[] strArr3 = tq8Var3.d;
                if (i >= arrayList2.size() - 1) {
                    z = false;
                }
                oaaVar.a(str, strArr3, false, z);
                return;
            } else if (obj instanceof bc7) {
                bc7 bc7Var = (bc7) obj;
                String str2 = bc7Var.a;
                String[] strArr4 = bc7Var.b;
                if (i < arrayList2.size() - 1) {
                    z2 = true;
                }
                oaaVar.a(str2, strArr4, true, z2);
                return;
            } else {
                return;
            }
        }
        int k2 = ts2.k(1, i, arrayList2);
        bc7 bc7Var2 = (bc7) this.d.get(k2);
        String str3 = bc7Var2.a;
        String[] strArr5 = bc7Var2.b;
        if (k2 < arrayList2.size() - 1) {
            z2 = true;
        }
        oaaVar.a(str3, strArr5, true, z2);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View oaaVar;
        Context context = this.h;
        if (i != 0) {
            if (i != 1) {
                oaaVar = new jf5(context, 16);
            } else {
                oaaVar = new l55(context, null);
            }
        } else {
            oaaVar = new oaa(context);
        }
        oaaVar.setLayoutParams(new g69(-1, -2));
        return new u69(oaaVar);
    }
}
