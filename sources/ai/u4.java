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
import org.telegram.ui.Components.zc;
public final class u4 implements Utilities.Callback {
    public final int f1790a = 0;
    public final boolean f1791b;
    public final Object f1792c;
    public final Object d;
    public final Object f1793e;

    public u4(v4 v4Var, boolean z10, zg.n0 n0Var, View view) {
        this.f1792c = v4Var;
        this.f1791b = z10;
        this.d = n0Var;
        this.f1793e = view;
    }

    @Override
    public final void run(Object obj) {
        zg.j0 j0Var;
        TLRPC.Document f7;
        zc zcVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f1790a;
        boolean z10 = this.f1791b;
        Object obj2 = this.f1793e;
        Object obj3 = this.d;
        Object obj4 = this.f1792c;
        switch (i14) {
            case 0:
                v4 v4Var = (v4) obj4;
                zg.n0 n0Var = (zg.n0) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                f6 f6Var = v4Var.f1822a;
                if (z10 && n0Var.f54841f != null) {
                    try {
                        f6Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    j0Var = new zg.j0(view.getContext(), null, f6Var.f965f2, null, view, f6Var.getMeasuredWidth() / 2.0f, f6Var.getMeasuredHeight() / 2.0f, n0Var, f6Var.C2, 0, true);
                } else {
                    j0Var = new zg.j0(view.getContext(), null, f6Var.f965f2, null, view, f6Var.getMeasuredWidth() / 2.0f, f6Var.getMeasuredHeight() / 2.0f, n0Var, f6Var.C2, 2, true);
                }
                zg.j0.B = j0Var;
                int i15 = R.id.parent_tag;
                zg.g0 g0Var = j0Var.f54782i;
                g0Var.setTag(i15, 1);
                f6Var.addView(g0Var);
                d6 d6Var = f6Var.O1;
                j0Var.f54792s = true;
                j0Var.f54797y = System.currentTimeMillis();
                if (n0Var.f54841f != null) {
                    f7 = MediaDataController.getInstance(f6Var.C2).getEmojiAnimatedSticker(n0Var.f54841f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(n0Var.f54841f, f6Var.B1);
                    of2.replyToStoryItem = d6Var.f820a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(f6Var.C2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.s5.f(f6Var.C2, n0Var.f54842g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (f6Var.f965f2.getReactionsWindow() != null) {
                            f6Var.f965f2.getReactionsWindow().e();
                        }
                        f6Var.s0();
                        return;
                    }
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, f6Var.B1);
                    of3.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = n0Var.f54842g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of3.entities.add(tL_messageEntityCustomEmoji);
                    of3.replyToStoryItem = d6Var.f820a;
                    of3.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(f6Var.C2).sendMessage(of3);
                }
                if (l4.longValue() <= 0) {
                    org.telegram.ui.Components.sc q6 = new zc(f6Var.f953c1, f6Var.B0).q(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new a3.d(v4Var, 6));
                    q6.f30540j = 5000;
                    q6.j();
                }
                if (f6Var.f965f2.getReactionsWindow() != null) {
                    f6Var.f965f2.getReactionsWindow().e();
                }
                f6Var.s0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                f6 f6Var2 = ((w5) obj4).f1858l;
                b5 b5Var = f6Var2.f953c1;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (f6Var2.C1) {
                        zc zcVar2 = new zc(b5Var, c6Var);
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
                        zcVar2.Q(i12, 36, LocaleController.getString(i13)).j();
                        return;
                    } else if (z10) {
                        new zc(b5Var, c6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        return;
                    } else {
                        zcVar = new zc(b5Var, c6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    zcVar = new zc(b5Var, c6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.v0.q(i11, zcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i16 = ChatActivityEnterView.Q5;
                ((org.telegram.ui.ActionBar.a2) obj3).dismiss();
                xh.q1 q1Var = new xh.q1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).f19949id, tg.r.c(tg.r.b(1, (List) obj)), null);
                q1Var.W(z10);
                q1Var.show();
                return;
        }
    }

    public u4(w5 w5Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f1792c = w5Var;
        this.d = storyItem;
        this.f1791b = z10;
        this.f1793e = c6Var;
    }

    public u4(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user, boolean z10) {
        this.f1792c = chatActivityEnterView;
        this.d = a2Var;
        this.f1793e = user;
        this.f1791b = z10;
    }
}
