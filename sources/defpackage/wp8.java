package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class wp8 extends nha {
    public boolean x2;
    public final ProfileActivity y2;

    public wp8(ProfileActivity profileActivity, Context context, long j, fha fhaVar, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, ProfileActivity profileActivity2, ProfileActivity profileActivity3, ylb ylbVar, km0 km0Var) {
        super(context, j, fhaVar, i, arrayList, chatFull, userFull, i2, i3, profileActivity2, profileActivity3, 1, ylbVar, km0Var);
        this.y2 = profileActivity;
    }

    @Override
    public final void J0(SparseArray sparseArray) {
        char c;
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            if (!nha.t0(selectedTab) && selectedTab != 8) {
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
                    profileActivity.L1(size);
                }
                profileActivity.H5[c].c(size, true);
            }
        }
    }

    @Override
    public final void K0() {
        FrameLayout frameLayout;
        wp8 wp8Var;
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1 && (frameLayout = profileActivity.E5[0]) != null && (wp8Var = profileActivity.O) != null) {
            ProfileActivity.s3(frameLayout, 1.0f - wp8Var.getBottomButtonStoriesVisibility());
        }
    }

    @Override
    public final void N1(boolean z) {
        int i;
        int i2;
        super.N1(z);
        ProfileActivity profileActivity = this.y2;
        boolean z2 = profileActivity.t1;
        lea leaVar = this.b0;
        if (z2 && !profileActivity.w1 && this.L0.d(14)) {
            if (!this.x2 && (i2 = profileActivity.u1) > 0 && leaVar != null) {
                this.x2 = true;
                leaVar.Q = i2;
                leaVar.e();
            }
            profileActivity.w1 = true;
            f1(14);
        } else if (profileActivity.t1 && profileActivity.w1 && !this.x2 && (i = profileActivity.u1) > 0 && leaVar != null) {
            this.x2 = true;
            leaVar.Q = i;
            leaVar.e();
        }
    }

    @Override
    public final boolean O0(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return this.y2.g(chatParticipant, z, false, view);
    }

    @Override
    public final void Q0() {
        RectF rectF = ProfileActivity.e7;
        this.y2.a4(true);
    }

    @Override
    public final void R0(boolean z) {
        int i;
        ProfileActivity profileActivity = this.y2;
        Activity parentActivity = profileActivity.getParentActivity();
        i = ((d) profileActivity).classGuid;
        gm.y2(parentActivity, i);
        profileActivity.a.D0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        su suVar = profileActivity.Z;
        suVar.setPivotX(suVar.getMeasuredWidth() / 2.0f);
        gm.T3(profileActivity.Z, !z, 0.95f, true, true);
        profileActivity.l4(false);
    }

    @Override
    public final void S0() {
        this.y2.W();
    }

    @Override
    public final void T0(float f) {
        K0();
        ProfileActivity profileActivity = this.y2;
        wp8 wp8Var = profileActivity.O;
        if (wp8Var != null && profileActivity.s1) {
            if (profileActivity.E5[0] != null) {
                profileActivity.E5[0].setTranslationX(wp8Var.a0(8, true));
            }
            if (profileActivity.E5[1] != null) {
                profileActivity.E5[1].setTranslationX(profileActivity.O.a0(9, false));
            }
            profileActivity.L1(profileActivity.Q6);
            profileActivity.M3();
        }
    }

    @Override
    public final int c1(int i) {
        RectF rectF = ProfileActivity.e7;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp8.l1(boolean):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm.c3(new pp8(this, (byte) 1));
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
