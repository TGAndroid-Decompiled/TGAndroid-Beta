package ci;

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
import org.telegram.ui.Components.xc;
public final class k3 implements Utilities.Callback {
    public final int f5489a = 1;
    public final boolean f5490b;
    public final Object f5491c;
    public final Object d;
    public final Object e;

    public k3(l3 l3Var, boolean z10, ah.i1 i1Var, View view) {
        this.f5491c = l3Var;
        this.f5490b = z10;
        this.d = i1Var;
        this.e = view;
    }

    @Override
    public final void run(Object obj) {
        ah.d1 d1Var;
        TLRPC.Document f7;
        xc xcVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f5489a;
        boolean z10 = this.f5490b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f5491c;
        switch (i14) {
            case 0:
                l3 l3Var = (l3) obj4;
                ah.i1 i1Var = (ah.i1) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                p4 p4Var = l3Var.f5513a;
                if (z10 && i1Var.f784f != null) {
                    try {
                        p4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    d1Var = new ah.d1(view.getContext(), null, p4Var.f5668f2, null, view, p4Var.getMeasuredWidth() / 2.0f, p4Var.getMeasuredHeight() / 2.0f, i1Var, p4Var.C2, 0, true);
                } else {
                    d1Var = new ah.d1(view.getContext(), null, p4Var.f5668f2, null, view, p4Var.getMeasuredWidth() / 2.0f, p4Var.getMeasuredHeight() / 2.0f, i1Var, p4Var.C2, 2, true);
                }
                ah.d1.B = d1Var;
                int i15 = R.id.parent_tag;
                ah.a1 a1Var = d1Var.f693i;
                a1Var.setTag(i15, 1);
                p4Var.addView(a1Var);
                n4 n4Var = p4Var.O1;
                d1Var.f703s = true;
                d1Var.f708y = System.currentTimeMillis();
                if (i1Var.f784f != null) {
                    f7 = MediaDataController.getInstance(p4Var.C2).getEmojiAnimatedSticker(i1Var.f784f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(i1Var.f784f, p4Var.B1);
                    of2.replyToStoryItem = n4Var.f5595a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(p4Var.C2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.r5.f(p4Var.C2, i1Var.f785g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (p4Var.f5668f2.getReactionsWindow() != null) {
                            p4Var.f5668f2.getReactionsWindow().e();
                        }
                        p4Var.r0();
                        return;
                    }
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, p4Var.B1);
                    of3.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = i1Var.f785g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of3.entities.add(tL_messageEntityCustomEmoji);
                    of3.replyToStoryItem = n4Var.f5595a;
                    of3.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(p4Var.C2).sendMessage(of3);
                }
                if (l4.longValue() <= 0) {
                    qc r10 = new xc(p4Var.f5656c1, p4Var.B0).r(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new androidx.fragment.app.d(l3Var, 10));
                    r10.f29832j = 5000;
                    r10.j();
                }
                if (p4Var.f5668f2.getReactionsWindow() != null) {
                    p4Var.f5668f2.getReactionsWindow().e();
                }
                p4Var.r0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                p4 p4Var2 = ((g4) obj4).f5359l;
                q3 q3Var = p4Var2.f5656c1;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (p4Var2.C1) {
                        xc xcVar2 = new xc(q3Var, g6Var);
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
                        new xc(q3Var, g6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        return;
                    } else {
                        xcVar = new xc(q3Var, g6Var);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    xcVar = new xc(q3Var, g6Var);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.v0.p(i11, xcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i16 = ChatActivityEnterView.f24050r5;
                ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                yh.o1 o1Var = new yh.o1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).f20490id, ug.q.c(ug.q.b(1, (List) obj)), null);
                o1Var.V(z10);
                o1Var.show();
                return;
        }
    }

    public k3(g4 g4Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f5491c = g4Var;
        this.d = storyItem;
        this.f5490b = z10;
        this.e = g6Var;
    }

    public k3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, boolean z10) {
        this.f5491c = chatActivityEnterView;
        this.d = c2Var;
        this.e = user;
        this.f5490b = z10;
    }
}
