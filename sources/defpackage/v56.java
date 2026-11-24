package defpackage;

import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UserInfoActivity;
public final class v56 implements Runnable {
    public final byte a;
    public final ProfileActivity b;

    public v56(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void run() {
        lq8 lq8Var;
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                wp8 wp8Var = profileActivity.O;
                if (wp8Var != null) {
                    wp8Var.f1(14);
                    profileActivity.n3(false);
                    return;
                }
                return;
            case 1:
                wp8 wp8Var2 = profileActivity.O;
                if (wp8Var2 != null) {
                    wp8Var2.f1(14);
                    profileActivity.n3(false);
                    return;
                }
                return;
            case 2:
                gm.d3(new v56(profileActivity, (byte) 0), 200L);
                return;
            case 3:
                gm.d3(new v56(profileActivity, (byte) 1), 200L);
                return;
            case 4:
                RectF rectF = ProfileActivity.e7;
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null) {
                    gm.g(k47.h0(userFull.note, false));
                    c41.b0(profileActivity).i(jb6.M0(2131743879, null)).j();
                    return;
                }
                return;
            case 5:
                RectF rectF2 = ProfileActivity.e7;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", profileActivity.e1);
                bundle.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new tu2(bundle, profileActivity.A0));
                return;
            case 6:
                RectF rectF3 = ProfileActivity.e7;
                profileActivity.getSendMessagesHelper().q0(y5a.b("/start", profileActivity.e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 7:
                RectF rectF4 = ProfileActivity.e7;
                profileActivity.g3(false);
                return;
            case 8:
                RectF rectF5 = ProfileActivity.e7;
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 9:
                RectF rectF6 = ProfileActivity.e7;
                profileActivity.g3(true);
                return;
            case 10:
                RectF rectF7 = ProfileActivity.e7;
                profileActivity.presentFragment(new ss7());
                return;
            case 11:
                RectF rectF8 = ProfileActivity.e7;
                profileActivity.presentFragment(new oc6());
                return;
            case 12:
                RectF rectF9 = ProfileActivity.e7;
                profileActivity.presentFragment(new uf1(null));
                return;
            case 13:
                RectF rectF10 = ProfileActivity.e7;
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            case 14:
                RectF rectF11 = ProfileActivity.e7;
                profileActivity.presentFragment(new u8(3));
                return;
            case 15:
                RectF rectF12 = ProfileActivity.e7;
                ?? obj = new Object();
                obj.a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), obj);
                return;
            case 16:
                RectF rectF13 = ProfileActivity.e7;
                profileActivity.presentFragment(yv1.ga(profileActivity.e1));
                return;
            case 17:
                RectF rectF14 = ProfileActivity.e7;
                profileActivity.Q2(true);
                if (profileActivity.k2.isRunning()) {
                    profileActivity.k2.cancel();
                }
                profileActivity.r3(1.0f);
                return;
            case 18:
                RectF rectF15 = ProfileActivity.e7;
                profileActivity.c4(false, false);
                return;
            case 19:
                RectF rectF16 = ProfileActivity.e7;
                profileActivity.O1();
                return;
            case 20:
                RectF rectF17 = ProfileActivity.e7;
                wp8 wp8Var3 = profileActivity.O;
                if (wp8Var3 != null) {
                    wp8Var3.N1(true);
                    profileActivity.O.C1();
                    return;
                }
                return;
            case 21:
                RectF rectF18 = ProfileActivity.e7;
                oc7 messagesController = profileActivity.getMessagesController();
                long a = profileActivity.a();
                messagesController.getClass();
                TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
                tL_users_getUsers.id.add(messagesController.n1(a));
                ConnectionsManager.getInstance(messagesController.currentAccount).sendRequest(tL_users_getUsers, new y67(messagesController, (byte) 8));
                return;
            case 22:
                RectF rectF19 = ProfileActivity.e7;
                if (!profileActivity.a.d0() && (lq8Var = profileActivity.d) != null) {
                    lq8Var.f();
                    return;
                }
                return;
            case 23:
                RectF rectF20 = ProfileActivity.e7;
                profileActivity.A1();
                return;
            case 24:
                RectF rectF21 = ProfileActivity.e7;
                profileActivity.c4(false, false);
                return;
            case 25:
                RectF rectF22 = ProfileActivity.e7;
                profileActivity.J5.setVisibility(8);
                return;
            case 26:
                RectF rectF23 = ProfileActivity.e7;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                bundle2.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new iy8(bundle2));
                return;
            case 27:
                RectF rectF24 = ProfileActivity.e7;
                profileActivity.getClass();
                profileActivity.presentFragment(new uf1(null));
                return;
            case 28:
                RectF rectF25 = ProfileActivity.e7;
                profileActivity.I2();
                return;
            default:
                profileActivity.n3(true);
                return;
        }
    }
}
