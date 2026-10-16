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
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
public final class i4 implements Utilities.Callback {
    public final int f3171a = 1;
    public final boolean f3172b;
    public final Object f3173c;
    public final Object d;
    public final Object e;

    public i4(j4 j4Var, boolean z10, ah.i1 i1Var, View view) {
        this.f3173c = j4Var;
        this.f3172b = z10;
        this.d = i1Var;
        this.e = view;
    }

    @Override
    public final void run(Object obj) {
        ah.d1 d1Var;
        TLRPC.Document f7;
        zc zcVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f3171a;
        boolean z10 = this.f3172b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f3173c;
        switch (i14) {
            case 0:
                j4 j4Var = (j4) obj4;
                ah.i1 i1Var = (ah.i1) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                q5 q5Var = j4Var.f3206a;
                if (z10 && i1Var.f783f != null) {
                    try {
                        q5Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    d1Var = new ah.d1(view.getContext(), null, q5Var.f3527f2, null, view, q5Var.getMeasuredWidth() / 2.0f, q5Var.getMeasuredHeight() / 2.0f, i1Var, q5Var.C2, 0, true);
                } else {
                    d1Var = new ah.d1(view.getContext(), null, q5Var.f3527f2, null, view, q5Var.getMeasuredWidth() / 2.0f, q5Var.getMeasuredHeight() / 2.0f, i1Var, q5Var.C2, 2, true);
                }
                ah.d1.B = d1Var;
                int i15 = R.id.parent_tag;
                ah.a1 a1Var = d1Var.f693i;
                a1Var.setTag(i15, 1);
                q5Var.addView(a1Var);
                o5 o5Var = q5Var.O1;
                d1Var.f703s = true;
                d1Var.f708y = System.currentTimeMillis();
                if (i1Var.f783f != null) {
                    f7 = MediaDataController.getInstance(q5Var.C2).getEmojiAnimatedSticker(i1Var.f783f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(i1Var.f783f, q5Var.B1);
                    of2.replyToStoryItem = o5Var.f3417a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(q5Var.C2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.s5.f(q5Var.C2, i1Var.f784g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (q5Var.f3527f2.getReactionsWindow() != null) {
                            q5Var.f3527f2.getReactionsWindow().e();
                        }
                        q5Var.s0();
                        return;
                    }
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, q5Var.B1);
                    of3.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = i1Var.f784g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of3.entities.add(tL_messageEntityCustomEmoji);
                    of3.replyToStoryItem = o5Var.f3417a;
                    of3.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(q5Var.C2).sendMessage(of3);
                }
                if (l4.longValue() <= 0) {
                    sc q6 = new zc(q5Var.f3515c1, q5Var.B0).q(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new a3.d(j4Var, 17));
                    q6.f28805j = 5000;
                    q6.j();
                }
                if (q5Var.f3527f2.getReactionsWindow() != null) {
                    q5Var.f3527f2.getReactionsWindow().e();
                }
                q5Var.s0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                q5 q5Var2 = ((h5) obj4).f3126l;
                o4 o4Var = q5Var2.f3515c1;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (q5Var2.C1) {
                        zc zcVar2 = new zc(o4Var, c6Var);
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
                        new zc(o4Var, c6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        return;
                    } else {
                        zcVar = new zc(o4Var, c6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    zcVar = new zc(o4Var, c6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.g0.q(i11, zcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i16 = ChatActivityEnterView.f22549n5;
                ((org.telegram.ui.ActionBar.a2) obj3).dismiss();
                yh.p1 p1Var = new yh.p1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).f19063id, ug.s.c(ug.s.b(1, (List) obj)), null);
                p1Var.W(z10);
                p1Var.show();
                return;
        }
    }

    public i4(h5 h5Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f3173c = h5Var;
        this.d = storyItem;
        this.f3172b = z10;
        this.e = c6Var;
    }

    public i4(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.a2 a2Var, TLRPC.User user, boolean z10) {
        this.f3173c = chatActivityEnterView;
        this.d = a2Var;
        this.e = user;
        this.f3172b = z10;
    }
}
