package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import ci.d2;
import ci.kc;
import ci.l8;
import ci.lc;
import ci.m8;
import ci.nb;
import ci.oc;
import ci.q6;
import ci.r2;
import ci.s8;
import ci.u8;
import ci.y1;
import ci.z3;
import ci.zb;
import com.google.android.gms.internal.vision.e2;
import ei.d5;
import ei.e4;
import ei.e5;
import ei.k3;
import ei.m2;
import ei.p1;
import gg.h0;
import hg.b0;
import hg.e1;
import hg.f1;
import hg.g1;
import hg.i1;
import hg.l0;
import hg.u0;
import hg.w0;
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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.ty;
public final class v implements Utilities.Callback2 {
    public final int f3934a;
    public final Object f3935b;

    public v(Object obj, int i10) {
        this.f3934a = i10;
        this.f3935b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        su editText;
        Utilities.Callback callback;
        long duration;
        String str;
        String upperCase;
        boolean z10;
        int i10;
        d71 d71Var;
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
        int i13 = this.f3934a;
        String str4 = "";
        int i14 = -1;
        int i15 = 0;
        r9 = false;
        boolean z21 = false;
        boolean z22 = true;
        Object obj3 = this.f3935b;
        switch (i13) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                d71 d71Var2 = (d71) obj2;
                ((y) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size = languages.size();
                while (i15 < size) {
                    TranslateController.Language language = languages.get(i15);
                    i15++;
                    int i16 = w.f3936a;
                    q61 J = q61.J(w.class);
                    J.G = language;
                    arrayList.add(J);
                }
                return;
            case 1:
                ci.m mVar = (ci.m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.I;
                RectF rectF = mVar.f5581z0;
                ci.g gVar = mVar.f5555f;
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
                su editText2 = gVar.getEditText();
                if (c10 == null) {
                    i14 = -2130706433;
                }
                editText2.setHintColor(i14);
                if (c10 == null) {
                    runnable.run();
                    return;
                }
                su editText3 = gVar.getEditText();
                canvas.saveLayerAlpha(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), 255, 31);
                runnable.run();
                canvas.drawRect(0.0f, 0.0f, editText3.getWidth(), editText3.getHeight(), c10);
                canvas.restore();
                return;
            case 2:
                y1 y1Var = (y1) obj3;
                String str5 = (String) obj;
                r2 r2Var = y1Var.f6346r;
                r2Var.f5882b = str5;
                r2Var.f5883c = ((Integer) obj2).intValue();
                y1Var.f6342c.H(str5);
                return;
            case 3:
                d2 d2Var = (d2) obj3;
                String str6 = (String) obj;
                r2 r2Var2 = d2Var.f4901s;
                r2Var2.f5882b = str6;
                r2Var2.f5883c = ((Integer) obj2).intValue();
                d2Var.f4896c.D(str6);
                return;
            case 4:
                z3 z3Var = (z3) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                if (obj != null) {
                    if (z3Var.f6418e == null && (obj instanceof MediaController.PhotoEntry) && (callback = z3Var.f6419f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        return;
                    }
                    return;
                }
                z3Var.getClass();
                return;
            case 5:
                q6 q6Var = (q6) obj3;
                q6Var.d0(q6Var.i0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                return;
            case 6:
                ((kc) obj3).Z((Bitmap) obj, ((Float) obj2).floatValue());
                return;
            case 7:
                u8 u8Var = (u8) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                d71 d71Var3 = (d71) obj2;
                if (u8Var.f6086h0 || u8Var.f6085g0 != null) {
                    TLRPC.WebPage webPage = u8Var.f6085g0;
                    m8 m8Var = new m8(u8Var, 0);
                    int i17 = s8.f5958a;
                    q61 J2 = q61.J(s8.class);
                    J2.G = webPage;
                    J2.D = m8Var;
                    arrayList2.add(J2);
                }
                arrayList2.add(q61.k(u8Var.Y));
                arrayList2.add(q61.A(1, null));
                q61 i18 = q61.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i18.K(u8Var.m0);
                arrayList2.add(i18);
                if (u8Var.m0) {
                    arrayList2.add(q61.k(u8Var.Z));
                }
                arrayList2.add(q61.A(3, null));
                arrayList2.add(q61.k(u8Var.f6079a0));
                return;
            case 8:
                lc lcVar = (lc) obj3;
                Boolean bool = (Boolean) obj;
                Float f7 = (Float) obj2;
                if (lcVar.X0.getDuration() < 100) {
                    duration = lcVar.K1.f5412h0;
                } else {
                    duration = lcVar.X0.getDuration();
                }
                float floatValue = ((f7.floatValue() / 0.96f) * 0.04f) + f7.floatValue();
                l8 l8Var = lcVar.K1;
                float f10 = l8Var.f5395a0;
                float f11 = l8Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = (float) duration;
                long j3 = f12 * f13;
                zb zbVar = lcVar.X0;
                long j10 = (f11 * f13) + ((float) j3);
                lcVar.M1 = j10;
                zbVar.m(j10);
                nb nbVar = lcVar.f5527v1;
                if (nbVar != null) {
                    nbVar.setCoverTime(lcVar.M1);
                }
                l8 l8Var2 = lcVar.K1;
                if (l8Var2 != null && l8Var2.f5410g) {
                    l8Var2.f5415j = true;
                    return;
                }
                return;
            case 9:
                ((oc) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                return;
            case 10:
                ((di.i) obj3).D0((ArrayList) obj, (d71) obj2);
                return;
            case 11:
                di.h hVar = (di.h) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                d71 d71Var4 = (d71) obj2;
                arrayList3.add(q61.k(hVar.Y));
                arrayList3.add(q61.k(hVar.Z));
                return;
            case 12:
                ((ei.l) obj3).F0((ArrayList) obj, (d71) obj2);
                return;
            case 13:
                d71 d71Var5 = (d71) obj2;
                ei.u.U((ei.u) obj3, (ArrayList) obj);
                return;
            case 14:
                r6 r6Var = (r6) obj3;
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
                r6Var.setText(sb2);
                return;
            case 15:
                p1 p1Var = (p1) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                d71 d71Var6 = (d71) obj2;
                arrayList4.add(q61.j(-1, p1Var.f9281a0));
                arrayList4.add(q61.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, p1Var.Y))));
                return;
            case 16:
                k3 k3Var = (k3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    k3Var.getClass();
                    return;
                }
                e5 e5Var = k3Var.f9180v0;
                if (e5Var != null) {
                    e5Var.a(tL_webViewResultUrl);
                    k3Var.o();
                    return;
                }
                return;
            case 17:
                ((e4) obj3).G0((ArrayList) obj, (d71) obj2);
                return;
            case 18:
                ((d5) obj3).U((ArrayList) obj, (d71) obj2);
                return;
            case 19:
                d71 d71Var7 = (d71) obj2;
                ((fi.s) obj3).v.c((ArrayList) obj);
                return;
            case 20:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                xo0 xo0Var = (xo0) ((h0) obj3);
                ty tyVar = xo0Var.I0;
                AndroidUtilities.hideKeyboard(tyVar.getParentActivity().getCurrentFocus());
                q80 I = q80.I(tyVar, (i6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                } else {
                    q80 J3 = I.J();
                    J3.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new cd0(I, 24), false);
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
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new po0(xo0Var, tyVar, xo0Var.J0, I, 0), z10);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new po0(xo0Var, tyVar, tL_sponsoredPeer, I, 1), z10);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new cf0(xo0Var, tyVar, I, 4), z10);
                if (LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                I.V(i10);
                I.Y = true;
                I.f30121t = z10;
                I.Z();
                return;
            case 21:
                hg.d.U((hg.d) obj3, (ArrayList) obj, (d71) obj2);
                return;
            case 22:
                hg.n nVar = (hg.n) obj3;
                nVar.L.dismiss();
                nVar.f11326y = (String) obj;
                nVar.E = (TLRPC.InputDocument) obj2;
                nVar.f11324w = false;
                AndroidUtilities.cancelRunOnUIThread(nVar.d);
                nVar.f11321n.setSticker(nVar.f11326y);
                nVar.e0(true);
                f71 f71Var = nVar.f26629a;
                if (f71Var != null && (d71Var = f71Var.W2) != null) {
                    d71Var.N(true);
                    return;
                }
                return;
            case 23:
                l0 l0Var = (l0) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                d71 d71Var8 = (d71) obj2;
                d71Var8.E = 1;
                LinearLayout linearLayout = l0Var.f11305a0;
                q61 q61Var = new q61(-4);
                q61Var.d = -5;
                q61Var.f30056c = linearLayout;
                q61Var.f30076z = -1;
                arrayList5.add(q61Var);
                TL_account.TL_connectedBot tL_connectedBot = l0Var.X;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        e2.n(R.string.SessionBotConnectedFrom, arrayList5);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList5.add(q61.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i11 = 2;
                            arrayList5.add(q61.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i11 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i11)) {
                            arrayList5.add(q61.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList5.add(q61.B(null));
                    }
                    d71Var8.U();
                    e2.n(R.string.BusinessBotChats2, arrayList5);
                    int i19 = l0.f11303g0;
                    q61 w10 = q61.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(l0Var.f11309e0);
                    arrayList5.add(w10);
                    int i20 = l0.f11304h0;
                    q61 w11 = q61.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!l0Var.f11309e0);
                    arrayList5.add(w11);
                    d71Var8.T();
                    arrayList5.add(q61.B(null));
                    b0 b0Var = l0Var.Z;
                    if (b0Var != null) {
                        b0Var.a(arrayList5, d71Var8, true);
                    }
                    hg.c.n(R.string.BusinessBotChatsInfo2, arrayList5);
                    return;
                }
                return;
            case 24:
                final u0 u0Var = (u0) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                d71 d71Var9 = (d71) obj2;
                LongSparseArray longSparseArray = u0Var.N;
                String string = LocaleController.getString(R.string.BusinessBots2);
                String string2 = LocaleController.getString(R.string.BusinessBots2Info);
                q61 q61Var2 = new q61(2);
                q61Var2.f30063l = string;
                q61Var2.f30066o = string2;
                q61Var2.f30064m = "tg_superplaceholders_android_2";
                q61Var2.f30065n = "🤖🏝️";
                q61Var2.f30076z = 120;
                arrayList6.add(q61Var2);
                if (u0Var.M != null) {
                    d71Var9.U();
                    long j11 = u0Var.M.f20189id;
                    q61 q61Var3 = new q61(13);
                    q61Var3.f30074x = j11;
                    q61Var3.K(true);
                    q61Var3.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f11401c.W2.N(true);
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
                                    u0Var3.f11401c.W2.N(true);
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
                                        u0Var4.f11401c.W2.N(true);
                                        u0Var4.Y(true);
                                        return;
                                    }
                                    u0Var4.X(-14, true, new n0(u0Var4, 2));
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
                                        u0Var5.f11401c.W2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new n0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var6.J;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    u0Var6.f11401c.W2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(q61Var3);
                    d71Var9.T();
                    z11 = true;
                    str2 = "";
                } else {
                    d71Var9.U();
                    arrayList6.add(q61.k(u0Var.f11402e));
                    longSparseArray.clear();
                    int i21 = 0;
                    boolean z23 = false;
                    while (i21 < u0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) u0Var.d.d.get(i21);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                z12 = z22;
                                str3 = str4;
                                long j12 = user.f20189id;
                                String str8 = u0Var.f11409y;
                                q61 q61Var4 = new q61(13);
                                q61Var4.f30074x = j12;
                                q61Var4.f30065n = str8;
                                arrayList6.add(q61Var4);
                                longSparseArray.put(user.f20189id, user);
                                z23 = z12;
                                i21++;
                                str4 = str3;
                                z22 = z12;
                            }
                        }
                        z12 = z22;
                        str3 = str4;
                        i21++;
                        str4 = str3;
                        z22 = z12;
                    }
                    z11 = z22;
                    str2 = str4;
                    for (int i22 = 0; i22 < u0Var.d.f10535e.size(); i22++) {
                        TLObject tLObject2 = (TLObject) u0Var.d.f10535e.get(i22);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j13 = user2.f20189id;
                                String str9 = u0Var.f11409y;
                                q61 q61Var5 = new q61(13);
                                q61Var5.f30074x = j13;
                                q61Var5.f30065n = str9;
                                arrayList6.add(q61Var5);
                                longSparseArray.put(user2.f20189id, user2);
                                z23 = z11;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(u0Var.f11403f.getText().toString()) || u0Var.d.e() || u0Var.f11408x)) {
                        arrayList6.add(q61.k(u0Var.f11404n));
                        z23 = z11;
                    }
                    View view = u0Var.h;
                    if (z23) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    view.setVisibility(i12);
                    d71Var9.T();
                }
                arrayList6.add(q61.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                d71Var9.U();
                q61 t10 = q61.t(LocaleController.getString(R.string.BusinessBotChats2));
                if (u0Var.M != null) {
                    z13 = z11;
                } else {
                    z13 = false;
                }
                t10.f30059g = z13;
                arrayList6.add(t10);
                q61 w12 = q61.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(u0Var.I);
                if (u0Var.M != null) {
                    z14 = z11;
                } else {
                    z14 = false;
                }
                w12.f30059g = z14;
                arrayList6.add(w12);
                q61 w13 = q61.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!u0Var.I);
                if (u0Var.M != null) {
                    z15 = z11;
                } else {
                    z15 = false;
                }
                w13.f30059g = z15;
                arrayList6.add(w13);
                d71Var9.T();
                arrayList6.add(q61.B(null));
                b0 b0Var2 = u0Var.v;
                if (u0Var.M != null) {
                    z16 = z11;
                } else {
                    z16 = false;
                }
                b0Var2.a(arrayList6, d71Var9, z16);
                hg.c.n(R.string.BusinessBotChatsInfo2, arrayList6);
                if (u0Var.M != null) {
                    d71Var9.U();
                    e2.n(R.string.BusinessBotPermissions, arrayList6);
                    String string3 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = u0Var.J;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    q61 m10 = q61.m(-4, string3, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var.J;
                    if (tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages) {
                        z17 = z11;
                    } else {
                        z17 = false;
                    }
                    m10.K(z17);
                    m10.f30058f = !u0Var.P;
                    boolean z24 = z11;
                    final int i23 = z24 ? 1 : 0;
                    m10.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (i23) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f11401c.W2.N(true);
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
                                    u0Var3.f11401c.W2.N(true);
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
                                        u0Var4.f11401c.W2.N(true);
                                        u0Var4.Y(true);
                                        return;
                                    }
                                    u0Var4.X(-14, true, new n0(u0Var4, 2));
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
                                        u0Var5.f11401c.W2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new n0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var6.J;
                                    tL_businessBotRights4.manage_stories = !tL_businessBotRights4.manage_stories;
                                    u0Var6.f11401c.W2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m10);
                    if (u0Var.P) {
                        q61 y3 = q61.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y3.K(z24);
                        y3.f30059g = false;
                        y3.f30060i = z24 ? 1 : 0;
                        arrayList6.add(y3);
                        q61 y10 = q61.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y10.K(u0Var.J.reply);
                        y10.f30060i = z24 ? 1 : 0;
                        arrayList6.add(y10);
                        q61 y11 = q61.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y11.K(u0Var.J.read_messages);
                        y11.f30060i = z24 ? 1 : 0;
                        arrayList6.add(y11);
                        q61 y12 = q61.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y12.K(u0Var.J.delete_sent_messages);
                        y12.f30060i = z24 ? 1 : 0;
                        arrayList6.add(y12);
                        q61 y13 = q61.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y13.K(u0Var.J.delete_received_messages);
                        y13.f30060i = z24 ? 1 : 0;
                        arrayList6.add(y13);
                    }
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var.J;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    q61 m11 = q61.m(-10, string4, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var.J;
                    if (tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    m11.K(z18);
                    m11.f30058f = !u0Var.Q;
                    m11.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (i23) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f11401c.W2.N(true);
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
                                    u0Var3.f11401c.W2.N(true);
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
                                        u0Var4.f11401c.W2.N(true);
                                        u0Var4.Y(true);
                                        return;
                                    }
                                    u0Var4.X(-14, true, new n0(u0Var4, 2));
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
                                        u0Var5.f11401c.W2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new n0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = u0Var6.J;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    u0Var6.f11401c.W2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m11);
                    if (u0Var.Q) {
                        q61 y14 = q61.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y14.K(u0Var.J.edit_name);
                        y14.f30060i = 1;
                        arrayList6.add(y14);
                        q61 y15 = q61.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y15.K(u0Var.J.edit_bio);
                        y15.f30060i = 1;
                        arrayList6.add(y15);
                        q61 y16 = q61.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y16.K(u0Var.J.edit_profile_photo);
                        y16.f30060i = 1;
                        arrayList6.add(y16);
                        q61 y17 = q61.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y17.K(u0Var.J.edit_username);
                        y17.f30060i = 1;
                        arrayList6.add(y17);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = u0Var.J;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    q61 m12 = q61.m(-15, string5, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = u0Var.J;
                    if (tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    m12.K(z19);
                    m12.f30058f = !u0Var.R;
                    m12.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (i23) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f11401c.W2.N(true);
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
                                    u0Var3.f11401c.W2.N(true);
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
                                        u0Var4.f11401c.W2.N(true);
                                        u0Var4.Y(true);
                                        return;
                                    }
                                    u0Var4.X(-14, true, new n0(u0Var4, 2));
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
                                        u0Var5.f11401c.W2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new n0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = u0Var6.J;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    u0Var6.f11401c.W2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m12);
                    if (u0Var.R) {
                        q61 y18 = q61.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y18.K(u0Var.J.view_gifts);
                        y18.f30060i = 1;
                        arrayList6.add(y18);
                        q61 y19 = q61.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y19.K(u0Var.J.sell_gifts);
                        y19.f30060i = 1;
                        arrayList6.add(y19);
                        q61 y20 = q61.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y20.K(u0Var.J.change_gift_settings);
                        y20.f30060i = 1;
                        arrayList6.add(y20);
                        q61 y21 = q61.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y21.K(u0Var.J.transfer_and_upgrade_gifts);
                        y21.f30060i = 1;
                        arrayList6.add(y21);
                        q61 y22 = q61.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y22.K(u0Var.J.transfer_stars);
                        y22.f30060i = 1;
                        arrayList6.add(y22);
                    }
                    q61 m13 = q61.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), str2);
                    m13.K(u0Var.J.manage_stories);
                    m13.D = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            switch (i23) {
                                case 0:
                                    u0 u0Var2 = u0Var;
                                    u0Var2.M = null;
                                    u0Var2.f11401c.W2.N(true);
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
                                    u0Var3.f11401c.W2.N(true);
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
                                        u0Var4.f11401c.W2.N(true);
                                        u0Var4.Y(true);
                                        return;
                                    }
                                    u0Var4.X(-14, true, new n0(u0Var4, 2));
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
                                        u0Var5.f11401c.W2.N(true);
                                        u0Var5.Y(true);
                                        return;
                                    }
                                    u0Var5.X(-17, true, new n0(u0Var5, 1));
                                    return;
                                default:
                                    u0 u0Var6 = u0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights42 = u0Var6.J;
                                    tL_businessBotRights42.manage_stories = !tL_businessBotRights42.manage_stories;
                                    u0Var6.f11401c.W2.N(true);
                                    u0Var6.Y(true);
                                    return;
                            }
                        }
                    };
                    arrayList6.add(m13);
                    d71Var9.T();
                    arrayList6.add(q61.A(-4, null));
                    arrayList6.add(q61.A(-5, null));
                    arrayList6.add(q61.A(-6, null));
                    arrayList6.add(q61.A(-7, null));
                    return;
                }
                return;
            case 25:
                w0.U((w0) obj3, (ArrayList) obj, (d71) obj2);
                return;
            case 26:
                e1 e1Var = (e1) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                d71 d71Var10 = (d71) obj2;
                String string6 = LocaleController.getString(R.string.BusinessLocation);
                String string7 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i24 = R.raw.biz_map;
                q61 q61Var6 = new q61(2);
                q61Var6.f30063l = string6;
                q61Var6.f30066o = string7;
                q61Var6.f30062k = i24;
                arrayList7.add(q61Var6);
                arrayList7.add(q61.k(e1Var.f11208e));
                arrayList7.add(q61.B(null));
                q61 i25 = q61.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                if (e1Var.f11214x != null) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                i25.K(z20);
                arrayList7.add(i25);
                if (e1Var.f11214x != null) {
                    arrayList7.add(q61.k(e1Var.h));
                }
                arrayList7.add(q61.B(null));
                if (e1Var.f11213w != null && (e1Var.f11214x != null || !TextUtils.isEmpty(e1Var.f11215y))) {
                    z21 = true;
                }
                e1Var.G = z21;
                if (z21) {
                    q61 e7 = q61.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e7.f30069r = true;
                    arrayList7.add(e7);
                    arrayList7.add(q61.B(null));
                }
                e1Var.U(true);
                return;
            case 27:
                d71 d71Var11 = (d71) obj2;
                g1.V((g1) obj3, (ArrayList) obj);
                return;
            default:
                i1 i1Var = (i1) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                d71 d71Var12 = (d71) obj2;
                ArrayList arrayList9 = i1Var.f11268b;
                String string8 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                q61 q61Var7 = new q61(9);
                q61Var7.d = -1;
                q61Var7.f30063l = string8;
                q61Var7.K(i1Var.f11273r);
                arrayList8.add(q61Var7);
                arrayList8.add(q61.B(null));
                if (i1Var.f11273r) {
                    for (int i26 = 0; i26 < arrayList9.size(); i26++) {
                        if (i26 > 0) {
                            arrayList8.add(q61.B(null));
                        }
                        f1 f1Var = (f1) arrayList9.get(i26);
                        if (!i1Var.U()) {
                            int i27 = i26 * 3;
                            arrayList8.add(q61.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), f1.a(f1Var.f11228a), i27));
                            arrayList8.add(q61.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), f1.a(f1Var.f11229b), i27 + 1));
                            q61 e10 = q61.e(i27 + 2, LocaleController.getString(R.string.Remove));
                            e10.f30069r = true;
                            arrayList8.add(e10);
                        }
                    }
                    if (i1Var.V()) {
                        arrayList8.add(q61.B(null));
                        q61 c11 = q61.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c11.f30068q = true;
                        arrayList8.add(c11);
                    }
                    hg.c.n(R.string.BusinessHoursDayInfo, arrayList8);
                    return;
                }
                return;
        }
    }
}
