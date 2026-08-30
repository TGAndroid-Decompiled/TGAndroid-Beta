package nh;

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
public final class d3 implements Utilities.Callback {
    public final int f15179a = 0;
    public final boolean f15180b;
    public final Object f15181c;
    public final Object d;
    public final Object e;

    public d3(e3 e3Var, boolean z4, mg.q0 q0Var, View view) {
        this.f15181c = e3Var;
        this.f15180b = z4;
        this.d = q0Var;
        this.e = view;
    }

    @Override
    public final void run(Object obj) {
        mg.m0 m0Var;
        TLRPC.Document f10;
        qc qcVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f15179a;
        boolean z4 = this.f15180b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f15181c;
        switch (i14) {
            case 0:
                e3 e3Var = (e3) obj4;
                mg.q0 q0Var = (mg.q0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                d4 d4Var = e3Var.f15305a;
                if (z4 && q0Var.f14107f != null) {
                    try {
                        d4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    m0Var = new mg.m0(view.getContext(), null, d4Var.f15189c2, null, view, d4Var.getMeasuredWidth() / 2.0f, d4Var.getMeasuredHeight() / 2.0f, q0Var, d4Var.f15263z2, 0, true);
                } else {
                    m0Var = new mg.m0(view.getContext(), null, d4Var.f15189c2, null, view, d4Var.getMeasuredWidth() / 2.0f, d4Var.getMeasuredHeight() / 2.0f, q0Var, d4Var.f15263z2, 2, true);
                }
                mg.m0.B = m0Var;
                int i15 = R.id.parent_tag;
                mg.j0 j0Var = m0Var.f14053i;
                j0Var.setTag(i15, 1);
                d4Var.addView(j0Var);
                b4 b4Var = d4Var.L1;
                m0Var.f14063s = true;
                m0Var.f14068y = System.currentTimeMillis();
                if (q0Var.f14107f != null) {
                    f10 = MediaDataController.getInstance(d4Var.f15263z2).getEmojiAnimatedSticker(q0Var.f14107f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(q0Var.f14107f, d4Var.f15258y1);
                    of2.replyToStoryItem = b4Var.f15111a;
                    of2.payStars = l10.longValue();
                    SendMessagesHelper.getInstance(d4Var.f15263z2).sendMessage(of2);
                } else {
                    f10 = org.telegram.ui.Components.l5.f(d4Var.f15263z2, q0Var.f14108g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f10, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (d4Var.f15189c2.getReactionsWindow() != null) {
                            d4Var.f15189c2.getReactionsWindow().e();
                        }
                        d4Var.s0();
                        return;
                    }
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, d4Var.f15258y1);
                    of3.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = q0Var.f14108g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of3.entities.add(tL_messageEntityCustomEmoji);
                    of3.replyToStoryItem = b4Var.f15111a;
                    of3.payStars = l10.longValue();
                    SendMessagesHelper.getInstance(d4Var.f15263z2).sendMessage(of3);
                }
                if (l10.longValue() <= 0) {
                    ic q10 = new qc(d4Var.Z0, d4Var.f15257y0).q(f10, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new lh.b(e3Var, 25));
                    q10.f25672j = 5000;
                    q10.j();
                }
                if (d4Var.f15189c2.getReactionsWindow() != null) {
                    d4Var.f15189c2.getReactionsWindow().e();
                }
                d4Var.s0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                d4 d4Var2 = ((w3) obj4).f16027l;
                i3 i3Var = d4Var2.Z0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z4;
                    if (d4Var2.f15262z1) {
                        qc qcVar2 = new qc(i3Var, f6Var);
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
                        new qc(i3Var, f6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        return;
                    } else {
                        qcVar = new qc(i3Var, f6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    qcVar = new qc(i3Var, f6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                kh.a2.v(i11, qcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i16 = ChatActivityEnterView.f22729j5;
                ((org.telegram.ui.ActionBar.d2) obj3).dismiss();
                kh.h2 h2Var = new kh.h2(chatActivityEnterView.getContext(), chatActivityEnterView.N, ((TLRPC.User) obj2).f19331id, gg.p0.c(gg.p0.b(1, (List) obj)), null);
                h2Var.V(z4);
                h2Var.show();
                return;
        }
    }

    public d3(w3 w3Var, TL_stories.StoryItem storyItem, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f15181c = w3Var;
        this.d = storyItem;
        this.f15180b = z4;
        this.e = f6Var;
    }

    public d3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, boolean z4) {
        this.f15181c = chatActivityEnterView;
        this.d = d2Var;
        this.e = user;
        this.f15180b = z4;
    }
}
