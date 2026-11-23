package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.a0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.j7;
import bi.s5;
import c8.na;
import di.i4;
import di.v6;
import fi.a6;
import fi.o6;
import fi.p6;
import hi.x7;
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
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ti;
public abstract class q extends FrameLayout implements c6, fs {
    public static LongSparseArray F;
    public static LongSparseArray G;
    public int E;
    public final g2 f13659a;
    public final int f13660b;
    public final i6 f13661c;
    public final long d;
    public final a6 f13662e;
    public final ArrayList f13663f;
    public final ArrayList h;
    public final s5 f13664n;
    public final j71 f13665r;
    public Boolean f13666s;
    public int f13667w;
    public float f13668x;
    public ValueAnimator f13669y;

    public q(Context context, g2 g2Var, long j3) {
        super(context);
        this.f13663f = new ArrayList();
        this.h = new ArrayList();
        this.f13666s = null;
        this.f13667w = g0.f24226q.y;
        this.E = Utilities.j(bz.f23327u1, 6, 2);
        this.f13659a = g2Var;
        int currentAccount = g2Var.getCurrentAccount();
        this.f13660b = currentAccount;
        i6 resourceProvider = g2Var.getResourceProvider();
        this.f13661c = resourceProvider;
        this.d = j3;
        setBackgroundColor(n6.w(n6.w0(n6.f29451d6, resourceProvider), n6.r1(0.04f, n6.w0(n6.G6, resourceProvider))));
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
        this.f13662e = a6Var;
        eq0 eq0Var = (eq0) this;
        s5 s5Var = new s5(eq0Var, context);
        this.f13664n = s5Var;
        s5Var.setAllowDisallowInterceptTouch(true);
        s5Var.setAdapter(new i4(1, context, eq0Var));
        addView(s5Var, na.e(-1, -1, 119));
        j71 k10 = s5Var.k(9, true);
        this.f13665r = k10;
        k10.f36344r = 12;
        k10.setPreTabClick(new v6(eq0Var, 14));
        addView(k10, na.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        g2 g2Var = this.f13659a;
        if (g2Var != null && g2Var.getParentActivity() != null) {
            ti tiVar = new ti(g2Var.getParentActivity(), this.f13659a, false, false, false, this.f13661c);
            tiVar.z1(1, false);
            tiVar.R2 = true;
            tiVar.Q2 = false;
            tiVar.f39977h3.setText(gd.N0(2131752109, null));
            tiVar.f39967e2.i0();
            tiVar.X3 = new a0(this, tiVar, str);
            tiVar.f1();
            tiVar.show();
        }
    }

    public final void b(String str) {
        a6 a6Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13662e.G.remove(str);
        this.h.remove(str);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f13663f;
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
            ArrayList arrayList2 = a6Var.f12051i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.f13660b;
            deletepreviewmedia.bot = mp.u1(i10).q1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((fj) arrayList2.get(i11)).f24078l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(mp.l5(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.f13665r.e(-1, 0);
    }

    public abstract boolean c(fj fjVar);

    public final boolean d() {
        a6 a6Var;
        View currentView = this.f13664n.getCurrentView();
        if ((currentView instanceof m) && (a6Var = ((m) currentView).f13643a) != null) {
            ArrayList arrayList = a6Var.f12051i;
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
        s5 s5Var = this.f13664n;
        int i12 = 0;
        if (i7 == i11) {
            Object obj = objArr[0];
            a6 a6Var = this.f13662e;
            if (obj == a6Var) {
                i(true);
                View[] viewPages = s5Var.getViewPages();
                int length = viewPages.length;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view instanceof m) {
                        m mVar = (m) view;
                        if (mVar.f13643a == a6Var) {
                            mVar.f13652w.f();
                        }
                    }
                    i12++;
                }
            } else if (this.f13663f.indexOf(obj) >= 0) {
                View[] viewPages2 = s5Var.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof m) {
                        m mVar2 = (m) view2;
                        if (mVar2.f13643a == objArr[0]) {
                            mVar2.f13652w.f();
                        }
                    }
                }
            }
        } else if (i7 == ks.f25329y5) {
            i(true);
            View[] viewPages3 = s5Var.getViewPages();
            int length2 = viewPages3.length;
            while (i12 < length2) {
                View view3 = viewPages3[i12];
                if (view3 instanceof m) {
                    ((m) view3).f13652w.f();
                }
                i12++;
            }
        }
    }

    public abstract boolean e(fj fjVar);

    public final void f() {
        a6 a6Var;
        View currentView = this.f13664n.getCurrentView();
        if ((currentView instanceof m) && (a6Var = ((m) currentView).f13643a) != null) {
            ArrayList arrayList = a6Var.f12051i;
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
        View currentView = this.f13664n.getCurrentView();
        if (currentView instanceof m) {
            a6 a6Var = ((m) currentView).f13643a;
            if (a6Var != null) {
                ArrayList arrayList = a6Var.f12051i;
                i7 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    fj fjVar = (fj) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = fjVar.f24078l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (fj.K4(messageMedia.document)) {
                            i10++;
                        } else if (fjVar.f24078l.media.photo != null) {
                            i7++;
                        }
                    }
                }
            } else {
                i7 = 0;
                i10 = 0;
            }
            if (i7 == 0 && i10 == 0) {
                return gd.N0(2131753002, null);
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
        a6 a6Var;
        s5 s5Var = this.f13664n;
        View[] viewPages = s5Var.getViewPages();
        if (Math.abs(s5Var.getCurrentPosition() - s5Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof m) && (a6Var = ((m) view).f13643a) != null) {
            return a6Var.E;
        }
        return null;
    }

    public a6 getCurrentList() {
        a6 a6Var;
        View currentView = this.f13664n.getCurrentView();
        if ((currentView instanceof m) && (a6Var = ((m) currentView).f13643a) != null) {
            return a6Var;
        }
        return null;
    }

    public ek0 getCurrentListView() {
        View currentView = this.f13664n.getCurrentView();
        if (currentView instanceof m) {
            return ((m) currentView).f13648f;
        }
        return null;
    }

    public int getItemsCount() {
        a6 a6Var;
        View currentView = this.f13664n.getCurrentView();
        if ((currentView instanceof m) && (a6Var = ((m) currentView).f13643a) != null) {
            return a6Var.f12051i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        a6 a6Var;
        View currentView = this.f13664n.getCurrentView();
        if ((currentView instanceof m) && (a6Var = ((m) currentView).f13643a) != null) {
            ArrayList arrayList = a6Var.f12051i;
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
        a6 a6Var;
        x7 x7Var;
        ArrayList arrayList = new ArrayList(this.f13662e.G);
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
        p6 R1 = mp.u1(this.f13660b).R1();
        long j3 = this.d;
        ArrayList F2 = R1.F(j3);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                o6 o6Var = (o6) obj2;
                if (o6Var != null && (x7Var = o6Var.f12337c) != null && x7Var.J0 == j3 && !TextUtils.isEmpty(x7Var.K0) && !arrayList.contains(x7Var.K0)) {
                    arrayList.add(x7Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f13663f;
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
                a6 a6Var2 = new a6(this.f13660b, this.d, str2, null);
                a6Var2.H(null);
                a6Var = a6Var2;
            }
            arrayList3.add(a6Var);
        }
        s5 s5Var = this.f13664n;
        s5Var.l(true);
        SpannableString spannableString = new SpannableString(i5.c.k(2131746515, null, new StringBuilder("+ ")));
        kq kqVar = new kq(2131232155, 0);
        kqVar.I = 0.9f;
        kqVar.J = 0.9f;
        kqVar.H = 0.85f;
        spannableString.setSpan(kqVar, 0, 1, 33);
        j71 j71Var = this.f13665r;
        j71Var.a(-1, spannableString);
        j71Var.f36350y.f();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f13666s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f13669y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f13666s = Boolean.valueOf(z11);
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z10) {
            if (!z11) {
                f11 = 0.0f;
            }
            this.f13668x = f11;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = -42.0f;
            }
            j71Var.setTranslationY(g0.L(f10));
            if (z11) {
                f12 = 42.0f;
            }
            s5Var.setTranslationY(g0.L(f12));
            return;
        }
        float f13 = this.f13668x;
        if (!z11) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
        this.f13669y = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 25));
        this.f13669y.addListener(new j7(5, this, z11));
        this.f13669y.setDuration(320L);
        this.f13669y.setInterpolator(kr.h);
        this.f13669y.start();
    }

    public final void j() {
        View currentView = this.f13664n.getCurrentView();
        if (currentView instanceof m) {
            m mVar = (m) currentView;
            e eVar = mVar.f13648f;
            for (int i7 = 0; i7 < eVar.getChildCount(); i7++) {
                View childAt = eVar.getChildAt(i7);
                if (childAt instanceof o7) {
                    o7 o7Var = (o7) childAt;
                    o7Var.i(mVar.f13644a0.c(o7Var.getMessageObject()), true);
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
        int i7 = this.f13660b;
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
        ks.f(i7).c(this, ks.f25329y5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (F == null) {
            F = new LongSparseArray();
        }
        LongSparseArray longSparseArray = F;
        int i7 = this.f13660b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i7);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        ks.f(i7).n(this, ks.A5);
        ks.f(i7).n(this, ks.f25329y5);
    }

    public void setVisibleHeight(int i7) {
        this.f13667w = i7;
        View[] viewPages = this.f13664n.getViewPages();
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
        i6 i6Var = this.f13661c;
        try {
            setBackgroundColor(n6.w(n6.w0(n6.f29451d6, i6Var), n6.r1(0.04f, n6.w0(n6.G6, i6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
