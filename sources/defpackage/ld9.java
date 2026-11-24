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
public final class ld9 {
    public final v39 a;
    public boolean e;
    public boolean f;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final sr8 g = new sr8(this, (byte) 22);
    public kd9 d = b();

    public ld9(v39 v39Var) {
        this.a = v39Var;
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

    public final void a(defpackage.kd9 r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld9.a(kd9):void");
    }

    public final kd9 b() {
        id9 id9Var;
        tb9 tb9Var;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        jd9[] jd9VarArr;
        v39 v39Var = this.a;
        ArrayList arrayList3 = ((ye9) v39Var.b).t3;
        HashMap hashMap = new HashMap();
        kd9 kd9Var = this.d;
        if (kd9Var != null) {
            for (jd9 jd9Var : kd9Var.a) {
                hashMap.put(Long.valueOf(jd9Var.a), jd9Var);
            }
        }
        jd9[] jd9VarArr2 = new jd9[arrayList3.size()];
        int i2 = 0;
        while (i2 < arrayList3.size()) {
            lk0 lk0Var = (lk0) arrayList3.get(i2);
            TL_iv.PageBlock pageBlock = lk0Var.b;
            ArrayList arrayList4 = lk0Var.k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            jd9 jd9Var2 = (jd9) hashMap.get(Long.valueOf(lk0Var.a));
            if (jd9Var2 != null && jd9Var2.c == lk0Var.c && jd9Var2.d == lk0Var.d && jd9Var2.e == lk0Var.e && jd9Var2.f == lk0Var.f && jd9Var2.g == lk0Var.i && jd9Var2.h == lk0Var.g) {
                ArrayList arrayList5 = jd9Var2.i;
                ArrayList arrayList6 = lk0Var.h;
                if (arrayList5 != arrayList6) {
                    if (arrayList5 != null && arrayList6 != null && arrayList5.size() == arrayList6.size()) {
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            if (arrayList5.get(i3) != arrayList6.get(i3)) {
                                break;
                            }
                        }
                    }
                }
                if (jd9Var2.j.equals(arrayList4) && Arrays.equals(jd9Var2.b, byteArray)) {
                    jd9VarArr2[i2] = jd9Var2;
                    arrayList = arrayList3;
                    i2++;
                    arrayList3 = arrayList;
                }
            }
            long j = lk0Var.a;
            int i4 = lk0Var.c;
            int i5 = lk0Var.d;
            boolean z = lk0Var.e;
            boolean z2 = lk0Var.f;
            boolean z3 = lk0Var.i;
            arrayList = arrayList3;
            iy6 iy6Var = lk0Var.g;
            if (lk0Var.h != null) {
                arrayList2 = new ArrayList(lk0Var.h);
            } else {
                arrayList2 = null;
            }
            jd9VarArr2[i2] = new jd9(j, byteArray, i4, i5, z, z2, z3, iy6Var, arrayList2, new ArrayList(arrayList4));
            i2++;
            arrayList3 = arrayList;
        }
        View findFocus = ((ye9) v39Var.b).findFocus();
        if (findFocus instanceof mc9) {
            mc9 mc9Var = (mc9) findFocus;
            int selectionStart = mc9Var.getSelectionStart();
            int selectionEnd = mc9Var.getSelectionEnd();
            ii9 Q2 = ye9.Q2(mc9Var);
            if (Q2 != null && Q2.getRow() != null) {
                if (mc9Var == Q2.getTitleEditText()) {
                    id9Var = new id9(0, selectionStart, selectionEnd, Q2.getRow().a);
                } else {
                    li9 q = Q2.q(mc9Var);
                    if (q != null) {
                        i = Q2.m(q.b);
                    } else {
                        i = -1;
                    }
                    id9Var = new id9(i, selectionStart, selectionEnd, Q2.getRow().a);
                }
            } else {
                if (mc9Var instanceof tb9) {
                    tb9Var = (tb9) mc9Var;
                } else {
                    ViewParent parent = mc9Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof tb9) {
                                tb9Var = (tb9) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            tb9Var = null;
                            break;
                        }
                    }
                }
                if (tb9Var != null && tb9Var.getRow() != null) {
                    id9Var = new id9(-1, selectionStart, selectionEnd, tb9Var.getRow().a);
                } else {
                    while (mc9Var != 0 && !(mc9Var instanceof wi9)) {
                        ViewParent parent2 = mc9Var.getParent();
                        if (parent2 instanceof View) {
                            mc9Var = (View) parent2;
                        } else {
                            mc9Var = 0;
                        }
                    }
                    if (mc9Var instanceof wi9) {
                        wi9 wi9Var = (wi9) mc9Var;
                        if (wi9Var.getRow() != null) {
                            id9Var = new id9(-1, selectionStart, selectionEnd, wi9Var.getRow().a);
                        }
                    }
                }
            }
            return new kd9(jd9VarArr2, id9Var);
        }
        id9Var = id9.e;
        return new kd9(jd9VarArr2, id9Var);
    }

    public final void c() {
        gl.r(this.g);
        if (this.e && !this.f) {
            kd9 b = b();
            this.e = false;
            kd9 kd9Var = this.d;
            if (kd9Var != null) {
                jd9[] jd9VarArr = kd9Var.a;
                jd9[] jd9VarArr2 = b.a;
                if (jd9VarArr.length == jd9VarArr2.length) {
                    for (int i = 0; i < jd9VarArr.length; i++) {
                        if (jd9VarArr[i] == jd9VarArr2[i]) {
                        }
                    }
                    return;
                }
            }
            kd9 kd9Var2 = this.d;
            ArrayDeque arrayDeque = this.b;
            arrayDeque.addLast(kd9Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.c.clear();
            this.d = b;
            ((ye9) this.a.b).p3.L();
        }
    }

    public final void d() {
        gl.r(this.g);
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
        sr8 sr8Var = this.g;
        gl.r(sr8Var);
        gl.d3(sr8Var, 800L);
        ((ye9) this.a.b).p3.L();
    }

    public final void h() {
        if (this.f) {
            return;
        }
        gl.r(this.g);
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
        kd9 kd9Var = (kd9) arrayDeque.removeLast();
        this.d = kd9Var;
        a(kd9Var);
    }

    public final void j() {
        gl.r(this.g);
        this.b.clear();
        this.c.clear();
        this.d = b();
        this.e = false;
        ((ye9) this.a.b).p3.L();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.c.addLast(this.d);
        kd9 kd9Var = (kd9) arrayDeque.removeLast();
        this.d = kd9Var;
        a(kd9Var);
    }
}
