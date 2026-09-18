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
import org.telegram.ui.Components.vc;
public final class t4 implements Utilities.Callback {
    public final int f1549a = 0;
    public final boolean f1550b;
    public final Object f1551c;
    public final Object d;
    public final Object e;

    public t4(u4 u4Var, boolean z10, zg.p0 p0Var, View view) {
        this.f1551c = u4Var;
        this.f1550b = z10;
        this.d = p0Var;
        this.e = view;
    }

    @Override
    public final void run(Object obj) {
        zg.l0 l0Var;
        TLRPC.Document f7;
        vc vcVar;
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
                zg.p0 p0Var = (zg.p0) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                f6 f6Var = u4Var.f1573a;
                if (z10 && p0Var.f49155f != null) {
                    try {
                        f6Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    l0Var = new zg.l0(view.getContext(), null, f6Var.f815f2, null, view, f6Var.getMeasuredWidth() / 2.0f, f6Var.getMeasuredHeight() / 2.0f, p0Var, f6Var.C2, 0, true);
                } else {
                    l0Var = new zg.l0(view.getContext(), null, f6Var.f815f2, null, view, f6Var.getMeasuredWidth() / 2.0f, f6Var.getMeasuredHeight() / 2.0f, p0Var, f6Var.C2, 2, true);
                }
                zg.l0.B = l0Var;
                int i15 = R.id.parent_tag;
                zg.i0 i0Var = l0Var.f49100i;
                i0Var.setTag(i15, 1);
                f6Var.addView(i0Var);
                d6 d6Var = f6Var.O1;
                l0Var.f49110s = true;
                l0Var.f49115y = System.currentTimeMillis();
                if (p0Var.f49155f != null) {
                    f7 = MediaDataController.getInstance(f6Var.C2).getEmojiAnimatedSticker(p0Var.f49155f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(p0Var.f49155f, f6Var.B1);
                    of2.replyToStoryItem = d6Var.f706a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(f6Var.C2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.o5.f(f6Var.C2, p0Var.f49156g);
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
                    tL_messageEntityCustomEmoji.document_id = p0Var.f49156g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of3.entities.add(tL_messageEntityCustomEmoji);
                    of3.replyToStoryItem = d6Var.f706a;
                    of3.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(f6Var.C2).sendMessage(of3);
                }
                if (l4.longValue() <= 0) {
                    org.telegram.ui.Components.oc q6 = new vc(f6Var.f803c1, f6Var.B0).q(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new a3.d(u4Var, 6));
                    q6.f26705j = 5000;
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
                        vc vcVar2 = new vc(a5Var, f6Var2);
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
                        vcVar2.Q(i12, 36, LocaleController.getString(i13)).j();
                        return;
                    } else if (z10) {
                        new vc(a5Var, f6Var2).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        return;
                    } else {
                        vcVar = new vc(a5Var, f6Var2);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    vcVar = new vc(a5Var, f6Var2);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.w1.o(i11, vcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i16 = ChatActivityEnterView.f21743n5;
                ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                xh.q1 q1Var = new xh.q1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).f18268id, tg.t.c(tg.t.b(1, (List) obj)), null);
                q1Var.V(z10);
                q1Var.show();
                return;
        }
    }

    public t4(w5 w5Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f1551c = w5Var;
        this.d = storyItem;
        this.f1550b = z10;
        this.e = f6Var;
    }

    public t4(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, boolean z10) {
        this.f1551c = chatActivityEnterView;
        this.d = c2Var;
        this.e = user;
        this.f1550b = z10;
    }
}
