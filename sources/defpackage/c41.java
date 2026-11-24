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
public final class c41 {
    public final d a;
    public final FrameLayout b;
    public final ylb c;

    public c41(d dVar) {
        if (dVar != null && dVar.getLastStoryViewer() != null && dVar.getLastStoryViewer().y()) {
            this.a = null;
            a58 currentPeerView = dVar.getLastStoryViewer().o0.getCurrentPeerView();
            this.b = currentPeerView != null ? currentPeerView.S0 : null;
            this.c = dVar.getLastStoryViewer().E;
            return;
        }
        this.a = dVar;
        this.b = null;
        this.c = dVar != null ? dVar.getResourceProvider() : null;
    }

    public static u31 A(d dVar, boolean z, ylb ylbVar) {
        int i;
        if (z) {
            i = 3;
        } else {
            i = 4;
        }
        return z(dVar, i, 0, ylbVar);
    }

    public static u31 B(d dVar, boolean z, up6 up6Var, jm1 jm1Var, ylb ylbVar) {
        int i;
        String str;
        int i2;
        int i3;
        b31 b31Var = new b31(dVar.getParentActivity(), ylbVar);
        if (z) {
            i = 2131624055;
        } else {
            i = 2131624061;
        }
        b31Var.c(i, 28, 28, "Pin", "Line");
        TextView textView = b31Var.b;
        if (z) {
            str = "MessagePinnedHint";
            i2 = 2131748301;
        } else {
            str = "MessageUnpinnedHint";
            i2 = 2131748223;
        }
        textView.setText(jb6.M0(i2, str));
        if (!z) {
            s31 s31Var = new s31(ylbVar, dVar.getParentActivity(), true);
            s31Var.b = up6Var;
            s31Var.c = jm1Var;
            b31Var.setButton(s31Var);
            i3 = 5000;
        } else {
            i3 = 1500;
        }
        return u31.g(dVar, b31Var, i3);
    }

    public static u31 C(String str, d dVar) {
        b31 b31Var = new b31(dVar.getParentActivity(), dVar.getResourceProvider());
        b31Var.d(2131624049, "Shield");
        hg9.q("UserSetAsAdminHint", null, 2131743367, new Object[]{str}, b31Var.b);
        return u31.g(dVar, b31Var, 1500);
    }

    public static u31 D(d dVar, TLRPC.User user, String str) {
        String str2;
        b31 b31Var = new b31(dVar.getParentActivity(), dVar.getResourceProvider());
        b31Var.d(2131624050, "Hand");
        if (user.deleted) {
            str2 = jb6.a0("HiddenName", null, 2131749085, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        hg9.q("UserRemovedFromChatHint", null, 2131743418, new Object[]{str2, str}, b31Var.b);
        return u31.g(dVar, b31Var, 1500);
    }

    public static u31 F(FrameLayout frameLayout, boolean z) {
        b41 b41Var;
        c41 c41Var = new c41(frameLayout, null);
        if (z) {
            b41Var = b41.h;
        } else {
            b41Var = b41.e;
        }
        return c41Var.m(b41Var, 1, -115203550, -1, null);
    }

    public static u31 S(int i, ylb ylbVar, d dVar) {
        String M0;
        b31 b31Var = new b31(dVar.getParentActivity(), ylbVar);
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                M0 = jb6.M0(2131745010, null);
                z = false;
            } else {
                i98.g();
                return null;
            }
        } else {
            M0 = jb6.M0(2131745008, null);
        }
        if (z) {
            b31Var.d(2131624197, new String[0]);
        } else {
            b31Var.d(2131624196, new String[0]);
        }
        b31Var.b.setText(M0);
        return u31.g(dVar, b31Var, 1500);
    }

    public static String W(String str) {
        if ("STARGIFT_ALREADY_TRANSFERRED".equals(str)) {
            return jb6.M0(2131749685, null);
        }
        return jb6.a0(null, null, 2131743565, str);
    }

    public static c41 Y() {
        d S = LaunchActivity.S();
        if (S == null) {
            return new c41(n21.a(a.b), null);
        }
        Dialog dialog = S.visibleDialog;
        if (dialog instanceof my0) {
            return new c41(((my0) dialog).c, S.getResourceProvider());
        }
        return b0(S);
    }

    public static boolean a(d dVar) {
        if (dVar != null && dVar.getParentActivity() != null && dVar.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static c41 a0(FrameLayout frameLayout, ylb ylbVar) {
        return new c41(frameLayout, ylbVar);
    }

    public static c41 b0(d dVar) {
        if (dVar == null) {
            return Y();
        }
        return new c41(dVar);
    }

    public static void c0(String str) {
        if (!LaunchActivity.E1) {
            return;
        }
        Y().t(W(str), null).j();
    }

    public static u31 d(d dVar, boolean z) {
        String M0;
        b31 b31Var = new b31(dVar.getParentActivity(), dVar.getResourceProvider());
        if (z) {
            b31Var.d(2131624050, "Hand");
            M0 = jb6.M0(2131743448, null);
        } else {
            b31Var.d(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = jb6.M0(2131743362, null);
        }
        b31Var.b.setText(gm.S2(M0));
        return u31.g(dVar, b31Var, 1500);
    }

    public static void d0(String str, FrameLayout frameLayout, ylb ylbVar) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (frameLayout == null) {
            c0(str);
            return;
        }
        u31 t = new c41(frameLayout, ylbVar).t(W(str), null);
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

    public static u31 j(d dVar) {
        return b0(dVar).k(false);
    }

    public static u31 l(String str, d dVar, boolean z) {
        int i;
        String M0;
        int i2;
        int i3;
        b31 b31Var = new b31(dVar.getParentActivity(), dVar.getResourceProvider());
        if (str != null) {
            if (z) {
                i3 = 2131751349;
            } else {
                i3 = 2131751347;
            }
            M0 = jb6.a0(null, null, i3, str);
        } else {
            if (z) {
                i = 2131751350;
            } else {
                i = 2131751348;
            }
            M0 = jb6.M0(i, null);
        }
        b31Var.b.setText(gm.S2(M0));
        if (!z && str == null) {
            i2 = 2131623990;
        } else {
            i2 = 2131624007;
        }
        b31Var.d(i2, new String[0]);
        return u31.g(dVar, b31Var, 5000);
    }

    public static u31 v(Context context, d dVar, FrameLayout frameLayout, int i, long j, int i2, int i3, int i4, int i5, boolean z, of2 of2Var) {
        b31 b31Var;
        ylb ylbVar;
        boolean z2;
        y31 y31Var;
        int i6;
        SpannableStringBuilder S2;
        u31 g;
        ylb ylbVar2;
        int i7;
        int i8;
        jd jdVar;
        if (z8c.h(z8c.t0).p() && dVar != null && i <= 1 && j == z8c.h(z8c.t0).n && !z) {
            b31Var = new f31(i2, dVar);
        } else {
            if (dVar != null) {
                ylbVar = dVar.getResourceProvider();
            } else {
                ylbVar = null;
            }
            b31Var = new b31(i3, i4, ylbVar, context);
        }
        b31 b31Var2 = b31Var;
        if (of2Var == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean[] zArr = {false};
        if (of2Var != null) {
            y31Var = new y31(zArr, of2Var, (byte) 1);
        } else {
            y31Var = null;
        }
        if (i <= 1) {
            if (j == z8c.h(z8c.t0).n) {
                if (i2 <= 1) {
                    String M0 = jb6.M0(2131750431, null);
                    if (z) {
                        jdVar = new jd((byte) 16);
                    } else {
                        jdVar = new jd((byte) 14);
                    }
                    S2 = gm.N2(M0, -1, 2, jdVar, null);
                } else {
                    S2 = gm.N2(jb6.M0(2131750424, null), -1, 2, new jd((byte) 14), null);
                }
                b31Var2.c(2131624185, 30, 30, new String[0]);
                i6 = 2;
            } else {
                i6 = 2;
                of2 of2Var2 = new of2(y31Var, dVar, j, (byte) 12);
                boolean y = pg3.y(j);
                int i9 = z8c.t0;
                if (y) {
                    TLRPC.Chat L0 = oc7.r1(i9).L0(Long.valueOf(-j));
                    if (i2 <= 1) {
                        if (dVar != null) {
                            S2 = gm.N2(jb6.a0(null, null, 2131750435, L0.title), -1, 2, of2Var2, null);
                        } else {
                            S2 = gm.S2(jb6.a0(null, null, 2131750435, L0.title));
                        }
                    } else if (dVar != null) {
                        S2 = gm.N2(jb6.a0(null, null, 2131750428, L0.title), -1, 2, of2Var2, null);
                    } else {
                        S2 = gm.S2(jb6.a0(null, null, 2131750428, L0.title));
                    }
                } else {
                    TLRPC.User W1 = oc7.r1(i9).W1(Long.valueOf(j));
                    if (i2 <= 1) {
                        if (z2) {
                            i8 = 2131750429;
                        } else {
                            i8 = 2131750430;
                        }
                        if (dVar != null) {
                            S2 = gm.N2(jb6.a0(null, null, i8, m9c.k(W1, true)), -1, 2, of2Var2, null);
                        } else {
                            S2 = gm.S2(jb6.a0(null, null, i8, m9c.k(W1, true)));
                        }
                    } else {
                        if (z2) {
                            i7 = 2131750422;
                        } else {
                            i7 = 2131750423;
                        }
                        if (dVar != null) {
                            S2 = gm.N2(jb6.a0(null, null, i7, m9c.k(W1, true)), -1, 2, of2Var2, null);
                        } else {
                            S2 = gm.S2(jb6.a0(null, null, i7, m9c.k(W1, true)));
                        }
                    }
                }
                b31Var2.c(2131624029, 30, 30, new String[0]);
            }
        } else {
            i6 = 2;
            if (i2 <= 1) {
                S2 = gm.S2(jb6.G(i, "FwdMessageToManyChats", new Object[0]));
            } else {
                S2 = gm.S2(jb6.G(i, "FwdMessagesToManyChats", new Object[0]));
            }
            b31Var2.c(2131624029, 30, 30, new String[0]);
        }
        b31Var2.b.setText(S2);
        if (z2) {
            Context context2 = b31Var2.getContext();
            if (dVar != null) {
                ylbVar2 = dVar.getResourceProvider();
            } else {
                ylbVar2 = null;
            }
            s31 s31Var = new s31(ylbVar2, context2, true, true);
            s31Var.b = null;
            s31Var.c = y31Var;
            b31Var2.setButton(s31Var);
        }
        b31Var2.postDelayed(new v31(b31Var2, (byte) 1), 300L);
        if (frameLayout != null) {
            g = u31.f(frameLayout, b31Var2, i5);
        } else if (dVar != null) {
            g = u31.g(dVar, b31Var2, i5);
        } else {
            i98.g();
            return null;
        }
        if (b31Var2 instanceof f31) {
            b31Var2.b.setSingleLine(false);
            b31Var2.b.setMaxLines(i6);
            ((f31) b31Var2).setBulletin(g);
            g.s = false;
        }
        return g;
    }

    public static defpackage.u31 x(android.app.Activity r7, android.widget.FrameLayout r8, int r9, long r10, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c41.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):u31");
    }

    public static defpackage.u31 z(org.telegram.ui.ActionBar.d r6, int r7, int r8, defpackage.ylb r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c41.z(org.telegram.ui.ActionBar.d, int, int, ylb):u31");
    }

    public final u31 E(ylb ylbVar) {
        b31 b31Var = new b31(X(), ylbVar);
        b31Var.d(2131623982, new String[0]);
        b31Var.b.setText(jb6.M0(2131745955, null));
        return b(b31Var, 1500);
    }

    public final u31 G(int i, int i2, CharSequence charSequence) {
        int i3;
        SpannableStringBuilder spannableStringBuilder;
        b31 b31Var = new b31(X(), this.c);
        b31Var.c(i, 36, 36, new String[0]);
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
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(i2);
        b31Var.b.setText(charSequence);
        if (charSequence.length() < 20) {
            i3 = 1500;
        } else {
            i3 = 2750;
        }
        return b(b31Var, i3);
    }

    public final u31 H(int i, CharSequence charSequence) {
        return Q(i, 36, charSequence);
    }

    public final u31 I(int i, CharSequence charSequence, CharSequence charSequence2) {
        int i2;
        r31 r31Var = new r31(X(), this.c);
        r31Var.c(i, 36, 36, new String[0]);
        r31Var.b.setText(charSequence);
        r31Var.c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i2 = 1500;
        } else {
            i2 = 2750;
        }
        return b(r31Var, i2);
    }

    public final u31 J(int i, CharSequence charSequence, String str, int i2, boolean z, Runnable runnable) {
        Context X = X();
        ylb ylbVar = this.c;
        b31 b31Var = new b31(X, ylbVar);
        if (i != 0) {
            b31Var.c(i, 36, 36, new String[0]);
        } else {
            b31Var.a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) b31Var.b.getLayoutParams()).leftMargin = gm.L(16.0f);
        }
        b31Var.b.setTextSize(1, 14.0f);
        b31Var.b.setTextDirection(5);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(3);
        b31Var.b.setText(charSequence);
        s31 s31Var = new s31(ylbVar, X(), true, z);
        s31Var.e(str);
        s31Var.b = runnable;
        b31Var.setButton(s31Var);
        return b(b31Var, i2);
    }

    public final u31 K(int i, CharSequence charSequence, String str, Runnable runnable) {
        int i2;
        if (charSequence.length() < 20) {
            i2 = 1500;
        } else {
            i2 = 2750;
        }
        return J(i, charSequence, str, i2, false, runnable);
    }

    public final u31 L(int i, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context X = X();
        ylb ylbVar = this.c;
        r31 r31Var = new r31(X, ylbVar);
        r31Var.c(i, 36, 36, new String[0]);
        r31Var.b.setText(str);
        r31Var.c.setText(charSequence);
        s31 s31Var = new s31(ylbVar, X(), true);
        s31Var.e(str2);
        s31Var.b = runnable;
        r31Var.setButton(s31Var);
        return b(r31Var, 5000);
    }

    public final u31 M(Drawable drawable, CharSequence charSequence) {
        b31 b31Var = new b31(X(), this.c);
        s09 s09Var = b31Var.a;
        s09Var.setImageDrawable(drawable);
        if (drawable instanceof x28) {
            ((x28) drawable).e(s09Var);
        }
        b31Var.b.setText(charSequence);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(2);
        return b(b31Var, 2750);
    }

    public final u31 N(String str, String str2) {
        r31 r31Var = new r31(X(), this.c);
        r31Var.a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) r31Var.d.getLayoutParams()).setMarginStart(gm.L(10.0f));
        r31Var.b.setText(str);
        r31Var.c.setText(str2);
        return b(r31Var, 5000);
    }

    public final u31 O(TLRPC.Document document, String str, String str2) {
        int i;
        if (document == null) {
            return new u31();
        }
        q31 q31Var = new q31(X(), this.c);
        TLRPC.PhotoSize w = bc4.w(document.thumbs, gm.L(28.0f), true, null, false);
        gn5 c = gn5.c(bc4.w(document.thumbs, gm.L(28.0f), true, w, true), document);
        gn5 c2 = gn5.c(w, document);
        bf0 bf0Var = q31Var.a;
        bf0Var.g(0, 0L, c, c2, null, "28_28", "28_28", null);
        bf0Var.getImageReceiver().q0(gm.L(5.0f));
        TextView textView = q31Var.b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(gm.o());
        TextView textView2 = q31Var.c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i = 1500;
        } else {
            i = 2750;
        }
        return b(q31Var, i);
    }

    public final u31 P(int i, CharSequence charSequence) {
        int i2;
        b31 b31Var = new b31(X(), this.c);
        b31Var.c(i, 36, 36, new String[0]);
        b31Var.b.setText(charSequence);
        b31Var.b.setSingleLine(false);
        b31Var.b.setTextSize(1, 14.0f);
        b31Var.b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i2 = 1500;
        } else {
            i2 = 2750;
        }
        return b(b31Var, i2);
    }

    public final u31 Q(int i, int i2, CharSequence charSequence) {
        int i3;
        b31 b31Var = new b31(X(), this.c);
        b31Var.c(i, i2, i2, new String[0]);
        b31Var.b.setText(charSequence);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i3 = 1500;
        } else {
            i3 = 2750;
        }
        return b(b31Var, i3);
    }

    public final u31 R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i;
        if (document == null) {
            return new u31();
        }
        q31 q31Var = new q31(X(), this.c);
        TLRPC.PhotoSize w = bc4.w(document.thumbs, gm.L(28.0f), true, null, false);
        gn5 c = gn5.c(bc4.w(document.thumbs, gm.L(28.0f), true, w, true), document);
        gn5 c2 = gn5.c(w, document);
        bf0 bf0Var = q31Var.a;
        bf0Var.g(0, 0L, c, c2, null, "28_28", "28_28", null);
        bf0Var.getImageReceiver().q0(gm.L(5.0f));
        TextView textView = q31Var.b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        q31Var.c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i = 1500;
        } else {
            i = 2750;
        }
        return b(q31Var, i);
    }

    public final u31 T(String str) {
        b31 b31Var = new b31(X(), null);
        b31Var.d(2131623990, new String[0]);
        b31Var.b.setText(str);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(2);
        return b(b31Var, 1500);
    }

    public final u31 U(String str, boolean z, Runnable runnable, Runnable runnable2) {
        Context X = X();
        ylb ylbVar = this.c;
        b31 b31Var = new b31(X, ylbVar);
        b31Var.b.setText(str);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(2);
        b31Var.setTimer();
        s31 s31Var = new s31(ylbVar, X(), true, z);
        s31Var.e(jb6.M0(2131743572, null));
        s31Var.b = runnable;
        s31Var.c = runnable2;
        b31Var.setButton(s31Var);
        return b(b31Var, 5000);
    }

    public final u31 V(List list, CharSequence charSequence, CharSequence charSequence2, hi2 hi2Var) {
        boolean z;
        float f;
        int i;
        Context X = X();
        if (charSequence2 != null) {
            z = true;
        } else {
            z = false;
        }
        ylb ylbVar = this.c;
        t31 t31Var = new t31(ylbVar, X, z);
        hd0 hd0Var = t31Var.a;
        if (list != null) {
            int i2 = 0;
            i = 0;
            for (int i3 = 3; i2 < list.size() && i < i3; i3 = 3) {
                TLObject tLObject = (TLObject) list.get(i2);
                if (tLObject != null) {
                    int i4 = i + 1;
                    hd0Var.setCount(i4);
                    hd0Var.b(i, z8c.t0, tLObject);
                    i = i4;
                }
                i2++;
            }
            f = 4.0f;
            if (list.size() == 1) {
                hd0Var.setTranslationX(gm.L(4.0f));
                hd0Var.setScaleX(1.2f);
                hd0Var.setScaleY(1.2f);
            } else {
                hd0Var.setScaleX(1.0f);
                hd0Var.setScaleY(1.0f);
            }
        } else {
            f = 4.0f;
            i = 0;
        }
        hd0Var.a(false);
        l66 l66Var = t31Var.b;
        if (charSequence2 != null) {
            l66Var.setSingleLine(true);
            l66Var.setMaxLines(1);
            l66Var.setText(charSequence);
            l66 l66Var2 = t31Var.c;
            l66Var2.setText(charSequence2);
            l66Var2.setSingleLine(false);
            l66Var2.setMaxLines(3);
            LinearLayout linearLayout = t31Var.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = gm.L(70 - ((3 - i) * 12));
                if (i == 1) {
                    L += gm.L(f);
                }
                if (jb6.a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            l66Var.setSingleLine(false);
            l66Var.setMaxLines(4);
            l66Var.setText(charSequence);
            if (l66Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = gm.L(70 - ((3 - i) * 12));
                if (i == 1) {
                    l66Var.setTranslationY(-gm.L(1.0f));
                    L2 += gm.L(f);
                }
                if (jb6.a0) {
                    ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (hi2Var != null) {
            s31 s31Var = new s31(ylbVar, X(), true);
            s31Var.e(jb6.M0(2131743572, null));
            s31Var.b = (Runnable) hi2Var.b;
            s31Var.c = (Runnable) hi2Var.c;
            t31Var.setButton(s31Var);
        }
        return b(t31Var, 5000);
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

    public final u31 Z(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.E1) {
            return new u31();
        }
        if (tL_error == null) {
            return t(jb6.a0(null, null, 2131743566, new Object[0]), null);
        }
        return t(W(tL_error.text), null);
    }

    public final u31 b(y21 y21Var, int i) {
        d dVar = this.a;
        if (dVar != null) {
            return u31.g(dVar, y21Var, i);
        }
        return u31.f(this.b, y21Var, i);
    }

    public final u31 c(CharSequence charSequence) {
        if (X() == null) {
            return new u31();
        }
        b31 b31Var = new b31(X(), this.c);
        b31Var.d(2131624049, "Shield");
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(3);
        b31Var.b.setText(charSequence);
        return b(b31Var, 2750);
    }

    public final u31 e(boolean z) {
        String M0;
        b31 b31Var = new b31(X(), this.c);
        if (z) {
            b31Var.d(2131624050, "Hand");
            M0 = jb6.M0(2131743448, null);
        } else {
            b31Var.d(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = jb6.M0(2131743362, null);
        }
        b31Var.b.setText(gm.S2(M0));
        return b(b31Var, 1500);
    }

    public final u31 f(int i, Runnable runnable) {
        b31 b31Var = new b31(X(), null);
        b31Var.d(2131623970, new String[0]);
        String G = jb6.G(i, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(gm.S2(G));
        int indexOf = G.indexOf(42);
        int i2 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i2);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i2, indexOf2));
        valueOf.setSpan(new vl(runnable, (byte) 2), indexOf, indexOf2 - 1, 33);
        b31Var.b.setText(valueOf);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(3);
        return b(b31Var, 5000);
    }

    public final void f0(String str, boolean z) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            u31 t = t(jb6.a0(null, null, 2131743566, new Object[0]), null);
            t.s = false;
            t.k(z);
            return;
        }
        u31 t2 = t(W(str), null);
        t2.s = false;
        t2.k(z);
    }

    public final u31 g(String str, ArrayList arrayList) {
        hd0 hd0Var;
        t31 t31Var = new t31(this.c, X(), false);
        int i = 0;
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            hd0Var = t31Var.a;
            if (i >= size || i2 >= 3) {
                break;
            }
            TLObject tLObject = (TLObject) arrayList.get(i);
            if (tLObject != null) {
                int i3 = i2 + 1;
                hd0Var.setCount(i3);
                hd0Var.b(i2, z8c.t0, tLObject);
                i2 = i3;
            }
            i++;
        }
        if (arrayList.size() == 1) {
            hd0Var.setTranslationX(gm.L(4.0f));
            hd0Var.setScaleX(1.2f);
            hd0Var.setScaleY(1.2f);
        } else {
            hd0Var.setScaleX(1.0f);
            hd0Var.setScaleY(1.0f);
        }
        hd0Var.a(false);
        l66 l66Var = t31Var.b;
        l66Var.setSingleLine(false);
        l66Var.setMaxLines(2);
        l66Var.setText(str);
        if (l66Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = gm.L(74 - ((3 - i2) * 12));
            if (jb6.a0) {
                ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) l66Var.getLayoutParams()).leftMargin = L;
            }
        }
        if (jb6.a0) {
            hd0Var.setTranslationX(gm.L(32 - ((i2 - 1) * 12)));
        }
        return b(t31Var, 5000);
    }

    public final void g0(TLRPC.TL_error tL_error, boolean z) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                u31 t = t(jb6.a0(null, null, 2131743566, new Object[0]), null);
                t.s = false;
                t.k(z);
            } else if (tL_error.code != 406) {
                u31 t2 = t(W(tL_error.text), null);
                t2.s = false;
                t2.k(z);
            }
        }
    }

    public final u31 h(TLRPC.Document document, final int i, final qac qacVar) {
        SpannableStringBuilder spannableStringBuilder;
        ta6 ta6Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder S2;
        final TLRPC.InputStickerSet i1 = k47.i1(document);
        if (i1 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet n0 = hs6.d0(z8c.t0).n0(i1, true);
        if (n0 != null && (stickerSet = n0.set) != null) {
            if (i == 1) {
                S2 = gm.S2(jb6.a0("TopicContainsEmojiPackSingle", null, 2131743711, stickerSet.title));
            } else {
                String str = stickerSet.title;
                if (i == 2) {
                    S2 = gm.S2(jb6.a0("StoryContainsEmojiPackSingle", null, 2131744385, str));
                } else {
                    S2 = gm.S2(jb6.a0("MessageContainsEmojiPackSingle", null, 2131748353, str));
                }
            }
            return r(document, S2, jb6.M0(2131743247, null), new Runnable() {
                @Override
                public final void run() {
                    byte b = r3;
                    TLRPC.InputStickerSet inputStickerSet2 = i1;
                    qac qacVar2 = qacVar;
                    switch (b) {
                        case 0:
                            qacVar2.a(inputStickerSet2);
                            return;
                        default:
                            qacVar2.a(inputStickerSet2);
                            return;
                    }
                }
            });
        }
        if (i == 1) {
            spannableStringBuilder = new SpannableStringBuilder(gm.S2(jb6.a0("TopicContainsEmojiPackSingle", null, 2131743711, "<{LOADING}>")));
        } else if (i == 2) {
            spannableStringBuilder = new SpannableStringBuilder(gm.S2(jb6.a0("StoryContainsEmojiPackSingle", null, 2131744385, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(gm.S2(jb6.a0("MessageContainsEmojiPackSingle", null, 2131748353, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        ylb ylbVar = this.c;
        if (indexOf >= 0) {
            ta6Var = new ta6(null, gm.L(100.0f), gm.L(2.0f), ylbVar);
            spannableStringBuilder.setSpan(ta6Var, indexOf, indexOf + 11, 33);
            int i2 = cmb.xj;
            ta6Var.a(on2.p(cmb.v0(i2, ylbVar), 32), on2.p(cmb.v0(i2, ylbVar), 72));
        } else {
            ta6Var = null;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        String M0 = jb6.M0(2131743247, null);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                TLRPC.InputStickerSet inputStickerSet2 = i1;
                qac qacVar2 = qacVar;
                switch (b) {
                    case 0:
                        qacVar2.a(inputStickerSet2);
                        return;
                    default:
                        qacVar2.a(inputStickerSet2);
                        return;
                }
            }
        };
        Context X = X();
        ?? b31Var = new b31(X, ylbVar);
        l66 l66Var = new l66(X, null);
        b31Var.d = l66Var;
        l66Var.setDisablePaddingsOffset(true);
        l66Var.setSingleLine();
        l66Var.setTypeface(Typeface.SANS_SERIF);
        l66Var.setTextSize(1, 15.0f);
        l66Var.setEllipsize(TextUtils.TruncateAt.END);
        l66Var.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        b31Var.b.setVisibility(8);
        b31Var.addView(l66Var, qoe.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i3 = cmb.xj;
        b31Var.setTextColor(b31Var.getThemedColor(i3));
        if (k47.B4(document)) {
            inputStickerSet = i1;
            anb.s(b31Var.a, i3, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i1;
        }
        b31Var.e(document, new String[0]);
        b31Var.b.setTextSize(1, 14.0f);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(3);
        l66Var.setText(spannableStringBuilder);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setSingleLine(false);
        l66Var.setMaxLines(3);
        s31 s31Var = new s31(ylbVar, X(), true);
        s31Var.e(M0);
        s31Var.b = runnable;
        b31Var.setButton(s31Var);
        final u31 b = b(b31Var, 2750);
        if (ta6Var != null) {
            y21 y21Var = b.e;
            if (y21Var instanceof z21) {
                ta6Var.b = ((z21) y21Var).d;
            }
        }
        hs6.d0(z8c.t0).m0(inputStickerSet, null, false, false, new qac() {
            @Override
            public final void a(Object obj) {
                Object M02;
                TLRPC.StickerSet stickerSet2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null) {
                    String str2 = stickerSet2.title;
                    byte b2 = i;
                    if (b2 == 1) {
                        M02 = gm.S2(jb6.a0("TopicContainsEmojiPackSingle", null, 2131743711, str2));
                    } else if (b2 == 2) {
                        M02 = gm.S2(jb6.a0("StoryContainsEmojiPackSingle", null, 2131744385, str2));
                    } else {
                        M02 = gm.S2(jb6.a0("MessageContainsEmojiPackSingle", null, 2131748353, str2));
                    }
                } else {
                    M02 = jb6.M0(2131754432, null);
                }
                gm.d3(new y31(b, M02, (byte) 0), Math.max(1L, 750 - (System.currentTimeMillis() - currentTimeMillis)));
            }
        });
        return b;
    }

    public final boolean h0(int i, long j) {
        d dVar;
        SpannableStringBuilder N2;
        if (z8c.h(z8c.t0).p() && (dVar = this.a) != null) {
            f31 f31Var = new f31(i, dVar);
            if (j == z8c.h(z8c.t0).n) {
                if (i <= 1) {
                    N2 = gm.N2(jb6.M0(2131750431, null), -1, 2, new jd((byte) 14), null);
                } else {
                    N2 = gm.N2(jb6.M0(2131750424, null), -1, 2, new jd((byte) 14), null);
                }
                f31Var.c(2131624185, 36, 36, new String[0]);
                f31Var.b.setText(N2);
                f31Var.b.setSingleLine(false);
                f31Var.b.setMaxLines(2);
                u31 b = b(f31Var, 3500);
                f31Var.setBulletin(b);
                b.s = false;
                b.k(true);
                return true;
            }
        }
        return false;
    }

    public final u31 i(String str) {
        if (!gm.C3()) {
            return new u31();
        }
        b31 b31Var = new b31(X(), null);
        b31Var.c(2131623994, 36, 36, "NULL ROTATION", "Back", "Front");
        b31Var.b.setText(str);
        return b(b31Var, 1500);
    }

    public final u31 k(boolean z) {
        if (!gm.C3()) {
            return new u31();
        }
        ylb ylbVar = this.c;
        if (z) {
            r31 r31Var = new r31(X(), ylbVar);
            r31Var.c(2131624341, 36, 36, "Wibe", "Circle");
            r31Var.b.setText(jb6.M0(2131748678, null));
            r31Var.c.setText(jb6.M0(2131748676, null));
            return b(r31Var, 2750);
        }
        b31 b31Var = new b31(X(), ylbVar);
        b31Var.c(2131624341, 36, 36, "Wibe", "Circle");
        b31Var.b.setText(jb6.M0(2131748678, null));
        return b(b31Var, 1500);
    }

    public final u31 m(b41 b41Var, int i, int i2, int i3, ylb ylbVar) {
        b31 b31Var;
        String M0;
        if (i2 != 0 && i3 != 0) {
            b31Var = new b31(i2, i3, ylbVar, X());
        } else {
            b31Var = new b31(X(), ylbVar);
        }
        a41 a41Var = b41Var.d;
        b31Var.d(a41Var.a, a41Var.b);
        TextView textView = b31Var.b;
        boolean z = b41Var.c;
        String str = b41Var.a;
        if (z) {
            M0 = jb6.G(i, str, new Object[0]);
        } else {
            M0 = jb6.M0(b41Var.b, str);
        }
        textView.setText(gm.N2(M0, -1, 0, new jd((byte) 15), null));
        byte b = b41Var.d.c;
        if (b != 0) {
            b31Var.setIconPaddingBottom(b);
        }
        return b(b31Var, 1500);
    }

    public final u31 n(b41 b41Var, int i, ylb ylbVar) {
        return m(b41Var, i, 0, 0, ylbVar);
    }

    public final u31 o(b41 b41Var, ylb ylbVar) {
        return m(b41Var, 1, 0, 0, ylbVar);
    }

    public final u31 p(long j, String str, String str2) {
        Context X = X();
        ylb ylbVar = this.c;
        p31 p31Var = new p31(X, ylbVar);
        vm vmVar = new vm(1, z8c.t0, j);
        bf0 bf0Var = p31Var.a;
        bf0Var.setAnimatedEmojiDrawable(vmVar);
        bf0Var.setEmojiColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.F6, ylbVar), PorterDuff.Mode.SRC_IN));
        p31Var.b.setText(str);
        p31Var.c.setText(str2);
        return b(p31Var, 2750);
    }

    public final u31 q(TLRPC.Document document, CharSequence charSequence) {
        b31 b31Var = new b31(X(), this.c);
        if (k47.B4(document)) {
            anb.s(b31Var.a, cmb.xj, null, PorterDuff.Mode.SRC_IN);
        }
        b31Var.e(document, new String[0]);
        b31Var.b.setText(charSequence);
        b31Var.b.setTextSize(1, 14.0f);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(3);
        return b(b31Var, 2750);
    }

    public final u31 r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context X = X();
        ylb ylbVar = this.c;
        b31 b31Var = new b31(X, ylbVar);
        boolean B4 = k47.B4(document);
        s09 s09Var = b31Var.a;
        if (B4) {
            anb.s(s09Var, cmb.xj, null, PorterDuff.Mode.SRC_IN);
        }
        b31Var.e(document, new String[0]);
        if (s09Var.getImageReceiver() != null) {
            s09Var.getImageReceiver().q0(gm.L(4.0f));
        }
        b31Var.b.setText(charSequence);
        b31Var.b.setTextSize(1, 14.0f);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(3);
        s31 s31Var = new s31(ylbVar, X(), true);
        s31Var.e(str);
        s31Var.b = runnable;
        b31Var.setButton(s31Var);
        return b(b31Var, 2750);
    }

    public final u31 s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i;
        r31 r31Var = new r31(X(), this.c);
        boolean B4 = k47.B4(document);
        s09 s09Var = r31Var.a;
        if (B4) {
            anb.s(s09Var, cmb.xj, null, PorterDuff.Mode.SRC_IN);
        }
        s09Var.setAutoRepeat(true);
        s09Var.g(36, 36, document);
        r31Var.b.setText(str);
        r31Var.c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i = 1500;
        } else {
            i = 2750;
        }
        return b(r31Var, i);
    }

    public final u31 t(CharSequence charSequence, ylb ylbVar) {
        b31 b31Var = new b31(X(), ylbVar);
        b31Var.d(2131623982, new String[0]);
        b31Var.b.setText(charSequence);
        b31Var.b.setSingleLine(false);
        b31Var.b.setMaxLines(2);
        return b(b31Var, 1500);
    }

    public final u31 u(String str, String str2, ylb ylbVar) {
        r31 r31Var = new r31(X(), ylbVar);
        r31Var.c(2131623982, 32, 32, new String[0]);
        r31Var.b.setText(str);
        r31Var.c.setText(str2);
        return b(r31Var, 1500);
    }

    public final u31 w(int i, CharSequence charSequence) {
        Context X = X();
        ylb ylbVar = this.c;
        b31 b31Var = new b31(X, ylbVar);
        b31Var.setBackground(cmb.v0(cmb.vj, ylbVar), 12);
        b31Var.a.setImageResource(i);
        b31Var.b.setText(charSequence);
        b31Var.b.setSingleLine(false);
        b31Var.b.setLines(2);
        b31Var.b.setMaxLines(4);
        TextView textView = b31Var.b;
        textView.setMaxWidth(hg5.a(textView.getText(), b31Var.b.getPaint()));
        b31Var.b.setLineSpacing(gm.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) b31Var.b.getLayoutParams()).rightMargin = gm.L(12.0f);
        b31Var.setWrapWidth();
        return b(b31Var, 5000);
    }

    public final u31 y(int i, TLRPC.Document document, cu cuVar) {
        String M0;
        Context X = X();
        ylb ylbVar = this.c;
        b31 b31Var = new b31(X, ylbVar);
        b31Var.c(2131624281, 36, 36, new String[0]);
        b31Var.removeView(b31Var.b);
        fn fnVar = new fn(b31Var.getContext());
        b31Var.b = fnVar;
        fnVar.setTypeface(Typeface.SANS_SERIF);
        b31Var.b.setTextSize(1, 15.0f);
        b31Var.b.setEllipsize(TextUtils.TruncateAt.END);
        b31Var.b.setPadding(0, 0, 0, gm.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(gm.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new gn(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = b31Var.b;
        if (i > 1) {
            M0 = jb6.G(i, "SavedTagMessagesTagged", new Object[0]);
        } else {
            M0 = jb6.M0(2131745612, null);
        }
        textView.setText(new SpannableStringBuilder(M0).append((CharSequence) " ").append((CharSequence) spannableString));
        if (cuVar != null) {
            s31 s31Var = new s31(ylbVar, X(), true);
            s31Var.e(jb6.M0(2131743247, null));
            s31Var.b = cuVar;
            b31Var.setButton(s31Var);
        }
        b31Var.setTextColor(cmb.v0(cmb.xj, ylbVar));
        b31Var.addView(b31Var.b, qoe.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(b31Var, 2750);
    }

    public c41(FrameLayout frameLayout, ylb ylbVar) {
        this.b = frameLayout;
        this.a = null;
        this.c = ylbVar;
    }
}
