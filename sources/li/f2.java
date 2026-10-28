package li;

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
public final class f2 {
    public final e3 f17225a;
    public boolean e;
    public boolean f17228f;
    public final ArrayDeque f17226b = new ArrayDeque();
    public final ArrayDeque f17227c = new ArrayDeque();
    public final k2.c f17229g = new k2.c(this, 8);
    public e2 d = b();

    public f2(e3 e3Var) {
        this.f17225a = e3Var;
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

    public final void a(li.e2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: li.f2.a(li.e2):void");
    }

    public final e2 b() {
        c2 c2Var;
        k0 k0Var;
        int i10;
        ArrayList arrayList;
        d2[] d2VarArr;
        e3 e3Var = this.f17225a;
        ArrayList arrayList2 = ((v3) e3Var.f17209b).f17564t3;
        HashMap hashMap = new HashMap();
        e2 e2Var = this.d;
        if (e2Var != null) {
            for (d2 d2Var : e2Var.f17206a) {
                hashMap.put(Long.valueOf(d2Var.f17181a), d2Var);
            }
        }
        d2[] d2VarArr2 = new d2[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            a aVar = (a) arrayList2.get(i11);
            TL_iv.PageBlock pageBlock = aVar.f17053b;
            ArrayList arrayList3 = aVar.f17059k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            d2 d2Var2 = (d2) hashMap.get(Long.valueOf(aVar.f17052a));
            if (d2Var2 != null && d2Var2.f17183c == aVar.f17054c && d2Var2.d == aVar.d && d2Var2.e == aVar.e && d2Var2.f17184f == aVar.f17055f && d2Var2.f17185g == aVar.f17057i && d2Var2.h == aVar.f17056g) {
                ArrayList arrayList4 = d2Var2.f17186i;
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
                if (d2Var2.f17187j.equals(arrayList3) && Arrays.equals(d2Var2.f17182b, byteArray)) {
                    d2VarArr2[i11] = d2Var2;
                }
            }
            long j10 = aVar.f17052a;
            int i13 = aVar.f17054c;
            int i14 = aVar.d;
            boolean z10 = aVar.e;
            boolean z11 = aVar.f17055f;
            boolean z12 = aVar.f17057i;
            t tVar = aVar.f17056g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            d2VarArr2[i11] = new d2(j10, byteArray, i13, i14, z10, z11, z12, tVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((v3) e3Var.f17209b).findFocus();
        if (findFocus instanceof g1) {
            g1 g1Var = (g1) findFocus;
            int selectionStart = g1Var.getSelectionStart();
            int selectionEnd = g1Var.getSelectionEnd();
            p5 a32 = v3.a3(g1Var);
            if (a32 != null && a32.getRow() != null) {
                if (g1Var == a32.getTitleEditText()) {
                    c2Var = new c2(a32.getRow().f17052a, 0, selectionStart, selectionEnd);
                } else {
                    s5 n10 = a32.n(g1Var);
                    if (n10 != null) {
                        i10 = a32.j(n10.f17475b);
                    } else {
                        i10 = -1;
                    }
                    c2Var = new c2(a32.getRow().f17052a, i10, selectionStart, selectionEnd);
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
                    c2Var = new c2(k0Var.getRow().f17052a, -1, selectionStart, selectionEnd);
                } else {
                    while (g1Var != 0 && !(g1Var instanceof d6)) {
                        ViewParent parent2 = g1Var.getParent();
                        if (parent2 instanceof View) {
                            g1Var = (View) parent2;
                        } else {
                            g1Var = 0;
                        }
                    }
                    if (g1Var instanceof d6) {
                        d6 d6Var = (d6) g1Var;
                        if (d6Var.getRow() != null) {
                            c2Var = new c2(d6Var.getRow().f17052a, -1, selectionStart, selectionEnd);
                        }
                    }
                }
            }
            return new e2(d2VarArr2, c2Var);
        }
        c2Var = c2.e;
        return new e2(d2VarArr2, c2Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.f17229g);
        if (this.e && !this.f17228f) {
            e2 b10 = b();
            this.e = false;
            e2 e2Var = this.d;
            if (e2Var != null) {
                d2[] d2VarArr = e2Var.f17206a;
                d2[] d2VarArr2 = b10.f17206a;
                if (d2VarArr.length == d2VarArr2.length) {
                    for (int i10 = 0; i10 < d2VarArr.length; i10++) {
                        if (d2VarArr[i10] == d2VarArr2[i10]) {
                        }
                    }
                    return;
                }
            }
            e2 e2Var2 = this.d;
            ArrayDeque arrayDeque = this.f17226b;
            arrayDeque.addLast(e2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f17227c.clear();
            this.d = b10;
            ((v3) this.f17225a.f17209b).f17556p3.Q();
        }
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.f17229g);
        c();
    }

    public final void f(int i10, int i11) {
        if (!this.f17228f) {
            if (i10 <= 16 && i11 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f17228f) {
            return;
        }
        this.e = true;
        k2.c cVar = this.f17229g;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        AndroidUtilities.runOnUIThread(cVar, 800L);
        ((v3) this.f17225a.f17209b).f17556p3.Q();
    }

    public final void h() {
        if (this.f17228f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f17229g);
        this.e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f17227c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f17226b.addLast(this.d);
        e2 e2Var = (e2) arrayDeque.removeLast();
        this.d = e2Var;
        a(e2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.f17229g);
        this.f17226b.clear();
        this.f17227c.clear();
        this.d = b();
        this.e = false;
        ((v3) this.f17225a.f17209b).f17556p3.Q();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f17226b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f17227c.addLast(this.d);
        e2 e2Var = (e2) arrayDeque.removeLast();
        this.d = e2Var;
        a(e2Var);
    }
}
