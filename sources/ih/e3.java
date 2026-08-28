package ih;

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
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
public final class e3 implements Utilities.Callback {
    public final int f11350a = 1;
    public final boolean f11351b;
    public final Object f11352c;
    public final Object d;
    public final Object f11353e;

    public e3(f3 f3Var, boolean z10, hg.r0 r0Var, View view) {
        this.f11352c = f3Var;
        this.f11351b = z10;
        this.d = r0Var;
        this.f11353e = view;
    }

    @Override
    public final void run(Object obj) {
        hg.n0 n0Var;
        TLRPC.Document f10;
        oc ocVar;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = this.f11350a;
        boolean z10 = this.f11351b;
        Object obj2 = this.f11353e;
        Object obj3 = this.d;
        Object obj4 = this.f11352c;
        switch (i13) {
            case 0:
                f3 f3Var = (f3) obj4;
                hg.r0 r0Var = (hg.r0) obj3;
                View view = (View) obj2;
                Long l10 = (Long) obj;
                i4 i4Var = f3Var.f11412a;
                if (z10 && r0Var.f10717f != null) {
                    try {
                        i4Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    n0Var = new hg.n0(view.getContext(), null, i4Var.f11534b2, null, view, i4Var.getMeasuredWidth() / 2.0f, i4Var.getMeasuredHeight() / 2.0f, r0Var, i4Var.f11609y2, 0, true);
                } else {
                    n0Var = new hg.n0(view.getContext(), null, i4Var.f11534b2, null, view, i4Var.getMeasuredWidth() / 2.0f, i4Var.getMeasuredHeight() / 2.0f, r0Var, i4Var.f11609y2, 2, true);
                }
                hg.n0.B = n0Var;
                int i14 = R.id.parent_tag;
                hg.k0 k0Var = n0Var.f10662i;
                k0Var.setTag(i14, 1);
                i4Var.addView(k0Var);
                g4 g4Var = i4Var.K1;
                n0Var.f10672s = true;
                n0Var.f10677y = System.currentTimeMillis();
                if (r0Var.f10717f != null) {
                    f10 = MediaDataController.getInstance(i4Var.f11609y2).getEmojiAnimatedSticker(r0Var.f10717f);
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(r0Var.f10717f, i4Var.f11604x1);
                    of2.replyToStoryItem = g4Var.f11466a;
                    of2.payStars = l10.longValue();
                    SendMessagesHelper.getInstance(i4Var.f11609y2).sendMessage(of2);
                } else {
                    f10 = org.telegram.ui.Components.k5.f(i4Var.f11609y2, r0Var.f10718g);
                    String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f10, null);
                    if (findAnimatedEmojiEmoticon == null) {
                        if (i4Var.f11534b2.getReactionsWindow() != null) {
                            i4Var.f11534b2.getReactionsWindow().e();
                        }
                        i4Var.s0();
                        return;
                    }
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, i4Var.f11604x1);
                    of3.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = r0Var.f10718g;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
                    of3.entities.add(tL_messageEntityCustomEmoji);
                    of3.replyToStoryItem = g4Var.f11466a;
                    of3.payStars = l10.longValue();
                    SendMessagesHelper.getInstance(i4Var.f11609y2).sendMessage(of3);
                }
                if (l10.longValue() <= 0) {
                    gc q10 = new oc(i4Var.Y0, i4Var.f11603x0).q(f10, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new g(f3Var, 4));
                    q10.f28737j = 5000;
                    q10.j();
                }
                if (i4Var.f11534b2.getReactionsWindow() != null) {
                    i4Var.f11534b2.getReactionsWindow().e();
                }
                i4Var.s0();
                return;
            case 1:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj2;
                i4 i4Var2 = ((b4) obj4).f11268l;
                l3 l3Var = i4Var2.Y0;
                if (((Boolean) obj).booleanValue()) {
                    storyItem.pinned = z10;
                    if (i4Var2.f11608y1) {
                        oc ocVar2 = new oc(l3Var, b6Var);
                        if (z10) {
                            i11 = R.raw.contact_check;
                        } else {
                            i11 = R.raw.chats_archived;
                        }
                        if (z10) {
                            i12 = R.string.StoryPinnedToProfile;
                        } else {
                            i12 = R.string.StoryArchivedFromProfile;
                        }
                        ocVar2.Q(i11, 36, LocaleController.getString(i12)).j();
                        return;
                    } else if (z10) {
                        new oc(l3Var, b6Var).M(LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription), R.raw.contact_check).j();
                        return;
                    } else {
                        ocVar = new oc(l3Var, b6Var);
                        i9 = R.raw.chats_archived;
                        i10 = R.string.StoryUnpinnedFromPosts;
                    }
                } else {
                    ocVar = new oc(l3Var, b6Var);
                    i9 = R.raw.error;
                    i10 = R.string.UnknownError;
                }
                org.telegram.messenger.l0.p(i10, ocVar, i9, 36);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i15 = ChatActivityEnterView.f26074i5;
                ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                fh.p2 p2Var = new fh.p2(chatActivityEnterView.getContext(), chatActivityEnterView.M, ((TLRPC.User) obj2).f22527id, bg.u0.c(bg.u0.b(1, (List) obj)), null);
                p2Var.U(z10);
                p2Var.show();
                return;
        }
    }

    public e3(b4 b4Var, TL_stories.StoryItem storyItem, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f11352c = b4Var;
        this.d = storyItem;
        this.f11351b = z10;
        this.f11353e = b6Var;
    }

    public e3(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.ActionBar.c2 c2Var, TLRPC.User user, boolean z10) {
        this.f11352c = chatActivityEnterView;
        this.d = c2Var;
        this.f11353e = user;
        this.f11351b = z10;
    }
}
