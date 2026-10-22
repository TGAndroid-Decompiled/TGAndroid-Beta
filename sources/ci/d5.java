package ci;

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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zl0;
public final class d5 implements zl0 {
    public final aa f5318a;
    public final u5 f5319b;

    public d5(u5 u5Var, aa aaVar) {
        this.f5319b = u5Var;
        this.f5318a = aaVar;
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
        u5 u5Var = this.f5319b;
        b bVar = u5Var.f6052s;
        int i11 = u5Var.v;
        if (view instanceof org.telegram.ui.Cells.n6) {
            final org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) view;
            aa aaVar = this.f5318a;
            if (aaVar.v != null && (storyView = ((k5) u5Var.f6053w.f5730c.get(i10)).f5562b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                if (messagesController.blockePeers.indexOfKey(user.f20426id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!user.contact && ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.f20426id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = u5Var.d(storyView);
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
                i80 F = i80.F(aaVar.v, bVar, view);
                F.f27170i = 3;
                F.f27172j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21064h5, bVar)));
                F.f27188s = 133;
                if (d && !L && !z10 && !isUserSelf) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) {
                    public final d5 f5246b;

                    {
                        this.f5246b = this;
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
                        d5 d5Var = this.f5246b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f20426id, true, true);
                                u5 u5Var2 = d5Var.f5319b;
                                i2.e.s(R.string.StoryHidFromToast, new Object[]{str3}, new xc(u5Var2, u5Var2.f6052s), R.raw.ic_ban, 36);
                                if (u5Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                n6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f20426id, false, true);
                                u5 u5Var3 = d5Var.f5319b;
                                i2.e.s(R.string.StoryShownBackToToast, new Object[]{str3}, new xc(u5Var3, u5Var3.f6052s), R.raw.contact_check, 36);
                                if (u5Var3.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                n6Var2.a(f7, true);
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
                    public final d5 f5246b;

                    {
                        this.f5246b = this;
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
                        d5 d5Var = this.f5246b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f20426id, true, true);
                                u5 u5Var2 = d5Var.f5319b;
                                i2.e.s(R.string.StoryHidFromToast, new Object[]{str3}, new xc(u5Var2, u5Var2.f6052s), R.raw.ic_ban, 36);
                                if (u5Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                n6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f20426id, false, true);
                                u5 u5Var3 = d5Var.f5319b;
                                i2.e.s(R.string.StoryShownBackToToast, new Object[]{str3}, new xc(u5Var3, u5Var3.f6052s), R.raw.contact_check, 36);
                                if (u5Var3.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                n6Var2.a(f7, true);
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
                    public final d5 f5274b;

                    {
                        this.f5274b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f20426id);
                                u5 u5Var2 = this.f5274b.f5319b;
                                new xc(u5Var2, u5Var2.f6052s).e(true).j();
                                if (u5Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                n6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                i7 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f20426id, false, true);
                                messagesController2.unblockPeer(user2.f20426id);
                                u5 u5Var3 = this.f5274b.f5319b;
                                new xc(u5Var3, u5Var3.f6052s).e(false).j();
                                if (u5Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                n6Var.a(f10, true);
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
                    public final d5 f5274b;

                    {
                        this.f5274b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f20426id);
                                u5 u5Var2 = this.f5274b.f5319b;
                                new xc(u5Var2, u5Var2.f6052s).e(true).j();
                                if (u5Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                n6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                i7 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f20426id, false, true);
                                messagesController2.unblockPeer(user2.f20426id);
                                u5 u5Var3 = this.f5274b.f5319b;
                                new xc(u5Var3, u5Var3.f6052s).e(false).j();
                                if (u5Var3.d(storyView)) {
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
                F.m(z16, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new ai.t0(this, user, str2, n6Var, storyView, 11));
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.r5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    ob0 ob0Var = new ob0(u5Var.v, 3, u5Var.getContext(), arrayList, bVar);
                    ob0Var.setOnClickListener(new ai.v0(this, arrayList, F, 6));
                    F.q(ob0Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (F.x() <= 0 && !z17) {
                    return false;
                }
                F.Z();
                try {
                    u5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
