package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.a0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.g7;
import bi.p5;
import c8.ma;
import di.i4;
import di.v6;
import fi.a6;
import fi.o6;
import fi.p6;
import hi.c7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.cz;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ui;
public abstract class q extends FrameLayout implements b6, gs {
    public static LongSparseArray F;
    public static LongSparseArray G;
    public int E;
    public final g2 f13696a;
    public final int f13697b;
    public final h6 f13698c;
    public final long d;
    public final a6 f13699e;
    public final ArrayList f13700f;
    public final ArrayList h;
    public final p5 f13701n;
    public final i71 f13702r;
    public Boolean f13703s;
    public int f13704w;
    public float f13705x;
    public ValueAnimator f13706y;

    public q(Context context, g2 g2Var, long j3) {
        super(context);
        this.f13700f = new ArrayList();
        this.h = new ArrayList();
        this.f13703s = null;
        this.f13704w = g0.f24046q.y;
        this.E = Utilities.j(cz.f23447u1, 6, 2);
        this.f13696a = g2Var;
        int currentAccount = g2Var.getCurrentAccount();
        this.f13697b = currentAccount;
        h6 resourceProvider = g2Var.getResourceProvider();
        this.f13698c = resourceProvider;
        this.d = j3;
        setBackgroundColor(m6.w(m6.w0(m6.f29381d6, resourceProvider), m6.r1(0.04f, m6.w0(m6.G6, resourceProvider))));
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
        a6 a6Var = (a6) longSparseArray.get(j3);
        if (a6Var == null) {
            a6 a6Var2 = new a6(currentAccount, j3, "", null);
            longSparseArray.put(j3, a6Var2);
            a6Var = a6Var2;
        }
        this.f13699e = a6Var;
        fq0 fq0Var = (fq0) this;
        p5 p5Var = new p5(fq0Var, context);
        this.f13701n = p5Var;
        p5Var.setAllowDisallowInterceptTouch(true);
        p5Var.setAdapter(new i4(1, context, fq0Var));
        addView(p5Var, ma.e(-1, -1, 119));
        i71 i7 = p5Var.i(9, true);
        this.f13702r = i7;
        i7.f36216r = 12;
        i7.setPreTabClick(new v6(fq0Var, 14));
        addView(i7, ma.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        g2 g2Var = this.f13696a;
        if (g2Var != null && g2Var.getParentActivity() != null) {
            ui uiVar = new ui(g2Var.getParentActivity(), this.f13696a, false, false, false, this.f13698c);
            uiVar.z1(1, false);
            uiVar.R2 = true;
            uiVar.Q2 = false;
            uiVar.f40389h3.setText(hd.N0(2131752109, null));
            uiVar.f40379e2.i0();
            uiVar.X3 = new a0(this, uiVar, str);
            uiVar.f1();
            uiVar.show();
        }
    }

    public final void b(String str) {
        a6 a6Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13699e.G.remove(str);
        this.h.remove(str);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f13700f;
            if (i7 < arrayList.size()) {
                a6Var = (a6) arrayList.get(i7);
                if (a6Var != null && TextUtils.equals(a6Var.E, str)) {
                    break;
                }
                i7++;
            } else {
                a6Var = null;
                break;
            }
        }
        if (a6Var != null) {
            ArrayList arrayList2 = a6Var.f12089i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.f13697b;
            deletepreviewmedia.bot = np.u1(i10).q1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((gj) arrayList2.get(i11)).f24218l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(np.l5(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.f13702r.e(-1, 0);
    }

    public abstract boolean c(gj gjVar);

    public final boolean d() {
        a6 a6Var;
        View currentView = this.f13701n.getCurrentView();
        if ((currentView instanceof m) && (a6Var = ((m) currentView).f13680a) != null) {
            ArrayList arrayList = a6Var.f12089i;
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
        int i11 = ls.A5;
        p5 p5Var = this.f13701n;
        int i12 = 0;
        if (i7 == i11) {
            Object obj = objArr[0];
            a6 a6Var = this.f13699e;
            if (obj == a6Var) {
                i(true);
                View[] viewPages = p5Var.getViewPages();
                int length = viewPages.length;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view instanceof m) {
                        m mVar = (m) view;
                        if (mVar.f13680a == a6Var) {
                            mVar.f13689w.f();
                        }
                    }
                    i12++;
                }
            } else if (this.f13700f.indexOf(obj) >= 0) {
                View[] viewPages2 = p5Var.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof m) {
                        m mVar2 = (m) view2;
                        if (mVar2.f13680a == objArr[0]) {
                            mVar2.f13689w.f();
                        }
                    }
                }
            }
        } else if (i7 == ls.f25424y5) {
            i(true);
            View[] viewPages3 = p5Var.getViewPages();
            int length2 = viewPages3.length;
            while (i12 < length2) {
                View view3 = viewPages3[i12];
                if (view3 instanceof m) {
                    ((m) view3).f13689w.f();
                }
                i12++;
            }
        }
    }

    public abstract boolean e(gj gjVar);

    public final void f() {
        a6 a6Var;
        View currentView = this.f13701n.getCurrentView();
        if ((currentView instanceof m) && (a6Var = ((m) currentView).f13680a) != null) {
            ArrayList arrayList = a6Var.f12089i;
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
        View currentView = this.f13701n.getCurrentView();
        if (currentView instanceof m) {
            a6 a6Var = ((m) currentView).f13680a;
            if (a6Var != null) {
                ArrayList arrayList = a6Var.f12089i;
                i7 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    gj gjVar = (gj) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = gjVar.f24218l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (gj.K4(messageMedia.document)) {
                            i10++;
                        } else if (gjVar.f24218l.media.photo != null) {
                            i7++;
                        }
                    }
                }
            } else {
                i7 = 0;
                i10 = 0;
            }
            if (i7 == 0 && i10 == 0) {
                return hd.N0(2131753002, null);
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
        a6 a6Var;
        p5 p5Var = this.f13701n;
        View[] viewPages = p5Var.getViewPages();
        if (Math.abs(p5Var.getCurrentPosition() - p5Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof m) && (a6Var = ((m) view).f13680a) != null) {
            return a6Var.E;
        }
        return null;
    }

    public a6 getCurrentList() {
        a6 a6Var;
        View currentView = this.f13701n.getCurrentView();
        if ((currentView instanceof m) && (a6Var = ((m) currentView).f13680a) != null) {
            return a6Var;
        }
        return null;
    }

    public ek0 getCurrentListView() {
        View currentView = this.f13701n.getCurrentView();
        if (currentView instanceof m) {
            return ((m) currentView).f13685f;
        }
        return null;
    }

    public int getItemsCount() {
        a6 a6Var;
        View currentView = this.f13701n.getCurrentView();
        if ((currentView instanceof m) && (a6Var = ((m) currentView).f13680a) != null) {
            return a6Var.f12089i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        a6 a6Var;
        View currentView = this.f13701n.getCurrentView();
        if ((currentView instanceof m) && (a6Var = ((m) currentView).f13680a) != null) {
            ArrayList arrayList = a6Var.f12089i;
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
        a6 a6Var;
        c7 c7Var;
        ArrayList arrayList = new ArrayList(this.f13699e.G);
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
        p6 R1 = np.u1(this.f13697b).R1();
        long j3 = this.d;
        ArrayList F2 = R1.F(j3);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                o6 o6Var = (o6) obj2;
                if (o6Var != null && (c7Var = o6Var.f12375c) != null && c7Var.J0 == j3 && !TextUtils.isEmpty(c7Var.K0) && !arrayList.contains(c7Var.K0)) {
                    arrayList.add(c7Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f13700f;
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
                    if (TextUtils.equals(((a6) arrayList4.get(i12)).E, str2)) {
                        a6Var = (a6) arrayList4.get(i12);
                        break;
                    }
                    i12++;
                } else {
                    a6Var = null;
                    break;
                }
            }
            if (a6Var == null) {
                a6 a6Var2 = new a6(this.f13697b, this.d, str2, null);
                a6Var2.H(null);
                a6Var = a6Var2;
            }
            arrayList3.add(a6Var);
        }
        p5 p5Var = this.f13701n;
        p5Var.j(true);
        SpannableString spannableString = new SpannableString(i5.c.k(2131746515, null, new StringBuilder("+ ")));
        nq nqVar = new nq(2131232152, 0);
        nqVar.I = 0.9f;
        nqVar.J = 0.9f;
        nqVar.H = 0.85f;
        spannableString.setSpan(nqVar, 0, 1, 33);
        i71 i71Var = this.f13702r;
        i71Var.a(-1, spannableString);
        i71Var.f36222y.f();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f13703s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f13706y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f13703s = Boolean.valueOf(z11);
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z10) {
            if (!z11) {
                f11 = 0.0f;
            }
            this.f13705x = f11;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = -42.0f;
            }
            i71Var.setTranslationY(g0.L(f10));
            if (z11) {
                f12 = 42.0f;
            }
            p5Var.setTranslationY(g0.L(f12));
            return;
        }
        float f13 = this.f13705x;
        if (!z11) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
        this.f13706y = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 25));
        this.f13706y.addListener(new g7(5, this, z11));
        this.f13706y.setDuration(320L);
        this.f13706y.setInterpolator(nr.h);
        this.f13706y.start();
    }

    public final void j() {
        View currentView = this.f13701n.getCurrentView();
        if (currentView instanceof m) {
            m mVar = (m) currentView;
            e eVar = mVar.f13685f;
            for (int i7 = 0; i7 < eVar.getChildCount(); i7++) {
                View childAt = eVar.getChildAt(i7);
                if (childAt instanceof p7) {
                    p7 p7Var = (p7) childAt;
                    p7Var.i(mVar.f13681a0.c(p7Var.getMessageObject()), true);
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
        int i7 = this.f13697b;
        long j3 = i7;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j3);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = F;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j3, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        ls.f(i7).c(this, ls.A5);
        ls.f(i7).c(this, ls.f25424y5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (F == null) {
            F = new LongSparseArray();
        }
        LongSparseArray longSparseArray = F;
        int i7 = this.f13697b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i7);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        ls.f(i7).n(this, ls.A5);
        ls.f(i7).n(this, ls.f25424y5);
    }

    public void setVisibleHeight(int i7) {
        this.f13704w = i7;
        View[] viewPages = this.f13701n.getViewPages();
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
        h6 h6Var = this.f13698c;
        try {
            setBackgroundColor(m6.w(m6.w0(m6.f29381d6, h6Var), m6.r1(0.04f, m6.w0(m6.G6, h6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
