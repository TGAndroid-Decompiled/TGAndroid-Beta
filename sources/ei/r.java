package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.a0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.g5;
import c8.ha;
import ch.y;
import di.k6;
import di.r4;
import di.y6;
import di.z6;
import fi.e7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
public abstract class r extends FrameLayout implements c6, ls {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public int D;
    public final f2 f10849a;
    public final int f10850b;
    public final h6 f10851c;
    public final long d;
    public final k6 f10852e;
    public final ArrayList f10853f;
    public final ArrayList h;
    public final a f10854n;
    public final u61 f10855r;
    public Boolean f10856s;
    public int f10857w;
    public float f10858x;
    public ValueAnimator f10859y;

    public r(Context context, f2 f2Var, long j3) {
        super(context);
        this.f10853f = new ArrayList();
        this.h = new ArrayList();
        this.f10856s = null;
        this.f10857w = g0.f22567q.y;
        this.D = Utilities.j(iz.f23446u1, 6, 2);
        this.f10849a = f2Var;
        int currentAccount = f2Var.getCurrentAccount();
        this.f10850b = currentAccount;
        h6 resourceProvider = f2Var.getResourceProvider();
        this.f10851c = resourceProvider;
        this.d = j3;
        setBackgroundColor(m6.w(m6.w0(m6.f27890d6, resourceProvider), m6.r1(0.04f, m6.w0(m6.G6, resourceProvider))));
        if (F == null) {
            F = new LongSparseArray();
        }
        long j10 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) F.get(j10);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = F;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j10, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        k6 k6Var = (k6) longSparseArray.get(j3);
        if (k6Var == null) {
            k6 k6Var2 = new k6(currentAccount, j3, "", null);
            longSparseArray.put(j3, k6Var2);
            k6Var = k6Var2;
        }
        this.f10852e = k6Var;
        sp0 sp0Var = (sp0) this;
        a aVar = new a(sp0Var, context);
        this.f10854n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new g5(1, context, sp0Var));
        addView(aVar, ha.e(-1, -1, 119));
        u61 n10 = aVar.n(9, true);
        this.f10855r = n10;
        n10.f38578r = 12;
        n10.setPreTabClick(new r4(sp0Var, 6));
        addView(n10, ha.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        f2 f2Var = this.f10849a;
        if (f2Var != null && f2Var.getParentActivity() != null) {
            ci ciVar = new ci(f2Var.getParentActivity(), this.f10849a, false, false, false, this.f10851c);
            ciVar.y1(1, false);
            ciVar.Q2 = true;
            ciVar.P2 = false;
            ciVar.f32609g3.setText(id.M0(2131752121, null));
            ciVar.d2.i0();
            ciVar.W3 = new a0((FrameLayout) this, (Object) ciVar, (Serializable) str, 21);
            ciVar.e1();
            ciVar.show();
        }
    }

    public final void b(String str) {
        k6 k6Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f10852e.G.remove(str);
        this.h.remove(str);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f10853f;
            if (i7 < arrayList.size()) {
                k6Var = (k6) arrayList.get(i7);
                if (k6Var != null && TextUtils.equals(k6Var.E, str)) {
                    break;
                }
                i7++;
            } else {
                k6Var = null;
                break;
            }
        }
        if (k6Var != null) {
            ArrayList arrayList2 = k6Var.f9699i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.f10850b;
            deletepreviewmedia.bot = qp.s1(i10).o1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((ij) arrayList2.get(i11)).f23270l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(qp.Z4(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.f10855r.d(-1, 0);
    }

    public abstract boolean c(ij ijVar);

    public final boolean d() {
        k6 k6Var;
        View currentView = this.f10854n.getCurrentView();
        if ((currentView instanceof n) && (k6Var = ((n) currentView).f10834a) != null) {
            ArrayList arrayList = k6Var.f9699i;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (!c((ij) arrayList.get(i7))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.f25113x5;
        a aVar = this.f10854n;
        int i12 = 0;
        if (i7 == i11) {
            Object obj = objArr[0];
            k6 k6Var = this.f10852e;
            if (obj == k6Var) {
                i(true);
                View[] viewPages = aVar.getViewPages();
                int length = viewPages.length;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view instanceof n) {
                        n nVar = (n) view;
                        if (nVar.f10834a == k6Var) {
                            nVar.f10842w.f();
                        }
                    }
                    i12++;
                }
            } else if (this.f10853f.indexOf(obj) >= 0) {
                View[] viewPages2 = aVar.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof n) {
                        n nVar2 = (n) view2;
                        if (nVar2.f10834a == objArr[0]) {
                            nVar2.f10842w.f();
                        }
                    }
                }
            }
        } else if (i7 == qs.f25099v5) {
            i(true);
            View[] viewPages3 = aVar.getViewPages();
            int length2 = viewPages3.length;
            while (i12 < length2) {
                View view3 = viewPages3[i12];
                if (view3 instanceof n) {
                    ((n) view3).f10842w.f();
                }
                i12++;
            }
        }
    }

    public abstract boolean e(ij ijVar);

    public final void f() {
        k6 k6Var;
        View currentView = this.f10854n.getCurrentView();
        if ((currentView instanceof n) && (k6Var = ((n) currentView).f10834a) != null) {
            ArrayList arrayList = k6Var.f9699i;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (!c((ij) arrayList.get(i7))) {
                    e((ij) arrayList.get(i7));
                }
            }
        }
    }

    public abstract boolean g(ij ijVar);

    public String getBotPreviewsSubtitle() {
        int i7;
        int i10;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.f10854n.getCurrentView();
        if (currentView instanceof n) {
            k6 k6Var = ((n) currentView).f10834a;
            if (k6Var != null) {
                ArrayList arrayList = k6Var.f9699i;
                i7 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ij ijVar = (ij) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = ijVar.f23270l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (ij.K4(messageMedia.document)) {
                            i10++;
                        } else if (ijVar.f23270l.media.photo != null) {
                            i7++;
                        }
                    }
                }
            } else {
                i7 = 0;
                i10 = 0;
            }
            if (i7 == 0 && i10 == 0) {
                return id.M0(2131753014, null);
            }
            if (i7 > 0) {
                sb2.append(id.G(i7, "Images", new Object[0]));
            }
            if (i10 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(id.G(i10, "Videos", new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        k6 k6Var;
        a aVar = this.f10854n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof n) && (k6Var = ((n) view).f10834a) != null) {
            return k6Var.E;
        }
        return null;
    }

    public k6 getCurrentList() {
        k6 k6Var;
        View currentView = this.f10854n.getCurrentView();
        if ((currentView instanceof n) && (k6Var = ((n) currentView).f10834a) != null) {
            return k6Var;
        }
        return null;
    }

    public pj0 getCurrentListView() {
        View currentView = this.f10854n.getCurrentView();
        if (currentView instanceof n) {
            return ((n) currentView).f10838f;
        }
        return null;
    }

    public int getItemsCount() {
        k6 k6Var;
        View currentView = this.f10854n.getCurrentView();
        if ((currentView instanceof n) && (k6Var = ((n) currentView).f10834a) != null) {
            return k6Var.f9699i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        k6 k6Var;
        View currentView = this.f10854n.getCurrentView();
        if ((currentView instanceof n) && (k6Var = ((n) currentView).f10834a) != null) {
            ArrayList arrayList = k6Var.f9699i;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (c((ij) arrayList.get(i7))) {
                    g((ij) arrayList.get(i7));
                }
            }
        }
    }

    public final void i(boolean z9) {
        boolean z10;
        float f10;
        k6 k6Var;
        e7 e7Var;
        ArrayList arrayList = new ArrayList(this.f10852e.G);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        z6 P1 = qp.s1(this.f10850b).P1();
        long j3 = this.d;
        ArrayList F2 = P1.F(j3);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                y6 y6Var = (y6) obj2;
                if (y6Var != null && (e7Var = y6Var.f9965c) != null && e7Var.J0 == j3 && !TextUtils.isEmpty(e7Var.K0) && !arrayList.contains(e7Var.K0)) {
                    arrayList.add(e7Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f10853f;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int size3 = arrayList.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            String str2 = (String) obj3;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList4.size()) {
                    if (TextUtils.equals(((k6) arrayList4.get(i12)).E, str2)) {
                        k6Var = (k6) arrayList4.get(i12);
                        break;
                    }
                    i12++;
                } else {
                    k6Var = null;
                    break;
                }
            }
            if (k6Var == null) {
                k6 k6Var2 = new k6(this.f10850b, this.d, str2, null);
                k6Var2.H(null);
                k6Var = k6Var2;
            }
            arrayList3.add(k6Var);
        }
        a aVar = this.f10854n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(jg.g.l(2131746711, null, new StringBuilder("+ ")));
        wp wpVar = new wp(2131232150, 0);
        wpVar.H = 0.9f;
        wpVar.I = 0.9f;
        wpVar.G = 0.85f;
        spannableString.setSpan(wpVar, 0, 1, 33);
        u61 u61Var = this.f10855r;
        u61Var.a(-1, spannableString);
        u61Var.f38583y.f();
        if (arrayList3.size() + 1 > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f10856s;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f10859y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f10856s = Boolean.valueOf(z10);
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z9) {
            if (!z10) {
                f11 = 0.0f;
            }
            this.f10858x = f11;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -42.0f;
            }
            u61Var.setTranslationY(g0.L(f10));
            if (z10) {
                f12 = 42.0f;
            }
            aVar.setTranslationY(g0.L(f12));
            return;
        }
        float f13 = this.f10858x;
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
        this.f10859y = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 24));
        this.f10859y.addListener(new y(4, this, z10));
        this.f10859y.setDuration(320L);
        this.f10859y.setInterpolator(wq.h);
        this.f10859y.start();
    }

    public final void j() {
        View currentView = this.f10854n.getCurrentView();
        if (currentView instanceof n) {
            n nVar = (n) currentView;
            f fVar = nVar.f10838f;
            for (int i7 = 0; i7 < fVar.getChildCount(); i7++) {
                View childAt = fVar.getChildAt(i7);
                if (childAt instanceof o7) {
                    o7 o7Var = (o7) childAt;
                    o7Var.i(nVar.W.c(o7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i7 = this.f10850b;
        long j3 = i7;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j3);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = E;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j3, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        qs.f(i7).c(this, qs.f25113x5);
        qs.f(i7).c(this, qs.f25099v5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i7 = this.f10850b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i7);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        qs.f(i7).n(this, qs.f25113x5);
        qs.f(i7).n(this, qs.f25099v5);
    }

    public void setVisibleHeight(int i7) {
        this.f10857w = i7;
        View[] viewPages = this.f10854n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof n) {
                    ((n) view).setVisibleHeight(i7);
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        h6 h6Var = this.f10851c;
        try {
            setBackgroundColor(m6.w(m6.w0(m6.f27890d6, h6Var), m6.r1(0.04f, m6.w0(m6.G6, h6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
