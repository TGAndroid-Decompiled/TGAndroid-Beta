package nh;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.fy;
import org.telegram.ui.gg;
import org.telegram.ui.th;
public final class t4 implements Utilities.Callback2 {
    public final int f18621a;
    public final Object f18622b;

    public t4(Object obj, int i10) {
        this.f18621a = i10;
        this.f18622b = obj;
    }

    private final void a(Object obj, Object obj2) {
        int i10;
        int i11;
        sh.a aVar = (sh.a) this.f18622b;
        ArrayList arrayList = (ArrayList) obj;
        k51 k51Var = (k51) obj2;
        arrayList.add(w41.D(0, AndroidUtilities.dp(12.0f)));
        arrayList.add(w41.j(1, aVar.V));
        arrayList.add(w41.D(2, AndroidUtilities.dp(12.0f)));
        arrayList.add(w41.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
        aVar.Y = arrayList.size();
        String string = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
        boolean z10 = aVar.X;
        if (z10) {
            i10 = R.string.CommunityChatVisibilityVisibleBotInfo;
        } else {
            i10 = R.string.CommunityChatVisibilityVisibleInfo;
        }
        w41 x4 = w41.x(151, string, LocaleController.getString(i10));
        x4.K(true ^ aVar.U);
        arrayList.add(x4);
        String string2 = LocaleController.getString(R.string.CommunityChatVisibilityHidden);
        if (z10) {
            i11 = R.string.CommunityChatVisibilityHiddenBotInfo;
        } else {
            i11 = R.string.CommunityChatVisibilityHiddenInfo;
        }
        w41 x10 = w41.x(150, string2, LocaleController.getString(i11));
        x10.K(aVar.U);
        arrayList.add(x10);
        arrayList.add(w41.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
    }

    @Override
    public final void run(Object obj, Object obj2) {
        long duration;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String upperCase;
        boolean z14;
        int i10;
        k51 k51Var;
        int i11;
        int i12;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        String str = "";
        char c3 = 65535;
        boolean z23 = false;
        z23 = false;
        switch (this.f18621a) {
            case 0:
                ((fb) this.f18622b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                return;
            case 1:
                y7 y7Var = (y7) this.f18622b;
                ArrayList arrayList = (ArrayList) obj;
                k51 k51Var2 = (k51) obj2;
                if (y7Var.f18893d0 || y7Var.f18892c0 != null) {
                    TLRPC.WebPage webPage = y7Var.f18892c0;
                    p7 p7Var = new p7(y7Var, 0);
                    int i13 = w7.f18797a;
                    w41 J = w41.J(w7.class);
                    J.G = webPage;
                    J.D = p7Var;
                    arrayList.add(J);
                }
                arrayList.add(w41.k(y7Var.U));
                arrayList.add(w41.A(1, null));
                w41 i14 = w41.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i14.K(y7Var.f18898i0);
                arrayList.add(i14);
                if (y7Var.f18898i0) {
                    arrayList.add(w41.k(y7Var.V));
                }
                arrayList.add(w41.A(3, null));
                arrayList.add(w41.k(y7Var.W));
                return;
            case 2:
                gb gbVar = (gb) this.f18622b;
                Boolean bool = (Boolean) obj;
                Float f9 = (Float) obj2;
                if (gbVar.T0.getDuration() < 100) {
                    duration = gbVar.G1.f18272h0;
                } else {
                    duration = gbVar.T0.getDuration();
                }
                float floatValue = ((f9.floatValue() / 0.96f) * 0.04f) + f9.floatValue();
                o7 o7Var = gbVar.G1;
                float f10 = o7Var.f18255a0;
                float f11 = o7Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = (float) duration;
                long j10 = f12 * f13;
                va vaVar = gbVar.T0;
                long j11 = (f11 * f13) + ((float) j10);
                gbVar.I1 = j11;
                vaVar.m(j11);
                ja jaVar = gbVar.f17792r1;
                if (jaVar != null) {
                    jaVar.setCoverTime(gbVar.I1);
                }
                o7 o7Var2 = gbVar.G1;
                if (o7Var2 != null && o7Var2.f18270g) {
                    o7Var2.f18275j = true;
                    return;
                }
                return;
            case 3:
                ((jb) this.f18622b).b((short[]) obj, ((Integer) obj2).intValue());
                return;
            case 4:
                ((oh.g) this.f18622b).C0((ArrayList) obj, (k51) obj2);
                return;
            case 5:
                oh.f fVar = (oh.f) this.f18622b;
                ArrayList arrayList2 = (ArrayList) obj;
                k51 k51Var3 = (k51) obj2;
                arrayList2.add(w41.k(fVar.U));
                arrayList2.add(w41.k(fVar.V));
                return;
            case 6:
                final org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.f18622b;
                ArrayList arrayList3 = (ArrayList) obj;
                k51 k51Var4 = (k51) obj2;
                org.telegram.ui.web.j jVar = lVar.f44105y;
                ArrayList arrayList4 = lVar.f44104x;
                if (!lVar.f44096b && arrayList4.isEmpty()) {
                    arrayList3.add(w41.k(lVar.d));
                }
                SharedPreferences sharedPreferences = lVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList5 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        ArrayList arrayList6 = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i15);
                            org.telegram.ui.web.k kVar = new org.telegram.ui.web.k(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            kVar.f44085c = jSONObject.optDouble("rank", 0.0d);
                            arrayList6.add(kVar);
                        }
                        Collections.sort(arrayList6, new wp0(17));
                        int size = arrayList6.size();
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj3 = arrayList6.get(i16);
                            i16++;
                            org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj3;
                            if (arrayList5.size() < 20) {
                                arrayList5.add(kVar2.f44083a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList4.size();
                arrayList5.size();
                if (!arrayList4.isEmpty()) {
                    arrayList3.add(w41.k(lVar.v));
                }
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    final String str2 = (String) arrayList4.get(i17);
                    if (i17 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i17 == arrayList4.size() - 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.t tVar = lVar.I;
                                    if (tVar != null) {
                                        tVar.run(str2);
                                        return;
                                    }
                                    return;
                                default:
                                    org.telegram.ui.t tVar2 = lVar.I;
                                    if (tVar2 != null) {
                                        tVar2.run(str2);
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    int i18 = org.telegram.ui.web.e.f44016a;
                    w41 J2 = w41.J(org.telegram.ui.web.e.class);
                    J2.f34313z = 1;
                    J2.f34300l = str2;
                    J2.D = onClickListener;
                    J2.f34305q = z12;
                    J2.f34306r = z13;
                    J2.G = Boolean.TRUE;
                    J2.H = lVar;
                    arrayList3.add(J2);
                }
                if (!arrayList5.isEmpty()) {
                    arrayList3.add(w41.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new mh.n(lVar, 11)));
                    for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                        final String str3 = (String) arrayList5.get(i19);
                        if (i19 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i19 == arrayList5.size() - 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        View.OnClickListener onClickListener2 = new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                switch (r3) {
                                    case 0:
                                        org.telegram.ui.t tVar = lVar.I;
                                        if (tVar != null) {
                                            tVar.run(str3);
                                            return;
                                        }
                                        return;
                                    default:
                                        org.telegram.ui.t tVar2 = lVar.I;
                                        if (tVar2 != null) {
                                            tVar2.run(str3);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        int i20 = org.telegram.ui.web.e.f44016a;
                        w41 J3 = w41.J(org.telegram.ui.web.e.class);
                        J3.f34313z = 0;
                        J3.f34300l = str3;
                        J3.D = onClickListener2;
                        J3.f34305q = z10;
                        J3.f34306r = z11;
                        J3.G = Boolean.TRUE;
                        J3.H = lVar;
                        arrayList3.add(J3);
                    }
                }
                if (jVar != null) {
                    ArrayList arrayList7 = jVar.f44069a;
                    if (!arrayList7.isEmpty()) {
                        arrayList3.add(w41.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                        for (int i21 = 0; i21 < arrayList7.size(); i21++) {
                            MessageObject messageObject = (MessageObject) arrayList7.get(i21);
                            if (!TextUtils.isEmpty(org.telegram.ui.web.l.a(messageObject))) {
                                int i22 = org.telegram.ui.web.h.f44044a;
                                w41 J4 = w41.J(org.telegram.ui.web.h.class);
                                J4.f34313z = 3;
                                J4.f34305q = true;
                                J4.H = messageObject;
                                arrayList3.add(J4);
                            }
                        }
                        if (!jVar.f44073f) {
                            arrayList3.add(w41.o(arrayList3.size(), 32));
                            arrayList3.add(w41.o(arrayList3.size(), 32));
                            arrayList3.add(w41.o(arrayList3.size(), 32));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((ph.j) this.f18622b).E0((ArrayList) obj, (k51) obj2);
                return;
            case 8:
                k51 k51Var5 = (k51) obj2;
                ph.r.U((ph.r) this.f18622b, (ArrayList) obj);
                return;
            case 9:
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f18622b;
                String str4 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb2 = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb2.append("~");
                    sb2.append(AndroidUtilities.formatFileSize(l10.longValue()));
                }
                if (str4 == null) {
                    upperCase = null;
                } else {
                    if (!str4.isEmpty()) {
                        switch (str4.hashCode()) {
                            case -2008589971:
                                if (str4.equals("application/epub+zip")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case -1719571662:
                                if (str4.equals("application/vnd.oasis.opendocument.text")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case -1664118616:
                                if (str4.equals("video/3gpp")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case -1578389996:
                                if (str4.equals("application/vnd.ms-fontobject")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                            case -1348237359:
                                if (str4.equals("application/x-cdf")) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case -1348236892:
                                if (str4.equals("application/x-csh")) {
                                    c3 = 5;
                                    break;
                                }
                                break;
                            case -1079884372:
                                if (str4.equals("video/x-msvideo")) {
                                    c3 = 6;
                                    break;
                                }
                                break;
                            case -1073633483:
                                if (str4.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    c3 = 7;
                                    break;
                                }
                                break;
                            case -1071817359:
                                if (str4.equals("application/vnd.ms-powerpoint")) {
                                    c3 = '\b';
                                    break;
                                }
                                break;
                            case -1050893613:
                                if (str4.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c3 = '\t';
                                    break;
                                }
                                break;
                            case -1007601745:
                                if (str4.equals("audio/x-midi")) {
                                    c3 = '\n';
                                    break;
                                }
                                break;
                            case -958424608:
                                if (str4.equals("text/calendar")) {
                                    c3 = 11;
                                    break;
                                }
                                break;
                            case -816908365:
                                if (str4.equals("application/x-httpd-php")) {
                                    c3 = '\f';
                                    break;
                                }
                                break;
                            case -648684635:
                                if (str4.equals("audio/3gpp2")) {
                                    c3 = '\r';
                                    break;
                                }
                                break;
                            case -433129473:
                                if (str4.equals("application/vnd.apple.installer+xml")) {
                                    c3 = 14;
                                    break;
                                }
                                break;
                            case -366307023:
                                if (str4.equals("application/vnd.ms-excel")) {
                                    c3 = 15;
                                    break;
                                }
                                break;
                            case -48069494:
                                if (str4.equals("video/3gpp2")) {
                                    c3 = 16;
                                    break;
                                }
                                break;
                            case -43923783:
                                if (str4.equals("application/gzip")) {
                                    c3 = 17;
                                    break;
                                }
                                break;
                            case -43491031:
                                if (str4.equals("application/x-sh")) {
                                    c3 = 18;
                                    break;
                                }
                                break;
                            case 187091926:
                                if (str4.equals("audio/ogg")) {
                                    c3 = 19;
                                    break;
                                }
                                break;
                            case 817335912:
                                if (str4.equals("text/plain")) {
                                    c3 = 20;
                                    break;
                                }
                                break;
                            case 859118878:
                                if (str4.equals("application/x-abiword")) {
                                    c3 = 21;
                                    break;
                                }
                                break;
                            case 886992732:
                                if (str4.equals("application/ld+json")) {
                                    c3 = 22;
                                    break;
                                }
                                break;
                            case 904647503:
                                if (str4.equals("application/msword")) {
                                    c3 = 23;
                                    break;
                                }
                                break;
                            case 1154306387:
                                if (str4.equals("application/x-bzip")) {
                                    c3 = 24;
                                    break;
                                }
                                break;
                            case 1154455342:
                                if (str4.equals("application/x-gzip")) {
                                    c3 = 25;
                                    break;
                                }
                                break;
                            case 1178484637:
                                if (str4.equals("application/octet-stream")) {
                                    c3 = 26;
                                    break;
                                }
                                break;
                            case 1423759679:
                                if (str4.equals("application/x-bzip2")) {
                                    c3 = 27;
                                    break;
                                }
                                break;
                            case 1436962847:
                                if (str4.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c3 = 28;
                                    break;
                                }
                                break;
                            case 1454024983:
                                if (str4.equals("application/x-7z-compressed")) {
                                    c3 = 29;
                                    break;
                                }
                                break;
                            case 1455492626:
                                if (str4.equals("application/x-freearc")) {
                                    c3 = 30;
                                    break;
                                }
                                break;
                            case 1503095341:
                                if (str4.equals("audio/3gpp")) {
                                    c3 = 31;
                                    break;
                                }
                                break;
                            case 1504831518:
                                if (str4.equals("audio/mpeg")) {
                                    c3 = ' ';
                                    break;
                                }
                                break;
                            case 1509238306:
                                if (str4.equals("application/vnd.rar")) {
                                    c3 = '!';
                                    break;
                                }
                                break;
                            case 1578362927:
                                if (str4.equals("image/vnd.microsoft.icon")) {
                                    c3 = '\"';
                                    break;
                                }
                                break;
                            case 1643664935:
                                if (str4.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c3 = '#';
                                    break;
                                }
                                break;
                            case 1672200517:
                                if (str4.equals("application/vnd.amazon.ebook")) {
                                    c3 = '$';
                                    break;
                                }
                                break;
                            case 1993842850:
                                if (str4.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c3 = '%';
                                    break;
                                }
                                break;
                            case 2049276534:
                                if (str4.equals("application/java-archive")) {
                                    c3 = '&';
                                    break;
                                }
                                break;
                            case 2132236175:
                                if (str4.equals("text/javascript")) {
                                    c3 = '\'';
                                    break;
                                }
                                break;
                        }
                        switch (c3) {
                            case 0:
                                str = "epub";
                                break;
                            case 1:
                                str = "odt";
                                break;
                            case 2:
                            case 31:
                                str = "3gp";
                                break;
                            case 3:
                                str = "eot";
                                break;
                            case 4:
                                str = "cda";
                                break;
                            case 5:
                                str = "csh";
                                break;
                            case 6:
                                str = "avi";
                                break;
                            case 7:
                                str = "pptx";
                                break;
                            case '\b':
                                str = "ppt";
                                break;
                            case '\t':
                                str = "docx";
                                break;
                            case '\n':
                                str = "midi";
                                break;
                            case 11:
                                str = "ics";
                                break;
                            case '\f':
                                str = "php";
                                break;
                            case '\r':
                            case 16:
                                str = "3g2";
                                break;
                            case 14:
                                str = "mpkg";
                                break;
                            case 15:
                                str = "xls";
                                break;
                            case 17:
                            case 25:
                                str = "gz";
                                break;
                            case 18:
                                str = "sh";
                                break;
                            case 19:
                                str = "opus";
                                break;
                            case 20:
                                str = "txt";
                                break;
                            case 21:
                                str = "abw";
                                break;
                            case 22:
                                str = "jsonld";
                                break;
                            case 23:
                                str = "doc";
                                break;
                            case 24:
                                str = "bz";
                                break;
                            case 26:
                                str = "bin";
                                break;
                            case 27:
                                str = "bz2";
                                break;
                            case 28:
                                str = "odp";
                                break;
                            case 29:
                                str = "7z";
                                break;
                            case 30:
                                str = "arc";
                                break;
                            case ' ':
                                str = "mp3";
                                break;
                            case '!':
                                str = "rar";
                                break;
                            case '\"':
                                str = "ico";
                                break;
                            case '#':
                                str = "ods";
                                break;
                            case '$':
                                str = "azw";
                                break;
                            case '%':
                                str = "xlsx";
                                break;
                            case '&':
                                str = "jar";
                                break;
                            case '\'':
                                str = "js";
                                break;
                            default:
                                if (str4.contains("/")) {
                                    str4 = str4.substring(str4.indexOf("/") + 1);
                                }
                                if (str4.contains("-")) {
                                    str4 = str4.substring(str4.indexOf("-") + 1);
                                }
                                if (str4.contains("+")) {
                                    str4 = str4.substring(0, str4.indexOf("+"));
                                }
                                str = str4.toLowerCase();
                                break;
                        }
                    }
                    upperCase = str.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb2.length() > 0) {
                        sb2.append(" ");
                    }
                    sb2.append(upperCase.toUpperCase());
                }
                if (sb2.length() <= 0) {
                    sb2.append(LocaleController.getString(R.string.AttachDocument));
                }
                o6Var.setText(sb2);
                return;
            case 10:
                ph.e1 e1Var = (ph.e1) this.f18622b;
                ArrayList arrayList8 = (ArrayList) obj;
                k51 k51Var6 = (k51) obj2;
                arrayList8.add(w41.j(-1, e1Var.W));
                arrayList8.add(w41.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, e1Var.U))));
                return;
            case 11:
                ph.p2 p2Var = (ph.p2) this.f18622b;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    p2Var.getClass();
                    return;
                }
                ph.y3 y3Var = p2Var.f45979r0;
                if (y3Var != null) {
                    y3Var.a(tL_webViewResultUrl);
                    p2Var.n();
                    return;
                }
                return;
            case 12:
                ((ph.d3) this.f18622b).F0((ArrayList) obj, (k51) obj2);
                return;
            case 13:
                ((ph.x3) this.f18622b).U((ArrayList) obj, (k51) obj2);
                return;
            case 14:
                k51 k51Var7 = (k51) obj2;
                ((qh.q) this.f18622b).v.c((ArrayList) obj);
                return;
            case 15:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                mn0 mn0Var = (mn0) ((rf.a0) this.f18622b);
                fy fyVar = mn0Var.E0;
                AndroidUtilities.hideKeyboard(fyVar.getParentActivity().getCurrentFocus());
                j70 I = j70.I(fyVar, (org.telegram.ui.Cells.f6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z14 = false;
                } else {
                    j70 J5 = I.J();
                    J5.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new xb0(I, 24), false);
                    J5.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J5.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J5.k();
                        }
                        J5.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    z14 = false;
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new ih.z2(I, J5, 6), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new gg(mn0Var, fyVar, mn0Var.F0, I, 22), z14);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new gg(mn0Var, fyVar, tL_sponsoredPeer, I, 23), z14);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new org.telegram.ui.Components.g(mn0Var, fyVar, I, 22), z14);
                if (LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                I.V(i10);
                I.Y = true;
                I.f29601t = z14;
                I.Z();
                return;
            case 16:
                sf.d.U((sf.d) this.f18622b, (ArrayList) obj, (k51) obj2);
                return;
            case 17:
                sf.l lVar2 = (sf.l) this.f18622b;
                lVar2.H.dismiss();
                lVar2.f47848y = (String) obj;
                lVar2.A = (TLRPC.InputDocument) obj2;
                lVar2.f47846w = false;
                AndroidUtilities.cancelRunOnUIThread(lVar2.d);
                lVar2.f47843n.setSticker(lVar2.f47848y);
                lVar2.e0(true);
                o51 o51Var = lVar2.f31601a;
                if (o51Var != null && (k51Var = o51Var.U2) != null) {
                    k51Var.N(true);
                    return;
                }
                return;
            case 18:
                sf.f0 f0Var = (sf.f0) this.f18622b;
                ArrayList arrayList9 = (ArrayList) obj;
                k51 k51Var8 = (k51) obj2;
                k51Var8.A = 1;
                LinearLayout linearLayout = f0Var.W;
                w41 w41Var = new w41(-4);
                w41Var.d = -5;
                w41Var.f34293c = linearLayout;
                w41Var.f34313z = -1;
                arrayList9.add(w41Var);
                TL_account.TL_connectedBot tL_connectedBot = f0Var.T;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        th.p(R.string.SessionBotConnectedFrom, arrayList9);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList9.add(w41.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i11 = 2;
                            arrayList9.add(w41.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i11 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i11)) {
                            arrayList9.add(w41.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList9.add(w41.B(null));
                    }
                    k51Var8.U();
                    th.p(R.string.BusinessBotChats2, arrayList9);
                    int i23 = sf.f0.f47799c0;
                    w41 w10 = w41.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(f0Var.f47801a0);
                    arrayList9.add(w10);
                    int i24 = sf.f0.f47800d0;
                    w41 w11 = w41.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!f0Var.f47801a0);
                    arrayList9.add(w11);
                    k51Var8.T();
                    arrayList9.add(w41.B(null));
                    sf.w wVar = f0Var.V;
                    if (wVar != null) {
                        wVar.a(arrayList9, k51Var8, true);
                    }
                    th.A(R.string.BusinessBotChatsInfo2, arrayList9);
                    return;
                }
                return;
            case 19:
                final sf.l0 l0Var = (sf.l0) this.f18622b;
                ArrayList arrayList10 = (ArrayList) obj;
                k51 k51Var9 = (k51) obj2;
                LongSparseArray longSparseArray = l0Var.J;
                String string2 = LocaleController.getString(R.string.BusinessBots2);
                String string3 = LocaleController.getString(R.string.BusinessBots2Info);
                w41 w41Var2 = new w41(2);
                w41Var2.f34300l = string2;
                w41Var2.f34303o = string3;
                w41Var2.f34301m = "tg_superplaceholders_android_2";
                w41Var2.f34302n = "🤖🏝️";
                w41Var2.f34313z = 120;
                arrayList10.add(w41Var2);
                if (l0Var.I != null) {
                    k51Var9.U();
                    long j12 = l0Var.I.f22539id;
                    w41 w41Var3 = new w41(13);
                    w41Var3.f34311x = j12;
                    w41Var3.K(true);
                    w41Var3.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.I = null;
                                    l0Var2.f47862c.U2.N(true);
                                    l0Var2.Y(true);
                                    return;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var3.F;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    l0Var3.f47862c.U2.N(true);
                                    l0Var3.Y(true);
                                    return;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var4.F;
                                    if (tL_businessBotRights2.edit_name && tL_businessBotRights2.edit_bio && tL_businessBotRights2.edit_profile_photo && tL_businessBotRights2.edit_username) {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        l0Var4.f47862c.U2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new h0(l0Var4, 2));
                                    return;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var5.F;
                                    if (tL_businessBotRights3.view_gifts && tL_businessBotRights3.sell_gifts && tL_businessBotRights3.change_gift_settings && tL_businessBotRights3.transfer_and_upgrade_gifts && tL_businessBotRights3.transfer_stars) {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        l0Var5.f47862c.U2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var6.F;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    l0Var6.f47862c.U2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList10.add(w41Var3);
                    k51Var9.T();
                } else {
                    k51Var9.U();
                    arrayList10.add(w41.k(l0Var.f47863e));
                    longSparseArray.clear();
                    boolean z24 = false;
                    for (int i25 = 0; i25 < l0Var.d.d.size(); i25++) {
                        TLObject tLObject = (TLObject) l0Var.d.d.get(i25);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j13 = user.f22539id;
                                String str5 = l0Var.f47870y;
                                w41 w41Var4 = new w41(13);
                                w41Var4.f34311x = j13;
                                w41Var4.f34302n = str5;
                                arrayList10.add(w41Var4);
                                longSparseArray.put(user.f22539id, user);
                                z24 = true;
                            }
                        }
                    }
                    for (int i26 = 0; i26 < l0Var.d.f47280e.size(); i26++) {
                        TLObject tLObject2 = (TLObject) l0Var.d.f47280e.get(i26);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.f22539id;
                                String str6 = l0Var.f47870y;
                                w41 w41Var5 = new w41(13);
                                w41Var5.f34311x = j14;
                                w41Var5.f34302n = str6;
                                arrayList10.add(w41Var5);
                                longSparseArray.put(user2.f22539id, user2);
                                z24 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(l0Var.f47864f.getText().toString()) || l0Var.d.e() || l0Var.f47869x)) {
                        arrayList10.add(w41.k(l0Var.f47865n));
                        z24 = true;
                    }
                    View view = l0Var.h;
                    if (z24) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    view.setVisibility(i12);
                    k51Var9.T();
                }
                arrayList10.add(w41.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                k51Var9.U();
                w41 t10 = w41.t(LocaleController.getString(R.string.BusinessBotChats2));
                if (l0Var.I != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                t10.f34296g = z15;
                arrayList10.add(t10);
                w41 w12 = w41.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(l0Var.E);
                if (l0Var.I != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                w12.f34296g = z16;
                arrayList10.add(w12);
                w41 w13 = w41.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!l0Var.E);
                if (l0Var.I != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                w13.f34296g = z17;
                arrayList10.add(w13);
                k51Var9.T();
                arrayList10.add(w41.B(null));
                sf.w wVar2 = l0Var.v;
                if (l0Var.I != null) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                wVar2.a(arrayList10, k51Var9, z18);
                th.A(R.string.BusinessBotChatsInfo2, arrayList10);
                if (l0Var.I != null) {
                    k51Var9.U();
                    th.p(R.string.BusinessBotPermissions, arrayList10);
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = l0Var.F;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    w41 m10 = w41.m(-4, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = l0Var.F;
                    if (tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    m10.K(z19);
                    m10.f34295f = !l0Var.L;
                    m10.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.I = null;
                                    l0Var2.f47862c.U2.N(true);
                                    l0Var2.Y(true);
                                    return;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var3.F;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    l0Var3.f47862c.U2.N(true);
                                    l0Var3.Y(true);
                                    return;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.F;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.f47862c.U2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new h0(l0Var4, 2));
                                    return;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var5.F;
                                    if (tL_businessBotRights32.view_gifts && tL_businessBotRights32.sell_gifts && tL_businessBotRights32.change_gift_settings && tL_businessBotRights32.transfer_and_upgrade_gifts && tL_businessBotRights32.transfer_stars) {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        l0Var5.f47862c.U2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var6.F;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    l0Var6.f47862c.U2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList10.add(m10);
                    if (l0Var.L) {
                        w41 y8 = w41.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y8.K(true);
                        y8.f34296g = false;
                        y8.f34297i = 1;
                        arrayList10.add(y8);
                        w41 y10 = w41.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y10.K(l0Var.F.reply);
                        y10.f34297i = 1;
                        arrayList10.add(y10);
                        w41 y11 = w41.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y11.K(l0Var.F.read_messages);
                        y11.f34297i = 1;
                        arrayList10.add(y11);
                        w41 y12 = w41.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y12.K(l0Var.F.delete_sent_messages);
                        y12.f34297i = 1;
                        arrayList10.add(y12);
                        w41 y13 = w41.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y13.K(l0Var.F.delete_received_messages);
                        y13.f34297i = 1;
                        arrayList10.add(y13);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = l0Var.F;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    w41 m11 = w41.m(-10, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = l0Var.F;
                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    m11.K(z20);
                    m11.f34295f = !l0Var.M;
                    m11.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.I = null;
                                    l0Var2.f47862c.U2.N(true);
                                    l0Var2.Y(true);
                                    return;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.F;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.f47862c.U2.N(true);
                                    l0Var3.Y(true);
                                    return;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.F;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.f47862c.U2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new h0(l0Var4, 2));
                                    return;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.F;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.f47862c.U2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = l0Var6.F;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    l0Var6.f47862c.U2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList10.add(m11);
                    if (l0Var.M) {
                        w41 y14 = w41.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y14.K(l0Var.F.edit_name);
                        y14.f34297i = 1;
                        arrayList10.add(y14);
                        w41 y15 = w41.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y15.K(l0Var.F.edit_bio);
                        y15.f34297i = 1;
                        arrayList10.add(y15);
                        w41 y16 = w41.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y16.K(l0Var.F.edit_profile_photo);
                        y16.f34297i = 1;
                        arrayList10.add(y16);
                        w41 y17 = w41.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y17.K(l0Var.F.edit_username);
                        y17.f34297i = 1;
                        arrayList10.add(y17);
                    }
                    String string6 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = l0Var.F;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    w41 m12 = w41.m(-15, string6, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = l0Var.F;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    m12.K(z21);
                    m12.f34295f = !l0Var.N;
                    m12.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.I = null;
                                    l0Var2.f47862c.U2.N(true);
                                    l0Var2.Y(true);
                                    return;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.F;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.f47862c.U2.N(true);
                                    l0Var3.Y(true);
                                    return;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.F;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.f47862c.U2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new h0(l0Var4, 2));
                                    return;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.F;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.f47862c.U2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = l0Var6.F;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    l0Var6.f47862c.U2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList10.add(m12);
                    if (l0Var.N) {
                        w41 y18 = w41.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y18.K(l0Var.F.view_gifts);
                        y18.f34297i = 1;
                        arrayList10.add(y18);
                        w41 y19 = w41.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y19.K(l0Var.F.sell_gifts);
                        y19.f34297i = 1;
                        arrayList10.add(y19);
                        w41 y20 = w41.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y20.K(l0Var.F.change_gift_settings);
                        y20.f34297i = 1;
                        arrayList10.add(y20);
                        w41 y21 = w41.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y21.K(l0Var.F.transfer_and_upgrade_gifts);
                        y21.f34297i = 1;
                        arrayList10.add(y21);
                        w41 y22 = w41.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y22.K(l0Var.F.transfer_stars);
                        y22.f34297i = 1;
                        arrayList10.add(y22);
                    }
                    w41 m13 = w41.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    m13.K(l0Var.F.manage_stories);
                    m13.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = l0Var;
                                    l0Var2.I = null;
                                    l0Var2.f47862c.U2.N(true);
                                    l0Var2.Y(true);
                                    return;
                                case 1:
                                    l0 l0Var3 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = l0Var3.F;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    l0Var3.f47862c.U2.N(true);
                                    l0Var3.Y(true);
                                    return;
                                case 2:
                                    l0 l0Var4 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = l0Var4.F;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        l0Var4.f47862c.U2.N(true);
                                        l0Var4.Y(true);
                                        return;
                                    }
                                    l0Var4.X(-14, true, new h0(l0Var4, 2));
                                    return;
                                case 3:
                                    l0 l0Var5 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = l0Var5.F;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        l0Var5.f47862c.U2.N(true);
                                        l0Var5.Y(true);
                                        return;
                                    }
                                    l0Var5.X(-17, true, new h0(l0Var5, 1));
                                    return;
                                default:
                                    l0 l0Var6 = l0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = l0Var6.F;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    l0Var6.f47862c.U2.N(true);
                                    l0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList10.add(m13);
                    k51Var9.T();
                    arrayList10.add(w41.A(-4, null));
                    arrayList10.add(w41.A(-5, null));
                    arrayList10.add(w41.A(-6, null));
                    arrayList10.add(w41.A(-7, null));
                    return;
                }
                return;
            case 20:
                sf.n0.U((sf.n0) this.f18622b, (ArrayList) obj, (k51) obj2);
                return;
            case 21:
                sf.v0 v0Var = (sf.v0) this.f18622b;
                ArrayList arrayList11 = (ArrayList) obj;
                k51 k51Var10 = (k51) obj2;
                String string7 = LocaleController.getString(R.string.BusinessLocation);
                String string8 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i27 = R.raw.biz_map;
                w41 w41Var6 = new w41(2);
                w41Var6.f34300l = string7;
                w41Var6.f34303o = string8;
                w41Var6.f34299k = i27;
                arrayList11.add(w41Var6);
                arrayList11.add(w41.k(v0Var.f47972e));
                arrayList11.add(w41.B(null));
                w41 i28 = w41.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                if (v0Var.f47978x != null) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                i28.K(z22);
                arrayList11.add(i28);
                if (v0Var.f47978x != null) {
                    arrayList11.add(w41.k(v0Var.h));
                }
                arrayList11.add(w41.B(null));
                if (v0Var.f47977w != null && (v0Var.f47978x != null || !TextUtils.isEmpty(v0Var.f47979y))) {
                    z23 = true;
                }
                v0Var.C = z23;
                if (z23) {
                    w41 e10 = w41.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e10.f34306r = true;
                    arrayList11.add(e10);
                    arrayList11.add(w41.B(null));
                }
                v0Var.U(true);
                return;
            case 22:
                k51 k51Var11 = (k51) obj2;
                sf.x0.V((sf.x0) this.f18622b, (ArrayList) obj);
                return;
            case 23:
                sf.z0 z0Var = (sf.z0) this.f18622b;
                ArrayList arrayList12 = (ArrayList) obj;
                k51 k51Var12 = (k51) obj2;
                ArrayList arrayList13 = z0Var.f48013b;
                String string9 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                w41 w41Var7 = new w41(9);
                w41Var7.d = -1;
                w41Var7.f34300l = string9;
                w41Var7.K(z0Var.f48018r);
                arrayList12.add(w41Var7);
                arrayList12.add(w41.B(null));
                if (z0Var.f48018r) {
                    for (int i29 = 0; i29 < arrayList13.size(); i29++) {
                        if (i29 > 0) {
                            arrayList12.add(w41.B(null));
                        }
                        sf.w0 w0Var = (sf.w0) arrayList13.get(i29);
                        if (!z0Var.U()) {
                            int i30 = i29 * 3;
                            arrayList12.add(w41.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), sf.w0.a(w0Var.f47997a), i30));
                            arrayList12.add(w41.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), sf.w0.a(w0Var.f47998b), i30 + 1));
                            w41 e11 = w41.e(i30 + 2, LocaleController.getString(R.string.Remove));
                            e11.f34306r = true;
                            arrayList12.add(e11);
                        }
                    }
                    if (z0Var.V()) {
                        arrayList12.add(w41.B(null));
                        w41 c6 = w41.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c6.f34305q = true;
                        arrayList12.add(c6);
                    }
                    th.A(R.string.BusinessHoursDayInfo, arrayList12);
                    return;
                }
                return;
            case 24:
                sf.u1.V((sf.u1) this.f18622b, (ArrayList) obj, (k51) obj2);
                return;
            case 25:
                a(obj, obj2);
                return;
            case 26:
                k51 k51Var13 = (k51) obj2;
                ((ArrayList) obj).add(w41.j(0, ((sh.b) this.f18622b).T));
                return;
            case 27:
                String str7 = (String) obj;
                Utilities.themeQueue.postRunnable(new sf.o1(3, (String[]) this.f18622b, (Utilities.Callback2) obj2));
                return;
            case 28:
                th.v vVar = (th.v) this.f18622b;
                ArrayList arrayList14 = (ArrayList) obj;
                k51 k51Var14 = (k51) obj2;
                arrayList14.add(w41.j(1, vVar.W));
                arrayList14.add(w41.j(3, vVar.Z));
                if (vVar.f48809e0 != null) {
                    arrayList14.add(w41.j(2, vVar.X));
                    return;
                }
                return;
            default:
                th.p3.I1((th.p3[]) this.f18622b, (ArrayList) obj, (k51) obj2);
                return;
        }
    }
}
