package bi;

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
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
public final class f4 implements Utilities.Callback {
    public final int f2988a = 1;
    public final boolean f2989b;
    public final Object f2990c;
    public final Object d;
    public final Object f2991e;

    public f4(g4 g4Var, boolean z10, ah.j1 j1Var, View view) {
        this.f2990c = g4Var;
        this.f2989b = z10;
        this.d = j1Var;
        this.f2991e = view;
    }

    @Override
    public final void run(Object obj) {
        ah.e1 e1Var;
        TLRPC.Document f7;
        yc ycVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f2988a;
        boolean z10 = this.f2989b;
        Object obj2 = this.f2991e;
        Object obj3 = this.d;
        Object obj4 = this.f2990c;
        switch (i14) {
            case 0:
                g4 g4Var = (g4) obj4;
                ah.j1 j1Var = (ah.j1) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                o5 o5Var = g4Var.f3048a;
                if (z10 && j1Var.f609f != null) {
                    try {
                        o5Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    e1Var = new ah.e1(view.getContext(), null, o5Var.f3448f2, null, view, o5Var.getMeasuredWidth() / 2.0f, o5Var.getMeasuredHeight() / 2.0f, j1Var, o5Var.C2, 0, true);
                } else {
                    e1Var = new ah.e1(view.getContext(), null, o5Var.f3448f2, null, view, o5Var.getMeasuredWidth() / 2.0f, o5Var.getMeasuredHeight() / 2.0f, j1Var, o5Var.C2, 2, true);
                }
                ah.e1.B = e1Var;
                int i15 = R.id.parent_tag;
                ah.b1 b1Var = e1Var.f524i;
                b1Var.setTag(i15, 1);
                o5Var.addView(b1Var);
                m5 m5Var = o5Var.O1;
                e1Var.f534s = true;
                e1Var.f539y = System.currentTimeMillis();
                if (j1Var.f609f != null) {
                    f7 = MediaDataController.getInstance(o5Var.C2).getEmojiAnimatedSticker(j1Var.f609f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(j1Var.f609f, o5Var.B1);
                    of2.replyToStoryItem = m5Var.f3337a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(o5Var.C2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.q5.f(o5Var.C2, j1Var.f610g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (o5Var.f3448f2.getReactionsWindow() != null) {
                            o5Var.f3448f2.getReactionsWindow().e();
                        }
                        o5Var.s0();
                        return;
                    }
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, o5Var.B1);
                    of3.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = j1Var.f610g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of3.entities.add(tL_messageEntityCustomEmoji);
                    of3.replyToStoryItem = m5Var.f3337a;
                    of3.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(o5Var.C2).sendMessage(of3);
                }
                if (l4.longValue() <= 0) {
                    qc q6 = new yc(o5Var.f3436c1, o5Var.B0).q(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new a3.d(g4Var, 16));
                    q6.f29706j = 5000;
                    q6.j();
                }
                if (o5Var.f3448f2.getReactionsWindow() != null) {
                    o5Var.f3448f2.getReactionsWindow().e();
                }
                o5Var.s0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                o5 o5Var2 = ((f5) obj4).f2999l;
                l4 l4Var = o5Var2.f3436c1;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (o5Var2.C1) {
                        yc ycVar2 = new yc(l4Var, f6Var);
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
                        ycVar2.Q(i12, 36, LocaleController.getString(i13)).j();
                        return;
                    } else if (z10) {
                        new yc(l4Var, f6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        return;
                    } else {
                        ycVar = new yc(l4Var, f6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    ycVar = new yc(l4Var, f6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.w1.o(i11, ycVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i16 = ChatActivityEnterView.f23688m5;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                yh.p1 p1Var = new yh.p1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).f20043id, ug.t.c(ug.t.b(1, (List) obj)), null);
                p1Var.V(z10);
                p1Var.show();
                return;
        }
    }

    public f4(f5 f5Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f2990c = f5Var;
        this.d = storyItem;
        this.f2989b = z10;
        this.f2991e = f6Var;
    }

    public f4(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, boolean z10) {
        this.f2990c = chatActivityEnterView;
        this.d = b2Var;
        this.f2991e = user;
        this.f2989b = z10;
    }
}
