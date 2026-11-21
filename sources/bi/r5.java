package bi;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.gq0;
public final class r5 extends b71 {
    public final int f4052a;
    public final org.telegram.ui.ActionBar.h6 f4053b;
    public final gq0 f4054c;

    public r5(gq0 gq0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f4054c = gq0Var;
        this.f4052a = i7;
        this.f4053b = h6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        gq0 gq0Var = this.f4054c;
        f5 f5Var = gq0Var.R;
        di.n8 n8Var = gq0Var.f4117e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
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
        n8Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = n8Var.f9406e;
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
        n8Var.j();
        n6 currentPage = gq0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i7 = n8Var.f(currentPage.f3947e.d) + 1;
            }
            gq0Var.f4119n.f(0.0f, i7, i7);
        }
        org.telegram.messenger.g0.r(f5Var);
        org.telegram.messenger.g0.h3(f5Var, 1000L);
    }

    @Override
    public final void b(View view, int i7, int i10) {
        di.p8 p8Var;
        boolean z10;
        gq0 gq0Var = this.f4054c;
        di.n8 n8Var = gq0Var.f4117e;
        n6 n6Var = (n6) view;
        int i11 = 0;
        if (i10 == 0) {
            p8Var = gq0Var.d;
            z10 = false;
        } else {
            int i12 = i7 - 1;
            if (i12 >= 0) {
                if (i12 < n8Var.d().size()) {
                    p8Var = n8Var.e(((TL_stars.TL_starGiftCollection) n8Var.d().get(i12)).collection_id);
                    z10 = true;
                }
            } else {
                n8Var.getClass();
            }
            p8Var = null;
            z10 = true;
        }
        n6Var.d = z10;
        n6Var.f3947e = p8Var;
        if (p8Var != null) {
            p8Var.a();
        }
        n6Var.f(false);
        LinearLayout linearLayout = n6Var.E;
        if (linearLayout != null) {
            if (!n6Var.f3944a.f4117e.h()) {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
        }
        n6Var.setVisibleHeight(gq0Var.U);
        n6Var.setHasTabs(!n8Var.d().isEmpty());
    }

    @Override
    public final boolean c(int i7) {
        if (i7 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i7) {
        if (i7 == -1) {
            return null;
        }
        int i10 = this.f4052a;
        org.telegram.ui.ActionBar.h6 h6Var = this.f4053b;
        gq0 gq0Var = this.f4054c;
        n6 n6Var = new n6(gq0Var, i10, h6Var);
        ri.q qVar = gq0Var.O;
        if (qVar != null) {
            qVar.b(n6Var.f3948f);
        }
        return n6Var;
    }

    @Override
    public final int e() {
        return this.f4054c.f4117e.d().size() + 1;
    }

    @Override
    public final int f(int i7) {
        if (i7 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f4054c.f4117e.d().get(i7 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i7) {
        if (i7 == 0) {
            return gd.N0(2131750231, null);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f4054c.f4117e.d().get(i7 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override
    public final int h(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return 1;
    }
}
