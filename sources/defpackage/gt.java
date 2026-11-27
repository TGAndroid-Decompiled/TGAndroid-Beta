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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class gt implements pcc {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gt(Object obj, Object obj2, Object obj3, byte b) {
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
        TLRPC.ChatFull N0;
        TLRPC.User X1;
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
                    hl.c(spannableStringBuilder, 1, false, true);
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
                            str3 = m01.x(uri, "https", null, uri.getEncodedPath(), "/");
                        }
                        mVar.getWebView().loadUrl(str3);
                        return;
                    }
                    fb.b(activity, str3);
                    nv0 webView = mVar.getWebView();
                    String str4 = bw9.a().b;
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
                uc7.s1(oVar2.Y).m(str5, true);
                if (!TextUtils.isEmpty(str6) && !TextUtils.equals(str6, str5)) {
                    uc7.s1(oVar2.Y).m(str6, true);
                }
                if (!bool.booleanValue()) {
                    oVar2.a0();
                    return;
                } else {
                    LaunchActivity.J1 = new ys(oVar2, (byte) 5);
                    return;
                }
            case 2:
                uy uyVar = (uy) this.b;
                ((boolean[]) this.c)[0] = false;
                new p5(uyVar.getContext(), (vnb) this.d, uyVar.g2, (List) obj).show();
                return;
            case 3:
                fz fzVar = (fz) this.b;
                vnb vnbVar = (vnb) this.d;
                List list = (List) obj;
                ((boolean[]) this.c)[0] = false;
                if (fzVar.h2 != null) {
                    new p5(fzVar.getContext(), vnbVar, fzVar.h2, list).show();
                    fzVar.dismiss();
                    return;
                }
                return;
            case 4:
                j20 j20Var = (j20) this.b;
                id idVar = (id) this.c;
                TLRPC.Document document2 = (TLRPC.Document) this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile == null) {
                    idVar.dismiss();
                    return;
                }
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = uc7.s1(j20Var.a).j1(yac.h(j20Var.a).e());
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = inputFile;
                tL_inputMediaUploadedDocument.mime_type = document2.mime_type;
                tL_inputMediaUploadedDocument.attributes.addAll(document2.attributes);
                ConnectionsManager.getInstance(j20Var.a).sendRequest(tL_messages_uploadMedia, new ql(j20Var, idVar, (byte) 1));
                return;
            case 5:
                rv0 rv0Var = (rv0) this.b;
                String str7 = (String) this.c;
                pv0 pv0Var = (pv0) this.d;
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
                    rv0Var.u(pv0Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 6:
                wg1 wg1Var = (wg1) this.b;
                pcc pccVar = (pcc) this.d;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj;
                if (((TL_stories.TL_premium_boostsStatus) this.c).next_level_boosts > 0) {
                    z2 = false;
                }
                wg1Var.m = z2;
                wg1Var.a(tL_premium_myBoosts);
                pccVar.a(wg1Var);
                return;
            case 7:
                zu1 zu1Var = (zu1) this.b;
                m47 m47Var = (m47) this.c;
                r47 r47Var = (r47) this.d;
                Long l = (Long) obj;
                if (m47Var != null) {
                    ArrayList arrayList2 = m47Var.d;
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        if (!zu1Var.getSendMessagesHelper().j0(l.longValue(), (r47) arrayList2.get(i7), false)) {
                            z2 = false;
                        }
                    }
                    if (z2 && zu1Var.g4 == 0) {
                        zu1Var.ea(false);
                        return;
                    }
                    return;
                } else if (zu1Var.getSendMessagesHelper().j0(l.longValue(), r47Var, false)) {
                    zu1Var.Gd(false);
                    if (zu1Var.g4 == 0) {
                        zu1Var.ea(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                zu1 zu1Var2 = (zu1) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str8 = (String) this.d;
                Boolean bool3 = (Boolean) obj;
                if (zu1Var2.getParentActivity() != null) {
                    if (bool3.booleanValue()) {
                        intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                    } else {
                        intent = new Intent("android.intent.action.INSERT_OR_EDIT");
                        intent.setType("vnd.android.cursor.item/contact");
                    }
                    Intent intent2 = intent;
                    if (user != null) {
                        intent2.putExtra("name", lv2.m(0, user.first_name, user.last_name));
                    }
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    if (!str8.startsWith("+")) {
                        TLRPC.User f = zu1Var2.getUserConfig().f();
                        HashMap hashMap = new HashMap();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(a.b.getResources().getAssets().open("countries.txt")));
                        } catch (Exception e2) {
                            cc4.g(e2, true);
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
                                            String str12 = ((gy2) list3.get(0)).c;
                                            if (str12.endsWith("0") && str8.startsWith("0")) {
                                                str8 = str8.substring(1);
                                            }
                                            str8 = qd4.y("+", str12, str8);
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
                                    str8 = qd4.y("+", country, str8);
                                }
                            }
                        }
                    }
                    contentValues.put("data1", str8);
                    contentValues.put("data2", (Integer) 2);
                    arrayList3.add(contentValues);
                    intent2.putExtra("finishActivityOnSaveCompleted", true);
                    intent2.putParcelableArrayListExtra("data", arrayList3);
                    zu1Var2.getParentActivity().startActivity(intent2);
                    return;
                }
                return;
            case 9:
                Boolean bool4 = (Boolean) obj;
                ((zu1) this.b).k9((TLRPC.TL_attachMenuBot) this.d, (TLRPC.User) this.c);
                return;
            case 10:
                ju1 ju1Var = (ju1) this.b;
                wb2 wb2Var = (wb2) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((id) this.c).b(200L);
                if (ju1Var.a.getMessagesController().k4.l.f && !TextUtils.isEmpty(ju1Var.a.getMessagesController().k4.X2.f)) {
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
                FrameLayout frameLayout = new FrameLayout(ju1Var.a.getParentActivity());
                if (z) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    sg2 sg2Var = new sg2(1, ju1Var.a.getResourceProvider(), ju1Var.a.getParentActivity());
                    sg2Var.setBackground(aob.L0(false));
                    sg2Var.e(ob6.M0(2131748236, null), "", zArr[0], false, false);
                    if (ob6.a0) {
                        L = hl.L(16.0f);
                    } else {
                        L = hl.L(8.0f);
                    }
                    if (ob6.a0) {
                        L2 = hl.L(8.0f);
                    } else {
                        L2 = hl.L(16.0f);
                    }
                    sg2Var.setPadding(L, 0, L2, 0);
                    frameLayout.addView(sg2Var, tre.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    sg2Var.setOnClickListener(new de(zArr, (byte) 9));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ju1Var.a.getResourceProvider(), ju1Var.a.getParentActivity());
                alertDialog$Builder.a.S = ob6.M0(2131748227, null);
                if (objArr != null) {
                    i = 2131748229;
                } else {
                    i = 2131748230;
                }
                alertDialog$Builder.a.U = ob6.M0(i, null);
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.a.H = (byte) 9;
                if (objArr != null) {
                    i2 = 2131748228;
                } else {
                    i2 = 2131752570;
                }
                alertDialog$Builder.g(ob6.M0(i2, null), null);
                if (objArr == null) {
                    alertDialog$Builder.j(ob6.M0(2131748235, null), new sf(ju1Var, wb2Var, zArr, z, contentsettings));
                }
                ju1Var.a.showDialog(alertDialog$Builder.a);
                return;
            case 11:
                ju1 ju1Var2 = (ju1) this.b;
                r47 r47Var2 = (r47) this.c;
                tt1 tt1Var = (tt1) this.d;
                if (((Boolean) obj).booleanValue()) {
                    zu1 zu1Var3 = ju1Var2.a;
                    int D0 = r47Var2.D0();
                    TLRPC.MessageMedia n1 = r47.n1(r47Var2.k);
                    if (n1 instanceof TLRPC.TL_messageMediaDice) {
                        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n1).game_outcome;
                    }
                    y0 y0Var = new y0(ju1Var2, r47Var2, (byte) 25);
                    int i9 = sqa.Y1;
                    TLRPC.EmojiGameInfo emojiGameInfo = uc7.s1(zu1Var3.getCurrentAccount()).l5;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        c21 c21Var = new c21(zu1Var3.getContext(), zu1Var3.getResourceProvider());
                        c21Var.a.setScaleX(1.25f);
                        c21Var.a.setScaleY(1.25f);
                        if (D0 == 1) {
                            c21Var.a.setImageResource(2131231058);
                        } else if (D0 == 2) {
                            c21Var.a.setImageResource(2131231059);
                        } else {
                            e29 e29Var = c21Var.a;
                            if (D0 == 3) {
                                e29Var.setImageResource(2131231060);
                            } else if (D0 == 4) {
                                e29Var.setImageResource(2131231061);
                            } else if (D0 == 5) {
                                e29Var.setImageResource(2131231062);
                            } else if (D0 == 6) {
                                e29Var.setImageResource(2131231063);
                            } else {
                                e29Var.setScaleX(0.8f);
                                c21Var.a.setScaleY(0.8f);
                                c21Var.a.setImageDrawable(pv3.f("🎲"));
                            }
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131744893, null));
                        spannableStringBuilder2.append((CharSequence) nza.K0(j));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) z41.b(ob6.M0(2131744891, null), new ida(zu1Var3, y0Var, (byte) 9), zu1Var3.getResourceProvider(), null));
                        hl.B2(c21Var.b);
                        y41 y41Var = new y41(zu1Var3.getContext());
                        c21Var.b = y41Var;
                        y41Var.setSingleLine();
                        c21Var.b.setTypeface(Typeface.SANS_SERIF);
                        c21Var.b.setTextSize(1, 15.0f);
                        c21Var.b.setEllipsize(TextUtils.TruncateAt.END);
                        c21Var.b.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
                        c21Var.addView(c21Var.b, tre.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        c21Var.b.setText(nza.S0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        yob.G(c21Var.b, aob.xj, zu1Var3.getResourceProvider());
                        c21Var.setTextColor(aob.v0(aob.yj, zu1Var3.getResourceProvider()));
                        c21Var.b.setSingleLine(false);
                        c21Var.b.setMaxLines(2);
                        t21 t21Var = new t21(zu1Var3.getResourceProvider(), zu1Var3.getContext(), true);
                        t21Var.e(ob6.M0(2131744892, null));
                        t21Var.b = new pqa(y0Var, j, (byte) 0);
                        c21Var.setButton(t21Var);
                        d31.b0(zu1Var3).b(c21Var, 2750).j();
                        return;
                    }
                    return;
                }
                tt1Var.run();
                return;
            case 12:
                a72 a72Var = (a72) this.b;
                zu1 zu1Var4 = (zu1) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                Long l2 = (Long) obj;
                if (zu1Var4.X7()) {
                    jj.I(zu1Var4.getParentActivity(), zu1Var4.a(), new ie(a72Var, tL_messageMediaToDo, l2, (byte) 24));
                    return;
                }
                a72Var.k0.a(tL_messageMediaToDo, null, null, null, true, 0, l2.longValue());
                a72Var.b.a(true);
                return;
            case 13:
                Boolean bool5 = (Boolean) obj;
                ((uj3) this.b).c4((TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                return;
            case 14:
                uj3 uj3Var = (uj3) this.b;
                Long l3 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                ((id) this.c).q(150L);
                Boolean bool6 = uj3Var.H.bot_participant;
                if (bool6 != null && bool6.booleanValue()) {
                    uj3Var.getMessagesController().k(l3.longValue(), uj3Var.getMessagesController().X1(Long.valueOf(uj3Var.I)), null, uj3Var, false, runnable, new td(runnable, (byte) 11));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 15:
                n14 n14Var = (n14) this.b;
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
                        TLRPC.TL_messages_stickerSet m0 = ls6.d0(n14Var.a.G.d1).m0(ls6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (m0 != null) {
                            arrayList = m0.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList5.add(new h14(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 16:
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) obj;
                ((q84) this.b).b.put(((p84) this.c).b, tL_factCheck);
                ((r47) this.d).k.factcheck = tL_factCheck;
                return;
            case 17:
                Utilities.d.c(new ao1((xc4) this.b, (String) this.c, (String) this.d, (n5b) obj, (byte) 19));
                return;
            case 18:
                c cVar = (c) this.b;
                icc iccVar = (icc) this.c;
                String str13 = (String) this.d;
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    iccVar.a(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str13;
                walletuseraddress.public_key = bArr;
                cVar.P.put(str13, walletuseraddress);
                iccVar.a(walletuseraddress, null);
                return;
            case 19:
                c cVar2 = (c) this.b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                cVar2.q.put(wallettransaction, (pcc) this.c);
                cVar2.r.put(wallettransaction, (Runnable) this.d);
                return;
            case 20:
                a55 a55Var = (a55) this.b;
                a55Var.getClass();
                hl.c3(new ao1(a55Var, (TL_wallet.tonConnectSession) this.c, (String) obj, (m62) this.d, (byte) 27));
                return;
            case 21:
                a55 a55Var2 = (a55) this.b;
                w45 w45Var = (w45) this.c;
                j72 j72Var = (j72) this.d;
                String str14 = (String) obj;
                a55Var2.getClass();
                w45Var.p = (w45Var.n || a55Var2.i(w45Var) || !a55Var2.A(w45Var) || str14 != null) ? false : false;
                j72Var.a(null, str14);
                return;
            case 22:
                a55 a55Var3 = (a55) this.b;
                w45 w45Var2 = (w45) this.c;
                pcc pccVar2 = (pcc) this.d;
                String str15 = (String) obj;
                w45Var2.m = false;
                if (w45Var2.r == null && a55Var3.g == w45Var2) {
                    a55Var3.g = null;
                }
                pccVar2.a(str15);
                return;
            case 23:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                l01 l01Var = (l01) this.c;
                int[] iArr = (int[]) this.d;
                Long l4 = (Long) obj;
                String str16 = LaunchActivity.C1;
                if (l01Var != null) {
                    l01Var.b();
                }
                if (l4 != null) {
                    tLObject = uc7.s1(launchActivity.P).b2(l4.longValue());
                }
                if (tLObject == null) {
                    e Q = LaunchActivity.Q();
                    if (Q != null && (Q instanceof zu1)) {
                        ((zu1) Q).Qb();
                        return;
                    }
                    return;
                }
                new yx4(launchActivity, iArr[0], l4.longValue(), null, null).show();
                return;
            case 24:
                l46 l46Var = (l46) this.b;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ((ka6) this.c).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    l46Var.W1.boosts++;
                    if (l46Var.c2 == 32 && (N0 = uc7.s1(l46Var.a).N0(-l46Var.V1)) != null) {
                        N0.boosts_applied++;
                    }
                    l46Var.l1();
                    l46Var.r1(tL_premium_boostsStatus, l46Var.Z1);
                    wg1 wg1Var2 = l46Var.X1;
                    if (l46Var.W1.next_level_boosts <= 0) {
                        z3 = true;
                    }
                    wg1Var2.m = z3;
                    wg1Var2.l = true;
                    wg1Var2.a(tL_premium_myBoosts2);
                    l46Var.n1();
                    return;
                }
                return;
            case 25:
                e66 e66Var = (e66) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                g65 g65Var = (g65) this.d;
                Long l5 = (Long) obj;
                if (l5 == null) {
                    X1 = null;
                } else {
                    X1 = uc7.s1(e66Var.b).X1(l5);
                }
                userArr[0] = X1;
                if (X1 == null) {
                    e66Var.c();
                    xnb.x(null, 2131747865, e66.d(), null);
                    return;
                }
                g65Var.run();
                return;
            case 26:
                boolean[] zArr2 = (boolean[]) this.b;
                ArrayList[] arrayListArr = (ArrayList[]) this.c;
                fr6 fr6Var = (fr6) this.d;
                ArrayList arrayList7 = (ArrayList) obj;
                if (!zArr2[0]) {
                    arrayListArr[0] = arrayList7;
                    fr6Var.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 27:
                String str17 = (String) this.b;
                de0 de0Var = (de0) this.c;
                String str18 = (String) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null) {
                    ArrayList j2 = pv3.j(str17, null);
                    for (int i10 = 0; i10 < j2.size(); i10++) {
                        ((nv3) j2.get(i10)).c = pv3.c(((nv3) j2.get(i10)).c.toString());
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
                                nv3 nv3Var = (nv3) obj4;
                                for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size(); i13++) {
                                    if (!tL_messages_stickerSet.packs.get(i13).documents.contains(Long.valueOf(document.id)) || !TextUtils.equals(pv3.c(tL_messages_stickerSet.packs.get(i13).emoticon), nv3Var.c)) {
                                    }
                                }
                            }
                        } else {
                            document = null;
                        }
                        i11++;
                    }
                    if (document != null) {
                        de0Var.p(jn5.b(document), str18, lp3.f(document, aob.m6, 0.2f, null), document);
                        de0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.c;
                b97 b97Var = (b97) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!((boolean[]) this.b)[0]) {
                    if (userFull != null) {
                        botInfoArr[0] = userFull.bot_info;
                    }
                    hl.c3(b97Var);
                    return;
                }
                return;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.b;
                Boolean bool7 = (Boolean) this.c;
                String str19 = (String) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    i3 = 2131749581;
                } else if (bool7.booleanValue()) {
                    i3 = 2131749578;
                } else {
                    i3 = 2131749579;
                }
                it7.v(tL_starGiftUnique, ob6.a0(null, null, i3, str19));
                return;
        }
    }
}
