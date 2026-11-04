package dh;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import ci.x2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.LaunchActivity;
public abstract class p0 {
    public static void a(TLRPC.TL_availableReaction tL_availableReaction, LinkedHashMap linkedHashMap, ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, m mVar, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j10 = document.f27007id;
        p5 e10 = e(document, Long.valueOf(j10), fontMetricsInt);
        linkedHashMap.put(Long.valueOf(j10), e10);
        arrayList.add(Long.valueOf(j10));
        SpannableString spannableString = new SpannableString(tL_availableReaction.reaction);
        spannableString.setSpan(e10, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (mVar != null) {
            mVar.x(Long.valueOf(j10), false);
        }
    }

    public static void b(TLRPC.Reaction reaction, TLRPC.Reaction reaction2, TL_stories.StoryViews storyViews) {
        if (storyViews != null) {
            int i3 = 0;
            boolean z10 = false;
            while (i3 < storyViews.reactions.size()) {
                TLRPC.ReactionCount reactionCount = storyViews.reactions.get(i3);
                if (reaction != null && d(reactionCount.reaction, reaction)) {
                    int i10 = reactionCount.count - 1;
                    reactionCount.count = i10;
                    if (i10 <= 0) {
                        storyViews.reactions.remove(i3);
                        i3--;
                        i3++;
                    }
                }
                if (reaction2 != null && d(reactionCount.reaction, reaction2)) {
                    reactionCount.count++;
                    z10 = true;
                }
                i3++;
            }
            if (!z10) {
                TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                tL_reactionCount.count = 1;
                tL_reactionCount.reaction = reaction2;
                storyViews.reactions.add(tL_reactionCount);
            }
        }
    }

    public static boolean c(TLRPC.Reaction reaction, n0 n0Var) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && n0Var.f9098g == 0 && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, n0Var.f9097f)) {
            return true;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j10 = n0Var.f9098g;
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

    public static p5 e(TLRPC.Document document, Long l10, Paint.FontMetricsInt fontMetricsInt) {
        p5 p5Var;
        if (document != null) {
            p5Var = new p5(document.f27007id, 1.0f, fontMetricsInt);
            p5Var.document = document;
        } else {
            p5Var = new p5(l10.longValue(), 1.0f, fontMetricsInt);
        }
        p5Var.cacheType = g5.f();
        return p5Var;
    }

    public static void f(long j10, int i3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        d2 Q = LaunchActivity.Q();
        if (Q != null && tL_premium_boostsStatus != null) {
            vg.i0 i0Var = new vg.i0(21, h10.f22829t0, Q.getContext(), Q, Q.getResourceProvider());
            i0Var.K2 = i3;
            i0Var.z1(tL_premium_boostsStatus, true);
            i0Var.B1(j10);
            i0Var.J2 = new x2(Q, j10);
            i0Var.show();
        }
    }
}
