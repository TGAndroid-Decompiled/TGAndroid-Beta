package mi;

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
import b8.ne;
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
import org.telegram.messenger.az;
import org.telegram.messenger.b20;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.re;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.messenger.ye;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
public final class t3 extends l41 {
    public static final ArrayList A4 = new ArrayList();
    public boolean A3;
    public float B3;
    public float C3;
    public float D3;
    public float E3;
    public View F3;
    public b G3;
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
    public g2 R3;
    public int S3;
    public h1 T3;
    public final i U3;
    public ArrayList V3;
    public int W3;
    public int X3;
    public int Y3;
    public boolean Z3;
    public a f19900a4;
    public boolean f19901b4;
    public final l3 f19902c4;
    public final r2 f19903d4;
    public final m3 f19904e4;
    public final n3 f19905f4;
    public final o3 f19906g4;
    public final IdentityHashMap f19907h4;
    public final IdentityHashMap f19908i4;
    public a f19909j4;
    public a f19910k4;
    public final p3 f19911l4;
    public final z2 f19912m4;
    public final int f19913n3;
    public final a3 n4;
    public final org.telegram.ui.ActionBar.e6 f19914o3;
    public final b3 f19915o4;
    public final r3 f19916p3;
    public final c3 f19917p4;
    public zi f19918q3;
    public n5 f19919q4;
    public boolean f19920r3;
    public f60 f19921r4;
    public TL_iv.RichMessage f19922s3;
    public int f19923s4;
    public final ArrayList f19924t3;
    public int f19925t4;
    public final HashMap f19926u3;
    public final s2 f19927u4;
    public final h3 f19928v3;
    public final d3 f19929v4;
    public final t9 f19930w3;
    public final gi.w5 f19931w4;
    public int f19932x3;
    public final ArrayList f19933x4;
    public int f19934y3;
    public dk0 f19935y4;
    public int f19936z3;
    public int f19937z4;

    public t3(Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, r3 r3Var) {
        super(context, i3, 0, false, new gi.q4(r1, 28), new l5.b(r1, 9), null, e6Var);
        this.f19920r3 = true;
        this.f19924t3 = new ArrayList();
        this.f19926u3 = new HashMap();
        this.f19932x3 = -1;
        this.f19934y3 = -1;
        this.f19936z3 = 0;
        this.U3 = new i(this, 2);
        this.Z3 = true;
        this.f19902c4 = new l3(this);
        this.f19903d4 = new r2(this);
        this.f19904e4 = new m3(this);
        this.f19905f4 = new n3(this);
        this.f19906g4 = new o3(this);
        this.f19907h4 = new IdentityHashMap();
        this.f19908i4 = new IdentityHashMap();
        this.f19911l4 = new p3(this);
        this.f19912m4 = new z2(this);
        this.n4 = new a3(this);
        this.f19915o4 = new b3(this);
        this.f19917p4 = new c3(this);
        this.f19923s4 = -1;
        this.f19925t4 = -1;
        this.f19927u4 = new s2(this);
        this.f19929v4 = new d3(this);
        gi.w5 w5Var = new gi.w5(this, 16);
        this.f19931w4 = w5Var;
        this.f19933x4 = new ArrayList();
        this.f19937z4 = -1;
        t3[] t3VarArr = {this};
        this.f19913n3 = i3;
        this.f19914o3 = e6Var;
        this.f19916p3 = r3Var;
        this.f35594g3.f33698r = false;
        setClipToPadding(false);
        setClipChildren(false);
        E1(new gi.q4(this, 29), false);
        setReorderLongPressEnabled(false);
        z1(true);
        h3 h3Var = new h3(this, r3Var);
        this.f19928v3 = h3Var;
        h3Var.S(this);
        h3Var.f29362z0 = this.f35593f3;
        t9 n4 = h3Var.n(context);
        this.f19930w3 = n4;
        org.telegram.messenger.g0.E2(n4);
        h3Var.D = new j3(this, r3Var);
        j(new ai.i4(2, this, r3Var));
        this.R3 = new g2(w5Var);
    }

    public static boolean A3(a aVar) {
        if (aVar != null && (aVar.f19431b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || H3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !b6.z(pageBlock).isEmpty()) {
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
        if (aVar != null && !aVar.f19436i && !A3(aVar) && (aVar.f19431b instanceof TL_iv.pageBlockParagraph) && aVar.f19432c == 0 && aVar.d == 0 && !aVar.f19433e && aVar.f19438k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void L1(mi.t3[] r20, java.util.ArrayList r21, org.telegram.ui.Components.f41 r22) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.L1(mi.t3[], java.util.ArrayList, org.telegram.ui.Components.f41):void");
    }

    public static void M2(ArrayList arrayList, a aVar) {
        int i3;
        int i10;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j10;
        TL_iv.PageBlock pageBlock = aVar.f19431b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            s sVar = aVar.f19435g;
            if (sVar != null && sVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f19431b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f19431b.caption.text = new TL_iv.textEmpty();
                        aVar.f19431b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f19431b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            s sVar2 = aVar.f19435g;
            if (sVar2 != null && sVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f19431b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f19431b.caption.text = new TL_iv.textEmpty();
                        aVar.f19431b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f19431b);
                }
            }
        } else if (E3(pageBlock)) {
            ArrayList j32 = j3(aVar.f19431b);
            List T3 = T3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i11 = 0; j32 != null && i11 < j32.size() && i11 < T3.size(); i11++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) j32.get(i11);
                if (((s) T3.get(i11)).b()) {
                    if (pageBlock4 instanceof TL_iv.pageBlockPhoto) {
                        j10 = ((TL_iv.pageBlockPhoto) pageBlock4).photo_id;
                    } else if (pageBlock4 instanceof TL_iv.pageBlockVideo) {
                        j10 = ((TL_iv.pageBlockVideo) pageBlock4).video_id;
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        k0.d(pageBlock4);
                        arrayList2.add(pageBlock4);
                    }
                }
            }
            if (arrayList2.size() >= 2) {
                if (aVar.f19431b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f19431b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f19431b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                k0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f19431b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                s sVar3 = aVar.f19435g;
                if (sVar3 != null && sVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f19431b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f19431b.caption.text = new TL_iv.textEmpty();
                            aVar.f19431b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f19431b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                s sVar4 = aVar.f19435g;
                if (sVar4 != null && (document = sVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f27007id;
                }
                if (sVar4 != null && sVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f19431b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        k0.d(pageBlock7);
                        arrayList.add(aVar.f19431b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
                int i12 = n4.N;
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
                    arrayList.add(aVar.f19431b);
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
                                    f6.c(pagetablecell, "");
                                } else {
                                    pagetablecell.flags |= 128;
                                }
                                if (pagetablecell.colspan > 1) {
                                    i3 = pagetablecell.flags | 2;
                                } else {
                                    i3 = pagetablecell.flags & (-3);
                                }
                                pagetablecell.flags = i3;
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

    public static void O1(t3 t3Var, int i3, int i10, int i11) {
        h1 editText;
        if (i3 >= 0) {
            View m10 = t3Var.f35593f3.m(i3);
            if (m10 instanceof b6) {
                b6 b6Var = (b6) m10;
                if (i10 == 1 && b6Var.n()) {
                    editText = b6Var.getAuthorEditText();
                } else {
                    editText = b6Var.getEditText();
                }
                editText.O();
                editText.setSelection(Math.max(0, Math.min(i11, editText.length())));
            } else if (m10 instanceof n5) {
                n5 n5Var = (n5) m10;
                h1 m11 = n5Var.m(i10);
                if (m11 == null) {
                    m11 = n5Var.m(0);
                }
                if (m11 != null) {
                    m11.O();
                    m11.setSelection(Math.max(0, Math.min(i11, m11.length())));
                }
            } else if (m10 instanceof l0) {
                h1 captionEditText = ((l0) m10).getCaptionEditText();
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

    public static org.telegram.tgnet.tl.TL_iv.PageBlock P1(mi.t3 r2, mi.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.P1(mi.t3, mi.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public static void Q1(t3 t3Var, h1 h1Var) {
        if (h1Var == null) {
            t3Var.getClass();
            return;
        }
        h1Var.X1 = t3Var.f19920r3;
        h1Var.setInlineButtonContext(t3Var.f19913n3);
        h1Var.setInlineButtonClickListener(new s2(t3Var));
    }

    public static void Q2(ArrayList arrayList, ArrayList arrayList2, int i3, boolean z10, int i10, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i11);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            W1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i3, i10, z11, z12);
                        } else {
                            a aVar = new a(pageBlock, i3, i10);
                            aVar.f19433e = z11;
                            aVar.f19434f = z12;
                            arrayList.add(aVar);
                        }
                        z13 = true;
                    } else {
                        arrayList.add(new a(pageBlock, i3, z10 ? 1 : 0));
                    }
                } else {
                    if (!z13) {
                        W1(arrayList, null, i3, i10, z11, z12);
                        z13 = true;
                    }
                    R2(arrayList, pageBlock, i3 + 1);
                }
            }
        }
        if (!z13) {
            W1(arrayList, null, i3, i10, z11, z12);
        }
    }

    public static TL_iv.PageBlock Q3(a aVar, s sVar) {
        int i3;
        if (E3(aVar.f19431b)) {
            ArrayList j32 = j3(aVar.f19431b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i3 = arrayList.indexOf(sVar);
            } else {
                i3 = -1;
            }
            if (i3 >= 0 && j32 != null && i3 < j32.size()) {
                return (TL_iv.PageBlock) j32.get(i3);
            }
            return null;
        }
        return aVar.f19431b;
    }

    public static void R1(a aVar, s sVar, t3 t3Var) {
        r3 r3Var = t3Var.f19916p3;
        IdentityHashMap identityHashMap = t3Var.f19908i4;
        IdentityHashMap identityHashMap2 = t3Var.f19907h4;
        if (sVar == null) {
            ArrayList arrayList = t3Var.f19924t3;
            for (s sVar2 : T3(aVar)) {
                z4 z4Var = (z4) identityHashMap2.remove(sVar2);
                if (z4Var != null) {
                    z4Var.b();
                }
                v4 v4Var = (v4) identityHashMap.remove(sVar2);
                if (v4Var != null) {
                    v4Var.a();
                }
            }
            int indexOf = arrayList.indexOf(aVar);
            if (indexOf >= 0) {
                g2 g2Var = t3Var.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                arrayList.remove(indexOf);
                t3Var.f35594g3.O(true);
                g2 g2Var2 = t3Var.R3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
            }
            r3Var.onContentChanged();
            return;
        }
        z4 z4Var2 = (z4) identityHashMap2.remove(sVar);
        if (z4Var2 != null) {
            z4Var2.b();
        }
        v4 v4Var2 = (v4) identityHashMap.remove(sVar);
        if (v4Var2 != null) {
            v4Var2.a();
        }
        g2 g2Var3 = t3Var.R3;
        if (g2Var3 != null) {
            g2Var3.d();
        }
        t3Var.t4(aVar, sVar);
        g2 g2Var4 = t3Var.R3;
        if (g2Var4 != null) {
            g2Var4.h();
        }
        r3Var.onContentChanged();
    }

    public static void R2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i3) {
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
                    W1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i3, i11, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i12 = i11;
                    Q2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i3, true, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
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
                W1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i3, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                Q2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i3, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static boolean R4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(d6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i3 = 0; i3 < pageblocktable.rows.size(); i3++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i3);
            for (int i10 = 0; i10 < pagetablerow.cells.size(); i10++) {
                if (!f6.g(pagetablerow.cells.get(i10)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void S1(t3 t3Var) {
        if (t3Var.Q3) {
            return;
        }
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.h();
        }
        t3Var.f19916p3.a0();
        t3Var.r4();
    }

    public static FrameLayout S4(n5 n5Var, boolean z10) {
        int i3;
        q5 m10;
        f6 model = n5Var.getModel();
        if (model != null) {
            int i10 = Integer.MAX_VALUE;
            if (z10) {
                i3 = -1;
            } else {
                i3 = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : n5Var.getSelectedCells()) {
                int a10 = model.a(pagetablecell2);
                int o10 = z10 ? (f6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o10 < i3 || (o10 == i3 && a10 < i10) : o10 > i3 || (o10 == i3 && a10 < i10)) {
                    pagetablecell = pagetablecell2;
                    i10 = a10;
                    i3 = o10;
                }
            }
            if (pagetablecell != null && (m10 = n5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return n5Var;
    }

    public static void T1(t3 t3Var, a aVar) {
        ArrayList arrayList = t3Var.f19924t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f19438k.addAll(aVar.f19438k);
        arrayList.add(indexOf + 1, aVar2);
        t3Var.v4();
        t3Var.f35594g3.O(false);
        g2 g2Var2 = t3Var.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        t3Var.post(new n2(t3Var, aVar2, 23));
    }

    public static List T3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (E3(aVar.f19431b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        s sVar = aVar.f19435g;
        if (sVar != null) {
            return Collections.singletonList(sVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static boolean U1(mi.t3 r17, mi.a r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.U1(mi.t3, mi.a, boolean):boolean");
    }

    public static h1 U3(View view) {
        if (view instanceof b6) {
            return ((b6) view).getEditText();
        }
        if (view instanceof l0) {
            return ((l0) view).getCaptionEditText();
        }
        if (view instanceof s0) {
            return ((s0) view).getEditText();
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

    public static void W1(ArrayList arrayList, TL_iv.RichText richText, int i3, int i10, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i3, i10);
        aVar.f19433e = z10;
        aVar.f19434f = z11;
        arrayList.add(aVar);
    }

    public static s W3(ye yeVar, String str) {
        boolean z10;
        int i3;
        s sVar = new s();
        sVar.f19860b = yeVar.f25310b;
        sVar.f19862e = str;
        sVar.f19866j = yeVar.F;
        sVar.f19867k = yeVar.G;
        String str2 = yeVar.h;
        int i10 = 0;
        if (str2 != null && str != null && str.equals(str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i3 = 0;
        } else {
            i3 = yeVar.J;
        }
        sVar.f19868l = i3;
        if (!z10) {
            i10 = yeVar.K;
        }
        sVar.f19869m = i10;
        sVar.f19859a = 1;
        sVar.f19863f = 0.0f;
        return sVar;
    }

    public static n5 X2(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof n5) {
                return (n5) parent;
            }
        }
        return null;
    }

    public static void Z2(ArrayList arrayList, ArrayList arrayList2, Map map) {
        TL_iv.RichText richText;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
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
                        aVar.f19436i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a10 = o0.a();
                        Z2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f19438k.add(0, Long.valueOf(a10));
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

    public static int[] e5(n5 n5Var) {
        int i3;
        int i10;
        f6 f6Var = n5Var.G;
        if (f6Var != null) {
            i3 = f6Var.f19613g.size();
        } else {
            i3 = 0;
        }
        while (i3 >= 0) {
            h1 m10 = n5Var.m(i3);
            if (m10 != null) {
                i10 = m10.length();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                return new int[]{i3, i10};
            }
            i3--;
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

    public static boolean k4(h1 h1Var, float f10, float f11) {
        int[] iArr;
        if (h1Var != null && h1Var.getVisibility() == 0) {
            h1Var.getLocationOnScreen(new int[2]);
            float f12 = f10 - iArr[0];
            float f13 = f11 - iArr[1];
            if (f12 >= 0.0f && f13 >= 0.0f && f12 <= h1Var.getWidth() && f13 <= h1Var.getHeight()) {
                int offsetForPosition = h1Var.getOffsetForPosition(f12, f13);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                h1Var.O();
                h1Var.setSelection(Math.max(0, Math.min(offsetForPosition, h1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int n4(int i3, a aVar, boolean z10) {
        int i10;
        if (aVar == null) {
            return org.telegram.messenger.g0.L(2.0f);
        }
        if (z10) {
            i10 = aVar.f19439l;
        } else {
            i10 = aVar.f19440m;
        }
        int size = aVar.f19438k.size() - i10;
        return org.telegram.messenger.k5.D(16.0f, Math.max(0, i3 - size), org.telegram.messenger.g0.L(2.0f));
    }

    public static boolean o3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !G3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int o4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f19438k;
        int i3 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f19438k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i3 < min && ((Long) arrayList.get(i3)).equals(arrayList2.get(i3))) {
            i3++;
        }
        return i3;
    }

    public void setEditTextsLocked(boolean z10) {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof b6) {
                ((b6) childAt).setLocked(z10);
            } else if (childAt instanceof n5) {
                ((n5) childAt).setLocked(z10);
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof s0) {
                ((s0) childAt).setLocked(z10);
            } else if (childAt instanceof w0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean y3(int i3) {
        if (i3 != 21 && i3 != 22 && i3 != 19 && i3 != 20) {
            return false;
        }
        return true;
    }

    public static int z2(int i3) {
        if (i3 == 4) {
            return 114971;
        }
        if (i3 == 16384) {
            return 32772;
        }
        if (i3 != 32768) {
            return 4;
        }
        return 16388;
    }

    public final boolean A2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i3 = 0;
        while (true) {
            arrayList = this.f19924t3;
            if (i3 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i3);
            boolean z10 = aVar.f19436i;
            ArrayList arrayList2 = aVar.f19438k;
            if (!z10) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Map.EL.merge(hashMap, (Long) arrayList2.get(i10), 1, new Object());
                }
            }
            i3++;
        }
        boolean z11 = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            a aVar2 = (a) arrayList.get(i11);
            ArrayList arrayList3 = aVar2.f19438k;
            if (arrayList3.size() == 1 && (aVar2.f19431b instanceof TL_iv.pageBlockParagraph)) {
                Long l10 = (Long) arrayList3.get(0);
                l10.getClass();
                Integer num = (Integer) hashMap.get(l10);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f19431b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f19926u3.remove(l10);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f19431b = pageblockblockquote;
                    arrayList3.clear();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void A4() {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof k4) {
                y yVar = (y) ((k4) childAt);
                yVar.f20030b.a(yVar.f20029a, new l5.b(yVar, 6));
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
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f19924t3;
            if (i3 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i3);
                if ((aVar.f19431b instanceof TL_iv.pageBlockDocument) && (sVar = aVar.f19435g) != null && sVar.b() && (document2 = aVar.f19435g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f19431b).document_id = document2.f27007id;
                }
                for (s sVar2 : T3(aVar)) {
                    if (sVar2.b() && (document = sVar2.h) != null) {
                        long j10 = document.f27007id;
                        if (j10 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j10))) {
                            arrayList.add(sVar2.h);
                        }
                    }
                }
                i3++;
            } else {
                return arrayList;
            }
        }
    }

    public final boolean B3() {
        int i3;
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x() && (i3 = h3Var.f29352p0) == h3Var.f29355s0 && A3(B4(i3))) {
            return true;
        }
        return false;
    }

    public final a B4(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f19933x4;
            if (i3 < arrayList.size()) {
                return (a) arrayList.get(i3);
            }
            return null;
        }
        return null;
    }

    public final ArrayList C2(int i3, int i10) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i3 <= i10) {
            ArrayList arrayList2 = this.f19924t3;
            if (i3 >= arrayList2.size()) {
                break;
            }
            for (s sVar : T3((a) arrayList2.get(i3))) {
                if (sVar.b() && (document = sVar.h) != null && hashSet.add(Long.valueOf(document.f27007id))) {
                    arrayList.add(sVar.h);
                }
            }
            i3++;
        }
        return arrayList;
    }

    public final void C4() {
        ArrayList arrayList = this.f19924t3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.f35594g3.O(false);
    }

    @Override
    public final boolean D1() {
        return this.f19901b4;
    }

    public final ArrayList D2(int i3, int i10) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i3 <= i10) {
            ArrayList arrayList2 = this.f19924t3;
            if (i3 >= arrayList2.size()) {
                break;
            }
            for (s sVar : T3((a) arrayList2.get(i3))) {
                if (sVar.b() && (photo = sVar.f19864g) != null && hashSet.add(Long.valueOf(photo.f27025id))) {
                    arrayList.add(sVar.f19864g);
                }
            }
            i3++;
        }
        return arrayList;
    }

    public final View D4(int i3) {
        if (i3 < 0) {
            return null;
        }
        return this.f35593f3.m(i3);
    }

    public final ArrayList E2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f19924t3;
            if (i3 < arrayList2.size()) {
                for (s sVar : T3((a) arrayList2.get(i3))) {
                    if (sVar.b() && (photo = sVar.f19864g) != null && hashSet.add(Long.valueOf(photo.f27025id))) {
                        arrayList.add(sVar.f19864g);
                    }
                }
                i3++;
            } else {
                return arrayList;
            }
        }
    }

    public final int[] E4() {
        int i3;
        ArrayList arrayList = this.f19924t3;
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x()) {
            int indexOf = arrayList.indexOf(B4(h3Var.f29352p0));
            int indexOf2 = arrayList.indexOf(B4(h3Var.f29355s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        a T2 = T2();
        if (T2 != null) {
            i3 = arrayList.indexOf(T2);
        } else {
            i3 = -1;
        }
        if (i3 >= 0) {
            return new int[]{i3, i3};
        }
        return null;
    }

    @Override
    public final void F1() {
        r3 r3Var = this.f19916p3;
        if (r3Var != null) {
            r3Var.R0();
        }
    }

    public final void F2() {
        g2 g2Var = this.R3;
        if (g2Var != null) {
            g2Var.h();
        }
        ArrayList arrayList = this.f19924t3;
        SpannableStringBuilder g7 = b5.g(arrayList);
        J2();
        arrayList.clear();
        HashMap hashMap = this.f19926u3;
        hashMap.clear();
        this.f19922s3 = null;
        Z2(arrayList, b5.b(g7), hashMap);
        this.f35594g3.O(false);
        g2 g2Var2 = this.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        r3 r3Var = this.f19916p3;
        if (r3Var != null) {
            r3Var.onContentChanged();
            r3Var.O1();
        }
    }

    public final boolean F4() {
        int i3;
        int i10;
        int i11;
        int i12;
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x()) {
            if (O3()) {
                int i13 = h3Var.f29352p0;
                int i14 = h3Var.f29353q0;
                int i15 = h3Var.f29356t0;
                int i16 = h3Var.f29354r0;
                int i17 = h3Var.f29357u0;
                for (int i18 = i14; i18 <= i15; i18++) {
                    h1 Q4 = Q4(i13, i18);
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
                h1 L2 = L2(h3Var.f29352p0);
                if (L2 != null && Math.max(0, Math.min(Math.min(h3Var.f29354r0, h3Var.f29357u0), L2.length())) < Math.max(0, Math.min(Math.max(h3Var.f29354r0, h3Var.f29357u0), L2.length()))) {
                    return true;
                }
            } else if (z3()) {
                h1 v22 = v2(h3Var.f29352p0);
                if (v22 != null) {
                    int i19 = h3Var.f29354r0;
                    int i20 = h3Var.f29357u0;
                    if (Math.max(0, Math.min(Math.min(i19, i20), v22.length())) < Math.max(0, Math.min(Math.max(i19, i20), v22.length()))) {
                        return true;
                    }
                }
            } else if (J3()) {
                h1 m42 = m4(h3Var.f29352p0);
                if (m42 != null) {
                    int i21 = h3Var.f29354r0;
                    int i22 = h3Var.f29357u0;
                    if (Math.max(0, Math.min(Math.min(i21, i22), m42.length())) < Math.max(0, Math.min(Math.max(i21, i22), m42.length()))) {
                        return true;
                    }
                }
            } else {
                int i23 = h3Var.f29352p0;
                int i24 = h3Var.f29355s0;
                int i25 = h3Var.f29354r0;
                int i26 = h3Var.f29357u0;
                if (i23 >= 0 && i24 >= 0 && i24 >= i23 && i24 < this.f19933x4.size()) {
                    for (int i27 = i23; i27 <= i24; i27++) {
                        a B4 = B4(i27);
                        if (B4 != null) {
                            if (B4.f19447t == 0) {
                                TL_iv.PageBlock pageBlock = B4.f19431b;
                                if (!D3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int l22 = l2(i27);
                            if (i27 == i23) {
                                i3 = i25;
                            } else {
                                i3 = 0;
                            }
                            if (i27 == i24) {
                                i10 = i26;
                            } else {
                                i10 = l22;
                            }
                            if (Math.max(0, Math.min(i3, l22)) < Math.max(0, Math.min(i10, l22))) {
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
        r3 r3Var = this.f19916p3;
        if (r3Var != null) {
            r3Var.v1();
        }
        A4();
    }

    public final a G2() {
        int i3;
        a B4;
        a T2 = T2();
        if (T2 != null) {
            return T2;
        }
        h3 h3Var = this.f19928v3;
        if (h3Var != null && (i3 = h3Var.f29352p0) >= 0 && (B4 = B4(i3)) != null) {
            return B4;
        }
        return null;
    }

    public final int[] G4() {
        h3 h3Var = this.f19928v3;
        if (h3Var != null) {
            int i3 = h3Var.f29352p0;
            int i10 = h3Var.f29355s0;
            if (i3 >= 0 && i10 >= 0) {
                a B4 = B4(i3);
                a B42 = B4(i10);
                if (B4 != null && B42 != null) {
                    ArrayList arrayList = this.f19924t3;
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
    public final void H1(u4.d1 d1Var) {
        r3 r3Var = this.f19916p3;
        if (r3Var != null && d1Var != null) {
            View view = d1Var.f55540a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.f19901b4 = r3Var.e(view.getHeight() + iArr[1]);
        }
    }

    public final void H2() {
        ArrayList arrayList;
        h3 h3Var = this.f19928v3;
        int i3 = h3Var.f29352p0;
        int i10 = h3Var.f29354r0;
        int i11 = h3Var.f29355s0;
        if (!a2(i3, i10, i11, h3Var.f29357u0, new String[]{""})) {
            if (i3 > i11) {
                i11 = i3;
                i3 = i11;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i3);
            while (true) {
                arrayList = this.f19924t3;
                if (max > i11) {
                    break;
                }
                ArrayList arrayList3 = this.f19933x4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f19447t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                g2 g2Var = this.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f19926u3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        hashSet.addAll(((a) arrayList.get(i12)).f19438k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                A2();
                Y3();
                v4();
                h3Var.f(false);
                this.f35594g3.O(false);
                g2 g2Var2 = this.R3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                post(new n2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void H4(h1 h1Var) {
        h1Var.X1 = this.f19920r3;
        h1Var.C(new b(this, 4));
    }

    @Override
    public final void I1(u4.d1 d1Var) {
        a aVar = this.f19900a4;
        this.f19900a4 = null;
        this.f19901b4 = false;
        if (aVar != null) {
            g2 g2Var = this.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            u4(aVar);
            g2 g2Var2 = this.R3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            r3 r3Var = this.f19916p3;
            if (r3Var != null) {
                r3Var.onContentChanged();
            }
        } else if (d1Var != null) {
            View view = d1Var.f55540a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean I2() {
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x()) {
            h3Var.f(false);
            return true;
        } else if (this.f19919q4 == null) {
            return false;
        } else {
            P2();
            return true;
        }
    }

    public final void I4(mi.n5 r35) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.I4(mi.n5):void");
    }

    @Override
    public final void J1(u4.d1 d1Var) {
        int b10;
        r31 G;
        a aVar = null;
        if (d1Var != null && (b10 = d1Var.b()) >= 0 && (G = this.f35594g3.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.f19900a4 = aVar;
        this.f19901b4 = false;
        r3 r3Var = this.f19916p3;
        if (r3Var != null) {
            r3Var.u0();
        }
    }

    public final void J2() {
        h3 h3Var = this.f19928v3;
        if (h3Var != null) {
            h3Var.f(true);
        }
        P2();
        q3();
        IdentityHashMap identityHashMap = this.f19907h4;
        for (z4 z4Var : identityHashMap.values()) {
            z4Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.f19908i4;
        for (v4 v4Var : identityHashMap2.values()) {
            v4Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean J3() {
        int i3;
        a B4;
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x() && (i3 = h3Var.f29352p0) == h3Var.f29355s0 && i3 >= 0 && i3 < this.f19933x4.size() && h3Var.f29353q0 == 1 && h3Var.f29356t0 == 1 && (B4 = B4(i3)) != null && b6.p(B4.f19431b)) {
            return true;
        }
        return false;
    }

    public final b6 J4() {
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x()) {
            int i3 = h3Var.f29352p0;
            int i10 = h3Var.f29355s0;
            a B4 = B4(i3);
            if (i3 == i10 && B4 != null && D3(B4.f19431b)) {
                return x2(i3);
            }
            return null;
        }
        return null;
    }

    public final int K2(int i3) {
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            ArrayList arrayList = this.f19924t3;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (A3((a) arrayList.get(i11))) {
                i10++;
            } else if (((a) arrayList.get(i11)).f19436i) {
                i10--;
            }
        }
        return i10;
    }

    public final boolean K3(int i3, int i10) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f19924t3;
            if (i10 < arrayList.size() && i3 <= i10) {
                boolean z10 = false;
                while (i3 <= i10) {
                    a aVar = (a) arrayList.get(i3);
                    if (!aVar.f19436i && !A3(aVar)) {
                        if (!aVar.f19438k.isEmpty() || b6.p(aVar.f19431b)) {
                            z10 = true;
                        }
                    }
                    i3++;
                }
                return z10;
            }
        }
        return false;
    }

    public final Editable K4(int i3, int i10, int i11, int i12) {
        if (i3 == i11) {
            if (A3(B4(i3))) {
                h1 L2 = L2(i3);
                if (L2 != null) {
                    return L2.getText();
                }
                return null;
            } else if (J3()) {
                h1 m42 = m4(i3);
                if (m42 != null) {
                    return m42.getText();
                }
                return null;
            } else {
                a B4 = B4(i3);
                if (B4 != null && D3(B4.f19431b)) {
                    int l22 = l2(i3);
                    if (k2.p1.C(i10, i12, l22, 0) < k2.p1.A(i10, i12, l22, 0)) {
                        b6 x22 = x2(i3);
                        if (x22 != null) {
                            return x22.getEditText().getText();
                        }
                        return b6.A(B4.f19431b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final h1 L2(int i3) {
        if (!A3(B4(i3))) {
            return null;
        }
        View D4 = D4(i3);
        if (!(D4 instanceof s0)) {
            return null;
        }
        return ((s0) D4).getEditText();
    }

    public final boolean L3() {
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x()) {
            int i3 = h3Var.f29352p0;
            int i10 = h3Var.f29355s0;
            if (i3 >= 0 && i10 >= 0 && i10 >= i3) {
                boolean z10 = false;
                while (i3 <= i10) {
                    a B4 = B4(i3);
                    if (B4 != null) {
                        if (F3(B4.f19431b)) {
                            z10 = true;
                        }
                    }
                    i3++;
                }
                return z10;
            }
        }
        return false;
    }

    public final boolean L4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.L4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean M1(a aVar, a aVar2, int i3) {
        float f10;
        if (D3(aVar.f19431b)) {
            TL_iv.PageBlock pageBlock = aVar2.f19431b;
            ArrayList arrayList = aVar2.f19438k;
            if (D3(pageBlock)) {
                View C1 = C1(aVar2);
                if (C1 instanceof b6) {
                    h1 editText = ((b6) C1).getEditText();
                    if (editText.isFocused()) {
                        SpannableStringBuilder A = b6.A(aVar.f19431b);
                        Paint.FontMetricsInt fontMetricsInt = editText.getPaint().getFontMetricsInt();
                        if (F3(aVar.f19431b)) {
                            f10 = 0.85f;
                        } else {
                            f10 = 1.0f;
                        }
                        CharSequence n4 = i6.n(A, fontMetricsInt, false, null, 0, f10, 0);
                        int length = n4.length();
                        Editable text = editText.getText();
                        if (text != null && n4.length() != 0) {
                            editText.f19648d2 = true;
                            text.insert(0, n4);
                            editText.f19648d2 = false;
                        }
                        b6.d(aVar.f19431b, editText.getText());
                        aVar2.f19431b = aVar.f19431b;
                        aVar2.f19432c = aVar.f19432c;
                        aVar2.d = aVar.d;
                        aVar2.f19433e = aVar.f19433e;
                        aVar2.f19434f = aVar.f19434f;
                        arrayList.clear();
                        arrayList.addAll(aVar.f19438k);
                        this.f19924t3.remove(i3 - 1);
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
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.M3(int, int, int, int, int):boolean");
    }

    public final void M4(View view) {
        u4.d1 T;
        int b10;
        if (view != null && this.f35595h3 != null && this.f35597k3 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.f35594g3.H(b10) >= 0) {
            this.I3 = true;
            h3 h3Var = this.f19928v3;
            if (h3Var.x()) {
                h3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.f35595h3.t(T);
        }
    }

    public final boolean N3(int i3, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        boolean z10 = false;
        for (int i17 = i11; i17 <= i13; i17++) {
            h1 Q4 = Q4(i10, i17);
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
                } else if ((Q4.c(max, max2) & i3) == 0) {
                    return false;
                } else {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void N4(a aVar, s sVar, ye yeVar) {
        int i3;
        float f10;
        z4 z4Var = (z4) this.f19907h4.remove(sVar);
        if (z4Var != null) {
            z4Var.b();
        }
        IdentityHashMap identityHashMap = this.f19908i4;
        v4 v4Var = (v4) identityHashMap.remove(sVar);
        if (v4Var != null) {
            v4Var.a();
        }
        sVar.f19859a = 1;
        sVar.f19863f = 0.0f;
        v4 v4Var2 = new v4(this.f19913n3, yeVar, new k4.j(false, this, sVar, aVar));
        identityHashMap.put(sVar, v4Var2);
        if (!v4Var2.f19984f && !v4Var2.h && !v4Var2.f19985n) {
            v4Var2.f19984f = true;
            int i10 = yeVar.F;
            String str = yeVar.I;
            int i11 = yeVar.G;
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
            b20 b20Var = null;
            r8 = null;
            ArrayList arrayList = null;
            b20Var = null;
            if (i10 > 0 && i11 > 0) {
                int i12 = yeVar.J;
                if (i12 == 90 || i12 == 270) {
                    int i13 = i11;
                    i11 = i10;
                    i10 = i13;
                }
                b20 b20Var2 = new b20();
                b20Var2.f21708a = 0L;
                b20Var2.d = (float) 0;
                b20Var2.f21710b = Math.min(3000L, yeVar.f25326t);
                while (true) {
                    long j10 = b20Var2.f21710b;
                    i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    if (i3 <= 0 || j10 >= 1000) {
                        break;
                    }
                    b20Var2.f21710b = j10 * 2;
                }
                if (i3 <= 0) {
                    b20Var2.f21710b = 3000L;
                }
                long j11 = b20Var2.f21710b;
                b20Var2.f21713e = (float) j11;
                b20Var2.f21714f = 1;
                b20Var2.f21715g = 0;
                b20Var2.f21722o = str;
                b20Var2.f21724q = (int) ((f10 / 1000.0f) * 115200.0f);
                b20Var2.f21725r = j11;
                b20Var2.f21721n = 30;
                b20Var2.v = j11;
                b20Var2.A = yeVar.f25321o;
                String str2 = yeVar.f25317k;
                if (str2 != null) {
                    b20Var2.B = str2;
                    ArrayList arrayList2 = yeVar.f25323q;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList = yeVar.f25323q;
                    }
                    b20Var2.G = arrayList;
                } else {
                    b20Var2.B = yeVar.f25316j;
                    b20Var2.G = yeVar.f25322p;
                }
                b20Var2.I = true;
                re reVar = yeVar.A;
                if (reVar != null) {
                    int i14 = reVar.f25117k;
                    if (i14 == 90 || i14 == 270) {
                        int i15 = i11;
                        i11 = i10;
                        i10 = i15;
                    }
                    i10 = (int) (i10 * reVar.f25113e);
                    i11 = (int) (i11 * reVar.f25114f);
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
                b20Var2.f21718k = i16;
                b20Var2.h = i16;
                b20Var2.f21719l = i17;
                b20Var2.f21716i = i17;
                b20Var2.f21720m = -1;
                b20Var2.f21727t = true;
                b20Var2.f21712c = 0L;
                b20Var = b20Var2;
            }
            v4Var2.d = b20Var;
            if (b20Var != null && b20Var.c()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f27022id = 1;
                String absolutePath = new File(w7.z(4), "rich_anim_" + az.p() + ".mp4").getAbsolutePath();
                v4Var2.f19983e = absolutePath;
                tL_message.attachPath = absolutePath;
                zi ziVar = new zi(v4Var2.f19980a, tL_message, null, false, false);
                v4Var2.f19982c = ziVar;
                ziVar.f26886p0 = v4Var2.d;
                hs f13 = hs.f(v4Var2.f19980a);
                f13.b(v4Var2, hs.f23198a2);
                f13.b(v4Var2, hs.f23204b2);
                f13.b(v4Var2, hs.c2);
                MediaController.B().h0(v4Var2.f19982c, false, false, false);
                return;
            }
            v4Var2.b();
        }
    }

    public final boolean O3() {
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x()) {
            int i3 = h3Var.f29352p0;
            int i10 = h3Var.f29355s0;
            a B4 = B4(i3);
            if (i3 == i10 && B4 != null && (B4.f19431b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void O4(a aVar, s sVar, String str, boolean z10, int i3, int i10, int i11) {
        IdentityHashMap identityHashMap = this.f19907h4;
        z4 z4Var = (z4) identityHashMap.remove(sVar);
        if (z4Var != null) {
            z4Var.b();
        }
        z4 z4Var2 = new z4(this.f19913n3, str, z10, i3, i10, i11, new g3(aVar, sVar, this));
        identityHashMap.put(sVar, z4Var2);
        z4Var2.d();
    }

    public final void P2() {
        if (this.J3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.J3 = false;
        this.K3 = false;
        this.L3 = null;
        this.M3 = null;
        f60 f60Var = this.f19921r4;
        if (f60Var != null) {
            this.f19921r4 = null;
            f60Var.u();
        }
        n5 n5Var = this.f19919q4;
        if (n5Var != null) {
            LinkedHashSet linkedHashSet = n5Var.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                n5Var.f19771w.invalidate();
                n5Var.v();
            }
            this.f19919q4 = null;
        }
        this.f19925t4 = -1;
        this.f19923s4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean P3() {
        org.telegram.messenger.p0 p0Var = hp.s1(this.f19913n3).f23167x7;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19924t3;
            if (i3 >= arrayList.size()) {
                break;
            }
            i10 += T3((a) arrayList.get(i3)).size();
            i3++;
        }
        ArrayList c32 = c3();
        ?? obj = new Object();
        obj.d = i10;
        obj.f19672b = c32.size() + obj.f19672b;
        for (int i11 = 0; i11 < c32.size(); i11++) {
            h2.b((TL_iv.PageBlock) c32.get(i11), 1, obj);
        }
        if (obj.f19671a > ((org.telegram.messenger.j0) p0Var.V.f13798b).f23620c || obj.f19672b > ((org.telegram.messenger.j0) p0Var.W.f13798b).f23620c || obj.f19673c > ((org.telegram.messenger.j0) p0Var.X.f13798b).f23620c || obj.d > ((org.telegram.messenger.j0) p0Var.Y.f13798b).f23620c || obj.f19674e > ((org.telegram.messenger.j0) p0Var.Z.f13798b).f23620c) {
            return false;
        }
        return true;
    }

    public final Editable P4(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof b6) {
            return ((b6) C1).getEditText().getText();
        }
        return b6.A(aVar.f19431b);
    }

    public final h1 Q4(int i3, int i10) {
        View D4 = D4(i3);
        if (!(D4 instanceof n5)) {
            return null;
        }
        return ((n5) D4).m(i10);
    }

    public final int[] R3(int i3) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.V3.size(); i11++) {
            int length = b6.z(((a) this.V3.get(i11)).f19431b).length();
            if (i3 <= i10 + length) {
                return new int[]{i11, i3 - i10};
            }
            i10 += length + 1;
        }
        int size = this.V3.size() - 1;
        return new int[]{size, b6.z(((a) this.V3.get(size)).f19431b).length()};
    }

    public final h1 S2() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return (h1) findFocus;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof b6) {
                return ((b6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int S3(int i3) {
        int i10 = 1;
        int i11 = i3 + 1;
        while (true) {
            ArrayList arrayList = this.f19924t3;
            if (i11 < arrayList.size()) {
                a aVar = (a) arrayList.get(i11);
                if (A3(aVar)) {
                    i10++;
                } else if (aVar.f19436i && i10 - 1 == 0) {
                    return i11;
                }
                i11++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final a T2() {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof b6) {
                b6 b6Var = (b6) childAt;
                if (b6Var.getEditText().isFocused() || (b6Var.n() && b6Var.h.isFocused())) {
                    return b6Var.getRow();
                }
            }
        }
        return null;
    }

    public final void T4() {
        boolean z10;
        int[] E4 = E4();
        if (E4 != null) {
            int i3 = E4[0];
            int i10 = E4[1];
            if (i3 >= 0) {
                ArrayList arrayList = this.f19924t3;
                if (i10 < arrayList.size() && i3 <= i10) {
                    g2 g2Var = this.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    if (K3(i3, i10)) {
                        for (int i11 = i3; i11 <= i10; i11++) {
                            a aVar = (a) arrayList.get(i11);
                            boolean z11 = aVar.f19436i;
                            ArrayList arrayList2 = aVar.f19438k;
                            if (!z11 && !A3(aVar)) {
                                if (b6.p(aVar.f19431b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f19431b.text;
                                    aVar.f19431b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    a1.g.y(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a10 = o0.a();
                        for (int i12 = i3; i12 <= i10; i12++) {
                            a aVar2 = (a) arrayList.get(i12);
                            boolean z12 = aVar2.f19436i;
                            ArrayList arrayList3 = aVar2.f19438k;
                            if (!z12 && !A3(aVar2)) {
                                if (b6.p(aVar2.f19431b)) {
                                    long a11 = o0.a();
                                    TL_iv.RichText j10 = b6.j(aVar2.f19431b);
                                    if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                                        this.f19926u3.put(Long.valueOf(a11), j10);
                                    }
                                    arrayList3.add(Long.valueOf(a11));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f19431b.text;
                                    aVar2.f19431b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a10));
                            }
                        }
                    }
                    A2();
                    Y3();
                    v4();
                    h3 h3Var = this.f19928v3;
                    if (h3Var != null && h3Var.x()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i3, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    this.f35594g3.O(false);
                    g2 g2Var2 = this.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    if (z10) {
                        post(new lg.y(this, aVar3, aVar4, 8));
                    } else {
                        post(new n2(this, aVar3, 9));
                    }
                }
            }
        }
    }

    public final n5 U2() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return X2((h1) findFocus);
        }
        return null;
    }

    public final void U4(mi.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.U4(mi.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final void V1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.V1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final TLRPC.Document V2(long j10) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.Document document2 = null;
        if (i3 == 0) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f19924t3.size(); i11++) {
            for (s sVar : T3((a) this.f19924t3.get(i11))) {
                if (sVar != null && (document = sVar.h) != null && document.f27007id == j10) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f19922s3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.Document document3 = arrayList.get(i10);
                i10++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f27007id == j10) {
                    return document4;
                }
            }
        }
        HashMap hashMap = u4.f19972a;
        synchronized (u4.class) {
            if (i3 != 0) {
                document2 = (TLRPC.Document) u4.f19973b.get(Long.valueOf(j10));
            }
        }
        return document2;
    }

    public final boolean V4() {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.V4():boolean");
    }

    public final int W2(int i3, int i10) {
        while (i3 >= 0) {
            ArrayList arrayList = this.f19924t3;
            if (i3 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i3);
            if (!aVar.f19436i) {
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < i3; i13++) {
                    a aVar2 = (a) arrayList.get(i13);
                    if (A3(aVar2)) {
                        i12++;
                        if (i11 == -1 && !((TL_iv.pageBlockDetails) aVar2.f19431b).open) {
                            i11 = i12;
                        }
                    } else if (aVar2.f19436i) {
                        if (i11 != -1 && i12 == i11) {
                            i11 = -1;
                        }
                        i12--;
                    }
                }
                if (i11 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f19431b;
                    if (!H3(pageBlock) || o3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i3;
                    }
                }
            }
            i3 += i10;
        }
        return -1;
    }

    public final boolean W4(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.W4(android.view.View, float, float):boolean");
    }

    public final void X1(a aVar, ye yeVar) {
        TL_iv.PageBlock pageblockvideo;
        t3 t3Var;
        if (aVar != null && G3(aVar.f19431b)) {
            String str = yeVar.h;
            if (str == null) {
                str = yeVar.I;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                g2 g2Var = this.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                s W3 = W3(yeVar, str2);
                boolean c2 = v4.c(yeVar);
                if (!yeVar.f25310b && !c2) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (E3(aVar.f19431b)) {
                    j3(aVar.f19431b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(W3);
                } else {
                    s sVar = aVar.f19435g;
                    if (sVar != null && sVar.f19859a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f19431b.caption;
                        k0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f19431b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f19435g);
                        aVar.h.add(W3);
                        aVar.f19435g = null;
                        aVar.f19431b = pageblockcollage;
                    } else {
                        aVar.f19431b = pageblockvideo;
                        aVar.f19435g = W3;
                    }
                }
                this.f35594g3.O(false);
                q4(aVar);
                if (c2) {
                    N4(aVar, W3, yeVar);
                    t3Var = this;
                } else {
                    t3Var = this;
                    t3Var.O4(aVar, W3, str2, yeVar.f25310b, yeVar.F, yeVar.G, yeVar.E);
                }
                g2 g2Var2 = t3Var.R3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                t3Var.f19916p3.onContentChanged();
            }
        }
    }

    public final a X3(int i3, int i10) {
        while (i3 >= 0) {
            ArrayList arrayList = this.f19933x4;
            if (i3 < arrayList.size()) {
                a aVar = (a) arrayList.get(i3);
                if (!aVar.f19436i) {
                    if (aVar.f19447t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f19431b;
                        if (H3(pageBlock) && !o3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    return aVar;
                }
                i3 += i10;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void X4(a aVar, TL_iv.PageBlock pageBlock, int i3, int i10, boolean z10, boolean z11) {
        Editable A;
        if (aVar == null) {
            aVar = a5();
        }
        a aVar2 = aVar;
        if (aVar2 != null && pageBlock != null) {
            ArrayList arrayList = this.f19924t3;
            if (arrayList.indexOf(aVar2) >= 0 && !A3(aVar2) && !aVar2.f19436i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f19431b;
                if (pageBlock != pageBlock2 && D3(pageBlock2) && D3(pageBlock)) {
                    b6 x22 = x2(arrayList.indexOf(aVar2));
                    if (x22 != null) {
                        A = x22.getEditText().getText();
                    } else {
                        A = b6.A(aVar2.f19431b);
                    }
                    b6.d(pageBlock, A);
                    TL_iv.RichText j10 = b6.j(aVar2.f19431b);
                    if (j10 != null && b6.j(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = j10;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = j10;
                        }
                    }
                }
                U4(aVar2, pageBlock, i3, i10, z10, z11);
            }
        }
    }

    public final void Y1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            g2 g2Var = this.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f19922s3;
            if (richMessage2 == null) {
                this.f19922s3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f19922s3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Z2(arrayList4, richMessage.blocks, this.f19926u3);
            if (!arrayList4.isEmpty()) {
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    y4((a) arrayList4.get(i3));
                }
                ArrayList arrayList5 = this.f19924t3;
                int size = arrayList5.size();
                a T2 = T2();
                if (T2 != null && (indexOf = arrayList5.indexOf(T2)) >= 0) {
                    TL_iv.PageBlock pageBlock = T2.f19431b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && b6.z(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                Y3();
                v4();
                this.f35594g3.O(false);
                g2 g2Var2 = this.R3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                r3 r3Var = this.f19916p3;
                if (r3Var != null) {
                    r3Var.onContentChanged();
                }
            }
        }
    }

    public final void Y2() {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof b6) {
                b6 b6Var = (b6) childAt;
                b6Var.f19485f.J();
                b6Var.h.J();
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().J();
            } else if (childAt instanceof s0) {
                ((s0) childAt).getEditText().J();
            }
        }
    }

    public final void Y3() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f19924t3;
            if (i3 < arrayList.size()) {
                a aVar = (a) arrayList.get(i3);
                if (!aVar.f19438k.isEmpty() && b6.p(aVar.f19431b)) {
                    long a10 = o0.a();
                    TL_iv.RichText j10 = b6.j(aVar.f19431b);
                    if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                        this.f19926u3.put(Long.valueOf(a10), j10);
                    }
                    aVar.f19438k.add(Long.valueOf(a10));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f19431b.text;
                    aVar.f19431b = pageblockparagraph;
                }
                i3++;
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
        X4(aVar2, pageBlock, aVar2.f19432c, aVar2.d, aVar2.f19433e, aVar2.f19434f);
    }

    public final a Z1(a aVar, int i3) {
        int i10;
        ArrayList arrayList = this.f19933x4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i10 = indexOf + i3) >= 0 && i10 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i10);
            if (aVar2.f19447t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final boolean Z3(mi.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.Z3(mi.a, boolean):boolean");
    }

    public final void Z4(a aVar, int i3) {
        int i10;
        boolean z10;
        boolean z11;
        t3 t3Var;
        TL_iv.PageBlock pageBlock;
        if (aVar == null) {
            aVar = a5();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i3 == 0) {
            X4(aVar2, aVar2.f19431b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f19432c);
        if (i3 == 2) {
            i10 = Math.max(1, aVar2.d);
        } else {
            i10 = 0;
        }
        if (i3 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_iv.PageBlock pageBlock2 = aVar2.f19431b;
        if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
            pageBlock2 = new TL_iv.pageBlockParagraph();
        }
        if (z10 && aVar2.f19434f) {
            z11 = true;
            pageBlock = pageBlock2;
            t3Var = this;
        } else {
            z11 = false;
            t3Var = this;
            pageBlock = pageBlock2;
        }
        t3Var.X4(aVar2, pageBlock, max, i10, z10, z11);
    }

    public final boolean a2(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.a2(int, int, int, int, java.lang.String[]):boolean");
    }

    public final void a4() {
        int length;
        int C;
        int A;
        int length2;
        int C2;
        int A2;
        int length3;
        int C3;
        int A3;
        int length4;
        int C4;
        int A5;
        h1 Q4;
        int length5;
        int C5;
        int A6;
        boolean O3 = O3();
        h3 h3Var = this.f19928v3;
        if (O3) {
            int i3 = h3Var.f29352p0;
            int i10 = h3Var.f29353q0;
            if (i10 == h3Var.f29356t0 && (Q4 = Q4(i3, i10)) != null && (C5 = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length5 = Q4.length()), 0)) < (A6 = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length5, 0))) {
                g2 g2Var = this.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                if (d6.h(Q4.getText(), C5, A6)) {
                    d6.n(Q4.getText(), C5, A6);
                    Q4.f();
                    j4(i3, i10);
                    g2 g2Var2 = this.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    r4();
                }
                Q4.P1 = C5;
                Q4.Q1 = A6;
                Q4.B();
            }
        } else if (B3()) {
            int i11 = h3Var.f29352p0;
            h1 L2 = L2(i11);
            if (L2 != null && (C4 = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length4 = L2.length()), 0)) < (A5 = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length4, 0))) {
                g2 g2Var3 = this.R3;
                if (g2Var3 != null) {
                    g2Var3.d();
                }
                if (d6.h(L2.getText(), C4, A5)) {
                    d6.n(L2.getText(), C4, A5);
                    L2.f();
                    h4(i11);
                    g2 g2Var4 = this.R3;
                    if (g2Var4 != null) {
                        g2Var4.h();
                    }
                    r4();
                }
                L2.P1 = C4;
                L2.Q1 = A5;
                L2.B();
            }
        } else if (z3()) {
            int i12 = h3Var.f29352p0;
            h1 v22 = v2(i12);
            if (v22 != null && (C3 = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length3 = v22.length()), 0)) < (A3 = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length3, 0))) {
                g2 g2Var5 = this.R3;
                if (g2Var5 != null) {
                    g2Var5.d();
                }
                if (d6.h(v22.getText(), C3, A3)) {
                    d6.n(v22.getText(), C3, A3);
                    v22.f();
                    g4(i12);
                    g2 g2Var6 = this.R3;
                    if (g2Var6 != null) {
                        g2Var6.h();
                    }
                    r4();
                }
                v22.P1 = C3;
                v22.Q1 = A3;
                v22.B();
            }
        } else if (J3()) {
            int i13 = h3Var.f29352p0;
            h1 m42 = m4(i13);
            if (m42 != null && (C2 = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length2 = m42.length()), 0)) < (A2 = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length2, 0))) {
                g2 g2Var7 = this.R3;
                if (g2Var7 != null) {
                    g2Var7.d();
                }
                if (d6.h(m42.getText(), C2, A2)) {
                    d6.n(m42.getText(), C2, A2);
                    m42.f();
                    i4(i13);
                    g2 g2Var8 = this.R3;
                    if (g2Var8 != null) {
                        g2Var8.h();
                    }
                    r4();
                }
                m42.P1 = C2;
                m42.Q1 = A2;
                m42.B();
            }
        } else {
            b6 J4 = J4();
            if (J4 == null || (C = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length = J4.getEditText().length()), 0)) >= (A = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length, 0))) {
                return;
            }
            g2 g2Var9 = this.R3;
            if (g2Var9 != null) {
                g2Var9.d();
            }
            if (d6.h(J4.getEditText().getText(), C, A)) {
                d6.n(J4.getEditText().getText(), C, A);
                J4.getEditText().f();
                J4.x();
                g2 g2Var10 = this.R3;
                if (g2Var10 != null) {
                    g2Var10.h();
                }
                r4();
            }
            h1 editText = J4.getEditText();
            editText.P1 = C;
            editText.Q1 = A;
            J4.getEditText().B();
        }
    }

    public final a a5() {
        h3 h3Var;
        int i3;
        a T2 = T2();
        if (T2 == null && (h3Var = this.f19928v3) != null && h3Var.x() && (i3 = h3Var.f29352p0) == h3Var.f29355s0) {
            return B4(i3);
        }
        return T2;
    }

    public final void b2() {
        b6 b6Var;
        a aVar;
        y5 y5Var;
        this.f35594g3.T();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt instanceof b6) && (aVar = (b6Var = (b6) childAt).f19491y) != null && (y5Var = b6Var.E) != null) {
                b6Var.f(aVar, y5Var, b6Var.F);
            }
        }
    }

    public final ArrayList b3(int i3, int i10, int i11, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z11;
        t3 t3Var;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        int i14 = i3;
        while (i14 < i10) {
            ArrayList arrayList2 = this.f19924t3;
            a aVar = (a) arrayList2.get(i14);
            boolean z12 = aVar.f19436i;
            ArrayList arrayList3 = aVar.f19438k;
            if (z12) {
                i14++;
            } else if (arrayList3.size() > i11) {
                Long l10 = (Long) arrayList3.get(i11);
                long longValue = l10.longValue();
                int i15 = i14 + 1;
                while (i15 < i10) {
                    a aVar2 = (a) arrayList2.get(i15);
                    if (aVar2.f19438k.size() <= i11 || ((Long) aVar2.f19438k.get(i11)).longValue() != longValue) {
                        break;
                    }
                    i15++;
                }
                ArrayList<TL_iv.PageBlock> b32 = b3(i14, i15, i11 + 1, true);
                if (b32.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f19926u3.get(l10);
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
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f19431b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int S3 = S3(i14);
                pageblockdetails.blocks = b3(i14 + 1, Math.min(S3, i10), i11, true);
                arrayList.add(pageblockdetails);
                i14 = S3 + 1;
            } else {
                int i16 = aVar.f19432c;
                if (i16 <= 0) {
                    M2(arrayList, aVar);
                    i14++;
                    i12 = i10;
                    i13 = i11;
                } else {
                    int[] iArr = {i14};
                    if (aVar.d > 0) {
                        z11 = true;
                        i12 = i10;
                        i13 = i11;
                        t3Var = this;
                    } else {
                        z11 = false;
                        t3Var = this;
                        i12 = i10;
                        i13 = i11;
                    }
                    TL_iv.PageBlock n22 = t3Var.n2(i14, i16, i12, i13, z11, iArr);
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
        if (!z10) {
            while (!arrayList.isEmpty() && C3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && C3((TL_iv.PageBlock) k2.p1.h(1, arrayList))) {
                a1.g.y(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void b4(int i3) {
        int i10;
        g2 g2Var;
        int i11;
        boolean z10;
        int i12;
        int i13;
        SpannableStringBuilder spannableStringBuilder;
        int i14;
        int length;
        int C;
        int A;
        boolean z11;
        int i15;
        int length2;
        int C2;
        int A2;
        boolean z12;
        int i16;
        int length3;
        int C3;
        int A3;
        boolean z13;
        int i17;
        g2 g2Var2;
        int i18;
        int i19;
        int i20;
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x()) {
            boolean O3 = O3();
            r3 r3Var = this.f19916p3;
            int i21 = 0;
            if (O3) {
                int i22 = h3Var.f29352p0;
                int i23 = h3Var.f29353q0;
                int i24 = h3Var.f29356t0;
                int i25 = h3Var.f29354r0;
                int i26 = h3Var.f29357u0;
                boolean N3 = N3(i3, i22, i23, i25, i24, i26);
                if (!N3) {
                    i17 = z2(i3);
                } else {
                    i17 = 0;
                }
                g2 g2Var3 = this.R3;
                if (g2Var3 != null) {
                    g2Var3.d();
                }
                this.Q3 = true;
                int i27 = i23;
                boolean z14 = false;
                while (i27 <= i24) {
                    h1 Q4 = Q4(i22, i27);
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
                                Q4.a(i3, max, max2);
                            } else {
                                Q4.b(i3, max, max2);
                            }
                            Q4.f();
                            Q4.requestLayout();
                            j4(i22, i27);
                            z14 = true;
                        }
                    }
                    i27++;
                    i23 = i20;
                }
                this.Q3 = false;
                if (z14 && (g2Var2 = this.R3) != null) {
                    g2Var2.h();
                }
                r3Var.a0();
                if (z14) {
                    r4();
                }
            } else if (B3()) {
                int i29 = h3Var.f29352p0;
                h1 L2 = L2(i29);
                if (L2 != null && (C3 = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length3 = L2.length()), 0)) < (A3 = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length3, 0))) {
                    if ((L2.c(C3, A3) & i3) == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    g2 g2Var4 = this.R3;
                    if (g2Var4 != null) {
                        g2Var4.d();
                    }
                    this.Q3 = true;
                    if (z13) {
                        int z22 = z2(i3);
                        if (z22 != 0) {
                            L2.b(z22, C3, A3);
                        }
                        L2.a(i3, C3, A3);
                    } else {
                        L2.b(i3, C3, A3);
                    }
                    this.Q3 = false;
                    h4(i29);
                    L2.f();
                    L2.requestLayout();
                    g2 g2Var5 = this.R3;
                    if (g2Var5 != null) {
                        g2Var5.h();
                    }
                    r3Var.a0();
                    r4();
                }
            } else if (z3()) {
                int i30 = h3Var.f29352p0;
                h1 v22 = v2(i30);
                if (v22 != null && (C2 = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length2 = v22.length()), 0)) < (A2 = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length2, 0))) {
                    if ((v22.c(C2, A2) & i3) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i16 = z2(i3);
                    } else {
                        i16 = 0;
                    }
                    g2 g2Var6 = this.R3;
                    if (g2Var6 != null) {
                        g2Var6.d();
                    }
                    this.Q3 = true;
                    if (z12) {
                        if (i16 != 0) {
                            v22.b(i16, C2, A2);
                        }
                        v22.a(i3, C2, A2);
                    } else {
                        v22.b(i3, C2, A2);
                    }
                    v22.f();
                    v22.requestLayout();
                    g4(i30);
                    this.Q3 = false;
                    g2 g2Var7 = this.R3;
                    if (g2Var7 != null) {
                        g2Var7.h();
                    }
                    r3Var.a0();
                    r4();
                }
            } else if (J3()) {
                int i31 = h3Var.f29352p0;
                h1 m42 = m4(i31);
                if (m42 != null && (C = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length = m42.length()), 0)) < (A = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length, 0))) {
                    if ((m42.c(C, A) & i3) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i15 = z2(i3);
                    } else {
                        i15 = 0;
                    }
                    g2 g2Var8 = this.R3;
                    if (g2Var8 != null) {
                        g2Var8.d();
                    }
                    this.Q3 = true;
                    if (z11) {
                        if (i15 != 0) {
                            m42.b(i15, C, A);
                        }
                        m42.a(i3, C, A);
                    } else {
                        m42.b(i3, C, A);
                    }
                    m42.f();
                    m42.requestLayout();
                    i4(i31);
                    this.Q3 = false;
                    g2 g2Var9 = this.R3;
                    if (g2Var9 != null) {
                        g2Var9.h();
                    }
                    r3Var.a0();
                    r4();
                }
            } else {
                int i32 = h3Var.f29352p0;
                int i33 = h3Var.f29355s0;
                int i34 = h3Var.f29354r0;
                int i35 = h3Var.f29357u0;
                if (i32 >= 0 && i33 >= 0 && i33 >= i32 && i33 < this.f19933x4.size()) {
                    int i36 = i3;
                    boolean M3 = M3(i36, i32, i34, i33, i35);
                    boolean z15 = !M3;
                    if (!M3) {
                        i10 = z2(i36);
                    } else {
                        i10 = 0;
                    }
                    g2 g2Var10 = this.R3;
                    if (g2Var10 != null) {
                        g2Var10.d();
                    }
                    this.Q3 = true;
                    int i37 = i32;
                    boolean z16 = false;
                    while (i37 <= i33) {
                        a B4 = B4(i37);
                        if (B4 != null) {
                            TL_iv.PageBlock pageBlock = B4.f19431b;
                            if (D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int l22 = l2(i37);
                                if (i37 == i32) {
                                    i12 = i34;
                                } else {
                                    i12 = i21;
                                }
                                z10 = z16;
                                if (i37 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = l22;
                                }
                                int max3 = Math.max(i21, Math.min(i12, l22));
                                int max4 = Math.max(i21, Math.min(i13, l22));
                                if (max3 >= max4) {
                                    i11 = i10;
                                    z16 = z10;
                                    i37++;
                                    i36 = i3;
                                    i10 = i11;
                                    i21 = 0;
                                } else {
                                    b6 x22 = x2(i37);
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
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(b6.A(B4.f19431b));
                                        if (!M3 && i10 != 0) {
                                            i11 = i10;
                                            i14 = max3;
                                            d6.o(spannableStringBuilder2, i14, max4, i11, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i11 = i10;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i14 = max3;
                                        }
                                        d6.o(spannableStringBuilder, i14, max4, i36, z15, null);
                                        b6.d(B4.f19431b, spannableStringBuilder);
                                    }
                                    z16 = true;
                                    i37++;
                                    i36 = i3;
                                    i10 = i11;
                                    i21 = 0;
                                }
                            }
                        }
                        i11 = i10;
                        z10 = z16;
                        z16 = z10;
                        i37++;
                        i36 = i3;
                        i10 = i11;
                        i21 = 0;
                    }
                    boolean z17 = z16;
                    this.Q3 = i21;
                    if (z17 && (g2Var = this.R3) != null) {
                        g2Var.h();
                    }
                    r3Var.a0();
                    if (z17) {
                        r4();
                    }
                }
            }
        }
    }

    public final void b5(float f10, float f11) {
        TL_iv.pageTableCell n4;
        n5 n5Var = this.f19919q4;
        if (this.J3 && n5Var != null && this.F3 == n5Var && (n4 = n5Var.n((int) ((f10 - n5Var.getLeft()) - getLeft()), (int) ((f11 - n5Var.getTop()) - getTop()))) != null && n4 != this.M3) {
            this.M3 = n4;
            n5Var.y(this.L3, n4);
        }
    }

    public final boolean c2(int i3, int i10) {
        h3 h3Var;
        ArrayList arrayList = this.V3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i3, i10));
            int max2 = Math.max(0, Math.max(i3, i10));
            int[] R3 = R3(max);
            int[] R32 = R3(max2);
            a aVar = (a) this.V3.get(R3[0]);
            if (R3[0] != R32[0] && max != max2) {
                View C1 = C1(aVar);
                View C12 = C1(this.V3.get(R32[0]));
                if ((C1 instanceof b6) && (C12 instanceof b6)) {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f19924t3;
                        int size = arrayList2.size();
                        h3Var = this.f19928v3;
                        if (i11 >= size) {
                            break;
                        }
                        h3Var.X(i11, b6.z(((a) arrayList2.get(i11)).f19431b));
                        i11++;
                    }
                    b6 b6Var = (b6) C1;
                    int length = b6Var.getEditText().length();
                    if (R3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!h3Var.j0(b6Var, 0, R3[1], length)) {
                        b6Var.B();
                        return true;
                    }
                    h3Var.b0(0, R32[1], (b6) C12);
                    return true;
                }
            } else {
                View C13 = C1(aVar);
                if (C13 instanceof b6) {
                    b6 b6Var2 = (b6) C13;
                    b6Var2.B();
                    h1 editText = b6Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(R3[1], length2), Math.min(R32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList c3() {
        return b3(0, this.f19924t3.size(), 0, false);
    }

    public final void c4(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.c4(android.view.View):void");
    }

    public final void c5() {
        b6 b6Var;
        a aVar;
        y5 y5Var;
        u4.m0 itemAnimator = getItemAnimator();
        setItemAnimator(null);
        this.f35594g3.O(true);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt instanceof b6) && (aVar = (b6Var = (b6) childAt).f19491y) != null && (y5Var = b6Var.E) != null) {
                b6Var.f(aVar, y5Var, b6Var.F);
            }
        }
        post(new x2(this, itemAnimator, 2));
    }

    public final void d2() {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        int i15;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i16 = 0;
        int i17 = 0;
        while (true) {
            ArrayList arrayList6 = this.f19924t3;
            if (i17 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i17);
                ArrayList arrayList7 = aVar.f19437j;
                ArrayList arrayList8 = aVar.f19438k;
                arrayList7.clear();
                int i18 = 1;
                if (aVar.f19436i) {
                    if (!arrayList.isEmpty()) {
                        a1.g.y(1, arrayList);
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
                        arrayList7.add((o0) arrayList.get(i20));
                    }
                    int max = Math.max(i16, aVar.f19432c);
                    if (max == 0) {
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    } else {
                        if (aVar.d > 0) {
                            i3 = 1;
                        } else {
                            i3 = i16;
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
                                if (((Boolean) arrayList3.get(i22)).booleanValue() != i3) {
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
                                arrayList2.add(Long.valueOf(o0.a()));
                                if (i10 != 0) {
                                    z10 = i3;
                                } else {
                                    z10 = i11;
                                }
                                arrayList3.add(Boolean.valueOf(z10));
                                arrayList4.add(Integer.valueOf(i11));
                                arrayList5.add(0L);
                            }
                            ((Long) arrayList2.get(i22)).getClass();
                            if (i10 != 0) {
                                if (((Long) arrayList5.get(i22)).longValue() != 0 && H3(aVar.f19431b)) {
                                    i14 = i11;
                                } else {
                                    i14 = i13;
                                }
                                if (i14 != 0) {
                                    arrayList4.set(i22, Integer.valueOf(((Integer) arrayList4.get(i22)).intValue() + 1));
                                    arrayList5.set(i22, Long.valueOf(aVar.f19430a));
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
                        boolean z11 = ((TL_iv.pageBlockDetails) aVar.f19431b).open;
                        o0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (b6.p(aVar.f19431b)) {
                        o0.a();
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
        ArrayList arrayList = this.f19924t3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) k2.p1.h(1, arrayList);
        }
        if (aVar != null && !H3(aVar.f19431b) && !aVar.f19436i && !A3(aVar) && !N2(aVar.f19431b)) {
            if (!(C1(aVar) instanceof b6)) {
                return false;
            }
            h3(aVar);
            return true;
        }
        g2 g2Var = this.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.f35594g3.O(false);
        g2 g2Var2 = this.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        post(new n2(this, aVar2, 21));
        return true;
    }

    public final void d4() {
        int length;
        int C;
        int A;
        int length2;
        int C2;
        int A2;
        int length3;
        int C3;
        int A3;
        int length4;
        int C4;
        int A5;
        h1 Q4;
        int length5;
        int C5;
        int A6;
        boolean O3 = O3();
        r3 r3Var = this.f19916p3;
        h3 h3Var = this.f19928v3;
        if (O3) {
            int i3 = h3Var.f29352p0;
            int i10 = h3Var.f29353q0;
            if (i10 == h3Var.f29356t0 && (Q4 = Q4(i3, i10)) != null && (C5 = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length5 = Q4.length()), 0)) < (A6 = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length5, 0))) {
                if (d6.h(Q4.getText(), C5, A6)) {
                    g2 g2Var = this.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    d6.n(Q4.getText(), C5, A6);
                    Q4.f();
                    j4(i3, i10);
                    g2 g2Var2 = this.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    r3Var.a0();
                    r4();
                    return;
                }
                g2 g2Var3 = this.R3;
                if (g2Var3 != null) {
                    g2Var3.d();
                }
                if (d6.g(Q4.getText(), C5, A6)) {
                    d6.m(Q4.getText(), C5, A6);
                    Q4.f();
                    j4(i3, i10);
                    g2 g2Var4 = this.R3;
                    if (g2Var4 != null) {
                        g2Var4.h();
                    }
                    r4();
                }
                Q4.P1 = C5;
                Q4.Q1 = A6;
                r3(false);
                H4(Q4);
            }
        } else if (B3()) {
            int i11 = h3Var.f29352p0;
            h1 L2 = L2(i11);
            if (L2 != null && (C4 = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length4 = L2.length()), 0)) < (A5 = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length4, 0))) {
                if (d6.h(L2.getText(), C4, A5)) {
                    g2 g2Var5 = this.R3;
                    if (g2Var5 != null) {
                        g2Var5.d();
                    }
                    d6.n(L2.getText(), C4, A5);
                    L2.f();
                    h4(i11);
                    g2 g2Var6 = this.R3;
                    if (g2Var6 != null) {
                        g2Var6.h();
                    }
                    r3Var.a0();
                    r4();
                    return;
                }
                g2 g2Var7 = this.R3;
                if (g2Var7 != null) {
                    g2Var7.d();
                }
                if (d6.g(L2.getText(), C4, A5)) {
                    d6.m(L2.getText(), C4, A5);
                    L2.f();
                    h4(i11);
                    g2 g2Var8 = this.R3;
                    if (g2Var8 != null) {
                        g2Var8.h();
                    }
                    r4();
                }
                L2.P1 = C4;
                L2.Q1 = A5;
                r3(false);
                H4(L2);
            }
        } else if (z3()) {
            int i12 = h3Var.f29352p0;
            h1 v22 = v2(i12);
            if (v22 != null && (C3 = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length3 = v22.length()), 0)) < (A3 = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length3, 0))) {
                if (d6.h(v22.getText(), C3, A3)) {
                    g2 g2Var9 = this.R3;
                    if (g2Var9 != null) {
                        g2Var9.d();
                    }
                    d6.n(v22.getText(), C3, A3);
                    v22.f();
                    g4(i12);
                    g2 g2Var10 = this.R3;
                    if (g2Var10 != null) {
                        g2Var10.h();
                    }
                    r3Var.a0();
                    r4();
                    return;
                }
                g2 g2Var11 = this.R3;
                if (g2Var11 != null) {
                    g2Var11.d();
                }
                if (d6.g(v22.getText(), C3, A3)) {
                    d6.m(v22.getText(), C3, A3);
                    v22.f();
                    g4(i12);
                    g2 g2Var12 = this.R3;
                    if (g2Var12 != null) {
                        g2Var12.h();
                    }
                    r4();
                }
                v22.P1 = C3;
                v22.Q1 = A3;
                r3(false);
                H4(v22);
            }
        } else if (J3()) {
            int i13 = h3Var.f29352p0;
            h1 m42 = m4(i13);
            if (m42 != null && (C2 = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length2 = m42.length()), 0)) < (A2 = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length2, 0))) {
                if (d6.h(m42.getText(), C2, A2)) {
                    g2 g2Var13 = this.R3;
                    if (g2Var13 != null) {
                        g2Var13.d();
                    }
                    d6.n(m42.getText(), C2, A2);
                    m42.f();
                    i4(i13);
                    g2 g2Var14 = this.R3;
                    if (g2Var14 != null) {
                        g2Var14.h();
                    }
                    r3Var.a0();
                    r4();
                    return;
                }
                g2 g2Var15 = this.R3;
                if (g2Var15 != null) {
                    g2Var15.d();
                }
                if (d6.g(m42.getText(), C2, A2)) {
                    d6.m(m42.getText(), C2, A2);
                    m42.f();
                    i4(i13);
                    g2 g2Var16 = this.R3;
                    if (g2Var16 != null) {
                        g2Var16.h();
                    }
                    r4();
                }
                m42.P1 = C2;
                m42.Q1 = A2;
                r3(false);
                H4(m42);
            }
        } else {
            b6 J4 = J4();
            if (J4 == null || (C = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length = J4.getEditText().length()), 0)) >= (A = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length, 0))) {
                return;
            }
            if (d6.h(J4.getEditText().getText(), C, A)) {
                g2 g2Var17 = this.R3;
                if (g2Var17 != null) {
                    g2Var17.d();
                }
                d6.n(J4.getEditText().getText(), C, A);
                J4.getEditText().f();
                J4.x();
                g2 g2Var18 = this.R3;
                if (g2Var18 != null) {
                    g2Var18.h();
                }
                r3Var.a0();
                r4();
                return;
            }
            g2 g2Var19 = this.R3;
            if (g2Var19 != null) {
                g2Var19.d();
            }
            if (d6.g(J4.getEditText().getText(), C, A)) {
                d6.m(J4.getEditText().getText(), C, A);
                J4.getEditText().f();
                J4.x();
                g2 g2Var20 = this.R3;
                if (g2Var20 != null) {
                    g2Var20.h();
                }
                r4();
            }
            h1 editText = J4.getEditText();
            editText.P1 = C;
            editText.Q1 = A;
            r3(false);
            H4(J4.getEditText());
        }
    }

    public final void d5(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    g2 g2Var = this.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    b6 x22 = x2(this.f19924t3.indexOf(aVar));
                    if (x22 != null && (aVar2 = x22.f19491y) != null) {
                        x22.J(aVar2.f19431b, true);
                        x22.I = null;
                        x22.C();
                    }
                    g2 g2Var2 = this.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i3;
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
        boolean z10;
        a aVar5;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                arrayList = this.f19933x4;
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
                    ArrayList arrayList3 = aVar5.f19438k;
                    if (arrayList3.size() > i13) {
                        i13 = arrayList3.size();
                    }
                }
                i12++;
            }
            if (i13 != 0) {
                if (this.f19935y4 == null) {
                    dk0 dk0Var = new dk0(this);
                    this.f19935y4 = dk0Var;
                    dk0Var.a(null, null, null, this.f19914o3, 1);
                    ne.a(this.f19935y4, this.f19914o3);
                }
                int i14 = 0;
                while (i14 < i13) {
                    float f11 = 0.0f;
                    long j10 = 0;
                    int i15 = 0;
                    boolean z11 = false;
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
                                ArrayList arrayList4 = aVar.f19438k;
                                if (i14 < arrayList4.size()) {
                                    l10 = (Long) arrayList4.get(i14);
                                    i3 = childCount;
                                    view = childAt;
                                }
                            }
                            i3 = childCount;
                            view = childAt;
                            l10 = null;
                        } else {
                            i3 = childCount;
                            l10 = null;
                            aVar = null;
                            view = null;
                        }
                        if (!z11 || (l10 != null && l10.longValue() == j10)) {
                            l11 = l10;
                            i10 = i14;
                            i11 = i13;
                            arrayList2 = arrayList;
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                            f10 = f12;
                        } else {
                            int n4 = n4(i14, aVar6, true);
                            l11 = l10;
                            int n42 = n4(i14, aVar7, false);
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
                                int z12 = org.telegram.messenger.k5.z(16.0f, getWidth(), L);
                                if (z12 - L2 > org.telegram.messenger.g0.L(8.0f)) {
                                    float floor = (float) Math.floor(az.Y0 / 3.0f);
                                    RectF rectF = org.telegram.messenger.g0.P;
                                    rectF.set(L2, n4 + f11, z12, f13 - n42);
                                    aVar2 = aVar6;
                                    aVar3 = aVar7;
                                    this.f19935y4.c(floor, floor, floor, f12, canvas, rectF);
                                    f10 = f12;
                                    this.f19935y4.f(canvas, rectF, f10);
                                    z11 = false;
                                }
                            }
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                            f10 = f12;
                            z11 = false;
                        }
                        if (view != null && l11 != null) {
                            if (!z11) {
                                j10 = l11.longValue();
                                f11 = Float.MAX_VALUE;
                                f13 = -3.4028235E38f;
                                aVar4 = aVar;
                                z10 = true;
                                f10 = 1.0f;
                            } else {
                                aVar4 = aVar2;
                                z10 = z11;
                            }
                            if (aVar != null && aVar == this.f19900a4) {
                                z11 = z10;
                                f12 = f10;
                            } else {
                                float y9 = view.getY();
                                float height = view.getHeight() + y9;
                                if (y9 < f11) {
                                    f11 = y9;
                                }
                                if (height > f13) {
                                    f13 = height;
                                }
                                f12 = Math.min(f10, view.getAlpha());
                                z11 = z10;
                            }
                            aVar7 = aVar;
                        } else {
                            aVar7 = aVar3;
                            f12 = f10;
                            aVar4 = aVar2;
                        }
                        i15++;
                        aVar6 = aVar4;
                        childCount = i3;
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

    public final void e2(zi ziVar) {
        TLRPC.Document F0;
        String str;
        if (ziVar != null && (F0 = ziVar.F0()) != null) {
            g2 g2Var = this.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z10 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            s sVar = new s();
            aVar.f19435g = sVar;
            sVar.f19861c = true;
            long j10 = F0.f27007id;
            if (j10 == 0 || F0.dc_id == 0 || F0.access_hash == 0) {
                z10 = true;
            }
            if (z10) {
                TLRPC.Message message = ziVar.f26868k;
                if (message != null) {
                    str = message.attachPath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                s sVar2 = aVar.f19435g;
                sVar2.f19865i = F0;
                sVar2.f19862e = str;
                sVar2.f19859a = 1;
                sVar2.f19863f = 0.0f;
            } else {
                sVar.h = F0;
                sVar.f19865i = F0;
                sVar.f19859a = 2;
                pageblockaudio.audio_id = j10;
            }
            x3(aVar);
            if (z10) {
                s sVar3 = aVar.f19435g;
                String str2 = sVar3.f19862e;
                IdentityHashMap identityHashMap = this.f19907h4;
                z4 z4Var = (z4) identityHashMap.remove(sVar3);
                if (z4Var != null) {
                    z4Var.b();
                }
                z4 z4Var2 = new z4(this.f19913n3, str2, F0, new f3(aVar, sVar3, this));
                identityHashMap.put(sVar3, z4Var2);
                z4Var2.d();
            }
            g2 g2Var2 = this.R3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            this.f19916p3.onContentChanged();
        }
    }

    public final void e3(a aVar, boolean z10) {
        int i3;
        View C1 = C1(aVar);
        if (C1 instanceof f5) {
            h1 h1Var = ((f5) C1).f19604r;
            h1Var.N();
            if (z10) {
                i3 = h1Var.length();
            } else {
                i3 = 0;
            }
            h1Var.setSelection(i3);
            return;
        }
        f3(aVar, z10);
    }

    public final void e4() {
        h1 editText;
        Runnable j2Var;
        int length;
        final int C;
        final int A;
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x()) {
            if (O3()) {
                int i3 = h3Var.f29352p0;
                int i10 = h3Var.f29353q0;
                if (i10 == h3Var.f29356t0) {
                    editText = Q4(i3, i10);
                    j2Var = new o2(this, i3, i10, 1);
                } else {
                    return;
                }
            } else if (B3()) {
                int i11 = h3Var.f29352p0;
                editText = L2(i11);
                j2Var = new i2(this, i11, 3);
            } else if (z3()) {
                int i12 = h3Var.f29352p0;
                editText = v2(i12);
                j2Var = new i2(this, i12, 0);
            } else if (J3()) {
                int i13 = h3Var.f29352p0;
                editText = m4(i13);
                j2Var = new i2(this, i13, 1);
            } else {
                b6 J4 = J4();
                if (J4 != null) {
                    editText = J4.getEditText();
                    j2Var = new j2(J4, 0);
                } else {
                    return;
                }
            }
            final h1 h1Var = editText;
            final Runnable runnable = j2Var;
            if (h1Var != null && (C = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length = h1Var.length()), 0)) <= (A = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length, 0))) {
                Editable text = h1Var.getText();
                int i14 = r.h;
                String str = null;
                if (text != null) {
                    r[] rVarArr = (r[]) text.getSpans(C, A, r.class);
                    if (rVarArr.length > 0) {
                        str = rVarArr[0].f19844a;
                    }
                }
                if (str == null) {
                    str = h1Var.getText().subSequence(C, A).toString();
                }
                final float L = org.telegram.messenger.g0.L(az.W0 + 4);
                int i15 = k6.G6;
                org.telegram.ui.ActionBar.e6 e6Var = this.f19914o3;
                final int w02 = k6.w0(i15, e6Var);
                p.Z(getContext(), str, new u10() {
                    @Override
                    public final void a(Object obj) {
                        r a10;
                        String str2 = (String) obj;
                        t3 t3Var = t3.this;
                        t3Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a10 = r.a(str2, w02, L)) == null) {
                            return;
                        }
                        g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        h3 h3Var2 = t3Var.f19928v3;
                        if (h3Var2 != null) {
                            h3Var2.f(false);
                        }
                        h1 h1Var2 = h1Var;
                        h1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a10, 0, 1, 33);
                        Editable text2 = h1Var2.getText();
                        int max = Math.max(0, Math.min(C, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(A, text2.length())), spannableString);
                        runnable.run();
                        g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        t3Var.f19916p3.onContentChanged();
                        int min = Math.min(max + 1, h1Var2.length());
                        h1Var2.N();
                        t3Var.post(new u2(h1Var2, min, 3));
                    }
                }, e6Var);
            }
        }
    }

    public final void f2(String str) {
        String str2;
        int i3;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.f27007id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf >= 0 && (i3 = lastIndexOf + 1) < name.length()) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i3).toLowerCase());
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
        if (C1 instanceof n5) {
            n5 n5Var = (n5) C1;
            h1 h1Var = n5Var.f19769r;
            f6 f6Var = n5Var.G;
            if (f6Var != null) {
                if (!z10) {
                    h1Var.N();
                    h1Var.setSelection(0);
                    return;
                } else if (!f6Var.f19613g.isEmpty()) {
                    q5 m10 = n5Var.f19771w.m((TL_iv.pageTableCell) k2.p1.h(1, n5Var.G.f19613g));
                    if (m10 != null) {
                        h1 h1Var2 = m10.f19842a;
                        h1Var2.N();
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
        if (z10 && (C1 instanceof b6)) {
            b6 b6Var = (b6) C1;
            if (b6Var.n()) {
                b6Var.h();
                return;
            }
        }
        h1 U3 = U3(C1);
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
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.f4():void");
    }

    public final void f5(java.lang.CharSequence r19) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.f5(java.lang.CharSequence):void");
    }

    public final void g2(TLRPC.Document document, String str) {
        if (document != null) {
            g2 g2Var = this.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z10 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            s sVar = new s();
            aVar.f19435g = sVar;
            sVar.d = true;
            long j10 = document.f27007id;
            if (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) {
                z10 = true;
            }
            if (z10) {
                if (!TextUtils.isEmpty(str) && t4.c.p(str)) {
                    s sVar2 = aVar.f19435g;
                    sVar2.h = document;
                    sVar2.f19862e = str;
                    sVar2.f19859a = 1;
                    sVar2.f19863f = 0.0f;
                } else {
                    return;
                }
            } else {
                sVar.h = document;
                sVar.f19859a = 2;
                pageblockdocument.document_id = j10;
            }
            x3(aVar);
            if (z10) {
                s sVar3 = aVar.f19435g;
                IdentityHashMap identityHashMap = this.f19907h4;
                z4 z4Var = (z4) identityHashMap.remove(sVar3);
                if (z4Var != null) {
                    z4Var.b();
                }
                z4 z4Var2 = new z4(this.f19913n3, str, document, new e3(this, sVar3, aVar, str));
                identityHashMap.put(sVar3, z4Var2);
                z4Var2.d();
            }
            g2 g2Var2 = this.R3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            this.f19916p3.onContentChanged();
        }
    }

    public final void g3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof b6) {
            ((b6) C1).B();
        } else if (C1 instanceof s0) {
            ((s0) C1).d.N();
        }
    }

    public final void g4(int i3) {
        View D4 = D4(i3);
        if (D4 instanceof l0) {
            ((l0) D4).b();
        }
    }

    public h1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return (h1) findFocus;
        }
        return null;
    }

    public l4 getMapDelegate() {
        return this.f19911l4;
    }

    public View getOverlayView() {
        return this.f19930w3;
    }

    public h9 getTextSelectionHelper() {
        return this.f19928v3;
    }

    public final void h2(Uri uri) {
        boolean contains;
        if (uri != null) {
            a aVar = this.f19909j4;
            String str = null;
            this.f19909j4 = null;
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
            boolean z10 = contains;
            int i3 = this.f19937z4;
            this.f19937z4 = i3 - 1;
            Utilities.f21387e.c(new q2(this, uri, z10, str2, i3, aVar));
        }
    }

    public final void h3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof b6) {
            b6 b6Var = (b6) C1;
            b6Var.B();
            h1 editText = b6Var.getEditText();
            editText.setSelection(editText.length());
        } else if (C1 instanceof s0) {
            s0 s0Var = (s0) C1;
            s0Var.d.N();
            h1 editText2 = s0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void h4(int i3) {
        a B4 = B4(i3);
        h1 L2 = L2(i3);
        if (A3(B4) && L2 != null) {
            ((TL_iv.pageBlockDetails) B4.f19431b).title = d6.f(L2.getText());
        }
    }

    public final void i2(ye yeVar) {
        TL_iv.PageBlock pageblockvideo;
        t3 t3Var;
        String str = yeVar.h;
        if (str == null) {
            str = yeVar.I;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        g2 g2Var = this.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        boolean c2 = v4.c(yeVar);
        if (!yeVar.f25310b && !c2) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        a aVar = new a(pageblockvideo, 0, 0);
        aVar.f19435g = W3(yeVar, str2);
        x3(aVar);
        if (c2) {
            N4(aVar, aVar.f19435g, yeVar);
            t3Var = this;
        } else {
            t3Var = this;
            t3Var.O4(aVar, aVar.f19435g, str2, yeVar.f25310b, yeVar.F, yeVar.G, yeVar.E);
        }
        g2 g2Var2 = t3Var.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        t3Var.f19916p3.onContentChanged();
    }

    public final void i3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof b6) {
            b6 b6Var = (b6) C1;
            b6Var.B();
            b6Var.getEditText().setSelection(0);
        } else if (C1 instanceof s0) {
            s0 s0Var = (s0) C1;
            s0Var.d.N();
            s0Var.getEditText().setSelection(0);
        }
    }

    public final void i4(int i3) {
        View D4 = D4(i3);
        if (D4 instanceof b6) {
            ((b6) D4).w();
        }
    }

    public final void j2(n5 n5Var) {
        n5 n5Var2 = this.f19919q4;
        if (n5Var2 != null && n5Var2 != n5Var) {
            LinkedHashSet linkedHashSet = n5Var2.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                n5Var2.f19771w.invalidate();
                n5Var2.v();
            }
        }
        this.f19919q4 = n5Var;
        this.K3 = false;
        this.f19925t4 = -1;
        this.f19923s4 = -1;
        n5Var.setCellSelectionListener(this.f19927u4);
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x()) {
            h3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void j4(int i3, int i10) {
        q5 m10;
        View D4 = D4(i3);
        if (D4 instanceof n5) {
            n5 n5Var = (n5) D4;
            if (i10 == 0) {
                n5Var.w();
                return;
            }
            TL_iv.pageTableCell g7 = n5Var.g(i10);
            if (g7 != null && (m10 = n5Var.getGrid().m(g7)) != null) {
                f6.d(g7, m10.f19842a.getText());
            }
        }
    }

    public final k3 k2() {
        int i3;
        int i10;
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x() && !J3()) {
            a B4 = B4(h3Var.f29352p0);
            ArrayList arrayList = this.f19924t3;
            int indexOf = arrayList.indexOf(B4);
            int indexOf2 = arrayList.indexOf(B4(h3Var.f29355s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                if (indexOf > indexOf2) {
                    i10 = indexOf;
                    i3 = indexOf2;
                } else {
                    i3 = indexOf;
                    i10 = indexOf2;
                }
                for (int i11 = i3; i11 <= i10; i11++) {
                    a aVar = (a) arrayList.get(i11);
                    if (aVar.f19436i || A3(aVar)) {
                        return null;
                    }
                }
                return new k3(this, i3, i10, h3Var.f29354r0, h3Var.f29357u0);
            }
            return null;
        }
        return null;
    }

    public final boolean k3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.k3(android.view.KeyEvent):boolean");
    }

    public final int l2(int i3) {
        h1 L2 = L2(i3);
        if (L2 != null) {
            return L2.length();
        }
        b6 x22 = x2(i3);
        if (x22 != null) {
            return x22.getEditText().length();
        }
        a B4 = B4(i3);
        if (B4 == null) {
            return 0;
        }
        return b6.z(B4.f19431b).length();
    }

    public final boolean l3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.l3(android.view.MotionEvent):boolean");
    }

    public final int l4(int i3) {
        Layout layout;
        View D4 = D4(i3);
        if (!(D4 instanceof b6) || (layout = ((b6) D4).getEditText().getLayout()) == null) {
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

    public final boolean m3(mi.n5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.m3(mi.n5, int, int):boolean");
    }

    public final h1 m4(int i3) {
        View D4 = D4(i3);
        if (D4 instanceof b6) {
            return ((b6) D4).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock n2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.n2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean n3() {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.n3():boolean");
    }

    public final boolean o2() {
        h1 editText;
        int length;
        int C;
        int A;
        j4[] j4VarArr;
        h3 h3Var = this.f19928v3;
        if (h3Var == null || !h3Var.x() || h3Var.f29352p0 != h3Var.f29355s0) {
            return false;
        }
        if (O3()) {
            int i3 = h3Var.f29352p0;
            int i10 = h3Var.f29353q0;
            if (i10 != h3Var.f29356t0) {
                return false;
            }
            editText = Q4(i3, i10);
        } else if (B3()) {
            editText = L2(h3Var.f29352p0);
        } else if (z3()) {
            editText = v2(h3Var.f29352p0);
        } else if (J3()) {
            editText = m4(h3Var.f29352p0);
        } else {
            b6 J4 = J4();
            if (J4 == null) {
                return false;
            }
            editText = J4.getEditText();
        }
        if (editText == null || (C = k2.p1.C(h3Var.f29354r0, h3Var.f29357u0, (length = editText.length()), 0)) >= (A = k2.p1.A(h3Var.f29354r0, h3Var.f29357u0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && C < A) {
            for (j4 j4Var : (j4[]) text.getSpans(C, A, j4.class)) {
                if (text.getSpanStart(j4Var) < A && text.getSpanEnd(j4Var) > C) {
                    return false;
                }
            }
        }
        return true;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        boolean z11;
        View F;
        int i13 = i12 - i10;
        int i14 = this.S3;
        if (i14 > 0 && i13 < i14) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.onLayout(z10, i3, i10, i11, i12);
        if (z11) {
            View findFocus = findFocus();
            if (findFocus == null) {
                F = null;
            } else {
                F = F(findFocus);
            }
            if (F != null) {
                int L = (org.telegram.messenger.g0.L(8.0f) + F.getBottom()) - (i13 - getPaddingBottom());
                if (L > 0) {
                    post(new i2(this, L, 2));
                }
            }
        }
        this.S3 = i13;
    }

    public final boolean p2() {
        int[] G4 = G4();
        if (G4 == null) {
            return q2(G2());
        }
        for (int i3 = G4[0]; i3 <= G4[1]; i3++) {
            if (q2((a) this.f19924t3.get(i3))) {
                return true;
            }
        }
        return false;
    }

    public final boolean p3() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f19924t3;
            if (i3 >= arrayList.size()) {
                return false;
            }
            for (s sVar : T3((a) arrayList.get(i3))) {
                if (sVar.a()) {
                    return true;
                }
            }
            i3++;
        }
    }

    public final boolean p4(int i3, int i10, boolean z10) {
        boolean z11;
        if (i3 >= 0 && i10 >= i3) {
            ArrayList arrayList = this.f19924t3;
            if (i10 < arrayList.size()) {
                g2 g2Var = this.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i10 >= i3) {
                        if (t3(i10, true, true)) {
                            z11 = true;
                        }
                        i10--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i3);
                    if (aVar.f19432c >= 1 && (i3 == 0 || ((a) arrayList.get(i3 - 1)).f19432c < aVar.f19432c)) {
                        return false;
                    }
                    z11 = false;
                    while (i3 <= i10) {
                        if (t3(i3, false, true)) {
                            z11 = true;
                        }
                        i3++;
                    }
                }
                if (z11) {
                    v4();
                    if (findFocus() instanceof h1) {
                        b2();
                    } else {
                        this.f35594g3.O(false);
                    }
                    g2 g2Var2 = this.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
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
        if (aVar != null && (indexOf = (arrayList = this.f19924t3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f19432c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f19431b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !F3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !r2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f19432c < aVar2.f19432c) {
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
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof b6) {
                b6 b6Var = (b6) childAt;
                b6Var.f19485f.m();
                b6Var.h.m();
            } else if (childAt instanceof n5) {
                n5 n5Var = (n5) childAt;
                p5 p5Var = n5Var.f19771w;
                n5Var.f19769r.m();
                for (int i10 = 0; i10 < p5Var.getChildCount(); i10++) {
                    View childAt2 = p5Var.getChildAt(i10);
                    if (childAt2 instanceof q5) {
                        ((q5) childAt2).f19842a.m();
                    }
                }
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().m();
            } else if (childAt instanceof s0) {
                ((s0) childAt).getEditText().m();
            }
        }
    }

    public final void q4(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof t4) {
            t4 t4Var = (t4) C1;
            ArrayList arrayList = t4Var.E;
            if (t4Var.f20029a != null) {
                t4Var.p();
                if (t4Var.f19939a0 >= arrayList.size()) {
                    t4Var.f19939a0 = Math.max(0, arrayList.size() - 1);
                }
                t4Var.q(false);
                t4Var.requestLayout();
                t4Var.invalidate();
            }
        }
    }

    public final boolean r2(int i3) {
        if (i3 > 0) {
            ArrayList arrayList = this.f19924t3;
            if (i3 < arrayList.size() && H3(((a) arrayList.get(i3)).f19431b) && ((a) arrayList.get(i3 - 1)).f19432c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r3(boolean z10) {
        h3 h3Var = this.f19928v3;
        if (h3Var != null) {
            if (z10) {
                h3Var.f(false);
            } else {
                org.telegram.messenger.g0.r(h3Var.m0);
                h3Var.u();
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
        for (int i3 = G4[0]; i3 <= G4[1]; i3++) {
            if (t2((a) this.f19924t3.get(i3))) {
                return true;
            }
        }
        return false;
    }

    public final boolean s3(int i3) {
        if (((a) this.f19924t3.get(i3)).f19432c + 1 <= ((org.telegram.messenger.j0) hp.s1(this.f19913n3).f23167x7.X.f13798b).f23620c - 6) {
            return true;
        }
        return false;
    }

    public final void s4(int i3) {
        ArrayList arrayList = this.f19924t3;
        int min = Math.min(arrayList.size() - 1, i3 + 1);
        for (int max = Math.max(0, i3 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f19432c > 0) {
                View C1 = C1(aVar);
                if (C1 instanceof b6) {
                    ((b6) C1).F();
                }
            }
        }
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.f19920r3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.Z3 = z10;
    }

    public void setFileRefParentObject(zi ziVar) {
        this.f19918q3 = ziVar;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.V3 = new ArrayList();
        ArrayList arrayList = this.f19924t3;
        Z2(arrayList, b5.b(charSequence), this.f19926u3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.V3.add((a) arrayList.get(size));
        }
        this.f35594g3.O(false);
    }

    public final boolean t2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.f19924t3).indexOf(aVar)) < 0 || aVar.f19432c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f19432c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean t3(int i3, boolean z10, boolean z11) {
        boolean z12;
        a aVar;
        int i10;
        int i11 = 0;
        if (i3 >= 0) {
            ArrayList arrayList = this.f19924t3;
            if (i3 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i3);
                if (z10) {
                    if (aVar2.f19432c > 0) {
                        w2(i3);
                        return true;
                    }
                } else if (aVar2.f19432c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f19431b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !F3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if ((z12 || r2(i3)) && s3(i3)) {
                        if (i3 > 0) {
                            aVar = (a) arrayList.get(i3 - 1);
                        } else {
                            aVar = null;
                        }
                        if (z12) {
                            aVar2.f19432c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i11 = 1;
                            }
                            aVar2.d = i11;
                            return true;
                        }
                        aVar2.f19432c = aVar.f19432c;
                        if (aVar.d > 0) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        aVar2.d = i10;
                        aVar2.f19433e = false;
                        aVar2.f19434f = false;
                        return true;
                    }
                } else if ((z11 || (i3 != 0 && ((a) arrayList.get(i3 - 1)).f19432c >= aVar2.f19432c)) && s3(i3)) {
                    aVar2.f19432c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void t4(a aVar, s sVar) {
        int i3;
        if (aVar == null) {
            return;
        }
        if (E3(aVar.f19431b)) {
            ArrayList j32 = j3(aVar.f19431b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i3 = arrayList.indexOf(sVar);
            } else {
                i3 = -1;
            }
            if (i3 >= 0) {
                aVar.h.remove(i3);
                if (j32 != null && i3 < j32.size()) {
                    j32.remove(i3);
                }
            }
            if (aVar.h.isEmpty()) {
                u4(aVar);
                return;
            }
            int size = aVar.h.size();
            f41 f41Var = this.f35594g3;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f19431b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) j32.get(0);
                aVar.f19431b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f19435g = (s) aVar.h.get(0);
                aVar.h = null;
                f41Var.O(true);
                q4(aVar);
                return;
            }
            f41Var.O(true);
            q4(aVar);
            return;
        }
        u4(aVar);
    }

    public final boolean u2() {
        g2 g2Var = this.R3;
        if (g2Var != null) {
            if (g2Var.f19625e || !g2Var.f19623b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u3(boolean z10) {
        a aVar;
        int i3;
        int i10;
        int[] G4 = G4();
        if (G4 != null && (i3 = G4[0]) != (i10 = G4[1])) {
            p4(i3, i10, z10);
            return;
        }
        if (G4 == null) {
            aVar = G2();
        } else {
            aVar = (a) this.f19924t3.get(G4[0]);
        }
        if (aVar != null) {
            Z3(aVar, z10);
        }
    }

    public final void u4(a aVar) {
        ArrayList arrayList = this.f19924t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.f35594g3.O(true);
        }
    }

    public final h1 v2(int i3) {
        View D4 = D4(i3);
        if (D4 instanceof l0) {
            return ((l0) D4).getCaptionEditText();
        }
        return null;
    }

    public final void v3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f19438k;
        int size = arrayList3.size();
        int i3 = 0;
        while (i3 < size && i3 < arrayList.size() && ((Long) arrayList3.get(i3)).equals(arrayList.get(i3))) {
            i3++;
        }
        for (int i10 = size - 1; i10 >= i3; i10--) {
            Long l10 = (Long) arrayList3.get(i10);
            long longValue = l10.longValue();
            Integer num = (Integer) hashMap.get(l10);
            if (num != null && (num.intValue() >= 2 || i10 != 0 || this.f19926u3.containsKey(l10))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f19447t = longValue;
                for (int i11 = 0; i11 <= i10; i11++) {
                    aVar2.f19438k.add((Long) arrayList3.get(i11));
                }
                int i12 = e5.f19585b;
                r31 K = r31.K(e5.class);
                K.G = aVar2;
                K.H = this.n4;
                arrayList2.add(K);
                this.f19933x4.add(aVar2);
            }
        }
    }

    public final void v4() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f19924t3;
            if (i3 < arrayList.size()) {
                a aVar = (a) arrayList.get(i3);
                if (aVar.f19432c > 0 && aVar.d > 0 && !H3(aVar.f19431b)) {
                    int i10 = aVar.f19432c;
                    int i11 = 1;
                    for (int i12 = i3 - 1; i12 >= 0; i12--) {
                        a aVar2 = (a) arrayList.get(i12);
                        int i13 = aVar2.f19432c;
                        if (i13 < i10) {
                            break;
                        }
                        if (i13 == i10 && !H3(aVar2.f19431b)) {
                            if (aVar2.d <= 0) {
                                break;
                            }
                            i11++;
                        }
                    }
                    aVar.d = i11;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void w2(int i3) {
        a aVar;
        int i10;
        ArrayList arrayList = this.f19924t3;
        a aVar2 = (a) arrayList.get(i3);
        int i11 = aVar2.f19432c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            aVar2.f19432c = i12;
            if (i12 == 0) {
                aVar2.d = 0;
                aVar2.f19433e = false;
                aVar2.f19434f = false;
            }
            while (true) {
                i3++;
                if (i3 < arrayList.size() && (i10 = (aVar = (a) arrayList.get(i3)).f19432c) > i11) {
                    aVar.f19432c = i10 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void w3() {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.w3():void");
    }

    public final void w4(String str) {
        h3 h3Var = this.f19928v3;
        a2(h3Var.f29352p0, h3Var.f29354r0, h3Var.f29355s0, h3Var.f29357u0, str.split("\n", -1));
    }

    public final b6 x2(int i3) {
        if (i3 < 0) {
            return null;
        }
        View m10 = this.f35593f3.m(i3);
        if (!(m10 instanceof b6)) {
            return null;
        }
        return (b6) m10;
    }

    public final void x3(mi.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: mi.t3.x3(mi.a):void");
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
            sVar.f19861c = true;
            sVar.f19859a = 2;
            sVar.h = V2;
            sVar.f19865i = V2;
            return sVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document V22 = V2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (V22 == null) {
                return null;
            }
            s sVar2 = new s();
            sVar2.d = true;
            sVar2.f19859a = 2;
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
                sVar3.f19860b = true;
                sVar3.f19859a = 2;
                sVar3.h = V23;
                sVar3.f19870n = pageblockvideo.spoiler;
                for (int i3 = 0; i3 < V23.attributes.size(); i3++) {
                    if (V23.attributes.get(i3) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) V23.attributes.get(i3);
                        sVar3.f19866j = tL_documentAttributeVideo.f27008w;
                        sVar3.f19867k = tL_documentAttributeVideo.h;
                        return sVar3;
                    }
                }
                return sVar3;
            } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
                return null;
            } else {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                long j10 = pageblockphoto.photo_id;
                int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i10 == 0) {
                    photo = null;
                } else {
                    int i11 = 0;
                    loop1: while (true) {
                        if (i11 < this.f19924t3.size()) {
                            for (s sVar4 : T3((a) this.f19924t3.get(i11))) {
                                if (sVar4 != null && (photo = sVar4.f19864g) != null && photo.f27025id == j10) {
                                    break loop1;
                                }
                            }
                            i11++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f19922s3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i12);
                                    i12++;
                                    TLRPC.Photo photo3 = photo2;
                                    if (photo3 != null && photo3.f27025id == j10) {
                                        photo = photo3;
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = u4.f19972a;
                            synchronized (u4.class) {
                                if (i10 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) u4.f19972a.get(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                s sVar5 = new s();
                sVar5.f19859a = 2;
                sVar5.f19864g = photo;
                sVar5.f19870n = pageblockphoto.spoiler;
                TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                if (w10 != null) {
                    sVar5.f19866j = w10.f27026w;
                    sVar5.f19867k = w10.h;
                }
                return sVar5;
            }
        }
    }

    public final void y2() {
        J2();
        this.f19922s3 = null;
        this.f19909j4 = null;
        this.f19910k4 = null;
        this.R3 = new g2(this.f19931w4);
        C4();
        this.R3.j();
        r3 r3Var = this.f19916p3;
        if (r3Var != null) {
            r3Var.O1();
        }
    }

    public final void y4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f19922s3 != null && aVar != null && (pageBlock = aVar.f19431b) != null) {
            if (E3(pageBlock)) {
                ArrayList j32 = j3(aVar.f19431b);
                aVar.h = new ArrayList();
                if (j32 != null) {
                    for (int i3 = 0; i3 < j32.size(); i3++) {
                        s x42 = x4((TL_iv.PageBlock) j32.get(i3));
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
            s x43 = x4(aVar.f19431b);
            if (x43 != null) {
                aVar.f19435g = x43;
            }
        }
    }

    public final boolean z3() {
        int i3;
        h3 h3Var = this.f19928v3;
        if (h3Var != null && h3Var.x() && (i3 = h3Var.f29352p0) == h3Var.f29355s0 && i3 >= 0 && i3 < this.f19933x4.size()) {
            return D4(i3) instanceof l0;
        }
        return false;
    }

    public final ArrayList z4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            a aVar = (a) obj;
            if (E3(aVar.f19431b)) {
                ArrayList j32 = j3(aVar.f19431b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (j32 != null) {
                    int size2 = j32.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = j32.get(i10);
                        i10++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        s x42 = x4(pageBlock);
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
                TL_iv.PageBlock pageBlock2 = aVar.f19431b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    s x43 = x4(pageBlock2);
                    if (x43 != null) {
                        aVar.f19435g = x43;
                        arrayList2.add(aVar);
                    }
                }
            }
        }
        return arrayList2;
    }
}
