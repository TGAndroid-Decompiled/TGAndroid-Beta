package ai;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.xc;
public final class t4 implements Utilities.Callback {
    public final int f1549a = 0;
    public final boolean f1550b;
    public final Object f1551c;
    public final Object d;
    public final Object e;

    public t4(u4 u4Var, boolean z10, zg.o0 o0Var, View view) {
        this.f1551c = u4Var;
        this.f1550b = z10;
        this.d = o0Var;
        this.e = view;
    }

    @Override
    public final void run(Object obj) {
        zg.k0 k0Var;
        TLRPC.Document f7;
        xc xcVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f1549a;
        boolean z10 = this.f1550b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f1551c;
        switch (i14) {
            case 0:
                u4 u4Var = (u4) obj4;
                zg.o0 o0Var = (zg.o0) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                f6 f6Var = u4Var.f1573a;
                if (z10 && o0Var.f49423f != null) {
                    try {
                        f6Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    k0Var = new zg.k0(view.getContext(), null, f6Var.f815f2, null, view, f6Var.getMeasuredWidth() / 2.0f, f6Var.getMeasuredHeight() / 2.0f, o0Var, f6Var.C2, 0, true);
                } else {
                    k0Var = new zg.k0(view.getContext(), null, f6Var.f815f2, null, view, f6Var.getMeasuredWidth() / 2.0f, f6Var.getMeasuredHeight() / 2.0f, o0Var, f6Var.C2, 2, true);
                }
                zg.k0.B = k0Var;
                int i15 = R.id.parent_tag;
                zg.h0 h0Var = k0Var.f49368i;
                h0Var.setTag(i15, 1);
                f6Var.addView(h0Var);
                d6 d6Var = f6Var.O1;
                k0Var.f49378s = true;
                k0Var.f49383y = System.currentTimeMillis();
                if (o0Var.f49423f != null) {
                    f7 = MediaDataController.getInstance(f6Var.C2).getEmojiAnimatedSticker(o0Var.f49423f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(o0Var.f49423f, f6Var.B1);
                    of2.replyToStoryItem = d6Var.f706a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(f6Var.C2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.p5.f(f6Var.C2, o0Var.f49424g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (f6Var.f815f2.getReactionsWindow() != null) {
                            f6Var.f815f2.getReactionsWindow().e();
                        }
                        f6Var.s0();
                        return;
                    }
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, f6Var.B1);
                    of3.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = o0Var.f49424g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of3.entities.add(tL_messageEntityCustomEmoji);
                    of3.replyToStoryItem = d6Var.f706a;
                    of3.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(f6Var.C2).sendMessage(of3);
                }
                if (l4.longValue() <= 0) {
                    org.telegram.ui.Components.pc q6 = new xc(f6Var.f803c1, f6Var.B0).q(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new a3.d(u4Var, 6));
                    q6.f27252j = 5000;
                    q6.j();
                }
                if (f6Var.f815f2.getReactionsWindow() != null) {
                    f6Var.f815f2.getReactionsWindow().e();
                }
                f6Var.s0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj2;
                f6 f6Var3 = ((w5) obj4).f1658l;
                a5 a5Var = f6Var3.f803c1;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (f6Var3.C1) {
                        xc xcVar2 = new xc(a5Var, f6Var2);
                        if (z10) {
                            i12 = R.raw.contact_check;
                        } else {
                            i12 = R.raw.chats_archived;
                        }
                        if (z10) {
                            i13 = R.string.StoryPinnedToProfile;
                        } else {
                            i13 = R.string.StoryArchivedFromProfile;
                        }
                        xcVar2.Q(i12, 36, LocaleController.getString(i13)).j();
                        return;
                    } else if (z10) {
                        new xc(a5Var, f6Var2).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        return;
                    } else {
                        xcVar = new xc(a5Var, f6Var2);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    xcVar = new xc(a5Var, f6Var2);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.l0.o(i11, xcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i16 = ChatActivityEnterView.f21952m5;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                xh.r1 r1Var = new xh.r1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).f18475id, tg.s.c(tg.s.b(1, (List) obj)), null);
                r1Var.V(z10);
                r1Var.show();
                return;
        }
    }

    public t4(w5 w5Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f1551c = w5Var;
        this.d = storyItem;
        this.f1550b = z10;
        this.e = f6Var;
    }

    public t4(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, boolean z10) {
        this.f1551c = chatActivityEnterView;
        this.d = b2Var;
        this.e = user;
        this.f1550b = z10;
    }
}
