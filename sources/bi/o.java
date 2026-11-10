package bi;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.of;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.f40;
import org.telegram.ui.mp;
import org.telegram.ui.s90;
import org.telegram.ui.tv0;
import org.telegram.ui.uv0;
import org.telegram.ui.zw;
public final class o implements Runnable {
    public final int f4442a = 0;
    public final long f4443b;
    public final boolean f4444c;
    public final Object d;
    public final Object f4445e;
    public final Object f4446f;
    public final Object h;

    public o(z zVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, long j3) {
        this.f4445e = zVar;
        this.f4446f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.f4444c = z9;
        this.f4443b = j3;
    }

    @Override
    public final void run() {
        SpannableStringBuilder X2;
        org.telegram.ui.Components.q5 q5Var;
        int i7 = this.f4442a;
        long j3 = this.f4443b;
        boolean z9 = this.f4444c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f4446f;
        Object obj4 = this.f4445e;
        switch (i7) {
            case 0:
                z zVar = (z) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    zVar.u0(this.f4444c, this.f4443b, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                di.j4 j4Var = (di.j4) obj4;
                final qp qpVar = (qp) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                di.z6 P1 = qpVar.P1();
                final long j10 = this.f4443b;
                final boolean z10 = this.f4444c;
                P1.l0(j10, z10, false);
                ?? obj5 = new Object();
                obj5.f19616a = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                qpVar.P1().l0(j10, !z10, false);
                                return;
                            default:
                                qpVar.P1().l0(j10, z10, true);
                                return;
                        }
                    }
                };
                obj5.f19617b = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                qpVar.P1().l0(j10, !z10, false);
                                return;
                            default:
                                qpVar.P1().l0(j10, z10, true);
                                return;
                        }
                    }
                };
                if (!z10) {
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744758, org.telegram.messenger.g5.m(10, str, null)));
                } else {
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131744759, org.telegram.messenger.g5.m(10, str, null)));
                }
                org.telegram.ui.Components.bc V = new org.telegram.ui.Components.gc(j4Var.M0, j4Var.f9200k0).V(Arrays.asList(tLObject2), X2, null, obj5);
                V.f32196a = 2;
                V.k(true);
                return;
            case 2:
                di.z6 z6Var = (di.z6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                c20 c20Var = (c20) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z9) {
                            qp s12 = qp.s1(z6Var.f9997a);
                            org.telegram.messenger.f3 G0 = s12.G0();
                            long j11 = this.f4443b;
                            G0.a(j11, new r2(z6Var, c20Var, s12, j11, 2));
                            return;
                        }
                        c20Var.a(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                        if (z9 && Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), h6Var);
                            String M0 = org.telegram.messenger.id.M0(2131748826, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                            u1Var.R = M0;
                            u1Var.T = org.telegram.messenger.id.M0(2131748827, null);
                            jg.g.C(null, 2131747831, alertDialog$Builder, null);
                        }
                        c20Var.a(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
                        if (z9 && Q2 != null) {
                            Q2.showDialog(new ug.w0(Q2, 14, true));
                        }
                        c20Var.a(Boolean.FALSE);
                        return;
                    } else {
                        org.telegram.ui.Components.gc X = org.telegram.ui.Components.gc.X();
                        if (X != null) {
                            X.f0(tL_error, false);
                        }
                        c20Var.a(Boolean.FALSE);
                        return;
                    }
                }
                c20Var.a(Boolean.TRUE);
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((of) obj4).f36599a;
                if (editTextBoldCursor != null) {
                    int selectionEnd = editTextBoldCursor.getSelectionEnd();
                    if (selectionEnd < 0) {
                        selectionEnd = 0;
                    }
                    try {
                        try {
                            chatActivityEnterView.S2 = 2;
                            if (str2 == null) {
                                str2 = "😀";
                            }
                            SpannableString spannableString = new SpannableString(str2);
                            if (document != null) {
                                q5Var = new org.telegram.ui.Components.q5(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                q5Var = new org.telegram.ui.Components.q5(j3, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z9) {
                                q5Var.fromEmojiKeyboard = true;
                            }
                            q5Var.cacheType = org.telegram.ui.Components.h5.f();
                            spannableString.setSpan(q5Var, 0, spannableString.length(), 33);
                            editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                            editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        chatActivityEnterView.S2 = 0;
                        return;
                    } catch (Throwable th2) {
                        chatActivityEnterView.S2 = 0;
                        throw th2;
                    }
                }
                return;
            case 4:
                f40 f40Var = (f40) obj4;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) obj;
                try {
                    u1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr[0] = null;
                if (z9 && "USER_NOT_PARTICIPANT".equals(tL_error2.text)) {
                    f40Var.C1(null, j3, 3);
                    return;
                } else {
                    org.telegram.ui.Components.u4.c0(f40Var.f28669a, tL_error2, (org.telegram.ui.ActionBar.f2) f40Var.f45512c2.M().getFragmentStack().get(f40Var.f45512c2.M().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
                    return;
                }
            case 5:
                s90 s90Var = (s90) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                int i10 = s90Var.f49757b;
                s90Var.c();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    qp.s1(i10).Y3(tL_contacts_resolvedPeer.users, false);
                    qp.s1(i10).S3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (a22 != null) {
                        org.telegram.ui.Wallet.o9 o9Var = new org.telegram.ui.Wallet.o9(a22);
                        o9Var.f42937s = j3;
                        o9Var.f42924g0 = str3;
                        o9Var.f42925h0 = z9;
                        o9Var.f42923f0 = true;
                        s90Var.u(o9Var, false);
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    s90.d().f0(tL_error3, false);
                    return;
                } else {
                    return;
                }
            default:
                uv0 uv0Var = (uv0) obj4;
                ProfileActivity profileActivity = uv0Var.f50573b;
                mp mpVar = new mp(profileActivity.f41714d1, -j3, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z9, null);
                mpVar.X0 = new tv0(uv0Var, (zw) obj);
                profileActivity.presentFragment(mpVar);
                return;
        }
    }

    public o(di.j4 j4Var, qp qpVar, long j3, boolean z9, String str, TLObject tLObject) {
        this.f4445e = j4Var;
        this.f4446f = qpVar;
        this.f4443b = j3;
        this.f4444c = z9;
        this.h = str;
        this.d = tLObject;
    }

    public o(di.z6 z6Var, TLRPC.TL_error tL_error, boolean z9, long j3, c20 c20Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f4445e = z6Var;
        this.f4446f = tL_error;
        this.f4444c = z9;
        this.f4443b = j3;
        this.d = c20Var;
        this.h = h6Var;
    }

    public o(of ofVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j3, boolean z9) {
        this.f4445e = ofVar;
        this.f4446f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.f4443b = j3;
        this.f4444c = z9;
    }

    public o(f40 f40Var, org.telegram.ui.ActionBar.u1[] u1VarArr, boolean z9, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.f4445e = f40Var;
        this.d = u1VarArr;
        this.f4444c = z9;
        this.f4446f = tL_error;
        this.f4443b = j3;
        this.h = invitetogroupcall;
    }

    public o(s90 s90Var, TLObject tLObject, long j3, String str, boolean z9, TLRPC.TL_error tL_error) {
        this.f4445e = s90Var;
        this.d = tLObject;
        this.f4443b = j3;
        this.h = str;
        this.f4444c = z9;
        this.f4446f = tL_error;
    }

    public o(uv0 uv0Var, long j3, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z9, zw zwVar) {
        this.f4445e = uv0Var;
        this.f4443b = j3;
        this.f4446f = tL_chatAdminRights;
        this.d = str;
        this.f4444c = z9;
        this.h = zwVar;
    }
}
