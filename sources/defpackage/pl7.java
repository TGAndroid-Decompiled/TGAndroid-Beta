package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.RectF;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowManager;
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
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
public final class pl7 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public pl7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        long j;
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
        long j2;
        int i7;
        int i8;
        qbb qbbVar;
        kcb kcbVar;
        String str2 = "";
        switch (this.a) {
            case 0:
                ((v35) this.b).a((TLRPC.User) this.c);
                return;
            case 1:
                lm7 lm7Var = (lm7) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList = lm7Var.c;
                jm7[] jm7VarArr = lm7Var.b;
                HashSet hashSet = lm7Var.e;
                HashSet hashSet2 = lm7Var.d;
                if (!lm7Var.h) {
                    lm7Var.n = false;
                    if (!(tLObject instanceof TL_feed.TL_interestCategories)) {
                        lm7Var.r = true;
                        lm7.L0(jm7VarArr[0]);
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
                    lm7Var.M0(false);
                    lm7.L0(jm7VarArr[0]);
                    return;
                }
                return;
            case 2:
                a.b.sendBroadcast((Intent) this.b);
                a.b.sendBroadcast((Intent) this.c);
                return;
            case 3:
                try {
                    a.b.getContentResolver().call(((NotificationBadge$ZukHomeBadger) this.b).a, "setAppBadgeCount", (String) null, (Bundle) this.c);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 4:
                Uri uri = (Uri) this.b;
                File file = (File) this.c;
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
            case 5:
                ip7 ip7Var = (ip7) this.b;
                if (ip7Var.s.remove((String) this.c)) {
                    ip7Var.Z(true);
                    return;
                }
                return;
            case 6:
                ((tp8) this.b).accept((HashSet) this.c);
                return;
            case 7:
                ip7 ip7Var2 = (ip7) this.b;
                zh6 zh6Var = (zh6) this.c;
                ArrayList arrayList2 = ip7Var2.b;
                ArrayList arrayList3 = ip7Var2.a;
                int m = zh6Var.m();
                boolean z3 = false;
                for (int i9 = 0; i9 < m; i9++) {
                    zh6Var.j(i9);
                    ArrayList arrayList4 = (ArrayList) zh6Var.n(i9);
                    int size = arrayList4.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        r47 r47Var = (r47) arrayList4.get(i10);
                        boolean z4 = r47Var.J;
                        TLRPC.Message message = r47Var.k;
                        if (z4) {
                            j = r47.B0(message);
                        } else {
                            long j3 = message.peer_id.channel_id;
                            if (j3 != 0) {
                                j = -j3;
                            } else {
                                j = 0;
                            }
                        }
                        SparseArray sparseArray = (SparseArray) ip7Var2.c.f(j);
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
                        }
                    }
                }
                if (z3) {
                    ip7Var2.Z(false);
                    return;
                }
                return;
            case 8:
                ((NotificationsCustomSettingsActivity) this.b).m0((ArrayList) this.c);
                return;
            case 9:
                ((nx0[]) this.b)[0] = null;
                uq7.a = null;
                ((boolean[]) this.c)[0] = true;
                return;
            case 10:
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                String str3 = (String) this.c;
                e S = LaunchActivity.S();
                if (S != null) {
                    Y = d31.b0(S);
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
            case 11:
                ((vt7) this.b).Y(((b8c) this.c).d);
                return;
            case 12:
                dx7 dx7Var = (dx7) this.b;
                View view = (View) this.c;
                if (view instanceof h44) {
                    h44 h44Var = (h44) view;
                    h44Var.m();
                    dx7Var.C0(h44Var, true);
                    return;
                }
                return;
            case 13:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
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
            case 14:
                nx7 nx7Var = (nx7) this.b;
                nx7Var.v = true;
                RectF f = nx7Var.f();
                Object obj = nx7Var.a.b;
                nx7Var.w = new rx((ByteBuffer) nx7Var.h(nx7Var.f(), true, false, false).c, 0, f);
                nx7Var.a(false);
                ((ka9) this.c).run();
                return;
            case 15:
                Runnable runnable = (Runnable) this.c;
                for (ok2 ok2Var : ((PasscodeActivity) this.b).n.f) {
                    ok2Var.D(0.0f);
                }
                runnable.run();
                return;
            case 16:
                b8 b8Var = (b8) this.c;
                PasscodeActivity passcodeActivity = (PasscodeActivity) ((py7) this.b).c;
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
            case 17:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                return;
            case 18:
                ((icc) this.b).a(null, ((Throwable) this.c).getMessage());
                return;
            case 19:
                b18 b18Var = (b18) this.b;
                ei7 ei7Var = (ei7) this.c;
                int[] iArr = b18Var.y;
                byte b = ei7Var.a;
                if (b == 2) {
                    if (!(b18Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size2 = b18Var.H.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) b18Var.H.get(i11);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    b18Var.G = tL_secureRequiredType;
                                    b18Var.T1();
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                } else if (b == 1) {
                    if (!(b18Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size3 = b18Var.H.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) b18Var.H.get(i12);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    b18Var.G = tL_secureRequiredType2;
                                    b18Var.T1();
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                } else if (b == 3) {
                    if (!(b18Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size4 = b18Var.H.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 < size4) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) b18Var.H.get(i13);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    b18Var.G = tL_secureRequiredType3;
                                    b18Var.T1();
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                } else if (b == 4 && !(b18Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size5 = b18Var.H.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size5) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) b18Var.H.get(i14);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                b18Var.G = tL_secureRequiredType4;
                                b18Var.T1();
                            } else {
                                i14++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(ei7Var.b)) {
                    b18Var.Z[0].setText(ei7Var.b);
                }
                if (!TextUtils.isEmpty(ei7Var.d)) {
                    b18Var.Z[1].setText(ei7Var.d);
                }
                if (!TextUtils.isEmpty(ei7Var.c)) {
                    b18Var.Z[2].setText(ei7Var.c);
                }
                if (!TextUtils.isEmpty(ei7Var.e)) {
                    b18Var.Z[7].setText(ei7Var.e);
                }
                int i15 = ei7Var.n;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            b18Var.x = "female";
                            b18Var.Z[4].setText(ob6.M0(2131747296, null));
                        }
                    } else {
                        b18Var.x = "male";
                        b18Var.Z[4].setText(ob6.M0(2131747235, null));
                    }
                }
                if (!TextUtils.isEmpty(ei7Var.m)) {
                    String str4 = ei7Var.m;
                    b18Var.s = str4;
                    String str5 = (String) b18Var.Z0.get(str4);
                    if (str5 != null) {
                        b18Var.Z[5].setText(str5);
                    }
                }
                if (!TextUtils.isEmpty(ei7Var.l)) {
                    String str6 = ei7Var.l;
                    b18Var.w = str6;
                    String str7 = (String) b18Var.Z0.get(str6);
                    if (str7 != null) {
                        b18Var.Z[6].setText(str7);
                    }
                }
                int i16 = ei7Var.k;
                if (i16 > 0 && ei7Var.j > 0 && ei7Var.i > 0) {
                    b18Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i16), Integer.valueOf(ei7Var.j), Integer.valueOf(ei7Var.i)));
                }
                int i17 = ei7Var.h;
                if (i17 > 0 && (i3 = ei7Var.g) > 0 && (i4 = ei7Var.f) > 0) {
                    iArr[0] = i4;
                    iArr[1] = i3;
                    iArr[2] = i17;
                    b18Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i17), Integer.valueOf(ei7Var.g), Integer.valueOf(ei7Var.f)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                b18Var.Z[8].setText(ob6.M0(2131747221, null));
                return;
            case 20:
                b18 b18Var2 = (b18) this.b;
                TLObject tLObject2 = (TLObject) this.c;
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
            case 21:
                b18 b18Var3 = (b18) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
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
            case 22:
                ((w08) this.b).a.L = ((TLRPC.TL_error) this.c).text;
                return;
            case 23:
                ((p) this.b).J0(false);
                ((View) this.c).callOnClick();
                return;
            case 24:
                p pVar = (p) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
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
            case 25:
                ((p) this.b).u0((TLRPC.TL_payments_validatedRequestedInfo) this.c);
                return;
            case 26:
                p pVar2 = (p) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
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
                    int i18 = (e0 > 0L ? 1 : (e0 == 0L ? 0 : -1));
                    if (i18 > 0) {
                        str2 = lbc.l(pVar2.getMessagesController().X1(Long.valueOf(e0)));
                    } else if (i18 < 0 && (M0 = pVar2.getMessagesController().M0(Long.valueOf(-e0))) != null) {
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
                    int i19 = i5;
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
                    SpannableStringBuilder S2 = hl.S2(a0);
                    e S3 = LaunchActivity.S();
                    if (S3 != null) {
                        d31 b0 = d31.b0(S3);
                        if (i18 != 0 && M02 != null && !z2) {
                            Q2 = b0.L(i19, M02, S2, ob6.M0(2131743204, null), new tz6((byte) 2, e0));
                        } else {
                            String str8 = M02;
                            if (str8 != null) {
                                Q2 = b0.I(i19, str8, S2);
                            } else {
                                Q2 = b0.Q(i19, 36, S2);
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
            case 27:
                p pVar3 = (p) this.b;
                TLRPC.TL_payments_paymentVerificationNeeded tL_payments_paymentVerificationNeeded = (TLRPC.TL_payments_paymentVerificationNeeded) this.c;
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
                pVar3.getMessagesController().b4 = new fu2(pVar3, pVar3.getParentLayout(), pVar3.getParentActivity(), (byte) 21);
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
            case 28:
                o68 o68Var = (o68) this.b;
                kg5 kg5Var = (kg5) this.c;
                o68Var.removeView(kg5Var);
                if (o68Var.N1 == kg5Var) {
                    o68Var.N1 = null;
                    return;
                }
                return;
            default:
                o68 o68Var2 = (o68) this.b;
                rbb C = rbb.C((Activity) this.c, o68Var2.m2);
                d30 d30Var = o68Var2.w2;
                if (d30Var != null && (kcbVar = (kcb) d30Var.c) != null) {
                    j2 = kcbVar.currentPosition;
                } else {
                    j2 = 0;
                }
                File f2 = o68Var2.y1.f();
                TL_stories.StoryItem storyItem = o68Var2.y1.a;
                c8b c8bVar = new c8b();
                c8bVar.n = true;
                c8bVar.t = storyItem.media;
                int i20 = c8bVar.a;
                c8bVar.q = uc7.s1(i20).y1(storyItem.dialogId);
                c8bVar.r = storyItem.id;
                c8bVar.s = storyItem.caption;
                c8bVar.L = f2;
                c8bVar.M = false;
                c8bVar.k0 = 720;
                c8bVar.l0 = 1280;
                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaPhoto) {
                    c8bVar.K = false;
                    if (f2 != null) {
                        c8bVar.h(f2.getAbsolutePath());
                    }
                } else if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                    c8bVar.K = true;
                    TLRPC.Document document2 = messageMedia2.document;
                    if (document2 != null && document2.attributes != null) {
                        int i21 = 0;
                        while (true) {
                            if (i21 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i21);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    c8bVar.k0 = documentAttribute.w;
                                    c8bVar.l0 = documentAttribute.h;
                                    c8bVar.i = documentAttribute.duration;
                                } else {
                                    i21++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document3 = storyItem.media.document;
                    if (document3 != null) {
                        String str10 = storyItem.firstFramePath;
                        if (str10 != null) {
                            c8bVar.N = str10;
                        } else if (document3.thumbs != null) {
                            for (int i22 = 0; i22 < storyItem.media.document.thumbs.size(); i22++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i22);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    c8bVar.O = in5.B(null, photoSize.bytes);
                                } else {
                                    xb4.G(i20);
                                    File J = xb4.J(photoSize, null, true, true);
                                    if (J != null && J.exists()) {
                                        c8bVar.N = J.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                c8bVar.z();
                c8bVar.e(storyItem);
                kbb d = mbb.d(o68Var2.t0);
                RectF rectF = C.I;
                WindowManager.LayoutParams layoutParams = C.h;
                WindowManager windowManager = C.f;
                int i23 = C.c;
                if (!C.d) {
                    if (uc7.s1(i23).x2()) {
                        i5.b(i23);
                    } else {
                        C.v0 = false;
                        C.e = false;
                        C.C2 = false;
                        if (windowManager != null && (qbbVar = C.n) != null && qbbVar.getParent() == null) {
                            hl.s3(windowManager, C.n, layoutParams);
                            windowManager.addView(C.n, layoutParams);
                            C.f0();
                        }
                        C.L1 = c8bVar;
                        y9b.a(i23, c8bVar);
                        c8b c8bVar2 = C.L1;
                        if (c8bVar2 != null && c8bVar2.K) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        C.P1 = i7;
                        C.t0.g = false;
                        if (d != null) {
                            C.G = d;
                            C.K = d.a;
                            rectF.set(d.c);
                            C.H = d.b;
                            C.G.e();
                        } else {
                            C.K = false;
                            Point point = hl.q;
                            rectF.set(0.0f, hl.L(100.0f), point.x, hl.L(100.0f) + point.y);
                            C.H = hl.L(8.0f);
                        }
                        C.r.c();
                        ebb ebbVar = C.i0;
                        boolean z6 = C.K;
                        if (!z6 && z6) {
                            i8 = -14737633;
                        } else {
                            i8 = 0;
                        }
                        ebbVar.setBackgroundColor(i8);
                        C.r.setTranslationX(0.0f);
                        C.r.setTranslationY(0.0f);
                        C.r.b(0.0f);
                        C.r.setScaleX(1.0f);
                        C.r.setScaleY(1.0f);
                        C.L = 0.0f;
                        hl.e2(C.b);
                        c8b c8bVar3 = C.L1;
                        if (c8bVar3 != null) {
                            C.d1.setText(c8bVar3.C0);
                        }
                        C.J(new bab(C, (byte) 18), j2);
                        C.c1.b(true, false);
                        C.I(1, false);
                        C.k0(-1, false, false);
                        C.a();
                        C.w0 = 0L;
                        C.x0 = "";
                    }
                }
                C.R = new u48(o68Var2, (byte) 12);
                C.S = new k25(o68Var2, C, (byte) 1);
                return;
        }
    }
}
