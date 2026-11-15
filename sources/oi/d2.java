package oi;

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
public final class d2 {
    public final hi.l0 f21632a;
    public boolean f21635e;
    public boolean f21636f;
    public final ArrayDeque f21633b = new ArrayDeque();
    public final ArrayDeque f21634c = new ArrayDeque();
    public final kg.j1 f21637g = new kg.j1(this, 26);
    public c2 d = b();

    public d2(hi.l0 l0Var) {
        this.f21632a = l0Var;
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

    public final void a(oi.c2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: oi.d2.a(oi.c2):void");
    }

    public final c2 b() {
        a2 a2Var;
        i0 i0Var;
        int i7;
        ArrayList arrayList;
        b2[] b2VarArr;
        hi.l0 l0Var = this.f21632a;
        ArrayList arrayList2 = ((q3) l0Var.f14544b).f21939t3;
        HashMap hashMap = new HashMap();
        c2 c2Var = this.d;
        if (c2Var != null) {
            for (b2 b2Var : c2Var.f21604a) {
                hashMap.put(Long.valueOf(b2Var.f21580a), b2Var);
            }
        }
        b2[] b2VarArr2 = new b2[arrayList2.size()];
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            a aVar = (a) arrayList2.get(i10);
            TL_iv.PageBlock pageBlock = aVar.f21544b;
            ArrayList arrayList3 = aVar.f21551k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            b2 b2Var2 = (b2) hashMap.get(Long.valueOf(aVar.f21543a));
            if (b2Var2 != null && b2Var2.f21582c == aVar.f21545c && b2Var2.d == aVar.d && b2Var2.f21583e == aVar.f21546e && b2Var2.f21584f == aVar.f21547f && b2Var2.f21585g == aVar.f21549i && b2Var2.h == aVar.f21548g) {
                ArrayList arrayList4 = b2Var2.f21586i;
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
                if (b2Var2.f21587j.equals(arrayList3) && Arrays.equals(b2Var2.f21581b, byteArray)) {
                    b2VarArr2[i10] = b2Var2;
                }
            }
            long j3 = aVar.f21543a;
            int i12 = aVar.f21545c;
            int i13 = aVar.d;
            boolean z10 = aVar.f21546e;
            boolean z11 = aVar.f21547f;
            boolean z12 = aVar.f21549i;
            r rVar = aVar.f21548g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            b2VarArr2[i10] = new b2(j3, byteArray, i12, i13, z10, z11, z12, rVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((q3) l0Var.f14544b).findFocus();
        if (findFocus instanceof e1) {
            e1 e1Var = (e1) findFocus;
            int selectionStart = e1Var.getSelectionStart();
            int selectionEnd = e1Var.getSelectionEnd();
            k5 X2 = q3.X2(e1Var);
            if (X2 != null && X2.getRow() != null) {
                if (e1Var == X2.getTitleEditText()) {
                    a2Var = new a2(0, selectionStart, selectionEnd, X2.getRow().f21543a);
                } else {
                    n5 q10 = X2.q(e1Var);
                    if (q10 != null) {
                        i7 = X2.l(q10.f21846b);
                    } else {
                        i7 = -1;
                    }
                    a2Var = new a2(i7, selectionStart, selectionEnd, X2.getRow().f21543a);
                }
            } else {
                if (e1Var instanceof i0) {
                    i0Var = (i0) e1Var;
                } else {
                    ViewParent parent = e1Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof i0) {
                                i0Var = (i0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            i0Var = null;
                            break;
                        }
                    }
                }
                if (i0Var != null && i0Var.getRow() != null) {
                    a2Var = new a2(-1, selectionStart, selectionEnd, i0Var.getRow().f21543a);
                } else {
                    while (e1Var != 0 && !(e1Var instanceof y5)) {
                        ViewParent parent2 = e1Var.getParent();
                        if (parent2 instanceof View) {
                            e1Var = (View) parent2;
                        } else {
                            e1Var = 0;
                        }
                    }
                    if (e1Var instanceof y5) {
                        y5 y5Var = (y5) e1Var;
                        if (y5Var.getRow() != null) {
                            a2Var = new a2(-1, selectionStart, selectionEnd, y5Var.getRow().f21543a);
                        }
                    }
                }
            }
            return new c2(b2VarArr2, a2Var);
        }
        a2Var = a2.f21567e;
        return new c2(b2VarArr2, a2Var);
    }

    public final void c() {
        org.telegram.messenger.g0.r(this.f21637g);
        if (this.f21635e && !this.f21636f) {
            c2 b10 = b();
            this.f21635e = false;
            c2 c2Var = this.d;
            if (c2Var != null) {
                b2[] b2VarArr = c2Var.f21604a;
                b2[] b2VarArr2 = b10.f21604a;
                if (b2VarArr.length == b2VarArr2.length) {
                    for (int i7 = 0; i7 < b2VarArr.length; i7++) {
                        if (b2VarArr[i7] == b2VarArr2[i7]) {
                        }
                    }
                    return;
                }
            }
            c2 c2Var2 = this.d;
            ArrayDeque arrayDeque = this.f21633b;
            arrayDeque.addLast(c2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f21634c.clear();
            this.d = b10;
            ((q3) this.f21632a.f14544b).f21931p3.m0();
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(this.f21637g);
        c();
    }

    public final void f(int i7, int i10) {
        if (!this.f21636f) {
            if (i7 <= 16 && i10 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f21636f) {
            return;
        }
        this.f21635e = true;
        kg.j1 j1Var = this.f21637g;
        org.telegram.messenger.g0.r(j1Var);
        org.telegram.messenger.g0.i3(j1Var, 800L);
        ((q3) this.f21632a.f14544b).f21931p3.m0();
    }

    public final void h() {
        if (this.f21636f) {
            return;
        }
        org.telegram.messenger.g0.r(this.f21637g);
        this.f21635e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f21634c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f21633b.addLast(this.d);
        c2 c2Var = (c2) arrayDeque.removeLast();
        this.d = c2Var;
        a(c2Var);
    }

    public final void j() {
        org.telegram.messenger.g0.r(this.f21637g);
        this.f21633b.clear();
        this.f21634c.clear();
        this.d = b();
        this.f21635e = false;
        ((q3) this.f21632a.f14544b).f21931p3.m0();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f21633b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f21634c.addLast(this.d);
        c2 c2Var = (c2) arrayDeque.removeLast();
        this.d = c2Var;
        a(c2Var);
    }
}
