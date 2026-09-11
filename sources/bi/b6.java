package bi;

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
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.yc;
public final class b6 implements bl0 {
    public final pb f2798a;
    public final s6 f2799b;

    public b6(s6 s6Var, pb pbVar) {
        this.f2799b = s6Var;
        this.f2798a = pbVar;
    }

    @Override
    public final boolean a(int i10, View view) {
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
        TLRPC.InputStickerSet c10;
        s6 s6Var = this.f2799b;
        b bVar = s6Var.f3697s;
        int i11 = s6Var.v;
        if (view instanceof org.telegram.ui.Cells.n6) {
            final org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) view;
            pb pbVar = this.f2798a;
            if (pbVar.v != null && (storyView = ((i6) s6Var.f3698w.f3370c.get(i10)).f3097b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                if (messagesController.blockePeers.indexOfKey(user.f20016id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!user.contact && ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.f20016id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = s6Var.d(storyView);
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
                n70 F = n70.F(pbVar.v, bVar, view);
                F.f28642i = 3;
                F.f28644j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20734h5, bVar)));
                F.f28660s = 133;
                if (d && !L && !z10 && !isUserSelf) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z18 = z10;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) {
                    public final b6 f4056b;

                    {
                        this.f4056b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f7 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        b6 b6Var = this.f4056b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f20016id, true, true);
                                s6 s6Var2 = b6Var.f2799b;
                                i2.g.s(R.string.StoryHidFromToast, new Object[]{str3}, new yc(s6Var2, s6Var2.f3697s), R.raw.ic_ban, 36);
                                if (s6Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                n6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f20016id, false, true);
                                s6 s6Var3 = b6Var.f2799b;
                                i2.g.s(R.string.StoryShownBackToToast, new Object[]{str3}, new yc(s6Var3, s6Var3.f3697s), R.raw.contact_check, 36);
                                if (s6Var3.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                n6Var2.a(f7, true);
                                return;
                        }
                    }
                }, z12);
                F.E();
                F.t();
                if (L && !z18 && !isUserSelf) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                F.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str2), new Runnable(this) {
                    public final b6 f4056b;

                    {
                        this.f4056b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f7 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        b6 b6Var = this.f4056b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f20016id, true, true);
                                s6 s6Var2 = b6Var.f2799b;
                                i2.g.s(R.string.StoryHidFromToast, new Object[]{str3}, new yc(s6Var2, s6Var2.f3697s), R.raw.ic_ban, 36);
                                if (s6Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                n6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f20016id, false, true);
                                s6 s6Var3 = b6Var.f2799b;
                                i2.g.s(R.string.StoryShownBackToToast, new Object[]{str3}, new yc(s6Var3, s6Var3.f3697s), R.raw.contact_check, 36);
                                if (s6Var3.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                n6Var2.a(f7, true);
                                return;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                if (!z11 && !z18 && !isUserSelf) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                F.m(z14, R.drawable.msg_user_remove, LocaleController.getString(R.string.BlockUser), true, new Runnable(this) {
                    public final b6 f2757b;

                    {
                        this.f2757b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f20016id);
                                s6 s6Var2 = this.f2757b.f2799b;
                                new yc(s6Var2, s6Var2.f3697s).e(true).j();
                                if (s6Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                n6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                u8 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f20016id, false, true);
                                messagesController2.unblockPeer(user2.f20016id);
                                s6 s6Var3 = this.f2757b.f2799b;
                                new yc(s6Var3, s6Var3.f3697s).e(false).j();
                                if (s6Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                n6Var.a(f10, true);
                                return;
                        }
                    }
                });
                if (!z11 && z18 && !isUserSelf) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                F.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) {
                    public final b6 f2757b;

                    {
                        this.f2757b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f20016id);
                                s6 s6Var2 = this.f2757b.f2799b;
                                new yc(s6Var2, s6Var2.f3697s).e(true).j();
                                if (s6Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                n6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                u8 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f20016id, false, true);
                                messagesController2.unblockPeer(user2.f20016id);
                                s6 s6Var3 = this.f2757b.f2799b;
                                new yc(s6Var3, s6Var3.f3697s).e(false).j();
                                if (s6Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                n6Var.a(f10, true);
                                return;
                        }
                    }
                }, z15);
                if (z11 && !isUserSelf) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                F.m(z16, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new z2(this, user, str2, n6Var, storyView, 3));
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.q5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    ua0 ua0Var = new ua0(s6Var.v, s6Var.getContext(), bVar, arrayList, 3);
                    ua0Var.setOnClickListener(new x(this, arrayList, F, 3));
                    F.q(ua0Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (F.x() <= 0 && !z17) {
                    return false;
                }
                F.Z();
                try {
                    s6Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
