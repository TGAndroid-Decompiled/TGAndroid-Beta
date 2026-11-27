package defpackage;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public abstract class z49 {
    public static void a(TLRPC.TL_availableReaction tL_availableReaction, LinkedHashMap linkedHashMap, ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, r82 r82Var, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j = document.id;
        hm e = e(document, Long.valueOf(j), fontMetricsInt);
        linkedHashMap.put(Long.valueOf(j), e);
        arrayList.add(Long.valueOf(j));
        SpannableString spannableString = new SpannableString(tL_availableReaction.reaction);
        spannableString.setSpan(e, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (r82Var != null) {
            r82Var.x(Long.valueOf(j), false);
        }
    }

    public static void b(TLRPC.Reaction reaction, TLRPC.Reaction reaction2, TL_stories.StoryViews storyViews) {
        if (storyViews != null) {
            int i = 0;
            boolean z = false;
            while (i < storyViews.reactions.size()) {
                TLRPC.ReactionCount reactionCount = storyViews.reactions.get(i);
                if (reaction != null && d(reactionCount.reaction, reaction)) {
                    int i2 = reactionCount.count - 1;
                    reactionCount.count = i2;
                    if (i2 <= 0) {
                        storyViews.reactions.remove(i);
                        i--;
                        i++;
                    }
                }
                if (reaction2 != null && d(reactionCount.reaction, reaction2)) {
                    reactionCount.count++;
                    z = true;
                }
                i++;
            }
            if (!z) {
                TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                tL_reactionCount.count = 1;
                tL_reactionCount.reaction = reaction2;
                storyViews.reactions.add(tL_reactionCount);
            }
        }
    }

    public static boolean c(TLRPC.Reaction reaction, w49 w49Var) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && w49Var.g == 0 && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, w49Var.f)) {
            return true;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j = w49Var.g;
            if (j != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j) {
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

    public static hm e(TLRPC.Document document, Long l, Paint.FontMetricsInt fontMetricsInt) {
        hm hmVar;
        if (document != null) {
            hmVar = new hm(document.id, 1.0f, fontMetricsInt);
            hmVar.document = document;
        } else {
            hmVar = new hm(l.longValue(), 1.0f, fontMetricsInt);
        }
        hmVar.cacheType = wl.f();
        return hmVar;
    }

    public static void f(long j, int i, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        e Q = LaunchActivity.Q();
        if (Q != null && tL_premium_boostsStatus != null) {
            l46 l46Var = new l46(21, yac.t0, Q.getResourceProvider(), Q.getContext(), Q);
            l46Var.M2 = i;
            l46Var.r1(tL_premium_boostsStatus, true);
            l46Var.t1(j);
            l46Var.L2 = new y49(Q, j);
            l46Var.show();
        }
    }
}
