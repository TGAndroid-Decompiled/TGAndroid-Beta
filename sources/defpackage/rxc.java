package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.web.a;
public final class rxc {
    public static final HashMap e = new HashMap();
    public static HashMap f;
    public String a;
    public lyc b;
    public TLRPC.TL_webPage c;
    public final HashMap d = new HashMap();

    public static void a(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText != null) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                a(richText2);
            } else if (!richText.texts.isEmpty()) {
                a((TL_iv.RichText) c00.g(1, richText.texts));
            } else if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null && !str.endsWith(" ")) {
                textplain.text += ' ';
            }
        }
    }

    public static void b(TL_iv.RichText richText) {
        if (richText != null) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                b(richText2);
            } else if (!richText.texts.isEmpty()) {
                b((TL_iv.RichText) c00.g(1, richText.texts));
            } else if (richText instanceof TL_iv.textPlain) {
                StringBuilder sb = new StringBuilder();
                TL_iv.textPlain textplain = (TL_iv.textPlain) richText;
                sb.append(textplain.text);
                sb.append('\n');
                textplain.text = sb.toString();
            }
        }
    }

    public static TL_iv.RichText c(TL_iv.RichText richText, JSONObject jSONObject) {
        String optString = jSONObject.optString("id");
        if (TextUtils.isEmpty(optString)) {
            return richText;
        }
        TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
        textanchor.text = richText;
        textanchor.name = optString;
        return textanchor;
    }

    public static TL_iv.RichText d(TL_iv.RichText richText, String str, String str2) {
        TL_iv.textUrl texturl;
        String str3;
        if (richText == null) {
            return richText;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            TL_iv.textConcat textconcat2 = new TL_iv.textConcat();
            for (int i = 0; i < textconcat.texts.size(); i++) {
                TL_iv.RichText d = d(textconcat.texts.get(i), str, str2);
                if (d != null) {
                    textconcat2.texts.add(d);
                }
            }
            return textconcat2;
        } else if ((richText instanceof TL_iv.textUrl) && (str3 = (texturl = (TL_iv.textUrl) richText).url) != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.equals("#" + str2)) {
                String lowerCase2 = texturl.url.toLowerCase();
                if (!TextUtils.equals(lowerCase2, str + "#" + str2)) {
                    return richText;
                }
            }
            return null;
        } else {
            return richText;
        }
    }

    public static om1 e(nv0 nv0Var, pcc pccVar) {
        qsb qsbVar;
        boolean[] zArr = {false};
        rxc rxcVar = new rxc();
        rxcVar.a = nv0Var.getUrl();
        if (!f11.a) {
            qsbVar = null;
        } else {
            qsbVar = new qsb("WebInstantView");
        }
        a aVar = new a(qsb.d(qsbVar, "getHTML"), zArr, qsbVar, rxcVar, pccVar);
        System.currentTimeMillis();
        nv0Var.evaluateJavascript(hl.v2(null, 2131624110).replace("$OPEN$", "true"), new lxc(rxcVar, nv0Var, new File(hl.D0(), "archive.mht"), aVar, (byte) 0));
        return new om1(zArr, (byte) 8);
    }

    public static boolean f(JSONArray jSONArray) {
        List asList = Arrays.asList("b", "strong", "span", "img", "i", "s", "a", "code", "mark", "sub", "sup");
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String optString = jSONObject.optString("tag");
                    if (!asList.contains(optString)) {
                        if ("div".equalsIgnoreCase(optString) || "span".equalsIgnoreCase(optString)) {
                            f(jSONObject.optJSONArray("content"));
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static void g(qxc qxcVar, ImageReceiver imageReceiver, Runnable runnable) {
        rxc rxcVar;
        ni6 ni6Var;
        String str;
        Bitmap decodeStream;
        if (qxcVar != null && (rxcVar = qxcVar.a) != null) {
            HashMap hashMap = rxcVar.d;
            try {
                if (rxcVar.b != null) {
                    Iterator it = qxcVar.c.iterator();
                    ni6Var = null;
                    while (it.hasNext()) {
                        ni6Var = (ni6) ((HashMap) rxcVar.b.d).get((String) it.next());
                        if (ni6Var != null) {
                            break;
                        }
                    }
                } else {
                    ni6Var = null;
                }
                if (ni6Var != null) {
                    oi6 oi6Var = (oi6) ni6Var.a.get("content-type");
                    if (oi6Var == null) {
                        str = null;
                    } else {
                        str = oi6Var.a;
                    }
                    boolean contains = str.contains("svg");
                    int i = qxcVar.d;
                    if (contains) {
                        if (i > 0 && qxcVar.e > 0) {
                            decodeStream = hgb.f(ni6Var.a(), hl.L(qxcVar.d), hl.L(qxcVar.e));
                        } else {
                            return;
                        }
                    } else {
                        if (i <= 0 || qxcVar.e <= 0) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeStream(ni6Var.a(), null, options);
                            int i2 = qxcVar.d;
                            int i3 = qxcVar.e;
                            if (i2 == 0) {
                                int i4 = options.outWidth;
                                if (i3 == 0) {
                                    qxcVar.d = i4;
                                    qxcVar.e = options.outHeight;
                                } else {
                                    qxcVar.d = (int) ((i4 / options.outHeight) * i3);
                                }
                            } else if (i3 == 0) {
                                qxcVar.e = (int) ((options.outHeight / options.outWidth) * i2);
                            }
                            runnable.run();
                        }
                        decodeStream = BitmapFactory.decodeStream(ni6Var.a());
                    }
                    imageReceiver.f0(decodeStream);
                } else if (hashMap.containsKey(qxcVar.b)) {
                    imageReceiver.f0((Bitmap) hashMap.get(qxcVar.b));
                } else {
                    HashMap hashMap2 = f;
                    if (hashMap2 == null) {
                        hashMap2 = new HashMap();
                        f = hashMap2;
                    }
                    ArrayList arrayList = (ArrayList) hashMap2.get(qxcVar.b);
                    if (arrayList != null) {
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            if (((Pair) arrayList.get(i5)).first == imageReceiver) {
                                return;
                            }
                        }
                        arrayList.add(new Pair(imageReceiver, runnable));
                        return;
                    }
                    f.put(qxcVar.b, new ArrayList());
                    new oi5(new ku9(rxcVar, qxcVar, (byte) 26)).execute(qxcVar.b);
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }

    public static TL_iv.textPlain m(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        return textplain;
    }

    public static void o(TLRPC.WebPage webPage) {
        TL_iv.Page page;
        ArrayList<TLRPC.Photo> arrayList;
        HashMap hashMap = e;
        rxc rxcVar = (rxc) hashMap.remove(webPage);
        if (rxcVar != null) {
            hashMap.remove(rxcVar.c);
            HashMap hashMap2 = rxcVar.d;
            for (Map.Entry entry : hashMap2.entrySet()) {
                hl.w2((Bitmap) entry.getValue());
            }
            hashMap2.clear();
            TLRPC.TL_webPage tL_webPage = rxcVar.c;
            if (tL_webPage != null && (page = tL_webPage.cached_page) != null && (arrayList = page.photos) != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    TLRPC.Photo photo = arrayList.get(i);
                    i++;
                    TLRPC.Photo photo2 = photo;
                    if (photo2 instanceof qxc) {
                        qxc qxcVar = (qxc) photo2;
                        HashMap hashMap3 = f;
                        if (hashMap3 != null) {
                            hashMap3.remove(qxcVar.b);
                        }
                    }
                }
            }
        }
    }

    public static TL_iv.RichText p(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return richText;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            p(richText2);
            return richText;
        }
        int size = richText.texts.size();
        ArrayList<TL_iv.RichText> arrayList = richText.texts;
        if (size == 1) {
            p(arrayList.get(0));
            return richText;
        } else if (!arrayList.isEmpty()) {
            r(richText.texts.get(0));
            q((TL_iv.RichText) c00.g(1, richText.texts));
            return richText;
        } else {
            if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null) {
                textplain.text = str.trim();
            }
            return richText;
        }
    }

    public static void q(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText != null) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                q(richText2);
            } else if (!richText.texts.isEmpty()) {
                q((TL_iv.RichText) c00.g(1, richText.texts));
            } else if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null) {
                textplain.text = str.replaceAll("\\s+$", "");
            }
        }
    }

    public static void r(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText != null) {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                r(richText2);
            } else if (!richText.texts.isEmpty()) {
                r(richText.texts.get(0));
            } else if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null) {
                textplain.text = str.replaceAll("^\\s+", "");
            }
        }
    }

    public final TL_iv.pageBlockPhoto h(JSONObject jSONObject, TL_iv.TL_page tL_page) {
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        pageblockphoto.caption = new TL_iv.PageCaption();
        String optString = jSONObject.optString("alt");
        if (optString != null) {
            pageblockphoto.caption.text = p(m(optString));
            pageblockphoto.caption.credit = p(m(""));
        }
        String optString2 = jSONObject.optString("src");
        if (optString2 == null) {
            return null;
        }
        qxc qxcVar = new qxc();
        qxcVar.a = this;
        qxcVar.id = (-1) - tL_page.photos.size();
        qxcVar.b = optString2;
        qxcVar.c.add(optString2);
        try {
            qxcVar.d = Integer.parseInt(jSONObject.optString("width"));
        } catch (Exception unused) {
        }
        try {
            qxcVar.e = Integer.parseInt(jSONObject.optString("height"));
        } catch (Exception unused2) {
        }
        int i = qxcVar.d;
        if (i == 0) {
            i = qxcVar.e;
            qxcVar.d = i;
        }
        if (qxcVar.e == 0) {
            qxcVar.e = i;
        }
        pageblockphoto.photo_id = qxcVar.id;
        pageblockphoto.url = optString2;
        tL_page.photos.add(qxcVar);
        return pageblockphoto;
    }

    public final TLRPC.TL_webPage i(String str, JSONObject jSONObject) {
        TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
        tL_webPage.id = 0L;
        tL_webPage.url = str;
        tL_webPage.display_url = str;
        String string = jSONObject.getString("siteName");
        if (string != null && !"null".equals(string)) {
            tL_webPage.flags |= 2;
            tL_webPage.site_name = string;
        }
        String optString = jSONObject.optString("title");
        if (optString != null && !"null".equals(optString)) {
            tL_webPage.flags |= 4;
            tL_webPage.title = optString;
        }
        String optString2 = jSONObject.optString("byline");
        if (optString2 != null && !"null".equals(optString2) && !"by".equalsIgnoreCase(optString2)) {
            tL_webPage.flags |= 256;
            tL_webPage.author = optString2;
        }
        String optString3 = jSONObject.optString("excerpt");
        if (optString3 != null && !"null".equals(optString3)) {
            tL_webPage.flags |= 8;
            tL_webPage.description = optString3;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("content");
        if (optJSONArray != null && !"null".equals(optJSONArray)) {
            tL_webPage.flags |= 1024;
            String optString4 = jSONObject.optString("title");
            if ("null".equals(optString4)) {
                optString4 = null;
            }
            "null".equals(jSONObject.optString("publishedTime"));
            JSONArray optJSONArray2 = jSONObject.optJSONArray("content");
            TL_iv.TL_page tL_page = new TL_iv.TL_page();
            tL_page.web = true;
            tL_page.url = str;
            tL_page.blocks.addAll(j(optJSONArray2, tL_page));
            if (tL_page.blocks.isEmpty() || !(tL_page.blocks.get(0) instanceof TL_iv.pageBlockHeader)) {
                TL_iv.pageBlockTitle pageblocktitle = new TL_iv.pageBlockTitle();
                pageblocktitle.text = p(m(optString4));
                tL_page.blocks.add(0, pageblocktitle);
            }
            tL_webPage.cached_page = tL_page;
        }
        return tL_webPage;
    }

    public final ArrayList j(JSONArray jSONArray, TL_iv.TL_page tL_page) {
        qxc qxcVar;
        TL_iv.pageBlockPhoto pageblockphoto;
        ?? pageblocklist;
        TL_iv.pageBlockDetails pageblockdetails;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = m((String) obj);
                arrayList.add(pageblockparagraph);
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                String optString = jSONObject.optString("tag");
                JSONArray optJSONArray = jSONObject.optJSONArray("content");
                optString.getClass();
                char c = 65535;
                switch (optString.hashCode()) {
                    case -1274639644:
                        if (optString.equals("figure")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -891980137:
                        if (optString.equals("strong")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -577741570:
                        if (optString.equals("picture")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 97:
                        if (optString.equals("a")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 98:
                        if (optString.equals("b")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 105:
                        if (optString.equals("i")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 112:
                        if (optString.equals("p")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 115:
                        if (optString.equals("s")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 3273:
                        if (optString.equals("h1")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 3274:
                        if (optString.equals("h2")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 3275:
                        if (optString.equals("h3")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 3276:
                        if (optString.equals("h4")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 3277:
                        if (optString.equals("h5")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 3278:
                        if (optString.equals("h6")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case 3338:
                        if (optString.equals("hr")) {
                            c = 14;
                            break;
                        }
                        break;
                    case 3549:
                        if (optString.equals("ol")) {
                            c = 15;
                            break;
                        }
                        break;
                    case 3735:
                        if (optString.equals("ul")) {
                            c = 16;
                            break;
                        }
                        break;
                    case 104387:
                        if (optString.equals("img")) {
                            c = 17;
                            break;
                        }
                        break;
                    case 111267:
                        if (optString.equals("pre")) {
                            c = 18;
                            break;
                        }
                        break;
                    case 114240:
                        if (optString.equals("sub")) {
                            c = 19;
                            break;
                        }
                        break;
                    case 114254:
                        if (optString.equals("sup")) {
                            c = 20;
                            break;
                        }
                        break;
                    case 3059181:
                        if (optString.equals("code")) {
                            c = 21;
                            break;
                        }
                        break;
                    case 3344077:
                        if (optString.equals("mark")) {
                            c = 22;
                            break;
                        }
                        break;
                    case 3536714:
                        if (optString.equals("span")) {
                            c = 23;
                            break;
                        }
                        break;
                    case 110115790:
                        if (optString.equals("table")) {
                            c = 24;
                            break;
                        }
                        break;
                    case 1303202319:
                        if (optString.equals("blockquote")) {
                            c = 25;
                            break;
                        }
                        break;
                    case 1557721666:
                        if (optString.equals("details")) {
                            c = 26;
                            break;
                        }
                        break;
                }
                String str = "";
                switch (c) {
                    case 0:
                    case 2:
                        JSONArray optJSONArray2 = jSONObject.optJSONArray("content");
                        ArrayList arrayList2 = new ArrayList();
                        TL_iv.pageBlockPhoto pageblockphoto2 = null;
                        TL_iv.RichText richText = null;
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            Object obj2 = optJSONArray2.get(i2);
                            if (obj2 instanceof JSONObject) {
                                JSONObject jSONObject2 = (JSONObject) obj2;
                                String optString2 = jSONObject2.optString("tag");
                                if (!"figurecaption".equalsIgnoreCase(optString2) && !"caption".equalsIgnoreCase(optString2)) {
                                    if ("img".equalsIgnoreCase(optString2)) {
                                        pageblockphoto2 = h(jSONObject2, tL_page);
                                    } else if ("source".equalsIgnoreCase(optString2)) {
                                        String optString3 = jSONObject2.optString("src");
                                        if (!TextUtils.isEmpty(optString3)) {
                                            arrayList2.add(optString3);
                                        } else {
                                            String optString4 = jSONObject2.optString("srcset");
                                            if (!TextUtils.isEmpty(optString4)) {
                                                for (String str2 : optString4.split(",")) {
                                                    arrayList2.add(str2.trim().split(" ")[0].trim());
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    richText = p(l(jSONObject2, tL_page));
                                }
                            }
                        }
                        if (pageblockphoto2 == null) {
                            pageblockphoto = null;
                        } else {
                            if (richText != null) {
                                TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                                pageblockphoto2.caption = pageCaption;
                                pageCaption.text = richText;
                                pageCaption.credit = new TL_iv.textEmpty();
                            }
                            int i3 = 0;
                            while (true) {
                                if (i3 < tL_page.photos.size()) {
                                    if ((tL_page.photos.get(i3) instanceof qxc) && tL_page.photos.get(i3).id == pageblockphoto2.photo_id) {
                                        qxcVar = (qxc) tL_page.photos.get(i3);
                                    } else {
                                        i3++;
                                    }
                                } else {
                                    qxcVar = null;
                                }
                            }
                            if (qxcVar != null) {
                                qxcVar.c.addAll(arrayList2);
                            }
                            pageblockphoto = pageblockphoto2;
                        }
                        if (pageblockphoto == null) {
                            break;
                        } else {
                            arrayList.add(pageblockphoto);
                            continue;
                        }
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(jSONObject);
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        pageblockparagraph2.text = k(jSONArray2, tL_page);
                        arrayList.add(pageblockparagraph2);
                        continue;
                    case 6:
                        TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                        pageblockparagraph3.text = p(l(jSONObject, tL_page));
                        arrayList.add(pageblockparagraph3);
                        continue;
                    case '\b':
                        TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                        pageblockheading1.text = p(l(jSONObject, tL_page));
                        arrayList.add(pageblockheading1);
                        continue;
                    case '\t':
                        TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                        pageblockheading2.text = p(l(jSONObject, tL_page));
                        arrayList.add(pageblockheading2);
                        continue;
                    case '\n':
                        TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                        pageblockheading3.text = p(l(jSONObject, tL_page));
                        arrayList.add(pageblockheading3);
                        continue;
                    case 11:
                        TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                        pageblockheading4.text = p(l(jSONObject, tL_page));
                        arrayList.add(pageblockheading4);
                        continue;
                    case '\f':
                        TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                        pageblockheading5.text = p(l(jSONObject, tL_page));
                        arrayList.add(pageblockheading5);
                        continue;
                    case '\r':
                        TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                        pageblockheading6.text = p(l(jSONObject, tL_page));
                        arrayList.add(pageblockheading6);
                        continue;
                    case 14:
                        arrayList.add(new TL_iv.pageBlockDivider());
                        continue;
                    case 15:
                    case 16:
                        if ("ol".equals(jSONObject.optString("tag"))) {
                            pageblocklist = new TL_iv.pageBlockOrderedList();
                            JSONArray jSONArray3 = jSONObject.getJSONArray("content");
                            for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                                Object obj3 = jSONArray3.get(i4);
                                if (obj3 instanceof JSONObject) {
                                    JSONObject jSONObject3 = (JSONObject) obj3;
                                    if ("li".equals(jSONObject3.optString("tag"))) {
                                        JSONArray optJSONArray3 = jSONObject3.optJSONArray("content");
                                        if (f(optJSONArray3)) {
                                            TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                                            tL_pageListOrderedItemText.text = k(optJSONArray3, tL_page);
                                            pageblocklist.items.add(tL_pageListOrderedItemText);
                                        } else {
                                            TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                                            tL_pageListOrderedItemBlocks.blocks.addAll(j(optJSONArray3, tL_page));
                                            pageblocklist.items.add(tL_pageListOrderedItemBlocks);
                                        }
                                    }
                                }
                            }
                        } else {
                            pageblocklist = new TL_iv.pageBlockList();
                            JSONArray jSONArray4 = jSONObject.getJSONArray("content");
                            for (int i5 = 0; i5 < jSONArray4.length(); i5++) {
                                Object obj4 = jSONArray4.get(i5);
                                if (obj4 instanceof JSONObject) {
                                    JSONObject jSONObject4 = (JSONObject) obj4;
                                    if ("li".equals(jSONObject4.optString("tag"))) {
                                        JSONArray optJSONArray4 = jSONObject4.optJSONArray("content");
                                        if (f(optJSONArray4)) {
                                            TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                                            tL_pageListItemText.text = k(optJSONArray4, tL_page);
                                            pageblocklist.items.add(tL_pageListItemText);
                                        } else {
                                            TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                                            tL_pageListItemBlocks.blocks.addAll(j(optJSONArray4, tL_page));
                                            pageblocklist.items.add(tL_pageListItemBlocks);
                                        }
                                    }
                                }
                            }
                        }
                        arrayList.add(pageblocklist);
                        continue;
                    case 17:
                        TL_iv.pageBlockPhoto h = h(jSONObject, tL_page);
                        if (h != null) {
                            arrayList.add(h);
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                        TL_iv.textFixed textfixed = new TL_iv.textFixed();
                        textfixed.text = p(l(jSONObject, tL_page));
                        pageblockpreformatted.text = textfixed;
                        pageblockpreformatted.language = "";
                        arrayList.add(pageblockpreformatted);
                        continue;
                    case 24:
                        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
                        pageblocktable.bordered = true;
                        pageblocktable.striped = true;
                        String optString5 = jSONObject.optString("title");
                        if (optString5 != null) {
                            str = optString5;
                        }
                        pageblocktable.title = p(c(m(str), jSONObject));
                        pageblocktable.rows.addAll(n(jSONObject.getJSONArray("content"), tL_page));
                        arrayList.add(pageblocktable);
                        continue;
                    case 25:
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.text = p(l(jSONObject, tL_page));
                        TL_iv.textItalic textitalic = new TL_iv.textItalic();
                        textitalic.text = pageblockblockquote.text;
                        pageblockblockquote.text = textitalic;
                        arrayList.add(pageblockblockquote);
                        continue;
                    case 26:
                        TL_iv.pageBlockDetails pageblockdetails2 = new TL_iv.pageBlockDetails();
                        JSONArray optJSONArray5 = jSONObject.optJSONArray("content");
                        if (optJSONArray5 == null) {
                            pageblockdetails = null;
                        } else {
                            int i6 = 0;
                            while (true) {
                                if (i6 < optJSONArray5.length()) {
                                    Object obj5 = optJSONArray5.get(i6);
                                    if (obj5 instanceof JSONObject) {
                                        JSONObject jSONObject5 = (JSONObject) obj5;
                                        if ("summary".equals(jSONObject5.optString("tag"))) {
                                            pageblockdetails2.title = p(l(jSONObject5, tL_page));
                                            optJSONArray5.remove(i6);
                                        }
                                    }
                                    i6++;
                                }
                            }
                            pageblockdetails2.blocks.addAll(j(optJSONArray5, tL_page));
                            pageblockdetails2.open = jSONObject.has("open");
                            pageblockdetails = pageblockdetails2;
                        }
                        if (pageblockdetails != null) {
                            arrayList.add(pageblockdetails);
                            break;
                        } else {
                            continue;
                        }
                    default:
                        if (optJSONArray != null) {
                            arrayList.addAll(j(optJSONArray, tL_page));
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
        return arrayList;
    }

    public final TL_iv.RichText k(JSONArray jSONArray, TL_iv.TL_page tL_page) {
        char c;
        ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                arrayList.add(m((String) obj));
            } else {
                JSONObject jSONObject = (JSONObject) obj;
                String optString = jSONObject.optString("tag");
                optString.getClass();
                switch (optString.hashCode()) {
                    case -891980137:
                        if (optString.equals("strong")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 97:
                        if (optString.equals("a")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 98:
                        if (optString.equals("b")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 105:
                        if (optString.equals("i")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 112:
                        if (optString.equals("p")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 115:
                        if (optString.equals("s")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3152:
                        if (optString.equals("br")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 104387:
                        if (optString.equals("img")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 111267:
                        if (optString.equals("pre")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 114240:
                        if (optString.equals("sub")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 114254:
                        if (optString.equals("sup")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3059181:
                        if (optString.equals("code")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3344077:
                        if (optString.equals("mark")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                TL_iv.textMarked textmarked = null;
                textmarked = null;
                textmarked = null;
                switch (c) {
                    case 0:
                    case 2:
                        TL_iv.textBold textbold = new TL_iv.textBold();
                        textbold.text = l(jSONObject, tL_page);
                        textmarked = textbold;
                        break;
                    case 1:
                        String optString2 = jSONObject.optString("href");
                        if (optString2 == null) {
                            textmarked = l(jSONObject, tL_page);
                            break;
                        } else if (optString2.startsWith("tel:")) {
                            TL_iv.textPhone textphone = new TL_iv.textPhone();
                            textphone.phone = optString2.substring(4);
                            textphone.text = l(jSONObject, tL_page);
                            textmarked = textphone;
                            break;
                        } else if (optString2.startsWith("mailto:")) {
                            TL_iv.textEmail textemail = new TL_iv.textEmail();
                            textemail.email = optString2.substring(7);
                            textemail.text = l(jSONObject, tL_page);
                            textmarked = textemail;
                            break;
                        } else {
                            TL_iv.textUrl texturl = new TL_iv.textUrl();
                            texturl.url = optString2;
                            texturl.text = l(jSONObject, tL_page);
                            textmarked = texturl;
                            break;
                        }
                    case 3:
                        TL_iv.textItalic textitalic = new TL_iv.textItalic();
                        textitalic.text = l(jSONObject, tL_page);
                        textmarked = textitalic;
                        break;
                    case 4:
                        if (!arrayList.isEmpty()) {
                            b((TL_iv.RichText) c00.g(1, arrayList));
                        }
                        textmarked = l(jSONObject, tL_page);
                        break;
                    case 5:
                        TL_iv.textStrike textstrike = new TL_iv.textStrike();
                        textstrike.text = l(jSONObject, tL_page);
                        textmarked = textstrike;
                        break;
                    case 6:
                        if (!arrayList.isEmpty()) {
                            b((TL_iv.RichText) c00.g(1, arrayList));
                            break;
                        }
                        break;
                    case 7:
                        if (!arrayList.isEmpty()) {
                            a((TL_iv.RichText) c00.g(1, arrayList));
                        }
                        TL_iv.textImage textimage = new TL_iv.textImage();
                        String optString3 = jSONObject.optString("src");
                        if (optString3 != null) {
                            qxc qxcVar = new qxc();
                            qxcVar.a = this;
                            qxcVar.id = (-1) - tL_page.photos.size();
                            qxcVar.b = optString3;
                            qxcVar.c.add(optString3);
                            try {
                                qxcVar.d = Integer.parseInt(jSONObject.optString("width"));
                            } catch (Exception unused) {
                            }
                            try {
                                qxcVar.e = Integer.parseInt(jSONObject.optString("height"));
                            } catch (Exception unused2) {
                            }
                            textimage.url = optString3;
                            tL_page.photos.add(qxcVar);
                            int i2 = qxcVar.d;
                            if (i2 == 0) {
                                i2 = qxcVar.e;
                                qxcVar.d = i2;
                            }
                            if (qxcVar.e == 0) {
                                qxcVar.e = i2;
                            }
                            try {
                                textimage.w = Integer.parseInt(jSONObject.optString("width"));
                            } catch (Exception unused3) {
                            }
                            try {
                                textimage.h = Integer.parseInt(jSONObject.optString("height"));
                            } catch (Exception unused4) {
                            }
                            int i3 = textimage.w;
                            if (i3 == 0) {
                                i3 = textimage.h;
                                textimage.w = i3;
                            }
                            if (textimage.h == 0) {
                                textimage.h = i3;
                            }
                            textimage.photo_id = qxcVar.id;
                            textmarked = textimage;
                            break;
                        }
                        break;
                    case '\b':
                    case 11:
                        TL_iv.textFixed textfixed = new TL_iv.textFixed();
                        textfixed.text = l(jSONObject, tL_page);
                        textmarked = textfixed;
                        break;
                    case '\t':
                        TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
                        textsubscript.text = l(jSONObject, tL_page);
                        textmarked = textsubscript;
                        break;
                    case '\n':
                        TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
                        textsuperscript.text = l(jSONObject, tL_page);
                        textmarked = textsuperscript;
                        break;
                    case '\f':
                        TL_iv.textMarked textmarked2 = new TL_iv.textMarked();
                        textmarked2.text = l(jSONObject, tL_page);
                        textmarked = textmarked2;
                        break;
                    default:
                        textmarked = l(jSONObject, tL_page);
                        break;
                }
                if (textmarked != null) {
                    arrayList.add(c(textmarked, jSONObject));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        textconcat.texts = arrayList;
        return textconcat;
    }

    public final TL_iv.RichText l(JSONObject jSONObject, TL_iv.TL_page tL_page) {
        TL_iv.RichText c = c(k(jSONObject.getJSONArray("content"), tL_page), jSONObject);
        if (jSONObject.has("bold")) {
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = c;
            c = textbold;
        }
        if (jSONObject.has("italic")) {
            TL_iv.textItalic textitalic = new TL_iv.textItalic();
            textitalic.text = c;
            return textitalic;
        }
        return c;
    }

    public final ArrayList n(JSONArray jSONArray, TL_iv.TL_page tL_page) {
        JSONObject jSONObject;
        String optString;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if ("tr".equals(jSONObject2.optString("tag"))) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("content");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        Object obj2 = jSONArray2.get(i2);
                        if ((obj2 instanceof JSONObject) && (optString = (jSONObject = (JSONObject) obj2).optString("tag")) != null && ("td".equals(optString) || "th".equals(optString))) {
                            TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                            pagetablecell.header = "th".equals(optString);
                            try {
                                pagetablecell.colspan = Integer.parseInt(jSONObject.optString("colspan"));
                                pagetablecell.flags |= 2;
                            } catch (Exception unused) {
                            }
                            try {
                                pagetablecell.rowspan = Integer.parseInt(jSONObject.optString("rowspan"));
                                pagetablecell.flags |= 4;
                            } catch (Exception unused2) {
                            }
                            pagetablecell.text = p(k(jSONObject.getJSONArray("content"), tL_page));
                            if (jSONObject.has("bold") || pagetablecell.header) {
                                TL_iv.textBold textbold = new TL_iv.textBold();
                                textbold.text = pagetablecell.text;
                                pagetablecell.text = textbold;
                            }
                            if (jSONObject.has("italic")) {
                                TL_iv.textItalic textitalic = new TL_iv.textItalic();
                                textitalic.text = pagetablecell.text;
                                pagetablecell.text = textitalic;
                            }
                            pagetablecell.align_center = jSONObject.has("xcenter");
                            pagetablerow.cells.add(pagetablecell);
                        }
                    }
                    arrayList.add(pagetablerow);
                } else {
                    JSONArray optJSONArray = jSONObject2.optJSONArray("content");
                    if (optJSONArray != null) {
                        arrayList.addAll(n(optJSONArray, tL_page));
                    }
                }
            }
        }
        return arrayList;
    }
}
