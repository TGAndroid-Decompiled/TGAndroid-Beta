package defpackage;

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
public final class ch9 {
    public final l09 a;
    public boolean e;
    public boolean f;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final v59 g = new v59(this, (byte) 8);
    public bh9 d = b();

    public ch9(l09 l09Var) {
        this.a = l09Var;
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
            int i = 0;
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                if (pageblockblockquote.caption == null) {
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                }
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                ArrayList<TL_iv.PageBlock> arrayList = pageblockblockquoteblocks.blocks;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    pageblockblockquoteblocks.blocks = arrayList;
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    TL_iv.PageBlock pageBlock2 = arrayList.get(i2);
                    i2++;
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
                ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    pageblocktable.rows = arrayList2;
                }
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    TL_iv.pageTableRow pagetablerow = arrayList2.get(i3);
                    i3++;
                    TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                    if (pagetablerow2 != null) {
                        ArrayList<TL_iv.pageTableCell> arrayList3 = pagetablerow2.cells;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                            pagetablerow2.cells = arrayList3;
                        }
                        int size3 = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            TL_iv.pageTableCell pagetablecell = arrayList3.get(i4);
                            i4++;
                            TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                            if (pagetablecell2 != null && pagetablecell2.text == null) {
                                pagetablecell2.text = new TL_iv.textEmpty();
                            }
                        }
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                ArrayList<TL_keyboard.PageButton> arrayList4 = pageblockbuttonrow.buttons;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList<>();
                    pageblockbuttonrow.buttons = arrayList4;
                }
                int size4 = arrayList4.size();
                while (i < size4) {
                    TL_keyboard.PageButton pageButton = arrayList4.get(i);
                    i++;
                    TL_keyboard.PageButton pageButton2 = pageButton;
                    if (pageButton2 != null && pageButton2.text == null) {
                        pageButton2.text = new TL_iv.textEmpty();
                    }
                }
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                ArrayList<TL_iv.PageBlock> arrayList5 = pageblockcollage.items;
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList<>();
                    pageblockcollage.items = arrayList5;
                }
                int size5 = arrayList5.size();
                while (i < size5) {
                    TL_iv.PageBlock pageBlock3 = arrayList5.get(i);
                    i++;
                    e(pageBlock3);
                }
            } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                ArrayList<TL_iv.PageBlock> arrayList6 = pageblockslideshow.items;
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList<>();
                    pageblockslideshow.items = arrayList6;
                }
                int size6 = arrayList6.size();
                while (i < size6) {
                    TL_iv.PageBlock pageBlock4 = arrayList6.get(i);
                    i++;
                    e(pageBlock4);
                }
            }
        }
    }

    public final void a(defpackage.bh9 r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch9.a(bh9):void");
    }

    public final bh9 b() {
        zg9 zg9Var;
        jf9 jf9Var;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ah9[] ah9VarArr;
        l09 l09Var = this.a;
        ArrayList arrayList3 = ((pi9) l09Var.b).t3;
        HashMap hashMap = new HashMap();
        bh9 bh9Var = this.d;
        if (bh9Var != null) {
            for (ah9 ah9Var : bh9Var.a) {
                hashMap.put(Long.valueOf(ah9Var.a), ah9Var);
            }
        }
        ah9[] ah9VarArr2 = new ah9[arrayList3.size()];
        int i2 = 0;
        while (i2 < arrayList3.size()) {
            mk0 mk0Var = (mk0) arrayList3.get(i2);
            TL_iv.PageBlock pageBlock = mk0Var.b;
            ArrayList arrayList4 = mk0Var.k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            ah9 ah9Var2 = (ah9) hashMap.get(Long.valueOf(mk0Var.a));
            if (ah9Var2 != null && ah9Var2.c == mk0Var.c && ah9Var2.d == mk0Var.d && ah9Var2.e == mk0Var.e && ah9Var2.f == mk0Var.f && ah9Var2.g == mk0Var.i && ah9Var2.h == mk0Var.g) {
                ArrayList arrayList5 = ah9Var2.i;
                ArrayList arrayList6 = mk0Var.h;
                if (arrayList5 != arrayList6) {
                    if (arrayList5 != null && arrayList6 != null && arrayList5.size() == arrayList6.size()) {
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            if (arrayList5.get(i3) != arrayList6.get(i3)) {
                                break;
                            }
                        }
                    }
                }
                if (ah9Var2.j.equals(arrayList4) && Arrays.equals(ah9Var2.b, byteArray)) {
                    ah9VarArr2[i2] = ah9Var2;
                    arrayList = arrayList3;
                    i2++;
                    arrayList3 = arrayList;
                }
            }
            long j = mk0Var.a;
            int i4 = mk0Var.c;
            int i5 = mk0Var.d;
            boolean z = mk0Var.e;
            boolean z2 = mk0Var.f;
            boolean z3 = mk0Var.i;
            arrayList = arrayList3;
            p07 p07Var = mk0Var.g;
            if (mk0Var.h != null) {
                arrayList2 = new ArrayList(mk0Var.h);
            } else {
                arrayList2 = null;
            }
            ah9VarArr2[i2] = new ah9(j, byteArray, i4, i5, z, z2, z3, p07Var, arrayList2, new ArrayList(arrayList4));
            i2++;
            arrayList3 = arrayList;
        }
        View findFocus = ((pi9) l09Var.b).findFocus();
        if (findFocus instanceof dg9) {
            dg9 dg9Var = (dg9) findFocus;
            int selectionStart = dg9Var.getSelectionStart();
            int selectionEnd = dg9Var.getSelectionEnd();
            xl9 R2 = pi9.R2(dg9Var);
            if (R2 != null && R2.getRow() != null) {
                if (dg9Var == R2.getTitleEditText()) {
                    zg9Var = new zg9(0, selectionStart, selectionEnd, R2.getRow().a);
                } else {
                    am9 q = R2.q(dg9Var);
                    if (q != null) {
                        i = R2.m(q.b);
                    } else {
                        i = -1;
                    }
                    zg9Var = new zg9(i, selectionStart, selectionEnd, R2.getRow().a);
                }
            } else {
                if (dg9Var instanceof jf9) {
                    jf9Var = (jf9) dg9Var;
                } else {
                    ViewParent parent = dg9Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof jf9) {
                                jf9Var = (jf9) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            jf9Var = null;
                            break;
                        }
                    }
                }
                if (jf9Var != null && jf9Var.getRow() != null) {
                    zg9Var = new zg9(-1, selectionStart, selectionEnd, jf9Var.getRow().a);
                } else {
                    while (dg9Var != 0 && !(dg9Var instanceof km9)) {
                        ViewParent parent2 = dg9Var.getParent();
                        if (parent2 instanceof View) {
                            dg9Var = (View) parent2;
                        } else {
                            dg9Var = 0;
                        }
                    }
                    if (dg9Var instanceof km9) {
                        km9 km9Var = (km9) dg9Var;
                        if (km9Var.getRow() != null) {
                            zg9Var = new zg9(-1, selectionStart, selectionEnd, km9Var.getRow().a);
                        }
                    }
                }
            }
            return new bh9(ah9VarArr2, zg9Var);
        }
        zg9Var = zg9.e;
        return new bh9(ah9VarArr2, zg9Var);
    }

    public final void c() {
        hl.r(this.g);
        if (this.e && !this.f) {
            bh9 b = b();
            this.e = false;
            bh9 bh9Var = this.d;
            if (bh9Var != null) {
                ah9[] ah9VarArr = bh9Var.a;
                ah9[] ah9VarArr2 = b.a;
                if (ah9VarArr.length == ah9VarArr2.length) {
                    for (int i = 0; i < ah9VarArr.length; i++) {
                        if (ah9VarArr[i] == ah9VarArr2[i]) {
                        }
                    }
                    return;
                }
            }
            bh9 bh9Var2 = this.d;
            ArrayDeque arrayDeque = this.b;
            arrayDeque.addLast(bh9Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.c.clear();
            this.d = b;
            ((pi9) this.a.b).p3.R();
        }
    }

    public final void d() {
        hl.r(this.g);
        c();
    }

    public final void f(int i, int i2) {
        if (!this.f) {
            if (i <= 16 && i2 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f) {
            return;
        }
        this.e = true;
        v59 v59Var = this.g;
        hl.r(v59Var);
        hl.d3(v59Var, 800L);
        ((pi9) this.a.b).p3.R();
    }

    public final void h() {
        if (this.f) {
            return;
        }
        hl.r(this.g);
        this.e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.b.addLast(this.d);
        bh9 bh9Var = (bh9) arrayDeque.removeLast();
        this.d = bh9Var;
        a(bh9Var);
    }

    public final void j() {
        hl.r(this.g);
        this.b.clear();
        this.c.clear();
        this.d = b();
        this.e = false;
        ((pi9) this.a.b).p3.R();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.c.addLast(this.d);
        bh9 bh9Var = (bh9) arrayDeque.removeLast();
        this.d = bh9Var;
        a(bh9Var);
    }
}
