package bh;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.t5;
import org.telegram.ui.LaunchActivity;
public abstract class a1 {
    public static void a(TLRPC.TL_availableReaction tL_availableReaction, LinkedHashMap linkedHashMap, ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, s sVar, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j10 = document.f22034id;
        c6 e = e(document, Long.valueOf(j10), fontMetricsInt);
        linkedHashMap.put(Long.valueOf(j10), e);
        arrayList.add(Long.valueOf(j10));
        SpannableString spannableString = new SpannableString(tL_availableReaction.reaction);
        spannableString.setSpan(e, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (sVar != null) {
            sVar.x(Long.valueOf(j10), false);
        }
    }

    public static void b(TLRPC.Reaction reaction, TLRPC.Reaction reaction2, TL_stories.StoryViews storyViews) {
        if (storyViews != null) {
            int i10 = 0;
            boolean z10 = false;
            while (i10 < storyViews.reactions.size()) {
                TLRPC.ReactionCount reactionCount = storyViews.reactions.get(i10);
                if (reaction != null && d(reactionCount.reaction, reaction)) {
                    int i11 = reactionCount.count - 1;
                    reactionCount.count = i11;
                    if (i11 <= 0) {
                        storyViews.reactions.remove(i10);
                        i10--;
                        i10++;
                    }
                }
                if (reaction2 != null && d(reactionCount.reaction, reaction2)) {
                    reactionCount.count++;
                    z10 = true;
                }
                i10++;
            }
            if (!z10) {
                TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                tL_reactionCount.count = 1;
                tL_reactionCount.reaction = reaction2;
                storyViews.reactions.add(tL_reactionCount);
            }
        }
    }

    public static boolean c(TLRPC.Reaction reaction, x0 x0Var) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && x0Var.f4209g == 0 && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, x0Var.f4208f)) {
            return true;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j10 = x0Var.f4209g;
            if (j10 != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean d(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji) && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
            return true;
        }
        if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id) {
            return true;
        }
        return false;
    }

    public static c6 e(TLRPC.Document document, Long l4, Paint.FontMetricsInt fontMetricsInt) {
        c6 c6Var;
        if (document != null) {
            c6Var = new c6(document.f22034id, 1.0f, fontMetricsInt);
            c6Var.document = document;
        } else {
            c6Var = new c6(l4.longValue(), 1.0f, fontMetricsInt);
        }
        c6Var.cacheType = t5.g();
        return c6Var;
    }

    public static void f(long j10, int i10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        r2 R = LaunchActivity.R();
        if (R != null && tL_premium_boostsStatus != null) {
            tg.j0 j0Var = new tg.j0(21, UserConfig.selectedAccount, R.getContext(), R, R.getResourceProvider());
            j0Var.R0 = i10;
            j0Var.J1(tL_premium_boostsStatus, true);
            j0Var.L1(j10);
            j0Var.Q0 = new z0(R, j10);
            j0Var.show();
        }
    }
}
