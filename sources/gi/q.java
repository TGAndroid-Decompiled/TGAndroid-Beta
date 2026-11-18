package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.media.session.a0;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.e7;
import bi.n5;
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
import org.telegram.ui.Cells.o7;
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
    public final h2 f13667a;
    public final int f13668b;
    public final i6 f13669c;
    public final long d;
    public final z5 f13670e;
    public final ArrayList f13671f;
    public final ArrayList h;
    public final n5 f13672n;
    public final f71 f13673r;
    public Boolean f13674s;
    public int f13675w;
    public float f13676x;
    public ValueAnimator f13677y;

    public q(Context context, h2 h2Var, long j3) {
        super(context);
        this.f13671f = new ArrayList();
        this.h = new ArrayList();
        this.f13674s = null;
        this.f13675w = g0.f24121q.y;
        this.E = Utilities.j(bz.f23205u1, 6, 2);
        this.f13667a = h2Var;
        int currentAccount = h2Var.getCurrentAccount();
        this.f13668b = currentAccount;
        i6 resourceProvider = h2Var.getResourceProvider();
        this.f13669c = resourceProvider;
        this.d = j3;
        setBackgroundColor(n6.w(n6.w0(n6.f29396d6, resourceProvider), n6.r1(0.04f, n6.w0(n6.G6, resourceProvider))));
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
        this.f13670e = z5Var;
        dq0 dq0Var = (dq0) this;
        n5 n5Var = new n5(dq0Var, context);
        this.f13672n = n5Var;
        n5Var.setAllowDisallowInterceptTouch(true);
        n5Var.setAdapter(new i4(1, context, dq0Var));
        addView(n5Var, ma.e(-1, -1, 119));
        f71 i7 = n5Var.i(9, true);
        this.f13673r = i7;
        i7.f35012r = 12;
        i7.setPreTabClick(new c7(dq0Var, 13));
        addView(i7, ma.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        h2 h2Var = this.f13667a;
        if (h2Var != null && h2Var.getParentActivity() != null) {
            si siVar = new si(h2Var.getParentActivity(), this.f13667a, false, false, false, this.f13669c);
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
        this.f13670e.G.remove(str);
        this.h.remove(str);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f13671f;
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
            ArrayList arrayList2 = z5Var.f12048i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.f13668b;
            deletepreviewmedia.bot = mp.u1(i10).q1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((fj) arrayList2.get(i11)).f23973l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(mp.l5(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.f13673r.e(-1, 0);
    }

    public abstract boolean c(fj fjVar);

    public final boolean d() {
        z5 z5Var;
        View currentView = this.f13672n.getCurrentView();
        if ((currentView instanceof m) && (z5Var = ((m) currentView).f13651a) != null) {
            ArrayList arrayList = z5Var.f12048i;
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
        int i11 = ks.f25239z5;
        n5 n5Var = this.f13672n;
        int i12 = 0;
        if (i7 == i11) {
            Object obj = objArr[0];
            z5 z5Var = this.f13670e;
            if (obj == z5Var) {
                i(true);
                View[] viewPages = n5Var.getViewPages();
                int length = viewPages.length;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view instanceof m) {
                        m mVar = (m) view;
                        if (mVar.f13651a == z5Var) {
                            mVar.f13660w.f();
                        }
                    }
                    i12++;
                }
            } else if (this.f13671f.indexOf(obj) >= 0) {
                View[] viewPages2 = n5Var.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof m) {
                        m mVar2 = (m) view2;
                        if (mVar2.f13651a == objArr[0]) {
                            mVar2.f13660w.f();
                        }
                    }
                }
            }
        } else if (i7 == ks.f25225x5) {
            i(true);
            View[] viewPages3 = n5Var.getViewPages();
            int length2 = viewPages3.length;
            while (i12 < length2) {
                View view3 = viewPages3[i12];
                if (view3 instanceof m) {
                    ((m) view3).f13660w.f();
                }
                i12++;
            }
        }
    }

    public abstract boolean e(fj fjVar);

    public final void f() {
        z5 z5Var;
        View currentView = this.f13672n.getCurrentView();
        if ((currentView instanceof m) && (z5Var = ((m) currentView).f13651a) != null) {
            ArrayList arrayList = z5Var.f12048i;
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
        View currentView = this.f13672n.getCurrentView();
        if (currentView instanceof m) {
            z5 z5Var = ((m) currentView).f13651a;
            if (z5Var != null) {
                ArrayList arrayList = z5Var.f12048i;
                i7 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    fj fjVar = (fj) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = fjVar.f23973l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (fj.K4(messageMedia.document)) {
                            i10++;
                        } else if (fjVar.f23973l.media.photo != null) {
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
        n5 n5Var = this.f13672n;
        View[] viewPages = n5Var.getViewPages();
        if (Math.abs(n5Var.getCurrentPosition() - n5Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof m) && (z5Var = ((m) view).f13651a) != null) {
            return z5Var.E;
        }
        return null;
    }

    public z5 getCurrentList() {
        z5 z5Var;
        View currentView = this.f13672n.getCurrentView();
        if ((currentView instanceof m) && (z5Var = ((m) currentView).f13651a) != null) {
            return z5Var;
        }
        return null;
    }

    public ck0 getCurrentListView() {
        View currentView = this.f13672n.getCurrentView();
        if (currentView instanceof m) {
            return ((m) currentView).f13656f;
        }
        return null;
    }

    public int getItemsCount() {
        z5 z5Var;
        View currentView = this.f13672n.getCurrentView();
        if ((currentView instanceof m) && (z5Var = ((m) currentView).f13651a) != null) {
            return z5Var.f12048i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        z5 z5Var;
        View currentView = this.f13672n.getCurrentView();
        if ((currentView instanceof m) && (z5Var = ((m) currentView).f13651a) != null) {
            ArrayList arrayList = z5Var.f12048i;
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
        ArrayList arrayList = new ArrayList(this.f13670e.G);
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
        p6 R1 = mp.u1(this.f13668b).R1();
        long j3 = this.d;
        ArrayList F2 = R1.F(j3);
        if (F2 != null) {
            int size2 = F2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = F2.get(i10);
                i10++;
                o6 o6Var = (o6) obj2;
                if (o6Var != null && (d7Var = o6Var.f12333c) != null && d7Var.J0 == j3 && !TextUtils.isEmpty(d7Var.K0) && !arrayList.contains(d7Var.K0)) {
                    arrayList.add(d7Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f13671f;
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
                z5 z5Var2 = new z5(this.f13668b, this.d, str2, null);
                z5Var2.H(null);
                z5Var = z5Var2;
            }
            arrayList3.add(z5Var);
        }
        n5 n5Var = this.f13672n;
        n5Var.j(true);
        SpannableString spannableString = new SpannableString(i5.c.k(2131746516, null, new StringBuilder("+ ")));
        lq lqVar = new lq(2131232152, 0);
        lqVar.I = 0.9f;
        lqVar.J = 0.9f;
        lqVar.H = 0.85f;
        spannableString.setSpan(lqVar, 0, 1, 33);
        f71 f71Var = this.f13673r;
        f71Var.a(-1, spannableString);
        f71Var.f35018y.f();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f13674s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f13677y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f13674s = Boolean.valueOf(z11);
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z10) {
            if (!z11) {
                f11 = 0.0f;
            }
            this.f13676x = f11;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = -42.0f;
            }
            f71Var.setTranslationY(g0.L(f10));
            if (z11) {
                f12 = 42.0f;
            }
            n5Var.setTranslationY(g0.L(f12));
            return;
        }
        float f13 = this.f13676x;
        if (!z11) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
        this.f13677y = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 25));
        this.f13677y.addListener(new e7(5, this, z11));
        this.f13677y.setDuration(320L);
        this.f13677y.setInterpolator(lr.h);
        this.f13677y.start();
    }

    public final void j() {
        View currentView = this.f13672n.getCurrentView();
        if (currentView instanceof m) {
            m mVar = (m) currentView;
            e eVar = mVar.f13656f;
            for (int i7 = 0; i7 < eVar.getChildCount(); i7++) {
                View childAt = eVar.getChildAt(i7);
                if (childAt instanceof o7) {
                    o7 o7Var = (o7) childAt;
                    o7Var.i(mVar.f13652a0.c(o7Var.getMessageObject()), true);
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
        int i7 = this.f13668b;
        long j3 = i7;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j3);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = F;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j3, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        ks.f(i7).c(this, ks.f25239z5);
        ks.f(i7).c(this, ks.f25225x5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (F == null) {
            F = new LongSparseArray();
        }
        LongSparseArray longSparseArray = F;
        int i7 = this.f13668b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i7);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        ks.f(i7).n(this, ks.f25239z5);
        ks.f(i7).n(this, ks.f25225x5);
    }

    public void setVisibleHeight(int i7) {
        this.f13675w = i7;
        View[] viewPages = this.f13672n.getViewPages();
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
        i6 i6Var = this.f13669c;
        try {
            setBackgroundColor(n6.w(n6.w0(n6.f29396d6, i6Var), n6.r1(0.04f, n6.w0(n6.G6, i6Var))));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
