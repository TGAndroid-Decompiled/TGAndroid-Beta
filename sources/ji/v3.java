package ji;

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
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.v51;
import v7.c9;
public final class v3 extends d61 {
    public static final ArrayList f14265s4 = new ArrayList();
    public boolean A3;
    public boolean B3;
    public boolean C3;
    public TL_iv.pageTableCell D3;
    public TL_iv.pageTableCell E3;
    public long F3;
    public float G3;
    public float H3;
    public boolean I3;
    public g2 J3;
    public int K3;
    public h1 L3;
    public final i M3;
    public ArrayList N3;
    public int O3;
    public int P3;
    public int Q3;
    public boolean R3;
    public a S3;
    public boolean T3;
    public final n3 U3;
    public final r2 V3;
    public final o3 W3;
    public final p3 X3;
    public final q3 Y3;
    public final IdentityHashMap Z3;
    public final IdentityHashMap f14266a4;
    public a f14267b4;
    public a f14268c4;
    public final r3 f14269d4;
    public final z2 f14270e4;
    public final int f14271f3;
    public final a3 f14272f4;
    public final org.telegram.ui.ActionBar.f6 f14273g3;
    public final b3 f14274g4;
    public final t3 f14275h3;
    public final c3 f14276h4;
    public MessageObject f14277i3;
    public s5 f14278i4;
    public boolean j3;
    public n70 f14279j4;
    public TL_iv.RichMessage f14280k3;
    public int f14281k4;
    public final ArrayList f14282l3;
    public int l4;
    public final HashMap f14283m3;
    public final s2 f14284m4;
    public final i3 f14285n3;
    public final d3 f14286n4;
    public final ca f14287o3;
    public final a6.m f14288o4;
    public int f14289p3;
    public final ArrayList f14290p4;
    public int f14291q3;
    public sl0 f14292q4;
    public int f14293r3;
    public int f14294r4;
    public boolean f14295s3;
    public float f14296t3;
    public float f14297u3;
    public float f14298v3;
    public float f14299w3;
    public View f14300x3;
    public b y3;
    public boolean f14301z3;

    public v3(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, t3 t3Var) {
        super(context, i10, 0, false, new ii.a(r1, 4), new fi.f(r1, 25), null, f6Var);
        this.j3 = true;
        this.f14282l3 = new ArrayList();
        this.f14283m3 = new HashMap();
        this.f14289p3 = -1;
        this.f14291q3 = -1;
        this.f14293r3 = 0;
        this.M3 = new i(this, 2);
        this.R3 = true;
        this.U3 = new n3(this);
        this.V3 = new r2(this);
        this.W3 = new o3(this);
        this.X3 = new p3(this);
        this.Y3 = new q3(this);
        this.Z3 = new IdentityHashMap();
        this.f14266a4 = new IdentityHashMap();
        this.f14269d4 = new r3(this);
        this.f14270e4 = new z2(this);
        this.f14272f4 = new a3(this);
        this.f14274g4 = new b3(this);
        this.f14276h4 = new c3(this);
        this.f14281k4 = -1;
        this.l4 = -1;
        this.f14284m4 = new s2(this);
        this.f14286n4 = new d3(this);
        a6.m mVar = new a6.m(this, 27);
        this.f14288o4 = mVar;
        this.f14290p4 = new ArrayList();
        this.f14294r4 = -1;
        v3[] v3VarArr = {this};
        this.f14271f3 = i10;
        this.f14273g3 = f6Var;
        this.f14275h3 = t3Var;
        this.Y2.f31162r = false;
        setClipToPadding(false);
        setClipChildren(false);
        A1(new ii.a(this, 5), false);
        setReorderLongPressEnabled(false);
        v1(true);
        i3 i3Var = new i3(this, t3Var);
        this.f14285n3 = i3Var;
        i3Var.T(this);
        i3Var.E0 = this.X2;
        ca o9 = i3Var.o(context);
        this.f14287o3 = o9;
        AndroidUtilities.removeFromParent(o9);
        i3Var.D = new k3(this, t3Var);
        j(new l3(0, this, t3Var));
        this.J3 = new g2(mVar);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !A3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockDivider) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockButtonRow) && !(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            return false;
        }
        return true;
    }

    public static boolean E3(a aVar) {
        if (aVar != null && !aVar.f13763i && !w3(aVar) && (aVar.f13758b instanceof TL_iv.pageBlockParagraph) && aVar.f13759c == 0 && aVar.d == 0 && !aVar.f13760e && aVar.f13765k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void H1(ji.v3[] r20, java.util.ArrayList r21, org.telegram.ui.Components.v51 r22) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.H1(ji.v3[], java.util.ArrayList, org.telegram.ui.Components.v51):void");
    }

    public static void I2(ArrayList arrayList, a aVar) {
        int i10;
        int i11;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j3;
        TL_iv.PageBlock pageBlock = aVar.f13758b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            u uVar = aVar.f13762g;
            if (uVar != null && uVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f13758b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f13758b.caption.text = new TL_iv.textEmpty();
                        aVar.f13758b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f13758b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            u uVar2 = aVar.f13762g;
            if (uVar2 != null && uVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f13758b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f13758b.caption.text = new TL_iv.textEmpty();
                        aVar.f13758b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f13758b);
                }
            }
        } else if (A3(pageBlock)) {
            ArrayList f32 = f3(aVar.f13758b);
            List P3 = P3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i12 = 0; f32 != null && i12 < f32.size() && i12 < P3.size(); i12++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) f32.get(i12);
                if (((u) P3.get(i12)).b()) {
                    if (pageBlock4 instanceof TL_iv.pageBlockPhoto) {
                        j3 = ((TL_iv.pageBlockPhoto) pageBlock4).photo_id;
                    } else if (pageBlock4 instanceof TL_iv.pageBlockVideo) {
                        j3 = ((TL_iv.pageBlockVideo) pageBlock4).video_id;
                    } else {
                        j3 = 0;
                    }
                    if (j3 != 0) {
                        k0.d(pageBlock4);
                        arrayList2.add(pageBlock4);
                    }
                }
            }
            if (arrayList2.size() >= 2) {
                if (aVar.f13758b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f13758b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f13758b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                k0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f13758b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                u uVar3 = aVar.f13762g;
                if (uVar3 != null && uVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f13758b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f13758b.caption.text = new TL_iv.textEmpty();
                            aVar.f13758b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f13758b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                u uVar4 = aVar.f13762g;
                if (uVar4 != null && (document = uVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f19902id;
                }
                if (uVar4 != null && uVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f13758b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        k0.d(pageBlock7);
                        arrayList.add(aVar.f13758b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
                int i13 = p4.M;
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
                    arrayList.add(aVar.f13758b);
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
                                    k6.c(pagetablecell, "");
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
                if (N4(pageblocktable)) {
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

    public static void J1(v3 v3Var, int i10, int i11, int i12) {
        h1 editText;
        if (i10 >= 0) {
            View m10 = v3Var.X2.m(i10);
            if (m10 instanceof g6) {
                g6 g6Var = (g6) m10;
                if (i11 == 1 && g6Var.n()) {
                    editText = g6Var.getAuthorEditText();
                } else {
                    editText = g6Var.getEditText();
                }
                editText.s();
                editText.setSelection(Math.max(0, Math.min(i12, editText.length())));
            } else if (m10 instanceof s5) {
                s5 s5Var = (s5) m10;
                h1 l4 = s5Var.l(i11);
                if (l4 == null) {
                    l4 = s5Var.l(0);
                }
                if (l4 != null) {
                    l4.s();
                    l4.setSelection(Math.max(0, Math.min(i12, l4.length())));
                }
            } else if (m10 instanceof l0) {
                h1 captionEditText = ((l0) m10).getCaptionEditText();
                captionEditText.s();
                captionEditText.setSelection(Math.max(0, Math.min(i12, captionEditText.length())));
            }
        }
    }

    public static boolean J2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static org.telegram.tgnet.tl.TL_iv.PageBlock K1(ji.v3 r2, ji.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.K1(ji.v3, ji.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public static void K2(TL_iv.PageBlock pageBlock) {
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

    public static void L1(v3 v3Var, h1 h1Var) {
        if (h1Var == null) {
            v3Var.getClass();
            return;
        }
        h1Var.adaptiveCreateLinkDialog = v3Var.j3;
        h1Var.setInlineButtonContext(v3Var.f14271f3);
        h1Var.setInlineButtonClickListener(new s2(v3Var));
    }

    public static void M1(a aVar, u uVar, v3 v3Var) {
        t3 t3Var = v3Var.f14275h3;
        IdentityHashMap identityHashMap = v3Var.f14266a4;
        IdentityHashMap identityHashMap2 = v3Var.Z3;
        if (uVar == null) {
            ArrayList arrayList = v3Var.f14282l3;
            for (u uVar2 : P3(aVar)) {
                d5 d5Var = (d5) identityHashMap2.remove(uVar2);
                if (d5Var != null) {
                    d5Var.b();
                }
                y4 y4Var = (y4) identityHashMap.remove(uVar2);
                if (y4Var != null) {
                    y4Var.a();
                }
            }
            int indexOf = arrayList.indexOf(aVar);
            if (indexOf >= 0) {
                g2 g2Var = v3Var.J3;
                if (g2Var != null) {
                    g2Var.d();
                }
                arrayList.remove(indexOf);
                v3Var.Y2.N(true);
                g2 g2Var2 = v3Var.J3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
            }
            t3Var.onContentChanged();
            return;
        }
        d5 d5Var2 = (d5) identityHashMap2.remove(uVar);
        if (d5Var2 != null) {
            d5Var2.b();
        }
        y4 y4Var2 = (y4) identityHashMap.remove(uVar);
        if (y4Var2 != null) {
            y4Var2.a();
        }
        g2 g2Var3 = v3Var.J3;
        if (g2Var3 != null) {
            g2Var3.d();
        }
        v3Var.p4(aVar, uVar);
        g2 g2Var4 = v3Var.J3;
        if (g2Var4 != null) {
            g2Var4.h();
        }
        t3Var.onContentChanged();
    }

    public static void M2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z10, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            R1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z11, z12);
                        } else {
                            a aVar = new a(pageBlock, i10, i11);
                            aVar.f13760e = z11;
                            aVar.f13761f = z12;
                            arrayList.add(aVar);
                        }
                        z13 = true;
                    } else {
                        arrayList.add(new a(pageBlock, i10, z10 ? 1 : 0));
                    }
                } else {
                    if (!z13) {
                        R1(arrayList, null, i10, i11, z11, z12);
                        z13 = true;
                    }
                    N2(arrayList, pageBlock, i10 + 1);
                }
            }
        }
        if (!z13) {
            R1(arrayList, null, i10, i11, z11, z12);
        }
    }

    public static TL_iv.PageBlock M3(a aVar, u uVar) {
        int i10;
        if (A3(aVar.f13758b)) {
            ArrayList f32 = f3(aVar.f13758b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(uVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0 && f32 != null && i10 < f32.size()) {
                return (TL_iv.PageBlock) f32.get(i10);
            }
            return null;
        }
        return aVar.f13758b;
    }

    public static void N1(v3 v3Var) {
        if (v3Var.I3) {
            return;
        }
        g2 g2Var = v3Var.J3;
        if (g2Var != null) {
            g2Var.h();
        }
        v3Var.f14275h3.f();
        v3Var.n4();
    }

    public static void N2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
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
                    R1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i13 = i12;
                    M2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
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
                R1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                M2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static boolean N4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(i6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!k6.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void O1(v3 v3Var, a aVar) {
        ArrayList arrayList = v3Var.f14282l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        g2 g2Var = v3Var.J3;
        if (g2Var != null) {
            g2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f13765k.addAll(aVar.f13765k);
        arrayList.add(indexOf + 1, aVar2);
        v3Var.r4();
        v3Var.Y2.N(false);
        g2 g2Var2 = v3Var.J3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        v3Var.post(new n2(v3Var, aVar2, 23));
    }

    public static FrameLayout O4(s5 s5Var, boolean z10) {
        int i10;
        v5 m10;
        k6 model = s5Var.getModel();
        if (model != null) {
            int i11 = Integer.MAX_VALUE;
            if (z10) {
                i10 = -1;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : s5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o9 = z10 ? (k6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o9 < i10 || (o9 == i10 && a2 < i11) : o9 > i10 || (o9 == i10 && a2 < i11)) {
                    pagetablecell = pagetablecell2;
                    i11 = a2;
                    i10 = o9;
                }
            }
            if (pagetablecell != null && (m10 = s5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return s5Var;
    }

    public static boolean P1(ji.v3 r16, ji.a r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.P1(ji.v3, ji.a, boolean):boolean");
    }

    public static List P3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (A3(aVar.f13758b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        u uVar = aVar.f13762g;
        if (uVar != null) {
            return Collections.singletonList(uVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static h1 Q3(View view) {
        if (view instanceof g6) {
            return ((g6) view).getEditText();
        }
        if (view instanceof l0) {
            return ((l0) view).getCaptionEditText();
        }
        if (view instanceof t0) {
            return ((t0) view).getEditText();
        }
        return null;
    }

    public static void R1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i10, i11);
        aVar.f13760e = z10;
        aVar.f13761f = z11;
        arrayList.add(aVar);
    }

    public static TL_iv.PageBlock R3(TL_iv.PageBlock pageBlock) {
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

    public static u S3(MediaController.PhotoEntry photoEntry, String str) {
        boolean z10;
        int i10;
        u uVar = new u();
        uVar.f14222b = photoEntry.isVideo;
        uVar.f14224e = str;
        uVar.f14228j = photoEntry.width;
        uVar.f14229k = photoEntry.height;
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
        uVar.f14230l = i10;
        if (!z10) {
            i11 = photoEntry.invert;
        }
        uVar.f14231m = i11;
        uVar.f14221a = 1;
        uVar.f14225f = 0.0f;
        return uVar;
    }

    public static s5 T2(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof s5) {
                return (s5) parent;
            }
        }
        return null;
    }

    public static void V2(ArrayList arrayList, ArrayList arrayList2, Map map) {
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
                        V2(arrayList, pageblockdetails.blocks, map);
                        if (arrayList.size() == size2) {
                            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        aVar.f13763i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a2 = p0.a();
                        V2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f13765k.add(0, Long.valueOf(a2));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a2), pageblockblockquoteblocks.caption);
                        }
                    } else {
                        arrayList.add(new a(pageBlock, 0, 0));
                    }
                } else {
                    N2(arrayList, pageBlock, 1);
                }
            }
        }
    }

    public static ArrayList W2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        V2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void Y1(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] Z4(s5 s5Var) {
        int i10;
        int i11;
        k6 k6Var = s5Var.F;
        if (k6Var != null) {
            i10 = k6Var.f14054g.size();
        } else {
            i10 = 0;
        }
        while (i10 >= 0) {
            h1 l4 = s5Var.l(i10);
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

    public static ArrayList f3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean g4(h1 h1Var, float f7, float f10) {
        if (h1Var != null && h1Var.getVisibility() == 0) {
            int[] iArr = new int[2];
            h1Var.getLocationOnScreen(iArr);
            float f11 = f7 - iArr[0];
            float f12 = f10 - iArr[1];
            if (f11 >= 0.0f && f12 >= 0.0f && f11 <= h1Var.getWidth() && f12 <= h1Var.getHeight()) {
                int offsetForPosition = h1Var.getOffsetForPosition(f11, f12);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                h1Var.s();
                h1Var.setSelection(Math.max(0, Math.min(offsetForPosition, h1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int j4(int i10, a aVar, boolean z10) {
        int i11;
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        if (z10) {
            i11 = aVar.f13766l;
        } else {
            i11 = aVar.f13767m;
        }
        int size = aVar.f13765k.size() - i11;
        return org.telegram.messenger.w1.D(16.0f, Math.max(0, i10 - size), AndroidUtilities.dp(2.0f));
    }

    public static boolean k3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !C3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int k4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f13765k;
        int i10 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f13765k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i10 < min && ((Long) arrayList.get(i10)).equals(arrayList2.get(i10))) {
            i10++;
        }
        return i10;
    }

    public void setEditTextsLocked(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof g6) {
                ((g6) childAt).setLocked(z10);
            } else if (childAt instanceof s5) {
                ((s5) childAt).setLocked(z10);
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof t0) {
                ((t0) childAt).setLocked(z10);
            } else if (childAt instanceof x0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean u3(int i10) {
        if (i10 != 21 && i10 != 22 && i10 != 19 && i10 != 20) {
            return false;
        }
        return true;
    }

    public static int v2(int i10) {
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

    public static boolean w3(a aVar) {
        if (aVar != null && (aVar.f13758b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean y3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || D3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !g6.z(pageBlock).isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        if (!D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public final ArrayList A2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f14282l3;
            if (i10 < arrayList2.size()) {
                for (u uVar : P3((a) arrayList2.get(i10))) {
                    if (uVar.b() && (photo = uVar.f14226g) != null && hashSet.add(Long.valueOf(photo.f19920id))) {
                        arrayList.add(uVar.f14226g);
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final int[] A4() {
        int i10;
        ArrayList arrayList = this.f14282l3;
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y()) {
            int indexOf = arrayList.indexOf(x4(i3Var.f22527u0));
            int indexOf2 = arrayList.indexOf(x4(i3Var.f22530x0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        a P2 = P2();
        if (P2 != null) {
            i10 = arrayList.indexOf(P2);
        } else {
            i10 = -1;
        }
        if (i10 >= 0) {
            return new int[]{i10, i10};
        }
        return null;
    }

    @Override
    public final void B1() {
        t3 t3Var = this.f14275h3;
        if (t3Var != null) {
            t3Var.n();
        }
    }

    public final void B2() {
        g2 g2Var = this.J3;
        if (g2Var != null) {
            g2Var.h();
        }
        ArrayList arrayList = this.f14282l3;
        SpannableStringBuilder k10 = f5.k(arrayList);
        F2();
        arrayList.clear();
        HashMap hashMap = this.f14283m3;
        hashMap.clear();
        this.f14280k3 = null;
        V2(arrayList, f5.b(k10), hashMap);
        this.Y2.N(false);
        g2 g2Var2 = this.J3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        t3 t3Var = this.f14275h3;
        if (t3Var != null) {
            t3Var.onContentChanged();
            t3Var.u();
        }
    }

    public final boolean B4() {
        int i10;
        int i11;
        int i12;
        int i13;
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y()) {
            if (K3()) {
                int i14 = i3Var.f22527u0;
                int i15 = i3Var.f22528v0;
                int i16 = i3Var.f22531y0;
                int i17 = i3Var.f22529w0;
                int i18 = i3Var.f22532z0;
                for (int i19 = i15; i19 <= i16; i19++) {
                    h1 M4 = M4(i14, i19);
                    if (M4 != null) {
                        int length = M4.length();
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
            } else if (x3()) {
                h1 H2 = H2(i3Var.f22527u0);
                if (H2 != null && Math.max(0, Math.min(Math.min(i3Var.f22529w0, i3Var.f22532z0), H2.length())) < Math.max(0, Math.min(Math.max(i3Var.f22529w0, i3Var.f22532z0), H2.length()))) {
                    return true;
                }
            } else if (v3()) {
                h1 r22 = r2(i3Var.f22527u0);
                if (r22 != null) {
                    int i20 = i3Var.f22529w0;
                    int i21 = i3Var.f22532z0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), r22.length())) < Math.max(0, Math.min(Math.max(i20, i21), r22.length()))) {
                        return true;
                    }
                }
            } else if (F3()) {
                h1 i42 = i4(i3Var.f22527u0);
                if (i42 != null) {
                    int i22 = i3Var.f22529w0;
                    int i23 = i3Var.f22532z0;
                    if (Math.max(0, Math.min(Math.min(i22, i23), i42.length())) < Math.max(0, Math.min(Math.max(i22, i23), i42.length()))) {
                        return true;
                    }
                }
            } else {
                int i24 = i3Var.f22527u0;
                int i25 = i3Var.f22530x0;
                int i26 = i3Var.f22529w0;
                int i27 = i3Var.f22532z0;
                if (i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < this.f14290p4.size()) {
                    for (int i28 = i24; i28 <= i25; i28++) {
                        a x42 = x4(i28);
                        if (x42 != null) {
                            if (x42.f13774t == 0) {
                                TL_iv.PageBlock pageBlock = x42.f13758b;
                                if (!z3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int h22 = h2(i28);
                            if (i28 == i24) {
                                i10 = i26;
                            } else {
                                i10 = 0;
                            }
                            if (i28 == i25) {
                                i11 = i27;
                            } else {
                                i11 = h22;
                            }
                            if (Math.max(0, Math.min(i10, h22)) < Math.max(0, Math.min(i11, h22))) {
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
    public final void C1() {
        t3 t3Var = this.f14275h3;
        if (t3Var != null) {
            t3Var.r();
        }
        w4();
    }

    public final a C2() {
        int i10;
        a x42;
        a P2 = P2();
        if (P2 != null) {
            return P2;
        }
        i3 i3Var = this.f14285n3;
        if (i3Var != null && (i10 = i3Var.f22527u0) >= 0 && (x42 = x4(i10)) != null) {
            return x42;
        }
        return null;
    }

    public final int[] C4() {
        i3 i3Var = this.f14285n3;
        if (i3Var != null) {
            int i10 = i3Var.f22527u0;
            int i11 = i3Var.f22530x0;
            if (i10 >= 0 && i11 >= 0) {
                a x42 = x4(i10);
                a x43 = x4(i11);
                if (x42 != null && x43 != null) {
                    ArrayList arrayList = this.f14282l3;
                    int indexOf = arrayList.indexOf(x42);
                    int indexOf2 = arrayList.indexOf(x43);
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
    public final void D1(s4.c1 c1Var) {
        t3 t3Var = this.f14275h3;
        if (t3Var != null && c1Var != null) {
            View view = c1Var.f45766a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.T3 = t3Var.a(view.getHeight() + iArr[1]);
        }
    }

    public final void D2() {
        ArrayList arrayList;
        i3 i3Var = this.f14285n3;
        int i10 = i3Var.f22527u0;
        int i11 = i3Var.f22529w0;
        int i12 = i3Var.f22530x0;
        if (!V1(i10, i11, i12, i3Var.f22532z0, new String[]{""})) {
            if (i10 > i12) {
                i12 = i10;
                i10 = i12;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i10);
            while (true) {
                arrayList = this.f14282l3;
                if (max > i12) {
                    break;
                }
                ArrayList arrayList3 = this.f14290p4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f13774t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                g2 g2Var = this.J3;
                if (g2Var != null) {
                    g2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f14283m3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        hashSet.addAll(((a) arrayList.get(i13)).f13765k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                w2();
                U3();
                r4();
                i3Var.f(false);
                this.Y2.N(false);
                g2 g2Var2 = this.J3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                post(new n2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void D4(h1 h1Var) {
        h1Var.adaptiveCreateLinkDialog = this.j3;
        h1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override
    public final void E1(s4.c1 c1Var) {
        a aVar = this.S3;
        this.S3 = null;
        this.T3 = false;
        if (aVar != null) {
            g2 g2Var = this.J3;
            if (g2Var != null) {
                g2Var.d();
            }
            q4(aVar);
            g2 g2Var2 = this.J3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            t3 t3Var = this.f14275h3;
            if (t3Var != null) {
                t3Var.onContentChanged();
            }
        } else if (c1Var != null) {
            View view = c1Var.f45766a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean E2() {
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y()) {
            i3Var.f(false);
            return true;
        } else if (this.f14278i4 == null) {
            return false;
        } else {
            L2();
            return true;
        }
    }

    public final void E4(ji.s5 r34) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.E4(ji.s5):void");
    }

    @Override
    public final void F1(s4.c1 c1Var) {
        int b10;
        h51 G;
        a aVar = null;
        if (c1Var != null && (b10 = c1Var.b()) >= 0 && (G = this.Y2.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.S3 = aVar;
        this.T3 = false;
        t3 t3Var = this.f14275h3;
        if (t3Var != null) {
            t3Var.l();
        }
    }

    public final void F2() {
        i3 i3Var = this.f14285n3;
        if (i3Var != null) {
            i3Var.f(true);
        }
        L2();
        m3();
        IdentityHashMap identityHashMap = this.Z3;
        for (d5 d5Var : identityHashMap.values()) {
            d5Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.f14266a4;
        for (y4 y4Var : identityHashMap2.values()) {
            y4Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean F3() {
        int i10;
        a x42;
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y() && (i10 = i3Var.f22527u0) == i3Var.f22530x0 && i10 >= 0 && i10 < this.f14290p4.size() && i3Var.f22528v0 == 1 && i3Var.f22531y0 == 1 && (x42 = x4(i10)) != null && g6.p(x42.f13758b)) {
            return true;
        }
        return false;
    }

    public final g6 F4() {
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y()) {
            int i10 = i3Var.f22527u0;
            int i11 = i3Var.f22530x0;
            a x42 = x4(i10);
            if (i10 == i11 && x42 != null && z3(x42.f13758b)) {
                return t2(i10);
            }
            return null;
        }
        return null;
    }

    public final int G2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.f14282l3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (w3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).f13763i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean G3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f14282l3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.f13763i && !w3(aVar)) {
                        if (!aVar.f13765k.isEmpty() || g6.p(aVar.f13758b)) {
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

    public final Editable G4(int i10, int i11, int i12, int i13) {
        if (i10 == i12) {
            if (w3(x4(i10))) {
                h1 H2 = H2(i10);
                if (H2 != null) {
                    return H2.getText();
                }
                return null;
            } else if (F3()) {
                h1 i42 = i4(i10);
                if (i42 != null) {
                    return i42.getText();
                }
                return null;
            } else {
                a x42 = x4(i10);
                if (x42 != null && z3(x42.f13758b)) {
                    int h22 = h2(i10);
                    if (i2.g.y(i11, i13, h22, 0) < i2.g.g(i11, i13, h22, 0)) {
                        g6 t22 = t2(i10);
                        if (t22 != null) {
                            return t22.getEditText().getText();
                        }
                        return g6.A(x42.f13758b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final h1 H2(int i10) {
        if (!w3(x4(i10))) {
            return null;
        }
        View z42 = z4(i10);
        if (!(z42 instanceof t0)) {
            return null;
        }
        return ((t0) z42).getEditText();
    }

    public final boolean H3() {
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y()) {
            int i10 = i3Var.f22527u0;
            int i11 = i3Var.f22530x0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a x42 = x4(i10);
                    if (x42 != null) {
                        if (B3(x42.f13758b)) {
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

    public final boolean H4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.H4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean I3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.I3(int, int, int, int, int):boolean");
    }

    public final void I4(View view) {
        s4.c1 T;
        int b10;
        if (view != null && this.Z2 != null && this.f25308c3 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.Y2.H(b10) >= 0) {
            this.A3 = true;
            i3 i3Var = this.f14285n3;
            if (i3Var.y()) {
                i3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.Z2.r(T);
        }
    }

    public final boolean J3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        boolean z10 = false;
        for (int i18 = i12; i18 <= i14; i18++) {
            h1 M4 = M4(i11, i18);
            if (M4 != null) {
                int length = M4.length();
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
                } else if ((M4.getCurrentStyle(max, max2) & i10) == 0) {
                    return false;
                } else {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void J4(a aVar, u uVar, MediaController.PhotoEntry photoEntry) {
        int i10;
        float f7;
        d5 d5Var = (d5) this.Z3.remove(uVar);
        if (d5Var != null) {
            d5Var.b();
        }
        IdentityHashMap identityHashMap = this.f14266a4;
        y4 y4Var = (y4) identityHashMap.remove(uVar);
        if (y4Var != null) {
            y4Var.a();
        }
        uVar.f14221a = 1;
        uVar.f14225f = 0.0f;
        y4 y4Var2 = new y4(this.f14271f3, photoEntry, new g3(aVar, uVar, this));
        identityHashMap.put(uVar, y4Var2);
        if (!y4Var2.f14381f && !y4Var2.h && !y4Var2.f14382n) {
            y4Var2.f14381f = true;
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
                tL_message.f19917id = 1;
                String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
                y4Var2.f14380e = absolutePath;
                tL_message.attachPath = absolutePath;
                MessageObject messageObject = new MessageObject(y4Var2.f14377a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                y4Var2.f14379c = messageObject;
                messageObject.videoEditedInfo = y4Var2.d;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(y4Var2.f14377a);
                notificationCenter.addObserver(y4Var2, NotificationCenter.filePreparingStarted);
                notificationCenter.addObserver(y4Var2, NotificationCenter.fileNewChunkAvailable);
                notificationCenter.addObserver(y4Var2, NotificationCenter.filePreparingFailed);
                MediaController.getInstance().scheduleVideoConvert(y4Var2.f14379c, false, false, false);
                return;
            }
            y4Var2.b();
        }
    }

    public final boolean K3() {
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y()) {
            int i10 = i3Var.f22527u0;
            int i11 = i3Var.f22530x0;
            a x42 = x4(i10);
            if (i10 == i11 && x42 != null && (x42.f13758b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K4(a aVar, u uVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.Z3;
        d5 d5Var = (d5) identityHashMap.remove(uVar);
        if (d5Var != null) {
            d5Var.b();
        }
        d5 d5Var2 = new d5(this.f14271f3, str, z10, i10, i11, i12, new h3(aVar, uVar, this));
        identityHashMap.put(uVar, d5Var2);
        d5Var2.d();
    }

    public final void L2() {
        if (this.B3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.B3 = false;
        this.C3 = false;
        this.D3 = null;
        this.E3 = null;
        n70 n70Var = this.f14279j4;
        if (n70Var != null) {
            this.f14279j4 = null;
            n70Var.u();
        }
        s5 s5Var = this.f14278i4;
        if (s5Var != null) {
            LinkedHashSet linkedHashSet = s5Var.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                s5Var.v.invalidate();
                s5Var.t();
            }
            this.f14278i4 = null;
        }
        this.l4 = -1;
        this.f14281k4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean L3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.f14271f3).config;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f14282l3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += P3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList Y2 = Y2();
        ?? obj = new Object();
        obj.d = i11;
        obj.f13983b = Y2.size() + obj.f13983b;
        for (int i12 = 0; i12 < Y2.size(); i12++) {
            h2.b((TL_iv.PageBlock) Y2.get(i12), 1, obj);
        }
        if (obj.f13982a > appGlobalConfig.richMessageLengthLimit.get() || obj.f13983b > appGlobalConfig.richMessageMaxBlocks.get() || obj.f13984c > appGlobalConfig.richMessageMaxDepth.get() || obj.d > appGlobalConfig.richMessageMaxMedia.get() || obj.f13985e > appGlobalConfig.richMessageMaxTableCols.get()) {
            return false;
        }
        return true;
    }

    public final Editable L4(a aVar) {
        View y12 = y1(aVar);
        if (y12 instanceof g6) {
            return ((g6) y12).getEditText().getText();
        }
        return g6.A(aVar.f13758b);
    }

    public final h1 M4(int i10, int i11) {
        View z42 = z4(i10);
        if (!(z42 instanceof s5)) {
            return null;
        }
        return ((s5) z42).l(i11);
    }

    public final int[] N3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.N3.size(); i12++) {
            int length = g6.z(((a) this.N3.get(i12)).f13758b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.N3.size() - 1;
        return new int[]{size, g6.z(((a) this.N3.get(size)).f13758b).length()};
    }

    public final h1 O2() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return (h1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof g6) {
                return ((g6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int O3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f14282l3;
            if (i12 < arrayList.size()) {
                a aVar = (a) arrayList.get(i12);
                if (w3(aVar)) {
                    i11++;
                } else if (aVar.f13763i && i11 - 1 == 0) {
                    return i12;
                }
                i12++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final a P2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof g6) {
                g6 g6Var = (g6) childAt;
                if (g6Var.getEditText().isFocused() || (g6Var.n() && g6Var.h.isFocused())) {
                    return g6Var.getRow();
                }
            }
        }
        return null;
    }

    public final void P4() {
        boolean z10;
        int[] A4 = A4();
        if (A4 != null) {
            int i10 = A4[0];
            int i11 = A4[1];
            if (i10 >= 0) {
                ArrayList arrayList = this.f14282l3;
                if (i11 < arrayList.size() && i10 <= i11) {
                    g2 g2Var = this.J3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    if (G3(i10, i11)) {
                        for (int i12 = i10; i12 <= i11; i12++) {
                            a aVar = (a) arrayList.get(i12);
                            boolean z11 = aVar.f13763i;
                            ArrayList arrayList2 = aVar.f13765k;
                            if (!z11 && !w3(aVar)) {
                                if (g6.p(aVar.f13758b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f13758b.text;
                                    aVar.f13758b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    a4.a.x(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a2 = p0.a();
                        for (int i13 = i10; i13 <= i11; i13++) {
                            a aVar2 = (a) arrayList.get(i13);
                            boolean z12 = aVar2.f13763i;
                            ArrayList arrayList3 = aVar2.f13765k;
                            if (!z12 && !w3(aVar2)) {
                                if (g6.p(aVar2.f13758b)) {
                                    long a10 = p0.a();
                                    TL_iv.RichText k10 = g6.k(aVar2.f13758b);
                                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                        this.f14283m3.put(Long.valueOf(a10), k10);
                                    }
                                    arrayList3.add(Long.valueOf(a10));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f13758b.text;
                                    aVar2.f13758b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a2));
                            }
                        }
                    }
                    w2();
                    U3();
                    r4();
                    i3 i3Var = this.f14285n3;
                    if (i3Var != null && i3Var.y()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
                    this.Y2.N(false);
                    g2 g2Var2 = this.J3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    if (z10) {
                        post(new hg.t(this, aVar3, aVar4, 16));
                    } else {
                        post(new n2(this, aVar3, 9));
                    }
                }
            }
        }
    }

    public final void Q1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.Q1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final s5 Q2() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return T2((h1) findFocus);
        }
        return null;
    }

    public final void Q4(ji.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.Q4(ji.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final TLRPC.Document R2(long j3) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        TLRPC.Document document2 = null;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0) {
            return null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14282l3.size(); i12++) {
            for (u uVar : P3((a) this.f14282l3.get(i12))) {
                if (uVar != null && (document = uVar.h) != null && document.f19902id == j3) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f14280k3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.Document document3 = arrayList.get(i11);
                i11++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f19902id == j3) {
                    return document4;
                }
            }
        }
        HashMap hashMap = x4.f14357a;
        synchronized (x4.class) {
            if (i10 != 0) {
                document2 = (TLRPC.Document) x4.f14358b.get(Long.valueOf(j3));
            }
        }
        return document2;
    }

    public final boolean R4() {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.R4():boolean");
    }

    public final void S1(a aVar, MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        v3 v3Var;
        if (aVar != null && C3(aVar.f13758b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                g2 g2Var = this.J3;
                if (g2Var != null) {
                    g2Var.d();
                }
                u S3 = S3(photoEntry, str2);
                boolean c10 = y4.c(photoEntry);
                if (!photoEntry.isVideo && !c10) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (A3(aVar.f13758b)) {
                    f3(aVar.f13758b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(S3);
                } else {
                    u uVar = aVar.f13762g;
                    if (uVar != null && uVar.f14221a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f13758b.caption;
                        k0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f13758b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f13762g);
                        aVar.h.add(S3);
                        aVar.f13762g = null;
                        aVar.f13758b = pageblockcollage;
                    } else {
                        aVar.f13758b = pageblockvideo;
                        aVar.f13762g = S3;
                    }
                }
                this.Y2.N(false);
                m4(aVar);
                if (c10) {
                    J4(aVar, S3, photoEntry);
                    v3Var = this;
                } else {
                    v3Var = this;
                    v3Var.K4(aVar, S3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                g2 g2Var2 = v3Var.J3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                v3Var.f14275h3.onContentChanged();
            }
        }
    }

    public final int S2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f14282l3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f13763i) {
                int i12 = 0;
                int i13 = -1;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (w3(aVar2)) {
                        i12++;
                        if (i13 == -1 && !((TL_iv.pageBlockDetails) aVar2.f13758b).open) {
                            i13 = i12;
                        }
                    } else if (aVar2.f13763i) {
                        if (i13 != -1 && i12 == i13) {
                            i13 = -1;
                        }
                        i12--;
                    }
                }
                if (i13 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f13758b;
                    if (!D3(pageBlock) || k3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i10;
                    }
                }
            }
            i10 += i11;
        }
        return -1;
    }

    public final boolean S4(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.S4(android.view.View, float, float):boolean");
    }

    public final void T1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            g2 g2Var = this.J3;
            if (g2Var != null) {
                g2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f14280k3;
            if (richMessage2 == null) {
                this.f14280k3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f14280k3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            V2(arrayList4, richMessage.blocks, this.f14283m3);
            if (!arrayList4.isEmpty()) {
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    u4((a) arrayList4.get(i10));
                }
                ArrayList arrayList5 = this.f14282l3;
                int size = arrayList5.size();
                a P2 = P2();
                if (P2 != null && (indexOf = arrayList5.indexOf(P2)) >= 0) {
                    TL_iv.PageBlock pageBlock = P2.f13758b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && g6.z(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                U3();
                r4();
                this.Y2.N(false);
                g2 g2Var2 = this.J3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                t3 t3Var = this.f14275h3;
                if (t3Var != null) {
                    t3Var.onContentChanged();
                }
            }
        }
    }

    public final a T3(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f14290p4;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f13763i) {
                    if (aVar.f13774t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f13758b;
                        if (D3(pageBlock) && !k3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
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

    public final void T4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        Editable A;
        if (aVar == null) {
            aVar = W4();
        }
        a aVar2 = aVar;
        if (aVar2 != null && pageBlock != null) {
            ArrayList arrayList = this.f14282l3;
            if (arrayList.indexOf(aVar2) >= 0 && !w3(aVar2) && !aVar2.f13763i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f13758b;
                if (pageBlock != pageBlock2 && z3(pageBlock2) && z3(pageBlock)) {
                    g6 t22 = t2(arrayList.indexOf(aVar2));
                    if (t22 != null) {
                        A = t22.getEditText().getText();
                    } else {
                        A = g6.A(aVar2.f13758b);
                    }
                    g6.e(pageBlock, A);
                    TL_iv.RichText k10 = g6.k(aVar2.f13758b);
                    if (k10 != null && g6.k(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = k10;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = k10;
                        }
                    }
                }
                Q4(aVar2, pageBlock, i10, i11, z10, z11);
            }
        }
    }

    public final a U1(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.f14290p4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i11 = indexOf + i10) >= 0 && i11 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i11);
            if (aVar2.f13774t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final void U2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof g6) {
                g6 g6Var = (g6) childAt;
                g6Var.f13959f.n();
                g6Var.h.n();
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof t0) {
                ((t0) childAt).getEditText().n();
            }
        }
    }

    public final void U3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14282l3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f13765k.isEmpty() && g6.p(aVar.f13758b)) {
                    long a2 = p0.a();
                    TL_iv.RichText k10 = g6.k(aVar.f13758b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        this.f14283m3.put(Long.valueOf(a2), k10);
                    }
                    aVar.f13765k.add(Long.valueOf(a2));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f13758b.text;
                    aVar.f13758b = pageblockparagraph;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void U4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = W4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        T4(aVar2, pageBlock, aVar2.f13759c, aVar2.d, aVar2.f13760e, aVar2.f13761f);
    }

    public final boolean V1(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.V1(int, int, int, int, java.lang.String[]):boolean");
    }

    public final boolean V3(ji.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.V3(ji.a, boolean):boolean");
    }

    public final void V4(a aVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        if (aVar == null) {
            aVar = W4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            T4(aVar2, aVar2.f13758b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f13759c);
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
        TL_iv.PageBlock pageBlock = aVar2.f13758b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        if (z10 && aVar2.f13761f) {
            z11 = true;
        } else {
            z11 = false;
        }
        T4(aVar2, pageBlock, max, i11, z10, z11);
    }

    public final void W1() {
        g6 g6Var;
        a aVar;
        d6 d6Var;
        this.Y2.S();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof g6) && (aVar = (g6Var = (g6) childAt).f13964x) != null && (d6Var = g6Var.f13965y) != null) {
                g6Var.g(aVar, d6Var, g6Var.E);
            }
        }
    }

    public final void W3() {
        int length;
        int y3;
        int g10;
        int length2;
        int y10;
        int g11;
        int length3;
        int y11;
        int g12;
        int length4;
        int y12;
        int g13;
        h1 M4;
        int length5;
        int y13;
        int g14;
        boolean K3 = K3();
        i3 i3Var = this.f14285n3;
        if (K3) {
            int i10 = i3Var.f22527u0;
            int i11 = i3Var.f22528v0;
            if (i11 == i3Var.f22531y0 && (M4 = M4(i10, i11)) != null && (y13 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length5 = M4.length()), 0)) < (g14 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length5, 0))) {
                g2 g2Var = this.J3;
                if (g2Var != null) {
                    g2Var.d();
                }
                if (i6.h(M4.getText(), y13, g14)) {
                    i6.n(M4.getText(), y13, g14);
                    M4.invalidateEffects();
                    f4(i10, i11);
                    g2 g2Var2 = this.J3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    n4();
                }
                M4.setSelectionOverride(y13, g14);
                M4.makeSelectedDate();
            }
        } else if (x3()) {
            int i12 = i3Var.f22527u0;
            h1 H2 = H2(i12);
            if (H2 != null && (y12 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length4 = H2.length()), 0)) < (g13 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length4, 0))) {
                g2 g2Var3 = this.J3;
                if (g2Var3 != null) {
                    g2Var3.d();
                }
                if (i6.h(H2.getText(), y12, g13)) {
                    i6.n(H2.getText(), y12, g13);
                    H2.invalidateEffects();
                    d4(i12);
                    g2 g2Var4 = this.J3;
                    if (g2Var4 != null) {
                        g2Var4.h();
                    }
                    n4();
                }
                H2.setSelectionOverride(y12, g13);
                H2.makeSelectedDate();
            }
        } else if (v3()) {
            int i13 = i3Var.f22527u0;
            h1 r22 = r2(i13);
            if (r22 != null && (y11 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length3 = r22.length()), 0)) < (g12 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length3, 0))) {
                g2 g2Var5 = this.J3;
                if (g2Var5 != null) {
                    g2Var5.d();
                }
                if (i6.h(r22.getText(), y11, g12)) {
                    i6.n(r22.getText(), y11, g12);
                    r22.invalidateEffects();
                    c4(i13);
                    g2 g2Var6 = this.J3;
                    if (g2Var6 != null) {
                        g2Var6.h();
                    }
                    n4();
                }
                r22.setSelectionOverride(y11, g12);
                r22.makeSelectedDate();
            }
        } else if (F3()) {
            int i14 = i3Var.f22527u0;
            h1 i42 = i4(i14);
            if (i42 != null && (y10 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length2 = i42.length()), 0)) < (g11 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length2, 0))) {
                g2 g2Var7 = this.J3;
                if (g2Var7 != null) {
                    g2Var7.d();
                }
                if (i6.h(i42.getText(), y10, g11)) {
                    i6.n(i42.getText(), y10, g11);
                    i42.invalidateEffects();
                    e4(i14);
                    g2 g2Var8 = this.J3;
                    if (g2Var8 != null) {
                        g2Var8.h();
                    }
                    n4();
                }
                i42.setSelectionOverride(y10, g11);
                i42.makeSelectedDate();
            }
        } else {
            g6 F4 = F4();
            if (F4 == null || (y3 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length = F4.getEditText().length()), 0)) >= (g10 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length, 0))) {
                return;
            }
            g2 g2Var9 = this.J3;
            if (g2Var9 != null) {
                g2Var9.d();
            }
            if (i6.h(F4.getEditText().getText(), y3, g10)) {
                i6.n(F4.getEditText().getText(), y3, g10);
                F4.getEditText().invalidateEffects();
                F4.x();
                g2 g2Var10 = this.J3;
                if (g2Var10 != null) {
                    g2Var10.h();
                }
                n4();
            }
            F4.getEditText().setSelectionOverride(y3, g10);
            F4.getEditText().makeSelectedDate();
        }
    }

    public final a W4() {
        i3 i3Var;
        int i10;
        a P2 = P2();
        if (P2 == null && (i3Var = this.f14285n3) != null && i3Var.y() && (i10 = i3Var.f22527u0) == i3Var.f22530x0) {
            return x4(i10);
        }
        return P2;
    }

    public final boolean X1(int i10, int i11) {
        i3 i3Var;
        ArrayList arrayList = this.N3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] N3 = N3(max);
            int[] N32 = N3(max2);
            a aVar = (a) this.N3.get(N3[0]);
            if (N3[0] != N32[0] && max != max2) {
                View y12 = y1(aVar);
                View y13 = y1(this.N3.get(N32[0]));
                if ((y12 instanceof g6) && (y13 instanceof g6)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f14282l3;
                        int size = arrayList2.size();
                        i3Var = this.f14285n3;
                        if (i12 >= size) {
                            break;
                        }
                        i3Var.Y(i12, g6.z(((a) arrayList2.get(i12)).f13758b));
                        i12++;
                    }
                    g6 g6Var = (g6) y12;
                    int length = g6Var.getEditText().length();
                    if (N3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!i3Var.k0(g6Var, 0, N3[1], length)) {
                        g6Var.B();
                        return true;
                    }
                    i3Var.c0(0, N32[1], (g6) y13);
                    return true;
                }
            } else {
                View y14 = y1(aVar);
                if (y14 instanceof g6) {
                    g6 g6Var2 = (g6) y14;
                    g6Var2.B();
                    h1 editText = g6Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(N3[1], length2), Math.min(N32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList X2(int i10, int i11, int i12, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z11;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.f14282l3;
            a aVar = (a) arrayList2.get(i15);
            boolean z12 = aVar.f13763i;
            ArrayList arrayList3 = aVar.f13765k;
            if (z12) {
                i15++;
            } else if (arrayList3.size() > i12) {
                Long l4 = (Long) arrayList3.get(i12);
                long longValue = l4.longValue();
                int i16 = i15 + 1;
                while (i16 < i11) {
                    a aVar2 = (a) arrayList2.get(i16);
                    if (aVar2.f13765k.size() <= i12 || ((Long) aVar2.f13765k.get(i12)).longValue() != longValue) {
                        break;
                    }
                    i16++;
                }
                ArrayList<TL_iv.PageBlock> X2 = X2(i15, i16, i12 + 1, true);
                if (X2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f14283m3.get(l4);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (X2.size() == 1 && (X2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        if (X2.get(0).text != null) {
                            textempty = X2.get(0).text;
                        } else {
                            textempty = new TL_iv.textEmpty();
                        }
                        pageblockblockquote.text = textempty;
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = X2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i15 = i16;
            } else if (w3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f13758b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int O3 = O3(i15);
                pageblockdetails.blocks = X2(i15 + 1, Math.min(O3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = O3 + 1;
            } else {
                int i17 = aVar.f13759c;
                if (i17 <= 0) {
                    I2(arrayList, aVar);
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    int[] iArr = {i15};
                    if (aVar.d > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i13 = i11;
                    i14 = i12;
                    TL_iv.PageBlock j22 = j2(i15, i17, i13, i14, z11, iArr);
                    if (j22 != null) {
                        arrayList.add(j22);
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
            while (!arrayList.isEmpty() && y3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && y3((TL_iv.PageBlock) i2.g.h(1, arrayList))) {
                a4.a.x(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void X3(int i10) {
        int i11;
        g2 g2Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        SpannableStringBuilder spannableStringBuilder;
        int i15;
        int length;
        int y3;
        int g10;
        boolean z11;
        int i16;
        int length2;
        int y10;
        int g11;
        boolean z12;
        int i17;
        int length3;
        int y11;
        int g12;
        boolean z13;
        int i18;
        g2 g2Var2;
        int i19;
        int i20;
        int i21;
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y()) {
            boolean K3 = K3();
            t3 t3Var = this.f14275h3;
            int i22 = 0;
            if (K3) {
                int i23 = i3Var.f22527u0;
                int i24 = i3Var.f22528v0;
                int i25 = i3Var.f22531y0;
                int i26 = i3Var.f22529w0;
                int i27 = i3Var.f22532z0;
                boolean J3 = J3(i10, i23, i24, i26, i25, i27);
                if (!J3) {
                    i18 = v2(i10);
                } else {
                    i18 = 0;
                }
                g2 g2Var3 = this.J3;
                if (g2Var3 != null) {
                    g2Var3.d();
                }
                this.I3 = true;
                int i28 = i24;
                boolean z14 = false;
                while (i28 <= i25) {
                    h1 M4 = M4(i23, i28);
                    if (M4 == null) {
                        i21 = i24;
                    } else {
                        int length4 = M4.length();
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
                            if (!J3) {
                                if (i18 != 0) {
                                    M4.removeStyle(i18, max, max2);
                                }
                                M4.addStyle(i10, max, max2);
                            } else {
                                M4.removeStyle(i10, max, max2);
                            }
                            M4.invalidateEffects();
                            M4.requestLayout();
                            f4(i23, i28);
                            z14 = true;
                        }
                    }
                    i28++;
                    i24 = i21;
                }
                this.I3 = false;
                if (z14 && (g2Var2 = this.J3) != null) {
                    g2Var2.h();
                }
                t3Var.f();
                if (z14) {
                    n4();
                }
            } else if (x3()) {
                int i30 = i3Var.f22527u0;
                h1 H2 = H2(i30);
                if (H2 != null && (y11 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length3 = H2.length()), 0)) < (g12 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length3, 0))) {
                    if ((H2.getCurrentStyle(y11, g12) & i10) == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    g2 g2Var4 = this.J3;
                    if (g2Var4 != null) {
                        g2Var4.d();
                    }
                    this.I3 = true;
                    if (z13) {
                        int v22 = v2(i10);
                        if (v22 != 0) {
                            H2.removeStyle(v22, y11, g12);
                        }
                        H2.addStyle(i10, y11, g12);
                    } else {
                        H2.removeStyle(i10, y11, g12);
                    }
                    this.I3 = false;
                    d4(i30);
                    H2.invalidateEffects();
                    H2.requestLayout();
                    g2 g2Var5 = this.J3;
                    if (g2Var5 != null) {
                        g2Var5.h();
                    }
                    t3Var.f();
                    n4();
                }
            } else if (v3()) {
                int i31 = i3Var.f22527u0;
                h1 r22 = r2(i31);
                if (r22 != null && (y10 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length2 = r22.length()), 0)) < (g11 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length2, 0))) {
                    if ((r22.getCurrentStyle(y10, g11) & i10) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i17 = v2(i10);
                    } else {
                        i17 = 0;
                    }
                    g2 g2Var6 = this.J3;
                    if (g2Var6 != null) {
                        g2Var6.d();
                    }
                    this.I3 = true;
                    if (z12) {
                        if (i17 != 0) {
                            r22.removeStyle(i17, y10, g11);
                        }
                        r22.addStyle(i10, y10, g11);
                    } else {
                        r22.removeStyle(i10, y10, g11);
                    }
                    r22.invalidateEffects();
                    r22.requestLayout();
                    c4(i31);
                    this.I3 = false;
                    g2 g2Var7 = this.J3;
                    if (g2Var7 != null) {
                        g2Var7.h();
                    }
                    t3Var.f();
                    n4();
                }
            } else if (F3()) {
                int i32 = i3Var.f22527u0;
                h1 i42 = i4(i32);
                if (i42 != null && (y3 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length = i42.length()), 0)) < (g10 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length, 0))) {
                    if ((i42.getCurrentStyle(y3, g10) & i10) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i16 = v2(i10);
                    } else {
                        i16 = 0;
                    }
                    g2 g2Var8 = this.J3;
                    if (g2Var8 != null) {
                        g2Var8.d();
                    }
                    this.I3 = true;
                    if (z11) {
                        if (i16 != 0) {
                            i42.removeStyle(i16, y3, g10);
                        }
                        i42.addStyle(i10, y3, g10);
                    } else {
                        i42.removeStyle(i10, y3, g10);
                    }
                    i42.invalidateEffects();
                    i42.requestLayout();
                    e4(i32);
                    this.I3 = false;
                    g2 g2Var9 = this.J3;
                    if (g2Var9 != null) {
                        g2Var9.h();
                    }
                    t3Var.f();
                    n4();
                }
            } else {
                int i33 = i3Var.f22527u0;
                int i34 = i3Var.f22530x0;
                int i35 = i3Var.f22529w0;
                int i36 = i3Var.f22532z0;
                if (i33 >= 0 && i34 >= 0 && i34 >= i33 && i34 < this.f14290p4.size()) {
                    int i37 = i10;
                    boolean I3 = I3(i37, i33, i35, i34, i36);
                    boolean z15 = !I3;
                    if (!I3) {
                        i11 = v2(i37);
                    } else {
                        i11 = 0;
                    }
                    g2 g2Var10 = this.J3;
                    if (g2Var10 != null) {
                        g2Var10.d();
                    }
                    this.I3 = true;
                    int i38 = i33;
                    boolean z16 = false;
                    while (i38 <= i34) {
                        a x42 = x4(i38);
                        if (x42 != null) {
                            TL_iv.PageBlock pageBlock = x42.f13758b;
                            if (z3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int h22 = h2(i38);
                                if (i38 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = 0;
                                }
                                z10 = z16;
                                if (i38 == i34) {
                                    i14 = i36;
                                } else {
                                    i14 = h22;
                                }
                                int max3 = Math.max(i22, Math.min(i13, h22));
                                int max4 = Math.max(i22, Math.min(i14, h22));
                                if (max3 >= max4) {
                                    i12 = i11;
                                    z16 = z10;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                } else {
                                    g6 t22 = t2(i38);
                                    if (t22 != null) {
                                        org.telegram.ui.ActionBar.w4 styleDelegate = t22.getStyleDelegate();
                                        if (!I3) {
                                            if (i11 != 0) {
                                                styleDelegate.removeStyle(i11, max3, max4);
                                            }
                                            styleDelegate.addStyle(i37, max3, max4);
                                        } else {
                                            styleDelegate.removeStyle(i37, max3, max4);
                                        }
                                        t22.getEditText().invalidateEffects();
                                        t22.getEditText().requestLayout();
                                        t22.x();
                                        i12 = i11;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(g6.A(x42.f13758b));
                                        if (!I3 && i11 != 0) {
                                            i12 = i11;
                                            i15 = max3;
                                            i6.o(spannableStringBuilder2, i15, max4, i12, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i12 = i11;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i15 = max3;
                                        }
                                        i6.o(spannableStringBuilder, i15, max4, i37, z15, null);
                                        g6.e(x42.f13758b, spannableStringBuilder);
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
                    this.I3 = false;
                    if (z17 && (g2Var = this.J3) != null) {
                        g2Var.h();
                    }
                    t3Var.f();
                    if (z17) {
                        n4();
                    }
                }
            }
        }
    }

    public final void X4(float f7, float f10) {
        TL_iv.pageTableCell m10;
        s5 s5Var = this.f14278i4;
        if (this.B3 && s5Var != null && this.f14300x3 == s5Var && (m10 = s5Var.m((int) ((f7 - s5Var.getLeft()) - getLeft()), (int) ((f10 - s5Var.getTop()) - getTop()))) != null && m10 != this.E3) {
            this.E3 = m10;
            s5Var.w(this.D3, m10);
        }
    }

    public final ArrayList Y2() {
        return X2(0, this.f14282l3.size(), 0, false);
    }

    public final void Y3(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.Y3(android.view.View):void");
    }

    public final void Y4(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13758b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    g2 g2Var = this.J3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    g6 t22 = t2(this.f14282l3.indexOf(aVar));
                    if (t22 != null && (aVar2 = t22.f13964x) != null) {
                        t22.I(aVar2.f13758b, true);
                        t22.H = null;
                        t22.C();
                    }
                    g2 g2Var2 = this.J3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                }
            }
        }
    }

    public final void Z1() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList6 = this.f14282l3;
            if (i11 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i11);
                ArrayList arrayList7 = aVar.f13764j;
                ArrayList arrayList8 = aVar.f13765k;
                arrayList7.clear();
                if (aVar.f13763i) {
                    if (!arrayList.isEmpty()) {
                        a4.a.x(1, arrayList);
                    }
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                } else {
                    for (int i12 = 0; i12 < arrayList8.size(); i12++) {
                        ((Long) arrayList8.get(i12)).getClass();
                        arrayList7.add(new Object());
                    }
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        arrayList7.add((p0) arrayList.get(i13));
                    }
                    int max = Math.max(i10, aVar.f13759c);
                    if (max == 0) {
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    } else {
                        if (aVar.d > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        while (arrayList2.size() > max) {
                            arrayList2.remove(arrayList2.size() - 1);
                            arrayList3.remove(arrayList3.size() - 1);
                            arrayList4.remove(arrayList4.size() - 1);
                            arrayList5.remove(arrayList5.size() - 1);
                        }
                        for (int i14 = 1; i14 <= max; i14++) {
                            int i15 = i14 - 1;
                            if (i14 == max) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (i15 < arrayList2.size()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12 && z11) {
                                if (((Boolean) arrayList3.get(i15)).booleanValue() != z10) {
                                    z12 = false;
                                }
                            }
                            if (!z12) {
                                while (arrayList2.size() > i15) {
                                    arrayList2.remove(arrayList2.size() - 1);
                                    arrayList3.remove(arrayList3.size() - 1);
                                    arrayList4.remove(arrayList4.size() - 1);
                                    arrayList5.remove(arrayList5.size() - 1);
                                }
                                arrayList2.add(Long.valueOf(p0.a()));
                                if (z11) {
                                    z14 = z10;
                                } else {
                                    z14 = false;
                                }
                                arrayList3.add(Boolean.valueOf(z14));
                                arrayList4.add(0);
                                arrayList5.add(0L);
                            }
                            ((Long) arrayList2.get(i15)).getClass();
                            if (z11) {
                                if (((Long) arrayList5.get(i15)).longValue() != 0 && D3(aVar.f13758b)) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (z13) {
                                    arrayList4.set(i15, Integer.valueOf(((Integer) arrayList4.get(i15)).intValue() + 1));
                                    arrayList5.set(i15, Long.valueOf(aVar.f13757a));
                                } else {
                                    ((Integer) arrayList4.get(i15)).getClass();
                                    ((Long) arrayList5.get(i15)).getClass();
                                }
                                arrayList7.add(new Object());
                            } else {
                                ((Boolean) arrayList3.get(i15)).getClass();
                                arrayList7.add(new Object());
                            }
                        }
                    }
                    if (w3(aVar)) {
                        boolean z15 = ((TL_iv.pageBlockDetails) aVar.f13758b).open;
                        p0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (g6.p(aVar.f13758b)) {
                        p0.a();
                        arrayList7.add(new Object());
                    }
                }
                i11++;
                i10 = 0;
            } else {
                return;
            }
        }
    }

    public final boolean Z2() {
        a aVar;
        ArrayList arrayList = this.f14282l3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) i2.g.h(1, arrayList);
        }
        if (aVar != null && !D3(aVar.f13758b) && !aVar.f13763i && !w3(aVar) && !J2(aVar.f13758b)) {
            if (!(y1(aVar) instanceof g6)) {
                return false;
            }
            d3(aVar);
            return true;
        }
        g2 g2Var = this.J3;
        if (g2Var != null) {
            g2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.Y2.N(false);
        g2 g2Var2 = this.J3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        post(new n2(this, aVar2, 21));
        return true;
    }

    public final void Z3() {
        int length;
        int y3;
        int g10;
        int length2;
        int y10;
        int g11;
        int length3;
        int y11;
        int g12;
        int length4;
        int y12;
        int g13;
        h1 M4;
        int length5;
        int y13;
        int g14;
        boolean K3 = K3();
        t3 t3Var = this.f14275h3;
        i3 i3Var = this.f14285n3;
        if (K3) {
            int i10 = i3Var.f22527u0;
            int i11 = i3Var.f22528v0;
            if (i11 == i3Var.f22531y0 && (M4 = M4(i10, i11)) != null && (y13 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length5 = M4.length()), 0)) < (g14 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length5, 0))) {
                if (i6.h(M4.getText(), y13, g14)) {
                    g2 g2Var = this.J3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    i6.n(M4.getText(), y13, g14);
                    M4.invalidateEffects();
                    f4(i10, i11);
                    g2 g2Var2 = this.J3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    t3Var.f();
                    n4();
                    return;
                }
                g2 g2Var3 = this.J3;
                if (g2Var3 != null) {
                    g2Var3.d();
                }
                if (i6.g(M4.getText(), y13, g14)) {
                    i6.m(M4.getText(), y13, g14);
                    M4.invalidateEffects();
                    f4(i10, i11);
                    g2 g2Var4 = this.J3;
                    if (g2Var4 != null) {
                        g2Var4.h();
                    }
                    n4();
                }
                M4.setSelectionOverride(y13, g14);
                n3(false);
                D4(M4);
            }
        } else if (x3()) {
            int i12 = i3Var.f22527u0;
            h1 H2 = H2(i12);
            if (H2 != null && (y12 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length4 = H2.length()), 0)) < (g13 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length4, 0))) {
                if (i6.h(H2.getText(), y12, g13)) {
                    g2 g2Var5 = this.J3;
                    if (g2Var5 != null) {
                        g2Var5.d();
                    }
                    i6.n(H2.getText(), y12, g13);
                    H2.invalidateEffects();
                    d4(i12);
                    g2 g2Var6 = this.J3;
                    if (g2Var6 != null) {
                        g2Var6.h();
                    }
                    t3Var.f();
                    n4();
                    return;
                }
                g2 g2Var7 = this.J3;
                if (g2Var7 != null) {
                    g2Var7.d();
                }
                if (i6.g(H2.getText(), y12, g13)) {
                    i6.m(H2.getText(), y12, g13);
                    H2.invalidateEffects();
                    d4(i12);
                    g2 g2Var8 = this.J3;
                    if (g2Var8 != null) {
                        g2Var8.h();
                    }
                    n4();
                }
                H2.setSelectionOverride(y12, g13);
                n3(false);
                D4(H2);
            }
        } else if (v3()) {
            int i13 = i3Var.f22527u0;
            h1 r22 = r2(i13);
            if (r22 != null && (y11 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length3 = r22.length()), 0)) < (g12 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length3, 0))) {
                if (i6.h(r22.getText(), y11, g12)) {
                    g2 g2Var9 = this.J3;
                    if (g2Var9 != null) {
                        g2Var9.d();
                    }
                    i6.n(r22.getText(), y11, g12);
                    r22.invalidateEffects();
                    c4(i13);
                    g2 g2Var10 = this.J3;
                    if (g2Var10 != null) {
                        g2Var10.h();
                    }
                    t3Var.f();
                    n4();
                    return;
                }
                g2 g2Var11 = this.J3;
                if (g2Var11 != null) {
                    g2Var11.d();
                }
                if (i6.g(r22.getText(), y11, g12)) {
                    i6.m(r22.getText(), y11, g12);
                    r22.invalidateEffects();
                    c4(i13);
                    g2 g2Var12 = this.J3;
                    if (g2Var12 != null) {
                        g2Var12.h();
                    }
                    n4();
                }
                r22.setSelectionOverride(y11, g12);
                n3(false);
                D4(r22);
            }
        } else if (F3()) {
            int i14 = i3Var.f22527u0;
            h1 i42 = i4(i14);
            if (i42 != null && (y10 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length2 = i42.length()), 0)) < (g11 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length2, 0))) {
                if (i6.h(i42.getText(), y10, g11)) {
                    g2 g2Var13 = this.J3;
                    if (g2Var13 != null) {
                        g2Var13.d();
                    }
                    i6.n(i42.getText(), y10, g11);
                    i42.invalidateEffects();
                    e4(i14);
                    g2 g2Var14 = this.J3;
                    if (g2Var14 != null) {
                        g2Var14.h();
                    }
                    t3Var.f();
                    n4();
                    return;
                }
                g2 g2Var15 = this.J3;
                if (g2Var15 != null) {
                    g2Var15.d();
                }
                if (i6.g(i42.getText(), y10, g11)) {
                    i6.m(i42.getText(), y10, g11);
                    i42.invalidateEffects();
                    e4(i14);
                    g2 g2Var16 = this.J3;
                    if (g2Var16 != null) {
                        g2Var16.h();
                    }
                    n4();
                }
                i42.setSelectionOverride(y10, g11);
                n3(false);
                D4(i42);
            }
        } else {
            g6 F4 = F4();
            if (F4 == null || (y3 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length = F4.getEditText().length()), 0)) >= (g10 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length, 0))) {
                return;
            }
            if (i6.h(F4.getEditText().getText(), y3, g10)) {
                g2 g2Var17 = this.J3;
                if (g2Var17 != null) {
                    g2Var17.d();
                }
                i6.n(F4.getEditText().getText(), y3, g10);
                F4.getEditText().invalidateEffects();
                F4.x();
                g2 g2Var18 = this.J3;
                if (g2Var18 != null) {
                    g2Var18.h();
                }
                t3Var.f();
                n4();
                return;
            }
            g2 g2Var19 = this.J3;
            if (g2Var19 != null) {
                g2Var19.d();
            }
            if (i6.g(F4.getEditText().getText(), y3, g10)) {
                i6.m(F4.getEditText().getText(), y3, g10);
                F4.getEditText().invalidateEffects();
                F4.x();
                g2 g2Var20 = this.J3;
                if (g2Var20 != null) {
                    g2Var20.h();
                }
                n4();
            }
            F4.getEditText().setSelectionOverride(y3, g10);
            n3(false);
            D4(F4.getEditText());
        }
    }

    public final void a2(MessageObject messageObject) {
        TLRPC.Document document;
        String str;
        if (messageObject != null && (document = messageObject.getDocument()) != null) {
            g2 g2Var = this.J3;
            if (g2Var != null) {
                g2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z10 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            u uVar = new u();
            aVar.f13762g = uVar;
            uVar.f14223c = true;
            long j3 = document.f19902id;
            z10 = (j3 == 0 || document.dc_id == 0 || document.access_hash == 0) ? true : true;
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
                u uVar2 = aVar.f13762g;
                uVar2.f14227i = document;
                uVar2.f14224e = str;
                uVar2.f14221a = 1;
                uVar2.f14225f = 0.0f;
            } else {
                uVar.h = document;
                uVar.f14227i = document;
                uVar.f14221a = 2;
                pageblockaudio.audio_id = j3;
            }
            t3(aVar);
            if (z10) {
                u uVar3 = aVar.f13762g;
                String str2 = uVar3.f14224e;
                IdentityHashMap identityHashMap = this.Z3;
                d5 d5Var = (d5) identityHashMap.remove(uVar3);
                if (d5Var != null) {
                    d5Var.b();
                }
                d5 d5Var2 = new d5(this.f14271f3, str2, document, new f3(aVar, uVar3, this));
                identityHashMap.put(uVar3, d5Var2);
                d5Var2.d();
            }
            g2 g2Var2 = this.J3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            this.f14275h3.onContentChanged();
        }
    }

    public final void a3(a aVar, boolean z10) {
        int i10;
        View y12 = y1(aVar);
        if (y12 instanceof j5) {
            h1 h1Var = ((j5) y12).f14022r;
            h1Var.r();
            if (z10) {
                i10 = h1Var.length();
            } else {
                i10 = 0;
            }
            h1Var.setSelection(i10);
            return;
        }
        b3(aVar, z10);
    }

    public final void a4() {
        h1 editText;
        Runnable j2Var;
        int length;
        final int y3;
        final int g10;
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y()) {
            if (K3()) {
                int i10 = i3Var.f22527u0;
                int i11 = i3Var.f22528v0;
                if (i11 == i3Var.f22531y0) {
                    editText = M4(i10, i11);
                    j2Var = new o2(this, i10, i11, 1);
                } else {
                    return;
                }
            } else if (x3()) {
                int i12 = i3Var.f22527u0;
                editText = H2(i12);
                j2Var = new i2(this, i12, 3);
            } else if (v3()) {
                int i13 = i3Var.f22527u0;
                editText = r2(i13);
                j2Var = new i2(this, i13, 0);
            } else if (F3()) {
                int i14 = i3Var.f22527u0;
                editText = i4(i14);
                j2Var = new i2(this, i14, 1);
            } else {
                g6 F4 = F4();
                if (F4 != null) {
                    editText = F4.getEditText();
                    j2Var = new j2(F4, 0);
                } else {
                    return;
                }
            }
            final h1 h1Var = editText;
            final Runnable runnable = j2Var;
            if (h1Var != null && (y3 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length = h1Var.length()), 0)) <= (g10 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length, 0))) {
                Editable text = h1Var.getText();
                int i15 = t.h;
                String str = null;
                if (text != null) {
                    t[] tVarArr = (t[]) text.getSpans(y3, g10, t.class);
                    if (tVarArr.length > 0) {
                        str = tVarArr[0].f14198a;
                    }
                }
                if (str == null) {
                    str = h1Var.getText().subSequence(y3, g10).toString();
                }
                final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
                int i16 = org.telegram.ui.ActionBar.j6.G6;
                org.telegram.ui.ActionBar.f6 f6Var = this.f14273g3;
                final int v02 = org.telegram.ui.ActionBar.j6.v0(i16, f6Var);
                r.U(getContext(), str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        t a2;
                        String str2 = (String) obj;
                        v3 v3Var = v3.this;
                        v3Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a2 = t.a(str2, v02, dp)) == null) {
                            return;
                        }
                        g2 g2Var = v3Var.J3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        i3 i3Var2 = v3Var.f14285n3;
                        if (i3Var2 != null) {
                            i3Var2.f(false);
                        }
                        h1 h1Var2 = h1Var;
                        h1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        Editable text2 = h1Var2.getText();
                        int max = Math.max(0, Math.min(y3, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(g10, text2.length())), spannableString);
                        runnable.run();
                        g2 g2Var2 = v3Var.J3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        v3Var.f14275h3.onContentChanged();
                        int min = Math.min(max + 1, h1Var2.length());
                        h1Var2.r();
                        v3Var.post(new u2(h1Var2, min, 3));
                    }
                }, f6Var);
            }
        }
    }

    public final void a5(java.lang.CharSequence r18) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.a5(java.lang.CharSequence):void");
    }

    public final void b2(String str) {
        String str2;
        int i10;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.f19902id = 0L;
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
            c2(tL_document, str);
        }
    }

    public final void b3(a aVar, boolean z10) {
        View y12 = y1(aVar);
        if (y12 instanceof s5) {
            s5 s5Var = (s5) y12;
            h1 h1Var = s5Var.f14193r;
            k6 k6Var = s5Var.F;
            if (k6Var != null) {
                if (!z10) {
                    h1Var.r();
                    h1Var.setSelection(0);
                    return;
                } else if (!k6Var.f14054g.isEmpty()) {
                    v5 m10 = s5Var.v.m((TL_iv.pageTableCell) i2.g.h(1, s5Var.F.f14054g));
                    if (m10 != null) {
                        h1 h1Var2 = m10.f14303a;
                        h1Var2.r();
                        h1Var2.setSelection(h1Var2.length());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (z10 && (y12 instanceof g6)) {
            g6 g6Var = (g6) y12;
            if (g6Var.n()) {
                g6Var.i();
                return;
            }
        }
        h1 Q3 = Q3(y12);
        if (Q3 == null) {
            c3(aVar);
            return;
        }
        Q3.r();
        if (z10) {
            Q3.setSelection(Q3.length());
        }
    }

    public final void b4() {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.b4():void");
    }

    public final void c2(TLRPC.Document document, String str) {
        if (document != null) {
            g2 g2Var = this.J3;
            if (g2Var != null) {
                g2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z10 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            u uVar = new u();
            aVar.f13762g = uVar;
            uVar.d = true;
            long j3 = document.f19902id;
            z10 = (j3 == 0 || document.dc_id == 0 || document.access_hash == 0) ? true : true;
            if (z10) {
                if (!TextUtils.isEmpty(str) && w.f.o(str)) {
                    u uVar2 = aVar.f13762g;
                    uVar2.h = document;
                    uVar2.f14224e = str;
                    uVar2.f14221a = 1;
                    uVar2.f14225f = 0.0f;
                } else {
                    return;
                }
            } else {
                uVar.h = document;
                uVar.f14221a = 2;
                pageblockdocument.document_id = j3;
            }
            t3(aVar);
            if (z10) {
                u uVar3 = aVar.f13762g;
                IdentityHashMap identityHashMap = this.Z3;
                d5 d5Var = (d5) identityHashMap.remove(uVar3);
                if (d5Var != null) {
                    d5Var.b();
                }
                d5 d5Var2 = new d5(this.f14271f3, str, document, new e3(this, uVar3, aVar, str));
                identityHashMap.put(uVar3, d5Var2);
                d5Var2.d();
            }
            g2 g2Var2 = this.J3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            this.f14275h3.onContentChanged();
        }
    }

    public final void c3(a aVar) {
        View y12 = y1(aVar);
        if (y12 instanceof g6) {
            ((g6) y12).B();
        } else if (y12 instanceof t0) {
            ((t0) y12).d.r();
        }
    }

    public final void c4(int i10) {
        View z42 = z4(i10);
        if (z42 instanceof l0) {
            ((l0) z42).b();
        }
    }

    public final void d2(Uri uri) {
        boolean contains;
        if (uri != null) {
            a aVar = this.f14267b4;
            String str = null;
            this.f14267b4 = null;
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
            int i10 = this.f14294r4;
            this.f14294r4 = i10 - 1;
            Utilities.globalQueue.postRunnable(new q2(this, uri, z10, str2, i10, aVar));
        }
    }

    public final void d3(a aVar) {
        View y12 = y1(aVar);
        if (y12 instanceof g6) {
            g6 g6Var = (g6) y12;
            g6Var.B();
            h1 editText = g6Var.getEditText();
            editText.setSelection(editText.length());
        } else if (y12 instanceof t0) {
            t0 t0Var = (t0) y12;
            t0Var.d.r();
            h1 editText2 = t0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void d4(int i10) {
        a x42 = x4(i10);
        h1 H2 = H2(i10);
        if (w3(x42) && H2 != null) {
            ((TL_iv.pageBlockDetails) x42.f13758b).title = i6.f(H2.getText());
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
        boolean z10;
        a aVar4;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                arrayList = this.f14290p4;
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
                    ArrayList arrayList3 = aVar4.f13765k;
                    if (arrayList3.size() > i14) {
                        i14 = arrayList3.size();
                    }
                }
                i13++;
            }
            if (i14 != 0) {
                if (this.f14292q4 == null) {
                    sl0 sl0Var = new sl0(this);
                    this.f14292q4 = sl0Var;
                    sl0Var.a(null, null, null, this.f14273g3, 1);
                    c9.a(this.f14292q4, this.f14273g3);
                }
                int i15 = 0;
                while (i15 < i14) {
                    float f10 = 0.0f;
                    long j3 = 0;
                    float f11 = 0.0f;
                    int i16 = 0;
                    boolean z11 = false;
                    a aVar5 = null;
                    a aVar6 = null;
                    float f12 = 1.0f;
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
                                ArrayList arrayList4 = aVar.f13765k;
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
                            f7 = f12;
                        } else {
                            int j42 = j4(i15, aVar5, true);
                            l10 = l4;
                            int j43 = j4(i15, aVar6, false);
                            if (f11 - f10 <= AndroidUtilities.dp(4.0f)) {
                                i11 = i15;
                                i12 = i14;
                                arrayList2 = arrayList;
                            } else {
                                int dp = AndroidUtilities.dp(16.0f) * i15;
                                i11 = i15;
                                int dp2 = AndroidUtilities.dp(16.0f) + dp;
                                i12 = i14;
                                arrayList2 = arrayList;
                                int B = org.telegram.messenger.w1.B(16.0f, getWidth(), dp);
                                if (B - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, j42 + f10, B, f11 - j43);
                                    aVar2 = aVar5;
                                    aVar3 = aVar6;
                                    this.f14292q4.b(canvas, rectF, floor, floor, floor, f12);
                                    f7 = f12;
                                    this.f14292q4.e(canvas, rectF, f7);
                                    z11 = false;
                                }
                            }
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f7 = f12;
                            z11 = false;
                        }
                        if (view != null && l10 != null) {
                            if (!z11) {
                                j3 = l10.longValue();
                                f10 = Float.MAX_VALUE;
                                f11 = -3.4028235E38f;
                                aVar5 = aVar;
                                z10 = true;
                                f7 = 1.0f;
                            } else {
                                aVar5 = aVar2;
                                z10 = z11;
                            }
                            if (aVar != null && aVar == this.S3) {
                                z11 = z10;
                            } else {
                                float y3 = view.getY();
                                float height = view.getHeight() + y3;
                                if (y3 < f10) {
                                    f10 = y3;
                                }
                                if (height > f11) {
                                    f11 = height;
                                }
                                f12 = Math.min(f7, view.getAlpha());
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
                        f12 = f7;
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

    public final void e2(MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        v3 v3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        g2 g2Var = this.J3;
        if (g2Var != null) {
            g2Var.d();
        }
        boolean c10 = y4.c(photoEntry);
        if (!photoEntry.isVideo && !c10) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        a aVar = new a(pageblockvideo, 0, 0);
        aVar.f13762g = S3(photoEntry, str2);
        t3(aVar);
        if (c10) {
            J4(aVar, aVar.f13762g, photoEntry);
            v3Var = this;
        } else {
            v3Var = this;
            v3Var.K4(aVar, aVar.f13762g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        g2 g2Var2 = v3Var.J3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        v3Var.f14275h3.onContentChanged();
    }

    public final void e3(a aVar) {
        View y12 = y1(aVar);
        if (y12 instanceof g6) {
            g6 g6Var = (g6) y12;
            g6Var.B();
            g6Var.getEditText().setSelection(0);
        } else if (y12 instanceof t0) {
            t0 t0Var = (t0) y12;
            t0Var.d.r();
            t0Var.getEditText().setSelection(0);
        }
    }

    public final void e4(int i10) {
        View z42 = z4(i10);
        if (z42 instanceof g6) {
            ((g6) z42).w();
        }
    }

    public final void f2(s5 s5Var) {
        s5 s5Var2 = this.f14278i4;
        if (s5Var2 != null && s5Var2 != s5Var) {
            LinkedHashSet linkedHashSet = s5Var2.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                s5Var2.v.invalidate();
                s5Var2.t();
            }
        }
        this.f14278i4 = s5Var;
        this.C3 = false;
        this.l4 = -1;
        this.f14281k4 = -1;
        s5Var.setCellSelectionListener(this.f14284m4);
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y()) {
            i3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void f4(int i10, int i11) {
        v5 m10;
        View z42 = z4(i10);
        if (z42 instanceof s5) {
            s5 s5Var = (s5) z42;
            if (i11 == 0) {
                s5Var.u();
                return;
            }
            TL_iv.pageTableCell h = s5Var.h(i11);
            if (h != null && (m10 = s5Var.getGrid().m(h)) != null) {
                k6.d(h, m10.f14303a.getText());
            }
        }
    }

    public final m3 g2() {
        int i10;
        int i11;
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y() && !F3()) {
            a x42 = x4(i3Var.f22527u0);
            ArrayList arrayList = this.f14282l3;
            int indexOf = arrayList.indexOf(x42);
            int indexOf2 = arrayList.indexOf(x4(i3Var.f22530x0));
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
                    if (aVar.f13763i || w3(aVar)) {
                        return null;
                    }
                }
                return new m3(this, i10, i11, i3Var.f22529w0, i3Var.f22532z0);
            }
            return null;
        }
        return null;
    }

    public final boolean g3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.g3(android.view.KeyEvent):boolean");
    }

    public h1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return (h1) findFocus;
        }
        return null;
    }

    public n4 getMapDelegate() {
        return this.f14269d4;
    }

    public View getOverlayView() {
        return this.f14287o3;
    }

    public q9 getTextSelectionHelper() {
        return this.f14285n3;
    }

    public final int h2(int i10) {
        h1 H2 = H2(i10);
        if (H2 != null) {
            return H2.length();
        }
        g6 t22 = t2(i10);
        if (t22 != null) {
            return t22.getEditText().length();
        }
        a x42 = x4(i10);
        if (x42 == null) {
            return 0;
        }
        return g6.z(x42.f13758b).length();
    }

    public final boolean h3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.h3(android.view.MotionEvent):boolean");
    }

    public final int h4(int i10) {
        Layout layout;
        View z42 = z4(i10);
        if (!(z42 instanceof g6) || (layout = ((g6) z42).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage i2() {
        if (j3()) {
            ArrayList<TL_iv.PageBlock> Y2 = Y2();
            if (Y2.isEmpty()) {
                return null;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Y2;
            richMessage.photos = A2();
            richMessage.documents = x2();
            return richMessage;
        }
        return null;
    }

    public final boolean i3(ji.s5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.i3(ji.s5, int, int):boolean");
    }

    public final h1 i4(int i10) {
        View z42 = z4(i10);
        if (z42 instanceof g6) {
            return ((g6) z42).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock j2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.j2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean j3() {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.j3():boolean");
    }

    public final boolean k2() {
        h1 editText;
        int length;
        int y3;
        int g10;
        k4[] k4VarArr;
        i3 i3Var = this.f14285n3;
        if (i3Var == null || !i3Var.y() || i3Var.f22527u0 != i3Var.f22530x0) {
            return false;
        }
        if (K3()) {
            int i10 = i3Var.f22527u0;
            int i11 = i3Var.f22528v0;
            if (i11 != i3Var.f22531y0) {
                return false;
            }
            editText = M4(i10, i11);
        } else if (x3()) {
            editText = H2(i3Var.f22527u0);
        } else if (v3()) {
            editText = r2(i3Var.f22527u0);
        } else if (F3()) {
            editText = i4(i3Var.f22527u0);
        } else {
            g6 F4 = F4();
            if (F4 == null) {
                return false;
            }
            editText = F4.getEditText();
        }
        if (editText == null || (y3 = i2.g.y(i3Var.f22529w0, i3Var.f22532z0, (length = editText.length()), 0)) >= (g10 = i2.g.g(i3Var.f22529w0, i3Var.f22532z0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && y3 < g10) {
            for (k4 k4Var : (k4[]) text.getSpans(y3, g10, k4.class)) {
                if (text.getSpanStart(k4Var) < g10 && text.getSpanEnd(k4Var) > y3) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean l2() {
        int[] C4 = C4();
        if (C4 == null) {
            return m2(C2());
        }
        for (int i10 = C4[0]; i10 <= C4[1]; i10++) {
            if (m2((a) this.f14282l3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean l3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14282l3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            for (u uVar : P3((a) arrayList.get(i10))) {
                if (uVar.a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean l4(int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.f14282l3;
            if (i11 < arrayList.size()) {
                g2 g2Var = this.J3;
                if (g2Var != null) {
                    g2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i11 >= i10) {
                        if (p3(i11, true, true)) {
                            z11 = true;
                        }
                        i11--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i10);
                    if (aVar.f13759c >= 1 && (i10 == 0 || ((a) arrayList.get(i10 - 1)).f13759c < aVar.f13759c)) {
                        return false;
                    }
                    z11 = false;
                    while (i10 <= i11) {
                        if (p3(i10, false, true)) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    r4();
                    if (findFocus() instanceof h1) {
                        W1();
                    } else {
                        this.Y2.N(false);
                    }
                    g2 g2Var2 = this.J3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final boolean m2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar != null && (indexOf = (arrayList = this.f14282l3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f13759c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f13758b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !B3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !n2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f13759c < aVar2.f13759c) {
                return false;
            }
            if (o3(indexOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void m3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof g6) {
                g6 g6Var = (g6) childAt;
                g6Var.f13959f.hideActionMode();
                g6Var.h.hideActionMode();
            } else if (childAt instanceof s5) {
                s5 s5Var = (s5) childAt;
                u5 u5Var = s5Var.v;
                s5Var.f14193r.hideActionMode();
                for (int i11 = 0; i11 < u5Var.getChildCount(); i11++) {
                    View childAt2 = u5Var.getChildAt(i11);
                    if (childAt2 instanceof v5) {
                        ((v5) childAt2).f14303a.hideActionMode();
                    }
                }
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof t0) {
                ((t0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void m4(a aVar) {
        View y12 = y1(aVar);
        if (y12 instanceof w4) {
            w4 w4Var = (w4) y12;
            ArrayList arrayList = w4Var.f14334y;
            if (w4Var.f13775a != null) {
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

    public final boolean n2(int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f14282l3;
            if (i10 < arrayList.size() && D3(((a) arrayList.get(i10)).f13758b) && ((a) arrayList.get(i10 - 1)).f13759c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n3(boolean z10) {
        i3 i3Var = this.f14285n3;
        if (i3Var != null) {
            if (z10) {
                i3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(i3Var.f21821r0);
                i3Var.v();
            }
        }
        if (z10) {
            U2();
        } else {
            m3();
        }
    }

    public final void n4() {
        post(new b(this, 3));
    }

    public final boolean o2() {
        int[] C4 = C4();
        if (C4 == null) {
            return p2(C2());
        }
        for (int i10 = C4[0]; i10 <= C4[1]; i10++) {
            if (p2((a) this.f14282l3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean o3(int i10) {
        if (((a) this.f14282l3.get(i10)).f13759c + 1 <= MessagesController.getInstance(this.f14271f3).config.richMessageMaxDepth.get() - 6) {
            return true;
        }
        return false;
    }

    public final void o4(int i10) {
        ArrayList arrayList = this.f14282l3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f13759c > 0) {
                View y12 = y1(aVar);
                if (y12 instanceof g6) {
                    ((g6) y12).F();
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.M3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.M3);
        this.f25306a3 = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        View F;
        int i14 = i13 - i11;
        int i15 = this.K3;
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
                    post(new i2(this, dp, 2));
                }
            }
        }
        this.K3 = i14;
    }

    public final boolean p2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.f14282l3).indexOf(aVar)) < 0 || aVar.f13759c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f13759c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean p3(int i10, boolean z10, boolean z11) {
        boolean z12;
        a aVar;
        int i11;
        int i12 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.f14282l3;
            if (i10 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar2.f13759c > 0) {
                        s2(i10);
                        return true;
                    }
                } else if (aVar2.f13759c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f13758b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !B3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if ((z12 || n2(i10)) && o3(i10)) {
                        if (i10 > 0) {
                            aVar = (a) arrayList.get(i10 - 1);
                        } else {
                            aVar = null;
                        }
                        if (z12) {
                            aVar2.f13759c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i12 = 1;
                            }
                            aVar2.d = i12;
                            return true;
                        }
                        aVar2.f13759c = aVar.f13759c;
                        if (aVar.d > 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        aVar2.d = i11;
                        aVar2.f13760e = false;
                        aVar2.f13761f = false;
                        return true;
                    }
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).f13759c >= aVar2.f13759c)) && o3(i10)) {
                    aVar2.f13759c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void p4(a aVar, u uVar) {
        int i10;
        if (aVar == null) {
            return;
        }
        if (A3(aVar.f13758b)) {
            ArrayList f32 = f3(aVar.f13758b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(uVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                aVar.h.remove(i10);
                if (f32 != null && i10 < f32.size()) {
                    f32.remove(i10);
                }
            }
            if (aVar.h.isEmpty()) {
                q4(aVar);
                return;
            }
            int size = aVar.h.size();
            v51 v51Var = this.Y2;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f13758b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) f32.get(0);
                aVar.f13758b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f13762g = (u) aVar.h.get(0);
                aVar.h = null;
                v51Var.N(true);
                m4(aVar);
                return;
            }
            v51Var.N(true);
            m4(aVar);
            return;
        }
        q4(aVar);
    }

    public final boolean q2() {
        g2 g2Var = this.J3;
        if (g2Var != null) {
            if (g2Var.f13944e || !g2Var.f13942b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q3(boolean z10) {
        a aVar;
        int i10;
        int i11;
        int[] C4 = C4();
        if (C4 != null && (i10 = C4[0]) != (i11 = C4[1])) {
            l4(i10, i11, z10);
            return;
        }
        if (C4 == null) {
            aVar = C2();
        } else {
            aVar = (a) this.f14282l3.get(C4[0]);
        }
        if (aVar != null) {
            V3(aVar, z10);
        }
    }

    public final void q4(a aVar) {
        ArrayList arrayList = this.f14282l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.Y2.N(true);
        }
    }

    public final h1 r2(int i10) {
        View z42 = z4(i10);
        if (z42 instanceof l0) {
            return ((l0) z42).getCaptionEditText();
        }
        return null;
    }

    public final void r3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f13765k;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size && i10 < arrayList.size() && ((Long) arrayList3.get(i10)).equals(arrayList.get(i10))) {
            i10++;
        }
        for (int i11 = size - 1; i11 >= i10; i11--) {
            Long l4 = (Long) arrayList3.get(i11);
            long longValue = l4.longValue();
            Integer num = (Integer) hashMap.get(l4);
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.f14283m3.containsKey(l4))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f13774t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.f13765k.add((Long) arrayList3.get(i12));
                }
                int i13 = i5.f14008a;
                h51 J = h51.J(i5.class);
                J.G = aVar2;
                J.H = this.f14272f4;
                arrayList2.add(J);
                this.f14290p4.add(aVar2);
            }
        }
    }

    public final void r4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14282l3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (aVar.f13759c > 0 && aVar.d > 0 && !D3(aVar.f13758b)) {
                    int i11 = aVar.f13759c;
                    int i12 = 1;
                    for (int i13 = i10 - 1; i13 >= 0; i13--) {
                        a aVar2 = (a) arrayList.get(i13);
                        int i14 = aVar2.f13759c;
                        if (i14 < i11) {
                            break;
                        }
                        if (i14 == i11 && !D3(aVar2.f13758b)) {
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

    public final void s2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.f14282l3;
        a aVar2 = (a) arrayList.get(i10);
        int i12 = aVar2.f13759c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            aVar2.f13759c = i13;
            if (i13 == 0) {
                aVar2.d = 0;
                aVar2.f13760e = false;
                aVar2.f13761f = false;
            }
            while (true) {
                i10++;
                if (i10 < arrayList.size() && (i11 = (aVar = (a) arrayList.get(i10)).f13759c) > i12) {
                    aVar.f13759c = i11 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void s3() {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.s3():void");
    }

    public final void s4(String str) {
        i3 i3Var = this.f14285n3;
        V1(i3Var.f22527u0, i3Var.f22529w0, i3Var.f22530x0, i3Var.f22532z0, str.split("\n", -1));
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.j3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.R3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.f14277i3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.N3 = new ArrayList();
        ArrayList arrayList = this.f14282l3;
        V2(arrayList, f5.b(charSequence), this.f14283m3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.N3.add((a) arrayList.get(size));
        }
        this.Y2.N(false);
    }

    public final g6 t2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m10 = this.X2.m(i10);
        if (!(m10 instanceof g6)) {
            return null;
        }
        return (g6) m10;
    }

    public final void t3(ji.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: ji.v3.t3(ji.a):void");
    }

    public final u t4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document R2 = R2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (R2 == null) {
                return null;
            }
            u uVar = new u();
            uVar.f14223c = true;
            uVar.f14221a = 2;
            uVar.h = R2;
            uVar.f14227i = R2;
            return uVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document R22 = R2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (R22 == null) {
                return null;
            }
            u uVar2 = new u();
            uVar2.d = true;
            uVar2.f14221a = 2;
            uVar2.h = R22;
            return uVar2;
        } else {
            int i10 = 0;
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document R23 = R2(pageblockvideo.video_id);
                if (R23 == null) {
                    return null;
                }
                u uVar3 = new u();
                uVar3.f14222b = true;
                uVar3.f14221a = 2;
                uVar3.h = R23;
                uVar3.f14232n = pageblockvideo.spoiler;
                while (i10 < R23.attributes.size()) {
                    if (R23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) R23.attributes.get(i10);
                        uVar3.f14228j = tL_documentAttributeVideo.f19903w;
                        uVar3.f14229k = tL_documentAttributeVideo.h;
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
                        if (i12 < this.f14282l3.size()) {
                            for (u uVar4 : P3((a) this.f14282l3.get(i12))) {
                                if (uVar4 != null && (photo = uVar4.f14226g) != null && photo.f19920id == j3) {
                                    break loop1;
                                }
                            }
                            i12++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f14280k3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i10);
                                    i10++;
                                    photo = photo2;
                                    if (photo != null && photo.f19920id == j3) {
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = x4.f14357a;
                            synchronized (x4.class) {
                                if (i11 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) x4.f14357a.get(Long.valueOf(j3));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                u uVar5 = new u();
                uVar5.f14221a = 2;
                uVar5.f14226g = photo;
                uVar5.f14232n = pageblockphoto.spoiler;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null) {
                    uVar5.f14228j = closestPhotoSizeWithSize.f19921w;
                    uVar5.f14229k = closestPhotoSizeWithSize.h;
                }
                return uVar5;
            }
        }
    }

    public final void u2() {
        F2();
        this.f14280k3 = null;
        this.f14267b4 = null;
        this.f14268c4 = null;
        this.J3 = new g2(this.f14288o4);
        y4();
        this.J3.j();
        t3 t3Var = this.f14275h3;
        if (t3Var != null) {
            t3Var.u();
        }
    }

    public final void u4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f14280k3 != null && aVar != null && (pageBlock = aVar.f13758b) != null) {
            if (A3(pageBlock)) {
                ArrayList f32 = f3(aVar.f13758b);
                aVar.h = new ArrayList();
                if (f32 != null) {
                    for (int i10 = 0; i10 < f32.size(); i10++) {
                        u t42 = t4((TL_iv.PageBlock) f32.get(i10));
                        ArrayList arrayList = aVar.h;
                        if (t42 == null) {
                            t42 = new u();
                        }
                        arrayList.add(t42);
                    }
                    return;
                }
                return;
            }
            u t43 = t4(aVar.f13758b);
            if (t43 != null) {
                aVar.f13762g = t43;
            }
        }
    }

    public final boolean v3() {
        int i10;
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y() && (i10 = i3Var.f22527u0) == i3Var.f22530x0 && i10 >= 0 && i10 < this.f14290p4.size()) {
            return z4(i10) instanceof l0;
        }
        return false;
    }

    public final ArrayList v4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (A3(aVar.f13758b)) {
                ArrayList f32 = f3(aVar.f13758b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (f32 != null) {
                    int size2 = f32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = f32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        u t42 = t4(pageBlock);
                        if (t42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(t42);
                        }
                    }
                    f32.clear();
                    f32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.f13758b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    u t43 = t4(pageBlock2);
                    if (t43 != null) {
                        aVar.f13762g = t43;
                        arrayList2.add(aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final boolean w2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.f14282l3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.f13763i;
            ArrayList arrayList2 = aVar.f13765k;
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
            ArrayList arrayList3 = aVar2.f13765k;
            if (arrayList3.size() == 1 && (aVar2.f13758b instanceof TL_iv.pageBlockParagraph)) {
                Long l4 = (Long) arrayList3.get(0);
                l4.getClass();
                Integer num = (Integer) hashMap.get(l4);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f13758b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f14283m3.remove(l4);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f13758b = pageblockblockquote;
                    arrayList3.clear();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void w4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof l4) {
                a0 a0Var = (a0) ((l4) childAt);
                a0Var.f13776b.a(a0Var.f13775a, new fi.f(a0Var, 22));
            }
        }
        invalidate();
    }

    public final ArrayList x2() {
        TLRPC.Document document;
        u uVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f14282l3;
            if (i10 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i10);
                if ((aVar.f13758b instanceof TL_iv.pageBlockDocument) && (uVar = aVar.f13762g) != null && uVar.b() && (document2 = aVar.f13762g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f13758b).document_id = document2.f19902id;
                }
                for (u uVar2 : P3(aVar)) {
                    if (uVar2.b() && (document = uVar2.h) != null) {
                        long j3 = document.f19902id;
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

    public final boolean x3() {
        int i10;
        i3 i3Var = this.f14285n3;
        if (i3Var != null && i3Var.y() && (i10 = i3Var.f22527u0) == i3Var.f22530x0 && w3(x4(i10))) {
            return true;
        }
        return false;
    }

    public final a x4(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f14290p4;
            if (i10 < arrayList.size()) {
                return (a) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final ArrayList y2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f14282l3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (u uVar : P3((a) arrayList2.get(i10))) {
                if (uVar.b() && (document = uVar.h) != null && hashSet.add(Long.valueOf(document.f19902id))) {
                    arrayList.add(uVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void y4() {
        ArrayList arrayList = this.f14282l3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.Y2.N(false);
    }

    @Override
    public final boolean z1() {
        return this.T3;
    }

    public final ArrayList z2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f14282l3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (u uVar : P3((a) arrayList2.get(i10))) {
                if (uVar.b() && (photo = uVar.f14226g) != null && hashSet.add(Long.valueOf(photo.f19920id))) {
                    arrayList.add(uVar.f14226g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View z4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.X2.m(i10);
    }
}
