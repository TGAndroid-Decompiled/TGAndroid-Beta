package defpackage;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.o;
public final class b7 implements TextWatcher {
    public final byte a;
    public final Object b;

    public b7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        eb ebVar;
        long j;
        s5b s5bVar;
        Object[] objArr;
        long j2;
        long j3;
        ArrayList arrayList;
        int[] iArr;
        int i;
        int i2;
        boolean z;
        String str;
        float f;
        String str2;
        int i3;
        long j4 = 0;
        float f2 = 0.0f;
        String str3 = null;
        boolean z2 = false;
        boolean z3 = false;
        r14 = false;
        boolean z4 = false;
        int i4 = 0;
        z2 = false;
        z2 = false;
        boolean z5 = true;
        switch (this.a) {
            case 0:
                return;
            case 1:
                String trim = editable.toString().trim();
                ad adVar = ((wc) this.b).s;
                if (!TextUtils.equals(trim, adVar.H)) {
                    adVar.H = trim;
                    gm.r(adVar.R);
                    gm.d3(adVar.R, 300L);
                    return;
                }
                return;
            case 2:
                o oVar = (o) this.b;
                if (oVar.i0.a0 && (ebVar = oVar.j0) != null) {
                    if (editable != null) {
                        str3 = editable.toString();
                    }
                    ebVar.setInput(str3);
                    return;
                }
                return;
            case 3:
                au0 au0Var = (au0) this.b;
                mt0 mt0Var = au0Var.t0;
                TLRPC.TL_payments_starsRevenueStats h = ku0.g(au0.l0(au0Var)).h(au0Var.b, false);
                if (h == null) {
                    j = 0;
                } else {
                    j = h.status.available_balance.amount;
                }
                if (!TextUtils.isEmpty(editable)) {
                    j4 = Long.parseLong(editable.toString());
                }
                au0Var.Z = j4;
                if (j4 > j) {
                    au0Var.Z = j;
                    au0Var.X = true;
                    au0Var.a0.setText(Long.toString(j));
                    vc vcVar = au0Var.a0;
                    vcVar.setSelection(vcVar.getText().length());
                    au0Var.X = false;
                }
                if (au0Var.Z != j) {
                    z5 = false;
                }
                au0Var.Y = z5;
                gm.r(mt0Var);
                mt0Var.run();
                if (!au0Var.X) {
                    au0Var.Y = false;
                    return;
                }
                return;
            case 4:
                tc1 tc1Var = (tc1) this.b;
                if (tc1Var.f.getEditText().getLineCount() > 2 && editable != null && !TextUtils.isEmpty(editable.toString().trim())) {
                    z2 = true;
                }
                tc1Var.F(z2);
                return;
            case 5:
                kd1 kd1Var = (kd1) this.b;
                if (!kd1Var.H0 && kd1Var.G0 && (s5bVar = kd1Var.E0) != null) {
                    s5bVar.c = new SpannableStringBuilder(editable);
                    s5b s5bVar2 = kd1Var.E0;
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = -1;
                    for (int i6 = 0; i6 <= editable.length(); i6++) {
                        if (i6 != editable.length() && !Character.isWhitespace(editable.charAt(i6))) {
                            if (i5 < 0) {
                                i5 = i6;
                            }
                        } else if (i5 >= 0) {
                            arrayList2.add(Integer.valueOf(i5));
                            arrayList2.add(Integer.valueOf(i6));
                            i5 = -1;
                        }
                    }
                    int size = arrayList2.size() / 2;
                    int[] iArr2 = s5bVar2.d;
                    if (iArr2 != null && iArr2.length == (size << 2)) {
                        objArr = 1;
                    } else {
                        objArr = null;
                    }
                    if (iArr2 != null && iArr2.length >= 4) {
                        j2 = iArr2[2];
                    } else {
                        j2 = s5bVar2.a;
                    }
                    if (iArr2 != null && iArr2.length >= 4) {
                        j3 = iArr2[iArr2.length - 1];
                    } else {
                        j3 = s5bVar2.b;
                    }
                    long max = Math.max(j2, j3);
                    int[] iArr3 = new int[size << 2];
                    while (i4 < size) {
                        int i7 = i4 << 2;
                        int i8 = i4 << 1;
                        iArr3[i7] = ((Integer) arrayList2.get(i8)).intValue();
                        iArr3[i7 + 1] = ((Integer) arrayList2.get(i8 + 1)).intValue();
                        int i9 = i7 + 2;
                        if (objArr != null) {
                            arrayList = arrayList2;
                            i = iArr2[i9];
                            iArr = iArr2;
                        } else {
                            arrayList = arrayList2;
                            iArr = iArr2;
                            i = (int) ((((max - j2) * i4) / size) + j2);
                        }
                        iArr3[i9] = i;
                        int i10 = i7 + 3;
                        if (objArr != null) {
                            i2 = iArr[i10];
                        } else {
                            i2 = (int) ((((i4 + 1) * (max - j2)) / size) + j2);
                        }
                        iArr3[i10] = i2;
                        i4++;
                        arrayList2 = arrayList;
                        iArr2 = iArr;
                    }
                    s5bVar2.d = iArr3;
                    kd1Var.E0.e = true;
                    return;
                }
                return;
            case 6:
                uf1 uf1Var = ((of1) this.b).c;
                if (uf1Var.r.startsWith("@")) {
                    uf1Var.r = uf1Var.r.substring(1);
                }
                if (uf1Var.r.length() > 0) {
                    String str4 = "https://" + oc7.r1(uf1.Z(uf1Var)).N2 + "/" + uf1Var.r;
                    String a0 = jb6.a0("UsernameHelpLink", null, 2131743346, str4);
                    int indexOf = a0.indexOf(str4);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new q1((byte) 1, str4, uf1Var), indexOf, str4.length() + indexOf, 33);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                return;
            case 8:
                TextUtils.isEmpty(((s22) this.b).E);
                ((s22) this.b).E = editable.toString().trim();
                gm.r(((s22) this.b).b0);
                if (!TextUtils.isEmpty(((s22) this.b).E)) {
                    s22 s22Var = (s22) this.b;
                    String str5 = s22Var.E;
                    if (str5 != null && str5.length() >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    s22Var.a0 = z;
                    s22 s22Var2 = (s22) this.b;
                    if (!TextUtils.equals(s22Var2.W, s22Var2.E)) {
                        ((s22) this.b).M.clear();
                        s22 s22Var3 = (s22) this.b;
                        s22Var3.c0 = 0;
                        s22Var3.d0 = false;
                    }
                    gm.d3(((s22) this.b).b0, 1500L);
                }
                gm.r(((s22) this.b).g0);
                if (!TextUtils.isEmpty(((s22) this.b).E)) {
                    s22 s22Var4 = (s22) this.b;
                    String str6 = s22Var4.E;
                    s22Var4.n0 = (str6 == null || str6.length() < 3 || TextUtils.isEmpty(oc7.r1(((s22) this.b).b.G3).l4.J.f)) ? false : false;
                    s22 s22Var5 = (s22) this.b;
                    if (!TextUtils.equals(s22Var5.f0, s22Var5.E)) {
                        ((s22) this.b).N.clear();
                        ((s22) this.b).h0 = false;
                    }
                    gm.d3(((s22) this.b).g0, 1500L);
                }
                ((s22) this.b).S();
                return;
            case 9:
                String obj = editable.toString();
                boolean isEmpty = obj.isEmpty();
                w32 w32Var = (w32) this.b;
                if (!isEmpty) {
                    r34 r34Var = w32Var.H;
                    if (r34Var != null) {
                        r34Var.setText(jb6.M0(2131747901, null));
                    }
                } else {
                    y59 adapter = w32Var.s.getAdapter();
                    w32 w32Var2 = (w32) this.b;
                    if (adapter != w32Var2.F) {
                        int O = w32.O(w32Var2);
                        ((w32) this.b).H.setText(jb6.M0(2131747957, null));
                        ((w32) this.b).H.c();
                        w32 w32Var3 = (w32) this.b;
                        w32Var3.s.setAdapter(w32Var3.F);
                        ((w32) this.b).F.f();
                        if (O > 0) {
                            ((w32) this.b).w.g1(0, -O);
                        }
                    }
                }
                s32 s32Var = ((w32) this.b).G;
                if (s32Var != null) {
                    if (s32Var.f != null) {
                        Utilities.g.a(s32Var.f);
                        s32Var.f = null;
                    }
                    int i11 = s32Var.h + 1;
                    s32Var.h = i11;
                    mp3 mp3Var = Utilities.g;
                    r32 r32Var = new r32(s32Var, obj, i11, (byte) 0);
                    s32Var.f = r32Var;
                    mp3Var.d(r32Var, 300L);
                    return;
                }
                return;
            case 10:
                String obj2 = editable.toString();
                boolean isEmpty2 = obj2.isEmpty();
                a82 a82Var = (a82) this.b;
                fv fvVar = a82Var.s;
                r34 r34Var2 = a82Var.F;
                x72 x72Var = a82Var.y;
                if (!isEmpty2) {
                    if (r34Var2 != null) {
                        r34Var2.setText(jb6.M0(2131747901, null));
                    }
                } else if (fvVar.getAdapter() != x72Var) {
                    int O2 = a82.O(a82Var);
                    r34Var2.c();
                    fvVar.setAdapter(x72Var);
                    x72Var.f();
                    if (O2 > 0) {
                        a82Var.w.g1(0, -O2);
                    }
                }
                y72 y72Var = a82Var.E;
                if (y72Var != null) {
                    a82 a82Var2 = y72Var.f;
                    fv fvVar2 = a82Var2.s;
                    ArrayList arrayList3 = y72Var.d;
                    arrayList3.clear();
                    y72Var.e = obj2;
                    String I3 = gm.I3(obj2);
                    if (I3.startsWith("/")) {
                        I3 = I3.substring(1);
                    }
                    ArrayList arrayList4 = pz8.f(z8c.t0).b;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        oz8 oz8Var = (oz8) arrayList4.get(i12);
                        if (!pz8.g(oz8Var.b)) {
                            String I32 = gm.I3(oz8Var.b);
                            if (I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                                arrayList3.add(oz8Var);
                            }
                        }
                    }
                    y59 adapter2 = fvVar2.getAdapter();
                    y72 y72Var2 = a82Var2.E;
                    if (adapter2 != y72Var2) {
                        fvVar2.setAdapter(y72Var2);
                    }
                    y72Var.f();
                    return;
                }
                return;
            case 11:
                ba2 ba2Var = (ba2) this.b;
                ba2Var.r.j(5L, ba2Var.w.getText().toString(), null, null);
                kc0 kc0Var = ba2Var.e;
                if (kc0Var != null) {
                    kc0Var.invalidate();
                    return;
                }
                return;
            case 12:
                ((qa2) this.b).b0();
                return;
            case 13:
                je2 je2Var = (je2) this.b;
                ke2 ke2Var = je2Var.e;
                if (!je2Var.d) {
                    ke2Var.T = editable.toString();
                    u69 K = ke2Var.b.K(ke2Var.v0);
                    if (K != null) {
                        ke2Var.r0(K.a);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                hh2 hh2Var = (hh2) this.b;
                hh2Var.y = false;
                ah2 ah2Var = hh2Var.G;
                gm.r(ah2Var);
                if (TextUtils.isEmpty(hh2Var.f.getText())) {
                    hh2Var.E = null;
                    hh2Var.d.b();
                } else {
                    hh2Var.y = true;
                    gm.d3(ah2Var, 800L);
                }
                hh2Var.c.g3.O(true);
                hh2Var.g0();
                return;
            case 15:
                return;
            case 16:
                ((po2) this.b).Z();
                return;
            case 17:
                hz2 hz2Var = (hz2) this.b;
                hz2Var.S0();
                hz2Var.X1 = editable.toString();
                hz2Var.Y1.O(true);
                return;
            case 18:
                un3 un3Var = (un3) this.b;
                if (!un3Var.L) {
                    byte b = un3Var.r;
                    if (b == 1) {
                        un3Var.N = un3Var.M.length();
                        un3Var.I = editable.length();
                        if (editable.length() > 0 && !Character.isWhitespace(editable.charAt(editable.length() - 1))) {
                            z4 = true;
                        }
                        un3Var.O = z4;
                        return;
                    } else if (b == 3 && TextUtils.isEmpty(editable)) {
                        un3Var.m();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 19:
                qu3 qu3Var = (qu3) this.b;
                if (qu3Var.X1 != qu3Var.getLineCount()) {
                    if (!qu3Var.Y1 && qu3Var.getMeasuredWidth() > 0) {
                        qu3Var.G(qu3Var.X1, qu3Var.getLineCount());
                    }
                    qu3Var.X1 = qu3Var.getLineCount();
                    return;
                }
                return;
            case 20:
                ((aa7) this.b).run();
                return;
            case 21:
                ix3 ix3Var = (ix3) this.b;
                ImageView imageView = ix3Var.r;
                l7 l7Var = ix3Var.e;
                if (!ix3Var.s) {
                    ix3Var.d(false);
                    String obj3 = l7Var.getText().toString();
                    if (TextUtils.isEmpty(obj3)) {
                        str = null;
                    } else {
                        str = obj3;
                    }
                    jac jacVar = ix3Var.x;
                    if (jacVar != null) {
                        jacVar.a(str, -1);
                    }
                    hx3 hx3Var = ix3Var.h;
                    if (hx3Var != null) {
                        hx3Var.I1(null);
                        ix3Var.h.J1(TextUtils.isEmpty(obj3), true);
                    }
                    if (l7Var != null) {
                        l7Var.animate().cancel();
                        ViewPropertyAnimator translationX = l7Var.animate().translationX(0.0f);
                        d53 d53Var = d53.h;
                        translationX.setInterpolator(d53Var).start();
                        if (imageView != null && ix3Var.n != (!TextUtils.isEmpty(l7Var.getText()))) {
                            ix3Var.n = !ix3Var.n;
                            imageView.animate().cancel();
                            if (ix3Var.n) {
                                imageView.setVisibility(0);
                            }
                            ViewPropertyAnimator animate = imageView.animate();
                            float f3 = 0.7f;
                            if (ix3Var.n) {
                                f = 1.0f;
                            } else {
                                f = 0.7f;
                            }
                            ViewPropertyAnimator scaleX = animate.scaleX(f);
                            if (ix3Var.n) {
                                f3 = 1.0f;
                            }
                            ViewPropertyAnimator scaleY = scaleX.scaleY(f3);
                            if (ix3Var.n) {
                                f2 = 1.0f;
                            }
                            ViewPropertyAnimator duration = scaleY.alpha(f2).withEndAction(new bi3(this, (byte) 27)).setInterpolator(d53Var).setDuration(320L);
                            if (ix3Var.n) {
                                j4 = 240;
                            }
                            duration.setStartDelay(j4).start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                s24 s24Var = (s24) this.b;
                s24Var.g(false);
                q24 q24Var = s24Var.d;
                String obj4 = q24Var.getText().toString();
                s24Var.b(obj4, true);
                r24 r24Var = s24Var.r;
                if (r24Var != null) {
                    r24Var.I1(null);
                    r24Var.J1(TextUtils.isEmpty(obj4), true);
                }
                s24Var.f(!TextUtils.isEmpty(obj4));
                if (q24Var != null) {
                    q24Var.clearAnimation();
                    q24Var.animate().translationX(0.0f).setInterpolator(d53.h).start();
                }
                s24Var.c(false);
                return;
            case 23:
                m44 m44Var = ((n44) this.b).c;
                if (m44Var != null) {
                    String trim2 = editable.toString().trim();
                    ap0 ap0Var = ((so0) m44Var).a;
                    ap0Var.q2 = trim2;
                    ap0Var.f1(false, false);
                    ap0Var.f1(true, true);
                    return;
                }
                return;
            case 24:
                qf4 qf4Var = ((nf4) this.b).e;
                if (!TextUtils.equals(editable, qf4Var.x)) {
                    qf4Var.n = !TextUtils.isEmpty(editable);
                    qf4Var.x = gn.onlyEmojiSpans(editable);
                    ef4 ef4Var = qf4Var.J;
                    if (ef4Var != null) {
                        ef4Var.e(gn.cloneSpans(qf4Var.x, -1, ef4Var.s.getPaint().getFontMetricsInt(), 0.5f), true);
                    }
                    ff4 ff4Var = qf4Var.K;
                    if (ff4Var != null) {
                        rj rjVar = ff4Var.r;
                        if (qf4.n0(qf4Var.x)) {
                            if (qf4Var.y) {
                                i3 = 2131750672;
                            } else {
                                i3 = 2131750671;
                            }
                            str2 = jb6.M0(i3, null);
                        } else {
                            str2 = null;
                        }
                        rjVar.setText(str2);
                    }
                    if (qf4Var.s && TextUtils.isEmpty(qf4Var.x)) {
                        qf4.Z(qf4Var).setTitle(jb6.M0(2131750665, null));
                    } else {
                        qf4.b0(qf4Var).setTitle(gn.cloneSpans(qf4Var.x, -1, qf4.a0(qf4Var).getTitleFontMetricsInt()));
                    }
                }
                qf4Var.l0(true);
                return;
            case 25:
                oq4 oq4Var = (oq4) this.b;
                if (!oq4Var.G.isEmpty() && editable.length() > 0 && oq4Var.J >= 0) {
                    oq4Var.J = -1;
                    oq4Var.e();
                }
                oq4Var.a.a((oq4Var.n || oq4Var.r.length() > 0) ? true : true, true);
                return;
            case 26:
                oc5 oc5Var = (oc5) this.b;
                if (oc5Var.f.r.length() != 0) {
                    mc5 mc5Var = oc5Var.w;
                    boolean z6 = mc5Var.n;
                    if (!z6) {
                        oc5Var.U = true;
                        oc5Var.T = true;
                        if (!z6) {
                            mc5Var.n = true;
                            mc5Var.f();
                        }
                        oc5Var.n.setFastScrollVisible(false);
                        oc5Var.n.setVerticalScrollBarEnabled(true);
                    }
                    oc5Var.w.L(oc5Var.f.r.getText().toString());
                    oc5Var.s.e(true, false);
                    return;
                }
                oc5Var.U = false;
                oc5Var.T = false;
                mc5 mc5Var2 = oc5Var.w;
                if (mc5Var2.n) {
                    mc5Var2.n = false;
                    mc5Var2.f();
                }
                oc5Var.w.L(null);
                oc5Var.n.setFastScrollVisible(true);
                oc5Var.n.setVerticalScrollBarEnabled(false);
                oc5Var.u0(0);
                return;
            case 27:
                oc6 oc6Var = (oc6) this.b;
                if (!oc6Var.c) {
                    oc6Var.E = false;
                    oc6Var.y = editable.toString();
                    oc6Var.Z(true);
                    return;
                }
                return;
            case 28:
            default:
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2;
        boolean z;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                of1 of1Var = (of1) obj;
                uf1 uf1Var = of1Var.c;
                String str = uf1Var.r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                uf1Var.r = charSequence2;
                uf1 uf1Var2 = of1Var.c;
                qf1 qf1Var = uf1Var2.F;
                if (qf1Var != null && str != null) {
                    qf1Var.b(uf1Var2.r);
                    return;
                }
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return;
            case 15:
                rk2 rk2Var = (rk2) obj;
                if (charSequence.length() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                rk2Var.X1 = z;
                rk2Var.V1 = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                rk2Var.a2 = ofFloat;
                ofFloat.addUpdateListener(new et1(rk2Var, (byte) 13));
                boolean z2 = rk2Var.X1;
                ValueAnimator valueAnimator = rk2Var.a2;
                if (!z2) {
                    b10.n(1.5f, valueAnimator);
                    rk2Var.a2.setDuration(350L);
                } else {
                    valueAnimator.setDuration(220L);
                }
                rk2Var.a2.start();
                rk2Var.m();
                return;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return;
            case 28:
                ze6 ze6Var = (ze6) obj;
                te6 te6Var = ze6Var.T;
                if (ze6Var.S) {
                    ze6Var.removeCallbacks(te6Var);
                    te6Var.run();
                    return;
                }
                return;
            default:
                sf6 sf6Var = (sf6) obj;
                qf6 qf6Var = sf6Var.y;
                if (sf6Var.x) {
                    sf6Var.removeCallbacks(qf6Var);
                    qf6Var.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                r7 r7Var = (r7) obj;
                n7 n7Var = r7Var.I;
                if (n7Var != null) {
                    n7Var.l(r7Var.e);
                }
                r7Var.k();
                if (!r7Var.h0.isEmpty() && !TextUtils.isEmpty(r7Var.e.getText()) && r7Var.i0 >= 0) {
                    r7Var.i0 = -1;
                    r7Var.E();
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                of1 of1Var = (of1) obj;
                uf1 uf1Var = of1Var.c;
                String str = uf1Var.r;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                uf1Var.r = charSequence2;
                uf1 uf1Var2 = of1Var.c;
                qf1 qf1Var = uf1Var2.F;
                if (qf1Var != null && str != null) {
                    qf1Var.b(uf1Var2.r);
                }
                if (!uf1Var.n) {
                    uf1Var.c0(uf1Var.r);
                    return;
                }
                return;
            case 7:
                fj1 fj1Var = (fj1) obj;
                fj1Var.e0(fj1Var.y.getText().toString());
                return;
            case 8:
            case 9:
            case 10:
            case 11:
                return;
            case 12:
                qa2 qa2Var = (qa2) obj;
                if (!qa2Var.n0) {
                    String obj2 = qa2Var.b.getText().toString();
                    qf1 qf1Var2 = qa2Var.P;
                    if (qf1Var2 != null) {
                        qf1Var2.b(obj2);
                    }
                    qa2Var.c0(obj2);
                    return;
                }
                return;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void A(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void B(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void C(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void D(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void E(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void F(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void G(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void H(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void I(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void J(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void K(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void L(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void M(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void N(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void O(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void P(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void Q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void R(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void S(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void T(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void U(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void V(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void W(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void X(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void Y(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void Z(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void a0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void w(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void x(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void y(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void z(int i, int i2, int i3, CharSequence charSequence) {
    }
}
