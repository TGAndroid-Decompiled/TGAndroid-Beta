package di;

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
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.wc;
public final class c5 implements cm0 {
    public final y9 f8455a;
    public final t5 f8456b;

    public c5(t5 t5Var, y9 y9Var) {
        this.f8456b = t5Var;
        this.f8455a = y9Var;
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
        TLRPC.InputStickerSet c10;
        t5 t5Var = this.f8456b;
        b bVar = t5Var.f9196s;
        int i11 = t5Var.v;
        if (view instanceof org.telegram.ui.Cells.s6) {
            final org.telegram.ui.Cells.s6 s6Var = (org.telegram.ui.Cells.s6) view;
            y9 y9Var = this.f8455a;
            if (y9Var.v != null && (storyView = ((j5) t5Var.f9197w.f8878c.get(i10)).f8695b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                if (messagesController.blockePeers.indexOfKey(user.f22177id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!user.contact && ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.f22177id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = t5Var.d(storyView);
                boolean N = messagesController.getStoriesController().N(storyView);
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
                l80 F = l80.F(y9Var.v, bVar, view);
                F.f30150i = 3;
                F.f30152j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23428h5, bVar)));
                F.f30168s = 133;
                if (d && !N && !z10 && !isUserSelf) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) {
                    public final c5 f8370b;

                    {
                        this.f8370b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f7 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.s6 s6Var2 = s6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        c5 c5Var = this.f8370b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().m0(user2.f22177id, true, true);
                                t5 t5Var2 = c5Var.f8456b;
                                ic.a.s(R.string.StoryHidFromToast, new Object[]{str3}, new wc(t5Var2, t5Var2.f9196s), R.raw.ic_ban, 36);
                                if (t5Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                s6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().m0(user2.f22177id, false, true);
                                t5 t5Var3 = c5Var.f8456b;
                                ic.a.s(R.string.StoryShownBackToToast, new Object[]{str3}, new wc(t5Var3, t5Var3.f9196s), R.raw.contact_check, 36);
                                if (t5Var3.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                s6Var2.a(f7, true);
                                return;
                        }
                    }
                }, z12);
                F.E();
                F.t();
                if (N && !z10 && !isUserSelf) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                F.l(R.drawable.msg_menu_stories, LocaleController.formatString(R.string.StoryShowBackTo, str2), new Runnable(this) {
                    public final c5 f8370b;

                    {
                        this.f8370b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f7 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.s6 s6Var2 = s6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        c5 c5Var = this.f8370b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().m0(user2.f22177id, true, true);
                                t5 t5Var2 = c5Var.f8456b;
                                ic.a.s(R.string.StoryHidFromToast, new Object[]{str3}, new wc(t5Var2, t5Var2.f9196s), R.raw.ic_ban, 36);
                                if (t5Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                s6Var2.a(f7, true);
                                return;
                            default:
                                messagesController2.getStoriesController().m0(user2.f22177id, false, true);
                                t5 t5Var3 = c5Var.f8456b;
                                ic.a.s(R.string.StoryShownBackToToast, new Object[]{str3}, new wc(t5Var3, t5Var3.f9196s), R.raw.contact_check, 36);
                                if (t5Var3.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                s6Var2.a(f7, true);
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
                F.m(R.drawable.msg_user_remove, new Runnable(this) {
                    public final c5 f8423b;

                    {
                        this.f8423b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f22177id);
                                t5 t5Var2 = this.f8423b.f8456b;
                                new wc(t5Var2, t5Var2.f9196s).e(true).j();
                                if (t5Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                s6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                h7 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.m0(user2.f22177id, false, true);
                                messagesController2.unblockPeer(user2.f22177id);
                                t5 t5Var3 = this.f8423b.f8456b;
                                new wc(t5Var3, t5Var3.f9196s).e(false).j();
                                if (t5Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                s6Var.a(f10, true);
                                return;
                        }
                    }
                }, LocaleController.getString(R.string.BlockUser), z14, true);
                if (!z11 && z10 && !isUserSelf) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                F.l(R.drawable.msg_block, LocaleController.getString(R.string.Unblock), new Runnable(this) {
                    public final c5 f8423b;

                    {
                        this.f8423b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f22177id);
                                t5 t5Var2 = this.f8423b.f8456b;
                                new wc(t5Var2, t5Var2.f9196s).e(true).j();
                                if (t5Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                s6Var.a(f7, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                h7 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.m0(user2.f22177id, false, true);
                                messagesController2.unblockPeer(user2.f22177id);
                                t5 t5Var3 = this.f8423b.f8456b;
                                new wc(t5Var3, t5Var3.f9196s).e(false).j();
                                if (t5Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                s6Var.a(f10, true);
                                return;
                        }
                    }
                }, z15);
                if (z11 && !isUserSelf) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                F.m(R.drawable.msg_user_remove, new bi.u0(this, user, str2, s6Var, storyView, 11), LocaleController.getString(R.string.StoryDeleteContact), z16, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.t5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    nb0 nb0Var = new nb0(t5Var.v, 3, t5Var.getContext(), arrayList, bVar);
                    nb0Var.setOnClickListener(new bi.w0(this, arrayList, F, 6));
                    F.q(nb0Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (F.x() <= 0 && !z17) {
                    return false;
                }
                F.Z();
                try {
                    t5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
