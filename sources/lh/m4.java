package lh;

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
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.th;
public final class m4 implements bl0 {
    public final i9 f15924a;
    public final c5 f15925b;

    public m4(c5 c5Var, i9 i9Var) {
        this.f15925b = c5Var;
        this.f15924a = i9Var;
    }

    @Override
    public final boolean c(int i10, View view) {
        final TL_stories.StoryView storyView;
        final MessagesController messagesController;
        final TLRPC.User user;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        TLRPC.InputStickerSet c3;
        c5 c5Var = this.f15925b;
        b bVar = c5Var.f15439s;
        int i11 = c5Var.v;
        if (view instanceof org.telegram.ui.Cells.l6) {
            final org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) view;
            i9 i9Var = this.f15924a;
            if (i9Var.v != null && (storyView = ((t4) c5Var.f15440w.f16417c.get(i10)).f16262b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                if (messagesController.blockePeers.indexOfKey(user.f22539id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!user.contact && ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.f22539id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = c5Var.d(storyView);
                boolean L = messagesController.getStoriesController().L(storyView);
                boolean isUserSelf = UserObject.isUserSelf(user);
                if (TextUtils.isEmpty(user.first_name)) {
                    if (TextUtils.isEmpty(user.last_name)) {
                        str = "";
                    } else {
                        str = user.last_name;
                    }
                } else {
                    str = user.first_name;
                }
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (isUserSelf) {
                    return false;
                }
                j70 F = j70.F(i9Var.v, bVar, view);
                F.f29582i = 3;
                F.f29584j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, bVar)));
                F.f29600s = 133;
                if (d && !L && !z10 && !isUserSelf) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) {
                    public final m4 f15826b;

                    {
                        this.f15826b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f9 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.l6 l6Var2 = l6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        m4 m4Var = this.f15826b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f22539id, true, true);
                                c5 c5Var2 = m4Var.f15925b;
                                th.r(R.string.StoryHidFromToast, new Object[]{str3}, new tc(c5Var2, c5Var2.f15439s), R.raw.ic_ban, 36);
                                if (c5Var2.d(storyView2)) {
                                    f9 = 1.0f;
                                }
                                l6Var2.a(f9, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f22539id, false, true);
                                c5 c5Var3 = m4Var.f15925b;
                                th.r(R.string.StoryShownBackToToast, new Object[]{str3}, new tc(c5Var3, c5Var3.f15439s), R.raw.contact_check, 36);
                                if (c5Var3.d(storyView2)) {
                                    f9 = 1.0f;
                                }
                                l6Var2.a(f9, true);
                                return;
                        }
                    }
                }, z12);
                F.E();
                F.t();
                if (L && !z10 && !isUserSelf) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                F.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str2), new Runnable(this) {
                    public final m4 f15826b;

                    {
                        this.f15826b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f9 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.l6 l6Var2 = l6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        m4 m4Var = this.f15826b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f22539id, true, true);
                                c5 c5Var2 = m4Var.f15925b;
                                th.r(R.string.StoryHidFromToast, new Object[]{str3}, new tc(c5Var2, c5Var2.f15439s), R.raw.ic_ban, 36);
                                if (c5Var2.d(storyView2)) {
                                    f9 = 1.0f;
                                }
                                l6Var2.a(f9, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f22539id, false, true);
                                c5 c5Var3 = m4Var.f15925b;
                                th.r(R.string.StoryShownBackToToast, new Object[]{str3}, new tc(c5Var3, c5Var3.f15439s), R.raw.contact_check, 36);
                                if (c5Var3.d(storyView2)) {
                                    f9 = 1.0f;
                                }
                                l6Var2.a(f9, true);
                                return;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                if (!z11 && !z10 && !isUserSelf) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                F.m(z14, R.drawable.msg_user_remove, LocaleController.getString(R.string.BlockUser), true, new Runnable(this) {
                    public final m4 f15878b;

                    {
                        this.f15878b = this;
                    }

                    @Override
                    public final void run() {
                        float f9;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f22539id);
                                c5 c5Var2 = this.f15878b.f15925b;
                                new tc(c5Var2, c5Var2.f15439s).e(true).j();
                                if (c5Var2.d(storyView)) {
                                    f9 = 1.0f;
                                } else {
                                    f9 = 0.5f;
                                }
                                l6Var.a(f9, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                s6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f22539id, false, true);
                                messagesController2.unblockPeer(user2.f22539id);
                                c5 c5Var3 = this.f15878b.f15925b;
                                new tc(c5Var3, c5Var3.f15439s).e(false).j();
                                if (c5Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                l6Var.a(f10, true);
                                return;
                        }
                    }
                });
                if (!z11 && z10 && !isUserSelf) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                F.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) {
                    public final m4 f15878b;

                    {
                        this.f15878b = this;
                    }

                    @Override
                    public final void run() {
                        float f9;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f22539id);
                                c5 c5Var2 = this.f15878b.f15925b;
                                new tc(c5Var2, c5Var2.f15439s).e(true).j();
                                if (c5Var2.d(storyView)) {
                                    f9 = 1.0f;
                                } else {
                                    f9 = 0.5f;
                                }
                                l6Var.a(f9, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                s6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f22539id, false, true);
                                messagesController2.unblockPeer(user2.f22539id);
                                c5 c5Var3 = this.f15878b.f15925b;
                                new tc(c5Var3, c5Var3.f15439s).e(false).j();
                                if (c5Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                l6Var.a(f10, true);
                                return;
                        }
                    }
                }, z15);
                if (z11 && !isUserSelf) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                F.m(z16, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new eg.k0(this, user, str2, l6Var, storyView, 16));
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c3 = org.telegram.ui.Components.p5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c3);
                    qa0 qa0Var = new qa0(c5Var.v, c5Var.getContext(), bVar, arrayList, 3);
                    qa0Var.setOnClickListener(new bg.q(this, arrayList, F, 13));
                    F.q(qa0Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (F.x() <= 0 && !z17) {
                    return false;
                }
                F.Z();
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
