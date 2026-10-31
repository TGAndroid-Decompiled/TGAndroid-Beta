package bi;

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
public final class o2 {
    public final a4.l f3256a;
    public boolean e;
    public boolean f3259f;
    public final ArrayDeque f3257b = new ArrayDeque();
    public final ArrayDeque f3258c = new ArrayDeque();
    public final a3.d f3260g = new a3.d(this, 23);
    public n2 d = b();

    public o2(a4.l lVar) {
        this.f3256a = lVar;
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

    public final void a(bi.n2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: bi.o2.a(bi.n2):void");
    }

    public final n2 b() {
        l2 l2Var;
        o0 o0Var;
        int i10;
        ArrayList arrayList;
        m2[] m2VarArr;
        a4.l lVar = this.f3256a;
        ArrayList arrayList2 = ((d4) lVar.f279b).f2946s3;
        HashMap hashMap = new HashMap();
        n2 n2Var = this.d;
        if (n2Var != null) {
            for (m2 m2Var : n2Var.f3242a) {
                hashMap.put(Long.valueOf(m2Var.f3196a), m2Var);
            }
        }
        m2[] m2VarArr2 = new m2[arrayList2.size()];
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            a aVar = (a) arrayList2.get(i11);
            TL_iv.PageBlock pageBlock = aVar.f2818b;
            ArrayList arrayList3 = aVar.f2824k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            m2 m2Var2 = (m2) hashMap.get(Long.valueOf(aVar.f2817a));
            if (m2Var2 != null && m2Var2.f3198c == aVar.f2819c && m2Var2.d == aVar.d && m2Var2.e == aVar.e && m2Var2.f3199f == aVar.f2820f && m2Var2.f3200g == aVar.f2822i && m2Var2.h == aVar.f2821g) {
                ArrayList arrayList4 = m2Var2.f3201i;
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
                if (m2Var2.f3202j.equals(arrayList3) && Arrays.equals(m2Var2.f3197b, byteArray)) {
                    m2VarArr2[i11] = m2Var2;
                }
            }
            long j10 = aVar.f2817a;
            int i13 = aVar.f2819c;
            int i14 = aVar.d;
            boolean z10 = aVar.e;
            boolean z11 = aVar.f2820f;
            boolean z12 = aVar.f2822i;
            w wVar = aVar.f2821g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            m2VarArr2[i11] = new m2(j10, byteArray, i13, i14, z10, z11, z12, wVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((d4) lVar.f279b).findFocus();
        if (findFocus instanceof n1) {
            n1 n1Var = (n1) findFocus;
            int selectionStart = n1Var.getSelectionStart();
            int selectionEnd = n1Var.getSelectionEnd();
            z5 X2 = d4.X2(n1Var);
            if (X2 != null && X2.getRow() != null) {
                if (n1Var == X2.getTitleEditText()) {
                    l2Var = new l2(0, selectionStart, selectionEnd, X2.getRow().f2817a);
                } else {
                    c6 q6 = X2.q(n1Var);
                    if (q6 != null) {
                        i10 = X2.l(q6.f2906b);
                    } else {
                        i10 = -1;
                    }
                    l2Var = new l2(i10, selectionStart, selectionEnd, X2.getRow().f2817a);
                }
            } else {
                if (n1Var instanceof o0) {
                    o0Var = (o0) n1Var;
                } else {
                    ViewParent parent = n1Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof o0) {
                                o0Var = (o0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            o0Var = null;
                            break;
                        }
                    }
                }
                if (o0Var != null && o0Var.getRow() != null) {
                    l2Var = new l2(-1, selectionStart, selectionEnd, o0Var.getRow().f2817a);
                } else {
                    while (n1Var != 0 && !(n1Var instanceof q6)) {
                        ViewParent parent2 = n1Var.getParent();
                        if (parent2 instanceof View) {
                            n1Var = (View) parent2;
                        } else {
                            n1Var = 0;
                        }
                    }
                    if (n1Var instanceof q6) {
                        q6 q6Var = (q6) n1Var;
                        if (q6Var.getRow() != null) {
                            l2Var = new l2(-1, selectionStart, selectionEnd, q6Var.getRow().f2817a);
                        }
                    }
                }
            }
            return new n2(m2VarArr2, l2Var);
        }
        l2Var = l2.e;
        return new n2(m2VarArr2, l2Var);
    }

    public final void c() {
        org.telegram.messenger.i0.r(this.f3260g);
        if (this.e && !this.f3259f) {
            n2 b10 = b();
            this.e = false;
            n2 n2Var = this.d;
            if (n2Var != null) {
                m2[] m2VarArr = n2Var.f3242a;
                m2[] m2VarArr2 = b10.f3242a;
                if (m2VarArr.length == m2VarArr2.length) {
                    for (int i10 = 0; i10 < m2VarArr.length; i10++) {
                        if (m2VarArr[i10] == m2VarArr2[i10]) {
                        }
                    }
                    return;
                }
            }
            n2 n2Var2 = this.d;
            ArrayDeque arrayDeque = this.f3257b;
            arrayDeque.addLast(n2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f3258c.clear();
            this.d = b10;
            ((d4) this.f3256a.f279b).f2938o3.Z();
        }
    }

    public final void d() {
        org.telegram.messenger.i0.r(this.f3260g);
        c();
    }

    public final void f(int i10, int i11) {
        if (!this.f3259f) {
            if (i10 <= 16 && i11 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f3259f) {
            return;
        }
        this.e = true;
        a3.d dVar = this.f3260g;
        org.telegram.messenger.i0.r(dVar);
        org.telegram.messenger.i0.h3(dVar, 800L);
        ((d4) this.f3256a.f279b).f2938o3.Z();
    }

    public final void h() {
        if (this.f3259f) {
            return;
        }
        org.telegram.messenger.i0.r(this.f3260g);
        this.e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f3258c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f3257b.addLast(this.d);
        n2 n2Var = (n2) arrayDeque.removeLast();
        this.d = n2Var;
        a(n2Var);
    }

    public final void j() {
        org.telegram.messenger.i0.r(this.f3260g);
        this.f3257b.clear();
        this.f3258c.clear();
        this.d = b();
        this.e = false;
        ((d4) this.f3256a.f279b).f2938o3.Z();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f3257b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f3258c.addLast(this.d);
        n2 n2Var = (n2) arrayDeque.removeLast();
        this.d = n2Var;
        a(n2Var);
    }
}
