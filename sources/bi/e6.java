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
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.zc;
public final class e6 implements cm0 {
    public final sb f2986a;
    public final w6 f2987b;

    public e6(w6 w6Var, sb sbVar) {
        this.f2987b = w6Var;
        this.f2986a = sbVar;
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
        w6 w6Var = this.f2987b;
        b bVar = w6Var.f3906s;
        int i11 = w6Var.v;
        if (view instanceof org.telegram.ui.Cells.o6) {
            final org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) view;
            sb sbVar = this.f2986a;
            if (sbVar.v != null && (storyView = ((l6) w6Var.f3907w.f3587c.get(i10)).f3276b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                if (messagesController.blockePeers.indexOfKey(user.f19363id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!user.contact && ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.f19363id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = w6Var.d(storyView);
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
                m80 F = m80.F(sbVar.v, bVar, view);
                F.f27280i = 3;
                F.f27282j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, bVar)));
                F.f27298s = 133;
                if (d && !L && !z10 && !isUserSelf) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z18 = z10;
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) {
                    public final e6 f2899b;

                    {
                        this.f2899b = this;
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
                        e6 e6Var = this.f2899b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f19363id, true, true);
                                w6 w6Var2 = e6Var.f2987b;
                                i2.d.q(R.string.StoryHidFromToast, new Object[]{str3}, new zc(w6Var2, w6Var2.f3906s), R.raw.ic_ban, 36);
                                if (w6Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                o6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f19363id, false, true);
                                w6 w6Var3 = e6Var.f2987b;
                                i2.d.q(R.string.StoryShownBackToToast, new Object[]{str3}, new zc(w6Var3, w6Var3.f3906s), R.raw.contact_check, 36);
                                if (w6Var3.d(storyView2)) {
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
                    public final e6 f2899b;

                    {
                        this.f2899b = this;
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
                        e6 e6Var = this.f2899b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f19363id, true, true);
                                w6 w6Var2 = e6Var.f2987b;
                                i2.d.q(R.string.StoryHidFromToast, new Object[]{str3}, new zc(w6Var2, w6Var2.f3906s), R.raw.ic_ban, 36);
                                if (w6Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                o6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f19363id, false, true);
                                w6 w6Var3 = e6Var.f2987b;
                                i2.d.q(R.string.StoryShownBackToToast, new Object[]{str3}, new zc(w6Var3, w6Var3.f3906s), R.raw.contact_check, 36);
                                if (w6Var3.d(storyView2)) {
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
                    public final e6 f2950b;

                    {
                        this.f2950b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f19363id);
                                w6 w6Var2 = this.f2950b.f2987b;
                                new zc(w6Var2, w6Var2.f3906s).e(true).j();
                                if (w6Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                o6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                x8 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f19363id, false, true);
                                messagesController2.unblockPeer(user2.f19363id);
                                w6 w6Var3 = this.f2950b.f2987b;
                                new zc(w6Var3, w6Var3.f3906s).e(false).j();
                                if (w6Var3.d(storyView)) {
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
                    public final e6 f2950b;

                    {
                        this.f2950b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f19363id);
                                w6 w6Var2 = this.f2950b.f2987b;
                                new zc(w6Var2, w6Var2.f3906s).e(true).j();
                                if (w6Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                o6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                x8 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f19363id, false, true);
                                messagesController2.unblockPeer(user2.f19363id);
                                w6 w6Var3 = this.f2950b.f2987b;
                                new zc(w6Var3, w6Var3.f3906s).e(false).j();
                                if (w6Var3.d(storyView)) {
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
                F.m(z16, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new c3(this, user, str2, o6Var, storyView, 3));
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.s5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    ub0 ub0Var = new ub0(w6Var.v, 3, w6Var.getContext(), arrayList, bVar);
                    ub0Var.setOnClickListener(new x(this, arrayList, F, 3));
                    F.q(ub0Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (F.x() <= 0 && !z17) {
                    return false;
                }
                F.Z();
                try {
                    w6Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
