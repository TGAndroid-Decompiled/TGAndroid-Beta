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
public final class iu implements qac {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public iu(Object obj, Object obj2, Object obj3, byte b) {
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
        TLRPC.ChatFull M0;
        TLRPC.User W1;
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
                    gm.c(spannableStringBuilder, 1, false, true);
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
                            str3 = l11.x(uri, "https", null, uri.getEncodedPath(), "/");
                        }
                        mVar.getWebView().loadUrl(str3);
                        return;
                    }
                    eb.b(activity, str3);
                    mw0 webView = mVar.getWebView();
                    String str4 = ku9.a().b;
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
                oc7.r1(oVar2.Y).m(str5, true);
                if (!TextUtils.isEmpty(str6) && !TextUtils.equals(str6, str5)) {
                    oc7.r1(oVar2.Y).m(str6, true);
                }
                if (!bool.booleanValue()) {
                    oVar2.a0();
                    return;
                } else {
                    LaunchActivity.J1 = new ut(oVar2, (byte) 7);
                    return;
                }
            case 2:
                tz tzVar = (tz) this.b;
                ((boolean[]) this.c)[0] = false;
                new o5(tzVar.getContext(), (ylb) this.d, tzVar.g2, (List) obj).show();
                return;
            case 3:
                e00 e00Var = (e00) this.b;
                ylb ylbVar = (ylb) this.d;
                List list = (List) obj;
                ((boolean[]) this.c)[0] = false;
                if (e00Var.h2 != null) {
                    new o5(e00Var.getContext(), ylbVar, e00Var.h2, list).show();
                    e00Var.dismiss();
                    return;
                }
                return;
            case 4:
                i30 i30Var = (i30) this.b;
                he heVar = (he) this.c;
                TLRPC.Document document2 = (TLRPC.Document) this.d;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile == null) {
                    heVar.dismiss();
                    return;
                }
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = oc7.r1(i30Var.a).i1(z8c.h(i30Var.a).e());
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = inputFile;
                tL_inputMediaUploadedDocument.mime_type = document2.mime_type;
                tL_inputMediaUploadedDocument.attributes.addAll(document2.attributes);
                ConnectionsManager.getInstance(i30Var.a).sendRequest(tL_messages_uploadMedia, new pm(i30Var, heVar, (byte) 1));
                return;
            case 5:
                qw0 qw0Var = (qw0) this.b;
                String str7 = (String) this.c;
                ow0 ow0Var = (ow0) this.d;
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
                    qw0Var.u(ow0Var, "biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 6:
                vh1 vh1Var = (vh1) this.b;
                qac qacVar = (qac) this.d;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj;
                if (((TL_stories.TL_premium_boostsStatus) this.c).next_level_boosts > 0) {
                    z2 = false;
                }
                vh1Var.m = z2;
                vh1Var.a(tL_premium_myBoosts);
                qacVar.a(vh1Var);
                return;
            case 7:
                yv1 yv1Var = (yv1) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str8 = (String) this.d;
                Boolean bool3 = (Boolean) obj;
                if (yv1Var.getParentActivity() != null) {
                    if (bool3.booleanValue()) {
                        intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                    } else {
                        intent = new Intent("android.intent.action.INSERT_OR_EDIT");
                        intent.setType("vnd.android.cursor.item/contact");
                    }
                    Intent intent2 = intent;
                    if (user != null) {
                        intent2.putExtra("name", bw2.m(0, user.first_name, user.last_name));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    if (!str8.startsWith("+")) {
                        TLRPC.User f = yv1Var.getUserConfig().f();
                        HashMap hashMap = new HashMap();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(a.b.getResources().getAssets().open("countries.txt")));
                        } catch (Exception e2) {
                            fc4.g(e2, true);
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
                                    ArrayList arrayList3 = new ArrayList();
                                    hashMap.put(str10, arrayList3);
                                    list2 = arrayList3;
                                }
                                list2.add(obj2);
                            } else {
                                bufferedReader.close();
                                String str11 = f.phone;
                                int i7 = 4;
                                while (true) {
                                    if (i7 >= 1) {
                                        List list3 = (List) hashMap.get(str11.substring(0, i7));
                                        if (list3 != null && list3.size() > 0) {
                                            String str12 = ((wy2) list3.get(0)).c;
                                            if (str12.endsWith("0") && str8.startsWith("0")) {
                                                str8 = str8.substring(1);
                                            }
                                            str8 = kt6.o("+", str12, str8);
                                            objArr2 = 1;
                                        } else {
                                            i7--;
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
                                    str8 = kt6.o("+", country, str8);
                                }
                            }
                        }
                    }
                    contentValues.put("data1", str8);
                    contentValues.put("data2", (Integer) 2);
                    arrayList2.add(contentValues);
                    intent2.putExtra("finishActivityOnSaveCompleted", true);
                    intent2.putParcelableArrayListExtra("data", arrayList2);
                    yv1Var.getParentActivity().startActivity(intent2);
                    return;
                }
                return;
            case 8:
                yv1 yv1Var2 = (yv1) this.b;
                f47 f47Var = (f47) this.c;
                k47 k47Var = (k47) this.d;
                Long l = (Long) obj;
                if (f47Var != null) {
                    ArrayList arrayList4 = f47Var.d;
                    for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                        if (!yv1Var2.getSendMessagesHelper().j0(l.longValue(), (k47) arrayList4.get(i8), false)) {
                            z2 = false;
                        }
                    }
                    if (z2 && yv1Var2.g4 == 0) {
                        yv1Var2.da(false);
                        return;
                    }
                    return;
                } else if (yv1Var2.getSendMessagesHelper().j0(l.longValue(), k47Var, false)) {
                    yv1Var2.Gd(false);
                    if (yv1Var2.g4 == 0) {
                        yv1Var2.da(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                Boolean bool4 = (Boolean) obj;
                ((yv1) this.b).j9((TLRPC.TL_attachMenuBot) this.d, (TLRPC.User) this.c);
                return;
            case 10:
                iv1 iv1Var = (iv1) this.b;
                k47 k47Var2 = (k47) this.c;
                tu1 tu1Var = (tu1) this.d;
                if (((Boolean) obj).booleanValue()) {
                    yv1 yv1Var3 = iv1Var.a;
                    int D0 = k47Var2.D0();
                    TLRPC.MessageMedia n1 = k47.n1(k47Var2.k);
                    if (n1 instanceof TLRPC.TL_messageMediaDice) {
                        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n1).game_outcome;
                    }
                    x0 x0Var = new x0(iv1Var, k47Var2, (byte) 26);
                    int i9 = woa.Y1;
                    TLRPC.EmojiGameInfo emojiGameInfo = oc7.r1(yv1Var3.getCurrentAccount()).m5;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        b31 b31Var = new b31(yv1Var3.getContext(), yv1Var3.getResourceProvider());
                        b31Var.a.setScaleX(1.25f);
                        b31Var.a.setScaleY(1.25f);
                        if (D0 == 1) {
                            b31Var.a.setImageResource(2131231059);
                        } else if (D0 == 2) {
                            b31Var.a.setImageResource(2131231060);
                        } else {
                            s09 s09Var = b31Var.a;
                            if (D0 == 3) {
                                s09Var.setImageResource(2131231061);
                            } else if (D0 == 4) {
                                s09Var.setImageResource(2131231062);
                            } else if (D0 == 5) {
                                s09Var.setImageResource(2131231063);
                            } else if (D0 == 6) {
                                s09Var.setImageResource(2131231064);
                            } else {
                                s09Var.setScaleX(0.8f);
                                b31Var.a.setScaleY(0.8f);
                                b31Var.a.setImageDrawable(gw3.f("🎲"));
                            }
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131744925, null));
                        spannableStringBuilder2.append((CharSequence) nxa.K0(j));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) y51.b(jb6.M0(2131744923, null), new e6a(yv1Var3, x0Var, (byte) 12), yv1Var3.getResourceProvider(), null));
                        gm.B2(b31Var.b);
                        x51 x51Var = new x51(yv1Var3.getContext());
                        b31Var.b = x51Var;
                        x51Var.setSingleLine();
                        b31Var.b.setTypeface(Typeface.SANS_SERIF);
                        b31Var.b.setTextSize(1, 15.0f);
                        b31Var.b.setEllipsize(TextUtils.TruncateAt.END);
                        b31Var.b.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
                        b31Var.addView(b31Var.b, qoe.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        b31Var.b.setText(nxa.S0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        anb.G(b31Var.b, cmb.wj, yv1Var3.getResourceProvider());
                        b31Var.setTextColor(cmb.v0(cmb.xj, yv1Var3.getResourceProvider()));
                        b31Var.b.setSingleLine(false);
                        b31Var.b.setMaxLines(2);
                        s31 s31Var = new s31(yv1Var3.getResourceProvider(), yv1Var3.getContext(), true);
                        s31Var.e(jb6.M0(2131744924, null));
                        s31Var.b = new toa(x0Var, j, (byte) 0);
                        b31Var.setButton(s31Var);
                        c41.b0(yv1Var3).b(b31Var, 2750).j();
                        return;
                    }
                    return;
                }
                tu1Var.run();
                return;
            case 11:
                iv1 iv1Var2 = (iv1) this.b;
                rc2 rc2Var = (rc2) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((he) this.c).b(200L);
                if (iv1Var2.a.getMessagesController().l4.l.f && !TextUtils.isEmpty(iv1Var2.a.getMessagesController().l4.P2.f)) {
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
                FrameLayout frameLayout = new FrameLayout(iv1Var2.a.getParentActivity());
                if (z) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    oh2 oh2Var = new oh2(1, iv1Var2.a.getResourceProvider(), iv1Var2.a.getParentActivity());
                    oh2Var.setBackground(cmb.L0(false));
                    oh2Var.e(jb6.M0(2131748239, null), "", zArr[0], false, false);
                    if (jb6.a0) {
                        L = gm.L(16.0f);
                    } else {
                        L = gm.L(8.0f);
                    }
                    if (jb6.a0) {
                        L2 = gm.L(8.0f);
                    } else {
                        L2 = gm.L(16.0f);
                    }
                    oh2Var.setPadding(L, 0, L2, 0);
                    frameLayout.addView(oh2Var, qoe.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    oh2Var.setOnClickListener(new gf(zArr, (byte) 9));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, iv1Var2.a.getResourceProvider(), iv1Var2.a.getParentActivity());
                alertDialog$Builder.a.S = jb6.M0(2131748230, null);
                if (objArr != null) {
                    i = 2131748232;
                } else {
                    i = 2131748233;
                }
                alertDialog$Builder.a.U = jb6.M0(i, null);
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.a.H = (byte) 9;
                if (objArr != null) {
                    i2 = 2131748231;
                } else {
                    i2 = 2131752542;
                }
                alertDialog$Builder.g(jb6.M0(i2, null), null);
                if (objArr == null) {
                    alertDialog$Builder.j(jb6.M0(2131748238, null), new og(iv1Var2, rc2Var, zArr, z, contentsettings));
                }
                iv1Var2.a.showDialog(alertDialog$Builder.a);
                return;
            case 12:
                v72 v72Var = (v72) this.b;
                yv1 yv1Var4 = (yv1) this.c;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) this.d;
                Long l2 = (Long) obj;
                if (yv1Var4.X7()) {
                    ik.I(yv1Var4.getParentActivity(), yv1Var4.a(), new jf(v72Var, tL_messageMediaToDo, l2, (byte) 24));
                    return;
                }
                v72Var.k0.a(tL_messageMediaToDo, null, null, null, true, 0, l2.longValue());
                v72Var.b.a(true);
                return;
            case 13:
                Boolean bool5 = (Boolean) obj;
                ((nk3) this.b).c4((TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                return;
            case 14:
                nk3 nk3Var = (nk3) this.b;
                Long l3 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                ((he) this.c).q(150L);
                Boolean bool6 = nk3Var.H.bot_participant;
                if (bool6 != null && bool6.booleanValue()) {
                    nk3Var.getMessagesController().k(l3.longValue(), nk3Var.getMessagesController().W1(Long.valueOf(nk3Var.I)), null, nk3Var, false, runnable, new cf(runnable, (byte) 11));
                    return;
                } else {
                    runnable.run();
                    return;
                }
            case 15:
                d24 d24Var = (d24) this.b;
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
                        TLRPC.TL_messages_stickerSet m0 = hs6.d0(d24Var.a.G.d1).m0(hs6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        if (m0 != null) {
                            arrayList = m0.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList5.add(new x14(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 16:
                TLRPC.TL_factCheck tL_factCheck = (TLRPC.TL_factCheck) obj;
                ((e94) this.b).b.put(((d94) this.c).b, tL_factCheck);
                ((k47) this.d).k.factcheck = tL_factCheck;
                return;
            case 17:
                Utilities.d.c(new xo1((ad4) this.b, (String) this.c, (String) this.d, (s3b) obj, (byte) 19));
                return;
            case 18:
                c cVar = (c) this.b;
                jac jacVar = (jac) this.c;
                String str13 = (String) this.d;
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    jacVar.a(null, null);
                    return;
                }
                TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                walletuseraddress.user_id = 0L;
                walletuseraddress.address = str13;
                walletuseraddress.public_key = bArr;
                cVar.P.put(str13, walletuseraddress);
                jacVar.a(walletuseraddress, null);
                return;
            case 19:
                c cVar2 = (c) this.b;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                cVar2.q.put(wallettransaction, (qac) this.c);
                cVar2.r.put(wallettransaction, (Runnable) this.d);
                return;
            case 20:
                w45 w45Var = (w45) this.b;
                s45 s45Var = (s45) this.c;
                d82 d82Var = (d82) this.d;
                String str14 = (String) obj;
                w45Var.getClass();
                s45Var.p = (s45Var.n || w45Var.i(s45Var) || !w45Var.A(s45Var) || str14 != null) ? false : false;
                d82Var.a(null, str14);
                return;
            case 21:
                w45 w45Var2 = (w45) this.b;
                s45 s45Var2 = (s45) this.c;
                qac qacVar2 = (qac) this.d;
                String str15 = (String) obj;
                s45Var2.m = false;
                if (s45Var2.r == null && w45Var2.g == s45Var2) {
                    w45Var2.g = null;
                }
                qacVar2.a(str15);
                return;
            case 22:
                w45 w45Var3 = (w45) this.b;
                w45Var3.getClass();
                gm.c3(new xo1(w45Var3, (TL_wallet.tonConnectSession) this.c, (String) obj, (h72) this.d, (byte) 25));
                return;
            case 23:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                k11 k11Var = (k11) this.c;
                int[] iArr = (int[]) this.d;
                Long l4 = (Long) obj;
                String str16 = LaunchActivity.C1;
                if (k11Var != null) {
                    k11Var.b();
                }
                if (l4 != null) {
                    tLObject = oc7.r1(launchActivity.P).a2(l4.longValue());
                }
                if (tLObject == null) {
                    d Q = LaunchActivity.Q();
                    if (Q != null && (Q instanceof yv1)) {
                        ((yv1) Q).Pb();
                        return;
                    }
                    return;
                }
                new ux4(launchActivity, iArr[0], l4.longValue(), null, null).show();
                return;
            case 24:
                i46 i46Var = (i46) this.b;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ((fa6) this.c).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    i46Var.W1.boosts++;
                    if (i46Var.c2 == 32 && (M0 = oc7.r1(i46Var.a).M0(-i46Var.V1)) != null) {
                        M0.boosts_applied++;
                    }
                    i46Var.k1();
                    i46Var.q1(tL_premium_boostsStatus, i46Var.Z1);
                    vh1 vh1Var2 = i46Var.X1;
                    if (i46Var.W1.next_level_boosts <= 0) {
                        z3 = true;
                    }
                    vh1Var2.m = z3;
                    vh1Var2.l = true;
                    vh1Var2.a(tL_premium_myBoosts2);
                    i46Var.m1();
                    return;
                }
                return;
            case 25:
                a66 a66Var = (a66) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                d65 d65Var = (d65) this.d;
                Long l5 = (Long) obj;
                if (l5 == null) {
                    W1 = null;
                } else {
                    W1 = oc7.r1(a66Var.b).W1(l5);
                }
                userArr[0] = W1;
                if (W1 == null) {
                    a66Var.c();
                    mlb.y(null, 2131747868, a66.d(), null);
                    return;
                }
                d65Var.run();
                return;
            case 26:
                String str17 = (String) this.b;
                bf0 bf0Var = (bf0) this.c;
                String str18 = (String) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null) {
                    ArrayList j2 = gw3.j(str17, null);
                    for (int i10 = 0; i10 < j2.size(); i10++) {
                        ((ew3) j2.get(i10)).c = gw3.c(((ew3) j2.get(i10)).c.toString());
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
                                ew3 ew3Var = (ew3) obj4;
                                for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size(); i13++) {
                                    if (!tL_messages_stickerSet.packs.get(i13).documents.contains(Long.valueOf(document.id)) || !TextUtils.equals(gw3.c(tL_messages_stickerSet.packs.get(i13).emoticon), ew3Var.c)) {
                                    }
                                }
                            }
                        } else {
                            document = null;
                        }
                        i11++;
                    }
                    if (document != null) {
                        bf0Var.p(gn5.b(document), str18, eq3.f(document, cmb.l6, 0.2f, null), document);
                        bf0Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                boolean[] zArr2 = (boolean[]) this.b;
                ArrayList[] arrayListArr = (ArrayList[]) this.c;
                zq6 zq6Var = (zq6) this.d;
                ArrayList arrayList7 = (ArrayList) obj;
                if (!zArr2[0]) {
                    arrayListArr[0] = arrayList7;
                    zq6Var.run();
                    zArr2[0] = true;
                    return;
                }
                return;
            case 28:
                TL_bots.BotInfo[] botInfoArr = (TL_bots.BotInfo[]) this.c;
                g97 g97Var = (g97) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!((boolean[]) this.b)[0]) {
                    if (userFull != null) {
                        botInfoArr[0] = userFull.bot_info;
                    }
                    gm.c3(g97Var);
                    return;
                }
                return;
            default:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.b;
                Boolean bool7 = (Boolean) this.c;
                String str19 = (String) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    i3 = 2131749569;
                } else if (bool7.booleanValue()) {
                    i3 = 2131749566;
                } else {
                    i3 = 2131749567;
                }
                fs7.s(tL_starGiftUnique, jb6.a0(null, null, i3, str19));
                return;
        }
    }
}
