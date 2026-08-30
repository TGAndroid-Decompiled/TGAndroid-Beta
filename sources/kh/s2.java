package kh;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import lh.j7;
import lh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.or0;
public final class s2 extends c81 {
    public final int f10812a;
    public final org.telegram.ui.ActionBar.f6 f10813b;
    public final or0 f10814c;

    public s2(or0 or0Var, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f10814c = or0Var;
        this.f10812a = i10;
        this.f10813b = f6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        or0 or0Var = this.f10814c;
        l2 l2Var = or0Var.K;
        j7 j7Var = or0Var.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2) {
                arrayList2.add(num);
            }
        }
        j7Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = j7Var.e;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
            hashMap.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList2.get(i13);
            i13++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) hashMap.get(num2);
            if (tL_starGiftCollection2 != null) {
                arrayList4.add(tL_starGiftCollection2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        j7Var.j();
        n3 currentPage = or0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i10 = j7Var.f(currentPage.e.d) + 1;
            }
            or0Var.f10943n.e(0.0f, i10, i10);
        }
        AndroidUtilities.cancelRunOnUIThread(l2Var);
        AndroidUtilities.runOnUIThread(l2Var, 1000L);
    }

    @Override
    public final void b(View view, int i10, int i11) {
        l7 l7Var;
        boolean z4;
        or0 or0Var = this.f10814c;
        j7 j7Var = or0Var.e;
        n3 n3Var = (n3) view;
        int i12 = 0;
        if (i11 == 0) {
            l7Var = or0Var.d;
            z4 = false;
        } else {
            int i13 = i10 - 1;
            if (i13 >= 0) {
                if (i13 < j7Var.d().size()) {
                    l7Var = j7Var.e(((TL_stars.TL_starGiftCollection) j7Var.d().get(i13)).collection_id);
                    z4 = true;
                }
            } else {
                j7Var.getClass();
            }
            l7Var = null;
            z4 = true;
        }
        n3Var.d = z4;
        n3Var.e = l7Var;
        if (l7Var != null) {
            l7Var.a();
        }
        n3Var.f(false);
        LinearLayout linearLayout = n3Var.B;
        if (linearLayout != null) {
            if (!n3Var.f10719a.e.h()) {
                i12 = 8;
            }
            linearLayout.setVisibility(i12);
        }
        n3Var.setVisibleHeight(or0Var.N);
        n3Var.setHasTabs(!j7Var.d().isEmpty());
    }

    @Override
    public final boolean c(int i10) {
        if (i10 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i10) {
        if (i10 == -1) {
            return null;
        }
        return new n3(this.f10814c, this.f10812a, this.f10813b);
    }

    @Override
    public final int e() {
        return this.f10814c.e.d().size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f10814c.e.d().get(i10 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.Gift2CollectionAll);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f10814c.e.d().get(i10 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override
    public final int h(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }
}
