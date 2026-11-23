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
public final class g2 {
    public final h9.g1 f22144a;
    public boolean f22147e;
    public boolean f22148f;
    public final ArrayDeque f22145b = new ArrayDeque();
    public final ArrayDeque f22146c = new ArrayDeque();
    public final c2 f22149g = new c2(this, 0);
    public f2 d = b();

    public g2(h9.g1 g1Var) {
        this.f22144a = g1Var;
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

    public final void a(oi.f2 r17) {
        throw new UnsupportedOperationException("Method not decompiled: oi.g2.a(oi.f2):void");
    }

    public final f2 b() {
        d2 d2Var;
        j0 j0Var;
        int i7;
        ArrayList arrayList;
        e2[] e2VarArr;
        h9.g1 g1Var = this.f22144a;
        ArrayList arrayList2 = ((t3) g1Var.f14030b).f22436t3;
        HashMap hashMap = new HashMap();
        f2 f2Var = this.d;
        if (f2Var != null) {
            for (e2 e2Var : f2Var.f22122a) {
                hashMap.put(Long.valueOf(e2Var.f22070a), e2Var);
            }
        }
        e2[] e2VarArr2 = new e2[arrayList2.size()];
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            a aVar = (a) arrayList2.get(i10);
            TL_iv.PageBlock pageBlock = aVar.f21935b;
            ArrayList arrayList3 = aVar.f21942k;
            e(pageBlock);
            SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
            pageBlock.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            e2 e2Var2 = (e2) hashMap.get(Long.valueOf(aVar.f21934a));
            if (e2Var2 != null && e2Var2.f22072c == aVar.f21936c && e2Var2.d == aVar.d && e2Var2.f22073e == aVar.f21937e && e2Var2.f22074f == aVar.f21938f && e2Var2.f22075g == aVar.f21940i && e2Var2.h == aVar.f21939g) {
                ArrayList arrayList4 = e2Var2.f22076i;
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
                if (e2Var2.f22077j.equals(arrayList3) && Arrays.equals(e2Var2.f22071b, byteArray)) {
                    e2VarArr2[i10] = e2Var2;
                }
            }
            long j3 = aVar.f21934a;
            int i12 = aVar.f21936c;
            int i13 = aVar.d;
            boolean z10 = aVar.f21937e;
            boolean z11 = aVar.f21938f;
            boolean z12 = aVar.f21940i;
            r rVar = aVar.f21939g;
            if (aVar.h != null) {
                arrayList = new ArrayList(aVar.h);
            } else {
                arrayList = null;
            }
            e2VarArr2[i10] = new e2(j3, byteArray, i12, i13, z10, z11, z12, rVar, arrayList, new ArrayList(arrayList3));
        }
        View findFocus = ((t3) g1Var.f14030b).findFocus();
        if (findFocus instanceof f1) {
            f1 f1Var = (f1) findFocus;
            int selectionStart = f1Var.getSelectionStart();
            int selectionEnd = f1Var.getSelectionEnd();
            m5 X2 = t3.X2(f1Var);
            if (X2 != null && X2.getRow() != null) {
                if (f1Var == X2.getTitleEditText()) {
                    d2Var = new d2(0, selectionStart, selectionEnd, X2.getRow().f21934a);
                } else {
                    p5 q10 = X2.q(f1Var);
                    if (q10 != null) {
                        i7 = X2.l(q10.f22316b);
                    } else {
                        i7 = -1;
                    }
                    d2Var = new d2(i7, selectionStart, selectionEnd, X2.getRow().f21934a);
                }
            } else {
                if (f1Var instanceof j0) {
                    j0Var = (j0) f1Var;
                } else {
                    ViewParent parent = f1Var.getParent();
                    while (true) {
                        if (parent != null) {
                            if (parent instanceof j0) {
                                j0Var = (j0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        } else {
                            j0Var = null;
                            break;
                        }
                    }
                }
                if (j0Var != null && j0Var.getRow() != null) {
                    d2Var = new d2(-1, selectionStart, selectionEnd, j0Var.getRow().f21934a);
                } else {
                    while (f1Var != 0 && !(f1Var instanceof a6)) {
                        ViewParent parent2 = f1Var.getParent();
                        if (parent2 instanceof View) {
                            f1Var = (View) parent2;
                        } else {
                            f1Var = 0;
                        }
                    }
                    if (f1Var instanceof a6) {
                        a6 a6Var = (a6) f1Var;
                        if (a6Var.getRow() != null) {
                            d2Var = new d2(-1, selectionStart, selectionEnd, a6Var.getRow().f21934a);
                        }
                    }
                }
            }
            return new f2(e2VarArr2, d2Var);
        }
        d2Var = d2.f22052e;
        return new f2(e2VarArr2, d2Var);
    }

    public final void c() {
        org.telegram.messenger.g0.r(this.f22149g);
        if (this.f22147e && !this.f22148f) {
            f2 b10 = b();
            this.f22147e = false;
            f2 f2Var = this.d;
            if (f2Var != null) {
                e2[] e2VarArr = f2Var.f22122a;
                e2[] e2VarArr2 = b10.f22122a;
                if (e2VarArr.length == e2VarArr2.length) {
                    for (int i7 = 0; i7 < e2VarArr.length; i7++) {
                        if (e2VarArr[i7] == e2VarArr2[i7]) {
                        }
                    }
                    return;
                }
            }
            f2 f2Var2 = this.d;
            ArrayDeque arrayDeque = this.f22145b;
            arrayDeque.addLast(f2Var2);
            while (arrayDeque.size() > 150) {
                arrayDeque.removeFirst();
            }
            this.f22146c.clear();
            this.d = b10;
            ((t3) this.f22144a.f14030b).f22428p3.j1();
        }
    }

    public final void d() {
        org.telegram.messenger.g0.r(this.f22149g);
        c();
    }

    public final void f(int i7, int i10) {
        if (!this.f22148f) {
            if (i7 <= 16 && i10 <= 16) {
                return;
            }
            d();
        }
    }

    public final void g() {
        if (this.f22148f) {
            return;
        }
        this.f22147e = true;
        c2 c2Var = this.f22149g;
        org.telegram.messenger.g0.r(c2Var);
        org.telegram.messenger.g0.h3(c2Var, 800L);
        ((t3) this.f22144a.f14030b).f22428p3.j1();
    }

    public final void h() {
        if (this.f22148f) {
            return;
        }
        org.telegram.messenger.g0.r(this.f22149g);
        this.f22147e = true;
        c();
    }

    public final void i() {
        d();
        ArrayDeque arrayDeque = this.f22146c;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f22145b.addLast(this.d);
        f2 f2Var = (f2) arrayDeque.removeLast();
        this.d = f2Var;
        a(f2Var);
    }

    public final void j() {
        org.telegram.messenger.g0.r(this.f22149g);
        this.f22145b.clear();
        this.f22146c.clear();
        this.d = b();
        this.f22147e = false;
        ((t3) this.f22144a.f14030b).f22428p3.j1();
    }

    public final void k() {
        d();
        ArrayDeque arrayDeque = this.f22145b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        this.f22146c.addLast(this.d);
        f2 f2Var = (f2) arrayDeque.removeLast();
        this.d = f2Var;
        a(f2Var);
    }
}
