package di;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ig;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cx;
import org.telegram.ui.f40;
import org.telegram.ui.qv0;
import org.telegram.ui.rv0;
import org.telegram.ui.s90;
public final class m implements Runnable {
    public final int f9316a = 0;
    public final long f9317b;
    public final boolean f9318c;
    public final Object d;
    public final Object f9319e;
    public final Object f9320f;
    public final Object h;

    public m(t tVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = tVar;
        this.f9319e = tL_error;
        this.f9320f = tLObject;
        this.h = twoStepVerificationActivity;
        this.f9318c = z10;
        this.f9317b = j3;
    }

    @Override
    public final void run() {
        SpannableStringBuilder W2;
        org.telegram.ui.Components.y5 y5Var;
        int i7 = this.f9316a;
        long j3 = this.f9317b;
        boolean z10 = this.f9318c;
        Object obj = this.h;
        Object obj2 = this.f9320f;
        Object obj3 = this.f9319e;
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
                    tVar.v0(this.f9318c, this.f9317b, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 1:
                y8 y8Var = (y8) obj4;
                y10 y10Var = (y10) obj3;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                if (!y8Var.f10088e) {
                    y8.e("NO_BALANCE");
                    y10Var.a(null);
                    return;
                }
                y8Var.H(starGift, this.f9317b, tL_textWithEntities, this.f9318c, y10Var);
                return;
            case 2:
                fi.z3 z3Var = (fi.z3) obj4;
                final np npVar = (np) obj3;
                String str = (String) obj;
                TLObject tLObject2 = (TLObject) obj2;
                fi.p6 R1 = npVar.R1();
                final long j10 = this.f9317b;
                final boolean z11 = this.f9318c;
                R1.l0(j10, z11, false);
                k8.a aVar = new k8.a(15, false);
                aVar.f18214b = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                npVar.R1().l0(j10, !z11, false);
                                return;
                            default:
                                npVar.R1().l0(j10, z11, true);
                                return;
                        }
                    }
                };
                aVar.f18215c = new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                npVar.R1().l0(j10, !z11, false);
                                return;
                            default:
                                npVar.R1().l0(j10, z11, true);
                                return;
                        }
                    }
                };
                if (!z11) {
                    W2 = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131744515, org.telegram.messenger.i5.m(10, str, null)));
                } else {
                    W2 = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131744516, org.telegram.messenger.i5.m(10, str, null)));
                }
                org.telegram.ui.Components.gc V = new org.telegram.ui.Components.lc(z3Var.N0, z3Var.f12887l0).V(Arrays.asList(tLObject2), W2, null, aVar);
                V.f35520a = 2;
                V.k(true);
                return;
            case 3:
                fi.p6 p6Var = (fi.p6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                y10 y10Var2 = (y10) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (tL_error != null) {
                    if (tL_error.text.contains("BOOSTS_REQUIRED")) {
                        if (z10) {
                            np u12 = np.u1(p6Var.f12425a);
                            org.telegram.messenger.h3 I0 = u12.I0();
                            long j11 = this.f9317b;
                            I0.a(j11, new bi.i2(p6Var, y10Var2, u12, j11));
                            return;
                        }
                        y10Var2.a(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                        if (z10 && Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getContext(), h6Var);
                            String N0 = hd.N0(2131748633, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                            t1Var.S = N0;
                            t1Var.U = hd.N0(2131748634, null);
                            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                        }
                        y10Var2.a(Boolean.FALSE);
                        return;
                    } else if (tL_error.text.equalsIgnoreCase("PREMIUM_ACCOUNT_REQUIRED")) {
                        org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
                        if (z10 && Q2 != null) {
                            Q2.showDialog(new ug.y0(Q2, 14, true));
                        }
                        y10Var2.a(Boolean.FALSE);
                        return;
                    } else {
                        org.telegram.ui.Components.lc Y = org.telegram.ui.Components.lc.Y();
                        if (Y != null) {
                            Y.g0(tL_error, false);
                        }
                        y10Var2.a(Boolean.FALSE);
                        return;
                    }
                }
                y10Var2.a(Boolean.TRUE);
                return;
            case 4:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                String str2 = (String) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                ChatActivityEnterView chatActivityEnterView = ((ig) obj4).f36245a;
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
                                y5Var = new org.telegram.ui.Components.y5(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                y5Var = new org.telegram.ui.Components.y5(j3, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!z10) {
                                y5Var.fromEmojiKeyboard = true;
                            }
                            y5Var.cacheType = org.telegram.ui.Components.p5.f();
                            spannableString.setSpan(y5Var, 0, spannableString.length(), 33);
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
                f40 f40Var = (f40) obj4;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TL_phone.inviteToGroupCall invitetogroupcall = (TL_phone.inviteToGroupCall) obj;
                try {
                    t1VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr[0] = null;
                if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error2.text)) {
                    f40Var.D1(null, j3, 3);
                    return;
                } else {
                    org.telegram.ui.Components.c5.c0(f40Var.f30173a, tL_error2, (org.telegram.ui.ActionBar.g2) f40Var.d2.M().getFragmentStack().get(f40Var.d2.M().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
                    return;
                }
            case 6:
                s90 s90Var = (s90) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                int i10 = s90Var.f51979b;
                s90Var.c();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    np.u1(i10).f4(tL_contacts_resolvedPeer.users, false);
                    np.u1(i10).Z3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User c22 = np.u1(i10).c2(Long.valueOf(tL_contacts_resolvedPeer.peer.user_id));
                    if (c22 != null) {
                        org.telegram.ui.Wallet.da daVar = new org.telegram.ui.Wallet.da(c22);
                        daVar.f44118s = j3;
                        daVar.f44106h0 = str3;
                        daVar.f44107i0 = z10;
                        daVar.f44105g0 = true;
                        s90Var.u(daVar, false);
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    s90.d().g0(tL_error3, false);
                    return;
                } else {
                    return;
                }
            default:
                rv0 rv0Var = (rv0) obj4;
                ProfileActivity profileActivity = rv0Var.f51776b;
                org.telegram.ui.np npVar2 = new org.telegram.ui.np(profileActivity.f43585e1, -j3, (TLRPC.TL_chatAdminRights) obj3, null, null, (String) obj2, 2, true, !z10, null);
                npVar2.Y0 = new qv0(rv0Var, (cx) obj);
                profileActivity.presentFragment(npVar2);
                return;
        }
    }

    public m(y8 y8Var, y10 y10Var, TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        this.d = y8Var;
        this.f9319e = y10Var;
        this.f9320f = starGift;
        this.f9317b = j3;
        this.h = tL_textWithEntities;
        this.f9318c = z10;
    }

    public m(fi.z3 z3Var, np npVar, long j3, boolean z10, String str, TLObject tLObject) {
        this.d = z3Var;
        this.f9319e = npVar;
        this.f9317b = j3;
        this.f9318c = z10;
        this.h = str;
        this.f9320f = tLObject;
    }

    public m(fi.p6 p6Var, TLRPC.TL_error tL_error, boolean z10, long j3, y10 y10Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.d = p6Var;
        this.f9319e = tL_error;
        this.f9318c = z10;
        this.f9317b = j3;
        this.f9320f = y10Var;
        this.h = h6Var;
    }

    public m(ig igVar, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j3, boolean z10) {
        this.d = igVar;
        this.f9319e = editTextBoldCursor;
        this.f9320f = str;
        this.h = document;
        this.f9317b = j3;
        this.f9318c = z10;
    }

    public m(f40 f40Var, org.telegram.ui.ActionBar.t1[] t1VarArr, boolean z10, TLRPC.TL_error tL_error, long j3, TL_phone.inviteToGroupCall invitetogroupcall) {
        this.d = f40Var;
        this.f9320f = t1VarArr;
        this.f9318c = z10;
        this.f9319e = tL_error;
        this.f9317b = j3;
        this.h = invitetogroupcall;
    }

    public m(s90 s90Var, TLObject tLObject, long j3, String str, boolean z10, TLRPC.TL_error tL_error) {
        this.d = s90Var;
        this.f9320f = tLObject;
        this.f9317b = j3;
        this.h = str;
        this.f9318c = z10;
        this.f9319e = tL_error;
    }

    public m(rv0 rv0Var, long j3, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z10, cx cxVar) {
        this.d = rv0Var;
        this.f9317b = j3;
        this.f9319e = tL_chatAdminRights;
        this.f9320f = str;
        this.f9318c = z10;
        this.h = cxVar;
    }
}
