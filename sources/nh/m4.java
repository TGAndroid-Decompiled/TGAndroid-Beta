package nh;

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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.ai;
public final class m4 implements jl0 {
    public final i9 f15586a;
    public final d5 f15587b;

    public m4(d5 d5Var, i9 i9Var) {
        this.f15587b = d5Var;
        this.f15586a = i9Var;
    }

    @Override
    public final boolean d(int i10, View view) {
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
        d5 d5Var = this.f15587b;
        b bVar = d5Var.f15251s;
        int i11 = d5Var.v;
        if (view instanceof org.telegram.ui.Cells.m6) {
            final org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
            i9 i9Var = this.f15586a;
            if (i9Var.v != null && (storyView = ((u4) d5Var.f15252w.f16099c.get(i10)).f15940b) != null && (user = (messagesController = MessagesController.getInstance(i11)).getUser(Long.valueOf(storyView.user_id))) != null) {
                if (messagesController.blockePeers.indexOfKey(user.f19306id) >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!user.contact && ContactsController.getInstance(i11).contactsDict.get(Long.valueOf(user.f19306id)) == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean d = d5Var.d(storyView);
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
                p70 F = p70.F(i9Var.v, bVar, view);
                F.f27759i = 3;
                F.f27761j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, bVar)));
                F.f27777s = 133;
                if (d && !L && !z4 && !isUserSelf) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                final String str2 = str;
                F.l(R.drawable.msg_stories_myhide, LocaleController.formatString(R.string.StoryHideFrom, str), new Runnable(this) {
                    public final m4 f15515b;

                    {
                        this.f15515b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.m6 m6Var2 = m6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        m4 m4Var = this.f15515b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f19306id, true, true);
                                d5 d5Var2 = m4Var.f15587b;
                                ai.r(R.string.StoryHidFromToast, new Object[]{str3}, new qc(d5Var2, d5Var2.f15251s), R.raw.ic_ban, 36);
                                if (d5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(f10, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f19306id, false, true);
                                d5 d5Var3 = m4Var.f15587b;
                                ai.r(R.string.StoryShownBackToToast, new Object[]{str3}, new qc(d5Var3, d5Var3.f15251s), R.raw.contact_check, 36);
                                if (d5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(f10, true);
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
                    public final m4 f15515b;

                    {
                        this.f15515b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f10 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.m6 m6Var2 = m6Var;
                        String str3 = str2;
                        TLRPC.User user2 = user;
                        MessagesController messagesController2 = messagesController;
                        m4 m4Var = this.f15515b;
                        switch (i12) {
                            case 0:
                                messagesController2.getStoriesController().j0(user2.f19306id, true, true);
                                d5 d5Var2 = m4Var.f15587b;
                                ai.r(R.string.StoryHidFromToast, new Object[]{str3}, new qc(d5Var2, d5Var2.f15251s), R.raw.ic_ban, 36);
                                if (d5Var2.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(f10, true);
                                return;
                            default:
                                messagesController2.getStoriesController().j0(user2.f19306id, false, true);
                                d5 d5Var3 = m4Var.f15587b;
                                ai.r(R.string.StoryShownBackToToast, new Object[]{str3}, new qc(d5Var3, d5Var3.f15251s), R.raw.contact_check, 36);
                                if (d5Var3.d(storyView2)) {
                                    f10 = 1.0f;
                                }
                                m6Var2.a(f10, true);
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
                    public final m4 f15550b;

                    {
                        this.f15550b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f19306id);
                                d5 d5Var2 = this.f15550b.f15587b;
                                new qc(d5Var2, d5Var2.f15251s).e(true).j();
                                if (d5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                m6Var.a(f10, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                t6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f19306id, false, true);
                                messagesController2.unblockPeer(user2.f19306id);
                                d5 d5Var3 = this.f15550b.f15587b;
                                new qc(d5Var3, d5Var3.f15251s).e(false).j();
                                if (d5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                m6Var.a(f11, true);
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
                    public final m4 f15550b;

                    {
                        this.f15550b = this;
                    }

                    @Override
                    public final void run() {
                        float f10;
                        float f11;
                        switch (r6) {
                            case 0:
                                messagesController.blockPeer(user.f19306id);
                                d5 d5Var2 = this.f15550b.f15587b;
                                new qc(d5Var2, d5Var2.f15251s).e(true).j();
                                if (d5Var2.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                m6Var.a(f10, true);
                                return;
                            default:
                                MessagesController messagesController2 = messagesController;
                                t6 storiesController = messagesController2.getStoriesController();
                                TLRPC.User user2 = user;
                                storiesController.j0(user2.f19306id, false, true);
                                messagesController2.unblockPeer(user2.f19306id);
                                d5 d5Var3 = this.f15550b.f15587b;
                                new qc(d5Var3, d5Var3.f15251s).e(false).j();
                                if (d5Var3.d(storyView)) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.5f;
                                }
                                m6Var.a(f11, true);
                                return;
                        }
                    }
                }, z14);
                if (z10 && !isUserSelf) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                F.m(z15, R.drawable.msg_user_remove, LocaleController.getString(R.string.StoryDeleteContact), true, new gg.j0(this, user, str2, m6Var, storyView, 16));
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c3 = org.telegram.ui.Components.l5.h(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c3);
                    wa0 wa0Var = new wa0(d5Var.v, d5Var.getContext(), bVar, arrayList, 3);
                    wa0Var.setOnClickListener(new dg.p(this, arrayList, F, 13));
                    F.q(wa0Var);
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (F.x() <= 0 && !z16) {
                    return false;
                }
                F.Z();
                try {
                    d5Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
