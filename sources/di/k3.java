package di;

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
import org.telegram.ui.Components.wc;
public final class k3 implements Utilities.Callback {
    public final int f8713a = 1;
    public final boolean f8714b;
    public final Object f8715c;
    public final Object d;
    public final Object e;

    public k3(l3 l3Var, boolean z10, bh.x0 x0Var, View view) {
        this.f8715c = l3Var;
        this.f8714b = z10;
        this.d = x0Var;
        this.e = view;
    }

    @Override
    public final void run(Object obj) {
        bh.s0 s0Var;
        TLRPC.Document f7;
        wc wcVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f8713a;
        boolean z10 = this.f8714b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f8715c;
        switch (i14) {
            case 0:
                l3 l3Var = (l3) obj4;
                bh.x0 x0Var = (bh.x0) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                q4 q4Var = l3Var.f8756a;
                if (z10 && x0Var.f4208f != null) {
                    try {
                        q4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    s0Var = new bh.s0(view.getContext(), null, q4Var.U1, null, view, q4Var.getMeasuredWidth() / 2.0f, q4Var.getMeasuredHeight() / 2.0f, x0Var, q4Var.f9021r2, 0, true);
                } else {
                    s0Var = new bh.s0(view.getContext(), null, q4Var.U1, null, view, q4Var.getMeasuredWidth() / 2.0f, q4Var.getMeasuredHeight() / 2.0f, x0Var, q4Var.f9021r2, 2, true);
                }
                bh.s0.B = s0Var;
                int i15 = R.id.parent_tag;
                bh.p0 p0Var = s0Var.f4130i;
                p0Var.setTag(i15, 1);
                q4Var.addView(p0Var);
                o4 o4Var = q4Var.D1;
                s0Var.f4140s = true;
                s0Var.f4145y = System.currentTimeMillis();
                if (x0Var.f4208f != null) {
                    f7 = MediaDataController.getInstance(q4Var.f9021r2).getEmojiAnimatedSticker(x0Var.f4208f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(x0Var.f4208f, q4Var.f9016q1);
                    of2.replyToStoryItem = o4Var.f8871a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(q4Var.f9021r2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.t5.f(q4Var.f9021r2, x0Var.f4209g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (q4Var.U1.getReactionsWindow() != null) {
                            q4Var.U1.getReactionsWindow().e();
                        }
                        q4Var.q0();
                        return;
                    }
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, q4Var.f9016q1);
                    of3.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = x0Var.f4209g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of3.entities.add(tL_messageEntityCustomEmoji);
                    of3.replyToStoryItem = o4Var.f8871a;
                    of3.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(q4Var.f9021r2).sendMessage(of3);
                }
                if (l4.longValue() <= 0) {
                    qc r6 = new wc(q4Var.R0, q4Var.f9015q0).r(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new bi.u6(l3Var, 17));
                    r6.f31887j = 5000;
                    r6.j();
                }
                if (q4Var.U1.getReactionsWindow() != null) {
                    q4Var.U1.getReactionsWindow().e();
                }
                q4Var.q0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj2;
                q4 q4Var2 = ((h4) obj4).f8626l;
                q3 q3Var = q4Var2.R0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (q4Var2.f9020r1) {
                        wc wcVar2 = new wc(q3Var, u6Var);
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
                        wcVar2.R(i12, 36, LocaleController.getString(i13)).j();
                        return;
                    } else if (z10) {
                        new wc(q3Var, u6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        return;
                    } else {
                        wcVar = new wc(q3Var, u6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    wcVar = new wc(q3Var, u6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.t.q(i11, wcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i16 = ChatActivityEnterView.f25841r5;
                ((org.telegram.ui.ActionBar.e2) obj3).dismiss();
                zh.p1 p1Var = new zh.p1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).f22174id, vg.s.c(vg.s.b(1, (List) obj)), null);
                p1Var.V(z10);
                p1Var.show();
                return;
        }
    }

    public k3(h4 h4Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f8715c = h4Var;
        this.d = storyItem;
        this.f8714b = z10;
        this.e = u6Var;
    }

    public k3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, boolean z10) {
        this.f8715c = chatActivityEnterView;
        this.d = e2Var;
        this.e = user;
        this.f8714b = z10;
    }
}
