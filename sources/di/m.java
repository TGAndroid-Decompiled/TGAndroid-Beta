package di;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hg;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bx;
import org.telegram.ui.e40;
import org.telegram.ui.np;
import org.telegram.ui.pv0;
import org.telegram.ui.qv0;
import org.telegram.ui.r90;
public final class m implements Runnable {
    public final int f9277a = 0;
    public final long f9278b;
    public final boolean f9279c;
    public final Object d;
    public final Object f9280e;
    public final Object f9281f;
    public final Object h;

    public m(t tVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = tVar;
        this.f9280e = tL_error;
        this.f9281f = tLObject;
        this.h = twoStepVerificationActivity;
        this.f9279c = z10;
        this.f9278b = j3;
    }

    @Override
    public final void run() {
        SpannableStringBuilder W2;
        org.telegram.ui.Components.x5 x5Var;
        int i7 = this.f9277a;
        long j3 = this.f9278b;
        boolean z10 = this.f9279c;
        Object obj = this.h;
        Object obj2 = this.f9281f;
        Object obj3 = this.f9280e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                t tVar = (t) obj4;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    tVar.v0(this.f9279c, this.f9278b, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                y8 y8Var = (y8) obj4;
                w10 w10Var = (w10) obj3;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                if (!y8Var.f10049e) {
                    y8.e("NO_BALANCE");
                    w10Var.a(null);
                    return;
                }
                y8Var.H(starGift, this.f9278b, tL_textWithEntities, this.f9279c, w10Var);
                return;
            case 2:
                fi.z3 z3Var = (fi.z3) obj4;
                final mp mpVar = (mp) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                fi.p6 R1 = mpVar.R1();
                final long j10 = this.f9278b;
                final boolean z11 = this.f9279c;
                R1.l0(j10, z11, false);
                jb.m mVar = new jb.m(16, false);
                mVar.f17464b = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                mpVar.R1().l0(j10, !z11, false);
                                return;
                            default:
                                mpVar.R1().l0(j10, z11, true);
                                return;
                        }
                    }
                };
                mVar.f17465c = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                mpVar.R1().l0(j10, !z11, false);
                                return;
                            default:
                                mpVar.R1().l0(j10, z11, true);
                                return;
                        }
                    }
                };
                if (!z11) {
                    W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131744517, org.telegram.messenger.i5.m(10, str, null)));
                } else {
                    W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131744518, org.telegram.messenger.i5.m(10, str, null)));
                }
                org.telegram.ui.Components.fc V = new org.telegram.ui.Components.kc(z3Var.N0, z3Var.f12849l0).V(Arrays.asList(tLObject2), W2, null, mVar);
                V.f35084a = 2;
                V.k(true);
                return;
            case 3:
                fi.p6 p6Var = (fi.p6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                w10 w10Var2 = (w10) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            mp u12 = mp.u1(p6Var.f12387a);
                            org.telegram.messenger.h3 I0 = u12.I0();
                            long j11 = this.f9278b;
                            I0.a(j11, new bi.k2(p6Var, w10Var2, u12, j11));
                            return;
                        }
                        w10Var2.a(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                        if (z10 && Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), i6Var);
                            String N0 = gd.N0(2131748633, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                            t1Var.S = N0;
                            t1Var.U = gd.N0(2131748634, null);
                            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                        }
                        w10Var2.a(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                        if (z10 && Q2 != null) {
                            Q2.showDialog(new ug.y0(Q2, 14, true));
                        }
                        w10Var2.a(Boolean.FALSE);
                        return;
                    } else {
                        org.telegram.ui.Components.kc Y = org.telegram.ui.Components.kc.Y();
                        if (Y != null) {
                            Y.g0(tL_error, false);
                        }
                        w10Var2.a(Boolean.FALSE);
                        return;
                    }
                }
                w10Var2.a(Boolean.TRUE);
                return;
            case 4:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((hg) obj4).f35730a;
                if (editTextBoldCursor != null) {
                    int selectionEnd = editTextBoldCursor.getSelectionEnd();
                    if (selectionEnd < 0) {
                        selectionEnd = 0;
                    }
                    try {
                        try {
                            chatActivityEnterView.I3 = 2;
                            if (str2 == null) {
                                str2 = "😀";
                            }
                            SpannableString spannableString = new SpannableString(str2);
                            if (document != null) {
                                x5Var = new org.telegram.ui.Components.x5(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                x5Var = new org.telegram.ui.Components.x5(j3, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                x5Var.fromEmojiKeyboard = true;
                            }
                            x5Var.cacheType = org.telegram.ui.Components.o5.f();
                            spannableString.setSpan(x5Var, 0, spannableString.length(), 33);
                            editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                            editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        chatActivityEnterView.I3 = 0;
                        return;
                    } catch (Throwable th2) {
                        chatActivityEnterView.I3 = 0;
                        throw th2;
                    }
                }
                return;
            case 5:
                e40 e40Var = (e40) obj4;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) obj;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr[0] = null;
                if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error2.text)) {
                    e40Var.D1(null, j3, 3);
                    return;
                } else {
                    org.telegram.ui.Components.b5.c0(e40Var.f30223a, tL_error2, (org.telegram.ui.ActionBar.g2) e40Var.d2.M().getFragmentStack().get(e40Var.d2.M().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
                    return;
                }
            case 6:
                r90 r90Var = (r90) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                int i10 = r90Var.f51668b;
                r90Var.c();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    mp.u1(i10).f4(tL_contacts_resolvedPeer.users, false);
                    mp.u1(i10).Z3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (c22 != null) {
                        org.telegram.ui.Wallet.ea eaVar = new org.telegram.ui.Wallet.ea(c22);
                        eaVar.f44246s = j3;
                        eaVar.f44234h0 = str3;
                        eaVar.f44235i0 = z10;
                        eaVar.f44233g0 = true;
                        r90Var.u(eaVar, false);
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    r90.d().g0(tL_error3, false);
                    return;
                } else {
                    return;
                }
            default:
                qv0 qv0Var = (qv0) obj4;
                ProfileActivity profileActivity = qv0Var.f51546b;
                np npVar = new np(profileActivity.f43666e1, -j3, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                npVar.Y0 = new pv0(qv0Var, (bx) obj);
                profileActivity.presentFragment(npVar);
                return;
        }
    }

    public m(y8 y8Var, w10 w10Var, TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.d = y8Var;
        this.f9280e = w10Var;
        this.f9281f = starGift;
        this.f9278b = j3;
        this.h = tL_textWithEntities;
        this.f9279c = z10;
    }

    public m(fi.z3 z3Var, mp mpVar, long j3, boolean z10, String str, TLObject tLObject) {
        this.d = z3Var;
        this.f9280e = mpVar;
        this.f9278b = j3;
        this.f9279c = z10;
        this.h = str;
        this.f9281f = tLObject;
    }

    public m(fi.p6 p6Var, TLRPC.TL_error tL_error, boolean z10, long j3, w10 w10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.d = p6Var;
        this.f9280e = tL_error;
        this.f9279c = z10;
        this.f9278b = j3;
        this.f9281f = w10Var;
        this.h = i6Var;
    }

    public m(hg hgVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j3, boolean z10) {
        this.d = hgVar;
        this.f9280e = editTextBoldCursor;
        this.f9281f = str;
        this.h = document;
        this.f9278b = j3;
        this.f9279c = z10;
    }

    public m(e40 e40Var, org.telegram.ui.ActionBar.t1[] t1VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = e40Var;
        this.f9281f = t1VarArr;
        this.f9279c = z10;
        this.f9280e = tL_error;
        this.f9278b = j3;
        this.h = invitetogroupcall;
    }

    public m(r90 r90Var, TLObject tLObject, long j3, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.d = r90Var;
        this.f9281f = tLObject;
        this.f9278b = j3;
        this.h = str;
        this.f9279c = z10;
        this.f9280e = tL_error;
    }

    public m(qv0 qv0Var, long j3, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, bx bxVar) {
        this.d = qv0Var;
        this.f9278b = j3;
        this.f9280e = tL_chatAdminRights;
        this.f9281f = str;
        this.f9279c = z10;
        this.h = bxVar;
    }
}
