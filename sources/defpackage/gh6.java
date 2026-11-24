package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;
public final class gh6 implements RequestDelegate {
    public final byte a;
    public final lh6 b;

    public gh6(lh6 lh6Var, byte b) {
        this.a = b;
        this.b = lh6Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final lh6 lh6Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        wy2 wy2Var;
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lh6 lh6Var2 = lh6Var;
                        switch (b2) {
                            case 0:
                                jh6 jh6Var = lh6Var2.a;
                                HashMap hashMap = lh6Var2.J;
                                ArrayList arrayList = lh6Var2.H;
                                HashMap hashMap2 = lh6Var2.I;
                                if (tL_error2 == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject2;
                                    for (int i2 = 0; i2 < tL_help_countriesList.countries.size(); i2++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i2);
                                        for (int i3 = 0; i3 < tL_help_country.country_codes.size(); i3++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i3);
                                            if (tL_help_countryCode != null) {
                                                ?? obj = new Object();
                                                String str = tL_help_country.name;
                                                obj.a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.a = str2;
                                                }
                                                obj.c = tL_help_countryCode.country_code;
                                                obj.d = tL_help_country.iso2;
                                                arrayList.add(obj);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(obj);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    mh6 mh6Var = lh6Var2.h0;
                                    if (mh6Var.G == 2) {
                                        i = ((d) mh6Var).currentAccount;
                                        String h = r58.h(z8c.h(i).d(), false);
                                        if (!TextUtils.isEmpty(h)) {
                                            if (h.length() > 4) {
                                                for (int i4 = 4; i4 >= 1; i4--) {
                                                    String substring = h.substring(0, i4);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        wy2Var = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = oc7.d1().getString("phone_code_last_matched_".concat(substring), null);
                                                        Object m = aq1.m(1, list2);
                                                        if (string != null) {
                                                            wy2Var = (wy2) m;
                                                            int size = arrayList.size();
                                                            int i5 = 0;
                                                            while (true) {
                                                                if (i5 < size) {
                                                                    Object obj2 = arrayList.get(i5);
                                                                    i5++;
                                                                    wy2 wy2Var2 = (wy2) obj2;
                                                                    if (Objects.equals(wy2Var2.d, string)) {
                                                                        wy2Var = wy2Var2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            wy2Var = (wy2) m;
                                                        }
                                                    } else {
                                                        wy2Var = (wy2) list2.get(0);
                                                    }
                                                    if (wy2Var != null) {
                                                        jh6Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                jh6Var.setText(h.substring(0, 1));
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                lh6Var2.N = false;
                                mh6 mh6Var2 = lh6Var2.h0;
                                mh6Var2.K1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.b0(password, true)) {
                                        ik.u0(mh6Var2.getParentActivity(), jb6.M0(2131743507, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    mh6Var2.J1(6, true, bundle, false);
                                    return;
                                }
                                mh6Var2.z1(jb6.M0(2131745804, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        wy2 wy2Var;
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lh6 lh6Var2 = lh6Var;
                        switch (b2) {
                            case 0:
                                jh6 jh6Var = lh6Var2.a;
                                HashMap hashMap = lh6Var2.J;
                                ArrayList arrayList = lh6Var2.H;
                                HashMap hashMap2 = lh6Var2.I;
                                if (tL_error2 == null) {
                                    arrayList.clear();
                                    hashMap2.clear();
                                    hashMap.clear();
                                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject2;
                                    for (int i2 = 0; i2 < tL_help_countriesList.countries.size(); i2++) {
                                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i2);
                                        for (int i3 = 0; i3 < tL_help_country.country_codes.size(); i3++) {
                                            TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i3);
                                            if (tL_help_countryCode != null) {
                                                ?? obj = new Object();
                                                String str = tL_help_country.name;
                                                obj.a = str;
                                                String str2 = tL_help_country.default_name;
                                                obj.b = str2;
                                                if (str == null && str2 != null) {
                                                    obj.a = str2;
                                                }
                                                obj.c = tL_help_countryCode.country_code;
                                                obj.d = tL_help_country.iso2;
                                                arrayList.add(obj);
                                                List list = (List) hashMap2.get(tL_help_countryCode.country_code);
                                                if (list == null) {
                                                    String str3 = tL_help_countryCode.country_code;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    hashMap2.put(str3, arrayList2);
                                                    list = arrayList2;
                                                }
                                                list.add(obj);
                                                if (tL_help_countryCode.patterns.size() > 0) {
                                                    hashMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                                                }
                                            }
                                        }
                                    }
                                    mh6 mh6Var = lh6Var2.h0;
                                    if (mh6Var.G == 2) {
                                        i = ((d) mh6Var).currentAccount;
                                        String h = r58.h(z8c.h(i).d(), false);
                                        if (!TextUtils.isEmpty(h)) {
                                            if (h.length() > 4) {
                                                for (int i4 = 4; i4 >= 1; i4--) {
                                                    String substring = h.substring(0, i4);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        wy2Var = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = oc7.d1().getString("phone_code_last_matched_".concat(substring), null);
                                                        Object m = aq1.m(1, list2);
                                                        if (string != null) {
                                                            wy2Var = (wy2) m;
                                                            int size = arrayList.size();
                                                            int i5 = 0;
                                                            while (true) {
                                                                if (i5 < size) {
                                                                    Object obj2 = arrayList.get(i5);
                                                                    i5++;
                                                                    wy2 wy2Var2 = (wy2) obj2;
                                                                    if (Objects.equals(wy2Var2.d, string)) {
                                                                        wy2Var = wy2Var2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            wy2Var = (wy2) m;
                                                        }
                                                    } else {
                                                        wy2Var = (wy2) list2.get(0);
                                                    }
                                                    if (wy2Var != null) {
                                                        jh6Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                jh6Var.setText(h.substring(0, 1));
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                lh6Var2.N = false;
                                mh6 mh6Var2 = lh6Var2.h0;
                                mh6Var2.K1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.b0(password, true)) {
                                        ik.u0(mh6Var2.getParentActivity(), jb6.M0(2131743507, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    mh6Var2.J1(6, true, bundle, false);
                                    return;
                                }
                                mh6Var2.z1(jb6.M0(2131745804, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
