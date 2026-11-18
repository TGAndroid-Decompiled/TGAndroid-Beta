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
public final class e2 {
    public final h9.g1 f22032a;
    public boolean f22035e;
    public boolean f22036f;
    public final ArrayDeque f22033b = new ArrayDeque();
    public final ArrayDeque f22034c = new ArrayDeque();
    public final a2 f22037g = new a2(this, 0);
    public d2 d = b();

    public e2(h9.g1 g1Var) {
        this.f22032a = g1Var;
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

    public final void a(oi.d2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: oi.e2.a(oi.d2):void");
    }

    public final d2 b() {
        b2 b2Var;
        i0 i0Var;
        int i7;
        ArrayList arrayList;
        c2[] c2VarArr;
        h9.g1 g1Var = this.f22032a;
        ArrayList arrayList2 = ((s3) g1Var.f14001b).f22345t3;
        HashMap hashMap = new HashMap();
        d2 d2Var = this.d;
        if (d2Var != null) {
            for (c2 c2Var : d2Var.f21987a) {
                hashMap.put(Long.valueOf(c2Var.f21965a), c2Var);
            }
        }
        c2[] c2VarArr2 = new c2[arrayList2.size()];
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            a aVar = (a) arrayList2.get(i10);
            TL_iv.PageBlock pageBlock = aVar.f21910b;
            ArrayList arrayList3 = aVar.f21917k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            c2 c2Var2 = (c2) hashMap.get(Long.valueOf(aVar.f21909a));
            if (c2Var2 != null && c2Var2.f21967c == aVar.f21911c && c2Var2.d == aVar.d && c2Var2.f21968e == aVar.f21912e && c2Var2.f21969f == aVar.f21913f && c2Var2.f21970g == aVar.f21915i && c2Var2.h == aVar.f21914g) {
                ArrayList arrayList4 = c2Var2.f21971i;
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
                if (c2Var2.f21972j.equals(arrayList3) && Arrays.equals(c2Var2.f21966b, byteArray)) {
                    c2VarArr2[i10] = c2Var2;
                }
            }
            long j3 = aVar.f21909a;
            int i12 = aVar.f21911c;
            int i13 = aVar.d;
            boolean z10 = aVar.f21912e;
            boolean z11 = aVar.f21913f;
            boolean z12 = aVar.f21915i;
            r rVar = aVar.f21914g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            c2VarArr2[i10] = new c2(j3, byteArray, i12, i13, z10, z11, z12, rVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((s3) g1Var.f14001b).findFocus();
        if (findFocus instanceof e1) {
            e1 e1Var = (e1) findFocus;
            int selectionStart = e1Var.getSelectionStart();
            int selectionEnd = e1Var.getSelectionEnd();
            l5 X2 = s3.X2(e1Var);
            if (X2 != null && X2.getRow() != null) {
                if (e1Var == X2.getTitleEditText()) {
                    b2Var = new b2(0, selectionStart, selectionEnd, X2.getRow().f21909a);
                } else {
                    o5 q10 = X2.q(e1Var);
                    if (q10 != null) {
                        i7 = X2.l(q10.f22227b);
                    } else {
                        i7 = -1;
                    }
                    b2Var = new b2(i7, selectionStart, selectionEnd, X2.getRow().f21909a);
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
                    b2Var = new b2(-1, selectionStart, selectionEnd, i0Var.getRow().f21909a);
                } else {
                    while (e1Var != 0 && !(e1Var instanceof z5)) {
                        ViewParent parent2 = e1Var.getParent();
                        if (parent2 instanceof View) {
                            e1Var = (View) parent2;
                        } else {
                            e1Var = 0;
                        }
                    }
                    if (e1Var instanceof z5) {
                        z5 z5Var = (z5) e1Var;
                        if (z5Var.getRow() != null) {
                            b2Var = new b2(-1, selectionStart, selectionEnd, z5Var.getRow().f21909a);
                        }
                    }
                }
            }
            return new d2(c2VarArr2, b2Var);
        }
        b2Var = b2.f21948e;
        return new d2(c2VarArr2, b2Var);
    }

    public final void c() {
        org.telegram.messenger.g0.r(this.f22037g);
        if (this.f22035e && !this.f22036f) {
            d2 b10 = b();
            this.f22035e = false;
            d2 d2Var = this.d;
            if (d2Var != null) {
                c2[] c2VarArr = d2Var.f21987a;
                c2[] c2VarArr2 = b10.f21987a;
                if (c2VarArr.length == c2VarArr2.length) {
                    for (int i7 = 0; i7 < c2VarArr.length; i7++) {
                        if (c2VarArr[i7] == c2VarArr2[i7]) {
                        }
                    }
                    return;
                }
            }
            d2 d2Var2 = this.d;
            ArrayDeque arrayDeque = this.f22033b;
            arrayDeque.addLast(d2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f22034c.clear();
            this.d = b10;
            ((s3) this.f22032a.f14001b).f22337p3.j1();
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(this.f22037g);
        c();
    }

    public final void f(int i7, int i10) {
        if (!this.f22036f) {
            if (i7 <= 16 && i10 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f22036f) {
            return;
        }
        this.f22035e = true;
        a2 a2Var = this.f22037g;
        org.telegram.messenger.g0.r(a2Var);
        org.telegram.messenger.g0.h3(a2Var, 800L);
        ((s3) this.f22032a.f14001b).f22337p3.j1();
    }

    public final void h() {
        if (this.f22036f) {
            return;
        }
        org.telegram.messenger.g0.r(this.f22037g);
        this.f22035e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f22034c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f22033b.addLast(this.d);
        d2 d2Var = (d2) arrayDeque.removeLast();
        this.d = d2Var;
        a(d2Var);
    }

    public final void j() {
        org.telegram.messenger.g0.r(this.f22037g);
        this.f22033b.clear();
        this.f22034c.clear();
        this.d = b();
        this.f22035e = false;
        ((s3) this.f22032a.f14001b).f22337p3.j1();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f22033b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f22034c.addLast(this.d);
        d2 d2Var = (d2) arrayDeque.removeLast();
        this.d = d2Var;
        a(d2Var);
    }
}
