package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public abstract class ks0 extends FrameLayout implements vlb, jm7 {
    public static LongSparseArray F;
    public static LongSparseArray G;
    public int E;
    public final d a;
    public final int b;
    public final ylb c;
    public final long d;
    public final t3b e;
    public final ArrayList f;
    public final ArrayList h;
    public final ur0 n;
    public final vgc r;
    public Boolean s;
    public int w;
    public float x;
    public ValueAnimator y;

    public ks0(Context context, d dVar, long j) {
        super(context);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = null;
        this.w = gm.q.y;
        this.E = Utilities.j(gda.q1, 6, 2);
        this.a = dVar;
        int currentAccount = dVar.getCurrentAccount();
        this.b = currentAccount;
        ylb resourceProvider = dVar.getResourceProvider();
        this.c = resourceProvider;
        this.d = j;
        setBackgroundColor(cmb.v(cmb.v0(cmb.c6, resourceProvider), cmb.p1(0.04f, cmb.v0(cmb.F6, resourceProvider))));
        LongSparseArray longSparseArray = G;
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray();
            G = longSparseArray;
        }
        long j2 = currentAccount;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j2);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = G;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j2, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        t3b t3bVar = (t3b) longSparseArray2.get(j);
        if (t3bVar == null) {
            t3b t3bVar2 = new t3b(currentAccount, j, "", null);
            longSparseArray2.put(j, t3bVar2);
            t3bVar = t3bVar2;
        }
        this.e = t3bVar;
        kea keaVar = (kea) this;
        ur0 ur0Var = new ur0(keaVar, context);
        this.n = ur0Var;
        ur0Var.setAllowDisallowInterceptTouch(true);
        ur0Var.setAdapter(new bo0((byte) 1, context, keaVar));
        addView(ur0Var, qoe.e(-1, -1, 119));
        vgc l = ur0Var.l(9, true);
        this.r = l;
        l.r = 12;
        l.setPreTabClick(new xg0(keaVar, (byte) 11));
        addView(l, qoe.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        d dVar = this.a;
        if (dVar != null && dVar.getParentActivity() != null) {
            i22 i22Var = new i22(dVar.getParentActivity(), dVar, false, false, false, this.c);
            i22Var.t1(1, false);
            i22Var.Q2 = true;
            i22Var.P2 = false;
            i22Var.g3.setText(jb6.M0(2131752058, null));
            i22Var.d2.h0();
            i22Var.W3 = new mx6(this, i22Var, str, (byte) 10);
            i22Var.Z0();
            i22Var.show();
        }
    }

    public final void b(String str) {
        t3b t3bVar;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.G.remove(str);
        this.h.remove(str);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i < arrayList.size()) {
                t3bVar = (t3b) arrayList.get(i);
                if (t3bVar != null && TextUtils.equals(t3bVar.E, str)) {
                    break;
                }
                i++;
            } else {
                t3bVar = null;
                break;
            }
        }
        if (t3bVar != null) {
            ArrayList arrayList2 = t3bVar.i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i2 = this.b;
            deletepreviewmedia.bot = oc7.r1(i2).n1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TL_stories.StoryItem storyItem = ((k47) arrayList2.get(i3)).l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(oc7.h5(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i2).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.r.e(-1, 0);
    }

    public abstract boolean c(k47 k47Var);

    public final boolean d() {
        t3b t3bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gs0) && (t3bVar = ((gs0) currentView).a) != null) {
            ArrayList arrayList = t3bVar.i;
            for (int i = 0; i < arrayList.size(); i++) {
                if (!c((k47) arrayList.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        View[] viewPages;
        int i3 = nm7.B5;
        ur0 ur0Var = this.n;
        int i4 = 0;
        if (i == i3) {
            Object obj = objArr[0];
            t3b t3bVar = this.e;
            if (obj == t3bVar) {
                i(true);
                View[] viewPages2 = ur0Var.getViewPages();
                int length = viewPages2.length;
                while (i4 < length) {
                    View view = viewPages2[i4];
                    if (view instanceof gs0) {
                        gs0 gs0Var = (gs0) view;
                        if (gs0Var.a == t3bVar) {
                            gs0Var.w.f();
                        }
                    }
                    i4++;
                }
            } else if (this.f.indexOf(obj) >= 0) {
                for (View view2 : ur0Var.getViewPages()) {
                    if (view2 instanceof gs0) {
                        gs0 gs0Var2 = (gs0) view2;
                        if (gs0Var2.a == objArr[0]) {
                            gs0Var2.w.f();
                        }
                    }
                }
            }
        } else if (i == nm7.z5) {
            i(true);
            View[] viewPages3 = ur0Var.getViewPages();
            int length2 = viewPages3.length;
            while (i4 < length2) {
                View view3 = viewPages3[i4];
                if (view3 instanceof gs0) {
                    ((gs0) view3).w.f();
                }
                i4++;
            }
        }
    }

    public abstract boolean e(k47 k47Var);

    public final void f() {
        t3b t3bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gs0) && (t3bVar = ((gs0) currentView).a) != null) {
            ArrayList arrayList = t3bVar.i;
            for (int i = 0; i < arrayList.size(); i++) {
                if (!c((k47) arrayList.get(i))) {
                    e((k47) arrayList.get(i));
                }
            }
        }
    }

    public abstract boolean g(k47 k47Var);

    public String getBotPreviewsSubtitle() {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb = new StringBuilder();
        View currentView = this.n.getCurrentView();
        if (currentView instanceof gs0) {
            t3b t3bVar = ((gs0) currentView).a;
            if (t3bVar != null) {
                ArrayList arrayList = t3bVar.i;
                i = 0;
                i2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    k47 k47Var = (k47) arrayList.get(i3);
                    TL_stories.StoryItem storyItem = k47Var.l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (k47.J4(messageMedia.document)) {
                            i2++;
                        } else if (k47Var.l.media.photo != null) {
                            i++;
                        }
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return jb6.M0(2131752970, null);
            }
            if (i > 0) {
                sb.append(jb6.G(i, "Images", new Object[0]));
            }
            if (i2 > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(jb6.G(i2, "Videos", new Object[0]));
            }
        }
        return sb.toString();
    }

    public String getCurrentLang() {
        View view;
        t3b t3bVar;
        ur0 ur0Var = this.n;
        View[] viewPages = ur0Var.getViewPages();
        if (Math.abs(ur0Var.getCurrentPosition() - ur0Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof gs0) && (t3bVar = ((gs0) view).a) != null) {
            return t3bVar.E;
        }
        return null;
    }

    public t3b getCurrentList() {
        t3b t3bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gs0) && (t3bVar = ((gs0) currentView).a) != null) {
            return t3bVar;
        }
        return null;
    }

    public r59 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof gs0) {
            return ((gs0) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        t3b t3bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gs0) && (t3bVar = ((gs0) currentView).a) != null) {
            return t3bVar.i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        t3b t3bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gs0) && (t3bVar = ((gs0) currentView).a) != null) {
            ArrayList arrayList = t3bVar.i;
            for (int i = 0; i < arrayList.size(); i++) {
                if (c((k47) arrayList.get(i))) {
                    g((k47) arrayList.get(i));
                }
            }
        }
    }

    public final void i(boolean z) {
        boolean z2;
        float f;
        t3b t3bVar;
        g6b g6bVar;
        ArrayList arrayList = new ArrayList(this.e.G);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        h4b N1 = oc7.r1(this.b).N1();
        long j = this.d;
        ArrayList E = N1.E(j);
        if (E != null) {
            int size2 = E.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = E.get(i2);
                i2++;
                g4b g4bVar = (g4b) obj2;
                if (g4bVar != null && (g6bVar = g4bVar.c) != null && g6bVar.J0 == j && !TextUtils.isEmpty(g6bVar.K0) && !arrayList.contains(g6bVar.K0)) {
                    arrayList.add(g6bVar.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList.get(i3);
            i3++;
            String str2 = (String) obj3;
            int i4 = 0;
            while (true) {
                if (i4 < arrayList4.size()) {
                    if (TextUtils.equals(((t3b) arrayList4.get(i4)).E, str2)) {
                        t3bVar = (t3b) arrayList4.get(i4);
                        break;
                    }
                    i4++;
                } else {
                    t3bVar = null;
                    break;
                }
            }
            if (t3bVar == null) {
                t3b t3bVar2 = new t3b(this.b, this.d, str2, null);
                t3bVar2.H(null);
                t3bVar = t3bVar2;
            }
            arrayList3.add(t3bVar);
        }
        ur0 ur0Var = this.n;
        ur0Var.m(true);
        SpannableString spannableString = new SpannableString("+ ".concat(jb6.M0(2131746444, null)));
        pn2 pn2Var = new pn2(2131232156, 0);
        pn2Var.I = 0.9f;
        pn2Var.J = 0.9f;
        pn2Var.H = 0.85f;
        spannableString.setSpan(pn2Var, 0, 1, 33);
        vgc vgcVar = this.r;
        vgcVar.a(-1, spannableString);
        vgcVar.y.f();
        if (arrayList3.size() + 1 > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool = this.s;
        if (bool != null && bool.booleanValue() == z2) {
            return;
        }
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.s = Boolean.valueOf(z2);
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (!z) {
            if (!z2) {
                f2 = 0.0f;
            }
            this.x = f2;
            if (z2) {
                f = 0.0f;
            } else {
                f = -42.0f;
            }
            vgcVar.setTranslationY(gm.L(f));
            if (z2) {
                f3 = 42.0f;
            }
            ur0Var.setTranslationY(gm.L(f3));
            return;
        }
        float f4 = this.x;
        if (!z2) {
            f2 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f2);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new f0(this, (byte) 18));
        this.y.addListener(new y7((byte) 6, this, z2));
        this.y.setDuration(320L);
        this.y.setInterpolator(d53.h);
        this.y.start();
    }

    public final void j() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof gs0) {
            gs0 gs0Var = (gs0) currentView;
            yr0 yr0Var = gs0Var.f;
            for (int i = 0; i < yr0Var.getChildCount(); i++) {
                View childAt = yr0Var.getChildAt(i);
                if (childAt instanceof sha) {
                    sha shaVar = (sha) childAt;
                    shaVar.i(gs0Var.a0.c(shaVar.getMessageObject()), true);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LongSparseArray longSparseArray = F;
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray();
            F = longSparseArray;
        }
        int i = this.b;
        long j = i;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = F;
            LongSparseArray longSparseArray4 = new LongSparseArray();
            longSparseArray3.put(j, longSparseArray4);
            longSparseArray2 = longSparseArray4;
        }
        longSparseArray2.put(this.d, this);
        nm7.f(i).b(this, nm7.B5);
        nm7.f(i).b(this, nm7.z5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LongSparseArray longSparseArray = F;
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray();
            F = longSparseArray;
        }
        int i = this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        nm7.f(i).n(this, nm7.B5);
        nm7.f(i).n(this, nm7.z5);
    }

    public void setVisibleHeight(int i) {
        this.w = i;
        View[] viewPages = this.n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof gs0) {
                    ((gs0) view).setVisibleHeight(i);
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        ylb ylbVar = this.c;
        try {
            setBackgroundColor(cmb.v(cmb.v0(cmb.c6, ylbVar), cmb.p1(0.04f, cmb.v0(cmb.F6, ylbVar))));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
