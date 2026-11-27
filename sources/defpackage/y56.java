package defpackage;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UserInfoActivity;
public final class y56 implements Runnable {
    public final byte a;
    public final ProfileActivity b;

    public y56(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void run() {
        wr8 wr8Var;
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                gr8 gr8Var = profileActivity.O;
                if (gr8Var != null) {
                    gr8Var.f1(14);
                    profileActivity.k3(false);
                    return;
                }
                return;
            case 1:
                gr8 gr8Var2 = profileActivity.O;
                if (gr8Var2 != null) {
                    gr8Var2.f1(14);
                    profileActivity.k3(false);
                    return;
                }
                return;
            case 2:
                hl.d3(new y56(profileActivity, (byte) 0), 200L);
                return;
            case 3:
                hl.d3(new y56(profileActivity, (byte) 1), 200L);
                return;
            case 4:
                RectF rectF = ProfileActivity.Z6;
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null) {
                    hl.g(r47.h0(userFull.note, false));
                    d31.b0(profileActivity).i(ob6.M0(2131743847, null)).j();
                    return;
                }
                return;
            case 5:
                RectF rectF2 = ProfileActivity.Z6;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.e1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new cu2(bundle, profileActivity.A0));
                return;
            case 6:
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity.d3(false);
                return;
            case 7:
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 8:
                RectF rectF5 = ProfileActivity.Z6;
                profileActivity.d3(true);
                return;
            case 9:
                RectF rectF6 = ProfileActivity.Z6;
                profileActivity.presentFragment(new vt7());
                return;
            case 10:
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity.presentFragment(new tc6());
                return;
            case 11:
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity.presentFragment(new ve1(null));
                return;
            case 12:
                RectF rectF9 = ProfileActivity.Z6;
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 13:
                RectF rectF10 = ProfileActivity.Z6;
                profileActivity.presentFragment(new v8(3));
                return;
            case 14:
                RectF rectF11 = ProfileActivity.Z6;
                ?? obj = new Object();
                obj.a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 15:
                RectF rectF12 = ProfileActivity.Z6;
                profileActivity.O2(true);
                if (profileActivity.k2.isRunning()) {
                    profileActivity.k2.cancel();
                }
                profileActivity.o3(1.0f);
                return;
            case 16:
                RectF rectF13 = ProfileActivity.Z6;
                profileActivity.E5.setVisibility(8);
                return;
            case 17:
                RectF rectF14 = ProfileActivity.Z6;
                profileActivity.Z3(false, false);
                return;
            case 18:
                RectF rectF15 = ProfileActivity.Z6;
                profileActivity.N1();
                return;
            case 19:
                RectF rectF16 = ProfileActivity.Z6;
                gr8 gr8Var3 = profileActivity.O;
                if (gr8Var3 != null) {
                    gr8Var3.N1(true);
                    profileActivity.O.C1();
                    return;
                }
                return;
            case 20:
                RectF rectF17 = ProfileActivity.Z6;
                if (!profileActivity.a.e0() && (wr8Var = profileActivity.d) != null) {
                    wr8Var.f();
                    return;
                }
                return;
            case 21:
                RectF rectF18 = ProfileActivity.Z6;
                profileActivity.z1();
                return;
            case 22:
                RectF rectF19 = ProfileActivity.Z6;
                profileActivity.Z3(false, false);
                return;
            case 23:
                RectF rectF20 = ProfileActivity.Z6;
                uc7 messagesController = profileActivity.getMessagesController();
                long a = profileActivity.a();
                messagesController.getClass();
                TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                tL_users_getUsers.id.add(messagesController.o1(a));
                ConnectionsManager.getInstance(messagesController.currentAccount).sendRequest(tL_users_getUsers, new h77(messagesController, (byte) 3));
                return;
            case 24:
                RectF rectF21 = ProfileActivity.Z6;
                profileActivity.G2();
                return;
            case 25:
                RectF rectF22 = ProfileActivity.Z6;
                profileActivity.getSendMessagesHelper().q0(p7a.b("/start", profileActivity.e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 26:
                RectF rectF23 = ProfileActivity.Z6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                bundle2.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new rz8(bundle2));
                return;
            case 27:
                RectF rectF24 = ProfileActivity.Z6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ve1(null));
                return;
            case 28:
                profileActivity.k3(true);
                return;
            default:
                profileActivity.k3(true);
                return;
        }
    }
}
