package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class d31 {
    public final e a;
    public final FrameLayout b;
    public final vnb c;

    public d31(e eVar) {
        if (eVar != null && eVar.getLastStoryViewer() != null && eVar.getLastStoryViewer().z()) {
            this.a = null;
            o68 currentPeerView = eVar.getLastStoryViewer().o0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.M0 : null;
            this.c = eVar.getLastStoryViewer().E;
            return;
        }
        this.a = eVar;
        this.b = null;
        this.c = eVar != null ? eVar.getResourceProvider() : null;
    }

    public static v21 A(e eVar, boolean z, vnb vnbVar) {
        int i;
        if (z) {
            i = 3;
        } else {
            i = 4;
        }
        return z(eVar, i, 0, vnbVar);
    }

    public static v21 B(e eVar, boolean z, gp6 gp6Var, fm1 fm1Var, vnb vnbVar) {
        int i;
        String str;
        int i2;
        int i3;
        c21 c21Var = new c21(eVar.getParentActivity(), vnbVar);
        if (z) {
            i = 2131624055;
        } else {
            i = 2131624061;
        }
        c21Var.g(i, 28, 28, "Pin", "Line");
        TextView textView = c21Var.b;
        if (z) {
            str = "MessagePinnedHint";
            i2 = 2131748298;
        } else {
            str = "MessageUnpinnedHint";
            i2 = 2131748220;
        }
        textView.setText(ob6.M0(i2, str));
        if (!z) {
            t21 t21Var = new t21(vnbVar, eVar.getParentActivity(), true);
            t21Var.b = gp6Var;
            t21Var.c = fm1Var;
            c21Var.setButton(t21Var);
            i3 = 5000;
        } else {
            i3 = 1500;
        }
        return v21.g(eVar, c21Var, i3);
    }

    public static v21 C(String str, e eVar) {
        c21 c21Var = new c21(eVar.getParentActivity(), eVar.getResourceProvider());
        c21Var.h(2131624049, "Shield");
        uh9.r("UserSetAsAdminHint", null, 2131743335, new Object[]{str}, c21Var.b);
        return v21.g(eVar, c21Var, 1500);
    }

    public static v21 D(e eVar, TLRPC.User user, String str) {
        String str2;
        c21 c21Var = new c21(eVar.getParentActivity(), eVar.getResourceProvider());
        c21Var.h(2131624050, "Hand");
        if (user.deleted) {
            str2 = ob6.a0("HiddenName", null, 2131749082, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        uh9.r("UserRemovedFromChatHint", null, 2131743386, new Object[]{str2, str}, c21Var.b);
        return v21.g(eVar, c21Var, 1500);
    }

    public static v21 F(FrameLayout frameLayout, boolean z) {
        c31 c31Var;
        d31 d31Var = new d31(frameLayout, null);
        if (z) {
            c31Var = c31.h;
        } else {
            c31Var = c31.e;
        }
        return d31Var.m(c31Var, 1, -115203550, -1, null);
    }

    public static v21 S(int i, vnb vnbVar, e eVar) {
        String M0;
        c21 c21Var = new c21(eVar.getParentActivity(), vnbVar);
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                M0 = ob6.M0(2131745004, null);
                z = false;
            } else {
                iy8.d();
                return null;
            }
        } else {
            M0 = ob6.M0(2131745002, null);
        }
        if (z) {
            c21Var.h(2131624197, new String[0]);
        } else {
            c21Var.h(2131624196, new String[0]);
        }
        c21Var.b.setText(M0);
        return v21.g(eVar, c21Var, 1500);
    }

    public static String W(String str) {
        if ("STARGIFT_ALREADY_TRANSFERRED".equals(str)) {
            return ob6.M0(2131749698, null);
        }
        return ob6.a0(null, null, 2131743533, str);
    }

    public static d31 Y() {
        e S = LaunchActivity.S();
        if (S == null) {
            return new d31(o11.a(a.b), null);
        }
        Dialog dialog = S.visibleDialog;
        if (dialog instanceof nx0) {
            return new d31(((nx0) dialog).c, S.getResourceProvider());
        }
        return b0(S);
    }

    public static boolean a(e eVar) {
        if (eVar != null && eVar.getParentActivity() != null && eVar.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static d31 a0(FrameLayout frameLayout, vnb vnbVar) {
        return new d31(frameLayout, vnbVar);
    }

    public static d31 b0(e eVar) {
        if (eVar == null) {
            return Y();
        }
        return new d31(eVar);
    }

    public static void c0(String str) {
        if (!LaunchActivity.E1) {
            return;
        }
        Y().t(W(str), null).j();
    }

    public static v21 d(e eVar, boolean z) {
        String M0;
        c21 c21Var = new c21(eVar.getParentActivity(), eVar.getResourceProvider());
        if (z) {
            c21Var.h(2131624050, "Hand");
            M0 = ob6.M0(2131743416, null);
        } else {
            c21Var.h(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = ob6.M0(2131743330, null);
        }
        c21Var.b.setText(hl.S2(M0));
        return v21.g(eVar, c21Var, 1500);
    }

    public static void d0(String str, FrameLayout frameLayout, vnb vnbVar) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (frameLayout == null) {
            c0(str);
            return;
        }
        v21 t = new d31(frameLayout, vnbVar).t(W(str), null);
        t.s = false;
        t.j();
    }

    public static void e0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.E1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            Y().t(W(tL_error.text), null).j();
        }
    }

    public static v21 j(e eVar) {
        return b0(eVar).k(false);
    }

    public static v21 l(String str, e eVar, boolean z) {
        int i;
        String M0;
        int i2;
        int i3;
        c21 c21Var = new c21(eVar.getParentActivity(), eVar.getResourceProvider());
        if (str != null) {
            if (z) {
                i3 = 2131751377;
            } else {
                i3 = 2131751375;
            }
            M0 = ob6.a0(null, null, i3, str);
        } else {
            if (z) {
                i = 2131751378;
            } else {
                i = 2131751376;
            }
            M0 = ob6.M0(i, null);
        }
        c21Var.b.setText(hl.S2(M0));
        if (!z && str == null) {
            i2 = 2131623990;
        } else {
            i2 = 2131624007;
        }
        c21Var.h(i2, new String[0]);
        return v21.g(eVar, c21Var, 5000);
    }

    public static v21 v(Context context, e eVar, FrameLayout frameLayout, int i, long j, int i2, int i3, int i4, int i5, boolean z, ue2 ue2Var) {
        c21 c21Var;
        vnb vnbVar;
        boolean z2;
        z21 z21Var;
        int i6;
        SpannableStringBuilder S2;
        v21 g;
        vnb vnbVar2;
        int i7;
        int i8;
        kc kcVar;
        if (yac.h(yac.t0).p() && eVar != null && i <= 1 && j == yac.h(yac.t0).n && !z) {
            c21Var = new g21(i2, eVar);
        } else {
            if (eVar != null) {
                vnbVar = eVar.getResourceProvider();
            } else {
                vnbVar = null;
            }
            c21Var = new c21(i3, i4, vnbVar, context);
        }
        c21 c21Var2 = c21Var;
        if (ue2Var == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean[] zArr = {false};
        if (ue2Var != null) {
            z21Var = new z21(zArr, ue2Var, (byte) 0);
        } else {
            z21Var = null;
        }
        if (i <= 1) {
            if (j == yac.h(yac.t0).n) {
                if (i2 <= 1) {
                    String M0 = ob6.M0(2131750459, null);
                    if (z) {
                        kcVar = new kc((byte) 16);
                    } else {
                        kcVar = new kc((byte) 15);
                    }
                    S2 = hl.N2(M0, -1, 2, kcVar, null);
                } else {
                    S2 = hl.N2(ob6.M0(2131750452, null), -1, 2, new kc((byte) 15), null);
                }
                c21Var2.g(2131624185, 30, 30, new String[0]);
                i6 = 2;
            } else {
                i6 = 2;
                ue2 ue2Var2 = new ue2(z21Var, eVar, j, (byte) 12);
                boolean y = wf3.y(j);
                int i9 = yac.t0;
                if (y) {
                    TLRPC.Chat M02 = uc7.s1(i9).M0(Long.valueOf(-j));
                    if (i2 <= 1) {
                        if (eVar != null) {
                            S2 = hl.N2(ob6.a0(null, null, 2131750463, M02.title), -1, 2, ue2Var2, null);
                        } else {
                            S2 = hl.S2(ob6.a0(null, null, 2131750463, M02.title));
                        }
                    } else if (eVar != null) {
                        S2 = hl.N2(ob6.a0(null, null, 2131750456, M02.title), -1, 2, ue2Var2, null);
                    } else {
                        S2 = hl.S2(ob6.a0(null, null, 2131750456, M02.title));
                    }
                } else {
                    TLRPC.User X1 = uc7.s1(i9).X1(Long.valueOf(j));
                    if (i2 <= 1) {
                        if (z2) {
                            i8 = 2131750457;
                        } else {
                            i8 = 2131750458;
                        }
                        if (eVar != null) {
                            S2 = hl.N2(ob6.a0(null, null, i8, lbc.k(X1, true)), -1, 2, ue2Var2, null);
                        } else {
                            S2 = hl.S2(ob6.a0(null, null, i8, lbc.k(X1, true)));
                        }
                    } else {
                        if (z2) {
                            i7 = 2131750450;
                        } else {
                            i7 = 2131750451;
                        }
                        if (eVar != null) {
                            S2 = hl.N2(ob6.a0(null, null, i7, lbc.k(X1, true)), -1, 2, ue2Var2, null);
                        } else {
                            S2 = hl.S2(ob6.a0(null, null, i7, lbc.k(X1, true)));
                        }
                    }
                }
                c21Var2.g(2131624029, 30, 30, new String[0]);
            }
        } else {
            i6 = 2;
            if (i2 <= 1) {
                S2 = hl.S2(ob6.G(i, "FwdMessageToManyChats", new Object[0]));
            } else {
                S2 = hl.S2(ob6.G(i, "FwdMessagesToManyChats", new Object[0]));
            }
            c21Var2.g(2131624029, 30, 30, new String[0]);
        }
        c21Var2.b.setText(S2);
        if (z2) {
            Context context2 = c21Var2.getContext();
            if (eVar != null) {
                vnbVar2 = eVar.getResourceProvider();
            } else {
                vnbVar2 = null;
            }
            t21 t21Var = new t21(vnbVar2, context2, true, true);
            t21Var.b = null;
            t21Var.c = z21Var;
            c21Var2.setButton(t21Var);
        }
        c21Var2.postDelayed(new w21(c21Var2, (byte) 0), 300L);
        if (frameLayout != null) {
            g = v21.f(frameLayout, c21Var2, i5);
        } else if (eVar != null) {
            g = v21.g(eVar, c21Var2, i5);
        } else {
            iy8.d();
            return null;
        }
        if (c21Var2 instanceof g21) {
            c21Var2.b.setSingleLine(false);
            c21Var2.b.setMaxLines(i6);
            ((g21) c21Var2).setBulletin(g);
            g.s = false;
        }
        return g;
    }

    public static defpackage.v21 x(android.app.Activity r7, android.widget.FrameLayout r8, int r9, long r10, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d31.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):v21");
    }

    public static defpackage.v21 z(org.telegram.ui.ActionBar.e r6, int r7, int r8, defpackage.vnb r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d31.z(org.telegram.ui.ActionBar.e, int, int, vnb):v21");
    }

    public final v21 E(vnb vnbVar) {
        c21 c21Var = new c21(X(), vnbVar);
        c21Var.h(2131623982, new String[0]);
        c21Var.b.setText(ob6.M0(2131745949, null));
        return b(c21Var, 1500);
    }

    public final v21 G(int i, int i2, CharSequence charSequence) {
        int i3;
        SpannableStringBuilder spannableStringBuilder;
        c21 c21Var = new c21(X(), this.c);
        c21Var.g(i, 36, 36, new String[0]);
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (charSequence instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder) charSequence;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(charSequence);
            }
            int i4 = 0;
            for (int indexOf = charSequence2.indexOf(10); indexOf >= 0 && indexOf < charSequence.length(); indexOf = charSequence2.indexOf(10, indexOf + 1)) {
                if (i4 >= i2) {
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) " ");
                }
                i4++;
            }
            charSequence = spannableStringBuilder;
        }
        c21Var.b.setSingleLine(false);
        c21Var.b.setMaxLines(i2);
        c21Var.b.setText(charSequence);
        if (charSequence.length() < 20) {
            i3 = 1500;
        } else {
            i3 = 2750;
        }
        return b(c21Var, i3);
    }

    public final v21 H(int i, CharSequence charSequence) {
        return Q(i, 36, charSequence);
    }

    public final v21 I(int i, CharSequence charSequence, CharSequence charSequence2) {
        int i2;
        s21 s21Var = new s21(X(), this.c);
        s21Var.g(i, 36, 36, new String[0]);
        s21Var.b.setText(charSequence);
        s21Var.c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i2 = 1500;
        } else {
            i2 = 2750;
        }
        return b(s21Var, i2);
    }

    public final v21 J(int i, CharSequence charSequence, String str, int i2, boolean z, Runnable runnable) {
        Context X = X();
        vnb vnbVar = this.c;
        c21 c21Var = new c21(X, vnbVar);
        if (i != 0) {
            c21Var.g(i, 36, 36, new String[0]);
        } else {
            c21Var.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) c21Var.b.getLayoutParams()).leftMargin = hl.L(16.0f);
        }
        c21Var.b.setTextSize(1, 14.0f);
        c21Var.b.setTextDirection(5);
        c21Var.b.setSingleLine(false);
        c21Var.b.setMaxLines(3);
        c21Var.b.setText(charSequence);
        t21 t21Var = new t21(vnbVar, X(), true, z);
        t21Var.e(str);
        t21Var.b = runnable;
        c21Var.setButton(t21Var);
        return b(c21Var, i2);
    }

    public final v21 K(int i, CharSequence charSequence, String str, Runnable runnable) {
        int i2;
        if (charSequence.length() < 20) {
            i2 = 1500;
        } else {
            i2 = 2750;
        }
        return J(i, charSequence, str, i2, false, runnable);
    }

    public final v21 L(int i, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context X = X();
        vnb vnbVar = this.c;
        s21 s21Var = new s21(X, vnbVar);
        s21Var.g(i, 36, 36, new String[0]);
        s21Var.b.setText(str);
        s21Var.c.setText(charSequence);
        t21 t21Var = new t21(vnbVar, X(), true);
        t21Var.e(str2);
        t21Var.b = runnable;
        s21Var.setButton(t21Var);
        return b(s21Var, 5000);
    }

    public final v21 M(Drawable drawable, CharSequence charSequence) {
        c21 c21Var = new c21(X(), this.c);
        e29 e29Var = c21Var.a;
        e29Var.setImageDrawable(drawable);
        if (drawable instanceof b48) {
            ((b48) drawable).e(e29Var);
        }
        c21Var.b.setText(charSequence);
        c21Var.b.setSingleLine(false);
        c21Var.b.setMaxLines(2);
        return b(c21Var, 2750);
    }

    public final v21 N(String str, String str2) {
        s21 s21Var = new s21(X(), this.c);
        s21Var.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) s21Var.d.getLayoutParams()).setMarginStart(hl.L(10.0f));
        s21Var.b.setText(str);
        s21Var.c.setText(str2);
        return b(s21Var, 5000);
    }

    public final v21 O(TLRPC.Document document, String str, String str2) {
        int i;
        if (document == null) {
            return new v21();
        }
        r21 r21Var = new r21(X(), this.c);
        TLRPC.PhotoSize w = xb4.w(document.thumbs, hl.L(28.0f), true, null, false);
        jn5 c = jn5.c(xb4.w(document.thumbs, hl.L(28.0f), true, w, true), document);
        jn5 c2 = jn5.c(w, document);
        de0 de0Var = r21Var.a;
        de0Var.g(0, 0L, c, c2, null, "28_28", "28_28", null);
        de0Var.getImageReceiver().q0(hl.L(5.0f));
        TextView textView = r21Var.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(hl.o());
        TextView textView2 = r21Var.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i = 1500;
        } else {
            i = 2750;
        }
        return b(r21Var, i);
    }

    public final v21 P(int i, CharSequence charSequence) {
        int i2;
        c21 c21Var = new c21(X(), this.c);
        c21Var.g(i, 36, 36, new String[0]);
        c21Var.b.setText(charSequence);
        c21Var.b.setSingleLine(false);
        c21Var.b.setTextSize(1, 14.0f);
        c21Var.b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i2 = 1500;
        } else {
            i2 = 2750;
        }
        return b(c21Var, i2);
    }

    public final v21 Q(int i, int i2, CharSequence charSequence) {
        int i3;
        c21 c21Var = new c21(X(), this.c);
        c21Var.g(i, i2, i2, new String[0]);
        c21Var.b.setText(charSequence);
        c21Var.b.setSingleLine(false);
        c21Var.b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i3 = 1500;
        } else {
            i3 = 2750;
        }
        return b(c21Var, i3);
    }

    public final v21 R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i;
        if (document == null) {
            return new v21();
        }
        r21 r21Var = new r21(X(), this.c);
        TLRPC.PhotoSize w = xb4.w(document.thumbs, hl.L(28.0f), true, null, false);
        jn5 c = jn5.c(xb4.w(document.thumbs, hl.L(28.0f), true, w, true), document);
        jn5 c2 = jn5.c(w, document);
        de0 de0Var = r21Var.a;
        de0Var.g(0, 0L, c, c2, null, "28_28", "28_28", null);
        de0Var.getImageReceiver().q0(hl.L(5.0f));
        TextView textView = r21Var.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        r21Var.c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i = 1500;
        } else {
            i = 2750;
        }
        return b(r21Var, i);
    }

    public final v21 T(String str) {
        c21 c21Var = new c21(X(), null);
        c21Var.h(2131623990, new String[0]);
        c21Var.b.setText(str);
        c21Var.b.setSingleLine(false);
        c21Var.b.setMaxLines(2);
        return b(c21Var, 1500);
    }

    public final v21 U(String str, boolean z, Runnable runnable, Runnable runnable2) {
        Context X = X();
        vnb vnbVar = this.c;
        c21 c21Var = new c21(X, vnbVar);
        c21Var.b.setText(str);
        c21Var.b.setSingleLine(false);
        c21Var.b.setMaxLines(2);
        c21Var.setTimer();
        t21 t21Var = new t21(vnbVar, X(), true, z);
        t21Var.e(ob6.M0(2131743540, null));
        t21Var.b = runnable;
        t21Var.c = runnable2;
        c21Var.setButton(t21Var);
        return b(c21Var, 5000);
    }

    public final v21 V(List list, CharSequence charSequence, CharSequence charSequence2, qx6 qx6Var) {
        boolean z;
        float f;
        int i;
        Context X = X();
        if (charSequence2 != null) {
            z = true;
        } else {
            z = false;
        }
        vnb vnbVar = this.c;
        u21 u21Var = new u21(vnbVar, X, z);
        jc0 jc0Var = u21Var.a;
        if (list != null) {
            int i2 = 0;
            i = 0;
            for (int i3 = 3; i2 < list.size() && i < i3; i3 = 3) {
                TLObject tLObject = (TLObject) list.get(i2);
                if (tLObject != null) {
                    int i4 = i + 1;
                    jc0Var.setCount(i4);
                    jc0Var.b(i, yac.t0, tLObject);
                    i = i4;
                }
                i2++;
            }
            f = 4.0f;
            if (list.size() == 1) {
                jc0Var.setTranslationX(hl.L(4.0f));
                jc0Var.setScaleX(1.2f);
                jc0Var.setScaleY(1.2f);
            } else {
                jc0Var.setScaleX(1.0f);
                jc0Var.setScaleY(1.0f);
            }
        } else {
            f = 4.0f;
            i = 0;
        }
        jc0Var.a(false);
        p66 p66Var = u21Var.b;
        if (charSequence2 != null) {
            p66Var.setSingleLine(true);
            p66Var.setMaxLines(1);
            p66Var.setText(charSequence);
            p66 p66Var2 = u21Var.c;
            p66Var2.setText(charSequence2);
            p66Var2.setSingleLine(false);
            p66Var2.setMaxLines(3);
            LinearLayout linearLayout = u21Var.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = hl.L(70 - ((3 - i) * 12));
                if (i == 1) {
                    L += hl.L(f);
                }
                if (ob6.a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            p66Var.setSingleLine(false);
            p66Var.setMaxLines(4);
            p66Var.setText(charSequence);
            if (p66Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = hl.L(70 - ((3 - i) * 12));
                if (i == 1) {
                    p66Var.setTranslationY(-hl.L(1.0f));
                    L2 += hl.L(f);
                }
                if (ob6.a0) {
                    ((ViewGroup.MarginLayoutParams) p66Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) p66Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (qx6Var != null) {
            t21 t21Var = new t21(vnbVar, X(), true);
            t21Var.e(ob6.M0(2131743540, null));
            t21Var.b = (Runnable) qx6Var.b;
            t21Var.c = (Runnable) qx6Var.c;
            u21Var.setButton(t21Var);
        }
        return b(u21Var, 5000);
    }

    public final Context X() {
        Context context;
        e eVar = this.a;
        if (eVar != null) {
            context = eVar.getParentActivity();
            if (context == null && this.a.getLayoutContainer() != null) {
                context = this.a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return a.b;
        }
        return context;
    }

    public final v21 Z(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.E1) {
            return new v21();
        }
        if (tL_error == null) {
            return t(ob6.a0(null, null, 2131743534, new Object[0]), null);
        }
        return t(W(tL_error.text), null);
    }

    public final v21 b(z11 z11Var, int i) {
        e eVar = this.a;
        if (eVar != null) {
            return v21.g(eVar, z11Var, i);
        }
        return v21.f(this.b, z11Var, i);
    }

    public final v21 c(CharSequence charSequence) {
        if (X() == null) {
            return new v21();
        }
        c21 c21Var = new c21(X(), this.c);
        c21Var.h(2131624049, "Shield");
        c21Var.b.setSingleLine(false);
        c21Var.b.setMaxLines(3);
        c21Var.b.setText(charSequence);
        return b(c21Var, 2750);
    }

    public final v21 e(boolean z) {
        String M0;
        c21 c21Var = new c21(X(), this.c);
        if (z) {
            c21Var.h(2131624050, "Hand");
            M0 = ob6.M0(2131743416, null);
        } else {
            c21Var.h(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = ob6.M0(2131743330, null);
        }
        c21Var.b.setText(hl.S2(M0));
        return b(c21Var, 1500);
    }

    public final v21 f(int i, Runnable runnable) {
        c21 c21Var = new c21(X(), null);
        c21Var.h(2131623970, new String[0]);
        String G = ob6.G(i, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(hl.S2(G));
        int indexOf = G.indexOf(42);
        int i2 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i2);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i2, indexOf2));
        valueOf.setSpan(new wk(runnable, (byte) 2), indexOf, indexOf2 - 1, 33);
        c21Var.b.setText(valueOf);
        c21Var.b.setSingleLine(false);
        c21Var.b.setMaxLines(3);
        return b(c21Var, 5000);
    }

    public final void f0(String str, boolean z) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            v21 t = t(ob6.a0(null, null, 2131743534, new Object[0]), null);
            t.s = false;
            t.k(z);
            return;
        }
        v21 t2 = t(W(str), null);
        t2.s = false;
        t2.k(z);
    }

    public final v21 g(String str, ArrayList arrayList) {
        jc0 jc0Var;
        u21 u21Var = new u21(this.c, X(), false);
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            jc0Var = u21Var.a;
            if (i >= size || i2 >= 3) {
                break;
            }
            TLObject tLObject = (TLObject) arrayList.get(i);
            if (tLObject != null) {
                int i3 = i2 + 1;
                jc0Var.setCount(i3);
                jc0Var.b(i2, yac.t0, tLObject);
                i2 = i3;
            }
            i++;
        }
        if (arrayList.size() == 1) {
            jc0Var.setTranslationX(hl.L(4.0f));
            jc0Var.setScaleX(1.2f);
            jc0Var.setScaleY(1.2f);
        } else {
            jc0Var.setScaleX(1.0f);
            jc0Var.setScaleY(1.0f);
        }
        jc0Var.a(false);
        p66 p66Var = u21Var.b;
        p66Var.setSingleLine(false);
        p66Var.setMaxLines(2);
        p66Var.setText(str);
        if (p66Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = hl.L(74 - ((3 - i2) * 12));
            if (ob6.a0) {
                ((ViewGroup.MarginLayoutParams) p66Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) p66Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (ob6.a0) {
            jc0Var.setTranslationX(hl.L(32 - ((i2 - 1) * 12)));
        }
        return b(u21Var, 5000);
    }

    public final void g0(TLRPC.TL_error tL_error, boolean z) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                v21 t = t(ob6.a0(null, null, 2131743534, new Object[0]), null);
                t.s = false;
                t.k(z);
            } else if (tL_error.code != 406) {
                v21 t2 = t(W(tL_error.text), null);
                t2.s = false;
                t2.k(z);
            }
        }
    }

    public final v21 h(TLRPC.Document document, final int i, final pcc pccVar) {
        SpannableStringBuilder spannableStringBuilder;
        ya6 ya6Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder S2;
        final TLRPC.InputStickerSet i1 = r47.i1(document);
        if (i1 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet n0 = ls6.d0(yac.t0).n0(i1, true);
        if (n0 != null && (stickerSet = n0.set) != null) {
            if (i == 1) {
                S2 = hl.S2(ob6.a0("TopicContainsEmojiPackSingle", null, 2131743679, stickerSet.title));
            } else {
                String str = stickerSet.title;
                if (i == 2) {
                    S2 = hl.S2(ob6.a0("StoryContainsEmojiPackSingle", null, 2131744353, str));
                } else {
                    S2 = hl.S2(ob6.a0("MessageContainsEmojiPackSingle", null, 2131748350, str));
                }
            }
            return r(document, S2, ob6.M0(2131743215, null), new Runnable() {
                @Override
                public final void run() {
                    byte b = r3;
                    TLRPC.InputStickerSet inputStickerSet2 = i1;
                    pcc pccVar2 = pccVar;
                    switch (b) {
                        case 0:
                            pccVar2.a(inputStickerSet2);
                            return;
                        default:
                            pccVar2.a(inputStickerSet2);
                            return;
                    }
                }
            });
        }
        if (i == 1) {
            spannableStringBuilder = new SpannableStringBuilder(hl.S2(ob6.a0("TopicContainsEmojiPackSingle", null, 2131743679, "<{LOADING}>")));
        } else if (i == 2) {
            spannableStringBuilder = new SpannableStringBuilder(hl.S2(ob6.a0("StoryContainsEmojiPackSingle", null, 2131744353, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(hl.S2(ob6.a0("MessageContainsEmojiPackSingle", null, 2131748350, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        vnb vnbVar = this.c;
        if (indexOf >= 0) {
            ya6Var = new ya6(null, hl.L(100.0f), hl.L(2.0f), vnbVar);
            spannableStringBuilder.setSpan(ya6Var, indexOf, indexOf + 11, 33);
            int i2 = aob.yj;
            ya6Var.a(vm2.o(aob.v0(i2, vnbVar), 32), vm2.o(aob.v0(i2, vnbVar), 72));
        } else {
            ya6Var = null;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        String M0 = ob6.M0(2131743215, null);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                TLRPC.InputStickerSet inputStickerSet2 = i1;
                pcc pccVar2 = pccVar;
                switch (b) {
                    case 0:
                        pccVar2.a(inputStickerSet2);
                        return;
                    default:
                        pccVar2.a(inputStickerSet2);
                        return;
                }
            }
        };
        Context X = X();
        ?? c21Var = new c21(X, vnbVar);
        p66 p66Var = new p66(X, null);
        c21Var.d = p66Var;
        p66Var.setDisablePaddingsOffset(true);
        p66Var.setSingleLine();
        p66Var.setTypeface(Typeface.SANS_SERIF);
        p66Var.setTextSize(1, 15.0f);
        p66Var.setEllipsize(TextUtils.TruncateAt.END);
        p66Var.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        c21Var.b.setVisibility(8);
        c21Var.addView(p66Var, tre.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i3 = aob.yj;
        c21Var.setTextColor(c21Var.getThemedColor(i3));
        if (r47.B4(document)) {
            inputStickerSet = i1;
            yob.s(c21Var.a, i3, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i1;
        }
        c21Var.i(document, new String[0]);
        c21Var.b.setTextSize(1, 14.0f);
        c21Var.b.setSingleLine(false);
        c21Var.b.setMaxLines(3);
        p66Var.setText(spannableStringBuilder);
        p66Var.setTextSize(1, 14.0f);
        p66Var.setSingleLine(false);
        p66Var.setMaxLines(3);
        t21 t21Var = new t21(vnbVar, X(), true);
        t21Var.e(M0);
        t21Var.b = runnable;
        c21Var.setButton(t21Var);
        final v21 b = b(c21Var, 2750);
        if (ya6Var != null) {
            z11 z11Var = b.e;
            if (z11Var instanceof a21) {
                ya6Var.b = ((a21) z11Var).d;
            }
        }
        ls6.d0(yac.t0).m0(inputStickerSet, null, false, false, new pcc() {
            @Override
            public final void a(Object obj) {
                Object M02;
                TLRPC.StickerSet stickerSet2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null) {
                    String str2 = stickerSet2.title;
                    byte b2 = i;
                    if (b2 == 1) {
                        M02 = hl.S2(ob6.a0("TopicContainsEmojiPackSingle", null, 2131743679, str2));
                    } else if (b2 == 2) {
                        M02 = hl.S2(ob6.a0("StoryContainsEmojiPackSingle", null, 2131744353, str2));
                    } else {
                        M02 = hl.S2(ob6.a0("MessageContainsEmojiPackSingle", null, 2131748350, str2));
                    }
                } else {
                    M02 = ob6.M0(2131754428, null);
                }
                hl.d3(new a30(b, M02, (byte) 29), Math.max(1L, 750 - (System.currentTimeMillis() - currentTimeMillis)));
            }
        });
        return b;
    }

    public final boolean h0(int i, long j) {
        e eVar;
        SpannableStringBuilder N2;
        if (yac.h(yac.t0).p() && (eVar = this.a) != null) {
            g21 g21Var = new g21(i, eVar);
            if (j == yac.h(yac.t0).n) {
                if (i <= 1) {
                    N2 = hl.N2(ob6.M0(2131750459, null), -1, 2, new kc((byte) 15), null);
                } else {
                    N2 = hl.N2(ob6.M0(2131750452, null), -1, 2, new kc((byte) 15), null);
                }
                g21Var.g(2131624185, 36, 36, new String[0]);
                g21Var.b.setText(N2);
                g21Var.b.setSingleLine(false);
                g21Var.b.setMaxLines(2);
                v21 b = b(g21Var, 3500);
                g21Var.setBulletin(b);
                b.s = false;
                b.k(true);
                return true;
            }
        }
        return false;
    }

    public final v21 i(String str) {
        if (!hl.C3()) {
            return new v21();
        }
        c21 c21Var = new c21(X(), null);
        c21Var.g(2131623994, 36, 36, "NULL ROTATION", "Back", "Front");
        c21Var.b.setText(str);
        return b(c21Var, 1500);
    }

    public final v21 k(boolean z) {
        if (!hl.C3()) {
            return new v21();
        }
        vnb vnbVar = this.c;
        if (z) {
            s21 s21Var = new s21(X(), vnbVar);
            s21Var.g(2131624341, 36, 36, "Wibe", "Circle");
            s21Var.b.setText(ob6.M0(2131748675, null));
            s21Var.c.setText(ob6.M0(2131748673, null));
            return b(s21Var, 2750);
        }
        c21 c21Var = new c21(X(), vnbVar);
        c21Var.g(2131624341, 36, 36, "Wibe", "Circle");
        c21Var.b.setText(ob6.M0(2131748675, null));
        return b(c21Var, 1500);
    }

    public final v21 m(c31 c31Var, int i, int i2, int i3, vnb vnbVar) {
        c21 c21Var;
        String M0;
        if (i2 != 0 && i3 != 0) {
            c21Var = new c21(i2, i3, vnbVar, X());
        } else {
            c21Var = new c21(X(), vnbVar);
        }
        b31 b31Var = c31Var.d;
        c21Var.h(b31Var.a, b31Var.b);
        TextView textView = c21Var.b;
        boolean z = c31Var.c;
        String str = c31Var.a;
        if (z) {
            M0 = ob6.G(i, str, new Object[0]);
        } else {
            M0 = ob6.M0(c31Var.b, str);
        }
        textView.setText(hl.N2(M0, -1, 0, new kc((byte) 14), null));
        byte b = c31Var.d.c;
        if (b != 0) {
            c21Var.setIconPaddingBottom(b);
        }
        return b(c21Var, 1500);
    }

    public final v21 n(c31 c31Var, int i, vnb vnbVar) {
        return m(c31Var, i, 0, 0, vnbVar);
    }

    public final v21 o(c31 c31Var, vnb vnbVar) {
        return m(c31Var, 1, 0, 0, vnbVar);
    }

    public final v21 p(long j, String str, String str2) {
        Context X = X();
        vnb vnbVar = this.c;
        q21 q21Var = new q21(X, vnbVar);
        wl wlVar = new wl(1, yac.t0, j);
        de0 de0Var = q21Var.a;
        de0Var.setAnimatedEmojiDrawable(wlVar);
        de0Var.setEmojiColorFilter(new PorterDuffColorFilter(aob.v0(aob.G6, vnbVar), PorterDuff.Mode.SRC_IN));
        q21Var.b.setText(str);
        q21Var.c.setText(str2);
        return b(q21Var, 2750);
    }

    public final v21 q(TLRPC.Document document, CharSequence charSequence) {
        c21 c21Var = new c21(X(), this.c);
        if (r47.B4(document)) {
            yob.s(c21Var.a, aob.yj, null, PorterDuff.Mode.SRC_IN);
        }
        c21Var.i(document, new String[0]);
        c21Var.b.setText(charSequence);
        c21Var.b.setTextSize(1, 14.0f);
        c21Var.b.setSingleLine(false);
        c21Var.b.setMaxLines(3);
        return b(c21Var, 2750);
    }

    public final v21 r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context X = X();
        vnb vnbVar = this.c;
        c21 c21Var = new c21(X, vnbVar);
        boolean B4 = r47.B4(document);
        e29 e29Var = c21Var.a;
        if (B4) {
            yob.s(e29Var, aob.yj, null, PorterDuff.Mode.SRC_IN);
        }
        c21Var.i(document, new String[0]);
        if (e29Var.getImageReceiver() != null) {
            e29Var.getImageReceiver().q0(hl.L(4.0f));
        }
        c21Var.b.setText(charSequence);
        c21Var.b.setTextSize(1, 14.0f);
        c21Var.b.setSingleLine(false);
        c21Var.b.setMaxLines(3);
        t21 t21Var = new t21(vnbVar, X(), true);
        t21Var.e(str);
        t21Var.b = runnable;
        c21Var.setButton(t21Var);
        return b(c21Var, 2750);
    }

    public final v21 s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i;
        s21 s21Var = new s21(X(), this.c);
        boolean B4 = r47.B4(document);
        e29 e29Var = s21Var.a;
        if (B4) {
            yob.s(e29Var, aob.yj, null, PorterDuff.Mode.SRC_IN);
        }
        e29Var.setAutoRepeat(true);
        e29Var.g(36, 36, document);
        s21Var.b.setText(str);
        s21Var.c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i = 1500;
        } else {
            i = 2750;
        }
        return b(s21Var, i);
    }

    public final v21 t(CharSequence charSequence, vnb vnbVar) {
        c21 c21Var = new c21(X(), vnbVar);
        c21Var.h(2131623982, new String[0]);
        c21Var.b.setText(charSequence);
        c21Var.b.setSingleLine(false);
        c21Var.b.setMaxLines(2);
        return b(c21Var, 1500);
    }

    public final v21 u(String str, String str2, vnb vnbVar) {
        s21 s21Var = new s21(X(), vnbVar);
        s21Var.g(2131623982, 32, 32, new String[0]);
        s21Var.b.setText(str);
        s21Var.c.setText(str2);
        return b(s21Var, 1500);
    }

    public final v21 w(int i, CharSequence charSequence) {
        Context X = X();
        vnb vnbVar = this.c;
        c21 c21Var = new c21(X, vnbVar);
        c21Var.setBackground(aob.v0(aob.wj, vnbVar), 12);
        c21Var.a.setImageResource(i);
        c21Var.b.setText(charSequence);
        c21Var.b.setSingleLine(false);
        c21Var.b.setLines(2);
        c21Var.b.setMaxLines(4);
        TextView textView = c21Var.b;
        textView.setMaxWidth(kg5.a(textView.getText(), c21Var.b.getPaint()));
        c21Var.b.setLineSpacing(hl.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) c21Var.b.getLayoutParams()).rightMargin = hl.L(12.0f);
        c21Var.setWrapWidth();
        return b(c21Var, 5000);
    }

    public final v21 y(int i, TLRPC.Document document, bt btVar) {
        String M0;
        Context X = X();
        vnb vnbVar = this.c;
        c21 c21Var = new c21(X, vnbVar);
        c21Var.g(2131624281, 36, 36, new String[0]);
        c21Var.removeView(c21Var.b);
        gm gmVar = new gm(c21Var.getContext());
        c21Var.b = gmVar;
        gmVar.setTypeface(Typeface.SANS_SERIF);
        c21Var.b.setTextSize(1, 15.0f);
        c21Var.b.setEllipsize(TextUtils.TruncateAt.END);
        c21Var.b.setPadding(0, 0, 0, hl.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(hl.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new hm(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = c21Var.b;
        if (i > 1) {
            M0 = ob6.G(i, "SavedTagMessagesTagged", new Object[0]);
        } else {
            M0 = ob6.M0(2131745606, null);
        }
        textView.setText(new SpannableStringBuilder(M0).append((CharSequence) " ").append((CharSequence) spannableString));
        if (btVar != null) {
            t21 t21Var = new t21(vnbVar, X(), true);
            t21Var.e(ob6.M0(2131743215, null));
            t21Var.b = btVar;
            c21Var.setButton(t21Var);
        }
        c21Var.setTextColor(aob.v0(aob.yj, vnbVar));
        c21Var.addView(c21Var.b, tre.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(c21Var, 2750);
    }

    public d31(FrameLayout frameLayout, vnb vnbVar) {
        this.b = frameLayout;
        this.a = null;
        this.c = vnbVar;
    }
}
