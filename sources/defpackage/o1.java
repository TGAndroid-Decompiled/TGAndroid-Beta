package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;
import java.util.WeakHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ContactsActivity;
public final class o1 implements Runnable {
    public final byte a;
    public final Object b;

    public o1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        String obj;
        long U;
        long j;
        float f;
        boolean z;
        int i;
        long j2;
        float hypot;
        Layout.Alignment alignment;
        float f2;
        float f3;
        boolean z2;
        float f4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        nn3[] nn3VarArr;
        int i2;
        int i3;
        int i4;
        Layout layout;
        float lineRight;
        int i5;
        boolean z7;
        int i6;
        int i7;
        boolean z8 = true;
        int i8 = 0;
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.b;
                m46 m46Var = s1Var.x;
                if (m46Var != null) {
                    CharacterStyle characterStyle = m46Var.i;
                    if (characterStyle instanceof g4c) {
                        obj = ((g4c) characterStyle).getURL();
                    } else if (characterStyle instanceof URLSpan) {
                        obj = ((URLSpan) characterStyle).getURL();
                    } else {
                        obj = characterStyle.toString();
                    }
                    final String str = obj;
                    try {
                        s1Var.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final StaticLayout staticLayout = s1Var.E;
                    final float f5 = s1Var.y;
                    if (s1Var.getContext() != null) {
                        final ClickableSpan clickableSpan = (ClickableSpan) s1Var.x.i;
                        fx0 h = de9.h(1, null, s1Var.getContext(), false);
                        h.P = str;
                        h.Q = false;
                        CharSequence[] charSequenceArr = {k96.M0(2131747624, null), k96.M0(2131751755, null)};
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i9) {
                                s1 s1Var2 = (s1) o1.this.b;
                                d dVar = s1Var2.I;
                                if (i9 == 0) {
                                    s1Var2.d(clickableSpan, staticLayout, f5);
                                } else if (i9 == 1) {
                                    String str2 = str;
                                    gl.g(str2);
                                    if (gl.C3()) {
                                        if (str2.startsWith("@")) {
                                            ir2.v(null, 2131743426, u21.b0(dVar), 2131623994, 36);
                                        } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                            ir2.v(null, 2131748729, u21.b0(dVar), 2131623994, 36);
                                        } else {
                                            ir2.v(null, 2131749170, u21.b0(dVar), 2131623994, 36);
                                        }
                                    }
                                }
                            }
                        };
                        h.M = charSequenceArr;
                        h.L = onClickListener;
                        h.I0 = new n1(this, (byte) 0);
                        h.show();
                    }
                    s1Var.x = null;
                    return;
                }
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                if (actionBarLayout.d == this) {
                    actionBarLayout.d = null;
                    actionBarLayout.g0(false, true, false);
                    return;
                }
                return;
            case 2:
                gb gbVar = (gb) this.b;
                ValueAnimator valueAnimator = gbVar.m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    gbVar.m.start();
                    return;
                }
                return;
            case 3:
                n10 n10Var = (n10) this.b;
                i20 i20Var = n10Var.E;
                if (MediaController.w().v0 != null) {
                    int i9 = i20Var.C2 + 1;
                    i20Var.C2 = i9;
                    if (i9 == 1) {
                        n10Var.w = true;
                        i20Var.A2 = 1;
                        if (MediaController.w().C()) {
                            i20Var.S0();
                        } else if (i20Var.A2 == 1) {
                            gl.r(i20Var.H2);
                            i20Var.E2 = 0L;
                        }
                        MediaController.w().l0(true, 4.0f);
                        gl.d3(this, 2000L);
                        return;
                    } else if (i9 == 2) {
                        MediaController.w().l0(true, 7.0f);
                        gl.d3(this, 2000L);
                        return;
                    } else {
                        MediaController.w().l0(true, 13.0f);
                        return;
                    }
                }
                return;
            case 4:
                i20 i20Var2 = (i20) this.b;
                lbc lbcVar = MediaController.w().j0;
                if (lbcVar == null) {
                    U = 0;
                } else {
                    U = lbcVar.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f6 = i20Var2.B2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - i20Var2.D2;
                    i20Var2.D2 = currentTimeMillis;
                    long j4 = currentTimeMillis - i20Var2.E2;
                    int i10 = i20Var2.C2;
                    if (i10 == 1) {
                        j = 3;
                    } else if (i10 == 2) {
                        j = 6;
                    } else {
                        j = 12;
                    }
                    float f7 = ((f6 * f) + ((float) ((j * j3) - j3))) / ((float) U);
                    if (f7 < 0.0f) {
                        f7 = 0.0f;
                    }
                    i20Var2.B2 = f7;
                    k27 k27Var = MediaController.w().v0;
                    if (k27Var != null && k27Var.I3()) {
                        if (!MediaController.w().C()) {
                            MediaController.w().v0.b0 = i20Var2.B2;
                        }
                        i20Var2.W0(k27Var, false);
                    }
                    if (i20Var2.A2 == 1 && i20Var2.C2 > 0 && MediaController.w().C()) {
                        if (j4 > 200 || i20Var2.B2 == 0.0f) {
                            i20Var2.E2 = currentTimeMillis;
                            MediaController.w().h0(MediaController.w().v0, f7);
                        }
                        if (i20Var2.C2 > 0 && i20Var2.B2 > 0.0f) {
                            gl.d3(i20Var2.H2, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i20Var2.D2 = System.currentTimeMillis();
                return;
            case 5:
                ?? dVar = new d(null);
                dVar.P = new vf6();
                dVar.Q = new ArrayList();
                dVar.y = (byte) 1;
                dVar.H = false;
                v60 v60Var = (v60) this.b;
                dVar.T = v60Var.Y();
                dVar.n = new l0(this, (byte) 24);
                v60Var.presentFragment((d) dVar);
                return;
            case 6:
                s56 s56Var = (s56) this.b;
                er3 er3Var = s56Var.c;
                n70 n70Var = s56Var.a;
                if (s56Var.E) {
                    if (s56Var.x) {
                        s56Var.x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        n70Var.d = currentAnimationTimeMillis;
                        n70Var.f = -1L;
                        n70Var.e = currentAnimationTimeMillis;
                        n70Var.g = 0.5f;
                    }
                    if ((n70Var.f > 0 && AnimationUtils.currentAnimationTimeMillis() > n70Var.f + n70Var.h) || !s56Var.e()) {
                        s56Var.E = false;
                        return;
                    }
                    if (s56Var.y) {
                        s56Var.y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        er3Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (n70Var.e != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a = n70Var.a(currentAnimationTimeMillis2);
                        n70Var.e = currentAnimationTimeMillis2;
                        s56Var.G.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - n70Var.e)) * ((a * 4.0f) + ((-4.0f) * a * a)) * n70Var.c));
                        WeakHashMap weakHashMap = jdc.a;
                        er3Var.postOnAnimation(this);
                        return;
                    }
                    wn4.j("Cannot compute scroll delta before calling start()");
                    return;
                }
                return;
            case 7:
                hf0 hf0Var = (hf0) this.b;
                ef0 ef0Var = hf0Var.b;
                if (ef0Var == null) {
                    ef0Var = new ef0(hf0Var, (byte) 0);
                    hf0Var.b = ef0Var;
                }
                int i11 = hf0Var.c + 1;
                hf0Var.c = i11;
                ef0Var.b = i11;
                hf0Var.postDelayed(ef0Var, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 8:
                for (Thread thread : dk0.w.keySet()) {
                    if (!thread.isAlive()) {
                        dk0.w.remove(thread);
                    }
                }
                if (!dk0.w.isEmpty()) {
                    gl.d3(((dk0) this.b).p, 5000L);
                    return;
                } else {
                    dk0.x = false;
                    return;
                }
            case 9:
                fx0 fx0Var = (fx0) this.b;
                if (fx0Var.H == this && !(z = fx0Var.J)) {
                    fx0Var.H = null;
                    if (!z) {
                        fx0Var.b.setVisibility(0);
                        if (!fx0Var.j0()) {
                            if (fx0Var.K) {
                                fx0Var.c.setLayerType(2, null);
                            }
                            boolean z9 = fx0Var.V0;
                            ViewGroup viewGroup = fx0Var.b;
                            if (z9) {
                                viewGroup.setTranslationX(gl.L(48.0f));
                                fx0Var.b.setAlpha(0.0f);
                                fx0Var.b.setTranslationY(0.0f);
                            } else {
                                viewGroup.setTranslationY(Math.max(0, Math.min(gl.n, fx0Var.P())) + gl.L(10.0f) + fx0Var.Q() + fx0Var.f);
                            }
                            fx0Var.e0();
                            fx0Var.B0 = (byte) 1;
                            ValueAnimator valueAnimator2 = fx0Var.C0;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fx0Var.D0, 1.0f);
                            fx0Var.C0 = ofFloat;
                            ofFloat.addUpdateListener(new sw0(fx0Var, (byte) 0));
                            fx0Var.A0 = new AnimatorSet();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(ObjectAnimator.ofFloat(fx0Var.b, View.TRANSLATION_X, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(fx0Var.b, View.ALPHA, 1.0f));
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fx0Var.b, View.TRANSLATION_Y, 0.0f);
                            ofFloat2.addUpdateListener(new sw0(fx0Var, (byte) 1));
                            arrayList.add(ofFloat2);
                            gc gcVar = fx0Var.Z;
                            pn pnVar = rn.d;
                            if (fx0Var.p0) {
                                i = fx0Var.q0;
                            } else {
                                i = 0;
                            }
                            arrayList.add(ObjectAnimator.ofInt(gcVar, pnVar, i));
                            arrayList.add(fx0Var.C0);
                            fx0Var.C(arrayList, true);
                            fx0Var.A0.playTogether(arrayList);
                            boolean z10 = fx0Var.V0;
                            AnimatorSet animatorSet = fx0Var.A0;
                            if (z10) {
                                animatorSet.setDuration(250L);
                                fx0Var.A0.setInterpolator(s33.f);
                            } else {
                                animatorSet.setDuration(fx0Var.k0);
                                fx0Var.A0.setInterpolator(fx0Var.l0);
                            }
                            AnimatorSet animatorSet2 = fx0Var.A0;
                            if (fx0Var.E) {
                                j2 = 0;
                            } else {
                                j2 = 20;
                            }
                            animatorSet2.setStartDelay(j2);
                            fx0Var.A0.setInterpolator(fx0Var.l0);
                            fx0Var.M0.d();
                            fx0Var.A0.addListener(new yw0(fx0Var, (byte) 0));
                            if (fx0Var.L0) {
                                kk7.e().k(98, 512);
                            }
                            fx0Var.A0.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                BubbleActivity bubbleActivity = (BubbleActivity) this.b;
                if (bubbleActivity.Z == this) {
                    if (gl.n2(true)) {
                        if (w01.a) {
                            fa4.b("lock app");
                        }
                        bubbleActivity.A();
                    } else if (w01.a) {
                        fa4.b("didn't pass lock check");
                    }
                    bubbleActivity.Z = null;
                    return;
                }
                return;
            case 11:
                da1 da1Var = (da1) this.b;
                CameraView cameraView = da1Var.d;
                if (cameraView != null && !da1Var.O && cameraView.getCameraSession() != null) {
                    da1Var.f.post(new nv0(this, (byte) 13));
                    return;
                }
                return;
            case 12:
                ra1 ra1Var = (ra1) this.b;
                ra1Var.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                ra1Var.f.performHapticFeedback(0);
                Runnable runnable = ra1Var.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                yb1 yb1Var = (yb1) this.b;
                cc1 cc1Var = yb1Var.f;
                if (cc1Var != null && yb1Var.e != null) {
                    float[] fArr = yb1Var.h;
                    float[] fArr2 = yb1Var.g;
                    float width = cc1Var.getWidth();
                    float height = cc1Var.getHeight();
                    float f8 = Float.MAX_VALUE;
                    float f9 = -3.4028235E38f;
                    for (int i12 = 0; i12 < 4; i12++) {
                        if (i12 % 2 == 0) {
                            f2 = 0.0f;
                        } else {
                            f2 = width;
                        }
                        if (i12 < 2) {
                            f3 = 0.0f;
                        } else {
                            f3 = height;
                        }
                        yb1Var.d(cc1Var, f2, f3);
                        f8 = Math.min(f8, fArr2[1]);
                        f9 = Math.max(f9, fArr2[1]);
                    }
                    float f10 = width / 2.0f;
                    float f11 = height / 2.0f;
                    float d = yb1Var.d(cc1Var, f10, f11);
                    float f12 = fArr2[1];
                    float d2 = yb1Var.d(cc1Var, width, f11) - d;
                    float f13 = fArr2[1] - f12;
                    if (width <= 0.0f) {
                        hypot = 1.0f;
                    } else {
                        hypot = ((float) Math.hypot(d2, f13)) / f10;
                    }
                    yb1.g(cc1Var, fArr);
                    tb1 tb1Var = yb1Var.e;
                    float degrees = (float) Math.toDegrees(Math.atan2(f13, d2));
                    TextPaint paint = cc1Var.getEditText().getPaint();
                    int currentTextColor = cc1Var.getEditText().getCurrentTextColor();
                    float f14 = fArr[0];
                    float f15 = fArr[1];
                    float f16 = fArr[2];
                    if (cc1Var.getEditText().getLayout() != null) {
                        alignment = cc1Var.getEditText().getLayout().getAlignment();
                    } else {
                        alignment = null;
                    }
                    tb1Var.d(d, f12, f8, f9, degrees, hypot, paint, currentTextColor, f14, f15, f16, alignment);
                    ViewParent parent = cc1Var.getParent();
                    tb1 tb1Var2 = yb1Var.e;
                    if (parent == null) {
                        tb1Var2.e(null, null);
                    } else {
                        tb1Var2.e(cc1Var.x(-1), cc1Var.x(1));
                    }
                    yb1Var.e.postOnAnimation(this);
                    return;
                }
                return;
            case 14:
                cc1 cc1Var2 = (cc1) this.b;
                if (cc1Var2.isAttachedToWindow()) {
                    cc1Var2.z();
                    cc1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 15:
                c32 c32Var = (c32) this.b;
                if (c32Var.T) {
                    c32Var.O.clear();
                    c32Var.Q.clear();
                    c32Var.R.clear();
                    c32Var.f();
                    return;
                }
                return;
            case 16:
                l52 l52Var = (l52) this.b;
                m52 m52Var = l52Var.Q;
                if (m52Var.K != null && !m52Var.L) {
                    int computeVerticalScrollOffset = m52Var.r.computeVerticalScrollOffset();
                    if (m52Var.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (l52Var.e() - l52Var.r) + l52Var.n) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    float max = Math.max(0.0f, (m52Var.F - Math.max(0, computeVerticalScrollOffset - m52Var.getListTopPadding())) - gl.L(52.0f));
                    float max2 = Math.max(0.0f, ((m52Var.r.getMeasuredHeight() - (m52Var.F - computeVerticalScrollOffset)) - m52Var.getListTopPadding()) - gl.L(84.0f));
                    float L = gl.L(32.0f);
                    if (max < L && computeVerticalScrollOffset > m52Var.getListTopPadding()) {
                        f4 = (-(1.0f - (max / L))) * gl.L(6.0f);
                    } else if (max2 < L) {
                        f4 = gl.L(6.0f) * (1.0f - (max2 / L));
                    } else {
                        f4 = 0.0f;
                    }
                    int i13 = (int) f4;
                    if (Math.abs(i13) > 0 && m52Var.r.canScrollVertically(i13) && (f4 <= 0.0f || !z2)) {
                        m52Var.F += f4;
                        m52Var.r.scrollBy(0, i13);
                        l52Var.invalidate();
                    }
                    l52Var.M = true;
                    l52Var.postDelayed(this, 15L);
                    return;
                }
                return;
            case 17:
                k62 k62Var = (k62) this.b;
                o1 o1Var = k62Var.V0;
                le8 le8Var = k62Var.h1;
                if (le8Var != null) {
                    EditTextBoldCursor editField = le8Var.getEditField();
                    if (!k62Var.I && editField != null && k62Var.H && !k62Var.f1 && !gl.D && !gl.E && gl.O1()) {
                        editField.requestFocus();
                        gl.E3(editField);
                        gl.r(o1Var);
                        gl.d3(o1Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                try {
                    wp2.n((wp2) this.b);
                    return;
                } catch (IllegalStateException e) {
                    if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw e;
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 19:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.b.Z();
                contactsActivity.g0 = false;
                return;
            case 20:
                ze3 ze3Var = (ze3) this.b;
                ze3Var.o0.onDismiss(ze3Var.w0);
                return;
            case 21:
                gl.r(this);
                jm3 jm3Var = (jm3) this.b;
                if (jm3Var.r == 1 && jm3Var.s != null) {
                    Editable text = jm3Var.f.a.F0.getText();
                    if (text != null && text.toString().trim().length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    if (jm3Var.s.getRightMode() == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    long j5 = jm3Var.r0;
                    if (uptimeMillis2 - j5 >= 300) {
                        if (!z4) {
                            if (z3 && uptimeMillis2 - jm3Var.U > 1200 && uptimeMillis2 - jm3Var.q0 > 1200) {
                                jm3Var.s.setRightMode(2);
                                jm3Var.r0 = uptimeMillis2;
                            }
                        } else if (!z3 || jm3Var.U > j5) {
                            jm3Var.s.setRightMode(0);
                            jm3Var.r0 = uptimeMillis2;
                        }
                    }
                    gl.d3(this, 50L);
                    return;
                }
                return;
            case 22:
                mm3 mm3Var = (mm3) this.b;
                mm3Var.j1 = false;
                if (mm3Var.isAttachedToWindow() && mm3Var.getVisibility() == 0) {
                    mm3Var.invalidate();
                    mm3Var.j1 = true;
                    mm3Var.postOnAnimation(this);
                    return;
                }
                return;
            case 23:
                qn3 qn3Var = (qn3) this.b;
                TextView textView = qn3Var.a;
                Editable editableText = textView.getEditableText();
                if (editableText == null) {
                    qn3Var.g = false;
                    return;
                }
                long uptimeMillis3 = SystemClock.uptimeMillis();
                on3[] on3VarArr = (on3[]) editableText.getSpans(0, editableText.length(), on3.class);
                int length = on3VarArr.length;
                int i14 = 0;
                boolean z11 = false;
                while (true) {
                    int i15 = 33;
                    if (i14 < length) {
                        on3 on3Var = on3VarArr[i14];
                        int spanStart = editableText.getSpanStart(on3Var);
                        int spanEnd = editableText.getSpanEnd(on3Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            i6 = i14;
                            z7 = z8;
                            i7 = length;
                            if (uptimeMillis3 < (Math.max(0, on3Var.c - 1) * 22) + on3Var.a + 320) {
                                editableText.setSpan(on3Var, spanStart, spanEnd, 33);
                                z11 = z7;
                                i14 = i6 + 1;
                                z8 = z7;
                                length = i7;
                            }
                        } else {
                            z7 = z8;
                            i6 = i14;
                            i7 = length;
                        }
                        editableText.removeSpan(on3Var);
                        i14 = i6 + 1;
                        z8 = z7;
                        length = i7;
                    } else {
                        boolean z12 = z8;
                        float f17 = 0.5f;
                        nn3[] nn3VarArr2 = (nn3[]) editableText.getSpans(0, editableText.length(), nn3.class);
                        int length2 = nn3VarArr2.length;
                        int i16 = 0;
                        while (i16 < length2) {
                            nn3 nn3Var = nn3VarArr2[i16];
                            int spanStart2 = editableText.getSpanStart(nn3Var);
                            int spanEnd2 = editableText.getSpanEnd(nn3Var);
                            if (spanStart2 >= 0 && spanEnd2 > spanStart2) {
                                i3 = i8;
                                if (ls6.w((float) (uptimeMillis3 - nn3Var.a), 750.0f, 1.0f, 0.0f) >= 1.0f) {
                                    editableText.removeSpan(nn3Var);
                                    nn3VarArr = nn3VarArr2;
                                    i2 = length2;
                                } else {
                                    long j6 = nn3Var.b;
                                    if (j6 <= 0) {
                                        j6 = nn3Var.a;
                                    }
                                    if (uptimeMillis3 >= j6 - 16) {
                                        if (!nn3Var.e) {
                                            nn3Var.e = z12;
                                            bm3 bm3Var = qn3Var.h;
                                            if (bm3Var != null) {
                                                jm3 jm3Var2 = bm3Var.b;
                                                float[] fArr3 = jm3Var2.D0;
                                                lm lmVar = jm3Var2.Y;
                                                if (lmVar != null && lmVar.c >= 0.2f && jm3Var2.s(fArr3) && (layout = jm3Var2.f.a.F0.getLayout()) != null && spanEnd2 <= layout.getText().length()) {
                                                    int lineForOffset = layout.getLineForOffset(spanStart2);
                                                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart2);
                                                    if (layout.getLineForOffset(spanEnd2) == lineForOffset) {
                                                        lineRight = layout.getPrimaryHorizontal(spanEnd2);
                                                    } else {
                                                        lineRight = layout.getLineRight(lineForOffset);
                                                    }
                                                    nn3VarArr = nn3VarArr2;
                                                    om3 om3Var = jm3Var2.x;
                                                    float f18 = primaryHorizontal + fArr3[i3];
                                                    i2 = length2;
                                                    float lineTop = layout.getLineTop(lineForOffset) + fArr3[1];
                                                    float max3 = Math.max(primaryHorizontal, lineRight) + fArr3[i3];
                                                    float lineBottom = layout.getLineBottom(lineForOffset) + fArr3[1];
                                                    int i17 = ((int) (jm3Var2.Q * 2.5f)) + 2;
                                                    Random random = om3Var.t;
                                                    if (random.nextFloat() < f17) {
                                                        i5 = 1;
                                                    } else {
                                                        i5 = i3;
                                                    }
                                                    int i18 = i17 + i5;
                                                    int i19 = i3;
                                                    while (i19 < i18) {
                                                        om3 om3Var2 = om3Var;
                                                        float max4 = (Math.max(1.0f, max3 - f18) * random.nextFloat()) + f18;
                                                        float A = tb4.A(lineBottom, lineTop, ug8.e(random, 0.85f, 0.15f), lineTop);
                                                        float L2 = gl.L((random.nextFloat() * 7.0f) + 3.0f);
                                                        double nextFloat = ((random.nextFloat() - f17) * 2.2f) - 1.5707963267948966d;
                                                        om3Var2.j(max4, A, ((float) Math.cos(nextFloat)) * L2, ((float) Math.sin(nextFloat)) * L2, ug8.e(random, 0.55f, 0.45f), ug8.e(random, f17, 0.55f));
                                                        i19++;
                                                        lineTop = lineTop;
                                                        om3Var = om3Var2;
                                                        i18 = i18;
                                                        f17 = 0.5f;
                                                    }
                                                } else {
                                                    nn3VarArr = nn3VarArr2;
                                                    i2 = length2;
                                                }
                                                i4 = 33;
                                                editableText.setSpan(nn3Var, spanStart2, spanEnd2, i4);
                                            }
                                        }
                                        nn3VarArr = nn3VarArr2;
                                        i2 = length2;
                                        i4 = i15;
                                        editableText.setSpan(nn3Var, spanStart2, spanEnd2, i4);
                                    } else {
                                        nn3VarArr = nn3VarArr2;
                                        i2 = length2;
                                    }
                                    z11 = true;
                                }
                            } else {
                                nn3VarArr = nn3VarArr2;
                                i2 = length2;
                                i3 = i8;
                                editableText.removeSpan(nn3Var);
                            }
                            i16++;
                            i8 = i3;
                            nn3VarArr2 = nn3VarArr;
                            length2 = i2;
                            i15 = 33;
                            f17 = 0.5f;
                            z12 = true;
                        }
                        mn3[] mn3VarArr = (mn3[]) editableText.getSpans(i8, editableText.length(), mn3.class);
                        for (mn3 mn3Var : mn3VarArr) {
                            if (mn3Var.a != 0) {
                                int spanStart3 = editableText.getSpanStart(mn3Var);
                                int spanEnd3 = editableText.getSpanEnd(mn3Var);
                                if (spanStart3 >= 0 && spanEnd3 > spanStart3) {
                                    long j7 = mn3Var.a;
                                    if (j7 == 0 || uptimeMillis3 < j7 + 300) {
                                        editableText.setSpan(mn3Var, spanStart3, spanEnd3, 33);
                                        z11 = true;
                                    }
                                }
                                editableText.removeSpan(mn3Var);
                            }
                        }
                        pn3 pn3Var = qn3Var.j;
                        if (pn3Var != null && qn3Var.m > 0.0f && editableText.getSpanStart(pn3Var) >= 0) {
                            z5 = false;
                            editableText.setSpan(qn3Var.j, 0, editableText.length(), 18);
                            z6 = true;
                        } else {
                            z5 = false;
                            z6 = z11;
                        }
                        if (z6) {
                            textView.postOnAnimation(this);
                            return;
                        } else {
                            qn3Var.g = z5;
                            return;
                        }
                    }
                }
                break;
            case 24:
                if (!((eo3) this.b).a.isEmpty()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i20 = 0;
                    while (i20 < ((eo3) this.b).a.size()) {
                        do3 do3Var = (do3) ((eo3) this.b).a.get(i20);
                        if (do3Var.getLastTaskTime() < elapsedRealtime - 30000) {
                            do3Var.recycle();
                            ((eo3) this.b).a.remove(i20);
                            ((eo3) this.b).e--;
                            i20--;
                        }
                        i20++;
                    }
                }
                if (((eo3) this.b).a.isEmpty() && ((eo3) this.b).c.isEmpty()) {
                    ((eo3) this.b).h = false;
                    return;
                }
                Utilities.e.d(this, 30000L);
                ((eo3) this.b).h = true;
                return;
            case 25:
                up3 up3Var = (up3) this.b;
                up3Var.J.clear();
                up3Var.getNotificationCenter().k(307, new Object[0]);
                return;
            case 26:
                xm xmVar = (xm) this.b;
                xmVar.a(true);
                xmVar.invalidateSelf();
                return;
            case 27:
                er3 er3Var2 = (er3) this.b;
                er3Var2.x = null;
                er3Var2.drawableStateChanged();
                return;
            case 28:
                rt3 rt3Var = (rt3) this.b;
                o1 o1Var2 = rt3Var.Q;
                mt3 mt3Var = rt3Var.a;
                if (!rt3Var.E && mt3Var != null && rt3Var.O && !rt3Var.w && !gl.D && !gl.E && gl.O1()) {
                    mt3Var.requestFocus();
                    gl.E3(mt3Var);
                    gl.r(o1Var2);
                    gl.d3(o1Var2, 100L);
                    return;
                }
                return;
            default:
                xf4 xf4Var = (xf4) ((i8) this.b).d;
                if (xf4Var.a && !((ArrayList) xf4Var.c).isEmpty() && !((AnimatorSet) xf4Var.d).isRunning()) {
                    try {
                        ((AnimatorSet) xf4Var.d).start();
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
        }
    }
}
