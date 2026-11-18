package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.a0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.m5;
import c8.ma;
import di.c7;
import di.i4;
import fi.o6;
import fi.p6;
import fi.z5;
import hi.d7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.si;
public abstract class q extends FrameLayout implements c6, fs {
    public static LongSparseArray F;
    public static LongSparseArray G;
    public int E;
    public final h2 f13664a;
    public final int f13665b;
    public final i6 f13666c;
    public final long d;
    public final z5 f13667e;
    public final ArrayList f13668f;
    public final ArrayList h;
    public final m5 f13669n;
    public final f71 f13670r;
    public Boolean f13671s;
    public int f13672w;
    public float f13673x;
    public ValueAnimator f13674y;

    public q(Context context, h2 h2Var, long j3) {
        super(context);
        this.f13668f = new ArrayList();
        this.h = new ArrayList();
        this.f13671s = null;
        this.f13672w = g0.f24118q.y;
        this.E = Utilities.j(bz.f23202u1, 6, 2);
        this.f13664a = h2Var;
        int currentAccount = h2Var.getCurrentAccount();
        this.f13665b = currentAccount;
        i6 resourceProvider = h2Var.getResourceProvider();
        this.f13666c = resourceProvider;
        this.d = j3;
        setBackgroundColor(n6.w(n6.w0(n6.f29394d6, resourceProvider), n6.r1(0.04f, n6.w0(n6.G6, resourceProvider))));
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
        z5 z5Var = (z5) longSparseArray.get(j3);
        if (z5Var == null) {
            z5 z5Var2 = new z5(currentAccount, j3, "", null);
            longSparseArray.put(j3, z5Var2);
            z5Var = z5Var2;
        }
        this.f13667e = z5Var;
        dq0 dq0Var = (dq0) this;
        m5 m5Var = new m5(dq0Var, context);
        this.f13669n = m5Var;
        m5Var.setAllowDisallowInterceptTouch(true);
        m5Var.setAdapter(new i4(1, context, dq0Var));
        addView(m5Var, ma.e(-1, -1, 119));
        f71 i7 = m5Var.i(9, true);
        this.f13670r = i7;
        i7.f35012r = 12;
        i7.setPreTabClick(new c7(dq0Var, 13));
        addView(i7, ma.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        h2 h2Var = this.f13664a;
        if (h2Var != null && h2Var.getParentActivity() != null) {
            si siVar = new si(h2Var.getParentActivity(), this.f13664a, false, false, false, this.f13666c);
            siVar.z1(1, false);
            siVar.R2 = true;
            siVar.Q2 = false;
            siVar.f39680h3.setText(gd.M0(2131752110, null));
            siVar.f39670e2.i0();
            siVar.X3 = new a0(this, siVar, str);
            siVar.f1();
            siVar.show();
        }
    }

    public final void b(String str) {
        z5 z5Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13667e.G.remove(str);
        this.h.remove(str);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f13668f;
            if (i7 < arrayList.size()) {
                z5Var = (z5) arrayList.get(i7);
                if (z5Var != null && TextUtils.equals(z5Var.E, str)) {
                    break;
                }
                i7++;
            } else {
                z5Var = null;
                break;
            }
        }
        if (z5Var != null) {
            ArrayList arrayList2 = z5Var.f12045i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.f13665b;
            deletepreviewmedia.bot = mp.u1(i10).q1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((fj) arrayList2.get(i11)).f23970l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(mp.l5(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.f13670r.e(-1, 0);
    }

    public abstract boolean c(fj fjVar);

    public final boolean d() {
        z5 z5Var;
        View currentView = this.f13669n.getCurrentView();
        if ((currentView instanceof m) && (z5Var = ((m) currentView).f13648a) != null) {
            ArrayList arrayList = z5Var.f12045i;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (!c((fj) arrayList.get(i7))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.A5;
        m5 m5Var = this.f13669n;
        int i12 = 0;
        if (i7 == i11) {
            Object obj = objArr[0];
            z5 z5Var = this.f13667e;
            if (obj == z5Var) {
                i(true);
                View[] viewPages = m5Var.getViewPages();
                int length = viewPages.length;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view instanceof m) {
                        m mVar = (m) view;
                        if (mVar.f13648a == z5Var) {
                            mVar.f13657w.f();
                        }
                    }
                    i12++;
                }
            } else if (this.f13668f.indexOf(obj) >= 0) {
                View[] viewPages2 = m5Var.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof m) {
                        m mVar2 = (m) view2;
                        if (mVar2.f13648a == objArr[0]) {
                            mVar2.f13657w.f();
                        }
                    }
                }
            }
        } else if (i7 == ks.f25230y5) {
            i(true);
            View[] viewPages3 = m5Var.getViewPages();
            int length2 = viewPages3.length;
            while (i12 < length2) {
                View view3 = viewPages3[i12];
                if (view3 instanceof m) {
                    ((m) view3).f13657w.f();
                }
                i12++;
            }
        }
    }

    public abstract boolean e(fj fjVar);

    public final void f() {
        z5 z5Var;
        View currentView = this.f13669n.getCurrentView();
        if ((currentView instanceof m) && (z5Var = ((m) currentView).f13648a) != null) {
            ArrayList arrayList = z5Var.f12045i;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (!c((fj) arrayList.get(i7))) {
                    e((fj) arrayList.get(i7));
                }
            }
        }
    }

    public abstract boolean g(fj fjVar);

    public String getBotPreviewsSubtitle() {
        int i7;
        int i10;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.f13669n.getCurrentView();
        if (currentView instanceof m) {
            z5 z5Var = ((m) currentView).f13648a;
            if (z5Var != null) {
                ArrayList arrayList = z5Var.f12045i;
                i7 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    fj fjVar = (fj) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = fjVar.f23970l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (fj.K4(messageMedia.document)) {
                            i10++;
                        } else if (fjVar.f23970l.media.photo != null) {
                            i7++;
                        }
                    }
                }
            } else {
                i7 = 0;
                i10 = 0;
            }
            if (i7 == 0 && i10 == 0) {
                return gd.M0(2131753003, null);
            }
            if (i7 > 0) {
                sb2.append(gd.G(i7, "Images", new Object[0]));
            }
            if (i10 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(gd.G(i10, "Videos", new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        z5 z5Var;
        m5 m5Var = this.f13669n;
        View[] viewPages = m5Var.getViewPages();
        if (Math.abs(m5Var.getCurrentPosition() - m5Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof m) && (z5Var = ((m) view).f13648a) != null) {
            return z5Var.E;
        }
        return null;
    }

    public z5 getCurrentList() {
        z5 z5Var;
        View currentView = this.f13669n.getCurrentView();
        if ((currentView instanceof m) && (z5Var = ((m) currentView).f13648a) != null) {
            return z5Var;
        }
        return null;
    }

    public ck0 getCurrentListView() {
        View currentView = this.f13669n.getCurrentView();
        if (currentView instanceof m) {
            return ((m) currentView).f13653f;
        }
        return null;
    }

    public int getItemsCount() {
        z5 z5Var;
        View currentView = this.f13669n.getCurrentView();
        if ((currentView instanceof m) && (z5Var = ((m) currentView).f13648a) != null) {
            return z5Var.f12045i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        z5 z5Var;
        View currentView = this.f13669n.getCurrentView();
        if ((currentView instanceof m) && (z5Var = ((m) currentView).f13648a) != null) {
            ArrayList arrayList = z5Var.f12045i;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (c((fj) arrayList.get(i7))) {
                    g((fj) arrayList.get(i7));
                }
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        float f10;
        z5 z5Var;
        d7 d7Var;
        ArrayList arrayList = new ArrayList(this.f13667e.G);
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
        p6 R1 = mp.u1(this.f13665b).R1();
        long j3 = this.d;
        ArrayList F2 = R1.F(j3);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                o6 o6Var = (o6) obj2;
                if (o6Var != null && (d7Var = o6Var.f12330c) != null && d7Var.J0 == j3 && !TextUtils.isEmpty(d7Var.K0) && !arrayList.contains(d7Var.K0)) {
                    arrayList.add(d7Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f13668f;
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
                    if (TextUtils.equals(((z5) arrayList4.get(i12)).E, str2)) {
                        z5Var = (z5) arrayList4.get(i12);
                        break;
                    }
                    i12++;
                } else {
                    z5Var = null;
                    break;
                }
            }
            if (z5Var == null) {
                z5 z5Var2 = new z5(this.f13665b, this.d, str2, null);
                z5Var2.H(null);
                z5Var = z5Var2;
            }
            arrayList3.add(z5Var);
        }
        m5 m5Var = this.f13669n;
        m5Var.j(true);
        SpannableString spannableString = new SpannableString(i5.c.k(2131746516, null, new StringBuilder("+ ")));
        lq lqVar = new lq(2131232152, 0);
        lqVar.I = 0.9f;
        lqVar.J = 0.9f;
        lqVar.H = 0.85f;
        spannableString.setSpan(lqVar, 0, 1, 33);
        f71 f71Var = this.f13670r;
        f71Var.a(-1, spannableString);
        f71Var.f35018y.f();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f13671s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f13674y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f13671s = Boolean.valueOf(z11);
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z10) {
            if (!z11) {
                f11 = 0.0f;
            }
            this.f13673x = f11;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = -42.0f;
            }
            f71Var.setTranslationY(g0.L(f10));
            if (z11) {
                f12 = 42.0f;
            }
            m5Var.setTranslationY(g0.L(f12));
            return;
        }
        float f13 = this.f13673x;
        if (!z11) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
        this.f13674y = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 25));
        this.f13674y.addListener(new bi.d7(5, this, z11));
        this.f13674y.setDuration(320L);
        this.f13674y.setInterpolator(lr.h);
        this.f13674y.start();
    }

    public final void j() {
        View currentView = this.f13669n.getCurrentView();
        if (currentView instanceof m) {
            m mVar = (m) currentView;
            e eVar = mVar.f13653f;
            for (int i7 = 0; i7 < eVar.getChildCount(); i7++) {
                View childAt = eVar.getChildAt(i7);
                if (childAt instanceof p7) {
                    p7 p7Var = (p7) childAt;
                    p7Var.i(mVar.f13649a0.c(p7Var.getMessageObject()), true);
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
        int i7 = this.f13665b;
        long j3 = i7;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j3);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = F;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j3, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        ks.f(i7).c(this, ks.A5);
        ks.f(i7).c(this, ks.f25230y5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (F == null) {
            F = new LongSparseArray();
        }
        LongSparseArray longSparseArray = F;
        int i7 = this.f13665b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i7);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        ks.f(i7).n(this, ks.A5);
        ks.f(i7).n(this, ks.f25230y5);
    }

    public void setVisibleHeight(int i7) {
        this.f13672w = i7;
        View[] viewPages = this.f13669n.getViewPages();
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
        i6 i6Var = this.f13666c;
        try {
            setBackgroundColor(n6.w(n6.w0(n6.f29394d6, i6Var), n6.r1(0.04f, n6.w0(n6.G6, i6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
