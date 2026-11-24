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
public final class ch9 extends q7c {
    public static final ArrayList A4 = new ArrayList();
    public boolean A3;
    public float B3;
    public float C3;
    public float D3;
    public float E3;
    public View F3;
    public b82 G3;
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
    public of9 R3;
    public int S3;
    public ne9 T3;
    public final i82 U3;
    public ArrayList V3;
    public int W3;
    public int X3;
    public int Y3;
    public boolean Z3;
    public ll0 a4;
    public boolean b4;
    public final ug9 c4;
    public final zf9 d4;
    public final vg9 e4;
    public final wg9 f4;
    public final xg9 g4;
    public final IdentityHashMap h4;
    public final IdentityHashMap i4;
    public ll0 j4;
    public ll0 k4;
    public final yg9 l4;
    public final ig9 m4;
    public final int n3;
    public final jg9 n4;
    public final ylb o3;
    public final kg9 o4;
    public final ah9 p3;
    public final lg9 p4;
    public k47 q3;
    public kk9 q4;
    public boolean r3;
    public bu5 r4;
    public TL_iv.RichMessage s3;
    public int s4;
    public final ArrayList t3;
    public int t4;
    public final HashMap u3;
    public final ag9 u4;
    public final qg9 v3;
    public final mg9 v4;
    public final rkb w3;
    public final oo8 w4;
    public int x3;
    public final ArrayList x4;
    public int y3;
    public p99 y4;
    public int z3;
    public int z4;

    public ch9(Context context, int i, ylb ylbVar, ah9 ah9Var) {
        super(context, i, 0, false, new vh8(r2, (byte) 12), new yf9(r2, (byte) 0), null, ylbVar);
        this.r3 = true;
        this.t3 = new ArrayList();
        this.u3 = new HashMap();
        this.x3 = -1;
        this.y3 = -1;
        this.z3 = 0;
        this.U3 = new i82(this, (byte) 3);
        this.Z3 = true;
        this.c4 = new ug9(this);
        this.d4 = new zf9(this);
        this.e4 = new vg9(this);
        this.f4 = new wg9(this);
        this.g4 = new xg9(this);
        this.h4 = new IdentityHashMap();
        this.i4 = new IdentityHashMap();
        this.l4 = new yg9(this);
        this.m4 = new ig9(this);
        this.n4 = new jg9(this);
        this.o4 = new kg9(this);
        this.p4 = new lg9(this);
        this.s4 = -1;
        this.t4 = -1;
        this.u4 = new ag9(this);
        this.v4 = new mg9(this);
        oo8 oo8Var = new oo8(this, (byte) 7);
        this.w4 = oo8Var;
        this.x4 = new ArrayList();
        this.z4 = -1;
        ch9[] ch9VarArr = {this};
        this.n3 = i;
        this.o3 = ylbVar;
        this.p3 = ah9Var;
        this.g3.r = false;
        setClipToPadding(false);
        setClipChildren(false);
        E1(new vh8(this, (byte) 13), false);
        setReorderLongPressEnabled(false);
        z1(true);
        qg9 qg9Var = new qg9(this, ah9Var);
        this.v3 = qg9Var;
        qg9Var.Q(this);
        qg9Var.z0 = this.f3;
        rkb m = qg9Var.m(context);
        this.w3 = m;
        gm.B2(m);
        qg9Var.D = new sg9(this, ah9Var);
        j(new bk1(this, ah9Var, (byte) 11));
        this.R3 = new of9(oo8Var);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockDivider) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockButtonRow) && !(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            return false;
        }
        return true;
    }

    public static boolean B3(ll0 ll0Var) {
        if (ll0Var != null && !ll0Var.i && !t3(ll0Var) && (ll0Var.b instanceof TL_iv.pageBlockParagraph) && ll0Var.c == 0 && ll0Var.d == 0 && !ll0Var.e && ll0Var.k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void F2(ll0 ll0Var, ArrayList arrayList) {
        int i;
        int i2;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j;
        TL_iv.PageBlock pageBlock = ll0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            i07 i07Var = ll0Var.g;
            if (i07Var != null && i07Var.b()) {
                TL_iv.PageBlock pageBlock2 = ll0Var.b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        ll0Var.b.caption.text = new TL_iv.textEmpty();
                        ll0Var.b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(ll0Var.b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            i07 i07Var2 = ll0Var.g;
            if (i07Var2 != null && i07Var2.b()) {
                TL_iv.PageBlock pageBlock3 = ll0Var.b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        ll0Var.b.caption.text = new TL_iv.textEmpty();
                        ll0Var.b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(ll0Var.b);
                }
            }
        } else {
            boolean x3 = x3(pageBlock);
            TL_iv.PageBlock pageBlock4 = ll0Var.b;
            if (x3) {
                ArrayList c3 = c3(pageBlock4);
                List N3 = N3(ll0Var);
                ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
                for (int i3 = 0; c3 != null && i3 < c3.size() && i3 < N3.size(); i3++) {
                    TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) c3.get(i3);
                    if (((i07) N3.get(i3)).b()) {
                        if (pageBlock5 instanceof TL_iv.pageBlockPhoto) {
                            j = ((TL_iv.pageBlockPhoto) pageBlock5).photo_id;
                        } else if (pageBlock5 instanceof TL_iv.pageBlockVideo) {
                            j = ((TL_iv.pageBlockVideo) pageBlock5).video_id;
                        } else {
                            j = 0;
                        }
                        if (j != 0) {
                            sd9.d(pageBlock5);
                            arrayList2.add(pageBlock5);
                        }
                    }
                }
                if (arrayList2.size() >= 2) {
                    if (ll0Var.b instanceof TL_iv.pageBlockSlideshow) {
                        TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                        pageblockslideshow.items = arrayList2;
                        pageblockslideshow.caption = ll0Var.b.caption;
                        pageblockcollage = pageblockslideshow;
                    } else {
                        TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                        pageblockcollage2.items = arrayList2;
                        pageblockcollage2.caption = ll0Var.b.caption;
                        pageblockcollage = pageblockcollage2;
                    }
                    sd9.d(pageblockcollage);
                    arrayList.add(pageblockcollage);
                } else if (arrayList2.size() == 1) {
                    arrayList.add(arrayList2.get(0));
                }
            } else if (pageBlock4 instanceof TL_iv.pageBlockAudio) {
                i07 i07Var3 = ll0Var.g;
                if (i07Var3 != null && i07Var3.b()) {
                    TL_iv.PageBlock pageBlock6 = ll0Var.b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            ll0Var.b.caption.text = new TL_iv.textEmpty();
                            ll0Var.b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(ll0Var.b);
                    }
                }
            } else if (pageBlock4 instanceof TL_iv.pageBlockDocument) {
                i07 i07Var4 = ll0Var.g;
                if (i07Var4 != null && (document = i07Var4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock4).document_id = document.id;
                }
                if (i07Var4 != null && i07Var4.b()) {
                    TL_iv.PageBlock pageBlock7 = ll0Var.b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        sd9.d(pageBlock7);
                        arrayList.add(ll0Var.b);
                    }
                }
            } else if (pageBlock4 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock4;
                int i4 = th9.N;
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
                    arrayList.add(ll0Var.b);
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
                                    fhb.c(pagetablecell, "");
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
                if (R4(pageblocktable)) {
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

    public static boolean G2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static void H2(TL_iv.PageBlock pageBlock) {
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

    public static void J2(ArrayList arrayList, ArrayList arrayList2, int i, boolean z, int i2, boolean z2, boolean z3) {
        boolean z4 = false;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i3);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z4) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            O1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i, i2, z2, z3);
                        } else {
                            ll0 ll0Var = new ll0(pageBlock, i, i2);
                            ll0Var.e = z2;
                            ll0Var.f = z3;
                            arrayList.add(ll0Var);
                        }
                        z4 = true;
                    } else {
                        arrayList.add(new ll0(pageBlock, i, z ? 1 : 0));
                    }
                } else {
                    if (!z4) {
                        O1(arrayList, null, i, i2, z2, z3);
                        z4 = true;
                    }
                    K2(arrayList, pageBlock, i + 1);
                }
            }
        }
        if (!z4) {
            O1(arrayList, null, i, i2, z2, z3);
        }
    }

    public static TL_iv.PageBlock J3(ll0 ll0Var, i07 i07Var) {
        int i;
        boolean x3 = x3(ll0Var.b);
        TL_iv.PageBlock pageBlock = ll0Var.b;
        if (x3) {
            ArrayList c3 = c3(pageBlock);
            ArrayList arrayList = ll0Var.h;
            if (arrayList != null) {
                i = arrayList.indexOf(i07Var);
            } else {
                i = -1;
            }
            if (i >= 0 && c3 != null && i < c3.size()) {
                return (TL_iv.PageBlock) c3.get(i);
            }
            return null;
        }
        return pageBlock;
    }

    public static void K2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i) {
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
                    O1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i, i3, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i4 = i3;
                    J2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i, true, i4, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
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
                O1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                J2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static void K3(defpackage.ch9[] r20, java.util.ArrayList r21, defpackage.l7c r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.K3(ch9[], java.util.ArrayList, l7c):void");
    }

    public static List N3(ll0 ll0Var) {
        if (ll0Var == null) {
            return Collections.EMPTY_LIST;
        }
        if (x3(ll0Var.b)) {
            ArrayList arrayList = ll0Var.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        i07 i07Var = ll0Var.g;
        if (i07Var != null) {
            return Collections.singletonList(i07Var);
        }
        return Collections.EMPTY_LIST;
    }

    public static void O1(ArrayList arrayList, TL_iv.RichText richText, int i, int i2, boolean z, boolean z2) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        ll0 ll0Var = new ll0(pageblockparagraph, i, i2);
        ll0Var.e = z;
        ll0Var.f = z2;
        arrayList.add(ll0Var);
    }

    public static ne9 O3(View view) {
        if (view instanceof xk9) {
            return ((xk9) view).getEditText();
        }
        if (view instanceof td9) {
            return ((td9) view).getCaptionEditText();
        }
        if (view instanceof be9) {
            return ((be9) view).getEditText();
        }
        return null;
    }

    public static TL_iv.PageBlock P3(TL_iv.PageBlock pageBlock) {
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

    public static kk9 Q2(ne9 ne9Var) {
        for (ViewParent parent = ne9Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof kk9) {
                return (kk9) parent;
            }
        }
        return null;
    }

    public static i07 Q3(jo6 jo6Var, String str) {
        boolean z;
        int i;
        i07 i07Var = new i07();
        i07Var.b = jo6Var.b;
        i07Var.e = str;
        i07Var.j = jo6Var.F;
        i07Var.k = jo6Var.G;
        String str2 = jo6Var.h;
        int i2 = 0;
        if (str2 != null && str != null && str.equals(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = jo6Var.J;
        }
        i07Var.l = i;
        if (!z) {
            i2 = jo6Var.K;
        }
        i07Var.m = i2;
        i07Var.a = (byte) 1;
        i07Var.f = 0.0f;
        return i07Var;
    }

    public static boolean R4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(zk9.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i = 0; i < pageblocktable.rows.size(); i++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i);
            for (int i2 = 0; i2 < pagetablerow.cells.size(); i2++) {
                if (!fhb.g(pagetablerow.cells.get(i2)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void S2(ArrayList arrayList, ArrayList arrayList2, Map map) {
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
                        arrayList.add(new ll0(pageblockdetails, 0, 0));
                        int size2 = arrayList.size();
                        S2(arrayList, pageblockdetails.blocks, map);
                        if (arrayList.size() == size2) {
                            arrayList.add(new ll0(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                        ll0 ll0Var = new ll0(new TL_iv.pageBlockParagraph(), 0, 0);
                        ll0Var.i = true;
                        arrayList.add(ll0Var);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a = wd9.a();
                        S2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((ll0) arrayList.get(size3)).k.add(0, Long.valueOf(a));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a), pageblockblockquoteblocks.caption);
                        }
                    } else {
                        arrayList.add(new ll0(pageBlock, 0, 0));
                    }
                } else {
                    K2(arrayList, pageBlock, 1);
                }
            }
        }
    }

    public static FrameLayout S4(kk9 kk9Var, boolean z) {
        int i;
        nk9 m;
        fhb model = kk9Var.getModel();
        if (model != null) {
            int i2 = Integer.MAX_VALUE;
            if (z) {
                i = -1;
            } else {
                i = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : kk9Var.getSelectedCells()) {
                int a = model.a(pagetablecell2);
                int o = z ? (fhb.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z ? o < i || (o == i && a < i2) : o > i || (o == i && a < i2)) {
                    pagetablecell = pagetablecell2;
                    i2 = a;
                    i = o;
                }
            }
            if (pagetablecell != null && (m = kk9Var.getGrid().m(pagetablecell)) != null) {
                return m;
            }
        }
        return kk9Var;
    }

    public static ArrayList T2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        S2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static ArrayList c3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static int[] e5(kk9 kk9Var) {
        int i;
        int i2;
        fhb fhbVar = kk9Var.G;
        if (fhbVar != null) {
            i = fhbVar.g.size();
        } else {
            i = 0;
        }
        while (i >= 0) {
            ne9 n = kk9Var.n(i);
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

    public static boolean h3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !z3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static boolean h4(ne9 ne9Var, float f, float f2) {
        int[] iArr;
        if (ne9Var != null && ne9Var.getVisibility() == 0) {
            ne9Var.getLocationOnScreen(new int[2]);
            float f3 = f - iArr[0];
            float f4 = f2 - iArr[1];
            if (f3 >= 0.0f && f4 >= 0.0f && f3 <= ne9Var.getWidth() && f4 <= ne9Var.getHeight()) {
                int offsetForPosition = ne9Var.getOffsetForPosition(f3, f4);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                ne9Var.P();
                ne9Var.setSelection(Math.max(0, Math.min(offsetForPosition, ne9Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int l4(int i, ll0 ll0Var, boolean z) {
        int i2;
        if (ll0Var == null) {
            return gm.L(2.0f);
        }
        if (z) {
            i2 = ll0Var.l;
        } else {
            i2 = ll0Var.m;
        }
        int size = ll0Var.k.size() - i2;
        return hg9.y(16.0f, Math.max(0, i - size), gm.L(2.0f));
    }

    public static int m4(ll0 ll0Var, ll0 ll0Var2) {
        ArrayList arrayList = ll0Var.k;
        int i = 0;
        if (ll0Var2 == null) {
            return 0;
        }
        ArrayList arrayList2 = ll0Var2.k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i < min && ((Long) arrayList.get(i)).equals(arrayList2.get(i))) {
            i++;
        }
        return i;
    }

    public static boolean r3(int i) {
        if (i != 21 && i != 22 && i != 19 && i != 20) {
            return false;
        }
        return true;
    }

    public static int s2(int i) {
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

    public void setEditTextsLocked(boolean z) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof xk9) {
                ((xk9) childAt).setLocked(z);
            } else if (childAt instanceof kk9) {
                ((kk9) childAt).setLocked(z);
            } else if (childAt instanceof td9) {
                ((td9) childAt).getCaptionEditText().setLocked(z);
            } else if (childAt instanceof be9) {
                ((be9) childAt).setLocked(z);
            } else if (childAt instanceof fe9) {
                childAt.invalidate();
            }
        }
    }

    public static boolean t3(ll0 ll0Var) {
        if (ll0Var != null && (ll0Var.b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean v3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || A3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !xk9.y(pageBlock).isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean w3(TL_iv.PageBlock pageBlock) {
        if (!A3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean x3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean y3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !x3(pageBlock)) {
            return false;
        }
        return true;
    }

    public final void A2() {
        ArrayList arrayList;
        qg9 qg9Var = this.v3;
        int i = qg9Var.p0;
        int i2 = qg9Var.r0;
        int i3 = qg9Var.s0;
        if (!S1(i, i2, i3, qg9Var.u0, new String[]{""})) {
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
                ll0 ll0Var = (ll0) arrayList3.get(max);
                if (ll0Var.t == 0 && arrayList.indexOf(ll0Var) >= 0) {
                    arrayList2.add(ll0Var);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                of9 of9Var = this.R3;
                if (of9Var != null) {
                    of9Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new ll0(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.u3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        hashSet.addAll(((ll0) arrayList.get(i4)).k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                t2();
                S3();
                t4();
                qg9Var.e(false);
                this.g3.O(false);
                of9 of9Var2 = this.R3;
                if (of9Var2 != null) {
                    of9Var2.h();
                }
                post(new vf9(this, (ll0) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), (byte) 0));
            }
        }
    }

    public final ll0 A4(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.x4;
            if (i < arrayList.size()) {
                return (ll0) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    public final boolean B2() {
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w()) {
            qg9Var.e(false);
            return true;
        } else if (this.q4 == null) {
            return false;
        } else {
            I2();
            return true;
        }
    }

    public final void B4() {
        ArrayList arrayList = this.t3;
        arrayList.clear();
        arrayList.add(new ll0(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new ll0(new TL_iv.pageBlockParagraph(), 0, 0));
        this.g3.O(false);
    }

    public final void C2() {
        qg9 qg9Var = this.v3;
        if (qg9Var != null) {
            qg9Var.e(true);
        }
        I2();
        j3();
        IdentityHashMap identityHashMap = this.h4;
        for (fi9 fi9Var : identityHashMap.values()) {
            fi9Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.i4;
        for (bi9 bi9Var : identityHashMap2.values()) {
            bi9Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean C3() {
        int i;
        ll0 A42;
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w() && (i = qg9Var.p0) == qg9Var.s0 && i >= 0 && i < this.x4.size() && qg9Var.q0 == 1 && qg9Var.t0 == 1 && (A42 = A4(i)) != null && xk9.n(A42.b)) {
            return true;
        }
        return false;
    }

    public final View C4(int i) {
        if (i < 0) {
            return null;
        }
        return this.f3.m(i);
    }

    @Override
    public final boolean D1() {
        return this.b4;
    }

    public final int D2(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ArrayList arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (t3((ll0) arrayList.get(i3))) {
                i2++;
            } else if (((ll0) arrayList.get(i3)).i) {
                i2--;
            }
        }
        return i2;
    }

    public final boolean D3(int i, int i2) {
        if (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i2 < arrayList.size() && i <= i2) {
                boolean z = false;
                while (i <= i2) {
                    ll0 ll0Var = (ll0) arrayList.get(i);
                    if (!ll0Var.i && !t3(ll0Var)) {
                        if (!ll0Var.k.isEmpty() || xk9.n(ll0Var.b)) {
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

    public final int[] D4() {
        int i;
        ArrayList arrayList = this.t3;
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w()) {
            int indexOf = arrayList.indexOf(A4(qg9Var.p0));
            int indexOf2 = arrayList.indexOf(A4(qg9Var.s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        ll0 M2 = M2();
        if (M2 != null) {
            i = arrayList.indexOf(M2);
        } else {
            i = -1;
        }
        if (i >= 0) {
            return new int[]{i, i};
        }
        return null;
    }

    public final ne9 E2(int i) {
        if (!t3(A4(i))) {
            return null;
        }
        View C4 = C4(i);
        if (!(C4 instanceof be9)) {
            return null;
        }
        return ((be9) C4).getEditText();
    }

    public final boolean E3() {
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w()) {
            int i = qg9Var.p0;
            int i2 = qg9Var.s0;
            if (i >= 0 && i2 >= 0 && i2 >= i) {
                boolean z = false;
                while (i <= i2) {
                    ll0 A42 = A4(i);
                    if (A42 != null) {
                        if (y3(A42.b)) {
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

    public final boolean E4() {
        int i;
        int i2;
        int i3;
        int i4;
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w()) {
            if (H3()) {
                int i5 = qg9Var.p0;
                int i6 = qg9Var.q0;
                int i7 = qg9Var.t0;
                int i8 = qg9Var.r0;
                int i9 = qg9Var.u0;
                for (int i10 = i6; i10 <= i7; i10++) {
                    ne9 Q4 = Q4(i5, i10);
                    if (Q4 != null) {
                        int length = Q4.length();
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
            } else if (u3()) {
                ne9 E2 = E2(qg9Var.p0);
                if (E2 != null && Math.max(0, Math.min(Math.min(qg9Var.r0, qg9Var.u0), E2.length())) < Math.max(0, Math.min(Math.max(qg9Var.r0, qg9Var.u0), E2.length()))) {
                    return true;
                }
            } else if (s3()) {
                ne9 o2 = o2(qg9Var.p0);
                if (o2 != null) {
                    int i11 = qg9Var.r0;
                    int i12 = qg9Var.u0;
                    if (Math.max(0, Math.min(Math.min(i11, i12), o2.length())) < Math.max(0, Math.min(Math.max(i11, i12), o2.length()))) {
                        return true;
                    }
                }
            } else {
                boolean C3 = C3();
                int i13 = qg9Var.p0;
                if (C3) {
                    ne9 k4 = k4(i13);
                    if (k4 != null) {
                        int i14 = qg9Var.r0;
                        int i15 = qg9Var.u0;
                        if (Math.max(0, Math.min(Math.min(i14, i15), k4.length())) < Math.max(0, Math.min(Math.max(i14, i15), k4.length()))) {
                            return true;
                        }
                    }
                } else {
                    int i16 = qg9Var.s0;
                    int i17 = qg9Var.r0;
                    int i18 = qg9Var.u0;
                    if (i13 >= 0 && i16 >= 0 && i16 >= i13 && i16 < this.x4.size()) {
                        for (int i19 = i13; i19 <= i16; i19++) {
                            ll0 A42 = A4(i19);
                            if (A42 != null) {
                                if (A42.t == 0) {
                                    TL_iv.PageBlock pageBlock = A42.b;
                                    if (!w3(pageBlock)) {
                                        continue;
                                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                        continue;
                                    }
                                }
                                int d2 = d2(i19);
                                if (i19 == i13) {
                                    i = i17;
                                } else {
                                    i = 0;
                                }
                                if (i19 == i16) {
                                    i2 = i18;
                                } else {
                                    i2 = d2;
                                }
                                if (Math.max(0, Math.min(i, d2)) < Math.max(0, Math.min(i2, d2))) {
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
    public final void F1() {
        ah9 ah9Var = this.p3;
        if (ah9Var != null) {
            ah9Var.q();
        }
    }

    public final boolean F3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.F3(int, int, int, int, int):boolean");
    }

    public final int[] F4() {
        qg9 qg9Var = this.v3;
        if (qg9Var != null) {
            int i = qg9Var.p0;
            int i2 = qg9Var.s0;
            if (i >= 0 && i2 >= 0) {
                ll0 A42 = A4(i);
                ll0 A43 = A4(i2);
                if (A42 != null && A43 != null) {
                    ArrayList arrayList = this.t3;
                    int indexOf = arrayList.indexOf(A42);
                    int indexOf2 = arrayList.indexOf(A43);
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
    public final void G1() {
        ah9 ah9Var = this.p3;
        if (ah9Var != null) {
            ah9Var.A();
        }
        z4();
    }

    public final boolean G3(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        boolean z = false;
        for (int i9 = i3; i9 <= i5; i9++) {
            ne9 Q4 = Q4(i2, i9);
            if (Q4 != null) {
                int length = Q4.length();
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
                } else if ((Q4.c(max, max2) & i) == 0) {
                    return false;
                } else {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void G4(ne9 ne9Var) {
        ne9Var.c2 = this.r3;
        ne9Var.D(new b82(this, (byte) 4));
    }

    @Override
    public final void H1(u69 u69Var) {
        ah9 ah9Var = this.p3;
        if (ah9Var != null && u69Var != null) {
            View view = u69Var.a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.b4 = ah9Var.a(view.getHeight() + iArr[1]);
        }
    }

    public final boolean H3() {
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w()) {
            int i = qg9Var.p0;
            int i2 = qg9Var.s0;
            ll0 A42 = A4(i);
            if (i == i2 && A42 != null && (A42.b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H4(defpackage.kk9 r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.H4(kk9):void");
    }

    @Override
    public final void I1(u69 u69Var) {
        ll0 ll0Var = this.a4;
        this.a4 = null;
        this.b4 = false;
        if (ll0Var != null) {
            of9 of9Var = this.R3;
            if (of9Var != null) {
                of9Var.d();
            }
            s4(ll0Var);
            of9 of9Var2 = this.R3;
            if (of9Var2 != null) {
                of9Var2.h();
            }
            ah9 ah9Var = this.p3;
            if (ah9Var != null) {
                ah9Var.onContentChanged();
            }
        } else if (u69Var != null) {
            View view = u69Var.a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final void I2() {
        if (this.J3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.J3 = false;
        this.K3 = false;
        this.L3 = null;
        this.M3 = null;
        bu5 bu5Var = this.r4;
        if (bu5Var != null) {
            this.r4 = null;
            bu5Var.u();
        }
        kk9 kk9Var = this.q4;
        if (kk9Var != null) {
            LinkedHashSet linkedHashSet = kk9Var.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                kk9Var.w.invalidate();
                kk9Var.v();
            }
            this.q4 = null;
        }
        this.t4 = -1;
        this.s4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean I3() {
        gs gsVar = oc7.r1(this.n3).l4;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            i2 += N3((ll0) arrayList.get(i)).size();
            i++;
        }
        ArrayList V2 = V2();
        ?? obj = new Object();
        obj.d = i2;
        obj.b = V2.size() + obj.b;
        for (int i3 = 0; i3 < V2.size(); i3++) {
            pf9.b((TL_iv.PageBlock) V2.get(i3), 1, obj);
        }
        if (obj.a > gsVar.Z.f() || obj.b > gsVar.a0.f() || obj.c > gsVar.b0.f() || obj.d > gsVar.c0.f() || obj.e > gsVar.d0.f()) {
            return false;
        }
        return true;
    }

    public final xk9 I4() {
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w()) {
            int i = qg9Var.p0;
            int i2 = qg9Var.s0;
            ll0 A42 = A4(i);
            if (i == i2 && A42 != null && w3(A42.b)) {
                return q2(i);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void J1(u69 u69Var) {
        int b;
        c6c G;
        ll0 ll0Var = null;
        if (u69Var != null && (b = u69Var.b()) >= 0 && (G = this.g3.G(b)) != null) {
            Object obj = G.H;
            if (obj instanceof ll0) {
                ll0Var = (ll0) obj;
            }
        }
        this.a4 = ll0Var;
        this.b4 = false;
        ah9 ah9Var = this.p3;
        if (ah9Var != null) {
            ah9Var.f();
        }
    }

    public final Editable J4(int i, int i2, int i3, int i4) {
        if (i == i3) {
            if (t3(A4(i))) {
                ne9 E2 = E2(i);
                if (E2 != null) {
                    return E2.getText();
                }
                return null;
            } else if (C3()) {
                ne9 k4 = k4(i);
                if (k4 != null) {
                    return k4.getText();
                }
                return null;
            } else {
                ll0 A42 = A4(i);
                if (A42 != null && w3(A42.b)) {
                    int d2 = d2(i);
                    if (hg9.w(i2, i4, d2, 0) < hg9.g(i2, i4, d2, 0)) {
                        xk9 q2 = q2(i);
                        if (q2 != null) {
                            return q2.getEditText().getText();
                        }
                        return xk9.z(A42.b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock K4(defpackage.ll0 r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.K4(ll0, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean L1(ll0 ll0Var, ll0 ll0Var2, int i) {
        float f;
        if (w3(ll0Var.b)) {
            TL_iv.PageBlock pageBlock = ll0Var2.b;
            ArrayList arrayList = ll0Var2.k;
            if (w3(pageBlock)) {
                View C1 = C1(ll0Var2);
                if (C1 instanceof xk9) {
                    ne9 editText = ((xk9) C1).getEditText();
                    if (editText.isFocused()) {
                        SpannableStringBuilder z = xk9.z(ll0Var.b);
                        Paint.FontMetricsInt fontMetricsInt = editText.getPaint().getFontMetricsInt();
                        if (y3(ll0Var.b)) {
                            f = 0.85f;
                        } else {
                            f = 1.0f;
                        }
                        CharSequence n = gw3.n(z, fontMetricsInt, false, null, 0, f, 0);
                        int length = n.length();
                        Editable text = editText.getText();
                        if (text != null && n.length() != 0) {
                            editText.i2 = true;
                            text.insert(0, n);
                            editText.i2 = false;
                        }
                        xk9.b(ll0Var.b, editText.getText());
                        ll0Var2.b = ll0Var.b;
                        ll0Var2.c = ll0Var.c;
                        ll0Var2.d = ll0Var.d;
                        ll0Var2.e = ll0Var.e;
                        ll0Var2.f = ll0Var.f;
                        arrayList.clear();
                        arrayList.addAll(ll0Var.k);
                        this.t3.remove(i - 1);
                        t2();
                        t4();
                        c5();
                        editText.setSelection(Math.min(length, editText.length()));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final ne9 L2() {
        View findFocus = findFocus();
        if (findFocus instanceof ne9) {
            return (ne9) findFocus;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof xk9) {
                return ((xk9) childAt).getEditText();
            }
        }
        return null;
    }

    public final int[] L3(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = this.V3.size();
            ArrayList arrayList = this.V3;
            if (i2 < size) {
                int length = xk9.y(((ll0) arrayList.get(i2)).b).length();
                if (i <= i3 + length) {
                    return new int[]{i2, i - i3};
                }
                i3 += length + 1;
                i2++;
            } else {
                int size2 = arrayList.size() - 1;
                return new int[]{size2, xk9.y(((ll0) this.V3.get(size2)).b).length()};
            }
        }
    }

    public final boolean L4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.L4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final ll0 M2() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof xk9) {
                xk9 xk9Var = (xk9) childAt;
                if (xk9Var.getEditText().isFocused() || (xk9Var.l() && xk9Var.h.isFocused())) {
                    return xk9Var.getRow();
                }
            }
        }
        return null;
    }

    public final int M3(int i) {
        int i2 = 1;
        int i3 = i + 1;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i3 < arrayList.size()) {
                ll0 ll0Var = (ll0) arrayList.get(i3);
                if (t3(ll0Var)) {
                    i2++;
                } else if (ll0Var.i && i2 - 1 == 0) {
                    return i3;
                }
                i3++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final void M4(View view) {
        u69 T;
        int b;
        if (view != null && this.h3 != null && this.k3 && (T = T(view)) != null && (b = T.b()) >= 0 && this.g3.H(b) >= 0) {
            this.I3 = true;
            qg9 qg9Var = this.v3;
            if (qg9Var.w()) {
                qg9Var.e(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.h3.s(T);
        }
    }

    public final void N1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.N1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final kk9 N2() {
        View findFocus = findFocus();
        if (findFocus instanceof ne9) {
            return Q2((ne9) findFocus);
        }
        return null;
    }

    public final void N4(ll0 ll0Var, i07 i07Var, jo6 jo6Var) {
        float f;
        fi9 fi9Var = (fi9) this.h4.remove(i07Var);
        if (fi9Var != null) {
            fi9Var.b();
        }
        IdentityHashMap identityHashMap = this.i4;
        bi9 bi9Var = (bi9) identityHashMap.remove(i07Var);
        if (bi9Var != null) {
            bi9Var.a();
        }
        i07Var.a = (byte) 1;
        i07Var.f = 0.0f;
        bi9 bi9Var2 = new bi9(this.n3, jo6Var, new in3((ViewGroup) this, (Object) i07Var, (Object) ll0Var, (byte) 28));
        identityHashMap.put(i07Var, bi9Var2);
        if (!bi9Var2.f && !bi9Var2.h && !bi9Var2.n) {
            bi9Var2.f = true;
            int i = jo6Var.F;
            String str = jo6Var.I;
            int i2 = jo6Var.G;
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
            rcc rccVar = null;
            r9 = null;
            ArrayList arrayList = null;
            rccVar = null;
            if (i > 0 && i2 > 0) {
                int i3 = jo6Var.J;
                if (i3 == 90 || i3 == 270) {
                    int i4 = i2;
                    i2 = i;
                    i = i4;
                }
                rcc rccVar2 = new rcc();
                rccVar2.a = 0L;
                rccVar2.d = 0.0f;
                long j = 3000;
                rccVar2.b = Math.min(3000L, jo6Var.t);
                while (true) {
                    long j2 = rccVar2.b;
                    if (j2 > 0) {
                        if (j2 < 1000) {
                            rccVar2.b = j2 << 1;
                        } else {
                            j = j2;
                            break;
                        }
                    } else {
                        rccVar2.b = 3000L;
                        break;
                    }
                }
                rccVar2.e = (float) j;
                rccVar2.f = 1;
                rccVar2.g = 0;
                rccVar2.o = str;
                rccVar2.q = (int) ((f / 1000.0f) * 115200.0f);
                rccVar2.r = j;
                rccVar2.n = 30;
                rccVar2.v = j;
                rccVar2.A = jo6Var.o;
                String str2 = jo6Var.k;
                if (str2 != null) {
                    rccVar2.B = str2;
                    ArrayList arrayList2 = jo6Var.q;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList = jo6Var.q;
                    }
                    rccVar2.G = arrayList;
                } else {
                    rccVar2.B = jo6Var.j;
                    rccVar2.G = jo6Var.p;
                }
                rccVar2.I = true;
                ao6 ao6Var = jo6Var.A;
                if (ao6Var != null) {
                    int i5 = ao6Var.k;
                    if (i5 == 90 || i5 == 270) {
                        int i6 = i2;
                        i2 = i;
                        i = i6;
                    }
                    i = (int) (i * ao6Var.e);
                    i2 = (int) (i2 * ao6Var.f);
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
                rccVar2.k = i7;
                rccVar2.h = i7;
                rccVar2.l = i8;
                rccVar2.i = i8;
                rccVar2.m = -1;
                rccVar2.t = true;
                rccVar2.c = 0L;
                rccVar = rccVar2;
            }
            bi9Var2.d = rccVar;
            if (rccVar != null && rccVar.b()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 1;
                String absolutePath = new File(bc4.z(4), "rich_anim_" + gda.p() + ".mp4").getAbsolutePath();
                bi9Var2.e = absolutePath;
                tL_message.attachPath = absolutePath;
                k47 k47Var = new k47(bi9Var2.a, tL_message, null, false, false);
                bi9Var2.c = k47Var;
                k47Var.r0 = bi9Var2.d;
                nm7 f4 = nm7.f(bi9Var2.a);
                f4.a(bi9Var2, nm7.a2);
                f4.a(bi9Var2, nm7.b2);
                f4.a(bi9Var2, nm7.c2);
                MediaController.w().g0(bi9Var2.c, false, false, false);
                return;
            }
            bi9Var2.b();
        }
    }

    public final TLRPC.Document O2(long j) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        TLRPC.Document document2 = null;
        if (i == 0) {
            return null;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.t3.size(); i3++) {
            for (i07 i07Var : N3((ll0) this.t3.get(i3))) {
                if (i07Var != null && (document = i07Var.h) != null && document.id == j) {
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
        HashMap hashMap = ai9.a;
        synchronized (ai9.class) {
            if (i != 0) {
                document2 = (TLRPC.Document) ai9.b.get(Long.valueOf(j));
            }
        }
        return document2;
    }

    public final void O4(ll0 ll0Var, i07 i07Var, String str, boolean z, int i, int i2, int i3) {
        IdentityHashMap identityHashMap = this.h4;
        fi9 fi9Var = (fi9) identityHashMap.remove(i07Var);
        if (fi9Var != null) {
            fi9Var.b();
        }
        fi9 fi9Var2 = new fi9(this.n3, str, z, i, i2, i3, new pg9(this, i07Var, ll0Var));
        identityHashMap.put(i07Var, fi9Var2);
        fi9Var2.d();
    }

    public final void P1(ll0 ll0Var, jo6 jo6Var) {
        TL_iv.PageBlock pageblockvideo;
        ch9 ch9Var;
        if (ll0Var != null && z3(ll0Var.b)) {
            String str = jo6Var.h;
            if (str == null) {
                str = jo6Var.I;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                of9 of9Var = this.R3;
                if (of9Var != null) {
                    of9Var.d();
                }
                i07 Q3 = Q3(jo6Var, str2);
                boolean c = bi9.c(jo6Var);
                if (!jo6Var.b && !c) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (x3(ll0Var.b)) {
                    c3(ll0Var.b).add(pageblockvideo);
                    ArrayList arrayList = ll0Var.h;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        ll0Var.h = arrayList;
                    }
                    arrayList.add(Q3);
                } else {
                    i07 i07Var = ll0Var.g;
                    if (i07Var != null && i07Var.a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = ll0Var.b.caption;
                        sd9.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
                        pageblockcollage.items = arrayList2;
                        arrayList2.add(ll0Var.b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList3 = new ArrayList();
                        ll0Var.h = arrayList3;
                        arrayList3.add(ll0Var.g);
                        ll0Var.h.add(Q3);
                        ll0Var.g = null;
                        ll0Var.b = pageblockcollage;
                    } else {
                        ll0Var.b = pageblockvideo;
                        ll0Var.g = Q3;
                    }
                }
                this.g3.O(false);
                o4(ll0Var);
                if (c) {
                    N4(ll0Var, Q3, jo6Var);
                    ch9Var = this;
                } else {
                    ch9Var = this;
                    ch9Var.O4(ll0Var, Q3, str2, jo6Var.b, jo6Var.F, jo6Var.G, jo6Var.E);
                }
                of9 of9Var2 = ch9Var.R3;
                if (of9Var2 != null) {
                    of9Var2.h();
                }
                ch9Var.p3.onContentChanged();
            }
        }
    }

    public final int P2(int i, int i2) {
        while (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            ll0 ll0Var = (ll0) arrayList.get(i);
            if (!ll0Var.i) {
                int i3 = -1;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    ll0 ll0Var2 = (ll0) arrayList.get(i5);
                    if (t3(ll0Var2)) {
                        i4++;
                        if (i3 == -1 && !((TL_iv.pageBlockDetails) ll0Var2.b).open) {
                            i3 = i4;
                        }
                    } else if (ll0Var2.i) {
                        if (i3 != -1 && i4 == i3) {
                            i3 = -1;
                        }
                        i4--;
                    }
                }
                if (i3 == -1) {
                    TL_iv.PageBlock pageBlock = ll0Var.b;
                    if (!A3(pageBlock) || h3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
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

    public final Editable P4(ll0 ll0Var) {
        View C1 = C1(ll0Var);
        if (C1 instanceof xk9) {
            return ((xk9) C1).getEditText().getText();
        }
        return xk9.z(ll0Var.b);
    }

    public final void Q1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            of9 of9Var = this.R3;
            if (of9Var != null) {
                of9Var.d();
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
            S2(arrayList4, richMessage.blocks, this.u3);
            if (!arrayList4.isEmpty()) {
                for (int i = 0; i < arrayList4.size(); i++) {
                    w4((ll0) arrayList4.get(i));
                }
                ArrayList arrayList5 = this.t3;
                int size = arrayList5.size();
                ll0 M2 = M2();
                if (M2 != null && (indexOf = arrayList5.indexOf(M2)) >= 0) {
                    TL_iv.PageBlock pageBlock = M2.b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && xk9.y(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                S3();
                t4();
                this.g3.O(false);
                of9 of9Var2 = this.R3;
                if (of9Var2 != null) {
                    of9Var2.h();
                }
                ah9 ah9Var = this.p3;
                if (ah9Var != null) {
                    ah9Var.onContentChanged();
                }
            }
        }
    }

    public final ne9 Q4(int i, int i2) {
        View C4 = C4(i);
        if (!(C4 instanceof kk9)) {
            return null;
        }
        return ((kk9) C4).n(i2);
    }

    public final ll0 R1(ll0 ll0Var, int i) {
        int i2;
        ArrayList arrayList = this.x4;
        int indexOf = arrayList.indexOf(ll0Var);
        if (indexOf >= 0 && (i2 = indexOf + i) >= 0 && i2 < arrayList.size()) {
            ll0 ll0Var2 = (ll0) arrayList.get(i2);
            if (ll0Var2.t != 0) {
                return ll0Var2;
            }
            return null;
        }
        return null;
    }

    public final void R2() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof xk9) {
                xk9 xk9Var = (xk9) childAt;
                xk9Var.f.K();
                xk9Var.h.K();
            } else if (childAt instanceof td9) {
                ((td9) childAt).getCaptionEditText().K();
            } else if (childAt instanceof be9) {
                ((be9) childAt).getEditText().K();
            }
        }
    }

    public final ll0 R3(int i, int i2) {
        while (i >= 0) {
            ArrayList arrayList = this.x4;
            if (i < arrayList.size()) {
                ll0 ll0Var = (ll0) arrayList.get(i);
                if (!ll0Var.i) {
                    if (ll0Var.t == 0) {
                        TL_iv.PageBlock pageBlock = ll0Var.b;
                        if (A3(pageBlock) && !h3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    return ll0Var;
                }
                i += i2;
            } else {
                return null;
            }
        }
        return null;
    }

    public final boolean S1(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.S1(int, int, int, int, java.lang.String[]):boolean");
    }

    public final void S3() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size()) {
                ll0 ll0Var = (ll0) arrayList.get(i);
                if (!ll0Var.k.isEmpty() && xk9.n(ll0Var.b)) {
                    long a = wd9.a();
                    TL_iv.RichText h = xk9.h(ll0Var.b);
                    if (h != null && !(h instanceof TL_iv.textEmpty)) {
                        this.u3.put(Long.valueOf(a), h);
                    }
                    ll0Var.k.add(Long.valueOf(a));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = ll0Var.b.text;
                    ll0Var.b = pageblockparagraph;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void T1() {
        xk9 xk9Var;
        ll0 ll0Var;
        uk9 uk9Var;
        this.g3.T();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof xk9) && (ll0Var = (xk9Var = (xk9) childAt).y) != null && (uk9Var = xk9Var.E) != null) {
                xk9Var.d(ll0Var, uk9Var, xk9Var.F);
            }
        }
    }

    public final void T3(ll0 ll0Var) {
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(ll0Var);
        if (indexOf < 0) {
            return;
        }
        of9 of9Var = this.R3;
        if (of9Var != null) {
            of9Var.d();
        }
        ll0 ll0Var2 = new ll0(new TL_iv.pageBlockParagraph(), 0, 0);
        ll0Var2.k.addAll(ll0Var.k);
        arrayList.add(indexOf + 1, ll0Var2);
        t4();
        this.g3.O(false);
        of9 of9Var2 = this.R3;
        if (of9Var2 != null) {
            of9Var2.h();
        }
        post(new vf9(this, ll0Var2, (byte) 23));
    }

    public final void T4() {
        boolean z;
        int[] D4 = D4();
        if (D4 != null) {
            int i = D4[0];
            int i2 = D4[1];
            if (i >= 0) {
                ArrayList arrayList = this.t3;
                if (i2 < arrayList.size() && i <= i2) {
                    of9 of9Var = this.R3;
                    if (of9Var != null) {
                        of9Var.d();
                    }
                    if (D3(i, i2)) {
                        for (int i3 = i; i3 <= i2; i3++) {
                            ll0 ll0Var = (ll0) arrayList.get(i3);
                            boolean z2 = ll0Var.i;
                            ArrayList arrayList2 = ll0Var.k;
                            if (!z2 && !t3(ll0Var)) {
                                if (xk9.n(ll0Var.b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = ll0Var.b.text;
                                    ll0Var.b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    td4.w(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a = wd9.a();
                        for (int i4 = i; i4 <= i2; i4++) {
                            ll0 ll0Var2 = (ll0) arrayList.get(i4);
                            boolean z3 = ll0Var2.i;
                            ArrayList arrayList3 = ll0Var2.k;
                            if (!z3 && !t3(ll0Var2)) {
                                if (xk9.n(ll0Var2.b)) {
                                    long a2 = wd9.a();
                                    TL_iv.RichText h = xk9.h(ll0Var2.b);
                                    if (h != null && !(h instanceof TL_iv.textEmpty)) {
                                        this.u3.put(Long.valueOf(a2), h);
                                    }
                                    arrayList3.add(Long.valueOf(a2));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = ll0Var2.b.text;
                                    ll0Var2.b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a));
                            }
                        }
                    }
                    t2();
                    S3();
                    t4();
                    qg9 qg9Var = this.v3;
                    if (qg9Var != null && qg9Var.w()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ll0 ll0Var3 = (ll0) arrayList.get(Math.max(0, Math.min(i, arrayList.size() - 1)));
                    ll0 ll0Var4 = (ll0) arrayList.get(Math.max(0, Math.min(i2, arrayList.size() - 1)));
                    this.g3.O(false);
                    of9 of9Var2 = this.R3;
                    if (of9Var2 != null) {
                        of9Var2.h();
                    }
                    if (z) {
                        post(new ak8(this, ll0Var3, ll0Var4, (byte) 15));
                    } else {
                        post(new vf9(this, ll0Var3, (byte) 9));
                    }
                }
            }
        }
    }

    public final boolean U1(int i, int i2) {
        qg9 qg9Var;
        ArrayList arrayList = this.V3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i, i2));
            int max2 = Math.max(0, Math.max(i, i2));
            int[] L3 = L3(max);
            int[] L32 = L3(max2);
            ll0 ll0Var = (ll0) this.V3.get(L3[0]);
            if (L3[0] != L32[0] && max != max2) {
                View C1 = C1(ll0Var);
                View C12 = C1(this.V3.get(L32[0]));
                if ((C1 instanceof xk9) && (C12 instanceof xk9)) {
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.t3;
                        int size = arrayList2.size();
                        qg9Var = this.v3;
                        if (i3 >= size) {
                            break;
                        }
                        qg9Var.W(i3, xk9.y(((ll0) arrayList2.get(i3)).b));
                        i3++;
                    }
                    xk9 xk9Var = (xk9) C1;
                    int length = xk9Var.getEditText().length();
                    if (L3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!qg9Var.i0(xk9Var, 0, L3[1], length)) {
                        xk9Var.A();
                        return true;
                    }
                    qg9Var.a0(0, L32[1], (xk9) C12);
                    return true;
                }
            } else {
                View C13 = C1(ll0Var);
                if (C13 instanceof xk9) {
                    xk9 xk9Var2 = (xk9) C13;
                    xk9Var2.A();
                    ne9 editText = xk9Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(L3[1], length2), Math.min(L32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList U2(int i, int i2, int i3, boolean z) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z2;
        ch9 ch9Var;
        int i4;
        int i5;
        ch9 ch9Var2;
        ArrayList arrayList = new ArrayList();
        int i6 = i;
        while (i6 < i2) {
            ArrayList arrayList2 = this.t3;
            ll0 ll0Var = (ll0) arrayList2.get(i6);
            boolean z3 = ll0Var.i;
            ArrayList arrayList3 = ll0Var.k;
            if (z3) {
                i6++;
            } else if (arrayList3.size() > i3) {
                Long l = (Long) arrayList3.get(i3);
                long longValue = l.longValue();
                int i7 = i6 + 1;
                while (i7 < i2) {
                    ll0 ll0Var2 = (ll0) arrayList2.get(i7);
                    if (ll0Var2.k.size() <= i3 || ((Long) ll0Var2.k.get(i3)).longValue() != longValue) {
                        break;
                    }
                    i7++;
                }
                ArrayList<TL_iv.PageBlock> U2 = this.U2(i6, i7, i3 + 1, true);
                if (U2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.u3.get(l);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (U2.size() == 1 && (U2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        if (U2.get(0).text != null) {
                            textempty = U2.get(0).text;
                        } else {
                            textempty = new TL_iv.textEmpty();
                        }
                        pageblockblockquote.text = textempty;
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = U2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i6 = i7;
            } else if (t3(ll0Var)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) ll0Var.b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int M3 = this.M3(i6);
                pageblockdetails.blocks = this.U2(i6 + 1, Math.min(M3, i2), i3, true);
                arrayList.add(pageblockdetails);
                i6 = M3 + 1;
            } else {
                int i8 = ll0Var.c;
                if (i8 <= 0) {
                    F2(ll0Var, arrayList);
                    i6++;
                    i4 = i2;
                    i5 = i3;
                    ch9Var2 = this;
                } else {
                    int[] iArr = {i6};
                    if (ll0Var.d > 0) {
                        z2 = true;
                        i4 = i2;
                        i5 = i3;
                        ch9Var = this;
                    } else {
                        z2 = false;
                        ch9Var = this;
                        i4 = i2;
                        i5 = i3;
                    }
                    TL_iv.PageBlock f2 = ch9Var.f2(i6, i8, i4, i5, z2, iArr);
                    ch9Var2 = ch9Var;
                    if (f2 != null) {
                        arrayList.add(f2);
                    }
                    int i9 = iArr[0];
                    if (i9 <= 0) {
                        i6 = i4;
                    } else {
                        i6 = i9;
                    }
                }
                this = ch9Var2;
                i2 = i4;
                i3 = i5;
            }
        }
        if (!z) {
            while (!arrayList.isEmpty() && v3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && v3((TL_iv.PageBlock) b10.f(1, arrayList))) {
                td4.w(1, arrayList);
            }
        }
        return arrayList;
    }

    public final boolean U3(defpackage.ll0 r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.U3(ll0, boolean):boolean");
    }

    public final void U4(defpackage.ll0 r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.U4(ll0, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final void V1() {
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
                ll0 ll0Var = (ll0) arrayList6.get(i8);
                ArrayList arrayList7 = ll0Var.j;
                ArrayList arrayList8 = ll0Var.k;
                arrayList7.clear();
                int i9 = 1;
                if (ll0Var.i) {
                    if (!arrayList.isEmpty()) {
                        td4.w(1, arrayList);
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
                        arrayList7.add((wd9) arrayList.get(i11));
                    }
                    int max = Math.max(i7, ll0Var.c);
                    if (max == 0) {
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    } else {
                        if (ll0Var.d > 0) {
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
                                arrayList2.add(Long.valueOf(wd9.a()));
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
                                if (((Long) arrayList5.get(i13)).longValue() != 0 && A3(ll0Var.b)) {
                                    ((Integer) arrayList4.get(i13)).getClass();
                                    ((Long) arrayList5.get(i13)).getClass();
                                } else {
                                    arrayList4.set(i13, Integer.valueOf(((Integer) arrayList4.get(i13)).intValue() + 1));
                                    arrayList5.set(i13, Long.valueOf(ll0Var.a));
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
                    if (t3(ll0Var)) {
                        boolean z2 = ((TL_iv.pageBlockDetails) ll0Var.b).open;
                        wd9.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (xk9.n(ll0Var.b)) {
                        wd9.a();
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

    public final ArrayList V2() {
        return U2(0, this.t3.size(), 0, false);
    }

    public final boolean V3(defpackage.ll0 r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.V3(ll0, boolean):boolean");
    }

    public final boolean V4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.V4():boolean");
    }

    public final void W1(k47 k47Var) {
        TLRPC.Document F0;
        String str;
        if (k47Var != null && (F0 = k47Var.F0()) != null) {
            of9 of9Var = this.R3;
            if (of9Var != null) {
                of9Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z = false;
            ll0 ll0Var = new ll0(pageblockaudio, 0, 0);
            i07 i07Var = new i07();
            ll0Var.g = i07Var;
            i07Var.c = true;
            long j = F0.id;
            if (j == 0 || F0.dc_id == 0 || F0.access_hash == 0) {
                z = true;
            }
            if (z) {
                TLRPC.Message message = k47Var.k;
                if (message != null) {
                    str = message.attachPath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                i07 i07Var2 = ll0Var.g;
                i07Var2.i = F0;
                i07Var2.e = str;
                i07Var2.a = (byte) 1;
                i07Var2.f = 0.0f;
            } else {
                i07Var.h = F0;
                i07Var.i = F0;
                i07Var.a = (byte) 2;
                pageblockaudio.audio_id = j;
            }
            q3(ll0Var);
            if (z) {
                i07 i07Var3 = ll0Var.g;
                String str2 = i07Var3.e;
                IdentityHashMap identityHashMap = this.h4;
                fi9 fi9Var = (fi9) identityHashMap.remove(i07Var3);
                if (fi9Var != null) {
                    fi9Var.b();
                }
                fi9 fi9Var2 = new fi9(this.n3, str2, F0, new og9(this, i07Var3, ll0Var));
                identityHashMap.put(i07Var3, fi9Var2);
                fi9Var2.d();
            }
            of9 of9Var2 = this.R3;
            if (of9Var2 != null) {
                of9Var2.h();
            }
            this.p3.onContentChanged();
        }
    }

    public final boolean W2() {
        ll0 ll0Var;
        ArrayList arrayList = this.t3;
        if (arrayList.isEmpty()) {
            ll0Var = null;
        } else {
            ll0Var = (ll0) b10.f(1, arrayList);
        }
        if (ll0Var != null && !A3(ll0Var.b) && !ll0Var.i && !t3(ll0Var) && !G2(ll0Var.b)) {
            if (!(C1(ll0Var) instanceof xk9)) {
                return false;
            }
            a3(ll0Var);
            return true;
        }
        of9 of9Var = this.R3;
        if (of9Var != null) {
            of9Var.d();
        }
        ll0 ll0Var2 = new ll0(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(ll0Var2);
        this.g3.O(false);
        of9 of9Var2 = this.R3;
        if (of9Var2 != null) {
            of9Var2.h();
        }
        post(new vf9(this, ll0Var2, (byte) 21));
        return true;
    }

    public final void W3() {
        if (this.Q3) {
            return;
        }
        of9 of9Var = this.R3;
        if (of9Var != null) {
            of9Var.h();
        }
        this.p3.e();
        p4();
    }

    public final boolean W4(android.view.View r10, float r11, float r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.W4(android.view.View, float, float):boolean");
    }

    public final void X1(String str) {
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
            Y1(tL_document, str);
        }
    }

    public final void X2(ll0 ll0Var, boolean z) {
        int i;
        View C1 = C1(ll0Var);
        if (C1 instanceof ck9) {
            ne9 ne9Var = ((ck9) C1).r;
            ne9Var.O();
            if (z) {
                i = ne9Var.length();
            } else {
                i = 0;
            }
            ne9Var.setSelection(i);
            return;
        }
        Y2(ll0Var, z);
    }

    public final void X3() {
        int length;
        int w;
        int g;
        int length2;
        int w2;
        int g2;
        int length3;
        int w3;
        int g3;
        int length4;
        int w4;
        int g4;
        ne9 Q4;
        int length5;
        int w5;
        int g5;
        boolean H3 = H3();
        qg9 qg9Var = this.v3;
        if (H3) {
            int i = qg9Var.p0;
            int i2 = qg9Var.q0;
            if (i2 == qg9Var.t0 && (Q4 = Q4(i, i2)) != null && (w5 = hg9.w(qg9Var.r0, qg9Var.u0, (length5 = Q4.length()), 0)) < (g5 = hg9.g(qg9Var.r0, qg9Var.u0, length5, 0))) {
                of9 of9Var = this.R3;
                if (of9Var != null) {
                    of9Var.d();
                }
                if (zk9.h(Q4.getText(), w5, g5)) {
                    zk9.n(Q4.getText(), w5, g5);
                    Q4.f();
                    g4(i, i2);
                    of9 of9Var2 = this.R3;
                    if (of9Var2 != null) {
                        of9Var2.h();
                    }
                    p4();
                }
                Q4.U1 = w5;
                Q4.V1 = g5;
                Q4.C();
            }
        } else if (u3()) {
            int i3 = qg9Var.p0;
            ne9 E2 = E2(i3);
            if (E2 != null && (w4 = hg9.w(qg9Var.r0, qg9Var.u0, (length4 = E2.length()), 0)) < (g4 = hg9.g(qg9Var.r0, qg9Var.u0, length4, 0))) {
                of9 of9Var3 = this.R3;
                if (of9Var3 != null) {
                    of9Var3.d();
                }
                if (zk9.h(E2.getText(), w4, g4)) {
                    zk9.n(E2.getText(), w4, g4);
                    E2.f();
                    e4(i3);
                    of9 of9Var4 = this.R3;
                    if (of9Var4 != null) {
                        of9Var4.h();
                    }
                    p4();
                }
                E2.U1 = w4;
                E2.V1 = g4;
                E2.C();
            }
        } else if (s3()) {
            int i4 = qg9Var.p0;
            ne9 o2 = o2(i4);
            if (o2 != null && (w3 = hg9.w(qg9Var.r0, qg9Var.u0, (length3 = o2.length()), 0)) < (g3 = hg9.g(qg9Var.r0, qg9Var.u0, length3, 0))) {
                of9 of9Var5 = this.R3;
                if (of9Var5 != null) {
                    of9Var5.d();
                }
                if (zk9.h(o2.getText(), w3, g3)) {
                    zk9.n(o2.getText(), w3, g3);
                    o2.f();
                    d4(i4);
                    of9 of9Var6 = this.R3;
                    if (of9Var6 != null) {
                        of9Var6.h();
                    }
                    p4();
                }
                o2.U1 = w3;
                o2.V1 = g3;
                o2.C();
            }
        } else if (C3()) {
            int i5 = qg9Var.p0;
            ne9 k4 = k4(i5);
            if (k4 != null && (w2 = hg9.w(qg9Var.r0, qg9Var.u0, (length2 = k4.length()), 0)) < (g2 = hg9.g(qg9Var.r0, qg9Var.u0, length2, 0))) {
                of9 of9Var7 = this.R3;
                if (of9Var7 != null) {
                    of9Var7.d();
                }
                if (zk9.h(k4.getText(), w2, g2)) {
                    zk9.n(k4.getText(), w2, g2);
                    k4.f();
                    f4(i5);
                    of9 of9Var8 = this.R3;
                    if (of9Var8 != null) {
                        of9Var8.h();
                    }
                    p4();
                }
                k4.U1 = w2;
                k4.V1 = g2;
                k4.C();
            }
        } else {
            xk9 I4 = I4();
            if (I4 == null || (w = hg9.w(qg9Var.r0, qg9Var.u0, (length = I4.getEditText().length()), 0)) >= (g = hg9.g(qg9Var.r0, qg9Var.u0, length, 0))) {
                return;
            }
            of9 of9Var9 = this.R3;
            if (of9Var9 != null) {
                of9Var9.d();
            }
            if (zk9.h(I4.getEditText().getText(), w, g)) {
                zk9.n(I4.getEditText().getText(), w, g);
                I4.getEditText().f();
                I4.w();
                of9 of9Var10 = this.R3;
                if (of9Var10 != null) {
                    of9Var10.h();
                }
                p4();
            }
            ne9 editText = I4.getEditText();
            editText.U1 = w;
            editText.V1 = g;
            I4.getEditText().C();
        }
    }

    public final void X4(ll0 ll0Var, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        Editable z3;
        if (ll0Var == null) {
            ll0Var = a5();
        }
        ll0 ll0Var2 = ll0Var;
        if (ll0Var2 != null && pageBlock != null) {
            ArrayList arrayList = this.t3;
            if (arrayList.indexOf(ll0Var2) >= 0 && !t3(ll0Var2) && !ll0Var2.i) {
                TL_iv.PageBlock pageBlock2 = ll0Var2.b;
                if (pageBlock != pageBlock2 && w3(pageBlock2) && w3(pageBlock)) {
                    xk9 q2 = q2(arrayList.indexOf(ll0Var2));
                    if (q2 != null) {
                        z3 = q2.getEditText().getText();
                    } else {
                        z3 = xk9.z(ll0Var2.b);
                    }
                    xk9.b(pageBlock, z3);
                    TL_iv.RichText h = xk9.h(ll0Var2.b);
                    if (h != null && xk9.h(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = h;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = h;
                        }
                    }
                }
                U4(ll0Var2, pageBlock, i, i2, z, z2);
            }
        }
    }

    public final void Y1(TLRPC.Document document, String str) {
        if (document != null) {
            of9 of9Var = this.R3;
            if (of9Var != null) {
                of9Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z = false;
            ll0 ll0Var = new ll0(pageblockdocument, 0, 0);
            i07 i07Var = new i07();
            ll0Var.g = i07Var;
            i07Var.d = true;
            long j = document.id;
            if (j == 0 || document.dc_id == 0 || document.access_hash == 0) {
                z = true;
            }
            if (z) {
                if (!TextUtils.isEmpty(str) && aq1.t(str)) {
                    i07 i07Var2 = ll0Var.g;
                    i07Var2.h = document;
                    i07Var2.e = str;
                    i07Var2.a = (byte) 1;
                    i07Var2.f = 0.0f;
                } else {
                    return;
                }
            } else {
                i07Var.h = document;
                i07Var.a = (byte) 2;
                pageblockdocument.document_id = j;
            }
            q3(ll0Var);
            if (z) {
                i07 i07Var3 = ll0Var.g;
                IdentityHashMap identityHashMap = this.h4;
                fi9 fi9Var = (fi9) identityHashMap.remove(i07Var3);
                if (fi9Var != null) {
                    fi9Var.b();
                }
                fi9 fi9Var2 = new fi9(this.n3, str, document, new ng9(this, i07Var3, ll0Var, str));
                identityHashMap.put(i07Var3, fi9Var2);
                fi9Var2.d();
            }
            of9 of9Var2 = this.R3;
            if (of9Var2 != null) {
                of9Var2.h();
            }
            this.p3.onContentChanged();
        }
    }

    public final void Y2(ll0 ll0Var, boolean z) {
        View C1 = C1(ll0Var);
        if (C1 instanceof kk9) {
            kk9 kk9Var = (kk9) C1;
            ne9 ne9Var = kk9Var.r;
            fhb fhbVar = kk9Var.G;
            if (fhbVar != null) {
                if (!z) {
                    ne9Var.O();
                    ne9Var.setSelection(0);
                    return;
                } else if (!fhbVar.g.isEmpty()) {
                    nk9 m = kk9Var.w.m((TL_iv.pageTableCell) b10.f(1, kk9Var.G.g));
                    if (m != null) {
                        ne9 ne9Var2 = m.a;
                        ne9Var2.O();
                        ne9Var2.setSelection(ne9Var2.length());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (z && (C1 instanceof xk9)) {
            xk9 xk9Var = (xk9) C1;
            if (xk9Var.l()) {
                xk9Var.f();
                return;
            }
        }
        ne9 O3 = O3(C1);
        if (O3 == null) {
            Z2(ll0Var);
            return;
        }
        O3.O();
        if (z) {
            O3.setSelection(O3.length());
        }
    }

    public final void Y3(int i) {
        int i2;
        of9 of9Var;
        int i3;
        boolean z;
        int i4;
        int i5;
        SpannableStringBuilder spannableStringBuilder;
        int i6;
        int length;
        int w;
        int g;
        boolean z2;
        int i7;
        int length2;
        int w2;
        int g2;
        boolean z3;
        int i8;
        int length3;
        int w3;
        int g3;
        boolean z4;
        int i9;
        of9 of9Var2;
        int i10;
        int i11;
        int i12;
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w()) {
            boolean H3 = H3();
            ah9 ah9Var = this.p3;
            int i13 = 0;
            if (H3) {
                int i14 = qg9Var.p0;
                int i15 = qg9Var.q0;
                int i16 = qg9Var.t0;
                int i17 = qg9Var.r0;
                int i18 = qg9Var.u0;
                boolean G3 = G3(i, i14, i15, i17, i16, i18);
                if (!G3) {
                    i9 = s2(i);
                } else {
                    i9 = 0;
                }
                of9 of9Var3 = this.R3;
                if (of9Var3 != null) {
                    of9Var3.d();
                }
                this.Q3 = true;
                int i19 = i15;
                boolean z5 = false;
                while (i19 <= i16) {
                    ne9 Q4 = Q4(i14, i19);
                    if (Q4 == null) {
                        i12 = i15;
                    } else {
                        int length4 = Q4.length();
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
                            if (!G3) {
                                if (i9 != 0) {
                                    Q4.b(i9, max, max2);
                                }
                                Q4.a(i, max, max2);
                            } else {
                                Q4.b(i, max, max2);
                            }
                            Q4.f();
                            Q4.requestLayout();
                            g4(i14, i19);
                            z5 = true;
                        }
                    }
                    i19++;
                    i15 = i12;
                }
                this.Q3 = false;
                if (z5 && (of9Var2 = this.R3) != null) {
                    of9Var2.h();
                }
                ah9Var.e();
                if (z5) {
                    p4();
                }
            } else if (u3()) {
                int i21 = qg9Var.p0;
                ne9 E2 = E2(i21);
                if (E2 != null && (w3 = hg9.w(qg9Var.r0, qg9Var.u0, (length3 = E2.length()), 0)) < (g3 = hg9.g(qg9Var.r0, qg9Var.u0, length3, 0))) {
                    if ((E2.c(w3, g3) & i) == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    of9 of9Var4 = this.R3;
                    if (of9Var4 != null) {
                        of9Var4.d();
                    }
                    this.Q3 = true;
                    if (z4) {
                        int s2 = s2(i);
                        if (s2 != 0) {
                            E2.b(s2, w3, g3);
                        }
                        E2.a(i, w3, g3);
                    } else {
                        E2.b(i, w3, g3);
                    }
                    this.Q3 = false;
                    e4(i21);
                    E2.f();
                    E2.requestLayout();
                    of9 of9Var5 = this.R3;
                    if (of9Var5 != null) {
                        of9Var5.h();
                    }
                    ah9Var.e();
                    p4();
                }
            } else if (s3()) {
                int i22 = qg9Var.p0;
                ne9 o2 = o2(i22);
                if (o2 != null && (w2 = hg9.w(qg9Var.r0, qg9Var.u0, (length2 = o2.length()), 0)) < (g2 = hg9.g(qg9Var.r0, qg9Var.u0, length2, 0))) {
                    if ((o2.c(w2, g2) & i) == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i8 = s2(i);
                    } else {
                        i8 = 0;
                    }
                    of9 of9Var6 = this.R3;
                    if (of9Var6 != null) {
                        of9Var6.d();
                    }
                    this.Q3 = true;
                    if (z3) {
                        if (i8 != 0) {
                            o2.b(i8, w2, g2);
                        }
                        o2.a(i, w2, g2);
                    } else {
                        o2.b(i, w2, g2);
                    }
                    o2.f();
                    o2.requestLayout();
                    d4(i22);
                    this.Q3 = false;
                    of9 of9Var7 = this.R3;
                    if (of9Var7 != null) {
                        of9Var7.h();
                    }
                    ah9Var.e();
                    p4();
                }
            } else {
                boolean C3 = C3();
                int i23 = qg9Var.p0;
                if (C3) {
                    ne9 k4 = k4(i23);
                    if (k4 != null && (w = hg9.w(qg9Var.r0, qg9Var.u0, (length = k4.length()), 0)) < (g = hg9.g(qg9Var.r0, qg9Var.u0, length, 0))) {
                        if ((k4.c(w, g) & i) == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i7 = s2(i);
                        } else {
                            i7 = 0;
                        }
                        of9 of9Var8 = this.R3;
                        if (of9Var8 != null) {
                            of9Var8.d();
                        }
                        this.Q3 = true;
                        if (z2) {
                            if (i7 != 0) {
                                k4.b(i7, w, g);
                            }
                            k4.a(i, w, g);
                        } else {
                            k4.b(i, w, g);
                        }
                        k4.f();
                        k4.requestLayout();
                        f4(i23);
                        this.Q3 = false;
                        of9 of9Var9 = this.R3;
                        if (of9Var9 != null) {
                            of9Var9.h();
                        }
                        ah9Var.e();
                        p4();
                        return;
                    }
                    return;
                }
                int i24 = qg9Var.s0;
                int i25 = qg9Var.r0;
                int i26 = qg9Var.u0;
                if (i23 >= 0 && i24 >= 0 && i24 >= i23 && i24 < this.x4.size()) {
                    int i27 = i;
                    boolean F3 = F3(i27, i23, i25, i24, i26);
                    boolean z6 = !F3;
                    if (!F3) {
                        i2 = s2(i27);
                    } else {
                        i2 = 0;
                    }
                    of9 of9Var10 = this.R3;
                    if (of9Var10 != null) {
                        of9Var10.d();
                    }
                    this.Q3 = true;
                    boolean z7 = false;
                    int i28 = i23;
                    while (i28 <= i24) {
                        ll0 A42 = A4(i28);
                        if (A42 != null) {
                            TL_iv.PageBlock pageBlock = A42.b;
                            if (w3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int d2 = d2(i28);
                                if (i28 == i23) {
                                    i4 = i25;
                                } else {
                                    i4 = i13;
                                }
                                z = z7;
                                if (i28 == i24) {
                                    i5 = i26;
                                } else {
                                    i5 = d2;
                                }
                                int max3 = Math.max(i13, Math.min(i4, d2));
                                int max4 = Math.max(i13, Math.min(i5, d2));
                                if (max3 >= max4) {
                                    i3 = i2;
                                    z7 = z;
                                    i28++;
                                    i27 = i;
                                    i2 = i3;
                                    i13 = 0;
                                } else {
                                    xk9 q2 = q2(i28);
                                    if (q2 != null) {
                                        gm4 styleDelegate = q2.getStyleDelegate();
                                        if (!F3) {
                                            if (i2 != 0) {
                                                styleDelegate.b(i2, max3, max4);
                                            }
                                            styleDelegate.a(i27, max3, max4);
                                        } else {
                                            styleDelegate.b(i27, max3, max4);
                                        }
                                        q2.getEditText().f();
                                        q2.getEditText().requestLayout();
                                        q2.w();
                                        i3 = i2;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(xk9.z(A42.b));
                                        if (!F3 && i2 != 0) {
                                            i3 = i2;
                                            i6 = max3;
                                            zk9.o(spannableStringBuilder2, i6, max4, i3, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i3 = i2;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i6 = max3;
                                        }
                                        zk9.o(spannableStringBuilder, i6, max4, i27, z6, null);
                                        xk9.b(A42.b, spannableStringBuilder);
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
                    if (z8 && (of9Var = this.R3) != null) {
                        of9Var.h();
                    }
                    ah9Var.e();
                    if (z8) {
                        p4();
                    }
                }
            }
        }
    }

    public final void Y4(ll0 ll0Var, TL_iv.PageBlock pageBlock) {
        if (ll0Var == null) {
            ll0Var = a5();
        }
        ll0 ll0Var2 = ll0Var;
        if (ll0Var2 == null) {
            return;
        }
        X4(ll0Var2, pageBlock, ll0Var2.c, ll0Var2.d, ll0Var2.e, ll0Var2.f);
    }

    public final void Z1(Uri uri) {
        boolean contains;
        if (uri != null) {
            ll0 ll0Var = this.j4;
            String str = null;
            this.j4 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e) {
                fc4.g(e, true);
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
            Utilities.e.c(new m25(this, uri, z, str2, i, ll0Var));
        }
    }

    public final void Z2(ll0 ll0Var) {
        View C1 = C1(ll0Var);
        if (C1 instanceof xk9) {
            ((xk9) C1).A();
        } else if (C1 instanceof be9) {
            ((be9) C1).d.O();
        }
    }

    public final void Z3(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.Z3(android.view.View):void");
    }

    public final void Z4(ll0 ll0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        if (ll0Var == null) {
            ll0Var = a5();
        }
        ll0 ll0Var2 = ll0Var;
        if (ll0Var2 == null) {
            return;
        }
        if (i == 0) {
            X4(ll0Var2, ll0Var2.b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, ll0Var2.c);
        if (i == 2) {
            i2 = Math.max(1, ll0Var2.d);
        } else {
            i2 = 0;
        }
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        TL_iv.PageBlock pageBlock = ll0Var2.b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        if (z && ll0Var2.f) {
            z2 = true;
        } else {
            z2 = false;
        }
        X4(ll0Var2, pageBlock, max, i2, z, z2);
    }

    public final void a2(jo6 jo6Var) {
        TL_iv.PageBlock pageblockvideo;
        ch9 ch9Var;
        String str = jo6Var.h;
        if (str == null) {
            str = jo6Var.I;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        of9 of9Var = this.R3;
        if (of9Var != null) {
            of9Var.d();
        }
        boolean c = bi9.c(jo6Var);
        if (!jo6Var.b && !c) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        ll0 ll0Var = new ll0(pageblockvideo, 0, 0);
        ll0Var.g = Q3(jo6Var, str2);
        q3(ll0Var);
        i07 i07Var = ll0Var.g;
        if (c) {
            N4(ll0Var, i07Var, jo6Var);
            ch9Var = this;
        } else {
            ch9Var = this;
            ch9Var.O4(ll0Var, i07Var, str2, jo6Var.b, jo6Var.F, jo6Var.G, jo6Var.E);
        }
        of9 of9Var2 = ch9Var.R3;
        if (of9Var2 != null) {
            of9Var2.h();
        }
        ch9Var.p3.onContentChanged();
    }

    public final void a3(ll0 ll0Var) {
        View C1 = C1(ll0Var);
        if (C1 instanceof xk9) {
            xk9 xk9Var = (xk9) C1;
            xk9Var.A();
            ne9 editText = xk9Var.getEditText();
            editText.setSelection(editText.length());
        } else if (C1 instanceof be9) {
            be9 be9Var = (be9) C1;
            be9Var.d.O();
            ne9 editText2 = be9Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void a4() {
        int length;
        int w;
        int g;
        int length2;
        int w2;
        int g2;
        int length3;
        int w3;
        int g3;
        int length4;
        int w4;
        int g4;
        ne9 Q4;
        int length5;
        int w5;
        int g5;
        boolean H3 = H3();
        ah9 ah9Var = this.p3;
        qg9 qg9Var = this.v3;
        if (H3) {
            int i = qg9Var.p0;
            int i2 = qg9Var.q0;
            if (i2 == qg9Var.t0 && (Q4 = Q4(i, i2)) != null && (w5 = hg9.w(qg9Var.r0, qg9Var.u0, (length5 = Q4.length()), 0)) < (g5 = hg9.g(qg9Var.r0, qg9Var.u0, length5, 0))) {
                boolean h = zk9.h(Q4.getText(), w5, g5);
                of9 of9Var = this.R3;
                if (h) {
                    if (of9Var != null) {
                        of9Var.d();
                    }
                    zk9.n(Q4.getText(), w5, g5);
                    Q4.f();
                    g4(i, i2);
                    of9 of9Var2 = this.R3;
                    if (of9Var2 != null) {
                        of9Var2.h();
                    }
                    ah9Var.e();
                    p4();
                    return;
                }
                if (of9Var != null) {
                    of9Var.d();
                }
                if (zk9.g(Q4.getText(), w5, g5)) {
                    zk9.m(Q4.getText(), w5, g5);
                    Q4.f();
                    g4(i, i2);
                    of9 of9Var3 = this.R3;
                    if (of9Var3 != null) {
                        of9Var3.h();
                    }
                    p4();
                }
                Q4.U1 = w5;
                Q4.V1 = g5;
                k3(false);
                G4(Q4);
            }
        } else if (u3()) {
            int i3 = qg9Var.p0;
            ne9 E2 = E2(i3);
            if (E2 != null && (w4 = hg9.w(qg9Var.r0, qg9Var.u0, (length4 = E2.length()), 0)) < (g4 = hg9.g(qg9Var.r0, qg9Var.u0, length4, 0))) {
                boolean h2 = zk9.h(E2.getText(), w4, g4);
                of9 of9Var4 = this.R3;
                if (h2) {
                    if (of9Var4 != null) {
                        of9Var4.d();
                    }
                    zk9.n(E2.getText(), w4, g4);
                    E2.f();
                    e4(i3);
                    of9 of9Var5 = this.R3;
                    if (of9Var5 != null) {
                        of9Var5.h();
                    }
                    ah9Var.e();
                    p4();
                    return;
                }
                if (of9Var4 != null) {
                    of9Var4.d();
                }
                if (zk9.g(E2.getText(), w4, g4)) {
                    zk9.m(E2.getText(), w4, g4);
                    E2.f();
                    e4(i3);
                    of9 of9Var6 = this.R3;
                    if (of9Var6 != null) {
                        of9Var6.h();
                    }
                    p4();
                }
                E2.U1 = w4;
                E2.V1 = g4;
                k3(false);
                G4(E2);
            }
        } else if (s3()) {
            int i4 = qg9Var.p0;
            ne9 o2 = o2(i4);
            if (o2 != null && (w3 = hg9.w(qg9Var.r0, qg9Var.u0, (length3 = o2.length()), 0)) < (g3 = hg9.g(qg9Var.r0, qg9Var.u0, length3, 0))) {
                boolean h3 = zk9.h(o2.getText(), w3, g3);
                of9 of9Var7 = this.R3;
                if (h3) {
                    if (of9Var7 != null) {
                        of9Var7.d();
                    }
                    zk9.n(o2.getText(), w3, g3);
                    o2.f();
                    d4(i4);
                    of9 of9Var8 = this.R3;
                    if (of9Var8 != null) {
                        of9Var8.h();
                    }
                    ah9Var.e();
                    p4();
                    return;
                }
                if (of9Var7 != null) {
                    of9Var7.d();
                }
                if (zk9.g(o2.getText(), w3, g3)) {
                    zk9.m(o2.getText(), w3, g3);
                    o2.f();
                    d4(i4);
                    of9 of9Var9 = this.R3;
                    if (of9Var9 != null) {
                        of9Var9.h();
                    }
                    p4();
                }
                o2.U1 = w3;
                o2.V1 = g3;
                k3(false);
                G4(o2);
            }
        } else if (C3()) {
            int i5 = qg9Var.p0;
            ne9 k4 = k4(i5);
            if (k4 != null && (w2 = hg9.w(qg9Var.r0, qg9Var.u0, (length2 = k4.length()), 0)) < (g2 = hg9.g(qg9Var.r0, qg9Var.u0, length2, 0))) {
                boolean h4 = zk9.h(k4.getText(), w2, g2);
                of9 of9Var10 = this.R3;
                if (h4) {
                    if (of9Var10 != null) {
                        of9Var10.d();
                    }
                    zk9.n(k4.getText(), w2, g2);
                    k4.f();
                    f4(i5);
                    of9 of9Var11 = this.R3;
                    if (of9Var11 != null) {
                        of9Var11.h();
                    }
                    ah9Var.e();
                    p4();
                    return;
                }
                if (of9Var10 != null) {
                    of9Var10.d();
                }
                if (zk9.g(k4.getText(), w2, g2)) {
                    zk9.m(k4.getText(), w2, g2);
                    k4.f();
                    f4(i5);
                    of9 of9Var12 = this.R3;
                    if (of9Var12 != null) {
                        of9Var12.h();
                    }
                    p4();
                }
                k4.U1 = w2;
                k4.V1 = g2;
                k3(false);
                G4(k4);
            }
        } else {
            xk9 I4 = I4();
            if (I4 == null || (w = hg9.w(qg9Var.r0, qg9Var.u0, (length = I4.getEditText().length()), 0)) >= (g = hg9.g(qg9Var.r0, qg9Var.u0, length, 0))) {
                return;
            }
            boolean h5 = zk9.h(I4.getEditText().getText(), w, g);
            of9 of9Var13 = this.R3;
            if (h5) {
                if (of9Var13 != null) {
                    of9Var13.d();
                }
                zk9.n(I4.getEditText().getText(), w, g);
                I4.getEditText().f();
                I4.w();
                of9 of9Var14 = this.R3;
                if (of9Var14 != null) {
                    of9Var14.h();
                }
                ah9Var.e();
                p4();
                return;
            }
            if (of9Var13 != null) {
                of9Var13.d();
            }
            if (zk9.g(I4.getEditText().getText(), w, g)) {
                zk9.m(I4.getEditText().getText(), w, g);
                I4.getEditText().f();
                I4.w();
                of9 of9Var15 = this.R3;
                if (of9Var15 != null) {
                    of9Var15.h();
                }
                p4();
            }
            ne9 editText = I4.getEditText();
            editText.U1 = w;
            editText.V1 = g;
            k3(false);
            G4(I4.getEditText());
        }
    }

    public final ll0 a5() {
        qg9 qg9Var;
        int i;
        ll0 M2 = M2();
        if (M2 == null && (qg9Var = this.v3) != null && qg9Var.w() && (i = qg9Var.p0) == qg9Var.s0) {
            return A4(i);
        }
        return M2;
    }

    public final void b2(kk9 kk9Var) {
        kk9 kk9Var2 = this.q4;
        if (kk9Var2 != null && kk9Var2 != kk9Var) {
            LinkedHashSet linkedHashSet = kk9Var2.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                kk9Var2.w.invalidate();
                kk9Var2.v();
            }
        }
        this.q4 = kk9Var;
        this.K3 = false;
        this.t4 = -1;
        this.s4 = -1;
        kk9Var.setCellSelectionListener(this.u4);
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w()) {
            qg9Var.e(false);
        }
        setEditTextsLocked(true);
    }

    public final void b3(ll0 ll0Var) {
        View C1 = C1(ll0Var);
        if (C1 instanceof xk9) {
            xk9 xk9Var = (xk9) C1;
            xk9Var.A();
            xk9Var.getEditText().setSelection(0);
        } else if (C1 instanceof be9) {
            be9 be9Var = (be9) C1;
            be9Var.d.O();
            be9Var.getEditText().setSelection(0);
        }
    }

    public final void b4() {
        ne9 editText;
        Runnable rf9Var;
        int length;
        final int w;
        final int g;
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w()) {
            if (H3()) {
                int i = qg9Var.p0;
                int i2 = qg9Var.q0;
                if (i2 == qg9Var.t0) {
                    editText = Q4(i, i2);
                    rf9Var = new wf9(this, i, i2, (byte) 1);
                } else {
                    return;
                }
            } else if (u3()) {
                int i3 = qg9Var.p0;
                editText = E2(i3);
                rf9Var = new qf9(this, i3, (byte) 3);
            } else if (s3()) {
                int i4 = qg9Var.p0;
                editText = o2(i4);
                rf9Var = new qf9(this, i4, (byte) 0);
            } else if (C3()) {
                int i5 = qg9Var.p0;
                editText = k4(i5);
                rf9Var = new qf9(this, i5, (byte) 1);
            } else {
                xk9 I4 = I4();
                if (I4 != null) {
                    editText = I4.getEditText();
                    rf9Var = new rf9(I4, (byte) 0);
                } else {
                    return;
                }
            }
            final ne9 ne9Var = editText;
            final Runnable runnable = rf9Var;
            if (ne9Var != null && (w = hg9.w(qg9Var.r0, qg9Var.u0, (length = ne9Var.length()), 0)) <= (g = hg9.g(qg9Var.r0, qg9Var.u0, length, 0))) {
                Editable text = ne9Var.getText();
                int i6 = ll6.h;
                String str = null;
                if (text != null) {
                    ll6[] ll6VarArr = (ll6[]) text.getSpans(w, g, ll6.class);
                    if (ll6VarArr.length > 0) {
                        str = ll6VarArr[0].a;
                    }
                }
                if (str == null) {
                    str = ne9Var.getText().subSequence(w, g).toString();
                }
                final float L = gm.L(gda.S0 + 4);
                int i7 = cmb.F6;
                ylb ylbVar = this.o3;
                final int v0 = cmb.v0(i7, ylbVar);
                p82.X(getContext(), str, new qac() {
                    @Override
                    public final void a(Object obj) {
                        ll6 a;
                        String str2 = (String) obj;
                        ch9 ch9Var = ch9.this;
                        ch9Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a = ll6.a(str2, v0, L)) == null) {
                            return;
                        }
                        of9 of9Var = ch9Var.R3;
                        if (of9Var != null) {
                            of9Var.d();
                        }
                        qg9 qg9Var2 = ch9Var.v3;
                        if (qg9Var2 != null) {
                            qg9Var2.e(false);
                        }
                        ne9 ne9Var2 = ne9Var;
                        ne9Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a, 0, 1, 33);
                        Editable text2 = ne9Var2.getText();
                        int max = Math.max(0, Math.min(w, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(g, text2.length())), spannableString);
                        runnable.run();
                        of9 of9Var2 = ch9Var.R3;
                        if (of9Var2 != null) {
                            of9Var2.h();
                        }
                        ch9Var.p3.onContentChanged();
                        int min = Math.min(max + 1, ne9Var2.length());
                        ne9Var2.O();
                        ch9Var.post(new cg9(ne9Var2, min, (byte) 3));
                    }
                }, ylbVar);
            }
        }
    }

    public final void b5(float f, float f2) {
        TL_iv.pageTableCell o;
        kk9 kk9Var = this.q4;
        if (this.J3 && kk9Var != null && this.F3 == kk9Var && (o = kk9Var.o((int) ((f - kk9Var.getLeft()) - getLeft()), (int) ((f2 - kk9Var.getTop()) - getTop()))) != null && o != this.M3) {
            this.M3 = o;
            kk9Var.y(this.L3, o);
        }
    }

    public final tg9 c2() {
        int i;
        int i2;
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w() && !C3()) {
            ll0 A42 = A4(qg9Var.p0);
            ArrayList arrayList = this.t3;
            int indexOf = arrayList.indexOf(A42);
            int indexOf2 = arrayList.indexOf(A4(qg9Var.s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                if (indexOf > indexOf2) {
                    i2 = indexOf;
                    i = indexOf2;
                } else {
                    i = indexOf;
                    i2 = indexOf2;
                }
                for (int i3 = i; i3 <= i2; i3++) {
                    ll0 ll0Var = (ll0) arrayList.get(i3);
                    if (ll0Var.i || t3(ll0Var)) {
                        return null;
                    }
                }
                return new tg9(this, i, i2, qg9Var.r0, qg9Var.u0);
            }
            return null;
        }
        return null;
    }

    public final void c4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.c4():void");
    }

    public final void c5() {
        xk9 xk9Var;
        ll0 ll0Var;
        uk9 uk9Var;
        d69 itemAnimator = getItemAnimator();
        setItemAnimator(null);
        this.g3.O(true);
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof xk9) && (ll0Var = (xk9Var = (xk9) childAt).y) != null && (uk9Var = xk9Var.E) != null) {
                xk9Var.d(ll0Var, uk9Var, xk9Var.F);
            }
        }
        post(new fg9(this, itemAnimator, (byte) 2));
    }

    public final int d2(int i) {
        ne9 E2 = E2(i);
        if (E2 != null) {
            return E2.length();
        }
        xk9 q2 = q2(i);
        if (q2 != null) {
            return q2.getEditText().length();
        }
        ll0 A42 = A4(i);
        if (A42 == null) {
            return 0;
        }
        return xk9.y(A42.b).length();
    }

    public final boolean d3(android.view.KeyEvent r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.d3(android.view.KeyEvent):boolean");
    }

    public final void d4(int i) {
        View C4 = C4(i);
        if (C4 instanceof td9) {
            ((td9) C4).b();
        }
    }

    public final void d5(ll0 ll0Var, String str) {
        ll0 ll0Var2;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    of9 of9Var = this.R3;
                    if (of9Var != null) {
                        of9Var.d();
                    }
                    pageblockpreformatted.language = str;
                    xk9 q2 = q2(this.t3.indexOf(ll0Var));
                    if (q2 != null && (ll0Var2 = q2.y) != null) {
                        q2.J(ll0Var2.b, true);
                        q2.I = null;
                        q2.B();
                    }
                    of9 of9Var2 = this.R3;
                    if (of9Var2 != null) {
                        of9Var2.h();
                    }
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        Long l;
        ll0 ll0Var;
        View view;
        Long l2;
        int i2;
        int i3;
        ArrayList arrayList2;
        ll0 ll0Var2;
        ll0 ll0Var3;
        float f;
        ll0 ll0Var4;
        boolean z;
        ll0 ll0Var5;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                arrayList = this.x4;
                if (i4 >= childCount) {
                    break;
                }
                int R = RecyclerView.R(getChildAt(i4));
                if (R >= 0 && R < arrayList.size()) {
                    ll0Var5 = (ll0) arrayList.get(R);
                } else {
                    ll0Var5 = null;
                }
                if (ll0Var5 != null) {
                    ArrayList arrayList3 = ll0Var5.k;
                    if (arrayList3.size() > i5) {
                        i5 = arrayList3.size();
                    }
                }
                i4++;
            }
            if (i5 != 0) {
                if (this.y4 == null) {
                    p99 p99Var = new p99(this);
                    this.y4 = p99Var;
                    p99Var.a(null, null, null, this.o3, 1);
                    uue.a(this.y4, this.o3);
                }
                int i6 = 0;
                while (i6 < i5) {
                    float f2 = 0.0f;
                    long j = 0;
                    int i7 = 0;
                    boolean z2 = false;
                    ll0 ll0Var6 = null;
                    ll0 ll0Var7 = null;
                    float f3 = 1.0f;
                    float f4 = 0.0f;
                    while (i7 <= childCount) {
                        if (i7 < childCount) {
                            View childAt = getChildAt(i7);
                            int R2 = RecyclerView.R(childAt);
                            if (R2 >= 0 && R2 < arrayList.size()) {
                                ll0Var = (ll0) arrayList.get(R2);
                            } else {
                                ll0Var = null;
                            }
                            if (ll0Var != null) {
                                ArrayList arrayList4 = ll0Var.k;
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
                            ll0Var = null;
                            view = null;
                        }
                        if (z2 && (l == null || l.longValue() != j)) {
                            int l4 = l4(i6, ll0Var6, true);
                            l2 = l;
                            int l42 = l4(i6, ll0Var7, false);
                            if (f4 - f2 <= gm.L(4.0f)) {
                                i2 = i6;
                                i3 = i5;
                                arrayList2 = arrayList;
                            } else {
                                int L = gm.L(16.0f) * i6;
                                i2 = i6;
                                int L2 = gm.L(16.0f) + L;
                                i3 = i5;
                                arrayList2 = arrayList;
                                int y = kt6.y(16.0f, getWidth(), L);
                                if (y - L2 > gm.L(8.0f)) {
                                    float floor = (float) Math.floor(gda.U0 / 3.0f);
                                    RectF rectF = gm.P;
                                    rectF.set(L2, l4 + f2, y, f4 - l42);
                                    ll0Var2 = ll0Var6;
                                    ll0Var3 = ll0Var7;
                                    this.y4.c(floor, floor, floor, f3, canvas, rectF);
                                    f = f3;
                                    this.y4.f(canvas, rectF, f);
                                    z2 = false;
                                }
                            }
                            ll0Var2 = ll0Var6;
                            ll0Var3 = ll0Var7;
                            f = f3;
                            z2 = false;
                        } else {
                            l2 = l;
                            i2 = i6;
                            i3 = i5;
                            arrayList2 = arrayList;
                            ll0Var2 = ll0Var6;
                            ll0Var3 = ll0Var7;
                            f = f3;
                        }
                        if (view != null && l2 != null) {
                            if (!z2) {
                                j = l2.longValue();
                                f2 = Float.MAX_VALUE;
                                f4 = -3.4028235E38f;
                                ll0Var4 = ll0Var;
                                z = true;
                                f = 1.0f;
                            } else {
                                ll0Var4 = ll0Var2;
                                z = z2;
                            }
                            if (ll0Var != null && ll0Var == this.a4) {
                                z2 = z;
                                f3 = f;
                            } else {
                                float y2 = view.getY();
                                float height = view.getHeight() + y2;
                                if (y2 < f2) {
                                    f2 = y2;
                                }
                                if (height > f4) {
                                    f4 = height;
                                }
                                f3 = Math.min(f, view.getAlpha());
                                z2 = z;
                            }
                            ll0Var7 = ll0Var;
                        } else {
                            ll0Var7 = ll0Var3;
                            f3 = f;
                            ll0Var4 = ll0Var2;
                        }
                        i7++;
                        ll0Var6 = ll0Var4;
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

    public final TL_iv.RichMessage e2() {
        if (g3()) {
            ArrayList<TL_iv.PageBlock> V2 = V2();
            if (V2.isEmpty()) {
                return null;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = V2;
            richMessage.photos = x2();
            richMessage.documents = u2();
            return richMessage;
        }
        return null;
    }

    public final boolean e3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.e3(android.view.MotionEvent):boolean");
    }

    public final void e4(int i) {
        ll0 A42 = A4(i);
        ne9 E2 = E2(i);
        if (t3(A42) && E2 != null) {
            ((TL_iv.pageBlockDetails) A42.b).title = zk9.f(E2.getText());
        }
    }

    public final TL_iv.PageBlock f2(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        TL_iv.pageBlockList pageblocklist;
        TL_iv.pageBlockOrderedList pageblockorderedlist;
        int i5;
        TL_iv.RichText richText;
        int i6;
        ll0 ll0Var;
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
            ch9 ch9Var = this;
            ArrayList arrayList2 = ch9Var.t3;
            ll0 ll0Var2 = (ll0) arrayList2.get(i9);
            if (ll0Var2.k.size() > i8 || (i5 = ll0Var2.c) < i2) {
                break;
            }
            if (i5 == i2) {
                if (ll0Var2.d > 0) {
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
            boolean A3 = A3(ll0Var2.b);
            if (!A3) {
                TL_iv.PageBlock pageBlock = ll0Var2.b;
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
            if (A3) {
                F2(ll0Var2, arrayList3);
            }
            while (i11 < i7) {
                ll0 ll0Var3 = (ll0) arrayList2.get(i11);
                if (ll0Var3.k.size() > i8) {
                    break;
                }
                ll0Var = ll0Var2;
                int i12 = ll0Var3.c;
                if (i12 >= i2) {
                    if (i12 == i2) {
                        if (A3(ll0Var3.b)) {
                            F2(ll0Var3, arrayList3);
                            i11++;
                            ll0Var2 = ll0Var;
                        }
                    } else {
                        if (ll0Var3.d > 0) {
                            richText2 = richText;
                            z2 = true;
                        } else {
                            richText2 = richText;
                            z2 = false;
                        }
                        ArrayList arrayList4 = arrayList3;
                        int[] iArr2 = {i11};
                        ch9 ch9Var2 = ch9Var;
                        i6 = i11;
                        arrayList = arrayList4;
                        TL_iv.PageBlock f2 = ch9Var2.f2(i6, i12, i7, i8, z2, iArr2);
                        if (f2 != null) {
                            arrayList.add(f2);
                        }
                        i11 = iArr2[0];
                        if (i11 <= i6) {
                            break;
                        }
                        ch9Var = this;
                        i7 = i3;
                        i8 = i4;
                        richText = richText2;
                        ll0Var2 = ll0Var;
                        arrayList3 = arrayList;
                    }
                }
                i6 = i11;
                break;
            }
            i6 = i11;
            ll0Var = ll0Var2;
            richText2 = richText;
            arrayList = arrayList3;
            if (!A3 && arrayList.isEmpty()) {
                if (z) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                    tL_pageListOrderedItemText.num = aq1.n(i10, ".");
                    tL_pageListOrderedItemText.text = richText2;
                    tL_pageListOrderedItemText.checkbox = ll0Var.e;
                    tL_pageListOrderedItemText.checked = ll0Var.f;
                    pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                } else {
                    TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                    tL_pageListItemText.text = richText2;
                    tL_pageListItemText.checkbox = ll0Var.e;
                    tL_pageListItemText.checked = ll0Var.f;
                    pageblocklist.items.add(tL_pageListItemText);
                }
            } else {
                ArrayList<TL_iv.PageBlock> arrayList5 = new ArrayList<>();
                if (!A3) {
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = richText2;
                    arrayList5.add(pageblockparagraph);
                }
                arrayList5.addAll(arrayList);
                if (!arrayList5.isEmpty()) {
                    if (z) {
                        TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                        tL_pageListOrderedItemBlocks.num = aq1.n(i10, ".");
                        tL_pageListOrderedItemBlocks.blocks = arrayList5;
                        tL_pageListOrderedItemBlocks.checkbox = ll0Var.e;
                        tL_pageListOrderedItemBlocks.checked = ll0Var.f;
                        pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks);
                    } else {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                        tL_pageListItemBlocks.blocks = arrayList5;
                        tL_pageListItemBlocks.checkbox = ll0Var.e;
                        tL_pageListItemBlocks.checked = ll0Var.f;
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

    public final boolean f3(defpackage.kk9 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.f3(kk9, int, int):boolean");
    }

    public final void f4(int i) {
        View C4 = C4(i);
        if (C4 instanceof xk9) {
            ((xk9) C4).v();
        }
    }

    public final void f5(java.lang.CharSequence r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.f5(java.lang.CharSequence):void");
    }

    public final boolean g2() {
        ne9 editText;
        int length;
        int w;
        int g;
        Editable text;
        qh9[] qh9VarArr;
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w() && qg9Var.p0 == qg9Var.s0) {
            if (H3()) {
                int i = qg9Var.p0;
                int i2 = qg9Var.q0;
                if (i2 == qg9Var.t0) {
                    editText = Q4(i, i2);
                    if (editText != null && (w = hg9.w(qg9Var.r0, qg9Var.u0, (length = editText.length()), 0)) < (g = hg9.g(qg9Var.r0, qg9Var.u0, length, 0))) {
                        text = editText.getText();
                        if (text == null && w < g) {
                            for (qh9 qh9Var : (qh9[]) text.getSpans(w, g, qh9.class)) {
                                if (text.getSpanStart(qh9Var) >= g || text.getSpanEnd(qh9Var) <= w) {
                                }
                            }
                            return true;
                        }
                    }
                }
            } else {
                if (u3()) {
                    editText = E2(qg9Var.p0);
                } else if (s3()) {
                    editText = o2(qg9Var.p0);
                } else if (C3()) {
                    editText = k4(qg9Var.p0);
                } else {
                    xk9 I4 = I4();
                    if (I4 != null) {
                        editText = I4.getEditText();
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

    public final boolean g3() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.g3():boolean");
    }

    public final void g4(int i, int i2) {
        nk9 m;
        View C4 = C4(i);
        if (C4 instanceof kk9) {
            kk9 kk9Var = (kk9) C4;
            if (i2 == 0) {
                kk9Var.w();
                return;
            }
            TL_iv.pageTableCell g = kk9Var.g(i2);
            if (g != null && (m = kk9Var.getGrid().m(g)) != null) {
                fhb.d(g, m.a.getText());
            }
        }
    }

    public ne9 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof ne9) {
            return (ne9) findFocus;
        }
        return null;
    }

    public rh9 getMapDelegate() {
        return this.l4;
    }

    public View getOverlayView() {
        return this.w3;
    }

    public gkb getTextSelectionHelper() {
        return this.v3;
    }

    public final boolean h2() {
        int[] F4 = F4();
        if (F4 == null) {
            return i2(z2());
        }
        for (int i = F4[0]; i <= F4[1]; i++) {
            if (i2((ll0) this.t3.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean i2(ll0 ll0Var) {
        ArrayList arrayList;
        int indexOf;
        if (ll0Var != null && (indexOf = (arrayList = this.t3).indexOf(ll0Var)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            ll0 ll0Var2 = (ll0) arrayList.get(indexOf);
            if (ll0Var2.c == 0) {
                TL_iv.PageBlock pageBlock = ll0Var2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !y3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !j2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((ll0) arrayList.get(indexOf - 1)).c < ll0Var2.c) {
                return false;
            }
            if (l3(indexOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean i3() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                return false;
            }
            for (i07 i07Var : N3((ll0) arrayList.get(i))) {
                if (i07Var.a()) {
                    return true;
                }
            }
            i++;
        }
    }

    public final void i4(ne9 ne9Var) {
        if (ne9Var == null) {
            return;
        }
        ne9Var.c2 = this.r3;
        ne9Var.setInlineButtonContext(this.n3);
        ne9Var.setInlineButtonClickListener(new ag9(this));
    }

    public final boolean j2(int i) {
        if (i > 0) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size() && A3(((ll0) arrayList.get(i)).b) && ((ll0) arrayList.get(i - 1)).c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j3() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof xk9) {
                xk9 xk9Var = (xk9) childAt;
                xk9Var.f.m();
                xk9Var.h.m();
            } else if (childAt instanceof kk9) {
                kk9 kk9Var = (kk9) childAt;
                mk9 mk9Var = kk9Var.w;
                kk9Var.r.m();
                for (int i2 = 0; i2 < mk9Var.getChildCount(); i2++) {
                    View childAt2 = mk9Var.getChildAt(i2);
                    if (childAt2 instanceof nk9) {
                        ((nk9) childAt2).a.m();
                    }
                }
            } else if (childAt instanceof td9) {
                ((td9) childAt).getCaptionEditText().m();
            } else if (childAt instanceof be9) {
                ((be9) childAt).getEditText().m();
            }
        }
    }

    public final int j4(int i) {
        Layout layout;
        View C4 = C4(i);
        if (!(C4 instanceof xk9) || (layout = ((xk9) C4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final boolean k2() {
        int[] F4 = F4();
        if (F4 == null) {
            return l2(z2());
        }
        for (int i = F4[0]; i <= F4[1]; i++) {
            if (l2((ll0) this.t3.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final void k3(boolean z) {
        qg9 qg9Var = this.v3;
        if (qg9Var != null) {
            if (z) {
                qg9Var.e(false);
            } else {
                gm.r(qg9Var.m0);
                qg9Var.t();
            }
        }
        if (z) {
            R2();
        } else {
            j3();
        }
    }

    public final ne9 k4(int i) {
        View C4 = C4(i);
        if (C4 instanceof xk9) {
            return ((xk9) C4).getAuthorEditText();
        }
        return null;
    }

    public final boolean l2(ll0 ll0Var) {
        ArrayList arrayList;
        int indexOf;
        if (ll0Var == null || (indexOf = (arrayList = this.t3).indexOf(ll0Var)) < 0 || ll0Var.c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((ll0) arrayList.get(indexOf)).c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean l3(int i) {
        if (((ll0) this.t3.get(i)).c + 1 <= oc7.r1(this.n3).l4.b0.f() - 6) {
            return true;
        }
        return false;
    }

    public final boolean m2() {
        of9 of9Var = this.R3;
        if (of9Var != null) {
            if (of9Var.e || !of9Var.b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean m3(int i, boolean z, boolean z2) {
        boolean z3;
        ll0 ll0Var;
        int i2;
        int i3 = 0;
        if (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size()) {
                ll0 ll0Var2 = (ll0) arrayList.get(i);
                if (z) {
                    if (ll0Var2.c > 0) {
                        p2(i);
                        return true;
                    }
                } else if (ll0Var2.c == 0) {
                    TL_iv.PageBlock pageBlock = ll0Var2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !y3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if ((z3 || j2(i)) && l3(i)) {
                        if (i > 0) {
                            ll0Var = (ll0) arrayList.get(i - 1);
                        } else {
                            ll0Var = null;
                        }
                        if (z3) {
                            ll0Var2.c = 1;
                            if (ll0Var != null && ll0Var.d > 0) {
                                i3 = 1;
                            }
                            ll0Var2.d = i3;
                            return true;
                        }
                        ll0Var2.c = ll0Var.c;
                        if (ll0Var.d > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        ll0Var2.d = i2;
                        ll0Var2.e = false;
                        ll0Var2.f = false;
                        return true;
                    }
                } else if ((z2 || (i != 0 && ((ll0) arrayList.get(i - 1)).c >= ll0Var2.c)) && l3(i)) {
                    ll0Var2.c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void n2(ll0 ll0Var, i07 i07Var) {
        ah9 ah9Var = this.p3;
        IdentityHashMap identityHashMap = this.i4;
        IdentityHashMap identityHashMap2 = this.h4;
        if (i07Var == null) {
            for (i07 i07Var2 : N3(ll0Var)) {
                fi9 fi9Var = (fi9) identityHashMap2.remove(i07Var2);
                if (fi9Var != null) {
                    fi9Var.b();
                }
                bi9 bi9Var = (bi9) identityHashMap.remove(i07Var2);
                if (bi9Var != null) {
                    bi9Var.a();
                }
            }
            ArrayList arrayList = this.t3;
            int indexOf = arrayList.indexOf(ll0Var);
            if (indexOf >= 0) {
                of9 of9Var = this.R3;
                if (of9Var != null) {
                    of9Var.d();
                }
                arrayList.remove(indexOf);
                this.g3.O(true);
                of9 of9Var2 = this.R3;
                if (of9Var2 != null) {
                    of9Var2.h();
                }
            }
            ah9Var.onContentChanged();
            return;
        }
        fi9 fi9Var2 = (fi9) identityHashMap2.remove(i07Var);
        if (fi9Var2 != null) {
            fi9Var2.b();
        }
        bi9 bi9Var2 = (bi9) identityHashMap.remove(i07Var);
        if (bi9Var2 != null) {
            bi9Var2.a();
        }
        of9 of9Var3 = this.R3;
        if (of9Var3 != null) {
            of9Var3.d();
        }
        r4(ll0Var, i07Var);
        of9 of9Var4 = this.R3;
        if (of9Var4 != null) {
            of9Var4.h();
        }
        ah9Var.onContentChanged();
    }

    public final void n3(boolean z) {
        ll0 z2;
        int[] F4 = F4();
        if (F4 != null) {
            int i = F4[0];
            int i2 = F4[1];
            if (i == i2) {
                z2 = (ll0) this.t3.get(i);
            } else {
                n4(i, i2, z);
                return;
            }
        } else {
            z2 = z2();
        }
        if (z2 != null) {
            V3(z2, z);
        }
    }

    public final boolean n4(int i, int i2, boolean z) {
        boolean z2;
        if (i >= 0 && i2 >= i) {
            ArrayList arrayList = this.t3;
            if (i2 < arrayList.size()) {
                of9 of9Var = this.R3;
                if (of9Var != null) {
                    of9Var.d();
                }
                if (z) {
                    z2 = false;
                    while (i2 >= i) {
                        if (m3(i2, true, true)) {
                            z2 = true;
                        }
                        i2--;
                    }
                } else {
                    ll0 ll0Var = (ll0) arrayList.get(i);
                    if (ll0Var.c >= 1 && (i == 0 || ((ll0) arrayList.get(i - 1)).c < ll0Var.c)) {
                        return false;
                    }
                    z2 = false;
                    while (i <= i2) {
                        if (m3(i, false, true)) {
                            z2 = true;
                        }
                        i++;
                    }
                }
                if (z2) {
                    t4();
                    if (findFocus() instanceof ne9) {
                        T1();
                    } else {
                        this.g3.O(false);
                    }
                    of9 of9Var2 = this.R3;
                    if (of9Var2 != null) {
                        of9Var2.h();
                    }
                }
                return z2;
            }
        }
        return false;
    }

    public final ne9 o2(int i) {
        View C4 = C4(i);
        if (C4 instanceof td9) {
            return ((td9) C4).getCaptionEditText();
        }
        return null;
    }

    public final void o3(ll0 ll0Var, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = ll0Var.k;
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
                ll0 ll0Var2 = new ll0(new TL_iv.pageBlockParagraph(), 0, 0);
                ll0Var2.t = longValue;
                for (int i3 = 0; i3 <= i2; i3++) {
                    ll0Var2.k.add((Long) arrayList3.get(i3));
                }
                int i4 = bk9.b;
                c6c K = c6c.K(bk9.class);
                K.H = ll0Var2;
                K.I = this.n4;
                arrayList2.add(K);
                this.x4.add(ll0Var2);
            }
        }
    }

    public final void o4(ll0 ll0Var) {
        View C1 = C1(ll0Var);
        if (C1 instanceof zh9) {
            zh9 zh9Var = (zh9) C1;
            ArrayList arrayList = zh9Var.E;
            if (zh9Var.a != null) {
                zh9Var.p();
                if (zh9Var.a0 >= arrayList.size()) {
                    zh9Var.a0 = Math.max(0, arrayList.size() - 1);
                }
                zh9Var.q(false);
                zh9Var.requestLayout();
                zh9Var.invalidate();
            }
        }
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
        View F;
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
                F = null;
            } else {
                F = F(findFocus);
            }
            if (F != null) {
                int L = (gm.L(8.0f) + F.getBottom()) - (i5 - getPaddingBottom());
                if (L > 0) {
                    post(new qf9(this, L, (byte) 2));
                }
            }
        }
        this.S3 = i5;
    }

    public final void p2(int i) {
        ll0 ll0Var;
        int i2;
        ArrayList arrayList = this.t3;
        ll0 ll0Var2 = (ll0) arrayList.get(i);
        int i3 = ll0Var2.c;
        if (i3 > 0) {
            int i4 = i3 - 1;
            ll0Var2.c = i4;
            if (i4 == 0) {
                ll0Var2.d = 0;
                ll0Var2.e = false;
                ll0Var2.f = false;
            }
            while (true) {
                i++;
                if (i < arrayList.size() && (i2 = (ll0Var = (ll0) arrayList.get(i)).c) > i3) {
                    ll0Var.c = i2 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void p3() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.p3():void");
    }

    public final void p4() {
        post(new b82(this, (byte) 3));
    }

    public final xk9 q2(int i) {
        if (i < 0) {
            return null;
        }
        View m = this.f3.m(i);
        if (!(m instanceof xk9)) {
            return null;
        }
        return (xk9) m;
    }

    public final void q3(defpackage.ll0 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.q3(ll0):void");
    }

    public final void q4(int i) {
        ArrayList arrayList = this.t3;
        int min = Math.min(arrayList.size() - 1, i + 1);
        for (int max = Math.max(0, i - 1); max <= min; max++) {
            ll0 ll0Var = (ll0) arrayList.get(max);
            if (ll0Var.c > 0) {
                View C1 = C1(ll0Var);
                if (C1 instanceof xk9) {
                    ((xk9) C1).F();
                }
            }
        }
    }

    public final void r2() {
        C2();
        this.s3 = null;
        this.j4 = null;
        this.k4 = null;
        this.R3 = new of9(this.w4);
        B4();
        this.R3.j();
        ah9 ah9Var = this.p3;
        if (ah9Var != null) {
            ah9Var.E();
        }
    }

    public final void r4(ll0 ll0Var, i07 i07Var) {
        int i;
        if (ll0Var == null) {
            return;
        }
        if (x3(ll0Var.b)) {
            ArrayList c3 = c3(ll0Var.b);
            ArrayList arrayList = ll0Var.h;
            if (arrayList != null) {
                i = arrayList.indexOf(i07Var);
            } else {
                i = -1;
            }
            if (i >= 0) {
                ll0Var.h.remove(i);
                if (c3 != null && i < c3.size()) {
                    c3.remove(i);
                }
            }
            if (ll0Var.h.isEmpty()) {
                s4(ll0Var);
                return;
            }
            int size = ll0Var.h.size();
            l7c l7cVar = this.g3;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = ll0Var.b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) c3.get(0);
                ll0Var.b = pageBlock;
                pageBlock.caption = pageCaption;
                ll0Var.g = (i07) ll0Var.h.get(0);
                ll0Var.h = null;
                l7cVar.O(true);
                o4(ll0Var);
                return;
            }
            l7cVar.O(true);
            o4(ll0Var);
            return;
        }
        s4(ll0Var);
    }

    public final boolean s3() {
        int i;
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w() && (i = qg9Var.p0) == qg9Var.s0 && i >= 0 && i < this.x4.size()) {
            return C4(i) instanceof td9;
        }
        return false;
    }

    public final void s4(ll0 ll0Var) {
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(ll0Var);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.g3.O(true);
        }
    }

    public void setAdaptiveLinkDialogs(boolean z) {
        this.r3 = z;
    }

    public void setAllowTapAboveContent(boolean z) {
        this.Z3 = z;
    }

    public void setFileRefParentObject(k47 k47Var) {
        this.q3 = k47Var;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.V3 = new ArrayList();
        ArrayList arrayList = this.t3;
        S2(arrayList, hi9.b(charSequence), this.u3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.V3.add((ll0) arrayList.get(size));
        }
        this.g3.O(false);
    }

    public final boolean t2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            ll0 ll0Var = (ll0) arrayList.get(i);
            boolean z = ll0Var.i;
            ArrayList arrayList2 = ll0Var.k;
            if (!z) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    Map.EL.merge(hashMap, (Long) arrayList2.get(i2), 1, new x01((byte) 1));
                }
            }
            i++;
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ll0 ll0Var2 = (ll0) arrayList.get(i3);
            ArrayList arrayList3 = ll0Var2.k;
            if (arrayList3.size() == 1 && (ll0Var2.b instanceof TL_iv.pageBlockParagraph)) {
                Long l = (Long) arrayList3.get(0);
                l.getClass();
                Integer num = (Integer) hashMap.get(l);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = ll0Var2.b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.u3.remove(l);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    ll0Var2.b = pageblockblockquote;
                    arrayList3.clear();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final void t4() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size()) {
                ll0 ll0Var = (ll0) arrayList.get(i);
                if (ll0Var.c > 0 && ll0Var.d > 0 && !A3(ll0Var.b)) {
                    int i2 = ll0Var.c;
                    int i3 = 1;
                    for (int i4 = i - 1; i4 >= 0; i4--) {
                        ll0 ll0Var2 = (ll0) arrayList.get(i4);
                        int i5 = ll0Var2.c;
                        if (i5 < i2) {
                            break;
                        }
                        if (i5 == i2 && !A3(ll0Var2.b)) {
                            if (ll0Var2.d <= 0) {
                                break;
                            }
                            i3++;
                        }
                    }
                    ll0Var.d = i3;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final ArrayList u2() {
        TLRPC.Document document;
        i07 i07Var;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i < arrayList2.size()) {
                ll0 ll0Var = (ll0) arrayList2.get(i);
                if ((ll0Var.b instanceof TL_iv.pageBlockDocument) && (i07Var = ll0Var.g) != null && i07Var.b() && (document2 = ll0Var.g.h) != null) {
                    ((TL_iv.pageBlockDocument) ll0Var.b).document_id = document2.id;
                }
                for (i07 i07Var2 : N3(ll0Var)) {
                    if (i07Var2.b() && (document = i07Var2.h) != null) {
                        long j = document.id;
                        if (j != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j))) {
                            arrayList.add(i07Var2.h);
                        }
                    }
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    public final boolean u3() {
        int i;
        qg9 qg9Var = this.v3;
        if (qg9Var != null && qg9Var.w() && (i = qg9Var.p0) == qg9Var.s0 && t3(A4(i))) {
            return true;
        }
        return false;
    }

    public final void u4(String str) {
        qg9 qg9Var = this.v3;
        S1(qg9Var.p0, qg9Var.r0, qg9Var.s0, qg9Var.u0, str.split("\n", -1));
    }

    public final ArrayList v2(int i, int i2) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2) {
            ArrayList arrayList2 = this.t3;
            if (i >= arrayList2.size()) {
                break;
            }
            for (i07 i07Var : N3((ll0) arrayList2.get(i))) {
                if (i07Var.b() && (document = i07Var.h) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(i07Var.h);
                }
            }
            i++;
        }
        return arrayList;
    }

    public final i07 v4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document O2 = O2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (O2 != null) {
                i07 i07Var = new i07();
                i07Var.c = true;
                i07Var.a = (byte) 2;
                i07Var.h = O2;
                i07Var.i = O2;
                return i07Var;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document O22 = O2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (O22 != null) {
                i07 i07Var2 = new i07();
                i07Var2.d = true;
                i07Var2.a = (byte) 2;
                i07Var2.h = O22;
                return i07Var2;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document O23 = O2(pageblockvideo.video_id);
                if (O23 != null) {
                    i07 i07Var3 = new i07();
                    i07Var3.b = true;
                    i07Var3.a = (byte) 2;
                    i07Var3.h = O23;
                    i07Var3.n = pageblockvideo.spoiler;
                    for (int i = 0; i < O23.attributes.size(); i++) {
                        if (O23.attributes.get(i) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) O23.attributes.get(i);
                            i07Var3.j = tL_documentAttributeVideo.w;
                            i07Var3.k = tL_documentAttributeVideo.h;
                            return i07Var3;
                        }
                    }
                    return i07Var3;
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
                            for (i07 i07Var4 : N3((ll0) this.t3.get(i3))) {
                                if (i07Var4 != null && (photo = i07Var4.g) != null && photo.id == j) {
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
                            HashMap hashMap = ai9.a;
                            synchronized (ai9.class) {
                                if (i2 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) ai9.a.get(Long.valueOf(j));
                                }
                            }
                        }
                    }
                }
                if (photo != null) {
                    i07 i07Var5 = new i07();
                    i07Var5.a = (byte) 2;
                    i07Var5.g = photo;
                    i07Var5.n = pageblockphoto.spoiler;
                    TLRPC.PhotoSize w = bc4.w(photo.sizes, gm.Y0(false), false, null, false);
                    if (w != null) {
                        i07Var5.j = w.w;
                        i07Var5.k = w.h;
                    }
                    return i07Var5;
                }
            }
        }
        return null;
    }

    public final ArrayList w2(int i, int i2) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i <= i2) {
            ArrayList arrayList2 = this.t3;
            if (i >= arrayList2.size()) {
                break;
            }
            for (i07 i07Var : N3((ll0) arrayList2.get(i))) {
                if (i07Var.b() && (photo = i07Var.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(i07Var.g);
                }
            }
            i++;
        }
        return arrayList;
    }

    public final void w4(ll0 ll0Var) {
        TL_iv.PageBlock pageBlock;
        if (this.s3 != null && ll0Var != null && (pageBlock = ll0Var.b) != null) {
            boolean x3 = x3(pageBlock);
            TL_iv.PageBlock pageBlock2 = ll0Var.b;
            if (x3) {
                ArrayList c3 = c3(pageBlock2);
                ll0Var.h = new ArrayList();
                if (c3 != null) {
                    for (int i = 0; i < c3.size(); i++) {
                        i07 v4 = v4((TL_iv.PageBlock) c3.get(i));
                        ArrayList arrayList = ll0Var.h;
                        if (v4 == null) {
                            v4 = new i07();
                        }
                        arrayList.add(v4);
                    }
                    return;
                }
                return;
            }
            i07 v42 = v4(pageBlock2);
            if (v42 != null) {
                ll0Var.g = v42;
            }
        }
    }

    public final ArrayList x2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i < arrayList2.size()) {
                for (i07 i07Var : N3((ll0) arrayList2.get(i))) {
                    if (i07Var.b() && (photo = i07Var.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                        arrayList.add(i07Var.g);
                    }
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    public final ArrayList x4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ll0 ll0Var = (ll0) obj;
            boolean x3 = x3(ll0Var.b);
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (x3) {
                ArrayList c3 = c3(pageBlock);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (c3 != null) {
                    int size2 = c3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = c3.get(i2);
                        i2++;
                        TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) obj2;
                        i07 v4 = v4(pageBlock2);
                        if (v4 != null) {
                            arrayList3.add(pageBlock2);
                            arrayList4.add(v4);
                        }
                    }
                    c3.clear();
                    c3.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    ll0Var.h = arrayList4;
                    arrayList2.add(ll0Var);
                }
            } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument)) {
                arrayList2.add(ll0Var);
            } else {
                i07 v42 = v4(pageBlock);
                if (v42 != null) {
                    ll0Var.g = v42;
                    arrayList2.add(ll0Var);
                }
            }
        }
        return arrayList2;
    }

    public final void y2() {
        of9 of9Var = this.R3;
        if (of9Var != null) {
            of9Var.h();
        }
        ArrayList arrayList = this.t3;
        SpannableStringBuilder g = hi9.g(arrayList);
        C2();
        arrayList.clear();
        HashMap hashMap = this.u3;
        hashMap.clear();
        this.s3 = null;
        S2(arrayList, hi9.b(g), hashMap);
        this.g3.O(false);
        of9 of9Var2 = this.R3;
        if (of9Var2 != null) {
            of9Var2.h();
        }
        ah9 ah9Var = this.p3;
        if (ah9Var != null) {
            ah9Var.onContentChanged();
            ah9Var.E();
        }
    }

    public final void y4(int i, int i2, int i3) {
        ne9 editText;
        if (i >= 0) {
            View m = this.f3.m(i);
            if (m instanceof xk9) {
                xk9 xk9Var = (xk9) m;
                if (i2 == 1 && xk9Var.l()) {
                    editText = xk9Var.getAuthorEditText();
                } else {
                    editText = xk9Var.getEditText();
                }
                editText.P();
                editText.setSelection(Math.max(0, Math.min(i3, editText.length())));
            } else if (m instanceof kk9) {
                kk9 kk9Var = (kk9) m;
                ne9 n = kk9Var.n(i2);
                if (n == null) {
                    n = kk9Var.n(0);
                }
                if (n != null) {
                    n.P();
                    n.setSelection(Math.max(0, Math.min(i3, n.length())));
                }
            } else if (m instanceof td9) {
                ne9 captionEditText = ((td9) m).getCaptionEditText();
                captionEditText.P();
                captionEditText.setSelection(Math.max(0, Math.min(i3, captionEditText.length())));
            }
        }
    }

    public final ll0 z2() {
        int i;
        ll0 A42;
        ll0 M2 = M2();
        if (M2 != null) {
            return M2;
        }
        qg9 qg9Var = this.v3;
        if (qg9Var != null && (i = qg9Var.p0) >= 0 && (A42 = A4(i)) != null) {
            return A42;
        }
        return null;
    }

    public final void z4() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof jd9) {
                jd9 jd9Var = (jd9) childAt;
                jd9Var.b.a(jd9Var.a, new h68(jd9Var, (byte) 27));
            }
        }
        invalidate();
    }
}
