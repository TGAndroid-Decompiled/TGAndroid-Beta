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
public final class of9 {
    public final oo8 a;
    public boolean e;
    public boolean f;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final kf9 g = new kf9(this, (byte) 0);
    public nf9 d = b();

    public of9(oo8 oo8Var) {
        this.a = oo8Var;
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

    public final void a(defpackage.nf9 r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of9.a(nf9):void");
    }

    public final nf9 b() {
        lf9 lf9Var;
        td9 td9Var;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        mf9[] mf9VarArr;
        oo8 oo8Var = this.a;
        ArrayList arrayList3 = ((ch9) oo8Var.b).t3;
        HashMap hashMap = new HashMap();
        nf9 nf9Var = this.d;
        if (nf9Var != null) {
            for (mf9 mf9Var : nf9Var.a) {
                hashMap.put(Long.valueOf(mf9Var.a), mf9Var);
            }
        }
        mf9[] mf9VarArr2 = new mf9[arrayList3.size()];
        int i2 = 0;
        while (i2 < arrayList3.size()) {
            ll0 ll0Var = (ll0) arrayList3.get(i2);
            TL_iv.PageBlock pageBlock = ll0Var.b;
            ArrayList arrayList4 = ll0Var.k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            mf9 mf9Var2 = (mf9) hashMap.get(Long.valueOf(ll0Var.a));
            if (mf9Var2 != null && mf9Var2.c == ll0Var.c && mf9Var2.d == ll0Var.d && mf9Var2.e == ll0Var.e && mf9Var2.f == ll0Var.f && mf9Var2.g == ll0Var.i && mf9Var2.h == ll0Var.g) {
                ArrayList arrayList5 = mf9Var2.i;
                ArrayList arrayList6 = ll0Var.h;
                if (arrayList5 != arrayList6) {
                    if (arrayList5 != null && arrayList6 != null && arrayList5.size() == arrayList6.size()) {
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            if (arrayList5.get(i3) != arrayList6.get(i3)) {
                                break;
                            }
                        }
                    }
                }
                if (mf9Var2.j.equals(arrayList4) && Arrays.equals(mf9Var2.b, byteArray)) {
                    mf9VarArr2[i2] = mf9Var2;
                    arrayList = arrayList3;
                    i2++;
                    arrayList3 = arrayList;
                }
            }
            long j = ll0Var.a;
            int i4 = ll0Var.c;
            int i5 = ll0Var.d;
            boolean z = ll0Var.e;
            boolean z2 = ll0Var.f;
            boolean z3 = ll0Var.i;
            arrayList = arrayList3;
            i07 i07Var = ll0Var.g;
            if (ll0Var.h != null) {
                arrayList2 = new ArrayList(ll0Var.h);
            } else {
                arrayList2 = null;
            }
            mf9VarArr2[i2] = new mf9(j, byteArray, i4, i5, z, z2, z3, i07Var, arrayList2, new ArrayList(arrayList4));
            i2++;
            arrayList3 = arrayList;
        }
        View findFocus = ((ch9) oo8Var.b).findFocus();
        if (findFocus instanceof ne9) {
            ne9 ne9Var = (ne9) findFocus;
            int selectionStart = ne9Var.getSelectionStart();
            int selectionEnd = ne9Var.getSelectionEnd();
            kk9 Q2 = ch9.Q2(ne9Var);
            if (Q2 != null && Q2.getRow() != null) {
                if (ne9Var == Q2.getTitleEditText()) {
                    lf9Var = new lf9(0, selectionStart, selectionEnd, Q2.getRow().a);
                } else {
                    nk9 q = Q2.q(ne9Var);
                    if (q != null) {
                        i = Q2.m(q.b);
                    } else {
                        i = -1;
                    }
                    lf9Var = new lf9(i, selectionStart, selectionEnd, Q2.getRow().a);
                }
            } else {
                if (ne9Var instanceof td9) {
                    td9Var = (td9) ne9Var;
                } else {
                    ViewParent parent = ne9Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof td9) {
                                td9Var = (td9) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            td9Var = null;
                            break;
                        }
                    }
                }
                if (td9Var != null && td9Var.getRow() != null) {
                    lf9Var = new lf9(-1, selectionStart, selectionEnd, td9Var.getRow().a);
                } else {
                    while (ne9Var != 0 && !(ne9Var instanceof xk9)) {
                        ViewParent parent2 = ne9Var.getParent();
                        if (parent2 instanceof View) {
                            ne9Var = (View) parent2;
                        } else {
                            ne9Var = 0;
                        }
                    }
                    if (ne9Var instanceof xk9) {
                        xk9 xk9Var = (xk9) ne9Var;
                        if (xk9Var.getRow() != null) {
                            lf9Var = new lf9(-1, selectionStart, selectionEnd, xk9Var.getRow().a);
                        }
                    }
                }
            }
            return new nf9(mf9VarArr2, lf9Var);
        }
        lf9Var = lf9.e;
        return new nf9(mf9VarArr2, lf9Var);
    }

    public final void c() {
        gm.r(this.g);
        if (this.e && !this.f) {
            nf9 b = b();
            this.e = false;
            nf9 nf9Var = this.d;
            if (nf9Var != null) {
                mf9[] mf9VarArr = nf9Var.a;
                mf9[] mf9VarArr2 = b.a;
                if (mf9VarArr.length == mf9VarArr2.length) {
                    for (int i = 0; i < mf9VarArr.length; i++) {
                        if (mf9VarArr[i] == mf9VarArr2[i]) {
                        }
                    }
                    return;
                }
            }
            nf9 nf9Var2 = this.d;
            ArrayDeque arrayDeque = this.b;
            arrayDeque.addLast(nf9Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.c.clear();
            this.d = b;
            ((ch9) this.a.b).p3.E();
        }
    }

    public final void d() {
        gm.r(this.g);
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
        kf9 kf9Var = this.g;
        gm.r(kf9Var);
        gm.d3(kf9Var, 800L);
        ((ch9) this.a.b).p3.E();
    }

    public final void h() {
        if (this.f) {
            return;
        }
        gm.r(this.g);
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
        nf9 nf9Var = (nf9) arrayDeque.removeLast();
        this.d = nf9Var;
        a(nf9Var);
    }

    public final void j() {
        gm.r(this.g);
        this.b.clear();
        this.c.clear();
        this.d = b();
        this.e = false;
        ((ch9) this.a.b).p3.E();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.c.addLast(this.d);
        nf9 nf9Var = (nf9) arrayDeque.removeLast();
        this.d = nf9Var;
        a(nf9Var);
    }
}
