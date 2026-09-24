package ii;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class i2 {
    public final a4.m f11423a;
    public boolean e;
    public boolean f11426f;
    public final ArrayDeque f11424b = new ArrayDeque();
    public final ArrayDeque f11425c = new ArrayDeque();
    public final i2.h0 f11427g = new i2.h0(this, 6);
    public h2 d = b();

    public i2(a4.m mVar) {
        this.f11423a = mVar;
    }

    public static void e(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            if (pageBlock.text == null) {
                pageBlock.text = new TL_iv.textEmpty();
            }
            if (pageBlock.caption == null) {
                TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                pageCaption.text = new TL_iv.textEmpty();
                pageCaption.credit = new TL_iv.textEmpty();
                pageBlock.caption = pageCaption;
            }
            int i10 = 0;
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                if (pageblockblockquote.caption == null) {
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                }
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                if (pageblockblockquoteblocks.blocks == null) {
                    pageblockblockquoteblocks.blocks = new ArrayList<>();
                }
                ArrayList<TL_iv.PageBlock> arrayList = pageblockblockquoteblocks.blocks;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    TL_iv.PageBlock pageBlock2 = arrayList.get(i11);
                    i11++;
                    e(pageBlock2);
                }
                if (pageblockblockquoteblocks.caption == null) {
                    pageblockblockquoteblocks.caption = new TL_iv.textEmpty();
                }
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                if (pageblockpullquote.caption == null) {
                    pageblockpullquote.caption = new TL_iv.textEmpty();
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (pageblockpreformatted.language == null) {
                    pageblockpreformatted.language = "";
                }
            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                if (pageblockmath.source == null) {
                    pageblockmath.source = "";
                }
            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                if (pageblockmap.geo == null) {
                    pageblockmap.geo = new TLRPC.TL_geoPointEmpty();
                }
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                if (pageblocktable.rows == null) {
                    pageblocktable.rows = new ArrayList<>();
                }
                ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    TL_iv.pageTableRow pagetablerow = arrayList2.get(i12);
                    i12++;
                    TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                    if (pagetablerow2 != null) {
                        if (pagetablerow2.cells == null) {
                            pagetablerow2.cells = new ArrayList<>();
                        }
                        ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow2.cells;
                        int size3 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            TL_iv.pageTableCell pagetablecell = arrayList3.get(i13);
                            i13++;
                            TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                            if (pagetablecell2 != null && pagetablecell2.text == null) {
                                pagetablecell2.text = new TL_iv.textEmpty();
                            }
                        }
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                if (pageblockbuttonrow.buttons == null) {
                    pageblockbuttonrow.buttons = new ArrayList<>();
                }
                ArrayList<TL_keyboard.PageButton> arrayList4 = pageblockbuttonrow.buttons;
                int size4 = arrayList4.size();
                while (i10 < size4) {
                    TL_keyboard.PageButton pageButton = arrayList4.get(i10);
                    i10++;
                    TL_keyboard.PageButton pageButton2 = pageButton;
                    if (pageButton2 != null && pageButton2.text == null) {
                        pageButton2.text = new TL_iv.textEmpty();
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                if (pageblockcollage.items == null) {
                    pageblockcollage.items = new ArrayList<>();
                }
                ArrayList<TL_iv.PageBlock> arrayList5 = pageblockcollage.items;
                int size5 = arrayList5.size();
                while (i10 < size5) {
                    TL_iv.PageBlock pageBlock3 = arrayList5.get(i10);
                    i10++;
                    e(pageBlock3);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                if (pageblockslideshow.items == null) {
                    pageblockslideshow.items = new ArrayList<>();
                }
                ArrayList<TL_iv.PageBlock> arrayList6 = pageblockslideshow.items;
                int size6 = arrayList6.size();
                while (i10 < size6) {
                    TL_iv.PageBlock pageBlock4 = arrayList6.get(i10);
                    i10++;
                    e(pageBlock4);
                }
            }
        }
    }

    public final void a(ii.h2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: ii.i2.a(ii.h2):void");
    }

    public final h2 b() {
        f2 f2Var;
        m0 m0Var;
        int i10;
        ArrayList arrayList;
        g2[] g2VarArr;
        a4.m mVar = this.f11423a;
        ArrayList arrayList2 = ((x3) mVar.f275b).f11735l3;
        HashMap hashMap = new HashMap();
        h2 h2Var = this.d;
        if (h2Var != null) {
            for (g2 g2Var : h2Var.f11397a) {
                hashMap.put(Long.valueOf(g2Var.f11374a), g2Var);
            }
        }
        g2[] g2VarArr2 = new g2[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            a aVar = (a) arrayList2.get(i11);
            TL_iv.PageBlock pageBlock = aVar.f11191b;
            ArrayList arrayList3 = aVar.f11197k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            g2 g2Var2 = (g2) hashMap.get(Long.valueOf(aVar.f11190a));
            if (g2Var2 != null && g2Var2.f11376c == aVar.f11192c && g2Var2.d == aVar.d && g2Var2.e == aVar.e && g2Var2.f11377f == aVar.f11193f && g2Var2.f11378g == aVar.f11195i && g2Var2.h == aVar.f11194g) {
                ArrayList arrayList4 = g2Var2.f11379i;
                ArrayList arrayList5 = aVar.h;
                if (arrayList4 != arrayList5) {
                    if (arrayList4 != null && arrayList5 != null && arrayList4.size() == arrayList5.size()) {
                        for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                            if (arrayList4.get(i12) != arrayList5.get(i12)) {
                                break;
                            }
                        }
                    }
                }
                if (g2Var2.f11380j.equals(arrayList3) && Arrays.equals(g2Var2.f11375b, byteArray)) {
                    g2VarArr2[i11] = g2Var2;
                }
            }
            long j3 = aVar.f11190a;
            int i13 = aVar.f11192c;
            int i14 = aVar.d;
            boolean z10 = aVar.e;
            boolean z11 = aVar.f11193f;
            boolean z12 = aVar.f11195i;
            u uVar = aVar.f11194g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            g2VarArr2[i11] = new g2(j3, byteArray, i13, i14, z10, z11, z12, uVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((x3) mVar.f275b).findFocus();
        if (findFocus instanceof i1) {
            i1 i1Var = (i1) findFocus;
            int selectionStart = i1Var.getSelectionStart();
            int selectionEnd = i1Var.getSelectionEnd();
            p5 U2 = x3.U2(i1Var);
            if (U2 != null && U2.getRow() != null) {
                if (i1Var == U2.getTitleEditText()) {
                    f2Var = new f2(U2.getRow().f11190a, 0, selectionStart, selectionEnd);
                } else {
                    s5 o9 = U2.o(i1Var);
                    if (o9 != null) {
                        i10 = U2.k(o9.f11617b);
                    } else {
                        i10 = -1;
                    }
                    f2Var = new f2(U2.getRow().f11190a, i10, selectionStart, selectionEnd);
                }
            } else {
                if (i1Var instanceof m0) {
                    m0Var = (m0) i1Var;
                } else {
                    ViewParent parent = i1Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof m0) {
                                m0Var = (m0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            m0Var = null;
                            break;
                        }
                    }
                }
                if (m0Var != null && m0Var.getRow() != null) {
                    f2Var = new f2(m0Var.getRow().f11190a, -1, selectionStart, selectionEnd);
                } else {
                    while (i1Var != 0 && !(i1Var instanceof e6)) {
                        ViewParent parent2 = i1Var.getParent();
                        if (parent2 instanceof View) {
                            i1Var = (View) parent2;
                        } else {
                            i1Var = 0;
                        }
                    }
                    if (i1Var instanceof e6) {
                        e6 e6Var = (e6) i1Var;
                        if (e6Var.getRow() != null) {
                            f2Var = new f2(e6Var.getRow().f11190a, -1, selectionStart, selectionEnd);
                        }
                    }
                }
            }
            return new h2(g2VarArr2, f2Var);
        }
        f2Var = f2.e;
        return new h2(g2VarArr2, f2Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.f11427g);
        if (this.e && !this.f11426f) {
            h2 b10 = b();
            this.e = false;
            h2 h2Var = this.d;
            if (h2Var != null) {
                g2[] g2VarArr = h2Var.f11397a;
                g2[] g2VarArr2 = b10.f11397a;
                if (g2VarArr.length == g2VarArr2.length) {
                    for (int i10 = 0; i10 < g2VarArr.length; i10++) {
                        if (g2VarArr[i10] == g2VarArr2[i10]) {
                        }
                    }
                    return;
                }
            }
            h2 h2Var2 = this.d;
            ArrayDeque arrayDeque = this.f11424b;
            arrayDeque.addLast(h2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f11425c.clear();
            this.d = b10;
            ((x3) this.f11423a.f275b).f11728h3.G();
        }
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.f11427g);
        c();
    }

    public final void f(int i10, int i11) {
        if (!this.f11426f) {
            if (i10 <= 16 && i11 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f11426f) {
            return;
        }
        this.e = true;
        i2.h0 h0Var = this.f11427g;
        AndroidUtilities.cancelRunOnUIThread(h0Var);
        AndroidUtilities.runOnUIThread(h0Var, 800L);
        ((x3) this.f11423a.f275b).f11728h3.G();
    }

    public final void h() {
        if (this.f11426f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f11427g);
        this.e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f11425c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f11424b.addLast(this.d);
        h2 h2Var = (h2) arrayDeque.removeLast();
        this.d = h2Var;
        a(h2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.f11427g);
        this.f11424b.clear();
        this.f11425c.clear();
        this.d = b();
        this.e = false;
        ((x3) this.f11423a.f275b).f11728h3.G();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f11424b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f11425c.addLast(this.d);
        h2 h2Var = (h2) arrayDeque.removeLast();
        this.d = h2Var;
        a(h2Var);
    }
}
