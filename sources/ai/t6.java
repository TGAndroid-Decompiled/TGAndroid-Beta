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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.Components.zc;
public final class t6 implements mm0 {
    public final kc f1734a;
    public final l7 f1735b;

    public t6(l7 l7Var, kc kcVar) {
        this.f1735b = l7Var;
        this.f1734a = kcVar;
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
        l7 l7Var = this.f1735b;
        d dVar = l7Var.f1339s;
        int i11 = l7Var.v;
        if (view instanceof org.telegram.ui.Cells.o6) {
            final org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) view;
            kc kcVar = this.f1734a;
            if (kcVar.v != null && (storyView = ((a7) l7Var.f1340w.f1028c.get(i10)).f646b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                if (messagesController.blockePeers.indexOfKey(user.f19950id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!user.contact && ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.f19950id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = l7Var.d(storyView);
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
                s80 F = s80.F(kcVar.v, dVar, view);
                F.f30450i = 3;
                F.f30452j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20631h5, dVar)));
                F.f30468s = 133;
                if (d && !L && !z10 && !isUserSelf) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z18 = z10;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) {
                    public final t6 f1657b;

                    {
                        this.f1657b = this;
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
                        t6 t6Var = this.f1657b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f19950id, true, true);
                                l7 l7Var2 = t6Var.f1735b;
                                hg.c.s(R.string.StoryHidFromToast, new Object[]{str3}, new zc(l7Var2, l7Var2.f1339s), R.raw.ic_ban, 36);
                                if (l7Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                o6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f19950id, false, true);
                                l7 l7Var3 = t6Var.f1735b;
                                hg.c.s(R.string.StoryShownBackToToast, new Object[]{str3}, new zc(l7Var3, l7Var3.f1339s), R.raw.contact_check, 36);
                                if (l7Var3.d(storyView2)) {
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
                    public final t6 f1657b;

                    {
                        this.f1657b = this;
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
                        t6 t6Var = this.f1657b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f19950id, true, true);
                                l7 l7Var2 = t6Var.f1735b;
                                hg.c.s(R.string.StoryHidFromToast, new Object[]{str3}, new zc(l7Var2, l7Var2.f1339s), R.raw.ic_ban, 36);
                                if (l7Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                o6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f19950id, false, true);
                                l7 l7Var3 = t6Var.f1735b;
                                hg.c.s(R.string.StoryShownBackToToast, new Object[]{str3}, new zc(l7Var3, l7Var3.f1339s), R.raw.contact_check, 36);
                                if (l7Var3.d(storyView2)) {
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
                    public final t6 f1702b;

                    {
                        this.f1702b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f19950id);
                                l7 l7Var2 = this.f1702b.f1735b;
                                new zc(l7Var2, l7Var2.f1339s).e(true).j();
                                if (l7Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                o6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                m9 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f19950id, false, true);
                                messagesController2.unblockPeer(user2.f19950id);
                                l7 l7Var3 = this.f1702b.f1735b;
                                new zc(l7Var3, l7Var3.f1339s).e(false).j();
                                if (l7Var3.d(storyView)) {
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
                    public final t6 f1702b;

                    {
                        this.f1702b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f19950id);
                                l7 l7Var2 = this.f1702b.f1735b;
                                new zc(l7Var2, l7Var2.f1339s).e(true).j();
                                if (l7Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                o6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                m9 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f19950id, false, true);
                                messagesController2.unblockPeer(user2.f19950id);
                                l7 l7Var3 = this.f1702b.f1735b;
                                new zc(l7Var3, l7Var3.f1339s).e(false).j();
                                if (l7Var3.d(storyView)) {
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
                F.m(z16, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new n3(this, user, str2, o6Var, storyView, 3));
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.s5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    zb0 zb0Var = new zb0(l7Var.v, 3, l7Var.getContext(), arrayList, dVar);
                    zb0Var.setOnClickListener(new d0(this, arrayList, F, 3));
                    F.q(zb0Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (F.x() <= 0 && !z17) {
                    return false;
                }
                F.Z();
                try {
                    l7Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
