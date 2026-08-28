package ih;

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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.x60;
public final class q4 implements ok0 {
    public final m9 f12000a;
    public final g5 f12001b;

    public q4(g5 g5Var, m9 m9Var) {
        this.f12001b = g5Var;
        this.f12000a = m9Var;
    }

    @Override
    public final boolean a(int i9, View view) {
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
        g5 g5Var = this.f12001b;
        b bVar = g5Var.f11482s;
        int i10 = g5Var.v;
        if (view instanceof org.telegram.ui.Cells.n6) {
            final org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) view;
            m9 m9Var = this.f12000a;
            if (m9Var.v != null && (storyView = ((x4) g5Var.f11483w.f11289c.get(i9)).f12320b) != null && (user = (messagesController = MessagesController.getInstance(i10)).getUser(Long.valueOf(storyView.user_id))) != null) {
                if (messagesController.blockePeers.indexOfKey(user.f22527id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!user.contact && ContactsController.getInstance(i10).contactsDict.get(Long.valueOf(user.f22527id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = g5Var.d(storyView);
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
                x60 F = x60.F(m9Var.v, bVar, view);
                F.f34562i = 3;
                F.f34564j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, bVar)));
                F.f34580s = 133;
                if (d && !L && !z10 && !isUserSelf) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) {
                    public final q4 f11886b;

                    {
                        this.f11886b = this;
                    }

                    @Override
                    public final void run() {
                        int i11 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        q4 q4Var = this.f11886b;
                        switch (i11) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f22527id, true, true);
                                g5 g5Var2 = q4Var.f12001b;
                                org.telegram.ui.Cells.j2.q(R.string.StoryHidFromToast, new Object[]{str3}, new oc(g5Var2, g5Var2.f11482s), R.raw.ic_ban, 36);
                                if (g5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                n6Var2.a(f10, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f22527id, false, true);
                                g5 g5Var3 = q4Var.f12001b;
                                org.telegram.ui.Cells.j2.q(R.string.StoryShownBackToToast, new Object[]{str3}, new oc(g5Var3, g5Var3.f11482s), R.raw.contact_check, 36);
                                if (g5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                n6Var2.a(f10, true);
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
                    public final q4 f11886b;

                    {
                        this.f11886b = this;
                    }

                    @Override
                    public final void run() {
                        int i11 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.n6 n6Var2 = n6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        q4 q4Var = this.f11886b;
                        switch (i11) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f22527id, true, true);
                                g5 g5Var2 = q4Var.f12001b;
                                org.telegram.ui.Cells.j2.q(R.string.StoryHidFromToast, new Object[]{str3}, new oc(g5Var2, g5Var2.f11482s), R.raw.ic_ban, 36);
                                if (g5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                n6Var2.a(f10, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f22527id, false, true);
                                g5 g5Var3 = q4Var.f12001b;
                                org.telegram.ui.Cells.j2.q(R.string.StoryShownBackToToast, new Object[]{str3}, new oc(g5Var3, g5Var3.f11482s), R.raw.contact_check, 36);
                                if (g5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                n6Var2.a(f10, true);
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
                    public final q4 f11948b;

                    {
                        this.f11948b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f22527id);
                                g5 g5Var2 = this.f11948b.f12001b;
                                new oc(g5Var2, g5Var2.f11482s).e(true).j();
                                if (g5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                n6Var.a(f10, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                v6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f22527id, false, true);
                                messagesController2.unblockPeer(user2.f22527id);
                                g5 g5Var3 = this.f11948b.f12001b;
                                new oc(g5Var3, g5Var3.f11482s).e(false).j();
                                if (g5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                n6Var.a(f11, true);
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
                    public final q4 f11948b;

                    {
                        this.f11948b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f22527id);
                                g5 g5Var2 = this.f11948b.f12001b;
                                new oc(g5Var2, g5Var2.f11482s).e(true).j();
                                if (g5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                n6Var.a(f10, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                v6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f22527id, false, true);
                                messagesController2.unblockPeer(user2.f22527id);
                                g5 g5Var3 = this.f11948b.f12001b;
                                new oc(g5Var3, g5Var3.f11482s).e(false).j();
                                if (g5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                n6Var.a(f11, true);
                                return;
                        }
                    }
                }, z15);
                if (z11 && !isUserSelf) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                F.m(z16, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new bg.o0(this, user, str2, n6Var, storyView, 16));
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.k5.h(i10).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    ca0 ca0Var = new ca0(g5Var.v, g5Var.getContext(), bVar, arrayList, 3);
                    ca0Var.setOnClickListener(new fg.f(this, arrayList, F, 12));
                    F.q(ca0Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (F.x() <= 0 && !z17) {
                    return false;
                }
                F.Z();
                try {
                    g5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
