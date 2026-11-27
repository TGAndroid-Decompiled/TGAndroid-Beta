package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.webkit.WebView;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
public final class ql7 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public ql7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void run() {
        long j;
        long j2;
        d31 Y;
        v21 Q;
        int i;
        int i2;
        int i3;
        int i4;
        String G;
        boolean z;
        boolean z2;
        TLRPC.Chat M0;
        int i5;
        int i6;
        String M02;
        String a0;
        v21 Q2;
        String str;
        z28 z28Var;
        z28 z28Var2;
        long j3 = 0;
        String str2 = "";
        switch (this.a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.b;
                ((sl7) this.c).dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.Q2(user.id));
                    return;
                }
                return;
            case 1:
                ((v35) this.c).a((TLRPC.User) this.b);
                return;
            case 2:
                lm7 lm7Var = (lm7) this.c;
                TLObject tLObject = (TLObject) this.b;
                ArrayList arrayList = lm7Var.c;
                jm7[] jm7VarArr = lm7Var.b;
                HashSet hashSet = lm7Var.e;
                HashSet hashSet2 = lm7Var.d;
                if (!lm7Var.h) {
                    lm7Var.n = false;
                    if (!(tLObject instanceof TL_feed.TL_interestCategories)) {
                        lm7Var.r = true;
                        lm7.J0(jm7VarArr[0]);
                        return;
                    }
                    TL_feed.TL_interestCategories tL_interestCategories = (TL_feed.TL_interestCategories) tLObject;
                    arrayList.clear();
                    arrayList.addAll(tL_interestCategories.categories);
                    if (!lm7Var.f && hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(tL_interestCategories.selected);
                        hashSet.clear();
                        hashSet.addAll(tL_interestCategories.selected);
                    }
                    lm7Var.K0(false);
                    lm7.J0(jm7VarArr[0]);
                    return;
                }
                return;
            case 3:
                a.b.sendBroadcast((Intent) this.c);
                a.b.sendBroadcast((Intent) this.b);
                return;
            case 4:
                try {
                    a.b.getContentResolver().call(((NotificationBadge$ZukHomeBadger) this.c).a, "setAppBadgeCount", (String) null, (Bundle) this.b);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 5:
                Uri uri = (Uri) this.c;
                File file = (File) this.b;
                try {
                    a.b.revokeUriPermission(uri, 1);
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                if (file != null) {
                    try {
                        file.delete();
                        return;
                    } catch (Exception e3) {
                        cc4.g(e3, true);
                        return;
                    }
                }
                return;
            case 6:
                ip7 ip7Var = (ip7) this.c;
                if (ip7Var.s.remove((String) this.b)) {
                    ip7Var.Z(true);
                    return;
                }
                return;
            case 7:
                ((tp8) this.c).accept((HashSet) this.b);
                return;
            case 8:
                ip7 ip7Var2 = (ip7) this.c;
                zh6 zh6Var = (zh6) this.b;
                ArrayList arrayList2 = ip7Var2.b;
                ArrayList arrayList3 = ip7Var2.a;
                int m = zh6Var.m();
                int i7 = 0;
                boolean z3 = false;
                while (i7 < m) {
                    zh6Var.j(i7);
                    ArrayList arrayList4 = (ArrayList) zh6Var.n(i7);
                    int size = arrayList4.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 < size) {
                            r47 r47Var = (r47) arrayList4.get(i8);
                            j = j3;
                            boolean z4 = r47Var.J;
                            TLRPC.Message message = r47Var.k;
                            if (z4) {
                                j2 = r47.B0(message);
                            } else {
                                long j4 = message.peer_id.channel_id;
                                if (j4 != j) {
                                    j2 = -j4;
                                } else {
                                    j2 = j;
                                }
                            }
                            SparseArray sparseArray = (SparseArray) ip7Var2.c.f(j2);
                            if (sparseArray != null) {
                                r47 r47Var2 = (r47) sparseArray.get(r47Var.e1());
                                if (r47Var2 != null && (r47Var2.I || r47Var2.J)) {
                                    r47Var2 = null;
                                }
                                if (r47Var2 != null) {
                                    sparseArray.put(r47Var.e1(), r47Var);
                                    int indexOf = arrayList3.indexOf(r47Var2);
                                    if (indexOf >= 0) {
                                        arrayList3.set(indexOf, r47Var);
                                    }
                                    int indexOf2 = arrayList2.indexOf(r47Var2);
                                    if (indexOf2 >= 0) {
                                        arrayList2.set(indexOf2, r47Var);
                                    }
                                    z3 = true;
                                }
                                i8++;
                                j3 = j;
                            }
                        } else {
                            j = j3;
                        }
                    }
                    i7++;
                    j3 = j;
                }
                if (z3) {
                    ip7Var2.Z(false);
                    return;
                }
                return;
            case 9:
                ((NotificationsCustomSettingsActivity) this.c).m0((ArrayList) this.b);
                return;
            case 10:
                ((nx0[]) this.c)[0] = null;
                uq7.a = null;
                ((boolean[]) this.b)[0] = true;
                return;
            case 11:
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                String str3 = (String) this.b;
                e S2 = LaunchActivity.S();
                if (S2 != null) {
                    Y = d31.b0(S2);
                } else {
                    Y = d31.Y();
                }
                TLRPC.Document document = starGift.getDocument();
                if (document != null) {
                    Q = Y.q(document, str3);
                } else {
                    Q = Y.Q(2131623990, 36, str3);
                }
                Q.u = true;
                Q.j();
                return;
            case 12:
                ((vt7) this.c).Y(((b8c) this.b).d);
                return;
            case 13:
                dx7 dx7Var = (dx7) this.c;
                View view = (View) this.b;
                if (view instanceof h44) {
                    h44 h44Var = (h44) view;
                    h44Var.m();
                    dx7Var.C0(h44Var, true);
                    return;
                }
                return;
            case 14:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.c;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.b;
                try {
                    List<Address> fromLocationName = new Geocoder(a.b, ob6.D0().y).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 15:
                nx7 nx7Var = (nx7) this.c;
                nx7Var.v = true;
                RectF f = nx7Var.f();
                Object obj = nx7Var.a.b;
                nx7Var.w = new rx((ByteBuffer) nx7Var.h(nx7Var.f(), true, false, false).c, 0, f);
                nx7Var.a(false);
                ((ka9) this.b).run();
                return;
            case 16:
                Runnable runnable = (Runnable) this.b;
                for (ok2 ok2Var : ((PasscodeActivity) this.c).n.f) {
                    ok2Var.D(0.0f);
                }
                runnable.run();
                return;
            case 17:
                b8 b8Var = (b8) this.b;
                PasscodeActivity passcodeActivity = (PasscodeActivity) ((py7) this.c).c;
                if (!passcodeActivity.E) {
                    i = 2131747380;
                } else {
                    i = 2131747381;
                }
                b8Var.setText(ob6.M0(i, null));
                if (!passcodeActivity.E) {
                    i2 = 2131232281;
                } else {
                    i2 = 2131232299;
                }
                b8Var.setIcon(i2);
                passcodeActivity.x0();
                if (passcodeActivity.p0()) {
                    passcodeActivity.h.setInputType(524417);
                    hl.T3(passcodeActivity.s, true, 0.1f, true, false);
                    return;
                }
                return;
            case 18:
                ((PasskeysActivity) this.c).Y((TL_account.Passkey) this.b);
                return;
            case 19:
                ((icc) this.c).a(null, ((Throwable) this.b).getMessage());
                return;
            case 20:
                b18 b18Var = (b18) this.c;
                fi7 fi7Var = (fi7) this.b;
                int[] iArr = b18Var.y;
                byte b = fi7Var.a;
                if (b == 2) {
                    if (!(b18Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size2 = b18Var.H.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) b18Var.H.get(i9);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    b18Var.G = tL_secureRequiredType;
                                    b18Var.T1();
                                } else {
                                    i9++;
                                }
                            }
                        }
                    }
                } else if (b == 1) {
                    if (!(b18Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size3 = b18Var.H.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) b18Var.H.get(i10);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    b18Var.G = tL_secureRequiredType2;
                                    b18Var.T1();
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                } else if (b == 3) {
                    if (!(b18Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size4 = b18Var.H.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size4) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) b18Var.H.get(i11);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    b18Var.G = tL_secureRequiredType3;
                                    b18Var.T1();
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                } else if (b == 4 && !(b18Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size5 = b18Var.H.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size5) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) b18Var.H.get(i12);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                b18Var.G = tL_secureRequiredType4;
                                b18Var.T1();
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(fi7Var.b)) {
                    b18Var.Z[0].setText(fi7Var.b);
                }
                if (!TextUtils.isEmpty(fi7Var.d)) {
                    b18Var.Z[1].setText(fi7Var.d);
                }
                if (!TextUtils.isEmpty(fi7Var.c)) {
                    b18Var.Z[2].setText(fi7Var.c);
                }
                if (!TextUtils.isEmpty(fi7Var.e)) {
                    b18Var.Z[7].setText(fi7Var.e);
                }
                int i13 = fi7Var.n;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            b18Var.x = "female";
                            b18Var.Z[4].setText(ob6.M0(2131747296, null));
                        }
                    } else {
                        b18Var.x = "male";
                        b18Var.Z[4].setText(ob6.M0(2131747235, null));
                    }
                }
                if (!TextUtils.isEmpty(fi7Var.m)) {
                    String str4 = fi7Var.m;
                    b18Var.s = str4;
                    String str5 = (String) b18Var.Z0.get(str4);
                    if (str5 != null) {
                        b18Var.Z[5].setText(str5);
                    }
                }
                if (!TextUtils.isEmpty(fi7Var.l)) {
                    String str6 = fi7Var.l;
                    b18Var.w = str6;
                    String str7 = (String) b18Var.Z0.get(str6);
                    if (str7 != null) {
                        b18Var.Z[6].setText(str7);
                    }
                }
                int i14 = fi7Var.k;
                if (i14 > 0 && fi7Var.j > 0 && fi7Var.i > 0) {
                    b18Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i14), Integer.valueOf(fi7Var.j), Integer.valueOf(fi7Var.i)));
                }
                int i15 = fi7Var.h;
                if (i15 > 0 && (i3 = fi7Var.g) > 0 && (i4 = fi7Var.f) > 0) {
                    iArr[0] = i4;
                    iArr[1] = i3;
                    iArr[2] = i15;
                    b18Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i15), Integer.valueOf(fi7Var.g), Integer.valueOf(fi7Var.f)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                b18Var.Z[8].setText(ob6.M0(2131747221, null));
                return;
            case 21:
                b18 b18Var2 = (b18) this.c;
                TLObject tLObject2 = (TLObject) this.b;
                if (tLObject2 != null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    b18Var2.K = password;
                    if (!TwoStepVerificationActivity.a0(password, false)) {
                        jj.u0(b18Var2.getParentActivity(), ob6.M0(2131743475, null), true);
                        return;
                    }
                    TwoStepVerificationActivity.e0(b18Var2.K);
                    b18Var2.V1();
                    if (b18Var2.a0[0].getVisibility() == 0) {
                        b18Var2.Z[0].requestFocus();
                        hl.E3(b18Var2.Z[0]);
                    }
                    if (b18Var2.O0 == 1) {
                        b18Var2.E1(true);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                b18 b18Var3 = (b18) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                if (tL_error == null) {
                    b18Var3.g1 = true;
                    b18Var3.N0(true);
                    b18Var3.finishFragment();
                    return;
                }
                b18Var3.Q1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    jj.u0(b18Var3.getParentActivity(), ob6.M0(2131743475, null), true);
                    return;
                } else {
                    b18Var3.P1(ob6.M0(2131689472, null), tL_error.text);
                    return;
                }
            case 23:
                ((w08) this.c).a.L = ((TLRPC.TL_error) this.b).text;
                return;
            case 24:
                ((p) this.c).J0(false);
                ((View) this.b).callOnClick();
                return;
            case 25:
                p pVar = (p) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                pVar.N0(true, false);
                if (tL_error2 == null) {
                    if (pVar.getParentActivity() != null) {
                        x18 x18Var = pVar.e0;
                        if (x18Var != null) {
                            hl.r(x18Var);
                            pVar.e0 = null;
                        }
                        pVar.h0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    ku3 ku3Var = pVar.T;
                    try {
                        ku3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    hl.A3(2.5f, ku3Var, null);
                    ku3 ku3Var2 = pVar.T;
                    ku3Var2.a.setText("");
                    ku3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error2.text).intValue();
                    if (intValue < 60) {
                        G = ob6.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = ob6.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    pVar.L0(ob6.M0(2131689472, null), ob6.a0("FloodWaitTime", null, 2131750646, G));
                    return;
                } else {
                    pVar.L0(ob6.M0(2131689472, null), tL_error2.text);
                    return;
                }
            case 26:
                ((p) this.c).u0((TLRPC.TL_payments_validatedRequestedInfo) this.b);
                return;
            case 27:
                p pVar2 = (p) this.c;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.b;
                Context parentActivity = pVar2.getParentActivity();
                if (parentActivity == null) {
                    parentActivity = a.b;
                }
                if (parentActivity == null) {
                    parentActivity = LaunchActivity.H1;
                }
                if (parentActivity != null) {
                    pVar2.b1 = true;
                    pVar2.g1 = 1;
                    TLRPC.InputInvoice inputInvoice = pVar2.c1;
                    boolean z5 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    if (z5 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z5 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z5 && (z28Var2 = pVar2.a1) != null) {
                        z28Var2.c(1);
                    }
                    pVar2.h0();
                    if (z5 && (z28Var = pVar2.a1) != null) {
                        z28Var.c(pVar2.g1);
                    }
                    long e0 = pVar2.e0();
                    int i16 = (e0 > 0L ? 1 : (e0 == 0L ? 0 : -1));
                    if (i16 > 0) {
                        str2 = lbc.l(pVar2.getMessagesController().X1(Long.valueOf(e0)));
                    } else if (i16 < 0 && (M0 = pVar2.getMessagesController().M0(Long.valueOf(-e0))) != null) {
                        str2 = M0.title;
                    }
                    long d0 = pVar2.d0();
                    if (z5) {
                        if (!z && !z2) {
                            i5 = 2131624221;
                        } else {
                            i5 = 2131624220;
                        }
                    } else {
                        i5 = 2131624115;
                    }
                    int i17 = i5;
                    if (!z5) {
                        M02 = null;
                    } else {
                        if (z2) {
                            i6 = 2131744749;
                        } else if (z) {
                            i6 = 2131744757;
                        } else {
                            i6 = 2131744816;
                        }
                        M02 = ob6.M0(i6, null);
                    }
                    if (z5) {
                        if (z2) {
                            a0 = ob6.H(',', "StarsGiveawaySentPopupInfo", (int) d0);
                        } else {
                            if (z) {
                                str = "StarsGiftSentPopupInfo";
                            } else {
                                str = "StarsAcquiredInfo";
                            }
                            a0 = ob6.K(str, (int) d0, ',', str2);
                        }
                    } else {
                        a0 = ob6.a0(null, null, 2131747128, pVar2.S0[0], pVar2.r0);
                    }
                    SpannableStringBuilder S22 = hl.S2(a0);
                    e S3 = LaunchActivity.S();
                    if (S3 != null) {
                        d31 b0 = d31.b0(S3);
                        if (i16 != 0 && M02 != null && !z2) {
                            Q2 = b0.L(i17, M02, S22, ob6.M0(2131743204, null), new tz6((byte) 2, e0));
                        } else {
                            String str8 = M02;
                            if (str8 != null) {
                                Q2 = b0.I(i17, str8, S22);
                            } else {
                                Q2 = b0.Q(i17, 36, S22);
                            }
                        }
                        Q2.s = false;
                        Q2.j = 5000;
                        if (messageArr[0] != null) {
                            e73 e73Var = new e73(pVar2, Q2, z, messageArr, (byte) 3);
                            z11 z11Var = Q2.e;
                            if (z11Var != null) {
                                z11Var.setOnClickListener(e73Var);
                            }
                        }
                        Q2.k(z2);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                p pVar3 = (p) this.c;
                TLRPC.TL_payments_paymentVerificationNeeded tL_payments_paymentVerificationNeeded = (TLRPC.TL_payments_paymentVerificationNeeded) this.b;
                pcc pccVar = pVar3.e1;
                if (pccVar != null) {
                    pccVar.a(tL_payments_paymentVerificationNeeded);
                }
                pVar3.J0(false);
                pVar3.A0 = true;
                pVar3.N0(true, true);
                ww2 ww2Var = pVar3.r;
                if (ww2Var != null) {
                    ww2Var.setVisibility(0);
                }
                s7 s7Var = pVar3.n;
                if (s7Var != null) {
                    s7Var.setEnabled(false);
                    pVar3.n.getContentView().setVisibility(4);
                }
                pVar3.getMessagesController().c4 = new fu2(pVar3, pVar3.getParentLayout(), pVar3.getParentActivity(), (byte) 21);
                WebView webView = pVar3.x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = pVar3.x;
                    String str9 = tL_payments_paymentVerificationNeeded.url;
                    pVar3.y = str9;
                    webView2.loadUrl(str9);
                }
                pVar3.b1 = true;
                pVar3.g1 = 3;
                z28 z28Var3 = pVar3.a1;
                if (z28Var3 != null) {
                    z28Var3.c(3);
                    return;
                }
                return;
            default:
                o68 o68Var = (o68) this.c;
                kg5 kg5Var = (kg5) this.b;
                o68Var.removeView(kg5Var);
                if (o68Var.N1 == kg5Var) {
                    o68Var.N1 = null;
                    return;
                }
                return;
        }
    }
}
