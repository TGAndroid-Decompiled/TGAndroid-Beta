package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Map;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class pi9 extends q9c {
    public static final ArrayList A4 = new ArrayList();
    public boolean A3;
    public float B3;
    public float C3;
    public float D3;
    public float E3;
    public View F3;
    public m72 G3;
    public boolean H3;
    public boolean I3;
    public boolean J3;
    public boolean K3;
    public TL_iv.pageTableCell L3;
    public TL_iv.pageTableCell M3;
    public long N3;
    public float O3;
    public float P3;
    public boolean Q3;
    public ch9 R3;
    public int S3;
    public dg9 T3;
    public final o72 U3;
    public ArrayList V3;
    public int W3;
    public int X3;
    public int Y3;
    public boolean Z3;
    public mk0 a4;
    public boolean b4;
    public final hi9 c4;
    public final nh9 d4;
    public final ii9 e4;
    public final ji9 f4;
    public final ki9 g4;
    public final IdentityHashMap h4;
    public final IdentityHashMap i4;
    public mk0 j4;
    public mk0 k4;
    public final li9 l4;
    public final vh9 m4;
    public final int n3;
    public final wh9 n4;
    public final vnb o3;
    public final xh9 o4;
    public final ni9 p3;
    public final yh9 p4;
    public r47 q3;
    public xl9 q4;
    public boolean r3;
    public fu5 r4;
    public TL_iv.RichMessage s3;
    public int s4;
    public final ArrayList t3;
    public int t4;
    public final HashMap u3;
    public final oh9 u4;
    public final di9 v3;
    public final zh9 v4;
    public final lmb w3;
    public final k09 w4;
    public int x3;
    public final ArrayList x4;
    public int y3;
    public ab9 y4;
    public int z3;
    public int z4;

    public pi9(Context context, int i, vnb vnbVar, ni9 ni9Var) {
        super(context, i, 0, false, new hj8(r2, (byte) 12), new ye9(r2, (byte) 3), null, vnbVar);
        this.r3 = true;
        this.t3 = new ArrayList();
        this.u3 = new HashMap();
        this.x3 = -1;
        this.y3 = -1;
        this.z3 = 0;
        this.U3 = new o72(this, (byte) 3);
        this.Z3 = true;
        this.c4 = new hi9(this);
        this.d4 = new nh9(this);
        this.e4 = new ii9(this);
        this.f4 = new ji9(this);
        this.g4 = new ki9(this);
        this.h4 = new IdentityHashMap();
        this.i4 = new IdentityHashMap();
        this.l4 = new li9(this);
        this.m4 = new vh9(this);
        this.n4 = new wh9(this);
        this.o4 = new xh9(this);
        this.p4 = new yh9(this);
        this.s4 = -1;
        this.t4 = -1;
        this.u4 = new oh9(this);
        this.v4 = new zh9(this);
        k09 k09Var = new k09(this, (byte) 4);
        this.w4 = k09Var;
        this.x4 = new ArrayList();
        this.z4 = -1;
        pi9[] pi9VarArr = {this};
        this.n3 = i;
        this.o3 = vnbVar;
        this.p3 = ni9Var;
        this.g3.r = false;
        setClipToPadding(false);
        setClipChildren(false);
        F1(new hj8(this, (byte) 13), false);
        setReorderLongPressEnabled(false);
        A1(true);
        di9 di9Var = new di9(this, ni9Var);
        this.v3 = di9Var;
        di9Var.Q(this);
        di9Var.z0 = this.f3;
        lmb m = di9Var.m(context);
        this.w3 = m;
        hl.B2(m);
        di9Var.D = new fi9(this, ni9Var);
        j(new bj1(this, ni9Var, (byte) 11));
        this.R3 = new ch9(k09Var);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !y3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockDivider) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockButtonRow) && !(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            return false;
        }
        return true;
    }

    public static boolean C3(mk0 mk0Var) {
        if (mk0Var != null && !mk0Var.i && !u3(mk0Var) && (mk0Var.b instanceof TL_iv.pageBlockParagraph) && mk0Var.c == 0 && mk0Var.d == 0 && !mk0Var.e && mk0Var.k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void G2(mk0 mk0Var, ArrayList arrayList) {
        int i;
        int i2;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j;
        TL_iv.PageBlock pageBlock = mk0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            p07 p07Var = mk0Var.g;
            if (p07Var != null && p07Var.b()) {
                TL_iv.PageBlock pageBlock2 = mk0Var.b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        mk0Var.b.caption.text = new TL_iv.textEmpty();
                        mk0Var.b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(mk0Var.b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            p07 p07Var2 = mk0Var.g;
            if (p07Var2 != null && p07Var2.b()) {
                TL_iv.PageBlock pageBlock3 = mk0Var.b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        mk0Var.b.caption.text = new TL_iv.textEmpty();
                        mk0Var.b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(mk0Var.b);
                }
            }
        } else {
            boolean y3 = y3(pageBlock);
            TL_iv.PageBlock pageBlock4 = mk0Var.b;
            if (y3) {
                ArrayList d3 = d3(pageBlock4);
                List O3 = O3(mk0Var);
                ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
                for (int i3 = 0; d3 != null && i3 < d3.size() && i3 < O3.size(); i3++) {
                    TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) d3.get(i3);
                    if (((p07) O3.get(i3)).b()) {
                        if (pageBlock5 instanceof TL_iv.pageBlockPhoto) {
                            j = ((TL_iv.pageBlockPhoto) pageBlock5).photo_id;
                        } else if (pageBlock5 instanceof TL_iv.pageBlockVideo) {
                            j = ((TL_iv.pageBlockVideo) pageBlock5).video_id;
                        } else {
                            j = 0;
                        }
                        if (j != 0) {
                            if9.d(pageBlock5);
                            arrayList2.add(pageBlock5);
                        }
                    }
                }
                if (arrayList2.size() >= 2) {
                    if (mk0Var.b instanceof TL_iv.pageBlockSlideshow) {
                        TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                        pageblockslideshow.items = arrayList2;
                        pageblockslideshow.caption = mk0Var.b.caption;
                        pageblockcollage = pageblockslideshow;
                    } else {
                        TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                        pageblockcollage2.items = arrayList2;
                        pageblockcollage2.caption = mk0Var.b.caption;
                        pageblockcollage = pageblockcollage2;
                    }
                    if9.d(pageblockcollage);
                    arrayList.add(pageblockcollage);
                } else if (arrayList2.size() == 1) {
                    arrayList.add(arrayList2.get(0));
                }
            } else if (pageBlock4 instanceof TL_iv.pageBlockAudio) {
                p07 p07Var3 = mk0Var.g;
                if (p07Var3 != null && p07Var3.b()) {
                    TL_iv.PageBlock pageBlock6 = mk0Var.b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            mk0Var.b.caption.text = new TL_iv.textEmpty();
                            mk0Var.b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(mk0Var.b);
                    }
                }
            } else if (pageBlock4 instanceof TL_iv.pageBlockDocument) {
                p07 p07Var4 = mk0Var.g;
                if (p07Var4 != null && (document = p07Var4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock4).document_id = document.id;
                }
                if (p07Var4 != null && p07Var4.b()) {
                    TL_iv.PageBlock pageBlock7 = mk0Var.b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        if9.d(pageBlock7);
                        arrayList.add(mk0Var.b);
                    }
                }
            } else if (pageBlock4 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock4;
                int i4 = gj9.N;
                if (pageblockmap.geo instanceof TLRPC.TL_geoPoint) {
                    if (pageblockmap.caption == null) {
                        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                        pageblockmap.caption = pageCaption;
                        pageCaption.text = new TL_iv.textEmpty();
                        pageblockmap.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(pageblockmap);
                }
            } else if (pageBlock4 instanceof TL_iv.pageBlockMath) {
                if (!TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock4).source)) {
                    arrayList.add(mk0Var.b);
                }
            } else if (pageBlock4 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock4;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                if (pageblocktable.rows != null) {
                    for (int i5 = 0; i5 < pageblocktable.rows.size(); i5++) {
                        TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i5);
                        if (pagetablerow.cells != null) {
                            for (int i6 = 0; i6 < pagetablerow.cells.size(); i6++) {
                                TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i6);
                                if (pagetablecell.text == null) {
                                    ajb.c(pagetablecell, "");
                                } else {
                                    pagetablecell.flags |= 128;
                                }
                                int i7 = pagetablecell.colspan;
                                int i8 = pagetablecell.flags;
                                if (i7 > 1) {
                                    i = i8 | 2;
                                } else {
                                    i = i8 & (-3);
                                }
                                pagetablecell.flags = i;
                                if (pagetablecell.rowspan > 1) {
                                    i2 = i | 4;
                                } else {
                                    i2 = i & (-5);
                                }
                                pagetablecell.flags = i2;
                            }
                        }
                    }
                }
                if (S4(pageblocktable)) {
                    arrayList.add(pageblocktable);
                }
            } else if (pageBlock4 instanceof TL_iv.pageBlockButtonRow) {
                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock4;
                ArrayList<TL_keyboard.PageButton> arrayList3 = pageblockbuttonrow.buttons;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    arrayList.add(pageblockbuttonrow);
                }
            } else {
                arrayList.add(pageBlock4);
            }
        }
    }

    public static boolean H2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static void I2(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            if (pageBlock.text == null) {
                pageBlock.text = new TL_iv.textEmpty();
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (pageblockpreformatted.language == null) {
                    pageblockpreformatted.language = "";
                    return;
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                if (pageblockblockquote.caption == null) {
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    return;
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                if (pageblockpullquote.caption == null) {
                    pageblockpullquote.caption = new TL_iv.textEmpty();
                }
            }
        }
    }

    public static void K2(ArrayList arrayList, ArrayList arrayList2, int i, boolean z, int i2, boolean z2, boolean z3) {
        boolean z4 = false;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i3);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z4) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            P1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i, i2, z2, z3);
                        } else {
                            mk0 mk0Var = new mk0(pageBlock, i, i2);
                            mk0Var.e = z2;
                            mk0Var.f = z3;
                            arrayList.add(mk0Var);
                        }
                        z4 = true;
                    } else {
                        arrayList.add(new mk0(pageBlock, i, z ? 1 : 0));
                    }
                } else {
                    if (!z4) {
                        P1(arrayList, null, i, i2, z2, z3);
                        z4 = true;
                    }
                    L2(arrayList, pageBlock, i + 1);
                }
            }
        }
        if (!z4) {
            P1(arrayList, null, i, i2, z2, z3);
        }
    }

    public static TL_iv.PageBlock K3(mk0 mk0Var, p07 p07Var) {
        int i;
        boolean y3 = y3(mk0Var.b);
        TL_iv.PageBlock pageBlock = mk0Var.b;
        if (y3) {
            ArrayList d3 = d3(pageBlock);
            ArrayList arrayList = mk0Var.h;
            if (arrayList != null) {
                i = arrayList.indexOf(p07Var);
            } else {
                i = -1;
            }
            if (i >= 0 && d3 != null && i < d3.size()) {
                return (TL_iv.PageBlock) d3.get(i);
            }
            return null;
        }
        return pageBlock;
    }

    public static void L2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i) {
        int i2 = 0;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            ArrayList<TL_iv.PageListOrderedItem> arrayList2 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
            int size = arrayList2.size();
            int i3 = 1;
            while (i2 < size) {
                TL_iv.PageListOrderedItem pageListOrderedItem = arrayList2.get(i2);
                i2++;
                TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                    P1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i, i3, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i4 = i3;
                    K2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i, true, i4, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                    i3 = i4;
                }
                i3++;
            }
            return;
        }
        ArrayList<TL_iv.PageListItem> arrayList3 = ((TL_iv.pageBlockList) pageBlock).items;
        int size2 = arrayList3.size();
        while (i2 < size2) {
            TL_iv.PageListItem pageListItem = arrayList3.get(i2);
            i2++;
            TL_iv.PageListItem pageListItem2 = pageListItem;
            if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                P1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                K2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static void L3(defpackage.pi9[] r20, java.util.ArrayList r21, defpackage.l9c r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.L3(pi9[], java.util.ArrayList, l9c):void");
    }

    public static List O3(mk0 mk0Var) {
        if (mk0Var == null) {
            return Collections.EMPTY_LIST;
        }
        if (y3(mk0Var.b)) {
            ArrayList arrayList = mk0Var.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        p07 p07Var = mk0Var.g;
        if (p07Var != null) {
            return Collections.singletonList(p07Var);
        }
        return Collections.EMPTY_LIST;
    }

    public static void P1(ArrayList arrayList, TL_iv.RichText richText, int i, int i2, boolean z, boolean z2) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        mk0 mk0Var = new mk0(pageblockparagraph, i, i2);
        mk0Var.e = z;
        mk0Var.f = z2;
        arrayList.add(mk0Var);
    }

    public static dg9 P3(View view) {
        if (view instanceof km9) {
            return ((km9) view).getEditText();
        }
        if (view instanceof jf9) {
            return ((jf9) view).getCaptionEditText();
        }
        if (view instanceof rf9) {
            return ((rf9) view).getEditText();
        }
        return null;
    }

    public static TL_iv.PageBlock Q3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return new TL_iv.pageBlockHeading1();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return new TL_iv.pageBlockHeading2();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return new TL_iv.pageBlockHeading3();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return new TL_iv.pageBlockHeading4();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return new TL_iv.pageBlockHeading5();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return new TL_iv.pageBlockHeading6();
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return new TL_iv.pageBlockBlockquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return new TL_iv.pageBlockPullquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
            pageblockpreformatted.language = ((TL_iv.pageBlockPreformatted) pageBlock).language;
            return pageblockpreformatted;
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return new TL_iv.pageBlockFooter();
        } else {
            return new TL_iv.pageBlockParagraph();
        }
    }

    public static xl9 R2(dg9 dg9Var) {
        for (ViewParent parent = dg9Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof xl9) {
                return (xl9) parent;
            }
        }
        return null;
    }

    public static p07 R3(no6 no6Var, String str) {
        boolean z;
        int i;
        p07 p07Var = new p07();
        p07Var.b = no6Var.b;
        p07Var.e = str;
        p07Var.j = no6Var.F;
        p07Var.k = no6Var.G;
        String str2 = no6Var.h;
        int i2 = 0;
        if (str2 != null && str != null && str.equals(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = no6Var.J;
        }
        p07Var.l = i;
        if (!z) {
            i2 = no6Var.K;
        }
        p07Var.m = i2;
        p07Var.a = (byte) 1;
        p07Var.f = 0.0f;
        return p07Var;
    }

    public static boolean S4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(mm9.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i = 0; i < pageblocktable.rows.size(); i++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i);
            for (int i2 = 0; i2 < pagetablerow.cells.size(); i2++) {
                if (!ajb.g(pagetablerow.cells.get(i2)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void T2(ArrayList arrayList, ArrayList arrayList2, Map map) {
        TL_iv.RichText richText;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                        if (pageblockdetails.title == null) {
                            pageblockdetails.title = new TL_iv.textEmpty();
                        }
                        arrayList.add(new mk0(pageblockdetails, 0, 0));
                        int size2 = arrayList.size();
                        T2(arrayList, pageblockdetails.blocks, map);
                        if (arrayList.size() == size2) {
                            arrayList.add(new mk0(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                        mk0 mk0Var = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                        mk0Var.i = true;
                        arrayList.add(mk0Var);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a = mf9.a();
                        T2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((mk0) arrayList.get(size3)).k.add(0, Long.valueOf(a));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a), pageblockblockquoteblocks.caption);
                        }
                    } else {
                        arrayList.add(new mk0(pageBlock, 0, 0));
                    }
                } else {
                    L2(arrayList, pageBlock, 1);
                }
            }
        }
    }

    public static FrameLayout T4(xl9 xl9Var, boolean z) {
        int i;
        am9 m;
        ajb model = xl9Var.getModel();
        if (model != null) {
            int i2 = Integer.MAX_VALUE;
            if (z) {
                i = -1;
            } else {
                i = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : xl9Var.getSelectedCells()) {
                int a = model.a(pagetablecell2);
                int o = z ? (ajb.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z ? o < i || (o == i && a < i2) : o > i || (o == i && a < i2)) {
                    pagetablecell = pagetablecell2;
                    i2 = a;
                    i = o;
                }
            }
            if (pagetablecell != null && (m = xl9Var.getGrid().m(pagetablecell)) != null) {
                return m;
            }
        }
        return xl9Var;
    }

    public static ArrayList U2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        T2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static ArrayList d3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static int[] f5(xl9 xl9Var) {
        int i;
        int i2;
        ajb ajbVar = xl9Var.G;
        if (ajbVar != null) {
            i = ajbVar.g.size();
        } else {
            i = 0;
        }
        while (i >= 0) {
            dg9 n = xl9Var.n(i);
            if (n != null) {
                i2 = n.length();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                return new int[]{i, i2};
            }
            i--;
        }
        return null;
    }

    public static boolean i3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !A3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static boolean i4(dg9 dg9Var, float f, float f2) {
        int[] iArr;
        if (dg9Var != null && dg9Var.getVisibility() == 0) {
            dg9Var.getLocationOnScreen(new int[2]);
            float f3 = f - iArr[0];
            float f4 = f2 - iArr[1];
            if (f3 >= 0.0f && f4 >= 0.0f && f3 <= dg9Var.getWidth() && f4 <= dg9Var.getHeight()) {
                int offsetForPosition = dg9Var.getOffsetForPosition(f3, f4);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                dg9Var.P();
                dg9Var.setSelection(Math.max(0, Math.min(offsetForPosition, dg9Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int m4(int i, mk0 mk0Var, boolean z) {
        int i2;
        if (mk0Var == null) {
            return hl.L(2.0f);
        }
        if (z) {
            i2 = mk0Var.l;
        } else {
            i2 = mk0Var.m;
        }
        int size = mk0Var.k.size() - i2;
        return uh9.y(16.0f, Math.max(0, i - size), hl.L(2.0f));
    }

    public static int n4(mk0 mk0Var, mk0 mk0Var2) {
        ArrayList arrayList = mk0Var.k;
        int i = 0;
        if (mk0Var2 == null) {
            return 0;
        }
        ArrayList arrayList2 = mk0Var2.k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i < min && ((Long) arrayList.get(i)).equals(arrayList2.get(i))) {
            i++;
        }
        return i;
    }

    public static boolean s3(int i) {
        if (i != 21 && i != 22 && i != 19 && i != 20) {
            return false;
        }
        return true;
    }

    public void setEditTextsLocked(boolean z) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof km9) {
                ((km9) childAt).setLocked(z);
            } else if (childAt instanceof xl9) {
                ((xl9) childAt).setLocked(z);
            } else if (childAt instanceof jf9) {
                ((jf9) childAt).getCaptionEditText().setLocked(z);
            } else if (childAt instanceof rf9) {
                ((rf9) childAt).setLocked(z);
            } else if (childAt instanceof vf9) {
                childAt.invalidate();
            }
        }
    }

    public static int t2(int i) {
        if (i == 4) {
            return 114971;
        }
        if (i == 16384) {
            return 32772;
        }
        if (i != 32768) {
            return 4;
        }
        return 16388;
    }

    public static boolean u3(mk0 mk0Var) {
        if (mk0Var != null && (mk0Var.b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean w3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || B3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !km9.y(pageBlock).isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean x3(TL_iv.PageBlock pageBlock) {
        if (!B3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean y3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public final mk0 A2() {
        int i;
        mk0 B4;
        mk0 N2 = N2();
        if (N2 != null) {
            return N2;
        }
        di9 di9Var = this.v3;
        if (di9Var != null && (i = di9Var.p0) >= 0 && (B4 = B4(i)) != null) {
            return B4;
        }
        return null;
    }

    public final void A4() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ze9) {
                ze9 ze9Var = (ze9) childAt;
                ze9Var.b.a(ze9Var.a, new ye9(ze9Var, (byte) 0));
            }
        }
        invalidate();
    }

    public final void B2() {
        ArrayList arrayList;
        di9 di9Var = this.v3;
        int i = di9Var.p0;
        int i2 = di9Var.r0;
        int i3 = di9Var.s0;
        if (!T1(i, i2, i3, di9Var.u0, new String[]{""})) {
            if (i > i3) {
                i3 = i;
                i = i3;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i);
            while (true) {
                arrayList = this.t3;
                if (max > i3) {
                    break;
                }
                ArrayList arrayList3 = this.x4;
                if (max >= arrayList3.size()) {
                    break;
                }
                mk0 mk0Var = (mk0) arrayList3.get(max);
                if (mk0Var.t == 0 && arrayList.indexOf(mk0Var) >= 0) {
                    arrayList2.add(mk0Var);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                ch9 ch9Var = this.R3;
                if (ch9Var != null) {
                    ch9Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new mk0(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.u3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        hashSet.addAll(((mk0) arrayList.get(i4)).k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                u2();
                T3();
                u4();
                di9Var.e(false);
                this.g3.O(false);
                ch9 ch9Var2 = this.R3;
                if (ch9Var2 != null) {
                    ch9Var2.h();
                }
                post(new jh9(this, (mk0) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), (byte) 0));
            }
        }
    }

    public final mk0 B4(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.x4;
            if (i < arrayList.size()) {
                return (mk0) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    public final boolean C2() {
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            di9Var.e(false);
            return true;
        } else if (this.q4 == null) {
            return false;
        } else {
            J2();
            return true;
        }
    }

    public final void C4() {
        ArrayList arrayList = this.t3;
        arrayList.clear();
        arrayList.add(new mk0(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new mk0(new TL_iv.pageBlockParagraph(), 0, 0));
        this.g3.O(false);
    }

    public final void D2() {
        di9 di9Var = this.v3;
        if (di9Var != null) {
            di9Var.e(true);
        }
        J2();
        k3();
        IdentityHashMap identityHashMap = this.h4;
        for (sj9 sj9Var : identityHashMap.values()) {
            sj9Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.i4;
        for (oj9 oj9Var : identityHashMap2.values()) {
            oj9Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean D3() {
        int i;
        mk0 B4;
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w() && (i = di9Var.p0) == di9Var.s0 && i >= 0 && i < this.x4.size() && di9Var.q0 == 1 && di9Var.t0 == 1 && (B4 = B4(i)) != null && km9.n(B4.b)) {
            return true;
        }
        return false;
    }

    public final View D4(int i) {
        if (i < 0) {
            return null;
        }
        return this.f3.m(i);
    }

    @Override
    public final boolean E1() {
        return this.b4;
    }

    public final int E2(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ArrayList arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (u3((mk0) arrayList.get(i3))) {
                i2++;
            } else if (((mk0) arrayList.get(i3)).i) {
                i2--;
            }
        }
        return i2;
    }

    public final boolean E3(int i, int i2) {
        if (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i2 < arrayList.size() && i <= i2) {
                boolean z = false;
                while (i <= i2) {
                    mk0 mk0Var = (mk0) arrayList.get(i);
                    if (!mk0Var.i && !u3(mk0Var)) {
                        if (!mk0Var.k.isEmpty() || km9.n(mk0Var.b)) {
                            z = true;
                        }
                    }
                    i++;
                }
                return z;
            }
        }
        return false;
    }

    public final int[] E4() {
        int i;
        ArrayList arrayList = this.t3;
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            int indexOf = arrayList.indexOf(B4(di9Var.p0));
            int indexOf2 = arrayList.indexOf(B4(di9Var.s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        mk0 N2 = N2();
        if (N2 != null) {
            i = arrayList.indexOf(N2);
        } else {
            i = -1;
        }
        if (i >= 0) {
            return new int[]{i, i};
        }
        return null;
    }

    public final dg9 F2(int i) {
        if (!u3(B4(i))) {
            return null;
        }
        View D4 = D4(i);
        if (!(D4 instanceof rf9)) {
            return null;
        }
        return ((rf9) D4).getEditText();
    }

    public final boolean F3() {
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            int i = di9Var.p0;
            int i2 = di9Var.s0;
            if (i >= 0 && i2 >= 0 && i2 >= i) {
                boolean z = false;
                while (i <= i2) {
                    mk0 B4 = B4(i);
                    if (B4 != null) {
                        if (z3(B4.b)) {
                            z = true;
                        }
                    }
                    i++;
                }
                return z;
            }
        }
        return false;
    }

    public final boolean F4() {
        int i;
        int i2;
        int i3;
        int i4;
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            if (I3()) {
                int i5 = di9Var.p0;
                int i6 = di9Var.q0;
                int i7 = di9Var.t0;
                int i8 = di9Var.r0;
                int i9 = di9Var.u0;
                for (int i10 = i6; i10 <= i7; i10++) {
                    dg9 R4 = R4(i5, i10);
                    if (R4 != null) {
                        int length = R4.length();
                        if (i10 == i6) {
                            i3 = i8;
                        } else {
                            i3 = 0;
                        }
                        if (i10 == i7) {
                            i4 = i9;
                        } else {
                            i4 = length;
                        }
                        if (i6 == i7) {
                            i3 = Math.min(i8, i9);
                            i4 = Math.max(i8, i9);
                        }
                        if (Math.max(0, Math.min(i3, length)) < Math.max(0, Math.min(i4, length))) {
                            return true;
                        }
                    }
                }
            } else if (v3()) {
                dg9 F2 = F2(di9Var.p0);
                if (F2 != null && Math.max(0, Math.min(Math.min(di9Var.r0, di9Var.u0), F2.length())) < Math.max(0, Math.min(Math.max(di9Var.r0, di9Var.u0), F2.length()))) {
                    return true;
                }
            } else if (t3()) {
                dg9 p2 = p2(di9Var.p0);
                if (p2 != null) {
                    int i11 = di9Var.r0;
                    int i12 = di9Var.u0;
                    if (Math.max(0, Math.min(Math.min(i11, i12), p2.length())) < Math.max(0, Math.min(Math.max(i11, i12), p2.length()))) {
                        return true;
                    }
                }
            } else {
                boolean D3 = D3();
                int i13 = di9Var.p0;
                if (D3) {
                    dg9 l4 = l4(i13);
                    if (l4 != null) {
                        int i14 = di9Var.r0;
                        int i15 = di9Var.u0;
                        if (Math.max(0, Math.min(Math.min(i14, i15), l4.length())) < Math.max(0, Math.min(Math.max(i14, i15), l4.length()))) {
                            return true;
                        }
                    }
                } else {
                    int i16 = di9Var.s0;
                    int i17 = di9Var.r0;
                    int i18 = di9Var.u0;
                    if (i13 >= 0 && i16 >= 0 && i16 >= i13 && i16 < this.x4.size()) {
                        for (int i19 = i13; i19 <= i16; i19++) {
                            mk0 B4 = B4(i19);
                            if (B4 != null) {
                                if (B4.t == 0) {
                                    TL_iv.PageBlock pageBlock = B4.b;
                                    if (!x3(pageBlock)) {
                                        continue;
                                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                        continue;
                                    }
                                }
                                int e2 = e2(i19);
                                if (i19 == i13) {
                                    i = i17;
                                } else {
                                    i = 0;
                                }
                                if (i19 == i16) {
                                    i2 = i18;
                                } else {
                                    i2 = e2;
                                }
                                if (Math.max(0, Math.min(i, e2)) < Math.max(0, Math.min(i2, e2))) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void G1() {
        ni9 ni9Var = this.p3;
        if (ni9Var != null) {
            ni9Var.u();
        }
    }

    public final boolean G3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.G3(int, int, int, int, int):boolean");
    }

    public final int[] G4() {
        di9 di9Var = this.v3;
        if (di9Var != null) {
            int i = di9Var.p0;
            int i2 = di9Var.s0;
            if (i >= 0 && i2 >= 0) {
                mk0 B4 = B4(i);
                mk0 B42 = B4(i2);
                if (B4 != null && B42 != null) {
                    ArrayList arrayList = this.t3;
                    int indexOf = arrayList.indexOf(B4);
                    int indexOf2 = arrayList.indexOf(B42);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        if (indexOf > indexOf2) {
                            indexOf = indexOf2;
                            indexOf2 = indexOf;
                        }
                        return new int[]{indexOf, indexOf2};
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void H1() {
        ni9 ni9Var = this.p3;
        if (ni9Var != null) {
            ni9Var.L();
        }
        A4();
    }

    public final boolean H3(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        boolean z = false;
        for (int i9 = i3; i9 <= i5; i9++) {
            dg9 R4 = R4(i2, i9);
            if (R4 != null) {
                int length = R4.length();
                if (i9 == i3) {
                    i7 = i4;
                } else {
                    i7 = 0;
                }
                if (i9 == i5) {
                    i8 = i6;
                } else {
                    i8 = length;
                }
                if (i3 == i5) {
                    i7 = Math.min(i4, i6);
                    i8 = Math.max(i4, i6);
                }
                int max = Math.max(0, Math.min(i7, length));
                int max2 = Math.max(0, Math.min(i8, length));
                if (max >= max2) {
                    continue;
                } else if ((R4.c(max, max2) & i) == 0) {
                    return false;
                } else {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void H4(dg9 dg9Var) {
        dg9Var.d2 = this.r3;
        dg9Var.D(new m72(this, (byte) 4));
    }

    @Override
    public final void I1(f89 f89Var) {
        ni9 ni9Var = this.p3;
        if (ni9Var != null && f89Var != null) {
            View view = f89Var.a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.b4 = ni9Var.a(view.getHeight() + iArr[1]);
        }
    }

    public final boolean I3() {
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            int i = di9Var.p0;
            int i2 = di9Var.s0;
            mk0 B4 = B4(i);
            if (i == i2 && B4 != null && (B4.b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void I4(defpackage.xl9 r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.I4(xl9):void");
    }

    @Override
    public final void J1(f89 f89Var) {
        mk0 mk0Var = this.a4;
        this.a4 = null;
        this.b4 = false;
        if (mk0Var != null) {
            ch9 ch9Var = this.R3;
            if (ch9Var != null) {
                ch9Var.d();
            }
            t4(mk0Var);
            ch9 ch9Var2 = this.R3;
            if (ch9Var2 != null) {
                ch9Var2.h();
            }
            ni9 ni9Var = this.p3;
            if (ni9Var != null) {
                ni9Var.onContentChanged();
            }
        } else if (f89Var != null) {
            View view = f89Var.a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final void J2() {
        if (this.J3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.J3 = false;
        this.K3 = false;
        this.L3 = null;
        this.M3 = null;
        fu5 fu5Var = this.r4;
        if (fu5Var != null) {
            this.r4 = null;
            fu5Var.u();
        }
        xl9 xl9Var = this.q4;
        if (xl9Var != null) {
            LinkedHashSet linkedHashSet = xl9Var.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                xl9Var.w.invalidate();
                xl9Var.v();
            }
            this.q4 = null;
        }
        this.t4 = -1;
        this.s4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean J3() {
        hr hrVar = uc7.s1(this.n3).k4;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            i2 += O3((mk0) arrayList.get(i)).size();
            i++;
        }
        ArrayList W2 = W2();
        ?? obj = new Object();
        obj.d = i2;
        obj.b = W2.size() + obj.b;
        for (int i3 = 0; i3 < W2.size(); i3++) {
            dh9.b((TL_iv.PageBlock) W2.get(i3), 1, obj);
        }
        if (obj.a > hrVar.g0.f() || obj.b > hrVar.h0.f() || obj.c > hrVar.i0.f() || obj.d > hrVar.j0.f() || obj.e > hrVar.k0.f()) {
            return false;
        }
        return true;
    }

    public final km9 J4() {
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            int i = di9Var.p0;
            int i2 = di9Var.s0;
            mk0 B4 = B4(i);
            if (i == i2 && B4 != null && x3(B4.b)) {
                return r2(i);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void K1(f89 f89Var) {
        int b;
        b8c G;
        mk0 mk0Var = null;
        if (f89Var != null && (b = f89Var.b()) >= 0 && (G = this.g3.G(b)) != null) {
            Object obj = G.H;
            if (obj instanceof mk0) {
                mk0Var = (mk0) obj;
            }
        }
        this.a4 = mk0Var;
        this.b4 = false;
        ni9 ni9Var = this.p3;
        if (ni9Var != null) {
            ni9Var.h();
        }
    }

    public final Editable K4(int i, int i2, int i3, int i4) {
        if (i == i3) {
            if (u3(B4(i))) {
                dg9 F2 = F2(i);
                if (F2 != null) {
                    return F2.getText();
                }
                return null;
            } else if (D3()) {
                dg9 l4 = l4(i);
                if (l4 != null) {
                    return l4.getText();
                }
                return null;
            } else {
                mk0 B4 = B4(i);
                if (B4 != null && x3(B4.b)) {
                    int e2 = e2(i);
                    if (uh9.g(i2, i4, e2, 0) < qu6.A(i2, i4, e2, 0)) {
                        km9 r2 = r2(i);
                        if (r2 != null) {
                            return r2.getEditText().getText();
                        }
                        return km9.z(B4.b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock L4(defpackage.mk0 r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.L4(mk0, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final dg9 M2() {
        View findFocus = findFocus();
        if (findFocus instanceof dg9) {
            return (dg9) findFocus;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof km9) {
                return ((km9) childAt).getEditText();
            }
        }
        return null;
    }

    public final int[] M3(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = this.V3.size();
            ArrayList arrayList = this.V3;
            if (i2 < size) {
                int length = km9.y(((mk0) arrayList.get(i2)).b).length();
                if (i <= i3 + length) {
                    return new int[]{i2, i - i3};
                }
                i3 += length + 1;
                i2++;
            } else {
                int size2 = arrayList.size() - 1;
                return new int[]{size2, km9.y(((mk0) this.V3.get(size2)).b).length()};
            }
        }
    }

    public final boolean M4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.M4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean N1(mk0 mk0Var, mk0 mk0Var2, int i) {
        float f;
        if (x3(mk0Var.b)) {
            TL_iv.PageBlock pageBlock = mk0Var2.b;
            ArrayList arrayList = mk0Var2.k;
            if (x3(pageBlock)) {
                View D1 = D1(mk0Var2);
                if (D1 instanceof km9) {
                    dg9 editText = ((km9) D1).getEditText();
                    if (editText.isFocused()) {
                        SpannableStringBuilder z = km9.z(mk0Var.b);
                        Paint.FontMetricsInt fontMetricsInt = editText.getPaint().getFontMetricsInt();
                        if (z3(mk0Var.b)) {
                            f = 0.85f;
                        } else {
                            f = 1.0f;
                        }
                        CharSequence n = pv3.n(z, fontMetricsInt, false, null, 0, f, 0);
                        int length = n.length();
                        Editable text = editText.getText();
                        if (text != null && n.length() != 0) {
                            editText.j2 = true;
                            text.insert(0, n);
                            editText.j2 = false;
                        }
                        km9.b(mk0Var.b, editText.getText());
                        mk0Var2.b = mk0Var.b;
                        mk0Var2.c = mk0Var.c;
                        mk0Var2.d = mk0Var.d;
                        mk0Var2.e = mk0Var.e;
                        mk0Var2.f = mk0Var.f;
                        arrayList.clear();
                        arrayList.addAll(mk0Var.k);
                        this.t3.remove(i - 1);
                        u2();
                        u4();
                        d5();
                        editText.setSelection(Math.min(length, editText.length()));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final mk0 N2() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof km9) {
                km9 km9Var = (km9) childAt;
                if (km9Var.getEditText().isFocused() || (km9Var.l() && km9Var.h.isFocused())) {
                    return km9Var.getRow();
                }
            }
        }
        return null;
    }

    public final int N3(int i) {
        int i2 = 1;
        int i3 = i + 1;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i3 < arrayList.size()) {
                mk0 mk0Var = (mk0) arrayList.get(i3);
                if (u3(mk0Var)) {
                    i2++;
                } else if (mk0Var.i && i2 - 1 == 0) {
                    return i3;
                }
                i3++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final void N4(View view) {
        f89 U;
        int b;
        if (view != null && this.h3 != null && this.k3 && (U = U(view)) != null && (b = U.b()) >= 0 && this.g3.H(b) >= 0) {
            this.I3 = true;
            di9 di9Var = this.v3;
            if (di9Var.w()) {
                di9Var.e(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.h3.s(U);
        }
    }

    public final void O1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.O1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final xl9 O2() {
        View findFocus = findFocus();
        if (findFocus instanceof dg9) {
            return R2((dg9) findFocus);
        }
        return null;
    }

    public final void O4(mk0 mk0Var, p07 p07Var, no6 no6Var) {
        float f;
        sj9 sj9Var = (sj9) this.h4.remove(p07Var);
        if (sj9Var != null) {
            sj9Var.b();
        }
        IdentityHashMap identityHashMap = this.i4;
        oj9 oj9Var = (oj9) identityHashMap.remove(p07Var);
        if (oj9Var != null) {
            oj9Var.a();
        }
        p07Var.a = (byte) 1;
        p07Var.f = 0.0f;
        oj9 oj9Var2 = new oj9(this.n3, no6Var, new pm3((ViewGroup) this, (Object) p07Var, (Object) mk0Var, (byte) 28));
        identityHashMap.put(p07Var, oj9Var2);
        if (!oj9Var2.f && !oj9Var2.h && !oj9Var2.n) {
            oj9Var2.f = true;
            int i = no6Var.F;
            String str = no6Var.I;
            int i2 = no6Var.G;
            if (i <= 0 || i2 <= 0) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str, options);
                    i = options.outWidth;
                    i2 = options.outHeight;
                } catch (Exception unused) {
                }
            }
            oec oecVar = null;
            r9 = null;
            ArrayList arrayList = null;
            oecVar = null;
            if (i > 0 && i2 > 0) {
                int i3 = no6Var.J;
                if (i3 == 90 || i3 == 270) {
                    int i4 = i2;
                    i2 = i;
                    i = i4;
                }
                oec oecVar2 = new oec();
                oecVar2.a = 0L;
                oecVar2.d = 0.0f;
                long j = 3000;
                oecVar2.b = Math.min(3000L, no6Var.t);
                while (true) {
                    long j2 = oecVar2.b;
                    if (j2 > 0) {
                        if (j2 < 1000) {
                            oecVar2.b = j2 << 1;
                        } else {
                            j = j2;
                            break;
                        }
                    } else {
                        oecVar2.b = 3000L;
                        break;
                    }
                }
                oecVar2.e = (float) j;
                oecVar2.f = 1;
                oecVar2.g = 0;
                oecVar2.o = str;
                oecVar2.q = (int) ((f / 1000.0f) * 115200.0f);
                oecVar2.r = j;
                oecVar2.n = 30;
                oecVar2.v = j;
                oecVar2.A = no6Var.o;
                String str2 = no6Var.k;
                if (str2 != null) {
                    oecVar2.B = str2;
                    ArrayList arrayList2 = no6Var.q;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList = no6Var.q;
                    }
                    oecVar2.G = arrayList;
                } else {
                    oecVar2.B = no6Var.j;
                    oecVar2.G = no6Var.p;
                }
                oecVar2.I = true;
                fo6 fo6Var = no6Var.A;
                if (fo6Var != null) {
                    int i5 = fo6Var.k;
                    if (i5 == 90 || i5 == 270) {
                        int i6 = i2;
                        i2 = i;
                        i = i6;
                    }
                    i = (int) (i * fo6Var.e);
                    i2 = (int) (i2 * fo6Var.f);
                }
                float f2 = i;
                float f3 = i2;
                float max = Math.max(f2 / 854.0f, f3 / 854.0f);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                int i7 = (int) (f2 / max);
                int i8 = (int) (f3 / max);
                if (i7 % 16 != 0) {
                    i7 = Math.max(1, Math.round(i7 / 16.0f)) << 4;
                }
                if (i8 % 16 != 0) {
                    i8 = Math.max(1, Math.round(i8 / 16.0f)) << 4;
                }
                oecVar2.k = i7;
                oecVar2.h = i7;
                oecVar2.l = i8;
                oecVar2.i = i8;
                oecVar2.m = -1;
                oecVar2.t = true;
                oecVar2.c = 0L;
                oecVar = oecVar2;
            }
            oj9Var2.d = oecVar;
            if (oecVar != null && oecVar.b()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 1;
                String absolutePath = new File(xb4.z(4), "rich_anim_" + xea.p() + ".mp4").getAbsolutePath();
                oj9Var2.e = absolutePath;
                tL_message.attachPath = absolutePath;
                r47 r47Var = new r47(oj9Var2.a, tL_message, null, false, false);
                oj9Var2.c = r47Var;
                r47Var.r0 = oj9Var2.d;
                jn7 f4 = jn7.f(oj9Var2.a);
                f4.a(oj9Var2, jn7.a2);
                f4.a(oj9Var2, jn7.b2);
                f4.a(oj9Var2, jn7.c2);
                MediaController.z().j0(oj9Var2.c, false, false, false);
                return;
            }
            oj9Var2.b();
        }
    }

    public final TLRPC.Document P2(long j) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        TLRPC.Document document2 = null;
        if (i == 0) {
            return null;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.t3.size(); i3++) {
            for (p07 p07Var : O3((mk0) this.t3.get(i3))) {
                if (p07Var != null && (document = p07Var.h) != null && document.id == j) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.s3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i2 < size) {
                TLRPC.Document document3 = arrayList.get(i2);
                i2++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.id == j) {
                    return document4;
                }
            }
        }
        HashMap hashMap = nj9.a;
        synchronized (nj9.class) {
            if (i != 0) {
                document2 = (TLRPC.Document) nj9.b.get(Long.valueOf(j));
            }
        }
        return document2;
    }

    public final void P4(mk0 mk0Var, p07 p07Var, String str, boolean z, int i, int i2, int i3) {
        IdentityHashMap identityHashMap = this.h4;
        sj9 sj9Var = (sj9) identityHashMap.remove(p07Var);
        if (sj9Var != null) {
            sj9Var.b();
        }
        sj9 sj9Var2 = new sj9(this.n3, str, z, i, i2, i3, new ci9(this, p07Var, mk0Var));
        identityHashMap.put(p07Var, sj9Var2);
        sj9Var2.d();
    }

    public final void Q1(mk0 mk0Var, no6 no6Var) {
        TL_iv.PageBlock pageblockvideo;
        pi9 pi9Var;
        if (mk0Var != null && A3(mk0Var.b)) {
            String str = no6Var.h;
            if (str == null) {
                str = no6Var.I;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                ch9 ch9Var = this.R3;
                if (ch9Var != null) {
                    ch9Var.d();
                }
                p07 R3 = R3(no6Var, str2);
                boolean c = oj9.c(no6Var);
                if (!no6Var.b && !c) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (y3(mk0Var.b)) {
                    d3(mk0Var.b).add(pageblockvideo);
                    ArrayList arrayList = mk0Var.h;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        mk0Var.h = arrayList;
                    }
                    arrayList.add(R3);
                } else {
                    p07 p07Var = mk0Var.g;
                    if (p07Var != null && p07Var.a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = mk0Var.b.caption;
                        if9.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
                        pageblockcollage.items = arrayList2;
                        arrayList2.add(mk0Var.b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList3 = new ArrayList();
                        mk0Var.h = arrayList3;
                        arrayList3.add(mk0Var.g);
                        mk0Var.h.add(R3);
                        mk0Var.g = null;
                        mk0Var.b = pageblockcollage;
                    } else {
                        mk0Var.b = pageblockvideo;
                        mk0Var.g = R3;
                    }
                }
                this.g3.O(false);
                p4(mk0Var);
                if (c) {
                    O4(mk0Var, R3, no6Var);
                    pi9Var = this;
                } else {
                    pi9Var = this;
                    pi9Var.P4(mk0Var, R3, str2, no6Var.b, no6Var.F, no6Var.G, no6Var.E);
                }
                ch9 ch9Var2 = pi9Var.R3;
                if (ch9Var2 != null) {
                    ch9Var2.h();
                }
                pi9Var.p3.onContentChanged();
            }
        }
    }

    public final int Q2(int i, int i2) {
        while (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            mk0 mk0Var = (mk0) arrayList.get(i);
            if (!mk0Var.i) {
                int i3 = -1;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    mk0 mk0Var2 = (mk0) arrayList.get(i5);
                    if (u3(mk0Var2)) {
                        i4++;
                        if (i3 == -1 && !((TL_iv.pageBlockDetails) mk0Var2.b).open) {
                            i3 = i4;
                        }
                    } else if (mk0Var2.i) {
                        if (i3 != -1 && i4 == i3) {
                            i3 = -1;
                        }
                        i4--;
                    }
                }
                if (i3 == -1) {
                    TL_iv.PageBlock pageBlock = mk0Var.b;
                    if (!B3(pageBlock) || i3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i;
                    }
                } else {
                    continue;
                }
            }
            i += i2;
        }
        return -1;
    }

    public final Editable Q4(mk0 mk0Var) {
        View D1 = D1(mk0Var);
        if (D1 instanceof km9) {
            return ((km9) D1).getEditText().getText();
        }
        return km9.z(mk0Var.b);
    }

    public final void R1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            ch9 ch9Var = this.R3;
            if (ch9Var != null) {
                ch9Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.s3;
            if (richMessage2 == null) {
                this.s3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.s3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            T2(arrayList4, richMessage.blocks, this.u3);
            if (!arrayList4.isEmpty()) {
                for (int i = 0; i < arrayList4.size(); i++) {
                    x4((mk0) arrayList4.get(i));
                }
                ArrayList arrayList5 = this.t3;
                int size = arrayList5.size();
                mk0 N2 = N2();
                if (N2 != null && (indexOf = arrayList5.indexOf(N2)) >= 0) {
                    TL_iv.PageBlock pageBlock = N2.b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && km9.y(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                T3();
                u4();
                this.g3.O(false);
                ch9 ch9Var2 = this.R3;
                if (ch9Var2 != null) {
                    ch9Var2.h();
                }
                ni9 ni9Var = this.p3;
                if (ni9Var != null) {
                    ni9Var.onContentChanged();
                }
            }
        }
    }

    public final dg9 R4(int i, int i2) {
        View D4 = D4(i);
        if (!(D4 instanceof xl9)) {
            return null;
        }
        return ((xl9) D4).n(i2);
    }

    public final mk0 S1(mk0 mk0Var, int i) {
        int i2;
        ArrayList arrayList = this.x4;
        int indexOf = arrayList.indexOf(mk0Var);
        if (indexOf >= 0 && (i2 = indexOf + i) >= 0 && i2 < arrayList.size()) {
            mk0 mk0Var2 = (mk0) arrayList.get(i2);
            if (mk0Var2.t != 0) {
                return mk0Var2;
            }
            return null;
        }
        return null;
    }

    public final void S2() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof km9) {
                km9 km9Var = (km9) childAt;
                km9Var.f.K();
                km9Var.h.K();
            } else if (childAt instanceof jf9) {
                ((jf9) childAt).getCaptionEditText().K();
            } else if (childAt instanceof rf9) {
                ((rf9) childAt).getEditText().K();
            }
        }
    }

    public final mk0 S3(int i, int i2) {
        while (i >= 0) {
            ArrayList arrayList = this.x4;
            if (i < arrayList.size()) {
                mk0 mk0Var = (mk0) arrayList.get(i);
                if (!mk0Var.i) {
                    if (mk0Var.t == 0) {
                        TL_iv.PageBlock pageBlock = mk0Var.b;
                        if (B3(pageBlock) && !i3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    return mk0Var;
                }
                i += i2;
            } else {
                return null;
            }
        }
        return null;
    }

    public final boolean T1(int r22, int r23, int r24, int r25, java.lang.String[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.T1(int, int, int, int, java.lang.String[]):boolean");
    }

    public final void T3() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size()) {
                mk0 mk0Var = (mk0) arrayList.get(i);
                if (!mk0Var.k.isEmpty() && km9.n(mk0Var.b)) {
                    long a = mf9.a();
                    TL_iv.RichText h = km9.h(mk0Var.b);
                    if (h != null && !(h instanceof TL_iv.textEmpty)) {
                        this.u3.put(Long.valueOf(a), h);
                    }
                    mk0Var.k.add(Long.valueOf(a));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = mk0Var.b.text;
                    mk0Var.b = pageblockparagraph;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void U1() {
        km9 km9Var;
        mk0 mk0Var;
        hm9 hm9Var;
        this.g3.T();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof km9) && (mk0Var = (km9Var = (km9) childAt).y) != null && (hm9Var = km9Var.E) != null) {
                km9Var.d(mk0Var, hm9Var, km9Var.F);
            }
        }
    }

    public final void U3(mk0 mk0Var) {
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(mk0Var);
        if (indexOf < 0) {
            return;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        mk0 mk0Var2 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
        mk0Var2.k.addAll(mk0Var.k);
        arrayList.add(indexOf + 1, mk0Var2);
        u4();
        this.g3.O(false);
        ch9 ch9Var2 = this.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        post(new jh9(this, mk0Var2, (byte) 24));
    }

    public final void U4() {
        boolean z;
        int[] E4 = E4();
        if (E4 != null) {
            int i = E4[0];
            int i2 = E4[1];
            if (i >= 0) {
                ArrayList arrayList = this.t3;
                if (i2 < arrayList.size() && i <= i2) {
                    ch9 ch9Var = this.R3;
                    if (ch9Var != null) {
                        ch9Var.d();
                    }
                    if (E3(i, i2)) {
                        for (int i3 = i; i3 <= i2; i3++) {
                            mk0 mk0Var = (mk0) arrayList.get(i3);
                            boolean z2 = mk0Var.i;
                            ArrayList arrayList2 = mk0Var.k;
                            if (!z2 && !u3(mk0Var)) {
                                if (km9.n(mk0Var.b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = mk0Var.b.text;
                                    mk0Var.b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    qd4.v(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a = mf9.a();
                        for (int i4 = i; i4 <= i2; i4++) {
                            mk0 mk0Var2 = (mk0) arrayList.get(i4);
                            boolean z3 = mk0Var2.i;
                            ArrayList arrayList3 = mk0Var2.k;
                            if (!z3 && !u3(mk0Var2)) {
                                if (km9.n(mk0Var2.b)) {
                                    long a2 = mf9.a();
                                    TL_iv.RichText h = km9.h(mk0Var2.b);
                                    if (h != null && !(h instanceof TL_iv.textEmpty)) {
                                        this.u3.put(Long.valueOf(a2), h);
                                    }
                                    arrayList3.add(Long.valueOf(a2));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = mk0Var2.b.text;
                                    mk0Var2.b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a));
                            }
                        }
                    }
                    u2();
                    T3();
                    u4();
                    di9 di9Var = this.v3;
                    if (di9Var != null && di9Var.w()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mk0 mk0Var3 = (mk0) arrayList.get(Math.max(0, Math.min(i, arrayList.size() - 1)));
                    mk0 mk0Var4 = (mk0) arrayList.get(Math.max(0, Math.min(i2, arrayList.size() - 1)));
                    this.g3.O(false);
                    ch9 ch9Var2 = this.R3;
                    if (ch9Var2 != null) {
                        ch9Var2.h();
                    }
                    if (z) {
                        post(new sa8(this, mk0Var3, mk0Var4, (byte) 21));
                    } else {
                        post(new jh9(this, mk0Var3, (byte) 16));
                    }
                }
            }
        }
    }

    public final boolean V1(int i, int i2) {
        di9 di9Var;
        ArrayList arrayList = this.V3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i, i2));
            int max2 = Math.max(0, Math.max(i, i2));
            int[] M3 = M3(max);
            int[] M32 = M3(max2);
            mk0 mk0Var = (mk0) this.V3.get(M3[0]);
            if (M3[0] != M32[0] && max != max2) {
                View D1 = D1(mk0Var);
                View D12 = D1(this.V3.get(M32[0]));
                if ((D1 instanceof km9) && (D12 instanceof km9)) {
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.t3;
                        int size = arrayList2.size();
                        di9Var = this.v3;
                        if (i3 >= size) {
                            break;
                        }
                        di9Var.W(i3, km9.y(((mk0) arrayList2.get(i3)).b));
                        i3++;
                    }
                    km9 km9Var = (km9) D1;
                    int length = km9Var.getEditText().length();
                    if (M3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!di9Var.i0(km9Var, 0, M3[1], length)) {
                        km9Var.A();
                        return true;
                    }
                    di9Var.a0(0, M32[1], (km9) D12);
                    return true;
                }
            } else {
                View D13 = D1(mk0Var);
                if (D13 instanceof km9) {
                    km9 km9Var2 = (km9) D13;
                    km9Var2.A();
                    dg9 editText = km9Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(M3[1], length2), Math.min(M32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList V2(int i, int i2, int i3, boolean z) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z2;
        pi9 pi9Var;
        int i4;
        int i5;
        pi9 pi9Var2;
        ArrayList arrayList = new ArrayList();
        int i6 = i;
        while (i6 < i2) {
            ArrayList arrayList2 = this.t3;
            mk0 mk0Var = (mk0) arrayList2.get(i6);
            boolean z3 = mk0Var.i;
            ArrayList arrayList3 = mk0Var.k;
            if (z3) {
                i6++;
            } else if (arrayList3.size() > i3) {
                Long l = (Long) arrayList3.get(i3);
                long longValue = l.longValue();
                int i7 = i6 + 1;
                while (i7 < i2) {
                    mk0 mk0Var2 = (mk0) arrayList2.get(i7);
                    if (mk0Var2.k.size() <= i3 || ((Long) mk0Var2.k.get(i3)).longValue() != longValue) {
                        break;
                    }
                    i7++;
                }
                ArrayList<TL_iv.PageBlock> V2 = this.V2(i6, i7, i3 + 1, true);
                if (V2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.u3.get(l);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (V2.size() == 1 && (V2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        if (V2.get(0).text != null) {
                            textempty = V2.get(0).text;
                        } else {
                            textempty = new TL_iv.textEmpty();
                        }
                        pageblockblockquote.text = textempty;
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = V2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i6 = i7;
            } else if (u3(mk0Var)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) mk0Var.b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int N3 = this.N3(i6);
                pageblockdetails.blocks = this.V2(i6 + 1, Math.min(N3, i2), i3, true);
                arrayList.add(pageblockdetails);
                i6 = N3 + 1;
            } else {
                int i8 = mk0Var.c;
                if (i8 <= 0) {
                    G2(mk0Var, arrayList);
                    i6++;
                    i4 = i2;
                    i5 = i3;
                    pi9Var2 = this;
                } else {
                    int[] iArr = {i6};
                    if (mk0Var.d > 0) {
                        z2 = true;
                        i4 = i2;
                        i5 = i3;
                        pi9Var = this;
                    } else {
                        z2 = false;
                        pi9Var = this;
                        i4 = i2;
                        i5 = i3;
                    }
                    TL_iv.PageBlock g2 = pi9Var.g2(i6, i8, i4, i5, z2, iArr);
                    pi9Var2 = pi9Var;
                    if (g2 != null) {
                        arrayList.add(g2);
                    }
                    int i9 = iArr[0];
                    if (i9 <= 0) {
                        i6 = i4;
                    } else {
                        i6 = i9;
                    }
                }
                this = pi9Var2;
                i2 = i4;
                i3 = i5;
            }
        }
        if (!z) {
            while (!arrayList.isEmpty() && w3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && w3((TL_iv.PageBlock) c00.g(1, arrayList))) {
                qd4.v(1, arrayList);
            }
        }
        return arrayList;
    }

    public final boolean V3(defpackage.mk0 r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.V3(mk0, boolean):boolean");
    }

    public final void V4(defpackage.mk0 r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.V4(mk0, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final void W1() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            ArrayList arrayList6 = this.t3;
            if (i8 < arrayList6.size()) {
                mk0 mk0Var = (mk0) arrayList6.get(i8);
                ArrayList arrayList7 = mk0Var.j;
                ArrayList arrayList8 = mk0Var.k;
                arrayList7.clear();
                int i9 = 1;
                if (mk0Var.i) {
                    if (!arrayList.isEmpty()) {
                        qd4.v(1, arrayList);
                    }
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                    i6 = i7;
                } else {
                    for (int i10 = i7; i10 < arrayList8.size(); i10++) {
                        ((Long) arrayList8.get(i10)).getClass();
                        arrayList7.add(new Object());
                    }
                    for (int i11 = i7; i11 < arrayList.size(); i11++) {
                        arrayList7.add((mf9) arrayList.get(i11));
                    }
                    int max = Math.max(i7, mk0Var.c);
                    if (max == 0) {
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    } else {
                        if (mk0Var.d > 0) {
                            i = 1;
                        } else {
                            i = i7;
                        }
                        while (arrayList2.size() > max) {
                            arrayList2.remove(arrayList2.size() - 1);
                            arrayList3.remove(arrayList3.size() - 1);
                            arrayList4.remove(arrayList4.size() - 1);
                            arrayList5.remove(arrayList5.size() - 1);
                        }
                        int i12 = 1;
                        while (i12 <= max) {
                            int i13 = i12 - 1;
                            if (i12 == max) {
                                i3 = i7;
                                i2 = i9;
                            } else {
                                i2 = i7;
                                i3 = i2;
                            }
                            if (i13 < arrayList2.size()) {
                                i4 = i9;
                            } else {
                                i4 = i3;
                            }
                            if (i4 != 0 && i2 != 0) {
                                i5 = i9;
                                if (((Boolean) arrayList3.get(i13)).booleanValue() != i) {
                                    i4 = i3;
                                }
                            } else {
                                i5 = i9;
                            }
                            if (i4 == 0) {
                                while (arrayList2.size() > i13) {
                                    arrayList2.remove(arrayList2.size() - 1);
                                    arrayList3.remove(arrayList3.size() - 1);
                                    arrayList4.remove(arrayList4.size() - 1);
                                    arrayList5.remove(arrayList5.size() - 1);
                                }
                                arrayList2.add(Long.valueOf(mf9.a()));
                                if (i2 != 0) {
                                    z = i;
                                } else {
                                    z = i3;
                                }
                                arrayList3.add(Boolean.valueOf(z));
                                arrayList4.add(Integer.valueOf(i3));
                                arrayList5.add(0L);
                            }
                            ((Long) arrayList2.get(i13)).getClass();
                            if (i2 != 0) {
                                if (((Long) arrayList5.get(i13)).longValue() != 0 && B3(mk0Var.b)) {
                                    ((Integer) arrayList4.get(i13)).getClass();
                                    ((Long) arrayList5.get(i13)).getClass();
                                } else {
                                    arrayList4.set(i13, Integer.valueOf(((Integer) arrayList4.get(i13)).intValue() + 1));
                                    arrayList5.set(i13, Long.valueOf(mk0Var.a));
                                }
                                arrayList7.add(new Object());
                            } else {
                                ((Boolean) arrayList3.get(i13)).getClass();
                                arrayList7.add(new Object());
                            }
                            i12++;
                            i7 = i3;
                            i9 = i5;
                        }
                    }
                    i6 = i7;
                    if (u3(mk0Var)) {
                        boolean z2 = ((TL_iv.pageBlockDetails) mk0Var.b).open;
                        mf9.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (km9.n(mk0Var.b)) {
                        mf9.a();
                        arrayList7.add(new Object());
                    }
                }
                i8++;
                i7 = i6;
            } else {
                return;
            }
        }
    }

    public final ArrayList W2() {
        return V2(0, this.t3.size(), 0, false);
    }

    public final boolean W3(defpackage.mk0 r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.W3(mk0, boolean):boolean");
    }

    public final boolean W4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.W4():boolean");
    }

    public final void X1(r47 r47Var) {
        TLRPC.Document F0;
        String str;
        if (r47Var != null && (F0 = r47Var.F0()) != null) {
            ch9 ch9Var = this.R3;
            if (ch9Var != null) {
                ch9Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z = false;
            mk0 mk0Var = new mk0(pageblockaudio, 0, 0);
            p07 p07Var = new p07();
            mk0Var.g = p07Var;
            p07Var.c = true;
            long j = F0.id;
            if (j == 0 || F0.dc_id == 0 || F0.access_hash == 0) {
                z = true;
            }
            if (z) {
                TLRPC.Message message = r47Var.k;
                if (message != null) {
                    str = message.attachPath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                p07 p07Var2 = mk0Var.g;
                p07Var2.i = F0;
                p07Var2.e = str;
                p07Var2.a = (byte) 1;
                p07Var2.f = 0.0f;
            } else {
                p07Var.h = F0;
                p07Var.i = F0;
                p07Var.a = (byte) 2;
                pageblockaudio.audio_id = j;
            }
            r3(mk0Var);
            if (z) {
                p07 p07Var3 = mk0Var.g;
                String str2 = p07Var3.e;
                IdentityHashMap identityHashMap = this.h4;
                sj9 sj9Var = (sj9) identityHashMap.remove(p07Var3);
                if (sj9Var != null) {
                    sj9Var.b();
                }
                sj9 sj9Var2 = new sj9(this.n3, str2, F0, new bi9(this, p07Var3, mk0Var));
                identityHashMap.put(p07Var3, sj9Var2);
                sj9Var2.d();
            }
            ch9 ch9Var2 = this.R3;
            if (ch9Var2 != null) {
                ch9Var2.h();
            }
            this.p3.onContentChanged();
        }
    }

    public final boolean X2() {
        mk0 mk0Var;
        ArrayList arrayList = this.t3;
        if (arrayList.isEmpty()) {
            mk0Var = null;
        } else {
            mk0Var = (mk0) c00.g(1, arrayList);
        }
        if (mk0Var != null && !B3(mk0Var.b) && !mk0Var.i && !u3(mk0Var) && !H2(mk0Var.b)) {
            if (!(D1(mk0Var) instanceof km9)) {
                return false;
            }
            b3(mk0Var);
            return true;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        mk0 mk0Var2 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(mk0Var2);
        this.g3.O(false);
        ch9 ch9Var2 = this.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        post(new jh9(this, mk0Var2, (byte) 20));
        return true;
    }

    public final void X3() {
        if (this.Q3) {
            return;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.h();
        }
        this.p3.f();
        q4();
    }

    public final boolean X4(android.view.View r10, float r11, float r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.X4(android.view.View, float, float):boolean");
    }

    public final void Y1(String str) {
        String str2;
        int i;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf >= 0 && (i = lastIndexOf + 1) < name.length()) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i).toLowerCase());
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "application/octet-stream";
            }
            tL_document.mime_type = str2;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = name;
            tL_document.attributes.add(tL_documentAttributeFilename);
            Z1(tL_document, str);
        }
    }

    public final void Y2(mk0 mk0Var, boolean z) {
        int i;
        View D1 = D1(mk0Var);
        if (D1 instanceof pl9) {
            dg9 dg9Var = ((pl9) D1).r;
            dg9Var.O();
            if (z) {
                i = dg9Var.length();
            } else {
                i = 0;
            }
            dg9Var.setSelection(i);
            return;
        }
        Z2(mk0Var, z);
    }

    public final void Y3() {
        int length;
        int g;
        int A;
        int length2;
        int g2;
        int A2;
        int length3;
        int g3;
        int A3;
        int length4;
        int g4;
        int A5;
        dg9 R4;
        int length5;
        int g5;
        int A6;
        boolean I3 = I3();
        di9 di9Var = this.v3;
        if (I3) {
            int i = di9Var.p0;
            int i2 = di9Var.q0;
            if (i2 == di9Var.t0 && (R4 = R4(i, i2)) != null && (g5 = uh9.g(di9Var.r0, di9Var.u0, (length5 = R4.length()), 0)) < (A6 = qu6.A(di9Var.r0, di9Var.u0, length5, 0))) {
                ch9 ch9Var = this.R3;
                if (ch9Var != null) {
                    ch9Var.d();
                }
                if (mm9.h(R4.getText(), g5, A6)) {
                    mm9.n(R4.getText(), g5, A6);
                    R4.f();
                    h4(i, i2);
                    ch9 ch9Var2 = this.R3;
                    if (ch9Var2 != null) {
                        ch9Var2.h();
                    }
                    q4();
                }
                R4.V1 = g5;
                R4.W1 = A6;
                R4.C();
            }
        } else if (v3()) {
            int i3 = di9Var.p0;
            dg9 F2 = F2(i3);
            if (F2 != null && (g4 = uh9.g(di9Var.r0, di9Var.u0, (length4 = F2.length()), 0)) < (A5 = qu6.A(di9Var.r0, di9Var.u0, length4, 0))) {
                ch9 ch9Var3 = this.R3;
                if (ch9Var3 != null) {
                    ch9Var3.d();
                }
                if (mm9.h(F2.getText(), g4, A5)) {
                    mm9.n(F2.getText(), g4, A5);
                    F2.f();
                    f4(i3);
                    ch9 ch9Var4 = this.R3;
                    if (ch9Var4 != null) {
                        ch9Var4.h();
                    }
                    q4();
                }
                F2.V1 = g4;
                F2.W1 = A5;
                F2.C();
            }
        } else if (t3()) {
            int i4 = di9Var.p0;
            dg9 p2 = p2(i4);
            if (p2 != null && (g3 = uh9.g(di9Var.r0, di9Var.u0, (length3 = p2.length()), 0)) < (A3 = qu6.A(di9Var.r0, di9Var.u0, length3, 0))) {
                ch9 ch9Var5 = this.R3;
                if (ch9Var5 != null) {
                    ch9Var5.d();
                }
                if (mm9.h(p2.getText(), g3, A3)) {
                    mm9.n(p2.getText(), g3, A3);
                    p2.f();
                    e4(i4);
                    ch9 ch9Var6 = this.R3;
                    if (ch9Var6 != null) {
                        ch9Var6.h();
                    }
                    q4();
                }
                p2.V1 = g3;
                p2.W1 = A3;
                p2.C();
            }
        } else if (D3()) {
            int i5 = di9Var.p0;
            dg9 l4 = l4(i5);
            if (l4 != null && (g2 = uh9.g(di9Var.r0, di9Var.u0, (length2 = l4.length()), 0)) < (A2 = qu6.A(di9Var.r0, di9Var.u0, length2, 0))) {
                ch9 ch9Var7 = this.R3;
                if (ch9Var7 != null) {
                    ch9Var7.d();
                }
                if (mm9.h(l4.getText(), g2, A2)) {
                    mm9.n(l4.getText(), g2, A2);
                    l4.f();
                    g4(i5);
                    ch9 ch9Var8 = this.R3;
                    if (ch9Var8 != null) {
                        ch9Var8.h();
                    }
                    q4();
                }
                l4.V1 = g2;
                l4.W1 = A2;
                l4.C();
            }
        } else {
            km9 J4 = J4();
            if (J4 == null || (g = uh9.g(di9Var.r0, di9Var.u0, (length = J4.getEditText().length()), 0)) >= (A = qu6.A(di9Var.r0, di9Var.u0, length, 0))) {
                return;
            }
            ch9 ch9Var9 = this.R3;
            if (ch9Var9 != null) {
                ch9Var9.d();
            }
            if (mm9.h(J4.getEditText().getText(), g, A)) {
                mm9.n(J4.getEditText().getText(), g, A);
                J4.getEditText().f();
                J4.w();
                ch9 ch9Var10 = this.R3;
                if (ch9Var10 != null) {
                    ch9Var10.h();
                }
                q4();
            }
            dg9 editText = J4.getEditText();
            editText.V1 = g;
            editText.W1 = A;
            J4.getEditText().C();
        }
    }

    public final void Y4(mk0 mk0Var, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        Editable z3;
        if (mk0Var == null) {
            mk0Var = b5();
        }
        mk0 mk0Var2 = mk0Var;
        if (mk0Var2 != null && pageBlock != null) {
            ArrayList arrayList = this.t3;
            if (arrayList.indexOf(mk0Var2) >= 0 && !u3(mk0Var2) && !mk0Var2.i) {
                TL_iv.PageBlock pageBlock2 = mk0Var2.b;
                if (pageBlock != pageBlock2 && x3(pageBlock2) && x3(pageBlock)) {
                    km9 r2 = r2(arrayList.indexOf(mk0Var2));
                    if (r2 != null) {
                        z3 = r2.getEditText().getText();
                    } else {
                        z3 = km9.z(mk0Var2.b);
                    }
                    km9.b(pageBlock, z3);
                    TL_iv.RichText h = km9.h(mk0Var2.b);
                    if (h != null && km9.h(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = h;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = h;
                        }
                    }
                }
                V4(mk0Var2, pageBlock, i, i2, z, z2);
            }
        }
    }

    public final void Z1(TLRPC.Document document, String str) {
        if (document != null) {
            ch9 ch9Var = this.R3;
            if (ch9Var != null) {
                ch9Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z = false;
            mk0 mk0Var = new mk0(pageblockdocument, 0, 0);
            p07 p07Var = new p07();
            mk0Var.g = p07Var;
            p07Var.d = true;
            long j = document.id;
            if (j == 0 || document.dc_id == 0 || document.access_hash == 0) {
                z = true;
            }
            if (z) {
                if (!TextUtils.isEmpty(str) && bp1.t(str)) {
                    p07 p07Var2 = mk0Var.g;
                    p07Var2.h = document;
                    p07Var2.e = str;
                    p07Var2.a = (byte) 1;
                    p07Var2.f = 0.0f;
                } else {
                    return;
                }
            } else {
                p07Var.h = document;
                p07Var.a = (byte) 2;
                pageblockdocument.document_id = j;
            }
            r3(mk0Var);
            if (z) {
                p07 p07Var3 = mk0Var.g;
                IdentityHashMap identityHashMap = this.h4;
                sj9 sj9Var = (sj9) identityHashMap.remove(p07Var3);
                if (sj9Var != null) {
                    sj9Var.b();
                }
                sj9 sj9Var2 = new sj9(this.n3, str, document, new ai9(this, p07Var3, mk0Var, str));
                identityHashMap.put(p07Var3, sj9Var2);
                sj9Var2.d();
            }
            ch9 ch9Var2 = this.R3;
            if (ch9Var2 != null) {
                ch9Var2.h();
            }
            this.p3.onContentChanged();
        }
    }

    public final void Z2(mk0 mk0Var, boolean z) {
        View D1 = D1(mk0Var);
        if (D1 instanceof xl9) {
            xl9 xl9Var = (xl9) D1;
            dg9 dg9Var = xl9Var.r;
            ajb ajbVar = xl9Var.G;
            if (ajbVar != null) {
                if (!z) {
                    dg9Var.O();
                    dg9Var.setSelection(0);
                    return;
                } else if (!ajbVar.g.isEmpty()) {
                    am9 m = xl9Var.w.m((TL_iv.pageTableCell) c00.g(1, xl9Var.G.g));
                    if (m != null) {
                        dg9 dg9Var2 = m.a;
                        dg9Var2.O();
                        dg9Var2.setSelection(dg9Var2.length());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (z && (D1 instanceof km9)) {
            km9 km9Var = (km9) D1;
            if (km9Var.l()) {
                km9Var.f();
                return;
            }
        }
        dg9 P3 = P3(D1);
        if (P3 == null) {
            a3(mk0Var);
            return;
        }
        P3.O();
        if (z) {
            P3.setSelection(P3.length());
        }
    }

    public final void Z3(int i) {
        int i2;
        ch9 ch9Var;
        int i3;
        boolean z;
        int i4;
        int i5;
        SpannableStringBuilder spannableStringBuilder;
        int i6;
        int length;
        int g;
        int A;
        boolean z2;
        int i7;
        int length2;
        int g2;
        int A2;
        boolean z3;
        int i8;
        int length3;
        int g3;
        int A3;
        boolean z4;
        int i9;
        ch9 ch9Var2;
        int i10;
        int i11;
        int i12;
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            boolean I3 = I3();
            ni9 ni9Var = this.p3;
            int i13 = 0;
            if (I3) {
                int i14 = di9Var.p0;
                int i15 = di9Var.q0;
                int i16 = di9Var.t0;
                int i17 = di9Var.r0;
                int i18 = di9Var.u0;
                boolean H3 = H3(i, i14, i15, i17, i16, i18);
                if (!H3) {
                    i9 = t2(i);
                } else {
                    i9 = 0;
                }
                ch9 ch9Var3 = this.R3;
                if (ch9Var3 != null) {
                    ch9Var3.d();
                }
                this.Q3 = true;
                int i19 = i15;
                boolean z5 = false;
                while (i19 <= i16) {
                    dg9 R4 = R4(i14, i19);
                    if (R4 == null) {
                        i12 = i15;
                    } else {
                        int length4 = R4.length();
                        if (i19 == i15) {
                            i10 = i17;
                        } else {
                            i10 = 0;
                        }
                        if (i19 == i16) {
                            i11 = i18;
                        } else {
                            i11 = length4;
                        }
                        if (i15 == i16) {
                            i10 = Math.min(i17, i18);
                            i11 = Math.max(i17, i18);
                        }
                        int i20 = i10;
                        i12 = i15;
                        int max = Math.max(0, Math.min(i20, length4));
                        int max2 = Math.max(0, Math.min(i11, length4));
                        if (max < max2) {
                            if (!H3) {
                                if (i9 != 0) {
                                    R4.b(i9, max, max2);
                                }
                                R4.a(i, max, max2);
                            } else {
                                R4.b(i, max, max2);
                            }
                            R4.f();
                            R4.requestLayout();
                            h4(i14, i19);
                            z5 = true;
                        }
                    }
                    i19++;
                    i15 = i12;
                }
                this.Q3 = false;
                if (z5 && (ch9Var2 = this.R3) != null) {
                    ch9Var2.h();
                }
                ni9Var.f();
                if (z5) {
                    q4();
                }
            } else if (v3()) {
                int i21 = di9Var.p0;
                dg9 F2 = F2(i21);
                if (F2 != null && (g3 = uh9.g(di9Var.r0, di9Var.u0, (length3 = F2.length()), 0)) < (A3 = qu6.A(di9Var.r0, di9Var.u0, length3, 0))) {
                    if ((F2.c(g3, A3) & i) == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ch9 ch9Var4 = this.R3;
                    if (ch9Var4 != null) {
                        ch9Var4.d();
                    }
                    this.Q3 = true;
                    if (z4) {
                        int t2 = t2(i);
                        if (t2 != 0) {
                            F2.b(t2, g3, A3);
                        }
                        F2.a(i, g3, A3);
                    } else {
                        F2.b(i, g3, A3);
                    }
                    this.Q3 = false;
                    f4(i21);
                    F2.f();
                    F2.requestLayout();
                    ch9 ch9Var5 = this.R3;
                    if (ch9Var5 != null) {
                        ch9Var5.h();
                    }
                    ni9Var.f();
                    q4();
                }
            } else if (t3()) {
                int i22 = di9Var.p0;
                dg9 p2 = p2(i22);
                if (p2 != null && (g2 = uh9.g(di9Var.r0, di9Var.u0, (length2 = p2.length()), 0)) < (A2 = qu6.A(di9Var.r0, di9Var.u0, length2, 0))) {
                    if ((p2.c(g2, A2) & i) == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i8 = t2(i);
                    } else {
                        i8 = 0;
                    }
                    ch9 ch9Var6 = this.R3;
                    if (ch9Var6 != null) {
                        ch9Var6.d();
                    }
                    this.Q3 = true;
                    if (z3) {
                        if (i8 != 0) {
                            p2.b(i8, g2, A2);
                        }
                        p2.a(i, g2, A2);
                    } else {
                        p2.b(i, g2, A2);
                    }
                    p2.f();
                    p2.requestLayout();
                    e4(i22);
                    this.Q3 = false;
                    ch9 ch9Var7 = this.R3;
                    if (ch9Var7 != null) {
                        ch9Var7.h();
                    }
                    ni9Var.f();
                    q4();
                }
            } else {
                boolean D3 = D3();
                int i23 = di9Var.p0;
                if (D3) {
                    dg9 l4 = l4(i23);
                    if (l4 != null && (g = uh9.g(di9Var.r0, di9Var.u0, (length = l4.length()), 0)) < (A = qu6.A(di9Var.r0, di9Var.u0, length, 0))) {
                        if ((l4.c(g, A) & i) == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i7 = t2(i);
                        } else {
                            i7 = 0;
                        }
                        ch9 ch9Var8 = this.R3;
                        if (ch9Var8 != null) {
                            ch9Var8.d();
                        }
                        this.Q3 = true;
                        if (z2) {
                            if (i7 != 0) {
                                l4.b(i7, g, A);
                            }
                            l4.a(i, g, A);
                        } else {
                            l4.b(i, g, A);
                        }
                        l4.f();
                        l4.requestLayout();
                        g4(i23);
                        this.Q3 = false;
                        ch9 ch9Var9 = this.R3;
                        if (ch9Var9 != null) {
                            ch9Var9.h();
                        }
                        ni9Var.f();
                        q4();
                        return;
                    }
                    return;
                }
                int i24 = di9Var.s0;
                int i25 = di9Var.r0;
                int i26 = di9Var.u0;
                if (i23 >= 0 && i24 >= 0 && i24 >= i23 && i24 < this.x4.size()) {
                    int i27 = i;
                    boolean G3 = G3(i27, i23, i25, i24, i26);
                    boolean z6 = !G3;
                    if (!G3) {
                        i2 = t2(i27);
                    } else {
                        i2 = 0;
                    }
                    ch9 ch9Var10 = this.R3;
                    if (ch9Var10 != null) {
                        ch9Var10.d();
                    }
                    this.Q3 = true;
                    boolean z7 = false;
                    int i28 = i23;
                    while (i28 <= i24) {
                        mk0 B4 = B4(i28);
                        if (B4 != null) {
                            TL_iv.PageBlock pageBlock = B4.b;
                            if (x3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int e2 = e2(i28);
                                if (i28 == i23) {
                                    i4 = i25;
                                } else {
                                    i4 = i13;
                                }
                                z = z7;
                                if (i28 == i24) {
                                    i5 = i26;
                                } else {
                                    i5 = e2;
                                }
                                int max3 = Math.max(i13, Math.min(i4, e2));
                                int max4 = Math.max(i13, Math.min(i5, e2));
                                if (max3 >= max4) {
                                    i3 = i2;
                                    z7 = z;
                                    i28++;
                                    i27 = i;
                                    i2 = i3;
                                    i13 = 0;
                                } else {
                                    km9 r2 = r2(i28);
                                    if (r2 != null) {
                                        km4 styleDelegate = r2.getStyleDelegate();
                                        if (!G3) {
                                            if (i2 != 0) {
                                                styleDelegate.b(i2, max3, max4);
                                            }
                                            styleDelegate.a(i27, max3, max4);
                                        } else {
                                            styleDelegate.b(i27, max3, max4);
                                        }
                                        r2.getEditText().f();
                                        r2.getEditText().requestLayout();
                                        r2.w();
                                        i3 = i2;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(km9.z(B4.b));
                                        if (!G3 && i2 != 0) {
                                            i3 = i2;
                                            i6 = max3;
                                            mm9.o(spannableStringBuilder2, i6, max4, i3, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i3 = i2;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i6 = max3;
                                        }
                                        mm9.o(spannableStringBuilder, i6, max4, i27, z6, null);
                                        km9.b(B4.b, spannableStringBuilder);
                                    }
                                    z7 = true;
                                    i28++;
                                    i27 = i;
                                    i2 = i3;
                                    i13 = 0;
                                }
                            }
                        }
                        i3 = i2;
                        z = z7;
                        z7 = z;
                        i28++;
                        i27 = i;
                        i2 = i3;
                        i13 = 0;
                    }
                    boolean z8 = z7;
                    this.Q3 = i13;
                    if (z8 && (ch9Var = this.R3) != null) {
                        ch9Var.h();
                    }
                    ni9Var.f();
                    if (z8) {
                        q4();
                    }
                }
            }
        }
    }

    public final void Z4(mk0 mk0Var, TL_iv.PageBlock pageBlock) {
        if (mk0Var == null) {
            mk0Var = b5();
        }
        mk0 mk0Var2 = mk0Var;
        if (mk0Var2 == null) {
            return;
        }
        Y4(mk0Var2, pageBlock, mk0Var2.c, mk0Var2.d, mk0Var2.e, mk0Var2.f);
    }

    public final void a2(Uri uri) {
        boolean contains;
        if (uri != null) {
            mk0 mk0Var = this.j4;
            String str = null;
            this.j4 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            String str2 = str;
            if (str2 != null) {
                contains = str2.startsWith("video");
            } else {
                contains = uri.toString().contains("video");
            }
            boolean z = contains;
            int i = this.z4;
            this.z4 = i - 1;
            Utilities.e.c(new q25(this, uri, z, str2, i, mk0Var));
        }
    }

    public final void a3(mk0 mk0Var) {
        View D1 = D1(mk0Var);
        if (D1 instanceof km9) {
            ((km9) D1).A();
        } else if (D1 instanceof rf9) {
            ((rf9) D1).d.O();
        }
    }

    public final void a4(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.a4(android.view.View):void");
    }

    public final void a5(mk0 mk0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        if (mk0Var == null) {
            mk0Var = b5();
        }
        mk0 mk0Var2 = mk0Var;
        if (mk0Var2 == null) {
            return;
        }
        if (i == 0) {
            Y4(mk0Var2, mk0Var2.b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, mk0Var2.c);
        if (i == 2) {
            i2 = Math.max(1, mk0Var2.d);
        } else {
            i2 = 0;
        }
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        TL_iv.PageBlock pageBlock = mk0Var2.b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        if (z && mk0Var2.f) {
            z2 = true;
        } else {
            z2 = false;
        }
        Y4(mk0Var2, pageBlock, max, i2, z, z2);
    }

    public final void b2(no6 no6Var) {
        TL_iv.PageBlock pageblockvideo;
        pi9 pi9Var;
        String str = no6Var.h;
        if (str == null) {
            str = no6Var.I;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.d();
        }
        boolean c = oj9.c(no6Var);
        if (!no6Var.b && !c) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        mk0 mk0Var = new mk0(pageblockvideo, 0, 0);
        mk0Var.g = R3(no6Var, str2);
        r3(mk0Var);
        p07 p07Var = mk0Var.g;
        if (c) {
            O4(mk0Var, p07Var, no6Var);
            pi9Var = this;
        } else {
            pi9Var = this;
            pi9Var.P4(mk0Var, p07Var, str2, no6Var.b, no6Var.F, no6Var.G, no6Var.E);
        }
        ch9 ch9Var2 = pi9Var.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        pi9Var.p3.onContentChanged();
    }

    public final void b3(mk0 mk0Var) {
        View D1 = D1(mk0Var);
        if (D1 instanceof km9) {
            km9 km9Var = (km9) D1;
            km9Var.A();
            dg9 editText = km9Var.getEditText();
            editText.setSelection(editText.length());
        } else if (D1 instanceof rf9) {
            rf9 rf9Var = (rf9) D1;
            rf9Var.d.O();
            dg9 editText2 = rf9Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void b4() {
        int length;
        int g;
        int A;
        int length2;
        int g2;
        int A2;
        int length3;
        int g3;
        int A3;
        int length4;
        int g4;
        int A5;
        dg9 R4;
        int length5;
        int g5;
        int A6;
        boolean I3 = I3();
        ni9 ni9Var = this.p3;
        di9 di9Var = this.v3;
        if (I3) {
            int i = di9Var.p0;
            int i2 = di9Var.q0;
            if (i2 == di9Var.t0 && (R4 = R4(i, i2)) != null && (g5 = uh9.g(di9Var.r0, di9Var.u0, (length5 = R4.length()), 0)) < (A6 = qu6.A(di9Var.r0, di9Var.u0, length5, 0))) {
                boolean h = mm9.h(R4.getText(), g5, A6);
                ch9 ch9Var = this.R3;
                if (h) {
                    if (ch9Var != null) {
                        ch9Var.d();
                    }
                    mm9.n(R4.getText(), g5, A6);
                    R4.f();
                    h4(i, i2);
                    ch9 ch9Var2 = this.R3;
                    if (ch9Var2 != null) {
                        ch9Var2.h();
                    }
                    ni9Var.f();
                    q4();
                    return;
                }
                if (ch9Var != null) {
                    ch9Var.d();
                }
                if (mm9.g(R4.getText(), g5, A6)) {
                    mm9.m(R4.getText(), g5, A6);
                    R4.f();
                    h4(i, i2);
                    ch9 ch9Var3 = this.R3;
                    if (ch9Var3 != null) {
                        ch9Var3.h();
                    }
                    q4();
                }
                R4.V1 = g5;
                R4.W1 = A6;
                l3(false);
                H4(R4);
            }
        } else if (v3()) {
            int i3 = di9Var.p0;
            dg9 F2 = F2(i3);
            if (F2 != null && (g4 = uh9.g(di9Var.r0, di9Var.u0, (length4 = F2.length()), 0)) < (A5 = qu6.A(di9Var.r0, di9Var.u0, length4, 0))) {
                boolean h2 = mm9.h(F2.getText(), g4, A5);
                ch9 ch9Var4 = this.R3;
                if (h2) {
                    if (ch9Var4 != null) {
                        ch9Var4.d();
                    }
                    mm9.n(F2.getText(), g4, A5);
                    F2.f();
                    f4(i3);
                    ch9 ch9Var5 = this.R3;
                    if (ch9Var5 != null) {
                        ch9Var5.h();
                    }
                    ni9Var.f();
                    q4();
                    return;
                }
                if (ch9Var4 != null) {
                    ch9Var4.d();
                }
                if (mm9.g(F2.getText(), g4, A5)) {
                    mm9.m(F2.getText(), g4, A5);
                    F2.f();
                    f4(i3);
                    ch9 ch9Var6 = this.R3;
                    if (ch9Var6 != null) {
                        ch9Var6.h();
                    }
                    q4();
                }
                F2.V1 = g4;
                F2.W1 = A5;
                l3(false);
                H4(F2);
            }
        } else if (t3()) {
            int i4 = di9Var.p0;
            dg9 p2 = p2(i4);
            if (p2 != null && (g3 = uh9.g(di9Var.r0, di9Var.u0, (length3 = p2.length()), 0)) < (A3 = qu6.A(di9Var.r0, di9Var.u0, length3, 0))) {
                boolean h3 = mm9.h(p2.getText(), g3, A3);
                ch9 ch9Var7 = this.R3;
                if (h3) {
                    if (ch9Var7 != null) {
                        ch9Var7.d();
                    }
                    mm9.n(p2.getText(), g3, A3);
                    p2.f();
                    e4(i4);
                    ch9 ch9Var8 = this.R3;
                    if (ch9Var8 != null) {
                        ch9Var8.h();
                    }
                    ni9Var.f();
                    q4();
                    return;
                }
                if (ch9Var7 != null) {
                    ch9Var7.d();
                }
                if (mm9.g(p2.getText(), g3, A3)) {
                    mm9.m(p2.getText(), g3, A3);
                    p2.f();
                    e4(i4);
                    ch9 ch9Var9 = this.R3;
                    if (ch9Var9 != null) {
                        ch9Var9.h();
                    }
                    q4();
                }
                p2.V1 = g3;
                p2.W1 = A3;
                l3(false);
                H4(p2);
            }
        } else if (D3()) {
            int i5 = di9Var.p0;
            dg9 l4 = l4(i5);
            if (l4 != null && (g2 = uh9.g(di9Var.r0, di9Var.u0, (length2 = l4.length()), 0)) < (A2 = qu6.A(di9Var.r0, di9Var.u0, length2, 0))) {
                boolean h4 = mm9.h(l4.getText(), g2, A2);
                ch9 ch9Var10 = this.R3;
                if (h4) {
                    if (ch9Var10 != null) {
                        ch9Var10.d();
                    }
                    mm9.n(l4.getText(), g2, A2);
                    l4.f();
                    g4(i5);
                    ch9 ch9Var11 = this.R3;
                    if (ch9Var11 != null) {
                        ch9Var11.h();
                    }
                    ni9Var.f();
                    q4();
                    return;
                }
                if (ch9Var10 != null) {
                    ch9Var10.d();
                }
                if (mm9.g(l4.getText(), g2, A2)) {
                    mm9.m(l4.getText(), g2, A2);
                    l4.f();
                    g4(i5);
                    ch9 ch9Var12 = this.R3;
                    if (ch9Var12 != null) {
                        ch9Var12.h();
                    }
                    q4();
                }
                l4.V1 = g2;
                l4.W1 = A2;
                l3(false);
                H4(l4);
            }
        } else {
            km9 J4 = J4();
            if (J4 == null || (g = uh9.g(di9Var.r0, di9Var.u0, (length = J4.getEditText().length()), 0)) >= (A = qu6.A(di9Var.r0, di9Var.u0, length, 0))) {
                return;
            }
            boolean h5 = mm9.h(J4.getEditText().getText(), g, A);
            ch9 ch9Var13 = this.R3;
            if (h5) {
                if (ch9Var13 != null) {
                    ch9Var13.d();
                }
                mm9.n(J4.getEditText().getText(), g, A);
                J4.getEditText().f();
                J4.w();
                ch9 ch9Var14 = this.R3;
                if (ch9Var14 != null) {
                    ch9Var14.h();
                }
                ni9Var.f();
                q4();
                return;
            }
            if (ch9Var13 != null) {
                ch9Var13.d();
            }
            if (mm9.g(J4.getEditText().getText(), g, A)) {
                mm9.m(J4.getEditText().getText(), g, A);
                J4.getEditText().f();
                J4.w();
                ch9 ch9Var15 = this.R3;
                if (ch9Var15 != null) {
                    ch9Var15.h();
                }
                q4();
            }
            dg9 editText = J4.getEditText();
            editText.V1 = g;
            editText.W1 = A;
            l3(false);
            H4(J4.getEditText());
        }
    }

    public final mk0 b5() {
        di9 di9Var;
        int i;
        mk0 N2 = N2();
        if (N2 == null && (di9Var = this.v3) != null && di9Var.w() && (i = di9Var.p0) == di9Var.s0) {
            return B4(i);
        }
        return N2;
    }

    public final void c2(xl9 xl9Var) {
        xl9 xl9Var2 = this.q4;
        if (xl9Var2 != null && xl9Var2 != xl9Var) {
            LinkedHashSet linkedHashSet = xl9Var2.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                xl9Var2.w.invalidate();
                xl9Var2.v();
            }
        }
        this.q4 = xl9Var;
        this.K3 = false;
        this.t4 = -1;
        this.s4 = -1;
        xl9Var.setCellSelectionListener(this.u4);
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            di9Var.e(false);
        }
        setEditTextsLocked(true);
    }

    public final void c3(mk0 mk0Var) {
        View D1 = D1(mk0Var);
        if (D1 instanceof km9) {
            km9 km9Var = (km9) D1;
            km9Var.A();
            km9Var.getEditText().setSelection(0);
        } else if (D1 instanceof rf9) {
            rf9 rf9Var = (rf9) D1;
            rf9Var.d.O();
            rf9Var.getEditText().setSelection(0);
        }
    }

    public final void c4() {
        dg9 editText;
        Runnable fh9Var;
        int length;
        final int g;
        final int A;
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w()) {
            if (I3()) {
                int i = di9Var.p0;
                int i2 = di9Var.q0;
                if (i2 == di9Var.t0) {
                    editText = R4(i, i2);
                    fh9Var = new mh9(this, i, i2, (byte) 1);
                } else {
                    return;
                }
            } else if (v3()) {
                int i3 = di9Var.p0;
                editText = F2(i3);
                fh9Var = new eh9(this, i3, (byte) 0);
            } else if (t3()) {
                int i4 = di9Var.p0;
                editText = p2(i4);
                fh9Var = new eh9(this, i4, (byte) 1);
            } else if (D3()) {
                int i5 = di9Var.p0;
                editText = l4(i5);
                fh9Var = new eh9(this, i5, (byte) 2);
            } else {
                km9 J4 = J4();
                if (J4 != null) {
                    editText = J4.getEditText();
                    fh9Var = new fh9(J4, (byte) 0);
                } else {
                    return;
                }
            }
            final dg9 dg9Var = editText;
            final Runnable runnable = fh9Var;
            if (dg9Var != null && (g = uh9.g(di9Var.r0, di9Var.u0, (length = dg9Var.length()), 0)) <= (A = qu6.A(di9Var.r0, di9Var.u0, length, 0))) {
                Editable text = dg9Var.getText();
                int i6 = nl6.h;
                String str = null;
                if (text != null) {
                    nl6[] nl6VarArr = (nl6[]) text.getSpans(g, A, nl6.class);
                    if (nl6VarArr.length > 0) {
                        str = nl6VarArr[0].a;
                    }
                }
                if (str == null) {
                    str = dg9Var.getText().subSequence(g, A).toString();
                }
                final float L = hl.L(xea.S0 + 4);
                int i7 = aob.G6;
                vnb vnbVar = this.o3;
                final int v0 = aob.v0(i7, vnbVar);
                v72.W(getContext(), str, new pcc() {
                    @Override
                    public final void a(Object obj) {
                        nl6 a;
                        String str2 = (String) obj;
                        pi9 pi9Var = pi9.this;
                        pi9Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a = nl6.a(str2, v0, L)) == null) {
                            return;
                        }
                        ch9 ch9Var = pi9Var.R3;
                        if (ch9Var != null) {
                            ch9Var.d();
                        }
                        di9 di9Var2 = pi9Var.v3;
                        if (di9Var2 != null) {
                            di9Var2.e(false);
                        }
                        dg9 dg9Var2 = dg9Var;
                        dg9Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a, 0, 1, 33);
                        Editable text2 = dg9Var2.getText();
                        int max = Math.max(0, Math.min(g, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(A, text2.length())), spannableString);
                        runnable.run();
                        ch9 ch9Var2 = pi9Var.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.h();
                        }
                        pi9Var.p3.onContentChanged();
                        int min = Math.min(max + 1, dg9Var2.length());
                        dg9Var2.O();
                        pi9Var.post(new qh9(dg9Var2, min, (byte) 3));
                    }
                }, vnbVar);
            }
        }
    }

    public final void c5(float f, float f2) {
        TL_iv.pageTableCell o;
        xl9 xl9Var = this.q4;
        if (this.J3 && xl9Var != null && this.F3 == xl9Var && (o = xl9Var.o((int) ((f - xl9Var.getLeft()) - getLeft()), (int) ((f2 - xl9Var.getTop()) - getTop()))) != null && o != this.M3) {
            this.M3 = o;
            xl9Var.y(this.L3, o);
        }
    }

    public final gi9 d2() {
        int i;
        int i2;
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w() && !D3()) {
            mk0 B4 = B4(di9Var.p0);
            ArrayList arrayList = this.t3;
            int indexOf = arrayList.indexOf(B4);
            int indexOf2 = arrayList.indexOf(B4(di9Var.s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                if (indexOf > indexOf2) {
                    i2 = indexOf;
                    i = indexOf2;
                } else {
                    i = indexOf;
                    i2 = indexOf2;
                }
                for (int i3 = i; i3 <= i2; i3++) {
                    mk0 mk0Var = (mk0) arrayList.get(i3);
                    if (mk0Var.i || u3(mk0Var)) {
                        return null;
                    }
                }
                return new gi9(this, i, i2, di9Var.r0, di9Var.u0);
            }
            return null;
        }
        return null;
    }

    public final void d4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.d4():void");
    }

    public final void d5() {
        km9 km9Var;
        mk0 mk0Var;
        hm9 hm9Var;
        o79 itemAnimator = getItemAnimator();
        setItemAnimator(null);
        this.g3.O(true);
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof km9) && (mk0Var = (km9Var = (km9) childAt).y) != null && (hm9Var = km9Var.E) != null) {
                km9Var.d(mk0Var, hm9Var, km9Var.F);
            }
        }
        post(new kh9(this, itemAnimator, (byte) 0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        Long l;
        mk0 mk0Var;
        View view;
        Long l2;
        int i2;
        int i3;
        ArrayList arrayList2;
        mk0 mk0Var2;
        mk0 mk0Var3;
        float f;
        mk0 mk0Var4;
        boolean z;
        mk0 mk0Var5;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                arrayList = this.x4;
                if (i4 >= childCount) {
                    break;
                }
                int S = RecyclerView.S(getChildAt(i4));
                if (S >= 0 && S < arrayList.size()) {
                    mk0Var5 = (mk0) arrayList.get(S);
                } else {
                    mk0Var5 = null;
                }
                if (mk0Var5 != null) {
                    ArrayList arrayList3 = mk0Var5.k;
                    if (arrayList3.size() > i5) {
                        i5 = arrayList3.size();
                    }
                }
                i4++;
            }
            if (i5 != 0) {
                if (this.y4 == null) {
                    ab9 ab9Var = new ab9(this);
                    this.y4 = ab9Var;
                    ab9Var.a(null, null, null, this.o3, 1);
                    nxe.a(this.y4, this.o3);
                }
                int i6 = 0;
                while (i6 < i5) {
                    float f2 = 0.0f;
                    long j = 0;
                    int i7 = 0;
                    boolean z2 = false;
                    mk0 mk0Var6 = null;
                    mk0 mk0Var7 = null;
                    float f3 = 1.0f;
                    float f4 = 0.0f;
                    while (i7 <= childCount) {
                        if (i7 < childCount) {
                            View childAt = getChildAt(i7);
                            int S2 = RecyclerView.S(childAt);
                            if (S2 >= 0 && S2 < arrayList.size()) {
                                mk0Var = (mk0) arrayList.get(S2);
                            } else {
                                mk0Var = null;
                            }
                            if (mk0Var != null) {
                                ArrayList arrayList4 = mk0Var.k;
                                if (i6 < arrayList4.size()) {
                                    l = (Long) arrayList4.get(i6);
                                    i = childCount;
                                    view = childAt;
                                }
                            }
                            i = childCount;
                            view = childAt;
                            l = null;
                        } else {
                            i = childCount;
                            l = null;
                            mk0Var = null;
                            view = null;
                        }
                        if (z2 && (l == null || l.longValue() != j)) {
                            int m4 = m4(i6, mk0Var6, true);
                            l2 = l;
                            int m42 = m4(i6, mk0Var7, false);
                            if (f4 - f2 <= hl.L(4.0f)) {
                                i2 = i6;
                                i3 = i5;
                                arrayList2 = arrayList;
                            } else {
                                int L = hl.L(16.0f) * i6;
                                i2 = i6;
                                int L2 = hl.L(16.0f) + L;
                                i3 = i5;
                                arrayList2 = arrayList;
                                int x = qu6.x(16.0f, getWidth(), L);
                                if (x - L2 > hl.L(8.0f)) {
                                    float floor = (float) Math.floor(xea.U0 / 3.0f);
                                    RectF rectF = hl.P;
                                    rectF.set(L2, m4 + f2, x, f4 - m42);
                                    mk0Var2 = mk0Var6;
                                    mk0Var3 = mk0Var7;
                                    this.y4.c(floor, floor, floor, f3, canvas, rectF);
                                    f = f3;
                                    this.y4.f(canvas, rectF, f);
                                    z2 = false;
                                }
                            }
                            mk0Var2 = mk0Var6;
                            mk0Var3 = mk0Var7;
                            f = f3;
                            z2 = false;
                        } else {
                            l2 = l;
                            i2 = i6;
                            i3 = i5;
                            arrayList2 = arrayList;
                            mk0Var2 = mk0Var6;
                            mk0Var3 = mk0Var7;
                            f = f3;
                        }
                        if (view != null && l2 != null) {
                            if (!z2) {
                                j = l2.longValue();
                                f2 = Float.MAX_VALUE;
                                f4 = -3.4028235E38f;
                                mk0Var4 = mk0Var;
                                z = true;
                                f = 1.0f;
                            } else {
                                mk0Var4 = mk0Var2;
                                z = z2;
                            }
                            if (mk0Var != null && mk0Var == this.a4) {
                                z2 = z;
                                f3 = f;
                            } else {
                                float y = view.getY();
                                float height = view.getHeight() + y;
                                if (y < f2) {
                                    f2 = y;
                                }
                                if (height > f4) {
                                    f4 = height;
                                }
                                f3 = Math.min(f, view.getAlpha());
                                z2 = z;
                            }
                            mk0Var7 = mk0Var;
                        } else {
                            mk0Var7 = mk0Var3;
                            f3 = f;
                            mk0Var4 = mk0Var2;
                        }
                        i7++;
                        mk0Var6 = mk0Var4;
                        childCount = i;
                        i6 = i2;
                        i5 = i3;
                        arrayList = arrayList2;
                    }
                    i6++;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final int e2(int i) {
        dg9 F2 = F2(i);
        if (F2 != null) {
            return F2.length();
        }
        km9 r2 = r2(i);
        if (r2 != null) {
            return r2.getEditText().length();
        }
        mk0 B4 = B4(i);
        if (B4 == null) {
            return 0;
        }
        return km9.y(B4.b).length();
    }

    public final boolean e3(android.view.KeyEvent r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.e3(android.view.KeyEvent):boolean");
    }

    public final void e4(int i) {
        View D4 = D4(i);
        if (D4 instanceof jf9) {
            ((jf9) D4).b();
        }
    }

    public final void e5(mk0 mk0Var, String str) {
        mk0 mk0Var2;
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    ch9 ch9Var = this.R3;
                    if (ch9Var != null) {
                        ch9Var.d();
                    }
                    pageblockpreformatted.language = str;
                    km9 r2 = r2(this.t3.indexOf(mk0Var));
                    if (r2 != null && (mk0Var2 = r2.y) != null) {
                        r2.J(mk0Var2.b, true);
                        r2.I = null;
                        r2.B();
                    }
                    ch9 ch9Var2 = this.R3;
                    if (ch9Var2 != null) {
                        ch9Var2.h();
                    }
                }
            }
        }
    }

    public final TL_iv.RichMessage f2() {
        if (h3()) {
            ArrayList<TL_iv.PageBlock> W2 = W2();
            if (W2.isEmpty()) {
                return null;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = W2;
            richMessage.photos = y2();
            richMessage.documents = v2();
            return richMessage;
        }
        return null;
    }

    public final boolean f3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.f3(android.view.MotionEvent):boolean");
    }

    public final void f4(int i) {
        mk0 B4 = B4(i);
        dg9 F2 = F2(i);
        if (u3(B4) && F2 != null) {
            ((TL_iv.pageBlockDetails) B4.b).title = mm9.f(F2.getText());
        }
    }

    public final TL_iv.PageBlock g2(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        TL_iv.pageBlockList pageblocklist;
        TL_iv.pageBlockOrderedList pageblockorderedlist;
        int i5;
        TL_iv.RichText richText;
        int i6;
        mk0 mk0Var;
        TL_iv.RichText richText2;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        int i7 = i3;
        int i8 = i4;
        if (z) {
            pageblockorderedlist = new TL_iv.pageBlockOrderedList();
            pageblocklist = null;
        } else {
            pageblocklist = new TL_iv.pageBlockList();
            pageblockorderedlist = null;
        }
        int i9 = i;
        int i10 = 1;
        while (i9 < i7) {
            pi9 pi9Var = this;
            ArrayList arrayList2 = pi9Var.t3;
            mk0 mk0Var2 = (mk0) arrayList2.get(i9);
            if (mk0Var2.k.size() > i8 || (i5 = mk0Var2.c) < i2) {
                break;
            }
            if (i5 == i2) {
                if (mk0Var2.d > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 != z) {
                    break;
                }
            }
            if (i5 > i2) {
                break;
            }
            boolean B3 = B3(mk0Var2.b);
            if (!B3) {
                TL_iv.PageBlock pageBlock = mk0Var2.b;
                if (pageBlock == null) {
                    richText = null;
                } else {
                    richText = pageBlock.text;
                }
                if (richText == null) {
                    richText = new TL_iv.textEmpty();
                }
            } else {
                richText = null;
            }
            int i11 = i9 + 1;
            ArrayList arrayList3 = new ArrayList();
            if (B3) {
                G2(mk0Var2, arrayList3);
            }
            while (i11 < i7) {
                mk0 mk0Var3 = (mk0) arrayList2.get(i11);
                if (mk0Var3.k.size() > i8) {
                    break;
                }
                mk0Var = mk0Var2;
                int i12 = mk0Var3.c;
                if (i12 >= i2) {
                    if (i12 == i2) {
                        if (B3(mk0Var3.b)) {
                            G2(mk0Var3, arrayList3);
                            i11++;
                            mk0Var2 = mk0Var;
                        }
                    } else {
                        if (mk0Var3.d > 0) {
                            richText2 = richText;
                            z2 = true;
                        } else {
                            richText2 = richText;
                            z2 = false;
                        }
                        ArrayList arrayList4 = arrayList3;
                        int[] iArr2 = {i11};
                        pi9 pi9Var2 = pi9Var;
                        i6 = i11;
                        arrayList = arrayList4;
                        TL_iv.PageBlock g2 = pi9Var2.g2(i6, i12, i7, i8, z2, iArr2);
                        if (g2 != null) {
                            arrayList.add(g2);
                        }
                        i11 = iArr2[0];
                        if (i11 <= i6) {
                            break;
                        }
                        pi9Var = this;
                        i7 = i3;
                        i8 = i4;
                        richText = richText2;
                        mk0Var2 = mk0Var;
                        arrayList3 = arrayList;
                    }
                }
                i6 = i11;
                break;
            }
            i6 = i11;
            mk0Var = mk0Var2;
            richText2 = richText;
            arrayList = arrayList3;
            if (!B3 && arrayList.isEmpty()) {
                if (z) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                    tL_pageListOrderedItemText.num = bp1.n(i10, ".");
                    tL_pageListOrderedItemText.text = richText2;
                    tL_pageListOrderedItemText.checkbox = mk0Var.e;
                    tL_pageListOrderedItemText.checked = mk0Var.f;
                    pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                } else {
                    TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                    tL_pageListItemText.text = richText2;
                    tL_pageListItemText.checkbox = mk0Var.e;
                    tL_pageListItemText.checked = mk0Var.f;
                    pageblocklist.items.add(tL_pageListItemText);
                }
            } else {
                ArrayList<TL_iv.PageBlock> arrayList5 = new ArrayList<>();
                if (!B3) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = richText2;
                    arrayList5.add(pageblockparagraph);
                }
                arrayList5.addAll(arrayList);
                if (!arrayList5.isEmpty()) {
                    if (z) {
                        TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                        tL_pageListOrderedItemBlocks.num = bp1.n(i10, ".");
                        tL_pageListOrderedItemBlocks.blocks = arrayList5;
                        tL_pageListOrderedItemBlocks.checkbox = mk0Var.e;
                        tL_pageListOrderedItemBlocks.checked = mk0Var.f;
                        pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks);
                    } else {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                        tL_pageListItemBlocks.blocks = arrayList5;
                        tL_pageListItemBlocks.checkbox = mk0Var.e;
                        tL_pageListItemBlocks.checked = mk0Var.f;
                        pageblocklist.items.add(tL_pageListItemBlocks);
                    }
                } else {
                    i7 = i3;
                    i8 = i4;
                    i9 = i6;
                }
            }
            i10++;
            i7 = i3;
            i8 = i4;
            i9 = i6;
        }
        iArr[0] = i9;
        if (z) {
            if (!pageblockorderedlist.items.isEmpty()) {
                return pageblockorderedlist;
            }
        } else if (!pageblocklist.items.isEmpty()) {
            return pageblocklist;
        }
        return null;
    }

    public final boolean g3(defpackage.xl9 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.g3(xl9, int, int):boolean");
    }

    public final void g4(int i) {
        View D4 = D4(i);
        if (D4 instanceof km9) {
            ((km9) D4).v();
        }
    }

    public final void g5(java.lang.CharSequence r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.g5(java.lang.CharSequence):void");
    }

    public dg9 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof dg9) {
            return (dg9) findFocus;
        }
        return null;
    }

    public ej9 getMapDelegate() {
        return this.l4;
    }

    public View getOverlayView() {
        return this.w3;
    }

    public amb getTextSelectionHelper() {
        return this.v3;
    }

    public final boolean h2() {
        dg9 editText;
        int length;
        int g;
        int A;
        Editable text;
        dj9[] dj9VarArr;
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w() && di9Var.p0 == di9Var.s0) {
            if (I3()) {
                int i = di9Var.p0;
                int i2 = di9Var.q0;
                if (i2 == di9Var.t0) {
                    editText = R4(i, i2);
                    if (editText != null && (g = uh9.g(di9Var.r0, di9Var.u0, (length = editText.length()), 0)) < (A = qu6.A(di9Var.r0, di9Var.u0, length, 0))) {
                        text = editText.getText();
                        if (text == null && g < A) {
                            for (dj9 dj9Var : (dj9[]) text.getSpans(g, A, dj9.class)) {
                                if (text.getSpanStart(dj9Var) >= A || text.getSpanEnd(dj9Var) <= g) {
                                }
                            }
                            return true;
                        }
                    }
                }
            } else {
                if (v3()) {
                    editText = F2(di9Var.p0);
                } else if (t3()) {
                    editText = p2(di9Var.p0);
                } else if (D3()) {
                    editText = l4(di9Var.p0);
                } else {
                    km9 J4 = J4();
                    if (J4 != null) {
                        editText = J4.getEditText();
                    }
                }
                if (editText != null) {
                    text = editText.getText();
                    return text == null ? true : true;
                }
            }
        }
        return false;
    }

    public final boolean h3() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.h3():boolean");
    }

    public final void h4(int i, int i2) {
        am9 m;
        View D4 = D4(i);
        if (D4 instanceof xl9) {
            xl9 xl9Var = (xl9) D4;
            if (i2 == 0) {
                xl9Var.w();
                return;
            }
            TL_iv.pageTableCell g = xl9Var.g(i2);
            if (g != null && (m = xl9Var.getGrid().m(g)) != null) {
                ajb.d(g, m.a.getText());
            }
        }
    }

    public final boolean i2() {
        int[] G4 = G4();
        if (G4 == null) {
            return j2(A2());
        }
        for (int i = G4[0]; i <= G4[1]; i++) {
            if (j2((mk0) this.t3.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean j2(mk0 mk0Var) {
        ArrayList arrayList;
        int indexOf;
        if (mk0Var != null && (indexOf = (arrayList = this.t3).indexOf(mk0Var)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            mk0 mk0Var2 = (mk0) arrayList.get(indexOf);
            if (mk0Var2.c == 0) {
                TL_iv.PageBlock pageBlock = mk0Var2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !z3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !k2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((mk0) arrayList.get(indexOf - 1)).c < mk0Var2.c) {
                return false;
            }
            if (m3(indexOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j3() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                return false;
            }
            for (p07 p07Var : O3((mk0) arrayList.get(i))) {
                if (p07Var.a()) {
                    return true;
                }
            }
            i++;
        }
    }

    public final void j4(dg9 dg9Var) {
        if (dg9Var == null) {
            return;
        }
        dg9Var.d2 = this.r3;
        dg9Var.setInlineButtonContext(this.n3);
        dg9Var.setInlineButtonClickListener(new oh9(this));
    }

    public final boolean k2(int i) {
        if (i > 0) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size() && B3(((mk0) arrayList.get(i)).b) && ((mk0) arrayList.get(i - 1)).c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void k3() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof km9) {
                km9 km9Var = (km9) childAt;
                km9Var.f.m();
                km9Var.h.m();
            } else if (childAt instanceof xl9) {
                xl9 xl9Var = (xl9) childAt;
                zl9 zl9Var = xl9Var.w;
                xl9Var.r.m();
                for (int i2 = 0; i2 < zl9Var.getChildCount(); i2++) {
                    View childAt2 = zl9Var.getChildAt(i2);
                    if (childAt2 instanceof am9) {
                        ((am9) childAt2).a.m();
                    }
                }
            } else if (childAt instanceof jf9) {
                ((jf9) childAt).getCaptionEditText().m();
            } else if (childAt instanceof rf9) {
                ((rf9) childAt).getEditText().m();
            }
        }
    }

    public final int k4(int i) {
        Layout layout;
        View D4 = D4(i);
        if (!(D4 instanceof km9) || (layout = ((km9) D4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final boolean l2() {
        int[] G4 = G4();
        if (G4 == null) {
            return m2(A2());
        }
        for (int i = G4[0]; i <= G4[1]; i++) {
            if (m2((mk0) this.t3.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final void l3(boolean z) {
        di9 di9Var = this.v3;
        if (di9Var != null) {
            if (z) {
                di9Var.e(false);
            } else {
                hl.r(di9Var.m0);
                di9Var.t();
            }
        }
        if (z) {
            S2();
        } else {
            k3();
        }
    }

    public final dg9 l4(int i) {
        View D4 = D4(i);
        if (D4 instanceof km9) {
            return ((km9) D4).getAuthorEditText();
        }
        return null;
    }

    public final boolean m2(mk0 mk0Var) {
        ArrayList arrayList;
        int indexOf;
        if (mk0Var == null || (indexOf = (arrayList = this.t3).indexOf(mk0Var)) < 0 || mk0Var.c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((mk0) arrayList.get(indexOf)).c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean m3(int i) {
        if (((mk0) this.t3.get(i)).c + 1 <= uc7.s1(this.n3).k4.i0.f() - 6) {
            return true;
        }
        return false;
    }

    public final boolean n2() {
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            if (ch9Var.e || !ch9Var.b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean n3(int i, boolean z, boolean z2) {
        boolean z3;
        mk0 mk0Var;
        int i2;
        int i3 = 0;
        if (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size()) {
                mk0 mk0Var2 = (mk0) arrayList.get(i);
                if (z) {
                    if (mk0Var2.c > 0) {
                        q2(i);
                        return true;
                    }
                } else if (mk0Var2.c == 0) {
                    TL_iv.PageBlock pageBlock = mk0Var2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !z3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if ((z3 || k2(i)) && m3(i)) {
                        if (i > 0) {
                            mk0Var = (mk0) arrayList.get(i - 1);
                        } else {
                            mk0Var = null;
                        }
                        if (z3) {
                            mk0Var2.c = 1;
                            if (mk0Var != null && mk0Var.d > 0) {
                                i3 = 1;
                            }
                            mk0Var2.d = i3;
                            return true;
                        }
                        mk0Var2.c = mk0Var.c;
                        if (mk0Var.d > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        mk0Var2.d = i2;
                        mk0Var2.e = false;
                        mk0Var2.f = false;
                        return true;
                    }
                } else if ((z2 || (i != 0 && ((mk0) arrayList.get(i - 1)).c >= mk0Var2.c)) && m3(i)) {
                    mk0Var2.c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void o2(mk0 mk0Var, p07 p07Var) {
        ni9 ni9Var = this.p3;
        IdentityHashMap identityHashMap = this.i4;
        IdentityHashMap identityHashMap2 = this.h4;
        if (p07Var == null) {
            for (p07 p07Var2 : O3(mk0Var)) {
                sj9 sj9Var = (sj9) identityHashMap2.remove(p07Var2);
                if (sj9Var != null) {
                    sj9Var.b();
                }
                oj9 oj9Var = (oj9) identityHashMap.remove(p07Var2);
                if (oj9Var != null) {
                    oj9Var.a();
                }
            }
            ArrayList arrayList = this.t3;
            int indexOf = arrayList.indexOf(mk0Var);
            if (indexOf >= 0) {
                ch9 ch9Var = this.R3;
                if (ch9Var != null) {
                    ch9Var.d();
                }
                arrayList.remove(indexOf);
                this.g3.O(true);
                ch9 ch9Var2 = this.R3;
                if (ch9Var2 != null) {
                    ch9Var2.h();
                }
            }
            ni9Var.onContentChanged();
            return;
        }
        sj9 sj9Var2 = (sj9) identityHashMap2.remove(p07Var);
        if (sj9Var2 != null) {
            sj9Var2.b();
        }
        oj9 oj9Var2 = (oj9) identityHashMap.remove(p07Var);
        if (oj9Var2 != null) {
            oj9Var2.a();
        }
        ch9 ch9Var3 = this.R3;
        if (ch9Var3 != null) {
            ch9Var3.d();
        }
        s4(mk0Var, p07Var);
        ch9 ch9Var4 = this.R3;
        if (ch9Var4 != null) {
            ch9Var4.h();
        }
        ni9Var.onContentChanged();
    }

    public final void o3(boolean z) {
        mk0 A2;
        int[] G4 = G4();
        if (G4 != null) {
            int i = G4[0];
            int i2 = G4[1];
            if (i == i2) {
                A2 = (mk0) this.t3.get(i);
            } else {
                o4(i, i2, z);
                return;
            }
        } else {
            A2 = A2();
        }
        if (A2 != null) {
            W3(A2, z);
        }
    }

    public final boolean o4(int i, int i2, boolean z) {
        boolean z2;
        if (i >= 0 && i2 >= i) {
            ArrayList arrayList = this.t3;
            if (i2 < arrayList.size()) {
                ch9 ch9Var = this.R3;
                if (ch9Var != null) {
                    ch9Var.d();
                }
                if (z) {
                    z2 = false;
                    while (i2 >= i) {
                        if (n3(i2, true, true)) {
                            z2 = true;
                        }
                        i2--;
                    }
                } else {
                    mk0 mk0Var = (mk0) arrayList.get(i);
                    if (mk0Var.c >= 1 && (i == 0 || ((mk0) arrayList.get(i - 1)).c < mk0Var.c)) {
                        return false;
                    }
                    z2 = false;
                    while (i <= i2) {
                        if (n3(i, false, true)) {
                            z2 = true;
                        }
                        i++;
                    }
                }
                if (z2) {
                    u4();
                    if (findFocus() instanceof dg9) {
                        U1();
                    } else {
                        this.g3.O(false);
                    }
                    ch9 ch9Var2 = this.R3;
                    if (ch9Var2 != null) {
                        ch9Var2.h();
                    }
                }
                return z2;
            }
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.U3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.U3);
        this.i3 = false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        View G;
        int i5 = i4 - i2;
        int i6 = this.S3;
        if (i6 > 0 && i5 < i6) {
            z2 = true;
        } else {
            z2 = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (z2) {
            View findFocus = findFocus();
            if (findFocus == null) {
                G = null;
            } else {
                G = G(findFocus);
            }
            if (G != null) {
                int L = (hl.L(8.0f) + G.getBottom()) - (i5 - getPaddingBottom());
                if (L > 0) {
                    post(new eh9(this, L, (byte) 3));
                }
            }
        }
        this.S3 = i5;
    }

    public final dg9 p2(int i) {
        View D4 = D4(i);
        if (D4 instanceof jf9) {
            return ((jf9) D4).getCaptionEditText();
        }
        return null;
    }

    public final void p3(mk0 mk0Var, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = mk0Var.k;
        int size = arrayList3.size();
        int i = 0;
        while (i < size && i < arrayList.size() && ((Long) arrayList3.get(i)).equals(arrayList.get(i))) {
            i++;
        }
        for (int i2 = size - 1; i2 >= i; i2--) {
            Long l = (Long) arrayList3.get(i2);
            long longValue = l.longValue();
            Integer num = (Integer) hashMap.get(l);
            if (num != null && (num.intValue() >= 2 || i2 != 0 || this.u3.containsKey(l))) {
                mk0 mk0Var2 = new mk0(new TL_iv.pageBlockParagraph(), 0, 0);
                mk0Var2.t = longValue;
                for (int i3 = 0; i3 <= i2; i3++) {
                    mk0Var2.k.add((Long) arrayList3.get(i3));
                }
                int i4 = ol9.b;
                b8c K = b8c.K(ol9.class);
                K.H = mk0Var2;
                K.I = this.n4;
                arrayList2.add(K);
                this.x4.add(mk0Var2);
            }
        }
    }

    public final void p4(mk0 mk0Var) {
        View D1 = D1(mk0Var);
        if (D1 instanceof mj9) {
            mj9 mj9Var = (mj9) D1;
            ArrayList arrayList = mj9Var.E;
            if (mj9Var.a != null) {
                mj9Var.p();
                if (mj9Var.a0 >= arrayList.size()) {
                    mj9Var.a0 = Math.max(0, arrayList.size() - 1);
                }
                mj9Var.q(false);
                mj9Var.requestLayout();
                mj9Var.invalidate();
            }
        }
    }

    public final void q2(int i) {
        mk0 mk0Var;
        int i2;
        ArrayList arrayList = this.t3;
        mk0 mk0Var2 = (mk0) arrayList.get(i);
        int i3 = mk0Var2.c;
        if (i3 > 0) {
            int i4 = i3 - 1;
            mk0Var2.c = i4;
            if (i4 == 0) {
                mk0Var2.d = 0;
                mk0Var2.e = false;
                mk0Var2.f = false;
            }
            while (true) {
                i++;
                if (i < arrayList.size() && (i2 = (mk0Var = (mk0) arrayList.get(i)).c) > i3) {
                    mk0Var.c = i2 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void q3() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.q3():void");
    }

    public final void q4() {
        post(new m72(this, (byte) 3));
    }

    public final km9 r2(int i) {
        if (i < 0) {
            return null;
        }
        View m = this.f3.m(i);
        if (!(m instanceof km9)) {
            return null;
        }
        return (km9) m;
    }

    public final void r3(defpackage.mk0 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi9.r3(mk0):void");
    }

    public final void r4(int i) {
        ArrayList arrayList = this.t3;
        int min = Math.min(arrayList.size() - 1, i + 1);
        for (int max = Math.max(0, i - 1); max <= min; max++) {
            mk0 mk0Var = (mk0) arrayList.get(max);
            if (mk0Var.c > 0) {
                View D1 = D1(mk0Var);
                if (D1 instanceof km9) {
                    ((km9) D1).F();
                }
            }
        }
    }

    public final void s2() {
        D2();
        this.s3 = null;
        this.j4 = null;
        this.k4 = null;
        this.R3 = new ch9(this.w4);
        C4();
        this.R3.j();
        ni9 ni9Var = this.p3;
        if (ni9Var != null) {
            ni9Var.R();
        }
    }

    public final void s4(mk0 mk0Var, p07 p07Var) {
        int i;
        if (mk0Var == null) {
            return;
        }
        if (y3(mk0Var.b)) {
            ArrayList d3 = d3(mk0Var.b);
            ArrayList arrayList = mk0Var.h;
            if (arrayList != null) {
                i = arrayList.indexOf(p07Var);
            } else {
                i = -1;
            }
            if (i >= 0) {
                mk0Var.h.remove(i);
                if (d3 != null && i < d3.size()) {
                    d3.remove(i);
                }
            }
            if (mk0Var.h.isEmpty()) {
                t4(mk0Var);
                return;
            }
            int size = mk0Var.h.size();
            l9c l9cVar = this.g3;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = mk0Var.b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) d3.get(0);
                mk0Var.b = pageBlock;
                pageBlock.caption = pageCaption;
                mk0Var.g = (p07) mk0Var.h.get(0);
                mk0Var.h = null;
                l9cVar.O(true);
                p4(mk0Var);
                return;
            }
            l9cVar.O(true);
            p4(mk0Var);
            return;
        }
        t4(mk0Var);
    }

    public void setAdaptiveLinkDialogs(boolean z) {
        this.r3 = z;
    }

    public void setAllowTapAboveContent(boolean z) {
        this.Z3 = z;
    }

    public void setFileRefParentObject(r47 r47Var) {
        this.q3 = r47Var;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.V3 = new ArrayList();
        ArrayList arrayList = this.t3;
        T2(arrayList, uj9.b(charSequence), this.u3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.V3.add((mk0) arrayList.get(size));
        }
        this.g3.O(false);
    }

    public final boolean t3() {
        int i;
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w() && (i = di9Var.p0) == di9Var.s0 && i >= 0 && i < this.x4.size()) {
            return D4(i) instanceof jf9;
        }
        return false;
    }

    public final void t4(mk0 mk0Var) {
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(mk0Var);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.g3.O(true);
        }
    }

    public final boolean u2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            mk0 mk0Var = (mk0) arrayList.get(i);
            boolean z = mk0Var.i;
            ArrayList arrayList2 = mk0Var.k;
            if (!z) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    Map.EL.merge(hashMap, (Long) arrayList2.get(i2), 1, new yz0((byte) 1));
                }
            }
            i++;
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            mk0 mk0Var2 = (mk0) arrayList.get(i3);
            ArrayList arrayList3 = mk0Var2.k;
            if (arrayList3.size() == 1 && (mk0Var2.b instanceof TL_iv.pageBlockParagraph)) {
                Long l = (Long) arrayList3.get(0);
                l.getClass();
                Integer num = (Integer) hashMap.get(l);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = mk0Var2.b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.u3.remove(l);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    mk0Var2.b = pageblockblockquote;
                    arrayList3.clear();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void u4() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size()) {
                mk0 mk0Var = (mk0) arrayList.get(i);
                if (mk0Var.c > 0 && mk0Var.d > 0 && !B3(mk0Var.b)) {
                    int i2 = mk0Var.c;
                    int i3 = 1;
                    for (int i4 = i - 1; i4 >= 0; i4--) {
                        mk0 mk0Var2 = (mk0) arrayList.get(i4);
                        int i5 = mk0Var2.c;
                        if (i5 < i2) {
                            break;
                        }
                        if (i5 == i2 && !B3(mk0Var2.b)) {
                            if (mk0Var2.d <= 0) {
                                break;
                            }
                            i3++;
                        }
                    }
                    mk0Var.d = i3;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final ArrayList v2() {
        TLRPC.Document document;
        p07 p07Var;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i < arrayList2.size()) {
                mk0 mk0Var = (mk0) arrayList2.get(i);
                if ((mk0Var.b instanceof TL_iv.pageBlockDocument) && (p07Var = mk0Var.g) != null && p07Var.b() && (document2 = mk0Var.g.h) != null) {
                    ((TL_iv.pageBlockDocument) mk0Var.b).document_id = document2.id;
                }
                for (p07 p07Var2 : O3(mk0Var)) {
                    if (p07Var2.b() && (document = p07Var2.h) != null) {
                        long j = document.id;
                        if (j != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j))) {
                            arrayList.add(p07Var2.h);
                        }
                    }
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    public final boolean v3() {
        int i;
        di9 di9Var = this.v3;
        if (di9Var != null && di9Var.w() && (i = di9Var.p0) == di9Var.s0 && u3(B4(i))) {
            return true;
        }
        return false;
    }

    public final void v4(String str) {
        di9 di9Var = this.v3;
        T1(di9Var.p0, di9Var.r0, di9Var.s0, di9Var.u0, str.split("\n", -1));
    }

    public final ArrayList w2(int i, int i2) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2) {
            ArrayList arrayList2 = this.t3;
            if (i >= arrayList2.size()) {
                break;
            }
            for (p07 p07Var : O3((mk0) arrayList2.get(i))) {
                if (p07Var.b() && (document = p07Var.h) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(p07Var.h);
                }
            }
            i++;
        }
        return arrayList;
    }

    public final p07 w4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document P2 = P2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (P2 != null) {
                p07 p07Var = new p07();
                p07Var.c = true;
                p07Var.a = (byte) 2;
                p07Var.h = P2;
                p07Var.i = P2;
                return p07Var;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document P22 = P2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (P22 != null) {
                p07 p07Var2 = new p07();
                p07Var2.d = true;
                p07Var2.a = (byte) 2;
                p07Var2.h = P22;
                return p07Var2;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document P23 = P2(pageblockvideo.video_id);
                if (P23 != null) {
                    p07 p07Var3 = new p07();
                    p07Var3.b = true;
                    p07Var3.a = (byte) 2;
                    p07Var3.h = P23;
                    p07Var3.n = pageblockvideo.spoiler;
                    for (int i = 0; i < P23.attributes.size(); i++) {
                        if (P23.attributes.get(i) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) P23.attributes.get(i);
                            p07Var3.j = tL_documentAttributeVideo.w;
                            p07Var3.k = tL_documentAttributeVideo.h;
                            return p07Var3;
                        }
                    }
                    return p07Var3;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                long j = pageblockphoto.photo_id;
                int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i2 == 0) {
                    photo = null;
                } else {
                    int i3 = 0;
                    loop1: while (true) {
                        if (i3 < this.t3.size()) {
                            for (p07 p07Var4 : O3((mk0) this.t3.get(i3))) {
                                if (p07Var4 != null && (photo = p07Var4.g) != null && photo.id == j) {
                                    break loop1;
                                }
                            }
                            i3++;
                        } else {
                            TL_iv.RichMessage richMessage = this.s3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i4);
                                    i4++;
                                    photo = photo2;
                                    if (photo != null && photo.id == j) {
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = nj9.a;
                            synchronized (nj9.class) {
                                if (i2 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) nj9.a.get(Long.valueOf(j));
                                }
                            }
                        }
                    }
                }
                if (photo != null) {
                    p07 p07Var5 = new p07();
                    p07Var5.a = (byte) 2;
                    p07Var5.g = photo;
                    p07Var5.n = pageblockphoto.spoiler;
                    TLRPC.PhotoSize w = xb4.w(photo.sizes, hl.Y0(false), false, null, false);
                    if (w != null) {
                        p07Var5.j = w.w;
                        p07Var5.k = w.h;
                    }
                    return p07Var5;
                }
            }
        }
        return null;
    }

    public final ArrayList x2(int i, int i2) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2) {
            ArrayList arrayList2 = this.t3;
            if (i >= arrayList2.size()) {
                break;
            }
            for (p07 p07Var : O3((mk0) arrayList2.get(i))) {
                if (p07Var.b() && (photo = p07Var.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(p07Var.g);
                }
            }
            i++;
        }
        return arrayList;
    }

    public final void x4(mk0 mk0Var) {
        TL_iv.PageBlock pageBlock;
        if (this.s3 != null && mk0Var != null && (pageBlock = mk0Var.b) != null) {
            boolean y3 = y3(pageBlock);
            TL_iv.PageBlock pageBlock2 = mk0Var.b;
            if (y3) {
                ArrayList d3 = d3(pageBlock2);
                mk0Var.h = new ArrayList();
                if (d3 != null) {
                    for (int i = 0; i < d3.size(); i++) {
                        p07 w4 = w4((TL_iv.PageBlock) d3.get(i));
                        ArrayList arrayList = mk0Var.h;
                        if (w4 == null) {
                            w4 = new p07();
                        }
                        arrayList.add(w4);
                    }
                    return;
                }
                return;
            }
            p07 w42 = w4(pageBlock2);
            if (w42 != null) {
                mk0Var.g = w42;
            }
        }
    }

    public final ArrayList y2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i < arrayList2.size()) {
                for (p07 p07Var : O3((mk0) arrayList2.get(i))) {
                    if (p07Var.b() && (photo = p07Var.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                        arrayList.add(p07Var.g);
                    }
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    public final ArrayList y4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            mk0 mk0Var = (mk0) obj;
            boolean y3 = y3(mk0Var.b);
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (y3) {
                ArrayList d3 = d3(pageBlock);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (d3 != null) {
                    int size2 = d3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = d3.get(i2);
                        i2++;
                        TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) obj2;
                        p07 w4 = w4(pageBlock2);
                        if (w4 != null) {
                            arrayList3.add(pageBlock2);
                            arrayList4.add(w4);
                        }
                    }
                    d3.clear();
                    d3.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    mk0Var.h = arrayList4;
                    arrayList2.add(mk0Var);
                }
            } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument)) {
                arrayList2.add(mk0Var);
            } else {
                p07 w42 = w4(pageBlock);
                if (w42 != null) {
                    mk0Var.g = w42;
                    arrayList2.add(mk0Var);
                }
            }
        }
        return arrayList2;
    }

    public final void z2() {
        ch9 ch9Var = this.R3;
        if (ch9Var != null) {
            ch9Var.h();
        }
        ArrayList arrayList = this.t3;
        SpannableStringBuilder g = uj9.g(arrayList);
        D2();
        arrayList.clear();
        HashMap hashMap = this.u3;
        hashMap.clear();
        this.s3 = null;
        T2(arrayList, uj9.b(g), hashMap);
        this.g3.O(false);
        ch9 ch9Var2 = this.R3;
        if (ch9Var2 != null) {
            ch9Var2.h();
        }
        ni9 ni9Var = this.p3;
        if (ni9Var != null) {
            ni9Var.onContentChanged();
            ni9Var.R();
        }
    }

    public final void z4(int i, int i2, int i3) {
        dg9 editText;
        if (i >= 0) {
            View m = this.f3.m(i);
            if (m instanceof km9) {
                km9 km9Var = (km9) m;
                if (i2 == 1 && km9Var.l()) {
                    editText = km9Var.getAuthorEditText();
                } else {
                    editText = km9Var.getEditText();
                }
                editText.P();
                editText.setSelection(Math.max(0, Math.min(i3, editText.length())));
            } else if (m instanceof xl9) {
                xl9 xl9Var = (xl9) m;
                dg9 n = xl9Var.n(i2);
                if (n == null) {
                    n = xl9Var.n(0);
                }
                if (n != null) {
                    n.P();
                    n.setSelection(Math.max(0, Math.min(i3, n.length())));
                }
            } else if (m instanceof jf9) {
                dg9 captionEditText = ((jf9) m).getCaptionEditText();
                captionEditText.P();
                captionEditText.setSelection(Math.max(0, Math.min(i3, captionEditText.length())));
            }
        }
    }
}
