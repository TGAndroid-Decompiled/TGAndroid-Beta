package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
public final class gq8 implements md2 {
    public final TLRPC.Chat a;
    public final pd2 b;
    public final ProfileActivity c;

    public gq8(ProfileActivity profileActivity, TLRPC.Chat chat, pd2 pd2Var) {
        this.c = profileActivity;
        this.a = chat;
        this.b = pd2Var;
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
        undoView.m(j, user, i);
    }

    @Override
    public final void b(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.Chat chat;
        ProfileActivity profileActivity = this.c;
        profileActivity.removeSelfFromStack();
        TLRPC.User X1 = profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1));
        if (X1 != null && (chat = this.a) != null && profileActivity.e1 != 0) {
            pd2 pd2Var = this.b;
            if (pd2Var.R && pd2Var.getParentLayout() != null) {
                for (e eVar : pd2Var.getParentLayout().getFragmentStack()) {
                    if (eVar instanceof wf1) {
                        wf1 wf1Var = (wf1) eVar;
                        wf1Var.Z0();
                        hl.c3(new sa8(wf1Var, X1, chat, (byte) 9));
                        return;
                    }
                }
            }
        }
    }
}
