package defpackage;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class wl8 implements View.OnClickListener {
    public final byte a;
    public final ProfileActivity b;

    public wl8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.C3();
                return;
            case 1:
                RectF rectF2 = ProfileActivity.Z6;
                if (profileActivity.s.getTag() == null) {
                    profileActivity.X2();
                    return;
                }
                return;
            case 2:
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity.finishPreviewFragment();
                return;
            case 3:
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity.E3();
                return;
            case 4:
                RectF rectF5 = ProfileActivity.Z6;
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new js8(profileActivity, profileActivity.d0, profileActivity.getMessagesController().V1(Long.valueOf(profileActivity.e1)), profileActivity.w2.wallet_card));
                    return;
                }
                return;
            case 5:
                RectF rectF6 = ProfileActivity.Z6;
                profileActivity.s2();
                return;
            case 6:
                RectF rectF7 = ProfileActivity.Z6;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f1);
                bundle.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new gw8(bundle));
                return;
            case 7:
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity.I2();
                return;
            case 8:
                RectF rectF9 = ProfileActivity.Z6;
                profileActivity.D3();
                return;
            case 9:
                RectF rectF10 = ProfileActivity.Z6;
                profileActivity.D3();
                return;
            case 10:
                RectF rectF11 = ProfileActivity.Z6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i = 0;
                    while (i < profileActivity.getParentLayout().getFragmentStack().size()) {
                        d dVar = (d) profileActivity.getParentLayout().getFragmentStack().get(i);
                        if (dVar instanceof cj3) {
                            cj3 cj3Var = (cj3) dVar;
                            rh3 rh3Var = cj3Var.H3;
                            if (rh3Var != null) {
                                d fragment = rh3Var.getFragment();
                                if ((fragment instanceof qvb) && (-((qvb) fragment).a) == profileActivity.a()) {
                                    cj3Var.H3.a();
                                }
                            }
                        } else if (dVar instanceof mu1) {
                            if (((mu1) dVar).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(dVar, false);
                                i--;
                            }
                        } else if (dVar instanceof qvb) {
                            if ((-((qvb) dVar).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(dVar, false);
                                i--;
                            }
                        } else if ((dVar instanceof ProfileActivity) && dVar != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) dVar;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(dVar, false);
                                i--;
                            }
                        }
                        i++;
                    }
                }
                profileActivity.J1 = (byte) 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                HashSet hashSet = qvb.s1;
                profileActivity.presentFragment(qvb.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                RectF rectF12 = ProfileActivity.Z6;
                profileActivity.z2();
                return;
            case 12:
                RectF rectF13 = ProfileActivity.Z6;
                profileActivity.W2(view);
                return;
            default:
                RectF rectF14 = ProfileActivity.Z6;
                profileActivity.W2(view);
                return;
        }
    }
}
