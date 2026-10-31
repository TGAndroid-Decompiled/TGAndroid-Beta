package bi;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
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
import org.telegram.messenger.b8;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.x20;
import org.telegram.messenger.ye;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z60;
public final class d4 extends u51 {
    public static final ArrayList f2922z4 = new ArrayList();
    public float A3;
    public float B3;
    public float C3;
    public float D3;
    public View E3;
    public b F3;
    public boolean G3;
    public boolean H3;
    public boolean I3;
    public boolean J3;
    public TL_iv.pageTableCell K3;
    public TL_iv.pageTableCell L3;
    public long M3;
    public float N3;
    public float O3;
    public boolean P3;
    public o2 Q3;
    public int R3;
    public n1 S3;
    public final l T3;
    public ArrayList U3;
    public int V3;
    public int W3;
    public int X3;
    public boolean Y3;
    public a Z3;
    public boolean f2923a4;
    public final v3 f2924b4;
    public final z2 f2925c4;
    public final w3 f2926d4;
    public final x3 f2927e4;
    public final y3 f2928f4;
    public final IdentityHashMap f2929g4;
    public final IdentityHashMap f2930h4;
    public a f2931i4;
    public a f2932j4;
    public final z3 f2933k4;
    public final i3 l4;
    public final int f2934m3;
    public final j3 f2935m4;
    public final org.telegram.ui.ActionBar.p6 f2936n3;
    public final k3 f2937n4;
    public final b4 f2938o3;
    public final l3 f2939o4;
    public jj f2940p3;
    public z5 f2941p4;
    public boolean f2942q3;
    public z60 f2943q4;
    public TL_iv.RichMessage f2944r3;
    public int f2945r4;
    public final ArrayList f2946s3;
    public int f2947s4;
    public final HashMap f2948t3;
    public final a3 f2949t4;
    public final q3 f2950u3;
    public final m3 f2951u4;
    public final v9 f2952v3;
    public final a4.l f2953v4;
    public int f2954w3;
    public final ArrayList f2955w4;
    public int f2956x3;
    public dl0 f2957x4;
    public int y3;
    public int f2958y4;
    public boolean f2959z3;

    public d4(Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, b4 b4Var) {
        super(context, i10, 0, false, new ag.a(r1, 13), new a1.c(r1, 10), null, p6Var);
        this.f2942q3 = true;
        this.f2946s3 = new ArrayList();
        this.f2948t3 = new HashMap();
        this.f2954w3 = -1;
        this.f2956x3 = -1;
        this.y3 = 0;
        this.T3 = new l(this, 2);
        this.Y3 = true;
        this.f2924b4 = new v3(this);
        this.f2925c4 = new z2(this);
        this.f2926d4 = new w3(this);
        this.f2927e4 = new x3(this);
        this.f2928f4 = new y3(this);
        this.f2929g4 = new IdentityHashMap();
        this.f2930h4 = new IdentityHashMap();
        this.f2933k4 = new z3(this);
        this.l4 = new i3(this);
        this.f2935m4 = new j3(this);
        this.f2937n4 = new k3(this);
        this.f2939o4 = new l3(this);
        this.f2945r4 = -1;
        this.f2947s4 = -1;
        this.f2949t4 = new a3(this);
        this.f2951u4 = new m3(this);
        a4.l lVar = new a4.l(this, 7);
        this.f2953v4 = lVar;
        this.f2955w4 = new ArrayList();
        this.f2958y4 = -1;
        d4[] d4VarArr = {this};
        this.f2934m3 = i10;
        this.f2936n3 = p6Var;
        this.f2938o3 = b4Var;
        this.f30819f3.f29295r = false;
        setClipToPadding(false);
        setClipChildren(false);
        E1(new ag.a(this, 14), false);
        setReorderLongPressEnabled(false);
        z1(true);
        q3 q3Var = new q3(this, b4Var);
        this.f2950u3 = q3Var;
        q3Var.S(this);
        q3Var.f22196z0 = this.f30818e3;
        v9 n10 = q3Var.n(context);
        this.f2952v3 = n10;
        org.telegram.messenger.i0.E2(n10);
        q3Var.D = new s3(this, b4Var);
        j(new t3(0, this, b4Var));
        this.Q3 = new o2(lVar);
    }

    public static boolean A3(a aVar) {
        if (aVar != null && (aVar.f2818b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || H3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !q6.z(pageBlock).isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        if (!H3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean E3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean F3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean G3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !E3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static boolean H3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockDivider) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockButtonRow) && !(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            return false;
        }
        return true;
    }

    public static boolean I3(a aVar) {
        if (aVar != null && !aVar.f2822i && !A3(aVar) && (aVar.f2818b instanceof TL_iv.pageBlockParagraph) && aVar.f2819c == 0 && aVar.d == 0 && !aVar.e && aVar.f2824k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void L1(bi.d4[] r20, java.util.ArrayList r21, org.telegram.ui.Components.p51 r22) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.L1(bi.d4[], java.util.ArrayList, org.telegram.ui.Components.p51):void");
    }

    public static void M2(a aVar, ArrayList arrayList) {
        int i10;
        int i11;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j10;
        TL_iv.PageBlock pageBlock = aVar.f2818b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            w wVar = aVar.f2821g;
            if (wVar != null && wVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f2818b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f2818b.caption.text = new TL_iv.textEmpty();
                        aVar.f2818b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f2818b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            w wVar2 = aVar.f2821g;
            if (wVar2 != null && wVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f2818b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f2818b.caption.text = new TL_iv.textEmpty();
                        aVar.f2818b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f2818b);
                }
            }
        } else if (E3(pageBlock)) {
            ArrayList j32 = j3(aVar.f2818b);
            List T3 = T3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i12 = 0; j32 != null && i12 < j32.size() && i12 < T3.size(); i12++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) j32.get(i12);
                if (((w) T3.get(i12)).b()) {
                    if (pageBlock4 instanceof TL_iv.pageBlockPhoto) {
                        j10 = ((TL_iv.pageBlockPhoto) pageBlock4).photo_id;
                    } else if (pageBlock4 instanceof TL_iv.pageBlockVideo) {
                        j10 = ((TL_iv.pageBlockVideo) pageBlock4).video_id;
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        n0.d(pageBlock4);
                        arrayList2.add(pageBlock4);
                    }
                }
            }
            if (arrayList2.size() >= 2) {
                if (aVar.f2818b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f2818b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f2818b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                n0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f2818b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                w wVar3 = aVar.f2821g;
                if (wVar3 != null && wVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f2818b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f2818b.caption.text = new TL_iv.textEmpty();
                            aVar.f2818b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f2818b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                w wVar4 = aVar.f2821g;
                if (wVar4 != null && (document = wVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f19799id;
                }
                if (wVar4 != null && wVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f2818b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        n0.d(pageBlock7);
                        arrayList.add(aVar.f2818b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
                int i13 = y4.M;
                if (pageblockmap.geo instanceof TLRPC.TL_geoPoint) {
                    if (pageblockmap.caption == null) {
                        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                        pageblockmap.caption = pageCaption;
                        pageCaption.text = new TL_iv.textEmpty();
                        pageblockmap.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(pageblockmap);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMath) {
                if (!TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock5).source)) {
                    arrayList.add(aVar.f2818b);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock5;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                if (pageblocktable.rows != null) {
                    for (int i14 = 0; i14 < pageblocktable.rows.size(); i14++) {
                        TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i14);
                        if (pagetablerow.cells != null) {
                            for (int i15 = 0; i15 < pagetablerow.cells.size(); i15++) {
                                TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i15);
                                if (pagetablecell.text == null) {
                                    w6.c(pagetablecell, "");
                                } else {
                                    pagetablecell.flags |= 128;
                                }
                                if (pagetablecell.colspan > 1) {
                                    i10 = pagetablecell.flags | 2;
                                } else {
                                    i10 = pagetablecell.flags & (-3);
                                }
                                pagetablecell.flags = i10;
                                if (pagetablecell.rowspan > 1) {
                                    i11 = pagetablecell.flags | 4;
                                } else {
                                    i11 = pagetablecell.flags & (-5);
                                }
                                pagetablecell.flags = i11;
                            }
                        }
                    }
                }
                if (R4(pageblocktable)) {
                    arrayList.add(pageblocktable);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockButtonRow) {
                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock5;
                ArrayList<TL_keyboard.PageButton> arrayList3 = pageblockbuttonrow.buttons;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    arrayList.add(pageblockbuttonrow);
                }
            } else {
                arrayList.add(pageBlock5);
            }
        }
    }

    public static void N1(d4 d4Var, int i10, int i11, int i12) {
        n1 editText;
        if (i10 >= 0) {
            View m10 = d4Var.f30818e3.m(i10);
            if (m10 instanceof q6) {
                q6 q6Var = (q6) m10;
                if (i11 == 1 && q6Var.n()) {
                    editText = q6Var.getAuthorEditText();
                } else {
                    editText = q6Var.getEditText();
                }
                editText.O();
                editText.setSelection(Math.max(0, Math.min(i12, editText.length())));
            } else if (m10 instanceof z5) {
                z5 z5Var = (z5) m10;
                n1 m11 = z5Var.m(i11);
                if (m11 == null) {
                    m11 = z5Var.m(0);
                }
                if (m11 != null) {
                    m11.O();
                    m11.setSelection(Math.max(0, Math.min(i12, m11.length())));
                }
            } else if (m10 instanceof o0) {
                n1 captionEditText = ((o0) m10).getCaptionEditText();
                captionEditText.O();
                captionEditText.setSelection(Math.max(0, Math.min(i12, captionEditText.length())));
            }
        }
    }

    public static boolean N2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static org.telegram.tgnet.tl.TL_iv.PageBlock O1(bi.d4 r2, bi.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.O1(bi.d4, bi.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public static void O2(TL_iv.PageBlock pageBlock) {
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

    public static void P1(d4 d4Var, n1 n1Var) {
        if (n1Var == null) {
            d4Var.getClass();
            return;
        }
        n1Var.W1 = d4Var.f2942q3;
        n1Var.setInlineButtonContext(d4Var.f2934m3);
        n1Var.setInlineButtonClickListener(new a3(d4Var));
    }

    public static void Q1(a aVar, w wVar, d4 d4Var) {
        b4 b4Var = d4Var.f2938o3;
        IdentityHashMap identityHashMap = d4Var.f2930h4;
        IdentityHashMap identityHashMap2 = d4Var.f2929g4;
        if (wVar == null) {
            ArrayList arrayList = d4Var.f2946s3;
            for (w wVar2 : T3(aVar)) {
                l5 l5Var = (l5) identityHashMap2.remove(wVar2);
                if (l5Var != null) {
                    l5Var.b();
                }
                h5 h5Var = (h5) identityHashMap.remove(wVar2);
                if (h5Var != null) {
                    h5Var.a();
                }
            }
            int indexOf = arrayList.indexOf(aVar);
            if (indexOf >= 0) {
                o2 o2Var = d4Var.Q3;
                if (o2Var != null) {
                    o2Var.d();
                }
                arrayList.remove(indexOf);
                d4Var.f30819f3.O(true);
                o2 o2Var2 = d4Var.Q3;
                if (o2Var2 != null) {
                    o2Var2.h();
                }
            }
            b4Var.onContentChanged();
            return;
        }
        l5 l5Var2 = (l5) identityHashMap2.remove(wVar);
        if (l5Var2 != null) {
            l5Var2.b();
        }
        h5 h5Var2 = (h5) identityHashMap.remove(wVar);
        if (h5Var2 != null) {
            h5Var2.a();
        }
        o2 o2Var3 = d4Var.Q3;
        if (o2Var3 != null) {
            o2Var3.d();
        }
        d4Var.t4(aVar, wVar);
        o2 o2Var4 = d4Var.Q3;
        if (o2Var4 != null) {
            o2Var4.h();
        }
        b4Var.onContentChanged();
    }

    public static void Q2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z10, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            V1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z11, z12);
                        } else {
                            a aVar = new a(pageBlock, i10, i11);
                            aVar.e = z11;
                            aVar.f2820f = z12;
                            arrayList.add(aVar);
                        }
                        z13 = true;
                    } else {
                        arrayList.add(new a(pageBlock, i10, z10 ? 1 : 0));
                    }
                } else {
                    if (!z13) {
                        V1(arrayList, null, i10, i11, z11, z12);
                        z13 = true;
                    }
                    R2(arrayList, pageBlock, i10 + 1);
                }
            }
        }
        if (!z13) {
            V1(arrayList, null, i10, i11, z11, z12);
        }
    }

    public static TL_iv.PageBlock Q3(a aVar, w wVar) {
        int i10;
        if (E3(aVar.f2818b)) {
            ArrayList j32 = j3(aVar.f2818b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(wVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0 && j32 != null && i10 < j32.size()) {
                return (TL_iv.PageBlock) j32.get(i10);
            }
            return null;
        }
        return aVar.f2818b;
    }

    public static void R1(d4 d4Var) {
        if (d4Var.P3) {
            return;
        }
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.h();
        }
        d4Var.f2938o3.r();
        d4Var.r4();
    }

    public static void R2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
        int i11 = 0;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            ArrayList<TL_iv.PageListOrderedItem> arrayList2 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
            int size = arrayList2.size();
            int i12 = 1;
            while (i11 < size) {
                TL_iv.PageListOrderedItem pageListOrderedItem = arrayList2.get(i11);
                i11++;
                TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                    V1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i13 = i12;
                    Q2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                    i12 = i13;
                }
                i12++;
            }
            return;
        }
        ArrayList<TL_iv.PageListItem> arrayList3 = ((TL_iv.pageBlockList) pageBlock).items;
        int size2 = arrayList3.size();
        while (i11 < size2) {
            TL_iv.PageListItem pageListItem = arrayList3.get(i11);
            i11++;
            TL_iv.PageListItem pageListItem2 = pageListItem;
            if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                V1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                Q2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static boolean R4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(s6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!w6.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void S1(d4 d4Var, a aVar) {
        ArrayList arrayList = d4Var.f2946s3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f2824k.addAll(aVar.f2824k);
        arrayList.add(indexOf + 1, aVar2);
        d4Var.v4();
        d4Var.f30819f3.O(false);
        o2 o2Var2 = d4Var.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        d4Var.post(new v2(d4Var, aVar2, 23));
    }

    public static FrameLayout S4(z5 z5Var, boolean z10) {
        int i10;
        c6 m10;
        w6 model = z5Var.getModel();
        if (model != null) {
            int i11 = Integer.MAX_VALUE;
            if (z10) {
                i10 = -1;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : z5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o10 = z10 ? (w6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o10 < i10 || (o10 == i10 && a2 < i11) : o10 > i10 || (o10 == i10 && a2 < i11)) {
                    pagetablecell = pagetablecell2;
                    i11 = a2;
                    i10 = o10;
                }
            }
            if (pagetablecell != null && (m10 = z5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return z5Var;
    }

    public static boolean T1(bi.d4 r16, bi.a r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.T1(bi.d4, bi.a, boolean):boolean");
    }

    public static List T3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (E3(aVar.f2818b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        w wVar = aVar.f2821g;
        if (wVar != null) {
            return Collections.singletonList(wVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static n1 U3(View view) {
        if (view instanceof q6) {
            return ((q6) view).getEditText();
        }
        if (view instanceof o0) {
            return ((o0) view).getCaptionEditText();
        }
        if (view instanceof y0) {
            return ((y0) view).getEditText();
        }
        return null;
    }

    public static void V1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i10, i11);
        aVar.e = z10;
        aVar.f2820f = z11;
        arrayList.add(aVar);
    }

    public static TL_iv.PageBlock V3(TL_iv.PageBlock pageBlock) {
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

    public static w W3(ef efVar, String str) {
        boolean z10;
        int i10;
        w wVar = new w();
        wVar.f3417b = efVar.f19507b;
        wVar.e = str;
        wVar.f3422j = efVar.F;
        wVar.f3423k = efVar.G;
        String str2 = efVar.h;
        int i11 = 0;
        if (str2 != null && str != null && str.equals(str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = efVar.J;
        }
        wVar.f3424l = i10;
        if (!z10) {
            i11 = efVar.K;
        }
        wVar.f3425m = i11;
        wVar.f3416a = 1;
        wVar.f3419f = 0.0f;
        return wVar;
    }

    public static z5 X2(n1 n1Var) {
        for (ViewParent parent = n1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof z5) {
                return (z5) parent;
            }
        }
        return null;
    }

    public static void Z2(ArrayList arrayList, ArrayList arrayList2, Map map) {
        TL_iv.RichText richText;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                        if (pageblockdetails.title == null) {
                            pageblockdetails.title = new TL_iv.textEmpty();
                        }
                        arrayList.add(new a(pageblockdetails, 0, 0));
                        int size2 = arrayList.size();
                        Z2(arrayList, pageblockdetails.blocks, map);
                        if (arrayList.size() == size2) {
                            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        aVar.f2822i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a2 = r0.a();
                        Z2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f2824k.add(0, Long.valueOf(a2));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a2), pageblockblockquoteblocks.caption);
                        }
                    } else {
                        arrayList.add(new a(pageBlock, 0, 0));
                    }
                } else {
                    R2(arrayList, pageBlock, 1);
                }
            }
        }
    }

    public static ArrayList a3(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        Z2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void c2(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] d5(z5 z5Var) {
        int i10;
        int i11;
        w6 w6Var = z5Var.F;
        if (w6Var != null) {
            i10 = w6Var.f3441g.size();
        } else {
            i10 = 0;
        }
        while (i10 >= 0) {
            n1 m10 = z5Var.m(i10);
            if (m10 != null) {
                i11 = m10.length();
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                return new int[]{i10, i11};
            }
            i10--;
        }
        return null;
    }

    public static ArrayList j3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean k4(n1 n1Var, float f7, float f10) {
        int[] iArr;
        if (n1Var != null && n1Var.getVisibility() == 0) {
            n1Var.getLocationOnScreen(new int[2]);
            float f11 = f7 - iArr[0];
            float f12 = f10 - iArr[1];
            if (f11 >= 0.0f && f12 >= 0.0f && f11 <= n1Var.getWidth() && f12 <= n1Var.getHeight()) {
                int offsetForPosition = n1Var.getOffsetForPosition(f11, f12);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                n1Var.O();
                n1Var.setSelection(Math.max(0, Math.min(offsetForPosition, n1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int n4(int i10, a aVar, boolean z10) {
        int i11;
        if (aVar == null) {
            return org.telegram.messenger.i0.L(2.0f);
        }
        if (z10) {
            i11 = aVar.f2825l;
        } else {
            i11 = aVar.f2826m;
        }
        int size = aVar.f2824k.size() - i11;
        return org.telegram.messenger.m5.D(16.0f, Math.max(0, i10 - size), org.telegram.messenger.i0.L(2.0f));
    }

    public static boolean o3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !G3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int o4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f2824k;
        int i10 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f2824k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i10 < min && ((Long) arrayList.get(i10)).equals(arrayList2.get(i10))) {
            i10++;
        }
        return i10;
    }

    public void setEditTextsLocked(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q6) {
                ((q6) childAt).setLocked(z10);
            } else if (childAt instanceof z5) {
                ((z5) childAt).setLocked(z10);
            } else if (childAt instanceof o0) {
                ((o0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof y0) {
                ((y0) childAt).setLocked(z10);
            } else if (childAt instanceof c1) {
                childAt.invalidate();
            }
        }
    }

    public static boolean y3(int i10) {
        if (i10 != 21 && i10 != 22 && i10 != 19 && i10 != 20) {
            return false;
        }
        return true;
    }

    public static int z2(int i10) {
        if (i10 == 4) {
            return 114971;
        }
        if (i10 == 16384) {
            return 32772;
        }
        if (i10 != 32768) {
            return 4;
        }
        return 16388;
    }

    public final boolean A2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.f2946s3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.f2822i;
            ArrayList arrayList2 = aVar.f2824k;
            if (!z10) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    Map.EL.merge(hashMap, (Long) arrayList2.get(i11), 1, new Object());
                }
            }
            i10++;
        }
        boolean z11 = false;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a aVar2 = (a) arrayList.get(i12);
            ArrayList arrayList3 = aVar2.f2824k;
            if (arrayList3.size() == 1 && (aVar2.f2818b instanceof TL_iv.pageBlockParagraph)) {
                Long l4 = (Long) arrayList3.get(0);
                l4.getClass();
                Integer num = (Integer) hashMap.get(l4);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f2818b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f2948t3.remove(l4);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f2818b = pageblockblockquote;
                    arrayList3.clear();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void A4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof v4) {
                c0 c0Var = (c0) ((v4) childAt);
                c0Var.f2882b.a(c0Var.f2881a, new a1.c(c0Var, 7));
            }
        }
        invalidate();
    }

    public final ArrayList B2() {
        TLRPC.Document document;
        w wVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f2946s3;
            if (i10 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i10);
                if ((aVar.f2818b instanceof TL_iv.pageBlockDocument) && (wVar = aVar.f2821g) != null && wVar.b() && (document2 = aVar.f2821g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f2818b).document_id = document2.f19799id;
                }
                for (w wVar2 : T3(aVar)) {
                    if (wVar2.b() && (document = wVar2.h) != null) {
                        long j10 = document.f19799id;
                        if (j10 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j10))) {
                            arrayList.add(wVar2.h);
                        }
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final boolean B3() {
        int i10;
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x() && (i10 = q3Var.f22186p0) == q3Var.f22189s0 && A3(B4(i10))) {
            return true;
        }
        return false;
    }

    public final a B4(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f2955w4;
            if (i10 < arrayList.size()) {
                return (a) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final ArrayList C2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f2946s3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (w wVar : T3((a) arrayList2.get(i10))) {
                if (wVar.b() && (document = wVar.h) != null && hashSet.add(Long.valueOf(document.f19799id))) {
                    arrayList.add(wVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void C4() {
        ArrayList arrayList = this.f2946s3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.f30819f3.O(false);
    }

    @Override
    public final boolean D1() {
        return this.f2923a4;
    }

    public final ArrayList D2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f2946s3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (w wVar : T3((a) arrayList2.get(i10))) {
                if (wVar.b() && (photo = wVar.f3420g) != null && hashSet.add(Long.valueOf(photo.f19817id))) {
                    arrayList.add(wVar.f3420g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View D4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.f30818e3.m(i10);
    }

    public final ArrayList E2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f2946s3;
            if (i10 < arrayList2.size()) {
                for (w wVar : T3((a) arrayList2.get(i10))) {
                    if (wVar.b() && (photo = wVar.f3420g) != null && hashSet.add(Long.valueOf(photo.f19817id))) {
                        arrayList.add(wVar.f3420g);
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final int[] E4() {
        int i10;
        ArrayList arrayList = this.f2946s3;
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x()) {
            int indexOf = arrayList.indexOf(B4(q3Var.f22186p0));
            int indexOf2 = arrayList.indexOf(B4(q3Var.f22189s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        a T2 = T2();
        if (T2 != null) {
            i10 = arrayList.indexOf(T2);
        } else {
            i10 = -1;
        }
        if (i10 >= 0) {
            return new int[]{i10, i10};
        }
        return null;
    }

    @Override
    public final void F1() {
        b4 b4Var = this.f2938o3;
        if (b4Var != null) {
            b4Var.A();
        }
    }

    public final void F2() {
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            o2Var.h();
        }
        ArrayList arrayList = this.f2946s3;
        SpannableStringBuilder g10 = n5.g(arrayList);
        J2();
        arrayList.clear();
        HashMap hashMap = this.f2948t3;
        hashMap.clear();
        this.f2944r3 = null;
        Z2(arrayList, n5.b(g10), hashMap);
        this.f30819f3.O(false);
        o2 o2Var2 = this.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        b4 b4Var = this.f2938o3;
        if (b4Var != null) {
            b4Var.onContentChanged();
            b4Var.Z();
        }
    }

    public final boolean F4() {
        int i10;
        int i11;
        int i12;
        int i13;
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x()) {
            if (O3()) {
                int i14 = q3Var.f22186p0;
                int i15 = q3Var.f22187q0;
                int i16 = q3Var.f22190t0;
                int i17 = q3Var.f22188r0;
                int i18 = q3Var.f22191u0;
                for (int i19 = i15; i19 <= i16; i19++) {
                    n1 Q4 = Q4(i14, i19);
                    if (Q4 != null) {
                        int length = Q4.length();
                        if (i19 == i15) {
                            i12 = i17;
                        } else {
                            i12 = 0;
                        }
                        if (i19 == i16) {
                            i13 = i18;
                        } else {
                            i13 = length;
                        }
                        if (i15 == i16) {
                            i12 = Math.min(i17, i18);
                            i13 = Math.max(i17, i18);
                        }
                        if (Math.max(0, Math.min(i12, length)) < Math.max(0, Math.min(i13, length))) {
                            return true;
                        }
                    }
                }
            } else if (B3()) {
                n1 L2 = L2(q3Var.f22186p0);
                if (L2 != null && Math.max(0, Math.min(Math.min(q3Var.f22188r0, q3Var.f22191u0), L2.length())) < Math.max(0, Math.min(Math.max(q3Var.f22188r0, q3Var.f22191u0), L2.length()))) {
                    return true;
                }
            } else if (z3()) {
                n1 v22 = v2(q3Var.f22186p0);
                if (v22 != null) {
                    int i20 = q3Var.f22188r0;
                    int i21 = q3Var.f22191u0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), v22.length())) < Math.max(0, Math.min(Math.max(i20, i21), v22.length()))) {
                        return true;
                    }
                }
            } else if (J3()) {
                n1 m42 = m4(q3Var.f22186p0);
                if (m42 != null) {
                    int i22 = q3Var.f22188r0;
                    int i23 = q3Var.f22191u0;
                    if (Math.max(0, Math.min(Math.min(i22, i23), m42.length())) < Math.max(0, Math.min(Math.max(i22, i23), m42.length()))) {
                        return true;
                    }
                }
            } else {
                int i24 = q3Var.f22186p0;
                int i25 = q3Var.f22189s0;
                int i26 = q3Var.f22188r0;
                int i27 = q3Var.f22191u0;
                if (i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < this.f2955w4.size()) {
                    for (int i28 = i24; i28 <= i25; i28++) {
                        a B4 = B4(i28);
                        if (B4 != null) {
                            if (B4.f2833t == 0) {
                                TL_iv.PageBlock pageBlock = B4.f2818b;
                                if (!D3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int l22 = l2(i28);
                            if (i28 == i24) {
                                i10 = i26;
                            } else {
                                i10 = 0;
                            }
                            if (i28 == i25) {
                                i11 = i27;
                            } else {
                                i11 = l22;
                            }
                            if (Math.max(0, Math.min(i10, l22)) < Math.max(0, Math.min(i11, l22))) {
                                return true;
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
        b4 b4Var = this.f2938o3;
        if (b4Var != null) {
            b4Var.T();
        }
        A4();
    }

    public final a G2() {
        int i10;
        a B4;
        a T2 = T2();
        if (T2 != null) {
            return T2;
        }
        q3 q3Var = this.f2950u3;
        if (q3Var != null && (i10 = q3Var.f22186p0) >= 0 && (B4 = B4(i10)) != null) {
            return B4;
        }
        return null;
    }

    public final int[] G4() {
        q3 q3Var = this.f2950u3;
        if (q3Var != null) {
            int i10 = q3Var.f22186p0;
            int i11 = q3Var.f22189s0;
            if (i10 >= 0 && i11 >= 0) {
                a B4 = B4(i10);
                a B42 = B4(i11);
                if (B4 != null && B42 != null) {
                    ArrayList arrayList = this.f2946s3;
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
    public final void H1(s4.c1 c1Var) {
        b4 b4Var = this.f2938o3;
        if (b4Var != null && c1Var != null) {
            View view = c1Var.f47898a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.f2923a4 = b4Var.c(view.getHeight() + iArr[1]);
        }
    }

    public final void H2() {
        ArrayList arrayList;
        q3 q3Var = this.f2950u3;
        int i10 = q3Var.f22186p0;
        int i11 = q3Var.f22188r0;
        int i12 = q3Var.f22189s0;
        if (!Z1(i10, i11, i12, q3Var.f22191u0, new String[]{""})) {
            if (i10 > i12) {
                i12 = i10;
                i10 = i12;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i10);
            while (true) {
                arrayList = this.f2946s3;
                if (max > i12) {
                    break;
                }
                ArrayList arrayList3 = this.f2955w4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f2833t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                o2 o2Var = this.Q3;
                if (o2Var != null) {
                    o2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f2948t3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        hashSet.addAll(((a) arrayList.get(i13)).f2824k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                A2();
                Y3();
                v4();
                q3Var.f(false);
                this.f30819f3.O(false);
                o2 o2Var2 = this.Q3;
                if (o2Var2 != null) {
                    o2Var2.h();
                }
                post(new v2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void H4(n1 n1Var) {
        n1Var.W1 = this.f2942q3;
        n1Var.C(new b(this, 4));
    }

    @Override
    public final void I1(s4.c1 c1Var) {
        a aVar = this.Z3;
        this.Z3 = null;
        this.f2923a4 = false;
        if (aVar != null) {
            o2 o2Var = this.Q3;
            if (o2Var != null) {
                o2Var.d();
            }
            u4(aVar);
            o2 o2Var2 = this.Q3;
            if (o2Var2 != null) {
                o2Var2.h();
            }
            b4 b4Var = this.f2938o3;
            if (b4Var != null) {
                b4Var.onContentChanged();
            }
        } else if (c1Var != null) {
            View view = c1Var.f47898a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean I2() {
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x()) {
            q3Var.f(false);
            return true;
        } else if (this.f2941p4 == null) {
            return false;
        } else {
            P2();
            return true;
        }
    }

    public final void I4(bi.z5 r35) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.I4(bi.z5):void");
    }

    @Override
    public final void J1(s4.c1 c1Var) {
        int b10;
        a51 G;
        a aVar = null;
        if (c1Var != null && (b10 = c1Var.b()) >= 0 && (G = this.f30819f3.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.Z3 = aVar;
        this.f2923a4 = false;
        b4 b4Var = this.f2938o3;
        if (b4Var != null) {
            b4Var.u();
        }
    }

    public final void J2() {
        q3 q3Var = this.f2950u3;
        if (q3Var != null) {
            q3Var.f(true);
        }
        P2();
        q3();
        IdentityHashMap identityHashMap = this.f2929g4;
        for (l5 l5Var : identityHashMap.values()) {
            l5Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.f2930h4;
        for (h5 h5Var : identityHashMap2.values()) {
            h5Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean J3() {
        int i10;
        a B4;
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x() && (i10 = q3Var.f22186p0) == q3Var.f22189s0 && i10 >= 0 && i10 < this.f2955w4.size() && q3Var.f22187q0 == 1 && q3Var.f22190t0 == 1 && (B4 = B4(i10)) != null && q6.p(B4.f2818b)) {
            return true;
        }
        return false;
    }

    public final q6 J4() {
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x()) {
            int i10 = q3Var.f22186p0;
            int i11 = q3Var.f22189s0;
            a B4 = B4(i10);
            if (i10 == i11 && B4 != null && D3(B4.f2818b)) {
                return x2(i10);
            }
            return null;
        }
        return null;
    }

    public final int K2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.f2946s3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (A3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).f2822i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean K3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f2946s3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.f2822i && !A3(aVar)) {
                        if (!aVar.f2824k.isEmpty() || q6.p(aVar.f2818b)) {
                            z10 = true;
                        }
                    }
                    i10++;
                }
                return z10;
            }
        }
        return false;
    }

    public final Editable K4(int i10, int i11, int i12, int i13) {
        if (i10 == i12) {
            if (A3(B4(i10))) {
                n1 L2 = L2(i10);
                if (L2 != null) {
                    return L2.getText();
                }
                return null;
            } else if (J3()) {
                n1 m42 = m4(i10);
                if (m42 != null) {
                    return m42.getText();
                }
                return null;
            } else {
                a B4 = B4(i10);
                if (B4 != null && D3(B4.f2818b)) {
                    int l22 = l2(i10);
                    if (a1.g.D(i11, i13, l22, 0) < a1.g.B(i11, i13, l22, 0)) {
                        q6 x22 = x2(i10);
                        if (x22 != null) {
                            return x22.getEditText().getText();
                        }
                        return q6.A(B4.f2818b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final n1 L2(int i10) {
        if (!A3(B4(i10))) {
            return null;
        }
        View D4 = D4(i10);
        if (!(D4 instanceof y0)) {
            return null;
        }
        return ((y0) D4).getEditText();
    }

    public final boolean L3() {
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x()) {
            int i10 = q3Var.f22186p0;
            int i11 = q3Var.f22189s0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a B4 = B4(i10);
                    if (B4 != null) {
                        if (F3(B4.f2818b)) {
                            z10 = true;
                        }
                    }
                    i10++;
                }
                return z10;
            }
        }
        return false;
    }

    public final boolean L4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.L4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean M3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.M3(int, int, int, int, int):boolean");
    }

    public final void M4(View view) {
        s4.c1 T;
        int b10;
        if (view != null && this.f30820g3 != null && this.f30823j3 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.f30819f3.H(b10) >= 0) {
            this.H3 = true;
            q3 q3Var = this.f2950u3;
            if (q3Var.x()) {
                q3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.f30820g3.t(T);
        }
    }

    public final boolean N3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        boolean z10 = false;
        for (int i18 = i12; i18 <= i14; i18++) {
            n1 Q4 = Q4(i11, i18);
            if (Q4 != null) {
                int length = Q4.length();
                if (i18 == i12) {
                    i16 = i13;
                } else {
                    i16 = 0;
                }
                if (i18 == i14) {
                    i17 = i15;
                } else {
                    i17 = length;
                }
                if (i12 == i14) {
                    i16 = Math.min(i13, i15);
                    i17 = Math.max(i13, i15);
                }
                int max = Math.max(0, Math.min(i16, length));
                int max2 = Math.max(0, Math.min(i17, length));
                if (max >= max2) {
                    continue;
                } else if ((Q4.c(max, max2) & i10) == 0) {
                    return false;
                } else {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void N4(a aVar, w wVar, ef efVar) {
        int i10;
        float f7;
        l5 l5Var = (l5) this.f2929g4.remove(wVar);
        if (l5Var != null) {
            l5Var.b();
        }
        IdentityHashMap identityHashMap = this.f2930h4;
        h5 h5Var = (h5) identityHashMap.remove(wVar);
        if (h5Var != null) {
            h5Var.a();
        }
        wVar.f3416a = 1;
        wVar.f3419f = 0.0f;
        h5 h5Var2 = new h5(this.f2934m3, efVar, new android.support.v4.media.session.a0(aVar, wVar, this));
        identityHashMap.put(wVar, h5Var2);
        if (!h5Var2.f3062f && !h5Var2.h && !h5Var2.f3063n) {
            h5Var2.f3062f = true;
            int i11 = efVar.F;
            String str = efVar.I;
            int i12 = efVar.G;
            if (i11 <= 0 || i12 <= 0) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str, options);
                    i11 = options.outWidth;
                    i12 = options.outHeight;
                } catch (Exception unused) {
                }
            }
            x20 x20Var = null;
            r8 = null;
            ArrayList arrayList = null;
            x20Var = null;
            if (i11 > 0 && i12 > 0) {
                int i13 = efVar.J;
                if (i13 == 90 || i13 == 270) {
                    int i14 = i12;
                    i12 = i11;
                    i11 = i14;
                }
                x20 x20Var2 = new x20();
                x20Var2.f19183a = 0L;
                x20Var2.d = (float) 0;
                x20Var2.f19185b = Math.min(3000L, efVar.f19522t);
                while (true) {
                    long j10 = x20Var2.f19185b;
                    i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    if (i10 <= 0 || j10 >= 1000) {
                        break;
                    }
                    x20Var2.f19185b = j10 * 2;
                }
                if (i10 <= 0) {
                    x20Var2.f19185b = 3000L;
                }
                long j11 = x20Var2.f19185b;
                x20Var2.e = (float) j11;
                x20Var2.f19188f = 1;
                x20Var2.f19189g = 0;
                x20Var2.f19196o = str;
                x20Var2.f19198q = (int) ((f7 / 1000.0f) * 115200.0f);
                x20Var2.f19199r = j11;
                x20Var2.f19195n = 30;
                x20Var2.v = j11;
                x20Var2.A = efVar.f19517o;
                String str2 = efVar.f19513k;
                if (str2 != null) {
                    x20Var2.B = str2;
                    ArrayList arrayList2 = efVar.f19519q;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList = efVar.f19519q;
                    }
                    x20Var2.G = arrayList;
                } else {
                    x20Var2.B = efVar.f19512j;
                    x20Var2.G = efVar.f19518p;
                }
                x20Var2.I = true;
                ye yeVar = efVar.A;
                if (yeVar != null) {
                    int i15 = yeVar.f19370k;
                    if (i15 == 90 || i15 == 270) {
                        int i16 = i12;
                        i12 = i11;
                        i11 = i16;
                    }
                    i11 = (int) (i11 * yeVar.e);
                    i12 = (int) (i12 * yeVar.f19367f);
                }
                float f10 = i11;
                float f11 = i12;
                float max = Math.max(f10 / 854.0f, f11 / 854.0f);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                int i17 = (int) (f10 / max);
                int i18 = (int) (f11 / max);
                if (i17 % 16 != 0) {
                    i17 = Math.max(1, Math.round(i17 / 16.0f)) * 16;
                }
                if (i18 % 16 != 0) {
                    i18 = Math.max(1, Math.round(i18 / 16.0f)) * 16;
                }
                x20Var2.f19192k = i17;
                x20Var2.h = i17;
                x20Var2.f19193l = i18;
                x20Var2.f19190i = i18;
                x20Var2.f19194m = -1;
                x20Var2.f19201t = true;
                x20Var2.f19187c = 0L;
                x20Var = x20Var2;
            }
            h5Var2.d = x20Var;
            if (x20Var != null && x20Var.c()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f19814id = 1;
                String absolutePath = new File(b8.z(4), "rich_anim_" + tz.p() + ".mp4").getAbsolutePath();
                h5Var2.e = absolutePath;
                tL_message.attachPath = absolutePath;
                jj jjVar = new jj(h5Var2.f3059a, tL_message, null, false, false);
                h5Var2.f3061c = jjVar;
                jjVar.f16356p0 = h5Var2.d;
                zs f12 = zs.f(h5Var2.f3059a);
                f12.b(h5Var2, zs.a2);
                f12.b(h5Var2, zs.f19586b2);
                f12.b(h5Var2, zs.f19592c2);
                MediaController.B().h0(h5Var2.f3061c, false, false, false);
                return;
            }
            h5Var2.b();
        }
    }

    public final boolean O3() {
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x()) {
            int i10 = q3Var.f22186p0;
            int i11 = q3Var.f22189s0;
            a B4 = B4(i10);
            if (i10 == i11 && B4 != null && (B4.f2818b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void O4(a aVar, w wVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.f2929g4;
        l5 l5Var = (l5) identityHashMap.remove(wVar);
        if (l5Var != null) {
            l5Var.b();
        }
        l5 l5Var2 = new l5(this.f2934m3, str, z10, i10, i11, i12, new p3(aVar, wVar, this));
        identityHashMap.put(wVar, l5Var2);
        l5Var2.d();
    }

    public final void P2() {
        if (this.I3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.I3 = false;
        this.J3 = false;
        this.K3 = null;
        this.L3 = null;
        z60 z60Var = this.f2943q4;
        if (z60Var != null) {
            this.f2943q4 = null;
            z60Var.u();
        }
        z5 z5Var = this.f2941p4;
        if (z5Var != null) {
            LinkedHashSet linkedHashSet = z5Var.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                z5Var.f3483w.invalidate();
                z5Var.v();
            }
            this.f2941p4 = null;
        }
        this.f2947s4 = -1;
        this.f2945r4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean P3() {
        org.telegram.messenger.s0 s0Var = vp.r1(this.f2934m3).f18957y7;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f2946s3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += T3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList c32 = c3();
        ?? obj = new Object();
        obj.d = i11;
        obj.f3278b = c32.size() + obj.f3278b;
        for (int i12 = 0; i12 < c32.size(); i12++) {
            p2.b((TL_iv.PageBlock) c32.get(i12), 1, obj);
        }
        if (obj.f3277a > ((org.telegram.messenger.l0) s0Var.V.f10700a).f16658c || obj.f3278b > ((org.telegram.messenger.l0) s0Var.W.f10700a).f16658c || obj.f3279c > ((org.telegram.messenger.l0) s0Var.X.f10700a).f16658c || obj.d > ((org.telegram.messenger.l0) s0Var.Y.f10700a).f16658c || obj.e > ((org.telegram.messenger.l0) s0Var.Z.f10700a).f16658c) {
            return false;
        }
        return true;
    }

    public final Editable P4(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof q6) {
            return ((q6) C1).getEditText().getText();
        }
        return q6.A(aVar.f2818b);
    }

    public final n1 Q4(int i10, int i11) {
        View D4 = D4(i10);
        if (!(D4 instanceof z5)) {
            return null;
        }
        return ((z5) D4).m(i11);
    }

    public final int[] R3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.U3.size(); i12++) {
            int length = q6.z(((a) this.U3.get(i12)).f2818b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.U3.size() - 1;
        return new int[]{size, q6.z(((a) this.U3.get(size)).f2818b).length()};
    }

    public final n1 S2() {
        View findFocus = findFocus();
        if (findFocus instanceof n1) {
            return (n1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q6) {
                return ((q6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int S3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f2946s3;
            if (i12 < arrayList.size()) {
                a aVar = (a) arrayList.get(i12);
                if (A3(aVar)) {
                    i11++;
                } else if (aVar.f2822i && i11 - 1 == 0) {
                    return i12;
                }
                i12++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final a T2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q6) {
                q6 q6Var = (q6) childAt;
                if (q6Var.getEditText().isFocused() || (q6Var.n() && q6Var.h.isFocused())) {
                    return q6Var.getRow();
                }
            }
        }
        return null;
    }

    public final void T4() {
        boolean z10;
        int[] E4 = E4();
        if (E4 != null) {
            int i10 = E4[0];
            int i11 = E4[1];
            if (i10 >= 0) {
                ArrayList arrayList = this.f2946s3;
                if (i11 < arrayList.size() && i10 <= i11) {
                    o2 o2Var = this.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    if (K3(i10, i11)) {
                        for (int i12 = i10; i12 <= i11; i12++) {
                            a aVar = (a) arrayList.get(i12);
                            boolean z11 = aVar.f2822i;
                            ArrayList arrayList2 = aVar.f2824k;
                            if (!z11 && !A3(aVar)) {
                                if (q6.p(aVar.f2818b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f2818b.text;
                                    aVar.f2818b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    a1.g.x(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a2 = r0.a();
                        for (int i13 = i10; i13 <= i11; i13++) {
                            a aVar2 = (a) arrayList.get(i13);
                            boolean z12 = aVar2.f2822i;
                            ArrayList arrayList3 = aVar2.f2824k;
                            if (!z12 && !A3(aVar2)) {
                                if (q6.p(aVar2.f2818b)) {
                                    long a10 = r0.a();
                                    TL_iv.RichText k10 = q6.k(aVar2.f2818b);
                                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                        this.f2948t3.put(Long.valueOf(a10), k10);
                                    }
                                    arrayList3.add(Long.valueOf(a10));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f2818b.text;
                                    aVar2.f2818b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a2));
                            }
                        }
                    }
                    A2();
                    Y3();
                    v4();
                    q3 q3Var = this.f2950u3;
                    if (q3Var != null && q3Var.x()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
                    this.f30819f3.O(false);
                    o2 o2Var2 = this.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                    if (z10) {
                        post(new a3.l0(this, aVar3, aVar4, 13));
                    } else {
                        post(new v2(this, aVar3, 9));
                    }
                }
            }
        }
    }

    public final void U1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.U1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final z5 U2() {
        View findFocus = findFocus();
        if (findFocus instanceof n1) {
            return X2((n1) findFocus);
        }
        return null;
    }

    public final void U4(bi.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.U4(bi.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final TLRPC.Document V2(long j10) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.Document document2 = null;
        if (i10 == 0) {
            return null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f2946s3.size(); i12++) {
            for (w wVar : T3((a) this.f2946s3.get(i12))) {
                if (wVar != null && (document = wVar.h) != null && document.f19799id == j10) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f2944r3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.Document document3 = arrayList.get(i11);
                i11++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f19799id == j10) {
                    return document4;
                }
            }
        }
        HashMap hashMap = g5.f3042a;
        synchronized (g5.class) {
            if (i10 != 0) {
                document2 = (TLRPC.Document) g5.f3043b.get(Long.valueOf(j10));
            }
        }
        return document2;
    }

    public final boolean V4() {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.V4():boolean");
    }

    public final void W1(a aVar, ef efVar) {
        TL_iv.PageBlock pageblockvideo;
        d4 d4Var;
        if (aVar != null && G3(aVar.f2818b)) {
            String str = efVar.h;
            if (str == null) {
                str = efVar.I;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                o2 o2Var = this.Q3;
                if (o2Var != null) {
                    o2Var.d();
                }
                w W3 = W3(efVar, str2);
                boolean c10 = h5.c(efVar);
                if (!efVar.f19507b && !c10) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (E3(aVar.f2818b)) {
                    j3(aVar.f2818b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(W3);
                } else {
                    w wVar = aVar.f2821g;
                    if (wVar != null && wVar.f3416a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f2818b.caption;
                        n0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f2818b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f2821g);
                        aVar.h.add(W3);
                        aVar.f2821g = null;
                        aVar.f2818b = pageblockcollage;
                    } else {
                        aVar.f2818b = pageblockvideo;
                        aVar.f2821g = W3;
                    }
                }
                this.f30819f3.O(false);
                q4(aVar);
                if (c10) {
                    N4(aVar, W3, efVar);
                    d4Var = this;
                } else {
                    d4Var = this;
                    d4Var.O4(aVar, W3, str2, efVar.f19507b, efVar.F, efVar.G, efVar.E);
                }
                o2 o2Var2 = d4Var.Q3;
                if (o2Var2 != null) {
                    o2Var2.h();
                }
                d4Var.f2938o3.onContentChanged();
            }
        }
    }

    public final int W2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f2946s3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f2822i) {
                int i12 = -1;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (A3(aVar2)) {
                        i13++;
                        if (i12 == -1 && !((TL_iv.pageBlockDetails) aVar2.f2818b).open) {
                            i12 = i13;
                        }
                    } else if (aVar2.f2822i) {
                        if (i12 != -1 && i13 == i12) {
                            i12 = -1;
                        }
                        i13--;
                    }
                }
                if (i12 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f2818b;
                    if (!H3(pageBlock) || o3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i10;
                    }
                }
            }
            i10 += i11;
        }
        return -1;
    }

    public final boolean W4(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.W4(android.view.View, float, float):boolean");
    }

    public final void X1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            o2 o2Var = this.Q3;
            if (o2Var != null) {
                o2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f2944r3;
            if (richMessage2 == null) {
                this.f2944r3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f2944r3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Z2(arrayList4, richMessage.blocks, this.f2948t3);
            if (!arrayList4.isEmpty()) {
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    y4((a) arrayList4.get(i10));
                }
                ArrayList arrayList5 = this.f2946s3;
                int size = arrayList5.size();
                a T2 = T2();
                if (T2 != null && (indexOf = arrayList5.indexOf(T2)) >= 0) {
                    TL_iv.PageBlock pageBlock = T2.f2818b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && q6.z(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                Y3();
                v4();
                this.f30819f3.O(false);
                o2 o2Var2 = this.Q3;
                if (o2Var2 != null) {
                    o2Var2.h();
                }
                b4 b4Var = this.f2938o3;
                if (b4Var != null) {
                    b4Var.onContentChanged();
                }
            }
        }
    }

    public final a X3(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f2955w4;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f2822i) {
                    if (aVar.f2833t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f2818b;
                        if (H3(pageBlock) && !o3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    return aVar;
                }
                i10 += i11;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void X4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        Editable A;
        if (aVar == null) {
            aVar = a5();
        }
        a aVar2 = aVar;
        if (aVar2 != null && pageBlock != null) {
            ArrayList arrayList = this.f2946s3;
            if (arrayList.indexOf(aVar2) >= 0 && !A3(aVar2) && !aVar2.f2822i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f2818b;
                if (pageBlock != pageBlock2 && D3(pageBlock2) && D3(pageBlock)) {
                    q6 x22 = x2(arrayList.indexOf(aVar2));
                    if (x22 != null) {
                        A = x22.getEditText().getText();
                    } else {
                        A = q6.A(aVar2.f2818b);
                    }
                    q6.d(pageBlock, A);
                    TL_iv.RichText k10 = q6.k(aVar2.f2818b);
                    if (k10 != null && q6.k(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = k10;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = k10;
                        }
                    }
                }
                U4(aVar2, pageBlock, i10, i11, z10, z11);
            }
        }
    }

    public final a Y1(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.f2955w4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i11 = indexOf + i10) >= 0 && i11 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i11);
            if (aVar2.f2833t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final void Y2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q6) {
                q6 q6Var = (q6) childAt;
                q6Var.f3303f.J();
                q6Var.h.J();
            } else if (childAt instanceof o0) {
                ((o0) childAt).getCaptionEditText().J();
            } else if (childAt instanceof y0) {
                ((y0) childAt).getEditText().J();
            }
        }
    }

    public final void Y3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f2946s3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f2824k.isEmpty() && q6.p(aVar.f2818b)) {
                    long a2 = r0.a();
                    TL_iv.RichText k10 = q6.k(aVar.f2818b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        this.f2948t3.put(Long.valueOf(a2), k10);
                    }
                    aVar.f2824k.add(Long.valueOf(a2));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f2818b.text;
                    aVar.f2818b = pageblockparagraph;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void Y4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = a5();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        X4(aVar2, pageBlock, aVar2.f2819c, aVar2.d, aVar2.e, aVar2.f2820f);
    }

    public final boolean Z1(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.Z1(int, int, int, int, java.lang.String[]):boolean");
    }

    public final boolean Z3(bi.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.Z3(bi.a, boolean):boolean");
    }

    public final void Z4(a aVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        d4 d4Var;
        TL_iv.PageBlock pageBlock;
        if (aVar == null) {
            aVar = a5();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            X4(aVar2, aVar2.f2818b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f2819c);
        if (i10 == 2) {
            i11 = Math.max(1, aVar2.d);
        } else {
            i11 = 0;
        }
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_iv.PageBlock pageBlock2 = aVar2.f2818b;
        if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
            pageBlock2 = new TL_iv.pageBlockParagraph();
        }
        if (z10 && aVar2.f2820f) {
            z11 = true;
            pageBlock = pageBlock2;
            d4Var = this;
        } else {
            z11 = false;
            d4Var = this;
            pageBlock = pageBlock2;
        }
        d4Var.X4(aVar2, pageBlock, max, i11, z10, z11);
    }

    public final void a2() {
        q6 q6Var;
        a aVar;
        n6 n6Var;
        this.f30819f3.T();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof q6) && (aVar = (q6Var = (q6) childAt).f3309y) != null && (n6Var = q6Var.D) != null) {
                q6Var.f(aVar, n6Var, q6Var.E);
            }
        }
    }

    public final void a4() {
        int length;
        int D;
        int B;
        int length2;
        int D2;
        int B2;
        int length3;
        int D3;
        int B3;
        int length4;
        int D4;
        int B4;
        n1 Q4;
        int length5;
        int D5;
        int B5;
        boolean O3 = O3();
        q3 q3Var = this.f2950u3;
        if (O3) {
            int i10 = q3Var.f22186p0;
            int i11 = q3Var.f22187q0;
            if (i11 == q3Var.f22190t0 && (Q4 = Q4(i10, i11)) != null && (D5 = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length5 = Q4.length()), 0)) < (B5 = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length5, 0))) {
                o2 o2Var = this.Q3;
                if (o2Var != null) {
                    o2Var.d();
                }
                if (s6.h(Q4.getText(), D5, B5)) {
                    s6.n(Q4.getText(), D5, B5);
                    Q4.f();
                    j4(i10, i11);
                    o2 o2Var2 = this.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                    r4();
                }
                Q4.O1 = D5;
                Q4.P1 = B5;
                Q4.B();
            }
        } else if (B3()) {
            int i12 = q3Var.f22186p0;
            n1 L2 = L2(i12);
            if (L2 != null && (D4 = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length4 = L2.length()), 0)) < (B4 = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length4, 0))) {
                o2 o2Var3 = this.Q3;
                if (o2Var3 != null) {
                    o2Var3.d();
                }
                if (s6.h(L2.getText(), D4, B4)) {
                    s6.n(L2.getText(), D4, B4);
                    L2.f();
                    h4(i12);
                    o2 o2Var4 = this.Q3;
                    if (o2Var4 != null) {
                        o2Var4.h();
                    }
                    r4();
                }
                L2.O1 = D4;
                L2.P1 = B4;
                L2.B();
            }
        } else if (z3()) {
            int i13 = q3Var.f22186p0;
            n1 v22 = v2(i13);
            if (v22 != null && (D3 = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length3 = v22.length()), 0)) < (B3 = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length3, 0))) {
                o2 o2Var5 = this.Q3;
                if (o2Var5 != null) {
                    o2Var5.d();
                }
                if (s6.h(v22.getText(), D3, B3)) {
                    s6.n(v22.getText(), D3, B3);
                    v22.f();
                    g4(i13);
                    o2 o2Var6 = this.Q3;
                    if (o2Var6 != null) {
                        o2Var6.h();
                    }
                    r4();
                }
                v22.O1 = D3;
                v22.P1 = B3;
                v22.B();
            }
        } else if (J3()) {
            int i14 = q3Var.f22186p0;
            n1 m42 = m4(i14);
            if (m42 != null && (D2 = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length2 = m42.length()), 0)) < (B2 = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length2, 0))) {
                o2 o2Var7 = this.Q3;
                if (o2Var7 != null) {
                    o2Var7.d();
                }
                if (s6.h(m42.getText(), D2, B2)) {
                    s6.n(m42.getText(), D2, B2);
                    m42.f();
                    i4(i14);
                    o2 o2Var8 = this.Q3;
                    if (o2Var8 != null) {
                        o2Var8.h();
                    }
                    r4();
                }
                m42.O1 = D2;
                m42.P1 = B2;
                m42.B();
            }
        } else {
            q6 J4 = J4();
            if (J4 == null || (D = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length = J4.getEditText().length()), 0)) >= (B = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length, 0))) {
                return;
            }
            o2 o2Var9 = this.Q3;
            if (o2Var9 != null) {
                o2Var9.d();
            }
            if (s6.h(J4.getEditText().getText(), D, B)) {
                s6.n(J4.getEditText().getText(), D, B);
                J4.getEditText().f();
                J4.x();
                o2 o2Var10 = this.Q3;
                if (o2Var10 != null) {
                    o2Var10.h();
                }
                r4();
            }
            n1 editText = J4.getEditText();
            editText.O1 = D;
            editText.P1 = B;
            J4.getEditText().B();
        }
    }

    public final a a5() {
        q3 q3Var;
        int i10;
        a T2 = T2();
        if (T2 == null && (q3Var = this.f2950u3) != null && q3Var.x() && (i10 = q3Var.f22186p0) == q3Var.f22189s0) {
            return B4(i10);
        }
        return T2;
    }

    public final boolean b2(int i10, int i11) {
        q3 q3Var;
        ArrayList arrayList = this.U3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] R3 = R3(max);
            int[] R32 = R3(max2);
            a aVar = (a) this.U3.get(R3[0]);
            if (R3[0] != R32[0] && max != max2) {
                View C1 = C1(aVar);
                View C12 = C1(this.U3.get(R32[0]));
                if ((C1 instanceof q6) && (C12 instanceof q6)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f2946s3;
                        int size = arrayList2.size();
                        q3Var = this.f2950u3;
                        if (i12 >= size) {
                            break;
                        }
                        q3Var.X(i12, q6.z(((a) arrayList2.get(i12)).f2818b));
                        i12++;
                    }
                    q6 q6Var = (q6) C1;
                    int length = q6Var.getEditText().length();
                    if (R3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!q3Var.j0(q6Var, 0, R3[1], length)) {
                        q6Var.B();
                        return true;
                    }
                    q3Var.b0(0, R32[1], (q6) C12);
                    return true;
                }
            } else {
                View C13 = C1(aVar);
                if (C13 instanceof q6) {
                    q6 q6Var2 = (q6) C13;
                    q6Var2.B();
                    n1 editText = q6Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(R3[1], length2), Math.min(R32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList b3(int i10, int i11, int i12, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z11;
        d4 d4Var;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.f2946s3;
            a aVar = (a) arrayList2.get(i15);
            boolean z12 = aVar.f2822i;
            ArrayList arrayList3 = aVar.f2824k;
            if (z12) {
                i15++;
            } else if (arrayList3.size() > i12) {
                Long l4 = (Long) arrayList3.get(i12);
                long longValue = l4.longValue();
                int i16 = i15 + 1;
                while (i16 < i11) {
                    a aVar2 = (a) arrayList2.get(i16);
                    if (aVar2.f2824k.size() <= i12 || ((Long) aVar2.f2824k.get(i12)).longValue() != longValue) {
                        break;
                    }
                    i16++;
                }
                ArrayList<TL_iv.PageBlock> b32 = b3(i15, i16, i12 + 1, true);
                if (b32.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f2948t3.get(l4);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (b32.size() == 1 && (b32.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        if (b32.get(0).text != null) {
                            textempty = b32.get(0).text;
                        } else {
                            textempty = new TL_iv.textEmpty();
                        }
                        pageblockblockquote.text = textempty;
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = b32;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i15 = i16;
            } else if (A3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f2818b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int S3 = S3(i15);
                pageblockdetails.blocks = b3(i15 + 1, Math.min(S3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = S3 + 1;
            } else {
                int i17 = aVar.f2819c;
                if (i17 <= 0) {
                    M2(aVar, arrayList);
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    int[] iArr = {i15};
                    if (aVar.d > 0) {
                        z11 = true;
                        i13 = i11;
                        i14 = i12;
                        d4Var = this;
                    } else {
                        z11 = false;
                        d4Var = this;
                        i13 = i11;
                        i14 = i12;
                    }
                    TL_iv.PageBlock n22 = d4Var.n2(i15, i17, i13, i14, z11, iArr);
                    if (n22 != null) {
                        arrayList.add(n22);
                    }
                    int i18 = iArr[0];
                    if (i18 <= 0) {
                        i15 = i13;
                    } else {
                        i15 = i18;
                    }
                }
                i11 = i13;
                i12 = i14;
            }
        }
        if (!z10) {
            while (!arrayList.isEmpty() && C3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && C3((TL_iv.PageBlock) i0.a.g(1, arrayList))) {
                a1.g.x(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void b4(int i10) {
        int i11;
        o2 o2Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        SpannableStringBuilder spannableStringBuilder;
        int i15;
        int length;
        int D;
        int B;
        boolean z11;
        int i16;
        int length2;
        int D2;
        int B2;
        boolean z12;
        int i17;
        int length3;
        int D3;
        int B3;
        boolean z13;
        int i18;
        o2 o2Var2;
        int i19;
        int i20;
        int i21;
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x()) {
            boolean O3 = O3();
            b4 b4Var = this.f2938o3;
            int i22 = 0;
            if (O3) {
                int i23 = q3Var.f22186p0;
                int i24 = q3Var.f22187q0;
                int i25 = q3Var.f22190t0;
                int i26 = q3Var.f22188r0;
                int i27 = q3Var.f22191u0;
                boolean N3 = N3(i10, i23, i24, i26, i25, i27);
                if (!N3) {
                    i18 = z2(i10);
                } else {
                    i18 = 0;
                }
                o2 o2Var3 = this.Q3;
                if (o2Var3 != null) {
                    o2Var3.d();
                }
                this.P3 = true;
                int i28 = i24;
                boolean z14 = false;
                while (i28 <= i25) {
                    n1 Q4 = Q4(i23, i28);
                    if (Q4 == null) {
                        i21 = i24;
                    } else {
                        int length4 = Q4.length();
                        if (i28 == i24) {
                            i19 = i26;
                        } else {
                            i19 = 0;
                        }
                        if (i28 == i25) {
                            i20 = i27;
                        } else {
                            i20 = length4;
                        }
                        if (i24 == i25) {
                            i19 = Math.min(i26, i27);
                            i20 = Math.max(i26, i27);
                        }
                        int i29 = i19;
                        i21 = i24;
                        int max = Math.max(0, Math.min(i29, length4));
                        int max2 = Math.max(0, Math.min(i20, length4));
                        if (max < max2) {
                            if (!N3) {
                                if (i18 != 0) {
                                    Q4.b(i18, max, max2);
                                }
                                Q4.a(i10, max, max2);
                            } else {
                                Q4.b(i10, max, max2);
                            }
                            Q4.f();
                            Q4.requestLayout();
                            j4(i23, i28);
                            z14 = true;
                        }
                    }
                    i28++;
                    i24 = i21;
                }
                this.P3 = false;
                if (z14 && (o2Var2 = this.Q3) != null) {
                    o2Var2.h();
                }
                b4Var.r();
                if (z14) {
                    r4();
                }
            } else if (B3()) {
                int i30 = q3Var.f22186p0;
                n1 L2 = L2(i30);
                if (L2 != null && (D3 = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length3 = L2.length()), 0)) < (B3 = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length3, 0))) {
                    if ((L2.c(D3, B3) & i10) == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    o2 o2Var4 = this.Q3;
                    if (o2Var4 != null) {
                        o2Var4.d();
                    }
                    this.P3 = true;
                    if (z13) {
                        int z22 = z2(i10);
                        if (z22 != 0) {
                            L2.b(z22, D3, B3);
                        }
                        L2.a(i10, D3, B3);
                    } else {
                        L2.b(i10, D3, B3);
                    }
                    this.P3 = false;
                    h4(i30);
                    L2.f();
                    L2.requestLayout();
                    o2 o2Var5 = this.Q3;
                    if (o2Var5 != null) {
                        o2Var5.h();
                    }
                    b4Var.r();
                    r4();
                }
            } else if (z3()) {
                int i31 = q3Var.f22186p0;
                n1 v22 = v2(i31);
                if (v22 != null && (D2 = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length2 = v22.length()), 0)) < (B2 = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length2, 0))) {
                    if ((v22.c(D2, B2) & i10) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i17 = z2(i10);
                    } else {
                        i17 = 0;
                    }
                    o2 o2Var6 = this.Q3;
                    if (o2Var6 != null) {
                        o2Var6.d();
                    }
                    this.P3 = true;
                    if (z12) {
                        if (i17 != 0) {
                            v22.b(i17, D2, B2);
                        }
                        v22.a(i10, D2, B2);
                    } else {
                        v22.b(i10, D2, B2);
                    }
                    v22.f();
                    v22.requestLayout();
                    g4(i31);
                    this.P3 = false;
                    o2 o2Var7 = this.Q3;
                    if (o2Var7 != null) {
                        o2Var7.h();
                    }
                    b4Var.r();
                    r4();
                }
            } else if (J3()) {
                int i32 = q3Var.f22186p0;
                n1 m42 = m4(i32);
                if (m42 != null && (D = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length = m42.length()), 0)) < (B = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length, 0))) {
                    if ((m42.c(D, B) & i10) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i16 = z2(i10);
                    } else {
                        i16 = 0;
                    }
                    o2 o2Var8 = this.Q3;
                    if (o2Var8 != null) {
                        o2Var8.d();
                    }
                    this.P3 = true;
                    if (z11) {
                        if (i16 != 0) {
                            m42.b(i16, D, B);
                        }
                        m42.a(i10, D, B);
                    } else {
                        m42.b(i10, D, B);
                    }
                    m42.f();
                    m42.requestLayout();
                    i4(i32);
                    this.P3 = false;
                    o2 o2Var9 = this.Q3;
                    if (o2Var9 != null) {
                        o2Var9.h();
                    }
                    b4Var.r();
                    r4();
                }
            } else {
                int i33 = q3Var.f22186p0;
                int i34 = q3Var.f22189s0;
                int i35 = q3Var.f22188r0;
                int i36 = q3Var.f22191u0;
                if (i33 >= 0 && i34 >= 0 && i34 >= i33 && i34 < this.f2955w4.size()) {
                    int i37 = i10;
                    boolean M3 = M3(i37, i33, i35, i34, i36);
                    boolean z15 = !M3;
                    if (!M3) {
                        i11 = z2(i37);
                    } else {
                        i11 = 0;
                    }
                    o2 o2Var10 = this.Q3;
                    if (o2Var10 != null) {
                        o2Var10.d();
                    }
                    this.P3 = true;
                    int i38 = i33;
                    boolean z16 = false;
                    while (i38 <= i34) {
                        a B4 = B4(i38);
                        if (B4 != null) {
                            TL_iv.PageBlock pageBlock = B4.f2818b;
                            if (D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int l22 = l2(i38);
                                if (i38 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = i22;
                                }
                                z10 = z16;
                                if (i38 == i34) {
                                    i14 = i36;
                                } else {
                                    i14 = l22;
                                }
                                int max3 = Math.max(i22, Math.min(i13, l22));
                                int max4 = Math.max(i22, Math.min(i14, l22));
                                if (max3 >= max4) {
                                    i12 = i11;
                                    z16 = z10;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                } else {
                                    q6 x22 = x2(i38);
                                    if (x22 != null) {
                                        org.telegram.ui.ActionBar.r4 styleDelegate = x22.getStyleDelegate();
                                        if (!M3) {
                                            if (i11 != 0) {
                                                styleDelegate.b(i11, max3, max4);
                                            }
                                            styleDelegate.a(i37, max3, max4);
                                        } else {
                                            styleDelegate.b(i37, max3, max4);
                                        }
                                        x22.getEditText().f();
                                        x22.getEditText().requestLayout();
                                        x22.x();
                                        i12 = i11;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(q6.A(B4.f2818b));
                                        if (!M3 && i11 != 0) {
                                            i12 = i11;
                                            i15 = max3;
                                            s6.o(spannableStringBuilder2, i15, max4, i12, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i12 = i11;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i15 = max3;
                                        }
                                        s6.o(spannableStringBuilder, i15, max4, i37, z15, null);
                                        q6.d(B4.f2818b, spannableStringBuilder);
                                    }
                                    z16 = true;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                }
                            }
                        }
                        i12 = i11;
                        z10 = z16;
                        z16 = z10;
                        i38++;
                        i37 = i10;
                        i11 = i12;
                        i22 = 0;
                    }
                    boolean z17 = z16;
                    this.P3 = i22;
                    if (z17 && (o2Var = this.Q3) != null) {
                        o2Var.h();
                    }
                    b4Var.r();
                    if (z17) {
                        r4();
                    }
                }
            }
        }
    }

    public final void b5(float f7, float f10) {
        TL_iv.pageTableCell o10;
        z5 z5Var = this.f2941p4;
        if (this.I3 && z5Var != null && this.E3 == z5Var && (o10 = z5Var.o((int) ((f7 - z5Var.getLeft()) - getLeft()), (int) ((f10 - z5Var.getTop()) - getTop()))) != null && o10 != this.L3) {
            this.L3 = o10;
            z5Var.y(this.K3, o10);
        }
    }

    public final ArrayList c3() {
        return b3(0, this.f2946s3.size(), 0, false);
    }

    public final void c4(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.c4(android.view.View):void");
    }

    public final void c5(a aVar, String str) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f2818b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    o2 o2Var = this.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    q6 x22 = x2(this.f2946s3.indexOf(aVar));
                    if (x22 != null && (aVar2 = x22.f3309y) != null) {
                        x22.J(aVar2.f2818b, true);
                        x22.H = null;
                        x22.C();
                    }
                    o2 o2Var2 = this.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                }
            }
        }
    }

    public final void d2() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            ArrayList arrayList6 = this.f2946s3;
            if (i18 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i18);
                ArrayList arrayList7 = aVar.f2823j;
                ArrayList arrayList8 = aVar.f2824k;
                arrayList7.clear();
                int i19 = 1;
                if (aVar.f2822i) {
                    if (!arrayList.isEmpty()) {
                        a1.g.x(1, arrayList);
                    }
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                    i16 = i17;
                } else {
                    for (int i20 = i17; i20 < arrayList8.size(); i20++) {
                        ((Long) arrayList8.get(i20)).getClass();
                        arrayList7.add(new Object());
                    }
                    for (int i21 = i17; i21 < arrayList.size(); i21++) {
                        arrayList7.add((r0) arrayList.get(i21));
                    }
                    int max = Math.max(i17, aVar.f2819c);
                    if (max == 0) {
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    } else {
                        if (aVar.d > 0) {
                            i10 = 1;
                        } else {
                            i10 = i17;
                        }
                        while (arrayList2.size() > max) {
                            arrayList2.remove(arrayList2.size() - 1);
                            arrayList3.remove(arrayList3.size() - 1);
                            arrayList4.remove(arrayList4.size() - 1);
                            arrayList5.remove(arrayList5.size() - 1);
                        }
                        int i22 = 1;
                        while (i22 <= max) {
                            int i23 = i22 - 1;
                            if (i22 == max) {
                                i12 = i17;
                                i11 = i19;
                            } else {
                                i11 = i17;
                                i12 = i11;
                            }
                            if (i23 < arrayList2.size()) {
                                i13 = i19;
                            } else {
                                i13 = i12;
                            }
                            if (i13 != 0 && i11 != 0) {
                                i14 = i19;
                                if (((Boolean) arrayList3.get(i23)).booleanValue() != i10) {
                                    i13 = i12;
                                }
                            } else {
                                i14 = i19;
                            }
                            if (i13 == 0) {
                                while (arrayList2.size() > i23) {
                                    arrayList2.remove(arrayList2.size() - 1);
                                    arrayList3.remove(arrayList3.size() - 1);
                                    arrayList4.remove(arrayList4.size() - 1);
                                    arrayList5.remove(arrayList5.size() - 1);
                                }
                                arrayList2.add(Long.valueOf(r0.a()));
                                if (i11 != 0) {
                                    z10 = i10;
                                } else {
                                    z10 = i12;
                                }
                                arrayList3.add(Boolean.valueOf(z10));
                                arrayList4.add(Integer.valueOf(i12));
                                arrayList5.add(0L);
                            }
                            ((Long) arrayList2.get(i23)).getClass();
                            if (i11 != 0) {
                                if (((Long) arrayList5.get(i23)).longValue() != 0 && H3(aVar.f2818b)) {
                                    i15 = i12;
                                } else {
                                    i15 = i14;
                                }
                                if (i15 != 0) {
                                    arrayList4.set(i23, Integer.valueOf(((Integer) arrayList4.get(i23)).intValue() + 1));
                                    arrayList5.set(i23, Long.valueOf(aVar.f2817a));
                                } else {
                                    ((Integer) arrayList4.get(i23)).getClass();
                                    ((Long) arrayList5.get(i23)).getClass();
                                }
                                arrayList7.add(new Object());
                            } else {
                                ((Boolean) arrayList3.get(i23)).getClass();
                                arrayList7.add(new Object());
                            }
                            i22++;
                            i17 = i12;
                            i19 = i14;
                        }
                    }
                    i16 = i17;
                    if (A3(aVar)) {
                        boolean z11 = ((TL_iv.pageBlockDetails) aVar.f2818b).open;
                        r0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (q6.p(aVar.f2818b)) {
                        r0.a();
                        arrayList7.add(new Object());
                    }
                }
                i18++;
                i17 = i16;
            } else {
                return;
            }
        }
    }

    public final boolean d3() {
        a aVar;
        ArrayList arrayList = this.f2946s3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) i0.a.g(1, arrayList);
        }
        if (aVar != null && !H3(aVar.f2818b) && !aVar.f2822i && !A3(aVar) && !N2(aVar.f2818b)) {
            if (!(C1(aVar) instanceof q6)) {
                return false;
            }
            h3(aVar);
            return true;
        }
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.f30819f3.O(false);
        o2 o2Var2 = this.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        post(new v2(this, aVar2, 21));
        return true;
    }

    public final void d4() {
        int length;
        int D;
        int B;
        int length2;
        int D2;
        int B2;
        int length3;
        int D3;
        int B3;
        int length4;
        int D4;
        int B4;
        n1 Q4;
        int length5;
        int D5;
        int B5;
        boolean O3 = O3();
        b4 b4Var = this.f2938o3;
        q3 q3Var = this.f2950u3;
        if (O3) {
            int i10 = q3Var.f22186p0;
            int i11 = q3Var.f22187q0;
            if (i11 == q3Var.f22190t0 && (Q4 = Q4(i10, i11)) != null && (D5 = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length5 = Q4.length()), 0)) < (B5 = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length5, 0))) {
                if (s6.h(Q4.getText(), D5, B5)) {
                    o2 o2Var = this.Q3;
                    if (o2Var != null) {
                        o2Var.d();
                    }
                    s6.n(Q4.getText(), D5, B5);
                    Q4.f();
                    j4(i10, i11);
                    o2 o2Var2 = this.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                    b4Var.r();
                    r4();
                    return;
                }
                o2 o2Var3 = this.Q3;
                if (o2Var3 != null) {
                    o2Var3.d();
                }
                if (s6.g(Q4.getText(), D5, B5)) {
                    s6.m(Q4.getText(), D5, B5);
                    Q4.f();
                    j4(i10, i11);
                    o2 o2Var4 = this.Q3;
                    if (o2Var4 != null) {
                        o2Var4.h();
                    }
                    r4();
                }
                Q4.O1 = D5;
                Q4.P1 = B5;
                r3(false);
                H4(Q4);
            }
        } else if (B3()) {
            int i12 = q3Var.f22186p0;
            n1 L2 = L2(i12);
            if (L2 != null && (D4 = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length4 = L2.length()), 0)) < (B4 = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length4, 0))) {
                if (s6.h(L2.getText(), D4, B4)) {
                    o2 o2Var5 = this.Q3;
                    if (o2Var5 != null) {
                        o2Var5.d();
                    }
                    s6.n(L2.getText(), D4, B4);
                    L2.f();
                    h4(i12);
                    o2 o2Var6 = this.Q3;
                    if (o2Var6 != null) {
                        o2Var6.h();
                    }
                    b4Var.r();
                    r4();
                    return;
                }
                o2 o2Var7 = this.Q3;
                if (o2Var7 != null) {
                    o2Var7.d();
                }
                if (s6.g(L2.getText(), D4, B4)) {
                    s6.m(L2.getText(), D4, B4);
                    L2.f();
                    h4(i12);
                    o2 o2Var8 = this.Q3;
                    if (o2Var8 != null) {
                        o2Var8.h();
                    }
                    r4();
                }
                L2.O1 = D4;
                L2.P1 = B4;
                r3(false);
                H4(L2);
            }
        } else if (z3()) {
            int i13 = q3Var.f22186p0;
            n1 v22 = v2(i13);
            if (v22 != null && (D3 = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length3 = v22.length()), 0)) < (B3 = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length3, 0))) {
                if (s6.h(v22.getText(), D3, B3)) {
                    o2 o2Var9 = this.Q3;
                    if (o2Var9 != null) {
                        o2Var9.d();
                    }
                    s6.n(v22.getText(), D3, B3);
                    v22.f();
                    g4(i13);
                    o2 o2Var10 = this.Q3;
                    if (o2Var10 != null) {
                        o2Var10.h();
                    }
                    b4Var.r();
                    r4();
                    return;
                }
                o2 o2Var11 = this.Q3;
                if (o2Var11 != null) {
                    o2Var11.d();
                }
                if (s6.g(v22.getText(), D3, B3)) {
                    s6.m(v22.getText(), D3, B3);
                    v22.f();
                    g4(i13);
                    o2 o2Var12 = this.Q3;
                    if (o2Var12 != null) {
                        o2Var12.h();
                    }
                    r4();
                }
                v22.O1 = D3;
                v22.P1 = B3;
                r3(false);
                H4(v22);
            }
        } else if (J3()) {
            int i14 = q3Var.f22186p0;
            n1 m42 = m4(i14);
            if (m42 != null && (D2 = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length2 = m42.length()), 0)) < (B2 = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length2, 0))) {
                if (s6.h(m42.getText(), D2, B2)) {
                    o2 o2Var13 = this.Q3;
                    if (o2Var13 != null) {
                        o2Var13.d();
                    }
                    s6.n(m42.getText(), D2, B2);
                    m42.f();
                    i4(i14);
                    o2 o2Var14 = this.Q3;
                    if (o2Var14 != null) {
                        o2Var14.h();
                    }
                    b4Var.r();
                    r4();
                    return;
                }
                o2 o2Var15 = this.Q3;
                if (o2Var15 != null) {
                    o2Var15.d();
                }
                if (s6.g(m42.getText(), D2, B2)) {
                    s6.m(m42.getText(), D2, B2);
                    m42.f();
                    i4(i14);
                    o2 o2Var16 = this.Q3;
                    if (o2Var16 != null) {
                        o2Var16.h();
                    }
                    r4();
                }
                m42.O1 = D2;
                m42.P1 = B2;
                r3(false);
                H4(m42);
            }
        } else {
            q6 J4 = J4();
            if (J4 == null || (D = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length = J4.getEditText().length()), 0)) >= (B = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length, 0))) {
                return;
            }
            if (s6.h(J4.getEditText().getText(), D, B)) {
                o2 o2Var17 = this.Q3;
                if (o2Var17 != null) {
                    o2Var17.d();
                }
                s6.n(J4.getEditText().getText(), D, B);
                J4.getEditText().f();
                J4.x();
                o2 o2Var18 = this.Q3;
                if (o2Var18 != null) {
                    o2Var18.h();
                }
                b4Var.r();
                r4();
                return;
            }
            o2 o2Var19 = this.Q3;
            if (o2Var19 != null) {
                o2Var19.d();
            }
            if (s6.g(J4.getEditText().getText(), D, B)) {
                s6.m(J4.getEditText().getText(), D, B);
                J4.getEditText().f();
                J4.x();
                o2 o2Var20 = this.Q3;
                if (o2Var20 != null) {
                    o2Var20.h();
                }
                r4();
            }
            n1 editText = J4.getEditText();
            editText.O1 = D;
            editText.P1 = B;
            r3(false);
            H4(J4.getEditText());
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        Long l4;
        a aVar;
        View view;
        Long l10;
        int i11;
        int i12;
        ArrayList arrayList2;
        a aVar2;
        a aVar3;
        float f7;
        a aVar4;
        boolean z10;
        a aVar5;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                arrayList = this.f2955w4;
                if (i13 >= childCount) {
                    break;
                }
                int R = RecyclerView.R(getChildAt(i13));
                if (R >= 0 && R < arrayList.size()) {
                    aVar5 = (a) arrayList.get(R);
                } else {
                    aVar5 = null;
                }
                if (aVar5 != null) {
                    ArrayList arrayList3 = aVar5.f2824k;
                    if (arrayList3.size() > i14) {
                        i14 = arrayList3.size();
                    }
                }
                i13++;
            }
            if (i14 != 0) {
                if (this.f2957x4 == null) {
                    dl0 dl0Var = new dl0(this);
                    this.f2957x4 = dl0Var;
                    dl0Var.a(null, null, null, this.f2936n3, 1);
                    v7.a5.a(this.f2957x4, this.f2936n3);
                }
                int i15 = 0;
                while (i15 < i14) {
                    float f10 = 0.0f;
                    long j10 = 0;
                    int i16 = 0;
                    boolean z11 = false;
                    a aVar6 = null;
                    a aVar7 = null;
                    float f11 = 1.0f;
                    float f12 = 0.0f;
                    while (i16 <= childCount) {
                        if (i16 < childCount) {
                            View childAt = getChildAt(i16);
                            int R2 = RecyclerView.R(childAt);
                            if (R2 >= 0 && R2 < arrayList.size()) {
                                aVar = (a) arrayList.get(R2);
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                ArrayList arrayList4 = aVar.f2824k;
                                if (i15 < arrayList4.size()) {
                                    l4 = (Long) arrayList4.get(i15);
                                    i10 = childCount;
                                    view = childAt;
                                }
                            }
                            i10 = childCount;
                            view = childAt;
                            l4 = null;
                        } else {
                            i10 = childCount;
                            l4 = null;
                            aVar = null;
                            view = null;
                        }
                        if (!z11 || (l4 != null && l4.longValue() == j10)) {
                            l10 = l4;
                            i11 = i15;
                            i12 = i14;
                            arrayList2 = arrayList;
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                            f7 = f11;
                        } else {
                            int n42 = n4(i15, aVar6, true);
                            l10 = l4;
                            int n43 = n4(i15, aVar7, false);
                            if (f12 - f10 <= org.telegram.messenger.i0.L(4.0f)) {
                                i11 = i15;
                                i12 = i14;
                                arrayList2 = arrayList;
                            } else {
                                int L = org.telegram.messenger.i0.L(16.0f) * i15;
                                i11 = i15;
                                int L2 = org.telegram.messenger.i0.L(16.0f) + L;
                                i12 = i14;
                                arrayList2 = arrayList;
                                int z12 = org.telegram.messenger.m5.z(16.0f, getWidth(), L);
                                if (z12 - L2 > org.telegram.messenger.i0.L(8.0f)) {
                                    float floor = (float) Math.floor(tz.Y0 / 3.0f);
                                    RectF rectF = org.telegram.messenger.i0.P;
                                    rectF.set(L2, n42 + f10, z12, f12 - n43);
                                    aVar2 = aVar6;
                                    aVar3 = aVar7;
                                    this.f2957x4.c(floor, floor, floor, f11, canvas, rectF);
                                    f7 = f11;
                                    this.f2957x4.f(canvas, rectF, f7);
                                    z11 = false;
                                }
                            }
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                            f7 = f11;
                            z11 = false;
                        }
                        if (view != null && l10 != null) {
                            if (!z11) {
                                j10 = l10.longValue();
                                f10 = Float.MAX_VALUE;
                                f12 = -3.4028235E38f;
                                aVar4 = aVar;
                                z10 = true;
                                f7 = 1.0f;
                            } else {
                                aVar4 = aVar2;
                                z10 = z11;
                            }
                            if (aVar != null && aVar == this.Z3) {
                                z11 = z10;
                                f11 = f7;
                            } else {
                                float y3 = view.getY();
                                float height = view.getHeight() + y3;
                                if (y3 < f10) {
                                    f10 = y3;
                                }
                                if (height > f12) {
                                    f12 = height;
                                }
                                f11 = Math.min(f7, view.getAlpha());
                                z11 = z10;
                            }
                            aVar7 = aVar;
                        } else {
                            aVar7 = aVar3;
                            f11 = f7;
                            aVar4 = aVar2;
                        }
                        i16++;
                        aVar6 = aVar4;
                        childCount = i10;
                        i15 = i11;
                        i14 = i12;
                        arrayList = arrayList2;
                    }
                    i15++;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e2(jj jjVar) {
        TLRPC.Document F0;
        String str;
        if (jjVar != null && (F0 = jjVar.F0()) != null) {
            o2 o2Var = this.Q3;
            if (o2Var != null) {
                o2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z10 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            w wVar = new w();
            aVar.f2821g = wVar;
            wVar.f3418c = true;
            long j10 = F0.f19799id;
            if (j10 == 0 || F0.dc_id == 0 || F0.access_hash == 0) {
                z10 = true;
            }
            if (z10) {
                TLRPC.Message message = jjVar.f16337k;
                if (message != null) {
                    str = message.attachPath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                w wVar2 = aVar.f2821g;
                wVar2.f3421i = F0;
                wVar2.e = str;
                wVar2.f3416a = 1;
                wVar2.f3419f = 0.0f;
            } else {
                wVar.h = F0;
                wVar.f3421i = F0;
                wVar.f3416a = 2;
                pageblockaudio.audio_id = j10;
            }
            x3(aVar);
            if (z10) {
                w wVar3 = aVar.f2821g;
                String str2 = wVar3.e;
                IdentityHashMap identityHashMap = this.f2929g4;
                l5 l5Var = (l5) identityHashMap.remove(wVar3);
                if (l5Var != null) {
                    l5Var.b();
                }
                l5 l5Var2 = new l5(this.f2934m3, str2, F0, new o3(aVar, wVar3, this));
                identityHashMap.put(wVar3, l5Var2);
                l5Var2.d();
            }
            o2 o2Var2 = this.Q3;
            if (o2Var2 != null) {
                o2Var2.h();
            }
            this.f2938o3.onContentChanged();
        }
    }

    public final void e3(a aVar, boolean z10) {
        int i10;
        View C1 = C1(aVar);
        if (C1 instanceof r5) {
            n1 n1Var = ((r5) C1).f3326r;
            n1Var.N();
            if (z10) {
                i10 = n1Var.length();
            } else {
                i10 = 0;
            }
            n1Var.setSelection(i10);
            return;
        }
        f3(aVar, z10);
    }

    public final void e4() {
        n1 editText;
        Runnable r2Var;
        int length;
        final int D;
        final int B;
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x()) {
            if (O3()) {
                int i10 = q3Var.f22186p0;
                int i11 = q3Var.f22187q0;
                if (i11 == q3Var.f22190t0) {
                    editText = Q4(i10, i11);
                    r2Var = new w2(this, i10, i11, 1);
                } else {
                    return;
                }
            } else if (B3()) {
                int i12 = q3Var.f22186p0;
                editText = L2(i12);
                r2Var = new q2(this, i12, 3);
            } else if (z3()) {
                int i13 = q3Var.f22186p0;
                editText = v2(i13);
                r2Var = new q2(this, i13, 0);
            } else if (J3()) {
                int i14 = q3Var.f22186p0;
                editText = m4(i14);
                r2Var = new q2(this, i14, 1);
            } else {
                q6 J4 = J4();
                if (J4 != null) {
                    editText = J4.getEditText();
                    r2Var = new r2(J4, 0);
                } else {
                    return;
                }
            }
            final n1 n1Var = editText;
            final Runnable runnable = r2Var;
            if (n1Var != null && (D = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length = n1Var.length()), 0)) <= (B = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length, 0))) {
                Editable text = n1Var.getText();
                int i15 = v.h;
                String str = null;
                if (text != null) {
                    v[] vVarArr = (v[]) text.getSpans(D, B, v.class);
                    if (vVarArr.length > 0) {
                        str = vVarArr[0].f3392a;
                    }
                }
                if (str == null) {
                    str = n1Var.getText().subSequence(D, B).toString();
                }
                final float L = org.telegram.messenger.i0.L(tz.W0 + 4);
                int i16 = org.telegram.ui.ActionBar.t6.G6;
                org.telegram.ui.ActionBar.p6 p6Var = this.f2936n3;
                final int w02 = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
                t.X(getContext(), str, new q20() {
                    @Override
                    public final void a(Object obj) {
                        v a2;
                        String str2 = (String) obj;
                        d4 d4Var = d4.this;
                        d4Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a2 = v.a(str2, w02, L)) == null) {
                            return;
                        }
                        o2 o2Var = d4Var.Q3;
                        if (o2Var != null) {
                            o2Var.d();
                        }
                        q3 q3Var2 = d4Var.f2950u3;
                        if (q3Var2 != null) {
                            q3Var2.f(false);
                        }
                        n1 n1Var2 = n1Var;
                        n1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        Editable text2 = n1Var2.getText();
                        int max = Math.max(0, Math.min(D, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(B, text2.length())), spannableString);
                        runnable.run();
                        o2 o2Var2 = d4Var.Q3;
                        if (o2Var2 != null) {
                            o2Var2.h();
                        }
                        d4Var.f2938o3.onContentChanged();
                        int min = Math.min(max + 1, n1Var2.length());
                        n1Var2.N();
                        d4Var.post(new d3(n1Var2, min, 3));
                    }
                }, p6Var);
            }
        }
    }

    public final void e5(java.lang.CharSequence r19) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.e5(java.lang.CharSequence):void");
    }

    public final void f2(String str) {
        String str2;
        int i10;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.f19799id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf >= 0 && (i10 = lastIndexOf + 1) < name.length()) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i10).toLowerCase());
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
            g2(tL_document, str);
        }
    }

    public final void f3(a aVar, boolean z10) {
        View C1 = C1(aVar);
        if (C1 instanceof z5) {
            z5 z5Var = (z5) C1;
            n1 n1Var = z5Var.f3481r;
            w6 w6Var = z5Var.F;
            if (w6Var != null) {
                if (!z10) {
                    n1Var.N();
                    n1Var.setSelection(0);
                    return;
                } else if (!w6Var.f3441g.isEmpty()) {
                    c6 m10 = z5Var.f3483w.m((TL_iv.pageTableCell) i0.a.g(1, z5Var.F.f3441g));
                    if (m10 != null) {
                        n1 n1Var2 = m10.f2905a;
                        n1Var2.N();
                        n1Var2.setSelection(n1Var2.length());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (z10 && (C1 instanceof q6)) {
            q6 q6Var = (q6) C1;
            if (q6Var.n()) {
                q6Var.i();
                return;
            }
        }
        n1 U3 = U3(C1);
        if (U3 == null) {
            g3(aVar);
            return;
        }
        U3.N();
        if (z10) {
            U3.setSelection(U3.length());
        }
    }

    public final void f4() {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.f4():void");
    }

    public final void g2(TLRPC.Document document, String str) {
        if (document != null) {
            o2 o2Var = this.Q3;
            if (o2Var != null) {
                o2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z10 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            w wVar = new w();
            aVar.f2821g = wVar;
            wVar.d = true;
            long j10 = document.f19799id;
            if (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) {
                z10 = true;
            }
            if (z10) {
                if (!TextUtils.isEmpty(str) && sc.e.x(str)) {
                    w wVar2 = aVar.f2821g;
                    wVar2.h = document;
                    wVar2.e = str;
                    wVar2.f3416a = 1;
                    wVar2.f3419f = 0.0f;
                } else {
                    return;
                }
            } else {
                wVar.h = document;
                wVar.f3416a = 2;
                pageblockdocument.document_id = j10;
            }
            x3(aVar);
            if (z10) {
                w wVar3 = aVar.f2821g;
                IdentityHashMap identityHashMap = this.f2929g4;
                l5 l5Var = (l5) identityHashMap.remove(wVar3);
                if (l5Var != null) {
                    l5Var.b();
                }
                l5 l5Var2 = new l5(this.f2934m3, str, document, new n3(this, wVar3, aVar, str));
                identityHashMap.put(wVar3, l5Var2);
                l5Var2.d();
            }
            o2 o2Var2 = this.Q3;
            if (o2Var2 != null) {
                o2Var2.h();
            }
            this.f2938o3.onContentChanged();
        }
    }

    public final void g3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof q6) {
            ((q6) C1).B();
        } else if (C1 instanceof y0) {
            ((y0) C1).d.N();
        }
    }

    public final void g4(int i10) {
        View D4 = D4(i10);
        if (D4 instanceof o0) {
            ((o0) D4).b();
        }
    }

    public n1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof n1) {
            return (n1) findFocus;
        }
        return null;
    }

    public w4 getMapDelegate() {
        return this.f2933k4;
    }

    public View getOverlayView() {
        return this.f2952v3;
    }

    public k9 getTextSelectionHelper() {
        return this.f2950u3;
    }

    public final void h2(Uri uri) {
        boolean contains;
        if (uri != null) {
            a aVar = this.f2931i4;
            String str = null;
            this.f2931i4 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e) {
                f8.g(e, true);
            }
            String str2 = str;
            if (str2 != null) {
                contains = str2.startsWith("video");
            } else {
                contains = uri.toString().contains("video");
            }
            boolean z10 = contains;
            int i10 = this.f2958y4;
            this.f2958y4 = i10 - 1;
            Utilities.e.c(new y2(this, uri, z10, str2, i10, aVar));
        }
    }

    public final void h3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof q6) {
            q6 q6Var = (q6) C1;
            q6Var.B();
            n1 editText = q6Var.getEditText();
            editText.setSelection(editText.length());
        } else if (C1 instanceof y0) {
            y0 y0Var = (y0) C1;
            y0Var.d.N();
            n1 editText2 = y0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void h4(int i10) {
        a B4 = B4(i10);
        n1 L2 = L2(i10);
        if (A3(B4) && L2 != null) {
            ((TL_iv.pageBlockDetails) B4.f2818b).title = s6.f(L2.getText());
        }
    }

    public final void i2(ef efVar) {
        TL_iv.PageBlock pageblockvideo;
        d4 d4Var;
        String str = efVar.h;
        if (str == null) {
            str = efVar.I;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        boolean c10 = h5.c(efVar);
        if (!efVar.f19507b && !c10) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        a aVar = new a(pageblockvideo, 0, 0);
        aVar.f2821g = W3(efVar, str2);
        x3(aVar);
        if (c10) {
            N4(aVar, aVar.f2821g, efVar);
            d4Var = this;
        } else {
            d4Var = this;
            d4Var.O4(aVar, aVar.f2821g, str2, efVar.f19507b, efVar.F, efVar.G, efVar.E);
        }
        o2 o2Var2 = d4Var.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        d4Var.f2938o3.onContentChanged();
    }

    public final void i3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof q6) {
            q6 q6Var = (q6) C1;
            q6Var.B();
            q6Var.getEditText().setSelection(0);
        } else if (C1 instanceof y0) {
            y0 y0Var = (y0) C1;
            y0Var.d.N();
            y0Var.getEditText().setSelection(0);
        }
    }

    public final void i4(int i10) {
        View D4 = D4(i10);
        if (D4 instanceof q6) {
            ((q6) D4).w();
        }
    }

    public final void j2(z5 z5Var) {
        z5 z5Var2 = this.f2941p4;
        if (z5Var2 != null && z5Var2 != z5Var) {
            LinkedHashSet linkedHashSet = z5Var2.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                z5Var2.f3483w.invalidate();
                z5Var2.v();
            }
        }
        this.f2941p4 = z5Var;
        this.J3 = false;
        this.f2947s4 = -1;
        this.f2945r4 = -1;
        z5Var.setCellSelectionListener(this.f2949t4);
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x()) {
            q3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void j4(int i10, int i11) {
        c6 m10;
        View D4 = D4(i10);
        if (D4 instanceof z5) {
            z5 z5Var = (z5) D4;
            if (i11 == 0) {
                z5Var.w();
                return;
            }
            TL_iv.pageTableCell g10 = z5Var.g(i11);
            if (g10 != null && (m10 = z5Var.getGrid().m(g10)) != null) {
                w6.d(g10, m10.f2905a.getText());
            }
        }
    }

    public final u3 k2() {
        int i10;
        int i11;
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x() && !J3()) {
            a B4 = B4(q3Var.f22186p0);
            ArrayList arrayList = this.f2946s3;
            int indexOf = arrayList.indexOf(B4);
            int indexOf2 = arrayList.indexOf(B4(q3Var.f22189s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                if (indexOf > indexOf2) {
                    i11 = indexOf;
                    i10 = indexOf2;
                } else {
                    i10 = indexOf;
                    i11 = indexOf2;
                }
                for (int i12 = i10; i12 <= i11; i12++) {
                    a aVar = (a) arrayList.get(i12);
                    if (aVar.f2822i || A3(aVar)) {
                        return null;
                    }
                }
                return new u3(this, i10, i11, q3Var.f22188r0, q3Var.f22191u0);
            }
            return null;
        }
        return null;
    }

    public final boolean k3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.k3(android.view.KeyEvent):boolean");
    }

    public final int l2(int i10) {
        n1 L2 = L2(i10);
        if (L2 != null) {
            return L2.length();
        }
        q6 x22 = x2(i10);
        if (x22 != null) {
            return x22.getEditText().length();
        }
        a B4 = B4(i10);
        if (B4 == null) {
            return 0;
        }
        return q6.z(B4.f2818b).length();
    }

    public final boolean l3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.l3(android.view.MotionEvent):boolean");
    }

    public final int l4(int i10) {
        Layout layout;
        View D4 = D4(i10);
        if (!(D4 instanceof q6) || (layout = ((q6) D4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage m2() {
        if (n3()) {
            ArrayList<TL_iv.PageBlock> c32 = c3();
            if (c32.isEmpty()) {
                return null;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = c32;
            richMessage.photos = E2();
            richMessage.documents = B2();
            return richMessage;
        }
        return null;
    }

    public final boolean m3(bi.z5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.m3(bi.z5, int, int):boolean");
    }

    public final n1 m4(int i10) {
        View D4 = D4(i10);
        if (D4 instanceof q6) {
            return ((q6) D4).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock n2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.n2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean n3() {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.n3():boolean");
    }

    public final boolean o2() {
        n1 editText;
        int length;
        int D;
        int B;
        u4[] u4VarArr;
        q3 q3Var = this.f2950u3;
        if (q3Var == null || !q3Var.x() || q3Var.f22186p0 != q3Var.f22189s0) {
            return false;
        }
        if (O3()) {
            int i10 = q3Var.f22186p0;
            int i11 = q3Var.f22187q0;
            if (i11 != q3Var.f22190t0) {
                return false;
            }
            editText = Q4(i10, i11);
        } else if (B3()) {
            editText = L2(q3Var.f22186p0);
        } else if (z3()) {
            editText = v2(q3Var.f22186p0);
        } else if (J3()) {
            editText = m4(q3Var.f22186p0);
        } else {
            q6 J4 = J4();
            if (J4 == null) {
                return false;
            }
            editText = J4.getEditText();
        }
        if (editText == null || (D = a1.g.D(q3Var.f22188r0, q3Var.f22191u0, (length = editText.length()), 0)) >= (B = a1.g.B(q3Var.f22188r0, q3Var.f22191u0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && D < B) {
            for (u4 u4Var : (u4[]) text.getSpans(D, B, u4.class)) {
                if (text.getSpanStart(u4Var) < B && text.getSpanEnd(u4Var) > D) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.T3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.T3);
        this.f30821h3 = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        View F;
        int i14 = i13 - i11;
        int i15 = this.R3;
        if (i15 > 0 && i14 < i15) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (z11) {
            View findFocus = findFocus();
            if (findFocus == null) {
                F = null;
            } else {
                F = F(findFocus);
            }
            if (F != null) {
                int L = (org.telegram.messenger.i0.L(8.0f) + F.getBottom()) - (i14 - getPaddingBottom());
                if (L > 0) {
                    post(new q2(this, L, 2));
                }
            }
        }
        this.R3 = i14;
    }

    public final boolean p2() {
        int[] G4 = G4();
        if (G4 == null) {
            return q2(G2());
        }
        for (int i10 = G4[0]; i10 <= G4[1]; i10++) {
            if (q2((a) this.f2946s3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean p3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f2946s3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            for (w wVar : T3((a) arrayList.get(i10))) {
                if (wVar.a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean p4(int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.f2946s3;
            if (i11 < arrayList.size()) {
                o2 o2Var = this.Q3;
                if (o2Var != null) {
                    o2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i11 >= i10) {
                        if (t3(i11, true, true)) {
                            z11 = true;
                        }
                        i11--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i10);
                    if (aVar.f2819c >= 1 && (i10 == 0 || ((a) arrayList.get(i10 - 1)).f2819c < aVar.f2819c)) {
                        return false;
                    }
                    z11 = false;
                    while (i10 <= i11) {
                        if (t3(i10, false, true)) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    v4();
                    if (findFocus() instanceof n1) {
                        a2();
                    } else {
                        this.f30819f3.O(false);
                    }
                    o2 o2Var2 = this.Q3;
                    if (o2Var2 != null) {
                        o2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final boolean q2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar != null && (indexOf = (arrayList = this.f2946s3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f2819c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f2818b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !F3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !r2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f2819c < aVar2.f2819c) {
                return false;
            }
            if (s3(indexOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof q6) {
                q6 q6Var = (q6) childAt;
                q6Var.f3303f.m();
                q6Var.h.m();
            } else if (childAt instanceof z5) {
                z5 z5Var = (z5) childAt;
                b6 b6Var = z5Var.f3483w;
                z5Var.f3481r.m();
                for (int i11 = 0; i11 < b6Var.getChildCount(); i11++) {
                    View childAt2 = b6Var.getChildAt(i11);
                    if (childAt2 instanceof c6) {
                        ((c6) childAt2).f2905a.m();
                    }
                }
            } else if (childAt instanceof o0) {
                ((o0) childAt).getCaptionEditText().m();
            } else if (childAt instanceof y0) {
                ((y0) childAt).getEditText().m();
            }
        }
    }

    public final void q4(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof f5) {
            f5 f5Var = (f5) C1;
            ArrayList arrayList = f5Var.D;
            if (f5Var.f2881a != null) {
                f5Var.p();
                if (f5Var.W >= arrayList.size()) {
                    f5Var.W = Math.max(0, arrayList.size() - 1);
                }
                f5Var.q(false);
                f5Var.requestLayout();
                f5Var.invalidate();
            }
        }
    }

    public final boolean r2(int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f2946s3;
            if (i10 < arrayList.size() && H3(((a) arrayList.get(i10)).f2818b) && ((a) arrayList.get(i10 - 1)).f2819c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r3(boolean z10) {
        q3 q3Var = this.f2950u3;
        if (q3Var != null) {
            if (z10) {
                q3Var.f(false);
            } else {
                org.telegram.messenger.i0.r(q3Var.m0);
                q3Var.u();
            }
        }
        if (z10) {
            Y2();
        } else {
            q3();
        }
    }

    public final void r4() {
        post(new b(this, 3));
    }

    public final boolean s2() {
        int[] G4 = G4();
        if (G4 == null) {
            return t2(G2());
        }
        for (int i10 = G4[0]; i10 <= G4[1]; i10++) {
            if (t2((a) this.f2946s3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean s3(int i10) {
        if (((a) this.f2946s3.get(i10)).f2819c + 1 <= ((org.telegram.messenger.l0) vp.r1(this.f2934m3).f18957y7.X.f10700a).f16658c - 6) {
            return true;
        }
        return false;
    }

    public final void s4(int i10) {
        ArrayList arrayList = this.f2946s3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f2819c > 0) {
                View C1 = C1(aVar);
                if (C1 instanceof q6) {
                    ((q6) C1).F();
                }
            }
        }
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.f2942q3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.Y3 = z10;
    }

    public void setFileRefParentObject(jj jjVar) {
        this.f2940p3 = jjVar;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.U3 = new ArrayList();
        ArrayList arrayList = this.f2946s3;
        Z2(arrayList, n5.b(charSequence), this.f2948t3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.U3.add((a) arrayList.get(size));
        }
        this.f30819f3.O(false);
    }

    public final boolean t2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.f2946s3).indexOf(aVar)) < 0 || aVar.f2819c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f2819c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean t3(int i10, boolean z10, boolean z11) {
        boolean z12;
        a aVar;
        int i11;
        int i12 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.f2946s3;
            if (i10 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar2.f2819c > 0) {
                        w2(i10);
                        return true;
                    }
                } else if (aVar2.f2819c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f2818b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !F3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if ((z12 || r2(i10)) && s3(i10)) {
                        if (i10 > 0) {
                            aVar = (a) arrayList.get(i10 - 1);
                        } else {
                            aVar = null;
                        }
                        if (z12) {
                            aVar2.f2819c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i12 = 1;
                            }
                            aVar2.d = i12;
                            return true;
                        }
                        aVar2.f2819c = aVar.f2819c;
                        if (aVar.d > 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        aVar2.d = i11;
                        aVar2.e = false;
                        aVar2.f2820f = false;
                        return true;
                    }
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).f2819c >= aVar2.f2819c)) && s3(i10)) {
                    aVar2.f2819c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void t4(a aVar, w wVar) {
        int i10;
        if (aVar == null) {
            return;
        }
        if (E3(aVar.f2818b)) {
            ArrayList j32 = j3(aVar.f2818b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(wVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                aVar.h.remove(i10);
                if (j32 != null && i10 < j32.size()) {
                    j32.remove(i10);
                }
            }
            if (aVar.h.isEmpty()) {
                u4(aVar);
                return;
            }
            int size = aVar.h.size();
            p51 p51Var = this.f30819f3;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f2818b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) j32.get(0);
                aVar.f2818b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f2821g = (w) aVar.h.get(0);
                aVar.h = null;
                p51Var.O(true);
                q4(aVar);
                return;
            }
            p51Var.O(true);
            q4(aVar);
            return;
        }
        u4(aVar);
    }

    public final boolean u2() {
        o2 o2Var = this.Q3;
        if (o2Var != null) {
            if (o2Var.e || !o2Var.f3257b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u3(boolean z10) {
        a aVar;
        int i10;
        int i11;
        int[] G4 = G4();
        if (G4 != null && (i10 = G4[0]) != (i11 = G4[1])) {
            p4(i10, i11, z10);
            return;
        }
        if (G4 == null) {
            aVar = G2();
        } else {
            aVar = (a) this.f2946s3.get(G4[0]);
        }
        if (aVar != null) {
            Z3(aVar, z10);
        }
    }

    public final void u4(a aVar) {
        ArrayList arrayList = this.f2946s3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.f30819f3.O(true);
        }
    }

    public final n1 v2(int i10) {
        View D4 = D4(i10);
        if (D4 instanceof o0) {
            return ((o0) D4).getCaptionEditText();
        }
        return null;
    }

    public final void v3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f2824k;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size && i10 < arrayList.size() && ((Long) arrayList3.get(i10)).equals(arrayList.get(i10))) {
            i10++;
        }
        for (int i11 = size - 1; i11 >= i10; i11--) {
            Long l4 = (Long) arrayList3.get(i11);
            long longValue = l4.longValue();
            Integer num = (Integer) hashMap.get(l4);
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.f2948t3.containsKey(l4))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f2833t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.f2824k.add((Long) arrayList3.get(i12));
                }
                int i13 = q5.f3298b;
                a51 K = a51.K(q5.class);
                K.G = aVar2;
                K.H = this.f2935m4;
                arrayList2.add(K);
                this.f2955w4.add(aVar2);
            }
        }
    }

    public final void v4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f2946s3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (aVar.f2819c > 0 && aVar.d > 0 && !H3(aVar.f2818b)) {
                    int i11 = aVar.f2819c;
                    int i12 = 1;
                    for (int i13 = i10 - 1; i13 >= 0; i13--) {
                        a aVar2 = (a) arrayList.get(i13);
                        int i14 = aVar2.f2819c;
                        if (i14 < i11) {
                            break;
                        }
                        if (i14 == i11 && !H3(aVar2.f2818b)) {
                            if (aVar2.d <= 0) {
                                break;
                            }
                            i12++;
                        }
                    }
                    aVar.d = i12;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void w2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.f2946s3;
        a aVar2 = (a) arrayList.get(i10);
        int i12 = aVar2.f2819c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            aVar2.f2819c = i13;
            if (i13 == 0) {
                aVar2.d = 0;
                aVar2.e = false;
                aVar2.f2820f = false;
            }
            while (true) {
                i10++;
                if (i10 < arrayList.size() && (i11 = (aVar = (a) arrayList.get(i10)).f2819c) > i12) {
                    aVar.f2819c = i11 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void w3() {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.w3():void");
    }

    public final void w4(String str) {
        q3 q3Var = this.f2950u3;
        Z1(q3Var.f22186p0, q3Var.f22188r0, q3Var.f22189s0, q3Var.f22191u0, str.split("\n", -1));
    }

    public final q6 x2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m10 = this.f30818e3.m(i10);
        if (!(m10 instanceof q6)) {
            return null;
        }
        return (q6) m10;
    }

    public final void x3(bi.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.d4.x3(bi.a):void");
    }

    public final w x4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document V2 = V2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (V2 == null) {
                return null;
            }
            w wVar = new w();
            wVar.f3418c = true;
            wVar.f3416a = 2;
            wVar.h = V2;
            wVar.f3421i = V2;
            return wVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document V22 = V2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (V22 == null) {
                return null;
            }
            w wVar2 = new w();
            wVar2.d = true;
            wVar2.f3416a = 2;
            wVar2.h = V22;
            return wVar2;
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document V23 = V2(pageblockvideo.video_id);
                if (V23 == null) {
                    return null;
                }
                w wVar3 = new w();
                wVar3.f3417b = true;
                wVar3.f3416a = 2;
                wVar3.h = V23;
                wVar3.f3426n = pageblockvideo.spoiler;
                for (int i10 = 0; i10 < V23.attributes.size(); i10++) {
                    if (V23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) V23.attributes.get(i10);
                        wVar3.f3422j = tL_documentAttributeVideo.f19800w;
                        wVar3.f3423k = tL_documentAttributeVideo.h;
                        return wVar3;
                    }
                }
                return wVar3;
            } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
                return null;
            } else {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                long j10 = pageblockphoto.photo_id;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i11 == 0) {
                    photo = null;
                } else {
                    int i12 = 0;
                    loop1: while (true) {
                        if (i12 < this.f2946s3.size()) {
                            for (w wVar4 : T3((a) this.f2946s3.get(i12))) {
                                if (wVar4 != null && (photo = wVar4.f3420g) != null && photo.f19817id == j10) {
                                    break loop1;
                                }
                            }
                            i12++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f2944r3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                int i13 = 0;
                                while (i13 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i13);
                                    i13++;
                                    TLRPC.Photo photo3 = photo2;
                                    if (photo3 != null && photo3.f19817id == j10) {
                                        photo = photo3;
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = g5.f3042a;
                            synchronized (g5.class) {
                                if (i11 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) g5.f3042a.get(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                w wVar5 = new w();
                wVar5.f3416a = 2;
                wVar5.f3420g = photo;
                wVar5.f3426n = pageblockphoto.spoiler;
                TLRPC.PhotoSize w9 = b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
                if (w9 != null) {
                    wVar5.f3422j = w9.f19818w;
                    wVar5.f3423k = w9.h;
                }
                return wVar5;
            }
        }
    }

    public final void y2() {
        J2();
        this.f2944r3 = null;
        this.f2931i4 = null;
        this.f2932j4 = null;
        this.Q3 = new o2(this.f2953v4);
        C4();
        this.Q3.j();
        b4 b4Var = this.f2938o3;
        if (b4Var != null) {
            b4Var.Z();
        }
    }

    public final void y4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f2944r3 != null && aVar != null && (pageBlock = aVar.f2818b) != null) {
            if (E3(pageBlock)) {
                ArrayList j32 = j3(aVar.f2818b);
                aVar.h = new ArrayList();
                if (j32 != null) {
                    for (int i10 = 0; i10 < j32.size(); i10++) {
                        w x42 = x4((TL_iv.PageBlock) j32.get(i10));
                        ArrayList arrayList = aVar.h;
                        if (x42 == null) {
                            x42 = new w();
                        }
                        arrayList.add(x42);
                    }
                    return;
                }
                return;
            }
            w x43 = x4(aVar.f2818b);
            if (x43 != null) {
                aVar.f2821g = x43;
            }
        }
    }

    public final boolean z3() {
        int i10;
        q3 q3Var = this.f2950u3;
        if (q3Var != null && q3Var.x() && (i10 = q3Var.f22186p0) == q3Var.f22189s0 && i10 >= 0 && i10 < this.f2955w4.size()) {
            return D4(i10) instanceof o0;
        }
        return false;
    }

    public final ArrayList z4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (E3(aVar.f2818b)) {
                ArrayList j32 = j3(aVar.f2818b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (j32 != null) {
                    int size2 = j32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = j32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        w x42 = x4(pageBlock);
                        if (x42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(x42);
                        }
                    }
                    j32.clear();
                    j32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.f2818b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    w x43 = x4(pageBlock2);
                    if (x43 != null) {
                        aVar.f2821g = x43;
                        arrayList2.add(aVar);
                    }
                }
            }
        }
        return arrayList2;
    }
}
