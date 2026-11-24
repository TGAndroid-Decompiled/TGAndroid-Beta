package defpackage;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;
public final class ql8 implements ka5, gra, ed, sc7, no7, ol8, e39, x74, fi4 {
    public final byte a;
    public final ProfileActivity b;

    public ql8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        RectF rectF = ProfileActivity.Z6;
        int i = vxcVar.a.f(519).d;
        ProfileActivity profileActivity = this.b;
        profileActivity.P6 = i;
        FrameLayout frameLayout = profileActivity.y5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i2 = profileActivity.P6 + profileActivity.O6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i2) {
                marginLayoutParams.bottomMargin = i2;
                profileActivity.y5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.O != null) {
            profileActivity.y1();
            lca lcaVar = profileActivity.O.b0;
            if (lcaVar != null) {
                lcaVar.setButtonOffset(profileActivity.P6 + profileActivity.O6);
            }
        }
        return vxc.b;
    }

    @Override
    public final boolean d(int i, View view) {
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.b;
        to8 to8Var = profileActivity.e;
        if (to8Var.x || to8Var.w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
        String M0 = k96.M0(2131752044, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752049, null);
        alertDialog$Builder.j(k96.M0(2131752087, null), new ql8(profileActivity, (byte) 10));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        profileActivity.showDialog(hdVar);
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, null);
            return true;
        }
        return true;
    }

    @Override
    public final void f(int i, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        RectF rectF = ProfileActivity.Z6;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.b;
        TLRPC.ChatFull chatFull = profileActivity.v2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i2 = 0; i2 < profileActivity.v2.participants.participants.size(); i2++) {
                hashSet.add(Long.valueOf(profileActivity.v2.participants.participants.get(i2).user_id));
            }
        }
        profileActivity.getMessagesController().l(profileActivity.F2, profileActivity, arrayList, i, new gw(arrayList2, (byte) 13), new gw(profileActivity, (byte) 14), new pc7(profileActivity, arrayList2, hashSet, (byte) 29));
    }

    @Override
    public final void k(boolean z) {
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.b;
        profileActivity.J1 = (byte) 0;
        kk7 notificationCenter = profileActivity.getNotificationCenter();
        int i = kk7.s;
        notificationCenter.n(profileActivity, i);
        profileActivity.getNotificationCenter().k(i, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(kk7.J2, Long.valueOf(-profileActivity.F2.id), null, profileActivity.F2, Boolean.valueOf(z));
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        RectF rectF = ProfileActivity.Z6;
        this.b.I3();
    }

    @Override
    public final boolean run() {
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.b;
        if (profileActivity.E2 == null && !profileActivity.p2()) {
            return false;
        }
        return true;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 2:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getMessagesController().t(profileActivity.e1);
                if (u21.a(profileActivity)) {
                    u21.d(profileActivity, true).j();
                    return;
                }
                return;
            case 9:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.getClass();
                gba.k = null;
                gba.l = null;
                gba.x();
                profileActivity.getConnectionsManager().switchBackend(true);
                return;
            default:
                RectF rectF3 = ProfileActivity.Z6;
                to8 to8Var = profileActivity.e;
                to8Var.w.clear();
                na7.c1().edit().remove("settingsSearchRecent2").commit();
                to8Var.f();
                return;
        }
    }

    @Override
    public final void e(TLRPC.User user) {
    }

    @Override
    public final void F(float f, int i) {
    }
}
