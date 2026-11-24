package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
public final class bl7 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public bl7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void run() {
        long j;
        long j2;
        c41 Y;
        u31 Q;
        int i;
        int i2;
        int i3;
        int i4;
        String G;
        boolean z;
        boolean z2;
        TLRPC.Chat L0;
        int i5;
        int i6;
        String M0;
        String a0;
        u31 Q2;
        String str;
        w18 w18Var;
        w18 w18Var2;
        int i7 = 6;
        long j3 = 0;
        String str2 = "";
        switch (this.a) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.b).registerReceiver(new zk((ow2) this.c, (byte) 10), intentFilter);
                return;
            case 1:
                Context context = (Context) this.b;
                ow2 ow2Var = (ow2) ((zk) this.c).b;
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
                        y00.g(context, ow2Var);
                        return;
                    } else {
                        ow2Var.i(i7);
                        return;
                    }
                }
                i7 = 0;
                if (Build.VERSION.SDK_INT < 31) {
                }
                ow2Var.i(i7);
                return;
            case 2:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.b)));
                intent.putExtra("sms_body", jb6.a0(null, null, 2131748873, "https://telegram.org/dl"));
                ((ml7) this.c).getContext().startActivity(intent);
                return;
            case 3:
                TLRPC.User user = (TLRPC.User) this.b;
                ((ml7) this.c).dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.S2(user.id));
                    return;
                }
                return;
            case 4:
                ((u35) this.c).a((TLRPC.User) this.b);
                return;
            case 5:
                a.b.sendBroadcast((Intent) this.c);
                a.b.sendBroadcast((Intent) this.b);
                return;
            case 6:
                try {
                    a.b.getContentResolver().call(((NotificationBadge$ZukHomeBadger) this.c).a, "setAppBadgeCount", (String) null, (Bundle) this.b);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 7:
                lo7 lo7Var = (lo7) this.c;
                if (lo7Var.s.remove((String) this.b)) {
                    lo7Var.Z(true);
                    return;
                }
                return;
            case 8:
                Uri uri = (Uri) this.c;
                File file = (File) this.b;
                try {
                    a.b.revokeUriPermission(uri, 1);
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
                if (file != null) {
                    try {
                        file.delete();
                        return;
                    } catch (Exception e3) {
                        fc4.g(e3, true);
                        return;
                    }
                }
                return;
            case 9:
                ((jo8) this.c).accept((HashSet) this.b);
                return;
            case 10:
                lo7 lo7Var2 = (lo7) this.c;
                vh6 vh6Var = (vh6) this.b;
                ArrayList arrayList = lo7Var2.b;
                ArrayList arrayList2 = lo7Var2.a;
                int m = vh6Var.m();
                int i8 = 0;
                boolean z3 = false;
                while (i8 < m) {
                    vh6Var.j(i8);
                    ArrayList arrayList3 = (ArrayList) vh6Var.n(i8);
                    int size = arrayList3.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 < size) {
                            k47 k47Var = (k47) arrayList3.get(i9);
                            j = j3;
                            boolean z4 = k47Var.J;
                            TLRPC.Message message = k47Var.k;
                            if (z4) {
                                j2 = k47.B0(message);
                            } else {
                                long j4 = message.peer_id.channel_id;
                                if (j4 != j) {
                                    j2 = -j4;
                                } else {
                                    j2 = j;
                                }
                            }
                            SparseArray sparseArray = (SparseArray) lo7Var2.c.f(j2);
                            if (sparseArray != null) {
                                k47 k47Var2 = (k47) sparseArray.get(k47Var.e1());
                                if (k47Var2 != null && (k47Var2.I || k47Var2.J)) {
                                    k47Var2 = null;
                                }
                                if (k47Var2 != null) {
                                    sparseArray.put(k47Var.e1(), k47Var);
                                    int indexOf = arrayList2.indexOf(k47Var2);
                                    if (indexOf >= 0) {
                                        arrayList2.set(indexOf, k47Var);
                                    }
                                    int indexOf2 = arrayList.indexOf(k47Var2);
                                    if (indexOf2 >= 0) {
                                        arrayList.set(indexOf2, k47Var);
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
                    lo7Var2.Z(false);
                    return;
                }
                return;
            case 11:
                ((NotificationsCustomSettingsActivity) this.c).n0((ArrayList) this.b);
                return;
            case 12:
                ((my0[]) this.c)[0] = null;
                xp7.a = null;
                ((boolean[]) this.b)[0] = true;
                return;
            case 13:
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                String str3 = (String) this.b;
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    Y = c41.b0(S2);
                } else {
                    Y = c41.Y();
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
            case 14:
                ((ss7) this.c).Z(((c6c) this.b).d);
                return;
            case 15:
                xv7 xv7Var = (xv7) this.c;
                View view = (View) this.b;
                if (view instanceof w44) {
                    w44 w44Var = (w44) view;
                    w44Var.m();
                    xv7Var.D0(w44Var, true);
                    return;
                }
                return;
            case 16:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.c;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.b;
                try {
                    List<Address> fromLocationName = new Geocoder(a.b, jb6.D0().y).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 17:
                hw7 hw7Var = (hw7) this.c;
                hw7Var.v = true;
                RectF f = hw7Var.f();
                Object obj = hw7Var.a.b;
                hw7Var.w = new ry((ByteBuffer) hw7Var.h(hw7Var.f(), true, false, false).c, 0, f);
                hw7Var.a(false);
                ((z89) this.b).run();
                return;
            case 18:
                Runnable runnable = (Runnable) this.b;
                for (gl2 gl2Var : ((PasscodeActivity) this.c).n.f) {
                    gl2Var.D(0.0f);
                }
                runnable.run();
                return;
            case 19:
                a8 a8Var = (a8) this.b;
                PasscodeActivity passcodeActivity = (PasscodeActivity) ((kx7) this.c).c;
                if (!passcodeActivity.E) {
                    i = 2131747386;
                } else {
                    i = 2131747387;
                }
                a8Var.setText(jb6.M0(i, null));
                if (!passcodeActivity.E) {
                    i2 = 2131232282;
                } else {
                    i2 = 2131232300;
                }
                a8Var.setIcon(i2);
                passcodeActivity.x0();
                if (passcodeActivity.q0()) {
                    passcodeActivity.h.setInputType(524417);
                    gm.T3(passcodeActivity.s, true, 0.1f, true, false);
                    return;
                }
                return;
            case 20:
                ((PasskeysActivity) this.c).Z((TL_account.Passkey) this.b);
                return;
            case 21:
                ((jac) this.c).a(null, ((Throwable) this.b).getMessage());
                return;
            case 22:
                xz7 xz7Var = (xz7) this.c;
                yh7 yh7Var = (yh7) this.b;
                int[] iArr = xz7Var.y;
                byte b = yh7Var.a;
                if (b == 2) {
                    if (!(xz7Var.G.type instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
                        int size2 = xz7Var.H.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size2) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType = (TLRPC.TL_secureRequiredType) xz7Var.H.get(i10);
                                if (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                    xz7Var.G = tL_secureRequiredType;
                                    xz7Var.T1();
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                } else if (b == 1) {
                    if (!(xz7Var.G.type instanceof TLRPC.TL_secureValueTypePassport)) {
                        int size3 = xz7Var.H.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size3) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) xz7Var.H.get(i11);
                                if (tL_secureRequiredType2.type instanceof TLRPC.TL_secureValueTypePassport) {
                                    xz7Var.G = tL_secureRequiredType2;
                                    xz7Var.T1();
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                } else if (b == 3) {
                    if (!(xz7Var.G.type instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                        int size4 = xz7Var.H.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size4) {
                                TLRPC.TL_secureRequiredType tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) xz7Var.H.get(i12);
                                if (tL_secureRequiredType3.type instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                    xz7Var.G = tL_secureRequiredType3;
                                    xz7Var.T1();
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                } else if (b == 4 && !(xz7Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense)) {
                    int size5 = xz7Var.H.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size5) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) xz7Var.H.get(i13);
                            if (tL_secureRequiredType4.type instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                xz7Var.G = tL_secureRequiredType4;
                                xz7Var.T1();
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(yh7Var.b)) {
                    xz7Var.Z[0].setText(yh7Var.b);
                }
                if (!TextUtils.isEmpty(yh7Var.d)) {
                    xz7Var.Z[1].setText(yh7Var.d);
                }
                if (!TextUtils.isEmpty(yh7Var.c)) {
                    xz7Var.Z[2].setText(yh7Var.c);
                }
                if (!TextUtils.isEmpty(yh7Var.e)) {
                    xz7Var.Z[7].setText(yh7Var.e);
                }
                int i14 = yh7Var.n;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            xz7Var.x = "female";
                            xz7Var.Z[4].setText(jb6.M0(2131747302, null));
                        }
                    } else {
                        xz7Var.x = "male";
                        xz7Var.Z[4].setText(jb6.M0(2131747241, null));
                    }
                }
                if (!TextUtils.isEmpty(yh7Var.m)) {
                    String str4 = yh7Var.m;
                    xz7Var.s = str4;
                    String str5 = (String) xz7Var.Z0.get(str4);
                    if (str5 != null) {
                        xz7Var.Z[5].setText(str5);
                    }
                }
                if (!TextUtils.isEmpty(yh7Var.l)) {
                    String str6 = yh7Var.l;
                    xz7Var.w = str6;
                    String str7 = (String) xz7Var.Z0.get(str6);
                    if (str7 != null) {
                        xz7Var.Z[6].setText(str7);
                    }
                }
                int i15 = yh7Var.k;
                if (i15 > 0 && yh7Var.j > 0 && yh7Var.i > 0) {
                    xz7Var.Z[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i15), Integer.valueOf(yh7Var.j), Integer.valueOf(yh7Var.i)));
                }
                int i16 = yh7Var.h;
                if (i16 > 0 && (i3 = yh7Var.g) > 0 && (i4 = yh7Var.f) > 0) {
                    iArr[0] = i4;
                    iArr[1] = i3;
                    iArr[2] = i16;
                    xz7Var.Z[8].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i16), Integer.valueOf(yh7Var.g), Integer.valueOf(yh7Var.f)));
                    return;
                }
                iArr[2] = 0;
                iArr[1] = 0;
                iArr[0] = 0;
                xz7Var.Z[8].setText(jb6.M0(2131747227, null));
                return;
            case 23:
                xz7 xz7Var2 = (xz7) this.c;
                TLObject tLObject = (TLObject) this.b;
                if (tLObject != null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    xz7Var2.K = password;
                    if (!TwoStepVerificationActivity.b0(password, false)) {
                        ik.u0(xz7Var2.getParentActivity(), jb6.M0(2131743507, null), true);
                        return;
                    }
                    TwoStepVerificationActivity.f0(xz7Var2.K);
                    xz7Var2.V1();
                    if (xz7Var2.a0[0].getVisibility() == 0) {
                        xz7Var2.Z[0].requestFocus();
                        gm.E3(xz7Var2.Z[0]);
                    }
                    if (xz7Var2.O0 == 1) {
                        xz7Var2.E1(true);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                xz7 xz7Var3 = (xz7) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                if (tL_error == null) {
                    xz7Var3.g1 = true;
                    xz7Var3.N0(true);
                    xz7Var3.finishFragment();
                    return;
                }
                xz7Var3.Q1(false, false);
                if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                    ik.u0(xz7Var3.getParentActivity(), jb6.M0(2131743507, null), true);
                    return;
                } else {
                    xz7Var3.P1(jb6.M0(2131689472, null), tL_error.text);
                    return;
                }
            case 25:
                ((sz7) this.c).a.L = ((TLRPC.TL_error) this.b).text;
                return;
            case 26:
                ((p) this.c).J0(false);
                ((View) this.b).callOnClick();
                return;
            case 27:
                p pVar = (p) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                pVar.N0(true, false);
                if (tL_error2 == null) {
                    if (pVar.getParentActivity() != null) {
                        x08 x08Var = pVar.e0;
                        if (x08Var != null) {
                            gm.r(x08Var);
                            pVar.e0 = null;
                        }
                        pVar.i0();
                        return;
                    }
                    return;
                } else if (tL_error2.text.startsWith("CODE_INVALID")) {
                    ev3 ev3Var = pVar.T;
                    try {
                        ev3Var.performHapticFeedback(3, 2);
                    } catch (Exception unused3) {
                    }
                    gm.A3(2.5f, ev3Var, null);
                    ev3 ev3Var2 = pVar.T;
                    ev3Var2.a.setText("");
                    ev3Var2.setWillNotDraw(true);
                    return;
                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error2.text).intValue();
                    if (intValue < 60) {
                        G = jb6.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = jb6.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    pVar.L0(jb6.M0(2131689472, null), jb6.a0("FloodWaitTime", null, 2131750618, G));
                    return;
                } else {
                    pVar.L0(jb6.M0(2131689472, null), tL_error2.text);
                    return;
                }
            case 28:
                ((p) this.c).v0((TLRPC.TL_payments_validatedRequestedInfo) this.b);
                return;
            default:
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
                    if (!z5 && (w18Var2 = pVar2.a1) != null) {
                        w18Var2.c(1);
                    }
                    pVar2.i0();
                    if (z5 && (w18Var = pVar2.a1) != null) {
                        w18Var.c(pVar2.g1);
                    }
                    long f0 = pVar2.f0();
                    int i17 = (f0 > 0L ? 1 : (f0 == 0L ? 0 : -1));
                    if (i17 > 0) {
                        str2 = m9c.l(pVar2.getMessagesController().W1(Long.valueOf(f0)));
                    } else if (i17 < 0 && (L0 = pVar2.getMessagesController().L0(Long.valueOf(-f0))) != null) {
                        str2 = L0.title;
                    }
                    long e0 = pVar2.e0();
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
                            i6 = 2131744781;
                        } else if (z) {
                            i6 = 2131744789;
                        } else {
                            i6 = 2131744848;
                        }
                        M0 = jb6.M0(i6, null);
                    }
                    if (z5) {
                        if (z2) {
                            a0 = jb6.H(',', "StarsGiveawaySentPopupInfo", (int) e0);
                        } else {
                            if (z) {
                                str = "StarsGiftSentPopupInfo";
                            } else {
                                str = "StarsAcquiredInfo";
                            }
                            a0 = jb6.K(str, (int) e0, ',', str2);
                        }
                    } else {
                        a0 = jb6.a0(null, null, 2131747134, pVar2.S0[0], pVar2.r0);
                    }
                    SpannableStringBuilder S22 = gm.S2(a0);
                    d S3 = LaunchActivity.S();
                    if (S3 != null) {
                        c41 b0 = c41.b0(S3);
                        if (i17 != 0 && M0 != null && !z2) {
                            Q2 = b0.L(i18, M0, S22, jb6.M0(2131743236, null), new pz6((byte) 1, f0));
                        } else {
                            String str8 = M0;
                            if (str8 != null) {
                                Q2 = b0.I(i18, str8, S22);
                            } else {
                                Q2 = b0.Q(i18, 36, S22);
                            }
                        }
                        Q2.s = false;
                        Q2.j = 5000;
                        if (messageArr[0] != null) {
                            x73 x73Var = new x73(pVar2, Q2, z, messageArr, (byte) 2);
                            y21 y21Var = Q2.e;
                            if (y21Var != null) {
                                y21Var.setOnClickListener(x73Var);
                            }
                        }
                        Q2.k(z2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
