package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class gr8 extends eja {
    public boolean x2;
    public final ProfileActivity y2;

    public gr8(ProfileActivity profileActivity, Context context, long j, wia wiaVar, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, ProfileActivity profileActivity2, ProfileActivity profileActivity3, vnb vnbVar, ll0 ll0Var) {
        super(context, j, wiaVar, i, arrayList, chatFull, userFull, i2, i3, profileActivity2, profileActivity3, 1, vnbVar, ll0Var);
        this.y2 = profileActivity;
    }

    @Override
    public final void J0(SparseArray sparseArray) {
        char c;
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!eja.t0(selectedTab) && selectedTab != 8) {
                if (selectedTab == 9) {
                    c = 1;
                } else {
                    c = 65535;
                }
            } else {
                c = 0;
            }
            if (c >= 0) {
                if (c == 0) {
                    profileActivity.K1(size);
                }
                profileActivity.C5[c].c(size, true);
            }
        }
    }

    @Override
    public final void K0() {
        FrameLayout frameLayout;
        gr8 gr8Var;
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1 && (frameLayout = profileActivity.z5[0]) != null && (gr8Var = profileActivity.O) != null) {
            ProfileActivity.p3(frameLayout, 1.0f - gr8Var.getBottomButtonStoriesVisibility());
        }
    }

    @Override
    public final void N1(boolean z) {
        int i;
        int i2;
        super.N1(z);
        ProfileActivity profileActivity = this.y2;
        boolean z2 = profileActivity.t1;
        cga cgaVar = this.b0;
        if (z2 && !profileActivity.w1 && this.L0.d(14)) {
            if (!this.x2 && (i2 = profileActivity.u1) > 0 && cgaVar != null) {
                this.x2 = true;
                cgaVar.Q = i2;
                cgaVar.e();
            }
            profileActivity.w1 = true;
            f1(14);
        } else if (profileActivity.t1 && profileActivity.w1 && !this.x2 && (i = profileActivity.u1) > 0 && cgaVar != null) {
            this.x2 = true;
            cgaVar.Q = i;
            cgaVar.e();
        }
    }

    @Override
    public final boolean O0(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return this.y2.g(chatParticipant, z, false, view);
    }

    @Override
    public final void Q0() {
        RectF rectF = ProfileActivity.Z6;
        this.y2.X3(true);
    }

    @Override
    public final void R0(boolean z) {
        int i;
        ProfileActivity profileActivity = this.y2;
        Activity parentActivity = profileActivity.getParentActivity();
        i = ((e) profileActivity).classGuid;
        hl.y2(parentActivity, i);
        profileActivity.a.E0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        tt ttVar = profileActivity.Z;
        ttVar.setPivotX(ttVar.getMeasuredWidth() / 2.0f);
        hl.T3(profileActivity.Z, !z, 0.95f, true, true);
        profileActivity.i4(false);
    }

    @Override
    public final void S0() {
        this.y2.V();
    }

    @Override
    public final void T0(float f) {
        K0();
        ProfileActivity profileActivity = this.y2;
        gr8 gr8Var = profileActivity.O;
        if (gr8Var != null && profileActivity.s1) {
            if (profileActivity.z5[0] != null) {
                profileActivity.z5[0].setTranslationX(gr8Var.a0(8, true));
            }
            if (profileActivity.z5[1] != null) {
                profileActivity.z5[1].setTranslationX(profileActivity.O.a0(9, false));
            }
            profileActivity.K1(profileActivity.L6);
            profileActivity.J3();
        }
    }

    @Override
    public final int c1(int i) {
        RectF rectF = ProfileActivity.Z6;
        return i;
    }

    @Override
    public final int getInitialTab() {
        return 8;
    }

    @Override
    public final boolean h0() {
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.i1 == profileActivity.getUserConfig().e() && !profileActivity.h1) {
            return true;
        }
        return false;
    }

    @Override
    public final void l1(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr8.l1(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hl.c3(new uk8(this, (byte) 9));
    }

    @Override
    public final boolean r0() {
        return this.y2.s1;
    }

    @Override
    public final boolean s0() {
        return this.y2.s1;
    }
}
