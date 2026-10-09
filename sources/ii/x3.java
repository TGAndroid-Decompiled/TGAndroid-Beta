package ii;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.xm0;
import v7.n8;
public final class x3 extends k71 {
    public static final ArrayList f12801q4 = new ArrayList();
    public boolean A3;
    public TL_iv.pageTableCell B3;
    public TL_iv.pageTableCell C3;
    public long D3;
    public float E3;
    public float F3;
    public boolean G3;
    public i2 H3;
    public int I3;
    public i1 J3;
    public final i K3;
    public ArrayList L3;
    public int M3;
    public int N3;
    public int O3;
    public boolean P3;
    public a Q3;
    public boolean R3;
    public final p3 S3;
    public final t2 T3;
    public final q3 U3;
    public final r3 V3;
    public final s3 W3;
    public final IdentityHashMap X3;
    public final IdentityHashMap Y3;
    public a Z3;
    public a f12802a4;
    public final t3 f12803b4;
    public final b3 f12804c4;
    public final int f12805d3;
    public final c3 f12806d4;
    public final org.telegram.ui.ActionBar.e6 f12807e3;
    public final d3 f12808e4;
    public final v3 f12809f3;
    public final e3 f12810f4;
    public MessageObject f12811g3;
    public q5 f12812g4;
    public boolean f12813h3;
    public p80 f12814h4;
    public TL_iv.RichMessage f12815i3;
    public int f12816i4;
    public final ArrayList j3;
    public int f12817j4;
    public final HashMap f12818k3;
    public final u2 f12819k4;
    public final k3 f12820l3;
    public final f3 l4;
    public final aa f12821m3;
    public final a4.l f12822m4;
    public int f12823n3;
    public final ArrayList f12824n4;
    public int f12825o3;
    public xm0 f12826o4;
    public int f12827p3;
    public int f12828p4;
    public boolean f12829q3;
    public float f12830r3;
    public float f12831s3;
    public float f12832t3;
    public float f12833u3;
    public View f12834v3;
    public b f12835w3;
    public boolean f12836x3;
    public boolean y3;
    public boolean f12837z3;

    public x3(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, v3 v3Var) {
        super(context, i10, 0, false, new hi.a(r1, 4), new ei.c5(r1, 16), null, e6Var);
        this.f12813h3 = true;
        this.j3 = new ArrayList();
        this.f12818k3 = new HashMap();
        this.f12823n3 = -1;
        this.f12825o3 = -1;
        this.f12827p3 = 0;
        this.K3 = new i(this, 2);
        this.P3 = true;
        this.S3 = new p3(this);
        this.T3 = new t2(this);
        this.U3 = new q3(this);
        this.V3 = new r3(this);
        this.W3 = new s3(this);
        this.X3 = new IdentityHashMap();
        this.Y3 = new IdentityHashMap();
        this.f12803b4 = new t3(this);
        this.f12804c4 = new b3(this);
        this.f12806d4 = new c3(this);
        this.f12808e4 = new d3(this);
        this.f12810f4 = new e3(this);
        this.f12816i4 = -1;
        this.f12817j4 = -1;
        this.f12819k4 = new u2(this);
        this.l4 = new f3(this);
        a4.l lVar = new a4.l(this, 23);
        this.f12822m4 = lVar;
        this.f12824n4 = new ArrayList();
        this.f12828p4 = -1;
        x3[] x3VarArr = {this};
        this.f12805d3 = i10;
        this.f12807e3 = e6Var;
        this.f12809f3 = v3Var;
        this.W2.f25280r = false;
        setClipToPadding(false);
        setClipChildren(false);
        C1(new hi.a(this, 5), false);
        setReorderLongPressEnabled(false);
        x1(true);
        k3 k3Var = new k3(this, v3Var);
        this.f12820l3 = k3Var;
        k3Var.S(this);
        k3Var.f22619z0 = this.V2;
        aa n10 = k3Var.n(context);
        this.f12821m3 = n10;
        AndroidUtilities.removeFromParent(n10);
        k3Var.D = new m3(this, v3Var);
        j(new n3(0, this, v3Var));
        this.H3 = new i2(lVar);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || F3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !f6.z(pageBlock).isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        if (!F3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean E3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !C3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static boolean F3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockDivider) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockButtonRow) && !(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            return false;
        }
        return true;
    }

    public static boolean G3(a aVar) {
        if (aVar != null && !aVar.f12239i && !y3(aVar) && (aVar.f12234b instanceof TL_iv.pageBlockParagraph) && aVar.f12235c == 0 && aVar.d == 0 && !aVar.f12236e && aVar.f12241k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void J1(ii.x3[] r20, java.util.ArrayList r21, org.telegram.ui.Components.c71 r22) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.J1(ii.x3[], java.util.ArrayList, org.telegram.ui.Components.c71):void");
    }

    public static void K2(a aVar, ArrayList arrayList) {
        int i10;
        int i11;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j3;
        TL_iv.PageBlock pageBlock = aVar.f12234b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            u uVar = aVar.f12238g;
            if (uVar != null && uVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f12234b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f12234b.caption.text = new TL_iv.textEmpty();
                        aVar.f12234b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f12234b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            u uVar2 = aVar.f12238g;
            if (uVar2 != null && uVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f12234b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f12234b.caption.text = new TL_iv.textEmpty();
                        aVar.f12234b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f12234b);
                }
            }
        } else if (C3(pageBlock)) {
            ArrayList h32 = h3(aVar.f12234b);
            List R3 = R3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i12 = 0; h32 != null && i12 < h32.size() && i12 < R3.size(); i12++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) h32.get(i12);
                if (((u) R3.get(i12)).b()) {
                    if (pageBlock4 instanceof TL_iv.pageBlockPhoto) {
                        j3 = ((TL_iv.pageBlockPhoto) pageBlock4).photo_id;
                    } else if (pageBlock4 instanceof TL_iv.pageBlockVideo) {
                        j3 = ((TL_iv.pageBlockVideo) pageBlock4).video_id;
                    } else {
                        j3 = 0;
                    }
                    if (j3 != 0) {
                        l0.d(pageBlock4);
                        arrayList2.add(pageBlock4);
                    }
                }
            }
            if (arrayList2.size() >= 2) {
                if (aVar.f12234b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f12234b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f12234b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                l0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f12234b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                u uVar3 = aVar.f12238g;
                if (uVar3 != null && uVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f12234b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f12234b.caption.text = new TL_iv.textEmpty();
                            aVar.f12234b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f12234b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                u uVar4 = aVar.f12238g;
                if (uVar4 != null && (document = uVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f20044id;
                }
                if (uVar4 != null && uVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f12234b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        l0.d(pageBlock7);
                        arrayList.add(aVar.f12234b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
                int i13 = q4.M;
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
                    arrayList.add(aVar.f12234b);
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
                                    j6.c(pagetablecell, "");
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
                if (P4(pageblocktable)) {
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

    public static void L1(x3 x3Var, int i10, int i11, int i12) {
        i1 editText;
        if (i10 >= 0) {
            View m10 = x3Var.V2.m(i10);
            if (m10 instanceof f6) {
                f6 f6Var = (f6) m10;
                if (i11 == 1 && f6Var.n()) {
                    editText = f6Var.getAuthorEditText();
                } else {
                    editText = f6Var.getEditText();
                }
                editText.s();
                editText.setSelection(Math.max(0, Math.min(i12, editText.length())));
            } else if (m10 instanceof q5) {
                q5 q5Var = (q5) m10;
                i1 l4 = q5Var.l(i11);
                if (l4 == null) {
                    l4 = q5Var.l(0);
                }
                if (l4 != null) {
                    l4.s();
                    l4.setSelection(Math.max(0, Math.min(i12, l4.length())));
                }
            } else if (m10 instanceof m0) {
                i1 captionEditText = ((m0) m10).getCaptionEditText();
                captionEditText.s();
                captionEditText.setSelection(Math.max(0, Math.min(i12, captionEditText.length())));
            }
        }
    }

    public static boolean L2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static org.telegram.tgnet.tl.TL_iv.PageBlock M1(ii.x3 r2, ii.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.M1(ii.x3, ii.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public static void M2(TL_iv.PageBlock pageBlock) {
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

    public static void N1(x3 x3Var, i1 i1Var) {
        if (i1Var == null) {
            x3Var.getClass();
            return;
        }
        i1Var.adaptiveCreateLinkDialog = x3Var.f12813h3;
        i1Var.setInlineButtonContext(x3Var.f12805d3);
        i1Var.setInlineButtonClickListener(new u2(x3Var));
    }

    public static void O1(a aVar, u uVar, x3 x3Var) {
        v3 v3Var = x3Var.f12809f3;
        IdentityHashMap identityHashMap = x3Var.Y3;
        IdentityHashMap identityHashMap2 = x3Var.X3;
        if (uVar == null) {
            ArrayList arrayList = x3Var.j3;
            for (u uVar2 : R3(aVar)) {
                c5 c5Var = (c5) identityHashMap2.remove(uVar2);
                if (c5Var != null) {
                    c5Var.b();
                }
                y4 y4Var = (y4) identityHashMap.remove(uVar2);
                if (y4Var != null) {
                    y4Var.a();
                }
            }
            int indexOf = arrayList.indexOf(aVar);
            if (indexOf >= 0) {
                i2 i2Var = x3Var.H3;
                if (i2Var != null) {
                    i2Var.d();
                }
                arrayList.remove(indexOf);
                x3Var.W2.N(true);
                i2 i2Var2 = x3Var.H3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
            }
            v3Var.onContentChanged();
            return;
        }
        c5 c5Var2 = (c5) identityHashMap2.remove(uVar);
        if (c5Var2 != null) {
            c5Var2.b();
        }
        y4 y4Var2 = (y4) identityHashMap.remove(uVar);
        if (y4Var2 != null) {
            y4Var2.a();
        }
        i2 i2Var3 = x3Var.H3;
        if (i2Var3 != null) {
            i2Var3.d();
        }
        x3Var.r4(aVar, uVar);
        i2 i2Var4 = x3Var.H3;
        if (i2Var4 != null) {
            i2Var4.h();
        }
        v3Var.onContentChanged();
    }

    public static void O2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z10, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            T1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z11, z12);
                        } else {
                            a aVar = new a(pageBlock, i10, i11);
                            aVar.f12236e = z11;
                            aVar.f12237f = z12;
                            arrayList.add(aVar);
                        }
                        z13 = true;
                    } else {
                        arrayList.add(new a(pageBlock, i10, z10 ? 1 : 0));
                    }
                } else {
                    if (!z13) {
                        T1(arrayList, null, i10, i11, z11, z12);
                        z13 = true;
                    }
                    P2(arrayList, pageBlock, i10 + 1);
                }
            }
        }
        if (!z13) {
            T1(arrayList, null, i10, i11, z11, z12);
        }
    }

    public static TL_iv.PageBlock O3(a aVar, u uVar) {
        int i10;
        if (C3(aVar.f12234b)) {
            ArrayList h32 = h3(aVar.f12234b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(uVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0 && h32 != null && i10 < h32.size()) {
                return (TL_iv.PageBlock) h32.get(i10);
            }
            return null;
        }
        return aVar.f12234b;
    }

    public static void P1(x3 x3Var) {
        if (x3Var.G3) {
            return;
        }
        i2 i2Var = x3Var.H3;
        if (i2Var != null) {
            i2Var.h();
        }
        x3Var.f12809f3.l();
        x3Var.p4();
    }

    public static void P2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
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
                    T1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i13 = i12;
                    O2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
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
                T1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                O2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static boolean P4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(h6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!j6.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void Q1(x3 x3Var, a aVar) {
        ArrayList arrayList = x3Var.j3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        i2 i2Var = x3Var.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f12241k.addAll(aVar.f12241k);
        arrayList.add(indexOf + 1, aVar2);
        x3Var.t4();
        x3Var.W2.N(false);
        i2 i2Var2 = x3Var.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        x3Var.post(new p2(x3Var, aVar2, 23));
    }

    public static FrameLayout Q4(q5 q5Var, boolean z10) {
        int i10;
        t5 m10;
        j6 model = q5Var.getModel();
        if (model != null) {
            int i11 = Integer.MAX_VALUE;
            if (z10) {
                i10 = -1;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : q5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o9 = z10 ? (j6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o9 < i10 || (o9 == i10 && a2 < i11) : o9 > i10 || (o9 == i10 && a2 < i11)) {
                    pagetablecell = pagetablecell2;
                    i11 = a2;
                    i10 = o9;
                }
            }
            if (pagetablecell != null && (m10 = q5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return q5Var;
    }

    public static boolean R1(ii.x3 r16, ii.a r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.R1(ii.x3, ii.a, boolean):boolean");
    }

    public static List R3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (C3(aVar.f12234b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        u uVar = aVar.f12238g;
        if (uVar != null) {
            return Collections.singletonList(uVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static i1 S3(View view) {
        if (view instanceof f6) {
            return ((f6) view).getEditText();
        }
        if (view instanceof m0) {
            return ((m0) view).getCaptionEditText();
        }
        if (view instanceof u0) {
            return ((u0) view).getEditText();
        }
        return null;
    }

    public static void T1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i10, i11);
        aVar.f12236e = z10;
        aVar.f12237f = z11;
        arrayList.add(aVar);
    }

    public static TL_iv.PageBlock T3(TL_iv.PageBlock pageBlock) {
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

    public static u U3(MediaController.PhotoEntry photoEntry, String str) {
        boolean z10;
        int i10;
        u uVar = new u();
        uVar.f12711b = photoEntry.isVideo;
        uVar.f12713e = str;
        uVar.f12717j = photoEntry.width;
        uVar.f12718k = photoEntry.height;
        String str2 = photoEntry.imagePath;
        int i11 = 0;
        if (str2 != null && str != null && str.equals(str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = photoEntry.orientation;
        }
        uVar.f12719l = i10;
        if (!z10) {
            i11 = photoEntry.invert;
        }
        uVar.f12720m = i11;
        uVar.f12710a = 1;
        uVar.f12714f = 0.0f;
        return uVar;
    }

    public static q5 V2(i1 i1Var) {
        for (ViewParent parent = i1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof q5) {
                return (q5) parent;
            }
        }
        return null;
    }

    public static void X2(ArrayList arrayList, ArrayList arrayList2, Map map) {
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
                        X2(arrayList, pageblockdetails.blocks, map);
                        if (arrayList.size() == size2) {
                            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        aVar.f12239i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a2 = q0.a();
                        X2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f12241k.add(0, Long.valueOf(a2));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a2), pageblockblockquoteblocks.caption);
                        }
                    } else {
                        arrayList.add(new a(pageBlock, 0, 0));
                    }
                } else {
                    P2(arrayList, pageBlock, 1);
                }
            }
        }
    }

    public static ArrayList Y2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        X2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void a2(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] b5(q5 q5Var) {
        int i10;
        int i11;
        j6 j6Var = q5Var.F;
        if (j6Var != null) {
            i10 = j6Var.f12526g.size();
        } else {
            i10 = 0;
        }
        while (i10 >= 0) {
            i1 l4 = q5Var.l(i10);
            if (l4 != null) {
                i11 = l4.length();
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

    public static ArrayList h3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean i4(i1 i1Var, float f7, float f10) {
        int[] iArr;
        if (i1Var != null && i1Var.getVisibility() == 0) {
            i1Var.getLocationOnScreen(new int[2]);
            float f11 = f7 - iArr[0];
            float f12 = f10 - iArr[1];
            if (f11 >= 0.0f && f12 >= 0.0f && f11 <= i1Var.getWidth() && f12 <= i1Var.getHeight()) {
                int offsetForPosition = i1Var.getOffsetForPosition(f11, f12);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                i1Var.s();
                i1Var.setSelection(Math.max(0, Math.min(offsetForPosition, i1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int l4(int i10, a aVar, boolean z10) {
        int i11;
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        if (z10) {
            i11 = aVar.f12242l;
        } else {
            i11 = aVar.f12243m;
        }
        int size = aVar.f12241k.size() - i11;
        return org.telegram.messenger.q.D(16.0f, Math.max(0, i10 - size), AndroidUtilities.dp(2.0f));
    }

    public static boolean m3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !E3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int m4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f12241k;
        int i10 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f12241k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i10 < min && ((Long) arrayList.get(i10)).equals(arrayList2.get(i10))) {
            i10++;
        }
        return i10;
    }

    public void setEditTextsLocked(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof f6) {
                ((f6) childAt).setLocked(z10);
            } else if (childAt instanceof q5) {
                ((q5) childAt).setLocked(z10);
            } else if (childAt instanceof m0) {
                ((m0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof u0) {
                ((u0) childAt).setLocked(z10);
            } else if (childAt instanceof y0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean w3(int i10) {
        if (i10 != 21 && i10 != 22 && i10 != 19 && i10 != 20) {
            return false;
        }
        return true;
    }

    public static int x2(int i10) {
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

    public static boolean y3(a aVar) {
        if (aVar != null && (aVar.f12234b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public final ArrayList A2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.j3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (u uVar : R3((a) arrayList2.get(i10))) {
                if (uVar.b() && (document = uVar.h) != null && hashSet.add(Long.valueOf(document.f20044id))) {
                    arrayList.add(uVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void A4() {
        ArrayList arrayList = this.j3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.W2.N(false);
    }

    @Override
    public final boolean B1() {
        return this.R3;
    }

    public final ArrayList B2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.j3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (u uVar : R3((a) arrayList2.get(i10))) {
                if (uVar.b() && (photo = uVar.f12715g) != null && hashSet.add(Long.valueOf(photo.f20062id))) {
                    arrayList.add(uVar.f12715g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View B4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.V2.m(i10);
    }

    public final ArrayList C2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.j3;
            if (i10 < arrayList2.size()) {
                for (u uVar : R3((a) arrayList2.get(i10))) {
                    if (uVar.b() && (photo = uVar.f12715g) != null && hashSet.add(Long.valueOf(photo.f20062id))) {
                        arrayList.add(uVar.f12715g);
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final int[] C4() {
        int i10;
        ArrayList arrayList = this.j3;
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x()) {
            int indexOf = arrayList.indexOf(z4(k3Var.f22609p0));
            int indexOf2 = arrayList.indexOf(z4(k3Var.f22612s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        a R2 = R2();
        if (R2 != null) {
            i10 = arrayList.indexOf(R2);
        } else {
            i10 = -1;
        }
        if (i10 >= 0) {
            return new int[]{i10, i10};
        }
        return null;
    }

    @Override
    public final void D1() {
        v3 v3Var = this.f12809f3;
        if (v3Var != null) {
            v3Var.q();
        }
    }

    public final void D2() {
        i2 i2Var = this.H3;
        if (i2Var != null) {
            i2Var.h();
        }
        ArrayList arrayList = this.j3;
        SpannableStringBuilder k10 = e5.k(arrayList);
        H2();
        arrayList.clear();
        HashMap hashMap = this.f12818k3;
        hashMap.clear();
        this.f12815i3 = null;
        X2(arrayList, e5.b(k10), hashMap);
        this.W2.N(false);
        i2 i2Var2 = this.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        v3 v3Var = this.f12809f3;
        if (v3Var != null) {
            v3Var.onContentChanged();
            v3Var.H();
        }
    }

    public final boolean D4() {
        int i10;
        int i11;
        int i12;
        int i13;
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x()) {
            if (M3()) {
                int i14 = k3Var.f22609p0;
                int i15 = k3Var.f22610q0;
                int i16 = k3Var.f22613t0;
                int i17 = k3Var.f22611r0;
                int i18 = k3Var.f22614u0;
                for (int i19 = i15; i19 <= i16; i19++) {
                    i1 O4 = O4(i14, i19);
                    if (O4 != null) {
                        int length = O4.length();
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
            } else if (z3()) {
                i1 J2 = J2(k3Var.f22609p0);
                if (J2 != null && Math.max(0, Math.min(Math.min(k3Var.f22611r0, k3Var.f22614u0), J2.length())) < Math.max(0, Math.min(Math.max(k3Var.f22611r0, k3Var.f22614u0), J2.length()))) {
                    return true;
                }
            } else if (x3()) {
                i1 t22 = t2(k3Var.f22609p0);
                if (t22 != null) {
                    int i20 = k3Var.f22611r0;
                    int i21 = k3Var.f22614u0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), t22.length())) < Math.max(0, Math.min(Math.max(i20, i21), t22.length()))) {
                        return true;
                    }
                }
            } else if (H3()) {
                i1 k42 = k4(k3Var.f22609p0);
                if (k42 != null) {
                    int i22 = k3Var.f22611r0;
                    int i23 = k3Var.f22614u0;
                    if (Math.max(0, Math.min(Math.min(i22, i23), k42.length())) < Math.max(0, Math.min(Math.max(i22, i23), k42.length()))) {
                        return true;
                    }
                }
            } else {
                int i24 = k3Var.f22609p0;
                int i25 = k3Var.f22612s0;
                int i26 = k3Var.f22611r0;
                int i27 = k3Var.f22614u0;
                if (i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < this.f12824n4.size()) {
                    for (int i28 = i24; i28 <= i25; i28++) {
                        a z42 = z4(i28);
                        if (z42 != null) {
                            if (z42.f12250t == 0) {
                                TL_iv.PageBlock pageBlock = z42.f12234b;
                                if (!B3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int j22 = j2(i28);
                            if (i28 == i24) {
                                i10 = i26;
                            } else {
                                i10 = 0;
                            }
                            if (i28 == i25) {
                                i11 = i27;
                            } else {
                                i11 = j22;
                            }
                            if (Math.max(0, Math.min(i10, j22)) < Math.max(0, Math.min(i11, j22))) {
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
    public final void E1() {
        v3 v3Var = this.f12809f3;
        if (v3Var != null) {
            v3Var.B();
        }
        y4();
    }

    public final a E2() {
        int i10;
        a z42;
        a R2 = R2();
        if (R2 != null) {
            return R2;
        }
        k3 k3Var = this.f12820l3;
        if (k3Var != null && (i10 = k3Var.f22609p0) >= 0 && (z42 = z4(i10)) != null) {
            return z42;
        }
        return null;
    }

    public final int[] E4() {
        k3 k3Var = this.f12820l3;
        if (k3Var != null) {
            int i10 = k3Var.f22609p0;
            int i11 = k3Var.f22612s0;
            if (i10 >= 0 && i11 >= 0) {
                a z42 = z4(i10);
                a z43 = z4(i11);
                if (z42 != null && z43 != null) {
                    ArrayList arrayList = this.j3;
                    int indexOf = arrayList.indexOf(z42);
                    int indexOf2 = arrayList.indexOf(z43);
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
    public final void F1(s4.d1 d1Var) {
        v3 v3Var = this.f12809f3;
        if (v3Var != null && d1Var != null) {
            View view = d1Var.f47658a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.R3 = v3Var.f(view.getHeight() + iArr[1]);
        }
    }

    public final void F2() {
        ArrayList arrayList;
        k3 k3Var = this.f12820l3;
        int i10 = k3Var.f22609p0;
        int i11 = k3Var.f22611r0;
        int i12 = k3Var.f22612s0;
        if (!X1(i10, i11, i12, k3Var.f22614u0, new String[]{""})) {
            if (i10 > i12) {
                i12 = i10;
                i10 = i12;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i10);
            while (true) {
                arrayList = this.j3;
                if (max > i12) {
                    break;
                }
                ArrayList arrayList3 = this.f12824n4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f12250t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                i2 i2Var = this.H3;
                if (i2Var != null) {
                    i2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f12818k3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        hashSet.addAll(((a) arrayList.get(i13)).f12241k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                y2();
                W3();
                t4();
                k3Var.f(false);
                this.W2.N(false);
                i2 i2Var2 = this.H3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                post(new p2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void F4(i1 i1Var) {
        i1Var.adaptiveCreateLinkDialog = this.f12813h3;
        i1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override
    public final void G1(s4.d1 d1Var) {
        a aVar = this.Q3;
        this.Q3 = null;
        this.R3 = false;
        if (aVar != null) {
            i2 i2Var = this.H3;
            if (i2Var != null) {
                i2Var.d();
            }
            s4(aVar);
            i2 i2Var2 = this.H3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            v3 v3Var = this.f12809f3;
            if (v3Var != null) {
                v3Var.onContentChanged();
            }
        } else if (d1Var != null) {
            View view = d1Var.f47658a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean G2() {
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x()) {
            k3Var.f(false);
            return true;
        } else if (this.f12812g4 == null) {
            return false;
        } else {
            N2();
            return true;
        }
    }

    public final void G4(ii.q5 r34) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.G4(ii.q5):void");
    }

    @Override
    public final void H1(s4.d1 d1Var) {
        int b10;
        p61 G;
        a aVar = null;
        if (d1Var != null && (b10 = d1Var.b()) >= 0 && (G = this.W2.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.Q3 = aVar;
        this.R3 = false;
        v3 v3Var = this.f12809f3;
        if (v3Var != null) {
            v3Var.m();
        }
    }

    public final void H2() {
        k3 k3Var = this.f12820l3;
        if (k3Var != null) {
            k3Var.f(true);
        }
        N2();
        o3();
        IdentityHashMap identityHashMap = this.X3;
        for (c5 c5Var : identityHashMap.values()) {
            c5Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.Y3;
        for (y4 y4Var : identityHashMap2.values()) {
            y4Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean H3() {
        int i10;
        a z42;
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x() && (i10 = k3Var.f22609p0) == k3Var.f22612s0 && i10 >= 0 && i10 < this.f12824n4.size() && k3Var.f22610q0 == 1 && k3Var.f22613t0 == 1 && (z42 = z4(i10)) != null && f6.p(z42.f12234b)) {
            return true;
        }
        return false;
    }

    public final f6 H4() {
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x()) {
            int i10 = k3Var.f22609p0;
            int i11 = k3Var.f22612s0;
            a z42 = z4(i10);
            if (i10 == i11 && z42 != null && B3(z42.f12234b)) {
                return v2(i10);
            }
            return null;
        }
        return null;
    }

    public final int I2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.j3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (y3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).f12239i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean I3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.j3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.f12239i && !y3(aVar)) {
                        if (!aVar.f12241k.isEmpty() || f6.p(aVar.f12234b)) {
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

    public final Editable I4(int i10, int i11, int i12, int i13) {
        if (i10 == i12) {
            if (y3(z4(i10))) {
                i1 J2 = J2(i10);
                if (J2 != null) {
                    return J2.getText();
                }
                return null;
            } else if (H3()) {
                i1 k42 = k4(i10);
                if (k42 != null) {
                    return k42.getText();
                }
                return null;
            } else {
                a z42 = z4(i10);
                if (z42 != null && B3(z42.f12234b)) {
                    int j22 = j2(i10);
                    if (hg.c.y(i11, i13, j22, 0) < hg.c.w(i11, i13, j22, 0)) {
                        f6 v22 = v2(i10);
                        if (v22 != null) {
                            return v22.getEditText().getText();
                        }
                        return f6.A(z42.f12234b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final i1 J2(int i10) {
        if (!y3(z4(i10))) {
            return null;
        }
        View B4 = B4(i10);
        if (!(B4 instanceof u0)) {
            return null;
        }
        return ((u0) B4).getEditText();
    }

    public final boolean J3() {
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x()) {
            int i10 = k3Var.f22609p0;
            int i11 = k3Var.f22612s0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a z42 = z4(i10);
                    if (z42 != null) {
                        if (D3(z42.f12234b)) {
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

    public final boolean J4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.J4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean K3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.K3(int, int, int, int, int):boolean");
    }

    public final void K4(View view) {
        s4.d1 T;
        int b10;
        if (view != null && this.X2 != null && this.f27866a3 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.W2.H(b10) >= 0) {
            this.y3 = true;
            k3 k3Var = this.f12820l3;
            if (k3Var.x()) {
                k3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.X2.r(T);
        }
    }

    public final boolean L3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        boolean z10 = false;
        for (int i18 = i12; i18 <= i14; i18++) {
            i1 O4 = O4(i11, i18);
            if (O4 != null) {
                int length = O4.length();
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
                } else if ((O4.getCurrentStyle(max, max2) & i10) == 0) {
                    return false;
                } else {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void L4(a aVar, u uVar, MediaController.PhotoEntry photoEntry) {
        int i10;
        float f7;
        c5 c5Var = (c5) this.X3.remove(uVar);
        if (c5Var != null) {
            c5Var.b();
        }
        IdentityHashMap identityHashMap = this.Y3;
        y4 y4Var = (y4) identityHashMap.remove(uVar);
        if (y4Var != null) {
            y4Var.a();
        }
        uVar.f12710a = 1;
        uVar.f12714f = 0.0f;
        y4 y4Var2 = new y4(this.f12805d3, photoEntry, new i3(aVar, uVar, this));
        identityHashMap.put(uVar, y4Var2);
        if (!y4Var2.f12862f && !y4Var2.h && !y4Var2.f12863n) {
            y4Var2.f12862f = true;
            int i11 = photoEntry.width;
            int i12 = photoEntry.height;
            if (i11 <= 0 || i12 <= 0) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(photoEntry.path, options);
                    i11 = options.outWidth;
                    i12 = options.outHeight;
                } catch (Exception unused) {
                }
            }
            VideoEditedInfo videoEditedInfo = null;
            r7 = null;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
            videoEditedInfo = null;
            if (i11 > 0 && i12 > 0) {
                int i13 = photoEntry.orientation;
                if (i13 == 90 || i13 == 270) {
                    int i14 = i12;
                    i12 = i11;
                    i11 = i14;
                }
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                videoEditedInfo2.startTime = 0L;
                videoEditedInfo2.start = (float) 0;
                videoEditedInfo2.endTime = Math.min(3000L, photoEntry.averageDuration);
                while (true) {
                    long j3 = videoEditedInfo2.endTime;
                    i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    if (i10 <= 0 || j3 >= 1000) {
                        break;
                    }
                    videoEditedInfo2.endTime = j3 * 2;
                }
                if (i10 <= 0) {
                    videoEditedInfo2.endTime = 3000L;
                }
                long j10 = videoEditedInfo2.endTime;
                videoEditedInfo2.end = (float) j10;
                videoEditedInfo2.compressQuality = 1;
                videoEditedInfo2.rotationValue = 0;
                videoEditedInfo2.originalPath = photoEntry.path;
                videoEditedInfo2.estimatedSize = (int) ((f7 / 1000.0f) * 115200.0f);
                videoEditedInfo2.estimatedDuration = j10;
                videoEditedInfo2.framerate = 30;
                videoEditedInfo2.originalDuration = j10;
                videoEditedInfo2.filterState = photoEntry.savedFilterState;
                String str = photoEntry.croppedPaintPath;
                if (str != null) {
                    videoEditedInfo2.paintPath = str;
                    ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = photoEntry.croppedMediaEntities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList = photoEntry.croppedMediaEntities;
                    }
                    videoEditedInfo2.mediaEntities = arrayList;
                } else {
                    videoEditedInfo2.paintPath = photoEntry.paintPath;
                    videoEditedInfo2.mediaEntities = photoEntry.mediaEntities;
                }
                videoEditedInfo2.isPhoto = true;
                MediaController.CropState cropState = photoEntry.cropState;
                if (cropState != null) {
                    int i15 = cropState.transformRotation;
                    if (i15 == 90 || i15 == 270) {
                        int i16 = i12;
                        i12 = i11;
                        i11 = i16;
                    }
                    i11 = (int) (i11 * cropState.cropPw);
                    i12 = (int) (i12 * cropState.cropPh);
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
                videoEditedInfo2.resultWidth = i17;
                videoEditedInfo2.originalWidth = i17;
                videoEditedInfo2.resultHeight = i18;
                videoEditedInfo2.originalHeight = i18;
                videoEditedInfo2.bitrate = -1;
                videoEditedInfo2.muted = true;
                videoEditedInfo2.avatarStartTime = 0L;
                videoEditedInfo = videoEditedInfo2;
            }
            y4Var2.d = videoEditedInfo;
            if (videoEditedInfo != null && videoEditedInfo.needConvert()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f20059id = 1;
                String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
                y4Var2.f12861e = absolutePath;
                tL_message.attachPath = absolutePath;
                MessageObject messageObject = new MessageObject(y4Var2.f12858a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                y4Var2.f12860c = messageObject;
                messageObject.videoEditedInfo = y4Var2.d;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(y4Var2.f12858a);
                notificationCenter.addObserver(y4Var2, NotificationCenter.filePreparingStarted);
                notificationCenter.addObserver(y4Var2, NotificationCenter.fileNewChunkAvailable);
                notificationCenter.addObserver(y4Var2, NotificationCenter.filePreparingFailed);
                MediaController.getInstance().scheduleVideoConvert(y4Var2.f12860c, false, false, false);
                return;
            }
            y4Var2.b();
        }
    }

    public final boolean M3() {
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x()) {
            int i10 = k3Var.f22609p0;
            int i11 = k3Var.f22612s0;
            a z42 = z4(i10);
            if (i10 == i11 && z42 != null && (z42.f12234b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void M4(a aVar, u uVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.X3;
        c5 c5Var = (c5) identityHashMap.remove(uVar);
        if (c5Var != null) {
            c5Var.b();
        }
        c5 c5Var2 = new c5(this.f12805d3, str, z10, i10, i11, i12, new j3(aVar, uVar, this));
        identityHashMap.put(uVar, c5Var2);
        c5Var2.d();
    }

    public final void N2() {
        if (this.f12837z3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.f12837z3 = false;
        this.A3 = false;
        this.B3 = null;
        this.C3 = null;
        p80 p80Var = this.f12814h4;
        if (p80Var != null) {
            this.f12814h4 = null;
            p80Var.u();
        }
        q5 q5Var = this.f12812g4;
        if (q5Var != null) {
            LinkedHashSet linkedHashSet = q5Var.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                q5Var.v.invalidate();
                q5Var.t();
            }
            this.f12812g4 = null;
        }
        this.f12817j4 = -1;
        this.f12816i4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean N3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.f12805d3).config;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.j3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += R3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList a32 = a3();
        ?? obj = new Object();
        obj.d = i11;
        obj.f12506b = a32.size() + obj.f12506b;
        for (int i12 = 0; i12 < a32.size(); i12++) {
            j2.b((TL_iv.PageBlock) a32.get(i12), 1, obj);
        }
        if (obj.f12505a > appGlobalConfig.richMessageLengthLimit.get() || obj.f12506b > appGlobalConfig.richMessageMaxBlocks.get() || obj.f12507c > appGlobalConfig.richMessageMaxDepth.get() || obj.d > appGlobalConfig.richMessageMaxMedia.get() || obj.f12508e > appGlobalConfig.richMessageMaxTableCols.get()) {
            return false;
        }
        return true;
    }

    public final Editable N4(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof f6) {
            return ((f6) A1).getEditText().getText();
        }
        return f6.A(aVar.f12234b);
    }

    public final i1 O4(int i10, int i11) {
        View B4 = B4(i10);
        if (!(B4 instanceof q5)) {
            return null;
        }
        return ((q5) B4).l(i11);
    }

    public final int[] P3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.L3.size(); i12++) {
            int length = f6.z(((a) this.L3.get(i12)).f12234b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.L3.size() - 1;
        return new int[]{size, f6.z(((a) this.L3.get(size)).f12234b).length()};
    }

    public final i1 Q2() {
        View findFocus = findFocus();
        if (findFocus instanceof i1) {
            return (i1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof f6) {
                return ((f6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int Q3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.j3;
            if (i12 < arrayList.size()) {
                a aVar = (a) arrayList.get(i12);
                if (y3(aVar)) {
                    i11++;
                } else if (aVar.f12239i && i11 - 1 == 0) {
                    return i12;
                }
                i12++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final a R2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof f6) {
                f6 f6Var = (f6) childAt;
                if (f6Var.getEditText().isFocused() || (f6Var.n() && f6Var.h.isFocused())) {
                    return f6Var.getRow();
                }
            }
        }
        return null;
    }

    public final void R4() {
        boolean z10;
        int[] C4 = C4();
        if (C4 != null) {
            int i10 = C4[0];
            int i11 = C4[1];
            if (i10 >= 0) {
                ArrayList arrayList = this.j3;
                if (i11 < arrayList.size() && i10 <= i11) {
                    i2 i2Var = this.H3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    if (I3(i10, i11)) {
                        for (int i12 = i10; i12 <= i11; i12++) {
                            a aVar = (a) arrayList.get(i12);
                            boolean z11 = aVar.f12239i;
                            ArrayList arrayList2 = aVar.f12241k;
                            if (!z11 && !y3(aVar)) {
                                if (f6.p(aVar.f12234b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f12234b.text;
                                    aVar.f12234b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    a1.g.y(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a2 = q0.a();
                        for (int i13 = i10; i13 <= i11; i13++) {
                            a aVar2 = (a) arrayList.get(i13);
                            boolean z12 = aVar2.f12239i;
                            ArrayList arrayList3 = aVar2.f12241k;
                            if (!z12 && !y3(aVar2)) {
                                if (f6.p(aVar2.f12234b)) {
                                    long a10 = q0.a();
                                    TL_iv.RichText k10 = f6.k(aVar2.f12234b);
                                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                        this.f12818k3.put(Long.valueOf(a10), k10);
                                    }
                                    arrayList3.add(Long.valueOf(a10));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f12234b.text;
                                    aVar2.f12234b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a2));
                            }
                        }
                    }
                    y2();
                    W3();
                    t4();
                    k3 k3Var = this.f12820l3;
                    if (k3Var != null && k3Var.x()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
                    this.W2.N(false);
                    i2 i2Var2 = this.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    if (z10) {
                        post(new gg.t(this, aVar3, aVar4, 16));
                    } else {
                        post(new p2(this, aVar3, 9));
                    }
                }
            }
        }
    }

    public final void S1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.S1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final q5 S2() {
        View findFocus = findFocus();
        if (findFocus instanceof i1) {
            return V2((i1) findFocus);
        }
        return null;
    }

    public final void S4(ii.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.S4(ii.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final TLRPC.Document T2(long j3) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        TLRPC.Document document2 = null;
        if (i10 == 0) {
            return null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.j3.size(); i12++) {
            for (u uVar : R3((a) this.j3.get(i12))) {
                if (uVar != null && (document = uVar.h) != null && document.f20044id == j3) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f12815i3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.Document document3 = arrayList.get(i11);
                i11++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f20044id == j3) {
                    return document4;
                }
            }
        }
        HashMap hashMap = x4.f12838a;
        synchronized (x4.class) {
            if (i10 != 0) {
                document2 = (TLRPC.Document) x4.f12839b.get(Long.valueOf(j3));
            }
        }
        return document2;
    }

    public final boolean T4() {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.T4():boolean");
    }

    public final void U1(a aVar, MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        x3 x3Var;
        if (aVar != null && E3(aVar.f12234b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                i2 i2Var = this.H3;
                if (i2Var != null) {
                    i2Var.d();
                }
                u U3 = U3(photoEntry, str2);
                boolean c10 = y4.c(photoEntry);
                if (!photoEntry.isVideo && !c10) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (C3(aVar.f12234b)) {
                    h3(aVar.f12234b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(U3);
                } else {
                    u uVar = aVar.f12238g;
                    if (uVar != null && uVar.f12710a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f12234b.caption;
                        l0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f12234b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f12238g);
                        aVar.h.add(U3);
                        aVar.f12238g = null;
                        aVar.f12234b = pageblockcollage;
                    } else {
                        aVar.f12234b = pageblockvideo;
                        aVar.f12238g = U3;
                    }
                }
                this.W2.N(false);
                o4(aVar);
                if (c10) {
                    L4(aVar, U3, photoEntry);
                    x3Var = this;
                } else {
                    x3Var = this;
                    x3Var.M4(aVar, U3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                i2 i2Var2 = x3Var.H3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                x3Var.f12809f3.onContentChanged();
            }
        }
    }

    public final int U2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.j3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f12239i) {
                int i12 = -1;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (y3(aVar2)) {
                        i13++;
                        if (i12 == -1 && !((TL_iv.pageBlockDetails) aVar2.f12234b).open) {
                            i12 = i13;
                        }
                    } else if (aVar2.f12239i) {
                        if (i12 != -1 && i13 == i12) {
                            i12 = -1;
                        }
                        i13--;
                    }
                }
                if (i12 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f12234b;
                    if (!F3(pageBlock) || m3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i10;
                    }
                }
            }
            i10 += i11;
        }
        return -1;
    }

    public final boolean U4(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.U4(android.view.View, float, float):boolean");
    }

    public final void V1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            i2 i2Var = this.H3;
            if (i2Var != null) {
                i2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f12815i3;
            if (richMessage2 == null) {
                this.f12815i3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f12815i3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            X2(arrayList4, richMessage.blocks, this.f12818k3);
            if (!arrayList4.isEmpty()) {
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    w4((a) arrayList4.get(i10));
                }
                ArrayList arrayList5 = this.j3;
                int size = arrayList5.size();
                a R2 = R2();
                if (R2 != null && (indexOf = arrayList5.indexOf(R2)) >= 0) {
                    TL_iv.PageBlock pageBlock = R2.f12234b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && f6.z(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                W3();
                t4();
                this.W2.N(false);
                i2 i2Var2 = this.H3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                v3 v3Var = this.f12809f3;
                if (v3Var != null) {
                    v3Var.onContentChanged();
                }
            }
        }
    }

    public final a V3(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f12824n4;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f12239i) {
                    if (aVar.f12250t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f12234b;
                        if (F3(pageBlock) && !m3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
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

    public final void V4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        Editable A;
        if (aVar == null) {
            aVar = Y4();
        }
        a aVar2 = aVar;
        if (aVar2 != null && pageBlock != null) {
            ArrayList arrayList = this.j3;
            if (arrayList.indexOf(aVar2) >= 0 && !y3(aVar2) && !aVar2.f12239i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f12234b;
                if (pageBlock != pageBlock2 && B3(pageBlock2) && B3(pageBlock)) {
                    f6 v22 = v2(arrayList.indexOf(aVar2));
                    if (v22 != null) {
                        A = v22.getEditText().getText();
                    } else {
                        A = f6.A(aVar2.f12234b);
                    }
                    f6.d(pageBlock, A);
                    TL_iv.RichText k10 = f6.k(aVar2.f12234b);
                    if (k10 != null && f6.k(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = k10;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = k10;
                        }
                    }
                }
                S4(aVar2, pageBlock, i10, i11, z10, z11);
            }
        }
    }

    public final a W1(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.f12824n4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i11 = indexOf + i10) >= 0 && i11 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i11);
            if (aVar2.f12250t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final void W2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof f6) {
                f6 f6Var = (f6) childAt;
                f6Var.f12419f.n();
                f6Var.h.n();
            } else if (childAt instanceof m0) {
                ((m0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof u0) {
                ((u0) childAt).getEditText().n();
            }
        }
    }

    public final void W3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.j3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f12241k.isEmpty() && f6.p(aVar.f12234b)) {
                    long a2 = q0.a();
                    TL_iv.RichText k10 = f6.k(aVar.f12234b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        this.f12818k3.put(Long.valueOf(a2), k10);
                    }
                    aVar.f12241k.add(Long.valueOf(a2));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f12234b.text;
                    aVar.f12234b = pageblockparagraph;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void W4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = Y4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        V4(aVar2, pageBlock, aVar2.f12235c, aVar2.d, aVar2.f12236e, aVar2.f12237f);
    }

    public final boolean X1(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.X1(int, int, int, int, java.lang.String[]):boolean");
    }

    public final boolean X3(ii.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.X3(ii.a, boolean):boolean");
    }

    public final void X4(a aVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        x3 x3Var;
        TL_iv.PageBlock pageBlock;
        if (aVar == null) {
            aVar = Y4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            V4(aVar2, aVar2.f12234b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f12235c);
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
        TL_iv.PageBlock pageBlock2 = aVar2.f12234b;
        if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
            pageBlock2 = new TL_iv.pageBlockParagraph();
        }
        if (z10 && aVar2.f12237f) {
            z11 = true;
            pageBlock = pageBlock2;
            x3Var = this;
        } else {
            z11 = false;
            x3Var = this;
            pageBlock = pageBlock2;
        }
        x3Var.V4(aVar2, pageBlock, max, i11, z10, z11);
    }

    public final void Y1() {
        f6 f6Var;
        a aVar;
        c6 c6Var;
        this.W2.S();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof f6) && (aVar = (f6Var = (f6) childAt).f12424x) != null && (c6Var = f6Var.f12425y) != null) {
                f6Var.g(aVar, c6Var, f6Var.E);
            }
        }
    }

    public final void Y3() {
        int length;
        int y3;
        int w10;
        int length2;
        int y10;
        int w11;
        int length3;
        int y11;
        int w12;
        int length4;
        int y12;
        int w13;
        i1 O4;
        int length5;
        int y13;
        int w14;
        boolean M3 = M3();
        k3 k3Var = this.f12820l3;
        if (M3) {
            int i10 = k3Var.f22609p0;
            int i11 = k3Var.f22610q0;
            if (i11 == k3Var.f22613t0 && (O4 = O4(i10, i11)) != null && (y13 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length5 = O4.length()), 0)) < (w14 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length5, 0))) {
                i2 i2Var = this.H3;
                if (i2Var != null) {
                    i2Var.d();
                }
                if (h6.h(O4.getText(), y13, w14)) {
                    h6.n(O4.getText(), y13, w14);
                    O4.invalidateEffects();
                    h4(i10, i11);
                    i2 i2Var2 = this.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    p4();
                }
                O4.setSelectionOverride(y13, w14);
                O4.makeSelectedDate();
            }
        } else if (z3()) {
            int i12 = k3Var.f22609p0;
            i1 J2 = J2(i12);
            if (J2 != null && (y12 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length4 = J2.length()), 0)) < (w13 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length4, 0))) {
                i2 i2Var3 = this.H3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                if (h6.h(J2.getText(), y12, w13)) {
                    h6.n(J2.getText(), y12, w13);
                    J2.invalidateEffects();
                    f4(i12);
                    i2 i2Var4 = this.H3;
                    if (i2Var4 != null) {
                        i2Var4.h();
                    }
                    p4();
                }
                J2.setSelectionOverride(y12, w13);
                J2.makeSelectedDate();
            }
        } else if (x3()) {
            int i13 = k3Var.f22609p0;
            i1 t22 = t2(i13);
            if (t22 != null && (y11 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length3 = t22.length()), 0)) < (w12 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length3, 0))) {
                i2 i2Var5 = this.H3;
                if (i2Var5 != null) {
                    i2Var5.d();
                }
                if (h6.h(t22.getText(), y11, w12)) {
                    h6.n(t22.getText(), y11, w12);
                    t22.invalidateEffects();
                    e4(i13);
                    i2 i2Var6 = this.H3;
                    if (i2Var6 != null) {
                        i2Var6.h();
                    }
                    p4();
                }
                t22.setSelectionOverride(y11, w12);
                t22.makeSelectedDate();
            }
        } else if (H3()) {
            int i14 = k3Var.f22609p0;
            i1 k42 = k4(i14);
            if (k42 != null && (y10 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length2 = k42.length()), 0)) < (w11 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length2, 0))) {
                i2 i2Var7 = this.H3;
                if (i2Var7 != null) {
                    i2Var7.d();
                }
                if (h6.h(k42.getText(), y10, w11)) {
                    h6.n(k42.getText(), y10, w11);
                    k42.invalidateEffects();
                    g4(i14);
                    i2 i2Var8 = this.H3;
                    if (i2Var8 != null) {
                        i2Var8.h();
                    }
                    p4();
                }
                k42.setSelectionOverride(y10, w11);
                k42.makeSelectedDate();
            }
        } else {
            f6 H4 = H4();
            if (H4 == null || (y3 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length = H4.getEditText().length()), 0)) >= (w10 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length, 0))) {
                return;
            }
            i2 i2Var9 = this.H3;
            if (i2Var9 != null) {
                i2Var9.d();
            }
            if (h6.h(H4.getEditText().getText(), y3, w10)) {
                h6.n(H4.getEditText().getText(), y3, w10);
                H4.getEditText().invalidateEffects();
                H4.x();
                i2 i2Var10 = this.H3;
                if (i2Var10 != null) {
                    i2Var10.h();
                }
                p4();
            }
            H4.getEditText().setSelectionOverride(y3, w10);
            H4.getEditText().makeSelectedDate();
        }
    }

    public final a Y4() {
        k3 k3Var;
        int i10;
        a R2 = R2();
        if (R2 == null && (k3Var = this.f12820l3) != null && k3Var.x() && (i10 = k3Var.f22609p0) == k3Var.f22612s0) {
            return z4(i10);
        }
        return R2;
    }

    public final boolean Z1(int i10, int i11) {
        k3 k3Var;
        ArrayList arrayList = this.L3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] P3 = P3(max);
            int[] P32 = P3(max2);
            a aVar = (a) this.L3.get(P3[0]);
            if (P3[0] != P32[0] && max != max2) {
                View A1 = A1(aVar);
                View A12 = A1(this.L3.get(P32[0]));
                if ((A1 instanceof f6) && (A12 instanceof f6)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.j3;
                        int size = arrayList2.size();
                        k3Var = this.f12820l3;
                        if (i12 >= size) {
                            break;
                        }
                        k3Var.X(i12, f6.z(((a) arrayList2.get(i12)).f12234b));
                        i12++;
                    }
                    f6 f6Var = (f6) A1;
                    int length = f6Var.getEditText().length();
                    if (P3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!k3Var.j0(f6Var, 0, P3[1], length)) {
                        f6Var.B();
                        return true;
                    }
                    k3Var.b0(0, P32[1], (f6) A12);
                    return true;
                }
            } else {
                View A13 = A1(aVar);
                if (A13 instanceof f6) {
                    f6 f6Var2 = (f6) A13;
                    f6Var2.B();
                    i1 editText = f6Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(P3[1], length2), Math.min(P32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList Z2(int i10, int i11, int i12, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z11;
        x3 x3Var;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.j3;
            a aVar = (a) arrayList2.get(i15);
            boolean z12 = aVar.f12239i;
            ArrayList arrayList3 = aVar.f12241k;
            if (z12) {
                i15++;
            } else if (arrayList3.size() > i12) {
                Long l4 = (Long) arrayList3.get(i12);
                long longValue = l4.longValue();
                int i16 = i15 + 1;
                while (i16 < i11) {
                    a aVar2 = (a) arrayList2.get(i16);
                    if (aVar2.f12241k.size() <= i12 || ((Long) aVar2.f12241k.get(i12)).longValue() != longValue) {
                        break;
                    }
                    i16++;
                }
                ArrayList<TL_iv.PageBlock> Z2 = Z2(i15, i16, i12 + 1, true);
                if (Z2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f12818k3.get(l4);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (Z2.size() == 1 && (Z2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        if (Z2.get(0).text != null) {
                            textempty = Z2.get(0).text;
                        } else {
                            textempty = new TL_iv.textEmpty();
                        }
                        pageblockblockquote.text = textempty;
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = Z2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i15 = i16;
            } else if (y3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f12234b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int Q3 = Q3(i15);
                pageblockdetails.blocks = Z2(i15 + 1, Math.min(Q3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = Q3 + 1;
            } else {
                int i17 = aVar.f12235c;
                if (i17 <= 0) {
                    K2(aVar, arrayList);
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    int[] iArr = {i15};
                    if (aVar.d > 0) {
                        z11 = true;
                        i13 = i11;
                        i14 = i12;
                        x3Var = this;
                    } else {
                        z11 = false;
                        x3Var = this;
                        i13 = i11;
                        i14 = i12;
                    }
                    TL_iv.PageBlock l22 = x3Var.l2(i15, i17, i13, i14, z11, iArr);
                    if (l22 != null) {
                        arrayList.add(l22);
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
            while (!arrayList.isEmpty() && A3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && A3((TL_iv.PageBlock) hg.c.g(1, arrayList))) {
                a1.g.y(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void Z3(int i10) {
        int i11;
        i2 i2Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        SpannableStringBuilder spannableStringBuilder;
        int i15;
        int length;
        int y3;
        int w10;
        boolean z11;
        int i16;
        int length2;
        int y10;
        int w11;
        boolean z12;
        int i17;
        int length3;
        int y11;
        int w12;
        boolean z13;
        int i18;
        i2 i2Var2;
        int i19;
        int i20;
        int i21;
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x()) {
            boolean M3 = M3();
            v3 v3Var = this.f12809f3;
            int i22 = 0;
            if (M3) {
                int i23 = k3Var.f22609p0;
                int i24 = k3Var.f22610q0;
                int i25 = k3Var.f22613t0;
                int i26 = k3Var.f22611r0;
                int i27 = k3Var.f22614u0;
                boolean L3 = L3(i10, i23, i24, i26, i25, i27);
                if (!L3) {
                    i18 = x2(i10);
                } else {
                    i18 = 0;
                }
                i2 i2Var3 = this.H3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                this.G3 = true;
                int i28 = i24;
                boolean z14 = false;
                while (i28 <= i25) {
                    i1 O4 = O4(i23, i28);
                    if (O4 == null) {
                        i21 = i24;
                    } else {
                        int length4 = O4.length();
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
                            if (!L3) {
                                if (i18 != 0) {
                                    O4.removeStyle(i18, max, max2);
                                }
                                O4.addStyle(i10, max, max2);
                            } else {
                                O4.removeStyle(i10, max, max2);
                            }
                            O4.invalidateEffects();
                            O4.requestLayout();
                            h4(i23, i28);
                            z14 = true;
                        }
                    }
                    i28++;
                    i24 = i21;
                }
                this.G3 = false;
                if (z14 && (i2Var2 = this.H3) != null) {
                    i2Var2.h();
                }
                v3Var.l();
                if (z14) {
                    p4();
                }
            } else if (z3()) {
                int i30 = k3Var.f22609p0;
                i1 J2 = J2(i30);
                if (J2 != null && (y11 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length3 = J2.length()), 0)) < (w12 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length3, 0))) {
                    if ((J2.getCurrentStyle(y11, w12) & i10) == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i2 i2Var4 = this.H3;
                    if (i2Var4 != null) {
                        i2Var4.d();
                    }
                    this.G3 = true;
                    if (z13) {
                        int x22 = x2(i10);
                        if (x22 != 0) {
                            J2.removeStyle(x22, y11, w12);
                        }
                        J2.addStyle(i10, y11, w12);
                    } else {
                        J2.removeStyle(i10, y11, w12);
                    }
                    this.G3 = false;
                    f4(i30);
                    J2.invalidateEffects();
                    J2.requestLayout();
                    i2 i2Var5 = this.H3;
                    if (i2Var5 != null) {
                        i2Var5.h();
                    }
                    v3Var.l();
                    p4();
                }
            } else if (x3()) {
                int i31 = k3Var.f22609p0;
                i1 t22 = t2(i31);
                if (t22 != null && (y10 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length2 = t22.length()), 0)) < (w11 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length2, 0))) {
                    if ((t22.getCurrentStyle(y10, w11) & i10) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i17 = x2(i10);
                    } else {
                        i17 = 0;
                    }
                    i2 i2Var6 = this.H3;
                    if (i2Var6 != null) {
                        i2Var6.d();
                    }
                    this.G3 = true;
                    if (z12) {
                        if (i17 != 0) {
                            t22.removeStyle(i17, y10, w11);
                        }
                        t22.addStyle(i10, y10, w11);
                    } else {
                        t22.removeStyle(i10, y10, w11);
                    }
                    t22.invalidateEffects();
                    t22.requestLayout();
                    e4(i31);
                    this.G3 = false;
                    i2 i2Var7 = this.H3;
                    if (i2Var7 != null) {
                        i2Var7.h();
                    }
                    v3Var.l();
                    p4();
                }
            } else if (H3()) {
                int i32 = k3Var.f22609p0;
                i1 k42 = k4(i32);
                if (k42 != null && (y3 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length = k42.length()), 0)) < (w10 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length, 0))) {
                    if ((k42.getCurrentStyle(y3, w10) & i10) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i16 = x2(i10);
                    } else {
                        i16 = 0;
                    }
                    i2 i2Var8 = this.H3;
                    if (i2Var8 != null) {
                        i2Var8.d();
                    }
                    this.G3 = true;
                    if (z11) {
                        if (i16 != 0) {
                            k42.removeStyle(i16, y3, w10);
                        }
                        k42.addStyle(i10, y3, w10);
                    } else {
                        k42.removeStyle(i10, y3, w10);
                    }
                    k42.invalidateEffects();
                    k42.requestLayout();
                    g4(i32);
                    this.G3 = false;
                    i2 i2Var9 = this.H3;
                    if (i2Var9 != null) {
                        i2Var9.h();
                    }
                    v3Var.l();
                    p4();
                }
            } else {
                int i33 = k3Var.f22609p0;
                int i34 = k3Var.f22612s0;
                int i35 = k3Var.f22611r0;
                int i36 = k3Var.f22614u0;
                if (i33 >= 0 && i34 >= 0 && i34 >= i33 && i34 < this.f12824n4.size()) {
                    int i37 = i10;
                    boolean K3 = K3(i37, i33, i35, i34, i36);
                    boolean z15 = !K3;
                    if (!K3) {
                        i11 = x2(i37);
                    } else {
                        i11 = 0;
                    }
                    i2 i2Var10 = this.H3;
                    if (i2Var10 != null) {
                        i2Var10.d();
                    }
                    this.G3 = true;
                    int i38 = i33;
                    boolean z16 = false;
                    while (i38 <= i34) {
                        a z42 = z4(i38);
                        if (z42 != null) {
                            TL_iv.PageBlock pageBlock = z42.f12234b;
                            if (B3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int j22 = j2(i38);
                                if (i38 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = i22;
                                }
                                z10 = z16;
                                if (i38 == i34) {
                                    i14 = i36;
                                } else {
                                    i14 = j22;
                                }
                                int max3 = Math.max(i22, Math.min(i13, j22));
                                int max4 = Math.max(i22, Math.min(i14, j22));
                                if (max3 >= max4) {
                                    i12 = i11;
                                    z16 = z10;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                } else {
                                    f6 v22 = v2(i38);
                                    if (v22 != null) {
                                        org.telegram.ui.ActionBar.v4 styleDelegate = v22.getStyleDelegate();
                                        if (!K3) {
                                            if (i11 != 0) {
                                                styleDelegate.removeStyle(i11, max3, max4);
                                            }
                                            styleDelegate.addStyle(i37, max3, max4);
                                        } else {
                                            styleDelegate.removeStyle(i37, max3, max4);
                                        }
                                        v22.getEditText().invalidateEffects();
                                        v22.getEditText().requestLayout();
                                        v22.x();
                                        i12 = i11;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(f6.A(z42.f12234b));
                                        if (!K3 && i11 != 0) {
                                            i12 = i11;
                                            i15 = max3;
                                            h6.o(spannableStringBuilder2, i15, max4, i12, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i12 = i11;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i15 = max3;
                                        }
                                        h6.o(spannableStringBuilder, i15, max4, i37, z15, null);
                                        f6.d(z42.f12234b, spannableStringBuilder);
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
                    this.G3 = i22;
                    if (z17 && (i2Var = this.H3) != null) {
                        i2Var.h();
                    }
                    v3Var.l();
                    if (z17) {
                        p4();
                    }
                }
            }
        }
    }

    public final void Z4(float f7, float f10) {
        TL_iv.pageTableCell m10;
        q5 q5Var = this.f12812g4;
        if (this.f12837z3 && q5Var != null && this.f12834v3 == q5Var && (m10 = q5Var.m((int) ((f7 - q5Var.getLeft()) - getLeft()), (int) ((f10 - q5Var.getTop()) - getTop()))) != null && m10 != this.C3) {
            this.C3 = m10;
            q5Var.w(this.B3, m10);
        }
    }

    public final ArrayList a3() {
        return Z2(0, this.j3.size(), 0, false);
    }

    public final void a4(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.a4(android.view.View):void");
    }

    public final void a5(a aVar, String str) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12234b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    i2 i2Var = this.H3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    f6 v22 = v2(this.j3.indexOf(aVar));
                    if (v22 != null && (aVar2 = v22.f12424x) != null) {
                        v22.I(aVar2.f12234b, true);
                        v22.H = null;
                        v22.C();
                    }
                    i2 i2Var2 = this.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                }
            }
        }
    }

    public final void b2() {
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
            ArrayList arrayList6 = this.j3;
            if (i18 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i18);
                ArrayList arrayList7 = aVar.f12240j;
                ArrayList arrayList8 = aVar.f12241k;
                arrayList7.clear();
                int i19 = 1;
                if (aVar.f12239i) {
                    if (!arrayList.isEmpty()) {
                        a1.g.y(1, arrayList);
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
                        arrayList7.add((q0) arrayList.get(i21));
                    }
                    int max = Math.max(i17, aVar.f12235c);
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
                                arrayList2.add(Long.valueOf(q0.a()));
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
                                if (((Long) arrayList5.get(i23)).longValue() != 0 && F3(aVar.f12234b)) {
                                    i15 = i12;
                                } else {
                                    i15 = i14;
                                }
                                if (i15 != 0) {
                                    arrayList4.set(i23, Integer.valueOf(((Integer) arrayList4.get(i23)).intValue() + 1));
                                    arrayList5.set(i23, Long.valueOf(aVar.f12233a));
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
                    if (y3(aVar)) {
                        boolean z11 = ((TL_iv.pageBlockDetails) aVar.f12234b).open;
                        q0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (f6.p(aVar.f12234b)) {
                        q0.a();
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

    public final boolean b3() {
        a aVar;
        ArrayList arrayList = this.j3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) hg.c.g(1, arrayList);
        }
        if (aVar != null && !F3(aVar.f12234b) && !aVar.f12239i && !y3(aVar) && !L2(aVar.f12234b)) {
            if (!(A1(aVar) instanceof f6)) {
                return false;
            }
            f3(aVar);
            return true;
        }
        i2 i2Var = this.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.W2.N(false);
        i2 i2Var2 = this.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        post(new p2(this, aVar2, 21));
        return true;
    }

    public final void b4() {
        int length;
        int y3;
        int w10;
        int length2;
        int y10;
        int w11;
        int length3;
        int y11;
        int w12;
        int length4;
        int y12;
        int w13;
        i1 O4;
        int length5;
        int y13;
        int w14;
        boolean M3 = M3();
        v3 v3Var = this.f12809f3;
        k3 k3Var = this.f12820l3;
        if (M3) {
            int i10 = k3Var.f22609p0;
            int i11 = k3Var.f22610q0;
            if (i11 == k3Var.f22613t0 && (O4 = O4(i10, i11)) != null && (y13 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length5 = O4.length()), 0)) < (w14 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length5, 0))) {
                if (h6.h(O4.getText(), y13, w14)) {
                    i2 i2Var = this.H3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    h6.n(O4.getText(), y13, w14);
                    O4.invalidateEffects();
                    h4(i10, i11);
                    i2 i2Var2 = this.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    v3Var.l();
                    p4();
                    return;
                }
                i2 i2Var3 = this.H3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                if (h6.g(O4.getText(), y13, w14)) {
                    h6.m(O4.getText(), y13, w14);
                    O4.invalidateEffects();
                    h4(i10, i11);
                    i2 i2Var4 = this.H3;
                    if (i2Var4 != null) {
                        i2Var4.h();
                    }
                    p4();
                }
                O4.setSelectionOverride(y13, w14);
                p3(false);
                F4(O4);
            }
        } else if (z3()) {
            int i12 = k3Var.f22609p0;
            i1 J2 = J2(i12);
            if (J2 != null && (y12 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length4 = J2.length()), 0)) < (w13 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length4, 0))) {
                if (h6.h(J2.getText(), y12, w13)) {
                    i2 i2Var5 = this.H3;
                    if (i2Var5 != null) {
                        i2Var5.d();
                    }
                    h6.n(J2.getText(), y12, w13);
                    J2.invalidateEffects();
                    f4(i12);
                    i2 i2Var6 = this.H3;
                    if (i2Var6 != null) {
                        i2Var6.h();
                    }
                    v3Var.l();
                    p4();
                    return;
                }
                i2 i2Var7 = this.H3;
                if (i2Var7 != null) {
                    i2Var7.d();
                }
                if (h6.g(J2.getText(), y12, w13)) {
                    h6.m(J2.getText(), y12, w13);
                    J2.invalidateEffects();
                    f4(i12);
                    i2 i2Var8 = this.H3;
                    if (i2Var8 != null) {
                        i2Var8.h();
                    }
                    p4();
                }
                J2.setSelectionOverride(y12, w13);
                p3(false);
                F4(J2);
            }
        } else if (x3()) {
            int i13 = k3Var.f22609p0;
            i1 t22 = t2(i13);
            if (t22 != null && (y11 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length3 = t22.length()), 0)) < (w12 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length3, 0))) {
                if (h6.h(t22.getText(), y11, w12)) {
                    i2 i2Var9 = this.H3;
                    if (i2Var9 != null) {
                        i2Var9.d();
                    }
                    h6.n(t22.getText(), y11, w12);
                    t22.invalidateEffects();
                    e4(i13);
                    i2 i2Var10 = this.H3;
                    if (i2Var10 != null) {
                        i2Var10.h();
                    }
                    v3Var.l();
                    p4();
                    return;
                }
                i2 i2Var11 = this.H3;
                if (i2Var11 != null) {
                    i2Var11.d();
                }
                if (h6.g(t22.getText(), y11, w12)) {
                    h6.m(t22.getText(), y11, w12);
                    t22.invalidateEffects();
                    e4(i13);
                    i2 i2Var12 = this.H3;
                    if (i2Var12 != null) {
                        i2Var12.h();
                    }
                    p4();
                }
                t22.setSelectionOverride(y11, w12);
                p3(false);
                F4(t22);
            }
        } else if (H3()) {
            int i14 = k3Var.f22609p0;
            i1 k42 = k4(i14);
            if (k42 != null && (y10 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length2 = k42.length()), 0)) < (w11 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length2, 0))) {
                if (h6.h(k42.getText(), y10, w11)) {
                    i2 i2Var13 = this.H3;
                    if (i2Var13 != null) {
                        i2Var13.d();
                    }
                    h6.n(k42.getText(), y10, w11);
                    k42.invalidateEffects();
                    g4(i14);
                    i2 i2Var14 = this.H3;
                    if (i2Var14 != null) {
                        i2Var14.h();
                    }
                    v3Var.l();
                    p4();
                    return;
                }
                i2 i2Var15 = this.H3;
                if (i2Var15 != null) {
                    i2Var15.d();
                }
                if (h6.g(k42.getText(), y10, w11)) {
                    h6.m(k42.getText(), y10, w11);
                    k42.invalidateEffects();
                    g4(i14);
                    i2 i2Var16 = this.H3;
                    if (i2Var16 != null) {
                        i2Var16.h();
                    }
                    p4();
                }
                k42.setSelectionOverride(y10, w11);
                p3(false);
                F4(k42);
            }
        } else {
            f6 H4 = H4();
            if (H4 == null || (y3 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length = H4.getEditText().length()), 0)) >= (w10 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length, 0))) {
                return;
            }
            if (h6.h(H4.getEditText().getText(), y3, w10)) {
                i2 i2Var17 = this.H3;
                if (i2Var17 != null) {
                    i2Var17.d();
                }
                h6.n(H4.getEditText().getText(), y3, w10);
                H4.getEditText().invalidateEffects();
                H4.x();
                i2 i2Var18 = this.H3;
                if (i2Var18 != null) {
                    i2Var18.h();
                }
                v3Var.l();
                p4();
                return;
            }
            i2 i2Var19 = this.H3;
            if (i2Var19 != null) {
                i2Var19.d();
            }
            if (h6.g(H4.getEditText().getText(), y3, w10)) {
                h6.m(H4.getEditText().getText(), y3, w10);
                H4.getEditText().invalidateEffects();
                H4.x();
                i2 i2Var20 = this.H3;
                if (i2Var20 != null) {
                    i2Var20.h();
                }
                p4();
            }
            H4.getEditText().setSelectionOverride(y3, w10);
            p3(false);
            F4(H4.getEditText());
        }
    }

    public final void c2(MessageObject messageObject) {
        TLRPC.Document document;
        String str;
        if (messageObject != null && (document = messageObject.getDocument()) != null) {
            i2 i2Var = this.H3;
            if (i2Var != null) {
                i2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z10 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            u uVar = new u();
            aVar.f12238g = uVar;
            uVar.f12712c = true;
            long j3 = document.f20044id;
            if (j3 == 0 || document.dc_id == 0 || document.access_hash == 0) {
                z10 = true;
            }
            if (z10) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str = message.attachPath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                u uVar2 = aVar.f12238g;
                uVar2.f12716i = document;
                uVar2.f12713e = str;
                uVar2.f12710a = 1;
                uVar2.f12714f = 0.0f;
            } else {
                uVar.h = document;
                uVar.f12716i = document;
                uVar.f12710a = 2;
                pageblockaudio.audio_id = j3;
            }
            v3(aVar);
            if (z10) {
                u uVar3 = aVar.f12238g;
                String str2 = uVar3.f12713e;
                IdentityHashMap identityHashMap = this.X3;
                c5 c5Var = (c5) identityHashMap.remove(uVar3);
                if (c5Var != null) {
                    c5Var.b();
                }
                c5 c5Var2 = new c5(this.f12805d3, str2, document, new h3(aVar, uVar3, this));
                identityHashMap.put(uVar3, c5Var2);
                c5Var2.d();
            }
            i2 i2Var2 = this.H3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            this.f12809f3.onContentChanged();
        }
    }

    public final void c3(a aVar, boolean z10) {
        int i10;
        View A1 = A1(aVar);
        if (A1 instanceof i5) {
            i1 i1Var = ((i5) A1).f12494r;
            i1Var.r();
            if (z10) {
                i10 = i1Var.length();
            } else {
                i10 = 0;
            }
            i1Var.setSelection(i10);
            return;
        }
        d3(aVar, z10);
    }

    public final void c4() {
        i1 editText;
        Runnable l2Var;
        int length;
        final int y3;
        final int w10;
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x()) {
            if (M3()) {
                int i10 = k3Var.f22609p0;
                int i11 = k3Var.f22610q0;
                if (i11 == k3Var.f22613t0) {
                    editText = O4(i10, i11);
                    l2Var = new q2(this, i10, i11, 1);
                } else {
                    return;
                }
            } else if (z3()) {
                int i12 = k3Var.f22609p0;
                editText = J2(i12);
                l2Var = new k2(this, i12, 3);
            } else if (x3()) {
                int i13 = k3Var.f22609p0;
                editText = t2(i13);
                l2Var = new k2(this, i13, 0);
            } else if (H3()) {
                int i14 = k3Var.f22609p0;
                editText = k4(i14);
                l2Var = new k2(this, i14, 1);
            } else {
                f6 H4 = H4();
                if (H4 != null) {
                    editText = H4.getEditText();
                    l2Var = new l2(H4, 0);
                } else {
                    return;
                }
            }
            final i1 i1Var = editText;
            final Runnable runnable = l2Var;
            if (i1Var != null && (y3 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length = i1Var.length()), 0)) <= (w10 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length, 0))) {
                Editable text = i1Var.getText();
                int i15 = t.h;
                String str = null;
                if (text != null) {
                    t[] tVarArr = (t[]) text.getSpans(y3, w10, t.class);
                    if (tVarArr.length > 0) {
                        str = tVarArr[0].f12696a;
                    }
                }
                if (str == null) {
                    str = i1Var.getText().subSequence(y3, w10).toString();
                }
                final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
                int i16 = org.telegram.ui.ActionBar.i6.G6;
                org.telegram.ui.ActionBar.e6 e6Var = this.f12807e3;
                final int w02 = org.telegram.ui.ActionBar.i6.w0(i16, e6Var);
                r.X(getContext(), str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        t a2;
                        String str2 = (String) obj;
                        x3 x3Var = x3.this;
                        x3Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a2 = t.a(str2, w02, dp)) == null) {
                            return;
                        }
                        i2 i2Var = x3Var.H3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        k3 k3Var2 = x3Var.f12820l3;
                        if (k3Var2 != null) {
                            k3Var2.f(false);
                        }
                        i1 i1Var2 = i1Var;
                        i1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        Editable text2 = i1Var2.getText();
                        int max = Math.max(0, Math.min(y3, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(w10, text2.length())), spannableString);
                        runnable.run();
                        i2 i2Var2 = x3Var.H3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        x3Var.f12809f3.onContentChanged();
                        int min = Math.min(max + 1, i1Var2.length());
                        i1Var2.r();
                        x3Var.post(new w2(i1Var2, min, 3));
                    }
                }, e6Var);
            }
        }
    }

    public final void c5(java.lang.CharSequence r18) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.c5(java.lang.CharSequence):void");
    }

    public final void d2(String str) {
        String str2;
        int i10;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.f20044id = 0L;
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
            e2(tL_document, str);
        }
    }

    public final void d3(a aVar, boolean z10) {
        View A1 = A1(aVar);
        if (A1 instanceof q5) {
            q5 q5Var = (q5) A1;
            i1 i1Var = q5Var.f12644r;
            j6 j6Var = q5Var.F;
            if (j6Var != null) {
                if (!z10) {
                    i1Var.r();
                    i1Var.setSelection(0);
                    return;
                } else if (!j6Var.f12526g.isEmpty()) {
                    t5 m10 = q5Var.v.m((TL_iv.pageTableCell) hg.c.g(1, q5Var.F.f12526g));
                    if (m10 != null) {
                        i1 i1Var2 = m10.f12708a;
                        i1Var2.r();
                        i1Var2.setSelection(i1Var2.length());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (z10 && (A1 instanceof f6)) {
            f6 f6Var = (f6) A1;
            if (f6Var.n()) {
                f6Var.i();
                return;
            }
        }
        i1 S3 = S3(A1);
        if (S3 == null) {
            e3(aVar);
            return;
        }
        S3.r();
        if (z10) {
            S3.setSelection(S3.length());
        }
    }

    public final void d4() {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.d4():void");
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
        boolean z10;
        a aVar4;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                arrayList = this.f12824n4;
                if (i13 >= childCount) {
                    break;
                }
                int R = RecyclerView.R(getChildAt(i13));
                if (R >= 0 && R < arrayList.size()) {
                    aVar4 = (a) arrayList.get(R);
                } else {
                    aVar4 = null;
                }
                if (aVar4 != null) {
                    ArrayList arrayList3 = aVar4.f12241k;
                    if (arrayList3.size() > i14) {
                        i14 = arrayList3.size();
                    }
                }
                i13++;
            }
            if (i14 != 0) {
                if (this.f12826o4 == null) {
                    xm0 xm0Var = new xm0(this);
                    this.f12826o4 = xm0Var;
                    xm0Var.a(null, null, null, this.f12807e3, 1);
                    n8.a(this.f12826o4, this.f12807e3);
                }
                int i15 = 0;
                while (i15 < i14) {
                    float f10 = 0.0f;
                    long j3 = 0;
                    int i16 = 0;
                    boolean z11 = false;
                    a aVar5 = null;
                    a aVar6 = null;
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
                                ArrayList arrayList4 = aVar.f12241k;
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
                        if (!z11 || (l4 != null && l4.longValue() == j3)) {
                            l10 = l4;
                            i11 = i15;
                            i12 = i14;
                            arrayList2 = arrayList;
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f7 = f11;
                        } else {
                            int l42 = l4(i15, aVar5, true);
                            l10 = l4;
                            int l43 = l4(i15, aVar6, false);
                            if (f12 - f10 <= AndroidUtilities.dp(4.0f)) {
                                i11 = i15;
                                i12 = i14;
                                arrayList2 = arrayList;
                            } else {
                                int dp = AndroidUtilities.dp(16.0f) * i15;
                                i11 = i15;
                                int dp2 = AndroidUtilities.dp(16.0f) + dp;
                                i12 = i14;
                                arrayList2 = arrayList;
                                int B = org.telegram.messenger.q.B(16.0f, getWidth(), dp);
                                if (B - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, l42 + f10, B, f12 - l43);
                                    aVar2 = aVar5;
                                    aVar3 = aVar6;
                                    this.f12826o4.b(canvas, rectF, floor, floor, floor, f11);
                                    f7 = f11;
                                    this.f12826o4.e(canvas, rectF, f7);
                                    z11 = false;
                                }
                            }
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f7 = f11;
                            z11 = false;
                        }
                        if (view != null && l10 != null) {
                            if (!z11) {
                                j3 = l10.longValue();
                                f10 = Float.MAX_VALUE;
                                f12 = -3.4028235E38f;
                                aVar5 = aVar;
                                z10 = true;
                                f7 = 1.0f;
                            } else {
                                aVar5 = aVar2;
                                z10 = z11;
                            }
                            if (aVar != null && aVar == this.Q3) {
                                z11 = z10;
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
                                i16++;
                                aVar6 = aVar;
                                childCount = i10;
                                i15 = i11;
                                i14 = i12;
                                arrayList = arrayList2;
                            }
                        } else {
                            aVar5 = aVar2;
                            aVar = aVar3;
                        }
                        f11 = f7;
                        i16++;
                        aVar6 = aVar;
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

    public final void e2(TLRPC.Document document, String str) {
        if (document != null) {
            i2 i2Var = this.H3;
            if (i2Var != null) {
                i2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z10 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            u uVar = new u();
            aVar.f12238g = uVar;
            uVar.d = true;
            long j3 = document.f20044id;
            if (j3 == 0 || document.dc_id == 0 || document.access_hash == 0) {
                z10 = true;
            }
            if (z10) {
                if (!TextUtils.isEmpty(str) && sc.v.u(str)) {
                    u uVar2 = aVar.f12238g;
                    uVar2.h = document;
                    uVar2.f12713e = str;
                    uVar2.f12710a = 1;
                    uVar2.f12714f = 0.0f;
                } else {
                    return;
                }
            } else {
                uVar.h = document;
                uVar.f12710a = 2;
                pageblockdocument.document_id = j3;
            }
            v3(aVar);
            if (z10) {
                u uVar3 = aVar.f12238g;
                IdentityHashMap identityHashMap = this.X3;
                c5 c5Var = (c5) identityHashMap.remove(uVar3);
                if (c5Var != null) {
                    c5Var.b();
                }
                c5 c5Var2 = new c5(this.f12805d3, str, document, new g3(this, uVar3, aVar, str));
                identityHashMap.put(uVar3, c5Var2);
                c5Var2.d();
            }
            i2 i2Var2 = this.H3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            this.f12809f3.onContentChanged();
        }
    }

    public final void e3(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof f6) {
            ((f6) A1).B();
        } else if (A1 instanceof u0) {
            ((u0) A1).d.r();
        }
    }

    public final void e4(int i10) {
        View B4 = B4(i10);
        if (B4 instanceof m0) {
            ((m0) B4).b();
        }
    }

    public final void f2(Uri uri) {
        boolean contains;
        if (uri != null) {
            a aVar = this.Z3;
            String str = null;
            this.Z3 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            String str2 = str;
            if (str2 != null) {
                contains = str2.startsWith("video");
            } else {
                contains = uri.toString().contains("video");
            }
            boolean z10 = contains;
            int i10 = this.f12828p4;
            this.f12828p4 = i10 - 1;
            Utilities.globalQueue.postRunnable(new s2(this, uri, z10, str2, i10, aVar));
        }
    }

    public final void f3(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof f6) {
            f6 f6Var = (f6) A1;
            f6Var.B();
            i1 editText = f6Var.getEditText();
            editText.setSelection(editText.length());
        } else if (A1 instanceof u0) {
            u0 u0Var = (u0) A1;
            u0Var.d.r();
            i1 editText2 = u0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void f4(int i10) {
        a z42 = z4(i10);
        i1 J2 = J2(i10);
        if (y3(z42) && J2 != null) {
            ((TL_iv.pageBlockDetails) z42.f12234b).title = h6.f(J2.getText());
        }
    }

    public final void g2(MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        x3 x3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        i2 i2Var = this.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        boolean c10 = y4.c(photoEntry);
        if (!photoEntry.isVideo && !c10) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        a aVar = new a(pageblockvideo, 0, 0);
        aVar.f12238g = U3(photoEntry, str2);
        v3(aVar);
        if (c10) {
            L4(aVar, aVar.f12238g, photoEntry);
            x3Var = this;
        } else {
            x3Var = this;
            x3Var.M4(aVar, aVar.f12238g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        i2 i2Var2 = x3Var.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        x3Var.f12809f3.onContentChanged();
    }

    public final void g3(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof f6) {
            f6 f6Var = (f6) A1;
            f6Var.B();
            f6Var.getEditText().setSelection(0);
        } else if (A1 instanceof u0) {
            u0 u0Var = (u0) A1;
            u0Var.d.r();
            u0Var.getEditText().setSelection(0);
        }
    }

    public final void g4(int i10) {
        View B4 = B4(i10);
        if (B4 instanceof f6) {
            ((f6) B4).w();
        }
    }

    public i1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof i1) {
            return (i1) findFocus;
        }
        return null;
    }

    public o4 getMapDelegate() {
        return this.f12803b4;
    }

    public View getOverlayView() {
        return this.f12821m3;
    }

    public o9 getTextSelectionHelper() {
        return this.f12820l3;
    }

    public final void h2(q5 q5Var) {
        q5 q5Var2 = this.f12812g4;
        if (q5Var2 != null && q5Var2 != q5Var) {
            LinkedHashSet linkedHashSet = q5Var2.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                q5Var2.v.invalidate();
                q5Var2.t();
            }
        }
        this.f12812g4 = q5Var;
        this.A3 = false;
        this.f12817j4 = -1;
        this.f12816i4 = -1;
        q5Var.setCellSelectionListener(this.f12819k4);
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x()) {
            k3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void h4(int i10, int i11) {
        t5 m10;
        View B4 = B4(i10);
        if (B4 instanceof q5) {
            q5 q5Var = (q5) B4;
            if (i11 == 0) {
                q5Var.u();
                return;
            }
            TL_iv.pageTableCell h = q5Var.h(i11);
            if (h != null && (m10 = q5Var.getGrid().m(h)) != null) {
                j6.d(h, m10.f12708a.getText());
            }
        }
    }

    public final o3 i2() {
        int i10;
        int i11;
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x() && !H3()) {
            a z42 = z4(k3Var.f22609p0);
            ArrayList arrayList = this.j3;
            int indexOf = arrayList.indexOf(z42);
            int indexOf2 = arrayList.indexOf(z4(k3Var.f22612s0));
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
                    if (aVar.f12239i || y3(aVar)) {
                        return null;
                    }
                }
                return new o3(this, i10, i11, k3Var.f22611r0, k3Var.f22614u0);
            }
            return null;
        }
        return null;
    }

    public final boolean i3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.i3(android.view.KeyEvent):boolean");
    }

    public final int j2(int i10) {
        i1 J2 = J2(i10);
        if (J2 != null) {
            return J2.length();
        }
        f6 v22 = v2(i10);
        if (v22 != null) {
            return v22.getEditText().length();
        }
        a z42 = z4(i10);
        if (z42 == null) {
            return 0;
        }
        return f6.z(z42.f12234b).length();
    }

    public final boolean j3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.j3(android.view.MotionEvent):boolean");
    }

    public final int j4(int i10) {
        Layout layout;
        View B4 = B4(i10);
        if (!(B4 instanceof f6) || (layout = ((f6) B4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage k2() {
        if (l3()) {
            ArrayList<TL_iv.PageBlock> a32 = a3();
            if (a32.isEmpty()) {
                return null;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = a32;
            richMessage.photos = C2();
            richMessage.documents = z2();
            return richMessage;
        }
        return null;
    }

    public final boolean k3(ii.q5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.k3(ii.q5, int, int):boolean");
    }

    public final i1 k4(int i10) {
        View B4 = B4(i10);
        if (B4 instanceof f6) {
            return ((f6) B4).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock l2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.l2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean l3() {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.l3():boolean");
    }

    public final boolean m2() {
        i1 editText;
        int length;
        int y3;
        int w10;
        m4[] m4VarArr;
        k3 k3Var = this.f12820l3;
        if (k3Var == null || !k3Var.x() || k3Var.f22609p0 != k3Var.f22612s0) {
            return false;
        }
        if (M3()) {
            int i10 = k3Var.f22609p0;
            int i11 = k3Var.f22610q0;
            if (i11 != k3Var.f22613t0) {
                return false;
            }
            editText = O4(i10, i11);
        } else if (z3()) {
            editText = J2(k3Var.f22609p0);
        } else if (x3()) {
            editText = t2(k3Var.f22609p0);
        } else if (H3()) {
            editText = k4(k3Var.f22609p0);
        } else {
            f6 H4 = H4();
            if (H4 == null) {
                return false;
            }
            editText = H4.getEditText();
        }
        if (editText == null || (y3 = hg.c.y(k3Var.f22611r0, k3Var.f22614u0, (length = editText.length()), 0)) >= (w10 = hg.c.w(k3Var.f22611r0, k3Var.f22614u0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && y3 < w10) {
            for (m4 m4Var : (m4[]) text.getSpans(y3, w10, m4.class)) {
                if (text.getSpanStart(m4Var) < w10 && text.getSpanEnd(m4Var) > y3) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean n2() {
        int[] E4 = E4();
        if (E4 == null) {
            return o2(E2());
        }
        for (int i10 = E4[0]; i10 <= E4[1]; i10++) {
            if (o2((a) this.j3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean n3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.j3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            for (u uVar : R3((a) arrayList.get(i10))) {
                if (uVar.a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean n4(int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.j3;
            if (i11 < arrayList.size()) {
                i2 i2Var = this.H3;
                if (i2Var != null) {
                    i2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i11 >= i10) {
                        if (r3(i11, true, true)) {
                            z11 = true;
                        }
                        i11--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i10);
                    if (aVar.f12235c >= 1 && (i10 == 0 || ((a) arrayList.get(i10 - 1)).f12235c < aVar.f12235c)) {
                        return false;
                    }
                    z11 = false;
                    while (i10 <= i11) {
                        if (r3(i10, false, true)) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    t4();
                    if (findFocus() instanceof i1) {
                        Y1();
                    } else {
                        this.W2.N(false);
                    }
                    i2 i2Var2 = this.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final boolean o2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar != null && (indexOf = (arrayList = this.j3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f12235c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f12234b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !p2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f12235c < aVar2.f12235c) {
                return false;
            }
            if (q3(indexOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof f6) {
                f6 f6Var = (f6) childAt;
                f6Var.f12419f.hideActionMode();
                f6Var.h.hideActionMode();
            } else if (childAt instanceof q5) {
                q5 q5Var = (q5) childAt;
                s5 s5Var = q5Var.v;
                q5Var.f12644r.hideActionMode();
                for (int i11 = 0; i11 < s5Var.getChildCount(); i11++) {
                    View childAt2 = s5Var.getChildAt(i11);
                    if (childAt2 instanceof t5) {
                        ((t5) childAt2).f12708a.hideActionMode();
                    }
                }
            } else if (childAt instanceof m0) {
                ((m0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof u0) {
                ((u0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void o4(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof w4) {
            w4 w4Var = (w4) A1;
            ArrayList arrayList = w4Var.f12787y;
            if (w4Var.f12251a != null) {
                w4Var.n();
                if (w4Var.W >= arrayList.size()) {
                    w4Var.W = Math.max(0, arrayList.size() - 1);
                }
                w4Var.o(false);
                w4Var.requestLayout();
                w4Var.invalidate();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.K3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.K3);
        this.Y2 = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        View F;
        int i14 = i13 - i11;
        int i15 = this.I3;
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
                int dp = (AndroidUtilities.dp(8.0f) + F.getBottom()) - (i14 - getPaddingBottom());
                if (dp > 0) {
                    post(new k2(this, dp, 2));
                }
            }
        }
        this.I3 = i14;
    }

    public final boolean p2(int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.j3;
            if (i10 < arrayList.size() && F3(((a) arrayList.get(i10)).f12234b) && ((a) arrayList.get(i10 - 1)).f12235c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p3(boolean z10) {
        k3 k3Var = this.f12820l3;
        if (k3Var != null) {
            if (z10) {
                k3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(k3Var.m0);
                k3Var.u();
            }
        }
        if (z10) {
            W2();
        } else {
            o3();
        }
    }

    public final void p4() {
        post(new b(this, 3));
    }

    public final boolean q2() {
        int[] E4 = E4();
        if (E4 == null) {
            return r2(E2());
        }
        for (int i10 = E4[0]; i10 <= E4[1]; i10++) {
            if (r2((a) this.j3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean q3(int i10) {
        if (((a) this.j3.get(i10)).f12235c + 1 <= MessagesController.getInstance(this.f12805d3).config.richMessageMaxDepth.get() - 6) {
            return true;
        }
        return false;
    }

    public final void q4(int i10) {
        ArrayList arrayList = this.j3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f12235c > 0) {
                View A1 = A1(aVar);
                if (A1 instanceof f6) {
                    ((f6) A1).F();
                }
            }
        }
    }

    public final boolean r2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.j3).indexOf(aVar)) < 0 || aVar.f12235c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f12235c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean r3(int i10, boolean z10, boolean z11) {
        boolean z12;
        a aVar;
        int i11;
        int i12 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.j3;
            if (i10 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar2.f12235c > 0) {
                        u2(i10);
                        return true;
                    }
                } else if (aVar2.f12235c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f12234b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if ((z12 || p2(i10)) && q3(i10)) {
                        if (i10 > 0) {
                            aVar = (a) arrayList.get(i10 - 1);
                        } else {
                            aVar = null;
                        }
                        if (z12) {
                            aVar2.f12235c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i12 = 1;
                            }
                            aVar2.d = i12;
                            return true;
                        }
                        aVar2.f12235c = aVar.f12235c;
                        if (aVar.d > 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        aVar2.d = i11;
                        aVar2.f12236e = false;
                        aVar2.f12237f = false;
                        return true;
                    }
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).f12235c >= aVar2.f12235c)) && q3(i10)) {
                    aVar2.f12235c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void r4(a aVar, u uVar) {
        int i10;
        if (aVar == null) {
            return;
        }
        if (C3(aVar.f12234b)) {
            ArrayList h32 = h3(aVar.f12234b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(uVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                aVar.h.remove(i10);
                if (h32 != null && i10 < h32.size()) {
                    h32.remove(i10);
                }
            }
            if (aVar.h.isEmpty()) {
                s4(aVar);
                return;
            }
            int size = aVar.h.size();
            c71 c71Var = this.W2;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f12234b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) h32.get(0);
                aVar.f12234b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f12238g = (u) aVar.h.get(0);
                aVar.h = null;
                c71Var.N(true);
                o4(aVar);
                return;
            }
            c71Var.N(true);
            o4(aVar);
            return;
        }
        s4(aVar);
    }

    public final boolean s2() {
        i2 i2Var = this.H3;
        if (i2Var != null) {
            if (i2Var.f12485e || !i2Var.f12483b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s3(boolean z10) {
        a aVar;
        int i10;
        int i11;
        int[] E4 = E4();
        if (E4 != null && (i10 = E4[0]) != (i11 = E4[1])) {
            n4(i10, i11, z10);
            return;
        }
        if (E4 == null) {
            aVar = E2();
        } else {
            aVar = (a) this.j3.get(E4[0]);
        }
        if (aVar != null) {
            X3(aVar, z10);
        }
    }

    public final void s4(a aVar) {
        ArrayList arrayList = this.j3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.W2.N(true);
        }
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.f12813h3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.P3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.f12811g3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.L3 = new ArrayList();
        ArrayList arrayList = this.j3;
        X2(arrayList, e5.b(charSequence), this.f12818k3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.L3.add((a) arrayList.get(size));
        }
        this.W2.N(false);
    }

    public final i1 t2(int i10) {
        View B4 = B4(i10);
        if (B4 instanceof m0) {
            return ((m0) B4).getCaptionEditText();
        }
        return null;
    }

    public final void t3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f12241k;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size && i10 < arrayList.size() && ((Long) arrayList3.get(i10)).equals(arrayList.get(i10))) {
            i10++;
        }
        for (int i11 = size - 1; i11 >= i10; i11--) {
            Long l4 = (Long) arrayList3.get(i11);
            long longValue = l4.longValue();
            Integer num = (Integer) hashMap.get(l4);
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.f12818k3.containsKey(l4))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f12250t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.f12241k.add((Long) arrayList3.get(i12));
                }
                int i13 = h5.f12464a;
                p61 J = p61.J(h5.class);
                J.G = aVar2;
                J.H = this.f12806d4;
                arrayList2.add(J);
                this.f12824n4.add(aVar2);
            }
        }
    }

    public final void t4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.j3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (aVar.f12235c > 0 && aVar.d > 0 && !F3(aVar.f12234b)) {
                    int i11 = aVar.f12235c;
                    int i12 = 1;
                    for (int i13 = i10 - 1; i13 >= 0; i13--) {
                        a aVar2 = (a) arrayList.get(i13);
                        int i14 = aVar2.f12235c;
                        if (i14 < i11) {
                            break;
                        }
                        if (i14 == i11 && !F3(aVar2.f12234b)) {
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

    public final void u2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.j3;
        a aVar2 = (a) arrayList.get(i10);
        int i12 = aVar2.f12235c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            aVar2.f12235c = i13;
            if (i13 == 0) {
                aVar2.d = 0;
                aVar2.f12236e = false;
                aVar2.f12237f = false;
            }
            while (true) {
                i10++;
                if (i10 < arrayList.size() && (i11 = (aVar = (a) arrayList.get(i10)).f12235c) > i12) {
                    aVar.f12235c = i11 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void u3() {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.u3():void");
    }

    public final void u4(String str) {
        k3 k3Var = this.f12820l3;
        X1(k3Var.f22609p0, k3Var.f22611r0, k3Var.f22612s0, k3Var.f22614u0, str.split("\n", -1));
    }

    public final f6 v2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m10 = this.V2.m(i10);
        if (!(m10 instanceof f6)) {
            return null;
        }
        return (f6) m10;
    }

    public final void v3(ii.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.v3(ii.a):void");
    }

    public final u v4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document T2 = T2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (T2 == null) {
                return null;
            }
            u uVar = new u();
            uVar.f12712c = true;
            uVar.f12710a = 2;
            uVar.h = T2;
            uVar.f12716i = T2;
            return uVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document T22 = T2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (T22 == null) {
                return null;
            }
            u uVar2 = new u();
            uVar2.d = true;
            uVar2.f12710a = 2;
            uVar2.h = T22;
            return uVar2;
        } else {
            int i10 = 0;
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document T23 = T2(pageblockvideo.video_id);
                if (T23 == null) {
                    return null;
                }
                u uVar3 = new u();
                uVar3.f12711b = true;
                uVar3.f12710a = 2;
                uVar3.h = T23;
                uVar3.f12721n = pageblockvideo.spoiler;
                while (i10 < T23.attributes.size()) {
                    if (T23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) T23.attributes.get(i10);
                        uVar3.f12717j = tL_documentAttributeVideo.f20045w;
                        uVar3.f12718k = tL_documentAttributeVideo.h;
                        return uVar3;
                    }
                    i10++;
                }
                return uVar3;
            } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
                return null;
            } else {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                long j3 = pageblockphoto.photo_id;
                int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i11 == 0) {
                    photo = null;
                } else {
                    int i12 = 0;
                    loop1: while (true) {
                        if (i12 < this.j3.size()) {
                            for (u uVar4 : R3((a) this.j3.get(i12))) {
                                if (uVar4 != null && (photo = uVar4.f12715g) != null && photo.f20062id == j3) {
                                    break loop1;
                                }
                            }
                            i12++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f12815i3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i10);
                                    i10++;
                                    photo = photo2;
                                    if (photo != null && photo.f20062id == j3) {
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = x4.f12838a;
                            synchronized (x4.class) {
                                if (i11 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) x4.f12838a.get(Long.valueOf(j3));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                u uVar5 = new u();
                uVar5.f12710a = 2;
                uVar5.f12715g = photo;
                uVar5.f12721n = pageblockphoto.spoiler;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null) {
                    uVar5.f12717j = closestPhotoSizeWithSize.f20063w;
                    uVar5.f12718k = closestPhotoSizeWithSize.h;
                }
                return uVar5;
            }
        }
    }

    public final void w2() {
        H2();
        this.f12815i3 = null;
        this.Z3 = null;
        this.f12802a4 = null;
        this.H3 = new i2(this.f12822m4);
        A4();
        this.H3.j();
        v3 v3Var = this.f12809f3;
        if (v3Var != null) {
            v3Var.H();
        }
    }

    public final void w4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f12815i3 != null && aVar != null && (pageBlock = aVar.f12234b) != null) {
            if (C3(pageBlock)) {
                ArrayList h32 = h3(aVar.f12234b);
                aVar.h = new ArrayList();
                if (h32 != null) {
                    for (int i10 = 0; i10 < h32.size(); i10++) {
                        u v42 = v4((TL_iv.PageBlock) h32.get(i10));
                        ArrayList arrayList = aVar.h;
                        if (v42 == null) {
                            v42 = new u();
                        }
                        arrayList.add(v42);
                    }
                    return;
                }
                return;
            }
            u v43 = v4(aVar.f12234b);
            if (v43 != null) {
                aVar.f12238g = v43;
            }
        }
    }

    public final boolean x3() {
        int i10;
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x() && (i10 = k3Var.f22609p0) == k3Var.f22612s0 && i10 >= 0 && i10 < this.f12824n4.size()) {
            return B4(i10) instanceof m0;
        }
        return false;
    }

    public final ArrayList x4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (C3(aVar.f12234b)) {
                ArrayList h32 = h3(aVar.f12234b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (h32 != null) {
                    int size2 = h32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = h32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        u v42 = v4(pageBlock);
                        if (v42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(v42);
                        }
                    }
                    h32.clear();
                    h32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.f12234b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    u v43 = v4(pageBlock2);
                    if (v43 != null) {
                        aVar.f12238g = v43;
                        arrayList2.add(aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final boolean y2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.j3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.f12239i;
            ArrayList arrayList2 = aVar.f12241k;
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
            ArrayList arrayList3 = aVar2.f12241k;
            if (arrayList3.size() == 1 && (aVar2.f12234b instanceof TL_iv.pageBlockParagraph)) {
                Long l4 = (Long) arrayList3.get(0);
                l4.getClass();
                Integer num = (Integer) hashMap.get(l4);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f12234b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f12818k3.remove(l4);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f12234b = pageblockblockquote;
                    arrayList3.clear();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void y4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof n4) {
                a0 a0Var = (a0) ((n4) childAt);
                a0Var.f12252b.a(a0Var.f12251a, new ei.c5(a0Var, 13));
            }
        }
        invalidate();
    }

    public final ArrayList z2() {
        TLRPC.Document document;
        u uVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.j3;
            if (i10 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i10);
                if ((aVar.f12234b instanceof TL_iv.pageBlockDocument) && (uVar = aVar.f12238g) != null && uVar.b() && (document2 = aVar.f12238g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f12234b).document_id = document2.f20044id;
                }
                for (u uVar2 : R3(aVar)) {
                    if (uVar2.b() && (document = uVar2.h) != null) {
                        long j3 = document.f20044id;
                        if (j3 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j3))) {
                            arrayList.add(uVar2.h);
                        }
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final boolean z3() {
        int i10;
        k3 k3Var = this.f12820l3;
        if (k3Var != null && k3Var.x() && (i10 = k3Var.f22609p0) == k3Var.f22612s0 && y3(z4(i10))) {
            return true;
        }
        return false;
    }

    public final a z4(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f12824n4;
            if (i10 < arrayList.size()) {
                return (a) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }
}
