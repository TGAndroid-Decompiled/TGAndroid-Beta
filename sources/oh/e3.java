package oh;

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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
public final class e3 implements Utilities.Callback {
    public final int f17015a = 0;
    public final boolean f17016b;
    public final Object f17017c;
    public final Object d;
    public final Object f17018e;

    public e3(f3 f3Var, boolean z4, ng.q0 q0Var, View view) {
        this.f17017c = f3Var;
        this.f17016b = z4;
        this.d = q0Var;
        this.f17018e = view;
    }

    @Override
    public final void run(Object obj) {
        ng.m0 m0Var;
        TLRPC.Document f10;
        qc qcVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f17015a;
        boolean z4 = this.f17016b;
        Object obj2 = this.f17018e;
        Object obj3 = this.d;
        Object obj4 = this.f17017c;
        switch (i14) {
            case 0:
                f3 f3Var = (f3) obj4;
                ng.q0 q0Var = (ng.q0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                f4 f4Var = f3Var.f17051a;
                if (z4 && q0Var.f16178f != null) {
                    try {
                        f4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    m0Var = new ng.m0(view.getContext(), null, f4Var.f17059c2, null, view, f4Var.getMeasuredWidth() / 2.0f, f4Var.getMeasuredHeight() / 2.0f, q0Var, f4Var.f17133z2, 0, true);
                } else {
                    m0Var = new ng.m0(view.getContext(), null, f4Var.f17059c2, null, view, f4Var.getMeasuredWidth() / 2.0f, f4Var.getMeasuredHeight() / 2.0f, q0Var, f4Var.f17133z2, 2, true);
                }
                ng.m0.B = m0Var;
                int i15 = R.id.parent_tag;
                ng.j0 j0Var = m0Var.f16122i;
                j0Var.setTag(i15, 1);
                f4Var.addView(j0Var);
                d4 d4Var = f4Var.L1;
                m0Var.f16132s = true;
                m0Var.f16137y = System.currentTimeMillis();
                if (q0Var.f16178f != null) {
                    f10 = MediaDataController.getInstance(f4Var.f17133z2).getEmojiAnimatedSticker(q0Var.f16178f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(q0Var.f16178f, f4Var.f17128y1);
                    of2.replyToStoryItem = d4Var.f16961a;
                    of2.payStars = l10.longValue();
                    SendMessagesHelper.getInstance(f4Var.f17133z2).sendMessage(of2);
                } else {
                    f10 = org.telegram.ui.Components.l5.f(f4Var.f17133z2, q0Var.f16179g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f10, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (f4Var.f17059c2.getReactionsWindow() != null) {
                            f4Var.f17059c2.getReactionsWindow().e();
                        }
                        f4Var.s0();
                        return;
                    }
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, f4Var.f17128y1);
                    of3.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = q0Var.f16179g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of3.entities.add(tL_messageEntityCustomEmoji);
                    of3.replyToStoryItem = d4Var.f16961a;
                    of3.payStars = l10.longValue();
                    SendMessagesHelper.getInstance(f4Var.f17133z2).sendMessage(of3);
                }
                if (l10.longValue() <= 0) {
                    ic q10 = new qc(f4Var.Z0, f4Var.f17127y0).q(f10, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new lh.c3(f3Var, 28));
                    q10.f27745j = 5000;
                    q10.j();
                }
                if (f4Var.f17059c2.getReactionsWindow() != null) {
                    f4Var.f17059c2.getReactionsWindow().e();
                }
                f4Var.s0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                f4 f4Var2 = ((y3) obj4).f17950l;
                j3 j3Var = f4Var2.Z0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z4;
                    if (f4Var2.f17132z1) {
                        qc qcVar2 = new qc(j3Var, g6Var);
                        if (z4) {
                            i12 = R.raw.contact_check;
                        } else {
                            i12 = R.raw.chats_archived;
                        }
                        if (z4) {
                            i13 = R.string.StoryPinnedToProfile;
                        } else {
                            i13 = R.string.StoryArchivedFromProfile;
                        }
                        qcVar2.Q(i12, 36, LocaleController.getString(i13)).j();
                        return;
                    } else if (z4) {
                        new qc(j3Var, g6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        return;
                    } else {
                        qcVar = new qc(j3Var, g6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    qcVar = new qc(j3Var, g6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                l.d.v(i11, qcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i16 = ChatActivityEnterView.f24568j5;
                ((org.telegram.ui.ActionBar.d2) obj3).dismiss();
                lh.g2 g2Var = new lh.g2(chatActivityEnterView.getContext(), chatActivityEnterView.N, ((TLRPC.User) obj2).f20990id, hg.p0.c(hg.p0.b(1, (List) obj)), null);
                g2Var.V(z4);
                g2Var.show();
                return;
        }
    }

    public e3(y3 y3Var, TL_stories.StoryItem storyItem, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f17017c = y3Var;
        this.d = storyItem;
        this.f17016b = z4;
        this.f17018e = g6Var;
    }

    public e3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, boolean z4) {
        this.f17017c = chatActivityEnterView;
        this.d = d2Var;
        this.f17018e = user;
        this.f17016b = z4;
    }
}
