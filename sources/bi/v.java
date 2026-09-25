package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import ci.a4;
import ci.e2;
import ci.kc;
import ci.l8;
import ci.lc;
import ci.m8;
import ci.nb;
import ci.oc;
import ci.q6;
import ci.s2;
import ci.s8;
import ci.u8;
import ci.z1;
import ci.zb;
import ei.e4;
import ei.e5;
import ei.f5;
import ei.k3;
import ei.m2;
import ei.p1;
import gg.i0;
import hg.c0;
import hg.f1;
import hg.g1;
import hg.h1;
import hg.j1;
import hg.m0;
import hg.v0;
import hg.x0;
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
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.qy;
public final class v implements Utilities.Callback2 {
    public final int f3593a;
    public final Object f3594b;

    public v(Object obj, int i10) {
        this.f3593a = i10;
        this.f3594b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        cu editText;
        Utilities.Callback callback;
        long duration;
        String str;
        String upperCase;
        boolean z10;
        int i10;
        j61 j61Var;
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
        int i13 = this.f3593a;
        String str4 = "";
        int i14 = -1;
        boolean z19 = false;
        z19 = false;
        Object obj3 = this.f3594b;
        switch (i13) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j61 j61Var2 = (j61) obj2;
                ((y) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size = languages.size();
                int i15 = 0;
                while (i15 < size) {
                    TranslateController.Language language = languages.get(i15);
                    i15++;
                    int i16 = w.f3595a;
                    v51 J = v51.J(w.class);
                    J.G = language;
                    arrayList.add(J);
                }
                return;
            case 1:
                ci.m mVar = (ci.m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.I;
                RectF rectF = mVar.f5147z0;
                ci.g gVar = mVar.f5121f;
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
                Paint c10 = mVar.P.c(1.0f);
                cu editText2 = gVar.getEditText();
                if (c10 == null) {
                    i14 = -2130706433;
                }
                editText2.setHintColor(i14);
                if (c10 == null) {
                    runnable.run();
                    return;
                }
                cu editText3 = gVar.getEditText();
                canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
                runnable.run();
                canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c10);
                canvas.restore();
                return;
            case 2:
                z1 z1Var = (z1) obj3;
                String str5 = (String) obj;
                s2 s2Var = z1Var.f5906r;
                s2Var.f5472b = str5;
                s2Var.f5473c = ((Integer) obj2).intValue();
                z1Var.f5903c.H(str5);
                return;
            case 3:
                e2 e2Var = (e2) obj3;
                String str6 = (String) obj;
                s2 s2Var2 = e2Var.f4599s;
                s2Var2.f5472b = str6;
                s2Var2.f5473c = ((Integer) obj2).intValue();
                e2Var.f4595c.D(str6);
                return;
            case 4:
                a4 a4Var = (a4) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                if (obj != null) {
                    if (a4Var.e == null && (obj instanceof MediaController.PhotoEntry) && (callback = a4Var.f4341f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        return;
                    }
                    return;
                }
                a4Var.getClass();
                return;
            case 5:
                q6 q6Var = (q6) obj3;
                q6Var.d0(q6Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                return;
            case 6:
                ((kc) obj3).Z((Bitmap) obj, ((Float) obj2).floatValue());
                return;
            case 7:
                u8 u8Var = (u8) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                j61 j61Var3 = (j61) obj2;
                if (u8Var.f5624h0 || u8Var.f5623g0 != null) {
                    TLRPC.WebPage webPage = u8Var.f5623g0;
                    m8 m8Var = new m8(u8Var, 0);
                    int i17 = s8.f5497a;
                    v51 J2 = v51.J(s8.class);
                    J2.G = webPage;
                    J2.D = m8Var;
                    arrayList2.add(J2);
                }
                arrayList2.add(v51.k(u8Var.Y));
                arrayList2.add(v51.A(1, null));
                v51 i18 = v51.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i18.K(u8Var.m0);
                arrayList2.add(i18);
                if (u8Var.m0) {
                    arrayList2.add(v51.k(u8Var.Z));
                }
                arrayList2.add(v51.A(3, null));
                arrayList2.add(v51.k(u8Var.f5617a0));
                return;
            case 8:
                lc lcVar = (lc) obj3;
                Boolean bool = (Boolean) obj;
                Float f7 = (Float) obj2;
                if (lcVar.X0.getDuration() < 100) {
                    duration = lcVar.K1.f4981h0;
                } else {
                    duration = lcVar.X0.getDuration();
                }
                float floatValue = ((f7.floatValue() / 0.96f) * 0.04f) + f7.floatValue();
                l8 l8Var = lcVar.K1;
                float f10 = l8Var.f4965a0;
                float f11 = l8Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = (float) duration;
                long j3 = f12 * f13;
                zb zbVar = lcVar.X0;
                long j10 = (f11 * f13) + ((float) j3);
                lcVar.M1 = j10;
                zbVar.m(j10);
                nb nbVar = lcVar.f5094v1;
                if (nbVar != null) {
                    nbVar.setCoverTime(lcVar.M1);
                }
                l8 l8Var2 = lcVar.K1;
                if (l8Var2 != null && l8Var2.f4979g) {
                    l8Var2.f4984j = true;
                    return;
                }
                return;
            case 9:
                ((oc) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                return;
            case 10:
                ((di.i) obj3).C0((ArrayList) obj, (j61) obj2);
                return;
            case 11:
                di.h hVar = (di.h) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                j61 j61Var4 = (j61) obj2;
                arrayList3.add(v51.k(hVar.Y));
                arrayList3.add(v51.k(hVar.Z));
                return;
            case 12:
                ((ei.l) obj3).E0((ArrayList) obj, (j61) obj2);
                return;
            case 13:
                j61 j61Var5 = (j61) obj2;
                ei.u.U((ei.u) obj3, (ArrayList) obj);
                return;
            case 14:
                p6 p6Var = (p6) obj3;
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
                                    i14 = 0;
                                    break;
                                }
                                break;
                            case -1719571662:
                                if (str7.equals("application/vnd.oasis.opendocument.text")) {
                                    i14 = 1;
                                    break;
                                }
                                break;
                            case -1664118616:
                                if (str7.equals("video/3gpp")) {
                                    i14 = 2;
                                    break;
                                }
                                break;
                            case -1578389996:
                                if (str7.equals("application/vnd.ms-fontobject")) {
                                    i14 = 3;
                                    break;
                                }
                                break;
                            case -1348237359:
                                if (str7.equals("application/x-cdf")) {
                                    i14 = 4;
                                    break;
                                }
                                break;
                            case -1348236892:
                                if (str7.equals("application/x-csh")) {
                                    i14 = 5;
                                    break;
                                }
                                break;
                            case -1079884372:
                                if (str7.equals("video/x-msvideo")) {
                                    i14 = 6;
                                    break;
                                }
                                break;
                            case -1073633483:
                                if (str7.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    i14 = 7;
                                    break;
                                }
                                break;
                            case -1071817359:
                                if (str7.equals("application/vnd.ms-powerpoint")) {
                                    i14 = 8;
                                    break;
                                }
                                break;
                            case -1050893613:
                                if (str7.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    i14 = 9;
                                    break;
                                }
                                break;
                            case -1007601745:
                                if (str7.equals("audio/x-midi")) {
                                    i14 = 10;
                                    break;
                                }
                                break;
                            case -958424608:
                                if (str7.equals("text/calendar")) {
                                    i14 = 11;
                                    break;
                                }
                                break;
                            case -816908365:
                                if (str7.equals("application/x-httpd-php")) {
                                    i14 = 12;
                                    break;
                                }
                                break;
                            case -648684635:
                                if (str7.equals("audio/3gpp2")) {
                                    i14 = 13;
                                    break;
                                }
                                break;
                            case -433129473:
                                if (str7.equals("application/vnd.apple.installer+xml")) {
                                    i14 = 14;
                                    break;
                                }
                                break;
                            case -366307023:
                                if (str7.equals("application/vnd.ms-excel")) {
                                    i14 = 15;
                                    break;
                                }
                                break;
                            case -48069494:
                                if (str7.equals("video/3gpp2")) {
                                    i14 = 16;
                                    break;
                                }
                                break;
                            case -43923783:
                                if (str7.equals("application/gzip")) {
                                    i14 = 17;
                                    break;
                                }
                                break;
                            case -43491031:
                                if (str7.equals("application/x-sh")) {
                                    i14 = 18;
                                    break;
                                }
                                break;
                            case 187091926:
                                if (str7.equals("audio/ogg")) {
                                    i14 = 19;
                                    break;
                                }
                                break;
                            case 817335912:
                                if (str7.equals("text/plain")) {
                                    i14 = 20;
                                    break;
                                }
                                break;
                            case 859118878:
                                if (str7.equals("application/x-abiword")) {
                                    i14 = 21;
                                    break;
                                }
                                break;
                            case 886992732:
                                if (str7.equals("application/ld+json")) {
                                    i14 = 22;
                                    break;
                                }
                                break;
                            case 904647503:
                                if (str7.equals("application/msword")) {
                                    i14 = 23;
                                    break;
                                }
                                break;
                            case 1154306387:
                                if (str7.equals("application/x-bzip")) {
                                    i14 = 24;
                                    break;
                                }
                                break;
                            case 1154455342:
                                if (str7.equals("application/x-gzip")) {
                                    i14 = 25;
                                    break;
                                }
                                break;
                            case 1178484637:
                                if (str7.equals("application/octet-stream")) {
                                    i14 = 26;
                                    break;
                                }
                                break;
                            case 1423759679:
                                if (str7.equals("application/x-bzip2")) {
                                    i14 = 27;
                                    break;
                                }
                                break;
                            case 1436962847:
                                if (str7.equals("application/vnd.oasis.opendocument.presentation")) {
                                    i14 = 28;
                                    break;
                                }
                                break;
                            case 1454024983:
                                if (str7.equals("application/x-7z-compressed")) {
                                    i14 = 29;
                                    break;
                                }
                                break;
                            case 1455492626:
                                if (str7.equals("application/x-freearc")) {
                                    i14 = 30;
                                    break;
                                }
                                break;
                            case 1503095341:
                                if (str7.equals("audio/3gpp")) {
                                    i14 = 31;
                                    break;
                                }
                                break;
                            case 1504831518:
                                if (str7.equals("audio/mpeg")) {
                                    i14 = 32;
                                    break;
                                }
                                break;
                            case 1509238306:
                                if (str7.equals("application/vnd.rar")) {
                                    i14 = 33;
                                    break;
                                }
                                break;
                            case 1578362927:
                                if (str7.equals("image/vnd.microsoft.icon")) {
                                    i14 = 34;
                                    break;
                                }
                                break;
                            case 1643664935:
                                if (str7.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    i14 = 35;
                                    break;
                                }
                                break;
                            case 1672200517:
                                if (str7.equals("application/vnd.amazon.ebook")) {
                                    i14 = 36;
                                    break;
                                }
                                break;
                            case 1993842850:
                                if (str7.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    i14 = 37;
                                    break;
                                }
                                break;
                            case 2049276534:
                                if (str7.equals("application/java-archive")) {
                                    i14 = 38;
                                    break;
                                }
                                break;
                            case 2132236175:
                                if (str7.equals("text/javascript")) {
                                    i14 = 39;
                                    break;
                                }
                                break;
                        }
                        switch (i14) {
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
                            case 8:
                                str = "ppt";
                                break;
                            case 9:
                                str = "docx";
                                break;
                            case 10:
                                str = "midi";
                                break;
                            case 11:
                                str = "ics";
                                break;
                            case 12:
                                str = "php";
                                break;
                            case 13:
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
                            case 32:
                                str = "mp3";
                                break;
                            case 33:
                                str = "rar";
                                break;
                            case 34:
                                str = "ico";
                                break;
                            case 35:
                                str = "ods";
                                break;
                            case 36:
                                str = "azw";
                                break;
                            case 37:
                                str = "xlsx";
                                break;
                            case 38:
                                str = "jar";
                                break;
                            case 39:
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
                p6Var.setText(sb2);
                return;
            case 15:
                p1 p1Var = (p1) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                j61 j61Var6 = (j61) obj2;
                arrayList4.add(v51.j(-1, p1Var.f8518a0));
                arrayList4.add(v51.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, p1Var.Y))));
                return;
            case 16:
                k3 k3Var = (k3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    k3Var.getClass();
                    return;
                }
                f5 f5Var = k3Var.f8435v0;
                if (f5Var != null) {
                    f5Var.a(tL_webViewResultUrl);
                    k3Var.n();
                    return;
                }
                return;
            case 17:
                ((e4) obj3).F0((ArrayList) obj, (j61) obj2);
                return;
            case 18:
                ((e5) obj3).U((ArrayList) obj, (j61) obj2);
                return;
            case 19:
                j61 j61Var7 = (j61) obj2;
                ((fi.s) obj3).v.c((ArrayList) obj);
                return;
            case 20:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                eo0 eo0Var = (eo0) ((i0) obj3);
                qy qyVar = eo0Var.I0;
                AndroidUtilities.hideKeyboard(qyVar.getParentActivity().getCurrentFocus());
                y70 I = y70.I(qyVar, (i6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                } else {
                    y70 J3 = I.J();
                    J3.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ic0(I, 25), false);
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
                    z10 = false;
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new m2(I, J3, 8), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new vn0(eo0Var, qyVar, eo0Var.J0, I, 0), z10);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new vn0(eo0Var, qyVar, tL_sponsoredPeer, I, 1), z10);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new cn0(eo0Var, qyVar, I, 1), z10);
                if (LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                I.V(i10);
                I.Y = true;
                I.f30556t = z10;
                I.Z();
                return;
            case 21:
                hg.d.U((hg.d) obj3, (ArrayList) obj, (j61) obj2);
                return;
            case 22:
                hg.n nVar = (hg.n) obj3;
                nVar.L.dismiss();
                nVar.f10351y = (String) obj;
                nVar.E = (TLRPC.InputDocument) obj2;
                nVar.f10349w = false;
                AndroidUtilities.cancelRunOnUIThread(nVar.d);
                nVar.f10346n.setSticker(nVar.f10351y);
                nVar.e0(true);
                l61 l61Var = nVar.f26372a;
                if (l61Var != null && (j61Var = l61Var.Y2) != null) {
                    j61Var.N(true);
                    return;
                }
                return;
            case 23:
                m0 m0Var = (m0) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                j61 j61Var8 = (j61) obj2;
                j61Var8.E = 1;
                LinearLayout linearLayout = m0Var.f10337a0;
                v51 v51Var = new v51(-4);
                v51Var.d = -5;
                v51Var.f29043c = linearLayout;
                v51Var.f29062z = -1;
                arrayList5.add(v51Var);
                TL_account.TL_connectedBot tL_connectedBot = m0Var.X;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        com.google.android.gms.internal.vision.e2.n(R.string.SessionBotConnectedFrom, arrayList5);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList5.add(v51.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i11 = 2;
                            arrayList5.add(v51.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i11 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i11)) {
                            arrayList5.add(v51.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList5.add(v51.B(null));
                    }
                    j61Var8.U();
                    com.google.android.gms.internal.vision.e2.n(R.string.BusinessBotChats2, arrayList5);
                    int i19 = m0.f10335g0;
                    v51 w10 = v51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(m0Var.f10341e0);
                    arrayList5.add(w10);
                    int i20 = m0.f10336h0;
                    v51 w11 = v51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!m0Var.f10341e0);
                    arrayList5.add(w11);
                    j61Var8.T();
                    arrayList5.add(v51.B(null));
                    c0 c0Var = m0Var.Z;
                    if (c0Var != null) {
                        c0Var.a(arrayList5, j61Var8, true);
                    }
                    hg.c.n(R.string.BusinessBotChatsInfo2, arrayList5);
                    return;
                }
                return;
            case 24:
                final v0 v0Var = (v0) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                j61 j61Var9 = (j61) obj2;
                LongSparseArray longSparseArray = v0Var.N;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                v51 v51Var2 = new v51(2);
                v51Var2.f29049l = string;
                v51Var2.f29052o = string2;
                v51Var2.f29050m = "tg_superplaceholders_android_2";
                v51Var2.f29051n = "🤖🏝️";
                v51Var2.f29062z = 120;
                arrayList6.add(v51Var2);
                if (v0Var.M != null) {
                    j61Var9.U();
                    long j11 = v0Var.M.f18483id;
                    v51 v51Var3 = new v51(13);
                    v51Var3.f29060x = j11;
                    v51Var3.K(true);
                    v51Var3.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    v0 v0Var2 = v0Var;
                                    v0Var2.M = null;
                                    v0Var2.f10425c.Y2.N(true);
                                    v0Var2.Y(true);
                                    return;
                                case 1:
                                    v0 v0Var3 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = v0Var3.J;
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
                                    v0Var3.f10425c.Y2.N(true);
                                    v0Var3.Y(true);
                                    return;
                                case 2:
                                    v0 v0Var4 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = v0Var4.J;
                                    if (tL_businessBotRights2.edit_name && tL_businessBotRights2.edit_bio && tL_businessBotRights2.edit_profile_photo && tL_businessBotRights2.edit_username) {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        v0Var4.f10425c.Y2.N(true);
                                        v0Var4.Y(true);
                                        return;
                                    }
                                    v0Var4.X(-14, true, new o0(v0Var4, 2));
                                    return;
                                case 3:
                                    v0 v0Var5 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = v0Var5.J;
                                    if (tL_businessBotRights3.view_gifts && tL_businessBotRights3.sell_gifts && tL_businessBotRights3.change_gift_settings && tL_businessBotRights3.transfer_and_upgrade_gifts && tL_businessBotRights3.transfer_stars) {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        v0Var5.f10425c.Y2.N(true);
                                        v0Var5.Y(true);
                                        return;
                                    }
                                    v0Var5.X(-17, true, new o0(v0Var5, 1));
                                    return;
                                default:
                                    v0 v0Var6 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = v0Var6.J;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    v0Var6.f10425c.Y2.N(true);
                                    v0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(v51Var3);
                    j61Var9.T();
                    str2 = "";
                } else {
                    j61Var9.U();
                    arrayList6.add(v51.k(v0Var.e));
                    longSparseArray.clear();
                    int i21 = 0;
                    boolean z20 = false;
                    while (i21 < v0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) v0Var.d.d.get(i21);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                str3 = str4;
                                long j12 = user.f18483id;
                                String str8 = v0Var.f10432y;
                                v51 v51Var4 = new v51(13);
                                v51Var4.f29060x = j12;
                                v51Var4.f29051n = str8;
                                arrayList6.add(v51Var4);
                                longSparseArray.put(user.f18483id, user);
                                z20 = true;
                                i21++;
                                str4 = str3;
                            }
                        }
                        str3 = str4;
                        i21++;
                        str4 = str3;
                    }
                    str2 = str4;
                    for (int i22 = 0; i22 < v0Var.d.e.size(); i22++) {
                        TLObject tLObject2 = (TLObject) v0Var.d.e.get(i22);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j13 = user2.f18483id;
                                String str9 = v0Var.f10432y;
                                v51 v51Var5 = new v51(13);
                                v51Var5.f29060x = j13;
                                v51Var5.f29051n = str9;
                                arrayList6.add(v51Var5);
                                longSparseArray.put(user2.f18483id, user2);
                                z20 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(v0Var.f10426f.getText().toString()) || v0Var.d.e() || v0Var.f10431x)) {
                        arrayList6.add(v51.k(v0Var.f10427n));
                        z20 = true;
                    }
                    View view = v0Var.h;
                    if (z20) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    view.setVisibility(i12);
                    j61Var9.T();
                }
                arrayList6.add(v51.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                j61Var9.U();
                v51 t10 = v51.t(LocaleController.getString(R.string.BusinessBotChats2));
                if (v0Var.M != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t10.f29045g = z11;
                arrayList6.add(t10);
                v51 w12 = v51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(v0Var.I);
                if (v0Var.M != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                w12.f29045g = z12;
                arrayList6.add(w12);
                v51 w13 = v51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!v0Var.I);
                if (v0Var.M != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                w13.f29045g = z13;
                arrayList6.add(w13);
                j61Var9.T();
                arrayList6.add(v51.B(null));
                c0 c0Var2 = v0Var.v;
                if (v0Var.M != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                c0Var2.a(arrayList6, j61Var9, z14);
                hg.c.n(R.string.BusinessBotChatsInfo2, arrayList6);
                if (v0Var.M != null) {
                    j61Var9.U();
                    com.google.android.gms.internal.vision.e2.n(R.string.BusinessBotPermissions, arrayList6);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = v0Var.J;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    v51 m10 = v51.m(-4, string3, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = v0Var.J;
                    if (tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    m10.K(z15);
                    m10.f29044f = !v0Var.P;
                    m10.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    v0 v0Var2 = v0Var;
                                    v0Var2.M = null;
                                    v0Var2.f10425c.Y2.N(true);
                                    v0Var2.Y(true);
                                    return;
                                case 1:
                                    v0 v0Var3 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = v0Var3.J;
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
                                    v0Var3.f10425c.Y2.N(true);
                                    v0Var3.Y(true);
                                    return;
                                case 2:
                                    v0 v0Var4 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = v0Var4.J;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        v0Var4.f10425c.Y2.N(true);
                                        v0Var4.Y(true);
                                        return;
                                    }
                                    v0Var4.X(-14, true, new o0(v0Var4, 2));
                                    return;
                                case 3:
                                    v0 v0Var5 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = v0Var5.J;
                                    if (tL_businessBotRights32.view_gifts && tL_businessBotRights32.sell_gifts && tL_businessBotRights32.change_gift_settings && tL_businessBotRights32.transfer_and_upgrade_gifts && tL_businessBotRights32.transfer_stars) {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        v0Var5.f10425c.Y2.N(true);
                                        v0Var5.Y(true);
                                        return;
                                    }
                                    v0Var5.X(-17, true, new o0(v0Var5, 1));
                                    return;
                                default:
                                    v0 v0Var6 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = v0Var6.J;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    v0Var6.f10425c.Y2.N(true);
                                    v0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m10);
                    if (v0Var.P) {
                        v51 y3 = v51.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y3.K(true);
                        y3.f29045g = false;
                        y3.f29046i = 1;
                        arrayList6.add(y3);
                        v51 y10 = v51.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y10.K(v0Var.J.reply);
                        y10.f29046i = 1;
                        arrayList6.add(y10);
                        v51 y11 = v51.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y11.K(v0Var.J.read_messages);
                        y11.f29046i = 1;
                        arrayList6.add(y11);
                        v51 y12 = v51.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y12.K(v0Var.J.delete_sent_messages);
                        y12.f29046i = 1;
                        arrayList6.add(y12);
                        v51 y13 = v51.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y13.K(v0Var.J.delete_received_messages);
                        y13.f29046i = 1;
                        arrayList6.add(y13);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = v0Var.J;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    v51 m11 = v51.m(-10, string4, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = v0Var.J;
                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    m11.K(z16);
                    m11.f29044f = !v0Var.Q;
                    m11.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    v0 v0Var2 = v0Var;
                                    v0Var2.M = null;
                                    v0Var2.f10425c.Y2.N(true);
                                    v0Var2.Y(true);
                                    return;
                                case 1:
                                    v0 v0Var3 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = v0Var3.J;
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
                                    v0Var3.f10425c.Y2.N(true);
                                    v0Var3.Y(true);
                                    return;
                                case 2:
                                    v0 v0Var4 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = v0Var4.J;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        v0Var4.f10425c.Y2.N(true);
                                        v0Var4.Y(true);
                                        return;
                                    }
                                    v0Var4.X(-14, true, new o0(v0Var4, 2));
                                    return;
                                case 3:
                                    v0 v0Var5 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = v0Var5.J;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        v0Var5.f10425c.Y2.N(true);
                                        v0Var5.Y(true);
                                        return;
                                    }
                                    v0Var5.X(-17, true, new o0(v0Var5, 1));
                                    return;
                                default:
                                    v0 v0Var6 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = v0Var6.J;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    v0Var6.f10425c.Y2.N(true);
                                    v0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m11);
                    if (v0Var.Q) {
                        v51 y14 = v51.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y14.K(v0Var.J.edit_name);
                        y14.f29046i = 1;
                        arrayList6.add(y14);
                        v51 y15 = v51.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y15.K(v0Var.J.edit_bio);
                        y15.f29046i = 1;
                        arrayList6.add(y15);
                        v51 y16 = v51.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y16.K(v0Var.J.edit_profile_photo);
                        y16.f29046i = 1;
                        arrayList6.add(y16);
                        v51 y17 = v51.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y17.K(v0Var.J.edit_username);
                        y17.f29046i = 1;
                        arrayList6.add(y17);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = v0Var.J;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    v51 m12 = v51.m(-15, string5, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = v0Var.J;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    m12.K(z17);
                    m12.f29044f = !v0Var.R;
                    m12.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    v0 v0Var2 = v0Var;
                                    v0Var2.M = null;
                                    v0Var2.f10425c.Y2.N(true);
                                    v0Var2.Y(true);
                                    return;
                                case 1:
                                    v0 v0Var3 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = v0Var3.J;
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
                                    v0Var3.f10425c.Y2.N(true);
                                    v0Var3.Y(true);
                                    return;
                                case 2:
                                    v0 v0Var4 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = v0Var4.J;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        v0Var4.f10425c.Y2.N(true);
                                        v0Var4.Y(true);
                                        return;
                                    }
                                    v0Var4.X(-14, true, new o0(v0Var4, 2));
                                    return;
                                case 3:
                                    v0 v0Var5 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = v0Var5.J;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        v0Var5.f10425c.Y2.N(true);
                                        v0Var5.Y(true);
                                        return;
                                    }
                                    v0Var5.X(-17, true, new o0(v0Var5, 1));
                                    return;
                                default:
                                    v0 v0Var6 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = v0Var6.J;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    v0Var6.f10425c.Y2.N(true);
                                    v0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m12);
                    if (v0Var.R) {
                        v51 y18 = v51.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y18.K(v0Var.J.view_gifts);
                        y18.f29046i = 1;
                        arrayList6.add(y18);
                        v51 y19 = v51.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y19.K(v0Var.J.sell_gifts);
                        y19.f29046i = 1;
                        arrayList6.add(y19);
                        v51 y20 = v51.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y20.K(v0Var.J.change_gift_settings);
                        y20.f29046i = 1;
                        arrayList6.add(y20);
                        v51 y21 = v51.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y21.K(v0Var.J.transfer_and_upgrade_gifts);
                        y21.f29046i = 1;
                        arrayList6.add(y21);
                        v51 y22 = v51.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y22.K(v0Var.J.transfer_stars);
                        y22.f29046i = 1;
                        arrayList6.add(y22);
                    }
                    v51 m13 = v51.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), str2);
                    m13.K(v0Var.J.manage_stories);
                    m13.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    v0 v0Var2 = v0Var;
                                    v0Var2.M = null;
                                    v0Var2.f10425c.Y2.N(true);
                                    v0Var2.Y(true);
                                    return;
                                case 1:
                                    v0 v0Var3 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = v0Var3.J;
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
                                    v0Var3.f10425c.Y2.N(true);
                                    v0Var3.Y(true);
                                    return;
                                case 2:
                                    v0 v0Var4 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = v0Var4.J;
                                    if (tL_businessBotRights22.edit_name && tL_businessBotRights22.edit_bio && tL_businessBotRights22.edit_profile_photo && tL_businessBotRights22.edit_username) {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        v0Var4.f10425c.Y2.N(true);
                                        v0Var4.Y(true);
                                        return;
                                    }
                                    v0Var4.X(-14, true, new o0(v0Var4, 2));
                                    return;
                                case 3:
                                    v0 v0Var5 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = v0Var5.J;
                                    if (tL_businessBotRights322.view_gifts && tL_businessBotRights322.sell_gifts && tL_businessBotRights322.change_gift_settings && tL_businessBotRights322.transfer_and_upgrade_gifts && tL_businessBotRights322.transfer_stars) {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        v0Var5.f10425c.Y2.N(true);
                                        v0Var5.Y(true);
                                        return;
                                    }
                                    v0Var5.X(-17, true, new o0(v0Var5, 1));
                                    return;
                                default:
                                    v0 v0Var6 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = v0Var6.J;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    v0Var6.f10425c.Y2.N(true);
                                    v0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m13);
                    j61Var9.T();
                    arrayList6.add(v51.A(-4, null));
                    arrayList6.add(v51.A(-5, null));
                    arrayList6.add(v51.A(-6, null));
                    arrayList6.add(v51.A(-7, null));
                    return;
                }
                return;
            case 25:
                x0.U((x0) obj3, (ArrayList) obj, (j61) obj2);
                return;
            case 26:
                f1 f1Var = (f1) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                j61 j61Var10 = (j61) obj2;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i23 = R.raw.biz_map;
                v51 v51Var6 = new v51(2);
                v51Var6.f29049l = string6;
                v51Var6.f29052o = string7;
                v51Var6.f29048k = i23;
                arrayList7.add(v51Var6);
                arrayList7.add(v51.k(f1Var.e));
                arrayList7.add(v51.B(null));
                v51 i24 = v51.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                if (f1Var.f10265x != null) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                i24.K(z18);
                arrayList7.add(i24);
                if (f1Var.f10265x != null) {
                    arrayList7.add(v51.k(f1Var.h));
                }
                arrayList7.add(v51.B(null));
                if (f1Var.f10264w != null && (f1Var.f10265x != null || !TextUtils.isEmpty(f1Var.f10266y))) {
                    z19 = true;
                }
                f1Var.G = z19;
                if (z19) {
                    v51 e = v51.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e.f29055r = true;
                    arrayList7.add(e);
                    arrayList7.add(v51.B(null));
                }
                f1Var.U(true);
                return;
            case 27:
                j61 j61Var11 = (j61) obj2;
                h1.V((h1) obj3, (ArrayList) obj);
                return;
            default:
                j1 j1Var = (j1) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                j61 j61Var12 = (j61) obj2;
                ArrayList arrayList9 = j1Var.f10302b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                v51 v51Var7 = new v51(9);
                v51Var7.d = -1;
                v51Var7.f29049l = string8;
                v51Var7.K(j1Var.f10306r);
                arrayList8.add(v51Var7);
                arrayList8.add(v51.B(null));
                if (j1Var.f10306r) {
                    for (int i25 = 0; i25 < arrayList9.size(); i25++) {
                        if (i25 > 0) {
                            arrayList8.add(v51.B(null));
                        }
                        g1 g1Var = (g1) arrayList9.get(i25);
                        if (!j1Var.U()) {
                            int i26 = i25 * 3;
                            arrayList8.add(v51.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), g1.a(g1Var.f10277a), i26));
                            arrayList8.add(v51.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), g1.a(g1Var.f10278b), i26 + 1));
                            v51 e7 = v51.e(i26 + 2, LocaleController.getString(R.string.Remove));
                            e7.f29055r = true;
                            arrayList8.add(e7);
                        }
                    }
                    if (j1Var.V()) {
                        arrayList8.add(v51.B(null));
                        v51 c11 = v51.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c11.f29054q = true;
                        arrayList8.add(c11);
                    }
                    hg.c.n(R.string.BusinessHoursDayInfo, arrayList8);
                    return;
                }
                return;
        }
    }
}
