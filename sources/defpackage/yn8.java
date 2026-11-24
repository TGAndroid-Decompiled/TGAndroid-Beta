package defpackage;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class yn8 implements View.OnClickListener {
    public final byte a;
    public final ProfileActivity b;

    public yn8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.e7;
                profileActivity.G3();
                return;
            case 1:
                RectF rectF2 = ProfileActivity.e7;
                if (profileActivity.s.getTag() == null) {
                    profileActivity.a3();
                    return;
                }
                return;
            case 2:
                RectF rectF3 = ProfileActivity.e7;
                profileActivity.finishPreviewFragment();
                return;
            case 3:
                RectF rectF4 = ProfileActivity.e7;
                profileActivity.I3();
                return;
            case 4:
                RectF rectF5 = ProfileActivity.e7;
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new ku8(profileActivity, profileActivity.d0, profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1)), profileActivity.w2.wallet_card));
                    return;
                }
                return;
            case 5:
                RectF rectF6 = ProfileActivity.e7;
                profileActivity.v2();
                return;
            case 6:
                RectF rectF7 = ProfileActivity.e7;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f1);
                bundle.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new iy8(bundle));
                return;
            case 7:
                RectF rectF8 = ProfileActivity.e7;
                profileActivity.L2();
                return;
            case 8:
                RectF rectF9 = ProfileActivity.e7;
                profileActivity.H3();
                return;
            case 9:
                RectF rectF10 = ProfileActivity.e7;
                profileActivity.H3();
                return;
            case 10:
                RectF rectF11 = ProfileActivity.e7;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i = 0;
                    while (i < profileActivity.getParentLayout().getFragmentStack().size()) {
                        d dVar = (d) profileActivity.getParentLayout().getFragmentStack().get(i);
                        if (dVar instanceof nk3) {
                            nk3 nk3Var = (nk3) dVar;
                            dj3 dj3Var = nk3Var.H3;
                            if (dj3Var != null) {
                                d fragment = dj3Var.getFragment();
                                if ((fragment instanceof sxb) && (-((sxb) fragment).a) == profileActivity.a()) {
                                    nk3Var.H3.a();
                                }
                            }
                        } else if (dVar instanceof yv1) {
                            if (((yv1) dVar).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(dVar, false);
                                i--;
                            }
                        } else if (dVar instanceof sxb) {
                            if ((-((sxb) dVar).a) == profileActivity.a()) {
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
                HashSet hashSet = sxb.s1;
                profileActivity.presentFragment(sxb.F0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                RectF rectF12 = ProfileActivity.e7;
                profileActivity.C2();
                return;
            case 12:
                RectF rectF13 = ProfileActivity.e7;
                profileActivity.Z2(view);
                return;
            default:
                RectF rectF14 = ProfileActivity.e7;
                profileActivity.Z2(view);
                return;
        }
    }
}
