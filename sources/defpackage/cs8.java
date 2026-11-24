package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
public final class cs8 extends ogc {
    public final int a;
    public final ylb b;
    public final lea c;

    public cs8(lea leaVar, int i, ylb ylbVar) {
        this.c = leaVar;
        this.a = i;
        this.b = ylbVar;
    }

    @Override
    public final void a(ArrayList arrayList) {
        lea leaVar = this.c;
        ur8 ur8Var = leaVar.R;
        yua yuaVar = leaVar.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            if (intValue != -1 && intValue != -2) {
                arrayList2.add(num);
            }
        }
        yuaVar.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList3 = yuaVar.e;
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
            hashMap.put(Integer.valueOf(tL_starGiftCollection.collection_id), tL_starGiftCollection);
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            Integer num2 = (Integer) obj3;
            num2.getClass();
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) hashMap.get(num2);
            if (tL_starGiftCollection2 != null) {
                arrayList4.add(tL_starGiftCollection2);
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        yuaVar.j();
        rs8 currentPage = leaVar.getCurrentPage();
        if (currentPage != null) {
            if (currentPage.d) {
                i = yuaVar.f(currentPage.e.d) + 1;
            }
            leaVar.n.f(0.0f, i, i);
        }
        gm.r(ur8Var);
        gm.d3(ur8Var, 1000L);
    }

    @Override
    public final void b(View view, int i, int i2) {
        ava avaVar;
        boolean z;
        rs8 rs8Var = (rs8) view;
        lea leaVar = this.c;
        yua yuaVar = leaVar.e;
        int i3 = 0;
        if (i2 == 0) {
            avaVar = leaVar.d;
            z = false;
        } else {
            int i4 = i - 1;
            if (i4 >= 0) {
                if (i4 < yuaVar.d().size()) {
                    avaVar = yuaVar.e(((TL_stars.TL_starGiftCollection) yuaVar.d().get(i4)).collection_id);
                    z = true;
                }
            } else {
                yuaVar.getClass();
            }
            avaVar = null;
            z = true;
        }
        rs8Var.d = z;
        rs8Var.e = avaVar;
        if (avaVar != null) {
            avaVar.a();
        }
        rs8Var.f(false);
        LinearLayout linearLayout = rs8Var.E;
        if (linearLayout != null) {
            if (!rs8Var.a.e.h()) {
                i3 = 8;
            }
            linearLayout.setVisibility(i3);
        }
        rs8Var.setVisibleHeight(leaVar.U);
        rs8Var.setHasTabs(!yuaVar.d().isEmpty());
    }

    @Override
    public final boolean c(int i) {
        if (i == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final View d(int i) {
        if (i == -1) {
            return null;
        }
        int i2 = this.a;
        ylb ylbVar = this.b;
        lea leaVar = this.c;
        rs8 rs8Var = new rs8(leaVar, i2, ylbVar);
        sy4 sy4Var = leaVar.O;
        if (sy4Var != null) {
            sy4Var.b(rs8Var.f);
        }
        return rs8Var;
    }

    @Override
    public final int e() {
        return this.c.e.d().size() + 1;
    }

    @Override
    public final int f(int i) {
        if (i == 0) {
            return -2;
        }
        return ((TL_stars.TL_starGiftCollection) this.c.e.d().get(i - 1)).collection_id;
    }

    @Override
    public final CharSequence g(int i) {
        if (i == 0) {
            return jb6.M0(2131750181, null);
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c.e.d().get(i - 1);
        if (tL_starGiftCollection == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_starGiftCollection.title);
        if (tL_starGiftCollection.icon != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(gm.L(16.0f));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("e ");
            spannableStringBuilder2.setSpan(new gn(tL_starGiftCollection.icon, textPaint.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder.insert(0, (CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    @Override
    public final int h(int i) {
        if (i == 0) {
            return 0;
        }
        return 1;
    }
}
