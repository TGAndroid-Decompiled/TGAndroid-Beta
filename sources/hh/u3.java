package hh;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.er;
import org.telegram.ui.dj;
import org.telegram.ui.eh;
import org.telegram.ui.rn;

public final class u3 implements Utilities.Callback {

    public final int f10136a;

    public final long f10137b;

    public final long f10138c;
    public final Object d;

    public u3(Object obj, long j10, long j11, int i10) {
        this.f10136a = i10;
        this.d = obj;
        this.f10137b = j10;
        this.f10138c = j11;
    }

    @Override
    public final void run(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        int size;
        int i10;
        int i11 = this.f10136a;
        Object obj2 = this.d;
        switch (i11) {
            case 0:
                g4 g4Var = (g4) obj2;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.s5 s5Var = g4Var.A;
                if (this.f10137b == this.f10138c) {
                    g4Var.W = arrayList;
                    s5Var.animate().alpha(g4Var.f9317s ? 0.0f : g4Var.W != null ? 1.0f : 0.25f).setInterpolator(er.h).setDuration(420L).start();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        if ((arrayList.get(i12) instanceof TL_stars.starGiftAttributeModel) && !(((TL_stars.StarGiftAttribute) arrayList.get(i12)).rarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
                            arrayList2.add((TL_stars.starGiftAttributeModel) arrayList.get(i12));
                            if (arrayList2.size() >= 3) {
                                spannableStringBuilder = new SpannableStringBuilder();
                                size = arrayList2.size();
                                i10 = 0;
                                while (i10 < size) {
                                    Object obj3 = arrayList2.get(i10);
                                    i10++;
                                    spannableStringBuilder.append((CharSequence) "x");
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(((TL_stars.starGiftAttributeModel) obj3).document, s5Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                if (spannableStringBuilder.length() > 0) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                }
                                spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                                s5Var.setText(spannableStringBuilder);
                                break;
                            }
                        }
                    }
                    spannableStringBuilder = new SpannableStringBuilder();
                    size = arrayList2.size();
                    i10 = 0;
                    while (i10 < size) {
                        Object obj4 = arrayList2.get(i10);
                        i10++;
                        spannableStringBuilder.append((CharSequence) "x");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(((TL_stars.starGiftAttributeModel) obj4).document, s5Var.getPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    if (spannableStringBuilder.length() > 0) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    spannableStringBuilder.append(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.GiftCraftViewAllVariants), false, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    s5Var.setText(spannableStringBuilder);
                    break;
                }
                break;
            case 1:
                rn.m1((rn) obj2, this.f10137b, this.f10138c, (Long) obj);
                break;
            default:
                dj djVar = (dj) obj2;
                Long l10 = (Long) obj;
                rn rnVar = djVar.f37415b;
                if (rnVar.getParentActivity() != null) {
                    Activity parentActivity = rnVar.getParentActivity();
                    String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    int i13 = ChatObject.isMonoForum(rnVar.f42026e) ? R.string.RemoveMessageFeeMessageChannel : R.string.RemoveMessageFeeMessage;
                    long j10 = this.f10137b;
                    org.telegram.ui.Components.y4.i0(parentActivity, string, AndroidUtilities.replaceTags(LocaleController.formatString(i13, DialogObject.getShortName(j10))), l10.longValue() > 0 ? LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l10.longValue()) : null, LocaleController.getString(R.string.Confirm), new eh(djVar, j10, this.f10138c, l10, 1), ((org.telegram.ui.ActionBar.n2) rnVar).resourceProvider, true);
                    break;
                }
                break;
        }
    }
}
