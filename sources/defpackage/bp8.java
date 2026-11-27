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
public final class bp8 implements kk4, fd, nr7, zo8, t69, s84, iva, lc5, cf7 {
    public final byte a;
    public final ProfileActivity b;

    public bp8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void A(boolean z) {
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.b;
        profileActivity.J1 = (byte) 0;
        jn7 notificationCenter = profileActivity.getNotificationCenter();
        int i = jn7.s;
        notificationCenter.n(profileActivity, i);
        profileActivity.getNotificationCenter().k(i, new Object[0]);
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(jn7.K2, Long.valueOf(-profileActivity.F2.id), null, profileActivity.F2, Boolean.valueOf(z));
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        RectF rectF = ProfileActivity.Z6;
        int i = l2dVar.a.f(519).d;
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
            profileActivity.z1();
            cga cgaVar = profileActivity.O.b0;
            if (cgaVar != null) {
                cgaVar.setButtonOffset(profileActivity.P6 + profileActivity.O6);
            }
        }
        return l2d.b;
    }

    @Override
    public final boolean e(int i, View view) {
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.b;
        fs8 fs8Var = profileActivity.e;
        if (fs8Var.x || fs8Var.w.isEmpty()) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
        String M0 = ob6.M0(2131752021, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752026, null);
        alertDialog$Builder.j(ob6.M0(2131752064, null), new bp8(profileActivity, (byte) 1));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        profileActivity.showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, null);
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
        profileActivity.getMessagesController().l(profileActivity.F2, profileActivity, arrayList, i, new hw(arrayList2, (byte) 13), new hw(profileActivity, (byte) 14), new sa8(profileActivity, arrayList2, hashSet, (byte) 8));
    }

    @Override
    public final boolean run() {
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.b;
        if (profileActivity.E2 == null && !profileActivity.q2()) {
            return false;
        }
        return true;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        RectF rectF = ProfileActivity.Z6;
        this.b.J3();
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 1:
                RectF rectF = ProfileActivity.Z6;
                fs8 fs8Var = profileActivity.e;
                fs8Var.w.clear();
                uc7.e1().edit().remove("settingsSearchRecent2").commit();
                fs8Var.f();
                return;
            case 2:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.getClass();
                xea.k = null;
                xea.l = null;
                xea.x();
                profileActivity.getConnectionsManager().switchBackend(true);
                return;
            default:
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity.getMessagesController().u(profileActivity.e1);
                if (d31.a(profileActivity)) {
                    d31.d(profileActivity, true).j();
                    return;
                }
                return;
        }
    }

    @Override
    public final void d(TLRPC.User user) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}
