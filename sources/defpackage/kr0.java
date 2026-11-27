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
import org.telegram.ui.ActionBar.e;
public abstract class kr0 extends FrameLayout implements snb, fn7 {
    public static LongSparseArray F;
    public static LongSparseArray G;
    public int E;
    public final e a;
    public final int b;
    public final vnb c;
    public final long d;
    public final o5b e;
    public final ArrayList f;
    public final ArrayList h;
    public final uq0 n;
    public final uic r;
    public Boolean s;
    public int w;
    public float x;
    public ValueAnimator y;

    public kr0(Context context, e eVar, long j) {
        super(context);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = null;
        this.w = hl.q.y;
        this.E = Utilities.j(xea.q1, 6, 2);
        this.a = eVar;
        int currentAccount = eVar.getCurrentAccount();
        this.b = currentAccount;
        vnb resourceProvider = eVar.getResourceProvider();
        this.c = resourceProvider;
        this.d = j;
        setBackgroundColor(aob.v(aob.v0(aob.d6, resourceProvider), aob.p1(0.04f, aob.v0(aob.G6, resourceProvider))));
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
        o5b o5bVar = (o5b) longSparseArray2.get(j);
        if (o5bVar == null) {
            o5b o5bVar2 = new o5b(currentAccount, j, "", null);
            longSparseArray2.put(j, o5bVar2);
            o5bVar = o5bVar2;
        }
        this.e = o5bVar;
        bga bgaVar = (bga) this;
        uq0 uq0Var = new uq0(bgaVar, context);
        this.n = uq0Var;
        uq0Var.setAllowDisallowInterceptTouch(true);
        uq0Var.setAdapter(new bn0((byte) 1, context, bgaVar));
        addView(uq0Var, tre.e(-1, -1, 119));
        uic l = uq0Var.l(9, true);
        this.r = l;
        l.r = 12;
        l.setPreTabClick(new tg0(bgaVar, (byte) 9));
        addView(l, tre.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        e eVar = this.a;
        if (eVar != null && eVar.getParentActivity() != null) {
            n12 n12Var = new n12(eVar.getParentActivity(), eVar, false, false, false, this.c);
            n12Var.u1(1, false);
            n12Var.Q2 = true;
            n12Var.P2 = false;
            n12Var.g3.setText(ob6.M0(2131752086, null));
            n12Var.d2.g0();
            n12Var.W3 = new rx6(this, n12Var, str, (byte) 10);
            n12Var.a1();
            n12Var.show();
        }
    }

    public final void b(String str) {
        o5b o5bVar;
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
                o5bVar = (o5b) arrayList.get(i);
                if (o5bVar != null && TextUtils.equals(o5bVar.E, str)) {
                    break;
                }
                i++;
            } else {
                o5bVar = null;
                break;
            }
        }
        if (o5bVar != null) {
            ArrayList arrayList2 = o5bVar.i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i2 = this.b;
            deletepreviewmedia.bot = uc7.s1(i2).o1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TL_stories.StoryItem storyItem = ((r47) arrayList2.get(i3)).l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(uc7.n5(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i2).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.r.e(-1, 0);
    }

    public abstract boolean c(r47 r47Var);

    public final boolean d() {
        o5b o5bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gr0) && (o5bVar = ((gr0) currentView).a) != null) {
            ArrayList arrayList = o5bVar.i;
            for (int i = 0; i < arrayList.size(); i++) {
                if (!c((r47) arrayList.get(i))) {
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
        int i3 = jn7.A5;
        uq0 uq0Var = this.n;
        int i4 = 0;
        if (i == i3) {
            Object obj = objArr[0];
            o5b o5bVar = this.e;
            if (obj == o5bVar) {
                i(true);
                View[] viewPages2 = uq0Var.getViewPages();
                int length = viewPages2.length;
                while (i4 < length) {
                    View view = viewPages2[i4];
                    if (view instanceof gr0) {
                        gr0 gr0Var = (gr0) view;
                        if (gr0Var.a == o5bVar) {
                            gr0Var.w.f();
                        }
                    }
                    i4++;
                }
            } else if (this.f.indexOf(obj) >= 0) {
                for (View view2 : uq0Var.getViewPages()) {
                    if (view2 instanceof gr0) {
                        gr0 gr0Var2 = (gr0) view2;
                        if (gr0Var2.a == objArr[0]) {
                            gr0Var2.w.f();
                        }
                    }
                }
            }
        } else if (i == jn7.y5) {
            i(true);
            View[] viewPages3 = uq0Var.getViewPages();
            int length2 = viewPages3.length;
            while (i4 < length2) {
                View view3 = viewPages3[i4];
                if (view3 instanceof gr0) {
                    ((gr0) view3).w.f();
                }
                i4++;
            }
        }
    }

    public abstract boolean e(r47 r47Var);

    public final void f() {
        o5b o5bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gr0) && (o5bVar = ((gr0) currentView).a) != null) {
            ArrayList arrayList = o5bVar.i;
            for (int i = 0; i < arrayList.size(); i++) {
                if (!c((r47) arrayList.get(i))) {
                    e((r47) arrayList.get(i));
                }
            }
        }
    }

    public abstract boolean g(r47 r47Var);

    public String getBotPreviewsSubtitle() {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb = new StringBuilder();
        View currentView = this.n.getCurrentView();
        if (currentView instanceof gr0) {
            o5b o5bVar = ((gr0) currentView).a;
            if (o5bVar != null) {
                ArrayList arrayList = o5bVar.i;
                i = 0;
                i2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    r47 r47Var = (r47) arrayList.get(i3);
                    TL_stories.StoryItem storyItem = r47Var.l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (r47.J4(messageMedia.document)) {
                            i2++;
                        } else if (r47Var.l.media.photo != null) {
                            i++;
                        }
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return ob6.M0(2131752998, null);
            }
            if (i > 0) {
                sb.append(ob6.G(i, "Images", new Object[0]));
            }
            if (i2 > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(ob6.G(i2, "Videos", new Object[0]));
            }
        }
        return sb.toString();
    }

    public String getCurrentLang() {
        View view;
        o5b o5bVar;
        uq0 uq0Var = this.n;
        View[] viewPages = uq0Var.getViewPages();
        if (Math.abs(uq0Var.getCurrentPosition() - uq0Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof gr0) && (o5bVar = ((gr0) view).a) != null) {
            return o5bVar.E;
        }
        return null;
    }

    public o5b getCurrentList() {
        o5b o5bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gr0) && (o5bVar = ((gr0) currentView).a) != null) {
            return o5bVar;
        }
        return null;
    }

    public d79 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof gr0) {
            return ((gr0) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        o5b o5bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gr0) && (o5bVar = ((gr0) currentView).a) != null) {
            return o5bVar.i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        o5b o5bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gr0) && (o5bVar = ((gr0) currentView).a) != null) {
            ArrayList arrayList = o5bVar.i;
            for (int i = 0; i < arrayList.size(); i++) {
                if (c((r47) arrayList.get(i))) {
                    g((r47) arrayList.get(i));
                }
            }
        }
    }

    public final void i(boolean z) {
        boolean z2;
        float f;
        o5b o5bVar;
        c8b c8bVar;
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
        c6b O1 = uc7.s1(this.b).O1();
        long j = this.d;
        ArrayList E = O1.E(j);
        if (E != null) {
            int size2 = E.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = E.get(i2);
                i2++;
                b6b b6bVar = (b6b) obj2;
                if (b6bVar != null && (c8bVar = b6bVar.c) != null && c8bVar.J0 == j && !TextUtils.isEmpty(c8bVar.K0) && !arrayList.contains(c8bVar.K0)) {
                    arrayList.add(c8bVar.K0);
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
                    if (TextUtils.equals(((o5b) arrayList4.get(i4)).E, str2)) {
                        o5bVar = (o5b) arrayList4.get(i4);
                        break;
                    }
                    i4++;
                } else {
                    o5bVar = null;
                    break;
                }
            }
            if (o5bVar == null) {
                o5b o5bVar2 = new o5b(this.b, this.d, str2, null);
                o5bVar2.H(null);
                o5bVar = o5bVar2;
            }
            arrayList3.add(o5bVar);
        }
        uq0 uq0Var = this.n;
        uq0Var.m(true);
        SpannableString spannableString = new SpannableString("+ ".concat(ob6.M0(2131746438, null)));
        wm2 wm2Var = new wm2(2131232155, 0);
        wm2Var.I = 0.9f;
        wm2Var.J = 0.9f;
        wm2Var.H = 0.85f;
        spannableString.setSpan(wm2Var, 0, 1, 33);
        uic uicVar = this.r;
        uicVar.a(-1, spannableString);
        uicVar.y.f();
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
            uicVar.setTranslationY(hl.L(f));
            if (z2) {
                f3 = 42.0f;
            }
            uq0Var.setTranslationY(hl.L(f3));
            return;
        }
        float f4 = this.x;
        if (!z2) {
            f2 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f2);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new g0(this, (byte) 17));
        this.y.addListener(new z7((byte) 6, this, z2));
        this.y.setDuration(320L);
        this.y.setInterpolator(k43.h);
        this.y.start();
    }

    public final void j() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof gr0) {
            gr0 gr0Var = (gr0) currentView;
            yq0 yq0Var = gr0Var.f;
            for (int i = 0; i < yq0Var.getChildCount(); i++) {
                View childAt = yq0Var.getChildAt(i);
                if (childAt instanceof jja) {
                    jja jjaVar = (jja) childAt;
                    jjaVar.i(gr0Var.a0.c(jjaVar.getMessageObject()), true);
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
        jn7.f(i).b(this, jn7.A5);
        jn7.f(i).b(this, jn7.y5);
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
        jn7.f(i).n(this, jn7.A5);
        jn7.f(i).n(this, jn7.y5);
    }

    public void setVisibleHeight(int i) {
        this.w = i;
        View[] viewPages = this.n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof gr0) {
                    ((gr0) view).setVisibleHeight(i);
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        vnb vnbVar = this.c;
        try {
            setBackgroundColor(aob.v(aob.v0(aob.d6, vnbVar), aob.p1(0.04f, aob.v0(aob.G6, vnbVar))));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
