package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;
public final class xz7 extends d implements jm7 {
    public bba A0;
    public String A1;
    public LinearLayout B0;
    public String B1;
    public ImageView C0;
    public ez7 C1;
    public TextView D0;
    public boolean D1;
    public TL_account.authorizationForm E;
    public TextView E0;
    public final az7 E1;
    public final TLRPC.TL_secureRequiredType F;
    public TextView F0;
    public String F1;
    public TLRPC.TL_secureRequiredType G;
    public r34 G0;
    public kl7 G1;
    public ArrayList H;
    public njb H0;
    public wm4 H1;
    public final TLRPC.TL_secureValue I;
    public njb I0;
    public ez7 I1;
    public final TLRPC.TL_secureValue J;
    public ImageView J0;
    public byte J1;
    public TL_account.Password K;
    public TextView K0;
    public final kla[] K1;
    public TLRPC.TL_auth_sentCode L;
    public TextView L0;
    public he L1;
    public r7 M;
    public FrameLayout M0;
    public Dialog M1;
    public AnimatorSet N;
    public TextView N0;
    public final ArrayList N1;
    public mx2 O;
    public byte O0;
    public int O1;
    public TextView P;
    public final byte[] P0;
    public int P1;
    public mx2 Q;
    public final byte[] Q0;
    public int Q1;
    public FrameLayout R;
    public String R0;
    public vkb S;
    public i22 S0;
    public View T;
    public byte T0;
    public View U;
    public int U0;
    public ijb V;
    public final ArrayList V0;
    public ijb W;
    public final HashMap W0;
    public ijb X;
    public final HashMap X0;
    public vkb Y;
    public final HashMap Y0;
    public EditTextBoldCursor[] Z;
    public HashMap Z0;
    public String a;
    public ViewGroup[] a0;
    public boolean a1;
    public final int b;
    public EditTextBoldCursor[] b0;
    public boolean b1;
    public long c;
    public ScrollView c0;
    public long c1;
    public final String d;
    public LinearLayout d0;
    public byte[] d1;
    public final String e;
    public LinearLayout e0;
    public String e1;
    public boolean f;
    public LinearLayout f0;
    public byte[] f1;
    public LinearLayout g0;
    public boolean g1;
    public final String h;
    public LinearLayout h0;
    public boolean h1;
    public LinearLayout i0;
    public xz7 i1;
    public LinearLayout j0;
    public final ArrayList j1;
    public jf5 k0;
    public xw9 k1;
    public final ArrayList l0;
    public final ArrayList l1;
    public bba m0;
    public xw9 m1;
    public final String n;
    public bba n0;
    public xw9 n1;
    public njb o0;
    public final HashMap o1;
    public njb p0;
    public final HashMap p1;
    public njb q0;
    public final HashMap q1;
    public final String r;
    public njb r0;
    public final HashMap r1;
    public String s;
    public vkb s0;
    public final HashMap s1;
    public int t0;
    public final HashMap t1;
    public final boolean[] u0;
    public final HashMap u1;
    public boolean v0;
    public final HashMap v1;
    public String w;
    public boolean w0;
    public final HashMap w1;
    public String x;
    public TextView x0;
    public HashMap x1;
    public final int[] y;
    public vkb y0;
    public HashMap y1;
    public vkb z0;
    public final HashMap z1;

    public xz7(int i, long j, String str, String str2, String str3, String str4, String str5, TL_account.authorizationForm authorizationform, TL_account.Password password) {
        this(i, authorizationform, password, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, (HashMap) null, (HashMap) null);
        int i2;
        String i1;
        String str6;
        String str7;
        String str8;
        String str9;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.h = str;
        this.r = str2;
        this.n = str5;
        if (i == 0 && !authorizationform.errors.isEmpty()) {
            try {
                Collections.sort(authorizationform.errors, new Object());
                int size = authorizationform.errors.size();
                int i3 = 0;
                while (i3 < size) {
                    TLRPC.SecureValueError secureValueError = authorizationform.errors.get(i3);
                    byte[] bArr = null;
                    if (secureValueError instanceof TLRPC.TL_secureValueErrorFrontSide) {
                        TLRPC.TL_secureValueErrorFrontSide tL_secureValueErrorFrontSide = (TLRPC.TL_secureValueErrorFrontSide) secureValueError;
                        i1 = i1(tL_secureValueErrorFrontSide.type);
                        str6 = tL_secureValueErrorFrontSide.text;
                        bArr = tL_secureValueErrorFrontSide.file_hash;
                        str7 = null;
                        str8 = "front";
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorReverseSide) {
                        TLRPC.TL_secureValueErrorReverseSide tL_secureValueErrorReverseSide = (TLRPC.TL_secureValueErrorReverseSide) secureValueError;
                        i1 = i1(tL_secureValueErrorReverseSide.type);
                        str6 = tL_secureValueErrorReverseSide.text;
                        bArr = tL_secureValueErrorReverseSide.file_hash;
                        str7 = null;
                        str8 = "reverse";
                    } else if (secureValueError instanceof TLRPC.TL_secureValueErrorSelfie) {
                        TLRPC.TL_secureValueErrorSelfie tL_secureValueErrorSelfie = (TLRPC.TL_secureValueErrorSelfie) secureValueError;
                        i1 = i1(tL_secureValueErrorSelfie.type);
                        str6 = tL_secureValueErrorSelfie.text;
                        bArr = tL_secureValueErrorSelfie.file_hash;
                        str7 = null;
                        str8 = "selfie";
                    } else {
                        if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFile) {
                            TLRPC.TL_secureValueErrorTranslationFile tL_secureValueErrorTranslationFile = (TLRPC.TL_secureValueErrorTranslationFile) secureValueError;
                            i1 = i1(tL_secureValueErrorTranslationFile.type);
                            str6 = tL_secureValueErrorTranslationFile.text;
                            bArr = tL_secureValueErrorTranslationFile.file_hash;
                            str7 = null;
                        } else if (secureValueError instanceof TLRPC.TL_secureValueErrorTranslationFiles) {
                            TLRPC.TL_secureValueErrorTranslationFiles tL_secureValueErrorTranslationFiles = (TLRPC.TL_secureValueErrorTranslationFiles) secureValueError;
                            i1 = i1(tL_secureValueErrorTranslationFiles.type);
                            str6 = tL_secureValueErrorTranslationFiles.text;
                            str7 = null;
                        } else {
                            if (secureValueError instanceof TLRPC.TL_secureValueErrorFile) {
                                TLRPC.TL_secureValueErrorFile tL_secureValueErrorFile = (TLRPC.TL_secureValueErrorFile) secureValueError;
                                i1 = i1(tL_secureValueErrorFile.type);
                                str6 = tL_secureValueErrorFile.text;
                                bArr = tL_secureValueErrorFile.file_hash;
                                str7 = null;
                            } else if (secureValueError instanceof TLRPC.TL_secureValueErrorFiles) {
                                TLRPC.TL_secureValueErrorFiles tL_secureValueErrorFiles = (TLRPC.TL_secureValueErrorFiles) secureValueError;
                                i1 = i1(tL_secureValueErrorFiles.type);
                                str6 = tL_secureValueErrorFiles.text;
                                str7 = null;
                            } else if (secureValueError instanceof TLRPC.TL_secureValueError) {
                                TLRPC.TL_secureValueError tL_secureValueError = (TLRPC.TL_secureValueError) secureValueError;
                                i1 = i1(tL_secureValueError.type);
                                str6 = tL_secureValueError.text;
                                bArr = tL_secureValueError.hash;
                                str7 = null;
                                str8 = "error_all";
                            } else {
                                if (secureValueError instanceof TLRPC.TL_secureValueErrorData) {
                                    TLRPC.TL_secureValueErrorData tL_secureValueErrorData = (TLRPC.TL_secureValueErrorData) secureValueError;
                                    int i4 = 0;
                                    while (i4 < authorizationform.values.size()) {
                                        TLRPC.TL_secureData tL_secureData = authorizationform.values.get(i4).data;
                                        if (tL_secureData != null && Arrays.equals(tL_secureData.data_hash, tL_secureValueErrorData.data_hash)) {
                                            i1 = i1(tL_secureValueErrorData.type);
                                            str6 = tL_secureValueErrorData.text;
                                            String str10 = tL_secureValueErrorData.field;
                                            bArr = tL_secureValueErrorData.data_hash;
                                            str7 = str10;
                                            str8 = "data";
                                        } else {
                                            i4++;
                                            size = size;
                                        }
                                    }
                                }
                                i2 = size;
                                i3++;
                                size = i2;
                            }
                            str8 = "files";
                        }
                        str8 = "translation";
                    }
                    HashMap hashMap = (HashMap) this.v1.get(i1);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        i2 = size;
                        this.v1.put(i1, hashMap);
                        this.w1.put(i1, str6);
                    } else {
                        i2 = size;
                    }
                    if (bArr != null) {
                        str9 = Base64.encodeToString(bArr, 2);
                    } else {
                        str9 = "";
                    }
                    switch (str8.hashCode()) {
                        case -1840647503:
                            if (!str8.equals("translation")) {
                                continue;
                            } else if (bArr != null) {
                                hashMap.put("translation" + str9, str6);
                                break;
                            } else {
                                hashMap.put("translation_all", str6);
                                break;
                            }
                        case -906020504:
                            if (str8.equals("selfie")) {
                                hashMap.put("selfie" + str9, str6);
                                break;
                            } else {
                                continue;
                            }
                        case 3076010:
                            if (!str8.equals("data")) {
                                continue;
                            } else if (str7 == null) {
                                break;
                            } else {
                                hashMap.put(str7, str6);
                                break;
                            }
                        case 97434231:
                            if (!str8.equals("files")) {
                                continue;
                            } else if (bArr != null) {
                                hashMap.put("files" + str9, str6);
                                break;
                            } else {
                                hashMap.put("files_all", str6);
                                break;
                            }
                        case 97705513:
                            if (str8.equals("front")) {
                                hashMap.put("front" + str9, str6);
                                break;
                            } else {
                                continue;
                            }
                        case 329856746:
                            if (str8.equals("error_all")) {
                                hashMap.put("error_all", str6);
                                break;
                            } else {
                                continue;
                            }
                        case 1099846370:
                            if (str8.equals("reverse")) {
                                hashMap.put("reverse" + str9, str6);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            continue;
                    }
                    i3++;
                    size = i2;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean S0(byte[] bArr, Long l) {
        if (bArr != null && bArr.length == 32) {
            int i = 0;
            for (byte b : bArr) {
                i += b & 255;
            }
            if (i % 255 == 239 && (l == null || Utilities.g(Utilities.o(bArr.length, bArr)) == l.longValue())) {
                return true;
            }
        }
        return false;
    }

    public static void S1(EditTextBoldCursor[] editTextBoldCursorArr, boolean z, boolean z2) {
        if (editTextBoldCursorArr != null) {
            for (EditTextBoldCursor editTextBoldCursor : editTextBoldCursorArr) {
                if (editTextBoldCursor != null) {
                    anb.l(editTextBoldCursor, 30, cmb.F6, null);
                    if (z) {
                        anb.l(editTextBoldCursor, 34, cmb.G6, null);
                        anb.l(editTextBoldCursor, 35, cmb.K6, null);
                        if (z2) {
                            int paddingLeft = editTextBoldCursor.getPaddingLeft();
                            int paddingTop = editTextBoldCursor.getPaddingTop();
                            int paddingRight = editTextBoldCursor.getPaddingRight();
                            int paddingBottom = editTextBoldCursor.getPaddingBottom();
                            anb.F(editTextBoldCursor, cmb.j6, cmb.k6, cmb.o7, null);
                            if (editTextBoldCursor.getPaddingLeft() != paddingLeft || editTextBoldCursor.getPaddingTop() != paddingTop || editTextBoldCursor.getPaddingRight() != paddingRight || editTextBoldCursor.getPaddingBottom() != paddingBottom) {
                                editTextBoldCursor.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                            }
                        }
                    }
                }
            }
        }
    }

    public static String a1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr != null && bArr2 != null && bArr2.length == 32 && bArr3 != null && bArr3.length == 32) {
            byte[] r = Utilities.r(bArr2, bArr3);
            byte[] bArr4 = new byte[32];
            System.arraycopy(r, 0, bArr4, 0, 32);
            byte[] bArr5 = new byte[16];
            System.arraycopy(r, 32, bArr5, 0, 16);
            int length = bArr.length;
            byte[] bArr6 = new byte[length];
            System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
            Utilities.b(bArr6, bArr4, bArr5, 0, length, 0, 0);
            if (Arrays.equals(Utilities.o(length, bArr6), bArr3)) {
                int i = bArr6[0] & 255;
                return new String(bArr6, i, length - i);
            }
            return null;
        }
        return null;
    }

    public static String g1(xw9 xw9Var) {
        byte[] bArr;
        if (xw9Var != null) {
            TLRPC.TL_secureFile tL_secureFile = xw9Var.b;
            if (tL_secureFile != null && (bArr = tL_secureFile.file_hash) != null) {
                return Base64.encodeToString(bArr, 2);
            }
            byte[] bArr2 = xw9Var.f;
            if (bArr2 != null) {
                return Base64.encodeToString(bArr2, 2);
            }
            return "";
        }
        return "";
    }

    public static int h1(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2006252145:
                if (str.equals("residence_country_code")) {
                    c = 0;
                    break;
                }
                break;
            case -1537298398:
                if (str.equals("last_name_native")) {
                    c = 1;
                    break;
                }
                break;
            case -1249512767:
                if (str.equals("gender")) {
                    c = 2;
                    break;
                }
                break;
            case -796150911:
                if (str.equals("street_line1")) {
                    c = 3;
                    break;
                }
                break;
            case -796150910:
                if (str.equals("street_line2")) {
                    c = 4;
                    break;
                }
                break;
            case -160985414:
                if (str.equals("first_name")) {
                    c = 5;
                    break;
                }
                break;
            case 3053931:
                if (str.equals("city")) {
                    c = 6;
                    break;
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    c = 7;
                    break;
                }
                break;
            case 421072629:
                if (str.equals("middle_name")) {
                    c = '\b';
                    break;
                }
                break;
            case 451516732:
                if (str.equals("first_name_native")) {
                    c = '\t';
                    break;
                }
                break;
            case 475919162:
                if (str.equals("expiry_date")) {
                    c = '\n';
                    break;
                }
                break;
            case 506677093:
                if (str.equals("document_no")) {
                    c = 11;
                    break;
                }
                break;
            case 1168724782:
                if (str.equals("birth_date")) {
                    c = '\f';
                    break;
                }
                break;
            case 1181577377:
                if (str.equals("middle_name_native")) {
                    c = '\r';
                    break;
                }
                break;
            case 1481071862:
                if (str.equals("country_code")) {
                    c = 14;
                    break;
                }
                break;
            case 2002465324:
                if (str.equals("post_code")) {
                    c = 15;
                    break;
                }
                break;
            case 2013122196:
                if (str.equals("last_name")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 26;
            case 1:
            case 16:
                return 22;
            case 2:
                return 24;
            case 3:
                return 29;
            case 4:
                return 30;
            case 5:
            case '\t':
                return 20;
            case 6:
                return 32;
            case 7:
                return 33;
            case '\b':
            case '\r':
                return 21;
            case '\n':
                return 28;
            case 11:
                return 27;
            case '\f':
                return 23;
            case 14:
                return 25;
            case 15:
                return 31;
            default:
                return 100;
        }
    }

    public static String i1(TLRPC.SecureValueType secureValueType) {
        if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            return "personal_details";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            return "passport";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return "internal_passport";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return "driver_license";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return "identity_card";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return "utility_bill";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
            return "address";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return "bank_statement";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return "rental_agreement";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return "temporary_registration";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return "passport_registration";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            return "email";
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            return "phone";
        }
        return "";
    }

    public static byte[] j1() {
        byte[] bArr = new byte[32];
        Utilities.b.nextBytes(bArr);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            i += bArr[i2] & 255;
        }
        int i3 = i % 255;
        if (i3 != 239) {
            int nextInt = Utilities.b.nextInt(32);
            int i4 = (bArr[nextInt] & 255) + (239 - i3);
            if (i4 < 255) {
                i4 += 255;
            }
            bArr[nextInt] = (byte) (i4 % 255);
        }
        return bArr;
    }

    public static String k1(TLRPC.SecureValueType secureValueType) {
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
            return jb6.M0(2131754675, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
            return jb6.M0(2131754680, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
            return jb6.M0(2131754677, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
            return jb6.M0(2131754670, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
            return jb6.M0(2131754681, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
            return jb6.M0(2131754672, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
            return jb6.M0(2131754676, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
            return jb6.M0(2131754674, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
            return jb6.M0(2131754671, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
            return jb6.M0(2131754673, null);
        }
        if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
            return jb6.M0(2131754679, null);
        }
        return "";
    }

    public static int m0(xz7 xz7Var) {
        return xz7Var.currentAccount;
    }

    public static int n0(xz7 xz7Var) {
        return xz7Var.currentAccount;
    }

    public static boolean n1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) && !(secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) && !(secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement)) {
            return false;
        }
        return true;
    }

    public static boolean o1(TLRPC.SecureValueType secureValueType) {
        if (!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) {
            return false;
        }
        return true;
    }

    public final void A1() {
        he heVar = this.L1;
        if (heVar == null) {
            return;
        }
        try {
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        this.L1 = null;
    }

    public final void B1() {
        if (getParentActivity() != null && !getParentActivity().isFinishing() && this.L1 == null) {
            he heVar = new he(3, null, getParentActivity());
            this.L1 = heVar;
            heVar.j0 = false;
            heVar.show();
        }
    }

    public final void C1(View view) {
        if (view == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        gm.z3(view);
        L1(view);
    }

    public final void D1(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        if (z) {
            this.Z[0].setText("");
        }
        gm.z3(this.Z[0]);
    }

    public final void E1(boolean z) {
        String obj;
        if (z) {
            obj = null;
        } else {
            obj = this.Z[0].getText().toString();
            if (TextUtils.isEmpty(obj)) {
                D1(false);
                return;
            }
            Q1(true, true);
        }
        Utilities.e.c(new yl6(this, z, obj, (byte) 9));
    }

    public final void F1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (m1(TLRPC.TL_secureValueTypePhone.class)) {
            arrayList.add(jb6.M0(2131754673, null));
            arrayList2.add(TLRPC.TL_secureValueTypePhone.class);
        }
        if (m1(TLRPC.TL_secureValueTypeEmail.class)) {
            arrayList.add(jb6.M0(2131754679, null));
            arrayList2.add(TLRPC.TL_secureValueTypeEmail.class);
        }
        if (m1(TLRPC.TL_secureValueTypePersonalDetails.class)) {
            arrayList.add(jb6.M0(2131754678, null));
            arrayList2.add(TLRPC.TL_secureValueTypePersonalDetails.class);
        }
        if (m1(TLRPC.TL_secureValueTypePassport.class)) {
            arrayList.add(jb6.M0(2131754675, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassport.class);
        }
        if (m1(TLRPC.TL_secureValueTypeInternalPassport.class)) {
            arrayList.add(jb6.M0(2131754676, null));
            arrayList2.add(TLRPC.TL_secureValueTypeInternalPassport.class);
        }
        if (m1(TLRPC.TL_secureValueTypePassportRegistration.class)) {
            arrayList.add(jb6.M0(2131754674, null));
            arrayList2.add(TLRPC.TL_secureValueTypePassportRegistration.class);
        }
        if (m1(TLRPC.TL_secureValueTypeTemporaryRegistration.class)) {
            arrayList.add(jb6.M0(2131754671, null));
            arrayList2.add(TLRPC.TL_secureValueTypeTemporaryRegistration.class);
        }
        if (m1(TLRPC.TL_secureValueTypeIdentityCard.class)) {
            arrayList.add(jb6.M0(2131754677, null));
            arrayList2.add(TLRPC.TL_secureValueTypeIdentityCard.class);
        }
        if (m1(TLRPC.TL_secureValueTypeDriverLicense.class)) {
            arrayList.add(jb6.M0(2131754680, null));
            arrayList2.add(TLRPC.TL_secureValueTypeDriverLicense.class);
        }
        if (m1(TLRPC.TL_secureValueTypeAddress.class)) {
            arrayList.add(jb6.M0(2131754682, null));
            arrayList2.add(TLRPC.TL_secureValueTypeAddress.class);
        }
        if (m1(TLRPC.TL_secureValueTypeUtilityBill.class)) {
            arrayList.add(jb6.M0(2131754670, null));
            arrayList2.add(TLRPC.TL_secureValueTypeUtilityBill.class);
        }
        if (m1(TLRPC.TL_secureValueTypeBankStatement.class)) {
            arrayList.add(jb6.M0(2131754681, null));
            arrayList2.add(TLRPC.TL_secureValueTypeBankStatement.class);
        }
        if (m1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            arrayList.add(jb6.M0(2131754672, null));
            arrayList2.add(TLRPC.TL_secureValueTypeRentalAgreement.class);
        }
        if (getParentActivity() != null && !arrayList.isEmpty()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131747229, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            alertDialog$Builder.e((CharSequence[]) arrayList.toArray(new CharSequence[0]), new ff((Object) this, arrayList2, (byte) 7));
            showDialog(heVar);
        }
    }

    public final void G1() {
        boolean z;
        int size;
        if (getParentActivity() == null) {
            return;
        }
        byte b = this.T0;
        ArrayList arrayList = this.j1;
        int i = 1;
        if (b == 0 && arrayList.size() >= 20) {
            P1(jb6.M0(2131689472, null), jb6.a0("PassportUploadMaxReached", null, 2131747184, jb6.G(20, "Files", new Object[0])));
            return;
        }
        V0();
        i22 i22Var = this.S0;
        byte b2 = this.T0;
        if (b2 == 1) {
            z = true;
        } else {
            z = false;
        }
        i22Var.R3 = z;
        if (b2 == 0) {
            size = arrayList.size();
        } else {
            if (b2 == 4) {
                size = this.l1.size();
            }
            i22Var.t1(i, false);
            this.S0.d2.h0();
            this.S0.Z0();
            showDialog(this.S0);
        }
        i = 20 - size;
        i22Var.t1(i, false);
        this.S0.d2.h0();
        this.S0.Z0();
        showDialog(this.S0);
    }

    public final void H1(TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, boolean z) {
        int i;
        TLRPC.SecureValueType secureValueType;
        int i2;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType.type;
        if (tL_secureRequiredType2 != null) {
            secureValueType = tL_secureRequiredType2.type;
        } else {
            secureValueType = null;
        }
        if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
            i2 = 1;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
            i2 = 2;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePhone) {
            i2 = 3;
        } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeEmail) {
            i2 = 4;
        } else {
            i2 = -1;
        }
        if (i2 != -1) {
            HashMap hashMap4 = this.v1;
            if (!z) {
                hashMap = (HashMap) hashMap4.get(i1(secureValueType2));
            } else {
                hashMap = null;
            }
            HashMap hashMap5 = (HashMap) hashMap4.get(i1(secureValueType));
            TLRPC.TL_secureValue l1 = l1(tL_secureRequiredType, false);
            TLRPC.TL_secureValue l12 = l1(tL_secureRequiredType2, false);
            HashMap hashMap6 = hashMap;
            TL_account.authorizationForm authorizationform = this.E;
            int i3 = i2;
            TL_account.Password password = this.K;
            HashMap hashMap7 = this.q1;
            HashMap hashMap8 = (HashMap) hashMap7.get(tL_secureRequiredType);
            if (tL_secureRequiredType2 != null) {
                hashMap2 = hashMap5;
                hashMap3 = (HashMap) hashMap7.get(tL_secureRequiredType2);
            } else {
                hashMap2 = hashMap5;
                hashMap3 = null;
            }
            xz7 xz7Var = new xz7(i3, authorizationform, password, tL_secureRequiredType, l1, tL_secureRequiredType2, l12, hashMap8, hashMap3);
            xz7Var.C1 = new ez7(this, secureValueType2, z, i);
            xz7Var.currentAccount = this.currentAccount;
            xz7Var.f1 = this.f1;
            xz7Var.d1 = this.d1;
            xz7Var.c = this.c;
            xz7Var.x1 = hashMap6;
            xz7Var.w0 = z;
            xz7Var.y1 = hashMap2;
            xz7Var.H = arrayList;
            if (i3 == 4) {
                xz7Var.e1 = this.e1;
            }
            presentFragment(xz7Var);
        }
    }

    public final void I0(final xw9 xw9Var, final int i) {
        String M0;
        String str;
        String v;
        if (i == 1) {
            this.k1 = xw9Var;
            if (this.h0 == null) {
                return;
            }
        } else if (i == 4) {
            this.l1.add(xw9Var);
            if (this.i0 == null) {
                return;
            }
        } else if (i == 2) {
            this.m1 = xw9Var;
            if (this.f0 == null) {
                return;
            }
        } else if (i == 3) {
            this.n1 = xw9Var;
            if (this.g0 == null) {
                return;
            }
        } else {
            this.j1.add(xw9Var);
            if (this.e0 == null) {
                return;
            }
        }
        if (getParentActivity() == null) {
            return;
        }
        final vz7 vz7Var = new vz7(this, getParentActivity());
        vz7Var.setTag(xw9Var);
        fg0 L0 = cmb.L0(true);
        wmb M = anb.M(cmb.c6);
        wmb M2 = anb.M(cmb.h6);
        vz7Var.setBackground(L0);
        anb.j(vz7Var, L0, M, M2, null);
        this.o1.put(xw9Var, vz7Var);
        String g1 = g1(xw9Var);
        if (i == 1) {
            M0 = jb6.M0(2131747196, null);
            this.h0.addView(vz7Var, qoe.o(-1, -2));
            str = "selfie" + g1;
        } else if (i == 4) {
            M0 = jb6.M0(2131753913, null);
            this.i0.addView(vz7Var, qoe.o(-1, -2));
            str = "translation" + g1;
        } else if (i == 2) {
            TLRPC.SecureValueType secureValueType = this.G.type;
            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePassport) && !(secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport)) {
                M0 = jb6.M0(2131747301, null);
            } else {
                M0 = jb6.M0(2131747243, null);
            }
            this.f0.addView(vz7Var, qoe.o(-1, -2));
            str = "front" + g1;
        } else if (i == 3) {
            M0 = jb6.M0(2131747205, null);
            this.g0.addView(vz7Var, qoe.o(-1, -2));
            str = "reverse" + g1;
        } else {
            M0 = jb6.M0(2131753913, null);
            this.e0.addView(vz7Var, qoe.o(-1, -2));
            str = "files" + g1;
        }
        HashMap hashMap = this.y1;
        TextView textView = vz7Var.b;
        if (hashMap != null && (v = (String) hashMap.get(str)) != null) {
            anb.X(textView, cmb.o7, null);
            this.z1.put(str, "");
        } else {
            v = jb6.v(xw9Var.b.date);
        }
        vz7Var.a.setText(M0);
        textView.setText(v);
        bf0 bf0Var = vz7Var.c;
        bf0Var.getClass();
        ?? obj = new Object();
        obj.h = xw9Var;
        bf0Var.k(obj, "48_48", null, null, null, null, 0, null);
        vz7Var.f = xw9Var;
        vz7Var.a(false);
        vz7Var.setOnClickListener(new hb(this, i, (byte) 4));
        final String str2 = str;
        vz7Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                final xz7 xz7Var = this;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xz7Var.getParentActivity());
                final byte b = i;
                he heVar = alertDialog$Builder.a;
                if (b == 1) {
                    heVar.U = jb6.M0(2131747315, null);
                } else {
                    heVar.U = jb6.M0(2131747317, null);
                }
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                heVar.S = jb6.M0(2131689472, null);
                String M02 = jb6.M0(2131747564, null);
                final vz7 vz7Var2 = vz7Var;
                final xw9 xw9Var2 = xw9Var;
                final String str3 = str2;
                alertDialog$Builder.j(M02, new ee() {
                    @Override
                    public final void r(he heVar2, int i2) {
                        xz7Var.p1(xw9Var2, b, vz7Var2, str3);
                    }
                });
                xz7Var.showDialog(heVar);
                return true;
            }
        });
    }

    public final void I1(int i) {
        if (i == 0) {
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q0 = gm.q0(null, false);
                if (q0 != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        Activity parentActivity = getParentActivity();
                        a.d();
                        intent.putExtra("output", FileProvider.c(parentActivity, "org.telegram.messenger.beta.provider", q0));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q0));
                    }
                    this.R0 = q0.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void J0(TLRPC.TL_secureFile tL_secureFile, int i) {
        byte[] bArr = tL_secureFile.secret;
        byte[] bArr2 = tL_secureFile.file_hash;
        byte[] r = Utilities.r(b1(bArr, bArr2), bArr2);
        byte[] bArr3 = new byte[32];
        System.arraycopy(r, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(r, 32, bArr4, 0, 16);
        I0(new xw9(new yw9(bArr3, bArr4), tL_secureFile, null, null, null), i);
    }

    public final void J1(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        byte b = this.T0;
        boolean z = true;
        boolean z2 = false;
        if (b != 1 && b != 4 && (this.F.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
                if (i < editTextBoldCursorArr.length) {
                    if (i != 5 && i != 8 && i != 4 && i != 6 && editTextBoldCursorArr[i].length() > 0) {
                        z = false;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            z2 = z;
        }
        Utilities.e.c(new lp6(this, arrayList, this.T0, z2));
    }

    public final void K0(ArrayList arrayList) {
        this.j1.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                J0((TLRPC.TL_secureFile) secureFile, 0);
            }
        }
    }

    public final void K1(TLRPC.TL_secureRequiredType tL_secureRequiredType) {
        if (tL_secureRequiredType != null) {
            int size = this.E.values.size();
            for (int i = 0; i < size; i++) {
                if (tL_secureRequiredType.type.getClass() == this.E.values.get(i).type.getClass()) {
                    this.E.values.remove(i);
                    return;
                }
            }
        }
    }

    public final defpackage.wz7 L0(android.content.Context r28, org.telegram.tgnet.TLRPC.TL_secureRequiredType r29, java.util.ArrayList r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz7.L0(android.content.Context, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.util.ArrayList, boolean, boolean):wz7");
    }

    public final void L1(View view) {
        while (view != null) {
            if (this.d0.indexOfChild(view) < 0) {
                view = (View) view.getParent();
            } else {
                this.c0.smoothScrollTo(0, view.getTop() - ((this.c0.getMeasuredHeight() - view.getMeasuredHeight()) / 2));
                return;
            }
        }
    }

    public final void M0(ArrayList arrayList) {
        this.l1.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.SecureFile secureFile = (TLRPC.SecureFile) arrayList.get(i);
            if (secureFile instanceof TLRPC.TL_secureFile) {
                J0((TLRPC.TL_secureFile) secureFile, 4);
            }
        }
    }

    public final void M1(HashMap hashMap, EditTextBoldCursor editTextBoldCursor, String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -2006252145:
                    if (str.equals("residence_country_code")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249512767:
                    if (str.equals("gender")) {
                        c = 1;
                        break;
                    }
                    break;
                case 475919162:
                    if (str.equals("expiry_date")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1481071862:
                    if (str.equals("country_code")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.w = str2;
                    CharSequence charSequence3 = (String) this.Z0.get(str2);
                    if (charSequence3 != null) {
                        editTextBoldCursor.setText(charSequence3);
                        break;
                    }
                    break;
                case 1:
                    if ("male".equals(str2)) {
                        this.x = str2;
                        editTextBoldCursor.setText(jb6.M0(2131747241, null));
                        break;
                    } else if ("female".equals(str2)) {
                        this.x = str2;
                        editTextBoldCursor.setText(jb6.M0(2131747302, null));
                        break;
                    }
                    break;
                case 2:
                    boolean isEmpty = TextUtils.isEmpty(str2);
                    int[] iArr = this.y;
                    if (!isEmpty) {
                        String[] split = str2.split("\\.");
                        if (split.length == 3) {
                            iArr[0] = Utilities.z(split[2]).intValue();
                            iArr[1] = Utilities.z(split[1]).intValue();
                            iArr[2] = Utilities.z(split[0]).intValue();
                            editTextBoldCursor.setText(str2);
                            break;
                        }
                    }
                    iArr[2] = 0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    editTextBoldCursor.setText(jb6.M0(2131747227, null));
                    break;
                case 3:
                    this.s = str2;
                    CharSequence charSequence4 = (String) this.Z0.get(str2);
                    if (charSequence4 != null) {
                        editTextBoldCursor.setText(charSequence4);
                        break;
                    }
                    break;
                default:
                    editTextBoldCursor.setText(str2);
                    break;
            }
        }
        HashMap hashMap2 = this.x1;
        HashMap hashMap3 = this.z1;
        if (hashMap2 != null && (charSequence2 = (String) hashMap2.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence2);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
            return;
        }
        HashMap hashMap4 = this.y1;
        if (hashMap4 != null && (charSequence = (String) hashMap4.get(str)) != null) {
            editTextBoldCursor.setErrorText(charSequence);
            hashMap3.put(str, editTextBoldCursor.getText().toString());
        }
    }

    public final void N0(boolean z) {
        int i;
        if (!this.h1) {
            String str = this.n;
            boolean isEmpty = TextUtils.isEmpty(str);
            int i2 = this.b;
            if (!isEmpty) {
                if (z) {
                    Activity parentActivity = getParentActivity();
                    l11.r(parentActivity, Uri.parse(str + "&tg_passport=success"), true, true);
                } else if (!this.g1 && (i2 == 5 || i2 == 0)) {
                    Activity parentActivity2 = getParentActivity();
                    l11.r(parentActivity2, Uri.parse(str + "&tg_passport=cancel"), true, true);
                }
                this.h1 = true;
            } else if (this.D1) {
                if (z || (!this.g1 && (i2 == 5 || i2 == 0))) {
                    Activity parentActivity3 = getParentActivity();
                    if (z) {
                        i = -1;
                    } else {
                        i = 0;
                    }
                    parentActivity3.setResult(i);
                }
                this.h1 = true;
            }
        }
    }

    public final void N1(Bundle bundle, int i, boolean z) {
        if (i == 3) {
            this.M.setVisibility(8);
        }
        byte b = this.J1;
        kla[] klaVarArr = this.K1;
        kla klaVar = klaVarArr[b];
        kla klaVar2 = klaVarArr[i];
        this.J1 = i;
        klaVar2.m(bundle, false);
        klaVar2.j();
        if (z) {
            Point point = gm.q;
            klaVar2.setTranslationX(point.x);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(ObjectAnimator.ofFloat(klaVar, "translationX", -point.x), ObjectAnimator.ofFloat(klaVar2, "translationX", 0.0f));
            animatorSet.addListener(new u5(klaVar2, klaVar, false, (byte) 28));
            animatorSet.start();
            return;
        }
        klaVar2.setTranslationX(0.0f);
        klaVar2.setVisibility(0);
        if (klaVar != klaVar2) {
            klaVar.setVisibility(8);
        }
    }

    public final boolean O0(boolean z) {
        String str = this.a;
        if (str != null && !str.equals(f1())) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.j(jb6.M0(2131747313, null), new qy7(this, (byte) 1));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                String M0 = jb6.M0(2131751342, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131747312, null);
                showDialog(heVar);
            }
            return true;
        }
        return false;
    }

    public final void O1(org.telegram.tgnet.TLRPC.TL_secureRequiredType r31, java.lang.String r32, java.lang.String r33, org.telegram.tgnet.TLRPC.TL_secureRequiredType r34, java.lang.String r35, boolean r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz7.O1(org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_secureRequiredType, java.lang.String, boolean, int):void");
    }

    public final void P0(EditTextBoldCursor editTextBoldCursor, String str, Editable editable, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = this.z1;
        if (hashMap != null && (str3 = (String) hashMap.get(str)) != null) {
            if (TextUtils.equals(str3, editable)) {
                HashMap hashMap2 = this.x1;
                if (hashMap2 != null && (str5 = (String) hashMap2.get(str)) != null) {
                    editTextBoldCursor.setErrorText(str5);
                } else {
                    HashMap hashMap3 = this.y1;
                    if (hashMap3 != null && (str4 = (String) hashMap3.get(str)) != null) {
                        editTextBoldCursor.setErrorText(str4);
                    }
                }
            } else {
                editTextBoldCursor.setErrorText(null);
            }
        } else {
            editTextBoldCursor.setErrorText(null);
        }
        if (z) {
            str2 = "error_document_all";
        } else {
            str2 = "error_all";
        }
        if (hashMap != null && hashMap.containsKey(str2)) {
            hashMap.remove(str2);
            T0(false);
        }
    }

    public final void P1(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        heVar.U = str2;
        showDialog(heVar);
    }

    public final boolean Q0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz7.Q0():boolean");
    }

    public final void Q1(boolean z, boolean z2) {
        AnimatorSet animatorSet = this.N;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z && this.M != null) {
            this.N = new AnimatorSet();
            if (z2) {
                this.O.setVisibility(0);
                this.M.setEnabled(false);
                AnimatorSet animatorSet2 = this.N;
                View contentView = this.M.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(contentView, property, 0.1f);
                View contentView2 = this.M.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(contentView2, property2, 0.1f);
                View contentView3 = this.M.getContentView();
                Property property3 = View.ALPHA;
                animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(contentView3, property3, 0.0f), ObjectAnimator.ofFloat(this.O, property, 1.0f), ObjectAnimator.ofFloat(this.O, property2, 1.0f), ObjectAnimator.ofFloat(this.O, property3, 1.0f));
            } else {
                this.M.getContentView().setVisibility(0);
                this.M.setEnabled(true);
                AnimatorSet animatorSet3 = this.N;
                mx2 mx2Var = this.O;
                Property property4 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(mx2Var, property4, 0.1f);
                mx2 mx2Var2 = this.O;
                Property property5 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(mx2Var2, property5, 0.1f);
                mx2 mx2Var3 = this.O;
                Property property6 = View.ALPHA;
                animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(mx2Var3, property6, 0.0f), ObjectAnimator.ofFloat(this.M.getContentView(), property4, 1.0f), ObjectAnimator.ofFloat(this.M.getContentView(), property5, 1.0f), ObjectAnimator.ofFloat(this.M.getContentView(), property6, 1.0f));
            }
            this.N.addListener(new fz7(this, z2, (byte) 0));
            this.N.setDuration(150L);
            this.N.start();
        } else if (this.P != null) {
            this.N = new AnimatorSet();
            if (z2) {
                this.Q.setVisibility(0);
                this.R.setEnabled(false);
                AnimatorSet animatorSet4 = this.N;
                TextView textView = this.P;
                Property property7 = View.SCALE_X;
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView, property7, 0.1f);
                TextView textView2 = this.P;
                Property property8 = View.SCALE_Y;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, property8, 0.1f);
                TextView textView3 = this.P;
                Property property9 = View.ALPHA;
                animatorSet4.playTogether(ofFloat5, ofFloat6, ObjectAnimator.ofFloat(textView3, property9, 0.0f), ObjectAnimator.ofFloat(this.Q, property7, 1.0f), ObjectAnimator.ofFloat(this.Q, property8, 1.0f), ObjectAnimator.ofFloat(this.Q, property9, 1.0f));
            } else {
                this.P.setVisibility(0);
                this.R.setEnabled(true);
                AnimatorSet animatorSet5 = this.N;
                mx2 mx2Var4 = this.Q;
                Property property10 = View.SCALE_X;
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(mx2Var4, property10, 0.1f);
                mx2 mx2Var5 = this.Q;
                Property property11 = View.SCALE_Y;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(mx2Var5, property11, 0.1f);
                mx2 mx2Var6 = this.Q;
                Property property12 = View.ALPHA;
                animatorSet5.playTogether(ofFloat7, ofFloat8, ObjectAnimator.ofFloat(mx2Var6, property12, 0.0f), ObjectAnimator.ofFloat(this.P, property10, 1.0f), ObjectAnimator.ofFloat(this.P, property11, 1.0f), ObjectAnimator.ofFloat(this.P, property12, 1.0f));
            }
            this.N.addListener(new fz7(this, z2, (byte) 1));
            this.N.setDuration(150L);
            this.N.start();
        }
    }

    public final void R0(boolean z) {
        String str;
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.b0 != null) {
            String str2 = (String) this.Z0.get(this.w);
            String str3 = (String) gda.n().get(this.w);
            int i = 0;
            if (this.F.native_names && !TextUtils.isEmpty(this.w) && !"EN".equals(str3)) {
                if (this.r0.getVisibility() != 0) {
                    this.r0.setVisibility(0);
                    this.k0.setVisibility(0);
                    this.U.setVisibility(0);
                    int i2 = 0;
                    while (true) {
                        editTextBoldCursorArr = this.b0;
                        if (i2 >= editTextBoldCursorArr.length) {
                            break;
                        }
                        ((View) editTextBoldCursorArr[i2].getParent()).setVisibility(0);
                        i2++;
                    }
                    if (editTextBoldCursorArr[0].length() == 0 && this.b0[1].length() == 0 && this.b0[2].length() == 0) {
                        int i3 = 0;
                        while (true) {
                            boolean[] zArr = this.u0;
                            if (i3 >= zArr.length) {
                                break;
                            } else if (zArr[i3]) {
                                this.b0[0].setText(this.Z[0].getText());
                                this.b0[1].setText(this.Z[1].getText());
                                this.b0[2].setText(this.Z[2].getText());
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    anb.Z(this.n0, getParentActivity(), 2131231233, cmb.a7);
                }
                this.r0.setText(jb6.a0("PassportNativeInfo", null, 2131747231, str2));
                if (str3 != null) {
                    str = jb6.K0("PassportLanguage_".concat(str3));
                } else {
                    str = null;
                }
                jf5 jf5Var = this.k0;
                if (str != null) {
                    jf5Var.setText(jb6.a0("PassportNativeHeaderLang", null, 2131747232, str));
                } else {
                    jf5Var.setText(jb6.M0(2131747233, null));
                }
                for (int i4 = 0; i4 < 3; i4++) {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                EditTextBoldCursor[] editTextBoldCursorArr2 = this.b0;
                                if (str != null) {
                                    editTextBoldCursorArr2[i4].setHintText(jb6.M0(2131747191, null));
                                } else {
                                    editTextBoldCursorArr2[i4].setHintText(jb6.a0("PassportSurnameCountry", null, 2131747190, str2));
                                }
                            }
                        } else {
                            EditTextBoldCursor[] editTextBoldCursorArr3 = this.b0;
                            if (str != null) {
                                editTextBoldCursorArr3[i4].setHintText(jb6.M0(2131747240, null));
                            } else {
                                editTextBoldCursorArr3[i4].setHintText(jb6.a0("PassportMidnameCountry", null, 2131747239, str2));
                            }
                        }
                    } else {
                        EditTextBoldCursor[] editTextBoldCursorArr4 = this.b0;
                        if (str != null) {
                            editTextBoldCursorArr4[i4].setHintText(jb6.M0(2131747237, null));
                        } else {
                            editTextBoldCursorArr4[i4].setHintText(jb6.a0("PassportNameCountry", null, 2131747235, str2));
                        }
                    }
                }
                if (z) {
                    gm.c3(new ny7(this, (byte) 2));
                }
            } else if (this.r0.getVisibility() != 8) {
                this.r0.setVisibility(8);
                this.k0.setVisibility(8);
                this.U.setVisibility(8);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr5 = this.b0;
                    if (i >= editTextBoldCursorArr5.length) {
                        break;
                    }
                    ((View) editTextBoldCursorArr5[i].getParent()).setVisibility(8);
                    i++;
                }
                if (((this.c != 0 || this.G == null) && this.I != null && !this.w0) || this.J != null) {
                    anb.Z(this.n0, getParentActivity(), 2131231233, cmb.a7);
                } else {
                    anb.Z(this.n0, getParentActivity(), 2131231234, cmb.a7);
                }
            }
        }
    }

    public final void R1(boolean z, String str, kl7 kl7Var, wm4 wm4Var, ez7 ez7Var) {
        boolean z2;
        boolean z3;
        boolean z4;
        TelephonyManager telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
        if (telephonyManager.getSimState() != 1 && telephonyManager.getPhoneType() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getParentActivity() != null && z2) {
            if (getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                this.N1.clear();
                if (!z3) {
                    this.N1.add("android.permission.READ_PHONE_STATE");
                }
                if (!this.N1.isEmpty()) {
                    if (getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.a.S = jb6.M0(2131689472, null);
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        String M0 = jb6.M0(2131754240, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.U = M0;
                        this.M1 = showDialog(heVar);
                    } else {
                        getParentActivity().requestPermissions((String[]) this.N1.toArray(new String[0]), 6);
                    }
                    this.F1 = str;
                    this.H1 = wm4Var;
                    this.G1 = kl7Var;
                    this.I1 = ez7Var;
                    return;
                }
            }
        } else {
            z3 = true;
        }
        TL_account.sendVerifyPhoneCode sendverifyphonecode = new TL_account.sendVerifyPhoneCode();
        sendverifyphonecode.phone_number = str;
        TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
        sendverifyphonecode.settings = tL_codeSettings;
        if (z2 && z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        tL_codeSettings.allow_flashcall = z4;
        tL_codeSettings.allow_app_hash = b.b.hasServices();
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
        if (sendverifyphonecode.settings.allow_app_hash) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            boolean z5 = e21.a;
            a.t();
            edit.putString("sms_hash", "O2P2z+/jBpJ").commit();
        } else {
            sharedPreferences.edit().remove("sms_hash").commit();
        }
        if (sendverifyphonecode.settings.allow_flashcall) {
            try {
                String line1Number = telephonyManager.getLine1Number();
                boolean isEmpty = TextUtils.isEmpty(line1Number);
                TLRPC.TL_codeSettings tL_codeSettings2 = sendverifyphonecode.settings;
                if (!isEmpty) {
                    tL_codeSettings2.current_number = PhoneNumberUtils.compare(str, line1Number);
                    TLRPC.TL_codeSettings tL_codeSettings3 = sendverifyphonecode.settings;
                    if (!tL_codeSettings3.current_number) {
                        tL_codeSettings3.allow_flashcall = false;
                    }
                } else {
                    tL_codeSettings2.unknown_number = true;
                    tL_codeSettings2.current_number = false;
                }
            } catch (Exception e) {
                sendverifyphonecode.settings.allow_flashcall = false;
                fc4.g(e, true);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendverifyphonecode, new av0((Object) this, str, (Object) ez7Var, (Object) sendverifyphonecode, (byte) 12), 2);
    }

    public final void T0(boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        String str2;
        if (this.q0 != null) {
            HashMap hashMap = this.x1;
            HashMap hashMap2 = this.z1;
            if (hashMap != null && ((z || hashMap2.containsKey("error_all")) && (str2 = (String) this.x1.get("error_all")) != null)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
                if (z) {
                    hashMap2.put("error_all", "");
                }
            } else {
                spannableStringBuilder = null;
            }
            if (this.y1 != null && ((z || hashMap2.containsKey("error_document_all")) && (str = (String) this.y1.get("error_all")) != null)) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                } else {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) str);
                }
                if (z) {
                    hashMap2.put("error_document_all", "");
                }
            }
            if (spannableStringBuilder != null) {
                spannableStringBuilder.setSpan(new do4(cmb.o7, null), 0, spannableStringBuilder.length(), 33);
                this.q0.setText(spannableStringBuilder);
                this.q0.setVisibility(0);
            } else if (this.q0.getVisibility() != 8) {
                this.q0.setVisibility(8);
            }
        }
    }

    public final void T1() {
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (tL_secureRequiredType != null) {
            aVar.setTitle(k1(tL_secureRequiredType.type));
        } else {
            aVar.setTitle(jb6.M0(2131747225, null));
        }
        W1(2);
        W1(3);
        W1(1);
        W1(4);
    }

    public final void U0(Context context) {
        long j;
        String str;
        String str2;
        String str3;
        this.Z0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Z0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        njb njbVar = new njb(context);
        this.q0 = njbVar;
        int i = cmb.a7;
        anb.Z(njbVar, context, 2131231235, i);
        this.q0.setPadding(0, gm.L(7.0f), 0, 0);
        this.d0.addView(this.q0, qoe.o(-1, -2));
        T0(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        if (tL_secureRequiredType != null) {
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                this.actionBar.setTitle(jb6.M0(2131754672, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                this.actionBar.setTitle(jb6.M0(2131754681, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                this.actionBar.setTitle(jb6.M0(2131754670, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                this.actionBar.setTitle(jb6.M0(2131754674, null));
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                this.actionBar.setTitle(jb6.M0(2131754671, null));
            }
            jf5 jf5Var = new jf5(context);
            this.k0 = jf5Var;
            jf5Var.setText(jb6.M0(2131747309, null));
            jf5 jf5Var2 = this.k0;
            int i2 = cmb.c6;
            anb.h(i2, null, jf5Var2);
            j = 0;
            this.d0.addView(this.k0, qoe.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.e0 = linearLayout;
            linearLayout.setOrientation(1);
            this.d0.addView(this.e0, qoe.o(-1, -2));
            vkb vkbVar = new vkb(context);
            this.S = vkbVar;
            fg0 L0 = cmb.L0(true);
            wmb M = anb.M(i2);
            int i3 = cmb.h6;
            wmb M2 = anb.M(i3);
            vkbVar.setBackground(L0);
            anb.j(vkbVar, L0, M, M2, null);
            this.d0.addView(this.S, qoe.o(-1, -2));
            this.S.setOnClickListener(new oy7(this, (byte) 7));
            njb njbVar2 = new njb(context);
            this.o0 = njbVar2;
            anb.Z(njbVar2, context, 2131231233, i);
            if (this.c != 0) {
                String M0 = jb6.M0(2131747360, null);
                this.A1 = M0;
                str2 = M0;
            } else {
                TLRPC.SecureValueType secureValueType2 = this.G.type;
                if (secureValueType2 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                    String M02 = jb6.M0(2131747358, null);
                    this.A1 = M02;
                    str2 = M02;
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                    String M03 = jb6.M0(2131747354, null);
                    this.A1 = M03;
                    str2 = M03;
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                    String M04 = jb6.M0(2131747344, null);
                    this.A1 = M04;
                    str2 = M04;
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                    String M05 = jb6.M0(2131747342, null);
                    this.A1 = M05;
                    str2 = M05;
                } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                    String M06 = jb6.M0(2131747356, null);
                    this.A1 = M06;
                    str2 = M06;
                } else {
                    this.A1 = "";
                    str2 = "";
                }
            }
            HashMap hashMap = this.y1;
            HashMap hashMap2 = this.z1;
            String str4 = str2;
            if (hashMap != null) {
                String str5 = (String) hashMap.get("files_all");
                str4 = str2;
                if (str5 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                    spannableStringBuilder.append((CharSequence) this.A1);
                    spannableStringBuilder.setSpan(new do4(cmb.o7, null), 0, str5.length(), 33);
                    hashMap2.put("files_all", "");
                    str4 = spannableStringBuilder;
                }
            }
            this.o0.setText(str4);
            this.d0.addView(this.o0, qoe.o(-1, -2));
            if (this.G.translation_required) {
                jf5 jf5Var3 = new jf5(context);
                this.k0 = jf5Var3;
                jf5Var3.setText(jb6.M0(2131747188, null));
                anb.h(i2, null, this.k0);
                this.d0.addView(this.k0, qoe.o(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.i0 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.d0.addView(this.i0, qoe.o(-1, -2));
                vkb vkbVar2 = new vkb(context);
                this.Y = vkbVar2;
                fg0 L02 = cmb.L0(true);
                wmb M3 = anb.M(i2);
                wmb M4 = anb.M(i3);
                vkbVar2.setBackground(L02);
                anb.j(vkbVar2, L02, M3, M4, null);
                this.d0.addView(this.Y, qoe.o(-1, -2));
                this.Y.setOnClickListener(new oy7(this, (byte) 8));
                njb njbVar3 = new njb(context);
                this.p0 = njbVar3;
                anb.Z(njbVar3, context, 2131231233, i);
                if (this.c != 0) {
                    String M07 = jb6.M0(2131747336, null);
                    this.B1 = M07;
                    str3 = M07;
                } else {
                    TLRPC.SecureValueType secureValueType3 = this.G.type;
                    if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                        String M08 = jb6.M0(2131747341, null);
                        this.B1 = M08;
                        str3 = M08;
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                        String M09 = jb6.M0(2131747339, null);
                        this.B1 = M09;
                        str3 = M09;
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                        String M010 = jb6.M0(2131747338, null);
                        this.B1 = M010;
                        str3 = M010;
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                        String M011 = jb6.M0(2131747337, null);
                        this.B1 = M011;
                        str3 = M011;
                    } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                        String M012 = jb6.M0(2131747340, null);
                        this.B1 = M012;
                        str3 = M012;
                    } else {
                        this.B1 = "";
                        str3 = "";
                    }
                }
                HashMap hashMap3 = this.y1;
                String str6 = str3;
                if (hashMap3 != null) {
                    String str7 = (String) hashMap3.get("translation_all");
                    str6 = str3;
                    if (str7 != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str7);
                        spannableStringBuilder2.append((CharSequence) "\n\n");
                        spannableStringBuilder2.append((CharSequence) this.B1);
                        spannableStringBuilder2.setSpan(new do4(cmb.o7, null), 0, str7.length(), 33);
                        hashMap2.put("translation_all", "");
                        str6 = spannableStringBuilder2;
                    }
                }
                this.p0.setText(str6);
                this.d0.addView(this.p0, qoe.o(-1, -2));
            }
        } else {
            j = 0;
            this.actionBar.setTitle(jb6.M0(2131747335, null));
        }
        jf5 jf5Var4 = new jf5(context);
        this.k0 = jf5Var4;
        jf5Var4.setText(jb6.M0(2131747334, null));
        anb.h(cmb.c6, null, this.k0);
        this.d0.addView(this.k0, qoe.o(-1, -2));
        this.Z = new EditTextBoldCursor[6];
        for (int i4 = 0; i4 < 6; i4++) {
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.Z[i4] = editTextBoldCursor;
            wy7 wy7Var = new wy7(context, editTextBoldCursor, (byte) 0);
            wy7Var.setWillNotDraw(false);
            this.d0.addView(wy7Var, qoe.o(-1, -2));
            int i5 = cmb.c6;
            anb.h(i5, null, wy7Var);
            int i6 = 5;
            if (i4 == 5) {
                View view = new View(context);
                this.T = view;
                anb.h(i5, null, view);
                this.d0.addView(this.T, qoe.o(-1, 6));
            }
            if (this.w0 && this.G != null) {
                wy7Var.setVisibility(8);
                View view2 = this.T;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            this.Z[i4].setTag(Integer.valueOf(i4));
            this.Z[i4].setSupportRtlHint(true);
            this.Z[i4].setTextSize(1, 16.0f);
            anb.A(this.Z[i4], cmb.G6, null);
            anb.z(this.Z[i4], cmb.K6, null);
            this.Z[i4].setTransformHintToHeader(true);
            EditTextBoldCursor editTextBoldCursor2 = this.Z[i4];
            int i7 = cmb.F6;
            anb.X(editTextBoldCursor2, i7, null);
            this.Z[i4].setBackgroundDrawable(null);
            anb.v(this.Z[i4], i7, null);
            this.Z[i4].setCursorSize(gm.L(20.0f));
            this.Z[i4].setCursorWidth(1.5f);
            anb.F(this.Z[i4], cmb.j6, cmb.k6, cmb.o7, null);
            EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
            if (i4 == 5) {
                editTextBoldCursorArr[i4].setOnTouchListener(new py7(this, (byte) 2));
                this.Z[i4].setInputType(0);
                this.Z[i4].setFocusable(false);
            } else {
                editTextBoldCursorArr[i4].setInputType(16385);
                this.Z[i4].setImeOptions(268435461);
            }
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    this.Z[i4].setHintText(jb6.M0(2131747327, null));
                                    str = "country_code";
                                }
                            } else {
                                this.Z[i4].setHintText(jb6.M0(2131747194, null));
                                str = "state";
                            }
                        } else {
                            this.Z[i4].setHintText(jb6.M0(2131747328, null));
                            str = "city";
                        }
                    } else {
                        this.Z[i4].setHintText(jb6.M0(2131747213, null));
                        str = "post_code";
                    }
                } else {
                    this.Z[i4].setHintText(jb6.M0(2131747192, null));
                    str = "street_line2";
                }
            } else {
                this.Z[i4].setHintText(jb6.M0(2131747193, null));
                str = "street_line1";
            }
            M1(this.t1, this.Z[i4], str);
            EditTextBoldCursor[] editTextBoldCursorArr2 = this.Z;
            if (i4 == 2) {
                editTextBoldCursorArr2[i4].addTextChangedListener(new xy7(this, editTextBoldCursor, str));
                this.Z[i4].setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            } else {
                editTextBoldCursorArr2[i4].addTextChangedListener(new yy7(this, editTextBoldCursor, str, (byte) 0));
            }
            EditTextBoldCursor editTextBoldCursor3 = this.Z[i4];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.Z[i4].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.Z[i4];
            if (!jb6.a0) {
                i6 = 3;
            }
            editTextBoldCursor4.setGravity(i6 | 16);
            wy7Var.addView(this.Z[i4], qoe.d(-1, 64.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
            this.Z[i4].setOnEditorActionListener(new my7(this, (byte) 4));
        }
        bba bbaVar = new bba(context, (hg9) null);
        this.m0 = bbaVar;
        this.d0.addView(bbaVar, qoe.o(-1, -2));
        if (this.w0 && this.G != null) {
            this.k0.setVisibility(8);
            this.m0.setVisibility(8);
        }
        int i8 = (this.c > j ? 1 : (this.c == j ? 0 : -1));
        TLRPC.TL_secureValue tL_secureValue = this.J;
        if (((i8 != 0 || this.G == null) && this.I != null && !this.w0) || tL_secureValue != null) {
            if (tL_secureValue != null) {
                K0(tL_secureValue.files);
                M0(tL_secureValue.translation);
            }
            bba bbaVar2 = this.m0;
            int i9 = cmb.a7;
            anb.Z(bbaVar2, context, 2131231233, i9);
            vkb vkbVar3 = new vkb(context);
            anb.X(vkbVar3.getTextView(), cmb.o7, null);
            fg0 L03 = cmb.L0(true);
            wmb M5 = anb.M(cmb.c6);
            wmb M6 = anb.M(cmb.h6);
            vkbVar3.setBackground(L03);
            anb.j(vkbVar3, L03, M5, M6, null);
            if (this.G == null) {
                vkbVar3.b(jb6.M0(2131747320, null), false);
            } else {
                vkbVar3.b(jb6.M0(2131747325, null), false);
            }
            this.d0.addView(vkbVar3, qoe.o(-1, -2));
            vkbVar3.setOnClickListener(new oy7(this, (byte) 9));
            bba bbaVar3 = new bba(context, (hg9) null);
            this.m0 = bbaVar3;
            anb.Z(bbaVar3, context, 2131231234, i9);
            this.d0.addView(this.m0, qoe.o(-1, -2));
        } else {
            bba bbaVar4 = this.m0;
            int i10 = cmb.a7;
            anb.Z(bbaVar4, context, 2131231234, i10);
            if (this.w0 && this.G != null) {
                anb.Z(this.o0, context, 2131231234, i10);
            }
        }
        W1(0);
        W1(4);
    }

    public final void U1() {
        boolean isEmpty = this.E.values.isEmpty();
        LinearLayout linearLayout = this.B0;
        if (isEmpty) {
            linearLayout.setVisibility(0);
            this.m0.setVisibility(8);
            this.k0.setVisibility(8);
            this.y0.setVisibility(8);
            this.z0.setVisibility(8);
            this.A0.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(8);
        this.m0.setVisibility(0);
        this.k0.setVisibility(0);
        this.z0.setVisibility(0);
        this.A0.setVisibility(0);
        if (!m1(TLRPC.TL_secureValueTypePhone.class) && !m1(TLRPC.TL_secureValueTypeEmail.class) && !m1(TLRPC.TL_secureValueTypePersonalDetails.class) && !m1(TLRPC.TL_secureValueTypePassport.class) && !m1(TLRPC.TL_secureValueTypeInternalPassport.class) && !m1(TLRPC.TL_secureValueTypeIdentityCard.class) && !m1(TLRPC.TL_secureValueTypeDriverLicense.class) && !m1(TLRPC.TL_secureValueTypeAddress.class) && !m1(TLRPC.TL_secureValueTypeUtilityBill.class) && !m1(TLRPC.TL_secureValueTypePassportRegistration.class) && !m1(TLRPC.TL_secureValueTypeTemporaryRegistration.class) && !m1(TLRPC.TL_secureValueTypeBankStatement.class) && !m1(TLRPC.TL_secureValueTypeRentalAgreement.class)) {
            this.y0.setVisibility(8);
        } else {
            this.y0.setVisibility(0);
        }
    }

    public final void V0() {
        if (getParentActivity() != null && this.S0 == null) {
            i22 i22Var = new i22(getParentActivity(), this, false, false);
            this.S0 = i22Var;
            i22Var.W3 = new lj4(this);
        }
    }

    public final void V1() {
        ImageView imageView = this.J0;
        if (imageView != null) {
            TL_account.Password password = this.K;
            if (password != null && this.O0 == 0) {
                boolean z = password.has_password;
                njb njbVar = this.H0;
                if (!z) {
                    njbVar.setVisibility(0);
                    this.J0.setVisibility(0);
                    this.K0.setVisibility(0);
                    this.L0.setVisibility(0);
                    this.M0.setVisibility(8);
                    this.a0[0].setVisibility(8);
                    this.M.setVisibility(8);
                    this.N0.setVisibility(8);
                    this.I0.setVisibility(8);
                    this.H0.setLayoutParams(qoe.k(0.0f, 25.0f, 0.0f, 0.0f, -1, -2));
                    this.G0.setVisibility(8);
                    return;
                }
                njbVar.setVisibility(0);
                this.J0.setVisibility(8);
                this.K0.setVisibility(8);
                this.L0.setVisibility(8);
                this.G0.setVisibility(8);
                this.M0.setVisibility(0);
                this.a0[0].setVisibility(0);
                this.M.setVisibility(0);
                this.N0.setVisibility(0);
                this.I0.setVisibility(0);
                this.H0.setLayoutParams(qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                if (this.Z != null) {
                    TL_account.Password password2 = this.K;
                    if (password2 != null && !TextUtils.isEmpty(password2.hint)) {
                        this.Z[0].setHint(this.K.hint);
                        return;
                    } else {
                        this.Z[0].setHint(jb6.M0(2131748483, null));
                        return;
                    }
                }
                return;
            }
            imageView.setVisibility(8);
            this.K0.setVisibility(8);
            this.L0.setVisibility(8);
            this.M0.setVisibility(8);
            this.a0[0].setVisibility(8);
            this.M.setVisibility(8);
            this.N0.setVisibility(8);
            this.I0.setVisibility(8);
            this.H0.setVisibility(8);
            this.G0.setVisibility(0);
        }
    }

    public final void W0() {
        int L;
        int L2;
        boolean[] zArr = {true};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(jb6.M0(2131747564, null), new cz6(this, zArr, (byte) 8));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        String M0 = jb6.M0(2131689472, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        boolean z = this.w0;
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.F;
        if (z && this.G == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypeAddress)) {
            heVar.U = jb6.M0(2131747326, null);
        } else if (z && this.G == null && (tL_secureRequiredType.type instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
            heVar.U = jb6.M0(2131747319, null);
        } else {
            heVar.U = jb6.M0(2131747323, null);
        }
        if (!this.w0 && this.G != null) {
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            oh2 oh2Var = new oh2(getParentActivity(), 1);
            fg0 L0 = cmb.L0(false);
            wmb M = anb.M(cmb.h6);
            oh2Var.setBackground(L0);
            anb.j(oh2Var, L0, null, M, null);
            TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                oh2Var.e(jb6.M0(2131747324, null), "", true, false, false);
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                oh2Var.e(jb6.M0(2131747322, null), "", true, false, false);
            }
            if (jb6.a0) {
                L = gm.L(16.0f);
            } else {
                L = gm.L(8.0f);
            }
            if (jb6.a0) {
                L2 = gm.L(8.0f);
            } else {
                L2 = gm.L(16.0f);
            }
            oh2Var.setPadding(L, 0, L2, 0);
            frameLayout.addView(oh2Var, qoe.e(-1, 48, 51));
            oh2Var.setOnClickListener(new gf(zArr, (byte) 11));
            alertDialog$Builder.n(frameLayout);
        }
        showDialog(heVar);
    }

    public final void W1(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz7.W1(int):void");
    }

    public final void X0(Context context) {
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        String str3;
        int i4;
        String str4;
        this.Z0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.Z0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        njb njbVar = new njb(context);
        this.q0 = njbVar;
        int i5 = cmb.a7;
        anb.Z(njbVar, context, 2131231235, i5);
        this.q0.setPadding(0, gm.L(7.0f), 0, 0);
        int i6 = -1;
        this.d0.addView(this.q0, qoe.o(-1, -2));
        T0(true);
        TLRPC.TL_secureRequiredType tL_secureRequiredType = this.G;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.F;
        ylb ylbVar = null;
        if (tL_secureRequiredType != null) {
            jf5 jf5Var = new jf5(context);
            this.k0 = jf5Var;
            if (this.w0) {
                jf5Var.setText(jb6.M0(2131747309, null));
            } else {
                jf5Var.setText(jb6.M0(2131747208, null));
            }
            jf5 jf5Var2 = this.k0;
            i = cmb.c6;
            anb.h(i, null, jf5Var2);
            this.d0.addView(this.k0, qoe.o(-1, -2));
            LinearLayout linearLayout = new LinearLayout(context);
            this.f0 = linearLayout;
            linearLayout.setOrientation(1);
            this.d0.addView(this.f0, qoe.o(-1, -2));
            ijb ijbVar = new ijb(context);
            this.V = ijbVar;
            fg0 L0 = cmb.L0(true);
            wmb M = anb.M(i);
            int i7 = cmb.h6;
            wmb M2 = anb.M(i7);
            ijbVar.setBackground(L0);
            anb.j(ijbVar, L0, M, M2, null);
            this.d0.addView(this.V, qoe.o(-1, -2));
            this.V.setOnClickListener(new oy7(this, (byte) 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.g0 = linearLayout2;
            linearLayout2.setOrientation(1);
            this.d0.addView(this.g0, qoe.o(-1, -2));
            boolean z = this.G.selfie_required;
            ijb ijbVar2 = new ijb(context);
            this.W = ijbVar2;
            fg0 L02 = cmb.L0(true);
            wmb M3 = anb.M(i);
            wmb M4 = anb.M(i7);
            ijbVar2.setBackground(L02);
            anb.j(ijbVar2, L02, M3, M4, null);
            this.W.a(jb6.M0(2131747205, null), jb6.M0(2131747204, null), z);
            this.d0.addView(this.W, qoe.o(-1, -2));
            this.W.setOnClickListener(new oy7(this, (byte) 2));
            if (this.G.selfie_required) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                this.h0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.d0.addView(this.h0, qoe.o(-1, -2));
                ijb ijbVar3 = new ijb(context);
                this.X = ijbVar3;
                fg0 L03 = cmb.L0(true);
                wmb M5 = anb.M(i);
                wmb M6 = anb.M(i7);
                ijbVar3.setBackground(L03);
                anb.j(ijbVar3, L03, M5, M6, null);
                this.X.a(jb6.M0(2131747196, null), jb6.M0(2131747195, null), tL_secureRequiredType2.translation_required);
                this.d0.addView(this.X, qoe.o(-1, -2));
                this.X.setOnClickListener(new oy7(this, (byte) 3));
            }
            njb njbVar2 = new njb(context);
            this.o0 = njbVar2;
            anb.Z(njbVar2, context, 2131231233, i5);
            this.o0.setText(jb6.M0(2131747222, null));
            this.d0.addView(this.o0, qoe.o(-1, -2));
            if (this.G.translation_required) {
                jf5 jf5Var3 = new jf5(context);
                this.k0 = jf5Var3;
                jf5Var3.setText(jb6.M0(2131747188, null));
                anb.h(i, null, this.k0);
                this.d0.addView(this.k0, qoe.o(-1, -2));
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.i0 = linearLayout4;
                linearLayout4.setOrientation(1);
                this.d0.addView(this.i0, qoe.o(-1, -2));
                vkb vkbVar = new vkb(context);
                this.Y = vkbVar;
                fg0 L04 = cmb.L0(true);
                wmb M7 = anb.M(i);
                wmb M8 = anb.M(i7);
                vkbVar.setBackground(L04);
                anb.j(vkbVar, L04, M7, M8, null);
                this.d0.addView(this.Y, qoe.o(-1, -2));
                this.Y.setOnClickListener(new oy7(this, (byte) 4));
                njb njbVar3 = new njb(context);
                this.p0 = njbVar3;
                anb.Z(njbVar3, context, 2131231233, i5);
                if (this.c != 0) {
                    String M0 = jb6.M0(2131747336, null);
                    this.B1 = M0;
                    str4 = M0;
                } else {
                    TLRPC.SecureValueType secureValueType = this.G.type;
                    if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                        String M02 = jb6.M0(2131747346, null);
                        this.B1 = M02;
                        str4 = M02;
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                        String M03 = jb6.M0(2131747349, null);
                        this.B1 = M03;
                        str4 = M03;
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                        String M04 = jb6.M0(2131747351, null);
                        this.B1 = M04;
                        str4 = M04;
                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                        String M05 = jb6.M0(2131747352, null);
                        this.B1 = M05;
                        str4 = M05;
                    } else {
                        this.B1 = "";
                        str4 = "";
                    }
                }
                HashMap hashMap = this.y1;
                String str5 = str4;
                if (hashMap != null) {
                    String str6 = (String) hashMap.get("translation_all");
                    str5 = str4;
                    if (str6 != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str6);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) this.B1);
                        spannableStringBuilder.setSpan(new do4(cmb.o7, null), 0, str6.length(), 33);
                        this.z1.put("translation_all", "");
                        str5 = spannableStringBuilder;
                    }
                }
                this.p0.setText(str5);
                this.d0.addView(this.p0, qoe.o(-1, -2));
            }
        } else {
            vkb vkbVar2 = new vkb(context);
            this.s0 = vkbVar2;
            fg0 L05 = cmb.L0(true);
            i = cmb.c6;
            wmb M9 = anb.M(i);
            wmb M10 = anb.M(cmb.h6);
            vkbVar2.setBackground(L05);
            anb.j(vkbVar2, L05, M9, M10, null);
            this.s0.b(jb6.M0(2131747203, null), false);
            this.d0.addView(this.s0, qoe.o(-1, -2));
            this.s0.setOnClickListener(new oy7(this, (byte) 5));
            njb njbVar4 = new njb(context);
            this.o0 = njbVar4;
            anb.Z(njbVar4, context, 2131231233, i5);
            this.o0.setText(jb6.M0(2131747202, null));
            this.d0.addView(this.o0, qoe.o(-1, -2));
        }
        jf5 jf5Var4 = new jf5(context);
        this.k0 = jf5Var4;
        if (this.w0) {
            jf5Var4.setText(jb6.M0(2131747311, null));
        } else {
            jf5Var4.setText(jb6.M0(2131747225, null));
        }
        anb.h(i, null, this.k0);
        this.d0.addView(this.k0, qoe.o(-1, -2));
        int i8 = 7;
        if (this.G != null) {
            i2 = 9;
        } else {
            i2 = 7;
        }
        this.Z = new EditTextBoldCursor[i2];
        int i9 = 0;
        while (true) {
            HashMap hashMap2 = this.t1;
            if (i9 < i2) {
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.Z[i9] = editTextBoldCursor;
                wy7 wy7Var = new wy7(context, editTextBoldCursor, (byte) 1);
                wy7Var.setWillNotDraw(false);
                this.d0.addView(wy7Var, qoe.o(i6, 64));
                int i10 = cmb.c6;
                anb.h(i10, ylbVar, wy7Var);
                if (i9 == i2 - 1) {
                    View view = new View(context);
                    this.T = view;
                    anb.h(i10, ylbVar, view);
                    this.d0.addView(this.T, qoe.o(i6, 6));
                }
                if (this.w0 && this.G != null && i9 < i8) {
                    wy7Var.setVisibility(8);
                    View view2 = this.T;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                this.Z[i9].setTag(Integer.valueOf(i9));
                this.Z[i9].setSupportRtlHint(true);
                this.Z[i9].setTextSize(1, 16.0f);
                anb.A(this.Z[i9], cmb.G6, null);
                EditTextBoldCursor editTextBoldCursor2 = this.Z[i9];
                int i11 = cmb.F6;
                anb.X(editTextBoldCursor2, i11, null);
                anb.z(this.Z[i9], cmb.K6, null);
                this.Z[i9].setTransformHintToHeader(true);
                this.Z[i9].setBackgroundDrawable(null);
                anb.v(this.Z[i9], i11, null);
                this.Z[i9].setCursorSize(gm.L(20.0f));
                this.Z[i9].setCursorWidth(1.5f);
                anb.F(this.Z[i9], cmb.j6, cmb.k6, cmb.o7, null);
                if (i9 != 5 && i9 != 6) {
                    if (i9 != 3 && i9 != 8) {
                        EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
                        if (i9 == 4) {
                            editTextBoldCursorArr[i9].setOnTouchListener(new py7(this, (byte) 1));
                            this.Z[i9].setInputType(0);
                            this.Z[i9].setFocusable(false);
                        } else {
                            editTextBoldCursorArr[i9].setInputType(16385);
                            this.Z[i9].setImeOptions(268435461);
                        }
                    } else {
                        this.Z[i9].setOnTouchListener(new f8(this, context, (byte) 6));
                        this.Z[i9].setInputType(0);
                        this.Z[i9].setFocusable(false);
                    }
                } else {
                    this.Z[i9].setOnTouchListener(new py7(this, (byte) 0));
                    this.Z[i9].setInputType(0);
                }
                HashMap hashMap3 = this.u1;
                switch (i9) {
                    case 0:
                        boolean z2 = tL_secureRequiredType2.native_names;
                        EditTextBoldCursor[] editTextBoldCursorArr2 = this.Z;
                        if (z2) {
                            editTextBoldCursorArr2[i9].setHintText(jb6.M0(2131747234, null));
                        } else {
                            editTextBoldCursorArr2[i9].setHintText(jb6.M0(2131747237, null));
                        }
                        str2 = "first_name";
                        break;
                    case 1:
                        boolean z3 = tL_secureRequiredType2.native_names;
                        EditTextBoldCursor[] editTextBoldCursorArr3 = this.Z;
                        if (z3) {
                            editTextBoldCursorArr3[i9].setHintText(jb6.M0(2131747238, null));
                        } else {
                            editTextBoldCursorArr3[i9].setHintText(jb6.M0(2131747240, null));
                        }
                        str2 = "middle_name";
                        break;
                    case 2:
                        boolean z4 = tL_secureRequiredType2.native_names;
                        EditTextBoldCursor[] editTextBoldCursorArr4 = this.Z;
                        if (z4) {
                            editTextBoldCursorArr4[i9].setHintText(jb6.M0(2131747189, null));
                        } else {
                            editTextBoldCursorArr4[i9].setHintText(jb6.M0(2131747191, null));
                        }
                        str2 = "last_name";
                        break;
                    case 3:
                        this.Z[i9].setHintText(jb6.M0(2131747330, null));
                        str2 = "birth_date";
                        break;
                    case 4:
                        this.Z[i9].setHintText(jb6.M0(2131747299, null));
                        str2 = "gender";
                        break;
                    case 5:
                        this.Z[i9].setHintText(jb6.M0(2131747329, null));
                        str2 = "country_code";
                        break;
                    case 6:
                        this.Z[i9].setHintText(jb6.M0(2131747207, null));
                        str2 = "residence_country_code";
                        break;
                    case 7:
                        this.Z[i9].setHintText(jb6.M0(2131747310, null));
                        str3 = "document_no";
                        str2 = str3;
                        hashMap2 = hashMap3;
                        break;
                    case 8:
                        this.Z[i9].setHintText(jb6.M0(2131747303, null));
                        str3 = "expiry_date";
                        str2 = str3;
                        hashMap2 = hashMap3;
                        break;
                    default:
                        i9++;
                        i8 = 7;
                        i6 = -1;
                        ylbVar = null;
                }
                M1(hashMap2, this.Z[i9], str2);
                EditTextBoldCursor editTextBoldCursor3 = this.Z[i9];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                if (i9 != 0 && i9 != 2 && i9 != 1) {
                    this.Z[i9].addTextChangedListener(new zy7(this, editTextBoldCursor, str2, hashMap2));
                } else {
                    this.Z[i9].addTextChangedListener(new yy7(this, editTextBoldCursor, str2, (byte) 1));
                }
                this.Z[i9].setPadding(0, 0, 0, 0);
                EditTextBoldCursor editTextBoldCursor4 = this.Z[i9];
                if (jb6.a0) {
                    i4 = 5;
                } else {
                    i4 = 3;
                }
                editTextBoldCursor4.setGravity(i4 | 16);
                wy7Var.addView(this.Z[i9], qoe.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                this.Z[i9].setOnEditorActionListener(new my7(this, (byte) 1));
                i9++;
                i8 = 7;
                i6 = -1;
                ylbVar = null;
            } else {
                bba bbaVar = new bba(context, (hg9) null);
                this.n0 = bbaVar;
                this.d0.addView(bbaVar, qoe.o(-1, -2));
                jf5 jf5Var5 = new jf5(context);
                this.k0 = jf5Var5;
                anb.h(cmb.c6, null, jf5Var5);
                this.d0.addView(this.k0, qoe.o(-1, -2));
                this.b0 = new EditTextBoldCursor[3];
                int i12 = 0;
                for (int i13 = 3; i12 < i13; i13 = 3) {
                    EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
                    this.b0[i12] = editTextBoldCursor5;
                    wy7 wy7Var2 = new wy7(context, editTextBoldCursor5, (byte) 2);
                    wy7Var2.setWillNotDraw(false);
                    this.d0.addView(wy7Var2, qoe.o(-1, 64));
                    int i14 = cmb.c6;
                    anb.h(i14, null, wy7Var2);
                    if (i12 == 2) {
                        View view3 = new View(context);
                        this.U = view3;
                        anb.h(i14, null, view3);
                        this.d0.addView(this.U, qoe.o(-1, 6));
                    }
                    this.b0[i12].setTag(Integer.valueOf(i12));
                    this.b0[i12].setSupportRtlHint(true);
                    this.b0[i12].setTextSize(1, 16.0f);
                    anb.A(this.b0[i12], cmb.G6, null);
                    EditTextBoldCursor editTextBoldCursor6 = this.b0[i12];
                    int i15 = cmb.F6;
                    anb.X(editTextBoldCursor6, i15, null);
                    anb.z(this.b0[i12], cmb.K6, null);
                    this.b0[i12].setTransformHintToHeader(true);
                    this.b0[i12].setBackgroundDrawable(null);
                    anb.v(this.b0[i12], i15, null);
                    this.b0[i12].setCursorSize(gm.L(20.0f));
                    this.b0[i12].setCursorWidth(1.5f);
                    anb.F(this.b0[i12], cmb.j6, cmb.k6, cmb.o7, null);
                    this.b0[i12].setInputType(16385);
                    this.b0[i12].setImeOptions(268435461);
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2) {
                                str = "last_name_native";
                            } else {
                                i12++;
                            }
                        } else {
                            str = "middle_name_native";
                        }
                    } else {
                        str = "first_name_native";
                    }
                    M1(hashMap2, this.b0[i12], str);
                    EditTextBoldCursor editTextBoldCursor7 = this.b0[i12];
                    editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                    if (i12 == 0 || i12 == 2 || i12 == 1) {
                        this.b0[i12].addTextChangedListener(new yy7(this, editTextBoldCursor5, str, (byte) 2));
                    }
                    this.b0[i12].setPadding(0, 0, 0, 0);
                    EditTextBoldCursor editTextBoldCursor8 = this.b0[i12];
                    if (jb6.a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    editTextBoldCursor8.setGravity(i3 | 16);
                    wy7Var2.addView(this.b0[i12], qoe.d(-1, -1.0f, 51, 21.0f, 0.0f, 21.0f, 0.0f));
                    this.b0[i12].setOnEditorActionListener(new my7(this, (byte) 2));
                    i12++;
                }
                njb njbVar5 = new njb(context);
                this.r0 = njbVar5;
                this.d0.addView(njbVar5, qoe.o(-1, -2));
                int i16 = (this.c > 0L ? 1 : (this.c == 0L ? 0 : -1));
                TLRPC.TL_secureValue tL_secureValue = this.J;
                if (((i16 != 0 || this.G == null) && this.I != null && !this.w0) || tL_secureValue != null) {
                    if (tL_secureValue != null) {
                        K0(tL_secureValue.files);
                        TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                        if (secureFile instanceof TLRPC.TL_secureFile) {
                            J0((TLRPC.TL_secureFile) secureFile, 2);
                        }
                        TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                        if (secureFile2 instanceof TLRPC.TL_secureFile) {
                            J0((TLRPC.TL_secureFile) secureFile2, 3);
                        }
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            J0((TLRPC.TL_secureFile) secureFile3, 1);
                        }
                        M0(tL_secureValue.translation);
                    }
                    vkb vkbVar3 = new vkb(context);
                    anb.X(vkbVar3.getTextView(), cmb.o7, null);
                    fg0 L06 = cmb.L0(true);
                    wmb M11 = anb.M(cmb.c6);
                    wmb M12 = anb.M(cmb.h6);
                    vkbVar3.setBackground(L06);
                    anb.j(vkbVar3, L06, M11, M12, null);
                    if (this.G == null) {
                        vkbVar3.b(jb6.M0(2131747320, null), false);
                    } else {
                        vkbVar3.b(jb6.M0(2131747325, null), false);
                    }
                    this.d0.addView(vkbVar3, qoe.o(-1, -2));
                    vkbVar3.setOnClickListener(new oy7(this, (byte) 1));
                    njb njbVar6 = this.r0;
                    int i17 = cmb.a7;
                    anb.Z(njbVar6, context, 2131231233, i17);
                    bba bbaVar2 = new bba(context, (hg9) null);
                    this.m0 = bbaVar2;
                    anb.Z(bbaVar2, context, 2131231234, i17);
                    this.d0.addView(this.m0, qoe.o(-1, -2));
                } else {
                    anb.Z(this.r0, context, 2131231234, cmb.a7);
                }
                T1();
                R0(false);
                return;
            }
        }
    }

    public final void Y0(android.content.Context r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz7.Y0(android.content.Context):void");
    }

    public final void Z0(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        ViewGroup frameLayout;
        this.actionBar.setTitle(jb6.M0(2131747221, null));
        this.Z0 = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                this.V0.add(0, split[2]);
                this.W0.put(split[2], split[0]);
                this.X0.put(split[0], split[2]);
                if (split.length > 3) {
                    this.Y0.put(split[0], split[3]);
                }
                this.Z0.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        Collections.sort(this.V0, new sa((byte) 9));
        String str3 = z8c.h(this.currentAccount).f().phone;
        vkb vkbVar = new vkb(context);
        anb.X(vkbVar.getTextView(), cmb.p6, null);
        fg0 L0 = cmb.L0(true);
        int i = cmb.c6;
        wmb M = anb.M(i);
        wmb M2 = anb.M(cmb.h6);
        vkbVar.setBackground(L0);
        anb.j(vkbVar, L0, M, M2, null);
        vkbVar.b(jb6.a0("PassportPhoneUseSame", null, 2131747217, r58.f().e("+" + str3)), false);
        this.d0.addView(vkbVar, qoe.o(-1, -2));
        vkbVar.setOnClickListener(new oy7(this, (byte) 16));
        njb njbVar = new njb(context);
        this.o0 = njbVar;
        anb.Z(njbVar, context, 2131231234, cmb.a7);
        this.o0.setText(jb6.M0(2131747215, null));
        this.d0.addView(this.o0, qoe.o(-1, -2));
        jf5 jf5Var = new jf5(context);
        this.k0 = jf5Var;
        jf5Var.setText(jb6.M0(2131747218, null));
        anb.h(i, null, this.k0);
        this.d0.addView(this.k0, qoe.o(-1, -2));
        this.Z = new EditTextBoldCursor[3];
        for (int i2 = 0; i2 < 3; i2++) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
            if (i2 == 2) {
                editTextBoldCursorArr[i2] = new dg5(context);
            } else {
                editTextBoldCursorArr[i2] = new EditTextBoldCursor(context);
            }
            if (i2 == 1) {
                frameLayout = hg9.i(context, 0);
                this.d0.addView(frameLayout, qoe.o(-1, 50));
                anb.h(cmb.c6, null, frameLayout);
            } else if (i2 == 2) {
                frameLayout = (ViewGroup) this.Z[1].getParent();
            } else {
                frameLayout = new FrameLayout(context);
                this.d0.addView(frameLayout, qoe.o(-1, 50));
                anb.h(cmb.c6, null, frameLayout);
            }
            this.Z[i2].setTag(Integer.valueOf(i2));
            this.Z[i2].setTextSize(1, 16.0f);
            anb.D(this.Z[i2], cmb.G6, null);
            EditTextBoldCursor editTextBoldCursor = this.Z[i2];
            int i3 = cmb.F6;
            anb.X(editTextBoldCursor, i3, null);
            this.Z[i2].setBackgroundDrawable(null);
            anb.v(this.Z[i2], i3, null);
            this.Z[i2].setCursorSize(gm.L(20.0f));
            this.Z[i2].setCursorWidth(1.5f);
            EditTextBoldCursor[] editTextBoldCursorArr2 = this.Z;
            if (i2 == 0) {
                editTextBoldCursorArr2[i2].setOnTouchListener(new py7(this, (byte) 3));
                this.Z[i2].setText(jb6.M0(2131752071, null));
                this.Z[i2].setInputType(0);
                this.Z[i2].setFocusable(false);
            } else {
                editTextBoldCursorArr2[i2].setInputType(3);
                EditTextBoldCursor[] editTextBoldCursorArr3 = this.Z;
                if (i2 == 2) {
                    editTextBoldCursorArr3[i2].setImeOptions(268435462);
                } else {
                    editTextBoldCursorArr3[i2].setImeOptions(268435461);
                }
            }
            EditTextBoldCursor editTextBoldCursor2 = this.Z[i2];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            int i4 = 5;
            if (i2 == 1) {
                TextView textView = new TextView(context);
                this.x0 = textView;
                textView.setText("+");
                anb.X(this.x0, i3, null);
                this.x0.setTextSize(1, 16.0f);
                frameLayout.addView(this.x0, qoe.k(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                this.Z[i2].setPadding(gm.L(10.0f), 0, 0, 0);
                this.Z[i2].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                this.Z[i2].setGravity(19);
                frameLayout.addView(this.Z[i2], qoe.k(0.0f, 12.0f, 16.0f, 6.0f, 55, -2));
                this.Z[i2].addTextChangedListener(new jz7(this, (byte) 1));
            } else {
                EditTextBoldCursor[] editTextBoldCursorArr4 = this.Z;
                if (i2 == 2) {
                    editTextBoldCursorArr4[i2].setPadding(0, 0, 0, 0);
                    this.Z[i2].setGravity(19);
                    this.Z[i2].setHintText(null);
                    this.Z[i2].setHint(jb6.M0(2131747105, null));
                    frameLayout.addView(this.Z[i2], qoe.k(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                    this.Z[i2].addTextChangedListener(new sk2(this, (byte) 3));
                } else {
                    editTextBoldCursorArr4[i2].setPadding(0, 0, 0, gm.L(6.0f));
                    EditTextBoldCursor editTextBoldCursor3 = this.Z[i2];
                    if (!jb6.a0) {
                        i4 = 3;
                    }
                    editTextBoldCursor3.setGravity(i4);
                    frameLayout.addView(this.Z[i2], qoe.d(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                }
            }
            this.Z[i2].setOnEditorActionListener(new my7(this, (byte) 0));
            if (i2 == 2) {
                this.Z[i2].setOnKeyListener(new w6(this, (byte) 4));
            }
            if (i2 == 0) {
                View view = new View(context);
                this.l0.add(view);
                anb.h(cmb.c7, null, view);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
            }
        }
        try {
            telephonyManager = (TelephonyManager) a.b.getSystemService("phone");
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        if (telephonyManager != null) {
            str = telephonyManager.getSimCountryIso().toUpperCase();
            if (str != null && (str2 = (String) this.Z0.get(str)) != null && this.V0.indexOf(str2) != -1) {
                this.Z[1].setText((CharSequence) this.W0.get(str2));
            }
            njb njbVar2 = new njb(context);
            this.o0 = njbVar2;
            anb.Z(njbVar2, context, 2131231234, cmb.a7);
            this.o0.setText(jb6.M0(2131747219, null));
            this.d0.addView(this.o0, qoe.o(-1, -2));
        }
        str = null;
        if (str != null) {
            this.Z[1].setText((CharSequence) this.W0.get(str2));
        }
        njb njbVar22 = new njb(context);
        this.o0 = njbVar22;
        anb.Z(njbVar22, context, 2131231234, cmb.a7);
        this.o0.setText(jb6.M0(2131747219, null));
        this.d0.addView(this.o0, qoe.o(-1, -2));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.D7));
        hashSet.add(Integer.valueOf(cmb.C7));
        hashSet.add(Integer.valueOf(cmb.Ci));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final byte[] b1(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32 || bArr2 == null || bArr2.length != 32) {
            return null;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(this.f1, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[16];
        System.arraycopy(this.f1, 32, bArr4, 0, 16);
        byte[] bArr5 = new byte[32];
        System.arraycopy(this.d1, 0, bArr5, 0, 32);
        Utilities.b(bArr5, bArr3, bArr4, 0, 32, 0, 0);
        if (!S0(bArr5, null)) {
            return null;
        }
        byte[] r = Utilities.r(bArr5, bArr2);
        byte[] bArr6 = new byte[32];
        System.arraycopy(r, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(r, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(bArr, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        return bArr8;
    }

    public final void c1(final TLRPC.TL_secureRequiredType tL_secureRequiredType, final TLRPC.TL_secureRequiredType tL_secureRequiredType2, final ArrayList arrayList, final boolean z, final ny7 ny7Var, final qy7 qy7Var, final boolean z2) {
        if (tL_secureRequiredType == null) {
            return;
        }
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        if (z2 && tL_secureRequiredType2 != null) {
            deletesecurevalue.types.add(tL_secureRequiredType2.type);
        } else {
            if (z) {
                deletesecurevalue.types.add(tL_secureRequiredType.type);
            }
            if (tL_secureRequiredType2 != null) {
                deletesecurevalue.types.add(tL_secureRequiredType2.type);
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                gm.c3(new g97(xz7.this, tL_error, qy7Var, z2, tL_secureRequiredType2, tL_secureRequiredType, z, arrayList, ny7Var));
            }
        });
    }

    @Override
    public final android.view.View createView(android.content.Context r38) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz7.createView(android.content.Context):android.view.View");
    }

    public final sm2 d1(byte[] bArr) {
        byte[] j1 = j1();
        int nextInt = Utilities.b.nextInt(208) + 32;
        while ((bArr.length + nextInt) % 16 != 0) {
            nextInt++;
        }
        byte[] bArr2 = new byte[nextInt];
        Utilities.b.nextBytes(bArr2);
        bArr2[0] = (byte) nextInt;
        int length = nextInt + bArr.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, nextInt);
        System.arraycopy(bArr, 0, bArr3, nextInt, bArr.length);
        byte[] o = Utilities.o(length, bArr3);
        byte[] r = Utilities.r(j1, o);
        byte[] bArr4 = new byte[32];
        System.arraycopy(r, 0, bArr4, 0, 32);
        byte[] bArr5 = new byte[16];
        System.arraycopy(r, 32, bArr5, 0, 16);
        Utilities.b(bArr3, bArr4, bArr5, 0, length, 0, 1);
        byte[] bArr6 = new byte[32];
        System.arraycopy(this.f1, 0, bArr6, 0, 32);
        byte[] bArr7 = new byte[16];
        System.arraycopy(this.f1, 32, bArr7, 0, 16);
        byte[] bArr8 = new byte[32];
        System.arraycopy(this.d1, 0, bArr8, 0, 32);
        Utilities.b(bArr8, bArr6, bArr7, 0, 32, 0, 0);
        byte[] r2 = Utilities.r(bArr8, o);
        byte[] bArr9 = new byte[32];
        System.arraycopy(r2, 0, bArr9, 0, 32);
        byte[] bArr10 = new byte[16];
        System.arraycopy(r2, 32, bArr10, 0, 16);
        byte[] bArr11 = new byte[32];
        System.arraycopy(j1, 0, bArr11, 0, 32);
        Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 1);
        sm2 sm2Var = new sm2((byte) 11, false);
        sm2Var.d = bArr3;
        sm2Var.b = bArr11;
        sm2Var.e = o;
        sm2Var.c = j1;
        sm2Var.f = new yw9(bArr4, bArr5);
        return sm2Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        EditTextBoldCursor editTextBoldCursor;
        vz7 vz7Var;
        r7 r7Var;
        if (i == nm7.U1) {
            String str = (String) objArr[0];
            HashMap hashMap = this.p1;
            xw9 xw9Var = (xw9) hashMap.get(str);
            if (xw9Var != null) {
                xw9Var.d = (TLRPC.TL_inputFile) objArr[1];
                hashMap.remove(str);
                if (hashMap.isEmpty() && (r7Var = this.M) != null) {
                    r7Var.setEnabled(true);
                    this.M.setAlpha(1.0f);
                }
                HashMap hashMap2 = this.o1;
                if (hashMap2 != null && (vz7Var = (vz7) hashMap2.get(xw9Var)) != null) {
                    vz7Var.a(true);
                }
                HashMap hashMap3 = this.z1;
                if (hashMap3 != null && hashMap3.containsKey("error_document_all")) {
                    hashMap3.remove("error_document_all");
                    T0(false);
                }
                byte b = xw9Var.i;
                if (b == 0) {
                    if (this.o0 != null && !TextUtils.isEmpty(this.A1)) {
                        this.o0.setText(this.A1);
                    }
                    hashMap3.remove("files_all");
                } else if (b == 4) {
                    if (this.p0 != null && !TextUtils.isEmpty(this.B1)) {
                        this.p0.setText(this.B1);
                    }
                    hashMap3.remove("translation_all");
                }
            }
        } else if (i != nm7.V1 && i == nm7.p0) {
            if (objArr != null && objArr.length > 0) {
                Object obj = objArr[7];
                if (obj != null && (editTextBoldCursor = this.Z[0]) != null) {
                    editTextBoldCursor.setText((String) obj);
                }
                if (objArr[6] == null) {
                    TL_account.TL_password tL_password = new TL_account.TL_password();
                    this.K = tL_password;
                    tL_password.current_algo = (TLRPC.PasswordKdfAlgo) objArr[1];
                    tL_password.new_secure_algo = (TLRPC.SecurePasswordKdfAlgo) objArr[2];
                    tL_password.secure_random = (byte[]) objArr[3];
                    tL_password.has_recovery = !TextUtils.isEmpty((String) objArr[4]);
                    TL_account.Password password = this.K;
                    password.hint = (String) objArr[5];
                    password.srp_id = -1L;
                    byte[] bArr = new byte[256];
                    password.srp_B = bArr;
                    Utilities.b.nextBytes(bArr);
                    EditTextBoldCursor editTextBoldCursor2 = this.Z[0];
                    if (editTextBoldCursor2 != null && editTextBoldCursor2.length() > 0) {
                        this.O0 = (byte) 2;
                    }
                }
            } else {
                this.K = null;
                z1();
            }
            V1();
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        i22 i22Var = this.S0;
        if (i22Var != null && this.visibleDialog == i22Var) {
            i22Var.d2.b0(false);
            this.S0.H();
            this.S0.d2.f0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.S0 && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    public final void e1(Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode, boolean z) {
        bundle.putString("phoneHash", tL_auth_sentCode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = tL_auth_sentCode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        }
        int i = tL_auth_sentCode.timeout;
        if (i == 0) {
            i = 60;
            tL_auth_sentCode.timeout = 60;
        }
        bundle.putInt("timeout", i * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            N1(bundle, 2, z);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", tL_auth_sentCode.type.pattern);
            N1(bundle, 1, z);
        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSms) {
            bundle.putInt("type", 2);
            bundle.putInt("length", tL_auth_sentCode.type.length);
            N1(bundle, 0, z);
        }
    }

    public final String f1() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
            if (i >= editTextBoldCursorArr.length) {
                break;
            }
            sb.append((CharSequence) editTextBoldCursorArr[i].getText());
            sb.append(",");
            i++;
        }
        if (this.b0 != null) {
            int i2 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.b0;
                if (i2 >= editTextBoldCursorArr2.length) {
                    break;
                }
                sb.append((CharSequence) editTextBoldCursorArr2[i2].getText());
                sb.append(",");
                i2++;
            }
        }
        ArrayList arrayList = this.j1;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append(((xw9) arrayList.get(i3)).b.id);
        }
        xw9 xw9Var = this.m1;
        if (xw9Var != null) {
            sb.append(xw9Var.b.id);
        }
        xw9 xw9Var2 = this.n1;
        if (xw9Var2 != null) {
            sb.append(xw9Var2.b.id);
        }
        xw9 xw9Var3 = this.k1;
        if (xw9Var3 != null) {
            sb.append(xw9Var3.b.id);
        }
        ArrayList arrayList2 = this.l1;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            sb.append(((xw9) arrayList2.get(i4)).b.id);
        }
        return sb.toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.c0, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r8));
        arrayList.add(new cnb(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.B8));
        arrayList.add(new cnb(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C8));
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.l0;
            if (i2 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new cnb((View) arrayList2.get(i2), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c7));
            i2++;
        }
        for (Map.Entry entry : this.o1.entrySet()) {
            arrayList.add(new cnb((vz7) entry.getValue(), 268435456, new Class[]{vz7.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        }
        int i3 = cmb.c6;
        arrayList.add(new cnb(this.d0, 268435456, new Class[]{ijb.class}, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.d0, 268435456, new Class[]{vkb.class}, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        arrayList.add(new cnb(this.d0, 268435456, new Class[]{wz7.class}, (Paint) null, (Drawable[]) null, (bnb) null, i3));
        if (this.Z != null) {
            int i4 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.Z;
                if (i4 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new cnb((View) editTextBoldCursorArr[i4].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
                arrayList.add(new cnb(this.Z[i4], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.K6));
                arrayList.add(new cnb(this.Z[i4], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
                arrayList.add(new cnb(this.Z[i4], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
                arrayList.add(new cnb(this.Z[i4], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.o7));
                i4++;
            }
        } else {
            arrayList.add(new cnb((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
            arrayList.add(new cnb((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.G6));
            arrayList.add(new cnb((View) null, 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.K6));
            arrayList.add(new cnb((View) null, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
            arrayList.add(new cnb((View) null, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
            arrayList.add(new cnb((View) null, 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.o7));
        }
        if (this.b0 != null) {
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.b0;
                if (i >= editTextBoldCursorArr2.length) {
                    break;
                }
                arrayList.add(new cnb((View) editTextBoldCursorArr2[i].getParent(), 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
                arrayList.add(new cnb(this.b0[i], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.K6));
                arrayList.add(new cnb(this.b0[i], 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
                arrayList.add(new cnb(this.b0[i], 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
                arrayList.add(new cnb(this.b0[i], 2080, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.o7));
                i++;
            }
        }
        arrayList.add(new cnb(this.G0, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(this.R, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.hi));
        arrayList.add(new cnb(this.R, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ii));
        return arrayList;
    }

    public final TLRPC.TL_secureValue l1(TLRPC.TL_secureRequiredType tL_secureRequiredType, boolean z) {
        String[] strArr;
        if (tL_secureRequiredType != null) {
            int size = this.E.values.size();
            for (int i = 0; i < size; i++) {
                TLRPC.TL_secureValue tL_secureValue = this.E.values.get(i);
                if (tL_secureRequiredType.type.getClass() == tL_secureValue.type.getClass()) {
                    if (z) {
                        if (!tL_secureRequiredType.selfie_required || (tL_secureValue.selfie instanceof TLRPC.TL_secureFile)) {
                            if (!tL_secureRequiredType.translation_required || !tL_secureValue.translation.isEmpty()) {
                                if (!n1(tL_secureRequiredType.type) || !tL_secureValue.files.isEmpty()) {
                                    if (!o1(tL_secureRequiredType.type) || (tL_secureValue.front_side instanceof TLRPC.TL_secureFile)) {
                                        TLRPC.SecureValueType secureValueType = tL_secureRequiredType.type;
                                        if ((!(secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) && !(secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard)) || (tL_secureValue.reverse_side instanceof TLRPC.TL_secureFile)) {
                                            if (!(secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails)) {
                                                if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                                    strArr = new String[]{"street_line1", "street_line2", "post_code", "city", "state", "country_code"};
                                                }
                                            } else {
                                                strArr = tL_secureRequiredType.native_names ? new String[]{"first_name_native", "last_name_native", "birth_date", "gender", "country_code", "residence_country_code"} : new String[]{"first_name", "last_name", "birth_date", "gender", "country_code", "residence_country_code"};
                                            }
                                            try {
                                                TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                                                JSONObject jSONObject = new JSONObject(a1(tL_secureData.data, b1(tL_secureData.secret, tL_secureData.data_hash), tL_secureValue.data.data_hash));
                                                for (int i2 = 0; i2 < strArr.length; i2++) {
                                                    if (!jSONObject.has(strArr[i2]) || TextUtils.isEmpty(jSONObject.getString(strArr[i2]))) {
                                                        return null;
                                                    }
                                                }
                                            } catch (Throwable unused) {
                                                return null;
                                            }
                                        } else {
                                            return null;
                                        }
                                    } else {
                                        return null;
                                    }
                                } else {
                                    return null;
                                }
                            } else {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    return tL_secureValue;
                }
            }
            return null;
        }
        return null;
    }

    public final boolean m1(Class cls) {
        int size = this.E.values.size();
        for (int i = 0; i < size; i++) {
            if (this.E.values.get(i).type.getClass() == cls) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i != 0 && i != 2) {
                if (i == 1) {
                    if (intent != null && intent.getData() != null) {
                        ArrayList arrayList = new ArrayList();
                        ?? obj = new Object();
                        obj.a = intent.getData();
                        arrayList.add(obj);
                        J1(arrayList);
                        return;
                    } else if (getParentActivity() != null) {
                        Toast.makeText(getParentActivity(), jb6.M0(2131743520, null), 0).show();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            V0();
            i22 i22Var = this.S0;
            if (i22Var != null) {
                i22Var.d2.j0(i, intent, this.R0);
            }
            this.R0 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        int i = this.b;
        if (i == 7) {
            if (z) {
                byte b = this.J1;
                kla[] klaVarArr = this.K1;
                klaVarArr[b].d(true);
                for (kla klaVar : klaVarArr) {
                    if (klaVar != null) {
                        klaVar.f();
                    }
                }
            }
        } else if (i != 0 && i != 5) {
            if (i == 1 || i == 2) {
                return !O0(z);
            }
        } else if (z) {
            N0(false);
        }
        return true;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        if (this.b == 3 && dialog == this.M1) {
            ArrayList arrayList = this.N1;
            if (!arrayList.isEmpty()) {
                getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.U1);
        nm7.f(this.currentAccount).b(this, nm7.V1);
        nm7.f(this.currentAccount).b(this, nm7.p0);
        nm7.f(this.currentAccount).b(this, nm7.r0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.U1);
        nm7.f(this.currentAccount).n(this, nm7.V1);
        nm7.f(this.currentAccount).n(this, nm7.p0);
        nm7.f(this.currentAccount).n(this, nm7.r0);
        int i = 0;
        N0(false);
        i22 i22Var = this.S0;
        if (i22Var != null) {
            i22Var.H();
            this.S0.e1();
        }
        if (this.b == 7) {
            while (true) {
                kla[] klaVarArr = this.K1;
                if (i >= klaVarArr.length) {
                    break;
                }
                kla klaVar = klaVarArr[i];
                if (klaVar != null) {
                    klaVar.f();
                }
                i++;
            }
            he heVar = this.L1;
            if (heVar != null) {
                try {
                    heVar.dismiss();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                this.L1 = null;
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        i22 i22Var = this.S0;
        if (i22Var != null) {
            i22Var.g1();
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        i22 i22Var;
        vkb vkbVar;
        int i2 = this.b;
        if ((i2 == 1 || i2 == 2) && (i22Var = this.S0) != null) {
            if (i == 17) {
                i22Var.d2.U(false);
            } else if (i == 21) {
                if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = jb6.M0(2131689472, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131747045, null);
                    alertDialog$Builder.g(jb6.M0(2131747033, null), new qy7(this, (byte) 0));
                    alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                    alertDialog$Builder.o();
                }
            } else if (i == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                I1(0);
            } else if (i == 22 && iArr != null && iArr.length > 0 && iArr[0] == 0 && (vkbVar = this.s0) != null) {
                vkbVar.callOnClick();
            }
        } else if (i2 == 3 && i == 6) {
            R1(false, this.F1, this.G1, this.H1, this.I1);
        }
    }

    @Override
    public final void onResume() {
        ViewGroup[] viewGroupArr;
        ViewGroup viewGroup;
        super.onResume();
        i22 i22Var = this.S0;
        if (i22Var != null) {
            i22Var.h1();
        }
        if (this.b == 5 && (viewGroupArr = this.a0) != null && (viewGroup = viewGroupArr[0]) != null && viewGroup.getVisibility() == 0) {
            this.Z[0].requestFocus();
            gm.E3(this.Z[0]);
            gm.d3(new ny7(this, (byte) 0), 200L);
        }
        gm.V2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        boolean z;
        try {
            ScrollView scrollView = this.c0;
            boolean z2 = false;
            if (scrollView != null) {
                gm.u3(scrollView, cmb.w0(null, cmb.r8, false));
            }
            int i = this.b;
            if (i != 2 && i != 1) {
                z = false;
            } else {
                z = true;
            }
            int w0 = cmb.w0(null, cmb.j6, false);
            int w02 = cmb.w0(null, cmb.k6, false);
            int w03 = cmb.w0(null, cmb.o7, false);
            if (z && (w0 != this.O1 || w02 != this.P1 || w03 != this.Q1)) {
                z2 = true;
            }
            S1(this.Z, z, z2);
            S1(this.b0, z, z2);
            if (z2) {
                this.O1 = w0;
                this.P1 = w02;
                this.Q1 = w03;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (this.i1 != null) {
            gm.c3(new ny7(this, (byte) 1));
        }
        int i = this.b;
        if (i == 5) {
            if (z) {
                if (this.a0[0].getVisibility() == 0) {
                    this.Z[0].requestFocus();
                    gm.E3(this.Z[0]);
                }
                if (this.O0 == 2) {
                    E1(false);
                }
            }
        } else if (i == 7) {
            if (z) {
                this.K1[this.J1].j();
            }
        } else if (i == 4) {
            if (z) {
                this.Z[0].requestFocus();
                gm.E3(this.Z[0]);
            }
        } else if (i == 6) {
            if (z) {
                this.Z[0].requestFocus();
                gm.E3(this.Z[0]);
            }
        } else if (i != 2 && i != 1) {
        } else {
            V0();
        }
    }

    public final void p1(xw9 xw9Var, int i, vz7 vz7Var, String str) {
        String str2 = xw9Var.c;
        this.o1.remove(xw9Var);
        if (i == 1) {
            this.k1 = null;
            this.h0.removeView(vz7Var);
        } else if (i == 4) {
            this.l1.remove(xw9Var);
            this.i0.removeView(vz7Var);
        } else if (i == 2) {
            this.m1 = null;
            this.f0.removeView(vz7Var);
        } else if (i == 3) {
            this.n1 = null;
            this.g0.removeView(vz7Var);
        } else {
            this.j1.remove(xw9Var);
            this.e0.removeView(vz7Var);
        }
        HashMap hashMap = this.y1;
        if (hashMap != null) {
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.z1;
        if (hashMap2 != null) {
            hashMap2.remove(str);
        }
        W1(i);
        if (str2 != null) {
            HashMap hashMap3 = this.p1;
            if (hashMap3.remove(str2) != null) {
                if (hashMap3.isEmpty()) {
                    this.M.setEnabled(true);
                    this.M.setAlpha(1.0f);
                }
                bc4.G(this.currentAccount).b(str2, false);
            }
        }
    }

    public final void q1() {
        TL_account.deleteSecureValue deletesecurevalue = new TL_account.deleteSecureValue();
        for (int i = 0; i < this.E.values.size(); i++) {
            deletesecurevalue.types.add(this.E.values.get(i).type);
        }
        B1();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deletesecurevalue, new ry7(this, (byte) 2));
    }

    public final void r1() {
        l11.u(getParentActivity(), "https://telegram.org/deactivate?phone=".concat(z8c.h(this.currentAccount).d()));
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.R0 = bundle.getString("path");
    }

    public final void s1() {
        if (this.K.has_recovery) {
            B1();
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new ry7(this, (byte) 0), 10), this.classGuid);
        } else if (getParentActivity() == null) {
        } else {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            alertDialog$Builder.g(jb6.M0(2131745803, null), new qy7(this, (byte) 4));
            String M0 = jb6.M0(2131745804, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131745806, null);
            showDialog(heVar);
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.R0;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void t1() {
        p5c p5cVar = new p5c(this.currentAccount, 0, this.K);
        p5cVar.Z = true;
        presentFragment(p5cVar);
    }

    public final void u1(TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery) {
        TL_account.Password password = this.K;
        password.email_unconfirmed_pattern = tL_auth_passwordRecovery.email_pattern;
        presentFragment(new p5c(this.currentAccount, 4, password));
    }

    public final void v1() {
        byte b;
        ArrayList arrayList;
        int i;
        int i2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3;
        ArrayList arrayList2 = new ArrayList();
        int size = this.E.required_types.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.SecureRequiredType secureRequiredType = this.E.required_types.get(i3);
            if (secureRequiredType instanceof TLRPC.TL_secureRequiredType) {
                tL_secureRequiredType = (TLRPC.TL_secureRequiredType) secureRequiredType;
            } else {
                if (secureRequiredType instanceof TLRPC.TL_secureRequiredTypeOneOf) {
                    TLRPC.TL_secureRequiredTypeOneOf tL_secureRequiredTypeOneOf = (TLRPC.TL_secureRequiredTypeOneOf) secureRequiredType;
                    if (tL_secureRequiredTypeOneOf.types.isEmpty()) {
                        continue;
                    } else {
                        TLRPC.SecureRequiredType secureRequiredType2 = tL_secureRequiredTypeOneOf.types.get(0);
                        if (secureRequiredType2 instanceof TLRPC.TL_secureRequiredType) {
                            TLRPC.TL_secureRequiredType tL_secureRequiredType4 = (TLRPC.TL_secureRequiredType) secureRequiredType2;
                            int size2 = tL_secureRequiredTypeOneOf.types.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    TLRPC.SecureRequiredType secureRequiredType3 = tL_secureRequiredTypeOneOf.types.get(i4);
                                    if (secureRequiredType3 instanceof TLRPC.TL_secureRequiredType) {
                                        TLRPC.TL_secureRequiredType tL_secureRequiredType5 = (TLRPC.TL_secureRequiredType) secureRequiredType3;
                                        if (l1(tL_secureRequiredType5, true) != null) {
                                            tL_secureRequiredType = tL_secureRequiredType5;
                                            break;
                                        }
                                    }
                                    i4++;
                                } else {
                                    tL_secureRequiredType = tL_secureRequiredType4;
                                    break;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    continue;
                }
            }
            TLRPC.TL_secureValue l1 = l1(tL_secureRequiredType, true);
            HashMap hashMap = this.s1;
            HashMap hashMap2 = this.r1;
            if (l1 == null) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                wz7 wz7Var = (wz7) hashMap2.get(tL_secureRequiredType);
                if (wz7Var == null && (tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    wz7Var = (wz7) hashMap2.get(tL_secureRequiredType2);
                }
                gm.z3(wz7Var);
                return;
            }
            HashMap hashMap3 = (HashMap) this.v1.get(i1(tL_secureRequiredType.type));
            if (hashMap3 != null && !hashMap3.isEmpty()) {
                Vibrator vibrator2 = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                wz7 wz7Var2 = (wz7) hashMap2.get(tL_secureRequiredType);
                if (wz7Var2 == null && (tL_secureRequiredType3 = (TLRPC.TL_secureRequiredType) hashMap.get(tL_secureRequiredType)) != null) {
                    wz7Var2 = (wz7) hashMap2.get(tL_secureRequiredType3);
                }
                gm.z3(wz7Var2);
                return;
            }
            boolean z = tL_secureRequiredType.selfie_required;
            boolean z2 = tL_secureRequiredType.translation_required;
            ?? obj = new Object();
            obj.a = l1;
            obj.b = z;
            obj.c = z2;
            arrayList2.add(obj);
        }
        Q1(false, true);
        TL_account.acceptAuthorization acceptauthorization = new TL_account.acceptAuthorization();
        acceptauthorization.bot_id = this.c;
        acceptauthorization.scope = this.h;
        String str = this.r;
        acceptauthorization.public_key = str;
        JSONObject jSONObject = new JSONObject();
        int size3 = arrayList2.size();
        int i5 = 0;
        while (i5 < size3) {
            bz7 bz7Var = (bz7) arrayList2.get(i5);
            TLRPC.TL_secureValue tL_secureValue = bz7Var.a;
            JSONObject jSONObject2 = new JSONObject();
            TLRPC.SecurePlainData securePlainData = tL_secureValue.plain_data;
            if (securePlainData != null) {
                if (securePlainData instanceof TLRPC.TL_securePlainEmail) {
                    TLRPC.TL_securePlainEmail tL_securePlainEmail = (TLRPC.TL_securePlainEmail) securePlainData;
                } else if (securePlainData instanceof TLRPC.TL_securePlainPhone) {
                    TLRPC.TL_securePlainPhone tL_securePlainPhone = (TLRPC.TL_securePlainPhone) securePlainData;
                }
            } else {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    TLRPC.TL_secureData tL_secureData = tL_secureValue.data;
                    if (tL_secureData != null) {
                        byte[] b1 = b1(tL_secureData.secret, tL_secureData.data_hash);
                        arrayList = arrayList2;
                        try {
                            jSONObject2.put("data_hash", Base64.encodeToString(tL_secureValue.data.data_hash, 2));
                            jSONObject2.put("secret", Base64.encodeToString(b1, 2));
                            jSONObject3.put("data", jSONObject2);
                        } catch (Exception unused) {
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    if (!tL_secureValue.files.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        int size4 = tL_secureValue.files.size();
                        int i6 = 0;
                        while (i6 < size4) {
                            TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) tL_secureValue.files.get(i6);
                            int i7 = size4;
                            i = size3;
                            try {
                                byte[] b12 = b1(tL_secureFile.secret, tL_secureFile.file_hash);
                                JSONObject jSONObject4 = new JSONObject();
                                i2 = i5;
                                try {
                                    jSONObject4.put("file_hash", Base64.encodeToString(tL_secureFile.file_hash, 2));
                                    jSONObject4.put("secret", Base64.encodeToString(b12, 2));
                                    jSONArray.put(jSONObject4);
                                    i6++;
                                    size4 = i7;
                                    size3 = i;
                                    i5 = i2;
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                        }
                        i = size3;
                        i2 = i5;
                        jSONObject3.put("files", jSONArray);
                    } else {
                        i = size3;
                        i2 = i5;
                    }
                    TLRPC.SecureFile secureFile = tL_secureValue.front_side;
                    if (secureFile instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile;
                        byte[] b13 = b1(tL_secureFile2.secret, tL_secureFile2.file_hash);
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("file_hash", Base64.encodeToString(tL_secureFile2.file_hash, 2));
                        jSONObject5.put("secret", Base64.encodeToString(b13, 2));
                        jSONObject3.put("front_side", jSONObject5);
                    }
                    TLRPC.SecureFile secureFile2 = tL_secureValue.reverse_side;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile2;
                        byte[] b14 = b1(tL_secureFile3.secret, tL_secureFile3.file_hash);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("file_hash", Base64.encodeToString(tL_secureFile3.file_hash, 2));
                        jSONObject6.put("secret", Base64.encodeToString(b14, 2));
                        jSONObject3.put("reverse_side", jSONObject6);
                    }
                    if (bz7Var.b) {
                        TLRPC.SecureFile secureFile3 = tL_secureValue.selfie;
                        if (secureFile3 instanceof TLRPC.TL_secureFile) {
                            TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile3;
                            byte[] b15 = b1(tL_secureFile4.secret, tL_secureFile4.file_hash);
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("file_hash", Base64.encodeToString(tL_secureFile4.file_hash, 2));
                            jSONObject7.put("secret", Base64.encodeToString(b15, 2));
                            jSONObject3.put("selfie", jSONObject7);
                        }
                    }
                    if (bz7Var.c && !tL_secureValue.translation.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        int size5 = tL_secureValue.translation.size();
                        for (int i8 = 0; i8 < size5; i8++) {
                            TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) tL_secureValue.translation.get(i8);
                            byte[] b16 = b1(tL_secureFile5.secret, tL_secureFile5.file_hash);
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("file_hash", Base64.encodeToString(tL_secureFile5.file_hash, 2));
                            jSONObject8.put("secret", Base64.encodeToString(b16, 2));
                            jSONArray2.put(jSONObject8);
                        }
                        jSONObject3.put("translation", jSONArray2);
                    }
                    jSONObject.put(i1(tL_secureValue.type), jSONObject3);
                } catch (Exception unused4) {
                }
                TLRPC.TL_secureValueHash tL_secureValueHash = new TLRPC.TL_secureValueHash();
                tL_secureValueHash.type = tL_secureValue.type;
                tL_secureValueHash.hash = tL_secureValue.hash;
                acceptauthorization.value_hashes.add(tL_secureValueHash);
                i5 = i2 + 1;
                arrayList2 = arrayList;
                size3 = i;
            }
            arrayList = arrayList2;
            i = size3;
            i2 = i5;
            TLRPC.TL_secureValueHash tL_secureValueHash2 = new TLRPC.TL_secureValueHash();
            tL_secureValueHash2.type = tL_secureValue.type;
            tL_secureValueHash2.hash = tL_secureValue.hash;
            acceptauthorization.value_hashes.add(tL_secureValueHash2);
            i5 = i2 + 1;
            arrayList2 = arrayList;
            size3 = i;
        }
        JSONObject jSONObject9 = new JSONObject();
        try {
            jSONObject9.put("secure_data", jSONObject);
        } catch (Exception unused5) {
        }
        Object obj2 = this.d;
        if (obj2 != null) {
            try {
                jSONObject9.put("payload", obj2);
            } catch (Exception unused6) {
            }
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            try {
                jSONObject9.put("nonce", obj3);
            } catch (Exception unused7) {
            }
        }
        sm2 d1 = d1(gm.g1(jSONObject9.toString()));
        TLRPC.TL_secureCredentialsEncrypted tL_secureCredentialsEncrypted = new TLRPC.TL_secureCredentialsEncrypted();
        acceptauthorization.credentials = tL_secureCredentialsEncrypted;
        tL_secureCredentialsEncrypted.hash = (byte[]) d1.e;
        tL_secureCredentialsEncrypted.data = (byte[]) d1.d;
        try {
            String replace = str.replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
            Cipher cipher = Cipher.getInstance("RSA/NONE/OAEPWithSHA1AndMGF1Padding");
            cipher.init(1, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(replace, 0))));
            acceptauthorization.credentials.secret = cipher.doFinal((byte[]) d1.c);
            b = 1;
        } catch (Exception e) {
            b = 1;
            fc4.g(e, true);
        }
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(acceptauthorization, new ry7(this, b)), this.classGuid);
    }

    public final void w1(java.lang.String r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz7.w1(java.lang.String, boolean):void");
    }

    public final void x1(xw9 xw9Var, int i) {
        String str = xw9Var.c;
        byte b = this.T0;
        HashMap hashMap = this.o1;
        if (b == 1) {
            xw9 xw9Var2 = this.k1;
            if (xw9Var2 != null) {
                vz7 vz7Var = (vz7) hashMap.remove(xw9Var2);
                if (vz7Var != null) {
                    this.h0.removeView(vz7Var);
                }
                this.k1 = null;
            }
        } else if (b == 4) {
            if (this.l1.size() >= 20) {
                return;
            }
        } else if (b == 2) {
            xw9 xw9Var3 = this.m1;
            if (xw9Var3 != null) {
                vz7 vz7Var2 = (vz7) hashMap.remove(xw9Var3);
                if (vz7Var2 != null) {
                    this.f0.removeView(vz7Var2);
                }
                this.m1 = null;
            }
        } else if (b == 3) {
            xw9 xw9Var4 = this.n1;
            if (xw9Var4 != null) {
                vz7 vz7Var3 = (vz7) hashMap.remove(xw9Var4);
                if (vz7Var3 != null) {
                    this.g0.removeView(vz7Var3);
                }
                this.n1 = null;
            }
        } else if (b == 0 && this.j1.size() >= 20) {
            return;
        }
        this.p1.put(str, xw9Var);
        this.M.setEnabled(false);
        this.M.setAlpha(0.5f);
        bc4.G(this.currentAccount).h0(false, 16777216, str, true);
        I0(xw9Var, i);
        W1(i);
    }

    public final void y1(TLRPC.TL_error tL_error, String str, ez7 ez7Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        if (tL_error == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("phone", str);
            xz7 xz7Var = new xz7(7, this.E, this.K, this.F, (TLRPC.TL_secureValue) null, (TLRPC.TL_secureRequiredType) null, (TLRPC.TL_secureValue) null, hashMap, (HashMap) null);
            xz7Var.currentAccount = this.currentAccount;
            xz7Var.f1 = this.f1;
            xz7Var.d1 = this.d1;
            xz7Var.C1 = ez7Var;
            xz7Var.L = (TLRPC.TL_auth_sentCode) tLObject;
            presentFragment(xz7Var, true);
            return;
        }
        ik.c0(this.currentAccount, tL_error, this, sendverifyphonecode, str);
    }

    public final void z1() {
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new ry7(this, (byte) 3)), this.classGuid);
    }

    public xz7(int i, TL_account.authorizationForm authorizationform, TL_account.Password password, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureValue tL_secureValue, TLRPC.TL_secureRequiredType tL_secureRequiredType2, TLRPC.TL_secureValue tL_secureValue2, HashMap hashMap, HashMap hashMap2) {
        super(null);
        this.s = "";
        this.w = "";
        this.y = new int[3];
        this.l0 = new ArrayList();
        this.u0 = new boolean[3];
        this.v0 = true;
        this.V0 = new ArrayList();
        this.W0 = new HashMap();
        this.X0 = new HashMap();
        this.Y0 = new HashMap();
        this.j1 = new ArrayList();
        this.l1 = new ArrayList();
        this.o1 = new HashMap();
        this.p1 = new HashMap();
        this.q1 = new HashMap();
        this.r1 = new HashMap();
        this.s1 = new HashMap();
        this.v1 = new HashMap();
        this.w1 = new HashMap();
        this.z1 = new HashMap();
        this.E1 = new az7(this);
        this.b = i;
        this.E = authorizationform;
        this.F = tL_secureRequiredType;
        if (tL_secureRequiredType != null) {
            this.v0 = tL_secureRequiredType.native_names;
        }
        this.I = tL_secureValue;
        this.G = tL_secureRequiredType2;
        this.J = tL_secureValue2;
        this.K = password;
        this.t1 = hashMap;
        this.u1 = hashMap2;
        if (i == 3) {
            this.N1 = new ArrayList();
        } else if (i == 7) {
            this.K1 = new kla[3];
        }
        if (hashMap == null) {
            this.t1 = new HashMap();
        }
        if (hashMap2 == null) {
            this.u1 = new HashMap();
        }
        if (i == 5) {
            if (z8c.h(this.currentAccount).k0 != null && z8c.h(this.currentAccount).l0 != null) {
                this.O0 = (byte) 1;
                this.P0 = z8c.h(this.currentAccount).k0;
                this.Q0 = z8c.h(this.currentAccount).l0;
            }
            TL_account.Password password2 = this.K;
            if (password2 == null) {
                z1();
            } else {
                TwoStepVerificationActivity.f0(password2);
                if (this.O0 == 1) {
                    E1(true);
                }
            }
            if (gda.g0 == null) {
                TLRPC.TL_help_getPassportConfig tL_help_getPassportConfig = new TLRPC.TL_help_getPassportConfig();
                tL_help_getPassportConfig.hash = gda.h0;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_help_getPassportConfig, new nf2((byte) 3));
            }
        }
    }
}
