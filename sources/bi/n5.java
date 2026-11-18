package bi;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.y61;
public final class n5 extends y61 {
    public final int f3880a;
    public final org.telegram.ui.ActionBar.i6 f3881b;
    public final eq0 f3882c;

    public n5(eq0 eq0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f3882c = eq0Var;
        this.f3880a = i7;
        this.f3881b = i6Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        eq0 eq0Var = this.f3882c;
        b5 b5Var = eq0Var.R;
        di.m8 m8Var = eq0Var.f3944e;
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
        m8Var.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = m8Var.f9322e;
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
        m8Var.j();
        j6 currentPage = eq0Var.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i7 = m8Var.f(currentPage.f3759e.d) + 1;
            }
            eq0Var.f3946n.f(0.0f, i7, i7);
        }
        org.telegram.messenger.g0.r(b5Var);
        org.telegram.messenger.g0.h3(b5Var, 1000L);
    }

    @Override
    public final void b(View view, int i7, int i10) {
        di.o8 o8Var;
        boolean z10;
        eq0 eq0Var = this.f3882c;
        di.m8 m8Var = eq0Var.f3944e;
        j6 j6Var = (j6) view;
        int i11 = 0;
        if (i10 == 0) {
            o8Var = eq0Var.d;
            z10 = false;
        } else {
            int i12 = i7 - 1;
            if (i12 >= 0) {
                if (i12 < m8Var.d().size()) {
                    o8Var = m8Var.e(((TL_stars.TL_starGiftCollection) m8Var.d().get(i12)).collection_id);
                    z10 = true;
                }
            } else {
                m8Var.getClass();
            }
            o8Var = null;
            z10 = true;
        }
        j6Var.d = z10;
        j6Var.f3759e = o8Var;
        if (o8Var != null) {
            o8Var.a();
        }
        j6Var.f(false);
        LinearLayout linearLayout = j6Var.E;
        if (linearLayout != null) {
            if (!j6Var.f3756a.f3944e.h()) {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
        }
        j6Var.setVisibleHeight(eq0Var.U);
        j6Var.setHasTabs(!m8Var.d().isEmpty());
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
        int i10 = this.f3880a;
        org.telegram.ui.ActionBar.i6 i6Var = this.f3881b;
        eq0 eq0Var = this.f3882c;
        j6 j6Var = new j6(eq0Var, i10, i6Var);
        ri.q qVar = eq0Var.O;
        if (qVar != null) {
            qVar.b(j6Var.f3760f);
        }
        return j6Var;
    }

    @Override
    public final int e() {
        return this.f3882c.f3944e.d().size() + 1;
    }

    @Override
    public final int f(int i7) {
        if (i7 == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.f3882c.f3944e.d().get(i7 - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i7) {
        if (i7 == 0) {
            return gd.M0(2131750232, null);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f3882c.f3944e.d().get(i7 - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x5(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
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
