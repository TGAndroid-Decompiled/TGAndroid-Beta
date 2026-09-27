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
    public final int f1550a = 0;
    public final boolean f1551b;
    public final Object f1552c;
    public final Object d;
    public final Object e;

    public t4(u4 u4Var, boolean z10, zg.p0 p0Var, View view) {
        this.f1552c = u4Var;
        this.f1551b = z10;
        this.d = p0Var;
        this.e = view;
    }

    @Override
    public final void run(Object obj) {
        zg.l0 l0Var;
        TLRPC.Document f7;
        xc xcVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f1550a;
        boolean z10 = this.f1551b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f1552c;
        switch (i14) {
            case 0:
                u4 u4Var = (u4) obj4;
                zg.p0 p0Var = (zg.p0) obj3;
                View view = (View) obj2;
                Long l4 = (Long) obj;
                e6 e6Var = u4Var.f1578a;
                if (z10 && p0Var.f49444f != null) {
                    try {
                        e6Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    l0Var = new zg.l0(view.getContext(), null, e6Var.f791f2, null, view, e6Var.getMeasuredWidth() / 2.0f, e6Var.getMeasuredHeight() / 2.0f, p0Var, e6Var.C2, 0, true);
                } else {
                    l0Var = new zg.l0(view.getContext(), null, e6Var.f791f2, null, view, e6Var.getMeasuredWidth() / 2.0f, e6Var.getMeasuredHeight() / 2.0f, p0Var, e6Var.C2, 2, true);
                }
                zg.l0.B = l0Var;
                int i15 = R.id.parent_tag;
                zg.i0 i0Var = l0Var.f49389i;
                i0Var.setTag(i15, 1);
                e6Var.addView(i0Var);
                c6 c6Var = e6Var.O1;
                l0Var.f49399s = true;
                l0Var.f49404y = System.currentTimeMillis();
                if (p0Var.f49444f != null) {
                    f7 = MediaDataController.getInstance(e6Var.C2).getEmojiAnimatedSticker(p0Var.f49444f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(p0Var.f49444f, e6Var.B1);
                    of2.replyToStoryItem = c6Var.f645a;
                    of2.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(e6Var.C2).sendMessage(of2);
                } else {
                    f7 = org.telegram.ui.Components.q5.f(e6Var.C2, p0Var.f49445g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f7, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (e6Var.f791f2.getReactionsWindow() != null) {
                            e6Var.f791f2.getReactionsWindow().e();
                        }
                        e6Var.s0();
                        return;
                    }
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, e6Var.B1);
                    of3.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = p0Var.f49445g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of3.entities.add(tL_messageEntityCustomEmoji);
                    of3.replyToStoryItem = c6Var.f645a;
                    of3.payStars = l4.longValue();
                    SendMessagesHelper.getInstance(e6Var.C2).sendMessage(of3);
                }
                if (l4.longValue() <= 0) {
                    org.telegram.ui.Components.qc q6 = new xc(e6Var.f779c1, e6Var.B0).q(f7, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new a3.d(u4Var, 6));
                    q6.f27691j = 5000;
                    q6.j();
                }
                if (e6Var.f791f2.getReactionsWindow() != null) {
                    e6Var.f791f2.getReactionsWindow().e();
                }
                e6Var.s0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                e6 e6Var3 = ((v5) obj4).f1614l;
                a5 a5Var = e6Var3.f779c1;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (e6Var3.C1) {
                        xc xcVar2 = new xc(a5Var, e6Var2);
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
                        new xc(a5Var, e6Var2).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        return;
                    } else {
                        xcVar = new xc(a5Var, e6Var2);
                        i10 = R.raw.chats_archived;
                        i11 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    xcVar = new xc(a5Var, e6Var2);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.l0.o(i11, xcVar, i10, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i16 = ChatActivityEnterView.f21955n5;
                ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                xh.r1 r1Var = new xh.r1(chatActivityEnterView.getContext(), chatActivityEnterView.Q, ((TLRPC.User) obj2).f18476id, tg.s.c(tg.s.b(1, (List) obj)), null);
                r1Var.V(z10);
                r1Var.show();
                return;
        }
    }

    public t4(v5 v5Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f1552c = v5Var;
        this.d = storyItem;
        this.f1551b = z10;
        this.e = e6Var;
    }

    public t4(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, boolean z10) {
        this.f1552c = chatActivityEnterView;
        this.d = c2Var;
        this.e = user;
        this.f1551b = z10;
    }
}
