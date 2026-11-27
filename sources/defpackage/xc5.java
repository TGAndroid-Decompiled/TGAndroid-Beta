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
import org.telegram.ui.ActionBar.e;
public final class xc5 extends e implements fn7, yn5 {
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
    public zn5 O;
    public String P;
    public final int Q;
    public final boolean R;
    public b29 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public td4 Y;
    public wc5 Z;
    public vc5 a;
    public d79 b;
    public iu3 c;
    public mb0 d;
    public a81 e;
    public di1 f;
    public AnimatorSet h;
    public ei1 n;
    public final rb0 r;
    public FrameLayout s;
    public zp4 w;
    public n8 x;
    public Drawable y;

    public xc5(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.r = new rb0((vnb) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    @Override
    public final void H(float f) {
        ei1 ei1Var = this.n;
        if (ei1Var == null) {
            return;
        }
        ei1Var.setProgress(f);
    }

    @Override
    public final void O(boolean z, boolean z2) {
        ei1 ei1Var = this.n;
        if (ei1Var == null) {
            return;
        }
        ei1Var.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        hl.c3(new yh1(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, (byte) 4));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.H6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.n6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final String b0(int i) {
        return getMessagesController().X1((Long) this.L.get(i)).first_name;
    }

    public final void c0(ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(jf7.Y(this.currentAccount).i0(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc5.createView(android.content.Context):android.view.View");
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
                di1 di1Var = this.f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(di1Var, property, 0.0f), ObjectAnimator.ofFloat(this.n, property, 1.0f));
            } else {
                this.f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                di1 di1Var2 = this.f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(di1Var2, property2, 1.0f), ObjectAnimator.ofFloat(this.n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new gf4((byte) 6, this, z));
            this.h.start();
            return;
        }
        di1 di1Var3 = this.f;
        if (z) {
            di1Var3.setAlpha(1.0f);
            this.f.setVisibility(4);
            this.n.setAlpha(1.0f);
            this.n.setVisibility(0);
            return;
        }
        di1Var3.setAlpha(1.0f);
        this.f.setVisibility(0);
        this.n.setAlpha(0.0f);
        this.n.setVisibility(4);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == 2) {
            if (this.b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i3 = uc7.r5;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    int childCount = this.b.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = this.b.getChildAt(i4);
                        if (childAt instanceof bd5) {
                            ((bd5) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i == jn7.S) {
            this.W = 0;
            this.N = false;
            zp4 zp4Var = this.w;
            if (zp4Var != null) {
                zp4Var.f(false, true);
            }
            iu3 iu3Var = this.c;
            if (iu3Var != null) {
                iu3Var.setEnabled(true);
            }
        } else if (i == jn7.R) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            wc5 wc5Var = this.Z;
            if (wc5Var != null) {
                wc5Var.a(this, longValue);
            } else {
                jn7.f(this.currentAccount).k(jn7.s, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new zu1(bundle), true);
            }
            if (this.G != null || this.H != null || this.I != null) {
                getMessagesController().z(longValue, null, this.G, this.H, this.I, this.K, this.J, this.E, this.F, null);
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
    public final boolean f() {
        return true;
    }

    @Override
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l7));
        arrayList.add(new apb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.m7));
        arrayList.add(new apb(this.b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.n7));
        arrayList.add(new apb(this.c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Oi));
        arrayList.add(new apb(this.c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Pi));
        arrayList.add(new apb(this.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k6));
        arrayList.add(new apb(this.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l6));
        arrayList.add(new apb(this.b, 4, new Class[]{bd5.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.Ri));
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
        iu3 iu3Var = this.c;
        if (iu3Var != null && iu3Var.e) {
            if (z) {
                iu3Var.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        xc5 xc5Var;
        jn7.f(this.currentAccount).b(this, 2);
        jn7.f(this.currentAccount).b(this, jn7.R);
        jn7.f(this.currentAccount).b(this, jn7.S);
        zn5 zn5Var = new zn5(2, true, true);
        this.O = zn5Var;
        zn5Var.a = this;
        zn5Var.b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.L = new ArrayList(longArray.length);
            int i = 0;
            while (i < longArray.length) {
                i = dze.c(i, 1, longArray[i], this.L);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            Long l = (Long) this.L.get(i2);
            if (getMessagesController().X1(l) == null) {
                arrayList.add(l);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            xc5Var = this;
            jf7.Y(this.currentAccount).a.c(new g65(xc5Var, arrayList2, arrayList, countDownLatch, (byte) 4));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                xc5Var.getMessagesController().i4((TLRPC.User) obj, true, false);
            }
        } else {
            xc5Var = this;
        }
        xc5Var.X = xc5Var.getUserConfig().q0 * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, 2);
        jn7.f(this.currentAccount).n(this, jn7.R);
        jn7.f(this.currentAccount).n(this, jn7.S);
        this.O.c();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        iu3 iu3Var = this.c;
        if (iu3Var != null) {
            iu3Var.o();
        }
        hl.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        iu3 iu3Var = this.c;
        if (iu3Var != null) {
            iu3Var.r();
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
        iu3 iu3Var = this.c;
        if (iu3Var != null) {
            iu3Var.s();
        }
        vc5 vc5Var = this.a;
        if (vc5Var != null) {
            vc5Var.f();
        }
        this.O.k();
        hl.V2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            zp4 zp4Var = this.w;
            if (zp4Var != null) {
                zp4Var.updateColors();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            d79 d79Var = this.b;
            if (d79Var != null) {
                d79Var.y1();
                if (this.b.getFastScroll() != null) {
                    this.b.getFastScroll().invalidate();
                }
            }
            iu3 iu3Var = this.c;
            if (iu3Var != null && iu3Var.getEditText() != null) {
                this.c.getEditText().setCursorColor(getThemedColor(aob.G6));
                this.c.getEditText().u(getThemedColor(aob.k6), getThemedColor(aob.l6), getThemedColor(aob.p7));
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            du3 du3Var = this.c.a;
            du3Var.requestFocus();
            hl.E3(du3Var);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        zn5 zn5Var = this.O;
        if (zn5Var != null) {
            zn5Var.f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            iu3 iu3Var = this.c;
            if (iu3Var != null) {
                iu3Var.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        zn5 zn5Var = this.O;
        if (zn5Var != null && (str = zn5Var.f) != null) {
            bundle.putString("path", str);
        }
        iu3 iu3Var = this.c;
        if (iu3Var != null) {
            String obj = iu3Var.getText().toString();
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
