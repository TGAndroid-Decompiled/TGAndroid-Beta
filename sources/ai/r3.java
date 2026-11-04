package ai;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import ci.s8;
import ci.v8;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.vp0;
public final class r3 extends f61 {
    public final int f942a;
    public final org.telegram.ui.ActionBar.e6 f943b;
    public final vp0 f944c;

    public r3(vp0 vp0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f944c = vp0Var;
        this.f942a = i3;
        this.f943b = e6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        vp0 vp0Var = this.f944c;
        c3 c3Var = vp0Var.R;
        s8 s8Var = vp0Var.f1013e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
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
        s8Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = s8Var.f5968e;
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
        s8Var.j();
        o4 currentPage = vp0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i3 = s8Var.f(currentPage.f859e.d) + 1;
            }
            vp0Var.f1015n.e(0.0f, i3, i3);
        }
        org.telegram.messenger.g0.r(c3Var);
        org.telegram.messenger.g0.i3(c3Var, 1000L);
    }

    @Override
    public final void b(View view, int i3, int i10) {
        v8 v8Var;
        boolean z10;
        vp0 vp0Var = this.f944c;
        s8 s8Var = vp0Var.f1013e;
        o4 o4Var = (o4) view;
        int i11 = 0;
        if (i10 == 0) {
            v8Var = vp0Var.d;
            z10 = false;
        } else {
            int i12 = i3 - 1;
            if (i12 >= 0) {
                if (i12 < s8Var.d().size()) {
                    v8Var = s8Var.e(((TL_stars.TL_starGiftCollection) s8Var.d().get(i12)).collection_id);
                    z10 = true;
                }
            } else {
                s8Var.getClass();
            }
            v8Var = null;
            z10 = true;
        }
        o4Var.d = z10;
        o4Var.f859e = v8Var;
        if (v8Var != null) {
            v8Var.a();
        }
        o4Var.f(false);
        LinearLayout linearLayout = o4Var.E;
        if (linearLayout != null) {
            if (!o4Var.f856a.f1013e.h()) {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
        }
        o4Var.setVisibleHeight(vp0Var.U);
        o4Var.setHasTabs(!s8Var.d().isEmpty());
    }

    @Override
    public final boolean c(int i3) {
        if (i3 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i3) {
        if (i3 == -1) {
            return null;
        }
        int i10 = this.f942a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f943b;
        vp0 vp0Var = this.f944c;
        o4 o4Var = new o4(vp0Var, i10, e6Var);
        pi.q qVar = vp0Var.O;
        if (qVar != null) {
            qVar.b(o4Var.f860f);
        }
        return o4Var;
    }

    @Override
    public final int e() {
        return this.f944c.f1013e.d().size() + 1;
    }

    @Override
    public final int f(int i3) {
        if (i3 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f944c.f1013e.d().get(i3 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i3) {
        if (i3 == 0) {
            return bd.M0(2131750256, null);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f944c.f1013e.d().get(i3 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.p5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override
    public final int h(int i3) {
        if (i3 == 0) {
            return 0;
        }
        return 1;
    }
}
