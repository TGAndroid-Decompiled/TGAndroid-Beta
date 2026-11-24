package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public abstract class cy7 {
    public static void a(final int i, final q8c q8cVar, final eu0 eu0Var, final TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, final by7 by7Var, final k8c k8cVar, final boolean z, final boolean z2, final h24 h24Var) {
        if (!h24Var.a) {
            final d S = LaunchActivity.S();
            if (S != null && S.getContext() != null) {
                final Activity parentActivity = S.getParentActivity();
                TLRPC.User f = y6c.h(i).f();
                if (parentActivity != null && f != null) {
                    final hd hdVar = new hd(3, null, S.getContext());
                    if (z2) {
                        hdVar.q(250L);
                    }
                    p8c p8cVar = new p8c() {
                        @Override
                        public final void a(Object obj) {
                            TLMethod tLMethod = (TLMethod) obj;
                            final h24 h24Var2 = h24Var;
                            boolean z3 = h24Var2.a;
                            final hd hdVar2 = hdVar;
                            if (!z3 && tLMethod != null) {
                                final int i2 = i;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                hc hcVar = new hc((byte) 0);
                                final eu0 eu0Var2 = eu0Var;
                                final by7 by7Var2 = by7Var;
                                final k8c k8cVar2 = k8cVar;
                                final q8c q8cVar2 = q8cVar;
                                final Activity activity = parentActivity;
                                final TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP2 = tL_inputCheckPasswordSRP;
                                final d dVar = S;
                                final boolean z4 = z;
                                final boolean z5 = z2;
                                connectionsManager.sendRequestTyped(tLMethod, hcVar, new i8c() {
                                    @Override
                                    public final void a(Object obj2, Object obj3) {
                                        TLObject tLObject = (TLObject) obj2;
                                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                        hdVar2.dismiss();
                                        final h24 h24Var3 = h24Var2;
                                        if (h24Var3.a) {
                                            return;
                                        }
                                        final by7 by7Var3 = by7Var2;
                                        final k8c k8cVar3 = k8cVar2;
                                        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP3 = tL_inputCheckPasswordSRP2;
                                        if (tL_error != null) {
                                            boolean equals = "PASSWORD_MISSING".equals(tL_error.text);
                                            final int i3 = i2;
                                            final q8c q8cVar3 = q8cVar2;
                                            final eu0 eu0Var3 = eu0Var2;
                                            final boolean z6 = z4;
                                            final boolean z7 = z5;
                                            if (!equals && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                                                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                                                    ConnectionsManager.getInstance(i3).sendRequestTyped(new TL_account.getPassword(), new hc((byte) 0), new i8c() {
                                                        @Override
                                                        public final void a(Object obj4, Object obj5) {
                                                            eu0 eu0Var4;
                                                            q8c q8cVar4;
                                                            int i4;
                                                            by7 by7Var4;
                                                            TL_account.Password password = (TL_account.Password) obj4;
                                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                                            h24 h24Var4 = h24.this;
                                                            if (h24Var4.a) {
                                                                return;
                                                            }
                                                            if (tL_error2 == null) {
                                                                by7 by7Var5 = by7Var3;
                                                                int i5 = i3;
                                                                q8c q8cVar5 = q8cVar3;
                                                                eu0 eu0Var5 = eu0Var3;
                                                                k8c k8cVar4 = k8cVar3;
                                                                boolean z8 = z6;
                                                                boolean z9 = z7;
                                                                if (by7Var5 == null) {
                                                                    by7Var4 = new by7(h24Var4);
                                                                    by7Var4.setCurrentAccount(i5);
                                                                    eu0Var4 = eu0Var5;
                                                                    q8cVar4 = q8cVar5;
                                                                    i4 = i5;
                                                                    wx7 wx7Var = new wx7(i4, q8cVar4, eu0Var4, by7Var4, k8cVar4, z8, z9, h24Var4, (byte) 1);
                                                                    by7Var4.a0 = (byte) 1;
                                                                    by7Var4.c0 = wx7Var;
                                                                    by7Var4.w0(new vj6(h24Var4, z8, by7Var4, (byte) 11));
                                                                } else {
                                                                    eu0Var4 = eu0Var5;
                                                                    q8cVar4 = q8cVar5;
                                                                    i4 = i5;
                                                                    by7Var4 = by7Var5;
                                                                }
                                                                by7Var4.J = password;
                                                                TwoStepVerificationActivity.e0(password);
                                                                cy7.a(i4, q8cVar4, eu0Var4, by7Var4.d0(), by7Var4, k8cVar4, z8, z9, h24Var4);
                                                                return;
                                                            }
                                                            h24Var4.f();
                                                        }
                                                    }, 8);
                                                    return;
                                                }
                                                h24Var3.b = true;
                                                if (by7Var3 != null) {
                                                    try {
                                                        by7Var3.s0();
                                                        by7Var3.finishFragment();
                                                    } finally {
                                                    }
                                                }
                                                k8cVar3.a(tLObject, tL_error, tL_inputCheckPasswordSRP3);
                                                return;
                                            }
                                            if (by7Var3 != null) {
                                                by7Var3.s0();
                                            }
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i3);
                                            TL_account.getPassword getpassword = new TL_account.getPassword();
                                            hc hcVar2 = new hc((byte) 0);
                                            final Activity activity2 = activity;
                                            final d dVar2 = dVar;
                                            connectionsManager2.sendRequestTyped(getpassword, hcVar2, new i8c() {
                                                @Override
                                                public final void a(Object obj4, Object obj5) {
                                                    int i4;
                                                    int i5;
                                                    int L;
                                                    int i6;
                                                    int i7;
                                                    int L2;
                                                    int i8;
                                                    int i9;
                                                    TL_account.Password password = (TL_account.Password) obj4;
                                                    TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                                    h24 h24Var4 = h24.this;
                                                    if (h24Var4.a) {
                                                        return;
                                                    }
                                                    if (tL_error2 == null) {
                                                        by7 by7Var4 = new by7(h24Var4);
                                                        int i10 = i3;
                                                        by7Var4.setCurrentAccount(i10);
                                                        q8c q8cVar4 = q8cVar3;
                                                        eu0 eu0Var4 = eu0Var3;
                                                        k8c k8cVar4 = k8cVar3;
                                                        boolean z8 = z6;
                                                        wx7 wx7Var = new wx7(i10, q8cVar4, eu0Var4, by7Var4, k8cVar4, z8, z7, h24Var4, (byte) 0);
                                                        by7Var4.a0 = (byte) 1;
                                                        by7Var4.c0 = wx7Var;
                                                        by7Var4.J = password;
                                                        by7Var4.K = false;
                                                        d S2 = LaunchActivity.S();
                                                        if (S2 != 0 && S2.getContext() != null) {
                                                            if (z8) {
                                                                ?? obj6 = new Object();
                                                                obj6.a = true;
                                                                S2.showAsSheet(by7Var4, obj6);
                                                                return;
                                                            }
                                                            S2.presentFragment(by7Var4);
                                                            return;
                                                        }
                                                        h24Var4.f();
                                                        return;
                                                    }
                                                    h24Var4.f();
                                                    Activity activity3 = activity2;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity3);
                                                    String M0 = k96.M0(2131751285, null);
                                                    hd hdVar3 = alertDialog$Builder.a;
                                                    hdVar3.S = M0;
                                                    LinearLayout linearLayout = new LinearLayout(activity3);
                                                    linearLayout.setPadding(gl.L(24.0f), gl.L(2.0f), gl.L(24.0f), 0);
                                                    linearLayout.setOrientation(1);
                                                    alertDialog$Builder.n(linearLayout);
                                                    TextView textView = new TextView(activity3);
                                                    int i11 = bkb.i5;
                                                    zkb.X(textView, i11, null);
                                                    textView.setTextSize(1, 16.0f);
                                                    if (k96.a0) {
                                                        i4 = 5;
                                                    } else {
                                                        i4 = 3;
                                                    }
                                                    textView.setGravity(i4 | 48);
                                                    textView.setText(gl.T2(k96.M0(2131742601, null)));
                                                    linearLayout.addView(textView, nme.o(-1, -2));
                                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                                    linearLayout2.setOrientation(0);
                                                    linearLayout.addView(linearLayout2, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView = new ImageView(activity3);
                                                    imageView.setImageResource(2131231627);
                                                    if (k96.a0) {
                                                        i5 = gl.L(11.0f);
                                                    } else {
                                                        i5 = 0;
                                                    }
                                                    int L3 = gl.L(9.0f);
                                                    if (k96.a0) {
                                                        L = 0;
                                                    } else {
                                                        L = gl.L(11.0f);
                                                    }
                                                    imageView.setPadding(i5, L3, L, 0);
                                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                                    zkb.s(imageView, i11, null, mode);
                                                    TextView textView2 = new TextView(activity3);
                                                    zkb.X(textView2, i11, null);
                                                    textView2.setTextSize(1, 16.0f);
                                                    if (k96.a0) {
                                                        i6 = 5;
                                                    } else {
                                                        i6 = 3;
                                                    }
                                                    textView2.setGravity(i6 | 48);
                                                    textView2.setText(gl.T2(k96.M0(2131751288, null)));
                                                    if (k96.a0) {
                                                        linearLayout2.addView(textView2, nme.o(-1, -2));
                                                        linearLayout2.addView(imageView, nme.r(-2, -2, 5));
                                                    } else {
                                                        linearLayout2.addView(imageView, nme.o(-2, -2));
                                                        linearLayout2.addView(textView2, nme.o(-1, -2));
                                                    }
                                                    LinearLayout m = ir2.m(activity3, 0);
                                                    linearLayout.addView(m, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView2 = new ImageView(activity3);
                                                    imageView2.setImageResource(2131231627);
                                                    if (k96.a0) {
                                                        i7 = gl.L(11.0f);
                                                    } else {
                                                        i7 = 0;
                                                    }
                                                    int L4 = gl.L(9.0f);
                                                    if (k96.a0) {
                                                        L2 = 0;
                                                    } else {
                                                        L2 = gl.L(11.0f);
                                                    }
                                                    imageView2.setPadding(i7, L4, L2, 0);
                                                    zkb.s(imageView2, i11, null, mode);
                                                    TextView textView3 = new TextView(activity3);
                                                    zkb.X(textView3, i11, null);
                                                    textView3.setTextSize(1, 16.0f);
                                                    if (k96.a0) {
                                                        i8 = 5;
                                                    } else {
                                                        i8 = 3;
                                                    }
                                                    textView3.setGravity(i8 | 48);
                                                    textView3.setText(gl.T2(k96.M0(2131751287, null)));
                                                    if (k96.a0) {
                                                        m.addView(textView3, nme.o(-1, -2));
                                                        m.addView(imageView2, nme.r(-2, -2, 5));
                                                    } else {
                                                        m.addView(imageView2, nme.o(-2, -2));
                                                        m.addView(textView3, nme.o(-1, -2));
                                                    }
                                                    boolean equals2 = "PASSWORD_MISSING".equals(tL_error.text);
                                                    d dVar3 = dVar2;
                                                    if (equals2) {
                                                        alertDialog$Builder.j(k96.M0(2131751279, null), new h6(dVar3, (byte) 5));
                                                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                                    } else {
                                                        TextView textView4 = new TextView(activity3);
                                                        zkb.X(textView4, i11, null);
                                                        textView4.setTextSize(1, 16.0f);
                                                        if (k96.a0) {
                                                            i9 = 5;
                                                        } else {
                                                            i9 = 3;
                                                        }
                                                        de9.q(textView4, i9 | 48, null, 2131751286);
                                                        linearLayout.addView(textView4, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                        alertDialog$Builder.g(k96.M0(2131747638, null), null);
                                                    }
                                                    by7 by7Var5 = by7Var3;
                                                    if (by7Var5 != null) {
                                                        by7Var5.showDialog(hdVar3);
                                                    } else {
                                                        dVar3.showDialog(hdVar3);
                                                    }
                                                }
                                            }, 8);
                                            return;
                                        }
                                        h24Var3.b = true;
                                        if (by7Var3 != null) {
                                            try {
                                                by7Var3.s0();
                                                by7Var3.finishFragment();
                                            } finally {
                                            }
                                        }
                                        k8cVar3.a(tLObject, tL_error, tL_inputCheckPasswordSRP3);
                                    }
                                });
                                return;
                            }
                            hdVar2.dismiss();
                            h24Var2.f();
                        }
                    };
                    if (q8cVar != null) {
                        p8cVar.a((TLMethod) q8cVar.a(tL_inputCheckPasswordSRP));
                        return;
                    } else if (eu0Var != null) {
                        eu0Var.a(tL_inputCheckPasswordSRP, p8cVar);
                        return;
                    } else {
                        return;
                    }
                }
                h24Var.f();
                return;
            }
            h24Var.f();
        }
    }
}
