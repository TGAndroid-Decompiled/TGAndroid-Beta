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
public final class ye9 extends q5c {
    public static final ArrayList A4 = new ArrayList();
    public boolean A3;
    public float B3;
    public float C3;
    public float D3;
    public float E3;
    public View F3;
    public q62 G3;
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
    public ld9 R3;
    public int S3;
    public mc9 T3;
    public final x62 U3;
    public ArrayList V3;
    public int W3;
    public int X3;
    public int Y3;
    public boolean Z3;
    public lk0 a4;
    public boolean b4;
    public final qe9 c4;
    public final vd9 d4;
    public final re9 e4;
    public final se9 f4;
    public final te9 g4;
    public final IdentityHashMap h4;
    public final IdentityHashMap i4;
    public lk0 j4;
    public lk0 k4;
    public final ue9 l4;
    public final ee9 m4;
    public final int n3;
    public final fe9 n4;
    public final wjb o3;
    public final ge9 o4;
    public final we9 p3;
    public final he9 p4;
    public k27 q3;
    public ii9 q4;
    public boolean r3;
    public cs5 r4;
    public TL_iv.RichMessage s3;
    public int s4;
    public final ArrayList t3;
    public int t4;
    public final HashMap u3;
    public final wd9 u4;
    public final me9 v3;
    public final ie9 v4;
    public final qib w3;
    public final v39 w4;
    public int x3;
    public final ArrayList x4;
    public int y3;
    public n79 y4;
    public int z3;
    public int z4;

    public ye9(Context context, int i, wjb wjbVar, we9 we9Var) {
        super(context, i, 0, false, new tf8(r1, (byte) 12), new k88(r1, (byte) 26), null, wjbVar);
        this.r3 = true;
        this.t3 = new ArrayList();
        this.u3 = new HashMap();
        this.x3 = -1;
        this.y3 = -1;
        this.z3 = 0;
        this.U3 = new x62(this, (byte) 3);
        this.Z3 = true;
        this.c4 = new qe9(this);
        this.d4 = new vd9(this);
        this.e4 = new re9(this);
        this.f4 = new se9(this);
        this.g4 = new te9(this);
        this.h4 = new IdentityHashMap();
        this.i4 = new IdentityHashMap();
        this.l4 = new ue9(this);
        this.m4 = new ee9(this);
        this.n4 = new fe9(this);
        this.o4 = new ge9(this);
        this.p4 = new he9(this);
        this.s4 = -1;
        this.t4 = -1;
        this.u4 = new wd9(this);
        this.v4 = new ie9(this);
        v39 v39Var = new v39(this, (byte) 3);
        this.w4 = v39Var;
        this.x4 = new ArrayList();
        this.z4 = -1;
        ye9[] ye9VarArr = {this};
        this.n3 = i;
        this.o3 = wjbVar;
        this.p3 = we9Var;
        this.g3.r = false;
        setClipToPadding(false);
        setClipChildren(false);
        E1(new tf8(this, (byte) 13), false);
        setReorderLongPressEnabled(false);
        z1(true);
        me9 me9Var = new me9(this, we9Var);
        this.v3 = me9Var;
        me9Var.Q(this);
        me9Var.z0 = this.f3;
        qib m = me9Var.m(context);
        this.w3 = m;
        gl.B2(m);
        me9Var.D = new oe9(this, we9Var);
        j(new si1(this, we9Var, (byte) 11));
        this.R3 = new ld9(v39Var);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockDivider) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockButtonRow) && !(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            return false;
        }
        return true;
    }

    public static boolean B3(lk0 lk0Var) {
        if (lk0Var != null && !lk0Var.i && !t3(lk0Var) && (lk0Var.b instanceof TL_iv.pageBlockParagraph) && lk0Var.c == 0 && lk0Var.d == 0 && !lk0Var.e && lk0Var.k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void F2(lk0 lk0Var, ArrayList arrayList) {
        int i;
        int i2;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j;
        TL_iv.PageBlock pageBlock = lk0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            iy6 iy6Var = lk0Var.g;
            if (iy6Var != null && iy6Var.b()) {
                TL_iv.PageBlock pageBlock2 = lk0Var.b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        lk0Var.b.caption.text = new TL_iv.textEmpty();
                        lk0Var.b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(lk0Var.b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            iy6 iy6Var2 = lk0Var.g;
            if (iy6Var2 != null && iy6Var2.b()) {
                TL_iv.PageBlock pageBlock3 = lk0Var.b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        lk0Var.b.caption.text = new TL_iv.textEmpty();
                        lk0Var.b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(lk0Var.b);
                }
            }
        } else {
            boolean x3 = x3(pageBlock);
            TL_iv.PageBlock pageBlock4 = lk0Var.b;
            if (x3) {
                ArrayList c3 = c3(pageBlock4);
                List N3 = N3(lk0Var);
                ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
                for (int i3 = 0; c3 != null && i3 < c3.size() && i3 < N3.size(); i3++) {
                    TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) c3.get(i3);
                    if (((iy6) N3.get(i3)).b()) {
                        if (pageBlock5 instanceof TL_iv.pageBlockPhoto) {
                            j = ((TL_iv.pageBlockPhoto) pageBlock5).photo_id;
                        } else if (pageBlock5 instanceof TL_iv.pageBlockVideo) {
                            j = ((TL_iv.pageBlockVideo) pageBlock5).video_id;
                        } else {
                            j = 0;
                        }
                        if (j != 0) {
                            sb9.d(pageBlock5);
                            arrayList2.add(pageBlock5);
                        }
                    }
                }
                if (arrayList2.size() >= 2) {
                    if (lk0Var.b instanceof TL_iv.pageBlockSlideshow) {
                        TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                        pageblockslideshow.items = arrayList2;
                        pageblockslideshow.caption = lk0Var.b.caption;
                        pageblockcollage = pageblockslideshow;
                    } else {
                        TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                        pageblockcollage2.items = arrayList2;
                        pageblockcollage2.caption = lk0Var.b.caption;
                        pageblockcollage = pageblockcollage2;
                    }
                    sb9.d(pageblockcollage);
                    arrayList.add(pageblockcollage);
                } else if (arrayList2.size() == 1) {
                    arrayList.add(arrayList2.get(0));
                }
            } else if (pageBlock4 instanceof TL_iv.pageBlockAudio) {
                iy6 iy6Var3 = lk0Var.g;
                if (iy6Var3 != null && iy6Var3.b()) {
                    TL_iv.PageBlock pageBlock6 = lk0Var.b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            lk0Var.b.caption.text = new TL_iv.textEmpty();
                            lk0Var.b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(lk0Var.b);
                    }
                }
            } else if (pageBlock4 instanceof TL_iv.pageBlockDocument) {
                iy6 iy6Var4 = lk0Var.g;
                if (iy6Var4 != null && (document = iy6Var4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock4).document_id = document.id;
                }
                if (iy6Var4 != null && iy6Var4.b()) {
                    TL_iv.PageBlock pageBlock7 = lk0Var.b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        sb9.d(pageBlock7);
                        arrayList.add(lk0Var.b);
                    }
                }
            } else if (pageBlock4 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock4;
                int i4 = pf9.N;
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
                    arrayList.add(lk0Var.b);
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
                                    ffb.c(pagetablecell, "");
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
                            lk0 lk0Var = new lk0(pageBlock, i, i2);
                            lk0Var.e = z2;
                            lk0Var.f = z3;
                            arrayList.add(lk0Var);
                        }
                        z4 = true;
                    } else {
                        arrayList.add(new lk0(pageBlock, i, z ? 1 : 0));
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

    public static TL_iv.PageBlock J3(lk0 lk0Var, iy6 iy6Var) {
        int i;
        boolean x3 = x3(lk0Var.b);
        TL_iv.PageBlock pageBlock = lk0Var.b;
        if (x3) {
            ArrayList c3 = c3(pageBlock);
            ArrayList arrayList = lk0Var.h;
            if (arrayList != null) {
                i = arrayList.indexOf(iy6Var);
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

    public static void K3(defpackage.ye9[] r20, java.util.ArrayList r21, defpackage.l5c r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.K3(ye9[], java.util.ArrayList, l5c):void");
    }

    public static List N3(lk0 lk0Var) {
        if (lk0Var == null) {
            return Collections.EMPTY_LIST;
        }
        if (x3(lk0Var.b)) {
            ArrayList arrayList = lk0Var.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        iy6 iy6Var = lk0Var.g;
        if (iy6Var != null) {
            return Collections.singletonList(iy6Var);
        }
        return Collections.EMPTY_LIST;
    }

    public static void O1(ArrayList arrayList, TL_iv.RichText richText, int i, int i2, boolean z, boolean z2) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        lk0 lk0Var = new lk0(pageblockparagraph, i, i2);
        lk0Var.e = z;
        lk0Var.f = z2;
        arrayList.add(lk0Var);
    }

    public static mc9 O3(View view) {
        if (view instanceof wi9) {
            return ((wi9) view).getEditText();
        }
        if (view instanceof tb9) {
            return ((tb9) view).getCaptionEditText();
        }
        if (view instanceof ac9) {
            return ((ac9) view).getEditText();
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

    public static ii9 Q2(mc9 mc9Var) {
        for (ViewParent parent = mc9Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ii9) {
                return (ii9) parent;
            }
        }
        return null;
    }

    public static iy6 Q3(jm6 jm6Var, String str) {
        boolean z;
        int i;
        iy6 iy6Var = new iy6();
        iy6Var.b = jm6Var.b;
        iy6Var.e = str;
        iy6Var.j = jm6Var.F;
        iy6Var.k = jm6Var.G;
        String str2 = jm6Var.h;
        int i2 = 0;
        if (str2 != null && str != null && str.equals(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = jm6Var.J;
        }
        iy6Var.l = i;
        if (!z) {
            i2 = jm6Var.K;
        }
        iy6Var.m = i2;
        iy6Var.a = (byte) 1;
        iy6Var.f = 0.0f;
        return iy6Var;
    }

    public static boolean R4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(yi9.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i = 0; i < pageblocktable.rows.size(); i++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i);
            for (int i2 = 0; i2 < pagetablerow.cells.size(); i2++) {
                if (!ffb.g(pagetablerow.cells.get(i2)).isEmpty()) {
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
                        arrayList.add(new lk0(pageblockdetails, 0, 0));
                        int size2 = arrayList.size();
                        S2(arrayList, pageblockdetails.blocks, map);
                        if (arrayList.size() == size2) {
                            arrayList.add(new lk0(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                        lk0 lk0Var = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                        lk0Var.i = true;
                        arrayList.add(lk0Var);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a = wb9.a();
                        S2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((lk0) arrayList.get(size3)).k.add(0, Long.valueOf(a));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a), pageblockblockquoteblocks.caption);
                        }
                    } else {
                        arrayList.add(new lk0(pageBlock, 0, 0));
                    }
                } else {
                    K2(arrayList, pageBlock, 1);
                }
            }
        }
    }

    public static FrameLayout S4(ii9 ii9Var, boolean z) {
        int i;
        li9 m;
        ffb model = ii9Var.getModel();
        if (model != null) {
            int i2 = Integer.MAX_VALUE;
            if (z) {
                i = -1;
            } else {
                i = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : ii9Var.getSelectedCells()) {
                int a = model.a(pagetablecell2);
                int o = z ? (ffb.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z ? o < i || (o == i && a < i2) : o > i || (o == i && a < i2)) {
                    pagetablecell = pagetablecell2;
                    i2 = a;
                    i = o;
                }
            }
            if (pagetablecell != null && (m = ii9Var.getGrid().m(pagetablecell)) != null) {
                return m;
            }
        }
        return ii9Var;
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

    public static int[] e5(ii9 ii9Var) {
        int i;
        int i2;
        ffb ffbVar = ii9Var.G;
        if (ffbVar != null) {
            i = ffbVar.g.size();
        } else {
            i = 0;
        }
        while (i >= 0) {
            mc9 n = ii9Var.n(i);
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

    public static boolean h4(mc9 mc9Var, float f, float f2) {
        int[] iArr;
        if (mc9Var != null && mc9Var.getVisibility() == 0) {
            mc9Var.getLocationOnScreen(new int[2]);
            float f3 = f - iArr[0];
            float f4 = f2 - iArr[1];
            if (f3 >= 0.0f && f4 >= 0.0f && f3 <= mc9Var.getWidth() && f4 <= mc9Var.getHeight()) {
                int offsetForPosition = mc9Var.getOffsetForPosition(f3, f4);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                mc9Var.P();
                mc9Var.setSelection(Math.max(0, Math.min(offsetForPosition, mc9Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int l4(int i, lk0 lk0Var, boolean z) {
        int i2;
        if (lk0Var == null) {
            return gl.L(2.0f);
        }
        if (z) {
            i2 = lk0Var.l;
        } else {
            i2 = lk0Var.m;
        }
        int size = lk0Var.k.size() - i2;
        return de9.y(16.0f, Math.max(0, i - size), gl.L(2.0f));
    }

    public static int m4(lk0 lk0Var, lk0 lk0Var2) {
        ArrayList arrayList = lk0Var.k;
        int i = 0;
        if (lk0Var2 == null) {
            return 0;
        }
        ArrayList arrayList2 = lk0Var2.k;
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
            if (childAt instanceof wi9) {
                ((wi9) childAt).setLocked(z);
            } else if (childAt instanceof ii9) {
                ((ii9) childAt).setLocked(z);
            } else if (childAt instanceof tb9) {
                ((tb9) childAt).getCaptionEditText().setLocked(z);
            } else if (childAt instanceof ac9) {
                ((ac9) childAt).setLocked(z);
            } else if (childAt instanceof ec9) {
                childAt.invalidate();
            }
        }
    }

    public static boolean t3(lk0 lk0Var) {
        if (lk0Var != null && (lk0Var.b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean v3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || A3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !wi9.y(pageBlock).isEmpty()) {
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
        me9 me9Var = this.v3;
        int i = me9Var.p0;
        int i2 = me9Var.r0;
        int i3 = me9Var.s0;
        if (!S1(i, i2, i3, me9Var.u0, new String[]{""})) {
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
                lk0 lk0Var = (lk0) arrayList3.get(max);
                if (lk0Var.t == 0 && arrayList.indexOf(lk0Var) >= 0) {
                    arrayList2.add(lk0Var);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                ld9 ld9Var = this.R3;
                if (ld9Var != null) {
                    ld9Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new lk0(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.u3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        hashSet.addAll(((lk0) arrayList.get(i4)).k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                t2();
                S3();
                t4();
                me9Var.e(false);
                this.g3.O(false);
                ld9 ld9Var2 = this.R3;
                if (ld9Var2 != null) {
                    ld9Var2.h();
                }
                post(new sd9(this, (lk0) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), (byte) 0));
            }
        }
    }

    public final lk0 A4(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.x4;
            if (i < arrayList.size()) {
                return (lk0) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    public final boolean B2() {
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            me9Var.e(false);
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
        arrayList.add(new lk0(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new lk0(new TL_iv.pageBlockParagraph(), 0, 0));
        this.g3.O(false);
    }

    public final void C2() {
        me9 me9Var = this.v3;
        if (me9Var != null) {
            me9Var.e(true);
        }
        I2();
        j3();
        IdentityHashMap identityHashMap = this.h4;
        for (bg9 bg9Var : identityHashMap.values()) {
            bg9Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.i4;
        for (xf9 xf9Var : identityHashMap2.values()) {
            xf9Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean C3() {
        int i;
        lk0 A42;
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w() && (i = me9Var.p0) == me9Var.s0 && i >= 0 && i < this.x4.size() && me9Var.q0 == 1 && me9Var.t0 == 1 && (A42 = A4(i)) != null && wi9.n(A42.b)) {
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
            if (t3((lk0) arrayList.get(i3))) {
                i2++;
            } else if (((lk0) arrayList.get(i3)).i) {
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
                    lk0 lk0Var = (lk0) arrayList.get(i);
                    if (!lk0Var.i && !t3(lk0Var)) {
                        if (!lk0Var.k.isEmpty() || wi9.n(lk0Var.b)) {
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
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            int indexOf = arrayList.indexOf(A4(me9Var.p0));
            int indexOf2 = arrayList.indexOf(A4(me9Var.s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        lk0 M2 = M2();
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

    public final mc9 E2(int i) {
        if (!t3(A4(i))) {
            return null;
        }
        View C4 = C4(i);
        if (!(C4 instanceof ac9)) {
            return null;
        }
        return ((ac9) C4).getEditText();
    }

    public final boolean E3() {
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            int i = me9Var.p0;
            int i2 = me9Var.s0;
            if (i >= 0 && i2 >= 0 && i2 >= i) {
                boolean z = false;
                while (i <= i2) {
                    lk0 A42 = A4(i);
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
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            if (H3()) {
                int i5 = me9Var.p0;
                int i6 = me9Var.q0;
                int i7 = me9Var.t0;
                int i8 = me9Var.r0;
                int i9 = me9Var.u0;
                for (int i10 = i6; i10 <= i7; i10++) {
                    mc9 Q4 = Q4(i5, i10);
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
                mc9 E2 = E2(me9Var.p0);
                if (E2 != null && Math.max(0, Math.min(Math.min(me9Var.r0, me9Var.u0), E2.length())) < Math.max(0, Math.min(Math.max(me9Var.r0, me9Var.u0), E2.length()))) {
                    return true;
                }
            } else if (s3()) {
                mc9 o2 = o2(me9Var.p0);
                if (o2 != null) {
                    int i11 = me9Var.r0;
                    int i12 = me9Var.u0;
                    if (Math.max(0, Math.min(Math.min(i11, i12), o2.length())) < Math.max(0, Math.min(Math.max(i11, i12), o2.length()))) {
                        return true;
                    }
                }
            } else {
                boolean C3 = C3();
                int i13 = me9Var.p0;
                if (C3) {
                    mc9 k4 = k4(i13);
                    if (k4 != null) {
                        int i14 = me9Var.r0;
                        int i15 = me9Var.u0;
                        if (Math.max(0, Math.min(Math.min(i14, i15), k4.length())) < Math.max(0, Math.min(Math.max(i14, i15), k4.length()))) {
                            return true;
                        }
                    }
                } else {
                    int i16 = me9Var.s0;
                    int i17 = me9Var.r0;
                    int i18 = me9Var.u0;
                    if (i13 >= 0 && i16 >= 0 && i16 >= i13 && i16 < this.x4.size()) {
                        for (int i19 = i13; i19 <= i16; i19++) {
                            lk0 A42 = A4(i19);
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
        we9 we9Var = this.p3;
        if (we9Var != null) {
            we9Var.s();
        }
    }

    public final boolean F3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.F3(int, int, int, int, int):boolean");
    }

    public final int[] F4() {
        me9 me9Var = this.v3;
        if (me9Var != null) {
            int i = me9Var.p0;
            int i2 = me9Var.s0;
            if (i >= 0 && i2 >= 0) {
                lk0 A42 = A4(i);
                lk0 A43 = A4(i2);
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
        we9 we9Var = this.p3;
        if (we9Var != null) {
            we9Var.K();
        }
        z4();
    }

    public final boolean G3(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        boolean z = false;
        for (int i9 = i3; i9 <= i5; i9++) {
            mc9 Q4 = Q4(i2, i9);
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

    public final void G4(mc9 mc9Var) {
        mc9Var.c2 = this.r3;
        mc9Var.D(new q62(this, (byte) 4));
    }

    @Override
    public final void H1(s49 s49Var) {
        we9 we9Var = this.p3;
        if (we9Var != null && s49Var != null) {
            View view = s49Var.a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.b4 = we9Var.a(view.getHeight() + iArr[1]);
        }
    }

    public final boolean H3() {
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            int i = me9Var.p0;
            int i2 = me9Var.s0;
            lk0 A42 = A4(i);
            if (i == i2 && A42 != null && (A42.b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H4(defpackage.ii9 r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.H4(ii9):void");
    }

    @Override
    public final void I1(s49 s49Var) {
        lk0 lk0Var = this.a4;
        this.a4 = null;
        this.b4 = false;
        if (lk0Var != null) {
            ld9 ld9Var = this.R3;
            if (ld9Var != null) {
                ld9Var.d();
            }
            s4(lk0Var);
            ld9 ld9Var2 = this.R3;
            if (ld9Var2 != null) {
                ld9Var2.h();
            }
            we9 we9Var = this.p3;
            if (we9Var != null) {
                we9Var.onContentChanged();
            }
        } else if (s49Var != null) {
            View view = s49Var.a;
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
        cs5 cs5Var = this.r4;
        if (cs5Var != null) {
            this.r4 = null;
            cs5Var.u();
        }
        ii9 ii9Var = this.q4;
        if (ii9Var != null) {
            LinkedHashSet linkedHashSet = ii9Var.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                ii9Var.w.invalidate();
                ii9Var.v();
            }
            this.q4 = null;
        }
        this.t4 = -1;
        this.s4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean I3() {
        gr grVar = na7.q1(this.n3).k4;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            i2 += N3((lk0) arrayList.get(i)).size();
            i++;
        }
        ArrayList V2 = V2();
        ?? obj = new Object();
        obj.d = i2;
        obj.b = V2.size() + obj.b;
        for (int i3 = 0; i3 < V2.size(); i3++) {
            md9.b((TL_iv.PageBlock) V2.get(i3), 1, obj);
        }
        if (obj.a > grVar.Z.f() || obj.b > grVar.a0.f() || obj.c > grVar.b0.f() || obj.d > grVar.c0.f() || obj.e > grVar.d0.f()) {
            return false;
        }
        return true;
    }

    public final wi9 I4() {
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            int i = me9Var.p0;
            int i2 = me9Var.s0;
            lk0 A42 = A4(i);
            if (i == i2 && A42 != null && w3(A42.b)) {
                return q2(i);
            }
            return null;
        }
        return null;
    }

    @Override
    public final void J1(s49 s49Var) {
        int b;
        c4c G;
        lk0 lk0Var = null;
        if (s49Var != null && (b = s49Var.b()) >= 0 && (G = this.g3.G(b)) != null) {
            Object obj = G.H;
            if (obj instanceof lk0) {
                lk0Var = (lk0) obj;
            }
        }
        this.a4 = lk0Var;
        this.b4 = false;
        we9 we9Var = this.p3;
        if (we9Var != null) {
            we9Var.f();
        }
    }

    public final Editable J4(int i, int i2, int i3, int i4) {
        if (i == i3) {
            if (t3(A4(i))) {
                mc9 E2 = E2(i);
                if (E2 != null) {
                    return E2.getText();
                }
                return null;
            } else if (C3()) {
                mc9 k4 = k4(i);
                if (k4 != null) {
                    return k4.getText();
                }
                return null;
            } else {
                lk0 A42 = A4(i);
                if (A42 != null && w3(A42.b)) {
                    int d2 = d2(i);
                    if (de9.g(i2, i4, d2, 0) < ls6.A(i2, i4, d2, 0)) {
                        wi9 q2 = q2(i);
                        if (q2 != null) {
                            return q2.getEditText().getText();
                        }
                        return wi9.z(A42.b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock K4(defpackage.lk0 r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.K4(lk0, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean L1(lk0 lk0Var, lk0 lk0Var2, int i) {
        float f;
        if (w3(lk0Var.b)) {
            TL_iv.PageBlock pageBlock = lk0Var2.b;
            ArrayList arrayList = lk0Var2.k;
            if (w3(pageBlock)) {
                View C1 = C1(lk0Var2);
                if (C1 instanceof wi9) {
                    mc9 editText = ((wi9) C1).getEditText();
                    if (editText.isFocused()) {
                        SpannableStringBuilder z = wi9.z(lk0Var.b);
                        Paint.FontMetricsInt fontMetricsInt = editText.getPaint().getFontMetricsInt();
                        if (y3(lk0Var.b)) {
                            f = 0.85f;
                        } else {
                            f = 1.0f;
                        }
                        CharSequence n = vu3.n(z, fontMetricsInt, false, null, 0, f, 0);
                        int length = n.length();
                        Editable text = editText.getText();
                        if (text != null && n.length() != 0) {
                            editText.i2 = true;
                            text.insert(0, n);
                            editText.i2 = false;
                        }
                        wi9.b(lk0Var.b, editText.getText());
                        lk0Var2.b = lk0Var.b;
                        lk0Var2.c = lk0Var.c;
                        lk0Var2.d = lk0Var.d;
                        lk0Var2.e = lk0Var.e;
                        lk0Var2.f = lk0Var.f;
                        arrayList.clear();
                        arrayList.addAll(lk0Var.k);
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

    public final mc9 L2() {
        View findFocus = findFocus();
        if (findFocus instanceof mc9) {
            return (mc9) findFocus;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof wi9) {
                return ((wi9) childAt).getEditText();
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
                int length = wi9.y(((lk0) arrayList.get(i2)).b).length();
                if (i <= i3 + length) {
                    return new int[]{i2, i - i3};
                }
                i3 += length + 1;
                i2++;
            } else {
                int size2 = arrayList.size() - 1;
                return new int[]{size2, wi9.y(((lk0) this.V3.get(size2)).b).length()};
            }
        }
    }

    public final boolean L4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.L4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final lk0 M2() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof wi9) {
                wi9 wi9Var = (wi9) childAt;
                if (wi9Var.getEditText().isFocused() || (wi9Var.l() && wi9Var.h.isFocused())) {
                    return wi9Var.getRow();
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
                lk0 lk0Var = (lk0) arrayList.get(i3);
                if (t3(lk0Var)) {
                    i2++;
                } else if (lk0Var.i && i2 - 1 == 0) {
                    return i3;
                }
                i3++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final void M4(View view) {
        s49 T;
        int b;
        if (view != null && this.h3 != null && this.k3 && (T = T(view)) != null && (b = T.b()) >= 0 && this.g3.H(b) >= 0) {
            this.I3 = true;
            me9 me9Var = this.v3;
            if (me9Var.w()) {
                me9Var.e(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.h3.s(T);
        }
    }

    public final void N1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.N1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final ii9 N2() {
        View findFocus = findFocus();
        if (findFocus instanceof mc9) {
            return Q2((mc9) findFocus);
        }
        return null;
    }

    public final void N4(lk0 lk0Var, iy6 iy6Var, jm6 jm6Var) {
        float f;
        bg9 bg9Var = (bg9) this.h4.remove(iy6Var);
        if (bg9Var != null) {
            bg9Var.b();
        }
        IdentityHashMap identityHashMap = this.i4;
        xf9 xf9Var = (xf9) identityHashMap.remove(iy6Var);
        if (xf9Var != null) {
            xf9Var.a();
        }
        iy6Var.a = (byte) 1;
        iy6Var.f = 0.0f;
        xf9 xf9Var2 = new xf9(this.n3, jm6Var, new xl3((ViewGroup) this, (Object) iy6Var, (Object) lk0Var, (byte) 28));
        identityHashMap.put(iy6Var, xf9Var2);
        if (!xf9Var2.f && !xf9Var2.h && !xf9Var2.n) {
            xf9Var2.f = true;
            int i = jm6Var.F;
            String str = jm6Var.I;
            int i2 = jm6Var.G;
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
            oac oacVar = null;
            r9 = null;
            ArrayList arrayList = null;
            oacVar = null;
            if (i > 0 && i2 > 0) {
                int i3 = jm6Var.J;
                if (i3 == 90 || i3 == 270) {
                    int i4 = i2;
                    i2 = i;
                    i = i4;
                }
                oac oacVar2 = new oac();
                oacVar2.a = 0L;
                oacVar2.d = 0.0f;
                long j = 3000;
                oacVar2.b = Math.min(3000L, jm6Var.t);
                while (true) {
                    long j2 = oacVar2.b;
                    if (j2 > 0) {
                        if (j2 < 1000) {
                            oacVar2.b = j2 << 1;
                        } else {
                            j = j2;
                            break;
                        }
                    } else {
                        oacVar2.b = 3000L;
                        break;
                    }
                }
                oacVar2.e = (float) j;
                oacVar2.f = 1;
                oacVar2.g = 0;
                oacVar2.o = str;
                oacVar2.q = (int) ((f / 1000.0f) * 115200.0f);
                oacVar2.r = j;
                oacVar2.n = 30;
                oacVar2.v = j;
                oacVar2.A = jm6Var.o;
                String str2 = jm6Var.k;
                if (str2 != null) {
                    oacVar2.B = str2;
                    ArrayList arrayList2 = jm6Var.q;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList = jm6Var.q;
                    }
                    oacVar2.G = arrayList;
                } else {
                    oacVar2.B = jm6Var.j;
                    oacVar2.G = jm6Var.p;
                }
                oacVar2.I = true;
                zl6 zl6Var = jm6Var.A;
                if (zl6Var != null) {
                    int i5 = zl6Var.k;
                    if (i5 == 90 || i5 == 270) {
                        int i6 = i2;
                        i2 = i;
                        i = i6;
                    }
                    i = (int) (i * zl6Var.e);
                    i2 = (int) (i2 * zl6Var.f);
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
                oacVar2.k = i7;
                oacVar2.h = i7;
                oacVar2.l = i8;
                oacVar2.i = i8;
                oacVar2.m = -1;
                oacVar2.t = true;
                oacVar2.c = 0L;
                oacVar = oacVar2;
            }
            xf9Var2.d = oacVar;
            if (oacVar != null && oacVar.b()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 1;
                String absolutePath = new File(ba4.z(4), "rich_anim_" + gba.p() + ".mp4").getAbsolutePath();
                xf9Var2.e = absolutePath;
                tL_message.attachPath = absolutePath;
                k27 k27Var = new k27(xf9Var2.a, tL_message, null, false, false);
                xf9Var2.c = k27Var;
                k27Var.r0 = xf9Var2.d;
                kk7 f4 = kk7.f(xf9Var2.a);
                f4.a(xf9Var2, kk7.Z1);
                f4.a(xf9Var2, kk7.a2);
                f4.a(xf9Var2, kk7.b2);
                MediaController.w().g0(xf9Var2.c, false, false, false);
                return;
            }
            xf9Var2.b();
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
            for (iy6 iy6Var : N3((lk0) this.t3.get(i3))) {
                if (iy6Var != null && (document = iy6Var.h) != null && document.id == j) {
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
        HashMap hashMap = wf9.a;
        synchronized (wf9.class) {
            if (i != 0) {
                document2 = (TLRPC.Document) wf9.b.get(Long.valueOf(j));
            }
        }
        return document2;
    }

    public final void O4(lk0 lk0Var, iy6 iy6Var, String str, boolean z, int i, int i2, int i3) {
        IdentityHashMap identityHashMap = this.h4;
        bg9 bg9Var = (bg9) identityHashMap.remove(iy6Var);
        if (bg9Var != null) {
            bg9Var.b();
        }
        bg9 bg9Var2 = new bg9(this.n3, str, z, i, i2, i3, new le9(this, iy6Var, lk0Var));
        identityHashMap.put(iy6Var, bg9Var2);
        bg9Var2.d();
    }

    public final void P1(lk0 lk0Var, jm6 jm6Var) {
        TL_iv.PageBlock pageblockvideo;
        ye9 ye9Var;
        if (lk0Var != null && z3(lk0Var.b)) {
            String str = jm6Var.h;
            if (str == null) {
                str = jm6Var.I;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                ld9 ld9Var = this.R3;
                if (ld9Var != null) {
                    ld9Var.d();
                }
                iy6 Q3 = Q3(jm6Var, str2);
                boolean c = xf9.c(jm6Var);
                if (!jm6Var.b && !c) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (x3(lk0Var.b)) {
                    c3(lk0Var.b).add(pageblockvideo);
                    ArrayList arrayList = lk0Var.h;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        lk0Var.h = arrayList;
                    }
                    arrayList.add(Q3);
                } else {
                    iy6 iy6Var = lk0Var.g;
                    if (iy6Var != null && iy6Var.a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = lk0Var.b.caption;
                        sb9.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
                        pageblockcollage.items = arrayList2;
                        arrayList2.add(lk0Var.b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList3 = new ArrayList();
                        lk0Var.h = arrayList3;
                        arrayList3.add(lk0Var.g);
                        lk0Var.h.add(Q3);
                        lk0Var.g = null;
                        lk0Var.b = pageblockcollage;
                    } else {
                        lk0Var.b = pageblockvideo;
                        lk0Var.g = Q3;
                    }
                }
                this.g3.O(false);
                o4(lk0Var);
                if (c) {
                    N4(lk0Var, Q3, jm6Var);
                    ye9Var = this;
                } else {
                    ye9Var = this;
                    ye9Var.O4(lk0Var, Q3, str2, jm6Var.b, jm6Var.F, jm6Var.G, jm6Var.E);
                }
                ld9 ld9Var2 = ye9Var.R3;
                if (ld9Var2 != null) {
                    ld9Var2.h();
                }
                ye9Var.p3.onContentChanged();
            }
        }
    }

    public final int P2(int i, int i2) {
        while (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i >= arrayList.size()) {
                break;
            }
            lk0 lk0Var = (lk0) arrayList.get(i);
            if (!lk0Var.i) {
                int i3 = -1;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    lk0 lk0Var2 = (lk0) arrayList.get(i5);
                    if (t3(lk0Var2)) {
                        i4++;
                        if (i3 == -1 && !((TL_iv.pageBlockDetails) lk0Var2.b).open) {
                            i3 = i4;
                        }
                    } else if (lk0Var2.i) {
                        if (i3 != -1 && i4 == i3) {
                            i3 = -1;
                        }
                        i4--;
                    }
                }
                if (i3 == -1) {
                    TL_iv.PageBlock pageBlock = lk0Var.b;
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

    public final Editable P4(lk0 lk0Var) {
        View C1 = C1(lk0Var);
        if (C1 instanceof wi9) {
            return ((wi9) C1).getEditText().getText();
        }
        return wi9.z(lk0Var.b);
    }

    public final void Q1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            ld9 ld9Var = this.R3;
            if (ld9Var != null) {
                ld9Var.d();
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
                    w4((lk0) arrayList4.get(i));
                }
                ArrayList arrayList5 = this.t3;
                int size = arrayList5.size();
                lk0 M2 = M2();
                if (M2 != null && (indexOf = arrayList5.indexOf(M2)) >= 0) {
                    TL_iv.PageBlock pageBlock = M2.b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && wi9.y(pageBlock).isEmpty()) {
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
                ld9 ld9Var2 = this.R3;
                if (ld9Var2 != null) {
                    ld9Var2.h();
                }
                we9 we9Var = this.p3;
                if (we9Var != null) {
                    we9Var.onContentChanged();
                }
            }
        }
    }

    public final mc9 Q4(int i, int i2) {
        View C4 = C4(i);
        if (!(C4 instanceof ii9)) {
            return null;
        }
        return ((ii9) C4).n(i2);
    }

    public final lk0 R1(lk0 lk0Var, int i) {
        int i2;
        ArrayList arrayList = this.x4;
        int indexOf = arrayList.indexOf(lk0Var);
        if (indexOf >= 0 && (i2 = indexOf + i) >= 0 && i2 < arrayList.size()) {
            lk0 lk0Var2 = (lk0) arrayList.get(i2);
            if (lk0Var2.t != 0) {
                return lk0Var2;
            }
            return null;
        }
        return null;
    }

    public final void R2() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof wi9) {
                wi9 wi9Var = (wi9) childAt;
                wi9Var.f.K();
                wi9Var.h.K();
            } else if (childAt instanceof tb9) {
                ((tb9) childAt).getCaptionEditText().K();
            } else if (childAt instanceof ac9) {
                ((ac9) childAt).getEditText().K();
            }
        }
    }

    public final lk0 R3(int i, int i2) {
        while (i >= 0) {
            ArrayList arrayList = this.x4;
            if (i < arrayList.size()) {
                lk0 lk0Var = (lk0) arrayList.get(i);
                if (!lk0Var.i) {
                    if (lk0Var.t == 0) {
                        TL_iv.PageBlock pageBlock = lk0Var.b;
                        if (A3(pageBlock) && !h3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    return lk0Var;
                }
                i += i2;
            } else {
                return null;
            }
        }
        return null;
    }

    public final boolean S1(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.S1(int, int, int, int, java.lang.String[]):boolean");
    }

    public final void S3() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size()) {
                lk0 lk0Var = (lk0) arrayList.get(i);
                if (!lk0Var.k.isEmpty() && wi9.n(lk0Var.b)) {
                    long a = wb9.a();
                    TL_iv.RichText h = wi9.h(lk0Var.b);
                    if (h != null && !(h instanceof TL_iv.textEmpty)) {
                        this.u3.put(Long.valueOf(a), h);
                    }
                    lk0Var.k.add(Long.valueOf(a));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = lk0Var.b.text;
                    lk0Var.b = pageblockparagraph;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void T1() {
        wi9 wi9Var;
        lk0 lk0Var;
        ti9 ti9Var;
        this.g3.T();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof wi9) && (lk0Var = (wi9Var = (wi9) childAt).y) != null && (ti9Var = wi9Var.E) != null) {
                wi9Var.d(lk0Var, ti9Var, wi9Var.F);
            }
        }
    }

    public final void T3(lk0 lk0Var) {
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(lk0Var);
        if (indexOf < 0) {
            return;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        lk0 lk0Var2 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
        lk0Var2.k.addAll(lk0Var.k);
        arrayList.add(indexOf + 1, lk0Var2);
        t4();
        this.g3.O(false);
        ld9 ld9Var2 = this.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        post(new sd9(this, lk0Var2, (byte) 23));
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
                    ld9 ld9Var = this.R3;
                    if (ld9Var != null) {
                        ld9Var.d();
                    }
                    if (D3(i, i2)) {
                        for (int i3 = i; i3 <= i2; i3++) {
                            lk0 lk0Var = (lk0) arrayList.get(i3);
                            boolean z2 = lk0Var.i;
                            ArrayList arrayList2 = lk0Var.k;
                            if (!z2 && !t3(lk0Var)) {
                                if (wi9.n(lk0Var.b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = lk0Var.b.text;
                                    lk0Var.b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    tb4.v(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a = wb9.a();
                        for (int i4 = i; i4 <= i2; i4++) {
                            lk0 lk0Var2 = (lk0) arrayList.get(i4);
                            boolean z3 = lk0Var2.i;
                            ArrayList arrayList3 = lk0Var2.k;
                            if (!z3 && !t3(lk0Var2)) {
                                if (wi9.n(lk0Var2.b)) {
                                    long a2 = wb9.a();
                                    TL_iv.RichText h = wi9.h(lk0Var2.b);
                                    if (h != null && !(h instanceof TL_iv.textEmpty)) {
                                        this.u3.put(Long.valueOf(a2), h);
                                    }
                                    arrayList3.add(Long.valueOf(a2));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = lk0Var2.b.text;
                                    lk0Var2.b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a));
                            }
                        }
                    }
                    t2();
                    S3();
                    t4();
                    me9 me9Var = this.v3;
                    if (me9Var != null && me9Var.w()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    lk0 lk0Var3 = (lk0) arrayList.get(Math.max(0, Math.min(i, arrayList.size() - 1)));
                    lk0 lk0Var4 = (lk0) arrayList.get(Math.max(0, Math.min(i2, arrayList.size() - 1)));
                    this.g3.O(false);
                    ld9 ld9Var2 = this.R3;
                    if (ld9Var2 != null) {
                        ld9Var2.h();
                    }
                    if (z) {
                        post(new gm8(this, lk0Var3, lk0Var4, (byte) 12));
                    } else {
                        post(new sd9(this, lk0Var3, (byte) 9));
                    }
                }
            }
        }
    }

    public final boolean U1(int i, int i2) {
        me9 me9Var;
        ArrayList arrayList = this.V3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i, i2));
            int max2 = Math.max(0, Math.max(i, i2));
            int[] L3 = L3(max);
            int[] L32 = L3(max2);
            lk0 lk0Var = (lk0) this.V3.get(L3[0]);
            if (L3[0] != L32[0] && max != max2) {
                View C1 = C1(lk0Var);
                View C12 = C1(this.V3.get(L32[0]));
                if ((C1 instanceof wi9) && (C12 instanceof wi9)) {
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.t3;
                        int size = arrayList2.size();
                        me9Var = this.v3;
                        if (i3 >= size) {
                            break;
                        }
                        me9Var.W(i3, wi9.y(((lk0) arrayList2.get(i3)).b));
                        i3++;
                    }
                    wi9 wi9Var = (wi9) C1;
                    int length = wi9Var.getEditText().length();
                    if (L3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!me9Var.i0(wi9Var, 0, L3[1], length)) {
                        wi9Var.A();
                        return true;
                    }
                    me9Var.a0(0, L32[1], (wi9) C12);
                    return true;
                }
            } else {
                View C13 = C1(lk0Var);
                if (C13 instanceof wi9) {
                    wi9 wi9Var2 = (wi9) C13;
                    wi9Var2.A();
                    mc9 editText = wi9Var2.getEditText();
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
        ye9 ye9Var;
        int i4;
        int i5;
        ye9 ye9Var2;
        ArrayList arrayList = new ArrayList();
        int i6 = i;
        while (i6 < i2) {
            ArrayList arrayList2 = this.t3;
            lk0 lk0Var = (lk0) arrayList2.get(i6);
            boolean z3 = lk0Var.i;
            ArrayList arrayList3 = lk0Var.k;
            if (z3) {
                i6++;
            } else if (arrayList3.size() > i3) {
                Long l = (Long) arrayList3.get(i3);
                long longValue = l.longValue();
                int i7 = i6 + 1;
                while (i7 < i2) {
                    lk0 lk0Var2 = (lk0) arrayList2.get(i7);
                    if (lk0Var2.k.size() <= i3 || ((Long) lk0Var2.k.get(i3)).longValue() != longValue) {
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
            } else if (t3(lk0Var)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) lk0Var.b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int M3 = this.M3(i6);
                pageblockdetails.blocks = this.U2(i6 + 1, Math.min(M3, i2), i3, true);
                arrayList.add(pageblockdetails);
                i6 = M3 + 1;
            } else {
                int i8 = lk0Var.c;
                if (i8 <= 0) {
                    F2(lk0Var, arrayList);
                    i6++;
                    i4 = i2;
                    i5 = i3;
                    ye9Var2 = this;
                } else {
                    int[] iArr = {i6};
                    if (lk0Var.d > 0) {
                        z2 = true;
                        i4 = i2;
                        i5 = i3;
                        ye9Var = this;
                    } else {
                        z2 = false;
                        ye9Var = this;
                        i4 = i2;
                        i5 = i3;
                    }
                    TL_iv.PageBlock f2 = ye9Var.f2(i6, i8, i4, i5, z2, iArr);
                    ye9Var2 = ye9Var;
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
                this = ye9Var2;
                i2 = i4;
                i3 = i5;
            }
        }
        if (!z) {
            while (!arrayList.isEmpty() && v3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && v3((TL_iv.PageBlock) b00.f(1, arrayList))) {
                tb4.v(1, arrayList);
            }
        }
        return arrayList;
    }

    public final boolean U3(defpackage.lk0 r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.U3(lk0, boolean):boolean");
    }

    public final void U4(defpackage.lk0 r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.U4(lk0, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
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
                lk0 lk0Var = (lk0) arrayList6.get(i8);
                ArrayList arrayList7 = lk0Var.j;
                ArrayList arrayList8 = lk0Var.k;
                arrayList7.clear();
                int i9 = 1;
                if (lk0Var.i) {
                    if (!arrayList.isEmpty()) {
                        tb4.v(1, arrayList);
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
                        arrayList7.add((wb9) arrayList.get(i11));
                    }
                    int max = Math.max(i7, lk0Var.c);
                    if (max == 0) {
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    } else {
                        if (lk0Var.d > 0) {
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
                                arrayList2.add(Long.valueOf(wb9.a()));
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
                                if (((Long) arrayList5.get(i13)).longValue() != 0 && A3(lk0Var.b)) {
                                    ((Integer) arrayList4.get(i13)).getClass();
                                    ((Long) arrayList5.get(i13)).getClass();
                                } else {
                                    arrayList4.set(i13, Integer.valueOf(((Integer) arrayList4.get(i13)).intValue() + 1));
                                    arrayList5.set(i13, Long.valueOf(lk0Var.a));
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
                    if (t3(lk0Var)) {
                        boolean z2 = ((TL_iv.pageBlockDetails) lk0Var.b).open;
                        wb9.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (wi9.n(lk0Var.b)) {
                        wb9.a();
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

    public final boolean V3(defpackage.lk0 r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.V3(lk0, boolean):boolean");
    }

    public final boolean V4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.V4():boolean");
    }

    public final void W1(k27 k27Var) {
        TLRPC.Document F0;
        String str;
        if (k27Var != null && (F0 = k27Var.F0()) != null) {
            ld9 ld9Var = this.R3;
            if (ld9Var != null) {
                ld9Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z = false;
            lk0 lk0Var = new lk0(pageblockaudio, 0, 0);
            iy6 iy6Var = new iy6();
            lk0Var.g = iy6Var;
            iy6Var.c = true;
            long j = F0.id;
            if (j == 0 || F0.dc_id == 0 || F0.access_hash == 0) {
                z = true;
            }
            if (z) {
                TLRPC.Message message = k27Var.k;
                if (message != null) {
                    str = message.attachPath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                iy6 iy6Var2 = lk0Var.g;
                iy6Var2.i = F0;
                iy6Var2.e = str;
                iy6Var2.a = (byte) 1;
                iy6Var2.f = 0.0f;
            } else {
                iy6Var.h = F0;
                iy6Var.i = F0;
                iy6Var.a = (byte) 2;
                pageblockaudio.audio_id = j;
            }
            q3(lk0Var);
            if (z) {
                iy6 iy6Var3 = lk0Var.g;
                String str2 = iy6Var3.e;
                IdentityHashMap identityHashMap = this.h4;
                bg9 bg9Var = (bg9) identityHashMap.remove(iy6Var3);
                if (bg9Var != null) {
                    bg9Var.b();
                }
                bg9 bg9Var2 = new bg9(this.n3, str2, F0, new ke9(this, iy6Var3, lk0Var));
                identityHashMap.put(iy6Var3, bg9Var2);
                bg9Var2.d();
            }
            ld9 ld9Var2 = this.R3;
            if (ld9Var2 != null) {
                ld9Var2.h();
            }
            this.p3.onContentChanged();
        }
    }

    public final boolean W2() {
        lk0 lk0Var;
        ArrayList arrayList = this.t3;
        if (arrayList.isEmpty()) {
            lk0Var = null;
        } else {
            lk0Var = (lk0) b00.f(1, arrayList);
        }
        if (lk0Var != null && !A3(lk0Var.b) && !lk0Var.i && !t3(lk0Var) && !G2(lk0Var.b)) {
            if (!(C1(lk0Var) instanceof wi9)) {
                return false;
            }
            a3(lk0Var);
            return true;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        lk0 lk0Var2 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(lk0Var2);
        this.g3.O(false);
        ld9 ld9Var2 = this.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        post(new sd9(this, lk0Var2, (byte) 21));
        return true;
    }

    public final void W3() {
        if (this.Q3) {
            return;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.h();
        }
        this.p3.e();
        p4();
    }

    public final boolean W4(android.view.View r10, float r11, float r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.W4(android.view.View, float, float):boolean");
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

    public final void X2(lk0 lk0Var, boolean z) {
        int i;
        View C1 = C1(lk0Var);
        if (C1 instanceof ai9) {
            mc9 mc9Var = ((ai9) C1).r;
            mc9Var.O();
            if (z) {
                i = mc9Var.length();
            } else {
                i = 0;
            }
            mc9Var.setSelection(i);
            return;
        }
        Y2(lk0Var, z);
    }

    public final void X3() {
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
        mc9 Q4;
        int length5;
        int g5;
        int A6;
        boolean H3 = H3();
        me9 me9Var = this.v3;
        if (H3) {
            int i = me9Var.p0;
            int i2 = me9Var.q0;
            if (i2 == me9Var.t0 && (Q4 = Q4(i, i2)) != null && (g5 = de9.g(me9Var.r0, me9Var.u0, (length5 = Q4.length()), 0)) < (A6 = ls6.A(me9Var.r0, me9Var.u0, length5, 0))) {
                ld9 ld9Var = this.R3;
                if (ld9Var != null) {
                    ld9Var.d();
                }
                if (yi9.h(Q4.getText(), g5, A6)) {
                    yi9.n(Q4.getText(), g5, A6);
                    Q4.f();
                    g4(i, i2);
                    ld9 ld9Var2 = this.R3;
                    if (ld9Var2 != null) {
                        ld9Var2.h();
                    }
                    p4();
                }
                Q4.U1 = g5;
                Q4.V1 = A6;
                Q4.C();
            }
        } else if (u3()) {
            int i3 = me9Var.p0;
            mc9 E2 = E2(i3);
            if (E2 != null && (g4 = de9.g(me9Var.r0, me9Var.u0, (length4 = E2.length()), 0)) < (A5 = ls6.A(me9Var.r0, me9Var.u0, length4, 0))) {
                ld9 ld9Var3 = this.R3;
                if (ld9Var3 != null) {
                    ld9Var3.d();
                }
                if (yi9.h(E2.getText(), g4, A5)) {
                    yi9.n(E2.getText(), g4, A5);
                    E2.f();
                    e4(i3);
                    ld9 ld9Var4 = this.R3;
                    if (ld9Var4 != null) {
                        ld9Var4.h();
                    }
                    p4();
                }
                E2.U1 = g4;
                E2.V1 = A5;
                E2.C();
            }
        } else if (s3()) {
            int i4 = me9Var.p0;
            mc9 o2 = o2(i4);
            if (o2 != null && (g3 = de9.g(me9Var.r0, me9Var.u0, (length3 = o2.length()), 0)) < (A3 = ls6.A(me9Var.r0, me9Var.u0, length3, 0))) {
                ld9 ld9Var5 = this.R3;
                if (ld9Var5 != null) {
                    ld9Var5.d();
                }
                if (yi9.h(o2.getText(), g3, A3)) {
                    yi9.n(o2.getText(), g3, A3);
                    o2.f();
                    d4(i4);
                    ld9 ld9Var6 = this.R3;
                    if (ld9Var6 != null) {
                        ld9Var6.h();
                    }
                    p4();
                }
                o2.U1 = g3;
                o2.V1 = A3;
                o2.C();
            }
        } else if (C3()) {
            int i5 = me9Var.p0;
            mc9 k4 = k4(i5);
            if (k4 != null && (g2 = de9.g(me9Var.r0, me9Var.u0, (length2 = k4.length()), 0)) < (A2 = ls6.A(me9Var.r0, me9Var.u0, length2, 0))) {
                ld9 ld9Var7 = this.R3;
                if (ld9Var7 != null) {
                    ld9Var7.d();
                }
                if (yi9.h(k4.getText(), g2, A2)) {
                    yi9.n(k4.getText(), g2, A2);
                    k4.f();
                    f4(i5);
                    ld9 ld9Var8 = this.R3;
                    if (ld9Var8 != null) {
                        ld9Var8.h();
                    }
                    p4();
                }
                k4.U1 = g2;
                k4.V1 = A2;
                k4.C();
            }
        } else {
            wi9 I4 = I4();
            if (I4 == null || (g = de9.g(me9Var.r0, me9Var.u0, (length = I4.getEditText().length()), 0)) >= (A = ls6.A(me9Var.r0, me9Var.u0, length, 0))) {
                return;
            }
            ld9 ld9Var9 = this.R3;
            if (ld9Var9 != null) {
                ld9Var9.d();
            }
            if (yi9.h(I4.getEditText().getText(), g, A)) {
                yi9.n(I4.getEditText().getText(), g, A);
                I4.getEditText().f();
                I4.w();
                ld9 ld9Var10 = this.R3;
                if (ld9Var10 != null) {
                    ld9Var10.h();
                }
                p4();
            }
            mc9 editText = I4.getEditText();
            editText.U1 = g;
            editText.V1 = A;
            I4.getEditText().C();
        }
    }

    public final void X4(lk0 lk0Var, TL_iv.PageBlock pageBlock, int i, int i2, boolean z, boolean z2) {
        Editable z3;
        if (lk0Var == null) {
            lk0Var = a5();
        }
        lk0 lk0Var2 = lk0Var;
        if (lk0Var2 != null && pageBlock != null) {
            ArrayList arrayList = this.t3;
            if (arrayList.indexOf(lk0Var2) >= 0 && !t3(lk0Var2) && !lk0Var2.i) {
                TL_iv.PageBlock pageBlock2 = lk0Var2.b;
                if (pageBlock != pageBlock2 && w3(pageBlock2) && w3(pageBlock)) {
                    wi9 q2 = q2(arrayList.indexOf(lk0Var2));
                    if (q2 != null) {
                        z3 = q2.getEditText().getText();
                    } else {
                        z3 = wi9.z(lk0Var2.b);
                    }
                    wi9.b(pageBlock, z3);
                    TL_iv.RichText h = wi9.h(lk0Var2.b);
                    if (h != null && wi9.h(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = h;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = h;
                        }
                    }
                }
                U4(lk0Var2, pageBlock, i, i2, z, z2);
            }
        }
    }

    public final void Y1(TLRPC.Document document, String str) {
        if (document != null) {
            ld9 ld9Var = this.R3;
            if (ld9Var != null) {
                ld9Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z = false;
            lk0 lk0Var = new lk0(pageblockdocument, 0, 0);
            iy6 iy6Var = new iy6();
            lk0Var.g = iy6Var;
            iy6Var.d = true;
            long j = document.id;
            if (j == 0 || document.dc_id == 0 || document.access_hash == 0) {
                z = true;
            }
            if (z) {
                if (!TextUtils.isEmpty(str) && oo1.t(str)) {
                    iy6 iy6Var2 = lk0Var.g;
                    iy6Var2.h = document;
                    iy6Var2.e = str;
                    iy6Var2.a = (byte) 1;
                    iy6Var2.f = 0.0f;
                } else {
                    return;
                }
            } else {
                iy6Var.h = document;
                iy6Var.a = (byte) 2;
                pageblockdocument.document_id = j;
            }
            q3(lk0Var);
            if (z) {
                iy6 iy6Var3 = lk0Var.g;
                IdentityHashMap identityHashMap = this.h4;
                bg9 bg9Var = (bg9) identityHashMap.remove(iy6Var3);
                if (bg9Var != null) {
                    bg9Var.b();
                }
                bg9 bg9Var2 = new bg9(this.n3, str, document, new je9(this, iy6Var3, lk0Var, str));
                identityHashMap.put(iy6Var3, bg9Var2);
                bg9Var2.d();
            }
            ld9 ld9Var2 = this.R3;
            if (ld9Var2 != null) {
                ld9Var2.h();
            }
            this.p3.onContentChanged();
        }
    }

    public final void Y2(lk0 lk0Var, boolean z) {
        View C1 = C1(lk0Var);
        if (C1 instanceof ii9) {
            ii9 ii9Var = (ii9) C1;
            mc9 mc9Var = ii9Var.r;
            ffb ffbVar = ii9Var.G;
            if (ffbVar != null) {
                if (!z) {
                    mc9Var.O();
                    mc9Var.setSelection(0);
                    return;
                } else if (!ffbVar.g.isEmpty()) {
                    li9 m = ii9Var.w.m((TL_iv.pageTableCell) b00.f(1, ii9Var.G.g));
                    if (m != null) {
                        mc9 mc9Var2 = m.a;
                        mc9Var2.O();
                        mc9Var2.setSelection(mc9Var2.length());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (z && (C1 instanceof wi9)) {
            wi9 wi9Var = (wi9) C1;
            if (wi9Var.l()) {
                wi9Var.f();
                return;
            }
        }
        mc9 O3 = O3(C1);
        if (O3 == null) {
            Z2(lk0Var);
            return;
        }
        O3.O();
        if (z) {
            O3.setSelection(O3.length());
        }
    }

    public final void Y3(int i) {
        int i2;
        ld9 ld9Var;
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
        ld9 ld9Var2;
        int i10;
        int i11;
        int i12;
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            boolean H3 = H3();
            we9 we9Var = this.p3;
            int i13 = 0;
            if (H3) {
                int i14 = me9Var.p0;
                int i15 = me9Var.q0;
                int i16 = me9Var.t0;
                int i17 = me9Var.r0;
                int i18 = me9Var.u0;
                boolean G3 = G3(i, i14, i15, i17, i16, i18);
                if (!G3) {
                    i9 = s2(i);
                } else {
                    i9 = 0;
                }
                ld9 ld9Var3 = this.R3;
                if (ld9Var3 != null) {
                    ld9Var3.d();
                }
                this.Q3 = true;
                int i19 = i15;
                boolean z5 = false;
                while (i19 <= i16) {
                    mc9 Q4 = Q4(i14, i19);
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
                if (z5 && (ld9Var2 = this.R3) != null) {
                    ld9Var2.h();
                }
                we9Var.e();
                if (z5) {
                    p4();
                }
            } else if (u3()) {
                int i21 = me9Var.p0;
                mc9 E2 = E2(i21);
                if (E2 != null && (g3 = de9.g(me9Var.r0, me9Var.u0, (length3 = E2.length()), 0)) < (A3 = ls6.A(me9Var.r0, me9Var.u0, length3, 0))) {
                    if ((E2.c(g3, A3) & i) == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ld9 ld9Var4 = this.R3;
                    if (ld9Var4 != null) {
                        ld9Var4.d();
                    }
                    this.Q3 = true;
                    if (z4) {
                        int s2 = s2(i);
                        if (s2 != 0) {
                            E2.b(s2, g3, A3);
                        }
                        E2.a(i, g3, A3);
                    } else {
                        E2.b(i, g3, A3);
                    }
                    this.Q3 = false;
                    e4(i21);
                    E2.f();
                    E2.requestLayout();
                    ld9 ld9Var5 = this.R3;
                    if (ld9Var5 != null) {
                        ld9Var5.h();
                    }
                    we9Var.e();
                    p4();
                }
            } else if (s3()) {
                int i22 = me9Var.p0;
                mc9 o2 = o2(i22);
                if (o2 != null && (g2 = de9.g(me9Var.r0, me9Var.u0, (length2 = o2.length()), 0)) < (A2 = ls6.A(me9Var.r0, me9Var.u0, length2, 0))) {
                    if ((o2.c(g2, A2) & i) == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i8 = s2(i);
                    } else {
                        i8 = 0;
                    }
                    ld9 ld9Var6 = this.R3;
                    if (ld9Var6 != null) {
                        ld9Var6.d();
                    }
                    this.Q3 = true;
                    if (z3) {
                        if (i8 != 0) {
                            o2.b(i8, g2, A2);
                        }
                        o2.a(i, g2, A2);
                    } else {
                        o2.b(i, g2, A2);
                    }
                    o2.f();
                    o2.requestLayout();
                    d4(i22);
                    this.Q3 = false;
                    ld9 ld9Var7 = this.R3;
                    if (ld9Var7 != null) {
                        ld9Var7.h();
                    }
                    we9Var.e();
                    p4();
                }
            } else {
                boolean C3 = C3();
                int i23 = me9Var.p0;
                if (C3) {
                    mc9 k4 = k4(i23);
                    if (k4 != null && (g = de9.g(me9Var.r0, me9Var.u0, (length = k4.length()), 0)) < (A = ls6.A(me9Var.r0, me9Var.u0, length, 0))) {
                        if ((k4.c(g, A) & i) == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i7 = s2(i);
                        } else {
                            i7 = 0;
                        }
                        ld9 ld9Var8 = this.R3;
                        if (ld9Var8 != null) {
                            ld9Var8.d();
                        }
                        this.Q3 = true;
                        if (z2) {
                            if (i7 != 0) {
                                k4.b(i7, g, A);
                            }
                            k4.a(i, g, A);
                        } else {
                            k4.b(i, g, A);
                        }
                        k4.f();
                        k4.requestLayout();
                        f4(i23);
                        this.Q3 = false;
                        ld9 ld9Var9 = this.R3;
                        if (ld9Var9 != null) {
                            ld9Var9.h();
                        }
                        we9Var.e();
                        p4();
                        return;
                    }
                    return;
                }
                int i24 = me9Var.s0;
                int i25 = me9Var.r0;
                int i26 = me9Var.u0;
                if (i23 >= 0 && i24 >= 0 && i24 >= i23 && i24 < this.x4.size()) {
                    int i27 = i;
                    boolean F3 = F3(i27, i23, i25, i24, i26);
                    boolean z6 = !F3;
                    if (!F3) {
                        i2 = s2(i27);
                    } else {
                        i2 = 0;
                    }
                    ld9 ld9Var10 = this.R3;
                    if (ld9Var10 != null) {
                        ld9Var10.d();
                    }
                    this.Q3 = true;
                    boolean z7 = false;
                    int i28 = i23;
                    while (i28 <= i24) {
                        lk0 A42 = A4(i28);
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
                                    wi9 q2 = q2(i28);
                                    if (q2 != null) {
                                        fk4 styleDelegate = q2.getStyleDelegate();
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
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wi9.z(A42.b));
                                        if (!F3 && i2 != 0) {
                                            i3 = i2;
                                            i6 = max3;
                                            yi9.o(spannableStringBuilder2, i6, max4, i3, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i3 = i2;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i6 = max3;
                                        }
                                        yi9.o(spannableStringBuilder, i6, max4, i27, z6, null);
                                        wi9.b(A42.b, spannableStringBuilder);
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
                    if (z8 && (ld9Var = this.R3) != null) {
                        ld9Var.h();
                    }
                    we9Var.e();
                    if (z8) {
                        p4();
                    }
                }
            }
        }
    }

    public final void Y4(lk0 lk0Var, TL_iv.PageBlock pageBlock) {
        if (lk0Var == null) {
            lk0Var = a5();
        }
        lk0 lk0Var2 = lk0Var;
        if (lk0Var2 == null) {
            return;
        }
        X4(lk0Var2, pageBlock, lk0Var2.c, lk0Var2.d, lk0Var2.e, lk0Var2.f);
    }

    public final void Z1(Uri uri) {
        boolean contains;
        if (uri != null) {
            lk0 lk0Var = this.j4;
            String str = null;
            this.j4 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e) {
                fa4.g(e, true);
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
            Utilities.e.c(new m05(this, uri, z, str2, i, lk0Var));
        }
    }

    public final void Z2(lk0 lk0Var) {
        View C1 = C1(lk0Var);
        if (C1 instanceof wi9) {
            ((wi9) C1).A();
        } else if (C1 instanceof ac9) {
            ((ac9) C1).d.O();
        }
    }

    public final void Z3(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.Z3(android.view.View):void");
    }

    public final void Z4(lk0 lk0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        if (lk0Var == null) {
            lk0Var = a5();
        }
        lk0 lk0Var2 = lk0Var;
        if (lk0Var2 == null) {
            return;
        }
        if (i == 0) {
            X4(lk0Var2, lk0Var2.b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, lk0Var2.c);
        if (i == 2) {
            i2 = Math.max(1, lk0Var2.d);
        } else {
            i2 = 0;
        }
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        TL_iv.PageBlock pageBlock = lk0Var2.b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        if (z && lk0Var2.f) {
            z2 = true;
        } else {
            z2 = false;
        }
        X4(lk0Var2, pageBlock, max, i2, z, z2);
    }

    public final void a2(jm6 jm6Var) {
        TL_iv.PageBlock pageblockvideo;
        ye9 ye9Var;
        String str = jm6Var.h;
        if (str == null) {
            str = jm6Var.I;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.d();
        }
        boolean c = xf9.c(jm6Var);
        if (!jm6Var.b && !c) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        lk0 lk0Var = new lk0(pageblockvideo, 0, 0);
        lk0Var.g = Q3(jm6Var, str2);
        q3(lk0Var);
        iy6 iy6Var = lk0Var.g;
        if (c) {
            N4(lk0Var, iy6Var, jm6Var);
            ye9Var = this;
        } else {
            ye9Var = this;
            ye9Var.O4(lk0Var, iy6Var, str2, jm6Var.b, jm6Var.F, jm6Var.G, jm6Var.E);
        }
        ld9 ld9Var2 = ye9Var.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        ye9Var.p3.onContentChanged();
    }

    public final void a3(lk0 lk0Var) {
        View C1 = C1(lk0Var);
        if (C1 instanceof wi9) {
            wi9 wi9Var = (wi9) C1;
            wi9Var.A();
            mc9 editText = wi9Var.getEditText();
            editText.setSelection(editText.length());
        } else if (C1 instanceof ac9) {
            ac9 ac9Var = (ac9) C1;
            ac9Var.d.O();
            mc9 editText2 = ac9Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void a4() {
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
        mc9 Q4;
        int length5;
        int g5;
        int A6;
        boolean H3 = H3();
        we9 we9Var = this.p3;
        me9 me9Var = this.v3;
        if (H3) {
            int i = me9Var.p0;
            int i2 = me9Var.q0;
            if (i2 == me9Var.t0 && (Q4 = Q4(i, i2)) != null && (g5 = de9.g(me9Var.r0, me9Var.u0, (length5 = Q4.length()), 0)) < (A6 = ls6.A(me9Var.r0, me9Var.u0, length5, 0))) {
                boolean h = yi9.h(Q4.getText(), g5, A6);
                ld9 ld9Var = this.R3;
                if (h) {
                    if (ld9Var != null) {
                        ld9Var.d();
                    }
                    yi9.n(Q4.getText(), g5, A6);
                    Q4.f();
                    g4(i, i2);
                    ld9 ld9Var2 = this.R3;
                    if (ld9Var2 != null) {
                        ld9Var2.h();
                    }
                    we9Var.e();
                    p4();
                    return;
                }
                if (ld9Var != null) {
                    ld9Var.d();
                }
                if (yi9.g(Q4.getText(), g5, A6)) {
                    yi9.m(Q4.getText(), g5, A6);
                    Q4.f();
                    g4(i, i2);
                    ld9 ld9Var3 = this.R3;
                    if (ld9Var3 != null) {
                        ld9Var3.h();
                    }
                    p4();
                }
                Q4.U1 = g5;
                Q4.V1 = A6;
                k3(false);
                G4(Q4);
            }
        } else if (u3()) {
            int i3 = me9Var.p0;
            mc9 E2 = E2(i3);
            if (E2 != null && (g4 = de9.g(me9Var.r0, me9Var.u0, (length4 = E2.length()), 0)) < (A5 = ls6.A(me9Var.r0, me9Var.u0, length4, 0))) {
                boolean h2 = yi9.h(E2.getText(), g4, A5);
                ld9 ld9Var4 = this.R3;
                if (h2) {
                    if (ld9Var4 != null) {
                        ld9Var4.d();
                    }
                    yi9.n(E2.getText(), g4, A5);
                    E2.f();
                    e4(i3);
                    ld9 ld9Var5 = this.R3;
                    if (ld9Var5 != null) {
                        ld9Var5.h();
                    }
                    we9Var.e();
                    p4();
                    return;
                }
                if (ld9Var4 != null) {
                    ld9Var4.d();
                }
                if (yi9.g(E2.getText(), g4, A5)) {
                    yi9.m(E2.getText(), g4, A5);
                    E2.f();
                    e4(i3);
                    ld9 ld9Var6 = this.R3;
                    if (ld9Var6 != null) {
                        ld9Var6.h();
                    }
                    p4();
                }
                E2.U1 = g4;
                E2.V1 = A5;
                k3(false);
                G4(E2);
            }
        } else if (s3()) {
            int i4 = me9Var.p0;
            mc9 o2 = o2(i4);
            if (o2 != null && (g3 = de9.g(me9Var.r0, me9Var.u0, (length3 = o2.length()), 0)) < (A3 = ls6.A(me9Var.r0, me9Var.u0, length3, 0))) {
                boolean h3 = yi9.h(o2.getText(), g3, A3);
                ld9 ld9Var7 = this.R3;
                if (h3) {
                    if (ld9Var7 != null) {
                        ld9Var7.d();
                    }
                    yi9.n(o2.getText(), g3, A3);
                    o2.f();
                    d4(i4);
                    ld9 ld9Var8 = this.R3;
                    if (ld9Var8 != null) {
                        ld9Var8.h();
                    }
                    we9Var.e();
                    p4();
                    return;
                }
                if (ld9Var7 != null) {
                    ld9Var7.d();
                }
                if (yi9.g(o2.getText(), g3, A3)) {
                    yi9.m(o2.getText(), g3, A3);
                    o2.f();
                    d4(i4);
                    ld9 ld9Var9 = this.R3;
                    if (ld9Var9 != null) {
                        ld9Var9.h();
                    }
                    p4();
                }
                o2.U1 = g3;
                o2.V1 = A3;
                k3(false);
                G4(o2);
            }
        } else if (C3()) {
            int i5 = me9Var.p0;
            mc9 k4 = k4(i5);
            if (k4 != null && (g2 = de9.g(me9Var.r0, me9Var.u0, (length2 = k4.length()), 0)) < (A2 = ls6.A(me9Var.r0, me9Var.u0, length2, 0))) {
                boolean h4 = yi9.h(k4.getText(), g2, A2);
                ld9 ld9Var10 = this.R3;
                if (h4) {
                    if (ld9Var10 != null) {
                        ld9Var10.d();
                    }
                    yi9.n(k4.getText(), g2, A2);
                    k4.f();
                    f4(i5);
                    ld9 ld9Var11 = this.R3;
                    if (ld9Var11 != null) {
                        ld9Var11.h();
                    }
                    we9Var.e();
                    p4();
                    return;
                }
                if (ld9Var10 != null) {
                    ld9Var10.d();
                }
                if (yi9.g(k4.getText(), g2, A2)) {
                    yi9.m(k4.getText(), g2, A2);
                    k4.f();
                    f4(i5);
                    ld9 ld9Var12 = this.R3;
                    if (ld9Var12 != null) {
                        ld9Var12.h();
                    }
                    p4();
                }
                k4.U1 = g2;
                k4.V1 = A2;
                k3(false);
                G4(k4);
            }
        } else {
            wi9 I4 = I4();
            if (I4 == null || (g = de9.g(me9Var.r0, me9Var.u0, (length = I4.getEditText().length()), 0)) >= (A = ls6.A(me9Var.r0, me9Var.u0, length, 0))) {
                return;
            }
            boolean h5 = yi9.h(I4.getEditText().getText(), g, A);
            ld9 ld9Var13 = this.R3;
            if (h5) {
                if (ld9Var13 != null) {
                    ld9Var13.d();
                }
                yi9.n(I4.getEditText().getText(), g, A);
                I4.getEditText().f();
                I4.w();
                ld9 ld9Var14 = this.R3;
                if (ld9Var14 != null) {
                    ld9Var14.h();
                }
                we9Var.e();
                p4();
                return;
            }
            if (ld9Var13 != null) {
                ld9Var13.d();
            }
            if (yi9.g(I4.getEditText().getText(), g, A)) {
                yi9.m(I4.getEditText().getText(), g, A);
                I4.getEditText().f();
                I4.w();
                ld9 ld9Var15 = this.R3;
                if (ld9Var15 != null) {
                    ld9Var15.h();
                }
                p4();
            }
            mc9 editText = I4.getEditText();
            editText.U1 = g;
            editText.V1 = A;
            k3(false);
            G4(I4.getEditText());
        }
    }

    public final lk0 a5() {
        me9 me9Var;
        int i;
        lk0 M2 = M2();
        if (M2 == null && (me9Var = this.v3) != null && me9Var.w() && (i = me9Var.p0) == me9Var.s0) {
            return A4(i);
        }
        return M2;
    }

    public final void b2(ii9 ii9Var) {
        ii9 ii9Var2 = this.q4;
        if (ii9Var2 != null && ii9Var2 != ii9Var) {
            LinkedHashSet linkedHashSet = ii9Var2.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                ii9Var2.w.invalidate();
                ii9Var2.v();
            }
        }
        this.q4 = ii9Var;
        this.K3 = false;
        this.t4 = -1;
        this.s4 = -1;
        ii9Var.setCellSelectionListener(this.u4);
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            me9Var.e(false);
        }
        setEditTextsLocked(true);
    }

    public final void b3(lk0 lk0Var) {
        View C1 = C1(lk0Var);
        if (C1 instanceof wi9) {
            wi9 wi9Var = (wi9) C1;
            wi9Var.A();
            wi9Var.getEditText().setSelection(0);
        } else if (C1 instanceof ac9) {
            ac9 ac9Var = (ac9) C1;
            ac9Var.d.O();
            ac9Var.getEditText().setSelection(0);
        }
    }

    public final void b4() {
        mc9 editText;
        Runnable od9Var;
        int length;
        final int g;
        final int A;
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w()) {
            if (H3()) {
                int i = me9Var.p0;
                int i2 = me9Var.q0;
                if (i2 == me9Var.t0) {
                    editText = Q4(i, i2);
                    od9Var = new td9(this, i, i2, (byte) 1);
                } else {
                    return;
                }
            } else if (u3()) {
                int i3 = me9Var.p0;
                editText = E2(i3);
                od9Var = new nd9(this, i3, (byte) 3);
            } else if (s3()) {
                int i4 = me9Var.p0;
                editText = o2(i4);
                od9Var = new nd9(this, i4, (byte) 0);
            } else if (C3()) {
                int i5 = me9Var.p0;
                editText = k4(i5);
                od9Var = new nd9(this, i5, (byte) 1);
            } else {
                wi9 I4 = I4();
                if (I4 != null) {
                    editText = I4.getEditText();
                    od9Var = new od9(I4, (byte) 0);
                } else {
                    return;
                }
            }
            final mc9 mc9Var = editText;
            final Runnable runnable = od9Var;
            if (mc9Var != null && (g = de9.g(me9Var.r0, me9Var.u0, (length = mc9Var.length()), 0)) <= (A = ls6.A(me9Var.r0, me9Var.u0, length, 0))) {
                Editable text = mc9Var.getText();
                int i6 = ij6.h;
                String str = null;
                if (text != null) {
                    ij6[] ij6VarArr = (ij6[]) text.getSpans(g, A, ij6.class);
                    if (ij6VarArr.length > 0) {
                        str = ij6VarArr[0].a;
                    }
                }
                if (str == null) {
                    str = mc9Var.getText().subSequence(g, A).toString();
                }
                final float L = gl.L(gba.T0 + 4);
                int i7 = bkb.F6;
                wjb wjbVar = this.o3;
                final int v0 = bkb.v0(i7, wjbVar);
                e72.X(getContext(), str, new p8c() {
                    @Override
                    public final void a(Object obj) {
                        ij6 a;
                        String str2 = (String) obj;
                        ye9 ye9Var = ye9.this;
                        ye9Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a = ij6.a(str2, v0, L)) == null) {
                            return;
                        }
                        ld9 ld9Var = ye9Var.R3;
                        if (ld9Var != null) {
                            ld9Var.d();
                        }
                        me9 me9Var2 = ye9Var.v3;
                        if (me9Var2 != null) {
                            me9Var2.e(false);
                        }
                        mc9 mc9Var2 = mc9Var;
                        mc9Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a, 0, 1, 33);
                        Editable text2 = mc9Var2.getText();
                        int max = Math.max(0, Math.min(g, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(A, text2.length())), spannableString);
                        runnable.run();
                        ld9 ld9Var2 = ye9Var.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.h();
                        }
                        ye9Var.p3.onContentChanged();
                        int min = Math.min(max + 1, mc9Var2.length());
                        mc9Var2.O();
                        ye9Var.post(new yd9(mc9Var2, min, (byte) 3));
                    }
                }, wjbVar);
            }
        }
    }

    public final void b5(float f, float f2) {
        TL_iv.pageTableCell o;
        ii9 ii9Var = this.q4;
        if (this.J3 && ii9Var != null && this.F3 == ii9Var && (o = ii9Var.o((int) ((f - ii9Var.getLeft()) - getLeft()), (int) ((f2 - ii9Var.getTop()) - getTop()))) != null && o != this.M3) {
            this.M3 = o;
            ii9Var.y(this.L3, o);
        }
    }

    public final pe9 c2() {
        int i;
        int i2;
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w() && !C3()) {
            lk0 A42 = A4(me9Var.p0);
            ArrayList arrayList = this.t3;
            int indexOf = arrayList.indexOf(A42);
            int indexOf2 = arrayList.indexOf(A4(me9Var.s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                if (indexOf > indexOf2) {
                    i2 = indexOf;
                    i = indexOf2;
                } else {
                    i = indexOf;
                    i2 = indexOf2;
                }
                for (int i3 = i; i3 <= i2; i3++) {
                    lk0 lk0Var = (lk0) arrayList.get(i3);
                    if (lk0Var.i || t3(lk0Var)) {
                        return null;
                    }
                }
                return new pe9(this, i, i2, me9Var.r0, me9Var.u0);
            }
            return null;
        }
        return null;
    }

    public final void c4() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.c4():void");
    }

    public final void c5() {
        wi9 wi9Var;
        lk0 lk0Var;
        ti9 ti9Var;
        b49 itemAnimator = getItemAnimator();
        setItemAnimator(null);
        this.g3.O(true);
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof wi9) && (lk0Var = (wi9Var = (wi9) childAt).y) != null && (ti9Var = wi9Var.E) != null) {
                wi9Var.d(lk0Var, ti9Var, wi9Var.F);
            }
        }
        post(new be9(this, itemAnimator, (byte) 2));
    }

    public final int d2(int i) {
        mc9 E2 = E2(i);
        if (E2 != null) {
            return E2.length();
        }
        wi9 q2 = q2(i);
        if (q2 != null) {
            return q2.getEditText().length();
        }
        lk0 A42 = A4(i);
        if (A42 == null) {
            return 0;
        }
        return wi9.y(A42.b).length();
    }

    public final boolean d3(android.view.KeyEvent r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.d3(android.view.KeyEvent):boolean");
    }

    public final void d4(int i) {
        View C4 = C4(i);
        if (C4 instanceof tb9) {
            ((tb9) C4).b();
        }
    }

    public final void d5(lk0 lk0Var, String str) {
        lk0 lk0Var2;
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    ld9 ld9Var = this.R3;
                    if (ld9Var != null) {
                        ld9Var.d();
                    }
                    pageblockpreformatted.language = str;
                    wi9 q2 = q2(this.t3.indexOf(lk0Var));
                    if (q2 != null && (lk0Var2 = q2.y) != null) {
                        q2.J(lk0Var2.b, true);
                        q2.I = null;
                        q2.B();
                    }
                    ld9 ld9Var2 = this.R3;
                    if (ld9Var2 != null) {
                        ld9Var2.h();
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
        lk0 lk0Var;
        View view;
        Long l2;
        int i2;
        int i3;
        ArrayList arrayList2;
        lk0 lk0Var2;
        lk0 lk0Var3;
        float f;
        lk0 lk0Var4;
        boolean z;
        lk0 lk0Var5;
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
                    lk0Var5 = (lk0) arrayList.get(R);
                } else {
                    lk0Var5 = null;
                }
                if (lk0Var5 != null) {
                    ArrayList arrayList3 = lk0Var5.k;
                    if (arrayList3.size() > i5) {
                        i5 = arrayList3.size();
                    }
                }
                i4++;
            }
            if (i5 != 0) {
                if (this.y4 == null) {
                    n79 n79Var = new n79(this);
                    this.y4 = n79Var;
                    n79Var.a(null, null, null, this.o3, 1);
                    rse.a(this.y4, this.o3);
                }
                int i6 = 0;
                while (i6 < i5) {
                    float f2 = 0.0f;
                    long j = 0;
                    int i7 = 0;
                    boolean z2 = false;
                    lk0 lk0Var6 = null;
                    lk0 lk0Var7 = null;
                    float f3 = 1.0f;
                    float f4 = 0.0f;
                    while (i7 <= childCount) {
                        if (i7 < childCount) {
                            View childAt = getChildAt(i7);
                            int R2 = RecyclerView.R(childAt);
                            if (R2 >= 0 && R2 < arrayList.size()) {
                                lk0Var = (lk0) arrayList.get(R2);
                            } else {
                                lk0Var = null;
                            }
                            if (lk0Var != null) {
                                ArrayList arrayList4 = lk0Var.k;
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
                            lk0Var = null;
                            view = null;
                        }
                        if (z2 && (l == null || l.longValue() != j)) {
                            int l4 = l4(i6, lk0Var6, true);
                            l2 = l;
                            int l42 = l4(i6, lk0Var7, false);
                            if (f4 - f2 <= gl.L(4.0f)) {
                                i2 = i6;
                                i3 = i5;
                                arrayList2 = arrayList;
                            } else {
                                int L = gl.L(16.0f) * i6;
                                i2 = i6;
                                int L2 = gl.L(16.0f) + L;
                                i3 = i5;
                                arrayList2 = arrayList;
                                int x = ls6.x(16.0f, getWidth(), L);
                                if (x - L2 > gl.L(8.0f)) {
                                    float floor = (float) Math.floor(gba.V0 / 3.0f);
                                    RectF rectF = gl.P;
                                    rectF.set(L2, l4 + f2, x, f4 - l42);
                                    lk0Var2 = lk0Var6;
                                    lk0Var3 = lk0Var7;
                                    this.y4.c(floor, floor, floor, f3, canvas, rectF);
                                    f = f3;
                                    this.y4.f(canvas, rectF, f);
                                    z2 = false;
                                }
                            }
                            lk0Var2 = lk0Var6;
                            lk0Var3 = lk0Var7;
                            f = f3;
                            z2 = false;
                        } else {
                            l2 = l;
                            i2 = i6;
                            i3 = i5;
                            arrayList2 = arrayList;
                            lk0Var2 = lk0Var6;
                            lk0Var3 = lk0Var7;
                            f = f3;
                        }
                        if (view != null && l2 != null) {
                            if (!z2) {
                                j = l2.longValue();
                                f2 = Float.MAX_VALUE;
                                f4 = -3.4028235E38f;
                                lk0Var4 = lk0Var;
                                z = true;
                                f = 1.0f;
                            } else {
                                lk0Var4 = lk0Var2;
                                z = z2;
                            }
                            if (lk0Var != null && lk0Var == this.a4) {
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
                            lk0Var7 = lk0Var;
                        } else {
                            lk0Var7 = lk0Var3;
                            f3 = f;
                            lk0Var4 = lk0Var2;
                        }
                        i7++;
                        lk0Var6 = lk0Var4;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.e3(android.view.MotionEvent):boolean");
    }

    public final void e4(int i) {
        lk0 A42 = A4(i);
        mc9 E2 = E2(i);
        if (t3(A42) && E2 != null) {
            ((TL_iv.pageBlockDetails) A42.b).title = yi9.f(E2.getText());
        }
    }

    public final TL_iv.PageBlock f2(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        TL_iv.pageBlockList pageblocklist;
        TL_iv.pageBlockOrderedList pageblockorderedlist;
        int i5;
        TL_iv.RichText richText;
        int i6;
        lk0 lk0Var;
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
            ye9 ye9Var = this;
            ArrayList arrayList2 = ye9Var.t3;
            lk0 lk0Var2 = (lk0) arrayList2.get(i9);
            if (lk0Var2.k.size() > i8 || (i5 = lk0Var2.c) < i2) {
                break;
            }
            if (i5 == i2) {
                if (lk0Var2.d > 0) {
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
            boolean A3 = A3(lk0Var2.b);
            if (!A3) {
                TL_iv.PageBlock pageBlock = lk0Var2.b;
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
                F2(lk0Var2, arrayList3);
            }
            while (i11 < i7) {
                lk0 lk0Var3 = (lk0) arrayList2.get(i11);
                if (lk0Var3.k.size() > i8) {
                    break;
                }
                lk0Var = lk0Var2;
                int i12 = lk0Var3.c;
                if (i12 >= i2) {
                    if (i12 == i2) {
                        if (A3(lk0Var3.b)) {
                            F2(lk0Var3, arrayList3);
                            i11++;
                            lk0Var2 = lk0Var;
                        }
                    } else {
                        if (lk0Var3.d > 0) {
                            richText2 = richText;
                            z2 = true;
                        } else {
                            richText2 = richText;
                            z2 = false;
                        }
                        ArrayList arrayList4 = arrayList3;
                        int[] iArr2 = {i11};
                        ye9 ye9Var2 = ye9Var;
                        i6 = i11;
                        arrayList = arrayList4;
                        TL_iv.PageBlock f2 = ye9Var2.f2(i6, i12, i7, i8, z2, iArr2);
                        if (f2 != null) {
                            arrayList.add(f2);
                        }
                        i11 = iArr2[0];
                        if (i11 <= i6) {
                            break;
                        }
                        ye9Var = this;
                        i7 = i3;
                        i8 = i4;
                        richText = richText2;
                        lk0Var2 = lk0Var;
                        arrayList3 = arrayList;
                    }
                }
                i6 = i11;
                break;
            }
            i6 = i11;
            lk0Var = lk0Var2;
            richText2 = richText;
            arrayList = arrayList3;
            if (!A3 && arrayList.isEmpty()) {
                if (z) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                    tL_pageListOrderedItemText.num = oo1.n(i10, ".");
                    tL_pageListOrderedItemText.text = richText2;
                    tL_pageListOrderedItemText.checkbox = lk0Var.e;
                    tL_pageListOrderedItemText.checked = lk0Var.f;
                    pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                } else {
                    TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                    tL_pageListItemText.text = richText2;
                    tL_pageListItemText.checkbox = lk0Var.e;
                    tL_pageListItemText.checked = lk0Var.f;
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
                        tL_pageListOrderedItemBlocks.num = oo1.n(i10, ".");
                        tL_pageListOrderedItemBlocks.blocks = arrayList5;
                        tL_pageListOrderedItemBlocks.checkbox = lk0Var.e;
                        tL_pageListOrderedItemBlocks.checked = lk0Var.f;
                        pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks);
                    } else {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                        tL_pageListItemBlocks.blocks = arrayList5;
                        tL_pageListItemBlocks.checkbox = lk0Var.e;
                        tL_pageListItemBlocks.checked = lk0Var.f;
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

    public final boolean f3(defpackage.ii9 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.f3(ii9, int, int):boolean");
    }

    public final void f4(int i) {
        View C4 = C4(i);
        if (C4 instanceof wi9) {
            ((wi9) C4).v();
        }
    }

    public final void f5(java.lang.CharSequence r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.f5(java.lang.CharSequence):void");
    }

    public final boolean g2() {
        mc9 editText;
        int length;
        int g;
        int A;
        Editable text;
        mf9[] mf9VarArr;
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w() && me9Var.p0 == me9Var.s0) {
            if (H3()) {
                int i = me9Var.p0;
                int i2 = me9Var.q0;
                if (i2 == me9Var.t0) {
                    editText = Q4(i, i2);
                    if (editText != null && (g = de9.g(me9Var.r0, me9Var.u0, (length = editText.length()), 0)) < (A = ls6.A(me9Var.r0, me9Var.u0, length, 0))) {
                        text = editText.getText();
                        if (text == null && g < A) {
                            for (mf9 mf9Var : (mf9[]) text.getSpans(g, A, mf9.class)) {
                                if (text.getSpanStart(mf9Var) >= A || text.getSpanEnd(mf9Var) <= g) {
                                }
                            }
                            return true;
                        }
                    }
                }
            } else {
                if (u3()) {
                    editText = E2(me9Var.p0);
                } else if (s3()) {
                    editText = o2(me9Var.p0);
                } else if (C3()) {
                    editText = k4(me9Var.p0);
                } else {
                    wi9 I4 = I4();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.g3():boolean");
    }

    public final void g4(int i, int i2) {
        li9 m;
        View C4 = C4(i);
        if (C4 instanceof ii9) {
            ii9 ii9Var = (ii9) C4;
            if (i2 == 0) {
                ii9Var.w();
                return;
            }
            TL_iv.pageTableCell g = ii9Var.g(i2);
            if (g != null && (m = ii9Var.getGrid().m(g)) != null) {
                ffb.d(g, m.a.getText());
            }
        }
    }

    public mc9 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof mc9) {
            return (mc9) findFocus;
        }
        return null;
    }

    public nf9 getMapDelegate() {
        return this.l4;
    }

    public View getOverlayView() {
        return this.w3;
    }

    public fib getTextSelectionHelper() {
        return this.v3;
    }

    public final boolean h2() {
        int[] F4 = F4();
        if (F4 == null) {
            return i2(z2());
        }
        for (int i = F4[0]; i <= F4[1]; i++) {
            if (i2((lk0) this.t3.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean i2(lk0 lk0Var) {
        ArrayList arrayList;
        int indexOf;
        if (lk0Var != null && (indexOf = (arrayList = this.t3).indexOf(lk0Var)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            lk0 lk0Var2 = (lk0) arrayList.get(indexOf);
            if (lk0Var2.c == 0) {
                TL_iv.PageBlock pageBlock = lk0Var2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !y3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !j2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((lk0) arrayList.get(indexOf - 1)).c < lk0Var2.c) {
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
            for (iy6 iy6Var : N3((lk0) arrayList.get(i))) {
                if (iy6Var.a()) {
                    return true;
                }
            }
            i++;
        }
    }

    public final void i4(mc9 mc9Var) {
        if (mc9Var == null) {
            return;
        }
        mc9Var.c2 = this.r3;
        mc9Var.setInlineButtonContext(this.n3);
        mc9Var.setInlineButtonClickListener(new wd9(this));
    }

    public final boolean j2(int i) {
        if (i > 0) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size() && A3(((lk0) arrayList.get(i)).b) && ((lk0) arrayList.get(i - 1)).c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j3() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof wi9) {
                wi9 wi9Var = (wi9) childAt;
                wi9Var.f.m();
                wi9Var.h.m();
            } else if (childAt instanceof ii9) {
                ii9 ii9Var = (ii9) childAt;
                ki9 ki9Var = ii9Var.w;
                ii9Var.r.m();
                for (int i2 = 0; i2 < ki9Var.getChildCount(); i2++) {
                    View childAt2 = ki9Var.getChildAt(i2);
                    if (childAt2 instanceof li9) {
                        ((li9) childAt2).a.m();
                    }
                }
            } else if (childAt instanceof tb9) {
                ((tb9) childAt).getCaptionEditText().m();
            } else if (childAt instanceof ac9) {
                ((ac9) childAt).getEditText().m();
            }
        }
    }

    public final int j4(int i) {
        Layout layout;
        View C4 = C4(i);
        if (!(C4 instanceof wi9) || (layout = ((wi9) C4).getEditText().getLayout()) == null) {
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
            if (l2((lk0) this.t3.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final void k3(boolean z) {
        me9 me9Var = this.v3;
        if (me9Var != null) {
            if (z) {
                me9Var.e(false);
            } else {
                gl.r(me9Var.m0);
                me9Var.t();
            }
        }
        if (z) {
            R2();
        } else {
            j3();
        }
    }

    public final mc9 k4(int i) {
        View C4 = C4(i);
        if (C4 instanceof wi9) {
            return ((wi9) C4).getAuthorEditText();
        }
        return null;
    }

    public final boolean l2(lk0 lk0Var) {
        ArrayList arrayList;
        int indexOf;
        if (lk0Var == null || (indexOf = (arrayList = this.t3).indexOf(lk0Var)) < 0 || lk0Var.c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((lk0) arrayList.get(indexOf)).c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean l3(int i) {
        if (((lk0) this.t3.get(i)).c + 1 <= na7.q1(this.n3).k4.b0.f() - 6) {
            return true;
        }
        return false;
    }

    public final boolean m2() {
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            if (ld9Var.e || !ld9Var.b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean m3(int i, boolean z, boolean z2) {
        boolean z3;
        lk0 lk0Var;
        int i2;
        int i3 = 0;
        if (i >= 0) {
            ArrayList arrayList = this.t3;
            if (i < arrayList.size()) {
                lk0 lk0Var2 = (lk0) arrayList.get(i);
                if (z) {
                    if (lk0Var2.c > 0) {
                        p2(i);
                        return true;
                    }
                } else if (lk0Var2.c == 0) {
                    TL_iv.PageBlock pageBlock = lk0Var2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !y3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if ((z3 || j2(i)) && l3(i)) {
                        if (i > 0) {
                            lk0Var = (lk0) arrayList.get(i - 1);
                        } else {
                            lk0Var = null;
                        }
                        if (z3) {
                            lk0Var2.c = 1;
                            if (lk0Var != null && lk0Var.d > 0) {
                                i3 = 1;
                            }
                            lk0Var2.d = i3;
                            return true;
                        }
                        lk0Var2.c = lk0Var.c;
                        if (lk0Var.d > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        lk0Var2.d = i2;
                        lk0Var2.e = false;
                        lk0Var2.f = false;
                        return true;
                    }
                } else if ((z2 || (i != 0 && ((lk0) arrayList.get(i - 1)).c >= lk0Var2.c)) && l3(i)) {
                    lk0Var2.c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void n2(lk0 lk0Var, iy6 iy6Var) {
        we9 we9Var = this.p3;
        IdentityHashMap identityHashMap = this.i4;
        IdentityHashMap identityHashMap2 = this.h4;
        if (iy6Var == null) {
            for (iy6 iy6Var2 : N3(lk0Var)) {
                bg9 bg9Var = (bg9) identityHashMap2.remove(iy6Var2);
                if (bg9Var != null) {
                    bg9Var.b();
                }
                xf9 xf9Var = (xf9) identityHashMap.remove(iy6Var2);
                if (xf9Var != null) {
                    xf9Var.a();
                }
            }
            ArrayList arrayList = this.t3;
            int indexOf = arrayList.indexOf(lk0Var);
            if (indexOf >= 0) {
                ld9 ld9Var = this.R3;
                if (ld9Var != null) {
                    ld9Var.d();
                }
                arrayList.remove(indexOf);
                this.g3.O(true);
                ld9 ld9Var2 = this.R3;
                if (ld9Var2 != null) {
                    ld9Var2.h();
                }
            }
            we9Var.onContentChanged();
            return;
        }
        bg9 bg9Var2 = (bg9) identityHashMap2.remove(iy6Var);
        if (bg9Var2 != null) {
            bg9Var2.b();
        }
        xf9 xf9Var2 = (xf9) identityHashMap.remove(iy6Var);
        if (xf9Var2 != null) {
            xf9Var2.a();
        }
        ld9 ld9Var3 = this.R3;
        if (ld9Var3 != null) {
            ld9Var3.d();
        }
        r4(lk0Var, iy6Var);
        ld9 ld9Var4 = this.R3;
        if (ld9Var4 != null) {
            ld9Var4.h();
        }
        we9Var.onContentChanged();
    }

    public final void n3(boolean z) {
        lk0 z2;
        int[] F4 = F4();
        if (F4 != null) {
            int i = F4[0];
            int i2 = F4[1];
            if (i == i2) {
                z2 = (lk0) this.t3.get(i);
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
                ld9 ld9Var = this.R3;
                if (ld9Var != null) {
                    ld9Var.d();
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
                    lk0 lk0Var = (lk0) arrayList.get(i);
                    if (lk0Var.c >= 1 && (i == 0 || ((lk0) arrayList.get(i - 1)).c < lk0Var.c)) {
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
                    if (findFocus() instanceof mc9) {
                        T1();
                    } else {
                        this.g3.O(false);
                    }
                    ld9 ld9Var2 = this.R3;
                    if (ld9Var2 != null) {
                        ld9Var2.h();
                    }
                }
                return z2;
            }
        }
        return false;
    }

    public final mc9 o2(int i) {
        View C4 = C4(i);
        if (C4 instanceof tb9) {
            return ((tb9) C4).getCaptionEditText();
        }
        return null;
    }

    public final void o3(lk0 lk0Var, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = lk0Var.k;
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
                lk0 lk0Var2 = new lk0(new TL_iv.pageBlockParagraph(), 0, 0);
                lk0Var2.t = longValue;
                for (int i3 = 0; i3 <= i2; i3++) {
                    lk0Var2.k.add((Long) arrayList3.get(i3));
                }
                int i4 = zh9.b;
                c4c K = c4c.K(zh9.class);
                K.H = lk0Var2;
                K.I = this.n4;
                arrayList2.add(K);
                this.x4.add(lk0Var2);
            }
        }
    }

    public final void o4(lk0 lk0Var) {
        View C1 = C1(lk0Var);
        if (C1 instanceof vf9) {
            vf9 vf9Var = (vf9) C1;
            ArrayList arrayList = vf9Var.E;
            if (vf9Var.a != null) {
                vf9Var.p();
                if (vf9Var.a0 >= arrayList.size()) {
                    vf9Var.a0 = Math.max(0, arrayList.size() - 1);
                }
                vf9Var.q(false);
                vf9Var.requestLayout();
                vf9Var.invalidate();
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
                int L = (gl.L(8.0f) + F.getBottom()) - (i5 - getPaddingBottom());
                if (L > 0) {
                    post(new nd9(this, L, (byte) 2));
                }
            }
        }
        this.S3 = i5;
    }

    public final void p2(int i) {
        lk0 lk0Var;
        int i2;
        ArrayList arrayList = this.t3;
        lk0 lk0Var2 = (lk0) arrayList.get(i);
        int i3 = lk0Var2.c;
        if (i3 > 0) {
            int i4 = i3 - 1;
            lk0Var2.c = i4;
            if (i4 == 0) {
                lk0Var2.d = 0;
                lk0Var2.e = false;
                lk0Var2.f = false;
            }
            while (true) {
                i++;
                if (i < arrayList.size() && (i2 = (lk0Var = (lk0) arrayList.get(i)).c) > i3) {
                    lk0Var.c = i2 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void p3() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.p3():void");
    }

    public final void p4() {
        post(new q62(this, (byte) 3));
    }

    public final wi9 q2(int i) {
        if (i < 0) {
            return null;
        }
        View m = this.f3.m(i);
        if (!(m instanceof wi9)) {
            return null;
        }
        return (wi9) m;
    }

    public final void q3(defpackage.lk0 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye9.q3(lk0):void");
    }

    public final void q4(int i) {
        ArrayList arrayList = this.t3;
        int min = Math.min(arrayList.size() - 1, i + 1);
        for (int max = Math.max(0, i - 1); max <= min; max++) {
            lk0 lk0Var = (lk0) arrayList.get(max);
            if (lk0Var.c > 0) {
                View C1 = C1(lk0Var);
                if (C1 instanceof wi9) {
                    ((wi9) C1).F();
                }
            }
        }
    }

    public final void r2() {
        C2();
        this.s3 = null;
        this.j4 = null;
        this.k4 = null;
        this.R3 = new ld9(this.w4);
        B4();
        this.R3.j();
        we9 we9Var = this.p3;
        if (we9Var != null) {
            we9Var.P();
        }
    }

    public final void r4(lk0 lk0Var, iy6 iy6Var) {
        int i;
        if (lk0Var == null) {
            return;
        }
        if (x3(lk0Var.b)) {
            ArrayList c3 = c3(lk0Var.b);
            ArrayList arrayList = lk0Var.h;
            if (arrayList != null) {
                i = arrayList.indexOf(iy6Var);
            } else {
                i = -1;
            }
            if (i >= 0) {
                lk0Var.h.remove(i);
                if (c3 != null && i < c3.size()) {
                    c3.remove(i);
                }
            }
            if (lk0Var.h.isEmpty()) {
                s4(lk0Var);
                return;
            }
            int size = lk0Var.h.size();
            l5c l5cVar = this.g3;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = lk0Var.b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) c3.get(0);
                lk0Var.b = pageBlock;
                pageBlock.caption = pageCaption;
                lk0Var.g = (iy6) lk0Var.h.get(0);
                lk0Var.h = null;
                l5cVar.O(true);
                o4(lk0Var);
                return;
            }
            l5cVar.O(true);
            o4(lk0Var);
            return;
        }
        s4(lk0Var);
    }

    public final boolean s3() {
        int i;
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w() && (i = me9Var.p0) == me9Var.s0 && i >= 0 && i < this.x4.size()) {
            return C4(i) instanceof tb9;
        }
        return false;
    }

    public final void s4(lk0 lk0Var) {
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(lk0Var);
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

    public void setFileRefParentObject(k27 k27Var) {
        this.q3 = k27Var;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.V3 = new ArrayList();
        ArrayList arrayList = this.t3;
        S2(arrayList, dg9.b(charSequence), this.u3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.V3.add((lk0) arrayList.get(size));
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
            lk0 lk0Var = (lk0) arrayList.get(i);
            boolean z = lk0Var.i;
            ArrayList arrayList2 = lk0Var.k;
            if (!z) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    Map.EL.merge(hashMap, (Long) arrayList2.get(i2), 1, new qz0((byte) 1));
                }
            }
            i++;
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            lk0 lk0Var2 = (lk0) arrayList.get(i3);
            ArrayList arrayList3 = lk0Var2.k;
            if (arrayList3.size() == 1 && (lk0Var2.b instanceof TL_iv.pageBlockParagraph)) {
                Long l = (Long) arrayList3.get(0);
                l.getClass();
                Integer num = (Integer) hashMap.get(l);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = lk0Var2.b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.u3.remove(l);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    lk0Var2.b = pageblockblockquote;
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
                lk0 lk0Var = (lk0) arrayList.get(i);
                if (lk0Var.c > 0 && lk0Var.d > 0 && !A3(lk0Var.b)) {
                    int i2 = lk0Var.c;
                    int i3 = 1;
                    for (int i4 = i - 1; i4 >= 0; i4--) {
                        lk0 lk0Var2 = (lk0) arrayList.get(i4);
                        int i5 = lk0Var2.c;
                        if (i5 < i2) {
                            break;
                        }
                        if (i5 == i2 && !A3(lk0Var2.b)) {
                            if (lk0Var2.d <= 0) {
                                break;
                            }
                            i3++;
                        }
                    }
                    lk0Var.d = i3;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final ArrayList u2() {
        TLRPC.Document document;
        iy6 iy6Var;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i < arrayList2.size()) {
                lk0 lk0Var = (lk0) arrayList2.get(i);
                if ((lk0Var.b instanceof TL_iv.pageBlockDocument) && (iy6Var = lk0Var.g) != null && iy6Var.b() && (document2 = lk0Var.g.h) != null) {
                    ((TL_iv.pageBlockDocument) lk0Var.b).document_id = document2.id;
                }
                for (iy6 iy6Var2 : N3(lk0Var)) {
                    if (iy6Var2.b() && (document = iy6Var2.h) != null) {
                        long j = document.id;
                        if (j != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j))) {
                            arrayList.add(iy6Var2.h);
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
        me9 me9Var = this.v3;
        if (me9Var != null && me9Var.w() && (i = me9Var.p0) == me9Var.s0 && t3(A4(i))) {
            return true;
        }
        return false;
    }

    public final void u4(String str) {
        me9 me9Var = this.v3;
        S1(me9Var.p0, me9Var.r0, me9Var.s0, me9Var.u0, str.split("\n", -1));
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
            for (iy6 iy6Var : N3((lk0) arrayList2.get(i))) {
                if (iy6Var.b() && (document = iy6Var.h) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(iy6Var.h);
                }
            }
            i++;
        }
        return arrayList;
    }

    public final iy6 v4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document O2 = O2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (O2 != null) {
                iy6 iy6Var = new iy6();
                iy6Var.c = true;
                iy6Var.a = (byte) 2;
                iy6Var.h = O2;
                iy6Var.i = O2;
                return iy6Var;
            }
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document O22 = O2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (O22 != null) {
                iy6 iy6Var2 = new iy6();
                iy6Var2.d = true;
                iy6Var2.a = (byte) 2;
                iy6Var2.h = O22;
                return iy6Var2;
            }
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document O23 = O2(pageblockvideo.video_id);
                if (O23 != null) {
                    iy6 iy6Var3 = new iy6();
                    iy6Var3.b = true;
                    iy6Var3.a = (byte) 2;
                    iy6Var3.h = O23;
                    iy6Var3.n = pageblockvideo.spoiler;
                    for (int i = 0; i < O23.attributes.size(); i++) {
                        if (O23.attributes.get(i) instanceof TLRPC.TL_documentAttributeVideo) {
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) O23.attributes.get(i);
                            iy6Var3.j = tL_documentAttributeVideo.w;
                            iy6Var3.k = tL_documentAttributeVideo.h;
                            return iy6Var3;
                        }
                    }
                    return iy6Var3;
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
                            for (iy6 iy6Var4 : N3((lk0) this.t3.get(i3))) {
                                if (iy6Var4 != null && (photo = iy6Var4.g) != null && photo.id == j) {
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
                            HashMap hashMap = wf9.a;
                            synchronized (wf9.class) {
                                if (i2 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) wf9.a.get(Long.valueOf(j));
                                }
                            }
                        }
                    }
                }
                if (photo != null) {
                    iy6 iy6Var5 = new iy6();
                    iy6Var5.a = (byte) 2;
                    iy6Var5.g = photo;
                    iy6Var5.n = pageblockphoto.spoiler;
                    TLRPC.PhotoSize w = ba4.w(photo.sizes, gl.Y0(false), false, null, false);
                    if (w != null) {
                        iy6Var5.j = w.w;
                        iy6Var5.k = w.h;
                    }
                    return iy6Var5;
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
            for (iy6 iy6Var : N3((lk0) arrayList2.get(i))) {
                if (iy6Var.b() && (photo = iy6Var.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(iy6Var.g);
                }
            }
            i++;
        }
        return arrayList;
    }

    public final void w4(lk0 lk0Var) {
        TL_iv.PageBlock pageBlock;
        if (this.s3 != null && lk0Var != null && (pageBlock = lk0Var.b) != null) {
            boolean x3 = x3(pageBlock);
            TL_iv.PageBlock pageBlock2 = lk0Var.b;
            if (x3) {
                ArrayList c3 = c3(pageBlock2);
                lk0Var.h = new ArrayList();
                if (c3 != null) {
                    for (int i = 0; i < c3.size(); i++) {
                        iy6 v4 = v4((TL_iv.PageBlock) c3.get(i));
                        ArrayList arrayList = lk0Var.h;
                        if (v4 == null) {
                            v4 = new iy6();
                        }
                        arrayList.add(v4);
                    }
                    return;
                }
                return;
            }
            iy6 v42 = v4(pageBlock2);
            if (v42 != null) {
                lk0Var.g = v42;
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
                for (iy6 iy6Var : N3((lk0) arrayList2.get(i))) {
                    if (iy6Var.b() && (photo = iy6Var.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                        arrayList.add(iy6Var.g);
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
            lk0 lk0Var = (lk0) obj;
            boolean x3 = x3(lk0Var.b);
            TL_iv.PageBlock pageBlock = lk0Var.b;
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
                        iy6 v4 = v4(pageBlock2);
                        if (v4 != null) {
                            arrayList3.add(pageBlock2);
                            arrayList4.add(v4);
                        }
                    }
                    c3.clear();
                    c3.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    lk0Var.h = arrayList4;
                    arrayList2.add(lk0Var);
                }
            } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument)) {
                arrayList2.add(lk0Var);
            } else {
                iy6 v42 = v4(pageBlock);
                if (v42 != null) {
                    lk0Var.g = v42;
                    arrayList2.add(lk0Var);
                }
            }
        }
        return arrayList2;
    }

    public final void y2() {
        ld9 ld9Var = this.R3;
        if (ld9Var != null) {
            ld9Var.h();
        }
        ArrayList arrayList = this.t3;
        SpannableStringBuilder g = dg9.g(arrayList);
        C2();
        arrayList.clear();
        HashMap hashMap = this.u3;
        hashMap.clear();
        this.s3 = null;
        S2(arrayList, dg9.b(g), hashMap);
        this.g3.O(false);
        ld9 ld9Var2 = this.R3;
        if (ld9Var2 != null) {
            ld9Var2.h();
        }
        we9 we9Var = this.p3;
        if (we9Var != null) {
            we9Var.onContentChanged();
            we9Var.P();
        }
    }

    public final void y4(int i, int i2, int i3) {
        mc9 editText;
        if (i >= 0) {
            View m = this.f3.m(i);
            if (m instanceof wi9) {
                wi9 wi9Var = (wi9) m;
                if (i2 == 1 && wi9Var.l()) {
                    editText = wi9Var.getAuthorEditText();
                } else {
                    editText = wi9Var.getEditText();
                }
                editText.P();
                editText.setSelection(Math.max(0, Math.min(i3, editText.length())));
            } else if (m instanceof ii9) {
                ii9 ii9Var = (ii9) m;
                mc9 n = ii9Var.n(i2);
                if (n == null) {
                    n = ii9Var.n(0);
                }
                if (n != null) {
                    n.P();
                    n.setSelection(Math.max(0, Math.min(i3, n.length())));
                }
            } else if (m instanceof tb9) {
                mc9 captionEditText = ((tb9) m).getCaptionEditText();
                captionEditText.P();
                captionEditText.setSelection(Math.max(0, Math.min(i3, captionEditText.length())));
            }
        }
    }

    public final lk0 z2() {
        int i;
        lk0 A42;
        lk0 M2 = M2();
        if (M2 != null) {
            return M2;
        }
        me9 me9Var = this.v3;
        if (me9Var != null && (i = me9Var.p0) >= 0 && (A42 = A4(i)) != null) {
            return A42;
        }
        return null;
    }

    public final void z4() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof jb9) {
                jb9 jb9Var = (jb9) childAt;
                jb9Var.b.a(jb9Var.a, new k88(jb9Var, (byte) 23));
            }
        }
        invalidate();
    }
}
