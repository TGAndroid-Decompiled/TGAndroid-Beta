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
public final class ff6 implements RequestDelegate {
    public final byte a;
    public final lf6 b;

    public ff6(lf6 lf6Var, byte b) {
        this.a = b;
        this.b = lf6Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final lf6 lf6Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        mx2 mx2Var;
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lf6 lf6Var2 = lf6Var;
                        switch (b2) {
                            case 0:
                                if6 if6Var = lf6Var2.a;
                                HashMap hashMap = lf6Var2.J;
                                ArrayList arrayList = lf6Var2.H;
                                HashMap hashMap2 = lf6Var2.I;
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
                                    mf6 mf6Var = lf6Var2.h0;
                                    if (mf6Var.G == 2) {
                                        i = ((d) mf6Var).currentAccount;
                                        String h = p38.h(y6c.h(i).d(), false);
                                        if (!TextUtils.isEmpty(h)) {
                                            if (h.length() > 4) {
                                                for (int i4 = 4; i4 >= 1; i4--) {
                                                    String substring = h.substring(0, i4);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        mx2Var = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = na7.c1().getString("phone_code_last_matched_".concat(substring), null);
                                                        Object m = oo1.m(1, list2);
                                                        if (string != null) {
                                                            mx2Var = (mx2) m;
                                                            int size = arrayList.size();
                                                            int i5 = 0;
                                                            while (true) {
                                                                if (i5 < size) {
                                                                    Object obj2 = arrayList.get(i5);
                                                                    i5++;
                                                                    mx2 mx2Var2 = (mx2) obj2;
                                                                    if (Objects.equals(mx2Var2.d, string)) {
                                                                        mx2Var = mx2Var2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            mx2Var = (mx2) m;
                                                        }
                                                    } else {
                                                        mx2Var = (mx2) list2.get(0);
                                                    }
                                                    if (mx2Var != null) {
                                                        if6Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                if6Var.setText(h.substring(0, 1));
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
                                lf6Var2.N = false;
                                mf6 mf6Var2 = lf6Var2.h0;
                                mf6Var2.J1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.a0(password, true)) {
                                        ij.u0(mf6Var2.getParentActivity(), k96.M0(2131743581, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    mf6Var2.I1(6, true, bundle, false);
                                    return;
                                }
                                mf6Var2.y1(k96.M0(2131745878, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        int i;
                        mx2 mx2Var;
                        byte b2 = r4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lf6 lf6Var2 = lf6Var;
                        switch (b2) {
                            case 0:
                                if6 if6Var = lf6Var2.a;
                                HashMap hashMap = lf6Var2.J;
                                ArrayList arrayList = lf6Var2.H;
                                HashMap hashMap2 = lf6Var2.I;
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
                                    mf6 mf6Var = lf6Var2.h0;
                                    if (mf6Var.G == 2) {
                                        i = ((d) mf6Var).currentAccount;
                                        String h = p38.h(y6c.h(i).d(), false);
                                        if (!TextUtils.isEmpty(h)) {
                                            if (h.length() > 4) {
                                                for (int i4 = 4; i4 >= 1; i4--) {
                                                    String substring = h.substring(0, i4);
                                                    List list2 = (List) hashMap2.get(substring);
                                                    if (list2 == null) {
                                                        mx2Var = null;
                                                    } else if (list2.size() > 1) {
                                                        String string = na7.c1().getString("phone_code_last_matched_".concat(substring), null);
                                                        Object m = oo1.m(1, list2);
                                                        if (string != null) {
                                                            mx2Var = (mx2) m;
                                                            int size = arrayList.size();
                                                            int i5 = 0;
                                                            while (true) {
                                                                if (i5 < size) {
                                                                    Object obj2 = arrayList.get(i5);
                                                                    i5++;
                                                                    mx2 mx2Var2 = (mx2) obj2;
                                                                    if (Objects.equals(mx2Var2.d, string)) {
                                                                        mx2Var = mx2Var2;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            mx2Var = (mx2) m;
                                                        }
                                                    } else {
                                                        mx2Var = (mx2) list2.get(0);
                                                    }
                                                    if (mx2Var != null) {
                                                        if6Var.setText(substring);
                                                        return;
                                                    }
                                                }
                                                if6Var.setText(h.substring(0, 1));
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
                                lf6Var2.N = false;
                                mf6 mf6Var2 = lf6Var2.h0;
                                mf6Var2.J1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.a0(password, true)) {
                                        ij.u0(mf6Var2.getParentActivity(), k96.M0(2131743581, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle.putString("password", Utilities.f(serializedData.toByteArray()));
                                    mf6Var2.I1(6, true, bundle, false);
                                    return;
                                }
                                mf6Var2.y1(k96.M0(2131745878, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
