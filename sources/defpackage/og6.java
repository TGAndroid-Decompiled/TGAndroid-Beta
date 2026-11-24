package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class og6 implements TextWatcher {
    public final byte a;
    public final Object b;

    public og6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String str;
        byte b;
        wy2 wy2Var;
        boolean z2;
        wy2 wy2Var2;
        nk j;
        String str2;
        boolean z3;
        wy2 wy2Var3;
        wy2 wy2Var4;
        long j2;
        boolean z4;
        boolean z5;
        int i;
        float f;
        float f2;
        String str3;
        boolean z6;
        qac qacVar;
        boolean z7;
        nk j3;
        String obj;
        int indexOf;
        qac qacVar2;
        int b2;
        pu9 pu9Var;
        String str4;
        boolean z8;
        boolean z9;
        boolean z10;
        String str5 = "";
        String str6 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        String str7 = null;
        nk nkVar = null;
        int i2 = 1;
        boolean z11 = false;
        switch (this.a) {
            case 0:
                return;
            case 1:
                lh6 lh6Var = (lh6) this.b;
                HashMap hashMap = lh6Var.I;
                ArrayList arrayList = lh6Var.H;
                jh6 jh6Var = lh6Var.a;
                jh6 jh6Var2 = lh6Var.b;
                if (!lh6Var.L) {
                    lh6Var.L = true;
                    String h = r58.h(jh6Var.getText().toString(), false);
                    jh6Var.setText(h);
                    if (h.length() == 0) {
                        lh6.n(lh6Var, null);
                        jh6Var2.setHintText((String) null);
                        lh6Var.F = (byte) 1;
                        z2 = false;
                    } else {
                        int i3 = 4;
                        if (h.length() > 4) {
                            while (true) {
                                if (i3 >= i2) {
                                    String substring = h.substring(0, i3);
                                    List list = (List) hashMap.get(substring);
                                    if (list == null) {
                                        wy2Var2 = str6;
                                    } else if (list.size() > i2) {
                                        String string = oc7.d1().getString("phone_code_last_matched_".concat(substring), str6);
                                        wy2 wy2Var5 = (wy2) aq1.m(i2, list);
                                        if (string != null) {
                                            int size = arrayList.size();
                                            int i4 = 0;
                                            while (true) {
                                                if (i4 < size) {
                                                    Object obj2 = arrayList.get(i4);
                                                    i4++;
                                                    wy2 wy2Var6 = (wy2) obj2;
                                                    if (Objects.equals(wy2Var6.d, string)) {
                                                        wy2Var5 = wy2Var6;
                                                    }
                                                }
                                            }
                                        }
                                        wy2Var2 = wy2Var5;
                                    } else {
                                        wy2Var2 = (wy2) list.get(0);
                                    }
                                    if (wy2Var2 != null) {
                                        String str8 = h.substring(i3) + jh6Var2.getText().toString();
                                        jh6Var.setText(substring);
                                        h = substring;
                                        str = str8;
                                        z = true;
                                    } else {
                                        i3--;
                                        i2 = 1;
                                        str6 = null;
                                    }
                                } else {
                                    z = false;
                                    str = null;
                                }
                            }
                            if (!z) {
                                str = h.substring(1) + jh6Var2.getText().toString();
                                h = h.substring(0, 1);
                                jh6Var.setText(h);
                            }
                        } else {
                            z = false;
                            str = null;
                        }
                        int size2 = arrayList.size();
                        int i5 = 0;
                        int i6 = 0;
                        wy2 wy2Var7 = null;
                        while (i6 < size2) {
                            Object obj3 = arrayList.get(i6);
                            i6++;
                            wy2 wy2Var8 = (wy2) obj3;
                            if (wy2Var8.c.startsWith(h)) {
                                int i7 = i5 + 1;
                                if (wy2Var8.c.equals(h)) {
                                    if (wy2Var7 == null || !wy2Var7.c.equals(wy2Var8.c)) {
                                        i5 = i7;
                                    }
                                    wy2Var7 = wy2Var8;
                                } else {
                                    i5 = i7;
                                }
                            }
                        }
                        if (i5 == 1 && wy2Var7 != null && str == null) {
                            str = h.substring(wy2Var7.c.length()) + jh6Var2.getText().toString();
                            h = wy2Var7.c;
                            jh6Var.setText(h);
                        }
                        List list2 = (List) hashMap.get(h);
                        if (list2 == null) {
                            b = 0;
                            wy2Var = null;
                        } else if (list2.size() > 1) {
                            String string2 = oc7.d1().getString("phone_code_last_matched_" + h, null);
                            wy2 wy2Var9 = (wy2) aq1.m(1, list2);
                            if (string2 != null) {
                                int size3 = arrayList.size();
                                int i8 = 0;
                                while (i8 < size3) {
                                    Object obj4 = arrayList.get(i8);
                                    i8++;
                                    wy2Var = (wy2) obj4;
                                    if (Objects.equals(wy2Var.d, string2)) {
                                        b = 0;
                                    }
                                }
                            }
                            wy2Var = wy2Var9;
                            b = 0;
                        } else {
                            b = 0;
                            wy2Var = (wy2) list2.get(0);
                        }
                        if (wy2Var != null) {
                            lh6Var.K = true;
                            lh6Var.G = wy2Var;
                            lh6Var.u(h, wy2Var);
                            lh6Var.F = b;
                        } else {
                            lh6.n(lh6Var, null);
                            jh6Var2.setHintText((String) null);
                            lh6Var.F = (byte) 2;
                        }
                        if (!z) {
                            jh6Var.setSelection(jh6Var.getText().length());
                        }
                        if (str != null) {
                            jh6Var2.requestFocus();
                            jh6Var2.setText(str);
                            jh6Var2.setSelection(jh6Var2.length());
                        }
                        z2 = false;
                    }
                    lh6Var.L = z2;
                    return;
                }
                return;
            case 2:
                ok okVar = ok.a;
                u67 u67Var = (u67) this.b;
                EditTextBoldCursor editTextBoldCursor = u67Var.p1;
                if (editable != null && !editable.toString().isEmpty()) {
                    j = nk.i(editable.toString(), okVar);
                } else {
                    j = nk.j(0L, okVar);
                }
                u67Var.G0(j, false, false, true);
                u67Var.o1.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
                return;
            case 3:
                ml7 ml7Var = (ml7) this.b;
                HashMap hashMap2 = ml7Var.v1;
                ArrayList arrayList2 = ml7Var.u1;
                if (!ml7Var.x1) {
                    ml7Var.x1 = true;
                    String h2 = r58.h(ml7Var.H1.getText().toString(), false);
                    ml7Var.H1.setText(h2);
                    if (h2.length() == 0) {
                        ml7Var.F0(null);
                        ml7Var.J1.setHintText((String) null);
                    } else {
                        if (h2.length() > 4) {
                            int i9 = 4;
                            while (true) {
                                if (i9 >= 1) {
                                    String substring2 = h2.substring(0, i9);
                                    List list3 = (List) hashMap2.get(substring2);
                                    if (list3 == null) {
                                        wy2Var4 = null;
                                    } else if (list3.size() > 1) {
                                        String string3 = oc7.d1().getString("phone_code_last_matched_".concat(substring2), null);
                                        wy2Var4 = (wy2) aq1.m(1, list3);
                                        if (string3 != null) {
                                            int size4 = arrayList2.size();
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 < size4) {
                                                    Object obj5 = arrayList2.get(i10);
                                                    i10++;
                                                    wy2 wy2Var10 = (wy2) obj5;
                                                    if (Objects.equals(wy2Var10.d, string3)) {
                                                        wy2Var4 = wy2Var10;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        wy2Var4 = (wy2) list3.get(0);
                                    }
                                    if (wy2Var4 != null) {
                                        ml7Var.H1.setText(substring2);
                                        str2 = h2.substring(i9) + ml7Var.J1.getText().toString();
                                        h2 = substring2;
                                        z3 = true;
                                    } else {
                                        i9--;
                                    }
                                } else {
                                    str2 = null;
                                    z3 = false;
                                }
                            }
                            if (!z3) {
                                str2 = h2.substring(1) + ml7Var.J1.getText().toString();
                                ll7 ll7Var = ml7Var.H1;
                                h2 = h2.substring(0, 1);
                                ll7Var.setText(h2);
                            }
                        } else {
                            str2 = null;
                            z3 = false;
                        }
                        int size5 = arrayList2.size();
                        wy2 wy2Var11 = null;
                        int i11 = 0;
                        int i12 = 0;
                        while (i12 < size5) {
                            Object obj6 = arrayList2.get(i12);
                            i12++;
                            wy2 wy2Var12 = (wy2) obj6;
                            if (wy2Var12.c.startsWith(h2)) {
                                i11++;
                                if (wy2Var12.c.equals(h2)) {
                                    wy2Var11 = wy2Var12;
                                }
                            }
                        }
                        if (i11 == 1 && wy2Var11 != null && str2 == null) {
                            str2 = h2.substring(wy2Var11.c.length()) + ml7Var.J1.getText().toString();
                            ll7 ll7Var2 = ml7Var.H1;
                            String str9 = wy2Var11.c;
                            ll7Var2.setText(str9);
                            h2 = str9;
                        }
                        List list4 = (List) hashMap2.get(h2);
                        if (list4 == null) {
                            wy2Var3 = null;
                        } else if (list4.size() > 1) {
                            String string4 = oc7.d1().getString("phone_code_last_matched_" + h2, null);
                            wy2Var3 = (wy2) aq1.m(1, list4);
                            if (string4 != null) {
                                int size6 = arrayList2.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 < size6) {
                                        Object obj7 = arrayList2.get(i13);
                                        i13++;
                                        wy2 wy2Var13 = (wy2) obj7;
                                        if (Objects.equals(wy2Var13.d, string4)) {
                                            wy2Var3 = wy2Var13;
                                        }
                                    }
                                }
                            }
                        } else {
                            wy2Var3 = (wy2) list4.get(0);
                        }
                        if (wy2Var3 != null) {
                            ml7Var.z1 = true;
                            ml7Var.G0(h2, wy2Var3);
                        } else {
                            ml7Var.F0(null);
                            ml7Var.J1.setHintText((String) null);
                        }
                        if (!z3) {
                            ll7 ll7Var3 = ml7Var.H1;
                            ll7Var3.setSelection(ll7Var3.getText().length());
                        }
                        if (str2 != null && str2.length() != 0) {
                            ml7Var.J1.requestFocus();
                            ml7Var.J1.setText(str2);
                            ll7 ll7Var4 = ml7Var.J1;
                            ll7Var4.setSelection(ll7Var4.length());
                        }
                    }
                    ml7Var.x1 = false;
                    ml7Var.L0();
                    return;
                }
                return;
            case 4:
                ms7 ms7Var = (ms7) this.b;
                if (editable != null) {
                    str5 = editable.toString();
                }
                int indexOf2 = str5.indexOf(46);
                if (!ms7Var.w1 && indexOf2 >= 0 && (str5.length() - indexOf2) - 1 > 2) {
                    editable.delete(indexOf2 + 3, str5.length());
                    return;
                }
                if (str5.isEmpty() || ".".equals(str5)) {
                    z11 = true;
                }
                if (!z11) {
                    nkVar = nk.i(str5, ok.b);
                }
                if (!z11) {
                    if (nkVar == null) {
                        editable.delete(str5.length() - 1, str5.length());
                        return;
                    }
                    j2 = nkVar.b;
                } else {
                    j2 = 0;
                }
                ms7Var.D0(j2);
                return;
            case 5:
                by7 by7Var = (by7) this.b;
                if (by7Var.r.length() == 4 && gda.q == 0) {
                    by7Var.n(false);
                    return;
                }
                return;
            case 6:
                u78 u78Var = ((w78) this.b).t0;
                if (u78Var != null) {
                    u78Var.i(editable);
                    return;
                }
                return;
            case 7:
                lf8 lf8Var = (lf8) this.b;
                int length = lf8Var.a.getText().length();
                fn0 fn0Var = lf8Var.I;
                int i14 = lf8Var.y;
                if (length > (i14 * 7) / 10) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                fn0Var.a(z4, true);
                fn0 fn0Var2 = lf8Var.J;
                if (length > i14) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                fn0Var2.a(z5, true);
                lf8Var.f.l(Integer.toString(i14 - length), false);
                return;
            case 8:
                lu9 lu9Var = (lu9) this.b;
                ImageView imageView = lu9Var.b;
                vc vcVar = lu9Var.d;
                if (vcVar.length() > 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (imageView.getAlpha() == 0.0f) {
                    i2 = 0;
                }
                if (i != i2) {
                    ViewPropertyAnimator animate = imageView.animate();
                    float f3 = 1.0f;
                    if (i != 0) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    ViewPropertyAnimator duration = animate.alpha(f).setDuration(150L);
                    if (i != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.1f;
                    }
                    ViewPropertyAnimator scaleX = duration.scaleX(f2);
                    if (i == 0) {
                        f3 = 0.1f;
                    }
                    scaleX.scaleY(f3).start();
                }
                lu9Var.a(vcVar.getText().toString());
                return;
            case 9:
                return;
            case 10:
                ny9 ny9Var = (ny9) this.b;
                pz pzVar = ny9Var.h;
                if (pzVar.getText() != null && gm.J3(pzVar.getText(), null).length() != 0) {
                    str3 = pzVar.getText().toString();
                } else {
                    str3 = null;
                }
                ny9Var.G.v(str3, true, true);
                kz9 kz9Var = ny9Var.n;
                if (kz9Var != null) {
                    kz9Var.I1(null);
                    ny9Var.n.J1(TextUtils.isEmpty(str3), true);
                }
                if (pzVar != null) {
                    pzVar.clearAnimation();
                    pzVar.animate().translationX(0.0f).setInterpolator(d53.h).start();
                }
                ny9Var.b(false);
                return;
            case 11:
                ((zz9) this.b).l2 = editable.toString();
                zz9 zz9Var = (zz9) this.b;
                if (!zz9Var.U1) {
                    String str10 = zz9Var.q2;
                    String str11 = zz9Var.l2;
                    if (str11 == null) {
                        str11 = "";
                    }
                    if (!TextUtils.equals(str10, str11)) {
                        ((zz9) this.b).a1();
                        zz9 zz9Var2 = (zz9) this.b;
                        String str12 = zz9Var2.l2;
                        if (str12 != null && str12.length() > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zz9Var2.p2 = z6;
                    }
                    zz9 zz9Var3 = (zz9) this.b;
                    String str13 = zz9Var3.B2;
                    String str14 = zz9Var3.l2;
                    if (str14 != null) {
                        str5 = str14;
                    }
                    if (!TextUtils.equals(str13, str5)) {
                        ((zz9) this.b).Z0();
                        zz9 zz9Var4 = (zz9) this.b;
                        String str15 = zz9Var4.l2;
                        if (str15 != null && str15.length() > 3 && !TextUtils.isEmpty(oc7.r1(((zz9) this.b).a).l4.J.f)) {
                            z11 = true;
                        }
                        zz9Var4.w2 = z11;
                    }
                    xz9 xz9Var = ((zz9) this.b).s2;
                    gm.r(xz9Var);
                    gm.d3(xz9Var, 400L);
                    xz9 xz9Var2 = ((zz9) this.b).D2;
                    gm.r(xz9Var2);
                    gm.d3(xz9Var2, 400L);
                }
                ((zz9) this.b).j2.O(true);
                return;
            case 12:
                j1a j1aVar = (j1a) this.b;
                if (!j1aVar.h && (qacVar = j1aVar.n) != null && editable != null) {
                    qacVar.a(editable.toString());
                    return;
                }
                return;
            case 13:
                q2a q2aVar = (q2a) this.b;
                EditTextBoldCursor editTextBoldCursor2 = q2aVar.m1;
                if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (!z7 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
                    editable.delete(indexOf + 3, obj.length());
                }
                if (!z7) {
                    j3 = nk.i(editable.toString(), q2aVar.y1.a);
                } else {
                    j3 = nk.j(0L, q2aVar.y1.a);
                }
                q2aVar.E0(j3, false, false, true);
                q2aVar.l1.c(editTextBoldCursor2.isFocused(), !TextUtils.isEmpty(editTextBoldCursor2.getText()));
                return;
            case 14:
                return;
            case 15:
                x7b x7bVar = (x7b) this.b;
                if (!x7bVar.n && (qacVar2 = x7bVar.r) != null && editable != null) {
                    qacVar2.a(editable.toString());
                    return;
                }
                return;
            case 16:
                fdb fdbVar = (fdb) this.b;
                ddb ddbVar = fdbVar.c;
                if (ddbVar != null && ddbVar.getVisibility() == 0) {
                    fdbVar.d();
                    return;
                }
                return;
            case 17:
                xhb xhbVar = (xhb) this.b;
                if (!xhbVar.y) {
                    String trim = editable.toString().trim();
                    int length2 = trim.length();
                    io ioVar = xhbVar.n;
                    if (length2 > 16) {
                        ioVar.setText("-" + (trim.length() - 16));
                        trim = trim.substring(0, 16);
                    } else {
                        ioVar.setText("");
                    }
                    qac qacVar3 = xhbVar.x;
                    if (qacVar3 != null) {
                        qacVar3.a(trim);
                    }
                    k47 k47Var = xhbVar.r;
                    if (k47Var != null) {
                        k47Var.M1 = true;
                        xhbVar.d.z3(k47Var, null, false, false, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                zob zobVar = (zob) this.b;
                if (!zobVar.I) {
                    if (zobVar.a.length() > 0) {
                        String str16 = "https://" + zobVar.getMessagesController().N2 + "/addtheme/" + ((Object) zobVar.a.getText());
                        String a0 = jb6.a0("ThemeHelpLink", null, 2131743866, str16);
                        int indexOf3 = a0.indexOf(str16);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                        if (indexOf3 >= 0) {
                            spannableStringBuilder.setSpan(new q1((byte) 8, str16, zobVar), indexOf3, str16.length() + indexOf3, 33);
                        }
                        zobVar.d.setText(TextUtils.concat(zobVar.H, "\n\n", spannableStringBuilder));
                        return;
                    }
                    zobVar.d.setText(zobVar.H);
                    return;
                }
                return;
            case 19:
                String trim2 = editable.toString().trim();
                wvb wvbVar = (wvb) this.b;
                String str17 = wvbVar.n;
                if (trim2.length() > 0) {
                    str5 = trim2.substring(0, 1).toUpperCase();
                    wvbVar.n = str5;
                } else {
                    wvbVar.n = "";
                }
                if (!str17.equals(str5)) {
                    o26 o26Var = new o26(1, null);
                    o26Var.a(wvbVar.n);
                    n99 n99Var = wvbVar.w;
                    if (n99Var != null) {
                        n99Var.b(o26Var, true);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                oyb oybVar = (oyb) this.b;
                String lowerCase = editable.toString().trim().toLowerCase();
                oybVar.M = lowerCase;
                if (lowerCase.startsWith("@")) {
                    oybVar.M = oybVar.M.substring(1);
                }
                oybVar.l(true);
                oybVar.n();
                return;
            case 21:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                u4c u4cVar = twoStepVerificationActivity.W;
                if (twoStepVerificationActivity.V) {
                    gm.r(u4cVar);
                    u4cVar.run();
                    return;
                }
                return;
            case 22:
                x9c x9cVar = (x9c) this.b;
                String obj8 = x9cVar.K.getText().toString();
                y9c y9cVar = x9cVar.L;
                if (y9cVar.n1.getAdapter() == null) {
                    b2 = 0;
                } else {
                    b2 = y9cVar.n1.getAdapter().b();
                }
                y9cVar.G0(obj8);
                if (TextUtils.isEmpty(obj8) && (pu9Var = y9cVar.n1) != null) {
                    y59 adapter = pu9Var.getAdapter();
                    q59 q59Var = y9cVar.p1;
                    if (adapter != q59Var) {
                        pu9 pu9Var2 = y9cVar.n1;
                        pu9Var2.X1 = false;
                        pu9Var2.Y1 = false;
                        pu9Var2.setAdapter(q59Var);
                        pu9 pu9Var3 = y9cVar.n1;
                        pu9Var3.X1 = true;
                        pu9Var3.Y1 = false;
                        if (b2 == 0) {
                            y9cVar.J0(0);
                        }
                    }
                }
                y9cVar.u1.setVisibility(0);
                return;
            case 23:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (usersSelectActivity.c.length() != 0) {
                    cac cacVar = usersSelectActivity.h;
                    boolean z12 = cacVar.n;
                    if (!z12) {
                        usersSelectActivity.O = true;
                        usersSelectActivity.N = true;
                        if (!z12) {
                            cacVar.n = true;
                            cacVar.f();
                        }
                        usersSelectActivity.d.setFastScrollVisible(false);
                        usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                        usersSelectActivity.f.d.setText(jb6.M0(2131747901, null));
                    }
                    usersSelectActivity.f.e(true, true);
                    usersSelectActivity.h.L(usersSelectActivity.c.getText().toString());
                    return;
                }
                usersSelectActivity.O = false;
                usersSelectActivity.N = false;
                cac cacVar2 = usersSelectActivity.h;
                if (cacVar2.n) {
                    cacVar2.n = false;
                    cacVar2.f();
                }
                usersSelectActivity.h.L(null);
                usersSelectActivity.d.setFastScrollVisible(true);
                usersSelectActivity.d.setVerticalScrollBarEnabled(false);
                usersSelectActivity.f.d.setText(jb6.M0(2131747957, null));
                return;
            case 24:
                glc glcVar = (glc) this.b;
                glcVar.n = editable.toString();
                ykc ykcVar = glcVar.K;
                if (ykcVar != null) {
                    ykcVar.invalidate();
                    return;
                }
                return;
            case 25:
                return;
            case 26:
                ((rrc) this.b).C0();
                return;
            case 27:
                final asc ascVar = (asc) this.b;
                ArrayList arrayList3 = ascVar.w;
                arrayList3.clear();
                final String trim3 = editable.toString().trim();
                Runnable runnable = ascVar.L;
                if (runnable != null) {
                    gm.r(runnable);
                    ascVar.L = null;
                }
                if (ascVar.F != 0) {
                    ascVar.getConnectionsManager().cancelRequest(ascVar.F, true);
                    ascVar.F = 0;
                }
                if (WalletEngine2.isValidRecipientAddress(trim3)) {
                    str4 = trim3;
                } else {
                    str4 = null;
                }
                ascVar.y = str4;
                if (str4 == null && trim3 != null && trim3.length() <= 126) {
                    String lowerCase2 = trim3.toLowerCase(Locale.ROOT);
                    if (lowerCase2.matches("[a-z0-9_-]+(?:\\.[a-z0-9_-]+)*\\.ton")) {
                        str7 = lowerCase2;
                    }
                }
                ascVar.E = str7;
                final int i15 = ascVar.K + 1;
                ascVar.K = i15;
                if (!TextUtils.isEmpty(trim3) && ascVar.y == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                ascVar.M = z8;
                ascVar.x.g(null, true, false, false, false, 0L, false, 0, i15);
                b61 b61Var = ascVar.a0;
                if (b61Var != null) {
                    if (ascVar.y != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    b61Var.setEnabled(z9);
                }
                if (!TextUtils.isEmpty(trim3) && ascVar.y == null && ascVar.E == null) {
                    ascVar.j0(trim3);
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            byte b3 = r4;
                            asc ascVar2 = ascVar;
                            switch (b3) {
                                case 0:
                                    ascVar2.g0(i15, trim3);
                                    return;
                                default:
                                    ascVar2.L = null;
                                    bu9 bu9Var = ascVar2.x;
                                    int i16 = i15;
                                    bu9Var.h(trim3, true, false, false, false, false, 0L, false, 0, i16, 0L, new zrc(ascVar2, i16, (byte) 0));
                                    return;
                            }
                        }
                    };
                    ascVar.L = runnable2;
                    gm.d3(runnable2, 300L);
                } else {
                    arrayList3.clear();
                    ascVar.a.g3.O(true);
                    final String str18 = ascVar.E;
                    if (str18 != null) {
                        Runnable runnable3 = new Runnable() {
                            @Override
                            public final void run() {
                                byte b3 = r4;
                                asc ascVar2 = ascVar;
                                switch (b3) {
                                    case 0:
                                        ascVar2.g0(i15, str18);
                                        return;
                                    default:
                                        ascVar2.L = null;
                                        bu9 bu9Var = ascVar2.x;
                                        int i16 = i15;
                                        bu9Var.h(str18, true, false, false, false, false, 0L, false, 0, i16, 0L, new zrc(ascVar2, i16, (byte) 0));
                                        return;
                                }
                            }
                        };
                        ascVar.L = runnable3;
                        gm.d3(runnable3, 300L);
                    }
                }
                ascVar.p0(true);
                return;
            case 28:
                nsc nscVar = (nsc) this.b;
                if (nscVar.w && !editable.toString().trim().toLowerCase().matches(".*\\s+.*") && nscVar.b()) {
                    nscVar.setError(false);
                }
                nscVar.e();
                nscVar.d();
                if (nscVar.a.hasFocus()) {
                    nscVar.f(editable.toString().trim().toLowerCase());
                }
                Runnable runnable4 = nscVar.f;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            default:
                wu wuVar = (wu) this.b;
                ImageView imageView2 = wuVar.K;
                if (editable.length() > 0 && wuVar.U) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gm.P3(imageView2, z10, true);
                String obj9 = editable.toString();
                o oVar = wuVar.C0;
                String lowerCase3 = obj9.toLowerCase();
                wc7 wc7Var = oVar.X0;
                if (wc7Var != null) {
                    gm.r(wc7Var);
                    oVar.X0 = null;
                }
                if (TextUtils.isEmpty(lowerCase3)) {
                    oVar.F.clear();
                    oVar.G = lowerCase3;
                    oVar.v0[0].c.E.clear();
                    oVar.b0(false);
                    boolean e = oVar.v0[0].e();
                    m[] mVarArr = oVar.v0;
                    if (e) {
                        if (mVarArr[0].getWebView() != null) {
                            mw0 webView = oVar.v0[0].getWebView();
                            webView.J = new ut(oVar, (byte) 8);
                            webView.findAllAsync("");
                            oVar.f0();
                        }
                    } else {
                        mVarArr[0].b.h1();
                        oVar.U(0);
                    }
                    oVar.Y0 = -1;
                    return;
                }
                int i16 = oVar.Y0 + 1;
                oVar.Y0 = i16;
                if (oVar.v0[0].e()) {
                    oVar.b0(true);
                    if (oVar.v0[0].getWebView() != null) {
                        mw0 webView2 = oVar.v0[0].getWebView();
                        webView2.J = new ut(oVar, (byte) 8);
                        webView2.findAllAsync(lowerCase3);
                        oVar.f0();
                        return;
                    }
                    return;
                }
                wc7 wc7Var2 = new wc7(oVar, lowerCase3, i16, (byte) 3);
                oVar.X0 = wc7Var2;
                gm.d3(wc7Var2, 400L);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rg6 rg6Var = (rg6) obj;
                dg6 dg6Var = rg6Var.u0;
                if (rg6Var.t0) {
                    rg6Var.removeCallbacks(dg6Var);
                    dg6Var.run();
                    return;
                }
                return;
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                by7 by7Var = (by7) obj;
                LinkedList linkedList = by7Var.W;
                LinkedList linkedList2 = by7Var.V;
                Drawable drawable = by7Var.a;
                if (drawable instanceof ah7) {
                    ah7 ah7Var = (ah7) drawable;
                    ah7Var.C = null;
                    ah7Var.x();
                    float f = ah7Var.h;
                    int i4 = 0;
                    boolean z2 = true;
                    if (i2 == 0 && i3 == 1) {
                        ah7Var.v(true);
                        z = true;
                    } else if (i2 == 1 && i3 == 0) {
                        ah7Var.w();
                        z = false;
                    } else {
                        z = false;
                        z2 = false;
                    }
                    if (z2) {
                        if (f >= 1.0f) {
                            by7Var.a(ah7Var);
                            return;
                        }
                        linkedList2.offer(new yl6(this, z, ah7Var, (byte) 8));
                        linkedList.offer(Boolean.valueOf(z));
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (int i5 = 0; i5 < linkedList2.size(); i5++) {
                            Runnable runnable = (Runnable) linkedList2.get(i5);
                            if (((Boolean) linkedList.get(i5)).booleanValue() != z) {
                                arrayList.add(runnable);
                                arrayList2.add(Integer.valueOf(i5));
                            }
                        }
                        int size = arrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj2 = arrayList.get(i6);
                            i6++;
                            linkedList2.remove((Runnable) obj2);
                        }
                        int size2 = arrayList2.size();
                        while (i4 < size2) {
                            Object obj3 = arrayList2.get(i4);
                            i4++;
                            int intValue = ((Integer) obj3).intValue();
                            if (intValue < linkedList.size()) {
                                linkedList.remove(intValue);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
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

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
        int i4 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return;
            case 9:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.G.getText();
                searchView.p0 = text;
                boolean isEmpty = TextUtils.isEmpty(text);
                searchView.u(!isEmpty);
                if (searchView.o0 && !searchView.h0 && isEmpty) {
                    searchView.L.setVisibility(8);
                } else {
                    i4 = 8;
                }
                searchView.N.setVisibility(i4);
                searchView.q();
                searchView.t();
                charSequence.toString();
                return;
            case 10:
            case 11:
            case 12:
            case 13:
                return;
            case 14:
                rja rjaVar = (rja) obj;
                rjaVar.m();
                n7 j = rja.j(rjaVar);
                if (j != null) {
                    j.l(rjaVar.s);
                    return;
                }
                return;
            case 15:
            case 16:
            case 17:
                return;
            case 18:
                zob zobVar = (zob) obj;
                if (!zobVar.G) {
                    zobVar.Z(zobVar.a.getText().toString(), false);
                    return;
                }
                return;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return;
            case 25:
                ((smc) obj).a(charSequence.toString());
                return;
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

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e0(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f0(int i, int i2, int i3, CharSequence charSequence) {
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
