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
public abstract class kr0 extends FrameLayout implements tjb, gk7 {
    public static LongSparseArray F;
    public static LongSparseArray G;
    public int E;
    public final d a;
    public final int b;
    public final wjb c;
    public final long d;
    public final s1b e;
    public final ArrayList f;
    public final ArrayList h;
    public final uq0 n;
    public final vec r;
    public Boolean s;
    public int w;
    public float x;
    public ValueAnimator y;

    public kr0(Context context, d dVar, long j) {
        super(context);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.s = null;
        this.w = gl.q.y;
        this.E = Utilities.j(gba.r1, 6, 2);
        this.a = dVar;
        int currentAccount = dVar.getCurrentAccount();
        this.b = currentAccount;
        wjb resourceProvider = dVar.getResourceProvider();
        this.c = resourceProvider;
        this.d = j;
        setBackgroundColor(bkb.v(bkb.v0(bkb.c6, resourceProvider), bkb.p1(0.04f, bkb.v0(bkb.F6, resourceProvider))));
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
        s1b s1bVar = (s1b) longSparseArray2.get(j);
        if (s1bVar == null) {
            s1b s1bVar2 = new s1b(currentAccount, j, "", null);
            longSparseArray2.put(j, s1bVar2);
            s1bVar = s1bVar2;
        }
        this.e = s1bVar;
        kca kcaVar = (kca) this;
        uq0 uq0Var = new uq0(kcaVar, context);
        this.n = uq0Var;
        uq0Var.setAllowDisallowInterceptTouch(true);
        uq0Var.setAdapter(new bn0((byte) 1, context, kcaVar));
        addView(uq0Var, nme.e(-1, -1, 119));
        vec l = uq0Var.l(9, true);
        this.r = l;
        l.r = 12;
        l.setPreTabClick(new sg0(kcaVar, (byte) 9));
        addView(l, nme.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        d dVar = this.a;
        if (dVar != null && dVar.getParentActivity() != null) {
            x02 x02Var = new x02(dVar.getParentActivity(), dVar, false, false, false, this.c);
            x02Var.t1(1, false);
            x02Var.Q2 = true;
            x02Var.P2 = false;
            x02Var.g3.setText(k96.M0(2131752109, null));
            x02Var.d2.h0();
            x02Var.W3 = new mv6(this, x02Var, str, (byte) 10);
            x02Var.Z0();
            x02Var.show();
        }
    }

    public final void b(String str) {
        s1b s1bVar;
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
                s1bVar = (s1b) arrayList.get(i);
                if (s1bVar != null && TextUtils.equals(s1bVar.E, str)) {
                    break;
                }
                i++;
            } else {
                s1bVar = null;
                break;
            }
        }
        if (s1bVar != null) {
            ArrayList arrayList2 = s1bVar.i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i2 = this.b;
            deletepreviewmedia.bot = na7.q1(i2).m1(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TL_stories.StoryItem storyItem = ((k27) arrayList2.get(i3)).l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(na7.e5(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i2).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.r.e(-1, 0);
    }

    public abstract boolean c(k27 k27Var);

    public final boolean d() {
        s1b s1bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gr0) && (s1bVar = ((gr0) currentView).a) != null) {
            ArrayList arrayList = s1bVar.i;
            for (int i = 0; i < arrayList.size(); i++) {
                if (!c((k27) arrayList.get(i))) {
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
        int i3 = kk7.z5;
        uq0 uq0Var = this.n;
        int i4 = 0;
        if (i == i3) {
            Object obj = objArr[0];
            s1b s1bVar = this.e;
            if (obj == s1bVar) {
                i(true);
                View[] viewPages2 = uq0Var.getViewPages();
                int length = viewPages2.length;
                while (i4 < length) {
                    View view = viewPages2[i4];
                    if (view instanceof gr0) {
                        gr0 gr0Var = (gr0) view;
                        if (gr0Var.a == s1bVar) {
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
        } else if (i == kk7.x5) {
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

    public abstract boolean e(k27 k27Var);

    public final void f() {
        s1b s1bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gr0) && (s1bVar = ((gr0) currentView).a) != null) {
            ArrayList arrayList = s1bVar.i;
            for (int i = 0; i < arrayList.size(); i++) {
                if (!c((k27) arrayList.get(i))) {
                    e((k27) arrayList.get(i));
                }
            }
        }
    }

    public abstract boolean g(k27 k27Var);

    public String getBotPreviewsSubtitle() {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb = new StringBuilder();
        View currentView = this.n.getCurrentView();
        if (currentView instanceof gr0) {
            s1b s1bVar = ((gr0) currentView).a;
            if (s1bVar != null) {
                ArrayList arrayList = s1bVar.i;
                i = 0;
                i2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    k27 k27Var = (k27) arrayList.get(i3);
                    TL_stories.StoryItem storyItem = k27Var.l;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (k27.J4(messageMedia.document)) {
                            i2++;
                        } else if (k27Var.l.media.photo != null) {
                            i++;
                        }
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return k96.M0(2131753002, null);
            }
            if (i > 0) {
                sb.append(k96.G(i, "Images", new Object[0]));
            }
            if (i2 > 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(k96.G(i2, "Videos", new Object[0]));
            }
        }
        return sb.toString();
    }

    public String getCurrentLang() {
        View view;
        s1b s1bVar;
        uq0 uq0Var = this.n;
        View[] viewPages = uq0Var.getViewPages();
        if (Math.abs(uq0Var.getCurrentPosition() - uq0Var.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof gr0) && (s1bVar = ((gr0) view).a) != null) {
            return s1bVar.E;
        }
        return null;
    }

    public s1b getCurrentList() {
        s1b s1bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gr0) && (s1bVar = ((gr0) currentView).a) != null) {
            return s1bVar;
        }
        return null;
    }

    public o39 getCurrentListView() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof gr0) {
            return ((gr0) currentView).f;
        }
        return null;
    }

    public int getItemsCount() {
        s1b s1bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gr0) && (s1bVar = ((gr0) currentView).a) != null) {
            return s1bVar.i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        s1b s1bVar;
        View currentView = this.n.getCurrentView();
        if ((currentView instanceof gr0) && (s1bVar = ((gr0) currentView).a) != null) {
            ArrayList arrayList = s1bVar.i;
            for (int i = 0; i < arrayList.size(); i++) {
                if (c((k27) arrayList.get(i))) {
                    g((k27) arrayList.get(i));
                }
            }
        }
    }

    public final void i(boolean z) {
        boolean z2;
        float f;
        s1b s1bVar;
        f4b f4bVar;
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
        g2b M1 = na7.q1(this.b).M1();
        long j = this.d;
        ArrayList E = M1.E(j);
        if (E != null) {
            int size2 = E.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = E.get(i2);
                i2++;
                f2b f2bVar = (f2b) obj2;
                if (f2bVar != null && (f4bVar = f2bVar.c) != null && f4bVar.J0 == j && !TextUtils.isEmpty(f4bVar.K0) && !arrayList.contains(f4bVar.K0)) {
                    arrayList.add(f4bVar.K0);
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
                    if (TextUtils.equals(((s1b) arrayList4.get(i4)).E, str2)) {
                        s1bVar = (s1b) arrayList4.get(i4);
                        break;
                    }
                    i4++;
                } else {
                    s1bVar = null;
                    break;
                }
            }
            if (s1bVar == null) {
                s1b s1bVar2 = new s1b(this.b, this.d, str2, null);
                s1bVar2.H(null);
                s1bVar = s1bVar2;
            }
            arrayList3.add(s1bVar);
        }
        uq0 uq0Var = this.n;
        uq0Var.m(true);
        SpannableString spannableString = new SpannableString("+ ".concat(k96.M0(2131746518, null)));
        cm2 cm2Var = new cm2(2131232155, 0);
        cm2Var.I = 0.9f;
        cm2Var.J = 0.9f;
        cm2Var.H = 0.85f;
        spannableString.setSpan(cm2Var, 0, 1, 33);
        vec vecVar = this.r;
        vecVar.a(-1, spannableString);
        vecVar.y.f();
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
            vecVar.setTranslationY(gl.L(f));
            if (z2) {
                f3 = 42.0f;
            }
            uq0Var.setTranslationY(gl.L(f3));
            return;
        }
        float f4 = this.x;
        if (!z2) {
            f2 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f2);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new f0(this, (byte) 17));
        this.y.addListener(new y7((byte) 6, this, z2));
        this.y.setDuration(320L);
        this.y.setInterpolator(s33.h);
        this.y.start();
    }

    public final void j() {
        View currentView = this.n.getCurrentView();
        if (currentView instanceof gr0) {
            gr0 gr0Var = (gr0) currentView;
            yq0 yq0Var = gr0Var.f;
            for (int i = 0; i < yq0Var.getChildCount(); i++) {
                View childAt = yq0Var.getChildAt(i);
                if (childAt instanceof qfa) {
                    qfa qfaVar = (qfa) childAt;
                    qfaVar.i(gr0Var.a0.c(qfaVar.getMessageObject()), true);
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
        kk7.f(i).b(this, kk7.z5);
        kk7.f(i).b(this, kk7.x5);
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
        kk7.f(i).n(this, kk7.z5);
        kk7.f(i).n(this, kk7.x5);
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
        wjb wjbVar = this.c;
        try {
            setBackgroundColor(bkb.v(bkb.v0(bkb.c6, wjbVar), bkb.p1(0.04f, bkb.v0(bkb.F6, wjbVar))));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
