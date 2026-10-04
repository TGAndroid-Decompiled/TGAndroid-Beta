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
    public final a6.m f12434a;
    public boolean f12437e;
    public boolean f12438f;
    public final ArrayDeque f12435b = new ArrayDeque();
    public final ArrayDeque f12436c = new ArrayDeque();
    public final i2.h0 f12439g = new i2.h0(this, 6);
    public h2 d = b();

    public i2(a6.m mVar) {
        this.f12434a = mVar;
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
        a6.m mVar = this.f12434a;
        ArrayList arrayList2 = ((x3) mVar.f330b).f12777s3;
        HashMap hashMap = new HashMap();
        h2 h2Var = this.d;
        if (h2Var != null) {
            for (g2 g2Var : h2Var.f12409a) {
                hashMap.put(Long.valueOf(g2Var.f12382a), g2Var);
            }
        }
        g2[] g2VarArr2 = new g2[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            a aVar = (a) arrayList2.get(i11);
            TL_iv.PageBlock pageBlock = aVar.f12186b;
            ArrayList arrayList3 = aVar.f12193k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            g2 g2Var2 = (g2) hashMap.get(Long.valueOf(aVar.f12185a));
            if (g2Var2 != null && g2Var2.f12384c == aVar.f12187c && g2Var2.d == aVar.d && g2Var2.f12385e == aVar.f12188e && g2Var2.f12386f == aVar.f12189f && g2Var2.f12387g == aVar.f12191i && g2Var2.h == aVar.f12190g) {
                ArrayList arrayList4 = g2Var2.f12388i;
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
                if (g2Var2.f12389j.equals(arrayList3) && Arrays.equals(g2Var2.f12383b, byteArray)) {
                    g2VarArr2[i11] = g2Var2;
                }
            }
            long j3 = aVar.f12185a;
            int i13 = aVar.f12187c;
            int i14 = aVar.d;
            boolean z10 = aVar.f12188e;
            boolean z11 = aVar.f12189f;
            boolean z12 = aVar.f12191i;
            u uVar = aVar.f12190g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            g2VarArr2[i11] = new g2(j3, byteArray, i13, i14, z10, z11, z12, uVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((x3) mVar.f330b).findFocus();
        if (findFocus instanceof i1) {
            i1 i1Var = (i1) findFocus;
            int selectionStart = i1Var.getSelectionStart();
            int selectionEnd = i1Var.getSelectionEnd();
            q5 W2 = x3.W2(i1Var);
            if (W2 != null && W2.getRow() != null) {
                if (i1Var == W2.getTitleEditText()) {
                    f2Var = new f2(W2.getRow().f12185a, 0, selectionStart, selectionEnd);
                } else {
                    t5 o9 = W2.o(i1Var);
                    if (o9 != null) {
                        i10 = W2.k(o9.f12661b);
                    } else {
                        i10 = -1;
                    }
                    f2Var = new f2(W2.getRow().f12185a, i10, selectionStart, selectionEnd);
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
                    f2Var = new f2(m0Var.getRow().f12185a, -1, selectionStart, selectionEnd);
                } else {
                    while (i1Var != 0 && !(i1Var instanceof f6)) {
                        ViewParent parent2 = i1Var.getParent();
                        if (parent2 instanceof View) {
                            i1Var = (View) parent2;
                        } else {
                            i1Var = 0;
                        }
                    }
                    if (i1Var instanceof f6) {
                        f6 f6Var = (f6) i1Var;
                        if (f6Var.getRow() != null) {
                            f2Var = new f2(f6Var.getRow().f12185a, -1, selectionStart, selectionEnd);
                        }
                    }
                }
            }
            return new h2(g2VarArr2, f2Var);
        }
        f2Var = f2.f12357e;
        return new h2(g2VarArr2, f2Var);
    }

    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.f12439g);
        if (this.f12437e && !this.f12438f) {
            h2 b10 = b();
            this.f12437e = false;
            h2 h2Var = this.d;
            if (h2Var != null) {
                g2[] g2VarArr = h2Var.f12409a;
                g2[] g2VarArr2 = b10.f12409a;
                if (g2VarArr.length == g2VarArr2.length) {
                    for (int i10 = 0; i10 < g2VarArr.length; i10++) {
                        if (g2VarArr[i10] == g2VarArr2[i10]) {
                        }
                    }
                    return;
                }
            }
            h2 h2Var2 = this.d;
            ArrayDeque arrayDeque = this.f12435b;
            arrayDeque.addLast(h2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f12436c.clear();
            this.d = b10;
            ((x3) this.f12434a.f330b).f12769o3.i0();
        }
    }

    public final void d() {
        AndroidUtilities.cancelRunOnUIThread(this.f12439g);
        c();
    }

    public final void f(int i10, int i11) {
        if (!this.f12438f) {
            if (i10 <= 16 && i11 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f12438f) {
            return;
        }
        this.f12437e = true;
        i2.h0 h0Var = this.f12439g;
        AndroidUtilities.cancelRunOnUIThread(h0Var);
        AndroidUtilities.runOnUIThread(h0Var, 800L);
        ((x3) this.f12434a.f330b).f12769o3.i0();
    }

    public final void h() {
        if (this.f12438f) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f12439g);
        this.f12437e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f12436c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f12435b.addLast(this.d);
        h2 h2Var = (h2) arrayDeque.removeLast();
        this.d = h2Var;
        a(h2Var);
    }

    public final void j() {
        AndroidUtilities.cancelRunOnUIThread(this.f12439g);
        this.f12435b.clear();
        this.f12436c.clear();
        this.d = b();
        this.f12437e = false;
        ((x3) this.f12434a.f330b).f12769o3.i0();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f12435b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f12436c.addLast(this.d);
        h2 h2Var = (h2) arrayDeque.removeLast();
        this.d = h2Var;
        a(h2Var);
    }
}
