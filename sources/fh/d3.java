package fh;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import gh.l7;
import gh.n7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.vq0;
public final class d3 extends e71 {
    public final int f6413a;
    public final org.telegram.ui.ActionBar.b6 f6414b;
    public final vq0 f6415c;

    public d3(vq0 vq0Var, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f6415c = vq0Var;
        this.f6413a = i9;
        this.f6414b = b6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        vq0 vq0Var = this.f6415c;
        t2 t2Var = vq0Var.J;
        l7 l7Var = vq0Var.f6548e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2) {
                arrayList2.add(num);
            }
        }
        l7Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = l7Var.f8504e;
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
            hashMap.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) hashMap.get(num2);
            if (tL_starGiftCollection2 != null) {
                arrayList4.add(tL_starGiftCollection2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        l7Var.j();
        y3 currentPage = vq0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i9 = l7Var.f(currentPage.f6883e.d) + 1;
            }
            vq0Var.f6550n.e(0.0f, i9, i9);
        }
        AndroidUtilities.cancelRunOnUIThread(t2Var);
        AndroidUtilities.runOnUIThread(t2Var, 1000L);
    }

    @Override
    public final void b(View view, int i9, int i10) {
        n7 n7Var;
        boolean z10;
        vq0 vq0Var = this.f6415c;
        l7 l7Var = vq0Var.f6548e;
        y3 y3Var = (y3) view;
        int i11 = 0;
        if (i10 == 0) {
            n7Var = vq0Var.d;
            z10 = false;
        } else {
            int i12 = i9 - 1;
            if (i12 >= 0) {
                if (i12 < l7Var.d().size()) {
                    n7Var = l7Var.e(((TL_stars.TL_starGiftCollection) l7Var.d().get(i12)).collection_id);
                    z10 = true;
                }
            } else {
                l7Var.getClass();
            }
            n7Var = null;
            z10 = true;
        }
        y3Var.d = z10;
        y3Var.f6883e = n7Var;
        if (n7Var != null) {
            n7Var.a();
        }
        y3Var.f(false);
        LinearLayout linearLayout = y3Var.A;
        if (linearLayout != null) {
            if (!y3Var.f6880a.f6548e.h()) {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
        }
        y3Var.setVisibleHeight(vq0Var.M);
        y3Var.setHasTabs(!l7Var.d().isEmpty());
    }

    @Override
    public final boolean c(int i9) {
        if (i9 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i9) {
        if (i9 == -1) {
            return null;
        }
        return new y3(this.f6415c, this.f6413a, this.f6414b);
    }

    @Override
    public final int e() {
        return this.f6415c.f6548e.d().size() + 1;
    }

    @Override
    public final int f(int i9) {
        if (i9 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f6415c.f6548e.d().get(i9 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i9) {
        if (i9 == 0) {
            return LocaleController.getString(R.string.Gift2CollectionAll);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f6415c.f6548e.d().get(i9 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override
    public final int h(int i9) {
        if (i9 == 0) {
            return 0;
        }
        return 1;
    }
}
