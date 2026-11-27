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
import org.telegram.ui.ActionBar.e;
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
public class fs8 extends c79 {
    public String E;
    public TLRPC.WebPage F;
    public boolean G;
    public es8[] c;
    public final e e;
    public final int f;
    public final Context h;
    public boolean x;
    public ep8 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public fs8(e eVar, Context context) {
        this.e = eVar;
        this.f = eVar.getCurrentAccount();
        this.h = context;
        this.c = H(eVar);
        J();
    }

    public static boolean F(int i, int i2) {
        if (uc7.s1(i).M3() && !yac.h(i).p()) {
            return false;
        }
        if (i2 != -1 && uc7.s1(i).E0.get(i2, -1) == -1) {
            return false;
        }
        return true;
    }

    public static es8[] H(final e eVar) {
        es8 es8Var;
        es8 es8Var2;
        es8 es8Var3;
        es8 es8Var4;
        es8 es8Var5;
        es8 es8Var6;
        es8 es8Var7;
        es8 es8Var8;
        es8 es8Var9;
        es8 es8Var10;
        es8 es8Var11;
        es8 es8Var12;
        es8 es8Var13;
        es8 es8Var14;
        es8 es8Var15;
        es8 es8Var16;
        es8 es8Var17;
        es8 es8Var18;
        es8 es8Var19;
        es8 es8Var20;
        es8 es8Var21;
        es8 es8Var22;
        es8 es8Var23;
        final int currentAccount = eVar.getCurrentAccount();
        es8 es8Var24 = new es8(500, ob6.L0(2131751229), 0, new ep8(eVar, eVar.getResourceProvider(), (byte) 12));
        es8 es8Var25 = new es8(501, ob6.L0(2131752518), 0, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var25.h = "tg://settings/edit/change-number";
        es8 es8Var26 = new es8(502, ob6.L0(2131754461), 0, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var26.h = "tg://settings/edit/add-account";
        es8 es8Var27 = new es8(1, ob6.L0(2131747649), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var27.h = "tg://settings/notifications";
        es8 es8Var28 = new es8(2, ob6.L0(2131747605), ob6.L0(2131747649), 2131232267, new ds8(eVar, (byte) 3));
        es8Var28.h = "tg://settings/notifications/private-chats";
        es8 es8Var29 = new es8(3, ob6.L0(2131747634), ob6.L0(2131747649), 2131232267, new ds8(eVar, (byte) 15));
        es8Var29.h = "tg://settings/notifications/groups";
        es8 es8Var30 = new es8(4, ob6.L0(2131747648), ob6.L0(2131747649), 2131232267, new yv1(eVar, (byte) 11));
        es8Var30.h = "tg://settings/notifications/channels";
        es8 es8Var31 = new es8(5, ob6.L0(2131742931), "callsSectionRow", ob6.L0(2131747649), 2131232267, new yv1(eVar, (byte) 23));
        es8 es8Var32 = new es8(6, ob6.L0(2131753726), "badgeNumberSection", ob6.L0(2131747649), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var33 = new es8(7, ob6.L0(2131748973), "inappSectionRow", ob6.L0(2131747649), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var34 = new es8(8, ob6.L0(2131751755), "contactJoinedRow", ob6.L0(2131747649), 2131232267, new yv1(eVar, (byte) 27));
        es8Var34.h = "tg://settings/notifications/new-contacts";
        es8 es8Var35 = new es8(9, ob6.L0(2131746955), "pinnedMessageRow", ob6.L0(2131747649), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8Var35.h = "tg://settings/notifications/pinned-messages";
        es8 es8Var36 = new es8(10, ob6.L0(2131745839), "resetNotificationsRow", ob6.L0(2131747649), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var36.h = "tg://settings/notifications/reset";
        es8 es8Var37 = new es8(11, ob6.L0(2131747603), "notificationsServiceRow", ob6.L0(2131747649), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8 es8Var38 = new es8(12, ob6.L0(2131747602), "notificationsServiceConnectionRow", ob6.L0(2131747649), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8 es8Var39 = new es8(13, ob6.L0(2131746002), "repeatRow", ob6.L0(2131747649), 2131232267, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8 es8Var40 = new es8(100, ob6.L0(2131746500), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var40.h = "tg://settings/privacy";
        es8 es8Var41 = new es8(109, ob6.L0(2131743593), ob6.L0(2131746500), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var41.h = "tg://settings/privacy/2sv";
        es8 es8Var42 = new es8(124, ob6.L0(2131753843), ob6.L0(2131746500), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                e eVar2 = eVar;
                int i = currentAccount;
                switch (b) {
                    case 0:
                        if (yac.h(i).q0 >= 0) {
                            eVar2.presentFragment(new x60());
                            return;
                        }
                        return;
                    default:
                        if (!yac.h(i).p()) {
                            d31 b0 = d31.b0(eVar2);
                            b0.getClass();
                            c21 c21Var = new c21(b0.X(), null);
                            c21Var.h(2131624342, new String[0]);
                            String M0 = ob6.M0(2131746484, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new a31(b0, (byte) 0), indexOf, lastIndexOf - 1, 33);
                            }
                            c21Var.b.setText(spannableStringBuilder);
                            c21Var.b.setSingleLine(false);
                            c21Var.b.setMaxLines(2);
                            b0.b(c21Var, 2750).j();
                            return;
                        }
                        eVar2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        es8Var42.h = "tg://settings/privacy/auto-delete";
        es8 es8Var43 = new es8(108, ob6.L0(2131747384), ob6.L0(2131746500), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var43.h = "tg://settings/privacy/passcode";
        es8 es8Var44 = null;
        if (xea.i1) {
            es8Var = es8Var41;
            es8Var2 = new es8(125, ob6.L0(2131751167), "emailLoginRow", ob6.L0(2131746500), 2131232040, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                            q86 q86Var = new q86();
                            eVar2.presentFragment(q86Var);
                            q86Var.a0(28700);
                            q86Var.Z(8200);
                            return;
                        case 1:
                            q86 q86Var2 = new q86();
                            eVar2.presentFragment(q86Var2);
                            q86Var2.a0(28700);
                            q86Var2.Z(4112);
                            return;
                        case 2:
                            q86 q86Var3 = new q86();
                            eVar2.presentFragment(q86Var3);
                            q86Var3.Z(360928);
                            return;
                        case 3:
                            q86 q86Var4 = new q86();
                            eVar2.presentFragment(q86Var4);
                            q86Var4.a0(360928);
                            q86Var4.Z(32);
                            return;
                        case 4:
                            q86 q86Var5 = new q86();
                            eVar2.presentFragment(q86Var5);
                            q86Var5.a0(360928);
                            q86Var5.Z(64);
                            return;
                        case 5:
                            q86 q86Var6 = new q86();
                            eVar2.presentFragment(q86Var6);
                            q86Var6.a0(360928);
                            q86Var6.Z(128);
                            return;
                        case 6:
                            eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            q86 q86Var7 = new q86();
                            eVar2.presentFragment(q86Var7);
                            q86Var7.a0(360928);
                            q86Var7.Z(256);
                            return;
                        case 8:
                            q86 q86Var8 = new q86();
                            eVar2.presentFragment(q86Var8);
                            q86Var8.a0(360928);
                            q86Var8.Z(32768);
                            return;
                        case 9:
                            q86 q86Var9 = new q86();
                            eVar2.presentFragment(q86Var9);
                            q86Var9.Z(512);
                            return;
                        case 10:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            q86 q86Var10 = new q86();
                            eVar2.presentFragment(q86Var10);
                            q86Var10.Z(1024);
                            return;
                        case 12:
                            q86 q86Var11 = new q86();
                            eVar2.presentFragment(q86Var11);
                            q86Var11.Z(2048);
                            return;
                        case 13:
                            q86 q86Var12 = new q86();
                            eVar2.presentFragment(q86Var12);
                            while (true) {
                                ArrayList arrayList = q86Var12.s;
                                if (i < arrayList.size()) {
                                    if (((k86) arrayList.get(i)).f) {
                                        q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                        return;
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        case 14:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 15:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 17:
                            xk8 xk8Var = new xk8(eVar2, 0, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 18:
                            eVar2.showDialog(jj.R(eVar2, null));
                            return;
                        case 19:
                            m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                            return;
                        case 20:
                            m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                            return;
                        case 21:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 23:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 24:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 25:
                            eVar2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 26:
                            eVar2.presentFragment(PasscodeActivity.m0());
                            return;
                        case 27:
                            xk8 xk8Var2 = new xk8(eVar2, 11, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 28:
                            eVar2.presentFragment(new v8(3));
                            return;
                        default:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                    }
                }
            });
            es8Var2.h = "tg://settings/privacy/login-email";
        } else {
            es8Var = es8Var41;
            es8Var2 = null;
        }
        es8 es8Var45 = new es8(101, ob6.L0(2131753674), ob6.L0(2131746500), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var45.h = "tg://settings/privacy/blocked";
        es8 es8Var46 = new es8(110, ob6.L0(2131745279), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var46.h = "tg://settings/devices";
        es8 es8Var47 = new es8(105, ob6.L0(2131746519), ob6.L0(2131746500), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var47.h = "tg://settings/privacy/phone-number/";
        es8 es8Var48 = new es8(102, ob6.L0(2131746544), ob6.L0(2131746500), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var48.h = "tg://settings/privacy/last-seen";
        es8 es8Var49 = new es8(103, ob6.L0(2131746506), ob6.L0(2131746500), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var49.h = "tg://settings/privacy/profile-photos";
        es8 es8Var50 = new es8(104, ob6.L0(2131746566), ob6.L0(2131746500), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var50.h = "tg://settings/privacy/forwards";
        es8 es8Var51 = new es8(122, ob6.L0(2131746529), ob6.L0(2131746500), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var51.h = "tg://settings/privacy/calls/p2p";
        es8 es8Var52 = new es8(106, ob6.L0(2131752577), ob6.L0(2131746500), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var52.h = "tg://settings/privacy/calls";
        es8 es8Var53 = new es8(107, ob6.L0(2131746546), ob6.L0(2131746500), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var53.h = "tg://settings/privacy/invites";
        es8 es8Var54 = new es8(123, ob6.L0(2131746487), ob6.L0(2131746500), 2131232360, new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                e eVar2 = eVar;
                int i = currentAccount;
                switch (b) {
                    case 0:
                        if (yac.h(i).q0 >= 0) {
                            eVar2.presentFragment(new x60());
                            return;
                        }
                        return;
                    default:
                        if (!yac.h(i).p()) {
                            d31 b0 = d31.b0(eVar2);
                            b0.getClass();
                            c21 c21Var = new c21(b0.X(), null);
                            c21Var.h(2131624342, new String[0]);
                            String M0 = ob6.M0(2131746484, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new a31(b0, (byte) 0), indexOf, lastIndexOf - 1, 33);
                            }
                            c21Var.b.setText(spannableStringBuilder);
                            c21Var.b.setSingleLine(false);
                            c21Var.b.setMaxLines(2);
                            b0.b(c21Var, 2750).j();
                            return;
                        }
                        eVar2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        es8Var54.h = "tg://settings/privacy/voice";
        if (uc7.s1(currentAccount).l4.T0.f()) {
            es8Var3 = es8Var54;
            es8Var4 = new es8(121, ob6.L0(2131754164), "newChatsRow", ob6.L0(2131746500), 2131232040, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                            vn8 vn8Var = new vn8();
                            vn8Var.getMessagesController().F0(true);
                            eVar2.presentFragment(vn8Var);
                            return;
                        case 1:
                            eVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 2:
                            eVar2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 3:
                            eVar2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 4:
                            eVar2.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 5:
                            eVar2.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 6:
                            eVar2.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 7:
                            eVar2.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 8:
                            xk8 xk8Var = new xk8(eVar2, 1, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 9:
                            eVar2.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 10:
                            break;
                        case 11:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            eVar2.presentFragment(new SessionsActivity(1));
                            return;
                        case 15:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            xk8 xk8Var2 = new xk8(eVar2, 2, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 19:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 20:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            eVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 23:
                            eVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 24:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            eVar2.presentFragment(sessionsActivity);
                            return;
                        case 25:
                            eVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 26:
                            eVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 27:
                            eVar2.presentFragment(new z61());
                            return;
                        case 28:
                            eVar2.presentFragment(new z61());
                            return;
                        default:
                            xk8 xk8Var3 = new xk8(eVar2, 8, false);
                            xk8Var3.G0();
                            eVar2.showDialog(xk8Var3);
                            return;
                    }
                    while (true) {
                        if (i < 4) {
                            if (yac.h(i).o()) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        eVar2.presentFragment(new qh6(i));
                    }
                }
            });
            es8Var4.h = "tg://settings/privacy/archive-and-mute";
        } else {
            es8Var3 = es8Var54;
            es8Var4 = null;
        }
        es8 es8Var55 = new es8(112, ob6.L0(2131751561), "deleteAccountRow", ob6.L0(2131746500), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var55.h = "tg://settings/privacy/self-destruct";
        es8 es8Var56 = new es8(113, ob6.L0(2131746526), "paymentsClearRow", ob6.L0(2131746500), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var56.h = "tg://settings/privacy/data-settings/clear-payment-info";
        es8 es8Var57 = new es8(114, ob6.L0(2131742542), ob6.L0(2131746500), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var57.h = "tg://settings/privacy/active-websites";
        es8 es8Var58 = new es8(115, ob6.L0(2131743949), "contactsDeleteRow", ob6.L0(2131746500), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var58.h = "tg://settings/privacy/data-settings/delete-synced";
        es8 es8Var59 = new es8(116, ob6.L0(2131743951), "contactsSyncRow", ob6.L0(2131746500), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var59.h = "tg://settings/privacy/data-settings/sync-contacts";
        es8 es8Var60 = new es8(117, ob6.L0(2131744065), "contactsSuggestRow", ob6.L0(2131746500), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var60.h = "tg://settings/privacy/data-settings/suggest-contacts";
        es8 es8Var61 = new es8(118, ob6.L0(2131748443), "secretMapRow", ob6.L0(2131746500), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var61.h = "tg://settings/privacy/data-settings/map-provider";
        es8 es8Var62 = new es8(119, ob6.L0(2131745412), "secretWebpageRow", ob6.L0(2131746500), 2131232040, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var62.h = "tg://settings/privacy/data-settings/link-previews";
        es8 es8Var63 = new es8(120, ob6.L0(2131751420), 2131232028, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var63.h = "tg://settings/devices";
        es8 es8Var64 = new es8(121, ob6.L0(2131743861), "terminateAllSessionsRow", ob6.L0(2131751420), 2131232028, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var64.h = "tg://settings/devices/terminate-sessions";
        es8 es8Var65 = new es8(122, ob6.L0(2131748671), ob6.L0(2131751420), 2131232028, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var65.h = "tg://settings/devices/link-desktop";
        es8 es8Var66 = new es8(200, ob6.L0(2131751642), 2131232027, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var66.h = "tg://settings/privacy/data-settings";
        es8 es8Var67 = new es8(201, ob6.L0(2131751641), "usageSectionRow", ob6.L0(2131751642), 2131232027, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8 es8Var68 = new es8(202, ob6.L0(2131744473), ob6.L0(2131751642), 2131232027, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8Var68.h = "tg://settings/data/storage";
        es8 es8Var69 = new es8(203, ob6.L0(2131748814), "keepMediaRow", ob6.L0(2131751642), ob6.L0(2131744473), 2131232027, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        vn8 vn8Var = new vn8();
                        vn8Var.getMessagesController().F0(true);
                        eVar2.presentFragment(vn8Var);
                        return;
                    case 1:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        eVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        eVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        eVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        eVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        eVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        eVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 1, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        eVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 2, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        eVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        eVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        eVar2.presentFragment(new z61());
                        return;
                    case 28:
                        eVar2.presentFragment(new z61());
                        return;
                    default:
                        xk8 xk8Var3 = new xk8(eVar2, 8, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                }
                while (true) {
                    if (i < 4) {
                        if (yac.h(i).o()) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                if (i >= 0) {
                    eVar2.presentFragment(new qh6(i));
                }
            }
        });
        es8 es8Var70 = new es8(204, ob6.L0(2131752040), "cacheRow", ob6.L0(2131751642), ob6.L0(2131744473), 2131232027, new ds8(eVar, (byte) 0));
        es8 es8Var71 = new es8(205, ob6.L0(2131748528), "databaseRow", ob6.L0(2131751642), ob6.L0(2131744473), 2131232027, new ds8(eVar, (byte) 1));
        es8 es8Var72 = new es8(206, ob6.L0(2131748052), ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 2));
        es8Var72.h = "tg://settings/data/usage";
        es8 es8Var73 = new es8(207, ob6.L0(2131753760), "mediaDownloadSectionRow", ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 4));
        es8 es8Var74 = new es8(208, ob6.L0(2131742515), ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 5));
        es8 es8Var75 = new es8(209, ob6.L0(2131742517), ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 6));
        es8 es8Var76 = new es8(210, ob6.L0(2131742516), ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 7));
        es8 es8Var77 = new es8(211, ob6.L0(2131745838), "resetDownloadRow", ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 8));
        es8Var77.h = "tg://settings/data/auto-download/reset";
        es8 es8Var78 = new es8(215, ob6.L0(2131744091), "streamSectionRow", ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 9));
        es8 es8Var79 = new es8(216, ob6.L0(2131751109), "enableStreamRow", ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 11));
        es8 es8Var80 = new es8(217, ob6.L0(2131752577), "callsSectionRow", ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 12));
        es8 es8Var81 = new es8(218, ob6.L0(2131742881), "useLessDataForCallsRow", ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 13));
        es8Var81.h = "tg://settings/data/use-less-data";
        es8 es8Var82 = new es8(219, ob6.L0(2131742910), "quickRepliesRow", ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 14));
        es8 es8Var83 = new es8(220, ob6.L0(2131746328), ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 16));
        es8Var83.h = "tg://settings/data/proxy";
        es8 es8Var84 = new es8(111, ob6.L0(2131746570), "clearDraftsRow", ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 17));
        es8Var84.h = "tg://settings/privacy/data-settings/delete-cloud-drafts";
        es8 es8Var85 = new es8(222, ob6.L0(2131745657), "saveToGallerySectionRow", ob6.L0(2131751642), 2131232027, new ds8(eVar, (byte) 18));
        es8 es8Var86 = new es8(223, ob6.L0(2131745647), "saveToGalleryPeerRow", ob6.L0(2131751642), ob6.L0(2131745657), 2131232027, new ds8(eVar, (byte) 19));
        es8Var86.h = "tg://settings/data/save-to-photos/chats";
        es8 es8Var87 = new es8(224, ob6.L0(2131745654), "saveToGalleryGroupsRow", ob6.L0(2131751642), ob6.L0(2131745657), 2131232027, new ds8(eVar, (byte) 20));
        es8Var87.h = "tg://settings/data/save-to-photos/groups";
        es8 es8Var88 = new es8(225, ob6.L0(2131745656), "saveToGalleryChannelsRow", ob6.L0(2131751642), ob6.L0(2131745657), 2131232027, new yv1(eVar, (byte) 6));
        es8Var88.h = "tg://settings/data/save-to-photos/channels";
        es8 es8Var89 = new es8(300, ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 7));
        es8Var89.h = "tg://settings/appearance/themes";
        es8 es8Var90 = new es8(301, ob6.L0(2131743844), "textSizeHeaderRow", ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 8));
        es8Var90.h = "tg://settings/appearance/text-size";
        es8 es8Var91 = new es8(302, ob6.L0(2131752531), ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 9));
        es8Var91.h = "tg://settings/appearance/wallpapers";
        es8 es8Var92 = new es8(303, ob6.L0(2131745266), null, ob6.L0(2131752175), ob6.L0(2131752209), 2131232029, new yv1(eVar, (byte) 10));
        es8 es8Var93 = new es8(304, ob6.L0(2131745835), "resetRow", ob6.L0(2131752175), ob6.L0(2131752209), 2131232029, new yv1(eVar, (byte) 12));
        es8 es8Var94 = new es8(306, ob6.L0(2131751976), "themeHeaderRow", ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 13));
        es8 es8Var95 = new es8(319, ob6.L0(2131752859), null, ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 14));
        es8 es8Var96 = new es8(320, ob6.L0(2131751677), "createNewThemeRow", ob6.L0(2131752175), ob6.L0(2131752859), 2131232029, new yv1(eVar, (byte) 15));
        es8Var96.h = "tg://settings/appearance/themes/create";
        es8 es8Var97 = new es8(321, ob6.L0(2131752821), "bubbleRadiusHeaderRow", ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 17));
        es8Var97.h = "tg://settings/appearance/message-corners";
        es8 es8Var98 = new es8(322, ob6.L0(2131752190), "chatListHeaderRow", ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 18));
        es8 es8Var99 = new es8(323, ob6.L0(2131752187), "swipeGestureHeaderRow", ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 19));
        es8 es8Var100 = new es8(324, ob6.L0(2131754233), "appIconHeaderRow", ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 20));
        es8Var100.h = "tg://settings/appearance/app-icon";
        es8 es8Var101 = new es8(305, ob6.L0(2131753777), ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 21));
        es8 es8Var102 = new es8(328, ob6.L0(2131747980), "nextMediaTapRow", ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 22));
        es8Var102.h = "tg://settings/appearance/tap-for-next-media";
        es8 es8Var103 = new es8(327, ob6.L0(2131746154), "raiseToListenRow", ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 24));
        es8Var103.h = "tg://settings/data/raise-to-listen";
        es8 es8Var104 = new es8(310, ob6.L0(2131746152), "raiseToSpeakRow", ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 25));
        es8Var104.h = "tg://settings/data/raise-to-speak";
        es8 es8Var105 = new es8(326, ob6.L0(2131747159), "pauseOnMediaRow", ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 26));
        es8Var105.h = "tg://settings/data/pause-music";
        es8 es8Var106 = new es8(325, ob6.L0(2131748193), "bluetoothScoRow", ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 28));
        es8 es8Var107 = new es8(308, ob6.L0(2131751403), "directShareRow", ob6.L0(2131752175), 2131232029, new yv1(eVar, (byte) 29));
        es8 es8Var108 = new es8(311, ob6.L0(2131745360), "sendByEnterRow", ob6.L0(2131752175), 2131232029, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var109 = new es8(318, ob6.L0(2131751332), "distanceRow", ob6.L0(2131752175), 2131232029, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var110 = new es8(600, ob6.L0(2131744514), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8Var110.h = "tg://settings/appearance/stickers-and-emoji";
        es8 es8Var111 = new es8(601, ob6.L0(2131744055), "suggestRow", ob6.L0(2131744514), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var112 = new es8(602, ob6.L0(2131750798), "featuredStickersHeaderRow", ob6.L0(2131744514), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var113 = new es8(603, ob6.L0(2131748433), null, ob6.L0(2131744514), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var114 = new es8(604, ob6.L0(2131754121), null, ob6.L0(2131744514), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8Var114.h = "tg://settings/appearance/stickers-and-emoji/archived";
        es8 es8Var115 = new es8(605, ob6.L0(2131754126), null, ob6.L0(2131744514), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var116 = new es8(606, ob6.L0(2131748788), "largeEmojiRow", ob6.L0(2131744514), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8Var116.h = "tg://settings/appearance/stickers-and-emoji/emoji/large";
        es8 es8Var117 = new es8(607, ob6.L0(2131748476), null, ob6.L0(2131746795), ob6.L0(2131748604), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var118 = new es8(608, ob6.L0(2131751161), null, ob6.L0(2131744514), 2131231516, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8Var118.h = "tg://settings/appearance/stickers-and-emoji/emoji";
        es8 es8Var119 = new es8(609, ob6.L0(2131744069), "suggestAnimatedEmojiRow", ob6.L0(2131744514), ob6.L0(2131751161), 2131231516, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8Var119.h = "tg://settings/appearance/stickers-and-emoji/emoji/suggest";
        es8 es8Var120 = new es8(610, ob6.L0(2131750800), "featuredStickersHeaderRow", ob6.L0(2131744514), ob6.L0(2131751161), 2131231516, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var121 = new es8(611, ob6.L0(2131751315), null, ob6.L0(2131744514), 2131232043, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8Var121.h = "tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction";
        es8 es8Var122 = new es8(700, ob6.L0(2131750656), null, 2131232031, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8Var122.h = "tg://settings/folders";
        es8 es8Var123 = new es8(701, ob6.L0(2131751681), "createFilterRow", ob6.L0(2131750656), 2131232031, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8Var123.h = "tg://settings/folders/create";
        if (F(currentAccount, -1)) {
            es8Var5 = es8Var123;
            es8Var6 = es8Var114;
            es8Var7 = es8Var116;
            es8Var8 = es8Var118;
            es8Var9 = new es8(800, ob6.L0(2131743884), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                            q86 q86Var = new q86();
                            eVar2.presentFragment(q86Var);
                            q86Var.a0(28700);
                            q86Var.Z(8200);
                            return;
                        case 1:
                            q86 q86Var2 = new q86();
                            eVar2.presentFragment(q86Var2);
                            q86Var2.a0(28700);
                            q86Var2.Z(4112);
                            return;
                        case 2:
                            q86 q86Var3 = new q86();
                            eVar2.presentFragment(q86Var3);
                            q86Var3.Z(360928);
                            return;
                        case 3:
                            q86 q86Var4 = new q86();
                            eVar2.presentFragment(q86Var4);
                            q86Var4.a0(360928);
                            q86Var4.Z(32);
                            return;
                        case 4:
                            q86 q86Var5 = new q86();
                            eVar2.presentFragment(q86Var5);
                            q86Var5.a0(360928);
                            q86Var5.Z(64);
                            return;
                        case 5:
                            q86 q86Var6 = new q86();
                            eVar2.presentFragment(q86Var6);
                            q86Var6.a0(360928);
                            q86Var6.Z(128);
                            return;
                        case 6:
                            eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            q86 q86Var7 = new q86();
                            eVar2.presentFragment(q86Var7);
                            q86Var7.a0(360928);
                            q86Var7.Z(256);
                            return;
                        case 8:
                            q86 q86Var8 = new q86();
                            eVar2.presentFragment(q86Var8);
                            q86Var8.a0(360928);
                            q86Var8.Z(32768);
                            return;
                        case 9:
                            q86 q86Var9 = new q86();
                            eVar2.presentFragment(q86Var9);
                            q86Var9.Z(512);
                            return;
                        case 10:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            q86 q86Var10 = new q86();
                            eVar2.presentFragment(q86Var10);
                            q86Var10.Z(1024);
                            return;
                        case 12:
                            q86 q86Var11 = new q86();
                            eVar2.presentFragment(q86Var11);
                            q86Var11.Z(2048);
                            return;
                        case 13:
                            q86 q86Var12 = new q86();
                            eVar2.presentFragment(q86Var12);
                            while (true) {
                                ArrayList arrayList = q86Var12.s;
                                if (i < arrayList.size()) {
                                    if (((k86) arrayList.get(i)).f) {
                                        q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                        return;
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        case 14:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 15:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 17:
                            xk8 xk8Var = new xk8(eVar2, 0, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 18:
                            eVar2.showDialog(jj.R(eVar2, null));
                            return;
                        case 19:
                            m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                            return;
                        case 20:
                            m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                            return;
                        case 21:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 23:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 24:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 25:
                            eVar2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 26:
                            eVar2.presentFragment(PasscodeActivity.m0());
                            return;
                        case 27:
                            xk8 xk8Var2 = new xk8(eVar2, 11, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 28:
                            eVar2.presentFragment(new v8(3));
                            return;
                        default:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                    }
                }
            });
        } else {
            es8Var5 = es8Var123;
            es8Var6 = es8Var114;
            es8Var7 = es8Var116;
            es8Var8 = es8Var118;
            es8Var9 = null;
        }
        if (F(currentAccount, 0)) {
            es8Var10 = new es8(801, ob6.L0(2131746727), ob6.L0(2131743884), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                            q86 q86Var = new q86();
                            eVar2.presentFragment(q86Var);
                            q86Var.a0(28700);
                            q86Var.Z(8200);
                            return;
                        case 1:
                            q86 q86Var2 = new q86();
                            eVar2.presentFragment(q86Var2);
                            q86Var2.a0(28700);
                            q86Var2.Z(4112);
                            return;
                        case 2:
                            q86 q86Var3 = new q86();
                            eVar2.presentFragment(q86Var3);
                            q86Var3.Z(360928);
                            return;
                        case 3:
                            q86 q86Var4 = new q86();
                            eVar2.presentFragment(q86Var4);
                            q86Var4.a0(360928);
                            q86Var4.Z(32);
                            return;
                        case 4:
                            q86 q86Var5 = new q86();
                            eVar2.presentFragment(q86Var5);
                            q86Var5.a0(360928);
                            q86Var5.Z(64);
                            return;
                        case 5:
                            q86 q86Var6 = new q86();
                            eVar2.presentFragment(q86Var6);
                            q86Var6.a0(360928);
                            q86Var6.Z(128);
                            return;
                        case 6:
                            eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            q86 q86Var7 = new q86();
                            eVar2.presentFragment(q86Var7);
                            q86Var7.a0(360928);
                            q86Var7.Z(256);
                            return;
                        case 8:
                            q86 q86Var8 = new q86();
                            eVar2.presentFragment(q86Var8);
                            q86Var8.a0(360928);
                            q86Var8.Z(32768);
                            return;
                        case 9:
                            q86 q86Var9 = new q86();
                            eVar2.presentFragment(q86Var9);
                            q86Var9.Z(512);
                            return;
                        case 10:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            q86 q86Var10 = new q86();
                            eVar2.presentFragment(q86Var10);
                            q86Var10.Z(1024);
                            return;
                        case 12:
                            q86 q86Var11 = new q86();
                            eVar2.presentFragment(q86Var11);
                            q86Var11.Z(2048);
                            return;
                        case 13:
                            q86 q86Var12 = new q86();
                            eVar2.presentFragment(q86Var12);
                            while (true) {
                                ArrayList arrayList = q86Var12.s;
                                if (i < arrayList.size()) {
                                    if (((k86) arrayList.get(i)).f) {
                                        q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                        return;
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        case 14:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 15:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 17:
                            xk8 xk8Var = new xk8(eVar2, 0, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 18:
                            eVar2.showDialog(jj.R(eVar2, null));
                            return;
                        case 19:
                            m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                            return;
                        case 20:
                            m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                            return;
                        case 21:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 23:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 24:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 25:
                            eVar2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 26:
                            eVar2.presentFragment(PasscodeActivity.m0());
                            return;
                        case 27:
                            xk8 xk8Var2 = new xk8(eVar2, 11, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 28:
                            eVar2.presentFragment(new v8(3));
                            return;
                        default:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                    }
                }
            });
        } else {
            es8Var10 = null;
        }
        if (F(currentAccount, 11)) {
            es8Var11 = new es8(802, ob6.L0(2131746736), ob6.L0(2131743884), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                            q86 q86Var = new q86();
                            eVar2.presentFragment(q86Var);
                            q86Var.a0(28700);
                            q86Var.Z(8200);
                            return;
                        case 1:
                            q86 q86Var2 = new q86();
                            eVar2.presentFragment(q86Var2);
                            q86Var2.a0(28700);
                            q86Var2.Z(4112);
                            return;
                        case 2:
                            q86 q86Var3 = new q86();
                            eVar2.presentFragment(q86Var3);
                            q86Var3.Z(360928);
                            return;
                        case 3:
                            q86 q86Var4 = new q86();
                            eVar2.presentFragment(q86Var4);
                            q86Var4.a0(360928);
                            q86Var4.Z(32);
                            return;
                        case 4:
                            q86 q86Var5 = new q86();
                            eVar2.presentFragment(q86Var5);
                            q86Var5.a0(360928);
                            q86Var5.Z(64);
                            return;
                        case 5:
                            q86 q86Var6 = new q86();
                            eVar2.presentFragment(q86Var6);
                            q86Var6.a0(360928);
                            q86Var6.Z(128);
                            return;
                        case 6:
                            eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            q86 q86Var7 = new q86();
                            eVar2.presentFragment(q86Var7);
                            q86Var7.a0(360928);
                            q86Var7.Z(256);
                            return;
                        case 8:
                            q86 q86Var8 = new q86();
                            eVar2.presentFragment(q86Var8);
                            q86Var8.a0(360928);
                            q86Var8.Z(32768);
                            return;
                        case 9:
                            q86 q86Var9 = new q86();
                            eVar2.presentFragment(q86Var9);
                            q86Var9.Z(512);
                            return;
                        case 10:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            q86 q86Var10 = new q86();
                            eVar2.presentFragment(q86Var10);
                            q86Var10.Z(1024);
                            return;
                        case 12:
                            q86 q86Var11 = new q86();
                            eVar2.presentFragment(q86Var11);
                            q86Var11.Z(2048);
                            return;
                        case 13:
                            q86 q86Var12 = new q86();
                            eVar2.presentFragment(q86Var12);
                            while (true) {
                                ArrayList arrayList = q86Var12.s;
                                if (i < arrayList.size()) {
                                    if (((k86) arrayList.get(i)).f) {
                                        q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                        return;
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        case 14:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 15:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 17:
                            xk8 xk8Var = new xk8(eVar2, 0, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 18:
                            eVar2.showDialog(jj.R(eVar2, null));
                            return;
                        case 19:
                            m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                            return;
                        case 20:
                            m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                            return;
                        case 21:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 23:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 24:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 25:
                            eVar2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 26:
                            eVar2.presentFragment(PasscodeActivity.m0());
                            return;
                        case 27:
                            xk8 xk8Var2 = new xk8(eVar2, 11, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 28:
                            eVar2.presentFragment(new v8(3));
                            return;
                        default:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                    }
                }
            });
        } else {
            es8Var11 = null;
        }
        if (F(currentAccount, 1)) {
            es8Var12 = new es8(803, ob6.L0(2131746693), ob6.L0(2131743884), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                            vn8 vn8Var = new vn8();
                            vn8Var.getMessagesController().F0(true);
                            eVar2.presentFragment(vn8Var);
                            return;
                        case 1:
                            eVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 2:
                            eVar2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 3:
                            eVar2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 4:
                            eVar2.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 5:
                            eVar2.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 6:
                            eVar2.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 7:
                            eVar2.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 8:
                            xk8 xk8Var = new xk8(eVar2, 1, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 9:
                            eVar2.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 10:
                            break;
                        case 11:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            eVar2.presentFragment(new SessionsActivity(1));
                            return;
                        case 15:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            xk8 xk8Var2 = new xk8(eVar2, 2, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 19:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 20:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            eVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 23:
                            eVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 24:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            eVar2.presentFragment(sessionsActivity);
                            return;
                        case 25:
                            eVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 26:
                            eVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 27:
                            eVar2.presentFragment(new z61());
                            return;
                        case 28:
                            eVar2.presentFragment(new z61());
                            return;
                        default:
                            xk8 xk8Var3 = new xk8(eVar2, 8, false);
                            xk8Var3.G0();
                            eVar2.showDialog(xk8Var3);
                            return;
                    }
                    while (true) {
                        if (i < 4) {
                            if (yac.h(i).o()) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        eVar2.presentFragment(new qh6(i));
                    }
                }
            });
        } else {
            es8Var12 = null;
        }
        if (F(currentAccount, 2)) {
            es8Var13 = new es8(804, ob6.L0(2131746741), ob6.L0(2131743884), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                            vn8 vn8Var = new vn8();
                            vn8Var.getMessagesController().F0(true);
                            eVar2.presentFragment(vn8Var);
                            return;
                        case 1:
                            eVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 2:
                            eVar2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 3:
                            eVar2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 4:
                            eVar2.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 5:
                            eVar2.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 6:
                            eVar2.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 7:
                            eVar2.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 8:
                            xk8 xk8Var = new xk8(eVar2, 1, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 9:
                            eVar2.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 10:
                            break;
                        case 11:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            eVar2.presentFragment(new SessionsActivity(1));
                            return;
                        case 15:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            xk8 xk8Var2 = new xk8(eVar2, 2, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 19:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 20:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            eVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 23:
                            eVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 24:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            eVar2.presentFragment(sessionsActivity);
                            return;
                        case 25:
                            eVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 26:
                            eVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 27:
                            eVar2.presentFragment(new z61());
                            return;
                        case 28:
                            eVar2.presentFragment(new z61());
                            return;
                        default:
                            xk8 xk8Var3 = new xk8(eVar2, 8, false);
                            xk8Var3.G0();
                            eVar2.showDialog(xk8Var3);
                            return;
                    }
                    while (true) {
                        if (i < 4) {
                            if (yac.h(i).o()) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        eVar2.presentFragment(new qh6(i));
                    }
                }
            });
        } else {
            es8Var13 = null;
        }
        if (F(currentAccount, 8)) {
            es8Var14 = new es8(805, ob6.L0(2131746691), ob6.L0(2131743884), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                            vn8 vn8Var = new vn8();
                            vn8Var.getMessagesController().F0(true);
                            eVar2.presentFragment(vn8Var);
                            return;
                        case 1:
                            eVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 2:
                            eVar2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 3:
                            eVar2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 4:
                            eVar2.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 5:
                            eVar2.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 6:
                            eVar2.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 7:
                            eVar2.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 8:
                            xk8 xk8Var = new xk8(eVar2, 1, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 9:
                            eVar2.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 10:
                            break;
                        case 11:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            eVar2.presentFragment(new SessionsActivity(1));
                            return;
                        case 15:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            xk8 xk8Var2 = new xk8(eVar2, 2, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 19:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 20:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            eVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 23:
                            eVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 24:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            eVar2.presentFragment(sessionsActivity);
                            return;
                        case 25:
                            eVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 26:
                            eVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 27:
                            eVar2.presentFragment(new z61());
                            return;
                        case 28:
                            eVar2.presentFragment(new z61());
                            return;
                        default:
                            xk8 xk8Var3 = new xk8(eVar2, 8, false);
                            xk8Var3.G0();
                            eVar2.showDialog(xk8Var3);
                            return;
                    }
                    while (true) {
                        if (i < 4) {
                            if (yac.h(i).o()) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        eVar2.presentFragment(new qh6(i));
                    }
                }
            });
        } else {
            es8Var14 = null;
        }
        if (F(currentAccount, 3)) {
            es8Var15 = new es8(806, ob6.L0(2131746721), ob6.L0(2131743884), 2131232367, new ds8(eVar, (byte) 10));
        } else {
            es8Var15 = null;
        }
        if (F(currentAccount, 4)) {
            es8Var16 = new es8(807, ob6.L0(2131746712), ob6.L0(2131743884), 2131232367, new ds8(eVar, (byte) 21));
        } else {
            es8Var16 = null;
        }
        if (F(currentAccount, 5)) {
            es8Var17 = new es8(808, ob6.L0(2131746705), ob6.L0(2131743884), 2131232367, new yv1(eVar, (byte) 16));
        } else {
            es8Var17 = null;
        }
        if (F(currentAccount, 9)) {
            es8Var18 = new es8(809, ob6.L0(2131746754), ob6.L0(2131743884), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                        case 1:
                            uh9.o(0, eVar2);
                            return;
                        case 2:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 3:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 5:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 6:
                            eVar2.presentFragment(new StickersActivity(1, null));
                            return;
                        case 7:
                            eVar2.presentFragment(new is(0));
                            return;
                        case 8:
                            xk8 xk8Var = new xk8(eVar2, 9, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 9:
                            eVar2.presentFragment(new is(1));
                            return;
                        case 10:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            q86 q86Var = new q86();
                            eVar2.presentFragment(q86Var);
                            q86Var.a0(3);
                            q86Var.Z(2);
                            return;
                        case 12:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 14:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 15:
                            eVar2.presentFragment(new n49());
                            return;
                        case 16:
                            eVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            xk8 xk8Var2 = new xk8(eVar2, 6, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 19:
                            xk8 xk8Var3 = new xk8(eVar2, 7, false);
                            xk8Var3.G0();
                            eVar2.showDialog(xk8Var3);
                            return;
                        case 20:
                            xk8 xk8Var4 = new xk8(eVar2, 10, false);
                            xk8Var4.G0();
                            eVar2.showDialog(xk8Var4);
                            return;
                        case 21:
                            xk8 xk8Var5 = new xk8(eVar2, 12, false);
                            xk8Var5.G0();
                            eVar2.showDialog(xk8Var5);
                            return;
                        case 22:
                            eVar2.presentFragment(new q86());
                            return;
                        case 23:
                            q86 q86Var2 = new q86();
                            eVar2.presentFragment(q86Var2);
                            q86Var2.Z(3);
                            return;
                        case 24:
                            q86 q86Var3 = new q86();
                            eVar2.presentFragment(q86Var3);
                            q86Var3.a0(3);
                            q86Var3.Z(1);
                            return;
                        case 25:
                            eVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            q86 q86Var4 = new q86();
                            eVar2.presentFragment(q86Var4);
                            q86Var4.a0(3);
                            q86Var4.Z(2);
                            return;
                        case 27:
                            q86 q86Var5 = new q86();
                            eVar2.presentFragment(q86Var5);
                            q86Var5.Z(28700);
                            return;
                        case 28:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            q86 q86Var6 = new q86();
                            eVar2.presentFragment(q86Var6);
                            q86Var6.a0(28700);
                            q86Var6.Z(16388);
                            return;
                    }
                }
            });
        } else {
            es8Var18 = null;
        }
        if (F(currentAccount, 6)) {
            es8Var19 = new es8(810, ob6.L0(2131746716), ob6.L0(2131743884), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                        case 1:
                            uh9.o(0, eVar2);
                            return;
                        case 2:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 3:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 5:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 6:
                            eVar2.presentFragment(new StickersActivity(1, null));
                            return;
                        case 7:
                            eVar2.presentFragment(new is(0));
                            return;
                        case 8:
                            xk8 xk8Var = new xk8(eVar2, 9, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 9:
                            eVar2.presentFragment(new is(1));
                            return;
                        case 10:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            q86 q86Var = new q86();
                            eVar2.presentFragment(q86Var);
                            q86Var.a0(3);
                            q86Var.Z(2);
                            return;
                        case 12:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 14:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 15:
                            eVar2.presentFragment(new n49());
                            return;
                        case 16:
                            eVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            xk8 xk8Var2 = new xk8(eVar2, 6, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 19:
                            xk8 xk8Var3 = new xk8(eVar2, 7, false);
                            xk8Var3.G0();
                            eVar2.showDialog(xk8Var3);
                            return;
                        case 20:
                            xk8 xk8Var4 = new xk8(eVar2, 10, false);
                            xk8Var4.G0();
                            eVar2.showDialog(xk8Var4);
                            return;
                        case 21:
                            xk8 xk8Var5 = new xk8(eVar2, 12, false);
                            xk8Var5.G0();
                            eVar2.showDialog(xk8Var5);
                            return;
                        case 22:
                            eVar2.presentFragment(new q86());
                            return;
                        case 23:
                            q86 q86Var2 = new q86();
                            eVar2.presentFragment(q86Var2);
                            q86Var2.Z(3);
                            return;
                        case 24:
                            q86 q86Var3 = new q86();
                            eVar2.presentFragment(q86Var3);
                            q86Var3.a0(3);
                            q86Var3.Z(1);
                            return;
                        case 25:
                            eVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            q86 q86Var4 = new q86();
                            eVar2.presentFragment(q86Var4);
                            q86Var4.a0(3);
                            q86Var4.Z(2);
                            return;
                        case 27:
                            q86 q86Var5 = new q86();
                            eVar2.presentFragment(q86Var5);
                            q86Var5.Z(28700);
                            return;
                        case 28:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            q86 q86Var6 = new q86();
                            eVar2.presentFragment(q86Var6);
                            q86Var6.a0(28700);
                            q86Var6.Z(16388);
                            return;
                    }
                }
            });
        } else {
            es8Var19 = null;
        }
        if (F(currentAccount, 7)) {
            es8Var20 = new es8(811, ob6.L0(2131746751), ob6.L0(2131743884), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                        case 1:
                            uh9.o(0, eVar2);
                            return;
                        case 2:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 3:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 5:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 6:
                            eVar2.presentFragment(new StickersActivity(1, null));
                            return;
                        case 7:
                            eVar2.presentFragment(new is(0));
                            return;
                        case 8:
                            xk8 xk8Var = new xk8(eVar2, 9, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 9:
                            eVar2.presentFragment(new is(1));
                            return;
                        case 10:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            q86 q86Var = new q86();
                            eVar2.presentFragment(q86Var);
                            q86Var.a0(3);
                            q86Var.Z(2);
                            return;
                        case 12:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 14:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 15:
                            eVar2.presentFragment(new n49());
                            return;
                        case 16:
                            eVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            xk8 xk8Var2 = new xk8(eVar2, 6, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 19:
                            xk8 xk8Var3 = new xk8(eVar2, 7, false);
                            xk8Var3.G0();
                            eVar2.showDialog(xk8Var3);
                            return;
                        case 20:
                            xk8 xk8Var4 = new xk8(eVar2, 10, false);
                            xk8Var4.G0();
                            eVar2.showDialog(xk8Var4);
                            return;
                        case 21:
                            xk8 xk8Var5 = new xk8(eVar2, 12, false);
                            xk8Var5.G0();
                            eVar2.showDialog(xk8Var5);
                            return;
                        case 22:
                            eVar2.presentFragment(new q86());
                            return;
                        case 23:
                            q86 q86Var2 = new q86();
                            eVar2.presentFragment(q86Var2);
                            q86Var2.Z(3);
                            return;
                        case 24:
                            q86 q86Var3 = new q86();
                            eVar2.presentFragment(q86Var3);
                            q86Var3.a0(3);
                            q86Var3.Z(1);
                            return;
                        case 25:
                            eVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            q86 q86Var4 = new q86();
                            eVar2.presentFragment(q86Var4);
                            q86Var4.a0(3);
                            q86Var4.Z(2);
                            return;
                        case 27:
                            q86 q86Var5 = new q86();
                            eVar2.presentFragment(q86Var5);
                            q86Var5.Z(28700);
                            return;
                        case 28:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            q86 q86Var6 = new q86();
                            eVar2.presentFragment(q86Var6);
                            q86Var6.a0(28700);
                            q86Var6.Z(16388);
                            return;
                    }
                }
            });
        } else {
            es8Var20 = null;
        }
        if (F(currentAccount, 10)) {
            es8Var21 = new es8(812, ob6.L0(2131746749), ob6.L0(2131743884), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                        case 1:
                            uh9.o(0, eVar2);
                            return;
                        case 2:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 3:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 5:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 6:
                            eVar2.presentFragment(new StickersActivity(1, null));
                            return;
                        case 7:
                            eVar2.presentFragment(new is(0));
                            return;
                        case 8:
                            xk8 xk8Var = new xk8(eVar2, 9, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 9:
                            eVar2.presentFragment(new is(1));
                            return;
                        case 10:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            q86 q86Var = new q86();
                            eVar2.presentFragment(q86Var);
                            q86Var.a0(3);
                            q86Var.Z(2);
                            return;
                        case 12:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 14:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 15:
                            eVar2.presentFragment(new n49());
                            return;
                        case 16:
                            eVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            xk8 xk8Var2 = new xk8(eVar2, 6, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 19:
                            xk8 xk8Var3 = new xk8(eVar2, 7, false);
                            xk8Var3.G0();
                            eVar2.showDialog(xk8Var3);
                            return;
                        case 20:
                            xk8 xk8Var4 = new xk8(eVar2, 10, false);
                            xk8Var4.G0();
                            eVar2.showDialog(xk8Var4);
                            return;
                        case 21:
                            xk8 xk8Var5 = new xk8(eVar2, 12, false);
                            xk8Var5.G0();
                            eVar2.showDialog(xk8Var5);
                            return;
                        case 22:
                            eVar2.presentFragment(new q86());
                            return;
                        case 23:
                            q86 q86Var2 = new q86();
                            eVar2.presentFragment(q86Var2);
                            q86Var2.Z(3);
                            return;
                        case 24:
                            q86 q86Var3 = new q86();
                            eVar2.presentFragment(q86Var3);
                            q86Var3.a0(3);
                            q86Var3.Z(1);
                            return;
                        case 25:
                            eVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            q86 q86Var4 = new q86();
                            eVar2.presentFragment(q86Var4);
                            q86Var4.a0(3);
                            q86Var4.Z(2);
                            return;
                        case 27:
                            q86 q86Var5 = new q86();
                            eVar2.presentFragment(q86Var5);
                            q86Var5.Z(28700);
                            return;
                        case 28:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            q86 q86Var6 = new q86();
                            eVar2.presentFragment(q86Var6);
                            q86Var6.a0(28700);
                            q86Var6.Z(16388);
                            return;
                    }
                }
            });
        } else {
            es8Var21 = null;
        }
        if (F(currentAccount, 12)) {
            es8Var22 = new es8(813, ob6.L0(2131746733), ob6.L0(2131743884), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                        case 1:
                            uh9.o(0, eVar2);
                            return;
                        case 2:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 3:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 5:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 6:
                            eVar2.presentFragment(new StickersActivity(1, null));
                            return;
                        case 7:
                            eVar2.presentFragment(new is(0));
                            return;
                        case 8:
                            xk8 xk8Var = new xk8(eVar2, 9, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 9:
                            eVar2.presentFragment(new is(1));
                            return;
                        case 10:
                            eVar2.presentFragment(new StickersActivity(0, null));
                            return;
                        case 11:
                            q86 q86Var = new q86();
                            eVar2.presentFragment(q86Var);
                            q86Var.a0(3);
                            q86Var.Z(2);
                            return;
                        case 12:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 14:
                            eVar2.presentFragment(new StickersActivity(5, null));
                            return;
                        case 15:
                            eVar2.presentFragment(new n49());
                            return;
                        case 16:
                            eVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 17:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            xk8 xk8Var2 = new xk8(eVar2, 6, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 19:
                            xk8 xk8Var3 = new xk8(eVar2, 7, false);
                            xk8Var3.G0();
                            eVar2.showDialog(xk8Var3);
                            return;
                        case 20:
                            xk8 xk8Var4 = new xk8(eVar2, 10, false);
                            xk8Var4.G0();
                            eVar2.showDialog(xk8Var4);
                            return;
                        case 21:
                            xk8 xk8Var5 = new xk8(eVar2, 12, false);
                            xk8Var5.G0();
                            eVar2.showDialog(xk8Var5);
                            return;
                        case 22:
                            eVar2.presentFragment(new q86());
                            return;
                        case 23:
                            q86 q86Var2 = new q86();
                            eVar2.presentFragment(q86Var2);
                            q86Var2.Z(3);
                            return;
                        case 24:
                            q86 q86Var3 = new q86();
                            eVar2.presentFragment(q86Var3);
                            q86Var3.a0(3);
                            q86Var3.Z(1);
                            return;
                        case 25:
                            eVar2.presentFragment(new FiltersSetupActivity());
                            return;
                        case 26:
                            q86 q86Var4 = new q86();
                            eVar2.presentFragment(q86Var4);
                            q86Var4.a0(3);
                            q86Var4.Z(2);
                            return;
                        case 27:
                            q86 q86Var5 = new q86();
                            eVar2.presentFragment(q86Var5);
                            q86Var5.Z(28700);
                            return;
                        case 28:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        default:
                            q86 q86Var6 = new q86();
                            eVar2.presentFragment(q86Var6);
                            q86Var6.a0(28700);
                            q86Var6.Z(16388);
                            return;
                    }
                }
            });
        } else {
            es8Var22 = null;
        }
        es8 es8Var124 = new es8(900, ob6.L0(2131746795), null, 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8Var124.h = "tg://settings/power-saving";
        es8 es8Var125 = new es8(901, ob6.L0(2131748604), ob6.L0(2131746795), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8Var125.h = "tg://settings/power-saving/stickers";
        es8 es8Var126 = new es8(902, ob6.L0(2131748616), null, ob6.L0(2131746795), ob6.L0(2131748604), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var127 = new es8(903, ob6.L0(2131748618), null, ob6.L0(2131746795), ob6.L0(2131748604), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var128 = new es8(904, ob6.L0(2131748609), ob6.L0(2131746795), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8Var128.h = "tg://settings/power-saving/emoji";
        es8 es8Var129 = new es8(905, ob6.L0(2131748616), null, ob6.L0(2131746795), ob6.L0(2131748609), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                    case 1:
                        uh9.o(0, eVar2);
                        return;
                    case 2:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 3:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 5:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 6:
                        eVar2.presentFragment(new StickersActivity(1, null));
                        return;
                    case 7:
                        eVar2.presentFragment(new is(0));
                        return;
                    case 8:
                        xk8 xk8Var = new xk8(eVar2, 9, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 9:
                        eVar2.presentFragment(new is(1));
                        return;
                    case 10:
                        eVar2.presentFragment(new StickersActivity(0, null));
                        return;
                    case 11:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(3);
                        q86Var.Z(2);
                        return;
                    case 12:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 14:
                        eVar2.presentFragment(new StickersActivity(5, null));
                        return;
                    case 15:
                        eVar2.presentFragment(new n49());
                        return;
                    case 16:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 17:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        xk8 xk8Var2 = new xk8(eVar2, 6, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 19:
                        xk8 xk8Var3 = new xk8(eVar2, 7, false);
                        xk8Var3.G0();
                        eVar2.showDialog(xk8Var3);
                        return;
                    case 20:
                        xk8 xk8Var4 = new xk8(eVar2, 10, false);
                        xk8Var4.G0();
                        eVar2.showDialog(xk8Var4);
                        return;
                    case 21:
                        xk8 xk8Var5 = new xk8(eVar2, 12, false);
                        xk8Var5.G0();
                        eVar2.showDialog(xk8Var5);
                        return;
                    case 22:
                        eVar2.presentFragment(new q86());
                        return;
                    case 23:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.Z(3);
                        return;
                    case 24:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.a0(3);
                        q86Var3.Z(1);
                        return;
                    case 25:
                        eVar2.presentFragment(new FiltersSetupActivity());
                        return;
                    case 26:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(3);
                        q86Var4.Z(2);
                        return;
                    case 27:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.Z(28700);
                        return;
                    case 28:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    default:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(28700);
                        q86Var6.Z(16388);
                        return;
                }
            }
        });
        es8 es8Var130 = new es8(906, ob6.L0(2131748615), null, ob6.L0(2131746795), ob6.L0(2131748609), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8 es8Var131 = new es8(907, ob6.L0(2131748618), null, ob6.L0(2131746795), ob6.L0(2131748609), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8 es8Var132 = new es8(908, ob6.L0(2131748610), ob6.L0(2131746795), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var132.h = "tg://settings/power-saving/effects";
        es8 es8Var133 = new es8(909, ob6.L0(2131748613), null, ob6.L0(2131746795), ob6.L0(2131748610), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var133.h = "tg://settings/power-saving/background";
        es8 es8Var134 = new es8(910, ob6.L0(2131748601), null, ob6.L0(2131746795), ob6.L0(2131748610), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8 es8Var135 = new es8(911, ob6.L0(2131748605), null, ob6.L0(2131746795), ob6.L0(2131748610), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        if (xea.o() >= 1) {
            es8Var23 = new es8(326, ob6.L0(2131748612), null, ob6.L0(2131746795), ob6.L0(2131748610), 2131232023, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                            q86 q86Var = new q86();
                            eVar2.presentFragment(q86Var);
                            q86Var.a0(28700);
                            q86Var.Z(8200);
                            return;
                        case 1:
                            q86 q86Var2 = new q86();
                            eVar2.presentFragment(q86Var2);
                            q86Var2.a0(28700);
                            q86Var2.Z(4112);
                            return;
                        case 2:
                            q86 q86Var3 = new q86();
                            eVar2.presentFragment(q86Var3);
                            q86Var3.Z(360928);
                            return;
                        case 3:
                            q86 q86Var4 = new q86();
                            eVar2.presentFragment(q86Var4);
                            q86Var4.a0(360928);
                            q86Var4.Z(32);
                            return;
                        case 4:
                            q86 q86Var5 = new q86();
                            eVar2.presentFragment(q86Var5);
                            q86Var5.a0(360928);
                            q86Var5.Z(64);
                            return;
                        case 5:
                            q86 q86Var6 = new q86();
                            eVar2.presentFragment(q86Var6);
                            q86Var6.a0(360928);
                            q86Var6.Z(128);
                            return;
                        case 6:
                            eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            q86 q86Var7 = new q86();
                            eVar2.presentFragment(q86Var7);
                            q86Var7.a0(360928);
                            q86Var7.Z(256);
                            return;
                        case 8:
                            q86 q86Var8 = new q86();
                            eVar2.presentFragment(q86Var8);
                            q86Var8.a0(360928);
                            q86Var8.Z(32768);
                            return;
                        case 9:
                            q86 q86Var9 = new q86();
                            eVar2.presentFragment(q86Var9);
                            q86Var9.Z(512);
                            return;
                        case 10:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            q86 q86Var10 = new q86();
                            eVar2.presentFragment(q86Var10);
                            q86Var10.Z(1024);
                            return;
                        case 12:
                            q86 q86Var11 = new q86();
                            eVar2.presentFragment(q86Var11);
                            q86Var11.Z(2048);
                            return;
                        case 13:
                            q86 q86Var12 = new q86();
                            eVar2.presentFragment(q86Var12);
                            while (true) {
                                ArrayList arrayList = q86Var12.s;
                                if (i < arrayList.size()) {
                                    if (((k86) arrayList.get(i)).f) {
                                        q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                        return;
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        case 14:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 15:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 17:
                            xk8 xk8Var = new xk8(eVar2, 0, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 18:
                            eVar2.showDialog(jj.R(eVar2, null));
                            return;
                        case 19:
                            m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                            return;
                        case 20:
                            m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                            return;
                        case 21:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 23:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 24:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 25:
                            eVar2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 26:
                            eVar2.presentFragment(PasscodeActivity.m0());
                            return;
                        case 27:
                            xk8 xk8Var2 = new xk8(eVar2, 11, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 28:
                            eVar2.presentFragment(new v8(3));
                            return;
                        default:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                    }
                }
            });
        } else {
            es8Var23 = null;
        }
        es8 es8Var136 = new es8(912, ob6.L0(2131748606), null, ob6.L0(2131746795), ob6.L0(2131748610), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8 es8Var137 = new es8(913, ob6.L0(2131748611), ob6.L0(2131746795), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var137.h = "tg://settings/power-saving/call-animations";
        es8 es8Var138 = new es8(214, ob6.L0(2131748614), ob6.L0(2131746795), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var138.h = "tg://settings/power-saving/videos";
        es8 es8Var139 = new es8(213, ob6.L0(2131748617), ob6.L0(2131746795), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var139.h = "tg://settings/power-saving/gifs";
        es8 es8Var140 = new es8(914, ob6.L0(2131748600), ob6.L0(2131746795), 2131232023, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var140.h = "tg://settings/power-saving/transitions";
        es8 es8Var141 = new es8(400, ob6.L0(2131748808), 2131232034, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var141.h = "tg://settings/language";
        es8 es8Var142 = new es8(405, ob6.L0(2131745055), ob6.L0(2131748808), 2131232034, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var142.h = "tg://settings/language/show-button";
        if (uc7.s1(currentAccount).j4.r()) {
            es8 es8Var143 = new es8(406, ob6.L0(2131751323), ob6.L0(2131748808), 2131232034, new Runnable() {
                @Override
                public final void run() {
                    byte b = r2;
                    int i = 0;
                    e eVar2 = eVar;
                    switch (b) {
                        case 0:
                            q86 q86Var = new q86();
                            eVar2.presentFragment(q86Var);
                            q86Var.a0(28700);
                            q86Var.Z(8200);
                            return;
                        case 1:
                            q86 q86Var2 = new q86();
                            eVar2.presentFragment(q86Var2);
                            q86Var2.a0(28700);
                            q86Var2.Z(4112);
                            return;
                        case 2:
                            q86 q86Var3 = new q86();
                            eVar2.presentFragment(q86Var3);
                            q86Var3.Z(360928);
                            return;
                        case 3:
                            q86 q86Var4 = new q86();
                            eVar2.presentFragment(q86Var4);
                            q86Var4.a0(360928);
                            q86Var4.Z(32);
                            return;
                        case 4:
                            q86 q86Var5 = new q86();
                            eVar2.presentFragment(q86Var5);
                            q86Var5.a0(360928);
                            q86Var5.Z(64);
                            return;
                        case 5:
                            q86 q86Var6 = new q86();
                            eVar2.presentFragment(q86Var6);
                            q86Var6.a0(360928);
                            q86Var6.Z(128);
                            return;
                        case 6:
                            eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 7:
                            q86 q86Var7 = new q86();
                            eVar2.presentFragment(q86Var7);
                            q86Var7.a0(360928);
                            q86Var7.Z(256);
                            return;
                        case 8:
                            q86 q86Var8 = new q86();
                            eVar2.presentFragment(q86Var8);
                            q86Var8.a0(360928);
                            q86Var8.Z(32768);
                            return;
                        case 9:
                            q86 q86Var9 = new q86();
                            eVar2.presentFragment(q86Var9);
                            q86Var9.Z(512);
                            return;
                        case 10:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 11:
                            q86 q86Var10 = new q86();
                            eVar2.presentFragment(q86Var10);
                            q86Var10.Z(1024);
                            return;
                        case 12:
                            q86 q86Var11 = new q86();
                            eVar2.presentFragment(q86Var11);
                            q86Var11.Z(2048);
                            return;
                        case 13:
                            q86 q86Var12 = new q86();
                            eVar2.presentFragment(q86Var12);
                            while (true) {
                                ArrayList arrayList = q86Var12.s;
                                if (i < arrayList.size()) {
                                    if (((k86) arrayList.get(i)).f) {
                                        q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                        return;
                                    }
                                    i++;
                                } else {
                                    return;
                                }
                            }
                        case 14:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 15:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            eVar2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 17:
                            xk8 xk8Var = new xk8(eVar2, 0, false);
                            xk8Var.G0();
                            eVar2.showDialog(xk8Var);
                            return;
                        case 18:
                            eVar2.showDialog(jj.R(eVar2, null));
                            return;
                        case 19:
                            m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                            return;
                        case 20:
                            m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                            return;
                        case 21:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 23:
                            eVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 24:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 25:
                            eVar2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 26:
                            eVar2.presentFragment(PasscodeActivity.m0());
                            return;
                        case 27:
                            xk8 xk8Var2 = new xk8(eVar2, 11, false);
                            xk8Var2.G0();
                            eVar2.showDialog(xk8Var2);
                            return;
                        case 28:
                            eVar2.presentFragment(new v8(3));
                            return;
                        default:
                            eVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                    }
                }
            });
            es8Var143.h = "tg://settings/language/do-not-translate";
            es8Var44 = es8Var143;
        }
        es8 es8Var144 = new es8(402, ob6.L0(2131753979), ob6.L0(2131745207), 2131232033, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var144.h = "tg://settings/ask-question";
        es8 es8Var145 = new es8(403, ob6.L0(2131743895), ob6.L0(2131745207), 2131232033, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var145.h = "tg://settings/faq";
        es8 es8Var146 = new es8(404, ob6.L0(2131746512), ob6.L0(2131745207), 2131232033, new Runnable() {
            @Override
            public final void run() {
                byte b = r2;
                int i = 0;
                e eVar2 = eVar;
                switch (b) {
                    case 0:
                        q86 q86Var = new q86();
                        eVar2.presentFragment(q86Var);
                        q86Var.a0(28700);
                        q86Var.Z(8200);
                        return;
                    case 1:
                        q86 q86Var2 = new q86();
                        eVar2.presentFragment(q86Var2);
                        q86Var2.a0(28700);
                        q86Var2.Z(4112);
                        return;
                    case 2:
                        q86 q86Var3 = new q86();
                        eVar2.presentFragment(q86Var3);
                        q86Var3.Z(360928);
                        return;
                    case 3:
                        q86 q86Var4 = new q86();
                        eVar2.presentFragment(q86Var4);
                        q86Var4.a0(360928);
                        q86Var4.Z(32);
                        return;
                    case 4:
                        q86 q86Var5 = new q86();
                        eVar2.presentFragment(q86Var5);
                        q86Var5.a0(360928);
                        q86Var5.Z(64);
                        return;
                    case 5:
                        q86 q86Var6 = new q86();
                        eVar2.presentFragment(q86Var6);
                        q86Var6.a0(360928);
                        q86Var6.Z(128);
                        return;
                    case 6:
                        eVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 7:
                        q86 q86Var7 = new q86();
                        eVar2.presentFragment(q86Var7);
                        q86Var7.a0(360928);
                        q86Var7.Z(256);
                        return;
                    case 8:
                        q86 q86Var8 = new q86();
                        eVar2.presentFragment(q86Var8);
                        q86Var8.a0(360928);
                        q86Var8.Z(32768);
                        return;
                    case 9:
                        q86 q86Var9 = new q86();
                        eVar2.presentFragment(q86Var9);
                        q86Var9.Z(512);
                        return;
                    case 10:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 11:
                        q86 q86Var10 = new q86();
                        eVar2.presentFragment(q86Var10);
                        q86Var10.Z(1024);
                        return;
                    case 12:
                        q86 q86Var11 = new q86();
                        eVar2.presentFragment(q86Var11);
                        q86Var11.Z(2048);
                        return;
                    case 13:
                        q86 q86Var12 = new q86();
                        eVar2.presentFragment(q86Var12);
                        while (true) {
                            ArrayList arrayList = q86Var12.s;
                            if (i < arrayList.size()) {
                                if (((k86) arrayList.get(i)).f) {
                                    q86Var12.b.g1(new wg(q86Var12, i, (byte) 11), 700, true);
                                    return;
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    case 14:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 15:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        eVar2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 17:
                        xk8 xk8Var = new xk8(eVar2, 0, false);
                        xk8Var.G0();
                        eVar2.showDialog(xk8Var);
                        return;
                    case 18:
                        eVar2.showDialog(jj.R(eVar2, null));
                        return;
                    case 19:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131743893, null));
                        return;
                    case 20:
                        m01.u(eVar2.getParentActivity(), ob6.M0(2131746510, null));
                        return;
                    case 21:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 23:
                        eVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 24:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 25:
                        eVar2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 26:
                        eVar2.presentFragment(PasscodeActivity.m0());
                        return;
                    case 27:
                        xk8 xk8Var2 = new xk8(eVar2, 11, false);
                        xk8Var2.G0();
                        eVar2.showDialog(xk8Var2);
                        return;
                    case 28:
                        eVar2.presentFragment(new v8(3));
                        return;
                    default:
                        eVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                }
            }
        });
        es8Var146.h = "tg://settings/privacy-policy";
        return new es8[]{es8Var24, es8Var25, es8Var26, es8Var27, es8Var28, es8Var29, es8Var30, es8Var31, es8Var32, es8Var33, es8Var34, es8Var35, es8Var36, es8Var37, es8Var38, es8Var39, es8Var40, es8Var, es8Var42, es8Var43, es8Var2, es8Var45, es8Var46, es8Var47, es8Var48, es8Var49, es8Var50, es8Var51, es8Var52, es8Var53, es8Var3, es8Var4, es8Var55, es8Var56, es8Var57, es8Var58, es8Var59, es8Var60, es8Var61, es8Var62, es8Var63, es8Var64, es8Var65, es8Var66, es8Var67, es8Var68, es8Var69, es8Var70, es8Var71, es8Var72, es8Var73, es8Var74, es8Var75, es8Var76, es8Var77, es8Var78, es8Var79, es8Var80, es8Var81, es8Var82, es8Var83, es8Var84, es8Var85, es8Var86, es8Var87, es8Var88, es8Var89, es8Var90, es8Var91, es8Var92, es8Var93, es8Var94, es8Var95, es8Var96, es8Var97, es8Var98, es8Var99, es8Var100, es8Var101, es8Var102, es8Var103, es8Var104, es8Var105, es8Var106, es8Var107, es8Var108, es8Var109, es8Var110, es8Var111, es8Var112, es8Var113, es8Var6, es8Var115, es8Var7, es8Var117, es8Var8, es8Var119, es8Var120, es8Var121, es8Var122, es8Var5, es8Var9, es8Var10, es8Var11, es8Var12, es8Var13, es8Var14, es8Var15, es8Var16, es8Var17, es8Var18, es8Var19, es8Var20, es8Var21, es8Var22, es8Var124, es8Var125, es8Var126, es8Var127, es8Var128, es8Var129, es8Var130, es8Var131, es8Var132, es8Var133, es8Var134, es8Var135, es8Var23, es8Var136, es8Var137, es8Var138, es8Var139, es8Var140, es8Var141, es8Var142, es8Var44, es8Var144, es8Var145, es8Var146};
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 0) {
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
            qd4.v(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 instanceof es8) {
                ((es8) obj2).g = i;
            } else if (obj2 instanceof hc7) {
                ((hc7) obj2).d = i;
            }
            linkedHashSet.add(obj2.toString());
        }
        uc7.e1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i = this.f;
        TLRPC.WebPage webPage = uc7.s1(i).j2;
        this.F = webPage;
        if (webPage != null) {
            this.d.addAll(uc7.s1(i).i2);
        }
        if (this.F == null && !this.G) {
            this.G = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = ob6.M0(2131743893, null);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getWebPage, new w15(this, (byte) 22));
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
            e eVar = this.e;
            if (eVar instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) eVar).P.b.getImageReceiver().w0(false);
                    ((ProfileActivity) this.e).P.d.setText(ob6.M0(2131745205, null));
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            f();
            return;
        }
        to3 to3Var = Utilities.g;
        ep8 ep8Var = new ep8(this, str, (byte) 14);
        this.y = ep8Var;
        to3Var.d(ep8Var, 300L);
    }

    public final void J() {
        String[] strArr;
        es8 es8Var;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            es8[] es8VarArr = this.c;
            if (i >= es8VarArr.length) {
                break;
            }
            es8 es8Var2 = es8VarArr[i];
            if (es8Var2 != null) {
                hashMap.put(Integer.valueOf(es8Var2.f), this.c[i]);
            }
            i++;
        }
        Set<String> stringSet = uc7.e1().getStringSet("settingsSearchRecent2", null);
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
                        hc7 hc7Var = new hc7(readString, strArr, serializedData.readString(false));
                        hc7Var.d = readInt32;
                        arrayList.add(hc7Var);
                    } else if (readInt322 == 1 && (es8Var = (es8) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        es8Var.g = readInt32;
                        arrayList.add(es8Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new qq7(this, (byte) 9));
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
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3 = f89Var.f;
        View view = f89Var.a;
        es8 es8Var = null;
        boolean z = true;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    ((mf5) view).setText(ob6.M0(2131745197, null));
                    return;
                }
                return;
            }
            ((p55) view).setText(ob6.M0(2131745210, null));
            return;
        }
        fca fcaVar = (fca) view;
        boolean z2 = false;
        if (this.x) {
            int size = this.r.size();
            ArrayList arrayList = this.r;
            if (i < size) {
                es8 es8Var2 = (es8) arrayList.get(i);
                if (i > 0) {
                    es8Var = (es8) this.r.get(i - 1);
                }
                if (es8Var != null && es8Var.e == es8Var2.e) {
                    i2 = 0;
                } else {
                    i2 = es8Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.n.get(i);
                String[] strArr = es8Var2.d;
                if (i >= this.r.size() - 1) {
                    z = false;
                }
                fcaVar.b(charSequence, strArr, i2, z);
                return;
            }
            int k = bs2.k(1, i, arrayList);
            CharSequence charSequence2 = (CharSequence) this.n.get(this.r.size() + k);
            String[] strArr2 = ((hc7) this.s.get(k)).b;
            if (k < this.r.size() - 1) {
                z2 = true;
            }
            fcaVar.a(charSequence2, strArr2, true, z2);
            return;
        }
        ArrayList arrayList2 = this.w;
        if (!arrayList2.isEmpty()) {
            i--;
        }
        if (i < arrayList2.size()) {
            Object obj = arrayList2.get(i);
            if (obj instanceof es8) {
                es8 es8Var3 = (es8) obj;
                String str = es8Var3.a;
                String[] strArr3 = es8Var3.d;
                if (i >= arrayList2.size() - 1) {
                    z = false;
                }
                fcaVar.a(str, strArr3, false, z);
                return;
            } else if (obj instanceof hc7) {
                hc7 hc7Var = (hc7) obj;
                String str2 = hc7Var.a;
                String[] strArr4 = hc7Var.b;
                if (i < arrayList2.size() - 1) {
                    z2 = true;
                }
                fcaVar.a(str2, strArr4, true, z2);
                return;
            } else {
                return;
            }
        }
        int k2 = bs2.k(1, i, arrayList2);
        hc7 hc7Var2 = (hc7) this.d.get(k2);
        String str3 = hc7Var2.a;
        String[] strArr5 = hc7Var2.b;
        if (k2 < arrayList2.size() - 1) {
            z2 = true;
        }
        fcaVar.a(str3, strArr5, true, z2);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View fcaVar;
        Context context = this.h;
        if (i != 0) {
            if (i != 1) {
                fcaVar = new mf5(context, 16);
            } else {
                fcaVar = new p55(context, null);
            }
        } else {
            fcaVar = new fca(context);
        }
        fcaVar.setLayoutParams(new r79(-1, -2));
        return new f89(fcaVar);
    }
}
