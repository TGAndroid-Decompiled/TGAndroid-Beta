package di;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.wf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c40;
import org.telegram.ui.mp;
import org.telegram.ui.ov0;
import org.telegram.ui.pv0;
import org.telegram.ui.q90;
import org.telegram.ui.yw;
public final class l implements Runnable {
    public final int f8943a = 0;
    public final long f8944b;
    public final boolean f8945c;
    public final Object d;
    public final Object f8946e;
    public final Object f8947f;
    public final Object h;

    public l(t tVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.f8946e = tVar;
        this.f8947f = tL_error;
        this.d = tLObject;
        this.h = twoStepVerificationActivity;
        this.f8945c = z10;
        this.f8944b = j3;
    }

    @Override
    public final void run() {
        SpannableStringBuilder X2;
        org.telegram.ui.Components.p5 p5Var;
        int i7 = this.f8943a;
        long j3 = this.f8944b;
        boolean z10 = this.f8945c;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f8947f;
        Object obj4 = this.f8946e;
        switch (i7) {
            case 0:
                t tVar = (t) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    tVar.u0(this.f8945c, this.f8944b, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                fi.b4 b4Var = (fi.b4) obj4;
                final np npVar = (np) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                fi.s6 P1 = npVar.P1();
                final long j10 = this.f8944b;
                final boolean z11 = this.f8945c;
                P1.l0(j10, z11, false);
                k8.a aVar = new k8.a(15, false);
                aVar.f17788b = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                npVar.P1().l0(j10, !z11, false);
                                return;
                            default:
                                npVar.P1().l0(j10, z11, true);
                                return;
                        }
                    }
                };
                aVar.f17789c = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                npVar.P1().l0(j10, !z11, false);
                                return;
                            default:
                                npVar.P1().l0(j10, z11, true);
                                return;
                        }
                    }
                };
                if (!z11) {
                    X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744758, org.telegram.messenger.g5.m(10, str, null)));
                } else {
                    X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744759, org.telegram.messenger.g5.m(10, str, null)));
                }
                org.telegram.ui.Components.xb V = new org.telegram.ui.Components.cc(b4Var.N0, b4Var.f11493l0).V(Arrays.asList(tLObject2), X2, null, aVar);
                V.f41628a = 2;
                V.k(true);
                return;
            case 2:
                fi.s6 s6Var = (fi.s6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                z10 z10Var = (z10) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            np s12 = np.s1(s6Var.f12319a);
                            org.telegram.messenger.f3 G0 = s12.G0();
                            long j11 = this.f8944b;
                            G0.a(j11, new bi.i1(s6Var, z10Var, s12, j11));
                            return;
                        }
                        z10Var.a(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                        if (z10 && Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), e6Var);
                            String M0 = hd.M0(2131748826, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            t1Var.S = M0;
                            t1Var.U = hd.M0(2131748827, null);
                            i5.c.C(null, 2131747831, alertDialog$Builder, null);
                        }
                        z10Var.a(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.e2 Q2 = LaunchActivity.Q();
                        if (z10 && Q2 != null) {
                            Q2.showDialog(new ug.x0(Q2, 14, true));
                        }
                        z10Var.a(Boolean.FALSE);
                        return;
                    } else {
                        org.telegram.ui.Components.cc X = org.telegram.ui.Components.cc.X();
                        if (X != null) {
                            X.f0(tL_error, false);
                        }
                        z10Var.a(Boolean.FALSE);
                        return;
                    }
                }
                z10Var.a(Boolean.TRUE);
                return;
            case 3:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((wf) obj4).f41334a;
                if (editTextBoldCursor != null) {
                    int selectionEnd = editTextBoldCursor.getSelectionEnd();
                    if (selectionEnd < 0) {
                        selectionEnd = 0;
                    }
                    try {
                        try {
                            chatActivityEnterView.A3 = 2;
                            if (str2 == null) {
                                str2 = "😀";
                            }
                            SpannableString spannableString = new SpannableString(str2);
                            if (document != null) {
                                p5Var = new org.telegram.ui.Components.p5(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                p5Var = new org.telegram.ui.Components.p5(j3, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                p5Var.fromEmojiKeyboard = true;
                            }
                            p5Var.cacheType = org.telegram.ui.Components.g5.f();
                            spannableString.setSpan(p5Var, 0, spannableString.length(), 33);
                            editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                            editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        chatActivityEnterView.A3 = 0;
                        return;
                    } catch (Throwable th2) {
                        chatActivityEnterView.A3 = 0;
                        throw th2;
                    }
                }
                return;
            case 4:
                c40 c40Var = (c40) obj4;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) obj;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr[0] = null;
                if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error2.text)) {
                    c40Var.C1(null, j3, 3);
                    return;
                } else {
                    org.telegram.ui.Components.t4.c0(c40Var.f29679a, tL_error2, (org.telegram.ui.ActionBar.e2) c40Var.d2.M().getFragmentStack().get(c40Var.d2.M().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
                    return;
                }
            case 5:
                q90 q90Var = (q90) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                int i10 = q90Var.f50502b;
                q90Var.c();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    np.s1(i10).Y3(tL_contacts_resolvedPeer.users, false);
                    np.s1(i10).S3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User a22 = np.s1(i10).a2(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (a22 != null) {
                        org.telegram.ui.Wallet.p9 p9Var = new org.telegram.ui.Wallet.p9(a22);
                        p9Var.f44354s = j3;
                        p9Var.f44342h0 = str3;
                        p9Var.f44343i0 = z10;
                        p9Var.f44341g0 = true;
                        q90Var.u(p9Var, false);
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    q90.d().f0(tL_error3, false);
                    return;
                } else {
                    return;
                }
            default:
                pv0 pv0Var = (pv0) obj4;
                ProfileActivity profileActivity = pv0Var.f50374b;
                mp mpVar = new mp(profileActivity.f43094e1, -j3, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                mpVar.Y0 = new ov0(pv0Var, (yw) obj);
                profileActivity.presentFragment(mpVar);
                return;
        }
    }

    public l(fi.b4 b4Var, np npVar, long j3, boolean z10, String str, TLObject tLObject) {
        this.f8946e = b4Var;
        this.f8947f = npVar;
        this.f8944b = j3;
        this.f8945c = z10;
        this.h = str;
        this.d = tLObject;
    }

    public l(fi.s6 s6Var, TLRPC.TL_error tL_error, boolean z10, long j3, z10 z10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f8946e = s6Var;
        this.f8947f = tL_error;
        this.f8945c = z10;
        this.f8944b = j3;
        this.d = z10Var;
        this.h = e6Var;
    }

    public l(wf wfVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j3, boolean z10) {
        this.f8946e = wfVar;
        this.f8947f = editTextBoldCursor;
        this.d = str;
        this.h = document;
        this.f8944b = j3;
        this.f8945c = z10;
    }

    public l(c40 c40Var, org.telegram.ui.ActionBar.t1[] t1VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.f8946e = c40Var;
        this.d = t1VarArr;
        this.f8945c = z10;
        this.f8947f = tL_error;
        this.f8944b = j3;
        this.h = invitetogroupcall;
    }

    public l(q90 q90Var, TLObject tLObject, long j3, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.f8946e = q90Var;
        this.d = tLObject;
        this.f8944b = j3;
        this.h = str;
        this.f8945c = z10;
        this.f8947f = tL_error;
    }

    public l(pv0 pv0Var, long j3, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, yw ywVar) {
        this.f8946e = pv0Var;
        this.f8944b = j3;
        this.f8947f = tL_chatAdminRights;
        this.d = str;
        this.f8945c = z10;
        this.h = ywVar;
    }
}
