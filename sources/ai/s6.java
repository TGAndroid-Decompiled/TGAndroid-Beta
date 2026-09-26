package ai;

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
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z70;
public final class s6 implements nl0 {
    public final jc f1496a;
    public final k7 f1497b;

    public s6(k7 k7Var, jc jcVar) {
        this.f1497b = k7Var;
        this.f1496a = jcVar;
    }

    @Override
    public final boolean d(int i10, View view) {
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
        k7 k7Var = this.f1497b;
        d dVar = k7Var.f1134s;
        int i11 = k7Var.v;
        if (view instanceof org.telegram.ui.Cells.o6) {
            final org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) view;
            jc jcVar = this.f1496a;
            if (jcVar.v != null && (storyView = ((z6) k7Var.f1135w.f851c.get(i10)).f1780b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                if (messagesController.blockePeers.indexOfKey(user.f18482id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!user.contact && ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.f18482id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = k7Var.d(storyView);
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
                z70 F = z70.F(jcVar.v, dVar, view);
                F.f30821i = 3;
                F.f30823j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19129h5, dVar)));
                F.f30839s = 133;
                if (d && !L && !z10 && !isUserSelf) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z18 = z10;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) {
                    public final s6 f1425b;

                    {
                        this.f1425b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f7 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.o6 o6Var2 = o6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        s6 s6Var = this.f1425b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f18482id, true, true);
                                k7 k7Var2 = s6Var.f1497b;
                                hg.c.q(R.string.StoryHidFromToast, new Object[]{str3}, new xc(k7Var2, k7Var2.f1134s), R.raw.ic_ban, 36);
                                if (k7Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                o6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f18482id, false, true);
                                k7 k7Var3 = s6Var.f1497b;
                                hg.c.q(R.string.StoryShownBackToToast, new Object[]{str3}, new xc(k7Var3, k7Var3.f1134s), R.raw.contact_check, 36);
                                if (k7Var3.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                o6Var2.a(f7, true);
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
                    public final s6 f1425b;

                    {
                        this.f1425b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f7 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.o6 o6Var2 = o6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        s6 s6Var = this.f1425b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f18482id, true, true);
                                k7 k7Var2 = s6Var.f1497b;
                                hg.c.q(R.string.StoryHidFromToast, new Object[]{str3}, new xc(k7Var2, k7Var2.f1134s), R.raw.ic_ban, 36);
                                if (k7Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                o6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f18482id, false, true);
                                k7 k7Var3 = s6Var.f1497b;
                                hg.c.q(R.string.StoryShownBackToToast, new Object[]{str3}, new xc(k7Var3, k7Var3.f1134s), R.raw.contact_check, 36);
                                if (k7Var3.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                o6Var2.a(f7, true);
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
                    public final s6 f1465b;

                    {
                        this.f1465b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f18482id);
                                k7 k7Var2 = this.f1465b.f1497b;
                                new xc(k7Var2, k7Var2.f1134s).e(true).j();
                                if (k7Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                o6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                l9 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f18482id, false, true);
                                messagesController2.unblockPeer(user2.f18482id);
                                k7 k7Var3 = this.f1465b.f1497b;
                                new xc(k7Var3, k7Var3.f1134s).e(false).j();
                                if (k7Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                o6Var.a(f10, true);
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
                    public final s6 f1465b;

                    {
                        this.f1465b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f18482id);
                                k7 k7Var2 = this.f1465b.f1497b;
                                new xc(k7Var2, k7Var2.f1134s).e(true).j();
                                if (k7Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                o6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                l9 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f18482id, false, true);
                                messagesController2.unblockPeer(user2.f18482id);
                                k7 k7Var3 = this.f1465b.f1497b;
                                new xc(k7Var3, k7Var3.f1134s).e(false).j();
                                if (k7Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                o6Var.a(f10, true);
                                return;
                        }
                    }
                }, z15);
                if (z11 && !isUserSelf) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                F.m(z16, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new m3(this, user, str2, o6Var, storyView, 3));
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.q5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    gb0 gb0Var = new gb0(k7Var.v, k7Var.getContext(), dVar, arrayList, 3);
                    gb0Var.setOnClickListener(new d0(this, arrayList, F, 3));
                    F.q(gb0Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (F.x() <= 0 && !z17) {
                    return false;
                }
                F.Z();
                try {
                    k7Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
