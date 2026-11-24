package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class al6 {
    public static final Pattern a = Pattern.compile("^\\[\\^([^\\]]+)\\]:[ \\t]*(.*)$");
    public static final Pattern b = Pattern.compile("\\[\\^([^\\]]+)\\]");
    public static final Pattern c = Pattern.compile("^(\\d+)[.)]\\s");

    public static java.lang.String a(java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al6.a(java.lang.String):java.lang.String");
    }

    public static TL_iv.RichText b(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (m(richText) <= 8192) {
            return richText;
        }
        String o = o(richText);
        return l(o.substring(0, Math.min(o.length(), 8192)));
    }

    public static void c(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ei5 ei5Var = (ei5) it.next();
            arrayList.add(ei5Var);
            ArrayList arrayList2 = ei5Var.f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            c(arrayList, unmodifiableList);
        }
    }

    public static TLRPC.TL_webPage d(k47 k47Var) {
        TLRPC.Document F0;
        File f;
        String str;
        String str2;
        TLRPC.Document F02;
        File f2;
        String str3;
        String str4;
        String str5;
        boolean z;
        boolean g = g(k47Var);
        TLRPC.Message message = k47Var.k;
        String str6 = "";
        if (g) {
            if (message != null && (F02 = k47Var.F0()) != null && (f2 = f(k47Var)) != null && f2.length() <= 2097152) {
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) gm.V(TLRPC.TL_documentAttributeFilename.class, F02.attributes);
                if (tL_documentAttributeFilename != null) {
                    str3 = tL_documentAttributeFilename.file_name;
                } else {
                    str3 = null;
                }
                TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                tL_webPage.url = str4;
                if (str3 == null) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                tL_webPage.display_url = str5;
                if (!TextUtils.isEmpty(str3)) {
                    tL_webPage.flags |= 4;
                    tL_webPage.title = str3;
                }
                TL_iv.TL_page tL_page = new TL_iv.TL_page();
                tL_page.local = f2;
                tL_page.url = tL_webPage.url;
                try {
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(f2), StandardCharsets.UTF_8));
                    int i = 0;
                    int i2 = 0;
                    TL_iv.pageBlockPreformatted pageblockpreformatted = null;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.length() > 400) {
                            readLine = readLine.substring(0, 400) + "…";
                        }
                        if (!readLine.startsWith("diff ") && !readLine.startsWith("Index: ")) {
                            z = false;
                        } else {
                            z = true;
                        }
                        boolean startsWith = readLine.startsWith("@@");
                        if (i > 0 && (z || i >= 160 || (i >= 80 && startsWith))) {
                            ArrayList<TL_iv.PageBlock> arrayList = tL_page.blocks;
                            TL_iv.pageBlockPreformatted pageblockpreformatted2 = new TL_iv.pageBlockPreformatted();
                            pageblockpreformatted2.text = l(sb.toString());
                            pageblockpreformatted2.language = str6;
                            pageblockpreformatted2.diff = true;
                            if (pageblockpreformatted != null) {
                                pageblockpreformatted.continuesNext = true;
                                pageblockpreformatted2.continuesPrev = true;
                            }
                            arrayList.add(pageblockpreformatted2);
                            sb.setLength(0);
                            i = 0;
                            pageblockpreformatted = pageblockpreformatted2;
                        }
                        if (z) {
                            str6 = a(readLine);
                        } else if (readLine.startsWith("+++ ") && !readLine.startsWith("+++ /dev/null")) {
                            str6 = a(readLine);
                        }
                        if (i > 0) {
                            sb.append('\n');
                        }
                        sb.append(readLine);
                        i++;
                        int length = readLine.length();
                        for (int i3 = 0; i3 < readLine.length(); i3++) {
                            if (readLine.charAt(i3) == '\t') {
                                length += 3;
                            }
                        }
                        i2 = Math.max(i2, length);
                    }
                    bufferedReader.close();
                    if (i > 0) {
                        ArrayList<TL_iv.PageBlock> arrayList2 = tL_page.blocks;
                        TL_iv.pageBlockPreformatted pageblockpreformatted3 = new TL_iv.pageBlockPreformatted();
                        pageblockpreformatted3.text = l(sb.toString());
                        pageblockpreformatted3.language = str6;
                        pageblockpreformatted3.diff = true;
                        if (pageblockpreformatted != null) {
                            pageblockpreformatted.continuesNext = true;
                            pageblockpreformatted3.continuesPrev = true;
                        }
                        arrayList2.add(pageblockpreformatted3);
                    }
                    if (!tL_page.blocks.isEmpty()) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < tL_page.blocks.size(); i5++) {
                            i4 += o(tL_page.blocks.get(i5).text).length();
                        }
                        for (int i6 = 0; i6 < tL_page.blocks.size(); i6++) {
                            ((TL_iv.pageBlockPreformatted) tL_page.blocks.get(i6)).codeLength = i4;
                            ((TL_iv.pageBlockPreformatted) tL_page.blocks.get(i6)).diffColumns = i2;
                        }
                        tL_webPage.flags |= 1024;
                        tL_webPage.cached_page = tL_page;
                        return tL_webPage;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return null;
                }
            }
        } else if (message != null && (F0 = k47Var.F0()) != null && (f = f(k47Var)) != null && f.length() <= 65536) {
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename2 = (TLRPC.TL_documentAttributeFilename) gm.V(TLRPC.TL_documentAttributeFilename.class, F0.attributes);
            if (tL_documentAttributeFilename2 != null) {
                str = tL_documentAttributeFilename2.file_name;
            } else {
                str = null;
            }
            TLRPC.TL_webPage tL_webPage2 = new TLRPC.TL_webPage();
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            tL_webPage2.url = str2;
            if (str != null) {
                str6 = str;
            }
            tL_webPage2.display_url = str6;
            if (!TextUtils.isEmpty(str)) {
                tL_webPage2.flags |= 4;
                tL_webPage2.title = str;
            }
            TL_iv.TL_page tL_page2 = new TL_iv.TL_page();
            tL_page2.local = f;
            tL_page2.url = tL_webPage2.url;
            try {
                FileInputStream fileInputStream = new FileInputStream(f);
                byte[] bArr = new byte[(int) f.length()];
                fileInputStream.read(bArr);
                String str7 = new String(bArr, StandardCharsets.UTF_8);
                fileInputStream.close();
                if (str7.length() <= 65536) {
                    String k = k(str7, tL_page2.blocks);
                    if (!TextUtils.isEmpty(k)) {
                        tL_webPage2.flags |= 4;
                        tL_webPage2.title = k;
                    }
                    tL_webPage2.flags |= 1024;
                    tL_webPage2.cached_page = tL_page2;
                    return tL_webPage2;
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
        return null;
    }

    public static int e(int i, CharSequence charSequence) {
        char charAt;
        if (i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\n' || charAt == ' ') {
            return 0;
        }
        if (charAt != '+' && charAt != '-') {
            return 3;
        }
        int i2 = i + 3;
        if (i2 < charSequence.length() && charSequence.charAt(i + 1) == charAt && charSequence.charAt(i + 2) == charAt && charSequence.charAt(i2) == ' ') {
            return 3;
        }
        if (charAt != '+') {
            return 2;
        }
        return 1;
    }

    public static File f(k47 k47Var) {
        File file;
        TLRPC.Message message = k47Var.k;
        int i = k47Var.K1;
        if (!TextUtils.isEmpty(message.attachPath)) {
            file = new File(k47Var.k.attachPath);
        } else {
            file = null;
        }
        if (file == null || !file.exists()) {
            bc4.G(i);
            file = bc4.M(k47Var.k, false, true);
        }
        if (file == null || !file.exists()) {
            bc4.G(i);
            file = bc4.M(k47Var.k, true, true);
        }
        if (file == null || !file.exists()) {
            return null;
        }
        return file;
    }

    public static boolean g(k47 k47Var) {
        String Q0 = k47Var.Q0();
        if (!"diff".equalsIgnoreCase(Q0) && !"patch".equalsIgnoreCase(Q0)) {
            String t1 = k47Var.t1();
            if (t1 != null) {
                String lowerCase = t1.toLowerCase();
                if (!lowerCase.startsWith("text/x-diff") && !lowerCase.startsWith("text/x-patch")) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static TL_iv.textMath h(String str) {
        String trim;
        TL_iv.textMath textmath = new TL_iv.textMath();
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        textmath.source = trim;
        textmath.tried = true;
        lz5 a2 = lz5.a(trim, gm.L(20.0f), true);
        if (a2 != null) {
            textmath.w = a2.b;
            textmath.h = a2.c;
            textmath.depth = a2.d;
            textmath.bitmap = a2.a;
        }
        return textmath;
    }

    public static TL_iv.RichText i(TL_iv.RichText richText) {
        if (richText == null) {
            return null;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            for (int i = 0; i < textconcat.texts.size(); i++) {
                ArrayList<TL_iv.RichText> arrayList = textconcat.texts;
                arrayList.set(i, i(arrayList.get(i)));
            }
            return textconcat;
        } else if (richText instanceof zk6) {
            zk6 zk6Var = (zk6) richText;
            TL_iv.textStrike i2 = i(zk6Var.text);
            int i3 = zk6Var.a;
            if ((i3 & 4) != 0) {
                TL_iv.textFixed textfixed = new TL_iv.textFixed();
                textfixed.text = i2;
                i2 = textfixed;
            }
            if ((i3 & 32) != 0) {
                TL_iv.textStrike textstrike = new TL_iv.textStrike();
                textstrike.text = i2;
                i2 = textstrike;
            }
            if ((i3 & 16) != 0) {
                TL_iv.textUnderline textunderline = new TL_iv.textUnderline();
                textunderline.text = i2;
                i2 = textunderline;
            }
            if ((i3 & 64) != 0) {
                TL_iv.textMarked textmarked = new TL_iv.textMarked();
                textmarked.text = i2;
                i2 = textmarked;
            }
            if ((i3 & 128) != 0) {
                TL_iv.textSubscript textsubscript = new TL_iv.textSubscript();
                textsubscript.text = i2;
                i2 = textsubscript;
            }
            if ((i3 & 256) != 0) {
                TL_iv.textSuperscript textsuperscript = new TL_iv.textSuperscript();
                textsuperscript.text = i2;
                i2 = textsuperscript;
            }
            if ((i3 & 2) != 0) {
                TL_iv.textItalic textitalic = new TL_iv.textItalic();
                textitalic.text = i2;
                i2 = textitalic;
            }
            if ((i3 & 1) != 0) {
                TL_iv.textBold textbold = new TL_iv.textBold();
                textbold.text = i2;
                return textbold;
            }
            return i2;
        } else {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                richText.text = i(richText2);
            }
            return richText;
        }
    }

    public static org.telegram.tgnet.tl.TL_iv.RichText j(org.telegram.tgnet.tl.TL_iv.RichText r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al6.j(org.telegram.tgnet.tl.TL_iv$RichText):org.telegram.tgnet.tl.TL_iv$RichText");
    }

    public static String k(String str, ArrayList arrayList) {
        String[] split;
        TL_iv.RichText richText;
        String substring;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split2 = str.split("\n", -1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < split2.length) {
            Matcher matcher = a.matcher(split2[i]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                StringBuilder sb2 = new StringBuilder(matcher.group(2));
                while (true) {
                    i++;
                    while (i < split2.length) {
                        String str2 = split2[i];
                        if (!str2.startsWith("    ") && !str2.startsWith("\t")) {
                            if (!str2.trim().isEmpty()) {
                                break;
                            }
                            int i2 = i + 1;
                            int i3 = i2;
                            while (i3 < split2.length && split2[i3].trim().isEmpty()) {
                                i3++;
                            }
                            if (i3 >= split2.length || (!split2[i3].startsWith("    ") && !split2[i3].startsWith("\t"))) {
                                break;
                            }
                            sb2.append('\n');
                            i = i2;
                        } else {
                            sb2.append('\n');
                            if (str2.startsWith("\t")) {
                                substring = str2.substring(1);
                            } else {
                                substring = str2.substring(4);
                            }
                            sb2.append(substring);
                        }
                    }
                    break;
                }
                linkedHashMap.put(group, sb2.toString().trim());
            } else {
                sb.append(split2[i]);
                if (i < split2.length - 1) {
                    sb.append('\n');
                }
                i++;
            }
        }
        Matcher matcher2 = b.matcher(sb.toString());
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher2.find()) {
            String group2 = matcher2.group(1);
            matcher2.appendReplacement(stringBuffer, Matcher.quoteReplacement("<sup>[\\[" + group2 + "\\]](#fn-" + group2 + ")</sup>"));
        }
        matcher2.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        List<g84> asList = Arrays.asList(new bbb((byte) 0), new bbb((byte) 1));
        Pattern pattern = el6.j;
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        arrayList2.addAll(Arrays.asList(new Object(), new Object(), new Object(), new if0((byte) 0), new Object(), new Object(), new Object(), new Object(), new if0((byte) 1)));
        arrayList3.addAll(Arrays.asList(new my((byte) 0), new my((byte) 1)));
        gm.L(18.0f);
        Executors.newCachedThreadPool();
        new Handler(Looper.getMainLooper());
        new HashMap(3);
        arrayList2.add(new Object());
        arrayList2.add(new Object());
        sm2 sm2Var = new sm2((byte) 10);
        if (asList != null) {
            for (g84 g84Var : asList) {
                if (g84Var instanceof bbb) {
                    switch (((bbb) g84Var).a) {
                        case 0:
                            ((ArrayList) sm2Var.b).add(new Object());
                            continue;
                        default:
                            ((ArrayList) sm2Var.d).add(new jl0((byte) 7));
                            continue;
                    }
                }
            }
            sm2Var.f = new mj4(arrayList2, arrayList3, (byte) 8);
            ((ArrayList) sm2Var.d).add(new jl0((byte) 5));
            ?? obj = new Object();
            LinkedHashSet linkedHashSet = fq3.p;
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll((ArrayList) sm2Var.d);
            for (Class cls : (LinkedHashSet) sm2Var.e) {
                arrayList4.add(fq3.q.get(cls));
            }
            obj.a = arrayList4;
            rp5 rp5Var = (mj4) sm2Var.f;
            if (rp5Var == null) {
                rp5Var = new jk2((byte) 23);
            }
            obj.c = rp5Var;
            obj.d = (ArrayList) sm2Var.c;
            ArrayList arrayList5 = (ArrayList) sm2Var.b;
            obj.b = arrayList5;
            rp5Var.f1(new wm4(arrayList5, Collections.EMPTY_MAP, (byte) 5));
            ArrayDeque arrayDeque = new ArrayDeque();
            String str3 = null;
            boolean z = false;
            for (String str4 : stringBuffer2.split("\n", -1)) {
                int i4 = 0;
                while (i4 < str4.length() && i4 < 3 && str4.charAt(i4) == ' ') {
                    i4++;
                }
                String substring2 = str4.substring(i4);
                if (z) {
                    if (substring2.startsWith(str3)) {
                        str3 = null;
                        z = false;
                    }
                } else {
                    String str5 = "```";
                    if (!substring2.startsWith("```")) {
                        str5 = "~~~";
                        if (!substring2.startsWith("~~~")) {
                            Matcher matcher3 = c.matcher(str4);
                            if (matcher3.find()) {
                                arrayDeque.add(matcher3.group(1));
                            }
                        }
                    }
                    z = true;
                    str3 = str5;
                }
            }
            wk6 wk6Var = new wk6(arrayList, arrayDeque);
            wk6Var.v(obj.D(stringBuffer2));
            wk6Var.y();
            if (!linkedHashMap.isEmpty()) {
                TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                String M0 = jb6.M0(2131748948, null);
                TL_iv.textBold textbold = new TL_iv.textBold();
                textbold.text = l(M0);
                pageblockdetails.title = textbold;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str6 = (String) entry.getKey();
                    ArrayList arrayList6 = new ArrayList();
                    wk6 wk6Var2 = new wk6(arrayList6, new ArrayDeque());
                    wk6Var2.v(obj.D((String) entry.getValue()));
                    wk6Var2.y();
                    TL_iv.RichText textconcat = new TL_iv.textConcat();
                    int size = arrayList6.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj2 = arrayList6.get(i5);
                        i5++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            richText = ((TL_iv.pageBlockParagraph) pageBlock).text;
                        } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                            richText = ((TL_iv.pageBlockHeader) pageBlock).text;
                        } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                            richText = ((TL_iv.pageBlockSubheader) pageBlock).text;
                        } else if (pageBlock instanceof TL_iv.pageBlockTitle) {
                            richText = ((TL_iv.pageBlockTitle) pageBlock).text;
                        } else {
                            richText = null;
                        }
                        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                            if (!textconcat.texts.isEmpty()) {
                                textconcat.texts.add(l("\n\n"));
                            }
                            textconcat.texts.add(richText);
                        }
                    }
                    if (textconcat.texts.isEmpty()) {
                        textconcat = new TL_iv.textEmpty();
                    } else if (textconcat.texts.size() == 1) {
                        textconcat = textconcat.texts.get(0);
                    }
                    TL_iv.RichText b2 = b(textconcat);
                    TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
                    textanchor.name = b10.h("fn-", str6);
                    textanchor.text = b2;
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    String p = td4.p(str6, ". ");
                    TL_iv.textBold textbold2 = new TL_iv.textBold();
                    textbold2.text = l(p);
                    TL_iv.RichText[] richTextArr = {textbold2, textanchor};
                    TL_iv.textConcat textconcat2 = new TL_iv.textConcat();
                    for (int i6 = 0; i6 < 2; i6++) {
                        textconcat2.texts.add(richTextArr[i6]);
                    }
                    pageblockparagraph.text = textconcat2;
                    pageblockdetails.blocks.add(pageblockparagraph);
                }
                arrayList.add(pageblockdetails);
            }
            TL_iv.RichText richText2 = wk6Var.b;
            if (richText2 == null) {
                return null;
            }
            return o(richText2);
        }
        gxc.d("extensions must not be null");
        return null;
    }

    public static TL_iv.textPlain l(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        if (str == null) {
            str = "";
        }
        textplain.text = str;
        return textplain;
    }

    public static int m(TL_iv.RichText richText) {
        int i = 0;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return 0;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            if (str == null) {
                return 0;
            }
            return str.length();
        } else if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_iv.RichText richText2 = arrayList.get(i2);
                i2++;
                i += m(richText2);
            }
            return i;
        } else {
            return m(richText.text);
        }
    }

    public static TL_iv.RichText n(ui6 ui6Var, TL_iv.PageBlock pageBlock) {
        xk6 xk6Var = new xk6(pageBlock);
        ui6Var.a(xk6Var);
        return i(j(xk6.x(xk6Var.c)));
    }

    public static String o(TL_iv.RichText richText) {
        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
            if (richText instanceof TL_iv.textPlain) {
                return ((TL_iv.textPlain) richText).text;
            }
            if (richText instanceof TL_iv.textConcat) {
                StringBuilder sb = new StringBuilder();
                ArrayList<TL_iv.RichText> arrayList = richText.texts;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    TL_iv.RichText richText2 = arrayList.get(i);
                    i++;
                    sb.append(o(richText2));
                }
                return sb.toString();
            }
            return o(richText.text);
        }
        return "";
    }

    public static List p(TL_iv.RichText richText) {
        int i;
        if (richText == null) {
            return Collections.singletonList(l(""));
        }
        if (m(richText) <= 8192) {
            return Collections.singletonList(richText);
        }
        String o = o(richText);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < o.length()) {
            if (o.length() - i2 <= 8192) {
                arrayList.add(l(o.substring(i2)));
                return arrayList;
            }
            int i3 = i2 + 8192;
            int i4 = i2 + 8191;
            int lastIndexOf = o.lastIndexOf(10, i4);
            if (lastIndexOf <= i2) {
                lastIndexOf = o.lastIndexOf(32, i4);
            }
            if (lastIndexOf <= i2) {
                i = 0;
            } else {
                i = 1;
                i3 = lastIndexOf;
            }
            arrayList.add(l(o.substring(i2, i3)));
            i2 = i3 + i;
        }
        return arrayList;
    }
}
