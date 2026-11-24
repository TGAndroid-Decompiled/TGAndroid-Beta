package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
public final class wo8 implements he2 {
    public final TLRPC.Chat a;
    public final ke2 b;
    public final ProfileActivity c;

    public wo8(ProfileActivity profileActivity, TLRPC.Chat chat, ke2 ke2Var) {
        this.c = profileActivity;
        this.a = chat;
        this.b = ke2Var;
    }

    @Override
    public final void a(TLRPC.User user) {
        int i;
        ProfileActivity profileActivity = this.c;
        UndoView undoView = profileActivity.M;
        long j = -profileActivity.f1;
        if (profileActivity.F2.megagroup) {
            i = 10;
        } else {
            i = 9;
        }
        undoView.m(user, i, j);
    }

    @Override
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User W1 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
        if (W1 != null && (chat = this.a) != null && profileActivity.e1 != 0) {
            ke2 ke2Var = this.b;
            if (ke2Var.R && ke2Var.getParentLayout() != null) {
                for (d dVar : ke2Var.getParentLayout().getFragmentStack()) {
                    if (dVar instanceof vg1) {
                        vg1 vg1Var = (vg1) dVar;
                        vg1Var.Z0();
                        gm.c3(new ak8((Object) vg1Var, (Object) W1, (Object) chat, (byte) 4));
                        return;
                    }
                }
            }
        }
    }
}
