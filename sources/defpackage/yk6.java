package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.telegram.tgnet.tl.TL_iv;
public final class yk6 extends zpd {
    public final ArrayList a;
    public TL_iv.RichText b;
    public final ArrayList c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final fl6 e = new fl6(new faf((byte) 20), new rj2((byte) 28));
    public final ArrayDeque f;

    public yk6(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.a = arrayList;
        this.f = arrayDeque;
    }

    public static void A(ArrayList arrayList, List list, int i) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (obj instanceof wk6) {
                list.add(((wk6) obj).a);
            } else if (obj instanceof xk6) {
                C((xk6) obj, list, i);
            }
        }
    }

    public static int B(yi6 yi6Var) {
        qkb qkbVar;
        String str;
        yi6 yi6Var2 = (yi6) yi6Var.c;
        if (yi6Var2 instanceof ay7) {
            yi6 yi6Var3 = (yi6) yi6Var2.c;
            if ((yi6Var3 instanceof qkb) && (str = (qkbVar = (qkb) yi6Var3).g) != null) {
                int i = 3;
                if (str.length() >= 3) {
                    int i2 = 0;
                    if (str.charAt(0) == '[' && str.charAt(2) == ']') {
                        char charAt = str.charAt(1);
                        if (charAt != ' ') {
                            if (charAt == 'x' || charAt == 'X') {
                                i2 = 1;
                            } else {
                                return -1;
                            }
                        }
                        if (str.length() > 3 && str.charAt(3) == ' ') {
                            i = 4;
                        }
                        qkbVar.g = str.substring(i);
                        return i2;
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    public static void C(xk6 xk6Var, List list, int i) {
        String lowerCase;
        String str;
        boolean z;
        TL_iv.RichText l;
        hi5 hi5Var = xk6Var.a;
        ArrayList arrayList = xk6Var.c;
        String str2 = hi5Var.a;
        if (str2 == null) {
            lowerCase = "";
        } else {
            lowerCase = str2.toLowerCase();
        }
        if (i >= 64) {
            A(arrayList, list, i + 1);
            return;
        }
        switch (lowerCase.hashCode()) {
            case -1857640538:
                if (lowerCase.equals("summary")) {
                    return;
                }
                break;
            case -1268861541:
                str = "footer";
                lowerCase.equals(str);
                break;
            case -1221270899:
                str = "header";
                lowerCase.equals(str);
                break;
            case -732377866:
                str = "article";
                lowerCase.equals(str);
                break;
            case 112:
                str = "p";
                lowerCase.equals(str);
                break;
            case 99473:
                str = "div";
                lowerCase.equals(str);
                break;
            case 108835:
                str = "nav";
                lowerCase.equals(str);
                break;
            case 3343801:
                str = "main";
                lowerCase.equals(str);
                break;
            case 93111608:
                str = "aside";
                lowerCase.equals(str);
                break;
            case 1557721666:
                if (lowerCase.equals("details")) {
                    TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                    Map map = hi5Var.c;
                    int i2 = 0;
                    if (map != null && map.containsKey("open")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    pageblockdetails.open = z;
                    pageblockdetails.title = new TL_iv.textEmpty();
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        boolean z2 = obj instanceof xk6;
                        if (z2) {
                            xk6 xk6Var2 = (xk6) obj;
                            if ("summary".equalsIgnoreCase(xk6Var2.a.a)) {
                                StringBuilder sb = new StringBuilder();
                                w(sb, xk6Var2.c);
                                String trim = sb.toString().trim();
                                if (trim.isEmpty()) {
                                    l = new TL_iv.textEmpty();
                                } else {
                                    l = cl6.l(trim);
                                }
                                pageblockdetails.title = l;
                            }
                        }
                        if (obj instanceof wk6) {
                            arrayList2.add(((wk6) obj).a);
                        } else if (z2) {
                            C((xk6) obj, arrayList2, i + 1);
                        }
                    }
                    pageblockdetails.blocks.addAll(arrayList2);
                    list.add(pageblockdetails);
                    return;
                }
                break;
            case 1970241253:
                str = "section";
                lowerCase.equals(str);
                break;
        }
        A(arrayList, list, i + 1);
    }

    public static void w(StringBuilder sb, ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (obj instanceof wk6) {
                TL_iv.PageBlock pageBlock = ((wk6) obj).a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(cl6.o(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(cl6.o(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(cl6.o(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof xk6) {
                w(sb, ((xk6) obj).c);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        List unmodifiableList;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hi5 hi5Var = (hi5) it.next();
            arrayList.add(hi5Var);
            ArrayList arrayList2 = hi5Var.f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            z(arrayList, unmodifiableList);
        }
    }

    @Override
    public final void a(jk0 jk0Var) {
        for (TL_iv.RichText richText : cl6.p(cl6.n(jk0Var, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override
    public final void b(g11 g11Var) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (yi6 yi6Var = (yi6) g11Var.c; yi6Var != null; yi6Var = (yi6) yi6Var.f) {
            if (yi6Var instanceof j76) {
                int B = B(yi6Var);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (B >= 0) {
                    boolean z = true;
                    tL_pageListItemText.checkbox = true;
                    if (B != 1) {
                        z = false;
                    }
                    tL_pageListItemText.checked = z;
                }
                tL_pageListItemText.text = cl6.b(cl6.n(yi6Var, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override
    public final void f(oa4 oa4Var) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = cl6.b(cl6.l(oa4Var.k));
        String str = oa4Var.j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override
    public final void g(of5 of5Var) {
        TL_iv.RichText b = cl6.b(cl6.n(of5Var, null));
        if (this.c.isEmpty()) {
            this.b = b;
        }
        switch (of5Var.g) {
            case 1:
                TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                pageblockheading1.text = b;
                x(pageblockheading1);
                return;
            case 2:
                TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                pageblockheading2.text = b;
                x(pageblockheading2);
                return;
            case 3:
                TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                pageblockheading3.text = b;
                x(pageblockheading3);
                return;
            case 4:
                TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                pageblockheading4.text = b;
                x(pageblockheading4);
                return;
            case 5:
                TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                pageblockheading5.text = b;
                x(pageblockheading5);
                return;
            case 6:
                TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                pageblockheading6.text = b;
                x(pageblockheading6);
                return;
            default:
                TL_iv.pageBlockHeader pageblockheader = new TL_iv.pageBlockHeader();
                pageblockheader.text = b;
                x(pageblockheader);
                return;
        }
    }

    @Override
    public final void h(ei5 ei5Var) {
        StringBuilder sb = this.d;
        String str = ei5Var.g;
        if (str == null) {
            return;
        }
        try {
            this.e.b(sb, str);
        } catch (Throwable th) {
            cc4.g(th, true);
            sb.append(str);
        }
    }

    @Override
    public final void j(kp5 kp5Var) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = cl6.b(cl6.l(kp5Var.g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override
    public final void k(c76 c76Var) {
        boolean z;
        if (c76Var instanceof aib) {
            TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
            pageblocktable.bordered = true;
            pageblocktable.title = new TL_iv.textEmpty();
            for (yi6 yi6Var = (yi6) ((aib) c76Var).c; yi6Var != null; yi6Var = (yi6) yi6Var.f) {
                boolean z2 = yi6Var instanceof kib;
                if (z2 || (yi6Var instanceof cib)) {
                    for (yi6 yi6Var2 = (yi6) yi6Var.c; yi6Var2 != null; yi6Var2 = (yi6) yi6Var2.f) {
                        if (yi6Var2 instanceof bjb) {
                            ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                            for (yi6 yi6Var3 = (yi6) ((bjb) yi6Var2).c; yi6Var3 != null; yi6Var3 = (yi6) yi6Var3.f) {
                                if (yi6Var3 instanceof iib) {
                                    ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                    iib iibVar = (iib) yi6Var3;
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    if (!z2 && !iibVar.g) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    pagetablecell.header = z;
                                    gib gibVar = iibVar.h;
                                    if (gibVar == gib.b) {
                                        pagetablecell.align_center = true;
                                    } else if (gibVar == gib.c) {
                                        pagetablecell.align_right = true;
                                    }
                                    pagetablecell.text = cl6.b(cl6.n(iibVar, null));
                                    pagetablecell.flags |= 128;
                                    arrayList2.add(pagetablecell);
                                }
                            }
                            arrayList.add(pagetablerow);
                        }
                    }
                }
            }
            x(pageblocktable);
        } else if (c76Var instanceof tu5) {
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = cl6.h(((tu5) c76Var).g);
            x(pageblockparagraph);
        } else {
            v(c76Var);
        }
    }

    @Override
    public final void m(defpackage.du7 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk6.m(du7):void");
    }

    @Override
    public final void n(ay7 ay7Var) {
        for (TL_iv.RichText richText : cl6.p(cl6.n(ay7Var, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override
    public final void p(inb inbVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb = this.d;
        int length = sb.length();
        sb.append((char) 1);
        sb.length();
        this.c.add(new wk6(length, pageBlock));
    }

    public final void y() {
        List unmodifiableList;
        StringBuilder sb = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            fl6 fl6Var = this.e;
            int length = sb.length();
            hi5 hi5Var = fl6Var.b;
            while (true) {
                hi5 hi5Var2 = hi5Var.e;
                if (hi5Var2 == null) {
                    break;
                }
                hi5Var = hi5Var2;
            }
            if (length > -1) {
                hi5Var.b(length);
            }
            ArrayList arrayList2 = hi5Var.f;
            if (arrayList2 == null) {
                unmodifiableList = Collections.EMPTY_LIST;
            } else {
                unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            if (unmodifiableList.size() > 0) {
                arrayList.addAll(unmodifiableList);
            } else {
                arrayList.addAll(Collections.EMPTY_LIST);
            }
            fl6Var.b = new hi5("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.c;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            wk6 wk6Var = (wk6) obj;
            hashMap.put(Integer.valueOf(wk6Var.b), wk6Var);
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(0);
        treeSet.add(Integer.valueOf(sb.length()));
        for (Integer num : hashMap.keySet()) {
            treeSet.add(num);
            treeSet.add(Integer.valueOf(num.intValue() + 1));
        }
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            hi5 hi5Var3 = (hi5) obj2;
            treeSet.add(Integer.valueOf(hi5Var3.b));
            treeSet.add(Integer.valueOf(hi5Var3.d));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it = treeSet.iterator();
        Integer num2 = null;
        while (it.hasNext()) {
            Integer num3 = (Integer) it.next();
            if (num2 != null && num3.intValue() > num2.intValue()) {
                int intValue = num2.intValue();
                int intValue2 = num3.intValue();
                if (intValue2 - intValue == 1 && hashMap.containsKey(num2)) {
                    arrayList5.add((wk6) hashMap.get(num2));
                } else {
                    String trim = sb.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = cl6.b(cl6.l(trim));
                        arrayList5.add(new wk6(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new vk6((byte) 0));
        xk6 xk6Var = new xk6(null, Integer.MAX_VALUE);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(xk6Var);
        int size3 = arrayList5.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList5.get(i4);
            i4++;
            wk6 wk6Var2 = (wk6) obj3;
            while (i3 < arrayList3.size() && ((hi5) arrayList3.get(i3)).b <= wk6Var2.b) {
                int i5 = i3 + 1;
                hi5 hi5Var4 = (hi5) arrayList3.get(i3);
                int i6 = hi5Var4.d;
                int i7 = hi5Var4.b;
                if (i6 >= wk6Var2.b) {
                    while (arrayDeque.peek() != xk6Var && ((xk6) arrayDeque.peek()).b <= i7) {
                        arrayDeque.pop();
                    }
                    xk6 xk6Var2 = new xk6(hi5Var4, hi5Var4.d);
                    ((xk6) arrayDeque.peek()).c.add(xk6Var2);
                    arrayDeque.push(xk6Var2);
                }
                i3 = i5;
            }
            while (arrayDeque.peek() != xk6Var && ((xk6) arrayDeque.peek()).b <= wk6Var2.b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = wk6Var2.a;
            ((xk6) arrayDeque.peek()).c.add(wk6Var2);
        }
        A(xk6Var.c, this.a, 0);
    }
}
