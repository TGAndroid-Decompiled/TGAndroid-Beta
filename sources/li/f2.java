package li;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class f2 {
    public final gf.g f18558a;
    public boolean f18561e;
    public boolean f18562f;
    public final ArrayDeque f18559b = new ArrayDeque();
    public final ArrayDeque f18560c = new ArrayDeque();
    public final l2.a0 f18563g = new l2.a0(this, 7);
    public e2 d = b();

    public f2(gf.g gVar) {
        this.f18558a = gVar;
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
            int i7 = 0;
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
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.PageBlock pageBlock2 = arrayList.get(i10);
                    i10++;
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
                int i11 = 0;
                while (i11 < size2) {
                    TL_iv.pageTableRow pagetablerow = arrayList2.get(i11);
                    i11++;
                    TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                    if (pagetablerow2 != null) {
                        if (pagetablerow2.cells == null) {
                            pagetablerow2.cells = new ArrayList<>();
                        }
                        ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow2.cells;
                        int size3 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            TL_iv.pageTableCell pagetablecell = arrayList3.get(i12);
                            i12++;
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
                while (i7 < size4) {
                    TL_keyboard.PageButton pageButton = arrayList4.get(i7);
                    i7++;
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
                while (i7 < size5) {
                    TL_iv.PageBlock pageBlock3 = arrayList5.get(i7);
                    i7++;
                    e(pageBlock3);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                if (pageblockslideshow.items == null) {
                    pageblockslideshow.items = new ArrayList<>();
                }
                ArrayList<TL_iv.PageBlock> arrayList6 = pageblockslideshow.items;
                int size6 = arrayList6.size();
                while (i7 < size6) {
                    TL_iv.PageBlock pageBlock4 = arrayList6.get(i7);
                    i7++;
                    e(pageBlock4);
                }
            }
        }
    }

    public final void a(li.e2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: li.f2.a(li.e2):void");
    }

    public final e2 b() {
        c2 c2Var;
        k0 k0Var;
        int i7;
        ArrayList arrayList;
        d2[] d2VarArr;
        gf.g gVar = this.f18558a;
        ArrayList arrayList2 = ((t3) gVar.f13889b).f18897s3;
        HashMap hashMap = new HashMap();
        e2 e2Var = this.d;
        if (e2Var != null) {
            for (d2 d2Var : e2Var.f18531a) {
                hashMap.put(Long.valueOf(d2Var.f18512a), d2Var);
            }
        }
        d2[] d2VarArr2 = new d2[arrayList2.size()];
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            a aVar = (a) arrayList2.get(i10);
            TL_iv.PageBlock pageBlock = aVar.f18392b;
            ArrayList arrayList3 = aVar.f18399k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            d2 d2Var2 = (d2) hashMap.get(Long.valueOf(aVar.f18391a));
            if (d2Var2 != null && d2Var2.f18514c == aVar.f18393c && d2Var2.d == aVar.d && d2Var2.f18515e == aVar.f18394e && d2Var2.f18516f == aVar.f18395f && d2Var2.f18517g == aVar.f18397i && d2Var2.h == aVar.f18396g) {
                ArrayList arrayList4 = d2Var2.f18518i;
                ArrayList arrayList5 = aVar.h;
                if (arrayList4 != arrayList5) {
                    if (arrayList4 != null && arrayList5 != null && arrayList4.size() == arrayList5.size()) {
                        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                            if (arrayList4.get(i11) != arrayList5.get(i11)) {
                                break;
                            }
                        }
                    }
                }
                if (d2Var2.f18519j.equals(arrayList3) && Arrays.equals(d2Var2.f18513b, byteArray)) {
                    d2VarArr2[i10] = d2Var2;
                }
            }
            long j3 = aVar.f18391a;
            int i12 = aVar.f18393c;
            int i13 = aVar.d;
            boolean z9 = aVar.f18394e;
            boolean z10 = aVar.f18395f;
            boolean z11 = aVar.f18397i;
            s sVar = aVar.f18396g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            d2VarArr2[i10] = new d2(j3, byteArray, i12, i13, z9, z10, z11, sVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((t3) gVar.f13889b).findFocus();
        if (findFocus instanceof g1) {
            g1 g1Var = (g1) findFocus;
            int selectionStart = g1Var.getSelectionStart();
            int selectionEnd = g1Var.getSelectionEnd();
            m5 X2 = t3.X2(g1Var);
            if (X2 != null && X2.getRow() != null) {
                if (g1Var == X2.getTitleEditText()) {
                    c2Var = new c2(0, selectionStart, selectionEnd, X2.getRow().f18391a);
                } else {
                    p5 q10 = X2.q(g1Var);
                    if (q10 != null) {
                        i7 = X2.l(q10.f18779b);
                    } else {
                        i7 = -1;
                    }
                    c2Var = new c2(i7, selectionStart, selectionEnd, X2.getRow().f18391a);
                }
            } else {
                if (g1Var instanceof k0) {
                    k0Var = (k0) g1Var;
                } else {
                    ViewParent parent = g1Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof k0) {
                                k0Var = (k0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            k0Var = null;
                            break;
                        }
                    }
                }
                if (k0Var != null && k0Var.getRow() != null) {
                    c2Var = new c2(-1, selectionStart, selectionEnd, k0Var.getRow().f18391a);
                } else {
                    while (g1Var != 0 && !(g1Var instanceof a6)) {
                        ViewParent parent2 = g1Var.getParent();
                        if (parent2 instanceof View) {
                            g1Var = (View) parent2;
                        } else {
                            g1Var = 0;
                        }
                    }
                    if (g1Var instanceof a6) {
                        a6 a6Var = (a6) g1Var;
                        if (a6Var.getRow() != null) {
                            c2Var = new c2(-1, selectionStart, selectionEnd, a6Var.getRow().f18391a);
                        }
                    }
                }
            }
            return new e2(d2VarArr2, c2Var);
        }
        c2Var = c2.f18500e;
        return new e2(d2VarArr2, c2Var);
    }

    public final void c() {
        org.telegram.messenger.g0.r(this.f18563g);
        if (this.f18561e && !this.f18562f) {
            e2 b10 = b();
            this.f18561e = false;
            e2 e2Var = this.d;
            if (e2Var != null) {
                d2[] d2VarArr = e2Var.f18531a;
                d2[] d2VarArr2 = b10.f18531a;
                if (d2VarArr.length == d2VarArr2.length) {
                    for (int i7 = 0; i7 < d2VarArr.length; i7++) {
                        if (d2VarArr[i7] == d2VarArr2[i7]) {
                        }
                    }
                    return;
                }
            }
            e2 e2Var2 = this.d;
            ArrayDeque arrayDeque = this.f18559b;
            arrayDeque.addLast(e2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f18560c.clear();
            this.d = b10;
            ((t3) this.f18558a.f13889b).f18890o3.N();
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(this.f18563g);
        c();
    }

    public final void f(int i7, int i10) {
        if (!this.f18562f) {
            if (i7 <= 16 && i10 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f18562f) {
            return;
        }
        this.f18561e = true;
        l2.a0 a0Var = this.f18563g;
        org.telegram.messenger.g0.r(a0Var);
        org.telegram.messenger.g0.i3(a0Var, 800L);
        ((t3) this.f18558a.f13889b).f18890o3.N();
    }

    public final void h() {
        if (this.f18562f) {
            return;
        }
        org.telegram.messenger.g0.r(this.f18563g);
        this.f18561e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f18560c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f18559b.addLast(this.d);
        e2 e2Var = (e2) arrayDeque.removeLast();
        this.d = e2Var;
        a(e2Var);
    }

    public final void j() {
        org.telegram.messenger.g0.r(this.f18563g);
        this.f18559b.clear();
        this.f18560c.clear();
        this.d = b();
        this.f18561e = false;
        ((t3) this.f18558a.f13889b).f18890o3.N();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f18559b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f18560c.addLast(this.d);
        e2 e2Var = (e2) arrayDeque.removeLast();
        this.d = e2Var;
        a(e2Var);
    }
}
