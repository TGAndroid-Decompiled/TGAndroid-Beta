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
public final class tn8 implements ic5, hta, ee, ue7, qq7, pn8, h59, g94, kk4 {
    public final byte a;
    public final ProfileActivity b;

    public tn8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        RectF rectF = ProfileActivity.e7;
        int i = wzcVar.a.f(519).d;
        ProfileActivity profileActivity = this.b;
        profileActivity.U6 = i;
        FrameLayout frameLayout = profileActivity.D5;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i2 = profileActivity.U6 + profileActivity.T6;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i2) {
                marginLayoutParams.bottomMargin = i2;
                profileActivity.D5.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileActivity.O != null) {
            profileActivity.A1();
            lea leaVar = profileActivity.O.b0;
            if (leaVar != null) {
                leaVar.setButtonOffset(profileActivity.U6 + profileActivity.T6);
            }
        }
        return wzc.b;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        RectF rectF = ProfileActivity.e7;
        this.b.M3();
    }

    @Override
    public final void f(int i, ArrayList arrayList) {
        TLRPC.ChatParticipants chatParticipants;
        RectF rectF = ProfileActivity.e7;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ProfileActivity profileActivity = this.b;
        TLRPC.ChatFull chatFull = profileActivity.v2;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i2 = 0; i2 < profileActivity.v2.participants.participants.size(); i2++) {
                hashSet.add(Long.valueOf(profileActivity.v2.participants.participants.get(i2).user_id));
            }
        }
        profileActivity.getMessagesController().l(profileActivity.F2, profileActivity, arrayList, i, new gx(arrayList2, (byte) 13), new gx(profileActivity, (byte) 14), new ak8(profileActivity, arrayList2, hashSet, (byte) 2));
    }

    @Override
    public final boolean g(int i, View view) {
        RectF rectF = ProfileActivity.e7;
        ProfileActivity profileActivity = this.b;
        uq8 uq8Var = profileActivity.e;
        if (uq8Var.x || uq8Var.w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
        String M0 = jb6.M0(2131751993, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131751998, null);
        alertDialog$Builder.j(jb6.M0(2131752036, null), new tn8(profileActivity, (byte) 10));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        profileActivity.showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, null);
            return true;
        }
        return true;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 2:
                RectF rectF = ProfileActivity.e7;
                profileActivity.getMessagesController().t(profileActivity.e1);
                if (c41.a(profileActivity)) {
                    c41.d(profileActivity, true).j();
                    return;
                }
                return;
            case 9:
                RectF rectF2 = ProfileActivity.e7;
                profileActivity.getClass();
                gda.k = null;
                gda.l = null;
                gda.x();
                profileActivity.getConnectionsManager().switchBackend(true);
                return;
            default:
                RectF rectF3 = ProfileActivity.e7;
                uq8 uq8Var = profileActivity.e;
                uq8Var.w.clear();
                oc7.d1().edit().remove("settingsSearchRecent2").commit();
                uq8Var.f();
                return;
        }
    }

    @Override
    public final boolean run() {
        RectF rectF = ProfileActivity.e7;
        ProfileActivity profileActivity = this.b;
        if (profileActivity.E2 == null && !profileActivity.s2()) {
            return false;
        }
        return true;
    }

    @Override
    public final void z(boolean z) {
        RectF rectF = ProfileActivity.e7;
        ProfileActivity profileActivity = this.b;
        profileActivity.J1 = (byte) 0;
        nm7 notificationCenter = profileActivity.getNotificationCenter();
        int i = nm7.s;
        notificationCenter.n(profileActivity, i);
        profileActivity.getNotificationCenter().k(i, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(nm7.K2, Long.valueOf(-profileActivity.F2.id), null, profileActivity.F2, Boolean.valueOf(z));
    }

    @Override
    public final void d(TLRPC.User user) {
    }

    @Override
    public final void V(float f, int i) {
    }
}
