package ci;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import di.d2;
import di.jc;
import di.k8;
import di.kc;
import di.l8;
import di.mb;
import di.nc;
import di.o6;
import di.r2;
import di.r8;
import di.t8;
import di.y1;
import di.yb;
import di.z3;
import fi.d5;
import fi.e5;
import fi.f4;
import fi.k3;
import fi.m2;
import fi.o1;
import hg.h0;
import ig.a0;
import ig.e1;
import ig.f1;
import ig.g1;
import ig.i1;
import ig.k0;
import ig.u0;
import ig.w0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.p6;
import org.telegram.ui.yy;
public final class u implements Utilities.Callback2 {
    public final int f4790a;
    public final Object f4791b;

    public u(Object obj, int i10) {
        this.f4790a = i10;
        this.f4791b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        nu editText;
        Utilities.Callback callback;
        long duration;
        char c10;
        String str;
        String upperCase;
        boolean z10;
        int i10;
        z61 z61Var;
        int i11;
        boolean z11;
        String str2;
        int i12;
        boolean z12;
        String str3;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        int i13 = this.f4790a;
        String str4 = "";
        int i14 = -1;
        int i15 = 0;
        r11 = false;
        boolean z21 = false;
        boolean z22 = true;
        Object obj3 = this.f4791b;
        switch (i13) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z61 z61Var2 = (z61) obj2;
                ((x) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size = languages.size();
                while (i15 < size) {
                    TranslateController.Language language = languages.get(i15);
                    i15++;
                    int i16 = v.f4792a;
                    l61 J = l61.J(v.class);
                    J.G = language;
                    arrayList.add(J);
                }
                return;
            case 1:
                di.m mVar = (di.m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.I;
                RectF rectF = mVar.f7408z0;
                di.g gVar = mVar.f7382f;
                if (mVar.g()) {
                    if (mVar.G == null) {
                        runnable.run();
                        return;
                    }
                    canvas.translate(-gVar.getEditText().hintLayoutX, 0.0f);
                    canvas.saveLayerAlpha(0.0f, 0.0f, mVar.G.getWidth(), mVar.G.getHeight(), 255, 31);
                    rectF.set(0.0f, 1.0f, mVar.G.getWidth(), mVar.G.getHeight() - 1);
                    mVar.h(mVar.P, canvas, rectF, 0.0f, true, (-gVar.getX()) - editText.getPaddingLeft(), ((-gVar.getY()) - editText.getPaddingTop()) - editText.getExtendedPaddingTop(), true);
                    canvas.save();
                    paint.setAlpha(165);
                    canvas.drawBitmap(mVar.G, 0.0f, 0.0f, paint);
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                Paint c11 = mVar.P.c(1.0f);
                nu editText2 = gVar.getEditText();
                if (c11 == null) {
                    i14 = -2130706433;
                }
                editText2.setHintColor(i14);
                if (c11 == null) {
                    runnable.run();
                    return;
                }
                nu editText3 = gVar.getEditText();
                canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
                runnable.run();
                canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c11);
                canvas.restore();
                return;
            case 2:
                y1 y1Var = (y1) obj3;
                String str5 = (String) obj;
                r2 r2Var = y1Var.f8123r;
                r2Var.f7688b = str5;
                r2Var.f7689c = ((Integer) obj2).intValue();
                y1Var.f8120c.H(str5);
                return;
            case 3:
                d2 d2Var = (d2) obj3;
                String str6 = (String) obj;
                r2 r2Var2 = d2Var.f6785s;
                r2Var2.f7688b = str6;
                r2Var2.f7689c = ((Integer) obj2).intValue();
                d2Var.f6781c.D(str6);
                return;
            case 4:
                z3 z3Var = (z3) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                if (obj != null) {
                    if (z3Var.e == null && (obj instanceof MediaController.PhotoEntry) && (callback = z3Var.f8178f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        return;
                    }
                    return;
                }
                z3Var.getClass();
                return;
            case 5:
                o6 o6Var = (o6) obj3;
                o6Var.d0(o6Var.i0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                return;
            case 6:
                ((jc) obj3).Z((Bitmap) obj, ((Float) obj2).floatValue());
                return;
            case 7:
                t8 t8Var = (t8) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                z61 z61Var3 = (z61) obj2;
                if (t8Var.f7845h0 || t8Var.f7844g0 != null) {
                    TLRPC.WebPage webPage = t8Var.f7844g0;
                    l8 l8Var = new l8(t8Var, 0);
                    int i17 = r8.f7720a;
                    l61 J2 = l61.J(r8.class);
                    J2.G = webPage;
                    J2.D = l8Var;
                    arrayList2.add(J2);
                }
                arrayList2.add(l61.k(t8Var.Y));
                arrayList2.add(l61.A(1, null));
                l61 i18 = l61.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i18.K(t8Var.m0);
                arrayList2.add(i18);
                if (t8Var.m0) {
                    arrayList2.add(l61.k(t8Var.Z));
                }
                arrayList2.add(l61.A(3, null));
                arrayList2.add(l61.k(t8Var.f7838a0));
                return;
            case 8:
                kc kcVar = (kc) obj3;
                Boolean bool = (Boolean) obj;
                Float f7 = (Float) obj2;
                if (kcVar.X0.getDuration() < 100) {
                    duration = kcVar.K1.f7189h0;
                } else {
                    duration = kcVar.X0.getDuration();
                }
                float floatValue = ((f7.floatValue() / 0.96f) * 0.04f) + f7.floatValue();
                k8 k8Var = kcVar.K1;
                float f10 = k8Var.f7173a0;
                float f11 = k8Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = (float) duration;
                long j10 = f12 * f13;
                yb ybVar = kcVar.X0;
                long j11 = (f11 * f13) + ((float) j10);
                kcVar.M1 = j11;
                ybVar.m(j11);
                mb mbVar = kcVar.f7302v1;
                if (mbVar != null) {
                    mbVar.setCoverTime(kcVar.M1);
                }
                k8 k8Var2 = kcVar.K1;
                if (k8Var2 != null && k8Var2.f7187g) {
                    k8Var2.f7192j = true;
                    return;
                }
                return;
            case 9:
                ((nc) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                return;
            case 10:
                ((ei.i) obj3).D0((ArrayList) obj, (z61) obj2);
                return;
            case 11:
                ei.h hVar = (ei.h) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                z61 z61Var4 = (z61) obj2;
                arrayList3.add(l61.k(hVar.Y));
                arrayList3.add(l61.k(hVar.Z));
                return;
            case 12:
                ((fi.l) obj3).F0((ArrayList) obj, (z61) obj2);
                return;
            case 13:
                z61 z61Var5 = (z61) obj2;
                fi.t.U((fi.t) obj3, (ArrayList) obj);
                return;
            case 14:
                s6 s6Var = (s6) obj3;
                String str7 = (String) obj;
                Long l4 = (Long) obj2;
                StringBuilder sb2 = new StringBuilder();
                if (l4.longValue() > 0) {
                    sb2.append("~");
                    sb2.append(AndroidUtilities.formatFileSize(l4.longValue()));
                }
                if (str7 == null) {
                    upperCase = null;
                } else {
                    if (str7.isEmpty()) {
                        str = "";
                    } else {
                        switch (str7.hashCode()) {
                            case -2008589971:
                                if (str7.equals("application/epub+zip")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1719571662:
                                if (str7.equals("application/vnd.oasis.opendocument.text")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1664118616:
                                if (str7.equals("video/3gpp")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1578389996:
                                if (str7.equals("application/vnd.ms-fontobject")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348237359:
                                if (str7.equals("application/x-cdf")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348236892:
                                if (str7.equals("application/x-csh")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1079884372:
                                if (str7.equals("video/x-msvideo")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1073633483:
                                if (str7.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1071817359:
                                if (str7.equals("application/vnd.ms-powerpoint")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1050893613:
                                if (str7.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1007601745:
                                if (str7.equals("audio/x-midi")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -958424608:
                                if (str7.equals("text/calendar")) {
                                    c10 = 11;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -816908365:
                                if (str7.equals("application/x-httpd-php")) {
                                    c10 = '\f';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -648684635:
                                if (str7.equals("audio/3gpp2")) {
                                    c10 = '\r';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -433129473:
                                if (str7.equals("application/vnd.apple.installer+xml")) {
                                    c10 = 14;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -366307023:
                                if (str7.equals("application/vnd.ms-excel")) {
                                    c10 = 15;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -48069494:
                                if (str7.equals("video/3gpp2")) {
                                    c10 = 16;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43923783:
                                if (str7.equals("application/gzip")) {
                                    c10 = 17;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43491031:
                                if (str7.equals("application/x-sh")) {
                                    c10 = 18;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 187091926:
                                if (str7.equals("audio/ogg")) {
                                    c10 = 19;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 817335912:
                                if (str7.equals("text/plain")) {
                                    c10 = 20;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 859118878:
                                if (str7.equals("application/x-abiword")) {
                                    c10 = 21;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 886992732:
                                if (str7.equals("application/ld+json")) {
                                    c10 = 22;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 904647503:
                                if (str7.equals("application/msword")) {
                                    c10 = 23;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154306387:
                                if (str7.equals("application/x-bzip")) {
                                    c10 = 24;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154455342:
                                if (str7.equals("application/x-gzip")) {
                                    c10 = 25;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1178484637:
                                if (str7.equals("application/octet-stream")) {
                                    c10 = 26;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1423759679:
                                if (str7.equals("application/x-bzip2")) {
                                    c10 = 27;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1436962847:
                                if (str7.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c10 = 28;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1454024983:
                                if (str7.equals("application/x-7z-compressed")) {
                                    c10 = 29;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1455492626:
                                if (str7.equals("application/x-freearc")) {
                                    c10 = 30;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1503095341:
                                if (str7.equals("audio/3gpp")) {
                                    c10 = 31;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1504831518:
                                if (str7.equals("audio/mpeg")) {
                                    c10 = ' ';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1509238306:
                                if (str7.equals("application/vnd.rar")) {
                                    c10 = '!';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1578362927:
                                if (str7.equals("image/vnd.microsoft.icon")) {
                                    c10 = '\"';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1643664935:
                                if (str7.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c10 = '#';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1672200517:
                                if (str7.equals("application/vnd.amazon.ebook")) {
                                    c10 = '$';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1993842850:
                                if (str7.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c10 = '%';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2049276534:
                                if (str7.equals("application/java-archive")) {
                                    c10 = '&';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2132236175:
                                if (str7.equals("text/javascript")) {
                                    c10 = '\'';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
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
                                if (str7.contains("/")) {
                                    str7 = str7.substring(str7.indexOf("/") + 1);
                                }
                                if (str7.contains("-")) {
                                    str7 = str7.substring(str7.indexOf("-") + 1);
                                }
                                if (str7.contains("+")) {
                                    str7 = str7.substring(0, str7.indexOf("+"));
                                }
                                str = str7.toLowerCase();
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
                s6Var.setText(sb2);
                return;
            case 15:
                o1 o1Var = (o1) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                z61 z61Var6 = (z61) obj2;
                arrayList4.add(l61.j(-1, o1Var.f9445a0));
                arrayList4.add(l61.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, o1Var.Y))));
                return;
            case 16:
                k3 k3Var = (k3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    k3Var.getClass();
                    return;
                }
                e5 e5Var = k3Var.f9378v0;
                if (e5Var != null) {
                    e5Var.a(tL_webViewResultUrl);
                    k3Var.o();
                    return;
                }
                return;
            case 17:
                ((f4) obj3).G0((ArrayList) obj, (z61) obj2);
                return;
            case 18:
                ((d5) obj3).U((ArrayList) obj, (z61) obj2);
                return;
            case 19:
                z61 z61Var7 = (z61) obj2;
                ((gi.s) obj3).v.c((ArrayList) obj);
                return;
            case 20:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                so0 so0Var = (so0) ((h0) obj3);
                yy yyVar = so0Var.I0;
                AndroidUtilities.hideKeyboard(yyVar.getParentActivity().getCurrentFocus());
                m80 I = m80.I(yyVar, (i6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                } else {
                    m80 J3 = I.J();
                    J3.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new yc0(I, 25), false);
                    J3.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J3.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J3.k();
                        }
                        J3.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    int i19 = R.drawable.msg_channel;
                    String string = LocaleController.getString(R.string.SponsoredMessageSponsorReportable);
                    m2 m2Var = new m2(I, J3, 8);
                    z10 = false;
                    I.c(i19, string, m2Var, false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new p6(so0Var, yyVar, so0Var.J0, I, 28), z10);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new p6(so0Var, yyVar, tL_sponsoredPeer, I, 29), z10);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new v70(so0Var, yyVar, I, 7), z10);
                if (LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                I.V(i10);
                I.Y = true;
                I.f27299t = z10;
                I.Z();
                return;
            case 21:
                ig.c.U((ig.c) obj3, (ArrayList) obj, (z61) obj2);
                return;
            case 22:
                ig.m mVar2 = (ig.m) obj3;
                mVar2.L.dismiss();
                mVar2.f11576y = (String) obj;
                mVar2.E = (TLRPC.InputDocument) obj2;
                mVar2.f11574w = false;
                AndroidUtilities.cancelRunOnUIThread(mVar2.d);
                mVar2.f11571n.setSticker(mVar2.f11576y);
                mVar2.e0(true);
                b71 b71Var = mVar2.f23964a;
                if (b71Var != null && (z61Var = b71Var.W2) != null) {
                    z61Var.N(true);
                    return;
                }
                return;
            case 23:
                k0 k0Var = (k0) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                z61 z61Var8 = (z61) obj2;
                z61Var8.E = 1;
                LinearLayout linearLayout = k0Var.f11554a0;
                l61 l61Var = new l61(-4);
                l61Var.d = -5;
                l61Var.f26948c = linearLayout;
                l61Var.f26967z = -1;
                arrayList5.add(l61Var);
                TL_account.TL_connectedBot tL_connectedBot = k0Var.X;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        i2.d.o(R.string.SessionBotConnectedFrom, arrayList5);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList5.add(l61.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i11 = 2;
                            arrayList5.add(l61.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i11 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i11)) {
                            arrayList5.add(l61.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList5.add(l61.B(null));
                    }
                    z61Var8.U();
                    i2.d.o(R.string.BusinessBotChats2, arrayList5);
                    int i20 = k0.f11552g0;
                    l61 w9 = l61.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w9.K(k0Var.f11558e0);
                    arrayList5.add(w9);
                    int i21 = k0.f11553h0;
                    l61 w10 = l61.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w10.K(!k0Var.f11558e0);
                    arrayList5.add(w10);
                    z61Var8.T();
                    arrayList5.add(l61.B(null));
                    a0 a0Var = k0Var.Z;
                    if (a0Var != null) {
                        a0Var.a(arrayList5, z61Var8, true);
                    }
                    i2.d.y(R.string.BusinessBotChatsInfo2, arrayList5);
                    return;
                }
                return;
            case 24:
                final u0 u0Var = (u0) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                z61 z61Var9 = (z61) obj2;
                LongSparseArray longSparseArray = u0Var.N;
                String string2 = LocaleController.getString(R.string.BusinessBots2);
                String string3 = LocaleController.getString(R.string.BusinessBots2Info);
                l61 l61Var2 = new l61(2);
                l61Var2.f26954l = string2;
                l61Var2.f26957o = string3;
                l61Var2.f26955m = "tg_superplaceholders_android_2";
                l61Var2.f26956n = "🤖🏝️";
                l61Var2.f26967z = 120;
                arrayList6.add(l61Var2);
                if (u0Var.M != null) {
                    z61Var9.U();
                    long j12 = u0Var.M.f19363id;
                    l61 l61Var3 = new l61(13);
                    l61Var3.f26965x = j12;
                    l61Var3.K(true);
                    l61Var3.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f11649c.W2.N(true);
                                    u0Var2.Y(true);
                                    return;
                                case 1:
                                    u0 u0Var3 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = u0Var3.J;
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
                                    u0Var3.f11649c.W2.N(true);
                                    u0Var3.Y(true);
                                    return;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var4.J;
                                    if (tL_businessBotRights2.edit_name && tL_businessBotRights2.edit_bio && tL_businessBotRights2.edit_profile_photo && tL_businessBotRights2.edit_username) {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        u0Var4.f11649c.W2.N(true);
                                        u0Var4.Y(true);
                                        return;
                                    }
                                    u0Var4.X(-14, true, new m0(u0Var4, 2));
                                    return;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var5.J;
                                    if (tL_businessBotRights3.view_gifts && tL_businessBotRights3.sell_gifts && tL_businessBotRights3.change_gift_settings && tL_businessBotRights3.transfer_and_upgrade_gifts && tL_businessBotRights3.transfer_stars) {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        u0Var5.f11649c.W2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new m0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var6.J;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    u0Var6.f11649c.W2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(l61Var3);
                    z61Var9.T();
                    z11 = true;
                    str2 = "";
                } else {
                    z61Var9.U();
                    arrayList6.add(l61.k(u0Var.e));
                    longSparseArray.clear();
                    int i22 = 0;
                    boolean z23 = false;
                    while (i22 < u0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) u0Var.d.d.get(i22);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                z12 = z22;
                                str3 = str4;
                                long j13 = user.f19363id;
                                String str8 = u0Var.f11656y;
                                l61 l61Var4 = new l61(13);
                                l61Var4.f26965x = j13;
                                l61Var4.f26956n = str8;
                                arrayList6.add(l61Var4);
                                longSparseArray.put(user.f19363id, user);
                                z23 = z12;
                                i22++;
                                str4 = str3;
                                z22 = z12;
                            }
                        }
                        z12 = z22;
                        str3 = str4;
                        i22++;
                        str4 = str3;
                        z22 = z12;
                    }
                    z11 = z22;
                    str2 = str4;
                    for (int i23 = 0; i23 < u0Var.d.e.size(); i23++) {
                        TLObject tLObject2 = (TLObject) u0Var.d.e.get(i23);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.f19363id;
                                String str9 = u0Var.f11656y;
                                l61 l61Var5 = new l61(13);
                                l61Var5.f26965x = j14;
                                l61Var5.f26956n = str9;
                                arrayList6.add(l61Var5);
                                longSparseArray.put(user2.f19363id, user2);
                                z23 = z11;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(u0Var.f11650f.getText().toString()) || u0Var.d.e() || u0Var.f11655x)) {
                        arrayList6.add(l61.k(u0Var.f11651n));
                        z23 = z11;
                    }
                    View view = u0Var.h;
                    if (z23) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    view.setVisibility(i12);
                    z61Var9.T();
                }
                arrayList6.add(l61.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                z61Var9.U();
                l61 t10 = l61.t(LocaleController.getString(R.string.BusinessBotChats2));
                if (u0Var.M != null) {
                    z13 = z11;
                } else {
                    z13 = false;
                }
                t10.f26950g = z13;
                arrayList6.add(t10);
                l61 w11 = l61.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w11.K(u0Var.I);
                if (u0Var.M != null) {
                    z14 = z11;
                } else {
                    z14 = false;
                }
                w11.f26950g = z14;
                arrayList6.add(w11);
                l61 w12 = l61.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w12.K(!u0Var.I);
                if (u0Var.M != null) {
                    z15 = z11;
                } else {
                    z15 = false;
                }
                w12.f26950g = z15;
                arrayList6.add(w12);
                z61Var9.T();
                arrayList6.add(l61.B(null));
                a0 a0Var2 = u0Var.v;
                if (u0Var.M != null) {
                    z16 = z11;
                } else {
                    z16 = false;
                }
                a0Var2.a(arrayList6, z61Var9, z16);
                i2.d.y(R.string.BusinessBotChatsInfo2, arrayList6);
                if (u0Var.M != null) {
                    z61Var9.U();
                    i2.d.o(R.string.BusinessBotPermissions, arrayList6);
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = u0Var.J;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    l61 m10 = l61.m(-4, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var.J;
                    if (tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) {
                        z17 = z11;
                    } else {
                        z17 = false;
                    }
                    m10.K(z17);
                    m10.f26949f = !u0Var.P;
                    boolean z24 = z11;
                    final int i24 = z24 ? 1 : 0;
                    m10.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (i24) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f11649c.W2.N(true);
                                    u0Var2.Y(true);
                                    return;
                                case 1:
                                    u0 u0Var3 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var3.J;
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
                                    u0Var3.f11649c.W2.N(true);
                                    u0Var3.Y(true);
                                    return;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = u0Var4.J;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        u0Var4.f11649c.W2.N(true);
                                        u0Var4.Y(true);
                                        return;
                                    }
                                    u0Var4.X(-14, true, new m0(u0Var4, 2));
                                    return;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = u0Var5.J;
                                    if (tL_businessBotRights32.view_gifts && tL_businessBotRights32.sell_gifts && tL_businessBotRights32.change_gift_settings && tL_businessBotRights32.transfer_and_upgrade_gifts && tL_businessBotRights32.transfer_stars) {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        u0Var5.f11649c.W2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new m0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var6.J;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    u0Var6.f11649c.W2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m10);
                    if (u0Var.P) {
                        l61 y3 = l61.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y3.K(z24);
                        y3.f26950g = false;
                        y3.f26951i = z24 ? 1 : 0;
                        arrayList6.add(y3);
                        l61 y10 = l61.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y10.K(u0Var.J.reply);
                        y10.f26951i = z24 ? 1 : 0;
                        arrayList6.add(y10);
                        l61 y11 = l61.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y11.K(u0Var.J.read_messages);
                        y11.f26951i = z24 ? 1 : 0;
                        arrayList6.add(y11);
                        l61 y12 = l61.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y12.K(u0Var.J.delete_sent_messages);
                        y12.f26951i = z24 ? 1 : 0;
                        arrayList6.add(y12);
                        l61 y13 = l61.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y13.K(u0Var.J.delete_received_messages);
                        y13.f26951i = z24 ? 1 : 0;
                        arrayList6.add(y13);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var.J;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    l61 m11 = l61.m(-10, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var.J;
                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    m11.K(z18);
                    m11.f26949f = !u0Var.Q;
                    m11.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (i24) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f11649c.W2.N(true);
                                    u0Var2.Y(true);
                                    return;
                                case 1:
                                    u0 u0Var3 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = u0Var3.J;
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
                                    u0Var3.f11649c.W2.N(true);
                                    u0Var3.Y(true);
                                    return;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = u0Var4.J;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        u0Var4.f11649c.W2.N(true);
                                        u0Var4.Y(true);
                                        return;
                                    }
                                    u0Var4.X(-14, true, new m0(u0Var4, 2));
                                    return;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = u0Var5.J;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        u0Var5.f11649c.W2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new m0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = u0Var6.J;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    u0Var6.f11649c.W2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m11);
                    if (u0Var.Q) {
                        l61 y14 = l61.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y14.K(u0Var.J.edit_name);
                        y14.f26951i = 1;
                        arrayList6.add(y14);
                        l61 y15 = l61.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y15.K(u0Var.J.edit_bio);
                        y15.f26951i = 1;
                        arrayList6.add(y15);
                        l61 y16 = l61.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y16.K(u0Var.J.edit_profile_photo);
                        y16.f26951i = 1;
                        arrayList6.add(y16);
                        l61 y17 = l61.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y17.K(u0Var.J.edit_username);
                        y17.f26951i = 1;
                        arrayList6.add(y17);
                    }
                    String string6 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = u0Var.J;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    l61 m12 = l61.m(-15, string6, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = u0Var.J;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    m12.K(z19);
                    m12.f26949f = !u0Var.R;
                    m12.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (i24) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f11649c.W2.N(true);
                                    u0Var2.Y(true);
                                    return;
                                case 1:
                                    u0 u0Var3 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = u0Var3.J;
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
                                    u0Var3.f11649c.W2.N(true);
                                    u0Var3.Y(true);
                                    return;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = u0Var4.J;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        u0Var4.f11649c.W2.N(true);
                                        u0Var4.Y(true);
                                        return;
                                    }
                                    u0Var4.X(-14, true, new m0(u0Var4, 2));
                                    return;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = u0Var5.J;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        u0Var5.f11649c.W2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new m0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = u0Var6.J;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    u0Var6.f11649c.W2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m12);
                    if (u0Var.R) {
                        l61 y18 = l61.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y18.K(u0Var.J.view_gifts);
                        y18.f26951i = 1;
                        arrayList6.add(y18);
                        l61 y19 = l61.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y19.K(u0Var.J.sell_gifts);
                        y19.f26951i = 1;
                        arrayList6.add(y19);
                        l61 y20 = l61.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y20.K(u0Var.J.change_gift_settings);
                        y20.f26951i = 1;
                        arrayList6.add(y20);
                        l61 y21 = l61.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y21.K(u0Var.J.transfer_and_upgrade_gifts);
                        y21.f26951i = 1;
                        arrayList6.add(y21);
                        l61 y22 = l61.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y22.K(u0Var.J.transfer_stars);
                        y22.f26951i = 1;
                        arrayList6.add(y22);
                    }
                    l61 m13 = l61.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), str2);
                    m13.K(u0Var.J.manage_stories);
                    m13.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (i24) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f11649c.W2.N(true);
                                    u0Var2.Y(true);
                                    return;
                                case 1:
                                    u0 u0Var3 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = u0Var3.J;
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
                                    u0Var3.f11649c.W2.N(true);
                                    u0Var3.Y(true);
                                    return;
                                case 2:
                                    u0 u0Var4 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = u0Var4.J;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        u0Var4.f11649c.W2.N(true);
                                        u0Var4.Y(true);
                                        return;
                                    }
                                    u0Var4.X(-14, true, new m0(u0Var4, 2));
                                    return;
                                case 3:
                                    u0 u0Var5 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = u0Var5.J;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        u0Var5.f11649c.W2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new m0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = u0Var6.J;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    u0Var6.f11649c.W2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m13);
                    z61Var9.T();
                    arrayList6.add(l61.A(-4, null));
                    arrayList6.add(l61.A(-5, null));
                    arrayList6.add(l61.A(-6, null));
                    arrayList6.add(l61.A(-7, null));
                    return;
                }
                return;
            case 25:
                w0.U((w0) obj3, (ArrayList) obj, (z61) obj2);
                return;
            case 26:
                e1 e1Var = (e1) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                z61 z61Var10 = (z61) obj2;
                String string7 = LocaleController.getString(R.string.BusinessLocation);
                String string8 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i25 = R.raw.biz_map;
                l61 l61Var6 = new l61(2);
                l61Var6.f26954l = string7;
                l61Var6.f26957o = string8;
                l61Var6.f26953k = i25;
                arrayList7.add(l61Var6);
                arrayList7.add(l61.k(e1Var.e));
                arrayList7.add(l61.B(null));
                l61 i26 = l61.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                if (e1Var.f11487x != null) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                i26.K(z20);
                arrayList7.add(i26);
                if (e1Var.f11487x != null) {
                    arrayList7.add(l61.k(e1Var.h));
                }
                arrayList7.add(l61.B(null));
                if (e1Var.f11486w != null && (e1Var.f11487x != null || !TextUtils.isEmpty(e1Var.f11488y))) {
                    z21 = true;
                }
                e1Var.G = z21;
                if (z21) {
                    l61 e = l61.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e.f26960r = true;
                    arrayList7.add(e);
                    arrayList7.add(l61.B(null));
                }
                e1Var.U(true);
                return;
            case 27:
                z61 z61Var11 = (z61) obj2;
                g1.V((g1) obj3, (ArrayList) obj);
                return;
            default:
                i1 i1Var = (i1) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                z61 z61Var12 = (z61) obj2;
                ArrayList arrayList9 = i1Var.f11530b;
                String string9 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                l61 l61Var7 = new l61(9);
                l61Var7.d = -1;
                l61Var7.f26954l = string9;
                l61Var7.K(i1Var.f11534r);
                arrayList8.add(l61Var7);
                arrayList8.add(l61.B(null));
                if (i1Var.f11534r) {
                    for (int i27 = 0; i27 < arrayList9.size(); i27++) {
                        if (i27 > 0) {
                            arrayList8.add(l61.B(null));
                        }
                        f1 f1Var = (f1) arrayList9.get(i27);
                        if (!i1Var.U()) {
                            int i28 = i27 * 3;
                            arrayList8.add(l61.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), f1.a(f1Var.f11502a), i28));
                            arrayList8.add(l61.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), f1.a(f1Var.f11503b), i28 + 1));
                            l61 e7 = l61.e(i28 + 2, LocaleController.getString(R.string.Remove));
                            e7.f26960r = true;
                            arrayList8.add(e7);
                        }
                    }
                    if (i1Var.V()) {
                        arrayList8.add(l61.B(null));
                        l61 c12 = l61.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c12.f26959q = true;
                        arrayList8.add(c12);
                    }
                    i2.d.y(R.string.BusinessHoursDayInfo, arrayList8);
                    return;
                }
                return;
        }
    }
}
