package defpackage;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class gp8 implements View.OnClickListener {
    public final byte a;
    public final ProfileActivity b;

    public gp8(ProfileActivity profileActivity, byte b) {
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
                profileActivity.finishPreviewFragment();
                return;
            case 1:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.F3();
                return;
            case 2:
                RectF rectF3 = ProfileActivity.Z6;
                TLRPC.UserFull userFull = profileActivity.w2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new sv8(profileActivity, profileActivity.d0, profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1)), profileActivity.w2.wallet_card));
                    return;
                }
                return;
            case 3:
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity.t2();
                return;
            case 4:
                RectF rectF5 = ProfileActivity.Z6;
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f1);
                bundle.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new rz8(bundle));
                return;
            case 5:
                RectF rectF6 = ProfileActivity.Z6;
                profileActivity.J2();
                return;
            case 6:
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity.E3();
                return;
            case 7:
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity.E3();
                return;
            case 8:
                RectF rectF9 = ProfileActivity.Z6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i = 0;
                    while (i < profileActivity.getParentLayout().getFragmentStack().size()) {
                        e eVar = (e) profileActivity.getParentLayout().getFragmentStack().get(i);
                        if (eVar instanceof uj3) {
                            uj3 uj3Var = (uj3) eVar;
                            li3 li3Var = uj3Var.H3;
                            if (li3Var != null) {
                                e fragment = li3Var.getFragment();
                                if ((fragment instanceof tzb) && (-((tzb) fragment).a) == profileActivity.a()) {
                                    uj3Var.H3.a();
                                }
                            }
                        } else if (eVar instanceof zu1) {
                            if (((zu1) eVar).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(eVar, false);
                                i--;
                            }
                        } else if (eVar instanceof tzb) {
                            if ((-((tzb) eVar).a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(eVar, false);
                                i--;
                            }
                        } else if ((eVar instanceof ProfileActivity) && eVar != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) eVar;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(eVar, false);
                                i--;
                            }
                        }
                        i++;
                    }
                }
                profileActivity.J1 = (byte) 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f1);
                HashSet hashSet = tzb.s1;
                profileActivity.presentFragment(tzb.F0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 9:
                RectF rectF10 = ProfileActivity.Z6;
                profileActivity.A2();
                return;
            case 10:
                RectF rectF11 = ProfileActivity.Z6;
                profileActivity.D3();
                return;
            case 11:
                RectF rectF12 = ProfileActivity.Z6;
                if (profileActivity.s.getTag() == null) {
                    profileActivity.Y2();
                    return;
                }
                return;
            default:
                RectF rectF13 = ProfileActivity.Z6;
                profileActivity.X2(view);
                return;
        }
    }
}
