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
import di.j6;
import di.q4;
import di.x6;
import di.y6;
import fi.e7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public abstract class r extends FrameLayout implements a6, ls {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public int D;
    public final f2 f10844a;
    public final int f10845b;
    public final f6 f10846c;
    public final long d;
    public final j6 f10847e;
    public final ArrayList f10848f;
    public final ArrayList h;
    public final a f10849n;
    public final o61 f10850r;
    public Boolean f10851s;
    public int f10852w;
    public float f10853x;
    public ValueAnimator f10854y;

    public r(Context context, f2 f2Var, long j3) {
        super(context);
        this.f10848f = new ArrayList();
        this.h = new ArrayList();
        this.f10851s = null;
        this.f10852w = g0.f22537q.y;
        this.D = Utilities.j(iz.f23414u1, 6, 2);
        this.f10844a = f2Var;
        int currentAccount = f2Var.getCurrentAccount();
        this.f10845b = currentAccount;
        f6 resourceProvider = f2Var.getResourceProvider();
        this.f10846c = resourceProvider;
        this.d = j3;
        setBackgroundColor(k6.w(k6.w0(k6.f27848d6, resourceProvider), k6.r1(0.04f, k6.w0(k6.G6, resourceProvider))));
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
        j6 j6Var = (j6) longSparseArray.get(j3);
        if (j6Var == null) {
            j6 j6Var2 = new j6(currentAccount, j3, "", null);
            longSparseArray.put(j3, j6Var2);
            j6Var = j6Var2;
        }
        this.f10847e = j6Var;
        sp0 sp0Var = (sp0) this;
        a aVar = new a(sp0Var, context);
        this.f10849n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new g5(1, context, sp0Var));
        addView(aVar, ha.e(-1, -1, 119));
        o61 n10 = aVar.n(9, true);
        this.f10850r = n10;
        n10.f36662r = 12;
        n10.setPreTabClick(new q4(sp0Var, 6));
        addView(n10, ha.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        f2 f2Var = this.f10844a;
        if (f2Var != null && f2Var.getParentActivity() != null) {
            di diVar = new di(f2Var.getParentActivity(), this.f10844a, false, false, false, this.f10846c);
            diVar.y1(1, false);
            diVar.N2 = true;
            diVar.M2 = false;
            diVar.f32891d3.setText(hd.M0(2131752121, null));
            diVar.f32882a2.i0();
            diVar.T3 = new a0((FrameLayout) this, (Object) diVar, (Serializable) str, 21);
            diVar.e1();
            diVar.show();
        }
    }

    public final void b(String str) {
        j6 j6Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f10847e.G.remove(str);
        this.h.remove(str);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f10848f;
            if (i7 < arrayList.size()) {
                j6Var = (j6) arrayList.get(i7);
                if (j6Var != null && TextUtils.equals(j6Var.E, str)) {
                    break;
                }
                i7++;
            } else {
                j6Var = null;
                break;
            }
        }
        if (j6Var != null) {
            ArrayList arrayList2 = j6Var.f9643i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.f10845b;
            deletepreviewmedia.bot = qp.s1(i10).o1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((ij) arrayList2.get(i11)).f23241l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(qp.Z4(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.f10850r.d(-1, 0);
    }

    public abstract boolean c(ij ijVar);

    public final boolean d() {
        j6 j6Var;
        View currentView = this.f10849n.getCurrentView();
        if ((currentView instanceof n) && (j6Var = ((n) currentView).f10829a) != null) {
            ArrayList arrayList = j6Var.f9643i;
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
        int i11 = qs.f25092x5;
        a aVar = this.f10849n;
        int i12 = 0;
        if (i7 == i11) {
            Object obj = objArr[0];
            j6 j6Var = this.f10847e;
            if (obj == j6Var) {
                i(true);
                View[] viewPages = aVar.getViewPages();
                int length = viewPages.length;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view instanceof n) {
                        n nVar = (n) view;
                        if (nVar.f10829a == j6Var) {
                            nVar.f10837w.f();
                        }
                    }
                    i12++;
                }
            } else if (this.f10848f.indexOf(obj) >= 0) {
                View[] viewPages2 = aVar.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof n) {
                        n nVar2 = (n) view2;
                        if (nVar2.f10829a == objArr[0]) {
                            nVar2.f10837w.f();
                        }
                    }
                }
            }
        } else if (i7 == qs.f25078v5) {
            i(true);
            View[] viewPages3 = aVar.getViewPages();
            int length2 = viewPages3.length;
            while (i12 < length2) {
                View view3 = viewPages3[i12];
                if (view3 instanceof n) {
                    ((n) view3).f10837w.f();
                }
                i12++;
            }
        }
    }

    public abstract boolean e(ij ijVar);

    public final void f() {
        j6 j6Var;
        View currentView = this.f10849n.getCurrentView();
        if ((currentView instanceof n) && (j6Var = ((n) currentView).f10829a) != null) {
            ArrayList arrayList = j6Var.f9643i;
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
        View currentView = this.f10849n.getCurrentView();
        if (currentView instanceof n) {
            j6 j6Var = ((n) currentView).f10829a;
            if (j6Var != null) {
                ArrayList arrayList = j6Var.f9643i;
                i7 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ij ijVar = (ij) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = ijVar.f23241l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (ij.L4(messageMedia.document)) {
                            i10++;
                        } else if (ijVar.f23241l.media.photo != null) {
                            i7++;
                        }
                    }
                }
            } else {
                i7 = 0;
                i10 = 0;
            }
            if (i7 == 0 && i10 == 0) {
                return hd.M0(2131753014, null);
            }
            if (i7 > 0) {
                sb2.append(hd.G(i7, "Images", new Object[0]));
            }
            if (i10 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(hd.G(i10, "Videos", new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        j6 j6Var;
        a aVar = this.f10849n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof n) && (j6Var = ((n) view).f10829a) != null) {
            return j6Var.E;
        }
        return null;
    }

    public j6 getCurrentList() {
        j6 j6Var;
        View currentView = this.f10849n.getCurrentView();
        if ((currentView instanceof n) && (j6Var = ((n) currentView).f10829a) != null) {
            return j6Var;
        }
        return null;
    }

    public pj0 getCurrentListView() {
        View currentView = this.f10849n.getCurrentView();
        if (currentView instanceof n) {
            return ((n) currentView).f10833f;
        }
        return null;
    }

    public int getItemsCount() {
        j6 j6Var;
        View currentView = this.f10849n.getCurrentView();
        if ((currentView instanceof n) && (j6Var = ((n) currentView).f10829a) != null) {
            return j6Var.f9643i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        j6 j6Var;
        View currentView = this.f10849n.getCurrentView();
        if ((currentView instanceof n) && (j6Var = ((n) currentView).f10829a) != null) {
            ArrayList arrayList = j6Var.f9643i;
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
        j6 j6Var;
        e7 e7Var;
        ArrayList arrayList = new ArrayList(this.f10847e.G);
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
        y6 P1 = qp.s1(this.f10845b).P1();
        long j3 = this.d;
        ArrayList F2 = P1.F(j3);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                x6 x6Var = (x6) obj2;
                if (x6Var != null && (e7Var = x6Var.f9930c) != null && e7Var.J0 == j3 && !TextUtils.isEmpty(e7Var.K0) && !arrayList.contains(e7Var.K0)) {
                    arrayList.add(e7Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f10848f;
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
                    if (TextUtils.equals(((j6) arrayList4.get(i12)).E, str2)) {
                        j6Var = (j6) arrayList4.get(i12);
                        break;
                    }
                    i12++;
                } else {
                    j6Var = null;
                    break;
                }
            }
            if (j6Var == null) {
                j6 j6Var2 = new j6(this.f10845b, this.d, str2, null);
                j6Var2.H(null);
                j6Var = j6Var2;
            }
            arrayList3.add(j6Var);
        }
        a aVar = this.f10849n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(jg.g.l(2131746710, null, new StringBuilder("+ ")));
        wp wpVar = new wp(2131232150, 0);
        wpVar.H = 0.9f;
        wpVar.I = 0.9f;
        wpVar.G = 0.85f;
        spannableString.setSpan(wpVar, 0, 1, 33);
        o61 o61Var = this.f10850r;
        o61Var.a(-1, spannableString);
        o61Var.f36667y.f();
        if (arrayList3.size() + 1 > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f10851s;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        ValueAnimator valueAnimator = this.f10854y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f10851s = Boolean.valueOf(z10);
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z9) {
            if (!z10) {
                f11 = 0.0f;
            }
            this.f10853x = f11;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -42.0f;
            }
            o61Var.setTranslationY(g0.L(f10));
            if (z10) {
                f12 = 42.0f;
            }
            aVar.setTranslationY(g0.L(f12));
            return;
        }
        float f13 = this.f10853x;
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
        this.f10854y = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 24));
        this.f10854y.addListener(new y(4, this, z10));
        this.f10854y.setDuration(320L);
        this.f10854y.setInterpolator(xq.h);
        this.f10854y.start();
    }

    public final void j() {
        View currentView = this.f10849n.getCurrentView();
        if (currentView instanceof n) {
            n nVar = (n) currentView;
            f fVar = nVar.f10833f;
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
        int i7 = this.f10845b;
        long j3 = i7;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j3);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = E;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j3, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        qs.f(i7).c(this, qs.f25092x5);
        qs.f(i7).c(this, qs.f25078v5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i7 = this.f10845b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i7);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        qs.f(i7).n(this, qs.f25092x5);
        qs.f(i7).n(this, qs.f25078v5);
    }

    public void setVisibleHeight(int i7) {
        this.f10852w = i7;
        View[] viewPages = this.f10849n.getViewPages();
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
        f6 f6Var = this.f10846c;
        try {
            setBackgroundColor(k6.w(k6.w0(k6.f27848d6, f6Var), k6.r1(0.04f, k6.w0(k6.G6, f6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
