package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class ht implements p8c {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ht(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void a(Object obj) {
        Uri uri;
        String str;
        Intent intent;
        String country;
        BufferedReader bufferedReader;
        boolean z;
        Object[] objArr;
        int L;
        int L2;
        int i;
        int i2;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.ChatFull L0;
        TLRPC.User V1;
        TLRPC.Document document;
        int i3;
        String str2 = null;
        TLObject tLObject = null;
        boolean z2 = true;
        Object[] objArr2 = null;
        boolean z3 = false;
        int i4 = 0;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                m mVar = (m) this.c;
                Activity activity = (Activity) this.d;
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3) && mVar.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3.trim());
                    gl.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i5 = 0;
                    for (int i6 = 0; i6 < uRLSpanArr.length; i6++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i6]), length);
                        i5 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i6]), i5);
                    }
                    oVar.i0.k(false);
                    Pattern pattern = Utilities.a;
                    try {
                        uri = Uri.parse(str3);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if ((uRLSpanArr.length > 0 && length == 0 && i5 > 0) || (uri != null && uri.getScheme() != null)) {
                        if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                            str3 = d01.w(uri, "https", null, uri.getEncodedPath(), "/");
                        }
                        mVar.getWebView().loadUrl(str3);
                        return;
                    }
                    eb.b(activity, str3);
                    cv0 webView = mVar.getWebView();
                    String str4 = is9.a().b;
                    if (str4 != null) {
                        str2 = str4 + URLEncoder.encode(str3);
                    }
                    webView.loadUrl(str2);
                    return;
                }
                return;
            case 1:
                o oVar2 = (o) this.b;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                Boolean bool = (Boolean) obj;
                na7.q1(oVar2.Y).m(str5, true);
                if (!TextUtils.isEmpty(str6) && !TextUtils.equals(str6, str5)) {
                    na7.q1(oVar2.Y).m(str6, true);
                }
                if (!bool.booleanValue()) {
                    oVar2.a0();
                    return;
                } else {
                    LaunchActivity.J1 = new ts(oVar2, (byte) 7);
                    return;
                }
            case 2:
                ty tyVar = (ty) this.b;
                ((boolean[]) this.c)[0] = false;
                new o5(tyVar.getContext(), (wjb) this.d, tyVar.g2, (List) obj).show();
                return;
            case 3:
                ez ezVar = (ez) this.b;
                wjb wjbVar = (wjb) this.d;
                List list = (List) obj;
                ((boolean[]) this.c)[0] = false;
                if (ezVar.h2 != null) {
                    new o5(ezVar.getContext(), wjbVar, ezVar.h2, list).show();
                    ezVar.dismiss();
                    return;
                }
                return;
            case 4:
                i20 i20Var = (i20) this.b;
                hd hdVar = (hd) this.c;
                TLRPC.Document document2 = (TLRPC.Document) this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile == null) {
                    hdVar.dismiss();
                    return;
                }
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = na7.q1(i20Var.a).h1(y6c.h(i20Var.a).e());
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = inputFile;
                tL_inputMediaUploadedDocument.mime_type = document2.mime_type;
                tL_inputMediaUploadedDocument.attributes.addAll(document2.attributes);
                ConnectionsManager.getInstance(i20Var.a).sendRequest(tL_messages_uploadMedia, new pl(i20Var, hdVar, (byte) 1));
                return;
            case 5:
                hv0 hv0Var = (hv0) this.b;
                String str7 = (String) this.c;
                ev0 ev0Var = (ev0) this.d;
                Boolean bool2 = (Boolean) obj;
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bool2.booleanValue()) {
                        if (TextUtils.isEmpty(str7)) {
                            str = "removed";
                        } else {
                            str = "updated";
                        }
                    } else {
                        str = "failed";
                    }
                    jSONObject.put("status", str);
                    hv0Var.u(ev0Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 6:
                ng1 ng1Var = (ng1) this.b;
                p8c p8cVar = (p8c) this.d;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj;
                if (((TL_stories.TL_premium_boostsStatus) this.c).next_level_boosts > 0) {
                    z2 = false;
                }
                ng1Var.m = z2;
                ng1Var.a(tL_premium_myBoosts);
                p8cVar.a(ng1Var);
                return;
            case 7:
                mu1 mu1Var = (mu1) this.b;
                f27 f27Var = (f27) this.c;
                k27 k27Var = (k27) this.d;
                Long l = (Long) obj;
                if (f27Var != null) {
                    ArrayList arrayList2 = f27Var.d;
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        if (!mu1Var.getSendMessagesHelper().j0(l.longValue(), (k27) arrayList2.get(i7), false)) {
                            z2 = false;
                        }
                    }
                    if (z2 && mu1Var.g4 == 0) {
                        mu1Var.T9(false);
                        return;
                    }
                    return;
                } else if (mu1Var.getSendMessagesHelper().j0(l.longValue(), k27Var, false)) {
                    mu1Var.ud(false);
                    if (mu1Var.g4 == 0) {
                        mu1Var.T9(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                mu1 mu1Var2 = (mu1) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str8 = (String) this.d;
                Boolean bool3 = (Boolean) obj;
                if (mu1Var2.getParentActivity() != null) {
                    if (bool3.booleanValue()) {
                        intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                    } else {
                        intent = new Intent("android.intent.action.INSERT_OR_EDIT");
                        intent.setType("vnd.android.cursor.item/contact");
                    }
                    Intent intent2 = intent;
                    if (user != null) {
                        intent2.putExtra("name", qu2.m(0, user.first_name, user.last_name));
                    }
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    if (!str8.startsWith("+")) {
                        TLRPC.User f = mu1Var2.getUserConfig().f();
                        HashMap hashMap = new HashMap();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(a.b.getResources().getAssets().open("countries.txt")));
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                String[] split = readLine.split(";");
                                ?? obj2 = new Object();
                                obj2.a = split[2];
                                String str9 = split[0];
                                obj2.c = str9;
                                obj2.d = split[1];
                                List list2 = (List) hashMap.get(str9);
                                if (list2 == null) {
                                    String str10 = split[0];
                                    ArrayList arrayList4 = new ArrayList();
                                    hashMap.put(str10, arrayList4);
                                    list2 = arrayList4;
                                }
                                list2.add(obj2);
                            } else {
                                bufferedReader.close();
                                String str11 = f.phone;
                                int i8 = 4;
                                while (true) {
                                    if (i8 >= 1) {
                                        List list3 = (List) hashMap.get(str11.substring(0, i8));
                                        if (list3 != null && list3.size() > 0) {
                                            String str12 = ((mx2) list3.get(0)).c;
                                            if (str12.endsWith("0") && str8.startsWith("0")) {
                                                str8 = str8.substring(1);
                                            }
                                            str8 = tb4.y("+", str12, str8);
                                            objArr2 = 1;
                                        } else {
                                            i8--;
                                        }
                                    }
                                }
                                if (objArr2 == null) {
                                    Context context = a.b;
                                    if (context != null) {
                                        country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                                    } else {
                                        country = Locale.getDefault().getCountry();
                                    }
                                    if (country.endsWith("0") && str8.startsWith("0")) {
                                        str8 = str8.substring(1);
                                    }
                                    str8 = tb4.y("+", country, str8);
                                }
                            }
                        }
                    }
                    contentValues.put("data1", str8);
                    contentValues.put("data2", (Integer) 2);
                    arrayList3.add(contentValues);
                    intent2.putExtra("finishActivityOnSaveCompleted", true);
                    intent2.putParcelableArrayListExtra("data", arrayList3);
                    mu1Var2.getParentActivity().startActivity(intent2);
                    return;
                }
                return;
            case 9:
                Boolean bool4 = (Boolean) obj;
                ((mu1) this.b).Z8((TLRPC.TL_attachMenuBot) this.d, (TLRPC.User) this.c);
                return;
            case 10:
                wt1 wt1Var = (wt1) this.b;
                k27 k27Var2 = (k27) this.c;
                ht1 ht1Var = (ht1) this.d;
                if (((Boolean) obj).booleanValue()) {
                    mu1 mu1Var3 = wt1Var.a;
                    int D0 = k27Var2.D0();
                    TLRPC.MessageMedia n1 = k27.n1(k27Var2.k);
                    if (n1 instanceof TLRPC.TL_messageMediaDice) {
                        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n1).game_outcome;
                    }
                    x0 x0Var = new x0(wt1Var, k27Var2, (byte) 25);
                    int i9 = vma.Y1;
                    TLRPC.EmojiGameInfo emojiGameInfo = na7.q1(mu1Var3.getCurrentAccount()).k5;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        t11 t11Var = new t11(mu1Var3.getContext(), mu1Var3.getResourceProvider());
                        t11Var.a.setScaleX(1.25f);
                        t11Var.a.setScaleY(1.25f);
                        if (D0 == 1) {
                            t11Var.a.setImageResource(2131231058);
                        } else if (D0 == 2) {
                            t11Var.a.setImageResource(2131231059);
                        } else {
                            ry8 ry8Var = t11Var.a;
                            if (D0 == 3) {
                                ry8Var.setImageResource(2131231060);
                            } else if (D0 == 4) {
                                ry8Var.setImageResource(2131231061);
                            } else if (D0 == 5) {
                                ry8Var.setImageResource(2131231062);
                            } else if (D0 == 6) {
                                ry8Var.setImageResource(2131231063);
                            } else {
                                ry8Var.setScaleX(0.8f);
                                t11Var.a.setScaleY(0.8f);
                                t11Var.a.setImageDrawable(vu3.f("🎲"));
                            }
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131744999, null));
                        spannableStringBuilder2.append((CharSequence) jva.J0(j));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) r41.b(k96.M0(2131744997, null), new t7a(mu1Var3, x0Var, (byte) 10), mu1Var3.getResourceProvider(), null));
                        gl.B2(t11Var.b);
                        q41 q41Var = new q41(mu1Var3.getContext());
                        t11Var.b = q41Var;
                        q41Var.setSingleLine();
                        t11Var.b.setTypeface(Typeface.SANS_SERIF);
                        t11Var.b.setTextSize(1, 15.0f);
                        t11Var.b.setEllipsize(TextUtils.TruncateAt.END);
                        t11Var.b.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
                        t11Var.addView(t11Var.b, nme.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        t11Var.b.setText(jva.R0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        zkb.G(t11Var.b, bkb.wj, mu1Var3.getResourceProvider());
                        t11Var.setTextColor(bkb.v0(bkb.xj, mu1Var3.getResourceProvider()));
                        t11Var.b.setSingleLine(false);
                        t11Var.b.setMaxLines(2);
                        k21 k21Var = new k21(mu1Var3.getResourceProvider(), mu1Var3.getContext(), true);
                        k21Var.e(k96.M0(2131744998, null));
                        k21Var.b = new sma(x0Var, j, (byte) 0);
                        t11Var.setButton(k21Var);
                        u21.b0(mu1Var3).b(t11Var, 2750).j();
                        return;
                    }
                    return;
                }
                ht1Var.run();
                return;
            case 11:
                wt1 wt1Var2 = (wt1) this.b;
                gb2 gb2Var = (gb2) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((hd) this.c).b(200L);
                if (wt1Var2.a.getMessagesController().k4.l.f && !TextUtils.isEmpty(wt1Var2.a.getMessagesController().k4.P2.f)) {
                    z = true;
                } else {
                    z = false;
                }
                if ((contentsettings == null || !contentsettings.sensitive_can_change) && z) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(wt1Var2.a.getParentActivity());
                if (z) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    ag2 ag2Var = new ag2(1, wt1Var2.a.getResourceProvider(), wt1Var2.a.getParentActivity());
                    ag2Var.setBackground(bkb.L0(false));
                    ag2Var.e(k96.M0(2131748290, null), "", zArr[0], false, false);
                    if (k96.a0) {
                        L = gl.L(16.0f);
                    } else {
                        L = gl.L(8.0f);
                    }
                    if (k96.a0) {
                        L2 = gl.L(8.0f);
                    } else {
                        L2 = gl.L(16.0f);
                    }
                    ag2Var.setPadding(L, 0, L2, 0);
                    frameLayout.addView(ag2Var, nme.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    ag2Var.setOnClickListener(new ge(zArr, (byte) 9));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wt1Var2.a.getResourceProvider(), wt1Var2.a.getParentActivity());
                alertDialog$Builder.a.S = k96.M0(2131748281, null);
                if (objArr != null) {
                    i = 2131748283;
                } else {
                    i = 2131748284;
                }
                alertDialog$Builder.a.U = k96.M0(i, null);
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.a.H = (byte) 9;
                if (objArr != null) {
                    i2 = 2131748282;
                } else {
                    i2 = 2131752577;
                }
                alertDialog$Builder.g(k96.M0(i2, null), null);
                if (objArr == null) {
                    alertDialog$Builder.j(k96.M0(2131748289, null), new of(wt1Var2, gb2Var, zArr, z, contentsettings));
                }
                wt1Var2.a.showDialog(alertDialog$Builder.a);
                return;
            case 12:
                k62 k62Var = (k62) this.b;
                mu1 mu1Var4 = (mu1) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                Long l2 = (Long) obj;
                if (mu1Var4.P7()) {
                    ij.I(mu1Var4.getParentActivity(), mu1Var4.a(), new ie(k62Var, tL_messageMediaToDo, l2, (byte) 24));
                    return;
                }
                k62Var.k0.a(tL_messageMediaToDo, null, null, null, true, 0, l2.longValue());
                k62Var.b.a(true);
                return;
            case 13:
                Boolean bool5 = (Boolean) obj;
                ((cj3) this.b).Z3((TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                return;
            case 14:
                cj3 cj3Var = (cj3) this.b;
                Long l3 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                ((hd) this.c).q(150L);
                Boolean bool6 = cj3Var.H.bot_participant;
                if (bool6 != null && bool6.booleanValue()) {
                    cj3Var.getMessagesController().j(l3.longValue(), cj3Var.getMessagesController().V1(Long.valueOf(cj3Var.I)), 0, null, cj3Var, false, runnable, new ce(runnable, (byte) 11), null);
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 15:
                s04 s04Var = (s04) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                Runnable runnable2 = (Runnable) this.d;
                ArrayList arrayList6 = (ArrayList) obj;
                int size = arrayList6.size();
                while (i4 < size) {
                    Object obj3 = arrayList6.get(i4);
                    i4++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj3;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet m0 = hq6.d0(s04Var.a.G.d1).m0(hq6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (m0 != null) {
                            arrayList = m0.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList5.add(new m04(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 16:
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) obj;
                ((v74) this.b).b.put(((u74) this.c).b, tL_factCheck);
                ((k27) this.d).k.factcheck = tL_factCheck;
                return;
            case 17:
                Utilities.d.c(new hn1((ab4) this.b, (String) this.c, (String) this.d, (q1b) obj, (byte) 19));
                return;
            case 18:
                c cVar = (c) this.b;
                i8c i8cVar = (i8c) this.c;
                String str13 = (String) this.d;
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    i8cVar.a(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str13;
                walletuseraddress.public_key = bArr;
                cVar.P.put(str13, walletuseraddress);
                i8cVar.a(walletuseraddress, null);
                return;
            case 19:
                c cVar2 = (c) this.b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                cVar2.q.put(wallettransaction, (p8c) this.c);
                cVar2.r.put(wallettransaction, (Runnable) this.d);
                return;
            case 20:
                w25 w25Var = (w25) this.b;
                s25 s25Var = (s25) this.c;
                s62 s62Var = (s62) this.d;
                String str14 = (String) obj;
                w25Var.getClass();
                s25Var.p = (s25Var.n || w25Var.i(s25Var) || !w25Var.A(s25Var) || str14 != null) ? false : false;
                s62Var.a(null, str14);
                return;
            case 21:
                w25 w25Var2 = (w25) this.b;
                s25 s25Var2 = (s25) this.c;
                p8c p8cVar2 = (p8c) this.d;
                String str15 = (String) obj;
                s25Var2.m = false;
                if (s25Var2.r == null && w25Var2.g == s25Var2) {
                    w25Var2.g = null;
                }
                p8cVar2.a(str15);
                return;
            case 22:
                w25 w25Var3 = (w25) this.b;
                w25Var3.getClass();
                gl.c3(new hn1(w25Var3, (TL_wallet.tonConnectSession) this.c, (String) obj, (w52) this.d, (byte) 25));
                return;
            case 23:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                c01 c01Var = (c01) this.c;
                int[] iArr = (int[]) this.d;
                Long l4 = (Long) obj;
                String str16 = LaunchActivity.C1;
                if (c01Var != null) {
                    c01Var.b();
                }
                if (l4 != null) {
                    tLObject = na7.q1(launchActivity.P).Z1(l4.longValue());
                }
                if (tLObject == null) {
                    d Q = LaunchActivity.Q();
                    if (Q != null && (Q instanceof mu1)) {
                        ((mu1) Q).Fb();
                        return;
                    }
                    return;
                }
                new tv4(launchActivity, iArr[0], l4.longValue(), null, null).show();
                return;
            case 24:
                h26 h26Var = (h26) this.b;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ((g86) this.c).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    h26Var.W1.boosts++;
                    if (h26Var.c2 == 32 && (L0 = na7.q1(h26Var.a).L0(-h26Var.V1)) != null) {
                        L0.boosts_applied++;
                    }
                    h26Var.k1();
                    h26Var.q1(tL_premium_boostsStatus, h26Var.Z1);
                    ng1 ng1Var2 = h26Var.X1;
                    if (h26Var.W1.next_level_boosts <= 0) {
                        z3 = true;
                    }
                    ng1Var2.m = z3;
                    ng1Var2.l = true;
                    ng1Var2.a(tL_premium_myBoosts2);
                    h26Var.m1();
                    return;
                }
                return;
            case 25:
                a46 a46Var = (a46) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                e45 e45Var = (e45) this.d;
                Long l5 = (Long) obj;
                if (l5 == null) {
                    V1 = null;
                } else {
                    V1 = na7.q1(a46Var.b).V1(l5);
                }
                userArr[0] = V1;
                if (V1 == null) {
                    a46Var.c();
                    yjb.x(null, 2131747942, a46.d(), null);
                    return;
                }
                e45Var.run();
                return;
            case 26:
                String str17 = (String) this.b;
                be0 be0Var = (be0) this.c;
                String str18 = (String) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null) {
                    ArrayList j2 = vu3.j(str17, null);
                    for (int i10 = 0; i10 < j2.size(); i10++) {
                        ((tu3) j2.get(i10)).c = vu3.c(((tu3) j2.get(i10)).c.toString());
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 < tL_messages_stickerSet.documents.size()) {
                            document = tL_messages_stickerSet.documents.get(i11);
                            int size2 = j2.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                Object obj4 = j2.get(i12);
                                i12++;
                                tu3 tu3Var = (tu3) obj4;
                                for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size(); i13++) {
                                    if (!tL_messages_stickerSet.packs.get(i13).documents.contains(Long.valueOf(document.id)) || !TextUtils.equals(vu3.c(tL_messages_stickerSet.packs.get(i13).emoticon), tu3Var.c)) {
                                    }
                                }
                            }
                        } else {
                            document = null;
                        }
                        i11++;
                    }
                    if (document != null) {
                        be0Var.p(gl5.b(document), str18, uo3.f(document, bkb.l6, 0.2f, null), document);
                        be0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                boolean[] zArr2 = (boolean[]) this.b;
                ArrayList[] arrayListArr = (ArrayList[]) this.c;
                zo6 zo6Var = (zo6) this.d;
                ArrayList arrayList7 = (ArrayList) obj;
                if (!zArr2[0]) {
                    arrayListArr[0] = arrayList7;
                    zo6Var.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 28:
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.c;
                d77 d77Var = (d77) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!((boolean[]) this.b)[0]) {
                    if (userFull != null) {
                        botInfoArr[0] = userFull.bot_info;
                    }
                    gl.c3(d77Var);
                    return;
                }
                return;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.b;
                Boolean bool7 = (Boolean) this.c;
                String str19 = (String) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    i3 = 2131749620;
                } else if (bool7.booleanValue()) {
                    i3 = 2131749617;
                } else {
                    i3 = 2131749618;
                }
                cq7.s(tL_starGiftUnique, k96.a0(null, null, i3, str19));
                return;
        }
    }
}
