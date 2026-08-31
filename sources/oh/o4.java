package oh;

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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.yh;
public final class o4 implements ll0 {
    public final i9 f17549a;
    public final e5 f17550b;

    public o4(e5 e5Var, i9 i9Var) {
        this.f17550b = e5Var;
        this.f17549a = i9Var;
    }

    @Override
    public final boolean f(int i10, View view) {
        final TL_stories.StoryView storyView;
        final MessagesController messagesController;
        final TLRPC.User user;
        boolean z4;
        boolean z10;
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        TLRPC.InputStickerSet c3;
        e5 e5Var = this.f17550b;
        b bVar = e5Var.f17032s;
        int i11 = e5Var.v;
        if (view instanceof org.telegram.ui.Cells.n6) {
            final org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) view;
            i9 i9Var = this.f17549a;
            if (i9Var.v != null && (storyView = ((v4) e5Var.f17033w.f16842c.get(i10)).f17848b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                if (messagesController.blockePeers.indexOfKey(user.f20990id) >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!user.contact && ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.f20990id)) == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean d = e5Var.d(storyView);
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
                q70 F = q70.F(i9Var.v, bVar, view);
                F.f30311i = 3;
                F.f30313j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, bVar)));
                F.f30329s = 133;
                if (d && !L && !z4 && !isUserSelf) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) {
                    public final o4 f17433b;

                    {
                        this.f17433b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        o4 o4Var = this.f17433b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f20990id, true, true);
                                e5 e5Var2 = o4Var.f17550b;
                                yh.s(R.string.StoryHidFromToast, new Object[]{str3}, new qc(e5Var2, e5Var2.f17032s), R.raw.ic_ban, 36);
                                if (e5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                n6Var2.a(f10, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f20990id, false, true);
                                e5 e5Var3 = o4Var.f17550b;
                                yh.s(R.string.StoryShownBackToToast, new Object[]{str3}, new qc(e5Var3, e5Var3.f17032s), R.raw.contact_check, 36);
                                if (e5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                n6Var2.a(f10, true);
                                return;
                        }
                    }
                }, z11);
                F.E();
                F.t();
                if (L && !z4 && !isUserSelf) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                F.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str2), new Runnable(this) {
                    public final o4 f17433b;

                    {
                        this.f17433b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        o4 o4Var = this.f17433b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f20990id, true, true);
                                e5 e5Var2 = o4Var.f17550b;
                                yh.s(R.string.StoryHidFromToast, new Object[]{str3}, new qc(e5Var2, e5Var2.f17032s), R.raw.ic_ban, 36);
                                if (e5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                n6Var2.a(f10, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f20990id, false, true);
                                e5 e5Var3 = o4Var.f17550b;
                                yh.s(R.string.StoryShownBackToToast, new Object[]{str3}, new qc(e5Var3, e5Var3.f17032s), R.raw.contact_check, 36);
                                if (e5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                n6Var2.a(f10, true);
                                return;
                        }
                    }
                }, z12);
                F.E();
                F.t();
                if (!z10 && !z4 && !isUserSelf) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                F.m(z13, R.drawable.msg_user_remove, LocaleController.getString(R.string.BlockUser), true, new Runnable(this) {
                    public final o4 f17483b;

                    {
                        this.f17483b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f20990id);
                                e5 e5Var2 = this.f17483b.f17550b;
                                new qc(e5Var2, e5Var2.f17032s).e(true).j();
                                if (e5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                n6Var.a(f10, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                t6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f20990id, false, true);
                                messagesController2.unblockPeer(user2.f20990id);
                                e5 e5Var3 = this.f17483b.f17550b;
                                new qc(e5Var3, e5Var3.f17032s).e(false).j();
                                if (e5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                n6Var.a(f11, true);
                                return;
                        }
                    }
                });
                if (!z10 && z4 && !isUserSelf) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                F.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) {
                    public final o4 f17483b;

                    {
                        this.f17483b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f20990id);
                                e5 e5Var2 = this.f17483b.f17550b;
                                new qc(e5Var2, e5Var2.f17032s).e(true).j();
                                if (e5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                n6Var.a(f10, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                t6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f20990id, false, true);
                                messagesController2.unblockPeer(user2.f20990id);
                                e5 e5Var3 = this.f17483b.f17550b;
                                new qc(e5Var3, e5Var3.f17032s).e(false).j();
                                if (e5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                n6Var.a(f11, true);
                                return;
                        }
                    }
                }, z14);
                if (z10 && !isUserSelf) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                F.m(z15, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new hg.j0(this, user, str2, n6Var, storyView, 16));
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c3 = org.telegram.ui.Components.l5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c3);
                    xa0 xa0Var = new xa0(e5Var.v, e5Var.getContext(), bVar, arrayList, 3);
                    xa0Var.setOnClickListener(new eg.o(this, arrayList, F, 13));
                    F.q(xa0Var);
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (F.x() <= 0 && !z16) {
                    return false;
                }
                F.Z();
                try {
                    e5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
