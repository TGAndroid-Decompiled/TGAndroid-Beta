package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.a0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.f3;
import bi.v4;
import c8.ja;
import di.f4;
import di.z6;
import fi.c6;
import fi.r6;
import fi.s6;
import hi.d7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vp0;
public abstract class q extends FrameLayout implements z5, is {
    public static LongSparseArray F;
    public static LongSparseArray G;
    public int E;
    public final e2 f13352a;
    public final int f13353b;
    public final e6 f13354c;
    public final long d;
    public final c6 f13355e;
    public final ArrayList f13356f;
    public final ArrayList h;
    public final f3 f13357n;
    public final v61 f13358r;
    public Boolean f13359s;
    public int f13360w;
    public float f13361x;
    public ValueAnimator f13362y;

    public q(Context context, e2 e2Var, long j3) {
        super(context);
        this.f13356f = new ArrayList();
        this.h = new ArrayList();
        this.f13359s = null;
        this.f13360w = g0.f23611q.y;
        this.E = Utilities.j(gz.f23989u1, 6, 2);
        this.f13352a = e2Var;
        int currentAccount = e2Var.getCurrentAccount();
        this.f13353b = currentAccount;
        e6 resourceProvider = e2Var.getResourceProvider();
        this.f13354c = resourceProvider;
        this.d = j3;
        setBackgroundColor(j6.w(j6.w0(j6.f28849d6, resourceProvider), j6.r1(0.04f, j6.w0(j6.G6, resourceProvider))));
        if (G == null) {
            G = new LongSparseArray();
        }
        long j10 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) G.get(j10);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = G;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j10, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        c6 c6Var = (c6) longSparseArray.get(j3);
        if (c6Var == null) {
            c6 c6Var2 = new c6(currentAccount, j3, "", null);
            longSparseArray.put(j3, c6Var2);
            c6Var = c6Var2;
        }
        this.f13355e = c6Var;
        vp0 vp0Var = (vp0) this;
        f3 f3Var = new f3(vp0Var, context);
        this.f13357n = f3Var;
        f3Var.setAllowDisallowInterceptTouch(true);
        f3Var.setAdapter(new f4(1, context, vp0Var));
        addView(f3Var, ja.e(-1, -1, 119));
        v61 i7 = f3Var.i(9, true);
        this.f13358r = i7;
        i7.f40313r = 12;
        i7.setPreTabClick(new z6(vp0Var, 13));
        addView(i7, ja.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        e2 e2Var = this.f13352a;
        if (e2Var != null && e2Var.getParentActivity() != null) {
            ki kiVar = new ki(e2Var.getParentActivity(), this.f13352a, false, false, false, this.f13354c);
            kiVar.y1(1, false);
            kiVar.R2 = true;
            kiVar.Q2 = false;
            kiVar.f36445h3.setText(hd.M0(2131752121, null));
            kiVar.f36435e2.i0();
            kiVar.X3 = new a0(this, kiVar, str);
            kiVar.e1();
            kiVar.show();
        }
    }

    public final void b(String str) {
        c6 c6Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13355e.G.remove(str);
        this.h.remove(str);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f13356f;
            if (i7 < arrayList.size()) {
                c6Var = (c6) arrayList.get(i7);
                if (c6Var != null && TextUtils.equals(c6Var.E, str)) {
                    break;
                }
                i7++;
            } else {
                c6Var = null;
                break;
            }
        }
        if (c6Var != null) {
            ArrayList arrayList2 = c6Var.f11944i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.f13353b;
            deletepreviewmedia.bot = np.s1(i10).o1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((gj) arrayList2.get(i11)).f23824l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(np.a5(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.f13358r.d(-1, 0);
    }

    public abstract boolean c(gj gjVar);

    public final boolean d() {
        c6 c6Var;
        View currentView = this.f13357n.getCurrentView();
        if ((currentView instanceof m) && (c6Var = ((m) currentView).f13336a) != null) {
            ArrayList arrayList = c6Var.f11944i;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (!c((gj) arrayList.get(i7))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.f25606x5;
        f3 f3Var = this.f13357n;
        int i12 = 0;
        if (i7 == i11) {
            Object obj = objArr[0];
            c6 c6Var = this.f13355e;
            if (obj == c6Var) {
                i(true);
                View[] viewPages = f3Var.getViewPages();
                int length = viewPages.length;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view instanceof m) {
                        m mVar = (m) view;
                        if (mVar.f13336a == c6Var) {
                            mVar.f13345w.f();
                        }
                    }
                    i12++;
                }
            } else if (this.f13356f.indexOf(obj) >= 0) {
                View[] viewPages2 = f3Var.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof m) {
                        m mVar2 = (m) view2;
                        if (mVar2.f13336a == objArr[0]) {
                            mVar2.f13345w.f();
                        }
                    }
                }
            }
        } else if (i7 == ns.f25592v5) {
            i(true);
            View[] viewPages3 = f3Var.getViewPages();
            int length2 = viewPages3.length;
            while (i12 < length2) {
                View view3 = viewPages3[i12];
                if (view3 instanceof m) {
                    ((m) view3).f13345w.f();
                }
                i12++;
            }
        }
    }

    public abstract boolean e(gj gjVar);

    public final void f() {
        c6 c6Var;
        View currentView = this.f13357n.getCurrentView();
        if ((currentView instanceof m) && (c6Var = ((m) currentView).f13336a) != null) {
            ArrayList arrayList = c6Var.f11944i;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (!c((gj) arrayList.get(i7))) {
                    e((gj) arrayList.get(i7));
                }
            }
        }
    }

    public abstract boolean g(gj gjVar);

    public String getBotPreviewsSubtitle() {
        int i7;
        int i10;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.f13357n.getCurrentView();
        if (currentView instanceof m) {
            c6 c6Var = ((m) currentView).f13336a;
            if (c6Var != null) {
                ArrayList arrayList = c6Var.f11944i;
                i7 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    gj gjVar = (gj) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = gjVar.f23824l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (gj.K4(messageMedia.document)) {
                            i10++;
                        } else if (gjVar.f23824l.media.photo != null) {
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
        c6 c6Var;
        f3 f3Var = this.f13357n;
        View[] viewPages = f3Var.getViewPages();
        if (Math.abs(f3Var.getCurrentPosition() - f3Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof m) && (c6Var = ((m) view).f13336a) != null) {
            return c6Var.E;
        }
        return null;
    }

    public c6 getCurrentList() {
        c6 c6Var;
        View currentView = this.f13357n.getCurrentView();
        if ((currentView instanceof m) && (c6Var = ((m) currentView).f13336a) != null) {
            return c6Var;
        }
        return null;
    }

    public uj0 getCurrentListView() {
        View currentView = this.f13357n.getCurrentView();
        if (currentView instanceof m) {
            return ((m) currentView).f13341f;
        }
        return null;
    }

    public int getItemsCount() {
        c6 c6Var;
        View currentView = this.f13357n.getCurrentView();
        if ((currentView instanceof m) && (c6Var = ((m) currentView).f13336a) != null) {
            return c6Var.f11944i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        c6 c6Var;
        View currentView = this.f13357n.getCurrentView();
        if ((currentView instanceof m) && (c6Var = ((m) currentView).f13336a) != null) {
            ArrayList arrayList = c6Var.f11944i;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (c((gj) arrayList.get(i7))) {
                    g((gj) arrayList.get(i7));
                }
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        float f10;
        c6 c6Var;
        d7 d7Var;
        ArrayList arrayList = new ArrayList(this.f13355e.G);
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
        s6 P1 = np.s1(this.f13353b).P1();
        long j3 = this.d;
        ArrayList F2 = P1.F(j3);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                r6 r6Var = (r6) obj2;
                if (r6Var != null && (d7Var = r6Var.f12274c) != null && d7Var.J0 == j3 && !TextUtils.isEmpty(d7Var.K0) && !arrayList.contains(d7Var.K0)) {
                    arrayList.add(d7Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f13356f;
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
                    if (TextUtils.equals(((c6) arrayList4.get(i12)).E, str2)) {
                        c6Var = (c6) arrayList4.get(i12);
                        break;
                    }
                    i12++;
                } else {
                    c6Var = null;
                    break;
                }
            }
            if (c6Var == null) {
                c6 c6Var2 = new c6(this.f13353b, this.d, str2, null);
                c6Var2.H(null);
                c6Var = c6Var2;
            }
            arrayList3.add(c6Var);
        }
        f3 f3Var = this.f13357n;
        f3Var.k(true);
        SpannableString spannableString = new SpannableString(i5.c.k(2131746711, null, new StringBuilder("+ ")));
        eq eqVar = new eq(2131232151, 0);
        eqVar.I = 0.9f;
        eqVar.J = 0.9f;
        eqVar.H = 0.85f;
        spannableString.setSpan(eqVar, 0, 1, 33);
        v61 v61Var = this.f13358r;
        v61Var.a(-1, spannableString);
        v61Var.f40319y.f();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f13359s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f13362y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f13359s = Boolean.valueOf(z11);
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z10) {
            if (!z11) {
                f11 = 0.0f;
            }
            this.f13361x = f11;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = -42.0f;
            }
            v61Var.setTranslationY(g0.L(f10));
            if (z11) {
                f12 = 42.0f;
            }
            f3Var.setTranslationY(g0.L(f12));
            return;
        }
        float f13 = this.f13361x;
        if (!z11) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
        this.f13362y = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 25));
        this.f13362y.addListener(new v4(5, this, z11));
        this.f13362y.setDuration(320L);
        this.f13362y.setInterpolator(er.h);
        this.f13362y.start();
    }

    public final void j() {
        View currentView = this.f13357n.getCurrentView();
        if (currentView instanceof m) {
            m mVar = (m) currentView;
            e eVar = mVar.f13341f;
            for (int i7 = 0; i7 < eVar.getChildCount(); i7++) {
                View childAt = eVar.getChildAt(i7);
                if (childAt instanceof n7) {
                    n7 n7Var = (n7) childAt;
                    n7Var.i(mVar.f13337a0.c(n7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (F == null) {
            F = new LongSparseArray();
        }
        LongSparseArray longSparseArray = F;
        int i7 = this.f13353b;
        long j3 = i7;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j3);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = F;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j3, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        ns.f(i7).c(this, ns.f25606x5);
        ns.f(i7).c(this, ns.f25592v5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (F == null) {
            F = new LongSparseArray();
        }
        LongSparseArray longSparseArray = F;
        int i7 = this.f13353b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i7);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        ns.f(i7).n(this, ns.f25606x5);
        ns.f(i7).n(this, ns.f25592v5);
    }

    public void setVisibleHeight(int i7) {
        this.f13360w = i7;
        View[] viewPages = this.f13357n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof m) {
                    ((m) view).setVisibleHeight(i7);
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        e6 e6Var = this.f13354c;
        try {
            setBackgroundColor(j6.w(j6.w0(j6.f28849d6, e6Var), j6.r1(0.04f, j6.w0(j6.G6, e6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
