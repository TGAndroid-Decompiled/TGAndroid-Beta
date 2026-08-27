package lh;

import android.content.SharedPreferences;
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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.gy;
import org.telegram.ui.yf;
import org.telegram.ui.zh1;

public final class a8 implements Utilities.Callback2 {

    public final int f15647a;

    public final Object f15648b;

    public a8(Object obj, int i10) {
        this.f15647a = i10;
        this.f15648b = obj;
    }

    private final void a(Object obj, Object obj2) {
        qf.w0 w0Var = (qf.w0) this.f15648b;
        ArrayList arrayList = (ArrayList) obj;
        String string = LocaleController.getString(R.string.BusinessLocation);
        String string2 = LocaleController.getString(R.string.BusinessLocationInfo);
        int i10 = R.raw.biz_map;
        n41 n41Var = new n41(2);
        n41Var.f30844l = string;
        n41Var.f30847o = string2;
        n41Var.f30843k = i10;
        arrayList.add(n41Var);
        arrayList.add(n41.k(w0Var.f46473e));
        arrayList.add(n41.B(null));
        n41 n41VarI = n41.i(1, LocaleController.getString(R.string.BusinessLocationMap));
        boolean z10 = false;
        n41VarI.K(w0Var.f46479x != null);
        arrayList.add(n41VarI);
        if (w0Var.f46479x != null) {
            arrayList.add(n41.k(w0Var.h));
        }
        arrayList.add(n41.B(null));
        if (w0Var.f46478w != null && (w0Var.f46479x != null || !TextUtils.isEmpty(w0Var.f46480y))) {
            z10 = true;
        }
        w0Var.C = z10;
        if (z10) {
            n41 n41VarE = n41.e(2, LocaleController.getString(R.string.BusinessLocationClear));
            n41VarE.f30850r = true;
            arrayList.add(n41VarE);
            arrayList.add(n41.B(null));
        }
        w0Var.U(true);
    }

    private final void b(Object obj, Object obj2) {
        qf.a1 a1Var = (qf.a1) this.f15648b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = a1Var.f46231b;
        String string = LocaleController.getString(R.string.BusinessHoursDayOpen);
        n41 n41Var = new n41(9);
        n41Var.d = -1;
        n41Var.f30844l = string;
        n41Var.K(a1Var.f46236r);
        arrayList.add(n41Var);
        arrayList.add(n41.B(null));
        if (a1Var.f46236r) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (i10 > 0) {
                    arrayList.add(n41.B(null));
                }
                qf.x0 x0Var = (qf.x0) arrayList2.get(i10);
                if (!a1Var.U()) {
                    int i11 = i10 * 3;
                    arrayList.add(n41.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), qf.x0.a(x0Var.f46493a), i11));
                    arrayList.add(n41.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), qf.x0.a(x0Var.f46494b), i11 + 1));
                    n41 n41VarE = n41.e(i11 + 2, LocaleController.getString(R.string.Remove));
                    n41VarE.f30850r = true;
                    arrayList.add(n41VarE);
                }
            }
            if (a1Var.V()) {
                arrayList.add(n41.B(null));
                n41 n41VarC = n41.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                n41VarC.f30849q = true;
                arrayList.add(n41VarC);
            }
            org.telegram.ui.Cells.pa.A(R.string.BusinessHoursDayInfo, arrayList);
        }
    }

    private final void c(Object obj, Object obj2) {
        qf.s1.V((qf.s1) this.f15648b, (ArrayList) obj, (b51) obj2);
    }

    private final void d(Object obj, Object obj2) {
        qh.a aVar = (qh.a) this.f15648b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(n41.D(0, AndroidUtilities.dp(12.0f)));
        arrayList.add(n41.j(1, aVar.V));
        arrayList.add(n41.D(2, AndroidUtilities.dp(12.0f)));
        arrayList.add(n41.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
        aVar.Y = arrayList.size();
        String string = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
        boolean z10 = aVar.X;
        n41 n41VarX = n41.x(151, string, LocaleController.getString(z10 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
        n41VarX.K(true ^ aVar.U);
        arrayList.add(n41VarX);
        n41 n41VarX2 = n41.x(150, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z10 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
        n41VarX2.K(aVar.U);
        arrayList.add(n41VarX2);
        arrayList.add(n41.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
    }

    private final void e(Object obj, Object obj2) {
        ((ArrayList) obj).add(n41.j(0, ((qh.b) this.f15648b).T));
    }

    private final void f(Object obj, Object obj2) {
        Utilities.themeQueue.postRunnable(new zh1(26, (String[]) this.f15648b, (Utilities.Callback2) obj2));
    }

    private final void g(Object obj, Object obj2) {
        rh.v vVar = (rh.v) this.f15648b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(n41.j(1, vVar.W));
        arrayList.add(n41.j(3, vVar.Z));
        if (vVar.f47511e0 != null) {
            arrayList.add(n41.j(2, vVar.X));
        }
    }

    private final void h(Object obj, Object obj2) {
        rh.p3.I1((rh.p3[]) this.f15648b, (ArrayList) obj, (b51) obj2);
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String upperCase;
        boolean z10;
        b51 b51Var;
        int i10;
        boolean z11;
        int i11 = this.f15647a;
        int i12 = 24;
        String lowerCase = "";
        int iMax = -1;
        final int i13 = 0;
        final int i14 = 1;
        Object obj3 = this.f15648b;
        switch (i11) {
            case 0:
                j8 j8Var = (j8) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (j8Var.f16198d0 || j8Var.f16197c0 != null) {
                    TLRPC.WebPage webPage = j8Var.f16197c0;
                    b8 b8Var = new b8(j8Var, 0);
                    int i15 = h8.f16076a;
                    n41 n41VarJ = n41.J(h8.class);
                    n41VarJ.G = webPage;
                    n41VarJ.D = b8Var;
                    arrayList.add(n41VarJ);
                }
                arrayList.add(n41.k(j8Var.U));
                arrayList.add(n41.A(1, null));
                n41 n41VarI = n41.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                n41VarI.K(j8Var.f16203i0);
                arrayList.add(n41VarI);
                if (j8Var.f16203i0) {
                    arrayList.add(n41.k(j8Var.V));
                }
                arrayList.add(n41.A(3, null));
                arrayList.add(n41.k(j8Var.W));
                break;
            case 1:
                sb sbVar = (sb) obj3;
                Float f10 = (Float) obj2;
                long duration = sbVar.T0.getDuration() < 100 ? sbVar.G1.f17211h0 : sbVar.T0.getDuration();
                float fFloatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                z7 z7Var = sbVar.G1;
                float f11 = z7Var.f17194a0;
                float f12 = z7Var.Z;
                float f13 = (f11 - f12) * fFloatValue;
                float f14 = duration;
                long j10 = (long) (f13 * f14);
                hb hbVar = sbVar.T0;
                long j11 = (long) ((f12 * f14) + j10);
                sbVar.I1 = j11;
                hbVar.m(j11);
                va vaVar = sbVar.f16798r1;
                if (vaVar != null) {
                    vaVar.setCoverTime(sbVar.I1);
                }
                z7 z7Var2 = sbVar.G1;
                if (z7Var2 != null && z7Var2.f17209g) {
                    z7Var2.f17214j = true;
                    break;
                }
                break;
            case 2:
                ((vb) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 3:
                ((mh.g) obj3).C0((ArrayList) obj, (b51) obj2);
                break;
            case 4:
                mh.f fVar = (mh.f) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(n41.k(fVar.U));
                arrayList2.add(n41.k(fVar.V));
                break;
            case 5:
                ((nh.k) obj3).E0((ArrayList) obj, (b51) obj2);
                break;
            case 6:
                nh.s.U((nh.s) obj3, (ArrayList) obj);
                break;
            case 7:
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) obj3;
                String strSubstring = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb2 = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb2.append("~");
                    sb2.append(AndroidUtilities.formatFileSize(l10.longValue()));
                }
                if (strSubstring == null) {
                    upperCase = null;
                } else {
                    if (!strSubstring.isEmpty()) {
                        switch (strSubstring) {
                            case "application/epub+zip":
                                lowerCase = "epub";
                                break;
                            case "application/vnd.oasis.opendocument.text":
                                lowerCase = "odt";
                                break;
                            case "video/3gpp":
                            case "audio/3gpp":
                                lowerCase = "3gp";
                                break;
                            case "application/vnd.ms-fontobject":
                                lowerCase = "eot";
                                break;
                            case "application/x-cdf":
                                lowerCase = "cda";
                                break;
                            case "application/x-csh":
                                lowerCase = "csh";
                                break;
                            case "video/x-msvideo":
                                lowerCase = "avi";
                                break;
                            case "application/vnd.openxmlformats-officedocument.presentationml.presentation":
                                lowerCase = "pptx";
                                break;
                            case "application/vnd.ms-powerpoint":
                                lowerCase = "ppt";
                                break;
                            case "application/vnd.openxmlformats-officedocument.wordprocessingml.document":
                                lowerCase = "docx";
                                break;
                            case "audio/x-midi":
                                lowerCase = "midi";
                                break;
                            case "text/calendar":
                                lowerCase = "ics";
                                break;
                            case "application/x-httpd-php":
                                lowerCase = "php";
                                break;
                            case "audio/3gpp2":
                            case "video/3gpp2":
                                lowerCase = "3g2";
                                break;
                            case "application/vnd.apple.installer+xml":
                                lowerCase = "mpkg";
                                break;
                            case "application/vnd.ms-excel":
                                lowerCase = "xls";
                                break;
                            case "application/gzip":
                            case "application/x-gzip":
                                lowerCase = "gz";
                                break;
                            case "application/x-sh":
                                lowerCase = "sh";
                                break;
                            case "audio/ogg":
                                lowerCase = "opus";
                                break;
                            case "text/plain":
                                lowerCase = "txt";
                                break;
                            case "application/x-abiword":
                                lowerCase = "abw";
                                break;
                            case "application/ld+json":
                                lowerCase = "jsonld";
                                break;
                            case "application/msword":
                                lowerCase = "doc";
                                break;
                            case "application/x-bzip":
                                lowerCase = "bz";
                                break;
                            case "application/octet-stream":
                                lowerCase = "bin";
                                break;
                            case "application/x-bzip2":
                                lowerCase = "bz2";
                                break;
                            case "application/vnd.oasis.opendocument.presentation":
                                lowerCase = "odp";
                                break;
                            case "application/x-7z-compressed":
                                lowerCase = "7z";
                                break;
                            case "application/x-freearc":
                                lowerCase = "arc";
                                break;
                            case "audio/mpeg":
                                lowerCase = "mp3";
                                break;
                            case "application/vnd.rar":
                                lowerCase = "rar";
                                break;
                            case "image/vnd.microsoft.icon":
                                lowerCase = "ico";
                                break;
                            case "application/vnd.oasis.opendocument.spreadsheet":
                                lowerCase = "ods";
                                break;
                            case "application/vnd.amazon.ebook":
                                lowerCase = "azw";
                                break;
                            case "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet":
                                lowerCase = "xlsx";
                                break;
                            case "application/java-archive":
                                lowerCase = "jar";
                                break;
                            case "text/javascript":
                                lowerCase = "js";
                                break;
                            default:
                                if (strSubstring.contains("/")) {
                                    strSubstring = strSubstring.substring(strSubstring.indexOf("/") + 1);
                                }
                                if (strSubstring.contains("-")) {
                                    strSubstring = strSubstring.substring(strSubstring.indexOf("-") + 1);
                                }
                                if (strSubstring.contains("+")) {
                                    strSubstring = strSubstring.substring(0, strSubstring.indexOf("+"));
                                }
                                lowerCase = strSubstring.toLowerCase();
                                break;
                        }
                    }
                    upperCase = lowerCase.toUpperCase();
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
                j6Var.setText(sb2);
                break;
            case 8:
                nh.k1 k1Var = (nh.k1) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(n41.j(-1, k1Var.W));
                arrayList3.add(n41.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, k1Var.U))));
                break;
            case 9:
                nh.b3 b3Var = (nh.b3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    b3Var.getClass();
                } else {
                    nh.q4 q4Var = b3Var.f18591r0;
                    if (q4Var != null) {
                        q4Var.a(tL_webViewResultUrl);
                        b3Var.n();
                    }
                }
                break;
            case 10:
                ((nh.s3) obj3).F0((ArrayList) obj, (b51) obj2);
                break;
            case 11:
                ((nh.p4) obj3).U((ArrayList) obj, (b51) obj2);
                break;
            case 12:
                ((oh.r) obj3).v.c((ArrayList) obj);
                break;
            case 13:
                final org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.web.j jVar = lVar.f43902y;
                ArrayList arrayList5 = lVar.f43901x;
                if (!lVar.f43893b && arrayList5.isEmpty()) {
                    arrayList4.add(n41.k(lVar.d));
                }
                SharedPreferences sharedPreferences = lVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList6 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i16 = 0; i16 < jSONArray.length(); i16++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i16);
                            org.telegram.ui.web.k kVar = new org.telegram.ui.web.k(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            kVar.f43886c = jSONObject.optDouble("rank", 0.0d);
                            arrayList7.add(kVar);
                        }
                        Collections.sort(arrayList7, new lp0(17));
                        int size = arrayList7.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj4 = arrayList7.get(i17);
                            i17++;
                            org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj4;
                            if (arrayList6.size() < 20) {
                                arrayList6.add(kVar2.f43884a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList5.size();
                arrayList6.size();
                if (!arrayList5.isEmpty()) {
                    arrayList4.add(n41.k(lVar.v));
                }
                int i18 = 0;
                while (i18 < arrayList5.size()) {
                    final String str = (String) arrayList5.get(i18);
                    boolean z12 = i18 == 0;
                    boolean z13 = i18 == arrayList5.size() - 1;
                    final int i19 = 0;
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    org.telegram.ui.s sVar = lVar.I;
                                    if (sVar != null) {
                                        sVar.run(str);
                                    }
                                    break;
                                default:
                                    org.telegram.ui.s sVar2 = lVar.I;
                                    if (sVar2 != null) {
                                        sVar2.run(str);
                                    }
                                    break;
                            }
                        }
                    };
                    int i20 = org.telegram.ui.web.e.f43816a;
                    n41 n41VarJ2 = n41.J(org.telegram.ui.web.e.class);
                    n41VarJ2.f30857z = 1;
                    n41VarJ2.f30844l = str;
                    n41VarJ2.D = onClickListener;
                    n41VarJ2.f30849q = z12;
                    n41VarJ2.f30850r = z13;
                    n41VarJ2.G = Boolean.TRUE;
                    n41VarJ2.H = lVar;
                    arrayList4.add(n41VarJ2);
                    i18++;
                }
                if (!arrayList6.isEmpty()) {
                    arrayList4.add(n41.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new c5(lVar, 14)));
                    int i21 = 0;
                    while (i21 < arrayList6.size()) {
                        final String str2 = (String) arrayList6.get(i21);
                        boolean z14 = i21 == 0;
                        boolean z15 = i21 == arrayList6.size() - 1;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                switch (i14) {
                                    case 0:
                                        org.telegram.ui.s sVar = lVar.I;
                                        if (sVar != null) {
                                            sVar.run(str2);
                                        }
                                        break;
                                    default:
                                        org.telegram.ui.s sVar2 = lVar.I;
                                        if (sVar2 != null) {
                                            sVar2.run(str2);
                                        }
                                        break;
                                }
                            }
                        };
                        int i22 = org.telegram.ui.web.e.f43816a;
                        n41 n41VarJ3 = n41.J(org.telegram.ui.web.e.class);
                        n41VarJ3.f30857z = 0;
                        n41VarJ3.f30844l = str2;
                        n41VarJ3.D = onClickListener2;
                        n41VarJ3.f30849q = z14;
                        n41VarJ3.f30850r = z15;
                        n41VarJ3.G = Boolean.TRUE;
                        n41VarJ3.H = lVar;
                        arrayList4.add(n41VarJ3);
                        i21++;
                    }
                }
                if (jVar != null) {
                    ArrayList arrayList8 = jVar.f43873a;
                    if (!arrayList8.isEmpty()) {
                        arrayList4.add(n41.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                        for (int i23 = 0; i23 < arrayList8.size(); i23++) {
                            MessageObject messageObject = (MessageObject) arrayList8.get(i23);
                            if (!TextUtils.isEmpty(org.telegram.ui.web.l.a(messageObject))) {
                                int i24 = org.telegram.ui.web.h.f43844a;
                                n41 n41VarJ4 = n41.J(org.telegram.ui.web.h.class);
                                n41VarJ4.f30857z = 3;
                                n41VarJ4.f30849q = true;
                                n41VarJ4.H = messageObject;
                                arrayList4.add(n41VarJ4);
                            }
                        }
                        if (!jVar.f43877f) {
                            arrayList4.add(n41.o(arrayList4.size(), 32));
                            arrayList4.add(n41.o(arrayList4.size(), 32));
                            arrayList4.add(n41.o(arrayList4.size(), 32));
                        }
                    }
                }
                break;
            case 14:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                cn0 cn0Var = (cn0) ((pf.z) obj3);
                gy gyVar = cn0Var.E0;
                AndroidUtilities.hideKeyboard(gyVar.getParentActivity().getCurrentFocus());
                b70 b70VarI = b70.I(gyVar, (org.telegram.ui.Cells.e6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                } else {
                    b70 b70VarJ = b70VarI.J();
                    b70VarJ.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new mb0(b70VarI, i12), false);
                    b70VarJ.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        b70VarJ.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            b70VarJ.k();
                        }
                        b70VarJ.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    z10 = false;
                    b70VarI.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new gh.f3(b70VarI, b70VarJ, 7), false);
                }
                b70VarI.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new yf(cn0Var, gyVar, cn0Var.F0, b70VarI, 24), z10);
                b70VarI.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new yf(cn0Var, gyVar, tL_sponsoredPeer, b70VarI, 25), z10);
                b70VarI.k();
                b70VarI.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new org.telegram.ui.ActionBar.i3(cn0Var, gyVar, b70VarI, 27), z10);
                b70VarI.V(LocaleController.isRTL ? 3 : 5);
                b70VarI.Y = true;
                b70VarI.f26993t = z10;
                b70VarI.Z();
                break;
            case 15:
                qf.e.U((qf.e) obj3, (ArrayList) obj, (b51) obj2);
                break;
            case 16:
                qf.m mVar = (qf.m) obj3;
                mVar.H.dismiss();
                mVar.f46358y = (String) obj;
                mVar.A = (TLRPC.InputDocument) obj2;
                mVar.f46356w = false;
                AndroidUtilities.cancelRunOnUIThread(mVar.d);
                mVar.f46353n.setSticker(mVar.f46358y);
                mVar.e0(true);
                e51 e51Var = mVar.f28261a;
                if (e51Var != null && (b51Var = e51Var.U2) != null) {
                    b51Var.N(true);
                    break;
                }
                break;
            case 17:
                qf.g0 g0Var = (qf.g0) obj3;
                ArrayList arrayList9 = (ArrayList) obj;
                b51 b51Var2 = (b51) obj2;
                b51Var2.A = 1;
                LinearLayout linearLayout = g0Var.W;
                n41 n41Var = new n41(-4);
                n41Var.d = -5;
                n41Var.f30837c = linearLayout;
                n41Var.f30857z = -1;
                arrayList9.add(n41Var);
                TL_account.TL_connectedBot tL_connectedBot = g0Var.T;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        org.telegram.ui.Cells.pa.o(R.string.SessionBotConnectedFrom, arrayList9);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList9.add(n41.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList9.add(n41.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList9.add(n41.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList9.add(n41.B(null));
                    }
                    b51Var2.U();
                    org.telegram.ui.Cells.pa.o(R.string.BusinessBotChats2, arrayList9);
                    int i25 = qf.g0.f46303c0;
                    n41 n41VarW = n41.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    n41VarW.K(g0Var.f46305a0);
                    arrayList9.add(n41VarW);
                    int i26 = qf.g0.f46304d0;
                    n41 n41VarW2 = n41.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    n41VarW2.K(!g0Var.f46305a0);
                    arrayList9.add(n41VarW2);
                    b51Var2.T();
                    arrayList9.add(n41.B(null));
                    qf.x xVar = g0Var.V;
                    if (xVar != null) {
                        xVar.a(arrayList9, b51Var2, true);
                    }
                    org.telegram.ui.Cells.pa.A(R.string.BusinessBotChatsInfo2, arrayList9);
                }
                break;
            case 18:
                final qf.m0 m0Var = (qf.m0) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                b51 b51Var3 = (b51) obj2;
                LongSparseArray longSparseArray = m0Var.J;
                String string2 = LocaleController.getString(R.string.BusinessBots2);
                String string3 = LocaleController.getString(R.string.BusinessBots2Info);
                n41 n41Var2 = new n41(2);
                n41Var2.f30844l = string2;
                n41Var2.f30847o = string3;
                n41Var2.f30845m = "tg_superplaceholders_android_2";
                n41Var2.f30846n = "🤖🏝️";
                n41Var2.f30857z = 120;
                arrayList10.add(n41Var2);
                if (m0Var.I != null) {
                    b51Var3.U();
                    long j12 = m0Var.I.f22527id;
                    n41 n41Var3 = new n41(13);
                    n41Var3.f30855x = j12;
                    n41Var3.K(true);
                    n41Var3.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.f46372c.U2.N(true);
                                    m0Var2.Y(true);
                                    break;
                                case 1:
                                    m0 m0Var3 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = m0Var3.F;
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
                                    m0Var3.f46372c.U2.N(true);
                                    m0Var3.Y(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = m0Var4.F;
                                    if (tL_businessBotRights2.edit_name && tL_businessBotRights2.edit_bio && tL_businessBotRights2.edit_profile_photo && tL_businessBotRights2.edit_username) {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        m0Var4.f46372c.U2.N(true);
                                        m0Var4.Y(true);
                                    } else {
                                        m0Var4.X(-14, true, new i0(m0Var4, 2));
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = m0Var5.F;
                                    if (tL_businessBotRights3.view_gifts && tL_businessBotRights3.sell_gifts && tL_businessBotRights3.change_gift_settings && tL_businessBotRights3.transfer_and_upgrade_gifts && tL_businessBotRights3.transfer_stars) {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        m0Var5.f46372c.U2.N(true);
                                        m0Var5.Y(true);
                                    } else {
                                        m0Var5.X(-17, true, new i0(m0Var5, 1));
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = m0Var6.F;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    m0Var6.f46372c.U2.N(true);
                                    m0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(n41Var3);
                    b51Var3.T();
                } else {
                    b51Var3.U();
                    arrayList10.add(n41.k(m0Var.f46373e));
                    longSparseArray.clear();
                    boolean z16 = false;
                    for (int i27 = 0; i27 < m0Var.d.d.size(); i27++) {
                        TLObject tLObject = (TLObject) m0Var.d.d.get(i27);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j13 = user.f22527id;
                                String str3 = m0Var.f46380y;
                                n41 n41Var4 = new n41(13);
                                n41Var4.f30855x = j13;
                                n41Var4.f30846n = str3;
                                arrayList10.add(n41Var4);
                                longSparseArray.put(user.f22527id, user);
                                z16 = true;
                            }
                        }
                    }
                    for (int i28 = 0; i28 < m0Var.d.f45839e.size(); i28++) {
                        TLObject tLObject2 = (TLObject) m0Var.d.f45839e.get(i28);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.f22527id;
                                String str4 = m0Var.f46380y;
                                n41 n41Var5 = new n41(13);
                                n41Var5.f30855x = j14;
                                n41Var5.f30846n = str4;
                                arrayList10.add(n41Var5);
                                longSparseArray.put(user2.f22527id, user2);
                                z16 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(m0Var.f46374f.getText().toString()) || m0Var.d.e() || m0Var.f46379x)) {
                        arrayList10.add(n41.k(m0Var.f46375n));
                        z16 = true;
                    }
                    m0Var.h.setVisibility(z16 ? 0 : 8);
                    b51Var3.T();
                }
                arrayList10.add(n41.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                b51Var3.U();
                n41 n41VarT = n41.t(LocaleController.getString(R.string.BusinessBotChats2));
                n41VarT.f30840g = m0Var.I != null;
                arrayList10.add(n41VarT);
                n41 n41VarW3 = n41.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                n41VarW3.K(m0Var.E);
                n41VarW3.f30840g = m0Var.I != null;
                arrayList10.add(n41VarW3);
                n41 n41VarW4 = n41.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                n41VarW4.K(!m0Var.E);
                n41VarW4.f30840g = m0Var.I != null;
                arrayList10.add(n41VarW4);
                b51Var3.T();
                arrayList10.add(n41.B(null));
                m0Var.v.a(arrayList10, b51Var3, m0Var.I != null);
                org.telegram.ui.Cells.pa.A(R.string.BusinessBotChatsInfo2, arrayList10);
                if (m0Var.I != null) {
                    b51Var3.U();
                    org.telegram.ui.Cells.pa.o(R.string.BusinessBotPermissions, arrayList10);
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = m0Var.F;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    n41 n41VarM = n41.m(-4, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = m0Var.F;
                    n41VarM.K(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    n41VarM.f30839f = !m0Var.L;
                    n41VarM.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.f46372c.U2.N(true);
                                    m0Var2.Y(true);
                                    break;
                                case 1:
                                    m0 m0Var3 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = m0Var3.F;
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
                                    m0Var3.f46372c.U2.N(true);
                                    m0Var3.Y(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = m0Var4.F;
                                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                                        tL_businessBotRights4.edit_username = false;
                                        tL_businessBotRights4.edit_profile_photo = false;
                                        tL_businessBotRights4.edit_bio = false;
                                        tL_businessBotRights4.edit_name = false;
                                        m0Var4.f46372c.U2.N(true);
                                        m0Var4.Y(true);
                                    } else {
                                        m0Var4.X(-14, true, new i0(m0Var4, 2));
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights5 = m0Var5.F;
                                    if (tL_businessBotRights5.view_gifts && tL_businessBotRights5.sell_gifts && tL_businessBotRights5.change_gift_settings && tL_businessBotRights5.transfer_and_upgrade_gifts && tL_businessBotRights5.transfer_stars) {
                                        tL_businessBotRights5.transfer_stars = false;
                                        tL_businessBotRights5.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights5.change_gift_settings = false;
                                        tL_businessBotRights5.sell_gifts = false;
                                        tL_businessBotRights5.view_gifts = false;
                                        m0Var5.f46372c.U2.N(true);
                                        m0Var5.Y(true);
                                    } else {
                                        m0Var5.X(-17, true, new i0(m0Var5, 1));
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights6 = m0Var6.F;
                                    tL_businessBotRights6.manage_stories = !tL_businessBotRights6.manage_stories;
                                    m0Var6.f46372c.U2.N(true);
                                    m0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(n41VarM);
                    if (m0Var.L) {
                        n41 n41VarY = n41.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        n41VarY.K(true);
                        n41VarY.f30840g = false;
                        n41VarY.f30841i = 1;
                        arrayList10.add(n41VarY);
                        n41 n41VarY2 = n41.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        n41VarY2.K(m0Var.F.reply);
                        n41VarY2.f30841i = 1;
                        arrayList10.add(n41VarY2);
                        n41 n41VarY3 = n41.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        n41VarY3.K(m0Var.F.read_messages);
                        n41VarY3.f30841i = 1;
                        arrayList10.add(n41VarY3);
                        n41 n41VarY4 = n41.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        n41VarY4.K(m0Var.F.delete_sent_messages);
                        n41VarY4.f30841i = 1;
                        arrayList10.add(n41VarY4);
                        n41 n41VarY5 = n41.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        n41VarY5.K(m0Var.F.delete_received_messages);
                        n41VarY5.f30841i = 1;
                        arrayList10.add(n41VarY5);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = m0Var.F;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    n41 n41VarM2 = n41.m(-10, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = m0Var.F;
                    n41VarM2.K(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    n41VarM2.f30839f = !m0Var.M;
                    final int i29 = 2;
                    n41VarM2.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i29) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.f46372c.U2.N(true);
                                    m0Var2.Y(true);
                                    break;
                                case 1:
                                    m0 m0Var3 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights5 = m0Var3.F;
                                    if (tL_businessBotRights5.reply && tL_businessBotRights5.read_messages && tL_businessBotRights5.delete_received_messages && tL_businessBotRights5.delete_sent_messages) {
                                        tL_businessBotRights5.delete_sent_messages = false;
                                        tL_businessBotRights5.delete_received_messages = false;
                                        tL_businessBotRights5.read_messages = false;
                                        tL_businessBotRights5.reply = false;
                                    } else {
                                        tL_businessBotRights5.delete_sent_messages = true;
                                        tL_businessBotRights5.delete_received_messages = true;
                                        tL_businessBotRights5.read_messages = true;
                                        tL_businessBotRights5.reply = true;
                                    }
                                    m0Var3.f46372c.U2.N(true);
                                    m0Var3.Y(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights6 = m0Var4.F;
                                    if (tL_businessBotRights6.edit_name && tL_businessBotRights6.edit_bio && tL_businessBotRights6.edit_profile_photo && tL_businessBotRights6.edit_username) {
                                        tL_businessBotRights6.edit_username = false;
                                        tL_businessBotRights6.edit_profile_photo = false;
                                        tL_businessBotRights6.edit_bio = false;
                                        tL_businessBotRights6.edit_name = false;
                                        m0Var4.f46372c.U2.N(true);
                                        m0Var4.Y(true);
                                    } else {
                                        m0Var4.X(-14, true, new i0(m0Var4, 2));
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights7 = m0Var5.F;
                                    if (tL_businessBotRights7.view_gifts && tL_businessBotRights7.sell_gifts && tL_businessBotRights7.change_gift_settings && tL_businessBotRights7.transfer_and_upgrade_gifts && tL_businessBotRights7.transfer_stars) {
                                        tL_businessBotRights7.transfer_stars = false;
                                        tL_businessBotRights7.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights7.change_gift_settings = false;
                                        tL_businessBotRights7.sell_gifts = false;
                                        tL_businessBotRights7.view_gifts = false;
                                        m0Var5.f46372c.U2.N(true);
                                        m0Var5.Y(true);
                                    } else {
                                        m0Var5.X(-17, true, new i0(m0Var5, 1));
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var6.F;
                                    tL_businessBotRights8.manage_stories = !tL_businessBotRights8.manage_stories;
                                    m0Var6.f46372c.U2.N(true);
                                    m0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(n41VarM2);
                    if (m0Var.M) {
                        n41 n41VarY6 = n41.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        n41VarY6.K(m0Var.F.edit_name);
                        n41VarY6.f30841i = 1;
                        arrayList10.add(n41VarY6);
                        n41 n41VarY7 = n41.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        n41VarY7.K(m0Var.F.edit_bio);
                        n41VarY7.f30841i = 1;
                        arrayList10.add(n41VarY7);
                        n41 n41VarY8 = n41.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        n41VarY8.K(m0Var.F.edit_profile_photo);
                        n41VarY8.f30841i = 1;
                        arrayList10.add(n41VarY8);
                        n41 n41VarY9 = n41.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        n41VarY9.K(m0Var.F.edit_username);
                        n41VarY9.f30841i = 1;
                        arrayList10.add(n41VarY9);
                    }
                    String string6 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = m0Var.F;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    n41 n41VarM3 = n41.m(-15, string6, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = m0Var.F;
                    n41VarM3.K(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    n41VarM3.f30839f = !m0Var.N;
                    final int i30 = 3;
                    n41VarM3.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i30) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.f46372c.U2.N(true);
                                    m0Var2.Y(true);
                                    break;
                                case 1:
                                    m0 m0Var3 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights7 = m0Var3.F;
                                    if (tL_businessBotRights7.reply && tL_businessBotRights7.read_messages && tL_businessBotRights7.delete_received_messages && tL_businessBotRights7.delete_sent_messages) {
                                        tL_businessBotRights7.delete_sent_messages = false;
                                        tL_businessBotRights7.delete_received_messages = false;
                                        tL_businessBotRights7.read_messages = false;
                                        tL_businessBotRights7.reply = false;
                                    } else {
                                        tL_businessBotRights7.delete_sent_messages = true;
                                        tL_businessBotRights7.delete_received_messages = true;
                                        tL_businessBotRights7.read_messages = true;
                                        tL_businessBotRights7.reply = true;
                                    }
                                    m0Var3.f46372c.U2.N(true);
                                    m0Var3.Y(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var4.F;
                                    if (tL_businessBotRights8.edit_name && tL_businessBotRights8.edit_bio && tL_businessBotRights8.edit_profile_photo && tL_businessBotRights8.edit_username) {
                                        tL_businessBotRights8.edit_username = false;
                                        tL_businessBotRights8.edit_profile_photo = false;
                                        tL_businessBotRights8.edit_bio = false;
                                        tL_businessBotRights8.edit_name = false;
                                        m0Var4.f46372c.U2.N(true);
                                        m0Var4.Y(true);
                                    } else {
                                        m0Var4.X(-14, true, new i0(m0Var4, 2));
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var5.F;
                                    if (tL_businessBotRights9.view_gifts && tL_businessBotRights9.sell_gifts && tL_businessBotRights9.change_gift_settings && tL_businessBotRights9.transfer_and_upgrade_gifts && tL_businessBotRights9.transfer_stars) {
                                        tL_businessBotRights9.transfer_stars = false;
                                        tL_businessBotRights9.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights9.change_gift_settings = false;
                                        tL_businessBotRights9.sell_gifts = false;
                                        tL_businessBotRights9.view_gifts = false;
                                        m0Var5.f46372c.U2.N(true);
                                        m0Var5.Y(true);
                                    } else {
                                        m0Var5.X(-17, true, new i0(m0Var5, 1));
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var6.F;
                                    tL_businessBotRights10.manage_stories = !tL_businessBotRights10.manage_stories;
                                    m0Var6.f46372c.U2.N(true);
                                    m0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(n41VarM3);
                    if (m0Var.N) {
                        n41 n41VarY10 = n41.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        n41VarY10.K(m0Var.F.view_gifts);
                        n41VarY10.f30841i = 1;
                        arrayList10.add(n41VarY10);
                        n41 n41VarY11 = n41.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        n41VarY11.K(m0Var.F.sell_gifts);
                        n41VarY11.f30841i = 1;
                        arrayList10.add(n41VarY11);
                        n41 n41VarY12 = n41.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        n41VarY12.K(m0Var.F.change_gift_settings);
                        n41VarY12.f30841i = 1;
                        arrayList10.add(n41VarY12);
                        n41 n41VarY13 = n41.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        n41VarY13.K(m0Var.F.transfer_and_upgrade_gifts);
                        n41VarY13.f30841i = 1;
                        arrayList10.add(n41VarY13);
                        n41 n41VarY14 = n41.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        n41VarY14.K(m0Var.F.transfer_stars);
                        n41VarY14.f30841i = 1;
                        arrayList10.add(n41VarY14);
                    }
                    n41 n41VarM4 = n41.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    n41VarM4.K(m0Var.F.manage_stories);
                    final int i31 = 4;
                    n41VarM4.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i31) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.f46372c.U2.N(true);
                                    m0Var2.Y(true);
                                    break;
                                case 1:
                                    m0 m0Var3 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights7 = m0Var3.F;
                                    if (tL_businessBotRights7.reply && tL_businessBotRights7.read_messages && tL_businessBotRights7.delete_received_messages && tL_businessBotRights7.delete_sent_messages) {
                                        tL_businessBotRights7.delete_sent_messages = false;
                                        tL_businessBotRights7.delete_received_messages = false;
                                        tL_businessBotRights7.read_messages = false;
                                        tL_businessBotRights7.reply = false;
                                    } else {
                                        tL_businessBotRights7.delete_sent_messages = true;
                                        tL_businessBotRights7.delete_received_messages = true;
                                        tL_businessBotRights7.read_messages = true;
                                        tL_businessBotRights7.reply = true;
                                    }
                                    m0Var3.f46372c.U2.N(true);
                                    m0Var3.Y(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights8 = m0Var4.F;
                                    if (tL_businessBotRights8.edit_name && tL_businessBotRights8.edit_bio && tL_businessBotRights8.edit_profile_photo && tL_businessBotRights8.edit_username) {
                                        tL_businessBotRights8.edit_username = false;
                                        tL_businessBotRights8.edit_profile_photo = false;
                                        tL_businessBotRights8.edit_bio = false;
                                        tL_businessBotRights8.edit_name = false;
                                        m0Var4.f46372c.U2.N(true);
                                        m0Var4.Y(true);
                                    } else {
                                        m0Var4.X(-14, true, new i0(m0Var4, 2));
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights9 = m0Var5.F;
                                    if (tL_businessBotRights9.view_gifts && tL_businessBotRights9.sell_gifts && tL_businessBotRights9.change_gift_settings && tL_businessBotRights9.transfer_and_upgrade_gifts && tL_businessBotRights9.transfer_stars) {
                                        tL_businessBotRights9.transfer_stars = false;
                                        tL_businessBotRights9.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights9.change_gift_settings = false;
                                        tL_businessBotRights9.sell_gifts = false;
                                        tL_businessBotRights9.view_gifts = false;
                                        m0Var5.f46372c.U2.N(true);
                                        m0Var5.Y(true);
                                    } else {
                                        m0Var5.X(-17, true, new i0(m0Var5, 1));
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights10 = m0Var6.F;
                                    tL_businessBotRights10.manage_stories = !tL_businessBotRights10.manage_stories;
                                    m0Var6.f46372c.U2.N(true);
                                    m0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(n41VarM4);
                    b51Var3.T();
                    arrayList10.add(n41.A(-4, null));
                    arrayList10.add(n41.A(-5, null));
                    arrayList10.add(n41.A(-6, null));
                    arrayList10.add(n41.A(-7, null));
                }
                break;
            case 19:
                qf.o0.U((qf.o0) obj3, (ArrayList) obj, (b51) obj2);
                break;
            case 20:
                a(obj, obj2);
                break;
            case 21:
                qf.y0.V((qf.y0) obj3, (ArrayList) obj);
                break;
            case 22:
                b(obj, obj2);
                break;
            case 23:
                c(obj, obj2);
                break;
            case 24:
                d(obj, obj2);
                break;
            case 25:
                e(obj, obj2);
                break;
            case 26:
                f(obj, obj2);
                break;
            case 27:
                g(obj, obj2);
                break;
            case 28:
                h(obj, obj2);
                break;
            default:
                rh.p3 p3Var = (rh.p3) obj3;
                ((Integer) obj).getClass();
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = p3Var.f47348h3;
                ArrayList arrayList13 = new ArrayList(arrayList11.size());
                int size2 = arrayList11.size();
                int i32 = 0;
                while (i32 < size2) {
                    Object obj5 = arrayList11.get(i32);
                    i32++;
                    Object obj6 = ((n41) obj5).G;
                    if (obj6 instanceof rh.a) {
                        arrayList13.add((rh.a) obj6);
                    }
                }
                if (arrayList13.size() >= 2) {
                    ArrayList arrayList14 = new ArrayList();
                    int size3 = arrayList13.size();
                    int iMin = Integer.MAX_VALUE;
                    int i33 = 0;
                    int i34 = 0;
                    while (i34 < size3) {
                        Object obj7 = arrayList13.get(i34);
                        i34++;
                        rh.a aVar = (rh.a) obj7;
                        int iIndexOf = arrayList12.indexOf(aVar);
                        if (iIndexOf >= 0) {
                            int size4 = iIndexOf + 1;
                            if (rh.p3.x3(aVar) && !((TL_iv.pageBlockDetails) aVar.f47028b).open) {
                                int iP3 = p3Var.P3(iIndexOf);
                                size4 = iP3 >= arrayList12.size() ? arrayList12.size() : iP3 + 1;
                            }
                            arrayList14.add(new ArrayList(arrayList12.subList(iIndexOf, size4)));
                            iMin = Math.min(iMin, iIndexOf);
                            iMax = Math.max(iMax, size4);
                            i33 += size4 - iIndexOf;
                        }
                        break;
                    }
                    if (i33 == iMax - iMin) {
                        ArrayList arrayList15 = new ArrayList(i33);
                        int size5 = arrayList14.size();
                        int i35 = 0;
                        while (i35 < size5) {
                            Object obj8 = arrayList14.get(i35);
                            i35++;
                            arrayList15.addAll((ArrayList) obj8);
                        }
                        for (int i36 = 0; i36 < arrayList15.size(); i36++) {
                            if (arrayList12.get(iMin + i36) != arrayList15.get(i36)) {
                                rh.b2 b2Var = p3Var.F3;
                                if (b2Var != null) {
                                    b2Var.d();
                                }
                                for (int i37 = 0; i37 < arrayList15.size(); i37++) {
                                    arrayList12.set(iMin + i37, (rh.a) arrayList15.get(i37));
                                }
                                rh.a aVar2 = p3Var.O3;
                                ArrayList arrayList16 = rh.p3.f47334o4;
                                if (aVar2 == null) {
                                    z11 = false;
                                } else {
                                    ArrayList arrayList17 = aVar2.f47035k;
                                    int iIndexOf2 = arrayList12.indexOf(aVar2);
                                    if (iIndexOf2 >= 0) {
                                        ArrayList arrayList18 = iIndexOf2 > 0 ? ((rh.a) arrayList12.get(iIndexOf2 - 1)).f47035k : arrayList16;
                                        int i38 = iIndexOf2 + 1;
                                        if (i38 < arrayList12.size()) {
                                            arrayList16 = ((rh.a) arrayList12.get(i38)).f47035k;
                                        }
                                        if (arrayList18.size() < arrayList16.size()) {
                                            arrayList18 = arrayList16;
                                        }
                                        if (arrayList17.equals(arrayList18)) {
                                            z11 = false;
                                        } else {
                                            arrayList17.clear();
                                            arrayList17.addAll(arrayList18);
                                            z11 = true;
                                        }
                                    } else {
                                        z11 = false;
                                    }
                                }
                                boolean zX2 = p3Var.x2();
                                int i39 = 0;
                                while (i39 < arrayList12.size()) {
                                    rh.a aVar3 = (rh.a) arrayList12.get(i39);
                                    if (!aVar3.f47033i && !rh.p3.x3(aVar3)) {
                                        rh.a aVar4 = i39 > 0 ? (rh.a) arrayList12.get(i39 - 1) : null;
                                        int iMax2 = aVar4 != null ? Math.max(0, aVar4.f47029c) : 0;
                                        if (rh.p3.E3(aVar3.f47028b)) {
                                            aVar3.f47029c = iMax2;
                                            if (iMax2 > 0) {
                                                aVar3.d = aVar4.d > 0 ? 1 : 0;
                                                aVar3.f47030e = false;
                                                aVar3.f47031f = false;
                                            }
                                        } else {
                                            int i40 = iMax2 + 1;
                                            if (aVar3.f47029c > i40) {
                                                aVar3.f47029c = i40;
                                            }
                                        }
                                        if (aVar3.f47029c <= 0) {
                                            aVar3.f47029c = 0;
                                            aVar3.d = 0;
                                            aVar3.f47030e = false;
                                            aVar3.f47031f = false;
                                        }
                                    }
                                    i39++;
                                }
                                p3Var.s4();
                                p3Var.a2();
                                if (z11 || zX2) {
                                    p3Var.U2.N(true);
                                    p3Var.x4();
                                } else {
                                    p3Var.x4();
                                }
                                rh.b2 b2Var2 = p3Var.F3;
                                if (b2Var2 != null) {
                                    b2Var2.h();
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
                break;
        }
    }
}
