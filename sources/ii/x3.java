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
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.v51;
import v7.o8;
public final class x3 extends d61 {
    public static final ArrayList f11718s4 = new ArrayList();
    public boolean A3;
    public boolean B3;
    public boolean C3;
    public TL_iv.pageTableCell D3;
    public TL_iv.pageTableCell E3;
    public long F3;
    public float G3;
    public float H3;
    public boolean I3;
    public i2 J3;
    public int K3;
    public i1 L3;
    public final i M3;
    public ArrayList N3;
    public int O3;
    public int P3;
    public int Q3;
    public boolean R3;
    public a S3;
    public boolean T3;
    public final p3 U3;
    public final t2 V3;
    public final q3 W3;
    public final r3 X3;
    public final s3 Y3;
    public final IdentityHashMap Z3;
    public final IdentityHashMap f11719a4;
    public a f11720b4;
    public a f11721c4;
    public final t3 f11722d4;
    public final b3 f11723e4;
    public final int f11724f3;
    public final c3 f11725f4;
    public final org.telegram.ui.ActionBar.d6 f11726g3;
    public final d3 f11727g4;
    public final v3 f11728h3;
    public final e3 f11729h4;
    public MessageObject f11730i3;
    public p5 f11731i4;
    public boolean j3;
    public o70 f11732j4;
    public TL_iv.RichMessage f11733k3;
    public int f11734k4;
    public final ArrayList f11735l3;
    public int l4;
    public final HashMap f11736m3;
    public final u2 f11737m4;
    public final k3 f11738n3;
    public final f3 f11739n4;
    public final da f11740o3;
    public final a4.m f11741o4;
    public int f11742p3;
    public final ArrayList f11743p4;
    public int f11744q3;
    public tl0 f11745q4;
    public int f11746r3;
    public int f11747r4;
    public boolean f11748s3;
    public float f11749t3;
    public float f11750u3;
    public float f11751v3;
    public float f11752w3;
    public View f11753x3;
    public b y3;
    public boolean f11754z3;

    public x3(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, v3 v3Var) {
        super(context, i10, 0, false, new hi.a(r1, 4), new ei.d5(r1, 16), null, d6Var);
        this.j3 = true;
        this.f11735l3 = new ArrayList();
        this.f11736m3 = new HashMap();
        this.f11742p3 = -1;
        this.f11744q3 = -1;
        this.f11746r3 = 0;
        this.M3 = new i(this, 2);
        this.R3 = true;
        this.U3 = new p3(this);
        this.V3 = new t2(this);
        this.W3 = new q3(this);
        this.X3 = new r3(this);
        this.Y3 = new s3(this);
        this.Z3 = new IdentityHashMap();
        this.f11719a4 = new IdentityHashMap();
        this.f11722d4 = new t3(this);
        this.f11723e4 = new b3(this);
        this.f11725f4 = new c3(this);
        this.f11727g4 = new d3(this);
        this.f11729h4 = new e3(this);
        this.f11734k4 = -1;
        this.l4 = -1;
        this.f11737m4 = new u2(this);
        this.f11739n4 = new f3(this);
        a4.m mVar = new a4.m(this, 21);
        this.f11741o4 = mVar;
        this.f11743p4 = new ArrayList();
        this.f11747r4 = -1;
        x3[] x3VarArr = {this};
        this.f11724f3 = i10;
        this.f11726g3 = d6Var;
        this.f11728h3 = v3Var;
        this.Y2.f28662r = false;
        setClipToPadding(false);
        setClipChildren(false);
        B1(new hi.a(this, 5), false);
        setReorderLongPressEnabled(false);
        w1(true);
        k3 k3Var = new k3(this, v3Var);
        this.f11738n3 = k3Var;
        k3Var.T(this);
        k3Var.E0 = this.X2;
        da o9 = k3Var.o(context);
        this.f11740o3 = o9;
        AndroidUtilities.removeFromParent(o9);
        k3Var.D = new m3(this, v3Var);
        j(new n3(0, this, v3Var));
        this.J3 = new i2(mVar);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        if (!E3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !B3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static boolean E3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockDivider) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockButtonRow) && !(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            return false;
        }
        return true;
    }

    public static boolean F3(a aVar) {
        if (aVar != null && !aVar.f11195i && !x3(aVar) && (aVar.f11191b instanceof TL_iv.pageBlockParagraph) && aVar.f11192c == 0 && aVar.d == 0 && !aVar.e && aVar.f11197k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void I1(ii.x3[] r20, java.util.ArrayList r21, org.telegram.ui.Components.v51 r22) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.I1(ii.x3[], java.util.ArrayList, org.telegram.ui.Components.v51):void");
    }

    public static void J2(a aVar, ArrayList arrayList) {
        int i10;
        int i11;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j3;
        TL_iv.PageBlock pageBlock = aVar.f11191b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            u uVar = aVar.f11194g;
            if (uVar != null && uVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f11191b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f11191b.caption.text = new TL_iv.textEmpty();
                        aVar.f11191b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f11191b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            u uVar2 = aVar.f11194g;
            if (uVar2 != null && uVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f11191b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f11191b.caption.text = new TL_iv.textEmpty();
                        aVar.f11191b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f11191b);
                }
            }
        } else if (B3(pageBlock)) {
            ArrayList g32 = g3(aVar.f11191b);
            List Q3 = Q3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i12 = 0; g32 != null && i12 < g32.size() && i12 < Q3.size(); i12++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) g32.get(i12);
                if (((u) Q3.get(i12)).b()) {
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
                if (aVar.f11191b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f11191b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f11191b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                l0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f11191b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                u uVar3 = aVar.f11194g;
                if (uVar3 != null && uVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f11191b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f11191b.caption.text = new TL_iv.textEmpty();
                            aVar.f11191b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f11191b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                u uVar4 = aVar.f11194g;
                if (uVar4 != null && (document = uVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f18089id;
                }
                if (uVar4 != null && uVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f11191b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        l0.d(pageBlock7);
                        arrayList.add(aVar.f11191b);
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
                    arrayList.add(aVar.f11191b);
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
                                    i6.c(pagetablecell, "");
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
                if (O4(pageblocktable)) {
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

    public static void K1(x3 x3Var, int i10, int i11, int i12) {
        i1 editText;
        if (i10 >= 0) {
            View m10 = x3Var.X2.m(i10);
            if (m10 instanceof e6) {
                e6 e6Var = (e6) m10;
                if (i11 == 1 && e6Var.n()) {
                    editText = e6Var.getAuthorEditText();
                } else {
                    editText = e6Var.getEditText();
                }
                editText.s();
                editText.setSelection(Math.max(0, Math.min(i12, editText.length())));
            } else if (m10 instanceof p5) {
                p5 p5Var = (p5) m10;
                i1 l4 = p5Var.l(i11);
                if (l4 == null) {
                    l4 = p5Var.l(0);
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

    public static boolean K2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static org.telegram.tgnet.tl.TL_iv.PageBlock L1(ii.x3 r2, ii.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.L1(ii.x3, ii.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public static void L2(TL_iv.PageBlock pageBlock) {
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

    public static void M1(x3 x3Var, i1 i1Var) {
        if (i1Var == null) {
            x3Var.getClass();
            return;
        }
        i1Var.adaptiveCreateLinkDialog = x3Var.j3;
        i1Var.setInlineButtonContext(x3Var.f11724f3);
        i1Var.setInlineButtonClickListener(new u2(x3Var));
    }

    public static void N1(a aVar, u uVar, x3 x3Var) {
        v3 v3Var = x3Var.f11728h3;
        IdentityHashMap identityHashMap = x3Var.f11719a4;
        IdentityHashMap identityHashMap2 = x3Var.Z3;
        if (uVar == null) {
            ArrayList arrayList = x3Var.f11735l3;
            for (u uVar2 : Q3(aVar)) {
                b5 b5Var = (b5) identityHashMap2.remove(uVar2);
                if (b5Var != null) {
                    b5Var.b();
                }
                x4 x4Var = (x4) identityHashMap.remove(uVar2);
                if (x4Var != null) {
                    x4Var.a();
                }
            }
            int indexOf = arrayList.indexOf(aVar);
            if (indexOf >= 0) {
                i2 i2Var = x3Var.J3;
                if (i2Var != null) {
                    i2Var.d();
                }
                arrayList.remove(indexOf);
                x3Var.Y2.N(true);
                i2 i2Var2 = x3Var.J3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
            }
            v3Var.onContentChanged();
            return;
        }
        b5 b5Var2 = (b5) identityHashMap2.remove(uVar);
        if (b5Var2 != null) {
            b5Var2.b();
        }
        x4 x4Var2 = (x4) identityHashMap.remove(uVar);
        if (x4Var2 != null) {
            x4Var2.a();
        }
        i2 i2Var3 = x3Var.J3;
        if (i2Var3 != null) {
            i2Var3.d();
        }
        x3Var.q4(aVar, uVar);
        i2 i2Var4 = x3Var.J3;
        if (i2Var4 != null) {
            i2Var4.h();
        }
        v3Var.onContentChanged();
    }

    public static void N2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z10, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            S1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z11, z12);
                        } else {
                            a aVar = new a(pageBlock, i10, i11);
                            aVar.e = z11;
                            aVar.f11193f = z12;
                            arrayList.add(aVar);
                        }
                        z13 = true;
                    } else {
                        arrayList.add(new a(pageBlock, i10, z10 ? 1 : 0));
                    }
                } else {
                    if (!z13) {
                        S1(arrayList, null, i10, i11, z11, z12);
                        z13 = true;
                    }
                    O2(arrayList, pageBlock, i10 + 1);
                }
            }
        }
        if (!z13) {
            S1(arrayList, null, i10, i11, z11, z12);
        }
    }

    public static TL_iv.PageBlock N3(a aVar, u uVar) {
        int i10;
        if (B3(aVar.f11191b)) {
            ArrayList g32 = g3(aVar.f11191b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(uVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0 && g32 != null && i10 < g32.size()) {
                return (TL_iv.PageBlock) g32.get(i10);
            }
            return null;
        }
        return aVar.f11191b;
    }

    public static void O1(x3 x3Var) {
        if (x3Var.I3) {
            return;
        }
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.h();
        }
        x3Var.f11728h3.l();
        x3Var.o4();
    }

    public static void O2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
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
                    S1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i13 = i12;
                    N2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
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
                S1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                N2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static boolean O4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(g6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!i6.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void P1(x3 x3Var, a aVar) {
        ArrayList arrayList = x3Var.f11735l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f11197k.addAll(aVar.f11197k);
        arrayList.add(indexOf + 1, aVar2);
        x3Var.s4();
        x3Var.Y2.N(false);
        i2 i2Var2 = x3Var.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        x3Var.post(new p2(x3Var, aVar2, 23));
    }

    public static FrameLayout P4(p5 p5Var, boolean z10) {
        int i10;
        s5 m10;
        i6 model = p5Var.getModel();
        if (model != null) {
            int i11 = Integer.MAX_VALUE;
            if (z10) {
                i10 = -1;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : p5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o9 = z10 ? (i6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o9 < i10 || (o9 == i10 && a2 < i11) : o9 > i10 || (o9 == i10 && a2 < i11)) {
                    pagetablecell = pagetablecell2;
                    i11 = a2;
                    i10 = o9;
                }
            }
            if (pagetablecell != null && (m10 = p5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return p5Var;
    }

    public static boolean Q1(ii.x3 r16, ii.a r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.Q1(ii.x3, ii.a, boolean):boolean");
    }

    public static List Q3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (B3(aVar.f11191b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        u uVar = aVar.f11194g;
        if (uVar != null) {
            return Collections.singletonList(uVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static i1 R3(View view) {
        if (view instanceof e6) {
            return ((e6) view).getEditText();
        }
        if (view instanceof m0) {
            return ((m0) view).getCaptionEditText();
        }
        if (view instanceof u0) {
            return ((u0) view).getEditText();
        }
        return null;
    }

    public static void S1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i10, i11);
        aVar.e = z10;
        aVar.f11193f = z11;
        arrayList.add(aVar);
    }

    public static TL_iv.PageBlock S3(TL_iv.PageBlock pageBlock) {
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

    public static u T3(MediaController.PhotoEntry photoEntry, String str) {
        boolean z10;
        int i10;
        u uVar = new u();
        uVar.f11634b = photoEntry.isVideo;
        uVar.e = str;
        uVar.f11639j = photoEntry.width;
        uVar.f11640k = photoEntry.height;
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
        uVar.f11641l = i10;
        if (!z10) {
            i11 = photoEntry.invert;
        }
        uVar.f11642m = i11;
        uVar.f11633a = 1;
        uVar.f11636f = 0.0f;
        return uVar;
    }

    public static p5 U2(i1 i1Var) {
        for (ViewParent parent = i1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof p5) {
                return (p5) parent;
            }
        }
        return null;
    }

    public static void W2(ArrayList arrayList, ArrayList arrayList2, Map map) {
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
                        W2(arrayList, pageblockdetails.blocks, map);
                        if (arrayList.size() == size2) {
                            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        aVar.f11195i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a2 = q0.a();
                        W2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f11197k.add(0, Long.valueOf(a2));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a2), pageblockblockquoteblocks.caption);
                        }
                    } else {
                        arrayList.add(new a(pageBlock, 0, 0));
                    }
                } else {
                    O2(arrayList, pageBlock, 1);
                }
            }
        }
    }

    public static ArrayList X2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        W2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void Z1(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] a5(p5 p5Var) {
        int i10;
        int i11;
        i6 i6Var = p5Var.F;
        if (i6Var != null) {
            i10 = i6Var.f11442g.size();
        } else {
            i10 = 0;
        }
        while (i10 >= 0) {
            i1 l4 = p5Var.l(i10);
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

    public static ArrayList g3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean h4(i1 i1Var, float f7, float f10) {
        if (i1Var != null && i1Var.getVisibility() == 0) {
            int[] iArr = new int[2];
            i1Var.getLocationOnScreen(iArr);
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

    public static int k4(int i10, a aVar, boolean z10) {
        int i11;
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        if (z10) {
            i11 = aVar.f11198l;
        } else {
            i11 = aVar.f11199m;
        }
        int size = aVar.f11197k.size() - i11;
        return org.telegram.messenger.z0.D(16.0f, Math.max(0, i10 - size), AndroidUtilities.dp(2.0f));
    }

    public static boolean l3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !D3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int l4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f11197k;
        int i10 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f11197k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i10 < min && ((Long) arrayList.get(i10)).equals(arrayList2.get(i10))) {
            i10++;
        }
        return i10;
    }

    public void setEditTextsLocked(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof e6) {
                ((e6) childAt).setLocked(z10);
            } else if (childAt instanceof p5) {
                ((p5) childAt).setLocked(z10);
            } else if (childAt instanceof m0) {
                ((m0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof u0) {
                ((u0) childAt).setLocked(z10);
            } else if (childAt instanceof y0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean v3(int i10) {
        if (i10 != 21 && i10 != 22 && i10 != 19 && i10 != 20) {
            return false;
        }
        return true;
    }

    public static int w2(int i10) {
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

    public static boolean x3(a aVar) {
        if (aVar != null && (aVar.f11191b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || E3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !e6.z(pageBlock).isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean A1() {
        return this.T3;
    }

    public final ArrayList A2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f11735l3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (u uVar : Q3((a) arrayList2.get(i10))) {
                if (uVar.b() && (photo = uVar.f11637g) != null && hashSet.add(Long.valueOf(photo.f18107id))) {
                    arrayList.add(uVar.f11637g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View A4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.X2.m(i10);
    }

    public final ArrayList B2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f11735l3;
            if (i10 < arrayList2.size()) {
                for (u uVar : Q3((a) arrayList2.get(i10))) {
                    if (uVar.b() && (photo = uVar.f11637g) != null && hashSet.add(Long.valueOf(photo.f18107id))) {
                        arrayList.add(uVar.f11637g);
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final int[] B4() {
        int i10;
        ArrayList arrayList = this.f11735l3;
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y()) {
            int indexOf = arrayList.indexOf(y4(k3Var.f20771u0));
            int indexOf2 = arrayList.indexOf(y4(k3Var.f20774x0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        a Q2 = Q2();
        if (Q2 != null) {
            i10 = arrayList.indexOf(Q2);
        } else {
            i10 = -1;
        }
        if (i10 >= 0) {
            return new int[]{i10, i10};
        }
        return null;
    }

    @Override
    public final void C1() {
        v3 v3Var = this.f11728h3;
        if (v3Var != null) {
            v3Var.s();
        }
    }

    public final void C2() {
        i2 i2Var = this.J3;
        if (i2Var != null) {
            i2Var.h();
        }
        ArrayList arrayList = this.f11735l3;
        SpannableStringBuilder k10 = d5.k(arrayList);
        G2();
        arrayList.clear();
        HashMap hashMap = this.f11736m3;
        hashMap.clear();
        this.f11733k3 = null;
        W2(arrayList, d5.b(k10), hashMap);
        this.Y2.N(false);
        i2 i2Var2 = this.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        v3 v3Var = this.f11728h3;
        if (v3Var != null) {
            v3Var.onContentChanged();
            v3Var.F();
        }
    }

    public final boolean C4() {
        int i10;
        int i11;
        int i12;
        int i13;
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y()) {
            if (L3()) {
                int i14 = k3Var.f20771u0;
                int i15 = k3Var.f20772v0;
                int i16 = k3Var.f20775y0;
                int i17 = k3Var.f20773w0;
                int i18 = k3Var.f20776z0;
                for (int i19 = i15; i19 <= i16; i19++) {
                    i1 N4 = N4(i14, i19);
                    if (N4 != null) {
                        int length = N4.length();
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
            } else if (y3()) {
                i1 I2 = I2(k3Var.f20771u0);
                if (I2 != null && Math.max(0, Math.min(Math.min(k3Var.f20773w0, k3Var.f20776z0), I2.length())) < Math.max(0, Math.min(Math.max(k3Var.f20773w0, k3Var.f20776z0), I2.length()))) {
                    return true;
                }
            } else if (w3()) {
                i1 s22 = s2(k3Var.f20771u0);
                if (s22 != null) {
                    int i20 = k3Var.f20773w0;
                    int i21 = k3Var.f20776z0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), s22.length())) < Math.max(0, Math.min(Math.max(i20, i21), s22.length()))) {
                        return true;
                    }
                }
            } else if (G3()) {
                i1 j42 = j4(k3Var.f20771u0);
                if (j42 != null) {
                    int i22 = k3Var.f20773w0;
                    int i23 = k3Var.f20776z0;
                    if (Math.max(0, Math.min(Math.min(i22, i23), j42.length())) < Math.max(0, Math.min(Math.max(i22, i23), j42.length()))) {
                        return true;
                    }
                }
            } else {
                int i24 = k3Var.f20771u0;
                int i25 = k3Var.f20774x0;
                int i26 = k3Var.f20773w0;
                int i27 = k3Var.f20776z0;
                if (i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < this.f11743p4.size()) {
                    for (int i28 = i24; i28 <= i25; i28++) {
                        a y42 = y4(i28);
                        if (y42 != null) {
                            if (y42.f11206t == 0) {
                                TL_iv.PageBlock pageBlock = y42.f11191b;
                                if (!A3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int i29 = i2(i28);
                            if (i28 == i24) {
                                i10 = i26;
                            } else {
                                i10 = 0;
                            }
                            if (i28 == i25) {
                                i11 = i27;
                            } else {
                                i11 = i29;
                            }
                            if (Math.max(0, Math.min(i10, i29)) < Math.max(0, Math.min(i11, i29))) {
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
    public final void D1() {
        v3 v3Var = this.f11728h3;
        if (v3Var != null) {
            v3Var.z();
        }
        x4();
    }

    public final a D2() {
        int i10;
        a y42;
        a Q2 = Q2();
        if (Q2 != null) {
            return Q2;
        }
        k3 k3Var = this.f11738n3;
        if (k3Var != null && (i10 = k3Var.f20771u0) >= 0 && (y42 = y4(i10)) != null) {
            return y42;
        }
        return null;
    }

    public final int[] D4() {
        k3 k3Var = this.f11738n3;
        if (k3Var != null) {
            int i10 = k3Var.f20771u0;
            int i11 = k3Var.f20774x0;
            if (i10 >= 0 && i11 >= 0) {
                a y42 = y4(i10);
                a y43 = y4(i11);
                if (y42 != null && y43 != null) {
                    ArrayList arrayList = this.f11735l3;
                    int indexOf = arrayList.indexOf(y42);
                    int indexOf2 = arrayList.indexOf(y43);
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
    public final void E1(s4.c1 c1Var) {
        v3 v3Var = this.f11728h3;
        if (v3Var != null && c1Var != null) {
            View view = c1Var.f42627a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.T3 = v3Var.e(view.getHeight() + iArr[1]);
        }
    }

    public final void E2() {
        ArrayList arrayList;
        k3 k3Var = this.f11738n3;
        int i10 = k3Var.f20771u0;
        int i11 = k3Var.f20773w0;
        int i12 = k3Var.f20774x0;
        if (!W1(i10, i11, i12, k3Var.f20776z0, new String[]{""})) {
            if (i10 > i12) {
                i12 = i10;
                i10 = i12;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i10);
            while (true) {
                arrayList = this.f11735l3;
                if (max > i12) {
                    break;
                }
                ArrayList arrayList3 = this.f11743p4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f11206t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                i2 i2Var = this.J3;
                if (i2Var != null) {
                    i2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f11736m3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        hashSet.addAll(((a) arrayList.get(i13)).f11197k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                x2();
                V3();
                s4();
                k3Var.f(false);
                this.Y2.N(false);
                i2 i2Var2 = this.J3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                post(new p2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void E4(i1 i1Var) {
        i1Var.adaptiveCreateLinkDialog = this.j3;
        i1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override
    public final void F1(s4.c1 c1Var) {
        a aVar = this.S3;
        this.S3 = null;
        this.T3 = false;
        if (aVar != null) {
            i2 i2Var = this.J3;
            if (i2Var != null) {
                i2Var.d();
            }
            r4(aVar);
            i2 i2Var2 = this.J3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            v3 v3Var = this.f11728h3;
            if (v3Var != null) {
                v3Var.onContentChanged();
            }
        } else if (c1Var != null) {
            View view = c1Var.f42627a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean F2() {
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y()) {
            k3Var.f(false);
            return true;
        } else if (this.f11731i4 == null) {
            return false;
        } else {
            M2();
            return true;
        }
    }

    public final void F4(ii.p5 r34) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.F4(ii.p5):void");
    }

    @Override
    public final void G1(s4.c1 c1Var) {
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
        v3 v3Var = this.f11728h3;
        if (v3Var != null) {
            v3Var.o();
        }
    }

    public final void G2() {
        k3 k3Var = this.f11738n3;
        if (k3Var != null) {
            k3Var.f(true);
        }
        M2();
        n3();
        IdentityHashMap identityHashMap = this.Z3;
        for (b5 b5Var : identityHashMap.values()) {
            b5Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.f11719a4;
        for (x4 x4Var : identityHashMap2.values()) {
            x4Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean G3() {
        int i10;
        a y42;
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y() && (i10 = k3Var.f20771u0) == k3Var.f20774x0 && i10 >= 0 && i10 < this.f11743p4.size() && k3Var.f20772v0 == 1 && k3Var.f20775y0 == 1 && (y42 = y4(i10)) != null && e6.p(y42.f11191b)) {
            return true;
        }
        return false;
    }

    public final e6 G4() {
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y()) {
            int i10 = k3Var.f20771u0;
            int i11 = k3Var.f20774x0;
            a y42 = y4(i10);
            if (i10 == i11 && y42 != null && A3(y42.f11191b)) {
                return u2(i10);
            }
            return null;
        }
        return null;
    }

    public final int H2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.f11735l3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (x3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).f11195i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean H3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f11735l3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.f11195i && !x3(aVar)) {
                        if (!aVar.f11197k.isEmpty() || e6.p(aVar.f11191b)) {
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

    public final Editable H4(int i10, int i11, int i12, int i13) {
        if (i10 == i12) {
            if (x3(y4(i10))) {
                i1 I2 = I2(i10);
                if (I2 != null) {
                    return I2.getText();
                }
                return null;
            } else if (G3()) {
                i1 j42 = j4(i10);
                if (j42 != null) {
                    return j42.getText();
                }
                return null;
            } else {
                a y42 = y4(i10);
                if (y42 != null && A3(y42.f11191b)) {
                    int i22 = i2(i10);
                    if (hg.c.B(i11, i13, i22, 0) < hg.c.y(i11, i13, i22, 0)) {
                        e6 u22 = u2(i10);
                        if (u22 != null) {
                            return u22.getEditText().getText();
                        }
                        return e6.A(y42.f11191b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final i1 I2(int i10) {
        if (!x3(y4(i10))) {
            return null;
        }
        View A4 = A4(i10);
        if (!(A4 instanceof u0)) {
            return null;
        }
        return ((u0) A4).getEditText();
    }

    public final boolean I3() {
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y()) {
            int i10 = k3Var.f20771u0;
            int i11 = k3Var.f20774x0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a y42 = y4(i10);
                    if (y42 != null) {
                        if (C3(y42.f11191b)) {
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

    public final boolean I4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.I4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean J3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.J3(int, int, int, int, int):boolean");
    }

    public final void J4(View view) {
        s4.c1 T;
        int b10;
        if (view != null && this.Z2 != null && this.f23292c3 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.Y2.H(b10) >= 0) {
            this.A3 = true;
            k3 k3Var = this.f11738n3;
            if (k3Var.y()) {
                k3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.Z2.r(T);
        }
    }

    public final boolean K3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        boolean z10 = false;
        for (int i18 = i12; i18 <= i14; i18++) {
            i1 N4 = N4(i11, i18);
            if (N4 != null) {
                int length = N4.length();
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
                } else if ((N4.getCurrentStyle(max, max2) & i10) == 0) {
                    return false;
                } else {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void K4(a aVar, u uVar, MediaController.PhotoEntry photoEntry) {
        int i10;
        float f7;
        b5 b5Var = (b5) this.Z3.remove(uVar);
        if (b5Var != null) {
            b5Var.b();
        }
        IdentityHashMap identityHashMap = this.f11719a4;
        x4 x4Var = (x4) identityHashMap.remove(uVar);
        if (x4Var != null) {
            x4Var.a();
        }
        uVar.f11633a = 1;
        uVar.f11636f = 0.0f;
        x4 x4Var2 = new x4(this.f11724f3, photoEntry, new i3(aVar, uVar, this));
        identityHashMap.put(uVar, x4Var2);
        if (!x4Var2.f11758f && !x4Var2.h && !x4Var2.f11759n) {
            x4Var2.f11758f = true;
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
            x4Var2.d = videoEditedInfo;
            if (videoEditedInfo != null && videoEditedInfo.needConvert()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f18104id = 1;
                String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
                x4Var2.e = absolutePath;
                tL_message.attachPath = absolutePath;
                MessageObject messageObject = new MessageObject(x4Var2.f11755a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                x4Var2.f11757c = messageObject;
                messageObject.videoEditedInfo = x4Var2.d;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(x4Var2.f11755a);
                notificationCenter.addObserver(x4Var2, NotificationCenter.filePreparingStarted);
                notificationCenter.addObserver(x4Var2, NotificationCenter.fileNewChunkAvailable);
                notificationCenter.addObserver(x4Var2, NotificationCenter.filePreparingFailed);
                MediaController.getInstance().scheduleVideoConvert(x4Var2.f11757c, false, false, false);
                return;
            }
            x4Var2.b();
        }
    }

    public final boolean L3() {
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y()) {
            int i10 = k3Var.f20771u0;
            int i11 = k3Var.f20774x0;
            a y42 = y4(i10);
            if (i10 == i11 && y42 != null && (y42.f11191b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void L4(a aVar, u uVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.Z3;
        b5 b5Var = (b5) identityHashMap.remove(uVar);
        if (b5Var != null) {
            b5Var.b();
        }
        b5 b5Var2 = new b5(this.f11724f3, str, z10, i10, i11, i12, new j3(aVar, uVar, this));
        identityHashMap.put(uVar, b5Var2);
        b5Var2.d();
    }

    public final void M2() {
        if (this.B3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.B3 = false;
        this.C3 = false;
        this.D3 = null;
        this.E3 = null;
        o70 o70Var = this.f11732j4;
        if (o70Var != null) {
            this.f11732j4 = null;
            o70Var.u();
        }
        p5 p5Var = this.f11731i4;
        if (p5Var != null) {
            LinkedHashSet linkedHashSet = p5Var.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                p5Var.v.invalidate();
                p5Var.t();
            }
            this.f11731i4 = null;
        }
        this.l4 = -1;
        this.f11734k4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean M3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.f11724f3).config;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f11735l3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += Q3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList Z2 = Z2();
        ?? obj = new Object();
        obj.d = i11;
        obj.f11451b = Z2.size() + obj.f11451b;
        for (int i12 = 0; i12 < Z2.size(); i12++) {
            j2.b((TL_iv.PageBlock) Z2.get(i12), 1, obj);
        }
        if (obj.f11450a > appGlobalConfig.richMessageLengthLimit.get() || obj.f11451b > appGlobalConfig.richMessageMaxBlocks.get() || obj.f11452c > appGlobalConfig.richMessageMaxDepth.get() || obj.d > appGlobalConfig.richMessageMaxMedia.get() || obj.e > appGlobalConfig.richMessageMaxTableCols.get()) {
            return false;
        }
        return true;
    }

    public final Editable M4(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof e6) {
            return ((e6) z12).getEditText().getText();
        }
        return e6.A(aVar.f11191b);
    }

    public final i1 N4(int i10, int i11) {
        View A4 = A4(i10);
        if (!(A4 instanceof p5)) {
            return null;
        }
        return ((p5) A4).l(i11);
    }

    public final int[] O3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.N3.size(); i12++) {
            int length = e6.z(((a) this.N3.get(i12)).f11191b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.N3.size() - 1;
        return new int[]{size, e6.z(((a) this.N3.get(size)).f11191b).length()};
    }

    public final i1 P2() {
        View findFocus = findFocus();
        if (findFocus instanceof i1) {
            return (i1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof e6) {
                return ((e6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int P3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f11735l3;
            if (i12 < arrayList.size()) {
                a aVar = (a) arrayList.get(i12);
                if (x3(aVar)) {
                    i11++;
                } else if (aVar.f11195i && i11 - 1 == 0) {
                    return i12;
                }
                i12++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final a Q2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof e6) {
                e6 e6Var = (e6) childAt;
                if (e6Var.getEditText().isFocused() || (e6Var.n() && e6Var.h.isFocused())) {
                    return e6Var.getRow();
                }
            }
        }
        return null;
    }

    public final void Q4() {
        boolean z10;
        int[] B4 = B4();
        if (B4 != null) {
            int i10 = B4[0];
            int i11 = B4[1];
            if (i10 >= 0) {
                ArrayList arrayList = this.f11735l3;
                if (i11 < arrayList.size() && i10 <= i11) {
                    i2 i2Var = this.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    if (H3(i10, i11)) {
                        for (int i12 = i10; i12 <= i11; i12++) {
                            a aVar = (a) arrayList.get(i12);
                            boolean z11 = aVar.f11195i;
                            ArrayList arrayList2 = aVar.f11197k;
                            if (!z11 && !x3(aVar)) {
                                if (e6.p(aVar.f11191b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f11191b.text;
                                    aVar.f11191b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    a4.a.y(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a2 = q0.a();
                        for (int i13 = i10; i13 <= i11; i13++) {
                            a aVar2 = (a) arrayList.get(i13);
                            boolean z12 = aVar2.f11195i;
                            ArrayList arrayList3 = aVar2.f11197k;
                            if (!z12 && !x3(aVar2)) {
                                if (e6.p(aVar2.f11191b)) {
                                    long a10 = q0.a();
                                    TL_iv.RichText k10 = e6.k(aVar2.f11191b);
                                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                        this.f11736m3.put(Long.valueOf(a10), k10);
                                    }
                                    arrayList3.add(Long.valueOf(a10));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f11191b.text;
                                    aVar2.f11191b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a2));
                            }
                        }
                    }
                    x2();
                    V3();
                    s4();
                    k3 k3Var = this.f11738n3;
                    if (k3Var != null && k3Var.y()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
                    this.Y2.N(false);
                    i2 i2Var2 = this.J3;
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

    public final void R1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.R1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final p5 R2() {
        View findFocus = findFocus();
        if (findFocus instanceof i1) {
            return U2((i1) findFocus);
        }
        return null;
    }

    public final void R4(ii.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.R4(ii.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final TLRPC.Document S2(long j3) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        TLRPC.Document document2 = null;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0) {
            return null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f11735l3.size(); i12++) {
            for (u uVar : Q3((a) this.f11735l3.get(i12))) {
                if (uVar != null && (document = uVar.h) != null && document.f18089id == j3) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f11733k3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.Document document3 = arrayList.get(i11);
                i11++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f18089id == j3) {
                    return document4;
                }
            }
        }
        HashMap hashMap = w4.f11703a;
        synchronized (w4.class) {
            if (i10 != 0) {
                document2 = (TLRPC.Document) w4.f11704b.get(Long.valueOf(j3));
            }
        }
        return document2;
    }

    public final boolean S4() {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.S4():boolean");
    }

    public final void T1(a aVar, MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        x3 x3Var;
        if (aVar != null && D3(aVar.f11191b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                i2 i2Var = this.J3;
                if (i2Var != null) {
                    i2Var.d();
                }
                u T3 = T3(photoEntry, str2);
                boolean c10 = x4.c(photoEntry);
                if (!photoEntry.isVideo && !c10) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (B3(aVar.f11191b)) {
                    g3(aVar.f11191b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(T3);
                } else {
                    u uVar = aVar.f11194g;
                    if (uVar != null && uVar.f11633a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f11191b.caption;
                        l0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f11191b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f11194g);
                        aVar.h.add(T3);
                        aVar.f11194g = null;
                        aVar.f11191b = pageblockcollage;
                    } else {
                        aVar.f11191b = pageblockvideo;
                        aVar.f11194g = T3;
                    }
                }
                this.Y2.N(false);
                n4(aVar);
                if (c10) {
                    K4(aVar, T3, photoEntry);
                    x3Var = this;
                } else {
                    x3Var = this;
                    x3Var.L4(aVar, T3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                i2 i2Var2 = x3Var.J3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                x3Var.f11728h3.onContentChanged();
            }
        }
    }

    public final int T2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f11735l3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f11195i) {
                int i12 = 0;
                int i13 = -1;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (x3(aVar2)) {
                        i12++;
                        if (i13 == -1 && !((TL_iv.pageBlockDetails) aVar2.f11191b).open) {
                            i13 = i12;
                        }
                    } else if (aVar2.f11195i) {
                        if (i13 != -1 && i12 == i13) {
                            i13 = -1;
                        }
                        i12--;
                    }
                }
                if (i13 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f11191b;
                    if (!E3(pageBlock) || l3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i10;
                    }
                }
            }
            i10 += i11;
        }
        return -1;
    }

    public final boolean T4(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.T4(android.view.View, float, float):boolean");
    }

    public final void U1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            i2 i2Var = this.J3;
            if (i2Var != null) {
                i2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f11733k3;
            if (richMessage2 == null) {
                this.f11733k3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f11733k3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            W2(arrayList4, richMessage.blocks, this.f11736m3);
            if (!arrayList4.isEmpty()) {
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    v4((a) arrayList4.get(i10));
                }
                ArrayList arrayList5 = this.f11735l3;
                int size = arrayList5.size();
                a Q2 = Q2();
                if (Q2 != null && (indexOf = arrayList5.indexOf(Q2)) >= 0) {
                    TL_iv.PageBlock pageBlock = Q2.f11191b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && e6.z(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                V3();
                s4();
                this.Y2.N(false);
                i2 i2Var2 = this.J3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                v3 v3Var = this.f11728h3;
                if (v3Var != null) {
                    v3Var.onContentChanged();
                }
            }
        }
    }

    public final a U3(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f11743p4;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f11195i) {
                    if (aVar.f11206t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f11191b;
                        if (E3(pageBlock) && !l3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
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

    public final void U4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        Editable A;
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 != null && pageBlock != null) {
            ArrayList arrayList = this.f11735l3;
            if (arrayList.indexOf(aVar2) >= 0 && !x3(aVar2) && !aVar2.f11195i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f11191b;
                if (pageBlock != pageBlock2 && A3(pageBlock2) && A3(pageBlock)) {
                    e6 u22 = u2(arrayList.indexOf(aVar2));
                    if (u22 != null) {
                        A = u22.getEditText().getText();
                    } else {
                        A = e6.A(aVar2.f11191b);
                    }
                    e6.d(pageBlock, A);
                    TL_iv.RichText k10 = e6.k(aVar2.f11191b);
                    if (k10 != null && e6.k(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = k10;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = k10;
                        }
                    }
                }
                R4(aVar2, pageBlock, i10, i11, z10, z11);
            }
        }
    }

    public final a V1(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.f11743p4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i11 = indexOf + i10) >= 0 && i11 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i11);
            if (aVar2.f11206t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final void V2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof e6) {
                e6 e6Var = (e6) childAt;
                e6Var.f11349f.n();
                e6Var.h.n();
            } else if (childAt instanceof m0) {
                ((m0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof u0) {
                ((u0) childAt).getEditText().n();
            }
        }
    }

    public final void V3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11735l3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f11197k.isEmpty() && e6.p(aVar.f11191b)) {
                    long a2 = q0.a();
                    TL_iv.RichText k10 = e6.k(aVar.f11191b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        this.f11736m3.put(Long.valueOf(a2), k10);
                    }
                    aVar.f11197k.add(Long.valueOf(a2));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f11191b.text;
                    aVar.f11191b = pageblockparagraph;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void V4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        U4(aVar2, pageBlock, aVar2.f11192c, aVar2.d, aVar2.e, aVar2.f11193f);
    }

    public final boolean W1(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.W1(int, int, int, int, java.lang.String[]):boolean");
    }

    public final boolean W3(ii.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.W3(ii.a, boolean):boolean");
    }

    public final void W4(a aVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            U4(aVar2, aVar2.f11191b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f11192c);
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
        TL_iv.PageBlock pageBlock = aVar2.f11191b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        if (z10 && aVar2.f11193f) {
            z11 = true;
        } else {
            z11 = false;
        }
        U4(aVar2, pageBlock, max, i11, z10, z11);
    }

    public final void X1() {
        e6 e6Var;
        a aVar;
        b6 b6Var;
        this.Y2.S();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof e6) && (aVar = (e6Var = (e6) childAt).f11354x) != null && (b6Var = e6Var.f11355y) != null) {
                e6Var.g(aVar, b6Var, e6Var.E);
            }
        }
    }

    public final void X3() {
        int length;
        int B;
        int y3;
        int length2;
        int B2;
        int y10;
        int length3;
        int B3;
        int y11;
        int length4;
        int B4;
        int y12;
        i1 N4;
        int length5;
        int B5;
        int y13;
        boolean L3 = L3();
        k3 k3Var = this.f11738n3;
        if (L3) {
            int i10 = k3Var.f20771u0;
            int i11 = k3Var.f20772v0;
            if (i11 == k3Var.f20775y0 && (N4 = N4(i10, i11)) != null && (B5 = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length5 = N4.length()), 0)) < (y13 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length5, 0))) {
                i2 i2Var = this.J3;
                if (i2Var != null) {
                    i2Var.d();
                }
                if (g6.h(N4.getText(), B5, y13)) {
                    g6.n(N4.getText(), B5, y13);
                    N4.invalidateEffects();
                    g4(i10, i11);
                    i2 i2Var2 = this.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    o4();
                }
                N4.setSelectionOverride(B5, y13);
                N4.makeSelectedDate();
            }
        } else if (y3()) {
            int i12 = k3Var.f20771u0;
            i1 I2 = I2(i12);
            if (I2 != null && (B4 = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length4 = I2.length()), 0)) < (y12 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length4, 0))) {
                i2 i2Var3 = this.J3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                if (g6.h(I2.getText(), B4, y12)) {
                    g6.n(I2.getText(), B4, y12);
                    I2.invalidateEffects();
                    e4(i12);
                    i2 i2Var4 = this.J3;
                    if (i2Var4 != null) {
                        i2Var4.h();
                    }
                    o4();
                }
                I2.setSelectionOverride(B4, y12);
                I2.makeSelectedDate();
            }
        } else if (w3()) {
            int i13 = k3Var.f20771u0;
            i1 s22 = s2(i13);
            if (s22 != null && (B3 = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length3 = s22.length()), 0)) < (y11 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length3, 0))) {
                i2 i2Var5 = this.J3;
                if (i2Var5 != null) {
                    i2Var5.d();
                }
                if (g6.h(s22.getText(), B3, y11)) {
                    g6.n(s22.getText(), B3, y11);
                    s22.invalidateEffects();
                    d4(i13);
                    i2 i2Var6 = this.J3;
                    if (i2Var6 != null) {
                        i2Var6.h();
                    }
                    o4();
                }
                s22.setSelectionOverride(B3, y11);
                s22.makeSelectedDate();
            }
        } else if (G3()) {
            int i14 = k3Var.f20771u0;
            i1 j42 = j4(i14);
            if (j42 != null && (B2 = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length2 = j42.length()), 0)) < (y10 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length2, 0))) {
                i2 i2Var7 = this.J3;
                if (i2Var7 != null) {
                    i2Var7.d();
                }
                if (g6.h(j42.getText(), B2, y10)) {
                    g6.n(j42.getText(), B2, y10);
                    j42.invalidateEffects();
                    f4(i14);
                    i2 i2Var8 = this.J3;
                    if (i2Var8 != null) {
                        i2Var8.h();
                    }
                    o4();
                }
                j42.setSelectionOverride(B2, y10);
                j42.makeSelectedDate();
            }
        } else {
            e6 G4 = G4();
            if (G4 == null || (B = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length = G4.getEditText().length()), 0)) >= (y3 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length, 0))) {
                return;
            }
            i2 i2Var9 = this.J3;
            if (i2Var9 != null) {
                i2Var9.d();
            }
            if (g6.h(G4.getEditText().getText(), B, y3)) {
                g6.n(G4.getEditText().getText(), B, y3);
                G4.getEditText().invalidateEffects();
                G4.x();
                i2 i2Var10 = this.J3;
                if (i2Var10 != null) {
                    i2Var10.h();
                }
                o4();
            }
            G4.getEditText().setSelectionOverride(B, y3);
            G4.getEditText().makeSelectedDate();
        }
    }

    public final a X4() {
        k3 k3Var;
        int i10;
        a Q2 = Q2();
        if (Q2 == null && (k3Var = this.f11738n3) != null && k3Var.y() && (i10 = k3Var.f20771u0) == k3Var.f20774x0) {
            return y4(i10);
        }
        return Q2;
    }

    public final boolean Y1(int i10, int i11) {
        k3 k3Var;
        ArrayList arrayList = this.N3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] O3 = O3(max);
            int[] O32 = O3(max2);
            a aVar = (a) this.N3.get(O3[0]);
            if (O3[0] != O32[0] && max != max2) {
                View z12 = z1(aVar);
                View z13 = z1(this.N3.get(O32[0]));
                if ((z12 instanceof e6) && (z13 instanceof e6)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f11735l3;
                        int size = arrayList2.size();
                        k3Var = this.f11738n3;
                        if (i12 >= size) {
                            break;
                        }
                        k3Var.Y(i12, e6.z(((a) arrayList2.get(i12)).f11191b));
                        i12++;
                    }
                    e6 e6Var = (e6) z12;
                    int length = e6Var.getEditText().length();
                    if (O3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!k3Var.k0(e6Var, 0, O3[1], length)) {
                        e6Var.B();
                        return true;
                    }
                    k3Var.c0(0, O32[1], (e6) z13);
                    return true;
                }
            } else {
                View z14 = z1(aVar);
                if (z14 instanceof e6) {
                    e6 e6Var2 = (e6) z14;
                    e6Var2.B();
                    i1 editText = e6Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(O3[1], length2), Math.min(O32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList Y2(int i10, int i11, int i12, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z11;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.f11735l3;
            a aVar = (a) arrayList2.get(i15);
            boolean z12 = aVar.f11195i;
            ArrayList arrayList3 = aVar.f11197k;
            if (z12) {
                i15++;
            } else if (arrayList3.size() > i12) {
                Long l4 = (Long) arrayList3.get(i12);
                long longValue = l4.longValue();
                int i16 = i15 + 1;
                while (i16 < i11) {
                    a aVar2 = (a) arrayList2.get(i16);
                    if (aVar2.f11197k.size() <= i12 || ((Long) aVar2.f11197k.get(i12)).longValue() != longValue) {
                        break;
                    }
                    i16++;
                }
                ArrayList<TL_iv.PageBlock> Y2 = Y2(i15, i16, i12 + 1, true);
                if (Y2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f11736m3.get(l4);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (Y2.size() == 1 && (Y2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        if (Y2.get(0).text != null) {
                            textempty = Y2.get(0).text;
                        } else {
                            textempty = new TL_iv.textEmpty();
                        }
                        pageblockblockquote.text = textempty;
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = Y2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i15 = i16;
            } else if (x3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f11191b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int P3 = P3(i15);
                pageblockdetails.blocks = Y2(i15 + 1, Math.min(P3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = P3 + 1;
            } else {
                int i17 = aVar.f11192c;
                if (i17 <= 0) {
                    J2(aVar, arrayList);
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
                    TL_iv.PageBlock k22 = k2(i15, i17, i13, i14, z11, iArr);
                    if (k22 != null) {
                        arrayList.add(k22);
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
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) hg.c.h(1, arrayList))) {
                a4.a.y(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void Y3(int i10) {
        int i11;
        i2 i2Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        SpannableStringBuilder spannableStringBuilder;
        int i15;
        int length;
        int B;
        int y3;
        boolean z11;
        int i16;
        int length2;
        int B2;
        int y10;
        boolean z12;
        int i17;
        int length3;
        int B3;
        int y11;
        boolean z13;
        int i18;
        i2 i2Var2;
        int i19;
        int i20;
        int i21;
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y()) {
            boolean L3 = L3();
            v3 v3Var = this.f11728h3;
            int i22 = 0;
            if (L3) {
                int i23 = k3Var.f20771u0;
                int i24 = k3Var.f20772v0;
                int i25 = k3Var.f20775y0;
                int i26 = k3Var.f20773w0;
                int i27 = k3Var.f20776z0;
                boolean K3 = K3(i10, i23, i24, i26, i25, i27);
                if (!K3) {
                    i18 = w2(i10);
                } else {
                    i18 = 0;
                }
                i2 i2Var3 = this.J3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                this.I3 = true;
                int i28 = i24;
                boolean z14 = false;
                while (i28 <= i25) {
                    i1 N4 = N4(i23, i28);
                    if (N4 == null) {
                        i21 = i24;
                    } else {
                        int length4 = N4.length();
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
                            if (!K3) {
                                if (i18 != 0) {
                                    N4.removeStyle(i18, max, max2);
                                }
                                N4.addStyle(i10, max, max2);
                            } else {
                                N4.removeStyle(i10, max, max2);
                            }
                            N4.invalidateEffects();
                            N4.requestLayout();
                            g4(i23, i28);
                            z14 = true;
                        }
                    }
                    i28++;
                    i24 = i21;
                }
                this.I3 = false;
                if (z14 && (i2Var2 = this.J3) != null) {
                    i2Var2.h();
                }
                v3Var.l();
                if (z14) {
                    o4();
                }
            } else if (y3()) {
                int i30 = k3Var.f20771u0;
                i1 I2 = I2(i30);
                if (I2 != null && (B3 = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length3 = I2.length()), 0)) < (y11 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length3, 0))) {
                    if ((I2.getCurrentStyle(B3, y11) & i10) == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i2 i2Var4 = this.J3;
                    if (i2Var4 != null) {
                        i2Var4.d();
                    }
                    this.I3 = true;
                    if (z13) {
                        int w22 = w2(i10);
                        if (w22 != 0) {
                            I2.removeStyle(w22, B3, y11);
                        }
                        I2.addStyle(i10, B3, y11);
                    } else {
                        I2.removeStyle(i10, B3, y11);
                    }
                    this.I3 = false;
                    e4(i30);
                    I2.invalidateEffects();
                    I2.requestLayout();
                    i2 i2Var5 = this.J3;
                    if (i2Var5 != null) {
                        i2Var5.h();
                    }
                    v3Var.l();
                    o4();
                }
            } else if (w3()) {
                int i31 = k3Var.f20771u0;
                i1 s22 = s2(i31);
                if (s22 != null && (B2 = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length2 = s22.length()), 0)) < (y10 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length2, 0))) {
                    if ((s22.getCurrentStyle(B2, y10) & i10) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i17 = w2(i10);
                    } else {
                        i17 = 0;
                    }
                    i2 i2Var6 = this.J3;
                    if (i2Var6 != null) {
                        i2Var6.d();
                    }
                    this.I3 = true;
                    if (z12) {
                        if (i17 != 0) {
                            s22.removeStyle(i17, B2, y10);
                        }
                        s22.addStyle(i10, B2, y10);
                    } else {
                        s22.removeStyle(i10, B2, y10);
                    }
                    s22.invalidateEffects();
                    s22.requestLayout();
                    d4(i31);
                    this.I3 = false;
                    i2 i2Var7 = this.J3;
                    if (i2Var7 != null) {
                        i2Var7.h();
                    }
                    v3Var.l();
                    o4();
                }
            } else if (G3()) {
                int i32 = k3Var.f20771u0;
                i1 j42 = j4(i32);
                if (j42 != null && (B = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length = j42.length()), 0)) < (y3 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length, 0))) {
                    if ((j42.getCurrentStyle(B, y3) & i10) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i16 = w2(i10);
                    } else {
                        i16 = 0;
                    }
                    i2 i2Var8 = this.J3;
                    if (i2Var8 != null) {
                        i2Var8.d();
                    }
                    this.I3 = true;
                    if (z11) {
                        if (i16 != 0) {
                            j42.removeStyle(i16, B, y3);
                        }
                        j42.addStyle(i10, B, y3);
                    } else {
                        j42.removeStyle(i10, B, y3);
                    }
                    j42.invalidateEffects();
                    j42.requestLayout();
                    f4(i32);
                    this.I3 = false;
                    i2 i2Var9 = this.J3;
                    if (i2Var9 != null) {
                        i2Var9.h();
                    }
                    v3Var.l();
                    o4();
                }
            } else {
                int i33 = k3Var.f20771u0;
                int i34 = k3Var.f20774x0;
                int i35 = k3Var.f20773w0;
                int i36 = k3Var.f20776z0;
                if (i33 >= 0 && i34 >= 0 && i34 >= i33 && i34 < this.f11743p4.size()) {
                    int i37 = i10;
                    boolean J3 = J3(i37, i33, i35, i34, i36);
                    boolean z15 = !J3;
                    if (!J3) {
                        i11 = w2(i37);
                    } else {
                        i11 = 0;
                    }
                    i2 i2Var10 = this.J3;
                    if (i2Var10 != null) {
                        i2Var10.d();
                    }
                    this.I3 = true;
                    int i38 = i33;
                    boolean z16 = false;
                    while (i38 <= i34) {
                        a y42 = y4(i38);
                        if (y42 != null) {
                            TL_iv.PageBlock pageBlock = y42.f11191b;
                            if (A3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int i210 = i2(i38);
                                if (i38 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = 0;
                                }
                                z10 = z16;
                                if (i38 == i34) {
                                    i14 = i36;
                                } else {
                                    i14 = i210;
                                }
                                int max3 = Math.max(i22, Math.min(i13, i210));
                                int max4 = Math.max(i22, Math.min(i14, i210));
                                if (max3 >= max4) {
                                    i12 = i11;
                                    z16 = z10;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                } else {
                                    e6 u22 = u2(i38);
                                    if (u22 != null) {
                                        org.telegram.ui.ActionBar.v4 styleDelegate = u22.getStyleDelegate();
                                        if (!J3) {
                                            if (i11 != 0) {
                                                styleDelegate.removeStyle(i11, max3, max4);
                                            }
                                            styleDelegate.addStyle(i37, max3, max4);
                                        } else {
                                            styleDelegate.removeStyle(i37, max3, max4);
                                        }
                                        u22.getEditText().invalidateEffects();
                                        u22.getEditText().requestLayout();
                                        u22.x();
                                        i12 = i11;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(e6.A(y42.f11191b));
                                        if (!J3 && i11 != 0) {
                                            i12 = i11;
                                            i15 = max3;
                                            g6.o(spannableStringBuilder2, i15, max4, i12, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i12 = i11;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i15 = max3;
                                        }
                                        g6.o(spannableStringBuilder, i15, max4, i37, z15, null);
                                        e6.d(y42.f11191b, spannableStringBuilder);
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
                    if (z17 && (i2Var = this.J3) != null) {
                        i2Var.h();
                    }
                    v3Var.l();
                    if (z17) {
                        o4();
                    }
                }
            }
        }
    }

    public final void Y4(float f7, float f10) {
        TL_iv.pageTableCell m10;
        p5 p5Var = this.f11731i4;
        if (this.B3 && p5Var != null && this.f11753x3 == p5Var && (m10 = p5Var.m((int) ((f7 - p5Var.getLeft()) - getLeft()), (int) ((f10 - p5Var.getTop()) - getTop()))) != null && m10 != this.E3) {
            this.E3 = m10;
            p5Var.w(this.D3, m10);
        }
    }

    public final ArrayList Z2() {
        return Y2(0, this.f11735l3.size(), 0, false);
    }

    public final void Z3(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.Z3(android.view.View):void");
    }

    public final void Z4(a aVar, String str) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11191b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    i2 i2Var = this.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    e6 u22 = u2(this.f11735l3.indexOf(aVar));
                    if (u22 != null && (aVar2 = u22.f11354x) != null) {
                        u22.I(aVar2.f11191b, true);
                        u22.H = null;
                        u22.C();
                    }
                    i2 i2Var2 = this.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                }
            }
        }
    }

    public final void a2() {
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
            ArrayList arrayList6 = this.f11735l3;
            if (i11 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i11);
                ArrayList arrayList7 = aVar.f11196j;
                ArrayList arrayList8 = aVar.f11197k;
                arrayList7.clear();
                if (aVar.f11195i) {
                    if (!arrayList.isEmpty()) {
                        a4.a.y(1, arrayList);
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
                        arrayList7.add((q0) arrayList.get(i13));
                    }
                    int max = Math.max(i10, aVar.f11192c);
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
                                arrayList2.add(Long.valueOf(q0.a()));
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
                                if (((Long) arrayList5.get(i15)).longValue() != 0 && E3(aVar.f11191b)) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (z13) {
                                    arrayList4.set(i15, Integer.valueOf(((Integer) arrayList4.get(i15)).intValue() + 1));
                                    arrayList5.set(i15, Long.valueOf(aVar.f11190a));
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
                    if (x3(aVar)) {
                        boolean z15 = ((TL_iv.pageBlockDetails) aVar.f11191b).open;
                        q0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (e6.p(aVar.f11191b)) {
                        q0.a();
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

    public final boolean a3() {
        a aVar;
        ArrayList arrayList = this.f11735l3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) hg.c.h(1, arrayList);
        }
        if (aVar != null && !E3(aVar.f11191b) && !aVar.f11195i && !x3(aVar) && !K2(aVar.f11191b)) {
            if (!(z1(aVar) instanceof e6)) {
                return false;
            }
            e3(aVar);
            return true;
        }
        i2 i2Var = this.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.Y2.N(false);
        i2 i2Var2 = this.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        post(new p2(this, aVar2, 21));
        return true;
    }

    public final void a4() {
        int length;
        int B;
        int y3;
        int length2;
        int B2;
        int y10;
        int length3;
        int B3;
        int y11;
        int length4;
        int B4;
        int y12;
        i1 N4;
        int length5;
        int B5;
        int y13;
        boolean L3 = L3();
        v3 v3Var = this.f11728h3;
        k3 k3Var = this.f11738n3;
        if (L3) {
            int i10 = k3Var.f20771u0;
            int i11 = k3Var.f20772v0;
            if (i11 == k3Var.f20775y0 && (N4 = N4(i10, i11)) != null && (B5 = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length5 = N4.length()), 0)) < (y13 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length5, 0))) {
                if (g6.h(N4.getText(), B5, y13)) {
                    i2 i2Var = this.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    g6.n(N4.getText(), B5, y13);
                    N4.invalidateEffects();
                    g4(i10, i11);
                    i2 i2Var2 = this.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    v3Var.l();
                    o4();
                    return;
                }
                i2 i2Var3 = this.J3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                if (g6.g(N4.getText(), B5, y13)) {
                    g6.m(N4.getText(), B5, y13);
                    N4.invalidateEffects();
                    g4(i10, i11);
                    i2 i2Var4 = this.J3;
                    if (i2Var4 != null) {
                        i2Var4.h();
                    }
                    o4();
                }
                N4.setSelectionOverride(B5, y13);
                o3(false);
                E4(N4);
            }
        } else if (y3()) {
            int i12 = k3Var.f20771u0;
            i1 I2 = I2(i12);
            if (I2 != null && (B4 = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length4 = I2.length()), 0)) < (y12 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length4, 0))) {
                if (g6.h(I2.getText(), B4, y12)) {
                    i2 i2Var5 = this.J3;
                    if (i2Var5 != null) {
                        i2Var5.d();
                    }
                    g6.n(I2.getText(), B4, y12);
                    I2.invalidateEffects();
                    e4(i12);
                    i2 i2Var6 = this.J3;
                    if (i2Var6 != null) {
                        i2Var6.h();
                    }
                    v3Var.l();
                    o4();
                    return;
                }
                i2 i2Var7 = this.J3;
                if (i2Var7 != null) {
                    i2Var7.d();
                }
                if (g6.g(I2.getText(), B4, y12)) {
                    g6.m(I2.getText(), B4, y12);
                    I2.invalidateEffects();
                    e4(i12);
                    i2 i2Var8 = this.J3;
                    if (i2Var8 != null) {
                        i2Var8.h();
                    }
                    o4();
                }
                I2.setSelectionOverride(B4, y12);
                o3(false);
                E4(I2);
            }
        } else if (w3()) {
            int i13 = k3Var.f20771u0;
            i1 s22 = s2(i13);
            if (s22 != null && (B3 = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length3 = s22.length()), 0)) < (y11 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length3, 0))) {
                if (g6.h(s22.getText(), B3, y11)) {
                    i2 i2Var9 = this.J3;
                    if (i2Var9 != null) {
                        i2Var9.d();
                    }
                    g6.n(s22.getText(), B3, y11);
                    s22.invalidateEffects();
                    d4(i13);
                    i2 i2Var10 = this.J3;
                    if (i2Var10 != null) {
                        i2Var10.h();
                    }
                    v3Var.l();
                    o4();
                    return;
                }
                i2 i2Var11 = this.J3;
                if (i2Var11 != null) {
                    i2Var11.d();
                }
                if (g6.g(s22.getText(), B3, y11)) {
                    g6.m(s22.getText(), B3, y11);
                    s22.invalidateEffects();
                    d4(i13);
                    i2 i2Var12 = this.J3;
                    if (i2Var12 != null) {
                        i2Var12.h();
                    }
                    o4();
                }
                s22.setSelectionOverride(B3, y11);
                o3(false);
                E4(s22);
            }
        } else if (G3()) {
            int i14 = k3Var.f20771u0;
            i1 j42 = j4(i14);
            if (j42 != null && (B2 = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length2 = j42.length()), 0)) < (y10 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length2, 0))) {
                if (g6.h(j42.getText(), B2, y10)) {
                    i2 i2Var13 = this.J3;
                    if (i2Var13 != null) {
                        i2Var13.d();
                    }
                    g6.n(j42.getText(), B2, y10);
                    j42.invalidateEffects();
                    f4(i14);
                    i2 i2Var14 = this.J3;
                    if (i2Var14 != null) {
                        i2Var14.h();
                    }
                    v3Var.l();
                    o4();
                    return;
                }
                i2 i2Var15 = this.J3;
                if (i2Var15 != null) {
                    i2Var15.d();
                }
                if (g6.g(j42.getText(), B2, y10)) {
                    g6.m(j42.getText(), B2, y10);
                    j42.invalidateEffects();
                    f4(i14);
                    i2 i2Var16 = this.J3;
                    if (i2Var16 != null) {
                        i2Var16.h();
                    }
                    o4();
                }
                j42.setSelectionOverride(B2, y10);
                o3(false);
                E4(j42);
            }
        } else {
            e6 G4 = G4();
            if (G4 == null || (B = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length = G4.getEditText().length()), 0)) >= (y3 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length, 0))) {
                return;
            }
            if (g6.h(G4.getEditText().getText(), B, y3)) {
                i2 i2Var17 = this.J3;
                if (i2Var17 != null) {
                    i2Var17.d();
                }
                g6.n(G4.getEditText().getText(), B, y3);
                G4.getEditText().invalidateEffects();
                G4.x();
                i2 i2Var18 = this.J3;
                if (i2Var18 != null) {
                    i2Var18.h();
                }
                v3Var.l();
                o4();
                return;
            }
            i2 i2Var19 = this.J3;
            if (i2Var19 != null) {
                i2Var19.d();
            }
            if (g6.g(G4.getEditText().getText(), B, y3)) {
                g6.m(G4.getEditText().getText(), B, y3);
                G4.getEditText().invalidateEffects();
                G4.x();
                i2 i2Var20 = this.J3;
                if (i2Var20 != null) {
                    i2Var20.h();
                }
                o4();
            }
            G4.getEditText().setSelectionOverride(B, y3);
            o3(false);
            E4(G4.getEditText());
        }
    }

    public final void b2(MessageObject messageObject) {
        TLRPC.Document document;
        String str;
        if (messageObject != null && (document = messageObject.getDocument()) != null) {
            i2 i2Var = this.J3;
            if (i2Var != null) {
                i2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z10 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            u uVar = new u();
            aVar.f11194g = uVar;
            uVar.f11635c = true;
            long j3 = document.f18089id;
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
                u uVar2 = aVar.f11194g;
                uVar2.f11638i = document;
                uVar2.e = str;
                uVar2.f11633a = 1;
                uVar2.f11636f = 0.0f;
            } else {
                uVar.h = document;
                uVar.f11638i = document;
                uVar.f11633a = 2;
                pageblockaudio.audio_id = j3;
            }
            u3(aVar);
            if (z10) {
                u uVar3 = aVar.f11194g;
                String str2 = uVar3.e;
                IdentityHashMap identityHashMap = this.Z3;
                b5 b5Var = (b5) identityHashMap.remove(uVar3);
                if (b5Var != null) {
                    b5Var.b();
                }
                b5 b5Var2 = new b5(this.f11724f3, str2, document, new h3(aVar, uVar3, this));
                identityHashMap.put(uVar3, b5Var2);
                b5Var2.d();
            }
            i2 i2Var2 = this.J3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            this.f11728h3.onContentChanged();
        }
    }

    public final void b3(a aVar, boolean z10) {
        int i10;
        View z12 = z1(aVar);
        if (z12 instanceof h5) {
            i1 i1Var = ((h5) z12).f11405r;
            i1Var.r();
            if (z10) {
                i10 = i1Var.length();
            } else {
                i10 = 0;
            }
            i1Var.setSelection(i10);
            return;
        }
        c3(aVar, z10);
    }

    public final void b4() {
        i1 editText;
        Runnable l2Var;
        int length;
        final int B;
        final int y3;
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y()) {
            if (L3()) {
                int i10 = k3Var.f20771u0;
                int i11 = k3Var.f20772v0;
                if (i11 == k3Var.f20775y0) {
                    editText = N4(i10, i11);
                    l2Var = new q2(this, i10, i11, 1);
                } else {
                    return;
                }
            } else if (y3()) {
                int i12 = k3Var.f20771u0;
                editText = I2(i12);
                l2Var = new k2(this, i12, 3);
            } else if (w3()) {
                int i13 = k3Var.f20771u0;
                editText = s2(i13);
                l2Var = new k2(this, i13, 0);
            } else if (G3()) {
                int i14 = k3Var.f20771u0;
                editText = j4(i14);
                l2Var = new k2(this, i14, 1);
            } else {
                e6 G4 = G4();
                if (G4 != null) {
                    editText = G4.getEditText();
                    l2Var = new l2(G4, 0);
                } else {
                    return;
                }
            }
            final i1 i1Var = editText;
            final Runnable runnable = l2Var;
            if (i1Var != null && (B = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length = i1Var.length()), 0)) <= (y3 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length, 0))) {
                Editable text = i1Var.getText();
                int i15 = t.h;
                String str = null;
                if (text != null) {
                    t[] tVarArr = (t[]) text.getSpans(B, y3, t.class);
                    if (tVarArr.length > 0) {
                        str = tVarArr[0].f11618a;
                    }
                }
                if (str == null) {
                    str = i1Var.getText().subSequence(B, y3).toString();
                }
                final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
                int i16 = org.telegram.ui.ActionBar.h6.G6;
                org.telegram.ui.ActionBar.d6 d6Var = this.f11726g3;
                final int v02 = org.telegram.ui.ActionBar.h6.v0(i16, d6Var);
                r.U(getContext(), str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        t a2;
                        String str2 = (String) obj;
                        x3 x3Var = x3.this;
                        x3Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a2 = t.a(str2, v02, dp)) == null) {
                            return;
                        }
                        i2 i2Var = x3Var.J3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        k3 k3Var2 = x3Var.f11738n3;
                        if (k3Var2 != null) {
                            k3Var2.f(false);
                        }
                        i1 i1Var2 = i1Var;
                        i1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        Editable text2 = i1Var2.getText();
                        int max = Math.max(0, Math.min(B, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(y3, text2.length())), spannableString);
                        runnable.run();
                        i2 i2Var2 = x3Var.J3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        x3Var.f11728h3.onContentChanged();
                        int min = Math.min(max + 1, i1Var2.length());
                        i1Var2.r();
                        x3Var.post(new w2(i1Var2, min, 3));
                    }
                }, d6Var);
            }
        }
    }

    public final void b5(java.lang.CharSequence r18) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.b5(java.lang.CharSequence):void");
    }

    public final void c2(String str) {
        String str2;
        int i10;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.f18089id = 0L;
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
            d2(tL_document, str);
        }
    }

    public final void c3(a aVar, boolean z10) {
        View z12 = z1(aVar);
        if (z12 instanceof p5) {
            p5 p5Var = (p5) z12;
            i1 i1Var = p5Var.f11556r;
            i6 i6Var = p5Var.F;
            if (i6Var != null) {
                if (!z10) {
                    i1Var.r();
                    i1Var.setSelection(0);
                    return;
                } else if (!i6Var.f11442g.isEmpty()) {
                    s5 m10 = p5Var.v.m((TL_iv.pageTableCell) hg.c.h(1, p5Var.F.f11442g));
                    if (m10 != null) {
                        i1 i1Var2 = m10.f11616a;
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
        if (z10 && (z12 instanceof e6)) {
            e6 e6Var = (e6) z12;
            if (e6Var.n()) {
                e6Var.i();
                return;
            }
        }
        i1 R3 = R3(z12);
        if (R3 == null) {
            d3(aVar);
            return;
        }
        R3.r();
        if (z10) {
            R3.setSelection(R3.length());
        }
    }

    public final void c4() {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.c4():void");
    }

    public final void d2(TLRPC.Document document, String str) {
        if (document != null) {
            i2 i2Var = this.J3;
            if (i2Var != null) {
                i2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z10 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            u uVar = new u();
            aVar.f11194g = uVar;
            uVar.d = true;
            long j3 = document.f18089id;
            z10 = (j3 == 0 || document.dc_id == 0 || document.access_hash == 0) ? true : true;
            if (z10) {
                if (!TextUtils.isEmpty(str) && w.c.p(str)) {
                    u uVar2 = aVar.f11194g;
                    uVar2.h = document;
                    uVar2.e = str;
                    uVar2.f11633a = 1;
                    uVar2.f11636f = 0.0f;
                } else {
                    return;
                }
            } else {
                uVar.h = document;
                uVar.f11633a = 2;
                pageblockdocument.document_id = j3;
            }
            u3(aVar);
            if (z10) {
                u uVar3 = aVar.f11194g;
                IdentityHashMap identityHashMap = this.Z3;
                b5 b5Var = (b5) identityHashMap.remove(uVar3);
                if (b5Var != null) {
                    b5Var.b();
                }
                b5 b5Var2 = new b5(this.f11724f3, str, document, new g3(this, uVar3, aVar, str));
                identityHashMap.put(uVar3, b5Var2);
                b5Var2.d();
            }
            i2 i2Var2 = this.J3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            this.f11728h3.onContentChanged();
        }
    }

    public final void d3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof e6) {
            ((e6) z12).B();
        } else if (z12 instanceof u0) {
            ((u0) z12).d.r();
        }
    }

    public final void d4(int i10) {
        View A4 = A4(i10);
        if (A4 instanceof m0) {
            ((m0) A4).b();
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
                arrayList = this.f11743p4;
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
                    ArrayList arrayList3 = aVar4.f11197k;
                    if (arrayList3.size() > i14) {
                        i14 = arrayList3.size();
                    }
                }
                i13++;
            }
            if (i14 != 0) {
                if (this.f11745q4 == null) {
                    tl0 tl0Var = new tl0(this);
                    this.f11745q4 = tl0Var;
                    tl0Var.a(null, null, null, this.f11726g3, 1);
                    o8.a(this.f11745q4, this.f11726g3);
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
                                ArrayList arrayList4 = aVar.f11197k;
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
                            int k42 = k4(i15, aVar5, true);
                            l10 = l4;
                            int k43 = k4(i15, aVar6, false);
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
                                int B = org.telegram.messenger.z0.B(16.0f, getWidth(), dp);
                                if (B - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, k42 + f10, B, f11 - k43);
                                    aVar2 = aVar5;
                                    aVar3 = aVar6;
                                    this.f11745q4.b(canvas, rectF, floor, floor, floor, f12);
                                    f7 = f12;
                                    this.f11745q4.e(canvas, rectF, f7);
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

    public final void e2(Uri uri) {
        boolean contains;
        if (uri != null) {
            a aVar = this.f11720b4;
            String str = null;
            this.f11720b4 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e) {
                FileLog.e(e);
            }
            String str2 = str;
            if (str2 != null) {
                contains = str2.startsWith("video");
            } else {
                contains = uri.toString().contains("video");
            }
            boolean z10 = contains;
            int i10 = this.f11747r4;
            this.f11747r4 = i10 - 1;
            Utilities.globalQueue.postRunnable(new s2(this, uri, z10, str2, i10, aVar));
        }
    }

    public final void e3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof e6) {
            e6 e6Var = (e6) z12;
            e6Var.B();
            i1 editText = e6Var.getEditText();
            editText.setSelection(editText.length());
        } else if (z12 instanceof u0) {
            u0 u0Var = (u0) z12;
            u0Var.d.r();
            i1 editText2 = u0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void e4(int i10) {
        a y42 = y4(i10);
        i1 I2 = I2(i10);
        if (x3(y42) && I2 != null) {
            ((TL_iv.pageBlockDetails) y42.f11191b).title = g6.f(I2.getText());
        }
    }

    public final void f2(MediaController.PhotoEntry photoEntry) {
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
        i2 i2Var = this.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        boolean c10 = x4.c(photoEntry);
        if (!photoEntry.isVideo && !c10) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        a aVar = new a(pageblockvideo, 0, 0);
        aVar.f11194g = T3(photoEntry, str2);
        u3(aVar);
        if (c10) {
            K4(aVar, aVar.f11194g, photoEntry);
            x3Var = this;
        } else {
            x3Var = this;
            x3Var.L4(aVar, aVar.f11194g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        i2 i2Var2 = x3Var.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        x3Var.f11728h3.onContentChanged();
    }

    public final void f3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof e6) {
            e6 e6Var = (e6) z12;
            e6Var.B();
            e6Var.getEditText().setSelection(0);
        } else if (z12 instanceof u0) {
            u0 u0Var = (u0) z12;
            u0Var.d.r();
            u0Var.getEditText().setSelection(0);
        }
    }

    public final void f4(int i10) {
        View A4 = A4(i10);
        if (A4 instanceof e6) {
            ((e6) A4).w();
        }
    }

    public final void g2(p5 p5Var) {
        p5 p5Var2 = this.f11731i4;
        if (p5Var2 != null && p5Var2 != p5Var) {
            LinkedHashSet linkedHashSet = p5Var2.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                p5Var2.v.invalidate();
                p5Var2.t();
            }
        }
        this.f11731i4 = p5Var;
        this.C3 = false;
        this.l4 = -1;
        this.f11734k4 = -1;
        p5Var.setCellSelectionListener(this.f11737m4);
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y()) {
            k3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void g4(int i10, int i11) {
        s5 m10;
        View A4 = A4(i10);
        if (A4 instanceof p5) {
            p5 p5Var = (p5) A4;
            if (i11 == 0) {
                p5Var.u();
                return;
            }
            TL_iv.pageTableCell h = p5Var.h(i11);
            if (h != null && (m10 = p5Var.getGrid().m(h)) != null) {
                i6.d(h, m10.f11616a.getText());
            }
        }
    }

    public i1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof i1) {
            return (i1) findFocus;
        }
        return null;
    }

    public n4 getMapDelegate() {
        return this.f11722d4;
    }

    public View getOverlayView() {
        return this.f11740o3;
    }

    public r9 getTextSelectionHelper() {
        return this.f11738n3;
    }

    public final o3 h2() {
        int i10;
        int i11;
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y() && !G3()) {
            a y42 = y4(k3Var.f20771u0);
            ArrayList arrayList = this.f11735l3;
            int indexOf = arrayList.indexOf(y42);
            int indexOf2 = arrayList.indexOf(y4(k3Var.f20774x0));
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
                    if (aVar.f11195i || x3(aVar)) {
                        return null;
                    }
                }
                return new o3(this, i10, i11, k3Var.f20773w0, k3Var.f20776z0);
            }
            return null;
        }
        return null;
    }

    public final boolean h3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.h3(android.view.KeyEvent):boolean");
    }

    public final int i2(int i10) {
        i1 I2 = I2(i10);
        if (I2 != null) {
            return I2.length();
        }
        e6 u22 = u2(i10);
        if (u22 != null) {
            return u22.getEditText().length();
        }
        a y42 = y4(i10);
        if (y42 == null) {
            return 0;
        }
        return e6.z(y42.f11191b).length();
    }

    public final boolean i3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.i3(android.view.MotionEvent):boolean");
    }

    public final int i4(int i10) {
        Layout layout;
        View A4 = A4(i10);
        if (!(A4 instanceof e6) || (layout = ((e6) A4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage j2() {
        if (k3()) {
            ArrayList<TL_iv.PageBlock> Z2 = Z2();
            if (Z2.isEmpty()) {
                return null;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = Z2;
            richMessage.photos = B2();
            richMessage.documents = y2();
            return richMessage;
        }
        return null;
    }

    public final boolean j3(ii.p5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.j3(ii.p5, int, int):boolean");
    }

    public final i1 j4(int i10) {
        View A4 = A4(i10);
        if (A4 instanceof e6) {
            return ((e6) A4).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock k2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.k2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean k3() {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.k3():boolean");
    }

    public final boolean l2() {
        i1 editText;
        int length;
        int B;
        int y3;
        l4[] l4VarArr;
        k3 k3Var = this.f11738n3;
        if (k3Var == null || !k3Var.y() || k3Var.f20771u0 != k3Var.f20774x0) {
            return false;
        }
        if (L3()) {
            int i10 = k3Var.f20771u0;
            int i11 = k3Var.f20772v0;
            if (i11 != k3Var.f20775y0) {
                return false;
            }
            editText = N4(i10, i11);
        } else if (y3()) {
            editText = I2(k3Var.f20771u0);
        } else if (w3()) {
            editText = s2(k3Var.f20771u0);
        } else if (G3()) {
            editText = j4(k3Var.f20771u0);
        } else {
            e6 G4 = G4();
            if (G4 == null) {
                return false;
            }
            editText = G4.getEditText();
        }
        if (editText == null || (B = hg.c.B(k3Var.f20773w0, k3Var.f20776z0, (length = editText.length()), 0)) >= (y3 = hg.c.y(k3Var.f20773w0, k3Var.f20776z0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && B < y3) {
            for (l4 l4Var : (l4[]) text.getSpans(B, y3, l4.class)) {
                if (text.getSpanStart(l4Var) < y3 && text.getSpanEnd(l4Var) > B) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean m2() {
        int[] D4 = D4();
        if (D4 == null) {
            return n2(D2());
        }
        for (int i10 = D4[0]; i10 <= D4[1]; i10++) {
            if (n2((a) this.f11735l3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean m3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11735l3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            for (u uVar : Q3((a) arrayList.get(i10))) {
                if (uVar.a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean m4(int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.f11735l3;
            if (i11 < arrayList.size()) {
                i2 i2Var = this.J3;
                if (i2Var != null) {
                    i2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i11 >= i10) {
                        if (q3(i11, true, true)) {
                            z11 = true;
                        }
                        i11--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i10);
                    if (aVar.f11192c >= 1 && (i10 == 0 || ((a) arrayList.get(i10 - 1)).f11192c < aVar.f11192c)) {
                        return false;
                    }
                    z11 = false;
                    while (i10 <= i11) {
                        if (q3(i10, false, true)) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    s4();
                    if (findFocus() instanceof i1) {
                        X1();
                    } else {
                        this.Y2.N(false);
                    }
                    i2 i2Var2 = this.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final boolean n2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar != null && (indexOf = (arrayList = this.f11735l3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f11192c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f11191b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !C3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !o2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f11192c < aVar2.f11192c) {
                return false;
            }
            if (p3(indexOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof e6) {
                e6 e6Var = (e6) childAt;
                e6Var.f11349f.hideActionMode();
                e6Var.h.hideActionMode();
            } else if (childAt instanceof p5) {
                p5 p5Var = (p5) childAt;
                r5 r5Var = p5Var.v;
                p5Var.f11556r.hideActionMode();
                for (int i11 = 0; i11 < r5Var.getChildCount(); i11++) {
                    View childAt2 = r5Var.getChildAt(i11);
                    if (childAt2 instanceof s5) {
                        ((s5) childAt2).f11616a.hideActionMode();
                    }
                }
            } else if (childAt instanceof m0) {
                ((m0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof u0) {
                ((u0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void n4(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof v4) {
            v4 v4Var = (v4) z12;
            ArrayList arrayList = v4Var.f11685y;
            if (v4Var.f11207a != null) {
                v4Var.n();
                if (v4Var.W >= arrayList.size()) {
                    v4Var.W = Math.max(0, arrayList.size() - 1);
                }
                v4Var.o(false);
                v4Var.requestLayout();
                v4Var.invalidate();
            }
        }
    }

    public final boolean o2(int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f11735l3;
            if (i10 < arrayList.size() && E3(((a) arrayList.get(i10)).f11191b) && ((a) arrayList.get(i10 - 1)).f11192c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o3(boolean z10) {
        k3 k3Var = this.f11738n3;
        if (k3Var != null) {
            if (z10) {
                k3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(k3Var.f20008r0);
                k3Var.v();
            }
        }
        if (z10) {
            V2();
        } else {
            n3();
        }
    }

    public final void o4() {
        post(new b(this, 3));
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
        this.f23290a3 = false;
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
                    post(new k2(this, dp, 2));
                }
            }
        }
        this.K3 = i14;
    }

    public final boolean p2() {
        int[] D4 = D4();
        if (D4 == null) {
            return q2(D2());
        }
        for (int i10 = D4[0]; i10 <= D4[1]; i10++) {
            if (q2((a) this.f11735l3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean p3(int i10) {
        if (((a) this.f11735l3.get(i10)).f11192c + 1 <= MessagesController.getInstance(this.f11724f3).config.richMessageMaxDepth.get() - 6) {
            return true;
        }
        return false;
    }

    public final void p4(int i10) {
        ArrayList arrayList = this.f11735l3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f11192c > 0) {
                View z12 = z1(aVar);
                if (z12 instanceof e6) {
                    ((e6) z12).F();
                }
            }
        }
    }

    public final boolean q2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.f11735l3).indexOf(aVar)) < 0 || aVar.f11192c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f11192c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean q3(int i10, boolean z10, boolean z11) {
        boolean z12;
        a aVar;
        int i11;
        int i12 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.f11735l3;
            if (i10 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar2.f11192c > 0) {
                        t2(i10);
                        return true;
                    }
                } else if (aVar2.f11192c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f11191b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !C3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if ((z12 || o2(i10)) && p3(i10)) {
                        if (i10 > 0) {
                            aVar = (a) arrayList.get(i10 - 1);
                        } else {
                            aVar = null;
                        }
                        if (z12) {
                            aVar2.f11192c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i12 = 1;
                            }
                            aVar2.d = i12;
                            return true;
                        }
                        aVar2.f11192c = aVar.f11192c;
                        if (aVar.d > 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        aVar2.d = i11;
                        aVar2.e = false;
                        aVar2.f11193f = false;
                        return true;
                    }
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).f11192c >= aVar2.f11192c)) && p3(i10)) {
                    aVar2.f11192c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void q4(a aVar, u uVar) {
        int i10;
        if (aVar == null) {
            return;
        }
        if (B3(aVar.f11191b)) {
            ArrayList g32 = g3(aVar.f11191b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(uVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                aVar.h.remove(i10);
                if (g32 != null && i10 < g32.size()) {
                    g32.remove(i10);
                }
            }
            if (aVar.h.isEmpty()) {
                r4(aVar);
                return;
            }
            int size = aVar.h.size();
            v51 v51Var = this.Y2;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f11191b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) g32.get(0);
                aVar.f11191b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f11194g = (u) aVar.h.get(0);
                aVar.h = null;
                v51Var.N(true);
                n4(aVar);
                return;
            }
            v51Var.N(true);
            n4(aVar);
            return;
        }
        r4(aVar);
    }

    public final boolean r2() {
        i2 i2Var = this.J3;
        if (i2Var != null) {
            if (i2Var.e || !i2Var.f11424b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r3(boolean z10) {
        a aVar;
        int i10;
        int i11;
        int[] D4 = D4();
        if (D4 != null && (i10 = D4[0]) != (i11 = D4[1])) {
            m4(i10, i11, z10);
            return;
        }
        if (D4 == null) {
            aVar = D2();
        } else {
            aVar = (a) this.f11735l3.get(D4[0]);
        }
        if (aVar != null) {
            W3(aVar, z10);
        }
    }

    public final void r4(a aVar) {
        ArrayList arrayList = this.f11735l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.Y2.N(true);
        }
    }

    public final i1 s2(int i10) {
        View A4 = A4(i10);
        if (A4 instanceof m0) {
            return ((m0) A4).getCaptionEditText();
        }
        return null;
    }

    public final void s3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f11197k;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size && i10 < arrayList.size() && ((Long) arrayList3.get(i10)).equals(arrayList.get(i10))) {
            i10++;
        }
        for (int i11 = size - 1; i11 >= i10; i11--) {
            Long l4 = (Long) arrayList3.get(i11);
            long longValue = l4.longValue();
            Integer num = (Integer) hashMap.get(l4);
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.f11736m3.containsKey(l4))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f11206t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.f11197k.add((Long) arrayList3.get(i12));
                }
                int i13 = g5.f11387a;
                h51 J = h51.J(g5.class);
                J.G = aVar2;
                J.H = this.f11725f4;
                arrayList2.add(J);
                this.f11743p4.add(aVar2);
            }
        }
    }

    public final void s4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11735l3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (aVar.f11192c > 0 && aVar.d > 0 && !E3(aVar.f11191b)) {
                    int i11 = aVar.f11192c;
                    int i12 = 1;
                    for (int i13 = i10 - 1; i13 >= 0; i13--) {
                        a aVar2 = (a) arrayList.get(i13);
                        int i14 = aVar2.f11192c;
                        if (i14 < i11) {
                            break;
                        }
                        if (i14 == i11 && !E3(aVar2.f11191b)) {
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

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.j3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.R3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.f11730i3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.N3 = new ArrayList();
        ArrayList arrayList = this.f11735l3;
        W2(arrayList, d5.b(charSequence), this.f11736m3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.N3.add((a) arrayList.get(size));
        }
        this.Y2.N(false);
    }

    public final void t2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.f11735l3;
        a aVar2 = (a) arrayList.get(i10);
        int i12 = aVar2.f11192c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            aVar2.f11192c = i13;
            if (i13 == 0) {
                aVar2.d = 0;
                aVar2.e = false;
                aVar2.f11193f = false;
            }
            while (true) {
                i10++;
                if (i10 < arrayList.size() && (i11 = (aVar = (a) arrayList.get(i10)).f11192c) > i12) {
                    aVar.f11192c = i11 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void t3() {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.t3():void");
    }

    public final void t4(String str) {
        k3 k3Var = this.f11738n3;
        W1(k3Var.f20771u0, k3Var.f20773w0, k3Var.f20774x0, k3Var.f20776z0, str.split("\n", -1));
    }

    public final e6 u2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m10 = this.X2.m(i10);
        if (!(m10 instanceof e6)) {
            return null;
        }
        return (e6) m10;
    }

    public final void u3(ii.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: ii.x3.u3(ii.a):void");
    }

    public final u u4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document S2 = S2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (S2 == null) {
                return null;
            }
            u uVar = new u();
            uVar.f11635c = true;
            uVar.f11633a = 2;
            uVar.h = S2;
            uVar.f11638i = S2;
            return uVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document S22 = S2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (S22 == null) {
                return null;
            }
            u uVar2 = new u();
            uVar2.d = true;
            uVar2.f11633a = 2;
            uVar2.h = S22;
            return uVar2;
        } else {
            int i10 = 0;
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document S23 = S2(pageblockvideo.video_id);
                if (S23 == null) {
                    return null;
                }
                u uVar3 = new u();
                uVar3.f11634b = true;
                uVar3.f11633a = 2;
                uVar3.h = S23;
                uVar3.f11643n = pageblockvideo.spoiler;
                while (i10 < S23.attributes.size()) {
                    if (S23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) S23.attributes.get(i10);
                        uVar3.f11639j = tL_documentAttributeVideo.f18090w;
                        uVar3.f11640k = tL_documentAttributeVideo.h;
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
                        if (i12 < this.f11735l3.size()) {
                            for (u uVar4 : Q3((a) this.f11735l3.get(i12))) {
                                if (uVar4 != null && (photo = uVar4.f11637g) != null && photo.f18107id == j3) {
                                    break loop1;
                                }
                            }
                            i12++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f11733k3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i10);
                                    i10++;
                                    photo = photo2;
                                    if (photo != null && photo.f18107id == j3) {
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = w4.f11703a;
                            synchronized (w4.class) {
                                if (i11 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) w4.f11703a.get(Long.valueOf(j3));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                u uVar5 = new u();
                uVar5.f11633a = 2;
                uVar5.f11637g = photo;
                uVar5.f11643n = pageblockphoto.spoiler;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null) {
                    uVar5.f11639j = closestPhotoSizeWithSize.f18108w;
                    uVar5.f11640k = closestPhotoSizeWithSize.h;
                }
                return uVar5;
            }
        }
    }

    public final void v2() {
        G2();
        this.f11733k3 = null;
        this.f11720b4 = null;
        this.f11721c4 = null;
        this.J3 = new i2(this.f11741o4);
        z4();
        this.J3.j();
        v3 v3Var = this.f11728h3;
        if (v3Var != null) {
            v3Var.F();
        }
    }

    public final void v4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f11733k3 != null && aVar != null && (pageBlock = aVar.f11191b) != null) {
            if (B3(pageBlock)) {
                ArrayList g32 = g3(aVar.f11191b);
                aVar.h = new ArrayList();
                if (g32 != null) {
                    for (int i10 = 0; i10 < g32.size(); i10++) {
                        u u42 = u4((TL_iv.PageBlock) g32.get(i10));
                        ArrayList arrayList = aVar.h;
                        if (u42 == null) {
                            u42 = new u();
                        }
                        arrayList.add(u42);
                    }
                    return;
                }
                return;
            }
            u u43 = u4(aVar.f11191b);
            if (u43 != null) {
                aVar.f11194g = u43;
            }
        }
    }

    public final boolean w3() {
        int i10;
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y() && (i10 = k3Var.f20771u0) == k3Var.f20774x0 && i10 >= 0 && i10 < this.f11743p4.size()) {
            return A4(i10) instanceof m0;
        }
        return false;
    }

    public final ArrayList w4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (B3(aVar.f11191b)) {
                ArrayList g32 = g3(aVar.f11191b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (g32 != null) {
                    int size2 = g32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = g32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        u u42 = u4(pageBlock);
                        if (u42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(u42);
                        }
                    }
                    g32.clear();
                    g32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.f11191b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    u u43 = u4(pageBlock2);
                    if (u43 != null) {
                        aVar.f11194g = u43;
                        arrayList2.add(aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final boolean x2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.f11735l3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.f11195i;
            ArrayList arrayList2 = aVar.f11197k;
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
            ArrayList arrayList3 = aVar2.f11197k;
            if (arrayList3.size() == 1 && (aVar2.f11191b instanceof TL_iv.pageBlockParagraph)) {
                Long l4 = (Long) arrayList3.get(0);
                l4.getClass();
                Integer num = (Integer) hashMap.get(l4);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f11191b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f11736m3.remove(l4);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f11191b = pageblockblockquote;
                    arrayList3.clear();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void x4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof m4) {
                a0 a0Var = (a0) ((m4) childAt);
                a0Var.f11208b.a(a0Var.f11207a, new ei.d5(a0Var, 13));
            }
        }
        invalidate();
    }

    public final ArrayList y2() {
        TLRPC.Document document;
        u uVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f11735l3;
            if (i10 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i10);
                if ((aVar.f11191b instanceof TL_iv.pageBlockDocument) && (uVar = aVar.f11194g) != null && uVar.b() && (document2 = aVar.f11194g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f11191b).document_id = document2.f18089id;
                }
                for (u uVar2 : Q3(aVar)) {
                    if (uVar2.b() && (document = uVar2.h) != null) {
                        long j3 = document.f18089id;
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

    public final boolean y3() {
        int i10;
        k3 k3Var = this.f11738n3;
        if (k3Var != null && k3Var.y() && (i10 = k3Var.f20771u0) == k3Var.f20774x0 && x3(y4(i10))) {
            return true;
        }
        return false;
    }

    public final a y4(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f11743p4;
            if (i10 < arrayList.size()) {
                return (a) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final ArrayList z2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f11735l3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (u uVar : Q3((a) arrayList2.get(i10))) {
                if (uVar.b() && (document = uVar.h) != null && hashSet.add(Long.valueOf(document.f18089id))) {
                    arrayList.add(uVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void z4() {
        ArrayList arrayList = this.f11735l3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.Y2.N(false);
    }
}
