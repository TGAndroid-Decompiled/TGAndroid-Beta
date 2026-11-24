package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class wa5 extends d implements gk7, vl5 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public TLRPC.InputFile G;
    public TLRPC.InputFile H;
    public TLRPC.VideoSize I;
    public String J;
    public double K;
    public ArrayList L;
    public boolean M;
    public boolean N;
    public wl5 O;
    public String P;
    public final int Q;
    public final boolean R;
    public oy8 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public wb4 Y;
    public va5 Z;
    public ua5 a;
    public o39 b;
    public rt3 c;
    public kb0 d;
    public s71 e;
    public vh1 f;
    public AnimatorSet h;
    public wh1 n;
    public final pb0 r;
    public FrameLayout s;
    public un4 w;
    public m8 x;
    public Drawable y;

    public wa5(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.r = new pb0((wjb) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    @Override
    public final void H(float f) {
        wh1 wh1Var = this.n;
        if (wh1Var == null) {
            return;
        }
        wh1Var.setProgress(f);
    }

    @Override
    public final void O(boolean z, boolean z2) {
        wh1 wh1Var = this.n;
        if (wh1Var == null) {
            return;
        }
        wh1Var.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gl.d3(new ph1(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, (byte) 4));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.G6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.m6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final String b0(int i) {
        return getMessagesController().V1((Long) this.L.get(i)).first_name;
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final void c0(ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(ad7.Y(this.currentAccount).i0(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa5.createView(android.content.Context):android.view.View");
    }

    public final void d0(boolean z, boolean z2) {
        if (this.f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (z2) {
            this.h = new AnimatorSet();
            if (z) {
                this.n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                vh1 vh1Var = this.f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(vh1Var, property, 0.0f), ObjectAnimator.ofFloat(this.n, property, 1.0f));
            } else {
                this.f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                vh1 vh1Var2 = this.f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(vh1Var2, property2, 1.0f), ObjectAnimator.ofFloat(this.n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new id4((byte) 6, this, z));
            this.h.start();
            return;
        }
        vh1 vh1Var3 = this.f;
        if (z) {
            vh1Var3.setAlpha(1.0f);
            this.f.setVisibility(4);
            this.n.setAlpha(1.0f);
            this.n.setVisibility(0);
            return;
        }
        vh1Var3.setAlpha(1.0f);
        this.f.setVisibility(0);
        this.n.setAlpha(0.0f);
        this.n.setVisibility(4);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == 2) {
            if (this.b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i3 = na7.q5;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    int childCount = this.b.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = this.b.getChildAt(i4);
                        if (childAt instanceof za5) {
                            ((za5) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i == kk7.R) {
            this.W = 0;
            this.N = false;
            un4 un4Var = this.w;
            if (un4Var != null) {
                un4Var.f(false, true);
            }
            rt3 rt3Var = this.c;
            if (rt3Var != null) {
                rt3Var.setEnabled(true);
            }
        } else if (i == kk7.Q) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            va5 va5Var = this.Z;
            if (va5Var != null) {
                va5Var.a(this, longValue);
            } else {
                kk7.f(this.currentAccount).k(kk7.s, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new mu1(bundle), true);
            }
            if (this.G != null || this.H != null || this.I != null) {
                getMessagesController().x(longValue, null, this.G, this.H, this.I, this.K, this.J, this.E, this.F, null);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.O.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.O.c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k7));
        arrayList.add(new blb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.l7));
        arrayList.add(new blb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.m7));
        arrayList.add(new blb(this.c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ni));
        arrayList.add(new blb(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Oi));
        arrayList.add(new blb(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
        arrayList.add(new blb(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
        arrayList.add(new blb(this.b, 4, new Class[]{za5.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.Qi));
        return arrayList;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.O.h(i, i2, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        rt3 rt3Var = this.c;
        if (rt3Var != null && rt3Var.e) {
            if (z) {
                rt3Var.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        wa5 wa5Var;
        kk7.f(this.currentAccount).b(this, 2);
        kk7.f(this.currentAccount).b(this, kk7.Q);
        kk7.f(this.currentAccount).b(this, kk7.R);
        wl5 wl5Var = new wl5(2, true, true);
        this.O = wl5Var;
        wl5Var.a = this;
        wl5Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.L = new ArrayList(longArray.length);
            int i = 0;
            while (i < longArray.length) {
                i = mue.c(i, 1, longArray[i], this.L);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            Long l = (Long) this.L.get(i2);
            if (getMessagesController().V1(l) == null) {
                arrayList.add(l);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            wa5Var = this;
            ad7.Y(this.currentAccount).a.c(new e45(wa5Var, arrayList2, arrayList, countDownLatch, (byte) 4));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                fa4.g(e, true);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                wa5Var.getMessagesController().Z3((TLRPC.User) obj, true, false);
            }
        } else {
            wa5Var = this;
        }
        wa5Var.X = wa5Var.getUserConfig().q0 * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, 2);
        kk7.f(this.currentAccount).n(this, kk7.Q);
        kk7.f(this.currentAccount).n(this, kk7.R);
        this.O.c();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        rt3 rt3Var = this.c;
        if (rt3Var != null) {
            rt3Var.o();
        }
        gl.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        rt3 rt3Var = this.c;
        if (rt3Var != null) {
            rt3Var.r();
        }
        this.O.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.O.j(i, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        rt3 rt3Var = this.c;
        if (rt3Var != null) {
            rt3Var.s();
        }
        ua5 ua5Var = this.a;
        if (ua5Var != null) {
            ua5Var.f();
        }
        this.O.k();
        gl.W2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            un4 un4Var = this.w;
            if (un4Var != null) {
                un4Var.updateColors();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            o39 o39Var = this.b;
            if (o39Var != null) {
                o39Var.x1();
                if (this.b.getFastScroll() != null) {
                    this.b.getFastScroll().invalidate();
                }
            }
            rt3 rt3Var = this.c;
            if (rt3Var != null && rt3Var.getEditText() != null) {
                this.c.getEditText().setCursorColor(getThemedColor(bkb.F6));
                this.c.getEditText().u(getThemedColor(bkb.j6), getThemedColor(bkb.k6), getThemedColor(bkb.o7));
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            mt3 mt3Var = this.c.a;
            mt3Var.requestFocus();
            gl.F3(mt3Var);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        wl5 wl5Var = this.O;
        if (wl5Var != null) {
            wl5Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            rt3 rt3Var = this.c;
            if (rt3Var != null) {
                rt3Var.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wl5 wl5Var = this.O;
        if (wl5Var != null && (str = wl5Var.f) != null) {
            bundle.putString("path", str);
        }
        rt3 rt3Var = this.c;
        if (rt3Var != null) {
            String obj = rt3Var.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void T() {
    }
}
