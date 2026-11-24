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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class u21 {
    public final d a;
    public final FrameLayout b;
    public final wjb c;

    public u21(d dVar) {
        if (dVar != null && dVar.getLastStoryViewer() != null && dVar.getLastStoryViewer().z()) {
            this.a = null;
            y28 currentPeerView = dVar.getLastStoryViewer().o0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.S0 : null;
            this.c = dVar.getLastStoryViewer().E;
            return;
        }
        this.a = dVar;
        this.b = null;
        this.c = dVar != null ? dVar.getResourceProvider() : null;
    }

    public static m21 A(d dVar, boolean z, wjb wjbVar) {
        int i;
        if (z) {
            i = 3;
        } else {
            i = 4;
        }
        return z(dVar, i, 0, wjbVar);
    }

    public static m21 B(d dVar, boolean z, tn6 tn6Var, bl1 bl1Var, wjb wjbVar) {
        int i;
        String str;
        int i2;
        int i3;
        t11 t11Var = new t11(dVar.getParentActivity(), wjbVar);
        if (z) {
            i = 2131624055;
        } else {
            i = 2131624061;
        }
        t11Var.c(i, 28, 28, "Pin", "Line");
        TextView textView = t11Var.b;
        if (z) {
            str = "MessagePinnedHint";
            i2 = 2131748352;
        } else {
            str = "MessageUnpinnedHint";
            i2 = 2131748274;
        }
        textView.setText(k96.M0(i2, str));
        if (!z) {
            k21 k21Var = new k21(wjbVar, dVar.getParentActivity(), true);
            k21Var.b = tn6Var;
            k21Var.c = bl1Var;
            t11Var.setButton(k21Var);
            i3 = 5000;
        } else {
            i3 = 1500;
        }
        return m21.g(dVar, t11Var, i3);
    }

    public static m21 C(String str, d dVar) {
        t11 t11Var = new t11(dVar.getParentActivity(), dVar.getResourceProvider());
        t11Var.d(2131624049, "Shield");
        de9.r("UserSetAsAdminHint", null, 2131743441, new Object[]{str}, t11Var.b);
        return m21.g(dVar, t11Var, 1500);
    }

    public static m21 D(d dVar, TLRPC.User user, String str) {
        String str2;
        t11 t11Var = new t11(dVar.getParentActivity(), dVar.getResourceProvider());
        t11Var.d(2131624050, "Hand");
        if (user.deleted) {
            str2 = k96.a0("HiddenName", null, 2131749136, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        de9.r("UserRemovedFromChatHint", null, 2131743492, new Object[]{str2, str}, t11Var.b);
        return m21.g(dVar, t11Var, 1500);
    }

    public static m21 F(FrameLayout frameLayout, boolean z) {
        t21 t21Var;
        u21 u21Var = new u21(frameLayout, null);
        if (z) {
            t21Var = t21.h;
        } else {
            t21Var = t21.e;
        }
        return u21Var.m(t21Var, 1, -115203550, -1, null);
    }

    public static m21 S(int i, wjb wjbVar, d dVar) {
        String M0;
        t11 t11Var = new t11(dVar.getParentActivity(), wjbVar);
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                M0 = k96.M0(2131745084, null);
                z = false;
            } else {
                sc8.e();
                return null;
            }
        } else {
            M0 = k96.M0(2131745082, null);
        }
        if (z) {
            t11Var.d(2131624197, new String[0]);
        } else {
            t11Var.d(2131624196, new String[0]);
        }
        t11Var.b.setText(M0);
        return m21.g(dVar, t11Var, 1500);
    }

    public static String W(String str) {
        if ("STARGIFT_ALREADY_TRANSFERRED".equals(str)) {
            return k96.M0(2131749736, null);
        }
        return k96.a0(null, null, 2131743639, str);
    }

    public static u21 Y() {
        d S = LaunchActivity.S();
        if (S == null) {
            return new u21(f11.a(a.b), null);
        }
        Dialog dialog = S.visibleDialog;
        if (dialog instanceof fx0) {
            return new u21(((fx0) dialog).c, S.getResourceProvider());
        }
        return b0(S);
    }

    public static boolean a(d dVar) {
        if (dVar != null && dVar.getParentActivity() != null && dVar.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static u21 a0(FrameLayout frameLayout, wjb wjbVar) {
        return new u21(frameLayout, wjbVar);
    }

    public static u21 b0(d dVar) {
        if (dVar == null) {
            return Y();
        }
        return new u21(dVar);
    }

    public static void c0(String str) {
        if (!LaunchActivity.E1) {
            return;
        }
        Y().t(W(str), null).j();
    }

    public static m21 d(d dVar, boolean z) {
        String M0;
        t11 t11Var = new t11(dVar.getParentActivity(), dVar.getResourceProvider());
        if (z) {
            t11Var.d(2131624050, "Hand");
            M0 = k96.M0(2131743522, null);
        } else {
            t11Var.d(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = k96.M0(2131743436, null);
        }
        t11Var.b.setText(gl.S2(M0));
        return m21.g(dVar, t11Var, 1500);
    }

    public static void d0(String str, FrameLayout frameLayout, wjb wjbVar) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (frameLayout == null) {
            c0(str);
            return;
        }
        m21 t = new u21(frameLayout, wjbVar).t(W(str), null);
        t.r = false;
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

    public static m21 j(d dVar) {
        return b0(dVar).k(false);
    }

    public static m21 l(String str, d dVar, boolean z) {
        int i;
        String M0;
        int i2;
        int i3;
        t11 t11Var = new t11(dVar.getParentActivity(), dVar.getResourceProvider());
        if (str != null) {
            if (z) {
                i3 = 2131751400;
            } else {
                i3 = 2131751398;
            }
            M0 = k96.a0(null, null, i3, str);
        } else {
            if (z) {
                i = 2131751401;
            } else {
                i = 2131751399;
            }
            M0 = k96.M0(i, null);
        }
        t11Var.b.setText(gl.S2(M0));
        if (!z && str == null) {
            i2 = 2131623990;
        } else {
            i2 = 2131624007;
        }
        t11Var.d(i2, new String[0]);
        return m21.g(dVar, t11Var, 5000);
    }

    public static m21 v(Context context, d dVar, FrameLayout frameLayout, int i, long j, int i2, int i3, int i4, int i5, boolean z, de2 de2Var) {
        t11 t11Var;
        wjb wjbVar;
        boolean z2;
        q21 q21Var;
        int i6;
        SpannableStringBuilder S2;
        m21 g;
        wjb wjbVar2;
        int i7;
        int i8;
        jc jcVar;
        if (y6c.h(y6c.t0).p() && dVar != null && i <= 1 && j == y6c.h(y6c.t0).n && !z) {
            t11Var = new x11(i2, dVar);
        } else {
            if (dVar != null) {
                wjbVar = dVar.getResourceProvider();
            } else {
                wjbVar = null;
            }
            t11Var = new t11(i3, i4, wjbVar, context);
        }
        t11 t11Var2 = t11Var;
        if (de2Var == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean[] zArr = {false};
        if (de2Var != null) {
            q21Var = new q21(zArr, de2Var, (byte) 0);
        } else {
            q21Var = null;
        }
        if (i <= 1) {
            if (j == y6c.h(y6c.t0).n) {
                if (i2 <= 1) {
                    String M0 = k96.M0(2131750482, null);
                    if (z) {
                        jcVar = new jc((byte) 16);
                    } else {
                        jcVar = new jc((byte) 14);
                    }
                    S2 = gl.N2(M0, -1, 2, jcVar, null);
                } else {
                    S2 = gl.N2(k96.M0(2131750475, null), -1, 2, new jc((byte) 14), null);
                }
                t11Var2.c(2131624185, 30, 30, new String[0]);
                i6 = 2;
            } else {
                i6 = 2;
                de2 de2Var2 = new de2(q21Var, dVar, j, (byte) 12);
                boolean y = cf3.y(j);
                int i9 = y6c.t0;
                if (y) {
                    TLRPC.Chat K0 = na7.q1(i9).K0(Long.valueOf(-j));
                    if (i2 <= 1) {
                        if (dVar != null) {
                            S2 = gl.N2(k96.a0(null, null, 2131750486, K0.title), -1, 2, de2Var2, null);
                        } else {
                            S2 = gl.S2(k96.a0(null, null, 2131750486, K0.title));
                        }
                    } else if (dVar != null) {
                        S2 = gl.N2(k96.a0(null, null, 2131750479, K0.title), -1, 2, de2Var2, null);
                    } else {
                        S2 = gl.S2(k96.a0(null, null, 2131750479, K0.title));
                    }
                } else {
                    TLRPC.User V1 = na7.q1(i9).V1(Long.valueOf(j));
                    if (i2 <= 1) {
                        if (z2) {
                            i8 = 2131750480;
                        } else {
                            i8 = 2131750481;
                        }
                        if (dVar != null) {
                            S2 = gl.N2(k96.a0(null, null, i8, l7c.k(V1, true)), -1, 2, de2Var2, null);
                        } else {
                            S2 = gl.S2(k96.a0(null, null, i8, l7c.k(V1, true)));
                        }
                    } else {
                        if (z2) {
                            i7 = 2131750473;
                        } else {
                            i7 = 2131750474;
                        }
                        if (dVar != null) {
                            S2 = gl.N2(k96.a0(null, null, i7, l7c.k(V1, true)), -1, 2, de2Var2, null);
                        } else {
                            S2 = gl.S2(k96.a0(null, null, i7, l7c.k(V1, true)));
                        }
                    }
                }
                t11Var2.c(2131624029, 30, 30, new String[0]);
            }
        } else {
            i6 = 2;
            if (i2 <= 1) {
                S2 = gl.S2(k96.G(i, "FwdMessageToManyChats", new Object[0]));
            } else {
                S2 = gl.S2(k96.G(i, "FwdMessagesToManyChats", new Object[0]));
            }
            t11Var2.c(2131624029, 30, 30, new String[0]);
        }
        t11Var2.b.setText(S2);
        if (z2) {
            Context context2 = t11Var2.getContext();
            if (dVar != null) {
                wjbVar2 = dVar.getResourceProvider();
            } else {
                wjbVar2 = null;
            }
            k21 k21Var = new k21(wjbVar2, context2, true, true);
            k21Var.b = null;
            k21Var.c = q21Var;
            t11Var2.setButton(k21Var);
        }
        t11Var2.postDelayed(new n21(t11Var2, (byte) 1), 300L);
        if (frameLayout != null) {
            g = m21.f(frameLayout, t11Var2, i5);
        } else if (dVar != null) {
            g = m21.g(dVar, t11Var2, i5);
        } else {
            sc8.e();
            return null;
        }
        if (t11Var2 instanceof x11) {
            t11Var2.b.setSingleLine(false);
            t11Var2.b.setMaxLines(i6);
            ((x11) t11Var2).setBulletin(g);
            g.r = false;
        }
        return g;
    }

    public static defpackage.m21 x(android.app.Activity r7, android.widget.FrameLayout r8, int r9, long r10, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u21.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):m21");
    }

    public static defpackage.m21 z(org.telegram.ui.ActionBar.d r6, int r7, int r8, defpackage.wjb r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u21.z(org.telegram.ui.ActionBar.d, int, int, wjb):m21");
    }

    public final m21 E(wjb wjbVar) {
        t11 t11Var = new t11(X(), wjbVar);
        t11Var.d(2131623982, new String[0]);
        t11Var.b.setText(k96.M0(2131746029, null));
        return b(t11Var, 1500);
    }

    public final m21 G(int i, int i2, CharSequence charSequence) {
        int i3;
        SpannableStringBuilder spannableStringBuilder;
        t11 t11Var = new t11(X(), this.c);
        t11Var.c(i, 36, 36, new String[0]);
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
        t11Var.b.setSingleLine(false);
        t11Var.b.setMaxLines(i2);
        t11Var.b.setText(charSequence);
        if (charSequence.length() < 20) {
            i3 = 1500;
        } else {
            i3 = 2750;
        }
        return b(t11Var, i3);
    }

    public final m21 H(int i, CharSequence charSequence) {
        return Q(i, 36, charSequence);
    }

    public final m21 I(int i, CharSequence charSequence, CharSequence charSequence2) {
        int i2;
        j21 j21Var = new j21(X(), this.c);
        j21Var.c(i, 36, 36, new String[0]);
        j21Var.b.setText(charSequence);
        j21Var.c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i2 = 1500;
        } else {
            i2 = 2750;
        }
        return b(j21Var, i2);
    }

    public final m21 J(int i, CharSequence charSequence, String str, int i2, boolean z, Runnable runnable) {
        Context X = X();
        wjb wjbVar = this.c;
        t11 t11Var = new t11(X, wjbVar);
        if (i != 0) {
            t11Var.c(i, 36, 36, new String[0]);
        } else {
            t11Var.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) t11Var.b.getLayoutParams()).leftMargin = gl.L(16.0f);
        }
        t11Var.b.setTextSize(1, 14.0f);
        t11Var.b.setTextDirection(5);
        t11Var.b.setSingleLine(false);
        t11Var.b.setMaxLines(3);
        t11Var.b.setText(charSequence);
        k21 k21Var = new k21(wjbVar, X(), true, z);
        k21Var.e(str);
        k21Var.b = runnable;
        t11Var.setButton(k21Var);
        return b(t11Var, i2);
    }

    public final m21 K(int i, CharSequence charSequence, String str, Runnable runnable) {
        int i2;
        if (charSequence.length() < 20) {
            i2 = 1500;
        } else {
            i2 = 2750;
        }
        return J(i, charSequence, str, i2, false, runnable);
    }

    public final m21 L(int i, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context X = X();
        wjb wjbVar = this.c;
        j21 j21Var = new j21(X, wjbVar);
        j21Var.c(i, 36, 36, new String[0]);
        j21Var.b.setText(str);
        j21Var.c.setText(charSequence);
        k21 k21Var = new k21(wjbVar, X(), true);
        k21Var.e(str2);
        k21Var.b = runnable;
        j21Var.setButton(k21Var);
        return b(j21Var, 5000);
    }

    public final m21 M(Drawable drawable, CharSequence charSequence) {
        t11 t11Var = new t11(X(), this.c);
        ry8 ry8Var = t11Var.a;
        ry8Var.setImageDrawable(drawable);
        if (drawable instanceof u08) {
            ((u08) drawable).e(ry8Var);
        }
        t11Var.b.setText(charSequence);
        t11Var.b.setSingleLine(false);
        t11Var.b.setMaxLines(2);
        return b(t11Var, 2750);
    }

    public final m21 N(String str, String str2) {
        j21 j21Var = new j21(X(), this.c);
        j21Var.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) j21Var.d.getLayoutParams()).setMarginStart(gl.L(10.0f));
        j21Var.b.setText(str);
        j21Var.c.setText(str2);
        return b(j21Var, 5000);
    }

    public final m21 O(TLRPC.Document document, String str, String str2) {
        int i;
        if (document == null) {
            return new m21();
        }
        i21 i21Var = new i21(X(), this.c);
        TLRPC.PhotoSize w = ba4.w(document.thumbs, gl.L(28.0f), true, null, false);
        gl5 c = gl5.c(ba4.w(document.thumbs, gl.L(28.0f), true, w, true), document);
        gl5 c2 = gl5.c(w, document);
        be0 be0Var = i21Var.a;
        be0Var.g(0, 0L, c, c2, null, "28_28", "28_28", null);
        be0Var.getImageReceiver().q0(gl.L(5.0f));
        TextView textView = i21Var.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(gl.o());
        TextView textView2 = i21Var.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i = 1500;
        } else {
            i = 2750;
        }
        return b(i21Var, i);
    }

    public final m21 P(int i, CharSequence charSequence) {
        int i2;
        t11 t11Var = new t11(X(), this.c);
        t11Var.c(i, 36, 36, new String[0]);
        t11Var.b.setText(charSequence);
        t11Var.b.setSingleLine(false);
        t11Var.b.setTextSize(1, 14.0f);
        t11Var.b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i2 = 1500;
        } else {
            i2 = 2750;
        }
        return b(t11Var, i2);
    }

    public final m21 Q(int i, int i2, CharSequence charSequence) {
        int i3;
        t11 t11Var = new t11(X(), this.c);
        t11Var.c(i, i2, i2, new String[0]);
        t11Var.b.setText(charSequence);
        t11Var.b.setSingleLine(false);
        t11Var.b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i3 = 1500;
        } else {
            i3 = 2750;
        }
        return b(t11Var, i3);
    }

    public final m21 R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i;
        if (document == null) {
            return new m21();
        }
        i21 i21Var = new i21(X(), this.c);
        TLRPC.PhotoSize w = ba4.w(document.thumbs, gl.L(28.0f), true, null, false);
        gl5 c = gl5.c(ba4.w(document.thumbs, gl.L(28.0f), true, w, true), document);
        gl5 c2 = gl5.c(w, document);
        be0 be0Var = i21Var.a;
        be0Var.g(0, 0L, c, c2, null, "28_28", "28_28", null);
        be0Var.getImageReceiver().q0(gl.L(5.0f));
        TextView textView = i21Var.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        i21Var.c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i = 1500;
        } else {
            i = 2750;
        }
        return b(i21Var, i);
    }

    public final m21 T(String str) {
        t11 t11Var = new t11(X(), null);
        t11Var.d(2131623990, new String[0]);
        t11Var.b.setText(str);
        t11Var.b.setSingleLine(false);
        t11Var.b.setMaxLines(2);
        return b(t11Var, 1500);
    }

    public final m21 U(String str, boolean z, Runnable runnable, Runnable runnable2) {
        Context X = X();
        wjb wjbVar = this.c;
        t11 t11Var = new t11(X, wjbVar);
        t11Var.b.setText(str);
        t11Var.b.setSingleLine(false);
        t11Var.b.setMaxLines(2);
        t11Var.setTimer();
        k21 k21Var = new k21(wjbVar, X(), true, z);
        k21Var.e(k96.M0(2131743646, null));
        k21Var.b = runnable;
        k21Var.c = runnable2;
        t11Var.setButton(k21Var);
        return b(t11Var, 5000);
    }

    public final m21 V(List list, CharSequence charSequence, CharSequence charSequence2, lv6 lv6Var) {
        boolean z;
        float f;
        int i;
        Context X = X();
        if (charSequence2 != null) {
            z = true;
        } else {
            z = false;
        }
        wjb wjbVar = this.c;
        l21 l21Var = new l21(wjbVar, X, z);
        hc0 hc0Var = l21Var.a;
        if (list != null) {
            int i2 = 0;
            i = 0;
            for (int i3 = 3; i2 < list.size() && i < i3; i3 = 3) {
                TLObject tLObject = (TLObject) list.get(i2);
                if (tLObject != null) {
                    int i4 = i + 1;
                    hc0Var.setCount(i4);
                    hc0Var.b(i, y6c.t0, tLObject);
                    i = i4;
                }
                i2++;
            }
            f = 4.0f;
            if (list.size() == 1) {
                hc0Var.setTranslationX(gl.L(4.0f));
                hc0Var.setScaleX(1.2f);
                hc0Var.setScaleY(1.2f);
            } else {
                hc0Var.setScaleX(1.0f);
                hc0Var.setScaleY(1.0f);
            }
        } else {
            f = 4.0f;
            i = 0;
        }
        hc0Var.a(false);
        l46 l46Var = l21Var.b;
        if (charSequence2 != null) {
            l46Var.setSingleLine(true);
            l46Var.setMaxLines(1);
            l46Var.setText(charSequence);
            l46 l46Var2 = l21Var.c;
            l46Var2.setText(charSequence2);
            l46Var2.setSingleLine(false);
            l46Var2.setMaxLines(3);
            LinearLayout linearLayout = l21Var.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = gl.L(70 - ((3 - i) * 12));
                if (i == 1) {
                    L += gl.L(f);
                }
                if (k96.a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            l46Var.setSingleLine(false);
            l46Var.setMaxLines(4);
            l46Var.setText(charSequence);
            if (l46Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = gl.L(70 - ((3 - i) * 12));
                if (i == 1) {
                    l46Var.setTranslationY(-gl.L(1.0f));
                    L2 += gl.L(f);
                }
                if (k96.a0) {
                    ((ViewGroup.MarginLayoutParams) l46Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) l46Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (lv6Var != null) {
            k21 k21Var = new k21(wjbVar, X(), true);
            k21Var.e(k96.M0(2131743646, null));
            k21Var.b = (Runnable) lv6Var.b;
            k21Var.c = (Runnable) lv6Var.c;
            l21Var.setButton(k21Var);
        }
        return b(l21Var, 5000);
    }

    public final Context X() {
        Context context;
        d dVar = this.a;
        if (dVar != null) {
            context = dVar.getParentActivity();
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

    public final m21 Z(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.E1) {
            return new m21();
        }
        if (tL_error == null) {
            return t(k96.a0(null, null, 2131743640, new Object[0]), null);
        }
        return t(W(tL_error.text), null);
    }

    public final m21 b(h11 h11Var, int i) {
        d dVar = this.a;
        if (dVar != null) {
            return m21.g(dVar, h11Var, i);
        }
        return m21.f(this.b, h11Var, i);
    }

    public final m21 c(CharSequence charSequence) {
        if (X() == null) {
            return new m21();
        }
        t11 t11Var = new t11(X(), this.c);
        t11Var.d(2131624049, "Shield");
        t11Var.b.setSingleLine(false);
        t11Var.b.setMaxLines(3);
        t11Var.b.setText(charSequence);
        return b(t11Var, 2750);
    }

    public final m21 e(boolean z) {
        String M0;
        t11 t11Var = new t11(X(), this.c);
        if (z) {
            t11Var.d(2131624050, "Hand");
            M0 = k96.M0(2131743522, null);
        } else {
            t11Var.d(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = k96.M0(2131743436, null);
        }
        t11Var.b.setText(gl.S2(M0));
        return b(t11Var, 1500);
    }

    public final m21 f(int i, Runnable runnable) {
        t11 t11Var = new t11(X(), null);
        t11Var.d(2131623970, new String[0]);
        String G = k96.G(i, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(gl.S2(G));
        int indexOf = G.indexOf(42);
        int i2 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i2);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i2, indexOf2));
        valueOf.setSpan(new vk(runnable, (byte) 2), indexOf, indexOf2 - 1, 33);
        t11Var.b.setText(valueOf);
        t11Var.b.setSingleLine(false);
        t11Var.b.setMaxLines(3);
        return b(t11Var, 5000);
    }

    public final void f0(String str, boolean z) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            m21 t = t(k96.a0(null, null, 2131743640, new Object[0]), null);
            t.r = false;
            t.k(z);
            return;
        }
        m21 t2 = t(W(str), null);
        t2.r = false;
        t2.k(z);
    }

    public final m21 g(String str, ArrayList arrayList) {
        hc0 hc0Var;
        l21 l21Var = new l21(this.c, X(), false);
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            hc0Var = l21Var.a;
            if (i >= size || i2 >= 3) {
                break;
            }
            TLObject tLObject = (TLObject) arrayList.get(i);
            if (tLObject != null) {
                int i3 = i2 + 1;
                hc0Var.setCount(i3);
                hc0Var.b(i2, y6c.t0, tLObject);
                i2 = i3;
            }
            i++;
        }
        if (arrayList.size() == 1) {
            hc0Var.setTranslationX(gl.L(4.0f));
            hc0Var.setScaleX(1.2f);
            hc0Var.setScaleY(1.2f);
        } else {
            hc0Var.setScaleX(1.0f);
            hc0Var.setScaleY(1.0f);
        }
        hc0Var.a(false);
        l46 l46Var = l21Var.b;
        l46Var.setSingleLine(false);
        l46Var.setMaxLines(2);
        l46Var.setText(str);
        if (l46Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = gl.L(74 - ((3 - i2) * 12));
            if (k96.a0) {
                ((ViewGroup.MarginLayoutParams) l46Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) l46Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (k96.a0) {
            hc0Var.setTranslationX(gl.L(32 - ((i2 - 1) * 12)));
        }
        return b(l21Var, 5000);
    }

    public final void g0(TLRPC.TL_error tL_error, boolean z) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                m21 t = t(k96.a0(null, null, 2131743640, new Object[0]), null);
                t.r = false;
                t.k(z);
            } else if (tL_error.code != 406) {
                m21 t2 = t(W(tL_error.text), null);
                t2.r = false;
                t2.k(z);
            }
        }
    }

    public final m21 h(TLRPC.Document document, final int i, final p8c p8cVar) {
        SpannableStringBuilder spannableStringBuilder;
        u86 u86Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder S2;
        final TLRPC.InputStickerSet i1 = k27.i1(document);
        if (i1 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet n0 = hq6.d0(y6c.t0).n0(i1, true);
        if (n0 != null && (stickerSet = n0.set) != null) {
            if (i == 1) {
                S2 = gl.S2(k96.a0("TopicContainsEmojiPackSingle", null, 2131743785, stickerSet.title));
            } else {
                String str = stickerSet.title;
                if (i == 2) {
                    S2 = gl.S2(k96.a0("StoryContainsEmojiPackSingle", null, 2131744459, str));
                } else {
                    S2 = gl.S2(k96.a0("MessageContainsEmojiPackSingle", null, 2131748404, str));
                }
            }
            return r(document, S2, k96.M0(2131743321, null), new Runnable() {
                @Override
                public final void run() {
                    byte b = r3;
                    TLRPC.InputStickerSet inputStickerSet2 = i1;
                    p8c p8cVar2 = p8cVar;
                    switch (b) {
                        case 0:
                            p8cVar2.a(inputStickerSet2);
                            return;
                        default:
                            p8cVar2.a(inputStickerSet2);
                            return;
                    }
                }
            });
        }
        if (i == 1) {
            spannableStringBuilder = new SpannableStringBuilder(gl.S2(k96.a0("TopicContainsEmojiPackSingle", null, 2131743785, "<{LOADING}>")));
        } else if (i == 2) {
            spannableStringBuilder = new SpannableStringBuilder(gl.S2(k96.a0("StoryContainsEmojiPackSingle", null, 2131744459, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(gl.S2(k96.a0("MessageContainsEmojiPackSingle", null, 2131748404, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        wjb wjbVar = this.c;
        if (indexOf >= 0) {
            u86Var = new u86(null, gl.L(100.0f), gl.L(2.0f), wjbVar);
            spannableStringBuilder.setSpan(u86Var, indexOf, indexOf + 11, 33);
            int i2 = bkb.xj;
            u86Var.a(bm2.o(bkb.v0(i2, wjbVar), 32), bm2.o(bkb.v0(i2, wjbVar), 72));
        } else {
            u86Var = null;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        String M0 = k96.M0(2131743321, null);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                TLRPC.InputStickerSet inputStickerSet2 = i1;
                p8c p8cVar2 = p8cVar;
                switch (b) {
                    case 0:
                        p8cVar2.a(inputStickerSet2);
                        return;
                    default:
                        p8cVar2.a(inputStickerSet2);
                        return;
                }
            }
        };
        Context X = X();
        ?? t11Var = new t11(X, wjbVar);
        l46 l46Var = new l46(X, null);
        t11Var.d = l46Var;
        l46Var.setDisablePaddingsOffset(true);
        l46Var.setSingleLine();
        l46Var.setTypeface(Typeface.SANS_SERIF);
        l46Var.setTextSize(1, 15.0f);
        l46Var.setEllipsize(TextUtils.TruncateAt.END);
        l46Var.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        t11Var.b.setVisibility(8);
        t11Var.addView(l46Var, nme.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i3 = bkb.xj;
        t11Var.setTextColor(t11Var.getThemedColor(i3));
        if (k27.B4(document)) {
            inputStickerSet = i1;
            zkb.s(t11Var.a, i3, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i1;
        }
        t11Var.e(document, new String[0]);
        t11Var.b.setTextSize(1, 14.0f);
        t11Var.b.setSingleLine(false);
        t11Var.b.setMaxLines(3);
        l46Var.setText(spannableStringBuilder);
        l46Var.setTextSize(1, 14.0f);
        l46Var.setSingleLine(false);
        l46Var.setMaxLines(3);
        k21 k21Var = new k21(wjbVar, X(), true);
        k21Var.e(M0);
        k21Var.b = runnable;
        t11Var.setButton(k21Var);
        final m21 b = b(t11Var, 2750);
        if (u86Var != null) {
            q11 q11Var = b.e;
            if (q11Var instanceof r11) {
                u86Var.b = ((r11) q11Var).d;
            }
        }
        hq6.d0(y6c.t0).m0(inputStickerSet, null, false, false, new p8c() {
            @Override
            public final void a(Object obj) {
                Object M02;
                TLRPC.StickerSet stickerSet2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null) {
                    String str2 = stickerSet2.title;
                    byte b2 = i;
                    if (b2 == 1) {
                        M02 = gl.S2(k96.a0("TopicContainsEmojiPackSingle", null, 2131743785, str2));
                    } else if (b2 == 2) {
                        M02 = gl.S2(k96.a0("StoryContainsEmojiPackSingle", null, 2131744459, str2));
                    } else {
                        M02 = gl.S2(k96.a0("MessageContainsEmojiPackSingle", null, 2131748404, str2));
                    }
                } else {
                    M02 = k96.M0(2131754432, null);
                }
                gl.d3(new z20(b, M02, (byte) 29), Math.max(1L, 750 - (System.currentTimeMillis() - currentTimeMillis)));
            }
        });
        return b;
    }

    public final boolean h0(int i, long j) {
        d dVar;
        SpannableStringBuilder N2;
        if (y6c.h(y6c.t0).p() && (dVar = this.a) != null) {
            x11 x11Var = new x11(i, dVar);
            if (j == y6c.h(y6c.t0).n) {
                if (i <= 1) {
                    N2 = gl.N2(k96.M0(2131750482, null), -1, 2, new jc((byte) 14), null);
                } else {
                    N2 = gl.N2(k96.M0(2131750475, null), -1, 2, new jc((byte) 14), null);
                }
                x11Var.c(2131624185, 36, 36, new String[0]);
                x11Var.b.setText(N2);
                x11Var.b.setSingleLine(false);
                x11Var.b.setMaxLines(2);
                m21 b = b(x11Var, 3500);
                x11Var.setBulletin(b);
                b.r = false;
                b.k(true);
                return true;
            }
        }
        return false;
    }

    public final m21 i(String str) {
        if (!gl.C3()) {
            return new m21();
        }
        t11 t11Var = new t11(X(), null);
        t11Var.c(2131623994, 36, 36, "NULL ROTATION", "Back", "Front");
        t11Var.b.setText(str);
        return b(t11Var, 1500);
    }

    public final m21 k(boolean z) {
        if (!gl.C3()) {
            return new m21();
        }
        wjb wjbVar = this.c;
        if (z) {
            j21 j21Var = new j21(X(), wjbVar);
            j21Var.c(2131624340, 36, 36, "Wibe", "Circle");
            j21Var.b.setText(k96.M0(2131748729, null));
            j21Var.c.setText(k96.M0(2131748727, null));
            return b(j21Var, 2750);
        }
        t11 t11Var = new t11(X(), wjbVar);
        t11Var.c(2131624340, 36, 36, "Wibe", "Circle");
        t11Var.b.setText(k96.M0(2131748729, null));
        return b(t11Var, 1500);
    }

    public final m21 m(t21 t21Var, int i, int i2, int i3, wjb wjbVar) {
        t11 t11Var;
        String M0;
        if (i2 != 0 && i3 != 0) {
            t11Var = new t11(i2, i3, wjbVar, X());
        } else {
            t11Var = new t11(X(), wjbVar);
        }
        s21 s21Var = t21Var.d;
        t11Var.d(s21Var.a, s21Var.b);
        TextView textView = t11Var.b;
        boolean z = t21Var.c;
        String str = t21Var.a;
        if (z) {
            M0 = k96.G(i, str, new Object[0]);
        } else {
            M0 = k96.M0(t21Var.b, str);
        }
        textView.setText(gl.N2(M0, -1, 0, new jc((byte) 15), null));
        byte b = t21Var.d.c;
        if (b != 0) {
            t11Var.setIconPaddingBottom(b);
        }
        return b(t11Var, 1500);
    }

    public final m21 n(t21 t21Var, int i, wjb wjbVar) {
        return m(t21Var, i, 0, 0, wjbVar);
    }

    public final m21 o(t21 t21Var, wjb wjbVar) {
        return m(t21Var, 1, 0, 0, wjbVar);
    }

    public final m21 p(long j, String str, String str2) {
        Context X = X();
        wjb wjbVar = this.c;
        h21 h21Var = new h21(X, wjbVar);
        vl vlVar = new vl(1, y6c.t0, j);
        be0 be0Var = h21Var.a;
        be0Var.setAnimatedEmojiDrawable(vlVar);
        be0Var.setEmojiColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.F6, wjbVar), PorterDuff.Mode.SRC_IN));
        h21Var.b.setText(str);
        h21Var.c.setText(str2);
        return b(h21Var, 2750);
    }

    public final m21 q(TLRPC.Document document, CharSequence charSequence) {
        t11 t11Var = new t11(X(), this.c);
        if (k27.B4(document)) {
            zkb.s(t11Var.a, bkb.xj, null, PorterDuff.Mode.SRC_IN);
        }
        t11Var.e(document, new String[0]);
        t11Var.b.setText(charSequence);
        t11Var.b.setTextSize(1, 14.0f);
        t11Var.b.setSingleLine(false);
        t11Var.b.setMaxLines(3);
        return b(t11Var, 2750);
    }

    public final m21 r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context X = X();
        wjb wjbVar = this.c;
        t11 t11Var = new t11(X, wjbVar);
        boolean B4 = k27.B4(document);
        ry8 ry8Var = t11Var.a;
        if (B4) {
            zkb.s(ry8Var, bkb.xj, null, PorterDuff.Mode.SRC_IN);
        }
        t11Var.e(document, new String[0]);
        if (ry8Var.getImageReceiver() != null) {
            ry8Var.getImageReceiver().q0(gl.L(4.0f));
        }
        t11Var.b.setText(charSequence);
        t11Var.b.setTextSize(1, 14.0f);
        t11Var.b.setSingleLine(false);
        t11Var.b.setMaxLines(3);
        k21 k21Var = new k21(wjbVar, X(), true);
        k21Var.e(str);
        k21Var.b = runnable;
        t11Var.setButton(k21Var);
        return b(t11Var, 2750);
    }

    public final m21 s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i;
        j21 j21Var = new j21(X(), this.c);
        boolean B4 = k27.B4(document);
        ry8 ry8Var = j21Var.a;
        if (B4) {
            zkb.s(ry8Var, bkb.xj, null, PorterDuff.Mode.SRC_IN);
        }
        ry8Var.setAutoRepeat(true);
        ry8Var.g(36, 36, document);
        j21Var.b.setText(str);
        j21Var.c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i = 1500;
        } else {
            i = 2750;
        }
        return b(j21Var, i);
    }

    public final m21 t(CharSequence charSequence, wjb wjbVar) {
        t11 t11Var = new t11(X(), wjbVar);
        t11Var.d(2131623982, new String[0]);
        t11Var.b.setText(charSequence);
        t11Var.b.setSingleLine(false);
        t11Var.b.setMaxLines(2);
        return b(t11Var, 1500);
    }

    public final m21 u(String str, String str2, wjb wjbVar) {
        j21 j21Var = new j21(X(), wjbVar);
        j21Var.c(2131623982, 32, 32, new String[0]);
        j21Var.b.setText(str);
        j21Var.c.setText(str2);
        return b(j21Var, 1500);
    }

    public final m21 w(int i, CharSequence charSequence) {
        Context X = X();
        wjb wjbVar = this.c;
        t11 t11Var = new t11(X, wjbVar);
        t11Var.setBackground(bkb.v0(bkb.vj, wjbVar), 12);
        t11Var.a.setImageResource(i);
        t11Var.b.setText(charSequence);
        t11Var.b.setSingleLine(false);
        t11Var.b.setLines(2);
        t11Var.b.setMaxLines(4);
        TextView textView = t11Var.b;
        textView.setMaxWidth(je5.a(textView.getText(), t11Var.b.getPaint()));
        t11Var.b.setLineSpacing(gl.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) t11Var.b.getLayoutParams()).rightMargin = gl.L(12.0f);
        t11Var.setWrapWidth();
        return b(t11Var, 5000);
    }

    public final m21 y(int i, TLRPC.Document document, bt btVar) {
        String M0;
        Context X = X();
        wjb wjbVar = this.c;
        t11 t11Var = new t11(X, wjbVar);
        t11Var.c(2131624280, 36, 36, new String[0]);
        t11Var.removeView(t11Var.b);
        fm fmVar = new fm(t11Var.getContext());
        t11Var.b = fmVar;
        fmVar.setTypeface(Typeface.SANS_SERIF);
        t11Var.b.setTextSize(1, 15.0f);
        t11Var.b.setEllipsize(TextUtils.TruncateAt.END);
        t11Var.b.setPadding(0, 0, 0, gl.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(gl.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new gm(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = t11Var.b;
        if (i > 1) {
            M0 = k96.G(i, "SavedTagMessagesTagged", new Object[0]);
        } else {
            M0 = k96.M0(2131745686, null);
        }
        textView.setText(new SpannableStringBuilder(M0).append((CharSequence) " ").append((CharSequence) spannableString));
        if (btVar != null) {
            k21 k21Var = new k21(wjbVar, X(), true);
            k21Var.e(k96.M0(2131743321, null));
            k21Var.b = btVar;
            t11Var.setButton(k21Var);
        }
        t11Var.setTextColor(bkb.v0(bkb.xj, wjbVar));
        t11Var.addView(t11Var.b, nme.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(t11Var, 2750);
    }

    public u21(FrameLayout frameLayout, wjb wjbVar) {
        this.b = frameLayout;
        this.a = null;
        this.c = wjbVar;
    }
}
