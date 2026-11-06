package li;

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
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.gf;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.j20;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.zj0;
public final class t3 extends q41 {
    public static final ArrayList f18870z4 = new ArrayList();
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
    public f2 Q3;
    public int R3;
    public g1 S3;
    public final i T3;
    public ArrayList U3;
    public int V3;
    public int W3;
    public int X3;
    public boolean Y3;
    public a Z3;
    public boolean f18871a4;
    public final l3 f18872b4;
    public final q2 f18873c4;
    public final m3 f18874d4;
    public final n3 f18875e4;
    public final o3 f18876f4;
    public final IdentityHashMap f18877g4;
    public final IdentityHashMap f18878h4;
    public a f18879i4;
    public a f18880j4;
    public final p3 f18881k4;
    public final y2 f18882l4;
    public final int f18883m3;
    public final z2 f18884m4;
    public final f6 f18885n3;
    public final a3 f18886n4;
    public final r3 f18887o3;
    public final b3 o4;
    public ij f18888p3;
    public m5 f18889p4;
    public boolean f18890q3;
    public k60 f18891q4;
    public TL_iv.RichMessage f18892r3;
    public int f18893r4;
    public final ArrayList f18894s3;
    public int f18895s4;
    public final HashMap f18896t3;
    public final r2 f18897t4;
    public final g3 f18898u3;
    public final c3 f18899u4;
    public final u9 f18900v3;
    public final gf.g f18901v4;
    public int f18902w3;
    public final ArrayList f18903w4;
    public int f18904x3;
    public zj0 f18905x4;
    public int f18906y3;
    public int f18907y4;
    public boolean f18908z3;

    public t3(Context context, int i7, f6 f6Var, r3 r3Var) {
        super(context, i7, 0, false, new hi.u1(r1, 18), new l2.y(r1, 7), null, f6Var);
        this.f18890q3 = true;
        this.f18894s3 = new ArrayList();
        this.f18896t3 = new HashMap();
        this.f18902w3 = -1;
        this.f18904x3 = -1;
        this.f18906y3 = 0;
        this.T3 = new i(this, 2);
        this.Y3 = true;
        this.f18872b4 = new l3(this);
        this.f18873c4 = new q2(this);
        this.f18874d4 = new m3(this);
        this.f18875e4 = new n3(this);
        this.f18876f4 = new o3(this);
        this.f18877g4 = new IdentityHashMap();
        this.f18878h4 = new IdentityHashMap();
        this.f18881k4 = new p3(this);
        this.f18882l4 = new y2(this);
        this.f18884m4 = new z2(this);
        this.f18886n4 = new a3(this);
        this.o4 = new b3(this);
        this.f18893r4 = -1;
        this.f18895s4 = -1;
        this.f18897t4 = new r2(this);
        this.f18899u4 = new c3(this);
        gf.g gVar = new gf.g(this, 13);
        this.f18901v4 = gVar;
        this.f18903w4 = new ArrayList();
        this.f18907y4 = -1;
        t3[] t3VarArr = {this};
        this.f18883m3 = i7;
        this.f18885n3 = f6Var;
        this.f18887o3 = r3Var;
        this.f37160f3.f35510r = false;
        setClipToPadding(false);
        setClipChildren(false);
        E1(new hi.u1(this, 19), false);
        setReorderLongPressEnabled(false);
        z1(true);
        g3 g3Var = new g3(this, r3Var);
        this.f18898u3 = g3Var;
        g3Var.S(this);
        g3Var.f29324z0 = this.f37159e3;
        u9 n10 = g3Var.n(context);
        this.f18900v3 = n10;
        org.telegram.messenger.g0.E2(n10);
        g3Var.D = new i3(this, r3Var);
        j(new ai.o0(1, this, r3Var));
        this.Q3 = new f2(gVar);
    }

    public static boolean A3(a aVar) {
        if (aVar != null && (aVar.f18389b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || H3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !a6.z(pageBlock).isEmpty()) {
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
        if (aVar != null && !aVar.f18394i && !A3(aVar) && (aVar.f18389b instanceof TL_iv.pageBlockParagraph) && aVar.f18390c == 0 && aVar.d == 0 && !aVar.f18391e && aVar.f18396k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void L1(li.t3[] r20, java.util.ArrayList r21, org.telegram.ui.Components.l41 r22) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.L1(li.t3[], java.util.ArrayList, org.telegram.ui.Components.l41):void");
    }

    public static void M2(ArrayList arrayList, a aVar) {
        int i7;
        int i10;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j3;
        TL_iv.PageBlock pageBlock = aVar.f18389b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            s sVar = aVar.f18393g;
            if (sVar != null && sVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f18389b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f18389b.caption.text = new TL_iv.textEmpty();
                        aVar.f18389b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f18389b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            s sVar2 = aVar.f18393g;
            if (sVar2 != null && sVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f18389b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f18389b.caption.text = new TL_iv.textEmpty();
                        aVar.f18389b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f18389b);
                }
            }
        } else if (E3(pageBlock)) {
            ArrayList j32 = j3(aVar.f18389b);
            List T3 = T3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i11 = 0; j32 != null && i11 < j32.size() && i11 < T3.size(); i11++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) j32.get(i11);
                if (((s) T3.get(i11)).b()) {
                    if (pageBlock4 instanceof TL_iv.pageBlockPhoto) {
                        j3 = ((TL_iv.pageBlockPhoto) pageBlock4).photo_id;
                    } else if (pageBlock4 instanceof TL_iv.pageBlockVideo) {
                        j3 = ((TL_iv.pageBlockVideo) pageBlock4).video_id;
                    } else {
                        j3 = 0;
                    }
                    if (j3 != 0) {
                        j0.d(pageBlock4);
                        arrayList2.add(pageBlock4);
                    }
                }
            }
            if (arrayList2.size() >= 2) {
                if (aVar.f18389b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f18389b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f18389b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                j0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f18389b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                s sVar3 = aVar.f18393g;
                if (sVar3 != null && sVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f18389b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f18389b.caption.text = new TL_iv.textEmpty();
                            aVar.f18389b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f18389b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                s sVar4 = aVar.f18393g;
                if (sVar4 != null && (document = sVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f26959id;
                }
                if (sVar4 != null && sVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f18389b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        j0.d(pageBlock7);
                        arrayList.add(aVar.f18389b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
                int i12 = m4.M;
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
                    arrayList.add(aVar.f18389b);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock5;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                if (pageblocktable.rows != null) {
                    for (int i13 = 0; i13 < pageblocktable.rows.size(); i13++) {
                        TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i13);
                        if (pagetablerow.cells != null) {
                            for (int i14 = 0; i14 < pagetablerow.cells.size(); i14++) {
                                TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i14);
                                if (pagetablecell.text == null) {
                                    e6.c(pagetablecell, "");
                                } else {
                                    pagetablecell.flags |= 128;
                                }
                                if (pagetablecell.colspan > 1) {
                                    i7 = pagetablecell.flags | 2;
                                } else {
                                    i7 = pagetablecell.flags & (-3);
                                }
                                pagetablecell.flags = i7;
                                if (pagetablecell.rowspan > 1) {
                                    i10 = pagetablecell.flags | 4;
                                } else {
                                    i10 = pagetablecell.flags & (-5);
                                }
                                pagetablecell.flags = i10;
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

    public static boolean N2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static void O1(t3 t3Var, int i7, int i10, int i11) {
        g1 editText;
        if (i7 >= 0) {
            View m10 = t3Var.f37159e3.m(i7);
            if (m10 instanceof a6) {
                a6 a6Var = (a6) m10;
                if (i10 == 1 && a6Var.n()) {
                    editText = a6Var.getAuthorEditText();
                } else {
                    editText = a6Var.getEditText();
                }
                editText.O();
                editText.setSelection(Math.max(0, Math.min(i11, editText.length())));
            } else if (m10 instanceof m5) {
                m5 m5Var = (m5) m10;
                g1 m11 = m5Var.m(i10);
                if (m11 == null) {
                    m11 = m5Var.m(0);
                }
                if (m11 != null) {
                    m11.O();
                    m11.setSelection(Math.max(0, Math.min(i11, m11.length())));
                }
            } else if (m10 instanceof k0) {
                g1 captionEditText = ((k0) m10).getCaptionEditText();
                captionEditText.O();
                captionEditText.setSelection(Math.max(0, Math.min(i11, captionEditText.length())));
            }
        }
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

    public static org.telegram.tgnet.tl.TL_iv.PageBlock P1(li.t3 r2, li.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.P1(li.t3, li.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public static void Q1(t3 t3Var, g1 g1Var) {
        if (g1Var == null) {
            t3Var.getClass();
            return;
        }
        g1Var.W1 = t3Var.f18890q3;
        g1Var.setInlineButtonContext(t3Var.f18883m3);
        g1Var.setInlineButtonClickListener(new r2(t3Var));
    }

    public static void Q2(ArrayList arrayList, ArrayList arrayList2, int i7, boolean z9, int i10, boolean z10, boolean z11) {
        boolean z12 = false;
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i11);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z12) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            W1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i7, i10, z10, z11);
                        } else {
                            a aVar = new a(pageBlock, i7, i10);
                            aVar.f18391e = z10;
                            aVar.f18392f = z11;
                            arrayList.add(aVar);
                        }
                        z12 = true;
                    } else {
                        arrayList.add(new a(pageBlock, i7, z9 ? 1 : 0));
                    }
                } else {
                    if (!z12) {
                        W1(arrayList, null, i7, i10, z10, z11);
                        z12 = true;
                    }
                    R2(arrayList, pageBlock, i7 + 1);
                }
            }
        }
        if (!z12) {
            W1(arrayList, null, i7, i10, z10, z11);
        }
    }

    public static TL_iv.PageBlock Q3(a aVar, s sVar) {
        int i7;
        if (E3(aVar.f18389b)) {
            ArrayList j3 = j3(aVar.f18389b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i7 = arrayList.indexOf(sVar);
            } else {
                i7 = -1;
            }
            if (i7 >= 0 && j3 != null && i7 < j3.size()) {
                return (TL_iv.PageBlock) j3.get(i7);
            }
            return null;
        }
        return aVar.f18389b;
    }

    public static void R1(a aVar, s sVar, t3 t3Var) {
        r3 r3Var = t3Var.f18887o3;
        IdentityHashMap identityHashMap = t3Var.f18878h4;
        IdentityHashMap identityHashMap2 = t3Var.f18877g4;
        if (sVar == null) {
            ArrayList arrayList = t3Var.f18894s3;
            for (s sVar2 : T3(aVar)) {
                y4 y4Var = (y4) identityHashMap2.remove(sVar2);
                if (y4Var != null) {
                    y4Var.b();
                }
                u4 u4Var = (u4) identityHashMap.remove(sVar2);
                if (u4Var != null) {
                    u4Var.a();
                }
            }
            int indexOf = arrayList.indexOf(aVar);
            if (indexOf >= 0) {
                f2 f2Var = t3Var.Q3;
                if (f2Var != null) {
                    f2Var.d();
                }
                arrayList.remove(indexOf);
                t3Var.f37160f3.O(true);
                f2 f2Var2 = t3Var.Q3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
            }
            r3Var.onContentChanged();
            return;
        }
        y4 y4Var2 = (y4) identityHashMap2.remove(sVar);
        if (y4Var2 != null) {
            y4Var2.b();
        }
        u4 u4Var2 = (u4) identityHashMap.remove(sVar);
        if (u4Var2 != null) {
            u4Var2.a();
        }
        f2 f2Var3 = t3Var.Q3;
        if (f2Var3 != null) {
            f2Var3.d();
        }
        t3Var.t4(aVar, sVar);
        f2 f2Var4 = t3Var.Q3;
        if (f2Var4 != null) {
            f2Var4.h();
        }
        r3Var.onContentChanged();
    }

    public static void R2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i7) {
        int i10 = 0;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            ArrayList<TL_iv.PageListOrderedItem> arrayList2 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
            int size = arrayList2.size();
            int i11 = 1;
            while (i10 < size) {
                TL_iv.PageListOrderedItem pageListOrderedItem = arrayList2.get(i10);
                i10++;
                TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                    W1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i7, i11, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i12 = i11;
                    Q2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i7, true, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                    i11 = i12;
                }
                i11++;
            }
            return;
        }
        ArrayList<TL_iv.PageListItem> arrayList3 = ((TL_iv.pageBlockList) pageBlock).items;
        int size2 = arrayList3.size();
        while (i10 < size2) {
            TL_iv.PageListItem pageListItem = arrayList3.get(i10);
            i10++;
            TL_iv.PageListItem pageListItem2 = pageListItem;
            if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                W1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i7, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                Q2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i7, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static boolean R4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(c6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i7 = 0; i7 < pageblocktable.rows.size(); i7++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i7);
            for (int i10 = 0; i10 < pagetablerow.cells.size(); i10++) {
                if (!e6.g(pagetablerow.cells.get(i10)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void S1(t3 t3Var) {
        if (t3Var.P3) {
            return;
        }
        f2 f2Var = t3Var.Q3;
        if (f2Var != null) {
            f2Var.h();
        }
        t3Var.f18887o3.h();
        t3Var.r4();
    }

    public static FrameLayout S4(m5 m5Var, boolean z9) {
        int i7;
        p5 m10;
        e6 model = m5Var.getModel();
        if (model != null) {
            int i10 = Integer.MAX_VALUE;
            if (z9) {
                i7 = -1;
            } else {
                i7 = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : m5Var.getSelectedCells()) {
                int a10 = model.a(pagetablecell2);
                int o4 = z9 ? (e6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z9 ? o4 < i7 || (o4 == i7 && a10 < i10) : o4 > i7 || (o4 == i7 && a10 < i10)) {
                    pagetablecell = pagetablecell2;
                    i10 = a10;
                    i7 = o4;
                }
            }
            if (pagetablecell != null && (m10 = m5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return m5Var;
    }

    public static void T1(t3 t3Var, a aVar) {
        ArrayList arrayList = t3Var.f18894s3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        f2 f2Var = t3Var.Q3;
        if (f2Var != null) {
            f2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f18396k.addAll(aVar.f18396k);
        arrayList.add(indexOf + 1, aVar2);
        t3Var.v4();
        t3Var.f37160f3.O(false);
        f2 f2Var2 = t3Var.Q3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        t3Var.post(new m2(t3Var, aVar2, 23));
    }

    public static List T3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (E3(aVar.f18389b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        s sVar = aVar.f18393g;
        if (sVar != null) {
            return Collections.singletonList(sVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static boolean U1(li.t3 r17, li.a r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.U1(li.t3, li.a, boolean):boolean");
    }

    public static g1 U3(View view) {
        if (view instanceof a6) {
            return ((a6) view).getEditText();
        }
        if (view instanceof k0) {
            return ((k0) view).getCaptionEditText();
        }
        if (view instanceof r0) {
            return ((r0) view).getEditText();
        }
        return null;
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

    public static void W1(ArrayList arrayList, TL_iv.RichText richText, int i7, int i10, boolean z9, boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i7, i10);
        aVar.f18391e = z9;
        aVar.f18392f = z10;
        arrayList.add(aVar);
    }

    public static s W3(gf gfVar, String str) {
        boolean z9;
        int i7;
        s sVar = new s();
        sVar.f18812b = gfVar.f26824b;
        sVar.f18814e = str;
        sVar.f18818j = gfVar.F;
        sVar.f18819k = gfVar.G;
        String str2 = gfVar.h;
        int i10 = 0;
        if (str2 != null && str != null && str.equals(str2)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i7 = 0;
        } else {
            i7 = gfVar.J;
        }
        sVar.f18820l = i7;
        if (!z9) {
            i10 = gfVar.K;
        }
        sVar.f18821m = i10;
        sVar.f18811a = 1;
        sVar.f18815f = 0.0f;
        return sVar;
    }

    public static m5 X2(g1 g1Var) {
        for (ViewParent parent = g1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof m5) {
                return (m5) parent;
            }
        }
        return null;
    }

    public static void Z2(ArrayList arrayList, ArrayList arrayList2, Map map) {
        TL_iv.RichText richText;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
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
                        aVar.f18394i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a10 = n0.a();
                        Z2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f18396k.add(0, Long.valueOf(a10));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a10), pageblockblockquoteblocks.caption);
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

    public static int[] e5(m5 m5Var) {
        int i7;
        int i10;
        e6 e6Var = m5Var.F;
        if (e6Var != null) {
            i7 = e6Var.f18545g.size();
        } else {
            i7 = 0;
        }
        while (i7 >= 0) {
            g1 m10 = m5Var.m(i7);
            if (m10 != null) {
                i10 = m10.length();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                return new int[]{i7, i10};
            }
            i7--;
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

    public static boolean k4(g1 g1Var, float f10, float f11) {
        int[] iArr;
        if (g1Var != null && g1Var.getVisibility() == 0) {
            g1Var.getLocationOnScreen(new int[2]);
            float f12 = f10 - iArr[0];
            float f13 = f11 - iArr[1];
            if (f12 >= 0.0f && f13 >= 0.0f && f12 <= g1Var.getWidth() && f13 <= g1Var.getHeight()) {
                int offsetForPosition = g1Var.getOffsetForPosition(f12, f13);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                g1Var.O();
                g1Var.setSelection(Math.max(0, Math.min(offsetForPosition, g1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int n4(int i7, a aVar, boolean z9) {
        int i10;
        if (aVar == null) {
            return org.telegram.messenger.g0.L(2.0f);
        }
        if (z9) {
            i10 = aVar.f18397l;
        } else {
            i10 = aVar.f18398m;
        }
        int size = aVar.f18396k.size() - i10;
        return org.telegram.messenger.k5.D(16.0f, Math.max(0, i7 - size), org.telegram.messenger.g0.L(2.0f));
    }

    public static boolean o3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !G3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int o4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f18396k;
        int i7 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f18396k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i7 < min && ((Long) arrayList.get(i7)).equals(arrayList2.get(i7))) {
            i7++;
        }
        return i7;
    }

    public void setEditTextsLocked(boolean z9) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof a6) {
                ((a6) childAt).setLocked(z9);
            } else if (childAt instanceof m5) {
                ((m5) childAt).setLocked(z9);
            } else if (childAt instanceof k0) {
                ((k0) childAt).getCaptionEditText().setLocked(z9);
            } else if (childAt instanceof r0) {
                ((r0) childAt).setLocked(z9);
            } else if (childAt instanceof v0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean y3(int i7) {
        if (i7 != 21 && i7 != 22 && i7 != 19 && i7 != 20) {
            return false;
        }
        return true;
    }

    public static int z2(int i7) {
        if (i7 == 4) {
            return 114971;
        }
        if (i7 == 16384) {
            return 32772;
        }
        if (i7 != 32768) {
            return 4;
        }
        return 16388;
    }

    public final boolean A2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            arrayList = this.f18894s3;
            if (i7 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i7);
            boolean z9 = aVar.f18394i;
            ArrayList arrayList2 = aVar.f18396k;
            if (!z9) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Map.EL.merge(hashMap, (Long) arrayList2.get(i10), 1, new Object());
                }
            }
            i7++;
        }
        boolean z10 = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            a aVar2 = (a) arrayList.get(i11);
            ArrayList arrayList3 = aVar2.f18396k;
            if (arrayList3.size() == 1 && (aVar2.f18389b instanceof TL_iv.pageBlockParagraph)) {
                Long l10 = (Long) arrayList3.get(0);
                l10.getClass();
                Integer num = (Integer) hashMap.get(l10);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f18389b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f18896t3.remove(l10);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f18389b = pageblockblockquote;
                    arrayList3.clear();
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void A4() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof j4) {
                y yVar = (y) ((j4) childAt);
                yVar.f18987b.a(yVar.f18986a, new l2.y(yVar, 4));
            }
        }
        invalidate();
    }

    public final ArrayList B2() {
        TLRPC.Document document;
        s sVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f18894s3;
            if (i7 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i7);
                if ((aVar.f18389b instanceof TL_iv.pageBlockDocument) && (sVar = aVar.f18393g) != null && sVar.b() && (document2 = aVar.f18393g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f18389b).document_id = document2.f26959id;
                }
                for (s sVar2 : T3(aVar)) {
                    if (sVar2.b() && (document = sVar2.h) != null) {
                        long j3 = document.f26959id;
                        if (j3 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j3))) {
                            arrayList.add(sVar2.h);
                        }
                    }
                }
                i7++;
            } else {
                return arrayList;
            }
        }
    }

    public final boolean B3() {
        int i7;
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x() && (i7 = g3Var.f29314p0) == g3Var.f29317s0 && A3(B4(i7))) {
            return true;
        }
        return false;
    }

    public final a B4(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f18903w4;
            if (i7 < arrayList.size()) {
                return (a) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    public final ArrayList C2(int i7, int i10) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i7 <= i10) {
            ArrayList arrayList2 = this.f18894s3;
            if (i7 >= arrayList2.size()) {
                break;
            }
            for (s sVar : T3((a) arrayList2.get(i7))) {
                if (sVar.b() && (document = sVar.h) != null && hashSet.add(Long.valueOf(document.f26959id))) {
                    arrayList.add(sVar.h);
                }
            }
            i7++;
        }
        return arrayList;
    }

    public final void C4() {
        ArrayList arrayList = this.f18894s3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.f37160f3.O(false);
    }

    @Override
    public final boolean D1() {
        return this.f18871a4;
    }

    public final ArrayList D2(int i7, int i10) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i7 <= i10) {
            ArrayList arrayList2 = this.f18894s3;
            if (i7 >= arrayList2.size()) {
                break;
            }
            for (s sVar : T3((a) arrayList2.get(i7))) {
                if (sVar.b() && (photo = sVar.f18816g) != null && hashSet.add(Long.valueOf(photo.f26977id))) {
                    arrayList.add(sVar.f18816g);
                }
            }
            i7++;
        }
        return arrayList;
    }

    public final View D4(int i7) {
        if (i7 < 0) {
            return null;
        }
        return this.f37159e3.m(i7);
    }

    public final ArrayList E2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f18894s3;
            if (i7 < arrayList2.size()) {
                for (s sVar : T3((a) arrayList2.get(i7))) {
                    if (sVar.b() && (photo = sVar.f18816g) != null && hashSet.add(Long.valueOf(photo.f26977id))) {
                        arrayList.add(sVar.f18816g);
                    }
                }
                i7++;
            } else {
                return arrayList;
            }
        }
    }

    public final int[] E4() {
        int i7;
        ArrayList arrayList = this.f18894s3;
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x()) {
            int indexOf = arrayList.indexOf(B4(g3Var.f29314p0));
            int indexOf2 = arrayList.indexOf(B4(g3Var.f29317s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        a T2 = T2();
        if (T2 != null) {
            i7 = arrayList.indexOf(T2);
        } else {
            i7 = -1;
        }
        if (i7 >= 0) {
            return new int[]{i7, i7};
        }
        return null;
    }

    @Override
    public final void F1() {
        r3 r3Var = this.f18887o3;
        if (r3Var != null) {
            r3Var.x();
        }
    }

    public final void F2() {
        f2 f2Var = this.Q3;
        if (f2Var != null) {
            f2Var.h();
        }
        ArrayList arrayList = this.f18894s3;
        SpannableStringBuilder g10 = a5.g(arrayList);
        J2();
        arrayList.clear();
        HashMap hashMap = this.f18896t3;
        hashMap.clear();
        this.f18892r3 = null;
        Z2(arrayList, a5.b(g10), hashMap);
        this.f37160f3.O(false);
        f2 f2Var2 = this.Q3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        r3 r3Var = this.f18887o3;
        if (r3Var != null) {
            r3Var.onContentChanged();
            r3Var.N();
        }
    }

    public final boolean F4() {
        int i7;
        int i10;
        int i11;
        int i12;
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x()) {
            if (O3()) {
                int i13 = g3Var.f29314p0;
                int i14 = g3Var.f29315q0;
                int i15 = g3Var.f29318t0;
                int i16 = g3Var.f29316r0;
                int i17 = g3Var.f29319u0;
                for (int i18 = i14; i18 <= i15; i18++) {
                    g1 Q4 = Q4(i13, i18);
                    if (Q4 != null) {
                        int length = Q4.length();
                        if (i18 == i14) {
                            i11 = i16;
                        } else {
                            i11 = 0;
                        }
                        if (i18 == i15) {
                            i12 = i17;
                        } else {
                            i12 = length;
                        }
                        if (i14 == i15) {
                            i11 = Math.min(i16, i17);
                            i12 = Math.max(i16, i17);
                        }
                        if (Math.max(0, Math.min(i11, length)) < Math.max(0, Math.min(i12, length))) {
                            return true;
                        }
                    }
                }
            } else if (B3()) {
                g1 L2 = L2(g3Var.f29314p0);
                if (L2 != null && Math.max(0, Math.min(Math.min(g3Var.f29316r0, g3Var.f29319u0), L2.length())) < Math.max(0, Math.min(Math.max(g3Var.f29316r0, g3Var.f29319u0), L2.length()))) {
                    return true;
                }
            } else if (z3()) {
                g1 v22 = v2(g3Var.f29314p0);
                if (v22 != null) {
                    int i19 = g3Var.f29316r0;
                    int i20 = g3Var.f29319u0;
                    if (Math.max(0, Math.min(Math.min(i19, i20), v22.length())) < Math.max(0, Math.min(Math.max(i19, i20), v22.length()))) {
                        return true;
                    }
                }
            } else if (J3()) {
                g1 m42 = m4(g3Var.f29314p0);
                if (m42 != null) {
                    int i21 = g3Var.f29316r0;
                    int i22 = g3Var.f29319u0;
                    if (Math.max(0, Math.min(Math.min(i21, i22), m42.length())) < Math.max(0, Math.min(Math.max(i21, i22), m42.length()))) {
                        return true;
                    }
                }
            } else {
                int i23 = g3Var.f29314p0;
                int i24 = g3Var.f29317s0;
                int i25 = g3Var.f29316r0;
                int i26 = g3Var.f29319u0;
                if (i23 >= 0 && i24 >= 0 && i24 >= i23 && i24 < this.f18903w4.size()) {
                    for (int i27 = i23; i27 <= i24; i27++) {
                        a B4 = B4(i27);
                        if (B4 != null) {
                            if (B4.f18405t == 0) {
                                TL_iv.PageBlock pageBlock = B4.f18389b;
                                if (!D3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int l22 = l2(i27);
                            if (i27 == i23) {
                                i7 = i25;
                            } else {
                                i7 = 0;
                            }
                            if (i27 == i24) {
                                i10 = i26;
                            } else {
                                i10 = l22;
                            }
                            if (Math.max(0, Math.min(i7, l22)) < Math.max(0, Math.min(i10, l22))) {
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
        r3 r3Var = this.f18887o3;
        if (r3Var != null) {
            r3Var.G();
        }
        A4();
    }

    public final a G2() {
        int i7;
        a B4;
        a T2 = T2();
        if (T2 != null) {
            return T2;
        }
        g3 g3Var = this.f18898u3;
        if (g3Var != null && (i7 = g3Var.f29314p0) >= 0 && (B4 = B4(i7)) != null) {
            return B4;
        }
        return null;
    }

    public final int[] G4() {
        g3 g3Var = this.f18898u3;
        if (g3Var != null) {
            int i7 = g3Var.f29314p0;
            int i10 = g3Var.f29317s0;
            if (i7 >= 0 && i10 >= 0) {
                a B4 = B4(i7);
                a B42 = B4(i10);
                if (B4 != null && B42 != null) {
                    ArrayList arrayList = this.f18894s3;
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
    public final void H1(v4.d1 d1Var) {
        r3 r3Var = this.f18887o3;
        if (r3Var != null && d1Var != null) {
            View view = d1Var.f56951a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.f18871a4 = r3Var.a(view.getHeight() + iArr[1]);
        }
    }

    public final void H2() {
        ArrayList arrayList;
        g3 g3Var = this.f18898u3;
        int i7 = g3Var.f29314p0;
        int i10 = g3Var.f29316r0;
        int i11 = g3Var.f29317s0;
        if (!a2(i7, i10, i11, g3Var.f29319u0, new String[]{""})) {
            if (i7 > i11) {
                i11 = i7;
                i7 = i11;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i7);
            while (true) {
                arrayList = this.f18894s3;
                if (max > i11) {
                    break;
                }
                ArrayList arrayList3 = this.f18903w4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f18405t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                f2 f2Var = this.Q3;
                if (f2Var != null) {
                    f2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f18896t3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        hashSet.addAll(((a) arrayList.get(i12)).f18396k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                A2();
                Y3();
                v4();
                g3Var.f(false);
                this.f37160f3.O(false);
                f2 f2Var2 = this.Q3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
                post(new m2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void H4(g1 g1Var) {
        g1Var.W1 = this.f18890q3;
        g1Var.C(new b(this, 4));
    }

    @Override
    public final void I1(v4.d1 d1Var) {
        a aVar = this.Z3;
        this.Z3 = null;
        this.f18871a4 = false;
        if (aVar != null) {
            f2 f2Var = this.Q3;
            if (f2Var != null) {
                f2Var.d();
            }
            u4(aVar);
            f2 f2Var2 = this.Q3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            r3 r3Var = this.f18887o3;
            if (r3Var != null) {
                r3Var.onContentChanged();
            }
        } else if (d1Var != null) {
            View view = d1Var.f56951a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean I2() {
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x()) {
            g3Var.f(false);
            return true;
        } else if (this.f18889p4 == null) {
            return false;
        } else {
            P2();
            return true;
        }
    }

    public final void I4(li.m5 r35) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.I4(li.m5):void");
    }

    @Override
    public final void J1(v4.d1 d1Var) {
        int b10;
        x31 G;
        a aVar = null;
        if (d1Var != null && (b10 = d1Var.b()) >= 0 && (G = this.f37160f3.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.Z3 = aVar;
        this.f18871a4 = false;
        r3 r3Var = this.f18887o3;
        if (r3Var != null) {
            r3Var.q();
        }
    }

    public final void J2() {
        g3 g3Var = this.f18898u3;
        if (g3Var != null) {
            g3Var.f(true);
        }
        P2();
        q3();
        IdentityHashMap identityHashMap = this.f18877g4;
        for (y4 y4Var : identityHashMap.values()) {
            y4Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.f18878h4;
        for (u4 u4Var : identityHashMap2.values()) {
            u4Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean J3() {
        int i7;
        a B4;
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x() && (i7 = g3Var.f29314p0) == g3Var.f29317s0 && i7 >= 0 && i7 < this.f18903w4.size() && g3Var.f29315q0 == 1 && g3Var.f29318t0 == 1 && (B4 = B4(i7)) != null && a6.p(B4.f18389b)) {
            return true;
        }
        return false;
    }

    public final a6 J4() {
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x()) {
            int i7 = g3Var.f29314p0;
            int i10 = g3Var.f29317s0;
            a B4 = B4(i7);
            if (i7 == i10 && B4 != null && D3(B4.f18389b)) {
                return x2(i7);
            }
            return null;
        }
        return null;
    }

    public final int K2(int i7) {
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            ArrayList arrayList = this.f18894s3;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (A3((a) arrayList.get(i11))) {
                i10++;
            } else if (((a) arrayList.get(i11)).f18394i) {
                i10--;
            }
        }
        return i10;
    }

    public final boolean K3(int i7, int i10) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f18894s3;
            if (i10 < arrayList.size() && i7 <= i10) {
                boolean z9 = false;
                while (i7 <= i10) {
                    a aVar = (a) arrayList.get(i7);
                    if (!aVar.f18394i && !A3(aVar)) {
                        if (!aVar.f18396k.isEmpty() || a6.p(aVar.f18389b)) {
                            z9 = true;
                        }
                    }
                    i7++;
                }
                return z9;
            }
        }
        return false;
    }

    public final Editable K4(int i7, int i10, int i11, int i12) {
        if (i7 == i11) {
            if (A3(B4(i7))) {
                g1 L2 = L2(i7);
                if (L2 != null) {
                    return L2.getText();
                }
                return null;
            } else if (J3()) {
                g1 m42 = m4(i7);
                if (m42 != null) {
                    return m42.getText();
                }
                return null;
            } else {
                a B4 = B4(i7);
                if (B4 != null && D3(B4.f18389b)) {
                    int l22 = l2(i7);
                    if (jg.g.B(i10, i12, l22, 0) < jg.g.f(i10, i12, l22, 0)) {
                        a6 x22 = x2(i7);
                        if (x22 != null) {
                            return x22.getEditText().getText();
                        }
                        return a6.A(B4.f18389b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final g1 L2(int i7) {
        if (!A3(B4(i7))) {
            return null;
        }
        View D4 = D4(i7);
        if (!(D4 instanceof r0)) {
            return null;
        }
        return ((r0) D4).getEditText();
    }

    public final boolean L3() {
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x()) {
            int i7 = g3Var.f29314p0;
            int i10 = g3Var.f29317s0;
            if (i7 >= 0 && i10 >= 0 && i10 >= i7) {
                boolean z9 = false;
                while (i7 <= i10) {
                    a B4 = B4(i7);
                    if (B4 != null) {
                        if (F3(B4.f18389b)) {
                            z9 = true;
                        }
                    }
                    i7++;
                }
                return z9;
            }
        }
        return false;
    }

    public final boolean L4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.L4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean M1(a aVar, a aVar2, int i7) {
        float f10;
        if (D3(aVar.f18389b)) {
            TL_iv.PageBlock pageBlock = aVar2.f18389b;
            ArrayList arrayList = aVar2.f18396k;
            if (D3(pageBlock)) {
                View C1 = C1(aVar2);
                if (C1 instanceof a6) {
                    g1 editText = ((a6) C1).getEditText();
                    if (editText.isFocused()) {
                        SpannableStringBuilder A = a6.A(aVar.f18389b);
                        Paint.FontMetricsInt fontMetricsInt = editText.getPaint().getFontMetricsInt();
                        if (F3(aVar.f18389b)) {
                            f10 = 0.85f;
                        } else {
                            f10 = 1.0f;
                        }
                        CharSequence n10 = i6.n(A, fontMetricsInt, false, null, 0, f10, 0);
                        int length = n10.length();
                        Editable text = editText.getText();
                        if (text != null && n10.length() != 0) {
                            editText.f18583c2 = true;
                            text.insert(0, n10);
                            editText.f18583c2 = false;
                        }
                        a6.d(aVar.f18389b, editText.getText());
                        aVar2.f18389b = aVar.f18389b;
                        aVar2.f18390c = aVar.f18390c;
                        aVar2.d = aVar.d;
                        aVar2.f18391e = aVar.f18391e;
                        aVar2.f18392f = aVar.f18392f;
                        arrayList.clear();
                        arrayList.addAll(aVar.f18396k);
                        this.f18894s3.remove(i7 - 1);
                        A2();
                        v4();
                        c5();
                        editText.setSelection(Math.min(length, editText.length()));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean M3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.M3(int, int, int, int, int):boolean");
    }

    public final void M4(View view) {
        v4.d1 T;
        int b10;
        if (view != null && this.f37161g3 != null && this.j3 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.f37160f3.H(b10) >= 0) {
            this.H3 = true;
            g3 g3Var = this.f18898u3;
            if (g3Var.x()) {
                g3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.f37161g3.t(T);
        }
    }

    public final boolean N3(int i7, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        boolean z9 = false;
        for (int i17 = i11; i17 <= i13; i17++) {
            g1 Q4 = Q4(i10, i17);
            if (Q4 != null) {
                int length = Q4.length();
                if (i17 == i11) {
                    i15 = i12;
                } else {
                    i15 = 0;
                }
                if (i17 == i13) {
                    i16 = i14;
                } else {
                    i16 = length;
                }
                if (i11 == i13) {
                    i15 = Math.min(i12, i14);
                    i16 = Math.max(i12, i14);
                }
                int max = Math.max(0, Math.min(i15, length));
                int max2 = Math.max(0, Math.min(i16, length));
                if (max >= max2) {
                    continue;
                } else if ((Q4.c(max, max2) & i7) == 0) {
                    return false;
                } else {
                    z9 = true;
                }
            }
        }
        return z9;
    }

    public final void N4(a aVar, s sVar, gf gfVar) {
        int i7;
        float f10;
        y4 y4Var = (y4) this.f18877g4.remove(sVar);
        if (y4Var != null) {
            y4Var.b();
        }
        IdentityHashMap identityHashMap = this.f18878h4;
        u4 u4Var = (u4) identityHashMap.remove(sVar);
        if (u4Var != null) {
            u4Var.a();
        }
        sVar.f18811a = 1;
        sVar.f18815f = 0.0f;
        u4 u4Var2 = new u4(this.f18883m3, gfVar, new h6.m(this, sVar, aVar, false, 10));
        identityHashMap.put(sVar, u4Var2);
        if (!u4Var2.f18920f && !u4Var2.h && !u4Var2.f18921n) {
            u4Var2.f18920f = true;
            int i10 = gfVar.F;
            String str = gfVar.I;
            int i11 = gfVar.G;
            if (i10 <= 0 || i11 <= 0) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(str, options);
                    i10 = options.outWidth;
                    i11 = options.outHeight;
                } catch (Exception unused) {
                }
            }
            j20 j20Var = null;
            r5 = null;
            ArrayList arrayList = null;
            j20Var = null;
            if (i10 > 0 && i11 > 0) {
                int i12 = gfVar.J;
                if (i12 == 90 || i12 == 270) {
                    int i13 = i11;
                    i11 = i10;
                    i10 = i13;
                }
                j20 j20Var2 = new j20();
                j20Var2.f23450a = 0L;
                j20Var2.d = (float) 0;
                j20Var2.f23452b = Math.min(3000L, gfVar.f26840t);
                while (true) {
                    long j3 = j20Var2.f23452b;
                    i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                    if (i7 <= 0 || j3 >= 1000) {
                        break;
                    }
                    j20Var2.f23452b = j3 * 2;
                }
                if (i7 <= 0) {
                    j20Var2.f23452b = 3000L;
                }
                long j10 = j20Var2.f23452b;
                j20Var2.f23455e = (float) j10;
                j20Var2.f23456f = 1;
                j20Var2.f23457g = 0;
                j20Var2.f23464o = str;
                j20Var2.f23466q = (int) ((f10 / 1000.0f) * 115200.0f);
                j20Var2.f23467r = j10;
                j20Var2.f23463n = 30;
                j20Var2.v = j10;
                j20Var2.A = gfVar.f26835o;
                String str2 = gfVar.f26831k;
                if (str2 != null) {
                    j20Var2.B = str2;
                    ArrayList arrayList2 = gfVar.f26837q;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList = gfVar.f26837q;
                    }
                    j20Var2.G = arrayList;
                } else {
                    j20Var2.B = gfVar.f26830j;
                    j20Var2.G = gfVar.f26836p;
                }
                j20Var2.I = true;
                ye yeVar = gfVar.A;
                if (yeVar != null) {
                    int i14 = yeVar.f26633k;
                    if (i14 == 90 || i14 == 270) {
                        int i15 = i11;
                        i11 = i10;
                        i10 = i15;
                    }
                    i10 = (int) (i10 * yeVar.f26629e);
                    i11 = (int) (i11 * yeVar.f26630f);
                }
                float f11 = i10;
                float f12 = i11;
                float max = Math.max(f11 / 854.0f, f12 / 854.0f);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                int i16 = (int) (f11 / max);
                int i17 = (int) (f12 / max);
                if (i16 % 16 != 0) {
                    i16 = Math.max(1, Math.round(i16 / 16.0f)) * 16;
                }
                if (i17 % 16 != 0) {
                    i17 = Math.max(1, Math.round(i17 / 16.0f)) * 16;
                }
                j20Var2.f23460k = i16;
                j20Var2.h = i16;
                j20Var2.f23461l = i17;
                j20Var2.f23458i = i17;
                j20Var2.f23462m = -1;
                j20Var2.f23469t = true;
                j20Var2.f23454c = 0L;
                j20Var = j20Var2;
            }
            u4Var2.d = j20Var;
            if (j20Var != null && j20Var.c()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f26974id = 1;
                String absolutePath = new File(w7.z(4), "rich_anim_" + iz.p() + ".mp4").getAbsolutePath();
                u4Var2.f18919e = absolutePath;
                tL_message.attachPath = absolutePath;
                ij ijVar = new ij(u4Var2.f18916a, tL_message, null, false, false);
                u4Var2.f18918c = ijVar;
                ijVar.f23262p0 = u4Var2.d;
                qs f13 = qs.f(u4Var2.f18916a);
                f13.b(u4Var2, qs.f24960a2);
                f13.b(u4Var2, qs.f24966b2);
                f13.b(u4Var2, qs.f24972c2);
                MediaController.B().h0(u4Var2.f18918c, false, false, false);
                return;
            }
            u4Var2.b();
        }
    }

    public final boolean O3() {
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x()) {
            int i7 = g3Var.f29314p0;
            int i10 = g3Var.f29317s0;
            a B4 = B4(i7);
            if (i7 == i10 && B4 != null && (B4.f18389b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void O4(a aVar, s sVar, String str, boolean z9, int i7, int i10, int i11) {
        IdentityHashMap identityHashMap = this.f18877g4;
        y4 y4Var = (y4) identityHashMap.remove(sVar);
        if (y4Var != null) {
            y4Var.b();
        }
        y4 y4Var2 = new y4(this.f18883m3, str, z9, i7, i10, i11, new f3(aVar, sVar, this));
        identityHashMap.put(sVar, y4Var2);
        y4Var2.d();
    }

    public final void P2() {
        if (this.I3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.I3 = false;
        this.J3 = false;
        this.K3 = null;
        this.L3 = null;
        k60 k60Var = this.f18891q4;
        if (k60Var != null) {
            this.f18891q4 = null;
            k60Var.u();
        }
        m5 m5Var = this.f18889p4;
        if (m5Var != null) {
            LinkedHashSet linkedHashSet = m5Var.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                m5Var.f18708w.invalidate();
                m5Var.v();
            }
            this.f18889p4 = null;
        }
        this.f18895s4 = -1;
        this.f18893r4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean P3() {
        org.telegram.messenger.p0 p0Var = qp.s1(this.f18883m3).f24935x7;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f18894s3;
            if (i7 >= arrayList.size()) {
                break;
            }
            i10 += T3((a) arrayList.get(i7)).size();
            i7++;
        }
        ArrayList c32 = c3();
        ?? obj = new Object();
        obj.d = i10;
        obj.f18607b = c32.size() + obj.f18607b;
        for (int i11 = 0; i11 < c32.size(); i11++) {
            g2.b((TL_iv.PageBlock) c32.get(i11), 1, obj);
        }
        if (obj.f18606a > ((org.telegram.messenger.j0) p0Var.V.f13555b).f23439c || obj.f18607b > ((org.telegram.messenger.j0) p0Var.W.f13555b).f23439c || obj.f18608c > ((org.telegram.messenger.j0) p0Var.X.f13555b).f23439c || obj.d > ((org.telegram.messenger.j0) p0Var.Y.f13555b).f23439c || obj.f18609e > ((org.telegram.messenger.j0) p0Var.Z.f13555b).f23439c) {
            return false;
        }
        return true;
    }

    public final Editable P4(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof a6) {
            return ((a6) C1).getEditText().getText();
        }
        return a6.A(aVar.f18389b);
    }

    public final g1 Q4(int i7, int i10) {
        View D4 = D4(i7);
        if (!(D4 instanceof m5)) {
            return null;
        }
        return ((m5) D4).m(i10);
    }

    public final int[] R3(int i7) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.U3.size(); i11++) {
            int length = a6.z(((a) this.U3.get(i11)).f18389b).length();
            if (i7 <= i10 + length) {
                return new int[]{i11, i7 - i10};
            }
            i10 += length + 1;
        }
        int size = this.U3.size() - 1;
        return new int[]{size, a6.z(((a) this.U3.get(size)).f18389b).length()};
    }

    public final g1 S2() {
        View findFocus = findFocus();
        if (findFocus instanceof g1) {
            return (g1) findFocus;
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof a6) {
                return ((a6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int S3(int i7) {
        int i10 = 1;
        int i11 = i7 + 1;
        while (true) {
            ArrayList arrayList = this.f18894s3;
            if (i11 < arrayList.size()) {
                a aVar = (a) arrayList.get(i11);
                if (A3(aVar)) {
                    i10++;
                } else if (aVar.f18394i && i10 - 1 == 0) {
                    return i11;
                }
                i11++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final a T2() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof a6) {
                a6 a6Var = (a6) childAt;
                if (a6Var.getEditText().isFocused() || (a6Var.n() && a6Var.h.isFocused())) {
                    return a6Var.getRow();
                }
            }
        }
        return null;
    }

    public final void T4() {
        boolean z9;
        int[] E4 = E4();
        if (E4 != null) {
            int i7 = E4[0];
            int i10 = E4[1];
            if (i7 >= 0) {
                ArrayList arrayList = this.f18894s3;
                if (i10 < arrayList.size() && i7 <= i10) {
                    f2 f2Var = this.Q3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    if (K3(i7, i10)) {
                        for (int i11 = i7; i11 <= i10; i11++) {
                            a aVar = (a) arrayList.get(i11);
                            boolean z10 = aVar.f18394i;
                            ArrayList arrayList2 = aVar.f18396k;
                            if (!z10 && !A3(aVar)) {
                                if (a6.p(aVar.f18389b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f18389b.text;
                                    aVar.f18389b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    a8.p0.z(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a10 = n0.a();
                        for (int i12 = i7; i12 <= i10; i12++) {
                            a aVar2 = (a) arrayList.get(i12);
                            boolean z11 = aVar2.f18394i;
                            ArrayList arrayList3 = aVar2.f18396k;
                            if (!z11 && !A3(aVar2)) {
                                if (a6.p(aVar2.f18389b)) {
                                    long a11 = n0.a();
                                    TL_iv.RichText j3 = a6.j(aVar2.f18389b);
                                    if (j3 != null && !(j3 instanceof TL_iv.textEmpty)) {
                                        this.f18896t3.put(Long.valueOf(a11), j3);
                                    }
                                    arrayList3.add(Long.valueOf(a11));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f18389b.text;
                                    aVar2.f18389b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a10));
                            }
                        }
                    }
                    A2();
                    Y3();
                    v4();
                    g3 g3Var = this.f18898u3;
                    if (g3Var != null && g3Var.x()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i7, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    this.f37160f3.O(false);
                    f2 f2Var2 = this.Q3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    if (z9) {
                        post(new l2.z0(this, aVar3, aVar4, 4));
                    } else {
                        post(new m2(this, aVar3, 9));
                    }
                }
            }
        }
    }

    public final m5 U2() {
        View findFocus = findFocus();
        if (findFocus instanceof g1) {
            return X2((g1) findFocus);
        }
        return null;
    }

    public final void U4(li.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.U4(li.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final void V1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.V1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final TLRPC.Document V2(long j3) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        TLRPC.Document document2 = null;
        if (i7 == 0) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f18894s3.size(); i11++) {
            for (s sVar : T3((a) this.f18894s3.get(i11))) {
                if (sVar != null && (document = sVar.h) != null && document.f26959id == j3) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f18892r3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.Document document3 = arrayList.get(i10);
                i10++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f26959id == j3) {
                    return document4;
                }
            }
        }
        HashMap hashMap = t4.f18909a;
        synchronized (t4.class) {
            if (i7 != 0) {
                document2 = (TLRPC.Document) t4.f18910b.get(Long.valueOf(j3));
            }
        }
        return document2;
    }

    public final boolean V4() {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.V4():boolean");
    }

    public final int W2(int i7, int i10) {
        while (i7 >= 0) {
            ArrayList arrayList = this.f18894s3;
            if (i7 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i7);
            if (!aVar.f18394i) {
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < i7; i13++) {
                    a aVar2 = (a) arrayList.get(i13);
                    if (A3(aVar2)) {
                        i12++;
                        if (i11 == -1 && !((TL_iv.pageBlockDetails) aVar2.f18389b).open) {
                            i11 = i12;
                        }
                    } else if (aVar2.f18394i) {
                        if (i11 != -1 && i12 == i11) {
                            i11 = -1;
                        }
                        i12--;
                    }
                }
                if (i11 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f18389b;
                    if (!H3(pageBlock) || o3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i7;
                    }
                }
            }
            i7 += i10;
        }
        return -1;
    }

    public final boolean W4(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.W4(android.view.View, float, float):boolean");
    }

    public final void X1(a aVar, gf gfVar) {
        TL_iv.PageBlock pageblockvideo;
        t3 t3Var;
        if (aVar != null && G3(aVar.f18389b)) {
            String str = gfVar.h;
            if (str == null) {
                str = gfVar.I;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                f2 f2Var = this.Q3;
                if (f2Var != null) {
                    f2Var.d();
                }
                s W3 = W3(gfVar, str2);
                boolean c10 = u4.c(gfVar);
                if (!gfVar.f26824b && !c10) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (E3(aVar.f18389b)) {
                    j3(aVar.f18389b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(W3);
                } else {
                    s sVar = aVar.f18393g;
                    if (sVar != null && sVar.f18811a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f18389b.caption;
                        j0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f18389b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f18393g);
                        aVar.h.add(W3);
                        aVar.f18393g = null;
                        aVar.f18389b = pageblockcollage;
                    } else {
                        aVar.f18389b = pageblockvideo;
                        aVar.f18393g = W3;
                    }
                }
                this.f37160f3.O(false);
                q4(aVar);
                if (c10) {
                    N4(aVar, W3, gfVar);
                    t3Var = this;
                } else {
                    t3Var = this;
                    t3Var.O4(aVar, W3, str2, gfVar.f26824b, gfVar.F, gfVar.G, gfVar.E);
                }
                f2 f2Var2 = t3Var.Q3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
                t3Var.f18887o3.onContentChanged();
            }
        }
    }

    public final a X3(int i7, int i10) {
        while (i7 >= 0) {
            ArrayList arrayList = this.f18903w4;
            if (i7 < arrayList.size()) {
                a aVar = (a) arrayList.get(i7);
                if (!aVar.f18394i) {
                    if (aVar.f18405t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f18389b;
                        if (H3(pageBlock) && !o3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    return aVar;
                }
                i7 += i10;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void X4(a aVar, TL_iv.PageBlock pageBlock, int i7, int i10, boolean z9, boolean z10) {
        Editable A;
        if (aVar == null) {
            aVar = a5();
        }
        a aVar2 = aVar;
        if (aVar2 != null && pageBlock != null) {
            ArrayList arrayList = this.f18894s3;
            if (arrayList.indexOf(aVar2) >= 0 && !A3(aVar2) && !aVar2.f18394i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f18389b;
                if (pageBlock != pageBlock2 && D3(pageBlock2) && D3(pageBlock)) {
                    a6 x22 = x2(arrayList.indexOf(aVar2));
                    if (x22 != null) {
                        A = x22.getEditText().getText();
                    } else {
                        A = a6.A(aVar2.f18389b);
                    }
                    a6.d(pageBlock, A);
                    TL_iv.RichText j3 = a6.j(aVar2.f18389b);
                    if (j3 != null && a6.j(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = j3;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = j3;
                        }
                    }
                }
                U4(aVar2, pageBlock, i7, i10, z9, z10);
            }
        }
    }

    public final void Y1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            f2 f2Var = this.Q3;
            if (f2Var != null) {
                f2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f18892r3;
            if (richMessage2 == null) {
                this.f18892r3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f18892r3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Z2(arrayList4, richMessage.blocks, this.f18896t3);
            if (!arrayList4.isEmpty()) {
                for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                    y4((a) arrayList4.get(i7));
                }
                ArrayList arrayList5 = this.f18894s3;
                int size = arrayList5.size();
                a T2 = T2();
                if (T2 != null && (indexOf = arrayList5.indexOf(T2)) >= 0) {
                    TL_iv.PageBlock pageBlock = T2.f18389b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && a6.z(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                Y3();
                v4();
                this.f37160f3.O(false);
                f2 f2Var2 = this.Q3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
                r3 r3Var = this.f18887o3;
                if (r3Var != null) {
                    r3Var.onContentChanged();
                }
            }
        }
    }

    public final void Y2() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof a6) {
                a6 a6Var = (a6) childAt;
                a6Var.f18426f.J();
                a6Var.h.J();
            } else if (childAt instanceof k0) {
                ((k0) childAt).getCaptionEditText().J();
            } else if (childAt instanceof r0) {
                ((r0) childAt).getEditText().J();
            }
        }
    }

    public final void Y3() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f18894s3;
            if (i7 < arrayList.size()) {
                a aVar = (a) arrayList.get(i7);
                if (!aVar.f18396k.isEmpty() && a6.p(aVar.f18389b)) {
                    long a10 = n0.a();
                    TL_iv.RichText j3 = a6.j(aVar.f18389b);
                    if (j3 != null && !(j3 instanceof TL_iv.textEmpty)) {
                        this.f18896t3.put(Long.valueOf(a10), j3);
                    }
                    aVar.f18396k.add(Long.valueOf(a10));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f18389b.text;
                    aVar.f18389b = pageblockparagraph;
                }
                i7++;
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
        X4(aVar2, pageBlock, aVar2.f18390c, aVar2.d, aVar2.f18391e, aVar2.f18392f);
    }

    public final a Z1(a aVar, int i7) {
        int i10;
        ArrayList arrayList = this.f18903w4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + i7) >= 0 && i10 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i10);
            if (aVar2.f18405t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final boolean Z3(li.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.Z3(li.a, boolean):boolean");
    }

    public final void Z4(a aVar, int i7) {
        int i10;
        boolean z9;
        boolean z10;
        t3 t3Var;
        TL_iv.PageBlock pageBlock;
        if (aVar == null) {
            aVar = a5();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i7 == 0) {
            X4(aVar2, aVar2.f18389b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f18390c);
        if (i7 == 2) {
            i10 = Math.max(1, aVar2.d);
        } else {
            i10 = 0;
        }
        if (i7 == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        TL_iv.PageBlock pageBlock2 = aVar2.f18389b;
        if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
            pageBlock2 = new TL_iv.pageBlockParagraph();
        }
        if (z9 && aVar2.f18392f) {
            z10 = true;
            pageBlock = pageBlock2;
            t3Var = this;
        } else {
            z10 = false;
            t3Var = this;
            pageBlock = pageBlock2;
        }
        t3Var.X4(aVar2, pageBlock, max, i10, z9, z10);
    }

    public final boolean a2(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.a2(int, int, int, int, java.lang.String[]):boolean");
    }

    public final void a4() {
        int length;
        int B;
        int f10;
        int length2;
        int B2;
        int f11;
        int length3;
        int B3;
        int f12;
        int length4;
        int B4;
        int f13;
        g1 Q4;
        int length5;
        int B5;
        int f14;
        boolean O3 = O3();
        g3 g3Var = this.f18898u3;
        if (O3) {
            int i7 = g3Var.f29314p0;
            int i10 = g3Var.f29315q0;
            if (i10 == g3Var.f29318t0 && (Q4 = Q4(i7, i10)) != null && (B5 = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length5 = Q4.length()), 0)) < (f14 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length5, 0))) {
                f2 f2Var = this.Q3;
                if (f2Var != null) {
                    f2Var.d();
                }
                if (c6.h(Q4.getText(), B5, f14)) {
                    c6.n(Q4.getText(), B5, f14);
                    Q4.f();
                    j4(i7, i10);
                    f2 f2Var2 = this.Q3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    r4();
                }
                Q4.O1 = B5;
                Q4.P1 = f14;
                Q4.B();
            }
        } else if (B3()) {
            int i11 = g3Var.f29314p0;
            g1 L2 = L2(i11);
            if (L2 != null && (B4 = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length4 = L2.length()), 0)) < (f13 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length4, 0))) {
                f2 f2Var3 = this.Q3;
                if (f2Var3 != null) {
                    f2Var3.d();
                }
                if (c6.h(L2.getText(), B4, f13)) {
                    c6.n(L2.getText(), B4, f13);
                    L2.f();
                    h4(i11);
                    f2 f2Var4 = this.Q3;
                    if (f2Var4 != null) {
                        f2Var4.h();
                    }
                    r4();
                }
                L2.O1 = B4;
                L2.P1 = f13;
                L2.B();
            }
        } else if (z3()) {
            int i12 = g3Var.f29314p0;
            g1 v22 = v2(i12);
            if (v22 != null && (B3 = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length3 = v22.length()), 0)) < (f12 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length3, 0))) {
                f2 f2Var5 = this.Q3;
                if (f2Var5 != null) {
                    f2Var5.d();
                }
                if (c6.h(v22.getText(), B3, f12)) {
                    c6.n(v22.getText(), B3, f12);
                    v22.f();
                    g4(i12);
                    f2 f2Var6 = this.Q3;
                    if (f2Var6 != null) {
                        f2Var6.h();
                    }
                    r4();
                }
                v22.O1 = B3;
                v22.P1 = f12;
                v22.B();
            }
        } else if (J3()) {
            int i13 = g3Var.f29314p0;
            g1 m42 = m4(i13);
            if (m42 != null && (B2 = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length2 = m42.length()), 0)) < (f11 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length2, 0))) {
                f2 f2Var7 = this.Q3;
                if (f2Var7 != null) {
                    f2Var7.d();
                }
                if (c6.h(m42.getText(), B2, f11)) {
                    c6.n(m42.getText(), B2, f11);
                    m42.f();
                    i4(i13);
                    f2 f2Var8 = this.Q3;
                    if (f2Var8 != null) {
                        f2Var8.h();
                    }
                    r4();
                }
                m42.O1 = B2;
                m42.P1 = f11;
                m42.B();
            }
        } else {
            a6 J4 = J4();
            if (J4 == null || (B = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length = J4.getEditText().length()), 0)) >= (f10 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length, 0))) {
                return;
            }
            f2 f2Var9 = this.Q3;
            if (f2Var9 != null) {
                f2Var9.d();
            }
            if (c6.h(J4.getEditText().getText(), B, f10)) {
                c6.n(J4.getEditText().getText(), B, f10);
                J4.getEditText().f();
                J4.x();
                f2 f2Var10 = this.Q3;
                if (f2Var10 != null) {
                    f2Var10.h();
                }
                r4();
            }
            g1 editText = J4.getEditText();
            editText.O1 = B;
            editText.P1 = f10;
            J4.getEditText().B();
        }
    }

    public final a a5() {
        g3 g3Var;
        int i7;
        a T2 = T2();
        if (T2 == null && (g3Var = this.f18898u3) != null && g3Var.x() && (i7 = g3Var.f29314p0) == g3Var.f29317s0) {
            return B4(i7);
        }
        return T2;
    }

    public final void b2() {
        a6 a6Var;
        a aVar;
        x5 x5Var;
        this.f37160f3.T();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof a6) && (aVar = (a6Var = (a6) childAt).f18432y) != null && (x5Var = a6Var.D) != null) {
                a6Var.f(aVar, x5Var, a6Var.E);
            }
        }
    }

    public final ArrayList b3(int i7, int i10, int i11, boolean z9) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z10;
        t3 t3Var;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        int i14 = i7;
        while (i14 < i10) {
            ArrayList arrayList2 = this.f18894s3;
            a aVar = (a) arrayList2.get(i14);
            boolean z11 = aVar.f18394i;
            ArrayList arrayList3 = aVar.f18396k;
            if (z11) {
                i14++;
            } else if (arrayList3.size() > i11) {
                Long l10 = (Long) arrayList3.get(i11);
                long longValue = l10.longValue();
                int i15 = i14 + 1;
                while (i15 < i10) {
                    a aVar2 = (a) arrayList2.get(i15);
                    if (aVar2.f18396k.size() <= i11 || ((Long) aVar2.f18396k.get(i11)).longValue() != longValue) {
                        break;
                    }
                    i15++;
                }
                ArrayList<TL_iv.PageBlock> b32 = b3(i14, i15, i11 + 1, true);
                if (b32.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f18896t3.get(l10);
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
                i14 = i15;
            } else if (A3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f18389b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int S3 = S3(i14);
                pageblockdetails.blocks = b3(i14 + 1, Math.min(S3, i10), i11, true);
                arrayList.add(pageblockdetails);
                i14 = S3 + 1;
            } else {
                int i16 = aVar.f18390c;
                if (i16 <= 0) {
                    M2(arrayList, aVar);
                    i14++;
                    i12 = i10;
                    i13 = i11;
                } else {
                    int[] iArr = {i14};
                    if (aVar.d > 0) {
                        z10 = true;
                        i12 = i10;
                        i13 = i11;
                        t3Var = this;
                    } else {
                        z10 = false;
                        t3Var = this;
                        i12 = i10;
                        i13 = i11;
                    }
                    TL_iv.PageBlock n22 = t3Var.n2(i14, i16, i12, i13, z10, iArr);
                    if (n22 != null) {
                        arrayList.add(n22);
                    }
                    int i17 = iArr[0];
                    if (i17 <= 0) {
                        i14 = i12;
                    } else {
                        i14 = i17;
                    }
                }
                i10 = i12;
                i11 = i13;
            }
        }
        if (!z9) {
            while (!arrayList.isEmpty() && C3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && C3((TL_iv.PageBlock) jg.g.i(1, arrayList))) {
                a8.p0.z(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void b4(int i7) {
        int i10;
        f2 f2Var;
        int i11;
        boolean z9;
        int i12;
        int i13;
        SpannableStringBuilder spannableStringBuilder;
        int i14;
        int length;
        int B;
        int f10;
        boolean z10;
        int i15;
        int length2;
        int B2;
        int f11;
        boolean z11;
        int i16;
        int length3;
        int B3;
        int f12;
        boolean z12;
        int i17;
        f2 f2Var2;
        int i18;
        int i19;
        int i20;
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x()) {
            boolean O3 = O3();
            r3 r3Var = this.f18887o3;
            int i21 = 0;
            if (O3) {
                int i22 = g3Var.f29314p0;
                int i23 = g3Var.f29315q0;
                int i24 = g3Var.f29318t0;
                int i25 = g3Var.f29316r0;
                int i26 = g3Var.f29319u0;
                boolean N3 = N3(i7, i22, i23, i25, i24, i26);
                if (!N3) {
                    i17 = z2(i7);
                } else {
                    i17 = 0;
                }
                f2 f2Var3 = this.Q3;
                if (f2Var3 != null) {
                    f2Var3.d();
                }
                this.P3 = true;
                int i27 = i23;
                boolean z13 = false;
                while (i27 <= i24) {
                    g1 Q4 = Q4(i22, i27);
                    if (Q4 == null) {
                        i20 = i23;
                    } else {
                        int length4 = Q4.length();
                        if (i27 == i23) {
                            i18 = i25;
                        } else {
                            i18 = 0;
                        }
                        if (i27 == i24) {
                            i19 = i26;
                        } else {
                            i19 = length4;
                        }
                        if (i23 == i24) {
                            i18 = Math.min(i25, i26);
                            i19 = Math.max(i25, i26);
                        }
                        int i28 = i18;
                        i20 = i23;
                        int max = Math.max(0, Math.min(i28, length4));
                        int max2 = Math.max(0, Math.min(i19, length4));
                        if (max < max2) {
                            if (!N3) {
                                if (i17 != 0) {
                                    Q4.b(i17, max, max2);
                                }
                                Q4.a(i7, max, max2);
                            } else {
                                Q4.b(i7, max, max2);
                            }
                            Q4.f();
                            Q4.requestLayout();
                            j4(i22, i27);
                            z13 = true;
                        }
                    }
                    i27++;
                    i23 = i20;
                }
                this.P3 = false;
                if (z13 && (f2Var2 = this.Q3) != null) {
                    f2Var2.h();
                }
                r3Var.h();
                if (z13) {
                    r4();
                }
            } else if (B3()) {
                int i29 = g3Var.f29314p0;
                g1 L2 = L2(i29);
                if (L2 != null && (B3 = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length3 = L2.length()), 0)) < (f12 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length3, 0))) {
                    if ((L2.c(B3, f12) & i7) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    f2 f2Var4 = this.Q3;
                    if (f2Var4 != null) {
                        f2Var4.d();
                    }
                    this.P3 = true;
                    if (z12) {
                        int z22 = z2(i7);
                        if (z22 != 0) {
                            L2.b(z22, B3, f12);
                        }
                        L2.a(i7, B3, f12);
                    } else {
                        L2.b(i7, B3, f12);
                    }
                    this.P3 = false;
                    h4(i29);
                    L2.f();
                    L2.requestLayout();
                    f2 f2Var5 = this.Q3;
                    if (f2Var5 != null) {
                        f2Var5.h();
                    }
                    r3Var.h();
                    r4();
                }
            } else if (z3()) {
                int i30 = g3Var.f29314p0;
                g1 v22 = v2(i30);
                if (v22 != null && (B2 = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length2 = v22.length()), 0)) < (f11 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length2, 0))) {
                    if ((v22.c(B2, f11) & i7) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i16 = z2(i7);
                    } else {
                        i16 = 0;
                    }
                    f2 f2Var6 = this.Q3;
                    if (f2Var6 != null) {
                        f2Var6.d();
                    }
                    this.P3 = true;
                    if (z11) {
                        if (i16 != 0) {
                            v22.b(i16, B2, f11);
                        }
                        v22.a(i7, B2, f11);
                    } else {
                        v22.b(i7, B2, f11);
                    }
                    v22.f();
                    v22.requestLayout();
                    g4(i30);
                    this.P3 = false;
                    f2 f2Var7 = this.Q3;
                    if (f2Var7 != null) {
                        f2Var7.h();
                    }
                    r3Var.h();
                    r4();
                }
            } else if (J3()) {
                int i31 = g3Var.f29314p0;
                g1 m42 = m4(i31);
                if (m42 != null && (B = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length = m42.length()), 0)) < (f10 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length, 0))) {
                    if ((m42.c(B, f10) & i7) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i15 = z2(i7);
                    } else {
                        i15 = 0;
                    }
                    f2 f2Var8 = this.Q3;
                    if (f2Var8 != null) {
                        f2Var8.d();
                    }
                    this.P3 = true;
                    if (z10) {
                        if (i15 != 0) {
                            m42.b(i15, B, f10);
                        }
                        m42.a(i7, B, f10);
                    } else {
                        m42.b(i7, B, f10);
                    }
                    m42.f();
                    m42.requestLayout();
                    i4(i31);
                    this.P3 = false;
                    f2 f2Var9 = this.Q3;
                    if (f2Var9 != null) {
                        f2Var9.h();
                    }
                    r3Var.h();
                    r4();
                }
            } else {
                int i32 = g3Var.f29314p0;
                int i33 = g3Var.f29317s0;
                int i34 = g3Var.f29316r0;
                int i35 = g3Var.f29319u0;
                if (i32 >= 0 && i33 >= 0 && i33 >= i32 && i33 < this.f18903w4.size()) {
                    int i36 = i7;
                    boolean M3 = M3(i36, i32, i34, i33, i35);
                    boolean z14 = !M3;
                    if (!M3) {
                        i10 = z2(i36);
                    } else {
                        i10 = 0;
                    }
                    f2 f2Var10 = this.Q3;
                    if (f2Var10 != null) {
                        f2Var10.d();
                    }
                    this.P3 = true;
                    int i37 = i32;
                    boolean z15 = false;
                    while (i37 <= i33) {
                        a B4 = B4(i37);
                        if (B4 != null) {
                            TL_iv.PageBlock pageBlock = B4.f18389b;
                            if (D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int l22 = l2(i37);
                                if (i37 == i32) {
                                    i12 = i34;
                                } else {
                                    i12 = i21;
                                }
                                z9 = z15;
                                if (i37 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = l22;
                                }
                                int max3 = Math.max(i21, Math.min(i12, l22));
                                int max4 = Math.max(i21, Math.min(i13, l22));
                                if (max3 >= max4) {
                                    i11 = i10;
                                    z15 = z9;
                                    i37++;
                                    i36 = i7;
                                    i10 = i11;
                                    i21 = 0;
                                } else {
                                    a6 x22 = x2(i37);
                                    if (x22 != null) {
                                        org.telegram.ui.ActionBar.j4 styleDelegate = x22.getStyleDelegate();
                                        if (!M3) {
                                            if (i10 != 0) {
                                                styleDelegate.b(i10, max3, max4);
                                            }
                                            styleDelegate.a(i36, max3, max4);
                                        } else {
                                            styleDelegate.b(i36, max3, max4);
                                        }
                                        x22.getEditText().f();
                                        x22.getEditText().requestLayout();
                                        x22.x();
                                        i11 = i10;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a6.A(B4.f18389b));
                                        if (!M3 && i10 != 0) {
                                            i11 = i10;
                                            i14 = max3;
                                            c6.o(spannableStringBuilder2, i14, max4, i11, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i11 = i10;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i14 = max3;
                                        }
                                        c6.o(spannableStringBuilder, i14, max4, i36, z14, null);
                                        a6.d(B4.f18389b, spannableStringBuilder);
                                    }
                                    z15 = true;
                                    i37++;
                                    i36 = i7;
                                    i10 = i11;
                                    i21 = 0;
                                }
                            }
                        }
                        i11 = i10;
                        z9 = z15;
                        z15 = z9;
                        i37++;
                        i36 = i7;
                        i10 = i11;
                        i21 = 0;
                    }
                    boolean z16 = z15;
                    this.P3 = i21;
                    if (z16 && (f2Var = this.Q3) != null) {
                        f2Var.h();
                    }
                    r3Var.h();
                    if (z16) {
                        r4();
                    }
                }
            }
        }
    }

    public final void b5(float f10, float f11) {
        TL_iv.pageTableCell n10;
        m5 m5Var = this.f18889p4;
        if (this.I3 && m5Var != null && this.E3 == m5Var && (n10 = m5Var.n((int) ((f10 - m5Var.getLeft()) - getLeft()), (int) ((f11 - m5Var.getTop()) - getTop()))) != null && n10 != this.L3) {
            this.L3 = n10;
            m5Var.y(this.K3, n10);
        }
    }

    public final boolean c2(int i7, int i10) {
        g3 g3Var;
        ArrayList arrayList = this.U3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i7, i10));
            int max2 = Math.max(0, Math.max(i7, i10));
            int[] R3 = R3(max);
            int[] R32 = R3(max2);
            a aVar = (a) this.U3.get(R3[0]);
            if (R3[0] != R32[0] && max != max2) {
                View C1 = C1(aVar);
                View C12 = C1(this.U3.get(R32[0]));
                if ((C1 instanceof a6) && (C12 instanceof a6)) {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f18894s3;
                        int size = arrayList2.size();
                        g3Var = this.f18898u3;
                        if (i11 >= size) {
                            break;
                        }
                        g3Var.X(i11, a6.z(((a) arrayList2.get(i11)).f18389b));
                        i11++;
                    }
                    a6 a6Var = (a6) C1;
                    int length = a6Var.getEditText().length();
                    if (R3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!g3Var.j0(a6Var, 0, R3[1], length)) {
                        a6Var.B();
                        return true;
                    }
                    g3Var.b0(0, R32[1], (a6) C12);
                    return true;
                }
            } else {
                View C13 = C1(aVar);
                if (C13 instanceof a6) {
                    a6 a6Var2 = (a6) C13;
                    a6Var2.B();
                    g1 editText = a6Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(R3[1], length2), Math.min(R32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList c3() {
        return b3(0, this.f18894s3.size(), 0, false);
    }

    public final void c4(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.c4(android.view.View):void");
    }

    public final void c5() {
        a6 a6Var;
        a aVar;
        x5 x5Var;
        v4.l0 itemAnimator = getItemAnimator();
        setItemAnimator(null);
        this.f37160f3.O(true);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof a6) && (aVar = (a6Var = (a6) childAt).f18432y) != null && (x5Var = a6Var.D) != null) {
                a6Var.f(aVar, x5Var, a6Var.E);
            }
        }
        post(new w2(this, itemAnimator, 2));
    }

    public final void d2() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        int i15;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i16 = 0;
        int i17 = 0;
        while (true) {
            ArrayList arrayList6 = this.f18894s3;
            if (i17 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i17);
                ArrayList arrayList7 = aVar.f18395j;
                ArrayList arrayList8 = aVar.f18396k;
                arrayList7.clear();
                int i18 = 1;
                if (aVar.f18394i) {
                    if (!arrayList.isEmpty()) {
                        a8.p0.z(1, arrayList);
                    }
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                    i15 = i16;
                } else {
                    for (int i19 = i16; i19 < arrayList8.size(); i19++) {
                        ((Long) arrayList8.get(i19)).getClass();
                        arrayList7.add(new Object());
                    }
                    for (int i20 = i16; i20 < arrayList.size(); i20++) {
                        arrayList7.add((n0) arrayList.get(i20));
                    }
                    int max = Math.max(i16, aVar.f18390c);
                    if (max == 0) {
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    } else {
                        if (aVar.d > 0) {
                            i7 = 1;
                        } else {
                            i7 = i16;
                        }
                        while (arrayList2.size() > max) {
                            arrayList2.remove(arrayList2.size() - 1);
                            arrayList3.remove(arrayList3.size() - 1);
                            arrayList4.remove(arrayList4.size() - 1);
                            arrayList5.remove(arrayList5.size() - 1);
                        }
                        int i21 = 1;
                        while (i21 <= max) {
                            int i22 = i21 - 1;
                            if (i21 == max) {
                                i11 = i16;
                                i10 = i18;
                            } else {
                                i10 = i16;
                                i11 = i10;
                            }
                            if (i22 < arrayList2.size()) {
                                i12 = i18;
                            } else {
                                i12 = i11;
                            }
                            if (i12 != 0 && i10 != 0) {
                                i13 = i18;
                                if (((Boolean) arrayList3.get(i22)).booleanValue() != i7) {
                                    i12 = i11;
                                }
                            } else {
                                i13 = i18;
                            }
                            if (i12 == 0) {
                                while (arrayList2.size() > i22) {
                                    arrayList2.remove(arrayList2.size() - 1);
                                    arrayList3.remove(arrayList3.size() - 1);
                                    arrayList4.remove(arrayList4.size() - 1);
                                    arrayList5.remove(arrayList5.size() - 1);
                                }
                                arrayList2.add(Long.valueOf(n0.a()));
                                if (i10 != 0) {
                                    z9 = i7;
                                } else {
                                    z9 = i11;
                                }
                                arrayList3.add(Boolean.valueOf(z9));
                                arrayList4.add(Integer.valueOf(i11));
                                arrayList5.add(0L);
                            }
                            ((Long) arrayList2.get(i22)).getClass();
                            if (i10 != 0) {
                                if (((Long) arrayList5.get(i22)).longValue() != 0 && H3(aVar.f18389b)) {
                                    i14 = i11;
                                } else {
                                    i14 = i13;
                                }
                                if (i14 != 0) {
                                    arrayList4.set(i22, Integer.valueOf(((Integer) arrayList4.get(i22)).intValue() + 1));
                                    arrayList5.set(i22, Long.valueOf(aVar.f18388a));
                                } else {
                                    ((Integer) arrayList4.get(i22)).getClass();
                                    ((Long) arrayList5.get(i22)).getClass();
                                }
                                arrayList7.add(new Object());
                            } else {
                                ((Boolean) arrayList3.get(i22)).getClass();
                                arrayList7.add(new Object());
                            }
                            i21++;
                            i16 = i11;
                            i18 = i13;
                        }
                    }
                    i15 = i16;
                    if (A3(aVar)) {
                        boolean z10 = ((TL_iv.pageBlockDetails) aVar.f18389b).open;
                        n0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (a6.p(aVar.f18389b)) {
                        n0.a();
                        arrayList7.add(new Object());
                    }
                }
                i17++;
                i16 = i15;
            } else {
                return;
            }
        }
    }

    public final boolean d3() {
        a aVar;
        ArrayList arrayList = this.f18894s3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) jg.g.i(1, arrayList);
        }
        if (aVar != null && !H3(aVar.f18389b) && !aVar.f18394i && !A3(aVar) && !N2(aVar.f18389b)) {
            if (!(C1(aVar) instanceof a6)) {
                return false;
            }
            h3(aVar);
            return true;
        }
        f2 f2Var = this.Q3;
        if (f2Var != null) {
            f2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.f37160f3.O(false);
        f2 f2Var2 = this.Q3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        post(new m2(this, aVar2, 21));
        return true;
    }

    public final void d4() {
        int length;
        int B;
        int f10;
        int length2;
        int B2;
        int f11;
        int length3;
        int B3;
        int f12;
        int length4;
        int B4;
        int f13;
        g1 Q4;
        int length5;
        int B5;
        int f14;
        boolean O3 = O3();
        r3 r3Var = this.f18887o3;
        g3 g3Var = this.f18898u3;
        if (O3) {
            int i7 = g3Var.f29314p0;
            int i10 = g3Var.f29315q0;
            if (i10 == g3Var.f29318t0 && (Q4 = Q4(i7, i10)) != null && (B5 = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length5 = Q4.length()), 0)) < (f14 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length5, 0))) {
                if (c6.h(Q4.getText(), B5, f14)) {
                    f2 f2Var = this.Q3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    c6.n(Q4.getText(), B5, f14);
                    Q4.f();
                    j4(i7, i10);
                    f2 f2Var2 = this.Q3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    r3Var.h();
                    r4();
                    return;
                }
                f2 f2Var3 = this.Q3;
                if (f2Var3 != null) {
                    f2Var3.d();
                }
                if (c6.g(Q4.getText(), B5, f14)) {
                    c6.m(Q4.getText(), B5, f14);
                    Q4.f();
                    j4(i7, i10);
                    f2 f2Var4 = this.Q3;
                    if (f2Var4 != null) {
                        f2Var4.h();
                    }
                    r4();
                }
                Q4.O1 = B5;
                Q4.P1 = f14;
                r3(false);
                H4(Q4);
            }
        } else if (B3()) {
            int i11 = g3Var.f29314p0;
            g1 L2 = L2(i11);
            if (L2 != null && (B4 = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length4 = L2.length()), 0)) < (f13 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length4, 0))) {
                if (c6.h(L2.getText(), B4, f13)) {
                    f2 f2Var5 = this.Q3;
                    if (f2Var5 != null) {
                        f2Var5.d();
                    }
                    c6.n(L2.getText(), B4, f13);
                    L2.f();
                    h4(i11);
                    f2 f2Var6 = this.Q3;
                    if (f2Var6 != null) {
                        f2Var6.h();
                    }
                    r3Var.h();
                    r4();
                    return;
                }
                f2 f2Var7 = this.Q3;
                if (f2Var7 != null) {
                    f2Var7.d();
                }
                if (c6.g(L2.getText(), B4, f13)) {
                    c6.m(L2.getText(), B4, f13);
                    L2.f();
                    h4(i11);
                    f2 f2Var8 = this.Q3;
                    if (f2Var8 != null) {
                        f2Var8.h();
                    }
                    r4();
                }
                L2.O1 = B4;
                L2.P1 = f13;
                r3(false);
                H4(L2);
            }
        } else if (z3()) {
            int i12 = g3Var.f29314p0;
            g1 v22 = v2(i12);
            if (v22 != null && (B3 = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length3 = v22.length()), 0)) < (f12 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length3, 0))) {
                if (c6.h(v22.getText(), B3, f12)) {
                    f2 f2Var9 = this.Q3;
                    if (f2Var9 != null) {
                        f2Var9.d();
                    }
                    c6.n(v22.getText(), B3, f12);
                    v22.f();
                    g4(i12);
                    f2 f2Var10 = this.Q3;
                    if (f2Var10 != null) {
                        f2Var10.h();
                    }
                    r3Var.h();
                    r4();
                    return;
                }
                f2 f2Var11 = this.Q3;
                if (f2Var11 != null) {
                    f2Var11.d();
                }
                if (c6.g(v22.getText(), B3, f12)) {
                    c6.m(v22.getText(), B3, f12);
                    v22.f();
                    g4(i12);
                    f2 f2Var12 = this.Q3;
                    if (f2Var12 != null) {
                        f2Var12.h();
                    }
                    r4();
                }
                v22.O1 = B3;
                v22.P1 = f12;
                r3(false);
                H4(v22);
            }
        } else if (J3()) {
            int i13 = g3Var.f29314p0;
            g1 m42 = m4(i13);
            if (m42 != null && (B2 = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length2 = m42.length()), 0)) < (f11 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length2, 0))) {
                if (c6.h(m42.getText(), B2, f11)) {
                    f2 f2Var13 = this.Q3;
                    if (f2Var13 != null) {
                        f2Var13.d();
                    }
                    c6.n(m42.getText(), B2, f11);
                    m42.f();
                    i4(i13);
                    f2 f2Var14 = this.Q3;
                    if (f2Var14 != null) {
                        f2Var14.h();
                    }
                    r3Var.h();
                    r4();
                    return;
                }
                f2 f2Var15 = this.Q3;
                if (f2Var15 != null) {
                    f2Var15.d();
                }
                if (c6.g(m42.getText(), B2, f11)) {
                    c6.m(m42.getText(), B2, f11);
                    m42.f();
                    i4(i13);
                    f2 f2Var16 = this.Q3;
                    if (f2Var16 != null) {
                        f2Var16.h();
                    }
                    r4();
                }
                m42.O1 = B2;
                m42.P1 = f11;
                r3(false);
                H4(m42);
            }
        } else {
            a6 J4 = J4();
            if (J4 == null || (B = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length = J4.getEditText().length()), 0)) >= (f10 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length, 0))) {
                return;
            }
            if (c6.h(J4.getEditText().getText(), B, f10)) {
                f2 f2Var17 = this.Q3;
                if (f2Var17 != null) {
                    f2Var17.d();
                }
                c6.n(J4.getEditText().getText(), B, f10);
                J4.getEditText().f();
                J4.x();
                f2 f2Var18 = this.Q3;
                if (f2Var18 != null) {
                    f2Var18.h();
                }
                r3Var.h();
                r4();
                return;
            }
            f2 f2Var19 = this.Q3;
            if (f2Var19 != null) {
                f2Var19.d();
            }
            if (c6.g(J4.getEditText().getText(), B, f10)) {
                c6.m(J4.getEditText().getText(), B, f10);
                J4.getEditText().f();
                J4.x();
                f2 f2Var20 = this.Q3;
                if (f2Var20 != null) {
                    f2Var20.h();
                }
                r4();
            }
            g1 editText = J4.getEditText();
            editText.O1 = B;
            editText.P1 = f10;
            r3(false);
            H4(J4.getEditText());
        }
    }

    public final void d5(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18389b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    f2 f2Var = this.Q3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    a6 x22 = x2(this.f18894s3.indexOf(aVar));
                    if (x22 != null && (aVar2 = x22.f18432y) != null) {
                        x22.J(aVar2.f18389b, true);
                        x22.H = null;
                        x22.C();
                    }
                    f2 f2Var2 = this.Q3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i7;
        Long l10;
        a aVar;
        View view;
        Long l11;
        int i10;
        int i11;
        ArrayList arrayList2;
        a aVar2;
        a aVar3;
        float f10;
        a aVar4;
        boolean z9;
        a aVar5;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                arrayList = this.f18903w4;
                if (i12 >= childCount) {
                    break;
                }
                int R = RecyclerView.R(getChildAt(i12));
                if (R >= 0 && R < arrayList.size()) {
                    aVar5 = (a) arrayList.get(R);
                } else {
                    aVar5 = null;
                }
                if (aVar5 != null) {
                    ArrayList arrayList3 = aVar5.f18396k;
                    if (arrayList3.size() > i13) {
                        i13 = arrayList3.size();
                    }
                }
                i12++;
            }
            if (i13 != 0) {
                if (this.f18905x4 == null) {
                    zj0 zj0Var = new zj0(this);
                    this.f18905x4 = zj0Var;
                    zj0Var.a(null, null, null, this.f18885n3, 1);
                    c8.l1.a(this.f18905x4, this.f18885n3);
                }
                int i14 = 0;
                while (i14 < i13) {
                    float f11 = 0.0f;
                    long j3 = 0;
                    int i15 = 0;
                    boolean z10 = false;
                    a aVar6 = null;
                    a aVar7 = null;
                    float f12 = 1.0f;
                    float f13 = 0.0f;
                    while (i15 <= childCount) {
                        if (i15 < childCount) {
                            View childAt = getChildAt(i15);
                            int R2 = RecyclerView.R(childAt);
                            if (R2 >= 0 && R2 < arrayList.size()) {
                                aVar = (a) arrayList.get(R2);
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                ArrayList arrayList4 = aVar.f18396k;
                                if (i14 < arrayList4.size()) {
                                    l10 = (Long) arrayList4.get(i14);
                                    i7 = childCount;
                                    view = childAt;
                                }
                            }
                            i7 = childCount;
                            view = childAt;
                            l10 = null;
                        } else {
                            i7 = childCount;
                            l10 = null;
                            aVar = null;
                            view = null;
                        }
                        if (!z10 || (l10 != null && l10.longValue() == j3)) {
                            l11 = l10;
                            i10 = i14;
                            i11 = i13;
                            arrayList2 = arrayList;
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                            f10 = f12;
                        } else {
                            int n42 = n4(i14, aVar6, true);
                            l11 = l10;
                            int n43 = n4(i14, aVar7, false);
                            if (f13 - f11 <= org.telegram.messenger.g0.L(4.0f)) {
                                i10 = i14;
                                i11 = i13;
                                arrayList2 = arrayList;
                            } else {
                                int L = org.telegram.messenger.g0.L(16.0f) * i14;
                                i10 = i14;
                                int L2 = org.telegram.messenger.g0.L(16.0f) + L;
                                i11 = i13;
                                arrayList2 = arrayList;
                                int z11 = org.telegram.messenger.k5.z(16.0f, getWidth(), L);
                                if (z11 - L2 > org.telegram.messenger.g0.L(8.0f)) {
                                    float floor = (float) Math.floor(iz.Y0 / 3.0f);
                                    RectF rectF = org.telegram.messenger.g0.P;
                                    rectF.set(L2, n42 + f11, z11, f13 - n43);
                                    aVar2 = aVar6;
                                    aVar3 = aVar7;
                                    this.f18905x4.c(floor, floor, floor, f12, canvas, rectF);
                                    f10 = f12;
                                    this.f18905x4.f(canvas, rectF, f10);
                                    z10 = false;
                                }
                            }
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                            f10 = f12;
                            z10 = false;
                        }
                        if (view != null && l11 != null) {
                            if (!z10) {
                                j3 = l11.longValue();
                                f11 = Float.MAX_VALUE;
                                f13 = -3.4028235E38f;
                                aVar4 = aVar;
                                z9 = true;
                                f10 = 1.0f;
                            } else {
                                aVar4 = aVar2;
                                z9 = z10;
                            }
                            if (aVar != null && aVar == this.Z3) {
                                z10 = z9;
                                f12 = f10;
                            } else {
                                float y10 = view.getY();
                                float height = view.getHeight() + y10;
                                if (y10 < f11) {
                                    f11 = y10;
                                }
                                if (height > f13) {
                                    f13 = height;
                                }
                                f12 = Math.min(f10, view.getAlpha());
                                z10 = z9;
                            }
                            aVar7 = aVar;
                        } else {
                            aVar7 = aVar3;
                            f12 = f10;
                            aVar4 = aVar2;
                        }
                        i15++;
                        aVar6 = aVar4;
                        childCount = i7;
                        i14 = i10;
                        i13 = i11;
                        arrayList = arrayList2;
                    }
                    i14++;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e2(ij ijVar) {
        TLRPC.Document F0;
        String str;
        if (ijVar != null && (F0 = ijVar.F0()) != null) {
            f2 f2Var = this.Q3;
            if (f2Var != null) {
                f2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z9 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            s sVar = new s();
            aVar.f18393g = sVar;
            sVar.f18813c = true;
            long j3 = F0.f26959id;
            if (j3 == 0 || F0.dc_id == 0 || F0.access_hash == 0) {
                z9 = true;
            }
            if (z9) {
                TLRPC.Message message = ijVar.f23244k;
                if (message != null) {
                    str = message.attachPath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                s sVar2 = aVar.f18393g;
                sVar2.f18817i = F0;
                sVar2.f18814e = str;
                sVar2.f18811a = 1;
                sVar2.f18815f = 0.0f;
            } else {
                sVar.h = F0;
                sVar.f18817i = F0;
                sVar.f18811a = 2;
                pageblockaudio.audio_id = j3;
            }
            x3(aVar);
            if (z9) {
                s sVar3 = aVar.f18393g;
                String str2 = sVar3.f18814e;
                IdentityHashMap identityHashMap = this.f18877g4;
                y4 y4Var = (y4) identityHashMap.remove(sVar3);
                if (y4Var != null) {
                    y4Var.b();
                }
                y4 y4Var2 = new y4(this.f18883m3, str2, F0, new e3(aVar, sVar3, this));
                identityHashMap.put(sVar3, y4Var2);
                y4Var2.d();
            }
            f2 f2Var2 = this.Q3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            this.f18887o3.onContentChanged();
        }
    }

    public final void e3(a aVar, boolean z9) {
        int i7;
        View C1 = C1(aVar);
        if (C1 instanceof e5) {
            g1 g1Var = ((e5) C1).f18536r;
            g1Var.N();
            if (z9) {
                i7 = g1Var.length();
            } else {
                i7 = 0;
            }
            g1Var.setSelection(i7);
            return;
        }
        f3(aVar, z9);
    }

    public final void e4() {
        g1 editText;
        Runnable i2Var;
        int length;
        final int B;
        final int f10;
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x()) {
            if (O3()) {
                int i7 = g3Var.f29314p0;
                int i10 = g3Var.f29315q0;
                if (i10 == g3Var.f29318t0) {
                    editText = Q4(i7, i10);
                    i2Var = new n2(this, i7, i10, 1);
                } else {
                    return;
                }
            } else if (B3()) {
                int i11 = g3Var.f29314p0;
                editText = L2(i11);
                i2Var = new h2(this, i11, 3);
            } else if (z3()) {
                int i12 = g3Var.f29314p0;
                editText = v2(i12);
                i2Var = new h2(this, i12, 0);
            } else if (J3()) {
                int i13 = g3Var.f29314p0;
                editText = m4(i13);
                i2Var = new h2(this, i13, 1);
            } else {
                a6 J4 = J4();
                if (J4 != null) {
                    editText = J4.getEditText();
                    i2Var = new i2(J4, 0);
                } else {
                    return;
                }
            }
            final g1 g1Var = editText;
            final Runnable runnable = i2Var;
            if (g1Var != null && (B = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length = g1Var.length()), 0)) <= (f10 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length, 0))) {
                Editable text = g1Var.getText();
                int i14 = r.h;
                String str = null;
                if (text != null) {
                    r[] rVarArr = (r[]) text.getSpans(B, f10, r.class);
                    if (rVarArr.length > 0) {
                        str = rVarArr[0].f18794a;
                    }
                }
                if (str == null) {
                    str = g1Var.getText().subSequence(B, f10).toString();
                }
                final float L = org.telegram.messenger.g0.L(iz.W0 + 4);
                int i15 = k6.G6;
                f6 f6Var = this.f18885n3;
                final int w02 = k6.w0(i15, f6Var);
                p.Z(getContext(), str, new c20() {
                    @Override
                    public final void a(Object obj) {
                        r a10;
                        String str2 = (String) obj;
                        t3 t3Var = t3.this;
                        t3Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a10 = r.a(str2, w02, L)) == null) {
                            return;
                        }
                        f2 f2Var = t3Var.Q3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        g3 g3Var2 = t3Var.f18898u3;
                        if (g3Var2 != null) {
                            g3Var2.f(false);
                        }
                        g1 g1Var2 = g1Var;
                        g1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a10, 0, 1, 33);
                        Editable text2 = g1Var2.getText();
                        int max = Math.max(0, Math.min(B, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(f10, text2.length())), spannableString);
                        runnable.run();
                        f2 f2Var2 = t3Var.Q3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        t3Var.f18887o3.onContentChanged();
                        int min = Math.min(max + 1, g1Var2.length());
                        g1Var2.N();
                        t3Var.post(new t2(g1Var2, min, 3));
                    }
                }, f6Var);
            }
        }
    }

    public final void f2(String str) {
        String str2;
        int i7;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.f26959id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf >= 0 && (i7 = lastIndexOf + 1) < name.length()) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i7).toLowerCase());
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

    public final void f3(a aVar, boolean z9) {
        View C1 = C1(aVar);
        if (C1 instanceof m5) {
            m5 m5Var = (m5) C1;
            g1 g1Var = m5Var.f18706r;
            e6 e6Var = m5Var.F;
            if (e6Var != null) {
                if (!z9) {
                    g1Var.N();
                    g1Var.setSelection(0);
                    return;
                } else if (!e6Var.f18545g.isEmpty()) {
                    p5 m10 = m5Var.f18708w.m((TL_iv.pageTableCell) jg.g.i(1, m5Var.F.f18545g));
                    if (m10 != null) {
                        g1 g1Var2 = m10.f18775a;
                        g1Var2.N();
                        g1Var2.setSelection(g1Var2.length());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (z9 && (C1 instanceof a6)) {
            a6 a6Var = (a6) C1;
            if (a6Var.n()) {
                a6Var.h();
                return;
            }
        }
        g1 U3 = U3(C1);
        if (U3 == null) {
            g3(aVar);
            return;
        }
        U3.N();
        if (z9) {
            U3.setSelection(U3.length());
        }
    }

    public final void f4() {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.f4():void");
    }

    public final void f5(java.lang.CharSequence r19) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.f5(java.lang.CharSequence):void");
    }

    public final void g2(TLRPC.Document document, String str) {
        if (document != null) {
            f2 f2Var = this.Q3;
            if (f2Var != null) {
                f2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z9 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            s sVar = new s();
            aVar.f18393g = sVar;
            sVar.d = true;
            long j3 = document.f26959id;
            if (j3 == 0 || document.dc_id == 0 || document.access_hash == 0) {
                z9 = true;
            }
            if (z9) {
                if (!TextUtils.isEmpty(str) && a8.p0.B(str)) {
                    s sVar2 = aVar.f18393g;
                    sVar2.h = document;
                    sVar2.f18814e = str;
                    sVar2.f18811a = 1;
                    sVar2.f18815f = 0.0f;
                } else {
                    return;
                }
            } else {
                sVar.h = document;
                sVar.f18811a = 2;
                pageblockdocument.document_id = j3;
            }
            x3(aVar);
            if (z9) {
                s sVar3 = aVar.f18393g;
                IdentityHashMap identityHashMap = this.f18877g4;
                y4 y4Var = (y4) identityHashMap.remove(sVar3);
                if (y4Var != null) {
                    y4Var.b();
                }
                y4 y4Var2 = new y4(this.f18883m3, str, document, new d3(this, sVar3, aVar, str));
                identityHashMap.put(sVar3, y4Var2);
                y4Var2.d();
            }
            f2 f2Var2 = this.Q3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            this.f18887o3.onContentChanged();
        }
    }

    public final void g3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof a6) {
            ((a6) C1).B();
        } else if (C1 instanceof r0) {
            ((r0) C1).d.N();
        }
    }

    public final void g4(int i7) {
        View D4 = D4(i7);
        if (D4 instanceof k0) {
            ((k0) D4).b();
        }
    }

    public g1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof g1) {
            return (g1) findFocus;
        }
        return null;
    }

    public k4 getMapDelegate() {
        return this.f18881k4;
    }

    public View getOverlayView() {
        return this.f18900v3;
    }

    public i9 getTextSelectionHelper() {
        return this.f18898u3;
    }

    public final void h2(Uri uri) {
        boolean contains;
        if (uri != null) {
            a aVar = this.f18879i4;
            String str = null;
            this.f18879i4 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            String str2 = str;
            if (str2 != null) {
                contains = str2.startsWith("video");
            } else {
                contains = uri.toString().contains("video");
            }
            boolean z9 = contains;
            int i7 = this.f18907y4;
            this.f18907y4 = i7 - 1;
            Utilities.f21333e.c(new p2(this, uri, z9, str2, i7, aVar));
        }
    }

    public final void h3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof a6) {
            a6 a6Var = (a6) C1;
            a6Var.B();
            g1 editText = a6Var.getEditText();
            editText.setSelection(editText.length());
        } else if (C1 instanceof r0) {
            r0 r0Var = (r0) C1;
            r0Var.d.N();
            g1 editText2 = r0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void h4(int i7) {
        a B4 = B4(i7);
        g1 L2 = L2(i7);
        if (A3(B4) && L2 != null) {
            ((TL_iv.pageBlockDetails) B4.f18389b).title = c6.f(L2.getText());
        }
    }

    public final void i2(gf gfVar) {
        TL_iv.PageBlock pageblockvideo;
        t3 t3Var;
        String str = gfVar.h;
        if (str == null) {
            str = gfVar.I;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        f2 f2Var = this.Q3;
        if (f2Var != null) {
            f2Var.d();
        }
        boolean c10 = u4.c(gfVar);
        if (!gfVar.f26824b && !c10) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        a aVar = new a(pageblockvideo, 0, 0);
        aVar.f18393g = W3(gfVar, str2);
        x3(aVar);
        if (c10) {
            N4(aVar, aVar.f18393g, gfVar);
            t3Var = this;
        } else {
            t3Var = this;
            t3Var.O4(aVar, aVar.f18393g, str2, gfVar.f26824b, gfVar.F, gfVar.G, gfVar.E);
        }
        f2 f2Var2 = t3Var.Q3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        t3Var.f18887o3.onContentChanged();
    }

    public final void i3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof a6) {
            a6 a6Var = (a6) C1;
            a6Var.B();
            a6Var.getEditText().setSelection(0);
        } else if (C1 instanceof r0) {
            r0 r0Var = (r0) C1;
            r0Var.d.N();
            r0Var.getEditText().setSelection(0);
        }
    }

    public final void i4(int i7) {
        View D4 = D4(i7);
        if (D4 instanceof a6) {
            ((a6) D4).w();
        }
    }

    public final void j2(m5 m5Var) {
        m5 m5Var2 = this.f18889p4;
        if (m5Var2 != null && m5Var2 != m5Var) {
            LinkedHashSet linkedHashSet = m5Var2.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                m5Var2.f18708w.invalidate();
                m5Var2.v();
            }
        }
        this.f18889p4 = m5Var;
        this.J3 = false;
        this.f18895s4 = -1;
        this.f18893r4 = -1;
        m5Var.setCellSelectionListener(this.f18897t4);
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x()) {
            g3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void j4(int i7, int i10) {
        p5 m10;
        View D4 = D4(i7);
        if (D4 instanceof m5) {
            m5 m5Var = (m5) D4;
            if (i10 == 0) {
                m5Var.w();
                return;
            }
            TL_iv.pageTableCell g10 = m5Var.g(i10);
            if (g10 != null && (m10 = m5Var.getGrid().m(g10)) != null) {
                e6.d(g10, m10.f18775a.getText());
            }
        }
    }

    public final k3 k2() {
        int i7;
        int i10;
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x() && !J3()) {
            a B4 = B4(g3Var.f29314p0);
            ArrayList arrayList = this.f18894s3;
            int indexOf = arrayList.indexOf(B4);
            int indexOf2 = arrayList.indexOf(B4(g3Var.f29317s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                if (indexOf > indexOf2) {
                    i10 = indexOf;
                    i7 = indexOf2;
                } else {
                    i7 = indexOf;
                    i10 = indexOf2;
                }
                for (int i11 = i7; i11 <= i10; i11++) {
                    a aVar = (a) arrayList.get(i11);
                    if (aVar.f18394i || A3(aVar)) {
                        return null;
                    }
                }
                return new k3(this, i7, i10, g3Var.f29316r0, g3Var.f29319u0);
            }
            return null;
        }
        return null;
    }

    public final boolean k3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.k3(android.view.KeyEvent):boolean");
    }

    public final int l2(int i7) {
        g1 L2 = L2(i7);
        if (L2 != null) {
            return L2.length();
        }
        a6 x22 = x2(i7);
        if (x22 != null) {
            return x22.getEditText().length();
        }
        a B4 = B4(i7);
        if (B4 == null) {
            return 0;
        }
        return a6.z(B4.f18389b).length();
    }

    public final boolean l3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.l3(android.view.MotionEvent):boolean");
    }

    public final int l4(int i7) {
        Layout layout;
        View D4 = D4(i7);
        if (!(D4 instanceof a6) || (layout = ((a6) D4).getEditText().getLayout()) == null) {
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

    public final boolean m3(li.m5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.m3(li.m5, int, int):boolean");
    }

    public final g1 m4(int i7) {
        View D4 = D4(i7);
        if (D4 instanceof a6) {
            return ((a6) D4).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock n2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.n2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean n3() {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.n3():boolean");
    }

    public final boolean o2() {
        g1 editText;
        int length;
        int B;
        int f10;
        i4[] i4VarArr;
        g3 g3Var = this.f18898u3;
        if (g3Var == null || !g3Var.x() || g3Var.f29314p0 != g3Var.f29317s0) {
            return false;
        }
        if (O3()) {
            int i7 = g3Var.f29314p0;
            int i10 = g3Var.f29315q0;
            if (i10 != g3Var.f29318t0) {
                return false;
            }
            editText = Q4(i7, i10);
        } else if (B3()) {
            editText = L2(g3Var.f29314p0);
        } else if (z3()) {
            editText = v2(g3Var.f29314p0);
        } else if (J3()) {
            editText = m4(g3Var.f29314p0);
        } else {
            a6 J4 = J4();
            if (J4 == null) {
                return false;
            }
            editText = J4.getEditText();
        }
        if (editText == null || (B = jg.g.B(g3Var.f29316r0, g3Var.f29319u0, (length = editText.length()), 0)) >= (f10 = jg.g.f(g3Var.f29316r0, g3Var.f29319u0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && B < f10) {
            for (i4 i4Var : (i4[]) text.getSpans(B, f10, i4.class)) {
                if (text.getSpanStart(i4Var) < f10 && text.getSpanEnd(i4Var) > B) {
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
        this.f37162h3 = false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        View F;
        int i13 = i12 - i10;
        int i14 = this.R3;
        if (i14 > 0 && i13 < i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        if (z10) {
            View findFocus = findFocus();
            if (findFocus == null) {
                F = null;
            } else {
                F = F(findFocus);
            }
            if (F != null) {
                int L = (org.telegram.messenger.g0.L(8.0f) + F.getBottom()) - (i13 - getPaddingBottom());
                if (L > 0) {
                    post(new h2(this, L, 2));
                }
            }
        }
        this.R3 = i13;
    }

    public final boolean p2() {
        int[] G4 = G4();
        if (G4 == null) {
            return q2(G2());
        }
        for (int i7 = G4[0]; i7 <= G4[1]; i7++) {
            if (q2((a) this.f18894s3.get(i7))) {
                return true;
            }
        }
        return false;
    }

    public final boolean p3() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f18894s3;
            if (i7 >= arrayList.size()) {
                return false;
            }
            for (s sVar : T3((a) arrayList.get(i7))) {
                if (sVar.a()) {
                    return true;
                }
            }
            i7++;
        }
    }

    public final boolean p4(int i7, int i10, boolean z9) {
        boolean z10;
        if (i7 >= 0 && i10 >= i7) {
            ArrayList arrayList = this.f18894s3;
            if (i10 < arrayList.size()) {
                f2 f2Var = this.Q3;
                if (f2Var != null) {
                    f2Var.d();
                }
                if (z9) {
                    z10 = false;
                    while (i10 >= i7) {
                        if (t3(i10, true, true)) {
                            z10 = true;
                        }
                        i10--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i7);
                    if (aVar.f18390c >= 1 && (i7 == 0 || ((a) arrayList.get(i7 - 1)).f18390c < aVar.f18390c)) {
                        return false;
                    }
                    z10 = false;
                    while (i7 <= i10) {
                        if (t3(i7, false, true)) {
                            z10 = true;
                        }
                        i7++;
                    }
                }
                if (z10) {
                    v4();
                    if (findFocus() instanceof g1) {
                        b2();
                    } else {
                        this.f37160f3.O(false);
                    }
                    f2 f2Var2 = this.Q3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                }
                return z10;
            }
        }
        return false;
    }

    public final boolean q2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar != null && (indexOf = (arrayList = this.f18894s3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f18390c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f18389b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !F3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !r2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f18390c < aVar2.f18390c) {
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
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof a6) {
                a6 a6Var = (a6) childAt;
                a6Var.f18426f.m();
                a6Var.h.m();
            } else if (childAt instanceof m5) {
                m5 m5Var = (m5) childAt;
                o5 o5Var = m5Var.f18708w;
                m5Var.f18706r.m();
                for (int i10 = 0; i10 < o5Var.getChildCount(); i10++) {
                    View childAt2 = o5Var.getChildAt(i10);
                    if (childAt2 instanceof p5) {
                        ((p5) childAt2).f18775a.m();
                    }
                }
            } else if (childAt instanceof k0) {
                ((k0) childAt).getCaptionEditText().m();
            } else if (childAt instanceof r0) {
                ((r0) childAt).getEditText().m();
            }
        }
    }

    public final void q4(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof s4) {
            s4 s4Var = (s4) C1;
            ArrayList arrayList = s4Var.D;
            if (s4Var.f18986a != null) {
                s4Var.p();
                if (s4Var.W >= arrayList.size()) {
                    s4Var.W = Math.max(0, arrayList.size() - 1);
                }
                s4Var.q(false);
                s4Var.requestLayout();
                s4Var.invalidate();
            }
        }
    }

    public final boolean r2(int i7) {
        if (i7 > 0) {
            ArrayList arrayList = this.f18894s3;
            if (i7 < arrayList.size() && H3(((a) arrayList.get(i7)).f18389b) && ((a) arrayList.get(i7 - 1)).f18390c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r3(boolean z9) {
        g3 g3Var = this.f18898u3;
        if (g3Var != null) {
            if (z9) {
                g3Var.f(false);
            } else {
                org.telegram.messenger.g0.r(g3Var.m0);
                g3Var.u();
            }
        }
        if (z9) {
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
        for (int i7 = G4[0]; i7 <= G4[1]; i7++) {
            if (t2((a) this.f18894s3.get(i7))) {
                return true;
            }
        }
        return false;
    }

    public final boolean s3(int i7) {
        if (((a) this.f18894s3.get(i7)).f18390c + 1 <= ((org.telegram.messenger.j0) qp.s1(this.f18883m3).f24935x7.X.f13555b).f23439c - 6) {
            return true;
        }
        return false;
    }

    public final void s4(int i7) {
        ArrayList arrayList = this.f18894s3;
        int min = Math.min(arrayList.size() - 1, i7 + 1);
        for (int max = Math.max(0, i7 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f18390c > 0) {
                View C1 = C1(aVar);
                if (C1 instanceof a6) {
                    ((a6) C1).F();
                }
            }
        }
    }

    public void setAdaptiveLinkDialogs(boolean z9) {
        this.f18890q3 = z9;
    }

    public void setAllowTapAboveContent(boolean z9) {
        this.Y3 = z9;
    }

    public void setFileRefParentObject(ij ijVar) {
        this.f18888p3 = ijVar;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.U3 = new ArrayList();
        ArrayList arrayList = this.f18894s3;
        Z2(arrayList, a5.b(charSequence), this.f18896t3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.U3.add((a) arrayList.get(size));
        }
        this.f37160f3.O(false);
    }

    public final boolean t2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.f18894s3).indexOf(aVar)) < 0 || aVar.f18390c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f18390c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean t3(int i7, boolean z9, boolean z10) {
        boolean z11;
        a aVar;
        int i10;
        int i11 = 0;
        if (i7 >= 0) {
            ArrayList arrayList = this.f18894s3;
            if (i7 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i7);
                if (z9) {
                    if (aVar2.f18390c > 0) {
                        w2(i7);
                        return true;
                    }
                } else if (aVar2.f18390c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f18389b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !F3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if ((z11 || r2(i7)) && s3(i7)) {
                        if (i7 > 0) {
                            aVar = (a) arrayList.get(i7 - 1);
                        } else {
                            aVar = null;
                        }
                        if (z11) {
                            aVar2.f18390c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i11 = 1;
                            }
                            aVar2.d = i11;
                            return true;
                        }
                        aVar2.f18390c = aVar.f18390c;
                        if (aVar.d > 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        aVar2.d = i10;
                        aVar2.f18391e = false;
                        aVar2.f18392f = false;
                        return true;
                    }
                } else if ((z10 || (i7 != 0 && ((a) arrayList.get(i7 - 1)).f18390c >= aVar2.f18390c)) && s3(i7)) {
                    aVar2.f18390c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void t4(a aVar, s sVar) {
        int i7;
        if (aVar == null) {
            return;
        }
        if (E3(aVar.f18389b)) {
            ArrayList j3 = j3(aVar.f18389b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i7 = arrayList.indexOf(sVar);
            } else {
                i7 = -1;
            }
            if (i7 >= 0) {
                aVar.h.remove(i7);
                if (j3 != null && i7 < j3.size()) {
                    j3.remove(i7);
                }
            }
            if (aVar.h.isEmpty()) {
                u4(aVar);
                return;
            }
            int size = aVar.h.size();
            l41 l41Var = this.f37160f3;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f18389b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) j3.get(0);
                aVar.f18389b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f18393g = (s) aVar.h.get(0);
                aVar.h = null;
                l41Var.O(true);
                q4(aVar);
                return;
            }
            l41Var.O(true);
            q4(aVar);
            return;
        }
        u4(aVar);
    }

    public final boolean u2() {
        f2 f2Var = this.Q3;
        if (f2Var != null) {
            if (f2Var.f18558e || !f2Var.f18556b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u3(boolean z9) {
        a aVar;
        int i7;
        int i10;
        int[] G4 = G4();
        if (G4 != null && (i7 = G4[0]) != (i10 = G4[1])) {
            p4(i7, i10, z9);
            return;
        }
        if (G4 == null) {
            aVar = G2();
        } else {
            aVar = (a) this.f18894s3.get(G4[0]);
        }
        if (aVar != null) {
            Z3(aVar, z9);
        }
    }

    public final void u4(a aVar) {
        ArrayList arrayList = this.f18894s3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.f37160f3.O(true);
        }
    }

    public final g1 v2(int i7) {
        View D4 = D4(i7);
        if (D4 instanceof k0) {
            return ((k0) D4).getCaptionEditText();
        }
        return null;
    }

    public final void v3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f18396k;
        int size = arrayList3.size();
        int i7 = 0;
        while (i7 < size && i7 < arrayList.size() && ((Long) arrayList3.get(i7)).equals(arrayList.get(i7))) {
            i7++;
        }
        for (int i10 = size - 1; i10 >= i7; i10--) {
            Long l10 = (Long) arrayList3.get(i10);
            long longValue = l10.longValue();
            Integer num = (Integer) hashMap.get(l10);
            if (num != null && (num.intValue() >= 2 || i10 != 0 || this.f18896t3.containsKey(l10))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f18405t = longValue;
                for (int i11 = 0; i11 <= i10; i11++) {
                    aVar2.f18396k.add((Long) arrayList3.get(i11));
                }
                int i12 = d5.f18523b;
                x31 K = x31.K(d5.class);
                K.G = aVar2;
                K.H = this.f18884m4;
                arrayList2.add(K);
                this.f18903w4.add(aVar2);
            }
        }
    }

    public final void v4() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f18894s3;
            if (i7 < arrayList.size()) {
                a aVar = (a) arrayList.get(i7);
                if (aVar.f18390c > 0 && aVar.d > 0 && !H3(aVar.f18389b)) {
                    int i10 = aVar.f18390c;
                    int i11 = 1;
                    for (int i12 = i7 - 1; i12 >= 0; i12--) {
                        a aVar2 = (a) arrayList.get(i12);
                        int i13 = aVar2.f18390c;
                        if (i13 < i10) {
                            break;
                        }
                        if (i13 == i10 && !H3(aVar2.f18389b)) {
                            if (aVar2.d <= 0) {
                                break;
                            }
                            i11++;
                        }
                    }
                    aVar.d = i11;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void w2(int i7) {
        a aVar;
        int i10;
        ArrayList arrayList = this.f18894s3;
        a aVar2 = (a) arrayList.get(i7);
        int i11 = aVar2.f18390c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            aVar2.f18390c = i12;
            if (i12 == 0) {
                aVar2.d = 0;
                aVar2.f18391e = false;
                aVar2.f18392f = false;
            }
            while (true) {
                i7++;
                if (i7 < arrayList.size() && (i10 = (aVar = (a) arrayList.get(i7)).f18390c) > i11) {
                    aVar.f18390c = i10 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void w3() {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.w3():void");
    }

    public final void w4(String str) {
        g3 g3Var = this.f18898u3;
        a2(g3Var.f29314p0, g3Var.f29316r0, g3Var.f29317s0, g3Var.f29319u0, str.split("\n", -1));
    }

    public final a6 x2(int i7) {
        if (i7 < 0) {
            return null;
        }
        View m10 = this.f37159e3.m(i7);
        if (!(m10 instanceof a6)) {
            return null;
        }
        return (a6) m10;
    }

    public final void x3(li.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: li.t3.x3(li.a):void");
    }

    public final s x4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document V2 = V2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (V2 == null) {
                return null;
            }
            s sVar = new s();
            sVar.f18813c = true;
            sVar.f18811a = 2;
            sVar.h = V2;
            sVar.f18817i = V2;
            return sVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document V22 = V2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (V22 == null) {
                return null;
            }
            s sVar2 = new s();
            sVar2.d = true;
            sVar2.f18811a = 2;
            sVar2.h = V22;
            return sVar2;
        } else {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document V23 = V2(pageblockvideo.video_id);
                if (V23 == null) {
                    return null;
                }
                s sVar3 = new s();
                sVar3.f18812b = true;
                sVar3.f18811a = 2;
                sVar3.h = V23;
                sVar3.f18822n = pageblockvideo.spoiler;
                for (int i7 = 0; i7 < V23.attributes.size(); i7++) {
                    if (V23.attributes.get(i7) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) V23.attributes.get(i7);
                        sVar3.f18818j = tL_documentAttributeVideo.f26960w;
                        sVar3.f18819k = tL_documentAttributeVideo.h;
                        return sVar3;
                    }
                }
                return sVar3;
            } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
                return null;
            } else {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                long j3 = pageblockphoto.photo_id;
                int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i10 == 0) {
                    photo = null;
                } else {
                    int i11 = 0;
                    loop1: while (true) {
                        if (i11 < this.f18894s3.size()) {
                            for (s sVar4 : T3((a) this.f18894s3.get(i11))) {
                                if (sVar4 != null && (photo = sVar4.f18816g) != null && photo.f26977id == j3) {
                                    break loop1;
                                }
                            }
                            i11++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f18892r3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i12);
                                    i12++;
                                    TLRPC.Photo photo3 = photo2;
                                    if (photo3 != null && photo3.f26977id == j3) {
                                        photo = photo3;
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = t4.f18909a;
                            synchronized (t4.class) {
                                if (i10 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) t4.f18909a.get(Long.valueOf(j3));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                s sVar5 = new s();
                sVar5.f18811a = 2;
                sVar5.f18816g = photo;
                sVar5.f18822n = pageblockphoto.spoiler;
                TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                if (w10 != null) {
                    sVar5.f18818j = w10.f26978w;
                    sVar5.f18819k = w10.h;
                }
                return sVar5;
            }
        }
    }

    public final void y2() {
        J2();
        this.f18892r3 = null;
        this.f18879i4 = null;
        this.f18880j4 = null;
        this.Q3 = new f2(this.f18901v4);
        C4();
        this.Q3.j();
        r3 r3Var = this.f18887o3;
        if (r3Var != null) {
            r3Var.N();
        }
    }

    public final void y4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f18892r3 != null && aVar != null && (pageBlock = aVar.f18389b) != null) {
            if (E3(pageBlock)) {
                ArrayList j3 = j3(aVar.f18389b);
                aVar.h = new ArrayList();
                if (j3 != null) {
                    for (int i7 = 0; i7 < j3.size(); i7++) {
                        s x42 = x4((TL_iv.PageBlock) j3.get(i7));
                        ArrayList arrayList = aVar.h;
                        if (x42 == null) {
                            x42 = new s();
                        }
                        arrayList.add(x42);
                    }
                    return;
                }
                return;
            }
            s x43 = x4(aVar.f18389b);
            if (x43 != null) {
                aVar.f18393g = x43;
            }
        }
    }

    public final boolean z3() {
        int i7;
        g3 g3Var = this.f18898u3;
        if (g3Var != null && g3Var.x() && (i7 = g3Var.f29314p0) == g3Var.f29317s0 && i7 >= 0 && i7 < this.f18903w4.size()) {
            return D4(i7) instanceof k0;
        }
        return false;
    }

    public final ArrayList z4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            a aVar = (a) obj;
            if (E3(aVar.f18389b)) {
                ArrayList j3 = j3(aVar.f18389b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (j3 != null) {
                    int size2 = j3.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = j3.get(i10);
                        i10++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        s x42 = x4(pageBlock);
                        if (x42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(x42);
                        }
                    }
                    j3.clear();
                    j3.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.f18389b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    s x43 = x4(pageBlock2);
                    if (x43 != null) {
                        aVar.f18393g = x43;
                        arrayList2.add(aVar);
                    }
                }
            }
        }
        return arrayList2;
    }
}
