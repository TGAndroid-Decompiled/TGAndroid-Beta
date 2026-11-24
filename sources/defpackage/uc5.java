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
public final class uc5 extends d implements jm7, vn5 {
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
    public wn5 O;
    public String P;
    public final int Q;
    public final boolean R;
    public p09 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public wd4 Y;
    public tc5 Z;
    public sc5 a;
    public r59 b;
    public cv3 c;
    public kc0 d;
    public a91 e;
    public cj1 f;
    public AnimatorSet h;
    public dj1 n;
    public final pc0 r;
    public FrameLayout s;
    public wp4 w;
    public m8 x;
    public Drawable y;

    public uc5(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.r = new pc0((ylb) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    @Override
    public final void H(float f) {
        dj1 dj1Var = this.n;
        if (dj1Var == null) {
            return;
        }
        dj1Var.setProgress(f);
    }

    @Override
    public final void O(boolean z, boolean z2) {
        dj1 dj1Var = this.n;
        if (dj1Var == null) {
            return;
        }
        dj1Var.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gm.c3(new xi1(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, (byte) 4));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.G6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.m6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final String c0(int i) {
        return getMessagesController().W1((Long) this.L.get(i)).first_name;
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc5.createView(android.content.Context):android.view.View");
    }

    public final void d0(ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(cf7.Y(this.currentAccount).i0(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == 2) {
            if (this.b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i3 = oc7.s5;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    int childCount = this.b.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = this.b.getChildAt(i4);
                        if (childAt instanceof xc5) {
                            ((xc5) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i == nm7.S) {
            this.W = 0;
            this.N = false;
            wp4 wp4Var = this.w;
            if (wp4Var != null) {
                wp4Var.f(false, true);
            }
            cv3 cv3Var = this.c;
            if (cv3Var != null) {
                cv3Var.setEnabled(true);
            }
        } else if (i == nm7.R) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            tc5 tc5Var = this.Z;
            if (tc5Var != null) {
                tc5Var.a(this, longValue);
            } else {
                nm7.f(this.currentAccount).k(nm7.s, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new yv1(bundle), true);
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

    public final void e0(boolean z, boolean z2) {
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
                cj1 cj1Var = this.f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(cj1Var, property, 0.0f), ObjectAnimator.ofFloat(this.n, property, 1.0f));
            } else {
                this.f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                cj1 cj1Var2 = this.f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(cj1Var2, property2, 1.0f), ObjectAnimator.ofFloat(this.n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new jf4((byte) 6, this, z));
            this.h.start();
            return;
        }
        cj1 cj1Var3 = this.f;
        if (z) {
            cj1Var3.setAlpha(1.0f);
            this.f.setVisibility(4);
            this.n.setAlpha(1.0f);
            this.n.setVisibility(0);
            return;
        }
        cj1Var3.setAlpha(1.0f);
        this.f.setVisibility(0);
        this.n.setAlpha(0.0f);
        this.n.setVisibility(4);
    }

    @Override
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k7));
        arrayList.add(new cnb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.l7));
        arrayList.add(new cnb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.m7));
        arrayList.add(new cnb(this.c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ni));
        arrayList.add(new cnb(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Oi));
        arrayList.add(new cnb(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
        arrayList.add(new cnb(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
        arrayList.add(new cnb(this.b, 4, new Class[]{xc5.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.Qi));
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
        cv3 cv3Var = this.c;
        if (cv3Var != null && cv3Var.e) {
            if (z) {
                cv3Var.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        uc5 uc5Var;
        nm7.f(this.currentAccount).b(this, 2);
        nm7.f(this.currentAccount).b(this, nm7.R);
        nm7.f(this.currentAccount).b(this, nm7.S);
        wn5 wn5Var = new wn5(2, true, true);
        this.O = wn5Var;
        wn5Var.a = this;
        wn5Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.L = new ArrayList(longArray.length);
            int i = 0;
            while (i < longArray.length) {
                i = mle.c(i, 1, longArray[i], this.L);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            Long l = (Long) this.L.get(i2);
            if (getMessagesController().W1(l) == null) {
                arrayList.add(l);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            uc5Var = this;
            cf7.Y(this.currentAccount).a.c(new d65(uc5Var, arrayList2, arrayList, countDownLatch, (byte) 4));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                fc4.g(e, true);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                uc5Var.getMessagesController().c4((TLRPC.User) obj, true, false);
            }
        } else {
            uc5Var = this;
        }
        uc5Var.X = uc5Var.getUserConfig().q0 * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, 2);
        nm7.f(this.currentAccount).n(this, nm7.R);
        nm7.f(this.currentAccount).n(this, nm7.S);
        this.O.c();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        cv3 cv3Var = this.c;
        if (cv3Var != null) {
            cv3Var.o();
        }
        gm.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        cv3 cv3Var = this.c;
        if (cv3Var != null) {
            cv3Var.r();
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
        cv3 cv3Var = this.c;
        if (cv3Var != null) {
            cv3Var.s();
        }
        sc5 sc5Var = this.a;
        if (sc5Var != null) {
            sc5Var.f();
        }
        this.O.k();
        gm.V2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            wp4 wp4Var = this.w;
            if (wp4Var != null) {
                wp4Var.updateColors();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            r59 r59Var = this.b;
            if (r59Var != null) {
                r59Var.x1();
                if (this.b.getFastScroll() != null) {
                    this.b.getFastScroll().invalidate();
                }
            }
            cv3 cv3Var = this.c;
            if (cv3Var != null && cv3Var.getEditText() != null) {
                this.c.getEditText().setCursorColor(getThemedColor(cmb.F6));
                this.c.getEditText().u(getThemedColor(cmb.j6), getThemedColor(cmb.k6), getThemedColor(cmb.o7));
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            wu3 wu3Var = this.c.a;
            wu3Var.requestFocus();
            gm.E3(wu3Var);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        wn5 wn5Var = this.O;
        if (wn5Var != null) {
            wn5Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            cv3 cv3Var = this.c;
            if (cv3Var != null) {
                cv3Var.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wn5 wn5Var = this.O;
        if (wn5Var != null && (str = wn5Var.f) != null) {
            bundle.putString("path", str);
        }
        cv3 cv3Var = this.c;
        if (cv3Var != null) {
            String obj = cv3Var.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void T() {
    }
}
