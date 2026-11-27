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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public abstract class i18 {
    public static void a(final int i, final qcc qccVar, final nu0 nu0Var, final TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, final h18 h18Var, final kcc kccVar, final boolean z, final boolean z2, final c34 c34Var) {
        if (!c34Var.a) {
            final e S = LaunchActivity.S();
            if (S != null && S.getContext() != null) {
                final Activity parentActivity = S.getParentActivity();
                TLRPC.User f = yac.h(i).f();
                if (parentActivity != null && f != null) {
                    final id idVar = new id(3, null, S.getContext());
                    if (z2) {
                        idVar.q(250L);
                    }
                    pcc pccVar = new pcc() {
                        @Override
                        public final void a(Object obj) {
                            TLMethod tLMethod = (TLMethod) obj;
                            final c34 c34Var2 = c34Var;
                            boolean z3 = c34Var2.a;
                            final id idVar2 = idVar;
                            if (!z3 && tLMethod != null) {
                                final int i2 = i;
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                ic icVar = new ic((byte) 0);
                                final nu0 nu0Var2 = nu0Var;
                                final h18 h18Var2 = h18Var;
                                final kcc kccVar2 = kccVar;
                                final qcc qccVar2 = qccVar;
                                final Activity activity = parentActivity;
                                final TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP2 = tL_inputCheckPasswordSRP;
                                final e eVar = S;
                                final boolean z4 = z;
                                final boolean z5 = z2;
                                connectionsManager.sendRequestTyped(tLMethod, icVar, new icc() {
                                    @Override
                                    public final void a(Object obj2, Object obj3) {
                                        TLObject tLObject = (TLObject) obj2;
                                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                        idVar2.dismiss();
                                        final c34 c34Var3 = c34Var2;
                                        if (c34Var3.a) {
                                            return;
                                        }
                                        final h18 h18Var3 = h18Var2;
                                        final kcc kccVar3 = kccVar2;
                                        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP3 = tL_inputCheckPasswordSRP2;
                                        if (tL_error != null) {
                                            boolean equals = "PASSWORD_MISSING".equals(tL_error.text);
                                            final int i3 = i2;
                                            final qcc qccVar3 = qccVar2;
                                            final nu0 nu0Var3 = nu0Var2;
                                            final boolean z6 = z4;
                                            final boolean z7 = z5;
                                            if (!equals && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                                                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                                                    ConnectionsManager.getInstance(i3).sendRequestTyped(new TL_account.getPassword(), new ic((byte) 0), new icc() {
                                                        @Override
                                                        public final void a(Object obj4, Object obj5) {
                                                            nu0 nu0Var4;
                                                            qcc qccVar4;
                                                            int i4;
                                                            h18 h18Var4;
                                                            TL_account.Password password = (TL_account.Password) obj4;
                                                            TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj5;
                                                            c34 c34Var4 = c34.this;
                                                            if (c34Var4.a) {
                                                                return;
                                                            }
                                                            if (tL_error2 == null) {
                                                                h18 h18Var5 = h18Var3;
                                                                int i5 = i3;
                                                                qcc qccVar5 = qccVar3;
                                                                nu0 nu0Var5 = nu0Var3;
                                                                kcc kccVar4 = kccVar3;
                                                                boolean z8 = z6;
                                                                boolean z9 = z7;
                                                                if (h18Var5 == null) {
                                                                    h18Var4 = new h18(c34Var4);
                                                                    h18Var4.setCurrentAccount(i5);
                                                                    nu0Var4 = nu0Var5;
                                                                    qccVar4 = qccVar5;
                                                                    i4 = i5;
                                                                    c18 c18Var = new c18(i4, qccVar4, nu0Var4, h18Var4, kccVar4, z8, z9, c34Var4, (byte) 1);
                                                                    h18Var4.a0 = (byte) 1;
                                                                    h18Var4.c0 = c18Var;
                                                                    h18Var4.x0(new yn6(c34Var4, z8, h18Var4, (byte) 10));
                                                                } else {
                                                                    nu0Var4 = nu0Var5;
                                                                    qccVar4 = qccVar5;
                                                                    i4 = i5;
                                                                    h18Var4 = h18Var5;
                                                                }
                                                                h18Var4.J = password;
                                                                TwoStepVerificationActivity.e0(password);
                                                                i18.a(i4, qccVar4, nu0Var4, h18Var4.d0(), h18Var4, kccVar4, z8, z9, c34Var4);
                                                                return;
                                                            }
                                                            c34Var4.f();
                                                        }
                                                    }, 8);
                                                    return;
                                                }
                                                c34Var3.b = true;
                                                if (h18Var3 != null) {
                                                    try {
                                                        h18Var3.s0();
                                                        h18Var3.finishFragment();
                                                    } finally {
                                                    }
                                                }
                                                kccVar3.a(tLObject, tL_error, tL_inputCheckPasswordSRP3);
                                                return;
                                            }
                                            if (h18Var3 != null) {
                                                h18Var3.s0();
                                            }
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(i3);
                                            TL_account.getPassword getpassword = new TL_account.getPassword();
                                            ic icVar2 = new ic((byte) 0);
                                            final Activity activity2 = activity;
                                            final e eVar2 = eVar;
                                            connectionsManager2.sendRequestTyped(getpassword, icVar2, new icc() {
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
                                                    c34 c34Var4 = c34.this;
                                                    if (c34Var4.a) {
                                                        return;
                                                    }
                                                    if (tL_error2 == null) {
                                                        h18 h18Var4 = new h18(c34Var4);
                                                        int i10 = i3;
                                                        h18Var4.setCurrentAccount(i10);
                                                        qcc qccVar4 = qccVar3;
                                                        nu0 nu0Var4 = nu0Var3;
                                                        kcc kccVar4 = kccVar3;
                                                        boolean z8 = z6;
                                                        c18 c18Var = new c18(i10, qccVar4, nu0Var4, h18Var4, kccVar4, z8, z7, c34Var4, (byte) 0);
                                                        h18Var4.a0 = (byte) 1;
                                                        h18Var4.c0 = c18Var;
                                                        h18Var4.J = password;
                                                        h18Var4.K = false;
                                                        e S2 = LaunchActivity.S();
                                                        if (S2 != 0 && S2.getContext() != null) {
                                                            if (z8) {
                                                                ?? obj6 = new Object();
                                                                obj6.a = true;
                                                                S2.showAsSheet(h18Var4, obj6);
                                                                return;
                                                            }
                                                            S2.presentFragment(h18Var4);
                                                            return;
                                                        }
                                                        c34Var4.f();
                                                        return;
                                                    }
                                                    c34Var4.f();
                                                    Activity activity3 = activity2;
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity3);
                                                    String M0 = ob6.M0(2131751262, null);
                                                    id idVar3 = alertDialog$Builder.a;
                                                    idVar3.S = M0;
                                                    LinearLayout linearLayout = new LinearLayout(activity3);
                                                    linearLayout.setPadding(hl.L(24.0f), hl.L(2.0f), hl.L(24.0f), 0);
                                                    linearLayout.setOrientation(1);
                                                    alertDialog$Builder.n(linearLayout);
                                                    TextView textView = new TextView(activity3);
                                                    int i11 = aob.j5;
                                                    yob.X(textView, i11, null);
                                                    textView.setTextSize(1, 16.0f);
                                                    if (ob6.a0) {
                                                        i4 = 5;
                                                    } else {
                                                        i4 = 3;
                                                    }
                                                    textView.setGravity(i4 | 48);
                                                    textView.setText(hl.S2(ob6.M0(2131742495, null)));
                                                    linearLayout.addView(textView, tre.o(-1, -2));
                                                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                                                    linearLayout2.setOrientation(0);
                                                    linearLayout.addView(linearLayout2, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView = new ImageView(activity3);
                                                    imageView.setImageResource(2131231627);
                                                    if (ob6.a0) {
                                                        i5 = hl.L(11.0f);
                                                    } else {
                                                        i5 = 0;
                                                    }
                                                    int L3 = hl.L(9.0f);
                                                    if (ob6.a0) {
                                                        L = 0;
                                                    } else {
                                                        L = hl.L(11.0f);
                                                    }
                                                    imageView.setPadding(i5, L3, L, 0);
                                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                                    yob.s(imageView, i11, null, mode);
                                                    TextView textView2 = new TextView(activity3);
                                                    yob.X(textView2, i11, null);
                                                    textView2.setTextSize(1, 16.0f);
                                                    if (ob6.a0) {
                                                        i6 = 5;
                                                    } else {
                                                        i6 = 3;
                                                    }
                                                    textView2.setGravity(i6 | 48);
                                                    textView2.setText(hl.S2(ob6.M0(2131751265, null)));
                                                    if (ob6.a0) {
                                                        linearLayout2.addView(textView2, tre.o(-1, -2));
                                                        linearLayout2.addView(imageView, tre.r(-2, -2, 5));
                                                    } else {
                                                        linearLayout2.addView(imageView, tre.o(-2, -2));
                                                        linearLayout2.addView(textView2, tre.o(-1, -2));
                                                    }
                                                    LinearLayout m = bs2.m(activity3, 0);
                                                    linearLayout.addView(m, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                    ImageView imageView2 = new ImageView(activity3);
                                                    imageView2.setImageResource(2131231627);
                                                    if (ob6.a0) {
                                                        i7 = hl.L(11.0f);
                                                    } else {
                                                        i7 = 0;
                                                    }
                                                    int L4 = hl.L(9.0f);
                                                    if (ob6.a0) {
                                                        L2 = 0;
                                                    } else {
                                                        L2 = hl.L(11.0f);
                                                    }
                                                    imageView2.setPadding(i7, L4, L2, 0);
                                                    yob.s(imageView2, i11, null, mode);
                                                    TextView textView3 = new TextView(activity3);
                                                    yob.X(textView3, i11, null);
                                                    textView3.setTextSize(1, 16.0f);
                                                    if (ob6.a0) {
                                                        i8 = 5;
                                                    } else {
                                                        i8 = 3;
                                                    }
                                                    textView3.setGravity(i8 | 48);
                                                    textView3.setText(hl.S2(ob6.M0(2131751264, null)));
                                                    if (ob6.a0) {
                                                        m.addView(textView3, tre.o(-1, -2));
                                                        m.addView(imageView2, tre.r(-2, -2, 5));
                                                    } else {
                                                        m.addView(imageView2, tre.o(-2, -2));
                                                        m.addView(textView3, tre.o(-1, -2));
                                                    }
                                                    boolean equals2 = "PASSWORD_MISSING".equals(tL_error.text);
                                                    e eVar3 = eVar2;
                                                    if (equals2) {
                                                        alertDialog$Builder.j(ob6.M0(2131751256, null), new i6(eVar3, (byte) 5));
                                                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                                    } else {
                                                        TextView textView4 = new TextView(activity3);
                                                        yob.X(textView4, i11, null);
                                                        textView4.setTextSize(1, 16.0f);
                                                        if (ob6.a0) {
                                                            i9 = 5;
                                                        } else {
                                                            i9 = 3;
                                                        }
                                                        uh9.q(textView4, i9 | 48, null, 2131751263);
                                                        linearLayout.addView(textView4, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                                                        alertDialog$Builder.g(ob6.M0(2131747558, null), null);
                                                    }
                                                    h18 h18Var5 = h18Var3;
                                                    if (h18Var5 != null) {
                                                        h18Var5.showDialog(idVar3);
                                                    } else {
                                                        eVar3.showDialog(idVar3);
                                                    }
                                                }
                                            }, 8);
                                            return;
                                        }
                                        c34Var3.b = true;
                                        if (h18Var3 != null) {
                                            try {
                                                h18Var3.s0();
                                                h18Var3.finishFragment();
                                            } finally {
                                            }
                                        }
                                        kccVar3.a(tLObject, tL_error, tL_inputCheckPasswordSRP3);
                                    }
                                });
                                return;
                            }
                            idVar2.dismiss();
                            c34Var2.f();
                        }
                    };
                    if (qccVar != null) {
                        pccVar.a((TLMethod) qccVar.a(tL_inputCheckPasswordSRP));
                        return;
                    } else if (nu0Var != null) {
                        nu0Var.a(tL_inputCheckPasswordSRP, pccVar);
                        return;
                    } else {
                        return;
                    }
                }
                c34Var.f();
                return;
            }
            c34Var.f();
        }
    }
}
