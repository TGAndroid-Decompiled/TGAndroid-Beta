package ci;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import di.b4;
import di.dc;
import di.e2;
import di.o8;
import di.oc;
import di.p8;
import di.pc;
import di.q6;
import di.rb;
import di.sc;
import di.t2;
import di.v8;
import di.x8;
import di.z1;
import fi.e4;
import fi.e5;
import fi.f5;
import fi.k3;
import fi.m2;
import fi.p1;
import hg.i0;
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
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.zt;
import org.telegram.ui.uy;
public final class u implements Utilities.Callback2 {
    public final int f4842a;
    public final Object f4843b;

    public u(Object obj, int i10) {
        this.f4842a = i10;
        this.f4843b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        zt editText;
        Utilities.Callback callback;
        long duration;
        char c10;
        String str;
        String upperCase;
        boolean z10;
        int i10;
        v51 v51Var;
        int i11;
        String str2;
        int i12;
        String str3;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i13 = this.f4842a;
        String str4 = "";
        int i14 = -1;
        boolean z19 = false;
        z19 = false;
        Object obj3 = this.f4843b;
        switch (i13) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                v51 v51Var2 = (v51) obj2;
                ((x) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size = languages.size();
                int i15 = 0;
                while (i15 < size) {
                    TranslateController.Language language = languages.get(i15);
                    i15++;
                    int i16 = v.f4844a;
                    h51 J = h51.J(v.class);
                    J.G = language;
                    arrayList.add(J);
                }
                return;
            case 1:
                di.m mVar = (di.m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.I;
                RectF rectF = mVar.f7619z0;
                di.g gVar = mVar.f7593f;
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
                zt editText2 = gVar.getEditText();
                if (c11 == null) {
                    i14 = -2130706433;
                }
                editText2.setHintColor(i14);
                if (c11 == null) {
                    runnable.run();
                    return;
                }
                zt editText3 = gVar.getEditText();
                canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
                runnable.run();
                canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c11);
                canvas.restore();
                return;
            case 2:
                z1 z1Var = (z1) obj3;
                String str5 = (String) obj;
                t2 t2Var = z1Var.f8511r;
                t2Var.f8167b = str5;
                t2Var.f8168c = ((Integer) obj2).intValue();
                z1Var.f8507c.H(str5);
                return;
            case 3:
                e2 e2Var = (e2) obj3;
                String str6 = (String) obj;
                t2 t2Var2 = e2Var.f7160s;
                t2Var2.f8167b = str6;
                t2Var2.f8168c = ((Integer) obj2).intValue();
                e2Var.f7155c.D(str6);
                return;
            case 4:
                b4 b4Var = (b4) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                if (obj != null) {
                    if (b4Var.f6944e == null && (obj instanceof MediaController.PhotoEntry) && (callback = b4Var.f6945f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        return;
                    }
                    return;
                }
                b4Var.getClass();
                return;
            case 5:
                q6 q6Var = (q6) obj3;
                q6Var.d0(q6Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                return;
            case 6:
                ((oc) obj3).Z((Bitmap) obj, ((Float) obj2).floatValue());
                return;
            case 7:
                x8 x8Var = (x8) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                v51 v51Var3 = (v51) obj2;
                if (x8Var.f8402h0 || x8Var.f8401g0 != null) {
                    TLRPC.WebPage webPage = x8Var.f8401g0;
                    p8 p8Var = new p8(x8Var, 0);
                    int i17 = v8.f8296a;
                    h51 J2 = h51.J(v8.class);
                    J2.G = webPage;
                    J2.D = p8Var;
                    arrayList2.add(J2);
                }
                arrayList2.add(h51.k(x8Var.Y));
                arrayList2.add(h51.A(1, null));
                h51 i18 = h51.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i18.K(x8Var.m0);
                arrayList2.add(i18);
                if (x8Var.m0) {
                    arrayList2.add(h51.k(x8Var.Z));
                }
                arrayList2.add(h51.A(3, null));
                arrayList2.add(h51.k(x8Var.f8395a0));
                return;
            case 8:
                pc pcVar = (pc) obj3;
                Boolean bool = (Boolean) obj;
                Float f7 = (Float) obj2;
                if (pcVar.X0.getDuration() < 100) {
                    duration = pcVar.K1.f7758h0;
                } else {
                    duration = pcVar.X0.getDuration();
                }
                float floatValue = ((f7.floatValue() / 0.96f) * 0.04f) + f7.floatValue();
                o8 o8Var = pcVar.K1;
                float f10 = o8Var.f7741a0;
                float f11 = o8Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = (float) duration;
                long j3 = f12 * f13;
                dc dcVar = pcVar.X0;
                long j10 = (f11 * f13) + ((float) j3);
                pcVar.M1 = j10;
                dcVar.m(j10);
                rb rbVar = pcVar.f7910v1;
                if (rbVar != null) {
                    rbVar.setCoverTime(pcVar.M1);
                }
                o8 o8Var2 = pcVar.K1;
                if (o8Var2 != null && o8Var2.f7756g) {
                    o8Var2.f7761j = true;
                    return;
                }
                return;
            case 9:
                ((sc) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                return;
            case 10:
                ((ei.i) obj3).C0((ArrayList) obj, (v51) obj2);
                return;
            case 11:
                ei.h hVar = (ei.h) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                v51 v51Var4 = (v51) obj2;
                arrayList3.add(h51.k(hVar.Y));
                arrayList3.add(h51.k(hVar.Z));
                return;
            case 12:
                ((fi.m) obj3).E0((ArrayList) obj, (v51) obj2);
                return;
            case 13:
                v51 v51Var5 = (v51) obj2;
                fi.u.U((fi.u) obj3, (ArrayList) obj);
                return;
            case 14:
                org.telegram.ui.Components.q6 q6Var2 = (org.telegram.ui.Components.q6) obj3;
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
                q6Var2.setText(sb2);
                return;
            case 15:
                p1 p1Var = (p1) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                v51 v51Var6 = (v51) obj2;
                arrayList4.add(h51.j(-1, p1Var.f9879a0));
                arrayList4.add(h51.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, p1Var.Y))));
                return;
            case 16:
                k3 k3Var = (k3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    k3Var.getClass();
                    return;
                }
                f5 f5Var = k3Var.f9786v0;
                if (f5Var != null) {
                    f5Var.a(tL_webViewResultUrl);
                    k3Var.n();
                    return;
                }
                return;
            case 17:
                ((e4) obj3).F0((ArrayList) obj, (v51) obj2);
                return;
            case 18:
                ((e5) obj3).U((ArrayList) obj, (v51) obj2);
                return;
            case 19:
                v51 v51Var7 = (v51) obj2;
                ((gi.s) obj3).v.c((ArrayList) obj);
                return;
            case 20:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                rn0 rn0Var = (rn0) ((i0) obj3);
                uy uyVar = rn0Var.I0;
                AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
                n70 I = n70.I(uyVar, (h6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                } else {
                    n70 J3 = I.J();
                    J3.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new cc0(I, 24), false);
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
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new n5(rn0Var, uyVar, rn0Var.J0, I, 29), z10);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new in0(rn0Var, uyVar, tL_sponsoredPeer, I, 0), z10);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new org.telegram.ui.ActionBar.p(rn0Var, uyVar, I, 28), z10);
                if (LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                I.V(i10);
                I.Y = true;
                I.f28661t = z10;
                I.Z();
                return;
            case 21:
                ig.c.U((ig.c) obj3, (ArrayList) obj, (v51) obj2);
                return;
            case 22:
                ig.m mVar2 = (ig.m) obj3;
                mVar2.L.dismiss();
                mVar2.f12149y = (String) obj;
                mVar2.E = (TLRPC.InputDocument) obj2;
                mVar2.f12147w = false;
                AndroidUtilities.cancelRunOnUIThread(mVar2.d);
                mVar2.f12144n.setSticker(mVar2.f12149y);
                mVar2.e0(true);
                x51 x51Var = mVar2.f32849a;
                if (x51Var != null && (v51Var = x51Var.Y2) != null) {
                    v51Var.N(true);
                    return;
                }
                return;
            case 23:
                k0 k0Var = (k0) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                v51 v51Var8 = (v51) obj2;
                v51Var8.E = 1;
                LinearLayout linearLayout = k0Var.f12125a0;
                h51 h51Var = new h51(-4);
                h51Var.d = -5;
                h51Var.f26587c = linearLayout;
                h51Var.f26607z = -1;
                arrayList5.add(h51Var);
                TL_account.TL_connectedBot tL_connectedBot = k0Var.X;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        i2.g.p(R.string.SessionBotConnectedFrom, arrayList5);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList5.add(h51.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i11 = 2;
                            arrayList5.add(h51.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i11 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i11)) {
                            arrayList5.add(h51.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList5.add(h51.B(null));
                    }
                    v51Var8.U();
                    i2.g.p(R.string.BusinessBotChats2, arrayList5);
                    int i20 = k0.f12123g0;
                    h51 w10 = h51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(k0Var.f12129e0);
                    arrayList5.add(w10);
                    int i21 = k0.f12124h0;
                    h51 w11 = h51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!k0Var.f12129e0);
                    arrayList5.add(w11);
                    v51Var8.T();
                    arrayList5.add(h51.B(null));
                    a0 a0Var = k0Var.Z;
                    if (a0Var != null) {
                        a0Var.a(arrayList5, v51Var8, true);
                    }
                    i2.g.A(R.string.BusinessBotChatsInfo2, arrayList5);
                    return;
                }
                return;
            case 24:
                final u0 u0Var = (u0) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                v51 v51Var9 = (v51) obj2;
                LongSparseArray longSparseArray = u0Var.N;
                String string2 = LocaleController.getString(R.string.BusinessBots2);
                String string3 = LocaleController.getString(R.string.BusinessBots2Info);
                h51 h51Var2 = new h51(2);
                h51Var2.f26594l = string2;
                h51Var2.f26597o = string3;
                h51Var2.f26595m = "tg_superplaceholders_android_2";
                h51Var2.f26596n = "🤖🏝️";
                h51Var2.f26607z = 120;
                arrayList6.add(h51Var2);
                if (u0Var.M != null) {
                    v51Var9.U();
                    long j11 = u0Var.M.f20016id;
                    h51 h51Var3 = new h51(13);
                    h51Var3.f26605x = j11;
                    h51Var3.K(true);
                    h51Var3.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f12229c.Y2.N(true);
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
                                    u0Var3.f12229c.Y2.N(true);
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
                                        u0Var4.f12229c.Y2.N(true);
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
                                        u0Var5.f12229c.Y2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new m0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var6.J;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    u0Var6.f12229c.Y2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(h51Var3);
                    v51Var9.T();
                    str2 = "";
                } else {
                    v51Var9.U();
                    arrayList6.add(h51.k(u0Var.f12230e));
                    longSparseArray.clear();
                    int i22 = 0;
                    boolean z20 = false;
                    while (i22 < u0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) u0Var.d.d.get(i22);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                str3 = str4;
                                long j12 = user.f20016id;
                                String str8 = u0Var.f12237y;
                                h51 h51Var4 = new h51(13);
                                h51Var4.f26605x = j12;
                                h51Var4.f26596n = str8;
                                arrayList6.add(h51Var4);
                                longSparseArray.put(user.f20016id, user);
                                z20 = true;
                                i22++;
                                str4 = str3;
                            }
                        }
                        str3 = str4;
                        i22++;
                        str4 = str3;
                    }
                    str2 = str4;
                    for (int i23 = 0; i23 < u0Var.d.f10982e.size(); i23++) {
                        TLObject tLObject2 = (TLObject) u0Var.d.f10982e.get(i23);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j13 = user2.f20016id;
                                String str9 = u0Var.f12237y;
                                h51 h51Var5 = new h51(13);
                                h51Var5.f26605x = j13;
                                h51Var5.f26596n = str9;
                                arrayList6.add(h51Var5);
                                longSparseArray.put(user2.f20016id, user2);
                                z20 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(u0Var.f12231f.getText().toString()) || u0Var.d.e() || u0Var.f12236x)) {
                        arrayList6.add(h51.k(u0Var.f12232n));
                        z20 = true;
                    }
                    View view = u0Var.h;
                    if (z20) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    view.setVisibility(i12);
                    v51Var9.T();
                }
                arrayList6.add(h51.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                v51Var9.U();
                h51 t10 = h51.t(LocaleController.getString(R.string.BusinessBotChats2));
                if (u0Var.M != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t10.f26590g = z11;
                arrayList6.add(t10);
                h51 w12 = h51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(u0Var.I);
                if (u0Var.M != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                w12.f26590g = z12;
                arrayList6.add(w12);
                h51 w13 = h51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!u0Var.I);
                if (u0Var.M != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                w13.f26590g = z13;
                arrayList6.add(w13);
                v51Var9.T();
                arrayList6.add(h51.B(null));
                a0 a0Var2 = u0Var.v;
                if (u0Var.M != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                a0Var2.a(arrayList6, v51Var9, z14);
                i2.g.A(R.string.BusinessBotChatsInfo2, arrayList6);
                if (u0Var.M != null) {
                    v51Var9.U();
                    i2.g.p(R.string.BusinessBotPermissions, arrayList6);
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = u0Var.J;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    h51 m10 = h51.m(-4, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var.J;
                    if (tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    m10.K(z15);
                    m10.f26589f = !u0Var.P;
                    m10.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f12229c.Y2.N(true);
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
                                    u0Var3.f12229c.Y2.N(true);
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
                                        u0Var4.f12229c.Y2.N(true);
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
                                        u0Var5.f12229c.Y2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new m0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var6.J;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    u0Var6.f12229c.Y2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m10);
                    if (u0Var.P) {
                        h51 y3 = h51.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y3.K(true);
                        y3.f26590g = false;
                        y3.f26591i = 1;
                        arrayList6.add(y3);
                        h51 y10 = h51.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y10.K(u0Var.J.reply);
                        y10.f26591i = 1;
                        arrayList6.add(y10);
                        h51 y11 = h51.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y11.K(u0Var.J.read_messages);
                        y11.f26591i = 1;
                        arrayList6.add(y11);
                        h51 y12 = h51.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y12.K(u0Var.J.delete_sent_messages);
                        y12.f26591i = 1;
                        arrayList6.add(y12);
                        h51 y13 = h51.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y13.K(u0Var.J.delete_received_messages);
                        y13.f26591i = 1;
                        arrayList6.add(y13);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var.J;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    h51 m11 = h51.m(-10, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var.J;
                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    m11.K(z16);
                    m11.f26589f = !u0Var.Q;
                    m11.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f12229c.Y2.N(true);
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
                                    u0Var3.f12229c.Y2.N(true);
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
                                        u0Var4.f12229c.Y2.N(true);
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
                                        u0Var5.f12229c.Y2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new m0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = u0Var6.J;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    u0Var6.f12229c.Y2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m11);
                    if (u0Var.Q) {
                        h51 y14 = h51.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y14.K(u0Var.J.edit_name);
                        y14.f26591i = 1;
                        arrayList6.add(y14);
                        h51 y15 = h51.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y15.K(u0Var.J.edit_bio);
                        y15.f26591i = 1;
                        arrayList6.add(y15);
                        h51 y16 = h51.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y16.K(u0Var.J.edit_profile_photo);
                        y16.f26591i = 1;
                        arrayList6.add(y16);
                        h51 y17 = h51.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y17.K(u0Var.J.edit_username);
                        y17.f26591i = 1;
                        arrayList6.add(y17);
                    }
                    String string6 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = u0Var.J;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    h51 m12 = h51.m(-15, string6, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = u0Var.J;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    m12.K(z17);
                    m12.f26589f = !u0Var.R;
                    m12.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f12229c.Y2.N(true);
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
                                    u0Var3.f12229c.Y2.N(true);
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
                                        u0Var4.f12229c.Y2.N(true);
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
                                        u0Var5.f12229c.Y2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new m0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = u0Var6.J;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    u0Var6.f12229c.Y2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m12);
                    if (u0Var.R) {
                        h51 y18 = h51.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y18.K(u0Var.J.view_gifts);
                        y18.f26591i = 1;
                        arrayList6.add(y18);
                        h51 y19 = h51.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y19.K(u0Var.J.sell_gifts);
                        y19.f26591i = 1;
                        arrayList6.add(y19);
                        h51 y20 = h51.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y20.K(u0Var.J.change_gift_settings);
                        y20.f26591i = 1;
                        arrayList6.add(y20);
                        h51 y21 = h51.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y21.K(u0Var.J.transfer_and_upgrade_gifts);
                        y21.f26591i = 1;
                        arrayList6.add(y21);
                        h51 y22 = h51.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y22.K(u0Var.J.transfer_stars);
                        y22.f26591i = 1;
                        arrayList6.add(y22);
                    }
                    h51 m13 = h51.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), str2);
                    m13.K(u0Var.J.manage_stories);
                    m13.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f12229c.Y2.N(true);
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
                                    u0Var3.f12229c.Y2.N(true);
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
                                        u0Var4.f12229c.Y2.N(true);
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
                                        u0Var5.f12229c.Y2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new m0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = u0Var6.J;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    u0Var6.f12229c.Y2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m13);
                    v51Var9.T();
                    arrayList6.add(h51.A(-4, null));
                    arrayList6.add(h51.A(-5, null));
                    arrayList6.add(h51.A(-6, null));
                    arrayList6.add(h51.A(-7, null));
                    return;
                }
                return;
            case 25:
                w0.U((w0) obj3, (ArrayList) obj, (v51) obj2);
                return;
            case 26:
                e1 e1Var = (e1) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                v51 v51Var10 = (v51) obj2;
                String string7 = LocaleController.getString(R.string.BusinessLocation);
                String string8 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i24 = R.raw.biz_map;
                h51 h51Var6 = new h51(2);
                h51Var6.f26594l = string7;
                h51Var6.f26597o = string8;
                h51Var6.f26593k = i24;
                arrayList7.add(h51Var6);
                arrayList7.add(h51.k(e1Var.f12044e));
                arrayList7.add(h51.B(null));
                h51 i25 = h51.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                if (e1Var.f12050x != null) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                i25.K(z18);
                arrayList7.add(i25);
                if (e1Var.f12050x != null) {
                    arrayList7.add(h51.k(e1Var.h));
                }
                arrayList7.add(h51.B(null));
                if (e1Var.f12049w != null && (e1Var.f12050x != null || !TextUtils.isEmpty(e1Var.f12051y))) {
                    z19 = true;
                }
                e1Var.G = z19;
                if (z19) {
                    h51 e7 = h51.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e7.f26600r = true;
                    arrayList7.add(e7);
                    arrayList7.add(h51.B(null));
                }
                e1Var.U(true);
                return;
            case 27:
                v51 v51Var11 = (v51) obj2;
                g1.V((g1) obj3, (ArrayList) obj);
                return;
            default:
                i1 i1Var = (i1) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                v51 v51Var12 = (v51) obj2;
                ArrayList arrayList9 = i1Var.f12098b;
                String string9 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                h51 h51Var7 = new h51(9);
                h51Var7.d = -1;
                h51Var7.f26594l = string9;
                h51Var7.K(i1Var.f12103r);
                arrayList8.add(h51Var7);
                arrayList8.add(h51.B(null));
                if (i1Var.f12103r) {
                    for (int i26 = 0; i26 < arrayList9.size(); i26++) {
                        if (i26 > 0) {
                            arrayList8.add(h51.B(null));
                        }
                        f1 f1Var = (f1) arrayList9.get(i26);
                        if (!i1Var.U()) {
                            int i27 = i26 * 3;
                            arrayList8.add(h51.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), f1.a(f1Var.f12067a), i27));
                            arrayList8.add(h51.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), f1.a(f1Var.f12068b), i27 + 1));
                            h51 e10 = h51.e(i27 + 2, LocaleController.getString(R.string.Remove));
                            e10.f26600r = true;
                            arrayList8.add(e10);
                        }
                    }
                    if (i1Var.V()) {
                        arrayList8.add(h51.B(null));
                        h51 c12 = h51.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c12.f26599q = true;
                        arrayList8.add(c12);
                    }
                    i2.g.A(R.string.BusinessHoursDayInfo, arrayList8);
                    return;
                }
                return;
        }
    }
}
