package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.location.Address;
import android.location.Geocoder;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
public final class bj7 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public bj7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        long j;
        long j2;
        u21 Y;
        m21 Q;
        int i;
        int i2;
        int i3;
        int i4;
        String G;
        boolean z;
        boolean z2;
        TLRPC.Chat K0;
        int i5;
        int i6;
        String M0;
        String a0;
        m21 Q2;
        String str;
        tz7 tz7Var;
        tz7 tz7Var2;
        int i7 = 6;
        long j3 = 0;
        String str2 = "";
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                ev2 ev2Var = (ev2) ((zj) this.b).b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            if (type != 9) {
                                                i7 = 8;
                                            } else {
                                                i7 = 7;
                                            }
                                        }
                                        i7 = 5;
                                    }
                                }
                                i7 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i7 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i7 = 4;
                                    break;
                                case 13:
                                    i7 = 5;
                                    break;
                                case 18:
                                    i7 = 2;
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i7 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i7 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT < 31 && i7 == 5) {
                        yz.g(context, ev2Var);
                        return;
                    } else {
                        ev2Var.i(i7);
                        return;
                    }
                }
                i7 = 0;
                if (Build.VERSION.SDK_INT < 31) {
                }
                ev2Var.i(i7);
                return;
            case 1:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.c)));
                intent.putExtra("sms_body", k96.a0(null, null, 2131748924, "https://telegram.org/dl"));
                ((jj7) this.b).getContext().startActivity(intent);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) this.c;
                ((jj7) this.b).dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.P2(user.id));
                    return;
                }
                return;
            case 3:
                ((x15) this.b).a((TLRPC.User) this.c);
                return;
            case 4:
                a.b.sendBroadcast((Intent) this.b);
                a.b.sendBroadcast((Intent) this.c);
                return;
            case 5:
                try {
                    a.b.getContentResolver().call(((NotificationBadge$ZukHomeBadger) this.b).a, "setAppBadgeCount", (String) null, (Bundle) this.c);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 6:
                im7 im7Var = (im7) this.b;
                if (im7Var.s.remove((String) this.c)) {
                    im7Var.Z(true);
                    return;
                }
                return;
            case 7:
                Uri uri = (Uri) this.b;
                File file = (File) this.c;
                try {
                    a.b.revokeUriPermission(uri, 1);
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                if (file != null) {
                    try {
                        file.delete();
                        return;
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                        return;
                    }
                }
                return;
            case 8:
                ((km8) this.b).accept((HashSet) this.c);
                return;
            case 9:
                im7 im7Var2 = (im7) this.b;
                vf6 vf6Var = (vf6) this.c;
                ArrayList arrayList = im7Var2.b;
                ArrayList arrayList2 = im7Var2.a;
                int m = vf6Var.m();
                int i8 = 0;
                boolean z3 = false;
                while (i8 < m) {
                    vf6Var.j(i8);
                    ArrayList arrayList3 = (ArrayList) vf6Var.n(i8);
                    int size = arrayList3.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 < size) {
                            k27 k27Var = (k27) arrayList3.get(i9);
                            j = j3;
                            boolean z4 = k27Var.J;
                            TLRPC.Message message = k27Var.k;
                            if (z4) {
                                j2 = k27.B0(message);
                            } else {
                                long j4 = message.peer_id.channel_id;
                                if (j4 != j) {
                                    j2 = -j4;
                                } else {
                                    j2 = j;
                                }
                            }
                            SparseArray sparseArray = (SparseArray) im7Var2.c.f(j2);
                            if (sparseArray != null) {
                                k27 k27Var2 = (k27) sparseArray.get(k27Var.e1());
                                if (k27Var2 != null && (k27Var2.I || k27Var2.J)) {
                                    k27Var2 = null;
                                }
                                if (k27Var2 != null) {
                                    sparseArray.put(k27Var.e1(), k27Var);
                                    int indexOf = arrayList2.indexOf(k27Var2);
                                    if (indexOf >= 0) {
                                        arrayList2.set(indexOf, k27Var);
                                    }
                                    int indexOf2 = arrayList.indexOf(k27Var2);
                                    if (indexOf2 >= 0) {
                                        arrayList.set(indexOf2, k27Var);
                                    }
                                    z3 = true;
                                }
                                i9++;
                                j3 = j;
                            }
                        } else {
                            j = j3;
                        }
                    }
                    i8++;
                    j3 = j;
                }
                if (z3) {
                    im7Var2.Z(false);
                    return;
                }
                return;
            case 10:
                ((NotificationsCustomSettingsActivity) this.b).m0((ArrayList) this.c);
                return;
            case 11:
                ((fx0[]) this.b)[0] = null;
                un7.a = null;
                ((boolean[]) this.c)[0] = true;
                return;
            case 12:
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                String str3 = (String) this.c;
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    Y = u21.b0(S2);
                } else {
                    Y = u21.Y();
                }
                TLRPC.Document document = starGift.getDocument();
                if (document != null) {
                    Q = Y.q(document, str3);
                } else {
                    Q = Y.Q(2131623990, 36, str3);
                }
                Q.t = true;
                Q.j();
                return;
            case 13:
                ((qq7) this.b).Y(((c4c) this.c).d);
                return;
            case 14:
                wt7 wt7Var = (wt7) this.b;
                View view = (View) this.c;
                if (view instanceof l34) {
                    l34 l34Var = (l34) view;
                    l34Var.m();
                    wt7Var.D0(l34Var, true);
                    return;
                }
                return;
            case 15:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(a.b, k96.D0().y).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 16:
                gu7 gu7Var = (gu7) this.b;
                gu7Var.v = true;
                RectF f = gu7Var.f();
                Object obj = gu7Var.a.b;
                gu7Var.w = new qx((ByteBuffer) gu7Var.h(gu7Var.f(), true, false, false).c, 0, f);
                gu7Var.a(false);
                ((x69) this.c).run();
                return;
            case 17:
                Runnable runnable = (Runnable) this.c;
                for (sj2 sj2Var : ((PasscodeActivity) this.b).n.f) {
                    sj2Var.D(0.0f);
                }
                runnable.run();
                return;
            case 18:
                a8 a8Var = (a8) this.c;
                PasscodeActivity passcodeActivity = (PasscodeActivity) ((iv7) this.b).c;
                if (!passcodeActivity.E) {
                    i = 2131747460;
                } else {
                    i = 2131747461;
                }
                a8Var.setText(k96.M0(i, null));
                if (!passcodeActivity.E) {
                    i2 = 2131232281;
                } else {
                    i2 = 2131232299;
                }
                a8Var.setIcon(i2);
                passcodeActivity.w0();
                if (passcodeActivity.p0()) {
                    passcodeActivity.h.setInputType(524417);
                    gl.T3(passcodeActivity.s, true, 0.1f, true, false);
                    return;
                }
                return;
            case 19:
                ((PasskeysActivity) this.b).Y((TL_account.Passkey) this.c);
                return;
            case 20:
                ((i8c) this.b).a(null, ((Throwable) this.c).getMessage());
                return;
            case 21:
                vx7 vx7Var = (vx7) this.b;
                vf7 vf7Var = (vf7) this.c;
                int[] iArr = vx7Var.y;
                byte b = vf7Var.a;
                if (b == 2) {
                    if (!(vx7Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size2 = vx7Var.H.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) vx7Var.H.get(i10);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    vx7Var.G = tL_secureRequiredType;
                                    vx7Var.S1();
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                } else if (b == 1) {
                    if (!(vx7Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size3 = vx7Var.H.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) vx7Var.H.get(i11);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    vx7Var.G = tL_secureRequiredType2;
                                    vx7Var.S1();
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                } else if (b == 3) {
                    if (!(vx7Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size4 = vx7Var.H.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size4) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) vx7Var.H.get(i12);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    vx7Var.G = tL_secureRequiredType3;
                                    vx7Var.S1();
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                } else if (b == 4 && !(vx7Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size5 = vx7Var.H.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size5) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) vx7Var.H.get(i13);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                vx7Var.G = tL_secureRequiredType4;
                                vx7Var.S1();
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(vf7Var.b)) {
                    vx7Var.Z[0].setText(vf7Var.b);
                }
                if (!TextUtils.isEmpty(vf7Var.d)) {
                    vx7Var.Z[1].setText(vf7Var.d);
                }
                if (!TextUtils.isEmpty(vf7Var.c)) {
                    vx7Var.Z[2].setText(vf7Var.c);
                }
                if (!TextUtils.isEmpty(vf7Var.e)) {
                    vx7Var.Z[7].setText(vf7Var.e);
                }
                int i14 = vf7Var.n;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            vx7Var.x = "female";
                            vx7Var.Z[4].setText(k96.M0(2131747376, null));
                        }
                    } else {
                        vx7Var.x = "male";
                        vx7Var.Z[4].setText(k96.M0(2131747315, null));
                    }
                }
                if (!TextUtils.isEmpty(vf7Var.m)) {
                    String str4 = vf7Var.m;
                    vx7Var.s = str4;
                    String str5 = (String) vx7Var.Z0.get(str4);
                    if (str5 != null) {
                        vx7Var.Z[5].setText(str5);
                    }
                }
                if (!TextUtils.isEmpty(vf7Var.l)) {
                    String str6 = vf7Var.l;
                    vx7Var.w = str6;
                    String str7 = (String) vx7Var.Z0.get(str6);
                    if (str7 != null) {
                        vx7Var.Z[6].setText(str7);
                    }
                }
                int i15 = vf7Var.k;
                if (i15 > 0 && vf7Var.j > 0 && vf7Var.i > 0) {
                    vx7Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i15), Integer.valueOf(vf7Var.j), Integer.valueOf(vf7Var.i)));
                }
                int i16 = vf7Var.h;
                if (i16 > 0 && (i3 = vf7Var.g) > 0 && (i4 = vf7Var.f) > 0) {
                    iArr[0] = i4;
                    iArr[1] = i3;
                    iArr[2] = i16;
                    vx7Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i16), Integer.valueOf(vf7Var.g), Integer.valueOf(vf7Var.f)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                vx7Var.Z[8].setText(k96.M0(2131747301, null));
                return;
            case 22:
                vx7 vx7Var2 = (vx7) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    vx7Var2.K = password;
                    if (!TwoStepVerificationActivity.a0(password, false)) {
                        ij.u0(vx7Var2.getParentActivity(), k96.M0(2131743581, null), true);
                        return;
                    }
                    TwoStepVerificationActivity.e0(vx7Var2.K);
                    vx7Var2.U1();
                    if (vx7Var2.a0[0].getVisibility() == 0) {
                        vx7Var2.Z[0].requestFocus();
                        gl.E3(vx7Var2.Z[0]);
                    }
                    if (vx7Var2.O0 == 1) {
                        vx7Var2.D1(true);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                vx7 vx7Var3 = (vx7) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tL_error == null) {
                    vx7Var3.g1 = true;
                    vx7Var3.M0(true);
                    vx7Var3.finishFragment();
                    return;
                }
                vx7Var3.P1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    ij.u0(vx7Var3.getParentActivity(), k96.M0(2131743581, null), true);
                    return;
                } else {
                    vx7Var3.O1(k96.M0(2131689472, null), tL_error.text);
                    return;
                }
            case 24:
                ((qx7) this.b).a.L = ((TLRPC.TL_error) this.c).text;
                return;
            case 25:
                ((p) this.b).I0(false);
                ((View) this.c).callOnClick();
                return;
            case 26:
                p pVar = (p) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                pVar.M0(true, false);
                if (tL_error2 == null) {
                    if (pVar.getParentActivity() != null) {
                        vy7 vy7Var = pVar.e0;
                        if (vy7Var != null) {
                            gl.r(vy7Var);
                            pVar.e0 = null;
                        }
                        pVar.h0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    tt3 tt3Var = pVar.T;
                    try {
                        tt3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    gl.A3(2.5f, tt3Var, null);
                    tt3 tt3Var2 = pVar.T;
                    tt3Var2.a.setText("");
                    tt3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error2.text).intValue();
                    if (intValue < 60) {
                        G = k96.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = k96.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    pVar.K0(k96.M0(2131689472, null), k96.a0("FloodWaitTime", null, 2131750669, G));
                    return;
                } else {
                    pVar.K0(k96.M0(2131689472, null), tL_error2.text);
                    return;
                }
            case 27:
                ((p) this.b).u0((TLRPC.TL_payments_validatedRequestedInfo) this.c);
                return;
            case 28:
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
                    if (!z5 && (tz7Var2 = pVar2.a1) != null) {
                        tz7Var2.c(1);
                    }
                    pVar2.h0();
                    if (z5 && (tz7Var = pVar2.a1) != null) {
                        tz7Var.c(pVar2.g1);
                    }
                    long e0 = pVar2.e0();
                    int i17 = (e0 > 0L ? 1 : (e0 == 0L ? 0 : -1));
                    if (i17 > 0) {
                        str2 = l7c.l(pVar2.getMessagesController().V1(Long.valueOf(e0)));
                    } else if (i17 < 0 && (K0 = pVar2.getMessagesController().K0(Long.valueOf(-e0))) != null) {
                        str2 = K0.title;
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
                    int i18 = i5;
                    if (!z5) {
                        M0 = null;
                    } else {
                        if (z2) {
                            i6 = 2131744855;
                        } else if (z) {
                            i6 = 2131744863;
                        } else {
                            i6 = 2131744922;
                        }
                        M0 = k96.M0(i6, null);
                    }
                    if (z5) {
                        if (z2) {
                            a0 = k96.H(',', "StarsGiveawaySentPopupInfo", (int) d0);
                        } else {
                            if (z) {
                                str = "StarsGiftSentPopupInfo";
                            } else {
                                str = "StarsAcquiredInfo";
                            }
                            a0 = k96.K(str, (int) d0, ',', str2);
                        }
                    } else {
                        a0 = k96.a0(null, null, 2131747208, pVar2.S0[0], pVar2.r0);
                    }
                    SpannableStringBuilder S22 = gl.S2(a0);
                    d S3 = LaunchActivity.S();
                    if (S3 != null) {
                        u21 b0 = u21.b0(S3);
                        if (i17 != 0 && M0 != null && !z2) {
                            Q2 = b0.L(i18, M0, S22, k96.M0(2131743310, null), new px6((byte) 1, e0));
                        } else {
                            String str8 = M0;
                            if (str8 != null) {
                                Q2 = b0.I(i18, str8, S22);
                            } else {
                                Q2 = b0.Q(i18, 36, S22);
                            }
                        }
                        Q2.r = false;
                        Q2.j = 5000;
                        if (messageArr[0] != null) {
                            l63 l63Var = new l63(pVar2, Q2, z, messageArr, (byte) 2);
                            q11 q11Var = Q2.e;
                            if (q11Var != null) {
                                q11Var.setOnClickListener(l63Var);
                            }
                        }
                        Q2.k(z2);
                        return;
                    }
                    return;
                }
                return;
            default:
                p pVar3 = (p) this.b;
                TLRPC.TL_payments_paymentVerificationNeeded tL_payments_paymentVerificationNeeded = (TLRPC.TL_payments_paymentVerificationNeeded) this.c;
                p8c p8cVar = pVar3.e1;
                if (p8cVar != null) {
                    p8cVar.a(tL_payments_paymentVerificationNeeded);
                }
                pVar3.I0(false);
                pVar3.A0 = true;
                pVar3.M0(true, true);
                cw2 cw2Var = pVar3.r;
                if (cw2Var != null) {
                    cw2Var.setVisibility(0);
                }
                r7 r7Var = pVar3.n;
                if (r7Var != null) {
                    r7Var.setEnabled(false);
                    pVar3.n.getContentView().setVisibility(4);
                }
                pVar3.getMessagesController().b4 = new lt2(pVar3, pVar3.getParentLayout(), pVar3.getParentActivity(), (byte) 21);
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
                tz7 tz7Var3 = pVar3.a1;
                if (tz7Var3 != null) {
                    tz7Var3.c(3);
                    return;
                }
                return;
        }
    }
}
