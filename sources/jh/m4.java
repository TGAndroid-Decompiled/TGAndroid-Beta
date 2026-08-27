package jh;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.rk0;

public final class m4 implements rk0 {

    public final i9 f13654a;

    public final c5 f13655b;

    public m4(c5 c5Var, i9 i9Var) {
        this.f13655b = c5Var;
        this.f13654a = i9Var;
    }

    @Override
    public final boolean a(int i10, View view) {
        final TL_stories.StoryView storyView;
        final MessagesController messagesController;
        final TLRPC.User user;
        String strSubstring;
        boolean z10;
        TLRPC.InputStickerSet inputStickerSetC;
        c5 c5Var = this.f13655b;
        b bVar = c5Var.f13157s;
        int i11 = c5Var.v;
        if (view instanceof org.telegram.ui.Cells.k6) {
            final org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
            i9 i9Var = this.f13654a;
            if (i9Var.v != null && (storyView = ((t4) c5Var.f13158w.f14152c.get(i10)).f13997b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                boolean z11 = messagesController.blockePeers.indexOfKey(user.f22527id) >= 0;
                boolean z12 = user.contact || ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.f22527id)) != null;
                boolean zD = c5Var.d(storyView);
                boolean zL = messagesController.getStoriesController().L(storyView);
                boolean zIsUserSelf = UserObject.isUserSelf(user);
                if (TextUtils.isEmpty(user.first_name)) {
                    strSubstring = TextUtils.isEmpty(user.last_name) ? "" : user.last_name;
                } else {
                    strSubstring = user.first_name;
                }
                int iIndexOf = strSubstring.indexOf(" ");
                if (iIndexOf > 2) {
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
                if (zIsUserSelf) {
                    return false;
                }
                b70 b70VarF = b70.F(i9Var.v, bVar, view);
                b70VarF.f26974i = 3;
                b70VarF.f26976j = true;
                b70VarF.W(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, bVar)));
                b70VarF.f26992s = 133;
                boolean z13 = (!zD || zL || z11 || zIsUserSelf) ? false : true;
                final int i12 = 0;
                final String str = strSubstring;
                b70VarF.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, strSubstring), new Runnable(this) {

                    public final m4 f13573b;

                    {
                        this.f13573b = this;
                    }

                    @Override
                    public final void run() {
                        int i13 = i12;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.k6 k6Var2 = k6Var;
                        String str2 = str;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        m4 m4Var = this.f13573b;
                        switch (i13) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f22527id, true, true);
                                c5 c5Var2 = m4Var.f13655b;
                                pa.r(R.string.StoryHidFromToast, new Object[]{str2}, new mc(c5Var2, c5Var2.f13157s), R.raw.ic_ban, 36);
                                k6Var2.a(c5Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.f22527id, false, true);
                                c5 c5Var3 = m4Var.f13655b;
                                pa.r(R.string.StoryShownBackToToast, new Object[]{str2}, new mc(c5Var3, c5Var3.f13157s), R.raw.contact_check, 36);
                                k6Var2.a(c5Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, z13);
                b70VarF.E();
                b70VarF.t();
                final int i13 = 1;
                b70VarF.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str), new Runnable(this) {

                    public final m4 f13573b;

                    {
                        this.f13573b = this;
                    }

                    @Override
                    public final void run() {
                        int i14 = i13;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.k6 k6Var2 = k6Var;
                        String str2 = str;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        m4 m4Var = this.f13573b;
                        switch (i14) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f22527id, true, true);
                                c5 c5Var2 = m4Var.f13655b;
                                pa.r(R.string.StoryHidFromToast, new Object[]{str2}, new mc(c5Var2, c5Var2.f13157s), R.raw.ic_ban, 36);
                                k6Var2.a(c5Var2.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                messagesController2.getStoriesController().j0(user2.f22527id, false, true);
                                c5 c5Var3 = m4Var.f13655b;
                                pa.r(R.string.StoryShownBackToToast, new Object[]{str2}, new mc(c5Var3, c5Var3.f13157s), R.raw.contact_check, 36);
                                k6Var2.a(c5Var3.d(storyView2) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (!zL || z11 || zIsUserSelf) ? false : true);
                b70VarF.E();
                b70VarF.t();
                final int i14 = 0;
                b70VarF.m((z12 || z11 || zIsUserSelf) ? false : true, R.drawable.msg_user_remove, LocaleController.getString(R.string.BlockUser), true, new Runnable(this) {

                    public final m4 f13615b;

                    {
                        this.f13615b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i14) {
                            case 0:
                                messagesController.blockPeer(user.f22527id);
                                c5 c5Var2 = this.f13615b.f13655b;
                                new mc(c5Var2, c5Var2.f13157s).e(true).j();
                                k6Var.a(c5Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                s6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f22527id, false, true);
                                messagesController2.unblockPeer(user2.f22527id);
                                c5 c5Var3 = this.f13615b.f13655b;
                                new mc(c5Var3, c5Var3.f13157s).e(false).j();
                                k6Var.a(c5Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                });
                final int i15 = 1;
                b70VarF.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) {

                    public final m4 f13615b;

                    {
                        this.f13615b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i15) {
                            case 0:
                                messagesController.blockPeer(user.f22527id);
                                c5 c5Var2 = this.f13615b.f13655b;
                                new mc(c5Var2, c5Var2.f13157s).e(true).j();
                                k6Var.a(c5Var2.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                            default:
                                MessagesController messagesController2 = messagesController;
                                s6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f22527id, false, true);
                                messagesController2.unblockPeer(user2.f22527id);
                                c5 c5Var3 = this.f13615b.f13655b;
                                new mc(c5Var3, c5Var3.f13157s).e(false).j();
                                k6Var.a(c5Var3.d(storyView) ? 1.0f : 0.5f, true);
                                break;
                        }
                    }
                }, (z12 || !z11 || zIsUserSelf) ? false : true);
                b70VarF.m(z12 && !zIsUserSelf, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new cg.k0(this, user, str, k6Var, storyView, 16));
                TLRPC.Reaction reaction = storyView.reaction;
                if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || (inputStickerSetC = org.telegram.ui.Components.k5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) == null) {
                    z10 = false;
                } else {
                    b70VarF.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(inputStickerSetC);
                    ga0 ga0Var = new ga0(c5Var.v, c5Var.getContext(), bVar, arrayList, 3);
                    ga0Var.setOnClickListener(new gg.f(this, arrayList, b70VarF, 12));
                    b70VarF.q(ga0Var);
                    z10 = true;
                }
                if (b70VarF.x() <= 0 && !z10) {
                    return false;
                }
                b70VarF.Z();
                try {
                    c5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
