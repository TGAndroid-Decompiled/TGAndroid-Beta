package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
public final class vm8 implements wc2 {
    public final TLRPC.Chat a;
    public final zc2 b;
    public final ProfileActivity c;

    public vm8(ProfileActivity profileActivity, TLRPC.Chat chat, zc2 zc2Var) {
        this.c = profileActivity;
        this.a = chat;
        this.b = zc2Var;
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
        TLRPC.User V1 = profileActivity.getMessagesController().V1(Long.valueOf(profileActivity.e1));
        if (V1 != null && (chat = this.a) != null && profileActivity.e1 != 0) {
            zc2 zc2Var = this.b;
            if (zc2Var.R && zc2Var.getParentLayout() != null) {
                for (d dVar : zc2Var.getParentLayout().getFragmentStack()) {
                    if (dVar instanceof nf1) {
                        nf1 nf1Var = (nf1) dVar;
                        nf1Var.Y0();
                        gl.c3(new gm8(nf1Var, V1, chat, (byte) 1));
                        return;
                    }
                }
            }
        }
    }
}
