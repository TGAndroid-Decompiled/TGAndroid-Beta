package gh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import hh.k7;
import hh.m7;
import hh.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.s6;
import lh.kc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a9;
import org.telegram.ui.ex0;
import org.telegram.ui.k61;
import org.telegram.ui.ke;
import org.telegram.ui.om0;
import org.telegram.ui.q21;
import org.telegram.ui.qb;
import org.telegram.ui.qe;
import org.telegram.ui.rd;
import org.telegram.ui.rn;
import org.telegram.ui.ti;
import org.telegram.ui.tk0;
import org.telegram.ui.x21;
import org.telegram.ui.xm0;

public final class i1 implements Runnable {

    public final int f7313a;

    public final Object f7314b;

    public final Object f7315c;
    public final Object d;

    public final Object f7316e;

    public final Object f7317f;
    public final Object h;

    public i1(u7 u7Var, Object obj, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback, int i10) {
        this.f7313a = i10;
        this.d = u7Var;
        this.f7316e = obj;
        this.f7314b = messageObject;
        this.f7317f = inputInvoice;
        this.f7315c = tL_payments_paymentFormStars;
        this.h = callback;
    }

    private final void a() {
        pf.c cVar;
        String str;
        Location location;
        Locale locale;
        List<Address> list;
        List<Address> list2;
        int i10;
        boolean z10;
        boolean z11;
        StringBuilder sb2;
        String countryName;
        StringBuilder sb3;
        StringBuilder sb4;
        Address address;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        String subAdminArea;
        String adminArea;
        boolean z12;
        StringBuilder sb5;
        String addressLine;
        String[] strArrSplit;
        int length;
        String str2;
        int i11;
        String str3;
        pf.c cVar2 = (pf.c) this.d;
        Locale locale2 = (Locale) this.f7316e;
        String str4 = (String) this.f7314b;
        Locale locale3 = (Locale) this.f7317f;
        Location location2 = (Location) this.h;
        String str5 = (String) this.f7315c;
        ArrayList arrayList = new ArrayList();
        try {
            int i12 = cVar2.f45741e ? 10 : 5;
            List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, locale2).getFromLocationName(str4, 5);
            List<Address> fromLocationName2 = cVar2.d ? new Geocoder(ApplicationLoader.applicationContext, locale3).getFromLocationName(str4, 5) : null;
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            int i13 = 0;
            while (i13 < fromLocationName.size()) {
                Address address2 = fromLocationName.get(i13);
                Address address3 = (fromLocationName2 == null || i13 >= fromLocationName2.size()) ? null : fromLocationName2.get(i13);
                if (address2.hasLatitude() && address2.hasLongitude()) {
                    i10 = i13;
                    double latitude = address2.getLatitude();
                    double longitude = address2.getLongitude();
                    StringBuilder sb6 = new StringBuilder();
                    StringBuilder sb7 = new StringBuilder();
                    locale = locale2;
                    StringBuilder sb8 = new StringBuilder();
                    String locality = address2.getLocality();
                    if (TextUtils.isEmpty(locality)) {
                        locality = address2.getAdminArea();
                    }
                    list = fromLocationName2;
                    String str6 = locality;
                    if (address3 != null && TextUtils.isEmpty(address3.getLocality())) {
                        address3.getAdminArea();
                    }
                    str = str5;
                    try {
                        String thoroughfare = address2.getThoroughfare();
                        location = location2;
                        if (TextUtils.isEmpty(thoroughfare)) {
                            list2 = fromLocationName;
                        } else {
                            list2 = fromLocationName;
                            try {
                                if (!TextUtils.equals(thoroughfare, address2.getAdminArea())) {
                                    if (sb8.length() > 0) {
                                        sb8.append(", ");
                                    }
                                    sb8.append(thoroughfare);
                                }
                                z10 = false;
                                if (TextUtils.isEmpty(str6)) {
                                    z11 = true;
                                } else {
                                    if (sb7.length() > 0) {
                                        sb7.append(", ");
                                    }
                                    sb7.append(str6);
                                    if (sb8 != null) {
                                        if (sb8.length() > 0) {
                                            sb8.append(", ");
                                        }
                                        sb8.append(str6);
                                    }
                                    z11 = false;
                                }
                                sb2 = sb8;
                                countryName = address2.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                    address3 = address3;
                                } else {
                                    if (!"US".equals(address2.getCountryCode()) || "AE".equals(address2.getCountryCode()) || ("GB".equals(address2.getCountryCode()) && "en".equals(locale.getLanguage()))) {
                                        strArrSplit = countryName.split(" ");
                                        length = strArrSplit.length;
                                        str2 = "";
                                        i11 = 0;
                                        while (i11 < length) {
                                            int i14 = length;
                                            str3 = strArrSplit[i11];
                                            if (str3.length() > 0) {
                                                str2 = str2 + str3.charAt(0);
                                            }
                                            i11++;
                                            length = i14;
                                        }
                                    } else {
                                        str2 = countryName;
                                    }
                                    if (sb7.length() > 0) {
                                        sb7.append(", ");
                                    }
                                    sb7.append(str2);
                                    if (sb6.length() > 0) {
                                        sb6.append(", ");
                                    }
                                    sb6.append(countryName);
                                }
                                sb3 = sb7;
                                if (cVar2.f45741e) {
                                    sb5 = new StringBuilder();
                                    try {
                                        addressLine = address2.getAddressLine(0);
                                        if (!TextUtils.isEmpty(addressLine)) {
                                            sb5.append(addressLine);
                                        }
                                    } catch (Exception unused) {
                                    }
                                    if (sb5.length() > 0) {
                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue2.geo = tL_geoPoint;
                                        tL_geoPoint.lat = latitude;
                                        tL_geoPoint._long = longitude;
                                        tL_messageMediaVenue2.query_id = -1L;
                                        tL_messageMediaVenue2.title = sb5.toString();
                                        tL_messageMediaVenue2.icon = "pin";
                                        tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportAddress);
                                        arrayList.add(tL_messageMediaVenue2);
                                    }
                                    cVar = cVar2;
                                } else {
                                    if (sb2 != null || sb2.length() <= 0) {
                                        cVar = cVar2;
                                        sb3 = sb3;
                                        sb4 = sb6;
                                        address = address2;
                                    } else {
                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                        cVar = cVar2;
                                        try {
                                            TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue3.geo = tL_geoPoint2;
                                            tL_geoPoint2.lat = latitude;
                                            tL_geoPoint2._long = longitude;
                                            sb4 = sb6;
                                            address = address2;
                                            tL_messageMediaVenue3.query_id = -1L;
                                            tL_messageMediaVenue3.title = sb2.toString();
                                            tL_messageMediaVenue3.icon = "pin";
                                            tL_messageMediaVenue3.address = LocaleController.getString(z10 != 0 ? R.string.PassportCity : R.string.PassportStreet1);
                                            if (address3 != null) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                                tL_messageMediaVenue3.geoAddress = tL_geoPointAddress;
                                                tL_geoPointAddress.country_iso2 = address3.getCountryCode();
                                                String locality2 = TextUtils.isEmpty(null) ? address3.getLocality() : null;
                                                if (TextUtils.isEmpty(locality2)) {
                                                    locality2 = address3.getAdminArea();
                                                }
                                                if (TextUtils.isEmpty(locality2)) {
                                                    locality2 = address3.getSubAdminArea();
                                                }
                                                String adminArea2 = address3.getAdminArea();
                                                StringBuilder sb9 = new StringBuilder();
                                                if (!TextUtils.isEmpty(adminArea2)) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue3.geoAddress;
                                                    tL_geoPointAddress2.state = adminArea2;
                                                    tL_geoPointAddress2.flags |= 1;
                                                }
                                                if (!TextUtils.isEmpty(locality2)) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue3.geoAddress;
                                                    tL_geoPointAddress3.city = locality2;
                                                    tL_geoPointAddress3.flags |= 2;
                                                }
                                                if (!z10) {
                                                    String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address3.getThoroughfare(), str6) || TextUtils.equals(address3.getThoroughfare(), address3.getCountryName())) ? null : address3.getThoroughfare();
                                                    if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getSubLocality(), str6) && !TextUtils.equals(address3.getSubLocality(), address3.getCountryName())) {
                                                        thoroughfare2 = address3.getSubLocality();
                                                    }
                                                    if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getLocality(), str6) && !TextUtils.equals(address3.getLocality(), address3.getCountryName())) {
                                                        thoroughfare2 = address3.getLocality();
                                                    }
                                                    if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea2) || TextUtils.equals(thoroughfare2, address3.getCountryName())) {
                                                        sb9 = null;
                                                    } else {
                                                        if (sb9.length() > 0) {
                                                            sb9.append(", ");
                                                        }
                                                        sb9.append(thoroughfare2);
                                                    }
                                                    if (!TextUtils.isEmpty(sb9)) {
                                                        int i15 = 0;
                                                        while (true) {
                                                            String[] strArr = LocationController.unnamedRoads;
                                                            if (i15 >= strArr.length) {
                                                                z12 = false;
                                                                break;
                                                            } else {
                                                                if (strArr[i15].equalsIgnoreCase(sb9.toString())) {
                                                                    z12 = true;
                                                                    break;
                                                                }
                                                                i15++;
                                                            }
                                                        }
                                                    } else {
                                                        z12 = false;
                                                        break;
                                                    }
                                                    if (!TextUtils.isEmpty(sb9)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue3.geoAddress;
                                                        tL_geoPointAddress4.flags |= 4;
                                                        tL_geoPointAddress4.street = sb9.toString();
                                                    }
                                                }
                                                if (!z12) {
                                                    arrayList.add(tL_messageMediaVenue3);
                                                    if (arrayList.size() >= i12) {
                                                    }
                                                    AndroidUtilities.runOnUIThread(new ex0(cVar, location, str, arrayList, 17));
                                                }
                                            } else {
                                                sb4 = sb4;
                                                sb3 = sb3;
                                            }
                                            z12 = false;
                                            if (!z12) {
                                                arrayList.add(tL_messageMediaVenue3);
                                                if (arrayList.size() >= i12) {
                                                }
                                                AndroidUtilities.runOnUIThread(new ex0(cVar, location, str, arrayList, 17));
                                            }
                                        } catch (Exception unused2) {
                                        }
                                    }
                                    if (!z11 && !hashSet2.contains(sb3.toString())) {
                                        tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue.geo = tL_geoPoint3;
                                        tL_geoPoint3.lat = latitude;
                                        tL_geoPoint3._long = longitude;
                                        tL_messageMediaVenue.query_id = -1L;
                                        tL_messageMediaVenue.title = sb3.toString();
                                        tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                        tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                        hashSet2.add(tL_messageMediaVenue.title);
                                        tL_messageMediaVenue.address = LocaleController.getString(R.string.PassportCity);
                                        if (address3 != null) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                            tL_messageMediaVenue.geoAddress = tL_geoPointAddress5;
                                            tL_geoPointAddress5.country_iso2 = address3.getCountryCode();
                                            if (TextUtils.isEmpty(null)) {
                                                subAdminArea = address3.getLocality();
                                            } else {
                                                subAdminArea = null;
                                            }
                                            if (TextUtils.isEmpty(subAdminArea)) {
                                                subAdminArea = address3.getAdminArea();
                                            }
                                            if (TextUtils.isEmpty(subAdminArea)) {
                                                subAdminArea = address3.getSubAdminArea();
                                            }
                                            adminArea = address3.getAdminArea();
                                            if (!TextUtils.isEmpty(adminArea)) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue.geoAddress;
                                                tL_geoPointAddress6.state = adminArea;
                                                tL_geoPointAddress6.flags |= 1;
                                            }
                                            if (!TextUtils.isEmpty(subAdminArea)) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue.geoAddress;
                                                tL_geoPointAddress7.city = subAdminArea;
                                                tL_geoPointAddress7.flags |= 2;
                                            }
                                        }
                                        arrayList.add(tL_messageMediaVenue);
                                        if (arrayList.size() >= i12) {
                                        }
                                        AndroidUtilities.runOnUIThread(new ex0(cVar, location, str, arrayList, 17));
                                    }
                                    if (sb4.length() <= 0 && !hashSet.contains(sb4.toString())) {
                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue4.geo = tL_geoPoint4;
                                        tL_geoPoint4.lat = latitude;
                                        tL_geoPoint4._long = longitude;
                                        tL_messageMediaVenue4.query_id = -1L;
                                        tL_messageMediaVenue4.title = sb4.toString();
                                        tL_messageMediaVenue4.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                        tL_messageMediaVenue4.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                        hashSet.add(tL_messageMediaVenue4.title);
                                        tL_messageMediaVenue4.address = LocaleController.getString(R.string.Country);
                                        if (address3 != null) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                            tL_messageMediaVenue4.geoAddress = tL_geoPointAddress8;
                                            tL_geoPointAddress8.country_iso2 = address3.getCountryCode();
                                        }
                                        arrayList.add(tL_messageMediaVenue4);
                                        if (arrayList.size() >= i12) {
                                            AndroidUtilities.runOnUIThread(new ex0(cVar, location, str, arrayList, 17));
                                        }
                                    }
                                }
                            } catch (Exception unused3) {
                                cVar = cVar2;
                            }
                        }
                        String subLocality = address2.getSubLocality();
                        if (TextUtils.isEmpty(subLocality)) {
                            String locality3 = address2.getLocality();
                            if (TextUtils.isEmpty(locality3) || TextUtils.equals(locality3, str6)) {
                                sb8 = null;
                                z10 = true;
                            } else {
                                if (sb8.length() > 0) {
                                    sb8.append(", ");
                                }
                                sb8.append(locality3);
                            }
                            if (TextUtils.isEmpty(str6)) {
                                if (sb7.length() > 0) {
                                    sb7.append(", ");
                                }
                                sb7.append(str6);
                                if (sb8 != null) {
                                    if (sb8.length() > 0) {
                                        sb8.append(", ");
                                    }
                                    sb8.append(str6);
                                }
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            sb2 = sb8;
                            countryName = address2.getCountryName();
                            if (TextUtils.isEmpty(countryName)) {
                                if ("US".equals(address2.getCountryCode())) {
                                    strArrSplit = countryName.split(" ");
                                    length = strArrSplit.length;
                                    str2 = "";
                                    i11 = 0;
                                    while (i11 < length) {
                                        int i16 = length;
                                        str3 = strArrSplit[i11];
                                        if (str3.length() > 0) {
                                            str2 = str2 + str3.charAt(0);
                                        }
                                        i11++;
                                        length = i16;
                                    }
                                } else {
                                    strArrSplit = countryName.split(" ");
                                    length = strArrSplit.length;
                                    str2 = "";
                                    i11 = 0;
                                    while (i11 < length) {
                                        int i17 = length;
                                        str3 = strArrSplit[i11];
                                        if (str3.length() > 0) {
                                            str2 = str2 + str3.charAt(0);
                                        }
                                        i11++;
                                        length = i17;
                                    }
                                }
                                if (sb7.length() > 0) {
                                    sb7.append(", ");
                                }
                                sb7.append(str2);
                                if (sb6.length() > 0) {
                                    sb6.append(", ");
                                }
                                sb6.append(countryName);
                            } else {
                                address3 = address3;
                            }
                            sb3 = sb7;
                            if (cVar2.f45741e) {
                                if (sb2 != null) {
                                    cVar = cVar2;
                                    sb3 = sb3;
                                    sb4 = sb6;
                                    address = address2;
                                    if (!z11) {
                                        tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint5 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue.geo = tL_geoPoint5;
                                        tL_geoPoint5.lat = latitude;
                                        tL_geoPoint5._long = longitude;
                                        tL_messageMediaVenue.query_id = -1L;
                                        tL_messageMediaVenue.title = sb3.toString();
                                        tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                        tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                        hashSet2.add(tL_messageMediaVenue.title);
                                        tL_messageMediaVenue.address = LocaleController.getString(R.string.PassportCity);
                                        if (address3 != null) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress9 = new TL_stories.TL_geoPointAddress();
                                            tL_messageMediaVenue.geoAddress = tL_geoPointAddress9;
                                            tL_geoPointAddress9.country_iso2 = address3.getCountryCode();
                                            if (TextUtils.isEmpty(null)) {
                                                subAdminArea = address3.getLocality();
                                            } else {
                                                subAdminArea = null;
                                            }
                                            if (TextUtils.isEmpty(subAdminArea)) {
                                                subAdminArea = address3.getAdminArea();
                                            }
                                            if (TextUtils.isEmpty(subAdminArea)) {
                                                subAdminArea = address3.getSubAdminArea();
                                            }
                                            adminArea = address3.getAdminArea();
                                            if (!TextUtils.isEmpty(adminArea)) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress10 = tL_messageMediaVenue.geoAddress;
                                                tL_geoPointAddress10.state = adminArea;
                                                tL_geoPointAddress10.flags |= 1;
                                            }
                                            if (!TextUtils.isEmpty(subAdminArea)) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress11 = tL_messageMediaVenue.geoAddress;
                                                tL_geoPointAddress11.city = subAdminArea;
                                                tL_geoPointAddress11.flags |= 2;
                                            }
                                        }
                                        arrayList.add(tL_messageMediaVenue);
                                        if (arrayList.size() >= i12) {
                                        }
                                    }
                                    if (sb4.length() <= 0) {
                                        continue;
                                    }
                                } else {
                                    cVar = cVar2;
                                    sb3 = sb3;
                                    sb4 = sb6;
                                    address = address2;
                                    if (!z11) {
                                        tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint6 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue.geo = tL_geoPoint6;
                                        tL_geoPoint6.lat = latitude;
                                        tL_geoPoint6._long = longitude;
                                        tL_messageMediaVenue.query_id = -1L;
                                        tL_messageMediaVenue.title = sb3.toString();
                                        tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                        tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                        hashSet2.add(tL_messageMediaVenue.title);
                                        tL_messageMediaVenue.address = LocaleController.getString(R.string.PassportCity);
                                        if (address3 != null) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress12 = new TL_stories.TL_geoPointAddress();
                                            tL_messageMediaVenue.geoAddress = tL_geoPointAddress12;
                                            tL_geoPointAddress12.country_iso2 = address3.getCountryCode();
                                            if (TextUtils.isEmpty(null)) {
                                                subAdminArea = address3.getLocality();
                                            } else {
                                                subAdminArea = null;
                                            }
                                            if (TextUtils.isEmpty(subAdminArea)) {
                                                subAdminArea = address3.getAdminArea();
                                            }
                                            if (TextUtils.isEmpty(subAdminArea)) {
                                                subAdminArea = address3.getSubAdminArea();
                                            }
                                            adminArea = address3.getAdminArea();
                                            if (!TextUtils.isEmpty(adminArea)) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress13 = tL_messageMediaVenue.geoAddress;
                                                tL_geoPointAddress13.state = adminArea;
                                                tL_geoPointAddress13.flags |= 1;
                                            }
                                            if (!TextUtils.isEmpty(subAdminArea)) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress14 = tL_messageMediaVenue.geoAddress;
                                                tL_geoPointAddress14.city = subAdminArea;
                                                tL_geoPointAddress14.flags |= 2;
                                            }
                                        }
                                        arrayList.add(tL_messageMediaVenue);
                                        if (arrayList.size() >= i12) {
                                        }
                                    }
                                    if (sb4.length() <= 0) {
                                        continue;
                                    }
                                }
                                AndroidUtilities.runOnUIThread(new ex0(cVar, location, str, arrayList, 17));
                            }
                            sb5 = new StringBuilder();
                            addressLine = address2.getAddressLine(0);
                            if (!TextUtils.isEmpty(addressLine)) {
                                sb5.append(addressLine);
                            }
                            if (sb5.length() > 0) {
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue5 = new TLRPC.TL_messageMediaVenue();
                                TLRPC.TL_geoPoint tL_geoPoint7 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue5.geo = tL_geoPoint7;
                                tL_geoPoint7.lat = latitude;
                                tL_geoPoint7._long = longitude;
                                tL_messageMediaVenue5.query_id = -1L;
                                tL_messageMediaVenue5.title = sb5.toString();
                                tL_messageMediaVenue5.icon = "pin";
                                tL_messageMediaVenue5.address = LocaleController.getString(R.string.PassportAddress);
                                arrayList.add(tL_messageMediaVenue5);
                            }
                            cVar = cVar2;
                        } else {
                            if (sb8.length() > 0) {
                                sb8.append(", ");
                            }
                            sb8.append(subLocality);
                        }
                        z10 = false;
                        if (TextUtils.isEmpty(str6)) {
                            if (sb7.length() > 0) {
                                sb7.append(", ");
                            }
                            sb7.append(str6);
                            if (sb8 != null) {
                                if (sb8.length() > 0) {
                                    sb8.append(", ");
                                }
                                sb8.append(str6);
                            }
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        sb2 = sb8;
                        countryName = address2.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                            if ("US".equals(address2.getCountryCode())) {
                                strArrSplit = countryName.split(" ");
                                length = strArrSplit.length;
                                str2 = "";
                                i11 = 0;
                                while (i11 < length) {
                                    int i18 = length;
                                    str3 = strArrSplit[i11];
                                    if (str3.length() > 0) {
                                        str2 = str2 + str3.charAt(0);
                                    }
                                    i11++;
                                    length = i18;
                                }
                            } else {
                                strArrSplit = countryName.split(" ");
                                length = strArrSplit.length;
                                str2 = "";
                                i11 = 0;
                                while (i11 < length) {
                                    int i19 = length;
                                    str3 = strArrSplit[i11];
                                    if (str3.length() > 0) {
                                        str2 = str2 + str3.charAt(0);
                                    }
                                    i11++;
                                    length = i19;
                                }
                            }
                            if (sb7.length() > 0) {
                                sb7.append(", ");
                            }
                            sb7.append(str2);
                            if (sb6.length() > 0) {
                                sb6.append(", ");
                            }
                            sb6.append(countryName);
                        } else {
                            address3 = address3;
                        }
                        sb3 = sb7;
                        if (cVar2.f45741e) {
                            if (sb2 != null) {
                                cVar = cVar2;
                                sb3 = sb3;
                                sb4 = sb6;
                                address = address2;
                                if (!z11) {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint8 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint8;
                                    tL_geoPoint8.lat = latitude;
                                    tL_geoPoint8._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb3.toString();
                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet2.add(tL_messageMediaVenue.title);
                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.PassportCity);
                                    if (address3 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress15 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress15;
                                        tL_geoPointAddress15.country_iso2 = address3.getCountryCode();
                                        if (TextUtils.isEmpty(null)) {
                                            subAdminArea = address3.getLocality();
                                        } else {
                                            subAdminArea = null;
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address3.getAdminArea();
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address3.getSubAdminArea();
                                        }
                                        adminArea = address3.getAdminArea();
                                        if (!TextUtils.isEmpty(adminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress16 = tL_messageMediaVenue.geoAddress;
                                            tL_geoPointAddress16.state = adminArea;
                                            tL_geoPointAddress16.flags |= 1;
                                        }
                                        if (!TextUtils.isEmpty(subAdminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress17 = tL_messageMediaVenue.geoAddress;
                                            tL_geoPointAddress17.city = subAdminArea;
                                            tL_geoPointAddress17.flags |= 2;
                                        }
                                    }
                                    arrayList.add(tL_messageMediaVenue);
                                    if (arrayList.size() >= i12) {
                                    }
                                }
                                if (sb4.length() <= 0) {
                                    continue;
                                }
                            } else {
                                cVar = cVar2;
                                sb3 = sb3;
                                sb4 = sb6;
                                address = address2;
                                if (!z11) {
                                    tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                    TLRPC.TL_geoPoint tL_geoPoint9 = new TLRPC.TL_geoPoint();
                                    tL_messageMediaVenue.geo = tL_geoPoint9;
                                    tL_geoPoint9.lat = latitude;
                                    tL_geoPoint9._long = longitude;
                                    tL_messageMediaVenue.query_id = -1L;
                                    tL_messageMediaVenue.title = sb3.toString();
                                    tL_messageMediaVenue.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                    tL_messageMediaVenue.emoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                                    hashSet2.add(tL_messageMediaVenue.title);
                                    tL_messageMediaVenue.address = LocaleController.getString(R.string.PassportCity);
                                    if (address3 != null) {
                                        TL_stories.TL_geoPointAddress tL_geoPointAddress18 = new TL_stories.TL_geoPointAddress();
                                        tL_messageMediaVenue.geoAddress = tL_geoPointAddress18;
                                        tL_geoPointAddress18.country_iso2 = address3.getCountryCode();
                                        if (TextUtils.isEmpty(null)) {
                                            subAdminArea = address3.getLocality();
                                        } else {
                                            subAdminArea = null;
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address3.getAdminArea();
                                        }
                                        if (TextUtils.isEmpty(subAdminArea)) {
                                            subAdminArea = address3.getSubAdminArea();
                                        }
                                        adminArea = address3.getAdminArea();
                                        if (!TextUtils.isEmpty(adminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress19 = tL_messageMediaVenue.geoAddress;
                                            tL_geoPointAddress19.state = adminArea;
                                            tL_geoPointAddress19.flags |= 1;
                                        }
                                        if (!TextUtils.isEmpty(subAdminArea)) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress110 = tL_messageMediaVenue.geoAddress;
                                            tL_geoPointAddress110.city = subAdminArea;
                                            tL_geoPointAddress110.flags |= 2;
                                        }
                                    }
                                    arrayList.add(tL_messageMediaVenue);
                                    if (arrayList.size() >= i12) {
                                    }
                                }
                                if (sb4.length() <= 0) {
                                    continue;
                                }
                            }
                            AndroidUtilities.runOnUIThread(new ex0(cVar, location, str, arrayList, 17));
                        }
                        sb5 = new StringBuilder();
                        addressLine = address2.getAddressLine(0);
                        if (!TextUtils.isEmpty(addressLine)) {
                            sb5.append(addressLine);
                        }
                        if (sb5.length() > 0) {
                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue6 = new TLRPC.TL_messageMediaVenue();
                            TLRPC.TL_geoPoint tL_geoPoint10 = new TLRPC.TL_geoPoint();
                            tL_messageMediaVenue6.geo = tL_geoPoint10;
                            tL_geoPoint10.lat = latitude;
                            tL_geoPoint10._long = longitude;
                            tL_messageMediaVenue6.query_id = -1L;
                            tL_messageMediaVenue6.title = sb5.toString();
                            tL_messageMediaVenue6.icon = "pin";
                            tL_messageMediaVenue6.address = LocaleController.getString(R.string.PassportAddress);
                            arrayList.add(tL_messageMediaVenue6);
                        }
                        cVar = cVar2;
                    } catch (Exception unused4) {
                        cVar = cVar2;
                        location = location2;
                    }
                } else {
                    locale = locale2;
                    list = fromLocationName2;
                    cVar = cVar2;
                    str = str5;
                    location = location2;
                    list2 = fromLocationName;
                    i10 = i13;
                }
                i13 = i10 + 1;
                locale2 = locale;
                str5 = str;
                fromLocationName2 = list;
                fromLocationName = list2;
                location2 = location;
                cVar2 = cVar;
            }
        } catch (Exception unused5) {
        }
        cVar = cVar2;
        str = str5;
        location = location2;
        AndroidUtilities.runOnUIThread(new ex0(cVar, location, str, arrayList, 17));
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.n2 n2VarU;
        TLRPC.ChatParticipants chatParticipants;
        String str;
        int i10 = 8;
        TLRPC.User user = null;
        int i11 = 2;
        boolean z10 = true;
        int i12 = 0;
        switch (this.f7313a) {
            case 0:
                k2.P((k2) this.d, (org.telegram.ui.ActionBar.b2) this.f7316e, (TLObject) this.f7314b, (e1) this.f7317f, (Utilities.Callback) this.h, (TLRPC.TL_error) this.f7315c);
                break;
            case 1:
                hh.i5.c1((hh.i5) this.d, (TLObject) this.f7314b, (CharSequence) this.f7316e, (TL_stars.TL_starGiftUnique) this.f7317f, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.h, (TLRPC.TL_error) this.f7315c);
                break;
            case 2:
                hh.i5.x0((hh.i5) this.d, (TLObject) this.f7314b, (cg.y2[]) this.f7316e, (Long) this.f7317f, (androidx.car.app.utils.a) this.h, (TLRPC.TL_error) this.f7315c);
                break;
            case 3:
                u7 u7Var = (u7) this.d;
                List list = (List) this.f7316e;
                cg.u0 u0Var = (cg.u0) this.f7314b;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f7317f;
                n2.g gVar = (n2.g) this.h;
                Activity activity = (Activity) this.f7315c;
                if (list.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new hh.y5(u0Var, i12));
                } else {
                    n2.l lVar = (n2.l) list.get(0);
                    if (lVar.a() == null) {
                        AndroidUtilities.runOnUIThread(new hh.y5(u0Var, 1));
                    } else {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(u7Var.f10151a).sendRequest(tL_payments_canPurchaseStore, new cg.j0(lVar, gVar, (Utilities.Callback2) u0Var, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGiveaway, list, 2));
                    }
                }
                break;
            case 4:
                u7 u7Var2 = (u7) this.d;
                Runnable runnable = (Runnable) this.f7316e;
                MessageObject messageObject = (MessageObject) this.f7314b;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f7317f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f7315c;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (u7Var2.f10154e) {
                    u7Var2.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
                } else {
                    u7.e("NO_BALANCE");
                    runnable.run();
                }
                break;
            case 5:
                u7 u7Var3 = (u7) this.d;
                TLObject tLObject = (TLObject) this.f7314b;
                MessageObject messageObject2 = (MessageObject) this.f7316e;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f7317f;
                ti tiVar = (ti) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f7315c;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    u7Var3.Y(messageObject2, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, tiVar, null);
                } else {
                    u7.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
                }
                tiVar.run();
                break;
            case 6:
                u7 u7Var4 = (u7) this.d;
                boolean[] zArr = (boolean[]) this.f7316e;
                MessageObject messageObject3 = (MessageObject) this.f7314b;
                TLRPC.InputInvoice inputInvoice2 = (TLRPC.InputInvoice) this.f7317f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = (TLRPC.TL_payments_paymentFormStars) this.f7315c;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                zArr[0] = true;
                u7Var4.a0(messageObject3, inputInvoice2, tL_payments_paymentFormStars2, new hh.p1(1, callback2));
                break;
            case 7:
                k7 k7Var = (k7) this.d;
                TLObject tLObject2 = (TLObject) this.f7314b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f7316e;
                m7 m7Var = (m7) this.f7317f;
                Utilities.Callback callback3 = (Utilities.Callback) this.h;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f7315c;
                long j10 = k7Var.f9612b;
                int i13 = k7Var.f9611a;
                HashMap map = k7Var.h;
                ArrayList arrayList = k7Var.f9614e;
                k7Var.f9619k = false;
                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                    arrayList.remove(tL_starGiftCollection);
                    arrayList.add(tL_starGiftCollection2);
                    map.remove(-1);
                    int i14 = tL_starGiftCollection2.collection_id;
                    m7Var.d = i14;
                    map.put(Integer.valueOf(i14), m7Var);
                    k7Var.j();
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var);
                    if (callback3 != null) {
                        callback3.run(tL_starGiftCollection2);
                    }
                } else {
                    if (tL_error2 != null && (n2VarU = LaunchActivity.U()) != null) {
                        mc.a0(n2VarU).d0(tL_error2, false);
                    }
                    arrayList.remove(tL_starGiftCollection);
                    map.remove(-1);
                    k7Var.j();
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var);
                }
                break;
            case 8:
                jh.j6 j6Var = (jh.j6) this.d;
                ArrayList arrayList2 = (ArrayList) this.f7316e;
                ArrayList arrayList3 = (ArrayList) this.f7314b;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.f7317f;
                ArrayList<TLRPC.Chat> arrayList5 = (ArrayList) this.h;
                HashSet hashSet = (HashSet) this.f7315c;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                sb2.append(j6Var.f13537e);
                sb2.append("{");
                sb2.append(j6Var.d);
                sb2.append("} preloadCache {");
                sb2.append(s6.a(arrayList2));
                pa.v("}", sb2);
                ArrayList arrayList6 = j6Var.f13539g;
                arrayList6.clear();
                arrayList6.addAll(arrayList3);
                j6Var.f13551t = false;
                int i15 = j6Var.f13536c;
                MessagesController.getInstance(i15).putUsers(arrayList4, true);
                MessagesController.getInstance(i15).putChats(arrayList5, true);
                if (j6Var.v) {
                    j6Var.v = false;
                    j6Var.f13555y = null;
                    j6Var.j();
                } else {
                    j6Var.f13544m.addAll(hashSet);
                    j6Var.f13542k.clear();
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        j6Var.t((MessageObject) arrayList2.get(i16), true);
                    }
                    j6Var.d(false);
                    jh.i6 i6Var = j6Var.f13555y;
                    if (i6Var != null) {
                        i6Var.run(0);
                        j6Var.f13555y = null;
                    }
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, j6Var);
                }
                break;
            case 9:
                int[] iArr = (int[]) this.d;
                TLObject tLObject3 = (TLObject) this.f7314b;
                MessagesController messagesController = (MessagesController) this.f7316e;
                TLRPC.User[] userArr = (TLRPC.User[]) this.f7317f;
                lh.mc mcVar = (lh.mc) this.h;
                kc kcVar = (kc) this.f7315c;
                iArr[0] = 0;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = user2;
                    if (user2 != null) {
                        mcVar.run();
                    }
                }
                kcVar.run(null);
                break;
            case 10:
                TLObject tLObject4 = (TLObject) this.f7314b;
                String[] strArr = (String[]) this.d;
                final FrameLayout frameLayout = (FrameLayout) this.f7316e;
                final p80 p80Var = (p80) this.f7317f;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f7315c;
                if (tLObject4 instanceof TL_phone.exportedGroupCallInvite) {
                    final String strSubstring = ((TL_phone.exportedGroupCallInvite) tLObject4).link;
                    strArr[0] = strSubstring;
                    if (strSubstring.startsWith("https://")) {
                        strSubstring = strSubstring.substring(8);
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float fAbs = (Math.abs(fFloatValue - 0.5f) / 5.0f) + 0.9f;
                            FrameLayout frameLayout2 = frameLayout;
                            frameLayout2.setScaleX(fAbs);
                            frameLayout2.setScaleY(fAbs);
                            if (fFloatValue >= 0.5f) {
                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                if (atomicBoolean2.get()) {
                                    return;
                                }
                                atomicBoolean2.set(true);
                                p80Var.setText(strSubstring);
                            }
                        }
                    });
                    duration.addListener(new a9(atomicBoolean, p80Var, strSubstring));
                    duration.start();
                    new mc(e3Var.topBulletinContainer, c6Var).M(LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText), R.raw.linkbroken).j();
                }
                break;
            case 11:
                qb qbVar = (qb) this.d;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.f7316e;
                ArrayList arrayList7 = (ArrayList) this.f7314b;
                ArrayList arrayList8 = (ArrayList) this.f7317f;
                ArrayList arrayList9 = (ArrayList) this.h;
                org.telegram.ui.pa paVar = (org.telegram.ui.pa) this.f7315c;
                TLRPC.Chat chat = qbVar.f41614s;
                qbVar.Z = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.ChannelParticipant adminInChannel = qbVar.getMessagesController().getAdminInChannel(channelParticipant.peer.user_id, chat.f22380id);
                            if (adminInChannel != null && ((adminInChannel instanceof TLRPC.TL_channelParticipantCreator) || adminInChannel.admin_rights.manage_call)) {
                                if (chat.creator) {
                                }
                            }
                        } else {
                            TLRPC.ChatFull chatFull = qbVar.getMessagesController().getChatFull(chat.f22380id);
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                int size = chatParticipants.participants.size();
                                while (true) {
                                    if (i12 < size) {
                                        TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i12);
                                        if (chatParticipant.user_id != channelParticipant.peer.user_id) {
                                            i12++;
                                        } else if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                            if (chat.creator) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (ChatObject.canUserDoAction(chat, channelParticipant, 6)) {
                            arrayList7.add(LocaleController.getString(R.string.Restrict));
                            pa.n(R.drawable.msg_block2, 33, arrayList8, arrayList9);
                        } else {
                            arrayList7.add(LocaleController.getString(R.string.Restrict));
                            pa.n(R.drawable.msg_block2, 33, arrayList8, arrayList9);
                        }
                        arrayList7.add(LocaleController.getString(R.string.Ban));
                        pa.n(R.drawable.msg_block, 35, arrayList8, arrayList9);
                    } else {
                        if (ChatObject.canUserDoAction(chat, channelParticipant, 6) || ChatObject.canUserDoAction(chat, channelParticipant, 7)) {
                            arrayList7.add(LocaleController.getString(R.string.Restrict));
                            pa.n(R.drawable.msg_block2, 33, arrayList8, arrayList9);
                        }
                        arrayList7.add(LocaleController.getString(R.string.Ban));
                        pa.n(R.drawable.msg_block, 35, arrayList8, arrayList9);
                    }
                }
                paVar.run();
                break;
            case 12:
                rn rnVar = (rn) this.d;
                we.d dVar = (we.d) this.f7316e;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f7317f;
                String str2 = (String) this.h;
                TLObject tLObject5 = (TLObject) this.f7314b;
                CharacterStyle characterStyle = (CharacterStyle) this.f7315c;
                dVar.b();
                b70 b70VarI = b70.I(rnVar, s1Var);
                ol0 ol0Var = new ol0(rnVar.getParentActivity(), rnVar.f41983aa);
                b70VarI.f26987p = new ke(ol0Var, 0);
                b70VarI.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyCardNumber), new qe(rnVar, ol0Var, str2, i11), false);
                if (tLObject5 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject5;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList10 = tL_payments_bankCardData.open_urls;
                    int size2 = arrayList10.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList10.get(i17);
                        i17++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        b70VarI.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new rd(i10, rnVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        b70VarI.k();
                        b70VarI.p(13, AndroidUtilities.dp(200.0f), tL_payments_bankCardData.title);
                    }
                }
                ol0Var.e(b70VarI);
                ol0Var.f(s1Var, characterStyle, null, false);
                rnVar.showDialog(ol0Var);
                break;
            case 13:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f7315c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.f7316e;
                lh.d dVar2 = (lh.d) this.f7314b;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f7317f;
                Runnable runnable2 = (Runnable) this.h;
                if (tL_error3 != null) {
                    new mc(ab.a(context), c6Var2).d0(tL_error3, false);
                } else {
                    dVar2.setLoading(false);
                    e3Var2.dismiss();
                    new mc(ab.a(context), c6Var2).Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumReadSet)).j();
                    runnable2.run();
                }
                break;
            case 14:
                org.telegram.ui.Components.ex0 ex0Var = (org.telegram.ui.Components.ex0) this.d;
                TLObject tLObject6 = (TLObject) this.f7314b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f7316e;
                TextView textView = (TextView) this.f7317f;
                TextView textView2 = (TextView) this.h;
                int[] iArr2 = (int[]) this.f7315c;
                ex0Var.getClass();
                if (!(tLObject6 instanceof TLRPC.TL_stickers_suggestedShortName) || (str = ((TLRPC.TL_stickers_suggestedShortName) tLObject6).short_name) == null) {
                    z10 = false;
                } else {
                    editTextBoldCursor.setText(str);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    ex0Var.m0(textView, editTextBoldCursor.getText().toString(), true);
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), AndroidUtilities.dp(4.0f), 0, 0);
                if (!z10) {
                    editTextBoldCursor.setText("");
                }
                iArr2[0] = 2;
                break;
            case 15:
                xm0.W((xm0) this.d, (TLRPC.TL_error) this.f7315c, (String) this.f7316e, (om0) this.f7317f, (TLObject) this.f7314b, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 16:
                x21.n((x21) this.d, (TLObject) this.f7314b, (CharSequence) this.f7316e, (TLRPC.TL_error) this.f7315c, (byte[]) this.f7317f, (String) this.h);
                break;
            case 17:
                TLObject tLObject7 = (TLObject) this.f7314b;
                Context context2 = (Context) this.d;
                org.telegram.ui.ActionBar.c6 c6Var3 = (org.telegram.ui.ActionBar.c6) this.f7316e;
                byte[] bArr = (byte[]) this.f7317f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                lg0 lg0Var = (lg0) this.f7315c;
                x21 x21Var = new x21(context2, c6Var3, 0L, bArr);
                x21Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject7);
                x21Var.f44268s = new q21(n2Var, context2, c6Var3, lg0Var);
                x21Var.show();
                break;
            case 18:
                k61.R((k61) this.d, (TLRPC.TL_error) this.f7315c, (TLRPC.InputCheckPasswordSRP) this.f7316e, (TLRPC.User) this.f7314b, (TwoStepVerificationActivity) this.f7317f, (TLRPC.TL_channels_editCreator) this.h);
                break;
            case 19:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                TLObject tLObject8 = (TLObject) this.f7314b;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f7316e;
                String str3 = (String) this.f7317f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f7315c;
                String str4 = (String) this.h;
                org.telegram.ui.ActionBar.c6 c6Var4 = z0Var.f44064e;
                if (tLObject8 != null) {
                    if (tLObject8 instanceof TLRPC.TL_urlAuthResultRequest) {
                        tk0.b(false, z0Var.I, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject8, null, null, null, false, z0Var);
                    } else if (tLObject8 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        tk0.b(false, z0Var.I, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject8, null, null, null, false, z0Var);
                    } else if (tLObject8 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.y4.p0(z0Var.getContext(), str3, false, true, true, false, 0L, null, null, null);
                    }
                } else if (tL_error4 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error4.text)) {
                        new mc(z0Var, c6Var4).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var4)), R.raw.error).j();
                    } else {
                        new mc(z0Var, c6Var4).d0(tL_error4, false);
                    }
                }
                break;
            case 20:
                org.telegram.ui.web.z0 z0Var2 = (org.telegram.ui.web.z0) this.d;
                File file = (File) this.f7314b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f7316e;
                String str5 = (String) this.f7317f;
                String str6 = (String) this.h;
                String str7 = (String) this.f7315c;
                if (file == null) {
                    b2Var.c(500L);
                } else {
                    int[] iArr3 = new int[11];
                    Utilities.globalQueue.postRunnable(new gs0(file, iArr3, new cg.h0(z0Var2, iArr3, file, b2Var, str5, str6, str7, 13), 16));
                }
                break;
            case 21:
                a();
                break;
            default:
                pf.m0 m0Var = (pf.m0) this.d;
                String str8 = (String) this.f7316e;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.f7315c;
                TLObject tLObject9 = (TLObject) this.f7314b;
                MessagesController messagesController2 = (MessagesController) this.f7317f;
                MessagesStorage messagesStorage = (MessagesStorage) this.h;
                pf.u0 u0Var2 = m0Var.f45882e;
                String str9 = u0Var2.m0;
                if (str9 != null && str9.equals(str8)) {
                    if (tL_error5 == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject9;
                        if (!tL_contacts_resolvedPeer2.users.isEmpty()) {
                            TLRPC.User user3 = tL_contacts_resolvedPeer2.users.get(0);
                            messagesController2.putUser(user3, false);
                            messagesStorage.putUsersAndChats(tL_contacts_resolvedPeer2.users, null, true, true);
                            user = user3;
                        }
                    }
                    u0Var2.R(user);
                    u0Var2.f45939p0 = 0;
                    break;
                }
                break;
        }
    }

    public i1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f7313a = i10;
        this.d = obj;
        this.f7316e = obj2;
        this.f7314b = obj3;
        this.f7317f = obj4;
        this.h = obj5;
        this.f7315c = obj6;
    }

    public i1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10, boolean z10) {
        this.f7313a = i10;
        this.d = obj;
        this.f7314b = obj2;
        this.f7316e = obj3;
        this.f7317f = obj4;
        this.h = obj5;
        this.f7315c = obj6;
    }

    public i1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f7313a = i10;
        this.f7314b = tLObject;
        this.d = obj;
        this.f7316e = obj2;
        this.f7317f = obj3;
        this.h = obj4;
        this.f7315c = obj5;
    }

    public i1(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.c6 c6Var, lh.d dVar, org.telegram.ui.ActionBar.e3 e3Var, Runnable runnable) {
        this.f7313a = 13;
        this.f7315c = tL_error;
        this.d = context;
        this.f7316e = c6Var;
        this.f7314b = dVar;
        this.f7317f = e3Var;
        this.h = runnable;
    }

    public i1(rn rnVar, we.d dVar, org.telegram.ui.Cells.s1 s1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.f7313a = 12;
        this.d = rnVar;
        this.f7316e = dVar;
        this.f7317f = s1Var;
        this.h = str;
        this.f7314b = tLObject;
        this.f7315c = characterStyle;
    }

    public i1(xm0 xm0Var, TLRPC.TL_error tL_error, String str, om0 om0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.f7313a = 15;
        this.d = xm0Var;
        this.f7315c = tL_error;
        this.f7316e = str;
        this.f7317f = om0Var;
        this.f7314b = tLObject;
        this.h = sendverifyphonecode;
    }

    public i1(x21 x21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.f7313a = 16;
        this.d = x21Var;
        this.f7314b = tLObject;
        this.f7316e = charSequence;
        this.f7315c = tL_error;
        this.f7317f = bArr;
        this.h = str;
    }

    public i1(k61 k61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.f7313a = 18;
        this.d = k61Var;
        this.f7315c = tL_error;
        this.f7316e = inputCheckPasswordSRP;
        this.f7314b = user;
        this.f7317f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public i1(org.telegram.ui.web.z0 z0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.f7313a = 19;
        this.d = z0Var;
        this.f7314b = tLObject;
        this.f7316e = tL_messages_requestUrlAuth;
        this.f7317f = str;
        this.f7315c = tL_error;
        this.h = str2;
    }

    public i1(pf.m0 m0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f7313a = 22;
        this.d = m0Var;
        this.f7316e = str;
        this.f7315c = tL_error;
        this.f7314b = tLObject;
        this.f7317f = messagesController;
        this.h = messagesStorage;
    }
}
