package ki;

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
    public final k0.b f15306a;
    public boolean e;
    public boolean f15309f;
    public final ArrayDeque f15307b = new ArrayDeque();
    public final ArrayDeque f15308c = new ArrayDeque();
    public final u f15310g = new u(this, 4);
    public g2 d = b();

    public h2(k0.b bVar) {
        this.f15306a = bVar;
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

    public final void a(ki.g2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: ki.h2.a(ki.g2):void");
    }

    public final g2 b() {
        e2 e2Var;
        l0 l0Var;
        int i10;
        ArrayList arrayList;
        f2[] f2VarArr;
        k0.b bVar = this.f15306a;
        ArrayList arrayList2 = ((w3) bVar.f14564b).f15599j3;
        HashMap hashMap = new HashMap();
        g2 g2Var = this.d;
        if (g2Var != null) {
            for (f2 f2Var : g2Var.f15276a) {
                hashMap.put(Long.valueOf(f2Var.f15252a), f2Var);
            }
        }
        f2[] f2VarArr2 = new f2[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            a aVar = (a) arrayList2.get(i11);
            TL_iv.PageBlock pageBlock = aVar.f15094b;
            ArrayList arrayList3 = aVar.f15100k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            f2 f2Var2 = (f2) hashMap.get(Long.valueOf(aVar.f15093a));
            if (f2Var2 != null && f2Var2.f15254c == aVar.f15095c && f2Var2.d == aVar.d && f2Var2.e == aVar.e && f2Var2.f15255f == aVar.f15096f && f2Var2.f15256g == aVar.f15098i && f2Var2.h == aVar.f15097g) {
                ArrayList arrayList4 = f2Var2.f15257i;
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
                if (f2Var2.f15258j.equals(arrayList3) && Arrays.equals(f2Var2.f15253b, byteArray)) {
                    f2VarArr2[i11] = f2Var2;
                }
            }
            long j10 = aVar.f15093a;
            int i13 = aVar.f15095c;
            int i14 = aVar.d;
            boolean z10 = aVar.e;
            boolean z11 = aVar.f15096f;
            boolean z12 = aVar.f15098i;
            t tVar = aVar.f15097g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            f2VarArr2[i11] = new f2(j10, byteArray, i13, i14, z10, z11, z12, tVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((w3) bVar.f14564b).findFocus();
        if (findFocus instanceof h1) {
            h1 h1Var = (h1) findFocus;
            int selectionStart = h1Var.getSelectionStart();
            int selectionEnd = h1Var.getSelectionEnd();
            o5 V2 = w3.V2(h1Var);
            if (V2 != null && V2.getRow() != null) {
                if (h1Var == V2.getTitleEditText()) {
                    e2Var = new e2(V2.getRow().f15093a, 0, selectionStart, selectionEnd);
                } else {
                    r5 o10 = V2.o(h1Var);
                    if (o10 != null) {
                        i10 = V2.k(o10.f15491b);
                    } else {
                        i10 = -1;
                    }
                    e2Var = new e2(V2.getRow().f15093a, i10, selectionStart, selectionEnd);
                }
            } else {
                if (h1Var instanceof l0) {
                    l0Var = (l0) h1Var;
                } else {
                    ViewParent parent = h1Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof l0) {
                                l0Var = (l0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            l0Var = null;
                            break;
                        }
                    }
                }
                if (l0Var != null && l0Var.getRow() != null) {
                    e2Var = new e2(l0Var.getRow().f15093a, -1, selectionStart, selectionEnd);
                } else {
                    while (h1Var != 0 && !(h1Var instanceof c6)) {
                        ViewParent parent2 = h1Var.getParent();
                        if (parent2 instanceof View) {
                            h1Var = (View) parent2;
                        } else {
                            h1Var = 0;
                        }
                    }
                    if (h1Var instanceof c6) {
                        c6 c6Var = (c6) h1Var;
                        if (c6Var.getRow() != null) {
                            e2Var = new e2(c6Var.getRow().f15093a, -1, selectionStart, selectionEnd);
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
        AndroidUtilities.cancelRunOnUIThread(this.f15310g);
        if (this.e && !this.f15309f) {
            g2 b10 = b();
            this.e = false;
            g2 g2Var = this.d;
            if (g2Var != null) {
                f2[] f2VarArr = g2Var.f15276a;
                f2[] f2VarArr2 = b10.f15276a;
                if (f2VarArr.length == f2VarArr2.length) {
                    for (int i10 = 0; i10 < f2VarArr.length; i10++) {
                        if (f2VarArr[i10] == f2VarArr2[i10]) {
                        }
                    }
                    return;
                }
            }
            g2 g2Var2 = this.d;
            ArrayDeque arrayDeque = this.f15307b;
            arrayDeque.addLast(g2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f15308c.clear();
            this.d = b10;
            ((w3) this.f15306a.f14564b).f15591f3.E();
        }
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.f15310g);
        c();
    }

    public final void f(int i10, int i11) {
        if (!this.f15309f) {
            if (i10 <= 16 && i11 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f15309f) {
            return;
        }
        this.e = true;
        u uVar = this.f15310g;
        AndroidUtilities.cancelRunOnUIThread(uVar);
        AndroidUtilities.runOnUIThread(uVar, 800L);
        ((w3) this.f15306a.f14564b).f15591f3.E();
    }

    public final void h() {
        if (this.f15309f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f15310g);
        this.e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f15308c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f15307b.addLast(this.d);
        g2 g2Var = (g2) arrayDeque.removeLast();
        this.d = g2Var;
        a(g2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.f15310g);
        this.f15307b.clear();
        this.f15308c.clear();
        this.d = b();
        this.e = false;
        ((w3) this.f15306a.f14564b).f15591f3.E();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f15307b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f15308c.addLast(this.d);
        g2 g2Var = (g2) arrayDeque.removeLast();
        this.d = g2Var;
        a(g2Var);
    }
}
