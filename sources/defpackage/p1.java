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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ContactsActivity;
public final class p1 implements Runnable {
    public final byte a;
    public final Object b;

    public p1(Object obj, byte b) {
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
        eo3[] eo3VarArr;
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
                t1 t1Var = (t1) this.b;
                q66 q66Var = t1Var.x;
                if (q66Var != null) {
                    CharacterStyle characterStyle = q66Var.i;
                    if (characterStyle instanceof f8c) {
                        obj = ((f8c) characterStyle).getURL();
                    } else if (characterStyle instanceof URLSpan) {
                        obj = ((URLSpan) characterStyle).getURL();
                    } else {
                        obj = characterStyle.toString();
                    }
                    final String str = obj;
                    try {
                        t1Var.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final StaticLayout staticLayout = t1Var.E;
                    final float f5 = t1Var.y;
                    if (t1Var.getContext() != null) {
                        final ClickableSpan clickableSpan = (ClickableSpan) t1Var.x.i;
                        nx0 h = uh9.h(1, null, t1Var.getContext(), false);
                        h.P = str;
                        h.Q = false;
                        CharSequence[] charSequenceArr = {ob6.M0(2131747544, null), ob6.M0(2131751732, null)};
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i9) {
                                t1 t1Var2 = (t1) p1.this.b;
                                e eVar = t1Var2.I;
                                if (i9 == 0) {
                                    t1Var2.d(clickableSpan, staticLayout, f5);
                                } else if (i9 == 1) {
                                    String str2 = str;
                                    hl.g(str2);
                                    if (hl.C3()) {
                                        if (str2.startsWith("@")) {
                                            bs2.v(null, 2131743320, d31.b0(eVar), 2131623994, 36);
                                        } else if (!str2.startsWith("#") && !str2.startsWith("$")) {
                                            bs2.v(null, 2131748675, d31.b0(eVar), 2131623994, 36);
                                        } else {
                                            bs2.v(null, 2131749116, d31.b0(eVar), 2131623994, 36);
                                        }
                                    }
                                }
                            }
                        };
                        h.M = charSequenceArr;
                        h.L = onClickListener;
                        h.I0 = new o1(this, (byte) 0);
                        h.show();
                    }
                    t1Var.x = null;
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
                hb hbVar = (hb) this.b;
                ValueAnimator valueAnimator = hbVar.m;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    hbVar.m.start();
                    return;
                }
                return;
            case 3:
                o10 o10Var = (o10) this.b;
                j20 j20Var = o10Var.E;
                if (MediaController.z().v0 != null) {
                    int i9 = j20Var.C2 + 1;
                    j20Var.C2 = i9;
                    if (i9 == 1) {
                        o10Var.w = true;
                        j20Var.A2 = 1;
                        if (MediaController.z().G()) {
                            j20Var.T0();
                        } else if (j20Var.A2 == 1) {
                            hl.r(j20Var.H2);
                            j20Var.E2 = 0L;
                        }
                        MediaController.z().o0(true, 4.0f);
                        hl.d3(this, 2000L);
                        return;
                    } else if (i9 == 2) {
                        MediaController.z().o0(true, 7.0f);
                        hl.d3(this, 2000L);
                        return;
                    } else {
                        MediaController.z().o0(true, 13.0f);
                        return;
                    }
                }
                return;
            case 4:
                j20 j20Var2 = (j20) this.b;
                kfc kfcVar = MediaController.z().j0;
                if (kfcVar == null) {
                    U = 0;
                } else {
                    U = kfcVar.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f6 = j20Var2.B2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - j20Var2.D2;
                    j20Var2.D2 = currentTimeMillis;
                    long j4 = currentTimeMillis - j20Var2.E2;
                    int i10 = j20Var2.C2;
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
                    j20Var2.B2 = f7;
                    r47 r47Var = MediaController.z().v0;
                    if (r47Var != null && r47Var.I3()) {
                        if (!MediaController.z().G()) {
                            MediaController.z().v0.b0 = j20Var2.B2;
                        }
                        j20Var2.X0(r47Var, false);
                    }
                    if (j20Var2.A2 == 1 && j20Var2.C2 > 0 && MediaController.z().G()) {
                        if (j4 > 200 || j20Var2.B2 == 0.0f) {
                            j20Var2.E2 = currentTimeMillis;
                            MediaController.z().k0(MediaController.z().v0, f7);
                        }
                        if (j20Var2.C2 > 0 && j20Var2.B2 > 0.0f) {
                            hl.d3(j20Var2.H2, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                j20Var2.D2 = System.currentTimeMillis();
                return;
            case 5:
                ?? eVar = new e(null);
                eVar.P = new zh6();
                eVar.Q = new ArrayList();
                eVar.y = (byte) 1;
                eVar.H = false;
                x60 x60Var = (x60) this.b;
                eVar.T = x60Var.Y();
                eVar.n = new m0(this, (byte) 24);
                x60Var.presentFragment((e) eVar);
                return;
            case 6:
                w76 w76Var = (w76) this.b;
                vr3 vr3Var = w76Var.c;
                p70 p70Var = w76Var.a;
                if (w76Var.E) {
                    if (w76Var.x) {
                        w76Var.x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        p70Var.d = currentAnimationTimeMillis;
                        p70Var.f = -1L;
                        p70Var.e = currentAnimationTimeMillis;
                        p70Var.g = 0.5f;
                    }
                    if ((p70Var.f > 0 && AnimationUtils.currentAnimationTimeMillis() > p70Var.f + p70Var.h) || !w76Var.e()) {
                        w76Var.E = false;
                        return;
                    }
                    if (w76Var.y) {
                        w76Var.y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        vr3Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (p70Var.e != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a = p70Var.a(currentAnimationTimeMillis2);
                        p70Var.e = currentAnimationTimeMillis2;
                        w76Var.G.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - p70Var.e)) * ((a * 4.0f) + ((-4.0f) * a * a)) * p70Var.c));
                        WeakHashMap weakHashMap = ihc.a;
                        vr3Var.postOnAnimation(this);
                        return;
                    }
                    xi4.l("Cannot compute scroll delta before calling start()");
                    return;
                }
                return;
            case 7:
                jf0 jf0Var = (jf0) this.b;
                gf0 gf0Var = jf0Var.b;
                if (gf0Var == null) {
                    gf0Var = new gf0(jf0Var, (byte) 0);
                    jf0Var.b = gf0Var;
                }
                int i11 = jf0Var.c + 1;
                jf0Var.c = i11;
                gf0Var.b = i11;
                jf0Var.postDelayed(gf0Var, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                return;
            case 8:
                for (Thread thread : ek0.w.keySet()) {
                    if (!thread.isAlive()) {
                        ek0.w.remove(thread);
                    }
                }
                if (!ek0.w.isEmpty()) {
                    hl.d3(((ek0) this.b).p, 5000L);
                    return;
                } else {
                    ek0.x = false;
                    return;
                }
            case 9:
                nx0 nx0Var = (nx0) this.b;
                if (nx0Var.H == this && !(z = nx0Var.J)) {
                    nx0Var.H = null;
                    if (!z) {
                        nx0Var.b.setVisibility(0);
                        if (!nx0Var.j0()) {
                            if (nx0Var.K) {
                                nx0Var.c.setLayerType(2, null);
                            }
                            boolean z9 = nx0Var.V0;
                            ViewGroup viewGroup = nx0Var.b;
                            if (z9) {
                                viewGroup.setTranslationX(hl.L(48.0f));
                                nx0Var.b.setAlpha(0.0f);
                                nx0Var.b.setTranslationY(0.0f);
                            } else {
                                viewGroup.setTranslationY(Math.max(0, Math.min(hl.n, nx0Var.O())) + hl.L(10.0f) + nx0Var.P() + nx0Var.f);
                            }
                            nx0Var.e0();
                            nx0Var.B0 = (byte) 1;
                            ValueAnimator valueAnimator2 = nx0Var.C0;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(nx0Var.D0, 1.0f);
                            nx0Var.C0 = ofFloat;
                            ofFloat.addUpdateListener(new bx0(nx0Var, (byte) 0));
                            nx0Var.A0 = new AnimatorSet();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(ObjectAnimator.ofFloat(nx0Var.b, View.TRANSLATION_X, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(nx0Var.b, View.ALPHA, 1.0f));
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(nx0Var.b, View.TRANSLATION_Y, 0.0f);
                            ofFloat2.addUpdateListener(new bx0(nx0Var, (byte) 1));
                            arrayList.add(ofFloat2);
                            hc hcVar = nx0Var.Z;
                            qn qnVar = sn.d;
                            if (nx0Var.p0) {
                                i = nx0Var.q0;
                            } else {
                                i = 0;
                            }
                            arrayList.add(ObjectAnimator.ofInt(hcVar, qnVar, i));
                            arrayList.add(nx0Var.C0);
                            nx0Var.C(arrayList, true);
                            nx0Var.A0.playTogether(arrayList);
                            boolean z10 = nx0Var.V0;
                            AnimatorSet animatorSet = nx0Var.A0;
                            if (z10) {
                                animatorSet.setDuration(250L);
                                nx0Var.A0.setInterpolator(k43.f);
                            } else {
                                animatorSet.setDuration(nx0Var.k0);
                                nx0Var.A0.setInterpolator(nx0Var.l0);
                            }
                            AnimatorSet animatorSet2 = nx0Var.A0;
                            if (nx0Var.E) {
                                j2 = 0;
                            } else {
                                j2 = 20;
                            }
                            animatorSet2.setStartDelay(j2);
                            nx0Var.A0.setInterpolator(nx0Var.l0);
                            nx0Var.M0.d();
                            nx0Var.A0.addListener(new gx0(nx0Var, (byte) 0));
                            if (nx0Var.L0) {
                                jn7.e().k(99, 512);
                            }
                            nx0Var.A0.start();
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
                    if (hl.n2(true)) {
                        if (f11.a) {
                            cc4.b("lock app");
                        }
                        bubbleActivity.A();
                    } else if (f11.a) {
                        cc4.b("didn't pass lock check");
                    }
                    bubbleActivity.Z = null;
                    return;
                }
                return;
            case 11:
                la1 la1Var = (la1) this.b;
                CameraView cameraView = la1Var.d;
                if (cameraView != null && !la1Var.O && cameraView.getCameraSession() != null) {
                    la1Var.f.post(new fv0(this, (byte) 16));
                    return;
                }
                return;
            case 12:
                za1 za1Var = (za1) this.b;
                za1Var.b(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                za1Var.f.performHapticFeedback(0);
                Runnable runnable = za1Var.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                gc1 gc1Var = (gc1) this.b;
                kc1 kc1Var = gc1Var.f;
                if (kc1Var != null && gc1Var.e != null) {
                    float[] fArr = gc1Var.h;
                    float[] fArr2 = gc1Var.g;
                    float width = kc1Var.getWidth();
                    float height = kc1Var.getHeight();
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
                        gc1Var.d(kc1Var, f2, f3);
                        f8 = Math.min(f8, fArr2[1]);
                        f9 = Math.max(f9, fArr2[1]);
                    }
                    float f10 = width / 2.0f;
                    float f11 = height / 2.0f;
                    float d = gc1Var.d(kc1Var, f10, f11);
                    float f12 = fArr2[1];
                    float d2 = gc1Var.d(kc1Var, width, f11) - d;
                    float f13 = fArr2[1] - f12;
                    if (width <= 0.0f) {
                        hypot = 1.0f;
                    } else {
                        hypot = ((float) Math.hypot(d2, f13)) / f10;
                    }
                    gc1.g(kc1Var, fArr);
                    bc1 bc1Var = gc1Var.e;
                    float degrees = (float) Math.toDegrees(Math.atan2(f13, d2));
                    TextPaint paint = kc1Var.getEditText().getPaint();
                    int currentTextColor = kc1Var.getEditText().getCurrentTextColor();
                    float f14 = fArr[0];
                    float f15 = fArr[1];
                    float f16 = fArr[2];
                    if (kc1Var.getEditText().getLayout() != null) {
                        alignment = kc1Var.getEditText().getLayout().getAlignment();
                    } else {
                        alignment = null;
                    }
                    bc1Var.d(d, f12, f8, f9, degrees, hypot, paint, currentTextColor, f14, f15, f16, alignment);
                    ViewParent parent = kc1Var.getParent();
                    bc1 bc1Var2 = gc1Var.e;
                    if (parent == null) {
                        bc1Var2.e(null, null);
                    } else {
                        bc1Var2.e(kc1Var.x(-1), kc1Var.x(1));
                    }
                    gc1Var.e.postOnAnimation(this);
                    return;
                }
                return;
            case 14:
                kc1 kc1Var2 = (kc1) this.b;
                if (kc1Var2.isAttachedToWindow()) {
                    kc1Var2.z();
                    kc1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 15:
                t32 t32Var = (t32) this.b;
                if (t32Var.T) {
                    t32Var.O.clear();
                    t32Var.Q.clear();
                    t32Var.R.clear();
                    t32Var.f();
                    return;
                }
                return;
            case 16:
                b62 b62Var = (b62) this.b;
                c62 c62Var = b62Var.Q;
                if (c62Var.K != null && !c62Var.L) {
                    int computeVerticalScrollOffset = c62Var.r.computeVerticalScrollOffset();
                    if (c62Var.r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (b62Var.e() - b62Var.r) + b62Var.n) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    float max = Math.max(0.0f, (c62Var.F - Math.max(0, computeVerticalScrollOffset - c62Var.getListTopPadding())) - hl.L(52.0f));
                    float max2 = Math.max(0.0f, ((c62Var.r.getMeasuredHeight() - (c62Var.F - computeVerticalScrollOffset)) - c62Var.getListTopPadding()) - hl.L(84.0f));
                    float L = hl.L(32.0f);
                    if (max < L && computeVerticalScrollOffset > c62Var.getListTopPadding()) {
                        f4 = (-(1.0f - (max / L))) * hl.L(6.0f);
                    } else if (max2 < L) {
                        f4 = hl.L(6.0f) * (1.0f - (max2 / L));
                    } else {
                        f4 = 0.0f;
                    }
                    int i13 = (int) f4;
                    if (Math.abs(i13) > 0 && c62Var.r.canScrollVertically(i13) && (f4 <= 0.0f || !z2)) {
                        c62Var.F += f4;
                        c62Var.r.scrollBy(0, i13);
                        b62Var.invalidate();
                    }
                    b62Var.M = true;
                    b62Var.postDelayed(this, 15L);
                    return;
                }
                return;
            case 17:
                a72 a72Var = (a72) this.b;
                p1 p1Var = a72Var.V0;
                zh8 zh8Var = a72Var.h1;
                if (zh8Var != null) {
                    EditTextBoldCursor editField = zh8Var.getEditField();
                    if (!a72Var.I && editField != null && a72Var.H && !a72Var.f1 && !hl.D && !hl.E && hl.O1()) {
                        editField.requestFocus();
                        hl.E3(editField);
                        hl.r(p1Var);
                        hl.d3(p1Var, 100L);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                try {
                    pq2.n((pq2) this.b);
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
                tf3 tf3Var = (tf3) this.b;
                tf3Var.o0.onDismiss(tf3Var.w0);
                return;
            case 21:
                hl.r(this);
                bn3 bn3Var = (bn3) this.b;
                if (bn3Var.r == 1 && bn3Var.s != null) {
                    Editable text = bn3Var.f.a.F0.getText();
                    if (text != null && text.toString().trim().length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    if (bn3Var.s.getRightMode() == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    long j5 = bn3Var.s0;
                    if (uptimeMillis2 - j5 >= 300) {
                        if (!z4) {
                            if (z3 && uptimeMillis2 - bn3Var.V > 1200 && uptimeMillis2 - bn3Var.r0 > 1200) {
                                bn3Var.s.setRightMode(2);
                                bn3Var.s0 = uptimeMillis2;
                            }
                        } else if (!z3 || bn3Var.V > j5) {
                            bn3Var.s.setRightMode(0);
                            bn3Var.s0 = uptimeMillis2;
                        }
                    }
                    hl.d3(this, 50L);
                    return;
                }
                return;
            case 22:
                en3 en3Var = (en3) this.b;
                en3Var.j1 = false;
                if (en3Var.isAttachedToWindow() && en3Var.getVisibility() == 0) {
                    en3Var.invalidate();
                    en3Var.j1 = true;
                    en3Var.postOnAnimation(this);
                    return;
                }
                return;
            case 23:
                ho3 ho3Var = (ho3) this.b;
                TextView textView = ho3Var.a;
                Editable editableText = textView.getEditableText();
                if (editableText == null) {
                    ho3Var.g = false;
                    return;
                }
                long uptimeMillis3 = SystemClock.uptimeMillis();
                fo3[] fo3VarArr = (fo3[]) editableText.getSpans(0, editableText.length(), fo3.class);
                int length = fo3VarArr.length;
                int i14 = 0;
                boolean z11 = false;
                while (true) {
                    int i15 = 33;
                    if (i14 < length) {
                        fo3 fo3Var = fo3VarArr[i14];
                        int spanStart = editableText.getSpanStart(fo3Var);
                        int spanEnd = editableText.getSpanEnd(fo3Var);
                        if (spanStart >= 0 && spanEnd > spanStart) {
                            i6 = i14;
                            z7 = z8;
                            i7 = length;
                            if (uptimeMillis3 < (Math.max(0, fo3Var.c - 1) * 22) + fo3Var.a + 320) {
                                editableText.setSpan(fo3Var, spanStart, spanEnd, 33);
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
                        editableText.removeSpan(fo3Var);
                        i14 = i6 + 1;
                        z8 = z7;
                        length = i7;
                    } else {
                        boolean z12 = z8;
                        float f17 = 0.5f;
                        eo3[] eo3VarArr2 = (eo3[]) editableText.getSpans(0, editableText.length(), eo3.class);
                        int length2 = eo3VarArr2.length;
                        int i16 = 0;
                        while (i16 < length2) {
                            eo3 eo3Var = eo3VarArr2[i16];
                            int spanStart2 = editableText.getSpanStart(eo3Var);
                            int spanEnd2 = editableText.getSpanEnd(eo3Var);
                            if (spanStart2 >= 0 && spanEnd2 > spanStart2) {
                                i3 = i8;
                                if (qu6.w((float) (uptimeMillis3 - eo3Var.a), 750.0f, 1.0f, 0.0f) >= 1.0f) {
                                    editableText.removeSpan(eo3Var);
                                    eo3VarArr = eo3VarArr2;
                                    i2 = length2;
                                } else {
                                    long j6 = eo3Var.b;
                                    if (j6 <= 0) {
                                        j6 = eo3Var.a;
                                    }
                                    if (uptimeMillis3 >= j6 - 16) {
                                        if (!eo3Var.e) {
                                            eo3Var.e = z12;
                                            um3 um3Var = ho3Var.h;
                                            if (um3Var != null) {
                                                bn3 bn3Var2 = um3Var.b;
                                                float[] fArr3 = bn3Var2.E0;
                                                mm mmVar = bn3Var2.Z;
                                                if (mmVar != null && mmVar.c >= 0.2f && bn3Var2.u(fArr3) && (layout = bn3Var2.f.a.F0.getLayout()) != null && spanEnd2 <= layout.getText().length()) {
                                                    int lineForOffset = layout.getLineForOffset(spanStart2);
                                                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart2);
                                                    if (layout.getLineForOffset(spanEnd2) == lineForOffset) {
                                                        lineRight = layout.getPrimaryHorizontal(spanEnd2);
                                                    } else {
                                                        lineRight = layout.getLineRight(lineForOffset);
                                                    }
                                                    eo3VarArr = eo3VarArr2;
                                                    gn3 gn3Var = bn3Var2.x;
                                                    float f18 = primaryHorizontal + fArr3[i3];
                                                    i2 = length2;
                                                    float lineTop = layout.getLineTop(lineForOffset) + fArr3[1];
                                                    float max3 = Math.max(primaryHorizontal, lineRight) + fArr3[i3];
                                                    float lineBottom = layout.getLineBottom(lineForOffset) + fArr3[1];
                                                    int i17 = ((int) (bn3Var2.R * 2.5f)) + 2;
                                                    Random random = gn3Var.t;
                                                    if (random.nextFloat() < f17) {
                                                        i5 = 1;
                                                    } else {
                                                        i5 = i3;
                                                    }
                                                    int i18 = i17 + i5;
                                                    int i19 = i3;
                                                    while (i19 < i18) {
                                                        gn3 gn3Var2 = gn3Var;
                                                        float max4 = (Math.max(1.0f, max3 - f18) * random.nextFloat()) + f18;
                                                        float A = qd4.A(lineBottom, lineTop, ik8.e(random, 0.85f, 0.15f), lineTop);
                                                        float L2 = hl.L((random.nextFloat() * 7.0f) + 3.0f);
                                                        double nextFloat = ((random.nextFloat() - f17) * 2.2f) - 1.5707963267948966d;
                                                        gn3Var2.j(max4, A, ((float) Math.cos(nextFloat)) * L2, ((float) Math.sin(nextFloat)) * L2, ik8.e(random, 0.55f, 0.45f), ik8.e(random, f17, 0.55f));
                                                        i19++;
                                                        lineTop = lineTop;
                                                        gn3Var = gn3Var2;
                                                        i18 = i18;
                                                        f17 = 0.5f;
                                                    }
                                                } else {
                                                    eo3VarArr = eo3VarArr2;
                                                    i2 = length2;
                                                }
                                                i4 = 33;
                                                editableText.setSpan(eo3Var, spanStart2, spanEnd2, i4);
                                            }
                                        }
                                        eo3VarArr = eo3VarArr2;
                                        i2 = length2;
                                        i4 = i15;
                                        editableText.setSpan(eo3Var, spanStart2, spanEnd2, i4);
                                    } else {
                                        eo3VarArr = eo3VarArr2;
                                        i2 = length2;
                                    }
                                    z11 = true;
                                }
                            } else {
                                eo3VarArr = eo3VarArr2;
                                i2 = length2;
                                i3 = i8;
                                editableText.removeSpan(eo3Var);
                            }
                            i16++;
                            i8 = i3;
                            eo3VarArr2 = eo3VarArr;
                            length2 = i2;
                            i15 = 33;
                            f17 = 0.5f;
                            z12 = true;
                        }
                        do3[] do3VarArr = (do3[]) editableText.getSpans(i8, editableText.length(), do3.class);
                        for (do3 do3Var : do3VarArr) {
                            if (do3Var.a != 0) {
                                int spanStart3 = editableText.getSpanStart(do3Var);
                                int spanEnd3 = editableText.getSpanEnd(do3Var);
                                if (spanStart3 >= 0 && spanEnd3 > spanStart3) {
                                    long j7 = do3Var.a;
                                    if (j7 == 0 || uptimeMillis3 < j7 + 300) {
                                        editableText.setSpan(do3Var, spanStart3, spanEnd3, 33);
                                        z11 = true;
                                    }
                                }
                                editableText.removeSpan(do3Var);
                            }
                        }
                        go3 go3Var = ho3Var.j;
                        if (go3Var != null && ho3Var.m > 0.0f && editableText.getSpanStart(go3Var) >= 0) {
                            z5 = false;
                            editableText.setSpan(ho3Var.j, 0, editableText.length(), 18);
                            z6 = true;
                        } else {
                            z5 = false;
                            z6 = z11;
                        }
                        if (z6) {
                            textView.postOnAnimation(this);
                            return;
                        } else {
                            ho3Var.g = z5;
                            return;
                        }
                    }
                }
                break;
            case 24:
                if (!((vo3) this.b).a.isEmpty()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i20 = 0;
                    while (i20 < ((vo3) this.b).a.size()) {
                        uo3 uo3Var = (uo3) ((vo3) this.b).a.get(i20);
                        if (uo3Var.getLastTaskTime() < elapsedRealtime - 30000) {
                            uo3Var.recycle();
                            ((vo3) this.b).a.remove(i20);
                            ((vo3) this.b).e--;
                            i20--;
                        }
                        i20++;
                    }
                }
                if (((vo3) this.b).a.isEmpty() && ((vo3) this.b).c.isEmpty()) {
                    ((vo3) this.b).h = false;
                    return;
                }
                Utilities.e.d(this, 30000L);
                ((vo3) this.b).h = true;
                return;
            case 25:
                lq3 lq3Var = (lq3) this.b;
                lq3Var.J.clear();
                lq3Var.getNotificationCenter().k(308, new Object[0]);
                return;
            case 26:
                ym ymVar = (ym) this.b;
                ymVar.a(true);
                ymVar.invalidateSelf();
                return;
            case 27:
                vr3 vr3Var2 = (vr3) this.b;
                vr3Var2.x = null;
                vr3Var2.drawableStateChanged();
                return;
            case 28:
                iu3 iu3Var = (iu3) this.b;
                p1 p1Var2 = iu3Var.Q;
                du3 du3Var = iu3Var.a;
                if (!iu3Var.E && du3Var != null && iu3Var.O && !iu3Var.w && !hl.D && !hl.E && hl.O1()) {
                    du3Var.requestFocus();
                    hl.E3(du3Var);
                    hl.r(p1Var2);
                    hl.d3(p1Var2, 100L);
                    return;
                }
                return;
            default:
                vh4 vh4Var = (vh4) ((j8) this.b).d;
                if (vh4Var.a && !((ArrayList) vh4Var.c).isEmpty() && !((AnimatorSet) vh4Var.d).isRunning()) {
                    try {
                        ((AnimatorSet) vh4Var.d).start();
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
        }
    }
}
