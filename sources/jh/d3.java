package jh;

import android.view.View;
import hh.y9;
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
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;

public final class d3 implements Utilities.Callback {

    public final int f13187a = 0;

    public final boolean f13188b;

    public final Object f13189c;
    public final Object d;

    public final Object f13190e;

    public d3(e3 e3Var, boolean z10, ig.q0 q0Var, View view) {
        this.f13189c = e3Var;
        this.f13188b = z10;
        this.d = q0Var;
        this.f13190e = view;
    }

    @Override
    public final void run(Object obj) {
        ig.m0 m0Var;
        TLRPC.Document documentF;
        mc mcVar;
        int i10;
        int i11;
        int i12 = this.f13187a;
        boolean z10 = this.f13188b;
        Object obj2 = this.f13190e;
        Object obj3 = this.d;
        Object obj4 = this.f13189c;
        switch (i12) {
            case 0:
                e3 e3Var = (e3) obj4;
                ig.q0 q0Var = (ig.q0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                e4 e4Var = e3Var.f13218a;
                if (!z10 || q0Var.f11412f == null) {
                    m0Var = new ig.m0(view.getContext(), null, e4Var.f13221b2, null, view, e4Var.getMeasuredWidth() / 2.0f, e4Var.getMeasuredHeight() / 2.0f, q0Var, e4Var.f13296y2, 2, true);
                } else {
                    try {
                        e4Var.performHapticFeedback(0);
                        break;
                    } catch (Exception unused) {
                    }
                    m0Var = new ig.m0(view.getContext(), null, e4Var.f13221b2, null, view, e4Var.getMeasuredWidth() / 2.0f, e4Var.getMeasuredHeight() / 2.0f, q0Var, e4Var.f13296y2, 0, true);
                }
                ig.m0.B = m0Var;
                int i13 = R.id.parent_tag;
                ig.j0 j0Var = m0Var.f11357i;
                j0Var.setTag(i13, 1);
                e4Var.addView(j0Var);
                c4 c4Var = e4Var.K1;
                m0Var.f11367s = true;
                m0Var.f11372y = System.currentTimeMillis();
                if (q0Var.f11412f != null) {
                    documentF = MediaDataController.getInstance(e4Var.f13296y2).getEmojiAnimatedSticker(q0Var.f11412f);
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(q0Var.f11412f, e4Var.f13291x1);
                    sendMessageParamsOf.replyToStoryItem = c4Var.f13141a;
                    sendMessageParamsOf.payStars = l10.longValue();
                    SendMessagesHelper.getInstance(e4Var.f13296y2).sendMessage(sendMessageParamsOf);
                } else {
                    documentF = org.telegram.ui.Components.k5.f(e4Var.f13296y2, q0Var.f11413g);
                    String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(documentF, null);
                    if (strFindAnimatedEmojiEmoticon == null) {
                        if (e4Var.f13221b2.getReactionsWindow() != null) {
                            e4Var.f13221b2.getReactionsWindow().e();
                        }
                        e4Var.s0();
                    } else {
                        SendMessagesHelper.SendMessageParams sendMessageParamsOf2 = SendMessagesHelper.SendMessageParams.of(strFindAnimatedEmojiEmoticon, e4Var.f13291x1);
                        sendMessageParamsOf2.entities = new ArrayList<>();
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = q0Var.f11413g;
                        tL_messageEntityCustomEmoji.offset = 0;
                        tL_messageEntityCustomEmoji.length = strFindAnimatedEmojiEmoticon.length();
                        sendMessageParamsOf2.entities.add(tL_messageEntityCustomEmoji);
                        sendMessageParamsOf2.replyToStoryItem = c4Var.f13141a;
                        sendMessageParamsOf2.payStars = l10.longValue();
                        SendMessagesHelper.getInstance(e4Var.f13296y2).sendMessage(sendMessageParamsOf2);
                    }
                }
                if (l10.longValue() <= 0) {
                    ec ecVarQ = new mc(e4Var.Y0, e4Var.f13290x0).q(documentF, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new y9(e3Var, 11));
                    ecVarQ.f28020j = 5000;
                    ecVarQ.j();
                }
                if (e4Var.f13221b2.getReactionsWindow() != null) {
                    e4Var.f13221b2.getReactionsWindow().e();
                }
                e4Var.s0();
                break;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                e4 e4Var2 = ((x3) obj4).f14128l;
                j3 j3Var = e4Var2.Y0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (e4Var2.f13295y1) {
                        new mc(j3Var, c6Var).Q(z10 ? R.raw.contact_check : R.raw.chats_archived, 36, LocaleController.getString(z10 ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).j();
                    } else if (z10) {
                        new mc(j3Var, c6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                    } else {
                        mcVar = new mc(j3Var, c6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    mcVar = new mc(j3Var, c6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.y1.q(i11, mcVar, i10, 36);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i14 = ChatActivityEnterView.f26070i5;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                gh.k2 k2Var = new gh.k2(chatActivityEnterView.getContext(), chatActivityEnterView.M, ((TLRPC.User) obj2).f22527id, cg.q0.c(cg.q0.b(1, (List) obj)), null);
                k2Var.V(z10);
                k2Var.show();
                break;
        }
    }

    public d3(x3 x3Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f13189c = x3Var;
        this.d = storyItem;
        this.f13188b = z10;
        this.f13190e = c6Var;
    }

    public d3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, boolean z10) {
        this.f13189c = chatActivityEnterView;
        this.d = b2Var;
        this.f13190e = user;
        this.f13188b = z10;
    }
}
