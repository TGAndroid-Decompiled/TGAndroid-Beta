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
public final class h2 {
    public final android.support.v4.media.c f11408a;
    public boolean e;
    public boolean f11411f;
    public final ArrayDeque f11409b = new ArrayDeque();
    public final ArrayDeque f11410c = new ArrayDeque();
    public final i2.g0 f11412g = new i2.g0(this, 6);
    public g2 d = b();

    public h2(android.support.v4.media.c cVar) {
        this.f11408a = cVar;
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

    public final void a(ii.g2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: ii.h2.a(ii.g2):void");
    }

    public final g2 b() {
        e2 e2Var;
        m0 m0Var;
        int i10;
        ArrayList arrayList;
        f2[] f2VarArr;
        android.support.v4.media.c cVar = this.f11408a;
        ArrayList arrayList2 = ((w3) cVar.f1812b).f11722l3;
        HashMap hashMap = new HashMap();
        g2 g2Var = this.d;
        if (g2Var != null) {
            for (f2 f2Var : g2Var.f11388a) {
                hashMap.put(Long.valueOf(f2Var.f11369a), f2Var);
            }
        }
        f2[] f2VarArr2 = new f2[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            a aVar = (a) arrayList2.get(i11);
            TL_iv.PageBlock pageBlock = aVar.f11205b;
            ArrayList arrayList3 = aVar.f11211k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            f2 f2Var2 = (f2) hashMap.get(Long.valueOf(aVar.f11204a));
            if (f2Var2 != null && f2Var2.f11371c == aVar.f11206c && f2Var2.d == aVar.d && f2Var2.e == aVar.e && f2Var2.f11372f == aVar.f11207f && f2Var2.f11373g == aVar.f11209i && f2Var2.h == aVar.f11208g) {
                ArrayList arrayList4 = f2Var2.f11374i;
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
                if (f2Var2.f11375j.equals(arrayList3) && Arrays.equals(f2Var2.f11370b, byteArray)) {
                    f2VarArr2[i11] = f2Var2;
                }
            }
            long j3 = aVar.f11204a;
            int i13 = aVar.f11206c;
            int i14 = aVar.d;
            boolean z10 = aVar.e;
            boolean z11 = aVar.f11207f;
            boolean z12 = aVar.f11209i;
            u uVar = aVar.f11208g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            f2VarArr2[i11] = new f2(j3, byteArray, i13, i14, z10, z11, z12, uVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((w3) cVar.f1812b).findFocus();
        if (findFocus instanceof i1) {
            i1 i1Var = (i1) findFocus;
            int selectionStart = i1Var.getSelectionStart();
            int selectionEnd = i1Var.getSelectionEnd();
            o5 V2 = w3.V2(i1Var);
            if (V2 != null && V2.getRow() != null) {
                if (i1Var == V2.getTitleEditText()) {
                    e2Var = new e2(V2.getRow().f11204a, 0, selectionStart, selectionEnd);
                } else {
                    r5 o9 = V2.o(i1Var);
                    if (o9 != null) {
                        i10 = V2.k(o9.f11608b);
                    } else {
                        i10 = -1;
                    }
                    e2Var = new e2(V2.getRow().f11204a, i10, selectionStart, selectionEnd);
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
                    e2Var = new e2(m0Var.getRow().f11204a, -1, selectionStart, selectionEnd);
                } else {
                    while (i1Var != 0 && !(i1Var instanceof d6)) {
                        ViewParent parent2 = i1Var.getParent();
                        if (parent2 instanceof View) {
                            i1Var = (View) parent2;
                        } else {
                            i1Var = 0;
                        }
                    }
                    if (i1Var instanceof d6) {
                        d6 d6Var = (d6) i1Var;
                        if (d6Var.getRow() != null) {
                            e2Var = new e2(d6Var.getRow().f11204a, -1, selectionStart, selectionEnd);
                        }
                    }
                }
            }
            return new g2(f2VarArr2, e2Var);
        }
        e2Var = e2.e;
        return new g2(f2VarArr2, e2Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.f11412g);
        if (this.e && !this.f11411f) {
            g2 b10 = b();
            this.e = false;
            g2 g2Var = this.d;
            if (g2Var != null) {
                f2[] f2VarArr = g2Var.f11388a;
                f2[] f2VarArr2 = b10.f11388a;
                if (f2VarArr.length == f2VarArr2.length) {
                    for (int i10 = 0; i10 < f2VarArr.length; i10++) {
                        if (f2VarArr[i10] == f2VarArr2[i10]) {
                        }
                    }
                    return;
                }
            }
            g2 g2Var2 = this.d;
            ArrayDeque arrayDeque = this.f11409b;
            arrayDeque.addLast(g2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f11410c.clear();
            this.d = b10;
            ((w3) this.f11408a.f1812b).f11715h3.I();
        }
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.f11412g);
        c();
    }

    public final void f(int i10, int i11) {
        if (!this.f11411f) {
            if (i10 <= 16 && i11 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f11411f) {
            return;
        }
        this.e = true;
        i2.g0 g0Var = this.f11412g;
        AndroidUtilities.cancelRunOnUIThread(g0Var);
        AndroidUtilities.runOnUIThread(g0Var, 800L);
        ((w3) this.f11408a.f1812b).f11715h3.I();
    }

    public final void h() {
        if (this.f11411f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f11412g);
        this.e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f11410c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f11409b.addLast(this.d);
        g2 g2Var = (g2) arrayDeque.removeLast();
        this.d = g2Var;
        a(g2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.f11412g);
        this.f11409b.clear();
        this.f11410c.clear();
        this.d = b();
        this.e = false;
        ((w3) this.f11408a.f1812b).f11715h3.I();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f11409b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f11410c.addLast(this.d);
        g2 g2Var = (g2) arrayDeque.removeLast();
        this.d = g2Var;
        a(g2Var);
    }
}
